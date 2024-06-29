import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class137 extends class594 implements class73 {

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    private int field2424;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    private int field2422;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "Lqfa;")
    public static class85 field2425 = new class85(91, 14);

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        field2425 = null;
        if (arg0 != 42) {
            field2426 = -18;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Ljq;Lfda;III[B)V")
    public class137(class475 arg0, class294 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class2.field372, arg2 * arg3 * arg4, false);
        this.field2423 = arg4;
        this.field2424 = arg2;
        this.field2422 = arg3;
        super.field8555.method3266(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8554, 0, this.method3387(-3), this.field2424, this.field2422, this.field2423, 0, class635.method3618(super.field8543, 1), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
