import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class class193 {

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field2951 = 0;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lvl;")
    public static class15 field2950 = new class15(20, 4);

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "Lvl;")
    public static class15 field2952 = new class15(27, 3);

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Liv;")
    public static class107 field2948;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "Lgj;")
    public static class662 field2947;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V")
    public static void method1404(int arg0) {
        if (arg0 >= 7) {
            field2952 = null;
            field2950 = null;
            field2948 = null;
            field2947 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILqj;III)V")
    public static final void method1405(int arg0, class537 arg1, int arg2, int arg3, int arg4) {
        arg1.field7295.method759(arg0, 30);
        field2949++;
        arg1.field7295.method790(arg3, 65280);
        if (arg4 != 4116) {
            method1404(-8);
        }
        arg1.field7295.method781(100, arg2);
    }
}
