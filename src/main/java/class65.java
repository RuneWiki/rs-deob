import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class65 {

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lqi;")
    private class458 field979;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "[I")
    private static int[] field978 = new int[2];

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lqi;[Lfg;)Lnn;")
    public static final class65 method465(class458 arg0, class331[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field4548 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field6330;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field4548);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field978, 0);
        if (field978[0] == 0) {
            if (field978[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field978, 1);
            if (field978[1] > 1) {
                byte[] var6 = new byte[field978[1]];
                var3.glGetInfoLogARB(var4, field978[1], field978, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field978[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field4548);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class65(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field979.method2703(this.field977);
        super.finalize();
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lqi;I[Lfg;)V")
    private class65(class458 arg0, int arg1, class331[] arg2) {
        this.field979 = arg0;
        this.field977 = arg1;
    }
}
