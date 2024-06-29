import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class418 {

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6165 = new String[] { method3244(method3243("\n\u0012/XcH")), method3244(method3243("\n\u0012/X`H")), method3244(method3243("\u000e\u0005\"\u001a")), method3244(method3243("\u001b^`X_")) };

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field6162 = 1403;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Lni;")
    public static class547 field6161 = new class547(method3244(method3243("23")), 1);

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "[Laha;")
    public static class400[] field6164 = new class400[100];

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "[I")
    public static int[] field6160;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 29)
    public static void method3241(int arg0) {
        try {
            field6160 = null;
            field6161 = null;
            if (arg0 <= -108) {
                field6164 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6165[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILhs;Ldf;I)V", line = 90)
    public static final void method3242(int arg0, class344 arg1, class420 arg2, int arg3) {
        try {
            field6163++;
            if (class86.field958 < 50 && arg1 != null && arg1.field5339 != null && arg3 < arg1.field5339.length && arg1.field5339[arg3] != null) {
                int var4 = arg1.field5339[arg3][0];
                int var5 = var4 >> 8;
                int var6 = (var4 & 0xF7) >> 5;
                if (arg1.field5339[arg3].length > 1) {
                    int var7 = (int) ((double) arg1.field5339[arg3].length * Math.random());
                    if (var7 > 0) {
                        var5 = arg1.field5339[arg3][var7];
                    }
                }
                int var8 = var4 & 0x1F;
                int var9 = 256;
                if (arg1.field5356 != null && arg1.field5351 != null) {
                    var9 = (int) ((double) (arg1.field5351[arg3] - arg1.field5356[arg3]) * Math.random()) + arg1.field5356[arg3];
                }
                int var10 = arg1.field5340 == null ? 255 : arg1.field5340[arg3];
                if (var8 == 0) {
                    if (class225.field3446 == arg2) {
                        if (!arg1.field5360) {
                            class655.method4802(0, var9, var6, var10, var5, (byte) -95);
                            return;
                        }
                        class603.method4474(var10, 0, var5, var9, (byte) -123, var6, false);
                    }
                } else if (class289.field4305.field803.method4492(false) != 0) {
                    int var11 = arg2.field6197 - 256 >> 9;
                    int var12 = arg2.field6211 + arg0 >> 9;
                    int var13 = class225.field3446 == arg2 ? 0 : (arg2.field6200 << 24) + (var11 << 16) + (var12 << 8) + var8;
                    class534.field7826[class86.field958++] = new class305((byte) (arg1.field5360 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6165[1] + arg0 + ',' + (arg1 == null ? field6165[2] : field6165[3]) + ',' + (arg2 == null ? field6165[2] : field6165[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3243(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3244(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
