import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class222 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lhc;")
    public static class368 field3109 = new class368("red:", "", "", "");

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1466(int arg0) {
        field3107++;
        class331 var1 = null;
        try {
            class285 var2 = class122.field1839.method591(arg0 - 1940);
            while (var2.field3875 == 0) {
                class328.method1999(0, 1L);
            }
            if (var2.field3875 == arg0) {
                var1 = (class331) var2.field3871;
                class366 var3 = new class366((class214.field2993 * 6) + 3);
                var3.method2280(1, 1537846408);
                var3.method2275(122, class214.field2993);
                for (int var4 = 0; var4 < class128.field1936.length; var4++) {
                    if (class42.field562[var4]) {
                        var3.method2275(121, var4);
                        var3.method2261(class128.field1936[var4], -176);
                    }
                }
                var1.method2008(0, true, var3.field5048, var3.field5076);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2009(arg0 ^ 0xFFFFFFD1);
            }
        } catch (Exception var5) {
        }
        class407.field5638 = class199.method1372(30938);
        class35.field479 = false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public static void method1467(boolean arg0) {
        field3109 = null;
        if (arg0) {
            field3109 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLvg;)Ljava/lang/String;")
    public static final String method1468(int arg0, boolean arg1, class108 arg2) {
        if (arg1) {
            return null;
        }
        field3110++;
        if (!client.method1634(arg2).method1877(1, arg0) && arg2.field1667 == null) {
            return null;
        } else if (arg2.field1571 == null || arg2.field1571.length <= arg0 || arg2.field1571[arg0] == null || arg2.field1571[arg0].trim().length() == 0) {
            return class42.field542 ? "Hidden-" + arg0 : null;
        } else {
            return arg2.field1571[arg0];
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method1469(int arg0, int arg1) {
        if (arg0 != -20872) {
            field3109 = null;
        }
        field3108++;
        return arg1 & 0xFF;
    }
}
