import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class493 extends class499 {

    @OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
    public int field7287;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public int field7282;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field7285 = 0;

    @OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
    public static int field7286 = 0;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "Lia;")
    public static class415 field7284;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 4)
    public static void method2923(int arg0) {
        if (arg0 == 0) {
            field7284 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLqa;)V", line = 18)
    public static final void method2924(boolean arg0, class162 arg1) {
        if (arg0) {
            method2923(53);
        }
        field7283++;
        if (class205.field2910) {
            class108.method695(1, arg1);
        } else {
            class324.method1819(!arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(II)V", line = 45)
    public class493(int arg0, int arg1) {
        this.field7287 = arg0;
        this.field7282 = arg1;
    }
}
