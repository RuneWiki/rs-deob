import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class377 extends class279 {

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lbb;")
    private class270 field5096 = new class270();

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lh;")
    public class327 field5103;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "[[I")
    private int[][] field5101;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "[[I")
    private int[][] field5116;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public int field5097;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field5111;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "[[[I")
    private int[][][] field5106;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[[[Lap;")
    private class25[][][] field5102;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "[[[I")
    public int[][][] field5100;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "[[[I")
    public int[][][] field5114;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "[[[I")
    private int[][][] field5113;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "[[[I")
    private int[][][] field5093;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "[[S")
    public short[][] field5109;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[[B")
    private byte[][] field5105;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "[[B")
    private byte[][] field5128;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "[[F")
    private float[][] field5120;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "[[F")
    private float[][] field5119;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "[[F")
    private float[][] field5121;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Ltm;")
    private class349 field5117;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lln;")
    private class63 field5099;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lbg;")
    public static class242 field5098 = new class242(1);

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "[I")
    private static int[] field5107 = new int[1];

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "[I")
    private static int[] field5108 = new int[1];

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "[I")
    private static int[] field5115 = new int[1];

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "[F")
    private static float[] field5110 = new float[16];

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    private int field5094;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    private int field5104;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    private static int field5112;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    private int field5122;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lig;")
    public class205 field5118;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lig;")
    private class205 field5123;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Lig;")
    public class205 field5124;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lig;")
    public class205 field5129;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Lva;")
    private class415 field5125;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "[Lap;")
    private class25[] field5127;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lsi;[I)V", line = 7)
    public final void method1047(class92 arg0, int[] arg1) {
        this.field5096.method1696(false, new class323(this.field5103, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V", line = 10)
    public final void method1042(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lum;II)V", line = 13)
    private final void method2345(class74 arg0, int arg1, int arg2) {
        int[] var4 = this.field5100[arg1][arg2];
        int[] var5 = this.field5114[arg1][arg2];
        int var6 = var4.length;
        if (field5115.length < var6) {
            field5115 = new int[var6];
            field5108 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field5115[var7] = (var4[var7] & 0xFF) >> this.field5103.field4367;
            field5108[var7] = (var5[var7] & 0xFF) >> this.field5103.field4367;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field5115[var8];
            int var10 = field5108[var8++];
            int var11 = field5115[var8];
            int var12 = field5108[var8++];
            int var13 = field5115[var8];
            int var14 = field5108[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method438(var14, var12, var11, var9, var13, var10, true);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Lgi;IIIIZ)V", line = 63)
    public final void method1051(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5099 != null && arg0 != null) {
            int var7 = arg1 - (this.field5103.field4407 * arg2 >> 8) >> this.field5103.field4367;
            int var8 = arg3 - (this.field5103.field4433 * arg2 >> 8) >> this.field5103.field4367;
            this.field5099.method361(var8, false, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lgi;IIIIZ)V", line = 82)
    public final void method1044(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5099 != null && arg0 != null) {
            int var7 = arg1 - (this.field5103.field4407 * arg2 >> 8) >> this.field5103.field4367;
            int var8 = arg3 - (this.field5103.field4433 * arg2 >> 8) >> this.field5103.field4367;
            this.field5099.method363(arg0, var7, (byte) 88, var8);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 98)
    public final void method1049(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method1058(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lgi;IIIIZ)Z", line = 162)
    public final boolean method1059(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5099 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field5103.field4407 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field5103.field4433 * arg2 >> 8) >> 3;
            return this.field5099.method368(var8, (byte) -112, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILgi;)Lgi;", line = 175)
    public final class416 method1055(int arg0, int arg1, class416 arg2) {
        if ((this.field5105[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field5111 >> this.field5103.field4367;
        class74 var5 = (class74) arg2;
        class74 var6;
        if (var5 != null && var5.method439(var4, var4, (byte) -79)) {
            var6 = var5;
            var5.method440(-1);
        } else {
            var6 = new class74(this.field5103, var4, var4);
        }
        var6.method436(var4, var4, 1114916304, 0, 0);
        this.method2345(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V", line = 200)
    public final void method1053() {
        if (this.field5126 > 0) {
            byte[][] var1 = new byte[this.field3612 + 1][this.field3611 + 1];
            for (int var2 = 1; var2 < this.field3612; var2++) {
                for (int var3 = 1; var3 < this.field3611; var3++) {
                    var1[var2][var3] = (byte) ((this.field5128[var2][var3] >> 1) + (this.field5128[var2][var3 + 1] >> 3) + (this.field5128[var2][var3 - 1] >> 2) + (this.field5128[var2 - 1][var3] >> 2) + (this.field5128[var2 + 1][var3] >> 3));
                }
            }
            this.field5127 = new class25[this.field5117.method2219((byte) -117)];
            this.field5117.method2217(this.field5127, false);
            for (int var4 = 0; var4 < this.field5127.length; var4++) {
                this.field5127[var4].method159((byte) 125, this.field5126);
            }
            int var5 = 24;
            if (this.field5116 != null) {
                var5 += 4;
            }
            if ((this.field5097 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field5126 * var5).order(ByteOrder.nativeOrder());
            class25[] var7 = new class25[this.field5126];
            class349 var8 = new class349(class246.method1611((byte) -53, this.field5126));
            class25[] var9 = new class25[this.field5122];
            for (int var10 = 0; var10 < this.field3612; var10++) {
                for (int var11 = 0; var11 < this.field3611; var11++) {
                    if (this.field5113[var10][var11] != null) {
                        class25[] var12 = this.field5102[var10][var11];
                        int[] var13 = this.field5106[var10][var11];
                        int[] var14 = this.field5100[var10][var11];
                        int[] var15 = this.field5114[var10][var11];
                        int[] var16 = this.field5093[var10][var11];
                        int[] var17 = this.field5113[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field5120[var10][var11];
                        float var19 = this.field5119[var10][var11];
                        float var20 = this.field5121[var10][var11];
                        float var21 = this.field5120[var10][var11 + 1];
                        float var22 = this.field5119[var10][var11 + 1];
                        float var23 = this.field5121[var10][var11 + 1];
                        float var24 = this.field5120[var10 + 1][var11 + 1];
                        float var25 = this.field5119[var10 + 1][var11 + 1];
                        float var26 = this.field5121[var10 + 1][var11 + 1];
                        float var27 = this.field5120[var10 + 1][var11];
                        float var28 = this.field5119[var10 + 1][var11];
                        float var29 = this.field5121[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field5116 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field5116[var10][var11];
                            var35 = (float) this.field5116[var10][var11 + 1];
                            var36 = (float) this.field5116[var10 + 1][var11 + 1];
                            var37 = (float) this.field5116[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class25 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field5109[this.field3612 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field5095) + var14[var43];
                            int var45 = (var11 << this.field5095) + var15[var43];
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
                            } else if (var51 == 0 && this.field5111 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field5111 == var51 && this.field5111 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field5111 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field5111;
                                float var62 = (float) var52 / (float) this.field5111;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field5095) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field5095) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field5095) + var69);
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
                                var54 = class318.field4284[var46 & 0xFF80 | var73];
                                if ((this.field5097 & 0x7) == 0) {
                                    float var74 = this.field5103.field4465[2] * var58 + this.field5103.field4465[0] * var56 + this.field5103.field4465[1] * var57;
                                    var55 = this.field5103.field4410 + var74 * (var74 > 0.0F ? this.field5103.field4474 : this.field5103.field4473);
                                }
                            }
                            class43 var75 = var8.method2218(1, var49);
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
                                    var77 = class318.field4284[var47 & 0xFF80 | var76];
                                    if ((this.field5097 & 0x7) == 0) {
                                        float var78 = this.field5103.field4465[2] * var58 + this.field5103.field4465[0] * var56 + this.field5103.field4465[1] * var57;
                                        float var79 = this.field5103.field4410 + var55 * (var55 > 0.0F ? this.field5103.field4474 : this.field5103.field4473);
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
                                var6.putFloat((float) (this.method1054(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field5116 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field5097 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field5094++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method2227(new class32(var42[var43]), -8218, var49);
                            } else {
                                var42[var43] = ((class32) var75).field363;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field505 < var7[var86].field505) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method158(var60, var55, true, var54, var86);
                            }
                            this.field5104++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field5094; var88++) {
                class25 var89 = var7[var88];
                if (var89 != null) {
                    var89.method161(-1, var88);
                }
            }
            for (int var90 = 0; var90 < this.field3612; var90++) {
                for (int var91 = 0; var91 < this.field3611; var91++) {
                    short[] var92 = this.field5109[this.field3612 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class25 var98 = var7[var95];
                            class25 var99 = var7[var96];
                            class25 var100 = var7[var97];
                            class25 var101 = null;
                            if (var98 != null) {
                                var98.method162(var90, var93, 1, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method162(var90, var93, 1, var91);
                                if (var101 == null || var99.field505 < var101.field505) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method162(var90, var93, 1, var91);
                                if (var101 == null || var100.field505 < var101.field505) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method161(-1, var95);
                                }
                                if (var99 != null) {
                                    var101.method161(-1, var96);
                                }
                                if (var100 != null) {
                                    var101.method161(-1, var97);
                                }
                                var101.method162(var90, var93, 1, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field5125 = this.field5103.method2073(var5, var6, false);
            this.field5118 = new class205(this.field5103, this.field5125, 5126, 3, 0);
            this.field5123 = new class205(this.field5103, this.field5125, 5121, 4, 12);
            byte var102;
            if (this.field5116 == null) {
                this.field5124 = new class205(this.field5103, this.field5125, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field5124 = new class205(this.field5103, this.field5125, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field5097 & 0x7) != 0) {
                this.field5129 = new class205(this.field5103, this.field5125, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field5127.length];
            for (int var104 = 0; var104 < this.field5127.length; var104++) {
                class25 var105 = this.field5127[var104];
                var103[var104] = var105.field505;
                var105.method157(this.field5094, (byte) -108);
            }
            class156.method994(-38, this.field5127, var103);
            if (this.field5099 != null) {
                this.field5099.method369(-1);
            }
        } else {
            this.field5099 = null;
        }
        this.field5100 = this.field5114 = (int[][][]) null;
        this.field5093 = (int[][][]) null;
        this.field5106 = (int[][][]) null;
        this.field5102 = (class25[][][]) null;
        this.field5113 = (int[][][]) null;
        this.field5128 = (byte[][]) null;
        this.field5117 = null;
        this.field5116 = (int[][]) null;
        this.field5120 = this.field5119 = this.field5121 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)I", line = 738)
    public final int method1054(int arg0, int arg1) {
        int var3 = arg0 >> this.field5095;
        int var4 = arg1 >> this.field5095;
        if (var3 < 0 || var4 < 0 || var3 > this.field3612 - 1 || var4 > this.field3611 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field5111 - 1;
        int var6 = arg1 & this.field5111 - 1;
        int var7 = (this.field5111 - var5) * this.field5101[var3][var4] + this.field5101[var3 + 1][var4] * var5 >> this.field5095;
        int var8 = (this.field5111 - var5) * this.field5101[var3][var4 + 1] + this.field5101[var3 + 1][var4 + 1] * var5 >> this.field5095;
        return (this.field5111 - var6) * var7 + var6 * var8 >> this.field5095;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III[[ZZ)V", line = 759)
    public final void method1046(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field5127 == null) {
            return;
        }
        float var6 = this.field5103.field4486;
        float var7 = this.field5103.field4398;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field5107.length < var9) {
            field5107 = new int[var9];
        }
        if (field5098.field3188.length < this.field5104 * 2) {
            field5098 = new class242(this.field5104 * 2);
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
        if (var14 > this.field3612 - 1) {
            var14 = this.field3612 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field3611 - 1) {
            var15 = this.field3611 - 1;
        }
        field5112 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field5107[field5112++] = this.field3612 * var18 + var16;
                }
            }
        }
        this.field5103.method2116();
        this.field5103.method2051((this.field5097 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field5127.length; var19++) {
            this.field5127[var19].method160((byte) 126, field5107, field5112);
        }
        if (!this.field5096.method1698(0)) {
            int var20 = this.field5103.field4450;
            int var21 = this.field5103.field4392;
            this.field5103.method752(0, var21);
            this.field5103.method773(var7, var6 - 4.0F);
            this.field5103.method2051(false);
            this.field5103.method2082(false);
            this.field5103.method2092(130);
            this.field5103.method2059(-2);
            this.field5103.method2088(this.field5103.field4449);
            this.field5103.method2056(8448, 7681);
            this.field5103.method2077(0, 34166, 770);
            this.field5103.method2066(0, 34167, 770);
            for (class43 var22 = this.field5096.method1690((byte) -113); var22 != null; var22 = this.field5096.method1699((byte) 74)) {
                class323 var23 = (class323) var22;
                var23.method2036(arg3, false, arg0, arg2, arg1);
            }
            this.field5103.method2077(0, 5890, 768);
            this.field5103.method2066(0, 5890, 770);
            this.field5103.method2088((class233) null);
            this.field5103.method752(var20, var21);
        }
        if (this.field5099 != null) {
            this.field5103.method773(var7, var6 - 8.0F);
            this.field5103.method2116();
            this.field5103.method2070(this.field5118, (class205) null, (class205) null, this.field5124);
            this.field5099.method362((byte) 44, arg1, arg2, arg0, arg3, arg4);
        }
        this.field5103.method773(var7, var6);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 887)
    public final void method1045(int arg0, int arg1, int arg2) {
        if ((this.field5128[arg0][arg1] & 0xFF) < arg2) {
            this.field5128[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 895)
    public final void method1058(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field5106[arg0][arg1] = arg3;
        this.field5100[arg0][arg1] = arg2;
        this.field5114[arg0][arg1] = arg4;
        this.field5113[arg0][arg1] = arg5;
        this.field5093[arg0][arg1] = arg6;
        class25[] var13 = this.field5102[arg0][arg1] = new class25[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class43 var17 = this.field5117.method2218(1, var15);
            if (var17 == null) {
                var13[var14] = new class25(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field5117.method2227(var13[var14], -8218, var15);
            } else {
                var13[var14] = (class25) var17;
            }
        }
        if (arg11) {
            this.field5105[arg0][arg1] = (byte) (this.field5105[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field5122) {
            this.field5122 = arg5.length;
        }
        this.field5126 += arg5.length;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIII[[Z)V", line = 932)
    public final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field5126 <= 0) {
            return;
        }
        opengl var9 = this.field5103.field4363;
        this.field5103.method2069();
        this.field5103.method2113(false);
        this.field5103.method2051(false);
        this.field5103.method2063(false);
        this.field5103.method2082(false);
        this.field5103.method2092(0);
        this.field5103.method2059(-2);
        this.field5103.method2088((class233) null);
        field5110[0] = (float) arg2 / ((float) this.field5111 * 128.0F * (float) this.field5103.field4377);
        field5110[1] = 0.0F;
        field5110[2] = 0.0F;
        field5110[3] = 0.0F;
        field5110[4] = 0.0F;
        field5110[5] = (float) arg2 / ((float) this.field5111 * 128.0F * (float) this.field5103.field4376);
        field5110[6] = 0.0F;
        field5110[7] = 0.0F;
        field5110[8] = 0.0F;
        field5110[9] = 0.0F;
        field5110[10] = 0.0F;
        field5110[11] = 0.0F;
        field5110[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5103.field4377;
        field5110[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5103.field4376;
        field5110[14] = 0.0F;
        field5110[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field5110, 0);
        field5110[0] = 1.0F;
        field5110[1] = 0.0F;
        field5110[2] = 0.0F;
        field5110[3] = 0.0F;
        field5110[4] = 0.0F;
        field5110[5] = 0.0F;
        field5110[6] = 1.0F;
        field5110[7] = 0.0F;
        field5110[8] = 0.0F;
        field5110[9] = 1.0F;
        field5110[10] = 0.0F;
        field5110[11] = 0.0F;
        field5110[12] = 0.0F;
        field5110[13] = 0.0F;
        field5110[14] = 0.0F;
        field5110[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field5110, 0);
        if ((this.field5097 & 0x7) == 0) {
            this.field5103.method2051(false);
        } else {
            this.field5103.method2051(true);
            this.field5103.method2081();
        }
        this.field5103.method2070(this.field5118, this.field5129, this.field5123, this.field5124);
        if (field5098.field3188.length < this.field5104 * 2) {
            field5098 = new class242(this.field5104 * 2);
        } else {
            field5098.field3211 = 0;
        }
        int var10 = 0;
        if (this.field5103.field4448) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field3612 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field5109[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field5098.method1573(-6266, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field3612 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field5109[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field5098.method1540(true, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class155 var21 = new class155(this.field5103, 5123, field5098.field3188, field5098.field3211);
            this.field5103.method2053(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I", line = 1094)
    public final int method1050(int arg0, int arg1) {
        return this.field5101[arg0][arg1];
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lh;IIII[[I[[II)V", line = 1110)
    public class377(class327 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field5103 = arg0;
        this.field5101 = arg5;
        this.field5116 = arg6;
        this.field5097 = arg2;
        while (arg7 > 1) {
            this.field5095++;
            arg7 >>= 0x1;
        }
        this.field5111 = 0x1 << this.field5095;
        this.field5106 = new int[arg3][arg4][];
        this.field5102 = new class25[arg3][arg4][];
        this.field5100 = new int[arg3][arg4][];
        this.field5114 = new int[arg3][arg4][];
        this.field5113 = new int[arg3][arg4][];
        this.field5093 = new int[arg3][arg4][];
        this.field5109 = new short[arg3 * arg4][];
        this.field5105 = new byte[arg3][arg4];
        this.field5128 = new byte[arg3 + 1][arg4 + 1];
        this.field5120 = new float[arg3 + 1][arg4 + 1];
        this.field5119 = new float[arg3 + 1][arg4 + 1];
        this.field5121 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field5101[var10 + 1][var9] - this.field5101[var10 - 1][var9];
                int var12 = this.field5101[var10][var9 + 1] - this.field5101[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field5120[var10][var9] = (float) var11 * var13;
                this.field5119[var10][var9] = var13 * -256.0F;
                this.field5121[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5117 = new class349(128);
        if ((this.field5097 & 0x10) != 0) {
            this.field5099 = new class63(this.field5103, this);
        }
    }
}
