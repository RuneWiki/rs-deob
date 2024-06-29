import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class159 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[Lha;")
    private class335[] field2457;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
    private static int[] field2458 = new int[2];

    @OriginalMember(owner = "client!jd", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        class1.method3(this.field2456, this.field2457, this.field2459);
        super.finalize();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()V", line = 10)
    public static void method1156() {
        field2458 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lha;)Ljd;", line = 18)
    public static final class159 method1157(class335[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5340 <= 0) {
                return null;
            }
        }
        GL var2 = class272.field4310;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5340);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field2458, 0);
        if (field2458[0] == 0) {
            if (field2458[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2458, 1);
            if (field2458[1] > 1) {
                byte[] var5 = new byte[field2458[1]];
                var2.glGetInfoLogARB(var3, field2458[1], field2458, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2458[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5340);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class159(var3, arg0);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I[Lha;)V", line = 75)
    private class159(int arg0, class335[] arg1) {
        this.field2456 = arg0;
        this.field2457 = arg1;
        this.field2459 = class1.field3;
    }
}
