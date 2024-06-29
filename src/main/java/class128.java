import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class128 {

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field1577;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
    private boolean field1584;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "Lmh;")
    public class537 field1580;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    private int field1582;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[I")
    public static int[] field1581 = new int[200];

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lha;")
    public static class52 field1576;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[Lsa;")
    public static class174[] field1574;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JJ)J", line = 4)
    public static long method726(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[BI)V", line = 13)
    public final void method727(int arg0, byte[] arg1, int arg2) {
        if (arg2 != 35040) {
            this.method727(-13, null, -40);
        }
        this.method728((byte) 1);
        field1575++;
        if (this.field1577 >= arg0) {
            OpenGL.glBufferSubDataARBub(this.field1582, 0, arg0, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field1582, arg0, arg1, 0, this.field1584 ? 35040 : 35044);
            this.field1580.field7745 += arg0 - this.field1577;
            this.field1577 = arg0;
        }
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        this.field1580.method3094(this.field1577, this.field1579, (byte) -22);
        field1578++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)V", line = 52)
    public static void method729(byte arg0) {
        field1581 = null;
        field1574 = null;
        field1576 = null;
        if (arg0 != -48) {
            method729((byte) -111);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lmh;I[BIZ)V", line = 74)
    public class128(class537 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1577 = arg3;
        this.field1584 = arg4;
        this.field1580 = arg0;
        this.field1582 = arg1;
        OpenGL.glGenBuffersARB(1, class329.field4292, 0);
        this.field1579 = class329.field4292[0];
        this.method728((byte) 1);
        OpenGL.glBufferDataARBub(arg1, this.field1577, arg2, 0, this.field1584 ? 35040 : 35044);
        this.field1580.field7745 += this.field1577;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lmh;ILjaclib/memory/Buffer;IZ)V", line = 93)
    public class128(class537 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1577 = arg3;
        this.field1580 = arg0;
        this.field1582 = arg1;
        this.field1584 = arg4;
        OpenGL.glGenBuffersARB(1, class329.field4292, 0);
        this.field1579 = class329.field4292[0];
        this.method728((byte) 1);
        OpenGL.glBufferDataARBa(arg1, this.field1577, arg2.getAddress(), this.field1584 ? 35040 : 35044);
        this.field1580.field7745 += this.field1577;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
    public abstract void method728(byte arg0);
}
