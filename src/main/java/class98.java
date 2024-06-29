import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class98 {

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field1425 = new String[1000];

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
    private static int[] field1419 = new int[1000];

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[I")
    private static int[] field1417 = new int[5];

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    private static int field1429 = 0;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "[Lna;")
    private static class42[] field1415 = new class42[50];

    @OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
    private static int field1433 = 0;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    private static int field1427 = 0;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "[[I")
    private static int[][] field1422 = new int[5][5000];

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1416 = Calendar.getInstance();

    @OriginalMember(owner = "client!qca", name = "A", descriptor = "[I")
    private static int[] field1441 = new int[3];

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field1440 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!qca", name = "B", descriptor = "Lwf;")
    public static class117 field1442 = new class117(4);

    @OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
    private static int field1443 = 0;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!qca", name = "q", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!qca", name = "r", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!qca", name = "v", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!qca", name = "w", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!qca", name = "x", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!qca", name = "u", descriptor = "Lvp;")
    private static class162 field1435;

    @OriginalMember(owner = "client!qca", name = "y", descriptor = "Lvp;")
    private static class162 field1439;

    @OriginalMember(owner = "client!qca", name = "t", descriptor = "Lvb;")
    private static class169 field1434;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "[I")
    private static int[] field1418;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field1426;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "()V")
    public static final void method745() {
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    public static final void method746(int arg0) {
        if (arg0 == -1 || !class325.method1953(arg0, (byte) -21)) {
            return;
        }
        class162[] var1 = class302.field4135[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class162 var3 = var1[var2];
            if (var3.field2428 != null) {
                class518 var4 = new class518();
                var4.field7376 = var3;
                var4.field7383 = var3.field2428;
                method758(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZ)V")
    private static final void method747(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1427 -= 3;
                int var2 = field1419[field1427];
                int var3 = field1419[field1427 + 1];
                int var4 = field1419[field1427 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class162 var5 = class153.method1117(var2, -30170);
                if (var5.field2462 == null) {
                    var5.field2462 = new class162[var4 + 1];
                }
                if (var5.field2462.length <= var4) {
                    class162[] var6 = new class162[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2462.length; var7++) {
                        var6[var7] = var5.field2462[var7];
                    }
                    var5.field2462 = var6;
                }
                if (var4 > 0 && var5.field2462[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class162 var8 = new class162();
                var8.field2552 = var3;
                var8.field2483 = var8.field2456 = var5.field2456;
                var8.field2415 = var4;
                var5.field2462[var4] = var8;
                if (arg1) {
                    field1439 = var8;
                } else {
                    field1435 = var8;
                }
                class403.method2371(var5, (byte) -62);
                return;
            }
            if (arg0 == 101) {
                class162 var9 = arg1 ? field1439 : field1435;
                if (var9.field2415 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class162 var10 = class153.method1117(var9.field2456, -30170);
                var10.field2462[var9.field2415] = null;
                class403.method2371(var10, (byte) -62);
                return;
            }
            if (arg0 == 102) {
                class162 var11 = class153.method1117(field1419[--field1427], -30170);
                var11.field2462 = null;
                class403.method2371(var11, (byte) -62);
                return;
            }
            if (arg0 == 200) {
                field1427 -= 2;
                int var12 = field1419[field1427];
                int var13 = field1419[field1427 + 1];
                class162 var14 = class372.method2217(var12, 100, var13);
                if (var14 != null && var13 != -1) {
                    field1419[field1427++] = 1;
                    if (arg1) {
                        field1439 = var14;
                        return;
                    }
                    field1435 = var14;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1419[--field1427];
                class162 var16 = class153.method1117(var15, -30170);
                if (var16 != null) {
                    field1419[field1427++] = 1;
                    if (arg1) {
                        field1439 = var16;
                        return;
                    }
                    field1435 = var16;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1419[--field1427];
                method748(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1419[--field1427];
                method750(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1427 -= 2;
                int var19 = field1419[field1427];
                int var20 = field1419[field1427 + 1];
                for (int var21 = 0; var21 < class396.field5457.length; var21++) {
                    if (class396.field5457[var21] == var19) {
                        class541.field8119.field5127.method3377(class194.field2879, var21, var20, -29);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class224.field3244.length; var22++) {
                    if (class224.field3244[var22] == var19) {
                        class541.field8119.field5127.method3377(class194.field2879, var22, var20, -69);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1427 -= 2;
                int var23 = field1419[field1427];
                int var24 = field1419[field1427 + 1];
                class541.field8119.field5127.method3368(11691, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1419[--field1427] != 0;
                class541.field8119.field5127.method3367(var25, (byte) 117);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class162 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class153.method1117(field1419[--field1427], -30170);
            } else {
                var26 = arg1 ? field1439 : field1435;
            }
            if (arg0 == 1000) {
                field1427 -= 4;
                var26.field2403 = field1419[field1427];
                var26.field2484 = field1419[field1427 + 1];
                int var27 = field1419[field1427 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field1419[field1427 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2461 = (byte) var27;
                var26.field2504 = (byte) var28;
                class403.method2371(var26, (byte) -62);
                class520.method3076(var26, 111);
                if (var26.field2415 == -1) {
                    class308.method1877(var26.field2456, 5307);
                }
                return;
            }
            if (arg0 == 1001) {
                field1427 -= 4;
                var26.field2450 = field1419[field1427];
                var26.field2492 = field1419[field1427 + 1];
                var26.field2512 = 0;
                var26.field2515 = 0;
                int var29 = field1419[field1427 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field1419[field1427 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2487 = (byte) var29;
                var26.field2458 = (byte) var30;
                class403.method2371(var26, (byte) -62);
                class520.method3076(var26, 127);
                if (var26.field2552 == 0) {
                    class100.method761(var26, -122, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field1419[--field1427] == 1;
                if (var26.field2534 != var31) {
                    var26.field2534 = var31;
                    class403.method2371(var26, (byte) -62);
                }
                if (var26.field2415 == -1) {
                    class388.method2313(var26.field2456, 7);
                }
                return;
            }
            if (arg0 == 1004) {
                field1427 -= 2;
                var26.field2442 = field1419[field1427];
                var26.field2437 = field1419[field1427 + 1];
                class403.method2371(var26, (byte) -62);
                class520.method3076(var26, 125);
                if (var26.field2552 == 0) {
                    class100.method761(var26, -64, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2525 = field1419[--field1427] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class162 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class153.method1117(field1419[--field1427], -30170);
            } else {
                var32 = arg1 ? field1439 : field1435;
            }
            if (arg0 == 1100) {
                field1427 -= 2;
                var32.field2521 = field1419[field1427];
                if (var32.field2521 > var32.field2561 - var32.field2527) {
                    var32.field2521 = var32.field2561 - var32.field2527;
                }
                if (var32.field2521 < 0) {
                    var32.field2521 = 0;
                }
                var32.field2404 = field1419[field1427 + 1];
                if (var32.field2404 > var32.field2505 - var32.field2459) {
                    var32.field2404 = var32.field2505 - var32.field2459;
                }
                if (var32.field2404 < 0) {
                    var32.field2404 = 0;
                }
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class428.method2508(var32.field2456, -123);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2421 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class125.method882(var32.field2456, 0);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2553 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1103) {
                var32.field2422 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1104) {
                var32.field2522 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field1419[--field1427];
                if (var32.field2490 != var33) {
                    var32.field2490 = var33;
                    class403.method2371(var32, (byte) -62);
                }
                if (var32.field2415 == -1) {
                    class58.method388(var32.field2456, 0);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2417 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1107) {
                var32.field2451 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1108) {
                var32.field2529 = 1;
                var32.field2532 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class278.method1745((byte) -111, var32.field2456);
                }
                return;
            }
            if (arg0 == 1109) {
                field1427 -= 6;
                var32.field2408 = field1419[field1427];
                var32.field2410 = field1419[field1427 + 1];
                var32.field2409 = field1419[field1427 + 2];
                var32.field2468 = field1419[field1427 + 3];
                var32.field2482 = field1419[field1427 + 4];
                var32.field2558 = field1419[field1427 + 5];
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class161.method1155(8, var32.field2456);
                    class301.method1840(21337, var32.field2456);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field1419[--field1427];
                if (var32.field2489 != var34) {
                    var32.field2489 = var34;
                    var32.field2438 = 0;
                    var32.field2506 = 1;
                    var32.field2528 = 0;
                    class403.method2371(var32, (byte) -62);
                }
                if (var32.field2415 == -1) {
                    class459.method2780(-117, var32.field2456);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2439 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field1425[--field1429];
                if (!var35.equals(var32.field2470)) {
                    var32.field2470 = var35;
                    class403.method2371(var32, (byte) -62);
                }
                if (var32.field2415 == -1) {
                    class293.method1803(var32.field2456, -1807);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2544 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class261.method1662((byte) 91, var32.field2456);
                }
                return;
            }
            if (arg0 == 1114) {
                field1427 -= 3;
                var32.field2542 = field1419[field1427];
                var32.field2530 = field1419[field1427 + 1];
                var32.field2511 = field1419[field1427 + 2];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1115) {
                var32.field2502 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1116) {
                var32.field2402 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1117) {
                var32.field2495 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1118) {
                var32.field2443 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1119) {
                var32.field2416 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1120) {
                field1427 -= 2;
                var32.field2561 = field1419[field1427];
                var32.field2505 = field1419[field1427 + 1];
                class403.method2371(var32, (byte) -62);
                if (var32.field2552 == 0) {
                    class100.method761(var32, -97, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field1427 -= 2;
                var32.field2454 = (short) field1419[field1427];
                var32.field2496 = (short) field1419[field1427 + 1];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1122) {
                var32.field2441 = field1419[--field1427] == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1123) {
                var32.field2558 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                if (var32.field2415 == -1) {
                    class161.method1155(8, var32.field2456);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field1419[--field1427];
                var32.field2517 = var36 == 1;
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1125) {
                field1427 -= 2;
                var32.field2430 = field1419[field1427];
                var32.field2469 = field1419[field1427 + 1];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1126) {
                var32.field2549 = field1419[--field1427];
                class403.method2371(var32, (byte) -62);
                return;
            }
            if (arg0 == 1127) {
                field1427 -= 2;
                int var37 = field1419[field1427];
                int var38 = field1419[field1427 + 1];
                class178 var39 = class516.field7358.method1274(-106, var37);
                if (var39.field2720 != var38) {
                    var32.method1162((byte) -128, var38, var37);
                    return;
                }
                var32.method1172(11, var37);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field1419[--field1427];
                String var41 = field1425[--field1429];
                class178 var42 = class516.field7358.method1274(-65, var40);
                if (!var42.field2722.equals(var41)) {
                    var32.method1168(var40, -15083, var41);
                    return;
                }
                var32.method1172(11, var40);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class162 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class153.method1117(field1419[--field1427], -30170);
            } else {
                var43 = arg1 ? field1439 : field1435;
            }
            class403.method2371(var43, (byte) -62);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1427 -= 2;
                int var44 = field1419[field1427];
                int var45 = field1419[field1427 + 1];
                if (var43.field2415 == -1) {
                    class158.method1137(9, var43.field2456);
                    class161.method1155(8, var43.field2456);
                    class301.method1840(21337, var43.field2456);
                }
                if (var44 == -1) {
                    var43.field2529 = 1;
                    var43.field2532 = -1;
                    var43.field2434 = -1;
                    return;
                }
                var43.field2434 = var44;
                var43.field2444 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2488 = true;
                } else {
                    var43.field2488 = false;
                }
                class540 var46 = class150.field2242.method3606((byte) -105, var44);
                var43.field2409 = var46.field8087;
                var43.field2468 = var46.field8035;
                var43.field2482 = var46.field8103;
                var43.field2408 = var46.field8041;
                var43.field2410 = var46.field8109;
                var43.field2558 = var46.field8107;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field2432 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field2432 = 1;
                } else {
                    var43.field2432 = 2;
                }
                if (var43.field2512 > 0) {
                    var43.field2558 = var43.field2558 * 32 / var43.field2512;
                    return;
                }
                if (var43.field2450 > 0) {
                    var43.field2558 = var43.field2558 * 32 / var43.field2450;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2529 = 2;
                var43.field2532 = field1419[--field1427];
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -117, var43.field2456);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2529 = 3;
                var43.field2532 = -1;
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -107, var43.field2456);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2529 = 6;
                var43.field2532 = field1419[--field1427];
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -107, var43.field2456);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2529 = 5;
                var43.field2532 = field1419[--field1427];
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -124, var43.field2456);
                }
                return;
            }
            if (arg0 == 1206) {
                field1427 -= 4;
                var43.field2427 = field1419[field1427];
                var43.field2537 = field1419[field1427 + 1];
                var43.field2562 = field1419[field1427 + 2];
                var43.field2440 = field1419[field1427 + 3];
                class403.method2371(var43, (byte) -62);
                return;
            }
            if (arg0 == 1207) {
                field1427 -= 2;
                var43.field2445 = field1419[field1427];
                var43.field2480 = field1419[field1427 + 1];
                class403.method2371(var43, (byte) -62);
                return;
            }
            if (arg0 == 1210) {
                field1427 -= 4;
                var43.field2532 = field1419[field1427];
                var43.field2509 = field1419[field1427 + 1];
                if (field1419[field1427 + 2] == 1) {
                    var43.field2529 = 9;
                } else {
                    var43.field2529 = 8;
                }
                if (field1419[field1427 + 3] == 1) {
                    var43.field2488 = true;
                } else {
                    var43.field2488 = false;
                }
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -125, var43.field2456);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2529 = 5;
                var43.field2532 = class183.field2758;
                var43.field2509 = 0;
                if (var43.field2415 == -1) {
                    class278.method1745((byte) -124, var43.field2456);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class162 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class153.method1117(field1419[--field1427], -30170);
                } else {
                    var58 = arg1 ? field1439 : field1435;
                }
                String var59 = field1425[--field1429];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field1419[--field1427];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field1419[--field1427];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field1425[--field1429];
                    } else {
                        var62[var63] = Integer.valueOf(field1419[--field1427]);
                    }
                }
                int var64 = field1419[--field1427];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field2425 = var62;
                } else if (arg0 == 1401) {
                    var58.field2548 = var62;
                } else if (arg0 == 1402) {
                    var58.field2513 = var62;
                } else if (arg0 == 1403) {
                    var58.field2541 = var62;
                } else if (arg0 == 1404) {
                    var58.field2411 = var62;
                } else if (arg0 == 1405) {
                    var58.field2414 = var62;
                } else if (arg0 == 1406) {
                    var58.field2429 = var62;
                } else if (arg0 == 1407) {
                    var58.field2547 = var62;
                    var58.field2546 = var60;
                } else if (arg0 == 1408) {
                    var58.field2508 = var62;
                } else if (arg0 == 1409) {
                    var58.field2405 = var62;
                } else if (arg0 == 1410) {
                    var58.field2545 = var62;
                } else if (arg0 == 1411) {
                    var58.field2514 = var62;
                } else if (arg0 == 1412) {
                    var58.field2555 = var62;
                } else if (arg0 == 1414) {
                    var58.field2424 = var62;
                    var58.field2499 = var60;
                } else if (arg0 == 1415) {
                    var58.field2493 = var62;
                    var58.field2419 = var60;
                } else if (arg0 == 1416) {
                    var58.field2423 = var62;
                } else if (arg0 == 1417) {
                    var58.field2481 = var62;
                } else if (arg0 == 1418) {
                    var58.field2420 = var62;
                } else if (arg0 == 1419) {
                    var58.field2426 = var62;
                } else if (arg0 == 1420) {
                    var58.field2486 = var62;
                } else if (arg0 == 1421) {
                    var58.field2564 = var62;
                } else if (arg0 == 1422) {
                    var58.field2531 = var62;
                } else if (arg0 == 1423) {
                    var58.field2491 = var62;
                } else if (arg0 == 1424) {
                    var58.field2556 = var62;
                } else if (arg0 == 1425) {
                    var58.field2503 = var62;
                } else if (arg0 == 1426) {
                    var58.field2406 = var62;
                } else if (arg0 == 1427) {
                    var58.field2485 = var62;
                } else if (arg0 == 1428) {
                    var58.field2501 = var62;
                    var58.field2448 = var60;
                } else if (arg0 == 1429) {
                    var58.field2447 = var62;
                    var58.field2460 = var60;
                } else if (arg0 == 1430) {
                    var58.field2560 = var62;
                }
                var58.field2479 = true;
                return;
            }
            if (arg0 < 1600) {
                class162 var65 = arg1 ? field1439 : field1435;
                if (arg0 == 1500) {
                    field1419[field1427++] = var65.field2449;
                    return;
                }
                if (arg0 == 1501) {
                    field1419[field1427++] = var65.field2507;
                    return;
                }
                if (arg0 == 1502) {
                    field1419[field1427++] = var65.field2527;
                    return;
                }
                if (arg0 == 1503) {
                    field1419[field1427++] = var65.field2459;
                    return;
                }
                if (arg0 == 1504) {
                    field1419[field1427++] = var65.field2534 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1419[field1427++] = var65.field2483;
                    return;
                }
                if (arg0 == 1506) {
                    class162 var66 = class145.method982(var65, (byte) 9);
                    field1419[field1427++] = var66 == null ? -1 : var66.field2456;
                    return;
                }
            } else if (arg0 < 1700) {
                class162 var67 = arg1 ? field1439 : field1435;
                if (arg0 == 1600) {
                    field1419[field1427++] = var67.field2521;
                    return;
                }
                if (arg0 == 1601) {
                    field1419[field1427++] = var67.field2404;
                    return;
                }
                if (arg0 == 1602) {
                    field1425[field1429++] = var67.field2470;
                    return;
                }
                if (arg0 == 1603) {
                    field1419[field1427++] = var67.field2561;
                    return;
                }
                if (arg0 == 1604) {
                    field1419[field1427++] = var67.field2505;
                    return;
                }
                if (arg0 == 1605) {
                    field1419[field1427++] = var67.field2558;
                    return;
                }
                if (arg0 == 1606) {
                    field1419[field1427++] = var67.field2409;
                    return;
                }
                if (arg0 == 1607) {
                    field1419[field1427++] = var67.field2482;
                    return;
                }
                if (arg0 == 1608) {
                    field1419[field1427++] = var67.field2468;
                    return;
                }
                if (arg0 == 1609) {
                    field1419[field1427++] = var67.field2422;
                    return;
                }
                if (arg0 == 1610) {
                    field1419[field1427++] = var67.field2408;
                    return;
                }
                if (arg0 == 1611) {
                    field1419[field1427++] = var67.field2410;
                    return;
                }
                if (arg0 == 1612) {
                    field1419[field1427++] = var67.field2490;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field1419[--field1427];
                    class178 var69 = class516.field7358.method1274(115, var68);
                    if (var69.method1257((byte) -110)) {
                        field1425[field1429++] = var67.method1171((byte) 51, var68, var69.field2722);
                        return;
                    }
                    field1419[field1427++] = var67.method1156(var69.field2720, (byte) 124, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class162 var70 = arg1 ? field1439 : field1435;
                if (arg0 == 1700) {
                    field1419[field1427++] = var70.field2434;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field2434 != -1) {
                        field1419[field1427++] = var70.field2444;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1419[field1427++] = var70.field2415;
                    return;
                }
            } else if (arg0 < 1900) {
                class162 var71 = arg1 ? field1439 : field1435;
                if (arg0 == 1800) {
                    field1419[field1427++] = client.method1599(var71).method3658(-95);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field1419[--field1427];
                    int var334 = var72 - 1;
                    if (var71.field2463 != null && var334 < var71.field2463.length && var71.field2463[var334] != null) {
                        field1425[field1429++] = var71.field2463[var334];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field2535 == null) {
                        field1425[field1429++] = "";
                        return;
                    }
                    field1425[field1429++] = var71.field2535;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class162 var332;
                if (arg0 >= 2000) {
                    var332 = class153.method1117(field1419[--field1427], -30170);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field1439 : field1435;
                }
                if (field1443 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field2485 == null) {
                        return;
                    }
                    class518 var333 = new class518();
                    var333.field7376 = var332;
                    var333.field7383 = var332.field2485;
                    var333.field7390 = field1443 + 1;
                    class272.field3848.method131(var333, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class162 var73 = class153.method1117(field1419[--field1427], -30170);
                if (arg0 == 2500) {
                    field1419[field1427++] = var73.field2449;
                    return;
                }
                if (arg0 == 2501) {
                    field1419[field1427++] = var73.field2507;
                    return;
                }
                if (arg0 == 2502) {
                    field1419[field1427++] = var73.field2527;
                    return;
                }
                if (arg0 == 2503) {
                    field1419[field1427++] = var73.field2459;
                    return;
                }
                if (arg0 == 2504) {
                    field1419[field1427++] = var73.field2534 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1419[field1427++] = var73.field2483;
                    return;
                }
                if (arg0 == 1506) {
                    class162 var74 = class145.method982(var73, (byte) 9);
                    field1419[field1427++] = var74 == null ? -1 : var74.field2456;
                    return;
                }
            } else if (arg0 < 2700) {
                class162 var75 = class153.method1117(field1419[--field1427], -30170);
                if (arg0 == 2600) {
                    field1419[field1427++] = var75.field2521;
                    return;
                }
                if (arg0 == 2601) {
                    field1419[field1427++] = var75.field2404;
                    return;
                }
                if (arg0 == 2602) {
                    field1425[field1429++] = var75.field2470;
                    return;
                }
                if (arg0 == 2603) {
                    field1419[field1427++] = var75.field2561;
                    return;
                }
                if (arg0 == 2604) {
                    field1419[field1427++] = var75.field2505;
                    return;
                }
                if (arg0 == 2605) {
                    field1419[field1427++] = var75.field2558;
                    return;
                }
                if (arg0 == 2606) {
                    field1419[field1427++] = var75.field2409;
                    return;
                }
                if (arg0 == 2607) {
                    field1419[field1427++] = var75.field2482;
                    return;
                }
                if (arg0 == 2608) {
                    field1419[field1427++] = var75.field2468;
                    return;
                }
                if (arg0 == 2609) {
                    field1419[field1427++] = var75.field2422;
                    return;
                }
                if (arg0 == 2610) {
                    field1419[field1427++] = var75.field2408;
                    return;
                }
                if (arg0 == 2611) {
                    field1419[field1427++] = var75.field2410;
                    return;
                }
                if (arg0 == 2612) {
                    field1419[field1427++] = var75.field2490;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class162 var76 = class153.method1117(field1419[--field1427], -30170);
                    field1419[field1427++] = var76.field2434;
                    return;
                }
                if (arg0 == 2701) {
                    class162 var77 = class153.method1117(field1419[--field1427], -30170);
                    if (var77.field2434 != -1) {
                        field1419[field1427++] = var77.field2444;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field1419[--field1427];
                    class243 var79 = (class243) class385.field5297.method2799((long) var78, true);
                    if (var79 != null) {
                        field1419[field1427++] = 1;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class162 var80 = class153.method1117(field1419[--field1427], -30170);
                    if (var80.field2462 == null) {
                        field1419[field1427++] = 0;
                        return;
                    }
                    int var81 = var80.field2462.length;
                    for (int var82 = 0; var82 < var80.field2462.length; var82++) {
                        if (var80.field2462[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field1419[field1427++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1427 -= 2;
                    int var83 = field1419[field1427];
                    int var84 = field1419[field1427 + 1];
                    class243 var85 = (class243) class385.field5297.method2799((long) var83, true);
                    if (var85 != null && var85.field3471 == var84) {
                        field1419[field1427++] = 1;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class162 var86 = class153.method1117(field1419[--field1427], -30170);
                if (arg0 == 2800) {
                    field1419[field1427++] = client.method1599(var86).method3658(-122);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field1419[--field1427];
                    int var335 = var87 - 1;
                    if (var86.field2463 != null && var335 < var86.field2463.length && var86.field2463[var335] != null) {
                        field1425[field1429++] = var86.field2463[var335];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field2535 == null) {
                        field1425[field1429++] = "";
                        return;
                    }
                    field1425[field1429++] = var86.field2535;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field1425[--field1429];
                    class568.method3389(36, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field1427 -= 2;
                    class39.method251(field1419[field1427], (byte) 70, field1419[field1427 + 1], class541.field8119);
                    return;
                }
                if (arg0 == 3103) {
                    class501.method2988(true, 29694);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field1425[--field1429];
                    int var90 = 0;
                    if (class631.method3673(var89, 10)) {
                        var90 = class197.method1327(var89, -126);
                    }
                    field1432++;
                    class402.method2367(class349.field4780, (byte) 123);
                    class112.field1589.method1058(602643080, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field1425[--field1429];
                    field1420++;
                    class402.method2367(class185.field2774, (byte) 124);
                    class112.field1589.method1049(-1, var91.length() + 1);
                    class112.field1589.method1050((byte) 32, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field1425[--field1429];
                    field1430++;
                    class402.method2367(class623.field9172, (byte) 121);
                    class112.field1589.method1049(-1, var92.length() + 1);
                    class112.field1589.method1050((byte) 32, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field1419[--field1427];
                    String var94 = field1425[--field1429];
                    class164.method1184(var93, var94, false);
                    return;
                }
                if (arg0 == 3108) {
                    field1427 -= 3;
                    int var95 = field1419[field1427];
                    int var96 = field1419[field1427 + 1];
                    int var97 = field1419[field1427 + 2];
                    class162 var98 = class153.method1117(var97, -30170);
                    class409.method2407(var98, var95, 0, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field1427 -= 2;
                    int var99 = field1419[field1427];
                    int var100 = field1419[field1427 + 1];
                    class162 var101 = arg1 ? field1439 : field1435;
                    class409.method2407(var101, var99, 0, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field1419[--field1427];
                    field1436++;
                    class402.method2367(class507.field7177, (byte) 112);
                    class112.field1589.method1027(255, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field1427 -= 2;
                    int var103 = field1419[field1427];
                    int var104 = field1419[field1427 + 1];
                    class243 var105 = (class243) class385.field5297.method2799((long) var103, true);
                    if (var105 != null) {
                        class321.method1935(true, var105, (byte) 115, var105.field3471 != var104);
                    }
                    class213.method1402(var103, -4867, 3, var104, true);
                    return;
                }
                if (arg0 == 3112) {
                    field1427--;
                    int var106 = field1419[field1427];
                    class243 var107 = (class243) class385.field5297.method2799((long) var106, true);
                    if (var107 != null && var107.field3469 == 3) {
                        class321.method1935(true, var107, (byte) 105, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class523.method3082((byte) 24, field1425[--field1429]);
                    return;
                }
                if (arg0 == 3114) {
                    field1427 -= 2;
                    int var108 = field1419[field1427];
                    int var109 = field1419[field1427 + 1];
                    String var110 = field1425[--field1429];
                    class336.method2053("", "", var108, 73, var109, var110);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1427 -= 3;
                    class245.method1550(field1419[field1427], 255, field1419[field1427 + 2], field1419[field1427 + 1], (byte) 109);
                    return;
                }
                if (arg0 == 3201) {
                    class270.method1706(true, field1419[--field1427], 255, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field1427 -= 2;
                    class468.method2822(255, field1419[field1427], field1419[field1427 + 1], 24277);
                    return;
                }
                if (arg0 == 3203) {
                    field1427 -= 4;
                    class245.method1550(field1419[field1427], field1419[field1427 + 3], field1419[field1427 + 2], field1419[field1427 + 1], (byte) 97);
                    return;
                }
                if (arg0 == 3204) {
                    field1427 -= 3;
                    class270.method1706(true, field1419[field1427], field1419[field1427 + 1], field1419[field1427 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field1427 -= 3;
                    class468.method2822(field1419[field1427 + 2], field1419[field1427], field1419[field1427 + 1], 24277);
                    return;
                }
                if (arg0 == 3206) {
                    field1427 -= 4;
                    class82.method616(field1419[field1427 + 1], field1419[field1427 + 3], field1419[field1427], false, field1419[field1427 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1419[field1427++] = class617.field9123;
                    return;
                }
                if (arg0 == 3301) {
                    field1427 -= 2;
                    int var111 = field1419[field1427];
                    int var112 = field1419[field1427 + 1];
                    field1419[field1427++] = class132.method916(var111, false, var112, (byte) -93);
                    return;
                }
                if (arg0 == 3302) {
                    field1427 -= 2;
                    int var113 = field1419[field1427];
                    int var114 = field1419[field1427 + 1];
                    field1419[field1427++] = class583.method3478(var114, false, 8, var113);
                    return;
                }
                if (arg0 == 3303) {
                    field1427 -= 2;
                    int var115 = field1419[field1427];
                    int var116 = field1419[field1427 + 1];
                    field1419[field1427++] = class586.method3485(var116, -124, var115, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field1419[--field1427];
                    field1419[field1427++] = class405.field5547.method607(106, var117).field9150;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field1419[--field1427];
                    field1419[field1427++] = class533.field7940[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field1419[--field1427];
                    field1419[field1427++] = class158.field2359[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field1419[--field1427];
                    field1419[field1427++] = class275.field3862[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class541.field8119.field8501;
                    int var122 = (class541.field8119.field8496 >> 7) + class473.field6687;
                    int var123 = (class541.field8119.field8500 >> 7) + class38.field463;
                    field1419[field1427++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field1419[--field1427];
                    field1419[field1427++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field1419[--field1427];
                    field1419[field1427++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field1419[--field1427];
                    field1419[field1427++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1419[field1427++] = class106.field1534 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1427 -= 2;
                    int var127 = field1419[field1427];
                    int var128 = field1419[field1427 + 1];
                    field1419[field1427++] = class132.method916(var127, true, var128, (byte) -93);
                    return;
                }
                if (arg0 == 3314) {
                    field1427 -= 2;
                    int var129 = field1419[field1427];
                    int var130 = field1419[field1427 + 1];
                    field1419[field1427++] = class583.method3478(var130, true, 8, var129);
                    return;
                }
                if (arg0 == 3315) {
                    field1427 -= 2;
                    int var131 = field1419[field1427];
                    int var132 = field1419[field1427 + 1];
                    field1419[field1427++] = class586.method3485(var132, -4, var131, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class163.field2578 >= 2) {
                        field1419[field1427++] = class163.field2578;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1419[field1427++] = class525.field7521;
                    return;
                }
                if (arg0 == 3318) {
                    field1419[field1427++] = class286.field3993.field5709;
                    return;
                }
                if (arg0 == 3321) {
                    field1419[field1427++] = class467.field6573;
                    return;
                }
                if (arg0 == 3322) {
                    field1419[field1427++] = class230.field3371;
                    return;
                }
                if (arg0 == 3323) {
                    if (class584.field8574 >= 5 && class584.field8574 <= 9) {
                        field1419[field1427++] = 1;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class584.field8574 >= 5 && class584.field8574 <= 9) {
                        field1419[field1427++] = class584.field8574;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1419[field1427++] = class100.field1459 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1419[field1427++] = class541.field8119.field5165;
                    return;
                }
                if (arg0 == 3327) {
                    field1419[field1427++] = class541.field8119.field5127.field8324 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1419[field1427++] = class228.field3340 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field1419[--field1427];
                    field1419[field1427++] = class86.method641((byte) -95, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field1427 -= 2;
                    int var134 = field1419[field1427];
                    int var135 = field1419[field1427 + 1];
                    field1419[field1427++] = class537.method3257((byte) 125, false, var134, false, var135);
                    return;
                }
                if (arg0 == 3332) {
                    field1427 -= 2;
                    int var136 = field1419[field1427];
                    int var137 = field1419[field1427 + 1];
                    field1419[field1427++] = class537.method3257((byte) 124, true, var136, false, var137);
                    return;
                }
                if (arg0 == 3333) {
                    field1419[field1427++] = class84.field1208;
                    return;
                }
                if (arg0 == 3335) {
                    field1419[field1427++] = class63.field795;
                    return;
                }
                if (arg0 == 3336) {
                    field1427 -= 4;
                    int var138 = field1419[field1427];
                    int var139 = field1419[field1427 + 1];
                    int var140 = field1419[field1427 + 2];
                    int var141 = field1419[field1427 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field1419[field1427++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field1419[field1427++] = class476.field6747;
                    return;
                }
                if (arg0 == 3338) {
                    field1419[field1427++] = class457.method2771(true);
                    return;
                }
                if (arg0 == 3339) {
                    field1419[field1427++] = class644.field9381 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field1419[field1427++] = class105.field1516 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field1419[field1427++] = class182.field2741 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field1419[field1427++] = class623.field9182.method1587((byte) 48);
                    return;
                }
                if (arg0 == 3343) {
                    field1419[field1427++] = class623.field9182.method1594(2028208128);
                    return;
                }
                if (arg0 == 3344) {
                    field1425[field1429++] = class367.method2201((byte) -114);
                    return;
                }
                if (arg0 == 3345) {
                    field1425[field1429++] = class234.method1502(6111);
                    return;
                }
                if (arg0 == 3346) {
                    field1419[field1427++] = class125.method879((byte) 124);
                    return;
                }
                if (arg0 == 3347) {
                    field1419[field1427++] = class409.field5589;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1427 -= 2;
                    int var145 = field1419[field1427];
                    int var146 = field1419[field1427 + 1];
                    class424 var147 = class196.field2901.method2914(-1996488705, var145);
                    field1425[field1429++] = var147.method2491(10851, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field1427 -= 4;
                    int var148 = field1419[field1427];
                    int var149 = field1419[field1427 + 1];
                    int var150 = field1419[field1427 + 2];
                    int var151 = field1419[field1427 + 3];
                    class424 var152 = class196.field2901.method2914(-1996488705, var150);
                    if (var152.field5727 == var148 && var152.field5734 == var149) {
                        if (var149 == 115) {
                            field1425[field1429++] = var152.method2491(10851, var151);
                            return;
                        }
                        field1419[field1427++] = var152.method2493(-123, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field1427 -= 3;
                    int var153 = field1419[field1427];
                    int var154 = field1419[field1427 + 1];
                    int var155 = field1419[field1427 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class424 var156 = class196.field2901.method2914(-1996488705, var154);
                    if (var156.field5734 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1419[field1427++] = var156.method2494(var155, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field1419[--field1427];
                    String var158 = field1425[--field1429];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class424 var159 = class196.field2901.method2914(-1996488705, var157);
                    if (var159.field5734 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1419[field1427++] = var159.method2487(var158, -83) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field1419[--field1427];
                    class424 var161 = class196.field2901.method2914(-1996488705, var160);
                    field1419[field1427++] = var161.field5732.method2803(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class311.field4286 == 0) {
                        field1419[field1427++] = -2;
                        return;
                    }
                    if (class311.field4286 == 1) {
                        field1419[field1427++] = -1;
                        return;
                    }
                    field1419[field1427++] = class304.field4180;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field1419[--field1427];
                    if (class311.field4286 == 2 && var162 < class304.field4180) {
                        field1425[field1429++] = class538.field8010[var162];
                        if (class349.field4781[var162] != null) {
                            field1425[field1429++] = class349.field4781[var162];
                            return;
                        }
                        field1425[field1429++] = "";
                        return;
                    }
                    field1425[field1429++] = "";
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field1419[--field1427];
                    if (class311.field4286 == 2 && var163 < class304.field4180) {
                        field1419[field1427++] = class372.field5108[var163];
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field1419[--field1427];
                    if (class311.field4286 == 2 && var164 < class304.field4180) {
                        field1419[field1427++] = class285.field3986[var164];
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field1425[--field1429];
                    int var166 = field1419[--field1427];
                    class263.method1667(var166, var165, (byte) 107);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field1425[--field1429];
                    class520.method3073((byte) -63, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field1425[--field1429];
                    class308.method1884(1, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field1425[--field1429];
                    class90.method675(false, var169, -105);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field1425[--field1429];
                    class165.method1190((byte) 62, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field1425[--field1429];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field1419[field1427++] = class178.method1256(0, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field1419[--field1427];
                    if (class311.field4286 == 2 && var172 < class304.field4180) {
                        field1425[field1429++] = class408.field5576[var172];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class499.field7078 != null) {
                        field1425[field1429++] = class582.method3474(-32281, class499.field7078);
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class499.field7078 != null) {
                        field1419[field1427++] = class125.field1764;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field1419[--field1427];
                    if (class499.field7078 != null && var173 < class125.field1764) {
                        field1425[field1429++] = class455.field6428[var173].field1967;
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field1419[--field1427];
                    if (class499.field7078 != null && var174 < class125.field1764) {
                        field1419[field1427++] = class455.field6428[var174].field1963;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field1419[--field1427];
                    if (class499.field7078 != null && var175 < class125.field1764) {
                        field1419[field1427++] = class455.field6428[var175].field1965;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1419[field1427++] = class163.field2574;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field1425[--field1429];
                    class452.method2744(var176, (byte) -66);
                    return;
                }
                if (arg0 == 3618) {
                    field1419[field1427++] = class289.field4021;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field1425[--field1429];
                    class62.method399((byte) -48, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class388.method2314(30235);
                    return;
                }
                if (arg0 == 3621) {
                    if (class311.field4286 == 0) {
                        field1419[field1427++] = -1;
                        return;
                    }
                    field1419[field1427++] = class33.field402;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field1419[--field1427];
                    if (class311.field4286 != 0 && var178 < class33.field402) {
                        field1425[field1429++] = class470.field6634[var178];
                        if (class59.field744[var178] != null) {
                            field1425[field1429++] = class59.field744[var178];
                            return;
                        }
                        field1425[field1429++] = "";
                        return;
                    }
                    field1425[field1429++] = "";
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field1425[--field1429];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field1419[field1427++] = class190.method1305(var179, (byte) -72) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field1419[--field1427];
                    if (class455.field6428 != null && var180 < class125.field1764 && class455.field6428[var180].field1971.equalsIgnoreCase(class541.field8119.field5138)) {
                        field1419[field1427++] = 1;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class210.field3106 != null) {
                        field1425[field1429++] = class210.field3106;
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field1419[--field1427];
                    if (class499.field7078 != null && var181 < class125.field1764) {
                        field1425[field1429++] = class455.field6428[var181].field1964;
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field1419[--field1427];
                    if (class311.field4286 == 2 && var182 >= 0 && var182 < class304.field4180) {
                        field1419[field1427++] = class171.field2668[var182] ? 1 : 0;
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field1425[--field1429];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field1419[field1427++] = class54.method354(var183, (byte) -111);
                    return;
                }
                if (arg0 == 3629) {
                    field1419[field1427++] = class448.field6272;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field1425[--field1429];
                    class90.method675(true, var184, 64);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field1419[--field1427];
                    field1419[field1427++] = class643.field9366[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field1419[--field1427];
                    if (class499.field7078 != null && var186 < class125.field1764) {
                        field1425[field1429++] = class455.field6428[var186].field1971;
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field1419[--field1427];
                    if (class311.field4286 != 0 && var187 < class33.field402) {
                        field1425[field1429++] = class380.field5229[var187];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var188].method1891(8);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var189].field4273;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var190].field4279;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var191].field4272;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var192].field4274;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field1419[--field1427];
                    field1419[field1427++] = class641.field9335[var193].field4275;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field1419[--field1427];
                    int var195 = class641.field9335[var194].method1892(false);
                    field1419[field1427++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field1419[--field1427];
                    int var197 = class641.field9335[var196].method1892(false);
                    field1419[field1427++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field1419[--field1427];
                    int var199 = class641.field9335[var198].method1892(false);
                    field1419[field1427++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field1419[--field1427];
                    int var201 = class641.field9335[var200].method1892(false);
                    field1419[field1427++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1427 -= 2;
                    int var202 = field1419[field1427];
                    int var203 = field1419[field1427 + 1];
                    field1419[field1427++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field1427 -= 2;
                    int var204 = field1419[field1427];
                    int var205 = field1419[field1427 + 1];
                    field1419[field1427++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field1427 -= 2;
                    int var206 = field1419[field1427];
                    int var207 = field1419[field1427 + 1];
                    field1419[field1427++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field1427 -= 2;
                    int var208 = field1419[field1427];
                    int var209 = field1419[field1427 + 1];
                    field1419[field1427++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field1419[--field1427];
                    field1419[field1427++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field1419[--field1427];
                    field1419[field1427++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1427 -= 5;
                    int var212 = field1419[field1427];
                    int var213 = field1419[field1427 + 1];
                    int var214 = field1419[field1427 + 2];
                    int var215 = field1419[field1427 + 3];
                    int var216 = field1419[field1427 + 4];
                    field1419[field1427++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field1427 -= 2;
                    long var217 = (long) field1419[field1427];
                    long var219 = (long) field1419[field1427 + 1];
                    field1419[field1427++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field1427 -= 2;
                    int var221 = field1419[field1427];
                    int var222 = field1419[field1427 + 1];
                    field1419[field1427++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field1427 -= 2;
                    int var223 = field1419[field1427];
                    int var224 = field1419[field1427 + 1];
                    field1419[field1427++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1427 -= 2;
                    int var225 = field1419[field1427];
                    int var226 = field1419[field1427 + 1];
                    field1419[field1427++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1427 -= 2;
                    int var227 = field1419[field1427];
                    int var228 = field1419[field1427 + 1];
                    field1419[field1427++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field1427 -= 2;
                    int var229 = field1419[field1427];
                    int var230 = field1419[field1427 + 1];
                    if (var229 == 0) {
                        field1419[field1427++] = 0;
                        return;
                    }
                    field1419[field1427++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field1427 -= 2;
                    int var231 = field1419[field1427];
                    int var232 = field1419[field1427 + 1];
                    if (var231 == 0) {
                        field1419[field1427++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field1419[field1427++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1419[field1427++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field1427 -= 2;
                    int var233 = field1419[field1427];
                    int var234 = field1419[field1427 + 1];
                    field1419[field1427++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field1427 -= 2;
                    int var235 = field1419[field1427];
                    int var236 = field1419[field1427 + 1];
                    field1419[field1427++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field1427 -= 2;
                    int var237 = field1419[field1427];
                    int var238 = field1419[field1427 + 1];
                    field1419[field1427++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field1427 -= 2;
                    int var239 = field1419[field1427];
                    int var240 = field1419[field1427 + 1];
                    field1419[field1427++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field1427 -= 3;
                    long var241 = (long) field1419[field1427];
                    long var243 = (long) field1419[field1427 + 1];
                    long var245 = (long) field1419[field1427 + 2];
                    field1419[field1427++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field1425[--field1429];
                    int var248 = field1419[--field1427];
                    field1425[field1429++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field1429 -= 2;
                    String var249 = field1425[field1429];
                    String var250 = field1425[field1429 + 1];
                    field1425[field1429++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field1425[--field1429];
                    int var252 = field1419[--field1427];
                    field1425[field1429++] = var251 + class87.method651(true, -7010, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field1425[--field1429];
                    field1425[field1429++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1425[field1429++] = method752(field1419[--field1427]);
                    return;
                }
                if (arg0 == 4105) {
                    field1429 -= 2;
                    String var254 = field1425[field1429];
                    String var255 = field1425[field1429 + 1];
                    if (class541.field8119.field5127 != null && class541.field8119.field5127.field8324) {
                        field1425[field1429++] = var255;
                        return;
                    }
                    field1425[field1429++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field1419[--field1427];
                    field1425[field1429++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field1429 -= 2;
                    field1419[field1427++] = class502.method2990(field1425[field1429 + 1], class63.field795, field1425[field1429], 5168);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field1425[--field1429];
                    field1427 -= 2;
                    int var258 = field1419[field1427];
                    int var259 = field1419[field1427 + 1];
                    class352 var260 = class26.method166(0, class647.field9401, var259, 1499);
                    field1419[field1427++] = var260.method2128(class416.field5639, var258, 0, var257);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field1425[--field1429];
                    field1427 -= 2;
                    int var262 = field1419[field1427];
                    int var263 = field1419[field1427 + 1];
                    class352 var264 = class26.method166(0, class647.field9401, var263, 1499);
                    field1419[field1427++] = var264.method2125(var261, class416.field5639, var262, false);
                    return;
                }
                if (arg0 == 4110) {
                    field1429 -= 2;
                    String var265 = field1425[field1429];
                    String var266 = field1425[field1429 + 1];
                    if (field1419[--field1427] == 1) {
                        field1425[field1429++] = var265;
                        return;
                    }
                    field1425[field1429++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field1425[--field1429];
                    field1425[field1429++] = class438.method2552(0, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field1425[--field1429];
                    int var269 = field1419[--field1427];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1425[field1429++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field1419[--field1427];
                    field1419[field1427++] = class216.method1412(-161, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field1419[--field1427];
                    field1419[field1427++] = class433.method2530(-105, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field1419[--field1427];
                    field1419[field1427++] = class537.method3256((byte) 104, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field1419[--field1427];
                    field1419[field1427++] = class246.method1558(32, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field1425[--field1429];
                    if (var274 != null) {
                        field1419[field1427++] = var274.length();
                        return;
                    }
                    field1419[field1427++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field1425[--field1429];
                    field1427 -= 2;
                    int var276 = field1419[field1427];
                    int var277 = field1419[field1427 + 1];
                    field1425[field1429++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field1425[--field1429];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field1425[field1429++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field1425[--field1429];
                    field1427 -= 2;
                    int var284 = field1419[field1427];
                    int var285 = field1419[field1427 + 1];
                    field1419[field1427++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field1429 -= 2;
                    String var286 = field1425[field1429];
                    String var287 = field1425[field1429 + 1];
                    int var288 = field1419[--field1427];
                    field1419[field1427++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field1419[--field1427];
                    field1419[field1427++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field1419[--field1427];
                    field1419[field1427++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field1419[--field1427] != 0;
                    int var292 = field1419[--field1427];
                    field1425[field1429++] = class373.method2225((long) var292, 1616439168, 0, var291, class63.field795);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field1425[--field1429];
                    int var294 = field1419[--field1427];
                    class352 var295 = class26.method166(0, class647.field9401, var294, 1499);
                    field1419[field1427++] = var295.method2124(var293, 91, class416.field5639);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field1419[--field1427];
                    field1425[field1429++] = class150.field2242.method3606((byte) 14, var296).field8105;
                    return;
                }
                if (arg0 == 4201) {
                    field1427 -= 2;
                    int var297 = field1419[field1427];
                    int var298 = field1419[field1427 + 1];
                    class540 var299 = class150.field2242.method3606((byte) -105, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field8078[var298 - 1] != null) {
                        field1425[field1429++] = var299.field8078[var298 - 1];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1427 -= 2;
                    int var300 = field1419[field1427];
                    int var301 = field1419[field1427 + 1];
                    class540 var302 = class150.field2242.method3606((byte) -124, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field8048[var301 - 1] != null) {
                        field1425[field1429++] = var302.field8048[var301 - 1];
                        return;
                    }
                    field1425[field1429++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field1419[--field1427];
                    field1419[field1427++] = class150.field2242.method3606((byte) 45, var303).field8088;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field1419[--field1427];
                    field1419[field1427++] = class150.field2242.method3606((byte) -104, var304).field8055 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field1419[--field1427];
                    class540 var306 = class150.field2242.method3606((byte) 18, var305);
                    if (var306.field8101 == -1 && var306.field8072 >= 0) {
                        field1419[field1427++] = var306.field8072;
                        return;
                    }
                    field1419[field1427++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field1419[--field1427];
                    class540 var308 = class150.field2242.method3606((byte) 23, var307);
                    if (var308.field8101 >= 0 && var308.field8072 >= 0) {
                        field1419[field1427++] = var308.field8072;
                        return;
                    }
                    field1419[field1427++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field1419[--field1427];
                    field1419[field1427++] = class150.field2242.method3606((byte) -103, var309).field8047 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1427 -= 2;
                    int var310 = field1419[field1427];
                    int var311 = field1419[field1427 + 1];
                    class178 var312 = class516.field7358.method1274(-66, var311);
                    if (var312.method1257((byte) -103)) {
                        field1425[field1429++] = class150.field2242.method3606((byte) 56, var310).method3286(35, var312.field2722, var311);
                        return;
                    }
                    field1419[field1427++] = class150.field2242.method3606((byte) -24, var310).method3281(0, var312.field2720, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field1427 -= 2;
                    int var313 = field1419[field1427];
                    int var314 = field1419[field1427 + 1] - 1;
                    class540 var315 = class150.field2242.method3606((byte) 27, var313);
                    if (var315.field8100 == var314) {
                        field1419[field1427++] = var315.field8070;
                        return;
                    }
                    if (var315.field8068 == var314) {
                        field1419[field1427++] = var315.field8075;
                        return;
                    }
                    field1419[field1427++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field1425[--field1429];
                    int var317 = field1419[--field1427];
                    class270.method1704(var316, var317 == 1, true);
                    field1419[field1427++] = class161.field2385;
                    return;
                }
                if (arg0 == 4211) {
                    if (class372.field5115 != null && class514.field7342 < class161.field2385) {
                        field1419[field1427++] = class372.field5115[class514.field7342++] & 0xFFFF;
                        return;
                    }
                    field1419[field1427++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class514.field7342 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1427 -= 2;
                    int var318 = field1419[field1427];
                    int var319 = field1419[field1427 + 1];
                    class178 var320 = class516.field7358.method1274(91, var319);
                    if (var320.method1257((byte) -116)) {
                        field1425[field1429++] = class64.field797.method1177(var318, false).method652(-98, var319, var320.field2722);
                        return;
                    }
                    field1419[field1427++] = class64.field797.method1177(var318, false).method659(-128, var320.field2720, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1427 -= 2;
                    int var321 = field1419[field1427];
                    int var322 = field1419[field1427 + 1];
                    class178 var323 = class516.field7358.method1274(-16, var322);
                    if (var323.method1257((byte) -118)) {
                        field1425[field1429++] = class216.field3172.method1505(-24044, var321).method987(true, var322, var323.field2722);
                        return;
                    }
                    field1419[field1427++] = class216.field3172.method1505(-24044, var321).method988(var322, -1, var323.field2720);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1427 -= 2;
                    int var324 = field1419[field1427];
                    int var325 = field1419[field1427 + 1];
                    class178 var326 = class516.field7358.method1274(-105, var325);
                    if (var326.method1257((byte) -116)) {
                        field1425[field1429++] = class47.field560.method904(-3920, var324).method2307(var325, var326.field2722, (byte) 126);
                        return;
                    }
                    field1419[field1427++] = class47.field560.method904(-3920, var324).method2306(var326.field2720, -109, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field1419[--field1427];
                class226 var328 = class105.field1514.method921(32, var327);
                if (var328.field3297 != null && var328.field3297.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field3290[0];
                    for (int var331 = 1; var331 < var328.field3297.length; var331++) {
                        if (var328.field3290[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field3290[var331];
                        }
                    }
                    field1419[field1427++] = var328.field3297[var329];
                    return;
                }
                field1419[field1427++] = var328.field3261;
                return;
            }
        } else {
            class162 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class153.method1117(field1419[--field1427], -30170);
            } else {
                var47 = arg1 ? field1439 : field1435;
            }
            if (arg0 == 1300) {
                int var48 = field1419[--field1427] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1159(field1425[--field1429], (byte) -112, var48);
                    return;
                }
                field1429--;
                return;
            }
            if (arg0 == 1301) {
                field1427 -= 2;
                int var49 = field1419[field1427];
                int var50 = field1419[field1427 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2431 = null;
                    return;
                }
                var47.field2431 = class372.method2217(var49, 100, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field1419[--field1427];
                if (class218.field3186 != var51 && class105.field1517 != var51 && class188.field2799 != var51) {
                    return;
                }
                var47.field2519 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2453 = field1419[--field1427];
                return;
            }
            if (arg0 == 1304) {
                var47.field2518 = field1419[--field1427];
                return;
            }
            if (arg0 == 1305) {
                var47.field2535 = field1425[--field1429];
                return;
            }
            if (arg0 == 1306) {
                var47.field2435 = field1425[--field1429];
                return;
            }
            if (arg0 == 1307) {
                var47.field2463 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2540 = field1419[--field1427];
                var47.field2464 = field1419[--field1427];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field1419[--field1427];
                int var53 = field1419[--field1427];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1167(var52, var53 - 1, (byte) -123);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field2478 = field1425[--field1429];
                return;
            }
            if (arg0 == 1311) {
                var47.field2550 = field1419[--field1427];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field1427 -= 3;
                    var54 = field1419[field1427] - 1;
                    var55 = field1419[field1427 + 1];
                    var56 = field1419[field1427 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1427 -= 2;
                    var54 = 10;
                    var55 = field1419[field1427];
                    var56 = field1419[field1427 + 1];
                }
                if (var47.field2523 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2523 = new byte[11];
                    var47.field2539 = new byte[11];
                    var47.field2477 = new int[11];
                }
                var47.field2523[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2471 = false;
                    for (int var57 = 0; var57 < var47.field2523.length; var57++) {
                        if (var47.field2523[var57] != 0) {
                            var47.field2471 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2471 = true;
                }
                var47.field2539[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2510 = field1419[--field1427];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
    private static final void method748(int arg0) {
        class162 var1 = class153.method1117(arg0, -30170);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class162[] var3 = class484.field6903[var2];
        if (var3 == null) {
            class162[] var4 = class302.field4135[var2];
            int var5 = var4.length;
            var3 = class484.field6903[var2] = new class162[var5];
            class648.method3738(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class648.method3738(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method749(String arg0, int arg1) {
        if (class163.field2578 == 0 && !(!class266.field3763 || class510.field7259) || class228.field3340) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class159.field2361.method3408(89, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class159.field2361.method3408(112, 0).length());
        } else if (var2.startsWith(class139.field1979.method3408(77, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class139.field1979.method3408(77, 0).length());
        } else if (var2.startsWith(class121.field1713.method3408(100, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class121.field1713.method3408(104, 0).length());
        } else if (var2.startsWith(class60.field757.method3408(106, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class60.field757.method3408(126, 0).length());
        } else if (var2.startsWith(class592.field8760.method3408(104, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class592.field8760.method3408(81, 0).length());
        } else if (var2.startsWith(class332.field4597.method3408(87, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class332.field4597.method3408(73, 0).length());
        } else if (var2.startsWith(class324.field4464.method3408(120, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class324.field4464.method3408(77, 0).length());
        } else if (var2.startsWith(class285.field3988.method3408(117, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class285.field3988.method3408(109, 0).length());
        } else if (var2.startsWith(class508.field7213.method3408(87, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class508.field7213.method3408(113, 0).length());
        } else if (var2.startsWith(class629.field9247.method3408(121, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class629.field9247.method3408(90, 0).length());
        } else if (var2.startsWith(class149.field2209.method3408(104, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class149.field2209.method3408(96, 0).length());
        } else if (var2.startsWith(class111.field1584.method3408(76, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class111.field1584.method3408(121, 0).length());
        } else if (class63.field795 != 0) {
            if (var2.startsWith(class159.field2361.method3408(101, class63.field795))) {
                var3 = 0;
                arg0 = arg0.substring(class159.field2361.method3408(107, class63.field795).length());
            } else if (var2.startsWith(class139.field1979.method3408(125, class63.field795))) {
                var3 = 1;
                arg0 = arg0.substring(class139.field1979.method3408(96, class63.field795).length());
            } else if (var2.startsWith(class121.field1713.method3408(74, class63.field795))) {
                var3 = 2;
                arg0 = arg0.substring(class121.field1713.method3408(90, class63.field795).length());
            } else if (var2.startsWith(class60.field757.method3408(121, class63.field795))) {
                var3 = 3;
                arg0 = arg0.substring(class60.field757.method3408(71, class63.field795).length());
            } else if (var2.startsWith(class592.field8760.method3408(74, class63.field795))) {
                var3 = 4;
                arg0 = arg0.substring(class592.field8760.method3408(95, class63.field795).length());
            } else if (var2.startsWith(class332.field4597.method3408(125, class63.field795))) {
                var3 = 5;
                arg0 = arg0.substring(class332.field4597.method3408(89, class63.field795).length());
            } else if (var2.startsWith(class324.field4464.method3408(89, class63.field795))) {
                var3 = 6;
                arg0 = arg0.substring(class324.field4464.method3408(123, class63.field795).length());
            } else if (var2.startsWith(class285.field3988.method3408(106, class63.field795))) {
                var3 = 7;
                arg0 = arg0.substring(class285.field3988.method3408(111, class63.field795).length());
            } else if (var2.startsWith(class508.field7213.method3408(102, class63.field795))) {
                var3 = 8;
                arg0 = arg0.substring(class508.field7213.method3408(106, class63.field795).length());
            } else if (var2.startsWith(class629.field9247.method3408(94, class63.field795))) {
                var3 = 9;
                arg0 = arg0.substring(class629.field9247.method3408(113, class63.field795).length());
            } else if (var2.startsWith(class149.field2209.method3408(80, class63.field795))) {
                var3 = 10;
                arg0 = arg0.substring(class149.field2209.method3408(83, class63.field795).length());
            } else if (var2.startsWith(class111.field1584.method3408(78, class63.field795))) {
                var3 = 11;
                arg0 = arg0.substring(class111.field1584.method3408(75, class63.field795).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class204.field3005.method3408(110, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class204.field3005.method3408(119, 0).length());
        } else if (var4.startsWith(class63.field794.method3408(71, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class63.field794.method3408(116, 0).length());
        } else if (var4.startsWith(class514.field7340.method3408(103, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class514.field7340.method3408(126, 0).length());
        } else if (var4.startsWith(class321.field4428.method3408(115, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class321.field4428.method3408(93, 0).length());
        } else if (var4.startsWith(class577.field8505.method3408(107, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class577.field8505.method3408(75, 0).length());
        } else if (class63.field795 != 0) {
            if (var4.startsWith(class204.field3005.method3408(95, class63.field795))) {
                var5 = 1;
                arg0 = arg0.substring(class204.field3005.method3408(73, class63.field795).length());
            } else if (var4.startsWith(class63.field794.method3408(122, class63.field795))) {
                var5 = 2;
                arg0 = arg0.substring(class63.field794.method3408(81, class63.field795).length());
            } else if (var4.startsWith(class514.field7340.method3408(89, class63.field795))) {
                var5 = 3;
                arg0 = arg0.substring(class514.field7340.method3408(75, class63.field795).length());
            } else if (var4.startsWith(class321.field4428.method3408(118, class63.field795))) {
                var5 = 4;
                arg0 = arg0.substring(class321.field4428.method3408(72, class63.field795).length());
            } else if (var4.startsWith(class577.field8505.method3408(125, class63.field795))) {
                var5 = 5;
                arg0 = arg0.substring(class577.field8505.method3408(87, class63.field795).length());
            }
        }
        field1421++;
        class402.method2367(class222.field3227, (byte) 127);
        class112.field1589.method1049(-1, 0);
        int var6 = class112.field1589.field2177;
        if (arg1 == 5021) {
            class112.field1589.method1049(-1, 1);
        } else {
            class112.field1589.method1049(-1, 0);
        }
        class112.field1589.method1049(-1, var3);
        class112.field1589.method1049(-1, var5);
        class542.method3292(class112.field1589, 0, arg0);
        class112.field1589.method1066(class112.field1589.field2177 - var6, 41);
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
    private static final void method750(int arg0) {
        class162 var1 = class153.method1117(arg0, -30170);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class162[] var3 = class484.field6903[var2];
        if (var3 == null) {
            class162[] var4 = class302.field4135[var2];
            int var5 = var4.length;
            var3 = class484.field6903[var2] = new class162[var5];
            class648.method3738(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class648.method3738(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(IZ)V")
    public static final void method751(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method752(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1416.setTime(new Date(var1));
        int var3 = field1416.get(5);
        int var4 = field1416.get(2);
        int var5 = field1416.get(1);
        return var3 + "-" + field1440[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(IZ)V")
    private static final void method753(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1419[field1427++] = class403.field5510;
                return;
            }
            if (arg0 == 5001) {
                field1427 -= 3;
                class403.field5510 = field1419[field1427];
                class328.field4536 = class62.method406((byte) -99, field1419[field1427 + 1]);
                if (class328.field4536 == null) {
                    class328.field4536 = class215.field3168;
                }
                client.field3639 = field1419[field1427 + 2];
                field1423++;
                class402.method2367(class361.field4902, (byte) 92);
                class112.field1589.method1049(-1, class403.field5510);
                class112.field1589.method1049(-1, class328.field4536.field3838);
                class112.field1589.method1049(-1, client.field3639);
                return;
            }
            if (arg0 == 5002) {
                field1429 -= 2;
                String var2 = field1425[field1429];
                String var3 = field1425[field1429 + 1];
                field1427 -= 2;
                int var4 = field1419[field1427];
                int var5 = field1419[field1427 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field1438++;
                class402.method2367(class485.field6910, (byte) 103);
                class112.field1589.method1049(-1, class539.method3267(var2, false) + class539.method3267(var3, false) + 2);
                class112.field1589.method1050((byte) 32, var2);
                class112.field1589.method1049(-1, var4 - 1);
                class112.field1589.method1049(-1, var5);
                class112.field1589.method1050((byte) 32, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field1419[--field1427];
                class510 var7 = class86.method646(118, var6);
                String var8 = "";
                if (var7 != null && var7.field7246 != null) {
                    var8 = var7.field7246;
                }
                field1425[field1429++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field1419[--field1427];
                class510 var10 = class86.method646(126, var9);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field7254;
                }
                field1419[field1427++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class328.field4536 == null) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = class328.field4536.field3838;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var12 = field1425[--field1429];
                method749(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1429 -= 2;
                String var13 = field1425[field1429];
                String var14 = field1425[field1429 + 1];
                if (class163.field2578 != 0 || (!class266.field3763 || class510.field7259) && !class228.field3340) {
                    field1431++;
                    class402.method2367(class296.field4067, (byte) 114);
                    class112.field1589.method1049(-1, 0);
                    int var15 = class112.field1589.field2177;
                    class112.field1589.method1050((byte) 32, var13);
                    class542.method3292(class112.field1589, 0, var14);
                    class112.field1589.method1066(class112.field1589.field2177 - var15, -126);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field1419[--field1427];
                class510 var17 = class86.method646(118, var16);
                String var18 = "";
                if (var17 != null && var17.field7245 != null) {
                    var18 = var17.field7245;
                }
                field1425[field1429++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field1419[--field1427];
                class510 var20 = class86.method646(122, var19);
                String var21 = "";
                if (var20 != null && var20.field7256 != null) {
                    var21 = var20.field7256;
                }
                field1425[field1429++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field1419[--field1427];
                class510 var23 = class86.method646(117, var22);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field7251;
                }
                field1419[field1427++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class541.field8119 == null || class541.field8119.field5141 == null) {
                    var25 = class569.field8400;
                } else {
                    var25 = class541.field8119.method2228(true, -1);
                }
                field1425[field1429++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field1419[field1427++] = client.field3639;
                return;
            }
            if (arg0 == 5017) {
                field1419[field1427++] = class466.method2810(-1851278840);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field1419[--field1427];
                class510 var27 = class86.method646(107, var26);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field7248;
                }
                field1419[field1427++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field1419[--field1427];
                class510 var30 = class86.method646(105, var29);
                String var31 = "";
                if (var30 != null && var30.field7257 != null) {
                    var31 = var30.field7257;
                }
                field1425[field1429++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class541.field8119 == null || class541.field8119.field5141 == null) {
                    var32 = class569.field8400;
                } else {
                    var32 = class541.field8119.method2224(1, false);
                }
                field1425[field1429++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field1419[--field1427];
                class510 var34 = class86.method646(123, var33);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field7249;
                }
                field1419[field1427++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field1419[--field1427];
                class510 var37 = class86.method646(100, var36);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field7247;
                }
                field1419[field1427++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field1419[--field1427];
                field1425[field1429++] = class196.field2893.method2055(var39, -14010).field581;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field1419[--field1427];
                class50 var41 = class196.field2893.method2055(var40, -14010);
                if (var41.field578 == null) {
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = var41.field578.length;
                return;
            }
            if (arg0 == 5052) {
                field1427 -= 2;
                int var42 = field1419[field1427];
                int var43 = field1419[field1427 + 1];
                class50 var44 = class196.field2893.method2055(var42, -14010);
                int var45 = var44.field578[var43];
                field1419[field1427++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field1419[--field1427];
                class50 var47 = class196.field2893.method2055(var46, -14010);
                if (var47.field583 == null) {
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = var47.field583.length;
                return;
            }
            if (arg0 == 5054) {
                field1427 -= 2;
                int var48 = field1419[field1427];
                int var49 = field1419[field1427 + 1];
                field1419[field1427++] = class196.field2893.method2055(var48, -14010).field583[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field1419[--field1427];
                field1425[field1429++] = class192.field2857.method275(var50, -6).method158(true);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field1419[--field1427];
                class26 var52 = class192.field2857.method275(var51, -6);
                if (var52.field272 == null) {
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = var52.field272.length;
                return;
            }
            if (arg0 == 5057) {
                field1427 -= 2;
                int var53 = field1419[field1427];
                int var54 = field1419[field1427 + 1];
                field1419[field1427++] = class192.field2857.method275(var53, -6).field272[var54];
                return;
            }
            if (arg0 == 5058) {
                field1434 = new class169();
                field1434.field2638 = field1419[--field1427];
                field1434.field2641 = class192.field2857.method275(field1434.field2638, -6);
                field1434.field2633 = new int[field1434.field2641.method156(-1)];
                return;
            }
            if (arg0 == 5059) {
                field1428++;
                class402.method2367(class238.field3432, (byte) 95);
                class112.field1589.method1049(-1, 0);
                int var55 = class112.field1589.field2177;
                class112.field1589.method1049(-1, 0);
                class112.field1589.method1027(255, field1434.field2638);
                field1434.field2641.method165(class112.field1589, -15, field1434.field2633);
                class112.field1589.method1066(class112.field1589.field2177 - var55, 126);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field1425[--field1429];
                field1424++;
                class402.method2367(class114.field1604, (byte) 78);
                class112.field1589.method1049(-1, 0);
                int var57 = class112.field1589.field2177;
                class112.field1589.method1050((byte) 32, var56);
                class112.field1589.method1027(255, field1434.field2638);
                field1434.field2641.method165(class112.field1589, -97, field1434.field2633);
                class112.field1589.method1066(class112.field1589.field2177 - var57, -127);
                return;
            }
            if (arg0 == 5061) {
                field1428++;
                class402.method2367(class238.field3432, (byte) 84);
                class112.field1589.method1049(-1, 0);
                int var58 = class112.field1589.field2177;
                class112.field1589.method1049(-1, 1);
                class112.field1589.method1027(255, field1434.field2638);
                field1434.field2641.method165(class112.field1589, -49, field1434.field2633);
                class112.field1589.method1066(class112.field1589.field2177 - var58, -127);
                return;
            }
            if (arg0 == 5062) {
                field1427 -= 2;
                int var59 = field1419[field1427];
                int var60 = field1419[field1427 + 1];
                field1419[field1427++] = class196.field2893.method2055(var59, -14010).field586[var60];
                return;
            }
            if (arg0 == 5063) {
                field1427 -= 2;
                int var61 = field1419[field1427];
                int var62 = field1419[field1427 + 1];
                field1419[field1427++] = class196.field2893.method2055(var61, -14010).field577[var62];
                return;
            }
            if (arg0 == 5064) {
                field1427 -= 2;
                int var63 = field1419[field1427];
                int var64 = field1419[field1427 + 1];
                if (var64 == -1) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = class196.field2893.method2055(var63, -14010).method306(92, (char) var64);
                return;
            }
            if (arg0 == 5065) {
                field1427 -= 2;
                int var65 = field1419[field1427];
                int var66 = field1419[field1427 + 1];
                if (var66 == -1) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = class196.field2893.method2055(var65, -14010).method301((char) var66, 781);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field1419[--field1427];
                field1419[field1427++] = class192.field2857.method275(var67, -6).method156(-1);
                return;
            }
            if (arg0 == 5067) {
                field1427 -= 2;
                int var68 = field1419[field1427];
                int var69 = field1419[field1427 + 1];
                int var70 = class192.field2857.method275(var68, -6).method160(var69, (byte) 8).field8154;
                field1419[field1427++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field1427 -= 2;
                int var71 = field1419[field1427];
                int var72 = field1419[field1427 + 1];
                field1434.field2633[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field1427 -= 2;
                int var73 = field1419[field1427];
                int var74 = field1419[field1427 + 1];
                field1434.field2633[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field1427 -= 3;
                int var75 = field1419[field1427];
                int var76 = field1419[field1427 + 1];
                int var77 = field1419[field1427 + 2];
                class26 var78 = class192.field2857.method275(var75, -6);
                if (var78.method160(var76, (byte) 8).field8154 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1419[field1427++] = var78.method163(var76, var77, (byte) -65);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field1425[--field1429];
                boolean var80 = field1419[--field1427] == 1;
                class476.method2868(var79, true, var80);
                field1419[field1427++] = class161.field2385;
                return;
            }
            if (arg0 == 5072) {
                if (class372.field5115 != null && class514.field7342 < class161.field2385) {
                    field1419[field1427++] = class372.field5115[class514.field7342++] & 0xFFFF;
                    return;
                }
                field1419[field1427++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class514.field7342 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class24.field237.method1788(16, 86)) {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class24.field237.method1788(16, 82)) {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class24.field237.method1788(16, 81)) {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class367.method2203(field1419[--field1427], false);
                return;
            }
            if (arg0 == 5201) {
                field1419[field1427++] = class572.method3409((byte) 3);
                return;
            }
            if (arg0 == 5205) {
                class42.method269((byte) 73, -1, -1, field1419[--field1427], false);
                return;
            }
            if (arg0 == 5206) {
                int var81 = field1419[--field1427];
                class642 var82 = class339.method2062(var81 >> 14 & 0x3FFF, var81 & 0x3FFF);
                if (var82 == null) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = var82.field9348;
                return;
            }
            if (arg0 == 5207) {
                class642 var83 = class339.method2065(field1419[--field1427]);
                if (var83 != null && var83.field9346 != null) {
                    field1425[field1429++] = var83.field9346;
                    return;
                }
                field1425[field1429++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1419[field1427++] = class322.field4444;
                field1419[field1427++] = class291.field4026;
                return;
            }
            if (arg0 == 5209) {
                field1419[field1427++] = class607.field9016 + class339.field4685;
                field1419[field1427++] = class339.field4696 + class177.field2703;
                return;
            }
            if (arg0 == 5210) {
                int var84 = field1419[--field1427];
                class642 var85 = class339.method2065(var84);
                if (var85 == null) {
                    field1419[field1427++] = 0;
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = var85.field9350 >> 14 & 0x3FFF;
                field1419[field1427++] = var85.field9350 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var86 = field1419[--field1427];
                class642 var87 = class339.method2065(var86);
                if (var87 == null) {
                    field1419[field1427++] = 0;
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = var87.field9360 - var87.field9358;
                field1419[field1427++] = var87.field9351 - var87.field9357;
                return;
            }
            if (arg0 == 5212) {
                class101 var88 = class614.method3604(false);
                if (var88 == null) {
                    field1419[field1427++] = -1;
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = var88.field1463;
                int var89 = var88.field1472 << 28 | class339.field4685 + var88.field1470 << 14 | class339.field4696 + var88.field1465;
                field1419[field1427++] = var89;
                return;
            }
            if (arg0 == 5213) {
                class101 var90 = class111.method813((byte) 99);
                if (var90 == null) {
                    field1419[field1427++] = -1;
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = var90.field1463;
                int var91 = var90.field1472 << 28 | class339.field4685 + var90.field1470 << 14 | class339.field4696 + var90.field1465;
                field1419[field1427++] = var91;
                return;
            }
            if (arg0 == 5214) {
                int var92 = field1419[--field1427];
                class642 var93 = class349.method2117((byte) 71);
                if (var93 != null) {
                    boolean var94 = var93.method3712((byte) 91, var92 >> 28 & 0x3, var92 >> 14 & 0x3FFF, field1441, var92 & 0x3FFF);
                    if (var94) {
                        class308.method1885(field1441[2], field1441[1], -25358);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1427 -= 2;
                int var95 = field1419[field1427];
                int var96 = field1419[field1427 + 1];
                class589 var97 = class339.method2072(var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                boolean var98 = false;
                for (class642 var99 = (class642) var97.method3505(97); var99 != null; var99 = (class642) var97.method3501((byte) 79)) {
                    if (var99.field9348 == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var98) {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var100 = field1419[--field1427];
                class642 var101 = class339.method2065(var100);
                if (var101 == null) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = var101.field9361;
                return;
            }
            if (arg0 == 5220) {
                field1419[field1427++] = class624.field9190 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var102 = field1419[--field1427];
                class308.method1885(var102 & 0x3FFF, var102 >> 14 & 0x3FFF, -25358);
                return;
            }
            if (arg0 == 5222) {
                class642 var103 = class349.method2117((byte) 71);
                if (var103 != null) {
                    boolean var104 = var103.method3710((byte) 26, class339.field4696 + class177.field2703, field1441, class607.field9016 + class339.field4685);
                    if (var104) {
                        field1419[field1427++] = field1441[1];
                        field1419[field1427++] = field1441[2];
                        return;
                    }
                    field1419[field1427++] = -1;
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = -1;
                field1419[field1427++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1427 -= 2;
                int var105 = field1419[field1427];
                int var106 = field1419[field1427 + 1];
                class42.method269((byte) 125, var106 >> 14 & 0x3FFF, var106 & 0x3FFF, var105, false);
                return;
            }
            if (arg0 == 5224) {
                int var107 = field1419[--field1427];
                class642 var108 = class349.method2117((byte) 71);
                if (var108 != null) {
                    boolean var109 = var108.method3712((byte) 30, var107 >> 28 & 0x3, var107 >> 14 & 0x3FFF, field1441, var107 & 0x3FFF);
                    if (var109) {
                        field1419[field1427++] = field1441[1];
                        field1419[field1427++] = field1441[2];
                        return;
                    }
                    field1419[field1427++] = -1;
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = -1;
                field1419[field1427++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var110 = field1419[--field1427];
                class642 var111 = class349.method2117((byte) 71);
                if (var111 != null) {
                    boolean var112 = var111.method3710((byte) 125, var110 & 0x3FFF, field1441, var110 >> 14 & 0x3FFF);
                    if (var112) {
                        field1419[field1427++] = field1441[1];
                        field1419[field1427++] = field1441[2];
                        return;
                    }
                    field1419[field1427++] = -1;
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = -1;
                field1419[field1427++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class542.method3294((byte) -124, field1419[--field1427]);
                return;
            }
            if (arg0 == 5227) {
                field1427 -= 2;
                int var113 = field1419[field1427];
                int var114 = field1419[field1427 + 1];
                class42.method269((byte) 106, var114 >> 14 & 0x3FFF, var114 & 0x3FFF, var113, true);
                return;
            }
            if (arg0 == 5228) {
                class279.field3910 = field1419[--field1427] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1419[field1427++] = class279.field3910 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var115 = field1419[--field1427];
                class355.method2146(-97, var115);
                return;
            }
            if (arg0 == 5231) {
                field1427 -= 2;
                int var116 = field1419[field1427];
                boolean var117 = field1419[field1427 + 1] == 1;
                if (class596.field8821 != null) {
                    class417 var118 = class596.field8821.method2799((long) var116, true);
                    if (var118 != null && !var117) {
                        var118.method2457(-8422);
                        return;
                    }
                    if (var118 == null && var117) {
                        class417 var119 = new class417();
                        class596.field8821.method2797(-4234, var119, (long) var116);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var120 = field1419[--field1427];
                if (class596.field8821 != null) {
                    class417 var121 = class596.field8821.method2799((long) var120, true);
                    field1419[field1427++] = var121 == null ? 0 : 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1427 -= 2;
                int var122 = field1419[field1427];
                boolean var123 = field1419[field1427 + 1] == 1;
                if (class335.field4629 != null) {
                    class417 var124 = class335.field4629.method2799((long) var122, true);
                    if (var124 != null && !var123) {
                        var124.method2457(-8422);
                        return;
                    }
                    if (var124 == null && var123) {
                        class417 var125 = new class417();
                        class335.field4629.method2797(-4234, var125, (long) var122);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var126 = field1419[--field1427];
                if (class335.field4629 != null) {
                    class417 var127 = class335.field4629.method2799((long) var126, true);
                    field1419[field1427++] = var127 == null ? 0 : 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1419[field1427++] = class339.field4664 == null ? -1 : class339.field4664.field9348;
                return;
            }
            if (arg0 == 5236) {
                field1427 -= 2;
                int var128 = field1419[field1427];
                int var129 = field1419[field1427 + 1];
                int var130 = var129 >> 14 & 0x3FFF;
                int var131 = var129 & 0x3FFF;
                int var132 = class441.method2564(var131, var128, var130, 0);
                if (var132 < 0) {
                    field1419[field1427++] = -1;
                    return;
                }
                field1419[field1427++] = var132;
                return;
            }
            if (arg0 == 5237) {
                class18.method115((byte) -90);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1427 -= 2;
                int var133 = field1419[field1427];
                int var134 = field1419[field1427 + 1];
                class622.method3638(-4, false, 3, var133, var134);
                field1419[field1427++] = class99.field1448 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class99.field1448 != null) {
                    class622.method3638(-4, false, class56.field668.field6858, -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class142[] var135 = class467.method2817(-1164);
                field1419[field1427++] = var135.length;
                return;
            }
            if (arg0 == 5303) {
                int var136 = field1419[--field1427];
                class142[] var137 = class467.method2817(-1164);
                field1419[field1427++] = var137[var136].field2003;
                field1419[field1427++] = var137[var136].field1999;
                return;
            }
            if (arg0 == 5305) {
                int var138 = class56.field668.field6839;
                int var139 = class56.field668.field6865;
                int var140 = -1;
                class142[] var141 = class467.method2817(-1164);
                for (int var142 = 0; var142 < var141.length; var142++) {
                    class142 var143 = var141[var142];
                    if (var143.field2003 == var138 && var143.field1999 == var139) {
                        var140 = var142;
                        break;
                    }
                }
                field1419[field1427++] = var140;
                return;
            }
            if (arg0 == 5306) {
                field1419[field1427++] = class609.method3580(true);
                return;
            }
            if (arg0 == 5307) {
                int var144 = field1419[--field1427];
                if (var144 >= 1 && var144 <= 2) {
                    class622.method3638(-4, false, var144, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1419[field1427++] = class56.field668.field6858;
                return;
            }
            if (arg0 == 5309) {
                int var145 = field1419[--field1427];
                if (var145 >= 1 && var145 <= 2) {
                    class56.field668.field6858 = var145;
                    class56.field668.method1480(class442.field5896, (byte) -69);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1429 -= 2;
                String var146 = field1425[field1429];
                String var147 = field1425[field1429 + 1];
                int var148 = field1419[--field1427];
                field1437++;
                class402.method2367(class518.field7391, (byte) 79);
                class112.field1589.method1049(-1, class539.method3267(var146, false) + class539.method3267(var147, false) + 1);
                class112.field1589.method1050((byte) 32, var146);
                class112.field1589.method1050((byte) 32, var147);
                class112.field1589.method1049(-1, var148);
                return;
            }
            if (arg0 == 5401) {
                field1427 -= 2;
                class565.field8367[field1419[field1427]] = (short) class338.method2059(field1419[field1427 + 1], 92);
                class150.field2242.method3600(-60);
                class150.field2242.method3598(true);
                class64.field797.method1183(19301);
                class504.method2996((byte) 113);
                return;
            }
            if (arg0 == 5405) {
                field1427 -= 2;
                int var149 = field1419[field1427];
                int var150 = field1419[field1427 + 1];
                if (var149 >= 0 && var149 < 2) {
                    class27.field300[var149] = new int[var150 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1427 -= 7;
                int var151 = field1419[field1427];
                int var152 = field1419[field1427 + 1] << 1;
                int var153 = field1419[field1427 + 2];
                int var154 = field1419[field1427 + 3];
                int var155 = field1419[field1427 + 4];
                int var156 = field1419[field1427 + 5];
                int var157 = field1419[field1427 + 6];
                if (var151 >= 0 && var151 < 2 && class27.field300[var151] != null && var152 >= 0 && var152 < class27.field300[var151].length) {
                    class27.field300[var151][var152] = new int[] { (var153 >> 14 & 0x3FFF) << 7, var154, (var153 & 0x3FFF) << 7, var157 };
                    class27.field300[var151][var152 + 1] = new int[] { (var155 >> 14 & 0x3FFF) << 7, var156, (var155 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var158 = class27.field300[field1419[--field1427]].length >> 1;
                field1419[field1427++] = var158;
                return;
            }
            if (arg0 == 5411) {
                if (class99.field1448 != null) {
                    class622.method3638(-4, false, class56.field668.field6858, -1, -1);
                }
                if (class390.field5382 != null) {
                    class76.method589(1);
                    System.exit(0);
                    return;
                }
                String var159 = class110.field1562 == null ? class482.method2905(101) : class110.field1562;
                class505.method2999(var159, class442.field5896, false, class526.field7533 == 1, -1);
                return;
            }
            if (arg0 == 5419) {
                String var160 = "";
                if (class283.field3960 != null) {
                    if (class283.field3960.field201 == null) {
                        var160 = class487.method2919((byte) -111, class283.field3960.field205);
                    } else {
                        var160 = (String) class283.field3960.field201;
                    }
                }
                field1425[field1429++] = var160;
                return;
            }
            if (arg0 == 5420) {
                field1419[field1427++] = class331.field4576 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class99.field1448 != null) {
                    class622.method3638(-4, false, class56.field668.field6858, -1, -1);
                }
                String var161 = field1425[--field1429];
                boolean var162 = field1419[--field1427] == 1;
                String var163 = class482.method2905(99) + var161;
                class505.method2999(var163, class442.field5896, var162, class526.field7533 == 1, -1);
                return;
            }
            if (arg0 == 5422) {
                field1429 -= 2;
                String var164 = field1425[field1429];
                String var165 = field1425[field1429 + 1];
                int var166 = field1419[--field1427];
                if (var164.length() > 0) {
                    if (class29.field321 == null) {
                        class29.field321 = new String[class308.field4262[class348.field4768.field470]];
                    }
                    class29.field321[var166] = var164;
                }
                if (var165.length() > 0) {
                    if (class461.field6515 == null) {
                        class461.field6515 = new String[class308.field4262[class348.field4768.field470]];
                    }
                    class461.field6515[var166] = var165;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1425[--field1429]);
                return;
            }
            if (arg0 == 5424) {
                field1427 -= 11;
                class368.field5077 = field1419[field1427];
                class466.field6560 = field1419[field1427 + 1];
                class444.field6036 = field1419[field1427 + 2];
                class536.field7968 = field1419[field1427 + 3];
                class278.field3899 = field1419[field1427 + 4];
                class516.field7356 = field1419[field1427 + 5];
                class86.field1236 = field1419[field1427 + 6];
                class321.field4431 = field1419[field1427 + 7];
                class342.field4735 = field1419[field1427 + 8];
                class158.field2357 = field1419[field1427 + 9];
                class271.field3835 = field1419[field1427 + 10];
                class585.field8595.method1981(true, class278.field3899);
                class585.field8595.method1981(true, class516.field7356);
                class585.field8595.method1981(true, class86.field1236);
                class585.field8595.method1981(true, class321.field4431);
                class585.field8595.method1981(true, class342.field4735);
                class223.field3232 = null;
                class559.field8303 = null;
                class609.field9044 = null;
                class100.field1460 = null;
                class545.field8140 = null;
                class533.field7937 = null;
                class424.field5739 = null;
                class186.field2782 = null;
                class398.field5469 = true;
                return;
            }
            if (arg0 == 5425) {
                class104.method777(0);
                class398.field5469 = false;
                return;
            }
            if (arg0 == 5426) {
                field1427 -= 2;
                class396.field5454 = field1419[field1427];
                class414.field5625 = field1419[field1427 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1427 -= 2;
                class40.field478 = field1419[field1427 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1427 -= 2;
                int var167 = field1419[field1427];
                int var168 = field1419[field1427 + 1];
                field1419[field1427++] = class470.method2837(var167, -24987, var168) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class29.method198(13699, false, field1425[--field1429], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class640.method3702(class442.field5896.field4568, (byte) -58, "accountcreated");
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class640.method3702(class442.field5896.field4568, (byte) 101, "accountcreatestarted");
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1427 -= 4;
                int var169 = field1419[field1427];
                int var170 = field1419[field1427 + 1];
                int var171 = field1419[field1427 + 2];
                int var172 = field1419[field1427 + 3];
                class420.method2478((var169 >> 14 & 0x3FFF) - class473.field6687, (var169 & 0x3FFF) - class38.field463, var171, (byte) 117, var172, var170, false);
                return;
            }
            if (arg0 == 5501) {
                field1427 -= 4;
                int var173 = field1419[field1427];
                int var174 = field1419[field1427 + 1];
                int var175 = field1419[field1427 + 2];
                int var176 = field1419[field1427 + 3];
                class54.method347((var173 & 0x3FFF) - class38.field463, (var173 >> 14 & 0x3FFF) - class473.field6687, var176, var174, (byte) 116, var175);
                return;
            }
            if (arg0 == 5502) {
                field1427 -= 6;
                int var177 = field1419[field1427];
                if (var177 >= 2) {
                    throw new RuntimeException();
                }
                class625.field9211 = var177;
                int var178 = field1419[field1427 + 1];
                if (var178 + 1 >= class27.field300[class625.field9211].length >> 1) {
                    throw new RuntimeException();
                }
                class352.field4800 = var178;
                class355.field4839 = 0;
                class416.field5643 = field1419[field1427 + 2];
                class386.field5313 = field1419[field1427 + 3];
                int var179 = field1419[field1427 + 4];
                if (var179 >= 2) {
                    throw new RuntimeException();
                }
                class100.field1461 = var179;
                int var180 = field1419[field1427 + 5];
                if (var180 + 1 >= class27.field300[class100.field1461].length >> 1) {
                    throw new RuntimeException();
                }
                class20.field191 = var180;
                class531.field7929 = 3;
                return;
            }
            if (arg0 == 5503) {
                class44.method279((byte) -47);
                return;
            }
            if (arg0 == 5504) {
                field1427 -= 2;
                class389.method2323(field1419[field1427], field1419[field1427 + 1], 101, 0);
                return;
            }
            if (arg0 == 5505) {
                field1419[field1427++] = (int) class278.field3902 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1419[field1427++] = (int) class539.field8023 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class103.method774((byte) -51);
                return;
            }
            if (arg0 == 5508) {
                class438.method2553((byte) 97);
                return;
            }
            if (arg0 == 5509) {
                class284.method1767((byte) -122);
                return;
            }
            if (arg0 == 5510) {
                class183.method1272((byte) -109);
                return;
            }
            if (arg0 == 5511) {
                int var181 = field1419[--field1427];
                int var182 = var181 >> 14 & 0x3FFF;
                int var183 = var181 & 0x3FFF;
                int var184 = var182 - class473.field6687;
                if (var184 < 0) {
                    var184 = 0;
                } else if (var184 >= class146.field2125) {
                    var184 = class146.field2125;
                }
                int var185 = var183 - class38.field463;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class410.field5609) {
                    var185 = class410.field5609;
                }
                class214.field3160 = (var184 << 7) + 64;
                class399.field5489 = (var185 << 7) + 64;
                class531.field7929 = 4;
                return;
            }
            if (arg0 == 5512) {
                class480.method2890(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1429 -= 2;
                String var186 = field1425[field1429];
                String var187 = field1425[field1429 + 1];
                int var188 = field1419[--field1427];
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    class569.field8400 = var186;
                    class537.field8006 = var187;
                    class84.field1208 = var188;
                    class18.method117((byte) -85, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class178.method1255(5);
                return;
            }
            if (arg0 == 5602) {
                if (class313.field4317 == 0) {
                    class347.field4758 = -2;
                    class43.field501 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field1427 -= 4;
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    class429.method2514(field1419[field1427 + 2], field1419[field1427], (byte) 61, field1419[field1427 + 3], field1419[field1427 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field1429--;
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    class182.method1268(0, class42.method270(field1425[field1429], 114));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1429 -= 2;
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    class113.method821(field1425[field1429 + 1], false, class42.method270(field1425[field1429], 41), (byte) -124);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class467.field6580 == 0) {
                    class593.field8768 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1419[field1427++] = class43.field501;
                return;
            }
            if (arg0 == 5608) {
                field1419[field1427++] = class161.field2375;
                return;
            }
            if (arg0 == 5609) {
                field1419[field1427++] = class593.field8768;
                return;
            }
            if (arg0 == 5610) {
                for (int var189 = 0; var189 < 5; var189++) {
                    field1425[field1429++] = class480.field6820.length > var189 ? class582.method3474(-32281, class480.field6820[var189]) : "";
                }
                class480.field6820 = null;
                return;
            }
            if (arg0 == 5611) {
                field1419[field1427++] = class114.field1602;
                return;
            }
            if (arg0 == 5612) {
                int var190 = field1419[--field1427];
                if (class472.field6670 != 6) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    if (class296.field4075 != null) {
                        class296.field4075.method1830(-120);
                        class296.field4075 = null;
                    }
                    class84.field1208 = var190;
                    class18.method117((byte) -85, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1419[field1427++] = class43.field501;
                return;
            }
            if (arg0 == 5615) {
                field1429 -= 2;
                String var191 = field1425[field1429];
                String var192 = field1425[field1429 + 1];
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    if (class296.field4075 != null) {
                        class296.field4075.method1830(13);
                        class296.field4075 = null;
                    }
                    class569.field8400 = var191;
                    class537.field8006 = var192;
                    class18.method117((byte) -85, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class120.method861(false, -49);
                return;
            }
            if (arg0 == 5617) {
                field1419[field1427++] = class347.field4758;
                return;
            }
            if (arg0 == 5618) {
                int var193 = field1419[--field1427];
                class532.method3210(var193, false, -121);
                return;
            }
            if (arg0 == 5619) {
                int var194 = field1419[--field1427];
                class532.method3210(var194, true, -127);
                return;
            }
            if (arg0 == 5620) {
                class110.method807(false);
                if (class20.field200 != "" && class20.field200 != "") {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1429 -= 2;
                if (class472.field6670 != 2) {
                    return;
                }
                if (class313.field4317 == 0 && class467.field6580 == 0) {
                    class113.method821(field1425[field1429 + 1], true, class42.method270(field1425[field1429], 85), (byte) 72);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class21 var195 = class442.field5896.method2019("3", true, false);
                while (var195.field202 == 0) {
                    class236.method1513(true, 1L);
                }
                if (var195.field202 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class633 var196 = (class633) var195.field201;
                if (var196.method3684(107).exists()) {
                    class148 var197 = new class148(50);
                    try {
                        var196.method3682((byte) -13, var197.field2146, 50, 0);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var196.method3685(-5948);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class183.field2754 != null) {
                    field1419[field1427++] = 1;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var198 = field1419[--field1427];
                if (var198 < 1) {
                    var198 = 1;
                }
                if (var198 > 4) {
                    var198 = 4;
                }
                class56.field668.field6863 = var198;
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6002) {
                class56.field668.method1485((byte) -82, field1419[--field1427] == 1);
                class554.method3346((byte) 5);
                class226.method1452(-128);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6003) {
                class56.field668.field6864 = field1419[--field1427] == 1;
                class226.method1452(-128);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6005) {
                class56.field668.field6837 = field1419[--field1427] == 1;
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6006) {
                class56.field668.field6835 = field1419[--field1427] == 1;
                class99.field1445.method495(!class56.field668.field6835);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6007) {
                class56.field668.field6838 = field1419[--field1427];
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6008) {
                class56.field668.field6836 = field1419[--field1427] == 1;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6009) {
                class56.field668.field6845 = field1419[--field1427] == 1;
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6010) {
                class56.field668.field6868 = field1419[--field1427] == 1;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6011) {
                int var199 = field1419[--field1427];
                if (var199 < 0 || var199 > 2) {
                    var199 = 0;
                }
                class56.field668.method2894(var199, class526.field7533, 0);
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6012) {
                class56.field668.method2893(0, class526.field7533, field1419[--field1427] == 1);
                class226.method1453((byte) 0);
                class232.method1489(8);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6014) {
                class56.field668.field6832 = field1419[--field1427] == 1;
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6015) {
                class56.field668.field6842 = field1419[--field1427] == 1;
                class554.method3346((byte) 5);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6016) {
                int var200 = field1419[--field1427];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class56.field668.field6831 = var200;
                class430.method2521(class526.field7533, -2);
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6017) {
                class56.field668.field6871 = field1419[--field1427] == 1;
                class241.method1537((byte) -76);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6018) {
                int var201 = field1419[--field1427];
                if (var201 < 0) {
                    var201 = 0;
                }
                if (var201 > 127) {
                    var201 = 127;
                }
                class56.field668.field6840 = var201;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6019) {
                int var202 = field1419[--field1427];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 255) {
                    var202 = 255;
                }
                if (class56.field668.field6850 != var202) {
                    if (class56.field668.field6850 == 0 && class625.field9210 != -1) {
                        class604.method3561(class625.field9210, -229575572, false, 0, var202, class333.field4619);
                        class568.field8385 = false;
                    } else if (var202 == 0) {
                        class577.method3435((byte) -109);
                        class568.field8385 = false;
                    } else {
                        class377.method2250(var202, -127);
                    }
                    class56.field668.field6850 = var202;
                }
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6020) {
                int var203 = field1419[--field1427];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 127) {
                    var203 = 127;
                }
                class56.field668.field6873 = var203;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6021) {
                class56.field668.field3351 = field1419[--field1427] == 1;
                class226.method1452(-128);
                return;
            }
            if (arg0 == 6023) {
                int var204 = field1419[--field1427];
                boolean var205 = false;
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 2) {
                    var204 = 2;
                }
                if (class467.field6579 < 96) {
                    var204 = 0;
                    var205 = true;
                }
                class480.method2892(var204, 0);
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                field1419[field1427++] = var205 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var206 = field1419[--field1427];
                if (var206 < 0 || var206 > 2) {
                    var206 = 0;
                }
                class56.field668.field6862 = var206;
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6025) {
                int var207 = field1419[--field1427];
                if (var207 < 0 || var207 > class647.method3731((byte) 86, class467.field6579)) {
                    var207 = 0;
                }
                class56.field668.field6859 = var207;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6027) {
                int var208 = field1419[--field1427];
                if (var208 < 0 || var208 > 1) {
                    var208 = 0;
                }
                class631.method3674((byte) 116, var208 == 1);
                return;
            }
            if (arg0 == 6028) {
                class56.field668.field6834 = field1419[--field1427] != 0;
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6029) {
                class56.field668.field6838 = field1419[--field1427];
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6030) {
                class56.field668.field6853 = field1419[--field1427] != 0;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 6031) {
                int var209 = field1419[--field1427];
                if (var209 < 0 || var209 > 5) {
                    var209 = 2;
                }
                class430.method2521(var209, -2);
                return;
            }
            if (arg0 == 6032) {
                int var210 = field1419[--field1427];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class56.field668.field6872 = var210;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6033) {
                int var211 = field1419[--field1427];
                if (var211 < 0 || var211 > 4) {
                    var211 = 2;
                }
                class56.field668.field6855 = var211;
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6034) {
                class56.field668.field6847 = field1419[--field1427] == 1;
                class56.field668.method1480(class442.field5896, (byte) -69);
                class226.method1453((byte) 0);
                class508.field7214 = false;
                return;
            }
            if (arg0 == 6035) {
                class56.field668.field3343 = field1419[--field1427] == 1;
                class554.method3346((byte) 5);
                class226.method1452(-128);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1419[field1427++] = class56.field668.field6863;
                return;
            }
            if (arg0 == 6102) {
                field1419[field1427++] = class56.field668.method1481((byte) 103, class526.field7533) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1419[field1427++] = class56.field668.field6864 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1419[field1427++] = class56.field668.field6837 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field1419[field1427++] = class56.field668.field6835 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1419[field1427++] = class56.field668.field6838;
                return;
            }
            if (arg0 == 6108) {
                field1419[field1427++] = class56.field668.field6836 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field1419[field1427++] = class56.field668.field6845 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1419[field1427++] = class56.field668.field6868 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1419[field1427++] = class56.field668.method2897(class526.field7533, 6373);
                return;
            }
            if (arg0 == 6112) {
                field1419[field1427++] = class56.field668.method2895(class526.field7533, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1419[field1427++] = class56.field668.field6832 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1419[field1427++] = class56.field668.field6842 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1419[field1427++] = class56.field668.field6831;
                return;
            }
            if (arg0 == 6117) {
                field1419[field1427++] = class56.field668.field6871 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1419[field1427++] = class56.field668.field6840;
                return;
            }
            if (arg0 == 6119) {
                field1419[field1427++] = class56.field668.field6850;
                return;
            }
            if (arg0 == 6120) {
                field1419[field1427++] = class56.field668.field6873;
                return;
            }
            if (arg0 == 6121) {
                field1419[field1427++] = class99.field1445.method508() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field1419[field1427++] = class86.method644((byte) 68);
                return;
            }
            if (arg0 == 6124) {
                field1419[field1427++] = class56.field668.field6862;
                return;
            }
            if (arg0 == 6125) {
                field1419[field1427++] = class56.field668.field6859;
                return;
            }
            if (arg0 == 6126) {
                field1419[field1427++] = class99.field1445.method530() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field1419[field1427++] = class56.field668.field6867 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1419[field1427++] = class56.field668.field6834 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1419[field1427++] = class56.field668.field6838;
                return;
            }
            if (arg0 == 6130) {
                field1419[field1427++] = class56.field668.field6853 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1419[field1427++] = class526.field7533;
                return;
            }
            if (arg0 == 6132) {
                field1419[field1427++] = class56.field668.field6872;
                return;
            }
            if (arg0 == 6133) {
                field1419[field1427++] = class331.field4576 == 1 || class331.field4576 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field1419[field1427++] = class647.method3731((byte) 66, class467.field6579);
                return;
            }
            if (arg0 == 6135) {
                field1419[field1427++] = class56.field668.field6855;
                return;
            }
            if (arg0 == 6136) {
                field1419[field1427++] = class56.field668.field6847 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var212 = true;
                try {
                    var212 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field1419[field1427++] = var212 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1427 -= 2;
                class43.field508 = (short) field1419[field1427];
                if (class43.field508 <= 0) {
                    class43.field508 = 256;
                }
                class428.field5752 = (short) field1419[field1427 + 1];
                if (class428.field5752 <= 0) {
                    class428.field5752 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1427 -= 2;
                class304.field4184 = (short) field1419[field1427];
                if (class304.field4184 <= 0) {
                    class304.field4184 = 256;
                }
                class629.field9244 = (short) field1419[field1427 + 1];
                if (class629.field9244 <= 0) {
                    class629.field9244 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1427 -= 4;
                class129.field1795 = (short) field1419[field1427];
                if (class129.field1795 <= 0) {
                    class129.field1795 = 1;
                }
                class247.field3552 = (short) field1419[field1427 + 1];
                if (class247.field3552 <= 0) {
                    class247.field3552 = 32767;
                } else if (class247.field3552 < class129.field1795) {
                    class247.field3552 = class129.field1795;
                }
                class205.field3052 = (short) field1419[field1427 + 2];
                if (class205.field3052 <= 0) {
                    class205.field3052 = 1;
                }
                class423.field5718 = (short) field1419[field1427 + 3];
                if (class423.field5718 <= 0) {
                    class423.field5718 = 32767;
                    return;
                }
                if (class423.field5718 < class205.field3052) {
                    class423.field5718 = class205.field3052;
                }
                return;
            }
            if (arg0 == 6203) {
                class55.method360((byte) 87, 0, class324.field4470.field2527, 0, class324.field4470.field2459, false);
                field1419[field1427++] = class354.field4828;
                field1419[field1427++] = class549.field8211;
                return;
            }
            if (arg0 == 6204) {
                field1419[field1427++] = class304.field4184;
                field1419[field1427++] = class629.field9244;
                return;
            }
            if (arg0 == 6205) {
                field1419[field1427++] = class43.field508;
                field1419[field1427++] = class428.field5752;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1419[field1427++] = (int) (class598.method3538(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1419[field1427++] = (int) (class598.method3538(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1427 -= 3;
                int var213 = field1419[field1427];
                int var214 = field1419[field1427 + 1];
                int var215 = field1419[field1427 + 2];
                field1416.clear();
                field1416.set(11, 12);
                field1416.set(var215, var214, var213);
                int var216 = (int) (field1416.getTime().getTime() / 86400000L) - 11745;
                if (var215 < 1970) {
                    var216--;
                }
                field1419[field1427++] = var216;
                return;
            }
            if (arg0 == 6303) {
                field1416.clear();
                field1416.setTime(new Date(class598.method3538(true)));
                field1419[field1427++] = field1416.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var217 = field1419[--field1427];
                boolean var218 = true;
                if (var217 < 0) {
                    var218 = (var217 + 1) % 4 == 0;
                } else if (var217 < 1582) {
                    var218 = var217 % 4 == 0;
                } else if (var217 % 4 != 0) {
                    var218 = false;
                } else if (var217 % 100 != 0) {
                    var218 = true;
                } else if (var217 % 400 != 0) {
                    var218 = false;
                }
                field1419[field1427++] = var218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1419[field1427++] = class328.method1964(1) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1419[field1427++] = class78.method605(256) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class472.field6670 == 6 && class313.field4317 == 0 && class467.field6580 == 0) {
                    if (class155.field2315) {
                        field1419[field1427++] = 0;
                        return;
                    }
                    if (class136.field1930 > class598.method3538(true) - 1000L) {
                        field1419[field1427++] = 1;
                        return;
                    }
                    class155.field2315 = true;
                    class402.method2367(class355.field4837, (byte) 106);
                    class112.field1589.method1058(602643080, class79.field1066);
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class187 var219 = class556.method3358((byte) -74);
                if (var219 != null) {
                    field1419[field1427++] = var219.field2784;
                    field1419[field1427++] = var219.field5529;
                    field1425[field1429++] = var219.field2789;
                    class309 var220 = var219.method1290(-22585);
                    field1419[field1427++] = var220.field4270;
                    field1425[field1429++] = var220.field4263;
                    field1419[field1427++] = var219.field5525;
                    field1419[field1427++] = var219.field2787;
                    field1425[field1429++] = var219.field2788;
                    return;
                }
                field1419[field1427++] = -1;
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                return;
            }
            if (arg0 == 6502) {
                class187 var221 = class87.method660(119);
                if (var221 != null) {
                    field1419[field1427++] = var221.field2784;
                    field1419[field1427++] = var221.field5529;
                    field1425[field1429++] = var221.field2789;
                    class309 var222 = var221.method1290(-22585);
                    field1419[field1427++] = var222.field4270;
                    field1425[field1429++] = var222.field4263;
                    field1419[field1427++] = var221.field5525;
                    field1419[field1427++] = var221.field2787;
                    field1425[field1429++] = var221.field2788;
                    return;
                }
                field1419[field1427++] = -1;
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var223 = field1419[--field1427];
                String var224 = field1425[--field1429];
                if (class472.field6670 == 6 && class313.field4317 == 0 && class467.field6580 == 0) {
                    field1419[field1427++] = class72.method585(107, var224, var223) ? 1 : 0;
                    return;
                }
                field1419[field1427++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class56.field668.field6870 = field1419[--field1427];
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6505) {
                field1419[field1427++] = class56.field668.field6870;
                return;
            }
            if (arg0 == 6506) {
                int var225 = field1419[--field1427];
                class187 var226 = class8.method37(var225, -121);
                if (var226 != null) {
                    field1419[field1427++] = var226.field5529;
                    field1425[field1429++] = var226.field2789;
                    class309 var227 = var226.method1290(-22585);
                    field1419[field1427++] = var227.field4270;
                    field1425[field1429++] = var227.field4263;
                    field1419[field1427++] = var226.field5525;
                    field1419[field1427++] = var226.field2787;
                    field1425[field1429++] = var226.field2788;
                    return;
                }
                field1419[field1427++] = -1;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                field1419[field1427++] = 0;
                field1419[field1427++] = 0;
                field1425[field1429++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1427 -= 4;
                int var228 = field1419[field1427];
                boolean var229 = field1419[field1427 + 1] == 1;
                int var230 = field1419[field1427 + 2];
                boolean var231 = field1419[field1427 + 3] == 1;
                class245.method1552(var229, var231, 315, var228, var230);
                return;
            }
            if (arg0 == 6508) {
                class278.method1743(50);
                return;
            }
            if (arg0 == 6509) {
                if (class472.field6670 != 6) {
                    return;
                }
                class372.field5114 = field1419[--field1427] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1419[field1427++] = class517.field7363;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class56.field668.field6852 = field1419[--field1427] == 1;
                class56.field668.method1480(class442.field5896, (byte) -69);
                return;
            }
            if (arg0 == 6601) {
                field1419[field1427++] = class56.field668.field6852 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class586.field8609 == class394.field5426) {
            if (arg0 == 6700) {
                int var232 = class385.field5297.method2803(0);
                if (class340.field4708 != -1) {
                    var232++;
                }
                field1419[field1427++] = var232;
                return;
            }
            if (arg0 == 6701) {
                int var233 = field1419[--field1427];
                if (class340.field4708 != -1) {
                    if (var233 == 0) {
                        field1419[field1427++] = class340.field4708;
                        return;
                    }
                    var233--;
                }
                class243 var234 = (class243) class385.field5297.method2798((byte) -119);
                while (var233-- > 0) {
                    var234 = (class243) class385.field5297.method2806(true);
                }
                field1419[field1427++] = var234.field3471;
                return;
            }
            if (arg0 == 6702) {
                int var235 = field1419[--field1427];
                if (class302.field4135[var235] == null) {
                    field1425[field1429++] = "";
                    return;
                }
                String var236 = class302.field4135[var235][0].field2472;
                if (var236 == null) {
                    field1425[field1429++] = "";
                    return;
                }
                field1425[field1429++] = var236.substring(0, var236.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var237 = field1419[--field1427];
                if (class302.field4135[var237] == null) {
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = class302.field4135[var237].length;
                return;
            }
            if (arg0 == 6704) {
                field1427 -= 2;
                int var238 = field1419[field1427];
                int var239 = field1419[field1427 + 1];
                if (class302.field4135[var238] == null) {
                    field1425[field1429++] = "";
                    return;
                }
                String var240 = class302.field4135[var238][var239].field2472;
                if (var240 == null) {
                    field1425[field1429++] = "";
                    return;
                }
                field1425[field1429++] = var240;
                return;
            }
            if (arg0 == 6705) {
                field1427 -= 2;
                int var241 = field1419[field1427];
                int var242 = field1419[field1427 + 1];
                if (class302.field4135[var241] == null) {
                    field1419[field1427++] = 0;
                    return;
                }
                field1419[field1427++] = class302.field4135[var241][var242].field2436;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field1427 -= 3;
                int var243 = field1419[field1427];
                int var244 = field1419[field1427 + 1];
                int var245 = field1419[field1427 + 2];
                class472.method2844(var243 << 16 | var244, "", var245, 1, false);
                return;
            }
            if (arg0 == 6708) {
                field1427 -= 3;
                int var246 = field1419[field1427];
                int var247 = field1419[field1427 + 1];
                int var248 = field1419[field1427 + 2];
                class472.method2844(var246 << 16 | var247, "", var248, 2, false);
                return;
            }
            if (arg0 == 6709) {
                field1427 -= 3;
                int var249 = field1419[field1427];
                int var250 = field1419[field1427 + 1];
                int var251 = field1419[field1427 + 2];
                class472.method2844(var249 << 16 | var250, "", var251, 3, false);
                return;
            }
            if (arg0 == 6710) {
                field1427 -= 3;
                int var252 = field1419[field1427];
                int var253 = field1419[field1427 + 1];
                int var254 = field1419[field1427 + 2];
                class472.method2844(var252 << 16 | var253, "", var254, 4, false);
                return;
            }
            if (arg0 == 6711) {
                field1427 -= 3;
                int var255 = field1419[field1427];
                int var256 = field1419[field1427 + 1];
                int var257 = field1419[field1427 + 2];
                class472.method2844(var255 << 16 | var256, "", var257, 5, false);
                return;
            }
            if (arg0 == 6712) {
                field1427 -= 3;
                int var258 = field1419[field1427];
                int var259 = field1419[field1427 + 1];
                int var260 = field1419[field1427 + 2];
                class472.method2844(var258 << 16 | var259, "", var260, 6, false);
                return;
            }
            if (arg0 == 6713) {
                field1427 -= 3;
                int var261 = field1419[field1427];
                int var262 = field1419[field1427 + 1];
                int var263 = field1419[field1427 + 2];
                class472.method2844(var261 << 16 | var262, "", var263, 7, false);
                return;
            }
            if (arg0 == 6714) {
                field1427 -= 3;
                int var264 = field1419[field1427];
                int var265 = field1419[field1427 + 1];
                int var266 = field1419[field1427 + 2];
                class472.method2844(var264 << 16 | var265, "", var266, 8, false);
                return;
            }
            if (arg0 == 6715) {
                field1427 -= 3;
                int var267 = field1419[field1427];
                int var268 = field1419[field1427 + 1];
                int var269 = field1419[field1427 + 2];
                class472.method2844(var267 << 16 | var268, "", var269, 9, false);
                return;
            }
            if (arg0 == 6716) {
                field1427 -= 3;
                int var270 = field1419[field1427];
                int var271 = field1419[field1427 + 1];
                int var272 = field1419[field1427 + 2];
                class472.method2844(var270 << 16 | var271, "", var272, 10, false);
                return;
            }
            if (arg0 == 6717) {
                field1427 -= 3;
                int var273 = field1419[field1427];
                int var274 = field1419[field1427 + 1];
                int var275 = field1419[field1427 + 2];
                class162 var276 = class372.method2217(var273 << 16 | var274, 100, var275);
                class429.method2511(true);
                class625 var277 = client.method1599(var276);
                class627.method3665(var277.field9205, var277.method3658(-118), var276, (byte) 36);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var278 = field1419[--field1427];
                class308 var279 = class440.field5876.method3058(var278, 0);
                if (var279.field4235 == null) {
                    field1425[field1429++] = "";
                    return;
                }
                field1425[field1429++] = var279.field4235;
                return;
            }
            if (arg0 == 6801) {
                int var280 = field1419[--field1427];
                class308 var281 = class440.field5876.method3058(var280, 0);
                field1419[field1427++] = var281.field4252;
                return;
            }
            if (arg0 == 6802) {
                int var282 = field1419[--field1427];
                class308 var283 = class440.field5876.method3058(var282, 0);
                field1419[field1427++] = var283.field4227;
                return;
            }
            if (arg0 == 6803) {
                int var284 = field1419[--field1427];
                class308 var285 = class440.field5876.method3058(var284, 0);
                field1419[field1427++] = var285.field4246;
                return;
            }
            if (arg0 == 6804) {
                field1427 -= 2;
                int var286 = field1419[field1427];
                int var287 = field1419[field1427 + 1];
                class178 var288 = class516.field7358.method1274(117, var287);
                if (var288.method1257((byte) -114)) {
                    field1425[field1429++] = class440.field5876.method3058(var286, 0).method1888(var288.field2722, 3111, var287);
                    return;
                }
                field1419[field1427++] = class440.field5876.method3058(var286, 0).method1883(var287, var288.field2720, 17);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field1419[field1427++] = class266.field3763 && !class510.field7259 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field1419[field1427++] = class556.field8281;
                return;
            }
            if (arg0 == 6902) {
                field1419[field1427++] = class539.field8025;
                return;
            }
            if (arg0 == 6903) {
                field1419[field1427++] = class117.field1643;
                return;
            }
            if (arg0 == 6904) {
                field1419[field1427++] = class120.field1691;
                return;
            }
            if (arg0 == 6905) {
                String var289 = "";
                if (class283.field3960 != null) {
                    if (class283.field3960.field201 == null) {
                        var289 = class487.method2919((byte) -115, class283.field3960.field205);
                    } else {
                        var289 = (String) class283.field3960.field201;
                    }
                }
                field1425[field1429++] = var289;
                return;
            }
            if (arg0 == 6906) {
                field1419[field1427++] = class452.field6386;
                return;
            }
            if (arg0 == 6907) {
                field1419[field1427++] = class596.field8822;
                return;
            }
            if (arg0 == 6908) {
                field1419[field1427++] = class24.field234;
                return;
            }
            if (arg0 == 6909) {
                field1419[field1427++] = class223.field3233 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field1419[field1427++] = class49.field574;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var290 = class56.field668.method1476((byte) -15);
                field1419[field1427++] = class56.field668.field3362 = class526.field7533;
                field1419[field1427++] = var290;
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 7001) {
                class56.field668.method1475(-1);
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 7002) {
                class56.field668.method1471(1);
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 7003) {
                class56.field668.method1484(true);
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 7004) {
                class56.field668.method1478((byte) 113);
                class554.method3346((byte) 5);
                return;
            }
            if (arg0 == 7005) {
                class56.field668.field6857 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class56.field668.field3362 == 2) {
                    class56.field668.field3344 = true;
                    return;
                }
                if (class56.field668.field3362 == 1) {
                    class56.field668.field3350 = true;
                    return;
                }
                if (class56.field668.field3362 == 3) {
                    class56.field668.field3361 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field1419[field1427++] = class56.field668.field6857;
                return;
            }
            if (arg0 == 7008) {
                if (class526.field7533 == 0 && class467.field6579 < 96) {
                    field1419[field1427++] = 2;
                    return;
                }
                field1419[field1427++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lod;I)V")
    private static final void method754(class433 arg0, int arg1) {
        field1427 = 0;
        field1429 = 0;
        int var2 = -1;
        int[] var3 = arg0.field5804;
        int[] var4 = arg0.field5799;
        byte var5 = -1;
        field1433 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method747(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method753(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1419[field1427++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1419[field1427++] = class556.field8280.field5300[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class556.field8280.method2292(field1419[--field1427], var8, 0);
                } else if (var43 == 3) {
                    field1425[field1429++] = arg0.field5795[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1427 -= 2;
                    if (field1419[field1427 + 1] != field1419[field1427]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1427 -= 2;
                    if (field1419[field1427 + 1] == field1419[field1427]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1427 -= 2;
                    if (field1419[field1427] < field1419[field1427 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1427 -= 2;
                    if (field1419[field1427] > field1419[field1427 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1433 == 0) {
                        return;
                    }
                    class42 var9 = field1415[--field1433];
                    arg0 = var9.field489;
                    var3 = arg0.field5804;
                    var4 = arg0.field5799;
                    var2 = var9.field494;
                    field1418 = var9.field492;
                    field1426 = var9.field487;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1419[field1427++] = class556.field8280.method141((byte) -110, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class556.field8280.method2294((byte) -65, var11, field1419[--field1427]);
                } else if (var43 == 31) {
                    field1427 -= 2;
                    if (field1419[field1427] <= field1419[field1427 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1427 -= 2;
                    if (field1419[field1427] >= field1419[field1427 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1419[field1427++] = field1418[var4[var2]];
                } else if (var43 == 34) {
                    field1418[var4[var2]] = field1419[--field1427];
                } else if (var43 == 35) {
                    field1425[field1429++] = field1426[var4[var2]];
                } else if (var43 == 36) {
                    field1426[var4[var2]] = field1425[--field1429];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1429 -= var12;
                    String var13 = class26.method161(field1429, var12, field1425, -2178);
                    field1425[field1429++] = var13;
                } else if (var43 == 38) {
                    field1427--;
                } else if (var43 == 39) {
                    field1429--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class433 var15 = class524.method3091(8, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field5797];
                    String[] var17 = new String[var15.field5798];
                    for (int var18 = 0; var18 < var15.field5792; var18++) {
                        var16[var18] = field1419[field1427 + var18 - var15.field5792];
                    }
                    for (int var19 = 0; var19 < var15.field5805; var19++) {
                        var17[var19] = field1425[field1429 + var19 - var15.field5805];
                    }
                    field1427 -= var15.field5792;
                    field1429 -= var15.field5805;
                    class42 var20 = new class42();
                    var20.field489 = arg0;
                    var20.field494 = var2;
                    var20.field492 = field1418;
                    var20.field487 = field1426;
                    if (field1433 >= field1415.length) {
                        throw new RuntimeException();
                    }
                    field1415[field1433++] = var20;
                    arg0 = var15;
                    var3 = var15.field5804;
                    var4 = var15.field5799;
                    var2 = -1;
                    field1418 = var16;
                    field1426 = var17;
                } else if (var43 == 42) {
                    field1419[field1427++] = class624.field9201[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class624.field9201[var21] = field1419[--field1427];
                    class499.method2979(var21, -102);
                    class348.field4774 |= class428.field5753[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1419[--field1427];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1417[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1422[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1419[--field1427];
                    if (var28 < 0 || var28 >= field1417[var27]) {
                        throw new RuntimeException();
                    }
                    field1419[field1427++] = field1422[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1427 -= 2;
                    int var30 = field1419[field1427];
                    if (var30 < 0 || var30 >= field1417[var29]) {
                        throw new RuntimeException();
                    }
                    field1422[var29][var30] = field1419[field1427 + 1];
                } else if (var43 == 47) {
                    String var31 = class569.field8398[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1425[field1429++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class569.field8398[var32] = field1425[--field1429];
                    class169.method1203(var32, -102);
                } else if (var43 == 51) {
                    class465 var33 = arg0.field5794[var4[var2]];
                    class556 var34 = (class556) var33.method2799((long) field1419[--field1427], true);
                    if (var34 != null) {
                        var2 += var34.field8278;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field5801 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5651).append(" ");
                for (int var41 = field1433 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1415[var41].field489.field5651).append(" ");
                }
                var40.append("op: ").append(var5);
                class378.method2255(var42, var40.toString(), -74);
            } else {
                class568.method3389(-112, "Clientscript error in: " + arg0.field5801);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field5801).append("\n");
                for (int var38 = field1433 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1415[var38].field489.field5801).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class378.method2255(var42, var37.toString(), -74);
                class393.method2337(var37.toString(), 1);
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lsl;II)V")
    public static final void method755(class391 arg0, int arg1, int arg2) {
        class433 var3 = class329.method1996(arg0, arg2, 252, arg1);
        if (var3 == null) {
            return;
        }
        field1418 = new int[var3.field5797];
        field1426 = new String[var3.field5798];
        if (class488.field6936 == var3.field5802 || class241.field3460 == var3.field5802 || class171.field2666 == var3.field5802) {
            int var4 = 0;
            int var5 = 0;
            if (class437.field5843 != null) {
                var4 = class437.field5843.field2449;
                var5 = class437.field5843.field2507;
            }
            field1418[0] = class623.field9182.method1587((byte) 35) - var4;
            field1418[1] = class623.field9182.method1594(2028208128) - var5;
        }
        method754(var3, 200000);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "()V")
    public static void method756() {
        field1418 = null;
        field1426 = null;
        field1417 = null;
        field1422 = null;
        field1419 = null;
        field1425 = null;
        field1415 = null;
        field1435 = null;
        field1439 = null;
        field1434 = null;
        field1416 = null;
        field1440 = null;
        field1441 = null;
        field1442 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lqs;)V")
    public static final void method757(class518 arg0) {
        method758(arg0, 200000);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lqs;I)V")
    private static final void method758(class518 arg0, int arg1) {
        Object[] var2 = arg0.field7383;
        int var3 = (Integer) var2[0];
        class433 var4 = class524.method3091(8, var3);
        if (var4 == null) {
            return;
        }
        field1418 = new int[var4.field5797];
        int var5 = 0;
        field1426 = new String[var4.field5798];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7379;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7386;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7376 == null ? -1 : arg0.field7376.field2456;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7381;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7376 == null ? -1 : arg0.field7376.field2415;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7384 == null ? -1 : arg0.field7384.field2456;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7384 == null ? -1 : arg0.field7384.field2415;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7385;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7382;
                }
                field1418[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7389;
                }
                field1426[var6++] = var9;
            }
        }
        field1443 = arg0.field7390;
        method754(var4, arg1);
    }
}
