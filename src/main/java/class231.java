import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class231 extends class428 {

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3586 = new String[] { method2017(method2016(":\u0011s_")), method2017(method2016("/J1\u001d\u0004")), method2017(method2016("&\f~\u001d?|")), method2017(method2016("&\f~\u001d<|")), method2017(method2016("&\f~\u001d;|")), method2017(method2016("&\f~\u001d1|")), method2017(method2016("&\f~\u001d>|")), method2017(method2016("&\f~\u001d8|")), method2017(method2016("&\f~\u001d=|")), method2017(method2016("&\f~\u001d:|")) };

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "Lvn;")
    public static class330 field3584 = new class330(22, 11);

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!rha", name = "p", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "[I")
    public static int[] field3583;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "(I)V", line = 7)
    public static final void method2014(int arg0) {
        try {
            int var1 = 88 / ((arg0 - 60) / 63);
            ++field3576;
            for (int var2 = 0; class490.field7395 > var2; ++var2) {
                class746 var3 = class771.field11308[var2];
                if (var3.field10988 == 3) {
                    if (var3.field10998 != null) {
                        class476.field7253.method2594(var3.field10998);
                    } else {
                        var3.field10985 = Integer.MIN_VALUE;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3586[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "(I)V", line = 37)
    public static void method2015(int arg0) {
        try {
            field3583 = null;
            field3584 = null;
            if (arg0 >= -118) {
                method2015(109);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3586[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V", line = 48)
    public final void method1224(boolean arg0) {
        try {
            if (!arg0) {
                method2014(17);
            }
            ++field3581;
            super.field6741.method2234(false, 16381);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3586[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)V", line = 63)
    public final void method1219(int arg0, int arg1, int arg2) {
        try {
            ++field3578;
            if (arg1 != 100) {
                method2015(46);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3586[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZI)V", line = 75)
    public final void method1225(boolean arg0, int arg1) {
        try {
            if (arg1 == 29145) {
                super.field6741.method2234(true, 16381);
                ++field3579;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3586[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lgca;)V", line = 86)
    public class231(class261 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lln;BI)V", line = 89)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        try {
            ++field3577;
            if (arg1 < 7) {
                field3580 = 19;
            }
            super.field6741.method2233((byte) -43, arg0);
            super.field6741.method2258(arg2, (byte) -114);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3586[2] + (arg0 != null ? field3586[1] : field3586[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZ)V", line = 102)
    public final void method1221(int arg0, boolean arg1) {
        try {
            if (arg0 != 6056) {
                this.method1221(-128, true);
            }
            ++field3585;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3586[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "(I)Z", line = 113)
    public final boolean method1226(int arg0) {
        try {
            if (arg0 >= -111) {
                this.method1224(false);
            }
            ++field3582;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3586[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2016(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 121);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2017(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
