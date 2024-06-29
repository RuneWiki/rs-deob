import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class196 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field2536 = -1;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "S")
    public static short field2538 = 1;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field2542 = 1;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lgp;")
    public static class459 field2541 = new class459(11, 4);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lfb;")
    public static class35 field2535;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BC)Z", line = 7)
    public static final boolean method1265(byte arg0, char arg1) {
        if (arg0 > -71) {
            field2541 = null;
        }
        field2537++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method1266(boolean arg0, int arg1) {
        field2539++;
        if (!class421.field5647.field7715) {
            arg1 = -1;
        }
        if (arg0) {
            field2538 = -22;
        }
        if (class412.field5496 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class274 var2 = class363.field4684.method1100(arg1, 33);
            class136 var3 = var2.method1682(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class172.field2221.method2625(class272.field3454, new Point(var2.field3474, var2.field3485), var3.method956(), 124, var3.method955(), var3.method952());
                class412.field5496 = arg1;
            }
        }
        if (arg1 == -1 && class412.field5496 != -1) {
            class172.field2221.method2625(class272.field3454, new Point(), null, 18, -1, -1);
            class412.field5496 = -1;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 71)
    public static void method1267(int arg0) {
        field2541 = null;
        int var1 = 0 / ((61 - arg0) / 41);
        field2535 = null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Z", line = 81)
    public static final boolean method1268(int arg0) {
        if (arg0 != 1) {
            method1268(123);
        }
        field2540++;
        if (class251.field3199) {
            try {
                class425.method2515(class172.field2221.field6139, "showVideoAd", -27401);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
