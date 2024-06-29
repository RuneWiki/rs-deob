import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class559 extends class45 implements class115 {

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    private int field7961;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    private int field7964;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    private int field7962;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lkca;")
    public static class73 field7963 = new class73(17, 8);

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lig;")
    public static class206 field7965 = new class206(86, -1);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 8)
    public static void method3239(int arg0) {
        field7965 = null;
        field7963 = null;
        if (arg0 != -25997) {
            field7963 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lgf;Lkp;III[B)V", line = 23)
    public class559(class234 arg0, class421 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class256.field3653, arg2 * arg3 * arg4, false);
        this.field7961 = arg4;
        this.field7964 = arg3;
        this.field7962 = arg2;
        super.field480.method1971((byte) -91, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field475, 0, this.method243((byte) -120), this.field7962, this.field7964, this.field7961, 0, class442.method2756(super.field489, 116), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }
}
