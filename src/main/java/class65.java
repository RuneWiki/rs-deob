import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class65 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lse;")
    private class282 field971;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field969;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    private static int[] field970 = new int[2];

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        this.field971.method1864(this.field969);
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lse;ILjava/lang/String;)Lne;", line = 14)
    public static final class65 method564(class282 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4140;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field970, 0);
        if (field970[0] == 0) {
            if (field970[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field970, 1);
            if (field970[1] > 1) {
                byte[] var5 = new byte[field970[1]];
                var3.glGetInfoLogARB(var4, field970[1], field970, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field970[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class65(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lse;II)V", line = 45)
    private class65(class282 arg0, int arg1, int arg2) {
        this.field971 = arg0;
        this.field969 = arg1;
    }
}
