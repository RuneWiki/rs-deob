import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class627 extends class174 {

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "Ldm;")
    private class46 field9138 = new class46();

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "[[I")
    private int[][] field9161;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "Lgi;")
    public class583 field9143;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[[S")
    public short[][] field9156;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
    private int field9157;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "[[[I")
    public int[][][] field9162;

    @OriginalMember(owner = "client!ql", name = "bb", descriptor = "[[F")
    private float[][] field9183;

    @OriginalMember(owner = "client!ql", name = "T", descriptor = "[[F")
    private float[][] field9175;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "[[[I")
    private int[][][] field9144;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public int field9149;

    @OriginalMember(owner = "client!ql", name = "S", descriptor = "[[B")
    private byte[][] field9174;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "[[B")
    private byte[][] field9169;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "[[[Lnda;")
    private class478[][][] field9168;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[[[I")
    private int[][][] field9166;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "[[[I")
    private int[][][] field9154;

    @OriginalMember(owner = "client!ql", name = "Y", descriptor = "[[F")
    private float[][] field9180;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "[[[I")
    public int[][][] field9153;

    @OriginalMember(owner = "client!ql", name = "ab", descriptor = "Ldea;")
    private class205 field9182;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "Lwh;")
    private class127 field9147;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field9139;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    private int field9148;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
    public static int field9150;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    private int field9164;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public static int field9165;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
    private int field9177;

    @OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
    private int field9186;

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "Lqd;")
    private class381 field9179;

    @OriginalMember(owner = "client!ql", name = "W", descriptor = "Ldd;")
    public class603 field9178;

    @OriginalMember(owner = "client!ql", name = "Z", descriptor = "Ldd;")
    public class603 field9181;

    @OriginalMember(owner = "client!ql", name = "cb", descriptor = "Ldd;")
    private class603 field9184;

    @OriginalMember(owner = "client!ql", name = "db", descriptor = "Ldd;")
    public class603 field9185;

    @OriginalMember(owner = "client!ql", name = "U", descriptor = "[Lnda;")
    private class478[] field9176;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[[[I")
    private int[][][] field9140;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII[[ZIZ)V")
    private final void method3656(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int arg5, boolean arg6) {
        if (arg1 != 23238) {
            this.field9154 = null;
        }
        if (this.field9176 != null) {
            float var8 = this.field9143.field8264;
            float var9 = this.field9143.field8324;
            int var10 = arg5 - -1 + arg5;
            int var11 = var10 * var10;
            if (~this.field9143.field8345.length > ~var11) {
                this.field9143.field8345 = new int[var11];
            }
            if (~this.field9143.field8288.field138.length > ~(this.field9148 * 2)) {
                this.field9143.field8288 = new class541(this.field9148 * 2);
            }
            int var12 = -arg5 + arg2;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 - arg5;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg2 - -arg5;
            if (~var16 < ~(super.field2505 - 1)) {
                var16 = super.field2505 + -1;
            }
            int var17 = arg0 + arg5;
            if (~var17 < ~(super.field2503 + -1)) {
                var17 = super.field2503 + -1;
            }
            int var18 = 0;
            int[] var19 = this.field9143.field8345;
            for (int var20 = var12; ~var20 >= ~var16; ++var20) {
                boolean[] var26 = arg4[-var13 + var20];
                for (int var27 = var14; ~var17 <= ~var27; ++var27) {
                    if (var26[var27 - var15]) {
                        var19[var18++] = super.field2505 * var27 + var20;
                    }
                }
            }
            if (~arg3 != 0) {
                this.field9143.method3365((float) arg3, arg1 ^ 23212);
                this.field9143.method3347((byte) 115);
            } else {
                this.field9143.method3329(8);
            }
            this.field9143.method3330(~(7 & this.field9149) != -1, (byte) 36);
            for (int var21 = 0; var21 < this.field9176.length; ++var21) {
                this.field9176[var21].method2787(var19, var18, arg1 ^ 23187);
            }
            if (!this.field9138.method466((byte) 87)) {
                int var22 = this.field9143.field8336;
                int var23 = this.field9143.field8286;
                this.field9143.method1334(0, var23, this.field9143.field8317);
                this.field9143.method1333(var9, var8 - 4.0F);
                this.field9143.method3330(false, (byte) 36);
                this.field9143.method3331(false, arg1 + -48345);
                this.field9143.method3348(128, (byte) 44);
                this.field9143.method3408(-2, (byte) 27);
                this.field9143.method3358(32886, this.field9143.field8296);
                this.field9143.method3389(false, 8448, 7681);
                this.field9143.method3407(0, 770, -117, 34166);
                this.field9143.method3340(770, 0, 34167, 1);
                for (class176 var24 = this.field9138.method456((byte) -92); var24 != null; var24 = this.field9138.method460((byte) 87)) {
                    class167 var25 = (class167) var24;
                    var25.method1069(arg4, (byte) 107, arg0, arg2, arg5);
                }
                this.field9143.method3407(0, 768, -121, 5890);
                this.field9143.method3340(770, 0, 5890, 1);
                this.field9143.method3358(32886, (class418) null);
                this.field9143.method1334(var22, var23, this.field9143.field8317);
            }
            if (this.field9147 != null) {
                this.field9143.method1333(var9, var8 + -8.0F);
                this.field9143.method3329(8);
                this.field9143.method3380((class603) null, (class603) null, this.field9185, 15097, this.field9178);
                this.field9147.method880(arg5, arg4, arg2, arg6, arg0, arg1 + -23237);
            }
            this.field9143.method1333(var9, var8);
        }
        ++field9165;
    }

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "()V")
    public final void method1098() {
        if (~this.field9186 >= -1) {
            this.field9147 = null;
        } else {
            byte[][] var1 = new byte[super.field2505 + 1][super.field2503 - -1];
            for (int var2 = 1; ~super.field2505 < ~var2; ++var2) {
                for (int var103 = 1; ~var103 > ~super.field2503; ++var103) {
                    var1[var2][var103] = (byte) ((this.field9174[var2][var103] >> 1) + (this.field9174[var2][var103 + -1] >> 2) + (this.field9174[var2 + 1][var103] >> 3) + (this.field9174[var2][var103 + 1] >> 3) + (this.field9174[var2 + -1][var103] >> 2));
                }
            }
            this.field9176 = new class478[this.field9182.method1250(0)];
            this.field9182.method1246(this.field9176, -97);
            for (int var3 = 0; ~this.field9176.length < ~var3; ++var3) {
                this.field9176[var3].method2785(6376, this.field9186);
            }
            int var4 = 24;
            if (this.field9140 != null) {
                var4 += 4;
            }
            if ((7 & this.field9149) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field9143.field8203.method3286(this.field9186 * var4, false);
            Stream var6 = new Stream(var5);
            class478[] var7 = new class478[this.field9186];
            int var8 = class327.method2020(-1594581311, this.field9186 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class205 var9 = new class205(var8);
            class478[] var10 = new class478[this.field9177];
            for (int var11 = 0; var11 < super.field2505; ++var11) {
                for (int var30 = 0; ~super.field2503 < ~var30; ++var30) {
                    if (this.field9166[var11][var30] != null) {
                        class478[] var31 = this.field9168[var11][var30];
                        int[] var32 = this.field9153[var11][var30];
                        int[] var33 = this.field9162[var11][var30];
                        int[] var34 = this.field9144[var11][var30];
                        int[] var35 = this.field9166[var11][var30];
                        int[] var36 = this.field9154 == null ? null : this.field9154[var11][var30];
                        if (var34 == null) {
                            var34 = var35;
                        }
                        int[] var37 = this.field9140 != null ? this.field9140[var11][var30] : null;
                        float var38 = this.field9180[var11][var30];
                        float var39 = this.field9183[var11][var30];
                        float var40 = this.field9175[var11][var30];
                        float var41 = this.field9180[var11][var30 - -1];
                        float var42 = this.field9183[var11][var30 + 1];
                        float var43 = this.field9175[var11][var30 + 1];
                        float var44 = this.field9180[var11 - -1][var30 + 1];
                        float var45 = this.field9183[var11 + 1][var30 + 1];
                        float var46 = this.field9175[var11 + 1][var30 - -1];
                        float var47 = this.field9180[var11 + 1][var30];
                        float var48 = this.field9183[var11 - -1][var30];
                        float var49 = this.field9175[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 + 1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; var35.length > var55; ++var55) {
                            class478 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field9156[super.field2505 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var57 < var35.length; ++var57) {
                            int var58 = (var11 << super.field2506) + var32[var57];
                            int var59 = (var30 << super.field2506) - -var33[var57];
                            int var60 = var58 >> this.field9172;
                            int var61 = var59 >> this.field9172;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var62 << 32 | (long) var63 << 48 | (long) (var60 << 16) | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            int var71;
                            float var72;
                            float var73;
                            float var74;
                            if (var67 == 0 && ~var68 == -1) {
                                var71 = var69 - var50;
                                var72 = var38;
                                var73 = var39;
                                var74 = var40;
                            } else if (var67 == 0 && ~super.field2504 == ~var68) {
                                var72 = var41;
                                var73 = var42;
                                var74 = var43;
                                var71 = var69 - var51;
                            } else if (~super.field2504 == ~var67 && ~super.field2504 == ~var68) {
                                var74 = var46;
                                var71 = var69 - var52;
                                var73 = var45;
                                var72 = var44;
                            } else if (super.field2504 == var67 && ~var68 == -1) {
                                var74 = var49;
                                var73 = var48;
                                var71 = var69 - var53;
                                var72 = var47;
                            } else {
                                float var75 = (float) var67 / (float) super.field2504;
                                float var76 = (float) var68 / (float) super.field2504;
                                float var77 = (-var38 + var47) * var75 + var38;
                                float var78 = (var48 - var39) * var75 + var39;
                                float var79 = (var49 - var40) * var75 + var40;
                                float var80 = (-var41 + var44) * var75 + var41;
                                float var81 = (var45 - var42) * var75 + var42;
                                float var82 = (var46 - var43) * var75 + var43;
                                var73 = (var81 - var78) * var76 + var78;
                                var72 = (var80 - var77) * var76 + var77;
                                var74 = (var82 - var79) * var76 + var79;
                                int var83 = ((var53 - var50) * var67 >> super.field2506) + var50;
                                int var84 = var51 - -((var52 - var51) * var67 >> super.field2506);
                                var71 = var69 - (((-var83 + var84) * var68 >> super.field2506) + var83);
                            }
                            float var85 = 1.0F;
                            if (~var62 != 0) {
                                int var86 = (var62 & 127) * var71 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if ((this.field9149 & 7) == 0) {
                                    float var87 = this.field9143.field8329[2] * var74 + this.field9143.field8329[0] * var72 + this.field9143.field8329[1] * var73;
                                    var85 = this.field9143.field8245 + var87 * (!(var87 > 0.0F) ? this.field9143.field8267 : this.field9143.field8310);
                                }
                                var70 = class118.field1940[65408 & var62 | var86];
                            }
                            class176 var88 = null;
                            if (~(var58 & this.field9157 + -1) == -1 && (this.field9157 + -1 & var59) == 0) {
                                var88 = var9.method1242(0, var65);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class486) var88).field6828;
                                var89 = 65535 & var56[var57];
                                if (~var62 != 0 && ~var7[var89].field2524 < ~var31[var57].field2524) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var71 >> 7;
                                    if (var91 < 2) {
                                        var91 = 2;
                                    } else if (~var91 < -127) {
                                        var91 = 126;
                                    }
                                    var90 = class118.field1940[var91 | 65408 & var63];
                                    if (~(7 & this.field9149) == -1) {
                                        float var92 = this.field9143.field8329[2] * var74 + this.field9143.field8329[0] * var72 + this.field9143.field8329[1] * var73;
                                        float var93 = this.field9143.field8245 + var85 * (var85 > 0.0F ? this.field9143.field8310 : this.field9143.field8267);
                                        int var94 = var90 >> 16 & 255;
                                        int var95 = (65474 & var90) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = var90 & 255;
                                        if (~var96 <= -1) {
                                            if (~var96 < -256) {
                                                var96 = 255;
                                            }
                                        } else {
                                            var96 = 0;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var98 >= 0) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (~var99 <= -1) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var96 << 16 | var98 << 8 | var99;
                                    }
                                }
                                if (this.field9143.field8254) {
                                    var6.method3289((float) var58);
                                    var6.method3289((float) (this.method1105(var58, var59) + var64));
                                    var6.method3289((float) var59);
                                    var6.method3297((byte) (var90 >> 16));
                                    var6.method3297((byte) (var90 >> 8));
                                    var6.method3297((byte) var90);
                                    var6.method3297(-1);
                                    var6.method3289((float) var58);
                                    var6.method3289((float) var59);
                                    if (this.field9140 != null) {
                                        var6.method3289((float) (var37 != null ? var37[var57] - 1 : 0));
                                    }
                                    if ((this.field9149 & 7) != 0) {
                                        var6.method3289(var72);
                                        var6.method3289(var73);
                                        var6.method3289(var74);
                                    }
                                } else {
                                    var6.method3293((float) var58);
                                    var6.method3293((float) (this.method1105(var58, var59) - -var64));
                                    var6.method3293((float) var59);
                                    var6.method3297((byte) (var90 >> 16));
                                    var6.method3297((byte) (var90 >> 8));
                                    var6.method3297((byte) var90);
                                    var6.method3297(-1);
                                    var6.method3293((float) var58);
                                    var6.method3293((float) var59);
                                    if (this.field9140 != null) {
                                        var6.method3293((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field9149 & 7) != -1) {
                                        var6.method3293(var72);
                                        var6.method3293(var73);
                                        var6.method3293(var74);
                                    }
                                }
                                var89 = this.field9164++;
                                var56[var57] = (short) var89;
                                if (var62 != -1) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1241(new class486(var56[var57]), var65, -110);
                            }
                            for (int var100 = 0; var100 < var54; ++var100) {
                                var10[var100].method2790(var70, var89, var71, 740, var85);
                            }
                            ++this.field9148;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field9164; ++var12) {
                class478 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2784(-115, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field2505; ++var13) {
                for (int var18 = 0; ~super.field2503 < ~var18; ++var18) {
                    short[] var19 = this.field9156[super.field2505 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (~var21 > ~var19.length) {
                            int var22 = var19[var21++] & 65535;
                            int var23 = 65535 & var19[var21++];
                            int var24 = 65535 & var19[var21++];
                            class478 var25 = var7[var22];
                            class478 var26 = var7[var23];
                            class478 var27 = var7[var24];
                            class478 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2786(var18, -103, var20, var13);
                            }
                            if (var26 != null) {
                                var26.method2786(var18, -111, var20, var13);
                                if (var28 == null || ~var26.field2524 > ~var28.field2524) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2786(var18, 106, var20, var13);
                                if (var28 == null || ~var27.field2524 > ~var28.field2524) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2784(114, var22);
                                }
                                if (var26 != null) {
                                    var28.method2784(-8, var23);
                                }
                                if (var27 != null) {
                                    var28.method2784(-31, var24);
                                }
                                var28.method2786(var18, 13, var20, var13);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3288();
            this.field9179 = this.field9143.method3383(var4, false, 19821, var6.method3292(), var5);
            this.field9185 = new class603(this.field9179, 5126, 3, 0);
            this.field9184 = new class603(this.field9179, 5121, 4, 12);
            byte var14;
            if (this.field9140 == null) {
                var14 = 24;
                this.field9178 = new class603(this.field9179, 5126, 2, 16);
            } else {
                var14 = 28;
                this.field9178 = new class603(this.field9179, 5126, 3, 16);
            }
            if ((this.field9149 & 7) != 0) {
                this.field9181 = new class603(this.field9179, 5126, 3, var14);
            }
            long[] var15 = new long[this.field9176.length];
            for (int var16 = 0; ~this.field9176.length < ~var16; ++var16) {
                class478 var17 = this.field9176[var16];
                var15[var16] = var17.field2524;
                var17.method2789(-9803, this.field9164);
            }
            class233.method1468(this.field9176, var15, -1);
            if (this.field9147 != null) {
                this.field9147.method882((byte) 114);
            }
        }
        ++field9141;
        this.field9144 = null;
        this.field9168 = null;
        this.field9153 = this.field9162 = null;
        this.field9180 = this.field9183 = this.field9175 = null;
        this.field9154 = null;
        this.field9140 = null;
        this.field9182 = null;
        this.field9166 = null;
        this.field9174 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1106(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9142;
        if (this.field9147 != null && arg0 != null) {
            int var7 = -(this.field9143.field8256 * arg2 >> 8) + arg1 >> this.field9143.field8198;
            int var8 = -(this.field9143.field8228 * arg2 >> 8) + arg3 >> this.field9143.field8198;
            return this.field9147.method878(arg0, var8, 17707, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9151;
        if (~this.field9186 < -1) {
            this.field9143.method3377(-948554512);
            this.field9143.method3402(true, false);
            this.field9143.method3330(false, (byte) 36);
            this.field9143.method3375(true, false);
            this.field9143.method3331(false, -25107);
            this.field9143.method3348(0, (byte) 69);
            this.field9143.method3408(-2, (byte) 54);
            this.field9143.method3358(32886, (class418) null);
            class596.field8614[14] = 0.0F;
            class596.field8614[15] = 1.0F;
            class596.field8614[4] = 0.0F;
            class596.field8614[5] = (float) arg2 / ((float) super.field2504 * 128.0F * (float) this.field9143.field8027);
            class596.field8614[9] = 0.0F;
            class596.field8614[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9143.field8027) + 1.0F;
            class596.field8614[8] = 0.0F;
            class596.field8614[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field9143.field8184;
            class596.field8614[1] = 0.0F;
            class596.field8614[10] = 0.0F;
            class596.field8614[11] = 0.0F;
            class596.field8614[7] = 0.0F;
            class596.field8614[6] = 0.0F;
            class596.field8614[0] = (float) arg2 / ((float) super.field2504 * 128.0F * (float) this.field9143.field8184);
            class596.field8614[2] = 0.0F;
            class596.field8614[3] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class596.field8614, 0);
            class596.field8614[7] = 0.0F;
            class596.field8614[1] = 0.0F;
            class596.field8614[14] = 0.0F;
            class596.field8614[3] = 0.0F;
            class596.field8614[15] = 1.0F;
            class596.field8614[10] = 0.0F;
            class596.field8614[6] = 1.0F;
            class596.field8614[12] = 0.0F;
            class596.field8614[9] = 1.0F;
            class596.field8614[8] = 0.0F;
            class596.field8614[13] = 0.0F;
            class596.field8614[4] = 0.0F;
            class596.field8614[11] = 0.0F;
            class596.field8614[0] = 1.0F;
            class596.field8614[5] = 0.0F;
            class596.field8614[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class596.field8614, 0);
            if ((7 & this.field9149) == 0) {
                this.field9143.method3330(false, (byte) 36);
            } else {
                this.field9143.method3330(true, (byte) 36);
                this.field9143.method3374((byte) -28);
            }
            this.field9143.method3380(this.field9184, this.field9181, this.field9185, 15097, this.field9178);
            if (~this.field9143.field8288.field138.length <= ~(this.field9148 * 2)) {
                this.field9143.field8288.field165 = 0;
            } else {
                this.field9143.field8288 = new class541(this.field9148 * 2);
            }
            int var9 = 0;
            class541 var10 = this.field9143.field8288;
            if (!this.field9143.field8254) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field2505 * var11 + arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field9156[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var14.length > var15; ++var15) {
                                    ++var9;
                                    var10.method95(1412209512, var14[var15] & 65535);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; ~arg6 < ~var16; ++var16) {
                    int var18 = super.field2505 * var16 + arg3;
                    for (int var19 = arg3; var19 < arg5; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field9156[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method84(65535 & var20[var21], (byte) -115);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class363 var17 = new class363(this.field9143, 5123, var10.field138, var10.field165);
                this.field9143.method3366(var17, var9, -22887, 4, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lrh;[I)V")
    public final void method1095(class223 arg0, int[] arg1) {
        this.field9138.method463(new class167(this.field9143, this, arg0, arg1), -115);
        ++field9173;
    }

    @OriginalMember(owner = "client!ql", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1107(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9150;
        if (this.field9147 != null && arg0 != null) {
            int var7 = -(this.field9143.field8256 * arg2 >> 8) + arg1 >> this.field9143.field8198;
            int var8 = -(this.field9143.field8228 * arg2 >> 8) + arg3 >> this.field9143.field8198;
            this.field9147.method881(2, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1109(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9170;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; ~var18 < ~var28; ++var28) {
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
        this.method1108(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1102(class485 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9159;
        if (this.field9147 != null && arg0 != null) {
            int var7 = -(this.field9143.field8256 * arg2 >> 8) + arg1 >> this.field9143.field8198;
            int var8 = -(this.field9143.field8228 * arg2 >> 8) + arg3 >> this.field9143.field8198;
            this.field9147.method879(true, var7, arg0, var8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lgi;IIII[[I[[II)V")
    public class627(class583 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field9161 = arg5;
        this.field9172 = super.field2506 + -2;
        this.field9143 = arg0;
        this.field9156 = new short[arg3 * arg4][];
        this.field9157 = 1 << this.field9172;
        this.field9162 = new int[arg3][arg4][];
        this.field9183 = new float[super.field2505 + 1][super.field2503 - -1];
        this.field9175 = new float[super.field2505 + 1][super.field2503 + 1];
        this.field9144 = new int[arg3][arg4][];
        this.field9149 = arg2;
        this.field9174 = new byte[arg3 - -1][arg4 - -1];
        this.field9169 = new byte[arg3][arg4];
        this.field9168 = new class478[arg3][arg4][];
        this.field9166 = new int[arg3][arg4][];
        this.field9154 = new int[arg3][arg4][];
        this.field9180 = new float[super.field2505 + 1][super.field2503 + 1];
        this.field9153 = new int[arg3][arg4][];
        for (int var9 = 1; ~super.field2503 < ~var9; ++var9) {
            for (int var10 = 1; ~super.field2505 < ~var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 + -1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var12 * var12 - -(arg7 * 4 * arg7))));
                this.field9180[var10][var9] = (float) var11 * var13;
                this.field9183[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field9175[var10][var9] = (float) var12 * var13;
            }
        }
        this.field9182 = new class205(128);
        if (~(this.field9149 & 16) != -1) {
            this.field9147 = new class127(this.field9143, this);
        }
    }

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "(III)V")
    public final void method1097(int arg0, int arg1, int arg2) {
        ++field9167;
        if (~arg2 < ~(this.field9174[arg0][arg1] & 255)) {
            this.field9174[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILvh;)V")
    private final void method3657(int arg0, int arg1, int arg2, class302 arg3) {
        ++field9145;
        int[] var5 = this.field9153[arg2][arg1];
        int[] var6 = this.field9162[arg2][arg1];
        int var7 = var5.length;
        if (this.field9143.field8347.length < var7) {
            this.field9143.field8344 = new int[var7];
            this.field9143.field8347 = new int[var7];
        }
        int[] var8 = this.field9143.field8347;
        int[] var9 = this.field9143.field8344;
        for (int var10 = 0; ~var7 < ~var10; ++var10) {
            var8[var10] = var5[var10] >> this.field9143.field8198;
            var9[var10] = var6[var10] >> this.field9143.field8198;
        }
        int var11 = arg0;
        while (var11 < var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((var12 - var14) * (-var17 + var15) - (-var13 + var15) * (-var14 + var16) > 0) {
                arg3.method1922(var15, var13, arg0 ^ 86, var14, var12, var16, var17);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "aa", descriptor = "(II)I")
    public final int method1105(int arg0, int arg1) {
        ++field9155;
        int var3 = arg0 >> super.field2506;
        int var4 = arg1 >> super.field2506;
        if (var3 >= 0 && ~var4 <= -1 && ~var3 >= ~(super.field2505 + -1) && ~var4 >= ~(super.field2503 + -1)) {
            int var5 = super.field2504 + -1 & arg0;
            int var6 = arg1 & super.field2504 + -1;
            int var7 = (-var5 + super.field2504) * this.field9161[var3][var4] + this.field9161[var3 + 1][var4] * var5 >> super.field2506;
            int var8 = (-var5 + super.field2504) * this.field9161[var3][var4 - -1] + this.field9161[var3 + 1][var4 - -1] * var5 >> super.field2506;
            return (super.field2504 - var6) * var7 + var6 * var8 >> super.field2506;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public final void method1101(int arg0, int arg1) {
        ++field9139;
    }

    @OriginalMember(owner = "client!ql", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field9154 == null) {
            this.field9154 = new int[super.field2505][super.field2503][];
        }
        ++field9171;
        if (arg5 != null && this.field9140 == null) {
            this.field9140 = new int[super.field2505][super.field2503][];
        }
        this.field9153[arg0][arg1] = arg2;
        this.field9162[arg0][arg1] = arg4;
        this.field9166[arg0][arg1] = arg6;
        this.field9144[arg0][arg1] = arg7;
        if (this.field9140 != null) {
            this.field9140[arg0][arg1] = arg5;
        }
        if (this.field9154 != null) {
            this.field9154[arg0][arg1] = arg3;
        }
        class478[] var15 = this.field9168[arg0][arg1] = new class478[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class176 var19;
            for (var19 = this.field9182.method1242(0, var17); var19 != null; var19 = this.field9182.method1243(-1)) {
                class478 var20 = (class478) var19;
                if (~arg8[var16] == ~var20.field6735 && (float) arg9[var16] == var20.field6741 && var20.field6737 == arg10 && var20.field6736 == arg11 && var20.field6745 == arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class478) var19;
            } else {
                var15[var16] = new class478(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field9182.method1241(var15[var16], var17, -118);
            }
        }
        if (arg13) {
            this.field9169[arg0][arg1] = (byte) class73.method578(this.field9169[arg0][arg1], 1);
        }
        if (this.field9177 < arg6.length) {
            this.field9177 = arg6.length;
        }
        this.field9186 += arg6.length;
    }

    @OriginalMember(owner = "client!ql", name = "X", descriptor = "(IILk;)Lk;")
    public final class485 method1096(int arg0, int arg1, class485 arg2) {
        ++field9158;
        if (~(this.field9169[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field2504 >> this.field9143.field8198;
            class302 var5 = (class302) arg2;
            class302 var6;
            if (var5 != null && var5.method1923(var4, -87, var4)) {
                var6 = var5;
                var5.method1920((byte) 73);
            } else {
                var6 = new class302(this.field9143, var4, var4);
            }
            var6.method1919(0, -1, 0, var4, var4);
            this.method3657(0, arg1, arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ql", name = "ba", descriptor = "(II)I")
    public final int method1104(int arg0, int arg1) {
        ++field9163;
        return this.field9161[arg0][arg1];
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1099(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field9146;
        this.method3656(arg1, 23238, arg0, -1, arg3, arg2, arg4);
    }
}
