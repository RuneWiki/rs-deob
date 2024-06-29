import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class210 {

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    private int field2708;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "Llf;")
    public class250 field2704;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    private int field2701;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Z")
    private boolean field2706;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "J")
    public static long field2702 = 0L;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Ltj;")
    public static class209 field2705;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BI)V", line = 11)
    public final void method1370(int arg0, byte[] arg1, int arg2) {
        field2707++;
        this.method1369(arg0 ^ 0x7EF7);
        if (this.field2708 >= arg2) {
            OpenGL.glBufferSubDataARBub(this.field2701, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field2701, arg2, arg1, 0, this.field2706 ? 35040 : 35044);
            this.field2704.field3532 += arg2 - this.field2708;
            this.field2708 = arg2;
        }
        if (arg0 != 0) {
            this.field2701 = 19;
        }
    }

    @OriginalMember(owner = "client!pk", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() throws Throwable {
        field2700++;
        this.field2704.method1561(this.field2708, (byte) -33, this.field2703);
        super.finalize();
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 48)
    public static void method1371(byte arg0) {
        field2705 = null;
        int var1 = -81 % ((-arg0 - 38) / 34);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Llf;I[BIZ)V", line = 60)
    public class210(class250 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field2708 = arg3;
        this.field2704 = arg0;
        this.field2701 = arg1;
        this.field2706 = arg4;
        OpenGL.glGenBuffersARB(1, class512.field7133, 0);
        this.field2703 = class512.field7133[0];
        this.method1369(32503);
        OpenGL.glBufferDataARBub(arg1, this.field2708, arg2, 0, this.field2706 ? 35040 : 35044);
        this.field2704.field3532 += this.field2708;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Llf;ILjaclib/memory/Buffer;IZ)V", line = 79)
    public class210(class250 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field2706 = arg4;
        this.field2708 = arg3;
        this.field2701 = arg1;
        this.field2704 = arg0;
        OpenGL.glGenBuffersARB(1, class512.field7133, 0);
        this.field2703 = class512.field7133[0];
        this.method1369(32503);
        OpenGL.glBufferDataARBa(arg1, this.field2708, arg2.getAddress(), this.field2706 ? 35040 : 35044);
        this.field2704.field3532 += this.field2708;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public abstract void method1369(int arg0);
}
