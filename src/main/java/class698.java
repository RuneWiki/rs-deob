import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class698 {

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field9800 = 2;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field9801 = 100;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Laq;")
    public static class494 field9802 = new class494(128, 4);

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field9803;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field9804;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method3915(boolean arg0) {
        if (!arg0) {
            field9802 = null;
        }
        field9802 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLol;)Lwb;")
    public static final class579 method3916(byte arg0, class431 arg1) {
        field9803++;
        class714 var2 = class677.method3792(arg1, 0);
        int var3 = arg1.method2526(17);
        int var4 = arg1.method2526(17);
        if (arg0 >= -76) {
            field9802 = null;
        }
        return new class579(var2.field9967, var2.field9961, var2.field9958, var2.field9969, var2.field9960, var2.field9968, var2.field9970, var2.field9962, var2.field9959, var3, var4);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method3917(int arg0) {
        field9804++;
        class420.field5820.method3781(class420.field5820.field9496, 113, 1);
        class420.field5820.method3781(class420.field5820.field9495, 92, 1);
        class420.field5820.method3781(class420.field5820.field9483, 114, 1);
        class420.field5820.method3781(class420.field5820.field9460, 91, 1);
        if (arg0 <= 88) {
            method3915(true);
        }
        class420.field5820.method3781(class420.field5820.field9479, 71, 1);
        class420.field5820.method3781(class420.field5820.field9454, 121, 1);
        class420.field5820.method3781(class420.field5820.field9468, 119, 0);
        class420.field5820.method3781(class420.field5820.field9490, 90, 0);
        class420.field5820.method3781(class420.field5820.field9450, 76, 0);
        class420.field5820.method3781(class420.field5820.field9457, 127, 0);
        class420.field5820.method3781(class420.field5820.field9487, 109, 0);
        class420.field5820.method3781(class420.field5820.field9481, 95, 0);
        class420.field5820.method3781(class420.field5820.field9489, 107, 0);
        class420.field5820.method3781(class420.field5820.field9459, 85, 0);
        class420.field5820.method3781(class420.field5820.field9485, 111, 0);
        class420.field5820.method3781(class420.field5820.field9447, 87, 0);
        class420.field5820.method3781(class420.field5820.field9453, 126, 0);
        class420.field5820.method3781(class420.field5820.field9461, 92, 0);
        class420.field5820.method3781(class420.field5820.field9476, 69, 0);
        class343.method2105(4);
        class420.field5820.method3781(class420.field5820.field9493, 88, 2);
        class420.field5820.method3781(class420.field5820.field9443, 71, 2);
        class319.method1936((byte) 127);
        class166.method1239(false);
        class789.field10785 = true;
    }
}
