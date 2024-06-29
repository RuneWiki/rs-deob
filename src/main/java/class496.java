import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class496 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ltf;")
    public static class198 field7174 = null;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Laa;")
    public static class343 field7175;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method2908(int arg0) {
        class183.field2696.method2286((byte) 19);
        field7172++;
        if (arg0 != 19692) {
            method2909(-65, 72);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
    public static final boolean method2909(int arg0, int arg1) {
        field7176++;
        if (arg0 != -23928) {
            field7175 = null;
        }
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method2910(int arg0) {
        field7174 = null;
        if (arg0 == 2640) {
            field7175 = null;
        }
    }
}
