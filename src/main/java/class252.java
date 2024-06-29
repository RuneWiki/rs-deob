import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class252 {

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3602 = new String[] { method2061(method2060("\u0000L1+.")), method2061(method2060("\u0000L1\u001ei!Rm\u0003h\u0015\u000e")), method2061(method2060("\u0000L1(.")) };

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)I", line = 3)
    public final int method2058(int arg0, int arg1, int arg2) {
        try {
            field3601++;
            int var4 = arg1 < class391.field5700 ? class391.field5700 : arg1;
            if (class783.field11302 == this) {
                return 0;
            } else if (arg2 != 0) {
                return 105;
            } else if (class790.field11490 == this) {
                return var4 - arg0;
            } else if (class632.field8982 == this) {
                return (var4 - arg0) / 2;
            } else {
                return 0;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3602[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "toString", descriptor = "()Ljava/lang/String;", line = 31)
    public final String toString() {
        try {
            field3600++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3602[1] + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CZ)Z", line = 40)
    public static final boolean method2059(char arg0, boolean arg1) {
        try {
            field3599++;
            if (arg1) {
                method2059((char) 65459, false);
            }
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3602[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2060(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2061(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 6;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
