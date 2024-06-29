import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class164 {

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[Lp;")
    private class292[] field2496;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[I")
    public static int[] field2493 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field2494 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "[[I")
    public static int[][] field2497 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!il", name = "a", descriptor = "J")
    public static long field2492 = 0L;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1091(String arg0, byte arg1) {
        field2495++;
        if (arg1 != -109) {
            return -29;
        }
        for (int var2 = 0; var2 < class253.field3888.length; var2++) {
            if (class253.field3888[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2493 = null;
        field2497 = null;
        int var1 = -17 / ((21 - arg0) / 61);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
    public class164(int arg0) {
        this.field2496 = new class292[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class292 var3 = this.field2496[var2] = new class292();
            var3.field4599 = var3;
            var3.field4596 = var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IC)C")
    public static final char method1093(int arg0, char arg1) {
        if (arg0 > -83) {
            return 'M';
        } else {
            field2498++;
            return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
        }
    }
}
