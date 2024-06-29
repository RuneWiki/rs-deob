import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class411 extends class456 {

    @OriginalMember(owner = "client!fu", name = "L", descriptor = "I")
    public int field5830;

    @OriginalMember(owner = "client!fu", name = "S", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!fu", name = "P", descriptor = "F")
    public float field5834;

    @OriginalMember(owner = "client!fu", name = "K", descriptor = "Z")
    public boolean field5829;

    @OriginalMember(owner = "client!fu", name = "R", descriptor = "F")
    public float field5836;

    @OriginalMember(owner = "client!fu", name = "J", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!fu", name = "M", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!fu", name = "N", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!fu", name = "O", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!fu", name = "Q", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!fu", name = "T", descriptor = "Lvf;")
    public static class162 field5838;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "(B)V")
    public static final void method2465(byte arg0) {
        if (!class235.method1490((byte) 54, class780.field10712) && !class586.method3297(true, class780.field10712)) {
            int var1 = class625.field8475.field6198[0] >> 3;
            int var2 = class625.field8475.field6197[0] >> 3;
            if (var1 >= 0 && ~var1 > ~(class102.field1467 >> 3) && ~var2 <= -1 && class393.field5663 >> 3 > var2) {
                class412.method2484(5, var1, var2, 5000);
            } else {
                class412.method2484(5, class102.field1467 >> 4, class393.field5663 >> 4, 0);
            }
        } else {
            class412.method2484(5, class435.field6273 >> 12, class223.field2892 >> 12, 5000);
        }
        int var3 = -103 / ((arg0 - 48) / 33);
        ++field5828;
        class774.method4252(-620657048);
        class512.method2992(1055253410);
        class106.method802((byte) 7);
        class171.method1155(117);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIII[I)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5830 = arg2;
        this.field5837 = arg1;
        this.method2709(arg1, 0, 0, 0, true, -101, arg2, 0, arg5);
        this.field5834 = (float) arg1 / (float) arg3;
        this.field5829 = false;
        this.field5836 = (float) arg2 / (float) arg4;
        this.method2708((byte) -126, false, false);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIIZ[BI)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5837 = arg3;
        this.field5830 = arg4;
        if (super.field2649 != 34037) {
            this.field5834 = this.field5836 = 1.0F;
            this.field5829 = true;
        } else {
            this.field5834 = (float) arg3;
            this.field5829 = false;
            this.field5836 = (float) arg4;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILha;)V")
    public static final void method2466(int arg0, class66 arg1) {
        ++field5835;
        int var2 = 0;
        int var3 = 0;
        if (class24.field246) {
            var2 = class186.method1252(0);
            var3 = class550.method3163(16383);
        }
        int var4 = class92.field1298 + var2;
        int var5 = class632.field8551 + var3;
        int var6 = class677.field9082;
        int var7 = class625.field8477 + -3;
        byte var8 = 20;
        class654.method3637(class58.field721.method365(class55.field647, (byte) 119), class92.field1298 + var2, class625.field8477, class677.field9082, class632.field8551 + var3, (byte) 43, arg1, var8);
        if (arg0 != -25686) {
            field5838 = null;
        }
        int var9 = var2 + class494.field6961.method1652(arg0 + 25686);
        int var10 = var3 + class494.field6961.method1663((byte) 121);
        if (!class30.field301) {
            int var11 = 0;
            for (class478 var12 = (class478) class645.field8695.method679((byte) -86); var12 != null; var12 = (class478) class645.field8695.method681(-57)) {
                int var13 = (class269.field3929 - 1 + -var11) * 16 + var5 + var8 + 13;
                if (var9 > class92.field1298 + var2 && ~(class92.field1298 + var2 + class677.field9082) < ~var9 && ~var10 < ~(var13 + -13) && var10 < var13 + 4 && var12.field6702) {
                    arg1.method434(class92.field1298 + var2, var13 + -12, class677.field9082, 16, class43.field465 | -class357.field5209 + 255 << 24, 1);
                }
                ++var11;
            }
        } else {
            int var14 = 0;
            for (class641 var15 = (class641) class716.field9763.method152((byte) -13); var15 != null; var15 = (class641) class716.field9763.method146((byte) 97)) {
                int var28 = var14 * 16 + var8 + 13 + var5;
                ++var14;
                if (~(class92.field1298 - -var2) > ~var9 && var9 < class92.field1298 + var2 - -class677.field9082 && ~var10 < ~(var28 + -13) && ~var10 > ~(var28 - -4) && (~var15.field8639 < -2 || ((class478) var15.field8636.field259.field8885).field6702)) {
                    arg1.method434(class92.field1298 + var2, var28 - 12, class677.field9082, 16, 255 - class357.field5209 << 24 | class43.field465, 1);
                }
            }
            if (class740.field10028 != null) {
                int var16 = 0;
                class654.method3637(class740.field10028.field8635, class271.field3950, class626.field8480, class588.field8032, class696.field9241, (byte) 58, arg1, var8);
                for (class478 var17 = (class478) class740.field10028.field8636.method152((byte) -13); var17 != null; var17 = (class478) class740.field10028.field8636.method146((byte) 97)) {
                    int var18 = var16 * 16 + class696.field9241 + var8 + 13;
                    if (~class271.field3950 > ~var9 && ~var9 > ~(class588.field8032 + class271.field3950) && ~(var18 + -13) > ~var10 && var10 < var18 + 4 && var17.field6702) {
                        arg1.method434(class271.field3950, var18 + -12, class588.field8032, 16, 255 - class357.field5209 << 24 | class43.field465, 1);
                    }
                    ++var16;
                }
                class456.method2705(arg1, class271.field3950, true, class588.field8032, var8, class626.field8480, class696.field9241);
            }
        }
        class456.method2705(arg1, class92.field1298 + var2, true, class677.field9082, var8, class625.field8477, class632.field8551 + var3);
        if (!class30.field301) {
            int var19 = 0;
            for (class478 var20 = (class478) class645.field8695.method679((byte) -86); var20 != null; var20 = (class478) class645.field8695.method681(-112)) {
                int var21 = (-var19 + -1 + class269.field3929) * 16 + (var5 - -13) + var8;
                class420.method2528(var9, class442.field6365 | -16777216, arg1, -16777216 | class609.field8240, var10, 71, var4, var6, var7, var21, var5, var20);
                ++var19;
            }
        } else {
            int var22 = 0;
            for (class641 var23 = (class641) class716.field9763.method152((byte) -13); var23 != null; var23 = (class641) class716.field9763.method146((byte) 97)) {
                int var27 = class632.field8551 - -var3 + var8 + 13 - -(var22 * 16);
                ++var22;
                if (var23.field8639 != 1) {
                    class206.method1351(var10, var27, class92.field1298 - -var2, var9, arg1, -16777216 | class609.field8240, class677.field9082, class442.field6365 | -16777216, class625.field8477, class632.field8551 + var3, var23, 34963);
                } else {
                    class420.method2528(var9, class442.field6365 | -16777216, arg1, class609.field8240 | -16777216, var10, 74, class92.field1298 - -var2, class677.field9082, class625.field8477, var27, class632.field8551 + var3, (class478) var23.field8636.field259.field8885);
                }
            }
            if (class740.field10028 != null) {
                int var24 = 0;
                for (class478 var25 = (class478) class740.field10028.field8636.method152((byte) -13); var25 != null; var25 = (class478) class740.field10028.field8636.method146((byte) 97)) {
                    int var26 = var24 * 16 + 13 + class696.field9241 + var8;
                    class420.method2528(var9, -16777216 | class442.field6365, arg1, class609.field8240 | -16777216, var10, 73, class271.field3950, class588.field8032, class626.field8480, var26, class696.field9241, var25);
                    ++var24;
                }
                class79.method634(class271.field3950, class626.field8480, (byte) -81, class588.field8032, class696.field9241);
            }
        }
        class79.method634(class92.field1298 + var2, class625.field8477, (byte) -81, class677.field9082, class632.field8551 + var3);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIII)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5837 = arg2;
        this.field5834 = (float) arg2 / (float) arg4;
        this.field5830 = arg3;
        this.field5836 = (float) arg3 / (float) arg5;
        this.field5829 = false;
        this.method2708((byte) -126, false, false);
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIZ[III)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5830 = arg3;
        if (~super.field2649 == -34038) {
            this.field5829 = false;
            this.field5836 = (float) arg3;
            this.field5834 = (float) arg2;
        } else {
            this.field5834 = this.field5836 = 1.0F;
            this.field5829 = true;
        }
        this.field5837 = arg2;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIIIIZ)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5829 = false;
        this.field5834 = (float) arg3 / (float) arg5;
        this.field5837 = arg3;
        this.field5836 = (float) arg4 / (float) arg6;
        this.field5830 = arg4;
        this.method2708((byte) -126, false, false);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method2467(boolean arg0, String arg1, int arg2) {
        ++field5832;
        if (arg1 != null) {
            if (class664.field8915 >= 100) {
                class743.method4082(-125, 4, class58.field736.method365(class55.field647, (byte) 67));
            } else {
                String var3 = class703.method3895(arg1, (byte) -112);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~class664.field8915; ++var4) {
                        String var9 = class703.method3895(class98.field1438[var4], (byte) -109);
                        if (var9 != null && var9.equals(var3)) {
                            class743.method4082(-125, 4, arg1 + class58.field737.method365(class55.field647, (byte) 67));
                            return;
                        }
                        if (class194.field2533[var4] != null) {
                            String var10 = class703.method3895(class194.field2533[var4], (byte) -70);
                            if (var10 != null && var10.equals(var3)) {
                                class743.method4082(arg2 ^ -21889, 4, arg1 + class58.field737.method365(class55.field647, (byte) 68));
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class525.field7289 > var5; ++var5) {
                        String var7 = class703.method3895(class316.field4458[var5], (byte) -73);
                        if (var7 != null && var7.equals(var3)) {
                            class743.method4082(-126, 4, class58.field742.method365(class55.field647, (byte) 73) + arg1 + class58.field743.method365(class55.field647, (byte) 125));
                            return;
                        }
                        if (class758.field10398[var5] != null) {
                            String var8 = class703.method3895(class758.field10398[var5], (byte) -100);
                            if (var8 != null && var8.equals(var3)) {
                                class743.method4082(-126, 4, class58.field742.method365(class55.field647, (byte) 78) + arg1 + class58.field743.method365(class55.field647, (byte) 77));
                                return;
                            }
                        }
                    }
                    if (class703.method3895(class625.field8475.field10367, (byte) 121).equals(var3)) {
                        class743.method4082(-127, 4, class58.field739.method365(class55.field647, (byte) 117));
                    } else {
                        ++class372.field5431;
                        class43 var6 = class492.method2903(class257.field3832, arg2 ^ arg2, class73.field983);
                        var6.field457.method1725(1 + class525.method3045(-14, arg1), 114);
                        var6.field457.method1678(arg1, (byte) 126);
                        var6.field457.method1725(!arg0 ? 0 : 1, 71);
                        class409.method2457((byte) -100, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        int var1 = 103 / ((arg0 - -62) / 57);
        field5838 = null;
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIII[BI)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5837 = arg2;
        this.field5830 = arg3;
        this.method2707(arg6, arg7, 0, 0, 0, 0, true, true, arg3, arg2);
        this.field5834 = (float) arg2 / (float) arg4;
        this.field5836 = (float) arg3 / (float) arg5;
        this.field5829 = false;
        this.method2708((byte) -126, false, false);
    }

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "(I)V")
    public static final void method2469(int arg0) {
        ++field5833;
        class683.field9125 = null;
        if (class24.field246 && class164.method1133(-15388) != 1) {
            class152.method1064(class316.method2016(31829), 0, 0, false, class780.field10712 == 3 || ~class780.field10712 == -8, class608.method3383(-2));
        }
        int var1 = 0;
        if (arg0 != 3) {
            field5838 = null;
        }
        int var2 = 0;
        if (class24.field246) {
            var1 = class186.method1252(arg0 + -3);
            var2 = class550.method3163(16383);
        }
        class91.method718(var2, class693.field9222 + var2, var1, var2, var1, -1, -1, var1 - -class460.field6558, class227.field2935);
        if (class683.field9125 != null) {
            class676.method3728(true, var2, var1, -116, -1412584499, class693.field9222 + var2, class683.field9125, class511.field7119, class237.field3155.field4973, class612.field8277, class460.field6558 + var1);
            class683.field9125 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIII)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (~super.field2649 != -34038) {
            this.field5834 = this.field5836 = 1.0F;
            this.field5829 = true;
        } else {
            this.field5834 = (float) arg3;
            this.field5829 = false;
            this.field5836 = (float) arg4;
        }
        this.field5830 = arg4;
        this.field5837 = arg3;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2470(int arg0, String arg1) {
        ++field5831;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 > -75) {
            return -31;
        } else {
            for (int var4 = 0; var2 > var4; ++var4) {
                var3 = (var3 << 5) - (var3 - arg1.charAt(var4));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Llf;IIIIIZ)V")
    public class411(class250 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (super.field2649 != 34037) {
            this.field5829 = true;
            this.field5834 = this.field5836 = 1.0F;
        } else {
            this.field5829 = false;
            this.field5836 = (float) arg5;
            this.field5834 = (float) arg4;
        }
        this.field5837 = arg4;
        this.field5830 = arg5;
    }
}
