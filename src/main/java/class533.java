import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class533 {

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "Lvh;")
    public static class328 field7259 = new class328(5);

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field7260 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V", line = 6)
    public static final void method2944(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6750 != null) {
            var3.field6750 = null;
        }
        if (var3.field6741 != null) {
            var3.field6741 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;", line = 20)
    public static final String[] method2945(int arg0, String arg1, char arg2) {
        field7258++;
        int var3 = class439.method2521(arg1, -128, arg2);
        String[] var4 = new String[var3 + 1];
        if (arg0 != -19028) {
            return null;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIB)V", line = 57)
    public static final void method2946(int arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 0) {
            class340.field4928++;
            class1.method5(1, class23.field312);
        }
        field7257++;
        if (arg3 > -82) {
            method2946(-3, 116, 127, (byte) -90);
        }
        if (arg2 == 1) {
            class406.field5726++;
            class1.method5(1, class623.field8685);
        }
        class288.field4014.method744(-64, class531.field7246.method666(50, 82) ? 1 : 0);
        class288.field4014.method757(true, arg0 + class124.field1726);
        class288.field4014.method752(89, class511.field6989 + arg1);
        class247.field3508 = arg1;
        class414.field5857 = false;
        class178.field2636 = arg0;
        class589.method3273(31050);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 87)
    public static void method2947(int arg0) {
        if (arg0 == -4) {
            field7259 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BII)I", line = 100)
    public static final int method2948(byte arg0, int arg1, int arg2) {
        field7254++;
        int var3 = -51 / ((arg0 - 72) / 38);
        return arg1 == 1 || arg1 == 3 ? class526.field7211[arg2 & 0x3] : class629.field8788[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIII)V", line = 116)
    public static final void method2949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 1) {
            field7259 = null;
        }
        field7255++;
        if (arg1 == arg4) {
            class638.method3563(arg5, arg4, arg7, arg3, arg6, 15006, arg0);
        } else if (class482.field6703 <= (arg5 - arg4) && class144.field2148 >= arg5 + arg4 && (arg6 - arg1) >= class92.field1219 && (arg1 + arg6) <= class631.field8829) {
            class690.method3798(arg4, arg1, arg6, arg3, 0, arg5, arg0, arg7);
        } else {
            class577.method3164(671906817, arg1, arg7, arg6, arg0, arg3, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 143)
    public static final void method2950(byte arg0) {
        field7256++;
        if (class595.field8273 == 0) {
            return;
        }
        try {
            if (++class394.field5486 > 2000) {
                if (class53.field758 != null) {
                    class53.field758.method3127(-48);
                    class53.field758 = null;
                }
                if (class179.field2650 >= 2) {
                    class595.field8273 = 0;
                    class17.field262 = -5;
                    return;
                }
                class92.field1218.method2260((byte) 47);
                class394.field5486 = 0;
                class595.field8273 = 1;
                class179.field2650++;
            }
            if (class595.field8273 == 1) {
                class205.field3023 = class92.field1218.method2256(43594, class503.field6878);
                class595.field8273 = 2;
            }
            if (class595.field8273 == 2) {
                if (class205.field3023.field3702 == 2) {
                    throw new IOException();
                }
                if (class205.field3023.field3702 != 1) {
                    return;
                }
                class53.field758 = class514.method2858((Socket) class205.field3023.field3706, 7500, (byte) -74);
                class205.field3023 = null;
                class53.field758.method3126(class288.field4014.field1316, false, class288.field4014.field1301, 0);
                class595.field8273 = 4;
            }
            if (class595.field8273 == 4) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return;
                }
                class53.field758.method3129(1, 0, (byte) -84, class602.field8356.field1316);
                int var1 = class602.field8356.field1316[0] & 0xFF;
                if (var1 != 21) {
                    class595.field8273 = 0;
                    class17.field262 = var1;
                    class53.field758.method3127(-115);
                    class53.field758 = null;
                    return;
                }
                class595.field8273 = 5;
            }
            if (class595.field8273 == 5) {
                if (!class53.field758.method3124((byte) 118, 1)) {
                    return;
                }
                class53.field758.method3129(1, 0, (byte) -80, class602.field8356.field1316);
                class595.field8273 = 6;
                class14.field222 = new String[class602.field8356.field1316[0] & 0xFF];
            }
            if (class595.field8273 == 6) {
                if (!class53.field758.method3124((byte) 118, class14.field222.length * 8)) {
                    return;
                }
                class602.field8356.field1301 = 0;
                class53.field758.method3129(class14.field222.length * 8, 0, (byte) -117, class602.field8356.field1316);
                for (int var2 = 0; var2 < class14.field222.length; var2++) {
                    class14.field222[var2] = class170.method1166(class602.field8356.method715(true), (byte) -128);
                }
                class595.field8273 = 0;
                class17.field262 = 21;
                class53.field758.method3127(105);
                class53.field758 = null;
                return;
            }
        } catch (IOException var3) {
            if (class53.field758 != null) {
                class53.field758.method3127(-121);
                class53.field758 = null;
            }
            if (class179.field2650 >= 2) {
                class17.field262 = -4;
                class595.field8273 = 0;
            } else {
                class92.field1218.method2260((byte) -101);
                class179.field2650++;
                class595.field8273 = 1;
                class394.field5486 = 0;
            }
        }
        if (arg0 >= -124) {
            method2945(49, null, 'P');
        }
    }
}
