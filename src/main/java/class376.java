import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class376 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lf;")
    public static class529[] field5707;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2342(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class315.field4754 <= arg7 && class156.field2455 >= arg4 && class70.field1213 <= arg3 && class389.field5859 >= arg6) {
            class498.method2987(arg1, arg7, 4, arg6, arg5, arg4, arg2, arg3);
        } else {
            class417.method2526(arg5, arg1, arg2, arg4, arg6, (byte) -124, arg3, arg7);
        }
        if (arg0 != 64) {
            method2344((byte) -42);
        }
        field5706++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2343(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field5708++;
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method2344(byte arg0) {
        field5707 = null;
        int var1 = -90 / ((arg0 - 5) / 42);
    }
}
