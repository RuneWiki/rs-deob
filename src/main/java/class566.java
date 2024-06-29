import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class566 {

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
    public static int[] field7974 = new int[8];

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field7976 = -1;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Z")
    public static boolean field7979 = false;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Lnea;")
    public static class664 field7977 = new class664(28, -1);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field7975;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field7978;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static void method3224(byte arg0) {
        field7977 = null;
        if (arg0 > 82) {
            field7974 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static final void method3225(int arg0) {
        field7978++;
        if (arg0 != 512) {
            return;
        }
        class382 var1 = class341.field5007;
        synchronized (class341.field5007) {
            class341.field5007.method2279(0);
        }
        class382 var2 = class622.field8668;
        synchronized (class622.field8668) {
            class622.field8668.method2279(0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static final void method3226(int arg0) {
        field7975++;
        class434 var1 = (class434) class311.field4614.method472((byte) -73);
        if (arg0 != -1) {
            field7974 = null;
        }
        while (var1 != null) {
            class513 var2 = var1.field6345;
            if (class564.field7962 > var2.field7216) {
                var1.method3678(-1);
                var2.method2932(125);
            } else if (var2.field7247 <= class564.field7962) {
                if (var2.field7240 > 0) {
                    class16 var3 = (class16) class189.field2723.method1405((long) (var2.field7240 - 1), (byte) -57);
                    if (var3 != null) {
                        class577 var4 = var3.field174;
                        if (var4.field3024 >= 0 && var4.field3024 < class199.field2812 * 512 && var4.field3029 >= 0 && var4.field3029 < class232.field3611 * 512) {
                            var2.method2938(class674.method3748(var4.field3024, var2.field3019, 114, var4.field3029) - var2.field7223, class564.field7962, var4.field3029, 1, var4.field3024);
                        }
                    }
                }
                if (var2.field7240 < 0) {
                    int var5 = -var2.field7240 - 1;
                    class491 var6;
                    if (class99.field1551 == var5) {
                        var6 = class648.field9106;
                    } else {
                        var6 = class141.field2087[var5];
                    }
                    if (var6 != null && var6.field3024 >= 0 && var6.field3024 < class199.field2812 * 512 && var6.field3029 >= 0 && (class232.field3611 * 512) > var6.field3029) {
                        var2.method2938(class674.method3748(var6.field3024, var2.field3019, 82, var6.field3029) - var2.field7223, class564.field7962, var6.field3029, arg0 + 2, var6.field3024);
                    }
                }
                var2.method2935(16383, class312.field4621);
                class598.method3381(var2, true);
            }
            var1 = (class434) class311.field4614.method482(-57);
        }
    }
}
