import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class12 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lmm;")
    private class357 field109;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public int field111;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    private static int[] field110 = new int[2];

    @OriginalMember(owner = "client!rj", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field109.method2208(this.field111);
        super.finalize();
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lmm;[Lqn;)Lrj;", line = 17)
    public static final class12 method61(class357 arg0, class198[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field2862 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4794;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field2862);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field110, 0);
        if (field110[0] == 0) {
            if (field110[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field110, 1);
            if (field110[1] > 1) {
                byte[] var6 = new byte[field110[1]];
                var3.glGetInfoLogARB(var4, field110[1], field110, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field110[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field2862);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class12(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lmm;I[Lqn;)V", line = 74)
    private class12(class357 arg0, int arg1, class198[] arg2) {
        this.field109 = arg0;
        this.field111 = arg1;
    }
}
