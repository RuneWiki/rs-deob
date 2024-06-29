import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class248 {

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lbga;[BII)Lifa;")
    public static final class428 method1694(class358 arg0, byte[] arg1, int arg2, int arg3) {
        field3595++;
        if (arg1 == null || arg1.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 > -95) {
            method1694(null, null, -27, 75);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class341.field4797, 0);
        if (class341.field4797[0] == 0) {
            if (class341.field4797[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class341.field4797, 1);
            if (class341.field4797[1] > 1) {
                byte[] var6 = new byte[class341.field4797[1]];
                OpenGL.glGetInfoLogARB(var4, class341.field4797[1], class341.field4797, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class341.field4797[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class428(arg0, var4, arg3);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)Ljk;")
    public static final class634 method1695(int arg0, int arg1) {
        field3597++;
        class634 var2 = (class634) class346.field4850.method2364((long) arg1, (byte) -68);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class536.field7417.method863(-1860, arg1, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class634 var4;
        try {
            var4 = class228.method1601(var3, -104);
        } catch (Exception var6) {
            throw new RuntimeException(var6.getMessage() + " S: " + arg1);
        }
        if (arg0 > -103) {
            return null;
        } else {
            class346.field4850.method2367((long) arg1, var4, -1);
            return var4;
        }
    }
}
