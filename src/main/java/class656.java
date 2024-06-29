import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class656 {

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    private int field8929;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Ljaa;")
    public class576 field8928;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    private int field8927;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Z")
    private boolean field8924;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public int field8926;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field8932 = 104;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Ldr;")
    public static class675 field8931 = new class675(21, 3);

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Ldr;")
    public static class675 field8934 = new class675(106, 6);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "Lue;")
    public static class218 field8933;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[Z")
    public static boolean[] field8925;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BI)V", line = 11)
    public final void method3663(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 106) {
            this.field8927 = -60;
        }
        field8930++;
        this.method2629(-88);
        if (arg2 <= this.field8927) {
            OpenGL.glBufferSubDataARBub(this.field8929, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field8929, arg2, arg1, 0, this.field8924 ? 35040 : 35044);
            this.field8928.field7611 += arg2 - this.field8927;
            this.field8927 = arg2;
        }
    }

    @OriginalMember(owner = "client!gn", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        field8923++;
        this.field8928.method3177(this.field8926, this.field8927, (byte) 101);
        super.finalize();
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljaa;I[BIZ)V", line = 51)
    public class656(class576 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field8929 = arg1;
        this.field8928 = arg0;
        this.field8927 = arg3;
        this.field8924 = arg4;
        OpenGL.glGenBuffersARB(1, class636.field8618, 0);
        this.field8926 = class636.field8618[0];
        this.method2629(102);
        OpenGL.glBufferDataARBub(arg1, this.field8927, arg2, 0, this.field8924 ? 35040 : 35044);
        this.field8928.field7611 += this.field8927;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljaa;ILjaclib/memory/Buffer;IZ)V", line = 70)
    public class656(class576 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field8924 = arg4;
        this.field8928 = arg0;
        this.field8927 = arg3;
        this.field8929 = arg1;
        OpenGL.glGenBuffersARB(1, class636.field8618, 0);
        this.field8926 = class636.field8618[0];
        this.method2629(102);
        OpenGL.glBufferDataARBa(arg1, this.field8927, arg2.getAddress(), this.field8924 ? 35040 : 35044);
        this.field8928.field7611 += this.field8927;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 91)
    public static void method3664(boolean arg0) {
        field8934 = null;
        field8931 = null;
        if (!arg0) {
            method3664(false);
        }
        field8933 = null;
        field8925 = null;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public abstract void method2629(int arg0);
}
