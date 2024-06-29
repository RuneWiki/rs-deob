import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class580 extends class669 {

    @OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
    public static int field7948;

    @OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
    public static int field7949;

    @OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
    public static int field7950;

    @OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IBII)V")
    public final void method1432(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 70) {
            super.field9124 = arg2;
            super.field9133 = arg0;
            ++field7949;
            super.field9119 = arg3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IF)V")
    public final void method1436(int arg0, float arg1) {
        ++field7951;
        super.field9121 = arg1;
        if (arg0 != -1) {
            method3329(-79, -120, true, 36, (class91) null, 19);
        }
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIF)V")
    public class580(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZILin;I)V")
    public static final void method3329(int arg0, int arg1, boolean arg2, int arg3, class91 arg4, int arg5) {
        ++field7950;
        if (arg3 < 90) {
            field7948 = -21;
        }
        class641.method3637(arg4, -89, arg2, 0L, arg5, arg0, arg1);
    }
}
