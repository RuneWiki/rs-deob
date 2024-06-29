import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class84 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lh;")
    private class327 field985;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[I")
    private static int[] field984 = new int[2];

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lh;[Ldr;)Lud;", line = 7)
    public static final class84 method520(class327 arg0, class257[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field3317 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4363;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field3317);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field984, 0);
        if (field984[0] == 0) {
            if (field984[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field984, 1);
            if (field984[1] > 1) {
                byte[] var6 = new byte[field984[1]];
                var3.glGetInfoLogARB(var4, field984[1], field984, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field984[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field3317);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class84(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lh;I[Ldr;)V", line = 70)
    private class84(class327 arg0, int arg1, class257[] arg2) {
        this.field985 = arg0;
        this.field983 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V", line = 77)
    protected final void finalize() throws Throwable {
        this.field985.method2097(this.field983);
        super.finalize();
    }
}
