import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class276 {

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public int field3577 = 2048;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public int field3576 = 0;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public int field3572 = 2048;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field3569 = 0;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lhq;")
    public static class365 field3570 = new class365(16);

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field3580 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Luo;")
    public static class118 field3581;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lc;")
    public static class436 field3574;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[Lcd;")
    public static class58[] field3579;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method1733(byte arg0) {
        field3570 = null;
        field3579 = null;
        if (arg0 >= 47) {
            field3581 = null;
            field3574 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public static final void method1734(byte arg0) {
        class362.field4903 = new class453[class365.field4965.method1793(0)][];
        field3568++;
        if (arg0 != 92) {
            field3574 = null;
        }
        class184.field2135 = new boolean[class365.field4965.method1793(0)];
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lbg;III)V")
    private final void method1735(class242 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 1) {
            method1733((byte) -121);
        }
        if (arg3 == 1) {
            this.field3576 = arg0.method1563(-128);
        } else if (arg3 == 2) {
            this.field3572 = arg0.method1587((byte) -102);
        } else if (arg3 == 3) {
            this.field3577 = arg0.method1587((byte) -102);
        } else if (arg3 == 4) {
            this.field3569 = arg0.method1582(false);
        }
        field3578++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILbg;I)V")
    public final void method1736(int arg0, class242 arg1, int arg2) {
        field3575++;
        if (arg0 >= -86) {
            field3579 = null;
        }
        while (true) {
            int var4 = arg1.method1563(-128);
            if (var4 == 0) {
                return;
            }
            this.method1735(arg1, 1, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Z")
    public static final boolean method1737(int arg0, int arg1) {
        if (arg0 != 2) {
            method1733((byte) -105);
        }
        field3566++;
        if (arg1 == 3 || arg1 == 9 || arg1 == 51 || arg1 == 17 || arg1 == 1002) {
            return true;
        } else {
            return arg1 == 44 || arg1 == 1011;
        }
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
    public static final void method1738(byte arg0) {
        field3573++;
        class67.method390(false, 0);
        class3.field26 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class126.field1411.length; var2++) {
            if (class412.field5671[var2] != -1 && class126.field1411[var2] == null) {
                class126.field1411[var2] = class335.field4572.method1794(arg0 + 5970, class412.field5671[var2], 0);
                if (class126.field1411[var2] == null) {
                    class3.field26++;
                    var1 = false;
                }
            }
            if (class203.field2385[var2] != -1 && class208.field2537[var2] == null) {
                class208.field2537[var2] = class335.field4572.method1792(class244.field3251[var2], 0, class203.field2385[var2], 10033);
                if (class208.field2537[var2] == null) {
                    var1 = false;
                    class3.field26++;
                }
            }
            if (class103.field1205[var2] != -1 && class31.field345[var2] == null) {
                class31.field345[var2] = class335.field4572.method1794(arg0 + 5970, class103.field1205[var2], 0);
                if (class31.field345[var2] == null) {
                    var1 = false;
                    class3.field26++;
                }
            }
            if (class352.field4796[var2] != -1 && class431.field5881[var2] == null) {
                class431.field5881[var2] = class335.field4572.method1794(5860, class352.field4796[var2], 0);
                if (class431.field5881[var2] == null) {
                    class3.field26++;
                    var1 = false;
                }
            }
            if (class325.field4337 != null && class262.field3375[var2] == null && class325.field4337[var2] != -1) {
                class262.field3375[var2] = class335.field4572.method1792(class244.field3251[var2], 0, class325.field4337[var2], 10033);
                if (class262.field3375[var2] == null) {
                    var1 = false;
                    class3.field26++;
                }
            }
        }
        if (class234.field3075 == null) {
            if (class112.field1312 == null || !class33.field365.method1801(arg0 ^ 0xFFFF897B, class112.field1312.field2301 + "_staticelements")) {
                class234.field3075 = new class392(0);
            } else if (class33.field365.method1818((byte) 48, class112.field1312.field2301 + "_staticelements")) {
                class234.field3075 = class301.method1909(class357.field4843, 91, class112.field1312.field2301 + "_staticelements", class33.field365);
            } else {
                var1 = false;
                class3.field26++;
            }
        }
        if (!var1) {
            class303.field4070 = 1;
            return;
        }
        class374.field5072 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class126.field1411.length; var4++) {
            byte[] var20 = class208.field2537[var4];
            if (var20 != null) {
                int var21 = (class358.field4867[var4] >> 8) * 64 - class278.field3608;
                int var22 = (class358.field4867[var4] & 0xFF) * 64 - class129.field1432;
                if (class383.field5241) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class381.method2369(44, var20, var22, var21);
            }
            byte[] var23 = class431.field5881[var4];
            if (var23 != null) {
                int var24 = (class358.field4867[var4] >> 8) * 64 - class278.field3608;
                int var25 = (class358.field4867[var4] & 0xFF) * 64 - class129.field1432;
                if (class383.field5241) {
                    var24 = 10;
                    var25 = 10;
                }
                var3 &= class381.method2369(arg0 + 142, var23, var25, var24);
            }
        }
        if (!var3) {
            class303.field4070 = 2;
            return;
        }
        if (class303.field4070 != 0) {
            class190.method1179(0, class72.field894.method434(class373.field5057, arg0 - 8082) + "<br>(100%)", true, class55.field636);
        }
        class94.method589(-118);
        if (arg0 != -110) {
            return;
        }
        class290.method1846(arg0 ^ 0x12);
        boolean var5 = false;
        if (class267.field3454.method783() && class183.field2125) {
            for (int var6 = 0; var6 < class126.field1411.length; var6++) {
                if (class431.field5881[var6] != null || class31.field345[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class20.field211) {
            var7 = class268.field3469[class6.field49];
        } else {
            var7 = class130.field1452[class6.field49];
        }
        if (class267.field3454.method692()) {
            var7++;
        }
        class403.method2519(4, class22.field232, class196.field2329, var7, var5, class267.field3454.method788() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class156.field1815[var8].method2313(arg0 + 64);
        }
        class333.method2134(arg0 + 135);
        class298.method1894(arg0 + 6975, false);
        class240.method1533((byte) 100);
        class94.method589(arg0 ^ 0x1E);
        System.gc();
        class67.method390(true, 0);
        class296.method1882((byte) -39, 4, false);
        int[][] var9 = null;
        if (!class383.field5241) {
            class303.method1926(false, arg0 ^ 0xFFFFFF95);
            class434.method2651((byte) 28, class143.field1684.field2480[0] >> 3, class143.field1684.field2482[0] >> 3);
            class141.method912(true);
            class310.method1962(4, false, class267.field3454, -29271, (int[][]) null);
            var9 = class226.field2868[0];
            class67.method390(true, 0);
            class118.method691(-5959, false);
            if (class262.field3375 != null) {
                class108.method644((byte) -65);
            }
        }
        if (class383.field5241) {
            class15.method87(false, (byte) 47);
            class434.method2651((byte) 28, class143.field1684.field2480[0] >> 3, class143.field1684.field2482[0] >> 3);
            class141.method912(true);
            class310.method1962(4, false, class267.field3454, -29271, (int[][]) null);
            var9 = class226.field2868[0];
            class67.method390(true, 0);
            class369.method2327(95, false);
        }
        class290.method1846(-126);
        class67.method390(true, arg0 ^ 0xFFFFFF92);
        class383.method2388(class156.field1815, 4, class267.field3454, (class279) null, false, 99);
        class381.method2370(2, class267.field3454, 4);
        class67.method390(true, 0);
        int var10 = class421.field5777;
        if (var10 > class43.field513) {
            var10 = class43.field513;
        }
        if (var10 < (class43.field513 - 1)) {
            var10 = class43.field513 - 1;
        }
        if (class98.method602(65280)) {
            class168.method1072(0);
        } else {
            class168.method1072(var10);
        }
        class218.method1323((byte) -51);
        if (var5) {
            class318.method1992(true);
            class296.method1882((byte) -97, 1, true);
            if (!class383.field5241) {
                class303.method1926(true, 68);
                class310.method1962(1, true, class267.field3454, -29271, var9);
                class67.method390(true, 0);
                class118.method691(-5959, true);
                class381.method2370(arg0 ^ 0xFFFFFF90, class267.field3454, 1);
            }
            if (class383.field5241) {
                class15.method87(true, (byte) 47);
                class310.method1962(1, true, class267.field3454, -29271, var9);
                class67.method390(true, arg0 + 110);
                class369.method2327(122, true);
            }
            class290.method1846(arg0 ^ 0x10);
            class67.method390(true, 0);
            class383.method2388(class156.field1815, 1, class267.field3454, class219.field2709[0], true, arg0 ^ 0x39);
            class381.method2370(arg0 ^ 0xFFFFFF90, class267.field3454, 1);
            class67.method390(true, arg0 ^ 0xFFFFFF92);
            class218.method1323((byte) -75);
            class318.method1992(false);
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class22.field232; var18++) {
                for (int var19 = 0; var19 < class196.field2329; var19++) {
                    class405.method2523(var11, var18, var19, (byte) -27);
                }
            }
        }
        class296.method1880(true);
        class94.method589(-128);
        class32.method213(24277);
        class290.method1846(-126);
        class197.field2333 = false;
        class344.method2190(-26568);
        if (class167.field1942 != null && class181.field2107 != null && class174.field2017 == 25) {
            class376.field5087++;
            class427.field5837.method2162(false, 73);
            class427.field5837.method1560(arg0 ^ 0x669E, 1057001181);
        }
        if (!class383.field5241) {
            int var12 = (class234.field3069 - (class22.field232 >> 4)) / 8;
            int var13 = ((class22.field232 >> 4) + class234.field3069) / 8;
            int var14 = (class108.field1296 - (class196.field2329 >> 4)) / 8;
            int var15 = ((class196.field2329 >> 4) + class108.field1296) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var17 > var15) {
                        class335.field4572.method1796((byte) -96, "m" + var16 + "_" + var17);
                        class335.field4572.method1796((byte) -62, "l" + var16 + "_" + var17);
                    }
                }
            }
        }
        if (class174.field2017 == 28) {
            class259.method1637(10, (byte) 79);
        } else {
            class259.method1637(30, (byte) 79);
            if (class181.field2107 != null) {
                class427.field5837.method2162(false, 174);
            }
        }
        class12.method60((byte) -86);
        class94.method589(-118);
        class274.method1722(-16915);
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V")
    public static final void method1739(byte arg0) {
        int var1 = 109 / ((91 - arg0) / 32);
        field3567++;
        for (class284 var2 = (class284) class180.field2094.method1690((byte) -116); var2 != null; var2 = (class284) class180.field2094.method1699((byte) 68)) {
            class38 var3 = var2.field3713;
            if (class43.field513 != var3.field1528 || class106.field1273 > var3.field434) {
                var2.method263(false);
                var3.method241(0);
            } else if (var3.field427 <= class106.field1273) {
                if (var3.field418 > 0) {
                    class298 var4 = class220.field2726[var3.field418 - 1];
                    if (var4 != null && var4.field1516 >= 0 && var4.field1516 < (class22.field232 * 128) && var4.field1514 >= 0 && var4.field1514 < (class196.field2329 * 128)) {
                        var3.method243(class106.field1273, (byte) -111, var4.field1516, var4.field1514, class189.method1170(var4.field1514, var4.field1516, true, var3.field1528) - var3.field439);
                    }
                }
                if (var3.field418 < 0) {
                    int var5 = -var3.field418 - 1;
                    class131 var6;
                    if (class429.field5865 == var5) {
                        var6 = class143.field1684;
                    } else {
                        var6 = class212.field2584[var5];
                    }
                    if (var6 != null && var6.field1516 >= 0 && var6.field1516 < (class22.field232 * 128) && var6.field1514 >= 0 && class196.field2329 * 128 > var6.field1514) {
                        var3.method243(class106.field1273, (byte) -128, var6.field1516, var6.field1514, class189.method1170(var6.field1514, var6.field1516, true, var3.field1528) - var3.field439);
                    }
                }
                var3.method242(false, class439.field6032);
                class94.method591(var3, true);
            }
        }
    }
}
