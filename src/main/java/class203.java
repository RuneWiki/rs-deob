import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class203 {

    @OriginalMember(owner = "client!m", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3156 = new String[] { method1810(method1809("M='[")), method1810(method1809("M=$[")), method1810(method1809("[=H]\u0001")), method1810(method1809("Nf\n\u001f")), method1810(method1809("M=%[")) };

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Luu;")
    public static class301 field3152 = new class301();

    @OriginalMember(owner = "client!m", name = "d", descriptor = "F")
    public static float field3155;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILib;)Lwn;", line = 6)
    public static final class752 method1805(int arg0, class163 arg1) {
        try {
            field3153++;
            if (arg0 > -65) {
                field3152 = null;
            }
            return new class752(arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1436((byte) 81), arg1.method1455((byte) 62));
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3156[4] + arg0 + ',' + (arg1 == null ? field3156[3] : field3156[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Z", line = 21)
    public static final boolean method1806(boolean arg0) {
        try {
            field3154++;
            if (arg0) {
                return false;
            } else if (class138.field1645 == 3) {
                return class251.field3897 == 0 && class545.field8147 == 0;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3156[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 38)
    public static void method1807(byte arg0) {
        try {
            if (arg0 <= -14) {
                field3152 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3156[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ldf;)V", line = 48)
    public static final void method1808(class420 arg0) {
        class606.field8877.method524(arg0.field6197, arg0.field6199 + (arg0.method1088(-2226) >> 1), arg0.field6211, class107.field1241);
        arg0.field6201 = class107.field1241[0];
        arg0.field6206 = class107.field1241[1];
        arg0.field6208 = class107.field1241[2];
    }

    @OriginalMember(owner = "client!m", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1809(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!m", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1810(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
