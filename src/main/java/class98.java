import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class98 extends class64 {

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    private int field1827 = 4096;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    private int field1834 = 4096;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    private int field1829 = 4096;

    @OriginalMember(owner = "client!kh", name = "pb", descriptor = "I")
    private int field1840 = 409;

    @OriginalMember(owner = "client!kh", name = "mb", descriptor = "[I")
    private int[] field1837 = new int[3];

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "Lsg;")
    private static class169 field1828 = class165.method1060("Error loading your profile)3", 1536);

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lsg;")
    public static class169 field1832 = class165.method1060(" )2> <col=ffffff>", 1536);

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Lsg;")
    private static class169 field1826 = class165.method1060("Please check your message)2centre for details)3", 1536);

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
    public static int field1831 = 0;

    @OriginalMember(owner = "client!kh", name = "tb", descriptor = "Lsg;")
    public static class169 field1844 = field1828;

    @OriginalMember(owner = "client!kh", name = "sb", descriptor = "Lsg;")
    public static class169 field1843 = class165.method1060("::qa_op_test", 1536);

    @OriginalMember(owner = "client!kh", name = "ub", descriptor = "[I")
    public static int[] field1845 = new int[2000];

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "Lsg;")
    public static class169 field1835 = field1826;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!kh", name = "lb", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kh", name = "nb", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kh", name = "rb", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!kh", name = "vb", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "Lsh;")
    public static class170 field1830;

    @OriginalMember(owner = "client!kh", name = "ob", descriptor = "Lhg;")
    public static class71 field1839;

    @OriginalMember(owner = "client!kh", name = "qb", descriptor = "[Lgd;")
    public static class59[] field1841;

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class98() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method584(int arg0, int arg1) {
        class81.field1494 = arg0;
        class65.field1222 = 0;
        class46.field860 = -1;
        class137.field2559 = false;
        class3.field71 = null;
        ++field1842;
        class201.field3927 = 1;
        class115.field2133 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        if (arg0 != -40) {
            field1845 = null;
        }
        int[][] var3 = super.field1195.method177(arg0 + 1233, arg1);
        ++field1833;
        if (super.field1195.field532) {
            int[][] var4 = this.method402(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class147.field2715; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field1837[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1840) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field1837[1];
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field1840) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field1837[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field1840) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field1834 * var12 >> 12;
                            var9[var11] = this.field1827 * var14 >> 12;
                            var10[var11] = this.field1829 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLke;ZLke;)V")
    public static final void method585(byte arg0, class95 arg1, boolean arg2, class95 arg3) {
        class68.field1279 = arg3;
        ++field1836;
        if (arg0 <= -26) {
            class134.field2516 = arg1;
            class4.field86 = arg2;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field1838;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg1.method773((byte) -126);
                            this.field1837[0] = class150.method984(var5, 16711680) << 4;
                            this.field1837[1] = class150.method984(var5, 65280) >> 4;
                            this.field1837[2] = class150.method984(var5, 255) >> 12;
                        }
                    } else {
                        this.field1834 = arg1.method785(true);
                    }
                } else {
                    this.field1827 = arg1.method785(true);
                }
            } else {
                this.field1829 = arg1.method785(true);
            }
        } else {
            this.field1840 = arg1.method785(true);
        }
        int var6 = -84 % ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1841 = null;
        field1830 = null;
        field1839 = null;
        field1843 = null;
        field1845 = null;
        field1828 = null;
        field1844 = null;
        field1826 = null;
        int var1 = -57 / ((arg0 - 76) / 40);
        field1835 = null;
        field1832 = null;
    }
}
