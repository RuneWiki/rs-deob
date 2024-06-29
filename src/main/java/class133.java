import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class133 {

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "Lic;")
    private class246 field1617;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "[I")
    private static int[] field1618 = new int[2];

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lic;ILjava/lang/String;)Lhr;")
    public static final class133 method632(class246 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field3342;
        int var4 = var3.glCreateShaderObjectARB(arg1);
        var3.glShaderSourceARB(var4, 1, new String[] { arg2 }, new int[] { arg2.length() }, 0);
        var3.glCompileShaderARB(var4);
        var3.glGetObjectParameterivARB(var4, 35713, field1618, 0);
        if (field1618[0] == 0) {
            if (field1618[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1618, 1);
            if (field1618[1] > 1) {
                byte[] var5 = new byte[field1618[1]];
                var3.glGetInfoLogARB(var4, field1618[1], field1618, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field1618[0] == 0) {
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class133(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lic;II)V")
    private class133(class246 arg0, int arg1, int arg2) {
        this.field1617 = arg0;
        this.field1616 = arg1;
    }

    @OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1617.method1378(this.field1616);
        super.finalize();
    }
}
