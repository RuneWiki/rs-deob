import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class711 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field9865 = -1;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field9868 = 0;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Z")
    public static boolean field9869 = false;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field9866;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3974(int arg0, String arg1) {
        field9863++;
        if (arg0 != 0) {
            method3974(98, null);
        }
        return class551.field7694.containsKey(arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBI)V")
    public static final void method3975(int arg0, byte arg1, int arg2) {
        field9867++;
        class37 var3 = class636.method3571(5, arg2, -68);
        var3.method232(-3);
        var3.field579 = arg0;
        if (arg1 <= 92) {
            method3974(92, null);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lbi;BILjava/lang/String;)Lpf;")
    public static final class584 method3976(class483 arg0, byte arg1, int arg2, String arg3) {
        field9866++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        int var6 = -4 / ((arg1 - 70) / 47);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class755.field10532, 0);
        if (class755.field10532[0] == 0) {
            if (class755.field10532[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class755.field10532, 1);
            if (class755.field10532[1] > 1) {
                byte[] var7 = new byte[class755.field10532[1]];
                OpenGL.glGetInfoLogARB(var4, class755.field10532[1], class755.field10532, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class755.field10532[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class584(arg0, var4, arg2);
    }
}
