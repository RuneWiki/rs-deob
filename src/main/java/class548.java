import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class548 extends class659 implements class593 {

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "I")
    private int field7962;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    private int field7963;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
    private int field7958;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field7960 = 0;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!kq", name = "B", descriptor = "Lmt;")
    public static class364 field7959;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "Lmt;")
    public static class364 field7961;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method3211(byte arg0) {
        field7961 = null;
        if (arg0 != 72) {
            method3212(true, 17, 32);
        }
        field7959 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZII)V")
    public static final void method3212(boolean arg0, int arg1, int arg2) {
        ++field7957;
        class233 var3 = class7.method44(arg2, 1, -1);
        if (arg0) {
            field7959 = null;
        }
        var3.method1422(0);
        var3.field3114 = arg1;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Ldda;Lfca;III[B)V")
    public class548(class349 arg0, class75 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class279.field3793, arg2 * arg3 * arg4, false);
        this.field7962 = arg3;
        this.field7963 = arg2;
        this.field7958 = arg4;
        super.field9354.method2316((byte) 110, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9349, 0, this.method3735(-8573), this.field7963, this.field7962, this.field7958, 0, class499.method2903(7491, super.field9372), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
