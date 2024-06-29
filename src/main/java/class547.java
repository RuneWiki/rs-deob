import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class547 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[I")
    public static int[] field8052 = new int[5];

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lvj;")
    public static class373 field8048 = new class373(15, 8);

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
    public static long field8050;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[Lha;")
    public static class52[] field8049;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method3210(int arg0) {
        field8049 = null;
        if (arg0 != 8) {
            field8050 = -126L;
        }
        field8048 = null;
        field8052 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    public static final void method3211(int arg0, int arg1) {
        field8051++;
        if (arg0 != arg1 && class565.field8292[arg1]) {
            class267.field3487.method2580(26424, arg1);
            class459.field6326[arg1] = null;
            class543.field7960[arg1] = null;
            class565.field8292[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method3212(byte arg0) {
        class69.field665.method3687(1402);
        int var1 = 17 % ((arg0 - 1) / 37);
        field8053++;
    }
}
