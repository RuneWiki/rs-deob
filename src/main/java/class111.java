import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class111 extends class110 {

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field1707 = -1;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "[[I")
    public static int[][] field1717 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "[I")
    public static int[] field1720 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    private int field1713;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "[I")
    private int[] field1714;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 4)
    public class111() {
        super(0, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILre;I)V", line = 10)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1707 = arg1.method1830((byte) -77);
        }
        if (arg2 >= -37) {
            this.field1714 = (int[]) null;
        }
        field1709++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Llm;ILlm;)I", line = 26)
    public static final int method772(class210 arg0, int arg1, class210 arg2) {
        field1708++;
        int var3 = 0;
        if (arg2.method1431(class164.field2481, -49)) {
            var3++;
        }
        if (arg2.method1431(class73.field954, -110)) {
            var3++;
        }
        if (arg2.method1431(class29.field395, -27)) {
            var3++;
        }
        if (arg0.method1431(class164.field2481, arg1 ^ 0xFFFFFFD8)) {
            var3++;
        }
        if (arg1 != 10) {
            return 23;
        }
        if (arg0.method1431(class73.field954, -111)) {
            var3++;
        }
        if (arg0.method1431(class29.field395, -98)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)[[I", line = 63)
    public final int[][] method445(int arg0, boolean arg1) {
        field1712++;
        int[][] var3 = this.field1701.method1477((byte) 70, arg0);
        if (arg1) {
            this.method445(76, true);
        }
        if (this.field1701.field3255 && this.method773(64)) {
            int var4 = this.field1713 * (class295.field4523 == this.field1710 ? arg0 : this.field1710 * arg0 / class295.field4523);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class124.field1936 == this.field1713) {
                for (int var11 = 0; var11 < class124.field1936; var11++) {
                    int var12 = this.field1714[var4++];
                    var6[var11] = class124.method893(var12 << 4, 4080);
                    var7[var11] = class124.method893(4080, var12 >> 4);
                    var5[var11] = class124.method893(var12, 16711680) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class124.field1936; var8++) {
                    int var9 = this.field1713 * var8 / class124.field1936;
                    int var10 = this.field1714[var4 + var9];
                    var6[var8] = class124.method893(var10, 255) << 4;
                    var7[var8] = class124.method893(4080, var10 >> 4);
                    var5[var8] = class124.method893(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "(I)Z", line = 135)
    private final boolean method773(int arg0) {
        if (arg0 != 64) {
            this.method768(72);
        }
        field1715++;
        if (this.field1714 != null) {
            return true;
        } else if (this.field1707 < 0) {
            return false;
        } else {
            int var2 = class124.field1936;
            int var3 = class295.field4523;
            int var4 = class126.field1971.method734(0, this.field1707) ? 64 : 128;
            this.field1714 = class126.field1971.method738(false, this.field1707);
            this.field1713 = var4;
            this.field1710 = var4;
            class257.method1741(var3, 31497, var2);
            return this.field1714 != null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)I", line = 166)
    public final int method767(int arg0) {
        if (arg0 != 0) {
            this.method445(-92, true);
        }
        field1718++;
        return this.field1707;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(CI)Z", line = 177)
    public static final boolean method774(char arg0, int arg1) {
        field1721++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 != -3110) {
                field1716 = -62;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V", line = 203)
    public final void method768(int arg0) {
        super.method768(arg0);
        this.field1714 = null;
        field1711++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 219)
    public static void method775(boolean arg0) {
        field1720 = null;
        field1717 = (int[][]) null;
        if (arg0) {
            method774('\u0010', -110);
        }
    }
}
