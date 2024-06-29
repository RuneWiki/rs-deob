import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class59 extends class117 {

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    private int field972 = 585;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "Lhh;")
    public static class163 field970 = class137.method1065("leuchten3:", 17);

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
    public static int field974 = 0;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "Lhh;")
    private static class163 field981 = class137.method1065("flash2:", 17);

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "Lhh;")
    public static class163 field979 = field981;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "Lhh;")
    public static class163 field966 = field981;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Lpa;")
    public static class123 field965;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lv;")
    public static class22 field969;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "Lid;")
    public static class62 field973;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field980;
        if (arg0 == 0) {
            if (~arg1 == -1) {
                this.field972 = arg2.method658(-120);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZ)V")
    public static final void method408(boolean arg0, boolean arg1) {
        byte[][] var2 = class219.field3984;
        ++field967;
        int var3 = class160.field2943.length;
        if (!arg1) {
            field973 = null;
        }
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class199.field3572[var4] >> 8) * 64 + -class62.field1035;
                int var7 = (255 & class199.field3572[var4]) * 64 - class257.field4500;
                class229.method1593(-128);
                class29.method179(var6, var7, (byte) -53, var5, class140.field2670, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        if (arg0 != -21393) {
            field976 = 26;
        }
        ++field977;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1];
            for (int var5 = 0; class143.field2702 > var5; ++var5) {
                int var6 = class26.field402[var5];
                if (var6 > this.field972 && var6 < -this.field972 + 4096 && var4 > -this.field972 + 2048 && ~var4 > ~(2048 - -this.field972)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field972 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (-this.field972 + 2048 < var6 && this.field972 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field972;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field972 + 2048);
                } else if (this.field972 <= var4 && var4 <= -this.field972 + 4096) {
                    if (var6 >= this.field972 && var6 <= -this.field972 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field972 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field972;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field972);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIIIIIII)V")
    public static final void method409(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field975;
        int var11 = -arg6 + arg1;
        int var12 = -arg0 + arg8;
        boolean var13;
        if (class229.field4125 > 0 && ~(class229.field4125 % 10) > -6) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg2;
        int var15 = 983040 / arg4;
        for (int var16 = -var14; ~(var11 + var14) < ~var16; ++var16) {
            int var19 = (var16 + 1) * arg2 + arg5 >> 16;
            int var20 = arg2 * var16 + arg5 >> 16;
            int var21 = -var20 + var19;
            if (var21 > 0) {
                int var10000 = arg10 + var19;
                int var23 = arg10 + var20;
                int var24 = arg6 + var16 >> 6;
                if (~var24 <= -1 && ~var24 >= ~(class75.field1409.length + -1)) {
                    int[][] var25 = class75.field1409[var24];
                    for (int var26 = -var15; var26 < var12 + var15; ++var26) {
                        int var27 = (var26 + 1) * arg4 + arg7 >> 16;
                        int var28 = arg7 - -(arg4 * var26) >> 16;
                        int var29 = -var28 + var27;
                        if (~var29 < -1) {
                            var10000 = arg9 + var27;
                            int var31 = arg9 + var28;
                            int var32 = arg0 + var26 >> 6;
                            if (var32 >= 0 && ~var32 >= ~(var25.length - 1) && var25[var32] != null) {
                                int var33 = (var26 - -arg0 << 6 & 4032) + (arg6 + var16 & 63);
                                int var34 = var25[var32][var33];
                                if (~var34 != -1) {
                                    class35 var35 = class9.method64(false, var34 + -1);
                                    if (var13 && class18.field272 == var35.field580) {
                                        class31 var36 = new class31();
                                        var36.field479 = var23;
                                        var36.field483 = var31;
                                        var36.field490 = var35.field580;
                                        class50.field837.method1018((byte) 88, var36);
                                    }
                                    class73.field1384[var35.field580].method101(var23 + -7, var31 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        class31 var17 = (class31) class50.field837.method1017(86);
        int var18 = 103 % ((50 - arg3) / 62);
        while (var17 != null) {
            class73.field1384[var17.field490].method101(var17.field479 + -7, var17.field483 - 7);
            class206.method1479(var17.field479, var17.field483, 15, 16776960, 128);
            class206.method1479(var17.field479, var17.field483, 7, 16777215, 256);
            var17 = (class31) class50.field837.method1016((byte) -31);
        }
        class50.field837.method1021((byte) 112);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!f", name = "g", descriptor = "(I)V")
    public static void method410(int arg0) {
        if (arg0 != 1685019920) {
            method408(true, false);
        }
        field970 = null;
        field966 = null;
        field969 = null;
        field981 = null;
        field973 = null;
        field979 = null;
        field965 = null;
    }
}
