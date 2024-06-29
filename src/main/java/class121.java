import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class121 extends class111 {

    @OriginalMember(owner = "client!rc", name = "Hc", descriptor = "Lfc;")
    private static class39 field3161 = class90.method774("Account locked as we suspect it has been stolen)3", -121);

    @OriginalMember(owner = "client!rc", name = "Pc", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!rc", name = "Oc", descriptor = "Lfc;")
    private static class39 field3168 = class90.method774("wave:", -127);

    @OriginalMember(owner = "client!rc", name = "yc", descriptor = "Lfc;")
    public static class39 field3152 = class90.method774("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", -98);

    @OriginalMember(owner = "client!rc", name = "Fc", descriptor = "Lfc;")
    public static class39 field3159 = field3161;

    @OriginalMember(owner = "client!rc", name = "Rc", descriptor = "I")
    public static int field3171 = 0;

    @OriginalMember(owner = "client!rc", name = "Mc", descriptor = "Lfc;")
    private static class39 field3166 = class90.method774("FULL", -93);

    @OriginalMember(owner = "client!rc", name = "Vc", descriptor = "Lfc;")
    public static class39 field3175 = field3166;

    @OriginalMember(owner = "client!rc", name = "Ic", descriptor = "Lfc;")
    public static class39 field3162 = field3168;

    @OriginalMember(owner = "client!rc", name = "Wc", descriptor = "[I")
    public static int[] field3176 = new int[32768];

    @OriginalMember(owner = "client!rc", name = "Bc", descriptor = "Lfc;")
    public static class39 field3155 = class90.method774(" )2> <col=00ffff>", -105);

    @OriginalMember(owner = "client!rc", name = "Uc", descriptor = "Lfc;")
    public static class39 field3174 = field3168;

    @OriginalMember(owner = "client!rc", name = "xc", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!rc", name = "zc", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!rc", name = "Ac", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!rc", name = "Cc", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!rc", name = "Dc", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!rc", name = "Ec", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!rc", name = "Gc", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!rc", name = "Lc", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!rc", name = "Qc", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rc", name = "Sc", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!rc", name = "Tc", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!rc", name = "Kc", descriptor = "Lue;")
    public static class141 field3164;

    @OriginalMember(owner = "client!rc", name = "Nc", descriptor = "Lue;")
    public static class141 field3167;

    @OriginalMember(owner = "client!rc", name = "Jc", descriptor = "Lnf;")
    public class96 field3163;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILoc;I)[Lb;", line = 3)
    public static final class8[] method1033(int arg0, int arg1, class100 arg2, int arg3) {
        ++field3157;
        if (arg1 != -21696) {
            method1033(-50, 97, (class100) null, -30);
        }
        return !class127.method1054(arg3, (byte) 0, arg0, arg2) ? null : class55.method575((byte) 121);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Loc;Ljava/awt/Component;Loc;B)V", line = 44)
    public static final void method1034(class100 arg0, Component arg1, class100 arg2, byte arg3) {
        ++field3165;
        if (!class142.field3589) {
            class101.field2530 = class3.method23(503, 0, 765, arg1);
            class101.field2530.method691(-116);
            class152.method1217();
            byte[] var4 = arg0.method856(class16.field478, class93.field2175, (byte) 15);
            class66.field1573 = new class8(var4, arg1);
            class113.field2960 = class66.field1573.method105();
            class88.field2062 = class29.method359(-72, class93.field2175, class72.field1694, arg2);
            class127.field3232 = class29.method359(-46, class93.field2175, class116.field3064, arg2);
            class86.field1957 = class29.method359(-71, class93.field2175, class111.field2924, arg2);
            class60.field1460 = class145.method1167(arg2, class58.field1436, (byte) -48, class93.field2175);
            class151.field3750 = class145.method1167(arg2, class38.field1020, (byte) -53, class93.field2175);
            class151.field3737 = new int[256];
            for (int var5 = 0; var5 < 64; ++var5) {
                class151.field3737[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; ++var6) {
                class151.field3737[var6 + 64] = var6 * 1024 + 16711680;
            }
            int var7 = 52 / ((arg3 - 3) / 50);
            for (int var8 = 0; ~var8 > -65; ++var8) {
                class151.field3737[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; ~var9 > -65; ++var9) {
                class151.field3737[var9 + 192] = 16777215;
            }
            class147.field3675 = new int[256];
            for (int var10 = 0; ~var10 > -65; ++var10) {
                class147.field3675[var10] = var10 * 1024;
            }
            for (int var11 = 0; ~var11 > -65; ++var11) {
                class147.field3675[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; ~var12 > -65; ++var12) {
                class147.field3675[var12 - -128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class147.field3675[var13 + 192] = 16777215;
            }
            class116.field3062 = new int[256];
            for (int var14 = 0; var14 < 64; ++var14) {
                class116.field3062[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; ++var15) {
                class116.field3062[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; ~var16 > -65; ++var16) {
                class116.field3062[var16 + 128] = 16711935 - -(var16 * 1024);
            }
            for (int var17 = 0; var17 < 64; ++var17) {
                class116.field3062[var17 + 192] = 16777215;
            }
            class97.field2314 = new int[32768];
            class92.field2162 = new int[32768];
            class92.field2161 = new int[256];
            class151.method1202((class141) null, (byte) -115);
            class108.field2718 = false;
            class57.field1413 = 0;
            class93.field2180 = class93.field2175;
            if (class37.field998 == 0) {
                class50.field1282 = true;
            } else {
                class50.field1282 = false;
            }
            class61.field1504 = new int[32768];
            class145.field3630 = new int[32768];
            class93.field2174 = class93.field2175;
            if (!class50.field1282) {
                class2.method20(class57.field1418, 255, (byte) 14, class136.field3416, false, class93.field2175, 2);
            } else {
                class83.method694(2, 23440);
            }
            class30.method368(113, false);
            class142.field3589 = true;
            class70.field1655 = true;
            class66.field1573.method119(0, 0);
            class113.field2960.method119(382, 0);
            class88.field2062.method1155(382 - class88.field2062.field3543 / 2, 18);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILb;IB)V", line = 185)
    public static final void method1035(int arg0, class8 arg1, int arg2, byte arg3) {
        ++field3156;
        if (arg1 != null) {
            int var4 = arg0 * arg0 + arg2 * arg2;
            int var5 = 2047 & class62.field1532 + class26.field753;
            if (var4 <= 6400) {
                int var6 = class40.field1124[var5];
                int var7 = var6 * 256 / (class153.field3759 + 256);
                int var8 = class40.field1114[var5];
                int var9 = var8 * 256 / (class153.field3759 + 256);
                int var10 = arg0 * var7 + arg2 * var9 >> 16;
                int var11 = -82 / ((23 - arg3) / 35);
                int var12 = arg0 * var9 + -(arg2 * var7) >> 16;
                if (var4 <= 2500) {
                    arg1.method116(var10 + 4 + 94 + -(arg1.field243 / 2), -(arg1.field241 / 2) + -4 + -var12 + 83);
                } else {
                    arg1.method108(class3.field88, 94 - arg1.field243 / 2 + var10 + 4, -(arg1.field241 / 2) + -var12 + 83 + -4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)V", line = 242)
    public static final void method1036(byte arg0) {
        ++field3151;
        if (arg0 == 61) {
            if (class104.field2630 != null) {
                class104.field2630.method1189(256);
            }
            if (client.field570 != null) {
                client.field570.method1189(256);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 263)
    public static void method1037(boolean arg0) {
        field3161 = null;
        field3175 = null;
        field3176 = null;
        field3167 = null;
        field3164 = null;
        field3155 = null;
        field3162 = null;
        field3174 = null;
        field3166 = null;
        field3168 = null;
        field3159 = null;
        if (!arg0) {
            field3169 = 70;
        }
        field3152 = null;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)Lda;", line = 299)
    public final class23 method153(int arg0) {
        if (arg0 != 64) {
            field3167 = null;
        }
        ++field3154;
        if (this.field3163 == null) {
            return null;
        } else {
            class116 var2 = super.field2888 != -1 && super.field2911 == 0 ? class38.method430(2238, super.field2888) : null;
            class116 var3 = super.field2869 == -1 || super.field2920 == super.field2869 && var2 != null ? null : class38.method430(2238, super.field2869);
            class23 var4 = this.field3163.method804(var2, false, var3, super.field2886, super.field2892);
            if (var4 == null) {
                return null;
            } else {
                var4.method258();
                super.field2923 = var4.field2966;
                if (super.field2891 != -1 && ~super.field2866 != 0) {
                    class23 var5 = class60.method598(super.field2891, arg0 + -32).method943(super.field2866, 16664);
                    if (var5 != null) {
                        var5.method263(0, -super.field2902, 0);
                        class23[] var6 = new class23[] { var4, var5 };
                        var4 = new class23(var6, 2);
                    }
                }
                if (this.field3163.field2279 == 1) {
                    var4.field606 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)Z", line = 349)
    public final boolean method979(int arg0) {
        if (arg0 != 18) {
            method1033(54, -38, (class100) null, 106);
        }
        ++field3172;
        return this.field3163 != null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILob;)Z", line = 363)
    public static final boolean method1038(int arg0, class99 arg1) {
        ++field3153;
        int var2 = arg1.field2399;
        if ((~var2 > -2 || var2 > 200) && (var2 < 701 || ~var2 < -901)) {
            if (var2 >= 401 && var2 <= 500) {
                ++class142.field3577;
                class92.method786(0, 2, 0, 56, 0, class137.method1111(new class39[] { class58.field1427, arg1.field2427 }, (byte) -40), class57.field1420);
                return true;
            } else {
                int var3 = 80 / ((arg0 - 50) / 54);
                return false;
            }
        } else {
            ++class98.field2318;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 < 701) {
                if (~var2 > -102) {
                    --var2;
                } else {
                    var2 -= 101;
                }
            } else {
                var2 -= 601;
            }
            class92.method786(0, 3, 0, 94, 0, class137.method1111(new class39[] { class58.field1427, class139.field3482[var2] }, (byte) -53), class57.field1420);
            ++class38.field1038;
            class92.method786(0, 48, 0, 52, 0, class137.method1111(new class39[] { class58.field1427, class139.field3482[var2] }, (byte) -99), class2.field62);
            return true;
        }
    }
}
