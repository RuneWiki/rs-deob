import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class296 {

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "Lqi;")
    private class458 field4090;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "[I")
    private static int[] field4091 = new int[1];

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lqi;ILjava/lang/String;)Lut;")
    public static final class296 method1829(class458 arg0, int arg1, String arg2) {
        opengl var3 = arg0.field6330;
        var3.glGenProgramsARB(1, field4091, 0);
        int var4 = field4091[0];
        var3.glBindProgramARB(arg1, var4);
        var3.glProgramStringARB(arg1, 34933, arg2.length(), arg2);
        var3.glGetIntegerv(34379, field4091, 0);
        if (field4091[0] == -1) {
            var3.glBindProgramARB(arg1, 0);
            return new class296(arg0, arg1, var4);
        } else {
            var3.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4090.method2667(this.field4092);
        super.finalize();
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lqi;II)V")
    private class296(class458 arg0, int arg1, int arg2) {
        this.field4090 = arg0;
        this.field4092 = arg2;
    }
}
