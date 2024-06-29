import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class448 extends class337 {

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "Lmi;")
    private class408 field6543 = new class408();

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "Lih;")
    public class330 field6521;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "[[I")
    private int[][] field6529;

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "[[I")
    private int[][] field6551;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public int field6523;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "I")
    public int field6522;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public int field6533;

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "[[[I")
    private int[][][] field6535;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "[[[Lre;")
    private class359[][][] field6528;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "[[[I")
    public int[][][] field6537;

    @OriginalMember(owner = "client!ms", name = "w", descriptor = "[[[I")
    public int[][][] field6531;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "[[[I")
    private int[][][] field6536;

    @OriginalMember(owner = "client!ms", name = "v", descriptor = "[[[I")
    private int[][][] field6530;

    @OriginalMember(owner = "client!ms", name = "H", descriptor = "[[S")
    public short[][] field6542;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "[[B")
    private byte[][] field6526;

    @OriginalMember(owner = "client!ms", name = "R", descriptor = "[[B")
    private byte[][] field6552;

    @OriginalMember(owner = "client!ms", name = "S", descriptor = "[[F")
    private float[][] field6553;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "[[F")
    private float[][] field6550;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "[[F")
    private float[][] field6546;

    @OriginalMember(owner = "client!ms", name = "W", descriptor = "Lsf;")
    private class143 field6557;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Lup;")
    private class441 field6534;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Lil;")
    public static class265 field6524 = new class265(1);

    @OriginalMember(owner = "client!ms", name = "x", descriptor = "[F")
    private static float[] field6532 = new float[16];

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "[I")
    private static int[] field6538 = new int[1];

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "[I")
    private static int[] field6539 = new int[1];

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "[I")
    private static int[] field6541 = new int[1];

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    private int field6525;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    private static int field6527;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    private int field6540;

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    private int field6547;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!ms", name = "V", descriptor = "Lcj;")
    private class182 field6556;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "Lam;")
    public class287 field6545;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "Lam;")
    public class287 field6548;

    @OriginalMember(owner = "client!ms", name = "T", descriptor = "Lam;")
    public class287 field6554;

    @OriginalMember(owner = "client!ms", name = "U", descriptor = "Lam;")
    private class287 field6555;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "[Lre;")
    private class359[] field6544;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 5)
    public final void method791(int arg0, int arg1, int arg2) {
        if ((this.field6552[arg0][arg1] & 0xFF) < arg2) {
            this.field6552[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "()V", line = 13)
    public final void method785() {
        if (this.field6549 > 0) {
            byte[][] var1 = new byte[this.field4978 + 1][this.field4970 + 1];
            for (int var2 = 1; var2 < this.field4978; var2++) {
                for (int var3 = 1; var3 < this.field4970; var3++) {
                    var1[var2][var3] = (byte) ((this.field6552[var2][var3] >> 1) + (this.field6552[var2][var3 + 1] >> 3) + (this.field6552[var2][var3 - 1] >> 2) + (this.field6552[var2 - 1][var3] >> 2) + (this.field6552[var2 + 1][var3] >> 3));
                }
            }
            this.field6544 = new class359[this.field6557.method955(17167)];
            this.field6557.method961(this.field6544, 0);
            for (int var4 = 0; var4 < this.field6544.length; var4++) {
                this.field6544[var4].method2359(this.field6549, 65535);
            }
            int var5 = 24;
            if (this.field6551 != null) {
                var5 += 4;
            }
            if ((this.field6523 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field6549 * var5).order(ByteOrder.nativeOrder());
            class359[] var7 = new class359[this.field6549];
            class143 var8 = new class143(class34.method278(this.field6549, (byte) 99));
            class359[] var9 = new class359[this.field6547];
            for (int var10 = 0; var10 < this.field4978; var10++) {
                for (int var11 = 0; var11 < this.field4970; var11++) {
                    if (this.field6536[var10][var11] != null) {
                        class359[] var12 = this.field6528[var10][var11];
                        int[] var13 = this.field6535[var10][var11];
                        int[] var14 = this.field6537[var10][var11];
                        int[] var15 = this.field6531[var10][var11];
                        int[] var16 = this.field6530[var10][var11];
                        int[] var17 = this.field6536[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field6553[var10][var11];
                        float var19 = this.field6550[var10][var11];
                        float var20 = this.field6546[var10][var11];
                        float var21 = this.field6553[var10][var11 + 1];
                        float var22 = this.field6550[var10][var11 + 1];
                        float var23 = this.field6546[var10][var11 + 1];
                        float var24 = this.field6553[var10 + 1][var11 + 1];
                        float var25 = this.field6550[var10 + 1][var11 + 1];
                        float var26 = this.field6546[var10 + 1][var11 + 1];
                        float var27 = this.field6553[var10 + 1][var11];
                        float var28 = this.field6550[var10 + 1][var11];
                        float var29 = this.field6546[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field6551 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field6551[var10][var11];
                            var35 = (float) this.field6551[var10][var11 + 1];
                            var36 = (float) this.field6551[var10 + 1][var11 + 1];
                            var37 = (float) this.field6551[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class359 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field6542[this.field4978 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field6522) + var14[var43];
                            int var45 = (var11 << this.field6522) + var15[var43];
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
                            } else if (var51 == 0 && this.field6533 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field6533 == var51 && this.field6533 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field6533 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field6533;
                                float var62 = (float) var52 / (float) this.field6533;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field6522) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field6522) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field6522) + var69);
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
                                var54 = class198.field2830[var46 & 0xFF80 | var73];
                                if ((this.field6523 & 0x7) == 0) {
                                    float var74 = this.field6521.field4805[2] * var58 + this.field6521.field4805[0] * var56 + this.field6521.field4805[1] * var57;
                                    var55 = this.field6521.field4844 + var74 * (var74 > 0.0F ? this.field6521.field4769 : this.field6521.field4826);
                                }
                            }
                            class393 var75 = var8.method954(-104, var49);
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
                                    var77 = class198.field2830[var47 & 0xFF80 | var76];
                                    if ((this.field6523 & 0x7) == 0) {
                                        float var78 = this.field6521.field4805[2] * var58 + this.field6521.field4805[0] * var56 + this.field6521.field4805[1] * var57;
                                        float var79 = this.field6521.field4844 + var55 * (var55 > 0.0F ? this.field6521.field4769 : this.field6521.field4826);
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
                                var6.putFloat((float) (this.method797(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field6551 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field6523 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field6525++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method956(false, var49, new class124(var42[var43]));
                            } else {
                                var42[var43] = ((class124) var75).field1652;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5903 < var7[var86].field5903) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method2361(var60, 106, var86, var54, var55);
                            }
                            this.field6540++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field6525; var88++) {
                class359 var89 = var7[var88];
                if (var89 != null) {
                    var89.method2356(-105, var88);
                }
            }
            for (int var90 = 0; var90 < this.field4978; var90++) {
                for (int var91 = 0; var91 < this.field4970; var91++) {
                    short[] var92 = this.field6542[this.field4978 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class359 var98 = var7[var95];
                            class359 var99 = var7[var96];
                            class359 var100 = var7[var97];
                            class359 var101 = null;
                            if (var98 != null) {
                                var98.method2357(1, var93, var90, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method2357(1, var93, var90, var91);
                                if (var101 == null || var99.field5903 < var101.field5903) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method2357(1, var93, var90, var91);
                                if (var101 == null || var100.field5903 < var101.field5903) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method2356(-97, var95);
                                }
                                if (var99 != null) {
                                    var101.method2356(-73, var96);
                                }
                                if (var100 != null) {
                                    var101.method2356(-96, var97);
                                }
                                var101.method2357(1, var93, var90, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field6556 = this.field6521.method2043(var5, var6, false);
            this.field6554 = new class287(this.field6521, this.field6556, 5126, 3, 0);
            this.field6555 = new class287(this.field6521, this.field6556, 5121, 4, 12);
            byte var102;
            if (this.field6551 == null) {
                this.field6545 = new class287(this.field6521, this.field6556, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field6545 = new class287(this.field6521, this.field6556, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field6523 & 0x7) != 0) {
                this.field6548 = new class287(this.field6521, this.field6556, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field6544.length];
            for (int var104 = 0; var104 < this.field6544.length; var104++) {
                class359 var105 = this.field6544[var104];
                var103[var104] = var105.field5903;
                var105.method2360(this.field6525, 120);
            }
            class348.method2315(this.field6544, 0, var103);
            if (this.field6534 != null) {
                this.field6534.method2788(-17567);
            }
        } else {
            this.field6534 = null;
        }
        this.field6537 = this.field6531 = (int[][][]) null;
        this.field6530 = (int[][][]) null;
        this.field6535 = (int[][][]) null;
        this.field6528 = (class359[][][]) null;
        this.field6536 = (int[][][]) null;
        this.field6552 = (byte[][]) null;
        this.field6557 = null;
        this.field6551 = (int[][]) null;
        this.field6553 = this.field6550 = this.field6546 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)I", line = 550)
    public final int method781(int arg0, int arg1) {
        return this.field6529[arg0][arg1];
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 561)
    public final void method793(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method779(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lfe;[I)V", line = 628)
    public final void method795(class403 arg0, int[] arg1) {
        this.field6543.method2660((byte) -125, new class429(this.field6521, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII[[Z)V", line = 633)
    public final void method780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field6549 <= 0) {
            return;
        }
        opengl var9 = this.field6521.field4741;
        this.field6521.method2126();
        this.field6521.method2157(false);
        this.field6521.method2134(false);
        this.field6521.method2061(false);
        this.field6521.method2184(false);
        this.field6521.method2044(0);
        this.field6521.method2127(-2);
        this.field6521.method2186((class223) null);
        field6532[0] = (float) arg2 / ((float) this.field6533 * 128.0F * (float) this.field6521.field4760);
        field6532[1] = 0.0F;
        field6532[2] = 0.0F;
        field6532[3] = 0.0F;
        field6532[4] = 0.0F;
        field6532[5] = (float) arg2 / ((float) this.field6533 * 128.0F * (float) this.field6521.field4755);
        field6532[6] = 0.0F;
        field6532[7] = 0.0F;
        field6532[8] = 0.0F;
        field6532[9] = 0.0F;
        field6532[10] = 0.0F;
        field6532[11] = 0.0F;
        field6532[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6521.field4760;
        field6532[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6521.field4755;
        field6532[14] = 0.0F;
        field6532[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field6532, 0);
        field6532[0] = 1.0F;
        field6532[1] = 0.0F;
        field6532[2] = 0.0F;
        field6532[3] = 0.0F;
        field6532[4] = 0.0F;
        field6532[5] = 0.0F;
        field6532[6] = 1.0F;
        field6532[7] = 0.0F;
        field6532[8] = 0.0F;
        field6532[9] = 1.0F;
        field6532[10] = 0.0F;
        field6532[11] = 0.0F;
        field6532[12] = 0.0F;
        field6532[13] = 0.0F;
        field6532[14] = 0.0F;
        field6532[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field6532, 0);
        if ((this.field6523 & 0x7) == 0) {
            this.field6521.method2134(false);
        } else {
            this.field6521.method2134(true);
            this.field6521.method2189();
        }
        this.field6521.method2087(this.field6554, this.field6548, this.field6555, this.field6545);
        if (field6524.field3879.length < this.field6540 * 2) {
            field6524 = new class265(this.field6540 * 2);
        } else {
            field6524.field3915 = 0;
        }
        int var10 = 0;
        if (this.field6521.field4797) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field4978 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field6542[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field6524.method1693(var14[var15], (byte) 55);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field4978 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field6542[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field6524.method1715(677910600, var19[var20]);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            this.field6521.field4867.method1354(5123, field6524.field3879, field6524.field3915);
            this.field6521.method2100(this.field6521.field4867, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lek;II)V", line = 794)
    private final void method2815(class267 arg0, int arg1, int arg2) {
        int[] var4 = this.field6537[arg1][arg2];
        int[] var5 = this.field6531[arg1][arg2];
        int var6 = var4.length;
        if (field6541.length < var6) {
            field6541 = new int[var6];
            field6538 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field6541[var7] = (var4[var7] & 0xFF) >> this.field6521.field4758;
            field6538[var7] = (var5[var7] & 0xFF) >> this.field6521.field4758;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field6541[var8];
            int var10 = field6538[var8++];
            int var11 = field6541[var8];
            int var12 = field6538[var8++];
            int var13 = field6541[var8];
            int var14 = field6538[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1729(var13, var9, var10, var12, -113, var14, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILoc;)Loc;", line = 844)
    public final class93 method784(int arg0, int arg1, class93 arg2) {
        if ((this.field6526[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field6533 >> this.field6521.field4758;
        class267 var5 = (class267) arg2;
        class267 var6;
        if (var5 != null && var5.method1726(var4, true, var4)) {
            var6 = var5;
            var5.method1728(110);
        } else {
            var6 = new class267(this.field6521, var4, var4);
        }
        var6.method1725((byte) -40, var4, 0, 0, var4);
        this.method2815(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 874)
    public final void method779(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field6535[arg0][arg1] = arg3;
        this.field6537[arg0][arg1] = arg2;
        this.field6531[arg0][arg1] = arg4;
        this.field6536[arg0][arg1] = arg5;
        this.field6530[arg0][arg1] = arg6;
        class359[] var13 = this.field6528[arg0][arg1] = new class359[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class393 var17 = this.field6557.method954(-121, var15);
            if (var17 == null) {
                var13[var14] = new class359(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field6557.method956(false, var15, var13[var14]);
            } else {
                var13[var14] = (class359) var17;
            }
        }
        if (arg11) {
            this.field6526[arg0][arg1] = (byte) (this.field6526[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field6547) {
            this.field6547 = arg5.length;
        }
        this.field6549 += arg5.length;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(Loc;IIIIZ)V", line = 911)
    public final void method787(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6534 != null && arg0 != null) {
            int var7 = arg1 - (this.field6521.field4804 * arg2 >> 8) >> this.field6521.field4758;
            int var8 = arg3 - (this.field6521.field4831 * arg2 >> 8) >> this.field6521.field4758;
            this.field6534.method2782(var7, arg0, -1, var8);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Loc;IIIIZ)V", line = 926)
    public final void method783(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6534 != null && arg0 != null) {
            int var7 = arg1 - (this.field6521.field4804 * arg2 >> 8) >> this.field6521.field4758;
            int var8 = arg3 - (this.field6521.field4831 * arg2 >> 8) >> this.field6521.field4758;
            this.field6534.method2785(var7, arg0, -1, var8);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III[[ZZ)V", line = 940)
    public final void method790(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field6544 == null) {
            return;
        }
        float var6 = this.field6521.field4850;
        float var7 = this.field6521.field4821;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field6539.length < var9) {
            field6539 = new int[var9];
        }
        if (field6524.field3879.length < this.field6540 * 2) {
            field6524 = new class265(this.field6540 * 2);
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
        if (var14 > this.field4978 - 1) {
            var14 = this.field4978 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field4970 - 1) {
            var15 = this.field4970 - 1;
        }
        field6527 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field6539[field6527++] = this.field4978 * var18 + var16;
                }
            }
        }
        this.field6521.method2140();
        this.field6521.method2134((this.field6523 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field6544.length; var19++) {
            this.field6544[var19].method2358(field6539, field6527, 21873);
        }
        if (!this.field6543.method2657(127)) {
            int var20 = this.field6521.field4824;
            int var21 = this.field6521.field4790;
            this.field6521.method2102(0, var21);
            this.field6521.method2107(var7, var6 - 4.0F);
            this.field6521.method2134(false);
            this.field6521.method2184(false);
            this.field6521.method2044(130);
            this.field6521.method2127(-2);
            this.field6521.method2186(this.field6521.field4838);
            this.field6521.method2109(8448, 7681);
            this.field6521.method2072(0, 34166, 770);
            this.field6521.method2029(0, 34167, 770);
            for (class393 var22 = this.field6543.method2649(0); var22 != null; var22 = this.field6543.method2656(0)) {
                class429 var23 = (class429) var22;
                var23.method2740(arg0, arg2, arg3, (byte) -29, arg1);
            }
            this.field6521.method2072(0, 5890, 768);
            this.field6521.method2029(0, 5890, 770);
            this.field6521.method2186((class223) null);
            this.field6521.method2102(var20, var21);
        }
        if (this.field6534 != null) {
            this.field6521.method2107(var7, var6 - 8.0F);
            this.field6521.method2140();
            this.field6521.method2087(this.field6554, (class287) null, (class287) null, this.field6545);
            this.field6534.method2787(arg2, 5888, arg0, arg4, arg3, arg1);
        }
        this.field6521.method2107(var7, var6);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lih;IIII[[I[[II)V", line = 1068)
    public class448(class330 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field6521 = arg0;
        this.field6529 = arg5;
        this.field6551 = arg6;
        this.field6523 = arg2;
        while (arg7 > 1) {
            this.field6522++;
            arg7 >>= 0x1;
        }
        this.field6533 = 0x1 << this.field6522;
        this.field6535 = new int[arg3][arg4][];
        this.field6528 = new class359[arg3][arg4][];
        this.field6537 = new int[arg3][arg4][];
        this.field6531 = new int[arg3][arg4][];
        this.field6536 = new int[arg3][arg4][];
        this.field6530 = new int[arg3][arg4][];
        this.field6542 = new short[arg3 * arg4][];
        this.field6526 = new byte[arg3][arg4];
        this.field6552 = new byte[arg3 + 1][arg4 + 1];
        this.field6553 = new float[arg3 + 1][arg4 + 1];
        this.field6550 = new float[arg3 + 1][arg4 + 1];
        this.field6546 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field6529[var10 + 1][var9] - this.field6529[var10 - 1][var9];
                int var12 = this.field6529[var10][var9 + 1] - this.field6529[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field6553[var10][var9] = (float) var11 * var13;
                this.field6550[var10][var9] = var13 * -256.0F;
                this.field6546[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6557 = new class143(128);
        if ((this.field6523 & 0x10) != 0) {
            this.field6534 = new class441(this.field6521, this);
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(II)V", line = 1134)
    public final void method786(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Loc;IIIIZ)Z", line = 1141)
    public final boolean method778(class93 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6534 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field6521.field4804 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field6521.field4831 * arg2 >> 8) >> 3;
            return this.field6534.method2783(var7, -1, var8, arg0);
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)I", line = 1154)
    public final int method797(int arg0, int arg1) {
        int var3 = arg0 >> this.field6522;
        int var4 = arg1 >> this.field6522;
        if (var3 < 0 || var4 < 0 || var3 > this.field4978 - 1 || var4 > this.field4970 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field6533 - 1;
        int var6 = arg1 & this.field6533 - 1;
        int var7 = (this.field6533 - var5) * this.field6529[var3][var4] + this.field6529[var3 + 1][var4] * var5 >> this.field6522;
        int var8 = (this.field6533 - var5) * this.field6529[var3][var4 + 1] + this.field6529[var3 + 1][var4 + 1] * var5 >> this.field6522;
        return (this.field6533 - var6) * var7 + var6 * var8 >> this.field6522;
    }
}
