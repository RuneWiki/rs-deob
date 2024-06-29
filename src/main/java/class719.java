import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class719 extends class305 {

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field10094;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public static int field10095;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field10096;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return 56;
        } else {
            ++field10095;
            return !super.field4323.method4110(-22215) ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(ILhb;)V")
    public class719(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field10094;
        if (arg0 == -27751) {
            super.field4320 = arg1;
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lhb;)V")
    public class719(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (arg0 < -40) {
            ++field10098;
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
    public final int method4081(int arg0) {
        ++field10097;
        return arg0 != 17503 ? 7 : super.field4320;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field10096;
        return arg0 != 31401 ? 52 : 3;
    }
}
