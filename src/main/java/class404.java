import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class404 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lql;")
    private class346 field5882;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field5881;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[I")
    private static int[] field5883 = new int[2];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lql;[Loj;)Lta;", line = 5)
    public static final class404 method2532(class346 arg0, class257[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field3506 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4697;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field3506);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field5883, 0);
        if (field5883[0] == 0) {
            if (field5883[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5883, 1);
            if (field5883[1] > 1) {
                byte[] var6 = new byte[field5883[1]];
                var3.glGetInfoLogARB(var4, field5883[1], field5883, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field5883[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field3506);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class404(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lql;I[Loj;)V", line = 70)
    private class404(class346 arg0, int arg1, class257[] arg2) {
        this.field5882 = arg0;
        this.field5881 = arg1;
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 77)
    protected final void finalize() throws Throwable {
        this.field5882.method2096(this.field5881);
        super.finalize();
    }
}
