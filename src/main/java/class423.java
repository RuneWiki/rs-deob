import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class423 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6293 = "Hidden";

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field6295 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Z")
    public static boolean field6298 = false;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field6297 = -1;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field6296;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2722(boolean arg0) {
        if (!arg0) {
            field6293 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method2723(int arg0, byte arg1) {
        field6294++;
        return arg1 == 113 ? arg0 >> 11 & 0x7F : 71;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lud;B)V", line = 27)
    public static final void method2724(class2 arg0, byte arg1) {
        field6300++;
        class377 var2 = null;
        try {
            class296 var3 = arg0.method28(-1);
            while (var3.field4259 == 0) {
                class404.method2628(arg1 - 107, 1L);
            }
            if (var3.field4259 == 1) {
                var2 = (class377) var3.field4262;
                class265 var4 = class371.method2443(-15996);
                var2.method2501(var4.field3879, 1, 0, var4.field3915);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2499(1);
            }
            if (arg1 != -7) {
                method2725(96, (byte) 37);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V", line = 84)
    public static final void method2725(int arg0, byte arg1) {
        if (arg1 != 53) {
            method2723(21, (byte) -83);
        }
        field6292++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class291.method1869(-113);
        } else if (arg0 == 2) {
            class179.method1097(-1);
        } else if (arg0 == 3) {
            class17.method115((byte) 3);
        } else {
            throw new RuntimeException();
        }
    }
}
