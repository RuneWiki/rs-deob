import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class148 {

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[La;")
    private class290[] field2423;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
    private static int[] field2422 = new int[2];

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()V", line = 4)
    public static void method1124() {
        field2422 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([La;)Lla;", line = 9)
    public static final class148 method1125(class290[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field4561 <= 0) {
                return null;
            }
        }
        GL var2 = class162.field2654;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field4561);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field2422, 0);
        if (field2422[0] == 0) {
            if (field2422[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field2422, 1);
            if (field2422[1] > 1) {
                byte[] var5 = new byte[field2422[1]];
                var2.glGetInfoLogARB(var3, field2422[1], field2422, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field2422[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field4561);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class148(var3, arg0);
    }

    @OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V", line = 67)
    protected final void finalize() throws Throwable {
        class177.method1300(this.field2424, this.field2423, this.field2425);
        super.finalize();
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I[La;)V", line = 78)
    private class148(int arg0, class290[] arg1) {
        this.field2424 = arg0;
        this.field2423 = arg1;
        this.field2425 = class177.field2819;
    }
}
