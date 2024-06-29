import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class221 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lid;")
    public static class149 field3873 = class60.method382("::setparticles", (byte) 19);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lid;")
    public static class149 field3877 = class60.method382("Forced tweening ENABLED(Q", (byte) 24);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lal;")
    public static class230 field3874;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)Z")
    public static final boolean method1488(int arg0, byte arg1) {
        field3871++;
        if (arg1 != -53) {
            return true;
        } else if (arg0 < 0) {
            return false;
        } else {
            int var2 = class284.field5032[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1001;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1489(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3875++;
        class47 var7 = class247.method1720(arg2, arg1 ^ 0xFFFFB940, arg4);
        if (var7 != null && var7.field777 != null) {
            class1 var8 = new class1();
            var8.field17 = var7.field777;
            var8.field13 = var7;
            class288.method1973(var8, 70);
        }
        class273.field4901 = arg5;
        if (arg1 != -50) {
            return;
        }
        class24.field368 = arg2;
        class97.field1717 = arg4;
        class247.field4332 = arg6;
        class216.field3805 = arg3;
        class40.field621 = true;
        class169.field3134 = arg0;
        class182.method1267(var7, 103);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public static final void method1490(int arg0, int arg1) {
        class216 var2 = class139.method972(arg1, false, 12);
        field3872++;
        var2.method1457(0);
        int var3 = -85 % ((arg0 - 42) / 58);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Lid;")
    public static final class149 method1491(int arg0) {
        if (arg0 != 2) {
            return null;
        }
        class149 var1;
        if (class43.field657 == 1 && class60.field1092 < 2) {
            var1 = class237.method1603(new class149[] { class43.field660, class213.field3775, class70.field1237, class197.field3586 }, -95);
        } else if (class40.field621 && class60.field1092 < 2) {
            var1 = class237.method1603(new class149[] { class197.field3581, class213.field3775, class230.field4017, class197.field3586 }, -103);
        } else if (class127.field2229 && class131.field2312[81] && class60.field1092 > 2) {
            var1 = class59.method365(class60.field1092 - 2, (byte) 116);
        } else {
            var1 = class59.method365(class60.field1092 - 1, (byte) 126);
        }
        if (class60.field1092 > 2) {
            var1 = class237.method1603(new class149[] { var1, class16.field232, class211.method1434(class60.field1092 - 2, true), class170.field3146 }, -128);
        }
        field3876++;
        return var1;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public static void method1492(int arg0) {
        if (arg0 != -7072) {
            field3874 = null;
        }
        field3873 = null;
        field3877 = null;
        field3874 = null;
    }
}
