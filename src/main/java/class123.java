import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class123 extends class185 {

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "[I")
    public static int[] field1868 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "Lfg;")
    public static class12 field1863;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Lpf;")
    public static class294 field1861;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)V")
    public static final void method778(byte arg0, int arg1) {
        class187 var2 = class120.method762((byte) 74, 2, arg1);
        if (arg0 != 6) {
            method780(33, 38);
        }
        ++field1864;
        var2.method1162(1);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V")
    public static void method779(byte arg0) {
        if (arg0 <= 111) {
            method779((byte) 91);
        }
        field1863 = null;
        field1861 = null;
        field1868 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
    public static final void method780(int arg0, int arg1) {
        if (arg1 != 2) {
            method778((byte) 83, -43);
        }
        ++field1866;
        class250.field3799.method1780(arg0, true);
    }

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "(I)I")
    public static final int method781(int arg0) {
        ++field1865;
        if (arg0 != -26554) {
            method780(61, -97);
        }
        return 15;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field1860;
        if (arg1 <= 70) {
            field1859 = -3;
        }
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[] var4 = this.method1146((byte) 125, arg0, 0);
            for (int var5 = 0; var5 < class174.field2648; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg0 == 0) {
            super.field2814 = arg1.method1593((byte) 27) == 1;
        }
        ++field1869;
        if (arg2 != -6357) {
            this.method34(-101, -95);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
    public static final boolean method782(int arg0, int arg1, int arg2) {
        ++field1867;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class288 var3 = class274.method1816(121, arg2);
        int var4 = -68 / ((19 - arg0) / 52);
        return var3.method1901(arg1, -6871);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method39(boolean arg0, int arg1) {
        ++field1862;
        int[][] var3 = super.field2802.method753(1, arg1);
        if (super.field2802.field1807) {
            int[][] var4 = this.method1152(false, 0, arg1);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class174.field2648; ++var11) {
                var6[var11] = -var9[var11] + 4096;
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (!arg0) {
            method781(71);
        }
        return var3;
    }
}
