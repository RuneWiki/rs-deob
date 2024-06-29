import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class544 extends class57 {

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZLgj;)I")
    public static final int method3066(boolean arg0, class662 arg1) {
        field7408++;
        if (!arg0) {
            method3066(false, null);
        }
        int var2 = 0;
        if (arg1.method3737(class393.field5397, false)) {
            var2++;
        }
        if (arg1.method3737(class271.field3795, false)) {
            var2++;
        }
        if (arg1.method3737(class433.field5894, false)) {
            var2++;
        }
        if (arg1.method3737(class538.field7315, false)) {
            var2++;
        }
        if (arg1.method3737(class252.field3537, false)) {
            var2++;
        }
        if (arg1.method3737(class60.field832, false)) {
            var2++;
        }
        if (arg1.method3737(class636.field8787, false)) {
            var2++;
        }
        if (arg1.method3737(class256.field3598, !arg0)) {
            var2++;
        }
        if (arg1.method3737(class629.field8746, false)) {
            var2++;
        }
        if (arg1.method3737(class766.field10573, false)) {
            var2++;
        }
        if (arg1.method3737(class173.field2759, false)) {
            var2++;
        }
        if (arg1.method3737(class45.field697, false)) {
            var2++;
        }
        if (arg1.method3737(class112.field2111, false)) {
            var2++;
        }
        if (arg1.method3737(class38.field640, false)) {
            var2++;
        }
        if (arg1.method3737(class492.field6721, false)) {
            var2++;
        }
        if (arg1.method3737(class628.field8734, !arg0)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
    public static final void method3067(int arg0, int arg1, int arg2) {
        field7409++;
        if (class369.field5000 == null) {
            return;
        }
        int var3 = class262.field3681;
        int var4 = class317.field4324;
        if (arg0 != 1) {
            return;
        }
        class198.method1427(arg2, arg1, 359767393);
        if (class278.field3847 == 0) {
            class290.field4002 = null;
            class290.field4002 = class369.field5000.method546(class369.field5000.method562(class256.field3597, class663.field9209), class369.field5000.method540(class256.field3597, class663.field9209));
        } else if (class278.field3847 == 1 && (class687.field9555 == null || class262.field3681 != var3 || class317.field4324 != var4)) {
            class687.field9555 = new class574[class317.field4324 * class262.field3681];
            for (int var5 = 0; var5 < class687.field9555.length; var5++) {
                class687.field9555[var5] = class369.field5000.method546(class369.field5000.method562(class658.field9108, class471.field6394), class369.field5000.method540(class658.field9108, class471.field6394));
            }
            class599.field8386 = 1;
            class449.field6157 = new int[class317.field4324 * class262.field3681];
        }
        class180.field2828 = true;
    }
}
