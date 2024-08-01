import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("fd")
public class class55 {

    @OriginalMember(owner = "fd", name = "b", descriptor = "Llf;")
    public static class109 field1097 = class35.method275("p12_full", 2);

    @OriginalMember(owner = "fd", name = "f", descriptor = "Llf;")
    public static class109 field1101 = class35.method275(":duelfriend:", 2);

    @OriginalMember(owner = "fd", name = "n", descriptor = "Llf;")
    private static class109 field1109 = class35.method275("Examine", 2);

    @OriginalMember(owner = "fd", name = "h", descriptor = "Llf;")
    public static class109 field1103 = field1109;

    @OriginalMember(owner = "fd", name = "g", descriptor = "Llf;")
    public static class109 field1102 = class35.method275("Konfig geladen)3", 2);

    @OriginalMember(owner = "fd", name = "t", descriptor = "I")
    public static int field1115 = 0;

    @OriginalMember(owner = "fd", name = "q", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "fd", name = "e", descriptor = "Llf;")
    public static class109 field1100 = class35.method275("jolt", 2);

    @OriginalMember(owner = "fd", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "fd", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "fd", name = "i", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "fd", name = "k", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "fd", name = "m", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "fd", name = "o", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "fd", name = "r", descriptor = "I")
    public int field1113;

    @OriginalMember(owner = "fd", name = "u", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "fd", name = "v", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "fd", name = "c", descriptor = "Llf;")
    public class109 field1098;

    @OriginalMember(owner = "fd", name = "s", descriptor = "Lnd;")
    public static class125 field1114;

    @OriginalMember(owner = "fd", name = "j", descriptor = "Lbg;")
    public static class18 field1105;

    @OriginalMember(owner = "fd", name = "l", descriptor = "Lda;")
    public static class32 field1107;

    @OriginalMember(owner = "fd", name = "p", descriptor = "Z")
    public boolean field1111;

