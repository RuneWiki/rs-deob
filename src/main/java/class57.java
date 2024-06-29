import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class57 {

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field615 = new String[] { method425(method424("\u000bnvX\nK")), method425(method424("\u000bnvX\tK")) };

    @OriginalMember(owner = "client!hka", name = "c", descriptor = "Luu;")
    public static class301 field614 = new class301();

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(III)V")
    public static final void method421(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class645.method4748(var3.field1082);
        class645.method4748(var3.field1079);
        if (var3.field1082 != null) {
            var3.field1082 = null;
        }
        if (var3.field1079 != null) {
            var3.field1079 = null;
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIBII)V")
    public static final void method422(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            if (arg2 != 57) {
                method421(106, 15, -40);
            }
            field612++;
            if (arg4 <= arg0) {
                for (int var5 = arg4; var5 < arg0; var5++) {
                    class243.field3731[var5][arg1] = arg3;
                }
            } else {
                for (int var6 = arg0; var6 < arg4; var6++) {
                    class243.field3731[var6][arg1] = arg3;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field615[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)V")
    public static void method423(byte arg0) {
        try {
            field614 = null;
            if (arg0 != -50) {
                method421(-39, 16, -105);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field615[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method424(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method425(char[] arg0) {
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
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
