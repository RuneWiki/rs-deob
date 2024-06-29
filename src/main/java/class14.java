import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class674 {

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field198 = 0;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIF)V", line = 3)
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII)V", line = 8)
    public final void method187(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            super.field9502 = arg1;
            super.field9506 = arg0;
            ++field200;
            super.field9498 = arg3;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IF)V", line = 22)
    public final void method188(int arg0, float arg1) {
        ++field199;
        if (arg0 <= 71) {
            this.method188(-126, -0.08571308F);
        }
        super.field9504 = arg1;
    }
}
