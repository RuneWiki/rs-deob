import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Z")
    public static boolean field1450 = false;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lsf;")
    private static class108 field1474 = class140.method973(255, "Attack");

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lsf;")
    public static class108 field1453 = field1474;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Lja;")
    public static class64 field1456 = class170.method1177(20381);

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static volatile int field1475 = -1;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "[S")
    public static short[] field1477 = new short[256];

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Lsf;")
    public static class108 field1476 = class140.method973(255, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "Lsf;")
    public static class108 field1478 = class140.method973(255, "<col=80ff00>");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public int field1457;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public int field1460;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public int field1462;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field1465;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public int field1473;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lji;")
    public static class106 field1448;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lik;")
    public static class262 field1479;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "Z")
    public static boolean field1472;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V", line = 4)
    public static final void method616(int arg0, int arg1) {
        field1461++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class313.field5405[arg1];
        int var3 = class94.field1506[arg1];
        if (arg0 <= 1) {
            return;
        }
        int var4 = (int) class131.field2244[arg1];
        int var5 = class305.field5299[arg1];
        long var6 = class131.field2244[arg1];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        if (var5 == 45) {
            class270.field4726++;
            if (class223.field3947 == 1) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            } else {
                boolean var8 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
                if (!var8) {
                    class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
                }
            }
            class318.field5466 = 2;
            class54.field792 = class87.field1382;
            class307.field5344 = class170.field3041;
            class259.field4578 = 0;
            class256.field4471.method1427(108, 0);
            class256.field4471.method1724(false, var4);
            class256.field4471.method1761(125, class305.field5295 + var2);
            class256.field4471.method1761(108, var3 + class137.field2421);
        }
        if (var5 == 40) {
            class3.field57++;
            boolean var10 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
            if (!var10) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            }
            class259.field4578 = 0;
            class318.field5466 = 2;
            class307.field5344 = class170.field3041;
            class54.field792 = class87.field1382;
            class256.field4471.method1427(229, 0);
            class256.field4471.method1754(var4, -47);
            class256.field4471.method1754(class137.field2421 + var3, 7);
            class256.field4471.method1724(false, class237.field4157);
            class256.field4471.method1729(var2 + class305.field5295, 4110);
            class256.field4471.method1765(class132.field2262, 0);
            class256.field4471.method1729(class14.field160, 4110);
        }
        if (var5 == 1) {
            class172.field3138++;
            if (class223.field3947 == 1) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            } else {
                boolean var12 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
                if (!var12) {
                    class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
                }
            }
            class54.field792 = class87.field1382;
            class259.field4578 = 0;
            class318.field5466 = 2;
            class307.field5344 = class170.field3041;
            class256.field4471.method1427(215, 0);
            class256.field4471.method1729(var3 + class137.field2421, 4110);
            class256.field4471.method1761(-115, var4);
            class256.field4471.method1754(class305.field5295 + var2, 119);
        }
        if (var5 == 3) {
            class98 var14 = class45.method324(var2, var3, (byte) 77);
            if (var14 != null) {
                class307.method2152(1);
                class54.method376(26121, class134.method917((byte) -99, client.method1815(var14)), var2, var3);
                class84.field1347 = 0;
                class72.field1103 = class176.method1244(var14, (byte) -119);
                if (class72.field1103 == null) {
                    class72.field1103 = class100.field1761;
                }
                if (var14.field1640) {
                    class131.field2248 = class117.method833(new class108[] { var14.field1669, class282.field4941 }, false);
                } else {
                    class131.field2248 = class117.method833(new class108[] { class308.field5349, var14.field1718, class282.field4941 }, false);
                }
            }
            return;
        }
        if (var5 == 37) {
            class281.field4917++;
            class256.field4471.method1427(147, 0);
            class256.field4471.method1724(false, var4);
            class256.field4471.method1761(-99, var2);
            class256.field4471.method1765(var3, 0);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 49 && class29.method214(65280, var6, var3, var2)) {
            class297.field5169++;
            class256.field4471.method1427(38, 0);
            class256.field4471.method1741(class132.field2262, -1580277072);
            class256.field4471.method1729(var3 + class137.field2421, 4110);
            class256.field4471.method1754(class14.field160, 107);
            class256.field4471.method1761(-49, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class256.field4471.method1729(class237.field4157, 4110);
            class256.field4471.method1761(-71, class305.field5295 + var2);
        }
        if (var5 == 7) {
            class51 var15 = class96.field1558[var4];
            if (var15 != null) {
                class190.field3455++;
                class328.method2245(var15.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var15.field4498[0], 1);
                class259.field4578 = 0;
                class307.field5344 = class170.field3041;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(204, 0);
                class256.field4471.method1765(class163.field2927, 0);
                class256.field4471.method1724(false, class218.field3873);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 23) {
            if (var4 == 0) {
                class266.field4676 = true;
                class274.method1984(class295.field5159, var2, var3);
            } else if (class299.field5191 > 0 && class144.field2529[82] && class144.field2529[81]) {
                method624(false, class137.field2421 + var3, class305.field5295 + var2, class295.field5159);
            } else {
                class199.field3580++;
                class256.field4471.method1427(133, 0);
                class256.field4471.method1729(class305.field5295 + var2, 4110);
                class256.field4471.method1761(-9, class137.field2421 + var3);
            }
        }
        if (var5 == 5) {
            if (class223.field3947 == 1) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            } else {
                boolean var16 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
                if (!var16) {
                    class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
                }
            }
            class54.field792 = class87.field1382;
            class318.field5466 = 2;
            class307.field5344 = class170.field3041;
            class259.field4578 = 0;
            class296.field5163++;
            class256.field4471.method1427(135, 0);
            class256.field4471.method1729(class137.field2421 + var3, 4110);
            class256.field4471.method1754(class305.field5295 + var2, 122);
            class256.field4471.method1729(var4, 4110);
        }
        if (var5 == 15) {
            class51 var18 = class96.field1558[var4];
            if (var18 != null) {
                class328.method2245(var18.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var18.field4498[0], 1);
                class259.field4578 = 0;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class135.field2333++;
                class307.field5344 = class170.field3041;
                class256.field4471.method1427(240, 0);
                class256.field4471.method1754(var4, -30);
            }
        }
        if (var5 == 1002) {
            class259.field4578 = 0;
            class307.field5344 = class170.field3041;
            class54.field792 = class87.field1382;
            class318.field5466 = 2;
            class45 var19 = class159.field2863[var4];
            if (var19 != null) {
                class136 var20 = var19.field646;
                if (var20.field2396 != null) {
                    var20 = var20.method938((byte) -35);
                }
                if (var20 != null) {
                    class256.field4471.method1427(134, 0);
                    class52.field769++;
                    class256.field4471.method1729(var20.field2364, 4110);
                }
            }
        }
        if (var5 == 18) {
            class256.field4471.method1427(238, 0);
            class256.field4471.method1719(var3, -1979038456);
            class247.field4276++;
            class256.field4471.method1761(-119, var2);
            class256.field4471.method1754(var4, -111);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 16) {
            class256.field4471.method1427(66, 0);
            class233.field4130++;
            class256.field4471.method1754(var4, -82);
            class256.field4471.method1754(var2, 98);
            class256.field4471.method1741(var3, -1580277072);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 24) {
            class29.method214(65280, var6, var3, var2);
            class256.field4471.method1427(169, 0);
            class256.field4471.method1724(false, class305.field5295 + var2);
            class273.field4779++;
            class256.field4471.method1754(var3 + class137.field2421, 103);
            class256.field4471.method1761(114, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var5 == 33) {
            class162.field2894++;
            if (class223.field3947 == 1) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            } else {
                boolean var21 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
                if (!var21) {
                    class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
                }
            }
            class54.field792 = class87.field1382;
            class318.field5466 = 2;
            class259.field4578 = 0;
            class307.field5344 = class170.field3041;
            class256.field4471.method1427(67, 0);
            class256.field4471.method1724(false, var4);
            class256.field4471.method1729(class137.field2421 + var3, 4110);
            class256.field4471.method1724(false, var2 + class305.field5295);
        }
        if (var5 == 60) {
            class10.field122++;
            class29.method214(65280, var6, var3, var2);
            class256.field4471.method1427(56, 0);
            class256.field4471.method1729(class305.field5295 + var2, 4110);
            class256.field4471.method1724(false, Integer.MAX_VALUE & (int) (var6 >>> 32));
            class256.field4471.method1729(class137.field2421 + var3, 4110);
        }
        if (var5 == 32) {
            class45 var23 = class159.field2863[var4];
            if (var23 != null) {
                class248.field4300++;
                class328.method2245(var23.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var23.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class54.field792 = class87.field1382;
                class259.field4578 = 0;
                class318.field5466 = 2;
                class256.field4471.method1427(91, 0);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 44 && class29.method214(65280, var6, var3, var2)) {
            class135.field2335++;
            class256.field4471.method1427(246, 0);
            class256.field4471.method1724(false, class137.field2421 + var3);
            class256.field4471.method1724(false, class218.field3873);
            class256.field4471.method1719(class163.field2927, -1979038456);
            class256.field4471.method1724(false, var2 + class305.field5295);
            class256.field4471.method1729((int) (var6 >>> 32) & Integer.MAX_VALUE, 4110);
        }
        if (var5 == 59) {
            class17.field212++;
            class256.field4471.method1427(122, 0);
            class256.field4471.method1754(var4, 115);
            class256.field4471.method1729(var2, 4110);
            class256.field4471.method1707(var3, 255);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 12 && class175.field3197 == null) {
            class135.method923(-104, var3, var2);
            class175.field3197 = class45.method324(var2, var3, (byte) 77);
            class195.method1388(-82, class175.field3197);
        }
        if (var5 == 19) {
            class45 var24 = class159.field2863[var4];
            if (var24 != null) {
                class54.field791++;
                class328.method2245(var24.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var24.field4498[0], 1);
                class259.field4578 = 0;
                class54.field792 = class87.field1382;
                class318.field5466 = 2;
                class307.field5344 = class170.field3041;
                class256.field4471.method1427(245, 0);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 1004) {
            class219.field3894++;
            class29.method214(65280, var6, var3, var2);
            class256.field4471.method1427(30, 0);
            class256.field4471.method1729(class137.field2421 + var3, 4110);
            class256.field4471.method1761(120, class305.field5295 + var2);
            class256.field4471.method1761(-79, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var5 == 36) {
            class256.field4471.method1427(155, 0);
            class117.field2033++;
            class256.field4471.method1741(var3, -1580277072);
            class98 var25 = class168.method1173(var3, -1456948048);
            if (var25.field1642 != null && var25.field1642[0][0] == 5) {
                int var26 = var25.field1642[0][1];
                class261.field4594[var26] = 1 - class261.field4594[var26];
                class330.method2258(var26, -102);
            }
        }
        if (var5 == 20) {
            class210.field3752++;
            class256.field4471.method1427(249, 0);
            class256.field4471.method1724(false, var4);
            class256.field4471.method1754(var2, -15);
            class256.field4471.method1707(var3, 255);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 1005) {
            class294.field5132++;
            class259.field4578 = 0;
            class54.field792 = class87.field1382;
            class318.field5466 = 2;
            class307.field5344 = class170.field3041;
            class256.field4471.method1427(127, 0);
            class256.field4471.method1754(var4, 123);
        }
        if (var5 == 42) {
            class256.field4471.method1427(163, 0);
            class256.field4471.method1741(var3, -1580277072);
            class256.field4471.method1761(107, class14.field160);
            class256.field4471.method1719(class132.field2262, -1979038456);
            class53.field779++;
            class256.field4471.method1761(-42, var2);
            class256.field4471.method1754(class237.field4157, 16);
            class256.field4471.method1729(var4, 4110);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 10) {
            if (var4 == 0) {
                class220.field3915 = true;
                class274.method1984(class295.field5159, var2, var3);
            } else if (var4 == 1) {
                class256.field4471.method1427(110, 0);
                class256.field4471.method1729(class305.field5295 + var2, 4110);
                class140.field2464++;
                class256.field4471.method1729(class218.field3873, 4110);
                class256.field4471.method1741(class163.field2927, -1580277072);
                class256.field4471.method1724(false, class137.field2421 + var3);
            }
        }
        if (var5 == 30) {
            class45 var27 = class159.field2863[var4];
            if (var27 != null) {
                class328.method2245(var27.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var27.field4498[0], 1);
                class54.field792 = class87.field1382;
                class318.field5466 = 2;
                class247.field4278++;
                class259.field4578 = 0;
                class307.field5344 = class170.field3041;
                class256.field4471.method1427(206, 0);
                class256.field4471.method1707(class163.field2927, 255);
                class256.field4471.method1754(var4, -34);
                class256.field4471.method1754(class218.field3873, -111);
            }
        }
        if (var5 == 35) {
            class256.field4471.method1427(243, 0);
            class256.field4471.method1761(-23, var4);
            class19.field283++;
            class256.field4471.method1741(class163.field2927, -1580277072);
            class256.field4471.method1729(var2, 4110);
            class256.field4471.method1724(false, class218.field3873);
            class256.field4471.method1765(var3, 0);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 43) {
            class256.field4471.method1427(222, 0);
            class256.field4471.method1724(false, var4);
            class278.field4876++;
            class256.field4471.method1724(false, var2);
            class256.field4471.method1707(var3, 255);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 4) {
            class51 var28 = class96.field1558[var4];
            if (var28 != null) {
                class328.method2245(var28.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var28.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class259.field4578 = 0;
                class185.field3396++;
                class54.field792 = class87.field1382;
                class318.field5466 = 2;
                class256.field4471.method1427(72, 0);
                class256.field4471.method1754(var4, 9);
            }
        }
        if (var5 == 22) {
            class51 var29 = class96.field1558[var4];
            if (var29 != null) {
                class328.method2245(var29.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var29.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class168.field3024++;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class259.field4578 = 0;
                class256.field4471.method1427(144, 0);
                class256.field4471.method1765(class132.field2262, 0);
                class256.field4471.method1754(class237.field4157, 6);
                class256.field4471.method1754(class14.field160, 127);
                class256.field4471.method1754(var4, -49);
            }
        }
        if (var5 == 48) {
            class98 var30 = class168.method1173(var3, -1456948048);
            boolean var31 = true;
            if (var30.field1698 > 0) {
                var31 = class34.method240(250, var30);
            }
            if (var31) {
                class256.field4471.method1427(155, 0);
                class256.field4471.method1741(var3, -1580277072);
                class117.field2033++;
            }
        }
        if (var5 == 1003) {
            class259.field4578 = 0;
            class54.field792 = class87.field1382;
            class307.field5344 = class170.field3041;
            class318.field5466 = 2;
            class256.field4471.method1427(216, 0);
            class136.field2407++;
            class256.field4471.method1729(var4, 4110);
        }
        if (var5 == 25) {
            class29.method214(65280, var6, var3, var2);
            class190.field3452++;
            class256.field4471.method1427(186, 0);
            class256.field4471.method1724(false, class305.field5295 + var2);
            class256.field4471.method1754(class137.field2421 + var3, 114);
            class256.field4471.method1724(false, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var5 == 57) {
            class51 var32 = class96.field1558[var4];
            if (var32 != null) {
                class277.field4834++;
                class328.method2245(var32.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var32.field4498[0], 1);
                class318.field5466 = 2;
                class259.field4578 = 0;
                class54.field792 = class87.field1382;
                class307.field5344 = class170.field3041;
                class256.field4471.method1427(136, 0);
                class256.field4471.method1754(var4, -43);
            }
        }
        if (var5 == 13) {
            class45 var33 = class159.field2863[var4];
            if (var33 != null) {
                class328.method2245(var33.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var33.field4498[0], 1);
                class318.field5466 = 2;
                class147.field2649++;
                class307.field5344 = class170.field3041;
                class259.field4578 = 0;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(185, 0);
                class256.field4471.method1724(false, class14.field160);
                class256.field4471.method1761(120, var4);
                class256.field4471.method1724(false, class237.field4157);
                class256.field4471.method1719(class132.field2262, -1979038456);
            }
        }
        if (var5 == 58) {
            class45 var34 = class159.field2863[var4];
            if (var34 != null) {
                class328.method2245(var34.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var34.field4498[0], 1);
                class255.field4436++;
                class259.field4578 = 0;
                class307.field5344 = class170.field3041;
                class54.field792 = class87.field1382;
                class318.field5466 = 2;
                class256.field4471.method1427(221, 0);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 21) {
            class256.field4471.method1427(188, 0);
            class256.field4471.method1754(var2, 109);
            class232.field4102++;
            class256.field4471.method1719(class163.field2927, -1979038456);
            class256.field4471.method1761(-25, class218.field3873);
            class256.field4471.method1765(var3, 0);
        }
        if (var5 == 39) {
            class307.method2152(1);
            class98 var35 = class168.method1173(var3, -1456948048);
            class237.field4157 = var4;
            class84.field1347 = 1;
            class14.field160 = var2;
            class132.field2262 = var3;
            class195.method1388(-82, var35);
            class331.field5662 = class117.method833(new class108[] { class320.field5486, class144.method994(true, var4).field2610, class282.field4941 }, false);
            if (class331.field5662 == null) {
                class331.field5662 = class120.field2053;
            }
            return;
        }
        if (var5 == 9) {
            class51 var36 = class96.field1558[var4];
            if (var36 != null) {
                class216.field3855++;
                class328.method2245(var36.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var36.field4498[0], 1);
                class259.field4578 = 0;
                class307.field5344 = class170.field3041;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(219, 0);
                class256.field4471.method1724(false, var4);
            }
        }
        if (var5 == 11) {
            class156.method1091(0);
        }
        if (var5 == 50) {
            class237.field4155++;
            class256.field4471.method1427(78, 0);
            class256.field4471.method1724(false, var2);
            class256.field4471.method1765(var3, 0);
            class256.field4471.method1729(var4, 4110);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 14) {
            class256.field4471.method1427(116, 0);
            class256.field4471.method1761(123, var2);
            class9.field105++;
            class256.field4471.method1754(var4, -2);
            class256.field4471.method1741(var3, -1580277072);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 2) {
            class45 var37 = class159.field2863[var4];
            if (var37 != null) {
                class328.method2245(var37.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var37.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class259.field4578 = 0;
                class318.field5466 = 2;
                class130.field2222++;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(117, 0);
                class256.field4471.method1724(false, var4);
            }
        }
        if (var5 == 17) {
            if (var4 == 0) {
                class274.method1984(class295.field5159, var2, var3);
            } else if (var4 == 1) {
                if (class299.field5191 > 0 && class144.field2529[82] && class144.field2529[81]) {
                    method624(false, class137.field2421 + var3, class305.field5295 + var2, class295.field5159);
                } else if (class328.method2245(var3, class95.field1513.field4482[0], 0, 1, true, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0)) {
                    class256.field4471.method1759(-32768, class169.field3029);
                    class256.field4471.method1759(-32768, class174.field3180);
                    class256.field4471.method1724(false, class186.field3423);
                    class256.field4471.method1759(-32768, 57);
                    class256.field4471.method1759(-32768, class328.field5609);
                    class256.field4471.method1759(-32768, class272.field4775);
                    class256.field4471.method1759(-32768, 89);
                    class256.field4471.method1724(false, class95.field1513.field4452);
                    class256.field4471.method1724(false, class95.field1513.field4457);
                    class256.field4471.method1759(-32768, class84.field1328);
                    class256.field4471.method1759(-32768, 63);
                }
            }
        }
        if (var5 == 26) {
            class51 var38 = class96.field1558[var4];
            if (var38 != null) {
                class328.method2245(var38.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var38.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class54.field789++;
                class259.field4578 = 0;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(168, 0);
                class256.field4471.method1754(var4, 118);
            }
        }
        if (var5 == 47) {
            if (class223.field3947 == 1) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            } else {
                boolean var39 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
                if (!var39) {
                    class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
                }
            }
            class318.field5466 = 2;
            class54.field792 = class87.field1382;
            class55.field805++;
            class307.field5344 = class170.field3041;
            class259.field4578 = 0;
            class256.field4471.method1427(192, 0);
            class256.field4471.method1724(false, class137.field2421 + var3);
            class256.field4471.method1761(111, var2 + class305.field5295);
            class256.field4471.method1754(var4, 103);
        }
        if (var5 == 51) {
            class51 var41 = class96.field1558[var4];
            if (var41 != null) {
                class147.field2638++;
                class328.method2245(var41.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var41.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class259.field4578 = 0;
                class318.field5466 = 2;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(230, 0);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 28) {
            class45 var42 = class159.field2863[var4];
            if (var42 != null) {
                class39.field543++;
                class328.method2245(var42.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var42.field4498[0], 1);
                class54.field792 = class87.field1382;
                class318.field5466 = 2;
                class259.field4578 = 0;
                class307.field5344 = class170.field3041;
                class256.field4471.method1427(123, 0);
                class256.field4471.method1729(var4, 4110);
            }
        }
        if (var5 == 31) {
            class29.method214(65280, var6, var3, var2);
            class256.field4471.method1427(9, 0);
            class3.field51++;
            class256.field4471.method1724(false, class137.field2421 + var3);
            class256.field4471.method1754(Integer.MAX_VALUE & (int) (var6 >>> 32), -22);
            class256.field4471.method1729(var2 + class305.field5295, 4110);
        }
        if (var5 == 29) {
            class51 var43 = class96.field1558[var4];
            if (var43 != null) {
                class328.method2245(var43.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var43.field4498[0], 1);
                class307.field5344 = class170.field3041;
                class54.field792 = class87.field1382;
                class259.field4578 = 0;
                class51.field724++;
                class318.field5466 = 2;
                class256.field4471.method1427(158, 0);
                class256.field4471.method1754(var4, -104);
            }
        }
        if (var5 == 38) {
            class256.field4471.method1427(26, 0);
            class166.field2983++;
            class256.field4471.method1741(var3, -1580277072);
            class256.field4471.method1754(var2, -34);
            class256.field4471.method1724(false, var4);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 1006) {
            class98 var44 = class168.method1173(var3, -1456948048);
            if (var44 == null || var44.field1671[var2] < 100000) {
                class256.field4471.method1427(127, 0);
                class256.field4471.method1754(var4, 108);
                class294.field5132++;
            } else {
                class210.method1456(class117.method833(new class108[] { class79.method518(false, var44.field1671[var2]), class196.field3541, class144.method994(true, var4).field2610 }, false), 0, -108, class63.field1016);
            }
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 6) {
            class256.field4471.method1427(155, 0);
            class117.field2033++;
            class256.field4471.method1741(var3, -1580277072);
            class98 var45 = class168.method1173(var3, -1456948048);
            if (var45.field1642 != null && var45.field1642[0][0] == 5) {
                int var46 = var45.field1642[0][1];
                if (class261.field4594[var46] != var45.field1641[0]) {
                    class261.field4594[var46] = var45.field1641[0];
                    class330.method2258(var46, -119);
                }
            }
        }
        if (var5 == 46) {
            class246.field4265++;
            boolean var47 = class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 0, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 0);
            if (!var47) {
                class328.method2245(var3, class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var2, 1);
            }
            class307.field5344 = class170.field3041;
            class54.field792 = class87.field1382;
            class259.field4578 = 0;
            class318.field5466 = 2;
            class256.field4471.method1427(214, 0);
            class256.field4471.method1724(false, class137.field2421 + var3);
            class256.field4471.method1754(class305.field5295 + var2, 126);
            class256.field4471.method1724(false, var4);
            class256.field4471.method1754(class218.field3873, 127);
            class256.field4471.method1719(class163.field2927, -1979038456);
        }
        if (var5 == 8) {
            class256.field4471.method1427(43, 0);
            class256.field4471.method1729(var2, 4110);
            class259.field4565++;
            class256.field4471.method1707(var3, 255);
            class256.field4471.method1754(var4, -114);
            class94.field1505 = 0;
            class249.field4321 = class168.method1173(var3, -1456948048);
            class63.field1020 = var2;
        }
        if (var5 == 34 || var5 == 1001) {
            class8.method44(class317.field5454[arg1], (byte) -18, var3, var2, var4);
        }
        if (var5 == 41) {
            class51 var49 = class96.field1558[var4];
            if (var49 != null) {
                class149.field2726++;
                class328.method2245(var49.field4482[0], class95.field1513.field4482[0], 0, 2, false, 1, class95.field1513.field4498[0], 0, (byte) -101, 0, var49.field4498[0], 1);
                class318.field5466 = 2;
                class307.field5344 = class170.field3041;
                class259.field4578 = 0;
                class54.field792 = class87.field1382;
                class256.field4471.method1427(130, 0);
                class256.field4471.method1761(112, var4);
            }
        }
        if (class84.field1347 != 0) {
            class84.field1347 = 0;
            class195.method1388(-82, class168.method1173(class132.field2262, -1456948048));
        }
        if (class172.field3132) {
            class307.method2152(1);
        }
        if (class249.field4321 != null && class94.field1505 == 0) {
            class195.method1388(-82, class249.field4321);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Z", line = 1073)
    public static final boolean method617(boolean arg0) throws IOException {
        field1442++;
        if (class14.field161 == null) {
            return false;
        }
        int var1 = class14.field161.method1486(7);
        if (var1 == 0) {
            return false;
        }
        if (class191.field3457 == -1) {
            class14.field161.method1478(0, 1, false, class293.field5127.field4338);
            class293.field5127.field4314 = 0;
            var1--;
            class191.field3457 = class293.field5127.method1428((byte) 121);
            class191.field3471 = class186.field3410[class191.field3457];
        }
        if (class191.field3471 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class14.field161.method1478(0, 1, false, class293.field5127.field4338);
            class191.field3471 = class293.field5127.field4338[0] & 0xFF;
        }
        if (class191.field3471 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class14.field161.method1478(0, 2, !arg0, class293.field5127.field4338);
            var1 -= 2;
            class293.field5127.field4314 = 0;
            class191.field3471 = class293.field5127.method1712(-1);
        }
        if (class191.field3471 > var1) {
            return false;
        }
        class293.field5127.field4314 = 0;
        class14.field161.method1478(0, class191.field3471, false, class293.field5127.field4338);
        class290.field5080 = class88.field1389;
        class290.field5069 = 0;
        class88.field1389 = class158.field2852;
        class158.field2852 = class191.field3457;
        if (class191.field3457 == 106) {
            class1.method3((byte) 126);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 74) {
            int var349 = class293.field5127.method1737(-666233712);
            int var350 = class293.field5127.method1712(-1);
            int var351 = class293.field5127.method1712(-1);
            if (var351 == 65535) {
                var351 = -1;
            }
            if (class59.method407(var350, (byte) -58)) {
                class70.method469(2, var349, (byte) -40, var351);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 179) {
            int var2 = class293.field5127.method1712(-1);
            class108 var3 = class293.field5127.method1740(true);
            Object[] var4 = new Object[var3.method776(0) + 1];
            for (int var5 = var3.method776(0) - 1; var5 >= 0; var5--) {
                if (var3.method784(var5, -89) == 115) {
                    var4[var5 + 1] = class293.field5127.method1740(true);
                } else {
                    var4[var5 + 1] = Integer.valueOf(class293.field5127.method1738(-1756395344));
                }
            }
            var4[0] = Integer.valueOf(class293.field5127.method1738(-1756395344));
            if (class59.method407(var2, (byte) -94)) {
                class286 var6 = new class286();
                var6.field4993 = var4;
                class287.method2053(var6, 73);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 151) {
            class191.field3457 = -1;
            client.field4538 = 0;
            return true;
        } else if (class191.field3457 == 9) {
            int var345 = class293.field5127.method1720(126);
            int var346 = class293.field5127.method1752((byte) 48);
            int var347 = class293.field5127.method1753(-2860);
            int var348 = class293.field5127.method1746(false);
            if (class59.method407(var346, (byte) -93)) {
                class185.method1331(var347, var348, var345, 0);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 10) {
            class156.field2805 = class293.field5127.method1712(-1) * 30;
            class191.field3457 = -1;
            class94.field1510 = class242.field4217;
            return true;
        } else if (class191.field3457 == 64) {
            class171.method1213((byte) -78);
            class232.method1619(0);
            class191.field3457 = -1;
            class326.field5551 += 32;
            return true;
        } else if (class191.field3457 == 235) {
            if (class168.field3026 != null) {
                method618(-1, -1, (byte) 31, false, class258.field4562);
            }
            byte[] var7 = new byte[class191.field3471];
            class293.field5127.method1433(var7, class191.field3471, 0, (byte) 86);
            class108 var8 = class304.method2137((byte) 111, 0, var7, class191.field3471);
            if (class273.field4805 == null && (class139.field2442 == 3 || !class139.field2437.startsWith("win") || class74.field1130)) {
                class200.method1413(true, var8, 3);
            } else {
                class83.field1286 = var8;
                class96.field1560 = true;
                class101.field1773 = class289.field5052.method953((byte) -96, new String(var8.method782(false), "ISO-8859-1"));
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 21) {
            int var341 = class293.field5127.method1712(-1);
            int var342 = class293.field5127.method1731(arg0);
            int var343 = class293.field5127.method1752((byte) 127);
            class45 var344 = class159.field2863[var343];
            if (var344 != null) {
                class166.method1164(var341, var344, var342, 5422);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 105) {
            int var9 = class293.field5127.method1731(true);
            int var10 = class293.field5127.method1752((byte) 76);
            class316.method2201(arg0, var10, var9);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 229) {
            class14.method92(0);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 189 || class191.field3457 == 18 || class191.field3457 == 61 || class191.field3457 == 43 || class191.field3457 == 114 || class191.field3457 == 67 || class191.field3457 == 230 || class191.field3457 == 68 || class191.field3457 == 102 || class191.field3457 == 124 || class191.field3457 == 233 || class191.field3457 == 209) {
            class68.method453(32767);
            class191.field3457 = -1;
            return true;
        } else if (!arg0) {
            return false;
        } else if (class191.field3457 == 41) {
            int var338 = class293.field5127.method1717(-124);
            class98 var339 = class168.method1173(var338, -1456948048);
            for (int var340 = 0; var340 < var339.field1575.length; var340++) {
                var339.field1575[var340] = -1;
                var339.field1575[var340] = 0;
            }
            class195.method1388(-82, var339);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 175) {
            long var324 = class293.field5127.method1764((byte) -116);
            int var326 = class293.field5127.method1712(-1);
            byte var327 = class293.field5127.method1721((byte) 68);
            boolean var328 = false;
            if ((Long.MIN_VALUE & var324) != 0L) {
                var328 = true;
            }
            if (var328) {
                if (class299.field5196 == 0) {
                    class191.field3457 = -1;
                    return true;
                }
                long var329 = var324 & Long.MAX_VALUE;
                boolean var331 = false;
                int var332;
                for (var332 = 0; class299.field5196 > var332 && (class284.field4974[var332].field3375 != var329 || class284.field4974[var332].field2773 != var326); var332++) {
                }
                if (var332 < class299.field5196) {
                    while (var332 < (class299.field5196 - 1)) {
                        class284.field4974[var332] = class284.field4974[var332 + 1];
                        var332++;
                    }
                    class299.field5196--;
                    class284.field4974[class299.field5196] = null;
                }
            } else {
                class108 var333 = class293.field5127.method1740(true);
                class154 var334 = new class154();
                var334.field3375 = var324;
                var334.field2765 = class330.method2259((byte) -122, var334.field3375);
                var334.field2770 = var333;
                var334.field2772 = var327;
                var334.field2773 = var326;
                int var335;
                for (var335 = class299.field5196 - 1; var335 >= 0; var335--) {
                    int var336 = class284.field4974[var335].field2765.method766(94, var334.field2765);
                    if (var336 == 0) {
                        class284.field4974[var335].field2773 = var326;
                        class284.field4974[var335].field2772 = var327;
                        class284.field4974[var335].field2770 = var333;
                        if (class46.field661 == var324) {
                            class39.field546 = var327;
                        }
                        class52.field762 = class242.field4217;
                        class191.field3457 = -1;
                        return true;
                    }
                    if (var336 < 0) {
                        break;
                    }
                }
                if (class284.field4974.length <= class299.field5196) {
                    class191.field3457 = -1;
                    return true;
                }
                for (int var337 = class299.field5196 - 1; var337 > var335; var337--) {
                    class284.field4974[var337 + 1] = class284.field4974[var337];
                }
                if (class299.field5196 == 0) {
                    class284.field4974 = new class154[100];
                }
                class284.field4974[var335 + 1] = var334;
                if (class46.field661 == var324) {
                    class39.field546 = var327;
                }
                class299.field5196++;
            }
            class52.field762 = class242.field4217;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 211) {
            long var321 = class293.field5127.method1764((byte) -116);
            class108 var323 = class80.method519(class146.method1019(class293.field5127, -15789).method761((byte) -11));
            class210.method1456(var323, 6, -112, class330.method2259((byte) -56, var321).method755(8975));
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 78) {
            int var11 = class293.field5127.method1738(-1756395344);
            int var12 = class293.field5127.method1712(-1);
            class98 var13;
            if (var11 < 0) {
                var13 = null;
            } else {
                var13 = class168.method1173(var11, -1456948048);
            }
            if (var11 < -70000) {
                var12 += 32768;
            }
            while (class293.field5127.field4314 < class191.field3471) {
                int var14 = class293.field5127.method1739((byte) -62);
                int var15 = 0;
                int var16 = class293.field5127.method1712(-1);
                if (var16 != 0) {
                    var15 = class293.field5127.method1731(true);
                    if (var15 == 255) {
                        var15 = class293.field5127.method1738(-1756395344);
                    }
                }
                if (var13 != null && var14 >= 0 && var13.field1575.length > var14) {
                    var13.field1575[var14] = var16;
                    var13.field1671[var14] = var15;
                }
                class239.method1658(var14, var12, -16733, var16 - 1, var15);
            }
            if (var13 != null) {
                class195.method1388(-82, var13);
            }
            class232.method1619(0);
            class120.field2052[class162.method1118(class170.field3049++, 31)] = class162.method1118(var12, 32767);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 137) {
            int var318 = class293.field5127.method1737(-666233712);
            int var319 = class293.field5127.method1712(-1);
            int var320 = class293.field5127.method1712(-1);
            if (class59.method407(var320, (byte) -110)) {
                class34.method229((byte) -28, var319, var318);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 93) {
            class266.method1921(class293.field5127.method1740(true), -124);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 197) {
            int var17 = class293.field5127.method1762(-128);
            class108 var18 = class293.field5127.method1740(true);
            int var19 = class293.field5127.method1762(-128);
            if (var19 >= 1 && var19 <= 8) {
                if (var18.method781(class120.field2053, -26321)) {
                    var18 = null;
                }
                class285.field4990[var19 - 1] = var18;
                class207.field3707[var19 - 1] = var17 == 0;
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 155) {
            class3.method27((byte) 56, class293.field5127);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 169) {
            int var316 = class293.field5127.method1725(-109);
            int var317 = class293.field5127.method1712(-1);
            class186.field3423 = var316;
            class176.field3207 = var317;
            class159.method1102((byte) 85);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 38) {
            int var20 = class293.field5127.method1762(-128);
            int var21 = class293.field5127.method1717(-123);
            int var22 = class293.field5127.method1712(-1);
            if (class59.method407(var22, (byte) -94)) {
                class64.method442(-32, var21, var20);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 44) {
            class157.field2836 = class293.field5127.method1731(true);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 202) {
            long var297 = class293.field5127.method1764((byte) -115);
            int var299 = class293.field5127.method1712(-1);
            int var300 = class293.field5127.method1731(true);
            boolean var301 = true;
            class108 var302 = class63.field1016;
            if (var297 < 0L) {
                var301 = false;
                var297 &= Long.MAX_VALUE;
            }
            if (var299 > 0) {
                var302 = class293.field5127.method1740(true);
            }
            class108 var303 = class330.method2259((byte) -89, var297).method755(8975);
            for (int var304 = 0; var304 < class120.field2056; var304++) {
                if (class254.field4423[var304] == var297) {
                    if (class176.field3204[var304] != var299) {
                        class176.field3204[var304] = var299;
                        if (var299 > 0) {
                            class210.method1456(class117.method833(new class108[] { var303, class87.field1373 }, false), 5, -82, class63.field1016);
                        }
                        if (var299 == 0) {
                            class210.method1456(class117.method833(new class108[] { var303, class216.field3844 }, false), 5, -35, class63.field1016);
                        }
                    }
                    var303 = null;
                    class14.field168[var304] = var302;
                    class295.field5154[var304] = var300;
                    client.field4539[var304] = var301;
                    break;
                }
            }
            if (var303 != null && class120.field2056 < 200) {
                class254.field4423[class120.field2056] = var297;
                class197.field3563[class120.field2056] = var303;
                class176.field3204[class120.field2056] = var299;
                class14.field168[class120.field2056] = var302;
                class295.field5154[class120.field2056] = var300;
                client.field4539[class120.field2056] = var301;
                class120.field2056++;
            }
            class290.field5084 = class242.field4217;
            boolean var305 = false;
            int var306 = class120.field2056;
            while (var306 > 0) {
                boolean var307 = true;
                var306--;
                for (int var308 = 0; var308 < var306; var308++) {
                    if (class176.field3204[var308] != class182.field3334 && class176.field3204[var308 + 1] == class182.field3334 || class176.field3204[var308] == 0 && class176.field3204[var308 + 1] != 0) {
                        var307 = false;
                        int var309 = class176.field3204[var308];
                        class176.field3204[var308] = class176.field3204[var308 + 1];
                        class176.field3204[var308 + 1] = var309;
                        class108 var310 = class14.field168[var308];
                        class14.field168[var308] = class14.field168[var308 + 1];
                        class14.field168[var308 + 1] = var310;
                        class108 var311 = class197.field3563[var308];
                        class197.field3563[var308] = class197.field3563[var308 + 1];
                        class197.field3563[var308 + 1] = var311;
                        long var312 = class254.field4423[var308];
                        class254.field4423[var308] = class254.field4423[var308 + 1];
                        class254.field4423[var308 + 1] = var312;
                        int var314 = class295.field5154[var308];
                        class295.field5154[var308] = class295.field5154[var308 + 1];
                        class295.field5154[var308 + 1] = var314;
                        boolean var315 = client.field4539[var308];
                        client.field4539[var308] = client.field4539[var308 + 1];
                        client.field4539[var308 + 1] = var315;
                    }
                }
                if (var307) {
                    break;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 28) {
            int var23 = class293.field5127.method1738(-1756395344);
            int var24 = class293.field5127.method1725(-119);
            int var25 = class293.field5127.method1717(-112);
            if (class59.method407(var24, (byte) -75)) {
                class158 var26 = (class158) class191.field3456.method1676((long) var23, (byte) -122);
                class158 var27 = (class158) class191.field3456.method1676((long) var25, (byte) -95);
                if (var27 != null) {
                    class285.method2042(22, var27, var26 == null || var26.field2845 != var27.field2845);
                }
                if (var26 != null) {
                    var26.method1325(0);
                    class191.field3456.method1681(1, var26, (long) var25);
                }
                class98 var28 = class168.method1173(var23, -1456948048);
                if (var28 != null) {
                    class195.method1388(-82, var28);
                }
                class98 var29 = class168.method1173(var25, -1456948048);
                if (var29 != null) {
                    class195.method1388(-82, var29);
                    class146.method1020((byte) -120, var29, true);
                }
                if (class322.field5511 != -1) {
                    class302.method2121((byte) 95, class322.field5511, 1);
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 115) {
            int var292 = class293.field5127.method1726(-17356);
            int var293 = class293.field5127.method1726(-17356);
            int var294 = class293.field5127.method1717(-128);
            int var295 = class293.field5127.method1726(-17356);
            int var296 = class293.field5127.method1725(-113);
            if (class59.method407(var292, (byte) -78)) {
                class182.method1320(var293, var294, var296, false, var295);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 104) {
            int var289 = class293.field5127.method1712(-1);
            int var290 = class293.field5127.method1731(true);
            if (var289 == 65535) {
                var289 = -1;
            }
            int var291 = class293.field5127.method1712(-1);
            class224.method1522(var289, var291, var290, -1);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 239) {
            int var284 = class293.field5127.method1731(true);
            int var285 = class293.field5127.method1731(true);
            int var286 = class293.field5127.method1712(-1);
            int var287 = class293.field5127.method1731(true);
            int var288 = class293.field5127.method1731(arg0);
            class141.method980(var288, var284, var287, var285, var286, -525);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 187) {
            int var280 = class293.field5127.method1752((byte) 64);
            int var281 = class293.field5127.method1717(-120);
            int var282 = class293.field5127.method1726(-17356);
            int var283 = class293.field5127.method1712(-1);
            if (class59.method407(var280, (byte) -73)) {
                class299.method2111((var283 << 16) + var282, var281, !arg0);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 217) {
            class160.field2879 = class293.field5127.method1755(true);
            class72.field1102 = class293.field5127.method1755(arg0);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 205) {
            class190.method1352(false, false);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 215) {
            int var277 = class293.field5127.method1755(arg0);
            int var278 = class293.field5127.method1762(-128);
            int var279 = class293.field5127.method1733(128);
            class295.field5159 = var278 >> 1;
            class95.field1513.method362(-17550, ~(var278 & 0x1) == -2, var279, var277);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 253) {
            int var30 = class293.field5127.method1725(-127);
            class186.method1335(var30, (byte) 123);
            class120.field2052[class162.method1118(class170.field3049++, 31)] = class162.method1118(32767, var30);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 95) {
            class108 var31 = class293.field5127.method1740(true);
            if (var31.method790(class126.field2113, -7803)) {
                class108 var32 = var31.method750(false, 0, var31.method762(class55.field806, 99));
                long var33 = var32.method743(false);
                boolean var35 = false;
                for (int var36 = 0; var36 < class176.field3205; var36++) {
                    if (class75.field1153[var36] == var33) {
                        var35 = true;
                        break;
                    }
                }
                if (!var35 && class78.field1193 == 0) {
                    class210.method1456(class1.field21, 4, -76, var32);
                }
            } else if (var31.method790(class173.field3169, -7803)) {
                class108 var37 = var31.method750(false, 0, var31.method762(class55.field806, 90));
                long var38 = var37.method743(false);
                boolean var40 = false;
                for (int var41 = 0; var41 < class176.field3205; var41++) {
                    if (class75.field1153[var41] == var38) {
                        var40 = true;
                        break;
                    }
                }
                if (!var40 && class78.field1193 == 0) {
                    class108 var42 = var31.method750(false, var31.method762(class55.field806, -33) + 1, var31.method776(0) - 9);
                    class210.method1456(var42, 8, -121, var37);
                }
            } else if (var31.method790(class284.field4970, -7803)) {
                class108 var43 = var31.method750(false, 0, var31.method762(class55.field806, 122));
                long var44 = var43.method743(false);
                boolean var46 = false;
                for (int var47 = 0; var47 < class176.field3205; var47++) {
                    if (class75.field1153[var47] == var44) {
                        var46 = true;
                        break;
                    }
                }
                if (!var46 && class78.field1193 == 0) {
                    class210.method1456(class63.field1016, 10, -96, var43);
                }
            } else if (var31.method790(class157.field2842, -7803)) {
                class108 var71 = var31.method750(false, 0, var31.method762(class157.field2842, 72));
                class210.method1456(var71, 11, -30, class63.field1016);
            } else if (var31.method790(class280.field4896, -7803)) {
                class108 var70 = var31.method750(!arg0, 0, var31.method762(class280.field4896, 113));
                if (class78.field1193 == 0) {
                    class210.method1456(var70, 12, -52, class63.field1016);
                }
            } else if (var31.method790(class260.field4584, -7803)) {
                class108 var69 = var31.method750(false, 0, var31.method762(class260.field4584, -107));
                if (class78.field1193 == 0) {
                    class210.method1456(var69, 13, -94, class63.field1016);
                }
            } else if (var31.method790(class161.field2884, -7803)) {
                class108 var64 = var31.method750(false, 0, var31.method762(class55.field806, -27));
                long var65 = var64.method743(!arg0);
                boolean var67 = false;
                for (int var68 = 0; var68 < class176.field3205; var68++) {
                    if (class75.field1153[var68] == var65) {
                        var67 = true;
                        break;
                    }
                }
                if (!var67 && class78.field1193 == 0) {
                    class210.method1456(class63.field1016, 14, -87, var64);
                }
            } else if (var31.method790(class145.field2604, -7803)) {
                class108 var59 = var31.method750(false, 0, var31.method762(class55.field806, 96));
                long var60 = var59.method743(!arg0);
                boolean var62 = false;
                for (int var63 = 0; var63 < class176.field3205; var63++) {
                    if (class75.field1153[var63] == var60) {
                        var62 = true;
                        break;
                    }
                }
                if (!var62 && class78.field1193 == 0) {
                    class210.method1456(class63.field1016, 15, -77, var59);
                }
            } else if (var31.method790(class209.field3726, -7803)) {
                class108 var48 = var31.method750(false, 0, var31.method762(class55.field806, 103));
                boolean var49 = false;
                long var50 = var48.method743(!arg0);
                for (int var52 = 0; var52 < class176.field3205; var52++) {
                    if (class75.field1153[var52] == var50) {
                        var49 = true;
                        break;
                    }
                }
                if (!var49 && class78.field1193 == 0) {
                    class210.method1456(class63.field1016, 16, -42, var48);
                }
            } else if (var31.method790(class99.field1742, -7803)) {
                class108 var53 = var31.method750(!arg0, 0, var31.method762(class55.field806, -61));
                long var54 = var53.method743(false);
                boolean var56 = false;
                for (int var57 = 0; var57 < class176.field3205; var57++) {
                    if (class75.field1153[var57] == var54) {
                        var56 = true;
                        break;
                    }
                }
                if (!var56 && class78.field1193 == 0) {
                    class108 var58 = var31.method750(false, var31.method762(class55.field806, -100) + 1, var31.method776(0) + -9);
                    class210.method1456(var58, 21, -60, var53);
                }
            } else {
                class210.method1456(var31, 0, -102, class63.field1016);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 16) {
            int var72 = class293.field5127.method1712(-1);
            int var73 = class293.field5127.method1717(-128);
            class316.method2201(arg0, var72, var73);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 87) {
            int var74 = class293.field5127.method1731(true);
            int var75 = class293.field5127.method1731(arg0);
            int var76 = class293.field5127.method1712(-1);
            int var77 = class293.field5127.method1731(true);
            int var78 = class293.field5127.method1731(arg0);
            class54.method380(var77, true, -15651, var74, var76, var78, var75);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 42) {
            int var79 = class293.field5127.method1717(-128);
            int var80 = class293.field5127.method1752((byte) 6);
            if (class59.method407(var80, (byte) -61)) {
                int var81 = 0;
                if (class95.field1513.field721 != null) {
                    var81 = class95.field1513.field721.method1660(121);
                }
                class70.method469(3, var79, (byte) 1, var81);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 7) {
            int var274 = class293.field5127.method1712(-1);
            int var275 = class293.field5127.method1712(-1);
            int var276 = class293.field5127.method1755(true);
            if (class59.method407(var274, (byte) -73)) {
                class17.method110(0, var276, var275);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 186) {
            class298.method2106((byte) 95);
            class191.field3457 = -1;
            return false;
        } else if (class191.field3457 == 207) {
            class63.method437(false);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 220) {
            class169.field3027 = class293.field5127.method1731(arg0);
            class1.field19 = class293.field5127.method1731(arg0);
            class2.field47 = class293.field5127.method1731(true);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 143) {
            if (class191.field3471 == 0) {
                class236.field4143 = class104.field1811;
            } else {
                class236.field4143 = class293.field5127.method1740(true);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 236) {
            class232.method1619(0);
            class239.field4167 = class293.field5127.method1728(true);
            class191.field3457 = -1;
            class94.field1510 = class242.field4217;
            return true;
        } else if (class191.field3457 == 251) {
            for (int var272 = 0; var272 < class96.field1558.length; var272++) {
                if (class96.field1558[var272] != null) {
                    class96.field1558[var272].field4492 = -1;
                }
            }
            for (int var273 = 0; var273 < class159.field2863.length; var273++) {
                if (class159.field2863[var273] != null) {
                    class159.field2863[var273].field4492 = -1;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 145) {
            class232.method1619(0);
            class126.field2143 = class293.field5127.method1731(true);
            class191.field3457 = -1;
            class94.field1510 = class242.field4217;
            return true;
        } else if (class191.field3457 == 232) {
            class72.field1102 = class293.field5127.method1755(true);
            class160.field2879 = class293.field5127.method1762(-128);
            for (int var82 = class72.field1102; var82 < class72.field1102 + 8; var82++) {
                for (int var83 = class160.field2879; var83 < class160.field2879 + 8; var83++) {
                    if (class182.field3333[class295.field5159][var82][var83] != null) {
                        class182.field3333[class295.field5159][var82][var83] = null;
                        class132.method908(1, var83, var82);
                    }
                }
            }
            for (class163 var84 = (class163) class326.field5565.method13(0); var84 != null; var84 = (class163) class326.field5565.method15((byte) 47)) {
                if (class72.field1102 <= var84.field2929 && var84.field2929 < class72.field1102 + 8 && var84.field2908 >= class160.field2879 && (class160.field2879 + 8) > var84.field2908 && class295.field5159 == var84.field2926) {
                    var84.field2918 = 0;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 122) {
            class176.field3205 = class191.field3471 / 8;
            for (int var85 = 0; var85 < class176.field3205; var85++) {
                class75.field1153[var85] = class293.field5127.method1764((byte) -117);
                class51.field752[var85] = class330.method2259((byte) -45, class75.field1153[var85]);
            }
            class191.field3457 = -1;
            class290.field5084 = class242.field4217;
            return true;
        } else if (class191.field3457 == 99) {
            int var261 = class293.field5127.method1755(true);
            int var262 = var261 >> 2;
            int var263 = var261 & 0x3;
            int var264 = class121.field2070[var262];
            int var265 = class293.field5127.method1753(-2860);
            int var266 = var265 >> 14 & 0x3FFF;
            int var267 = (var265 & 0x33AD9C29) >> 28;
            int var268 = var265 & 0x3FFF;
            int var269 = class293.field5127.method1712(-1);
            int var270 = var266 - class305.field5295;
            if (var269 == 65535) {
                var269 = -1;
            }
            int var271 = var268 - class137.field2421;
            class281.method2023(var270, var267, var262, var263, var264, (byte) -106, var271, var269);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 24) {
            class190.method1352(true, false);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 156) {
            int var86 = class293.field5127.method1737(-666233712);
            int var87 = class293.field5127.method1733(128);
            int var88 = class293.field5127.method1712(-1);
            int var89 = class293.field5127.method1712(-1);
            if (class59.method407(var89, (byte) -80)) {
                class158 var90 = (class158) class191.field3456.method1676((long) var86, (byte) -64);
                if (var90 != null) {
                    class285.method2042(22, var90, var90.field2845 != var88);
                }
                class296.method2102(var88, var87, 22, var86);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 139) {
            int var257 = class293.field5127.method1725(-128);
            int var258 = class293.field5127.method1725(-115);
            int var259 = class293.field5127.method1753(-2860);
            int var260 = class293.field5127.method1725(-106);
            if (class59.method407(var258, (byte) -97)) {
                class70.method469(7, var259, (byte) 88, var260 << 16 | var257);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 238) {
            class297.field5174 = class293.field5127.method1731(true);
            class290.field5084 = class242.field4217;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 45) {
            int var91 = class293.field5127.method1712(-1);
            int var92 = class293.field5127.method1737(-666233712);
            int var93 = class293.field5127.method1712(-1);
            if (class59.method407(var91, (byte) -82)) {
                class17.method110(0, var92, var93);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 27) {
            class108 var94 = class293.field5127.method1740(true);
            int var95 = class293.field5127.method1726(-17356);
            int var96 = class293.field5127.method1726(-17356);
            if (class59.method407(var95, (byte) -98)) {
                class318.method2209(var94, var96, (byte) 106);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 31) {
            long var97 = class293.field5127.method1764((byte) -123);
            int var99 = class293.field5127.method1712(-1);
            class108 var100 = class36.method248(var99, -4394).method227(class293.field5127, -124);
            class177.method1257(var99, (class108) null, (byte) -89, 19, var100, class330.method2259((byte) -84, var97).method755(8975));
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 103) {
            int var101 = class293.field5127.method1738(-1756395344);
            class36.field509 = class289.field5052.method959(-24846, var101);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 37) {
            int var102 = class293.field5127.method1737(-666233712);
            int var103 = class293.field5127.method1712(-1);
            int var104 = class293.field5127.method1712(-1);
            if (class59.method407(var104, (byte) -59)) {
                class173.method1234(var103, var102, 12);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 135) {
            long var241 = class293.field5127.method1764((byte) -126);
            class293.field5127.method1721((byte) 123);
            long var243 = class293.field5127.method1764((byte) -114);
            long var245 = (long) class293.field5127.method1712(-1);
            long var247 = (long) class293.field5127.method1749(!arg0);
            long var249 = (var245 << 32) + var247;
            int var251 = class293.field5127.method1731(arg0);
            boolean var252 = false;
            int var253 = class293.field5127.method1712(-1);
            int var254 = 0;
            label1497: while (true) {
                if (var254 < 100) {
                    if (class293.field5129[var254] != var249) {
                        var254++;
                        continue;
                    }
                    var252 = true;
                    break;
                }
                if (var251 <= 1) {
                    for (int var255 = 0; var255 < class176.field3205; var255++) {
                        if (class75.field1153[var255] == var241) {
                            var252 = true;
                            break label1497;
                        }
                    }
                }
                break;
            }
            if (!var252 && class78.field1193 == 0) {
                class293.field5129[class184.field3387] = var249;
                class184.field3387 = (class184.field3387 + 1) % 100;
                class108 var256 = class36.method248(var253, -4394).method227(class293.field5127, -1);
                if (var251 == 2 || var251 == 3) {
                    class177.method1257(var253, class330.method2259((byte) -104, var243).method755(8975), (byte) -111, 20, var256, class117.method833(new class108[] { class303.field5267, class330.method2259((byte) -126, var241).method755(8975) }, false));
                } else if (var251 == 1) {
                    class177.method1257(var253, class330.method2259((byte) -68, var243).method755(8975), (byte) -123, 20, var256, class117.method833(new class108[] { class292.field5114, class330.method2259((byte) -72, var241).method755(8975) }, false));
                } else {
                    class177.method1257(var253, class330.method2259((byte) -39, var243).method755(8975), (byte) -74, 20, var256, class330.method2259((byte) -82, var241).method755(8975));
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 172) {
            if (class322.field5511 != -1) {
                class302.method2121((byte) 95, class322.field5511, 0);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 47) {
            int var236 = class293.field5127.method1731(arg0);
            int var237 = class293.field5127.method1731(arg0);
            int var238 = class293.field5127.method1731(true);
            int var239 = class293.field5127.method1731(true);
            int var240 = class293.field5127.method1712(-1);
            class191.field3476[var236] = true;
            class220.field3921[var236] = var237;
            class88.field1395[var236] = var238;
            class285.field4978[var236] = var239;
            class265.field4668[var236] = var240;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 242) {
            long var105 = class293.field5127.method1764((byte) -123);
            long var107 = (long) class293.field5127.method1712(-1);
            long var109 = (long) class293.field5127.method1749(false);
            int var111 = class293.field5127.method1731(true);
            int var112 = class293.field5127.method1712(-1);
            long var113 = (var107 << 32) + var109;
            boolean var115 = false;
            int var116 = 0;
            label1273: while (true) {
                if (var116 >= 100) {
                    if (var111 <= 1) {
                        for (int var117 = 0; var117 < class176.field3205; var117++) {
                            if (class75.field1153[var117] == var105) {
                                var115 = true;
                                break label1273;
                            }
                        }
                    }
                    break;
                }
                if (class293.field5129[var116] == var113) {
                    var115 = true;
                    break;
                }
                var116++;
            }
            if (!var115 && class78.field1193 == 0) {
                class293.field5129[class184.field3387] = var113;
                class184.field3387 = (class184.field3387 + 1) % 100;
                class108 var118 = class36.method248(var112, -4394).method227(class293.field5127, 87);
                if (var111 == 2) {
                    class177.method1257(var112, (class108) null, (byte) -64, 18, var118, class117.method833(new class108[] { class303.field5267, class330.method2259((byte) -54, var105).method755(8975) }, false));
                } else if (var111 == 1) {
                    class177.method1257(var112, (class108) null, (byte) -103, 18, var118, class117.method833(new class108[] { class292.field5114, class330.method2259((byte) -122, var105).method755(8975) }, false));
                } else {
                    class177.method1257(var112, (class108) null, (byte) -99, 18, var118, class330.method2259((byte) -77, var105).method755(8975));
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 83) {
            int var119 = class293.field5127.method1725(-123);
            int var120 = class293.field5127.method1717(-127);
            class108 var121 = class293.field5127.method1740(true);
            if (class59.method407(var119, (byte) -81)) {
                client.method1821(var121, var120, -23626);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 101) {
            class151.method1069(class289.field5052, class293.field5127, (byte) -116, class191.field3471);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 76) {
            int var233 = class293.field5127.method1712(-1);
            int var234 = class293.field5127.method1738(-1756395344);
            if (class59.method407(var233, (byte) -68)) {
                class158 var235 = (class158) class191.field3456.method1676((long) var234, (byte) -82);
                if (var235 != null) {
                    class285.method2042(22, var235, true);
                }
                if (class175.field3197 != null) {
                    class195.method1388(-82, class175.field3197);
                    class175.field3197 = null;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 136) {
            class160.field2879 = class293.field5127.method1731(true);
            class72.field1102 = class293.field5127.method1733(128);
            while (class191.field3471 > class293.field5127.field4314) {
                class191.field3457 = class293.field5127.method1731(arg0);
                class68.method453(32767);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 192) {
            int var230 = class293.field5127.method1717(-112);
            int var231 = class293.field5127.method1725(-98);
            if (var231 == 65535) {
                var231 = -1;
            }
            int var232 = class293.field5127.method1752((byte) 4);
            if (class59.method407(var232, (byte) -97)) {
                class70.method469(1, var230, (byte) 92, var231);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 228) {
            int var122 = class293.field5127.method1712(-1);
            int var123 = class293.field5127.method1738(-1756395344);
            int var124 = class293.field5127.method1746(false);
            if (class59.method407(var122, (byte) -34)) {
                class101.method703((byte) 112, var123, var124);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 22) {
            int var221 = class293.field5127.method1725(-112);
            int var222 = class293.field5127.method1738(-1756395344);
            if (var221 == 65535) {
                var221 = -1;
            }
            int var223 = class293.field5127.method1753(-2860);
            int var224 = class293.field5127.method1752((byte) 71);
            int var225 = class293.field5127.method1725(-94);
            if (var224 == 65535) {
                var224 = -1;
            }
            if (class59.method407(var225, (byte) -125)) {
                for (int var226 = var221; var226 <= var224; var226++) {
                    long var227 = ((long) var222 << 32) + ((long) var226);
                    class184 var229 = class69.field1075.method1676(var227, (byte) -110);
                    if (var229 != null) {
                        var229.method1325(0);
                    }
                    class69.field1075.method1681(1, new class236(var223), var227);
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 54) {
            class232.method1619(0);
            int var217 = class293.field5127.method1731(true);
            int var218 = class293.field5127.method1737(-666233712);
            int var219 = class293.field5127.method1733(128);
            class299.field5199[var217] = var218;
            class329.field5627[var217] = var219;
            class307.field5345[var217] = 1;
            for (int var220 = 0; var220 < 98; var220++) {
                if (class283.field4945[var220] <= var218) {
                    class307.field5345[var217] = var220 + 2;
                }
            }
            class154.field2771[class162.method1118(31, class182.field3351++)] = var217;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 213) {
            int var215 = class293.field5127.method1712(-1);
            byte var216 = class293.field5127.method1744((byte) -65);
            class38.method259(var216, (byte) 119, var215);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 194) {
            int var125 = class293.field5127.method1752((byte) 111);
            class108 var126 = class293.field5127.method1740(arg0);
            int var127 = class293.field5127.method1712(-1);
            if (class59.method407(var127, (byte) -87)) {
                class318.method2209(var126, var125, (byte) 82);
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 34) {
            int var207 = class293.field5127.method1738(-1756395344);
            int var208 = class293.field5127.method1712(-1);
            if (var207 < -70000) {
                var208 += 32768;
            }
            class98 var209;
            if (var207 < 0) {
                var209 = null;
            } else {
                var209 = class168.method1173(var207, -1456948048);
            }
            if (var209 != null) {
                for (int var210 = 0; var210 < var209.field1575.length; var210++) {
                    var209.field1575[var210] = 0;
                    var209.field1671[var210] = 0;
                }
            }
            class22.method151(var208, true);
            int var211 = class293.field5127.method1712(-1);
            for (int var212 = 0; var212 < var211; var212++) {
                int var213 = class293.field5127.method1755(true);
                if (var213 == 255) {
                    var213 = class293.field5127.method1753(-2860);
                }
                int var214 = class293.field5127.method1725(-98);
                if (var209 != null && var209.field1575.length > var212) {
                    var209.field1575[var212] = var214;
                    var209.field1671[var212] = var213;
                }
                class239.method1658(var212, var208, -16733, var214 - 1, var213);
            }
            if (var209 != null) {
                class195.method1388(-82, var209);
            }
            class232.method1619(0);
            class120.field2052[class162.method1118(31, class170.field3049++)] = class162.method1118(var208, 32767);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 13) {
            int var204 = class293.field5127.method1731(true);
            int var205 = var204 >> 6;
            class295 var206 = new class295();
            var206.field5146 = var204 & 0x3F;
            var206.field5147 = class293.field5127.method1731(true);
            if (var206.field5147 >= 0 && class86.field1362.length > var206.field5147) {
                if (var206.field5146 == 1 || var206.field5146 == 10) {
                    var206.field5139 = class293.field5127.method1712(-1);
                    class293.field5127.field4314 += 3;
                } else if (var206.field5146 >= 2 && var206.field5146 <= 6) {
                    if (var206.field5146 == 2) {
                        var206.field5153 = 64;
                        var206.field5143 = 64;
                    }
                    if (var206.field5146 == 3) {
                        var206.field5143 = 64;
                        var206.field5153 = 0;
                    }
                    if (var206.field5146 == 4) {
                        var206.field5143 = 64;
                        var206.field5153 = 128;
                    }
                    if (var206.field5146 == 5) {
                        var206.field5153 = 64;
                        var206.field5143 = 0;
                    }
                    if (var206.field5146 == 6) {
                        var206.field5153 = 64;
                        var206.field5143 = 128;
                    }
                    var206.field5146 = 2;
                    var206.field5148 = class293.field5127.method1712(-1);
                    var206.field5141 = class293.field5127.method1712(-1);
                    var206.field5142 = class293.field5127.method1731(true);
                }
                var206.field5145 = class293.field5127.method1712(-1);
                if (var206.field5145 == 65535) {
                    var206.field5145 = -1;
                }
                class121.field2075[var205] = var206;
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 206) {
            long var128 = class293.field5127.method1764((byte) -128);
            boolean var130 = false;
            long var131 = (long) class293.field5127.method1712(-1);
            long var133 = (long) class293.field5127.method1749(false);
            long var135 = (var131 << 32) + var133;
            int var137 = class293.field5127.method1731(arg0);
            int var138 = 0;
            label1311: while (true) {
                if (var138 < 100) {
                    if (class293.field5129[var138] != var135) {
                        var138++;
                        continue;
                    }
                    var130 = true;
                    break;
                }
                if (var137 <= 1) {
                    if ((!class106.field1832 || class318.field5457) && !class151.field2737) {
                        for (int var139 = 0; var139 < class176.field3205; var139++) {
                            if (class75.field1153[var139] == var128) {
                                var130 = true;
                                break label1311;
                            }
                        }
                    } else {
                        var130 = true;
                    }
                }
                break;
            }
            if (!var130 && class78.field1193 == 0) {
                class293.field5129[class184.field3387] = var135;
                class184.field3387 = (class184.field3387 + 1) % 100;
                class108 var140 = class80.method519(class146.method1019(class293.field5127, -15789).method761((byte) -11));
                if (var137 == 2 || var137 == 3) {
                    class210.method1456(var140, 7, -41, class117.method833(new class108[] { class303.field5267, class330.method2259((byte) -40, var128).method755(8975) }, false));
                } else if (var137 == 1) {
                    class210.method1456(var140, 7, -81, class117.method833(new class108[] { class292.field5114, class330.method2259((byte) -35, var128).method755(8975) }, false));
                } else {
                    class210.method1456(var140, 3, -97, class330.method2259((byte) -66, var128).method755(8975));
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 183) {
            class52.field762 = class242.field4217;
            long var141 = class293.field5127.method1764((byte) -112);
            if (var141 == 0L) {
                class206.field3700 = null;
                class191.field3457 = -1;
                class123.field2095 = null;
                class284.field4974 = null;
                class299.field5196 = 0;
                return true;
            }
            long var143 = class293.field5127.method1764((byte) -113);
            class123.field2095 = class330.method2259((byte) -95, var143);
            class206.field3700 = class330.method2259((byte) -94, var141);
            class6.field76 = class293.field5127.method1721((byte) 84);
            int var145 = class293.field5127.method1731(true);
            if (var145 == 255) {
                class191.field3457 = -1;
                return true;
            }
            class299.field5196 = var145;
            class154[] var146 = new class154[100];
            for (int var147 = 0; var147 < class299.field5196; var147++) {
                var146[var147] = new class154();
                var146[var147].field3375 = class293.field5127.method1764((byte) -112);
                var146[var147].field2765 = class330.method2259((byte) -124, var146[var147].field3375);
                var146[var147].field2773 = class293.field5127.method1712(-1);
                var146[var147].field2772 = class293.field5127.method1721((byte) 56);
                var146[var147].field2770 = class293.field5127.method1740(true);
                if (class46.field661 == var146[var147].field3375) {
                    class39.field546 = var146[var147].field2772;
                }
            }
            boolean var148 = false;
            int var149 = class299.field5196;
            while (var149 > 0) {
                boolean var150 = true;
                var149--;
                for (int var151 = 0; var151 < var149; var151++) {
                    if (var146[var151].field2765.method766(108, var146[var151 + 1].field2765) > 0) {
                        var150 = false;
                        class154 var152 = var146[var151];
                        var146[var151] = var146[var151 + 1];
                        var146[var151 + 1] = var152;
                    }
                }
                if (var150) {
                    break;
                }
            }
            class284.field4974 = var146;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 85) {
            for (int var153 = 0; var153 < class261.field4594.length; var153++) {
                if (class271.field4734[var153] != class261.field4594[var153]) {
                    class261.field4594[var153] = class271.field4734[var153];
                    class330.method2258(var153, -118);
                    class278.field4875[class162.method1118(class326.field5551++, 31)] = var153;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 100) {
            int var202 = class293.field5127.method1737(-666233712);
            int var203 = class293.field5127.method1725(-110);
            class38.method259(var202, (byte) 125, var203);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 142) {
            int var198 = class293.field5127.method1726(-17356);
            int var199 = class293.field5127.method1755(true);
            int var200 = class293.field5127.method1752((byte) 117);
            if (class59.method407(var200, (byte) -59)) {
                if (var199 == 2) {
                    class260.method1845(false);
                }
                class322.field5511 = var198;
                class35.method247(0, var198);
                class289.method2069(0, false);
                class266.method1920(class322.field5511, (byte) -112);
                for (int var201 = 0; var201 < 100; var201++) {
                    class47.field692[var201] = true;
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 89) {
            int var197 = class293.field5127.method1726(-17356);
            if (var197 == 65535) {
                var197 = -1;
            }
            class104.method714((byte) -120, var197);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 49) {
            int var154 = class293.field5127.method1751(4);
            int var155 = class293.field5127.method1712(-1);
            if (var155 == 65535) {
                var155 = -1;
            }
            class288.method2060(var155, var154, true);
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 63) {
            int var156 = class293.field5127.method1731(true);
            if (class293.field5127.method1731(true) == 0) {
                class304.field5279[var156] = new class103();
            } else {
                class293.field5127.field4314--;
                class304.field5279[var156] = new class103(class293.field5127);
            }
            class256.field4480 = class242.field4217;
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 56) {
            int var179 = class293.field5127.method1712(-1);
            int var180 = class293.field5127.method1752((byte) 113);
            int var181 = class293.field5127.method1717(-124);
            int var182 = class293.field5127.method1725(-128);
            if ((var181 >> 30) != 0) {
                int var191 = (var181 & 0x3BB78D44) >> 28;
                int var192 = (var181 >> 14 & 0x3FFF) - class305.field5295;
                int var193 = (var181 & 0x3FFF) - class137.field2421;
                if (var192 >= 0 && var193 >= 0 && var192 < 104 && var193 < 104) {
                    int var194 = var193 * 128 + 64;
                    int var195 = var192 * 128 + 64;
                    class14 var196 = new class14(var182, var191, var195, var194, class45.method321(-79, var194, var195, var191) - var180, var179, class116.field2000);
                    class94.field1502.method5(new class261(var196), (byte) -121);
                }
            } else if (var181 >> 29 != 0) {
                int var187 = var181 & 0xFFFF;
                class45 var188 = class159.field2863[var187];
                if (var188 != null) {
                    var188.field4450 = 0;
                    var188.field4460 = class116.field2000 + var179;
                    var188.field4500 = var182;
                    if (class116.field2000 < var188.field4460) {
                        var188.field4450 = -1;
                    }
                    if (var188.field4500 == 65535) {
                        var188.field4500 = -1;
                    }
                    var188.field4517 = var180;
                    var188.field4506 = 0;
                    if (var188.field4500 != -1 && class116.field2000 == var188.field4460) {
                        int var189 = class152.method1074((byte) 118, var188.field4500).field5308;
                        if (var189 != -1) {
                            class272 var190 = class149.method1063(var189, -18767);
                            if (var190 != null && var190.field4774 != null) {
                                class172.method1226(var190, var188.field4457, -21329, 0, false, var188.field4452);
                            }
                        }
                    }
                }
            } else if (var181 >> 28 != 0) {
                int var183 = var181 & 0xFFFF;
                class51 var184;
                if (class185.field3409 == var183) {
                    var184 = class95.field1513;
                } else {
                    var184 = class96.field1558[var183];
                }
                if (var184 != null) {
                    var184.field4460 = class116.field2000 + var179;
                    var184.field4506 = 0;
                    var184.field4500 = var182;
                    if (var184.field4500 == 65535) {
                        var184.field4500 = -1;
                    }
                    var184.field4450 = 0;
                    if (var184.field4460 > class116.field2000) {
                        var184.field4450 = -1;
                    }
                    var184.field4517 = var180;
                    if (var184.field4500 != -1 && class116.field2000 == var184.field4460) {
                        int var185 = class152.method1074((byte) 90, var184.field4500).field5308;
                        if (var185 != -1) {
                            class272 var186 = class149.method1063(var185, -18767);
                            if (var186 != null && var186.field4774 != null) {
                                class172.method1226(var186, var184.field4457, -21329, 0, class95.field1513 == var184, var184.field4452);
                            }
                        }
                    }
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 149) {
            int var157 = class293.field5127.method1737(-666233712);
            int var158 = class293.field5127.method1726(-17356);
            int var159 = class293.field5127.method1726(-17356);
            int var160 = class293.field5127.method1737(-666233712);
            if (var159 == 65535) {
                var159 = -1;
            }
            if (class59.method407(var158, (byte) -63)) {
                class98 var161 = class168.method1173(var157, -1456948048);
                if (var161.field1640) {
                    class190.method1350(var157, var160, (byte) 99, var159);
                    class145 var162 = class144.method994(true, var159);
                    class182.method1320(var162.field2572, var157, var162.field2582, false, var162.field2579);
                    class91.method614(var162.field2593, 255, var157, var162.field2577, var162.field2588);
                } else if (var159 == -1) {
                    var161.field1577 = 0;
                    class191.field3457 = -1;
                    return true;
                } else {
                    class145 var163 = class144.method994(arg0, var159);
                    var161.field1672 = var163.field2582;
                    var161.field1664 = var159;
                    var161.field1712 = var163.field2572 * 100 / var160;
                    var161.field1577 = 4;
                    var161.field1708 = var163.field2579;
                    class195.method1388(-82, var161);
                }
            }
            class191.field3457 = -1;
            return true;
        } else if (class191.field3457 == 65) {
            long var164 = class293.field5127.method1764((byte) -113);
            class293.field5127.method1721((byte) 114);
            long var166 = class293.field5127.method1764((byte) -116);
            long var168 = (long) class293.field5127.method1712(-1);
            long var170 = (long) class293.field5127.method1749(false);
            int var172 = class293.field5127.method1731(arg0);
            long var173 = (var168 << 32) + var170;
            boolean var175 = false;
            int var176 = 0;
            label1363: while (true) {
                if (var176 >= 100) {
                    if (var172 <= 1) {
                        if ((!class106.field1832 || class318.field5457) && !class151.field2737) {
                            for (int var177 = 0; var177 < class176.field3205; var177++) {
                                if (class75.field1153[var177] == var164) {
                                    var175 = true;
                                    break label1363;
                                }
                            }
                        } else {
                            var175 = true;
                        }
                    }
                    break;
                }
                if (class293.field5129[var176] == var173) {
                    var175 = true;
                    break;
                }
                var176++;
            }
            if (!var175 && class78.field1193 == 0) {
                class293.field5129[class184.field3387] = var173;
                class184.field3387 = (class184.field3387 + 1) % 100;
                class108 var178 = class80.method519(class146.method1019(class293.field5127, -15789).method761((byte) -11));
                if (var172 == 2 || var172 == 3) {
                    class163.method1125(26048, 9, var178, class117.method833(new class108[] { class303.field5267, class330.method2259((byte) -98, var164).method755(8975) }, false), class330.method2259((byte) -85, var166).method755(8975));
                } else if (var172 == 1) {
                    class163.method1125(26048, 9, var178, class117.method833(new class108[] { class292.field5114, class330.method2259((byte) -89, var164).method755(8975) }, !arg0), class330.method2259((byte) -110, var166).method755(8975));
                } else {
                    class163.method1125(26048, 9, var178, class330.method2259((byte) -64, var164).method755(8975), class330.method2259((byte) -92, var166).method755(8975));
                }
            }
            class191.field3457 = -1;
            return true;
        } else {
            class171.method1188(64, "T1 - " + class191.field3457 + "," + class88.field1389 + "," + class290.field5080 + " - " + class191.field3471, (Throwable) null);
            class298.method2106((byte) 95);
            return true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIBZI)V", line = 3693)
    public static final void method618(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field1447++;
        class101.field1772 = 0L;
        int var5 = class281.method2020((byte) -77);
        if (arg2 <= 8) {
            field1475 = 88;
        }
        if (arg4 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (class139.field2437.startsWith("mac") && arg4 > 0) {
            arg3 = true;
        }
        boolean var6 = false;
        if (var5 > 0 == arg4 <= 0) {
            var6 = true;
        }
        if (arg3 && arg4 > 0) {
            var6 = true;
        }
        class53.method375(arg3, var6, arg0, arg4, arg1, -4, var5);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lrm;I)V", line = 3726)
    public static final void method619(class249 arg0, int arg1) {
        field1468++;
        if ((arg0.field4338.length - arg0.field4314) < 1) {
            return;
        }
        int var2 = arg0.method1731(true);
        if (var2 < arg1 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field4338.length - arg0.field4314) < var3) {
            return;
        }
        class269.field4716 = arg0.method1731(true);
        if (class269.field4716 < 1) {
            class269.field4716 = 1;
        } else if (class269.field4716 > 4) {
            class269.field4716 = 4;
        }
        class93.method630(arg0.method1731(true) == 1, (byte) -112);
        class163.field2916 = arg0.method1731(true) == 1;
        class137.field2427 = arg0.method1731(true) == 1;
        class180.field3277 = arg0.method1731(true) == 1;
        class287.field5018 = arg0.method1731(true) == 1;
        class283.field4962 = arg0.method1731(true) == 1;
        class312.field5394 = arg0.method1731(true) == 1;
        class180.field3280 = arg0.method1731(true) == 1;
        class247.field4280 = arg0.method1731(true);
        if (class247.field4280 > 2) {
            class247.field4280 = 2;
        }
        if (var2 < 2) {
            class26.field397 = arg0.method1731(true) == 1;
            arg0.method1731(true);
        } else {
            class26.field397 = arg0.method1731(true) == 1;
        }
        class60.field962 = arg0.method1731(true) == 1;
        class221.field3937 = arg0.method1731(true) == 1;
        class299.field5202 = arg0.method1731(true);
        if (class299.field5202 > 2) {
            class299.field5202 = 2;
        }
        class184.field3372 = class299.field5202;
        class131.field2242 = arg0.method1731(true) == 1;
        class15.field194 = arg0.method1731(true);
        if (class15.field194 > 127) {
            class15.field194 = 127;
        }
        class203.field3671 = arg0.method1731(true);
        class42.field561 = arg0.method1731(true);
        if (class42.field561 > 127) {
            class42.field561 = 127;
        }
        if (var2 >= 1) {
            class311.field5380 = arg0.method1712(~arg1);
            class288.field5028 = arg0.method1712(-1);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1731(true);
        }
        if (var2 >= 4) {
            class165.method1150(arg0.method1731(true));
        }
        if (var2 >= 5) {
            class95.field1523 = arg0.method1738(-1756395344);
        }
        if (var2 >= 6) {
            class258.field4562 = arg0.method1731(true);
        }
        if (var2 >= 7) {
            class45.field643 = arg0.method1731(true) == 1;
        }
        if (var2 >= 8) {
            class282.field4939 = arg0.method1731(true) == 1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)I", line = 3867)
    public static final int method620(byte arg0, int arg1, int arg2) {
        int var3 = 17 % ((arg0 + 61) / 59);
        field1444++;
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 << 13 ^ var4;
        int var6 = (var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 3880)
    public static void method621(int arg0) {
        field1474 = null;
        field1453 = null;
        field1448 = null;
        if (arg0 < 54) {
            field1456 = (class64) null;
        }
        field1476 = null;
        field1479 = null;
        field1477 = null;
        field1478 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 3897)
    public static final void method622(int arg0) {
        if (arg0 != 1829) {
            return;
        }
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class88.field1398 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field1443++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 3937)
    public static final void method623(byte arg0) {
        for (int var1 = 0; var1 < class312.field5400; var1++) {
            int var2 = class283.field4947[var1];
            class51 var3 = class96.field1558[var2];
            int var4 = class293.field5127.method1731(true);
            if ((var4 & 0x1) != 0) {
                var4 += class293.field5127.method1731(true) << 8;
            }
            class285.method2043(var4, 1, var3, var2);
        }
        if (arg0 != 26) {
            method625(-78, (class262) null, 29);
        }
        field1470++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZIII)V", line = 3982)
    public static final void method624(boolean arg0, int arg1, int arg2, int arg3) {
        field1446++;
        class108 var4 = class117.method833(new class108[] { class259.field4575, class79.method518(false, arg3), class233.field4128, class79.method518(false, arg2 >> 6), class233.field4128, class79.method518(false, arg1 >> 6), class233.field4128, class79.method518(false, arg2 & 0x3F), class233.field4128, class79.method518(false, arg1 & 0x3F) }, arg0);
        var4.method778(0);
        class308.method2158(2, var4);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILik;I)Lse;", line = 3993)
    public static final class12 method625(int arg0, class262 arg1, int arg2) {
        field1466++;
        int var3 = 91 / ((-arg0 - 14) / 59);
        return class25.method168(-12, arg1, arg2) ? class191.method1359(2) : null;
    }
}
