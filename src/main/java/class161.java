import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class161 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[I")
    public static int[] field2817 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[I")
    public static int[] field2824 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2 };

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Lp;")
    private static class280 field2825 = class18.method140((byte) -122, "scroll:");

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lp;")
    public static class280 field2816 = field2825;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lp;")
    public static class280 field2815 = field2825;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field2823 = 0;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field2822 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field2829 = 500;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "J")
    public long field2827;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lil;")
    public class161 field2819;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Lil;")
    public class161 field2828;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "[[B")
    public static byte[][] field2821;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1145(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2818++;
        int var8 = arg2 - arg3;
        int var9 = arg0 + arg3;
        int var10 = arg5 - arg3;
        int var11 = arg6 + arg3;
        for (int var12 = arg6; var12 < var11; var12++) {
            class162.method1151(arg5, arg1, 12, arg0, class91.field1484[var12]);
        }
        for (int var13 = arg2; var13 > var8; var13--) {
            class162.method1151(arg5, arg1, arg4 ^ 0x2, arg0, class91.field1484[var13]);
        }
        if (arg4 != -1) {
            return;
        }
        for (int var14 = var11; var14 <= var8; var14++) {
            int[] var15 = class91.field1484[var14];
            class162.method1151(var9, arg1, 114, arg0, var15);
            class162.method1151(var10, arg7, 125, var9, var15);
            class162.method1151(arg5, arg1, arg4 - 119, var10, var15);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final void method1146(int arg0) {
        field2820++;
        if (arg0 != 26159) {
            field2823 = -120;
        }
        if (this.field2819 != null) {
            this.field2819.field2828 = this.field2828;
            this.field2828.field2819 = this.field2819;
            this.field2828 = null;
            this.field2819 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Z")
    public final boolean method1147(int arg0) {
        if (arg0 == -21483) {
            field2826++;
            return this.field2819 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
    public static void method1148(int arg0) {
        field2816 = null;
        field2821 = null;
        field2815 = null;
        field2825 = null;
        if (arg0 != 1) {
            method1145(35, -76, -112, -58, (byte) -32, -26, 41, 89);
        }
        field2824 = null;
        field2817 = null;
    }
}
