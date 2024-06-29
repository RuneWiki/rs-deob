import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class155 extends class10 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    private final int field2828;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    private final int field2831;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    private final int field2824;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private final int field2825;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[I")
    public static int[] field2827 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lsb;")
    private static class98 field2832 = class47.method368("flash1:", 0);

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field2842 = 0;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lsb;")
    public static class98 field2837 = field2832;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "Lsb;")
    public static class98 field2841 = field2832;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[Lok;")
    public static class86[] field2826;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLsb;)V")
    public static final void method1124(byte arg0, class98 arg1) {
        if (arg0 != 125) {
            method1128(12, 113);
        }
        class95.method688(73);
        class103.method796(false, arg1);
        ++field2840;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Lsb;")
    public static final class98 method1125(int arg0, int arg1) {
        ++field2838;
        int var2 = 18 % ((arg1 - 60) / 38);
        return ~arg0 > -1000000000 ? class125.method930(25904, arg0) : class206.field3520;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZI)V")
    public final void method101(int arg0, boolean arg1, int arg2) {
        ++field2830;
        if (!arg1) {
            field2842 = -54;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lac;Lmi;II)V")
    public static final void method1126(class188 arg0, class171 arg1, int arg2, int arg3) {
        ++field2835;
        byte[] var4 = null;
        class48 var5 = class239.field4123;
        synchronized (class239.field4123) {
            class99 var6 = (class99) class239.field4123.method371((byte) 61);
            while (true) {
                if (var6 != null) {
                    if ((long) arg2 != var6.field4061 || var6.field1748 != arg1 || ~var6.field1743 != -1) {
                        var6 = (class99) class239.field4123.method370(true);
                        continue;
                    }
                    var4 = var6.field1739;
                }
                if (arg3 != 255) {
                    field2841 = null;
                }
                break;
            }
        }
        if (var4 != null) {
            arg0.method1296(true, var4, arg2, true, arg1);
        } else {
            byte[] var7 = arg1.method1211(arg2, (byte) -120);
            arg0.method1296(true, var7, arg2, true, arg1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(IZI)V")
    public final void method102(int arg0, boolean arg1, int arg2) {
        ++field2836;
        int var4 = this.field2828 * arg0 >> 12;
        if (!arg1) {
            int var5 = this.field2825 * arg0 >> 12;
            int var6 = this.field2831 * arg2 >> 12;
            int var7 = this.field2824 * arg2 >> 12;
            class208.method1401((byte) 127, var4, super.field211, var6, super.field216, super.field213, var5, var7);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1127(int arg0) {
        field2832 = null;
        field2827 = null;
        if (arg0 != 0) {
            method1125(5, 94);
        }
        field2837 = null;
        field2826 = null;
        field2841 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIII)V")
    public class155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2828 = arg0;
        this.field2831 = arg1;
        this.field2824 = arg3;
        this.field2825 = arg2;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(II)I")
    public static final int method1128(int arg0, int arg1) {
        if (arg1 != -100) {
            return 94;
        } else {
            ++field2829;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method1129((byte) 45);
        }
        int var4 = this.field2828 * arg0 >> 12;
        int var5 = this.field2825 * arg0 >> 12;
        ++field2833;
        int var6 = this.field2831 * arg1 >> 12;
        int var7 = this.field2824 * arg1 >> 12;
        class170.method1205(var6, var7, var4, super.field216, (byte) -57, var5);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        ++field2839;
        for (int var1 = 0; var1 < class105.field1866; ++var1) {
            int var10002 = class211.field3617[var1]--;
            if (~class211.field3617[var1] <= 9) {
                class213 var3 = class75.field1320[var1];
                if (var3 == null) {
                    var3 = class213.method1423(class8.field156, class181.field3120[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class211.field3617[var1] += var3.method1424();
                    class75.field1320[var1] = var3;
                }
                if (class211.field3617[var1] < 0) {
                    int var4;
                    if (~class148.field2706[var1] == -1) {
                        var4 = class37.field627;
                    } else {
                        int var5 = (class148.field2706[var1] & 16770253) >> 16;
                        int var6 = (class148.field2706[var1] & 255) * 128;
                        int var7 = var5 * 128 + -class163.field2943.field4492 - -64;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = (65311 & class148.field2706[var1]) >> 8;
                        int var9 = var8 * 128 + -class163.field2943.field4466 + 64;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 - -var9 - 128;
                        if (~var10 < ~var6) {
                            class211.field3617[var1] = -100;
                            continue;
                        }
                        if (~var10 > -1) {
                            var10 = 0;
                        }
                        var4 = (-var10 + var6) * class90.field1585 / var6;
                    }
                    if (var4 > 0) {
                        class89 var11 = var3.method1426().method659(class101.field1794);
                        class19 var12 = class19.method214(var11, 100, var4);
                        var12.method193(class226.field3898[var1] + -1);
                        class36.field606.method1215(var12);
                    }
                    class211.field3617[var1] = -100;
                }
            } else {
                --class105.field1866;
                for (int var2 = var1; ~var2 > ~class105.field1866; ++var2) {
                    class181.field3120[var2] = class181.field3120[var2 + 1];
                    class75.field1320[var2] = class75.field1320[var2 + 1];
                    class226.field3898[var2] = class226.field3898[var2 + 1];
                    class211.field3617[var2] = class211.field3617[var2 + 1];
                    class148.field2706[var2] = class148.field2706[var2 - -1];
                }
                --var1;
            }
        }
        if (class187.field3229 && !class181.method1246(true)) {
            if (class167.field2978 != 0 && class143.field2527 != -1) {
                class190.method1308((byte) 123, 0, false, class167.field2978, class143.field2525, class143.field2527);
            }
            class187.field3229 = false;
        } else if (~class167.field2978 != -1 && ~class143.field2527 != 0 && !class181.method1246(true)) {
            ++class130.field2317;
            class237.field4084.method490(158, -109);
            class237.field4084.method1456(class143.field2527, -23438);
            class143.field2527 = -1;
        }
        if (arg0 <= 51) {
            method1126((class188) null, (class171) null, -83, -48);
        }
    }
}
