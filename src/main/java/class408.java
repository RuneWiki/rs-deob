import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class408 {

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lem;")
    public static class206 field5805 = new class206(40, 6);

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "Lmt;")
    public static class362 field5803;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2380(byte arg0) {
        class598.field8356.method974(-20470);
        if (arg0 != -96) {
            method2382(17, null, 41, null);
        }
        field5804++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 17)
    public static void method2381(int arg0) {
        field5803 = null;
        if (arg0 > -8) {
            field5805 = null;
        }
        field5805 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[BILtba;)Ltu;", line = 28)
    public static final class318 method2382(int arg0, byte[] arg1, int arg2, class147 arg3) {
        if (arg2 != 12889) {
            return null;
        }
        field5806++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class173.field2516, 0);
        if (class173.field2516[0] == 0) {
            if (class173.field2516[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class173.field2516, 1);
            if (class173.field2516[1] > 1) {
                byte[] var6 = new byte[class173.field2516[1]];
                OpenGL.glGetInfoLogARB(var4, class173.field2516[1], class173.field2516, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class173.field2516[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class318(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)[Lts;", line = 68)
    public static final class496[] method2383(int arg0) {
        int var1 = 25 / ((-arg0 - 14) / 61);
        field5807++;
        return new class496[] { class206.field2886, class206.field2888, class206.field2889, class206.field2890, class206.field2891, class206.field2892, class206.field2893, class206.field2894, class206.field2895, class206.field2896, class206.field2897, class206.field2898, class206.field2899, class206.field2900 };
    }
}
