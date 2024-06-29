import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public abstract class class218 {

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3187 = new String[] { method1848(method1847("\u0006(\u0013\u0018")), method1848(method1847("\u0007)Q6-")), method1848(method1847("\u0013sQZx")), method1848(method1847("\u0007)Q5-")), method1848(method1847("\u0007)Q7-")) };

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Lmv;")
    public static class125 field3184 = new class125(25, 6);

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Ljava/lang/Object;")
    public static volatile Object field3185 = null;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZII)Z", line = 6)
    public static final boolean method1844(boolean arg0, int arg1, int arg2) {
        try {
            if (!arg0) {
                method1846(-4, null);
            }
            field3183++;
            return (arg2 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3187[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 24)
    public static void method1845(int arg0) {
        try {
            if (arg0 == -1) {
                field3185 = null;
                field3184 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3187[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILtka;)I", line = 36)
    public static final int method1846(int arg0, class599 arg1) {
        try {
            field3186++;
            if (class256.field3668 == arg1) {
                return 7681;
            } else if (class539.field7920 == arg1) {
                return 8448;
            } else if (class795.field11565 == arg1) {
                return 34165;
            } else if (class647.field9205 == arg1) {
                return 260;
            } else if (class264.field3735 == arg1) {
                return 34023;
            } else {
                int var2 = 106 % ((-arg0 - 17) / 38);
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3187[1] + arg0 + ',' + (arg1 == null ? field3187[0] : field3187[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1847(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1848(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 93;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
