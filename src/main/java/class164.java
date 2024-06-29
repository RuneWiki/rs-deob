import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class164 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "[Lef;")
    private class350[] field2888;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[I")
    private static int[] field2886 = new int[2];

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([Lef;)Ljj;", line = 6)
    public static final class164 method1299(class350[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5553 <= 0) {
                return null;
            }
        }
        GL var2 = class43.field651;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5553);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field2886, 0);
        if (field2886[0] == 0) {
            if (field2886[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2886, 1);
            if (field2886[1] > 1) {
                byte[] var5 = new byte[field2886[1]];
                var2.glGetInfoLogARB(var3, field2886[1], field2886, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2886[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5553);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class164(var3, arg0);
    }

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V", line = 65)
    protected final void finalize() throws Throwable {
        class151.method1194(this.field2885, this.field2888, this.field2887);
        super.finalize();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 75)
    public static void method1300() {
        field2886 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I[Lef;)V", line = 78)
    private class164(int arg0, class350[] arg1) {
        this.field2885 = arg0;
        this.field2888 = arg1;
        this.field2887 = class151.field2669;
    }
}
