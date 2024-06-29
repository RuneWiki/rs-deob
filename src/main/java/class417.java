import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class417 {

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
    public int field6058 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "Lbv;")
    public static class200 field6053 = new class200();

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
    public static int field6057 = 0;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field6055;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "([[II)V", line = 3)
    public static final void method2480(int[][] arg0, int arg1) {
        if (arg1 == 0) {
            class437.field6400 = arg0;
            field6056++;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BILsi;)V", line = 16)
    private final void method2481(byte arg0, int arg1, class391 arg2) {
        field6054++;
        if (arg1 == 5) {
            this.field6058 = arg2.method2353((byte) 99);
        }
        if (arg0 != -101) {
            this.field6058 = -105;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lsi;B)V", line = 34)
    public final void method2482(class391 arg0, byte arg1) {
        if (arg1 != 112) {
            method2480(null, -59);
        }
        while (true) {
            int var3 = arg0.method2348(arg1 - 114);
            if (var3 == 0) {
                field6055++;
                return;
            }
            this.method2481((byte) -101, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V", line = 65)
    public static void method2483(int arg0) {
        if (arg0 == 0) {
            field6053 = null;
        }
    }
}
