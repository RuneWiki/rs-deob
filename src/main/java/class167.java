import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class167 {

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2524 = "green:";

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[I")
    public static int[] field2525 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lub;Lub;ILtf;)V")
    public static final void method1212(class92 arg0, class92 arg1, int arg2, class111 arg3) {
        class288.field4500 = arg1;
        field2521++;
        class184.field2902 = arg0;
        class222.field3425 = arg3;
        if (class288.field4500 != null) {
            class221.field3377 = class288.field4500.method700((byte) -113, 1);
        }
        if (arg2 != 1) {
            method1213(-93);
        }
        if (class184.field2902 != null) {
            class63.field996 = class184.field2902.method700((byte) -109, 1);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1213(int arg0) {
        class92.field1464.method1172((byte) 114);
        field2522++;
        if (arg0 != 0) {
            method1213(79);
        }
        class84.field1257.method1172((byte) 120);
        class199.field3089.method1172((byte) 112);
        class156.field2326.method1172((byte) 109);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static void method1214(boolean arg0) {
        field2524 = null;
        if (!arg0) {
            field2525 = null;
        }
        field2525 = null;
    }
}
