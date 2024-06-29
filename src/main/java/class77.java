import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class77 {

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ltm;")
    private class79 field1245 = new class79(256);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Ltm;")
    private class79 field1252 = new class79(256);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lcg;")
    private class49 field1240;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lcg;")
    private class49 field1246;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1249 = 2;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[I)Lri;", line = 4)
    public final class76 method702(int arg0, int arg1, int[] arg2) {
        field1241++;
        if (this.field1246.method453(arg0 + 34511) == 1) {
            return this.method709(arg2, 0, arg1, 59);
        } else if (this.field1246.method455(arg1, true) == 1) {
            return this.method709(arg2, arg1, 0, 70);
        } else {
            if (arg0 != -10321) {
                method704(false, -49, (class258) null);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)Z", line = 26)
    public static final boolean method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZILne;)V", line = 54)
    public static final void method704(boolean arg0, int arg1, class258 arg2) {
        field1243++;
        Object[] var3 = arg2.field4173;
        int var4 = (Integer) var3[0];
        class88 var5 = class322.method2211(var4, 83);
        if (var5 == null) {
            return;
        }
        class202.field3442 = 0;
        int var6 = 0;
        int var7 = -1;
        int var8 = 0;
        int[] var9 = var5.field1385;
        int[] var10 = var5.field1391;
        byte var11 = -1;
        try {
            class126.field2178 = new String[var5.field1396];
            class132.field2260 = new int[var5.field1389];
            int var12 = 0;
            if (arg0) {
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg2.field4181;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg2.field4169;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg2.field4168 == null ? -1 : arg2.field4168.field2462;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg2.field4177;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg2.field4168 == null ? -1 : arg2.field4168.field2434;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg2.field4189 == null ? -1 : arg2.field4189.field2462;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg2.field4189 == null ? -1 : arg2.field4189.field2434;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg2.field4184;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg2.field4180;
                        }
                        class132.field2260[var12++] = var15;
                    } else if (var3[var14] instanceof String) {
                        String var16 = (String) var3[var14];
                        if (var16.equals("event_opbase")) {
                            var16 = arg2.field4176;
                        }
                        class126.field2178[var13++] = var16;
                    }
                }
                int var17 = 0;
                label4488: while (true) {
                    var17++;
                    if (arg1 < var17) {
                        throw new RuntimeException("slow");
                    }
                    var7++;
                    int var528 = var9[var7];
                    if (var528 < 100) {
                        if (var528 == 0) {
                            class121.field2115[var6++] = var10[var7];
                            continue;
                        }
                        if (var528 == 1) {
                            int var18 = var10[var7];
                            class121.field2115[var6++] = class116.field2006[var18];
                            continue;
                        }
                        if (var528 == 2) {
                            int var19 = var10[var7];
                            boolean var531 = !arg0;
                            var6--;
                            class116.method995(var19, var531, class121.field2115[var6]);
                            continue;
                        }
                        if (var528 == 3) {
                            class255.field4111[var8++] = var5.field1390[var7];
                            continue;
                        }
                        if (var528 == 6) {
                            var7 += var10[var7];
                            continue;
                        }
                        if (var528 == 7) {
                            var6 -= 2;
                            if (class121.field2115[var6 + 1] != class121.field2115[var6]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 8) {
                            var6 -= 2;
                            if (class121.field2115[var6 + 1] == class121.field2115[var6]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 9) {
                            var6 -= 2;
                            if (class121.field2115[var6 + 1] > class121.field2115[var6]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 10) {
                            var6 -= 2;
                            if (class121.field2115[var6] > class121.field2115[var6 + 1]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 21) {
                            if (class202.field3442 == 0) {
                                return;
                            }
                            class178 var20 = class353.field5579[--class202.field3442];
                            var5 = var20.field3024;
                            class126.field2178 = var20.field3017;
                            var7 = var20.field3021;
                            var10 = var5.field1391;
                            class132.field2260 = var20.field3025;
                            var9 = var5.field1385;
                            continue;
                        }
                        if (var528 == 25) {
                            int var21 = var10[var7];
                            class121.field2115[var6++] = class332.method2307(-1, var21);
                            continue;
                        }
                        if (var528 == 27) {
                            int var22 = var10[var7];
                            var6--;
                            class144.method1161(var22, class121.field2115[var6], 0);
                            continue;
                        }
                        if (var528 == 31) {
                            var6 -= 2;
                            if (class121.field2115[var6] <= class121.field2115[var6 + 1]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 32) {
                            var6 -= 2;
                            if (class121.field2115[var6 + 1] <= class121.field2115[var6]) {
                                var7 += var10[var7];
                            }
                            continue;
                        }
                        if (var528 == 33) {
                            class121.field2115[var6++] = class132.field2260[var10[var7]];
                            continue;
                        }
                        int var10001;
                        if (var528 == 34) {
                            var10001 = var10[var7];
                            var6--;
                            class132.field2260[var10001] = class121.field2115[var6];
                            continue;
                        }
                        if (var528 == 35) {
                            class255.field4111[var8++] = class126.field2178[var10[var7]];
                            continue;
                        }
                        if (var528 == 36) {
                            var10001 = var10[var7];
                            var8--;
                            class126.field2178[var10001] = class255.field4111[var8];
                            continue;
                        }
                        if (var528 == 37) {
                            int var23 = var10[var7];
                            var8 -= var23;
                            String var24 = class285.method1946(class255.field4111, !arg0, var23, var8);
                            class255.field4111[var8++] = var24;
                            continue;
                        }
                        if (var528 == 38) {
                            var6--;
                            continue;
                        }
                        if (var528 == 39) {
                            var8--;
                            continue;
                        }
                        if (var528 == 40) {
                            int var25 = var10[var7];
                            class88 var26 = class322.method2211(var25, 79);
                            int[] var27 = new int[var26.field1389];
                            String[] var28 = new String[var26.field1396];
                            for (int var29 = 0; var29 < var26.field1394; var29++) {
                                var27[var29] = class121.field2115[var6 - (var26.field1394 - var29)];
                            }
                            for (int var30 = 0; var30 < var26.field1393; var30++) {
                                var28[var30] = class255.field4111[var8 + var30 - var26.field1393];
                            }
                            var6 -= var26.field1394;
                            var8 -= var26.field1393;
                            class178 var31 = new class178();
                            var31.field3017 = class126.field2178;
                            var31.field3025 = class132.field2260;
                            var31.field3021 = var7;
                            var31.field3024 = var5;
                            if (class353.field5579.length <= class202.field3442) {
                                throw new RuntimeException();
                            }
                            class353.field5579[class202.field3442++] = var31;
                            var5 = var26;
                            var10 = var26.field1391;
                            class132.field2260 = var27;
                            var9 = var26.field1385;
                            class126.field2178 = var28;
                            var7 = -1;
                            continue;
                        }
                        if (var528 == 42) {
                            class121.field2115[var6++] = class210.field3561[var10[var7]];
                            continue;
                        }
                        if (var528 == 43) {
                            int var32 = var10[var7];
                            var6--;
                            class210.field3561[var32] = class121.field2115[var6];
                            class147.method1174(var32, (byte) -87);
                            continue;
                        }
                        if (var528 == 44) {
                            int var33 = var10[var7] >> 16;
                            var6--;
                            int var34 = class121.field2115[var6];
                            int var35 = var10[var7] & 0xFFFF;
                            if (var34 >= 0 && var34 <= 5000) {
                                byte var36 = -1;
                                class107.field1824[var33] = var34;
                                if (var35 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var34 <= var37) {
                                        continue label4488;
                                    }
                                    class316.field4999[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var528 == 45) {
                            int var38 = var10[var7];
                            var6--;
                            int var39 = class121.field2115[var6];
                            if (var39 >= 0 && class107.field1824[var38] > var39) {
                                class121.field2115[var6++] = class316.field4999[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var528 == 46) {
                            int var40 = var10[var7];
                            var6 -= 2;
                            int var41 = class121.field2115[var6];
                            if (var41 >= 0 && class107.field1824[var40] > var41) {
                                class316.field4999[var40][var41] = class121.field2115[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var528 == 47) {
                            String var42 = class81.field1329[var10[var7]];
                            if (var42 == null) {
                                var42 = "null";
                            }
                            class255.field4111[var8++] = var42;
                            continue;
                        }
                        if (var528 == 48) {
                            int var43 = var10[var7];
                            var8--;
                            class81.field1329[var43] = class255.field4111[var8];
                            class40.method337(false, var43);
                            continue;
                        }
                        if (var528 == 51) {
                            class79 var44 = var5.field1392[var10[var7]];
                            var6--;
                            class142 var45 = (class142) var44.method732((long) class121.field2115[var6], arg0);
                            if (var45 != null) {
                                var7 += var45.field2601;
                            }
                            continue;
                        }
                    }
                    boolean var46;
                    if (var10[var7] == 1) {
                        var46 = true;
                    } else {
                        var46 = false;
                    }
                    if (var528 < 300) {
                        if (var528 == 100) {
                            var6 -= 3;
                            int var47 = class121.field2115[var6];
                            int var48 = class121.field2115[var6 + 2];
                            int var49 = class121.field2115[var6 + 1];
                            if (var49 == 0) {
                                throw new RuntimeException();
                            }
                            class137 var50 = class146.method1167(1169843632, var47);
                            if (var50.field2453 == null) {
                                var50.field2453 = new class137[var48 + 1];
                            }
                            if (var50.field2453.length <= var48) {
                                class137[] var51 = new class137[var48 + 1];
                                for (int var52 = 0; var52 < var50.field2453.length; var52++) {
                                    var51[var52] = var50.field2453[var52];
                                }
                                var50.field2453 = var51;
                            }
                            if (var48 > 0 && var50.field2453[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class137 var53 = new class137();
                            var53.field2490 = var49;
                            var53.field2465 = var53.field2462 = var50.field2462;
                            var53.field2402 = true;
                            var53.field2434 = var48;
                            var50.field2453[var48] = var53;
                            if (var46) {
                                class108.field1846 = var53;
                            } else {
                                class256.field4118 = var53;
                            }
                            class258.method1793(var50, 0);
                            continue;
                        }
                        if (var528 == 101) {
                            class137 var54 = var46 ? class108.field1846 : class256.field4118;
                            if (var54.field2434 == -1) {
                                if (!var46) {
                                    throw new RuntimeException("Tried to cc_delete static active-component!");
                                }
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            class137 var55 = class146.method1167(1169843632, var54.field2462);
                            var55.field2453[var54.field2434] = null;
                            class258.method1793(var55, 0);
                            continue;
                        }
                        if (var528 == 102) {
                            var6--;
                            class137 var56 = class146.method1167(1169843632, class121.field2115[var6]);
                            var56.field2453 = null;
                            class258.method1793(var56, 0);
                            continue;
                        }
                        if (var528 == 200) {
                            var6 -= 2;
                            int var57 = class121.field2115[var6];
                            int var58 = class121.field2115[var6 + 1];
                            class137 var59 = class60.method557(var57, 89, var58);
                            if (var59 != null && var58 != -1) {
                                class121.field2115[var6++] = 1;
                                if (var46) {
                                    class108.field1846 = var59;
                                } else {
                                    class256.field4118 = var59;
                                }
                                continue;
                            }
                            class121.field2115[var6++] = 0;
                            continue;
                        }
                        if (var528 == 201) {
                            var6--;
                            int var60 = class121.field2115[var6];
                            class137 var61 = class146.method1167(1169843632, var60);
                            if (var61 == null) {
                                class121.field2115[var6++] = 0;
                            } else {
                                class121.field2115[var6++] = 1;
                                if (var46) {
                                    class108.field1846 = var61;
                                } else {
                                    class256.field4118 = var61;
                                }
                            }
                            continue;
                        }
                    } else if (var528 < 500) {
                        if (var528 == 403) {
                            var6 -= 2;
                            int var516 = class121.field2115[var6];
                            int var517 = class121.field2115[var6 + 1];
                            for (int var518 = 0; var518 < class93.field1467.length; var518++) {
                                if (class93.field1467[var518] == var516) {
                                    class218.field3632.field3477.method2006(var518, Integer.MIN_VALUE, var517);
                                    continue label4488;
                                }
                            }
                            int var519 = 0;
                            while (true) {
                                if (class68.field1112.length <= var519) {
                                    continue label4488;
                                }
                                if (class68.field1112[var519] == var516) {
                                    class218.field3632.field3477.method2006(var519, Integer.MIN_VALUE, var517);
                                    continue label4488;
                                }
                                var519++;
                            }
                        }
                        if (var528 == 404) {
                            var6 -= 2;
                            int var520 = class121.field2115[var6];
                            int var521 = class121.field2115[var6 + 1];
                            class218.field3632.field3477.method2011(var521, var520, false);
                            continue;
                        }
                        if (var528 == 410) {
                            var6--;
                            boolean var522 = class121.field2115[var6] != 0;
                            class218.field3632.field3477.method1999(var522, -124);
                            continue;
                        }
                    } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                        class137 var62;
                        if (var528 < 2000) {
                            var62 = var46 ? class108.field1846 : class256.field4118;
                        } else {
                            var528 -= 1000;
                            var6--;
                            var62 = class146.method1167(1169843632, class121.field2115[var6]);
                        }
                        if (var528 == 1000) {
                            var6 -= 4;
                            var62.field2373 = class121.field2115[var6];
                            var62.field2371 = class121.field2115[var6 + 1];
                            int var63 = class121.field2115[var6 + 2];
                            if (var63 < 0) {
                                var63 = 0;
                            } else if (var63 > 5) {
                                var63 = 5;
                            }
                            int var64 = class121.field2115[var6 + 3];
                            var62.field2427 = (byte) var63;
                            if (var64 < 0) {
                                var64 = 0;
                            } else if (var64 > 5) {
                                var64 = 5;
                            }
                            var62.field2495 = (byte) var64;
                            class258.method1793(var62, 0);
                            class324.method2247(-127, var62);
                            if (var62.field2434 == -1) {
                                class264.method1819(var62.field2462, 4096);
                            }
                            continue;
                        }
                        if (var528 == 1001) {
                            var6 -= 4;
                            var62.field2435 = class121.field2115[var6];
                            var62.field2443 = class121.field2115[var6 + 1];
                            var62.field2408 = 0;
                            var62.field2437 = 0;
                            int var65 = class121.field2115[var6 + 2];
                            if (var65 < 0) {
                                var65 = 0;
                            } else if (var65 > 4) {
                                var65 = 4;
                            }
                            int var66 = class121.field2115[var6 + 3];
                            var62.field2364 = (byte) var65;
                            if (var66 < 0) {
                                var66 = 0;
                            } else if (var66 > 4) {
                                var66 = 4;
                            }
                            var62.field2424 = (byte) var66;
                            class258.method1793(var62, 0);
                            class324.method2247(-128, var62);
                            if (var62.field2490 == 0) {
                                class185.method1425(var62, 78, false);
                            }
                            continue;
                        }
                        if (var528 == 1003) {
                            var6--;
                            boolean var67 = class121.field2115[var6] == 1;
                            if (var62.field2421 != var67) {
                                var62.field2421 = var67;
                                class258.method1793(var62, 0);
                            }
                            if (var62.field2434 == -1) {
                                class143.method1155(var62.field2462, (byte) 89);
                            }
                            continue;
                        }
                        if (var528 == 1004) {
                            var6 -= 2;
                            var62.field2538 = class121.field2115[var6];
                            var62.field2369 = class121.field2115[var6 + 1];
                            class258.method1793(var62, 0);
                            class324.method2247(-59, var62);
                            if (var62.field2490 == 0) {
                                class185.method1425(var62, 123, false);
                            }
                            continue;
                        }
                        if (var528 == 1005) {
                            var6--;
                            var62.field2470 = class121.field2115[var6] == 1;
                            continue;
                        }
                    } else if (var528 >= 1100 && var528 < 1200 || var528 >= 2100 && var528 < 2200) {
                        class137 var512;
                        if (var528 < 2000) {
                            var512 = var46 ? class108.field1846 : class256.field4118;
                        } else {
                            var528 -= 1000;
                            var6--;
                            var512 = class146.method1167(1169843632, class121.field2115[var6]);
                        }
                        if (var528 == 1100) {
                            var6 -= 2;
                            var512.field2477 = class121.field2115[var6];
                            if (var512.field2477 > (var512.field2426 - var512.field2533)) {
                                var512.field2477 = var512.field2426 - var512.field2533;
                            }
                            if (var512.field2477 < 0) {
                                var512.field2477 = 0;
                            }
                            var512.field2531 = class121.field2115[var6 + 1];
                            if (var512.field2497 - var512.field2515 < var512.field2531) {
                                var512.field2531 = var512.field2497 - var512.field2515;
                            }
                            if (var512.field2531 < 0) {
                                var512.field2531 = 0;
                            }
                            class258.method1793(var512, 0);
                            if (var512.field2434 == -1) {
                                class258.method1794(0, var512.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1101) {
                            var6--;
                            var512.field2505 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            if (var512.field2434 == -1) {
                                class226.method1645(var512.field2462, (byte) 44);
                            }
                            continue;
                        }
                        if (var528 == 1102) {
                            var6--;
                            var512.field2439 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1103) {
                            var6--;
                            var512.field2478 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1104) {
                            var6--;
                            var512.field2442 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1105) {
                            var6--;
                            var512.field2400 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1106) {
                            var6--;
                            var512.field2517 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1107) {
                            var6--;
                            var512.field2536 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1108) {
                            var512.field2389 = 1;
                            var6--;
                            var512.field2382 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            if (var512.field2434 == -1) {
                                class69.method659(4, var512.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1109) {
                            var6 -= 6;
                            var512.field2454 = class121.field2115[var6];
                            var512.field2500 = class121.field2115[var6 + 1];
                            var512.field2367 = class121.field2115[var6 + 2];
                            var512.field2430 = class121.field2115[var6 + 3];
                            var512.field2420 = class121.field2115[var6 + 4];
                            var512.field2502 = class121.field2115[var6 + 5];
                            class258.method1793(var512, 0);
                            if (var512.field2434 == -1) {
                                class228.method1656(var512.field2462, 17017);
                                class99.method853(10, var512.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1110) {
                            var6--;
                            int var513 = class121.field2115[var6];
                            if (var512.field2385 != var513) {
                                var512.field2511 = 0;
                                var512.field2522 = 0;
                                var512.field2385 = var513;
                                var512.field2380 = 1;
                                class258.method1793(var512, 0);
                            }
                            if (var512.field2434 == -1) {
                                class40.method338((byte) -79, var512.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1111) {
                            var6--;
                            var512.field2381 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1112) {
                            var8--;
                            String var514 = class255.field4111[var8];
                            if (!var514.equals(var512.field2493)) {
                                var512.field2493 = var514;
                                class258.method1793(var512, 0);
                            }
                            if (var512.field2434 == -1) {
                                class122.method1029(var512.field2462, 2);
                            }
                            continue;
                        }
                        if (var528 == 1113) {
                            var6--;
                            var512.field2428 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1114) {
                            var6 -= 3;
                            var512.field2450 = class121.field2115[var6];
                            var512.field2431 = class121.field2115[var6 + 1];
                            var512.field2489 = class121.field2115[var6 + 2];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1115) {
                            var6--;
                            var512.field2406 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1116) {
                            var6--;
                            var512.field2448 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1117) {
                            var6--;
                            var512.field2503 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1118) {
                            var6--;
                            var512.field2514 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1119) {
                            var6--;
                            var512.field2440 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1120) {
                            var6 -= 2;
                            var512.field2426 = class121.field2115[var6];
                            var512.field2497 = class121.field2115[var6 + 1];
                            class258.method1793(var512, 0);
                            if (var512.field2490 == 0) {
                                class185.method1425(var512, 93, false);
                            }
                            continue;
                        }
                        if (var528 == 1121) {
                            var6 -= 2;
                            var512.field2467 = (short) class121.field2115[var6];
                            var512.field2398 = (short) class121.field2115[var6 + 1];
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1122) {
                            var6--;
                            var512.field2384 = class121.field2115[var6] == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                        if (var528 == 1123) {
                            var6--;
                            var512.field2502 = class121.field2115[var6];
                            class258.method1793(var512, 0);
                            if (var512.field2434 == -1) {
                                class228.method1656(var512.field2462, 17017);
                            }
                            continue;
                        }
                        if (var528 == 1124) {
                            var6--;
                            int var515 = class121.field2115[var6];
                            var512.field2483 = var515 == 1;
                            class258.method1793(var512, 0);
                            continue;
                        }
                    } else if (var528 >= 1200 && var528 < 1300 || var528 >= 2200 && var528 < 2300) {
                        class137 var508;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var6--;
                            var508 = class146.method1167(1169843632, class121.field2115[var6]);
                        } else {
                            var508 = var46 ? class108.field1846 : class256.field4118;
                        }
                        class258.method1793(var508, 0);
                        if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                            var6 -= 2;
                            int var509 = class121.field2115[var6];
                            int var510 = class121.field2115[var6 + 1];
                            if (var508.field2434 == -1) {
                                class24.method232(-5583, var508.field2462);
                                class228.method1656(var508.field2462, 17017);
                                class99.method853(10, var508.field2462);
                            }
                            if (var509 == -1) {
                                var508.field2382 = -1;
                                var508.field2389 = 1;
                                var508.field2463 = -1;
                                continue;
                            }
                            var508.field2535 = var510;
                            var508.field2463 = var509;
                            if (var528 == 1208 || var528 == 1209) {
                                var508.field2540 = true;
                            } else {
                                var508.field2540 = false;
                            }
                            class134 var511 = class5.method31(-1731690365, var509);
                            var508.field2420 = var511.field2299;
                            var508.field2454 = var511.field2321;
                            var508.field2430 = var511.field2326;
                            var508.field2500 = var511.field2307;
                            var508.field2367 = var511.field2287;
                            if (var528 == 1205) {
                                var508.field2519 = false;
                            } else {
                                var508.field2519 = true;
                            }
                            var508.field2502 = var511.field2294;
                            if (var508.field2437 > 0) {
                                var508.field2502 = var508.field2502 * 32 / var508.field2437;
                            } else if (var508.field2435 > 0) {
                                var508.field2502 = var508.field2502 * 32 / var508.field2435;
                            }
                            continue;
                        }
                        if (var528 == 1201) {
                            var508.field2389 = 2;
                            var6--;
                            var508.field2382 = class121.field2115[var6];
                            if (var508.field2434 == -1) {
                                class69.method659(4, var508.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1202) {
                            var508.field2389 = 3;
                            var508.field2382 = class218.field3632.field3477.method2008(127);
                            if (var508.field2434 == -1) {
                                class69.method659(4, var508.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1203) {
                            var508.field2389 = 6;
                            var6--;
                            var508.field2382 = class121.field2115[var6];
                            if (var508.field2434 == -1) {
                                class69.method659(4, var508.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1204) {
                            var508.field2389 = 5;
                            var6--;
                            var508.field2382 = class121.field2115[var6];
                            if (var508.field2434 == -1) {
                                class69.method659(4, var508.field2462);
                            }
                            continue;
                        }
                        if (var528 == 1206) {
                            var6 -= 4;
                            var508.field2412 = class121.field2115[var6];
                            var508.field2468 = class121.field2115[var6 + 1];
                            var508.field2525 = class121.field2115[var6 + 2];
                            var508.field2523 = class121.field2115[var6 + 3];
                            class258.method1793(var508, 0);
                            continue;
                        }
                        if (var528 == 1207) {
                            var6 -= 2;
                            var508.field2541 = class121.field2115[var6];
                            var508.field2491 = class121.field2115[var6 + 1];
                            class258.method1793(var508, 0);
                            continue;
                        }
                    } else if ((var528 < 1300 || var528 >= 1400) && (var528 < 2300 || var528 >= 2400)) {
                        if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                            class137 var495;
                            if (var528 >= 2000) {
                                var6--;
                                var495 = class146.method1167(1169843632, class121.field2115[var6]);
                                var528 -= 1000;
                            } else {
                                var495 = var46 ? class108.field1846 : class256.field4118;
                            }
                            var8--;
                            String var496 = class255.field4111[var8];
                            int[] var497 = null;
                            if (var496.length() > 0 && var496.charAt(var496.length() - 1) == 'Y') {
                                var6--;
                                int var498 = class121.field2115[var6];
                                if (var498 > 0) {
                                    var497 = new int[var498];
                                    while (var498-- > 0) {
                                        var6--;
                                        var497[var498] = class121.field2115[var6];
                                    }
                                }
                                var496 = var496.substring(0, var496.length() - 1);
                            }
                            Object[] var499 = new Object[var496.length() + 1];
                            for (int var500 = var499.length - 1; var500 >= 1; var500--) {
                                if (var496.charAt(var500 - 1) == 's') {
                                    var8--;
                                    var499[var500] = class255.field4111[var8];
                                } else {
                                    var6--;
                                    var499[var500] = Integer.valueOf(class121.field2115[var6]);
                                }
                            }
                            var6--;
                            int var501 = class121.field2115[var6];
                            if (var501 == -1) {
                                var499 = null;
                            } else {
                                var499[0] = Integer.valueOf(var501);
                            }
                            if (var528 == 1400) {
                                var495.field2539 = var499;
                            } else if (var528 == 1401) {
                                var495.field2436 = var499;
                            } else if (var528 == 1402) {
                                var495.field2415 = var499;
                            } else if (var528 == 1403) {
                                var495.field2474 = var499;
                            } else if (var528 == 1404) {
                                var495.field2418 = var499;
                            } else if (var528 == 1405) {
                                var495.field2527 = var499;
                            } else if (var528 == 1406) {
                                var495.field2429 = var499;
                            } else if (var528 == 1407) {
                                var495.field2390 = var497;
                                var495.field2506 = var499;
                            } else if (var528 == 1408) {
                                var495.field2501 = var499;
                            } else if (var528 == 1409) {
                                var495.field2413 = var499;
                            } else if (var528 == 1410) {
                                var495.field2537 = var499;
                            } else if (var528 == 1411) {
                                var495.field2512 = var499;
                            } else if (var528 == 1412) {
                                var495.field2372 = var499;
                            } else if (var528 == 1414) {
                                var495.field2524 = var497;
                                var495.field2507 = var499;
                            } else if (var528 == 1415) {
                                var495.field2509 = var499;
                                var495.field2376 = var497;
                            } else if (var528 == 1416) {
                                var495.field2473 = var499;
                            } else if (var528 == 1417) {
                                var495.field2394 = var499;
                            } else if (var528 == 1418) {
                                var495.field2484 = var499;
                            } else if (var528 == 1419) {
                                var495.field2451 = var499;
                            } else if (var528 == 1420) {
                                var495.field2422 = var499;
                            } else if (var528 == 1421) {
                                var495.field2476 = var499;
                            } else if (var528 == 1422) {
                                var495.field2546 = var499;
                            } else if (var528 == 1423) {
                                var495.field2395 = var499;
                            } else if (var528 == 1424) {
                                var495.field2534 = var499;
                            } else if (var528 == 1425) {
                                var495.field2459 = var499;
                            } else if (var528 == 1426) {
                                var495.field2496 = var499;
                            } else if (var528 == 1427) {
                                var495.field2432 = var499;
                            } else if (var528 == 1428) {
                                var495.field2528 = var499;
                                var495.field2405 = var497;
                            } else if (var528 == 1429) {
                                var495.field2419 = var497;
                                var495.field2472 = var499;
                            }
                            var495.field2411 = true;
                            continue;
                        }
                        if (var528 < 1600) {
                            class137 var494 = var46 ? class108.field1846 : class256.field4118;
                            if (var528 == 1500) {
                                class121.field2115[var6++] = var494.field2456;
                                continue;
                            }
                            if (var528 == 1501) {
                                class121.field2115[var6++] = var494.field2444;
                                continue;
                            }
                            if (var528 == 1502) {
                                class121.field2115[var6++] = var494.field2533;
                                continue;
                            }
                            if (var528 == 1503) {
                                class121.field2115[var6++] = var494.field2515;
                                continue;
                            }
                            if (var528 == 1504) {
                                class121.field2115[var6++] = var494.field2421 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 1505) {
                                class121.field2115[var6++] = var494.field2465;
                                continue;
                            }
                        } else if (var528 < 1700) {
                            class137 var68 = var46 ? class108.field1846 : class256.field4118;
                            if (var528 == 1600) {
                                class121.field2115[var6++] = var68.field2477;
                                continue;
                            }
                            if (var528 == 1601) {
                                class121.field2115[var6++] = var68.field2531;
                                continue;
                            }
                            if (var528 == 1602) {
                                class255.field4111[var8++] = var68.field2493;
                                continue;
                            }
                            if (var528 == 1603) {
                                class121.field2115[var6++] = var68.field2426;
                                continue;
                            }
                            if (var528 == 1604) {
                                class121.field2115[var6++] = var68.field2497;
                                continue;
                            }
                            if (var528 == 1605) {
                                class121.field2115[var6++] = var68.field2502;
                                continue;
                            }
                            if (var528 == 1606) {
                                class121.field2115[var6++] = var68.field2367;
                                continue;
                            }
                            if (var528 == 1607) {
                                class121.field2115[var6++] = var68.field2420;
                                continue;
                            }
                            if (var528 == 1608) {
                                class121.field2115[var6++] = var68.field2430;
                                continue;
                            }
                            if (var528 == 1609) {
                                class121.field2115[var6++] = var68.field2478;
                                continue;
                            }
                            if (var528 == 1610) {
                                class121.field2115[var6++] = var68.field2454;
                                continue;
                            }
                            if (var528 == 1611) {
                                class121.field2115[var6++] = var68.field2500;
                                continue;
                            }
                            if (var528 == 1612) {
                                class121.field2115[var6++] = var68.field2400;
                                continue;
                            }
                        } else if (var528 < 1800) {
                            class137 var69 = var46 ? class108.field1846 : class256.field4118;
                            if (var528 == 1700) {
                                class121.field2115[var6++] = var69.field2463;
                                continue;
                            }
                            if (var528 == 1701) {
                                if (var69.field2463 == -1) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = var69.field2535;
                                }
                                continue;
                            }
                            if (var528 == 1702) {
                                class121.field2115[var6++] = var69.field2434;
                                continue;
                            }
                        } else if (var528 < 1900) {
                            class137 var70 = var46 ? class108.field1846 : class256.field4118;
                            if (var528 == 1800) {
                                class121.field2115[var6++] = client.method1894(var70).method523((byte) -48);
                                continue;
                            }
                            if (var528 == 1801) {
                                var6--;
                                int var71 = class121.field2115[var6];
                                int var529 = var71 - 1;
                                if (var70.field2458 != null && var529 < var70.field2458.length && var70.field2458[var529] != null) {
                                    class255.field4111[var8++] = var70.field2458[var529];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 1802) {
                                if (var70.field2492 == null) {
                                    class255.field4111[var8++] = "";
                                } else {
                                    class255.field4111[var8++] = var70.field2492;
                                }
                                continue;
                            }
                        } else if (var528 < 2600) {
                            var6--;
                            class137 var72 = class146.method1167(1169843632, class121.field2115[var6]);
                            if (var528 == 2500) {
                                class121.field2115[var6++] = var72.field2456;
                                continue;
                            }
                            if (var528 == 2501) {
                                class121.field2115[var6++] = var72.field2444;
                                continue;
                            }
                            if (var528 == 2502) {
                                class121.field2115[var6++] = var72.field2533;
                                continue;
                            }
                            if (var528 == 2503) {
                                class121.field2115[var6++] = var72.field2515;
                                continue;
                            }
                            if (var528 == 2504) {
                                class121.field2115[var6++] = var72.field2421 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 2505) {
                                class121.field2115[var6++] = var72.field2465;
                                continue;
                            }
                        } else if (var528 < 2700) {
                            var6--;
                            class137 var73 = class146.method1167(1169843632, class121.field2115[var6]);
                            if (var528 == 2600) {
                                class121.field2115[var6++] = var73.field2477;
                                continue;
                            }
                            if (var528 == 2601) {
                                class121.field2115[var6++] = var73.field2531;
                                continue;
                            }
                            if (var528 == 2602) {
                                class255.field4111[var8++] = var73.field2493;
                                continue;
                            }
                            if (var528 == 2603) {
                                class121.field2115[var6++] = var73.field2426;
                                continue;
                            }
                            if (var528 == 2604) {
                                class121.field2115[var6++] = var73.field2497;
                                continue;
                            }
                            if (var528 == 2605) {
                                class121.field2115[var6++] = var73.field2502;
                                continue;
                            }
                            if (var528 == 2606) {
                                class121.field2115[var6++] = var73.field2367;
                                continue;
                            }
                            if (var528 == 2607) {
                                class121.field2115[var6++] = var73.field2420;
                                continue;
                            }
                            if (var528 == 2608) {
                                class121.field2115[var6++] = var73.field2430;
                                continue;
                            }
                            if (var528 == 2609) {
                                class121.field2115[var6++] = var73.field2478;
                                continue;
                            }
                            if (var528 == 2610) {
                                class121.field2115[var6++] = var73.field2454;
                                continue;
                            }
                            if (var528 == 2611) {
                                class121.field2115[var6++] = var73.field2500;
                                continue;
                            }
                            if (var528 == 2612) {
                                class121.field2115[var6++] = var73.field2400;
                                continue;
                            }
                        } else if (var528 < 2800) {
                            if (var528 == 2700) {
                                var6--;
                                class137 var484 = class146.method1167(1169843632, class121.field2115[var6]);
                                class121.field2115[var6++] = var484.field2463;
                                continue;
                            }
                            if (var528 == 2701) {
                                var6--;
                                class137 var485 = class146.method1167(1169843632, class121.field2115[var6]);
                                if (var485.field2463 == -1) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = var485.field2535;
                                }
                                continue;
                            }
                            if (var528 == 2702) {
                                var6--;
                                int var486 = class121.field2115[var6];
                                class228 var487 = (class228) class172.field2972.method732((long) var486, arg0);
                                if (var487 == null) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = 1;
                                }
                                continue;
                            }
                            if (var528 == 2703) {
                                var6--;
                                class137 var488 = class146.method1167(1169843632, class121.field2115[var6]);
                                if (var488.field2453 == null) {
                                    class121.field2115[var6++] = 0;
                                    continue;
                                }
                                int var489 = var488.field2453.length;
                                for (int var490 = 0; var490 < var488.field2453.length; var490++) {
                                    if (var488.field2453[var490] == null) {
                                        var489 = var490;
                                        break;
                                    }
                                }
                                class121.field2115[var6++] = var489;
                                continue;
                            }
                            if (var528 == 2704 || var528 == 2705) {
                                var6 -= 2;
                                int var491 = class121.field2115[var6];
                                int var492 = class121.field2115[var6 + 1];
                                class228 var493 = (class228) class172.field2972.method732((long) var491, true);
                                if (var493 != null && var493.field3833 == var492) {
                                    class121.field2115[var6++] = 1;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                        } else if (var528 < 2900) {
                            var6--;
                            class137 var74 = class146.method1167(1169843632, class121.field2115[var6]);
                            if (var528 == 2800) {
                                class121.field2115[var6++] = client.method1894(var74).method523((byte) -48);
                                continue;
                            }
                            if (var528 == 2801) {
                                var6--;
                                int var75 = class121.field2115[var6];
                                int var530 = var75 - 1;
                                if (var74.field2458 != null && var74.field2458.length > var530 && var74.field2458[var530] != null) {
                                    class255.field4111[var8++] = var74.field2458[var530];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 2802) {
                                if (var74.field2492 == null) {
                                    class255.field4111[var8++] = "";
                                } else {
                                    class255.field4111[var8++] = var74.field2492;
                                }
                                continue;
                            }
                        } else if (var528 < 3200) {
                            if (var528 == 3100) {
                                var8--;
                                String var469 = class255.field4111[var8];
                                class170.method1339(0, var469, "", (byte) -98);
                                continue;
                            }
                            if (var528 == 3101) {
                                var6 -= 2;
                                class277.method1905(class218.field3632, 0, class121.field2115[var6 + 1], class121.field2115[var6]);
                                continue;
                            }
                            if (var528 == 3103) {
                                class271.method1853(-120);
                                continue;
                            }
                            if (var528 == 3104) {
                                class211.field3562++;
                                var8--;
                                String var470 = class255.field4111[var8];
                                int var471 = 0;
                                if (class342.method2407(-14, var470)) {
                                    var471 = class97.method841(var470, (byte) -20);
                                }
                                class341.field5443.method26(34, 7);
                                class341.field5443.method2320(-6128, var471);
                                continue;
                            }
                            if (var528 == 3105) {
                                class290.field4630++;
                                var8--;
                                String var472 = class255.field4111[var8];
                                class341.field5443.method26(27, 7);
                                class341.field5443.method2333(class142.method1151(var472, -102), 113);
                                continue;
                            }
                            if (var528 == 3106) {
                                class344.field5476++;
                                var8--;
                                String var473 = class255.field4111[var8];
                                class341.field5443.method26(136, 7);
                                class341.field5443.method2370(var473.length() + 1, (byte) -20);
                                class341.field5443.method2349(true, var473);
                                continue;
                            }
                            if (var528 == 3107) {
                                var6--;
                                int var474 = class121.field2115[var6];
                                var8--;
                                String var475 = class255.field4111[var8];
                                class153.method1214(true, var475, var474);
                                continue;
                            }
                            if (var528 == 3108) {
                                var6 -= 3;
                                int var476 = class121.field2115[var6];
                                int var477 = class121.field2115[var6 + 1];
                                int var478 = class121.field2115[var6 + 2];
                                class137 var479 = class146.method1167(1169843632, var478);
                                class153.method1228(2, var477, var476, var479);
                                continue;
                            }
                            if (var528 == 3109) {
                                var6 -= 2;
                                int var480 = class121.field2115[var6];
                                class137 var481 = var46 ? class108.field1846 : class256.field4118;
                                int var482 = class121.field2115[var6 + 1];
                                class153.method1228(2, var482, var480, var481);
                                continue;
                            }
                            if (var528 == 3110) {
                                class286.field4559++;
                                var6--;
                                int var483 = class121.field2115[var6];
                                class341.field5443.method26(51, 7);
                                class341.field5443.method2359(-805606200, var483);
                                continue;
                            }
                        } else if (var528 < 3300) {
                            if (var528 == 3200) {
                                var6 -= 3;
                                class286.method1956(255, 0, class121.field2115[var6], class121.field2115[var6 + 2], class121.field2115[var6 + 1]);
                                continue;
                            }
                            if (var528 == 3201) {
                                var6--;
                                class4.method24(arg0, 255, class121.field2115[var6]);
                                continue;
                            }
                            if (var528 == 3202) {
                                var6 -= 2;
                                class107.method920(class121.field2115[var6], (byte) 69, 255, class121.field2115[var6 + 1]);
                                continue;
                            }
                        } else if (var528 < 3400) {
                            if (var528 == 3300) {
                                class121.field2115[var6++] = class181.field3045;
                                continue;
                            }
                            if (var528 == 3301) {
                                var6 -= 2;
                                int var435 = class121.field2115[var6 + 1];
                                int var436 = class121.field2115[var6];
                                class121.field2115[var6++] = class188.method1436(-1, var436, var435);
                                continue;
                            }
                            if (var528 == 3302) {
                                var6 -= 2;
                                int var437 = class121.field2115[var6];
                                int var438 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class284.method1937(2, var437, var438);
                                continue;
                            }
                            if (var528 == 3303) {
                                var6 -= 2;
                                int var439 = class121.field2115[var6];
                                int var440 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class258.method1788(var439, -1, var440);
                                continue;
                            }
                            if (var528 == 3304) {
                                var6--;
                                int var441 = class121.field2115[var6];
                                class121.field2115[var6++] = class78.method717(var441, (byte) -96).field5114;
                                continue;
                            }
                            if (var528 == 3305) {
                                var6--;
                                int var442 = class121.field2115[var6];
                                class121.field2115[var6++] = class212.field3575[var442];
                                continue;
                            }
                            if (var528 == 3306) {
                                var6--;
                                int var443 = class121.field2115[var6];
                                class121.field2115[var6++] = class262.field4246[var443];
                                continue;
                            }
                            if (var528 == 3307) {
                                var6--;
                                int var444 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1230[var444];
                                continue;
                            }
                            if (var528 == 3308) {
                                int var445 = class205.field3497;
                                int var446 = (class218.field3632.field1985 >> 7) + class34.field484;
                                int var447 = (class218.field3632.field2036 >> 7) + class24.field345;
                                class121.field2115[var6++] = (var445 << 28) + (var447 << 14) + var446;
                                continue;
                            }
                            if (var528 == 3309) {
                                var6--;
                                int var448 = class121.field2115[var6];
                                class121.field2115[var6++] = class36.method319(268422349, var448) >> 14;
                                continue;
                            }
                            if (var528 == 3310) {
                                var6--;
                                int var449 = class121.field2115[var6];
                                class121.field2115[var6++] = var449 >> 28;
                                continue;
                            }
                            if (var528 == 3311) {
                                var6--;
                                int var450 = class121.field2115[var6];
                                class121.field2115[var6++] = class36.method319(16383, var450);
                                continue;
                            }
                            if (var528 == 3312) {
                                class121.field2115[var6++] = class36.field527 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3313) {
                                var6 -= 2;
                                int var451 = class121.field2115[var6] + 32768;
                                int var452 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class188.method1436(-1, var451, var452);
                                continue;
                            }
                            if (var528 == 3314) {
                                var6 -= 2;
                                int var453 = class121.field2115[var6] + 32768;
                                int var454 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class284.method1937(2, var453, var454);
                                continue;
                            }
                            if (var528 == 3315) {
                                var6 -= 2;
                                int var455 = class121.field2115[var6] + 32768;
                                int var456 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class258.method1788(var455, -1, var456);
                                continue;
                            }
                            if (var528 == 3316) {
                                if (class158.field2787 < 2) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = class158.field2787;
                                }
                                continue;
                            }
                            if (var528 == 3317) {
                                class121.field2115[var6++] = class144.field2628;
                                continue;
                            }
                            if (var528 == 3318) {
                                class121.field2115[var6++] = class120.field2082;
                                continue;
                            }
                            if (var528 == 3321) {
                                class121.field2115[var6++] = class78.field1259;
                                continue;
                            }
                            if (var528 == 3322) {
                                class121.field2115[var6++] = class176.field2996;
                                continue;
                            }
                            if (var528 == 3323) {
                                if (class5.field79 >= 5 && class5.field79 <= 9) {
                                    class121.field2115[var6++] = 1;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3324) {
                                if (class5.field79 >= 5 && class5.field79 <= 9) {
                                    class121.field2115[var6++] = class5.field79;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3325) {
                                class121.field2115[var6++] = class261.field4227 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3326) {
                                class121.field2115[var6++] = class218.field3632.field3480;
                                continue;
                            }
                            if (var528 == 3327) {
                                class121.field2115[var6++] = class218.field3632.field3477.field4682 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3328) {
                                class121.field2115[var6++] = class37.field537 && !class331.field5268 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3329) {
                                class121.field2115[var6++] = class330.field5256 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3330) {
                                var6--;
                                int var457 = class121.field2115[var6];
                                class121.field2115[var6++] = class37.method326(var457, 0);
                                continue;
                            }
                            if (var528 == 3331) {
                                var6 -= 2;
                                int var458 = class121.field2115[var6];
                                int var459 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class8.method56(var458, var459, -128, false);
                                continue;
                            }
                            if (var528 == 3332) {
                                var6 -= 2;
                                int var460 = class121.field2115[var6 + 1];
                                int var461 = class121.field2115[var6];
                                class121.field2115[var6++] = class8.method56(var461, var460, -127, true);
                                continue;
                            }
                            if (var528 == 3333) {
                                class121.field2115[var6++] = class52.field818;
                                continue;
                            }
                            if (var528 == 3335) {
                                class121.field2115[var6++] = class5.field67;
                                continue;
                            }
                            if (var528 == 3336) {
                                var6 -= 4;
                                int var462 = class121.field2115[var6 + 1];
                                int var463 = class121.field2115[var6];
                                int var464 = class121.field2115[var6 + 3];
                                int var465 = (var462 << 14) + var463;
                                int var466 = class121.field2115[var6 + 2];
                                int var467 = (var466 << 28) + var465;
                                int var468 = var464 + var467;
                                class121.field2115[var6++] = var468;
                                continue;
                            }
                            if (var528 == 3337) {
                                class121.field2115[var6++] = class201.field3433;
                                continue;
                            }
                        } else if (var528 < 3500) {
                            if (var528 == 3400) {
                                var6 -= 2;
                                int var418 = class121.field2115[var6];
                                int var419 = class121.field2115[var6 + 1];
                                class184 var420 = class28.method256(var418, 40);
                                if (var420.field3113 != 's') {
                                }
                                class255.field4111[var8++] = var420.method1418(-99, var419);
                                continue;
                            }
                            if (var528 == 3408) {
                                var6 -= 4;
                                int var421 = class121.field2115[var6 + 2];
                                int var422 = class121.field2115[var6];
                                int var423 = class121.field2115[var6 + 1];
                                int var424 = class121.field2115[var6 + 3];
                                class184 var425 = class28.method256(var421, 40);
                                if (var425.field3126 == var422 && var425.field3113 == var423) {
                                    if (var423 == 115) {
                                        class255.field4111[var8++] = var425.method1418(-123, var424);
                                    } else {
                                        class121.field2115[var6++] = var425.method1414((byte) -103, var424);
                                    }
                                    continue;
                                }
                                throw new RuntimeException("C3408-1");
                            }
                            if (var528 == 3409) {
                                var6 -= 3;
                                int var426 = class121.field2115[var6 + 2];
                                int var427 = class121.field2115[var6 + 1];
                                int var428 = class121.field2115[var6];
                                if (var427 == -1) {
                                    throw new RuntimeException("C3409-2");
                                }
                                class184 var429 = class28.method256(var427, 40);
                                if (var429.field3113 != var428) {
                                    throw new RuntimeException("C3409-1");
                                }
                                class121.field2115[var6++] = var429.method1420(var426, 0) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3410) {
                                var8--;
                                String var430 = class255.field4111[var8];
                                var6--;
                                int var431 = class121.field2115[var6];
                                if (var431 == -1) {
                                    throw new RuntimeException("C3410-2");
                                }
                                class184 var432 = class28.method256(var431, 40);
                                if (var432.field3113 != 's') {
                                    throw new RuntimeException("C3410-1");
                                }
                                class121.field2115[var6++] = var432.method1421(var430, 24566) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3411) {
                                var6--;
                                int var433 = class121.field2115[var6];
                                class184 var434 = class28.method256(var433, 40);
                                class121.field2115[var6++] = var434.field3132.method723(5500);
                                continue;
                            }
                        } else if (var528 < 3700) {
                            if (var528 == 3600) {
                                if (class341.field5436 == 0) {
                                    class121.field2115[var6++] = -2;
                                } else if (class341.field5436 == 1) {
                                    class121.field2115[var6++] = -1;
                                } else {
                                    class121.field2115[var6++] = class352.field5570;
                                }
                                continue;
                            }
                            if (var528 == 3601) {
                                var6--;
                                int var394 = class121.field2115[var6];
                                if (class341.field5436 == 2 && var394 < class352.field5570) {
                                    class255.field4111[var8++] = class98.field1601[var394];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 3602) {
                                var6--;
                                int var395 = class121.field2115[var6];
                                if (class341.field5436 == 2 && class352.field5570 > var395) {
                                    class121.field2115[var6++] = class67.field1077[var395];
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3603) {
                                var6--;
                                int var396 = class121.field2115[var6];
                                if (class341.field5436 == 2 && class352.field5570 > var396) {
                                    class121.field2115[var6++] = class259.field4199[var396];
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3604) {
                                var8--;
                                String var397 = class255.field4111[var8];
                                var6--;
                                int var398 = class121.field2115[var6];
                                class214.method1582(var397, var398, -23847);
                                continue;
                            }
                            if (var528 == 3605) {
                                var8--;
                                String var399 = class255.field4111[var8];
                                class257.method1782(class142.method1151(var399, -86), 0);
                                continue;
                            }
                            if (var528 == 3606) {
                                var8--;
                                String var400 = class255.field4111[var8];
                                class26.method238(class142.method1151(var400, -76), 112);
                                continue;
                            }
                            if (var528 == 3607) {
                                var8--;
                                String var401 = class255.field4111[var8];
                                class264.method1821(-30697, class142.method1151(var401, -57), false);
                                continue;
                            }
                            if (var528 == 3608) {
                                var8--;
                                String var402 = class255.field4111[var8];
                                class138.method1134((byte) -127, class142.method1151(var402, -74));
                                continue;
                            }
                            if (var528 == 3609) {
                                var8--;
                                String var403 = class255.field4111[var8];
                                if (var403.startsWith("<img=0>") || var403.startsWith("<img=1>")) {
                                    var403 = var403.substring(7);
                                }
                                class121.field2115[var6++] = class90.method789(var403, (byte) 105) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3610) {
                                var6--;
                                int var404 = class121.field2115[var6];
                                if (class341.field5436 == 2 && var404 < class352.field5570) {
                                    class255.field4111[var8++] = class269.field4300[var404];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 3611) {
                                if (class33.field481 == null) {
                                    class255.field4111[var8++] = "";
                                } else {
                                    class255.field4111[var8++] = class254.method1768(-2191, class33.field481);
                                }
                                continue;
                            }
                            if (var528 == 3612) {
                                if (class33.field481 == null) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = class298.field4746;
                                }
                                continue;
                            }
                            if (var528 == 3613) {
                                var6--;
                                int var405 = class121.field2115[var6];
                                if (class33.field481 != null && var405 < class298.field4746) {
                                    class255.field4111[var8++] = class254.method1768(-2191, class295.field4720[var405].field4308);
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 3614) {
                                var6--;
                                int var406 = class121.field2115[var6];
                                if (class33.field481 != null && var406 < class298.field4746) {
                                    class121.field2115[var6++] = class295.field4720[var406].field4299;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3615) {
                                var6--;
                                int var407 = class121.field2115[var6];
                                if (class33.field481 != null && class298.field4746 > var407) {
                                    class121.field2115[var6++] = class295.field4720[var407].field4307;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3616) {
                                class121.field2115[var6++] = class264.field4265;
                                continue;
                            }
                            if (var528 == 3617) {
                                var8--;
                                String var408 = class255.field4111[var8];
                                class120.method1021(var408, true);
                                continue;
                            }
                            if (var528 == 3618) {
                                class121.field2115[var6++] = class201.field3428;
                                continue;
                            }
                            if (var528 == 3619) {
                                var8--;
                                String var409 = class255.field4111[var8];
                                class222.method1623(1540, class142.method1151(var409, -100));
                                continue;
                            }
                            if (var528 == 3620) {
                                class230.method1658(0);
                                continue;
                            }
                            if (var528 == 3621) {
                                if (class341.field5436 == 0) {
                                    class121.field2115[var6++] = -1;
                                } else {
                                    class121.field2115[var6++] = class200.field3424;
                                }
                                continue;
                            }
                            if (var528 == 3622) {
                                var6--;
                                int var410 = class121.field2115[var6];
                                if (class341.field5436 != 0 && class200.field3424 > var410) {
                                    class255.field4111[var8++] = class8.method48(class20.field305[var410], true);
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 3623) {
                                var8--;
                                String var411 = class255.field4111[var8];
                                if (var411.startsWith("<img=0>") || var411.startsWith("<img=1>")) {
                                    var411 = var411.substring(7);
                                }
                                class121.field2115[var6++] = class293.method2010((byte) 22, var411) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3624) {
                                var6--;
                                int var412 = class121.field2115[var6];
                                if (class295.field4720 != null && var412 < class298.field4746 && class295.field4720[var412].field4308.equalsIgnoreCase(class218.field3632.field3491)) {
                                    class121.field2115[var6++] = 1;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3625) {
                                if (class253.field4071 == null) {
                                    class255.field4111[var8++] = "";
                                } else {
                                    class255.field4111[var8++] = class254.method1768(-2191, class253.field4071);
                                }
                                continue;
                            }
                            if (var528 == 3626) {
                                var6--;
                                int var413 = class121.field2115[var6];
                                if (class33.field481 != null && var413 < class298.field4746) {
                                    class255.field4111[var8++] = class295.field4720[var413].field4301;
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 3627) {
                                var6--;
                                int var414 = class121.field2115[var6];
                                if (class341.field5436 == 2 && var414 >= 0 && var414 < class352.field5570) {
                                    class121.field2115[var6++] = class344.field5477[var414] ? 1 : 0;
                                    continue;
                                }
                                class121.field2115[var6++] = 0;
                                continue;
                            }
                            if (var528 == 3628) {
                                var8--;
                                String var415 = class255.field4111[var8];
                                if (var415.startsWith("<img=0>") || var415.startsWith("<img=1>")) {
                                    var415 = var415.substring(7);
                                }
                                class121.field2115[var6++] = class168.method1320(var415, -112);
                                continue;
                            }
                            if (var528 == 3629) {
                                class121.field2115[var6++] = class1.field3;
                                continue;
                            }
                            if (var528 == 3630) {
                                var8--;
                                String var416 = class255.field4111[var8];
                                class264.method1821(-30697, class142.method1151(var416, -89), true);
                                continue;
                            }
                            if (var528 == 3631) {
                                var6--;
                                int var417 = class121.field2115[var6];
                                class121.field2115[var6++] = class322.field5121[var417] ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 4000) {
                            if (var528 == 3903) {
                                var6--;
                                int var76 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var76].method689(-9);
                                continue;
                            }
                            if (var528 == 3904) {
                                var6--;
                                int var77 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var77].field1201;
                                continue;
                            }
                            if (var528 == 3905) {
                                var6--;
                                int var78 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var78].field1203;
                                continue;
                            }
                            if (var528 == 3906) {
                                var6--;
                                int var79 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var79].field1204;
                                continue;
                            }
                            if (var528 == 3907) {
                                var6--;
                                int var80 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var80].field1197;
                                continue;
                            }
                            if (var528 == 3908) {
                                var6--;
                                int var81 = class121.field2115[var6];
                                class121.field2115[var6++] = class75.field1227[var81].field1208;
                                continue;
                            }
                            if (var528 == 3910) {
                                var6--;
                                int var82 = class121.field2115[var6];
                                int var83 = class75.field1227[var82].method688(arg0);
                                class121.field2115[var6++] = var83 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3911) {
                                var6--;
                                int var84 = class121.field2115[var6];
                                int var85 = class75.field1227[var84].method688(arg0);
                                class121.field2115[var6++] = var85 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3912) {
                                var6--;
                                int var86 = class121.field2115[var6];
                                int var87 = class75.field1227[var86].method688(true);
                                class121.field2115[var6++] = var87 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 3913) {
                                var6--;
                                int var88 = class121.field2115[var6];
                                int var89 = class75.field1227[var88].method688(true);
                                class121.field2115[var6++] = var89 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 4100) {
                            if (var528 == 4000) {
                                var6 -= 2;
                                int var349 = class121.field2115[var6];
                                int var350 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = var349 + var350;
                                continue;
                            }
                            if (var528 == 4001) {
                                var6 -= 2;
                                int var351 = class121.field2115[var6 + 1];
                                int var352 = class121.field2115[var6];
                                class121.field2115[var6++] = var352 - var351;
                                continue;
                            }
                            if (var528 == 4002) {
                                var6 -= 2;
                                int var353 = class121.field2115[var6];
                                int var354 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = var353 * var354;
                                continue;
                            }
                            if (var528 == 4003) {
                                var6 -= 2;
                                int var355 = class121.field2115[var6 + 1];
                                int var356 = class121.field2115[var6];
                                class121.field2115[var6++] = var356 / var355;
                                continue;
                            }
                            if (var528 == 4004) {
                                var6--;
                                int var357 = class121.field2115[var6];
                                class121.field2115[var6++] = (int) (Math.random() * (double) var357);
                                continue;
                            }
                            if (var528 == 4005) {
                                var6--;
                                int var358 = class121.field2115[var6];
                                class121.field2115[var6++] = (int) (Math.random() * (double) (var358 + 1));
                                continue;
                            }
                            if (var528 == 4006) {
                                var6 -= 5;
                                int var359 = class121.field2115[var6];
                                int var360 = class121.field2115[var6 + 1];
                                int var361 = class121.field2115[var6 + 2];
                                int var362 = class121.field2115[var6 + 3];
                                int var363 = class121.field2115[var6 + 4];
                                class121.field2115[var6++] = var359 + ((var360 - var359) * (var363 - var361) / (var362 - var361));
                                continue;
                            }
                            if (var528 == 4007) {
                                var6 -= 2;
                                long var364 = (long) class121.field2115[var6 + 1];
                                long var366 = (long) class121.field2115[var6];
                                class121.field2115[var6++] = (int) (var364 * var366 / 100L + var366);
                                continue;
                            }
                            if (var528 == 4008) {
                                var6 -= 2;
                                int var368 = class121.field2115[var6 + 1];
                                int var369 = class121.field2115[var6];
                                class121.field2115[var6++] = class144.method1159(0x1 << var368, var369);
                                continue;
                            }
                            if (var528 == 4009) {
                                var6 -= 2;
                                int var370 = class121.field2115[var6 + 1];
                                int var371 = class121.field2115[var6];
                                class121.field2115[var6++] = class36.method319(var371, -(0x1 << var370) - 1);
                                continue;
                            }
                            if (var528 == 4010) {
                                var6 -= 2;
                                int var372 = class121.field2115[var6];
                                int var373 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class36.method319(var372, 0x1 << var373) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var528 == 4011) {
                                var6 -= 2;
                                int var374 = class121.field2115[var6];
                                int var375 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = var374 % var375;
                                continue;
                            }
                            if (var528 == 4012) {
                                var6 -= 2;
                                int var376 = class121.field2115[var6];
                                int var377 = class121.field2115[var6 + 1];
                                if (var376 == 0) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = (int) Math.pow((double) var376, (double) var377);
                                }
                                continue;
                            }
                            if (var528 == 4013) {
                                var6 -= 2;
                                int var378 = class121.field2115[var6];
                                int var379 = class121.field2115[var6 + 1];
                                if (var378 == 0) {
                                    class121.field2115[var6++] = 0;
                                } else if (var379 == 0) {
                                    class121.field2115[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class121.field2115[var6++] = (int) Math.pow((double) var378, 1.0D / (double) var379);
                                }
                                continue;
                            }
                            if (var528 == 4014) {
                                var6 -= 2;
                                int var380 = class121.field2115[var6 + 1];
                                int var381 = class121.field2115[var6];
                                class121.field2115[var6++] = class36.method319(var381, var380);
                                continue;
                            }
                            if (var528 == 4015) {
                                var6 -= 2;
                                int var382 = class121.field2115[var6];
                                int var383 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class144.method1159(var382, var383);
                                continue;
                            }
                            if (var528 == 4016) {
                                var6 -= 2;
                                int var384 = class121.field2115[var6 + 1];
                                int var385 = class121.field2115[var6];
                                class121.field2115[var6++] = var385 < var384 ? var385 : var384;
                                continue;
                            }
                            if (var528 == 4017) {
                                var6 -= 2;
                                int var386 = class121.field2115[var6];
                                int var387 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = var387 < var386 ? var386 : var387;
                                continue;
                            }
                            if (var528 == 4018) {
                                var6 -= 3;
                                long var388 = (long) class121.field2115[var6 + 1];
                                long var390 = (long) class121.field2115[var6];
                                long var392 = (long) class121.field2115[var6 + 2];
                                class121.field2115[var6++] = (int) (var390 * var392 / var388);
                                continue;
                            }
                        } else if (var528 < 4200) {
                            if (var528 == 4100) {
                                var8--;
                                String var299 = class255.field4111[var8];
                                var6--;
                                int var300 = class121.field2115[var6];
                                class255.field4111[var8++] = var299 + var300;
                                continue;
                            }
                            if (var528 == 4101) {
                                var8 -= 2;
                                String var301 = class255.field4111[var8];
                                String var302 = class255.field4111[var8 + 1];
                                class255.field4111[var8++] = var301 + var302;
                                continue;
                            }
                            if (var528 == 4102) {
                                var8--;
                                String var303 = class255.field4111[var8];
                                var6--;
                                int var304 = class121.field2115[var6];
                                class255.field4111[var8++] = var303 + class154.method1233(var304, true, 127);
                                continue;
                            }
                            if (var528 == 4103) {
                                var8--;
                                String var305 = class255.field4111[var8];
                                class255.field4111[var8++] = var305.toLowerCase();
                                continue;
                            }
                            if (var528 == 4104) {
                                var6--;
                                int var306 = class121.field2115[var6];
                                long var307 = ((long) var306 + 11745L) * 86400000L;
                                class193.field3233.setTime(new Date(var307));
                                int var309 = class193.field3233.get(5);
                                int var310 = class193.field3233.get(2);
                                int var311 = class193.field3233.get(1);
                                class255.field4111[var8++] = var309 + "-" + class7.field91[var310] + "-" + var311;
                                continue;
                            }
                            if (var528 == 4105) {
                                var8 -= 2;
                                String var312 = class255.field4111[var8];
                                String var313 = class255.field4111[var8 + 1];
                                if (class218.field3632.field3477 != null && class218.field3632.field3477.field4682) {
                                    class255.field4111[var8++] = var313;
                                    continue;
                                }
                                class255.field4111[var8++] = var312;
                                continue;
                            }
                            if (var528 == 4106) {
                                var6--;
                                int var314 = class121.field2115[var6];
                                class255.field4111[var8++] = Integer.toString(var314);
                                continue;
                            }
                            if (var528 == 4107) {
                                var8 -= 2;
                                class121.field2115[var6++] = class20.method202(class139.method1135(class5.field67, class255.field4111[var8], class255.field4111[var8 + 1], 21179), (byte) 113);
                                continue;
                            }
                            if (var528 == 4108) {
                                var6 -= 2;
                                var8--;
                                String var315 = class255.field4111[var8];
                                int var316 = class121.field2115[var6];
                                int var317 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class349.method2440(var317, (byte) -119).method2233(var315, var316);
                                continue;
                            }
                            if (var528 == 4109) {
                                var6 -= 2;
                                var8--;
                                String var318 = class255.field4111[var8];
                                int var319 = class121.field2115[var6];
                                int var320 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = class349.method2440(var320, (byte) -119).method2236(var318, var319);
                                continue;
                            }
                            if (var528 == 4110) {
                                var8 -= 2;
                                String var321 = class255.field4111[var8];
                                String var322 = class255.field4111[var8 + 1];
                                var6--;
                                if (class121.field2115[var6] == 1) {
                                    class255.field4111[var8++] = var321;
                                } else {
                                    class255.field4111[var8++] = var322;
                                }
                                continue;
                            }
                            if (var528 == 4111) {
                                var8--;
                                String var323 = class255.field4111[var8];
                                class255.field4111[var8++] = class323.method2229(var323);
                                continue;
                            }
                            if (var528 == 4112) {
                                var8--;
                                String var324 = class255.field4111[var8];
                                var6--;
                                int var325 = class121.field2115[var6];
                                if (var325 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class255.field4111[var8++] = var324 + (char) var325;
                                continue;
                            }
                            if (var528 == 4113) {
                                var6--;
                                int var326 = class121.field2115[var6];
                                class121.field2115[var6++] = class64.method608((char) var326, true) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4114) {
                                var6--;
                                int var327 = class121.field2115[var6];
                                class121.field2115[var6++] = class246.method1724((byte) 126, (char) var327) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4115) {
                                var6--;
                                int var328 = class121.field2115[var6];
                                class121.field2115[var6++] = class83.method751(86, (char) var328) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4116) {
                                var6--;
                                int var329 = class121.field2115[var6];
                                class121.field2115[var6++] = class233.method1673((char) var329, (byte) -119) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4117) {
                                var8--;
                                String var330 = class255.field4111[var8];
                                if (var330 == null) {
                                    class121.field2115[var6++] = 0;
                                } else {
                                    class121.field2115[var6++] = var330.length();
                                }
                                continue;
                            }
                            if (var528 == 4118) {
                                var8--;
                                String var331 = class255.field4111[var8];
                                var6 -= 2;
                                int var332 = class121.field2115[var6];
                                int var333 = class121.field2115[var6 + 1];
                                class255.field4111[var8++] = var331.substring(var332, var333);
                                continue;
                            }
                            if (var528 == 4119) {
                                var8--;
                                String var334 = class255.field4111[var8];
                                StringBuffer var335 = new StringBuffer(var334.length());
                                boolean var336 = false;
                                for (int var337 = 0; var334.length() > var337; var337++) {
                                    char var338 = var334.charAt(var337);
                                    if (var338 == '<') {
                                        var336 = true;
                                    } else if (var338 == '>') {
                                        var336 = false;
                                    } else if (!var336) {
                                        var335.append(var338);
                                    }
                                }
                                class255.field4111[var8++] = var335.toString();
                                continue;
                            }
                            if (var528 == 4120) {
                                var6 -= 2;
                                int var339 = class121.field2115[var6];
                                var8--;
                                String var340 = class255.field4111[var8];
                                int var341 = class121.field2115[var6 + 1];
                                class121.field2115[var6++] = var340.indexOf(var339, var341);
                                continue;
                            }
                            if (var528 == 4121) {
                                var8 -= 2;
                                String var342 = class255.field4111[var8 + 1];
                                String var343 = class255.field4111[var8];
                                var6--;
                                int var344 = class121.field2115[var6];
                                class121.field2115[var6++] = var343.indexOf(var342, var344);
                                continue;
                            }
                            if (var528 == 4122) {
                                var6--;
                                int var345 = class121.field2115[var6];
                                class121.field2115[var6++] = Character.toLowerCase((char) var345);
                                continue;
                            }
                            if (var528 == 4123) {
                                var6--;
                                int var346 = class121.field2115[var6];
                                class121.field2115[var6++] = Character.toUpperCase((char) var346);
                                continue;
                            }
                            if (var528 == 4124) {
                                var6--;
                                boolean var347 = class121.field2115[var6] != 0;
                                var6--;
                                int var348 = class121.field2115[var6];
                                class255.field4111[var8++] = class264.method1820((byte) 32, 0, class5.field67, (long) var348, var347);
                                continue;
                            }
                        } else if (var528 < 4300) {
                            if (var528 == 4200) {
                                var6--;
                                int var280 = class121.field2115[var6];
                                class255.field4111[var8++] = class5.method31(-1731690365, var280).field2346;
                                continue;
                            }
                            if (var528 == 4201) {
                                var6 -= 2;
                                int var281 = class121.field2115[var6 + 1];
                                int var282 = class121.field2115[var6];
                                class134 var283 = class5.method31(-1731690365, var282);
                                if (var281 >= 1 && var281 <= 5 && var283.field2345[var281 - 1] != null) {
                                    class255.field4111[var8++] = var283.field2345[var281 - 1];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 4202) {
                                var6 -= 2;
                                int var284 = class121.field2115[var6];
                                int var285 = class121.field2115[var6 + 1];
                                class134 var286 = class5.method31(-1731690365, var284);
                                if (var285 >= 1 && var285 <= 5 && var286.field2330[var285 - 1] != null) {
                                    class255.field4111[var8++] = var286.field2330[var285 - 1];
                                    continue;
                                }
                                class255.field4111[var8++] = "";
                                continue;
                            }
                            if (var528 == 4203) {
                                var6--;
                                int var287 = class121.field2115[var6];
                                class121.field2115[var6++] = class5.method31(-1731690365, var287).field2324;
                                continue;
                            }
                            if (var528 == 4204) {
                                var6--;
                                int var288 = class121.field2115[var6];
                                class121.field2115[var6++] = class5.method31(-1731690365, var288).field2338 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4205) {
                                var6--;
                                int var289 = class121.field2115[var6];
                                class134 var290 = class5.method31(-1731690365, var289);
                                if (var290.field2290 == -1 && var290.field2334 >= 0) {
                                    class121.field2115[var6++] = var290.field2334;
                                    continue;
                                }
                                class121.field2115[var6++] = var289;
                                continue;
                            }
                            if (var528 == 4206) {
                                var6--;
                                int var291 = class121.field2115[var6];
                                class134 var292 = class5.method31(-1731690365, var291);
                                if (var292.field2290 >= 0 && var292.field2334 >= 0) {
                                    class121.field2115[var6++] = var292.field2334;
                                    continue;
                                }
                                class121.field2115[var6++] = var291;
                                continue;
                            }
                            if (var528 == 4207) {
                                var6--;
                                int var293 = class121.field2115[var6];
                                class121.field2115[var6++] = class5.method31(-1731690365, var293).field2319 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 4208) {
                                var6 -= 2;
                                int var294 = class121.field2115[var6];
                                int var295 = class121.field2115[var6 + 1];
                                class53 var296 = class223.method1631(var295, 11);
                                if (var296.method481(true)) {
                                    class255.field4111[var8++] = class5.method31(-1731690365, var294).method1097(var296.field826, var295, 0);
                                } else {
                                    class121.field2115[var6++] = class5.method31(-1731690365, var294).method1107(var295, true, var296.field832);
                                }
                                continue;
                            }
                            if (var528 == 4210) {
                                var8--;
                                String var297 = class255.field4111[var8];
                                var6--;
                                int var298 = class121.field2115[var6];
                                class256.method1780(var298 == 1, 0, var297);
                                class121.field2115[var6++] = class339.field5425;
                                continue;
                            }
                            if (var528 == 4211) {
                                if (class30.field442 != null && class283.field4489 < class339.field5425) {
                                    class121.field2115[var6++] = class36.method319(65535, class30.field442[class283.field4489++]);
                                    continue;
                                }
                                class121.field2115[var6++] = -1;
                                continue;
                            }
                            if (var528 == 4212) {
                                class283.field4489 = 0;
                                continue;
                            }
                        } else if (var528 < 4400) {
                            if (var528 == 4300) {
                                var6 -= 2;
                                int var90 = class121.field2115[var6];
                                int var91 = class121.field2115[var6 + 1];
                                class53 var92 = class223.method1631(var91, 11);
                                if (var92.method481(true)) {
                                    class255.field4111[var8++] = class224.method1637(var90, (byte) 115).method119(var92.field826, -1, var91);
                                } else {
                                    class121.field2115[var6++] = class224.method1637(var90, (byte) 120).method125(var91, var92.field832, -54);
                                }
                                continue;
                            }
                        } else if (var528 >= 4500) {
                            if (var528 < 4600) {
                                if (var528 == 4500) {
                                    var6 -= 2;
                                    int var93 = class121.field2115[var6];
                                    int var94 = class121.field2115[var6 + 1];
                                    class53 var95 = class223.method1631(var94, 11);
                                    if (var95.method481(true)) {
                                        class255.field4111[var8++] = class84.method763((byte) -117, var93).method1305((byte) 125, var95.field826, var94);
                                    } else {
                                        class121.field2115[var6++] = class84.method763((byte) -113, var93).method1307(var94, var95.field832, -1);
                                    }
                                    continue;
                                }
                            } else if (var528 < 5100) {
                                if (var528 == 5000) {
                                    class121.field2115[var6++] = class240.field3917;
                                    continue;
                                }
                                if (var528 == 5001) {
                                    var6 -= 3;
                                    class240.field3917 = class121.field2115[var6];
                                    class226.field3813 = class121.field2115[var6 + 1];
                                    class330.field5261 = class121.field2115[var6 + 2];
                                    class341.field5443.method26(181, 7);
                                    class341.field5443.method2370(class240.field3917, (byte) -20);
                                    class341.field5443.method2370(class226.field3813, (byte) -20);
                                    class40.field604++;
                                    class341.field5443.method2370(class330.field5261, (byte) -20);
                                    continue;
                                }
                                if (var528 == 5002) {
                                    var6 -= 2;
                                    class161.field2855++;
                                    var8--;
                                    String var212 = class255.field4111[var8];
                                    int var213 = class121.field2115[var6];
                                    int var214 = class121.field2115[var6 + 1];
                                    class341.field5443.method26(200, 7);
                                    class341.field5443.method2333(class142.method1151(var212, -128), 80);
                                    class341.field5443.method2370(var213 - 1, (byte) -20);
                                    class341.field5443.method2370(var214, (byte) -20);
                                    continue;
                                }
                                if (var528 == 5003) {
                                    var6--;
                                    int var215 = class121.field2115[var6];
                                    String var216 = null;
                                    if (var215 < 100) {
                                        var216 = class127.field2195[var215];
                                    }
                                    if (var216 == null) {
                                        var216 = "";
                                    }
                                    class255.field4111[var8++] = var216;
                                    continue;
                                }
                                if (var528 == 5004) {
                                    var6--;
                                    int var217 = class121.field2115[var6];
                                    int var218 = -1;
                                    if (var217 < 100 && class127.field2195[var217] != null) {
                                        var218 = class308.field4905[var217];
                                    }
                                    class121.field2115[var6++] = var218;
                                    continue;
                                }
                                if (var528 == 5005) {
                                    class121.field2115[var6++] = class226.field3813;
                                    continue;
                                }
                                if (var528 == 5008) {
                                    var8--;
                                    String var219 = class255.field4111[var8];
                                    if (var219.startsWith("::")) {
                                        class349.method2439(var219, 768);
                                        continue;
                                    }
                                    if (class158.field2787 == 0 && (class37.field537 && !class331.field5268 || class330.field5256)) {
                                        continue;
                                    }
                                    class310.field4917++;
                                    String var220 = var219.toLowerCase();
                                    byte var221 = 0;
                                    if (var220.startsWith(class227.field3815)) {
                                        var221 = 0;
                                        var219 = var219.substring(class227.field3815.length());
                                    } else if (var220.startsWith(class188.field3150)) {
                                        var219 = var219.substring(class188.field3150.length());
                                        var221 = 1;
                                    } else if (var220.startsWith(class283.field4482)) {
                                        var219 = var219.substring(class283.field4482.length());
                                        var221 = 2;
                                    } else if (var220.startsWith(class348.field5540)) {
                                        var219 = var219.substring(class348.field5540.length());
                                        var221 = 3;
                                    } else if (var220.startsWith(class290.field4626)) {
                                        var219 = var219.substring(class290.field4626.length());
                                        var221 = 4;
                                    } else if (var220.startsWith(class279.field4432)) {
                                        var219 = var219.substring(class279.field4432.length());
                                        var221 = 5;
                                    } else if (var220.startsWith(class210.field3554)) {
                                        var221 = 6;
                                        var219 = var219.substring(class210.field3554.length());
                                    } else if (var220.startsWith(class119.field2068)) {
                                        var219 = var219.substring(class119.field2068.length());
                                        var221 = 7;
                                    } else if (var220.startsWith(class78.field1266)) {
                                        var219 = var219.substring(class78.field1266.length());
                                        var221 = 8;
                                    } else if (var220.startsWith(class121.field2109)) {
                                        var221 = 9;
                                        var219 = var219.substring(class121.field2109.length());
                                    } else if (var220.startsWith(class141.field2593)) {
                                        var221 = 10;
                                        var219 = var219.substring(class141.field2593.length());
                                    } else if (var220.startsWith(class266.field4290)) {
                                        var221 = 11;
                                        var219 = var219.substring(class266.field4290.length());
                                    } else if (class5.field67 != 0) {
                                        if (var220.startsWith(class285.field4533)) {
                                            var219 = var219.substring(class285.field4533.length());
                                            var221 = 0;
                                        } else if (var220.startsWith(class107.field1816)) {
                                            var219 = var219.substring(class107.field1816.length());
                                            var221 = 1;
                                        } else if (var220.startsWith(class203.field3461)) {
                                            var219 = var219.substring(class203.field3461.length());
                                            var221 = 2;
                                        } else if (var220.startsWith(class311.field4925)) {
                                            var221 = 3;
                                            var219 = var219.substring(class311.field4925.length());
                                        } else if (var220.startsWith(class108.field1845)) {
                                            var219 = var219.substring(class108.field1845.length());
                                            var221 = 4;
                                        } else if (var220.startsWith(class284.field4506)) {
                                            var219 = var219.substring(class284.field4506.length());
                                            var221 = 5;
                                        } else if (var220.startsWith(class92.field1447)) {
                                            var219 = var219.substring(class92.field1447.length());
                                            var221 = 6;
                                        } else if (var220.startsWith(class218.field3638)) {
                                            var219 = var219.substring(class218.field3638.length());
                                            var221 = 7;
                                        } else if (var220.startsWith(class27.field372)) {
                                            var221 = 8;
                                            var219 = var219.substring(class27.field372.length());
                                        } else if (var220.startsWith(class304.field4828)) {
                                            var219 = var219.substring(class304.field4828.length());
                                            var221 = 9;
                                        } else if (var220.startsWith(class336.field5369)) {
                                            var219 = var219.substring(class336.field5369.length());
                                            var221 = 10;
                                        } else if (var220.startsWith(class286.field4548)) {
                                            var219 = var219.substring(class286.field4548.length());
                                            var221 = 11;
                                        }
                                    }
                                    String var222 = var219.toLowerCase();
                                    byte var223 = 0;
                                    if (var222.startsWith(class262.field4252)) {
                                        var223 = 1;
                                        var219 = var219.substring(class262.field4252.length());
                                    } else if (var222.startsWith(class269.field4304)) {
                                        var223 = 2;
                                        var219 = var219.substring(class269.field4304.length());
                                    } else if (var222.startsWith(class185.field3145)) {
                                        var219 = var219.substring(class185.field3145.length());
                                        var223 = 3;
                                    } else if (var222.startsWith(class288.field4598)) {
                                        var223 = 4;
                                        var219 = var219.substring(class288.field4598.length());
                                    } else if (var222.startsWith(class205.field3507)) {
                                        var219 = var219.substring(class205.field3507.length());
                                        var223 = 5;
                                    } else if (class5.field67 != 0) {
                                        if (var222.startsWith(class21.field316)) {
                                            var223 = 1;
                                            var219 = var219.substring(class21.field316.length());
                                        } else if (var222.startsWith(class213.field3587)) {
                                            var223 = 2;
                                            var219 = var219.substring(class213.field3587.length());
                                        } else if (var222.startsWith(class259.field4206)) {
                                            var223 = 3;
                                            var219 = var219.substring(class259.field4206.length());
                                        } else if (var222.startsWith(class161.field2858)) {
                                            var219 = var219.substring(class161.field2858.length());
                                            var223 = 4;
                                        } else if (var222.startsWith(class271.field4318)) {
                                            var219 = var219.substring(class271.field4318.length());
                                            var223 = 5;
                                        }
                                    }
                                    class341.field5443.method26(129, 7);
                                    class341.field5443.method2370(0, (byte) -20);
                                    int var224 = class341.field5443.field5353;
                                    class341.field5443.method2370(var221, (byte) -20);
                                    class341.field5443.method2370(var223, (byte) -20);
                                    class44.method396(class341.field5443, var219, 1);
                                    class341.field5443.method2344(class341.field5443.field5353 - var224, (byte) 21);
                                    continue;
                                }
                                if (var528 == 5009) {
                                    var8 -= 2;
                                    String var225 = class255.field4111[var8];
                                    String var226 = class255.field4111[var8 + 1];
                                    if (class158.field2787 != 0 || (!class37.field537 || class331.field5268) && !class330.field5256) {
                                        class341.field5443.method26(114, 7);
                                        class254.field4097++;
                                        class341.field5443.method2370(0, (byte) -20);
                                        int var227 = class341.field5443.field5353;
                                        class341.field5443.method2333(class142.method1151(var225, -74), 100);
                                        class44.method396(class341.field5443, var226, 1);
                                        class341.field5443.method2344(class341.field5443.field5353 - var227, (byte) -128);
                                    }
                                    continue;
                                }
                                if (var528 == 5010) {
                                    var6--;
                                    int var228 = class121.field2115[var6];
                                    String var229 = null;
                                    if (var228 < 100) {
                                        var229 = class239.field3912[var228];
                                    }
                                    if (var229 == null) {
                                        var229 = "";
                                    }
                                    class255.field4111[var8++] = var229;
                                    continue;
                                }
                                if (var528 == 5011) {
                                    var6--;
                                    int var230 = class121.field2115[var6];
                                    String var231 = null;
                                    if (var230 < 100) {
                                        var231 = class194.field3244[var230];
                                    }
                                    if (var231 == null) {
                                        var231 = "";
                                    }
                                    class255.field4111[var8++] = var231;
                                    continue;
                                }
                                if (var528 == 5012) {
                                    var6--;
                                    int var232 = class121.field2115[var6];
                                    int var233 = -1;
                                    if (var232 < 100) {
                                        var233 = class89.field1405[var232];
                                    }
                                    class121.field2115[var6++] = var233;
                                    continue;
                                }
                                if (var528 == 5015) {
                                    String var234;
                                    if (class218.field3632 == null || class218.field3632.field3491 == null) {
                                        var234 = class58.field902;
                                    } else {
                                        var234 = class218.field3632.method1534(-89);
                                    }
                                    class255.field4111[var8++] = var234;
                                    continue;
                                }
                                if (var528 == 5016) {
                                    class121.field2115[var6++] = class330.field5261;
                                    continue;
                                }
                                if (var528 == 5017) {
                                    class121.field2115[var6++] = class30.field435;
                                    continue;
                                }
                                if (var528 == 5050) {
                                    var6--;
                                    int var235 = class121.field2115[var6];
                                    class255.field4111[var8++] = class93.method804(var235, 76).field1416;
                                    continue;
                                }
                                if (var528 == 5051) {
                                    var6--;
                                    int var236 = class121.field2115[var6];
                                    class89 var237 = class93.method804(var236, -45);
                                    if (var237.field1398 == null) {
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var237.field1398.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5052) {
                                    var6 -= 2;
                                    int var238 = class121.field2115[var6];
                                    int var239 = class121.field2115[var6 + 1];
                                    class89 var240 = class93.method804(var238, -121);
                                    int var241 = var240.field1398[var239];
                                    class121.field2115[var6++] = var241;
                                    continue;
                                }
                                if (var528 == 5053) {
                                    var6--;
                                    int var242 = class121.field2115[var6];
                                    class89 var243 = class93.method804(var242, 103);
                                    if (var243.field1406 == null) {
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var243.field1406.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5054) {
                                    var6 -= 2;
                                    int var244 = class121.field2115[var6];
                                    int var245 = class121.field2115[var6 + 1];
                                    class121.field2115[var6++] = class93.method804(var244, 87).field1406[var245];
                                    continue;
                                }
                                if (var528 == 5055) {
                                    var6--;
                                    int var246 = class121.field2115[var6];
                                    class255.field4111[var8++] = class202.method1518(var246, 0).method675((byte) 97);
                                    continue;
                                }
                                if (var528 == 5056) {
                                    var6--;
                                    int var247 = class121.field2115[var6];
                                    class70 var248 = class202.method1518(var247, 0);
                                    if (var248.field1137 == null) {
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var248.field1137.length;
                                    }
                                    continue;
                                }
                                if (var528 == 5057) {
                                    var6 -= 2;
                                    int var249 = class121.field2115[var6];
                                    int var250 = class121.field2115[var6 + 1];
                                    class121.field2115[var6++] = class202.method1518(var249, 0).field1137[var250];
                                    continue;
                                }
                                if (var528 == 5058) {
                                    class324.field5150 = new class94();
                                    var6--;
                                    class324.field5150.field1475 = class121.field2115[var6];
                                    class324.field5150.field1469 = class202.method1518(class324.field5150.field1475, 0);
                                    class324.field5150.field1478 = new int[class324.field5150.field1469.method668(-18989)];
                                    continue;
                                }
                                if (var528 == 5059) {
                                    class324.field5156++;
                                    class341.field5443.method26(77, 7);
                                    class341.field5443.method2370(0, (byte) -20);
                                    int var251 = class341.field5443.field5353;
                                    class341.field5443.method2370(0, (byte) -20);
                                    class341.field5443.method2359(-805606200, class324.field5150.field1475);
                                    class324.field5150.field1469.method672(class324.field5150.field1478, class341.field5443, 112);
                                    class341.field5443.method2344(class341.field5443.field5353 - var251, (byte) -104);
                                    continue;
                                }
                                if (var528 == 5060) {
                                    var8--;
                                    String var252 = class255.field4111[var8];
                                    class80.field1299++;
                                    class341.field5443.method26(44, 7);
                                    class341.field5443.method2370(0, (byte) -20);
                                    int var253 = class341.field5443.field5353;
                                    class341.field5443.method2333(class142.method1151(var252, -77), 56);
                                    class341.field5443.method2359(-805606200, class324.field5150.field1475);
                                    class324.field5150.field1469.method672(class324.field5150.field1478, class341.field5443, 67);
                                    class341.field5443.method2344(class341.field5443.field5353 - var253, (byte) -117);
                                    continue;
                                }
                                if (var528 == 5061) {
                                    class341.field5443.method26(77, 7);
                                    class324.field5156++;
                                    class341.field5443.method2370(0, (byte) -20);
                                    int var254 = class341.field5443.field5353;
                                    class341.field5443.method2370(1, (byte) -20);
                                    class341.field5443.method2359(-805606200, class324.field5150.field1475);
                                    class324.field5150.field1469.method672(class324.field5150.field1478, class341.field5443, 95);
                                    class341.field5443.method2344(class341.field5443.field5353 - var254, (byte) -99);
                                    continue;
                                }
                                if (var528 == 5062) {
                                    var6 -= 2;
                                    int var255 = class121.field2115[var6];
                                    int var256 = class121.field2115[var6 + 1];
                                    class121.field2115[var6++] = class93.method804(var255, 120).field1400[var256];
                                    continue;
                                }
                                if (var528 == 5063) {
                                    var6 -= 2;
                                    int var257 = class121.field2115[var6 + 1];
                                    int var258 = class121.field2115[var6];
                                    class121.field2115[var6++] = class93.method804(var258, -98).field1401[var257];
                                    continue;
                                }
                                if (var528 == 5064) {
                                    var6 -= 2;
                                    int var259 = class121.field2115[var6 + 1];
                                    int var260 = class121.field2115[var6];
                                    if (var259 == -1) {
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        class121.field2115[var6++] = class93.method804(var260, 83).method785((byte) -17, (char) var259);
                                    }
                                    continue;
                                }
                                if (var528 == 5065) {
                                    var6 -= 2;
                                    int var261 = class121.field2115[var6 + 1];
                                    int var262 = class121.field2115[var6];
                                    if (var261 == -1) {
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        class121.field2115[var6++] = class93.method804(var262, 101).method783((char) var261, 15491);
                                    }
                                    continue;
                                }
                                if (var528 == 5066) {
                                    var6--;
                                    int var263 = class121.field2115[var6];
                                    class121.field2115[var6++] = class202.method1518(var263, 0).method668(-18989);
                                    continue;
                                }
                                if (var528 == 5067) {
                                    var6 -= 2;
                                    int var264 = class121.field2115[var6 + 1];
                                    int var265 = class121.field2115[var6];
                                    int var266 = class202.method1518(var265, 0).method664(false, var264);
                                    class121.field2115[var6++] = var266;
                                    continue;
                                }
                                if (var528 == 5068) {
                                    var6 -= 2;
                                    int var267 = class121.field2115[var6];
                                    int var268 = class121.field2115[var6 + 1];
                                    class324.field5150.field1478[var267] = var268;
                                    continue;
                                }
                                if (var528 == 5069) {
                                    var6 -= 2;
                                    int var269 = class121.field2115[var6];
                                    int var270 = class121.field2115[var6 + 1];
                                    class324.field5150.field1478[var269] = var270;
                                    continue;
                                }
                                if (var528 == 5070) {
                                    var6 -= 3;
                                    int var271 = class121.field2115[var6];
                                    int var272 = class121.field2115[var6 + 1];
                                    int var273 = class121.field2115[var6 + 2];
                                    class70 var274 = class202.method1518(var271, 0);
                                    if (var274.method664(false, var272) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class121.field2115[var6++] = var274.method673((byte) -102, var272, var273);
                                    continue;
                                }
                                if (var528 == 5071) {
                                    var8--;
                                    String var275 = class255.field4111[var8];
                                    var6--;
                                    boolean var276 = class121.field2115[var6] == 1;
                                    class170.method1345(255, var276, var275);
                                    class121.field2115[var6++] = class339.field5425;
                                    continue;
                                }
                                if (var528 == 5072) {
                                    if (class30.field442 != null && class339.field5425 > class283.field4489) {
                                        class121.field2115[var6++] = class36.method319(65535, class30.field442[class283.field4489++]);
                                        continue;
                                    }
                                    class121.field2115[var6++] = -1;
                                    continue;
                                }
                                if (var528 == 5073) {
                                    class283.field4489 = 0;
                                    continue;
                                }
                            } else if (var528 < 5200) {
                                if (var528 == 5100) {
                                    if (class97.field1572[86]) {
                                        class121.field2115[var6++] = 1;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5101) {
                                    if (class97.field1572[82]) {
                                        class121.field2115[var6++] = 1;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5102) {
                                    if (class97.field1572[81]) {
                                        class121.field2115[var6++] = 1;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var528 < 5300) {
                                if (var528 == 5200) {
                                    var6--;
                                    class78.method712(class121.field2115[var6], true);
                                    continue;
                                }
                                if (var528 == 5201) {
                                    class121.field2115[var6++] = class279.method1910(-1);
                                    continue;
                                }
                                if (var528 == 5202) {
                                    var6--;
                                    class58.method526(class121.field2115[var6], 0);
                                    continue;
                                }
                                if (var528 == 5203) {
                                    var8--;
                                    class215.method1586(class255.field4111[var8], false);
                                    continue;
                                }
                                if (var528 == 5204) {
                                    class255.field4111[var8 - 1] = class322.method2218((byte) 38, class255.field4111[var8 - 1]);
                                    continue;
                                }
                                if (var528 == 5205) {
                                    var6--;
                                    class78.method715(230, class121.field2115[var6], -1, -1);
                                    continue;
                                }
                                if (var528 == 5206) {
                                    var6--;
                                    int var96 = class121.field2115[var6];
                                    class325 var97 = class194.method1456(var96 & 0x3FFF, (byte) -36, (var96 & 0xFFFC874) >> 14);
                                    if (var97 == null) {
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        class121.field2115[var6++] = var97.field5188;
                                    }
                                    continue;
                                }
                                if (var528 == 5207) {
                                    var6--;
                                    class325 var98 = class318.method2190(-11947, class121.field2115[var6]);
                                    if (var98 != null && var98.field5186 != null) {
                                        class255.field4111[var8++] = var98.field5186;
                                        continue;
                                    }
                                    class255.field4111[var8++] = "";
                                    continue;
                                }
                                if (var528 == 5208) {
                                    class121.field2115[var6++] = class116.field2008;
                                    class121.field2115[var6++] = class109.field1857;
                                    continue;
                                }
                                if (var528 == 5209) {
                                    class121.field2115[var6++] = class95.field1483 + class341.field5444;
                                    class121.field2115[var6++] = class304.field4825 + class259.field4201 - class318.field5042 - 1;
                                    continue;
                                }
                                if (var528 == 5210) {
                                    var6--;
                                    int var99 = class121.field2115[var6];
                                    class325 var100 = class318.method2190(-11947, var99);
                                    if (var100 == null) {
                                        class121.field2115[var6++] = 0;
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = class36.method319(var100.field5172 >> 14, 16383);
                                        class121.field2115[var6++] = class36.method319(var100.field5172, 16383);
                                    }
                                    continue;
                                }
                                if (var528 == 5211) {
                                    var6--;
                                    int var101 = class121.field2115[var6];
                                    class325 var102 = class318.method2190(-11947, var101);
                                    if (var102 == null) {
                                        class121.field2115[var6++] = 0;
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var102.field5167 - var102.field5170;
                                        class121.field2115[var6++] = var102.field5180 - var102.field5179;
                                    }
                                    continue;
                                }
                                if (var528 == 5212) {
                                    int var103 = class145.method1163(0);
                                    int var104 = 0;
                                    String var105;
                                    if (var103 == -1) {
                                        var105 = "";
                                    } else {
                                        var105 = class222.field3708.field4819[var103];
                                        var104 = class222.field3708.method2093(var103, 3);
                                    }
                                    String var106 = class185.method1427(" ", -50, var105, "<br>");
                                    class255.field4111[var8++] = var106;
                                    class121.field2115[var6++] = var104;
                                    continue;
                                }
                                if (var528 == 5213) {
                                    int var107 = class322.method2214((byte) 44);
                                    int var108 = 0;
                                    String var109;
                                    if (var107 == -1) {
                                        var109 = "";
                                    } else {
                                        var109 = class222.field3708.field4819[var107];
                                        var108 = class222.field3708.method2093(var107, 3);
                                    }
                                    String var110 = class185.method1427(" ", -84, var109, "<br>");
                                    class255.field4111[var8++] = var110;
                                    class121.field2115[var6++] = var108;
                                    continue;
                                }
                                if (var528 == 5214) {
                                    var6--;
                                    int var111 = class121.field2115[var6];
                                    class325 var112 = class152.method1197((byte) 119);
                                    if (var112 != null) {
                                        int[] var113 = var112.method2253(var111 & 0x3FFF, var111 >> 14 & 0x3FFF, (var111 & 0x33A8C70A) >> 28, 93);
                                        if (var113 != null) {
                                            class5.method27(var113[2], var113[1], (byte) 96);
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5215) {
                                    var6 -= 2;
                                    int var114 = class121.field2115[var6 + 1];
                                    boolean var115 = false;
                                    int var116 = class121.field2115[var6];
                                    class98 var117 = class277.method1904(-1, (var116 & 0xFFFECC2) >> 14, var116 & 0x3FFF);
                                    for (class325 var118 = (class325) var117.method849(128); var118 != null; var118 = (class325) var117.method850(-5714)) {
                                        if (var118.field5188 == var114) {
                                            var115 = true;
                                            break;
                                        }
                                    }
                                    if (var115) {
                                        class121.field2115[var6++] = 1;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5216) {
                                    var6--;
                                    int var119 = class121.field2115[var6];
                                    class8.method58(var119, -1048576);
                                    continue;
                                }
                                if (var528 == 5217) {
                                    var6--;
                                    int var120 = class121.field2115[var6];
                                    if (class354.method2466(var120, -28209)) {
                                        class121.field2115[var6++] = 1;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 5218) {
                                    var6--;
                                    int var121 = class121.field2115[var6];
                                    class325 var122 = class318.method2190(-11947, var121);
                                    if (var122 == null) {
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        class121.field2115[var6++] = var122.field5185;
                                    }
                                    continue;
                                }
                                if (var528 == 5219) {
                                    var8--;
                                    class233.method1670((byte) -56, class255.field4111[var8]);
                                    continue;
                                }
                                if (var528 == 5220) {
                                    class121.field2115[var6++] = class114.field1915 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5221) {
                                    var6--;
                                    int var123 = class121.field2115[var6];
                                    class5.method27(var123 & 0x3FFF, (var123 & 0xFFFE9ED) >> 14, (byte) 108);
                                    continue;
                                }
                                if (var528 == 5222) {
                                    class325 var124 = class152.method1197((byte) 121);
                                    if (var124 == null) {
                                        class121.field2115[var6++] = -1;
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        int[] var125 = var124.method2254(class95.field1483 + class341.field5444, 3, class304.field4825 + class259.field4201 - class318.field5042 - 1);
                                        if (var125 == null) {
                                            class121.field2115[var6++] = -1;
                                            class121.field2115[var6++] = -1;
                                        } else {
                                            class121.field2115[var6++] = var125[1];
                                            class121.field2115[var6++] = var125[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5223) {
                                    var6 -= 2;
                                    int var126 = class121.field2115[var6];
                                    int var127 = class121.field2115[var6 + 1];
                                    class78.method715(230, var126, (var127 & 0xFFFE99B) >> 14, var127 & 0x3FFF);
                                    continue;
                                }
                                if (var528 == 5224) {
                                    var6--;
                                    int var128 = class121.field2115[var6];
                                    class325 var129 = class152.method1197((byte) 86);
                                    if (var129 == null) {
                                        class121.field2115[var6++] = -1;
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        int[] var130 = var129.method2253(var128 & 0x3FFF, (var128 & 0xFFFF96A) >> 14, (var128 & 0x3DC18DB2) >> 28, 105);
                                        if (var130 == null) {
                                            class121.field2115[var6++] = -1;
                                            class121.field2115[var6++] = -1;
                                        } else {
                                            class121.field2115[var6++] = var130[1];
                                            class121.field2115[var6++] = var130[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var528 == 5225) {
                                    var6--;
                                    int var131 = class121.field2115[var6];
                                    class325 var132 = class152.method1197((byte) 112);
                                    if (var132 == null) {
                                        class121.field2115[var6++] = -1;
                                        class121.field2115[var6++] = -1;
                                    } else {
                                        int[] var133 = var132.method2254(var131 >> 14 & 0x3FFF, 3, var131 & 0x3FFF);
                                        if (var133 == null) {
                                            class121.field2115[var6++] = -1;
                                            class121.field2115[var6++] = -1;
                                        } else {
                                            class121.field2115[var6++] = var133[1];
                                            class121.field2115[var6++] = var133[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var528 < 5400) {
                                if (var528 == 5300) {
                                    var6 -= 2;
                                    int var199 = class121.field2115[var6];
                                    int var200 = class121.field2115[var6 + 1];
                                    class282.method1923(false, -91, 3, var199, var200);
                                    class121.field2115[var6++] = class120.field2076 == null ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 5301) {
                                    if (class120.field2076 != null) {
                                        class282.method1923(false, -101, class69.field1133, -1, -1);
                                    }
                                    continue;
                                }
                                if (var528 == 5302) {
                                    class168[] var201 = class122.method1033((byte) -6);
                                    class121.field2115[var6++] = var201.length;
                                    continue;
                                }
                                if (var528 == 5303) {
                                    var6--;
                                    int var202 = class121.field2115[var6];
                                    class168[] var203 = class122.method1033((byte) -124);
                                    class121.field2115[var6++] = var203[var202].field2933;
                                    class121.field2115[var6++] = var203[var202].field2934;
                                    continue;
                                }
                                if (var528 == 5305) {
                                    int var204 = class310.field4913;
                                    int var205 = class318.field5056;
                                    int var206 = -1;
                                    class168[] var207 = class122.method1033((byte) -126);
                                    for (int var208 = 0; var208 < var207.length; var208++) {
                                        class168 var209 = var207[var208];
                                        if (var209.field2933 == var204 && var209.field2934 == var205) {
                                            var206 = var208;
                                            break;
                                        }
                                    }
                                    class121.field2115[var6++] = var206;
                                    continue;
                                }
                                if (var528 == 5306) {
                                    class121.field2115[var6++] = class209.method1554(-126);
                                    continue;
                                }
                                if (var528 == 5307) {
                                    var6--;
                                    int var210 = class121.field2115[var6];
                                    if (var210 < 0 || var210 > 2) {
                                        var210 = 0;
                                    }
                                    class282.method1923(false, -57, var210, -1, -1);
                                    continue;
                                }
                                if (var528 == 5308) {
                                    class121.field2115[var6++] = class69.field1133;
                                    continue;
                                }
                                if (var528 == 5309) {
                                    var6--;
                                    int var211 = class121.field2115[var6];
                                    if (var211 < 0 || var211 > 2) {
                                        var211 = 0;
                                    }
                                    class69.field1133 = var211;
                                    class88.method774(true, class85.field1369);
                                    continue;
                                }
                            } else if (var528 < 5500) {
                                if (var528 == 5400) {
                                    class255.field4114++;
                                    var8 -= 2;
                                    var6--;
                                    int var134 = class121.field2115[var6];
                                    String var135 = class255.field4111[var8 + 1];
                                    String var136 = class255.field4111[var8];
                                    class341.field5443.method26(12, 7);
                                    class341.field5443.method2370(class283.method1927(true, var136) + class283.method1927(true, var135) + 1, (byte) -20);
                                    class341.field5443.method2349(true, var136);
                                    class341.field5443.method2349(true, var135);
                                    class341.field5443.method2370(var134, (byte) -20);
                                    continue;
                                }
                                if (var528 == 5401) {
                                    var6 -= 2;
                                    class328.field5225[class121.field2115[var6]] = (short) class66.method634((byte) -126, class121.field2115[var6 + 1]);
                                    class241.method1691(1);
                                    class178.method1373((byte) -68);
                                    class162.method1291((byte) -37);
                                    class126.method1056(16322);
                                    class220.method1614(-110);
                                    continue;
                                }
                                if (var528 == 5405) {
                                    var6 -= 2;
                                    int var137 = class121.field2115[var6];
                                    int var138 = class121.field2115[var6 + 1];
                                    if (var137 >= 0 && var137 < 2) {
                                        class148.field2661[var137] = new int[var138 << 1][4];
                                    }
                                    continue;
                                }
                                if (var528 == 5406) {
                                    var6 -= 7;
                                    int var139 = class121.field2115[var6];
                                    int var140 = class121.field2115[var6 + 1] << 1;
                                    int var141 = class121.field2115[var6 + 2];
                                    int var142 = class121.field2115[var6 + 4];
                                    int var143 = class121.field2115[var6 + 6];
                                    int var144 = class121.field2115[var6 + 5];
                                    int var145 = class121.field2115[var6 + 3];
                                    if (var139 >= 0 && var139 < 2 && class148.field2661[var139] != null && var140 >= 0 && class148.field2661[var139].length > var140) {
                                        class148.field2661[var139][var140] = new int[] { class36.method319(16383, var141 >> 14) * 128, var145, class36.method319(16383, var141) * 128, var143 };
                                        class148.field2661[var139][var140 + 1] = new int[] { class36.method319(var142 >> 14, 16383) * 128, var144, class36.method319(16383, var142) * 128 };
                                    }
                                    continue;
                                }
                                if (var528 == 5407) {
                                    var6--;
                                    int var146 = class148.field2661[class121.field2115[var6]].length >> 1;
                                    class121.field2115[var6++] = var146;
                                    continue;
                                }
                                if (var528 == 5411) {
                                    if (class120.field2076 != null) {
                                        class282.method1923(false, -50, class69.field1133, -1, -1);
                                    }
                                    if (class271.field4321 == null) {
                                        class128.method1068(false, class220.method1615(-1321467992), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var528 == 5419) {
                                    String var147 = "";
                                    if (class113.field1887 != null) {
                                        if (class113.field1887.field712 == null) {
                                            var147 = class170.method1346(class113.field1887.field711, 255);
                                        } else {
                                            var147 = (String) class113.field1887.field712;
                                        }
                                    }
                                    class255.field4111[var8++] = var147;
                                    continue;
                                }
                                if (var528 == 5420) {
                                    class121.field2115[var6++] = class59.field915 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 5421) {
                                    if (class120.field2076 != null) {
                                        class282.method1923(false, -99, class69.field1133, -1, -1);
                                    }
                                    var8--;
                                    String var148 = class255.field4111[var8];
                                    var6--;
                                    boolean var149 = class121.field2115[var6] == 1;
                                    String var150 = class220.method1615(-1321467992) + var148;
                                    if (class271.field4321 != null || var149 && class59.field915 != 3 && class59.field913.startsWith("win") && !class277.field4405) {
                                        class37.field542 = var150;
                                        class53.field824 = var149;
                                        class328.field5226 = class85.field1369.method543(true, var150);
                                        continue;
                                    }
                                    class128.method1068(var149, var150, false);
                                    continue;
                                }
                                if (var528 == 5422) {
                                    var8 -= 2;
                                    String var151 = class255.field4111[var8];
                                    String var152 = class255.field4111[var8 + 1];
                                    var6--;
                                    int var153 = class121.field2115[var6];
                                    if (var151.length() > 0) {
                                        if (class243.field3964 == null) {
                                            class243.field3964 = new String[class24.field341[class72.field1199]];
                                        }
                                        class243.field3964[var153] = var151;
                                    }
                                    if (var152.length() > 0) {
                                        if (class153.field2720 == null) {
                                            class153.field2720 = new String[class24.field341[class72.field1199]];
                                        }
                                        class153.field2720[var153] = var152;
                                    }
                                    continue;
                                }
                                if (var528 == 5423) {
                                    var8--;
                                    System.out.println(class255.field4111[var8]);
                                    continue;
                                }
                                if (var528 == 5424) {
                                    var6 -= 11;
                                    class79.field1284 = class121.field2115[var6];
                                    field1242 = class121.field2115[var6 + 1];
                                    class57.field874 = class121.field2115[var6 + 2];
                                    class146.field2636 = class121.field2115[var6 + 3];
                                    class198.field3396 = class121.field2115[var6 + 4];
                                    class141.field2591 = class121.field2115[var6 + 5];
                                    class272.field4330 = class121.field2115[var6 + 6];
                                    class214.field3601 = class121.field2115[var6 + 7];
                                    class122.field2128 = class121.field2115[var6 + 8];
                                    class12.field171 = class121.field2115[var6 + 9];
                                    class304.field4827 = class121.field2115[var6 + 10];
                                    class321.field5091.method432(class198.field3396, false);
                                    class321.field5091.method432(class141.field2591, false);
                                    class321.field5091.method432(class272.field4330, false);
                                    class321.field5091.method432(class214.field3601, false);
                                    class321.field5091.method432(class122.field2128, false);
                                    class177.field3007 = true;
                                    continue;
                                }
                                if (var528 == 5425) {
                                    class50.method462(25600);
                                    class177.field3007 = false;
                                    continue;
                                }
                                if (var528 == 5426) {
                                    var6--;
                                    class254.field4101 = class121.field2115[var6];
                                    continue;
                                }
                                if (var528 == 5427) {
                                    var6 -= 2;
                                    class12.field166 = class121.field2115[var6];
                                    class44.field703 = class121.field2115[var6 + 1];
                                    continue;
                                }
                                if (var528 == 5428) {
                                    var6 -= 2;
                                    int var154 = class121.field2115[var6];
                                    int var155 = class121.field2115[var6 + 1];
                                    class121.field2115[var6++] = class311.method2152(var154, var155, 0) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 5600) {
                                if (var528 == 5500) {
                                    var6 -= 4;
                                    int var187 = class121.field2115[var6 + 1];
                                    int var188 = class121.field2115[var6];
                                    int var189 = class121.field2115[var6 + 2];
                                    int var190 = class121.field2115[var6 + 3];
                                    class283.method1930(var189, (var188 >> 14 & 0x3FFF) - class24.field345, (byte) -12, (var188 & 0x3FFF) - class34.field484, false, var190, var187);
                                    continue;
                                }
                                if (var528 == 5501) {
                                    var6 -= 4;
                                    int var191 = class121.field2115[var6];
                                    int var192 = class121.field2115[var6 + 2];
                                    int var193 = class121.field2115[var6 + 1];
                                    int var194 = class121.field2115[var6 + 3];
                                    class262.method1809(-89, (var191 >> 14 & 0x3FFF) - class24.field345, var193, var192, var194, (var191 & 0x3FFF) - class34.field484);
                                    continue;
                                }
                                if (var528 == 5502) {
                                    var6 -= 6;
                                    int var195 = class121.field2115[var6];
                                    if (var195 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class277.field4402 = var195;
                                    int var196 = class121.field2115[var6 + 1];
                                    if ((class148.field2661[class277.field4402].length >> 1) <= (var196 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class33.field467 = 0;
                                    class258.field4188 = var196;
                                    class280.field4443 = class121.field2115[var6 + 2];
                                    class75.field1231 = class121.field2115[var6 + 3];
                                    int var197 = class121.field2115[var6 + 4];
                                    if (var197 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class213.field3586 = var197;
                                    int var198 = class121.field2115[var6 + 5];
                                    if (var198 + 1 >= class148.field2661[class213.field3586].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class72.field1198 = var198;
                                    class191.field3194 = 3;
                                    continue;
                                }
                                if (var528 == 5503) {
                                    class248.method1745(43);
                                    continue;
                                }
                                if (var528 == 5504) {
                                    var6 -= 2;
                                    class134.method1108((byte) -15, class121.field2115[var6 + 1], class121.field2115[var6]);
                                    continue;
                                }
                                if (var528 == 5505) {
                                    class121.field2115[var6++] = (int) class288.field4590;
                                    continue;
                                }
                                if (var528 == 5506) {
                                    class121.field2115[var6++] = (int) class83.field1331;
                                    continue;
                                }
                                if (var528 == 5507) {
                                    class344.method2412(-16);
                                    continue;
                                }
                                if (var528 == 5508) {
                                    class146.method1170(-17);
                                    continue;
                                }
                                if (var528 == 5509) {
                                    class110.method955(-128);
                                    continue;
                                }
                                if (var528 == 5510) {
                                    class215.method1591((byte) 113);
                                    continue;
                                }
                                if (var528 == 5512) {
                                    class289.method1970((byte) 40);
                                    continue;
                                }
                            } else if (var528 < 5700) {
                                if (var528 == 5600) {
                                    var8 -= 2;
                                    String var183 = class255.field4111[var8 + 1];
                                    String var184 = class255.field4111[var8];
                                    var6--;
                                    int var185 = class121.field2115[var6];
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0 && class160.field2826 == 0) {
                                        class24.method233(var185, var184, var183, 23869);
                                    }
                                    continue;
                                }
                                if (var528 == 5601) {
                                    class94.method809((byte) -84);
                                    continue;
                                }
                                if (var528 == 5602) {
                                    if (class126.field2168 == 0) {
                                        class86.field1378 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5603) {
                                    var6 -= 4;
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0 && class160.field2826 == 0) {
                                        class279.method1913(class121.field2115[var6 + 2], class121.field2115[var6 + 1], -96, class121.field2115[var6 + 3], class121.field2115[var6]);
                                    }
                                    continue;
                                }
                                if (var528 == 5604) {
                                    var8--;
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0 && class160.field2826 == 0) {
                                        class177.method1365(class142.method1151(class255.field4111[var8], -87), (byte) -63);
                                    }
                                    continue;
                                }
                                if (var528 == 5605) {
                                    var6 -= 7;
                                    var8 -= 3;
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0 && class160.field2826 == 0) {
                                        class70.method674(class255.field4111[var8 + 2], class121.field2115[var6 + 5] == 1, class121.field2115[var6 + 2], class121.field2115[var6 + 4] == 1, class255.field4111[var8 + 1], class121.field2115[var6 + 6] == 1, (byte) -110, class142.method1151(class255.field4111[var8], -60), class121.field2115[var6 + 1], class121.field2115[var6], class121.field2115[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var528 == 5606) {
                                    if (class69.field1127 == 0) {
                                        class148.field2660 = -2;
                                    }
                                    continue;
                                }
                                if (var528 == 5607) {
                                    class121.field2115[var6++] = class86.field1378;
                                    continue;
                                }
                                if (var528 == 5608) {
                                    class121.field2115[var6++] = class49.field763;
                                    continue;
                                }
                                if (var528 == 5609) {
                                    class121.field2115[var6++] = class148.field2660;
                                    continue;
                                }
                                if (var528 == 5610) {
                                    for (int var186 = 0; var186 < 5; var186++) {
                                        class255.field4111[var8++] = class129.field2230.length > var186 ? class254.method1768(-2191, class129.field2230[var186]) : "";
                                    }
                                    class129.field2230 = null;
                                    continue;
                                }
                                if (var528 == 5611) {
                                    class121.field2115[var6++] = class310.field4911;
                                    continue;
                                }
                            } else if (var528 < 6100) {
                                if (var528 == 6001) {
                                    var6--;
                                    int var173 = class121.field2115[var6];
                                    if (var173 < 1) {
                                        var173 = 1;
                                    }
                                    if (var173 > 4) {
                                        var173 = 4;
                                    }
                                    class32.field462 = var173;
                                    if (!class43.field680 || !class64.field1001) {
                                        if (class32.field462 == 1) {
                                            class62.method573(0.9F);
                                        }
                                        if (class32.field462 == 2) {
                                            class62.method573(0.8F);
                                        }
                                        if (class32.field462 == 3) {
                                            class62.method573(0.7F);
                                        }
                                        if (class32.field462 == 4) {
                                            class62.method573(0.6F);
                                        }
                                    }
                                    if (class43.field680) {
                                        class351.method2446(68);
                                        if (!class64.field1001) {
                                            class201.method1515((byte) -1);
                                        }
                                    }
                                    class178.method1373((byte) -68);
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6002) {
                                    var6--;
                                    class48.method426(class121.field2115[var6] == 1, (byte) 50);
                                    class324.method2251(false);
                                    class201.method1515((byte) -1);
                                    class126.method1049(4892);
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6003) {
                                    var6--;
                                    class129.field2225 = class121.field2115[var6] == 1;
                                    class126.method1049(4892);
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6005) {
                                    var6--;
                                    class48.field735 = class121.field2115[var6] == 1;
                                    class201.method1515((byte) -1);
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6006) {
                                    var6--;
                                    class328.field5216 = class121.field2115[var6] == 1;
                                    ((class153) class62.field953).method1225(!class328.field5216, -97);
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6007) {
                                    var6--;
                                    class291.field4666 = class121.field2115[var6] == 1;
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6008) {
                                    var6--;
                                    class249.field4036 = class121.field2115[var6] == 1;
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6009) {
                                    var6--;
                                    class95.field1487 = class121.field2115[var6] == 1;
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6010) {
                                    var6--;
                                    class195.field3276 = class121.field2115[var6] == 1;
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6011) {
                                    var6--;
                                    int var174 = class121.field2115[var6];
                                    if (var174 < 0 || var174 > 2) {
                                        var174 = 0;
                                    }
                                    class137.field2549 = var174;
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6012) {
                                    if (class43.field680) {
                                        class83.method749(0, 0, 110);
                                    }
                                    var6--;
                                    class64.field1001 = class121.field2115[var6] == 1;
                                    if (class43.field680 && class64.field1001) {
                                        class62.method573(0.7F);
                                    } else {
                                        if (class32.field462 == 1) {
                                            class62.method573(0.9F);
                                        }
                                        if (class32.field462 == 2) {
                                            class62.method573(0.8F);
                                        }
                                        if (class32.field462 == 3) {
                                            class62.method573(0.7F);
                                        }
                                        if (class32.field462 == 4) {
                                            class62.method573(0.6F);
                                        }
                                    }
                                    class201.method1515((byte) -1);
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6014) {
                                    var6--;
                                    class285.field4521 = class121.field2115[var6] == 1;
                                    if (class43.field680) {
                                        class201.method1515((byte) -1);
                                    }
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6015) {
                                    var6--;
                                    class181.field3043 = class121.field2115[var6] == 1;
                                    if (class43.field680) {
                                        class351.method2446(92);
                                    }
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6016) {
                                    var6--;
                                    int var175 = class121.field2115[var6];
                                    if (class43.field680) {
                                        class175.field2985 = true;
                                    }
                                    if (var175 < 0 || var175 > 2) {
                                        var175 = 0;
                                    }
                                    class30.field440 = var175;
                                    continue;
                                }
                                if (var528 == 6017) {
                                    var6--;
                                    class57.field875 = class121.field2115[var6] == 1;
                                    class145.method1164((byte) -61);
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6018) {
                                    var6--;
                                    int var176 = class121.field2115[var6];
                                    if (var176 < 0) {
                                        var176 = 0;
                                    }
                                    if (var176 > 127) {
                                        var176 = 127;
                                    }
                                    class79.field1280 = var176;
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6019) {
                                    var6--;
                                    int var177 = class121.field2115[var6];
                                    if (var177 < 0) {
                                        var177 = 0;
                                    }
                                    if (var177 > 255) {
                                        var177 = 255;
                                    }
                                    if (class51.field796 != var177) {
                                        if (class51.field796 == 0 && class131.field2254 != -1) {
                                            class8.method47(class131.field2254, false, var177, -49, class179.field3030, 0);
                                            class185.field3137 = false;
                                        } else if (var177 == 0) {
                                            class101.method874(-1);
                                            class185.field3137 = false;
                                        } else {
                                            class67.method643(!arg0, var177);
                                        }
                                        class51.field796 = var177;
                                    }
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6020) {
                                    var6--;
                                    int var178 = class121.field2115[var6];
                                    if (var178 < 0) {
                                        var178 = 0;
                                    }
                                    if (var178 > 127) {
                                        var178 = 127;
                                    }
                                    class29.field393 = var178;
                                    class88.method774(arg0, class85.field1369);
                                    class257.field4149 = false;
                                    continue;
                                }
                                if (var528 == 6021) {
                                    var6--;
                                    class305.field4842 = class121.field2115[var6] == 1;
                                    class126.method1049(4892);
                                    continue;
                                }
                                if (var528 == 6023) {
                                    var6--;
                                    int var179 = class121.field2115[var6];
                                    if (var179 < 0) {
                                        var179 = 0;
                                    }
                                    boolean var180 = false;
                                    if (var179 > 2) {
                                        var179 = 2;
                                    }
                                    if (class28.field385 < 96) {
                                        var179 = 0;
                                        var180 = true;
                                    }
                                    class65.method617(var179);
                                    class88.method774(true, class85.field1369);
                                    class257.field4149 = false;
                                    class121.field2115[var6++] = var180 ? 0 : 1;
                                    continue;
                                }
                                if (var528 == 6024) {
                                    var6--;
                                    int var181 = class121.field2115[var6];
                                    if (var181 < 0 || var181 > 2) {
                                        var181 = 0;
                                    }
                                    class227.field3822 = var181;
                                    class88.method774(arg0, class85.field1369);
                                    continue;
                                }
                                if (var528 == 6027) {
                                    var6--;
                                    int var182 = class121.field2115[var6];
                                    if (!class43.field680) {
                                        continue;
                                    }
                                    if (var182 < 0 || var182 > 1) {
                                        var182 = 0;
                                    }
                                    class212.method1570(var182 == 1, false);
                                    continue;
                                }
                                if (var528 == 6028) {
                                    var6--;
                                    class330.field5250 = class121.field2115[var6] != 0;
                                    class88.method774(arg0, class85.field1369);
                                    continue;
                                }
                            } else if (var528 < 6200) {
                                if (var528 == 6101) {
                                    class121.field2115[var6++] = class32.field462;
                                    continue;
                                }
                                if (var528 == 6102) {
                                    class121.field2115[var6++] = class56.method499(58) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6103) {
                                    class121.field2115[var6++] = class129.field2225 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6105) {
                                    class121.field2115[var6++] = class48.field735 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6106) {
                                    class121.field2115[var6++] = class328.field5216 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6107) {
                                    class121.field2115[var6++] = class291.field4666 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6108) {
                                    class121.field2115[var6++] = class249.field4036 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6109) {
                                    class121.field2115[var6++] = class95.field1487 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6110) {
                                    class121.field2115[var6++] = class195.field3276 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6111) {
                                    class121.field2115[var6++] = class137.field2549;
                                    continue;
                                }
                                if (var528 == 6112) {
                                    class121.field2115[var6++] = class64.field1001 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6114) {
                                    class121.field2115[var6++] = class285.field4521 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6115) {
                                    class121.field2115[var6++] = class181.field3043 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6116) {
                                    class121.field2115[var6++] = class30.field440;
                                    continue;
                                }
                                if (var528 == 6117) {
                                    class121.field2115[var6++] = class57.field875 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6118) {
                                    class121.field2115[var6++] = class79.field1280;
                                    continue;
                                }
                                if (var528 == 6119) {
                                    class121.field2115[var6++] = class51.field796;
                                    continue;
                                }
                                if (var528 == 6120) {
                                    class121.field2115[var6++] = class29.field393;
                                    continue;
                                }
                                if (var528 == 6121) {
                                    if (class43.field680) {
                                        class121.field2115[var6++] = class43.field676 ? 1 : 0;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6123) {
                                    class121.field2115[var6++] = class65.method622();
                                    continue;
                                }
                                if (var528 == 6124) {
                                    class121.field2115[var6++] = class227.field3822;
                                    continue;
                                }
                                if (var528 == 6126) {
                                    if (class43.field680) {
                                        class121.field2115[var6++] = class16.method162() ? 1 : 0;
                                    } else {
                                        class121.field2115[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var528 == 6127) {
                                    class121.field2115[var6++] = class246.field3990 ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6128) {
                                    class121.field2115[var6++] = class330.field5250 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6300) {
                                if (var528 == 6200) {
                                    var6 -= 2;
                                    class195.field3266 = (short) class121.field2115[var6];
                                    if (class195.field3266 <= 0) {
                                        class195.field3266 = 256;
                                    }
                                    class21.field319 = (short) class121.field2115[var6 + 1];
                                    if (class21.field319 <= 0) {
                                        class21.field319 = 205;
                                    }
                                    continue;
                                }
                                if (var528 == 6201) {
                                    var6 -= 2;
                                    class295.field4712 = (short) class121.field2115[var6];
                                    if (class295.field4712 <= 0) {
                                        class295.field4712 = 256;
                                    }
                                    class113.field1892 = (short) class121.field2115[var6 + 1];
                                    if (class113.field1892 <= 0) {
                                        class113.field1892 = 320;
                                    }
                                    continue;
                                }
                                if (var528 == 6202) {
                                    var6 -= 4;
                                    class288.field4599 = (short) class121.field2115[var6];
                                    if (class288.field4599 <= 0) {
                                        class288.field4599 = 1;
                                    }
                                    class321.field5099 = (short) class121.field2115[var6 + 1];
                                    if (class321.field5099 <= 0) {
                                        class321.field5099 = 32767;
                                    } else if (class321.field5099 < class288.field4599) {
                                        class321.field5099 = class288.field4599;
                                    }
                                    class105.field1754 = (short) class121.field2115[var6 + 2];
                                    if (class105.field1754 <= 0) {
                                        class105.field1754 = 1;
                                    }
                                    class179.field3036 = (short) class121.field2115[var6 + 3];
                                    if (class179.field3036 <= 0) {
                                        class179.field3036 = 32767;
                                    } else if (class179.field3036 < class105.field1754) {
                                        class179.field3036 = class105.field1754;
                                    }
                                    continue;
                                }
                                if (var528 == 6203) {
                                    class249.method1747(false, class285.field4524.field2533, 0, class285.field4524.field2515, 0, (byte) -38);
                                    class121.field2115[var6++] = class195.field3274;
                                    class121.field2115[var6++] = class125.field2156;
                                    continue;
                                }
                                if (var528 == 6204) {
                                    class121.field2115[var6++] = class295.field4712;
                                    class121.field2115[var6++] = class113.field1892;
                                    continue;
                                }
                                if (var528 == 6205) {
                                    class121.field2115[var6++] = class195.field3266;
                                    class121.field2115[var6++] = class21.field319;
                                    continue;
                                }
                            } else if (var528 < 6400) {
                                if (var528 == 6300) {
                                    class121.field2115[var6++] = (int) (class306.method2102(-289) / 60000L);
                                    continue;
                                }
                                if (var528 == 6301) {
                                    class121.field2115[var6++] = (int) (class306.method2102(-289) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6302) {
                                    var6 -= 3;
                                    int var156 = class121.field2115[var6 + 2];
                                    int var157 = class121.field2115[var6 + 1];
                                    int var158 = class121.field2115[var6];
                                    class193.field3233.clear();
                                    class193.field3233.set(11, 12);
                                    class193.field3233.set(var156, var157, var158);
                                    class121.field2115[var6++] = (int) (class193.field3233.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var528 == 6303) {
                                    class193.field3233.clear();
                                    class193.field3233.setTime(new Date(class306.method2102(-289)));
                                    class121.field2115[var6++] = class193.field3233.get(1);
                                    continue;
                                }
                                if (var528 == 6304) {
                                    var6--;
                                    int var159 = class121.field2115[var6];
                                    boolean var160 = true;
                                    if (var159 < 0) {
                                        var160 = ((var159 + 1) % 4) == 0;
                                    } else if (var159 < 1582) {
                                        var160 = var159 % 4 == 0;
                                    } else if (var159 % 4 != 0) {
                                        var160 = false;
                                    } else if (var159 % 100 != 0) {
                                        var160 = true;
                                    } else if (var159 % 400 != 0) {
                                        var160 = false;
                                    }
                                    class121.field2115[var6++] = var160 ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6500) {
                                if (var528 == 6405) {
                                    class121.field2115[var6++] = class280.method1915((byte) -86) ? 1 : 0;
                                    continue;
                                }
                                if (var528 == 6406) {
                                    class121.field2115[var6++] = class303.method2087(105) ? 1 : 0;
                                    continue;
                                }
                            } else if (var528 < 6600) {
                                if (var528 == 6500) {
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0) {
                                        class121.field2115[var6++] = class97.method837(true) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class121.field2115[var6++] = 1;
                                    continue;
                                }
                                if (var528 == 6501) {
                                    class20 var161 = class334.method2311(3963);
                                    if (var161 == null) {
                                        class121.field2115[var6++] = -1;
                                        class121.field2115[var6++] = 0;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var161.field306;
                                        class121.field2115[var6++] = var161.field5230;
                                        class255.field4111[var8++] = var161.field308;
                                        class37 var162 = var161.method198((byte) -34);
                                        class121.field2115[var6++] = var162.field540;
                                        class255.field4111[var8++] = var162.field538;
                                        class121.field2115[var6++] = var161.field5234;
                                    }
                                    continue;
                                }
                                if (var528 == 6502) {
                                    class20 var163 = class191.method1448(true);
                                    if (var163 == null) {
                                        class121.field2115[var6++] = -1;
                                        class121.field2115[var6++] = 0;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var163.field306;
                                        class121.field2115[var6++] = var163.field5230;
                                        class255.field4111[var8++] = var163.field308;
                                        class37 var164 = var163.method198((byte) -34);
                                        class121.field2115[var6++] = var164.field540;
                                        class255.field4111[var8++] = var164.field538;
                                        class121.field2115[var6++] = var163.field5234;
                                    }
                                    continue;
                                }
                                if (var528 == 6503) {
                                    var6--;
                                    int var165 = class121.field2115[var6];
                                    if (class88.field1397 == 10 && class30.field445 == 0 && class126.field2168 == 0 && class69.field1127 == 0) {
                                        class121.field2115[var6++] = class128.method1070(-125, var165) ? 1 : 0;
                                        continue;
                                    }
                                    class121.field2115[var6++] = 0;
                                    continue;
                                }
                                if (var528 == 6504) {
                                    var6--;
                                    class221.field3696 = class121.field2115[var6];
                                    class88.method774(true, class85.field1369);
                                    continue;
                                }
                                if (var528 == 6505) {
                                    class121.field2115[var6++] = class221.field3696;
                                    continue;
                                }
                                if (var528 == 6506) {
                                    var6--;
                                    int var166 = class121.field2115[var6];
                                    class20 var167 = class18.method186(2, var166);
                                    if (var167 == null) {
                                        class121.field2115[var6++] = -1;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                        class255.field4111[var8++] = "";
                                        class121.field2115[var6++] = 0;
                                    } else {
                                        class121.field2115[var6++] = var167.field5230;
                                        class255.field4111[var8++] = var167.field308;
                                        class37 var168 = var167.method198((byte) -34);
                                        class121.field2115[var6++] = var168.field540;
                                        class255.field4111[var8++] = var168.field538;
                                        class121.field2115[var6++] = var167.field5234;
                                    }
                                    continue;
                                }
                                if (var528 == 6507) {
                                    var6 -= 4;
                                    int var169 = class121.field2115[var6 + 2];
                                    boolean var170 = class121.field2115[var6 + 1] == 1;
                                    int var171 = class121.field2115[var6];
                                    boolean var172 = class121.field2115[var6 + 3] == 1;
                                    class128.method1066((byte) 17, var171, var169, var170, var172);
                                    continue;
                                }
                            } else if (var528 < 6700) {
                                if (var528 == 6600) {
                                    var6--;
                                    class38.field572 = class121.field2115[var6] == 1;
                                    class88.method774(arg0, class85.field1369);
                                    continue;
                                }
                                if (var528 == 6601) {
                                    class121.field2115[var6++] = class38.field572 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var528 == 4400) {
                            var6 -= 2;
                            int var277 = class121.field2115[var6 + 1];
                            int var278 = class121.field2115[var6];
                            class53 var279 = class223.method1631(var277, 11);
                            if (var279.method481(true)) {
                                class255.field4111[var8++] = class92.method798((byte) 104, var278).method835((byte) 125, var279.field826, var277);
                            } else {
                                class121.field2115[var6++] = class92.method798((byte) 104, var278).method831(var279.field832, var277, !arg0);
                            }
                            continue;
                        }
                    } else {
                        class137 var502;
                        if (var528 < 2000) {
                            var502 = var46 ? class108.field1846 : class256.field4118;
                        } else {
                            var528 -= 1000;
                            var6--;
                            var502 = class146.method1167(1169843632, class121.field2115[var6]);
                        }
                        if (var528 == 1300) {
                            var6--;
                            int var503 = class121.field2115[var6] - 1;
                            if (var503 >= 0 && var503 <= 9) {
                                var8--;
                                var502.method1124(0, class255.field4111[var8], var503);
                                continue;
                            }
                            var8--;
                            continue;
                        }
                        if (var528 == 1301) {
                            var6 -= 2;
                            int var504 = class121.field2115[var6];
                            int var505 = class121.field2115[var6 + 1];
                            var502.field2388 = class60.method557(var504, 97, var505);
                            continue;
                        }
                        if (var528 == 1302) {
                            var6--;
                            var502.field2416 = class121.field2115[var6] == 1;
                            continue;
                        }
                        if (var528 == 1303) {
                            var6--;
                            var502.field2374 = class121.field2115[var6];
                            continue;
                        }
                        if (var528 == 1304) {
                            var6--;
                            var502.field2504 = class121.field2115[var6];
                            continue;
                        }
                        if (var528 == 1305) {
                            var8--;
                            var502.field2492 = class255.field4111[var8];
                            continue;
                        }
                        if (var528 == 1306) {
                            var8--;
                            var502.field2460 = class255.field4111[var8];
                            continue;
                        }
                        if (var528 == 1307) {
                            var502.field2458 = null;
                            continue;
                        }
                        if (var528 == 1308) {
                            var6--;
                            var502.field2397 = class121.field2115[var6];
                            var6--;
                            var502.field2464 = class121.field2115[var6];
                            continue;
                        }
                        if (var528 == 1309) {
                            var6--;
                            int var506 = class121.field2115[var6];
                            var6--;
                            int var507 = class121.field2115[var6];
                            if (var507 >= 1 && var507 <= 10) {
                                var502.method1128(var506, var507 - 1, (byte) 0);
                            }
                            continue;
                        }
                        if (var528 == 1310) {
                            var8--;
                            var502.field2449 = class255.field4111[var8];
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var527) {
            if (var5.field1387 == null) {
                if (class246.field3988 != 0) {
                    class170.method1339(0, "Clientscript error - check log for details", "", (byte) -98);
                }
                class88.method775(var527, "CS2 - scr:" + var5.field5062 + " op:" + var11, true);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field1387);
                for (int var525 = class202.field3442 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class353.field5579[var525].field3024.field1387);
                }
                if (var11 == 40) {
                    int var526 = var10[var7];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class246.field3988 != 0) {
                    class170.method1339(0, "Clientscript error in: " + var5.field1387, "", (byte) -98);
                }
                class88.method775(var527, "CS2 - scr:" + var5.field5062 + " op:" + var11 + var524.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([III)Lri;", line = 6586)
    public final class76 method705(int[] arg0, int arg1, int arg2) {
        field1251++;
        if (this.field1240.method453(24190) == 1) {
            return this.method708(0, arg2, false, arg0);
        }
        if (arg1 != 15853) {
            field1249 = -35;
        }
        if (this.field1240.method455(arg2, true) != 1) {
            throw new RuntimeException();
        }
        return this.method708(arg2, 0, false, arg0);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[B)Z", line = 6610)
    public static final boolean method706(int arg0, byte[] arg1) {
        field1244++;
        class336 var2 = new class336(arg1);
        if (arg0 != 11) {
            method703(-123, -55, -119, 61, -127, -104, -127, 6);
        }
        int var3 = var2.method2364(-9069);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2364(arg0 - 9080) == 1;
        if (var4) {
            class290.method1985(var2, -1);
        }
        class30.method284(-28936, var2);
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 6656)
    public static final void method707(byte arg0) {
        field1250++;
        class304.field4811.method470(12);
        if (arg0 <= 116) {
            field1249 = 84;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lcg;Lcg;)V", line = 6752)
    public class77(class49 arg0, class49 arg1) {
        this.field1240 = arg1;
        this.field1246 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ[I)Lri;", line = 6674)
    private final class76 method708(int arg0, int arg1, boolean arg2, int[] arg3) {
        field1248++;
        int var5 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4);
        int var6 = var5 | arg0 << 16;
        if (arg2) {
            this.field1245 = (class79) null;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class76 var9 = (class76) this.field1252.method732(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class63 var10 = (class63) this.field1245.method732(var7, true);
            if (var10 == null) {
                var10 = class63.method594(this.field1240, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1245.method725(var7, var10, 1);
            }
            class76 var11 = var10.method596(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2195(-1);
                this.field1252.method725(var7, var11, 1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([IIII)Lri;", line = 6721)
    private final class76 method709(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 124 / ((-arg3 - 20) / 62);
        field1253++;
        int var6 = arg2 ^ (arg1 << 4 & 0xFFF4 | arg1 >>> 12);
        int var7 = var6 | arg1 << 16;
        long var8 = (long) var7;
        class76 var10 = (class76) this.field1252.method732(var8, true);
        if (var10 != null) {
            return var10;
        } else if (arg0 == null || arg0[0] > 0) {
            class22 var11 = class22.method220(this.field1246, arg1, arg2);
            if (var11 == null) {
                return null;
            }
            class76 var12 = var11.method223();
            this.field1252.method725(var8, var12, 1);
            if (arg0 != null) {
                arg0[0] -= var12.field1237.length;
            }
            return var12;
        } else {
            return null;
        }
    }
}
