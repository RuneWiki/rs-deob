import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 implements class228 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 11)
    public static final void method146(int arg0) {
        field264++;
        if (arg0 == 6) {
            class62.field909.method1359(68);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjava/lang/StringBuffer;C)Ljava/lang/StringBuffer;", line = 24)
    public static final StringBuffer method147(int arg0, int arg1, StringBuffer arg2, char arg3) {
        if (arg1 != -12) {
            method147(94, 53, (StringBuffer) null, '\u000e');
        }
        field263++;
        int var4 = arg2.length();
        arg2.setLength(arg0);
        for (int var5 = var4; var5 < arg0; var5++) {
            arg2.setCharAt(var5, arg3);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;", line = 44)
    public final String method148(int arg0, int[] arg1, int arg2, long arg3) {
        if (arg0 != 7824) {
            return (String) null;
        }
        field265++;
        if (arg2 == 0) {
            class224 var7 = class304.method2109(arg1[0], arg0 - 7758);
            return var7.method1642(64, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class316 var6 = class149.method1092((byte) -104, (int) arg3);
            return var6.field4988;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class304.method2109(arg1[0], arg0 - 7755).method1642(64, (int) arg3);
        } else {
            return null;
        }
    }
}
