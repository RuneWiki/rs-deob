import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class356 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "[C")
    public static char[] field5082 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field5086 = 765;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "F")
    public static float field5083;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I[BILjava/lang/String;)I", line = 9)
    public static final int method2166(int arg0, byte[] arg1, int arg2, String arg3) {
        field5085++;
        int var4 = arg2;
        int var5 = arg3.length();
        int var6 = 0;
        if (arg0 <= 106) {
            method2166(-115, null, 15, null);
        }
        while (var6 < var5) {
            int var7 = class501.method2846(arg3.charAt(var6), (byte) 104);
            int var8 = var5 > (var6 + 1) ? class501.method2846(arg3.charAt(var6 + 1), (byte) 104) : -1;
            int var9 = (var6 + 2) < var5 ? class501.method2846(arg3.charAt(var6 + 2), (byte) 104) : -1;
            int var10 = (var6 + 3) >= var5 ? -1 : class501.method2846(arg3.charAt(var6 + 3), (byte) 104);
            arg1[arg2++] = (byte) class188.method1258(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class188.method1258(var9 >>> 2, class424.method2540(15, var8) << 4);
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class188.method1258(class424.method2540(var9 << 6, 192), var10);
            var6 += 4;
        }
        return arg2 - var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 52)
    public static void method2167(boolean arg0) {
        if (arg0) {
            method2168(null, 19, -112, null, 93, false);
        }
        field5082 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ltk;IILqa;IZ)V", line = 73)
    public static final void method2168(class370 arg0, int arg1, int arg2, class167 arg3, int arg4, boolean arg5) {
        field5081++;
        class169 var6 = class484.field6855.method2557(34, arg0.field5293);
        if (var6.field2465 == -1) {
            return;
        }
        if (arg5) {
            method2167(false);
        }
        int var8;
        if (arg0.field5302) {
            int var7 = arg0.field5268 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class116 var9 = var6.method1168(120, arg0.field5329, arg3, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg0.field5322;
        int var11 = arg0.field5277;
        if ((var8 & 0x1) == 1) {
            var10 = arg0.field5277;
            var11 = arg0.field5322;
        }
        int var12 = var9.method955();
        int var13 = var9.method960();
        if (var6.field2456) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field2464 == 0) {
            var9.method959(arg1, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method664(arg1, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field2464 | 0xFF000000, 1);
        }
    }
}
