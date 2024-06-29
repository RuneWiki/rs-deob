import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class397 extends class753 implements class94 {

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    private int field5477;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    private int field5478;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    private int field5481;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "Z")
    public static boolean field5480 = false;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
    public static int[] field5476;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method2396(boolean arg0) {
        field5476 = null;
        if (!arg0) {
            method2396(true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Loia;Lul;III[B)V")
    public class397(class97 arg0, class599 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class497.field6799, arg3 * arg4 * arg2, false);
        this.field5477 = arg3;
        this.field5478 = arg2;
        this.field5481 = arg4;
        super.field10392.method3090(this, (byte) 100);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field10396, 0, this.method4178(6409), this.field5478, this.field5477, this.field5481, 0, class298.method1917(-120, super.field10382), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
