import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class20 {

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "[S")
    public static short[] field267 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 4)
    public static final void method117(byte arg0) {
        class408 var1 = class218.field3060;
        synchronized (class218.field3060) {
            class218.field3060.method2530((byte) -105);
            int var2 = 121 / ((arg0 - 29) / 61);
        }
        field266++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 16)
    public static void method118(byte arg0) {
        field267 = null;
        if (arg0 <= 104) {
            method119(true, 4, (Component) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZILjava/awt/Component;)Lkr;", line = 31)
    public static final class6 method119(boolean arg0, int arg1, Component arg2) {
        field265++;
        if (arg1 > -22) {
            field267 = null;
        }
        return new class211(arg2, arg0);
    }
}
