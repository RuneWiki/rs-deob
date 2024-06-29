import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class366 {

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lge;")
    private class104 field5212;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
    private static int[] field5210 = new int[2];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lge;ILjava/lang/String;)Lhc;", line = 5)
    public static final class366 method2335(class104 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field1604;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field5210, 0);
        if (field5210[0] == 0) {
            if (field5210[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5210, 1);
            if (field5210[1] > 1) {
                byte[] var5 = new byte[field5210[1]];
                var3.glGetInfoLogARB(var4, field5210[1], field5210, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field5210[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class366(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        this.field5212.method882(this.field5211);
        super.finalize();
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lge;II)V", line = 48)
    private class366(class104 arg0, int arg1, int arg2) {
        this.field5212 = arg0;
        this.field5211 = arg1;
    }
}
