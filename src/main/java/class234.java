import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class234 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lfu;")
    private class42 field3408;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "[I")
    private static int[] field3409 = new int[2];

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lfu;[Lfs;)Lin;", line = 6)
    public static final class234 method1639(class42 arg0, class376[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field5188 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field557;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field5188);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field3409, 0);
        if (field3409[0] == 0) {
            if (field3409[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3409, 1);
            if (field3409[1] > 1) {
                byte[] var6 = new byte[field3409[1]];
                var3.glGetInfoLogARB(var4, field3409[1], field3409, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field3409[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field5188);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class234(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        this.field3408.method361(this.field3407);
        super.finalize();
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lfu;I[Lfs;)V", line = 74)
    private class234(class42 arg0, int arg1, class376[] arg2) {
        this.field3408 = arg0;
        this.field3407 = arg1;
    }
}
