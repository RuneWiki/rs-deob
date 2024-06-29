import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class253 {

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "C")
    public char field2952;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!tea", name = "h", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "Ltha;")
    public static class310 field2957;

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "[I")
    public static int[] field2955;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Let;")
    public static final class621 method1504(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10173;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method1505(int arg0) {
        int var1 = 82 % ((arg0 - 44) / 58);
        field2955 = null;
        field2957 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILjava/lang/String;Lpc;)Lqba;")
    public static final class426 method1506(int arg0, int arg1, String arg2, class700 arg3) {
        field2959++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg2);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class333.field4111, 0);
        if (~class333.field4111[0] == arg0) {
            if (class333.field4111[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class333.field4111, 1);
            if (class333.field4111[1] > 1) {
                byte[] var6 = new byte[class333.field4111[1]];
                OpenGL.glGetInfoLogARB(var4, class333.field4111[1], class333.field4111, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class333.field4111[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class426(arg3, var4, arg1);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Les;BI)V")
    private final void method1507(class403 arg0, byte arg1, int arg2) {
        if (arg1 <= 10) {
            return;
        }
        field2954++;
        if (arg2 == 1) {
            this.field2952 = class625.method3550(arg0.method2392(122), (byte) 117);
        } else if (arg2 == 2) {
            this.field2953 = arg0.method2390((byte) -104);
            this.field2958 = arg0.method2396((byte) -91);
            this.field2951 = arg0.method2396((byte) 67);
            return;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILes;)V")
    public final void method1508(int arg0, class403 arg1) {
        field2956++;
        if (arg0 > -14) {
            return;
        }
        while (true) {
            int var3 = arg1.method2396((byte) -80);
            if (var3 == 0) {
                return;
            }
            this.method1507(arg1, (byte) 72, var3);
        }
    }

    static {
        new class425("", 76);
    }
}
