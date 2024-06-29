import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 {

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
    private int[] field164 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
    private int[] field173 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Z")
    public boolean field189;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "Lhv;")
    private class358 field182;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public int field168;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "Lsg;")
    private class272 field179;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "[[[I")
    public int[][][] field183;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[[[B")
    public byte[][][] field166;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "[[[B")
    private byte[][][] field188;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "[[[B")
    private byte[][][] field174;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "[[[B")
    private byte[][][] field187;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "[[[B")
    private byte[][][] field181;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field169 = new String[8];

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lpt;")
    public static class367 field177;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "[Lf;")
    public static class529[] field186;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "[[[B")
    public byte[][][] field180;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILcu;IIII[Lbr;II)V")
    public final void method70(int arg0, int arg1, class145 arg2, int arg3, int arg4, int arg5, int arg6, class268[] arg7, int arg8, int arg9) {
        field178++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field189) {
            class268 var12 = arg7[arg5];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = arg8 + class185.method1293(var14 & 0x7, var13 & 0x7, arg9, false);
                    int var16 = arg3 + class21.method172((byte) 109, arg9, var13 & 0x7, var14 & 0x7);
                    if (var15 > 0 && this.field195 - 1 > var15 && var16 > 0 && this.field194 - 1 > var16) {
                        var12.method1721(-105, var15, var16);
                    }
                }
            }
        }
        int var17 = (arg0 & 0x7) * 8;
        int var18 = arg4 & 0x1FFFFFF8 << 3;
        if (arg1 <= 114) {
            return;
        }
        int var19 = arg0 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field168; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 != var22 || var23 < var11 || var23 > (var11 + 8) || var17 > var24 || var24 > (var17 + 8)) {
                        this.method75(0, false, 0, 115, 0, 0, 0, -1, 0, arg2, -1);
                    } else if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg9 == 0) {
                            var31 = var23 + arg8 - var11;
                            var32 = arg3 + var24 - var17;
                        } else if (arg9 == 1) {
                            var31 = var24 + arg8 - var17;
                            var32 = arg3 + (var11 - var23) + 8;
                        } else if (arg9 == 2) {
                            var31 = var11 + arg8 + 8 - var23;
                            var32 = arg3 + 8 - (var24 - var17);
                        } else {
                            var32 = arg3 - (var11 - var23);
                            var31 = arg8 + 8 - (-var17 + var24);
                        }
                        this.method75(0, true, var18 + var23, 73, arg5, 0, 0, var32, var19 + var24, arg2, var31);
                    } else {
                        int var25 = arg8 + class185.method1293(var24 & 0x7, var23 & 0x7, arg9, false);
                        int var26 = arg3 + class21.method172((byte) 98, arg9, var23 & 0x7, var24 & 0x7);
                        this.method75(var20, false, var18 + var23, 75, arg5, arg9, var21, var26, var19 + var24, arg2, var25);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg9 == 0) {
                                var29 = arg3 + var28 - var17;
                                var30 = var27 + arg8 - var11;
                            } else if (arg9 == 1) {
                                var29 = arg3 + var11 + 8 - var27;
                                var30 = -var17 - (-var28 - arg8);
                            } else if (arg9 == 2) {
                                var30 = var11 + arg8 + 8 - var27;
                                var29 = arg3 + var17 + 8 - var28;
                            } else {
                                var30 = var17 + arg8 + 8 - var28;
                                var29 = var27 + arg3 - var11;
                            }
                            if (var30 >= 0 && this.field195 > var30 && var29 >= 0 && var29 < this.field194) {
                                this.field183[arg5][var30][var29] = this.field183[arg5][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[[BLqa;IILsf;[[BILgf;I[[BII[Z)V")
    private final void method71(int arg0, byte[][] arg1, class162 arg2, int arg3, int arg4, class361 arg5, byte[][] arg6, int arg7, class180 arg8, int arg9, byte[][] arg10, int arg11, int arg12, boolean[] arg13) {
        if (arg8 != null && arg5 != null || arg5 != null && arg9 == 12 || arg8 != null && arg9 == 0) {
            boolean[] var15 = arg8 != null && arg8.field2726 ? class361.field5474[arg9] : class86.field1482[arg9];
            if (arg11 > 0) {
                if (arg0 > 0) {
                    int var16 = arg10[arg0 - 1][arg11 - 1] & 0xFF;
                    if (var16 > 0) {
                        class180 var17 = this.field179.method1754(var16 - 1, -118);
                        if (var17.field2716 != -1 && var17.field2726) {
                            byte var18 = arg6[arg0 - 1][arg11 - 1];
                            int var19 = arg1[arg0 - 1][arg11 - 1] * 2 + 4 & 0x7;
                            int var20 = class132.method982(var17, true, arg2);
                            if (class130.field2076[var18][var19]) {
                                class68.field1172[0] = var17.field2716;
                                class267.field3843[0] = var20;
                                class406.field6098[0] = arg2.method224() ? var17.field2723 : var17.field2722;
                                class110.field1870[0] = var17.field2725;
                                class388.field5842[0] = var17.field2720;
                                class330.field4984[0] = 256;
                            }
                        }
                    }
                }
                if (arg7 - 1 > arg0) {
                    int var21 = arg10[arg0 + 1][arg11 - 1] & 0xFF;
                    if (var21 > 0) {
                        class180 var22 = this.field179.method1754(var21 - 1, 111);
                        if (var22.field2716 != -1 && var22.field2726) {
                            byte var23 = arg6[arg0 + 1][arg11 - 1];
                            int var24 = arg1[arg0 + 1][arg11 - 1] * 2 + 6 & 0x7;
                            int var25 = class132.method982(var22, true, arg2);
                            if (class130.field2076[var23][var24]) {
                                class68.field1172[2] = var22.field2716;
                                class267.field3843[2] = var25;
                                class406.field6098[2] = arg2.method224() ? var22.field2723 : var22.field2722;
                                class110.field1870[2] = var22.field2725;
                                class388.field5842[2] = var22.field2720;
                                class330.field4984[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg11 < (arg12 - 1)) {
                if (arg0 > 0) {
                    int var26 = arg10[arg0 - 1][arg11 + 1] & 0xFF;
                    if (var26 > 0) {
                        class180 var27 = this.field179.method1754(var26 - 1, arg4 ^ 0xFFFFFFBE);
                        if (var27.field2716 != -1 && var27.field2726) {
                            byte var28 = arg6[arg0 - 1][arg11 + 1];
                            int var29 = (arg1[arg0 - 1][arg11 + 1] * 2) + 2 & 0x7;
                            int var30 = class132.method982(var27, true, arg2);
                            if (class130.field2076[var28][var29]) {
                                class68.field1172[6] = var27.field2716;
                                class267.field3843[6] = var30;
                                class406.field6098[6] = arg2.method224() ? var27.field2723 : var27.field2722;
                                class110.field1870[6] = var27.field2725;
                                class388.field5842[6] = var27.field2720;
                                class330.field4984[6] = 64;
                            }
                        }
                    }
                }
                if (arg7 - 1 > arg0) {
                    int var31 = arg10[arg0 + 1][arg11 + 1] & 0xFF;
                    if (var31 > 0) {
                        class180 var32 = this.field179.method1754(var31 - 1, 53);
                        if (var32.field2716 != -1 && var32.field2726) {
                            byte var33 = arg6[arg0 + 1][arg11 + 1];
                            int var34 = arg1[arg0 + 1][arg11 + 1] * 2 & 0x7;
                            int var35 = class132.method982(var32, true, arg2);
                            if (class130.field2076[var33][var34]) {
                                class68.field1172[4] = var32.field2716;
                                class267.field3843[4] = var35;
                                class406.field6098[4] = arg2.method224() ? var32.field2723 : var32.field2722;
                                class110.field1870[4] = var32.field2725;
                                class388.field5842[4] = var32.field2720;
                                class330.field4984[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var36 = arg10[arg0][arg11 - 1] & 0xFF;
                if (var36 > 0) {
                    class180 var37 = this.field179.method1754(var36 - 1, 48);
                    if (var37.field2716 != -1) {
                        byte var38 = arg6[arg0][arg11 - 1];
                        byte var39 = arg1[arg0][arg11 - 1];
                        if (var37.field2726) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class132.method982(var37, true, arg2);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class130.field2076[var38][var41] && class388.field5842[var40] <= var37.field2720) {
                                    class68.field1172[var40] = var37.field2716;
                                    class267.field3843[var40] = var42;
                                    class406.field6098[var40] = arg2.method224() ? var37.field2723 : var37.field2722;
                                    class110.field1870[var40] = var37.field2725;
                                    if (class388.field5842[var40] == var37.field2720) {
                                        class330.field4984[var40] = class121.method909(class330.field4984[var40], 32);
                                    } else {
                                        class330.field4984[var40] = 32;
                                    }
                                    class388.field5842[var40] = var37.field2720;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg3 & 0x3]) {
                                arg13[0] = class361.field5474[var38][class207.method1405(var39 + 2, 3)];
                            }
                        } else if (!var15[-(-arg3) & 0x3]) {
                            arg13[0] = class86.field1482[var38][class207.method1405(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg11 < (arg12 - 1)) {
                int var44 = arg10[arg0][arg11 + 1] & 0xFF;
                if (var44 > 0) {
                    class180 var45 = this.field179.method1754(var44 - 1, arg4 ^ 0x68);
                    if (var45.field2716 != -1) {
                        byte var46 = arg6[arg0][arg11 + 1];
                        byte var47 = arg1[arg0][arg11 + 1];
                        if (var45.field2726) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class132.method982(var45, true, arg2);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class130.field2076[var46][var49] && class388.field5842[var48] <= var45.field2720) {
                                    class68.field1172[var48] = var45.field2716;
                                    class267.field3843[var48] = var50;
                                    class406.field6098[var48] = arg2.method224() ? var45.field2723 : var45.field2722;
                                    class110.field1870[var48] = var45.field2725;
                                    if (class388.field5842[var48] == var45.field2720) {
                                        class330.field4984[var48] = class121.method909(class330.field4984[var48], 16);
                                    } else {
                                        class330.field4984[var48] = 16;
                                    }
                                    class388.field5842[var48] = var45.field2720;
                                }
                                var49--;
                                var48++;
                            }
                            if (!var15[arg3 + 2 & 0x3]) {
                                arg13[2] = class361.field5474[var46][class207.method1405(3, var47)];
                            }
                        } else if (!var15[arg3 + 2 & 0x3]) {
                            arg13[2] = class86.field1482[var46][class207.method1405(var47, 3)];
                        }
                    }
                }
            }
            if (arg0 > 0) {
                int var52 = arg10[arg0 - 1][arg11] & 0xFF;
                if (var52 > 0) {
                    class180 var53 = this.field179.method1754(var52 - 1, 106);
                    if (var53.field2716 != -1) {
                        byte var54 = arg6[arg0 - 1][arg11];
                        byte var55 = arg1[arg0 - 1][arg11];
                        if (var53.field2726) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class132.method982(var53, true, arg2);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class130.field2076[var54][var57] && var53.field2720 >= class388.field5842[var56]) {
                                    class68.field1172[var56] = var53.field2716;
                                    class267.field3843[var56] = var58;
                                    class406.field6098[var56] = arg2.method224() ? var53.field2723 : var53.field2722;
                                    class110.field1870[var56] = var53.field2725;
                                    if (class388.field5842[var56] == var53.field2720) {
                                        class330.field4984[var56] = class121.method909(class330.field4984[var56], 8);
                                    } else {
                                        class330.field4984[var56] = 8;
                                    }
                                    class388.field5842[var56] = var53.field2720;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg3 + 3 & 0x3]) {
                                arg13[3] = class361.field5474[var54][class207.method1405(var55 + 1, 3)];
                            }
                        } else if (!var15[arg3 + 3 & 0x3]) {
                            arg13[3] = class86.field1482[var54][class207.method1405(3, var55 + 1)];
                        }
                    }
                }
            }
            if (arg0 < (arg7 - 1)) {
                int var60 = arg10[arg0 + 1][arg11] & 0xFF;
                if (var60 > 0) {
                    class180 var61 = this.field179.method1754(var60 - 1, 103);
                    if (var61.field2716 != -1) {
                        byte var62 = arg6[arg0 + 1][arg11];
                        byte var63 = arg1[arg0 + 1][arg11];
                        if (var61.field2726) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class132.method982(var61, true, arg2);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class130.field2076[var62][var65] && class388.field5842[var64] <= var61.field2720) {
                                    class68.field1172[var64] = var61.field2716;
                                    class267.field3843[var64] = var66;
                                    class406.field6098[var64] = arg2.method224() ? var61.field2723 : var61.field2722;
                                    class110.field1870[var64] = var61.field2725;
                                    if (class388.field5842[var64] == var61.field2720) {
                                        class330.field4984[var64] = class121.method909(class330.field4984[var64], 4);
                                    } else {
                                        class330.field4984[var64] = 4;
                                    }
                                    class388.field5842[var64] = var61.field2720;
                                }
                                var65++;
                                var64--;
                            }
                            if (!var15[arg3 + 1 & 0x3]) {
                                arg13[1] = class361.field5474[var62][class207.method1405(3, var63 + 3)];
                            }
                        } else if (!var15[arg3 + 1 & 0x3]) {
                            arg13[1] = class86.field1482[var62][class207.method1405(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        field170++;
        if (arg4 != 2) {
            method76(-60, true);
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class132.method982(arg8, true, arg2);
        if (!arg8.field2726) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg3 * 2) & 0x7;
            if (class130.field2076[arg9][var69] && class388.field5842[var70] <= arg8.field2720) {
                class68.field1172[var70] = arg8.field2716;
                class267.field3843[var70] = var68;
                class406.field6098[var70] = arg2.method224() ? arg8.field2723 : arg8.field2722;
                class110.field1870[var70] = arg8.field2725;
                if (class388.field5842[var70] == arg8.field2720) {
                    class330.field4984[var70] = class121.method909(class330.field4984[var70], 2);
                } else {
                    class330.field4984[var70] = 2;
                }
                class388.field5842[var70] = arg8.field2720;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lna;BLqa;Lna;)V")
    public final void method72(class35 arg0, byte arg1, class162 arg2, class35 arg3) {
        field190++;
        if (class295.field4202 == null || class295.field4202.length != this.field194) {
            class295.field4202 = new int[this.field194];
            class162.field2515 = new int[this.field194];
            class21.field429 = new int[this.field194];
            class130.field2071 = new int[this.field194];
            class13.field213 = new int[this.field194];
        }
        int[][] var5 = new int[this.field195][this.field194];
        for (int var6 = 0; var6 < this.field168; var6++) {
            for (int var8 = 0; var8 < this.field194; var8++) {
                class295.field4202[var8] = 0;
                class162.field2515[var8] = 0;
                class130.field2071[var8] = 0;
                class21.field429[var8] = 0;
                class13.field213[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field195; var9++) {
                for (int var10 = 0; var10 < this.field194; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field195 > var19) {
                        int var20 = this.field188[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class361 var21 = this.field182.method2260((byte) 90, var20 - 1);
                            class295.field4202[var10] += var21.field5478;
                            class162.field2515[var10] += var21.field5480;
                            class130.field2071[var10] += var21.field5473;
                            class21.field429[var10] += var21.field5470;
                            var10002 = class13.field213[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field188[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class361 var24 = this.field182.method2260((byte) 90, var23 - 1);
                            class295.field4202[var10] -= var24.field5478;
                            class162.field2515[var10] -= var24.field5480;
                            class130.field2071[var10] -= var24.field5473;
                            class21.field429[var10] -= var24.field5470;
                            var10002 = class13.field213[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field194; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field194) {
                            var14 += class21.field429[var17];
                            var12 += class162.field2515[var17];
                            var15 += class13.field213[var17];
                            var11 += class295.field4202[var17];
                            var13 += class130.field2071[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class21.field429[var18];
                            var13 -= class130.field2071[var18];
                            var12 -= class162.field2515[var18];
                            var15 -= class13.field213[var18];
                            var11 -= class295.field4202[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class101.method746(var12 / var15, (byte) 45, var11 * 256 / var14, var13 / var15);
                        }
                    }
                }
            }
            if (class228.field3250) {
                this.method74(var6 == 0 ? arg3 : null, var6, (byte) -124, class88.field1546[var6], var5, arg2, var6 == 0 ? arg0 : null);
            } else {
                this.method77(var6 == 0 ? arg0 : null, (byte) 28, var6, arg2, var6 == 0 ? arg3 : null, var5, class88.field1546[var6]);
            }
            this.field188[var6] = null;
            this.field174[var6] = null;
            this.field181[var6] = null;
            this.field187[var6] = null;
        }
        if (!this.field189) {
            if (class37.field708 != 0) {
                class209.method1415();
            }
            if (class165.field2541) {
                class438.method2617();
            }
        }
        for (int var7 = 0; var7 < this.field168; var7++) {
            class88.field1546[var7].method362();
        }
        if (arg1 < 29) {
            this.field188 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "([Lbr;IILcu;III)V")
    public final void method73(class268[] arg0, int arg1, int arg2, class145 arg3, int arg4, int arg5, int arg6) {
        field184++;
        if (!this.field189) {
            for (int var8 = 0; var8 < 4; var8++) {
                class268 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field195 > var12 && var13 >= 0 && this.field194 > var13) {
                            var9.method1721(-88, var12, var13);
                        }
                    }
                }
            }
        }
        int var14 = arg1 + arg2;
        int var15 = arg4 + arg5;
        for (int var16 = arg6; var16 < this.field168; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method75(0, false, var14 + var17, arg6 + 75, var16, 0, 0, arg4 + var18, var15 - -var18, arg3, arg1 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lna;IBLna;[[ILqa;Lna;)V")
    private final void method74(class35 arg0, int arg1, byte arg2, class35 arg3, int[][] arg4, class162 arg5, class35 arg6) {
        field171++;
        byte[][] var8 = this.field181[arg1];
        byte[][] var9 = this.field187[arg1];
        byte[][] var10 = this.field188[arg1];
        byte[][] var11 = this.field174[arg1];
        if (arg2 >= -123) {
            return;
        }
        for (int var12 = 0; var12 < this.field195; var12++) {
            int var13 = (this.field195 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field194; var14++) {
                int var15 = (this.field194 - 1) <= var14 ? var14 : var14 + 1;
                if (class407.field6103 == -1 || class114.method850(var14, var12, arg1, class407.field6103, 106)) {
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
                        class180 var26 = var21 == 0 ? null : this.field179.method1754(var21 - 1, -112);
                        class361 var27 = var22 == 0 ? null : this.field182.method2260((byte) 90, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class180 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2716 == -1 && var26.field2715 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2726;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && var12 < this.field195 && this.field194 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var35++;
                            } else {
                                var32--;
                                var35--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var36--;
                                var32--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var33 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method376(var12, var14) - arg3.method376(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method376(var13, var14) - arg3.method376(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class388.field5842[var39] = -1;
                            class330.field4984[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2726 ? class361.field5474[var19] : class86.field1482[var19];
                        this.method71(var12, var9, arg5, var20, 2, var27, var8, this.field195, var26, var19, var11, var14, this.field194, var18);
                        boolean var41 = var26 != null && var26.field2716 != var26.field2715;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class388.field5842[var42] >= 0 && class68.field1172[var42] != class267.field3843[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class200.method1381(var18[1], class207.method1405(class330.field4984[4], class330.field4984[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class200.method1381(var18[3], class207.method1405(class330.field4984[0], class330.field4984[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class200.method1381(var18[0], class207.method1405(class330.field4984[0], class330.field4984[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class200.method1381(var18[2], class207.method1405(class330.field4984[6], class330.field4984[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                                var20 = 2;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[2] = var18[3] = false;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class357.field5434[var19];
                            var49 = var27 == null ? 0 : class214.field3083[var19];
                            var48 = class71.field1241[var19];
                            var46 = var26 == null ? 0 : class402.field6030[var19];
                            var47 = class63.field1089[var19];
                        } else if (var17) {
                            var45 = class523.field7756[var19];
                            var46 = var26 == null ? 0 : class232.field3389[var19];
                            var47 = class23.field481[var19];
                            var48 = class267.field3841[var19];
                            var49 = var27 == null ? 0 : class337.field5079[var19];
                            var44 = class30.field636[var19];
                        } else {
                            var46 = var26 == null ? 0 : class499.field7371[var19];
                            var44 = class424.field6324[var19];
                            var49 = var27 == null ? 0 : class466.field6957[var19];
                            var47 = class240.field3454[var19];
                            var45 = class233.field3394[var19];
                            var48 = class160.field2481[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class36.method379(arg1, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field2716;
                                var63 = arg5.method224() ? var26.field2723 : var26.field2722;
                                var64 = var26.field2725;
                                int var65 = class132.method982(var26, true, arg5);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 1;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 1;
                                        class396.field5975[4] = var48[var51];
                                        var98 = 6;
                                        class396.field5975[5] = var47[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 5;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 5;
                                        class396.field5975[4] = var48[var51];
                                        class396.field5975[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 3;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 3;
                                        class396.field5975[4] = var48[var51];
                                        class396.field5975[5] = var47[var51];
                                        var98 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 7;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 7;
                                        class396.field5975[4] = var48[var51];
                                        class396.field5975[5] = var47[var51];
                                        var98 = 6;
                                    } else {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = var48[var51];
                                        class396.field5975[2] = var47[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class396.field5975[var99];
                                        int var101 = var100 - var20 * 2 & 0x7;
                                        int var102 = this.field173[var100];
                                        int var103 = this.field164[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var105 = 128 - var102;
                                            var104 = var103;
                                        } else if (var20 == 2) {
                                            var105 = 128 - var103;
                                            var104 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var104 = 128 - var103;
                                            var105 = var102;
                                        } else {
                                            var105 = var103;
                                            var104 = var102;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class130.field2076[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg6.method371(var106, var107) - arg3.method371(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class130.field2076[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method371(var108, var109) - arg6.method371(var108, var109);
                                            } else if (arg0 != null && !class5.field125[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg0.method371(var110, var111) - arg3.method371(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class388.field5842[var101] > var26.field2720) {
                                            if (var54 != null) {
                                                var54[var52] = class267.field3843[var101];
                                            }
                                            var59[var52] = class110.field1870[var101];
                                            var58[var52] = class406.field6098[var101];
                                            var57[var52] = class68.field1172[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg5.method224() ? var26.field2723 : var26.field2722;
                                            var59[var52] = var26.field2725;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field189 && arg1 == 0) {
                                    class141.method1052(var12, var14, var26.field2719, var26.field2714 * 8, var26.field2717);
                                }
                                if (var19 != 12 && var26.field2716 != -1 && var26.field2724) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class402.field6030[var19];
                            } else if (var17) {
                                var51 += class232.field3389[var19];
                            } else {
                                var51 += class499.field7371[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class361 var67 = this.field182.method2260((byte) 90, var22 - 1);
                                class361 var68 = this.field182.method2260((byte) 90, var23 - 1);
                                class361 var69 = this.field182.method2260((byte) 90, var24 - 1);
                                class361 var70 = this.field182.method2260((byte) 90, var25 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 1;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 1;
                                        class396.field5975[4] = var48[var51];
                                        class396.field5975[5] = var47[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 5;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 5;
                                        class396.field5975[4] = var48[var51];
                                        var73 = 6;
                                        class396.field5975[5] = var47[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 3;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 3;
                                        class396.field5975[4] = var48[var51];
                                        var73 = 6;
                                        class396.field5975[5] = var47[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = 7;
                                        class396.field5975[2] = var47[var51];
                                        class396.field5975[3] = 7;
                                        class396.field5975[4] = var48[var51];
                                        class396.field5975[5] = var47[var51];
                                        var73 = 6;
                                    } else {
                                        class396.field5975[0] = var45[var51];
                                        class396.field5975[1] = var48[var51];
                                        var73 = 3;
                                        class396.field5975[2] = var47[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class396.field5975[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field173[var75];
                                        int var78 = this.field164[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class130.field2076[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg6.method371(var81, var82) - arg3.method371(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class130.field2076[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg3.method371(var83, var84) - arg6.method371(var83, var84);
                                            } else if (arg0 != null && !class5.field125[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg0.method371(var85, var86) - arg3.method371(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class388.field5842[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class267.field3843[var76];
                                            }
                                            var59[var52] = class110.field1870[var76];
                                            var58[var52] = class406.field6098[var76];
                                            var57[var52] = class68.field1172[var76];
                                        } else {
                                            if (var17 && class130.field2076[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field5472;
                                                var59[var52] = var67.field5475;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field5472;
                                                var59[var52] = var68.field5475;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field5472;
                                                var59[var52] = var69.field5475;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field5472;
                                                var59[var52] = var70.field5475;
                                            } else {
                                                if (var79 < 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var67.field5472;
                                                        var59[var52] = var67.field5475;
                                                    } else {
                                                        var58[var52] = var68.field5472;
                                                        var59[var52] = var68.field5475;
                                                    }
                                                } else if (var80 < 64) {
                                                    var58[var52] = var70.field5472;
                                                    var59[var52] = var70.field5475;
                                                } else {
                                                    var58[var52] = var69.field5472;
                                                    var59[var52] = var69.field5475;
                                                }
                                                int var87 = class511.method3060(128, var79 << 7 >> 7, arg4[var13][var14], arg4[var12][var14]);
                                                int var88 = class511.method3060(128, var79 << 7 >> 7, arg4[var13][var15], arg4[var12][var15]);
                                                var57[var52] = class511.method3060(128, var80 << 7 >> 7, var88, var87);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field5479) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method376(var12, var14);
                            int var90 = arg3.method376(var13, var14);
                            int var91 = arg3.method376(var13, var15);
                            int var92 = arg3.method376(var12, var15);
                            if (arg1 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field2721) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field166[arg1][var12][var14] = (byte) class121.method909(this.field166[arg1][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field189) {
                                var94 = class164.method1212(var12, var14);
                                var95 = class500.method2992(var12, var14);
                                var96 = class4.method33(var12, var14);
                            }
                            arg3.method370(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class36.method379(arg1, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZIIIIIIILcu;I)V")
    private final void method75(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class145 arg9, int arg10) {
        if (arg5 == 1) {
            arg6 = 1;
        } else if (arg5 == 2) {
            arg0 = 1;
            arg6 = 1;
        } else if (arg5 == 3) {
            arg0 = 1;
        }
        field192++;
        if (arg3 <= 38) {
            return;
        }
        if (arg10 < 0 || this.field195 <= arg10 || arg7 < 0 || arg7 >= this.field194) {
            while (true) {
                int var14 = arg9.method1063((byte) 121);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method1063((byte) 105);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method1063((byte) -33);
                }
            }
        }
        if (!this.field189 && !arg1) {
            class260.field3784[arg4][arg10][arg7] = 0;
        }
        while (true) {
            int var12 = arg9.method1063((byte) 126);
            if (var12 == 0) {
                if (this.field189) {
                    this.field183[0][arg10 + arg0][arg7 + arg6] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field183[0][arg0 + arg10][arg7 + arg6] = -class332.method2135(arg2 + 932731, (byte) 116, arg8 + 556238) * 8 << 0;
                    return;
                } else {
                    this.field183[arg4][arg0 + arg10][arg6 + arg7] = this.field183[arg4 - 1][arg0 + arg10][arg6 + arg7] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method1063((byte) -115);
                if (!this.field189) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 != 0) {
                        this.field183[arg4][arg0 + arg10][arg6 + arg7] = this.field183[arg4 - 1][arg0 + arg10][arg6 + arg7] - (var13 * 8 << 0);
                        return;
                    }
                    this.field183[0][arg0 + arg10][arg6 + arg7] = -var13 * 8 << 0;
                    return;
                }
                this.field183[0][arg0 + arg10][arg7 + arg6] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg1) {
                    arg9.method1063((byte) 107);
                } else {
                    this.field174[arg4][arg10][arg7] = arg9.method1093(15);
                    this.field181[arg4][arg10][arg7] = (byte) ((var12 - 2) / 4);
                    this.field187[arg4][arg10][arg7] = (byte) class207.method1405(var12 + arg5 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field189 && !arg1) {
                    class260.field3784[arg4][arg10][arg7] = (byte) (var12 - 49);
                }
            } else if (!arg1) {
                this.field188[arg4][arg10][arg7] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
    public static final void method76(int arg0, boolean arg1) {
        field185++;
        if (arg0 != 0) {
            field169 = null;
        }
        class116.method859(class77.field1297, class364.field5513, (byte) -42, class466.field6952, arg1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lna;BILqa;Lna;[[ILna;)V")
    private final void method77(class35 arg0, byte arg1, int arg2, class162 arg3, class35 arg4, int[][] arg5, class35 arg6) {
        for (int var8 = 0; var8 < this.field195; var8++) {
            for (int var9 = 0; var9 < this.field194; var9++) {
                if (class407.field6103 == -1 || class114.method850(var9, var8, arg2, class407.field6103, 114)) {
                    byte var10 = this.field181[arg2][var8][var9];
                    byte var11 = this.field187[arg2][var8][var9];
                    int var12 = this.field174[arg2][var8][var9] & 0xFF;
                    int var13 = this.field188[arg2][var8][var9] & 0xFF;
                    class180 var14 = var12 == 0 ? null : this.field179.method1754(var12 - 1, 97);
                    class361 var15 = var13 == 0 ? null : this.field182.method2260((byte) 90, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class214.field3083[var10];
                        var17 = var14 == null ? 0 : class402.field6030[var10];
                    } else if (var14 != null) {
                        var17 = class402.field6030[var10];
                    } else if (var15 != null) {
                        var16 = class402.field6030[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field2716 == -1 && var14.field2715 == -1 && var14.field2723 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method224() ? var14.field2723 : var14.field2722;
                            if (class429.field6387) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field2725;
                                if (var14.field2716 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field2716;
                                }
                                if (var14.field2715 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field2715;
                                }
                                var19++;
                            }
                            if (!this.field189 && arg2 == 0) {
                                class141.method1052(var8, var9, var14.field2719, var14.field2714 * 8, var14.field2717);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field5472;
                            if (class429.field6387) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field5475;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field173.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg4 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field173[var36];
                            int var46 = this.field164[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class130.field2076[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method371(var49, var50) - arg6.method371(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class130.field2076[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method371(var51, var52) - arg0.method371(var51, var52);
                                } else if (arg4 != null && !class5.field125[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method371(var53, var54) - arg6.method371(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method376(var8, var9);
                        int var38 = arg6.method376(var8 + 1, var9);
                        int var39 = arg6.method376(var8 + 1, var9 + 1);
                        int var40 = arg6.method376(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field2721) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field166[arg2][var8][var9] = (byte) class121.method909(this.field166[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field189) {
                            var42 = class164.method1212(var8, var9);
                            var43 = class500.method2992(var8, var9);
                            var44 = class4.method33(var8, var9);
                        }
                        arg6.method367(var8, var9, var32, var34, var33, var35, class357.field5434[var10], class71.field1241[var10], class63.field1089[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class36.method379(arg2, var8, var9);
                    }
                }
            }
        }
        if (arg1 == 28) {
            field172++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
    public final void method78(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 0;
        if (arg2 != 12449) {
            return;
        }
        while (var6 < this.field168) {
            this.method83(arg0, arg3, arg4, -1, var6, arg1);
            var6++;
        }
        field167++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    public static void method79(byte arg0) {
        field186 = null;
        field169 = null;
        field177 = null;
        if (arg0 != 11) {
            field196 = 65;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[[I)V")
    public final void method80(int arg0, int arg1, int[][] arg2) {
        field175++;
        int[][] var4 = this.field183[arg1];
        for (int var5 = arg0; var5 < (this.field195 + 1); var5++) {
            for (int var6 = 0; var6 < (this.field194 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Z")
    public static final boolean method81(int arg0, int arg1, byte arg2) {
        field176++;
        if (arg2 != -98) {
            field169 = null;
        }
        return (arg0 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lqa;[Lbr;[[[II)V")
    public final void method82(class162 arg0, class268[] arg1, int[][][] arg2, int arg3) {
        field193++;
        if (!this.field189) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field195; var6++) {
                    for (int var7 = 0; var7 < this.field194; var7++) {
                        if ((class260.field3784[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class260.field3784[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1733(0, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        if (arg3 <= 0) {
            return;
        }
        for (int var9 = 0; var9 < this.field168; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field189) {
                if (class165.field2541) {
                    var10 |= 0x2;
                }
                if (class89.field1549) {
                    var11 |= 0x8;
                }
                if (class37.field708 != 0) {
                    if (var9 == 0 | class436.field6501) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class165.field2541) {
                var11 |= 0x7;
            }
            if (!class141.field2241) {
                var11 |= 0x20;
            }
            int[][] var12 = arg2 == null || arg2.length <= var9 ? this.field183[var9] : arg2[var9];
            class139.method1042(var9, arg0.method273(this.field195, this.field194, this.field183[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIII)V")
    public final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field191++;
        for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
            for (int var10 = arg2; var10 < (arg2 + arg5); var10++) {
                if (var10 >= 0 && var10 < this.field195 && var7 >= 0 && this.field194 > var7) {
                    this.field183[arg4][var10][var7] = arg4 > 0 ? this.field183[arg4 - 1][var10][var7] - 240 : 0;
                }
            }
        }
        if (arg2 > 0 && arg2 < this.field195) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg1; var8++) {
                if (var8 >= 0 && var8 < this.field194) {
                    this.field183[arg4][arg2][var8] = this.field183[arg4][arg2 - 1][var8];
                }
            }
        }
        if (arg3 > ~arg0 && arg0 < this.field194) {
            for (int var9 = arg2 + 1; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < this.field195) {
                    this.field183[arg4][var9][arg0] = this.field183[arg4][var9][arg0 - 1];
                }
            }
        }
        if (arg2 < 0 || arg0 < 0 || arg2 >= this.field195 || arg0 >= this.field194) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 > 0 && this.field183[arg4][arg2 - 1][arg0] != 0) {
                this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2 - 1][arg0];
                return;
            }
            if (arg0 <= 0 || this.field183[arg4][arg2][arg0 - 1] == 0) {
                if (arg2 > 0 && arg0 > 0 && this.field183[arg4][arg2 - 1][arg0 - 1] != 0) {
                    this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2][arg0 - 1];
        } else if (arg2 <= 0 || this.field183[arg4 - 1][arg2 - 1][arg0] == this.field183[arg4][arg2 - 1][arg0]) {
            if (arg0 > 0 && this.field183[arg4 - 1][arg2][arg0 - 1] != this.field183[arg4][arg2][arg0 - 1]) {
                this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2][arg0 - 1];
                return;
            }
            if (arg2 > 0 && arg0 > 0 && this.field183[arg4][arg2 - 1][arg0 - 1] != this.field183[arg4 - 1][arg2 - 1][arg0 - 1]) {
                this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2 - 1][arg0 - 1];
                return;
            }
        } else {
            this.field183[arg4][arg2][arg0] = this.field183[arg4][arg2 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIZLsg;Lhv;)V")
    public class11(int arg0, int arg1, int arg2, boolean arg3, class272 arg4, class358 arg5) {
        this.field189 = arg3;
        this.field182 = arg5;
        this.field168 = arg0;
        this.field179 = arg4;
        this.field194 = arg2;
        this.field195 = arg1;
        this.field183 = new int[this.field168][this.field195 + 1][this.field194 + 1];
        this.field166 = new byte[this.field168][this.field195 + 1][this.field194 + 1];
        this.field188 = new byte[this.field168][this.field195][this.field194];
        this.field174 = new byte[this.field168][this.field195][this.field194];
        this.field187 = new byte[this.field168][this.field195][this.field194];
        this.field181 = new byte[this.field168][this.field195][this.field194];
    }

    static {
        new class342("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field196 = 0;
    }
}
