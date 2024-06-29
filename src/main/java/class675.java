import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class675 extends class136 {

    @OriginalMember(owner = "client!cp", name = "A", descriptor = "I")
    private int field9532;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "[[I")
    public static int[][] field9527 = new int[128][128];

    @OriginalMember(owner = "client!cp", name = "y", descriptor = "I")
    public static int field9530 = -1;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public static int field9529;

    @OriginalMember(owner = "client!cp", name = "z", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field9526;

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Llj;II[BI)V", line = 6)
    public class675(class565 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9532 = arg2;
        super.field1927.method3206(this, (byte) 26);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field1925, 0, super.field1930, this.field9532, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method944((byte) -111, true);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)V", line = 24)
    public final void method240(byte arg0) {
        if (arg0 != -8) {
            this.field9532 = -121;
        }
        ++field9529;
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V", line = 34)
    public static void method3826(int arg0) {
        if (arg0 != 4) {
            method3826(-81);
        }
        field9527 = null;
        field9526 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(IZ)V", line = 47)
    public final void method3827(int arg0, boolean arg1) {
        super.field1927.method3206(this, (byte) 26);
        ++field9528;
        OpenGL.glTexParameteri(super.field1925, 10242, !arg1 ? 33071 : 10497);
        if (arg0 != 3317) {
            this.method3827(-50, true);
        }
    }
}
