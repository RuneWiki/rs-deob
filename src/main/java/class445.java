import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class445 extends class426 {

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lkr;")
    private class486 field6148 = new class486();

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Lmi;")
    public class315 field6158;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[[I")
    private int[][] field6146;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public int field6152;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[[[I")
    private int[][][] field6135;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[[[Lwo;")
    private class484[][][] field6139;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[[[I")
    public int[][][] field6141;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "[[[I")
    public int[][][] field6136;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[[[I")
    private int[][][] field6137;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "[[[I")
    private int[][][] field6140;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "[[S")
    public short[][] field6150;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[[B")
    private byte[][] field6138;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[[B")
    private byte[][] field6171;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "[[F")
    private float[][] field6162;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "[[F")
    private float[][] field6164;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "[[F")
    private float[][] field6161;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Lcp;")
    private class470 field6160;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lrr;")
    private class223 field6144;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lrp;")
    public static class276 field6143 = new class276(1);

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[I")
    private static int[] field6154 = new int[1];

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[F")
    private static float[] field6153 = new float[16];

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "[I")
    private static int[] field6149 = new int[1];

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "[I")
    private static int[] field6157 = new int[1];

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    private static int field6151;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    private int field6155;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    private int field6156;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field6170;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "Lga;")
    public class254 field6159;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "Lga;")
    public class254 field6165;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "Lga;")
    public class254 field6168;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "Lga;")
    private class254 field6169;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Lht;")
    private class378 field6167;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "[Lwo;")
    private class484[] field6166;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[[[I")
    private int[][][] field6142;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V")
    public final void method1222() {
        if (this.field6170 > 0) {
            byte[][] var1 = new byte[this.field5967 + 1][this.field5970 + 1];
            for (int var2 = 1; var2 < this.field5967; var2++) {
                for (int var3 = 1; var3 < this.field5970; var3++) {
                    var1[var2][var3] = (byte) ((this.field6171[var2][var3] >> 1) + (this.field6171[var2][var3 + 1] >> 3) + (this.field6171[var2][var3 - 1] >> 2) + (this.field6171[var2 - 1][var3] >> 2) + (this.field6171[var2 + 1][var3] >> 3));
                }
            }
            this.field6166 = new class484[this.field6160.method2762(0)];
            this.field6160.method2764(this.field6166, (byte) 117);
            for (int var4 = 0; var4 < this.field6166.length; var4++) {
                this.field6166[var4].method2828(0, this.field6170);
            }
            int var5 = 24;
            if (this.field6142 != null) {
                var5 += 4;
            }
            if ((this.field6152 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field6170 * var5).order(ByteOrder.nativeOrder());
            class484[] var7 = new class484[this.field6170];
            class470 var8 = new class470(class8.method30(this.field6170, 2094643329));
            class484[] var9 = new class484[this.field6163];
            for (int var10 = 0; var10 < this.field5967; var10++) {
                for (int var11 = 0; var11 < this.field5970; var11++) {
                    if (this.field6137[var10][var11] != null) {
                        class484[] var12 = this.field6139[var10][var11];
                        int[] var13 = this.field6141[var10][var11];
                        int[] var14 = this.field6136[var10][var11];
                        int[] var15 = this.field6140[var10][var11];
                        int[] var16 = this.field6137[var10][var11];
                        int[] var17 = this.field6135 == null ? null : this.field6135[var10][var11];
                        int[] var18 = this.field6142 == null ? null : this.field6142[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field6162[var10][var11];
                        float var20 = this.field6164[var10][var11];
                        float var21 = this.field6161[var10][var11];
                        float var22 = this.field6162[var10][var11 + 1];
                        float var23 = this.field6164[var10][var11 + 1];
                        float var24 = this.field6161[var10][var11 + 1];
                        float var25 = this.field6162[var10 + 1][var11 + 1];
                        float var26 = this.field6164[var10 + 1][var11 + 1];
                        float var27 = this.field6161[var10 + 1][var11 + 1];
                        float var28 = this.field6162[var10 + 1][var11];
                        float var29 = this.field6164[var10 + 1][var11];
                        float var30 = this.field6161[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class484 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field6150[this.field5967 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field6145) + var13[var40];
                            int var42 = (var11 << this.field6145) + var14[var40];
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
                            } else if (var48 == 0 && this.field6147 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field6147 == var48 && this.field6147 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field6147 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field6147;
                                float var58 = (float) var49 / (float) this.field6147;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field6145) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field6145) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field6145) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class30.field406[var43 & 0xFF80 | var67];
                                if ((this.field6152 & 0x7) == 0) {
                                    float var68 = this.field6158.field4502[2] * var55 + this.field6158.field4502[0] * var53 + this.field6158.field4502[1] * var54;
                                    var52 = this.field6158.field4516 + var68 * (var68 > 0.0F ? this.field6158.field4567 : this.field6158.field4554);
                                }
                            }
                            class238 var69 = var8.method2761(var46, (byte) -112);
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
                                    var71 = class30.field406[var44 & 0xFF80 | var70];
                                    if ((this.field6152 & 0x7) == 0) {
                                        float var72 = this.field6158.field4502[2] * var55 + this.field6158.field4502[0] * var53 + this.field6158.field4502[1] * var54;
                                        float var73 = this.field6158.field4516 + var52 * (var52 > 0.0F ? this.field6158.field4567 : this.field6158.field4554);
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
                                var6.putFloat((float) (this.method1209(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field6142 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field6152 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field6156++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method2767(-1, var46, new class68(var39[var40]));
                            } else {
                                var39[var40] = ((class68) var69).field859;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field3568 < var7[var80].field3568) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method2829(var80, -3482, var56, var52, var51);
                            }
                            this.field6155++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field6156; var82++) {
                class484 var83 = var7[var82];
                if (var83 != null) {
                    var83.method2827(var82, true);
                }
            }
            for (int var84 = 0; var84 < this.field5967; var84++) {
                for (int var85 = 0; var85 < this.field5970; var85++) {
                    short[] var86 = this.field6150[this.field5967 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class484 var92 = var7[var89];
                            class484 var93 = var7[var90];
                            class484 var94 = var7[var91];
                            class484 var95 = null;
                            if (var92 != null) {
                                var92.method2825(var85, (byte) -77, var87, var84);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method2825(var85, (byte) -77, var87, var84);
                                if (var95 == null || var93.field3568 < var95.field3568) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method2825(var85, (byte) -77, var87, var84);
                                if (var95 == null || var94.field3568 < var95.field3568) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method2827(var89, true);
                                }
                                if (var93 != null) {
                                    var95.method2827(var90, true);
                                }
                                if (var94 != null) {
                                    var95.method2827(var91, true);
                                }
                                var95.method2825(var85, (byte) -77, var87, var84);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field6167 = this.field6158.method2007(var5, var6, false);
            this.field6165 = new class254(this.field6158, this.field6167, 5126, 3, 0);
            this.field6169 = new class254(this.field6158, this.field6167, 5121, 4, 12);
            byte var96;
            if (this.field6142 == null) {
                this.field6159 = new class254(this.field6158, this.field6167, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field6159 = new class254(this.field6158, this.field6167, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field6152 & 0x7) != 0) {
                this.field6168 = new class254(this.field6158, this.field6167, 5126, 3, var96);
            }
            long[] var97 = new long[this.field6166.length];
            for (int var98 = 0; var98 < this.field6166.length; var98++) {
                class484 var99 = this.field6166[var98];
                var97[var98] = var99.field3568;
                var99.method2826((byte) -60, this.field6156);
            }
            class332.method2100(this.field6166, 3, var97);
            if (this.field6144 != null) {
                this.field6144.method1432(9431);
            }
        } else {
            this.field6144 = null;
        }
        this.field6141 = this.field6136 = (int[][][]) null;
        this.field6142 = (int[][][]) null;
        this.field6140 = (int[][][]) null;
        this.field6135 = (int[][][]) null;
        this.field6139 = (class484[][][]) null;
        this.field6137 = (int[][][]) null;
        this.field6171 = (byte[][]) null;
        this.field6160 = null;
        this.field6162 = this.field6164 = this.field6161 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field6142 == null) {
            this.field6142 = new int[this.field5967][this.field5970][];
        }
        if (arg3 != null && this.field6135 == null) {
            this.field6135 = new int[this.field5967][this.field5970][];
        }
        this.field6141[arg0][arg1] = arg2;
        this.field6136[arg0][arg1] = arg4;
        this.field6137[arg0][arg1] = arg6;
        this.field6140[arg0][arg1] = arg7;
        if (this.field6142 != null) {
            this.field6142[arg0][arg1] = arg5;
        }
        if (this.field6135 != null) {
            this.field6135[arg0][arg1] = arg3;
        }
        class484[] var15 = this.field6139[arg0][arg1] = new class484[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class238 var19;
            for (var19 = this.field6160.method2761(var17, (byte) -112); var19 != null; var19 = this.field6160.method2765(-1)) {
                class484 var20 = (class484) var19;
                if (arg8[var16] == var20.field6817 && (float) arg9[var16] == var20.field6808 && var20.field6816 == arg10 && var20.field6814 == arg11 && var20.field6818 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class484(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6160.method2767(-1, var17, var15[var16]);
            } else {
                var15[var16] = (class484) var19;
            }
        }
        if (arg13) {
            this.field6138[arg0][arg1] = (byte) (this.field6138[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field6163) {
            this.field6163 = arg6.length;
        }
        this.field6170 += arg6.length;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILtm;)Ltm;")
    public final class242 method1214(int arg0, int arg1, class242 arg2) {
        if ((this.field6138[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field6147 >> this.field6158.field4464;
        class274 var5 = (class274) arg2;
        class274 var6;
        if (var5 != null && var5.method1677(var4, true, var4)) {
            var6 = var5;
            var5.method1679((byte) 59);
        } else {
            var6 = new class274(this.field6158, var4, var4);
        }
        var6.method1678(0, 0, var4, var4, -32688);
        this.method2605(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field6170 <= 0) {
            return;
        }
        opengl var9 = this.field6158.field4445;
        this.field6158.method1979();
        this.field6158.method1994(false);
        this.field6158.method1950(false);
        this.field6158.method1955(false);
        this.field6158.method1966(false);
        this.field6158.method1995(0);
        this.field6158.method2002(-2);
        this.field6158.method1967((class425) null);
        field6153[0] = (float) arg2 / ((float) this.field6147 * 128.0F * (float) this.field6158.field4465);
        field6153[1] = 0.0F;
        field6153[2] = 0.0F;
        field6153[3] = 0.0F;
        field6153[4] = 0.0F;
        field6153[5] = (float) arg2 / ((float) this.field6147 * 128.0F * (float) this.field6158.field4457);
        field6153[6] = 0.0F;
        field6153[7] = 0.0F;
        field6153[8] = 0.0F;
        field6153[9] = 0.0F;
        field6153[10] = 0.0F;
        field6153[11] = 0.0F;
        field6153[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6158.field4465;
        field6153[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6158.field4457;
        field6153[14] = 0.0F;
        field6153[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field6153, 0);
        field6153[0] = 1.0F;
        field6153[1] = 0.0F;
        field6153[2] = 0.0F;
        field6153[3] = 0.0F;
        field6153[4] = 0.0F;
        field6153[5] = 0.0F;
        field6153[6] = 1.0F;
        field6153[7] = 0.0F;
        field6153[8] = 0.0F;
        field6153[9] = 1.0F;
        field6153[10] = 0.0F;
        field6153[11] = 0.0F;
        field6153[12] = 0.0F;
        field6153[13] = 0.0F;
        field6153[14] = 0.0F;
        field6153[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field6153, 0);
        if ((this.field6152 & 0x7) == 0) {
            this.field6158.method1950(false);
        } else {
            this.field6158.method1950(true);
            this.field6158.method2018();
        }
        this.field6158.method2008(this.field6165, this.field6168, this.field6169, this.field6159);
        if (field6143.field4064.length < this.field6155 * 2) {
            field6143 = new class276(this.field6155 * 2);
        } else {
            field6143.field4021 = 0;
        }
        int var10 = 0;
        if (this.field6158.field4514) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field5967 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field6150[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field6143.method1711(false, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field5967 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field6150[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field6143.method1691(var19[var20] & 0xFFFF, (byte) -71);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class147 var21 = new class147(this.field6158, 5123, field6143.field4064, field6143.field4021);
            this.field6158.method1998(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1221(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field6166 == null) {
            return;
        }
        float var6 = this.field6158.field4506;
        float var7 = this.field6158.field4478;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field6154.length < var9) {
            field6154 = new int[var9];
        }
        if (field6143.field4064.length < this.field6155 * 2) {
            field6143 = new class276(this.field6155 * 2);
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
        if (var14 > this.field5967 - 1) {
            var14 = this.field5967 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field5970 - 1) {
            var15 = this.field5970 - 1;
        }
        field6151 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field6154[field6151++] = this.field5967 * var18 + var16;
                }
            }
        }
        this.field6158.method1958();
        this.field6158.method1950((this.field6152 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field6166.length; var19++) {
            this.field6166[var19].method2830(field6151, field6154, 55);
        }
        if (!this.field6148.method2851(false)) {
            int var20 = this.field6158.field4483;
            int var21 = this.field6158.field4555;
            this.field6158.method682(0, var21);
            this.field6158.method686(var7, var6 - 4.0F);
            this.field6158.method1950(false);
            this.field6158.method1966(false);
            this.field6158.method1995(130);
            this.field6158.method2002(-2);
            this.field6158.method1967(this.field6158.field4504);
            this.field6158.method1992(8448, 7681);
            this.field6158.method2006(0, 34166, 770);
            this.field6158.method2017(0, 34167, 770);
            for (class238 var22 = this.field6148.method2843(1123227612); var22 != null; var22 = this.field6148.method2842(1673506446)) {
                class130 var23 = (class130) var22;
                var23.method820(arg1, arg3, arg0, (byte) -118, arg2);
            }
            this.field6158.method2006(0, 5890, 768);
            this.field6158.method2017(0, 5890, 770);
            this.field6158.method1967((class425) null);
            this.field6158.method682(var20, var21);
        }
        if (this.field6144 != null) {
            this.field6158.method686(var7, var6 - 8.0F);
            this.field6158.method1958();
            this.field6158.method2008(this.field6165, (class254) null, (class254) null, this.field6159);
            this.field6144.method1434(arg3, arg4, arg1, arg2, arg0, (byte) 126);
        }
        this.field6158.method686(var7, var6);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Leo;[I)V")
    public final void method1211(class178 arg0, int[] arg1) {
        this.field6148.method2845(new class130(this.field6158, this, arg0, arg1), (byte) 37);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ltm;IIIIZ)V")
    public final void method1215(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6144 != null && arg0 != null) {
            int var7 = arg1 - (this.field6158.field4485 * arg2 >> 8) >> this.field6158.field4464;
            int var8 = arg3 - (this.field6158.field4535 * arg2 >> 8) >> this.field6158.field4464;
            this.field6144.method1436(var8, -15101, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)V")
    public final void method1219(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1220(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
        this.method1206(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lmi;IIII[[I[[II)V")
    public class445(class315 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field6158 = arg0;
        this.field6146 = arg5;
        this.field6152 = arg2;
        while (arg7 > 1) {
            this.field6145++;
            arg7 >>= 0x1;
        }
        this.field6147 = 0x1 << this.field6145;
        this.field6135 = new int[arg3][arg4][];
        this.field6139 = new class484[arg3][arg4][];
        this.field6141 = new int[arg3][arg4][];
        this.field6136 = new int[arg3][arg4][];
        this.field6137 = new int[arg3][arg4][];
        this.field6140 = new int[arg3][arg4][];
        this.field6150 = new short[arg3 * arg4][];
        this.field6138 = new byte[arg3][arg4];
        this.field6171 = new byte[arg3 + 1][arg4 + 1];
        this.field6162 = new float[this.field5967 + 1][this.field5970 + 1];
        this.field6164 = new float[this.field5967 + 1][this.field5970 + 1];
        this.field6161 = new float[this.field5967 + 1][this.field5970 + 1];
        for (int var9 = 1; var9 < this.field5970; var9++) {
            for (int var10 = 1; var10 < this.field5967; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field6162[var10][var9] = (float) var11 * var13;
                this.field6164[var10][var9] = var13 * -256.0F;
                this.field6161[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6160 = new class470(128);
        if ((this.field6152 & 0x10) != 0) {
            this.field6144 = new class223(this.field6158, this);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Ltm;IIIIZ)Z")
    public final boolean method1210(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6144 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field6158.field4485 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field6158.field4535 * arg2 >> 8) >> 3;
            return this.field6144.method1428((byte) 122, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public final void method1212(int arg0, int arg1, int arg2) {
        if ((this.field6171[arg0][arg1] & 0xFF) < arg2) {
            this.field6171[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lgr;II)V")
    private final void method2605(class274 arg0, int arg1, int arg2) {
        int[] var4 = this.field6141[arg1][arg2];
        int[] var5 = this.field6136[arg1][arg2];
        int var6 = var4.length;
        if (field6149.length < var6) {
            field6149 = new int[var6];
            field6157 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field6149[var7] = (var4[var7] & 0xFF) >> this.field6158.field4464;
            field6157[var7] = (var5[var7] & 0xFF) >> this.field6158.field4464;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field6149[var8];
            int var10 = field6157[var8++];
            int var11 = field6149[var8];
            int var12 = field6157[var8++];
            int var13 = field6149[var8];
            int var14 = field6157[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1680(var9, var13, var11, 2631, var14, var10, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public final int method1209(int arg0, int arg1) {
        int var3 = arg0 >> this.field6145;
        int var4 = arg1 >> this.field6145;
        if (var3 < 0 || var4 < 0 || var3 > this.field5967 - 1 || var4 > this.field5970 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field6147 - 1;
        int var6 = arg1 & this.field6147 - 1;
        int var7 = (this.field6147 - var5) * this.field6146[var3][var4] + this.field6146[var3 + 1][var4] * var5 >> this.field6145;
        int var8 = (this.field6147 - var5) * this.field6146[var3][var4 + 1] + this.field6146[var3 + 1][var4 + 1] * var5 >> this.field6145;
        return (this.field6147 - var6) * var7 + var6 * var8 >> this.field6145;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
    public final int method1218(int arg0, int arg1) {
        return this.field6146[arg0][arg1];
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(Ltm;IIIIZ)V")
    public final void method1217(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field6144 != null && arg0 != null) {
            int var7 = arg1 - (this.field6158.field4485 * arg2 >> 8) >> this.field6158.field4464;
            int var8 = arg3 - (this.field6158.field4535 * arg2 >> 8) >> this.field6158.field4464;
            this.field6144.method1429(var8, arg0, -123, var7);
        }
    }
}
