import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class425 implements class715 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field5641;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "[I")
    public static int[] field5635 = new int[1];

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Llja;")
    public static class744 field5637 = new class744(2, -1);

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lfo;")
    public static class544 field5639;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "[Lnc;")
    public static class26[] field5638;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[[[J")
    public static long[][][] field5640;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method2537(int arg0) {
        field5635 = null;
        field5639 = null;
        if (arg0 != 1) {
            field5635 = null;
        }
        field5638 = null;
        field5637 = null;
        field5640 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static final void method2538(byte arg0) {
        field5642++;
        if (class783.method4341((byte) -69, class289.field3493) || class451.method2741(class289.field3493, 0)) {
            class241.method1461(class599.field8107 >> 12, class350.field4366 >> 12, 0, 5000);
        } else {
            int var1 = class300.field3596.field3453[0] >> 3;
            int var2 = class300.field3596.field3455[0] >> 3;
            if (var1 >= 0 && class596.field8090 >> 3 > var1 && var2 >= 0 && class107.field1350 >> 3 > var2) {
                class241.method1461(var1, var2, 0, 5000);
            } else {
                class241.method1461(class596.field8090 >> 4, class107.field1350 >> 4, 0, 0);
            }
        }
        class730.method4123(16711935);
        class385.method2258(7);
        if (arg0 >= 91) {
            class161.method1132(true);
            class10.method171(0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Lhba;")
    public static final class10 method2539(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10174;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class425(String arg0, int arg1) {
        this.field5641 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5636++;
        throw new IllegalStateException();
    }
}
