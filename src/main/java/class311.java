import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class311 extends class188 {

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Ljava/lang/String;")
    public String field4882;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field4880 = -1;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4881 = -1;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4885 = "shake:";

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILlf;IIZIIIII)V", line = 6)
    public static final void method2198(int arg0, boolean arg1, int arg2, class143 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg7 < 116) {
            field4881 = -19;
        }
        if (arg10 >= 0 && arg10 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg1 && !arg6) {
                class225.field3398[arg11][arg10][arg8] = 0;
            }
            while (true) {
                int var12 = arg3.method1043(true);
                if (var12 == 0) {
                    if (arg1) {
                        class72.field902[0][arg10 + arg5][arg8 + arg0] = class214.field3247[0][arg10 + arg5][arg0 + arg8];
                    } else if (arg11 == 0) {
                        class72.field902[0][arg5 + arg10][arg0 + arg8] = -class196.method1373(arg2 + 556238, 932731 - -arg9, (byte) 77) * 8;
                    } else {
                        class72.field902[arg11][arg5 + arg10][arg0 + arg8] = class72.field902[arg11 - 1][arg10 + arg5][arg0 + arg8] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg3.method1043(true);
                    if (arg1) {
                        class72.field902[0][arg5 + arg10][arg0 + arg8] = var13 * 8 + class214.field3247[0][arg5 + arg10][arg0 + arg8];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg11 == 0) {
                            class72.field902[0][arg5 + arg10][arg0 + arg8] = -var13 * 8;
                        } else {
                            class72.field902[arg11][arg5 + arg10][arg8 + arg0] = class72.field902[arg11 - 1][arg5 + arg10][arg8 + arg0] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg6) {
                        arg3.method1043(true);
                    } else {
                        class111.field1554[arg11][arg10][arg8] = arg3.method1028(79030408);
                        class168.field2578[arg11][arg10][arg8] = (byte) ((var12 - 2) / 4);
                        class254.field4018[arg11][arg10][arg8] = (byte) class261.method1840(3, var12 + arg4 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg1 && !arg6) {
                        class225.field3398[arg11][arg10][arg8] = (byte) (var12 - 49);
                    }
                } else if (!arg6) {
                    class110.field1519[arg11][arg10][arg8] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg3.method1043(true);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg3.method1043(true);
                    break;
                }
                if (var14 <= 49) {
                    arg3.method1043(true);
                }
            }
        }
        field4879++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)V", line = 118)
    public static final void method2199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4886++;
        if (arg6 == arg7) {
            class326.method2262(arg0, arg4, arg1, arg7, -1, arg2, arg5);
            return;
        }
        int var8 = -88 / ((arg3 - 46) / 54);
        if ((arg5 - arg7) >= class337.field5389 && class344.field5460 >= arg5 + arg7 && class244.field3844 <= (arg4 - arg6) && class2.field22 >= arg4 + arg6) {
            class263.method1869(arg1, arg5, arg2, arg4, (byte) -112, arg6, arg7, arg0);
        } else {
            class304.method2146(arg4, arg6, (byte) -26, arg2, arg5, arg0, arg7, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILqm;Lqm;)V", line = 141)
    public static final void method2200(int arg0, class259 arg1, class259 arg2) {
        field4877++;
        if (arg1.field4089 != null) {
            arg1.method1829((byte) -74);
        }
        arg1.field4098 = arg2.field4098;
        arg1.field4089 = arg2;
        if (arg0 != 21622) {
            field4884 = -49;
        }
        arg1.field4089.field4098 = arg1;
        arg1.field4098.field4089 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V", line = 166)
    public class311() {
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 177)
    public static void method2201(boolean arg0) {
        field4885 = null;
        if (arg0) {
            method2199(25, -92, 1, -47, -46, -73, 73, -31);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 185)
    public class311(String arg0, int arg1) {
        this.field4882 = arg0;
    }
}
