import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class93 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public int field1740;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lca;")
    public static class24 field1741 = new class24(260);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Li;")
    private static class88 field1745 = class208.method1425(105, "Click to switch");

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Li;")
    public static class88 field1744 = class208.method1425(105, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Li;")
    public static class88 field1750 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Li;")
    public static class88 field1749 = class208.method1425(105, "sich mit einer anderen Welt zu verbinden)3");

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Li;")
    public static class88 field1751 = class208.method1425(105, "rect_debug=");

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Li;")
    public static class88 field1752 = field1745;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Li;")
    private static class88 field1748 = class208.method1425(105, "FULL");

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Li;")
    private static class88 field1747 = class208.method1425(105, "Walk here");

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Li;")
    public static class88 field1742 = field1747;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Li;")
    public static class88 field1746 = field1748;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLpe;Z)V")
    public static final void method673(byte arg0, class168 arg1, boolean arg2) {
        field1736++;
        int var3 = arg1.field3231;
        int var4 = (int) arg1.field1219;
        arg1.method460(true);
        if (arg2) {
            class35.method233(var3, (byte) 96);
        }
        if (arg0 >= -107) {
            field1743 = 72;
        }
        class14.method70(-13897, var3);
        class174 var5 = class239.method1581(-64, var4);
        if (var5 != null) {
            class200.method1373(65280, var5);
        }
        class203.field3864 = 0;
        class108.field1960 = false;
        class126.method863(class47.field889, class237.field4423, class234.field4385, class86.field1549, (byte) -127);
        if (class43.field723 != -1) {
            class137.method914(class43.field723, 1, 4);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1749 = null;
        field1748 = null;
        field1742 = null;
        if (arg0 != 0) {
            method674(32);
        }
        field1745 = null;
        field1752 = null;
        field1747 = null;
        field1741 = null;
        field1744 = null;
        field1751 = null;
        field1746 = null;
        field1750 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class93() {
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lie;)V")
    public class93(class93 arg0) {
        this.field1738 = arg0.field1738;
        this.field1737 = arg0.field1737;
        this.field1740 = arg0.field1740;
        this.field1739 = arg0.field1739;
    }
}
