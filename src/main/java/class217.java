import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class217 extends class524 {

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3400 = new String[] { method1941(method1940("ct\u0010A\r9")), method1941(method1940("ct\u0010A\u000e9")), method1941(method1940("ct\u0010A\f9")), method1941(method1940("ct\u0010A\n9")), method1941(method1940("ct\u0010A\b9")), method1941(method1940("ct\u0010A\u000f9")), method1941(method1940("ct\u0010A\t9")) };

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "Lhl;")
    public static class556 field3392 = new class556(136, -1);

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!rea", name = "x", descriptor = "I")
    public int field3389;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
    public int field3395;

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!rea", name = "y", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "J")
    public long field3393;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)I", line = 5)
    public final int method1933(int arg0) {
        try {
            field3397++;
            if (arg0 != -30035) {
                field3392 = null;
            }
            return this.field3395;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3400[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "(I)I", line = 16)
    public static final int method1934(int arg0) {
        try {
            if (arg0 >= -125) {
                return 75;
            } else {
                field3399++;
                return 16;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3400[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)I", line = 36)
    public final int method1935(int arg0) {
        try {
            if (arg0 > -103) {
                this.field3389 = -104;
            }
            field3388++;
            return this.field3398;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3400[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)I", line = 47)
    public final int method1936(int arg0) {
        try {
            if (arg0 != 11481) {
                this.method1935(37);
            }
            field3396++;
            return this.field3389;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3400[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "(I)V", line = 58)
    public static void method1937(int arg0) {
        try {
            field3392 = null;
            if (arg0 != -1) {
                field3392 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3400[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)I", line = 68)
    public final int method1938(int arg0) {
        try {
            field3391++;
            if (arg0 != -2) {
                method1934(-41);
            }
            return this.field3394;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3400[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)J", line = 79)
    public final long method1939(byte arg0) {
        try {
            field3390++;
            if (arg0 != -32) {
                this.field3389 = 127;
            }
            return this.field3393;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3400[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1940(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1941(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
