import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class268 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field3582 = 0;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "F")
    public static float field3584;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Liw;")
    public static class207 field3583;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public static void method1649(byte arg0) {
        field3583 = null;
        if (arg0 >= -2) {
            method1650(124);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)I")
    public static final int method1650(int arg0) {
        field3581++;
        return arg0 == 46 ? 46 : -19;
    }
}
