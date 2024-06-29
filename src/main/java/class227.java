import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class227 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[Lfc;")
    private class261[] field3248;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "[I")
    private static int[] field3250 = new int[2];

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([Lfc;)Lqb;", line = 6)
    public static final class227 method1591(class261[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field3837 <= 0) {
                return null;
            }
        }
        GL var2 = class67.field899;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field3837);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field3250, 0);
        if (field3250[0] == 0) {
            if (field3250[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3250, 1);
            if (field3250[1] > 1) {
                byte[] var5 = new byte[field3250[1]];
                var2.glGetInfoLogARB(var3, field3250[1], field3250, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3250[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field3837);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class227(var3, arg0);
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() throws Throwable {
        class180.method1246(this.field3249, this.field3248, this.field3247);
        super.finalize();
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()V", line = 72)
    public static void method1592() {
        field3250 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I[Lfc;)V", line = 75)
    private class227(int arg0, class261[] arg1) {
        this.field3249 = arg0;
        this.field3248 = arg1;
        this.field3247 = class180.field2413;
    }
}
