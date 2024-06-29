import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class36 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[Lkm;")
    private class92[] field710;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    private int field708;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    private static int[] field709 = new int[2];

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([Lkm;)Lfj;", line = 9)
    public static final class36 method286(class92[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field1674 <= 0) {
                return null;
            }
        }
        GL var2 = class249.field3898;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field1674);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field709, 0);
        if (field709[0] == 0) {
            if (field709[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field709, 1);
            if (field709[1] > 1) {
                byte[] var5 = new byte[field709[1]];
                var2.glGetInfoLogARB(var3, field709[1], field709, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field709[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field1674);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class36(var3, arg0);
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[Lkm;)V", line = 68)
    private class36(int arg0, class92[] arg1) {
        this.field711 = arg0;
        this.field710 = arg1;
        this.field708 = class258.field4013;
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V", line = 74)
    protected final void finalize() throws Throwable {
        class258.method1734(this.field711, this.field710, this.field708);
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V", line = 78)
    public static void method287() {
        field709 = null;
    }
}
