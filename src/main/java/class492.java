import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class492 {

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public int field7183;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field7189;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "J")
    public static long field7187 = -1L;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field7184;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field7185;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[[[Ldr;")
    public static class420[][][] field7181;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public static final void method2919(int arg0, int arg1, int arg2) {
        field7184++;
        if (class276.field3834 == 1) {
            class515.method3062(arg2, class83.field1139, -14223, arg1);
        } else if (class276.field3834 == 2) {
            class471.method2824(arg1, arg2, -127);
        }
        class276.field3834 = arg0;
        class83.field1139 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)I")
    public final int method2920(int arg0) {
        field7182++;
        if (arg0 != 2) {
            method2923((byte) -34);
        }
        return this.field7189;
    }

    @OriginalMember(owner = "client!pg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7185++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method2921(byte arg0) {
        class56.method378();
        field7190++;
        for (int var1 = 0; var1 < 4; var1++) {
            class444.field6605[var1].method2322(-29126);
        }
        if (arg0 == -24) {
            class413.method2508(false);
            class220.method1494((byte) -127);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public static void method2922(boolean arg0) {
        if (!arg0) {
            field7181 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V")
    public static final void method2923(byte arg0) {
        field7188++;
        class33.method247(arg0 ^ 0xFFFFFFAC);
        class513.field7615 = null;
        class456.field6695 = null;
        class98.field1415 = null;
        if (arg0 != 19) {
            field7181 = null;
        }
        class109.field1536 = null;
        class392.field5950 = null;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(II)V")
    public class492(int arg0, int arg1) {
        this.field7183 = arg1;
        this.field7189 = arg0;
    }
}
