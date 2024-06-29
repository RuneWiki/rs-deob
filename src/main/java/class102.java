import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class102 {

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public int field1603 = -1;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public int field1605 = -1;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Z")
    public boolean field1600 = true;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1595 = 0;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Z")
    public static boolean field1602 = true;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[I")
    public static int[] field1601 = new int[5];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIB)V")
    public static final void method654(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1599++;
        class246.field3674++;
        class266.method1768(arg5 + 158);
        if (arg0) {
            class256.method1688(-518637593, 0, false, false);
        } else {
            class126.method795(1, 0);
            class256.method1688(-518637593, 0, true, false);
            if (class71.field1133 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class256.method1688(-518637593, var6, false, false);
                    class256.method1688(arg5 - 518637552, var6, false, true);
                    class126.method795(1, var6);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class126.method795(1, var7);
                    class256.method1688(arg5 - 518637552, var7, false, false);
                    class256.method1688(-518637593, var7, false, true);
                }
            }
        }
        if (!arg0) {
            class140.method862((byte) 85);
        }
        class285.method1874(arg5 ^ 0xFFFFCFD6);
        if (class253.field3837 == 1) {
            int var8 = (int) class83.field1327;
            if (class273.field4113 / 256 > var8) {
                var8 = class273.field4113 / 256;
            }
            if (class49.field789[4] && class264.field3991[4] + 128 > var8) {
                var8 = class264.field3991[4] + 128;
            }
            int var9 = (int) class84.field1336 + class234.field3534 & 0x7FF;
            class46.method309(arg2, 75, class183.method1139(class99.field1557, class165.field2537.field2234, class165.field2537.field2251, (byte) 117) - 50, class124.field1879, var8, var8 * 3 + 600, var9, class295.field4678);
        } else if (class253.field3837 == 5) {
            class61.method410(2048, arg2);
        }
        int var10 = class128.field1922;
        int var11 = class213.field3184;
        if (arg5 != -41) {
            method657(108);
        }
        int var12 = class47.field763;
        int var13 = class259.field3949;
        int var14 = class272.field4088;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class49.field789[var15]) {
                int var22 = (int) ((double) (-class132.field1938[var15]) + (double) (class132.field1938[var15] * 2 + 1) * Math.random() + Math.sin((double) field1601[var15] / 100.0D * (double) class287.field4296[var15]) * (double) class264.field3991[var15]);
                if (var15 == 0) {
                    class128.field1922 += var22;
                }
                if (var15 == 1) {
                    class213.field3184 += var22;
                }
                if (var15 == 2) {
                    class47.field763 += var22;
                }
                if (var15 == 3) {
                    class272.field4088 = class272.field4088 + var22 & 0x7FF;
                }
                if (var15 == 4) {
                    class259.field3949 += var22;
                    if (class259.field3949 < 128) {
                        class259.field3949 = 128;
                    }
                    if (class259.field3949 > 383) {
                        class259.field3949 = 383;
                    }
                }
            }
        }
        class148.method897(1);
        class111.method716(arg4, arg1, arg3 + arg4, arg1 - -arg2);
        class249.method1623();
        if (class276.field4156 >= 0) {
            class38 var16 = class277.method1836(class276.field4156, class195.field2968, class1.field8, 120, class89.field1401);
            var16.method229(class127.field1912, arg4, arg1, arg3, arg2, class259.field3949, class272.field4088, 0);
        } else {
            class111.method702(arg4, arg1, arg3, arg2, 0);
        }
        if (class218.field3275 || arg4 > class223.field3339 || arg4 + arg3 <= class223.field3339 || arg1 > class119.field1792 || class119.field1792 >= (arg1 + arg2)) {
            class162.field2485 = 0;
            class136.field1989 = false;
        } else {
            class136.field1989 = true;
            class162.field2485 = 0;
            int var17 = class148.field2150;
            int var18 = class243.field3643;
            int var19 = class133.field1949;
            int var20 = class86.field1380;
            class224.field3353 = (class223.field3339 - arg4) * (var17 - var19) / arg3 + var19;
            class114.field1746 = (class119.field1792 - arg1) * (var20 - var18) / arg2 + var18;
        }
        class39.method231(false);
        byte var21 = class8.method41((byte) -123) == 2 ? (byte) class246.field3674 : 1;
        class151.method916(class128.field1922, class213.field3184, class47.field763, class259.field3949, class272.field4088, class272.field4093, class97.field1531, class237.field3581, class180.field2735, class220.field3310, class77.field1238, class99.field1557 + 1, var21, class165.field2537.field2251 >> 7, class165.field2537.field2234 >> 7);
        class39.method231(false);
        class198.method1240();
        class56.method383(arg4, 256, arg2, arg3, arg1, 256, (byte) 105);
        class295.method1979(arg4, 256, 256, arg1, -105, arg2, arg3);
        ((class219) class249.field3775).method1409((byte) 45, class180.field2741);
        class221.method1413(100, arg1, arg2, arg3, arg4);
        class272.field4088 = var14;
        class259.field3949 = var13;
        class47.field763 = var12;
        class128.field1922 = var10;
        class213.field3184 = var11;
        if (class130.field1932 && class265.field3995.method346(-1) == 0) {
            class130.field1932 = false;
        }
        if (class130.field1932) {
            class111.method702(arg4, arg1, arg3, arg2, 0);
            class101.method652(class126.field1904, -17265, false);
        }
        if (!arg0 && !class130.field1932 && !class218.field3275 && arg4 <= class223.field3339 && class223.field3339 < arg3 + arg4 && class119.field1792 >= arg1 && (arg1 + arg2) > class119.field1792) {
            class186.method1156(arg2, arg3, class119.field1792, arg1, arg4, (byte) -93, class223.field3339);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIBII)V")
    public static final void method655(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class187 var5 = class120.method762((byte) -88, 4, arg3);
        field1596++;
        if (arg2 != 90) {
            method657(81);
        }
        var5.method1167(-126);
        var5.field2844 = arg0;
        var5.field2830 = arg4;
        var5.field2837 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lpf;I)V")
    public static final void method656(class294 arg0, int arg1) {
        field1606++;
        if (arg1 < 89) {
            field1601 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static void method657(int arg0) {
        if (arg0 == 25754) {
            field1601 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lfl;II)V")
    public final void method658(class248 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1593((byte) 27);
            if (var4 == 0) {
                field1597++;
                if (arg1 != 65535) {
                    field1602 = false;
                    return;
                }
                return;
            }
            this.method659(arg2, var4, -53, arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILfl;)V")
    private final void method659(int arg0, int arg1, int arg2, class248 arg3) {
        field1598++;
        int var5 = -104 % ((51 - arg2) / 38);
        if (arg1 == 1) {
            this.field1595 = class139.method856(arg3.method1587(-119), -124);
        } else if (arg1 == 2) {
            this.field1605 = arg3.method1593((byte) 27);
        } else if (arg1 == 3) {
            this.field1605 = arg3.method1575(false);
            if (this.field1605 == 65535) {
                this.field1605 = -1;
            }
        } else if (arg1 == 5) {
            this.field1600 = false;
        } else if (arg1 == 7) {
            this.field1603 = class139.method856(arg3.method1587(-128), -126);
            return;
        } else if (arg1 == 8) {
            class256.field3899 = arg0;
            return;
        } else if (arg1 == 9) {
            arg3.method1575(false);
            return;
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg3.method1593((byte) 27);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg3.method1587(-128);
                    return;
                }
                if (arg1 == 14) {
                    arg3.method1593((byte) 27);
                    return;
                }
            }
            return;
        }
    }
}
