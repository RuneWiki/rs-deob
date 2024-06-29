import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class395 {

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lpo;")
    private class332 field5774;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public int field5772;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    private static int[] field5773 = new int[2];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lpo;[Lb;)Lfj;", line = 8)
    public static final class395 method2518(class332 arg0, class183[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field2515 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4752;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field2515);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field5773, 0);
        if (field5773[0] == 0) {
            if (field5773[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5773, 1);
            if (field5773[1] > 1) {
                byte[] var6 = new byte[field5773[1]];
                var3.glGetInfoLogARB(var4, field5773[1], field5773, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field5773[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field2515);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class395(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        this.field5774.method2059(this.field5772);
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lpo;I[Lb;)V", line = 74)
    private class395(class332 arg0, int arg1, class183[] arg2) {
        this.field5774 = arg0;
        this.field5772 = arg1;
    }
}
