import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class210 extends class272 {

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field3828 = 1;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private int field3824 = 1;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field3831 = 204;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Lli;")
    private static class185 field3825 = class245.method1649("Please wait )2 attempting to reestablish)3", 123);

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "[[I")
    public static int[][] field3830 = new int[104][104];

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "Lli;")
    public static class185 field3838 = field3825;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "Lli;")
    public static class185 field3836 = class245.method1649("Bitte warten Sie)3)3)3", 125);

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "Lli;")
    public static class185 field3832 = class245.method1649("logo", 123);

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Lli;")
    public static class185 field3834 = class245.method1649("(U5", 123);

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "[Lli;")
    public static class185[] field3826;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class210() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLgb;)V")
    public static final void method1477(byte arg0, class142 arg1) {
        ++field3837;
        int var2 = -class211.field3851 + arg1.field2702;
        if (arg0 > 23) {
            int var3 = arg1.field2708 * 128 + arg1.method1014(-1) * 64;
            int var4 = arg1.field2685 * 128 + arg1.method1014(-1) * 64;
            arg1.field2687 += (-arg1.field2687 + var4) / var2;
            arg1.field2694 += (-arg1.field2694 + var3) / var2;
            if (arg1.field2706 == 0) {
                arg1.field2683 = 1024;
            }
            arg1.field2677 = 0;
            if (arg1.field2706 == 1) {
                arg1.field2683 = 1536;
            }
            if (arg1.field2706 == 2) {
                arg1.field2683 = 0;
            }
            if (~arg1.field2706 == -4) {
                arg1.field2683 = 512;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field3829;
        int var4 = -95 % ((-21 - arg1) / 55);
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3831 = arg0.method827(255);
                }
            } else {
                this.field3824 = arg0.method867(false);
            }
        } else {
            this.field3828 = arg0.method867(false);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lli;")
    public static final class185 method1478(int arg0, int arg1) {
        ++field3827;
        if (arg0 < 100000) {
            return class87.method567(arg1 ^ 11038, new class185[] { class54.field932, class90.method591(arg0, 0), class273.field4850 });
        } else if (arg0 < 10000000) {
            return class87.method567(arg1 ^ 11038, new class185[] { class182.field3356, class90.method591(arg0 / 1000, 0), class278.field4946, class273.field4850 });
        } else {
            if (arg1 != -1) {
                method1477((byte) -46, (class142) null);
            }
            return class87.method567(-11039, new class185[] { class5.field129, class90.method591(arg0 / 1000000, ~arg1), class205.field3765, class273.field4850 });
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3833;
        if (arg1 != 4421) {
            method1480((byte) -31, 69, (class82) null, 20, -58);
        }
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            for (int var4 = 0; var4 < class246.field4385; ++var4) {
                int var5 = class38.field598[var4];
                int var6 = this.field3828 * var5 >> 12;
                int var7 = class232.field4177[arg0];
                int var8 = this.field3824 * var7 >> 12;
                int var9 = var7 % (4096 / this.field3824) * this.field3824;
                int var10 = var5 % (4096 / this.field3828) * this.field3828;
                if (~this.field3831 < ~var9) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field3831) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var10 < this.field3831) {
                    int var11;
                    for (var11 = var6 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
    public static void method1479(int arg0) {
        field3836 = null;
        field3830 = null;
        field3832 = null;
        field3825 = null;
        field3834 = null;
        field3838 = null;
        field3826 = null;
        if (arg0 != 0) {
            field3830 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILp;II)V")
    public static final void method1480(byte arg0, int arg1, class82 arg2, int arg3, int arg4) {
        if (~class256.field4531 <= -4) {
            class159.method1129(arg3, arg1, 0, arg2.field1621, arg2.field1609);
        } else {
            ((class101) class6.field142).method703(arg3, arg1, arg2.field1505, arg2.field1498, class6.field142.field3854 / 2, class6.field142.field3853 / 2, class92.field1765, 256, arg2.field1621, arg2.field1609);
        }
        ++field3835;
        if (arg0 <= 39) {
            method1479(-9);
        }
        class274.field4855[arg4] = true;
    }
}
