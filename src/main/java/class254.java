import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class254 {

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "Lhd;")
    private class17 field3430;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public int field3431;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[I")
    private static int[] field3429 = new int[2];

    @OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3430.method132(this.field3431);
        super.finalize();
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lhd;ILjava/lang/String;)Lln;")
    public static final class254 method1637(class17 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field198;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field3429, 0);
        if (field3429[0] == 0) {
            if (field3429[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3429, 1);
            if (field3429[1] > 1) {
                byte[] var5 = new byte[field3429[1]];
                var3.glGetInfoLogARB(var4, field3429[1], field3429, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3429[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class254(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lhd;II)V")
    private class254(class17 arg0, int arg1, int arg2) {
        this.field3430 = arg0;
        this.field3431 = arg1;
    }
}
