import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class77 implements class423 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Ldp;")
    public static class347 field1080 = new class347("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([IJLfp;I)Ljava/lang/String;", line = 6)
    public final String method562(int[] arg0, long arg1, class437 arg2, int arg3) {
        field1079++;
        if (arg3 < 125) {
            field1080 = null;
        }
        if (class316.field4879 == arg2) {
            class491 var6 = class59.field817.method2984(arg0[0], -14850);
            return var6.method2933(31, (int) arg1);
        } else if (class257.field3494 == arg2 || class275.field4104 == arg2) {
            class81 var7 = class164.field2437.method1749((int) arg1, -20230);
            return var7.field1131;
        } else if (class300.field4455 == arg2 || class27.field390 == arg2 || class117.field1751 == arg2) {
            return class59.field817.method2984(arg0[0], -14850).method2933(63, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 38)
    public static void method563(boolean arg0) {
        field1080 = null;
        if (!arg0) {
            field1080 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)V", line = 50)
    public static final void method564(boolean arg0, int arg1) {
        field1078++;
        if (arg1 != 0) {
            method563(true);
        }
        for (class203 var2 = (class203) class184.field2723.method2957(-54); var2 != null; var2 = (class203) class184.field2723.method2947(-95)) {
            if (var2.field2959 != null) {
                class176.field2598.method2372(var2.field2959);
                var2.field2959 = null;
            }
            if (var2.field2951 != null) {
                class176.field2598.method2372(var2.field2951);
                var2.field2951 = null;
            }
            var2.method876((byte) -96);
        }
        if (!arg0) {
            return;
        }
        for (class203 var3 = (class203) class150.field2286.method2957(-106); var3 != null; var3 = (class203) class150.field2286.method2947(arg1 + 30)) {
            if (var3.field2959 != null) {
                class176.field2598.method2372(var3.field2959);
                var3.field2959 = null;
            }
            var3.method876((byte) -96);
        }
        for (class203 var4 = (class203) class22.field323.method3061(-16817); var4 != null; var4 = (class203) class22.field323.method3066((byte) 122)) {
            if (var4.field2959 != null) {
                class176.field2598.method2372(var4.field2959);
                var4.field2959 = null;
            }
            var4.method876((byte) -96);
        }
    }
}
