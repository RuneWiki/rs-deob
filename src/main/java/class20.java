import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class20 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field517 = -1;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Ljd;")
    private static class86 field530 = class122.method868("slide:", true);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Ljd;")
    public static class86 field524 = field530;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public static int[] field519 = new int[128];

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Z")
    public static boolean field532 = false;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field533 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field526 = -1;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Z")
    public static boolean field538 = false;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljd;")
    public static class86 field536 = class122.method868("http:)4)4", true);

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Ljd;")
    public static class86 field537 = field530;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public int field521;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field523;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "[[[B")
    public static byte[][][] field518;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[[[I")
    public static int[][][] field528;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method152(byte arg0) {
        field537 = null;
        if (arg0 != 103) {
            method155(40, (byte) 26);
        }
        field536 = null;
        field528 = null;
        field530 = null;
        field518 = null;
        field519 = null;
        field524 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field534++;
        class119.field2338++;
        if (!arg5) {
            class187.method1288(true, arg1 ^ 0x4C00);
            class66.method469(true, arg1 ^ 0xDFFFB385);
            class187.method1288(false, -102);
        }
        class66.method469(false, arg1 + 536890491);
        if (!arg5) {
            class158.method1147(126);
        }
        class119.method849(0);
        if (class152.field2874 == 1) {
            int var6 = class86.field1664 + class3.field28 & 0x7FF;
            int var7 = class139.field2641;
            if (var7 < (class68.field1328 / 256)) {
                var7 = class68.field1328 / 256;
            }
            if (class25.field606[4] && class143.field2717[4] + 128 > var7) {
                var7 = class143.field2717[4] + 128;
            }
            class23.method172(class30.method198(31482, class124.field2412.field676, class124.field2412.field685, class180.field3244) - 50, var7 * 3 + 600, var6, class204.field3692, var7, arg2, class141.field2678, (byte) -23);
        }
        int var8 = class4.field61;
        int var9 = class88.field1748;
        int var10 = class70.field1430;
        int var11 = class255.field4541;
        int var12 = class176.field3202;
        if (arg1 != -19579) {
            field524 = null;
        }
        for (int var13 = 0; var13 < 5; var13++) {
            if (class25.field606[var13]) {
                int var19 = (int) ((double) (-class62.field1218[var13]) + Math.random() * (double) (class62.field1218[var13] * 2 + 1) + Math.sin((double) class188.field3328[var13] / 100.0D * (double) class50.field1051[var13]) * (double) class143.field2717[var13]);
                if (var13 == 2) {
                    class4.field61 += var19;
                }
                if (var13 == 1) {
                    class88.field1748 += var19;
                }
                if (var13 == 3) {
                    class176.field3202 = class176.field3202 + var19 & 0x7FF;
                }
                if (var13 == 0) {
                    class70.field1430 += var19;
                }
                if (var13 == 4) {
                    class255.field4541 += var19;
                    if (class255.field4541 < 128) {
                        class255.field4541 = 128;
                    }
                    if (class255.field4541 > 383) {
                        class255.field4541 = 383;
                    }
                }
            }
        }
        class72.method533(-22);
        class131.method936(arg4, arg0, arg3 + arg4, arg0 - -arg2);
        class145.method1047();
        if (class195.field3506 || arg4 > class200.field3576 || (arg3 + arg4) <= class200.field3576 || class57.field1168 < arg0 || arg0 + arg2 <= class57.field1168) {
            class137.field2623 = false;
            class76.field1507 = 0;
        } else {
            class76.field1507 = 0;
            class137.field2623 = true;
            int var14 = class150.field2805;
            int var15 = class253.field4503;
            int var16 = class4.field58;
            int var17 = class125.field2425;
            class56.field1136 = (class57.field1168 - arg0) * (var17 - var16) / arg2 + var16;
            class129.field2477 = (class200.field3576 - arg4) * (var15 - var14) / arg3 + var14;
        }
        class7.method51(21966);
        byte var18 = class143.method1017((byte) 123) == 2 ? (byte) class119.field2338 : 1;
        class131.method927(arg4, arg0, arg3, arg2, 0);
        class251.method1696(class70.field1430, class88.field1748, class4.field61, class255.field4541, class176.field3202, class12.field393, class66.field1315, class42.field951, class234.field4239, class271.field4757, class273.field4799, class180.field3244 + 1, var18, class124.field2412.field676 >> 7, class124.field2412.field685 >> 7);
        class7.method51(21966);
        class133.method951();
        class270.method1849(256, arg2, arg0, arg4, 256, 255, arg3);
        class208.method1479(256, arg2, 256, true, arg0, arg4, arg3);
        ((class201) class145.field2756).method1434(class194.field3474, 13);
        class66.method472(arg4, false, arg3, arg0, arg2);
        class255.field4541 = var11;
        class88.field1748 = var9;
        class4.field61 = var8;
        class70.field1430 = var10;
        class176.field3202 = var12;
        if (class4.field50 && class253.field4496.method1150(23654) == 0) {
            class4.field50 = false;
        }
        if (class4.field50) {
            class131.method927(arg4, arg0, arg3, arg2, 0);
            class46.method361((byte) -59, class272.field4768, false);
        }
        if (!arg5 && !class4.field50 && !class195.field3506 && arg4 <= class200.field3576 && arg4 + arg3 > class200.field3576 && arg0 <= class57.field1168 && class57.field1168 < arg0 + arg2) {
            class60.method434(class200.field3576, arg3, arg4, arg0, class57.field1168, (byte) 30, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
    public static final void method154(boolean arg0, int arg1) {
        field520++;
        byte[][] var2 = class51.field1073;
        int var3 = class164.field3086.length;
        int var4 = -77 % ((arg1 + 42) / 38);
        for (int var5 = 0; var5 < var3; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class168.field3103[var5] & 0xFF) * 64 - class79.field1554;
                int var8 = (class168.field3103[var5] >> 8) * 64 - class252.field4481;
                class7.method51(21966);
                class114.method810(class122.field2388, var7, arg0, var8, var6, (byte) -127);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
    public static final void method155(int arg0, byte arg1) {
        field522++;
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class189.field3340 += arg0 * 128;
        if (class189.field3340 > class43.field954.length) {
            class189.field3340 -= class43.field954.length;
            int var3 = (int) (Math.random() * 12.0D);
            class168.method1208(20792, class219.field3942[var3]);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class194.field3483[var4 + var5] - (class43.field954[class43.field954.length - 1 & var4 - -class189.field3340] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class194.field3483[var4++] = var26;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class194.field3483[var24 + var23] = 255;
                } else {
                    class194.field3483[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < var2 - arg0; var9++) {
            class118.field2320[var9] = class118.field2320[arg0 + var9];
        }
        if (arg1 != -40) {
            method154(false, -21);
        }
        for (int var10 = var2 - arg0; var10 < var2; var10++) {
            class118.field2320[var10] = (int) (Math.sin((double) class198.field3513 / 14.0D) * 16.0D + Math.sin((double) class198.field3513 / 15.0D) * 14.0D + Math.sin((double) class198.field3513 / 16.0D) * 12.0D);
            class198.field3513++;
        }
        class224.field4054 += arg0;
        int var11 = ((class236.field4265 & 0x1) + arg0) / 2;
        if (var11 <= 0) {
            return;
        }
        for (int var12 = 0; var12 < class224.field4054; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class194.field3483[var21 + (var22 << 7)] = 192;
        }
        class224.field4054 = 0;
        for (int var13 = 0; var13 < var2; var13++) {
            int var18 = 0;
            int var19 = var13 * 128;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var20 + var11 < 128) {
                    var18 += class194.field3483[var20 + var19 + var11];
                }
                if ((var20 - (var11 + 1)) >= 0) {
                    var18 -= class194.field3483[var19 + var20 - var11 - 1];
                }
                if (var20 >= 0) {
                    class273.field4796[var19 + var20] = var18 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var2; var16++) {
                int var17 = var16 * 128;
                if (var2 > var11 + var16) {
                    var15 += class273.field4796[var14 + (var11 * 128) + var17];
                }
                if (var16 - var11 - 1 >= 0) {
                    var15 -= class273.field4796[var14 + var17 - (var11 * 128 + 128)];
                }
                if (var16 >= 0) {
                    class194.field3483[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }
}
