import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class321 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lpg;")
    public static class320 field5014 = new class320(64);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5017 = null;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "F")
    public static float field5018;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 7)
    public static final void method2186(int arg0, String arg1, String arg2, int arg3, String arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class75.field1207[var6] = class75.field1207[var6 - 1];
            class217.field3301[var6] = class217.field3301[var6 - 1];
            class268.field4186[var6] = class268.field4186[var6 - 1];
            class335.field5252[var6] = class335.field5252[var6 - 1];
            class63.field1005[var6] = class63.field1005[var6 - 1];
        }
        class263.field4095++;
        class75.field1207[0] = arg0;
        class44.field716 = class291.field4524;
        class63.field1005[0] = arg5;
        field5015++;
        class217.field3301[0] = arg1;
        class268.field4186[0] = arg4;
        class335.field5252[arg3] = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIZII)V", line = 33)
    public static final void method2187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field5012++;
        int var10 = arg8 - arg1;
        int var11 = arg6 - arg2;
        int var12 = (arg0 - arg3 << 16) / var11;
        int var13 = (arg4 - arg5 << 16) / var10;
        class161.method1098(arg5, var13, arg2, arg8, var12, arg3, arg6, arg7, arg9, arg1, 0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 48)
    public static void method2188(int arg0) {
        field5017 = null;
        if (arg0 <= -18) {
            field5014 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)Z", line = 63)
    public static final boolean method2189(int arg0, byte arg1) {
        field5013++;
        if (class71.field1175[arg0]) {
            return true;
        } else if (class132.field2090.method951(arg0, (byte) 102)) {
            int var2 = class132.field2090.method954(arg1 - 24080, arg0);
            if (var2 == 0) {
                class71.field1175[arg0] = true;
                return true;
            }
            if (class163.field2463[arg0] == null) {
                class163.field2463[arg0] = new class220[var2];
            }
            if (arg1 != 79) {
                method2190(-47, (byte) 39);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class163.field2463[arg0][var3] == null) {
                    byte[] var4 = class132.field2090.method980(arg0, var3, 5);
                    if (var4 != null) {
                        class220 var5 = class163.field2463[arg0][var3] = new class220();
                        var5.field3404 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1561(new class166(var4), -77);
                        } else {
                            var5.method1564(123, new class166(var4));
                        }
                    }
                }
            }
            class71.field1175[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(IB)I", line = 124)
    public static final int method2190(int arg0, byte arg1) {
        int var2 = -62 % ((-arg1 - 15) / 36);
        field5011++;
        return arg0 >>> 8;
    }
}
