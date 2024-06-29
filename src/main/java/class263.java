import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class263 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[Lka;")
    private class9[] field4059;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[I")
    private static int[] field4060 = new int[2];

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([Lka;)Lol;", line = 8)
    public static final class263 method1745(class9[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field90 <= 0) {
                return null;
            }
        }
        GL var2 = class333.field5160;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field90);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field4060, 0);
        if (field4060[0] == 0) {
            if (field4060[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4060, 1);
            if (field4060[1] > 1) {
                byte[] var5 = new byte[field4060[1]];
                var2.glGetInfoLogARB(var3, field4060[1], field4060, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4060[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field90);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class263(var3, arg0);
    }

    @OriginalMember(owner = "client!ol", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        class301.method1982(this.field4061, this.field4059, this.field4062);
        super.finalize();
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 75)
    public static void method1746() {
        field4060 = null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I[Lka;)V", line = 78)
    private class263(int arg0, class9[] arg1) {
        this.field4061 = arg0;
        this.field4059 = arg1;
        this.field4062 = class301.field4649;
    }
}
