import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class470 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    private int field6586;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    private int field6588;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Lqfa;")
    public class106 field6595;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
    private boolean field6585;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field6594;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field6591 = new int[3];

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lbu;")
    public static class21 field6589 = new class21(60, 0);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field6592 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field6596 = 0;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field6593;

    @OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V", line = 10)
    protected final void finalize() throws Throwable {
        field6590++;
        this.field6595.method742(this.field6594, -30314, this.field6586);
        super.finalize();
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V", line = 20)
    public static void method2796(byte arg0) {
        if (arg0 >= -106) {
            field6592 = -13;
        }
        field6589 = null;
        field6591 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[BB)V", line = 33)
    public final void method2797(int arg0, byte[] arg1, byte arg2) {
        this.method1247(arg2 ^ 0x555C);
        field6587++;
        if (arg2 != -127) {
            this.field6588 = 116;
        }
        if (arg0 > this.field6586) {
            OpenGL.glBufferDataARBub(this.field6588, arg0, arg1, 0, this.field6585 ? 35040 : 35044);
            this.field6595.field1455 += arg0 - this.field6586;
            this.field6586 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field6588, 0, arg0, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lqfa;I[BIZ)V", line = 74)
    public class470(class106 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6586 = arg3;
        this.field6588 = arg1;
        this.field6595 = arg0;
        this.field6585 = arg4;
        OpenGL.glGenBuffersARB(1, class75.field854, 0);
        this.field6594 = class75.field854[0];
        this.method1247(-21795);
        OpenGL.glBufferDataARBub(arg1, this.field6586, arg2, 0, this.field6585 ? 35040 : 35044);
        this.field6595.field1455 += this.field6586;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lqfa;ILjaclib/memory/Buffer;IZ)V", line = 93)
    public class470(class106 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6586 = arg3;
        this.field6588 = arg1;
        this.field6595 = arg0;
        this.field6585 = arg4;
        OpenGL.glGenBuffersARB(1, class75.field854, 0);
        this.field6594 = class75.field854[0];
        this.method1247(-21795);
        OpenGL.glBufferDataARBa(arg1, this.field6586, arg2.getAddress(), this.field6585 ? 35040 : 35044);
        this.field6595.field1455 += this.field6586;
    }

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public abstract void method1247(int arg0);
}
