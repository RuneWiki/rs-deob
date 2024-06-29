import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class213 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Lao;")
    private class157 field3023;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "[I")
    private static int[] field3021 = new int[2];

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lao;ILjava/lang/String;)Les;", line = 5)
    public static final class213 method1436(class157 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1927;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field3021, 0);
        if (field3021[0] == 0) {
            if (field3021[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3021, 1);
            if (field3021[1] > 1) {
                byte[] var5 = new byte[field3021[1]];
                var3.glGetInfoLogARB(var4, field3021[1], field3021, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3021[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class213(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!es", name = "finalize", descriptor = "()V", line = 43)
    protected final void finalize() throws Throwable {
        this.field3023.method971(this.field3022);
        super.finalize();
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lao;II)V", line = 48)
    private class213(class157 arg0, int arg1, int arg2) {
        this.field3023 = arg0;
        this.field3022 = arg1;
    }
}
