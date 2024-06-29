import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class230 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Z")
    public static boolean field3601 = false;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Z")
    public static boolean field3596;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZBIZZ)Lug;", line = 7)
    public static final class253 method1664(boolean arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 != 114) {
            return (class253) null;
        }
        field3597++;
        class180 var5 = null;
        if (class255.field4031 != null) {
            var5 = new class180(arg2, class255.field4031, class174.field2858[arg2], 1000000);
        }
        class18.field291[arg2] = class131.field1940.method854(class274.field4239, arg2, true, var5);
        if (arg0) {
            class18.field291[arg2].method1690((byte) 118);
        }
        return new class253(class18.field291[arg2], arg3, arg4);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lug;I)V", line = 42)
    public static final void method1665(class253 arg0, int arg1) {
        field3600++;
        class142.field2252 = arg0;
        class267.field4165 = class142.field2252.method1826(arg1 - 4, arg1);
    }
}
