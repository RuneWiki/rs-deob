import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class22 extends class48 {

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lat;")
    private class412 field268 = new class412();

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Lnm;")
    public class254 field264;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "[[I")
    private int[][] field267;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public int field269;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "[[[I")
    private int[][][] field279;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "[[[Lnp;")
    private class80[][][] field271;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "[[[I")
    public int[][][] field270;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[[[I")
    public int[][][] field265;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "[[[I")
    private int[][][] field273;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "[[[I")
    private int[][][] field274;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "[[S")
    public short[][] field283;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "[[B")
    private byte[][] field275;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[[B")
    private byte[][] field290;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "[[F")
    private float[][] field288;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "[[F")
    private float[][] field291;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "[[F")
    private float[][] field289;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "Lfa;")
    private class371 field294;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "Lmk;")
    private class354 field272;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Lre;")
    public static class446 field280 = new class446(1);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[I")
    private static int[] field284 = new int[1];

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "[F")
    private static float[] field282 = new float[16];

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "[I")
    private static int[] field285 = new int[1];

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "[I")
    private static int[] field287 = new int[1];

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    private static int field281;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    private int field299;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "Lec;")
    private class101 field292;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "Ljt;")
    private class377 field295;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Ljt;")
    public class377 field296;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Ljt;")
    public class377 field298;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Ljt;")
    public class377 field300;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "[Lnp;")
    private class80[] field293;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "[[[I")
    private int[][][] field277;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)V")
    public final void method193(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "()V")
    public final void method194() {
        if (this.field299 > 0) {
            byte[][] var1 = new byte[this.field686 + 1][this.field690 + 1];
            for (int var2 = 1; var2 < this.field686; var2++) {
                for (int var3 = 1; var3 < this.field690; var3++) {
                    var1[var2][var3] = (byte) ((this.field290[var2][var3] >> 1) + (this.field290[var2][var3 + 1] >> 3) + (this.field290[var2][var3 - 1] >> 2) + (this.field290[var2 - 1][var3] >> 2) + (this.field290[var2 + 1][var3] >> 3));
                }
            }
            this.field293 = new class80[this.field294.method2302(false)];
            this.field294.method2304(-99, this.field293);
            for (int var4 = 0; var4 < this.field293.length; var4++) {
                this.field293[var4].method665(this.field299, 4);
            }
            int var5 = 24;
            if (this.field277 != null) {
                var5 += 4;
            }
            if ((this.field269 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field299 * var5).order(ByteOrder.nativeOrder());
            class80[] var7 = new class80[this.field299];
            class371 var8 = new class371(class183.method1257(23132, this.field299));
            class80[] var9 = new class80[this.field297];
            for (int var10 = 0; var10 < this.field686; var10++) {
                for (int var11 = 0; var11 < this.field690; var11++) {
                    if (this.field273[var10][var11] != null) {
                        class80[] var12 = this.field271[var10][var11];
                        int[] var13 = this.field270[var10][var11];
                        int[] var14 = this.field265[var10][var11];
                        int[] var15 = this.field274[var10][var11];
                        int[] var16 = this.field273[var10][var11];
                        int[] var17 = this.field279 == null ? null : this.field279[var10][var11];
                        int[] var18 = this.field277 == null ? null : this.field277[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field288[var10][var11];
                        float var20 = this.field291[var10][var11];
                        float var21 = this.field289[var10][var11];
                        float var22 = this.field288[var10][var11 + 1];
                        float var23 = this.field291[var10][var11 + 1];
                        float var24 = this.field289[var10][var11 + 1];
                        float var25 = this.field288[var10 + 1][var11 + 1];
                        float var26 = this.field291[var10 + 1][var11 + 1];
                        float var27 = this.field289[var10 + 1][var11 + 1];
                        float var28 = this.field288[var10 + 1][var11];
                        float var29 = this.field291[var10 + 1][var11];
                        float var30 = this.field289[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class80 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field283[this.field686 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field278) + var13[var40];
                            int var42 = (var11 << this.field278) + var14[var40];
                            int var43 = var16[var40];
                            int var44 = var15[var40];
                            int var45 = var17 == null ? 0 : var17[var40];
                            long var46 = (long) var44 << 48 | (long) var43 << 32 | (long) (var41 << 16) | (long) var42;
                            int var48 = var13[var40];
                            int var49 = var14[var40];
                            byte var50 = 74;
                            int var51 = 0;
                            float var52 = 1.0F;
                            float var53;
                            float var54;
                            float var55;
                            int var56;
                            if (var48 == 0 && var49 == 0) {
                                var53 = var19;
                                var54 = var20;
                                var55 = var21;
                                var56 = var50 - var31;
                            } else if (var48 == 0 && this.field286 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field286 == var48 && this.field286 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field286 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field286;
                                float var58 = (float) var49 / (float) this.field286;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field278) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field278) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field278) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class422.field6043[var43 & 0xFF80 | var67];
                                if ((this.field269 & 0x7) == 0) {
                                    float var68 = this.field264.field3710[2] * var55 + this.field264.field3710[0] * var53 + this.field264.field3710[1] * var54;
                                    var52 = this.field264.field3781 + var68 * (var68 > 0.0F ? this.field264.field3714 : this.field264.field3770);
                                }
                            }
                            class35 var69 = var8.method2305(var46, (byte) 118);
                            int var80;
                            if (var69 == null) {
                                int var71;
                                if (var43 == var44) {
                                    var71 = var51;
                                } else {
                                    int var70 = (var44 & 0x7F) * var56 >> 7;
                                    if (var70 < 2) {
                                        var70 = 2;
                                    } else if (var70 > 126) {
                                        var70 = 126;
                                    }
                                    var71 = class422.field6043[var44 & 0xFF80 | var70];
                                    if ((this.field269 & 0x7) == 0) {
                                        float var72 = this.field264.field3710[2] * var55 + this.field264.field3710[0] * var53 + this.field264.field3710[1] * var54;
                                        float var73 = this.field264.field3781 + var52 * (var52 > 0.0F ? this.field264.field3714 : this.field264.field3770);
                                        int var74 = var71 >> 16 & 0xFF;
                                        int var75 = var71 >> 8 & 0xFF;
                                        int var76 = var71 & 0xFF;
                                        int var77 = (int) ((float) var74 * var73);
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = (int) ((float) var75 * var73);
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        int var79 = (int) ((float) var76 * var73);
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var71 = var77 << 16 | var78 << 8 | var79;
                                    }
                                }
                                var6.putFloat((float) var41);
                                var6.putFloat((float) (this.method204(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field277 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field269 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field276++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method2307(var46, new class231(var39[var40]), (byte) -104);
                            } else {
                                var39[var40] = ((class231) var69).field3393;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field436 < var7[var80].field436) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method662(var51, var56, var80, var52, -82);
                            }
                            this.field266++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field276; var82++) {
                class80 var83 = var7[var82];
                if (var83 != null) {
                    var83.method661((byte) -96, var82);
                }
            }
            for (int var84 = 0; var84 < this.field686; var84++) {
                for (int var85 = 0; var85 < this.field690; var85++) {
                    short[] var86 = this.field283[this.field686 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class80 var92 = var7[var89];
                            class80 var93 = var7[var90];
                            class80 var94 = var7[var91];
                            class80 var95 = null;
                            if (var92 != null) {
                                var92.method663(var87, var84, (byte) -56, var85);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method663(var87, var84, (byte) -56, var85);
                                if (var95 == null || var93.field436 < var95.field436) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method663(var87, var84, (byte) -56, var85);
                                if (var95 == null || var94.field436 < var95.field436) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method661((byte) -97, var89);
                                }
                                if (var93 != null) {
                                    var95.method661((byte) -123, var90);
                                }
                                if (var94 != null) {
                                    var95.method661((byte) -127, var91);
                                }
                                var95.method663(var87, var84, (byte) -56, var85);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field292 = this.field264.method1618(var5, var6, false);
            this.field300 = new class377(this.field264, this.field292, 5126, 3, 0);
            this.field295 = new class377(this.field264, this.field292, 5121, 4, 12);
            byte var96;
            if (this.field277 == null) {
                this.field296 = new class377(this.field264, this.field292, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field296 = new class377(this.field264, this.field292, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field269 & 0x7) != 0) {
                this.field298 = new class377(this.field264, this.field292, 5126, 3, var96);
            }
            long[] var97 = new long[this.field293.length];
            for (int var98 = 0; var98 < this.field293.length; var98++) {
                class80 var99 = this.field293[var98];
                var97[var98] = var99.field436;
                var99.method664((byte) -74, this.field276);
            }
            class282.method1813(var97, (byte) -113, this.field293);
            if (this.field272 != null) {
                this.field272.method2184(-23720);
            }
        } else {
            this.field272 = null;
        }
        this.field270 = this.field265 = (int[][][]) null;
        this.field277 = (int[][][]) null;
        this.field274 = (int[][][]) null;
        this.field279 = (int[][][]) null;
        this.field271 = (class80[][][]) null;
        this.field273 = (int[][][]) null;
        this.field290 = (byte[][]) null;
        this.field294 = null;
        this.field288 = this.field291 = this.field289 = (float[][]) null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Luj;II)V")
    private final void method195(class440 arg0, int arg1, int arg2) {
        int[] var4 = this.field270[arg1][arg2];
        int[] var5 = this.field265[arg1][arg2];
        int var6 = var4.length;
        if (field284.length < var6) {
            field284 = new int[var6];
            field287 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field284[var7] = (var4[var7] & 0xFF) >> this.field264.field3665;
            field287[var7] = (var5[var7] & 0xFF) >> this.field264.field3665;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field284[var8];
            int var10 = field287[var8++];
            int var11 = field284[var8];
            int var12 = field287[var8++];
            int var13 = field284[var8];
            int var14 = field287[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method2561(var10, var14, (byte) 70, var11, var12, var13, var9);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lma;[I)V")
    public final void method196(class233 arg0, int[] arg1) {
        this.field268.method2453((byte) -105, new class490(this.field264, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILfq;)Lfq;")
    public final class87 method197(int arg0, int arg1, class87 arg2) {
        if ((this.field275[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field286 >> this.field264.field3665;
        class440 var5 = (class440) arg2;
        class440 var6;
        if (var5 != null && var5.method2562(var4, 0, var4)) {
            var6 = var5;
            var5.method2560(false);
        } else {
            var6 = new class440(this.field264, var4, var4);
        }
        var6.method2563(var4, var4, 0, (byte) -116, 0);
        this.method195(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lnm;IIII[[I[[II)V")
    public class22(class254 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field264 = arg0;
        this.field267 = arg5;
        this.field269 = arg2;
        while (arg7 > 1) {
            this.field278++;
            arg7 >>= 0x1;
        }
        this.field286 = 0x1 << this.field278;
        this.field279 = new int[arg3][arg4][];
        this.field271 = new class80[arg3][arg4][];
        this.field270 = new int[arg3][arg4][];
        this.field265 = new int[arg3][arg4][];
        this.field273 = new int[arg3][arg4][];
        this.field274 = new int[arg3][arg4][];
        this.field283 = new short[arg3 * arg4][];
        this.field275 = new byte[arg3][arg4];
        this.field290 = new byte[arg3 + 1][arg4 + 1];
        this.field288 = new float[this.field686 + 1][this.field690 + 1];
        this.field291 = new float[this.field686 + 1][this.field690 + 1];
        this.field289 = new float[this.field686 + 1][this.field690 + 1];
        for (int var9 = 1; var9 < this.field690; var9++) {
            for (int var10 = 1; var10 < this.field686; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field288[var10][var9] = (float) var11 * var13;
                this.field291[var10][var9] = var13 * -256.0F;
                this.field289[var10][var9] = (float) var12 * var13;
            }
        }
        this.field294 = new class371(128);
        if ((this.field269 & 0x10) != 0) {
            this.field272 = new class354(this.field264, this);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)V")
    public final void method198(int arg0, int arg1, int arg2) {
        if ((this.field290[arg0][arg1] & 0xFF) < arg2) {
            this.field290[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)I")
    public final int method199(int arg0, int arg1) {
        return this.field267[arg0][arg1];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Lfq;IIIIZ)V")
    public final void method200(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field272 != null && arg0 != null) {
            int var7 = arg1 - (this.field264.field3752 * arg2 >> 8) >> this.field264.field3665;
            int var8 = arg3 - (this.field264.field3704 * arg2 >> 8) >> this.field264.field3665;
            this.field272.method2180(var7, arg0, var8, -13428);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method201(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; var28++) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            var27++;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            var27++;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            var27++;
        }
        this.method205(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lfq;IIIIZ)Z")
    public final boolean method202(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field272 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field264.field3752 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field264.field3704 * arg2 >> 8) >> 3;
            return this.field272.method2179(var8, var7, (byte) -122, arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III[[ZZ)V")
    public final void method203(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field293 == null) {
            return;
        }
        float var6 = this.field264.field3733;
        float var7 = this.field264.field3739;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field285.length < var9) {
            field285 = new int[var9];
        }
        if (field280.field6316.length < this.field266 * 2) {
            field280 = new class446(this.field266 * 2);
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
        if (var14 > this.field686 - 1) {
            var14 = this.field686 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field690 - 1) {
            var15 = this.field690 - 1;
        }
        field281 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field285[field281++] = this.field686 * var18 + var16;
                }
            }
        }
        this.field264.method1632();
        this.field264.method1631((this.field269 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field293.length; var19++) {
            this.field293[var19].method666(field281, field285, false);
        }
        if (!this.field268.method2458(117)) {
            int var20 = this.field264.field3677;
            int var21 = this.field264.field3696;
            this.field264.method548(0, var21);
            this.field264.method501(var7, var6 - 4.0F);
            this.field264.method1631(false);
            this.field264.method1656(false);
            this.field264.method1657(130);
            this.field264.method1680(-2);
            this.field264.method1653(this.field264.field3754);
            this.field264.method1679(8448, 7681);
            this.field264.method1621(0, 34166, 770);
            this.field264.method1662(0, 34167, 770);
            for (class35 var22 = this.field268.method2456(32101); var22 != null; var22 = this.field268.method2461(301)) {
                class490 var23 = (class490) var22;
                var23.method2857(arg1, arg0, arg2, arg3, (byte) -22);
            }
            this.field264.method1621(0, 5890, 768);
            this.field264.method1662(0, 5890, 770);
            this.field264.method1653((class26) null);
            this.field264.method548(var20, var21);
        }
        if (this.field272 != null) {
            this.field264.method501(var7, var6 - 8.0F);
            this.field264.method1632();
            this.field264.method1674(this.field300, (class377) null, (class377) null, this.field296);
            this.field272.method2177(arg0, arg2, arg3, arg1, arg4, (byte) 44);
        }
        this.field264.method501(var7, var6);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
    public final int method204(int arg0, int arg1) {
        int var3 = arg0 >> this.field278;
        int var4 = arg1 >> this.field278;
        if (var3 < 0 || var4 < 0 || var3 > this.field686 - 1 || var4 > this.field690 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field286 - 1;
        int var6 = arg1 & this.field286 - 1;
        int var7 = (this.field286 - var5) * this.field267[var3][var4] + this.field267[var3 + 1][var4] * var5 >> this.field278;
        int var8 = (this.field286 - var5) * this.field267[var3][var4 + 1] + this.field267[var3 + 1][var4 + 1] * var5 >> this.field278;
        return (this.field286 - var6) * var7 + var6 * var8 >> this.field278;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method205(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field277 == null) {
            this.field277 = new int[this.field686][this.field690][];
        }
        if (arg3 != null && this.field279 == null) {
            this.field279 = new int[this.field686][this.field690][];
        }
        this.field270[arg0][arg1] = arg2;
        this.field265[arg0][arg1] = arg4;
        this.field273[arg0][arg1] = arg6;
        this.field274[arg0][arg1] = arg7;
        if (this.field277 != null) {
            this.field277[arg0][arg1] = arg5;
        }
        if (this.field279 != null) {
            this.field279[arg0][arg1] = arg3;
        }
        class80[] var15 = this.field271[arg0][arg1] = new class80[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class35 var19;
            for (var19 = this.field294.method2305(var17, (byte) 18); var19 != null; var19 = this.field294.method2306((byte) 21)) {
                class80 var20 = (class80) var19;
                if (arg8[var16] == var20.field1132 && (float) arg9[var16] == var20.field1130 && var20.field1124 == arg10 && var20.field1126 == arg11 && var20.field1125 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class80(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field294.method2307(var17, var15[var16], (byte) -126);
            } else {
                var15[var16] = (class80) var19;
            }
        }
        if (arg13) {
            this.field275[arg0][arg1] = (byte) (this.field275[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field297) {
            this.field297 = arg6.length;
        }
        this.field299 += arg6.length;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field299 <= 0) {
            return;
        }
        opengl var9 = this.field264.field3648;
        this.field264.method1682();
        this.field264.method1652(false);
        this.field264.method1631(false);
        this.field264.method1613(false);
        this.field264.method1656(false);
        this.field264.method1657(0);
        this.field264.method1680(-2);
        this.field264.method1653((class26) null);
        field282[0] = (float) arg2 / ((float) this.field286 * 128.0F * (float) this.field264.field3666);
        field282[1] = 0.0F;
        field282[2] = 0.0F;
        field282[3] = 0.0F;
        field282[4] = 0.0F;
        field282[5] = (float) arg2 / ((float) this.field286 * 128.0F * (float) this.field264.field3664);
        field282[6] = 0.0F;
        field282[7] = 0.0F;
        field282[8] = 0.0F;
        field282[9] = 0.0F;
        field282[10] = 0.0F;
        field282[11] = 0.0F;
        field282[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field264.field3666;
        field282[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field264.field3664;
        field282[14] = 0.0F;
        field282[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field282, 0);
        field282[0] = 1.0F;
        field282[1] = 0.0F;
        field282[2] = 0.0F;
        field282[3] = 0.0F;
        field282[4] = 0.0F;
        field282[5] = 0.0F;
        field282[6] = 1.0F;
        field282[7] = 0.0F;
        field282[8] = 0.0F;
        field282[9] = 1.0F;
        field282[10] = 0.0F;
        field282[11] = 0.0F;
        field282[12] = 0.0F;
        field282[13] = 0.0F;
        field282[14] = 0.0F;
        field282[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field282, 0);
        if ((this.field269 & 0x7) == 0) {
            this.field264.method1631(false);
        } else {
            this.field264.method1631(true);
            this.field264.method1623();
        }
        this.field264.method1674(this.field300, this.field298, this.field295, this.field296);
        if (field280.field6316.length < this.field266 * 2) {
            field280 = new class446(this.field266 * 2);
        } else {
            field280.field6315 = 0;
        }
        int var10 = 0;
        if (this.field264.field3742) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field686 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field283[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field280.method2592(var14[var15] & 0xFFFF, (byte) -110);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field686 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field283[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field280.method2623(var19[var20] & 0xFFFF, (byte) -66);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class289 var21 = new class289(this.field264, 5123, field280.field6316, field280.field6315);
            this.field264.method1664(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Lfq;IIIIZ)V")
    public final void method207(class87 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field272 != null && arg0 != null) {
            int var7 = arg1 - (this.field264.field3752 * arg2 >> 8) >> this.field264.field3665;
            int var8 = arg3 - (this.field264.field3704 * arg2 >> 8) >> this.field264.field3665;
            this.field272.method2178(arg0, var8, 7, var7);
        }
    }
}
