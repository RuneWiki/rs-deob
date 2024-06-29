import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class112 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public static int[] field1627 = new int[1000];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V", line = 8)
    public static final void method790(int arg0) {
        field1629++;
        if (arg0 >= -61) {
            field1627 = null;
        }
        class314.field4303.method1382(false);
        class347.field4737 = 1;
        class130.field1832 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)Z", line = 25)
    public static final boolean method791(byte arg0, int arg1, int arg2) {
        field1628++;
        if (arg0 > -107) {
            field1627 = null;
        }
        return (class368.field5193[1][arg2][arg1] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 41)
    public static void method792(boolean arg0) {
        if (arg0) {
            field1627 = null;
        }
        field1627 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 55)
    public static final void method793(int arg0, int arg1) {
        if (class47.field662 == null || arg1 > class47.field662.length) {
            class47.field662 = new int[arg1];
        }
        if (arg0 == 2) {
            field1630++;
        }
    }
}
