import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class498 {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Lwt;")
    public static class329 field6992;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Llf;BILjava/lang/String;)Lmja;", line = 3)
    public static final class440 method2925(class250 arg0, byte arg1, int arg2, String arg3) {
        field6994++;
        if (arg1 <= 38) {
            field6992 = null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class18.field184, 0);
        if (class18.field184[0] == 0) {
            if (class18.field184[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class18.field184, 1);
            if (class18.field184[1] > 1) {
                byte[] var6 = new byte[class18.field184[1]];
                OpenGL.glGetInfoLogARB(var4, class18.field184[1], class18.field184, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class18.field184[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class440(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 45)
    public static void method2926(int arg0) {
        field6992 = null;
        int var1 = 66 / ((-arg0 - 24) / 39);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 55)
    public static final int method2927(byte arg0) {
        if (arg0 > -19) {
            field6992 = null;
        }
        field6995++;
        class535 var1 = class263.field3874;
        synchronized (class263.field3874) {
            return class263.field3874.method3100(-1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)I", line = 68)
    public static final int method2928(int arg0, int arg1) {
        int var2 = -35 % ((36 - arg1) / 62);
        field6993++;
        return arg0 >>> 8;
    }
}
