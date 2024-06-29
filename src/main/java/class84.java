import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class84 extends class678 {

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "Lus;")
    private class1 field1601;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "J")
    private long field1607;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Lqfa;")
    public static class85 field1605 = new class85(101, 2);

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
    public static final void method847(int arg0, Object[] arg1, long[] arg2) {
        int var3 = -47 / (-arg0 / 58);
        class698.method3901(arg2, 0, (byte) 101, arg2.length - 1, arg1);
        field1604++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)J")
    public final long method848(int arg0) {
        field1602++;
        if (arg0 != 0) {
            this.field1601 = null;
        }
        return this.field1607;
    }

    @OriginalMember(owner = "client!iv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method850((byte) 117);
        field1606++;
        super.finalize();
    }

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1605 = null;
        if (arg0 != 0) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
    private final void method850(byte arg0) {
        int var2 = 54 / ((arg0 - 51) / 62);
        if (this.field1607 > 0L) {
            this.field1601.field175.releasePbuffer(this.field1607);
            this.field1607 = 0L;
        }
        field1603++;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lus;II)V")
    public class84(class1 arg0, int arg1, int arg2) {
        this.field1608 = arg1 * arg2;
        this.field1601 = arg0;
        this.field1607 = this.field1601.field175.createPbuffer(arg1, arg2);
    }
}
