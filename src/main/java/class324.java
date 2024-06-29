import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class324 {

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "Lcja;")
    public static class83 field4001 = new class83();

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "F")
    public static float field4003;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "[[[Lmf;")
    public static class766[][][] field4002;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1877(boolean arg0) {
        if (!arg0) {
            method1877(false);
        }
        field4001 = null;
        field4002 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILjava/lang/String;)V", line = 18)
    public static final void method1878(int arg0, int arg1, String arg2) {
        field4000++;
        class614 var3 = class497.method2759(arg0, arg0 + 5975, (long) arg1);
        var3.method3277(639);
        var3.field7737 = arg2;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIILfa;)V", line = 33)
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, class590 arg4) {
        class766 var5 = class196.method1355(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field2896 = (arg1 << class88.field1221) + class686.field8834;
        arg4.field2892 = arg3;
        arg4.field2900 = (arg2 << class88.field1221) + class686.field8834;
        var5.field10425 = arg4;
        int var6 = class735.field9973 == class116.field1542 ? 1 : 0;
        if (arg4.method743((byte) -77)) {
            if (arg4.method738(true)) {
                arg4.field2890 = class336.field4089[var6];
                class336.field4089[var6] = arg4;
                return;
            }
            arg4.field2890 = class177.field2327[var6];
            class177.field2327[var6] = arg4;
            class689.field8852 = true;
            return;
        }
        arg4.field2890 = class640.field8187[var6];
        class640.field8187[var6] = arg4;
    }
}
