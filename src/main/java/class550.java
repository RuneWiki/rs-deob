import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class550 extends class689 {

    @OriginalMember(owner = "client!wv", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field8039 = new String[] { method4121(method4120("cT\u001b`\b")), method4121(method4120("o\f\u001b\f]")), method4121(method4120("cT\u001bc\b")), method4121(method4120("GJTFEf\u0002VMMdKYG\u0000rC\\NEp\u0018")), method4121(method4120("zWYN")) };

    @OriginalMember(owner = "client!wv", name = "V", descriptor = "Lui;")
    public static class251 field8036 = new class251(20);

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "Lui;")
    public static class251 field8037 = new class251(4);

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "I")
    public static int field8038 = 0;

    @OriginalMember(owner = "client!wv", name = "U", descriptor = "I")
    public int field8034;

    @OriginalMember(owner = "client!wv", name = "T", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ldga;II[B)Lfb;")
    public static final class263 method4118(class713 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field8035++;
            if (arg1 != 13787) {
                field8036 = null;
            }
            if (arg3 == null || arg3.length == 0) {
                return null;
            }
            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceRawARB(var4, arg3);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class779.field11091, 0);
            if (class779.field11091[0] == 0) {
                if (class779.field11091[0] == 0) {
                    System.out.println(field8039[3]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class779.field11091, 1);
                if (class779.field11091[1] > 1) {
                    byte[] var6 = new byte[class779.field11091[1]];
                    OpenGL.glGetInfoLogARB(var4, class779.field11091[1], class779.field11091, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class779.field11091[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class263(arg0, var4, arg2);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8039[2] + (arg0 == null ? field8039[4] : field8039[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8039[4] : field8039[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lrfa;)V")
    public class550(class202 arg0) {
        super(arg0, false);
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)V")
    public static void method4119(byte arg0) {
        try {
            field8036 = null;
            if (arg0 == -36) {
                field8037 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8039[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4120(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4121(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 34;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
