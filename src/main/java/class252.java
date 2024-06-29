import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class252 {

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field3805;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[Lsm;")
    private class124[] field3806;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    private int field3808;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[I")
    private static int[] field3807 = new int[2];

    @OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        class80.method620(this.field3805, this.field3806, this.field3808);
        super.finalize();
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "([Lsm;)Lsi;", line = 12)
    public static final class252 method1724(class124[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field1887 <= 0) {
                return null;
            }
        }
        GL var2 = class73.field1051;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field1887);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field3807, 0);
        if (field3807[0] == 0) {
            if (field3807[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field3807, 1);
            if (field3807[1] > 1) {
                byte[] var5 = new byte[field3807[1]];
                var2.glGetInfoLogARB(var3, field3807[1], field3807, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field3807[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field1887);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class252(var3, arg0);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I[Lsm;)V", line = 72)
    private class252(int arg0, class124[] arg1) {
        this.field3805 = arg0;
        this.field3806 = arg1;
        this.field3808 = class80.field1183;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 81)
    public static void method1725() {
        field3807 = null;
    }
}
