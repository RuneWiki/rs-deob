import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class58 extends class178 implements class361 {

    @OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
    private int field829;

    @OriginalMember(owner = "client!hr", name = "C", descriptor = "I")
    private int field828;

    @OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "client!hr", name = "E", descriptor = "Lqi;")
    public static class293 field830 = new class293(128);

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lhj;Liv;III[B)V")
    public class58(class47 arg0, class25 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class38.field472, arg2 * arg3 * arg4, false);
        this.field829 = arg3;
        this.field828 = arg4;
        this.field827 = arg2;
        super.field2431.method1458(399403340, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2445, 0, this.method1122(101), this.field827, this.field829, this.field828, 0, class71.method547(super.field2442, -8807), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public static void method416(int arg0) {
        if (arg0 < -1) {
            field830 = null;
        }
    }
}
