import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class452 extends class239 {

    @OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
    public static int field6354 = 0;

    @OriginalMember(owner = "client!uba", name = "F", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!uba", name = "G", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!uba", name = "H", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!uba", name = "J", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!uba", name = "I", descriptor = "Lwia;")
    public static class791 field6351;

    @OriginalMember(owner = "client!uba", name = "K", descriptor = "[B")
    private byte[] field6353;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V", line = 5)
    public static void method2702(int arg0) {
        field6351 = null;
        if (arg0 != 17942) {
            method2702(52);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(IIII)[B", line = 17)
    public final byte[] method2703(int arg0, int arg1, int arg2, int arg3) {
        field6348++;
        this.field6353 = new byte[arg0 * 2 * arg2 * arg3];
        if (arg1 < 13) {
            return null;
        } else {
            this.method158(arg0, 90, arg3, arg2);
            return this.field6353;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V", line = 33)
    public class452() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([BBLko;I)Lec;", line = 36)
    public static final class246 method2704(byte[] arg0, byte arg1, class529 arg2, int arg3) {
        field6352++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class520.field7345, 0);
        if (class520.field7345[0] == 0) {
            if (class520.field7345[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class520.field7345, 1);
            if (class520.field7345[1] > 1) {
                byte[] var6 = new byte[class520.field7345[1]];
                OpenGL.glGetInfoLogARB(var4, class520.field7345[1], class520.field7345, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class520.field7345[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        int var7 = 88 % (-arg1 / 53);
        return new class246(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIB)V", line = 79)
    public final void method1596(byte arg0, int arg1, byte arg2) {
        field6350++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6353[var10001] = -1;
        if (arg0 != 91) {
            this.method2703(-45, -100, -71, 108);
        }
        this.field6353[var6] = (byte) (var5 * 3 >> 5);
    }
}
