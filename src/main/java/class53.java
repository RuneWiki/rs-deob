import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lge;")
    private class104 field862;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[I")
    private static int[] field860 = new int[2];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lge;[Lhc;)Lie;")
    public static final class53 method420(class104 arg0, class366[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field5211 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field1604;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field5211);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field860, 0);
        if (field860[0] == 0) {
            if (field860[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field860, 1);
            if (field860[1] > 1) {
                byte[] var6 = new byte[field860[1]];
                var3.glGetInfoLogARB(var4, field860[1], field860, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field860[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field5211);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class53(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lge;I[Lhc;)V")
    private class53(class104 arg0, int arg1, class366[] arg2) {
        this.field862 = arg0;
        this.field861 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field862.method882(this.field861);
        super.finalize();
    }
}
