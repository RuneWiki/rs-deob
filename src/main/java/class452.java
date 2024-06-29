import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class452 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lbf;")
    private class344 field6141;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field6142;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "[I")
    private static int[] field6140 = new int[2];

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6141.method2045(this.field6142);
        super.finalize();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lbf;I[Lcg;)V")
    private class452(class344 arg0, int arg1, class81[] arg2) {
        this.field6141 = arg0;
        this.field6142 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbf;[Lcg;)Loa;")
    public static final class452 method2655(class344 arg0, class81[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field1082 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field4604;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field1082);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field6140, 0);
        if (field6140[0] == 0) {
            if (field6140[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field6140, 1);
            if (field6140[1] > 1) {
                byte[] var6 = new byte[field6140[1]];
                var3.glGetInfoLogARB(var4, field6140[1], field6140, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field6140[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field1082);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class452(arg0, var4, arg1);
    }
}
