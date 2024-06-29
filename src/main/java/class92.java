import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class92 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    private int field1675;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1676 = 35632;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
    private static int[] field1677 = new int[2];

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()V", line = 4)
    public static void method623() {
        field1677 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/String;I)Lkm;", line = 9)
    public static final class92 method624(String arg0, int arg1) {
        GL var2 = class249.field3898;
        int var3 = var2.glCreateShaderObjectARB(arg1);
        var2.glShaderSourceARB(var3, 1, new String[] { arg0 }, new int[] { arg0.length() }, 0);
        var2.glCompileShaderARB(var3);
        var2.glGetObjectParameterivARB(var3, 35713, field1677, 0);
        if (field1677[0] == 0) {
            if (field1677[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field1677, 1);
            if (field1677[1] > 1) {
                byte[] var4 = new byte[field1677[1]];
                var2.glGetInfoLogARB(var3, field1677[1], field1677, 0, var4, 0);
                System.out.println(new String(var4));
            }
            if (field1677[0] == 0) {
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class92(var3, arg1);
    }

    @OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V", line = 40)
    protected final void finalize() throws Throwable {
        class258.method1727(this.field1674, this.field1675);
        super.finalize();
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(II)V", line = 55)
    private class92(int arg0, int arg1) {
        this.field1674 = arg0;
        this.field1675 = class258.field4013;
    }
}
