import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 extends class585 {

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILqfa;Ljava/lang/String;)Lmv;")
    public static final class394 method237(int arg0, int arg1, class106 arg2, String arg3) {
        ++field383;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class726.field10041, 0);
        int var6 = -82 % ((22 - arg0) / 50);
        if (~class726.field10041[0] == -1) {
            if (~class726.field10041[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class726.field10041, 1);
            if (~class726.field10041[1] < -2) {
                byte[] var7 = new byte[class726.field10041[1]];
                OpenGL.glGetInfoLogARB(var4, class726.field10041[1], class726.field10041, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class726.field10041[0] == -1) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class394(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field382;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            field384 = -12;
        }
        if (super.field8255.field3677) {
            class595.method3470(var3, 0, class293.field4278, class633.field8892[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "()V")
    public class24() {
        super(0, true);
    }
}
