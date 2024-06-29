import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class182 {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Ljava/lang/String;")
    public String field2229;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "Ljava/lang/String;")
    public String field2226;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "Ljava/lang/String;")
    public String field2230;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2231 = null;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "F")
    public static float field2227;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1061(int arg0) {
        field2231 = null;
        if (arg0 < 111) {
            method1061(48);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;IBLap;)Ldl;")
    public static final class58 method1062(String arg0, int arg1, byte arg2, class435 arg3) {
        field2228++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg0);
        if (arg2 != -16) {
            field2227 = 1.0128282F;
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class549.field7844, 0);
        if (class549.field7844[0] == 0) {
            if (class549.field7844[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class549.field7844, 1);
            if (class549.field7844[1] > 1) {
                byte[] var6 = new byte[class549.field7844[1]];
                OpenGL.glGetInfoLogARB(var4, class549.field7844[1], class549.field7844, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class549.field7844[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class58(arg3, var4, arg1);
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class182(String arg0, String arg1, String arg2) {
        this.field2229 = arg1;
        this.field2226 = arg2;
        this.field2230 = arg0;
    }
}
