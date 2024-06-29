import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class131 extends class105 {

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    private int field2586 = 585;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Leh;")
    public static class47 field2589 = class195.method1282((byte) -4, "");

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "Leh;")
    public static class47 field2588 = class195.method1282((byte) -4, " (X");

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "Leh;")
    public static class47 field2597 = class195.method1282((byte) -4, ":assistreq:");

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "Leh;")
    private static class47 field2594 = class195.method1282((byte) -4, "Please enter your username)3");

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "Leh;")
    public static class47 field2585 = field2594;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "[I")
    public static int[] field2600;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZZ)I")
    public static final int method966(int arg0, boolean arg1, boolean arg2) {
        ++field2591;
        int var3 = arg0;
        if (arg2) {
            var3 = class85.field1796 + class72.field1554 + arg0;
        }
        if (arg1) {
            var3 += class86.field1812 + class151.field2960;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(BLgf;)Z")
    public static final boolean method967(byte arg0, class61 arg1) {
        int var2 = 27 % ((-14 - arg0) / 40);
        ++field2598;
        if (arg1.field1246 == null) {
            return false;
        } else {
            for (int var3 = 0; arg1.field1246.length > var3; ++var3) {
                int var4 = class77.method670(var3, arg1, true);
                int var5 = arg1.field1218[var3];
                if (~arg1.field1246[var3] == -3) {
                    if (~var5 >= ~var4) {
                        return false;
                    }
                } else if (~arg1.field1246[var3] == -4) {
                    if (~var5 <= ~var4) {
                        return false;
                    }
                } else if (~arg1.field1246[var3] != -5) {
                    if (var4 != var5) {
                        return false;
                    }
                } else if (var4 == var5) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        ++field2595;
        if (arg2 == -256) {
            if (~arg0 == -1) {
                this.field2586 = arg1.method569(arg2 ^ -26496);
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILwd;III)V")
    public static final void method968(int arg0, int arg1, class202 arg2, int arg3, int arg4, int arg5) {
        ++field2590;
        class146 var6 = new class146();
        var6.field2846 = arg3 * 128;
        if (arg0 != 2048) {
            method967((byte) -68, (class61) null);
        }
        var6.field2851 = arg1 * 128;
        var6.field2861 = arg2.field3984;
        var6.field2842 = arg2.field3958;
        int var7 = arg2.field3949;
        var6.field2875 = arg2.field3977;
        int var8 = arg2.field3980;
        if (arg4 == 1 || arg4 == 3) {
            var8 = arg2.field3949;
            var7 = arg2.field3980;
        }
        var6.field2870 = (arg3 - -var8) * 128;
        var6.field2858 = arg2.field3947 * 128;
        var6.field2848 = arg5;
        var6.field2866 = (arg1 + var7) * 128;
        var6.field2872 = arg2.field3936;
        if (arg2.field3945 != null) {
            var6.field2849 = arg2;
            var6.method1030(arg0 + -1984);
        }
        class124.field2501.method337(var6, (byte) -22);
        if (var6.field2875 != null) {
            var6.field2868 = var6.field2872 - -((int) ((double) (-var6.field2872 + var6.field2842) * Math.random()));
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        if (arg1 <= 78) {
            method968(-12, 37, (class202) null, 27, -91, -56);
        }
        ++field2593;
        int[] var3 = super.field2192.method336(-74, arg0);
        if (super.field2192.field770) {
            int var4 = class26.field500[arg0];
            for (int var5 = 0; class149.field2928 > var5; ++var5) {
                int var6 = class167.field3237[var5];
                if (this.field2586 < var6 && ~(-this.field2586 + 4096) < ~var6 && ~(2048 - this.field2586) > ~var4 && var4 < this.field2586 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2586 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field2586 + 2048 && ~var6 > ~(this.field2586 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2586;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field2586);
                } else if (this.field2586 <= var4 && var4 <= -this.field2586 + 4096) {
                    if (~var6 <= ~this.field2586 && ~var6 >= ~(-this.field2586 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2586 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field2586;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2586);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "(I)V")
    public static void method969(int arg0) {
        field2588 = null;
        field2600 = null;
        field2585 = null;
        field2594 = null;
        field2597 = null;
        field2589 = null;
        if (arg0 != 12) {
            field2592 = 102;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBI)I")
    public static final int method970(int arg0, int arg1, byte arg2, int arg3) {
        ++field2596;
        if (arg2 > -33) {
            field2594 = null;
        }
        return (-arg3 + 4096) * arg1 - -(arg0 * arg3) >> 12;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class131() {
        super(0, true);
    }
}
