import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class262 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[Ldl;")
    private class43[] field4164;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    private static int[] field4166 = new int[2];

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 5)
    public static void method1873() {
        field4166 = null;
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V", line = 8)
    protected final void finalize() throws Throwable {
        class275.method1965(this.field4163, this.field4164, this.field4165);
        super.finalize();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([Ldl;)Lce;", line = 14)
    public static final class262 method1874(class43[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field591 <= 0) {
                return null;
            }
        }
        GL var2 = class186.field2990;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field591);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field4166, 0);
        if (field4166[0] == 0) {
            if (field4166[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field4166, 1);
            if (field4166[1] > 1) {
                byte[] var5 = new byte[field4166[1]];
                var2.glGetInfoLogARB(var3, field4166[1], field4166, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field4166[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field591);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class262(var3, arg0);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(I[Ldl;)V", line = 73)
    private class262(int arg0, class43[] arg1) {
        this.field4163 = arg0;
        this.field4164 = arg1;
        this.field4165 = class275.field4359;
    }
}
