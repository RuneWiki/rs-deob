import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class271 {

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[Lmo;")
    private class360[] field4460;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    private int field4462;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "[I")
    private static int[] field4463 = new int[2];

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 4)
    public static void method1909() {
        field4463 = null;
    }

    @OriginalMember(owner = "client!fe", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        class173.method1194(this.field4461, this.field4460, this.field4462);
        super.finalize();
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I[Lmo;)V", line = 15)
    private class271(int arg0, class360[] arg1) {
        this.field4461 = arg0;
        this.field4460 = arg1;
        this.field4462 = class173.field2703;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Lmo;)Lfe;", line = 23)
    public static final class271 method1910(class360[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5691 <= 0) {
                return null;
            }
        }
        GL var2 = class245.field3884;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5691);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field4463, 0);
        if (field4463[0] == 0) {
            if (field4463[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4463, 1);
            if (field4463[1] > 1) {
                byte[] var5 = new byte[field4463[1]];
                var2.glGetInfoLogARB(var3, field4463[1], field4463, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4463[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5691);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class271(var3, arg0);
    }
}
