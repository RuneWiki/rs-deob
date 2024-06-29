import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 {

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "Lqd;")
    public static class115 field1915 = new class115(20);

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1921 = 1;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Lid;")
    private static class60 field1924 = class11.method72("Loaded input handler", (byte) 114);

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1922 = 0;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "Lid;")
    public static class60 field1925 = field1924;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field1923 = 0;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Lid;")
    public static class60 field1926 = class11.method72("Fallen lassen", (byte) -66);

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field1897;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public int field1903;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public int field1911;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field1912;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field1913;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public int field1914;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public int field1920;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "J")
    public static long field1927;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
    public static final void method632(int arg0, int arg1) {
        class41.field1102 = -1;
        class87.field2183 = arg0;
        class22.field524 = -1;
        if (arg1 != 19339) {
            method637(24, (byte) 3);
        }
        class113.field2710 = null;
        class14.field291 = 0;
        field1918++;
        class87.field2193 = false;
        class106.field2626 = 1;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1924 = null;
        field1915 = null;
        field1926 = null;
        field1925 = null;
        if (arg0 != 41) {
            field1927 = 12L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIZIIIII)Z")
    public static final boolean method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class59.field1430[var12][var36] = 0;
                class81.field2008[var12][var36] = 99999999;
            }
        }
        class59.field1430[arg3][arg0] = 99;
        class81.field2008[arg3][arg0] = 0;
        field1900++;
        int var13 = arg0;
        int var14 = arg3;
        int var15 = 0;
        byte var16 = 0;
        class146.field3275[var16] = arg3;
        int var37 = var16 + 1;
        class140.field3199[var16] = arg0;
        int[][] var17 = class133.field3030[class46.field1222].field2602;
        boolean var18 = false;
        int var19 = class146.field3275.length;
        while (var15 != var37) {
            var13 = class140.field3199[var15];
            var14 = class146.field3275[var15];
            var15 = (var15 + 1) % var19;
            if (arg5 == var14 && arg8 == var13) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class133.field3030[class46.field1222].method867(var14, false, arg8, arg5, var13, arg10, arg1 - 1)) {
                    var18 = true;
                    break;
                }
                if (arg1 < 10 && class133.field3030[class46.field1222].method877(arg8, true, arg10, var14, arg5, var13, arg1 - 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg2 != 0 && class133.field3030[class46.field1222].method881(arg2, arg5, 101, arg11, arg8, var13, arg7, var14)) {
                var18 = true;
                break;
            }
            int var35 = class81.field2008[var14][var13] + 1;
            if (var14 > 0 && class59.field1430[var14 - 1][var13] == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0) {
                class146.field3275[var37] = var14 - 1;
                class140.field3199[var37] = var13;
                var37 = (var37 + 1) % var19;
                class59.field1430[var14 - 1][var13] = 2;
                class81.field2008[var14 - 1][var13] = var35;
            }
            if (var14 < 103 && class59.field1430[var14 + 1][var13] == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0) {
                class146.field3275[var37] = var14 + 1;
                class140.field3199[var37] = var13;
                var37 = (var37 + 1) % var19;
                class59.field1430[var14 + 1][var13] = 8;
                class81.field2008[var14 + 1][var13] = var35;
            }
            if (var13 > 0 && class59.field1430[var14][var13 - 1] == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class146.field3275[var37] = var14;
                class140.field3199[var37] = var13 - 1;
                var37 = (var37 + 1) % var19;
                class59.field1430[var14][var13 - 1] = 1;
                class81.field2008[var14][var13 - 1] = var35;
            }
            if (var13 < 103 && class59.field1430[var14][var13 + 1] == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class146.field3275[var37] = var14;
                class140.field3199[var37] = var13 + 1;
                class59.field1430[var14][var13 + 1] = 4;
                class81.field2008[var14][var13 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 > 0 && var13 > 0 && class59.field1430[var14 - 1][var13 - 1] == 0 && (var17[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class146.field3275[var37] = var14 - 1;
                class140.field3199[var37] = var13 - 1;
                class59.field1430[var14 - 1][var13 - 1] = 3;
                class81.field2008[var14 - 1][var13 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 < 103 && var13 > 0 && class59.field1430[var14 + 1][var13 - 1] == 0 && (var17[var14 + 1][var13 - 1] & 0x12C0183) == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0 && (var17[var14][var13 - 1] & 0x12C0102) == 0) {
                class146.field3275[var37] = var14 + 1;
                class140.field3199[var37] = var13 - 1;
                class59.field1430[var14 + 1][var13 - 1] = 9;
                class81.field2008[var14 + 1][var13 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var14 > 0 && var13 < 103 && class59.field1430[var14 - 1][var13 + 1] == 0 && (var17[var14 - 1][var13 + 1] & 0x12C0138) == 0 && (var17[var14 - 1][var13] & 0x12C0108) == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class146.field3275[var37] = var14 - 1;
                class140.field3199[var37] = var13 + 1;
                var37 = (var37 + 1) % var19;
                class59.field1430[var14 - 1][var13 + 1] = 6;
                class81.field2008[var14 - 1][var13 + 1] = var35;
            }
            if (var14 < 103 && var13 < 103 && class59.field1430[var14 + 1][var13 + 1] == 0 && (var17[var14 + 1][var13 + 1] & 0x12C01E0) == 0 && (var17[var14 + 1][var13] & 0x12C0180) == 0 && (var17[var14][var13 + 1] & 0x12C0120) == 0) {
                class146.field3275[var37] = var14 + 1;
                class140.field3199[var37] = var13 + 1;
                var37 = (var37 + 1) % var19;
                class59.field1430[var14 + 1][var13 + 1] = 12;
                class81.field2008[var14 + 1][var13 + 1] = var35;
            }
        }
        class34.field794 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg8 - var22; var24 <= arg8 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class81.field2008[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg5 > var23) {
                            var26 = arg5 - var23;
                        } else if (var23 > arg5 + arg11 - 1) {
                            var26 = var23 + 1 - arg5 - arg11;
                        }
                        if (arg8 > var24) {
                            var25 = arg8 - var24;
                        } else if (var24 > arg8 + arg2 - 1) {
                            var25 = var24 + 1 - arg8 - arg2;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class81.field2008[var23][var24] < var21) {
                            var14 = var23;
                            var13 = var24;
                            var21 = class81.field2008[var23][var24];
                            var20 = var27;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg3 == var14 && arg0 == var13) {
                return false;
            }
            class34.field794 = 1;
        }
        byte var28 = 0;
        class146.field3275[var28] = var14;
        int var38 = var28 + 1;
        class140.field3199[var28] = var13;
        int var29;
        int var30 = var29 = class59.field1430[var14][var13];
        while (arg3 != var14 || arg0 != var13) {
            if (var29 != var30) {
                class146.field3275[var38] = var14;
                class140.field3199[var38++] = var13;
                var29 = var30;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var13++;
            } else if ((var30 & 0x4) != 0) {
                var13--;
            }
            var30 = class59.field1430[var14][var13];
        }
        if (var38 > 0) {
            int var31 = var38--;
            if (var31 > 25) {
                var31 = 25;
            }
            int var32 = class146.field3275[var38];
            int var33 = class140.field3199[var38];
            if (arg4 == 0) {
                class22.field519.method1214(41, 0);
                class22.field519.method818(false, var31 + var31 + 3);
                class75.field1809++;
            }
            if (arg4 == 1) {
                class101.field2453++;
                class22.field519.method1214(111, 0);
                class22.field519.method818(false, var31 + var31 + 3 + 14);
            }
            if (arg4 == 2) {
                class72.field1745++;
                class22.field519.method1214(52, 0);
                class22.field519.method818(false, var31 + var31 + 3);
            }
            class22.field519.method824(23656, class41.field1095 + var32);
            class22.field519.method845(128, class144.field3240 + var33);
            class22.field519.method818(false, class61.field1512[82] ? 1 : 0);
            class59.field1438 = class140.field3199[0];
            class48.field1267 = class146.field3275[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class22.field519.method818(false, class146.field3275[var38] - var32);
                class22.field519.method818(false, class140.field3199[var38] - var33);
            }
            return true;
        } else if (arg4 == 1) {
            return false;
        } else if (arg9 >= -19) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)Lid;")
    public static final class60 method635(int arg0, byte arg1) {
        int var2 = -112 % ((30 - arg1) / 51);
        field1907++;
        return arg0 < 999999999 ? class98.method774((byte) -121, arg0) : class98.field2405;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
    public static final void method636(int arg0) {
        class101.field2459.method920((byte) 14);
        field1919++;
        if (arg0 >= -94) {
            method637(21, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(IB)Lid;")
    public static final class60 method637(int arg0, byte arg1) {
        field1916++;
        class60 var2 = new class60();
        var2.field1453 = new byte[arg0];
        var2.field1474 = 0;
        int var3 = 77 % ((-arg1 - 35) / 54);
        return var2;
    }
}
