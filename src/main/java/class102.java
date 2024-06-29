import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class102 extends class698 {

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    private int field1494;

    @OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1500 = new String[] { method972(method971("`\u00190\u0014>")), method972(method971("`\u00190\u0010>")), method972(method971("`\u00190\u0015>")), method972(method971("jB0|k")), method972(method971("\u007f\u0019r>")), method972(method971("`\u00190\u0017>")), method972(method971("{\ry5z")), method972(method971("`\u00190\u0011>")), method972(method971("`\u00190\u0013>")), method972(method971("`\u00190\u0016>")), method972(method971("B\u0004\u007f6scL}={a\u0005r76w\rw>suV")), method972(method971("`\u00190n\u007f\u007f\u0005jl>")) };

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Lsj;")
    public static class486 field1499;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)V", line = 5)
    public final void method964(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 == -66) {
                ++field1495;
                int var4 = this.field1493 * arg0 >> 12;
                int var5 = this.field1492 * arg0 >> 12;
                int var6 = this.field1498 * arg1 >> 12;
                int var7 = this.field1494 * arg1 >> 12;
                class225.method1979(var5, super.field10051, -2172, super.field10050, var4, super.field10052, var6, var7);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1500[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIII)V", line = 25)
    public class102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        try {
            this.field1493 = arg0;
            this.field1494 = arg3;
            this.field1498 = arg1;
            this.field1492 = arg2;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1500[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZII)V", line = 37)
    public final void method965(boolean arg0, int arg1, int arg2) {
        try {
            ++field1489;
            int var4 = this.field1493 * arg1 >> 12;
            int var5 = this.field1492 * arg1 >> 12;
            if (arg0) {
                method970(30, (String) null, -5, (class159) null);
            }
            int var6 = this.field1498 * arg2 >> 12;
            int var7 = this.field1494 * arg2 >> 12;
            class383.method3129(var5, super.field10052, var6, var4, super.field10050, 1, var7);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1500[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 58)
    public static void method966(byte arg0) {
        try {
            if (arg0 >= 43) {
                field1499 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1500[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V", line = 68)
    public final void method967(int arg0, int arg1, int arg2) {
        try {
            ++field1490;
            int var4 = this.field1493 * arg1 >> 12;
            int var5 = this.field1492 * arg1 >> 12;
            int var6 = this.field1498 * arg2 >> 12;
            int var7 = this.field1494 * arg2 >> 12;
            class478.method3654(super.field10051, var7, var5, false, var4, var6);
            if (arg0 != 19388) {
                this.field1493 = -88;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1500[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLgda;Ljava/awt/Canvas;Ld;I)Lha;", line = 87)
    public static final class63 method968(byte arg0, class58 arg1, Canvas arg2, class158 arg3, int arg4) {
        try {
            ++field1496;
            if (!class424.method3367((byte) 72)) {
                throw new RuntimeException("");
            } else if (!class259.method2177((byte) -72, field1500[6])) {
                throw new RuntimeException("");
            } else {
                OpenGL var5 = new OpenGL();
                int var6 = -7 / ((-55 - arg0) / 59);
                long var7 = var5.init(arg2, 8, 8, 8, 24, 0, arg4);
                if (var7 == 0L) {
                    throw new RuntimeException("");
                } else {
                    class278 var9 = new class278(var5, arg2, var7, arg3, arg1, arg4);
                    var9.method2215(0);
                    return var9;
                }
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field1500[5] + arg0 + ',' + (arg1 != null ? field1500[3] : field1500[4]) + ',' + (arg2 != null ? field1500[3] : field1500[4]) + ',' + (arg3 != null ? field1500[3] : field1500[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIILoi;)V", line = 117)
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class77 arg6) {
        try {
            class326.method2772(false, arg6.field9975, arg2, arg3, arg4, arg6.field9983, arg6.field9985, arg0, arg5, 0);
            ++field1491;
            if (arg1 != -21235) {
                method969(36, -68, -12, -64, 41, 67, (class77) null);
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1500[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1500[3] : field1500[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;ILvf;)Llo;", line = 132)
    public static final class789 method970(int arg0, String arg1, int arg2, class159 arg3) {
        try {
            ++field1497;
            long var4 = OpenGL.glCreateShaderObjectARB(arg0);
            OpenGL.glShaderSourceARB(var4, arg1);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class523.field7725, 0);
            if (~class523.field7725[0] == -1) {
                if (class523.field7725[0] == 0) {
                    System.out.println(field1500[10]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class523.field7725, 1);
                if (~class523.field7725[1] < -2) {
                    byte[] var6 = new byte[class523.field7725[1]];
                    OpenGL.glGetInfoLogARB(var4, class523.field7725[1], class523.field7725, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class523.field7725[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return arg2 != -7876 ? null : new class789(arg3, var4, arg0);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1500[9] + arg0 + ',' + (arg1 != null ? field1500[3] : field1500[4]) + ',' + arg2 + ',' + (arg3 != null ? field1500[3] : field1500[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method971(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method972(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
