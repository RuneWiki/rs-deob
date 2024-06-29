import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class558 {

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public int field8125 = -1;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8129 = new String[] { method4180(method4179("/Jb\u0015U`")), method4180(method4179("/Jb\u0015R`")), method4180(method4179("3\u0006-\u0015l")), method4180(method4179("&]oW")), method4180(method4179("/Jb\u0015S`")), method4180(method4179("/Jb\u0015T`")), method4180(method4179("/Jb\u0015P`")), method4180(method4179("\u001b@b_t:\b`T|8Ao^1.IjWt,\u0012")) };

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "[[I")
    public static int[][] field8124 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field8119;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "J")
    public static long field8118;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "Lue;")
    public class90 field8126;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "[I")
    public int[] field8122;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "[J")
    public long[] field8127;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "[Ljava/lang/String;")
    public String[] field8128;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(III)I")
    public static final int method4174(int arg0, int arg1, int arg2) {
        try {
            field8121++;
            if (arg1 > arg2) {
                int var3 = arg2;
                arg2 = arg1;
                arg1 = var3;
            }
            if (arg0 < 66) {
                field8118 = 76L;
            }
            while (arg1 != 0) {
                int var4 = arg2 % arg1;
                arg2 = arg1;
                arg1 = var4;
            }
            return arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8129[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public static void method4175(int arg0) {
        try {
            field8124 = null;
            if (arg0 >= -87) {
                method4176(null, 49, (byte) -35);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8129[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lqo;IB)V")
    public static final void method4176(class170 arg0, int arg1, byte arg2) {
        try {
            if (arg2 != 1) {
                method4175(52);
            }
            if (arg0.field2194 != null) {
                int var3 = arg0.field2194[arg1 + 1];
                if (var3 != arg0.field2228.method837(-38)) {
                    arg0.field2228.method833(var3, arg0.field2228.method836(arg2 + 77), 0);
                    arg0.field2258 = arg0.field2257;
                }
            }
            field8120++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8129[4] + (arg0 == null ? field8129[3] : field8129[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
    public static final void method4177(int arg0, int arg1, int arg2) {
        try {
            field8123++;
            class294 var3 = class146.method1261((long) arg0, arg1 + 5416, 5);
            var3.method2378(arg1 ^ 0x1534);
            if (arg1 == -5450) {
                var3.field4133 = arg2;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8129[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILml;Ljava/lang/String;I)Luk;")
    public static final class506 method4178(int arg0, class194 arg1, String arg2, int arg3) {
        try {
            if (arg3 != -8086) {
                method4174(54, -102, -39);
            }
            field8119++;
            long var4 = OpenGL.glCreateShaderObjectARB(arg0);
            OpenGL.glShaderSourceARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class784.field11317, 0);
            if (class784.field11317[0] == 0) {
                if (class784.field11317[0] == 0) {
                    System.out.println(field8129[7]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class784.field11317, 1);
                if (class784.field11317[1] > 1) {
                    byte[] var6 = new byte[class784.field11317[1]];
                    OpenGL.glGetInfoLogARB(var4, class784.field11317[1], class784.field11317, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class784.field11317[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class506(arg1, var4, arg0);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8129[6] + arg0 + ',' + (arg1 == null ? field8129[3] : field8129[2]) + ',' + (arg2 == null ? field8129[3] : field8129[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4179(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4180(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
