import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class331 extends class551 {

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "Lws;")
    public class531 field4905;

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!vn", name = "w", descriptor = "Lqp;")
    public static class586 field4908 = new class586(47, 4);

    @OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
    public static int field4911 = 0;

    @OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!vn", name = "x", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!vn", name = "y", descriptor = "Lha;")
    public static class116 field4910;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I", line = 3)
    public static final int method2080(byte arg0) {
        field4906++;
        if (arg0 != -116) {
            method2082(null, null, -109, -119);
        }
        if ((double) class113.field1433 == 3.0D) {
            return 37;
        } else if ((double) class113.field1433 == 4.0D) {
            return 50;
        } else if ((double) class113.field1433 == 6.0D) {
            return 75;
        } else if ((double) class113.field1433 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lws;I)V", line = 32)
    public class331(class531 arg0, int arg1) {
        this.field4905 = arg0;
        this.field4904 = arg1;
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V", line = 43)
    public static void method2081(byte arg0) {
        field4910 = null;
        field4908 = null;
        if (arg0 != 55) {
            field4908 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/lang/String;Los;II)Lvt;", line = 56)
    public static final class346 method2082(String arg0, class468 arg1, int arg2, int arg3) {
        field4907++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class86.field1019, arg2);
        if (class86.field1019[0] == 0) {
            if (class86.field1019[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class86.field1019, 1);
            if (class86.field1019[1] > 1) {
                byte[] var6 = new byte[class86.field1019[1]];
                OpenGL.glGetInfoLogARB(var4, class86.field1019[1], class86.field1019, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class86.field1019[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class346(arg1, var4, arg3);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)Z")
    public abstract boolean method121(byte arg0);

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method122(byte arg0);
}
