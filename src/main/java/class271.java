import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class271 extends class665 {

    @OriginalMember(owner = "client!w", name = "u", descriptor = "Luc;")
    public static class27 field3829 = new class27(24, 4);

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 3)
    public static void method1635(int arg0) {
        field3829 = null;
        int var1 = -90 % ((arg0 + 70) / 32);
    }
}
