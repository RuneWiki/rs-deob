import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class98 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1622 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lik;")
    public static class259 field1623 = new class259(20);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Ltd;")
    public static class241 field1629;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lja;")
    public static class64 field1626;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V", line = 8)
    public static void method711(boolean arg0) {
        if (!arg0) {
            field1622 = -36;
        }
        field1626 = null;
        field1629 = null;
        field1623 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V", line = 20)
    public static final void method712(int arg0, boolean arg1) {
        field1628++;
        if (arg0 != 2957) {
            method711(true);
        }
        if (arg1) {
            if (class122.field1950 != -1) {
                class185.method1386((byte) -128, class122.field1950);
            }
            for (class224 var2 = (class224) class268.field4148.method841(0); var2 != null; var2 = (class224) class268.field4148.method842((byte) -40)) {
                class259.method1840(var2, true, -108);
            }
            class122.field1950 = -1;
            class268.field4148 = new class110(8);
            class160.method1194((byte) -103);
            class122.field1950 = class212.field3380;
            class67.method508(false, 1);
            class26.method175((byte) -113);
            class8.method63(class122.field1950, 2000000);
        }
        class273.field4240 = -1;
        class212.method1541(class123.field1958, -10658);
        class19.field356 = new class30();
        class19.field356.field1369 = 3000;
        class19.field356.field1442 = 3000;
        if (!class265.field4126) {
            class125.method945((byte) 87, class210.field3356);
            class320.method2196(10, 0);
            return;
        }
        if (class62.field960 == 2) {
            class312.field4904 = class122.field1947 << 7;
            class140.field2223 = class168.field2614 << 7;
        } else {
            class301.method2095(-26846);
        }
        class232.method1678(-46);
        class139.method1058(17398);
        class320.method2196(28, 0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 88)
    public static final void method713(byte arg0) {
        class184.method1385();
        field1624++;
        class54.field858 = new class321[7];
        class54.field858[1] = new class283();
        class54.field858[2] = new class112();
        if (arg0 > -22) {
            field1623 = (class259) null;
        }
        class54.field858[3] = new class113();
        class54.field858[4] = new class299();
        class54.field858[5] = new class289();
        class54.field858[6] = new class287();
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 113)
    public static final void method714() {
        class294.field4638 = 0;
        label194: for (int var0 = 0; var0 < class159.field2508; var0++) {
            class94 var1 = class311.field4891[var0];
            if (class324.field5033 != null) {
                for (int var2 = 0; var2 < class324.field5033.length; var2++) {
                    if (class324.field5033[var2] != -1000000 && (var1.field1540 <= class324.field5033[var2] || var1.field1550 <= class324.field5033[var2]) && (var1.field1548 <= class125.field1992[var2] || var1.field1549 <= class125.field1992[var2]) && (var1.field1548 >= class298.field4705[var2] || var1.field1549 >= class298.field4705[var2]) && (var1.field1547 <= class89.field1447[var2] || var1.field1537 <= class89.field1447[var2]) && (var1.field1547 >= class37.field670[var2] || var1.field1537 >= class37.field670[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1542 == 1) {
                int var3 = var1.field1532 + class258.field4008 - class151.field2419;
                if (var3 >= 0 && var3 <= class258.field4008 + class258.field4008) {
                    int var4 = var1.field1536 + class258.field4008 - class301.field4744;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1528 + class258.field4008 - class301.field4744;
                    if (var5 > class258.field4008 + class258.field4008) {
                        var5 = class258.field4008 + class258.field4008;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class87.field1329[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class31.field533 - var1.field1548;
                        if (var7 > 32) {
                            var1.field1551 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1551 = 2;
                            var7 = -var7;
                        }
                        var1.field1545 = (var1.field1547 - class236.field3717 << 8) / var7;
                        var1.field1546 = (var1.field1537 - class236.field3717 << 8) / var7;
                        var1.field1543 = (var1.field1540 - class203.field3223 << 8) / var7;
                        var1.field1539 = (var1.field1550 - class203.field3223 << 8) / var7;
                        class236.field3716[class294.field4638++] = var1;
                    }
                }
            } else if (var1.field1542 == 2) {
                int var8 = var1.field1536 + class258.field4008 - class301.field4744;
                if (var8 >= 0 && var8 <= class258.field4008 + class258.field4008) {
                    int var9 = var1.field1532 + class258.field4008 - class151.field2419;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1557 + class258.field4008 - class151.field2419;
                    if (var10 > class258.field4008 + class258.field4008) {
                        var10 = class258.field4008 + class258.field4008;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class87.field1329[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class236.field3717 - var1.field1547;
                        if (var12 > 32) {
                            var1.field1551 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1551 = 4;
                            var12 = -var12;
                        }
                        var1.field1534 = (var1.field1548 - class31.field533 << 8) / var12;
                        var1.field1554 = (var1.field1549 - class31.field533 << 8) / var12;
                        var1.field1543 = (var1.field1540 - class203.field3223 << 8) / var12;
                        var1.field1539 = (var1.field1550 - class203.field3223 << 8) / var12;
                        class236.field3716[class294.field4638++] = var1;
                    }
                }
            } else if (var1.field1542 == 4) {
                int var13 = var1.field1540 - class203.field3223;
                if (var13 > 128) {
                    int var14 = var1.field1536 + class258.field4008 - class301.field4744;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1528 + class258.field4008 - class301.field4744;
                    if (var15 > class258.field4008 + class258.field4008) {
                        var15 = class258.field4008 + class258.field4008;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1532 + class258.field4008 - class151.field2419;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1557 + class258.field4008 - class151.field2419;
                        if (var17 > class258.field4008 + class258.field4008) {
                            var17 = class258.field4008 + class258.field4008;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class87.field1329[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1551 = 5;
                            var1.field1534 = (var1.field1548 - class31.field533 << 8) / var13;
                            var1.field1554 = (var1.field1549 - class31.field533 << 8) / var13;
                            var1.field1545 = (var1.field1547 - class236.field3717 << 8) / var13;
                            var1.field1546 = (var1.field1537 - class236.field3717 << 8) / var13;
                            class236.field3716[class294.field4638++] = var1;
                        }
                    }
                }
            }
        }
    }
}
