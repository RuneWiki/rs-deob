import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class488 {

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[I")
    private int[] field6805 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "[I")
    private int[] field6809 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public int field6789;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Lbm;")
    private class123 field6793;

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Z")
    public boolean field6799;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "Lck;")
    private class666 field6806;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "[[[B")
    public byte[][][] field6794;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[[[B")
    private byte[][][] field6796;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "[[[B")
    private byte[][][] field6801;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[[[B")
    private byte[][][] field6791;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[[[B")
    private byte[][][] field6797;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "[[[I")
    public int[][][] field6792;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[[[B")
    public byte[][][] field6787;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILha;Ls;Ls;)V", line = 6)
    public final void method2849(int arg0, class66 arg1, class295 arg2, class295 arg3) {
        field6811++;
        if (class728.field9872 == null || class728.field9872.length != this.field6813) {
            class655.field8849 = new int[this.field6813];
            class341.field4779 = new int[this.field6813];
            class728.field9872 = new int[this.field6813];
            class74.field1007 = new int[this.field6813];
            class646.field8703 = new int[this.field6813];
        }
        int[][] var5 = new int[this.field6804][this.field6813];
        for (int var6 = 0; var6 < this.field6789; var6++) {
            for (int var8 = 0; var8 < this.field6813; var8++) {
                class728.field9872[var8] = 0;
                class655.field8849[var8] = 0;
                class341.field4779[var8] = 0;
                class646.field8703[var8] = 0;
                class74.field1007[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field6804; var9++) {
                for (int var10 = 0; var10 < this.field6813; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field6804 > var19) {
                        int var20 = this.field6801[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class130 var21 = this.field6806.method3671(var20 - 1, -77);
                            class728.field9872[var10] += var21.field1789;
                            class655.field8849[var10] += var21.field1785;
                            class341.field4779[var10] += var21.field1786;
                            class646.field8703[var10] += var21.field1793;
                            var10002 = class74.field1007[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field6801[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class130 var24 = this.field6806.method3671(var23 - 1, -69);
                            class728.field9872[var10] -= var24.field1789;
                            class655.field8849[var10] -= var24.field1785;
                            class341.field4779[var10] -= var24.field1786;
                            class646.field8703[var10] -= var24.field1793;
                            var10002 = class74.field1007[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field6813; var16++) {
                        int var17 = var16 + 5;
                        if (this.field6813 > var17) {
                            var11 += class728.field9872[var17];
                            var12 += class655.field8849[var17];
                            var14 += class646.field8703[var17];
                            var13 += class341.field4779[var17];
                            var15 += class74.field1007[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var15 -= class74.field1007[var18];
                            var12 -= class655.field8849[var18];
                            var13 -= class341.field4779[var18];
                            var14 -= class646.field8703[var18];
                            var11 -= class728.field9872[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class585.method3293(var11 * 256 / var14, var13 / var15, -25901, var12 / var15);
                        }
                    }
                }
            }
            if (class714.field9740) {
                this.method2859(class645.field8694[var6], var6, 66, var6 == 0 ? arg2 : null, arg1, var6 == 0 ? arg3 : null, var5);
            } else {
                this.method2852(var5, var6, 0, class645.field8694[var6], arg1, var6 == 0 ? arg2 : null, var6 == 0 ? arg3 : null);
            }
            this.field6801[var6] = null;
            this.field6797[var6] = null;
            this.field6796[var6] = null;
            this.field6791[var6] = null;
        }
        if (!this.field6799) {
            if (class319.field4533 != 0) {
                class17.method96();
            }
            if (class717.field9768) {
                class647.method3591();
            }
        }
        if (arg0 != -31060) {
            field6803 = -125;
        }
        for (int var7 = 0; var7 < this.field6789; var7++) {
            class645.field8694[var7].method197();
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIII[[BII[[BLco;Lha;Lmea;I[[B[Z)V", line = 188)
    private final void method2850(int arg0, int arg1, int arg2, int arg3, byte[][] arg4, int arg5, int arg6, byte[][] arg7, class130 arg8, class66 arg9, class452 arg10, int arg11, byte[][] arg12, boolean[] arg13) {
        field6812++;
        boolean[] var15 = arg10 != null && arg10.field6490 ? class6.field46[arg3] : class359.field5224[arg3];
        if (arg6 > 0) {
            if (arg2 > 0) {
                int var16 = arg7[arg2 - 1][arg6 - 1] & 0xFF;
                if (var16 > 0) {
                    class452 var17 = this.field6793.method888(var16 - 1, (byte) -123);
                    if (var17.field6481 != -1 && var17.field6490) {
                        byte var18 = arg4[arg2 - 1][arg6 - 1];
                        int var19 = arg12[arg2 - 1][arg6 - 1] * 2 + 4 & 0x7;
                        int var20 = class540.method3124(arg9, -19590, var17);
                        if (class234.field3110[var18][var19]) {
                            class211.field2715[0] = var17.field6481;
                            class25.field248[0] = var20;
                            class679.field9093[0] = var17.field6494;
                            class584.field7945[0] = var17.field6486;
                            class608.field8229[0] = var17.field6478;
                            class104.field1482[0] = 256;
                        }
                    }
                }
            }
            if (arg2 < arg5 - 1) {
                int var21 = arg7[arg2 + 1][arg6 - 1] & 0xFF;
                if (var21 > 0) {
                    class452 var22 = this.field6793.method888(var21 - 1, (byte) -122);
                    if (var22.field6481 != -1 && var22.field6490) {
                        byte var23 = arg4[arg2 + 1][arg6 - 1];
                        int var24 = arg12[arg2 + 1][arg6 - 1] * 2 + 6 & 0x7;
                        int var25 = class540.method3124(arg9, -19590, var22);
                        if (class234.field3110[var23][var24]) {
                            class211.field2715[2] = var22.field6481;
                            class25.field248[2] = var25;
                            class679.field9093[2] = var22.field6494;
                            class584.field7945[2] = var22.field6486;
                            class608.field8229[2] = var22.field6478;
                            class104.field1482[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg6 < (arg1 - 1)) {
            if (arg2 > 0) {
                int var26 = arg7[arg2 - 1][arg6 + 1] & 0xFF;
                if (var26 > 0) {
                    class452 var27 = this.field6793.method888(var26 - 1, (byte) -124);
                    if (var27.field6481 != -1 && var27.field6490) {
                        byte var28 = arg4[arg2 - 1][arg6 + 1];
                        int var29 = arg12[arg2 - 1][arg6 + 1] * 2 + 2 & 0x7;
                        int var30 = class540.method3124(arg9, -19590, var27);
                        if (class234.field3110[var28][var29]) {
                            class211.field2715[6] = var27.field6481;
                            class25.field248[6] = var30;
                            class679.field9093[6] = var27.field6494;
                            class584.field7945[6] = var27.field6486;
                            class608.field8229[6] = var27.field6478;
                            class104.field1482[6] = 64;
                        }
                    }
                }
            }
            if (arg2 < arg5 - 1) {
                int var31 = arg7[arg2 + 1][arg6 + 1] & 0xFF;
                if (var31 > 0) {
                    class452 var32 = this.field6793.method888(var31 - 1, (byte) 67);
                    if (var32.field6481 != -1 && var32.field6490) {
                        byte var33 = arg4[arg2 + 1][arg6 + 1];
                        int var34 = arg12[arg2 + 1][arg6 + 1] * 2 & 0x7;
                        int var35 = class540.method3124(arg9, -19590, var32);
                        if (class234.field3110[var33][var34]) {
                            class211.field2715[4] = var32.field6481;
                            class25.field248[4] = var35;
                            class679.field9093[4] = var32.field6494;
                            class584.field7945[4] = var32.field6486;
                            class608.field8229[4] = var32.field6478;
                            class104.field1482[4] = 128;
                        }
                    }
                }
            }
        }
        int var36 = 107 % ((3 - arg0) / 51);
        if (arg6 > 0) {
            int var37 = arg7[arg2][arg6 - 1] & 0xFF;
            if (var37 > 0) {
                class452 var38 = this.field6793.method888(var37 - 1, (byte) 54);
                if (var38.field6481 != -1) {
                    byte var39 = arg4[arg2][arg6 - 1];
                    byte var40 = arg12[arg2][arg6 - 1];
                    if (var38.field6490) {
                        int var41 = 2;
                        int var42 = (var40 * 2) + 4;
                        int var43 = class540.method3124(arg9, -19590, var38);
                        for (int var44 = 0; var44 < 3; var44++) {
                            var41 &= 0x7;
                            var42 &= 0x7;
                            if (class234.field3110[var39][var42] && var38.field6478 >= class608.field8229[var41]) {
                                class211.field2715[var41] = var38.field6481;
                                class25.field248[var41] = var43;
                                class679.field9093[var41] = var38.field6494;
                                class584.field7945[var41] = var38.field6486;
                                if (class608.field8229[var41] == var38.field6478) {
                                    class104.field1482[var41] = class670.method3699(class104.field1482[var41], 32);
                                } else {
                                    class104.field1482[var41] = 32;
                                }
                                class608.field8229[var41] = var38.field6478;
                            }
                            var41--;
                            var42++;
                        }
                        if (!var15[arg11 & 0x3]) {
                            arg13[0] = class6.field46[var39][class519.method3018(var40 + 2, 3)];
                        }
                    } else if (!var15[arg11 & 0x3]) {
                        arg13[0] = class359.field5224[var39][class519.method3018(var40 + 2, 3)];
                    }
                }
            }
        }
        if (arg6 < arg1 - 1) {
            int var45 = arg7[arg2][arg6 + 1] & 0xFF;
            if (var45 > 0) {
                class452 var46 = this.field6793.method888(var45 - 1, (byte) -125);
                if (var46.field6481 != -1) {
                    byte var47 = arg4[arg2][arg6 + 1];
                    byte var48 = arg12[arg2][arg6 + 1];
                    if (var46.field6490) {
                        int var49 = 4;
                        int var50 = (var48 * 2) + 2;
                        int var51 = class540.method3124(arg9, -19590, var46);
                        for (int var52 = 0; var52 < 3; var52++) {
                            var50 &= 0x7;
                            var49 &= 0x7;
                            if (class234.field3110[var47][var50] && var46.field6478 >= class608.field8229[var49]) {
                                class211.field2715[var49] = var46.field6481;
                                class25.field248[var49] = var51;
                                class679.field9093[var49] = var46.field6494;
                                class584.field7945[var49] = var46.field6486;
                                if (class608.field8229[var49] == var46.field6478) {
                                    class104.field1482[var49] = class670.method3699(class104.field1482[var49], 16);
                                } else {
                                    class104.field1482[var49] = 16;
                                }
                                class608.field8229[var49] = var46.field6478;
                            }
                            var49++;
                            var50--;
                        }
                        if (!var15[arg11 + 2 & 0x3]) {
                            arg13[2] = class6.field46[var47][class519.method3018(var48, 3)];
                        }
                    } else if (!var15[arg11 + 2 & 0x3]) {
                        arg13[2] = class359.field5224[var47][class519.method3018(var48, 3)];
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var53 = arg7[arg2 - 1][arg6] & 0xFF;
            if (var53 > 0) {
                class452 var54 = this.field6793.method888(var53 - 1, (byte) 93);
                if (var54.field6481 != -1) {
                    byte var55 = arg4[arg2 - 1][arg6];
                    byte var56 = arg12[arg2 - 1][arg6];
                    if (var54.field6490) {
                        int var57 = 6;
                        int var58 = var56 * 2 + 4;
                        int var59 = class540.method3124(arg9, -19590, var54);
                        for (int var60 = 0; var60 < 3; var60++) {
                            var58 &= 0x7;
                            var57 &= 0x7;
                            if (class234.field3110[var55][var58] && var54.field6478 >= class608.field8229[var57]) {
                                class211.field2715[var57] = var54.field6481;
                                class25.field248[var57] = var59;
                                class679.field9093[var57] = var54.field6494;
                                class584.field7945[var57] = var54.field6486;
                                if (class608.field8229[var57] == var54.field6478) {
                                    class104.field1482[var57] = class670.method3699(class104.field1482[var57], 8);
                                } else {
                                    class104.field1482[var57] = 8;
                                }
                                class608.field8229[var57] = var54.field6478;
                            }
                            var57++;
                            var58--;
                        }
                        if (!var15[arg11 + 3 & 0x3]) {
                            arg13[3] = class6.field46[var55][class519.method3018(var56 + 1, 3)];
                        }
                    } else if (!var15[arg11 + 3 & 0x3]) {
                        arg13[3] = class359.field5224[var55][class519.method3018(3, var56 + 1)];
                    }
                }
            }
        }
        if ((arg5 - 1) > arg2) {
            int var61 = arg7[arg2 + 1][arg6] & 0xFF;
            if (var61 > 0) {
                class452 var62 = this.field6793.method888(var61 - 1, (byte) 44);
                if (var62.field6481 != -1) {
                    byte var63 = arg4[arg2 + 1][arg6];
                    byte var64 = arg12[arg2 + 1][arg6];
                    if (var62.field6490) {
                        int var65 = 4;
                        int var66 = (var64 * 2) + 6;
                        int var67 = class540.method3124(arg9, -19590, var62);
                        for (int var68 = 0; var68 < 3; var68++) {
                            var66 &= 0x7;
                            var65 &= 0x7;
                            if (class234.field3110[var63][var66] && class608.field8229[var65] <= var62.field6478) {
                                class211.field2715[var65] = var62.field6481;
                                class25.field248[var65] = var67;
                                class679.field9093[var65] = var62.field6494;
                                class584.field7945[var65] = var62.field6486;
                                if (class608.field8229[var65] == var62.field6478) {
                                    class104.field1482[var65] = class670.method3699(class104.field1482[var65], 4);
                                } else {
                                    class104.field1482[var65] = 4;
                                }
                                class608.field8229[var65] = var62.field6478;
                            }
                            var65--;
                            var66++;
                        }
                        if (!var15[arg11 + 1 & 0x3]) {
                            arg13[1] = class6.field46[var63][class519.method3018(var64 + 3, 3)];
                        }
                    } else if (!var15[arg11 + 1 & 0x3]) {
                        arg13[1] = class359.field5224[var63][class519.method3018(var64 + 3, 3)];
                    }
                }
            }
        }
        if (arg10 == null) {
            return;
        }
        int var69 = class540.method3124(arg9, -19590, arg10);
        if (!arg10.field6490) {
            return;
        }
        for (int var70 = 0; var70 < 8; var70++) {
            int var71 = var70 - arg11 * 2 & 0x7;
            if (class234.field3110[arg3][var70] && class608.field8229[var71] <= arg10.field6478) {
                class211.field2715[var71] = arg10.field6481;
                class25.field248[var71] = var69;
                class679.field9093[var71] = arg10.field6494;
                class584.field7945[var71] = arg10.field6486;
                if (class608.field8229[var71] == arg10.field6478) {
                    class104.field1482[var71] = class670.method3699(class104.field1482[var71], 2);
                } else {
                    class104.field1482[var71] = 2;
                }
                class608.field8229[var71] = arg10.field6478;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([[[I[Leq;ZLha;)V", line = 658)
    public final void method2851(int[][][] arg0, class224[] arg1, boolean arg2, class66 arg3) {
        if (!this.field6799) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field6804; var6++) {
                    for (int var7 = 0; var7 < this.field6813; var7++) {
                        if ((class328.field4667[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class328.field4667[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1424(var7, (byte) 17, var6);
                            }
                        }
                    }
                }
            }
        }
        field6807++;
        for (int var9 = 0; var9 < this.field6789; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field6799) {
                if (class792.field10866) {
                    var11 |= 0x8;
                }
                if (class717.field9768) {
                    var10 |= 0x2;
                }
                if (class319.field4533 != 0) {
                    var10 |= 0x1;
                    if (class682.field9117 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class717.field9768) {
                var11 |= 0x7;
            }
            if (!class377.field5508) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field6792[var9] : arg0[var9];
            class320.method2071(var9, arg3.method516(this.field6804, this.field6813, this.field6792[var9], var12, 512, var10, var11));
        }
        if (arg2) {
            this.method2852(null, -60, -24, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([[IIILs;Lha;Ls;Ls;)V", line = 753)
    private final void method2852(int[][] arg0, int arg1, int arg2, class295 arg3, class66 arg4, class295 arg5, class295 arg6) {
        for (int var8 = arg2; var8 < this.field6804; var8++) {
            for (int var9 = 0; var9 < this.field6813; var9++) {
                if (class584.field7965 == -1 || class616.method3419(var9, class584.field7965, -1, arg1, var8)) {
                    byte var10 = this.field6796[arg1][var8][var9];
                    byte var11 = this.field6791[arg1][var8][var9];
                    int var12 = this.field6797[arg1][var8][var9] & 0xFF;
                    int var13 = this.field6801[arg1][var8][var9] & 0xFF;
                    class452 var14 = var12 == 0 ? null : this.field6793.method888(var12 - 1, (byte) -127);
                    if (var10 == 0 && var14 == null) {
                        var10 = 12;
                    }
                    class130 var15 = var13 == 0 ? null : this.field6806.method3671(var13 - 1, -95);
                    class452 var16 = var14;
                    if (var14 != null && var14.field6481 == -1 && var14.field6488 == -1) {
                        var16 = var14;
                        var14 = null;
                    }
                    if (var14 != null || var15 != null) {
                        int var17 = class353.field5133[var10];
                        int var18 = class445.field6405[var10];
                        int var19 = (var14 == null ? 0 : var18) + (var15 == null ? 0 : var17);
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = var14 == null ? -1 : var14.field6494;
                        int var23 = var15 == null ? -1 : var15.field1797;
                        int[] var24 = new int[var19];
                        int[] var25 = new int[var19];
                        int[] var26 = new int[var19];
                        int[] var27 = new int[var19];
                        int[] var28 = new int[var19];
                        int[] var29 = new int[var19];
                        int[] var30 = var14 == null || var14.field6488 == -1 ? null : new int[var19];
                        if (var14 == null) {
                            var21 += var18;
                        } else {
                            for (int var31 = 0; var31 < var18; var31++) {
                                var24[var20] = class14.field145[var10][var21];
                                var25[var20] = class111.field1534[var10][var21];
                                var26[var20] = class359.field5228[var10][var21];
                                var28[var20] = var22;
                                var29[var20] = var14.field6486;
                                var27[var20] = var14.field6481;
                                if (var30 != null) {
                                    var30[var20] = var14.field6488;
                                }
                                var21++;
                                var20++;
                            }
                            if (!this.field6799 && arg1 == 0) {
                                class300.method1945(var8, var9, var14.field6474, var14.field6475 * 8, var14.field6483);
                            }
                        }
                        if (var15 != null) {
                            for (int var32 = 0; var32 < var17; var32++) {
                                var24[var20] = class14.field145[var10][var21];
                                var25[var20] = class111.field1534[var10][var21];
                                var26[var20] = class359.field5228[var10][var21];
                                var28[var20] = var23;
                                var29[var20] = var15.field1784;
                                var27[var20] = arg0[var8][var9];
                                if (var30 != null) {
                                    var30[var20] = var27[var20];
                                }
                                var20++;
                                var21++;
                            }
                        }
                        int var33 = this.field6805.length;
                        int[] var34 = new int[var33];
                        int[] var35 = new int[var33];
                        int[] var36 = arg6 == null ? null : new int[var33];
                        int[] var37 = arg6 == null && arg5 == null ? null : new int[var33];
                        for (int var38 = 0; var38 < var33; var38++) {
                            int var48 = this.field6805[var38];
                            int var49 = this.field6809[var38];
                            if (var11 == 0) {
                                var34[var38] = var48;
                                var35[var38] = var49;
                            } else if (var11 == 1) {
                                var34[var38] = var49;
                                var35[var38] = 512 - var48;
                            } else if (var11 == 2) {
                                var34[var38] = 512 - var48;
                                var35[var38] = 512 - var49;
                            } else if (var11 == 3) {
                                var34[var38] = 512 - var49;
                                var35[var38] = var48;
                            }
                            if (var36 != null && class234.field3110[var10][var38]) {
                                int var52 = (var8 << 9) + var34[var38];
                                int var53 = (var9 << 9) + var35[var38];
                                var36[var38] = arg6.method1895(var52, var53, 83) - arg3.method1895(var52, var53, 32);
                            }
                            if (var37 != null) {
                                if (arg6 != null && !class234.field3110[var10][var38]) {
                                    int var54 = (var8 << 9) + var34[var38];
                                    int var55 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg3.method1895(var54, var55, 76) - arg6.method1895(var54, var55, 75);
                                } else if (arg5 != null && !class87.field1236[var10][var38]) {
                                    int var56 = (var8 << 9) + var34[var38];
                                    int var57 = (var9 << 9) + var35[var38];
                                    var37[var38] = arg5.method1895(var56, var57, 87) - arg3.method1895(var56, var57, 120);
                                }
                            }
                        }
                        int var39 = arg3.method1898(var9, var8, (byte) -75);
                        int var40 = arg3.method1898(var9, var8 + 1, (byte) -67);
                        int var41 = arg3.method1898(var9 + 1, var8 + 1, (byte) -74);
                        int var42 = arg3.method1898(var9 + 1, var8, (byte) -18);
                        boolean var43 = class49.method310(var8, var9, (byte) 69);
                        if (var43 && arg1 > 1 || !var43 && arg1 > 0) {
                            boolean var44 = true;
                            if (var15 != null && !var15.field1788) {
                                var44 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var44 = false;
                            } else if (var12 > 0 && var16 != null && !var16.field6487) {
                                var44 = false;
                            }
                            if (var44 && var39 == var40 && var39 == var41 && var39 == var42) {
                                this.field6794[arg1][var8][var9] = (byte) class670.method3699(this.field6794[arg1][var8][var9], 4);
                            }
                        }
                        int var45 = 0;
                        int var46 = 0;
                        int var47 = 0;
                        if (this.field6799) {
                            var45 = class211.method1374(var8, var9);
                            var46 = class518.method3016(var8, var9);
                            var47 = class73.method597(var8, var9);
                        }
                        arg3.method205(var8, var9, var34, var36, var35, var37, var24, var25, var26, var27, var30, var28, var29, var45, var46, var47, false);
                        class490.method2867(arg1, var8, var9);
                    }
                }
            }
        }
        field6810++;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIIIII)V", line = 1037)
    public final void method2853(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6790++;
        for (int var7 = arg1; var7 < arg1 + arg4; var7++) {
            for (int var11 = arg2; var11 < (arg2 + arg3); var11++) {
                if (var11 >= 0 && this.field6804 > var11 && var7 >= 0 && this.field6813 > var7) {
                    this.field6792[arg5][var11][var7] = arg5 > 0 ? this.field6792[arg5 - 1][var11][var7] - 960 : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field6804) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg4); var8++) {
                if (var8 >= 0 && this.field6813 > var8) {
                    this.field6792[arg5][arg2][var8] = this.field6792[arg5][arg2 - 1][var8];
                }
            }
        }
        int var9 = -39 / ((arg0 + 22) / 34);
        if (arg1 > 0 && this.field6813 > arg1) {
            for (int var10 = arg2 + 1; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < this.field6804) {
                    this.field6792[arg5][var10][arg1] = this.field6792[arg5][var10][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || this.field6804 <= arg2 || arg1 >= this.field6813) {
            return;
        }
        if (arg5 != 0) {
            if (arg2 > 0 && this.field6792[arg5 - 1][arg2 - 1][arg1] != this.field6792[arg5][arg2 - 1][arg1]) {
                this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2 - 1][arg1];
                return;
            }
            if (arg1 > 0 && this.field6792[arg5 - 1][arg2][arg1 - 1] != this.field6792[arg5][arg2][arg1 - 1]) {
                this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field6792[arg5][arg2 - 1][arg1 - 1] != this.field6792[arg5 - 1][arg2 - 1][arg1 - 1]) {
                this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2 - 1][arg1 - 1];
                return;
            }
            return;
        }
        if (arg2 > 0 && this.field6792[arg5][arg2 - 1][arg1] != 0) {
            this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2 - 1][arg1];
            return;
        }
        if (arg1 > 0 && this.field6792[arg5][arg2][arg1 - 1] != 0) {
            this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2][arg1 - 1];
            return;
        }
        if (arg2 > 0 && arg1 > 0 && this.field6792[arg5][arg2 - 1][arg1 - 1] != 0) {
            this.field6792[arg5][arg2][arg1] = this.field6792[arg5][arg2 - 1][arg1 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIB)V", line = 1138)
    public final void method2854(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 == 11) {
            for (int var6 = 0; var6 < this.field6789; var6++) {
                this.method2853((byte) 99, arg3, arg0, arg2, arg1, var6);
            }
            field6800++;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[Leq;IBLdt;III)V", line = 1155)
    public final void method2855(int arg0, int arg1, int arg2, class224[] arg3, int arg4, byte arg5, class254 arg6, int arg7, int arg8, int arg9) {
        field6795++;
        int var11 = (arg2 & 0x7) * 8;
        if (arg5 >= -126) {
            this.method2853((byte) 117, -65, 105, -97, -88, 111);
        }
        if (!this.field6799) {
            class224 var12 = arg3[arg8];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class671.method3700(var13 & 0x7, (byte) 65, arg7, var14 & 0x7) + arg0;
                    int var16 = arg9 + class702.method3829(-2, var14 & 0x7, var13 & 0x7, arg7);
                    if (var15 > 0 && var15 < (this.field6804 - 1) && var16 > 0 && this.field6813 - 1 > var16) {
                        var12.method1429(var15, 1, var16);
                    }
                }
            }
        }
        int var17 = (arg4 & 0x7) * 8;
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = arg4 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg7 == 1) {
            var21 = 1;
        } else if (arg7 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg7 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field6789; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var23 >= var11 && var23 <= var11 + 8 && var17 <= var24 && var24 <= var17 + 8) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var17 + 8 == var24) {
                            if (arg7 == 0) {
                                var26 = var24 + arg9 - var17;
                                var25 = var23 + arg0 - var11;
                            } else if (arg7 == 1) {
                                var25 = arg0 - (var17 - var24);
                                var26 = var11 - (var23 - arg9 - 8);
                            } else if (arg7 == 2) {
                                var26 = arg9 + var17 + 8 - var24;
                                var25 = arg0 + var11 + 8 - var23;
                            } else {
                                var25 = var17 + arg0 + 8 - var24;
                                var26 = var23 + arg9 - var11;
                            }
                            this.method2856(0, var18 + var23, true, arg8, var25, 0, (byte) -86, var26, 0, var19 + var24, arg6);
                        } else {
                            var25 = arg0 + class671.method3700(var23 & 0x7, (byte) 65, arg7, var24 & 0x7);
                            var26 = class702.method3829(-2, var24 & 0x7, var23 & 0x7, arg7) + arg9;
                            this.method2856(arg7, var18 + var23, false, arg8, var25, var21, (byte) -92, var26, var20, var19 + var24, arg6);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg7 == 0) {
                                    var32 = arg9 + var30 - var17;
                                    var31 = arg0 + var29 - var11;
                                } else if (arg7 == 1) {
                                    var31 = arg0 + var30 - var17;
                                    var32 = arg9 + var11 + 8 - var29;
                                } else if (arg7 == 2) {
                                    var32 = var17 + arg9 + 8 - var30;
                                    var31 = var11 + arg0 + 8 - var29;
                                } else {
                                    var31 = arg0 + var17 + 8 - var30;
                                    var32 = var29 + arg9 - var11;
                                }
                                if (var31 >= 0 && this.field6804 > var31 && var32 >= 0 && this.field6813 > var32) {
                                    this.field6792[arg8][var31][var32] = this.field6792[arg8][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method2856(0, 0, false, 0, -1, 0, (byte) -78, -1, 0, 0, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIZIIIBIIILdt;)V", line = 1360)
    private final void method2856(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, class254 arg10) {
        if (arg0 == 1) {
            arg5 = 1;
        } else if (arg0 == 2) {
            arg8 = 1;
            arg5 = 1;
        } else if (arg0 == 3) {
            arg8 = 1;
        }
        field6788++;
        if (arg6 >= -48) {
            return;
        }
        if (arg4 < 0 || this.field6804 <= arg4 || arg7 < 0 || this.field6813 <= arg7) {
            while (true) {
                int var14 = arg10.method1731((byte) 64);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg10.method1731((byte) 64);
                    return;
                }
                if (var14 <= 49) {
                    arg10.method1731((byte) 64);
                }
            }
        }
        if (!this.field6799 && !arg2) {
            class328.field4667[arg3][arg4][arg7] = 0;
        }
        while (true) {
            int var12 = arg10.method1731((byte) 64);
            if (var12 == 0) {
                if (this.field6799) {
                    this.field6792[0][arg4 + arg8][arg5 + arg7] = 0;
                    return;
                } else if (arg3 == 0) {
                    this.field6792[0][arg4 + arg8][arg7 + arg5] = -class131.method925(arg9 + 556238, -113, arg1 + 932731) * 8 << 2;
                    return;
                } else {
                    this.field6792[arg3][arg4 + arg8][arg5 + arg7] = this.field6792[arg3 - 1][arg4 + arg8][arg5 + arg7] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg10.method1731((byte) 64);
                if (this.field6799) {
                    this.field6792[0][arg4 + arg8][arg5 + arg7] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg3 != 0) {
                    this.field6792[arg3][arg4 + arg8][arg5 + arg7] = this.field6792[arg3 - 1][arg4 + arg8][arg7 + arg5] - (var13 * 8 << 2);
                    return;
                }
                this.field6792[0][arg4 + arg8][arg5 + arg7] = -var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg10.method1731((byte) 64);
                } else {
                    this.field6797[arg3][arg4][arg7] = arg10.method1737(true);
                    this.field6796[arg3][arg4][arg7] = (byte) ((var12 - 2) / 4);
                    this.field6791[arg3][arg4][arg7] = (byte) class519.method3018(var12 + arg0 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field6799 && !arg2) {
                    class328.field4667[arg3][arg4][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field6801[arg3][arg4][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIZLbm;Lck;)V", line = 2474)
    public class488(int arg0, int arg1, int arg2, boolean arg3, class123 arg4, class666 arg5) {
        this.field6789 = arg0;
        this.field6793 = arg4;
        this.field6813 = arg2;
        this.field6804 = arg1;
        this.field6799 = arg3;
        this.field6806 = arg5;
        this.field6794 = new byte[this.field6789][this.field6804 + 1][this.field6813 + 1];
        this.field6796 = new byte[this.field6789][this.field6804][this.field6813];
        this.field6801 = new byte[this.field6789][this.field6804][this.field6813];
        this.field6791 = new byte[this.field6789][this.field6804][this.field6813];
        this.field6797 = new byte[this.field6789][this.field6804][this.field6813];
        this.field6792 = new int[this.field6789][this.field6804 + 1][this.field6813 + 1];
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[Leq;IIIBLdt;)V", line = 1493)
    public final void method2857(int arg0, class224[] arg1, int arg2, int arg3, int arg4, byte arg5, class254 arg6) {
        field6808++;
        if (arg5 <= 17) {
            this.field6787 = null;
        }
        if (!this.field6799) {
            for (int var8 = 0; var8 < 4; var8++) {
                class224 var9 = arg1[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg3 + var10;
                        int var13 = arg2 + var11;
                        if (var12 >= 0 && this.field6804 > var12 && var13 >= 0 && this.field6813 > var13) {
                            var9.method1429(var12, 1, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg4;
        int var15 = arg0 + arg2;
        for (int var16 = 0; var16 < this.field6789; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2856(0, var14 + var17, false, var16, arg3 + var17, 0, (byte) -92, arg2 + var18, 0, var15 + var18, arg6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([[IBI)V", line = 1572)
    public final void method2858(int[][] arg0, byte arg1, int arg2) {
        field6798++;
        int[][] var4 = this.field6792[arg2];
        if (arg1 != -45) {
            return;
        }
        for (int var5 = 0; var5 < (this.field6804 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field6813 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ls;IILs;Lha;Ls;[[I)V", line = 1601)
    private final void method2859(class295 arg0, int arg1, int arg2, class295 arg3, class66 arg4, class295 arg5, int[][] arg6) {
        field6802++;
        byte[][] var8 = this.field6796[arg1];
        byte[][] var9 = this.field6791[arg1];
        byte[][] var10 = this.field6801[arg1];
        byte[][] var11 = this.field6797[arg1];
        int var12 = 0;
        if (arg2 < 1) {
            return;
        }
        while (var12 < this.field6804) {
            int var13 = this.field6804 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field6813; var14++) {
                int var15 = this.field6813 - 1 <= var14 ? var14 : var14 + 1;
                if (class584.field7965 == -1 || class616.method3419(var14, class584.field7965, -1, arg1, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class452 var26 = var21 == 0 ? null : this.field6793.method888(var21 - 1, (byte) -24);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class130 var27 = var22 == 0 ? null : this.field6806.method3671(var22 - 1, -102);
                        class452 var28 = var26;
                        if (var26 != null) {
                            if (var26.field6481 == -1 && var26.field6488 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field6490;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field6804 && this.field6813 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            if (var10[var12][var14 - 1] == var22) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var32++;
                                var36++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg0.method1898(var14, var12, (byte) -63) - arg0.method1898(var15, var13, (byte) -120);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg0.method1898(var14, var13, (byte) -20) - arg0.method1898(var15, var12, (byte) -10);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 > var37 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class608.field8229[var39] = -1;
                            class104.field1482[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field6490 ? class6.field46[var19] : class359.field5224[var19];
                        this.method2850(-79, this.field6813, var12, var19, var8, this.field6804, var14, var11, var27, arg4, var26, var20, var9, var18);
                        boolean var41 = var26 != null && var26.field6488 != var26.field6481;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class608.field8229[var42] >= 0 && class25.field248[var42] != class211.field2715[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class79.method638(var18[1], class519.method3018(class104.field1482[4], class104.field1482[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class79.method638(var18[3], class519.method3018(class104.field1482[0], class104.field1482[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class79.method638(var18[0], class519.method3018(class104.field1482[2], class104.field1482[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class79.method638(var18[2], class519.method3018(class104.field1482[6], class104.field1482[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var18[0] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var46 = class111.field1534[var19];
                            var48 = class359.field5228[var19];
                            var49 = var26 == null ? 0 : class445.field6405[var19];
                            var47 = class14.field145[var19];
                            var45 = var27 == null ? 0 : class353.field5133[var19];
                        } else if (var17) {
                            var45 = var27 == null ? 0 : class782.field10746[var19];
                            var46 = class735.field9965[var19];
                            var47 = class99.field1449[var19];
                            var44 = class676.field9050[var19];
                            var48 = class717.field9770[var19];
                            var49 = var26 == null ? 0 : class777.field10675[var19];
                        } else {
                            var48 = class493.field6935[var19];
                            var46 = class427.field6209[var19];
                            var47 = class565.field7739[var19];
                            var49 = var26 == null ? 0 : class773.field10622[var19];
                            var45 = var27 == null ? 0 : class612.field8274[var19];
                            var44 = class666.field8928[var19];
                        }
                        int var50 = var45 + var49;
                        if (var50 <= 0) {
                            class490.method2867(arg1, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg5 == null ? null : new int[var53];
                            int[] var61 = arg5 == null && arg3 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var63 = var26.field6494;
                                var62 = var26.field6481;
                                var64 = var26.field6486;
                                int var65 = class540.method3124(arg4, -19590, var26);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 1;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 1;
                                        class673.field9015[4] = var46[var51];
                                        class673.field9015[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 5;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 5;
                                        class673.field9015[4] = var46[var51];
                                        var68 = 6;
                                        class673.field9015[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 3;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 3;
                                        class673.field9015[4] = var46[var51];
                                        class673.field9015[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 7;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 7;
                                        class673.field9015[4] = var46[var51];
                                        var68 = 6;
                                        class673.field9015[5] = var48[var51];
                                    } else {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = var46[var51];
                                        class673.field9015[2] = var48[var51];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class673.field9015[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field6805[var70];
                                        int var73 = this.field6809[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 512 - var72;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = 512 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class234.field3110[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg5.method1895(var76, var77, 60) - arg0.method1895(var76, var77, 90);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class234.field3110[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg0.method1895(var78, var79, 24) - arg5.method1895(var78, var79, 39);
                                            } else if (arg3 != null && !class87.field1236[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg3.method1895(var80, var81, 36) - arg0.method1895(var80, var81, 33);
                                            }
                                        }
                                        if (var70 < 8 && var26.field6478 < class608.field8229[var71]) {
                                            if (var54 != null) {
                                                var54[var52] = class25.field248[var71];
                                            }
                                            var59[var52] = class584.field7945[var71];
                                            var58[var52] = class679.field9093[var71];
                                            var57[var52] = class211.field2715[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field6494;
                                            var59[var52] = var26.field6486;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (!this.field6799 && arg1 == 0) {
                                    class300.method1945(var12, var14, var26.field6474, var26.field6475 * 8, var26.field6483);
                                }
                                if (var19 != 12 && var26.field6481 != -1 && var26.field6479) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class445.field6405[var19];
                            } else if (var17) {
                                var51 += class777.field10675[var19];
                            } else {
                                var51 += class773.field10622[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class130 var82 = this.field6806.method3671(var22 - 1, -79);
                                class130 var83 = this.field6806.method3671(var23 - 1, -116);
                                class130 var84 = this.field6806.method3671(var24 - 1, -59);
                                class130 var85 = this.field6806.method3671(var25 - 1, -98);
                                for (int var86 = 0; var86 < var45; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 1;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 1;
                                        class673.field9015[4] = var46[var51];
                                        var88 = 6;
                                        class673.field9015[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 5;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 5;
                                        class673.field9015[4] = var46[var51];
                                        class673.field9015[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 3;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 3;
                                        class673.field9015[4] = var46[var51];
                                        var88 = 6;
                                        class673.field9015[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = 7;
                                        class673.field9015[2] = var48[var51];
                                        class673.field9015[3] = 7;
                                        class673.field9015[4] = var46[var51];
                                        var88 = 6;
                                        class673.field9015[5] = var48[var51];
                                    } else {
                                        class673.field9015[0] = var47[var51];
                                        class673.field9015[1] = var46[var51];
                                        var88 = 3;
                                        class673.field9015[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class673.field9015[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field6805[var90];
                                        int var93 = this.field6809[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var95 = var93;
                                            var94 = var92;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class234.field3110[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg5.method1895(var96, var97, 81) - arg0.method1895(var96, var97, 60);
                                        }
                                        if (var61 != null) {
                                            if (arg5 != null && !class234.field3110[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg0.method1895(var98, var99, 71) - arg5.method1895(var98, var99, 28);
                                            } else if (arg3 != null && !class87.field1236[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg3.method1895(var100, var101, 36) - arg0.method1895(var100, var101, 44);
                                            }
                                        }
                                        if (var90 < 8 && class608.field8229[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class25.field248[var91];
                                            }
                                            var59[var52] = class584.field7945[var91];
                                            var58[var52] = class679.field9093[var91];
                                            var57[var52] = class211.field2715[var91];
                                        } else {
                                            if (var17 && class234.field3110[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var82.field1797;
                                                var59[var52] = var82.field1784;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var83.field1797;
                                                var59[var52] = var83.field1784;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var84.field1797;
                                                var59[var52] = var84.field1784;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var85.field1797;
                                                var59[var52] = var85.field1784;
                                            } else {
                                                if (var94 >= 256) {
                                                    if (var95 < 256) {
                                                        var58[var52] = var85.field1797;
                                                        var59[var52] = var85.field1784;
                                                    } else {
                                                        var58[var52] = var84.field1797;
                                                        var59[var52] = var84.field1784;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var82.field1797;
                                                    var59[var52] = var82.field1784;
                                                } else {
                                                    var58[var52] = var83.field1797;
                                                    var59[var52] = var83.field1784;
                                                }
                                                int var102 = class122.method875(arg6[var13][var14], arg6[var12][var14], -2, var94 << 7 >> 9);
                                                int var103 = class122.method875(arg6[var13][var15], arg6[var12][var15], -2, var94 << 7 >> 9);
                                                var57[var52] = class122.method875(var103, var102, -2, var95 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field1783) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg0.method1898(var14, var12, (byte) -73);
                            int var105 = arg0.method1898(var14, var13, (byte) -101);
                            int var106 = arg0.method1898(var15, var13, (byte) -55);
                            int var107 = arg0.method1898(var15, var12, (byte) -34);
                            boolean var108 = class49.method310(var12, var14, (byte) 86);
                            if (var108 && arg1 > 1 || !var108 && arg1 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field1788) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field6487) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field6794[arg1][var12][var14] = (byte) class670.method3699(this.field6794[arg1][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field6799) {
                                var110 = class211.method1374(var12, var14);
                                var111 = class518.method3016(var12, var14);
                                var112 = class73.method597(var12, var14);
                            }
                            arg0.method188(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class490.method2867(arg1, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }
}
