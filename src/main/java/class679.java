import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class679 {

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "J")
    public long field9602;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "Lfc;")
    private class642 field9601;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field9597 = 0;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lsv;")
    public static class570 field9598 = new class570(84, 4);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "Lgga;")
    public static class513 field9599;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lea;I)I", line = 6)
    public static final int method3817(class21 arg0, int arg1) {
        field9595++;
        int var2 = arg0.field209;
        class31 var3 = arg0.method1783(true);
        if (~arg0.field4040 == arg1 || arg0.field4109) {
            var2 = arg0.field216;
        } else if (arg0.field4040 == var3.field388 || arg0.field4040 == var3.field347 || arg0.field4040 == var3.field385 || arg0.field4040 == var3.field355) {
            var2 = arg0.field225;
        } else if (arg0.field4040 == var3.field344 || arg0.field4040 == var3.field368 || arg0.field4040 == var3.field359 || arg0.field4040 == var3.field341) {
            var2 = arg0.field234;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fo", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        field9596++;
        this.field9601.method3646(115, this.field9602);
        super.finalize();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 45)
    public static void method3818(byte arg0) {
        field9599 = null;
        field9598 = null;
        if (arg0 >= -121) {
            method3818((byte) 92);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lfc;JI)V", line = 63)
    public class679(class642 arg0, long arg1, int arg2) {
        this.field9602 = arg1;
        this.field9601 = arg0;
    }
}
