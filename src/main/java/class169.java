import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class169 extends class305 {

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "[I")
    public static int[] field2650 = new int[16];

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "Lvd;")
    public static class39 field2651;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field2648;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(I)I")
    public final int method1226(int arg0) {
        ++field2652;
        return arg0 != 17503 ? -124 : super.field4320;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(ILhb;)V")
    public class169(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
    public static void method1227(int arg0) {
        field2648 = null;
        field2651 = null;
        if (arg0 != 0) {
            method1227(79);
        }
        field2650 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -23;
        } else {
            ++field2646;
            return 0;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        ++field2645;
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method305((byte) 21);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (arg0 >= -40) {
            field2648 = null;
        }
        ++field2649;
    }

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            field2650 = null;
        }
        ++field2647;
        return 1;
    }

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lhb;)V")
    public class169(class728 arg0) {
        super(arg0);
    }
}
