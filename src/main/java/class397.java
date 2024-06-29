import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class class397 {

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    private int field5792;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lus;")
    public class1 field5790;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    private int field5783;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
    private boolean field5789;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public int field5787;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Z")
    public static boolean field5791 = true;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "F")
    public static float field5785;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field5784;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "[Z")
    public static boolean[] field5786;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I[BB)V")
    public final void method2445(int arg0, byte[] arg1, byte arg2) {
        if (arg2 >= -103) {
            this.field5792 = 41;
        }
        this.method266(58);
        field5782++;
        if (this.field5792 < arg0) {
            OpenGL.glBufferDataARBub(this.field5783, arg0, arg1, 0, this.field5789 ? 35040 : 35044);
            this.field5790.field232 += arg0 - this.field5792;
            this.field5792 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field5783, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public abstract void method266(int arg0);

    @OriginalMember(owner = "client!li", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5784++;
        this.field5790.method68(this.field5787, this.field5792, 18820);
        super.finalize();
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lus;I[BIZ)V")
    public class397(class1 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5792 = arg3;
        this.field5790 = arg0;
        this.field5783 = arg1;
        this.field5789 = arg4;
        OpenGL.glGenBuffersARB(1, class223.field3355, 0);
        this.field5787 = class223.field3355[0];
        this.method266(101);
        OpenGL.glBufferDataARBub(arg1, this.field5792, arg2, 0, this.field5789 ? 35040 : 35044);
        this.field5790.field232 += this.field5792;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lus;ILjaclib/memory/Buffer;IZ)V")
    public class397(class1 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field5792 = arg3;
        this.field5783 = arg1;
        this.field5790 = arg0;
        this.field5789 = arg4;
        OpenGL.glGenBuffersARB(1, class223.field3355, 0);
        this.field5787 = class223.field3355[0];
        this.method266(110);
        OpenGL.glBufferDataARBa(arg1, this.field5792, arg2.getAddress(), this.field5789 ? 35040 : 35044);
        this.field5790.field232 += this.field5792;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static void method2446(int arg0) {
        field5786 = null;
        if (arg0 != 0) {
            method2446(-17);
        }
    }
}
