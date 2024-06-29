import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class667 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
    private static int[] field9435 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "[[J")
    public static long[][] field9439 = new long[8][256];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "[I")
    public static int[] field9436 = new int[6];

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "[J")
    public static long[] field9437 = new long[11];

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Lpn;")
    public static class692[] field9434;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
    public static void method3827(int arg0) {
        field9437 = null;
        field9436 = null;
        field9434 = null;
        field9435 = null;
        int var1 = 66 / ((arg0 - 21) / 57);
        field9439 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
    public static final void method3828(boolean arg0) {
        field9438++;
        class645.method3734(false, (byte) 35);
        class533.field7756 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class307.field4835.length; var2++) {
            if (class663.field9225[var2] != -1 && class307.field4835[var2] == null) {
                class307.field4835[var2] = class247.field3943.method926(class663.field9225[var2], -128, 0);
                if (class307.field4835[var2] == null) {
                    class533.field7756++;
                    var1 = false;
                }
            }
            if (class81.field1007[var2] != -1 && class500.field7342[var2] == null) {
                class500.field7342[var2] = class247.field3943.method925(0, -83, class116.field1809[var2], class81.field1007[var2]);
                if (class500.field7342[var2] == null) {
                    var1 = false;
                    class533.field7756++;
                }
            }
            if (class137.field2330[var2] != -1 && class160.field2735[var2] == null) {
                class160.field2735[var2] = class247.field3943.method926(class137.field2330[var2], -127, 0);
                if (class160.field2735[var2] == null) {
                    class533.field7756++;
                    var1 = false;
                }
            }
            if (class310.field4871[var2] != -1 && class665.field9423[var2] == null) {
                class665.field9423[var2] = class247.field3943.method926(class310.field4871[var2], -126, 0);
                if (class665.field9423[var2] == null) {
                    var1 = false;
                    class533.field7756++;
                }
            }
            if (class366.field5747 != null && class622.field8789[var2] == null && class366.field5747[var2] != -1) {
                class622.field8789[var2] = class247.field3943.method925(0, -89, class116.field1809[var2], class366.field5747[var2]);
                if (class622.field8789[var2] == null) {
                    var1 = false;
                    class533.field7756++;
                }
            }
        }
        if (class26.field417 == null) {
            if (class501.field7344 == null || !class660.field9199.method943(class501.field7344.field5651 + "_staticelements", (byte) -36)) {
                class26.field417 = new class595(0);
            } else if (class660.field9199.method947((byte) -99, class501.field7344.field5651 + "_staticelements")) {
                class26.field417 = class74.method744(123, class660.field9199, class501.field7344.field5651 + "_staticelements", class609.field8649);
            } else {
                class533.field7756++;
                var1 = false;
            }
        }
        if (!var1) {
            class51.field689 = 1;
            return;
        }
        boolean var3 = true;
        class6.field80 = 0;
        for (int var4 = 0; var4 < class307.field4835.length; var4++) {
            byte[] var21 = class500.field7342[var4];
            if (var21 != null) {
                int var22 = (class476.field7058[var4] >> 8) * 64 - class612.field8702;
                int var23 = (class476.field7058[var4] & 0xFF) * 64 - class626.field8855;
                if (class265.field4319 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class566.method3351(var21, (byte) -107, class417.field6374, var22, class275.field4426, var23);
            }
            byte[] var24 = class665.field9423[var4];
            if (var24 != null) {
                int var25 = (class476.field7058[var4] >> 8) * 64 - class612.field8702;
                int var26 = (class476.field7058[var4] & 0xFF) * 64 - class626.field8855;
                if (class265.field4319 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class566.method3351(var24, (byte) 7, class417.field6374, var25, class275.field4426, var26);
            }
        }
        if (!var3) {
            class51.field689 = 2;
            return;
        }
        if (class51.field689 != 0) {
            class420.method2683(class573.field8183, -31593, class122.field1984.method1091(class135.field2206, 1) + "<br>(100%)", class627.field8857, class125.field2057, true);
        }
        class636.method3698(!arg0);
        class66.method705(0);
        boolean var5 = false;
        if (class627.field8857.method326() && class17.field282.field4853) {
            for (int var6 = 0; var6 < class307.field4835.length; var6++) {
                if (class665.field9423[var6] != null || class160.field2735[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class17.field282.field4848) {
            var7 = field9435[class580.field8272];
        } else {
            var7 = class153.field2622[class580.field8272];
        }
        if (class627.field8857.method289()) {
            var7++;
        }
        class218.method1626(class627.field8857, class155.field2639, 9, 4, class275.field4426, class417.field6374, var7, var5, class627.field8857.method267() > 0);
        class124.method1101(class617.field8743);
        if (class617.field8743 == 0) {
            class125.method1102(null);
        } else {
            class125.method1102(class329.field5095);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class10.field172[var8].method374(32);
        }
        class519.method3130(0);
        class166.method1339(14940, arg0);
        class685.method3895(0);
        class145.field2447 = false;
        class581.field8273 = null;
        class636.method3698(!arg0);
        System.gc();
        class645.method3734(true, (byte) 35);
        class366.method2424((byte) 121);
        class677.field9528 = class17.field282.method2133(true, class497.field7259);
        class134.field2202 = class204.field3324 >= 96;
        class71.field894 = class17.field282.field4853;
        class312.field4913 = class17.field282.method2127(7525, class497.field7259);
        class521.field7566 = !class17.field282.field4877;
        class401.field6188 = class17.field282.method2089(class497.field7259, -1) ? -1 : class70.field887;
        class397.field6158 = class395.method2549(2, class497.field7259) || class17.field282.field4890;
        class439.field6691 = class17.field282.field4872;
        class673.field9483 = new class184(4, class275.field4426, class417.field6374, false);
        if (class265.field4319 == 0) {
            class429.method2718(class307.field4835, (byte) -62, class673.field9483);
        } else {
            class427.method2703(true, class673.field9483, class307.field4835);
        }
        class672.method3845((byte) 96, class417.field6374 >> 4, class275.field4426 >> 4);
        class520.method3138(arg0);
        if (var5) {
            class164.method1332(true);
            class173.field2871 = new class184(1, class275.field4426, class417.field6374, true);
            if (class265.field4319 == 0) {
                class429.method2718(class160.field2735, (byte) -62, class173.field2871);
                class645.method3734(true, (byte) 35);
            } else {
                class427.method2703(true, class173.field2871, class160.field2735);
                class645.method3734(true, (byte) 35);
            }
            class173.field2871.method970(0, class673.field9483.field1676[0], -76);
            class173.field2871.method977(null, 15422, class627.field8857, null);
            class164.method1332(false);
        }
        class673.field9483.method977(class10.field172, 15422, class627.field8857, var5 ? class173.field2871.field1676 : null);
        if (class265.field4319 == 0) {
            class645.method3734(true, (byte) 35);
            class294.method2057(false, class673.field9483, class500.field7342);
            if (class622.field8789 != null) {
                class156.method1296(false);
            }
        } else {
            class645.method3734(true, (byte) 35);
            class75.method753(class500.field7342, true, class673.field9483);
        }
        class66.method705(0);
        if (class204.field3324 < 96) {
            class454.method2852(1);
        }
        class645.method3734(true, (byte) 35);
        class673.field9483.method976(var5 ? class493.field7208[0] : null, null, class627.field8857, (byte) 83);
        class673.field9483.method1500(false, class627.field8857, false);
        class645.method3734(true, (byte) 35);
        if (var5) {
            class164.method1332(true);
            class645.method3734(true, (byte) 35);
            if (class265.field4319 == 0) {
                class294.method2057(false, class173.field2871, class665.field9423);
            } else {
                class75.method753(class665.field9423, true, class173.field2871);
            }
            class66.method705(0);
            class645.method3734(true, (byte) 35);
            class173.field2871.method976(null, class491.field7187[0], class627.field8857, (byte) 69);
            class173.field2871.method1500(true, class627.field8857, arg0);
            class645.method3734(true, (byte) 35);
            class164.method1332(false);
        }
        class341.method2331((byte) -78);
        int var9 = class673.field9483.field3107;
        if (class423.field6439 < var9) {
            var9 = class423.field6439;
        }
        if ((class423.field6439 - 1) > var9) {
            var9 = class423.field6439 - 1;
        }
        if (class17.field282.method2089(class497.field7259, -1)) {
            class244.method1744(0);
        } else {
            class244.method1744(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class275.field4426; var19++) {
                for (int var20 = 0; var20 < class417.field6374; var20++) {
                    class399.method2569(var10, false, var19, var20);
                }
            }
        }
        class412.method2622(1);
        class636.method3698(true);
        class589.method3445(83);
        class66.method705(0);
        class99.method961((byte) 81);
        if (class598.field8470 != null && class499.field7329 != null && class682.field9564 == 11) {
            class210.field3508++;
            class165 var11 = class271.method1917(class420.field6424, (byte) -79, class576.field8213);
            var11.field2776.method82(false, 1057001181);
            class642.method3726(-684096285, var11);
        }
        if (class265.field4319 == 0) {
            int var12 = (class456.field6843 - (class275.field4426 >> 4)) / 8;
            int var13 = ((class275.field4426 >> 4) + class456.field6843) / 8;
            int var14 = (class48.field641 - (class417.field6374 >> 4)) / 8;
            int var15 = ((class417.field6374 >> 4) + class48.field641) / 8;
            for (int var16 = var12 - 1; var16 <= var13 + 1; var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var13 < var16 || var14 > var17 || var15 < var17) {
                        class247.field3943.method921("m" + var16 + "_" + var17, -14517);
                        class247.field3943.method921("l" + var16 + "_" + var17, -14517);
                    }
                }
            }
        }
        if (class682.field9564 == 4) {
            class68.method715(3, (byte) -99);
        } else if (class682.field9564 == 8) {
            class68.method715(7, (byte) -106);
        } else {
            class68.method715(10, (byte) -77);
            if (class499.field7329 != null) {
                class165 var18 = class271.method1917(class420.field6424, (byte) -82, class548.field7981);
                class642.method3726(-684096285, var18);
            }
        }
        class544.method3290(-52);
        class636.method3698(true);
        class466.method2904((byte) -103);
        if (class572.field8175) {
            class529.method3200("Took: " + (class112.method1033(-11752) - class441.field6726) + "ms", -101);
            class572.field8175 = false;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field9439[0][var0] = class239.method1718(class239.method1718(var6 << 8, class239.method1718(class239.method1718(class239.method1718(class239.method1718(class239.method1718(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field9439[var16][var0] = class239.method1718(field9439[var16 - 1][var0] >>> 8, field9439[var16 - 1][var0] << 56);
            }
        }
        field9437[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field9437[var1] = class396.method2559(class396.method2559(class396.method2559(class340.method2328(field9439[5][var2 + 5], 16711680L), class396.method2559(class340.method2328(4278190080L, field9439[4][var2 + 4]), class396.method2559(class340.method2328(1095216660480L, field9439[3][var2 + 3]), class396.method2559(class396.method2559(class340.method2328(71776119061217280L, field9439[1][var2 + 1]), class340.method2328(field9439[0][var2], -72057594037927936L)), class340.method2328(280375465082880L, field9439[2][var2 + 2]))))), class340.method2328(65280L, field9439[6][var2 + 6])), class340.method2328(field9439[7][var2 + 7], 255L));
        }
    }
}
