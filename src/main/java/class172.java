import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class172 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
    private static int[] field2460 = new int[5];

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "[[I")
    private static int[][] field2462 = new int[5][5000];

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field2467 = new String[1000];

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    private static int field2469 = 0;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
    private static int[] field2468 = new int[1000];

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "[Lfj;")
    private static class401[] field2453 = new class401[50];

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2472 = Calendar.getInstance();

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field2475 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
    private static int[] field2474 = new int[3];

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Lka;")
    public static class408 field2477 = new class408(4);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lvg;")
    private static class108 field2454;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Lvg;")
    private static class108 field2457;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lck;")
    private static class353 field2465;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[I")
    private static int[] field2461;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "[Ljava/lang/String;")
    private static String[] field2456;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V", line = 9)
    public static final void method1228(int arg0, int arg1, int arg2) {
        class318 var3 = class49.method400(arg2, arg1, (byte) -54, arg0);
        if (var3 == null) {
            return;
        }
        field2461 = new int[var3.field4332];
        field2456 = new String[var3.field4331];
        if (var3.field4327 == 15 || var3.field4327 == 17 || var3.field4327 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class105.field1480 != null) {
                var4 = class105.field1480.field1659;
                var5 = class105.field1480.field1588;
            }
            field2461[0] = class116.field1759.method34(true) - var4;
            field2461[1] = class116.field1759.method30((byte) 115) - var5;
        }
        method1229(var3, 200000);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lmc;I)V", line = 40)
    private static final void method1229(class318 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field4325;
        int[] var6 = arg0.field4337;
        byte var7 = -1;
        field2469 = 0;
        try {
            int var8 = 0;
            label4487: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var621 = var5[var4];
                if (var621 < 100) {
                    if (var621 == 0) {
                        field2468[var2++] = var6[var4];
                        continue;
                    }
                    if (var621 == 1) {
                        int var9 = var6[var4];
                        field2468[var2++] = class13.field121[var9];
                        continue;
                    }
                    if (var621 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class133.method991(var10, field2468[var2], 1255678057);
                        continue;
                    }
                    if (var621 == 3) {
                        field2467[var3++] = arg0.field4333[var4];
                        continue;
                    }
                    if (var621 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var621 == 7) {
                        var2 -= 2;
                        if (field2468[var2 + 1] != field2468[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 8) {
                        var2 -= 2;
                        if (field2468[var2 + 1] == field2468[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 9) {
                        var2 -= 2;
                        if (field2468[var2] < field2468[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 10) {
                        var2 -= 2;
                        if (field2468[var2] > field2468[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 21) {
                        if (field2469 == 0) {
                            return;
                        }
                        class401 var11 = field2453[--field2469];
                        arg0 = var11.field5557;
                        var5 = arg0.field4325;
                        var6 = arg0.field4337;
                        var4 = var11.field5554;
                        field2461 = var11.field5556;
                        field2456 = var11.field5552;
                        continue;
                    }
                    if (var621 == 25) {
                        int var12 = var6[var4];
                        field2468[var2++] = class255.method1655(0, var12);
                        continue;
                    }
                    if (var621 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class280.method1761(0, var13, field2468[var2]);
                        continue;
                    }
                    if (var621 == 31) {
                        var2 -= 2;
                        if (field2468[var2] <= field2468[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 32) {
                        var2 -= 2;
                        if (field2468[var2] >= field2468[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var621 == 33) {
                        field2468[var2++] = field2461[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var621 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field2461[var10001] = field2468[var2];
                        continue;
                    }
                    if (var621 == 35) {
                        field2467[var3++] = field2456[var6[var4]];
                        continue;
                    }
                    if (var621 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field2456[var10001] = field2467[var3];
                        continue;
                    }
                    if (var621 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class264.method1690(true, var3, var14, field2467);
                        field2467[var3++] = var15;
                        continue;
                    }
                    if (var621 == 38) {
                        var2--;
                        continue;
                    }
                    if (var621 == 39) {
                        var3--;
                        continue;
                    }
                    if (var621 == 40) {
                        int var16 = var6[var4];
                        class318 var17 = class90.method714(var16, (byte) 71);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field4332];
                        String[] var19 = new String[var17.field4331];
                        for (int var20 = 0; var20 < var17.field4335; var20++) {
                            var18[var20] = field2468[var2 + var20 - var17.field4335];
                        }
                        for (int var21 = 0; var21 < var17.field4330; var21++) {
                            var19[var21] = field2467[var3 + var21 - var17.field4330];
                        }
                        var2 -= var17.field4335;
                        var3 -= var17.field4330;
                        class401 var22 = new class401();
                        var22.field5557 = arg0;
                        var22.field5554 = var4;
                        var22.field5556 = field2461;
                        var22.field5552 = field2456;
                        if (field2469 >= field2453.length) {
                            throw new RuntimeException();
                        }
                        field2453[field2469++] = var22;
                        arg0 = var17;
                        var5 = var17.field4325;
                        var6 = var17.field4337;
                        var4 = -1;
                        field2461 = var18;
                        field2456 = var19;
                        continue;
                    }
                    if (var621 == 42) {
                        field2468[var2++] = class128.field1936[var6[var4]];
                        continue;
                    }
                    if (var621 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class128.field1936[var23] = field2468[var2];
                        class117.method912((byte) 109, var23);
                        class35.field479 |= class42.field562[var23];
                        continue;
                    }
                    if (var621 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field2468[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field2460[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4487;
                                }
                                field2462[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field2468[var2];
                        if (var30 >= 0 && var30 < field2460[var29]) {
                            field2468[var2++] = field2462[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field2468[var2];
                        if (var32 >= 0 && var32 < field2460[var31]) {
                            field2462[var31][var32] = field2468[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var621 == 47) {
                        String var33 = class122.field1844[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field2467[var3++] = var33;
                        continue;
                    }
                    if (var621 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class122.field1844[var34] = field2467[var3];
                        class375.method2343(2, var34);
                        continue;
                    }
                    if (var621 == 51) {
                        class109 var35 = arg0.field4326[var6[var4]];
                        var2--;
                        class166 var36 = (class166) var35.method837((byte) -72, (long) field2468[var2]);
                        if (var36 != null) {
                            var4 += var36.field2342;
                        }
                        continue;
                    }
                }
                boolean var37;
                if (var6[var4] == 1) {
                    var37 = true;
                } else {
                    var37 = false;
                }
                if (var621 < 300) {
                    if (var621 == 100) {
                        var2 -= 3;
                        int var38 = field2468[var2];
                        int var39 = field2468[var2 + 1];
                        int var40 = field2468[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class108 var41 = class157.method1139(var38, false);
                        if (var41.field1651 == null) {
                            var41.field1651 = new class108[var40 + 1];
                        }
                        if (var41.field1651.length <= var40) {
                            class108[] var42 = new class108[var40 + 1];
                            for (int var43 = 0; var43 < var41.field1651.length; var43++) {
                                var42[var43] = var41.field1651[var43];
                            }
                            var41.field1651 = var42;
                        }
                        if (var40 > 0 && var41.field1651[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class108 var44 = new class108();
                        var44.field1666 = var39;
                        var44.field1540 = var44.field1631 = var41.field1631;
                        var44.field1647 = var40;
                        var41.field1651[var40] = var44;
                        if (var37) {
                            field2457 = var44;
                        } else {
                            field2454 = var44;
                        }
                        class298.method1821((byte) -90, var41);
                        continue;
                    }
                    if (var621 == 101) {
                        class108 var45 = var37 ? field2457 : field2454;
                        if (var45.field1647 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class108 var46 = class157.method1139(var45.field1631, false);
                        var46.field1651[var45.field1647] = null;
                        class298.method1821((byte) -76, var46);
                        continue;
                    }
                    if (var621 == 102) {
                        var2--;
                        class108 var47 = class157.method1139(field2468[var2], false);
                        var47.field1651 = null;
                        class298.method1821((byte) -87, var47);
                        continue;
                    }
                    if (var621 == 200) {
                        var2 -= 2;
                        int var48 = field2468[var2];
                        int var49 = field2468[var2 + 1];
                        class108 var50 = class451.method2815(var48, var49, (byte) -53);
                        if (var50 != null && var49 != -1) {
                            field2468[var2++] = 1;
                            if (var37) {
                                field2457 = var50;
                            } else {
                                field2454 = var50;
                            }
                            continue;
                        }
                        field2468[var2++] = 0;
                        continue;
                    }
                    if (var621 == 201) {
                        var2--;
                        int var51 = field2468[var2];
                        class108 var52 = class157.method1139(var51, false);
                        if (var52 == null) {
                            field2468[var2++] = 0;
                        } else {
                            field2468[var2++] = 1;
                            if (var37) {
                                field2457 = var52;
                            } else {
                                field2454 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var621 < 500) {
                    if (var621 == 403) {
                        var2 -= 2;
                        int var53 = field2468[var2];
                        int var54 = field2468[var2 + 1];
                        for (int var55 = 0; var55 < class334.field4528.length; var55++) {
                            if (class334.field4528[var55] == var53) {
                                class359.field4970.field5874.method2068(var55, (byte) -109, var54);
                                continue label4487;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class369.field5114.length) {
                                continue label4487;
                            }
                            if (class369.field5114[var56] == var53) {
                                class359.field4970.field5874.method2068(var56, (byte) -102, var54);
                                continue label4487;
                            }
                            var56++;
                        }
                    }
                    if (var621 == 404) {
                        var2 -= 2;
                        int var57 = field2468[var2];
                        int var58 = field2468[var2 + 1];
                        class359.field4970.field5874.method2070(var57, var58, 110);
                        continue;
                    }
                    if (var621 == 410) {
                        var2--;
                        boolean var59 = field2468[var2] != 0;
                        class359.field4970.field5874.method2063(-122, var59);
                        continue;
                    }
                } else if (!(var621 < 1000 || var621 >= 1100) || !(var621 < 2000 || var621 >= 2100)) {
                    class108 var60;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var60 = class157.method1139(field2468[var2], false);
                    } else {
                        var60 = var37 ? field2457 : field2454;
                    }
                    if (var621 == 1000) {
                        var2 -= 4;
                        var60.field1606 = field2468[var2];
                        var60.field1538 = field2468[var2 + 1];
                        int var61 = field2468[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field2468[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field1552 = (byte) var61;
                        var60.field1645 = (byte) var62;
                        class298.method1821((byte) -98, var60);
                        class341.method2082(true, var60);
                        if (var60.field1647 == -1) {
                            class50.method411(var60.field1631, (byte) 112);
                        }
                        continue;
                    }
                    if (var621 == 1001) {
                        var2 -= 4;
                        var60.field1583 = field2468[var2];
                        var60.field1522 = field2468[var2 + 1];
                        var60.field1599 = 0;
                        var60.field1574 = 0;
                        int var63 = field2468[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field2468[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field1608 = (byte) var63;
                        var60.field1536 = (byte) var64;
                        class298.method1821((byte) -59, var60);
                        class341.method2082(true, var60);
                        if (var60.field1666 == 0) {
                            class6.method40(false, var60, false);
                        }
                        continue;
                    }
                    if (var621 == 1003) {
                        var2--;
                        boolean var65 = field2468[var2] == 1;
                        if (var60.field1656 != var65) {
                            var60.field1656 = var65;
                            class298.method1821((byte) -85, var60);
                        }
                        if (var60.field1647 == -1) {
                            class187.method1300(var60.field1631, true);
                        }
                        continue;
                    }
                    if (var621 == 1004) {
                        var2 -= 2;
                        var60.field1617 = field2468[var2];
                        var60.field1638 = field2468[var2 + 1];
                        class298.method1821((byte) -77, var60);
                        class341.method2082(true, var60);
                        if (var60.field1666 == 0) {
                            class6.method40(false, var60, false);
                        }
                        continue;
                    }
                    if (var621 == 1005) {
                        var2--;
                        var60.field1676 = field2468[var2] == 1;
                        continue;
                    }
                } else if (!(var621 < 1100 || var621 >= 1200) || !(var621 < 2100 || var621 >= 2200)) {
                    class108 var66;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var66 = class157.method1139(field2468[var2], false);
                    } else {
                        var66 = var37 ? field2457 : field2454;
                    }
                    if (var621 == 1100) {
                        var2 -= 2;
                        var66.field1665 = field2468[var2];
                        if (var66.field1665 > var66.field1543 - var66.field1568) {
                            var66.field1665 = var66.field1543 - var66.field1568;
                        }
                        if (var66.field1665 < 0) {
                            var66.field1665 = 0;
                        }
                        var66.field1633 = field2468[var2 + 1];
                        if (var66.field1633 > var66.field1629 - var66.field1577) {
                            var66.field1633 = var66.field1629 - var66.field1577;
                        }
                        if (var66.field1633 < 0) {
                            var66.field1633 = 0;
                        }
                        class298.method1821((byte) -117, var66);
                        if (var66.field1647 == -1) {
                            class70.method556((byte) 62, var66.field1631);
                        }
                        continue;
                    }
                    if (var621 == 1101) {
                        var2--;
                        var66.field1534 = field2468[var2];
                        class298.method1821((byte) -107, var66);
                        if (var66.field1647 == -1) {
                            class251.method1618(2, var66.field1631);
                        }
                        continue;
                    }
                    if (var621 == 1102) {
                        var2--;
                        var66.field1535 = field2468[var2] == 1;
                        class298.method1821((byte) -104, var66);
                        continue;
                    }
                    if (var621 == 1103) {
                        var2--;
                        var66.field1533 = field2468[var2];
                        class298.method1821((byte) -118, var66);
                        continue;
                    }
                    if (var621 == 1104) {
                        var2--;
                        var66.field1565 = field2468[var2];
                        class298.method1821((byte) -93, var66);
                        continue;
                    }
                    if (var621 == 1105) {
                        var2--;
                        int var67 = field2468[var2];
                        if (var66.field1547 != var67) {
                            var66.field1547 = var67;
                            class298.method1821((byte) -82, var66);
                        }
                        if (var66.field1647 == -1) {
                            class278.method1753((byte) -76, var66.field1631);
                        }
                        continue;
                    }
                    if (var621 == 1106) {
                        var2--;
                        var66.field1558 = field2468[var2];
                        class298.method1821((byte) -89, var66);
                        continue;
                    }
                    if (var621 == 1107) {
                        var2--;
                        var66.field1566 = field2468[var2] == 1;
                        class298.method1821((byte) -93, var66);
                        continue;
                    }
                    if (var621 == 1108) {
                        var66.field1661 = 1;
                        var2--;
                        var66.field1578 = field2468[var2];
                        class298.method1821((byte) -89, var66);
                        if (var66.field1647 == -1) {
                            class143.method1041(var66.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1109) {
                        var2 -= 6;
                        var66.field1560 = field2468[var2];
                        var66.field1677 = field2468[var2 + 1];
                        var66.field1527 = field2468[var2 + 2];
                        var66.field1671 = field2468[var2 + 3];
                        var66.field1628 = field2468[var2 + 4];
                        var66.field1604 = field2468[var2 + 5];
                        class298.method1821((byte) -112, var66);
                        if (var66.field1647 == -1) {
                            class11.method60(-122, var66.field1631);
                            class46.method381(var66.field1631, (byte) -108);
                        }
                        continue;
                    }
                    if (var621 == 1110) {
                        var2--;
                        int var68 = field2468[var2];
                        if (var66.field1607 != var68) {
                            var66.field1607 = var68;
                            var66.field1539 = 0;
                            var66.field1648 = 1;
                            var66.field1620 = 0;
                            class298.method1821((byte) -66, var66);
                        }
                        if (var66.field1647 == -1) {
                            class165.method1179(var66.field1631, 5);
                        }
                        continue;
                    }
                    if (var621 == 1111) {
                        var2--;
                        var66.field1615 = field2468[var2] == 1;
                        class298.method1821((byte) -87, var66);
                        continue;
                    }
                    if (var621 == 1112) {
                        var3--;
                        String var69 = field2467[var3];
                        if (!var69.equals(var66.field1559)) {
                            var66.field1559 = var69;
                            class298.method1821((byte) -78, var66);
                        }
                        if (var66.field1647 == -1) {
                            class310.method1880((byte) -128, var66.field1631);
                        }
                        continue;
                    }
                    if (var621 == 1113) {
                        var2--;
                        var66.field1603 = field2468[var2];
                        class298.method1821((byte) -104, var66);
                        if (var66.field1647 == -1) {
                            class50.method409(var66.field1631, -20243);
                        }
                        continue;
                    }
                    if (var621 == 1114) {
                        var2 -= 3;
                        var66.field1635 = field2468[var2];
                        var66.field1632 = field2468[var2 + 1];
                        var66.field1640 = field2468[var2 + 2];
                        class298.method1821((byte) -115, var66);
                        continue;
                    }
                    if (var621 == 1115) {
                        var2--;
                        var66.field1546 = field2468[var2] == 1;
                        class298.method1821((byte) -114, var66);
                        continue;
                    }
                    if (var621 == 1116) {
                        var2--;
                        var66.field1622 = field2468[var2];
                        class298.method1821((byte) -61, var66);
                        continue;
                    }
                    if (var621 == 1117) {
                        var2--;
                        var66.field1621 = field2468[var2];
                        class298.method1821((byte) -123, var66);
                        continue;
                    }
                    if (var621 == 1118) {
                        var2--;
                        var66.field1582 = field2468[var2] == 1;
                        class298.method1821((byte) -84, var66);
                        continue;
                    }
                    if (var621 == 1119) {
                        var2--;
                        var66.field1670 = field2468[var2] == 1;
                        class298.method1821((byte) -82, var66);
                        continue;
                    }
                    if (var621 == 1120) {
                        var2 -= 2;
                        var66.field1543 = field2468[var2];
                        var66.field1629 = field2468[var2 + 1];
                        class298.method1821((byte) -67, var66);
                        if (var66.field1666 == 0) {
                            class6.method40(false, var66, false);
                        }
                        continue;
                    }
                    if (var621 == 1121) {
                        var2 -= 2;
                        var66.field1641 = (short) field2468[var2];
                        var66.field1553 = (short) field2468[var2 + 1];
                        class298.method1821((byte) -81, var66);
                        continue;
                    }
                    if (var621 == 1122) {
                        var2--;
                        var66.field1567 = field2468[var2] == 1;
                        class298.method1821((byte) -113, var66);
                        continue;
                    }
                    if (var621 == 1123) {
                        var2--;
                        var66.field1604 = field2468[var2];
                        class298.method1821((byte) -70, var66);
                        if (var66.field1647 == -1) {
                            class11.method60(-116, var66.field1631);
                        }
                        continue;
                    }
                    if (var621 == 1124) {
                        var2--;
                        int var70 = field2468[var2];
                        var66.field1668 = var70 == 1;
                        class298.method1821((byte) -72, var66);
                        continue;
                    }
                    if (var621 == 1125) {
                        var2 -= 2;
                        var66.field1573 = field2468[var2];
                        var66.field1630 = field2468[var2 + 1];
                        class298.method1821((byte) -98, var66);
                        continue;
                    }
                } else if (var621 >= 1200 && var621 < 1300 || var621 >= 2200 && var621 < 2300) {
                    class108 var71;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var71 = class157.method1139(field2468[var2], false);
                    } else {
                        var71 = var37 ? field2457 : field2454;
                    }
                    class298.method1821((byte) -72, var71);
                    if (var621 == 1200 || var621 == 1205 || var621 == 1208 || var621 == 1209 || var621 == 1212 || var621 == 1213) {
                        var2 -= 2;
                        int var72 = field2468[var2];
                        int var73 = field2468[var2 + 1];
                        if (var71.field1647 == -1) {
                            class277.method1751(var71.field1631, true);
                            class11.method60(48, var71.field1631);
                            class46.method381(var71.field1631, (byte) -86);
                        }
                        if (var72 == -1) {
                            var71.field1661 = 1;
                            var71.field1578 = -1;
                            var71.field1575 = -1;
                            continue;
                        }
                        var71.field1575 = var72;
                        var71.field1554 = var73;
                        if (var621 == 1208 || var621 == 1209) {
                            var71.field1636 = true;
                        } else {
                            var71.field1636 = false;
                        }
                        class14 var74 = class367.method2308(false, var72);
                        var71.field1527 = var74.field135;
                        var71.field1671 = var74.field189;
                        var71.field1628 = var74.field190;
                        var71.field1560 = var74.field173;
                        var71.field1677 = var74.field199;
                        var71.field1604 = var74.field156;
                        if (var621 == 1205 || var621 == 1209) {
                            var71.field1624 = 0;
                        } else if (var621 == 1212 || var621 == 1213) {
                            var71.field1624 = 1;
                        } else {
                            var71.field1624 = 2;
                        }
                        if (var71.field1599 > 0) {
                            var71.field1604 = var71.field1604 * 32 / var71.field1599;
                        } else if (var71.field1583 > 0) {
                            var71.field1604 = var71.field1604 * 32 / var71.field1583;
                        }
                        continue;
                    }
                    if (var621 == 1201) {
                        var71.field1661 = 2;
                        var2--;
                        var71.field1578 = field2468[var2];
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1202) {
                        var71.field1661 = 3;
                        var71.field1578 = -1;
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1203) {
                        var71.field1661 = 6;
                        var2--;
                        var71.field1578 = field2468[var2];
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1204) {
                        var71.field1661 = 5;
                        var2--;
                        var71.field1578 = field2468[var2];
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1206) {
                        var2 -= 4;
                        var71.field1652 = field2468[var2];
                        var71.field1663 = field2468[var2 + 1];
                        var71.field1587 = field2468[var2 + 2];
                        var71.field1618 = field2468[var2 + 3];
                        class298.method1821((byte) -95, var71);
                        continue;
                    }
                    if (var621 == 1207) {
                        var2 -= 2;
                        var71.field1600 = field2468[var2];
                        var71.field1542 = field2468[var2 + 1];
                        class298.method1821((byte) -110, var71);
                        continue;
                    }
                    if (var621 == 1210) {
                        var2 -= 4;
                        var71.field1578 = field2468[var2];
                        var71.field1619 = field2468[var2 + 1];
                        if (field2468[var2 + 2] == 1) {
                            var71.field1661 = 9;
                        } else {
                            var71.field1661 = 8;
                        }
                        if (field2468[var2 + 3] == 1) {
                            var71.field1636 = true;
                        } else {
                            var71.field1636 = false;
                        }
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                    if (var621 == 1211) {
                        var71.field1661 = 5;
                        var71.field1578 = 2047;
                        var71.field1619 = 0;
                        if (var71.field1647 == -1) {
                            class143.method1041(var71.field1631, (byte) -61);
                        }
                        continue;
                    }
                } else if (var621 >= 1300 && var621 < 1400 || var621 >= 2300 && var621 < 2400) {
                    class108 var75;
                    if (var621 >= 2000) {
                        var621 -= 1000;
                        var2--;
                        var75 = class157.method1139(field2468[var2], false);
                    } else {
                        var75 = var37 ? field2457 : field2454;
                    }
                    if (var621 == 1300) {
                        var2--;
                        int var76 = field2468[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method826(var76, -17333, field2467[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var621 == 1301) {
                        var2 -= 2;
                        int var77 = field2468[var2];
                        int var78 = field2468[var2 + 1];
                        var75.field1623 = class451.method2815(var77, var78, (byte) -53);
                        continue;
                    }
                    if (var621 == 1302) {
                        var2--;
                        var75.field1597 = field2468[var2] == 1;
                        continue;
                    }
                    if (var621 == 1303) {
                        var2--;
                        var75.field1545 = field2468[var2];
                        continue;
                    }
                    if (var621 == 1304) {
                        var2--;
                        var75.field1610 = field2468[var2];
                        continue;
                    }
                    if (var621 == 1305) {
                        var3--;
                        var75.field1658 = field2467[var3];
                        continue;
                    }
                    if (var621 == 1306) {
                        var3--;
                        var75.field1523 = field2467[var3];
                        continue;
                    }
                    if (var621 == 1307) {
                        var75.field1571 = null;
                        continue;
                    }
                    if (var621 == 1308) {
                        var2--;
                        var75.field1675 = field2468[var2];
                        var2--;
                        var75.field1669 = field2468[var2];
                        continue;
                    }
                    if (var621 == 1309) {
                        var2--;
                        int var79 = field2468[var2];
                        var2--;
                        int var80 = field2468[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method827(var79, var80 - 1, -67);
                        }
                        continue;
                    }
                    if (var621 == 1310) {
                        var3--;
                        var75.field1672 = field2467[var3];
                        continue;
                    }
                    if (var621 == 1311) {
                        var2--;
                        var75.field1609 = field2468[var2];
                        continue;
                    }
                } else {
                    if (var621 >= 1400 && var621 < 1500 || var621 >= 2400 && var621 < 2500) {
                        class108 var81;
                        if (var621 >= 2000) {
                            var621 -= 1000;
                            var2--;
                            var81 = class157.method1139(field2468[var2], false);
                        } else {
                            var81 = var37 ? field2457 : field2454;
                        }
                        var3--;
                        String var82 = field2467[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field2468[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field2468[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field2467[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field2468[var2]);
                            }
                        }
                        var2--;
                        int var87 = field2468[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var621 == 1400) {
                            var81.field1530 = var85;
                        } else if (var621 == 1401) {
                            var81.field1564 = var85;
                        } else if (var621 == 1402) {
                            var81.field1634 = var85;
                        } else if (var621 == 1403) {
                            var81.field1639 = var85;
                        } else if (var621 == 1404) {
                            var81.field1524 = var85;
                        } else if (var621 == 1405) {
                            var81.field1590 = var85;
                        } else if (var621 == 1406) {
                            var81.field1616 = var85;
                        } else if (var621 == 1407) {
                            var81.field1584 = var85;
                            var81.field1579 = var83;
                        } else if (var621 == 1408) {
                            var81.field1614 = var85;
                        } else if (var621 == 1409) {
                            var81.field1667 = var85;
                        } else if (var621 == 1410) {
                            var81.field1649 = var85;
                        } else if (var621 == 1411) {
                            var81.field1598 = var85;
                        } else if (var621 == 1412) {
                            var81.field1537 = var85;
                        } else if (var621 == 1414) {
                            var81.field1625 = var85;
                            var81.field1637 = var83;
                        } else if (var621 == 1415) {
                            var81.field1569 = var85;
                            var81.field1541 = var83;
                        } else if (var621 == 1416) {
                            var81.field1562 = var85;
                        } else if (var621 == 1417) {
                            var81.field1576 = var85;
                        } else if (var621 == 1418) {
                            var81.field1662 = var85;
                        } else if (var621 == 1419) {
                            var81.field1529 = var85;
                        } else if (var621 == 1420) {
                            var81.field1532 = var85;
                        } else if (var621 == 1421) {
                            var81.field1561 = var85;
                        } else if (var621 == 1422) {
                            var81.field1594 = var85;
                        } else if (var621 == 1423) {
                            var81.field1653 = var85;
                        } else if (var621 == 1424) {
                            var81.field1627 = var85;
                        } else if (var621 == 1425) {
                            var81.field1654 = var85;
                        } else if (var621 == 1426) {
                            var81.field1591 = var85;
                        } else if (var621 == 1427) {
                            var81.field1673 = var85;
                        } else if (var621 == 1428) {
                            var81.field1585 = var85;
                            var81.field1626 = var83;
                        } else if (var621 == 1429) {
                            var81.field1646 = var85;
                            var81.field1563 = var83;
                        }
                        var81.field1644 = true;
                        continue;
                    }
                    if (var621 < 1600) {
                        class108 var88 = var37 ? field2457 : field2454;
                        if (var621 == 1500) {
                            field2468[var2++] = var88.field1659;
                            continue;
                        }
                        if (var621 == 1501) {
                            field2468[var2++] = var88.field1588;
                            continue;
                        }
                        if (var621 == 1502) {
                            field2468[var2++] = var88.field1568;
                            continue;
                        }
                        if (var621 == 1503) {
                            field2468[var2++] = var88.field1577;
                            continue;
                        }
                        if (var621 == 1504) {
                            field2468[var2++] = var88.field1656 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 1505) {
                            field2468[var2++] = var88.field1540;
                            continue;
                        }
                    } else if (var621 < 1700) {
                        class108 var89 = var37 ? field2457 : field2454;
                        if (var621 == 1600) {
                            field2468[var2++] = var89.field1665;
                            continue;
                        }
                        if (var621 == 1601) {
                            field2468[var2++] = var89.field1633;
                            continue;
                        }
                        if (var621 == 1602) {
                            field2467[var3++] = var89.field1559;
                            continue;
                        }
                        if (var621 == 1603) {
                            field2468[var2++] = var89.field1543;
                            continue;
                        }
                        if (var621 == 1604) {
                            field2468[var2++] = var89.field1629;
                            continue;
                        }
                        if (var621 == 1605) {
                            field2468[var2++] = var89.field1604;
                            continue;
                        }
                        if (var621 == 1606) {
                            field2468[var2++] = var89.field1527;
                            continue;
                        }
                        if (var621 == 1607) {
                            field2468[var2++] = var89.field1628;
                            continue;
                        }
                        if (var621 == 1608) {
                            field2468[var2++] = var89.field1671;
                            continue;
                        }
                        if (var621 == 1609) {
                            field2468[var2++] = var89.field1533;
                            continue;
                        }
                        if (var621 == 1610) {
                            field2468[var2++] = var89.field1560;
                            continue;
                        }
                        if (var621 == 1611) {
                            field2468[var2++] = var89.field1677;
                            continue;
                        }
                        if (var621 == 1612) {
                            field2468[var2++] = var89.field1547;
                            continue;
                        }
                    } else if (var621 < 1800) {
                        class108 var90 = var37 ? field2457 : field2454;
                        if (var621 == 1700) {
                            field2468[var2++] = var90.field1575;
                            continue;
                        }
                        if (var621 == 1701) {
                            if (var90.field1575 == -1) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var90.field1554;
                            }
                            continue;
                        }
                        if (var621 == 1702) {
                            field2468[var2++] = var90.field1647;
                            continue;
                        }
                    } else if (var621 < 1900) {
                        class108 var91 = var37 ? field2457 : field2454;
                        if (var621 == 1800) {
                            field2468[var2++] = client.method1634(var91).method1875(2644133);
                            continue;
                        }
                        if (var621 == 1801) {
                            var2--;
                            int var92 = field2468[var2];
                            int var622 = var92 - 1;
                            if (var91.field1571 != null && var622 < var91.field1571.length && var91.field1571[var622] != null) {
                                field2467[var3++] = var91.field1571[var622];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 1802) {
                            if (var91.field1658 == null) {
                                field2467[var3++] = "";
                            } else {
                                field2467[var3++] = var91.field1658;
                            }
                            continue;
                        }
                    } else if (var621 < 2600) {
                        var2--;
                        class108 var93 = class157.method1139(field2468[var2], false);
                        if (var621 == 2500) {
                            field2468[var2++] = var93.field1659;
                            continue;
                        }
                        if (var621 == 2501) {
                            field2468[var2++] = var93.field1588;
                            continue;
                        }
                        if (var621 == 2502) {
                            field2468[var2++] = var93.field1568;
                            continue;
                        }
                        if (var621 == 2503) {
                            field2468[var2++] = var93.field1577;
                            continue;
                        }
                        if (var621 == 2504) {
                            field2468[var2++] = var93.field1656 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 2505) {
                            field2468[var2++] = var93.field1540;
                            continue;
                        }
                    } else if (var621 < 2700) {
                        var2--;
                        class108 var94 = class157.method1139(field2468[var2], false);
                        if (var621 == 2600) {
                            field2468[var2++] = var94.field1665;
                            continue;
                        }
                        if (var621 == 2601) {
                            field2468[var2++] = var94.field1633;
                            continue;
                        }
                        if (var621 == 2602) {
                            field2467[var3++] = var94.field1559;
                            continue;
                        }
                        if (var621 == 2603) {
                            field2468[var2++] = var94.field1543;
                            continue;
                        }
                        if (var621 == 2604) {
                            field2468[var2++] = var94.field1629;
                            continue;
                        }
                        if (var621 == 2605) {
                            field2468[var2++] = var94.field1604;
                            continue;
                        }
                        if (var621 == 2606) {
                            field2468[var2++] = var94.field1527;
                            continue;
                        }
                        if (var621 == 2607) {
                            field2468[var2++] = var94.field1628;
                            continue;
                        }
                        if (var621 == 2608) {
                            field2468[var2++] = var94.field1671;
                            continue;
                        }
                        if (var621 == 2609) {
                            field2468[var2++] = var94.field1533;
                            continue;
                        }
                        if (var621 == 2610) {
                            field2468[var2++] = var94.field1560;
                            continue;
                        }
                        if (var621 == 2611) {
                            field2468[var2++] = var94.field1677;
                            continue;
                        }
                        if (var621 == 2612) {
                            field2468[var2++] = var94.field1547;
                            continue;
                        }
                    } else if (var621 < 2800) {
                        if (var621 == 2700) {
                            var2--;
                            class108 var95 = class157.method1139(field2468[var2], false);
                            field2468[var2++] = var95.field1575;
                            continue;
                        }
                        if (var621 == 2701) {
                            var2--;
                            class108 var96 = class157.method1139(field2468[var2], false);
                            if (var96.field1575 == -1) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var96.field1554;
                            }
                            continue;
                        }
                        if (var621 == 2702) {
                            var2--;
                            int var97 = field2468[var2];
                            class435 var98 = (class435) class171.field2415.method837((byte) -72, (long) var97);
                            if (var98 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = 1;
                            }
                            continue;
                        }
                        if (var621 == 2703) {
                            var2--;
                            class108 var99 = class157.method1139(field2468[var2], false);
                            if (var99.field1651 == null) {
                                field2468[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field1651.length;
                            for (int var101 = 0; var101 < var99.field1651.length; var101++) {
                                if (var99.field1651[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field2468[var2++] = var100;
                            continue;
                        }
                        if (var621 == 2704 || var621 == 2705) {
                            var2 -= 2;
                            int var102 = field2468[var2];
                            int var103 = field2468[var2 + 1];
                            class435 var104 = (class435) class171.field2415.method837((byte) -72, (long) var102);
                            if (var104 != null && var104.field6146 == var103) {
                                field2468[var2++] = 1;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                    } else if (var621 < 2900) {
                        var2--;
                        class108 var105 = class157.method1139(field2468[var2], false);
                        if (var621 == 2800) {
                            field2468[var2++] = client.method1634(var105).method1875(2644133);
                            continue;
                        }
                        if (var621 == 2801) {
                            var2--;
                            int var106 = field2468[var2];
                            int var623 = var106 - 1;
                            if (var105.field1571 != null && var623 < var105.field1571.length && var105.field1571[var623] != null) {
                                field2467[var3++] = var105.field1571[var623];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 2802) {
                            if (var105.field1658 == null) {
                                field2467[var3++] = "";
                            } else {
                                field2467[var3++] = var105.field1658;
                            }
                            continue;
                        }
                    } else if (var621 < 3200) {
                        if (var621 == 3100) {
                            var3--;
                            String var107 = field2467[var3];
                            client.method1640(-5, var107);
                            continue;
                        }
                        if (var621 == 3101) {
                            var2 -= 2;
                            class269.method1713(field2468[var2 + 1], class359.field4970, field2468[var2], true);
                            continue;
                        }
                        if (var621 == 3103) {
                            class123.method946(true, (byte) -60);
                            continue;
                        }
                        if (var621 == 3104) {
                            var3--;
                            String var108 = field2467[var3];
                            int var109 = 0;
                            if (class43.method369(var108, 10)) {
                                var109 = class388.method2418(109, var108);
                            }
                            field2463++;
                            class88.field1232.method1151(182, (byte) 115);
                            class88.field1232.method2261(var109, -176);
                            continue;
                        }
                        if (var621 == 3105) {
                            var3--;
                            String var110 = field2467[var3];
                            field2464++;
                            class88.field1232.method1151(133, (byte) 90);
                            class88.field1232.method2280(var110.length() + 1, 1537846408);
                            class88.field1232.method2285(var110, (byte) -97);
                            continue;
                        }
                        if (var621 == 3106) {
                            var3--;
                            String var111 = field2467[var3];
                            field2458++;
                            class88.field1232.method1151(195, (byte) -29);
                            class88.field1232.method2280(var111.length() + 1, 1537846408);
                            class88.field1232.method2285(var111, (byte) -97);
                            continue;
                        }
                        if (var621 == 3107) {
                            var2--;
                            int var112 = field2468[var2];
                            var3--;
                            String var113 = field2467[var3];
                            class32.method295(var112, var113, true);
                            continue;
                        }
                        if (var621 == 3108) {
                            var2 -= 3;
                            int var114 = field2468[var2];
                            int var115 = field2468[var2 + 1];
                            int var116 = field2468[var2 + 2];
                            class108 var117 = class157.method1139(var116, false);
                            class144.method1046(32566, var114, var115, var117);
                            continue;
                        }
                        if (var621 == 3109) {
                            var2 -= 2;
                            int var118 = field2468[var2];
                            int var119 = field2468[var2 + 1];
                            class108 var120 = var37 ? field2457 : field2454;
                            class144.method1046(32566, var118, var119, var120);
                            continue;
                        }
                        if (var621 == 3110) {
                            var2--;
                            int var121 = field2468[var2];
                            field2476++;
                            class88.field1232.method1151(33, (byte) -78);
                            class88.field1232.method2275(-27, var121);
                            continue;
                        }
                        if (var621 == 3111) {
                            var2 -= 2;
                            int var122 = field2468[var2];
                            int var123 = field2468[var2 + 1];
                            class435 var124 = (class435) class171.field2415.method837((byte) -72, (long) var122);
                            if (var124 != null) {
                                class147.method1063((byte) -121, var124.field6146 != var123, true, var124);
                            }
                            class160.method1156(7228, var123, 3, var122, true);
                            continue;
                        }
                        if (var621 == 3112) {
                            var2--;
                            int var125 = field2468[var2];
                            class435 var126 = (class435) class171.field2415.method837((byte) -72, (long) var125);
                            if (var126 != null && var126.field6140 == 3) {
                                class147.method1063((byte) -123, true, true, var126);
                            }
                            continue;
                        }
                    } else if (var621 < 3300) {
                        if (var621 == 3200) {
                            var2 -= 3;
                            class346.method2098(field2468[var2 + 2], field2468[var2 + 1], field2468[var2], 255, (byte) -126);
                            continue;
                        }
                        if (var621 == 3201) {
                            var2--;
                            class348.method2107(255, (byte) 23, field2468[var2]);
                            continue;
                        }
                        if (var621 == 3202) {
                            var2 -= 2;
                            class298.method1820(255, (byte) 20, field2468[var2], field2468[var2 + 1]);
                            continue;
                        }
                    } else if (var621 < 3400) {
                        if (var621 == 3300) {
                            field2468[var2++] = class246.field3467;
                            continue;
                        }
                        if (var621 == 3301) {
                            var2 -= 2;
                            int var127 = field2468[var2];
                            int var128 = field2468[var2 + 1];
                            field2468[var2++] = class412.method2549(var127, (byte) 89, false, var128);
                            continue;
                        }
                        if (var621 == 3302) {
                            var2 -= 2;
                            int var129 = field2468[var2];
                            int var130 = field2468[var2 + 1];
                            field2468[var2++] = class169.method1209(var129, var130, false, (byte) -113);
                            continue;
                        }
                        if (var621 == 3303) {
                            var2 -= 2;
                            int var131 = field2468[var2];
                            int var132 = field2468[var2 + 1];
                            field2468[var2++] = class46.method378(false, (byte) 95, var131, var132);
                            continue;
                        }
                        if (var621 == 3304) {
                            var2--;
                            int var133 = field2468[var2];
                            field2468[var2++] = class71.method562((byte) -128, var133).field1134;
                            continue;
                        }
                        if (var621 == 3305) {
                            var2--;
                            int var134 = field2468[var2];
                            field2468[var2++] = class371.field5147[var134];
                            continue;
                        }
                        if (var621 == 3306) {
                            var2--;
                            int var135 = field2468[var2];
                            field2468[var2++] = class236.field3365[var135];
                            continue;
                        }
                        if (var621 == 3307) {
                            var2--;
                            int var136 = field2468[var2];
                            field2468[var2++] = class192.field2767[var136];
                            continue;
                        }
                        if (var621 == 3308) {
                            int var137 = class343.field4623;
                            int var138 = (class359.field4970.field40 >> 7) + class6.field65;
                            int var139 = (class359.field4970.field44 >> 7) + class371.field5148;
                            field2468[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var621 == 3309) {
                            var2--;
                            int var140 = field2468[var2];
                            field2468[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3310) {
                            var2--;
                            int var141 = field2468[var2];
                            field2468[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var621 == 3311) {
                            var2--;
                            int var142 = field2468[var2];
                            field2468[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var621 == 3312) {
                            field2468[var2++] = class55.field701 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3313) {
                            var2 -= 2;
                            int var143 = field2468[var2];
                            int var144 = field2468[var2 + 1];
                            field2468[var2++] = class412.method2549(var143, (byte) 89, true, var144);
                            continue;
                        }
                        if (var621 == 3314) {
                            var2 -= 2;
                            int var145 = field2468[var2];
                            int var146 = field2468[var2 + 1];
                            field2468[var2++] = class169.method1209(var145, var146, true, (byte) -113);
                            continue;
                        }
                        if (var621 == 3315) {
                            var2 -= 2;
                            int var147 = field2468[var2];
                            int var148 = field2468[var2 + 1];
                            field2468[var2++] = class46.method378(true, (byte) 95, var147, var148);
                            continue;
                        }
                        if (var621 == 3316) {
                            if (class157.field2234 >= 2) {
                                field2468[var2++] = class157.field2234;
                            } else {
                                field2468[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 3317) {
                            field2468[var2++] = class64.field884;
                            continue;
                        }
                        if (var621 == 3318) {
                            field2468[var2++] = class399.field5517;
                            continue;
                        }
                        if (var621 == 3321) {
                            field2468[var2++] = class11.field102;
                            continue;
                        }
                        if (var621 == 3322) {
                            field2468[var2++] = class356.field4784;
                            continue;
                        }
                        if (var621 == 3323) {
                            if (class439.field6194 >= 5 && class439.field6194 <= 9) {
                                field2468[var2++] = 1;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3324) {
                            if (class439.field6194 >= 5 && class439.field6194 <= 9) {
                                field2468[var2++] = class439.field6194;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3325) {
                            field2468[var2++] = class311.field4221 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3326) {
                            field2468[var2++] = class359.field4970.field5878;
                            continue;
                        }
                        if (var621 == 3327) {
                            field2468[var2++] = class359.field4970.field5874.field4585 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3328) {
                            field2468[var2++] = class119.field1806 && !class189.field2725 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3329) {
                            field2468[var2++] = class117.field1790 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3330) {
                            var2--;
                            int var149 = field2468[var2];
                            field2468[var2++] = class162.method1172(false, (byte) -97, var149);
                            continue;
                        }
                        if (var621 == 3331) {
                            var2 -= 2;
                            int var150 = field2468[var2];
                            int var151 = field2468[var2 + 1];
                            field2468[var2++] = class132.method989(var151, false, -118, var150, false);
                            continue;
                        }
                        if (var621 == 3332) {
                            var2 -= 2;
                            int var152 = field2468[var2];
                            int var153 = field2468[var2 + 1];
                            field2468[var2++] = class132.method989(var153, false, -118, var152, true);
                            continue;
                        }
                        if (var621 == 3333) {
                            field2468[var2++] = class339.field4592;
                            continue;
                        }
                        if (var621 == 3335) {
                            field2468[var2++] = class445.field6241;
                            continue;
                        }
                        if (var621 == 3336) {
                            var2 -= 4;
                            int var154 = field2468[var2];
                            int var155 = field2468[var2 + 1];
                            int var156 = field2468[var2 + 2];
                            int var157 = field2468[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field2468[var2++] = var160;
                            continue;
                        }
                        if (var621 == 3337) {
                            field2468[var2++] = class47.field606;
                            continue;
                        }
                        if (var621 == 3338) {
                            field2468[var2++] = class334.method2040(0);
                            continue;
                        }
                    } else if (var621 < 3500) {
                        if (var621 == 3400) {
                            var2 -= 2;
                            int var161 = field2468[var2];
                            int var162 = field2468[var2 + 1];
                            class394 var163 = class177.method1255(var161, -112);
                            field2467[var3++] = var163.method2444(61, var162);
                            continue;
                        }
                        if (var621 == 3408) {
                            var2 -= 4;
                            int var164 = field2468[var2];
                            int var165 = field2468[var2 + 1];
                            int var166 = field2468[var2 + 2];
                            int var167 = field2468[var2 + 3];
                            class394 var168 = class177.method1255(var166, -33);
                            if (var168.field5465 == var164 && var168.field5467 == var165) {
                                if (var165 == 115) {
                                    field2467[var3++] = var168.method2444(67, var167);
                                } else {
                                    field2468[var2++] = var168.method2445((byte) 110, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var621 == 3409) {
                            var2 -= 3;
                            int var169 = field2468[var2];
                            int var170 = field2468[var2 + 1];
                            int var171 = field2468[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class394 var172 = class177.method1255(var170, -105);
                            if (var172.field5467 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field2468[var2++] = var172.method2448(false, var171) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3410) {
                            var2--;
                            int var173 = field2468[var2];
                            var3--;
                            String var174 = field2467[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class394 var175 = class177.method1255(var173, -112);
                            if (var175.field5467 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field2468[var2++] = var175.method2447(var174, 654) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3411) {
                            var2--;
                            int var176 = field2468[var2];
                            class394 var177 = class177.method1255(var176, -113);
                            field2468[var2++] = var177.field5464.method844((byte) 106);
                            continue;
                        }
                    } else if (var621 < 3700) {
                        if (var621 == 3600) {
                            if (class284.field3860 == 0) {
                                field2468[var2++] = -2;
                            } else if (class284.field3860 == 1) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = class353.field4751;
                            }
                            continue;
                        }
                        if (var621 == 3601) {
                            var2--;
                            int var178 = field2468[var2];
                            if (class284.field3860 == 2 && var178 < class353.field4751) {
                                field2467[var3++] = class196.field2851[var178];
                                if (class328.field4461[var178] == null) {
                                    field2467[var3++] = "";
                                } else {
                                    field2467[var3++] = class328.field4461[var178];
                                }
                                continue;
                            }
                            field2467[var3++] = "";
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3602) {
                            var2--;
                            int var179 = field2468[var2];
                            if (class284.field3860 == 2 && var179 < class353.field4751) {
                                field2468[var2++] = class323.field4388[var179];
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3603) {
                            var2--;
                            int var180 = field2468[var2];
                            if (class284.field3860 == 2 && var180 < class353.field4751) {
                                field2468[var2++] = class1.field8[var180];
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3604) {
                            var3--;
                            String var181 = field2467[var3];
                            var2--;
                            int var182 = field2468[var2];
                            class341.method2079(var181, -1, var182);
                            continue;
                        }
                        if (var621 == 3605) {
                            var3--;
                            String var183 = field2467[var3];
                            class419.method2587(-7147, var183);
                            continue;
                        }
                        if (var621 == 3606) {
                            var3--;
                            String var184 = field2467[var3];
                            class417.method2576(var184, 1);
                            continue;
                        }
                        if (var621 == 3607) {
                            var3--;
                            String var185 = field2467[var3];
                            class361.method2224(var185, false, (byte) -111);
                            continue;
                        }
                        if (var621 == 3608) {
                            var3--;
                            String var186 = field2467[var3];
                            class41.method358((byte) 99, var186);
                            continue;
                        }
                        if (var621 == 3609) {
                            var3--;
                            String var187 = field2467[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field2468[var2++] = class300.method1826((byte) -121, var187) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3610) {
                            var2--;
                            int var188 = field2468[var2];
                            if (class284.field3860 == 2 && var188 < class353.field4751) {
                                field2467[var3++] = class220.field3089[var188];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3611) {
                            if (class118.field1804 == null) {
                                field2467[var3++] = "";
                            } else {
                                field2467[var3++] = class298.method1819(false, class118.field1804);
                            }
                            continue;
                        }
                        if (var621 == 3612) {
                            if (class118.field1804 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = class395.field5492;
                            }
                            continue;
                        }
                        if (var621 == 3613) {
                            var2--;
                            int var189 = field2468[var2];
                            if (class118.field1804 != null && var189 < class395.field5492) {
                                field2467[var3++] = class67.field944[var189].field462;
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3614) {
                            var2--;
                            int var190 = field2468[var2];
                            if (class118.field1804 != null && var190 < class395.field5492) {
                                field2468[var2++] = class67.field944[var190].field458;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3615) {
                            var2--;
                            int var191 = field2468[var2];
                            if (class118.field1804 != null && var191 < class395.field5492) {
                                field2468[var2++] = class67.field944[var191].field463;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3616) {
                            field2468[var2++] = class255.field3560;
                            continue;
                        }
                        if (var621 == 3617) {
                            var3--;
                            String var192 = field2467[var3];
                            class314.method1903(253, var192);
                            continue;
                        }
                        if (var621 == 3618) {
                            field2468[var2++] = class88.field1247;
                            continue;
                        }
                        if (var621 == 3619) {
                            var3--;
                            String var193 = field2467[var3];
                            class442.method2744(var193, 2);
                            continue;
                        }
                        if (var621 == 3620) {
                            class395.method2453(239);
                            continue;
                        }
                        if (var621 == 3621) {
                            if (class284.field3860 == 0) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = class42.field541;
                            }
                            continue;
                        }
                        if (var621 == 3622) {
                            var2--;
                            int var194 = field2468[var2];
                            if (class284.field3860 != 0 && var194 < class42.field541) {
                                field2467[var3++] = class32.field443[var194];
                                if (class394.field5478[var194] == null) {
                                    field2467[var3++] = "";
                                } else {
                                    field2467[var3++] = class394.field5478[var194];
                                }
                                continue;
                            }
                            field2467[var3++] = "";
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3623) {
                            var3--;
                            String var195 = field2467[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field2468[var2++] = class85.method684((byte) 92, var195) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3624) {
                            var2--;
                            int var196 = field2468[var2];
                            if (class67.field944 != null && var196 < class395.field5492 && class67.field944[var196].field461.equalsIgnoreCase(class359.field4970.field5869)) {
                                field2468[var2++] = 1;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3625) {
                            if (class24.field308 == null) {
                                field2467[var3++] = "";
                            } else {
                                field2467[var3++] = class24.field308;
                            }
                            continue;
                        }
                        if (var621 == 3626) {
                            var2--;
                            int var197 = field2468[var2];
                            if (class118.field1804 != null && var197 < class395.field5492) {
                                field2467[var3++] = class67.field944[var197].field464;
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3627) {
                            var2--;
                            int var198 = field2468[var2];
                            if (class284.field3860 == 2 && var198 >= 0 && var198 < class353.field4751) {
                                field2468[var2++] = class408.field5681[var198] ? 1 : 0;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 3628) {
                            var3--;
                            String var199 = field2467[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field2468[var2++] = class174.method1236(true, var199);
                            continue;
                        }
                        if (var621 == 3629) {
                            field2468[var2++] = class294.field3959;
                            continue;
                        }
                        if (var621 == 3630) {
                            var3--;
                            String var200 = field2467[var3];
                            class361.method2224(var200, true, (byte) -126);
                            continue;
                        }
                        if (var621 == 3631) {
                            var2--;
                            int var201 = field2468[var2];
                            field2468[var2++] = class258.field3579[var201] ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3632) {
                            var2--;
                            int var202 = field2468[var2];
                            if (class118.field1804 != null && var202 < class395.field5492) {
                                field2467[var3++] = class67.field944[var202].field461;
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 3633) {
                            var2--;
                            int var203 = field2468[var2];
                            if (class284.field3860 != 0 && var203 < class42.field541) {
                                field2467[var3++] = class263.field3612[var203];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                    } else if (var621 < 4000) {
                        if (var621 == 3903) {
                            var2--;
                            int var204 = field2468[var2];
                            field2468[var2++] = class352.field4733[var204].method1506(8);
                            continue;
                        }
                        if (var621 == 3904) {
                            var2--;
                            int var205 = field2468[var2];
                            field2468[var2++] = class352.field4733[var205].field3240;
                            continue;
                        }
                        if (var621 == 3905) {
                            var2--;
                            int var206 = field2468[var2];
                            field2468[var2++] = class352.field4733[var206].field3229;
                            continue;
                        }
                        if (var621 == 3906) {
                            var2--;
                            int var207 = field2468[var2];
                            field2468[var2++] = class352.field4733[var207].field3232;
                            continue;
                        }
                        if (var621 == 3907) {
                            var2--;
                            int var208 = field2468[var2];
                            field2468[var2++] = class352.field4733[var208].field3235;
                            continue;
                        }
                        if (var621 == 3908) {
                            var2--;
                            int var209 = field2468[var2];
                            field2468[var2++] = class352.field4733[var209].field3243;
                            continue;
                        }
                        if (var621 == 3910) {
                            var2--;
                            int var210 = field2468[var2];
                            int var211 = class352.field4733[var210].method1503(126);
                            field2468[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3911) {
                            var2--;
                            int var212 = field2468[var2];
                            int var213 = class352.field4733[var212].method1503(125);
                            field2468[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3912) {
                            var2--;
                            int var214 = field2468[var2];
                            int var215 = class352.field4733[var214].method1503(119);
                            field2468[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 3913) {
                            var2--;
                            int var216 = field2468[var2];
                            int var217 = class352.field4733[var216].method1503(121);
                            field2468[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 4100) {
                        if (var621 == 4000) {
                            var2 -= 2;
                            int var218 = field2468[var2];
                            int var219 = field2468[var2 + 1];
                            field2468[var2++] = var218 + var219;
                            continue;
                        }
                        if (var621 == 4001) {
                            var2 -= 2;
                            int var220 = field2468[var2];
                            int var221 = field2468[var2 + 1];
                            field2468[var2++] = var220 - var221;
                            continue;
                        }
                        if (var621 == 4002) {
                            var2 -= 2;
                            int var222 = field2468[var2];
                            int var223 = field2468[var2 + 1];
                            field2468[var2++] = var222 * var223;
                            continue;
                        }
                        if (var621 == 4003) {
                            var2 -= 2;
                            int var224 = field2468[var2];
                            int var225 = field2468[var2 + 1];
                            field2468[var2++] = var224 / var225;
                            continue;
                        }
                        if (var621 == 4004) {
                            var2--;
                            int var226 = field2468[var2];
                            field2468[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var621 == 4005) {
                            var2--;
                            int var227 = field2468[var2];
                            field2468[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var621 == 4006) {
                            var2 -= 5;
                            int var228 = field2468[var2];
                            int var229 = field2468[var2 + 1];
                            int var230 = field2468[var2 + 2];
                            int var231 = field2468[var2 + 3];
                            int var232 = field2468[var2 + 4];
                            field2468[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var621 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field2468[var2];
                            long var235 = (long) field2468[var2 + 1];
                            field2468[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var621 == 4008) {
                            var2 -= 2;
                            int var237 = field2468[var2];
                            int var238 = field2468[var2 + 1];
                            field2468[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var621 == 4009) {
                            var2 -= 2;
                            int var239 = field2468[var2];
                            int var240 = field2468[var2 + 1];
                            field2468[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var621 == 4010) {
                            var2 -= 2;
                            int var241 = field2468[var2];
                            int var242 = field2468[var2 + 1];
                            field2468[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 4011) {
                            var2 -= 2;
                            int var243 = field2468[var2];
                            int var244 = field2468[var2 + 1];
                            field2468[var2++] = var243 % var244;
                            continue;
                        }
                        if (var621 == 4012) {
                            var2 -= 2;
                            int var245 = field2468[var2];
                            int var246 = field2468[var2 + 1];
                            if (var245 == 0) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var621 == 4013) {
                            var2 -= 2;
                            int var247 = field2468[var2];
                            int var248 = field2468[var2 + 1];
                            if (var247 == 0) {
                                field2468[var2++] = 0;
                            } else if (var248 == 0) {
                                field2468[var2++] = Integer.MAX_VALUE;
                            } else {
                                field2468[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var621 == 4014) {
                            var2 -= 2;
                            int var249 = field2468[var2];
                            int var250 = field2468[var2 + 1];
                            field2468[var2++] = var249 & var250;
                            continue;
                        }
                        if (var621 == 4015) {
                            var2 -= 2;
                            int var251 = field2468[var2];
                            int var252 = field2468[var2 + 1];
                            field2468[var2++] = var251 | var252;
                            continue;
                        }
                        if (var621 == 4016) {
                            var2 -= 2;
                            int var253 = field2468[var2];
                            int var254 = field2468[var2 + 1];
                            field2468[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var621 == 4017) {
                            var2 -= 2;
                            int var255 = field2468[var2];
                            int var256 = field2468[var2 + 1];
                            field2468[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var621 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field2468[var2];
                            long var259 = (long) field2468[var2 + 1];
                            long var261 = (long) field2468[var2 + 2];
                            field2468[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var621 < 4200) {
                        if (var621 == 4100) {
                            var3--;
                            String var263 = field2467[var3];
                            var2--;
                            int var264 = field2468[var2];
                            field2467[var3++] = var263 + var264;
                            continue;
                        }
                        if (var621 == 4101) {
                            var3 -= 2;
                            String var265 = field2467[var3];
                            String var266 = field2467[var3 + 1];
                            field2467[var3++] = var265 + var266;
                            continue;
                        }
                        if (var621 == 4102) {
                            var3--;
                            String var267 = field2467[var3];
                            var2--;
                            int var268 = field2468[var2];
                            field2467[var3++] = var267 + class119.method930(var268, true, 1458);
                            continue;
                        }
                        if (var621 == 4103) {
                            var3--;
                            String var269 = field2467[var3];
                            field2467[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var621 == 4104) {
                            var2--;
                            int var270 = field2468[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field2472.setTime(new Date(var271));
                            int var273 = field2472.get(5);
                            int var274 = field2472.get(2);
                            int var275 = field2472.get(1);
                            field2467[var3++] = var273 + "-" + field2475[var274] + "-" + var275;
                            continue;
                        }
                        if (var621 == 4105) {
                            var3 -= 2;
                            String var276 = field2467[var3];
                            String var277 = field2467[var3 + 1];
                            if (class359.field4970.field5874 != null && class359.field4970.field5874.field4585) {
                                field2467[var3++] = var277;
                                continue;
                            }
                            field2467[var3++] = var276;
                            continue;
                        }
                        if (var621 == 4106) {
                            var2--;
                            int var278 = field2468[var2];
                            field2467[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var621 == 4107) {
                            var3 -= 2;
                            field2468[var2++] = class177.method1256(field2467[var3], class445.field6241, field2467[var3 + 1], 36);
                            continue;
                        }
                        if (var621 == 4108) {
                            var3--;
                            String var279 = field2467[var3];
                            var2 -= 2;
                            int var280 = field2468[var2];
                            int var281 = field2468[var2 + 1];
                            class389 var282 = class1.method1(256, class170.field2406, 0, var281);
                            field2468[var2++] = var282.method2422(var280, class242.field3429, var279, 173);
                            continue;
                        }
                        if (var621 == 4109) {
                            var3--;
                            String var283 = field2467[var3];
                            var2 -= 2;
                            int var284 = field2468[var2];
                            int var285 = field2468[var2 + 1];
                            class389 var286 = class1.method1(256, class170.field2406, 0, var285);
                            field2468[var2++] = var286.method2421(var283, class242.field3429, (byte) 116, var284);
                            continue;
                        }
                        if (var621 == 4110) {
                            var3 -= 2;
                            String var287 = field2467[var3];
                            String var288 = field2467[var3 + 1];
                            var2--;
                            if (field2468[var2] == 1) {
                                field2467[var3++] = var287;
                            } else {
                                field2467[var3++] = var288;
                            }
                            continue;
                        }
                        if (var621 == 4111) {
                            var3--;
                            String var289 = field2467[var3];
                            field2467[var3++] = class160.method1157(var289, (byte) -117);
                            continue;
                        }
                        if (var621 == 4112) {
                            var3--;
                            String var290 = field2467[var3];
                            var2--;
                            int var291 = field2468[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field2467[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var621 == 4113) {
                            var2--;
                            int var292 = field2468[var2];
                            field2468[var2++] = class83.method665(-119, (char) var292) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4114) {
                            var2--;
                            int var293 = field2468[var2];
                            field2468[var2++] = class389.method2425((char) var293, 0) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4115) {
                            var2--;
                            int var294 = field2468[var2];
                            field2468[var2++] = class58.method457((char) var294, 97) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4116) {
                            var2--;
                            int var295 = field2468[var2];
                            field2468[var2++] = class418.method2579(false, (char) var295) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4117) {
                            var3--;
                            String var296 = field2467[var3];
                            if (var296 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var621 == 4118) {
                            var3--;
                            String var297 = field2467[var3];
                            var2 -= 2;
                            int var298 = field2468[var2];
                            int var299 = field2468[var2 + 1];
                            field2467[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var621 == 4119) {
                            var3--;
                            String var300 = field2467[var3];
                            StringBuffer var301 = new StringBuffer(var300.length());
                            boolean var302 = false;
                            for (int var303 = 0; var303 < var300.length(); var303++) {
                                char var304 = var300.charAt(var303);
                                if (var304 == '<') {
                                    var302 = true;
                                } else if (var304 == '>') {
                                    var302 = false;
                                } else if (!var302) {
                                    var301.append(var304);
                                }
                            }
                            field2467[var3++] = var301.toString();
                            continue;
                        }
                        if (var621 == 4120) {
                            var3--;
                            String var305 = field2467[var3];
                            var2 -= 2;
                            int var306 = field2468[var2];
                            int var307 = field2468[var2 + 1];
                            field2468[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var621 == 4121) {
                            var3 -= 2;
                            String var308 = field2467[var3];
                            String var309 = field2467[var3 + 1];
                            var2--;
                            int var310 = field2468[var2];
                            field2468[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var621 == 4122) {
                            var2--;
                            int var311 = field2468[var2];
                            field2468[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var621 == 4123) {
                            var2--;
                            int var312 = field2468[var2];
                            field2468[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var621 == 4124) {
                            var2--;
                            boolean var313 = field2468[var2] != 0;
                            var2--;
                            int var314 = field2468[var2];
                            field2467[var3++] = class372.method2328(var313, (long) var314, class445.field6241, 44, 0);
                            continue;
                        }
                        if (var621 == 4125) {
                            var3--;
                            String var315 = field2467[var3];
                            var2--;
                            int var316 = field2468[var2];
                            class389 var317 = class1.method1(256, class170.field2406, 0, var316);
                            field2468[var2++] = var317.method2420(class242.field3429, -1, var315);
                            continue;
                        }
                    } else if (var621 < 4300) {
                        if (var621 == 4200) {
                            var2--;
                            int var318 = field2468[var2];
                            field2467[var3++] = class367.method2308(false, var318).field191;
                            continue;
                        }
                        if (var621 == 4201) {
                            var2 -= 2;
                            int var319 = field2468[var2];
                            int var320 = field2468[var2 + 1];
                            class14 var321 = class367.method2308(false, var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field142[var320 - 1] != null) {
                                field2467[var3++] = var321.field142[var320 - 1];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 4202) {
                            var2 -= 2;
                            int var322 = field2468[var2];
                            int var323 = field2468[var2 + 1];
                            class14 var324 = class367.method2308(false, var322);
                            if (var323 >= 1 && var323 <= 5 && var324.field151[var323 - 1] != null) {
                                field2467[var3++] = var324.field151[var323 - 1];
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 4203) {
                            var2--;
                            int var325 = field2468[var2];
                            field2468[var2++] = class367.method2308(false, var325).field176;
                            continue;
                        }
                        if (var621 == 4204) {
                            var2--;
                            int var326 = field2468[var2];
                            field2468[var2++] = class367.method2308(false, var326).field153 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4205) {
                            var2--;
                            int var327 = field2468[var2];
                            class14 var328 = class367.method2308(false, var327);
                            if (var328.field197 == -1 && var328.field155 >= 0) {
                                field2468[var2++] = var328.field155;
                                continue;
                            }
                            field2468[var2++] = var327;
                            continue;
                        }
                        if (var621 == 4206) {
                            var2--;
                            int var329 = field2468[var2];
                            class14 var330 = class367.method2308(false, var329);
                            if (var330.field197 >= 0 && var330.field155 >= 0) {
                                field2468[var2++] = var330.field155;
                                continue;
                            }
                            field2468[var2++] = var329;
                            continue;
                        }
                        if (var621 == 4207) {
                            var2--;
                            int var331 = field2468[var2];
                            field2468[var2++] = class367.method2308(false, var331).field145 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 4208) {
                            var2 -= 2;
                            int var332 = field2468[var2];
                            int var333 = field2468[var2 + 1];
                            class200 var334 = class405.method2504(var333, (byte) -104);
                            if (var334.method1381(-116)) {
                                field2467[var3++] = class367.method2308(false, var332).method77((byte) 106, var334.field2877, var333);
                            } else {
                                field2468[var2++] = class367.method2308(false, var332).method73(var333, (byte) -38, var334.field2876);
                            }
                            continue;
                        }
                        if (var621 == 4209) {
                            var2 -= 2;
                            int var335 = field2468[var2];
                            int var336 = field2468[var2 + 1] - 1;
                            class14 var337 = class367.method2308(false, var335);
                            if (var337.field129 == var336) {
                                field2468[var2++] = var337.field164;
                            } else if (var337.field179 == var336) {
                                field2468[var2++] = var337.field146;
                            } else {
                                field2468[var2++] = -1;
                            }
                            continue;
                        }
                        if (var621 == 4210) {
                            var3--;
                            String var338 = field2467[var3];
                            var2--;
                            int var339 = field2468[var2];
                            class244.method1588(var339 == 1, var338, -121);
                            field2468[var2++] = class448.field6353;
                            continue;
                        }
                        if (var621 == 4211) {
                            if (class149.field2172 != null && class366.field5084 < class448.field6353) {
                                field2468[var2++] = class149.field2172[class366.field5084++] & 0xFFFF;
                                continue;
                            }
                            field2468[var2++] = -1;
                            continue;
                        }
                        if (var621 == 4212) {
                            class366.field5084 = 0;
                            continue;
                        }
                    } else if (var621 < 4400) {
                        if (var621 == 4300) {
                            var2 -= 2;
                            int var340 = field2468[var2];
                            int var341 = field2468[var2 + 1];
                            class200 var342 = class405.method2504(var341, (byte) -90);
                            if (var342.method1381(-116)) {
                                field2467[var3++] = class11.method57(-14758, var340).method1527(var342.field2877, var341, 0);
                            } else {
                                field2468[var2++] = class11.method57(-14758, var340).method1520(31133, var342.field2876, var341);
                            }
                            continue;
                        }
                    } else if (var621 < 4500) {
                        if (var621 == 4400) {
                            var2 -= 2;
                            int var343 = field2468[var2];
                            int var344 = field2468[var2 + 1];
                            class200 var345 = class405.method2504(var344, (byte) -77);
                            if (var345.method1381(-116)) {
                                field2467[var3++] = class133.method996((byte) -19, var343).method2765(true, var345.field2877, var344);
                            } else {
                                field2468[var2++] = class133.method996((byte) -19, var343).method2763(var344, var345.field2876, false);
                            }
                            continue;
                        }
                    } else if (var621 < 4600) {
                        if (var621 == 4500) {
                            var2 -= 2;
                            int var346 = field2468[var2];
                            int var347 = field2468[var2 + 1];
                            class200 var348 = class405.method2504(var347, (byte) -114);
                            if (var348.method1381(-116)) {
                                field2467[var3++] = class248.method1607((byte) -6, var346).method1902(var348.field2877, (byte) 5, var347);
                            } else {
                                field2468[var2++] = class248.method1607((byte) -6, var346).method1899((byte) 115, var347, var348.field2876);
                            }
                            continue;
                        }
                    } else if (var621 < 4700) {
                        if (var621 == 4600) {
                            var2--;
                            int var349 = field2468[var2];
                            class60 var350 = class323.method1972(74, var349);
                            if (var350.field810 != null && var350.field810.length > 0) {
                                int var351 = 0;
                                int var352 = var350.field812[0];
                                for (int var353 = 1; var353 < var350.field810.length; var353++) {
                                    if (var350.field812[var353] > var352) {
                                        var351 = var353;
                                        var352 = var350.field812[var353];
                                    }
                                }
                                field2468[var2++] = var350.field810[var351];
                                continue;
                            }
                            field2468[var2++] = var350.field793;
                            continue;
                        }
                    } else if (var621 < 5100) {
                        if (var621 == 5000) {
                            field2468[var2++] = class395.field5489;
                            continue;
                        }
                        if (var621 == 5001) {
                            var2 -= 3;
                            class395.field5489 = field2468[var2];
                            class422.field5848 = field2468[var2 + 1];
                            class391.field5440 = field2468[var2 + 2];
                            field2470++;
                            class88.field1232.method1151(248, (byte) 105);
                            class88.field1232.method2280(class395.field5489, 1537846408);
                            class88.field1232.method2280(class422.field5848, 1537846408);
                            class88.field1232.method2280(class391.field5440, 1537846408);
                            continue;
                        }
                        if (var621 == 5002) {
                            var3 -= 2;
                            String var354 = field2467[var3];
                            String var355 = field2467[var3 + 1];
                            var2 -= 2;
                            int var356 = field2468[var2];
                            int var357 = field2468[var2 + 1];
                            if (var355 == null) {
                                var355 = "";
                            }
                            if (var355.length() > 80) {
                                var355 = var355.substring(0, 80);
                            }
                            field2466++;
                            class88.field1232.method1151(53, (byte) -48);
                            class88.field1232.method2280(class82.method662(12189, var354) + class82.method662(12189, var355) + 2, 1537846408);
                            class88.field1232.method2285(var354, (byte) -97);
                            class88.field1232.method2280(var356 - 1, 1537846408);
                            class88.field1232.method2280(var357, 1537846408);
                            class88.field1232.method2285(var355, (byte) -97);
                            continue;
                        }
                        if (var621 == 5003) {
                            var2--;
                            int var358 = field2468[var2];
                            String var359 = null;
                            if (var358 < 100) {
                                var359 = class100.field1389[var358];
                            }
                            if (var359 == null) {
                                var359 = "";
                            }
                            field2467[var3++] = var359;
                            continue;
                        }
                        if (var621 == 5004) {
                            var2--;
                            int var360 = field2468[var2];
                            int var361 = -1;
                            if (var360 < 100 && class100.field1389[var360] != null) {
                                var361 = class259.field3589[var360];
                            }
                            field2468[var2++] = var361;
                            continue;
                        }
                        if (var621 == 5005) {
                            field2468[var2++] = class422.field5848;
                            continue;
                        }
                        if (var621 == 5008) {
                            var3--;
                            String var362 = field2467[var3];
                            if (class157.field2234 == 0 && (class119.field1806 && !class189.field2725 || class117.field1790)) {
                                continue;
                            }
                            String var363 = var362.toLowerCase();
                            byte var364 = 0;
                            if (var363.startsWith(class91.field1273.method2313((byte) -98, class445.field6241))) {
                                var364 = 0;
                                var362 = var362.substring(class91.field1273.method2313((byte) -113, class445.field6241).length());
                            } else if (var363.startsWith(class222.field3109.method2313((byte) -91, class445.field6241))) {
                                var364 = 1;
                                var362 = var362.substring(class222.field3109.method2313((byte) -121, class445.field6241).length());
                            } else if (var363.startsWith(class113.field1747.method2313((byte) -120, class445.field6241))) {
                                var364 = 2;
                                var362 = var362.substring(class113.field1747.method2313((byte) -77, class445.field6241).length());
                            } else if (var363.startsWith(class406.field5617.method2313((byte) -68, class445.field6241))) {
                                var364 = 3;
                                var362 = var362.substring(class406.field5617.method2313((byte) -92, class445.field6241).length());
                            } else if (var363.startsWith(class371.field5150.method2313((byte) -78, class445.field6241))) {
                                var364 = 4;
                                var362 = var362.substring(class371.field5150.method2313((byte) -110, class445.field6241).length());
                            } else if (var363.startsWith(class221.field3099.method2313((byte) -123, class445.field6241))) {
                                var364 = 5;
                                var362 = var362.substring(class221.field3099.method2313((byte) -109, class445.field6241).length());
                            } else if (var363.startsWith(class349.field4706.method2313((byte) -124, class445.field6241))) {
                                var364 = 6;
                                var362 = var362.substring(class349.field4706.method2313((byte) -91, class445.field6241).length());
                            } else if (var363.startsWith(class305.field4152.method2313((byte) -100, class445.field6241))) {
                                var364 = 7;
                                var362 = var362.substring(class305.field4152.method2313((byte) -69, class445.field6241).length());
                            } else if (var363.startsWith(class394.field5471.method2313((byte) -124, class445.field6241))) {
                                var364 = 8;
                                var362 = var362.substring(class394.field5471.method2313((byte) -68, class445.field6241).length());
                            } else if (var363.startsWith(class203.field2887.method2313((byte) -103, class445.field6241))) {
                                var364 = 9;
                                var362 = var362.substring(class203.field2887.method2313((byte) -80, class445.field6241).length());
                            } else if (var363.startsWith(class146.field2120.method2313((byte) -110, class445.field6241))) {
                                var364 = 10;
                                var362 = var362.substring(class146.field2120.method2313((byte) -74, class445.field6241).length());
                            } else if (var363.startsWith(class80.field1108.method2313((byte) -86, class445.field6241))) {
                                var364 = 11;
                                var362 = var362.substring(class80.field1108.method2313((byte) -90, class445.field6241).length());
                            } else if (class445.field6241 != 0) {
                                if (var363.startsWith(class169.field2386.method2313((byte) -117, class445.field6241))) {
                                    var364 = 0;
                                    var362 = var362.substring(class169.field2386.method2313((byte) -106, class445.field6241).length());
                                } else if (var363.startsWith(class284.field3859.method2313((byte) -108, class445.field6241))) {
                                    var364 = 1;
                                    var362 = var362.substring(class284.field3859.method2313((byte) -123, class445.field6241).length());
                                } else if (var363.startsWith(class416.field5765.method2313((byte) -116, class445.field6241))) {
                                    var364 = 2;
                                    var362 = var362.substring(class416.field5765.method2313((byte) -72, class445.field6241).length());
                                } else if (var363.startsWith(class81.field1125.method2313((byte) -111, class445.field6241))) {
                                    var364 = 3;
                                    var362 = var362.substring(class81.field1125.method2313((byte) -87, class445.field6241).length());
                                } else if (var363.startsWith(class255.field3557.method2313((byte) -117, class445.field6241))) {
                                    var364 = 4;
                                    var362 = var362.substring(class255.field3557.method2313((byte) -122, class445.field6241).length());
                                } else if (var363.startsWith(class351.field4722.method2313((byte) -122, class445.field6241))) {
                                    var364 = 5;
                                    var362 = var362.substring(class351.field4722.method2313((byte) -76, class445.field6241).length());
                                } else if (var363.startsWith(class354.field4760.method2313((byte) -87, class445.field6241))) {
                                    var364 = 6;
                                    var362 = var362.substring(class354.field4760.method2313((byte) -128, class445.field6241).length());
                                } else if (var363.startsWith(class183.field2571.method2313((byte) -123, class445.field6241))) {
                                    var364 = 7;
                                    var362 = var362.substring(class183.field2571.method2313((byte) -126, class445.field6241).length());
                                } else if (var363.startsWith(class53.field673.method2313((byte) -84, class445.field6241))) {
                                    var364 = 8;
                                    var362 = var362.substring(class53.field673.method2313((byte) -76, class445.field6241).length());
                                } else if (var363.startsWith(class439.field6193.method2313((byte) -86, class445.field6241))) {
                                    var364 = 9;
                                    var362 = var362.substring(class439.field6193.method2313((byte) -127, class445.field6241).length());
                                } else if (var363.startsWith(class359.field4953.method2313((byte) -108, class445.field6241))) {
                                    var364 = 10;
                                    var362 = var362.substring(class359.field4953.method2313((byte) -97, class445.field6241).length());
                                } else if (var363.startsWith(class10.field76.method2313((byte) -102, class445.field6241))) {
                                    var364 = 11;
                                    var362 = var362.substring(class10.field76.method2313((byte) -102, class445.field6241).length());
                                }
                            }
                            String var365 = var362.toLowerCase();
                            byte var366 = 0;
                            if (var365.startsWith(class67.field942.method2313((byte) -126, class445.field6241))) {
                                var366 = 1;
                                var362 = var362.substring(class67.field942.method2313((byte) -117, class445.field6241).length());
                            } else if (var365.startsWith(class300.field4103.method2313((byte) -103, class445.field6241))) {
                                var366 = 2;
                                var362 = var362.substring(class300.field4103.method2313((byte) -69, class445.field6241).length());
                            } else if (var365.startsWith(class323.field4387.method2313((byte) -116, class445.field6241))) {
                                var366 = 3;
                                var362 = var362.substring(class323.field4387.method2313((byte) -120, class445.field6241).length());
                            } else if (var365.startsWith(class441.field6196.method2313((byte) -99, class445.field6241))) {
                                var366 = 4;
                                var362 = var362.substring(class441.field6196.method2313((byte) -81, class445.field6241).length());
                            } else if (var365.startsWith(class49.field630.method2313((byte) -87, class445.field6241))) {
                                var366 = 5;
                                var362 = var362.substring(class49.field630.method2313((byte) -96, class445.field6241).length());
                            } else if (class445.field6241 != 0) {
                                if (var365.startsWith(class57.field740.method2313((byte) -118, class445.field6241))) {
                                    var366 = 1;
                                    var362 = var362.substring(class57.field740.method2313((byte) -110, class445.field6241).length());
                                } else if (var365.startsWith(class279.field3804.method2313((byte) -94, class445.field6241))) {
                                    var366 = 2;
                                    var362 = var362.substring(class279.field3804.method2313((byte) -78, class445.field6241).length());
                                } else if (var365.startsWith(class50.field637.method2313((byte) -70, class445.field6241))) {
                                    var366 = 3;
                                    var362 = var362.substring(class50.field637.method2313((byte) -85, class445.field6241).length());
                                } else if (var365.startsWith(class221.field3097.method2313((byte) -113, class445.field6241))) {
                                    var366 = 4;
                                    var362 = var362.substring(class221.field3097.method2313((byte) -93, class445.field6241).length());
                                } else if (var365.startsWith(class243.field3439.method2313((byte) -122, class445.field6241))) {
                                    var366 = 5;
                                    var362 = var362.substring(class243.field3439.method2313((byte) -84, class445.field6241).length());
                                }
                            }
                            field2473++;
                            class88.field1232.method1151(43, (byte) -47);
                            class88.field1232.method2280(0, 1537846408);
                            int var367 = class88.field1232.field5048;
                            class88.field1232.method2280(var364, 1537846408);
                            class88.field1232.method2280(var366, 1537846408);
                            class17.method95(class88.field1232, 1048575, var362);
                            class88.field1232.method2302(19765, class88.field1232.field5048 - var367);
                            continue;
                        }
                        if (var621 == 5009) {
                            var3 -= 2;
                            String var368 = field2467[var3];
                            String var369 = field2467[var3 + 1];
                            if (class157.field2234 != 0 || (!class119.field1806 || class189.field2725) && !class117.field1790) {
                                field2455++;
                                class88.field1232.method1151(169, (byte) 89);
                                class88.field1232.method2280(0, 1537846408);
                                int var370 = class88.field1232.field5048;
                                class88.field1232.method2285(var368, (byte) -97);
                                class17.method95(class88.field1232, 1048575, var369);
                                class88.field1232.method2302(19765, class88.field1232.field5048 - var370);
                            }
                            continue;
                        }
                        if (var621 == 5010) {
                            var2--;
                            int var371 = field2468[var2];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = class320.field4362[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field2467[var3++] = var372;
                            continue;
                        }
                        if (var621 == 5011) {
                            var2--;
                            int var373 = field2468[var2];
                            String var374 = null;
                            if (var373 < 100) {
                                var374 = class403.field5566[var373];
                            }
                            if (var374 == null) {
                                var374 = "";
                            }
                            field2467[var3++] = var374;
                            continue;
                        }
                        if (var621 == 5012) {
                            var2--;
                            int var375 = field2468[var2];
                            int var376 = -1;
                            if (var375 < 100) {
                                var376 = class68.field950[var375];
                            }
                            field2468[var2++] = var376;
                            continue;
                        }
                        if (var621 == 5015) {
                            String var377;
                            if (class359.field4970 == null || class359.field4970.field5883 == null) {
                                var377 = class129.field1952;
                            } else {
                                var377 = class359.field4970.method2612(true, (byte) 106);
                            }
                            field2467[var3++] = var377;
                            continue;
                        }
                        if (var621 == 5016) {
                            field2468[var2++] = class391.field5440;
                            continue;
                        }
                        if (var621 == 5017) {
                            field2468[var2++] = class5.field57;
                            continue;
                        }
                        if (var621 == 5018) {
                            var2--;
                            int var378 = field2468[var2];
                            int var379 = 0;
                            if (var378 < 100 && class100.field1389[var378] != null) {
                                var379 = class259.field3589[var378];
                            }
                            field2468[var2++] = var379;
                            continue;
                        }
                        if (var621 == 5019) {
                            var2--;
                            int var380 = field2468[var2];
                            String var381 = null;
                            if (var380 < 100) {
                                var381 = class430.field5989[var380];
                            }
                            if (var381 == null) {
                                var381 = "";
                            }
                            field2467[var3++] = var381;
                            continue;
                        }
                        if (var621 == 5020) {
                            String var382;
                            if (class359.field4970 == null || class359.field4970.field5883 == null) {
                                var382 = class129.field1952;
                            } else {
                                var382 = class359.field4970.method2611(false, 1713894148);
                            }
                            field2467[var3++] = var382;
                            continue;
                        }
                        if (var621 == 5050) {
                            var2--;
                            int var383 = field2468[var2];
                            field2467[var3++] = class397.method2463(var383, 0).field2718;
                            continue;
                        }
                        if (var621 == 5051) {
                            var2--;
                            int var384 = field2468[var2];
                            class189 var385 = class397.method2463(var384, 0);
                            if (var385.field2727 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var385.field2727.length;
                            }
                            continue;
                        }
                        if (var621 == 5052) {
                            var2 -= 2;
                            int var386 = field2468[var2];
                            int var387 = field2468[var2 + 1];
                            class189 var388 = class397.method2463(var386, 0);
                            int var389 = var388.field2727[var387];
                            field2468[var2++] = var389;
                            continue;
                        }
                        if (var621 == 5053) {
                            var2--;
                            int var390 = field2468[var2];
                            class189 var391 = class397.method2463(var390, 0);
                            if (var391.field2726 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var391.field2726.length;
                            }
                            continue;
                        }
                        if (var621 == 5054) {
                            var2 -= 2;
                            int var392 = field2468[var2];
                            int var393 = field2468[var2 + 1];
                            field2468[var2++] = class397.method2463(var392, 0).field2726[var393];
                            continue;
                        }
                        if (var621 == 5055) {
                            var2--;
                            int var394 = field2468[var2];
                            field2467[var3++] = class128.method967(var394, -1979350136).method820(0);
                            continue;
                        }
                        if (var621 == 5056) {
                            var2--;
                            int var395 = field2468[var2];
                            class107 var396 = class128.method967(var395, -1979350136);
                            if (var396.field1508 == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var396.field1508.length;
                            }
                            continue;
                        }
                        if (var621 == 5057) {
                            var2 -= 2;
                            int var397 = field2468[var2];
                            int var398 = field2468[var2 + 1];
                            field2468[var2++] = class128.method967(var397, -1979350136).field1508[var398];
                            continue;
                        }
                        if (var621 == 5058) {
                            field2465 = new class353();
                            var2--;
                            field2465.field4744 = field2468[var2];
                            field2465.field4748 = class128.method967(field2465.field4744, -1979350136);
                            field2465.field4749 = new int[field2465.field4748.method816(false)];
                            continue;
                        }
                        if (var621 == 5059) {
                            field2452++;
                            class88.field1232.method1151(35, (byte) 113);
                            class88.field1232.method2280(0, 1537846408);
                            int var399 = class88.field1232.field5048;
                            class88.field1232.method2280(0, 1537846408);
                            class88.field1232.method2275(127, field2465.field4744);
                            field2465.field4748.method809(field2465.field4749, -1, class88.field1232);
                            class88.field1232.method2302(19765, class88.field1232.field5048 - var399);
                            continue;
                        }
                        if (var621 == 5060) {
                            var3--;
                            String var400 = field2467[var3];
                            field2459++;
                            class88.field1232.method1151(205, (byte) 86);
                            class88.field1232.method2280(0, 1537846408);
                            int var401 = class88.field1232.field5048;
                            class88.field1232.method2285(var400, (byte) -97);
                            class88.field1232.method2275(-1, field2465.field4744);
                            field2465.field4748.method809(field2465.field4749, -1, class88.field1232);
                            class88.field1232.method2302(19765, class88.field1232.field5048 - var401);
                            continue;
                        }
                        if (var621 == 5061) {
                            field2452++;
                            class88.field1232.method1151(35, (byte) 112);
                            class88.field1232.method2280(0, 1537846408);
                            int var402 = class88.field1232.field5048;
                            class88.field1232.method2280(1, 1537846408);
                            class88.field1232.method2275(123, field2465.field4744);
                            field2465.field4748.method809(field2465.field4749, -1, class88.field1232);
                            class88.field1232.method2302(19765, class88.field1232.field5048 - var402);
                            continue;
                        }
                        if (var621 == 5062) {
                            var2 -= 2;
                            int var403 = field2468[var2];
                            int var404 = field2468[var2 + 1];
                            field2468[var2++] = class397.method2463(var403, 0).field2720[var404];
                            continue;
                        }
                        if (var621 == 5063) {
                            var2 -= 2;
                            int var405 = field2468[var2];
                            int var406 = field2468[var2 + 1];
                            field2468[var2++] = class397.method2463(var405, 0).field2728[var406];
                            continue;
                        }
                        if (var621 == 5064) {
                            var2 -= 2;
                            int var407 = field2468[var2];
                            int var408 = field2468[var2 + 1];
                            if (var408 == -1) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = class397.method2463(var407, 0).method1311((char) var408, (byte) 127);
                            }
                            continue;
                        }
                        if (var621 == 5065) {
                            var2 -= 2;
                            int var409 = field2468[var2];
                            int var410 = field2468[var2 + 1];
                            if (var410 == -1) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = class397.method2463(var409, 0).method1313((char) var410, (byte) -65);
                            }
                            continue;
                        }
                        if (var621 == 5066) {
                            var2--;
                            int var411 = field2468[var2];
                            field2468[var2++] = class128.method967(var411, -1979350136).method816(false);
                            continue;
                        }
                        if (var621 == 5067) {
                            var2 -= 2;
                            int var412 = field2468[var2];
                            int var413 = field2468[var2 + 1];
                            int var414 = class128.method967(var412, -1979350136).method817(var413, (byte) 103);
                            field2468[var2++] = var414;
                            continue;
                        }
                        if (var621 == 5068) {
                            var2 -= 2;
                            int var415 = field2468[var2];
                            int var416 = field2468[var2 + 1];
                            field2465.field4749[var415] = var416;
                            continue;
                        }
                        if (var621 == 5069) {
                            var2 -= 2;
                            int var417 = field2468[var2];
                            int var418 = field2468[var2 + 1];
                            field2465.field4749[var417] = var418;
                            continue;
                        }
                        if (var621 == 5070) {
                            var2 -= 3;
                            int var419 = field2468[var2];
                            int var420 = field2468[var2 + 1];
                            int var421 = field2468[var2 + 2];
                            class107 var422 = class128.method967(var419, -1979350136);
                            if (var422.method817(var420, (byte) 100) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field2468[var2++] = var422.method812(-1, var421, var420);
                            continue;
                        }
                        if (var621 == 5071) {
                            var3--;
                            String var423 = field2467[var3];
                            var2--;
                            boolean var424 = field2468[var2] == 1;
                            class334.method2036(-1, var423, var424);
                            field2468[var2++] = class448.field6353;
                            continue;
                        }
                        if (var621 == 5072) {
                            if (class149.field2172 != null && class366.field5084 < class448.field6353) {
                                field2468[var2++] = class149.field2172[class366.field5084++] & 0xFFFF;
                                continue;
                            }
                            field2468[var2++] = -1;
                            continue;
                        }
                        if (var621 == 5073) {
                            class366.field5084 = 0;
                            continue;
                        }
                    } else if (var621 < 5200) {
                        if (var621 == 5100) {
                            if (class146.field2122.method1474(-20986, 86)) {
                                field2468[var2++] = 1;
                            } else {
                                field2468[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5101) {
                            if (class146.field2122.method1474(-20986, 82)) {
                                field2468[var2++] = 1;
                            } else {
                                field2468[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5102) {
                            if (class146.field2122.method1474(-20986, 81)) {
                                field2468[var2++] = 1;
                            } else {
                                field2468[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var621 < 5300) {
                        if (var621 == 5200) {
                            var2--;
                            class210.method1411(-101, field2468[var2]);
                            continue;
                        }
                        if (var621 == 5201) {
                            field2468[var2++] = class304.method1842(29688);
                            continue;
                        }
                        if (var621 == 5205) {
                            var2--;
                            class24.method144(field2468[var2], -1, -1, (byte) -66, false);
                            continue;
                        }
                        if (var621 == 5206) {
                            var2--;
                            int var425 = field2468[var2];
                            class104 var426 = class333.method2026(var425 >> 14 & 0x3FFF, var425 & 0x3FFF);
                            if (var426 == null) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = var426.field1448;
                            }
                            continue;
                        }
                        if (var621 == 5207) {
                            var2--;
                            class104 var427 = class333.method2015(field2468[var2]);
                            if (var427 != null && var427.field1429 != null) {
                                field2467[var3++] = var427.field1429;
                                continue;
                            }
                            field2467[var3++] = "";
                            continue;
                        }
                        if (var621 == 5208) {
                            field2468[var2++] = class92.field1290;
                            field2468[var2++] = class278.field3788;
                            continue;
                        }
                        if (var621 == 5209) {
                            field2468[var2++] = class350.field4719 + class333.field4518;
                            field2468[var2++] = class333.field4514 + class274.field3747;
                            continue;
                        }
                        if (var621 == 5210) {
                            var2--;
                            int var428 = field2468[var2];
                            class104 var429 = class333.method2015(var428);
                            if (var429 == null) {
                                field2468[var2++] = 0;
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var429.field1434 >> 14 & 0x3FFF;
                                field2468[var2++] = var429.field1434 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var621 == 5211) {
                            var2--;
                            int var430 = field2468[var2];
                            class104 var431 = class333.method2015(var430);
                            if (var431 == null) {
                                field2468[var2++] = 0;
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var431.field1443 - var431.field1445;
                                field2468[var2++] = var431.field1444 - var431.field1428;
                            }
                            continue;
                        }
                        if (var621 == 5212) {
                            class157 var432 = class332.method2010(-22108);
                            if (var432 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = var432.field2229;
                                int var433 = var432.field2231 << 28 | class333.field4518 + var432.field2228 << 14 | class333.field4514 + var432.field2226;
                                field2468[var2++] = var433;
                            }
                            continue;
                        }
                        if (var621 == 5213) {
                            class157 var434 = class82.method661(2);
                            if (var434 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = var434.field2229;
                                int var435 = var434.field2231 << 28 | class333.field4518 + var434.field2228 << 14 | class333.field4514 + var434.field2226;
                                field2468[var2++] = var435;
                            }
                            continue;
                        }
                        if (var621 == 5214) {
                            var2--;
                            int var436 = field2468[var2];
                            class104 var437 = class260.method1674(-92);
                            if (var437 != null) {
                                boolean var438 = var437.method787(var436 >> 28 & 0x3, var436 >> 14 & 0x3FFF, var436 & 0x3FFF, field2474, (byte) 64);
                                if (var438) {
                                    class49.method405(field2474[1], field2474[2], -1286790035);
                                }
                            }
                            continue;
                        }
                        if (var621 == 5215) {
                            var2 -= 2;
                            int var439 = field2468[var2];
                            int var440 = field2468[var2 + 1];
                            class24 var441 = class333.method2014(var439 >> 14 & 0x3FFF, var439 & 0x3FFF);
                            boolean var442 = false;
                            for (class104 var443 = (class104) var441.method152(-38); var443 != null; var443 = (class104) var441.method148(5)) {
                                if (var443.field1448 == var440) {
                                    var442 = true;
                                    break;
                                }
                            }
                            if (var442) {
                                field2468[var2++] = 1;
                            } else {
                                field2468[var2++] = 0;
                            }
                            continue;
                        }
                        if (var621 == 5218) {
                            var2--;
                            int var444 = field2468[var2];
                            class104 var445 = class333.method2015(var444);
                            if (var445 == null) {
                                field2468[var2++] = -1;
                            } else {
                                field2468[var2++] = var445.field1437;
                            }
                            continue;
                        }
                        if (var621 == 5220) {
                            field2468[var2++] = class273.field3726 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5221) {
                            var2--;
                            int var446 = field2468[var2];
                            class49.method405(var446 >> 14 & 0x3FFF, var446 & 0x3FFF, -1286790035);
                            continue;
                        }
                        if (var621 == 5222) {
                            class104 var447 = class260.method1674(-84);
                            if (var447 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = -1;
                            } else {
                                boolean var448 = var447.method788(field2474, class350.field4719 + class333.field4518, true, class333.field4514 + class274.field3747);
                                if (var448) {
                                    field2468[var2++] = field2474[1];
                                    field2468[var2++] = field2474[2];
                                } else {
                                    field2468[var2++] = -1;
                                    field2468[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5223) {
                            var2 -= 2;
                            int var449 = field2468[var2];
                            int var450 = field2468[var2 + 1];
                            class24.method144(var449, var450 >> 14 & 0x3FFF, var450 & 0x3FFF, (byte) -16, false);
                            continue;
                        }
                        if (var621 == 5224) {
                            var2--;
                            int var451 = field2468[var2];
                            class104 var452 = class260.method1674(-86);
                            if (var452 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = -1;
                            } else {
                                boolean var453 = var452.method787(var451 >> 28 & 0x3, var451 >> 14 & 0x3FFF, var451 & 0x3FFF, field2474, (byte) 64);
                                if (var453) {
                                    field2468[var2++] = field2474[1];
                                    field2468[var2++] = field2474[2];
                                } else {
                                    field2468[var2++] = -1;
                                    field2468[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5225) {
                            var2--;
                            int var454 = field2468[var2];
                            class104 var455 = class260.method1674(-90);
                            if (var455 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = -1;
                            } else {
                                boolean var456 = var455.method788(field2474, var454 >> 14 & 0x3FFF, true, var454 & 0x3FFF);
                                if (var456) {
                                    field2468[var2++] = field2474[1];
                                    field2468[var2++] = field2474[2];
                                } else {
                                    field2468[var2++] = -1;
                                    field2468[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var621 == 5226) {
                            var2--;
                            class116.method894(field2468[var2], -123);
                            continue;
                        }
                        if (var621 == 5227) {
                            var2 -= 2;
                            int var457 = field2468[var2];
                            int var458 = field2468[var2 + 1];
                            class24.method144(var457, var458 >> 14 & 0x3FFF, var458 & 0x3FFF, (byte) -103, true);
                            continue;
                        }
                        if (var621 == 5228) {
                            var2--;
                            class220.field3084 = field2468[var2] == 1;
                            continue;
                        }
                        if (var621 == 5229) {
                            field2468[var2++] = class220.field3084 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5230) {
                            var2--;
                            int var459 = field2468[var2];
                            class366.method2283((byte) 89, var459);
                            continue;
                        }
                        if (var621 == 5231) {
                            var2 -= 2;
                            int var460 = field2468[var2];
                            boolean var461 = field2468[var2 + 1] == 1;
                            if (class204.field2903 == null) {
                                continue;
                            }
                            class311 var462 = class204.field2903.method837((byte) -72, (long) var460);
                            if (var462 != null && !var461) {
                                var462.method1884(false);
                                continue;
                            }
                            if (var462 == null && var461) {
                                class311 var463 = new class311();
                                class204.field2903.method835(4, var463, (long) var460);
                            }
                            continue;
                        }
                        if (var621 == 5232) {
                            var2--;
                            int var464 = field2468[var2];
                            if (class204.field2903 == null) {
                                field2468[var2++] = 0;
                            } else {
                                class311 var465 = class204.field2903.method837((byte) -72, (long) var464);
                                field2468[var2++] = var465 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5233) {
                            var2 -= 2;
                            int var466 = field2468[var2];
                            boolean var467 = field2468[var2 + 1] == 1;
                            if (class113.field1744 == null) {
                                continue;
                            }
                            class311 var468 = class113.field1744.method837((byte) -72, (long) var466);
                            if (var468 != null && !var467) {
                                var468.method1884(false);
                                continue;
                            }
                            if (var468 == null && var467) {
                                class311 var469 = new class311();
                                class113.field1744.method835(4, var469, (long) var466);
                            }
                            continue;
                        }
                        if (var621 == 5234) {
                            var2--;
                            int var470 = field2468[var2];
                            if (class113.field1744 == null) {
                                field2468[var2++] = 0;
                            } else {
                                class311 var471 = class113.field1744.method837((byte) -72, (long) var470);
                                field2468[var2++] = var471 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var621 == 5235) {
                            field2468[var2++] = class333.field4490 == null ? -1 : class333.field4490.field1448;
                            continue;
                        }
                    } else if (var621 < 5400) {
                        if (var621 == 5300) {
                            var2 -= 2;
                            int var472 = field2468[var2];
                            int var473 = field2468[var2 + 1];
                            class171.method1215(var473, false, var472, (byte) 127, 3);
                            field2468[var2++] = class261.field3604 == null ? 0 : 1;
                            continue;
                        }
                        if (var621 == 5301) {
                            if (class261.field3604 != null) {
                                class171.method1215(-1, false, -1, (byte) 127, class211.field2956);
                            }
                            continue;
                        }
                        if (var621 == 5302) {
                            class49[] var474 = class204.method1394(0);
                            field2468[var2++] = var474.length;
                            continue;
                        }
                        if (var621 == 5303) {
                            var2--;
                            int var475 = field2468[var2];
                            class49[] var476 = class204.method1394(0);
                            field2468[var2++] = var476[var475].field620;
                            field2468[var2++] = var476[var475].field626;
                            continue;
                        }
                        if (var621 == 5305) {
                            int var477 = class258.field3585;
                            int var478 = class361.field4985;
                            int var479 = -1;
                            class49[] var480 = class204.method1394(0);
                            for (int var481 = 0; var481 < var480.length; var481++) {
                                class49 var482 = var480[var481];
                                if (var482.field620 == var477 && var482.field626 == var478) {
                                    var479 = var481;
                                    break;
                                }
                            }
                            field2468[var2++] = var479;
                            continue;
                        }
                        if (var621 == 5306) {
                            field2468[var2++] = class111.method846(-12334);
                            continue;
                        }
                        if (var621 == 5307) {
                            var2--;
                            int var483 = field2468[var2];
                            if (var483 >= 1 && var483 <= 2) {
                                class171.method1215(-1, false, -1, (byte) 127, var483);
                            }
                            continue;
                        }
                        if (var621 == 5308) {
                            field2468[var2++] = class211.field2956;
                            continue;
                        }
                        if (var621 == 5309) {
                            var2--;
                            int var484 = field2468[var2];
                            if (var484 >= 1 && var484 <= 2) {
                                class211.field2956 = var484;
                                class120.method934(-101, class122.field1839);
                            }
                            continue;
                        }
                    } else if (var621 < 5500) {
                        if (var621 == 5400) {
                            var3 -= 2;
                            String var485 = field2467[var3];
                            String var486 = field2467[var3 + 1];
                            var2--;
                            int var487 = field2468[var2];
                            field2471++;
                            class88.field1232.method1151(155, (byte) -49);
                            class88.field1232.method2280(class82.method662(12189, var485) + class82.method662(12189, var486) + 1, 1537846408);
                            class88.field1232.method2285(var485, (byte) -97);
                            class88.field1232.method2285(var486, (byte) -97);
                            class88.field1232.method2280(var487, 1537846408);
                            continue;
                        }
                        if (var621 == 5401) {
                            var2 -= 2;
                            class112.field1731[field2468[var2]] = (short) class116.method870(field2468[var2 + 1], true);
                            class39.method349((byte) -50);
                            class393.method2438(0);
                            class346.method2099(120);
                            class20.method117((byte) 117);
                            class136.method1018((byte) 94);
                            continue;
                        }
                        if (var621 == 5405) {
                            var2 -= 2;
                            int var488 = field2468[var2];
                            int var489 = field2468[var2 + 1];
                            if (var488 >= 0 && var488 < 2) {
                                class398.field5515[var488] = new int[var489 << 1][4];
                            }
                            continue;
                        }
                        if (var621 == 5406) {
                            var2 -= 7;
                            int var490 = field2468[var2];
                            int var491 = field2468[var2 + 1] << 1;
                            int var492 = field2468[var2 + 2];
                            int var493 = field2468[var2 + 3];
                            int var494 = field2468[var2 + 4];
                            int var495 = field2468[var2 + 5];
                            int var496 = field2468[var2 + 6];
                            if (var490 >= 0 && var490 < 2 && class398.field5515[var490] != null && var491 >= 0 && var491 < class398.field5515[var490].length) {
                                class398.field5515[var490][var491] = new int[] { (var492 >> 14 & 0x3FFF) * 128, var493, (var492 & 0x3FFF) * 128, var496 };
                                class398.field5515[var490][var491 + 1] = new int[] { (var494 >> 14 & 0x3FFF) * 128, var495, (var494 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var621 == 5407) {
                            var2--;
                            int var497 = class398.field5515[field2468[var2]].length >> 1;
                            field2468[var2++] = var497;
                            continue;
                        }
                        if (var621 == 5411) {
                            if (class261.field3604 != null) {
                                class171.method1215(-1, false, -1, (byte) 127, class211.field2956);
                            }
                            if (class323.field4392 == null) {
                                String var498 = class393.field5454 == null ? class397.method2459(0) : class393.field5454;
                                class169.method1206(var498, class122.field1839, class22.field284 == 1, false, true);
                            } else {
                                class222.method1466(1);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var621 == 5419) {
                            String var499 = "";
                            if (class336.field4537 != null) {
                                if (class336.field4537.field3871 == null) {
                                    var499 = class356.method2137((byte) 80, class336.field4537.field3874);
                                } else {
                                    var499 = (String) class336.field4537.field3871;
                                }
                            }
                            field2467[var3++] = var499;
                            continue;
                        }
                        if (var621 == 5420) {
                            field2468[var2++] = class76.field1085 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5421) {
                            if (class261.field3604 != null) {
                                class171.method1215(-1, false, -1, (byte) 127, class211.field2956);
                            }
                            var3--;
                            String var500 = field2467[var3];
                            var2--;
                            boolean var501 = field2468[var2] == 1;
                            String var502 = class397.method2459(0) + var500;
                            class169.method1206(var502, class122.field1839, class22.field284 == 1, var501, true);
                            continue;
                        }
                        if (var621 == 5422) {
                            var3 -= 2;
                            String var503 = field2467[var3];
                            String var504 = field2467[var3 + 1];
                            var2--;
                            int var505 = field2468[var2];
                            if (var503.length() > 0) {
                                if (class271.field3710 == null) {
                                    class271.field3710 = new String[class204.field2900[class133.field1986]];
                                }
                                class271.field3710[var505] = var503;
                            }
                            if (var504.length() > 0) {
                                if (class221.field3105 == null) {
                                    class221.field3105 = new String[class204.field2900[class133.field1986]];
                                }
                                class221.field3105[var505] = var504;
                            }
                            continue;
                        }
                        if (var621 == 5423) {
                            var3--;
                            System.out.println(field2467[var3]);
                            continue;
                        }
                        if (var621 == 5424) {
                            var2 -= 11;
                            class301.field4107 = field2468[var2];
                            class107.field1520 = field2468[var2 + 1];
                            class277.field3779 = field2468[var2 + 2];
                            class341.field4612 = field2468[var2 + 3];
                            client.field3526 = field2468[var2 + 4];
                            class328.field4448 = field2468[var2 + 5];
                            class264.field3624 = field2468[var2 + 6];
                            class229.field3228 = field2468[var2 + 7];
                            class98.field1363 = field2468[var2 + 8];
                            class139.field2039 = field2468[var2 + 9];
                            class187.field2705 = field2468[var2 + 10];
                            class112.field1726.method1930((byte) -110, client.field3526);
                            class112.field1726.method1930((byte) -118, class328.field4448);
                            class112.field1726.method1930((byte) 68, class264.field3624);
                            class112.field1726.method1930((byte) -120, class229.field3228);
                            class112.field1726.method1930((byte) -124, class98.field1363);
                            class178.field2547 = null;
                            class399.field5527 = null;
                            class405.field5600 = null;
                            class268.field3670 = null;
                            class19.field264 = null;
                            class136.field2024 = null;
                            class346.field4684 = null;
                            class186.field2700 = null;
                            class53.field678 = true;
                            continue;
                        }
                        if (var621 == 5425) {
                            class229.method1494(false);
                            class53.field678 = false;
                            continue;
                        }
                        if (var621 == 5426) {
                            var2 -= 2;
                            class430.field6019 = field2468[var2];
                            class274.field3749 = field2468[var2 + 1];
                            continue;
                        }
                        if (var621 == 5427) {
                            var2 -= 2;
                            class380.field5245 = field2468[var2 + 1];
                            continue;
                        }
                        if (var621 == 5428) {
                            var2 -= 2;
                            int var506 = field2468[var2];
                            int var507 = field2468[var2 + 1];
                            field2468[var2++] = class92.method725(var507, 1009, var506) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 5429) {
                            var3--;
                            class60.method480(false, 0, field2467[var3]);
                            continue;
                        }
                    } else if (var621 < 5600) {
                        if (var621 == 5500) {
                            var2 -= 4;
                            int var508 = field2468[var2];
                            int var509 = field2468[var2 + 1];
                            int var510 = field2468[var2 + 2];
                            int var511 = field2468[var2 + 3];
                            class2.method6((var508 & 0x3FFF) - class371.field5148, var510, var509, (byte) 37, (var508 >> 14 & 0x3FFF) - class6.field65, var511, false);
                            continue;
                        }
                        if (var621 == 5501) {
                            var2 -= 4;
                            int var512 = field2468[var2];
                            int var513 = field2468[var2 + 1];
                            int var514 = field2468[var2 + 2];
                            int var515 = field2468[var2 + 3];
                            class22.method128(var513, -20240, var515, (var512 & 0x3FFF) - class371.field5148, var514, (var512 >> 14 & 0x3FFF) - class6.field65);
                            continue;
                        }
                        if (var621 == 5502) {
                            var2 -= 6;
                            int var516 = field2468[var2];
                            if (var516 >= 2) {
                                throw new RuntimeException();
                            }
                            class397.field5501 = var516;
                            int var517 = field2468[var2 + 1];
                            if (var517 + 1 >= class398.field5515[class397.field5501].length >> 1) {
                                throw new RuntimeException();
                            }
                            class30.field413 = var517;
                            class72.field1055 = 0;
                            class405.field5610 = field2468[var2 + 2];
                            class217.field3055 = field2468[var2 + 3];
                            int var518 = field2468[var2 + 4];
                            if (var518 >= 2) {
                                throw new RuntimeException();
                            }
                            class147.field2139 = var518;
                            int var519 = field2468[var2 + 5];
                            if (var519 + 1 >= class398.field5515[class147.field2139].length >> 1) {
                                throw new RuntimeException();
                            }
                            class98.field1353 = var519;
                            class26.field337 = 3;
                            continue;
                        }
                        if (var621 == 5503) {
                            class269.method1712(-117);
                            continue;
                        }
                        if (var621 == 5504) {
                            var2 -= 2;
                            class375.method2346(field2468[var2], -7862, 0, field2468[var2 + 1]);
                            continue;
                        }
                        if (var621 == 5505) {
                            field2468[var2++] = (int) class356.field4785 >> 3;
                            continue;
                        }
                        if (var621 == 5506) {
                            field2468[var2++] = (int) class332.field4483 >> 3;
                            continue;
                        }
                        if (var621 == 5507) {
                            class187.method1303((byte) 30);
                            continue;
                        }
                        if (var621 == 5508) {
                            class325.method1979(656384);
                            continue;
                        }
                        if (var621 == 5509) {
                            class191.method1327(-500);
                            continue;
                        }
                        if (var621 == 5510) {
                            class131.method979(-128);
                            continue;
                        }
                        if (var621 == 5511) {
                            var2--;
                            int var520 = field2468[var2];
                            int var521 = var520 >> 14 & 0x3FFF;
                            int var522 = var520 & 0x3FFF;
                            int var523 = var521 - class6.field65;
                            if (var523 < 0) {
                                var523 = 0;
                            } else if (var523 >= class11.field107) {
                                var523 = class11.field107;
                            }
                            int var524 = var522 - class371.field5148;
                            if (var524 < 0) {
                                var524 = 0;
                            } else if (var524 >= class264.field3620) {
                                var524 = class264.field3620;
                            }
                            class24.field309 = var523 * 128 + 64;
                            class81.field1126 = var524 * 128 + 64;
                            class26.field337 = 4;
                            continue;
                        }
                        if (var621 == 5512) {
                            class371.method2323((byte) 40);
                            continue;
                        }
                    } else if (var621 < 5700) {
                        if (var621 == 5600) {
                            var3 -= 2;
                            String var525 = field2467[var3];
                            String var526 = field2467[var3 + 1];
                            var2--;
                            int var527 = field2468[var2];
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0 && class112.field1727 == 0) {
                                class203.method1387(99999999, var526, var525, var527);
                            }
                            continue;
                        }
                        if (var621 == 5601) {
                            class373.method2337((byte) -106);
                            continue;
                        }
                        if (var621 == 5602) {
                            if (class446.field6258 == 0) {
                                class310.field4205 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5603) {
                            var2 -= 4;
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0 && class112.field1727 == 0) {
                                class326.method1992(-109, field2468[var2 + 3], field2468[var2], field2468[var2 + 2], field2468[var2 + 1]);
                            }
                            continue;
                        }
                        if (var621 == 5604) {
                            var3--;
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0 && class112.field1727 == 0) {
                                class403.method2491(class264.method1689(field2467[var3], (byte) 110), (byte) 116);
                            }
                            continue;
                        }
                        if (var621 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0 && class112.field1727 == 0) {
                                class55.method435(field2468[var2 + 2], field2468[var2 + 6] == 1, field2468[var2 + 1], field2468[var2 + 3], field2468[var2], field2468[var2 + 4] == 1, class264.method1689(field2467[var3], (byte) 110), field2467[var3 + 1], -9041, field2467[var3 + 2], field2468[var2 + 5] == 1);
                            }
                            continue;
                        }
                        if (var621 == 5606) {
                            if (class284.field3868 == 0) {
                                class436.field6158 = -2;
                            }
                            continue;
                        }
                        if (var621 == 5607) {
                            field2468[var2++] = class310.field4205;
                            continue;
                        }
                        if (var621 == 5608) {
                            field2468[var2++] = class140.field2040;
                            continue;
                        }
                        if (var621 == 5609) {
                            field2468[var2++] = class436.field6158;
                            continue;
                        }
                        if (var621 == 5610) {
                            for (int var528 = 0; var528 < 5; var528++) {
                                field2467[var3++] = class220.field3090.length > var528 ? class298.method1819(false, class220.field3090[var528]) : "";
                            }
                            class220.field3090 = null;
                            continue;
                        }
                        if (var621 == 5611) {
                            field2468[var2++] = class93.field1294;
                            continue;
                        }
                    } else if (var621 < 6100) {
                        if (var621 == 6001) {
                            var2--;
                            int var529 = field2468[var2];
                            if (var529 < 1) {
                                var529 = 1;
                            }
                            if (var529 > 4) {
                                var529 = 4;
                            }
                            class359.field4957 = var529;
                            class136.method1017(-1);
                            class120.method934(-118, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6002) {
                            var2--;
                            class75.method580(field2468[var2] == 1, 1);
                            class266.method1694((byte) 120);
                            class136.method1017(-1);
                            class236.method1544(0);
                            class120.method934(-120, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6003) {
                            var2--;
                            class230.field3237 = field2468[var2] == 1;
                            class236.method1544(0);
                            class120.method934(-126, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6005) {
                            var2--;
                            class441.field6201 = field2468[var2] == 1;
                            class136.method1017(-1);
                            class120.method934(-119, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6006) {
                            var2--;
                            class215.field3009 = field2468[var2] == 1;
                            class354.field4765.method207(!class215.field3009);
                            class120.method934(-120, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6007) {
                            var2--;
                            class316.field4264 = field2468[var2];
                            class120.method934(-102, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6008) {
                            var2--;
                            class341.field4607 = field2468[var2] == 1;
                            class120.method934(-103, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6009) {
                            var2--;
                            class107.field1521 = field2468[var2] == 1;
                            class136.method1017(-1);
                            class120.method934(-126, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6010) {
                            var2--;
                            class404.field5593 = field2468[var2] == 1;
                            class120.method934(-126, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6011) {
                            var2--;
                            int var530 = field2468[var2];
                            if (var530 < 0 || var530 > 2) {
                                var530 = 0;
                            }
                            class228.field3188 = var530;
                            class136.method1017(-1);
                            class120.method934(-119, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6012) {
                            var2--;
                            class428.field5958 = field2468[var2] == 1;
                            class39.method347((byte) 90);
                            class120.method934(-98, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6014) {
                            var2--;
                            class152.field2192 = field2468[var2] == 1;
                            class136.method1017(-1);
                            class120.method934(-119, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6015) {
                            var2--;
                            class160.field2272 = field2468[var2] == 1;
                            class136.method1017(-1);
                            class120.method934(-117, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6016) {
                            var2--;
                            int var531 = field2468[var2];
                            if (var531 < 0 || var531 > 2) {
                                var531 = 0;
                            }
                            class353.field4745 = var531;
                            class348.method2105(1);
                            class120.method934(-100, class122.field1839);
                            continue;
                        }
                        if (var621 == 6017) {
                            var2--;
                            class119.field1814 = field2468[var2] == 1;
                            class236.method1539(-121);
                            class120.method934(-111, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6018) {
                            var2--;
                            int var532 = field2468[var2];
                            if (var532 < 0) {
                                var532 = 0;
                            }
                            if (var532 > 127) {
                                var532 = 127;
                            }
                            class231.field3253 = var532;
                            class120.method934(-101, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6019) {
                            var2--;
                            int var533 = field2468[var2];
                            if (var533 < 0) {
                                var533 = 0;
                            }
                            if (var533 > 255) {
                                var533 = 255;
                            }
                            if (class1.field2 != var533) {
                                if (class1.field2 == 0 && class354.field4762 != -1) {
                                    class300.method1827(0, class354.field4762, false, class2.field14, var533, (byte) -74);
                                    class133.field1993 = false;
                                } else if (var533 == 0) {
                                    class266.method1697(64);
                                    class133.field1993 = false;
                                } else {
                                    class147.method1060((byte) 1, var533);
                                }
                                class1.field2 = var533;
                            }
                            class120.method934(-128, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6020) {
                            var2--;
                            int var534 = field2468[var2];
                            if (var534 < 0) {
                                var534 = 0;
                            }
                            if (var534 > 127) {
                                var534 = 127;
                            }
                            class336.field4540 = var534;
                            class120.method934(-127, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6021) {
                            var2--;
                            class397.field5497 = field2468[var2] == 1;
                            class236.method1544(0);
                            continue;
                        }
                        if (var621 == 6023) {
                            var2--;
                            int var535 = field2468[var2];
                            boolean var536 = false;
                            if (var535 < 0) {
                                var535 = 0;
                            }
                            if (var535 > 2) {
                                var535 = 2;
                            }
                            if (class409.field5703 < 96) {
                                var535 = 0;
                                var536 = true;
                            }
                            class432.method2668(102, var535);
                            class120.method934(-108, class122.field1839);
                            class404.field5589 = false;
                            field2468[var2++] = var536 ? 0 : 1;
                            continue;
                        }
                        if (var621 == 6024) {
                            var2--;
                            int var537 = field2468[var2];
                            if (var537 < 0 || var537 > 2) {
                                var537 = 0;
                            }
                            class98.field1360 = var537;
                            class120.method934(-101, class122.field1839);
                            continue;
                        }
                        if (var621 == 6025) {
                            var2--;
                            int var538 = field2468[var2];
                            if (var538 < 0 || var538 > class436.method2682(5, class409.field5703)) {
                                var538 = 0;
                            }
                            class294.field3962 = var538;
                            class120.method934(-121, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6027) {
                            var2--;
                            int var539 = field2468[var2];
                            if (var539 < 0 || var539 > 1) {
                                var539 = 0;
                            }
                            class350.method2116(5, var539 == 1);
                            continue;
                        }
                        if (var621 == 6028) {
                            var2--;
                            class314.field4262 = field2468[var2] != 0;
                            class120.method934(-106, class122.field1839);
                            continue;
                        }
                        if (var621 == 6029) {
                            var2--;
                            class316.field4264 = field2468[var2];
                            class120.method934(-99, class122.field1839);
                            continue;
                        }
                        if (var621 == 6030) {
                            var2--;
                            class319.field4357 = field2468[var2] != 0;
                            class120.method934(-107, class122.field1839);
                            class136.method1017(-1);
                            continue;
                        }
                        if (var621 == 6031) {
                            var2--;
                            int var540 = field2468[var2];
                            if (var540 < 0 || var540 > 3) {
                                var540 = 2;
                            }
                            class90.method715(126, var540);
                            continue;
                        }
                        if (var621 == 6032) {
                            var2--;
                            int var541 = field2468[var2];
                            if (var541 < 0 || var541 > 3) {
                                var541 = 2;
                            }
                            class344.field4647 = var541;
                            class120.method934(-121, class122.field1839);
                            class404.field5589 = false;
                            continue;
                        }
                        if (var621 == 6033) {
                            var2--;
                            int var542 = field2468[var2];
                            if (var542 < 0 || var542 > 4) {
                                var542 = 2;
                            }
                            class236.field3363 = var542;
                            class120.method934(-115, class122.field1839);
                            continue;
                        }
                    } else if (var621 < 6200) {
                        if (var621 == 6101) {
                            field2468[var2++] = class359.field4957;
                            continue;
                        }
                        if (var621 == 6102) {
                            field2468[var2++] = class397.method2461(-74) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6103) {
                            field2468[var2++] = class230.field3237 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6105) {
                            field2468[var2++] = class441.field6201 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6106) {
                            field2468[var2++] = class215.field3009 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6107) {
                            field2468[var2++] = class316.field4264;
                            continue;
                        }
                        if (var621 == 6108) {
                            field2468[var2++] = class341.field4607 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6109) {
                            field2468[var2++] = class107.field1521 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6110) {
                            field2468[var2++] = class404.field5593 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6111) {
                            field2468[var2++] = class228.field3188;
                            continue;
                        }
                        if (var621 == 6112) {
                            field2468[var2++] = class428.field5958 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6114) {
                            field2468[var2++] = class152.field2192 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6115) {
                            field2468[var2++] = class160.field2272 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6116) {
                            field2468[var2++] = class353.field4745;
                            continue;
                        }
                        if (var621 == 6117) {
                            field2468[var2++] = class119.field1814 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6118) {
                            field2468[var2++] = class231.field3253;
                            continue;
                        }
                        if (var621 == 6119) {
                            field2468[var2++] = class1.field2;
                            continue;
                        }
                        if (var621 == 6120) {
                            field2468[var2++] = class336.field4540;
                            continue;
                        }
                        if (var621 == 6121) {
                            field2468[var2++] = class354.field4765.method223() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6123) {
                            field2468[var2++] = class244.method1590(-28442);
                            continue;
                        }
                        if (var621 == 6124) {
                            field2468[var2++] = class98.field1360;
                            continue;
                        }
                        if (var621 == 6125) {
                            field2468[var2++] = class294.field3962;
                            continue;
                        }
                        if (var621 == 6126) {
                            field2468[var2++] = class354.field4765.method263() ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6127) {
                            field2468[var2++] = class415.field5752 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6128) {
                            field2468[var2++] = class314.field4262 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6129) {
                            field2468[var2++] = class316.field4264;
                            continue;
                        }
                        if (var621 == 6130) {
                            field2468[var2++] = class319.field4357 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6131) {
                            field2468[var2++] = class22.field284;
                            continue;
                        }
                        if (var621 == 6132) {
                            field2468[var2++] = class344.field4647;
                            continue;
                        }
                        if (var621 == 6133) {
                            field2468[var2++] = class76.field1085 == 1 || class76.field1085 == 4 ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6134) {
                            field2468[var2++] = class436.method2682(5, class409.field5703);
                            continue;
                        }
                        if (var621 == 6135) {
                            field2468[var2++] = class236.field3363;
                            continue;
                        }
                    } else if (var621 < 6300) {
                        if (var621 == 6200) {
                            var2 -= 2;
                            class245.field3459 = (short) field2468[var2];
                            if (class245.field3459 <= 0) {
                                class245.field3459 = 256;
                            }
                            class267.field3666 = (short) field2468[var2 + 1];
                            if (class267.field3666 <= 0) {
                                class267.field3666 = 205;
                            }
                            continue;
                        }
                        if (var621 == 6201) {
                            var2 -= 2;
                            class139.field2035 = (short) field2468[var2];
                            if (class139.field2035 <= 0) {
                                class139.field2035 = 256;
                            }
                            class80.field1115 = (short) field2468[var2 + 1];
                            if (class80.field1115 <= 0) {
                                class80.field1115 = 320;
                            }
                            continue;
                        }
                        if (var621 == 6202) {
                            var2 -= 4;
                            class18.field246 = (short) field2468[var2];
                            if (class18.field246 <= 0) {
                                class18.field246 = 1;
                            }
                            class300.field4104 = (short) field2468[var2 + 1];
                            if (class300.field4104 <= 0) {
                                class300.field4104 = 32767;
                            } else if (class300.field4104 < class18.field246) {
                                class300.field4104 = class18.field246;
                            }
                            class147.field2138 = (short) field2468[var2 + 2];
                            if (class147.field2138 <= 0) {
                                class147.field2138 = 1;
                            }
                            class431.field6048 = (short) field2468[var2 + 3];
                            if (class431.field6048 <= 0) {
                                class431.field6048 = 32767;
                            } else if (class431.field6048 < class147.field2138) {
                                class431.field6048 = class147.field2138;
                            }
                            continue;
                        }
                        if (var621 == 6203) {
                            class274.method1730(class244.field3451.field1577, 0, 512, class244.field3451.field1568, false, 0);
                            field2468[var2++] = class65.field885;
                            field2468[var2++] = class353.field4746;
                            continue;
                        }
                        if (var621 == 6204) {
                            field2468[var2++] = class139.field2035;
                            field2468[var2++] = class80.field1115;
                            continue;
                        }
                        if (var621 == 6205) {
                            field2468[var2++] = class245.field3459;
                            field2468[var2++] = class267.field3666;
                            continue;
                        }
                    } else if (var621 < 6400) {
                        if (var621 == 6300) {
                            field2468[var2++] = (int) (class199.method1372(30938) / 60000L);
                            continue;
                        }
                        if (var621 == 6301) {
                            field2468[var2++] = (int) (class199.method1372(30938) / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6302) {
                            var2 -= 3;
                            int var543 = field2468[var2];
                            int var544 = field2468[var2 + 1];
                            int var545 = field2468[var2 + 2];
                            field2472.clear();
                            field2472.set(11, 12);
                            field2472.set(var545, var544, var543);
                            field2468[var2++] = (int) (field2472.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var621 == 6303) {
                            field2472.clear();
                            field2472.setTime(new Date(class199.method1372(30938)));
                            field2468[var2++] = field2472.get(1);
                            continue;
                        }
                        if (var621 == 6304) {
                            var2--;
                            int var546 = field2468[var2];
                            boolean var547 = true;
                            if (var546 < 0) {
                                var547 = (var546 + 1) % 4 == 0;
                            } else if (var546 < 1582) {
                                var547 = var546 % 4 == 0;
                            } else if (var546 % 4 != 0) {
                                var547 = false;
                            } else if (var546 % 100 != 0) {
                                var547 = true;
                            } else if (var546 % 400 != 0) {
                                var547 = false;
                            }
                            field2468[var2++] = var547 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6500) {
                        if (var621 == 6405) {
                            field2468[var2++] = class17.method94(true) ? 1 : 0;
                            continue;
                        }
                        if (var621 == 6406) {
                            field2468[var2++] = class220.method1458(0) ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6600) {
                        if (var621 == 6500) {
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0) {
                                field2468[var2++] = class66.method535(0) == -1 ? 0 : 1;
                                continue;
                            }
                            field2468[var2++] = 1;
                            continue;
                        }
                        if (var621 == 6501) {
                            class277 var548 = class278.method1755(0);
                            if (var548 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = 0;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var548.field3769;
                                field2468[var2++] = var548.field1972;
                                field2467[var3++] = var548.field3781;
                                class75 var549 = var548.method1748(108);
                                field2468[var2++] = var549.field1067;
                                field2467[var3++] = var549.field1063;
                                field2468[var2++] = var548.field1973;
                                field2468[var2++] = var548.field3770;
                            }
                            continue;
                        }
                        if (var621 == 6502) {
                            class277 var550 = class50.method407(113);
                            if (var550 == null) {
                                field2468[var2++] = -1;
                                field2468[var2++] = 0;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var550.field3769;
                                field2468[var2++] = var550.field1972;
                                field2467[var3++] = var550.field3781;
                                class75 var551 = var550.method1748(123);
                                field2468[var2++] = var551.field1067;
                                field2467[var3++] = var551.field1063;
                                field2468[var2++] = var550.field1973;
                                field2468[var2++] = var550.field3770;
                            }
                            continue;
                        }
                        if (var621 == 6503) {
                            var2--;
                            int var552 = field2468[var2];
                            if (class98.field1383 == 10 && class393.field5452 == 0 && class446.field6258 == 0 && class284.field3868 == 0) {
                                field2468[var2++] = class228.method1491(63, var552) ? 1 : 0;
                                continue;
                            }
                            field2468[var2++] = 0;
                            continue;
                        }
                        if (var621 == 6504) {
                            var2--;
                            class50.field638 = field2468[var2];
                            class120.method934(-101, class122.field1839);
                            continue;
                        }
                        if (var621 == 6505) {
                            field2468[var2++] = class50.field638;
                            continue;
                        }
                        if (var621 == 6506) {
                            var2--;
                            int var553 = field2468[var2];
                            class277 var554 = class117.method921(-102, var553);
                            if (var554 == null) {
                                field2468[var2++] = -1;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2467[var3++] = "";
                                field2468[var2++] = 0;
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = var554.field1972;
                                field2467[var3++] = var554.field3781;
                                class75 var555 = var554.method1748(103);
                                field2468[var2++] = var555.field1067;
                                field2467[var3++] = var555.field1063;
                                field2468[var2++] = var554.field1973;
                                field2468[var2++] = var554.field3770;
                            }
                            continue;
                        }
                        if (var621 == 6507) {
                            var2 -= 4;
                            int var556 = field2468[var2];
                            boolean var557 = field2468[var2 + 1] == 1;
                            int var558 = field2468[var2 + 2];
                            boolean var559 = field2468[var2 + 3] == 1;
                            class237.method1549(var556, (byte) -125, var557, var558, var559);
                            continue;
                        }
                        if (var621 == 6508) {
                            class117.method915(128);
                            continue;
                        }
                        if (var621 == 6509) {
                            if (class98.field1383 == 10) {
                                var2--;
                                if (field2468[var2] == 1) {
                                    if (class394.field5477 == null) {
                                        class394.field5477 = new class31();
                                    }
                                } else if (class394.field5477 != null) {
                                    class394.field5477.method284((byte) 92);
                                    class394.field5477 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var621 < 6700) {
                        if (var621 == 6600) {
                            var2--;
                            class229.field3214 = field2468[var2] == 1;
                            class120.method934(-105, class122.field1839);
                            continue;
                        }
                        if (var621 == 6601) {
                            field2468[var2++] = class229.field3214 ? 1 : 0;
                            continue;
                        }
                    } else if (var621 < 6800 && class88.field1248 == 2) {
                        if (var621 == 6700) {
                            int var560 = class171.field2415.method844((byte) -112);
                            if (class350.field4712 != -1) {
                                var560++;
                            }
                            field2468[var2++] = var560;
                            continue;
                        }
                        if (var621 == 6701) {
                            var2--;
                            int var561 = field2468[var2];
                            if (class350.field4712 != -1) {
                                if (var561 == 0) {
                                    field2468[var2++] = class350.field4712;
                                    continue;
                                }
                                var561--;
                            }
                            class435 var562 = (class435) class171.field2415.method842((byte) -25);
                            while (var561-- > 0) {
                                var562 = (class435) class171.field2415.method836(-126);
                            }
                            field2468[var2++] = var562.field6146;
                            continue;
                        }
                        if (var621 == 6702) {
                            var2--;
                            int var563 = field2468[var2];
                            if (class103.field1425[var563] == null) {
                                field2467[var3++] = "";
                            } else {
                                String var564 = class103.field1425[var563][0].field1642;
                                if (var564 == null) {
                                    field2467[var3++] = "";
                                } else {
                                    field2467[var3++] = var564.substring(0, var564.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var621 == 6703) {
                            var2--;
                            int var565 = field2468[var2];
                            if (class103.field1425[var565] == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = class103.field1425[var565].length;
                            }
                            continue;
                        }
                        if (var621 == 6704) {
                            var2 -= 2;
                            int var566 = field2468[var2];
                            int var567 = field2468[var2 + 1];
                            if (class103.field1425[var566] == null) {
                                field2467[var3++] = "";
                            } else {
                                String var568 = class103.field1425[var566][var567].field1642;
                                if (var568 == null) {
                                    field2467[var3++] = "";
                                } else {
                                    field2467[var3++] = var568;
                                }
                            }
                            continue;
                        }
                        if (var621 == 6705) {
                            var2 -= 2;
                            int var569 = field2468[var2];
                            int var570 = field2468[var2 + 1];
                            if (class103.field1425[var569] == null) {
                                field2468[var2++] = 0;
                            } else {
                                field2468[var2++] = class103.field1425[var569][var570].field1586;
                            }
                            continue;
                        }
                        if (var621 == 6706) {
                            continue;
                        }
                        if (var621 == 6707) {
                            var2 -= 3;
                            int var571 = field2468[var2];
                            int var572 = field2468[var2 + 1];
                            int var573 = field2468[var2 + 2];
                            class233.method1519(var573, 1, var571 << 16 | var572, 1, "");
                            continue;
                        }
                        if (var621 == 6708) {
                            var2 -= 3;
                            int var574 = field2468[var2];
                            int var575 = field2468[var2 + 1];
                            int var576 = field2468[var2 + 2];
                            class233.method1519(var576, 2, var574 << 16 | var575, 1, "");
                            continue;
                        }
                        if (var621 == 6709) {
                            var2 -= 3;
                            int var577 = field2468[var2];
                            int var578 = field2468[var2 + 1];
                            int var579 = field2468[var2 + 2];
                            class233.method1519(var579, 3, var577 << 16 | var578, 1, "");
                            continue;
                        }
                        if (var621 == 6710) {
                            var2 -= 3;
                            int var580 = field2468[var2];
                            int var581 = field2468[var2 + 1];
                            int var582 = field2468[var2 + 2];
                            class233.method1519(var582, 4, var580 << 16 | var581, 1, "");
                            continue;
                        }
                        if (var621 == 6711) {
                            var2 -= 3;
                            int var583 = field2468[var2];
                            int var584 = field2468[var2 + 1];
                            int var585 = field2468[var2 + 2];
                            class233.method1519(var585, 5, var583 << 16 | var584, 1, "");
                            continue;
                        }
                        if (var621 == 6712) {
                            var2 -= 3;
                            int var586 = field2468[var2];
                            int var587 = field2468[var2 + 1];
                            int var588 = field2468[var2 + 2];
                            class233.method1519(var588, 6, var586 << 16 | var587, 1, "");
                            continue;
                        }
                        if (var621 == 6713) {
                            var2 -= 3;
                            int var589 = field2468[var2];
                            int var590 = field2468[var2 + 1];
                            int var591 = field2468[var2 + 2];
                            class233.method1519(var591, 7, var589 << 16 | var590, 1, "");
                            continue;
                        }
                        if (var621 == 6714) {
                            var2 -= 3;
                            int var592 = field2468[var2];
                            int var593 = field2468[var2 + 1];
                            int var594 = field2468[var2 + 2];
                            class233.method1519(var594, 8, var592 << 16 | var593, 1, "");
                            continue;
                        }
                        if (var621 == 6715) {
                            var2 -= 3;
                            int var595 = field2468[var2];
                            int var596 = field2468[var2 + 1];
                            int var597 = field2468[var2 + 2];
                            class233.method1519(var597, 9, var595 << 16 | var596, 1, "");
                            continue;
                        }
                        if (var621 == 6716) {
                            var2 -= 3;
                            int var598 = field2468[var2];
                            int var599 = field2468[var2 + 1];
                            int var600 = field2468[var2 + 2];
                            class233.method1519(var600, 10, var598 << 16 | var599, 1, "");
                            continue;
                        }
                        if (var621 == 6717) {
                            var2 -= 3;
                            int var601 = field2468[var2];
                            int var602 = field2468[var2 + 1];
                            int var603 = field2468[var2 + 2];
                            class108 var604 = class451.method2815(var601 << 16 | var602, var603, (byte) -53);
                            class429.method2645(4);
                            class310 var605 = client.method1634(var604);
                            class211.method1420(var601 << 16 | var602, var605.field4204, var603, (byte) 58, var604.field1669, var604.field1675, var605.method1875(2644133));
                            continue;
                        }
                    } else if (var621 < 6900) {
                        if (var621 == 6800) {
                            var2--;
                            int var606 = field2468[var2];
                            class430 var607 = class204.method1389(var606, -125);
                            if (var607.field6018 == null) {
                                field2467[var3++] = "";
                            } else {
                                field2467[var3++] = var607.field6018;
                            }
                            continue;
                        }
                        if (var621 == 6801) {
                            var2--;
                            int var608 = field2468[var2];
                            class430 var609 = class204.method1389(var608, -125);
                            field2468[var2++] = var609.field5990;
                            continue;
                        }
                        if (var621 == 6802) {
                            var2--;
                            int var610 = field2468[var2];
                            class430 var611 = class204.method1389(var610, 13);
                            field2468[var2++] = var611.field6030;
                            continue;
                        }
                        if (var621 == 6803) {
                            var2--;
                            int var612 = field2468[var2];
                            class430 var613 = class204.method1389(var612, -125);
                            field2468[var2++] = var613.field6021;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var620) {
            if (arg0.field4329 == null) {
                StringBuffer var618 = new StringBuffer(30);
                var618.append("CS2: ").append(arg0.field4226).append(" ");
                for (int var619 = field2469 - 1; var619 >= 0; var619--) {
                    var618.append("v: ").append(field2453[var619].field5557.field4226).append(" ");
                }
                var618.append("op: ").append(var7);
                class48.method399((byte) 86, var620, var618.toString());
            } else {
                client.method1640(113, "Clientscript error in: " + arg0.field4329);
                StringBuffer var615 = new StringBuffer(30);
                var615.append("Clientscript error in: ").append(arg0.field4329).append("\n");
                for (int var616 = field2469 - 1; var616 >= 0; var616--) {
                    var615.append("via: ").append(field2453[var616].field5557.field4329).append("\n");
                }
                var615.append("Op: ").append(var7).append("\n");
                String var617 = var620.getMessage();
                if (var617 != null && var617.length() > 0) {
                    var615.append("Message: ").append(var617).append("\n");
                }
                class48.method399((byte) 86, var620, var615.toString());
                class125.method953(var615.toString(), true);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lfr;)V", line = 6955)
    public static final void method1230(class101 arg0) {
        method1233(arg0, 200000);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()V", line = 6962)
    public static void method1231() {
        field2461 = null;
        field2456 = null;
        field2460 = null;
        field2462 = null;
        field2468 = null;
        field2467 = null;
        field2453 = null;
        field2454 = null;
        field2457 = null;
        field2465 = null;
        field2472 = null;
        field2475 = null;
        field2474 = null;
        field2477 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 6998)
    public static final void method1232(int arg0) {
        if (arg0 == -1 || !class387.method2400(arg0, 176)) {
            return;
        }
        class108[] var1 = class103.field1425[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class108 var3 = var1[var2];
            if (var3.field1581 != null) {
                class101 var4 = new class101();
                var4.field1403 = var3;
                var4.field1393 = var3.field1581;
                method1233(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lfr;I)V", line = 7037)
    private static final void method1233(class101 arg0, int arg1) {
        Object[] var2 = arg0.field1393;
        int var3 = (Integer) var2[0];
        class318 var4 = class90.method714(var3, (byte) 71);
        if (var4 == null) {
            return;
        }
        field2461 = new int[var4.field4332];
        int var5 = 0;
        field2456 = new String[var4.field4331];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field1408;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field1394;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field1403 == null ? -1 : arg0.field1403.field1631;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field1392;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field1403 == null ? -1 : arg0.field1403.field1647;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field1395 == null ? -1 : arg0.field1395.field1631;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field1395 == null ? -1 : arg0.field1395.field1647;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field1396;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field1402;
                }
                field2461[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field1399;
                }
                field2456[var6++] = var9;
            }
        }
        method1229(var4, arg1);
    }
}
