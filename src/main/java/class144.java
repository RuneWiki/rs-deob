import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class144 extends class105 {

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
    private int field2834 = 2048;

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
    private int field2833 = 0;

    @OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
    private int field2838 = 10;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "Leh;")
    public static class47 field2827 = class195.method1282((byte) -4, "hitmarks");

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "Leh;")
    public static class47 field2824 = class195.method1282((byte) -4, " loggt sich aus)3");

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "Leh;")
    public static class47 field2822 = class195.method1282((byte) -4, " x ");

    @OriginalMember(owner = "client!q", name = "db", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "Leh;")
    public static class47 field2835 = class195.method1282((byte) -4, "<br>(X");

    @OriginalMember(owner = "client!q", name = "nb", descriptor = "[I")
    public static int[] field2836 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!q", name = "ob", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!q", name = "qb", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "[I")
    private int[] field2821;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "[I")
    private int[] field2825;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            this.field2825 = null;
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2833 = arg1.method604((byte) -127);
                }
            } else {
                this.field2834 = arg1.method569(26496);
            }
        } else {
            this.field2838 = arg1.method604((byte) -29);
        }
        ++field2823;
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(I)V")
    private final void method1025(int arg0) {
        this.field2825 = new int[this.field2838 + 1];
        ++field2839;
        this.field2821 = new int[this.field2838 - -1];
        int var2 = 0;
        int var3 = 4096 / this.field2838;
        int var4 = this.field2834 * var3 >> 12;
        if (arg0 == -7411) {
            for (int var5 = 0; var5 < this.field2838; ++var5) {
                this.field2825[var5] = var2;
                this.field2821[var5] = var2 - -var4;
                var2 += var3;
            }
            this.field2825[this.field2838] = 4096;
            this.field2821[this.field2838] = this.field2821[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILgf;Lfb;)V")
    public static final void method1026(int arg0, int arg1, int arg2, int arg3, int arg4, class61 arg5, class50 arg6) {
        ++field2837;
        if (arg2 == 18487) {
            int var7 = arg1 * arg1 - -(arg0 * arg0);
            int var8 = Math.min(arg5.field1187 / 2, arg5.field1303 / 2) - 20;
            if (~var7 < ~(var8 * var8) && var7 < 90000) {
                int var9 = class195.field3793 + class160.field3116 & 2047;
                int var10 = class17.field350[var9];
                int var11 = class17.field341[var9];
                int var12 = var10 * 256 / (class60.field1167 + 256);
                int var13 = var11 * 256 / (class60.field1167 + 256);
                int var14 = arg0 * var12 - arg1 * var13 >> 16;
                int var15 = arg0 * var13 + arg1 * var12 >> 16;
                double var16 = Math.atan2((double) var15, (double) var14);
                int var18 = (int) (Math.sin(var16) * (double) var8);
                int var19 = (int) (Math.cos(var16) * (double) var8);
                class202.field3925.method437(arg3 - 10 + arg5.field1187 / 2 + var18 + 4, arg5.field1303 / 2 + -var19 + arg4 + -20, 20, 20, 15, 15, var16, 256);
            } else {
                class140.method1014(50, arg5, arg0, arg4, arg6, arg3, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        ++field2829;
        this.method1025(-7411);
        if (arg0 != -1) {
            method1029(114);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field2830;
        int[] var3 = super.field2192.method336(-91, arg0);
        if (arg1 < 78) {
            return null;
        } else {
            if (super.field2192.field770) {
                int var4 = class26.field500[arg0];
                if (this.field2833 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; ~var6 > ~this.field2838; ++var6) {
                        if (var4 >= this.field2825[var6] && var4 < this.field2825[var6 + 1]) {
                            if (this.field2821[var6] > var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class128.method959(var3, 0, class149.field2928, var5);
                } else {
                    for (int var7 = 0; class149.field2928 > var7; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class167.field3237[var7];
                        int var11 = this.field2833;
                        if (var11 != 1) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (-4096 - (-var4 - var10) >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; this.field2838 > var12; ++var12) {
                            if (~var8 <= ~this.field2825[var12] && var8 < this.field2825[var12 + 1]) {
                                if (~var8 > ~this.field2821[var12]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILkb;IJIIII)Z")
    public static final boolean method1027(int arg0, int arg1, int arg2, int arg3, class92 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class106.method864(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "g", descriptor = "(I)Log;")
    public static final class133 method1028(int arg0) {
        ++field2831;
        if (arg0 != 20481) {
            return null;
        } else {
            if (class161.field3145 == null) {
                class161.field3145 = new class133();
            }
            return class161.field3145;
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static void method1029(int arg0) {
        field2835 = null;
        field2827 = null;
        field2822 = null;
        field2836 = null;
        if (arg0 != 1) {
            method1026(111, 101, -53, 67, -102, (class61) null, (class50) null);
        }
        field2824 = null;
    }
}
