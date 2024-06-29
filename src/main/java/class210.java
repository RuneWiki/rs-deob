import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class210 {

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[Lae;")
    private class294[] field2974;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[I")
    private static int[] field2977 = new int[2];

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 4)
    public static void method1443() {
        field2977 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([Lae;)Lta;", line = 9)
    public static final class210 method1444(class294[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field4600 <= 0) {
                return null;
            }
        }
        GL var2 = class250.field3818;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field4600);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field2977, 0);
        if (field2977[0] == 0) {
            if (field2977[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2977, 1);
            if (field2977[1] > 1) {
                byte[] var5 = new byte[field2977[1]];
                var2.glGetInfoLogARB(var3, field2977[1], field2977, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2977[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field4600);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class210(var3, arg0);
    }

    @OriginalMember(owner = "client!ta", name = "finalize", descriptor = "()V", line = 68)
    protected final void finalize() throws Throwable {
        class266.method1930(this.field2975, this.field2974, this.field2976);
        super.finalize();
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(I[Lae;)V", line = 74)
    private class210(int arg0, class294[] arg1) {
        this.field2975 = arg0;
        this.field2974 = arg1;
        this.field2976 = class266.field4192;
    }
}
