import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class311 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
    public static int[] field4702 = new int[99];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 4)
    public static void method2132(byte arg0) {
        field4702 = null;
        int var1 = -57 / ((arg0 - 36) / 41);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)Lrk;", line = 18)
    public static final class277 method2133(byte[] arg0, byte arg1) {
        field4701++;
        if (arg0 == null) {
            return null;
        }
        class277 var2;
        if (class67.field908) {
            var2 = new class298(arg0, class209.field3002, class274.field4115, class323.field4903, class288.field4281, class209.field3012);
        } else {
            var2 = new class9(arg0, class209.field3002, class274.field4115, class323.field4903, class288.field4281, class209.field3012);
        }
        class236.method1624(41);
        int var3 = 36 % ((34 - arg1) / 42);
        return var2;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4702[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 66)
    public static final void method2134(int arg0, int arg1) {
        field4700++;
        if (arg1 >= 91) {
            class135.field1864 = (class297) class122.field1656.method111(-29, (long) arg0);
        }
    }
}
