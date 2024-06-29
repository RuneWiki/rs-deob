import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class344 {

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "[B")
    public static byte[] field4742;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lada;")
    public static class144 field4743;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4741;

    static {
        int var0 = 0;
        field4742 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4742[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field4744 = 2;
        field4743 = new class144(97, 4);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIIIIB)V", line = 7)
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        int var10 = 110 % ((arg9 - 17) / 58);
        field4741++;
        if (arg8 >= class14.field136 && class130.field1801 >= arg8 && arg1 >= class14.field136 && class130.field1801 >= arg1 && arg4 >= class14.field136 && class130.field1801 >= arg4 && arg6 >= class14.field136 && arg6 <= class130.field1801 && arg3 >= class3.field25 && class100.field1452 >= arg3 && class3.field25 <= arg7 && class100.field1452 >= arg7 && arg2 >= class3.field25 && arg2 <= class100.field1452 && class3.field25 <= arg0 && arg0 <= class100.field1452) {
            class302.method1853(arg8, arg2, arg3, arg4, arg6, (byte) 91, arg0, arg5, arg7, arg1);
        } else {
            class348.method2111(arg7, arg6, arg8, arg1, arg2, arg0, arg4, (byte) 51, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 55)
    public static void method2102(int arg0) {
        field4742 = null;
        if (arg0 < -121) {
            field4743 = null;
        }
    }
}
