import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class class183 {

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2533 = new String[] { method1603(method1602("3!\u000f1+o")), method1603(method1602("3!\u000f1,o")), method1603(method1602("3!\u000f1*o")), method1603(method1602("3!\u000f1)o")), method1603(method1602("3!\u000f1-o")) };

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "Lwia;")
    public static class790 field2530 = new class790(70, 2);

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Z", line = 10)
    public final boolean method1597(byte arg0) {
        try {
            if (arg0 < 15) {
                return true;
            } else {
                field2528++;
                return (this.field2529 & 0x1) != 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2533[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)Z", line = 21)
    public final boolean method1598(int arg0) {
        try {
            field2531++;
            if (arg0 <= 24) {
                return false;
            } else {
                return (this.field2529 & 0x2) != 0;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2533[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 32)
    public static void method1599(int arg0) {
        try {
            if (arg0 == -20693) {
                field2530 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2533[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)Z", line = 43)
    public final boolean method1600(int arg0) {
        try {
            field2527++;
            if (arg0 != 0) {
                this.field2526 = 106;
            }
            return (this.field2529 & 0x8) != 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2533[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)Z", line = 59)
    public final boolean method1601(int arg0) {
        try {
            int var2 = -84 / ((76 - arg0) / 39);
            field2532++;
            return (this.field2529 & 0x4) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2533[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1602(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1603(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 31;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
