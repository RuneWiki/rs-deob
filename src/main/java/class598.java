import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class598 extends class76 implements class423 {

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    private int field8503;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field8504;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field8505;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field8506;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field8508;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "[[[Lbr;")
    public static class184[][][] field8507;

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljj;I[BI)V", line = 3)
    public class598(class66 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8503 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[BBI)V", line = 12)
    public final void method1556(int arg0, byte[] arg1, byte arg2, int arg3) {
        this.method723(arg1, arg3);
        if (arg2 != 88) {
            field8507 = null;
        }
        ++field8502;
        this.field8503 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V", line = 24)
    public static void method3407(byte arg0) {
        if (arg0 != 77) {
            method3407((byte) 41);
        }
        field8507 = null;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)I", line = 37)
    public final int method1559(int arg0) {
        if (arg0 != 17449) {
            field8507 = null;
        }
        ++field8504;
        return this.field8503;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)J", line = 48)
    public final long method1555(int arg0) {
        ++field8506;
        if (arg0 != -10460) {
            method3407((byte) 91);
        }
        return super.field1392.getAddress();
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljj;ILjaclib/memory/Buffer;)V", line = 65)
    public class598(class66 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field8503 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I", line = 74)
    public final int method1553(int arg0) {
        int var2 = 22 / ((20 - arg0) / 40);
        ++field8505;
        return 0;
    }
}
