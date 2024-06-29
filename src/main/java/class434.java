import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class434 extends class206 {

    @OriginalMember(owner = "client!za", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6373 = new String[] { method3322(method3321("\bo\"-")), method3322(method3321("\u001d4`oC")), method3322(method3321("\u001c{`\u0004\u0016")), method3322(method3321("\u001c{`\u0007\u0016")), method3322(method3321("\u001c{`\u0006\u0016")) };

    @OriginalMember(owner = "client!za", name = "m", descriptor = "Lef;")
    public static class513 field6371 = new class513();

    @OriginalMember(owner = "client!za", name = "j", descriptor = "[I")
    public static int[] field6372 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!za", name = "k", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(ILec;IIIII)V", line = 7)
    public static final void method3318(int arg0, class247 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class360.method2928(arg4, arg2, arg5, arg0, arg1.field6200, arg1.field6211, arg1.field6197, 512, arg6, arg3);
            field6369++;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6373[2] + arg0 + ',' + (arg1 == null ? field6373[0] : field6373[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method3319(int arg0, int arg1, int arg2) {
        try {
            if (arg2 < 49) {
                return false;
            } else {
                field6370++;
                return (arg0 & 0x800) != 0;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6373[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V", line = 33)
    public static void method3320(byte arg0) {
        try {
            field6371 = null;
            if (arg0 < -76) {
                field6372 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6373[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3321(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3322(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 62;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
