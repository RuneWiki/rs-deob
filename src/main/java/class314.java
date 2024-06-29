import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class314 {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
    public static int[] field4623 = new int[250];

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIBIIII)V", line = 3)
    public static final void method2101(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field4624++;
        if (arg2 == arg6) {
            class91.method545(arg0, arg4, 2, arg7, arg1, arg6, arg5);
            return;
        }
        if (arg1 - arg6 >= class408.field5789 && arg1 + arg6 <= class231.field3415 && class245.field3659 <= arg7 - arg2 && (arg7 + arg2) <= class240.field3547) {
            class196.method1398(arg1, arg7, arg2, arg5, 3, arg4, arg0, arg6);
        } else {
            class376.method2399(arg2, arg6, (byte) -128, arg4, arg0, arg1, arg7, arg5);
        }
        int var8 = 71 / ((arg3 + 1) / 55);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/awt/Frame;Lml;I)V", line = 28)
    public static final void method2102(Frame arg0, class219 arg1, int arg2) {
        while (true) {
            class156 var3 = arg1.method1531(true, arg0);
            while (var3.field2298 == 0) {
                class259.method1790((byte) -89, 10L);
            }
            if (var3.field2298 == 1) {
                field4619++;
                int var4 = 100 % ((12 - arg2) / 48);
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class259.method1790((byte) -124, 100L);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 52)
    public static void method2103(boolean arg0) {
        field4623 = null;
        if (!arg0) {
            field4623 = null;
        }
    }
}
