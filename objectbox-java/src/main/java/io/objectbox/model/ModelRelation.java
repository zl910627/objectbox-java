// automatically generated by the FlatBuffers compiler, do not modify

package io.objectbox.model;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class ModelRelation extends Table {
  public static ModelRelation getRootAsModelRelation(ByteBuffer _bb) { return getRootAsModelRelation(_bb, new ModelRelation()); }
  public static ModelRelation getRootAsModelRelation(ByteBuffer _bb, ModelRelation obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public ModelRelation __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public IdUid id() { return id(new IdUid()); }
  public IdUid id(IdUid obj) { int o = __offset(4); return o != 0 ? obj.__assign(o + bb_pos, bb) : null; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public long targetEntityUid() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }

  public static void startModelRelation(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addStruct(0, idOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addTargetEntityUid(FlatBufferBuilder builder, long targetEntityUid) { builder.addLong(2, targetEntityUid, 0L); }
  public static int endModelRelation(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

