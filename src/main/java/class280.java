import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public abstract class class280 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ljk;")
    public static class585 field3804 = new class585(56, -1);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Log;")
    public static class599 field3802;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method1682(int arg0) {
        field3803++;
        class601 var1 = (class601) class6.field49.method1132((byte) -99);
        if (arg0 <= 31) {
            return;
        }
        while (var1 != null) {
            class15 var2 = var1.field8664;
            if (class543.field7882 > var2.field253) {
                var1.method3045(true);
                var2.method157(-1606746551);
            } else if (class543.field7882 >= var2.field277) {
                if (var2.field269 > 0) {
                    class633 var3 = (class633) class522.field7662.method3678((long) (var2.field269 - 1), -127);
                    if (var3 != null) {
                        class557 var4 = var3.field9097;
                        if (var4.field530 >= 0 && (class473.field6604 * 512) > var4.field530 && var4.field531 >= 0 && var4.field531 < class205.field2465 * 512) {
                            var2.method174(var4.field531, var4.field530, class589.method3416(var4.field530, -103, var2.field532, var4.field531) - var2.field261, class543.field7882, -95);
                        }
                    }
                }
                if (var2.field269 < 0) {
                    int var5 = -var2.field269 - 1;
                    class613 var6;
                    if (class63.field1016 == var5) {
                        var6 = class206.field2472;
                    } else {
                        var6 = class184.field2252[var5];
                    }
                    if (var6 != null && var6.field530 >= 0 && var6.field530 < (class473.field6604 * 512) && var6.field531 >= 0 && class205.field2465 * 512 > var6.field531) {
                        var2.method174(var6.field531, var6.field530, class589.method3416(var6.field530, -28, var2.field532, var6.field531) - var2.field261, class543.field7882, 65);
                    }
                }
                var2.method158(512, class456.field6422);
                class667.method3777(var2, true);
            }
            var1 = (class601) class6.field49.method1134(8446);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Lbi;")
    public abstract class446 method1683(boolean arg0);

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public abstract void method1684(boolean arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)Lff;")
    public static final class9 method1685(byte arg0) {
        field3801++;
        if (class550.field7987 == null || class327.field4363 == null) {
            return null;
        }
        class327.field4363.method773(class550.field7987, 81);
        class9 var1 = (class9) class327.field4363.method774(120);
        if (var1 == null) {
            return null;
        } else {
            int var2 = 9 % ((arg0 - 60) / 36);
            class289 var3 = class550.field7973.method3816(20, var1.field90);
            return var3 != null && var3.field3925 && var3.method1718(class550.field7970, (byte) 24) ? var1 : class193.method1183(28);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public abstract void method1686(int arg0);

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
    public abstract boolean method1687(int arg0, int arg1);

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method1688(int arg0) {
        field3802 = null;
        if (arg0 != 0) {
            method1685((byte) 32);
        }
        field3804 = null;
    }
}
