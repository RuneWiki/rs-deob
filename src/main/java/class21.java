import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class21 extends class227 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Z")
    public static boolean[] field278 = new boolean[100];

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "Lha;")
    public static class267 field280 = null;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method158(byte arg0) {
        field278 = null;
        field280 = null;
        if (arg0 <= 79) {
            field278 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZ)I")
    public static final int method159(int arg0, int arg1, boolean arg2) {
        class255 var3 = (class255) class168.field2428.method1218((long) arg0, 122);
        field279++;
        if (var3 == null) {
            return 0;
        } else {
            if (!arg2) {
                field281 = 76;
            }
            return arg1 >= 0 && arg1 < var3.field3871.length ? var3.field3871[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)V")
    public static final void method160(int arg0, int arg1) {
        if (class184.field2620 == arg0) {
            class138.field1995.method411((byte) -93, arg1);
        } else {
            class70.field1098 = arg1;
        }
        field282++;
    }
}
