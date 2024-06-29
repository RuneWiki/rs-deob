import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class22 {

    @OriginalMember(owner = "client!li", name = "a", descriptor = "Ljava/lang/String;")
    public static String field282 = "wave2:";

    @OriginalMember(owner = "client!li", name = "c", descriptor = "[I")
    public static int[] field284 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field290 = -1;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Ljava/lang/String;")
    public static String field286 = "wave:";

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Z")
    public static boolean field287 = false;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 17)
    public static void method133(byte arg0) {
        field286 = null;
        field282 = null;
        field284 = null;
        if (arg0 != 14) {
            field290 = -115;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)Lhm;", line = 33)
    public static final class48 method134(int arg0, int arg1, int arg2, int arg3) {
        field283++;
        class48 var4 = new class48();
        var4.field595 = arg3;
        var4.field594 = arg2;
        class211.field3056.method120((long) arg1, var4, -22851);
        class45.method289(arg3, true);
        class344 var5 = class151.method1101(-78, arg1);
        if (var5 != null) {
            class255.method1741(var5, false);
        }
        if (class187.field2591 != null) {
            class255.method1741(class187.field2591, false);
            class187.field2591 = null;
        }
        int var6 = class204.field2938;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class340.method2353(class54.field722[var7], -128)) {
                class97.method708(var7, arg0 - 4675);
            }
        }
        if (arg0 != 4571) {
            return (class48) null;
        }
        if (class204.field2938 == 1) {
            class100.field1380 = false;
            class253.method1728(class183.field2524, class218.field3131, (byte) 79, class312.field4704, class8.field79);
        } else {
            class253.method1728(class183.field2524, class218.field3131, (byte) 86, class312.field4704, class8.field79);
            int var8 = class204.field2946.method1904(class291.field4342);
            for (int var9 = 0; var9 < class204.field2938; var9++) {
                int var10 = class204.field2946.method1904(class51.method353(-103, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class218.field3131 = class204.field2938 * 15 + (class141.field1924 ? 26 : 22);
            class183.field2524 = var8 + 8;
        }
        if (var5 != null) {
            class275.method1893(-24740, false, var5);
        }
        class241.method1654(arg3, (byte) -105);
        if (class183.field2521 != -1) {
            class52.method358(1, class183.field2521, 18248);
        }
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 120)
    public static final void method135(Component arg0, boolean arg1) {
        if (arg1) {
            field284 = (int[]) null;
        }
        Method var2 = class80.field1168;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class171.field2336);
        field288++;
        arg0.addFocusListener(class171.field2336);
    }
}
