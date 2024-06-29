import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class124 {

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "[I")
    public int[] field1530 = new int[16];

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "[Z")
    public boolean[] field1532 = new boolean[16];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[B")
    public byte[] field1529 = new byte[18002];

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[I")
    public int[] field1533 = new int[256];

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[B")
    public byte[] field1540 = new byte[4096];

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "[Z")
    public boolean[] field1539 = new boolean[256];

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public int field1528 = 0;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "[[I")
    public int[][] field1531 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "[B")
    public byte[] field1548 = new byte[18002];

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "[[I")
    public int[][] field1554 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[B")
    public byte[] field1535 = new byte[256];

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "[I")
    public int[] field1550 = new int[257];

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[[B")
    public byte[][] field1549 = new byte[6][258];

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "[[I")
    public int[][] field1543 = new int[6][258];

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public int field1552 = 0;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "[I")
    public int[] field1558 = new int[6];

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Lus;")
    public static class1 field1555 = new class1(7, -2);

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "[Loa;")
    public static class452[] field1559 = new class452[2048];

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "[I")
    public static int[] field1561 = new int[13];

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "B")
    public byte field1534;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public int field1545;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field1547;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public int field1556;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "[B")
    public byte[] field1536;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "[B")
    public byte[] field1557;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static final void method747(int arg0) {
        field1542++;
        for (class451 var1 = (class451) class160.field2365.method2843(1123227612); var1 != null; var1 = (class451) class160.field2365.method2842(1673506446)) {
            if (class454.method2669(var1.field6245, (byte) -89)) {
                class157.method987(var1, (byte) -110);
            }
        }
        if (arg0 != 8) {
            field1555 = null;
        }
        if (class476.field6690 == 1) {
            class19.field260 = false;
            class382.method2306(class151.field2246, 0, class142.field1888, class104.field1324, class467.field6587);
            return;
        }
        class382.method2306(class151.field2246, arg0 ^ 0x8, class142.field1888, class104.field1324, class467.field6587);
        int var2 = class37.field488.method860(-46, class20.field272.method2065(arg0 - 116, class326.field4711));
        for (class451 var3 = (class451) class160.field2365.method2843(1123227612); var3 != null; var3 = (class451) class160.field2365.method2842(1673506446)) {
            int var4 = class450.method2624(var3, (byte) 75);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class104.field1324 = var2 + 8;
        class467.field6587 = (class103.field1317 ? 26 : 22) + class476.field6690 * 16;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BII)V")
    public static final void method748(byte arg0, int arg1, int arg2) {
        if (arg0 > -111) {
            field1555 = null;
        }
        field1551++;
        class489 var3 = class116.method731(-625541408, 1, arg1);
        var3.method2863(255);
        var3.field6895 = arg2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLkm;I)V")
    public static final void method749(boolean arg0, class216 arg1, int arg2) {
        field1546++;
        if (class476.field6690 >= 400) {
            return;
        }
        class466 var3 = arg1.field3232;
        if (var3.field6526 != null) {
            var3 = var3.method2742(arg2 ^ 0xFFFFFEF5, class140.field1859);
            if (var3 == null) {
                return;
            }
        }
        if (arg2 != 256) {
            field1564 = 16;
        }
        if (!var3.field6552) {
            return;
        }
        String var4 = var3.field6531;
        if (var3.field6512 != 0) {
            String var5 = class456.field6416 == class410.field5756 ? class167.field2443.method2065(arg2 - 147, class326.field4711) : class311.field4393.method2065(49, class326.field4711);
            var4 = var4 + class99.method562(var3.field6512, class492.field6935.field6253, true) + " (" + var5 + var3.field6512 + ")";
        }
        if (!class36.field473) {
            if (!arg0) {
                String[] var7 = var3.field6522;
                if (class27.field360) {
                    var7 = class298.method1838(126, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class95.field1225 != class456.field6416 || !var7[var8].equalsIgnoreCase(class473.field6651.method2065(-128, class326.field4711)))) {
                            byte var9 = 0;
                            int var10 = class231.field3494;
                            if (var8 == 0) {
                                var9 = 9;
                            }
                            if (var8 == 1) {
                                var9 = 58;
                            }
                            if (var8 == 2) {
                                var9 = 46;
                            }
                            if (var8 == 3) {
                                var9 = 10;
                            }
                            if (var8 == 4) {
                                var9 = 4;
                            }
                            if (var3.field6513 == var8) {
                                var10 = var3.field6538;
                            }
                            if (var3.field6523 == var8) {
                                var10 = var3.field6535;
                            }
                            class424.field5928++;
                            class265.method1633(var9, -1, 0, 0, (long) arg1.field2154, "<col=ffff00>" + var4, true, 500, var7[var8], false, var10);
                        }
                    }
                }
                if (class95.field1225 == class456.field6416 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class473.field6651.method2065(-110, class326.field4711))) {
                            short var12 = 0;
                            if (var3.field6512 > class492.field6935.field6253) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 9;
                            }
                            if (var11 == 1) {
                                var13 = 58;
                            }
                            if (var11 == 2) {
                                var13 = 46;
                            }
                            if (var11 == 3) {
                                var13 = 10;
                            }
                            if (var11 == 4) {
                                var13 = 4;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class304.field4333++;
                            class265.method1633(var13, -1, 0, 0, (long) arg1.field2154, "<col=ffff00>" + var4, true, 500, var7[var11], false, var3.field6564);
                        }
                    }
                }
            }
            class265.method1633(1012, -1, 0, 0, (long) arg1.field2154, "<col=ffff00>" + var4, true, 500, class483.field6807.method2065(-119, class326.field4711), arg0, class114.field1455);
            class338.field4925++;
        } else if (!arg0) {
            class467 var6 = class413.field5811 == -1 ? null : class408.field5734.method1541(arg2 ^ 0xFFFFFEDA, class413.field5811);
            if ((class328.field4745 & 0x2) != 0) {
                if (var6 == null || var3.method2733(1, class413.field5811, var6.field6579) != var6.field6579) {
                    class269.field3932++;
                    class265.method1633(3, -1, 0, 0, (long) arg1.field2154, class373.field5386 + " -> <col=ffff00>" + var4, true, 500, class489.field6894, false, class22.field282);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method750(int arg0) {
        field1561 = null;
        field1555 = null;
        if (arg0 != 18002) {
            method749(false, (class216) null, 46);
        }
        field1559 = null;
    }
}
