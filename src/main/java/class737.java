import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class737 extends class299 {

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10797 = new String[] { method5353(method5352("I#\u0002QP")), method5353(method5352("I#\u0002PP")), method5353(method5352("I#\u0002SP")), method5353(method5352("I#\u0002]P")), method5353(method5352("I#\u0002WP")), method5353(method5352("I#\u0002VP")), method5353(method5352("I#\u0002RP")), method5353(method5352("I#\u0002TP")) };

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "Lhl;")
    public static class556 field10791 = new class556(97, 0);

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "Z")
    public static boolean field10793 = true;

    @OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
    public static int field10787;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "I")
    public static int field10788;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field10789;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field10790;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "I")
    public static int field10792;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field10794;

    @OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
    public static int field10795;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field10796;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            if (arg1) {
                field10792 = 108;
            }
            ++field10787;
            super.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10797[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(ILes;)V")
    public class737(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            ++field10796;
            if (super.field4850.field6366.method4752(3) && ~super.field4849 == -3) {
                super.field4849 = 1;
            }
            if (~super.field4849 > -1 || super.field4849 > 2) {
                super.field4849 = this.method847(arg0 + 20456);
            }
            if (arg0 != -20456) {
                this.method848(115);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10797[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            if (arg0 != 0) {
                return 103;
            } else {
                ++field10789;
                return 2;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10797[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BIIII)V")
    public static final void method5348(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field10794;
            class551 var5 = class380.method3113(-125, (long) arg1, 4);
            var5.method4086(-118);
            var5.field8073 = arg3;
            var5.field8081 = arg4;
            var5.field8076 = arg2;
            if (arg0 != 110) {
                method5349((byte) -90);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10797[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
    public static void method5349(byte arg0) {
        try {
            field10791 = null;
            if (arg0 != -111) {
                field10793 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10797[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field10790;
            return arg0 != 1 ? 37 : 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10797[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(III)V")
    public static final void method5350(int arg0, int arg1, int arg2) {
        try {
            if (arg0 >= -18) {
                field10793 = false;
            }
            ++field10788;
            if (~class522.field7706 == -2) {
                class471.method3620(arg1, arg2, class430.field6765, 0);
            } else if (class522.field7706 == 2) {
                if (class316.field5141) {
                    class178.method1697(class568.method4171(0) + arg2, 29225, arg1 - -class50.method516(false));
                } else {
                    class178.method1697(arg2, 29225, arg1);
                }
            }
            class430.field6765 = null;
            class522.field7706 = 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10797[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(Z)I")
    public final int method5351(boolean arg0) {
        try {
            if (!arg0) {
                this.method5351(false);
            }
            ++field10795;
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10797[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Les;)V")
    public class737(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5352(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 120);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5353(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
