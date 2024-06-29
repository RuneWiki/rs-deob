import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class362 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Luf;")
    public static class380 field4789 = new class380(8);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ltt;")
    public static class338 field4791 = new class338(70, -1);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjava/lang/String;Lag;I)Lvk;")
    public static final class451 method2116(byte arg0, String arg1, class469 arg2, int arg3) {
        field4790++;
        if (arg0 != -48) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class544.field7439, 0);
        if (class544.field7439[0] == 0) {
            if (class544.field7439[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class544.field7439, 1);
            if (class544.field7439[1] > 1) {
                byte[] var6 = new byte[class544.field7439[1]];
                OpenGL.glGetInfoLogARB(var4, class544.field7439[1], class544.field7439, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class544.field7439[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class451(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)V")
    public static final void method2117(int arg0, byte arg1) {
        if (arg1 == 126) {
            field4792++;
            class256 var2 = class592.method3279((byte) -98, 7, arg0);
            var2.method1546((byte) 115);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method2118(byte arg0) {
        field4789 = null;
        if (arg0 > 53) {
            field4791 = null;
        }
    }
}
