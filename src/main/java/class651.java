import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class651 extends class80 {

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field9214;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public int field9212;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field9213 = -1;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field9211;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field9215;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3624(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V", line = 6)
    public static final void method3620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9211++;
        if (arg7 > -61 || arg6 < 0 || arg4 < 0 || arg6 >= class86.field1185 - 1 || class526.field7212 - 1 <= arg4) {
            return;
        }
        if (class658.field9266 == null) {
            return;
        }
        if (arg0 == 0) {
            class147 var8 = (class147) class171.method1170(arg2, arg6, arg4);
            class147 var9 = (class147) class108.method815(arg2, arg6, arg4);
            if (var8 != null && arg1 != 2) {
                if ((var8 instanceof class238)) {
                    ((class238) var8).field3427.method1560(-1, arg5);
                } else {
                    class435.method2496(arg5, var8.method554(-18971), arg2, arg4, arg1, arg3, (byte) 27, arg0, arg6);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class238) {
                    ((class238) var9).field3427.method1560(-1, arg5);
                    return;
                }
                class435.method2496(arg5, var9.method554(-18971), arg2, arg4, arg1, arg3, (byte) 27, arg0, arg6);
                return;
            }
            return;
        }
        if (arg0 == 1) {
            class147 var10 = (class147) class493.method2759(arg2, arg6, arg4);
            if (var10 != null) {
                if (!(var10 instanceof class487)) {
                    int var11 = var10.method554(-18971);
                    if (arg1 != 4 && arg1 != 5) {
                        if (arg1 == 6) {
                            class435.method2496(arg5, var11, arg2, arg4, 4, arg3 + 4, (byte) 27, arg0, arg6);
                            return;
                        }
                        if (arg1 == 7) {
                            class435.method2496(arg5, var11, arg2, arg4, 4, (arg3 + 2 & 0x3) + 4, (byte) 27, arg0, arg6);
                        } else if (arg1 == 8) {
                            class435.method2496(arg5, var11, arg2, arg4, 4, arg3 + 4, (byte) 27, arg0, arg6);
                            class435.method2496(arg5, var11, arg2, arg4, 4, (arg3 + 2 & 0x3) + 4, (byte) 27, arg0, arg6);
                            return;
                        }
                        return;
                    }
                    class435.method2496(arg5, var11, arg2, arg4, 4, arg3, (byte) 27, arg0, arg6);
                    return;
                }
                ((class487) var10).field6767.method1560(-1, arg5);
                return;
            }
            return;
        }
        if (arg0 == 2) {
            class147 var12 = (class147) class410.method2344(arg2, arg6, arg4, field9215 == null ? (field9215 = method3624("uq")) : field9215);
            if (var12 != null) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                if (!(var12 instanceof class218)) {
                    class435.method2496(arg5, var12.method554(-18971), arg2, arg4, arg1, arg3, (byte) 27, arg0, arg6);
                    return;
                }
                ((class218) var12).field3152.method1560(-1, arg5);
                return;
            }
            return;
        }
        if (arg0 != 3) {
            return;
        }
        class147 var13 = (class147) class237.method1497(arg2, arg6, arg4);
        if (var13 == null) {
            return;
        }
        if (!(var13 instanceof class418)) {
            class435.method2496(arg5, var13.method554(-18971), arg2, arg4, arg1, arg3, (byte) 27, arg0, arg6);
            return;
        }
        ((class418) var13).field5899.method1560(-1, arg5);
        return;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIZIIII)V", line = 128)
    public static final void method3621(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field9209++;
        int var7 = class355.method2104(class631.field8829, arg5, 36, class92.field1219);
        int var8 = class355.method2104(class631.field8829, arg1, -121, class92.field1219);
        int var9 = class355.method2104(class144.field2148, arg6, -122, class482.field6703);
        int var10 = class355.method2104(class144.field2148, arg3, 123, class482.field6703);
        int var11 = class355.method2104(class631.field8829, arg0 + arg5, -123, class92.field1219);
        int var12 = class355.method2104(class631.field8829, arg1 - arg0, 38, class92.field1219);
        for (int var13 = var7; var13 < var11; var13++) {
            class548.method3012(var10, (byte) 23, arg4, var9, class476.field6655[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class548.method3012(var10, (byte) 23, arg4, var9, class476.field6655[var14]);
        }
        int var15 = class355.method2104(class144.field2148, arg6 + arg0, -109, class482.field6703);
        int var16 = class355.method2104(class144.field2148, arg3 - arg0, -108, class482.field6703);
        if (!arg2) {
            field9213 = -60;
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class476.field6655[var17];
            class548.method3012(var15, (byte) 23, arg4, var9, var18);
            class548.method3012(var10, (byte) 23, arg4, var16, var18);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lhs;", line = 181)
    public final class295 method52(int arg0) {
        field9210++;
        if (arg0 != -14151) {
            field9213 = -56;
        }
        return class520.field7080;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lfw;Ldg;IIIIIII)V", line = 192)
    public class651(class52 arg0, class377 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field9214 = arg7;
        this.field9212 = arg8;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 204)
    public static final void method3622(int arg0) {
        field9208++;
        if (!class457.field6455) {
            return;
        }
        class140 var1 = class474.method2695(-12025, class677.field9549, class366.field5205);
        if (var1 != null && var1.field1987 != null) {
            class388 var2 = new class388();
            var2.field5451 = var1.field1987;
            var2.field5443 = var1;
            class523.method2890(var2);
        }
        class117.field1560 = arg0;
        class130.field1787 = -1;
        class457.field6455 = false;
        if (var1 != null) {
            class432.method2481(var1, 122);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 236)
    public static final void method3623(byte arg0) {
        if (arg0 != -123) {
            method3620(31, -35, 9, 69, 68, 15, -127, 108);
        }
        field9207++;
        for (class81 var1 = (class81) class138.field1938.method1270((byte) -25); var1 != null; var1 = (class81) class138.field1938.method1282(0)) {
            if (var1.field1120 > 0) {
                var1.field1120--;
            }
            if (var1.field1120 != 0) {
                if (var1.field1130 > 0) {
                    var1.field1130--;
                }
                if (var1.field1130 == 0 && var1.field1121 >= 1 && var1.field1127 >= 1 && var1.field1121 <= (class86.field1185 - 2) && (class526.field7212 - 2) >= var1.field1127 && (var1.field1131 < 0 || class222.method1422(var1.field1131, -128, var1.field1122))) {
                    class435.method2496(-1, var1.field1131, var1.field1126, var1.field1127, var1.field1122, var1.field1124, (byte) 27, var1.field1129, var1.field1121);
                    var1.field1130 = -1;
                    if (var1.field1131 == var1.field1125 && var1.field1125 == -1) {
                        var1.method2971(arg0 + 124);
                    } else if (var1.field1131 == var1.field1125 && var1.field1124 == var1.field1123 && var1.field1133 == var1.field1122) {
                        var1.method2971(1);
                    }
                }
            } else if (var1.field1125 < 0 || class222.method1422(var1.field1125, -128, var1.field1133)) {
                class435.method2496(-1, var1.field1125, var1.field1126, var1.field1127, var1.field1133, var1.field1123, (byte) 27, var1.field1129, var1.field1121);
                var1.method2971(1);
            }
        }
    }
}
