import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class257 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Lh;")
    private class327 field3316;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "[I")
    private static int[] field3318 = new int[2];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lh;ILjava/lang/String;)Ldr;")
    public static final class257 method1631(class327 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4363;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field3318, 0);
        if (field3318[0] == 0) {
            if (field3318[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3318, 1);
            if (field3318[1] > 1) {
                byte[] var5 = new byte[field3318[1]];
                var3.glGetInfoLogARB(var4, field3318[1], field3318, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3318[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class257(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lh;II)V")
    private class257(class327 arg0, int arg1, int arg2) {
        this.field3316 = arg0;
        this.field3317 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3316.method2097(this.field3317);
        super.finalize();
    }
}
