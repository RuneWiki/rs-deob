import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class113 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "Lnf;")
    private class256 field1602;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[I")
    private static int[] field1600 = new int[2];

    @OriginalMember(owner = "client!ng", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field1602.method1644(this.field1601);
        super.finalize();
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lnf;[Lbf;)Lng;")
    public static final class113 method734(class256 arg0, class326[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field4767 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field3634;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field4767);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field1600, 0);
        if (field1600[0] == 0) {
            if (field1600[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field1600, 1);
            if (field1600[1] > 1) {
                byte[] var6 = new byte[field1600[1]];
                var3.glGetInfoLogARB(var4, field1600[1], field1600, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field1600[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field4767);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class113(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lnf;I[Lbf;)V")
    private class113(class256 arg0, int arg1, class326[] arg2) {
        this.field1602 = arg0;
        this.field1601 = arg1;
    }
}
