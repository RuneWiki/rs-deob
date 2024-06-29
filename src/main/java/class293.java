import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class293 extends class578 {

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "[I")
    public static int[] field4430 = new int[3];

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "(I)Ljava/lang/String;")
    public static final String method1979(int arg0) {
        if (arg0 != 16307) {
            field4432 = -25;
        }
        ++field4433;
        if (!class422.field5962 && class50.field723 != null) {
            return (class50.field723.field4633 == null || ~class50.field723.field4633.length() == -1) && class50.field723.field4636 != null && ~class50.field723.field4636.length() < -1 ? class50.field723.field4636 : class50.field723.field4633;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)V")
    public final void method1980(int arg0, int arg1, int arg2, int arg3) {
        ++field4431;
        super.field8174 = arg2;
        if (arg1 != 0) {
            field4430 = null;
        }
        super.field8177 = arg3;
        super.field8165 = arg0;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IF)V")
    public final void method1981(int arg0, float arg1) {
        ++field4429;
        super.field8169 = arg1;
        int var3 = 98 % ((arg0 - -28) / 52);
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(IIIIIF)V")
    public class293(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "(I)V")
    public static void method1982(int arg0) {
        int var1 = 43 / ((arg0 - -9) / 62);
        field4430 = null;
    }
}
