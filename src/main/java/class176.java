import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class176 extends class376 {

    @OriginalMember(owner = "client!kv", name = "y", descriptor = "[I")
    private int[] field2487;

    @OriginalMember(owner = "client!kv", name = "N", descriptor = "[I")
    private int[] field2501;

    @OriginalMember(owner = "client!kv", name = "z", descriptor = "Loc;")
    private class136 field2488;

    @OriginalMember(owner = "client!kv", name = "L", descriptor = "Loc;")
    private class136 field2499;

    @OriginalMember(owner = "client!kv", name = "Q", descriptor = "Loc;")
    private class136 field2504;

    @OriginalMember(owner = "client!kv", name = "G", descriptor = "[Loc;")
    private class136[] field2494;

    @OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
    public static int field2498 = 1;

    @OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
    public static int field2497 = 0;

    @OriginalMember(owner = "client!kv", name = "P", descriptor = "Lgk;")
    public static class331 field2503 = new class331("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!kv", name = "H", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!kv", name = "I", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!kv", name = "M", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!kv", name = "O", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "(B)V", line = 10)
    public static final void method1230(byte arg0) {
        field2495++;
        class473.method2860(-126, false);
        class487.field7157 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class265.field3914.length; var2++) {
            if (class413.field6138[var2] != -1 && class265.field3914[var2] == null) {
                class265.field3914[var2] = class91.field1256.method2363(0, class413.field6138[var2], 118);
                if (class265.field3914[var2] == null) {
                    class487.field7157++;
                    var1 = false;
                }
            }
            if (class506.field7491[var2] != -1 && class264.field3877[var2] == null) {
                class264.field3877[var2] = class91.field1256.method2380(class506.field7491[var2], 0, class471.field6962[var2], (byte) -103);
                if (class264.field3877[var2] == null) {
                    class487.field7157++;
                    var1 = false;
                }
            }
            if (class289.field4156[var2] != -1 && class213.field3061[var2] == null) {
                class213.field3061[var2] = class91.field1256.method2363(0, class289.field4156[var2], 121);
                if (class213.field3061[var2] == null) {
                    class487.field7157++;
                    var1 = false;
                }
            }
            if (class446.field6598[var2] != -1 && class237.field3484[var2] == null) {
                class237.field3484[var2] = class91.field1256.method2363(0, class446.field6598[var2], 126);
                if (class237.field3484[var2] == null) {
                    class487.field7157++;
                    var1 = false;
                }
            }
            if (class455.field6700 != null && class307.field4359[var2] == null && class455.field6700[var2] != -1) {
                class307.field4359[var2] = class91.field1256.method2380(class455.field6700[var2], 0, class471.field6962[var2], (byte) -104);
                if (class307.field4359[var2] == null) {
                    class487.field7157++;
                    var1 = false;
                }
            }
        }
        if (class125.field1822 == null) {
            if (class82.field1113 == null || !class161.field2270.method2366(class82.field1113.field4964 + "_staticelements", -1)) {
                class125.field1822 = new class14(0);
            } else if (class161.field2270.method2362(-1, class82.field1113.field4964 + "_staticelements")) {
                class125.field1822 = class434.method2633(class161.field2270, 28, class82.field1113.field4964 + "_staticelements", class49.field542);
            } else {
                var1 = false;
                class487.field7157++;
            }
        }
        if (!var1) {
            class488.field7181 = 1;
            return;
        }
        boolean var3 = true;
        class287.field4145 = 0;
        for (int var4 = 0; var4 < class265.field3914.length; var4++) {
            byte[] var19 = class264.field3877[var4];
            if (var19 != null) {
                int var20 = (class411.field6110[var4] >> 8) * 64 - class340.field4713;
                int var21 = (class411.field6110[var4] & 0xFF) * 64 - class476.field7013;
                if (class507.field7494 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class50.method504(class397.field5828, var20, class457.field6713, var19, var21, arg0 + 130);
            }
            byte[] var22 = class237.field3484[var4];
            if (var22 != null) {
                int var23 = (class411.field6110[var4] >> 8) * 64 - class340.field4713;
                int var24 = (class411.field6110[var4] & 0xFF) * 64 - class476.field7013;
                if (class507.field7494 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class50.method504(class397.field5828, var23, class457.field6713, var22, var24, arg0 + 130);
            }
        }
        if (!var3) {
            class488.field7181 = 2;
            return;
        }
        if (class488.field7181 != 0) {
            class195.method1364(true, class179.field2529.method2031(true, class377.field5585) + "<br>(100%)", class396.field5802, 13);
        }
        class106.method876((byte) -109);
        class180.method1264((byte) 68);
        boolean var5 = false;
        if (class225.field3300.method323() && class478.field7044.field3321) {
            for (int var6 = 0; var6 < class265.field3914.length; var6++) {
                if (class237.field3484[var6] != null || class213.field3061[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class478.field7044.field3339) {
            var7 = class67.field865[class509.field7518];
        } else {
            var7 = class386.field5693[class509.field7518];
        }
        if (class225.field3300.method356()) {
            var7++;
        }
        class96.method829(7, 4, class397.field5828, class457.field6713, var7, var5, class225.field3300.method322() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class455.field6684[var8].method566(-121);
        }
        class130.method1001((byte) 18);
        class8.method52(false, arg0 - 31518);
        class162.method1139((byte) 60);
        class423.field6245 = null;
        class106.method876((byte) -109);
        System.gc();
        class473.method2860(-120, true);
        class405.method2491((byte) 103);
        class120.field1672 = class478.field7044.method1536(class65.field802, (byte) -28);
        class200.field2936 = class352.field4882 >= 96;
        class521.field7663 = class478.field7044.field3321;
        class288.field4150 = class478.field7044.method1540(29083, class65.field802);
        class138.field1974 = !class478.field7044.field3320;
        class380.field5612 = class478.field7044.method2072(class65.field802, arg0 + 1) ? -1 : class51.field575;
        class195.field2847 = class478.field7044.field3356;
        class510.field7523 = class65.field802 == 1 || class478.field7044.field3314;
        class283.field4116 = new class507(4, class397.field5828, class457.field6713, false);
        if (class507.field7494 == 0) {
            class308.method1911(class283.field4116, class265.field3914, -32652);
        } else {
            class380.method2326(class283.field4116, 8, class265.field3914);
        }
        class299.method1880((byte) 121, class397.field5828 >> 4, class457.field6713 >> 4);
        class183.method1291(-12388);
        if (var5) {
            class476.method2876(true);
            class250.field3689 = new class507(1, class397.field5828, class457.field6713, true);
            if (class507.field7494 == 0) {
                class308.method1911(class250.field3689, class213.field3061, -32652);
                class473.method2860(-110, true);
            } else {
                class380.method2326(class250.field3689, 8, class213.field3061);
                class473.method2860(-104, true);
            }
            class250.field3689.method1733(arg0 - 126, class283.field4116.field3996[0], 0);
            class250.field3689.method1735(null, (byte) -70, null, class225.field3300);
            class476.method2876(false);
        }
        class283.field4116.method1735(var5 ? class250.field3689.field3996 : null, (byte) -82, class455.field6684, class225.field3300);
        if (class507.field7494 == 0) {
            class473.method2860(-112, true);
            class420.method2580((byte) -77, class283.field4116, class264.field3877);
            if (class307.field4359 != null) {
                class353.method2127(arg0 - 8407);
            }
        } else {
            class473.method2860(-108, true);
            class442.method2698(class283.field4116, class264.field3877, (byte) 102);
        }
        class180.method1264((byte) 113);
        class473.method2860(-95, true);
        class283.field4116.method1736(arg0 + 21354, null, var5 ? class52.field578[0] : null, class225.field3300);
        class283.field4116.method3031(119, class225.field3300);
        if (arg0 != 125) {
            method1234(72);
        }
        class473.method2860(-34, true);
        if (var5) {
            class476.method2876(true);
            class473.method2860(-119, true);
            if (class507.field7494 == 0) {
                class420.method2580((byte) -102, class250.field3689, class237.field3484);
            } else {
                class442.method2698(class250.field3689, class237.field3484, (byte) 105);
            }
            class180.method1264((byte) 56);
            class473.method2860(-38, true);
            class250.field3689.method1736(21479, class283.field4115[0], null, class225.field3300);
            class250.field3689.method3031(122, class225.field3300);
            class473.method2860(-112, true);
            class476.method2876(false);
        }
        class339.method2057((byte) 120);
        int var9 = class283.field4116.field7499;
        if (var9 > class525.field7714) {
            var9 = class525.field7714;
        }
        if ((class525.field7714 - 1) > var9) {
            var9 = class525.field7714 - 1;
        }
        if (class478.field7044.method2072(class65.field802, arg0 - 12)) {
            class24.method205(0);
        } else {
            class24.method205(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class397.field5828; var17++) {
                for (int var18 = 0; var18 < class457.field6713; var18++) {
                    class325.method2012(var10, arg0 + 1546660522, var17, var18);
                }
            }
        }
        class524.method3110(arg0 - 125);
        class106.method876((byte) -109);
        class435.method2635(0);
        class180.method1264((byte) 121);
        class485.field7133 = false;
        class51.method506((byte) -98);
        if (class245.field3611 != null && class383.field5635 != null && class113.field1589 == 25) {
            class23.field247++;
            class32.method258(-117, class481.field7078);
            class472.field6970.method618(1057001181, (byte) -62);
        }
        if (class507.field7494 == 0) {
            int var11 = (class60.field695 - (class397.field5828 >> 4)) / 8;
            int var12 = ((class397.field5828 >> 4) + class60.field695) / 8;
            int var13 = (class251.field3702 - (class457.field6713 >> 4)) / 8;
            int var14 = ((class457.field6713 >> 4) + class251.field3702) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var12 < var15 || var16 < var13 || var14 < var16) {
                        class91.field1256.method2385(arg0 ^ 0x19, "m" + var15 + "_" + var16);
                        class91.field1256.method2385(100, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class113.field1589 == 28) {
            class432.method2619((byte) 29, 10);
        } else {
            class432.method2619((byte) 84, 30);
            if (class383.field5635 != null) {
                class32.method258(arg0 ^ 0xFFFFFFE9, class81.field1107);
            }
        }
        class477.method2884(126);
        class106.method876((byte) -109);
        class350.method2108((byte) 124);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLfs;Lga;)Z", line = 465)
    public final boolean method1231(byte arg0, class387 arg1, class277 arg2) {
        field2489++;
        if (class153.field2179 < 0) {
            for (int var4 = 0; var4 < this.field2487.length; var4++) {
                if (!arg1.method2384(-1, this.field2487[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2487.length; var5++) {
                if (!arg1.method2357(this.field2487[var5], (byte) -124, class153.field2179)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2501.length; var6++) {
            if (!arg2.method1776(this.field2501[var6], 19378)) {
                return false;
            }
        }
        int var7 = -15 % ((arg0 + 72) / 53);
        return true;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lga;IZZLfs;DII)[I", line = 519)
    public final int[] method1232(class277 arg0, int arg1, boolean arg2, boolean arg3, class387 arg4, double arg5, int arg6, int arg7) {
        class17.field196 = arg4;
        class466.field6841 = arg0;
        field2500++;
        for (int var10 = 0; var10 < this.field2494.length; var10++) {
            this.field2494[var10].method661(arg6, (byte) -54, arg7);
        }
        class291.method1841(arg5, (byte) -38);
        class258.method1662(arg6, 9188, arg7);
        int[] var11 = new int[arg6 * arg7];
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var12 = -1;
            var13 = arg7 - 1;
            var14 = -1;
        } else {
            var14 = 1;
            var12 = arg7;
            var13 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2499.field1966) {
                int[] var22 = this.field2499.method82(125, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field2499.method272((byte) 45, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg3) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class470.field6943[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class470.field6943[var25];
                int var29 = class470.field6943[var26];
                int var30 = (var28 << 8) + (var27 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg3) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2494.length; var17++) {
            this.field2494[var17].method659(126);
        }
        if (arg1 >= -34) {
            field2503 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[Luu;IIZ)V", line = 653)
    public static final void method1233(int arg0, int arg1, class188[] arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 != 22611) {
            method1239(-98);
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class188 var7 = arg2[var6];
            if (var7 != null && var7.field2745 == arg4) {
                class122.method971(arg5, arg0, var7, 46, arg1);
                class523.method3109(var7, arg0, arg1, 2);
                if (var7.field2700 > (var7.field2694 - var7.field2711)) {
                    var7.field2700 = var7.field2694 - var7.field2711;
                }
                if (var7.field2700 < 0) {
                    var7.field2700 = 0;
                }
                if (var7.field2744 > (var7.field2712 - var7.field2672)) {
                    var7.field2744 = var7.field2712 - var7.field2672;
                }
                if (var7.field2744 < 0) {
                    var7.field2744 = 0;
                }
                if (var7.field2727 == 0) {
                    class140.method1050(var7, -1, arg5);
                }
            }
        }
        field2502++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I", line = 698)
    public static final int method1234(int arg0) {
        field2492++;
        if (arg0 != 8458) {
            field2497 = -3;
        }
        return class108.field1535;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IC)Z", line = 709)
    public static final boolean method1235(int arg0, char arg1) {
        field2490++;
        if (arg0 > -105) {
            method1239(52);
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIZ)V", line = 725)
    public static final void method1236(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            class323.field4538--;
            if (class323.field4538 == 0) {
                class37.field413 = null;
            }
        }
        if (arg0) {
            class110.field1557--;
            if (class110.field1557 == 0) {
                class121.field1717 = null;
            }
        }
        if (arg1 != 478210754) {
            field2497 = -106;
        }
        field2491++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IBLfs;Lga;IDZ)[I", line = 757)
    public final int[] method1237(int arg0, byte arg1, class387 arg2, class277 arg3, int arg4, double arg5, boolean arg6) {
        class466.field6841 = arg3;
        class17.field196 = arg2;
        field2493++;
        if (arg1 != 110) {
            this.method1238(true, null, null, -27, true, 80);
        }
        for (int var9 = 0; var9 < this.field2494.length; var9++) {
            this.field2494[var9].method661(arg4, (byte) -54, arg0);
        }
        class291.method1841(arg5, (byte) -85);
        class258.method1662(arg4, 9188, arg0);
        int[] var10 = new int[arg0 * 4 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2499.field1966) {
                int[] var14 = this.field2499.method82(arg1 + 15, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2499.method272((byte) 35, var12);
                var17 = var18[0];
                var16 = var18[1];
                var15 = var18[2];
            }
            if (arg6) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2504.field1966) {
                var19 = this.field2504.method82(126, var12);
            } else {
                var19 = this.field2504.method272((byte) 40, var12)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class470.field6943[var21];
                int var25 = class470.field6943[var22];
                int var26 = class470.field6943[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + ((var27 << 24) + (var24 << 16)) + var26;
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2494.length; var13++) {
            this.field2494[var13].method659(125);
        }
        return var10;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZLga;Lfs;IZI)[F", line = 901)
    public final float[] method1238(boolean arg0, class277 arg1, class387 arg2, int arg3, boolean arg4, int arg5) {
        field2496++;
        if (arg0) {
            method1236(false, -57, false);
        }
        class17.field196 = arg2;
        class466.field6841 = arg1;
        for (int var7 = 0; var7 < this.field2494.length; var7++) {
            this.field2494[var7].method661(arg5, (byte) -54, arg3);
        }
        class258.method1662(arg5, 9188, arg3);
        float[] var8 = new float[arg3 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2499.field1966) {
                int[] var16 = this.field2499.method82(-101, var10);
                var13 = var16;
                var15 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field2499.method272((byte) 37, var10);
                var13 = var12[2];
                var14 = var12[0];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field2504.field1966) {
                var17 = this.field2504.method82(124, var10);
            } else {
                var17 = this.field2504.method272((byte) 35, var10)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2488.field1966) {
                var18 = this.field2488.method82(127, var10);
            } else {
                var18 = this.field2488.method272((byte) 111, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg4) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2494.length; var11++) {
            this.field2494[var11].method659(125);
        }
        return var8;
    }

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "(I)V", line = 1013)
    public static void method1239(int arg0) {
        field2503 = null;
        if (arg0 != 26270) {
            method1239(51);
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "()V", line = 1031)
    public class176() {
        this.field2487 = new int[0];
        this.field2501 = new int[0];
        this.field2488 = new class456(0);
        this.field2488.field1951 = 1;
        this.field2499 = new class456();
        this.field2499.field1951 = 1;
        this.field2504 = new class456();
        this.field2504.field1951 = 1;
        this.field2494 = new class136[] { this.field2499, this.field2504, this.field2488 };
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Liv;)V", line = 1046)
    public class176(class65 arg0) {
        int var2 = arg0.method577(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2494 = new class136[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class136 var16 = class358.method2157(arg0, (byte) -121);
            if (var16.method1034(-1) >= 0) {
                var3++;
            }
            if (var16.method660(3) >= 0) {
                var4++;
            }
            int var17 = var16.field1954.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method577(255);
            }
            this.field2494[var6] = var16;
        }
        this.field2487 = new int[var3];
        int var7 = 0;
        this.field2501 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class136 var11 = this.field2494[var9];
            int var12 = var11.field1954.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1954[var13] = this.field2494[var5[var9][var13]];
            }
            int var14 = var11.method1034(-1);
            int var15 = var11.method660(3);
            if (var14 > 0) {
                this.field2487[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2501[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2499 = this.field2494[arg0.method577(255)];
        this.field2504 = this.field2494[arg0.method577(255)];
        Object var10 = null;
        this.field2488 = this.field2494[arg0.method577(255)];
    }
}
