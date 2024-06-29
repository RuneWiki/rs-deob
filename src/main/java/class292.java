import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class292 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3822 = -1;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lqk;")
    public static class148 field3821 = new class148(29, -1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lvi;")
    public class368 field3823;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1715(byte arg0) {
        field3821 = null;
        if (arg0 >= -5) {
            field3822 = 63;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lhaa;ZLju;)Lrea;")
    public static final class120 method1716(class311 arg0, boolean arg1, class102 arg2) {
        field3819++;
        class120 var3 = class538.method3213(334);
        if (!arg1) {
            field3821 = null;
        }
        var3.field1656 = arg2.field1461;
        var3.field1655 = arg2;
        if (var3.field1656 == -1) {
            var3.field1653 = new class583(260);
        } else if (var3.field1656 == -2) {
            var3.field1653 = new class583(10000);
        } else if (var3.field1656 <= 18) {
            var3.field1653 = new class583(20);
        } else if (var3.field1656 <= 98) {
            var3.field1653 = new class583(100);
        } else {
            var3.field1653 = new class583(260);
        }
        var3.field1653.method3459(arg0, 121);
        var3.field1653.method3457((byte) 0, var3.field1655.method689(100));
        var3.field1652 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIII)V")
    public static final void method1717(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3820++;
        if (arg3 == 8 || arg3 == 16) {
            for (int var6 = 0; var6 < class290.field3802; var6++) {
                class27 var8 = class78.field1059[var6];
                if (var8.field351 == arg3 && var8.field356 == arg4 && var8.field350 == arg2 || var8.field349 == arg4 && var8.field350 == arg2) {
                    if (class290.field3802 != var6) {
                        class34.method242(class78.field1059, var6 + 1, class78.field1059, var6, class78.field1059.length - var6 - 1);
                    }
                    class290.field3802--;
                    return;
                }
            }
        } else {
            class38 var5 = class352.field4549[arg1][arg4][arg2];
            if (var5 != null) {
                if (arg3 == 1) {
                    var5.field544 = 0;
                } else if (arg3 == 2) {
                    var5.field536 = 0;
                }
            }
            class463.method2768(false);
        }
        int var7 = -13 / ((47 - arg0) / 54);
    }
}
