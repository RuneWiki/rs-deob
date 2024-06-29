import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class689 {

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field9423 = -2;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIII)V")
    public static final void method3757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class352.field4517 == 1) {
            class542.field7040[class103.field1374 / 100].method2751(class629.field8781 - 8, class284.field3697 - 8);
        }
        field9422++;
        if (class352.field4517 == 2) {
            class542.field7040[class103.field1374 / 100 + 4].method2751(class629.field8781 - 8, class284.field3697 + -8);
        }
        class553.method2963(arg2 ^ arg2);
    }
}
