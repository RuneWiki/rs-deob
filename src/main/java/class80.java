import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[Lkc;")
    public volatile class72[] field1853 = new class72[2];

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Z")
    public volatile boolean field1847 = false;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Z")
    public volatile boolean field1858 = false;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[Laf;")
    public static class7[] field1849 = new class7[100];

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1846 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Loc;")
    public class100 field1859;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[I")
    public static int[] field1851;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static final void method674(int arg0) {
        field1861++;
        if (arg0 != 0) {
            method676(null, 104, 54, 72);
        }
        for (class96 var1 = (class96) class39.field980.method758(255); var1 != null; var1 = (class96) class39.field980.method766(-69)) {
            if (var1.field2296 != null) {
                class144.field3402.method2(var1.field2296);
                var1.field2296 = null;
            }
            if (var1.field2275 != null) {
                class144.field3402.method2(var1.field2275);
                var1.field2275 = null;
            }
        }
        class39.field980.method762(100);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILfc;)V")
    public static final void method675(int arg0, class39 arg1) {
        field1855++;
        Object[] var2 = arg1.field962;
        int var3 = (Integer) var2[0];
        class11 var4 = class122.method961(arg0 + 1989, var3);
        if (var4 == null) {
            return;
        }
        class101.field2384 = 0;
        int var5 = 0;
        int var6 = 0;
        if (arg0 != -2001) {
            return;
        }
        int[] var7 = var4.field280;
        byte var8 = -1;
        int[] var9 = var4.field291;
        int var10 = -1;
        try {
            class86.field2003 = new int[var4.field283];
            class38.field960 = new class7[var4.field289];
            int var11 = 0;
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var15 = (Integer) var2[var13];
                    if (var15 == -2147483647) {
                        var15 = arg1.field972;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field964;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field967 == null ? -1 : arg1.field967.field2442;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field981;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field967 == null ? -1 : arg1.field967.field2445;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field963 == null ? -1 : arg1.field963.field2442;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field963 == null ? -1 : arg1.field963.field2445;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field978;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field982;
                    }
                    class86.field2003[var11++] = var15;
                } else if (var2[var13] instanceof class7) {
                    class7 var14 = (class7) var2[var13];
                    if (var14.method76(4, class21.field548)) {
                        var14 = arg1.field975;
                    }
                    class38.field960[var12++] = var14;
                }
            }
            int var16 = 0;
            label1936: while (true) {
                var16++;
                if (var16 > 200000) {
                    throw new RuntimeException("slow");
                }
                var10++;
                int var269 = var9[var10];
                if (var269 < 100) {
                    if (var269 == 0) {
                        class152.field3561[var6++] = var7[var10];
                        continue;
                    }
                    if (var269 == 1) {
                        int var17 = var7[var10];
                        class152.field3561[var6++] = class43.field1026[var17];
                        continue;
                    }
                    if (var269 == 2) {
                        int var18 = var7[var10];
                        var6--;
                        class43.field1026[var18] = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 3) {
                        class79.field1841[var5++] = var4.field292[var10];
                        continue;
                    }
                    if (var269 == 6) {
                        var10 += var7[var10];
                        continue;
                    }
                    if (var269 == 7) {
                        var6 -= 2;
                        if (class152.field3561[var6 + 1] != class152.field3561[var6]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 8) {
                        var6 -= 2;
                        if (class152.field3561[var6 + 1] == class152.field3561[var6]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 9) {
                        var6 -= 2;
                        if (class152.field3561[var6 + 1] > class152.field3561[var6]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 10) {
                        var6 -= 2;
                        if (class152.field3561[var6] > class152.field3561[var6 + 1]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 21) {
                        if (class101.field2384 == 0) {
                            return;
                        }
                        class116 var19 = class19.field498[--class101.field2384];
                        class38.field960 = var19.field2766;
                        var10 = var19.field2773;
                        var4 = var19.field2756;
                        var9 = var4.field291;
                        var7 = var4.field280;
                        class86.field2003 = var19.field2753;
                        continue;
                    }
                    if (var269 == 25) {
                        int var20 = var7[var10];
                        class152.field3561[var6++] = class109.method870((byte) 117, var20);
                        continue;
                    }
                    if (var269 == 27) {
                        int var21 = var7[var10];
                        var6--;
                        class131.method1074(var21, class152.field3561[var6], -107);
                        continue;
                    }
                    if (var269 == 31) {
                        var6 -= 2;
                        if (class152.field3561[var6] <= class152.field3561[var6 + 1]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 32) {
                        var6 -= 2;
                        if (class152.field3561[var6 + 1] <= class152.field3561[var6]) {
                            var10 += var7[var10];
                        }
                        continue;
                    }
                    if (var269 == 33) {
                        class152.field3561[var6++] = class86.field2003[var7[var10]];
                        continue;
                    }
                    int var10001;
                    if (var269 == 34) {
                        var10001 = var7[var10];
                        var6--;
                        class86.field2003[var10001] = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 35) {
                        class79.field1841[var5++] = class38.field960[var7[var10]];
                        continue;
                    }
                    if (var269 == 36) {
                        var10001 = var7[var10];
                        var5--;
                        class38.field960[var10001] = class79.field1841[var5];
                        continue;
                    }
                    if (var269 == 37) {
                        int var22 = var7[var10];
                        var5 -= var22;
                        class7 var23 = class68.method546(class79.field1841, var22, var5, 48);
                        class79.field1841[var5++] = var23;
                        continue;
                    }
                    if (var269 == 38) {
                        var6--;
                        continue;
                    }
                    if (var269 == 39) {
                        var5--;
                        continue;
                    }
                    if (var269 == 40) {
                        int var24 = var7[var10];
                        class11 var25 = class122.method961(-12, var24);
                        int[] var26 = new int[var25.field283];
                        class7[] var27 = new class7[var25.field289];
                        for (int var28 = 0; var28 < var25.field287; var28++) {
                            var26[var28] = class152.field3561[var28 + var6 - var25.field287];
                        }
                        for (int var29 = 0; var29 < var25.field281; var29++) {
                            var27[var29] = class79.field1841[var5 + var29 - var25.field281];
                        }
                        var5 -= var25.field281;
                        var6 -= var25.field287;
                        class116 var30 = new class116();
                        var30.field2753 = class86.field2003;
                        var30.field2756 = var4;
                        var4 = var25;
                        var30.field2773 = var10;
                        var30.field2766 = class38.field960;
                        class19.field498[class101.field2384++] = var30;
                        var9 = var25.field291;
                        class86.field2003 = var26;
                        var10 = -1;
                        class38.field960 = var27;
                        var7 = var25.field280;
                        continue;
                    }
                    if (var269 == 42) {
                        class152.field3561[var6++] = class149.field3514[var7[var10]];
                        continue;
                    }
                    if (var269 == 43) {
                        var10001 = var7[var10];
                        var6--;
                        class149.field3514[var10001] = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 44) {
                        int var31 = var7[var10] >> 16;
                        int var32 = var7[var10] & 0xFFFF;
                        var6--;
                        int var33 = class152.field3561[var6];
                        if (var33 >= 0 && var33 <= 5000) {
                            class116.field2762[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label1936;
                                }
                                class51.field1210[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 45) {
                        int var36 = var7[var10];
                        var6--;
                        int var37 = class152.field3561[var6];
                        if (var37 >= 0 && class116.field2762[var36] > var37) {
                            class152.field3561[var6++] = class51.field1210[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 46) {
                        var6 -= 2;
                        int var38 = var7[var10];
                        int var39 = class152.field3561[var6];
                        if (var39 >= 0 && class116.field2762[var38] > var39) {
                            class51.field1210[var38][var39] = class152.field3561[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var269 == 47) {
                        class7 var40 = class151.field3546[var7[var10]];
                        if (var40 == null) {
                            var40 = class23.field629;
                        }
                        class79.field1841[var5++] = var40;
                        continue;
                    }
                    if (var269 == 48) {
                        var10001 = var7[var10];
                        var5--;
                        class151.field3546[var10001] = class79.field1841[var5];
                        continue;
                    }
                }
                boolean var41;
                if (var7[var10] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var269 < 1000) {
                    if (var269 == 100) {
                        var6 -= 3;
                        int var251 = class152.field3561[var6];
                        int var252 = class152.field3561[var6 + 1];
                        int var253 = class152.field3561[var6 + 2];
                        if (var252 == 0) {
                            throw new RuntimeException();
                        }
                        class103 var254 = class37.method328(0, var251);
                        if (var254.field2433 == null) {
                            var254.field2433 = new class103[var253 + 1];
                        }
                        if (var254.field2433.length <= var253) {
                            class103[] var255 = new class103[var253 + 1];
                            for (int var256 = 0; var256 < var254.field2433.length; var256++) {
                                var255[var256] = var254.field2433[var256];
                            }
                            var254.field2433 = var255;
                        }
                        if (var253 > 0 && var254.field2433[var253 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var253 - 1));
                        }
                        class103 var257 = new class103();
                        var257.field2565 = true;
                        var257.field2445 = var253;
                        var257.field2516 = var257.field2442 = var254.field2442;
                        var257.field2483 = var252;
                        var254.field2433[var253] = var257;
                        if (var41) {
                            class58.field1382 = var257;
                        } else {
                            class133.field3124 = var257;
                        }
                        class141.method1151(15569, var254);
                        continue;
                    }
                    if (var269 == 101) {
                        class103 var258 = var41 ? class58.field1382 : class133.field3124;
                        class103 var259 = class37.method328(arg0 ^ 0xFFFFF82F, var258.field2442);
                        var259.field2433[var258.field2445] = null;
                        class141.method1151(15569, var259);
                        continue;
                    }
                    if (var269 == 102) {
                        var6--;
                        class103 var260 = class37.method328(0, class152.field3561[var6]);
                        var260.field2433 = null;
                        class141.method1151(15569, var260);
                        continue;
                    }
                    if (var269 == 200) {
                        var6 -= 2;
                        int var261 = class152.field3561[var6 + 1];
                        int var262 = class152.field3561[var6];
                        class103 var263 = class19.method177(var262, (byte) -80, var261);
                        if (var263 != null && var261 != -1) {
                            class152.field3561[var6++] = 1;
                            if (var41) {
                                class58.field1382 = var263;
                            } else {
                                class133.field3124 = var263;
                            }
                            continue;
                        }
                        class152.field3561[var6++] = 0;
                        continue;
                    }
                } else if (var269 >= 1000 && var269 < 1100 || !(var269 < 2000 || var269 >= 2100)) {
                    class103 var42;
                    if (var269 >= 2000) {
                        var269 -= 1000;
                        var6--;
                        var42 = class37.method328(0, class152.field3561[var6]);
                    } else {
                        var42 = var41 ? class58.field1382 : class133.field3124;
                    }
                    if (var269 == 1000) {
                        var6 -= 2;
                        var42.field2497 = class152.field3561[var6];
                        var42.field2473 = class152.field3561[var6 + 1];
                        class141.method1151(15569, var42);
                        continue;
                    }
                    if (var269 == 1001) {
                        var6 -= 2;
                        var42.field2550 = class152.field3561[var6];
                        var42.field2517 = class152.field3561[var6 + 1];
                        class141.method1151(15569, var42);
                        continue;
                    }
                    if (var269 == 1003) {
                        var6--;
                        boolean var43 = class152.field3561[var6] == 1;
                        if (var42.field2543 != var43) {
                            var42.field2543 = var43;
                            class141.method1151(15569, var42);
                        }
                        continue;
                    }
                } else if (var269 >= 1100 && var269 < 1200 || var269 >= 2100 && var269 < 2200) {
                    class103 var44;
                    if (var269 < 2000) {
                        var44 = var41 ? class58.field1382 : class133.field3124;
                    } else {
                        var6--;
                        var44 = class37.method328(0, class152.field3561[var6]);
                        var269 -= 1000;
                    }
                    if (var269 == 1100) {
                        var6 -= 2;
                        var44.field2437 = class152.field3561[var6];
                        if (var44.field2523 - var44.field2550 < var44.field2437) {
                            var44.field2437 = var44.field2523 - var44.field2550;
                        }
                        if (var44.field2437 < 0) {
                            var44.field2437 = 0;
                        }
                        var44.field2486 = class152.field3561[var6 + 1];
                        if (var44.field2482 - var44.field2517 < var44.field2486) {
                            var44.field2486 = var44.field2482 - var44.field2517;
                        }
                        if (var44.field2486 < 0) {
                            var44.field2486 = 0;
                        }
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1101) {
                        var6--;
                        var44.field2441 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1102) {
                        var6--;
                        var44.field2521 = class152.field3561[var6] == 1;
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1103) {
                        var6--;
                        var44.field2446 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1104) {
                        var6--;
                        var44.field2520 = class152.field3561[var6];
                        class141.method1151(arg0 + 17570, var44);
                        continue;
                    }
                    if (var269 == 1105) {
                        var6--;
                        var44.field2489 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1106) {
                        var6--;
                        var44.field2524 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1107) {
                        var6--;
                        var44.field2487 = class152.field3561[var6] == 1;
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1108) {
                        var44.field2535 = 1;
                        var6--;
                        var44.field2563 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1109) {
                        var6 -= 6;
                        var44.field2522 = class152.field3561[var6];
                        var44.field2430 = class152.field3561[var6 + 1];
                        var44.field2431 = class152.field3561[var6 + 2];
                        var44.field2548 = class152.field3561[var6 + 3];
                        var44.field2498 = class152.field3561[var6 + 4];
                        var44.field2494 = class152.field3561[var6 + 5];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1110) {
                        var6--;
                        int var45 = class152.field3561[var6];
                        if (var44.field2564 != var45) {
                            var44.field2459 = 0;
                            var44.field2477 = 0;
                            var44.field2564 = var45;
                            class141.method1151(15569, var44);
                        }
                        continue;
                    }
                    if (var269 == 1111) {
                        var6--;
                        var44.field2492 = class152.field3561[var6] == 1;
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1112) {
                        var5--;
                        class7 var46 = class79.field1841[var5];
                        if (!var46.method76(-123, var44.field2549)) {
                            var44.field2549 = var46;
                            class141.method1151(15569, var44);
                        }
                        continue;
                    }
                    if (var269 == 1113) {
                        var6--;
                        var44.field2462 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1114) {
                        var6 -= 3;
                        var44.field2507 = class152.field3561[var6];
                        var44.field2547 = class152.field3561[var6 + 1];
                        var44.field2478 = class152.field3561[var6 + 2];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1115) {
                        var6--;
                        var44.field2537 = class152.field3561[var6] == 1;
                        class141.method1151(arg0 ^ 0xFFFFC4FE, var44);
                        continue;
                    }
                    if (var269 == 1116) {
                        var6--;
                        var44.field2463 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1117) {
                        var6--;
                        var44.field2499 = class152.field3561[var6];
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1118) {
                        var6--;
                        var44.field2528 = class152.field3561[var6] == 1;
                        class141.method1151(arg0 + 17570, var44);
                        continue;
                    }
                    if (var269 == 1119) {
                        var6--;
                        var44.field2525 = class152.field3561[var6] == 1;
                        class141.method1151(15569, var44);
                        continue;
                    }
                    if (var269 == 1120) {
                        var6 -= 2;
                        var44.field2523 = class152.field3561[var6];
                        var44.field2482 = class152.field3561[var6 + 1];
                        class141.method1151(15569, var44);
                        continue;
                    }
                } else if (var269 >= 1200 && var269 < 1300 || var269 >= 2200 && var269 < 2300) {
                    class103 var47;
                    if (var269 >= 2000) {
                        var269 -= 1000;
                        var6--;
                        var47 = class37.method328(0, class152.field3561[var6]);
                    } else {
                        var47 = var41 ? class58.field1382 : class133.field3124;
                    }
                    class141.method1151(arg0 + 17570, var47);
                    if (var269 == 1200) {
                        var6 -= 2;
                        int var48 = class152.field3561[var6 + 1];
                        int var49 = class152.field3561[var6];
                        var47.field2464 = var49;
                        var47.field2461 = var48;
                        class135 var50 = class64.method526(false, var49);
                        var47.field2522 = var50.field3217;
                        var47.field2548 = var50.field3215;
                        var47.field2498 = var50.field3201;
                        var47.field2494 = var50.field3184;
                        if (var47.field2550 > 0) {
                            var47.field2494 = var47.field2494 * 32 / var47.field2550;
                        }
                        var47.field2431 = var50.field3207;
                        var47.field2430 = var50.field3185;
                        continue;
                    }
                    if (var269 == 1201) {
                        var47.field2535 = 2;
                        var6--;
                        var47.field2563 = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 1202) {
                        var47.field2535 = 3;
                        var47.field2563 = class21.field531.field2118.method1113(106);
                        continue;
                    }
                } else if ((var269 < 1300 || var269 >= 1400) && (var269 < 2300 || var269 >= 2400)) {
                    if (var269 >= 1400 && var269 < 1500 || var269 >= 2400 && var269 < 2500) {
                        class103 var244;
                        if (var269 < 2000) {
                            var244 = var41 ? class58.field1382 : class133.field3124;
                        } else {
                            var6--;
                            var244 = class37.method328(0, class152.field3561[var6]);
                            var269 -= 1000;
                        }
                        var5--;
                        class7 var245 = class79.field1841[var5];
                        int[] var246 = null;
                        if (var245.method92(-128) > 0 && var245.method79(var245.method92(-106) - 1, arg0 ^ 0xFFFFF82F) == 89) {
                            var6--;
                            int var247 = class152.field3561[var6];
                            if (var247 > 0) {
                                var246 = new int[var247];
                                while (var247-- > 0) {
                                    var6--;
                                    var246[var247] = class152.field3561[var6];
                                }
                            }
                            var245 = var245.method77(0, 84, var245.method92(49) - 1);
                        }
                        Object[] var248 = new Object[var245.method92(-111) + 1];
                        for (int var249 = var248.length - 1; var249 >= 1; var249--) {
                            if (var245.method79(var249 - 1, 0) == 115) {
                                var5--;
                                var248[var249] = class79.field1841[var5];
                            } else {
                                var6--;
                                var248[var249] = Integer.valueOf(class152.field3561[var6]);
                            }
                        }
                        var6--;
                        int var250 = class152.field3561[var6];
                        if (var250 == -1) {
                            var248 = null;
                        } else {
                            var248[0] = Integer.valueOf(var250);
                        }
                        if (var269 == 1409) {
                            var244.field2531 = var248;
                        }
                        if (var269 == 1423) {
                            class23.field637 = false;
                            var244.field2546 = var248;
                        }
                        if (var269 == 1412) {
                            var244.field2496 = var248;
                        }
                        if (var269 == 1402) {
                            var244.field2534 = var248;
                        }
                        if (var269 == 1407) {
                            var244.field2474 = var248;
                            var244.field2467 = var246;
                        }
                        if (var269 == 1408) {
                            var244.field2432 = var248;
                        }
                        if (var269 == 1421) {
                            var244.field2485 = var248;
                        }
                        if (var269 == 1401) {
                            var244.field2502 = var248;
                        }
                        if (var269 == 1414) {
                            var244.field2452 = var246;
                            var244.field2513 = var248;
                        }
                        if (var269 == 1418) {
                            var244.field2536 = var248;
                        }
                        if (var269 == 1415) {
                            var244.field2453 = var248;
                            var244.field2533 = var246;
                        }
                        if (var269 == 1406) {
                            var244.field2539 = var248;
                        }
                        if (var269 == 1419) {
                            var244.field2479 = var248;
                        }
                        if (var269 == 1405) {
                            var244.field2530 = var248;
                        }
                        if (var269 == 1416) {
                            var244.field2532 = var248;
                        }
                        if (var269 == 1420) {
                            var244.field2544 = var248;
                        }
                        if (var269 == 1411) {
                            var244.field2476 = var248;
                        }
                        var244.field2480 = true;
                        if (var269 == 1403) {
                            var244.field2529 = var248;
                        }
                        if (var269 == 1400) {
                            var244.field2542 = var248;
                        }
                        if (var269 == 1422) {
                            var244.field2545 = var248;
                        }
                        if (var269 == 1417) {
                            var244.field2469 = var248;
                        }
                        if (var269 == 1410) {
                            var244.field2448 = var248;
                        }
                        if (var269 == 1404) {
                            var244.field2456 = var248;
                        }
                        continue;
                    }
                    if (var269 < 1600) {
                        class103 var55 = var41 ? class58.field1382 : class133.field3124;
                        if (var269 == 1500) {
                            class152.field3561[var6++] = var55.field2497;
                            continue;
                        }
                        if (var269 == 1501) {
                            class152.field3561[var6++] = var55.field2473;
                            continue;
                        }
                        if (var269 == 1502) {
                            class152.field3561[var6++] = var55.field2550;
                            continue;
                        }
                        if (var269 == 1503) {
                            class152.field3561[var6++] = var55.field2517;
                            continue;
                        }
                        if (var269 == 1504) {
                            class152.field3561[var6++] = var55.field2543 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 1505) {
                            class152.field3561[var6++] = var55.field2516;
                            continue;
                        }
                    } else if (var269 < 1700) {
                        class103 var56 = var41 ? class58.field1382 : class133.field3124;
                        if (var269 == 1600) {
                            class152.field3561[var6++] = var56.field2437;
                            continue;
                        }
                        if (var269 == 1601) {
                            class152.field3561[var6++] = var56.field2486;
                            continue;
                        }
                        if (var269 == 1602) {
                            class79.field1841[var5++] = var56.field2549;
                            continue;
                        }
                        if (var269 == 1603) {
                            class152.field3561[var6++] = var56.field2523;
                            continue;
                        }
                        if (var269 == 1604) {
                            class152.field3561[var6++] = var56.field2482;
                            continue;
                        }
                        if (var269 == 1605) {
                            class152.field3561[var6++] = var56.field2494;
                            continue;
                        }
                        if (var269 == 1606) {
                            class152.field3561[var6++] = var56.field2431;
                            continue;
                        }
                        if (var269 == 1607) {
                            class152.field3561[var6++] = var56.field2498;
                            continue;
                        }
                        if (var269 == 1608) {
                            class152.field3561[var6++] = var56.field2548;
                            continue;
                        }
                    } else if (var269 < 1800) {
                        class103 var243 = var41 ? class58.field1382 : class133.field3124;
                        if (var269 == 1700) {
                            class152.field3561[var6++] = var243.field2464;
                            continue;
                        }
                        if (var269 == 1701) {
                            if (var243.field2464 == -1) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = var243.field2461;
                            }
                            continue;
                        }
                        if (var269 == 1702) {
                            class152.field3561[var6++] = var243.field2445;
                            continue;
                        }
                    } else if (var269 < 1900) {
                        class103 var241 = var41 ? class58.field1382 : class133.field3124;
                        if (var269 == 1800) {
                            class152.field3561[var6++] = class105.method853(class7.method98(26454, var241), -91);
                            continue;
                        }
                        if (var269 == 1801) {
                            var6--;
                            int var242 = class152.field3561[var6];
                            int var271 = var242 - 1;
                            if (var241.field2440 != null && var241.field2440.length > var271 && var241.field2440[var271] != null) {
                                class79.field1841[var5++] = var241.field2440[var271];
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 1802) {
                            if (var241.field2541 == null) {
                                class79.field1841[var5++] = class10.field272;
                            } else {
                                class79.field1841[var5++] = var241.field2541;
                            }
                            continue;
                        }
                    } else if (var269 < 2600) {
                        var6--;
                        class103 var57 = class37.method328(0, class152.field3561[var6]);
                        if (var269 == 2500) {
                            class152.field3561[var6++] = var57.field2497;
                            continue;
                        }
                        if (var269 == 2501) {
                            class152.field3561[var6++] = var57.field2473;
                            continue;
                        }
                        if (var269 == 2502) {
                            class152.field3561[var6++] = var57.field2550;
                            continue;
                        }
                        if (var269 == 2503) {
                            class152.field3561[var6++] = var57.field2517;
                            continue;
                        }
                        if (var269 == 2504) {
                            class152.field3561[var6++] = var57.field2543 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 2505) {
                            class152.field3561[var6++] = var57.field2516;
                            continue;
                        }
                    } else if (var269 < 2700) {
                        var6--;
                        class103 var58 = class37.method328(0, class152.field3561[var6]);
                        if (var269 == 2600) {
                            class152.field3561[var6++] = var58.field2437;
                            continue;
                        }
                        if (var269 == 2601) {
                            class152.field3561[var6++] = var58.field2486;
                            continue;
                        }
                        if (var269 == 2602) {
                            class79.field1841[var5++] = var58.field2549;
                            continue;
                        }
                        if (var269 == 2603) {
                            class152.field3561[var6++] = var58.field2523;
                            continue;
                        }
                        if (var269 == 2604) {
                            class152.field3561[var6++] = var58.field2482;
                            continue;
                        }
                        if (var269 == 2605) {
                            class152.field3561[var6++] = var58.field2494;
                            continue;
                        }
                        if (var269 == 2606) {
                            class152.field3561[var6++] = var58.field2431;
                            continue;
                        }
                        if (var269 == 2607) {
                            class152.field3561[var6++] = var58.field2498;
                            continue;
                        }
                        if (var269 == 2608) {
                            class152.field3561[var6++] = var58.field2548;
                            continue;
                        }
                    } else if (var269 < 2800) {
                        if (var269 == 2700) {
                            var6--;
                            class103 var59 = class37.method328(0, class152.field3561[var6]);
                            class152.field3561[var6++] = var59.field2464;
                            continue;
                        }
                        if (var269 == 2701) {
                            var6--;
                            class103 var60 = class37.method328(0, class152.field3561[var6]);
                            if (var60.field2464 == -1) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = var60.field2461;
                            }
                            continue;
                        }
                        if (var269 == 2702) {
                            var6--;
                            int var61 = class152.field3561[var6];
                            class28 var62 = (class28) class75.field1748.method126((long) var61, (byte) 65);
                            if (var62 == null) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = 1;
                            }
                            continue;
                        }
                    } else if (var269 < 2900) {
                        var6--;
                        class103 var239 = class37.method328(0, class152.field3561[var6]);
                        if (var269 == 2800) {
                            class152.field3561[var6++] = class105.method853(class7.method98(arg0 + 28455, var239), -99);
                            continue;
                        }
                        if (var269 == 2801) {
                            var6--;
                            int var240 = class152.field3561[var6];
                            int var270 = var240 - 1;
                            if (var239.field2440 != null && var270 < var239.field2440.length && var239.field2440[var270] != null) {
                                class79.field1841[var5++] = var239.field2440[var270];
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 2802) {
                            if (var239.field2541 == null) {
                                class79.field1841[var5++] = class10.field272;
                            } else {
                                class79.field1841[var5++] = var239.field2541;
                            }
                            continue;
                        }
                    } else if (var269 < 3200) {
                        if (var269 == 3100) {
                            var5--;
                            class7 var63 = class79.field1841[var5];
                            class53.method432(var63, 0, class10.field272, -8);
                            continue;
                        }
                        if (var269 == 3101) {
                            var6 -= 2;
                            class97.method795((byte) 58, class21.field531, class152.field3561[var6 + 1], class152.field3561[var6]);
                            continue;
                        }
                        if (var269 == 3102) {
                            var6--;
                            continue;
                        }
                        if (var269 == 3103) {
                            class4.method26((byte) -67);
                            continue;
                        }
                        if (var269 == 3104) {
                            class105.field2583++;
                            var5--;
                            class7 var64 = class79.field1841[var5];
                            int var65 = 0;
                            if (var64.method82(10)) {
                                var65 = var64.method73((byte) 57);
                            }
                            class47.field1150.method1131(123, 2027385224);
                            class47.field1150.method970((byte) -96, var65);
                            continue;
                        }
                        if (var269 == 3105) {
                            class47.field1142++;
                            var5--;
                            class7 var66 = class79.field1841[var5];
                            class47.field1150.method1131(113, 2027385224);
                            class47.field1150.method956(var66.method70(18982), -822368080);
                            continue;
                        }
                        if (var269 == 3106) {
                            class6.field119++;
                            var5--;
                            class7 var67 = class79.field1841[var5];
                            class47.field1150.method1131(247, arg0 ^ 0x872889A7);
                            class47.field1150.method959(var67.method92(arg0 ^ 0xFFFFF85E) + 1, (byte) -120);
                            class47.field1150.method932(var67, (byte) 86);
                            continue;
                        }
                        if (var269 == 3107) {
                            var6--;
                            int var68 = class152.field3561[var6];
                            var5--;
                            class7 var69 = class79.field1841[var5];
                            class142.method1156(var69, var68, 31);
                            continue;
                        }
                        if (var269 == 3108) {
                            var6 -= 3;
                            int var70 = class152.field3561[var6];
                            int var71 = class152.field3561[var6 + 1];
                            int var72 = class152.field3561[var6 + 2];
                            class103 var73 = class37.method328(arg0 + 2001, var72);
                            method676(var73, var70, 20881, var71);
                            continue;
                        }
                        if (var269 == 3109) {
                            class103 var74 = var41 ? class58.field1382 : class133.field3124;
                            var6 -= 2;
                            int var75 = class152.field3561[var6];
                            int var76 = class152.field3561[var6 + 1];
                            method676(var74, var75, 20881, var76);
                            continue;
                        }
                    } else if (var269 < 3300) {
                        if (var269 == 3200) {
                            var6 -= 3;
                            class82.method684(class152.field3561[var6 + 2], (byte) 122, class152.field3561[var6], class152.field3561[var6 + 1]);
                            continue;
                        }
                        if (var269 == 3201) {
                            var6--;
                            class48.method407((byte) -54, class152.field3561[var6]);
                            continue;
                        }
                        if (var269 == 3202) {
                            var6 -= 2;
                            class51.method420(class152.field3561[var6 + 1], true, class152.field3561[var6]);
                            continue;
                        }
                    } else if (var269 < 3400) {
                        if (var269 == 3300) {
                            class152.field3561[var6++] = class155.field3611;
                            continue;
                        }
                        if (var269 == 3301) {
                            var6 -= 2;
                            int var77 = class152.field3561[var6 + 1];
                            int var78 = class152.field3561[var6];
                            class152.field3561[var6++] = class139.method1143(var78, 7, var77);
                            continue;
                        }
                        if (var269 == 3302) {
                            var6 -= 2;
                            int var79 = class152.field3561[var6];
                            int var80 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = class27.method244(var79, 98, var80);
                            continue;
                        }
                        if (var269 == 3303) {
                            var6 -= 2;
                            int var81 = class152.field3561[var6];
                            int var82 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = class71.method580(-115, var82, var81);
                            continue;
                        }
                        if (var269 == 3304) {
                            var6--;
                            int var83 = class152.field3561[var6];
                            class152.field3561[var6++] = class25.method234(var83, 15992).field1367;
                            continue;
                        }
                        if (var269 == 3305) {
                            var6--;
                            int var84 = class152.field3561[var6];
                            class152.field3561[var6++] = class45.field1065[var84];
                            continue;
                        }
                        if (var269 == 3306) {
                            var6--;
                            int var85 = class152.field3561[var6];
                            class152.field3561[var6++] = class101.field2396[var85];
                            continue;
                        }
                        if (var269 == 3307) {
                            var6--;
                            int var86 = class152.field3561[var6];
                            class152.field3561[var6++] = class137.field3275[var86];
                            continue;
                        }
                        if (var269 == 3308) {
                            int var87 = class8.field186;
                            int var88 = (class21.field531.field491 >> 7) + class32.field843;
                            int var89 = (class21.field531.field505 >> 7) + class153.field3585;
                            class152.field3561[var6++] = (var89 << 14) + ((var87 << 28) + var88);
                            continue;
                        }
                        if (var269 == 3309) {
                            var6--;
                            int var90 = class152.field3561[var6];
                            class152.field3561[var6++] = class84.method705(16383, var90 >> 14);
                            continue;
                        }
                        if (var269 == 3310) {
                            var6--;
                            int var91 = class152.field3561[var6];
                            class152.field3561[var6++] = var91 >> 28;
                            continue;
                        }
                        if (var269 == 3311) {
                            var6--;
                            int var92 = class152.field3561[var6];
                            class152.field3561[var6++] = class84.method705(var92, 16383);
                            continue;
                        }
                        if (var269 == 3312) {
                            class152.field3561[var6++] = class94.field2188 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 3313) {
                            var6 -= 2;
                            int var93 = class152.field3561[var6 + 1];
                            int var94 = class152.field3561[var6] + 32768;
                            class152.field3561[var6++] = class139.method1143(var94, 7, var93);
                            continue;
                        }
                        if (var269 == 3314) {
                            var6 -= 2;
                            int var95 = class152.field3561[var6] + 32768;
                            int var96 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = class27.method244(var95, -109, var96);
                            continue;
                        }
                        if (var269 == 3315) {
                            var6 -= 2;
                            int var97 = class152.field3561[var6 + 1];
                            int var98 = class152.field3561[var6] + 32768;
                            class152.field3561[var6++] = class71.method580(-123, var97, var98);
                            continue;
                        }
                        if (var269 == 3316) {
                            if (class43.field1031 < 2) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = class43.field1031;
                            }
                            continue;
                        }
                        if (var269 == 3317) {
                            class152.field3561[var6++] = class136.field3254;
                            continue;
                        }
                        if (var269 == 3318) {
                            class152.field3561[var6++] = class133.field3123;
                            continue;
                        }
                        if (var269 == 3320) {
                            class152.field3561[var6++] = 1;
                            continue;
                        }
                        if (var269 == 3321) {
                            class152.field3561[var6++] = class96.field2280;
                            continue;
                        }
                        if (var269 == 3322) {
                            class152.field3561[var6++] = class155.field3607;
                            continue;
                        }
                        if (var269 == 3323) {
                            if (class43.field1031 == 1) {
                                class152.field3561[var6++] = 1;
                            } else {
                                class152.field3561[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var269 < 3500) {
                        if (var269 == 3400) {
                            var6 -= 2;
                            int var99 = class152.field3561[var6];
                            int var100 = class152.field3561[var6 + 1];
                            class26 var101 = class142.method1157(-26970, var99);
                            for (int var102 = 0; var102 < var101.field690; var102++) {
                                if (var101.field681[var102] == var100) {
                                    class79.field1841[var5++] = var101.field672[var102];
                                    var101 = null;
                                    break;
                                }
                            }
                            if (var101 != null) {
                                class79.field1841[var5++] = var101.field686;
                            }
                            continue;
                        }
                        if (var269 == 3408) {
                            var6 -= 4;
                            int var103 = class152.field3561[var6 + 1];
                            int var104 = class152.field3561[var6];
                            int var105 = class152.field3561[var6 + 2];
                            int var106 = class152.field3561[var6 + 3];
                            class26 var107 = class142.method1157(arg0 - 24969, var105);
                            if (var107.field682 == var104 && var107.field676 == var103) {
                                for (int var108 = 0; var108 < var107.field690; var108++) {
                                    if (var107.field681[var108] == var106) {
                                        if (var103 == 115) {
                                            class79.field1841[var5++] = var107.field672[var108];
                                        } else {
                                            class152.field3561[var6++] = var107.field680[var108];
                                        }
                                        var107 = null;
                                        break;
                                    }
                                }
                                if (var107 != null) {
                                    if (var103 == 115) {
                                        class79.field1841[var5++] = var107.field686;
                                    } else {
                                        class152.field3561[var6++] = var107.field683;
                                    }
                                }
                                continue;
                            }
                            if (var103 == 115) {
                                class79.field1841[var5++] = class23.field629;
                            } else {
                                class152.field3561[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var269 < 3700) {
                        if (var269 == 3600) {
                            if (class105.field2582 == 0) {
                                class152.field3561[var6++] = -2;
                            } else if (class105.field2582 == 1) {
                                class152.field3561[var6++] = -1;
                            } else {
                                class152.field3561[var6++] = class21.field546;
                            }
                            continue;
                        }
                        if (var269 == 3601) {
                            var6--;
                            int var223 = class152.field3561[var6];
                            if (class105.field2582 == 2 && var223 < class21.field546) {
                                class79.field1841[var5++] = class10.field277[var223];
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 3602) {
                            var6--;
                            int var224 = class152.field3561[var6];
                            if (class105.field2582 == 2 && class21.field546 > var224) {
                                class152.field3561[var6++] = class137.field3272[var224];
                                continue;
                            }
                            class152.field3561[var6++] = 0;
                            continue;
                        }
                        if (var269 == 3603) {
                            var6--;
                            int var225 = class152.field3561[var6];
                            if (class105.field2582 == 2 && var225 < class21.field546) {
                                class152.field3561[var6++] = class57.field1363[var225];
                                continue;
                            }
                            class152.field3561[var6++] = 0;
                            continue;
                        }
                        if (var269 == 3604) {
                            var5--;
                            class7 var226 = class79.field1841[var5];
                            var6--;
                            int var227 = class152.field3561[var6];
                            class144.method1168(var226, (byte) 76, var227);
                            continue;
                        }
                        if (var269 == 3605) {
                            var5--;
                            class7 var228 = class79.field1841[var5];
                            class72.method590(var228.method70(18982), true);
                            continue;
                        }
                        if (var269 == 3606) {
                            var5--;
                            class7 var229 = class79.field1841[var5];
                            class133.method1079(var229.method70(18982), 11416);
                            continue;
                        }
                        if (var269 == 3607) {
                            var5--;
                            class7 var230 = class79.field1841[var5];
                            class49.method411(var230.method70(18982), (byte) -115);
                            continue;
                        }
                        if (var269 == 3608) {
                            var5--;
                            class7 var231 = class79.field1841[var5];
                            class9.method108(var231.method70(18982), 0);
                            continue;
                        }
                        if (var269 == 3609) {
                            var5--;
                            class7 var232 = class79.field1841[var5];
                            if (var232.method94((byte) -123, class105.field2576) || var232.method94((byte) -123, class27.field710)) {
                                var232 = var232.method61(-99, 7);
                            }
                            class152.field3561[var6++] = class39.method338(false, var232) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 3611) {
                            if (class9.field243 == null) {
                                class79.field1841[var5++] = class10.field272;
                            } else {
                                class79.field1841[var5++] = class9.field243;
                            }
                            continue;
                        }
                        if (var269 == 3612) {
                            if (class9.field243 == null) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = class151.field3540;
                            }
                            continue;
                        }
                        if (var269 == 3613) {
                            var6--;
                            int var233 = class152.field3561[var6];
                            if (class9.field243 != null && var233 < class151.field3540) {
                                class79.field1841[var5++] = class118.field2780[var233].field1985;
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 3614) {
                            var6--;
                            int var234 = class152.field3561[var6];
                            if (class9.field243 != null && var234 < class151.field3540) {
                                class152.field3561[var6++] = class118.field2780[var234].field1981;
                                continue;
                            }
                            class152.field3561[var6++] = 0;
                            continue;
                        }
                        if (var269 == 3615) {
                            var6--;
                            int var235 = class152.field3561[var6];
                            if (class9.field243 != null && var235 < class151.field3540) {
                                class152.field3561[var6++] = class118.field2780[var235].field1983;
                                continue;
                            }
                            class152.field3561[var6++] = 0;
                            continue;
                        }
                        if (var269 == 3616) {
                            class152.field3561[var6++] = class94.field2206;
                            continue;
                        }
                        if (var269 == 3617) {
                            var6--;
                            int var236 = class152.field3561[var6];
                            class127.method1054(var236, false);
                            continue;
                        }
                        if (var269 == 3618) {
                            class152.field3561[var6++] = class37.field945;
                            continue;
                        }
                        if (var269 == 3619) {
                            var5--;
                            class7 var237 = class79.field1841[var5];
                            class22.method215(var237.method70(18982), (byte) 83);
                            continue;
                        }
                        if (var269 == 3620) {
                            class13.method135(0);
                            continue;
                        }
                        if (var269 == 3621) {
                            if (class105.field2582 == 0) {
                                class152.field3561[var6++] = -1;
                            } else {
                                class152.field3561[var6++] = class105.field2573;
                            }
                            continue;
                        }
                        if (var269 == 3622) {
                            var6--;
                            int var238 = class152.field3561[var6];
                            if (class105.field2582 != 0 && var238 < class105.field2573) {
                                class79.field1841[var5++] = class86.method708(-106, class39.field968[var238]).method96(65);
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                    } else if (var269 < 4100) {
                        if (var269 == 4000) {
                            var6 -= 2;
                            int var190 = class152.field3561[var6];
                            int var191 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = var190 + var191;
                            continue;
                        }
                        if (var269 == 4001) {
                            var6 -= 2;
                            int var192 = class152.field3561[var6];
                            int var193 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = var192 - var193;
                            continue;
                        }
                        if (var269 == 4002) {
                            var6 -= 2;
                            int var194 = class152.field3561[var6];
                            int var195 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = var194 * var195;
                            continue;
                        }
                        if (var269 == 4003) {
                            var6 -= 2;
                            int var196 = class152.field3561[var6];
                            int var197 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = var196 / var197;
                            continue;
                        }
                        if (var269 == 4004) {
                            var6--;
                            int var198 = class152.field3561[var6];
                            class152.field3561[var6++] = (int) ((double) var198 * Math.random());
                            continue;
                        }
                        if (var269 == 4005) {
                            var6--;
                            int var199 = class152.field3561[var6];
                            class152.field3561[var6++] = (int) ((double) (var199 + 1) * Math.random());
                            continue;
                        }
                        if (var269 == 4006) {
                            var6 -= 5;
                            int var200 = class152.field3561[var6 + 1];
                            int var201 = class152.field3561[var6 + 3];
                            int var202 = class152.field3561[var6];
                            int var203 = class152.field3561[var6 + 2];
                            int var204 = class152.field3561[var6 + 4];
                            class152.field3561[var6++] = (var200 - var202) * (-var203 + var204) / (var201 - var203) + var202;
                            continue;
                        }
                        if (var269 == 4007) {
                            var6 -= 2;
                            int var205 = class152.field3561[var6];
                            int var206 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = var205 * var206 / 100 + var205;
                            continue;
                        }
                        if (var269 == 4008) {
                            var6 -= 2;
                            int var207 = class152.field3561[var6 + 1];
                            int var208 = class152.field3561[var6];
                            class152.field3561[var6++] = class141.method1150(var208, 0x1 << var207);
                            continue;
                        }
                        if (var269 == 4009) {
                            var6 -= 2;
                            int var209 = class152.field3561[var6 + 1];
                            int var210 = class152.field3561[var6];
                            class152.field3561[var6++] = class84.method705(-(0x1 << var209) - 1, var210);
                            continue;
                        }
                        if (var269 == 4010) {
                            var6 -= 2;
                            int var211 = class152.field3561[var6 + 1];
                            int var212 = class152.field3561[var6];
                            class152.field3561[var6++] = class84.method705(0x1 << var211, var212) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var269 == 4011) {
                            var6 -= 2;
                            int var213 = class152.field3561[var6 + 1];
                            int var214 = class152.field3561[var6];
                            class152.field3561[var6++] = var214 % var213;
                            continue;
                        }
                        if (var269 == 4012) {
                            var6 -= 2;
                            int var215 = class152.field3561[var6 + 1];
                            int var216 = class152.field3561[var6];
                            if (var216 == 0) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = (int) Math.pow((double) var216, (double) var215);
                            }
                            continue;
                        }
                        if (var269 == 4013) {
                            var6 -= 2;
                            int var217 = class152.field3561[var6];
                            int var218 = class152.field3561[var6 + 1];
                            if (var217 == 0) {
                                class152.field3561[var6++] = 0;
                            } else if (var218 == 0) {
                                class152.field3561[var6++] = Integer.MAX_VALUE;
                            } else {
                                class152.field3561[var6++] = (int) Math.pow((double) var217, 1.0D / (double) var218);
                            }
                            continue;
                        }
                        if (var269 == 4014) {
                            var6 -= 2;
                            int var219 = class152.field3561[var6];
                            int var220 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = class84.method705(var220, var219);
                            continue;
                        }
                        if (var269 == 4015) {
                            var6 -= 2;
                            int var221 = class152.field3561[var6];
                            int var222 = class152.field3561[var6 + 1];
                            class152.field3561[var6++] = class141.method1150(var221, var222);
                            continue;
                        }
                    } else if (var269 < 4200) {
                        if (var269 == 4100) {
                            var5--;
                            class7 var144 = class79.field1841[var5];
                            var6--;
                            int var145 = class152.field3561[var6];
                            class79.field1841[var5++] = class116.method905(new class7[] { var144, class51.method421((byte) 119, var145) }, arg0 + 2002);
                            continue;
                        }
                        if (var269 == 4101) {
                            var5 -= 2;
                            class7 var146 = class79.field1841[var5 + 1];
                            class7 var147 = class79.field1841[var5];
                            class79.field1841[var5++] = class116.method905(new class7[] { var147, var146 }, arg0 + 2002);
                            continue;
                        }
                        if (var269 == 4102) {
                            var5--;
                            class7 var148 = class79.field1841[var5];
                            var6--;
                            int var149 = class152.field3561[var6];
                            class79.field1841[var5++] = class116.method905(new class7[] { var148, class115.method898(true, true, var149) }, 1);
                            continue;
                        }
                        if (var269 == 4103) {
                            var5--;
                            class7 var150 = class79.field1841[var5];
                            class79.field1841[var5++] = var150.method85(false);
                            continue;
                        }
                        if (var269 == 4104) {
                            var6--;
                            int var151 = class152.field3561[var6];
                            long var152 = ((long) var151 + 11745L) * 86400000L;
                            class77.field1777.setTime(new Date(var152));
                            int var154 = class77.field1777.get(5);
                            int var155 = class77.field1777.get(2);
                            int var156 = class77.field1777.get(1);
                            class79.field1841[var5++] = class116.method905(new class7[] { class51.method421((byte) -97, var154), class142.field3339, class142.field3341[var155], class142.field3339, class51.method421((byte) 4, var156) }, 1);
                            continue;
                        }
                        if (var269 == 4105) {
                            var5 -= 2;
                            class7 var157 = class79.field1841[var5];
                            class7 var158 = class79.field1841[var5 + 1];
                            if (class21.field531.field2118 != null && class21.field531.field2118.field3246) {
                                class79.field1841[var5++] = var158;
                                continue;
                            }
                            class79.field1841[var5++] = var157;
                            continue;
                        }
                        if (var269 == 4106) {
                            var6--;
                            int var159 = class152.field3561[var6];
                            class79.field1841[var5++] = class51.method421((byte) 121, var159);
                            continue;
                        }
                        if (var269 == 4107) {
                            var5 -= 2;
                            class152.field3561[var6++] = class79.field1841[var5].method64((byte) -28, class79.field1841[var5 + 1]);
                            continue;
                        }
                        if (var269 == 4108) {
                            var6 -= 2;
                            var5--;
                            class7 var160 = class79.field1841[var5];
                            int var161 = class152.field3561[var6 + 1];
                            int var162 = class152.field3561[var6];
                            byte[] var163 = class83.field1973.method572(var161, false, 0);
                            class5 var164 = new class5(var163);
                            class152.field3561[var6++] = var164.method29(var160, var162);
                            continue;
                        }
                        if (var269 == 4109) {
                            var6 -= 2;
                            int var165 = class152.field3561[var6];
                            var5--;
                            class7 var166 = class79.field1841[var5];
                            int var167 = class152.field3561[var6 + 1];
                            byte[] var168 = class83.field1973.method572(var167, false, 0);
                            class5 var169 = new class5(var168);
                            class152.field3561[var6++] = var169.method35(var166, var165);
                            continue;
                        }
                        if (var269 == 4110) {
                            var5 -= 2;
                            class7 var170 = class79.field1841[var5];
                            class7 var171 = class79.field1841[var5 + 1];
                            var6--;
                            if (class152.field3561[var6] == 1) {
                                class79.field1841[var5++] = var170;
                            } else {
                                class79.field1841[var5++] = var171;
                            }
                            continue;
                        }
                        if (var269 == 4111) {
                            var5--;
                            class7 var172 = class79.field1841[var5];
                            class79.field1841[var5++] = class5.method40(var172);
                            continue;
                        }
                        if (var269 == 4112) {
                            var5--;
                            class7 var173 = class79.field1841[var5];
                            var6--;
                            int var174 = class152.field3561[var6];
                            class79.field1841[var5++] = var173.method89(var174, true);
                            continue;
                        }
                        if (var269 == 4113) {
                            var6--;
                            int var175 = class152.field3561[var6];
                            class152.field3561[var6++] = class119.method922(var175, (byte) -50) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4114) {
                            var6--;
                            int var176 = class152.field3561[var6];
                            class152.field3561[var6++] = class77.method661(var176, (byte) 89) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4115) {
                            var6--;
                            int var177 = class152.field3561[var6];
                            class152.field3561[var6++] = class137.method1127(var177, -3889) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4116) {
                            var6--;
                            int var178 = class152.field3561[var6];
                            class152.field3561[var6++] = class106.method858(103, var178) ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4117) {
                            var5--;
                            class7 var179 = class79.field1841[var5];
                            if (var179 == null) {
                                class152.field3561[var6++] = 0;
                            } else {
                                class152.field3561[var6++] = var179.method92(50);
                            }
                            continue;
                        }
                        if (var269 == 4118) {
                            var6 -= 2;
                            int var180 = class152.field3561[var6];
                            var5--;
                            class7 var181 = class79.field1841[var5];
                            int var182 = class152.field3561[var6 + 1];
                            class79.field1841[var5++] = var181.method77(var180, 111, var182);
                            continue;
                        }
                        if (var269 == 4119) {
                            var5--;
                            class7 var183 = class79.field1841[var5];
                            class7 var184 = class10.method112(var183.method92(-92), false);
                            boolean var185 = false;
                            for (int var186 = 0; var183.method92(113) > var186; var186++) {
                                int var187 = var183.method79(var186, 0);
                                if (var187 == 60) {
                                    var185 = true;
                                } else if (var187 == 62) {
                                    var185 = false;
                                } else if (!var185) {
                                    var184.method59(var187, true);
                                }
                            }
                            var184.method58(false);
                            class79.field1841[var5++] = var184;
                            continue;
                        }
                        if (var269 == 4120) {
                            var5--;
                            class7 var188 = class79.field1841[var5];
                            var6--;
                            int var189 = class152.field3561[var6];
                            class152.field3561[var6++] = var188.method75(0, var189);
                            continue;
                        }
                    } else if (var269 < 4300) {
                        if (var269 == 4200) {
                            var6--;
                            int var130 = class152.field3561[var6];
                            class79.field1841[var5++] = class64.method526(false, var130).field3199;
                            continue;
                        }
                        if (var269 == 4201) {
                            var6 -= 2;
                            int var131 = class152.field3561[var6 + 1];
                            int var132 = class152.field3561[var6];
                            class135 var133 = class64.method526(false, var132);
                            if (var131 >= 1 && var131 <= 5 && var133.field3179[var131 - 1] != null) {
                                class79.field1841[var5++] = var133.field3179[var131 - 1];
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 4202) {
                            var6 -= 2;
                            int var134 = class152.field3561[var6];
                            int var135 = class152.field3561[var6 + 1];
                            class135 var136 = class64.method526(false, var134);
                            if (var135 >= 1 && var135 <= 5 && var136.field3188[var135 - 1] != null) {
                                class79.field1841[var5++] = var136.field3188[var135 - 1];
                                continue;
                            }
                            class79.field1841[var5++] = class10.field272;
                            continue;
                        }
                        if (var269 == 4203) {
                            var6--;
                            int var137 = class152.field3561[var6];
                            class152.field3561[var6++] = class64.method526(false, var137).field3206;
                            continue;
                        }
                        if (var269 == 4204) {
                            var6--;
                            int var138 = class152.field3561[var6];
                            class152.field3561[var6++] = class64.method526(false, var138).field3194 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var269 == 4205) {
                            var6--;
                            int var139 = class152.field3561[var6];
                            class135 var140 = class64.method526(false, var139);
                            if (var140.field3220 == -1 && var140.field3200 >= 0) {
                                class152.field3561[var6++] = var140.field3200;
                                continue;
                            }
                            class152.field3561[var6++] = var139;
                            continue;
                        }
                        if (var269 == 4206) {
                            var6--;
                            int var141 = class152.field3561[var6];
                            class135 var142 = class64.method526(false, var141);
                            if (var142.field3220 >= 0 && var142.field3200 >= 0) {
                                class152.field3561[var6++] = var142.field3200;
                                continue;
                            }
                            class152.field3561[var6++] = var141;
                            continue;
                        }
                        if (var269 == 4207) {
                            var6--;
                            int var143 = class152.field3561[var6];
                            class152.field3561[var6++] = class64.method526(false, var143).field3191 ? 1 : 0;
                            continue;
                        }
                    } else if (var269 < 5100) {
                        if (var269 == 5000) {
                            class152.field3561[var6++] = class87.field2045;
                            continue;
                        }
                        if (var269 == 5001) {
                            class130.field3082++;
                            var6 -= 3;
                            class87.field2045 = class152.field3561[var6];
                            class46.field1118 = class152.field3561[var6 + 1];
                            field1846 = class152.field3561[var6 + 2];
                            class47.field1150.method1131(33, 2027385224);
                            class47.field1150.method959(class87.field2045, (byte) -120);
                            class47.field1150.method959(class46.field1118, (byte) -120);
                            class47.field1150.method959(field1846, (byte) -120);
                            continue;
                        }
                        if (var269 == 5002) {
                            class75.field1740++;
                            var6 -= 2;
                            var5--;
                            class7 var109 = class79.field1841[var5];
                            int var110 = class152.field3561[var6];
                            int var111 = class152.field3561[var6 + 1];
                            class47.field1150.method1131(76, 2027385224);
                            class47.field1150.method956(var109.method70(18982), -822368080);
                            class47.field1150.method959(var110 - 1, (byte) -120);
                            class47.field1150.method959(var111, (byte) -120);
                            continue;
                        }
                        if (var269 == 5003) {
                            var6--;
                            int var112 = class152.field3561[var6];
                            class7 var113 = null;
                            if (var112 < 100) {
                                var113 = class120.field2839[var112];
                            }
                            if (var113 == null) {
                                var113 = class10.field272;
                            }
                            class79.field1841[var5++] = var113;
                            continue;
                        }
                        if (var269 == 5004) {
                            var6--;
                            int var114 = class152.field3561[var6];
                            int var115 = -1;
                            if (var114 < 100 && class120.field2839[var114] != null) {
                                var115 = class42.field996[var114];
                            }
                            class152.field3561[var6++] = var115;
                            continue;
                        }
                        if (var269 == 5005) {
                            class152.field3561[var6++] = class46.field1118;
                            continue;
                        }
                        if (var269 == 5008) {
                            var5--;
                            class7 var116 = class79.field1841[var5];
                            if (var116.method94((byte) -123, class106.field2606)) {
                                class8.method101((byte) 55, var116);
                            } else {
                                class7 var117 = var116.method85(false);
                                byte var118 = 0;
                                if (var117.method94((byte) -123, class38.field954)) {
                                    var118 = 0;
                                    var116 = var116.method61(arg0 + 1931, class38.field954.method92(-107));
                                } else if (var117.method94((byte) -123, class148.field3498)) {
                                    var116 = var116.method61(-79, class148.field3498.method92(-105));
                                    var118 = 1;
                                } else if (var117.method94((byte) -123, class106.field2591)) {
                                    var118 = 2;
                                    var116 = var116.method61(-82, class106.field2591.method92(-110));
                                } else if (var117.method94((byte) -123, class27.field712)) {
                                    var118 = 3;
                                    var116 = var116.method61(arg0 ^ 0x7A6, class27.field712.method92(37));
                                } else if (var117.method94((byte) -123, class127.field3052)) {
                                    var116 = var116.method61(-83, class127.field3052.method92(71));
                                    var118 = 4;
                                } else if (var117.method94((byte) -123, class83.field1967)) {
                                    var118 = 5;
                                    var116 = var116.method61(-105, class83.field1967.method92(arg0 ^ 0x78D));
                                } else if (var117.method94((byte) -123, class147.field3457)) {
                                    var116 = var116.method61(-108, class147.field3457.method92(102));
                                    var118 = 6;
                                } else if (var117.method94((byte) -123, class115.field2738)) {
                                    var116 = var116.method61(-110, class115.field2738.method92(-106));
                                    var118 = 7;
                                } else if (var117.method94((byte) -123, class121.field2844)) {
                                    var118 = 8;
                                    var116 = var116.method61(-124, class121.field2844.method92(arg0 ^ -1942));
                                } else if (var117.method94((byte) -123, class151.field3524)) {
                                    var116 = var116.method61(arg0 + 1895, class151.field3524.method92(115));
                                    var118 = 9;
                                } else if (var117.method94((byte) -123, class89.field2063)) {
                                    var118 = 10;
                                    var116 = var116.method61(-66, class89.field2063.method92(arg0 + 1903));
                                } else if (var117.method94((byte) -123, class95.field2219)) {
                                    var118 = 11;
                                    var116 = var116.method61(-109, class95.field2219.method92(28));
                                } else if (class155.field3610 != 0) {
                                    if (var117.method94((byte) -123, class38.field953)) {
                                        var118 = 0;
                                        var116 = var116.method61(-89, class38.field953.method92(-114));
                                    } else if (var117.method94((byte) -123, class148.field3493)) {
                                        var118 = 1;
                                        var116 = var116.method61(-127, class148.field3493.method92(-95));
                                    } else if (var117.method94((byte) -123, class106.field2594)) {
                                        var116 = var116.method61(-82, class106.field2594.method92(-101));
                                        var118 = 2;
                                    } else if (var117.method94((byte) -123, class27.field703)) {
                                        var118 = 3;
                                        var116 = var116.method61(-118, class27.field703.method92(126));
                                    } else if (var117.method94((byte) -123, class127.field3049)) {
                                        var116 = var116.method61(-68, class127.field3049.method92(-120));
                                        var118 = 4;
                                    } else if (var117.method94((byte) -123, class83.field1946)) {
                                        var118 = 5;
                                        var116 = var116.method61(-96, class83.field1946.method92(97));
                                    } else if (var117.method94((byte) -123, class147.field3452)) {
                                        var116 = var116.method61(-99, class147.field3452.method92(arg0 ^ -1974));
                                        var118 = 6;
                                    } else if (var117.method94((byte) -123, class115.field2744)) {
                                        var118 = 7;
                                        var116 = var116.method61(-74, class115.field2744.method92(arg0 + 1876));
                                    } else if (var117.method94((byte) -123, class121.field2842)) {
                                        var118 = 8;
                                        var116 = var116.method61(-126, class121.field2842.method92(-100));
                                    } else if (var117.method94((byte) -123, class151.field3541)) {
                                        var118 = 9;
                                        var116 = var116.method61(-77, class151.field3541.method92(arg0 + 1898));
                                    } else if (var117.method94((byte) -123, class89.field2072)) {
                                        var116 = var116.method61(arg0 + 1917, class89.field2072.method92(arg0 + 1887));
                                        var118 = 10;
                                    } else if (var117.method94((byte) -123, class95.field2250)) {
                                        var118 = 11;
                                        var116 = var116.method61(-87, class95.field2250.method92(104));
                                    }
                                }
                                byte var119 = 0;
                                class54.field1317++;
                                class7 var120 = var116.method85(false);
                                if (var120.method94((byte) -123, class38.field948)) {
                                    var119 = 1;
                                    var116 = var116.method61(-115, class38.field948.method92(-111));
                                } else if (var120.method94((byte) -123, class153.field3576)) {
                                    var116 = var116.method61(-83, class153.field3576.method92(119));
                                    var119 = 2;
                                } else if (var120.method94((byte) -123, class133.field3111)) {
                                    var116 = var116.method61(arg0 + 1934, class133.field3111.method92(-109));
                                    var119 = 3;
                                } else if (var120.method94((byte) -123, class24.field650)) {
                                    var116 = var116.method61(-98, class24.field650.method92(109));
                                    var119 = 4;
                                } else if (var120.method94((byte) -123, class120.field2828)) {
                                    var116 = var116.method61(arg0 ^ 0x7AA, class120.field2828.method92(-121));
                                    var119 = 5;
                                } else if (class155.field3610 != 0) {
                                    if (var120.method94((byte) -123, class38.field951)) {
                                        var119 = 1;
                                        var116 = var116.method61(arg0 ^ 0x7B0, class38.field951.method92(32));
                                    } else if (var120.method94((byte) -123, class153.field3567)) {
                                        var119 = 2;
                                        var116 = var116.method61(-84, class153.field3567.method92(-105));
                                    } else if (var120.method94((byte) -123, class133.field3113)) {
                                        var116 = var116.method61(arg0 ^ 0x79D, class133.field3113.method92(108));
                                        var119 = 3;
                                    } else if (var120.method94((byte) -123, class24.field643)) {
                                        var119 = 4;
                                        var116 = var116.method61(-72, class24.field643.method92(-110));
                                    } else if (var120.method94((byte) -123, class120.field2831)) {
                                        var119 = 5;
                                        var116 = var116.method61(-76, class120.field2831.method92(-121));
                                    }
                                }
                                class47.field1150.method1131(196, 2027385224);
                                class47.field1150.method959(0, (byte) -120);
                                int var121 = class47.field1150.field2903;
                                class47.field1150.method959(var118, (byte) -120);
                                class47.field1150.method959(var119, (byte) -120);
                                class10.method114(var116, class47.field1150, (byte) -8);
                                class47.field1150.method976(class47.field1150.field2903 - var121, (byte) 21);
                            }
                            continue;
                        }
                        if (var269 == 5009) {
                            class3.field26++;
                            var5 -= 2;
                            class7 var122 = class79.field1841[var5];
                            class7 var123 = class79.field1841[var5 + 1];
                            class47.field1150.method1131(73, 2027385224);
                            class47.field1150.method959(0, (byte) -120);
                            int var124 = class47.field1150.field2903;
                            class47.field1150.method956(var122.method70(18982), -822368080);
                            class10.method114(var123, class47.field1150, (byte) -37);
                            class47.field1150.method976(class47.field1150.field2903 - var124, (byte) 21);
                            continue;
                        }
                        if (var269 == 5010) {
                            class7 var125 = null;
                            var6--;
                            int var126 = class152.field3561[var6];
                            if (var126 < 100) {
                                var125 = class106.field2598[var126];
                            }
                            if (var125 == null) {
                                var125 = class10.field272;
                            }
                            class79.field1841[var5++] = var125;
                            continue;
                        }
                        if (var269 == 5011) {
                            var6--;
                            int var127 = class152.field3561[var6];
                            class7 var128 = null;
                            if (var127 < 100) {
                                var128 = field1849[var127];
                            }
                            if (var128 == null) {
                                var128 = class10.field272;
                            }
                            class79.field1841[var5++] = var128;
                            continue;
                        }
                        if (var269 == 5015) {
                            class7 var129;
                            if (class21.field531 == null || class21.field531.field2121 == null) {
                                var129 = class106.field2608;
                            } else {
                                var129 = class21.field531.field2121;
                            }
                            class79.field1841[var5++] = var129;
                            continue;
                        }
                        if (var269 == 5016) {
                            class152.field3561[var6++] = field1846;
                            continue;
                        }
                    }
                } else {
                    class103 var51;
                    if (var269 >= 2000) {
                        var269 -= 1000;
                        var6--;
                        var51 = class37.method328(0, class152.field3561[var6]);
                    } else {
                        var51 = var41 ? class58.field1382 : class133.field3124;
                    }
                    if (var269 == 1300) {
                        var6--;
                        int var52 = class152.field3561[var6] - 1;
                        if (var52 >= 0 && var52 <= 9) {
                            var5--;
                            var51.method847(var52, class79.field1841[var5], arg0 + 26496);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var269 == 1301) {
                        var6 -= 2;
                        int var53 = class152.field3561[var6 + 1];
                        int var54 = class152.field3561[var6];
                        var51.field2443 = class19.method177(var54, (byte) -80, var53);
                        continue;
                    }
                    if (var269 == 1302) {
                        var6--;
                        var51.field2555 = class152.field3561[var6] == 1;
                        continue;
                    }
                    if (var269 == 1303) {
                        var6--;
                        var51.field2455 = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 1304) {
                        var6--;
                        var51.field2552 = class152.field3561[var6];
                        continue;
                    }
                    if (var269 == 1305) {
                        var5--;
                        var51.field2541 = class79.field1841[var5];
                        continue;
                    }
                    if (var269 == 1306) {
                        var5--;
                        var51.field2556 = class79.field1841[var5];
                        continue;
                    }
                    if (var269 == 1307) {
                        var51.field2440 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var268) {
            if (var4.field294 == null) {
                if (class22.field617 != 0) {
                    class53.method432(class37.field941, 0, class10.field272, arg0 + 2016);
                }
                class144.method1169(var268, (byte) 67, "CS2 - scr:" + var4.field3261 + " op:" + var8);
            } else {
                class7 var265 = class10.method112(30, false);
                var265.method69(-67, class26.field691).method69(arg0 ^ 0x7E7, var4.field294);
                for (int var266 = class101.field2384 - 1; var266 >= 0; var266--) {
                    var265.method69(-57, class122.field2899).method69(-128, class19.field498[var266].field2756.field294);
                }
                if (var8 == 40) {
                    int var267 = var7[var10];
                    var265.method69(-65, class49.field1176).method69(arg0 ^ 0x79F, class51.method421((byte) 127, var267));
                }
                if (class22.field617 != 0) {
                    class53.method432(class116.method905(new class7[] { class73.field1702, var4.field294 }, 1), 0, class10.field272, -121);
                }
                class144.method1169(var268, (byte) -100, "CS2 - scr:" + var4.field3261 + " op:" + var8 + new String(var265.method97(arg0 ^ 0xFFFFF84E)));
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lof;III)V")
    public static final void method676(class103 arg0, int arg1, int arg2, int arg3) {
        field1856++;
        if (class81.field1865 != null || class78.field1817 || (arg0 == null || class147.method1182(arg0, 268435455) == null)) {
            return;
        }
        class81.field1865 = arg0;
        class73.field1695 = class147.method1182(arg0, arg2 ^ 0xFFFAE6E);
        class47.field1154 = arg3;
        if (arg2 != 20881) {
            field1846 = -41;
        }
        class130.field3093 = false;
        class79.field1833 = 0;
        class43.field1028 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "run", descriptor = "()V")
    public final void run() {
        this.field1858 = true;
        field1852++;
        try {
            while (!this.field1847) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class72 var2 = this.field1853[var1];
                    if (var2 != null) {
                        var2.method595((byte) 127);
                    }
                }
                class79.method673(2, 10L);
                class77.method663(this.field1859, (byte) 92, null);
            }
        } catch (Exception var9) {
            class144.method1169(var9, (byte) 61, null);
        } finally {
            Object var6 = null;
            this.field1858 = false;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method677(byte arg0) {
        field1849 = null;
        if (arg0 >= -49) {
            method675(-24, null);
        }
        field1851 = null;
    }
}
