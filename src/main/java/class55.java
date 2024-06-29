import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class55 extends class92 {

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Lkn;")
    private class442 field706 = new class442();

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lig;")
    public class132 field707;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "[[I")
    private int[][] field713;

    @OriginalMember(owner = "client!er", name = "U", descriptor = "[[I")
    private int[][] field741;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public int field719;

    @OriginalMember(owner = "client!er", name = "z", descriptor = "I")
    public int field722;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public int field712;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "[[[I")
    private int[][][] field715;

    @OriginalMember(owner = "client!er", name = "B", descriptor = "[[[Lqs;")
    private class360[][][] field724;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "[[[I")
    public int[][][] field708;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "[[[I")
    public int[][][] field711;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "[[[I")
    private int[][][] field716;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "[[[I")
    private int[][][] field709;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "[[S")
    public short[][] field717;

    @OriginalMember(owner = "client!er", name = "y", descriptor = "[[B")
    private byte[][] field721;

    @OriginalMember(owner = "client!er", name = "T", descriptor = "[[B")
    private byte[][] field740;

    @OriginalMember(owner = "client!er", name = "S", descriptor = "[[F")
    private float[][] field739;

    @OriginalMember(owner = "client!er", name = "V", descriptor = "[[F")
    private float[][] field742;

    @OriginalMember(owner = "client!er", name = "N", descriptor = "[[F")
    private float[][] field735;

    @OriginalMember(owner = "client!er", name = "I", descriptor = "Ldj;")
    private class191 field730;

    @OriginalMember(owner = "client!er", name = "C", descriptor = "Lwd;")
    private class149 field725;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Llf;")
    public static class130 field718 = new class130(1);

    @OriginalMember(owner = "client!er", name = "E", descriptor = "[I")
    private static int[] field727 = new int[1];

    @OriginalMember(owner = "client!er", name = "A", descriptor = "[I")
    private static int[] field723 = new int[1];

    @OriginalMember(owner = "client!er", name = "D", descriptor = "[F")
    private static float[] field726 = new float[16];

    @OriginalMember(owner = "client!er", name = "G", descriptor = "[I")
    private static int[] field728 = new int[1];

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    private int field714;

    @OriginalMember(owner = "client!er", name = "x", descriptor = "I")
    private static int field720;

    @OriginalMember(owner = "client!er", name = "L", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!er", name = "Q", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!er", name = "H", descriptor = "Lwi;")
    private class273 field729;

    @OriginalMember(owner = "client!er", name = "J", descriptor = "Lwi;")
    public class273 field731;

    @OriginalMember(owner = "client!er", name = "K", descriptor = "Lwi;")
    public class273 field732;

    @OriginalMember(owner = "client!er", name = "M", descriptor = "Lwi;")
    public class273 field734;

    @OriginalMember(owner = "client!er", name = "R", descriptor = "Lmp;")
    private class454 field738;

    @OriginalMember(owner = "client!er", name = "P", descriptor = "[Lqs;")
    private class360[] field736;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method349(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method350(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field715[arg0][arg1] = arg3;
        this.field708[arg0][arg1] = arg2;
        this.field711[arg0][arg1] = arg4;
        this.field716[arg0][arg1] = arg5;
        this.field709[arg0][arg1] = arg6;
        class360[] var13 = this.field724[arg0][arg1] = new class360[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class425 var17 = this.field730.method1373(var15, -15);
            if (var17 == null) {
                var13[var14] = new class360(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field730.method1376(var13[var14], var15, 105);
            } else {
                var13[var14] = (class360) var17;
            }
        }
        if (arg11) {
            this.field721[arg0][arg1] = (byte) (this.field721[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field733) {
            this.field733 = arg5.length;
        }
        this.field737 += arg5.length;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILo;)Lo;")
    public final class21 method351(int arg0, int arg1, class21 arg2) {
        if ((this.field721[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field712 >> this.field707.field1933;
        class67 var5 = (class67) arg2;
        class67 var6;
        if (var5 != null && var5.method422(var4, var4, 0)) {
            var6 = var5;
            var5.method421((byte) -110);
        } else {
            var6 = new class67(this.field707, var4, var4);
        }
        var6.method418(0, true, var4, var4, 0);
        this.method356(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(Lo;IIIIZ)V")
    public final void method352(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field725 != null && arg0 != null) {
            int var7 = arg1 - (this.field707.field1960 * arg2 >> 8) >> this.field707.field1933;
            int var8 = arg3 - (this.field707.field1997 * arg2 >> 8) >> this.field707.field1933;
            this.field725.method1108(arg0, var7, var8, 1);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lpc;[I)V")
    public final void method353(class402 arg0, int[] arg1) {
        this.field706.method2756(-87, new class49(this.field707, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field737 <= 0) {
            return;
        }
        opengl var9 = this.field707.field1918;
        this.field707.method979();
        this.field707.method942(false);
        this.field707.method996(false);
        this.field707.method938(false);
        this.field707.method969(false);
        this.field707.method972(0);
        this.field707.method977(-2);
        this.field707.method888((class404) null);
        field726[0] = (float) arg2 / ((float) this.field712 * 128.0F * (float) this.field707.field1937);
        field726[1] = 0.0F;
        field726[2] = 0.0F;
        field726[3] = 0.0F;
        field726[4] = 0.0F;
        field726[5] = (float) arg2 / ((float) this.field712 * 128.0F * (float) this.field707.field1938);
        field726[6] = 0.0F;
        field726[7] = 0.0F;
        field726[8] = 0.0F;
        field726[9] = 0.0F;
        field726[10] = 0.0F;
        field726[11] = 0.0F;
        field726[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field707.field1937;
        field726[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field707.field1938;
        field726[14] = 0.0F;
        field726[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field726, 0);
        field726[0] = 1.0F;
        field726[1] = 0.0F;
        field726[2] = 0.0F;
        field726[3] = 0.0F;
        field726[4] = 0.0F;
        field726[5] = 0.0F;
        field726[6] = 1.0F;
        field726[7] = 0.0F;
        field726[8] = 0.0F;
        field726[9] = 1.0F;
        field726[10] = 0.0F;
        field726[11] = 0.0F;
        field726[12] = 0.0F;
        field726[13] = 0.0F;
        field726[14] = 0.0F;
        field726[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field726, 0);
        if ((this.field719 & 0x7) == 0) {
            this.field707.method996(false);
        } else {
            this.field707.method996(true);
            this.field707.method1001();
        }
        this.field707.method961(this.field732, this.field734, this.field729, this.field731);
        if (field718.field1851.length < this.field710 * 2) {
            field718 = new class130(this.field710 * 2);
        } else {
            field718.field1880 = 0;
        }
        int var10 = 0;
        if (this.field707.field1998) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field1187 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field717[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field718.method799(var14[var15] & 0xFFFF, 94);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field1187 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field717[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field718.method827(var19[var20] & 0xFFFF, 124);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class437 var21 = new class437(this.field707, 5123, field718.field1851, field718.field1880);
            this.field707.method982(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()V")
    public final void method355() {
        if (this.field737 > 0) {
            byte[][] var1 = new byte[this.field1187 + 1][this.field1183 + 1];
            for (int var2 = 1; var2 < this.field1187; var2++) {
                for (int var3 = 1; var3 < this.field1183; var3++) {
                    var1[var2][var3] = (byte) ((this.field740[var2][var3] >> 1) + (this.field740[var2][var3 + 1] >> 3) + (this.field740[var2][var3 - 1] >> 2) + (this.field740[var2 - 1][var3] >> 2) + (this.field740[var2 + 1][var3] >> 3));
                }
            }
            this.field736 = new class360[this.field730.method1375(127)];
            this.field730.method1384(this.field736, 0);
            for (int var4 = 0; var4 < this.field736.length; var4++) {
                this.field736[var4].method2345(this.field737, 18474);
            }
            int var5 = 24;
            if (this.field741 != null) {
                var5 += 4;
            }
            if ((this.field719 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field737 * var5).order(ByteOrder.nativeOrder());
            class360[] var7 = new class360[this.field737];
            class191 var8 = new class191(class434.method2709(this.field737, (byte) 105));
            class360[] var9 = new class360[this.field733];
            for (int var10 = 0; var10 < this.field1187; var10++) {
                for (int var11 = 0; var11 < this.field1183; var11++) {
                    if (this.field716[var10][var11] != null) {
                        class360[] var12 = this.field724[var10][var11];
                        int[] var13 = this.field715[var10][var11];
                        int[] var14 = this.field708[var10][var11];
                        int[] var15 = this.field711[var10][var11];
                        int[] var16 = this.field709[var10][var11];
                        int[] var17 = this.field716[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field739[var10][var11];
                        float var19 = this.field742[var10][var11];
                        float var20 = this.field735[var10][var11];
                        float var21 = this.field739[var10][var11 + 1];
                        float var22 = this.field742[var10][var11 + 1];
                        float var23 = this.field735[var10][var11 + 1];
                        float var24 = this.field739[var10 + 1][var11 + 1];
                        float var25 = this.field742[var10 + 1][var11 + 1];
                        float var26 = this.field735[var10 + 1][var11 + 1];
                        float var27 = this.field739[var10 + 1][var11];
                        float var28 = this.field742[var10 + 1][var11];
                        float var29 = this.field735[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field741 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field741[var10][var11];
                            var35 = (float) this.field741[var10][var11 + 1];
                            var36 = (float) this.field741[var10 + 1][var11 + 1];
                            var37 = (float) this.field741[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class360 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field717[this.field1187 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field722) + var14[var43];
                            int var45 = (var11 << this.field722) + var15[var43];
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
                            } else if (var51 == 0 && this.field712 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field712 == var51 && this.field712 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field712 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field712;
                                float var62 = (float) var52 / (float) this.field712;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field722) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field722) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field722) + var69);
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
                                var54 = class131.field1911[var46 & 0xFF80 | var73];
                                if ((this.field719 & 0x7) == 0) {
                                    float var74 = this.field707.field2049[2] * var58 + this.field707.field2049[0] * var56 + this.field707.field2049[1] * var57;
                                    var55 = this.field707.field2039 + var74 * (var74 > 0.0F ? this.field707.field1949 : this.field707.field1951);
                                }
                            }
                            class425 var75 = var8.method1373(var49, 17);
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
                                    var77 = class131.field1911[var47 & 0xFF80 | var76];
                                    if ((this.field719 & 0x7) == 0) {
                                        float var78 = this.field707.field2049[2] * var58 + this.field707.field2049[0] * var56 + this.field707.field2049[1] * var57;
                                        float var79 = this.field707.field2039 + var55 * (var55 > 0.0F ? this.field707.field1949 : this.field707.field1951);
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
                                var6.putFloat((float) (this.method360(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field741 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field719 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field714++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1376(new class51(var42[var43]), var49, 121);
                            } else {
                                var42[var43] = ((class51) var75).field662;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field6070 < var7[var86].field6070) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method2340(-6339, var55, var86, var60, var54);
                            }
                            this.field710++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field714; var88++) {
                class360 var89 = var7[var88];
                if (var89 != null) {
                    var89.method2341(var88, 4);
                }
            }
            for (int var90 = 0; var90 < this.field1187; var90++) {
                for (int var91 = 0; var91 < this.field1183; var91++) {
                    short[] var92 = this.field717[this.field1187 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class360 var98 = var7[var95];
                            class360 var99 = var7[var96];
                            class360 var100 = var7[var97];
                            class360 var101 = null;
                            if (var98 != null) {
                                var98.method2342(var93, var91, var90, (byte) 12);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method2342(var93, var91, var90, (byte) 12);
                                if (var101 == null || var99.field6070 < var101.field6070) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method2342(var93, var91, var90, (byte) 12);
                                if (var101 == null || var100.field6070 < var101.field6070) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method2341(var95, 4);
                                }
                                if (var99 != null) {
                                    var101.method2341(var96, 4);
                                }
                                if (var100 != null) {
                                    var101.method2341(var97, 4);
                                }
                                var101.method2342(var93, var91, var90, (byte) 12);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field738 = this.field707.method922(var5, var6, false);
            this.field732 = new class273(this.field707, this.field738, 5126, 3, 0);
            this.field729 = new class273(this.field707, this.field738, 5121, 4, 12);
            byte var102;
            if (this.field741 == null) {
                this.field731 = new class273(this.field707, this.field738, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field731 = new class273(this.field707, this.field738, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field719 & 0x7) != 0) {
                this.field734 = new class273(this.field707, this.field738, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field736.length];
            for (int var104 = 0; var104 < this.field736.length; var104++) {
                class360 var105 = this.field736[var104];
                var103[var104] = var105.field6070;
                var105.method2343(120, this.field714);
            }
            class24.method130(this.field736, -4210, var103);
            if (this.field725 != null) {
                this.field725.method1104(false);
            }
        } else {
            this.field725 = null;
        }
        this.field708 = this.field711 = (int[][][]) null;
        this.field709 = (int[][][]) null;
        this.field715 = (int[][][]) null;
        this.field724 = (class360[][][]) null;
        this.field716 = (int[][][]) null;
        this.field740 = (byte[][]) null;
        this.field730 = null;
        this.field741 = (int[][]) null;
        this.field739 = this.field742 = this.field735 = (float[][]) null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lhh;II)V")
    private final void method356(class67 arg0, int arg1, int arg2) {
        int[] var4 = this.field708[arg1][arg2];
        int[] var5 = this.field711[arg1][arg2];
        int var6 = var4.length;
        if (field723.length < var6) {
            field723 = new int[var6];
            field727 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field723[var7] = (var4[var7] & 0xFF) >> this.field707.field1933;
            field727[var7] = (var5[var7] & 0xFF) >> this.field707.field1933;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field723[var8];
            int var10 = field727[var8++];
            int var11 = field723[var8];
            int var12 = field727[var8++];
            int var13 = field723[var8];
            int var14 = field727[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method420(true, var14, var10, var13, var11, var9, var12);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lo;IIIIZ)V")
    public final void method357(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field725 != null && arg0 != null) {
            int var7 = arg1 - (this.field707.field1960 * arg2 >> 8) >> this.field707.field1933;
            int var8 = arg3 - (this.field707.field1997 * arg2 >> 8) >> this.field707.field1933;
            this.field725.method1100(var8, arg0, var7, -27533);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III[[ZZ)V")
    public final void method358(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field736 == null) {
            return;
        }
        float var6 = this.field707.field1966;
        float var7 = this.field707.field1950;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field728.length < var9) {
            field728 = new int[var9];
        }
        if (field718.field1851.length < this.field710 * 2) {
            field718 = new class130(this.field710 * 2);
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
        if (var14 > this.field1187 - 1) {
            var14 = this.field1187 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field1183 - 1) {
            var15 = this.field1183 - 1;
        }
        field720 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field728[field720++] = this.field1187 * var18 + var16;
                }
            }
        }
        this.field707.method919();
        this.field707.method996((this.field719 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field736.length; var19++) {
            this.field736[var19].method2344(field728, field720, 101);
        }
        if (!this.field706.method2759(-1)) {
            int var20 = this.field707.field2000;
            int var21 = this.field707.field2008;
            this.field707.method989(0, var21);
            this.field707.method956(var7, var6 - 4.0F);
            this.field707.method996(false);
            this.field707.method969(false);
            this.field707.method972(130);
            this.field707.method977(-2);
            this.field707.method888(this.field707.field2047);
            this.field707.method926(8448, 7681);
            this.field707.method949(0, 34166, 770);
            this.field707.method958(0, 34167, 770);
            for (class425 var22 = this.field706.method2752(-78); var22 != null; var22 = this.field706.method2754(-1)) {
                class49 var23 = (class49) var22;
                var23.method315(-6, arg2, arg3, arg1, arg0);
            }
            this.field707.method949(0, 5890, 768);
            this.field707.method958(0, 5890, 770);
            this.field707.method888((class404) null);
            this.field707.method989(var20, var21);
        }
        if (this.field725 != null) {
            this.field707.method956(var7, var6 - 8.0F);
            this.field707.method919();
            this.field707.method961(this.field732, (class273) null, (class273) null, this.field731);
            this.field725.method1105(arg4, arg0, (byte) -124, arg3, arg2, arg1);
        }
        this.field707.method956(var7, var6);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I")
    public final int method359(int arg0, int arg1) {
        return this.field713[arg0][arg1];
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I")
    public final int method360(int arg0, int arg1) {
        int var3 = arg0 >> this.field722;
        int var4 = arg1 >> this.field722;
        if (var3 < 0 || var4 < 0 || var3 > this.field1187 - 1 || var4 > this.field1183 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field712 - 1;
        int var6 = arg1 & this.field712 - 1;
        int var7 = (this.field712 - var5) * this.field713[var3][var4] + this.field713[var3 + 1][var4] * var5 >> this.field722;
        int var8 = (this.field712 - var5) * this.field713[var3][var4 + 1] + this.field713[var3 + 1][var4 + 1] * var5 >> this.field722;
        return (this.field712 - var6) * var7 + var6 * var8 >> this.field722;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(Lo;IIIIZ)Z")
    public final boolean method361(class21 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field725 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field707.field1960 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field707.field1997 * arg2 >> 8) >> 3;
            return this.field725.method1101(var7, arg0, 1, var8);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
    public final void method362(int arg0, int arg1, int arg2) {
        if ((this.field740[arg0][arg1] & 0xFF) < arg2) {
            this.field740[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lig;IIII[[I[[II)V")
    public class55(class132 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field707 = arg0;
        this.field713 = arg5;
        this.field741 = arg6;
        this.field719 = arg2;
        while (arg7 > 1) {
            this.field722++;
            arg7 >>= 0x1;
        }
        this.field712 = 0x1 << this.field722;
        this.field715 = new int[arg3][arg4][];
        this.field724 = new class360[arg3][arg4][];
        this.field708 = new int[arg3][arg4][];
        this.field711 = new int[arg3][arg4][];
        this.field716 = new int[arg3][arg4][];
        this.field709 = new int[arg3][arg4][];
        this.field717 = new short[arg3 * arg4][];
        this.field721 = new byte[arg3][arg4];
        this.field740 = new byte[arg3 + 1][arg4 + 1];
        this.field739 = new float[arg3 + 1][arg4 + 1];
        this.field742 = new float[arg3 + 1][arg4 + 1];
        this.field735 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field713[var10 + 1][var9] - this.field713[var10 - 1][var9];
                int var12 = this.field713[var10][var9 + 1] - this.field713[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field739[var10][var9] = (float) var11 * var13;
                this.field742[var10][var9] = var13 * -256.0F;
                this.field735[var10][var9] = (float) var12 * var13;
            }
        }
        this.field730 = new class191(128);
        if ((this.field719 & 0x10) != 0) {
            this.field725 = new class149(this.field707, this);
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(II)V")
    public final void method363(int arg0, int arg1) {
    }
}
