import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class74 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lao;")
    private class157 field881;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[I")
    private static int[] field882 = new int[2];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lao;[Les;)Lhc;", line = 9)
    public static final class74 method415(class157 arg0, class213[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field3022 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field1927;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field3022);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field882, 0);
        if (field882[0] == 0) {
            if (field882[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field882, 1);
            if (field882[1] > 1) {
                byte[] var6 = new byte[field882[1]];
                var3.glGetInfoLogARB(var4, field882[1], field882, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field882[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field3022);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class74(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() throws Throwable {
        this.field881.method971(this.field880);
        super.finalize();
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lao;I[Les;)V", line = 74)
    private class74(class157 arg0, int arg1, class213[] arg2) {
        this.field881 = arg0;
        this.field880 = arg1;
    }
}
