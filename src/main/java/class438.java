import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class438 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public int field6389;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "S")
    public static short field6393 = 256;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field6394 = 0;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Luf;")
    public static class310 field6390 = new class310(21, 2);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "F")
    public static float field6395 = 1.0F;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2613(int arg0, String arg1) {
        field6391++;
        int var2 = -54 / ((29 - arg0) / 50);
        if (class80.field1136 != null) {
            class441.field6424++;
            class356.method1978((byte) 26, class178.field2526);
            class244.field3395.method2084(class121.method780(arg1, (byte) 73), false);
            class244.field3395.method2073(101, arg1);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2614(int arg0) {
        if (arg0 > -116) {
            field6393 = -116;
        }
        field6390 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILls;IIILtr;Lqa;Lrs;)V")
    public static final void method2615(int arg0, class92 arg1, int arg2, int arg3, int arg4, class191 arg5, class162 arg6, class462 arg7) {
        field6392++;
        int var8 = arg1.field1235 - arg2 / 2 - 5;
        int var9 = arg3 + 2;
        if (arg5.field2650 != 0) {
            arg6.method1006(var8, arg5.field2650, var9, (arg3 - (-(arg0 * arg7.method2720()) - 1)) - var9, 1, arg2 + 10);
        }
        if (arg5.field2655 != 0) {
            arg6.method1003(arg5.field2655, arg7.method2720() * arg0 + arg3 + 1 - var9, 1, var8, var9, arg2 + 10);
        }
        int var10 = arg5.field2676;
        if (arg1.field1239 && arg5.field2678 != -1) {
            var10 = arg5.field2678;
        }
        if (arg4 != 4044) {
            return;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class131.field1812[var11];
            if ((arg0 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method2717(arg6, var12, arg1.field1235, arg3, var10, true);
            arg3 += arg7.method2720();
        }
    }

    @OriginalMember(owner = "client!of", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6388++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class438(String arg0, int arg1) {
        this.field6389 = arg1;
    }
}
