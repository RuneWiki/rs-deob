import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class246 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lhj;")
    private class338 field3413;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    private static int[] field3412 = new int[2];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lhj;[Ldk;)Lq;", line = 6)
    public static final class246 method1538(class338 arg0, class297[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field4124 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4607;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field4124);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field3412, 0);
        if (field3412[0] == 0) {
            if (field3412[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field3412, 1);
            if (field3412[1] > 1) {
                byte[] var6 = new byte[field3412[1]];
                var3.glGetInfoLogARB(var4, field3412[1], field3412, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field3412[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field4124);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class246(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() throws Throwable {
        this.field3413.method2108(this.field3414);
        super.finalize();
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lhj;I[Ldk;)V", line = 74)
    private class246(class338 arg0, int arg1, class297[] arg2) {
        this.field3413 = arg0;
        this.field3414 = arg1;
    }
}
