import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class329 extends class46 {

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "Lti;")
    public class464 field5183;

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5188 = new String[] { method2787(method2786("qE$)\u0010")), method2787(method2786("b\rk)+\"")), method2787(method2786("d\u001efk")), method2787(method2786("b\rk)Qc\u0005csS\"")), method2787(method2786("b\rk)*\"")), method2787(method2786("b\rk)%\"")) };

    @OriginalMember(owner = "client!hfa", name = "u", descriptor = "Z")
    public static boolean field5187 = false;

    @OriginalMember(owner = "client!hfa", name = "v", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!hfa", name = "t", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!hfa", name = "w", descriptor = "Lao;")
    public static class302 field5185;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "(B)V", line = 5)
    public static final void method2783(byte arg0) {
        try {
            field5182++;
            if (arg0 == 14) {
                for (int var1 = 0; var1 < class6.field60; var1++) {
                    int var2 = class590.field8680[var1];
                    class383 var3 = (class383) class207.field3184.method977((long) var2, arg0 ^ 0xF);
                    if (var3 != null) {
                        class612 var4 = var3.field5799;
                        class661.method4850((byte) -89, var4.field8947.field7159, var4);
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5188[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ILffa;IIB[BZI)Lgda;", line = 34)
    public static final class61 method2784(int arg0, class197 arg1, int arg2, int arg3, byte arg4, byte[] arg5, boolean arg6, int arg7) {
        try {
            field5186++;
            if (arg4 != 53) {
                return null;
            } else if (!arg1.field2956 && (!class40.method269(arg3, arg4 ^ 0x55) || !class40.method269(arg2, 126))) {
                return arg1.field2964 ? new class61(arg1, 34037, arg7, arg3, arg2, arg6, arg5, arg0) : new class61(arg1, arg7, arg3, arg2, class12.method83((byte) -1, arg3), class12.method83((byte) -1, arg2), arg5, arg0);
            } else {
                return new class61(arg1, 3553, arg7, arg3, arg2, arg6, arg5, arg0);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5188[1] + arg0 + ',' + (arg1 == null ? field5188[2] : field5188[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5188[2] : field5188[0]) + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 55)
    public static void method2785(int arg0) {
        try {
            field5185 = null;
            if (arg0 != 0) {
                field5187 = true;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5188[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lti;)V", line = 66)
    public class329(class464 arg0) {
        try {
            this.field5183 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5188[3] + (arg0 == null ? field5188[2] : field5188[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2786(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2787(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
