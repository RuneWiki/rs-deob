import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class21 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[Lec;")
    private class349[] field232;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    private static int[] field234 = new int[2];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lec;)Lpf;", line = 9)
    public static final class21 method132(class349[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field5457 <= 0) {
                return null;
            }
        }
        GL var2 = class47.field592;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field5457);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field234, 0);
        if (field234[0] == 0) {
            if (field234[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field234, 1);
            if (field234[1] > 1) {
                byte[] var5 = new byte[field234[1]];
                var2.glGetInfoLogARB(var3, field234[1], field234, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field234[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field5457);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class21(var3, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[Lec;)V", line = 67)
    private class21(int arg0, class349[] arg1) {
        this.field235 = arg0;
        this.field232 = arg1;
        this.field233 = class298.field4320;
    }

    @OriginalMember(owner = "client!pf", name = "finalize", descriptor = "()V", line = 74)
    protected final void finalize() throws Throwable {
        class298.method2032(this.field235, this.field232, this.field233);
        super.finalize();
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V", line = 78)
    public static void method133() {
        field234 = null;
    }
}
