import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class189 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lmi;")
    private class315 field2812;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    private static int[] field2813 = new int[2];

    @OriginalMember(owner = "client!cd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2812.method2005(this.field2811);
        super.finalize();
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lmi;I[Lwi;)V")
    private class189(class315 arg0, int arg1, class299[] arg2) {
        this.field2812 = arg0;
        this.field2811 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmi;[Lwi;)Lcd;")
    public static final class189 method1170(class315 arg0, class299[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field4293 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4445;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field4293);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field2813, 0);
        if (field2813[0] == 0) {
            if (field2813[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2813, 1);
            if (field2813[1] > 1) {
                byte[] var6 = new byte[field2813[1]];
                var3.glGetInfoLogARB(var4, field2813[1], field2813, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field2813[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field4293);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class189(arg0, var4, arg1);
    }
}
