import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class83 extends class71 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field1242 = 0;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public int field1249 = 0;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public int field1265 = 0;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "I")
    public int field1256 = 0;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    private int field1271 = 0;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    private int field1264 = 0;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public int field1267;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "F")
    private float field1245;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Z")
    public boolean field1272;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Z")
    private boolean field1246;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    public int field1260;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lim;")
    private static class192 field1247;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "Lim;")
    private static class192 field1253;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Lrl;")
    private class207 field1269;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "Lol;")
    private class246 field1243;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1259;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1261;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1263;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "[F")
    private float[] field1251;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "[F")
    private float[] field1258;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "[F")
    private float[] field1268;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "[F")
    private float[] field1270;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "[I")
    private int[] field1241;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    private int[] field1244;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[I")
    private int[] field1248;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "[I")
    private int[] field1252;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "[I")
    private int[] field1255;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
    private int[] field1257;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "[I")
    private int[] field1262;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[Z")
    private boolean[] field1254;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[[I")
    private int[][] field1250;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "[[I")
    private int[][] field1266;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 8)
    public final void method611() {
        class192 var1 = new class192((this.field1246 ? 40 : 36) * this.field1249);
        for (int var2 = 0; var2 < this.field1249; var2++) {
            if (class186.field3014) {
                var1.method1345(31252, (float) this.field1248[var2]);
                var1.method1345(31252, (float) this.field1262[var2]);
                var1.method1345(31252, (float) this.field1257[var2]);
                var1.method1350(this.field1241[var2], -58);
                var1.method1345(31252, this.field1270[var2]);
                var1.method1345(31252, this.field1268[var2]);
                var1.method1345(31252, this.field1258[var2]);
                var1.method1345(31252, (float) this.field1248[var2] / this.field1245);
                var1.method1345(31252, (float) this.field1257[var2] / this.field1245);
                if (this.field1246) {
                    var1.method1345(31252, this.field1251[var2]);
                }
            } else {
                var1.method1373(83, (float) this.field1248[var2]);
                var1.method1373(94, (float) this.field1262[var2]);
                var1.method1373(69, (float) this.field1257[var2]);
                var1.method1350(this.field1241[var2], -121);
                var1.method1373(118, this.field1270[var2]);
                var1.method1373(68, this.field1268[var2]);
                var1.method1373(62, this.field1258[var2]);
                var1.method1373(96, (float) this.field1248[var2] / this.field1245);
                var1.method1373(66, (float) this.field1257[var2] / this.field1245);
                if (this.field1246) {
                    var1.method1373(83, this.field1251[var2]);
                }
            }
        }
        if (class186.field3027) {
            ByteBuffer var3 = ByteBuffer.wrap(var1.field3128, 0, var1.field3129);
            this.field1269 = new class207();
            this.field1269.method1518(var3);
        } else {
            this.field1259 = ByteBuffer.allocateDirect(var1.field3129).order(ByteOrder.nativeOrder());
            this.field1259.put(var1.field3128, 0, var1.field3129);
            this.field1259.flip();
        }
        this.field1248 = null;
        this.field1262 = null;
        this.field1257 = null;
        this.field1241 = null;
        this.field1270 = null;
        this.field1268 = null;
        this.field1258 = null;
        this.field1243 = null;
        this.field1251 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "()V", line = 75)
    public static void method612() {
        field1253 = null;
        field1247 = null;
        field1263 = null;
        field1261 = null;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "()V", line = 83)
    public static final void method613() {
        field1253 = null;
        field1247 = null;
        field1263 = null;
        field1261 = null;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "()V", line = 89)
    public final void method614() {
        this.field1248 = new int[this.field1256];
        this.field1262 = new int[this.field1256];
        this.field1257 = new int[this.field1256];
        if (this.field1246) {
            this.field1251 = new float[this.field1256];
        }
        this.field1241 = new int[this.field1256];
        this.field1270 = new float[this.field1256];
        this.field1268 = new float[this.field1256];
        this.field1258 = new float[this.field1256];
        this.field1255 = new int[this.field1265];
        this.field1244 = new int[this.field1265];
        this.field1252 = new int[this.field1265];
        this.field1250 = new int[this.field1265][];
        this.field1243 = new class246(class290.method2032(42, this.field1256));
        if (this.field1272) {
            this.field1266 = new int[this.field1265][];
            this.field1254 = new boolean[this.field1265];
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(IFZZI)V", line = 417)
    public class83(int arg0, float arg1, boolean arg2, boolean arg3, int arg4) {
        this.field1267 = arg0;
        this.field1245 = arg1;
        this.field1272 = arg2;
        this.field1246 = arg3;
        this.field1260 = arg4;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[I[IZ)I", line = 123)
    public final int method615(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, boolean arg5) {
        if (this.field1272) {
            this.field1266[this.field1264] = arg4;
            this.field1254[this.field1264] = arg5;
            if (arg4 != null) {
                this.field1271 += arg4.length;
            }
            if (arg5) {
                this.field1271 += (arg3.length - 2) * 3;
            } else {
                this.field1242 += (arg3.length - 2) * 3;
            }
        } else {
            this.field1242 += (arg3.length - 2) * 3;
        }
        this.field1252[this.field1264] = arg0;
        this.field1255[this.field1264] = arg1;
        this.field1244[this.field1264] = arg2;
        this.field1250[this.field1264] = arg3;
        return this.field1264++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIFFFIF)I", line = 147)
    public final int method616(int arg0, int arg1, int arg2, float arg3, float arg4, float arg5, int arg6, float arg7) {
        long var9 = 0L;
        if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
            var9 = ((long) arg6 << 32) + (long) ((arg2 << 16) + arg0);
            class310 var11 = (class310) this.field1243.method1743(var9, (byte) -98);
            if (var11 != null) {
                if (arg1 < this.field1262[var11.field4844]) {
                    this.field1262[var11.field4844] = arg1;
                }
                return var11.field4844;
            }
        }
        this.field1248[this.field1249] = arg0;
        this.field1262[this.field1249] = arg1;
        this.field1257[this.field1249] = arg2;
        if (this.field1246) {
            this.field1251[this.field1249] = arg7;
        }
        this.field1270[this.field1249] = arg3;
        this.field1268[this.field1249] = arg4;
        this.field1258[this.field1249] = arg5;
        this.field1241[this.field1249] = arg6;
        if (var9 != 0L) {
            this.field1243.method1750(new class310(this.field1249), (byte) 123, var9);
        }
        return this.field1249++;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "([[[Li;FZ)V", line = 209)
    public final void method617(class230[][][] arg0, float arg1, boolean arg2) {
        if (field1253 == null || field1253.field3128.length < this.field1242 * 4) {
            field1253 = new class192(this.field1242 * 4);
        } else {
            field1253.field3129 = 0;
        }
        if (field1247 == null || field1247.field3128.length < this.field1271 * 4) {
            field1247 = new class192(this.field1271 * 4);
        } else {
            field1247.field3129 = 0;
        }
        if (class186.field3014) {
            for (int var4 = 0; var4 < this.field1264; var4++) {
                class230 var5 = arg0[this.field1252[var4]][this.field1255[var4]][this.field1244[var4]];
                if (var5 != null && var5.field3679) {
                    int[] var6 = this.field1250[var4];
                    class192 var9;
                    if (this.field1272) {
                        int[] var7 = this.field1266[var4];
                        if (var7 != null) {
                            for (int var8 = 0; var8 < var7.length; var8++) {
                                field1247.method1350(var7[var8], -82);
                            }
                        }
                        var9 = this.field1254[var4] ? field1247 : field1253;
                    } else {
                        var9 = field1253;
                    }
                    for (int var10 = 1; var10 < var6.length - 1; var10++) {
                        var9.method1350(var6[0], -116);
                        var9.method1350(var6[var10], -65);
                        var9.method1350(var6[var10 + 1], -83);
                    }
                }
            }
        } else {
            for (int var11 = 0; var11 < this.field1264; var11++) {
                class230 var12 = arg0[this.field1252[var11]][this.field1255[var11]][this.field1244[var11]];
                if (var12 != null && var12.field3679) {
                    int[] var13 = this.field1250[var11];
                    class192 var16;
                    if (this.field1272) {
                        int[] var14 = this.field1266[var11];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1247.method1400(var14[var15], (byte) -80);
                            }
                        }
                        var16 = this.field1254[var11] ? field1247 : field1253;
                    } else {
                        var16 = field1253;
                    }
                    for (int var17 = 1; var17 < var13.length - 1; var17++) {
                        var16.method1400(var13[0], (byte) -112);
                        var16.method1400(var13[var17], (byte) -94);
                        var16.method1400(var13[var17 + 1], (byte) -72);
                    }
                }
            }
        }
        if (field1253.field3129 == 0 && field1247.field3129 == 0) {
            return;
        }
        GL var18 = class186.field2990;
        if (this.field1267 == -1 || arg2) {
            class186.method1288(-1);
            class188.method1328(0, 0, (byte) 120);
        } else {
            class25.field365.method381(98, this.field1267);
        }
        int var19 = this.field1246 ? 40 : 36;
        if (this.field1269 == null) {
            if (class186.field3027) {
                var18.glBindBufferARB(34962, 0);
            }
            this.field1259.position(0);
            var18.glVertexPointer(3, 5126, var19, this.field1259);
            this.field1259.position(12);
            var18.glColorPointer(4, 5121, var19, this.field1259);
            if (class269.field4250) {
                this.field1259.position(16);
                var18.glNormalPointer(5126, var19, this.field1259);
            }
            this.field1259.position(28);
            var18.glTexCoordPointer(2, 5126, var19, this.field1259);
            if (this.field1246) {
                var18.glClientActiveTexture(class85.method624());
                this.field1259.position(36);
                var18.glTexCoordPointer(1, 5126, var19, this.field1259);
                var18.glClientActiveTexture(33984);
            }
        } else {
            this.field1269.method1517();
            var18.glVertexPointer(3, 5126, var19, 0L);
            var18.glColorPointer(4, 5121, var19, 12L);
            if (class269.field4250) {
                var18.glNormalPointer(5126, var19, 16L);
            }
            var18.glTexCoordPointer(2, 5126, var19, 28L);
            if (this.field1246) {
                var18.glClientActiveTexture(class85.method624());
                var18.glTexCoordPointer(1, 5126, var19, 36L);
                var18.glClientActiveTexture(33984);
            }
        }
        if (class186.field3027) {
            var18.glBindBufferARB(34963, 0);
        }
        if (field1253.field3129 != 0) {
            if (field1263 == null || field1263.capacity() < field1253.field3129) {
                field1263 = ByteBuffer.allocateDirect(field1253.field3129).order(ByteOrder.nativeOrder());
            } else {
                field1263.clear();
            }
            field1263.put(field1253.field3128, 0, field1253.field3129);
            field1263.flip();
            class186.method1282(arg1);
            var18.glDrawElements(4, field1253.field3129 / 4, 5125, field1263);
        }
        if (field1247.field3129 == 0) {
            return;
        }
        if (field1261 == null || field1261.capacity() < field1247.field3129) {
            field1261 = ByteBuffer.allocateDirect(field1247.field3129).order(ByteOrder.nativeOrder());
        } else {
            field1261.clear();
        }
        field1261.put(field1247.field3128, 0, field1247.field3129);
        field1261.flip();
        class186.method1282(arg1 - 100.0F);
        class186.method1284();
        var18.glDrawElements(4, field1247.field3129 / 4, 5125, field1261);
        class186.method1289();
    }
}
