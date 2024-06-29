import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class400 {

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "I")
    public int field5978;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "Ljava/lang/String;")
    public String field5980;

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "I")
    public int field5972;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Ljava/lang/String;")
    public String field5979;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public int field5976;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "Ljava/lang/String;")
    public String field5977;

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "I")
    public int field5971;

    @OriginalMember(owner = "client!aha", name = "n", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "Ljava/lang/String;")
    public String field5973;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "Ljava/lang/String;")
    public String field5982;

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5983 = new String[] { method3151(method3150("\r`3L^")), method3151(method3150("\u0017&|L\u001f\u001f t\u0016\u001d^")), method3151(method3150("\u0018;q\u000e")), method3151(method3150("\u0017&|La^")), method3151(method3150("\u0017&|Lb^")) };

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public static int field5970 = -1;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "I")
    public static int field5981 = 0;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "[Lvv;")
    public static class343[] field5975;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V")
    public static void method3148(int arg0) {
        try {
            field5975 = null;
            if (arg0 != 2686) {
                method3148(82);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5983[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;B)V")
    public final void method3149(String arg0, int arg1, String arg2, String arg3, String arg4, int arg5, int arg6, String arg7, byte arg8) {
        try {
            field5969++;
            this.field5978 = class592.method4411(arg8 - 791);
            this.field5979 = arg0;
            this.field5976 = class375.field5711;
            if (arg8 == 59) {
                this.field5973 = arg7;
                this.field5972 = arg1;
                this.field5974 = arg5;
                this.field5980 = arg4;
                this.field5982 = arg2;
                this.field5971 = arg6;
                this.field5977 = arg3;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field5983[3] + (arg0 == null ? field5983[2] : field5983[0]) + ',' + arg1 + ',' + (arg2 == null ? field5983[2] : field5983[0]) + ',' + (arg3 == null ? field5983[2] : field5983[0]) + ',' + (arg4 == null ? field5983[2] : field5983[0]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field5983[2] : field5983[0]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class400(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        try {
            this.field5978 = class592.method4411(-732);
            this.field5980 = arg2;
            this.field5972 = arg1;
            this.field5979 = arg4;
            this.field5976 = class375.field5711;
            this.field5977 = arg3;
            this.field5971 = arg6;
            this.field5974 = arg0;
            this.field5973 = arg5;
            this.field5982 = arg7;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5983[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5983[2] : field5983[0]) + ',' + (arg3 == null ? field5983[2] : field5983[0]) + ',' + (arg4 == null ? field5983[2] : field5983[0]) + ',' + (arg5 == null ? field5983[2] : field5983[0]) + ',' + arg6 + ',' + (arg7 == null ? field5983[2] : field5983[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3150(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3151(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
