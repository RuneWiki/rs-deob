import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class81 {

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lbf;")
    private class344 field1081;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    private static int[] field1083 = new int[2];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lbf;ILjava/lang/String;)Lcg;")
    public static final class81 method527(class344 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field4604;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field1083, 0);
        if (field1083[0] == 0) {
            if (field1083[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1083, 1);
            if (field1083[1] > 1) {
                byte[] var5 = new byte[field1083[1]];
                var3.glGetInfoLogARB(var4, field1083[1], field1083, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field1083[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class81(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!cg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1081.method2045(this.field1082);
        super.finalize();
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lbf;II)V")
    private class81(class344 arg0, int arg1, int arg2) {
        this.field1081 = arg0;
        this.field1082 = arg1;
    }
}