    @OriginalMember(owner = "fd", name = "a", descriptor = "(IIZI)Lfi;")
    public static final class60 method357(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return null;
        }
        field1117++;
        class60 var4 = new class60();
        var4.field1184 = arg0;
        var4.field1174 = arg3;
        class113.field2236.method339((long) arg1, false, var4);
        class204.method1345((byte) 58, arg3);
        class14.method92(2000000, arg3);
        class200 var5 = class158.method1078(arg1, (byte) 125);
        if (var5 != null) {
            class115.method851(var5, -23101);
        }
        if (class159.field2980 != null) {
            class115.method851(class159.field2980, -23101);
            class159.field2980 = null;
        }
        class51.field1041 = false;
        class149.field2882 = 0;
        class193.method1294(class128.field2471, class105.field2093, class104.field2050, class111.field2190, 188);
        if (class4.field57 != -1) {
            class26.method218(1, 106, class4.field57);
        }
        return var4;
    }

    @OriginalMember(owner = "fd", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class150.field2900[var12][var36] = 0;
                class93.field1905[var12][var36] = 99999999;
            }
        }
        class150.field2900[arg7][arg6] = 99;
        field1099++;
        int var13 = arg7;
        class93.field1905[arg7][arg6] = 0;
        int var14 = arg6;
        byte var15 = 0;
        class185.field3494[var15] = arg7;
        int var37 = var15 + 1;
        class21.field489[var15] = arg6;
        int var16 = arg0;
        boolean var17 = false;
        int var18 = class185.field3494.length;
        int[][] var19 = class168.field3116[class72.field1405].field2069;
        while (var37 != var16) {
            var13 = class185.field3494[var16];
            var14 = class21.field489[var16];
            var16 = (var16 + 1) % var18;
            if (arg3 == var13 && arg9 == var14) {
                var17 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class168.field3116[class72.field1405].method764(var13, arg9, (byte) 33, arg10 - 1, arg3, var14, arg4)) {
                    var17 = true;
                    break;
                }
                if (arg10 < 10 && class168.field3116[class72.field1405].method750(32, var13, arg9, arg10 - 1, arg3, var14, arg4)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg2 != 0 && class168.field3116[class72.field1405].method762(arg1, arg3, var14, arg11, arg2, (byte) 125, arg9, var13)) {
                var17 = true;
                break;
            }
            int var35 = class93.field1905[var13][var14] + 1;
            if (var13 > 0 && class150.field2900[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class185.field3494[var37] = var13 - 1;
                class21.field489[var37] = var14;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 - 1][var14] = 2;
                class93.field1905[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class150.field2900[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class185.field3494[var37] = var13 + 1;
                class21.field489[var37] = var14;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 + 1][var14] = 8;
                class93.field1905[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class150.field2900[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class185.field3494[var37] = var13;
                class21.field489[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13][var14 - 1] = 1;
                class93.field1905[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class150.field2900[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class185.field3494[var37] = var13;
                class21.field489[var37] = var14 + 1;
                class150.field2900[var13][var14 + 1] = 4;
                class93.field1905[var13][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 > 0 && class150.field2900[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class185.field3494[var37] = var13 - 1;
                class21.field489[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 - 1][var14 - 1] = 3;
                class93.field1905[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class150.field2900[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class185.field3494[var37] = var13 + 1;
                class21.field489[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 + 1][var14 - 1] = 9;
                class93.field1905[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class150.field2900[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class185.field3494[var37] = var13 - 1;
                class21.field489[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 - 1][var14 + 1] = 6;
                class93.field1905[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class150.field2900[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class185.field3494[var37] = var13 + 1;
                class21.field489[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class150.field2900[var13 + 1][var14 + 1] = 12;
                class93.field1905[var13 + 1][var14 + 1] = var35;
            }
        }
        class82.field1617 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                for (int var24 = arg9 - var21; var24 <= arg9 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class93.field1905[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg3 > var23) {
                            var26 = arg3 - var23;
                        } else if (arg1 + arg3 - 1 < var23) {
                            var26 = var23 + 1 - arg3 - arg1;
                        }
                        if (var24 < arg9) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg2 + arg9 - 1) {
                            var25 = var24 + 1 - arg9 - arg2;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class93.field1905[var23][var24] < var22) {
                            var20 = var27;
                            var14 = var24;
                            var22 = class93.field1905[var23][var24];
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg7 == var13 && arg6 == var14) {
                return false;
            }
            class82.field1617 = 1;
        }
        byte var28 = 0;
        class185.field3494[var28] = var13;
        int var38 = var28 + 1;
        class21.field489[var28] = var14;
        int var29;
        int var30 = var29 = class150.field2900[var13][var14];
        while (arg7 != var13 || arg6 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class185.field3494[var38] = var13;
                class21.field489[var38++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class150.field2900[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class185.field3494[var38];
            int var33 = class21.field489[var38];
            if (arg5 == 0) {
                class153.field2912++;
                class200.field3850.method1339((byte) 127, 146);
                class200.field3850.method568(-13488, var31 + var31 + 3);
            }
            if (arg5 == 1) {
                class200.field3850.method1339((byte) 121, 96);
                class200.field3850.method568(-13488, var31 + var31 + 3 + 14);
                class47.field972++;
            }
            if (arg5 == 2) {
                class45.field941++;
                class200.field3850.method1339((byte) 108, 175);
                class200.field3850.method568(-13488, var31 + var31 + 3);
            }
            class95.field1944 = class21.field489[0];
            class41.field860 = class185.field3494[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class200.field3850.method568(arg0 - 13488, class185.field3494[var38] - var32);
                class200.field3850.method568(-13488, class21.field489[var38] - var33);
            }
            class200.field3850.method552(class74.field1423[82] ? 1 : 0, (byte) 34);
            class200.field3850.method603(class53.field1079 + var32, true);
            class200.field3850.method574(1174839336, class42.field880 + var33);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "fd", name = "a", descriptor = "(II)Lcg;")
    public static final class28 method359(int arg0, int arg1) {
        class28 var2 = (class28) class191.field3656.method1086((long) arg1, -96);
        field1108++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class150.field2886.method147(0, arg1, 4);
        class28 var4 = new class28();
        if (var3 != null) {
            var4.method232((byte) 110, arg1, new class86(var3));
        }
        if (arg0 <= 66) {
            return null;
        } else {
            class191.field3656.method1082((long) arg1, 94, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "fd", name = "a", descriptor = "(B)V")
    public static void method360(byte arg0) {
        field1100 = null;
        field1114 = null;
        field1102 = null;
        int var1 = -15 % ((arg0 + 29) / 42);
        field1101 = null;
        field1103 = null;
        field1107 = null;
        field1105 = null;
        field1097 = null;
        field1109 = null;
    }

    @OriginalMember(owner = "fd", name = "a", descriptor = "(I)I")
    public static final int method361(int arg0) {
        int var1 = 3;
        if (arg0 <= 4) {
            field1114 = null;
        }
        field1116++;
        if (class72.field1397 < 310) {
            int var2 = class39.field836 >> 7;
            int var3 = class114.field2267 >> 7;
            if ((class88.field1827[class72.field1405][var2][var3] & 0x4) != 0) {
                var1 = class72.field1405;
            }
            int var4 = class157.field2955.field3549 >> 7;
            int var5 = class157.field2955.field3609 >> 7;
            int var6;
            if (var2 >= var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            int var7;
            if (var5 <= var3) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            if (var6 <= var7) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (var3 != var5) {
                    if (var5 > var3) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class88.field1827[class72.field1405][var2][var3] & 0x4) != 0) {
                        var1 = class72.field1405;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var4 < var2) {
                            var2--;
                        }
                        if ((class88.field1827[class72.field1405][var2][var3] & 0x4) != 0) {
                            var1 = class72.field1405;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = var7 * 65536 / var6;
                int var11 = 32768;
                while (var2 != var4) {
                    if (var2 < var4) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class88.field1827[class72.field1405][var2][var3] & 0x4) != 0) {
                        var1 = class72.field1405;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        if (var5 > var3) {
                            var3++;
                        } else if (var3 > var5) {
                            var3--;
                        }
                        if ((class88.field1827[class72.field1405][var2][var3] & 0x4) != 0) {
                            var1 = class72.field1405;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if ((class88.field1827[class72.field1405][class157.field2955.field3549 >> 7][class157.field2955.field3609 >> 7] & 0x4) != 0) {
            var1 = class72.field1405;
        }
        return var1;
    }

    @OriginalMember(owner = "fd", name = "a", descriptor = "(IILvg;IB)V")
    public static final void method362(int arg0, int arg1, class200 arg2, int arg3, byte arg4) {
        field1096++;
        class190.method1285((byte) 101);
        class11.method71(arg1, arg3, arg1 + arg2.field3881, arg2.field3901 + arg3);
        if (class40.field845 == 2 || class40.field845 == 5) {
            class11.method77(arg1, arg3, 0, arg2.field3815, arg2.field3876);
        } else {
            int var5 = class69.field1343 + class47.field970 & 0x7FF;
            int var6 = 464 - class157.field2955.field3609 / 32;
            int var7 = class157.field2955.field3549 / 32 + 48;
            class136.field2641.method712(arg1, arg3, arg2.field3881, arg2.field3901, var7, var6, var5, class144.field2780 + 256, arg2.field3815, arg2.field3876);
            for (int var8 = 0; var8 < class163.field3057; var8++) {
                int var38 = class8.field115[var8] * 4 + 2 - class157.field2955.field3609 / 32;
                int var39 = class103.field2027[var8] * 4 + 2 - class157.field2955.field3549 / 32;
                class81.method517(var39, arg1, var38, arg3, class118.field2321[var8], (byte) 110, arg2);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var34 = 0; var34 < 104; var34++) {
                    class181 var35 = class201.field3965[class72.field1405][var9][var34];
                    if (var35 != null) {
                        int var36 = var9 * 4 + 2 - class157.field2955.field3549 / 32;
                        int var37 = var34 * 4 + 2 - class157.field2955.field3609 / 32;
                        class81.method517(var36, arg1, var37, arg3, class14.field265[0], (byte) 110, arg2);
                    }
                }
            }
            for (int var10 = 0; var10 < class1.field10; var10++) {
                class139 var30 = class183.field3444[class1.field8[var10]];
                if (var30 != null && var30.method996(0)) {
                    class170 var31 = var30.field2691;
                    if (var31 != null && var31.field3170 != null) {
                        var31 = var31.method1137(-1);
                    }
                    if (var31 != null && var31.field3163 && var31.field3192) {
                        int var32 = var30.field3549 / 32 - class157.field2955.field3549 / 32;
                        int var33 = var30.field3609 / 32 - class157.field2955.field3609 / 32;
                        class81.method517(var32, arg1, var33, arg3, class14.field265[1], (byte) 110, arg2);
                    }
                }
            }
            for (int var11 = 0; var11 < class157.field2956; var11++) {
                class184 var22 = class202.field3975[class125.field2405[var11]];
                if (var22 != null && var22.method996(0)) {
                    int var23 = var22.field3549 / 32 - class157.field2955.field3549 / 32;
                    int var24 = var22.field3609 / 32 - class157.field2955.field3609 / 32;
                    boolean var25 = false;
                    long var26 = var22.field3455.method784(false);
                    for (int var28 = 0; var28 < class199.field3786; var28++) {
                        if (class109.field2160[var28] == var26 && class93.field1923[var28] != 0) {
                            var25 = true;
                            break;
                        }
                    }
                    boolean var29 = false;
                    if (class157.field2955.field3463 != 0 && var22.field3463 != 0 && class157.field2955.field3463 == var22.field3463) {
                        var29 = true;
                    }
                    if (var25) {
                        class81.method517(var23, arg1, var24, arg3, class14.field265[3], (byte) 110, arg2);
                    } else if (var29) {
                        class81.method517(var23, arg1, var24, arg3, class14.field265[4], (byte) 110, arg2);
                    } else {
                        class81.method517(var23, arg1, var24, arg3, class14.field265[2], (byte) 110, arg2);
                    }
                }
            }
            if (class76.field1455 != 0 && class143.field2754 % 20 < 10) {
                if (class76.field1455 == 1 && class24.field546 >= 0 && class183.field3444.length > class24.field546) {
                    class139 var12 = class183.field3444[class24.field546];
                    if (var12 != null) {
                        int var13 = var12.field3549 / 32 - class157.field2955.field3549 / 32;
                        int var14 = var12.field3609 / 32 - class157.field2955.field3609 / 32;
                        class79.method508(var13, arg2, arg1, 118, class93.field1911[1], arg3, var14);
                    }
                }
                if (class76.field1455 == 2) {
                    int var15 = (class194.field3713 - class42.field880) * 4 + 2 - class157.field2955.field3609 / 32;
                    int var16 = (class140.field2728 - class53.field1079) * 4 + 2 - class157.field2955.field3549 / 32;
                    class79.method508(var16, arg2, arg1, -97, class93.field1911[1], arg3, var15);
                }
                if (class76.field1455 == 10 && class105.field2094 >= 0 && class105.field2094 < class202.field3975.length) {
                    class184 var17 = class202.field3975[class105.field2094];
                    if (var17 != null) {
                        int var18 = var17.field3609 / 32 - class157.field2955.field3609 / 32;
                        int var19 = var17.field3549 / 32 - class157.field2955.field3549 / 32;
                        class79.method508(var19, arg2, arg1, -126, class93.field1911[1], arg3, var18);
                    }
                }
            }
            if (class41.field860 != 0) {
                int var20 = class95.field1944 * 4 + 2 - class157.field2955.field3609 / 32;
                int var21 = class41.field860 * 4 + 2 - class157.field2955.field3549 / 32;
                class81.method517(var21, arg1, var20, arg3, class93.field1911[0], (byte) 110, arg2);
            }
            class11.method76(arg2.field3881 / 2 + arg1 - 1, arg2.field3901 / 2 + arg3 + -1, 3, 3, 16777215);
        }
        if (arg4 != 38) {
            method359(-36, -99);
        }
        class186.field3538[arg0] = true;
    }
}
