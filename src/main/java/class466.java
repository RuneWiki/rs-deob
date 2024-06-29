import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class466 extends class673 {

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZ)V")
    public final void method1746(int arg0, int arg1, int arg2, boolean arg3) {
        ++field6035;
        if (arg2 < -50) {
            class576.field7320.method911(arg0 + -2, arg1, super.field8712.field140 - -4, super.field8712.field141 - -2, ((class507) super.field8712).field6477, 0);
            class576.field7320.method911(arg0 + -1, arg1 + 1, super.field8712.field140 + 2, super.field8712.field141, 0, 0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lwm;Lwm;Lwga;)V")
    public class466(class30 arg0, class30 arg1, class507 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZZI)V")
    public final void method1745(int arg0, boolean arg1, boolean arg2, int arg3) {
        ++field6036;
        int var5 = this.method3629((byte) 48) * super.field8712.field140 / 10000;
        if (arg1) {
            class576.field7320.method921(arg0, arg3 + 2, var5, super.field8712.field141 - 2, ((class507) super.field8712).field6474, 0);
            class576.field7320.method921(arg0 - -var5, arg3 + 2, -var5 + super.field8712.field140, super.field8712.field141 + -2, 0, 0);
        }
    }
}
