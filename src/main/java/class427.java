import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class427 implements class175 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lnk;")
    private class750 field6733;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6740 = new String[] { method3389(method3388("jRq6\u0001")), method3389(method3388("kO3\u0018")), method3389(method3388("jRq1\u0001")), method3389(method3388("~\u0014qZT")), method3389(method3388("jRq7\u0001")), method3389(method3388("jRq5\u0001")), method3389(method3388("jRq0\u0001")), method3389(method3388("jRqH@kS+J\u0001")) };

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field6732;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V", line = 5)
    public static void method3386(byte arg0) {
        try {
            field6732 = null;
            int var1 = 81 % ((arg0 + 39) / 33);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6740[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)V", line = 14)
    public final void method459(byte arg0) {
        try {
            field6735++;
            if (arg0 != -13) {
                this.field6733 = null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6740[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 24)
    public static final void method3387(int arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6, String arg7, String arg8) {
        try {
            field6738++;
            class583 var9 = class527.field7763[99];
            for (int var10 = 99; var10 > 0; var10--) {
                class527.field7763[var10] = class527.field7763[var10 - 1];
            }
            if (var9 == null) {
                var9 = new class583(arg4, arg2, arg3, arg6, arg1, arg7, arg5, arg8);
            } else {
                var9.method4274(arg1, (byte) 102, arg6, arg5, arg3, arg4, arg2, arg8, arg7);
            }
            class527.field7763[0] = var9;
            int var11 = -42 % ((arg0 + 30) / 36);
            class232.field3589++;
            class550.field8068 = class318.field5182;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field6740[2] + arg0 + ',' + (arg1 == null ? field6740[1] : field6740[3]) + ',' + arg2 + ',' + (arg3 == null ? field6740[1] : field6740[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field6740[1] : field6740[3]) + ',' + (arg7 == null ? field6740[1] : field6740[3]) + ',' + (arg8 == null ? field6740[1] : field6740[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z", line = 50)
    public final boolean method457(byte arg0) {
        try {
            if (arg0 <= 9) {
                return true;
            } else {
                field6737++;
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6740[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZ)V", line = 69)
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            if (arg0) {
                if (arg1) {
                    class662.field9437.method242(0, 0, class64.field881, class333.field5444, this.field6733.field11051, 0);
                }
                field6734++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6740[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lnk;)V", line = 82)
    public class427(class750 arg0) {
        try {
            this.field6733 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6740[7] + (arg0 == null ? field6740[1] : field6740[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3388(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3389(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
