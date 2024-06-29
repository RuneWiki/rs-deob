import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class103 extends class55 {

    @OriginalMember(owner = "client!ra", name = "md", descriptor = "I")
    public int field2627 = 0;

    @OriginalMember(owner = "client!ra", name = "cd", descriptor = "I")
    public int field2617 = -1;

    @OriginalMember(owner = "client!ra", name = "td", descriptor = "I")
    public int field2634 = 0;

    @OriginalMember(owner = "client!ra", name = "dd", descriptor = "I")
    public int field2618 = 0;

    @OriginalMember(owner = "client!ra", name = "kd", descriptor = "I")
    private int field2625 = 0;

    @OriginalMember(owner = "client!ra", name = "bd", descriptor = "I")
    public int field2616 = -1;

    @OriginalMember(owner = "client!ra", name = "vd", descriptor = "Z")
    public boolean field2636 = false;

    @OriginalMember(owner = "client!ra", name = "Gd", descriptor = "I")
    public int field2647 = 0;

    @OriginalMember(owner = "client!ra", name = "od", descriptor = "Lhb;")
    public static class44 field2629 = class102.method810("blinken1:", -28606);

    @OriginalMember(owner = "client!ra", name = "fd", descriptor = "Lhb;")
    public static class44 field2620 = class102.method810("redstone1", -28606);

    @OriginalMember(owner = "client!ra", name = "jd", descriptor = "Lhb;")
    public static class44 field2624 = class102.method810("Bitte versuchen Sie es erneut)3", -28606);

    @OriginalMember(owner = "client!ra", name = "pd", descriptor = "Lhb;")
    public static class44 field2630 = class102.method810("Bitte benutzen Sie eine andere Welt)3", -28606);

    @OriginalMember(owner = "client!ra", name = "Bd", descriptor = "Lhb;")
    public static class44 field2642 = class102.method810("leuchten3:", -28606);

    @OriginalMember(owner = "client!ra", name = "ed", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ra", name = "gd", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!ra", name = "hd", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!ra", name = "id", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ra", name = "nd", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!ra", name = "rd", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!ra", name = "sd", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ra", name = "wd", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!ra", name = "xd", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!ra", name = "zd", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!ra", name = "Ad", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ra", name = "Cd", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!ra", name = "Dd", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!ra", name = "Ed", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ra", name = "Fd", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ra", name = "Id", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ra", name = "Jd", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ra", name = "ud", descriptor = "Lta;")
    public static class113 field2635;

    @OriginalMember(owner = "client!ra", name = "Hd", descriptor = "Ldd;")
    public class23 field2648;

    @OriginalMember(owner = "client!ra", name = "yd", descriptor = "Lde;")
    public class24 field2639;

    @OriginalMember(owner = "client!ra", name = "qd", descriptor = "Lee;")
    public static class30 field2631;

    @OriginalMember(owner = "client!ra", name = "Kd", descriptor = "Lhb;")
    public class44 field2651;

    @OriginalMember(owner = "client!ra", name = "ld", descriptor = "Ljb;")
    public static class56 field2626;

    @OriginalMember(owner = "client!ra", name = "ad", descriptor = "[Lhc;")
    public static class45[] field2615;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method432(byte arg0) {
        ++field2641;
        if (arg0 > -48) {
            this.method209((byte) -78);
        }
        return this.field2648 != null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLwd;)V", line = 28)
    public final void method812(byte arg0, class131 arg1) {
        if (arg0 == 79) {
            ++field2650;
            arg1.field3182 = 0;
            int var3 = arg1.method971(true);
            int var4 = -1;
            this.field2617 = arg1.method982(-18000);
            this.field2616 = arg1.method982(-18000);
            this.field2634 = 0;
            int[] var5 = new int[12];
            for (int var6 = 0; ~var6 > -13; ++var6) {
                int var7 = arg1.method971(true);
                if (~var7 == -1) {
                    var5[var6] = 0;
                } else {
                    int var8 = arg1.method971(true);
                    var5[var6] = (var7 << 8) - -var8;
                    if (~var6 == -1 && ~var5[0] == -65536) {
                        var4 = arg1.method1001(65280);
                        break;
                    }
                    if (var5[var6] >= 512) {
                        int var12 = class42.method358(0, var5[var6] - 512).field2051;
                        if (~var12 != -1) {
                            this.field2634 = var12;
                        }
                    }
                }
            }
            int[] var9 = new int[5];
            for (int var10 = 0; ~var10 > -6; ++var10) {
                int var11 = arg1.method971(true);
                if (var11 < 0 || class121.field2961[var10].length <= var11) {
                    var11 = 0;
                }
                var9[var10] = var11;
            }
            super.field1388 = arg1.method1001(65280);
            if (~super.field1388 == -65536) {
                super.field1388 = -1;
            }
            super.field1391 = arg1.method1001(65280);
            if (~super.field1391 == -65536) {
                super.field1391 = -1;
            }
            super.field1356 = super.field1391;
            super.field1390 = arg1.method1001(65280);
            if (super.field1390 == 65535) {
                super.field1390 = -1;
            }
            super.field1370 = arg1.method1001(65280);
            if (~super.field1370 == -65536) {
                super.field1370 = -1;
            }
            super.field1417 = arg1.method1001(arg0 + 65201);
            if (~super.field1417 == -65536) {
                super.field1417 = -1;
            }
            super.field1333 = arg1.method1001(65280);
            if (~super.field1333 == -65536) {
                super.field1333 = -1;
            }
            super.field1400 = arg1.method1001(arg0 ^ 65359);
            if (~super.field1400 == -65536) {
                super.field1400 = -1;
            }
            this.field2651 = class43.method361(arg1.method1000((byte) -70), true).method395(21611);
            this.field2618 = arg1.method971(true);
            this.field2625 = arg1.method1001(65280);
            if (this.field2648 == null) {
                this.field2648 = new class23();
            }
            this.field2648.method176(93, var5, var9, var4, ~var3 == -2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILra;I)V", line = 144)
    public static final void method813(int arg0, int arg1, int arg2, class103 arg3, int arg4) {
        if (arg1 != 2000) {
            field2624 = null;
        }
        ++field2633;
        if (class72.field1820 != arg3) {
            if (class71.field1744 < 400) {
                class44 var5;
                if (~arg3.field2625 != -1) {
                    var5 = class117.method903(new class44[] { arg3.field2651, class131.field3180, class89.field2262, class116.method893(10, arg3.field2625), class82.field2118 }, false);
                } else {
                    var5 = class117.method903(new class44[] { arg3.field2651, class48.method457(class72.field1820.field2618, arg3.field2618, true), class131.field3180, class34.field829, class116.method893(arg1 ^ 2010, arg3.field2618), class82.field2118 }, false);
                }
                if (~class48.field1195 == -2) {
                    class52.method495(arg4, 3, arg2, arg0, 1000, class117.method903(new class44[] { class95.field2421, class55.field1354, var5 }, false), class11.field211);
                    ++class67.field1691;
                } else if (~class44.field1071 == -2) {
                    if (~(8 & class79.field1995) == -9) {
                        ++class129.field3098;
                        class52.method495(arg4, 37, arg2, arg0, 1000, class117.method903(new class44[] { client.field376, class55.field1354, var5 }, false), class13.field251);
                    }
                } else {
                    for (int var6 = 4; ~var6 <= -1; --var6) {
                        if (class64.field1616[var6] != null) {
                            ++class2.field65;
                            short var8 = 0;
                            if (class64.field1616[var6].method412(0, class130.field3111)) {
                                if (~class72.field1820.field2618 > ~arg3.field2618) {
                                    var8 = 2000;
                                }
                                if (class72.field1820.field2634 != 0 && arg3.field2634 != 0) {
                                    if (~class72.field1820.field2634 != ~arg3.field2634) {
                                        var8 = 0;
                                    } else {
                                        var8 = 2000;
                                    }
                                }
                            } else if (class27.field620[var6]) {
                                var8 = 2000;
                            }
                            int var9 = 0;
                            if (~var6 == -1) {
                                var9 = 30 - -var8;
                            }
                            if (var6 == 1) {
                                var9 = var8 + 51;
                            }
                            if (var6 == 2) {
                                var9 = var8 + 7;
                            }
                            if (~var6 == -4) {
                                var9 = var8 + 8;
                            }
                            if (var6 == 4) {
                                var9 = var8 + 33;
                            }
                            class52.method495(arg4, var9, arg2, arg0, arg1 ^ 1080, class117.method903(new class44[] { class25.field583, var5 }, false), class64.field1616[var6]);
                        }
                    }
                }
                for (int var7 = 0; ~class71.field1744 < ~var7; ++var7) {
                    if (class62.field1568[var7] == 26) {
                        class64.field1625[var7] = class117.method903(new class44[] { class48.field1194, class16.field318, class25.field583, var5 }, false);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "(I)V", line = 285)
    public static final void method814(int arg0) {
        ++field2645;
        int var1 = class129.field3105 + class72.field1820.field1371;
        int var2 = class15.field282 + class72.field1820.field1384;
        if (~(class9.field179 - var2) > 499 || -var2 + class9.field179 > 500 || -var1 + class57.field1507 < -500 || -var1 + class57.field1507 > 500) {
            class57.field1507 = var1;
            class9.field179 = var2;
        }
        if (~class9.field179 != ~var2) {
            class9.field179 += (-class9.field179 + var2) / 16;
        }
        int var3 = class9.field179 >> 7;
        if (class57.field1507 != var1) {
            class57.field1507 += (-class57.field1507 + var1) / 16;
        }
        if (class13.field257[96]) {
            class46.field1135 += (-class46.field1135 + -24) / 2;
        } else if (!class13.field257[97]) {
            class46.field1135 /= 2;
        } else {
            class46.field1135 += (24 - class46.field1135) / 2;
        }
        if (!class13.field257[98]) {
            if (!class13.field257[99]) {
                class94.field2404 /= 2;
            } else {
                class94.field2404 += (-class94.field2404 + -12) / 2;
            }
        } else {
            class94.field2404 += (-class94.field2404 + 12) / 2;
        }
        class85.field2176 = class46.field1135 / 2 + class85.field2176 & 2047;
        class116.field2849 += class94.field2404 / 2;
        int var4 = class57.field1507 >> 7;
        int var5 = 0;
        if (class116.field2849 < 128) {
            class116.field2849 = 128;
        }
        if (class116.field2849 > 383) {
            class116.field2849 = 383;
        }
        int var6 = class55.method507(class57.field1507, class79.field1993, class9.field179, -1);
        if (~var3 < -4 && ~var4 < -4 && ~var3 > -101 && var4 < 100) {
            for (int var7 = var3 + -4; ~var7 >= ~(var3 + 4); ++var7) {
                for (int var8 = var4 + -4; var4 + 4 >= var8; ++var8) {
                    int var9 = class79.field1993;
                    if (~var9 > -4 && ~(class104.field2668[1][var7][var8] & 2) == -3) {
                        ++var9;
                    }
                    int var10 = -class64.field1620[var9][var7][var8] + var6;
                    if (var10 > var5) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (arg0 != 30) {
            field2642 = null;
        }
        if (~var11 < -98049) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (var11 <= class15.field295) {
            if (~class15.field295 < ~var11) {
                class15.field295 += (var11 - class15.field295) / 80;
                return;
            }
        } else {
            class15.field295 += (-class15.field295 + var11) / 24;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIZIII)I", line = 400)
    public static final int method815(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field2649;
        if (~(1 & arg5) == -2) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = arg1 & 3;
        if (~var8 == -1) {
            return arg2;
        } else if (var8 == 1) {
            return arg0;
        } else if (~var8 == -3) {
            return -arg2 + 7 + -arg4 + 1;
        } else {
            if (arg3) {
                method819(true);
            }
            return 1 - (arg6 - (-arg0 + 7));
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILhb;Ljava/awt/Color;)V", line = 446)
    public static final void method816(int arg0, int arg1, class44 arg2, Color arg3) {
        ++field2623;
        try {
            Graphics var4 = class22.field483.getGraphics();
            if (class122.field2976 == null) {
                class122.field2976 = new Font("Helvetica", 1, 13);
                client.field390 = class22.field483.getFontMetrics(class122.field2976);
            }
            if (class104.field2665) {
                class104.field2665 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class27.field612, client.field391);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class4.field103 == null) {
                    class4.field103 = class22.field483.createImage(304, 34);
                }
                Graphics var5 = class4.field103.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                if (arg1 != -101) {
                    field2630 = null;
                }
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class122.field2976);
                var5.setColor(Color.white);
                arg2.method378(30719, 22, var5, (-arg2.method413(client.field390, 0) + 304) / 2);
                var4.drawImage(class4.field103, class27.field612 / 2 + -152, client.field391 / 2 + -18, (ImageObserver) null);
            } catch (Exception var8) {
                int var6 = client.field391 / 2 + -18;
                int var7 = class27.field612 / 2 - 152;
                var4.setColor(arg3);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class122.field2976);
                var4.setColor(Color.white);
                arg2.method378(30719, var6 + 22, var4, (304 - arg2.method413(client.field390, arg1 ^ -101)) / 2 + var7);
            }
        } catch (Exception var9) {
            class22.field483.repaint();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ltd;IZLtd;)V", line = 510)
    public static final void method817(class116 arg0, int arg1, boolean arg2, class116 arg3) {
        class1.field24 = arg2;
        if (arg1 < 83) {
            method816(-21, 63, (class44) null, (Color) null);
        }
        class75.field1900 = arg3;
        ++field2619;
        class43.field1001 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)Lde;", line = 538)
    public final class24 method209(byte arg0) {
        ++field2622;
        int var2 = -99 / ((35 - arg0) / 59);
        if (this.field2648 == null) {
            return null;
        } else {
            class118 var3 = super.field1415 != -1 && ~super.field1359 == -1 ? client.method139(1, super.field1415) : null;
            class118 var4 = ~super.field1361 == 0 || this.field2636 || ~super.field1388 == ~super.field1361 && var3 != null ? null : client.method139(1, super.field1361);
            class24 var5 = this.field2648.method172(var3, super.field1369, (byte) -81, super.field1334, var4);
            if (var5 == null) {
                return null;
            } else {
                var5.method205();
                super.field1351 = var5.field2466;
                if (!this.field2636 && ~super.field1353 != 0 && super.field1377 != -1) {
                    class24 var6 = class98.method773(-97, super.field1353).method826(-1, super.field1377);
                    if (var6 != null) {
                        var6.method198(0, -super.field1363, 0);
                        class24[] var7 = new class24[] { var5, var6 };
                        var5 = new class24(var7, 2, true);
                    }
                }
                if (!this.field2636 && this.field2639 != null) {
                    if (~this.field2647 >= ~class2.field73) {
                        this.field2639 = null;
                    }
                    if (~this.field2627 >= ~class2.field73 && ~class2.field73 > ~this.field2647) {
                        class24 var8 = this.field2639;
                        class24[] var9 = new class24[] { var5, var8 };
                        var8.method198(-super.field1384 + this.field2640, -this.field2644 + this.field2628, this.field2632 - super.field1371);
                        if (~super.field1407 == -513) {
                            var8.method194();
                            var8.method194();
                            var8.method194();
                        } else if (~super.field1407 == -1025) {
                            var8.method194();
                            var8.method194();
                        } else if (super.field1407 == 1536) {
                            var8.method194();
                        }
                        var5 = new class24(var9, 2, true);
                        if (super.field1407 != 512) {
                            if (super.field1407 != 1024) {
                                if (~super.field1407 == -1537) {
                                    var8.method194();
                                    var8.method194();
                                    var8.method194();
                                }
                            } else {
                                var8.method194();
                                var8.method194();
                            }
                        } else {
                            var8.method194();
                        }
                        var8.method198(-this.field2640 + super.field1384, this.field2644 - this.field2628, -this.field2632 + super.field1371);
                    }
                }
                var5.field530 = true;
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V", line = 637)
    public static void method818(byte arg0) {
        field2629 = null;
        field2624 = null;
        field2630 = null;
        field2615 = null;
        field2635 = null;
        field2626 = null;
        field2642 = null;
        if (arg0 < -112) {
            field2631 = null;
            field2620 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V", line = 660)
    public static final void method819(boolean arg0) {
        ++field2646;
        for (class61 var1 = (class61) class46.field1134.method443((byte) -111); var1 != null; var1 = (class61) class46.field1134.method434(true)) {
            if (var1.field1539 != null) {
                var1.method563((byte) -9);
            }
        }
        if (!arg0) {
            field2630 = null;
        }
    }
}
