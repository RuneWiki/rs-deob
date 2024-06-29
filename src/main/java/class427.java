import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class427 extends class4 {

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Z")
    public static boolean field5824 = false;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field5826 = -1;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field5829;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field5830;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class427() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)I")
    private final int method2503(int arg0, int arg1, int arg2) {
        ++field5829;
        if (arg0 != Integer.MAX_VALUE) {
            return -1;
        } else {
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 << 1 ^ var4;
            return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lqa;IIIIIIII)V")
    public static final void method2504(class167 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field5828;
        if (arg8 != 24762) {
            method2504((class167) null, -106, 28, -91, 40, -40, -21, 35, 32);
        }
        class246 var9 = (class246) class146.method798(arg6, arg4, arg3);
        if (var9 != null) {
            class137 var10 = class626.field9084.method1093(arg8 ^ 24762, var9.method52(-17817));
            int var11 = 3 & var9.method60(1901);
            int var12 = var9.method57(-29185);
            if (var10.field1730 != -1) {
                class609.method3485(var11, arg5, arg2, var10, arg0, arg8 + -24690);
            } else {
                int var13 = arg7;
                if (var10.field1749 > 0) {
                    var13 = arg1;
                }
                if (~var12 == -1 || var12 == 2) {
                    if (var11 != 0) {
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    arg0.method967(arg5 + 3, var13, -106, arg2, 4);
                                }
                            } else {
                                arg0.method998(var13, -32192, 4, arg2 + 3, arg5);
                            }
                        } else {
                            arg0.method967(arg5, var13, 75, arg2, 4);
                        }
                    } else {
                        arg0.method998(var13, -32192, 4, arg2, arg5);
                    }
                }
                if (~var12 == -4) {
                    if (var11 == 0) {
                        arg0.method974(var13, 1, 1, arg2, 1, arg5);
                    } else if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                arg0.method974(var13, 1, 1, arg2, 1, arg5 + 3);
                            }
                        } else {
                            arg0.method974(var13, 1, 1, arg2 + 3, 1, arg5 - -3);
                        }
                    } else {
                        arg0.method974(var13, 1, 1, arg2 + 3, 1, arg5);
                    }
                }
                if (var12 == 2) {
                    if (var11 != 0) {
                        if (~var11 != -2) {
                            if (var11 == 2) {
                                arg0.method967(arg5 + 3, var13, arg8 ^ -24795, arg2, 4);
                            } else if (var11 == 3) {
                                arg0.method998(var13, arg8 + -56954, 4, arg2, arg5);
                            }
                        } else {
                            arg0.method998(var13, arg8 + -56954, 4, arg2 + 3, arg5);
                        }
                    } else {
                        arg0.method967(arg5, var13, arg8 ^ -24780, arg2, 4);
                    }
                }
            }
        }
        class246 var14 = (class246) class49.method273(arg6, arg4, arg3, field5830 != null ? field5830 : (field5830 = method2505("vaa")));
        if (var14 != null) {
            class137 var15 = class626.field9084.method1093(0, var14.method52(-17817));
            int var16 = var14.method60(1901) & 3;
            int var17 = var14.method57(-29185);
            if (~var15.field1730 == 0) {
                if (~var17 == -10) {
                    int var18 = -1118482;
                    if (~var15.field1749 < -1) {
                        var18 = -1179648;
                    }
                    if (var16 != 0 && ~var16 != -3) {
                        arg0.method906(arg2 - -3, 1, arg2, arg5 + 3, var18, arg5);
                    } else {
                        arg0.method906(arg2 + 3, 1, arg2, arg5, var18, arg5 + 3);
                    }
                }
            } else {
                class609.method3485(var16, arg5, arg2, var15, arg0, 86);
            }
        }
        class246 var19 = (class246) class380.method2313(arg6, arg4, arg3);
        if (var19 != null) {
            class137 var20 = class626.field9084.method1093(0, var19.method52(arg8 + -42579));
            int var21 = var19.method60(1901) & 3;
            if (~var20.field1730 != 0) {
                class609.method3485(var21, arg5, arg2, var20, arg0, 108);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field5827;
        if (arg0 != 10) {
            method2504((class167) null, 20, 0, 55, -81, 29, -87, 98, 83);
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = class130.field1606[arg1];
            for (int var5 = 0; class132.field1627 > var5; ++var5) {
                var3[var5] = this.method2503(class426.method2502(arg0, 2147483637), var4, class66.field881[var5]) % 4096;
            }
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2505(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
