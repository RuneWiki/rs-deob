import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class83 {

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field933 = new String[] { method715(method714("\u0002;\u001e\u001d/")), method715(method714("\u0002;\u001e\u001b/")), method715(method714("\u0002;\u001e\u0018/")), method715(method714("\u0002;\u001e\u001a/")) };

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field927 = new String[100];

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Lwq;")
    public static class178 field928 = new class178(8);

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IB)Lfe;", line = 15)
    public static final class596 method710(int arg0, byte arg1) {
        try {
            field930++;
            int var2 = -30 / ((38 - arg1) / 33);
            return new class596(arg0, false);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field933[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 28)
    public static void method711(int arg0) {
        try {
            field928 = null;
            if (arg0 != -1) {
                method710(67, (byte) -116);
            }
            field927 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field933[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(BI)Liu;", line = 43)
    public static final class604 method712(byte arg0, int arg1) {
        try {
            int var2 = 112 % ((-arg0 - 2) / 62);
            field929++;
            return class76.field874 && arg1 >= class29.field355 && class588.field8656 >= arg1 ? class612.field8928[arg1 - class29.field355] : null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field933[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)Z", line = 58)
    public static final boolean method713(int arg0, int arg1) {
        try {
            field931++;
            if (arg0 == 58 || arg0 == 44 || arg0 == 18 || arg0 == 49 || arg0 == 57) {
                return true;
            } else if (arg0 == 30 || arg0 == 1009) {
                return true;
            } else {
                if (arg1 != -50) {
                    field926 = 48;
                }
                return false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field933[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method714(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method715(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 48;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
