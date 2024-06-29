import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class318 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Lap;")
    public class435 field4119;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    private int field4118;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field4125;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Z")
    private boolean field4124;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4123 = 500;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4119.method2333(-11235, this.field4118, this.field4122);
        field4120++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public abstract void method1108(byte arg0);

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lap;I[BIZ)V")
    public class318(class435 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4119 = arg0;
        this.field4118 = arg3;
        this.field4125 = arg1;
        this.field4124 = arg4;
        OpenGL.glGenBuffersARB(1, class478.field7026, 0);
        this.field4122 = class478.field7026[0];
        this.method1108((byte) -103);
        OpenGL.glBufferDataARBub(arg1, this.field4118, arg2, 0, this.field4124 ? 35040 : 35044);
        this.field4119.field5939 += this.field4118;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lap;ILjaclib/memory/Buffer;IZ)V")
    public class318(class435 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field4124 = arg4;
        this.field4118 = arg3;
        this.field4119 = arg0;
        this.field4125 = arg1;
        OpenGL.glGenBuffersARB(1, class478.field7026, 0);
        this.field4122 = class478.field7026[0];
        this.method1108((byte) -103);
        OpenGL.glBufferDataARBa(arg1, this.field4118, arg2.getAddress(), this.field4124 ? 35040 : 35044);
        this.field4119.field5939 += this.field4118;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[B)V")
    public final void method1792(int arg0, int arg1, byte[] arg2) {
        field4126++;
        this.method1108((byte) -103);
        if (arg1 != 0) {
            this.method1792(75, -100, null);
        }
        if (this.field4118 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field4125, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field4125, arg0, arg2, 0, this.field4124 ? 35040 : 35044);
            this.field4119.field5939 += arg0 - this.field4118;
            this.field4118 = arg0;
        }
    }
}
