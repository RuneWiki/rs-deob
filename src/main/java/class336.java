import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class336 {

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public int field4646;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Ldr;")
    public static class615 field4649;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "[I")
    public static int[] field4653;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "Llb;")
    public static class465 field4651;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "F")
    public static float field4648;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "Lkda;")
    public static class328 field4652;

    @OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4645++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2052(int arg0, boolean arg1) {
        if (!arg1) {
            method2052(-72, true);
        }
        field4644++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
    public static final void method2053(String arg0, String arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg3 < 20) {
            method2052(76, true);
        }
        field4647++;
        class253.method1627(arg1, null, arg5, arg0, arg4, 0, arg2, -1);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method2054(byte arg0) {
        field4649 = null;
        field4652 = null;
        field4653 = null;
        if (arg0 != -26) {
            field4648 = 1.7367462F;
        }
        field4651 = null;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class336(String arg0, int arg1) {
        this.field4646 = arg1;
    }

    static {
        new class572("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
        field4649 = new class615();
        field4650 = 0;
        field4653 = new int[1];
        field4651 = new class465(16);
    }
}
