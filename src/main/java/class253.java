import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class253 extends class592 {

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBI)V")
    public final void method551(int arg0, int arg1, byte arg2, int arg3) {
        super.field8550 = arg0;
        super.field8556 = arg1;
        super.field8558 = arg3;
        ++field3153;
        if (arg2 != -10) {
            field3151 = -88;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BF)V")
    public final void method557(byte arg0, float arg1) {
        if (arg0 == 106) {
            ++field3152;
            super.field8559 = arg1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIF)V")
    public class253(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
