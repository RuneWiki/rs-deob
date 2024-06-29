import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class349 extends class192 implements class568 {

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    private int field5104;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    private int field5108;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    private int field5107;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "S")
    public static short field5106 = 320;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "Z")
    public static boolean field5105 = true;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lno;Lpd;III[B)V")
    public class349(class704 arg0, class259 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class256.field3677, arg2 * arg4 * arg3, false);
        this.field5104 = arg2;
        this.field5108 = arg4;
        this.field5107 = arg3;
        super.field2896.method2294(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2907, 0, this.method1330((byte) -37), this.field5104, this.field5107, this.field5108, 0, class489.method2929(super.field2904, 6407), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
