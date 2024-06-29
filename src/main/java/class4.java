import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class4 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lig;")
    private class132 field68;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public int field67;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[I")
    private static int[] field69 = new int[2];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lig;[Lbd;)Lie;")
    public static final class4 method14(class132 arg0, class38[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field524 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field1918;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field524);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field69, 0);
        if (field69[0] == 0) {
            if (field69[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field69, 1);
            if (field69[1] > 1) {
                byte[] var6 = new byte[field69[1]];
                var3.glGetInfoLogARB(var4, field69[1], field69, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field69[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field524);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class4(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field68.method881(this.field67);
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lig;I[Lbd;)V")
    private class4(class132 arg0, int arg1, class38[] arg2) {
        this.field68 = arg0;
        this.field67 = arg1;
    }
}
