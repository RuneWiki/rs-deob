import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class269 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljk;")
    public static class585 field3684 = new class585(39, 5);

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z")
    public static final boolean method1624(int arg0, int arg1, int arg2) {
        if (arg0 != 39) {
            method1624(62, 84, 59);
        }
        field3683++;
        return (arg2 & 0x70000) != 0 | class613.method3518(arg1, arg2, 1) || class273.method1637(-114, arg1, arg2);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public static void method1625(int arg0) {
        field3684 = null;
        if (arg0 != 5) {
            field3682 = -3;
        }
    }
}
