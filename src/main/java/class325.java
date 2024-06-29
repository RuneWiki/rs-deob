import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class class325 {

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[[B")
    public static byte[][] field4236 = new byte[50][];

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Ljo;")
    public static class303 field4237;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Loa;I)V", line = 10)
    public static final void method1845(class635 arg0, int arg1) {
        if (arg1 != 0) {
            method1848(101, -112);
        }
        if (class604.field8551) {
            class193.method1109(arg0, (byte) -34);
        } else {
            class321.method1810(arg0, 0);
        }
        field4240++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 27)
    public static final void method1846(int arg0) {
        field4235++;
        int var1 = class601.field8530.method1830(class150.field1711, 0);
        if (var1 == 0) {
            class242.field3146 = null;
            class127.method729(0, false);
        } else if (var1 == 1) {
            class214.method1274((byte) 0, (byte) -26);
            class127.method729(512, false);
            if (class379.field4922 != null) {
                class372.method2041((byte) 121);
            }
        } else {
            class214.method1274((byte) (class273.field3463 - 4 & 0xFF), (byte) -55);
            class127.method729(2, false);
        }
        class552.field7873 = class353.field4625;
        if (arg0 != -1) {
            method1848(63, -52);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 62)
    public static void method1847(int arg0) {
        if (arg0 > -51) {
            method1846(120);
        }
        field4236 = null;
        field4237 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V", line = 81)
    public static final void method1848(int arg0, int arg1) {
        int var2 = -34 % ((-arg1 - 1) / 58);
        if (class636.field9006 == 0) {
            class112.field1304.method663(arg0, 7);
        } else {
            class41.field434 = arg0;
        }
        field4239++;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lmj;")
    public abstract class597 method1798(byte arg0);

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    public abstract void method1797(byte arg0);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public abstract void method1803(boolean arg0);

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)Z")
    public abstract boolean method1805(byte arg0, int arg1);
}
