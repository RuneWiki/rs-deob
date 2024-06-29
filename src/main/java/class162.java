import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class162 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Ltb;")
    private class227 field2252;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field2251;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    private static int[] field2250 = new int[2];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ltb;[Li;)Ltf;")
    public static final class162 method1074(class227 arg0, class27[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field468 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field3184;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field468);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field2250, 0);
        if (field2250[0] == 0) {
            if (field2250[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2250, 1);
            if (field2250[1] > 1) {
                byte[] var6 = new byte[field2250[1]];
                var3.glGetInfoLogARB(var4, field2250[1], field2250, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field2250[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field468);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class162(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!tf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2252.method1576(this.field2251);
        super.finalize();
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ltb;I[Li;)V")
    private class162(class227 arg0, int arg1, class27[] arg2) {
        this.field2252 = arg0;
        this.field2251 = arg1;
    }
}
