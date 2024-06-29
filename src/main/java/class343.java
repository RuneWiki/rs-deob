import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class343 extends class348 {

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field4302 = -2;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[I")
    public static int[] field4304;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)Z", line = 4)
    public static final boolean method2032(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field4301 = -45;
        }
        field4299++;
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 16)
    public static void method2033(int arg0) {
        field4304 = null;
        if (arg0 != 9750) {
            method2034((byte) -3, -30);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)I", line = 26)
    public static final int method2034(byte arg0, int arg1) {
        int var2 = -96 % ((-arg0 - 39) / 63);
        field4305++;
        return arg1 == 16711935 ? -1 : class171.method1166(arg1, -12805);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIBIII)V", line = 51)
    public static final void method2035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field4300++;
        if (arg2 < 512 || arg0 < 512 || (class596.field8090 - 2) * 512 < arg2 || arg0 > (class107.field1350 * 512 - 1024)) {
            class123.field1576[0] = class123.field1576[1] = -1;
            return;
        }
        int var10 = class483.method2867(arg5, (byte) -73, arg0, arg2) - arg9;
        if (arg6 != -23) {
            return;
        }
        if (class769.field10572) {
            class790.method4365(arg6 + 25, true);
        } else {
            class93.field1234.method131(arg1, 0, 0);
            class363.field4526.method628(class93.field1234);
        }
        if (class502.field7084) {
            class363.field4526.method651(arg2, var10, arg0, class621.field8528, class123.field1576);
        } else {
            class363.field4526.method642(arg2, var10, arg0, class123.field1576);
        }
        if (class769.field10572) {
            class774.method4300((byte) 54);
        } else {
            class93.field1234.method131(-arg1, 0, 0);
            class363.field4526.method628(class93.field1234);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 90)
    public static final byte[] method2036(byte arg0, String arg1) {
        field4303++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        if (arg0 > -16) {
            method2036((byte) 84, null);
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if ((var3 - 2) >= var2 || class496.method2932(arg1.charAt(var3 - 2), -87) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class496.method2932(arg1.charAt(var3 - 1), -118) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class448.method2640(var5, 0, arg1, 22);
        return var5;
    }
}
