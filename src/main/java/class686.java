import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class686 {

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9917 = new String[] { method5000(method4999("$\b\u0006aJ")), method5000(method4999("1\u001b")), method5000(method4999("$\b\u0006gJ")), method5000(method4999(";\rDI")), method5000(method4999("$\b\u0006`J")), method5000(method4999(".V\u0006\u000b\u001f")), method5000(method4999("$\b\u0006fJ")) };

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lgda;")
    public static class58 field9915;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)Lnu;", line = 6)
    public static final class619 method4995(byte arg0) {
        try {
            field9913++;
            if (arg0 <= 104) {
                field9915 = null;
            }
            try {
                return (class619) Class.forName(field9917[1]).getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9917[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 29)
    public static final void method4996(int arg0, String arg1, boolean arg2) {
        try {
            if (arg0 <= -83) {
                class649.method4735(-1, arg2, -1, arg1, 5121);
                field9914++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9917[4] + arg0 + ',' + (arg1 == null ? field9917[3] : field9917[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IBIIIIII)V", line = 40)
    public static final void method4997(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field9916++;
            class10 var8 = null;
            class10 var9 = (class10) class702.field10091.method3228(11);
            if (arg1 != 112) {
                field9915 = null;
            }
            while (var9 != null) {
                if (var9.field120 == arg4 && var9.field114 == arg5 && var9.field116 == arg2 && var9.field110 == arg0) {
                    var8 = var9;
                    break;
                }
                var9 = (class10) class702.field10091.method3216(true);
            }
            if (var8 == null) {
                var8 = new class10();
                var8.field116 = arg2;
                var8.field110 = arg0;
                var8.field114 = arg5;
                var8.field120 = arg4;
                if (arg5 >= 0 && arg2 >= 0 && class126.field1823 > arg5 && arg2 < class169.field2725) {
                    class337.method2844(var8, (byte) 114);
                }
                class702.field10091.method3220(var8, 0);
            }
            var8.field117 = false;
            var8.field123 = arg3;
            var8.field125 = arg6;
            var8.field122 = true;
            var8.field119 = arg7;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field9917[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 85)
    public static void method4998(boolean arg0) {
        try {
            field9915 = null;
            if (arg0) {
                method4996(-56, null, true);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9917[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZLwj;)Lwj;")
    public abstract class417 method4802(boolean arg0, class417 arg1);

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4999(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5000(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 40;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
