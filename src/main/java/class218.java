import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class218 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "[Lbd;")
    private class28[] field3470;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    private int field3471;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[I")
    private static int[] field3469 = new int[2];

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "()V", line = 4)
    public static void method1607() {
        field3469 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([Lbd;)Lmi;", line = 9)
    public static final class218 method1608(class28[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field410 <= 0) {
                return null;
            }
        }
        GL var2 = class109.field1456;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field410);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field3469, 0);
        if (field3469[0] == 0) {
            if (field3469[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3469, 1);
            if (field3469[1] > 1) {
                byte[] var5 = new byte[field3469[1]];
                var2.glGetInfoLogARB(var3, field3469[1], field3469, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3469[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field410);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class218(var3, arg0);
    }

    @OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V", line = 69)
    protected final void finalize() throws Throwable {
        class103.method713(this.field3472, this.field3470, this.field3471);
        super.finalize();
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I[Lbd;)V", line = 78)
    private class218(int arg0, class28[] arg1) {
        this.field3472 = arg0;
        this.field3470 = arg1;
        this.field3471 = class103.field1369;
    }
}
