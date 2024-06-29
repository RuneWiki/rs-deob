import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class17 implements class69 {

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    private int field35;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lbea;Los;III[B)V")
    public class5(class205 arg0, class408 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class134.field2197, arg2 * arg3 * arg4, false);
        this.field35 = arg2;
        this.field36 = arg4;
        this.field34 = arg3;
        super.field300.method2271(this, 5180);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field292, 0, this.method248(10241), this.field35, this.field34, this.field36, 0, class250.method1782((byte) 87, super.field285), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
