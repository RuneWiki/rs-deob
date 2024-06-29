import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class245 {

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[Lpa;")
    private class283[] field3913;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    private int field3912;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[I")
    private static int[] field3911 = new int[2];

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "()V", line = 6)
    public static void method1694() {
        field3911 = null;
    }

    @OriginalMember(owner = "client!jh", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        class198.method1409(this.field3910, this.field3913, this.field3912);
        super.finalize();
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([Lpa;)Ljh;", line = 16)
    public static final class245 method1695(class283[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field4375 <= 0) {
                return null;
            }
        }
        GL var2 = class94.field1473;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field4375);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field3911, 0);
        if (field3911[0] == 0) {
            if (field3911[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3911, 1);
            if (field3911[1] > 1) {
                byte[] var5 = new byte[field3911[1]];
                var2.glGetInfoLogARB(var3, field3911[1], field3911, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3911[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field4375);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class245(var3, arg0);
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I[Lpa;)V", line = 78)
    private class245(int arg0, class283[] arg1) {
        this.field3910 = arg0;
        this.field3913 = arg1;
        this.field3912 = class198.field2966;
    }
}
