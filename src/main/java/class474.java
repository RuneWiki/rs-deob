import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class474 {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "[I")
    public static int[] field6556 = new int[3];

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public int field6559;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public int field6560;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V", line = 8)
    public static void method2668(int arg0) {
        field6556 = null;
        if (arg0 != 1) {
            method2669(true, false, 46, null, -102, 74, -54);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ZZILni;III)V", line = 29)
    public static final void method2669(boolean arg0, boolean arg1, int arg2, class522 arg3, int arg4, int arg5, int arg6) {
        class122.field1593 = arg4;
        class226.field2934 = 1;
        class302.field4082 = arg2;
        field6555++;
        class669.field9309 = arg1;
        class526.field7068 = arg6;
        class476.field6580 = arg3;
        class276.field3683 = arg5;
        if (arg0) {
            method2668(44);
        }
        class520.field6997 = null;
    }
}
