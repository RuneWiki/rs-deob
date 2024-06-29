import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class588 extends class497 {

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8485 = new String[] { method4348(method4347("\u0013O\u007f4(")), method4348(method4347("\u0002\u0011\u007f[}")), method4348(method4347("\u0006\u0014=v")), method4348(method4347("\u0002\u0011\u007f^}")), method4348(method4347("\u0002\u0011\u007fY}")), method4348(method4347("\u0002\u0011\u007f]}")), method4348(method4347("\u0002\u0011\u007fX}")), method4348(method4347("\u0002\u0011\u007f_}")) };

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V", line = 4)
    public final void method1030(int arg0, int arg1) {
        try {
            if (arg0 != 64) {
                this.method1029((byte) 106, -98);
            }
            ++field8480;
            super.field7292 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8485[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lpp;)V", line = 16)
    public class588(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(ILpp;)V", line = 22)
    public class588(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZILjava/lang/String;II)V", line = 27)
    public static final void method4345(boolean arg0, int arg1, String arg2, int arg3, int arg4) {
        try {
            class751.method5437((byte) -24, arg0, false, arg2, arg1, (String) null, arg4);
            if (arg3 != -14976) {
                method4345(true, 1, (String) null, 24, 96);
            }
            ++field8482;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8485[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8485[0] : field8485[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)I", line = 38)
    public final int method1029(byte arg0, int arg1) {
        try {
            if (arg0 != -73) {
                return 74;
            } else {
                ++field8481;
                return 1;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8485[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 53)
    public final void method1031(byte arg0) {
        try {
            ++field8483;
            if (super.field7292 != 1 && super.field7292 != 0) {
                super.field7292 = this.method1032(-103);
            }
            if (arg0 < -70) {
                ;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8485[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I", line = 67)
    public final int method4346(int arg0) {
        try {
            ++field8484;
            return arg0 != 3 ? -81 : super.field7292;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8485[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)I", line = 79)
    public final int method1032(int arg0) {
        try {
            if (arg0 >= -101) {
                return -1;
            } else {
                ++field8479;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8485[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4347(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 85);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4348(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 81;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
