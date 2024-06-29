import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class282 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lwm;")
    private static class152 field4803 = class157.method1048("Close", 124);

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lwm;")
    public static class152 field4807 = field4803;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field4804 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Lwm;")
    public static class152 field4800 = class157.method1048("Lade Titelbild )2 ", 121);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field4801 = 0;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIIB)V", line = 18)
    public static final void method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (class217.field3516) {
            int var8 = arg0 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (class137.field2094 - class37.field601) * var8 / 100 + class37.field601;
            arg2 = arg2 * var9 >> 8;
        }
        field4806++;
        if (arg7 <= 1) {
            field4801 = -76;
        }
        int var10 = 2048 - arg4 & 0x7FF;
        int var11 = 0;
        int var12 = 2048 - arg1 & 0x7FF;
        int var13 = 0;
        int var14 = arg2;
        if (var10 != 0) {
            int var15 = class181.field2884[var10];
            int var16 = class181.field2886[var10];
            var13 = -arg2 * var15 >> 16;
            var14 = arg2 * var16 >> 16;
        }
        if (var12 != 0) {
            int var17 = class181.field2884[var12];
            int var18 = class181.field2886[var12];
            var11 = var14 * var17 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class223.field3634 = arg4;
        class224.field3639 = arg3 - var11;
        class27.field470 = arg5 - var13;
        class94.field1346 = arg1;
        class80.field1129 = arg6 - var14;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lok;", line = 85)
    public static final class150 method1911(int arg0, int arg1) {
        class150 var2 = (class150) class9.field114.method1663((long) arg1, (byte) 70);
        field4805++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class94.field1343.method1381(arg1, 0, 0);
        if (var3 == null) {
            return null;
        }
        class150 var4 = new class150();
        class291 var5 = new class291(var3);
        var5.field4946 = var5.field4950.length - 2;
        int var6 = var5.method2021((byte) 74);
        int var7 = var5.field4950.length - var6 - 12 - 2;
        var5.field4946 = var7;
        int var8 = var5.method1969((byte) -16);
        var4.field2325 = var5.method2021((byte) 74);
        var4.field2337 = var5.method2021((byte) 74);
        var4.field2341 = var5.method2021((byte) 74);
        var4.field2338 = var5.method2021((byte) 74);
        int var9 = var5.method2011(-31);
        if (var9 > 0) {
            var4.field2336 = new class231[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method2021((byte) 74);
                class231 var12 = new class231(class270.method1847(var11, 96));
                var4.field2336[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1969((byte) -16);
                    int var14 = var5.method1969((byte) -16);
                    var12.method1593((long) var13, new class114(var14), 27497);
                }
            }
        }
        int var15 = 0;
        if (arg0 <= 116) {
            method1915(true, -42, false, true);
        }
        var5.field4946 = 0;
        var4.field2327 = var5.method1960(-463815640);
        var4.field2332 = new class152[var8];
        var4.field2339 = new int[var8];
        var4.field2340 = new int[var8];
        while (var7 > var5.field4946) {
            int var16 = var5.method2021((byte) 74);
            if (var16 == 3) {
                var4.field2332[var15] = var5.method2017(true);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2339[var15] = var5.method2011(-110);
            } else {
                var4.field2339[var15] = var5.method1969((byte) -16);
            }
            var4.field2340[var15++] = var16;
        }
        class9.field114.method1662(var4, (long) arg1, -83);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwm;IIBI)V", line = 176)
    public static final void method1912(class152 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4809++;
        class127 var5 = class132.method837(arg2, arg1, 0);
        if (var5 == null) {
            return;
        }
        if (var5.field1928 != null) {
            class320 var6 = new class320();
            var6.field5578 = arg0;
            var6.field5577 = arg4;
            var6.field5569 = var5;
            var6.field5581 = var5.field1928;
            class64.method412(var6, (byte) -85);
        }
        boolean var7 = true;
        if (var5.field1887 > 0) {
            var7 = class8.method42(-206, var5);
        }
        if (!var7 || !client.method1759(var5).method553(arg4 - 1, (byte) -119)) {
            return;
        }
        if (arg4 == 1) {
            class245.field4102.method1065(145, 125);
            class197.field3158++;
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 2) {
            class245.field4102.method1065(223, arg3 + 49);
            class245.field4102.method1967(arg1, -1303690792);
            class142.field2180++;
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 3) {
            class237.field3895++;
            class245.field4102.method1065(104, 127);
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 4) {
            class245.field4102.method1065(30, 126);
            class245.field4102.method1967(arg1, -1303690792);
            class169.field2643++;
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 5) {
            class66.field992++;
            class245.field4102.method1065(138, arg3 ^ 0xFFFFFFB2);
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 6) {
            class245.field4102.method1065(103, arg3 + 176);
            class245.field4102.method1967(arg1, -1303690792);
            class205.field3316++;
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 7) {
            class245.field4102.method1065(211, 124);
            class128.field1952++;
            class245.field4102.method1967(arg1, arg3 ^ 0x4DB4BE16);
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg3 != -50) {
            return;
        }
        if (arg4 == 8) {
            class4.field64++;
            class245.field4102.method1065(217, 127);
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
        }
        if (arg4 == 9) {
            class245.field4102.method1065(72, arg3 ^ 0xFFFFFFB0);
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
            class267.field4497++;
        }
        if (arg4 == 10) {
            class266.field4490++;
            class245.field4102.method1065(50, 123);
            class245.field4102.method1967(arg1, -1303690792);
            class245.field4102.method1994(arg2, 2921);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V", line = 323)
    public static final void method1913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4802++;
        if (arg4 == 0 && class308.field5283 <= arg2 && arg2 <= class238.field3902) {
            int var5 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg1);
            int var6 = class150.method944(class110.field1553, class157.field2505, (byte) 42, arg0);
            class147.method926(var5, arg2, arg3, var6, 123);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 340)
    public static void method1914(int arg0) {
        field4800 = null;
        field4807 = null;
        int var1 = -23 % ((arg0 + 52) / 44);
        field4803 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZIZZ)V", line = 359)
    public static final void method1915(boolean arg0, int arg1, boolean arg2, boolean arg3) {
        field4808++;
        if (arg2) {
            return;
        }
        int var10002;
        for (int var4 = 0; var4 < class233.field3826; var4++) {
            class4 var5 = class40.field649[class97.field1403[var4]];
            if (var5 != null && var5.method18(-106) && var5.field72.method1658((byte) 73)) {
                int var6 = var5.method67(-4391);
                if (arg0) {
                    if (!var5.field72.field4020) {
                        continue;
                    }
                } else if (var5.field72.field4019 != arg3 || arg1 != 0 && arg1 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field4162 & 0x7F) == 64 && (var5.field4231 & 0x7F) == 64) {
                        int var13 = var5.field4231 >> 7;
                        int var14 = var5.field4162 >> 7;
                        if (var14 >= 0 && var14 < 104 && var13 >= 0 && var13 < 104) {
                            var10002 = class226.field3674[var14][var13]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field4162 & 0x7F) == 0 && (var5.field4231 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field4162 & 0x7F) == 64 && (var5.field4231 & 0x7F) == 64)) {
                    int var7 = var5.field4162 - (var6 * 64) >> 7;
                    int var8 = var5.field4231 - (var6 * 64) >> 7;
                    int var9 = var5.method67(-4391) + var7;
                    if (var9 > 104) {
                        var9 = 104;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var10 = var5.method67(-4391) + var8;
                    if (var10 > 104) {
                        var10 = 104;
                    }
                    if (var8 < 0) {
                        var8 = 0;
                    }
                    for (int var11 = var7; var11 < var9; var11++) {
                        for (int var12 = var8; var12 < var10; var12++) {
                            var10002 = class226.field3674[var11][var12]++;
                        }
                    }
                }
            }
        }
        label207: for (int var15 = 0; var15 < class233.field3826; var15++) {
            class4 var16 = class40.field649[class97.field1403[var15]];
            long var17 = (long) class97.field1403[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method18(111) && var16.field72.method1658((byte) 53)) {
                int var19 = var16.method67(-4391);
                if (arg0) {
                    if (!var16.field72.field4020) {
                        continue;
                    }
                } else if (var16.field72.field4019 != arg3 || arg1 != 0 && arg1 != var19) {
                    continue;
                }
                var16.field4255 = true;
                if (var19 == 1) {
                    if ((var16.field4162 & 0x7F) == 64 && (var16.field4231 & 0x7F) == 64) {
                        int var29 = var16.field4231 >> 7;
                        int var30 = var16.field4162 >> 7;
                        if (var30 < 0 || var30 >= 104 || var29 < 0 || var29 >= 104) {
                            continue;
                        }
                        if (class226.field3674[var30][var29] > 1) {
                            var10002 = class226.field3674[var30][var29]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field4162 & 0x7F) == 0 && (var16.field4231 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field4162 & 0x7F) == 64 && (var16.field4231 & 0x7F) == 64) {
                    int var20 = var16.field4162 - (var19 * 64) >> 7;
                    int var21 = var16.field4231 - var19 * 64 >> 7;
                    int var22 = var20 + var19;
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    boolean var23 = true;
                    int var24 = var21 + var19;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var25 = var20; var25 < var22; var25++) {
                        for (int var26 = var21; var26 < var24; var26++) {
                            if (class226.field3674[var25][var26] <= 1) {
                                var23 = false;
                                break;
                            }
                        }
                    }
                    if (var23) {
                        int var27 = var20;
                        while (true) {
                            if (var27 >= var22) {
                                continue label207;
                            }
                            for (int var28 = var21; var28 < var24; var28++) {
                                var10002 = class226.field3674[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var16.field72.field4005) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field4255 = false;
                var16.field4185 = class154.method1031(104, var16.field4162, class23.field400, var16.field4231);
                class241.method1644(class23.field400, var16.field4162, var16.field4231, var16.field4185, (var19 - 1) * 64 + 60, var16, var16.field4161, var17, var16.field4236);
            }
        }
    }
}
