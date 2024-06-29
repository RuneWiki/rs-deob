import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class417 extends class145 {

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "Loe;")
    private class137 field6221 = new class137();

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    private int field6242 = this.field2206 + -2;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "[[I")
    private int[][] field6237;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "Lkd;")
    public class188 field6239;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "[[[Lrh;")
    private class176[][][] field6225;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "[[[I")
    public int[][][] field6218;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    private int field6214;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[[B")
    private byte[][] field6206;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "[[S")
    public short[][] field6228;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[[[I")
    public int[][][] field6220;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "[[B")
    private byte[][] field6245;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "[[[I")
    private int[][][] field6232;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[[[I")
    private int[][][] field6209;

    @OriginalMember(owner = "client!lk", name = "hb", descriptor = "[[F")
    private float[][] field6253;

    @OriginalMember(owner = "client!lk", name = "lb", descriptor = "[[F")
    private float[][] field6257;

    @OriginalMember(owner = "client!lk", name = "ib", descriptor = "[[F")
    private float[][] field6254;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "[[[I")
    private int[][][] field6210;

    @OriginalMember(owner = "client!lk", name = "kb", descriptor = "Lgu;")
    private class412 field6256;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "Ler;")
    private class70 field6233;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
    public static boolean field6208 = false;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[Z")
    public static boolean[] field6215 = new boolean[8];

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
    public static int field6224 = 0;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "Lhn;")
    public static class509 field6231 = new class509(108, 0);

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
    private int field6222;

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    private int field6244;

    @OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
    private int field6248;

    @OriginalMember(owner = "client!lk", name = "eb", descriptor = "I")
    private int field6250;

    @OriginalMember(owner = "client!lk", name = "db", descriptor = "Lwu;")
    private class253 field6249;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "Lgi;")
    public class481 field6246;

    @OriginalMember(owner = "client!lk", name = "bb", descriptor = "Lgi;")
    private class481 field6247;

    @OriginalMember(owner = "client!lk", name = "fb", descriptor = "Lgi;")
    public class481 field6251;

    @OriginalMember(owner = "client!lk", name = "gb", descriptor = "Lgi;")
    public class481 field6252;

    @OriginalMember(owner = "client!lk", name = "jb", descriptor = "[Lrh;")
    private class176[] field6255;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "[[[I")
    private int[][][] field6219;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lqp;[I)V", line = 3)
    public final void method415(class470 arg0, int[] arg1) {
        this.field6221.method994(new class280(this.field6239, this, arg0, arg1), -3610);
        ++field6234;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V", line = 15)
    public final void method401(int arg0, int arg1) {
        ++field6229;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lba;IIIIZ)V", line = 30)
    public final void method410(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6227;
        if (this.field6233 != null && arg0 != null) {
            int var7 = -(this.field6239.field3161 * arg2 >> 8) + arg1 >> this.field6239.field3028;
            int var8 = -(this.field6239.field3123 * arg2 >> 8) + arg3 >> this.field6239.field3028;
            this.field6233.method609(arg0, 0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lah;I)V", line = 50)
    public static final void method2611(class263 arg0, int arg1) {
        if (arg1 != -1) {
            field6231 = null;
        }
        ++field6211;
        for (int var2 = 0; ~class219.field3588 < ~var2; ++var2) {
            int var3 = class210.field3437[var2];
            class177 var4 = class26.field319[var3];
            int var5 = arg0.method1515((byte) 127);
            if ((8 & var5) != 0) {
                var5 += arg0.method1515((byte) 126) << 8;
            }
            if (~(var5 & 1024) != -1) {
                var5 += arg0.method1515((byte) 127) << 16;
            }
            class147.method1038(var5, -84, var4, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 82)
    public final int method412(int arg0, int arg1) {
        ++field6241;
        int var3 = arg0 >> super.field2206;
        int var4 = arg1 >> super.field2206;
        if (~var3 <= -1 && ~var4 <= -1 && var3 <= super.field2207 + -1 && ~(super.field2211 + -1) <= ~var4) {
            int var5 = arg0 & super.field2210 + -1;
            int var6 = arg1 & super.field2210 - 1;
            int var7 = (super.field2210 - var5) * this.field6237[var3][var4] + this.field6237[var3 - -1][var4] * var5 >> super.field2206;
            int var8 = (-var5 + super.field2210) * this.field6237[var3][var4 - -1] - -(this.field6237[var3 + 1][var4 - -1] * var5) >> super.field2206;
            return (-var6 + super.field2210) * var7 + var6 * var8 >> super.field2206;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[[ZZIII)V", line = 108)
    private final void method2612(int arg0, int arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -5619) {
            this.method415((class470) null, (int[]) null);
        }
        if (this.field6255 != null) {
            float var8 = this.field6239.field3164;
            float var9 = this.field6239.field3088;
            int var10 = arg0 - -1 + arg0;
            int var11 = var10 * var10;
            if (~this.field6239.field3169.length > ~var11) {
                this.field6239.field3169 = new int[var11];
            }
            if (~this.field6239.field3055.field3572.length > ~(this.field6244 * 2)) {
                this.field6239.field3055 = new class23(this.field6244 * 2);
            }
            int var12 = arg4 - arg0;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = -arg0 + arg5;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg0 + arg4;
            if (var16 > super.field2207 + -1) {
                var16 = super.field2207 + -1;
            }
            int var17 = arg0 + arg5;
            if (~(super.field2211 + -1) > ~var17) {
                var17 = super.field2211 - 1;
            }
            int var18 = 0;
            int[] var19 = this.field6239.field3169;
            for (int var20 = var12; var16 >= var20; ++var20) {
                boolean[] var26 = arg2[-var13 + var20];
                for (int var27 = var14; var27 <= var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field2207 * var27 + var20;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field6239.method1245((float) arg1, (byte) 57);
                this.field6239.method1268((byte) -58);
            } else {
                this.field6239.method1271(-9744);
            }
            this.field6239.method1272(~(this.field6238 & 7) != -1, 101);
            for (int var21 = 0; this.field6255.length > var21; ++var21) {
                this.field6255[var21].method1173(var18, var19, -1);
            }
            if (!this.field6221.method1005((byte) 40)) {
                int var22 = this.field6239.field3073;
                int var23 = this.field6239.field3094;
                this.field6239.method371(0, var23, this.field6239.field3058);
                this.field6239.method365(var9, var8 + -4.0F);
                this.field6239.method1272(false, arg6 ^ 5571);
                this.field6239.method1294(false, arg6 + 39784);
                this.field6239.method1291(128, false);
                this.field6239.method1304(-26349, -2);
                this.field6239.method1289(-19391, this.field6239.field3068);
                this.field6239.method1242(34162, 7681, 8448);
                this.field6239.method1266(770, 0, 34166, arg6 + 14579);
                this.field6239.method1296(770, 34167, 0, (byte) 79);
                for (class431 var24 = this.field6221.method1004((byte) -122); var24 != null; var24 = this.field6221.method996(1)) {
                    class280 var25 = (class280) var24;
                    var25.method1824(arg2, arg0, true, arg5, arg4);
                }
                this.field6239.method1266(768, 0, 5890, arg6 + 14579);
                this.field6239.method1296(770, 5890, 0, (byte) -75);
                this.field6239.method1289(-19391, (class454) null);
                this.field6239.method371(var22, var23, this.field6239.field3058);
            }
            if (this.field6233 != null) {
                this.field6239.method365(var9, var8 + -8.0F);
                this.field6239.method1271(-9744);
                this.field6239.method1267((class481) null, this.field6246, (byte) -122, this.field6252, (class481) null);
                this.field6233.method611(arg3, true, arg2, arg4, arg0, arg5);
            }
            this.field6239.method365(var9, var8);
        }
        ++field6226;
    }

    @OriginalMember(owner = "client!lk", name = "ca", descriptor = "()V", line = 257)
    public final void method407() {
        if (this.field6248 <= 0) {
            this.field6233 = null;
        } else {
            byte[][] var1 = new byte[super.field2207 + 1][super.field2211 + 1];
            for (int var2 = 1; super.field2207 > var2; ++var2) {
                for (int var103 = 1; super.field2211 > var103; ++var103) {
                    var1[var2][var103] = (byte) ((this.field6245[var2][var103] >> 1) + (this.field6245[var2][var103 + 1] >> 3) + (this.field6245[var2][var103 + -1] >> 2) + (this.field6245[var2 + -1][var103] >> 2) + (this.field6245[var2 + 1][var103] >> 3));
                }
            }
            this.field6255 = new class176[this.field6256.method2593(0)];
            this.field6256.method2584((byte) -117, this.field6255);
            for (int var3 = 0; ~this.field6255.length < ~var3; ++var3) {
                this.field6255[var3].method1174(false, this.field6248);
            }
            int var4 = 24;
            if (this.field6219 != null) {
                var4 += 4;
            }
            if ((7 & this.field6238) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field6239.field3029.method2727(this.field6248 * var4);
            NativeStream var6 = new NativeStream(var5);
            class176[] var7 = new class176[this.field6248];
            int var8 = class324.method2059((byte) 117, this.field6248 / 4);
            if (var8 < 1) {
                var8 = 1;
            }
            class412 var9 = new class412(var8);
            class176[] var10 = new class176[this.field6250];
            for (int var11 = 0; ~var11 > ~super.field2207; ++var11) {
                for (int var30 = 0; ~var30 > ~super.field2211; ++var30) {
                    if (this.field6232[var11][var30] != null) {
                        class176[] var31 = this.field6225[var11][var30];
                        int[] var32 = this.field6220[var11][var30];
                        int[] var33 = this.field6218[var11][var30];
                        int[] var34 = this.field6209[var11][var30];
                        int[] var35 = this.field6232[var11][var30];
                        int[] var36 = this.field6210 == null ? null : this.field6210[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field6219 != null ? this.field6219[var11][var30] : null;
                        float var38 = this.field6253[var11][var30];
                        float var39 = this.field6257[var11][var30];
                        float var40 = this.field6254[var11][var30];
                        float var41 = this.field6253[var11][var30 - -1];
                        float var42 = this.field6257[var11][var30 + 1];
                        float var43 = this.field6254[var11][var30 + 1];
                        float var44 = this.field6253[var11 + 1][var30 + 1];
                        float var45 = this.field6257[var11 + 1][var30 + 1];
                        float var46 = this.field6254[var11 - -1][var30 + 1];
                        float var47 = this.field6253[var11 - -1][var30];
                        float var48 = this.field6257[var11 + 1][var30];
                        float var49 = this.field6254[var11 + 1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label342: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class176 var101 = var31[var55];
                            for (int var102 = 0; var54 > var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label342;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field6228[super.field2207 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field2206) - -var32[var57];
                            int var59 = (var30 << super.field2206) + var33[var57];
                            int var60 = var58 >> this.field6242;
                            int var61 = var59 >> this.field6242;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var63 << 48 | (long) var62 << 32 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            float var74;
                            int var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var40;
                                var73 = var39;
                                var74 = var38;
                                var75 = var69 - var50;
                            } else if (var67 == 0 && super.field2210 == var68) {
                                var74 = var41;
                                var75 = var69 - var51;
                                var72 = var43;
                                var73 = var42;
                            } else if (~super.field2210 == ~var67 && super.field2210 == var68) {
                                var72 = var46;
                                var75 = var69 - var52;
                                var74 = var44;
                                var73 = var45;
                            } else if (super.field2210 == var67 && var68 == 0) {
                                var73 = var48;
                                var74 = var47;
                                var75 = var69 - var53;
                                var72 = var49;
                            } else {
                                float var76 = (float) var67 / (float) super.field2210;
                                float var77 = (float) var68 / (float) super.field2210;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                var74 = (var81 - var78) * var77 + var78;
                                var73 = (-var79 + var82) * var77 + var79;
                                float var83 = (-var43 + var46) * var76 + var43;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field2206) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field2206) + var51;
                                var75 = var69 - (var84 - -((-var84 + var85) * var68 >> super.field2206));
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var75 >> 7;
                                if (~var86 <= -3) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((this.field6238 & 7) == 0) {
                                    float var87 = this.field6239.field3147[2] * var72 + this.field6239.field3147[0] * var74 + this.field6239.field3147[1] * var73;
                                    var71 = this.field6239.field3134 + var87 * (!(var87 > 0.0F) ? this.field6239.field3062 : this.field6239.field3121);
                                }
                                var70 = class312.field4694[var62 & 65408 | var86];
                            }
                            class431 var88 = null;
                            if ((var58 & this.field6214 + -1) == 0 && ~(this.field6214 + -1 & var59) == -1) {
                                var88 = var9.method2585((byte) 114, var65);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (var63 & 127) * var75 >> 7;
                                    if (~var90 <= -3) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class312.field4694[65408 & var63 | var90];
                                    if (~(7 & this.field6238) == -1) {
                                        float var91 = this.field6239.field3147[2] * var72 + this.field6239.field3147[1] * var73 + this.field6239.field3147[0] * var74;
                                        float var92 = var71 * (!(var71 > 0.0F) ? this.field6239.field3062 : this.field6239.field3121) + this.field6239.field3134;
                                        int var93 = (var89 & 16775119) >> 16;
                                        int var94 = 255 & var89 >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (~var95 > -1) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        if (var97 >= 0) {
                                            if (var97 > 255) {
                                                var97 = 255;
                                            }
                                        } else {
                                            var97 = 0;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var98 | var95 << 16 | var97 << 8;
                                    }
                                }
                                if (!this.field6239.field3141) {
                                    var6.method2722((float) var58);
                                    var6.method2722((float) (this.method412(var58, var59) - -var64));
                                    var6.method2722((float) var59);
                                    var6.method2720((byte) (var89 >> 16));
                                    var6.method2720((byte) (var89 >> 8));
                                    var6.method2720((byte) var89);
                                    var6.method2720(-1);
                                    var6.method2722((float) var58);
                                    var6.method2722((float) var59);
                                    if (this.field6219 != null) {
                                        var6.method2722((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if (~(this.field6238 & 7) != -1) {
                                        var6.method2722(var74);
                                        var6.method2722(var73);
                                        var6.method2722(var72);
                                    }
                                } else {
                                    var6.method2723((float) var58);
                                    var6.method2723((float) (this.method412(var58, var59) - -var64));
                                    var6.method2723((float) var59);
                                    var6.method2720((byte) (var89 >> 16));
                                    var6.method2720((byte) (var89 >> 8));
                                    var6.method2720((byte) var89);
                                    var6.method2720(-1);
                                    var6.method2723((float) var58);
                                    var6.method2723((float) var59);
                                    if (this.field6219 != null) {
                                        var6.method2723((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field6238 & 7) != -1) {
                                        var6.method2723(var74);
                                        var6.method2723(var73);
                                        var6.method2723(var72);
                                    }
                                }
                                var99 = this.field6222++;
                                var56[var57] = (short) var99;
                                if (var62 != -1) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method2591(var65, new class49(var56[var57]), (byte) -103);
                            } else {
                                var56[var57] = ((class49) var88).field631;
                                var99 = var56[var57] & 65535;
                                if (~var62 != 0 && var7[var99].field6388 > var31[var57].field6388) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method1179(var70, var99, var75, var71, true);
                            }
                            ++this.field6244;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field6222; ++var12) {
                class176 var29 = var7[var12];
                if (var29 != null) {
                    var29.method1176(var12, -115);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2207; ++var13) {
                for (int var18 = 0; ~super.field2211 < ~var18; ++var18) {
                    short[] var19 = this.field6228[super.field2207 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = var19[var21++] & 65535;
                            class176 var25 = var7[var22];
                            class176 var26 = var7[var23];
                            class176 var27 = var7[var24];
                            class176 var28 = null;
                            if (var25 != null) {
                                var25.method1180(var20, var13, var18, 0);
                                var28 = var25;
                            }
                            if (var26 != null) {
                                var26.method1180(var20, var13, var18, 0);
                                if (var28 == null || ~var26.field6388 > ~var28.field6388) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method1180(var20, var13, var18, 0);
                                if (var28 == null || var27.field6388 < var28.field6388) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method1176(var22, -116);
                                }
                                if (var26 != null) {
                                    var28.method1176(var23, -121);
                                }
                                if (var27 != null) {
                                    var28.method1176(var24, -121);
                                }
                                var28.method1180(var20, var13, var18, 0);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2724();
            this.field6249 = this.field6239.method1302(false, (byte) -125, var4, var5, var6.method2719());
            this.field6252 = new class481(this.field6249, 5126, 3, 0);
            this.field6247 = new class481(this.field6249, 5121, 4, 12);
            byte var14;
            if (this.field6219 != null) {
                var14 = 28;
                this.field6246 = new class481(this.field6249, 5126, 3, 16);
            } else {
                var14 = 24;
                this.field6246 = new class481(this.field6249, 5126, 2, 16);
            }
            if (~(this.field6238 & 7) != -1) {
                this.field6251 = new class481(this.field6249, 5126, 3, var14);
            }
            long[] var15 = new long[this.field6255.length];
            for (int var16 = 0; this.field6255.length > var16; ++var16) {
                class176 var17 = this.field6255[var16];
                var15[var16] = var17.field6388;
                var17.method1178(true, this.field6222);
            }
            class127.method928(this.field6255, var15, -106);
            if (this.field6233 != null) {
                this.field6233.method608((byte) 104);
            }
        }
        ++field6243;
        this.field6219 = null;
        this.field6209 = null;
        this.field6225 = null;
        this.field6210 = null;
        this.field6245 = null;
        this.field6220 = this.field6218 = null;
        this.field6253 = this.field6257 = this.field6254 = null;
        this.field6256 = null;
        this.field6232 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V", line = 832)
    public static final void method2613(boolean arg0, int arg1) {
        ++field6223;
        if (class162.field2413 != null) {
            class162.field2413.method1966(108);
            class162.field2413 = null;
        }
        class500.field7185 = 0;
        class123.method912(true);
        class505.method3009();
        if (arg1 > -2) {
            field6224 = -10;
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            class184.field2758[var2].method1161(-14);
        }
        class387.method2419(false, (byte) -1);
        System.gc();
        class141.method1015(2, (byte) -97);
        class459.field6673 = false;
        class491.field7055 = -1;
        class345.method2154(true, (byte) -65);
        class265.field4073 = 0;
        class390.field5842 = 0;
        class517.field7520 = 0;
        class176.field2613 = 0;
        class136.field2073 = 0;
        for (int var3 = 0; ~var3 > ~class303.field4580.length; ++var3) {
            class303.field4580[var3] = null;
        }
        class119.method897((byte) -45);
        for (int var4 = 0; ~var4 > -2049; ++var4) {
            class26.field319[var4] = null;
        }
        class167.field2471 = 0;
        for (int var5 = 0; ~var5 > -32769; ++var5) {
            class153.field2265[var5] = null;
        }
        class334.field4985.method2588(-115);
        class474.method2853((byte) 30);
        class483.field6955 = 0;
        class195.field3271.method2132(106);
        class356.method2232(-29);
        class171.method1147(1553722848);
        class304.field4595 = null;
        class94.field1329 = 0L;
        if (!arg0) {
            class74.method643(2, (byte) -113);
            try {
                class513.method3040("loggedout", class360.field5349.field5199, 1360);
            } catch (Throwable var6) {
            }
        } else {
            class74.method643(11, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 918)
    public final void method414(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field6219 == null) {
            this.field6219 = new int[super.field2207][super.field2211][];
        }
        if (arg3 != null && this.field6210 == null) {
            this.field6210 = new int[super.field2207][super.field2211][];
        }
        ++field6213;
        this.field6220[arg0][arg1] = arg2;
        this.field6218[arg0][arg1] = arg4;
        this.field6232[arg0][arg1] = arg6;
        this.field6209[arg0][arg1] = arg7;
        if (this.field6219 != null) {
            this.field6219[arg0][arg1] = arg5;
        }
        if (this.field6210 != null) {
            this.field6210[arg0][arg1] = arg3;
        }
        class176[] var15 = this.field6225[arg0][arg1] = new class176[arg6.length];
        for (int var16 = 0; ~var16 > ~arg6.length; ++var16) {
            long var17 = (long) arg8[var16] | (long) (arg9[var16] << 14) | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48;
            class431 var19;
            for (var19 = this.field6256.method2585((byte) 114, var17); var19 != null; var19 = this.field6256.method2590((byte) 87)) {
                class176 var20 = (class176) var19;
                if (arg8[var16] == var20.field2630 && (float) arg9[var16] == var20.field2626 && var20.field2610 == arg10 && ~var20.field2615 == ~arg11 && ~var20.field2618 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class176(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field6256.method2591(var17, var15[var16], (byte) -124);
            } else {
                var15[var16] = (class176) var19;
            }
        }
        if (arg13) {
            this.field6206[arg0][arg1] = (byte) class264.method1763(this.field6206[arg0][arg1], 1);
        }
        if (this.field6250 < arg6.length) {
            this.field6250 = arg6.length;
        }
        this.field6248 += arg6.length;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III[[ZZ)V", line = 994)
    public final void method404(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method2612(arg2, -1, arg3, arg4, arg0, arg1, -5619);
        ++field6217;
    }

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "(Lba;IIIIZ)V", line = 1006)
    public final void method413(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6207;
        if (this.field6233 != null && arg0 != null) {
            int var7 = arg1 - (this.field6239.field3161 * arg2 >> 8) >> this.field6239.field3028;
            int var8 = arg3 - (this.field6239.field3123 * arg2 >> 8) >> this.field6239.field3028;
            this.field6233.method613(false, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lkd;IIII[[I[[II)V", line = 1024)
    public class417(class188 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field6237 = arg5;
        this.field6239 = arg0;
        this.field6225 = new class176[arg3][arg4][];
        this.field6218 = new int[arg3][arg4][];
        this.field6214 = 1 << this.field6242;
        this.field6206 = new byte[arg3][arg4];
        this.field6228 = new short[arg3 * arg4][];
        this.field6220 = new int[arg3][arg4][];
        this.field6238 = arg2;
        this.field6245 = new byte[arg3 + 1][arg4 - -1];
        this.field6232 = new int[arg3][arg4][];
        this.field6209 = new int[arg3][arg4][];
        this.field6253 = new float[super.field2207 + 1][super.field2211 + 1];
        this.field6257 = new float[super.field2207 + 1][super.field2211 + 1];
        this.field6254 = new float[super.field2207 + 1][super.field2211 + 1];
        this.field6210 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field2211 < ~var9; ++var9) {
            for (int var10 = 1; super.field2207 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var12 * var12 - -(arg7 * 4 * arg7))));
                this.field6253[var10][var9] = (float) var11 * var13;
                this.field6257[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field6254[var10][var9] = (float) var12 * var13;
            }
        }
        this.field6256 = new class412(128);
        if ((16 & this.field6238) != 0) {
            this.field6233 = new class70(this.field6239, this);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V", line = 1082)
    public static void method2614(byte arg0) {
        if (arg0 <= -122) {
            field6231 = null;
            field6215 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lba;IIIIZ)Z", line = 1097)
    public final boolean method399(class265 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field6216;
        if (this.field6233 != null && arg0 != null) {
            int var7 = -(this.field6239.field3161 * arg2 >> 8) + arg1 >> this.field6239.field3028;
            int var8 = -(this.field6239.field3123 * arg2 >> 8) + arg3 >> this.field6239.field3028;
            return this.field6233.method610(105, arg0, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1119)
    public final void method403(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field6212;
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
        for (int var28 = 0; var18 > var28; ++var28) {
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
            ++var27;
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
            ++var27;
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
            ++var27;
        }
        this.method414(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)Z", line = 1211)
    public static final boolean method2615(byte arg0) {
        ++field6230;
        try {
            if (~class60.field718 == -3) {
                if (class95.field1358 == null) {
                    class95.field1358 = class439.method2705(class216.field3506, class150.field2248, class53.field665);
                    if (class95.field1358 == null) {
                        return false;
                    }
                }
                if (class271.field4151 == null) {
                    class271.field4151 = new class256(class497.field7149, class470.field6786);
                }
                if (class448.field6563.method1879(class271.field4151, 22050, class95.field1358, class404.field5991, 13646)) {
                    class448.field6563.method1872((byte) -78);
                    class448.field6563.method1900(class326.field4909, (byte) -122);
                    class448.field6563.method1898(class359.field5329, (byte) 123, class95.field1358);
                    class271.field4151 = null;
                    class216.field3506 = null;
                    class60.field718 = 0;
                    class95.field1358 = null;
                    return true;
                }
            }
            if (arg0 <= 40) {
                field6208 = true;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class448.field6563.method1880((byte) 61);
            class271.field4151 = null;
            class95.field1358 = null;
            class216.field3506 = null;
            class60.field718 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "(IILba;)Lba;", line = 1262)
    public final class265 method408(int arg0, int arg1, class265 arg2) {
        ++field6236;
        if (~(1 & this.field6206[arg0][arg1]) == -1) {
            return null;
        } else {
            int var4 = super.field2210 >> this.field6239.field3028;
            class339 var5 = (class339) arg2;
            class339 var6;
            if (var5 != null && var5.method2143(var4, var4, 24853)) {
                var6 = var5;
                var5.method2142(-91);
            } else {
                var6 = new class339(this.field6239, var4, var4);
            }
            var6.method2144(0, -1, var4, var4, 0);
            this.method2616(arg0, arg1, var6, 0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILaa;I)V", line = 1294)
    private final void method2616(int arg0, int arg1, class339 arg2, int arg3) {
        ++field6235;
        int[] var5 = this.field6220[arg0][arg1];
        int[] var6 = this.field6218[arg0][arg1];
        int var7 = var5.length;
        if (~this.field6239.field3168.length > ~var7) {
            this.field6239.field3168 = new int[var7];
            this.field6239.field3172 = new int[var7];
        }
        int[] var8 = this.field6239.field3168;
        int[] var9 = this.field6239.field3172;
        for (int var10 = 0; ~var10 > ~var7; ++var10) {
            var8[var10] = class74.method644(255, var5[var10]) >> this.field6239.field3028;
            var9[var10] = class74.method644(255, var6[var10]) >> this.field6239.field3028;
        }
        int var11 = arg3;
        while (var7 > var11) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (-var17 + var15) + -((var15 - var13) * (-var14 + var16)) > 0) {
                arg2.method2141(var13, var15, var17, var16, true, var14, var12);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "(II)I", line = 1353)
    public final int method411(int arg0, int arg1) {
        ++field6205;
        return this.field6237[arg0][arg1];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1362)
    public final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6240;
        if (~this.field6248 < -1) {
            this.field6239.method1287(0);
            this.field6239.method1303(false, 20873);
            this.field6239.method1272(false, -67);
            this.field6239.method1299(false, false);
            this.field6239.method1294(false, 34165);
            this.field6239.method1291(0, false);
            this.field6239.method1304(-26349, -2);
            this.field6239.method1289(-19391, (class454) null);
            class73.field1040[4] = 0.0F;
            class73.field1040[9] = 0.0F;
            class73.field1040[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field6239.field3014;
            class73.field1040[1] = 0.0F;
            class73.field1040[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field6239.field2993) + 1.0F;
            class73.field1040[10] = 0.0F;
            class73.field1040[14] = 0.0F;
            class73.field1040[8] = 0.0F;
            class73.field1040[11] = 0.0F;
            class73.field1040[7] = 0.0F;
            class73.field1040[0] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field6239.field3014);
            class73.field1040[15] = 1.0F;
            class73.field1040[6] = 0.0F;
            class73.field1040[3] = 0.0F;
            class73.field1040[2] = 0.0F;
            class73.field1040[5] = (float) arg2 / ((float) super.field2210 * 128.0F * (float) this.field6239.field2993);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class73.field1040, 0);
            class73.field1040[14] = 0.0F;
            class73.field1040[11] = 0.0F;
            class73.field1040[2] = 0.0F;
            class73.field1040[10] = 0.0F;
            class73.field1040[4] = 0.0F;
            class73.field1040[9] = 1.0F;
            class73.field1040[3] = 0.0F;
            class73.field1040[7] = 0.0F;
            class73.field1040[8] = 0.0F;
            class73.field1040[6] = 1.0F;
            class73.field1040[12] = 0.0F;
            class73.field1040[15] = 1.0F;
            class73.field1040[0] = 1.0F;
            class73.field1040[5] = 0.0F;
            class73.field1040[1] = 0.0F;
            class73.field1040[13] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class73.field1040, 0);
            if (~(this.field6238 & 7) == -1) {
                this.field6239.method1272(false, -109);
            } else {
                this.field6239.method1272(true, 121);
                this.field6239.method1305(72);
            }
            this.field6239.method1267(this.field6251, this.field6246, (byte) -124, this.field6252, this.field6247);
            if (this.field6239.field3055.field3572.length >= this.field6244 * 2) {
                this.field6239.field3055.field3556 = 0;
            } else {
                this.field6239.field3055 = new class23(this.field6244 * 2);
            }
            int var9 = 0;
            class23 var10 = this.field6239.field3055;
            if (this.field6239.field3141) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field2207 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[-arg3 + var13][-arg4 + var11]) {
                            short[] var14 = this.field6228[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var15 > ~var14.length; ++var15) {
                                    ++var9;
                                    var10.method1542(65535 & var14[var15], -2756);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field2207 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field6228[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var20.length > var21; ++var21) {
                                    var10.method1504((byte) 104, var20[var21] & 65535);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class469 var17 = new class469(this.field6239, 5123, var10.field3572, var10.field3556);
                this.field6239.method1270(var17, var9, 0, 4, -2);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(III)V", line = 1541)
    public final void method405(int arg0, int arg1, int arg2) {
        ++field6204;
        if (~(255 & this.field6245[arg0][arg1]) > ~arg2) {
            this.field6245[arg0][arg1] = (byte) arg2;
        }
    }
}
