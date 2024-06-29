import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class116 extends class162 {

    @OriginalMember(owner = "client!hj", name = "Hb", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!hj", name = "Lb", descriptor = "[I")
    public static int[] field1865 = new int[] { 0, 0, -2, 0, 0, 0, 0, 0, 0, 8, 0, 4, 2, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 4, 0, 0, 0, 1, 7, -2, 0, 8, 0, 0, 3, 0, -2, 0, 6, 0, -1, 2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 3, 0, 0, 0, 0, 3, 1, -1, 0, 10, 1, 7, 0, 10, 5, 2, 0, 0, 0, -1, 0, 0, 6, -1, 0, 0, 0, -1, 14, 6, 0, 8, 2, 8, 12, 0, 2, 0, 0, -1, 5, -1, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, -2, 0, 0, 12, 0, 0, 0, 0, 4, 3, 0, -2, 0, 0, 6, 6, 0, 0, 0, 0, 0, 10, 11, 0, 0, 0, 0, 7, 0, 20, 0, 0, 3, 0, -1, 0, 0, 0, 3, 0, 15, 0, 3, 0, 0, 0, 0, 0, 14, 2, 0, 0, 0, 12, 0, -1, 0, 0, 10, 0, 0, 0, -2, 0, 6, 0, 6, 0, 0, -2, 0, 0, 0, -1, 0, 0, 17, 9, -2, 5, 8, 0, 6, 0, -2, 8, 3, 6, -2, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 1, 0, -1, 0, 5, 0, 0, 0, 0, 0, 0, 8, 0, 7, 0, 0, 28, 0, 0, -1, 0, -2, -2, 15, 8, -1, 0, 0, 4, 0, 0, 0, 0, 0, 8, -1, 0, 3, 0, 12, 0, 0, 12, 2 };

    @OriginalMember(owner = "client!hj", name = "Gb", descriptor = "Z")
    public static boolean field1860 = false;

    @OriginalMember(owner = "client!hj", name = "Nb", descriptor = "Ljava/lang/String;")
    public static String field1867 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!hj", name = "Eb", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!hj", name = "Fb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!hj", name = "Jb", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!hj", name = "Kb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!hj", name = "Mb", descriptor = "I")
    private int field1866;

    @OriginalMember(owner = "client!hj", name = "Ob", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!hj", name = "Pb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!hj", name = "Qb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!hj", name = "Rb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!hj", name = "Sb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!hj", name = "Tb", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!hj", name = "Ub", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!hj", name = "Ib", descriptor = "Lme;")
    private class40 field1862;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII[B)V")
    public final void method821(byte arg0, int arg1, int arg2, byte[] arg3) {
        int var5 = -92 % ((arg0 - -3) / 44);
        for (int var6 = 0; var6 < arg1; ++var6) {
            arg3[arg2 + var6] = (byte) (super.field2573[super.field2568++] + -this.field1862.method265(0));
        }
        ++field1871;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IB)V")
    public final void method822(int[] arg0, byte arg1) {
        ++field1873;
        this.field1862 = new class40(arg0);
        if (arg1 != 107) {
            this.method825(51);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(Z)V")
    public final void method823(boolean arg0) {
        if (arg0) {
            this.method828(38, -5);
        }
        this.field1866 = super.field2568 * 8;
        ++field1874;
    }

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "(II)I")
    public final int method824(int arg0, int arg1) {
        ++field1869;
        return arg0 != 0 ? -101 : arg1 * 8 - this.field1866;
    }

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "(I)V")
    public final void method825(int arg0) {
        super.field2568 = (this.field1866 - -7) / 8;
        ++field1872;
        int var2 = 98 % ((arg0 - 41) / 39);
    }

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "(B)I")
    public final int method826(byte arg0) {
        int var2 = -99 / ((-23 - arg0) / 41);
        ++field1864;
        return super.field2573[super.field2568++] - this.field1862.method265(0) & 255;
    }

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "(I)V")
    public static void method827(int arg0) {
        if (arg0 <= 9) {
            method830(72, -94, (class251) null, 125, true, -120, 54);
        }
        field1867 = null;
        field1865 = null;
    }

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "(II)V")
    public final void method828(int arg0, int arg1) {
        ++field1870;
        if (arg0 > 100) {
            super.field2573[super.field2568++] = (byte) (arg1 + this.field1862.method265(0));
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V")
    public class116(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "(I)V")
    public static final void method829(int arg0) {
        class175.method1283(5, (byte) 79);
        class180.method1310(1005, 5);
        ++field1858;
        class22.method126(-2, 5);
        class119.method841(-3016, 5);
        class62.method424(5, 112);
        class214.method1489(5, false);
        class73.method496(5, -116);
        class146.method1018(-122, 5);
        class156.method1066((byte) -42, 5);
        class53.method367(0, 5);
        class268.method1798(3, 5);
        class307.method2056(5, 13);
        class34.method224(5, -3);
        class119.method843(5, (byte) 59);
        class11.method58(5, 18891);
        class272.method1823((byte) -89, 5);
        class177.method1294(5, (byte) 120);
        class250.method1661(5, -25385);
        class96.method664(50, 2);
        class204.method1427(14, 5);
        class12.method60(5, (byte) 113);
        class189.field3059.method1262(5, 2736);
        class119.field1904.method1262(5, 2736);
        class75.field1245.method1262(5, 2736);
        if (arg0 <= 45) {
            field1865 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILdk;IZII)V")
    public static final void method830(int arg0, int arg1, class251 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class62.field1026 = arg2;
        if (arg5 != 270) {
            field1865 = null;
        }
        class22.field272 = 1;
        class33.field509 = arg4;
        class293.field4691 = arg0;
        class237.field3810 = arg6;
        class236.field3800 = arg1;
        ++field1863;
        class129.field2023 = arg3;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(IZ)I")
    public final int method831(int arg0, boolean arg1) {
        int var3 = this.field1866 >> 3;
        ++field1859;
        int var4 = 0;
        int var5 = -(this.field1866 & 7) + 8;
        this.field1866 += arg0;
        while (~arg0 < ~var5) {
            var4 += (super.field2573[var3++] & class303.field4840[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (~arg0 != ~var5) {
            var6 = (super.field2573[var3] >> -arg0 + var5 & class303.field4840[arg0]) + var4;
        } else {
            var6 = (class303.field4840[var5] & super.field2573[var3]) + var4;
        }
        return !arg1 ? 118 : var6;
    }
}
