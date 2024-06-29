import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class579 extends class645 implements class24 {

    @OriginalMember(owner = "client!kaa", name = "A", descriptor = "I")
    private int field8291;

    @OriginalMember(owner = "client!kaa", name = "B", descriptor = "I")
    private int field8292;

    @OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
    private int field8290;

    @OriginalMember(owner = "client!kaa", name = "E", descriptor = "Llc;")
    public static class435 field8294 = new class435(20, 6);

    @OriginalMember(owner = "client!kaa", name = "D", descriptor = "I")
    public static int field8293;

    @OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lqf;")
    public static class383 field8295;

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lmba;Lkca;III[B)V")
    public class579(class643 arg0, class755 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class674.field9590, arg2 * arg4 * arg3, false);
        this.field8291 = arg2;
        this.field8292 = arg3;
        this.field8290 = arg4;
        super.field9272.method264(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9284, 0, this.method3720(9728), this.field8291, this.field8292, this.field8290, 0, class397.method2411(6145, super.field9283), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public static void method3426(int arg0) {
        field8295 = null;
        field8294 = null;
        int var1 = 92 % ((-43 - arg0) / 62);
    }
}
