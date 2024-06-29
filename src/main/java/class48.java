import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class48 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Lih;")
    private class330 field683;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "[I")
    private static int[] field684 = new int[2];

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field683.method2135(this.field682);
        super.finalize();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lih;ILjava/lang/String;)Lha;")
    public static final class48 method337(class330 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4741;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field684, 0);
        if (field684[0] == 0) {
            if (field684[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field684, 1);
            if (field684[1] > 1) {
                byte[] var5 = new byte[field684[1]];
                var3.glGetInfoLogARB(var4, field684[1], field684, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field684[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class48(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lih;II)V")
    private class48(class330 arg0, int arg1, int arg2) {
        this.field683 = arg0;
        this.field682 = arg1;
    }
}
