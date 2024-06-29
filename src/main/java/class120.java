import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class120 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Lsv;")
    public static class570 field2044 = new class570(64, 2);

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lvb;")
    public static class396 field2046 = new class396(7, 5);

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "[Z")
    public static boolean[] field2047;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILfc;[B)Lfo;")
    public static final class679 method1055(int arg0, int arg1, class642 arg2, byte[] arg3) {
        field2048++;
        if (arg3 == null || arg3.length == 0) {
            return null;
        }
        int var4 = -7 / ((arg0 + 64) / 61);
        long var5 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var5, arg3);
        OpenGL.glCompileShaderARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35713, class530.field7382, 0);
        if (class530.field7382[0] == 0) {
            if (class530.field7382[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class530.field7382, 1);
            if (class530.field7382[1] > 1) {
                byte[] var7 = new byte[class530.field7382[1]];
                OpenGL.glGetInfoLogARB(var5, class530.field7382[1], class530.field7382, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class530.field7382[0] == 0) {
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class679(arg2, var5, arg1);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)V")
    public static void method1056(int arg0) {
        field2046 = null;
        field2047 = null;
        if (arg0 > 45) {
            field2044 = null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method1057(int arg0, String arg1, char arg2) {
        field2049++;
        int var3 = arg0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }
}
