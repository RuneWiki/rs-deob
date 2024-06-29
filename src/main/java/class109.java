import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class109 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lec;")
    public static class25 field1668 = new class25(4);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lec;")
    public static class25 field1671 = new class25(128);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method706(byte arg0) {
        field1671 = null;
        if (arg0 < 47) {
            method708((class254) null, true);
        }
        field1668 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)I")
    public static final int method707(boolean arg0, int arg1) {
        if (!arg0) {
            field1671 = null;
        }
        field1670++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lkk;Z)Z")
    public static final boolean method708(class254 arg0, boolean arg1) {
        field1667++;
        if (arg0.field4060 == 205) {
            class94.field1418 = 250;
            return true;
        } else {
            return !arg1;
        }
    }
}
