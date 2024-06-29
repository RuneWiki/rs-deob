import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class152 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[Lvg;")
    private class8[] field2474;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    private int field2473;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
    private static int[] field2476 = new int[2];

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        class28.method322(this.field2475, this.field2474, this.field2473);
        super.finalize();
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I[Lvg;)V", line = 11)
    private class152(int arg0, class8[] arg1) {
        this.field2475 = arg0;
        this.field2474 = arg1;
        this.field2473 = class28.field455;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([Lvg;)Lfg;", line = 19)
    public static final class152 method1257(class8[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field119 <= 0) {
                return null;
            }
        }
        GL var2 = class240.field3771;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field119);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field2476, 0);
        if (field2476[0] == 0) {
            if (field2476[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2476, 1);
            if (field2476[1] > 1) {
                byte[] var5 = new byte[field2476[1]];
                var2.glGetInfoLogARB(var3, field2476[1], field2476, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2476[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field119);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class152(var3, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 77)
    public static void method1258() {
        field2476 = null;
    }
}
