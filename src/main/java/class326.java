import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class326 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lnf;")
    private class256 field4768;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    private static int[] field4769 = new int[2];

    @OriginalMember(owner = "client!bf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4768.method1644(this.field4767);
        super.finalize();
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lnf;ILjava/lang/String;)Lbf;")
    public static final class326 method2181(class256 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3634;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field4769, 0);
        if (field4769[0] == 0) {
            if (field4769[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field4769, 1);
            if (field4769[1] > 1) {
                byte[] var5 = new byte[field4769[1]];
                var3.glGetInfoLogARB(var4, field4769[1], field4769, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4769[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class326(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lnf;II)V")
    private class326(class256 arg0, int arg1, int arg2) {
        this.field4768 = arg0;
        this.field4767 = arg1;
    }
}
