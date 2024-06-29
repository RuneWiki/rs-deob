import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class647 extends class54 {

    @OriginalMember(owner = "client!of", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field9377 = new String[] { method4764(method4763(")<+ ~")), method4764(method4763(")<+'~")), method4764(method4763(")<+!~")), method4764(method4763(")<+%~")), method4764(method4763(")<+$~")), method4764(method4763(")<+\"~")), method4764(method4763(")<+&~")) };

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public static int field9367 = -1;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
    public static boolean field9363 = true;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field9372 = 0;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public static int[] field9374 = new int[13];

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Lcn;")
    public static class541 field9375 = null;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Lwia;")
    public static class790 field9364 = new class790(64, -1);

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field9362;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field9371;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Lla;")
    public static class476 field9368;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lhg;")
    public static class718 field9369;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 5)
    public final void method115(boolean arg0) {
        try {
            if (super.field589.field816.method644((byte) -54) && ~super.field593 == -3) {
                super.field593 = 1;
            }
            if (arg0) {
                ++field9371;
                if (~super.field593 > -1 || super.field593 > 2) {
                    super.field593 = this.method111(false);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9377[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)I", line = 28)
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                this.method109(77, (byte) -23);
            }
            ++field9365;
            return 2;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9377[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lhia;)V", line = 40)
    public class647(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IC)Z", line = 43)
    public static final boolean method4760(int arg0, char arg1) {
        try {
            ++field9373;
            if (arg1 >= ' ' && ~arg1 >= -127) {
                return true;
            } else if (arg1 >= 160 && arg1 <= 255) {
                return true;
            } else if (~arg1 != -8365 && ~arg1 != -339 && ~arg1 != -8213 && arg1 != 339 && ~arg1 != -377) {
                if (arg0 >= -27) {
                    method4762(-105);
                }
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9377[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(ILhia;)V", line = 71)
    public class647(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(Z)I", line = 79)
    public final int method4761(boolean arg0) {
        try {
            if (arg0) {
                this.method4761(false);
            }
            ++field9370;
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9377[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 90)
    public static void method4762(int arg0) {
        try {
            field9374 = null;
            field9369 = null;
            field9375 = null;
            field9364 = null;
            if (arg0 != -29994) {
                field9374 = null;
            }
            field9368 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9377[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V", line = 110)
    public final void method113(int arg0, int arg1) {
        try {
            ++field9366;
            if (arg0 != 0) {
                this.method4761(false);
            }
            super.field593 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9377[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)I", line = 124)
    public final int method109(int arg0, byte arg1) {
        try {
            ++field9362;
            return arg1 > -106 ? 89 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9377[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4763(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 86);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4764(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
