import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field297;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)I")
    public static final int method222(int arg0, int arg1, int arg2) {
        field296++;
        if (arg2 != -2871) {
            method223(-30, null, null, true);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field297++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjj;Ljava/lang/String;Z)Lud;")
    public static final class119 method223(int arg0, class66 arg1, String arg2, boolean arg3) {
        field298++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class298.field4279, 0);
        if (!arg3) {
            method222(-83, -2, 71);
        }
        if (class298.field4279[0] == 0) {
            if (class298.field4279[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class298.field4279, 1);
            if (class298.field4279[1] > 1) {
                byte[] var6 = new byte[class298.field4279[1]];
                OpenGL.glGetInfoLogARB(var4, class298.field4279[1], class298.field4279, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class298.field4279[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class119(arg1, var4, arg0);
    }
}
