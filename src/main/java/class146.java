import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class146 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Lsq;")
    private class96 field2287;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public int field2288;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "[I")
    private static int[] field2289 = new int[2];

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lsq;[Liq;)Ljl;", line = 6)
    public static final class146 method1052(class96 arg0, class360[] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2] == null || arg1[var2].field5505 <= 0) {
                return null;
            }
        }
        opengl var3 = arg0.field1156;
        int var4 = var3.glCreateProgramObjectARB();
        for (int var5 = 0; var5 < arg1.length; var5++) {
            var3.glAttachObjectARB(var4, arg1[var5].field5505);
        }
        var3.glLinkProgramARB(var4);
        var3.glGetObjectParameterivARB(var4, 35714, field2289, 0);
        if (field2289[0] == 0) {
            if (field2289[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            var3.glGetObjectParameterivARB(var4, 35716, field2289, 1);
            if (field2289[1] > 1) {
                byte[] var6 = new byte[field2289[1]];
                var3.glGetInfoLogARB(var4, field2289[1], field2289, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (field2289[0] == 0) {
                for (int var7 = 0; var7 < arg1.length; var7++) {
                    var3.glDetachObjectARB(var4, arg1[var7].field5505);
                }
                var3.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class146(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V", line = 64)
    protected final void finalize() throws Throwable {
        this.field2287.method663(this.field2288);
        super.finalize();
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lsq;I[Liq;)V", line = 71)
    private class146(class96 arg0, int arg1, class360[] arg2) {
        this.field2287 = arg0;
        this.field2288 = arg1;
    }
}
