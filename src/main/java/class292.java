import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class292 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lks;")
    private class173 field4264;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    private static int[] field4265 = new int[2];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lks;[Lqg;)Lwg;")
    public static final class292 method1950(class173 arg0, class162[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field2155 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field2253;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field2155);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field4265, 0);
        if (field4265[0] == 0) {
            if (field4265[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field4265, 1);
            if (field4265[1] > 1) {
                byte[] var6 = new byte[field4265[1]];
                var3.glGetInfoLogARB(var4, field4265[1], field4265, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field4265[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field2155);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class292(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lks;I[Lqg;)V")
    private class292(class173 arg0, int arg1, class162[] arg2) {
        this.field4264 = arg0;
        this.field4263 = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4264.method1153(this.field4263);
        super.finalize();
    }
}
