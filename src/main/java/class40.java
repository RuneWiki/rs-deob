import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class40 extends class51 {

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field695 = 0;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "Lhi;")
    public static class82 field697 = class95.method664((byte) -25, "Fallen lassen");

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field699 = 0;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "[J")
    public static long[] field694 = new long[500];

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public int field688;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public int field691;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "Lhi;")
    public class82 field704;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[I")
    public int[] field689;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "[I")
    public int[] field703;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "[I")
    public static int[] field705;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "[Loe;")
    public class79[] field706;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "[Lhi;")
    public class82[] field693;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 23)
    public static void method310(boolean arg0) {
        field697 = null;
        if (!arg0) {
            field708 = -17;
        }
        field694 = null;
        field705 = null;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)I", line = 37)
    public static final int method311(int arg0, int arg1) {
        field692++;
        double var2 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var8 = var6;
        double var10 = var6;
        if (var2 < var6) {
            var8 = var2;
        }
        if (var6 < var2) {
            var10 = var2;
        }
        if (var10 < var4) {
            var10 = var4;
        }
        if (var4 < var8) {
            var8 = var4;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8);
            } else if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) ((double) arg0 * var18);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (var20 >> 2 << 10) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V", line = 141)
    public static final void method312(int arg0) {
        field702++;
        if (class61.field959 == 10 && class147.field2485) {
            class292.method2014(28, 28);
        }
        if (class61.field959 == 30) {
            class292.method2014(28, 25);
        }
        if (arg0 != -5513) {
            field708 = 18;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILgd;Lgd;)V", line = 158)
    public static final void method313(int arg0, class141 arg1, class141 arg2) {
        if (arg0 != 255) {
            field694 = (long[]) null;
        }
        field701++;
        if (arg1.field2422 != null) {
            arg1.method961((byte) 119);
        }
        arg1.field2423 = arg2;
        arg1.field2422 = arg2.field2422;
        arg1.field2422.field2423 = arg1;
        arg1.field2423.field2422 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V", line = 188)
    public static final void method314(int arg0, int arg1, int arg2) {
        field700++;
        short var3 = 256;
        if (arg2 != -16428) {
            field705 = (int[]) null;
        }
        int var4 = 0;
        if (class28.field378 > 0) {
            class207.method1480(class28.field378, arg2 - 10130);
            class28.field378 = 0;
        }
        int var5 = 0;
        int var6 = class320.field5528 * arg0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class187.field3152[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class263.field4491[var4++];
                int var11 = class320.field5531[arg1 + var6++];
                if (var10 == 0) {
                    class316.field5431.field5160[var5++] = var11;
                } else {
                    int var12 = 256 - var10 - 18;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = var10 + 18;
                    int var14 = class175.field3035[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class316.field5431.field5160[var5++] = class277.method1935(16711680, var12 * class277.method1935(65280, var11) + class277.method1935(var14, 65280) * var13) + class277.method1935(-16711936, var13 * class277.method1935(var14, 16711935) + (var12 * class277.method1935(var11, 16711935))) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class316.field5431.field5160[var5++] = class320.field5531[arg1 + var6++];
            }
            var6 += class320.field5528 - 128;
        }
        class316.field5431.method606(arg1, arg0);
    }

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)V", line = 293)
    public static final void method315(int arg0) {
        class50.field811 = class114.field2047;
        class95.field1733 = class221.field3830;
        class136.field2350 = class134.field2316;
        class24.field330 = class124.field2177;
        class218.field3787 = class217.field3767;
        class164.field2869 = class284.field4779;
        class80.field1365 = class138.field2375;
        class25.field344 = class60.field925;
        class308.field5257 = class264.field4516;
        class221.field3831 = class160.field2804;
        class198.field3396 = class51.field822;
        class307.field5235 = class24.field328;
        class92.field1644 = class293.field4909;
        class112.field2034 = class152.field2568;
        class209.field3675 = class192.field3254;
        class165.field2889 = class152.field2570;
        class293.field4921 = class34.field533;
        class287.field4831 = class15.field136;
        class249.field4302 = class197.field3367;
        class286.field4815 = class315.field5420;
        class294.field4929 = class75.field1217;
        class133.field2292 = class98.field1776;
        class224.field3894 = class149.field2544;
        class280.field4700 = class183.field3124;
        class4.field33 = class28.field379;
        class217.field3775 = class193.field3269;
        class157.field2673 = class22.field306;
        class74.field1135 = class199.field3423;
        class259.field4435 = class39.field679;
        class27.field356 = class238.field4140;
        class193.field3275 = class104.field1843;
        class84.field1513 = class34.field536;
        class198.field3387 = class196.field3340;
        class253.field4356 = class200.field3440;
        class142.field2429 = class237.field4128;
        class112.field2030 = class152.field2568;
        class60.field952 = class31.field469;
        class68.field1058 = class242.field4215;
        class84.field1503 = class263.field4496;
        class330.field5629 = class32.field478;
        class307.field5231 = class64.field1005;
        class193.field3262 = class230.field3971;
        class23.field323 = class293.field4912;
        class298.field5071 = class66.field1035;
        class196.field3335 = class146.field2470;
        class28.field386 = class272.field4588;
        class19.field238 = class203.field3539;
        field696++;
        class93.field1682 = class63.field979;
        class43.field752 = class75.field1165;
        class87.field1550 = class202.field3476;
        class23.field312 = class293.field4912;
        class254.field4377 = class179.field3067;
        class105.field1864 = class312.field5335;
        class242.field4216 = class117.field2064;
        class126.field2217 = class311.field5309;
        class279.field4673 = class306.field5211;
        class36.field596 = class218.field3783;
        class279.field4682 = class104.field1848;
        class275.field4629 = class199.field3397;
        class114.field2042 = class166.field2900;
        class281.field4716 = class189.field3165;
        class281.field4725 = class129.field2246;
        class214.field3727 = class279.field4674;
        class19.field232 = class56.field908;
        class232.field4014 = class65.field1014;
        class288.field4846 = class193.field3282;
        class152.field2569 = class16.field145;
        class133.field2302 = class280.field4703;
        class129.field2253 = class100.field1796;
        class224.field3896 = class200.field3435;
        class181.field3086 = class39.field678;
        class290.field4869 = class29.field389;
        class312.field5393 = class283.field4755;
        class264.field4507 = class22.field297;
        class227.field3928 = class285.field4802;
        class253.field4360 = class131.field2270;
        class198.field3382 = class238.field4135;
        class159.field2767 = class127.field2230;
        class19.field249 = class152.field2572;
        class52.field842 = class257.field4420;
        class112.field2014 = class305.field5167;
        class159.field2750 = class208.field3648;
        class33.field486 = class327.field5593;
        class241.field4182 = class305.field5175;
        if (arg0 <= 34) {
            field697 = (class82) null;
        }
        class119.field2102 = class294.field4927;
        class177.field3054 = class65.field1015;
        class289.field4847 = class288.field4836;
        class308.field5256 = class264.field4516;
        class237.field4119 = class130.field2266;
    }
}
