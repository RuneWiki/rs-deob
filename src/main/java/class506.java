import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class506 extends class775 {

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    private int field7099;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    private int field7100;

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    private int field7098;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    private int field7093;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
    public static boolean field7094 = false;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "F")
    public static float field7095;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field7097;

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIII)V", line = 8)
    public class506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7099 = arg2;
        this.field7100 = arg0;
        this.field7098 = arg3;
        this.field7093 = arg1;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(III)V", line = 19)
    public final void method109(int arg0, int arg1, int arg2) {
        ++field7092;
        if (arg0 != -1) {
            this.method109(90, -21, -51);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)Lmd;", line = 31)
    public static final class569 method2944(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2529;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V", line = 43)
    public final void method110(int arg0, int arg1, int arg2) {
        if (arg1 != 512) {
            field7095 = 0.8306072F;
        }
        ++field7096;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V", line = 55)
    public final void method111(int arg0, int arg1, int arg2) {
        ++field7097;
        int var4 = this.field7100 * arg1 >> 12;
        int var5 = this.field7099 * arg1 >> 12;
        int var6 = this.field7093 * arg0 >> 12;
        if (arg2 != 17793) {
            this.field7093 = -4;
        }
        int var7 = this.field7098 * arg0 >> 12;
        class547.method3149(arg2 + 203800235, var5, var4, var6, super.field10661, var7);
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "(III)Lf;", line = 75)
    public static final class787 method2945(int arg0, int arg1, int arg2) {
        class194 var3 = class443.field6387[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class787 var4 = var3.field2532;
            var3.field2532 = null;
            class755.method4140(var4);
            return var4;
        }
    }
}
