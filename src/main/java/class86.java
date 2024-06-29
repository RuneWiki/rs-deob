import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class86 extends class101 {

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    private int field1271 = 0;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    public int field1276 = 0;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public int field1268 = 0;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public int field1260 = 0;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    private int field1284 = 0;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    private int field1274 = 0;

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public int field1281;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "F")
    private float field1253;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Z")
    public boolean field1270;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Z")
    private boolean field1265;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public int field1261;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Ltd;")
    private class192 field1277;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Lre;")
    private static class263 field1257;

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "Lre;")
    private static class263 field1272;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Lmc;")
    private class52 field1267;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1254;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1256;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1282;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "[F")
    private float[] field1255;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[F")
    private float[] field1258;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[F")
    private float[] field1269;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "[F")
    private float[] field1283;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "[I")
    private int[] field1259;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "[I")
    private int[] field1264;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[I")
    private int[] field1266;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "[I")
    private int[] field1273;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "[I")
    private int[] field1278;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "[I")
    private int[] field1280;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[Z")
    private boolean[] field1263;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[[I")
    private int[][] field1262;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "[[I")
    private int[][] field1279;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 10)
    public static final void method596() {
        field1257 = null;
        field1272 = null;
        field1282 = null;
        field1256 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III[I[IZ)I", line = 21)
    public final int method597(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1270) {
            this.field1262[this.field1274] = arg4;
            this.field1263[this.field1274] = arg5;
            if (arg4 != null) {
                this.field1284 += arg4.length;
            }
            if (arg5) {
                this.field1284 += (arg3.length - 2) * 3;
            } else {
                this.field1271 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1271 += (arg3.length - 2) * 3;
        }
        this.field1280[this.field1274] = arg0;
        this.field1259[this.field1274] = arg1;
        this.field1264[this.field1274] = arg2;
        this.field1279[this.field1274] = arg3;
        return this.field1274++;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()V", line = 49)
    public final void method598() {
        class263 var1 = new class263((this.field1265 ? 40 : 36) * this.field1268);
        for (int var2 = 0; var2 < this.field1268; var2++) {
            if (class117.field1811) {
                var1.method1811((float) this.field1278[var2], false);
                var1.method1811((float) this.field1275[var2], false);
                var1.method1811((float) this.field1273[var2], false);
                var1.method1815(102, this.field1266[var2]);
                var1.method1811(this.field1258[var2], false);
                var1.method1811(this.field1283[var2], false);
                var1.method1811(this.field1255[var2], false);
                var1.method1811((float) this.field1278[var2] / this.field1253, false);
                var1.method1811((float) this.field1273[var2] / this.field1253, false);
                if (this.field1265) {
                    var1.method1811(this.field1269[var2], false);
                }
            } else {
                var1.method1821((float) this.field1278[var2], -119);
                var1.method1821((float) this.field1275[var2], -114);
                var1.method1821((float) this.field1273[var2], -118);
                var1.method1815(119, this.field1266[var2]);
                var1.method1821(this.field1258[var2], -128);
                var1.method1821(this.field1283[var2], -114);
                var1.method1821(this.field1255[var2], -113);
                var1.method1821((float) this.field1278[var2] / this.field1253, -96);
                var1.method1821((float) this.field1273[var2] / this.field1253, -97);
                if (this.field1265) {
                    var1.method1821(this.field1269[var2], -97);
                }
            }
        }
        if (class117.field1802) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3986, 0, var1.field4025);
            this.field1267 = new class52();
            this.field1267.method348(var3);
        } else {
            this.field1254 = ByteBuffer.allocateDirect(var1.field4025).order(ByteOrder.nativeOrder());
            this.field1254.put(var1.field3986, 0, var1.field4025);
            this.field1254.flip();
        }
        this.field1278 = null;
        this.field1275 = null;
        this.field1273 = null;
        this.field1266 = null;
        this.field1258 = null;
        this.field1283 = null;
        this.field1255 = null;
        this.field1277 = null;
        this.field1269 = null;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 116)
    public static void method599() {
        field1257 = null;
        field1272 = null;
        field1282 = null;
        field1256 = null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()V", line = 128)
    public final void method600() {
        this.field1278 = new int[this.field1260];
        this.field1275 = new int[this.field1260];
        this.field1273 = new int[this.field1260];
        if (this.field1265) {
            this.field1269 = new float[this.field1260];
        }
        this.field1266 = new int[this.field1260];
        this.field1258 = new float[this.field1260];
        this.field1283 = new float[this.field1260];
        this.field1255 = new float[this.field1260];
        this.field1259 = new int[this.field1276];
        this.field1264 = new int[this.field1276];
        this.field1280 = new int[this.field1276];
        this.field1279 = new int[this.field1276][];
        this.field1277 = new class192(class104.method731(this.field1260, -108));
        if (this.field1270) {
            this.field1262 = new int[this.field1276][];
            this.field1263 = new boolean[this.field1276];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([[[Lum;FZ)V", line = 156)
    public final void method601(class221[][][] arg0, float arg1, boolean arg2) {
        if (field1257 == null || field1257.field3986.length < this.field1271 * 4) {
            field1257 = new class263(this.field1271 * 4);
        } else {
            field1257.field4025 = 0;
        }
        if (field1272 == null || field1272.field3986.length < this.field1284 * 4) {
            field1272 = new class263(this.field1284 * 4);
        } else {
            field1272.field4025 = 0;
        }
        if (class117.field1811) {
            for (int var4 = 0; var4 < this.field1274; var4++) {
                class221 var5 = arg0[this.field1280[var4]][this.field1259[var4]][this.field1264[var4]];
                if (var5 != null && var5.field3365) {
                    int[] var6 = this.field1279[var4];
                    class263 var9;
                    if (this.field1270) {
                        int[] var7 = this.field1262[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1272.method1815(81, var7[var8]);
                            }
                        }
                        var9 = this.field1263[var4] ? field1272 : field1257;
                    } else {
                        var9 = field1257;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1815(122, var6[0]);
                        var9.method1815(125, var6[var10]);
                        var9.method1815(77, var6[var10 + 1]);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1274; var11++) {
                class221 var12 = arg0[this.field1280[var11]][this.field1259[var11]][this.field1264[var11]];
                if (var12 != null && var12.field3365) {
                    int[] var13 = this.field1279[var11];
                    class263 var16;
                    if (this.field1270) {
                        int[] var14 = this.field1262[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1272.method1829(var14[var15], 3);
                            }
                        }
                        var16 = this.field1263[var11] ? field1272 : field1257;
                    } else {
                        var16 = field1257;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1829(var13[0], 3);
                        var16.method1829(var13[var17], 3);
                        var16.method1829(var13[var17 + 1], 3);
                    }
                }
            }
        }
        if (field1257.field4025 == 0 && field1272.field4025 == 0) {
            return;
        }
        GL var18 = class117.field1801;
        if (this.field1281 == -1 || arg2) {
            class117.method814(-1);
            class204.method1397(-46, 0, 0);
        } else {
            class148.field2233.method737(this.field1281, -4090);
        }
        int var19 = this.field1265 ? 40 : 36;
        if (this.field1267 == null) {
            if (class117.field1802) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1254.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1254);
            this.field1254.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1254);
            if (class292.field4447) {
                this.field1254.position(16);
                var18.glNormalPointer(5126, var19, this.field1254);
            }
            this.field1254.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1254);
            if (this.field1265) {
                var18.glClientActiveTexture(class118.method838());
                this.field1254.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1254);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1267.method345();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class292.field4447) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1265) {
                var18.glClientActiveTexture(class118.method838());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class117.field1802) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1257.field4025 != 0) {
            if (field1282 == null || field1282.capacity() < field1257.field4025) {
                field1282 = ByteBuffer.allocateDirect(field1257.field4025).order(ByteOrder.nativeOrder());
            } else {
                field1282.clear();
            }
            field1282.put(field1257.field3986, 0, field1257.field4025);
            field1282.flip();
            class117.method801(arg1);
            var18.glDrawElements(4, field1257.field4025 / 4, 5125, field1282);
        }
        if (field1272.field4025 == 0) {
            return;
        }
        if (field1256 == null || field1256.capacity() < field1272.field4025) {
            field1256 = ByteBuffer.allocateDirect(field1272.field4025).order(ByteOrder.nativeOrder());
        } else {
            field1256.clear();
        }
        field1256.put(field1272.field3986, 0, field1272.field4025);
        field1256.flip();
        class117.method801(arg1 - 100.0F);
        class117.method831();
        var18.glDrawElements(4, field1272.field4025 / 4, 5125, field1256);
        class117.method829();
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIFFFIF)I", line = 362)
    public final int method602(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class261 var11 = (class261) this.field1277.method1320(var9, 13002);
            if (var11 != null) {
                if (arg1 < this.field1275[var11.field3954]) {
                    this.field1275[var11.field3954] = arg1;
                }
                return var11.field3954;
            }
        }
        this.field1278[this.field1268] = arg0;
        this.field1275[this.field1268] = arg1;
        this.field1273[this.field1268] = arg2;
        if (this.field1265) {
            this.field1269[this.field1268] = arg7;
        }
        this.field1258[this.field1268] = arg3;
        this.field1283[this.field1268] = arg4;
        this.field1255[this.field1268] = arg5;
        this.field1266[this.field1268] = arg6;
        if (var9 != 0L) {
            this.field1277.method1319(-84, var9, new class261(this.field1268));
        }
        return this.field1268++;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class86(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1281 = arg0;
        this.field1253 = arg1;
        this.field1270 = arg2;
        this.field1265 = arg3;
        this.field1261 = arg4;
    }
}
