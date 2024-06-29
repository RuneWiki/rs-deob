import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class277 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4034 = 0;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "F")
    public static float field4036;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Ltga;")
    public static class63 field4037;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Laga;")
    public static class694 field4038;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        if (arg0 == -63) {
            field4038 = null;
            field4037 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILdja;)Ldja;")
    public abstract class324 method1043(int arg0, class324 arg1);
}
