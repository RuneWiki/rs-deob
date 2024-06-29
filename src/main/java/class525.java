import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class525 extends class197 {

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lwo;")
    public static class690 field7697 = new class690(39, 10);

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "[I")
    public static int[] field7701 = new int[4096];

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BZ)V", line = 3)
    public final void method3101(byte arg0, boolean arg1) {
        super.field2388.method2932(true, this);
        if (arg0 != 122) {
            method3102((byte) 64);
        }
        ++field7699;
        OpenGL.glTexParameteri(super.field2380, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 19)
    public static void method3102(byte arg0) {
        field7697 = null;
        field7701 = null;
        if (arg0 != 64) {
            field7697 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 33)
    public final void method1160(byte arg0) {
        int var2 = -1 / ((-50 - arg0) / 54);
        ++field7700;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lkga;II[BI)V", line = 42)
    public class525(class506 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field7698 = arg2;
        super.field2388.method2932(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2380, 0, super.field2394, this.field7698, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1211(true, (byte) 33);
    }
}
