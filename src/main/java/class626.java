import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class626 extends class581 {

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field8769 = 0;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field8771 = 0;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field8767;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field8772;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[Lvg;")
    public static class49[] field8770;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[Lf;")
    public static class702[] field8768;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lpu;Lpu;Lih;)V", line = 7)
    public class626(class522 arg0, class522 arg1, class650 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V", line = 11)
    public static void method3497(byte arg0) {
        field8770 = null;
        if (arg0 != 105) {
            method3497((byte) -54);
        }
        field8768 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIZ)V", line = 24)
    public final void method1675(int arg0, int arg1, int arg2, boolean arg3) {
        ++field8772;
        class282.field4228.method219(arg1 + -2, arg2, super.field8179.field487 + 4, super.field8179.field480 + 2, ((class650) super.field8179).field9109, 0);
        class282.field4228.method219(arg1 + -1, arg2 + 1, super.field8179.field487 + 2, super.field8179.field480, arg0, 0);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZII)V", line = 33)
    public final void method1673(int arg0, boolean arg1, int arg2, int arg3) {
        ++field8767;
        int var5 = this.method3312(43) * super.field8179.field487 / 10000;
        class282.field4228.method114(arg2, arg0 + 2, var5, super.field8179.field480 + -2, ((class650) super.field8179).field9108, 0);
        class282.field4228.method114(arg2 + var5, arg0 - -2, super.field8179.field487 - var5, super.field8179.field480 + -2, 0, 0);
        if (arg3 < 107) {
            field8770 = null;
        }
    }
}
