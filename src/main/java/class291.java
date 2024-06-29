import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class291 {

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4321 = new String[] { method2363(method2362("#^J\u001dF")), method2363(method2362("#^J\u001fF")), method2363(method2362("#^J\u001aF")), method2363(method2362("#^J\u001cF")) };

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "Lwia;")
    public static class790 field4318 = new class790(61, 2);

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method2358(int arg0) {
        try {
            field4318 = null;
            if (arg0 != 0) {
                method2360(-65, (byte) 67, -19);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4321[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)I")
    public static int method2359(int arg0, int arg1) {
        try {
            return arg0 & arg1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4321[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
    public static final void method2360(int arg0, byte arg1, int arg2) {
        try {
            field4317++;
            class338 var3 = class324.field5123[arg0][arg2];
            if (var3 != null) {
                class475.field6890 = var3.field5261;
                class778.field11309 = var3.field5259;
                class321.field5071 = var3.field5267;
            }
            int var4 = -83 / ((arg1 + 67) / 52);
            class107.method940(1254858946);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4321[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg0 != -18264) {
                method2360(49, (byte) -121, -50);
            }
            if (class200.field3119 <= (arg6 - arg4) && arg4 + arg6 <= class676.field9797 && class676.field9807 <= (arg5 - arg4) && class381.field5786 >= (arg4 + arg5)) {
                class606.method4486(arg3, arg6, arg4, arg5, arg2, arg0 ^ 0xFFFFA020, arg1);
            } else {
                class691.method5060(arg6, arg5, -123, arg4, arg3, arg2, arg1);
            }
            field4319++;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4321[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2362(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2363(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 56;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
