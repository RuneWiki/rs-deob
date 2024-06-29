import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class754 extends class696 implements class326 {

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "Lbha;")
    public static class571 field10502 = new class571(0, 0);

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "[I")
    public static int[] field10503 = new int[256];

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "Lqaa;")
    public static class27 field10505 = new class27(57, -1);

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field10504;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(I)V")
    public static void method4189(int arg0) {
        if (arg0 != -18546) {
            method4189(-25);
        }
        field10505 = null;
        field10503 = null;
        field10504 = null;
        field10502 = null;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Leea;IZ[[I)V")
    public class754(class132 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class282.field4019, class438.field6117, arg1 * arg1 * 6, arg2);
        super.field9790.method2732(-86, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method3909(arg1, arg3[var5], arg1, var5 + 34069, 31996);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method3910(0), arg1, arg1, 0, class491.method2955(super.field9780, false), super.field9790.field2094, arg3[var6], 0);
            }
        }
    }
}
