import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class412 extends class84 implements class668 {

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    private int field5245;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    private int field5241;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    private int field5242;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field5240 = 0;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "J")
    public static long field5244 = -1L;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "[[B")
    public static byte[][] field5243;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V", line = 10)
    public static void method2309(byte arg0) {
        field5243 = null;
        if (arg0 != -119) {
            method2309((byte) 69);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Ltk;Let;III[B)V", line = 31)
    public class412(class347 arg0, class596 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class285.field3589, arg3 * arg4 * arg2, false);
        this.field5245 = arg3;
        this.field5241 = arg2;
        this.field5242 = arg4;
        super.field1159.method2396(22357, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1141, 0, this.method702(108), this.field5241, this.field5245, this.field5242, 0, class705.method3951(super.field1161, -91), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
