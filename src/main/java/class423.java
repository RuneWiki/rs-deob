import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class423 {

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6049 = new String[] { method3290(method3289("/\u0016\n\u0013$")), method3290(method3289("$R\n|q")), method3290(method3289("/\u0016\n\u0011$")), method3290(method3289("1\tH>")), method3290(method3289("/\u0016\n\u0010$")) };

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field6047 = -1;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method3286(int arg0) {
        try {
            field6048++;
            class224 var1 = (class224) class486.field7127.method3977((byte) -68);
            if (arg0 > 90) {
                while (var1 != null) {
                    if (var1.field3259) {
                        var1.method4294(0);
                    } else {
                        var1.field3243 = true;
                        if (var1.field3248 >= 0 && var1.field3247 >= 0 && class625.field8929 > var1.field3248 && var1.field3247 < class14.field187) {
                            class771.method5556(true, var1);
                        }
                    }
                    var1 = (class224) class486.field7127.method3987(0);
                }
                for (class224 var2 = (class224) class631.field8964.method3977((byte) -29); var2 != null; var2 = (class224) class631.field8964.method3987(0)) {
                    if (var2.field3259) {
                        var2.method4294(0);
                    } else {
                        var2.field3243 = true;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6049[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIZIII)J")
    public static final long method3287(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        try {
            field6045++;
            class267.field3791.clear();
            if (arg3) {
                field6047 = -34;
            }
            class267.field3791.set(arg1, arg2, arg6, arg5, arg4, arg0);
            return class267.field3791.getTime().getTime();
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6049[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljc;I)Lbia;")
    public static final class745 method3288(class711 arg0, int arg1) {
        try {
            field6046++;
            if (arg1 <= 14) {
                field6047 = 49;
            }
            class745 var2 = new class745();
            var2.field10574 = arg0.method5116((byte) -113);
            var2.field10571 = class591.field8501.method4619(var2.field10574, -380);
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6049[2] + (arg0 == null ? field6049[3] : field6049[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3289(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xC);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3290(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 95;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 36;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
