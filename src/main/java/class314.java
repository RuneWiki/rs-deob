import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class314 {

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4973 = new String[] { method2648(method2647("U\u000euw=\u0013")), method2648(method2647("U\u0019x5")), method2648(method2647("@B:w\u0001")), method2648(method2647("U\u000euw>\u0013")), method2648(method2647("U\u000euw?\u0013")) };

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "[I")
    public static int[] field4967 = new int[4096];

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "C")
    public char field4969;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILib;I)V", line = 7)
    private final void method2644(int arg0, class163 arg1, int arg2) {
        try {
            if (arg2 >= -34) {
                this.method2646(null, -92);
            }
            if (arg0 == 1) {
                this.field4969 = class259.method2185(-161, arg1.method1414(1));
            } else if (arg0 == 2) {
                this.field4965 = arg1.method1445((byte) 124);
                this.field4968 = arg1.method1455((byte) 62);
                this.field4966 = arg1.method1455((byte) 62);
            }
            field4972++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4973[0] + arg0 + ',' + (arg1 == null ? field4973[1] : field4973[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V", line = 34)
    public static void method2645(byte arg0) {
        try {
            if (arg0 <= -83) {
                field4967 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4973[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lib;I)V", line = 45)
    public final void method2646(class163 arg0, int arg1) {
        try {
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    field4970++;
                    if (arg1 != 1) {
                        method2645((byte) 106);
                        return;
                    }
                    return;
                }
                this.method2644(var3, arg0, arg1 ^ 0xFFFFFFC0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4973[3] + (arg0 == null ? field4973[1] : field4973[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2647(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2648(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 124;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
