import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class607 extends class54 {

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8890 = new String[] { method4497(method4496("4WE\rR")), method4497(method4496("4WE\fR")), method4497(method4496("4WE\bR")), method4497(method4496("4WE\tR")), method4497(method4496("4WE\u000eR")), method4497(method4496("'\rEd\u0007")), method4497(method4496("2V\u0007&")), method4497(method4496("4WE\u000bR")), method4497(method4496("2G\n")), method4497(method4496("4WE\u000fR")) };

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "I")
    public static int field8885;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "I")
    public static int field8886;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    public static int field8888;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ht", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8889;

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(ILhia;)V")
    public class607(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(Z)I")
    public final int method4492(boolean arg0) {
        try {
            ++field8883;
            return arg0 ? -88 : super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8890[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lhia;)V")
    public class607(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return 41;
            } else {
                ++field8885;
                return 127;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8890[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                this.method109(-54, (byte) 89);
            }
            super.field593 = arg1;
            ++field8882;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8890[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIILha;IBII)V")
    public static final void method4493(int arg0, int arg1, int arg2, int arg3, class66 arg4, int arg5, byte arg6, int arg7, int arg8) {
        try {
            ++field8884;
            class583 var9 = (class583) class599.method4456(arg5, arg7, arg2);
            if (var9 != null) {
                class198 var10 = class417.field6144.method3030(arg6 ^ 96, var9.method1083((byte) -112));
                int var11 = 3 & var9.method1097(false);
                int var12 = var9.method1087(18636);
                if (~var10.field3060 != 0) {
                    class174.method1537(var10, arg8, -63, arg4, arg1, var11);
                } else {
                    int var13 = arg0;
                    if (~var10.field3082 < -1) {
                        var13 = arg3;
                    }
                    if (~var12 == -1 || ~var12 == -3) {
                        if (~var11 == -1) {
                            arg4.method476(4, arg1, arg8, var13, (byte) -88);
                        } else if (~var11 == -2) {
                            arg4.method564(var13, (byte) 88, 4, arg8, arg1);
                        } else if (~var11 != -3) {
                            if (~var11 == -4) {
                                arg4.method564(var13, (byte) 88, 4, arg8, arg1 - -3);
                            }
                        } else {
                            arg4.method476(4, arg1, arg8 - -3, var13, (byte) 56);
                        }
                    }
                    if (~var12 == -4) {
                        if (var11 == 0) {
                            arg4.method593(var13, arg8, (byte) -82, 1, 1, arg1);
                        } else if (~var11 != -2) {
                            if (~var11 == -3) {
                                arg4.method593(var13, arg8 + 3, (byte) -82, 1, 1, arg1 - -3);
                            } else if (var11 == 3) {
                                arg4.method593(var13, arg8, (byte) -82, 1, 1, arg1 - -3);
                            }
                        } else {
                            arg4.method593(var13, arg8 + 3, (byte) -82, 1, 1, arg1);
                        }
                    }
                    if (~var12 == -3) {
                        if (~var11 != -1) {
                            if (~var11 == -2) {
                                arg4.method476(4, arg1, arg8 + 3, var13, (byte) -110);
                            } else if (~var11 == -3) {
                                arg4.method564(var13, (byte) 88, 4, arg8, arg1 + 3);
                            } else if (var11 == 3) {
                                arg4.method476(4, arg1, arg8, var13, (byte) -127);
                            }
                        } else {
                            arg4.method564(var13, (byte) 88, 4, arg8, arg1);
                        }
                    }
                }
            }
            if (arg6 == 96) {
                class583 var14 = (class583) class261.method2196(arg5, arg7, arg2, field8889 != null ? field8889 : (field8889 = method4495(field8890[8])));
                if (var14 != null) {
                    class198 var15 = class417.field6144.method3030(0, var14.method1083((byte) -75));
                    int var16 = 3 & var14.method1097(false);
                    int var17 = var14.method1087(18636);
                    if (var15.field3060 != -1) {
                        class174.method1537(var15, arg8, -97, arg4, arg1, var16);
                    } else if (var17 == 9) {
                        int var18 = -1118482;
                        if (var15.field3082 > 0) {
                            var18 = -1179648;
                        }
                        if (var16 != 0 && ~var16 != -3) {
                            arg4.method492(arg1 + 3, arg1, 1, arg8, arg8 + 3, var18);
                        } else {
                            arg4.method492(arg1, arg1 + 3, 1, arg8, arg8 - -3, var18);
                        }
                    }
                }
                class583 var19 = (class583) class89.method766(arg5, arg7, arg2);
                if (var19 != null) {
                    class198 var20 = class417.field6144.method3030(0, var19.method1083((byte) -101));
                    int var21 = var19.method1097(false) & 3;
                    if (var20.field3060 != -1) {
                        class174.method1537(var20, arg8, -79, arg4, arg1, var21);
                        return;
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class759.method5498(var23, field8890[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8890[5] : field8890[6]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field8887;
            if (arg1 >= -106) {
                this.method4492(true);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8890[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
    public static final void method4494(boolean arg0, byte arg1) {
        try {
            ++field8888;
            class497.field7202.method2377(class301.field4720.method577());
            if (arg1 > 71) {
                int[] var2 = class301.field4720.method548();
                class262.field4033 = var2[1];
                class170.field2351 = var2[3];
                class504.field7315 = var2[2];
                class169.field2314 = var2[0];
                if (arg0) {
                    class301.field4720.method479(class678.field9843, class14.field176, class642.field9305, class589.field8663);
                    class687.method5038(255, class388.field5856);
                } else {
                    class301.field4720.method479(class743.field10818, class9.field95, class190.field2582, class517.field7483);
                    class687.method5038(255, class26.field311);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8890[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (!arg0) {
                method4493(27, -90, -35, 2, (class66) null, 70, (byte) 39, 54, 115);
            }
            ++field8886;
            if (super.field593 < 0 && ~super.field593 < -128) {
                super.field593 = this.method111(false);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8890[4] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4495(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 122);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 107;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
