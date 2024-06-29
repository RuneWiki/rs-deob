import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class208 extends class107 {

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    private int field3540 = 1;

    @OriginalMember(owner = "client!ce", name = "db", descriptor = "I")
    private int field3554 = 1;

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3541 = -1;

    @OriginalMember(owner = "client!ce", name = "cb", descriptor = "Lpj;")
    public static class237 field3553 = class33.method353("null", 97);

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "I")
    public static volatile int field3544 = -1;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "Lpj;")
    private static class237 field3543 = class33.method353(" has logged in)3", 112);

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Lpj;")
    public static class237 field3546 = field3543;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ce", name = "eb", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!ce", name = "fb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "Ljj;")
    public static class103 field3545;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIII)V")
    public static final void method1391(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class199.method1361(arg2, arg4 - -arg1, class62.field1241[arg3], -arg1 + arg4, 67);
        ++field3547;
        if (arg0 != -69) {
            method1391((byte) 79, 64, -14, 111, 127);
        }
        int var5 = arg1;
        int var6 = -arg1;
        int var7 = -1;
        int var8 = 0;
        while (~var8 > ~var5) {
            var7 += 2;
            var6 += var7;
            ++var8;
            if (var6 >= 0) {
                --var5;
                int[] var9 = class62.field1241[arg3 - var5];
                int[] var10 = class62.field1241[arg3 + var5];
                var6 -= var5 << 1;
                int var11 = arg4 + var8;
                int var12 = arg4 - var8;
                class199.method1361(arg2, var11, var10, var12, 105);
                class199.method1361(arg2, var11, var9, var12, 100);
            }
            int var13 = arg4 - var5;
            int var14 = arg4 + var5;
            int[] var15 = class62.field1241[arg3 + var8];
            int[] var16 = class62.field1241[-var8 + arg3];
            class199.method1361(arg2, var14, var15, var13, arg0 ^ -61);
            class199.method1361(arg2, var14, var16, var13, 118);
        }
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)V")
    public static void method1392(int arg0) {
        if (arg0 != 0) {
            field3545 = null;
        }
        field3545 = null;
        field3553 = null;
        field3546 = null;
        field3543 = null;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V")
    public static final void method1393(byte arg0) {
        if (arg0 != 25) {
            field3553 = null;
        }
        if (~class215.field3681 > -1) {
            class180.field3167 = -1;
            class51.field1085 = -1;
            class215.field3681 = 0;
        }
        if (class215.field3681 > class148.field2629) {
            class180.field3167 = -1;
            class51.field1085 = -1;
            class215.field3681 = class148.field2629;
        }
        if (~class22.field405 > -1) {
            class180.field3167 = -1;
            class22.field405 = 0;
            class51.field1085 = -1;
        }
        ++field3549;
        if (~class115.field2017 > ~class22.field405) {
            class51.field1085 = -1;
            class22.field405 = class115.field2017;
            class180.field3167 = -1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        class223.field3830.method368(86, 190);
        ++field3548;
        ++class134.field2340;
        int var1 = 52 / ((arg0 - -38) / 61);
        class223.field3830.method293((byte) 125, class37.method381(0));
        class223.field3830.method350((byte) 19, class142.field2585);
        class223.field3830.method350((byte) 19, class119.field2087);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 != -32513) {
            this.method122((class32) null, -79, -26);
        }
        ++field3551;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1897 = ~arg0.method316((byte) -28) == -2;
                }
            } else {
                this.field3554 = arg0.method316((byte) 0);
            }
        } else {
            this.field3540 = arg0.method316((byte) 105);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int[][] var3 = super.field1903.method634(arg1, 13012);
        ++field3542;
        int var4 = -119 / ((26 - arg0) / 45);
        if (super.field1903.field1551) {
            int var5 = this.field3554 + this.field3554 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field3540 - -1 + this.field3540;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field3554 + arg1; ~(arg1 - -this.field3554) <= ~var10; ++var10) {
                int var20 = 0;
                int var21 = 0;
                int[][] var22 = this.method802(3, class254.field4363 & var10, 0);
                int[][] var23 = new int[3][class106.field1862];
                int var24 = 0;
                int[] var25 = var22[0];
                int[] var26 = var22[1];
                int[] var27 = var22[2];
                for (int var28 = -this.field3540; var28 <= this.field3540; ++var28) {
                    int var38 = class110.field1937 & var28;
                    var21 += var26[var38];
                    var24 += var27[var38];
                    var20 += var25[var38];
                }
                int[] var29 = var23[0];
                int[] var30 = var23[1];
                int[] var31 = var23[2];
                int var32 = 0;
                while (~class106.field1862 < ~var32) {
                    var29[var32] = var8 * var20 >> 16;
                    var30[var32] = var8 * var21 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = class110.field1937 & -this.field3540 + var32;
                    ++var32;
                    int var34 = var20 - var25[var33];
                    int var35 = var21 - var26[var33];
                    int var36 = var24 - var27[var33];
                    int var37 = class110.field1937 & this.field3540 + var32;
                    var21 = var26[var37] + var35;
                    var24 = var27[var37] + var36;
                    var20 = var25[var37] + var34;
                }
                var9[var10 - -this.field3554 - arg1] = var23;
            }
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class106.field1862 > var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; ~var18 > ~var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var17 += var19[1][var14];
                    var15 += var19[0][var14];
                    var16 += var19[2][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var17 >> 16;
                var13[var14] = var6 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class208() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        ++field3550;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (arg0 != -17) {
            field3544 = -43;
        }
        if (super.field1921.field3539) {
            int var4 = this.field3554 - -this.field3554 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field3540 + 1 + this.field3540;
            int[][] var7 = new int[var4][];
            int var8 = 65536 / var6;
            for (int var9 = -this.field3554 + arg1; this.field3554 + arg1 >= var9; ++var9) {
                int[] var13 = this.method797(0, var9 & class254.field4363, (byte) 121);
                int[] var14 = new int[class106.field1862];
                int var15 = 0;
                for (int var16 = -this.field3540; var16 <= this.field3540; ++var16) {
                    var15 += var13[class110.field1937 & var16];
                }
                int var17 = 0;
                while (var17 < class106.field1862) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[class110.field1937 & -this.field3540 + var17];
                    ++var17;
                    var15 = var13[this.field3540 + var17 & class110.field1937] + var18;
                }
                var7[-arg1 + var9 - -this.field3554] = var14;
            }
            for (int var10 = 0; class106.field1862 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var7[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Llk;Llk;B)V")
    public static final void method1395(class81 arg0, class81 arg1, byte arg2) {
        ++field3552;
        if (arg0.field1520 != null) {
            arg0.method629(0);
        }
        if (arg2 <= 46) {
            method1395((class81) null, (class81) null, (byte) 88);
        }
        arg0.field1520 = arg1.field1520;
        arg0.field1527 = arg1;
        arg0.field1520.field1527 = arg0;
        arg0.field1527.field1520 = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIIIIBIIIIIII)Z")
    public static final boolean method1396(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; ++var13) {
            for (int var40 = 0; var40 < 104; ++var40) {
                class119.field2092[var13][var40] = 0;
                class203.field3484[var13][var40] = 99999999;
            }
        }
        class119.field2092[arg3][arg12] = 99;
        int var14 = arg3;
        int var15 = arg12;
        int var16 = 0;
        byte var17 = 0;
        class203.field3484[arg3][arg12] = 0;
        boolean var18 = false;
        class36.field793[var17] = arg3;
        int var41 = var17 + 1;
        class94.field1673[var17] = arg12;
        int[][] var19 = class146.field2613[class274.field4798].field470;
        ++field3555;
        label372: while (~var16 != ~var41) {
            var15 = class94.field1673[var16];
            var14 = class36.field793[var16];
            var16 = var16 + 1 & 4095;
            if (arg1 == var14 && arg2 == var15) {
                var18 = true;
                break;
            }
            if (~arg4 != -1) {
                if ((arg4 < 5 || arg4 == 10) && class146.field2613[class274.field4798].method226(arg2, (byte) -44, arg9, arg8, var14, arg4 - 1, var15, arg1)) {
                    var18 = true;
                    break;
                }
                if (arg4 < 10 && class146.field2613[class274.field4798].method224(var14, arg4 - 1, arg8, (byte) 12, arg1, arg9, var15, arg2)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class146.field2613[class274.field4798].method235(arg6, arg9, arg1, var14, arg11, arg2, arg7, 8507, var15)) {
                var18 = true;
                break;
            }
            int var31 = class203.field3484[var14][var15] + 1;
            if (var14 > 0 && ~class119.field2092[var14 + -1][var15] == -1 && (var19[var14 + -1][var15] & 19661070) == 0 && (19661112 & var19[var14 + -1][var15 - (-arg9 - -1)]) == 0) {
                int var32 = 1;
                while (true) {
                    if (~(arg9 + -1) >= ~var32) {
                        class36.field793[var41] = var14 + -1;
                        class94.field1673[var41] = var15;
                        class119.field2092[var14 + -1][var15] = 2;
                        class203.field3484[var14 + -1][var15] = var31;
                        var41 = var41 + 1 & 4095;
                        break;
                    }
                    if (~(19661118 & var19[var14 + -1][var15 + var32]) != -1) {
                        break;
                    }
                    ++var32;
                }
            }
            if (~var14 > -103 && ~class119.field2092[var14 - -1][var15] == -1 && (var19[arg9 + var14][var15] & 19661187) == 0 && ~(19661280 & var19[var14 - -arg9][arg9 + var15 - 1]) == -1) {
                int var33 = 1;
                while (true) {
                    if (~var33 <= ~(arg9 - 1)) {
                        class36.field793[var41] = var14 + 1;
                        class94.field1673[var41] = var15;
                        class119.field2092[var14 + 1][var15] = 8;
                        class203.field3484[var14 - -1][var15] = var31;
                        var41 = 4095 & var41 + 1;
                        break;
                    }
                    if (~(var19[arg9 + var14][var15 + var33] & 19661283) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (var15 > 0 && ~class119.field2092[var14][var15 - 1] == -1 && ~(var19[var14][var15 - 1] & 19661070) == -1 && ~(var19[arg9 + -1 + var14][var15 - 1] & 19661187) == -1) {
                int var34 = 1;
                while (true) {
                    if (~(arg9 + -1) >= ~var34) {
                        class36.field793[var41] = var14;
                        class94.field1673[var41] = var15 + -1;
                        var41 = 4095 & var41 + 1;
                        class119.field2092[var14][var15 + -1] = 1;
                        class203.field3484[var14][var15 + -1] = var31;
                        break;
                    }
                    if ((19661199 & var19[var14 + var34][var15 + -1]) != 0) {
                        break;
                    }
                    ++var34;
                }
            }
            if (~var15 > -103 && ~class119.field2092[var14][var15 + 1] == -1 && (var19[var14][arg9 + var15] & 19661112) == 0 && (var19[arg9 + var14 - 1][arg9 + var15] & 19661280) == 0) {
                int var35 = 1;
                while (true) {
                    if (~(arg9 + -1) >= ~var35) {
                        class36.field793[var41] = var14;
                        class94.field1673[var41] = var15 + 1;
                        class119.field2092[var14][var15 - -1] = 4;
                        var41 = var41 - -1 & 4095;
                        class203.field3484[var14][var15 - -1] = var31;
                        break;
                    }
                    if ((var19[var14 + var35][arg9 + var15] & 19661304) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (var14 > 0 && ~var15 < -1 && ~class119.field2092[var14 + -1][var15 + -1] == -1 && ~(19661112 & var19[var14 + -1][var15 + -1 + -1 + arg9]) == -1 && ~(var19[var14 - 1][var15 + -1] & 19661070) == -1 && ~(var19[var14 + -1 + -1 + arg9][var15 - 1] & 19661187) == -1) {
                int var36 = 1;
                while (true) {
                    if (~var36 <= ~(arg9 + -1)) {
                        class36.field793[var41] = var14 - 1;
                        class94.field1673[var41] = var15 + -1;
                        var41 = 4095 & var41 + 1;
                        class119.field2092[var14 + -1][var15 + -1] = 3;
                        class203.field3484[var14 + -1][var15 - 1] = var31;
                        break;
                    }
                    if (~(19661118 & var19[var14 + -1][var15 + -1 + var36]) != -1 || ~(19661199 & var19[var14 + -1 + var36][var15 + -1]) != -1) {
                        break;
                    }
                    ++var36;
                }
            }
            if (var14 < 102 && ~var15 < -1 && class119.field2092[var14 + 1][var15 + -1] == 0 && ~(var19[var14 + 1][var15 - 1] & 19661070) == -1 && ~(19661187 & var19[arg9 + var14][var15 + -1]) == -1 && ~(19661280 & var19[arg9 + var14][arg9 + -1 + var15 + -1]) == -1) {
                int var37 = 1;
                while (true) {
                    if (~(arg9 + -1) >= ~var37) {
                        class36.field793[var41] = var14 + 1;
                        class94.field1673[var41] = var15 + -1;
                        class119.field2092[var14 + 1][var15 - 1] = 9;
                        class203.field3484[var14 + 1][var15 + -1] = var31;
                        var41 = 4095 & var41 + 1;
                        break;
                    }
                    if ((19661283 & var19[arg9 + var14][var15 + -1 + var37]) != 0 || ~(var19[var14 - -1 + var37][var15 - 1] & 19661199) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var14 < -1 && var15 < 102 && ~class119.field2092[var14 - 1][var15 + 1] == -1 && (var19[var14 + -1][var15 + 1] & 19661070) == 0 && (var19[var14 + -1][arg9 + var15] & 19661112) == 0 && (19661280 & var19[var14][arg9 + var15]) == 0) {
                int var38 = 1;
                while (true) {
                    if (~var38 <= ~(arg9 + -1)) {
                        class36.field793[var41] = var14 + -1;
                        class94.field1673[var41] = var15 + 1;
                        class119.field2092[var14 + -1][var15 - -1] = 6;
                        var41 = 4095 & var41 + 1;
                        class203.field3484[var14 + -1][var15 + 1] = var31;
                        break;
                    }
                    if (~(var19[var14 + -1][var15 - -1 + var38] & 19661118) != -1 || ~(19661304 & var19[var14 + -1 + var38][arg9 + var15]) != -1) {
                        break;
                    }
                    ++var38;
                }
            }
            if (var14 < 102 && ~var15 > -103 && class119.field2092[var14 + 1][var15 + 1] == 0 && ~(19661112 & var19[var14 + 1][arg9 + var15]) == -1 && ~(var19[var14 - -arg9][arg9 + var15] & 19661280) == -1 && ~(var19[arg9 + var14][var15 - -1] & 19661187) == -1) {
                for (int var39 = 1; ~(arg9 + -1) < ~var39; ++var39) {
                    if (~(var19[var14 + 1 + var39][arg9 + var15] & 19661304) != -1 || ~(var19[arg9 + var14][var15 - (-var39 + -1)] & 19661283) != -1) {
                        continue label372;
                    }
                }
                class36.field793[var41] = var14 + 1;
                class94.field1673[var41] = var15 + 1;
                var41 = var41 + 1 & 4095;
                class119.field2092[var14 + 1][var15 + 1] = 12;
                class203.field3484[var14 + 1][var15 + 1] = var31;
            }
        }
        class94.field1678 = 0;
        if (!var18) {
            if (!arg0) {
                return false;
            }
            byte var20 = 10;
            int var21 = 100;
            int var22 = 1000;
            for (int var23 = -var20 + arg1; arg1 + var20 >= var23; ++var23) {
                for (int var24 = arg2 - var20; var24 <= arg2 - -var20; ++var24) {
                    if (~var23 <= -1 && ~var24 <= -1 && ~var23 > -105 && ~var24 > -105 && ~class203.field3484[var23][var24] > -101) {
                        int var25 = 0;
                        int var26 = 0;
                        if (~var23 <= ~arg1) {
                            if (~(arg7 - 1 + arg1) > ~var23) {
                                var25 = -arg7 + var23 + -arg1 - -1;
                            }
                        } else {
                            var25 = -var23 + arg1;
                        }
                        if (var24 < arg2) {
                            var26 = -var24 + arg2;
                        } else if (~(arg2 + arg6 + -1) > ~var24) {
                            var26 = -arg2 + -arg6 - (-1 - var24);
                        }
                        int var27 = var25 * var25 - -(var26 * var26);
                        if (~var22 < ~var27 || var22 == var27 && var21 > class203.field3484[var23][var24]) {
                            var15 = var24;
                            var21 = class203.field3484[var23][var24];
                            var22 = var27;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (~arg3 == ~var14 && arg12 == var15) {
                return false;
            }
            class94.field1678 = 1;
        }
        byte var28 = 0;
        class36.field793[var28] = var14;
        if (arg5 <= 70) {
            method1392(59);
        }
        int var42 = var28 + 1;
        class94.field1673[var28] = var15;
        int var29;
        int var30 = var29 = class119.field2092[var14][var15];
        while (arg3 != var14 || arg12 != var15) {
            if (~var29 != ~var30) {
                class36.field793[var42] = var14;
                class94.field1673[var42++] = var15;
                var29 = var30;
            }
            if (~(var30 & 1) != -1) {
                ++var15;
            } else if (~(4 & var30) != -1) {
                --var15;
            }
            if (~(2 & var30) == -1) {
                if (~(8 & var30) != -1) {
                    --var14;
                }
            } else {
                ++var14;
            }
            var30 = class119.field2092[var14][var15];
        }
        if (~var42 < -1) {
            class104.method778(arg10, 3, var42);
            return true;
        } else if (~arg10 == -2) {
            return false;
        } else {
            return true;
        }
    }
}
