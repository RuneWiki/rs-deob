import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class557 extends class330 {

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field8117 = new String[] { method4173(method4172("|\u0007\u001cc\u0015!")), method4173(method4172("|\u0007\u001cc\u001b!")), method4173(method4172("|\u0007\u001cc\u0014!")), method4173(method4172("|\u0007\u001cc\u0012!")), method4173(method4172("|\u0007\u001cc\u001e!")) };

    @OriginalMember(owner = "client!uaa", name = "y", descriptor = "[I")
    public static int[] field8114 = new int[8];

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
    public static int field8116 = 1400;

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    public static int field8113 = 0;

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method4169(byte arg0, int arg1) {
        try {
            ++field8110;
            if (arg0 > -2) {
                return false;
            } else {
                return arg1 == 0 || arg1 == 2;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8117[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class557(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIII)V", line = 20)
    public final void method2596(int arg0, int arg1, int arg2, int arg3) {
        try {
            if (arg2 != 2) {
                method4171(64, -74);
            }
            super.field4513 = arg1;
            super.field4500 = arg0;
            ++field8111;
            super.field4503 = arg3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8117[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FI)V", line = 37)
    public final void method2598(float arg0, int arg1) {
        try {
            super.field4511 = arg0;
            ++field8112;
            if (arg1 != -6546) {
                method4171(-29, -4);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8117[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(B)V", line = 48)
    public static void method4170(byte arg0) {
        try {
            field8114 = null;
            int var1 = -82 % ((arg0 - 2) / 56);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8117[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)V", line = 63)
    public static final void method4171(int arg0, int arg1) {
        try {
            if (arg0 < -102) {
                ++field8115;
                if (~class385.field5631 == -1) {
                    class786.field11354.method3313(arg1, (byte) 121);
                } else {
                    class760.field10848 = arg1;
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8117[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4172(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4173(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
