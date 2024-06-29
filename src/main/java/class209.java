import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class209 {

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lcg;")
    private class393 field3130;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "[I")
    private static int[] field3129 = new int[2];

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lcg;[Lgt;)Lig;")
    public static final class209 method1230(class393 arg0, class59[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field773 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field5783;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field773);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field3129, 0);
        if (field3129[0] == 0) {
            if (field3129[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3129, 1);
            if (field3129[1] > 1) {
                byte[] var6 = new byte[field3129[1]];
                var3.glGetInfoLogARB(var4, field3129[1], field3129, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field3129[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field773);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class209(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field3130.method2492(this.field3131);
        super.finalize();
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lcg;I[Lgt;)V")
    private class209(class393 arg0, int arg1, class59[] arg2) {
        this.field3130 = arg0;
        this.field3131 = arg1;
    }
}
