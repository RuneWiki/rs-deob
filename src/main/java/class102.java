import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class102 {

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Lnm;")
    private class254 field1432;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public int field1431;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "[I")
    private static int[] field1433 = new int[2];

    @OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field1432.method1675(this.field1431);
        super.finalize();
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lnm;II)V", line = 10)
    private class102(class254 arg0, int arg1, int arg2) {
        this.field1432 = arg0;
        this.field1431 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lnm;ILjava/lang/String;)Lnr;", line = 18)
    public static final class102 method774(class254 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3648;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field1433, 0);
        if (field1433[0] == 0) {
            if (field1433[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1433, 1);
            if (field1433[1] > 1) {
                byte[] var5 = new byte[field1433[1]];
                var3.glGetInfoLogARB(var4, field1433[1], field1433, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field1433[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class102(arg0, var4, arg1);
    }
}
