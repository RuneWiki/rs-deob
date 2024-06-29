import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class487 {

    @OriginalMember(owner = "client!cia", name = "d", descriptor = "[I")
    public static int[] field6569 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!cia", name = "e", descriptor = "[I")
    public static int[] field6570 = new int[1];

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!cia", name = "b", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!cia", name = "g", descriptor = "Lmn;")
    public static class511 field6572;

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "([BILsb;I)Ljr;", line = 6)
    public static final class133 method2851(byte[] arg0, int arg1, class93 arg2, int arg3) {
        field6566++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class591.field8531, arg1);
        if (class591.field8531[0] == 0) {
            if (class591.field8531[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class591.field8531, 1);
            if (class591.field8531[1] > 1) {
                byte[] var6 = new byte[class591.field8531[1]];
                OpenGL.glGetInfoLogARB(var4, class591.field8531[1], class591.field8531, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class591.field8531[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class133(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)I", line = 48)
    public static final int method2852(int arg0, int arg1) {
        if (arg1 != 4) {
            method2855(null, -93);
        }
        field6568++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 59)
    public static final void method2853(int arg0, long[] arg1, Object[] arg2) {
        int var3 = 116 / ((arg0 - 55) / 47);
        field6567++;
        class293.method1719(0, arg2, true, arg1.length - 1, arg1);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V", line = 69)
    public static void method2854(byte arg0) {
        field6570 = null;
        field6572 = null;
        field6569 = null;
        if (arg0 != 47) {
            method2852(105, 52);
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 89)
    public static final void method2855(String arg0, int arg1) {
        System.out.println("Error: " + class711.method3992("%0a", arg0, "\n", (byte) 102));
        if (arg1 != -1) {
            field6572 = null;
        }
        field6571++;
    }
}
