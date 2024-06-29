import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class610 extends class394 implements class489 {

    @OriginalMember(owner = "client!kha", name = "C", descriptor = "I")
    private int field8193;

    @OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
    private int field8191;

    @OriginalMember(owner = "client!kha", name = "B", descriptor = "I")
    private int field8192;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "Lhj;")
    public static class596 field8189 = new class596(21, -1);

    @OriginalMember(owner = "client!kha", name = "E", descriptor = "[I")
    public static int[] field8195 = new int[13];

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!kha", name = "D", descriptor = "[I")
    public static int[] field8194;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)V", line = 3)
    public static void method3460(int arg0) {
        if (arg0 < 125) {
            field8195 = null;
        }
        field8189 = null;
        field8195 = null;
        field8194 = null;
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lnv;Lpe;III[B)V", line = 22)
    public class610(class439 arg0, class636 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class748.field10384, arg2 * arg4 * arg3, false);
        this.field8193 = arg3;
        this.field8191 = arg4;
        this.field8192 = arg2;
        super.field5105.method2643(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5112, 0, this.method2311(-588507160), this.field8192, this.field8193, this.field8191, 0, class563.method3265((byte) -126, super.field5099), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILjw;)I", line = 39)
    public static final int method3461(int arg0, class581 arg1) {
        ++field8190;
        String var2 = class325.method1933(arg1, arg0 ^ 7850);
        return arg0 != -7830 ? -126 : class332.field4108.method1817(false, var2, class256.field3026);
    }
}
