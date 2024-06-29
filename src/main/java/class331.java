import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class331 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lqi;")
    private class458 field4546;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    private static int[] field4547 = new int[2];

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        this.field4546.method2703(this.field4548);
        super.finalize();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lqi;ILjava/lang/String;)Lfg;", line = 17)
    public static final class331 method1973(class458 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field6330;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field4547, 0);
        if (field4547[0] == 0) {
            if (field4547[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field4547, 1);
            if (field4547[1] > 1) {
                byte[] var5 = new byte[field4547[1]];
                var3.glGetInfoLogARB(var4, field4547[1], field4547, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4547[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class331(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lqi;II)V", line = 48)
    private class331(class458 arg0, int arg1, int arg2) {
        this.field4546 = arg0;
        this.field4548 = arg1;
    }
}
