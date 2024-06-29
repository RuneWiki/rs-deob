import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class92 {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1665 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lrc;")
    public static class315 field1664 = null;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lqd;")
    private static class40 field1668 = class147.method1106("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", (byte) -50);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lqd;")
    public static class40 field1667 = field1668;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lqd;")
    public static class40 field1671 = class147.method1106("Lade Liste der Welten", (byte) -95);

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field1674 = 20;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lqd;")
    public static class40 field1677 = class147.method1106("Weiter", (byte) -95);

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lce;")
    public static class239 field1672;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lce;")
    public static class239 field1679;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 5)
    public static void method702(int arg0) {
        field1677 = null;
        field1672 = null;
        field1667 = null;
        field1668 = null;
        field1671 = null;
        field1679 = null;
        int var1 = 56 / ((arg0 + 13) / 49);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lqd;IZ)V", line = 30)
    public static final void method703(class40 arg0, int arg1, boolean arg2) {
        class142.field2389++;
        field1678++;
        class19.field295.method1464(67, 0);
        if (!arg2) {
            class19.field295.method235(arg0.method362(-25194), -1);
            class19.field295.method218(arg1, -19914);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 51)
    public static final void method704(byte arg0, Component arg1) {
        arg1.removeMouseListener(class288.field4828);
        if (arg0 >= -6) {
            method702(89);
        }
        arg1.removeMouseMotionListener(class288.field4828);
        field1676++;
        arg1.removeFocusListener(class288.field4828);
        class76.field1310 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 124)
    public static final void method705(byte arg0) {
        if (arg0 > -51) {
            return;
        }
        if (class288.field4828 != null) {
            class53 var1 = class288.field4828;
            synchronized (class288.field4828) {
                class288.field4828 = null;
            }
        }
        field1666++;
    }
}
