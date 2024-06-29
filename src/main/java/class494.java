import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class494 {

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "Lvd;")
    public static class39 field7034;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;I)I", line = 4)
    public static final int method2944(int arg0, String arg1, int arg2) {
        field7033++;
        if (arg2 != 512) {
            method2945(127);
        }
        return class313.method1978(arg1, true, arg0, -1);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V", line = 18)
    public static void method2945(int arg0) {
        field7034 = null;
        if (arg0 != 0) {
            field7034 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILns;)V", line = 31)
    public static final void method2946(int arg0, class405 arg1) {
        field7035++;
        int var2 = arg1.field6052 - class357.field5189;
        int var3 = arg1.field6093 * 512 + (arg1.method2579(false) * 256);
        int var4 = arg1.field6113 * 512 + (arg1.method2579(false) * 256);
        arg1.field8423 += (var3 - arg1.field8423) / var2;
        arg1.field8428 += (var4 - arg1.field8428) / var2;
        arg1.field6132 = 0;
        if (arg1.field6068 == 0) {
            arg1.method2584(8192, (byte) -94);
        }
        if (arg1.field6068 == 1) {
            arg1.method2584(12288, (byte) -105);
        }
        if (arg1.field6068 == 2) {
            arg1.method2584(0, (byte) -94);
        }
        if (arg1.field6068 == 3) {
            arg1.method2584(4096, (byte) -127);
        }
        if (arg0 < 19) {
            method2944(-80, null, 77);
        }
    }
}
