import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class272 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4343 = null;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Z")
    public static boolean field4348 = false;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "[Lbf;")
    public static class205[] field4344 = new class205[4];

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field4349 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[Z")
    public static boolean[] field4341 = new boolean[5];

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lab;")
    public static class269 field4346 = new class269();

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field4350 = 127;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lab;")
    public static class269 field4351 = new class269();

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4353 = "Opened title screen";

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lwb;")
    public static class123 field4352;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class61 var7 = new class61();
        var7.field793 = arg1 / 128;
        var7.field803 = arg2 / 128;
        var7.field779 = arg3 / 128;
        var7.field791 = arg4 / 128;
        var7.field809 = arg0;
        var7.field775 = arg1;
        var7.field807 = arg2;
        var7.field789 = arg3;
        var7.field808 = arg4;
        var7.field801 = arg5;
        var7.field799 = arg6;
        class120.field1704[class286.field4564++] = var7;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method1823(int arg0) {
        if (arg0 > -35) {
            field4352 = null;
        }
        class220 var1 = (class220) class24.field339.method1802(43);
        field4347++;
        while (var1 != null) {
            if (var1.field3520 > 0) {
                var1.field3520--;
            }
            if (var1.field3520 != 0) {
                if (var1.field3516 > 0) {
                    var1.field3516--;
                }
                if (var1.field3516 == 0 && var1.field3517 >= 1 && var1.field3523 >= 1 && var1.field3517 <= 102 && var1.field3523 <= 102 && (var1.field3515 < 0 || class209.method1470(31225, var1.field3530, var1.field3515))) {
                    class188.method1309(var1.field3530, var1.field3515, var1.field3523, true, var1.field3527, var1.field3519, var1.field3522, var1.field3517);
                    var1.field3516 = -1;
                    if (var1.field3515 == var1.field3513 && var1.field3513 == -1) {
                        var1.method1673(14510);
                    } else if (var1.field3515 == var1.field3513 && var1.field3522 == var1.field3518 && var1.field3530 == var1.field3529) {
                        var1.method1673(14510);
                    }
                }
            } else if (var1.field3513 < 0 || class209.method1470(31225, var1.field3529, var1.field3513)) {
                class188.method1309(var1.field3529, var1.field3513, var1.field3523, true, var1.field3527, var1.field3519, var1.field3518, var1.field3517);
                var1.method1673(14510);
            }
            var1 = (class220) class24.field339.method1815(0);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method1824(boolean arg0) {
        class80.field996 = null;
        class128.field2059 = null;
        field4342++;
        class63.field817 = null;
        if (arg0) {
            field4353 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4344 = null;
        field4353 = null;
        field4341 = null;
        field4351 = null;
        field4343 = null;
        field4346 = null;
        if (arg0 >= 0) {
            field4352 = null;
        }
    }
}
