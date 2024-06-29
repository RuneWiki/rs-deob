import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class141 {

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lih;")
    private class330 field1867;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "[I")
    private static int[] field1866 = new int[2];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lih;[Lha;)Lcf;", line = 6)
    public static final class141 method946(class330 arg0, class48[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field682 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4741;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field682);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field1866, 0);
        if (field1866[0] == 0) {
            if (field1866[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1866, 1);
            if (field1866[1] > 1) {
                byte[] var6 = new byte[field1866[1]];
                var3.glGetInfoLogARB(var4, field1866[1], field1866, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field1866[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field682);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class141(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() throws Throwable {
        this.field1867.method2135(this.field1868);
        super.finalize();
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lih;I[Lha;)V", line = 74)
    private class141(class330 arg0, int arg1, class48[] arg2) {
        this.field1867 = arg0;
        this.field1868 = arg1;
    }
}
