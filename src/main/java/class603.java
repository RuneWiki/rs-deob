import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class603 extends class664 implements class529 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    private int field8669;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "Lqfa;")
    public static class85 field8670 = new class85(1, 2);

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)I")
    public final int method262(boolean arg0) {
        if (!arg0) {
            field8670 = null;
        }
        ++field8673;
        return this.field8669;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)J")
    public final long method267(int arg0) {
        if (arg0 != -18583) {
            field8670 = null;
        }
        ++field8671;
        return super.field9543.getAddress();
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public static void method3451(int arg0) {
        field8670 = null;
        if (arg0 != 0) {
            field8670 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I[BII)V")
    public final void method263(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 < -63) {
            ++field8674;
            this.method3771(arg1, arg2);
            this.field8669 = arg3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
    public final int method260(byte arg0) {
        int var2 = -54 / ((arg0 - 2) / 44);
        ++field8672;
        return 0;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lus;I[BI)V")
    public class603(class1 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8669 = arg1;
    }
}
