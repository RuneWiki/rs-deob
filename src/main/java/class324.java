import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class324 {

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public int field5241;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "[Led;")
    private class327[] field5243;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    private int field5242;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "[I")
    private static int[] field5240 = new int[2];

    @OriginalMember(owner = "client!hi", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        class239.method1669(this.field5241, this.field5243, this.field5242);
        super.finalize();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([Led;)Lhi;", line = 13)
    public static final class324 method2325(class327[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5258 <= 0) {
                return null;
            }
        }
        GL var2 = class241.field4012;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5258);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field5240, 0);
        if (field5240[0] == 0) {
            if (field5240[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field5240, 1);
            if (field5240[1] > 1) {
                byte[] var5 = new byte[field5240[1]];
                var2.glGetInfoLogARB(var3, field5240[1], field5240, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field5240[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5258);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class324(var3, arg0);
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(I[Led;)V", line = 71)
    private class324(int arg0, class327[] arg1) {
        this.field5241 = arg0;
        this.field5243 = arg1;
        this.field5242 = class239.field3974;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 77)
    public static void method2326() {
        field5240 = null;
    }
}
