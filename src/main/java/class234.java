import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class234 extends class660 {

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3125 = null;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "Lgfa;")
    public static class696 field3128 = new class696(9, 0, 4, 1);

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;")
    public static final String method1425(String arg0, String arg1, char arg2, int arg3) {
        field3129++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = var4;
        int var7 = arg3 + var5;
        if (var7 != 0) {
            int var8 = 0;
            while (true) {
                var8 = arg1.indexOf(arg2, var8);
                if (var8 < 0) {
                    break;
                }
                var8++;
                var6 += var7;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg1.indexOf(arg2, var10);
            if (var11 < 0) {
                var9.append(arg1.substring(var10));
                return var9.toString();
            }
            var9.append(arg1.substring(var10, var11));
            var9.append(arg0);
            var10 = var11 + 1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1426(int arg0, String arg1, String arg2, String arg3) {
        int var4 = 108 % ((-arg0 - 2) / 44);
        field3126++;
        for (int var5 = arg2.indexOf(arg1); var5 != -1; var5 = arg2.indexOf(arg1, arg3.length() + var5)) {
            arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(var5 + arg1.length());
        }
        return arg2;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method1427(byte arg0) {
        field3128 = null;
        field3125 = null;
        if (arg0 >= -7) {
            method1426(-91, null, null, null);
        }
    }
}
