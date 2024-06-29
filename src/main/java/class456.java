import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class456 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "[I")
    public static int[] field6431 = new int[2048];

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Z")
    public static boolean field6432 = false;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field6434 = 0;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6433;

    // $FF: synthetic field
    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field6435;

    // $FF: synthetic method
    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2690(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lgh;I)V", line = 4)
    public static final void method2687(class41 arg0, int arg1) {
        field6430++;
        if (class293.field4356 == null) {
            return;
        }
        class116 var2 = null;
        if (arg0.field489 == 0) {
            var2 = (class116) class63.method320(arg0.field488, arg0.field495, arg0.field490);
        }
        if (arg0.field489 == 1) {
            var2 = (class116) class330.method2001(arg0.field488, arg0.field495, arg0.field490);
        }
        if (arg0.field489 == 2) {
            var2 = (class116) class263.method1603(arg0.field488, arg0.field495, arg0.field490, field6435 == null ? (field6435 = method2690("td")) : field6435);
        }
        if (~arg0.field489 == arg1) {
            var2 = (class116) class427.method2542(arg0.field488, arg0.field495, arg0.field490);
        }
        if (var2 == null) {
            arg0.field482 = 0;
            arg0.field485 = -1;
            arg0.field492 = 0;
        } else {
            arg0.field485 = var2.method16(false);
            arg0.field482 = var2.method26((byte) 73);
            arg0.field492 = var2.method31((byte) 82);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 45)
    public static void method2688(int arg0) {
        if (arg0 != -22084) {
            method2689(true, 74);
        }
        field6431 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZI)V", line = 59)
    public static final void method2689(boolean arg0, int arg1) {
        class244.method1332((byte) -76, class66.field821);
        field6433++;
        class444.field6330++;
        if (arg1 <= 126) {
            field6431 = null;
        }
        for (class68 var2 = (class68) class369.field5270.method241(0); var2 != null; var2 = (class68) class369.field5270.method239(0)) {
            if (!var2.method698(true)) {
                var2 = (class68) class369.field5270.method241(0);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field844 == 0) {
                class259.method1590(var2, arg0, -364, true);
            }
        }
        if (class345.field4934 != null) {
            class398.method2383(class345.field4934, 87);
            class345.field4934 = null;
        }
    }
}
