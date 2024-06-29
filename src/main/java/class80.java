import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class80 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "[Z")
    public static boolean[] field1516 = new boolean[100];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "Lvf;")
    public static class265 field1511 = class87.method582(-46, "Lade Liste der Welten");

    @OriginalMember(owner = "client!q", name = "c", descriptor = "[I")
    public static int[] field1513 = new int[4096];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "Lvf;")
    public static class265 field1519 = class87.method582(-46, "null");

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "[Lgk;")
    public static class6[] field1517;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BLvf;)V")
    public static final void method554(byte arg0, class265 arg1) {
        field1515++;
        if (class30.field773 >= 2) {
            if (arg1.method1791(class95.field1682, (byte) -98)) {
                class19.method138(2532);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class259.method1725(-102, class148.method1022(10, new class265[] { class72.field1376, class241.method1609(true, var4), class8.field275 }), 0, (class265) null);
            }
            if (arg1.method1791(class43.field953, (byte) -98)) {
                class19.method138(2532);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class259.method1725(-94, class148.method1022(10, new class265[] { class22.field663, class241.method1609(true, var7), class8.field275 }), 0, (class265) null);
                class59.method438(0);
                class19.method138(2532);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class259.method1725(-78, class148.method1022(10, new class265[] { class13.field420, class241.method1609(true, var9), class8.field275 }), 0, (class265) null);
            }
            if (arg1.method1791(class270.field4820, (byte) -98)) {
                class259.method1725(-84, class148.method1022(10, new class265[] { class158.field2906, class241.method1609(true, class9.method62(-128)) }), 0, (class265) null);
            }
            if (arg1.method1791(class164.field2985, (byte) -98)) {
                class241.method1608((byte) -57);
            }
            if (arg1.method1791(class33.field818, (byte) -98)) {
                class130.field2281.method1723(84);
            }
            if (arg1.method1791(class261.field4503, (byte) -98)) {
                class130.field2281.method1718(true);
            }
            if (arg1.method1791(class263.field4591, (byte) -98)) {
                class281.field4957.method1527((byte) -75);
                class197.field3520.method988(-4020);
                class130.field2281.method1721(false);
            }
            if (arg1.method1791(class4.field62, (byte) -98)) {
                class44.field969 = true;
            }
            if (arg1.method1791(class38.field864, (byte) -98)) {
                class70.method497(73, 25);
            }
            if (arg1.method1791(class81.field1531, (byte) -98)) {
                class202.field3626 = true;
            }
            if (arg1.method1791(class249.field4320, (byte) -98)) {
                class202.field3626 = false;
            }
            if (arg1.method1791(class186.field3368, (byte) -98)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class130.field2279[var10].field4422[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method1785(0, class6.field200)) {
                class255.method1679(arg1.method1810(-1, 15).method1801(36));
                class7.method53(class281.field4957, (byte) -126);
                class106.field1884 = false;
            }
            if (arg1.method1785(0, class277.field4891) && class264.field4601 != 0) {
                class195.method1347(1000, arg1.method1810(-1, 6).method1801(-115));
            }
            if (arg1.method1791(class231.field4081, (byte) -98) && class264.field4601 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1785(0, class210.field3780)) {
                class111.field1952 = arg1.method1810(-1, 12).method1781(30598).method1801(-112);
                class259.method1725(-64, class148.method1022(10, new class265[] { class146.field2736, class241.method1609(true, class111.field1952) }), 0, (class265) null);
            }
            if (arg1.method1791(class72.field1370, (byte) -98)) {
                class267.field4710 = true;
            }
            if (arg1.method1791(class216.field3898, (byte) -98)) {
                if (class4.field61) {
                    class38.field877.method1770((byte) 49);
                    class4.field61 = false;
                } else {
                    class96.field1689.method1770((byte) -118);
                    class4.field61 = true;
                }
            }
        }
        class55.field1133.method1863(true, 243);
        class53.field1108++;
        class55.field1133.method903((byte) 36, arg1.method1808((byte) -15) - 1);
        int var13 = -87 / ((arg0 - 18) / 44);
        class55.field1133.method941(arg1.method1810(-1, 2), (byte) -58);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lfl;I)V")
    public static final void method555(class192 arg0, int arg1) {
        class98.field1725 = arg0.method1326((byte) -21, class181.field3221);
        field1518++;
        class62.field1231 = arg0.method1326((byte) -21, class282.field4975);
        if (arg1 != 103) {
            field1516 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method556(int arg0) {
        field1511 = null;
        field1517 = null;
        field1516 = null;
        field1513 = null;
        int var1 = -47 / ((8 - arg0) / 46);
        field1519 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BII)I")
    public static final int method557(byte arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        field1514++;
        if (arg0 <= 88) {
            field1513 = null;
        }
        return arg2;
    }
}
