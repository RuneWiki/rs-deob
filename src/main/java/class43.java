import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public abstract class class43 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field736 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lpia;")
    public static class54 field734;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 17)
    public static void method457(int arg0) {
        if (arg0 >= -125) {
            method457(54);
        }
        field734 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public abstract void method454(byte arg0);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Z")
    public abstract boolean method455(int arg0, int arg1);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Lao;")
    public abstract class62 method456(int arg0);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public abstract void method458(byte arg0);
}
