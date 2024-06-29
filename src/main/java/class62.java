import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class62 extends class50 implements class36 {

    @OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!ifa", name = "x", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "client!ifa", name = "z", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lad;Ljb;III[B)V", line = 6)
    public class62(class669 arg0, class666 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class689.field9771, arg3 * arg4 * arg2, false);
        this.field899 = arg2;
        this.field898 = arg4;
        this.field900 = arg3;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field651, 0, this.method397((byte) 85), this.field899, this.field900, this.field898, 0, class21.method211(super.field654, 49), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(II)I", line = 22)
    public static final int method517(int arg0, int arg1) {
        return class453.field6524 != null ? class453.field6524[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V", line = 28)
    public static final void method518() {
        class63.method519(1, class596.field8626);
    }
}
