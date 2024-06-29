import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class192 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lh;")
    public static class434 field2605 = new class434(22, 8);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Lh;")
    public static class434 field2606 = new class434(70, -2);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field2608 = 2;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lld;")
    public static class105 field2607 = new class105();

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field2609;

    // $FF: synthetic field
    @OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2610;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2607 = null;
        field2606 = null;
        if (arg0 == 1) {
            field2605 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILug;)V")
    public static final void method1098(int arg0, class363 arg1) {
        field2609++;
        if (class289.field3897 == null) {
            return;
        }
        class381 var2 = null;
        if (arg1.field4983 == 0) {
            var2 = (class381) class413.method2478(arg1.field4972, arg1.field4976, arg1.field4978);
        }
        if (arg1.field4983 == 1) {
            var2 = (class381) class425.method2509(arg1.field4972, arg1.field4976, arg1.field4978);
        }
        if (arg1.field4983 == arg0) {
            var2 = (class381) class4.method29(arg1.field4972, arg1.field4976, arg1.field4978, field2610 == null ? (field2610 = method1099("id")) : field2610);
        }
        if (arg1.field4983 == 3) {
            var2 = (class381) class146.method870(arg1.field4972, arg1.field4976, arg1.field4978);
        }
        if (var2 == null) {
            arg1.field4985 = 0;
            arg1.field4973 = 0;
            arg1.field4984 = -1;
        } else {
            arg1.field4984 = var2.method13(arg0 ^ 0x46);
            arg1.field4973 = var2.method4(-10666);
            arg1.field4985 = var2.method9(-769);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1099(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
