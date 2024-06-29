import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class352 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "D")
    public static double field4837 = -1.0D;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4842 = null;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "[I")
    public static int[] field4846 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "Z")
    public static boolean field4847 = false;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "F")
    public static float field4845;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "[I")
    public static int[] field4844;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2169(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -44) {
            field4842 = null;
        }
        field4840++;
        if (arg3 == arg5) {
            class30.method193(55, arg2, arg4, arg6, arg1, arg3, arg7);
        } else if ((arg7 - arg3) >= class295.field4153 && class103.field1457 >= arg3 + arg7 && class444.field6338 <= arg4 - arg5 && (arg4 + arg5) <= class151.field2091) {
            class477.method2827(arg1, arg3, arg4, arg7, arg2, arg5, arg6, 109);
        } else {
            class269.method1822(7385, arg3, arg1, arg6, arg5, arg2, arg7, arg4);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(CI)Z")
    public static final boolean method2170(char arg0, int arg1) {
        field4839++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != 28728) {
                method2172(109, -121, -121);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public static void method2171(byte arg0) {
        if (arg0 == 7) {
            field4844 = null;
            field4842 = null;
            field4846 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)Lct;")
    public static final class334 method2172(int arg0, int arg1, int arg2) {
        if (arg2 != 16711935) {
            return null;
        }
        field4841++;
        class334 var3 = (class334) class430.field6032.method1104(-127, (long) arg0 | (long) arg1 << 32);
        if (var3 == null) {
            var3 = new class334(arg1, arg0);
            class430.field6032.method1100(var3, 118, var3.field6382);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
    public static final void method2173(int arg0) {
        field4838++;
        if (class205.field3009 != null) {
            class205.field3009.method1058(4);
        }
        if (class411.field5619 != null) {
            class411.field5619.method1058(4);
        }
        class114.method904(arg0, class55.field817, 22050, 50);
        class205.field3009 = class481.method2838(true, class436.field6206, class33.field338, 22050, 0);
        class205.field3009.method1069(class342.field4719, (byte) -110);
        class411.field5619 = class481.method2838(true, class436.field6206, class33.field338, 2048, 1);
        class411.field5619.method1069(class332.field4613, (byte) -117);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBILto;I)V")
    public static final void method2174(int arg0, byte arg1, int arg2, class143 arg3, int arg4) {
        field4843++;
        long var5 = (long) (arg2 | arg0 << 28 | arg4 << 14);
        class223 var7 = (class223) class427.field5956.method1104(-124, var5);
        if (var7 == null) {
            class223 var8 = new class223();
            class427.field5956.method1100(var8, -26, var5);
            var8.field3219.method766(arg3, -1);
            return;
        }
        class156 var9 = class373.field5128.method1644(arg3.field1987, 107);
        int var10 = var9.field2226;
        if (var9.field2212 == 1) {
            var10 = (arg3.field1992 + 1) * var10;
        }
        if (arg1 >= -28) {
            method2172(-77, -81, -110);
        }
        for (class143 var11 = (class143) var7.field3219.method775(1); var11 != null; var11 = (class143) var7.field3219.method763(0)) {
            class156 var12 = class373.field5128.method1644(var11.field1987, 122);
            int var13 = var12.field2226;
            if (var12.field2212 == 1) {
                var13 = (var11.field1992 + 1) * var13;
            }
            if (var13 < var10) {
                class218.method1501(var11, false, arg3);
                return;
            }
        }
        var7.field3219.method766(arg3, -1);
    }
}
