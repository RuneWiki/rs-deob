import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class82 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "[Lul;")
    private class228[] field1400;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    private static int[] field1402 = new int[2];

    @OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        class199.method1533(this.field1401, this.field1400, this.field1399);
        super.finalize();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([Lul;)Lwd;", line = 12)
    public static final class82 method667(class228[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field3801 <= 0) {
                return null;
            }
        }
        GL var2 = class42.field627;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field3801);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field1402, 0);
        if (field1402[0] == 0) {
            if (field1402[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field1402, 1);
            if (field1402[1] > 1) {
                byte[] var5 = new byte[field1402[1]];
                var2.glGetInfoLogARB(var3, field1402[1], field1402, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field1402[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field3801);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class82(var3, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "()V", line = 73)
    public static void method668() {
        field1402 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[Lul;)V", line = 78)
    private class82(int arg0, class228[] arg1) {
        this.field1401 = arg0;
        this.field1400 = arg1;
        this.field1399 = class199.field3172;
    }
}
