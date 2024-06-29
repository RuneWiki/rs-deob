import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class59 {

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "Lcg;")
    private class393 field772;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public int field773;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "[I")
    private static int[] field771 = new int[2];

    @OriginalMember(owner = "client!gt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field772.method2492(this.field773);
        super.finalize();
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lcg;II)V")
    private class59(class393 arg0, int arg1, int arg2) {
        this.field772 = arg0;
        this.field773 = arg1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lcg;ILjava/lang/String;)Lgt;")
    public static final class59 method327(class393 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field5783;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field771, 0);
        if (field771[0] == 0) {
            if (field771[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field771, 1);
            if (field771[1] > 1) {
                byte[] var5 = new byte[field771[1]];
                var3.glGetInfoLogARB(var4, field771[1], field771, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field771[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class59(arg0, var4, arg1);
    }
}
