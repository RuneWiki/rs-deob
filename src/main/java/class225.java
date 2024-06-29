import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class225 extends class631 {

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public int field2784;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "S")
    public static short field2782 = 1;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Lib;")
    public final class14 method203(byte arg0) {
        if (arg0 != -92) {
            this.field2784 = -34;
        }
        field2783++;
        return class45.field465;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)[Lib;")
    public static final class14[] method1356(int arg0) {
        if (arg0 >= -27) {
            field2782 = 88;
        }
        field2781++;
        return new class14[] { class652.field9152, class655.field9231, class295.field3685, class588.field8322, class365.field4897, class192.field2221, class373.field5080, class632.field8899, class325.field3998, class45.field465 };
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZLwp;)V")
    public static final void method1357(int arg0, int arg1, boolean arg2, class452 arg3) {
        field2780++;
        if (class348.field4665) {
            class166 var4 = class616.field8673 == -1 ? null : class53.field531.method1562(class616.field8673, (byte) -111);
            if (client.method3750(arg3).method1805((byte) -87) && (class512.field7345 & 0x20) != 0 && (var4 == null || arg3.method2606(class616.field8673, (byte) -92, var4.field1859) != var4.field1859)) {
                class666.field9302++;
                class53.method279(arg3.field6434, arg3.field6339, class679.field9566 + " -> " + arg3.field6428, 0L, 126, true, 3, class286.field3580, false, class185.field2084, arg3.field6360);
            }
        }
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class13.method61(arg3, (byte) -32, var5);
            if (var9 != null) {
                class357.field4789++;
                class53.method279(arg3.field6434, arg3.field6339, arg3.field6428, (long) (var5 + 1), 106, true, 1007, var9, false, class83.method434(var5, arg3, -1), arg3.field6360);
            }
        }
        if (arg2) {
            method1357(70, 49, false, null);
        }
        String var6 = class166.method913(arg3, 83);
        if (var6 != null) {
            class53.method279(arg3.field6434, arg3.field6339, arg3.field6428, 0L, 121, true, 8, var6, false, arg3.field6333, arg3.field6360);
            class554.field7921++;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class13.method61(arg3, (byte) -32, var7);
            if (var8 != null) {
                class53.method279(arg3.field6434, arg3.field6339, arg3.field6428, (long) (var7 + 1), 119, true, 10, var8, false, class83.method434(var7, arg3, -1), arg3.field6360);
                class357.field4789++;
            }
        }
        if (!client.method3750(arg3).method1804((byte) -107)) {
            return;
        }
        class168.field1875++;
        if (arg3.field6465 == null) {
            class53.method279(arg3.field6434, arg3.field6339, "", 0L, 111, true, 59, class198.field2294.method1195((byte) 62, class504.field7267), false, -1, arg3.field6360);
        } else {
            class53.method279(arg3.field6434, arg3.field6339, "", 0L, 106, true, 59, arg3.field6465, false, -1, arg3.field6360);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ldba;Lpa;IIIIIIIIIIIIII)V")
    public class225(class240 arg0, class648 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field2784 = arg15;
    }
}
