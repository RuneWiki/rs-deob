import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 extends class97 {

    @OriginalMember(owner = "client!he", name = "E", descriptor = "I")
    public int field1425 = -1;

    @OriginalMember(owner = "client!he", name = "L", descriptor = "I")
    public int field1432 = 0;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "Lwd;")
    public static class150 field1416 = class2.method9(true, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lwd;")
    public static class150 field1418 = class2.method9(true, "Untersuchen");

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lwd;")
    public static class150 field1419 = class2.method9(true, ")2");

    @OriginalMember(owner = "client!he", name = "M", descriptor = "Lwd;")
    private static class150 field1433 = class2.method9(true, "Sorry invited players only)3");

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lwd;")
    public static class150 field1434 = field1433;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "I")
    public int field1424;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!he", name = "G", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!he", name = "H", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!he", name = "I", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!he", name = "J", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!he", name = "K", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lkc;")
    public static class72 field1413;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field1413 = null;
        if (arg0 != -96) {
            method426((byte) 1);
        }
        field1418 = null;
        field1419 = null;
        field1433 = null;
        field1434 = null;
        field1416 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JB)V")
    public static final void method427(long arg0, byte arg1) {
        field1417++;
        if (arg0 == 0L) {
            return;
        }
        if (class50.field1347 >= 100 && class6.field149 != 1 || class50.field1347 >= 200) {
            class3.method16(99, 0, class116.field2671, class43.field1167);
            return;
        }
        class150 var3 = class124.method940(arg0, 12391).method1175((byte) 71);
        for (int var4 = 0; var4 < class50.field1347; var4++) {
            if (class3.field61[var4] == arg0) {
                class3.method16(99, 0, class111.method786((byte) 63, new class150[] { var3, class90.field2102 }), class43.field1167);
                return;
            }
        }
        int var5 = -17 % ((arg1 - 86) / 38);
        for (int var6 = 0; var6 < class74.field1858; var6++) {
            if (class74.field1859[var6] == arg0) {
                class3.method16(99, 0, class111.method786((byte) 23, new class150[] { class72.field1805, var3, class1.field2 }), class43.field1167);
                return;
            }
        }
        if (var3.method1192(class46.field1244.field2555, 1)) {
            return;
        }
        class146.field3537[class50.field1347] = var3;
        class34.field952++;
        class3.field61[class50.field1347] = arg0;
        class30.field893[class50.field1347] = 0;
        class141.field3392[class50.field1347] = 0;
        class82.field1972 = true;
        class128.field3024 = class11.field280 + 1;
        class50.field1347++;
        class143.field3451.method965(true, 100);
        class143.field3451.method1129(arg0, false);
    }
}
