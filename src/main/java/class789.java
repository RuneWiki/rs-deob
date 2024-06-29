import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class789 extends class422 implements class307 {

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    private int field10823;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
    private int field10824;

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    private int field10828;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "Lbu;")
    public static class21 field10827 = new class21(43, 6);

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    public static int field10825;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
    public static int field10826;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "I")
    public static int field10829;

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lko;Lvea;III[B)V")
    public class789(class529 arg0, class288 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class34.field457, arg2 * arg3 * arg4, false);
        this.field10823 = arg2;
        this.field10824 = arg4;
        this.field10828 = arg3;
        super.field5775.method1118(0, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field5768, 0, this.method2556(-128), this.field10823, this.field10828, this.field10824, 0, class511.method3090(super.field5773, (byte) -39), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public static void method4319(byte arg0) {
        field10827 = null;
        if (arg0 >= -91) {
            field10827 = null;
        }
    }
}
