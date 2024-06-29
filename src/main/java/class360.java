import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class360 extends class512 {

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "[I")
    public int[] field5499;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
    public int[] field5504;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5505 = new String[] { method2932(method2931("\u0010<F\"'")), method2932(method2931("\u001a#\u0004\r")), method2932(method2931("\u000fxFOr")), method2932(method2931("\u0010<F]f\u001a?\u001c_'")), method2932(method2931("\u0010<F%'")), method2932(method2931("\u0010<F '")), method2932(method2931("\u0010<F#'")) };

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "[I")
    public static int[] field5500;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "[Lmba;")
    public static class441[] field5498;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 4)
    public static final void method2927(int arg0) {
        try {
            field5501++;
            class598.field8804 = new class513();
            if (arg0 != 0) {
                method2927(75);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5505[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIII)V", line = 20)
    public static final void method2928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field5502++;
            if (arg6 >= arg7 && arg5 >= 512 && arg6 <= (class648.field9378 - 2) * 512 && (class659.field9506 - 2) * 512 >= arg5) {
                int var10 = class316.method2656(arg6, arg4, arg5, arg7 ^ 0x200) - arg3;
                if (class235.field3549) {
                    class607.method4494(true, (byte) 111);
                } else {
                    class272.field4126.method2375(arg0, 0, 0);
                    class610.field8913.method495(class272.field4126);
                }
                if (class640.field9291) {
                    class610.field8913.method491(arg6, var10, arg5, class726.field10487, class694.field10139);
                } else {
                    class610.field8913.method471(arg6, var10, arg5, class694.field10139);
                }
                if (class235.field3549) {
                    class710.method5178(arg7 - 7349);
                } else {
                    class272.field4126.method2375(-arg0, 0, 0);
                    class610.field8913.method495(class272.field4126);
                }
            } else {
                class694.field10139[0] = class694.field10139[1] = -1;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field5505[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V", line = 56)
    public static void method2929(int arg0) {
        try {
            if (arg0 != 512) {
                method2930(8, 3);
            }
            field5500 = null;
            field5498 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5505[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ldn;", line = 68)
    public static final class542 method2930(int arg0, int arg1) {
        try {
            field5503++;
            class542 var2 = (class542) class370.field5641.method1558((byte) 96, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class274.field4146.method3632(1, arg1, -119);
            class542 var4 = new class542();
            var4.field8116 = arg1;
            if (var3 != null) {
                var4.method4101(new class163(var3), false);
            }
            var4.method4099(-2086);
            if (var4.field8113 == 2 && class680.field9858.method977((long) arg1, 1) == null) {
                class680.field9858.method968((byte) -111, (long) arg1, new class609(class593.field8709));
                class587.field8640[class593.field8709++] = var4;
            }
            class370.field5641.method1556((long) arg1, var4, 1);
            int var5 = -87 / ((arg0 - 64) / 48);
            return var4;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5505[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II[I[I)V", line = 108)
    public class360(int arg0, int arg1, int[] arg2, int[] arg3) {
        try {
            this.field5499 = arg3;
            this.field5504 = arg2;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5505[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5505[1] : field5505[2]) + ',' + (arg3 == null ? field5505[1] : field5505[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2931(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2932(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
