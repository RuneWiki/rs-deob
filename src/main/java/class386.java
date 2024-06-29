import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class386 extends class109 {

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[Lqp;")
    public class636[] field5150;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lrb;")
    public static class379 field5152 = new class379("WIP", 2);

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lclient;")
    public static client field5153;

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([Lqp;)V", line = 8)
    public class386(class636[] arg0) {
        this.field5150 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lqi;I[BI)Lmn;", line = 16)
    public static final class61 method2209(class510 arg0, int arg1, byte[] arg2, int arg3) {
        field5151++;
        if (arg1 != 31577) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class309.field4188, 0);
        if (class309.field4188[0] == 0) {
            if (class309.field4188[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class309.field4188, 1);
            if (class309.field4188[1] > 1) {
                byte[] var6 = new byte[class309.field4188[1]];
                OpenGL.glGetInfoLogARB(var4, class309.field4188[1], class309.field4188, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class309.field4188[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class61(arg0, var4, arg3);
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V", line = 58)
    public static void method2210(int arg0) {
        field5153 = null;
        if (arg0 == 34065) {
            field5152 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)I", line = 69)
    public static final int method2211(int arg0) {
        int var1 = -102 / ((27 - arg0) / 54);
        field5148++;
        return class540.field7407.method2860((byte) 88);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ldn;B)I", line = 84)
    public static final int method2212(class276 arg0, byte arg1) {
        field5149++;
        if (class293.field3902 == arg0) {
            return 9216;
        } else if (class446.field5908 == arg0) {
            return 34065;
        } else if (class112.field1431 == arg0) {
            return 34066;
        } else {
            if (arg1 < 39) {
                field5152 = null;
            }
            throw new IllegalArgumentException();
        }
    }
}
