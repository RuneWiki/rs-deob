import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class474 extends class497 {

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6957 = new String[] { method3665(method3664("a\u0003N<")), method3665(method3664("tX\f~W")), method3665(method3664("y\u0014\f\u0011\u0002")), method3665(method3664("y\u0014\f\u0017\u0002")), method3665(method3664("y\u0014\f\u0018\u0002")), method3665(method3664("y\u0014\f\u0013\u0002")), method3665(method3664("y\u0014\f\u0015\u0002")), method3665(method3664("y\u0014\f\u0016\u0002")), method3665(method3664("y\u0014\f\u0014\u0002")), method3665(method3664("y\u0014\f\u0012\u0002")) };

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lsb;")
    public static class261 field6947 = new class261(135, 1);

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lsb;")
    public static class261 field6951 = new class261(20, 11);

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field6955 = 0;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)V", line = 5)
    public static void method3660(boolean arg0) {
        try {
            field6951 = null;
            field6947 = null;
            if (!arg0) {
                method3660(false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6957[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ILpp;)V", line = 16)
    public class474(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)I", line = 19)
    public final int method3661(int arg0) {
        try {
            if (arg0 != 3) {
                field6947 = null;
            }
            ++field6950;
            return super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6957[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)I", line = 31)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                return 103;
            } else {
                ++field6954;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6957[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V", line = 42)
    public final void method1031(byte arg0) {
        try {
            if (arg0 <= -70) {
                if (super.field7292 != 1 && ~super.field7292 != -1) {
                    super.field7292 = this.method1032(-110);
                }
                ++field6952;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6957[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)I", line = 56)
    public final int method1032(int arg0) {
        try {
            ++field6948;
            if (arg0 >= -101) {
                field6955 = -88;
            }
            return 1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6957[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lpp;)V", line = 70)
    public class474(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V", line = 87)
    public static final void method3662(byte arg0) {
        try {
            if (arg0 <= 27) {
                method3663(32, false, (class429) null);
            }
            for (class500 var1 = (class500) class687.field9624.method3696(0); var1 != null; var1 = (class500) class687.field9624.method3697(-90)) {
                if (!var1.field7308) {
                    class531.method4019(var1.field7305, 105);
                } else {
                    var1.field7308 = false;
                }
            }
            ++field6949;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6957[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZLng;)V", line = 112)
    public static final void method3663(int arg0, boolean arg1, class429 arg2) {
        try {
            ++field6953;
            if (arg0 != 7728) {
                method3660(true);
            }
            class499.field7298.method3425(arg2, arg0 ^ -7804);
            if (arg1) {
                class58.method615(class499.field7298, 0, class395.field5736, class654.field9281, arg2, class449.field6575);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6957[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6957[1] : field6957[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 127)
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                method3660(true);
            }
            ++field6956;
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6957[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3664(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3665(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 118;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 42;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
