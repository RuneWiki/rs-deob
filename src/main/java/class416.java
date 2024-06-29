import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class416 extends class270 {

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    private int field6021 = 204;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    private int field6018 = 1;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    private int field6029 = 1;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "[B")
    public static byte[] field6022 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[I")
    public static int[] field6027 = new int[1024];

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "Lfh;")
    public static class210 field6028;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "Len;")
    public static class249 field6016;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "[[S")
    public static short[][] field6026;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V", line = 4)
    public static final void method2600(byte arg0) {
        class336.method2187(-51, false);
        ++field6025;
        class382.field5437 = 0;
        boolean var1 = true;
        for (int var2 = 0; class79.field1343.length > var2; ++var2) {
            if (~class358.field5114[var2] != 0 && class79.field1343[var2] == null) {
                class79.field1343[var2] = class119.field1862.method1355(0, -12607, class358.field5114[var2]);
                if (class79.field1343[var2] == null) {
                    ++class382.field5437;
                    var1 = false;
                }
            }
            if (class85.field1373[var2] != -1 && class403.field5895[var2] == null) {
                class403.field5895[var2] = class119.field1862.method1342(0, -123, class85.field1373[var2], class151.field2314[var2]);
                if (class403.field5895[var2] == null) {
                    var1 = false;
                    ++class382.field5437;
                }
            }
            if (class253.field3665[var2] != -1 && class188.field2779[var2] == null) {
                class188.field2779[var2] = class119.field1862.method1355(0, -12607, class253.field3665[var2]);
                if (class188.field2779[var2] == null) {
                    ++class382.field5437;
                    var1 = false;
                }
            }
            if (class92.field1453[var2] != -1 && class347.field4906[var2] == null) {
                class347.field4906[var2] = class119.field1862.method1355(0, -12607, class92.field1453[var2]);
                if (class347.field4906[var2] == null) {
                    var1 = false;
                    ++class382.field5437;
                }
            }
            if (class388.field5565 != null && class61.field983[var2] == null && class388.field5565[var2] != -1) {
                class61.field983[var2] = class119.field1862.method1342(0, -104, class388.field5565[var2], class151.field2314[var2]);
                if (class61.field983[var2] == null) {
                    ++class382.field5437;
                    var1 = false;
                }
            }
        }
        if (class141.field2233 == null) {
            if (class289.field4307 != null && class49.field785.method1356(class289.field4307.field4360 + "_staticelements", (byte) 123)) {
                if (!class49.field785.method1329(class289.field4307.field4360 + "_staticelements", 0)) {
                    ++class382.field5437;
                    var1 = false;
                } else {
                    class141.field2233 = class76.method597(0, class121.field1908, class289.field4307.field4360 + "_staticelements", class49.field785);
                }
            } else {
                class141.field2233 = new class378(0);
            }
        }
        if (!var1) {
            class326.field4695 = 1;
        } else {
            class176.field2629 = 0;
            boolean var3 = true;
            for (int var4 = 0; class79.field1343.length > var4; ++var4) {
                byte[] var20 = class403.field5895[var4];
                if (var20 != null) {
                    int var21 = (class79.field1336[var4] >> 8) * 64 + -class379.field5384;
                    int var22 = (class79.field1336[var4] & 255) * 64 + -class294.field4362;
                    if (class322.field4650) {
                        var22 = 10;
                        var21 = 10;
                    }
                    var3 &= class170.method1298(1, var20, var22, var21);
                }
                byte[] var23 = class347.field4906[var4];
                if (var23 != null) {
                    int var24 = (class79.field1336[var4] >> 8) * 64 + -class379.field5384;
                    int var25 = (255 & class79.field1336[var4]) * 64 - class294.field4362;
                    if (class322.field4650) {
                        var25 = 10;
                        var24 = 10;
                    }
                    var3 &= class170.method1298(1, var23, var25, var24);
                }
            }
            if (!var3) {
                class326.field4695 = 2;
            } else {
                if (class326.field4695 != 0) {
                    class30.method228(true, class117.field1851 + "<br>(100%)", class107.field1763, true);
                }
                class11.method65((byte) -103);
                class403.method2556(0);
                boolean var5 = false;
                if (class73.field1235.method694() && class303.field4424) {
                    for (int var6 = 0; class79.field1343.length > var6; ++var6) {
                        if (class347.field4906[var6] != null || class188.field2779[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class322.field4645) {
                    var7 = class8.field108[class389.field5596];
                } else {
                    var7 = class402.field5878[class389.field5596];
                }
                if (class73.field1235.method668()) {
                    ++var7;
                }
                class88.method663(4, class183.field2703, class66.field1056, var7, var5, class73.field1235.method757() > 0);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class322.field4646[var8].method1249(-127);
                }
                class270.method1929(0);
                class267.method1907(false, (byte) 0);
                class76.method596((byte) 79);
                class11.method65((byte) 52);
                System.gc();
                class336.method2187(-51, true);
                if (arg0 <= 115) {
                    method2601((byte) -54, (class39) null);
                }
                class390.method2477(4, (byte) 55);
                int[][] var9 = null;
                if (!class322.field4650) {
                    class73.method583(false, -72);
                    class257.method1856(class86.field1394.field5696[0] >> 3, false, class86.field1394.field5694[0] >> 3);
                    class289.method2032(3);
                    class294.method2051((int[][]) null, false, 4, class73.field1235, 0);
                    var9 = class275.field4146[0];
                    class336.method2187(-51, true);
                    class217.method1642(false, 44);
                    if (class61.field983 != null) {
                        class268.method1913(true);
                    }
                }
                if (class322.field4650) {
                    class120.method1009(11260, false);
                    class257.method1856(class86.field1394.field5696[0] >> 3, false, class86.field1394.field5694[0] >> 3);
                    class289.method2032(3);
                    class294.method2051((int[][]) null, false, 4, class73.field1235, 0);
                    var9 = class275.field4146[0];
                    class336.method2187(-51, true);
                    class256.method1850(15089, false);
                }
                class403.method2556(0);
                class336.method2187(-51, true);
                class83.method641(4, class73.field1235, (class126) null, false, 106, class322.field4646);
                class99.method822(4, class73.field1235, (byte) 110);
                class336.method2187(-51, true);
                int var10 = class305.field4455;
                if (~var10 < ~class367.field5213) {
                    var10 = class367.field5213;
                }
                if (var10 < class367.field5213 + -1) {
                    var10 = class367.field5213 + -1;
                }
                if (class122.method1034(24037)) {
                    class193.method1486(0);
                } else {
                    class193.method1486(var10);
                }
                class136.method1116(0);
                if (var5) {
                    class379.method2403(true);
                    class390.method2477(1, (byte) 55);
                    if (!class322.field4650) {
                        class73.method583(true, -69);
                        class294.method2051(var9, true, 1, class73.field1235, 0);
                        class336.method2187(-51, true);
                        class217.method1642(true, 26);
                        class99.method822(1, class73.field1235, (byte) 103);
                    }
                    if (class322.field4650) {
                        class120.method1009(11260, true);
                        class294.method2051(var9, true, 1, class73.field1235, 0);
                        class336.method2187(-51, true);
                        class256.method1850(15089, true);
                    }
                    class403.method2556(0);
                    class336.method2187(-51, true);
                    class83.method641(1, class73.field1235, class311.field4527[0], true, -121, class322.field4646);
                    class99.method822(1, class73.field1235, (byte) 108);
                    class336.method2187(-51, true);
                    class136.method1116(0);
                    class379.method2403(false);
                }
                for (int var11 = 0; ~var11 > -4; ++var11) {
                    for (int var18 = 0; class183.field2703 > var18; ++var18) {
                        for (int var19 = 0; var19 < class66.field1056; ++var19) {
                            class257.method1852(var18, var19, -72, var11);
                        }
                    }
                }
                class364.method2327(3891);
                class11.method65((byte) -58);
                class383.method2427(86);
                class403.method2556(0);
                class228.field3333 = false;
                class303.method2072((byte) -45);
                if (class239.field3443 != null && class124.field2028 != null && ~class240.field3463 == -26) {
                    class13.field216.method2781(false, 77);
                    ++class124.field1961;
                    class13.field216.method275(1057001181, 1414495172);
                }
                if (!class322.field4650) {
                    int var12 = (-(class183.field2703 >> 4) + class135.field2160) / 8;
                    int var13 = ((class183.field2703 >> 4) + class135.field2160) / 8;
                    int var14 = (class231.field3378 - (class66.field1056 >> 4)) / 8;
                    int var15 = ((class66.field1056 >> 4) + class231.field3378) / 8;
                    for (int var16 = var12 - 1; var13 + 1 >= var16; ++var16) {
                        for (int var17 = var14 + -1; var17 <= var15 + 1; ++var17) {
                            if (var16 < var12 || ~var13 > ~var16 || var17 < var14 || ~var17 < ~var15) {
                                class119.field1862.method1331(true, "m" + var16 + "_" + var17);
                                class119.field1862.method1331(true, "l" + var16 + "_" + var17);
                            }
                        }
                    }
                }
                if (~class240.field3463 != -29) {
                    class168.method1288(-6, 30);
                    if (class124.field2028 != null) {
                        class13.field216.method2781(false, 186);
                    }
                } else {
                    class168.method1288(-6, 10);
                }
                class428.method2672((byte) -106);
                class11.method65((byte) -124);
                class79.method627(-35);
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)[I", line = 443)
    public final int[] method81(byte arg0, int arg1) {
        if (arg0 < 26) {
            method2601((byte) -82, (class39) null);
        }
        ++field6017;
        int[] var3 = super.field4053.method396(arg1, -15);
        if (super.field4053.field815) {
            for (int var4 = 0; class161.field2445 > var4; ++var4) {
                int var5 = class136.field2168[var4];
                int var6 = class364.field5185[arg1];
                int var7 = this.field6018 * var5 >> 12;
                int var8 = this.field6029 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6018) * this.field6018;
                int var10 = var6 % (4096 / this.field6029) * this.field6029;
                if (this.field6021 > var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field6021) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field6021) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 819)
    public class416() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLis;)V", line = 533)
    public static final void method2601(byte arg0, class39 arg1) {
        ++field6024;
        arg1.field604 = null;
        if (class164.field2470 < 20) {
            class230.field3362.method2483(120, arg1);
            ++class164.field2470;
        }
        if (arg0 < 10) {
            method2600((byte) -62);
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V", line = 551)
    public static void method2602(int arg0) {
        field6016 = null;
        if (arg0 == -29) {
            field6022 = null;
            field6027 = null;
            field6026 = null;
            field6028 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILmb;B)I", line = 569)
    public static final int method2603(int arg0, class258 arg1, byte arg2) {
        ++field6020;
        if (arg1.field3748 != null && arg0 < arg1.field3748.length) {
            try {
                int[] var3 = arg1.field3748[arg0];
                int var4 = -3 % ((arg2 - 67) / 46);
                int var5 = 0;
                int var6 = 0;
                byte var7 = 0;
                while (true) {
                    int var8 = var3[var6++];
                    int var9 = 0;
                    byte var10 = 0;
                    if (var8 == 0) {
                        return var5;
                    }
                    if (~var8 == -2) {
                        var9 = class334.field4793[var3[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = class157.field2399[var3[var6++]];
                    }
                    if (~var8 == -4) {
                        var9 = class350.field4977[var3[var6++]];
                    }
                    if (var8 == 4) {
                        int var11 = var3[var6++] << 16;
                        int var12 = var11 + var3[var6++];
                        class258 var13 = class342.method2207(var12, (byte) 14);
                        int var14 = var3[var6++];
                        if (~var14 != 0 && (!class206.method1561(-119, var14).field2001 || class121.field1908)) {
                            for (int var15 = 0; var13.field3847.length > var15; ++var15) {
                                if (~(var14 + 1) == ~var13.field3847[var15]) {
                                    var9 += var13.field3837[var15];
                                }
                            }
                        }
                    }
                    if (~var8 == -6) {
                        var9 = class351.field4988[var3[var6++]];
                    }
                    if (~var8 == -7) {
                        var9 = class320.field4617[class157.field2399[var3[var6++]] + -1];
                    }
                    if (var8 == 7) {
                        var9 = 100 * class351.field4988[var3[var6++]] / 46875;
                    }
                    if (~var8 == -9) {
                        var9 = class86.field1394.field2065;
                    }
                    if (~var8 == -10) {
                        for (int var16 = 0; var16 < 25; ++var16) {
                            if (class268.field4024[var16]) {
                                var9 += class157.field2399[var16];
                            }
                        }
                    }
                    if (var8 == 10) {
                        int var17 = var3[var6++] << 16;
                        int var18 = var17 + var3[var6++];
                        class258 var19 = class342.method2207(var18, (byte) 14);
                        int var20 = var3[var6++];
                        if (var20 != -1 && (!class206.method1561(108, var20).field2001 || class121.field1908)) {
                            for (int var21 = 0; ~var19.field3847.length < ~var21; ++var21) {
                                if (~(var20 - -1) == ~var19.field3847[var21]) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var8 == -12) {
                        var9 = class324.field4665;
                    }
                    if (~var8 == -13) {
                        var9 = class439.field6383;
                    }
                    if (var8 == 13) {
                        int var22 = class351.field4988[var3[var6++]];
                        int var23 = var3[var6++];
                        var9 = ~(1 << var23 & var22) == -1 ? 0 : 1;
                    }
                    if (var8 == 14) {
                        int var24 = var3[var6++];
                        var9 = class351.method2252(var24, (byte) -38);
                    }
                    if (var8 == 15) {
                        var10 = 1;
                    }
                    if (~var8 == -17) {
                        var10 = 2;
                    }
                    if (var8 == 18) {
                        var9 = (class86.field1394.field6520 >> 7) + class379.field5384;
                    }
                    if (var8 == 17) {
                        var10 = 3;
                    }
                    if (~var8 == -20) {
                        var9 = (class86.field1394.field6519 >> 7) + class294.field4362;
                    }
                    if (var8 == 20) {
                        var9 = var3[var6++];
                    }
                    if (var10 == 0) {
                        if (~var7 == -1) {
                            var5 += var9;
                        }
                        if (~var7 == -2) {
                            var5 -= var9;
                        }
                        if (~var7 == -3 && var9 != 0) {
                            var5 /= var9;
                        }
                        if (var7 == 3) {
                            var5 *= var9;
                        }
                        var7 = 0;
                    } else {
                        var7 = var10;
                    }
                }
            } catch (Exception var25) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLec;I)V", line = 772)
    public final void method78(byte arg0, class37 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field6021 = arg1.method320((byte) -87);
                }
            } else {
                this.field6029 = arg1.method271((byte) 117);
            }
        } else {
            this.field6018 = arg1.method271((byte) 110);
        }
        if (arg0 != 108) {
            method2604((byte) -51);
        }
        ++field6019;
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)V", line = 833)
    public static final void method2604(byte arg0) {
        ++field6023;
        if (arg0 <= -79) {
            for (int var1 = 0; ~var1 > -6; ++var1) {
                class1.field6[var1] = false;
            }
            class98.field1547 = -1;
            class322.field4643 = 1;
            class376.field5330 = -1;
            class377.field5369 = 0;
            class273.field4106 = 0;
        }
    }
}
