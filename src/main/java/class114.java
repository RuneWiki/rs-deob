import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class114 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[Ldn;")
    private class132[] field1736;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "[I")
    private static int[] field1737 = new int[2];

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "()V", line = 6)
    public static void method789() {
        field1737 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "([Ldn;)Lsl;", line = 11)
    public static final class114 method790(class132[] arg0) {
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] == null || arg0[var1].field2078 <= 0) {
                return null;
            }
        }
        GL var2 = class232.field3716;
        int var3 = var2.glCreateProgramObjectARB();
        for (int var4 = 0; var4 < arg0.length; var4++) {
            var2.glAttachObjectARB(var3, arg0[var4].field2078);
        }
        var2.glLinkProgramARB(var3);
        var2.glGetObjectParameterivARB(var3, 35714, field1737, 0);
        if (field1737[0] == 0) {
            if (field1737[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var2.glGetObjectParameterivARB(var3, 35716, field1737, 1);
            if (field1737[1] > 1) {
                byte[] var5 = new byte[field1737[1]];
                var2.glGetInfoLogARB(var3, field1737[1], field1737, 0, var5, 0);
                System.out.println(new String(var5));
            }
            if (field1737[0] == 0) {
                for (int var6 = 0; var6 < arg0.length; var6++) {
                    var2.glDetachObjectARB(var3, arg0[var6].field2078);
                }
                var2.glDeleteObjectARB(var3);
                return null;
            }
        }
        return new class114(var3, arg0);
    }

    @OriginalMember(owner = "client!sl", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() throws Throwable {
        class230.method1629(this.field1735, this.field1736, this.field1738);
        super.finalize();
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(I[Ldn;)V", line = 75)
    private class114(int arg0, class132[] arg1) {
        this.field1735 = arg0;
        this.field1736 = arg1;
        this.field1738 = class230.field3658;
    }
}
