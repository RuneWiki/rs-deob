import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class389 extends class185 {

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    private int field4995 = -1;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
    private int field4993 = -1;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public int field4998;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
    public int field4989;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field4997 = 0;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public static int field4992 = -2;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "[Lfs;")
    public static class521[] field4991 = new class521[75];

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "Ldr;")
    public static class675 field4999 = new class675(83, 3);

    @OriginalMember(owner = "client!ep", name = "y", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)V", line = 12)
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = -106 % ((arg1 - 26) / 32);
        super.field2172.method3194((byte) 75, this);
        ++field4994;
        OpenGL.glCopyTexSubImage3D(super.field2169, 0, arg4, arg7, arg6, arg2, arg5, arg0, arg3);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljaa;IIII)V", line = 49)
    public class389(class576 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4998 = arg3;
        this.field4989 = arg2;
        this.field4996 = arg4;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glTexImage3Dub(super.field2169, 0, super.field2180, this.field4989, this.field4998, this.field4996, 0, class443.method2433((byte) -128, super.field2180), 5121, (byte[]) null, 0);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljaa;IIII[BI)V", line = 84)
    public class389(class576 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg4 * arg3, false);
        this.field4989 = arg2;
        this.field4996 = arg4;
        this.field4998 = arg3;
        super.field2172.method3194((byte) 75, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2169, 0, super.field2180, this.field4989, this.field4998, this.field4996, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1101(10240, true);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V", line = 28)
    public final void method298(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field4995, this.field4993, super.field2169, 0, 0, 0);
        ++field4990;
        this.field4993 = -1;
        this.field4995 = -1;
        if (arg0 != -99) {
            this.field4998 = 105;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V", line = 66)
    public static void method2222(int arg0) {
        field4999 = null;
        if (arg0 != 0) {
            field4997 = 43;
        }
        field4991 = null;
    }
}
