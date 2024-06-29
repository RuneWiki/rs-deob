import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class385 {

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "Lom;")
    public static class344 field5656;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "Lkp;")
    public static class456 field5653;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "Laea;")
    public static class47 field5659;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
    public static boolean field5657;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)V")
    public static final void method2381(boolean arg0) {
        field5658++;
        class419.field6038.method1912(-2552);
        if (arg0) {
            field5653 = null;
        }
        class22.field867.method1912(-2552);
        class366.field5424.method1912(-2552);
        class341.field5071.method1912(-2552);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
    public static void method2382(byte arg0) {
        field5659 = null;
        if (arg0 == -69) {
            field5656 = null;
            field5653 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IBII)Lmu;")
    public static final class275 method2383(int arg0, byte arg1, int arg2, int arg3) {
        field5654++;
        class275 var4 = null;
        if (arg3 == 0) {
            var4 = class185.method1355(0, class687.field9730, class395.field5772);
            class620.field8978++;
        }
        if (arg3 == 1) {
            var4 = class185.method1355(0, class527.field7430, class395.field5772);
            class32.field959++;
        }
        var4.field4103.method746(0, arg0 + class323.field4749);
        if (arg1 > -24) {
            return null;
        }
        var4.field4103.method746(0, class33.field967 + arg2);
        var4.field4103.method744((byte) -54, class486.field6965.method2194(82, (byte) 93) ? 1 : 0);
        class202.field3118 = false;
        class459.field6558 = arg2;
        class51.field1189 = arg0;
        class703.method3925(120);
        return var4;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Loea;I)V")
    public static final void method2384(class555 arg0, int arg1) {
        field5655++;
        arg0.field7862 = false;
        if (arg0.field7864 != null) {
            arg0.field7864.field4638 = 0;
        }
        for (class555 var2 = arg0.method233(); var2 != null; var2 = arg0.method227()) {
            method2384(var2, arg1);
        }
        if (arg1 != 65449) {
            method2383(35, (byte) 108, 97, 50);
        }
    }
}
