import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class503 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "Ldb;")
    public static class298 field6721 = new class298(98, -1);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZII)I", line = 6)
    public static final int method2791(int arg0, boolean arg1, int arg2, int arg3) {
        field6720++;
        if (arg0 != 98) {
            field6721 = null;
        }
        class521 var4 = class265.method1620(arg3, arg1, false);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field6958.length; var6++) {
                if (var4.field6961[var6] == arg2) {
                    var5 += var4.field6958[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 40)
    public static void method2792(boolean arg0) {
        if (arg0) {
            field6721 = null;
        }
        field6721 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILjava/lang/Class;)Lag;", line = 56)
    public static final class641 method2793(int arg0, int arg1, int arg2, Class arg3) {
        class24 var4 = class703.field9899[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class684 var5 = var4.field409; var5 != null; var5 = var5.field9618) {
            class641 var6 = var5.field9619;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8611 == arg1 && var6.field8618 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIBI)V", line = 84)
    public static final void method2794(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field6719++;
        class442.field6058 = arg0;
        class600.field7959 = arg2;
        class310.field4279 = arg1;
        class366.field4956 = arg4;
        int var5 = 30 % ((arg3 + 31) / 43);
    }
}
