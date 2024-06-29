import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class386 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field5583 = 0;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Z")
    public static boolean field5578 = false;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5584 = null;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Z")
    public static boolean field5580 = false;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field5579;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lla;")
    public static class423 field5586;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Luda;")
    public static class439 field5581;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[Ljw;")
    public static class280[] field5582;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[[[Ldn;")
    public static class375[][][] field5587;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLha;)V")
    public static final void method2375(byte arg0, class543 arg1) {
        field5588++;
        class564.field8163 = class468.method2821(class505.field7348, -1978582392, arg1, true);
        class426.field6164 = class62.method578((byte) -106, arg1, class505.field7348);
        if (arg0 != 49) {
            method2375((byte) -45, null);
        }
        class208.field3141 = class468.method2821(class555.field8066, -1978582392, arg1, true);
        class79.field1140 = class62.method578((byte) -106, arg1, class555.field8066);
        class193.field2838 = class468.method2821(class265.field3791, arg0 ^ 0x8A113AB9, arg1, true);
        class119.field1635 = class62.method578((byte) -106, arg1, class265.field3791);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
    public static void method2376(boolean arg0) {
        field5582 = null;
        if (!arg0) {
            field5582 = null;
        }
        field5584 = null;
        field5587 = null;
        field5581 = null;
        field5586 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B[Ljava/lang/String;)V")
    public static final void method2377(byte arg0, String[] arg1) {
        if (arg0 != -105) {
            return;
        }
        field5585++;
        if (arg1.length <= 1) {
            class683.field9700 = class683.field9700 + arg1[0];
            class308.field4179 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class646.method3726("Pausing for " + var3 + " seconds...", -117);
                class270.field3837 = var2 + 1;
                class338.field4663 = arg1;
                class704.field9920 = (long) (var3 * 1000) + class465.method2818(arg0 + 360);
                return;
            }
            class683.field9700 = arg1[var2];
            class494.method3008(false, 0);
        }
    }
}
