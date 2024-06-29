import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class155 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2527 = "glow2:";

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "D")
    public static double field2526 = -1.0D;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[[I")
    public static int[][] field2522;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILag;)V", line = 7)
    public final void method1002(int arg0, class202 arg1) {
        while (true) {
            int var3 = arg1.method1317((byte) -124);
            if (var3 == 0) {
                field2523++;
                int var4 = -2 % ((-arg0 - 51) / 59);
                return;
            }
            this.method1004(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 40)
    public static void method1003(int arg0) {
        if (arg0 != 0) {
            field2526 = -0.7465449037201818D;
        }
        field2527 = null;
        field2522 = (int[][]) null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lag;II)V", line = 55)
    private final void method1004(class202 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method1002(62, (class202) null);
        }
        if (arg1 == 1) {
            this.field2528 = arg0.method1315(arg2 ^ 0xFFFFC82E);
            this.field2524 = arg0.method1317((byte) -78);
            this.field2520 = arg0.method1317((byte) -125);
        }
        field2525++;
    }
}
