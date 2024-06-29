import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class183 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lpo;")
    private class332 field2516;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    private static int[] field2517 = new int[2];

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field2516.method2059(this.field2515);
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lpo;ILjava/lang/String;)Lb;", line = 11)
    public static final class183 method1190(class332 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4752;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field2517, 0);
        if (field2517[0] == 0) {
            if (field2517[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2517, 1);
            if (field2517[1] > 1) {
                byte[] var5 = new byte[field2517[1]];
                var3.glGetInfoLogARB(var4, field2517[1], field2517, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2517[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class183(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lpo;II)V", line = 48)
    private class183(class332 arg0, int arg1, int arg2) {
        this.field2516 = arg0;
        this.field2515 = arg1;
    }
}
