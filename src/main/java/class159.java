import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class159 {

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "[I")
    public static int[] field2554;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public static void method1106(byte arg0) {
        field2554 = null;
        if (arg0 != 114) {
            field2554 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBLqs;)Lqm;")
    public static final class331 method1107(int arg0, byte arg1, class496 arg2) {
        if (arg1 != 113) {
            field2554 = null;
        }
        field2553++;
        byte[] var3 = arg2.method2942(arg0, -10365);
        return var3 == null ? null : new class331(var3);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
    public static final void method1108(boolean arg0) {
        class202.field3204 = null;
        class303.field4856 = null;
        class535.field7863 = null;
        field2555++;
        class471.field6985 = null;
        class129.field2224 = null;
        if (!arg0) {
            method1107(23, (byte) 39, null);
        }
        class129.field2225 = false;
    }
}
