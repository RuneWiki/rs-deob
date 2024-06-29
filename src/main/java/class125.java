import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class125 extends class135 {

    @OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
    private int field1770 = 4096;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "Z")
    private boolean field1780 = true;

    @OriginalMember(owner = "client!mi", name = "Z", descriptor = "[I")
    public static int[] field1771 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
    public static int field1767 = 0;

    @OriginalMember(owner = "client!mi", name = "db", descriptor = "[I")
    public static int[] field1775 = new int[4096];

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "Lqj;")
    private static class196 field1781;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "Lqj;")
    public static class196 field1782;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!mi", name = "eb", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!mi", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field1769;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
    public static final void method771(int arg0, int arg1) {
        ++field1773;
        class182.method1193(arg0 + -29679);
        class10.method48(10610);
        int var2 = class210.method1458(124, arg1).field2583;
        if (arg0 != 29776) {
            method773(-20, 80, -99, 21, 79, -82);
        }
        if (var2 != 0) {
            int var3 = class215.field3873[arg1];
            if (~var2 == -7) {
                class198.field3519 = var3;
            }
            if (~var2 == -10) {
                class127.field1797 = var3;
            }
            if (~var2 == -6) {
                class226.field4049 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILhg;)V")
    public static final void method772(int arg0, class164 arg1) {
        ++field1776;
        for (class72 var2 = (class72) class223.field3995.method1651((byte) -97); var2 != null; var2 = (class72) class223.field3995.method1656(-35)) {
            if (var2.field1042 == arg1) {
                if (var2.field1019 != null) {
                    class161.field2589.method690(var2.field1019);
                    var2.field1019 = null;
                }
                var2.method797((byte) 120);
                return;
            }
        }
        if (arg0 >= -46) {
            field1769 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class246.method1678(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class25.method144(var6 + 1, class42.field480[arg0][arg1][arg3] + arg5, var7 + 1) && class25.method144(var6 + 128 - 1, class42.field480[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class25.method144(var6 + 128 - 1, class42.field480[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class25.method144(var6 + 1, class42.field480[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class51.field639[arg0][var8][var14] == -class102.field1480) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class42.field480[arg0][arg1][arg3] + arg5;
            if (!class25.method144(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class25.method144(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class25.method144(var9, var11, var13)) {
                        return false;
                    } else if (!class25.method144(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[[I")
    public final int[][] method164(int arg0, int arg1) {
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180) {
            int[] var4 = this.method819(-102, 0, class53.field667 & arg1 + -1);
            int[] var5 = this.method819(-122, 0, arg1);
            int[] var6 = this.method819(-123, 0, class53.field667 & arg1 - -1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; ~class131.field1862 < ~var10; ++var10) {
                int var11 = (var5[var10 - -1 & class61.field816] - var5[var10 - 1 & class61.field816]) * this.field1770;
                int var12 = (var6[var10] - var4[var10]) * this.field1770;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field1780) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var20;
                var8[var10] = var19;
            }
        }
        ++field1768;
        if (arg0 != 260028743) {
            field1781 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(III)V")
    public static final void method774(int arg0, int arg1, int arg2) {
        class126 var3 = class185.method1210(arg1, 65535);
        ++field1777;
        int var4 = var3.field1783;
        int var5 = var3.field1788;
        int var6 = var3.field1791;
        if (arg2 != -21418) {
            method775(107);
        }
        int var7 = class84.field1232[var6 - var4];
        if (~arg0 > -1 || ~var7 > ~arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class56.method321(-127, var8 & arg0 << var4 | class215.field3873[var5] & ~var8, var5);
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)V")
    public static void method775(int arg0) {
        field1775 = null;
        field1782 = null;
        field1781 = null;
        field1769 = null;
        if (arg0 == 0) {
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIII)V")
    public static final void method776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1774;
        int var5 = -arg0;
        if (arg2 != 29251) {
            field1775 = null;
        }
        int var6 = 0;
        int var7 = arg0;
        int var8 = -1;
        int var9 = class186.method1217(class188.field3296, class95.field1388, arg4 - -arg0, 18291);
        int var10 = class186.method1217(class188.field3296, class95.field1388, -arg0 + arg4, arg2 ^ 13616);
        class25.method147(arg1, 7, var10, class95.field1380[arg3], var9);
        while (~var6 > ~var7) {
            var8 += 2;
            var5 += var8;
            if (var5 > 0) {
                --var7;
                var5 -= var7 << 1;
                int var11 = -var7 + arg3;
                int var12 = arg3 + var7;
                if (~class93.field1361 >= ~var12 && ~class23.field291 <= ~var11) {
                    int var13 = class186.method1217(class188.field3296, class95.field1388, arg4 + var6, 18291);
                    int var14 = class186.method1217(class188.field3296, class95.field1388, -var6 + arg4, 18291);
                    if (~var12 >= ~class23.field291) {
                        class25.method147(arg1, 7, var14, class95.field1380[var12], var13);
                    }
                    if (class93.field1361 <= var11) {
                        class25.method147(arg1, 7, var14, class95.field1380[var11], var13);
                    }
                }
            }
            ++var6;
            int var15 = -var6 + arg3;
            int var16 = arg3 + var6;
            if (~var16 <= ~class93.field1361 && ~var15 >= ~class23.field291) {
                int var17 = class186.method1217(class188.field3296, class95.field1388, arg4 - -var7, arg2 ^ 13616);
                int var18 = class186.method1217(class188.field3296, class95.field1388, -var7 + arg4, 18291);
                if (~var16 >= ~class23.field291) {
                    class25.method147(arg1, 7, var18, class95.field1380[var16], var17);
                }
                if (var15 >= class93.field1361) {
                    class25.method147(arg1, arg2 ^ 29252, var18, class95.field1380[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        ++field1772;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1780 = ~arg0.method367(1) == -2;
            }
        } else {
            this.field1770 = arg0.method318(true);
        }
        if (arg2 != -16231) {
            field1771 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field1775[var0] = class126.method780(var0, -1832805012);
        }
        field1781 = class80.method502("Connection lost)3", -48);
        field1782 = field1781;
    }
}
