import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class282 extends class447 {

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "Z")
    public static boolean field3834 = false;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "Lkc;")
    public static class157 field3829 = new class157("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "I")
    public static int field3835 = 1403;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BF)V", line = 3)
    public final void method574(byte arg0, float arg1) {
        super.field6560 = arg1;
        ++field3830;
        int var3 = 120 % ((-72 - arg0) / 46);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIII)V", line = 15)
    public final void method572(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 29849) {
            ++field3831;
            super.field6555 = arg1;
            super.field6561 = arg2;
            super.field6558 = arg0;
        }
    }

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "(I)V", line = 29)
    public static void method1627(int arg0) {
        if (arg0 != -28983) {
            field3834 = true;
        }
        field3829 = null;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIIIF)V", line = 39)
    public class282(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
