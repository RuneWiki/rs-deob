import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class103 extends class54 {

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lmk;")
    private class154 field1234 = new class154();

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lql;")
    public class346 field1240;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "[[I")
    private int[][] field1238;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "[[I")
    private int[][] field1259;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public int field1249;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[[[I")
    private int[][][] field1239;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "[[[Loi;")
    private class117[][][] field1242;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[[[I")
    public int[][][] field1255;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[[[I")
    public int[][][] field1236;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[[[I")
    private int[][][] field1237;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[[[I")
    private int[][][] field1235;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[[S")
    public short[][] field1243;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[[B")
    private byte[][] field1247;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "[[B")
    private byte[][] field1260;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "[[F")
    private float[][] field1264;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[[F")
    private float[][] field1262;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[[F")
    private float[][] field1266;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "Luc;")
    private class58 field1268;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lsr;")
    private class134 field1244;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Ltq;")
    public static class250 field1246 = new class250(1);

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[F")
    private static float[] field1251 = new float[16];

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "[I")
    private static int[] field1253 = new int[1];

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "[I")
    private static int[] field1254 = new int[1];

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[I")
    private static int[] field1263 = new int[1];

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    private int field1245;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    private static int field1252;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "Lbb;")
    public class135 field1258;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "Lbb;")
    public class135 field1265;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "Lbb;")
    public class135 field1269;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "Lbb;")
    public class135 field1270;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "Lbb;")
    private class135 field1271;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lip;")
    private class49 field1267;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "[Loi;")
    private class117[] field1257;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(Lve;IIIIZ)Z", line = 5)
    public final boolean method278(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1244 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field1240.field4833 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field1240.field4755 * arg2 >> 8) >> 3;
            return this.field1244.method729(arg0, var8, var7, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lfs;[I)V", line = 19)
    public final void method270(class349 arg0, int[] arg1) {
        this.field1234.method825(85, new class76(this.field1240, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lql;IIII[[I[[II)V", line = 23)
    public class103(class346 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1240 = arg0;
        this.field1238 = arg5;
        this.field1259 = arg6;
        this.field1250 = arg2;
        while (arg7 > 1) {
            this.field1249++;
            arg7 >>= 0x1;
        }
        this.field1248 = 0x1 << this.field1249;
        this.field1239 = new int[arg3][arg4][];
        this.field1242 = new class117[arg3][arg4][];
        this.field1255 = new int[arg3][arg4][];
        this.field1236 = new int[arg3][arg4][];
        this.field1237 = new int[arg3][arg4][];
        this.field1235 = new int[arg3][arg4][];
        this.field1243 = new short[arg3 * arg4][];
        this.field1247 = new byte[arg3][arg4];
        this.field1260 = new byte[arg3 + 1][arg4 + 1];
        this.field1264 = new float[arg3 + 1][arg4 + 1];
        this.field1262 = new float[arg3 + 1][arg4 + 1];
        this.field1266 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field1238[var10 + 1][var9] - this.field1238[var10 - 1][var9];
                int var12 = this.field1238[var10][var9 + 1] - this.field1238[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field1264[var10][var9] = (float) var11 * var13;
                this.field1262[var10][var9] = var13 * -256.0F;
                this.field1266[var10][var9] = (float) var12 * var13;
            }
        }
        this.field1268 = new class58(128);
        if ((this.field1250 & 0x10) != 0) {
            this.field1244 = new class134(this.field1240, this);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lve;IIIIZ)V", line = 83)
    public final void method273(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1244 != null && arg0 != null) {
            int var7 = arg1 - (this.field1240.field4833 * arg2 >> 8) >> this.field1240.field4719;
            int var8 = arg3 - (this.field1240.field4755 * arg2 >> 8) >> this.field1240.field4719;
            this.field1244.method731(var8, arg0, var7, true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V", line = 97)
    public final void method277(int arg0, int arg1, int arg2) {
        if ((this.field1260[arg0][arg1] & 0xFF) < arg2) {
            this.field1260[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[[ZZ)V", line = 104)
    public final void method268(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field1257 == null) {
            return;
        }
        float var6 = this.field1240.field4790;
        float var7 = this.field1240.field4781;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field1263.length < var9) {
            field1263 = new int[var9];
        }
        if (field1246.field3406.length < this.field1241 * 2) {
            field1246 = new class250(this.field1241 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field556 - 1) {
            var14 = this.field556 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field550 - 1) {
            var15 = this.field550 - 1;
        }
        field1252 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field1263[field1252++] = this.field556 * var18 + var16;
                }
            }
        }
        this.field1240.method2035();
        for (int var19 = 0; var19 < this.field1257.length; var19++) {
            this.field1257[var19].method637(field1263, 255, field1252);
        }
        if (!this.field1234.method823(127)) {
            int var20 = this.field1240.field4823;
            int var21 = this.field1240.field4812;
            this.field1240.method1603(0, var21);
            this.field1240.method1583(var7, var6 - 4.0F);
            this.field1240.method2094(false);
            this.field1240.method2080(false);
            this.field1240.method2044(130);
            this.field1240.method2091(-2);
            this.field1240.method2032(this.field1240.field4797);
            this.field1240.method2053(8448, 7681);
            this.field1240.method2062(0, 34166, 770);
            this.field1240.method2040(0, 34167, 770);
            for (class338 var22 = this.field1234.method814((byte) 90); var22 != null; var22 = this.field1234.method827(-127)) {
                class76 var23 = (class76) var22;
                var23.method428(arg1, arg2, arg0, -119, arg3);
            }
            this.field1240.method2062(0, 5890, 768);
            this.field1240.method2040(0, 5890, 770);
            this.field1240.method2032((class50) null);
            this.field1240.method1603(var20, var21);
        }
        if (this.field1244 != null) {
            this.field1240.method1583(var7, var6 - 8.0F);
            this.field1240.method2035();
            this.field1240.method2037(this.field1258);
            this.field1240.method2105(0, this.field1269);
            this.field1240.method2088();
            this.field1244.method730(arg1, arg0, arg2, arg4, arg3, 0);
        }
        this.field1240.method1583(var7, var6);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lac;II)V", line = 232)
    private final void method555(class214 arg0, int arg1, int arg2) {
        int[] var4 = this.field1255[arg1][arg2];
        int[] var5 = this.field1236[arg1][arg2];
        int var6 = var4.length;
        if (field1254.length < var6) {
            field1254 = new int[var6];
            field1253 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field1254[var7] = (var4[var7] & 0xFF) >> this.field1240.field4719;
            field1253[var7] = (var5[var7] & 0xFF) >> this.field1240.field4719;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field1254[var8];
            int var10 = field1253[var8++];
            int var11 = field1254[var8];
            int var12 = field1253[var8++];
            int var13 = field1254[var8];
            int var14 = field1253[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1161(var10, var14, var9, var11, 0, var12, var13);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lve;IIIIZ)V", line = 282)
    public final void method266(class307 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field1244 != null && arg0 != null) {
            int var7 = arg1 - (this.field1240.field4833 * arg2 >> 8) >> this.field1240.field4719;
            int var8 = arg3 - (this.field1240.field4755 * arg2 >> 8) >> this.field1240.field4719;
            this.field1244.method724(var7, (byte) -115, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 296)
    public final int method265(int arg0, int arg1) {
        int var3 = arg0 >> this.field1249;
        int var4 = arg1 >> this.field1249;
        if (var3 < 0 || var4 < 0 || var3 > this.field556 - 1 || var4 > this.field550 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field1248 - 1;
        int var6 = arg1 & this.field1248 - 1;
        int var7 = (this.field1248 - var5) * this.field1238[var3][var4] + this.field1238[var3 + 1][var4] * var5 >> this.field1249;
        int var8 = (this.field1248 - var5) * this.field1238[var3][var4 + 1] + this.field1238[var3 + 1][var4 + 1] * var5 >> this.field1249;
        return (this.field1248 - var6) * var7 + var6 * var8 >> this.field1249;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)I", line = 313)
    public final int method271(int arg0, int arg1) {
        return this.field1238[arg0][arg1];
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILve;)Lve;", line = 317)
    public final class307 method274(int arg0, int arg1, class307 arg2) {
        if ((this.field1247[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field1248 >> this.field1240.field4719;
        class214 var5 = (class214) arg2;
        class214 var6;
        if (var5 != null && var5.method1159(var4, var4, false)) {
            var6 = var5;
            var5.method1157(false);
        } else {
            var6 = new class214(this.field1240, var4, var4);
        }
        var6.method1158(0, var4, 0, -50, var4);
        this.method555(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 347)
    public final void method280() {
        if (this.field1261 > 0) {
            byte[][] var1 = new byte[this.field556 + 1][this.field550 + 1];
            for (int var2 = 1; var2 < this.field556; var2++) {
                for (int var3 = 1; var3 < this.field550; var3++) {
                    var1[var2][var3] = (byte) ((this.field1260[var2][var3] >> 1) + (this.field1260[var2][var3 + 1] >> 3) + (this.field1260[var2][var3 - 1] >> 2) + (this.field1260[var2 - 1][var3] >> 2) + (this.field1260[var2 + 1][var3] >> 3));
                }
            }
            this.field1257 = new class117[this.field1268.method311(3369)];
            this.field1268.method318(this.field1257, (byte) 99);
            for (int var4 = 0; var4 < this.field1257.length; var4++) {
                this.field1257[var4].method634(4, this.field1261);
            }
            int var5 = 24;
            if (this.field1259 != null) {
                var5 += 4;
            }
            if ((this.field1250 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field1261 * var5).order(ByteOrder.nativeOrder());
            class117[] var7 = new class117[this.field1261];
            class58 var8 = new class58(class23.method123(11362, this.field1261));
            class117[] var9 = new class117[this.field1256];
            for (int var10 = 0; var10 < this.field556; var10++) {
                for (int var11 = 0; var11 < this.field550; var11++) {
                    if (this.field1237[var10][var11] != null) {
                        class117[] var12 = this.field1242[var10][var11];
                        int[] var13 = this.field1239[var10][var11];
                        int[] var14 = this.field1255[var10][var11];
                        int[] var15 = this.field1236[var10][var11];
                        int[] var16 = this.field1235[var10][var11];
                        int[] var17 = this.field1237[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field1264[var10][var11];
                        float var19 = this.field1262[var10][var11];
                        float var20 = this.field1266[var10][var11];
                        float var21 = this.field1264[var10][var11 + 1];
                        float var22 = this.field1262[var10][var11 + 1];
                        float var23 = this.field1266[var10][var11 + 1];
                        float var24 = this.field1264[var10 + 1][var11 + 1];
                        float var25 = this.field1262[var10 + 1][var11 + 1];
                        float var26 = this.field1266[var10 + 1][var11 + 1];
                        float var27 = this.field1264[var10 + 1][var11];
                        float var28 = this.field1262[var10 + 1][var11];
                        float var29 = this.field1266[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field1259 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field1259[var10][var11];
                            var35 = (float) this.field1259[var10][var11 + 1];
                            var36 = (float) this.field1259[var10 + 1][var11 + 1];
                            var37 = (float) this.field1259[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class117 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field1243[this.field556 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field1249) + var14[var43];
                            int var45 = (var11 << this.field1249) + var15[var43];
                            int var46 = var17[var43];
                            int var47 = var16[var43];
                            int var48 = var13 == null ? 0 : var13[var43];
                            long var49 = (long) var47 << 48 | (long) var46 << 32 | (long) (var44 << 16) | (long) var45;
                            int var51 = var14[var43];
                            int var52 = var15[var43];
                            byte var53 = 74;
                            int var54 = 0;
                            float var55 = 1.0F;
                            float var56;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var51 == 0 && var52 == 0) {
                                var56 = var18;
                                var57 = var19;
                                var58 = var20;
                                var59 = var34;
                                var60 = var53 - var30;
                            } else if (var51 == 0 && this.field1248 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field1248 == var51 && this.field1248 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field1248 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field1248;
                                float var62 = (float) var52 / (float) this.field1248;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field1249) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field1249) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field1249) + var69);
                                float var71 = (var37 - var34) * var61 + var34;
                                float var72 = (var36 - var35) * var61 + var35;
                                var59 = (var72 - var71) * var62 + var71;
                            }
                            if (var46 != -1) {
                                int var73 = (var46 & 0x7F) * var60 >> 7;
                                if (var73 < 2) {
                                    var73 = 2;
                                } else if (var73 > 126) {
                                    var73 = 126;
                                }
                                var54 = class180.field2271[var46 & 0xFF80 | var73];
                                if ((this.field1250 & 0x7) == 0) {
                                    float var74 = this.field1240.field4768[2] * var58 + this.field1240.field4768[0] * var56 + this.field1240.field4768[1] * var57;
                                    var55 = this.field1240.field4824 + var74 * (var74 > 0.0F ? this.field1240.field4743 : this.field1240.field4775);
                                }
                            }
                            class338 var75 = var8.method308(var49, (byte) -107);
                            int var86;
                            if (var75 == null) {
                                int var77;
                                if (var46 == var47) {
                                    var77 = var54;
                                } else {
                                    int var76 = (var47 & 0x7F) * var60 >> 7;
                                    if (var76 < 2) {
                                        var76 = 2;
                                    } else if (var76 > 126) {
                                        var76 = 126;
                                    }
                                    var77 = class180.field2271[var47 & 0xFF80 | var76];
                                    if ((this.field1250 & 0x7) == 0) {
                                        float var78 = this.field1240.field4768[2] * var58 + this.field1240.field4768[0] * var56 + this.field1240.field4768[1] * var57;
                                        float var79 = this.field1240.field4824 + var55 * (var55 > 0.0F ? this.field1240.field4743 : this.field1240.field4775);
                                        int var80 = var77 >> 16 & 0xFF;
                                        int var81 = var77 >> 8 & 0xFF;
                                        int var82 = var77 & 0xFF;
                                        int var83 = (int) ((float) var80 * var79);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        int var84 = (int) ((float) var81 * var79);
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = (int) ((float) var82 * var79);
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var77 = var83 << 16 | var84 << 8 | var85;
                                    }
                                }
                                var6.putFloat((float) var44);
                                var6.putFloat((float) (this.method265(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field1250 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field1259 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field1245++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method314(var49, new class164(var42[var43]), 7079);
                            } else {
                                var42[var43] = ((class164) var75).field2092;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field4510 < var7[var86].field4510) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method633(var54, -29677, var60, var55, var86);
                            }
                            this.field1241++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field1245; var88++) {
                class117 var89 = var7[var88];
                if (var89 != null) {
                    var89.method638((byte) -103, var88);
                }
            }
            for (int var90 = 0; var90 < this.field556; var90++) {
                for (int var91 = 0; var91 < this.field550; var91++) {
                    short[] var92 = this.field1243[this.field556 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class117 var98 = var7[var95];
                            class117 var99 = var7[var96];
                            class117 var100 = var7[var97];
                            class117 var101 = null;
                            if (var98 != null) {
                                var98.method636(0, var93, var90, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method636(0, var93, var90, var91);
                                if (var101 == null || var99.field4510 < var101.field4510) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method636(0, var93, var90, var91);
                                if (var101 == null || var100.field4510 < var101.field4510) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method638((byte) -103, var95);
                                }
                                if (var99 != null) {
                                    var101.method638((byte) -103, var96);
                                }
                                if (var100 != null) {
                                    var101.method638((byte) -103, var97);
                                }
                                var101.method636(0, var93, var90, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field1267 = this.field1240.method2036(var5, var6, false);
            int var102 = 24;
            this.field1258 = new class135(this.field1240, this.field1267, 5126, 3, 0);
            this.field1269 = new class135(this.field1240, this.field1267, 5126, 2, 12);
            this.field1271 = new class135(this.field1240, this.field1267, 5121, 4, 20);
            if ((this.field1250 & 0x7) != 0) {
                this.field1265 = new class135(this.field1240, this.field1267, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field1259 != null) {
                this.field1270 = new class135(this.field1240, this.field1267, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field1257.length];
            for (int var104 = 0; var104 < this.field1257.length; var104++) {
                class117 var105 = this.field1257[var104];
                var103[var104] = var105.field4510;
                var105.method635(80, this.field1245);
            }
            class305.method1789(var103, -1, this.field1257);
            if (this.field1244 != null) {
                this.field1244.method726(48);
            }
        } else {
            this.field1244 = null;
        }
        this.field1255 = this.field1236 = (int[][][]) null;
        this.field1235 = (int[][][]) null;
        this.field1239 = (int[][][]) null;
        this.field1242 = (class117[][][]) null;
        this.field1237 = (int[][][]) null;
        this.field1260 = (byte[][]) null;
        this.field1268 = null;
        this.field1259 = (int[][]) null;
        this.field1264 = this.field1262 = this.field1266 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 882)
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field1239[arg0][arg1] = arg3;
        this.field1255[arg0][arg1] = arg2;
        this.field1236[arg0][arg1] = arg4;
        this.field1237[arg0][arg1] = arg5;
        this.field1235[arg0][arg1] = arg6;
        class117[] var13 = this.field1242[arg0][arg1] = new class117[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class338 var17 = this.field1268.method308(var15, (byte) -98);
            if (var17 == null) {
                var13[var14] = new class117(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field1268.method314(var15, var13[var14], 7079);
            } else {
                var13[var14] = (class117) var17;
            }
        }
        if (arg11) {
            this.field1247[arg0][arg1] = (byte) (this.field1247[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field1256) {
            this.field1256 = arg5.length;
        }
        this.field1261 += arg5.length;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 919)
    public final void method267(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        int var16 = arg8.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int var24 = 0;
        for (int var25 = 0; var25 < var16; var25++) {
            int var26 = arg5[var25];
            int var27 = arg6[var25];
            int var28 = arg7[var25];
            var17[var24] = arg2[var26];
            var18[var24] = arg4[var26];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var26];
            }
            var24++;
            var17[var24] = arg2[var27];
            var18[var24] = arg4[var27];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var27];
            }
            var24++;
            var17[var24] = arg2[var28];
            var18[var24] = arg4[var28];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var28];
            }
            var24++;
        }
        this.method275(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIII[[Z)V", line = 983)
    public final void method279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field1261 <= 0) {
            return;
        }
        opengl var9 = this.field1240.field4697;
        this.field1240.method2047();
        this.field1240.method2075(false);
        this.field1240.method2094(false);
        this.field1240.method2093(false);
        this.field1240.method2080(false);
        this.field1240.method2044(0);
        this.field1240.method2091(-2);
        this.field1240.method2032((class50) null);
        field1251[0] = (float) arg2 / ((float) this.field1248 * 128.0F * (float) this.field1240.field4711);
        field1251[1] = 0.0F;
        field1251[2] = 0.0F;
        field1251[3] = 0.0F;
        field1251[4] = 0.0F;
        field1251[5] = (float) arg2 / ((float) this.field1248 * 128.0F * (float) this.field1240.field4709);
        field1251[6] = 0.0F;
        field1251[7] = 0.0F;
        field1251[8] = 0.0F;
        field1251[9] = 0.0F;
        field1251[10] = 0.0F;
        field1251[11] = 0.0F;
        field1251[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field1240.field4711;
        field1251[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field1240.field4709;
        field1251[14] = 0.0F;
        field1251[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field1251, 0);
        field1251[0] = 1.0F;
        field1251[1] = 0.0F;
        field1251[2] = 0.0F;
        field1251[3] = 0.0F;
        field1251[4] = 0.0F;
        field1251[5] = 0.0F;
        field1251[6] = 1.0F;
        field1251[7] = 0.0F;
        field1251[8] = 0.0F;
        field1251[9] = 1.0F;
        field1251[10] = 0.0F;
        field1251[11] = 0.0F;
        field1251[12] = 0.0F;
        field1251[13] = 0.0F;
        field1251[14] = 0.0F;
        field1251[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field1251, 0);
        this.field1240.method2095();
        this.field1240.method2082(this.field1271);
        this.field1240.method2037(this.field1258);
        this.field1240.method2105(0, this.field1269);
        if ((this.field1250 & 0x7) == 0) {
            this.field1240.method2094(false);
        } else {
            this.field1240.method2070(this.field1265);
            this.field1240.method2094(true);
        }
        this.field1240.method2088();
        if (field1246.field3406.length < this.field1241 * 2) {
            field1246 = new class250(this.field1241 * 2);
        } else {
            field1246.field3389 = 0;
        }
        int var10 = 0;
        if (this.field1240.field4736) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field556 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field1243[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field1246.method1346(118, var14[var15]);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field556 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field1243[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field1246.method1370((byte) -36, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field1240.field4761.method791(5123, field1246.field3406, field1246.field3389);
            this.field1240.method2041(this.field1240.field4761, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(II)V", line = 1148)
    public final void method276(int arg0, int arg1) {
    }
}
