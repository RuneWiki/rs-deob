import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class253 {

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lic;")
    private class246 field3537;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public int field3536;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[I")
    private static int[] field3535 = new int[2];

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lic;[Lhr;)Lw;", line = 7)
    public static final class253 method1566(class246 arg0, class133[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field1616 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field3342;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field1616);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field3535, 0);
        if (field3535[0] == 0) {
            if (field3535[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3535, 1);
            if (field3535[1] > 1) {
                byte[] var6 = new byte[field3535[1]];
                var3.glGetInfoLogARB(var4, field3535[1], field3535, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field3535[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field1616);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class253(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        this.field3537.method1378(this.field3536);
        super.finalize();
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lic;I[Lhr;)V", line = 74)
    private class253(class246 arg0, int arg1, class133[] arg2) {
        this.field3537 = arg0;
        this.field3536 = arg1;
    }
}
