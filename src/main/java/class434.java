import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class434 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Luv;")
    public static class2 field6413 = new class2(110, 12);

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Lhu;")
    public static class404 field6415 = new class404(0, 0);

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Ldp;")
    public static class347 field6416 = new class347("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z", line = 27)
    public static final boolean method2558(int arg0, int arg1) {
        field6417++;
        if (arg0 == 55) {
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 41)
    public static final void method2559(int arg0) {
        field6414++;
        if (class256.field3477 == -1 || arg0 < 28) {
            return;
        }
        int var1 = class45.field591.method44((byte) 106);
        int var2 = class45.field591.method54(28455);
        class376 var3 = (class376) class483.field7130.method2957(-125);
        if (var3 != null) {
            var1 = var3.method952(25407);
            var2 = var3.method954(3);
        }
        class462.method2677(0, 0, var2, class256.field3477, (byte) 126, class155.field2347, 0, class413.field6241, 0, var1);
        if (class316.field4886 != null) {
            class14.method189(var2, -19777, var1);
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V", line = 77)
    public static void method2560(int arg0) {
        field6415 = null;
        field6416 = null;
        if (arg0 != 95) {
            field6416 = null;
        }
        field6413 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lmv;)V", line = 130)
    public static final void method2561(class522 arg0) {
        for (int var1 = arg0.field7687; var1 <= arg0.field7683; var1++) {
            for (int var2 = arg0.field7676; var2 <= arg0.field7673; var2++) {
                class306 var3 = class236.field3305[arg0.field7686][var1][var2];
                if (var3 != null) {
                    class17 var4 = var3.field4589;
                    class17 var5 = null;
                    while (var4 != null) {
                        if (var4.field279 == arg0) {
                            if (var5 == null) {
                                var3.field4589 = var4.field281;
                            } else {
                                var5.field281 = var4.field281;
                            }
                            var4.method198(-106);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field281;
                    }
                    var3.field4594 = 0;
                    for (class17 var6 = var3.field4589; var6 != null; var6 = var6.field281) {
                        var3.field4594 = (byte) (var3.field4594 | var6.field277);
                    }
                }
            }
        }
    }
}
