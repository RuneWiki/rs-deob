import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class98 {

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    private int field1750 = -1;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    private int field1748 = 0;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lhi;")
    private class282 field1757 = new class282();

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "Z")
    public boolean field1760 = false;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    private int field1744;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[[I")
    private int[][] field1746;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    private int field1751;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[Lpg;")
    private class194[] field1752;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Lqd;")
    private static class40 field1741 = class147.method1106("Choose Option", (byte) -92);

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lqd;")
    public static class40 field1747 = class147.method1106("(Y<)4col>", (byte) -84);

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lqd;")
    public static class40 field1756 = field1741;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field1755 = 0;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "S")
    public static short field1758 = 205;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[Lda;")
    public static class114[] field1745;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)[I", line = 6)
    public final int[] method724(byte arg0, int arg1) {
        field1742++;
        int var3 = 60 % ((25 - arg0) / 36);
        if (this.field1751 == this.field1744) {
            this.field1760 = this.field1752[arg1] == null;
            this.field1752[arg1] = class12.field192;
            return this.field1746[arg1];
        } else if (this.field1744 == 1) {
            this.field1760 = this.field1750 != arg1;
            this.field1750 = arg1;
            return this.field1746[0];
        } else {
            class194 var4 = this.field1752[arg1];
            if (var4 == null) {
                this.field1760 = true;
                if (this.field1744 <= this.field1748) {
                    class194 var5 = (class194) this.field1757.method1970((byte) 98);
                    var4 = new class194(arg1, var5.field3124);
                    this.field1752[var5.field3120] = null;
                    var5.method2095(0);
                } else {
                    var4 = new class194(arg1, this.field1748);
                    this.field1748++;
                }
                this.field1752[arg1] = var4;
            } else {
                this.field1760 = false;
            }
            this.field1757.method1973(var4, (byte) -55);
            return this.field1746[var4.field3124];
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 79)
    public static void method725(int arg0) {
        field1741 = null;
        field1745 = null;
        field1756 = null;
        if (arg0 == 64) {
            field1747 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I", line = 105)
    public static final int method726(int arg0, int arg1, int arg2, int arg3) {
        field1743++;
        if (arg0 != 128) {
            method728(72, -105, 80, -69, (class196) null, (class196) null, -101, 31, -1, -106, -120L);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)[[I", line = 128)
    public final int[][] method727(boolean arg0) {
        field1754++;
        if (this.field1751 != this.field1744) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1744; var2++) {
            this.field1752[var2] = class12.field192;
        }
        if (arg0) {
            method730(-111, (int[][]) ((int[][]) null));
        }
        return this.field1746;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILbg;Lbg;IIIIJ)V", line = 148)
    public static final void method728(int arg0, int arg1, int arg2, int arg3, class196 arg4, class196 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class20 var12 = new class20();
        var12.field338 = arg10;
        var12.field346 = arg1 * 128 + 64;
        var12.field332 = arg2 * 128 + 64;
        var12.field330 = arg3;
        var12.field343 = arg4;
        var12.field335 = arg5;
        var12.field337 = arg6;
        var12.field344 = arg7;
        var12.field342 = arg8;
        var12.field333 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class93.field1690[var13][arg1][arg2] == null) {
                class93.field1690[var13][arg1][arg2] = new class14(var13, arg1, arg2);
            }
        }
        class93.field1690[arg0][arg1][arg2].field225 = var12;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 182)
    public final void method729(int arg0) {
        for (int var2 = arg0; var2 < this.field1744; var2++) {
            this.field1746[var2] = null;
        }
        this.field1752 = null;
        field1759++;
        this.field1746 = (int[][]) null;
        this.field1757.method1966((byte) 125);
        this.field1757 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[[I)V", line = 198)
    public static final void method730(int arg0, int[][] arg1) {
        field1740++;
        if (arg0 == 12731) {
            class37.field694 = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(III)V", line = 253)
    public class98(int arg0, int arg1, int arg2) {
        this.field1744 = arg0;
        this.field1746 = new int[this.field1744][arg2];
        this.field1751 = arg1;
        this.field1752 = new class194[this.field1751];
    }
}
