import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class280 {

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[Lac;")
    private class337[] field4250;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[I")
    private static int[] field4251 = new int[2];

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        class305.method2149(this.field4253, this.field4250, this.field4252);
        super.finalize();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 10)
    public static void method2041() {
        field4251 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Lac;)V", line = 18)
    private class280(int arg0, class337[] arg1) {
        this.field4253 = arg0;
        this.field4250 = arg1;
        this.field4252 = class305.field4573;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lac;)Ljd;", line = 26)
    public static final class280 method2042(class337[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5241 <= 0) {
                return null;
            }
        }
        GL var2 = class141.field2025;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5241);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field4251, 0);
        if (field4251[0] == 0) {
            if (field4251[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4251, 1);
            if (field4251[1] > 1) {
                byte[] var5 = new byte[field4251[1]];
                var2.glGetInfoLogARB(var3, field4251[1], field4251, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4251[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5241);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class280(var3, arg0);
    }
}
