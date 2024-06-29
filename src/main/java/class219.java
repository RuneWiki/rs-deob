import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class219 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
    public static boolean field2925;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "J")
    public static long field2926;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field2927;

    static {
        new class206("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field2925 = false;
        field2926 = 0L;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1247(int arg0) {
        field2927++;
        class167.method980();
        if (arg0 != 0) {
            method1247(122);
        }
    }
}
