import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class440 extends class539 {

    @OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
    private int field6074;

    @OriginalMember(owner = "client!cia", name = "x", descriptor = "I")
    public static int field6073 = 0;

    @OriginalMember(owner = "client!cia", name = "z", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!cia", name = "A", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(Lpq;II[BI)V", line = 4)
    public class440(class194 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6074 = arg2;
        super.field7457.method1219((byte) 94, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field7453, 0, super.field7461, this.field6074, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3201(true, true);
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(I)V", line = 26)
    public final void method1737(int arg0) {
        ++field6076;
        if (arg0 != 0) {
            this.field6074 = 47;
        }
    }

    @OriginalMember(owner = "client!cia", name = "a", descriptor = "(ZI)V", line = 37)
    public final void method2634(boolean arg0, int arg1) {
        if (arg1 >= -84) {
            this.method2634(false, 125);
        }
        super.field7457.method1219((byte) 103, this);
        ++field6075;
        OpenGL.glTexParameteri(super.field7453, 10242, !arg0 ? 33071 : 10497);
    }
}
