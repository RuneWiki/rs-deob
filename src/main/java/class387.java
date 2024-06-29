import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class387 {

    @OriginalMember(owner = "client!og", name = "o", descriptor = "[I")
    private static int[] field5669 = new int[1000];

    @OriginalMember(owner = "client!og", name = "r", descriptor = "[Lni;")
    private static class305[] field5672 = new class305[50];

    @OriginalMember(owner = "client!og", name = "s", descriptor = "[[I")
    private static int[][] field5673 = new int[5][5000];

    @OriginalMember(owner = "client!og", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field5674 = new String[1000];

    @OriginalMember(owner = "client!og", name = "v", descriptor = "[I")
    private static int[] field5676 = new int[5];

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    private static int field5677 = 0;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5671 = Calendar.getInstance();

    @OriginalMember(owner = "client!og", name = "x", descriptor = "[I")
    private static int[] field5678 = new int[3];

    @OriginalMember(owner = "client!og", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field5679 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Lfi;")
    public static class331 field5680 = new class331(4);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Ljf;")
    private static class119 field5665;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Ljf;")
    private static class119 field5668;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lll;")
    private static class204 field5658;

    @OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
    private static int[] field5675;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field5656;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lq;I)V", line = 10)
    private static final void method2470(class246 arg0, int arg1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        int[] var5 = arg0.field3344;
        int[] var6 = arg0.field3350;
        byte var7 = -1;
        field5677 = 0;
        try {
            int var8 = 0;
            label4411: while (true) {
                var8++;
                if (var8 > arg1) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var607 = var5[var4];
                if (var607 < 100) {
                    if (var607 == 0) {
                        field5669[var2++] = var6[var4];
                        continue;
                    }
                    if (var607 == 1) {
                        int var9 = var6[var4];
                        field5669[var2++] = class283.field3972[var9];
                        continue;
                    }
                    if (var607 == 2) {
                        int var10 = var6[var4];
                        var2--;
                        class225.method1455(var10, field5669[var2], (byte) -23);
                        continue;
                    }
                    if (var607 == 3) {
                        field5674[var3++] = arg0.field3345[var4];
                        continue;
                    }
                    if (var607 == 6) {
                        var4 += var6[var4];
                        continue;
                    }
                    if (var607 == 7) {
                        var2 -= 2;
                        if (field5669[var2 + 1] != field5669[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 8) {
                        var2 -= 2;
                        if (field5669[var2 + 1] == field5669[var2]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 9) {
                        var2 -= 2;
                        if (field5669[var2] < field5669[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 10) {
                        var2 -= 2;
                        if (field5669[var2] > field5669[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 21) {
                        if (field5677 == 0) {
                            return;
                        }
                        class305 var11 = field5672[--field5677];
                        arg0 = var11.field4359;
                        var5 = arg0.field3344;
                        var6 = arg0.field3350;
                        var4 = var11.field4355;
                        field5675 = var11.field4364;
                        field5656 = var11.field4361;
                        continue;
                    }
                    if (var607 == 25) {
                        int var12 = var6[var4];
                        field5669[var2++] = class16.method112(30673, var12);
                        continue;
                    }
                    if (var607 == 27) {
                        int var13 = var6[var4];
                        var2--;
                        class223.method1449(var13, field5669[var2], (byte) 85);
                        continue;
                    }
                    if (var607 == 31) {
                        var2 -= 2;
                        if (field5669[var2] <= field5669[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 32) {
                        var2 -= 2;
                        if (field5669[var2] >= field5669[var2 + 1]) {
                            var4 += var6[var4];
                        }
                        continue;
                    }
                    if (var607 == 33) {
                        field5669[var2++] = field5675[var6[var4]];
                        continue;
                    }
                    int var10001;
                    if (var607 == 34) {
                        var10001 = var6[var4];
                        var2--;
                        field5675[var10001] = field5669[var2];
                        continue;
                    }
                    if (var607 == 35) {
                        field5674[var3++] = field5656[var6[var4]];
                        continue;
                    }
                    if (var607 == 36) {
                        var10001 = var6[var4];
                        var3--;
                        field5656[var10001] = field5674[var3];
                        continue;
                    }
                    if (var607 == 37) {
                        int var14 = var6[var4];
                        var3 -= var14;
                        String var15 = class386.method2469(field5674, false, var3, var14);
                        field5674[var3++] = var15;
                        continue;
                    }
                    if (var607 == 38) {
                        var2--;
                        continue;
                    }
                    if (var607 == 39) {
                        var3--;
                        continue;
                    }
                    if (var607 == 40) {
                        int var16 = var6[var4];
                        class246 var17 = class55.method320(var16, (byte) 65);
                        if (var17 == null) {
                            throw new RuntimeException();
                        }
                        int[] var18 = new int[var17.field3336];
                        String[] var19 = new String[var17.field3340];
                        for (int var20 = 0; var20 < var17.field3346; var20++) {
                            var18[var20] = field5669[var2 + var20 - var17.field3346];
                        }
                        for (int var21 = 0; var21 < var17.field3351; var21++) {
                            var19[var21] = field5674[var3 + var21 - var17.field3351];
                        }
                        var2 -= var17.field3346;
                        var3 -= var17.field3351;
                        class305 var22 = new class305();
                        var22.field4359 = arg0;
                        var22.field4355 = var4;
                        var22.field4364 = field5675;
                        var22.field4361 = field5656;
                        if (field5677 >= field5672.length) {
                            throw new RuntimeException();
                        }
                        field5672[field5677++] = var22;
                        arg0 = var17;
                        var5 = var17.field3344;
                        var6 = var17.field3350;
                        var4 = -1;
                        field5675 = var18;
                        field5656 = var19;
                        continue;
                    }
                    if (var607 == 42) {
                        field5669[var2++] = class160.field2272[var6[var4]];
                        continue;
                    }
                    if (var607 == 43) {
                        int var23 = var6[var4];
                        var2--;
                        class160.field2272[var23] = field5669[var2];
                        class7.method66(true, var23);
                        class400.field5811 |= class148.field2087[var23];
                        continue;
                    }
                    if (var607 == 44) {
                        int var24 = var6[var4] >> 16;
                        int var25 = var6[var4] & 0xFFFF;
                        var2--;
                        int var26 = field5669[var2];
                        if (var26 >= 0 && var26 <= 5000) {
                            field5676[var24] = var26;
                            byte var27 = -1;
                            if (var25 == 105) {
                                var27 = 0;
                            }
                            int var28 = 0;
                            while (true) {
                                if (var28 >= var26) {
                                    continue label4411;
                                }
                                field5673[var24][var28] = var27;
                                var28++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 45) {
                        int var29 = var6[var4];
                        var2--;
                        int var30 = field5669[var2];
                        if (var30 >= 0 && var30 < field5676[var29]) {
                            field5669[var2++] = field5673[var29][var30];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 46) {
                        int var31 = var6[var4];
                        var2 -= 2;
                        int var32 = field5669[var2];
                        if (var32 >= 0 && var32 < field5676[var31]) {
                            field5673[var31][var32] = field5669[var2 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var607 == 47) {
                        String var33 = class226.field3082[var6[var4]];
                        if (var33 == null) {
                            var33 = "null";
                        }
                        field5674[var3++] = var33;
                        continue;
                    }
                    if (var607 == 48) {
                        int var34 = var6[var4];
                        var3--;
                        class226.field3082[var34] = field5674[var3];
                        class440.method2735(var34, -315582175);
                        continue;
                    }
                    if (var607 == 51) {
                        class189 var35 = arg0.field3341[var6[var4]];
                        var2--;
                        class193 var36 = (class193) var35.method1204((byte) -117, (long) field5669[var2]);
                        if (var36 != null) {
                            var4 += var36.field2631;
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
                if (var607 < 300) {
                    if (var607 == 100) {
                        var2 -= 3;
                        int var38 = field5669[var2];
                        int var39 = field5669[var2 + 1];
                        int var40 = field5669[var2 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class119 var41 = class179.method1170(var38, 818041328);
                        if (var41.field1460 == null) {
                            var41.field1460 = new class119[var40 + 1];
                        }
                        if (var41.field1460.length <= var40) {
                            class119[] var42 = new class119[var40 + 1];
                            for (int var43 = 0; var43 < var41.field1460.length; var43++) {
                                var42[var43] = var41.field1460[var43];
                            }
                            var41.field1460 = var42;
                        }
                        if (var40 > 0 && var41.field1460[var40 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var40 - 1));
                        }
                        class119 var44 = new class119();
                        var44.field1535 = var39;
                        var44.field1529 = var44.field1424 = var41.field1424;
                        var44.field1495 = var40;
                        var44.field1475 = true;
                        var41.field1460[var40] = var44;
                        if (var37) {
                            field5665 = var44;
                        } else {
                            field5668 = var44;
                        }
                        class101.method543((byte) -88, var41);
                        continue;
                    }
                    if (var607 == 101) {
                        class119 var45 = var37 ? field5665 : field5668;
                        if (var45.field1495 == -1) {
                            if (var37) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class119 var46 = class179.method1170(var45.field1424, 818041328);
                        var46.field1460[var45.field1495] = null;
                        class101.method543((byte) -60, var46);
                        continue;
                    }
                    if (var607 == 102) {
                        var2--;
                        class119 var47 = class179.method1170(field5669[var2], 818041328);
                        var47.field1460 = null;
                        class101.method543((byte) -110, var47);
                        continue;
                    }
                    if (var607 == 200) {
                        var2 -= 2;
                        int var48 = field5669[var2];
                        int var49 = field5669[var2 + 1];
                        class119 var50 = class354.method2262(-128, var49, var48);
                        if (var50 != null && var49 != -1) {
                            field5669[var2++] = 1;
                            if (var37) {
                                field5665 = var50;
                            } else {
                                field5668 = var50;
                            }
                            continue;
                        }
                        field5669[var2++] = 0;
                        continue;
                    }
                    if (var607 == 201) {
                        var2--;
                        int var51 = field5669[var2];
                        class119 var52 = class179.method1170(var51, 818041328);
                        if (var52 == null) {
                            field5669[var2++] = 0;
                        } else {
                            field5669[var2++] = 1;
                            if (var37) {
                                field5665 = var52;
                            } else {
                                field5668 = var52;
                            }
                        }
                        continue;
                    }
                } else if (var607 < 500) {
                    if (var607 == 403) {
                        var2 -= 2;
                        int var53 = field5669[var2];
                        int var54 = field5669[var2 + 1];
                        for (int var55 = 0; var55 < class158.field2241.length; var55++) {
                            if (class158.field2241[var55] == var53) {
                                class390.field5715.field1843.method647(-80, var55, var54);
                                continue label4411;
                            }
                        }
                        int var56 = 0;
                        while (true) {
                            if (var56 >= class81.field906.length) {
                                continue label4411;
                            }
                            if (class81.field906[var56] == var53) {
                                class390.field5715.field1843.method647(-56, var56, var54);
                                continue label4411;
                            }
                            var56++;
                        }
                    }
                    if (var607 == 404) {
                        var2 -= 2;
                        int var57 = field5669[var2];
                        int var58 = field5669[var2 + 1];
                        class390.field5715.field1843.method642(var57, 512, var58);
                        continue;
                    }
                    if (var607 == 410) {
                        var2--;
                        boolean var59 = field5669[var2] != 0;
                        class390.field5715.field1843.method649(var59, (byte) -4);
                        continue;
                    }
                } else if (var607 >= 1000 && var607 < 1100 || var607 >= 2000 && var607 < 2100) {
                    class119 var60;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var60 = class179.method1170(field5669[var2], 818041328);
                    } else {
                        var60 = var37 ? field5665 : field5668;
                    }
                    if (var607 == 1000) {
                        var2 -= 4;
                        var60.field1414 = field5669[var2];
                        var60.field1499 = field5669[var2 + 1];
                        int var61 = field5669[var2 + 2];
                        if (var61 < 0) {
                            var61 = 0;
                        } else if (var61 > 5) {
                            var61 = 5;
                        }
                        int var62 = field5669[var2 + 3];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        var60.field1547 = (byte) var61;
                        var60.field1487 = (byte) var62;
                        class101.method543((byte) -67, var60);
                        class123.method699(13189, var60);
                        if (var60.field1495 == -1) {
                            class244.method1544((byte) -33, var60.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1001) {
                        var2 -= 4;
                        var60.field1461 = field5669[var2];
                        var60.field1458 = field5669[var2 + 1];
                        var60.field1532 = 0;
                        var60.field1456 = 0;
                        int var63 = field5669[var2 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 4) {
                            var63 = 4;
                        }
                        int var64 = field5669[var2 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        var60.field1482 = (byte) var63;
                        var60.field1497 = (byte) var64;
                        class101.method543((byte) 106, var60);
                        class123.method699(13189, var60);
                        if (var60.field1535 == 0) {
                            class433.method2686(false, var60, 0);
                        }
                        continue;
                    }
                    if (var607 == 1003) {
                        var2--;
                        boolean var65 = field5669[var2] == 1;
                        if (var60.field1503 != var65) {
                            var60.field1503 = var65;
                            class101.method543((byte) 10, var60);
                        }
                        if (var60.field1495 == -1) {
                            class52.method309((byte) 117, var60.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1004) {
                        var2 -= 2;
                        var60.field1455 = field5669[var2];
                        var60.field1453 = field5669[var2 + 1];
                        class101.method543((byte) 70, var60);
                        class123.method699(13189, var60);
                        if (var60.field1535 == 0) {
                            class433.method2686(false, var60, 0);
                        }
                        continue;
                    }
                    if (var607 == 1005) {
                        var2--;
                        var60.field1599 = field5669[var2] == 1;
                        continue;
                    }
                } else if (var607 >= 1100 && var607 < 1200 || var607 >= 2100 && var607 < 2200) {
                    class119 var66;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var66 = class179.method1170(field5669[var2], 818041328);
                    } else {
                        var66 = var37 ? field5665 : field5668;
                    }
                    if (var607 == 1100) {
                        var2 -= 2;
                        var66.field1501 = field5669[var2];
                        if (var66.field1501 > var66.field1578 - var66.field1552) {
                            var66.field1501 = var66.field1578 - var66.field1552;
                        }
                        if (var66.field1501 < 0) {
                            var66.field1501 = 0;
                        }
                        var66.field1467 = field5669[var2 + 1];
                        if (var66.field1467 > var66.field1593 - var66.field1498) {
                            var66.field1467 = var66.field1593 - var66.field1498;
                        }
                        if (var66.field1467 < 0) {
                            var66.field1467 = 0;
                        }
                        class101.method543((byte) -107, var66);
                        if (var66.field1495 == -1) {
                            class360.method2299(var66.field1424, 18858);
                        }
                        continue;
                    }
                    if (var607 == 1101) {
                        var2--;
                        var66.field1489 = field5669[var2];
                        class101.method543((byte) -73, var66);
                        if (var66.field1495 == -1) {
                            class279.method1762(40, var66.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1102) {
                        var2--;
                        var66.field1454 = field5669[var2] == 1;
                        class101.method543((byte) -79, var66);
                        continue;
                    }
                    if (var607 == 1103) {
                        var2--;
                        var66.field1564 = field5669[var2];
                        class101.method543((byte) -126, var66);
                        continue;
                    }
                    if (var607 == 1104) {
                        var2--;
                        var66.field1440 = field5669[var2];
                        class101.method543((byte) -98, var66);
                        continue;
                    }
                    if (var607 == 1105) {
                        var2--;
                        int var67 = field5669[var2];
                        if (var66.field1530 != var67) {
                            var66.field1530 = var67;
                            class101.method543((byte) -81, var66);
                        }
                        if (var66.field1495 == -1) {
                            class324.method2002((byte) 121, var66.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1106) {
                        var2--;
                        var66.field1435 = field5669[var2];
                        class101.method543((byte) -113, var66);
                        continue;
                    }
                    if (var607 == 1107) {
                        var2--;
                        var66.field1512 = field5669[var2] == 1;
                        class101.method543((byte) -103, var66);
                        continue;
                    }
                    if (var607 == 1108) {
                        var66.field1571 = 1;
                        var2--;
                        var66.field1520 = field5669[var2];
                        class101.method543((byte) -106, var66);
                        if (var66.field1495 == -1) {
                            class95.method508(var66.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1109) {
                        var2 -= 6;
                        var66.field1481 = field5669[var2];
                        var66.field1534 = field5669[var2 + 1];
                        var66.field1439 = field5669[var2 + 2];
                        var66.field1522 = field5669[var2 + 3];
                        var66.field1446 = field5669[var2 + 4];
                        var66.field1510 = field5669[var2 + 5];
                        class101.method543((byte) 64, var66);
                        if (var66.field1495 == -1) {
                            class10.method83((byte) -117, var66.field1424);
                            class1.method5(-12767, var66.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1110) {
                        var2--;
                        int var68 = field5669[var2];
                        if (var66.field1441 != var68) {
                            var66.field1441 = var68;
                            var66.field1561 = 0;
                            var66.field1470 = 1;
                            var66.field1447 = 0;
                            class101.method543((byte) -119, var66);
                        }
                        if (var66.field1495 == -1) {
                            class138.method827(var66.field1424, (byte) 112);
                        }
                        continue;
                    }
                    if (var607 == 1111) {
                        var2--;
                        var66.field1483 = field5669[var2] == 1;
                        class101.method543((byte) 118, var66);
                        continue;
                    }
                    if (var607 == 1112) {
                        var3--;
                        String var69 = field5674[var3];
                        if (!var69.equals(var66.field1536)) {
                            var66.field1536 = var69;
                            class101.method543((byte) -64, var66);
                        }
                        if (var66.field1495 == -1) {
                            class215.method1405((byte) -105, var66.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1113) {
                        var2--;
                        var66.field1493 = field5669[var2];
                        class101.method543((byte) -112, var66);
                        continue;
                    }
                    if (var607 == 1114) {
                        var2 -= 3;
                        var66.field1486 = field5669[var2];
                        var66.field1516 = field5669[var2 + 1];
                        var66.field1565 = field5669[var2 + 2];
                        class101.method543((byte) 79, var66);
                        continue;
                    }
                    if (var607 == 1115) {
                        var2--;
                        var66.field1472 = field5669[var2] == 1;
                        class101.method543((byte) -58, var66);
                        continue;
                    }
                    if (var607 == 1116) {
                        var2--;
                        var66.field1542 = field5669[var2];
                        class101.method543((byte) -112, var66);
                        continue;
                    }
                    if (var607 == 1117) {
                        var2--;
                        var66.field1557 = field5669[var2];
                        class101.method543((byte) -114, var66);
                        continue;
                    }
                    if (var607 == 1118) {
                        var2--;
                        var66.field1549 = field5669[var2] == 1;
                        class101.method543((byte) 40, var66);
                        continue;
                    }
                    if (var607 == 1119) {
                        var2--;
                        var66.field1427 = field5669[var2] == 1;
                        class101.method543((byte) 33, var66);
                        continue;
                    }
                    if (var607 == 1120) {
                        var2 -= 2;
                        var66.field1578 = field5669[var2];
                        var66.field1593 = field5669[var2 + 1];
                        class101.method543((byte) -60, var66);
                        if (var66.field1535 == 0) {
                            class433.method2686(false, var66, 0);
                        }
                        continue;
                    }
                    if (var607 == 1121) {
                        var2 -= 2;
                        var66.field1417 = (short) field5669[var2];
                        var66.field1471 = (short) field5669[var2 + 1];
                        class101.method543((byte) 75, var66);
                        continue;
                    }
                    if (var607 == 1122) {
                        var2--;
                        var66.field1500 = field5669[var2] == 1;
                        class101.method543((byte) 112, var66);
                        continue;
                    }
                    if (var607 == 1123) {
                        var2--;
                        var66.field1510 = field5669[var2];
                        class101.method543((byte) 36, var66);
                        if (var66.field1495 == -1) {
                            class10.method83((byte) -124, var66.field1424);
                        }
                        continue;
                    }
                    if (var607 == 1124) {
                        var2--;
                        int var70 = field5669[var2];
                        var66.field1524 = var70 == 1;
                        class101.method543((byte) -107, var66);
                        continue;
                    }
                    if (var607 == 1125) {
                        var2 -= 2;
                        var66.field1462 = field5669[var2];
                        var66.field1553 = field5669[var2 + 1];
                        class101.method543((byte) -103, var66);
                        continue;
                    }
                } else if (!(var607 < 1200 || var607 >= 1300) || !(var607 < 2200 || var607 >= 2300)) {
                    class119 var71;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var71 = class179.method1170(field5669[var2], 818041328);
                    } else {
                        var71 = var37 ? field5665 : field5668;
                    }
                    class101.method543((byte) -64, var71);
                    if (var607 == 1200 || var607 == 1205 || var607 == 1208 || var607 == 1209 || var607 == 1212 || var607 == 1213) {
                        var2 -= 2;
                        int var72 = field5669[var2];
                        int var73 = field5669[var2 + 1];
                        if (var71.field1495 == -1) {
                            class377.method2373((byte) -68, var71.field1424);
                            class10.method83((byte) -12, var71.field1424);
                            class1.method5(-12767, var71.field1424);
                        }
                        if (var72 == -1) {
                            var71.field1571 = 1;
                            var71.field1520 = -1;
                            var71.field1597 = -1;
                            continue;
                        }
                        var71.field1597 = var72;
                        var71.field1429 = var73;
                        if (var607 == 1208 || var607 == 1209) {
                            var71.field1581 = true;
                        } else {
                            var71.field1581 = false;
                        }
                        class260 var74 = class392.method2498(var72, -124);
                        var71.field1439 = var74.field3586;
                        var71.field1522 = var74.field3563;
                        var71.field1446 = var74.field3572;
                        var71.field1481 = var74.field3574;
                        var71.field1534 = var74.field3571;
                        var71.field1510 = var74.field3577;
                        if (var607 == 1205 || var607 == 1209) {
                            var71.field1452 = 0;
                        } else if (var607 == 1212 || var607 == 1213) {
                            var71.field1452 = 1;
                        } else {
                            var71.field1452 = 2;
                        }
                        if (var71.field1532 > 0) {
                            var71.field1510 = var71.field1510 * 32 / var71.field1532;
                        } else if (var71.field1461 > 0) {
                            var71.field1510 = var71.field1510 * 32 / var71.field1461;
                        }
                        continue;
                    }
                    if (var607 == 1201) {
                        var71.field1571 = 2;
                        var2--;
                        var71.field1520 = field5669[var2];
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1202) {
                        var71.field1571 = 3;
                        var71.field1520 = -1;
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1203) {
                        var71.field1571 = 6;
                        var2--;
                        var71.field1520 = field5669[var2];
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1204) {
                        var71.field1571 = 5;
                        var2--;
                        var71.field1520 = field5669[var2];
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1206) {
                        var2 -= 4;
                        var71.field1437 = field5669[var2];
                        var71.field1568 = field5669[var2 + 1];
                        var71.field1554 = field5669[var2 + 2];
                        var71.field1566 = field5669[var2 + 3];
                        class101.method543((byte) -65, var71);
                        continue;
                    }
                    if (var607 == 1207) {
                        var2 -= 2;
                        var71.field1506 = field5669[var2];
                        var71.field1544 = field5669[var2 + 1];
                        class101.method543((byte) 26, var71);
                        continue;
                    }
                    if (var607 == 1210) {
                        var2 -= 4;
                        var71.field1520 = field5669[var2];
                        var71.field1569 = field5669[var2 + 1];
                        if (field5669[var2 + 2] == 1) {
                            var71.field1571 = 9;
                        } else {
                            var71.field1571 = 8;
                        }
                        if (field5669[var2 + 3] == 1) {
                            var71.field1581 = true;
                        } else {
                            var71.field1581 = false;
                        }
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                    if (var607 == 1211) {
                        var71.field1571 = 5;
                        var71.field1520 = 2047;
                        var71.field1569 = 0;
                        if (var71.field1495 == -1) {
                            class95.method508(var71.field1424, 4);
                        }
                        continue;
                    }
                } else if ((var607 < 1300 || var607 >= 1400) && (var607 < 2300 || var607 >= 2400)) {
                    if (var607 >= 1400 && var607 < 1500 || var607 >= 2400 && var607 < 2500) {
                        class119 var81;
                        if (var607 >= 2000) {
                            var607 -= 1000;
                            var2--;
                            var81 = class179.method1170(field5669[var2], 818041328);
                        } else {
                            var81 = var37 ? field5665 : field5668;
                        }
                        var3--;
                        String var82 = field5674[var3];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var2--;
                            int var84 = field5669[var2];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var2--;
                                    var83[var84] = field5669[var2];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var3--;
                                var85[var86] = field5674[var3];
                            } else {
                                var2--;
                                var85[var86] = Integer.valueOf(field5669[var2]);
                            }
                        }
                        var2--;
                        int var87 = field5669[var2];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var607 == 1400) {
                            var81.field1507 = var85;
                        } else if (var607 == 1401) {
                            var81.field1508 = var85;
                        } else if (var607 == 1402) {
                            var81.field1523 = var85;
                        } else if (var607 == 1403) {
                            var81.field1474 = var85;
                        } else if (var607 == 1404) {
                            var81.field1572 = var85;
                        } else if (var607 == 1405) {
                            var81.field1548 = var85;
                        } else if (var607 == 1406) {
                            var81.field1450 = var85;
                        } else if (var607 == 1407) {
                            var81.field1591 = var85;
                            var81.field1583 = var83;
                        } else if (var607 == 1408) {
                            var81.field1491 = var85;
                        } else if (var607 == 1409) {
                            var81.field1526 = var85;
                        } else if (var607 == 1410) {
                            var81.field1484 = var85;
                        } else if (var607 == 1411) {
                            var81.field1468 = var85;
                        } else if (var607 == 1412) {
                            var81.field1559 = var85;
                        } else if (var607 == 1414) {
                            var81.field1575 = var85;
                            var81.field1587 = var83;
                        } else if (var607 == 1415) {
                            var81.field1588 = var85;
                            var81.field1430 = var83;
                        } else if (var607 == 1416) {
                            var81.field1416 = var85;
                        } else if (var607 == 1417) {
                            var81.field1533 = var85;
                        } else if (var607 == 1418) {
                            var81.field1517 = var85;
                        } else if (var607 == 1419) {
                            var81.field1543 = var85;
                        } else if (var607 == 1420) {
                            var81.field1574 = var85;
                        } else if (var607 == 1421) {
                            var81.field1477 = var85;
                        } else if (var607 == 1422) {
                            var81.field1570 = var85;
                        } else if (var607 == 1423) {
                            var81.field1438 = var85;
                        } else if (var607 == 1424) {
                            var81.field1422 = var85;
                        } else if (var607 == 1425) {
                            var81.field1502 = var85;
                        } else if (var607 == 1426) {
                            var81.field1451 = var85;
                        } else if (var607 == 1427) {
                            var81.field1413 = var85;
                        } else if (var607 == 1428) {
                            var81.field1550 = var85;
                            var81.field1518 = var83;
                        } else if (var607 == 1429) {
                            var81.field1426 = var85;
                            var81.field1601 = var83;
                        }
                        var81.field1505 = true;
                        continue;
                    }
                    if (var607 < 1600) {
                        class119 var88 = var37 ? field5665 : field5668;
                        if (var607 == 1500) {
                            field5669[var2++] = var88.field1448;
                            continue;
                        }
                        if (var607 == 1501) {
                            field5669[var2++] = var88.field1562;
                            continue;
                        }
                        if (var607 == 1502) {
                            field5669[var2++] = var88.field1552;
                            continue;
                        }
                        if (var607 == 1503) {
                            field5669[var2++] = var88.field1498;
                            continue;
                        }
                        if (var607 == 1504) {
                            field5669[var2++] = var88.field1503 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 1505) {
                            field5669[var2++] = var88.field1529;
                            continue;
                        }
                    } else if (var607 < 1700) {
                        class119 var89 = var37 ? field5665 : field5668;
                        if (var607 == 1600) {
                            field5669[var2++] = var89.field1501;
                            continue;
                        }
                        if (var607 == 1601) {
                            field5669[var2++] = var89.field1467;
                            continue;
                        }
                        if (var607 == 1602) {
                            field5674[var3++] = var89.field1536;
                            continue;
                        }
                        if (var607 == 1603) {
                            field5669[var2++] = var89.field1578;
                            continue;
                        }
                        if (var607 == 1604) {
                            field5669[var2++] = var89.field1593;
                            continue;
                        }
                        if (var607 == 1605) {
                            field5669[var2++] = var89.field1510;
                            continue;
                        }
                        if (var607 == 1606) {
                            field5669[var2++] = var89.field1439;
                            continue;
                        }
                        if (var607 == 1607) {
                            field5669[var2++] = var89.field1446;
                            continue;
                        }
                        if (var607 == 1608) {
                            field5669[var2++] = var89.field1522;
                            continue;
                        }
                        if (var607 == 1609) {
                            field5669[var2++] = var89.field1564;
                            continue;
                        }
                        if (var607 == 1610) {
                            field5669[var2++] = var89.field1481;
                            continue;
                        }
                        if (var607 == 1611) {
                            field5669[var2++] = var89.field1534;
                            continue;
                        }
                        if (var607 == 1612) {
                            field5669[var2++] = var89.field1530;
                            continue;
                        }
                    } else if (var607 < 1800) {
                        class119 var90 = var37 ? field5665 : field5668;
                        if (var607 == 1700) {
                            field5669[var2++] = var90.field1597;
                            continue;
                        }
                        if (var607 == 1701) {
                            if (var90.field1597 == -1) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var90.field1429;
                            }
                            continue;
                        }
                        if (var607 == 1702) {
                            field5669[var2++] = var90.field1495;
                            continue;
                        }
                    } else if (var607 < 1900) {
                        class119 var91 = var37 ? field5665 : field5668;
                        if (var607 == 1800) {
                            field5669[var2++] = client.method1076(var91).method27(-6936);
                            continue;
                        }
                        if (var607 == 1801) {
                            var2--;
                            int var92 = field5669[var2];
                            int var608 = var92 - 1;
                            if (var91.field1600 != null && var608 < var91.field1600.length && var91.field1600[var608] != null) {
                                field5674[var3++] = var91.field1600[var608];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 1802) {
                            if (var91.field1488 == null) {
                                field5674[var3++] = "";
                            } else {
                                field5674[var3++] = var91.field1488;
                            }
                            continue;
                        }
                    } else if (var607 < 2600) {
                        var2--;
                        class119 var93 = class179.method1170(field5669[var2], 818041328);
                        if (var607 == 2500) {
                            field5669[var2++] = var93.field1448;
                            continue;
                        }
                        if (var607 == 2501) {
                            field5669[var2++] = var93.field1562;
                            continue;
                        }
                        if (var607 == 2502) {
                            field5669[var2++] = var93.field1552;
                            continue;
                        }
                        if (var607 == 2503) {
                            field5669[var2++] = var93.field1498;
                            continue;
                        }
                        if (var607 == 2504) {
                            field5669[var2++] = var93.field1503 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 2505) {
                            field5669[var2++] = var93.field1529;
                            continue;
                        }
                    } else if (var607 < 2700) {
                        var2--;
                        class119 var94 = class179.method1170(field5669[var2], 818041328);
                        if (var607 == 2600) {
                            field5669[var2++] = var94.field1501;
                            continue;
                        }
                        if (var607 == 2601) {
                            field5669[var2++] = var94.field1467;
                            continue;
                        }
                        if (var607 == 2602) {
                            field5674[var3++] = var94.field1536;
                            continue;
                        }
                        if (var607 == 2603) {
                            field5669[var2++] = var94.field1578;
                            continue;
                        }
                        if (var607 == 2604) {
                            field5669[var2++] = var94.field1593;
                            continue;
                        }
                        if (var607 == 2605) {
                            field5669[var2++] = var94.field1510;
                            continue;
                        }
                        if (var607 == 2606) {
                            field5669[var2++] = var94.field1439;
                            continue;
                        }
                        if (var607 == 2607) {
                            field5669[var2++] = var94.field1446;
                            continue;
                        }
                        if (var607 == 2608) {
                            field5669[var2++] = var94.field1522;
                            continue;
                        }
                        if (var607 == 2609) {
                            field5669[var2++] = var94.field1564;
                            continue;
                        }
                        if (var607 == 2610) {
                            field5669[var2++] = var94.field1481;
                            continue;
                        }
                        if (var607 == 2611) {
                            field5669[var2++] = var94.field1534;
                            continue;
                        }
                        if (var607 == 2612) {
                            field5669[var2++] = var94.field1530;
                            continue;
                        }
                    } else if (var607 < 2800) {
                        if (var607 == 2700) {
                            var2--;
                            class119 var95 = class179.method1170(field5669[var2], 818041328);
                            field5669[var2++] = var95.field1597;
                            continue;
                        }
                        if (var607 == 2701) {
                            var2--;
                            class119 var96 = class179.method1170(field5669[var2], 818041328);
                            if (var96.field1597 == -1) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var96.field1429;
                            }
                            continue;
                        }
                        if (var607 == 2702) {
                            var2--;
                            int var97 = field5669[var2];
                            class201 var98 = (class201) class396.field5783.method1204((byte) -121, (long) var97);
                            if (var98 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = 1;
                            }
                            continue;
                        }
                        if (var607 == 2703) {
                            var2--;
                            class119 var99 = class179.method1170(field5669[var2], 818041328);
                            if (var99.field1460 == null) {
                                field5669[var2++] = 0;
                                continue;
                            }
                            int var100 = var99.field1460.length;
                            for (int var101 = 0; var101 < var99.field1460.length; var101++) {
                                if (var99.field1460[var101] == null) {
                                    var100 = var101;
                                    break;
                                }
                            }
                            field5669[var2++] = var100;
                            continue;
                        }
                        if (var607 == 2704 || var607 == 2705) {
                            var2 -= 2;
                            int var102 = field5669[var2];
                            int var103 = field5669[var2 + 1];
                            class201 var104 = (class201) class396.field5783.method1204((byte) -85, (long) var102);
                            if (var104 != null && var104.field2776 == var103) {
                                field5669[var2++] = 1;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                    } else if (var607 < 2900) {
                        var2--;
                        class119 var105 = class179.method1170(field5669[var2], 818041328);
                        if (var607 == 2800) {
                            field5669[var2++] = client.method1076(var105).method27(-6936);
                            continue;
                        }
                        if (var607 == 2801) {
                            var2--;
                            int var106 = field5669[var2];
                            int var609 = var106 - 1;
                            if (var105.field1600 != null && var609 < var105.field1600.length && var105.field1600[var609] != null) {
                                field5674[var3++] = var105.field1600[var609];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 2802) {
                            if (var105.field1488 == null) {
                                field5674[var3++] = "";
                            } else {
                                field5674[var3++] = var105.field1488;
                            }
                            continue;
                        }
                    } else if (var607 < 3200) {
                        if (var607 == 3100) {
                            var3--;
                            String var107 = field5674[var3];
                            class413.method2589(var107, 0);
                            continue;
                        }
                        if (var607 == 3101) {
                            var2 -= 2;
                            class295.method1871(field5669[var2], field5669[var2 + 1], class390.field5715, (byte) 94);
                            continue;
                        }
                        if (var607 == 3103) {
                            class233.method1482(true, 21571);
                            continue;
                        }
                        if (var607 == 3104) {
                            var3--;
                            String var108 = field5674[var3];
                            int var109 = 0;
                            if (class228.method1467(var108, -6)) {
                                var109 = class99.method531(var108, (byte) -16);
                            }
                            field5666++;
                            class169.field2360.method809(105, -28022);
                            class169.field2360.method1361((byte) -119, var109);
                            continue;
                        }
                        if (var607 == 3105) {
                            var3--;
                            String var110 = field5674[var3];
                            field5661++;
                            class169.field2360.method809(175, -28022);
                            class169.field2360.method1396(21375, var110.length() + 1);
                            class169.field2360.method1359((byte) 0, var110);
                            continue;
                        }
                        if (var607 == 3106) {
                            var3--;
                            String var111 = field5674[var3];
                            field5660++;
                            class169.field2360.method809(213, -28022);
                            class169.field2360.method1396(21375, var111.length() + 1);
                            class169.field2360.method1359((byte) 0, var111);
                            continue;
                        }
                        if (var607 == 3107) {
                            var2--;
                            int var112 = field5669[var2];
                            var3--;
                            String var113 = field5674[var3];
                            class3.method28(var112, (byte) -127, var113);
                            continue;
                        }
                        if (var607 == 3108) {
                            var2 -= 3;
                            int var114 = field5669[var2];
                            int var115 = field5669[var2 + 1];
                            int var116 = field5669[var2 + 2];
                            class119 var117 = class179.method1170(var116, 818041328);
                            class360.method2300(var115, var114, true, var117);
                            continue;
                        }
                        if (var607 == 3109) {
                            var2 -= 2;
                            int var118 = field5669[var2];
                            int var119 = field5669[var2 + 1];
                            class119 var120 = var37 ? field5665 : field5668;
                            class360.method2300(var119, var118, true, var120);
                            continue;
                        }
                        if (var607 == 3110) {
                            var2--;
                            int var121 = field5669[var2];
                            field5662++;
                            class169.field2360.method809(60, -28022);
                            class169.field2360.method1380(var121, (byte) -8);
                            continue;
                        }
                        if (var607 == 3111) {
                            var2 -= 2;
                            int var122 = field5669[var2];
                            int var123 = field5669[var2 + 1];
                            class201 var124 = (class201) class396.field5783.method1204((byte) -119, (long) var122);
                            if (var124 != null) {
                                class164.method1057(var124.field2776 != var123, var124, 0, true);
                            }
                            class150.method896(true, (byte) -86, 3, var122, var123);
                            continue;
                        }
                        if (var607 == 3112) {
                            var2--;
                            int var125 = field5669[var2];
                            class201 var126 = (class201) class396.field5783.method1204((byte) -113, (long) var125);
                            if (var126 != null && var126.field2771 == 3) {
                                class164.method1057(true, var126, 0, true);
                            }
                            continue;
                        }
                    } else if (var607 < 3300) {
                        if (var607 == 3200) {
                            var2 -= 3;
                            class7.method67((byte) 103, field5669[var2 + 2], 255, field5669[var2 + 1], field5669[var2]);
                            continue;
                        }
                        if (var607 == 3201) {
                            var2--;
                            class159.method1043(-1, field5669[var2], 255);
                            continue;
                        }
                        if (var607 == 3202) {
                            var2 -= 2;
                            class2.method12(field5669[var2], -20298, field5669[var2 + 1], 255);
                            continue;
                        }
                    } else if (var607 < 3400) {
                        if (var607 == 3300) {
                            field5669[var2++] = class221.field3033;
                            continue;
                        }
                        if (var607 == 3301) {
                            var2 -= 2;
                            int var127 = field5669[var2];
                            int var128 = field5669[var2 + 1];
                            field5669[var2++] = class180.method1175(var128, (byte) 63, var127);
                            continue;
                        }
                        if (var607 == 3302) {
                            var2 -= 2;
                            int var129 = field5669[var2];
                            int var130 = field5669[var2 + 1];
                            field5669[var2++] = client.method1077(var130, 36, var129);
                            continue;
                        }
                        if (var607 == 3303) {
                            var2 -= 2;
                            int var131 = field5669[var2];
                            int var132 = field5669[var2 + 1];
                            field5669[var2++] = class356.method2270((byte) -117, var131, var132);
                            continue;
                        }
                        if (var607 == 3304) {
                            var2--;
                            int var133 = field5669[var2];
                            field5669[var2++] = class430.method2679(-121, var133).field6483;
                            continue;
                        }
                        if (var607 == 3305) {
                            var2--;
                            int var134 = field5669[var2];
                            field5669[var2++] = class423.field6068[var134];
                            continue;
                        }
                        if (var607 == 3306) {
                            var2--;
                            int var135 = field5669[var2];
                            field5669[var2++] = class215.field2931[var135];
                            continue;
                        }
                        if (var607 == 3307) {
                            var2--;
                            int var136 = field5669[var2];
                            field5669[var2++] = class143.field2028[var136];
                            continue;
                        }
                        if (var607 == 3308) {
                            int var137 = class410.field5931;
                            int var138 = (class390.field5715.field1304 >> 7) + class40.field427;
                            int var139 = (class390.field5715.field1311 >> 7) + class217.field2975;
                            field5669[var2++] = (var137 << 28) + (var138 << 14) + var139;
                            continue;
                        }
                        if (var607 == 3309) {
                            var2--;
                            int var140 = field5669[var2];
                            field5669[var2++] = var140 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3310) {
                            var2--;
                            int var141 = field5669[var2];
                            field5669[var2++] = var141 >> 28;
                            continue;
                        }
                        if (var607 == 3311) {
                            var2--;
                            int var142 = field5669[var2];
                            field5669[var2++] = var142 & 0x3FFF;
                            continue;
                        }
                        if (var607 == 3312) {
                            field5669[var2++] = class166.field2325 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3313) {
                            var2 -= 2;
                            int var143 = field5669[var2] + 32768;
                            int var144 = field5669[var2 + 1];
                            field5669[var2++] = class180.method1175(var144, (byte) 63, var143);
                            continue;
                        }
                        if (var607 == 3314) {
                            var2 -= 2;
                            int var145 = field5669[var2] + 32768;
                            int var146 = field5669[var2 + 1];
                            field5669[var2++] = client.method1077(var146, -91, var145);
                            continue;
                        }
                        if (var607 == 3315) {
                            var2 -= 2;
                            int var147 = field5669[var2] + 32768;
                            int var148 = field5669[var2 + 1];
                            field5669[var2++] = class356.method2270((byte) -73, var147, var148);
                            continue;
                        }
                        if (var607 == 3316) {
                            if (class56.field642 >= 2) {
                                field5669[var2++] = class56.field642;
                            } else {
                                field5669[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 3317) {
                            field5669[var2++] = class99.field1117;
                            continue;
                        }
                        if (var607 == 3318) {
                            field5669[var2++] = class23.field229;
                            continue;
                        }
                        if (var607 == 3321) {
                            field5669[var2++] = class406.field5899;
                            continue;
                        }
                        if (var607 == 3322) {
                            field5669[var2++] = class267.field3743;
                            continue;
                        }
                        if (var607 == 3323) {
                            if (class144.field2032 >= 5 && class144.field2032 <= 9) {
                                field5669[var2++] = 1;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3324) {
                            if (class144.field2032 >= 5 && class144.field2032 <= 9) {
                                field5669[var2++] = class144.field2032;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3325) {
                            field5669[var2++] = class63.field727 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3326) {
                            field5669[var2++] = class390.field5715.field1827;
                            continue;
                        }
                        if (var607 == 3327) {
                            field5669[var2++] = class390.field5715.field1843.field1369 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3328) {
                            field5669[var2++] = class149.field2095 && !class303.field4330 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3329) {
                            field5669[var2++] = class24.field239 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3330) {
                            var2--;
                            int var149 = field5669[var2];
                            field5669[var2++] = class251.method1573(116, var149);
                            continue;
                        }
                        if (var607 == 3331) {
                            var2 -= 2;
                            int var150 = field5669[var2];
                            int var151 = field5669[var2 + 1];
                            field5669[var2++] = class8.method79(0, false, var151, var150);
                            continue;
                        }
                        if (var607 == 3332) {
                            var2 -= 2;
                            int var152 = field5669[var2];
                            int var153 = field5669[var2 + 1];
                            field5669[var2++] = class8.method79(0, true, var153, var152);
                            continue;
                        }
                        if (var607 == 3333) {
                            field5669[var2++] = class261.field3605;
                            continue;
                        }
                        if (var607 == 3335) {
                            field5669[var2++] = class297.field4234;
                            continue;
                        }
                        if (var607 == 3336) {
                            var2 -= 4;
                            int var154 = field5669[var2];
                            int var155 = field5669[var2 + 1];
                            int var156 = field5669[var2 + 2];
                            int var157 = field5669[var2 + 3];
                            int var158 = (var155 << 14) + var154;
                            int var159 = (var156 << 28) + var158;
                            int var160 = var157 + var159;
                            field5669[var2++] = var160;
                            continue;
                        }
                        if (var607 == 3337) {
                            field5669[var2++] = class404.field5884;
                            continue;
                        }
                        if (var607 == 3338) {
                            field5669[var2++] = class262.method1649((byte) -1);
                            continue;
                        }
                    } else if (var607 < 3500) {
                        if (var607 == 3400) {
                            var2 -= 2;
                            int var161 = field5669[var2];
                            int var162 = field5669[var2 + 1];
                            class450 var163 = class372.method2339(-1, var161);
                            field5674[var3++] = var163.method2800((byte) 43, var162);
                            continue;
                        }
                        if (var607 == 3408) {
                            var2 -= 4;
                            int var164 = field5669[var2];
                            int var165 = field5669[var2 + 1];
                            int var166 = field5669[var2 + 2];
                            int var167 = field5669[var2 + 3];
                            class450 var168 = class372.method2339(-1, var166);
                            if (var168.field6559 == var164 && var168.field6557 == var165) {
                                if (var165 == 115) {
                                    field5674[var3++] = var168.method2800((byte) 43, var167);
                                } else {
                                    field5669[var2++] = var168.method2797((byte) 41, var167);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var607 == 3409) {
                            var2 -= 3;
                            int var169 = field5669[var2];
                            int var170 = field5669[var2 + 1];
                            int var171 = field5669[var2 + 2];
                            if (var170 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class450 var172 = class372.method2339(-1, var170);
                            if (var172.field6557 != var169) {
                                throw new RuntimeException("C3409-1");
                            }
                            field5669[var2++] = var172.method2795((byte) -97, var171) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3410) {
                            var2--;
                            int var173 = field5669[var2];
                            var3--;
                            String var174 = field5674[var3];
                            if (var173 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class450 var175 = class372.method2339(-1, var173);
                            if (var175.field6557 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            field5669[var2++] = var175.method2804(var174, (byte) -83) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3411) {
                            var2--;
                            int var176 = field5669[var2];
                            class450 var177 = class372.method2339(-1, var176);
                            field5669[var2++] = var177.field6575.method1208(-113);
                            continue;
                        }
                    } else if (var607 < 3700) {
                        if (var607 == 3600) {
                            if (class308.field4403 == 0) {
                                field5669[var2++] = -2;
                            } else if (class308.field4403 == 1) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = class100.field1124;
                            }
                            continue;
                        }
                        if (var607 == 3601) {
                            var2--;
                            int var178 = field5669[var2];
                            if (class308.field4403 == 2 && var178 < class100.field1124) {
                                field5674[var3++] = class302.field4300[var178];
                                if (class96.field1076[var178] == null) {
                                    field5674[var3++] = "";
                                } else {
                                    field5674[var3++] = class96.field1076[var178];
                                }
                                continue;
                            }
                            field5674[var3++] = "";
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3602) {
                            var2--;
                            int var179 = field5669[var2];
                            if (class308.field4403 == 2 && var179 < class100.field1124) {
                                field5669[var2++] = class315.field4490[var179];
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3603) {
                            var2--;
                            int var180 = field5669[var2];
                            if (class308.field4403 == 2 && var180 < class100.field1124) {
                                field5669[var2++] = class3.field42[var180];
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3604) {
                            var3--;
                            String var181 = field5674[var3];
                            var2--;
                            int var182 = field5669[var2];
                            class227.method1462(var181, 2, var182);
                            continue;
                        }
                        if (var607 == 3605) {
                            var3--;
                            String var183 = field5674[var3];
                            class215.method1406(var183, (byte) -122);
                            continue;
                        }
                        if (var607 == 3606) {
                            var3--;
                            String var184 = field5674[var3];
                            class115.method629(var184, (byte) -125);
                            continue;
                        }
                        if (var607 == 3607) {
                            var3--;
                            String var185 = field5674[var3];
                            class450.method2805(var185, 11825, false);
                            continue;
                        }
                        if (var607 == 3608) {
                            var3--;
                            String var186 = field5674[var3];
                            class401.method2543(var186, 1);
                            continue;
                        }
                        if (var607 == 3609) {
                            var3--;
                            String var187 = field5674[var3];
                            if (var187.startsWith("<img=0>") || var187.startsWith("<img=1>")) {
                                var187 = var187.substring(7);
                            }
                            field5669[var2++] = class443.method2743(-1, var187) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3610) {
                            var2--;
                            int var188 = field5669[var2];
                            if (class308.field4403 == 2 && var188 < class100.field1124) {
                                field5674[var3++] = class111.field1283[var188];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3611) {
                            if (class354.field5164 == null) {
                                field5674[var3++] = "";
                            } else {
                                field5674[var3++] = class342.method2191(class354.field5164, 116);
                            }
                            continue;
                        }
                        if (var607 == 3612) {
                            if (class354.field5164 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = class54.field607;
                            }
                            continue;
                        }
                        if (var607 == 3613) {
                            var2--;
                            int var189 = field5669[var2];
                            if (class354.field5164 != null && var189 < class54.field607) {
                                field5674[var3++] = class166.field2323[var189].field5055;
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3614) {
                            var2--;
                            int var190 = field5669[var2];
                            if (class354.field5164 != null && var190 < class54.field607) {
                                field5669[var2++] = class166.field2323[var190].field5059;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3615) {
                            var2--;
                            int var191 = field5669[var2];
                            if (class354.field5164 != null && var191 < class54.field607) {
                                field5669[var2++] = class166.field2323[var191].field5056;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3616) {
                            field5669[var2++] = class407.field5906;
                            continue;
                        }
                        if (var607 == 3617) {
                            var3--;
                            String var192 = field5674[var3];
                            class98.method529(70, var192);
                            continue;
                        }
                        if (var607 == 3618) {
                            field5669[var2++] = class341.field5023;
                            continue;
                        }
                        if (var607 == 3619) {
                            var3--;
                            String var193 = field5674[var3];
                            class73.method426((byte) 77, var193);
                            continue;
                        }
                        if (var607 == 3620) {
                            class376.method2362((byte) -107);
                            continue;
                        }
                        if (var607 == 3621) {
                            if (class308.field4403 == 0) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = class166.field2326;
                            }
                            continue;
                        }
                        if (var607 == 3622) {
                            var2--;
                            int var194 = field5669[var2];
                            if (class308.field4403 != 0 && var194 < class166.field2326) {
                                field5674[var3++] = class100.field1129[var194];
                                if (class301.field4298[var194] == null) {
                                    field5674[var3++] = "";
                                } else {
                                    field5674[var3++] = class301.field4298[var194];
                                }
                                continue;
                            }
                            field5674[var3++] = "";
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3623) {
                            var3--;
                            String var195 = field5674[var3];
                            if (var195.startsWith("<img=0>") || var195.startsWith("<img=1>")) {
                                var195 = var195.substring(7);
                            }
                            field5669[var2++] = class117.method656(var195, false) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3624) {
                            var2--;
                            int var196 = field5669[var2];
                            if (class166.field2323 != null && var196 < class54.field607 && class166.field2323[var196].field5054.equalsIgnoreCase(class390.field5715.field1847)) {
                                field5669[var2++] = 1;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3625) {
                            if (class402.field5871 == null) {
                                field5674[var3++] = "";
                            } else {
                                field5674[var3++] = class402.field5871;
                            }
                            continue;
                        }
                        if (var607 == 3626) {
                            var2--;
                            int var197 = field5669[var2];
                            if (class354.field5164 != null && var197 < class54.field607) {
                                field5674[var3++] = class166.field2323[var197].field5058;
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3627) {
                            var2--;
                            int var198 = field5669[var2];
                            if (class308.field4403 == 2 && var198 >= 0 && var198 < class100.field1124) {
                                field5669[var2++] = class434.field6367[var198] ? 1 : 0;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 3628) {
                            var3--;
                            String var199 = field5674[var3];
                            if (var199.startsWith("<img=0>") || var199.startsWith("<img=1>")) {
                                var199 = var199.substring(7);
                            }
                            field5669[var2++] = class288.method1836(-7376, var199);
                            continue;
                        }
                        if (var607 == 3629) {
                            field5669[var2++] = class191.field2617;
                            continue;
                        }
                        if (var607 == 3630) {
                            var3--;
                            String var200 = field5674[var3];
                            class450.method2805(var200, 11825, true);
                            continue;
                        }
                        if (var607 == 3631) {
                            var2--;
                            int var201 = field5669[var2];
                            field5669[var2++] = class2.field21[var201] ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3632) {
                            var2--;
                            int var202 = field5669[var2];
                            if (class354.field5164 != null && var202 < class54.field607) {
                                field5674[var3++] = class166.field2323[var202].field5054;
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 3633) {
                            var2--;
                            int var203 = field5669[var2];
                            if (class308.field4403 != 0 && var203 < class166.field2326) {
                                field5674[var3++] = class19.field199[var203];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                    } else if (var607 < 4000) {
                        if (var607 == 3903) {
                            var2--;
                            int var204 = field5669[var2];
                            field5669[var2++] = class207.field2816[var204].method2199(21617);
                            continue;
                        }
                        if (var607 == 3904) {
                            var2--;
                            int var205 = field5669[var2];
                            field5669[var2++] = class207.field2816[var205].field5046;
                            continue;
                        }
                        if (var607 == 3905) {
                            var2--;
                            int var206 = field5669[var2];
                            field5669[var2++] = class207.field2816[var206].field5039;
                            continue;
                        }
                        if (var607 == 3906) {
                            var2--;
                            int var207 = field5669[var2];
                            field5669[var2++] = class207.field2816[var207].field5047;
                            continue;
                        }
                        if (var607 == 3907) {
                            var2--;
                            int var208 = field5669[var2];
                            field5669[var2++] = class207.field2816[var208].field5043;
                            continue;
                        }
                        if (var607 == 3908) {
                            var2--;
                            int var209 = field5669[var2];
                            field5669[var2++] = class207.field2816[var209].field5038;
                            continue;
                        }
                        if (var607 == 3910) {
                            var2--;
                            int var210 = field5669[var2];
                            int var211 = class207.field2816[var210].method2201(-558);
                            field5669[var2++] = var211 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3911) {
                            var2--;
                            int var212 = field5669[var2];
                            int var213 = class207.field2816[var212].method2201(-558);
                            field5669[var2++] = var213 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3912) {
                            var2--;
                            int var214 = field5669[var2];
                            int var215 = class207.field2816[var214].method2201(-558);
                            field5669[var2++] = var215 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 3913) {
                            var2--;
                            int var216 = field5669[var2];
                            int var217 = class207.field2816[var216].method2201(-558);
                            field5669[var2++] = var217 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 4100) {
                        if (var607 == 4000) {
                            var2 -= 2;
                            int var218 = field5669[var2];
                            int var219 = field5669[var2 + 1];
                            field5669[var2++] = var218 + var219;
                            continue;
                        }
                        if (var607 == 4001) {
                            var2 -= 2;
                            int var220 = field5669[var2];
                            int var221 = field5669[var2 + 1];
                            field5669[var2++] = var220 - var221;
                            continue;
                        }
                        if (var607 == 4002) {
                            var2 -= 2;
                            int var222 = field5669[var2];
                            int var223 = field5669[var2 + 1];
                            field5669[var2++] = var222 * var223;
                            continue;
                        }
                        if (var607 == 4003) {
                            var2 -= 2;
                            int var224 = field5669[var2];
                            int var225 = field5669[var2 + 1];
                            field5669[var2++] = var224 / var225;
                            continue;
                        }
                        if (var607 == 4004) {
                            var2--;
                            int var226 = field5669[var2];
                            field5669[var2++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var607 == 4005) {
                            var2--;
                            int var227 = field5669[var2];
                            field5669[var2++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var607 == 4006) {
                            var2 -= 5;
                            int var228 = field5669[var2];
                            int var229 = field5669[var2 + 1];
                            int var230 = field5669[var2 + 2];
                            int var231 = field5669[var2 + 3];
                            int var232 = field5669[var2 + 4];
                            field5669[var2++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var607 == 4007) {
                            var2 -= 2;
                            long var233 = (long) field5669[var2];
                            long var235 = (long) field5669[var2 + 1];
                            field5669[var2++] = (int) (var233 * var235 / 100L + var233);
                            continue;
                        }
                        if (var607 == 4008) {
                            var2 -= 2;
                            int var237 = field5669[var2];
                            int var238 = field5669[var2 + 1];
                            field5669[var2++] = var237 | 0x1 << var238;
                            continue;
                        }
                        if (var607 == 4009) {
                            var2 -= 2;
                            int var239 = field5669[var2];
                            int var240 = field5669[var2 + 1];
                            field5669[var2++] = var239 & -(0x1 << var240) - 1;
                            continue;
                        }
                        if (var607 == 4010) {
                            var2 -= 2;
                            int var241 = field5669[var2];
                            int var242 = field5669[var2 + 1];
                            field5669[var2++] = (var241 & 0x1 << var242) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 4011) {
                            var2 -= 2;
                            int var243 = field5669[var2];
                            int var244 = field5669[var2 + 1];
                            field5669[var2++] = var243 % var244;
                            continue;
                        }
                        if (var607 == 4012) {
                            var2 -= 2;
                            int var245 = field5669[var2];
                            int var246 = field5669[var2 + 1];
                            if (var245 == 0) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = (int) Math.pow((double) var245, (double) var246);
                            }
                            continue;
                        }
                        if (var607 == 4013) {
                            var2 -= 2;
                            int var247 = field5669[var2];
                            int var248 = field5669[var2 + 1];
                            if (var247 == 0) {
                                field5669[var2++] = 0;
                            } else if (var248 == 0) {
                                field5669[var2++] = Integer.MAX_VALUE;
                            } else {
                                field5669[var2++] = (int) Math.pow((double) var247, 1.0D / (double) var248);
                            }
                            continue;
                        }
                        if (var607 == 4014) {
                            var2 -= 2;
                            int var249 = field5669[var2];
                            int var250 = field5669[var2 + 1];
                            field5669[var2++] = var249 & var250;
                            continue;
                        }
                        if (var607 == 4015) {
                            var2 -= 2;
                            int var251 = field5669[var2];
                            int var252 = field5669[var2 + 1];
                            field5669[var2++] = var251 | var252;
                            continue;
                        }
                        if (var607 == 4016) {
                            var2 -= 2;
                            int var253 = field5669[var2];
                            int var254 = field5669[var2 + 1];
                            field5669[var2++] = var253 < var254 ? var253 : var254;
                            continue;
                        }
                        if (var607 == 4017) {
                            var2 -= 2;
                            int var255 = field5669[var2];
                            int var256 = field5669[var2 + 1];
                            field5669[var2++] = var255 > var256 ? var255 : var256;
                            continue;
                        }
                        if (var607 == 4018) {
                            var2 -= 3;
                            long var257 = (long) field5669[var2];
                            long var259 = (long) field5669[var2 + 1];
                            long var261 = (long) field5669[var2 + 2];
                            field5669[var2++] = (int) (var257 * var261 / var259);
                            continue;
                        }
                    } else if (var607 < 4200) {
                        if (var607 == 4100) {
                            var3--;
                            String var263 = field5674[var3];
                            var2--;
                            int var264 = field5669[var2];
                            field5674[var3++] = var263 + var264;
                            continue;
                        }
                        if (var607 == 4101) {
                            var3 -= 2;
                            String var265 = field5674[var3];
                            String var266 = field5674[var3 + 1];
                            field5674[var3++] = var265 + var266;
                            continue;
                        }
                        if (var607 == 4102) {
                            var3--;
                            String var267 = field5674[var3];
                            var2--;
                            int var268 = field5669[var2];
                            field5674[var3++] = var267 + client.method1062(var268, true, 70);
                            continue;
                        }
                        if (var607 == 4103) {
                            var3--;
                            String var269 = field5674[var3];
                            field5674[var3++] = var269.toLowerCase();
                            continue;
                        }
                        if (var607 == 4104) {
                            var2--;
                            int var270 = field5669[var2];
                            long var271 = ((long) var270 + 11745L) * 86400000L;
                            field5671.setTime(new Date(var271));
                            int var273 = field5671.get(5);
                            int var274 = field5671.get(2);
                            int var275 = field5671.get(1);
                            field5674[var3++] = var273 + "-" + field5679[var274] + "-" + var275;
                            continue;
                        }
                        if (var607 == 4105) {
                            var3 -= 2;
                            String var276 = field5674[var3];
                            String var277 = field5674[var3 + 1];
                            if (class390.field5715.field1843 != null && class390.field5715.field1843.field1369) {
                                field5674[var3++] = var277;
                                continue;
                            }
                            field5674[var3++] = var276;
                            continue;
                        }
                        if (var607 == 4106) {
                            var2--;
                            int var278 = field5669[var2];
                            field5674[var3++] = Integer.toString(var278);
                            continue;
                        }
                        if (var607 == 4107) {
                            var3 -= 2;
                            field5669[var2++] = class179.method1173(112, class297.field4234, field5674[var3], field5674[var3 + 1]);
                            continue;
                        }
                        if (var607 == 4108) {
                            var3--;
                            String var279 = field5674[var3];
                            var2 -= 2;
                            int var280 = field5669[var2];
                            int var281 = field5669[var2 + 1];
                            class277 var282 = class302.method1906(class323.field4546, 15163, 0, var281);
                            field5669[var2++] = var282.method1755(var279, class159.field2247, 4, var280);
                            continue;
                        }
                        if (var607 == 4109) {
                            var3--;
                            String var283 = field5674[var3];
                            var2 -= 2;
                            int var284 = field5669[var2];
                            int var285 = field5669[var2 + 1];
                            class277 var286 = class302.method1906(class323.field4546, 15163, 0, var285);
                            field5669[var2++] = var286.method1745(var283, -46, class159.field2247, var284);
                            continue;
                        }
                        if (var607 == 4110) {
                            var3 -= 2;
                            String var287 = field5674[var3];
                            String var288 = field5674[var3 + 1];
                            var2--;
                            if (field5669[var2] == 1) {
                                field5674[var3++] = var287;
                            } else {
                                field5674[var3++] = var288;
                            }
                            continue;
                        }
                        if (var607 == 4111) {
                            var3--;
                            String var289 = field5674[var3];
                            field5674[var3++] = class268.method1704(false, var289);
                            continue;
                        }
                        if (var607 == 4112) {
                            var3--;
                            String var290 = field5674[var3];
                            var2--;
                            int var291 = field5669[var2];
                            if (var291 == -1) {
                                throw new RuntimeException("null char");
                            }
                            field5674[var3++] = var290 + (char) var291;
                            continue;
                        }
                        if (var607 == 4113) {
                            var2--;
                            int var292 = field5669[var2];
                            field5669[var2++] = class73.method425((char) var292, (byte) -80) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4114) {
                            var2--;
                            int var293 = field5669[var2];
                            field5669[var2++] = class353.method2245(-124, (char) var293) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4115) {
                            var2--;
                            int var294 = field5669[var2];
                            field5669[var2++] = class359.method2291((char) var294, 84) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4116) {
                            var2--;
                            int var295 = field5669[var2];
                            field5669[var2++] = class392.method2502((char) var295, 54) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4117) {
                            var3--;
                            String var296 = field5674[var3];
                            if (var296 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var296.length();
                            }
                            continue;
                        }
                        if (var607 == 4118) {
                            var3--;
                            String var297 = field5674[var3];
                            var2 -= 2;
                            int var298 = field5669[var2];
                            int var299 = field5669[var2 + 1];
                            field5674[var3++] = var297.substring(var298, var299);
                            continue;
                        }
                        if (var607 == 4119) {
                            var3--;
                            String var300 = field5674[var3];
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
                            field5674[var3++] = var301.toString();
                            continue;
                        }
                        if (var607 == 4120) {
                            var3--;
                            String var305 = field5674[var3];
                            var2 -= 2;
                            int var306 = field5669[var2];
                            int var307 = field5669[var2 + 1];
                            field5669[var2++] = var305.indexOf(var306, var307);
                            continue;
                        }
                        if (var607 == 4121) {
                            var3 -= 2;
                            String var308 = field5674[var3];
                            String var309 = field5674[var3 + 1];
                            var2--;
                            int var310 = field5669[var2];
                            field5669[var2++] = var308.indexOf(var309, var310);
                            continue;
                        }
                        if (var607 == 4122) {
                            var2--;
                            int var311 = field5669[var2];
                            field5669[var2++] = Character.toLowerCase((char) var311);
                            continue;
                        }
                        if (var607 == 4123) {
                            var2--;
                            int var312 = field5669[var2];
                            field5669[var2++] = Character.toUpperCase((char) var312);
                            continue;
                        }
                        if (var607 == 4124) {
                            var2--;
                            boolean var313 = field5669[var2] != 0;
                            var2--;
                            int var314 = field5669[var2];
                            field5674[var3++] = class105.method562(var313, (long) var314, 0, class297.field4234, 45);
                            continue;
                        }
                    } else if (var607 < 4300) {
                        if (var607 == 4200) {
                            var2--;
                            int var315 = field5669[var2];
                            field5674[var3++] = class392.method2498(var315, -114).field3527;
                            continue;
                        }
                        if (var607 == 4201) {
                            var2 -= 2;
                            int var316 = field5669[var2];
                            int var317 = field5669[var2 + 1];
                            class260 var318 = class392.method2498(var316, -104);
                            if (var317 >= 1 && var317 <= 5 && var318.field3532[var317 - 1] != null) {
                                field5674[var3++] = var318.field3532[var317 - 1];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 4202) {
                            var2 -= 2;
                            int var319 = field5669[var2];
                            int var320 = field5669[var2 + 1];
                            class260 var321 = class392.method2498(var319, -109);
                            if (var320 >= 1 && var320 <= 5 && var321.field3593[var320 - 1] != null) {
                                field5674[var3++] = var321.field3593[var320 - 1];
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 4203) {
                            var2--;
                            int var322 = field5669[var2];
                            field5669[var2++] = class392.method2498(var322, -122).field3597;
                            continue;
                        }
                        if (var607 == 4204) {
                            var2--;
                            int var323 = field5669[var2];
                            field5669[var2++] = class392.method2498(var323, -104).field3581 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4205) {
                            var2--;
                            int var324 = field5669[var2];
                            class260 var325 = class392.method2498(var324, -105);
                            if (var325.field3570 == -1 && var325.field3521 >= 0) {
                                field5669[var2++] = var325.field3521;
                                continue;
                            }
                            field5669[var2++] = var324;
                            continue;
                        }
                        if (var607 == 4206) {
                            var2--;
                            int var326 = field5669[var2];
                            class260 var327 = class392.method2498(var326, -105);
                            if (var327.field3570 >= 0 && var327.field3521 >= 0) {
                                field5669[var2++] = var327.field3521;
                                continue;
                            }
                            field5669[var2++] = var326;
                            continue;
                        }
                        if (var607 == 4207) {
                            var2--;
                            int var328 = field5669[var2];
                            field5669[var2++] = class392.method2498(var328, -108).field3592 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 4208) {
                            var2 -= 2;
                            int var329 = field5669[var2];
                            int var330 = field5669[var2 + 1];
                            class176 var331 = class349.method2223(false, var330);
                            if (var331.method1160(-98)) {
                                field5674[var3++] = class392.method2498(var329, -115).method1630(var330, 0, var331.field2442);
                            } else {
                                field5669[var2++] = class392.method2498(var329, -121).method1620(var330, 16, var331.field2451);
                            }
                            continue;
                        }
                        if (var607 == 4210) {
                            var3--;
                            String var332 = field5674[var3];
                            var2--;
                            int var333 = field5669[var2];
                            class392.method2499(var332, var333 == 1, (byte) -115);
                            field5669[var2++] = class201.field2773;
                            continue;
                        }
                        if (var607 == 4211) {
                            if (class51.field592 != null && class231.field3127 < class201.field2773) {
                                field5669[var2++] = class51.field592[class231.field3127++] & 0xFFFF;
                                continue;
                            }
                            field5669[var2++] = -1;
                            continue;
                        }
                        if (var607 == 4212) {
                            class231.field3127 = 0;
                            continue;
                        }
                    } else if (var607 < 4400) {
                        if (var607 == 4300) {
                            var2 -= 2;
                            int var334 = field5669[var2];
                            int var335 = field5669[var2 + 1];
                            class176 var336 = class349.method2223(false, var335);
                            if (var336.method1160(-120)) {
                                field5674[var3++] = class282.method1806(110, var334).method2167(37, var335, var336.field2442);
                            } else {
                                field5669[var2++] = class282.method1806(76, var334).method2161(var336.field2451, -110, var335);
                            }
                            continue;
                        }
                    } else if (var607 < 4500) {
                        if (var607 == 4400) {
                            var2 -= 2;
                            int var337 = field5669[var2];
                            int var338 = field5669[var2 + 1];
                            class176 var339 = class349.method2223(false, var338);
                            if (var339.method1160(-126)) {
                                field5674[var3++] = class157.method1036(0, var337).method2023(-123, var339.field2442, var338);
                            } else {
                                field5669[var2++] = class157.method1036(0, var337).method2020(var339.field2451, (byte) -30, var338);
                            }
                            continue;
                        }
                    } else if (var607 < 4600) {
                        if (var607 == 4500) {
                            var2 -= 2;
                            int var340 = field5669[var2];
                            int var341 = field5669[var2 + 1];
                            class176 var342 = class349.method2223(false, var341);
                            if (var342.method1160(-105)) {
                                field5674[var3++] = class308.method1929((byte) -119, var340).method78(var342.field2442, var341, 16083);
                            } else {
                                field5669[var2++] = class308.method1929((byte) -107, var340).method75(var342.field2451, -711, var341);
                            }
                            continue;
                        }
                    } else if (var607 < 4700) {
                        if (var607 == 4600) {
                            var2--;
                            int var343 = field5669[var2];
                            field5669[var2++] = class403.method2555(var343, (byte) 49).field3794;
                            continue;
                        }
                    } else if (var607 < 5100) {
                        if (var607 == 5000) {
                            field5669[var2++] = class50.field579;
                            continue;
                        }
                        if (var607 == 5001) {
                            var2 -= 3;
                            class50.field579 = field5669[var2];
                            class376.field5514 = field5669[var2 + 1];
                            class119.field1449 = field5669[var2 + 2];
                            field5663++;
                            class169.field2360.method809(187, -28022);
                            class169.field2360.method1396(21375, class50.field579);
                            class169.field2360.method1396(21375, class376.field5514);
                            class169.field2360.method1396(21375, class119.field1449);
                            continue;
                        }
                        if (var607 == 5002) {
                            var3--;
                            String var344 = field5674[var3];
                            var2 -= 2;
                            int var345 = field5669[var2];
                            int var346 = field5669[var2 + 1];
                            field5659++;
                            class169.field2360.method809(159, -28022);
                            class169.field2360.method1396(21375, class233.method1488(-19285, var344) + 2);
                            class169.field2360.method1359((byte) 0, var344);
                            class169.field2360.method1396(21375, var345 - 1);
                            class169.field2360.method1396(21375, var346);
                            continue;
                        }
                        if (var607 == 5003) {
                            var2--;
                            int var347 = field5669[var2];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = class417.field5993[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field5674[var3++] = var348;
                            continue;
                        }
                        if (var607 == 5004) {
                            var2--;
                            int var349 = field5669[var2];
                            int var350 = -1;
                            if (var349 < 100 && class417.field5993[var349] != null) {
                                var350 = class334.field4916[var349];
                            }
                            field5669[var2++] = var350;
                            continue;
                        }
                        if (var607 == 5005) {
                            field5669[var2++] = class376.field5514;
                            continue;
                        }
                        if (var607 == 5008) {
                            var3--;
                            String var351 = field5674[var3];
                            if (class56.field642 == 0 && (class149.field2095 && !class303.field4330 || class24.field239)) {
                                continue;
                            }
                            String var352 = var351.toLowerCase();
                            byte var353 = 0;
                            if (var352.startsWith(class413.field5965)) {
                                var353 = 0;
                                var351 = var351.substring(class413.field5965.length());
                            } else if (var352.startsWith(class373.field5451)) {
                                var353 = 1;
                                var351 = var351.substring(class373.field5451.length());
                            } else if (var352.startsWith(class424.field6087)) {
                                var353 = 2;
                                var351 = var351.substring(class424.field6087.length());
                            } else if (var352.startsWith(class37.field366)) {
                                var353 = 3;
                                var351 = var351.substring(class37.field366.length());
                            } else if (var352.startsWith(class397.field5784)) {
                                var353 = 4;
                                var351 = var351.substring(class397.field5784.length());
                            } else if (var352.startsWith(class401.field5835)) {
                                var353 = 5;
                                var351 = var351.substring(class401.field5835.length());
                            } else if (var352.startsWith(class448.field6539)) {
                                var353 = 6;
                                var351 = var351.substring(class448.field6539.length());
                            } else if (var352.startsWith(class174.field2428)) {
                                var353 = 7;
                                var351 = var351.substring(class174.field2428.length());
                            } else if (var352.startsWith(class26.field251)) {
                                var353 = 8;
                                var351 = var351.substring(class26.field251.length());
                            } else if (var352.startsWith(class326.field4580)) {
                                var353 = 9;
                                var351 = var351.substring(class326.field4580.length());
                            } else if (var352.startsWith(class412.field5960)) {
                                var353 = 10;
                                var351 = var351.substring(class412.field5960.length());
                            } else if (var352.startsWith(class266.field3728)) {
                                var353 = 11;
                                var351 = var351.substring(class266.field3728.length());
                            } else if (class297.field4234 != 0) {
                                if (var352.startsWith(class289.field4090)) {
                                    var353 = 0;
                                    var351 = var351.substring(class289.field4090.length());
                                } else if (var352.startsWith(class388.field5684)) {
                                    var353 = 1;
                                    var351 = var351.substring(class388.field5684.length());
                                } else if (var352.startsWith(class245.field3321)) {
                                    var353 = 2;
                                    var351 = var351.substring(class245.field3321.length());
                                } else if (var352.startsWith(class63.field725)) {
                                    var353 = 3;
                                    var351 = var351.substring(class63.field725.length());
                                } else if (var352.startsWith(class375.field5470)) {
                                    var353 = 4;
                                    var351 = var351.substring(class375.field5470.length());
                                } else if (var352.startsWith(class427.field6213)) {
                                    var353 = 5;
                                    var351 = var351.substring(class427.field6213.length());
                                } else if (var352.startsWith(class150.field2098)) {
                                    var353 = 6;
                                    var351 = var351.substring(class150.field2098.length());
                                } else if (var352.startsWith(class271.field3841)) {
                                    var353 = 7;
                                    var351 = var351.substring(class271.field3841.length());
                                } else if (var352.startsWith(class435.field6379)) {
                                    var353 = 8;
                                    var351 = var351.substring(class435.field6379.length());
                                } else if (var352.startsWith(class291.field4201)) {
                                    var353 = 9;
                                    var351 = var351.substring(class291.field4201.length());
                                } else if (var352.startsWith(class85.field964)) {
                                    var353 = 10;
                                    var351 = var351.substring(class85.field964.length());
                                } else if (var352.startsWith(class427.field6209)) {
                                    var353 = 11;
                                    var351 = var351.substring(class427.field6209.length());
                                }
                            }
                            String var354 = var351.toLowerCase();
                            byte var355 = 0;
                            if (var354.startsWith(class419.field6029)) {
                                var355 = 1;
                                var351 = var351.substring(class419.field6029.length());
                            } else if (var354.startsWith(class279.field3937)) {
                                var355 = 2;
                                var351 = var351.substring(class279.field3937.length());
                            } else if (var354.startsWith(class218.field2981)) {
                                var355 = 3;
                                var351 = var351.substring(class218.field2981.length());
                            } else if (var354.startsWith(class85.field948)) {
                                var355 = 4;
                                var351 = var351.substring(class85.field948.length());
                            } else if (var354.startsWith(class419.field6031)) {
                                var355 = 5;
                                var351 = var351.substring(class419.field6031.length());
                            } else if (class297.field4234 != 0) {
                                if (var354.startsWith(class160.field2270)) {
                                    var355 = 1;
                                    var351 = var351.substring(class160.field2270.length());
                                } else if (var354.startsWith(class12.field133)) {
                                    var355 = 2;
                                    var351 = var351.substring(class12.field133.length());
                                } else if (var354.startsWith(class364.field5298)) {
                                    var355 = 3;
                                    var351 = var351.substring(class364.field5298.length());
                                } else if (var354.startsWith(class195.field2649)) {
                                    var355 = 4;
                                    var351 = var351.substring(class195.field2649.length());
                                } else if (var354.startsWith(class102.field1162)) {
                                    var355 = 5;
                                    var351 = var351.substring(class102.field1162.length());
                                }
                            }
                            field5664++;
                            class169.field2360.method809(47, -28022);
                            class169.field2360.method1396(21375, 0);
                            int var356 = class169.field2360.field2888;
                            class169.field2360.method1396(21375, var353);
                            class169.field2360.method1396(21375, var355);
                            class33.method191(var351, false, class169.field2360);
                            class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var356);
                            continue;
                        }
                        if (var607 == 5009) {
                            var3 -= 2;
                            String var357 = field5674[var3];
                            String var358 = field5674[var3 + 1];
                            if (class56.field642 != 0 || (!class149.field2095 || class303.field4330) && !class24.field239) {
                                field5655++;
                                class169.field2360.method809(45, -28022);
                                class169.field2360.method1396(21375, 0);
                                int var359 = class169.field2360.field2888;
                                class169.field2360.method1359((byte) 0, var357);
                                class33.method191(var358, false, class169.field2360);
                                class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var359);
                            }
                            continue;
                        }
                        if (var607 == 5010) {
                            var2--;
                            int var360 = field5669[var2];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = class379.field5573[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field5674[var3++] = var361;
                            continue;
                        }
                        if (var607 == 5011) {
                            var2--;
                            int var362 = field5669[var2];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = class343.field5040[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field5674[var3++] = var363;
                            continue;
                        }
                        if (var607 == 5012) {
                            var2--;
                            int var364 = field5669[var2];
                            int var365 = -1;
                            if (var364 < 100) {
                                var365 = class436.field6394[var364];
                            }
                            field5669[var2++] = var365;
                            continue;
                        }
                        if (var607 == 5015) {
                            String var366;
                            if (class390.field5715 == null || class390.field5715.field1855 == null) {
                                var366 = class93.field1033;
                            } else {
                                var366 = class390.field5715.method787(-1, true);
                            }
                            field5674[var3++] = var366;
                            continue;
                        }
                        if (var607 == 5016) {
                            field5669[var2++] = class119.field1449;
                            continue;
                        }
                        if (var607 == 5017) {
                            field5669[var2++] = class219.field3013;
                            continue;
                        }
                        if (var607 == 5018) {
                            var2--;
                            int var367 = field5669[var2];
                            int var368 = 0;
                            if (var367 < 100 && class417.field5993[var367] != null) {
                                var368 = class334.field4916[var367];
                            }
                            field5669[var2++] = var368;
                            continue;
                        }
                        if (var607 == 5019) {
                            var2--;
                            int var369 = field5669[var2];
                            String var370 = null;
                            if (var369 < 100) {
                                var370 = class298.field4257[var369];
                            }
                            if (var370 == null) {
                                var370 = "";
                            }
                            field5674[var3++] = var370;
                            continue;
                        }
                        if (var607 == 5020) {
                            String var371;
                            if (class390.field5715 == null || class390.field5715.field1855 == null) {
                                var371 = class93.field1033;
                            } else {
                                var371 = class390.field5715.method785(-97, false);
                            }
                            field5674[var3++] = var371;
                            continue;
                        }
                        if (var607 == 5050) {
                            var2--;
                            int var372 = field5669[var2];
                            field5674[var3++] = class147.method872(var372, -117).field94;
                            continue;
                        }
                        if (var607 == 5051) {
                            var2--;
                            int var373 = field5669[var2];
                            class7 var374 = class147.method872(var373, 111);
                            if (var374.field93 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var374.field93.length;
                            }
                            continue;
                        }
                        if (var607 == 5052) {
                            var2 -= 2;
                            int var375 = field5669[var2];
                            int var376 = field5669[var2 + 1];
                            class7 var377 = class147.method872(var375, -100);
                            int var378 = var377.field93[var376];
                            field5669[var2++] = var378;
                            continue;
                        }
                        if (var607 == 5053) {
                            var2--;
                            int var379 = field5669[var2];
                            class7 var380 = class147.method872(var379, -123);
                            if (var380.field86 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var380.field86.length;
                            }
                            continue;
                        }
                        if (var607 == 5054) {
                            var2 -= 2;
                            int var381 = field5669[var2];
                            int var382 = field5669[var2 + 1];
                            field5669[var2++] = class147.method872(var381, 28).field86[var382];
                            continue;
                        }
                        if (var607 == 5055) {
                            var2--;
                            int var383 = field5669[var2];
                            field5674[var3++] = class419.method2603(var383, true).method1827(-90);
                            continue;
                        }
                        if (var607 == 5056) {
                            var2--;
                            int var384 = field5669[var2];
                            class286 var385 = class419.method2603(var384, true);
                            if (var385.field4038 == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var385.field4038.length;
                            }
                            continue;
                        }
                        if (var607 == 5057) {
                            var2 -= 2;
                            int var386 = field5669[var2];
                            int var387 = field5669[var2 + 1];
                            field5669[var2++] = class419.method2603(var386, true).field4038[var387];
                            continue;
                        }
                        if (var607 == 5058) {
                            field5658 = new class204();
                            var2--;
                            field5658.field2794 = field5669[var2];
                            field5658.field2793 = class419.method2603(field5658.field2794, true);
                            field5658.field2797 = new int[field5658.field2793.method1824(-11117)];
                            continue;
                        }
                        if (var607 == 5059) {
                            field5667++;
                            class169.field2360.method809(138, -28022);
                            class169.field2360.method1396(21375, 0);
                            int var388 = class169.field2360.field2888;
                            class169.field2360.method1396(21375, 0);
                            class169.field2360.method1380(field5658.field2794, (byte) -8);
                            field5658.field2793.method1816(class169.field2360, true, field5658.field2797);
                            class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var388);
                            continue;
                        }
                        if (var607 == 5060) {
                            var3--;
                            String var389 = field5674[var3];
                            field5657++;
                            class169.field2360.method809(242, -28022);
                            class169.field2360.method1396(21375, 0);
                            int var390 = class169.field2360.field2888;
                            class169.field2360.method1359((byte) 0, var389);
                            class169.field2360.method1380(field5658.field2794, (byte) -8);
                            field5658.field2793.method1816(class169.field2360, true, field5658.field2797);
                            class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var390);
                            continue;
                        }
                        if (var607 == 5061) {
                            field5667++;
                            class169.field2360.method809(138, -28022);
                            class169.field2360.method1396(21375, 0);
                            int var391 = class169.field2360.field2888;
                            class169.field2360.method1396(21375, 1);
                            class169.field2360.method1380(field5658.field2794, (byte) -8);
                            field5658.field2793.method1816(class169.field2360, true, field5658.field2797);
                            class169.field2360.method1367((byte) -55, class169.field2360.field2888 - var391);
                            continue;
                        }
                        if (var607 == 5062) {
                            var2 -= 2;
                            int var392 = field5669[var2];
                            int var393 = field5669[var2 + 1];
                            field5669[var2++] = class147.method872(var392, -84).field91[var393];
                            continue;
                        }
                        if (var607 == 5063) {
                            var2 -= 2;
                            int var394 = field5669[var2];
                            int var395 = field5669[var2 + 1];
                            field5669[var2++] = class147.method872(var394, -110).field83[var395];
                            continue;
                        }
                        if (var607 == 5064) {
                            var2 -= 2;
                            int var396 = field5669[var2];
                            int var397 = field5669[var2 + 1];
                            if (var397 == -1) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = class147.method872(var396, -79).method65(-15720, (char) var397);
                            }
                            continue;
                        }
                        if (var607 == 5065) {
                            var2 -= 2;
                            int var398 = field5669[var2];
                            int var399 = field5669[var2 + 1];
                            if (var399 == -1) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = class147.method872(var398, -109).method68(105, (char) var399);
                            }
                            continue;
                        }
                        if (var607 == 5066) {
                            var2--;
                            int var400 = field5669[var2];
                            field5669[var2++] = class419.method2603(var400, true).method1824(-11117);
                            continue;
                        }
                        if (var607 == 5067) {
                            var2 -= 2;
                            int var401 = field5669[var2];
                            int var402 = field5669[var2 + 1];
                            int var403 = class419.method2603(var401, true).method1819(var402, 0);
                            field5669[var2++] = var403;
                            continue;
                        }
                        if (var607 == 5068) {
                            var2 -= 2;
                            int var404 = field5669[var2];
                            int var405 = field5669[var2 + 1];
                            field5658.field2797[var404] = var405;
                            continue;
                        }
                        if (var607 == 5069) {
                            var2 -= 2;
                            int var406 = field5669[var2];
                            int var407 = field5669[var2 + 1];
                            field5658.field2797[var406] = var407;
                            continue;
                        }
                        if (var607 == 5070) {
                            var2 -= 3;
                            int var408 = field5669[var2];
                            int var409 = field5669[var2 + 1];
                            int var410 = field5669[var2 + 2];
                            class286 var411 = class419.method2603(var408, true);
                            if (var411.method1819(var409, 0) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            field5669[var2++] = var411.method1818(var409, var410, 0);
                            continue;
                        }
                        if (var607 == 5071) {
                            var3--;
                            String var412 = field5674[var3];
                            var2--;
                            boolean var413 = field5669[var2] == 1;
                            class37.method221(var413, (byte) 113, var412);
                            field5669[var2++] = class201.field2773;
                            continue;
                        }
                        if (var607 == 5072) {
                            if (class51.field592 != null && class231.field3127 < class201.field2773) {
                                field5669[var2++] = class51.field592[class231.field3127++] & 0xFFFF;
                                continue;
                            }
                            field5669[var2++] = -1;
                            continue;
                        }
                        if (var607 == 5073) {
                            class231.field3127 = 0;
                            continue;
                        }
                    } else if (var607 < 5200) {
                        if (var607 == 5100) {
                            if (class256.field3447[86]) {
                                field5669[var2++] = 1;
                            } else {
                                field5669[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5101) {
                            if (class256.field3447[82]) {
                                field5669[var2++] = 1;
                            } else {
                                field5669[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5102) {
                            if (class256.field3447[81]) {
                                field5669[var2++] = 1;
                            } else {
                                field5669[var2++] = 0;
                            }
                            continue;
                        }
                    } else if (var607 < 5300) {
                        if (var607 == 5200) {
                            var2--;
                            class119.method672(field5669[var2], 58);
                            continue;
                        }
                        if (var607 == 5201) {
                            field5669[var2++] = class58.method364(false);
                            continue;
                        }
                        if (var607 == 5205) {
                            var2--;
                            class137.method822(false, -1, false, field5669[var2], -1);
                            continue;
                        }
                        if (var607 == 5206) {
                            var2--;
                            int var414 = field5669[var2];
                            class95 var415 = class106.method591(var414 >> 14 & 0x3FFF, var414 & 0x3FFF);
                            if (var415 == null) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = var415.field1051;
                            }
                            continue;
                        }
                        if (var607 == 5207) {
                            var2--;
                            class95 var416 = class106.method592(field5669[var2]);
                            if (var416 != null && var416.field1060 != null) {
                                field5674[var3++] = var416.field1060;
                                continue;
                            }
                            field5674[var3++] = "";
                            continue;
                        }
                        if (var607 == 5208) {
                            field5669[var2++] = class225.field3077;
                            field5669[var2++] = class189.field2561;
                            continue;
                        }
                        if (var607 == 5209) {
                            field5669[var2++] = class221.field3025 + class106.field1222;
                            field5669[var2++] = class356.field5214 + class106.field1228;
                            continue;
                        }
                        if (var607 == 5210) {
                            var2--;
                            int var417 = field5669[var2];
                            class95 var418 = class106.method592(var417);
                            if (var418 == null) {
                                field5669[var2++] = 0;
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var418.field1055 >> 14 & 0x3FFF;
                                field5669[var2++] = var418.field1055 & 0x3FFF;
                            }
                            continue;
                        }
                        if (var607 == 5211) {
                            var2--;
                            int var419 = field5669[var2];
                            class95 var420 = class106.method592(var419);
                            if (var420 == null) {
                                field5669[var2++] = 0;
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var420.field1044 - var420.field1046;
                                field5669[var2++] = var420.field1049 - var420.field1045;
                            }
                            continue;
                        }
                        if (var607 == 5212) {
                            class278 var421 = class149.method890((byte) -118);
                            if (var421 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = var421.field3920;
                                int var422 = var421.field3923 << 28 | class106.field1222 + var421.field3916 << 14 | class106.field1228 + var421.field3921;
                                field5669[var2++] = var422;
                            }
                            continue;
                        }
                        if (var607 == 5213) {
                            class278 var423 = class93.method499(7);
                            if (var423 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = var423.field3920;
                                int var424 = var423.field3923 << 28 | class106.field1222 + var423.field3916 << 14 | class106.field1228 + var423.field3921;
                                field5669[var2++] = var424;
                            }
                            continue;
                        }
                        if (var607 == 5214) {
                            var2--;
                            int var425 = field5669[var2];
                            class95 var426 = class3.method21((byte) -126);
                            if (var426 != null) {
                                boolean var427 = var426.method507(var425 >> 28 & 0x3, field5678, var425 >> 14 & 0x3FFF, var425 & 0x3FFF, false);
                                if (var427) {
                                    class384.method2462(field5678[1], false, field5678[2]);
                                }
                            }
                            continue;
                        }
                        if (var607 == 5215) {
                            var2 -= 2;
                            int var428 = field5669[var2];
                            int var429 = field5669[var2 + 1];
                            class1 var430 = class106.method583(var428 >> 14 & 0x3FFF, var428 & 0x3FFF);
                            boolean var431 = false;
                            for (class95 var432 = (class95) var430.method2(15056); var432 != null; var432 = (class95) var430.method10(95)) {
                                if (var432.field1051 == var429) {
                                    var431 = true;
                                    break;
                                }
                            }
                            if (var431) {
                                field5669[var2++] = 1;
                            } else {
                                field5669[var2++] = 0;
                            }
                            continue;
                        }
                        if (var607 == 5218) {
                            var2--;
                            int var433 = field5669[var2];
                            class95 var434 = class106.method592(var433);
                            if (var434 == null) {
                                field5669[var2++] = -1;
                            } else {
                                field5669[var2++] = var434.field1052;
                            }
                            continue;
                        }
                        if (var607 == 5220) {
                            field5669[var2++] = class173.field2404 == 100 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5221) {
                            var2--;
                            int var435 = field5669[var2];
                            class384.method2462(var435 >> 14 & 0x3FFF, false, var435 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5222) {
                            class95 var436 = class3.method21((byte) -126);
                            if (var436 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = -1;
                            } else {
                                boolean var437 = var436.method511(class356.field5214 + class106.field1228, class221.field3025 + class106.field1222, field5678, (byte) 125);
                                if (var437) {
                                    field5669[var2++] = field5678[1];
                                    field5669[var2++] = field5678[2];
                                } else {
                                    field5669[var2++] = -1;
                                    field5669[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5223) {
                            var2 -= 2;
                            int var438 = field5669[var2];
                            int var439 = field5669[var2 + 1];
                            class137.method822(false, var439 & 0x3FFF, false, var438, var439 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5224) {
                            var2--;
                            int var440 = field5669[var2];
                            class95 var441 = class3.method21((byte) -126);
                            if (var441 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = -1;
                            } else {
                                boolean var442 = var441.method507(var440 >> 28 & 0x3, field5678, var440 >> 14 & 0x3FFF, var440 & 0x3FFF, false);
                                if (var442) {
                                    field5669[var2++] = field5678[1];
                                    field5669[var2++] = field5678[2];
                                } else {
                                    field5669[var2++] = -1;
                                    field5669[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5225) {
                            var2--;
                            int var443 = field5669[var2];
                            class95 var444 = class3.method21((byte) -126);
                            if (var444 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = -1;
                            } else {
                                boolean var445 = var444.method511(var443 & 0x3FFF, var443 >> 14 & 0x3FFF, field5678, (byte) 125);
                                if (var445) {
                                    field5669[var2++] = field5678[1];
                                    field5669[var2++] = field5678[2];
                                } else {
                                    field5669[var2++] = -1;
                                    field5669[var2++] = -1;
                                }
                            }
                            continue;
                        }
                        if (var607 == 5226) {
                            var2--;
                            class385.method2465(-128, field5669[var2]);
                            continue;
                        }
                        if (var607 == 5227) {
                            var2 -= 2;
                            int var446 = field5669[var2];
                            int var447 = field5669[var2 + 1];
                            class137.method822(false, var447 & 0x3FFF, true, var446, var447 >> 14 & 0x3FFF);
                            continue;
                        }
                        if (var607 == 5228) {
                            var2--;
                            class188.field2551 = field5669[var2] == 1;
                            continue;
                        }
                        if (var607 == 5229) {
                            field5669[var2++] = class188.field2551 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5230) {
                            var2--;
                            int var448 = field5669[var2];
                            class376.method2363(var448, -119);
                            continue;
                        }
                        if (var607 == 5231) {
                            var2 -= 2;
                            int var449 = field5669[var2];
                            boolean var450 = field5669[var2 + 1] == 1;
                            if (class195.field2647 == null) {
                                continue;
                            }
                            class359 var451 = class195.field2647.method1204((byte) -120, (long) var449);
                            if (var451 != null && !var450) {
                                var451.method2290((byte) 98);
                                continue;
                            }
                            if (var451 == null && var450) {
                                class359 var452 = new class359();
                                class195.field2647.method1202(-1, (long) var449, var452);
                            }
                            continue;
                        }
                        if (var607 == 5232) {
                            var2--;
                            int var453 = field5669[var2];
                            if (class195.field2647 == null) {
                                field5669[var2++] = 0;
                            } else {
                                class359 var454 = class195.field2647.method1204((byte) -117, (long) var453);
                                field5669[var2++] = var454 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5233) {
                            var2 -= 2;
                            int var455 = field5669[var2];
                            boolean var456 = field5669[var2 + 1] == 1;
                            if (class264.field3704 == null) {
                                continue;
                            }
                            class359 var457 = class264.field3704.method1204((byte) -125, (long) var455);
                            if (var457 != null && !var456) {
                                var457.method2290((byte) 98);
                                continue;
                            }
                            if (var457 == null && var456) {
                                class359 var458 = new class359();
                                class264.field3704.method1202(-1, (long) var455, var458);
                            }
                            continue;
                        }
                        if (var607 == 5234) {
                            var2--;
                            int var459 = field5669[var2];
                            if (class264.field3704 == null) {
                                field5669[var2++] = 0;
                            } else {
                                class359 var460 = class264.field3704.method1204((byte) -92, (long) var459);
                                field5669[var2++] = var460 == null ? 0 : 1;
                            }
                            continue;
                        }
                        if (var607 == 5235) {
                            field5669[var2++] = class106.field1202 == null ? -1 : class106.field1202.field1051;
                            continue;
                        }
                    } else if (var607 < 5400) {
                        if (var607 == 5300) {
                            var2 -= 2;
                            int var461 = field5669[var2];
                            int var462 = field5669[var2 + 1];
                            class175.method1158(var461, -1, var462, 3, false);
                            field5669[var2++] = class223.field3042 == null ? 0 : 1;
                            continue;
                        }
                        if (var607 == 5301) {
                            if (class223.field3042 != null) {
                                class175.method1158(-1, -1, -1, class288.field4081, false);
                            }
                            continue;
                        }
                        if (var607 == 5302) {
                            class83[] var463 = class54.method315(4305);
                            field5669[var2++] = var463.length;
                            continue;
                        }
                        if (var607 == 5303) {
                            var2--;
                            int var464 = field5669[var2];
                            class83[] var465 = class54.method315(4305);
                            field5669[var2++] = var465[var464].field938;
                            field5669[var2++] = var465[var464].field933;
                            continue;
                        }
                        if (var607 == 5305) {
                            int var466 = class373.field5445;
                            int var467 = class430.field6235;
                            int var468 = -1;
                            class83[] var469 = class54.method315(4305);
                            for (int var470 = 0; var470 < var469.length; var470++) {
                                class83 var471 = var469[var470];
                                if (var471.field938 == var466 && var471.field933 == var467) {
                                    var468 = var470;
                                    break;
                                }
                            }
                            field5669[var2++] = var468;
                            continue;
                        }
                        if (var607 == 5306) {
                            field5669[var2++] = class23.method151((byte) -107);
                            continue;
                        }
                        if (var607 == 5307) {
                            var2--;
                            int var472 = field5669[var2];
                            if (var472 >= 1 && var472 <= 2) {
                                class175.method1158(-1, -1, -1, var472, false);
                            }
                            continue;
                        }
                        if (var607 == 5308) {
                            field5669[var2++] = class288.field4081;
                            continue;
                        }
                        if (var607 == 5309) {
                            var2--;
                            int var473 = field5669[var2];
                            if (var473 >= 1 && var473 <= 2) {
                                class288.field4081 = var473;
                                class193.method1232(27875, class323.field4554);
                            }
                            continue;
                        }
                    } else if (var607 < 5500) {
                        if (var607 == 5400) {
                            var3 -= 2;
                            String var474 = field5674[var3];
                            String var475 = field5674[var3 + 1];
                            var2--;
                            int var476 = field5669[var2];
                            field5670++;
                            class169.field2360.method809(95, -28022);
                            class169.field2360.method1396(21375, class233.method1488(-19285, var474) + class233.method1488(-19285, var475) + 1);
                            class169.field2360.method1359((byte) 0, var474);
                            class169.field2360.method1359((byte) 0, var475);
                            class169.field2360.method1396(21375, var476);
                            continue;
                        }
                        if (var607 == 5401) {
                            var2 -= 2;
                            class118.field1412[field5669[var2]] = (short) class6.method59(field5669[var2 + 1], -27643);
                            class45.method287(false);
                            class27.method161(-1);
                            class85.method464(2047);
                            class45.method286(54);
                            class109.method609(127);
                            continue;
                        }
                        if (var607 == 5405) {
                            var2 -= 2;
                            int var477 = field5669[var2];
                            int var478 = field5669[var2 + 1];
                            if (var477 >= 0 && var477 < 2) {
                                class417.field5988[var477] = new int[var478 << 1][4];
                            }
                            continue;
                        }
                        if (var607 == 5406) {
                            var2 -= 7;
                            int var479 = field5669[var2];
                            int var480 = field5669[var2 + 1] << 1;
                            int var481 = field5669[var2 + 2];
                            int var482 = field5669[var2 + 3];
                            int var483 = field5669[var2 + 4];
                            int var484 = field5669[var2 + 5];
                            int var485 = field5669[var2 + 6];
                            if (var479 >= 0 && var479 < 2 && class417.field5988[var479] != null && var480 >= 0 && var480 < class417.field5988[var479].length) {
                                class417.field5988[var479][var480] = new int[] { (var481 >> 14 & 0x3FFF) * 128, var482, (var481 & 0x3FFF) * 128, var485 };
                                class417.field5988[var479][var480 + 1] = new int[] { (var483 >> 14 & 0x3FFF) * 128, var484, (var483 & 0x3FFF) * 128 };
                            }
                            continue;
                        }
                        if (var607 == 5407) {
                            var2--;
                            int var486 = class417.field5988[field5669[var2]].length >> 1;
                            field5669[var2++] = var486;
                            continue;
                        }
                        if (var607 == 5411) {
                            if (class223.field3042 != null) {
                                class175.method1158(-1, -1, -1, class288.field4081, false);
                            }
                            if (class252.field3406 == null) {
                                String var487 = class266.field3712 == null ? class424.method2630((byte) 107) : class266.field3712;
                                class274.method1735(25794, class323.field4554, var487, class341.field5018 == 1, false);
                            } else {
                                class308.method1927((byte) -45);
                                System.exit(0);
                            }
                            continue;
                        }
                        if (var607 == 5419) {
                            String var488 = "";
                            if (class70.field797 != null) {
                                if (class70.field797.field3270 == null) {
                                    var488 = class274.method1737(255, class70.field797.field3267);
                                } else {
                                    var488 = (String) class70.field797.field3270;
                                }
                            }
                            field5674[var3++] = var488;
                            continue;
                        }
                        if (var607 == 5420) {
                            field5669[var2++] = class378.field5553 == 3 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5421) {
                            if (class223.field3042 != null) {
                                class175.method1158(-1, -1, -1, class288.field4081, false);
                            }
                            var3--;
                            String var489 = field5674[var3];
                            var2--;
                            boolean var490 = field5669[var2] == 1;
                            String var491 = class424.method2630((byte) -122) + var489;
                            class274.method1735(25794, class323.field4554, var491, class341.field5018 == 1, var490);
                            continue;
                        }
                        if (var607 == 5422) {
                            var3 -= 2;
                            String var492 = field5674[var3];
                            String var493 = field5674[var3 + 1];
                            var2--;
                            int var494 = field5669[var2];
                            if (var492.length() > 0) {
                                if (class305.field4360 == null) {
                                    class305.field4360 = new String[class307.field4395[class136.field1912]];
                                }
                                class305.field4360[var494] = var492;
                            }
                            if (var493.length() > 0) {
                                if (class267.field3736 == null) {
                                    class267.field3736 = new String[class307.field4395[class136.field1912]];
                                }
                                class267.field3736[var494] = var493;
                            }
                            continue;
                        }
                        if (var607 == 5423) {
                            var3--;
                            System.out.println(field5674[var3]);
                            continue;
                        }
                        if (var607 == 5424) {
                            var2 -= 11;
                            class419.field6027 = field5669[var2];
                            class88.field994 = field5669[var2 + 1];
                            class40.field436 = field5669[var2 + 2];
                            class6.field72 = field5669[var2 + 3];
                            class215.field2930 = field5669[var2 + 4];
                            class98.field1095 = field5669[var2 + 5];
                            class136.field1915 = field5669[var2 + 6];
                            class172.field2403 = field5669[var2 + 7];
                            class206.field2806 = field5669[var2 + 8];
                            class38.field391 = field5669[var2 + 9];
                            class26.field255 = field5669[var2 + 10];
                            class92.field1012.method345(1, class215.field2930);
                            class92.field1012.method345(1, class98.field1095);
                            class92.field1012.method345(1, class136.field1915);
                            class92.field1012.method345(1, class172.field2403);
                            class92.field1012.method345(1, class206.field2806);
                            class252.field3409 = null;
                            class142.field1996 = null;
                            class401.field5821 = null;
                            class100.field1125 = null;
                            class66.field740 = null;
                            class40.field425 = null;
                            class221.field3034 = null;
                            class329.field4711 = null;
                            class94.field1041 = true;
                            continue;
                        }
                        if (var607 == 5425) {
                            class116.method643(16384);
                            class94.field1041 = false;
                            continue;
                        }
                        if (var607 == 5426) {
                            var2 -= 2;
                            class225.field3076 = field5669[var2];
                            class207.field2818 = field5669[var2 + 1];
                            continue;
                        }
                        if (var607 == 5427) {
                            var2 -= 2;
                            class423.field6069 = field5669[var2];
                            class438.field6424 = field5669[var2 + 1];
                            continue;
                        }
                        if (var607 == 5428) {
                            var2 -= 2;
                            int var495 = field5669[var2];
                            int var496 = field5669[var2 + 1];
                            field5669[var2++] = class375.method2358(false, var495, var496) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 5429) {
                            var3--;
                            class6.method63(-11, false, field5674[var3]);
                            continue;
                        }
                    } else if (var607 < 5600) {
                        if (var607 == 5500) {
                            var2 -= 4;
                            int var497 = field5669[var2];
                            int var498 = field5669[var2 + 1];
                            int var499 = field5669[var2 + 2];
                            int var500 = field5669[var2 + 3];
                            class300.method1891(var499, (var497 & 0x3FFF) - class217.field2975, false, (var497 >> 14 & 0x3FFF) - class40.field427, (byte) -107, var498, var500);
                            continue;
                        }
                        if (var607 == 5501) {
                            var2 -= 4;
                            int var501 = field5669[var2];
                            int var502 = field5669[var2 + 1];
                            int var503 = field5669[var2 + 2];
                            int var504 = field5669[var2 + 3];
                            class400.method2536(var503, (var501 >> 14 & 0x3FFF) - class40.field427, var502, var504, (var501 & 0x3FFF) - class217.field2975, 64);
                            continue;
                        }
                        if (var607 == 5502) {
                            var2 -= 6;
                            int var505 = field5669[var2];
                            if (var505 >= 2) {
                                throw new RuntimeException();
                            }
                            class75.field832 = var505;
                            int var506 = field5669[var2 + 1];
                            if (var506 + 1 >= class417.field5988[class75.field832].length >> 1) {
                                throw new RuntimeException();
                            }
                            class417.field5992 = var506;
                            class444.field6493 = 0;
                            class386.field5644 = field5669[var2 + 2];
                            class34.field317 = field5669[var2 + 3];
                            int var507 = field5669[var2 + 4];
                            if (var507 >= 2) {
                                throw new RuntimeException();
                            }
                            class290.field4141 = var507;
                            int var508 = field5669[var2 + 5];
                            if (var508 + 1 >= class417.field5988[class290.field4141].length >> 1) {
                                throw new RuntimeException();
                            }
                            class41.field459 = var508;
                            class231.field3128 = 3;
                            continue;
                        }
                        if (var607 == 5503) {
                            class113.method623(false);
                            continue;
                        }
                        if (var607 == 5504) {
                            var2 -= 2;
                            class166.method1092(0, -90, field5669[var2], field5669[var2 + 1]);
                            continue;
                        }
                        if (var607 == 5505) {
                            field5669[var2++] = (int) class135.field1886 >> 3;
                            continue;
                        }
                        if (var607 == 5506) {
                            field5669[var2++] = (int) class276.field3893 >> 3;
                            continue;
                        }
                        if (var607 == 5507) {
                            class157.method1031((byte) -123);
                            continue;
                        }
                        if (var607 == 5508) {
                            class72.method421((byte) 87);
                            continue;
                        }
                        if (var607 == 5509) {
                            class272.method1729(-21453);
                            continue;
                        }
                        if (var607 == 5510) {
                            class105.method567((byte) 3);
                            continue;
                        }
                        if (var607 == 5511) {
                            var2--;
                            int var509 = field5669[var2];
                            int var510 = var509 >> 14 & 0x3FFF;
                            int var511 = var509 & 0x3FFF;
                            int var512 = var510 - class40.field427;
                            if (var512 < 0) {
                                var512 = 0;
                            } else if (var512 >= class279.field3935) {
                                var512 = class279.field3935;
                            }
                            int var513 = var511 - class217.field2975;
                            if (var513 < 0) {
                                var513 = 0;
                            } else if (var513 >= class164.field2287) {
                                var513 = class164.field2287;
                            }
                            class355.field5200 = var512 * 128 + 64;
                            class132.field1811 = var513 * 128 + 64;
                            class231.field3128 = 4;
                            continue;
                        }
                        if (var607 == 5512) {
                            class448.method2783(true);
                            continue;
                        }
                    } else if (var607 < 5700) {
                        if (var607 == 5600) {
                            var3 -= 2;
                            String var514 = field5674[var3];
                            String var515 = field5674[var3 + 1];
                            var2--;
                            int var516 = field5669[var2];
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0 && class207.field2814 == 0) {
                                class305.method1915(2, var514, var516, var515);
                            }
                            continue;
                        }
                        if (var607 == 5601) {
                            class238.method1519((byte) -83);
                            continue;
                        }
                        if (var607 == 5602) {
                            if (class248.field3363 == 0) {
                                class159.field2251 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5603) {
                            var2 -= 4;
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0 && class207.field2814 == 0) {
                                class244.method1539((byte) -109, field5669[var2 + 1], field5669[var2 + 2], field5669[var2], field5669[var2 + 3]);
                            }
                            continue;
                        }
                        if (var607 == 5604) {
                            var3--;
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0 && class207.field2814 == 0) {
                                class369.method2325(class190.method1215(-1, field5674[var3]), 0);
                            }
                            continue;
                        }
                        if (var607 == 5605) {
                            var3 -= 3;
                            var2 -= 7;
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0 && class207.field2814 == 0) {
                                class37.method218(106, class190.method1215(-1, field5674[var3]), field5669[var2 + 3], field5669[var2 + 4] == 1, field5674[var3 + 2], field5669[var2 + 1], field5674[var3 + 1], field5669[var2 + 2], field5669[var2], field5669[var2 + 5] == 1, field5669[var2 + 6] == 1);
                            }
                            continue;
                        }
                        if (var607 == 5606) {
                            if (class392.field5734 == 0) {
                                class430.field6238 = -2;
                            }
                            continue;
                        }
                        if (var607 == 5607) {
                            field5669[var2++] = class159.field2251;
                            continue;
                        }
                        if (var607 == 5608) {
                            field5669[var2++] = class135.field1894;
                            continue;
                        }
                        if (var607 == 5609) {
                            field5669[var2++] = class430.field6238;
                            continue;
                        }
                        if (var607 == 5610) {
                            for (int var517 = 0; var517 < 5; var517++) {
                                field5674[var3++] = class43.field532.length > var517 ? class342.method2191(class43.field532[var517], 77) : "";
                            }
                            class43.field532 = null;
                            continue;
                        }
                        if (var607 == 5611) {
                            field5669[var2++] = class123.field1639;
                            continue;
                        }
                    } else if (var607 < 6100) {
                        if (var607 == 6001) {
                            var2--;
                            int var518 = field5669[var2];
                            if (var518 < 1) {
                                var518 = 1;
                            }
                            if (var518 > 4) {
                                var518 = 4;
                            }
                            class287.field4044 = var518;
                            class115.method632(-30);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6002) {
                            var2--;
                            class246.method1553(126, field5669[var2] == 1);
                            class252.method1576(120);
                            class115.method632(123);
                            class119.method677(4);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6003) {
                            var2--;
                            class67.field763 = field5669[var2] == 1;
                            class119.method677(4);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6005) {
                            var2--;
                            class281.field3945 = field5669[var2] == 1;
                            class115.method632(-127);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6006) {
                            var2--;
                            class78.field885 = field5669[var2] == 1;
                            class218.field2991.method944(!class78.field885);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6007) {
                            var2--;
                            class318.field4509 = field5669[var2];
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6008) {
                            var2--;
                            class40.field424 = field5669[var2] == 1;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6009) {
                            var2--;
                            class420.field6046 = field5669[var2] == 1;
                            class115.method632(-82);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6010) {
                            var2--;
                            class41.field487 = field5669[var2] == 1;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6011) {
                            var2--;
                            int var519 = field5669[var2];
                            if (var519 < 0 || var519 > 2) {
                                var519 = 0;
                            }
                            class341.field5022 = var519;
                            class115.method632(126);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6012) {
                            var2--;
                            class216.field2943 = field5669[var2] == 1;
                            class176.method1163((byte) 111);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6014) {
                            var2--;
                            class307.field4399 = field5669[var2] == 1;
                            class115.method632(-63);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6015) {
                            var2--;
                            class25.field245 = field5669[var2] == 1;
                            class115.method632(-12);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6016) {
                            var2--;
                            int var520 = field5669[var2];
                            if (var520 < 0 || var520 > 2) {
                                var520 = 0;
                            }
                            class384.field5630 = var520;
                            class122.method690(17026);
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6017) {
                            var2--;
                            class159.field2255 = field5669[var2] == 1;
                            class25.method154(5);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6018) {
                            var2--;
                            int var521 = field5669[var2];
                            if (var521 < 0) {
                                var521 = 0;
                            }
                            if (var521 > 127) {
                                var521 = 127;
                            }
                            class351.field5129 = var521;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6019) {
                            var2--;
                            int var522 = field5669[var2];
                            if (var522 < 0) {
                                var522 = 0;
                            }
                            if (var522 > 255) {
                                var522 = 255;
                            }
                            if (class75.field834 != var522) {
                                if (class75.field834 == 0 && class423.field6072 != -1) {
                                    class8.method80(class423.field6072, false, class354.field5165, 0, -122, var522);
                                    class343.field5049 = false;
                                } else if (var522 == 0) {
                                    class260.method1624((byte) 50);
                                    class343.field5049 = false;
                                } else {
                                    class306.method1919(var522, false);
                                }
                                class75.field834 = var522;
                            }
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6020) {
                            var2--;
                            int var523 = field5669[var2];
                            if (var523 < 0) {
                                var523 = 0;
                            }
                            if (var523 > 127) {
                                var523 = 127;
                            }
                            class308.field4405 = var523;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6021) {
                            var2--;
                            class422.field6053 = field5669[var2] == 1;
                            class119.method677(4);
                            continue;
                        }
                        if (var607 == 6023) {
                            var2--;
                            int var524 = field5669[var2];
                            boolean var525 = false;
                            if (var524 < 0) {
                                var524 = 0;
                            }
                            if (var524 > 2) {
                                var524 = 2;
                            }
                            if (class343.field5053 < 96) {
                                var524 = 0;
                                var525 = true;
                            }
                            class119.method680(var524, 2);
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            field5669[var2++] = var525 ? 0 : 1;
                            continue;
                        }
                        if (var607 == 6024) {
                            var2--;
                            int var526 = field5669[var2];
                            if (var526 < 0 || var526 > 2) {
                                var526 = 0;
                            }
                            class166.field2336 = var526;
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6025) {
                            var2--;
                            int var527 = field5669[var2];
                            if (var527 < 0 || var527 > 3) {
                                var527 = 0;
                            }
                            class169.field2373 = var527;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                        if (var607 == 6027) {
                            var2--;
                            int var528 = field5669[var2];
                            if (var528 < 0 || var528 > 1) {
                                var528 = 0;
                            }
                            class262.method1644(2, var528 == 1);
                            continue;
                        }
                        if (var607 == 6028) {
                            var2--;
                            class8.field97 = field5669[var2] != 0;
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6029) {
                            var2--;
                            class318.field4509 = field5669[var2];
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6030) {
                            var2--;
                            class436.field6388 = field5669[var2] != 0;
                            class193.method1232(27875, class323.field4554);
                            class115.method632(19);
                            continue;
                        }
                        if (var607 == 6031) {
                            var2--;
                            int var529 = field5669[var2];
                            if (var529 < 0 || var529 > 3) {
                                var529 = 2;
                            }
                            client.method1065((byte) -77, var529);
                            continue;
                        }
                        if (var607 == 6032) {
                            var2--;
                            int var530 = field5669[var2];
                            if (var530 < 0 || var530 > 3) {
                                var530 = 2;
                            }
                            class264.field3709 = var530;
                            class193.method1232(27875, class323.field4554);
                            class174.field2418 = false;
                            continue;
                        }
                    } else if (var607 < 6200) {
                        if (var607 == 6101) {
                            field5669[var2++] = class287.field4044;
                            continue;
                        }
                        if (var607 == 6102) {
                            field5669[var2++] = class257.method1613(-126) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6103) {
                            field5669[var2++] = class67.field763 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6105) {
                            field5669[var2++] = class281.field3945 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6106) {
                            field5669[var2++] = class78.field885 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6107) {
                            field5669[var2++] = class318.field4509;
                            continue;
                        }
                        if (var607 == 6108) {
                            field5669[var2++] = class40.field424 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6109) {
                            field5669[var2++] = class420.field6046 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6110) {
                            field5669[var2++] = class41.field487 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6111) {
                            field5669[var2++] = class341.field5022;
                            continue;
                        }
                        if (var607 == 6112) {
                            field5669[var2++] = class216.field2943 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6114) {
                            field5669[var2++] = class307.field4399 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6115) {
                            field5669[var2++] = class25.field245 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6116) {
                            field5669[var2++] = class384.field5630;
                            continue;
                        }
                        if (var607 == 6117) {
                            field5669[var2++] = class159.field2255 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6118) {
                            field5669[var2++] = class351.field5129;
                            continue;
                        }
                        if (var607 == 6119) {
                            field5669[var2++] = class75.field834;
                            continue;
                        }
                        if (var607 == 6120) {
                            field5669[var2++] = class308.field4405;
                            continue;
                        }
                        if (var607 == 6121) {
                            field5669[var2++] = class218.field2991.method988() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6123) {
                            field5669[var2++] = class85.method462(-2048);
                            continue;
                        }
                        if (var607 == 6124) {
                            field5669[var2++] = class166.field2336;
                            continue;
                        }
                        if (var607 == 6125) {
                            field5669[var2++] = class169.field2373;
                            continue;
                        }
                        if (var607 == 6126) {
                            field5669[var2++] = class218.field2991.method975() ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6127) {
                            field5669[var2++] = class73.field820 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6128) {
                            field5669[var2++] = class8.field97 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6129) {
                            field5669[var2++] = class318.field4509;
                            continue;
                        }
                        if (var607 == 6130) {
                            field5669[var2++] = class436.field6388 ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6131) {
                            field5669[var2++] = class341.field5018;
                            continue;
                        }
                        if (var607 == 6132) {
                            field5669[var2++] = class264.field3709;
                            continue;
                        }
                        if (var607 == 6133) {
                            field5669[var2++] = class378.field5553 == 1 || class378.field5553 == 4 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6300) {
                        if (var607 == 6200) {
                            var2 -= 2;
                            class33.field308 = (short) field5669[var2];
                            if (class33.field308 <= 0) {
                                class33.field308 = 256;
                            }
                            class436.field6392 = (short) field5669[var2 + 1];
                            if (class436.field6392 <= 0) {
                                class436.field6392 = 205;
                            }
                            continue;
                        }
                        if (var607 == 6201) {
                            var2 -= 2;
                            class170.field2383 = (short) field5669[var2];
                            if (class170.field2383 <= 0) {
                                class170.field2383 = 256;
                            }
                            class308.field4410 = (short) field5669[var2 + 1];
                            if (class308.field4410 <= 0) {
                                class308.field4410 = 320;
                            }
                            continue;
                        }
                        if (var607 == 6202) {
                            var2 -= 4;
                            class235.field3197 = (short) field5669[var2];
                            if (class235.field3197 <= 0) {
                                class235.field3197 = 1;
                            }
                            class369.field5413 = (short) field5669[var2 + 1];
                            if (class369.field5413 <= 0) {
                                class369.field5413 = 32767;
                            } else if (class369.field5413 < class235.field3197) {
                                class369.field5413 = class235.field3197;
                            }
                            class344.field5062 = (short) field5669[var2 + 2];
                            if (class344.field5062 <= 0) {
                                class344.field5062 = 1;
                            }
                            class10.field118 = (short) field5669[var2 + 3];
                            if (class10.field118 <= 0) {
                                class10.field118 = 32767;
                            } else if (class10.field118 < class344.field5062) {
                                class10.field118 = class344.field5062;
                            }
                            continue;
                        }
                        if (var607 == 6203) {
                            class240.method1532(class56.field631.field1552, -7509, false, class56.field631.field1498, 0, 0);
                            field5669[var2++] = class220.field3020;
                            field5669[var2++] = class34.field336;
                            continue;
                        }
                        if (var607 == 6204) {
                            field5669[var2++] = class170.field2383;
                            field5669[var2++] = class308.field4410;
                            continue;
                        }
                        if (var607 == 6205) {
                            field5669[var2++] = class33.field308;
                            field5669[var2++] = class436.field6392;
                            continue;
                        }
                    } else if (var607 < 6400) {
                        if (var607 == 6300) {
                            field5669[var2++] = (int) (class203.method1299((byte) 5) / 60000L);
                            continue;
                        }
                        if (var607 == 6301) {
                            field5669[var2++] = (int) (class203.method1299((byte) 5) / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6302) {
                            var2 -= 3;
                            int var531 = field5669[var2];
                            int var532 = field5669[var2 + 1];
                            int var533 = field5669[var2 + 2];
                            field5671.clear();
                            field5671.set(11, 12);
                            field5671.set(var533, var532, var531);
                            field5669[var2++] = (int) (field5671.getTime().getTime() / 86400000L) - 11745;
                            continue;
                        }
                        if (var607 == 6303) {
                            field5671.clear();
                            field5671.setTime(new Date(class203.method1299((byte) 5)));
                            field5669[var2++] = field5671.get(1);
                            continue;
                        }
                        if (var607 == 6304) {
                            var2--;
                            int var534 = field5669[var2];
                            boolean var535 = true;
                            if (var534 < 0) {
                                var535 = (var534 + 1) % 4 == 0;
                            } else if (var534 < 1582) {
                                var535 = var534 % 4 == 0;
                            } else if (var534 % 4 != 0) {
                                var535 = false;
                            } else if (var534 % 100 != 0) {
                                var535 = true;
                            } else if (var534 % 400 != 0) {
                                var535 = false;
                            }
                            field5669[var2++] = var535 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6500) {
                        if (var607 == 6405) {
                            field5669[var2++] = class334.method2150(-118) ? 1 : 0;
                            continue;
                        }
                        if (var607 == 6406) {
                            field5669[var2++] = class300.method1894(12422) ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6600) {
                        if (var607 == 6500) {
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0) {
                                field5669[var2++] = class38.method232((byte) 70) == -1 ? 0 : 1;
                                continue;
                            }
                            field5669[var2++] = 1;
                            continue;
                        }
                        if (var607 == 6501) {
                            class175 var536 = class173.method1141((byte) 115);
                            if (var536 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = 0;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var536.field2431;
                                field5669[var2++] = var536.field769;
                                field5674[var3++] = var536.field2433;
                                class139 var537 = var536.method1156(-1);
                                field5669[var2++] = var537.field1974;
                                field5674[var3++] = var537.field1973;
                                field5669[var2++] = var536.field775;
                                field5669[var2++] = var536.field2439;
                            }
                            continue;
                        }
                        if (var607 == 6502) {
                            class175 var538 = class218.method1428(-125);
                            if (var538 == null) {
                                field5669[var2++] = -1;
                                field5669[var2++] = 0;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var538.field2431;
                                field5669[var2++] = var538.field769;
                                field5674[var3++] = var538.field2433;
                                class139 var539 = var538.method1156(-1);
                                field5669[var2++] = var539.field1974;
                                field5674[var3++] = var539.field1973;
                                field5669[var2++] = var538.field775;
                                field5669[var2++] = var538.field2439;
                            }
                            continue;
                        }
                        if (var607 == 6503) {
                            var2--;
                            int var540 = field5669[var2];
                            if (class105.field1191 == 10 && class351.field5127 == 0 && class248.field3363 == 0 && class392.field5734 == 0) {
                                field5669[var2++] = class198.method1266(-8868, var540) ? 1 : 0;
                                continue;
                            }
                            field5669[var2++] = 0;
                            continue;
                        }
                        if (var607 == 6504) {
                            var2--;
                            class21.field221 = field5669[var2];
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6505) {
                            field5669[var2++] = class21.field221;
                            continue;
                        }
                        if (var607 == 6506) {
                            var2--;
                            int var541 = field5669[var2];
                            class175 var542 = class327.method2012(var541, false);
                            if (var542 == null) {
                                field5669[var2++] = -1;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5674[var3++] = "";
                                field5669[var2++] = 0;
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = var542.field769;
                                field5674[var3++] = var542.field2433;
                                class139 var543 = var542.method1156(-1);
                                field5669[var2++] = var543.field1974;
                                field5674[var3++] = var543.field1973;
                                field5669[var2++] = var542.field775;
                                field5669[var2++] = var542.field2439;
                            }
                            continue;
                        }
                        if (var607 == 6507) {
                            var2 -= 4;
                            int var544 = field5669[var2];
                            boolean var545 = field5669[var2 + 1] == 1;
                            int var546 = field5669[var2 + 2];
                            boolean var547 = field5669[var2 + 3] == 1;
                            class384.method2460(var546, var545, var544, var547, 0);
                            continue;
                        }
                        if (var607 == 6508) {
                            class344.method2206((byte) -74);
                            continue;
                        }
                        if (var607 == 6509) {
                            if (class105.field1191 == 10) {
                                var2--;
                                if (field5669[var2] == 1) {
                                    if (class180.field2475 == null) {
                                        class180.field2475 = new class197();
                                    }
                                } else if (class180.field2475 != null) {
                                    class180.field2475.method1262(16);
                                    class180.field2475 = null;
                                }
                            }
                            continue;
                        }
                    } else if (var607 < 6700) {
                        if (var607 == 6600) {
                            var2--;
                            class291.field4173 = field5669[var2] == 1;
                            class193.method1232(27875, class323.field4554);
                            continue;
                        }
                        if (var607 == 6601) {
                            field5669[var2++] = class291.field4173 ? 1 : 0;
                            continue;
                        }
                    } else if (var607 < 6800 && class228.field3117 == 2) {
                        if (var607 == 6700) {
                            int var548 = class396.field5783.method1208(-111);
                            if (class424.field6086 != -1) {
                                var548++;
                            }
                            field5669[var2++] = var548;
                            continue;
                        }
                        if (var607 == 6701) {
                            var2--;
                            int var549 = field5669[var2];
                            if (class424.field6086 != -1) {
                                if (var549 == 0) {
                                    field5669[var2++] = class424.field6086;
                                    continue;
                                }
                                var549--;
                            }
                            class201 var550 = (class201) class396.field5783.method1212(-46);
                            while (var549-- > 0) {
                                var550 = (class201) class396.field5783.method1207(false);
                            }
                            field5669[var2++] = var550.field2776;
                            continue;
                        }
                        if (var607 == 6702) {
                            var2--;
                            int var551 = field5669[var2];
                            if (class224.field3054[var551] == null) {
                                field5674[var3++] = "";
                            } else {
                                String var552 = class224.field3054[var551][0].field1459;
                                if (var552 == null) {
                                    field5674[var3++] = "";
                                } else {
                                    field5674[var3++] = var552.substring(0, var552.indexOf(58));
                                }
                            }
                            continue;
                        }
                        if (var607 == 6703) {
                            var2--;
                            int var553 = field5669[var2];
                            if (class224.field3054[var553] == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = class224.field3054[var553].length;
                            }
                            continue;
                        }
                        if (var607 == 6704) {
                            var2 -= 2;
                            int var554 = field5669[var2];
                            int var555 = field5669[var2 + 1];
                            if (class224.field3054[var554] == null) {
                                field5674[var3++] = "";
                            } else {
                                String var556 = class224.field3054[var554][var555].field1459;
                                if (var556 == null) {
                                    field5674[var3++] = "";
                                } else {
                                    field5674[var3++] = var556;
                                }
                            }
                            continue;
                        }
                        if (var607 == 6705) {
                            var2 -= 2;
                            int var557 = field5669[var2];
                            int var558 = field5669[var2 + 1];
                            if (class224.field3054[var557] == null) {
                                field5669[var2++] = 0;
                            } else {
                                field5669[var2++] = class224.field3054[var557][var558].field1541;
                            }
                            continue;
                        }
                        if (var607 == 6706) {
                            continue;
                        }
                        if (var607 == 6707) {
                            var2 -= 3;
                            int var559 = field5669[var2];
                            int var560 = field5669[var2 + 1];
                            int var561 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 1, var559 << 16 | var560, var561);
                            continue;
                        }
                        if (var607 == 6708) {
                            var2 -= 3;
                            int var562 = field5669[var2];
                            int var563 = field5669[var2 + 1];
                            int var564 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 2, var562 << 16 | var563, var564);
                            continue;
                        }
                        if (var607 == 6709) {
                            var2 -= 3;
                            int var565 = field5669[var2];
                            int var566 = field5669[var2 + 1];
                            int var567 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 3, var565 << 16 | var566, var567);
                            continue;
                        }
                        if (var607 == 6710) {
                            var2 -= 3;
                            int var568 = field5669[var2];
                            int var569 = field5669[var2 + 1];
                            int var570 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 4, var568 << 16 | var569, var570);
                            continue;
                        }
                        if (var607 == 6711) {
                            var2 -= 3;
                            int var571 = field5669[var2];
                            int var572 = field5669[var2 + 1];
                            int var573 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 5, var571 << 16 | var572, var573);
                            continue;
                        }
                        if (var607 == 6712) {
                            var2 -= 3;
                            int var574 = field5669[var2];
                            int var575 = field5669[var2 + 1];
                            int var576 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 6, var574 << 16 | var575, var576);
                            continue;
                        }
                        if (var607 == 6713) {
                            var2 -= 3;
                            int var577 = field5669[var2];
                            int var578 = field5669[var2 + 1];
                            int var579 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 7, var577 << 16 | var578, var579);
                            continue;
                        }
                        if (var607 == 6714) {
                            var2 -= 3;
                            int var580 = field5669[var2];
                            int var581 = field5669[var2 + 1];
                            int var582 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 8, var580 << 16 | var581, var582);
                            continue;
                        }
                        if (var607 == 6715) {
                            var2 -= 3;
                            int var583 = field5669[var2];
                            int var584 = field5669[var2 + 1];
                            int var585 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 9, var583 << 16 | var584, var585);
                            continue;
                        }
                        if (var607 == 6716) {
                            var2 -= 3;
                            int var586 = field5669[var2];
                            int var587 = field5669[var2 + 1];
                            int var588 = field5669[var2 + 2];
                            class134.method801("", (byte) -31, 10, var586 << 16 | var587, var588);
                            continue;
                        }
                        if (var607 == 6717) {
                            var2 -= 3;
                            int var589 = field5669[var2];
                            int var590 = field5669[var2 + 1];
                            int var591 = field5669[var2 + 2];
                            class119 var592 = class354.method2262(-128, var591, var589 << 16 | var590);
                            class428.method2664(-1);
                            class3 var593 = client.method1076(var592);
                            class383.method2455((byte) -5, var592.field1473, var593.method27(-6936), var592.field1514, var591, var593.field36, var589 << 16 | var590);
                            continue;
                        }
                    } else if (var607 < 6900) {
                        if (var607 == 6800) {
                            var2--;
                            int var594 = field5669[var2];
                            class290 var595 = class117.method661((byte) 83, var594);
                            if (var595.field4142 == null) {
                                field5674[var3++] = "";
                            } else {
                                field5674[var3++] = var595.field4142;
                            }
                            continue;
                        }
                        if (var607 == 6801) {
                            var2--;
                            int var596 = field5669[var2];
                            class290 var597 = class117.method661((byte) 61, var596);
                            field5669[var2++] = var597.field4123;
                            continue;
                        }
                        if (var607 == 6802) {
                            var2--;
                            int var598 = field5669[var2];
                            class290 var599 = class117.method661((byte) 30, var598);
                            field5669[var2++] = var599.field4128;
                            continue;
                        }
                        if (var607 == 6803) {
                            var2--;
                            int var600 = field5669[var2];
                            class290 var601 = class117.method661((byte) 98, var600);
                            field5669[var2++] = var601.field4144;
                            continue;
                        }
                    }
                } else {
                    class119 var75;
                    if (var607 >= 2000) {
                        var607 -= 1000;
                        var2--;
                        var75 = class179.method1170(field5669[var2], 818041328);
                    } else {
                        var75 = var37 ? field5665 : field5668;
                    }
                    if (var607 == 1300) {
                        var2--;
                        int var76 = field5669[var2] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var3--;
                            var75.method682(field5674[var3], 0, var76);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var607 == 1301) {
                        var2 -= 2;
                        int var77 = field5669[var2];
                        int var78 = field5669[var2 + 1];
                        var75.field1504 = class354.method2262(-128, var78, var77);
                        continue;
                    }
                    if (var607 == 1302) {
                        var2--;
                        var75.field1563 = field5669[var2] == 1;
                        continue;
                    }
                    if (var607 == 1303) {
                        var2--;
                        var75.field1596 = field5669[var2];
                        continue;
                    }
                    if (var607 == 1304) {
                        var2--;
                        var75.field1469 = field5669[var2];
                        continue;
                    }
                    if (var607 == 1305) {
                        var3--;
                        var75.field1488 = field5674[var3];
                        continue;
                    }
                    if (var607 == 1306) {
                        var3--;
                        var75.field1579 = field5674[var3];
                        continue;
                    }
                    if (var607 == 1307) {
                        var75.field1600 = null;
                        continue;
                    }
                    if (var607 == 1308) {
                        var2--;
                        var75.field1514 = field5669[var2];
                        var2--;
                        var75.field1473 = field5669[var2];
                        continue;
                    }
                    if (var607 == 1309) {
                        var2--;
                        int var79 = field5669[var2];
                        var2--;
                        int var80 = field5669[var2];
                        if (var80 >= 1 && var80 <= 10) {
                            var75.method684(var79, var80 - 1, (byte) -32);
                        }
                        continue;
                    }
                    if (var607 == 1310) {
                        var3--;
                        var75.field1528 = field5674[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var606) {
            if (arg0.field3348 == null) {
                class411.method2578(var606, "CS2 - scr:" + arg0.field5248 + " op:" + var7, (byte) -68);
            } else {
                class413.method2589("Clientscript error in: " + arg0.field3348, 0);
                StringBuffer var603 = new StringBuffer(30);
                var603.append("Clientscript error in: ").append(arg0.field3348).append("\n");
                for (int var604 = field5677 - 1; var604 >= 0; var604--) {
                    var603.append("via: ").append(field5672[var604].field4359.field3348).append("\n");
                }
                var603.append("Op: ").append(var7).append("\n");
                String var605 = var606.getMessage();
                if (var605 != null && var605.length() > 0) {
                    var603.append("Message: ").append(var605).append("\n");
                }
                class411.method2578(var606, var603.toString(), (byte) -68);
                class400.method2531(var603.toString(), (byte) 113);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldj;)V", line = 6811)
    public static final void method2471(class191 arg0) {
        method2473(arg0, 200000);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 6817)
    public static final void method2472(int arg0) {
        if (arg0 == -1 || !class344.method2202((byte) -118, arg0)) {
            return;
        }
        class119[] var1 = class224.field3054[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class119 var3 = var1[var2];
            if (var3.field1466 != null) {
                class191 var4 = new class191();
                var4.field2605 = var3;
                var4.field2602 = var3.field1466;
                method2473(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldj;I)V", line = 6853)
    private static final void method2473(class191 arg0, int arg1) {
        Object[] var2 = arg0.field2602;
        int var3 = (Integer) var2[0];
        class246 var4 = class55.method320(var3, (byte) 29);
        if (var4 == null) {
            return;
        }
        field5675 = new int[var4.field3336];
        int var5 = 0;
        field5656 = new String[var4.field3340];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2614;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2609;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2605 == null ? -1 : arg0.field2605.field1424;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2608;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2605 == null ? -1 : arg0.field2605.field1495;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2603 == null ? -1 : arg0.field2603.field1424;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2603 == null ? -1 : arg0.field2603.field1495;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2611;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2616;
                }
                field5675[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2600;
                }
                field5656[var6++] = var9;
            }
        }
        method2470(var4, arg1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V", line = 6940)
    public static final void method2474(int arg0, int arg1, int arg2) {
        class246 var3 = class146.method867(arg2, 262144, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field5675 = new int[var3.field3336];
        field5656 = new String[var3.field3340];
        if (var3.field3339 == 15 || var3.field3339 == 17 || var3.field3339 == 16) {
            int var4 = 0;
            int var5 = 0;
            if (class38.field390 != null) {
                var4 = class38.field390.field1448;
                var5 = class38.field390.field1562;
            }
            field5675[0] = class57.field654 - var4;
            field5675[1] = class48.field562 - var5;
        }
        method2470(var3, 200000);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "()V", line = 6975)
    public static void method2475() {
        field5675 = null;
        field5656 = null;
        field5676 = null;
        field5673 = null;
        field5669 = null;
        field5674 = null;
        field5672 = null;
        field5668 = null;
        field5665 = null;
        field5658 = null;
        field5671 = null;
        field5679 = null;
        field5678 = null;
        field5680 = null;
    }
}
