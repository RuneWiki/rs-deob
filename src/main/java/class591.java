import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class591 {

    @OriginalMember(owner = "client!av", name = "d", descriptor = "J")
    public long field8562;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "Ldda;")
    private class349 field8563;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Log;")
    public static class599 field8561 = new class599(1);

    @OriginalMember(owner = "client!av", name = "g", descriptor = "Lwo;")
    public static class690 field8565 = new class690(62, 4);

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public static int field8559;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field8563.method1989(false, this.field8562);
        field8560++;
        super.finalize();
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 16)
    public static void method3429(byte arg0) {
        field8565 = null;
        int var1 = -17 / ((-arg0 - 47) / 56);
        field8561 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V", line = 29)
    public static final void method3430(int arg0, int arg1) {
        field8559++;
        int var2 = 5 / ((arg0 + 51) / 38);
        if (class62.method607((byte) -106, arg1)) {
            class161.method1022(class516.field7555[arg1], -1, 77);
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Ldda;JI)V", line = 44)
    public class591(class349 arg0, long arg1, int arg2) {
        this.field8562 = arg1;
        this.field8563 = arg0;
    }
}
