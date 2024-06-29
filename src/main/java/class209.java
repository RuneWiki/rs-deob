import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class209 extends class763 implements class654 {

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    private int field2776;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "Ljda;")
    public static class239 field2775 = new class239(64);

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "Lkn;")
    public static class771 field2778;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public static final void method1392(int arg0, int arg1, int arg2, int arg3) {
        class243 var4 = class626.field8501[arg0][arg1][arg2];
        if (var4 != null) {
            class280 var5 = var4.field3277;
            class280 var6 = var4.field3274;
            if (var5 != null) {
                var5.field4132 = (short) (var5.field4132 * arg3 / (16 << class26.field388 - 7));
                var5.field4134 = (short) (var5.field4134 * arg3 / (16 << class26.field388 - 7));
            }
            if (var6 != null) {
                var6.field4132 = (short) (var6.field4132 * arg3 / (16 << class26.field388 - 7));
                var6.field4134 = (short) (var6.field4134 * arg3 / (16 << class26.field388 - 7));
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
    public static final int method1393(int arg0) {
        ++field2774;
        return arg0 != 64 ? 34 : class500.field6909;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lpa;Lsw;III[B)V")
    public class209(class391 arg0, class787 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class258.field3847, arg2 * arg4 * arg3, false);
        this.field2776 = arg4;
        this.field2777 = arg2;
        this.field2773 = arg3;
        super.field10545.method3520(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field10554, 0, this.method4235(-11391), this.field2777, this.field2773, this.field2776, 0, class719.method4017(98, super.field10555), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method1394(byte arg0) {
        field2778 = null;
        if (arg0 < 93) {
            method1392(-104, -42, 25, 0);
        }
        field2775 = null;
    }
}
