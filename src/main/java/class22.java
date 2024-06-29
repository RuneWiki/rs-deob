import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class377 {

    @OriginalMember(owner = "client!an", name = "E", descriptor = "I")
    private int field249 = 204;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    private int field259 = 1;

    @OriginalMember(owner = "client!an", name = "I", descriptor = "I")
    private int field253 = 1;

    @OriginalMember(owner = "client!an", name = "A", descriptor = "I")
    public static int field245 = 0;

    @OriginalMember(owner = "client!an", name = "F", descriptor = "I")
    public static int field250 = 0;

    @OriginalMember(owner = "client!an", name = "H", descriptor = "Lvf;")
    public static class141 field252 = new class141(15, 0, 1, 0);

    @OriginalMember(owner = "client!an", name = "z", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!an", name = "B", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!an", name = "C", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!an", name = "D", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!an", name = "G", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!an", name = "J", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!an", name = "K", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!an", name = "L", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!an", name = "M", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "([BI)Ljg;", line = 5)
    public static final class317 method141(byte[] arg0, int arg1) {
        ++field246;
        class317 var2 = new class317();
        class572 var3 = new class572(arg0);
        var3.field7313 = var3.field7318.length - 2;
        if (arg1 <= 43) {
            method146(66);
        }
        int var4 = var3.method3031(-1);
        int var5 = var3.field7318.length + -2 + -var4 + -12;
        var3.field7313 = var5;
        int var6 = var3.method3064(-2031091464);
        var2.field3973 = var3.method3031(-1);
        var2.field3969 = var3.method3031(-1);
        var2.field3962 = var3.method3031(-1);
        var2.field3964 = var3.method3031(-1);
        int var7 = var3.method3097((byte) 12);
        if (~var7 < -1) {
            var2.field3970 = new class694[var7];
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                int var9 = var3.method3031(-1);
                class694 var10 = new class694(class560.method2979(var9, (byte) 102));
                var2.field3970[var8] = var10;
                while (~(var9--) < -1) {
                    int var11 = var3.method3064(-2031091464);
                    int var12 = var3.method3064(-2031091464);
                    var10.method3832(new class319(var12), (long) var11, 25);
                }
            }
        }
        var3.field7313 = 0;
        var2.field3966 = var3.method3077(false);
        var2.field3968 = new String[var6];
        var2.field3971 = new int[var6];
        var2.field3963 = new int[var6];
        int var13 = 0;
        while (~var3.field7313 > ~var5) {
            int var14 = var3.method3031(-1);
            if (var14 != 3) {
                if (~var14 > -101 && var14 != 21 && var14 != 38 && var14 != 39) {
                    var2.field3971[var13] = var3.method3064(-2031091464);
                } else {
                    var2.field3971[var13] = var3.method3097((byte) 12);
                }
            } else {
                var2.field3968[var13] = var3.method3072(255).intern();
            }
            var2.field3963[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 91)
    public static final void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        ++field244;
        if (class299.field3801 != null) {
            class32 var14 = null;
            if (arg0 < 0) {
                int var15 = -arg0 + -1;
                if (~class350.field4523 != ~var15) {
                    var14 = class132.field1601[var15];
                } else {
                    var14 = class67.field815;
                }
            } else {
                int var16 = arg0 + -1;
                class704 var17 = (class704) class168.field1973.method3828((long) var16, (byte) -91);
                if (var17 != null) {
                    var14 = var17.field9854;
                }
            }
            if (var14 != null) {
                class687 var18 = class232.field3017.method2358(0, arg4);
                int var19;
                int var20;
                if (arg6 != 1 && ~arg6 != -4) {
                    var19 = var18.field9459;
                    var20 = var18.field9395;
                } else {
                    var20 = var18.field9459;
                    var19 = var18.field9395;
                }
                int var21 = (var19 >> 1) + arg5;
                int var22 = arg5 - -(var19 + 1 >> 1);
                int var23 = arg3 - -(var20 >> 1);
                int var24 = (var20 + 1 >> 1) + arg3;
                class140 var25 = class299.field3801[arg12];
                int var26 = var25.method201(var21, var23) + var25.method201(var22, var23) + var25.method201(var21, var24) + var25.method201(var22, var24) >> 2;
                class605 var27 = new class605();
                var27.field8155 = arg1;
                var27.field8141 = arg3;
                if (arg11 < arg7) {
                    int var28 = arg7;
                    arg7 = arg11;
                    arg11 = var28;
                }
                var27.field8157 = arg5;
                var27.field8153 = class665.field9027 - -arg2;
                if (arg9 >= -105) {
                    field245 = 73;
                }
                var27.field8158 = var14.field8010;
                var27.field8146 = class665.field9027 + arg8;
                var27.field8154 = arg4;
                var27.field8147 = arg6;
                var27.field8145 = arg5 + arg7;
                var27.field8144 = arg5 + arg11;
                if (~arg10 > ~arg13) {
                    int var29 = arg13;
                    arg13 = arg10;
                    arg10 = var29;
                }
                var27.field8150 = var26;
                var27.field8151 = arg3 + arg13;
                var27.field8142 = (var27.field8157 << 9) + (var19 << 8);
                var27.field8143 = arg3 - -arg10;
                var27.field8156 = (var27.field8141 << 9) + (var20 << 8);
                class170.field1992.method1904(var27, -33);
                var14.field507 = var27;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(II)[I", line = 197)
    public final int[] method88(int arg0, int arg1) {
        int var3 = 37 / ((5 - arg1) / 53);
        ++field257;
        int[] var4 = super.field4842.method2772(arg0, (byte) -115);
        if (super.field4842.field6354) {
            for (int var5 = 0; class528.field6661 > var5; ++var5) {
                int var6 = class136.field1654[var5];
                int var7 = class596.field8003[arg0];
                int var8 = this.field253 * var6 >> 12;
                int var9 = this.field259 * var7 >> 12;
                int var10 = var6 % (4096 / this.field253) * this.field253;
                int var11 = var7 % (4096 / this.field259) * this.field259;
                if (~this.field249 < ~var11) {
                    for (var8 -= var9; ~var8 > -1; var8 += 4) {
                    }
                    while (~var8 < -4) {
                        var8 -= 4;
                    }
                    if (~var8 != -2) {
                        var4[var5] = 0;
                        continue;
                    }
                    if (~this.field249 < ~var10) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                if (var10 < this.field249) {
                    int var12;
                    for (var12 = var8 - var9; var12 < 0; var12 += 4) {
                    }
                    while (var12 > 3) {
                        var12 -= 4;
                    }
                    if (var12 > 0) {
                        var4[var5] = 0;
                        continue;
                    }
                }
                var4[var5] = 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILji;)V", line = 281)
    public final void method27(int arg0, int arg1, class572 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field249 = arg2.method3031(-1);
                }
            } else {
                this.field259 = arg2.method3097((byte) 12);
            }
        } else {
            this.field253 = arg2.method3097((byte) 12);
        }
        int var5 = 58 / ((13 - arg1) / 55);
        ++field247;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 324)
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLoa;)V", line = 331)
    public static final void method143(boolean arg0, class650 arg1) {
        ++field248;
        int var2 = class284.field3593;
        int var3 = class465.field5774;
        int var4 = class559.field6988;
        int var5 = class484.field6012 + -3;
        byte var6 = 20;
        if (class381.field4886 == null || class345.field4442 == null) {
            if (class136.field1656.method1669((byte) 111, class634.field8595) && class136.field1656.method1669((byte) -64, class459.field5712)) {
                class381.field4886 = arg1.method402(class495.method2695(class136.field1656, class634.field8595, 0), true);
                class495 var7 = class495.method2695(class136.field1656, class459.field5712, 0);
                class345.field4442 = arg1.method402(var7, true);
                var7.method2692();
                class395.field5029 = arg1.method402(var7, true);
            } else {
                arg1.method475(var2, var3, var4, var6, -class467.field5793 + 255 << 24 | class413.field5286, 1);
            }
        }
        if (class381.field4886 != null && class345.field4442 != null) {
            int var8 = (-(2 * class345.field4442.method1556()) + var4) / class381.field4886.method1556();
            for (int var9 = 0; var9 < var8; ++var9) {
                class381.field4886.method2556(var2 - -class345.field4442.method1556() + var9 * class381.field4886.method1556(), var3);
            }
            class345.field4442.method2556(var2, var3);
            class395.field5029.method2556(-class395.field5029.method1556() + var2 + var4, var3);
        }
        class336.field4143.method1165((byte) -32, var3 - -14, class162.field1915 | -16777216, var2 + 3, -1, class671.field9138.method3726((byte) 81, class71.field912));
        arg1.method475(var2, var3 - -var6, var4, -var6 + var5, -class467.field5793 + 255 << 24 | class413.field5286, 1);
        int var10 = class113.field1423.method1074((byte) 3);
        int var11 = class113.field1423.method1078((byte) 121);
        int var12 = 0;
        for (class501 var13 = (class501) class345.field4438.method1909(true); var13 != null; var13 = (class501) class345.field4438.method1916((byte) 95)) {
            int var31 = (-1 - var12 + class638.field8648) * 16 + var6 + 13 + var3;
            if (var10 > var2 && var10 < var2 + var4 && var31 + -13 < var11 && ~var11 > ~(var31 + 4) && var13.field6244) {
                arg1.method475(var2, var31 - 12, var4, 16, class136.field1652 | -class441.field5544 + 255 << 24, 1);
            }
            ++var12;
        }
        if ((class386.field4953 == null || class324.field4031 == null || class392.field5014 == null) && class136.field1656.method1669((byte) 106, class160.field1885) && class136.field1656.method1669((byte) 122, class617.field8374) && class136.field1656.method1669((byte) 104, class321.field3998)) {
            class495 var14 = class495.method2695(class136.field1656, class617.field8374, 0);
            class324.field4031 = arg1.method402(var14, true);
            var14.method2692();
            class227.field2934 = arg1.method402(var14, true);
            class386.field4953 = arg1.method402(class495.method2695(class136.field1656, class160.field1885, 0), true);
            class495 var15 = class495.method2695(class136.field1656, class321.field3998, 0);
            class392.field5014 = arg1.method402(var15, true);
            var15.method2692();
            class180.field2122 = arg1.method402(var15, true);
        }
        int var16 = 0;
        if (class386.field4953 != null && class324.field4031 != null && class392.field5014 != null) {
            int var17 = (var4 - 2 * class392.field5014.method1556()) / class386.field4953.method1556();
            for (int var18 = 0; ~var18 > ~var17; ++var18) {
                class386.field4953.method2556(class392.field5014.method1556() + var2 + class386.field4953.method1556() * var18, var3 + var5 - class386.field4953.method1544());
            }
            int var19 = (-var6 + var5 + -class392.field5014.method1544()) / class324.field4031.method1544();
            for (int var20 = 0; ~var19 < ~var20; ++var20) {
                class324.field4031.method2556(var2, var3 + var6 + class324.field4031.method1544() * var20);
                class227.field2934.method2556(-class227.field2934.method1556() + var2 - -var4, var3 - (-var6 - var20 * class324.field4031.method1544()));
            }
            class392.field5014.method2556(var2, -class392.field5014.method1544() + var5 + var3);
            class180.field2122.method2556(var2 + var4 + -class392.field5014.method1556(), var5 + var3 + -class392.field5014.method1544());
        }
        for (class501 var21 = (class501) class345.field4438.method1909(arg0); var21 != null; var21 = (class501) class345.field4438.method1916((byte) 125)) {
            int var22 = (-var16 + class638.field8648 + -1) * 16 + var3 - (-var6 - 13);
            int var23 = -16777216 | class162.field1915;
            if (~var2 > ~var10 && var10 < var2 + var4 && var11 > var22 + -13 && var11 < var22 + 4 && var21.field6244) {
                var23 = -16777216 | class686.field9363;
            }
            int[] var24 = null;
            if (!class534.method2880(-8897, var21.field6242)) {
                if (~var21.field6250 != 0) {
                    var24 = class504.field6287.method1628(var21.field6250, (byte) -121).field828;
                } else if (!class453.method2489((byte) 104, var21.field6242)) {
                    if (class245.method1473(var21.field6242, -115)) {
                        Object var25 = null;
                        class687 var26;
                        if (~var21.field6242 != -1012) {
                            var26 = class232.field3017.method2358(0, (int) (var21.field6247 >>> 32 & 2147483647L));
                        } else {
                            var26 = class232.field3017.method2358(0, (int) var21.field6247);
                        }
                        if (var26.field9421 != null) {
                            var26 = var26.method3800(class327.field4084, (byte) -93);
                        }
                        if (var26 != null) {
                            var24 = var26.field9447;
                        }
                    }
                } else {
                    class704 var27 = (class704) class168.field1973.method3828((long) ((int) var21.field6247), (byte) -91);
                    if (var27 != null) {
                        class506 var28 = var27.field9854;
                        class689 var29 = var28.field6326;
                        if (var29.field9546 != null) {
                            var29 = var29.method3812(class327.field4084, -127);
                        }
                        if (var29 != null) {
                            var24 = var29.field9516;
                        }
                    }
                }
            } else {
                var24 = class504.field6287.method1628((int) var21.field6247, (byte) -128).field828;
            }
            String var30 = class293.method1769(var21, -21589);
            if (var24 != null) {
                var30 = var30 + class617.method3443(false, var24);
            }
            class336.field4143.method1176(var23, var30, -93, 0, var22, class541.field6825, class306.field3871, var2 + 3);
            if (var21.field6241) {
                class590.field7923.method2556(var2 + 5 + class36.field540.method127(var30, (byte) -118), var22 - 12);
            }
            ++var16;
        }
        class640.method3589(class484.field6012, -49, class284.field3593, class465.field5774, class559.field6988);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)V", line = 533)
    public static final void method144(String arg0, String arg1, boolean arg2, int arg3) {
        class33.field515 = arg1;
        ++field251;
        class467.field5786 = arg2;
        class469.field5798 = arg0;
        if (!class467.field5786 && class628.field8531 != 3 && (class469.field5798.equals("") || class33.field515.equals(""))) {
            class29.method177(3, 32768);
        } else {
            class384.field4931 = false;
            if (~class628.field8531 != -2) {
                class164.field1930 = -1;
                class307.field3880 = 0;
            }
            class29.method177(-3, arg3 ^ -211664639);
            class623.field8444 = 0;
            class583.field7833 = 1;
            class402.field5156 = 0;
            if (arg3 != -211631871) {
                field252 = null;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(I)V", line = 568)
    public static void method145(int arg0) {
        int var1 = 110 / ((arg0 - 47) / 61);
        field252 = null;
    }

    @OriginalMember(owner = "client!an", name = "g", descriptor = "(I)V", line = 577)
    public static final void method146(int arg0) {
        ++field256;
        if (!class72.field940) {
            class72.field940 = true;
            if (arg0 != -128) {
                field250 = -73;
            }
            class531.field6707 = true;
            if (class611.field8310.field8695) {
                class689.field9561 = (float) (-128 & (int) class689.field9561 + 191);
            } else {
                class350.field4524 += (-class350.field4524 + 24.0F) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)Z", line = 604)
    public static final boolean method147(int arg0, int arg1) {
        if (arg0 != -14787) {
            field245 = 115;
        }
        ++field258;
        return arg1 == 1 || ~arg1 == -4 || arg1 == 5;
    }
}
