import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class506 implements class547 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field6693;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field6697 = -1;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "[I")
    public static int[] field6698 = new int[13];

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field6695;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lwea;")
    public final class259 method235(int arg0) {
        if (arg0 < 38) {
            return null;
        } else {
            field6694++;
            return class78.field1069;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(I)V")
    public class506(int arg0) {
        this.field6693 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLqj;ILjava/lang/String;)Laf;")
    public static final class165 method2719(byte arg0, class548 arg1, int arg2, String arg3) {
        field6695++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg2);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        if (arg0 <= 84) {
            method2720(true);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class569.field7968, 0);
        if (class569.field7968[0] == 0) {
            if (class569.field7968[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class569.field7968, 1);
            if (class569.field7968[1] > 1) {
                byte[] var6 = new byte[class569.field7968[1]];
                OpenGL.glGetInfoLogARB(var4, class569.field7968[1], class569.field7968, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class569.field7968[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class165(arg1, var4, arg2);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static void method2720(boolean arg0) {
        field6698 = null;
        if (arg0) {
            method2720(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZII)I")
    public static final int method2721(int arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            field6698 = null;
        }
        field6696++;
        int var4 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg2 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        int var5 = 255 - arg0;
        return (((arg3 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg3 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }
}
