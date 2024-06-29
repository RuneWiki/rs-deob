import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class31 {

    @OriginalMember(owner = "client!o", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field367 = new String[] { method210(method209("x`\u000b\u0002")), method210(method209("x`\f\u0002")), method210(method209("x`\r\u0002")), method210(method209("x`\u000e\u0002")) };

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lkia;")
    public static class646 field364 = new class646(method210(method209("[\u0007\u0019o")), "", "", 0);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lwia;")
    public static class790 field365 = new class790(85, 15);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method205(int arg0) {
        try {
            field364 = null;
            field365 = null;
            int var1 = 127 % ((arg0 + 32) / 39);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field367[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field366++;
            int var8 = class541.method4089(class676.field9807, class381.field5786, arg0, 18286);
            if (arg3 <= -31) {
                int var9 = class541.method4089(class676.field9807, class381.field5786, arg1, 18286);
                int var10 = class541.method4089(class200.field3119, class676.field9797, arg2, 18286);
                int var11 = class541.method4089(class200.field3119, class676.field9797, arg7, 18286);
                int var12 = class541.method4089(class676.field9807, class381.field5786, arg0 + arg5, 18286);
                int var13 = class541.method4089(class676.field9807, class381.field5786, arg1 - arg5, 18286);
                for (int var14 = var8; var14 < var12; var14++) {
                    class319.method2702(class243.field3731[var14], var10, var11, true, arg6);
                }
                for (int var15 = var9; var15 > var13; var15--) {
                    class319.method2702(class243.field3731[var15], var10, var11, true, arg6);
                }
                int var16 = class541.method4089(class200.field3119, class676.field9797, arg2 + arg5, 18286);
                int var17 = class541.method4089(class200.field3119, class676.field9797, arg7 - arg5, 18286);
                for (int var18 = var12; var18 <= var13; var18++) {
                    int[] var19 = class243.field3731[var18];
                    class319.method2702(var19, var10, var16, true, arg6);
                    class319.method2702(var19, var16, var17, true, arg4);
                    class319.method2702(var19, var17, var11, true, arg6);
                }
            }
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field367[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)Z")
    public static final boolean method207(int arg0, boolean arg1) {
        try {
            if (arg1) {
                return true;
            }
            field363++;
            if (arg0 == 22 || arg0 == 15 || arg0 == 3 || arg0 == 16 || arg0 == 1002) {
                return true;
            } else {
                return arg0 == 51 || arg0 == 1003;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field367[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method208(int arg0, int arg1) {
        try {
            field362++;
            class166.field2289 = null;
            class84.field940 = 1;
            class550.field8199 = arg1;
            class494.field7093 = null;
            class252.field3914 = -1;
            class336.field5242 = false;
            class515.field7438 = arg0;
            class573.field8466 = -1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field367[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method209(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!o", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method210(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
