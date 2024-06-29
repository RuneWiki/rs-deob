import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class411 {

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Lnm;")
    private class254 field5942;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public int field5940;

    @OriginalMember(owner = "client!du", name = "b", descriptor = "[I")
    private static int[] field5941 = new int[2];

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lnm;[Lnr;)Ldu;")
    public static final class411 method2450(class254 arg0, class102[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field1431 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field3648;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field1431);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field5941, 0);
        if (field5941[0] == 0) {
            if (field5941[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field5941, 1);
            if (field5941[1] > 1) {
                byte[] var6 = new byte[field5941[1]];
                var3.glGetInfoLogARB(var4, field5941[1], field5941, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field5941[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field1431);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class411(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!du", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5942.method1675(this.field5940);
        super.finalize();
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Lnm;I[Lnr;)V")
    private class411(class254 arg0, int arg1, class102[] arg2) {
        this.field5942 = arg0;
        this.field5940 = arg1;
    }
}
