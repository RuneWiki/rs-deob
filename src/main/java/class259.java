import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class259 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[[B")
    public static byte[][] field3344 = new byte[50][];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Lwo;")
    public static class285 field3342;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1636(int arg0) {
        field3344 = null;
        if (arg0 == -1) {
            field3342 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V")
    public static final void method1637(int arg0, byte arg1) {
        field3341++;
        if (class174.field2017 == arg0) {
            return;
        }
        if (class174.field2017 == 0) {
            class391.method2428(arg1 ^ 0xD786F6C7);
        }
        if (arg0 == 40) {
            class280.method1748(false);
        }
        if (arg0 != 40 && class278.field3600 != null) {
            class278.field3600.method2465((byte) -85);
            class278.field3600 = null;
        }
        if (class174.field2017 == 25 || class174.field2017 == 28) {
            class332.field4520.field3759 = 2;
            class127.field1420.field3759 = 2;
            class90.field1054.field3759 = 2;
            class382.field5236.field3759 = 2;
            class267.field3455.field3759 = 2;
            class412.field5672.field3759 = 2;
            class424.field5813.field3759 = 2;
        }
        if (arg0 == 25 || arg0 == 28) {
            class416.field5700 = 1;
            class303.field4070 = 0;
            class374.field5072 = 0;
            class330.field4502 = 1;
            class3.field26 = 0;
            class102.method615(-107, true);
            class332.field4520.field3759 = 1;
            class127.field1420.field3759 = 1;
            class90.field1054.field3759 = 1;
            class382.field5236.field3759 = 1;
            class267.field3455.field3759 = 1;
            class412.field5672.field3759 = 1;
            class424.field5813.field3759 = 1;
        }
        if (arg0 == 25 || arg0 == 10) {
            class382.method2384(125);
        }
        if (arg0 == 5) {
            class308.method1961((byte) -86, class267.field3454, class15.field177);
        } else {
            class383.method2387(76);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg1 != 79) {
            method1638(127, -32, -41, -115);
        }
        boolean var3 = class174.field2017 == 5 || class174.field2017 == 10 || class174.field2017 == 28;
        if (var2 != var3) {
            if (var2) {
                class346.field4702 = class421.field5761;
                if (class162.field1895 == 0) {
                    class293.method1873(1, 2);
                } else {
                    class367.method2320(2, class421.field5761, class150.field1738, false, 0, 1, 255);
                }
                class235.field3094.method2379(false, -2);
            } else {
                class293.method1873(arg1 - 78, 2);
                class235.field3094.method2379(true, -2);
                if (class203.field2384 != null) {
                    class203.field2384.method1220((byte) 9);
                    class203.field2384 = null;
                }
            }
        }
        if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
            class267.field3454.method765();
        }
        class174.field2017 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)V")
    public static final void method1638(int arg0, int arg1, int arg2, int arg3) {
        field3343++;
        class427.field5837.method1560(-26356, arg1);
        class427.field5837.method1573(-6266, arg2);
        if (arg0 == 29582) {
            class427.field5837.method1573(-6266, arg3);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLbe;)V")
    public static final void method1639(byte arg0, class131 arg1) {
        field3345++;
        if (class57.field660 >= 400 || class143.field1684 == arg1) {
            return;
        }
        String var8;
        if (arg1.field1454 == 0) {
            boolean var2 = true;
            if (class143.field1684.field1455 != -1 && arg1.field1455 != -1) {
                int var3 = arg1.field1463 >= class143.field1684.field1463 ? arg1.field1463 : class143.field1684.field1463;
                int var4 = class143.field1684.field1455 < arg1.field1455 ? class143.field1684.field1455 : arg1.field1455;
                int var5 = var3 * 10 / 100 + var4 + 5;
                int var6 = class143.field1684.field1463 - arg1.field1463;
                if (var6 < 0) {
                    var6 = -var6;
                }
                if (var6 > var5) {
                    var2 = false;
                }
            }
            String var7 = class31.field356 == 1 ? class176.field2055.method434(class373.field5057, -8192) : class176.field2054.method434(class373.field5057, -8192);
            if (arg1.field1471 > arg1.field1463) {
                var8 = arg1.method844(-11905, true) + (var2 ? class341.method2183(class143.field1684.field1463, (byte) -109, arg1.field1463) : "<col=ffffff>") + " (" + var7 + arg1.field1463 + "+" + (arg1.field1471 - arg1.field1463) + ")";
            } else {
                var8 = arg1.method844(-11905, true) + (var2 ? class341.method2183(class143.field1684.field1463, (byte) -99, arg1.field1463) : "<col=ffffff>") + " (" + var7 + arg1.field1463 + ")";
            }
        } else {
            var8 = arg1.method844(-11905, true) + " (" + class75.field904.method434(class373.field5057, -8192) + arg1.field1454 + ")";
        }
        if (!class104.field1224) {
            for (int var9 = 7; var9 >= 0; var9--) {
                if (class181.field2108[var9] != null) {
                    short var10 = 0;
                    if (class31.field356 == 0 && class181.field2108[var9].equalsIgnoreCase(class87.field1014.method434(class373.field5057, -8192))) {
                        if (class143.field1684.field1463 < arg1.field1463) {
                            var10 = 2000;
                        }
                        if (class143.field1684.field1472 != 0 && arg1.field1472 != 0) {
                            if (class143.field1684.field1472 == arg1.field1472) {
                                var10 = 2000;
                            } else {
                                var10 = 0;
                            }
                        }
                    } else if (class269.field3475[var9]) {
                        var10 = 2000;
                    }
                    short var11 = (short) (class27.field305[var9] + var10);
                    int var12 = class1.field9[var9] == -1 ? class339.field4625 : class1.field9[var9];
                    class211.field2555++;
                    class300.method1908(var12, "<col=ffffff>" + var8, 0, 672, (long) arg1.field2445, class181.field2108[var9], 0, var11);
                }
            }
        } else if ((class105.field1248 & 0x8) != 0) {
            class146.field1708++;
            class300.method1908(class272.field3513, class381.field5204 + " -> <col=ffffff>" + var8, 0, 672, (long) arg1.field2445, class335.field4569, 0, 30);
        }
        for (class266 var13 = (class266) class97.field1138.method1690((byte) -112); var13 != null; var13 = (class266) class97.field1138.method1699((byte) 51)) {
            if (var13.field3424 == 21) {
                var13.field3421 = "<col=ffffff>" + var8;
                break;
            }
        }
        if (arg0 >= -24) {
            method1638(-47, 113, 6, -80);
        }
    }

    static {
        new class72("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
