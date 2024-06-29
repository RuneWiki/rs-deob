import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class375 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lse;")
    private class282 field5511;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[I")
    private static int[] field5512 = new int[2];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lse;[Lne;)Lb;", line = 6)
    public static final class375 method2459(class282 arg0, class65[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field969 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4140;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field969);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field5512, 0);
        if (field5512[0] == 0) {
            if (field5512[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5512, 1);
            if (field5512[1] > 1) {
                byte[] var6 = new byte[field5512[1]];
                var3.glGetInfoLogARB(var4, field5512[1], field5512, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field5512[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field969);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class375(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() throws Throwable {
        this.field5511.method1864(this.field5510);
        super.finalize();
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lse;I[Lne;)V", line = 70)
    private class375(class282 arg0, int arg1, class65[] arg2) {
        this.field5511 = arg0;
        this.field5510 = arg1;
    }
}
