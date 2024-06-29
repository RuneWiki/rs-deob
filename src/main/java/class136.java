import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class136 {

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1923 = new String[] { method1274(method1273("A>\u0015v_")), method1274(method1273("A>\u0015C\u0018t-I^\u0019@q")), method1274(method1273("A>\u0015t_")), method1274(method1273("A>\u0015u_")) };

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lhl;")
    public static class556 field1922 = new class556(131, 6);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIIBIZ)V")
    public static final void method1270(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        try {
            int var7 = 101 / ((-arg4 - 33) / 59);
            field1921++;
            if (arg2 > arg3) {
                int var8 = (arg3 + arg2) / 2;
                int var9 = arg3;
                class139 var10 = class696.field10027[var8];
                class696.field10027[var8] = class696.field10027[arg2];
                class696.field10027[arg2] = var10;
                for (int var11 = arg3; var11 < arg2; var11++) {
                    if (class78.method817(arg0, arg5, class696.field10027[var11], arg1, var10, false, arg6) <= 0) {
                        class139 var12 = class696.field10027[var11];
                        class696.field10027[var11] = class696.field10027[var9];
                        class696.field10027[var9++] = var12;
                    }
                }
                class696.field10027[arg2] = class696.field10027[var9];
                class696.field10027[var9] = var10;
                method1270(arg0, arg1, var9 - 1, arg3, (byte) -109, arg5, arg6);
                method1270(arg0, arg1, arg2, var9 + 1, (byte) 62, arg5, arg6);
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1923[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field1919++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1923[1] + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIBZ)V")
    public static final void method1271(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        try {
            int var7 = 59 / ((arg5 - 53) / 59);
            if ((arg6 ? class623.field8996.field6354.method4796(true) : class623.field8996.field6358.method4796(true)) != 0 && arg0 != 0 && class490.field7395 < 50 && arg2 != -1) {
                class771.field11308[class490.field7395++] = new class746((byte) (arg6 ? 3 : 2), arg2, arg0, arg3, arg4, 0, arg1, null);
            }
            field1920++;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1923[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method1272(byte arg0) {
        try {
            field1922 = null;
            if (arg0 != 2) {
                field1918 = -20;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1923[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1273(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1274(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
