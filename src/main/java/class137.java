import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class137 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field2179 = 0;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "Lbv;")
    public static class567 field2178 = new class567("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILaj;Lbda;II)V")
    public static final void method1042(int arg0, class261 arg1, class400 arg2, int arg3, int arg4) {
        field2180++;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg1.method1744(17);
            byte[] var6 = new byte[var5];
            class268 var7 = new class268(var6);
            arg1.method1691(21, var5, var6, 0);
            class514.field7115[arg4] = var7;
            arg2.method2448(var7, (byte) -118);
        }
        byte var8 = -1;
        if ((arg3 & 0x8000) != 0) {
            arg2.field1480 = arg1.method1733(false);
            arg2.field1536 = arg1.method1707(true);
            arg2.field1478 = arg1.method1714(-31536);
            arg2.field1498 = arg1.method1707(true);
            arg2.field1527 = arg1.method1745(32132) + class310.field4553;
            arg2.field1524 = arg1.method1723((byte) 52) + class310.field4553;
            arg2.field1475 = arg1.method1744(90);
            arg2.field1576 = 0;
            if (arg2.field5950) {
                arg2.field1480 += arg2.field5971;
                arg2.field1536 += arg2.field5965;
                arg2.field1478 += arg2.field5971;
                arg2.field1498 += arg2.field5965;
                arg2.field1567 = 0;
            } else {
                arg2.field1567 = 1;
                arg2.field1478 += arg2.field1571[0];
                arg2.field1536 += arg2.field1572[0];
                arg2.field1480 += arg2.field1571[0];
                arg2.field1498 += arg2.field1572[0];
            }
        }
        if ((arg3 & 0x40000) != 0) {
            int var9 = arg1.method1750(true);
            int var10 = arg1.method1716(-31245);
            if (var9 == 65535) {
                var9 = -1;
            }
            int var11 = arg1.method1744(-107);
            arg2.method773(var10, true, var9, true, var11);
        }
        if ((arg3 & 0x10000) != 0) {
            arg2.field1540 = arg1.method1733(false);
            arg2.field1521 = arg1.method1714(-31536);
            arg2.field1479 = arg1.method1714(-31536);
            arg2.field1485 = (byte) arg1.method1689(-52);
            arg2.field1515 = class310.field4553 + arg1.method1745(32132);
            arg2.field1523 = class310.field4553 + arg1.method1745(32132);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field5991 = arg1.method1720(-17391);
            if (arg2.field1567 == 0) {
                arg2.method782(arg2.field5991, -36);
                arg2.field5991 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var12 = arg1.method1723((byte) 121);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = arg1.method1738(255);
            class92.method813(arg2, var12, var13, -110);
        }
        if ((arg3 & 0x80) != 0) {
            int var14 = arg1.method1749((byte) 115);
            int var15 = arg1.method1689(-83);
            arg2.method787(-70, var14, class310.field4553, var15);
            arg2.field1547 = class310.field4553 + 300;
            arg2.field1548 = arg1.method1701(255);
        }
        if ((arg3 & 0x1000) != 0) {
            int var16 = class310.field4553;
            int var17 = arg1.method1749((byte) -90);
            int var18 = arg1.method1738(255);
            arg2.method787(-70, var17, var16, var18);
        }
        if ((arg3 & 0x20000) != 0) {
            int var19 = arg1.method1689(-57);
            int[] var20 = new int[var19];
            int[] var21 = new int[var19];
            int[] var22 = new int[var19];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = arg1.method1750(true);
                if (var24 == 65535) {
                    var24 = -1;
                }
                var20[var23] = var24;
                var21[var23] = arg1.method1744(79);
                var22[var23] = arg1.method1745(32132);
            }
            client.method3518(arg2, true, var22, var20, var21);
        }
        if ((arg3 & 0x800) != 0) {
            var8 = arg1.method1707(true);
        }
        if (arg0 <= 89) {
            return;
        }
        if ((arg3 & 0x2000) != 0) {
            int var25 = arg1.method1745(32132);
            int var26 = arg1.method1748(-46);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var27 = arg1.method1701(255);
            arg2.method773(var26, true, var25, false, var27);
        }
        if ((arg3 & 0x400) != 0) {
            int var28 = arg1.method1720(-17391);
            arg2.field1474 = arg1.method1744(62);
            arg2.field1528 = arg1.method1744(-92);
            arg2.field1517 = (var28 & 0x8000) != 0;
            arg2.field1501 = var28 & 0x7FFF;
            arg2.field1490 = class310.field4553 + arg2.field1474 + arg2.field1501;
        }
        if ((arg3 & 0x10) != 0) {
            class220.field3310[arg4] = arg1.method1733(false);
        }
        if ((arg3 & 0x1) != 0) {
            int var29 = arg1.method1745(32132);
            int var30 = arg1.method1744(51);
            int var31 = arg1.method1738(255);
            int var32 = arg1.field3913;
            boolean var33 = (var29 & 0x8000) != 0;
            if (arg2.field5958 != null && arg2.field5984 != null) {
                boolean var34 = false;
                if (var30 <= 1) {
                    if (!var33 && (class149.field2261 && !class118.field1910 || class361.field5140)) {
                        var34 = true;
                    } else if (class331.method2050(true, arg2.field5958)) {
                        var34 = true;
                    }
                }
                if (!var34 && class341.field4914 == 0) {
                    class360.field5106.field3913 = 0;
                    arg1.method1695(class360.field5106.field3952, (byte) -52, var31, 0);
                    class360.field5106.field3913 = 0;
                    int var35 = -1;
                    String var36;
                    if (var33) {
                        var29 &= 0x7FFF;
                        class180 var37 = class59.method473(false, class360.field5106);
                        var35 = var37.field2617;
                        var36 = var37.field2616.method2223((byte) -119, class360.field5106);
                    } else {
                        var36 = class601.method3415(true, class437.method2589(class360.field5106, false));
                    }
                    arg2.field1512 = var36.trim();
                    arg2.field1470 = var29 >> 8;
                    arg2.field1541 = var29 & 0xFF;
                    arg2.field1562 = 150;
                    int var38;
                    if (var30 == 1 || var30 == 2) {
                        var38 = var33 ? 17 : 1;
                    } else {
                        var38 = var33 ? 17 : 2;
                    }
                    if (var30 == 2) {
                        class150.method1076(var36, 99, 0, null, "<img=1>" + arg2.method2451(true, -13212), var35, "<img=1>" + arg2.method2447(false, 0), var38);
                    } else if (var30 == 1) {
                        class150.method1076(var36, 99, 0, null, "<img=0>" + arg2.method2451(true, -13212), var35, "<img=0>" + arg2.method2447(false, 0), var38);
                    } else {
                        class150.method1076(var36, 99, 0, null, arg2.method2451(true, -13212), var35, arg2.method2447(false, 0), var38);
                    }
                }
            }
            arg1.field3913 = var31 + var32;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1512 = arg1.method1752(false);
            if (arg2.field1512.charAt(0) == '~') {
                arg2.field1512 = arg2.field1512.substring(1);
                class175.method1205(arg2.method2451(true, -13212), 0, 2, arg2.field1512, -1, arg2.method2447(false, 0));
            } else if (class644.field9367 == arg2) {
                class175.method1205(arg2.method2451(true, -13212), 0, 2, arg2.field1512, -1, arg2.method2447(false, 0));
            }
            arg2.field1541 = 0;
            arg2.field1562 = 150;
            arg2.field1470 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field5977 = arg1.method1689(-66) == 1;
        }
        if ((arg3 & 0x2) != 0) {
            int var39 = arg1.method1750(true);
            if (var39 == 65535) {
                var39 = -1;
            }
            arg2.field1526 = var39;
        }
        if (!arg2.field5950) {
            return;
        }
        if (var8 == 127) {
            arg2.method2445(arg2.field5971, arg2.field5965, (byte) 122);
            return;
        }
        byte var40;
        if (var8 == -1) {
            var40 = class220.field3310[arg4];
        } else {
            var40 = var8;
        }
        arg2.method2443(var40, arg2.field5971, arg2.field5965, 5366);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static void method1043(int arg0) {
        field2178 = null;
        int var1 = -63 % ((arg0 + 10) / 37);
    }
}
