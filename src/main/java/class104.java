import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class104 {

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "Lhd;")
    private class17 field1528;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[I")
    private static int[] field1526 = new int[2];

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lhd;[Lln;)Lge;")
    public static final class104 method882(class17 arg0, class254[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field3431 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field198;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field3431);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field1526, 0);
        if (field1526[0] == 0) {
            if (field1526[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1526, 1);
            if (field1526[1] > 1) {
                byte[] var6 = new byte[field1526[1]];
                var3.glGetInfoLogARB(var4, field1526[1], field1526, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field1526[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field3431);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class104(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1528.method132(this.field1527);
        super.finalize();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lhd;I[Lln;)V")
    private class104(class17 arg0, int arg1, class254[] arg2) {
        this.field1528 = arg0;
        this.field1527 = arg1;
    }
}
