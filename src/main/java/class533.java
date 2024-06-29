import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class533 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field6740 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILjc;[B)Lkga;")
    public static final class578 method2912(int arg0, int arg1, class179 arg2, byte[] arg3) {
        field6739++;
        if (arg3 == null || arg3.length == 0) {
            return null;
        }
        if (arg1 >= -121) {
            field6740 = -89;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class518.field6598, 0);
        if (class518.field6598[0] == 0) {
            if (class518.field6598[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class518.field6598, 1);
            if (class518.field6598[1] > 1) {
                byte[] var6 = new byte[class518.field6598[1]];
                OpenGL.glGetInfoLogARB(var4, class518.field6598[1], class518.field6598, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class518.field6598[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class578(arg2, var4, arg0);
    }
}
