import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class673 {

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
    public static int[] field9379 = new int[8];

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "[[I")
    public static int[][] field9380 = new int[128][128];

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field9374;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field9378;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lvda;")
    public class193 field9381;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lhs;")
    public static class344 field9377;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
    public int[] field9382;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method3824(byte arg0) {
        field9380 = null;
        int var1 = -85 % (-arg0 / 54);
        field9379 = null;
        field9377 = null;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)[Lsaa;")
    public static final class345[] method3825(byte arg0) {
        field9375++;
        if (arg0 < 106) {
            method3824((byte) 48);
        }
        return new class345[] { class422.field5777, class65.field793, class759.field10480, class450.field6161, class686.field9546, class523.field7392, class463.field6534, class384.field5287, class668.field9298, class95.field1076 };
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V")
    public static final void method3826(byte arg0, int arg1) {
        field9373++;
        class313 var2 = class312.method1998((long) arg1, 10, arg0 ^ 0xFFFFFF96);
        var2.method2006(-86);
        if (arg0 != 105) {
            field9377 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
    public static final boolean method3827(int arg0, int arg1) {
        if (arg1 != -28639) {
            method3824((byte) -24);
        }
        field9378++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }
}
