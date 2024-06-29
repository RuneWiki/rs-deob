import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class94 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Luf;")
    public static class168 field1482 = class148.method1019(-1720, "logo");

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    public static int[] field1495 = new int[100];

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Luf;")
    public static class168 field1497 = class148.method1019(-1720, "<col=ffff00>");

    @OriginalMember(owner = "client!s", name = "z", descriptor = "Lg;")
    public static class242 field1507 = null;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field1483;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field1485;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field1486;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field1487;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field1488;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public int field1490;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field1492;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field1501;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public int field1508;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[I")
    public static int[] field1491;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 12)
    public static final void method712(byte arg0) {
        int var1 = 45 % ((-arg0 - 19) / 39);
        class43.method238();
        for (int var2 = 0; var2 < 4; var2++) {
            class140.field2176[var2].method1728(16777216);
        }
        System.gc();
        field1504++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V", line = 37)
    public static void method713(boolean arg0) {
        field1507 = null;
        field1482 = null;
        if (arg0) {
            field1484 = -27;
        }
        field1491 = null;
        field1495 = null;
        field1497 = null;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)Z", line = 67)
    public static final boolean method714(boolean arg0) {
        field1499++;
        try {
            if (class83.field1261 == 2) {
                if (class179.field2887 == null) {
                    class179.field2887 = class74.method416(class300.field5091, class157.field2478, class14.field145);
                    if (class179.field2887 == null) {
                        return false;
                    }
                }
                if (class62.field812 == null) {
                    class62.field812 = new class139(class284.field4813, class253.field4326);
                }
                if (class92.field1414.method522(class179.field2887, class62.field812, class153.field2364, 32450, 22050)) {
                    class92.field1414.method517(127);
                    class92.field1414.method555(class282.field4765, true);
                    class92.field1414.method538(class179.field2887, (byte) -69, class285.field4825);
                    class83.field1261 = 0;
                    class300.field5091 = null;
                    class62.field812 = null;
                    class179.field2887 = null;
                    return true;
                }
            }
            if (arg0) {
                method712((byte) 15);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class92.field1414.method527(-105);
            class83.field1261 = 0;
            class300.field5091 = null;
            class62.field812 = null;
            class179.field2887 = null;
        }
        return false;
    }
}
