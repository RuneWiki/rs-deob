import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class327 extends class206 {

    @OriginalMember(owner = "client!kka", name = "m", descriptor = "Z")
    public boolean field5151;

    @OriginalMember(owner = "client!kka", name = "o", descriptor = "I")
    public int field5154;

    @OriginalMember(owner = "client!kka", name = "r", descriptor = "I")
    public int field5152;

    @OriginalMember(owner = "client!kka", name = "q", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!kka", name = "p", descriptor = "I")
    public int field5157;

    @OriginalMember(owner = "client!kka", name = "k", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5160 = new String[] { method2769(method2768("+0\b/ph")), method2769(method2768("+0\b/\r)5\u0000u\u000fh")) };

    @OriginalMember(owner = "client!kka", name = "n", descriptor = "Lwia;")
    public static class790 field5156 = new class790(65, 8);

    @OriginalMember(owner = "client!kka", name = "l", descriptor = "Z")
    public static boolean field5159 = false;

    @OriginalMember(owner = "client!kka", name = "j", descriptor = "I")
    public static int field5158 = 0;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2767(boolean arg0) {
        try {
            if (arg0) {
                field5156 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5160[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(IIIIIZ)V", line = 21)
    public class327(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            this.field5151 = arg5;
            this.field5154 = arg3;
            this.field5152 = arg2;
            this.field5155 = arg1;
            this.field5157 = arg0;
            this.field5153 = arg4;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5160[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2768(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2769(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
