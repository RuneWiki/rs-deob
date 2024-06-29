import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class147 extends class338 {

    @OriginalMember(owner = "client!ct", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field2458;

    @OriginalMember(owner = "client!ct", name = "E", descriptor = "I")
    public static int field2461 = 2;

    @OriginalMember(owner = "client!ct", name = "D", descriptor = "Leq;")
    public static class213 field2460 = new class213(8);

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ct", name = "F", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ct", name = "G", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1164(int arg0) {
        if (arg0 != 65536) {
            this.method1164(-30);
        }
        field2459++;
        return this.field2458;
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lwe;Ljava/lang/Object;I)V", line = 18)
    public class147(class408 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2458 = arg1;
    }

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "(B)Z", line = 30)
    public final boolean method1165(byte arg0) {
        int var2 = -50 / ((-arg0 - 63) / 61);
        field2463++;
        return false;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(B)V", line = 40)
    public static void method1166(byte arg0) {
        int var1 = -126 % ((arg0 + 27) / 61);
        field2460 = null;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lkda;II)V", line = 52)
    public static final void method1167(class390 arg0, int arg1, int arg2) {
        field2457++;
        if (arg0.field5662 != null) {
            int var3 = arg0.field5662[arg1 + 1];
            if (arg0.field5712 != var3) {
                arg0.field5748 = arg0.field5745;
                arg0.field5712 = var3;
                arg0.field5670 = 1;
                arg0.field5658 = 0;
                arg0.field5720 = 0;
                arg0.field5693 = 0;
                if (arg0.field5712 != -1) {
                    class190.method1366(arg0, arg0.field5693, class456.field6436.method1021(arg0.field5712, 7), -83);
                }
            }
        }
        if (arg2 > -4) {
            method1166((byte) -83);
        }
    }
}
