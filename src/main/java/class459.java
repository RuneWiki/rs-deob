import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class459 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    private int field6549;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field6548;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    private boolean field6554;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Luq;")
    public class313 field6551;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field6550;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Luv;")
    public static class3 field6555 = new class3(54, 0);

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field6556 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Lbn;")
    public static class371 field6557 = new class371(9, 0, 4, 1);

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lim;")
    public static class353 field6558 = new class353(20, -2);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field6552;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lfj;")
    public static class603 field6559;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z[BI)V")
    public final void method2660(boolean arg0, byte[] arg1, int arg2) {
        if (arg0) {
            field6558 = null;
        }
        field6553++;
        this.method877((byte) -11);
        if (arg2 <= this.field6548) {
            OpenGL.glBufferSubDataARBub(this.field6549, 0, arg2, arg1, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6549, arg2, arg1, 0, this.field6554 ? 35040 : 35044);
            this.field6551.field4216 += arg2 - this.field6548;
            this.field6548 = arg2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public static final int method2661(int arg0, int arg1) {
        return class596.field8593 == null ? 0 : class596.field8593[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!jb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6552++;
        this.field6551.method1945(this.field6550, this.field6548, 118);
        super.finalize();
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
    public abstract void method877(byte arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZIII)V")
    public static final void method2662(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class288.field3762 = 0L;
        field6547++;
        int var5 = class207.method1324((byte) 102);
        if (arg2 < 25) {
            method2662(30, true, -50, -35, 86);
        }
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class301.field3918.method966()) {
            arg1 = true;
        }
        class319.method1991(arg4, arg3, var5, arg0, arg1, 80);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Luq;I[BIZ)V")
    public class459(class313 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6549 = arg1;
        this.field6548 = arg3;
        this.field6554 = arg4;
        this.field6551 = arg0;
        OpenGL.glGenBuffersARB(1, class432.field5878, 0);
        this.field6550 = class432.field5878[0];
        this.method877((byte) -11);
        OpenGL.glBufferDataARBub(arg1, this.field6548, arg2, 0, this.field6554 ? 35040 : 35044);
        this.field6551.field4216 += this.field6548;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Luq;ILjaclib/memory/Buffer;IZ)V")
    public class459(class313 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6548 = arg3;
        this.field6551 = arg0;
        this.field6554 = arg4;
        this.field6549 = arg1;
        OpenGL.glGenBuffersARB(1, class432.field5878, 0);
        this.field6550 = class432.field5878[0];
        this.method877((byte) -11);
        OpenGL.glBufferDataARBa(arg1, this.field6548, arg2.getAddress(), this.field6554 ? 35040 : 35044);
        this.field6551.field4216 += this.field6548;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
    public static void method2663(int arg0) {
        if (arg0 <= -66) {
            field6558 = null;
            field6559 = null;
            field6555 = null;
            field6557 = null;
        }
    }
}
