import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class30 {

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lvv;")
    public static class313 field479 = new class313(17, -1);

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field483 = 2;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Lnk;")
    public static class326 field480 = new class326(1, 4);

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "F")
    public static float field481;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Ldt;")
    public static class434 field482;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field484;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method234(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field478++;
        if (arg1 >= 0 && arg6 >= 0 && class217.field3775 - 1 > arg1 && (class277.field4548 - 1) > arg6) {
            if (class66.field977 == null) {
                return;
            }
            if (arg7 == 0) {
                class518 var12 = (class518) class134.method1018(arg3, arg1, arg6);
                class518 var13 = (class518) class76.method548(arg3, arg1, arg6);
                if (var12 != null && arg2 != 2) {
                    if ((var12 instanceof class324)) {
                        ((class324) var12).field5072.method2745(arg5, 100);
                    } else {
                        class197.method1303(arg4, arg1, arg6, false, var12.method28((byte) -118), arg7, arg5, arg2, arg3);
                    }
                }
                if (var13 != null) {
                    if (var13 instanceof class324) {
                        ((class324) var13).field5072.method2745(arg5, 100);
                    } else {
                        class197.method1303(arg4, arg1, arg6, false, var13.method28((byte) -118), arg7, arg5, arg2, arg3);
                    }
                }
            } else if (arg7 == 1) {
                class518 var8 = (class518) class158.method1103(arg3, arg1, arg6);
                if (var8 != null) {
                    if (var8 instanceof class371) {
                        ((class371) var8).field5726.method2745(arg5, 100);
                    } else {
                        int var9 = var8.method28((byte) -118);
                        if (arg2 == 4 || arg2 == 5) {
                            class197.method1303(arg4, arg1, arg6, false, var9, arg7, arg5, 4, arg3);
                        } else if (arg2 == 6) {
                            class197.method1303(arg4 + 4, arg1, arg6, false, var9, arg7, arg5, 4, arg3);
                        } else if (arg2 == 7) {
                            class197.method1303((arg4 + 2 & 0x3) + 4, arg1, arg6, false, var9, arg7, arg5, 4, arg3);
                        } else if (arg2 == 8) {
                            class197.method1303(arg4 + 4, arg1, arg6, false, var9, arg7, arg5, 4, arg3);
                            class197.method1303((arg4 + 2 & 0x3) + 4, arg1, arg6, false, var9, arg7, arg5, 4, arg3);
                        }
                    }
                }
            } else if (arg7 == 2) {
                class518 var10 = (class518) class491.method2868(arg3, arg1, arg6, field484 == null ? (field484 = method237("jg")) : field484);
                if (var10 != null) {
                    if (arg2 == 11) {
                        arg2 = 10;
                    }
                    if ((var10 instanceof class438)) {
                        ((class438) var10).field6552.method2745(arg5, 100);
                    } else {
                        class197.method1303(arg4, arg1, arg6, false, var10.method28((byte) -118), arg7, arg5, arg2, arg3);
                    }
                }
            } else if (arg7 == 3) {
                class518 var11 = (class518) class373.method2346(arg3, arg1, arg6);
                if (var11 != null) {
                    if ((var11 instanceof class6)) {
                        ((class6) var11).field73.method2745(arg5, 100);
                    } else {
                        class197.method1303(arg4, arg1, arg6, false, var11.method28((byte) -118), arg7, arg5, arg2, arg3);
                    }
                }
            }
        }
        int var14 = 116 % ((71 - arg0) / 37);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lbl;B)I")
    public static final int method235(class265 arg0, byte arg1) {
        field477++;
        class510 var2 = arg0.field4430;
        if (var2.field7448 != null) {
            var2 = var2.method3000(1, class327.field5160);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field7420;
        if (arg1 != -76) {
            method234((byte) 85, -47, 80, -18, 119, -14, -4, 93);
        }
        class49 var4 = arg0.method1308(-13076);
        if (arg0.field3111) {
            var3 = var2.field7405;
        } else if (arg0.field3078 == var4.field781 || arg0.field3078 == var4.field797 || arg0.field3078 == var4.field824 || arg0.field3078 == var4.field809) {
            var3 = var2.field7401;
        } else if (arg0.field3078 == var4.field805 || arg0.field3078 == var4.field788 || arg0.field3078 == var4.field811 || arg0.field3078 == var4.field772) {
            var3 = var2.field7410;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        field479 = null;
        field480 = null;
        if (arg0 < -56) {
            field482 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method237(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
