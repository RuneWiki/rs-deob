import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class515 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method2873(int arg0, String arg1) {
        field6824++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = arg0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lkk;Ljava/awt/Frame;I)V")
    public static final void method2874(class192 arg0, Frame arg1, int arg2) {
        field6822++;
        while (true) {
            class198 var3 = arg0.method1316(1404065264, arg1);
            while (var3.field2987 == 0) {
                class226.method1447((byte) -124, 10L);
            }
            if (var3.field2987 == 1) {
                arg1.setVisible(false);
                if (arg2 != -2) {
                    method2873(80, null);
                }
                arg1.dispose();
                return;
            }
            class226.method1447((byte) -124, 100L);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 40 % ((arg3 - 43) / 56);
        field6823++;
        if (arg6 < 1 || arg8 < 1 || class719.field10004 - 2 < arg6 || (class107.field1453 - 2) < arg8) {
            return;
        }
        int var10 = arg2;
        if (arg2 < 3 && class498.method2810(-10387, arg6, arg8)) {
            var10 = arg2 + 1;
        }
        if (class411.field5711.field3890.method984(true) == 0 && !class753.method4218(arg6, class489.field6638, arg8, 2, var10)) {
            return;
        }
        if (class660.field8718 == null) {
            return;
        }
        class491.field6656.method2281(arg4, -84, arg2, arg6, class456.field6226[arg2], arg8, class341.field4807);
        if (arg5 < 0) {
            return;
        }
        int var11 = class411.field5711.field3904.method1631(true);
        class411.field5711.method1677(class411.field5711.field3904, (byte) -71, 1);
        class491.field6656.method2279(arg2, arg5, var10, arg8, arg1, arg6, (byte) -15, arg0, arg7, class341.field4807, class456.field6226[arg2]);
        class411.field5711.method1677(class411.field5711.field3904, (byte) -71, var11);
        return;
    }
}
