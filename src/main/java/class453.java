import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class453 extends class42 implements class369 {

    @OriginalMember(owner = "client!td", name = "B", descriptor = "I")
    private int field6404;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    private int field6402;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    private int field6400;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "Lqfa;")
    public static class98 field6399 = new class98(46, 7);

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "Z")
    public static boolean field6401;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lfha;Lbda;III[B)V", line = 5)
    public class453(class378 arg0, class505 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class309.field4305, arg2 * arg3 * arg4, false);
        this.field6404 = arg2;
        this.field6402 = arg4;
        this.field6400 = arg3;
        super.field506.method1663(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field508, 0, this.method284(-78), this.field6404, this.field6400, this.field6402, 0, class651.method3587((byte) -97, super.field516), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 22)
    public static void method2700(byte arg0) {
        field6399 = null;
        if (arg0 <= 34) {
            field6403 = 92;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ld;IILjava/awt/Canvas;I)Lha;", line = 32)
    public static final class58 method2701(class149 arg0, int arg1, int arg2, Canvas arg3, int arg4) {
        if (arg2 != -14883) {
            field6405 = 8;
        }
        ++field6398;
        return new class693(arg3, arg0, arg1, arg4);
    }
}
