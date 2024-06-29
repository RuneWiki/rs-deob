import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class201 {

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2966 = new String[] { method1731(method1730("\u001a\u0004P75")), method1731(method1730("\u000eOPX`")), method1731(method1730("\u001b\u0014\u0012\u001a")), method1731(method1730("\u001a\u0004P45")), method1731(method1730("\u001a\u0004P55")), method1731(method1730("\u001a\u0004P25")), method1731(method1730("&\t\u001f\u0012x\u0007A\u0012\u001fs\u001e\b\u0010\u0011=\u0013\u0000\u0017\u001ax\u0011[")) };

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lsb;")
    public static class261 field2964 = new class261(119, 3);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lsl;")
    public static class746 field2963;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 7)
    public static void method1726(int arg0) {
        try {
            field2964 = null;
            field2963 = null;
            if (arg0 != 22544) {
                field2964 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2966[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I", line = 18)
    public static final int method1727(int arg0, int arg1, int arg2) {
        try {
            field2965++;
            arg2 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            int var3 = -64 / ((55 - arg1) / 43);
            return (arg0 & 0xFF80) + arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2966[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 41)
    public static final String method1728(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field2962++;
            char[] var4 = new char[arg1];
            int var5 = 0;
            int var6 = 0;
            if (arg2 != -11887) {
                field2963 = null;
            }
            while (arg1 > var6) {
                int var7 = arg3[arg0 + var6] & 0xFF;
                if (var7 != 0) {
                    if (var7 >= 128 && var7 < 160) {
                        char var8 = class615.field8785[var7 - 128];
                        if (var8 == '\u0000') {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
                var6++;
            }
            return new String(var4, 0, var5);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2966[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field2966[2] : field2966[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lml;B[Luk;)Lvr;", line = 82)
    public static final class584 method1729(class194 arg0, byte arg1, class506[] arg2) {
        try {
            if (arg1 != -73) {
                field2963 = null;
            }
            field2961++;
            for (int var3 = 0; var3 < arg2.length; var3++) {
                if (arg2[var3] == null || arg2[var3].field7403 <= 0L) {
                    return null;
                }
            }
            long var4 = OpenGL.glCreateProgramObjectARB();
            for (int var6 = 0; var6 < arg2.length; var6++) {
                OpenGL.glAttachObjectARB(var4, arg2[var6].field7403);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class194.field2706, 0);
            if (class194.field2706[0] == 0) {
                if (class194.field2706[0] == 0) {
                    System.out.println(field2966[6]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class194.field2706, 1);
                if (class194.field2706[1] > 1) {
                    byte[] var7 = new byte[class194.field2706[1]];
                    OpenGL.glGetInfoLogARB(var4, class194.field2706[1], class194.field2706, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (class194.field2706[0] == 0) {
                    for (int var8 = 0; var8 < arg2.length; var8++) {
                        OpenGL.glDetachObjectARB(var4, arg2[var8].field7403);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class584(arg0, var4, arg2);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field2966[5] + (arg0 == null ? field2966[2] : field2966[1]) + ',' + arg1 + ',' + (arg2 == null ? field2966[2] : field2966[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1730(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1731(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 118;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
