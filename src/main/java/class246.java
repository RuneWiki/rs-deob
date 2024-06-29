import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class246 extends class339 {

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    public static int[] field3489 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1640(byte arg0) {
        field3489 = null;
        if (arg0 <= 102) {
            method1642(null, null, null, null, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1641(String arg0, String arg1, String arg2, byte arg3) {
        field3488++;
        if (arg3 == -52) {
            for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, arg1.length() + var4)) {
                arg2 = arg2.substring(0, var4) + arg1 + arg2.substring(var4 + arg0.length());
            }
            return arg2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lgj;Lgj;Lgj;Lgj;B)V")
    public static final void method1642(class662 arg0, class662 arg1, class662 arg2, class662 arg3, byte arg4) {
        class724.field9956 = arg1;
        class743.field10265 = arg2;
        int var5 = 34 / ((-arg4 - 46) / 38);
        field3487++;
        class435.field5915 = arg3;
        class431.field5870 = new class17[class724.field9956.method3723(5)][];
        class157.field2548 = new boolean[class724.field9956.method3723(5)];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Lpj;")
    public abstract class158 method428(boolean arg0);

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static final void method1643(int arg0) {
        if (arg0 != -15349) {
            return;
        }
        field3486++;
        for (class272 var1 = (class272) class280.field3893.method3589((byte) -128); var1 != null; var1 = (class272) class280.field3893.method3591(arg0 + 15349)) {
            class104 var2 = var1.field3797;
            if (var2.field1676) {
                var1.method1207(98);
                var2.method897(0);
            } else if (class440.field5977 >= var2.field1660) {
                var2.method911((byte) -91, class241.field3425);
                if (var2.field1676) {
                    var1.method1207(88);
                } else {
                    class737.method4088(var2, true);
                }
            }
        }
    }
}
