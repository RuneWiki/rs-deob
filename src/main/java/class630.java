import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class630 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    private int[] field9184;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[[I")
    public static int[][] field9186 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field9188 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "S")
    public static short field9187 = 320;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9182;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9185;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lov;")
    public static class346 field9183;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method3643(byte arg0) {
        int var1 = 16 / ((arg0 - 17) / 38);
        field9183 = null;
        field9186 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
    public static final boolean method3644(int arg0, int arg1) {
        if (arg0 != 8) {
            method3643((byte) 19);
        }
        field9185++;
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3645(boolean arg0, int arg1) {
        field9189++;
        if (!arg0) {
            return true;
        } else if (arg1 == 57 || arg1 == 58 || arg1 == 11 || arg1 == 17 || arg1 == 49) {
            return true;
        } else {
            return arg1 == 10 || arg1 == 1004;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    public final int method3646(int arg0, int arg1) {
        field9182++;
        int var3 = (this.field9184.length >> 1) - 1;
        int var4 = var3 & arg0;
        if (arg1 != 599786657) {
            method3643((byte) 81);
        }
        while (true) {
            int var5 = this.field9184[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9184[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "([I)V")
    public class630(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field9184 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field9184[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field9184[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field9184[var5 + var5] = arg0[var4];
            this.field9184[var5 + var5 + 1] = var4++;
        }
    }
}
