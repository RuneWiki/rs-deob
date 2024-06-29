import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class637 extends class561 implements class560 {

    @OriginalMember(owner = "client!uca", name = "D", descriptor = "I")
    private int field9275;

    @OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
    private int field9271;

    @OriginalMember(owner = "client!uca", name = "B", descriptor = "I")
    private int field9273;

    @OriginalMember(owner = "client!uca", name = "E", descriptor = "I")
    public static int field9276 = 0;

    @OriginalMember(owner = "client!uca", name = "A", descriptor = "Lrb;")
    public static class352 field9272 = new class352(11, 0, 1, 2);

    @OriginalMember(owner = "client!uca", name = "F", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!uca", name = "G", descriptor = "J")
    public static long field9278;

    @OriginalMember(owner = "client!uca", name = "C", descriptor = "Ldda;")
    public static class597 field9274;

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lqba;Ljt;III[B)V")
    public class637(class540 arg0, class489 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class629.field9208, arg2 * arg4 * arg3, false);
        this.field9275 = arg4;
        this.field9271 = arg3;
        this.field9273 = arg2;
        super.field8314.method1152(this, true);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8320, 0, this.method3277(1), this.field9273, this.field9271, this.field9275, 0, class135.method836(false, super.field8310), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Z)V")
    public static void method3692(boolean arg0) {
        field9272 = null;
        field9274 = null;
        if (!arg0) {
            field9278 = -75L;
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(II)I")
    public static int method3693(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
