import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class236 extends class299 {

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3636 = new String[] { method2047(method2046("!B4nhc")), method2047(method2046("!B4nec")), method2047(method2046("!B4nbc")), method2047(method2046("!B4nac")), method2047(method2046("!B4ngc")), method2047(method2046("!B4ncc")), method2047(method2046("!B4nfc")), method2047(method2046("!B4ndc")) };

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                return 21;
            } else {
                ++field3630;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3636[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
    public static final void method2042(int arg0) {
        try {
            class29 var1 = class223.field3499;
            synchronized (class223.field3499) {
                class223.field3499.method304(1);
            }
            if (arg0 == 4) {
                ++field3632;
                class29 var2 = class12.field137;
                synchronized (class12.field137) {
                    class12.field137.method304(arg0 ^ 5);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3636[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field3635;
            if (arg0 != 0) {
                return -42;
            } else {
                return super.field4850.method3250((byte) 87).method2099(255) > 1 ? 4 : 2;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3636[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Les;)V")
    public class236(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field3633;
            super.field4849 = arg0;
            if (arg1) {
                this.method846(108, false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3636[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)V")
    public static final void method2043(int arg0) {
        try {
            ++field3634;
            class232.field3598 = -1;
            class478.field7266 = -1;
            if (arg0 < 45) {
                method2044(119, -81, -52, 32, -127, -77, -81);
            }
            class137.field1930 = 0;
            class83.field1262 = -1;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3636[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            ++field3629;
            if (~super.field4849 > -1 && ~super.field4849 < -5) {
                super.field4849 = this.method847(arg0 ^ -20456);
            }
            if (arg0 == -20456) {
                ;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3636[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIII)Llia;")
    public static final class505 method2044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field3628;
            long var7 = (long) arg5 * 76724863L ^ (long) arg3 * 475427L ^ (long) arg1 * 67481L ^ (long) arg2 * 97549L ^ (long) arg4 * 986053L ^ (long) arg6 * 32147369L;
            class505 var9 = (class505) class21.field210.method302(-87, var7);
            if (var9 != null) {
                return var9;
            } else {
                if (arg0 < 108) {
                    method2044(19, -107, -43, 28, -113, 9, -103);
                }
                class505 var10 = class617.field8910.method235(arg1, arg2, arg3, arg4, arg6, arg5);
                class21.field210.method295(false, var7, var10);
                return var10;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3636[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(Z)I")
    public final int method2045(boolean arg0) {
        try {
            if (!arg0) {
                this.method847(124);
            }
            ++field3631;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3636[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(ILes;)V")
    public class236(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2046(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2047(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 75;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 85;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
