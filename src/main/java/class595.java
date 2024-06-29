import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class595 {

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8599 = new String[] { method4360(method4359("\u007f&m;Q")), method4360(method4359("\u007f&m:Q")), method4360(method4359("\u007f&m9Q")) };

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8593 = null;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "Z")
    public static boolean field8598 = false;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "Lhl;")
    public static class556 field8595 = new class556(44, 3);

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lsj;")
    public static class486 field8594;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method4356(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var6 = arg1 & 0x3;
            field8597++;
            if (var6 == 0) {
                return arg0;
            } else if (var6 == arg3) {
                return arg2;
            } else if (var6 == 2) {
                return 7 - arg0;
            } else {
                return 7 - arg2;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8599[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 22)
    public static void method4357(int arg0) {
        try {
            if (arg0 == 997009537) {
                field8593 = null;
                field8595 = null;
                field8594 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8599[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IBI)I", line = 46)
    public static final int method4358(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 != 117) {
                return 15;
            }
            field8596++;
            int var3 = 0;
            while (arg0 > 0) {
                var3 = var3 << 1 | arg2 & 0x1;
                arg0--;
                arg2 >>>= 0x1;
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8599[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4359(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4360(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 67;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
