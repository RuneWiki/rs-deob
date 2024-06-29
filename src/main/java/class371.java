import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class371 extends class351 {

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "Lar;")
    private class47 field5375 = new class47();

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "Lnf;")
    public class256 field5383;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "[[I")
    private int[][] field5373;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "[[I")
    private int[][] field5406;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public int field5380;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "[[[I")
    private int[][][] field5393;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[[[Lmd;")
    private class357[][][] field5382;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[[[I")
    public int[][][] field5392;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[[[I")
    public int[][][] field5372;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "[[[I")
    private int[][][] field5381;

    @OriginalMember(owner = "client!kk", name = "w", descriptor = "[[[I")
    private int[][][] field5386;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "[[S")
    public short[][] field5374;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "[[B")
    private byte[][] field5377;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "[[B")
    private byte[][] field5398;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "[[F")
    private float[][] field5407;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "[[F")
    private float[][] field5408;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "[[F")
    private float[][] field5409;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "Lvk;")
    private class56 field5400;

    @OriginalMember(owner = "client!kk", name = "v", descriptor = "Lom;")
    private class128 field5385;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "Lnj;")
    public static class228 field5379 = new class228(1);

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[I")
    private static int[] field5390 = new int[1];

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "[I")
    private static int[] field5384 = new int[1];

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "[I")
    private static int[] field5394 = new int[1];

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "[F")
    private static float[] field5391 = new float[16];

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private int field5376;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    private int field5387;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "I")
    private static int field5389;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    private int field5403;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Lgm;")
    private class336 field5395;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "Lgm;")
    private class336 field5401;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Lgm;")
    private class336 field5402;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "Lgm;")
    private class336 field5404;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Lgm;")
    private class336 field5405;

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "Lna;")
    private class50 field5397;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "[Lmd;")
    private class357[] field5396;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lwc;[I)V")
    public final void method738(class367 arg0, int[] arg1) {
        this.field5375.method330(new class154(this.field5383, this, arg0, arg1), -2130841184);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lri;IIIIZ)V")
    public final void method757(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5385 != null && arg0 != null) {
            int var7 = arg1 - (this.field5383.field3671 * arg2 >> 8) >> this.field5383.field3650;
            int var8 = arg3 - (this.field5383.field3691 * arg2 >> 8) >> this.field5383.field3650;
            this.field5385.method810(var7, var8, arg0, false);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
    public final void method746(int arg0, int arg1, int arg2) {
        if ((this.field5398[arg0][arg1] & 0xFF) < arg2) {
            this.field5398[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()V")
    public final void method744() {
        if (this.field5403 > 0) {
            byte[][] var1 = new byte[this.field5084 + 1][this.field5085 + 1];
            for (int var2 = 1; var2 < this.field5084; var2++) {
                for (int var3 = 1; var3 < this.field5085; var3++) {
                    var1[var2][var3] = (byte) ((this.field5398[var2][var3] >> 1) + (this.field5398[var2][var3 + 1] >> 3) + (this.field5398[var2][var3 - 1] >> 2) + (this.field5398[var2 - 1][var3] >> 2) + (this.field5398[var2 + 1][var3] >> 3));
                }
            }
            this.field5396 = new class357[this.field5400.method383(0)];
            this.field5400.method385((byte) -99, this.field5396);
            for (int var4 = 0; var4 < this.field5396.length; var4++) {
                this.field5396[var4].method2340((byte) 82, this.field5403);
            }
            int var5 = 24;
            if (this.field5406 != null) {
                var5 += 4;
            }
            if ((this.field5388 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field5403 * var5).order(ByteOrder.nativeOrder());
            class357[] var7 = new class357[this.field5403];
            class56 var8 = new class56(class298.method2043(this.field5403, -122));
            class357[] var9 = new class357[this.field5399];
            for (int var10 = 0; var10 < this.field5084; var10++) {
                for (int var11 = 0; var11 < this.field5085; var11++) {
                    if (this.field5381[var10][var11] != null) {
                        class357[] var12 = this.field5382[var10][var11];
                        int[] var13 = this.field5393[var10][var11];
                        int[] var14 = this.field5392[var10][var11];
                        int[] var15 = this.field5372[var10][var11];
                        int[] var16 = this.field5386[var10][var11];
                        int[] var17 = this.field5381[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field5407[var10][var11];
                        float var19 = this.field5408[var10][var11];
                        float var20 = this.field5409[var10][var11];
                        float var21 = this.field5407[var10][var11 + 1];
                        float var22 = this.field5408[var10][var11 + 1];
                        float var23 = this.field5409[var10][var11 + 1];
                        float var24 = this.field5407[var10 + 1][var11 + 1];
                        float var25 = this.field5408[var10 + 1][var11 + 1];
                        float var26 = this.field5409[var10 + 1][var11 + 1];
                        float var27 = this.field5407[var10 + 1][var11];
                        float var28 = this.field5408[var10 + 1][var11];
                        float var29 = this.field5409[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field5406 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field5406[var10][var11];
                            var35 = (float) this.field5406[var10][var11 + 1];
                            var36 = (float) this.field5406[var10 + 1][var11 + 1];
                            var37 = (float) this.field5406[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label303: for (int var39 = 0; var39 < var17.length; var39++) {
                            class357 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label303;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field5374[this.field5084 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field5378) + var14[var43];
                            int var45 = (var11 << this.field5378) + var15[var43];
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
                            } else if (var51 == 0 && this.field5380 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field5380 == var51 && this.field5380 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field5380 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field5380;
                                float var62 = (float) var52 / (float) this.field5380;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field5378) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field5378) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field5378) + var69);
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
                                var54 = class291.field4168[var46 & 0xFF80 | var73];
                                if ((this.field5388 & 0x7) == 0) {
                                    float var74 = this.field5383.field3703[2] * var58 + this.field5383.field3703[0] * var56 + this.field5383.field3703[1] * var57;
                                    var55 = this.field5383.field3680 + var74 * (var74 > 0.0F ? this.field5383.field3669 : this.field5383.field3745);
                                }
                            }
                            class45 var75 = var8.method384(var49, true);
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
                                    var77 = class291.field4168[var47 & 0xFF80 | var76];
                                    if ((this.field5388 & 0x7) == 0) {
                                        float var78 = this.field5383.field3703[2] * var58 + this.field5383.field3703[0] * var56 + this.field5383.field3703[1] * var57;
                                        float var79 = this.field5383.field3680 + var55 * (var55 > 0.0F ? this.field5383.field3669 : this.field5383.field3745);
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
                                var6.putFloat((float) (this.method745(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                if ((this.field5388 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                if (this.field5406 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                var86 = this.field5376++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method381(true, new class115(var42[var43]), var49);
                            } else {
                                var42[var43] = ((class115) var75).field1608;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field640 < var7[var86].field640) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method2341(var54, var55, var60, var86, false);
                            }
                            this.field5387++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field5376; var88++) {
                class357 var89 = var7[var88];
                if (var89 != null) {
                    var89.method2344(106, var88);
                }
            }
            for (int var90 = 0; var90 < this.field5084; var90++) {
                for (int var91 = 0; var91 < this.field5085; var91++) {
                    short[] var92 = this.field5374[this.field5084 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class357 var98 = var7[var95];
                            class357 var99 = var7[var96];
                            class357 var100 = var7[var97];
                            class357 var101 = null;
                            if (var98 != null) {
                                var98.method2343(var90, 27616, var91, var93);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method2343(var90, 27616, var91, var93);
                                if (var101 == null || var99.field640 < var101.field640) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method2343(var90, 27616, var91, var93);
                                if (var101 == null || var100.field640 < var101.field640) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method2344(-115, var95);
                                }
                                if (var99 != null) {
                                    var101.method2344(-74, var96);
                                }
                                if (var100 != null) {
                                    var101.method2344(47, var97);
                                }
                                var101.method2343(var90, 27616, var91, var93);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field5397 = this.field5383.method1629(var5, var6, false);
            int var102 = 24;
            this.field5401 = new class336(this.field5383, this.field5397, 5126, 3, 0);
            this.field5395 = new class336(this.field5383, this.field5397, 5126, 2, 12);
            this.field5402 = new class336(this.field5383, this.field5397, 5121, 4, 20);
            if ((this.field5388 & 0x7) != 0) {
                this.field5405 = new class336(this.field5383, this.field5397, 5126, 3, var102);
                var102 += 12;
            }
            if (this.field5406 != null) {
                this.field5404 = new class336(this.field5383, this.field5397, 5126, 1, var102);
                var102 += 4;
            }
            long[] var103 = new long[this.field5396.length];
            for (int var104 = 0; var104 < this.field5396.length; var104++) {
                class357 var105 = this.field5396[var104];
                var103[var104] = var105.field640;
                var105.method2342(this.field5376, 3);
            }
            class410.method2631(var103, this.field5396, -1);
            if (this.field5385 != null) {
                this.field5385.method813(-85);
            }
        } else {
            this.field5385 = null;
        }
        this.field5392 = this.field5372 = (int[][][]) null;
        this.field5386 = (int[][][]) null;
        this.field5393 = (int[][][]) null;
        this.field5382 = (class357[][][]) null;
        this.field5381 = (int[][][]) null;
        this.field5398 = (byte[][]) null;
        this.field5400 = null;
        this.field5406 = (int[][]) null;
        this.field5407 = this.field5408 = this.field5409 = (float[][]) null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lnf;IIII[[I[[II)V")
    public class371(class256 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field5383 = arg0;
        this.field5373 = arg5;
        this.field5406 = arg6;
        this.field5388 = arg2;
        while (arg7 > 1) {
            this.field5378++;
            arg7 >>= 0x1;
        }
        this.field5380 = 0x1 << this.field5378;
        this.field5393 = new int[arg3][arg4][];
        this.field5382 = new class357[arg3][arg4][];
        this.field5392 = new int[arg3][arg4][];
        this.field5372 = new int[arg3][arg4][];
        this.field5381 = new int[arg3][arg4][];
        this.field5386 = new int[arg3][arg4][];
        this.field5374 = new short[arg3 * arg4][];
        this.field5377 = new byte[arg3][arg4];
        this.field5398 = new byte[arg3 + 1][arg4 + 1];
        this.field5407 = new float[arg3 + 1][arg4 + 1];
        this.field5408 = new float[arg3 + 1][arg4 + 1];
        this.field5409 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field5373[var10 + 1][var9] - this.field5373[var10 - 1][var9];
                int var12 = this.field5373[var10][var9 + 1] - this.field5373[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field5407[var10][var9] = (float) var11 * var13;
                this.field5408[var10][var9] = var13 * -256.0F;
                this.field5409[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5400 = new class56(128);
        if ((this.field5388 & 0x10) != 0) {
            this.field5385 = new class128(this.field5383, this);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method748(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method750(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILri;)Lri;")
    public final class98 method756(int arg0, int arg1, class98 arg2) {
        if ((this.field5377[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field5380 >> this.field5383.field3650;
        class132 var5 = (class132) arg2;
        class132 var6;
        if (var5 != null && var5.method834(var4, (byte) 121, var4)) {
            var6 = var5;
            var5.method832(false);
        } else {
            var6 = new class132(this.field5383, var4, var4);
        }
        var6.method830(0, var4, (byte) -112, 0, var4);
        this.method2408(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method750(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field5393[arg0][arg1] = arg3;
        this.field5392[arg0][arg1] = arg2;
        this.field5372[arg0][arg1] = arg4;
        this.field5381[arg0][arg1] = arg5;
        this.field5386[arg0][arg1] = arg6;
        class357[] var13 = this.field5382[arg0][arg1] = new class357[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class45 var17 = this.field5400.method384(var15, true);
            if (var17 == null) {
                var13[var14] = new class357(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field5400.method381(true, var13[var14], var15);
            } else {
                var13[var14] = (class357) var17;
            }
        }
        if (arg11) {
            this.field5377[arg0][arg1] = (byte) (this.field5377[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field5399) {
            this.field5399 = arg5.length;
        }
        this.field5403 += arg5.length;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public final int method745(int arg0, int arg1) {
        int var3 = arg0 >> this.field5378;
        int var4 = arg1 >> this.field5378;
        if (var3 < 0 || var4 < 0 || var3 > this.field5084 - 1 || var4 > this.field5085 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field5380 - 1;
        int var6 = arg1 & this.field5380 - 1;
        int var7 = (this.field5380 - var5) * this.field5373[var3][var4] + this.field5373[var3 + 1][var4] * var5 >> this.field5378;
        int var8 = (this.field5380 - var5) * this.field5373[var3][var4 + 1] + this.field5373[var3 + 1][var4 + 1] * var5 >> this.field5378;
        return (this.field5380 - var6) * var7 + var6 * var8 >> this.field5378;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field5403 <= 0) {
            return;
        }
        opengl var9 = this.field5383.field3634;
        this.field5383.method1677();
        this.field5383.method1674(false);
        this.field5383.method1636(false);
        this.field5383.method1754(false);
        this.field5383.method1667(false);
        this.field5383.method1701(0);
        this.field5383.method1722(-2);
        this.field5383.method1669((class360) null);
        field5391[0] = (float) arg2 / ((float) this.field5380 * 128.0F * (float) this.field5383.field3646);
        field5391[1] = 0.0F;
        field5391[2] = 0.0F;
        field5391[3] = 0.0F;
        field5391[4] = 0.0F;
        field5391[5] = (float) arg2 / ((float) this.field5380 * 128.0F * (float) this.field5383.field3648);
        field5391[6] = 0.0F;
        field5391[7] = 0.0F;
        field5391[8] = 0.0F;
        field5391[9] = 0.0F;
        field5391[10] = 0.0F;
        field5391[11] = 0.0F;
        field5391[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5383.field3646;
        field5391[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5383.field3648;
        field5391[14] = 0.0F;
        field5391[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field5391, 0);
        field5391[0] = 1.0F;
        field5391[1] = 0.0F;
        field5391[2] = 0.0F;
        field5391[3] = 0.0F;
        field5391[4] = 0.0F;
        field5391[5] = 0.0F;
        field5391[6] = 1.0F;
        field5391[7] = 0.0F;
        field5391[8] = 0.0F;
        field5391[9] = 1.0F;
        field5391[10] = 0.0F;
        field5391[11] = 0.0F;
        field5391[12] = 0.0F;
        field5391[13] = 0.0F;
        field5391[14] = 0.0F;
        field5391[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field5391, 0);
        this.field5383.method1633();
        this.field5383.method1718();
        this.field5383.method1635(this.field5402);
        this.field5383.method1651(this.field5401);
        this.field5383.method1760(0, this.field5395);
        if ((this.field5388 & 0x7) == 0) {
            this.field5383.method1636(false);
        } else {
            this.field5383.method1657(this.field5405);
            this.field5383.method1636(true);
        }
        if (field5379.field3040.length < this.field5387 * 2) {
            field5379 = new class228(this.field5387 * 2);
        } else {
            field5379.field3029 = 0;
        }
        int var10 = 0;
        if (this.field5383.field3663) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field5084 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field5374[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field5379.method1326(var14[var15], -103);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field5084 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field5374[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field5379.method1359((byte) -105, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field5383.field3757.method141(5123, field5379.field3040, field5379.field3029);
            this.field5383.method1668(this.field5383.field3757, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
    public final int method742(int arg0, int arg1) {
        return this.field5373[arg0][arg1];
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lgr;II)V")
    private final void method2408(class132 arg0, int arg1, int arg2) {
        int[] var4 = this.field5392[arg1][arg2];
        int[] var5 = this.field5372[arg1][arg2];
        int var6 = var4.length;
        if (field5394.length < var6) {
            field5394 = new int[var6];
            field5384 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field5394[var7] = (var4[var7] & 0xFF) >> this.field5383.field3650;
            field5384[var7] = (var5[var7] & 0xFF) >> this.field5383.field3650;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field5394[var8];
            int var10 = field5384[var8++];
            int var11 = field5394[var8];
            int var12 = field5384[var8++];
            int var13 = field5394[var8];
            int var14 = field5384[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method831(var12, var13, var14, var9, -10722, var11, var10);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method741(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field5396 == null) {
            return;
        }
        float var6 = this.field5383.field3692;
        float var7 = this.field5383.field3665;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field5390.length < var9) {
            field5390 = new int[var9];
        }
        if (field5379.field3040.length < this.field5387 * 2) {
            field5379 = new class228(this.field5387 * 2);
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
        if (var14 > this.field5084 - 1) {
            var14 = this.field5084 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field5085 - 1) {
            var15 = this.field5085 - 1;
        }
        field5389 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field5390[field5389++] = this.field5084 * var18 + var16;
                }
            }
        }
        this.field5383.method1622();
        this.field5383.method1718();
        this.field5383.method1651(this.field5401);
        if (this.field5404 != null) {
            this.field5383.method1760(1, this.field5404);
        }
        this.field5383.method1760(0, this.field5395);
        if ((this.field5388 & 0x7) == 0) {
            this.field5383.method1636(false);
        } else {
            this.field5383.method1657(this.field5405);
            this.field5383.method1636(true);
        }
        for (int var19 = 0; var19 < this.field5396.length; var19++) {
            this.field5396[var19].method2339(field5390, field5389, (byte) 58);
        }
        if (!this.field5375.method338(16091)) {
            int var20 = this.field5383.field3728;
            int var21 = this.field5383.field3761;
            this.field5383.method1788(0, var21);
            this.field5383.method1737(var7, var6 - 4.0F);
            this.field5383.method1636(false);
            this.field5383.method1667(false);
            this.field5383.method1701(130);
            this.field5383.method1722(-2);
            this.field5383.method1669(this.field5383.field3754);
            this.field5383.method1627(8448, 7681);
            this.field5383.method1634(0, 34166, 770);
            this.field5383.method1763(0, 34167, 770);
            for (class45 var22 = this.field5375.method332(-2130841184); var22 != null; var22 = this.field5375.method343((byte) -128)) {
                class154 var23 = (class154) var22;
                var23.method964(arg2, arg1, arg0, arg3, (byte) -102);
            }
            this.field5383.method1634(0, 5890, 768);
            this.field5383.method1763(0, 5890, 770);
            this.field5383.method1669((class360) null);
            this.field5383.method1788(var20, var21);
        }
        if (this.field5385 != null) {
            this.field5383.method1737(var7, var6 - 8.0F);
            this.field5383.method1622();
            this.field5383.method1718();
            this.field5383.method1651(this.field5401);
            this.field5383.method1760(0, this.field5395);
            this.field5385.method807(arg3, 5890, arg1, arg2, arg0, arg4);
        }
        this.field5383.method1737(var7, var6);
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(II)V")
    public final void method752(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lri;IIIIZ)V")
    public final void method739(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5385 != null && arg0 != null) {
            int var7 = arg1 - (this.field5383.field3671 * arg2 >> 8) >> this.field5383.field3650;
            int var8 = arg3 - (this.field5383.field3691 * arg2 >> 8) >> this.field5383.field3650;
            this.field5385.method814(true, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lri;IIIIZ)Z")
    public final boolean method743(class98 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5385 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field5383.field3671 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field5383.field3691 * arg2 >> 8) >> 3;
            return this.field5385.method812(true, var8, var7, arg0);
        }
    }
}
