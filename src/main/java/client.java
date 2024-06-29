import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class194 {

    @OriginalMember(owner = "client!client", name = "U", descriptor = "[Z")
    public static boolean[] field4539 = new boolean[200];

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "Lsf;")
    public static class108 field4531 = class140.method973(255, "Chargement des textures )2 ");

    @OriginalMember(owner = "client!client", name = "N", descriptor = "Lsf;")
    public static class108 field4532 = class140.method973(255, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field4550;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "[[B")
    public static byte[][] field4529;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method1812(boolean arg0) {
        field4530++;
        class145.field2619.method644((byte) 84);
        if (!arg0) {
            method1822((class98) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 15)
    public final void init() {
        field4541++;
        if (!this.method1373((byte) 125)) {
            return;
        }
        class120.field2059 = Integer.parseInt(this.getParameter("worldid"));
        class220.field3910 = Integer.parseInt(this.getParameter("modewhere"));
        if (class220.field3910 < 0 || class220.field3910 > 1) {
            class220.field3910 = 0;
        }
        class96.field1532 = Integer.parseInt(this.getParameter("modewhat"));
        if (class96.field1532 < 0 || class96.field1532 > 2) {
            class96.field1532 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class329.field5618 = true;
        } else {
            class329.field5618 = false;
        }
        try {
            class88.field1393 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class88.field1393 = 0;
        }
        class195.method1389(class88.field1393, (byte) -91);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class70.field1083 = true;
        } else {
            class70.field1083 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class19.field281 = true;
        } else {
            class19.field281 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class223.field3947 = 1;
        } else {
            class223.field3947 = 0;
        }
        try {
            class247.field4269 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class247.field4269 = 0;
        }
        class160.field2869 = class47.field694.method748(255, this);
        if (class160.field2869 == null) {
            class160.field2869 = class63.field1016;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class278.field4885 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class278.field4885 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class74.field1130 = true;
        } else {
            class74.field1130 = false;
        }
        class5.field73 = this;
        this.method1384((byte) -74, 524, 765, class96.field1532 + 32, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 104)
    private final void method1813(int arg0) {
        field4545++;
        for (class137.field2429 = 0; class90.method608(arg0 - 8589) && class137.field2429 < 128; class137.field2429++) {
            class197.field3562[class137.field2429] = class115.field1989;
            class91.field1427[class137.field2429] = class285.field4981;
        }
        class195.field3534++;
        if (arg0 != 8598) {
            field4529 = (byte[][]) ((byte[][]) null);
        }
        if (class322.field5511 != -1) {
            class326.method2229(class322.field5511, (byte) 114, 0, 0, class21.field331, 0, 0, class73.field1110);
        }
        class242.field4217++;
        if (class231.field4051) {
            int var2 = 19137023;
            label193: for (int var3 = 0; var3 < 32768; var3++) {
                class45 var4 = class159.field2863[var3];
                if (var4 != null) {
                    byte var5 = var4.field646.field2413;
                    if ((var5 & 0x2) > 0 && var4.field4487 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4498[0] = (var4.field4452 >> 7) + var6;
                            var4.field4482[0] = (var4.field4457 >> 7) + var7;
                            class330.field5644[class295.field5159].method2233(var4.field4457 >> 7, var4.method363((byte) 122), 0, var4.field4452 >> 7, var4.method363((byte) 119), false, true);
                            if (var4.field4498[0] >= 0 && var4.field4498[0] <= 104 - var4.method363((byte) -67) && var4.field4482[0] >= 0 && var4.field4482[0] <= 104 - var4.method363((byte) -122) && class330.field5644[class295.field5159].method2238(var4.field4457 >> 7, var4.field4498[0], var4.field4482[0], var4.field4452 >> 7, 0)) {
                                if (var4.method363((byte) 80) > 1) {
                                    for (int var8 = var4.field4498[0]; (var4.field4498[0] + var4.method363((byte) -60)) > var8; var8++) {
                                        for (int var9 = var4.field4482[0]; var9 < (var4.field4482[0] + var4.method363((byte) 49)); var9++) {
                                            if ((class330.field5644[class295.field5159].field5605[var8][var9] & var2) != 0) {
                                                continue label193;
                                            }
                                        }
                                    }
                                }
                                var4.field4487 = 1;
                            }
                        }
                    }
                    class317.method2203(5, var4);
                    class38.method258(false, var4);
                    class121.method849((byte) -120, var4);
                    class330.field5644[class295.field5159].method2242(false, false, var4.field4452 >> 7, var4.field4457 >> 7, var4.method363((byte) -101), var4.method363((byte) 97));
                }
            }
        }
        if (!class231.field4051) {
            class299.method2112(-22356);
        } else if (class166.field2988 == 0 && class287.field5022 == 0) {
            if (class63.field1021 == 2) {
                class59.method405(99);
            } else {
                class17.method118(37);
            }
            if (class15.field193 >> 7 < 14 || (class15.field193 >> 7) >= 90 || class255.field4443 >> 7 < 14 || (class255.field4443 >> 7) >= 90) {
                class3.method25(-42);
            }
        }
        while (true) {
            class286 var10;
            class98 var17;
            class98 var18;
            do {
                var10 = (class286) class10.field123.method12(arg0 ^ 0x21FB);
                if (var10 == null) {
                    while (true) {
                        class286 var11;
                        class98 var15;
                        class98 var16;
                        do {
                            var11 = (class286) class301.field5237.method12(86);
                            if (var11 == null) {
                                while (true) {
                                    class286 var12;
                                    class98 var13;
                                    class98 var14;
                                    do {
                                        var12 = (class286) class295.field5138.method12(69);
                                        if (var12 == null) {
                                            if (class272.field4776 != null) {
                                                class282.method2029(0);
                                            }
                                            if (class101.field1773 != null && class101.field1773.field3686 == 1) {
                                                if (class101.field1773.field3685 != null) {
                                                    class200.method1413(class96.field1560, class83.field1286, arg0 - 8595);
                                                }
                                                class83.field1286 = null;
                                                class101.field1773 = null;
                                                class96.field1560 = false;
                                            }
                                            if (class116.field2000 % 1500 == 0) {
                                                class203.method1426(arg0 + 23616);
                                            }
                                            return;
                                        }
                                        var13 = var12.field5006;
                                        if (var13.field1583 < 0) {
                                            break;
                                        }
                                        var14 = class168.method1173(var13.field1611, -1456948048);
                                    } while (var14 == null || var14.field1636 == null || var13.field1583 >= var14.field1636.length || var14.field1636[var13.field1583] != var13);
                                    class287.method2053(var12, arg0 - 8520);
                                }
                            }
                            var15 = var11.field5006;
                            if (var15.field1583 < 0) {
                                break;
                            }
                            var16 = class168.method1173(var15.field1611, -1456948048);
                        } while (var16 == null || var16.field1636 == null || var15.field1583 >= var16.field1636.length || var16.field1636[var15.field1583] != var15);
                        class287.method2053(var11, 25);
                    }
                }
                var17 = var10.field5006;
                if (var17.field1583 < 0) {
                    break;
                }
                var18 = class168.method1173(var17.field1611, -1456948048);
            } while (var18 == null || var18.field1636 == null || var18.field1636.length <= var17.field1583 || var18.field1636[var17.field1583] != var17);
            class287.method2053(var10, 95);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 342)
    private final void method1814(int arg0, int arg1) {
        class302.field5252.field4118 = arg1;
        class47.field702 = null;
        class302.field5252.field4119++;
        field4548++;
        class98.field1591 = arg0;
        class158.field2853 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lca;)I", line = 354)
    public static final int method1815(class98 arg0) {
        class236 var1 = (class236) class69.field1075.method1676(((long) arg0.field1649 << 32) + (long) arg0.field1583, (byte) -108);
        return var1 == null ? arg0.field1626 : var1.field4144;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 371)
    public final void method1374(int arg0) {
        field4535++;
        if (class231.field4051) {
            class231.method1573();
        }
        if (class168.field3026 != null) {
            class178.method1261(class289.field5052, 32, class168.field3026);
            class168.field3026 = null;
        }
        if (class289.field5052 != null) {
            class289.field5052.method957(this.getClass(), (byte) -1);
        }
        if (class218.field3881 != null) {
            class218.field3881.field5112 = false;
        }
        class218.field3881 = null;
        if (class14.field161 != null) {
            class14.field161.method1487(13881);
            class14.field161 = null;
        }
        class9.method51(-1611, class13.field158);
        class290.method2075(class13.field158, -117);
        if (class296.field5165 != null) {
            class296.field5165.method31(7759444, class13.field158);
        }
        class5.method34(0);
        class45.method320(false);
        class296.field5165 = null;
        if (class308.field5347 != null) {
            class308.field5347.method1405(-15908);
        }
        if (arg0 != -31013) {
            field4529 = (byte[][]) ((byte[][]) null);
        }
        if (class261.field4601 != null) {
            class261.field4601.method1405(-15908);
        }
        class302.field5252.method1607(-84);
        class213.field3793.method899(arg0 ^ 0xFFFF86D9);
        try {
            if (class167.field3006 != null) {
                class167.field3006.method658(15);
            }
            if (class142.field2505 != null) {
                for (int var2 = 0; var2 < class142.field2505.length; var2++) {
                    if (class142.field2505[var2] != null) {
                        class142.field2505[var2].method658(15);
                    }
                }
            }
            if (class184.field3383 != null) {
                class184.field3383.method658(15);
            }
            if (class290.field5078 != null) {
                class290.field5078.method658(15);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 457)
    private final void method1816(int arg0) {
        field4537++;
        if (arg0 != 0) {
            field4539 = (boolean[]) null;
        }
        boolean var2 = class302.field5252.method1615(false);
        if (!var2) {
            this.method1818(arg0 - 15557);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lca;)Z", line = 475)
    public static final boolean method1817(class98 arg0) {
        if (class46.field673) {
            if (method1815(arg0) != 0) {
                return false;
            }
            if (arg0.field1677 == 0) {
                return false;
            }
        }
        return arg0.field1595;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 489)
    public final void method1378(int arg0) {
        field4546++;
        if (class203.field3658 == 1000 || arg0 != 3) {
            return;
        }
        boolean var2 = class36.method251(32767);
        if (var2 && class95.field1524 && class308.field5347 != null) {
            class308.field5347.method1403((byte) -74);
        }
        if ((class203.field3658 == 30 || class203.field3658 == 10) && (class126.field2126 || class101.field1772 != 0L && class101.field1772 < class118.method835(-1272))) {
            class92.method618(class311.field5380, class288.field5028, (byte) 88, class126.field2126, class281.method2020((byte) -110));
        }
        if (class168.field3026 == null) {
            Container var3;
            if (class168.field3026 != null) {
                var3 = class168.field3026;
            } else if (class273.field4805 == null) {
                var3 = class289.field5052.field2441;
            } else {
                var3 = class273.field4805;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class273.field4805 == var3) {
                Insets var6 = class273.field4805.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class9.field104 != var4 || class297.field5176 != var5) {
                if (class139.field2437.startsWith("mac")) {
                    class297.field5176 = var5;
                    class9.field104 = var4;
                } else {
                    class166.method1161(-128);
                }
                class101.field1772 = class118.method835(-1272) + 500L;
            }
        }
        if (class168.field3026 != null && !class47.field699 && (class203.field3658 == 30 || class203.field3658 == 10)) {
            class92.method618(-1, -1, (byte) 66, false, class258.field4562);
        }
        boolean var7 = false;
        if (class291.field5086) {
            class291.field5086 = false;
            var7 = true;
        }
        if (var7) {
            class307.method2153(-1);
        }
        if (class231.field4051) {
            for (int var8 = 0; var8 < 100; var8++) {
                class47.field692[var8] = true;
            }
        }
        if (class203.field3658 == 0) {
            class158.method1099(class219.field3893, class122.field2084, var7, (byte) -125, (Color) null);
        } else if (class203.field3658 == 5) {
            class318.method2207(class256.field4525, false, 91);
        } else if (class203.field3658 == 10) {
            class260.method1849(-97);
        } else if (class203.field3658 == 25 || class203.field3658 == 28) {
            if (class190.field3454 == 1) {
                if (class58.field861 < class105.field1817) {
                    class58.field861 = class105.field1817;
                }
                int var9 = (class58.field861 - class105.field1817) * 50 / class58.field861;
                class271.method1958((byte) 119, class117.method833(new class108[] { class286.field5012, class274.field4821, class79.method518(false, var9), class114.field1979 }, false), false);
            } else if (class190.field3454 == 2) {
                if (class155.field2793 > class281.field4926) {
                    class281.field4926 = class155.field2793;
                }
                int var10 = (class281.field4926 - class155.field2793) * 50 / class281.field4926 + 50;
                class271.method1958((byte) 101, class117.method833(new class108[] { class286.field5012, class274.field4821, class79.method518(false, var10), class114.field1979 }, false), false);
            } else {
                class271.method1958((byte) 127, class286.field5012, false);
            }
        } else if (class203.field3658 == 30) {
            class187.method1339(16711935);
        } else if (class203.field3658 == 40) {
            class271.method1958((byte) 101, class117.method833(new class108[] { class201.field3629, class207.field3708, class123.field2097 }, false), false);
        }
        if (class231.field4051 && class203.field3658 != 0) {
            class231.method1598();
            for (int var11 = 0; var11 < class273.field4806; var11++) {
                class280.field4910[var11] = false;
            }
        } else if ((class203.field3658 == 30 || class203.field3658 == 10) && class140.field2465 == 0 && !var7) {
            try {
                Graphics var15 = class13.field158.getGraphics();
                for (int var16 = 0; var16 < class273.field4806; var16++) {
                    if (class280.field4910[var16]) {
                        class216.field3833.method257(var15, class26.field399[var16], 1, class39.field545[var16], class242.field4216[var16], class313.field5409[var16]);
                        class280.field4910[var16] = false;
                    }
                }
            } catch (Exception var18) {
                class13.field158.repaint();
            }
        } else if (class203.field3658 != 0) {
            try {
                Graphics var12 = class13.field158.getGraphics();
                class216.field3833.method262(0, var12, -8278, 0);
                for (int var13 = 0; var13 < class273.field4806; var13++) {
                    class280.field4910[var13] = false;
                }
            } catch (Exception var19) {
                class13.field158.repaint();
            }
        }
        if (class306.field5325) {
            class46.method326((byte) 96);
        }
        if (class45.field643 && class203.field3658 == 10 && class322.field5511 != -1) {
            class45.field643 = false;
            class29.method212(arg0 ^ 0x6B9C, class289.field5052);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 725)
    private final void method1818(int arg0) {
        field4534++;
        if (class302.field5252.field4119 > class288.field5041) {
            if (class149.field2723 == class135.field2345) {
                class149.field2723 = class78.field1184;
            } else {
                class149.field2723 = class135.field2345;
            }
            class162.field2906 = (class302.field5252.field4119 - 1) * 50 * 5;
            if (class162.field2906 > 3000) {
                class162.field2906 = 3000;
            }
            if (class302.field5252.field4119 >= 2 && class302.field5252.field4118 == 6) {
                this.method1372("js5connect_outofdate", false);
                class203.field3658 = 1000;
                return;
            }
            if (class302.field5252.field4119 >= 4 && class302.field5252.field4118 == -1) {
                this.method1372("js5crc", false);
                class203.field3658 = 1000;
                return;
            }
            if (class302.field5252.field4119 >= 4 && (class203.field3658 == 0 || class203.field3658 == 5)) {
                if (class302.field5252.field4118 == 7 || class302.field5252.field4118 == 9) {
                    this.method1372("js5connect_full", false);
                } else if (class302.field5252.field4118 > 0) {
                    this.method1372("js5connect", false);
                } else {
                    this.method1372("js5io", false);
                }
                class203.field3658 = 1000;
                return;
            }
        }
        class288.field5041 = class302.field5252.field4119;
        if (class162.field2906 > 0) {
            class162.field2906--;
            return;
        }
        try {
            if (class98.field1591 == 0) {
                class158.field2853 = class289.field5052.method970(class68.field1061, class149.field2723, (byte) -105);
                class98.field1591++;
            }
            if (class98.field1591 == 1) {
                if (class158.field2853.field3686 == 2) {
                    this.method1814(arg0 ^ 0xFFFFC33B, 1000);
                    return;
                }
                if (class158.field2853.field3686 == 1) {
                    class98.field1591++;
                }
            }
            if (class98.field1591 == 2) {
                class47.field702 = new class216((Socket) class158.field2853.field3685, class289.field5052);
                class249 var2 = new class249(5);
                var2.method1759(-32768, 15);
                var2.method1741(524, arg0 - 1580261515);
                class47.field702.method1483(5, 0, false, var2.field4338);
                class98.field1591++;
                class132.field2264 = class118.method835(-1272);
            }
            if (arg0 != -15557) {
                field4539 = (boolean[]) null;
            }
            if (class98.field1591 == 3) {
                if (class203.field3658 == 0 || class203.field3658 == 5 || class47.field702.method1486(7) > 0) {
                    int var3 = class47.field702.method1482((byte) 125);
                    if (var3 != 0) {
                        this.method1814(arg0 ^ 0xFFFFC33B, var3);
                        return;
                    }
                    class98.field1591++;
                } else if ((class118.method835(-1272) - class132.field2264) > 30000L) {
                    this.method1814(arg0 ^ 0xFFFFC33B, 1001);
                    return;
                }
            }
            if (class98.field1591 == 4) {
                boolean var4 = class203.field3658 == 5 || class203.field3658 == 10 || class203.field3658 == 28;
                class302.field5252.method1623(arg0 ^ 0xFFFFC33B, !var4, class47.field702);
                class98.field1591 = 0;
                class47.field702 = null;
                class158.field2853 = null;
            }
        } catch (IOException var6) {
            this.method1814(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lea;", line = 876)
    public static final class206 method1819(int arg0, int arg1) {
        class206 var2 = (class206) class177.field3222.method642((long) arg1, (byte) -99);
        if (arg0 != -20727) {
            method1822((class98) null);
        }
        field4542++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3374.method1868(arg0 ^ 0xFFFF80C5, class104.method715(arg1, arg0 + 20652), class312.method2180(arg1, (byte) -75));
        class206 var4 = new class206();
        if (var3 != null) {
            var4.method1443((byte) 2, new class249(var3));
        }
        class177.field3222.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 908)
    public final void method1380(int arg0) {
        field4536++;
        class166.method1161(-68);
        class213.field3793 = new class131();
        class302.field5252 = new class232();
        if (class96.field1532 != 0) {
            class274.field4822 = new byte[50][];
        }
        class84.method580((byte) 119, class289.field5052);
        if (class220.field3910 == 0) {
            class329.field5624 = this.getCodeBase().getHost();
            class160.field2881 = 443;
            class69.field1081 = 43594;
        } else if (class220.field3910 == 1) {
            class329.field5624 = this.getCodeBase().getHost();
            class69.field1081 = class120.field2059 + 40000;
            class160.field2881 = class120.field2059 + 50000;
        } else if (class220.field3910 == 2) {
            class69.field1081 = class120.field2059 + 40000;
            class160.field2881 = class120.field2059 + 50000;
            class329.field5624 = "127.0.0.1";
        }
        class68.field1061 = class329.field5624;
        class292.field5118 = class21.field312 = class292.field5110 = class92.field1477 = new short[256];
        if (class139.field2442 == 3 && class220.field3910 != 2) {
            class182.field3334 = class120.field2059;
        }
        class135.field2345 = class69.field1081;
        class206.field3703 = class69.field1081;
        class78.field1184 = class160.field2881;
        if (class223.field3947 == 1) {
            class217.field3868 = 0;
            class217.field3861 = 16777215;
            class191.field3474 = class294.field5135;
            class233.field4124 = class290.field5083;
            class215.field3819 = class211.field3767;
            class195.field3527 = class246.field4263;
            class92.field1450 = true;
        } else {
            class233.field4124 = class242.field4221;
            class215.field3819 = class191.field3472;
            class191.field3474 = class178.field3238;
            class195.field3527 = class46.field677;
        }
        class149.field2723 = class206.field3703;
        class286.method2044(50000);
        class316.method2200(101, class13.field158);
        class27.method176((byte) 119, class13.field158);
        class296.field5165 = class281.method2022((byte) 16);
        if (class296.field5165 != null) {
            class296.field5165.method32(class13.field158, 64);
        }
        class200.field3613 = class139.field2442;
        if (arg0 != -3) {
            return;
        }
        try {
            if (class289.field5052.field2443 != null) {
                class167.field3006 = new class96(class289.field5052.field2443, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class142.field2505[var2] = new class96(class289.field5052.field2439[var2], 6000, 0);
                }
                class184.field3383 = new class96(class289.field5052.field2452, 6000, 0);
                class140.field2468 = new class218(255, class167.field3006, class184.field3383, 500000);
                class290.field5078 = new class96(class289.field5052.field2450, 24, 0);
                class289.field5052.field2450 = null;
                class289.field5052.field2443 = null;
                class289.field5052.field2439 = null;
                class289.field5052.field2452 = null;
            }
        } catch (IOException var4) {
            class140.field2468 = null;
            class184.field3383 = null;
            class167.field3006 = null;
            class290.field5078 = null;
        }
        class183.field3369 = class184.field3390;
        if (class220.field3910 != 0) {
            class55.field804 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 1029)
    private final void method1820(byte arg0) {
        if (!class45.field643) {
            label239: while (true) {
                do {
                    if (!class90.method608(9)) {
                        break label239;
                    }
                } while (class285.field4981 != 115 && class285.field4981 != 83);
                class45.field643 = true;
            }
        }
        field4549++;
        if (class178.field3233 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class118.method835(-1272);
            if (class57.field828 == 0L) {
                class57.field828 = var4;
            }
            if (var3 > 16384 && (var4 - class57.field828) < 5000L) {
                if ((var4 - class177.field3211) > 1000L) {
                    System.gc();
                    class177.field3211 = var4;
                }
                class219.field3893 = class305.field5320;
                class122.field2084 = 5;
            } else {
                class178.field3233 = 10;
                class219.field3893 = class9.field108;
                class122.field2084 = 5;
            }
        } else if (class178.field3233 == 10) {
            class267.method1936(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class330.field5644[var6] = new class328(104, 104);
            }
            class122.field2084 = 10;
            class219.field3893 = class182.field3345;
            class178.field3233 = 30;
        } else if (class178.field3233 == 30) {
            if (class122.field2081 == null) {
                class122.field2081 = new class162(class302.field5252, class213.field3793);
            }
            if (class122.field2081.method1123((byte) -121)) {
                class223.field3950 = class256.method1805(true, false, arg0 + 1000104, 0, true);
                class17.field221 = class256.method1805(true, false, arg0 + 1000104, 1, true);
                class270.field4725 = class256.method1805(false, true, arg0 ^ 0xFFF0BDD8, 2, true);
                class283.field4957 = class256.method1805(true, false, arg0 + 1000104, 3, true);
                class291.field5104 = class256.method1805(true, false, 1000000, 4, true);
                class247.field4277 = class256.method1805(true, true, 1000000, 5, true);
                class96.field1535 = class256.method1805(true, true, arg0 ^ 0xFFF0BDD8, 6, false);
                class13.field150 = class256.method1805(true, false, 1000000, 7, true);
                class215.field3801 = class256.method1805(true, false, 1000000, 8, true);
                class73.field1104 = class256.method1805(true, false, 1000000, 9, true);
                class143.field2527 = class256.method1805(true, false, 1000000, 10, true);
                class69.field1079 = class256.method1805(true, false, arg0 + 1000104, 11, true);
                class92.field1479 = class256.method1805(true, false, 1000000, 12, true);
                class62.field994 = class256.method1805(true, false, arg0 ^ 0xFFF0BDD8, 13, true);
                class161.field2889 = class256.method1805(true, false, arg0 + 1000104, 14, false);
                class195.field3524 = class256.method1805(true, false, 1000000, 15, true);
                class128.field2189 = class256.method1805(true, false, 1000000, 16, true);
                class96.field1525 = class256.method1805(true, false, 1000000, 17, true);
                class101.field1781 = class256.method1805(true, false, 1000000, 18, true);
                class178.field3228 = class256.method1805(true, false, 1000000, 19, true);
                class246.field4262 = class256.method1805(true, false, 1000000, 20, true);
                class7.field86 = class256.method1805(true, false, 1000000, 21, true);
                class178.field3237 = class256.method1805(true, false, 1000000, 22, true);
                class210.field3763 = class256.method1805(true, true, 1000000, 23, true);
                class1.field16 = class256.method1805(true, false, 1000000, 24, true);
                class221.field3932 = class256.method1805(true, false, 1000000, 25, true);
                class242.field4201 = class256.method1805(true, true, 1000000, 26, true);
                class200.field3627 = class256.method1805(true, false, arg0 ^ 0xFFF0BDD8, 27, true);
                class122.field2084 = 15;
                class178.field3233 = 40;
                class219.field3893 = class94.field1511;
            } else {
                class219.field3893 = class210.field3745;
                class122.field2084 = 12;
            }
        } else if (class178.field3233 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class201.field3641[var8].method2002((byte) -106) * class224.field3955[var8] / 100;
            }
            if (var7 == 100) {
                class122.field2084 = 20;
                class219.field3893 = class157.field2828;
                class182.method1317(class215.field3801, 104);
                class14.method96(class215.field3801, -31118);
                class184.method1327((byte) -120, class215.field3801);
                class178.field3233 = 45;
            } else {
                if (var7 != 0) {
                    class219.field3893 = class117.method833(new class108[] { class172.field3139, class79.method518(false, var7), class96.field1548 }, false);
                }
                class122.field2084 = 20;
            }
        } else if (class178.field3233 == 45) {
            class83.method559(class131.field2242, 22050, 2, (byte) -99);
            class52.field774 = new class171();
            class52.field774.method1206(128, 9, -108);
            class308.field5347 = class320.method2217(0, class289.field5052, class13.field158, (byte) -123, 22050);
            class308.field5347.method1402(-9, class52.field774);
            class302.method2124(class195.field3524, class291.field5104, (byte) 96, class52.field774, class161.field2889);
            class261.field4601 = class320.method2217(1, class289.field5052, class13.field158, (byte) 21, 2048);
            class213.field3789 = new class314();
            class261.field4601.method1402(-5, class213.field3789);
            class191.field3477 = new class177(22050, class210.field3755);
            class198.field3568 = class96.field1535.method1887(-1, class166.field2995);
            class122.field2084 = 30;
            class178.field3233 = 50;
            class219.field3893 = class15.field190;
        } else if (class178.field3233 == 50) {
            int var9 = class19.method129(class215.field3801, class62.field994, 127);
            int var10 = class268.method1942((byte) 117);
            if (var10 > var9) {
                class219.field3893 = class117.method833(new class108[] { class149.field2710, class79.method518(false, var9 * 100 / var10), class96.field1548 }, false);
                class122.field2084 = 35;
            } else {
                class219.field3893 = class87.field1374;
                class122.field2084 = 35;
                class178.field3233 = 60;
            }
        } else if (class178.field3233 == 60) {
            int var11 = class281.method2025((byte) 121, class215.field3801);
            int var12 = class26.method170(28538);
            if (var11 >= var12) {
                class122.field2084 = 40;
                class219.field3893 = class301.field5241;
                class178.field3233 = 65;
            } else {
                class219.field3893 = class117.method833(new class108[] { class196.field3551, class79.method518(false, var11 * 100 / var12), class96.field1548 }, false);
                class122.field2084 = 40;
            }
        } else if (class178.field3233 == 65) {
            class172.method1224((byte) -125, class215.field3801, class62.field994);
            class219.field3893 = class331.field5656;
            class122.field2084 = 45;
            class312.method2177(5, (byte) -125);
            class178.field3233 = 70;
        } else if (class178.field3233 == 70) {
            byte var18 = 0;
            class270.field4725.method1859(0);
            int var19 = var18 + class270.field4725.method1886((byte) -122);
            class128.field2189.method1859(0);
            int var20 = var19 + class128.field2189.method1886((byte) -127);
            class96.field1525.method1859(arg0 + 104);
            int var21 = var20 + class96.field1525.method1886((byte) -96);
            class101.field1781.method1859(0);
            int var22 = var21 + class101.field1781.method1886((byte) -95);
            class178.field3228.method1859(0);
            int var23 = var22 + class178.field3228.method1886((byte) -125);
            class246.field4262.method1859(0);
            int var24 = var23 + class246.field4262.method1886((byte) -104);
            class7.field86.method1859(arg0 + 104);
            int var25 = var24 + class7.field86.method1886((byte) -98);
            class178.field3237.method1859(0);
            int var26 = var25 + class178.field3237.method1886((byte) -123);
            class1.field16.method1859(0);
            int var27 = var26 + class1.field16.method1886((byte) -111);
            class221.field3932.method1859(0);
            int var28 = var27 + class221.field3932.method1886((byte) -125);
            class200.field3627.method1859(0);
            int var29 = var28 + class200.field3627.method1886((byte) -93);
            if (var29 < 1100) {
                class219.field3893 = class117.method833(new class108[] { class151.field2738, class79.method518(false, var29 / 11), class96.field1548 }, false);
                class122.field2084 = 50;
            } else {
                class103.method707(10396, class270.field4725);
                class327.method2231(4, class270.field4725);
                class161.method1115(class270.field4725, (byte) -97);
                class255.method1799(class13.field150, class270.field4725, (byte) 81);
                class181.method1309(class13.field150, false, true, class128.field2189);
                class20.method135(-94, class13.field150, class101.field1781);
                class213.method1468(256, class178.field3228, class13.field150, true, class318.field5470);
                class262.method1858((byte) 125, class270.field4725);
                class286.method2048(class17.field221, -62, class223.field3950, class246.field4262);
                class272.method1970(class7.field86, class13.field150, 118);
                class155.method1081(-1, class178.field3237);
                class227.method1531(class270.field4725, true);
                class110.method797(class62.field994, (byte) -31, class283.field4957, class215.field3801, class13.field150);
                class229.method1536(88, class270.field4725);
                class128.method886(class96.field1525, (byte) 37);
                class17.method112(class221.field3932, new class233(), class1.field16, (byte) 47);
                class160.method1111(class221.field3932, class1.field16, 116);
                class219.field3893 = class166.field2992;
                class122.field2084 = 50;
                class253.method1787(1);
                class178.field3233 = 80;
            }
        } else if (class178.field3233 == 80) {
            int var13 = class140.method972((byte) 90, class215.field3801);
            int var14 = class39.method267(arg0 ^ 0x648D);
            if (var14 > var13) {
                class219.field3893 = class117.method833(new class108[] { class256.field4461, class79.method518(false, var13 * 100 / var14), class96.field1548 }, false);
                class122.field2084 = 60;
            } else {
                class174.method1235(class215.field3801, (byte) 100);
                class219.field3893 = class301.field5236;
                class178.field3233 = 90;
                class122.field2084 = 60;
            }
        } else {
            if (arg0 != -104) {
                field4532 = (class108) null;
            }
            if (class178.field3233 == 90) {
                if (class242.field4201.method1859(0)) {
                    class84 var15 = new class84(class73.field1104, class242.field4201, class215.field3801, 20, !class180.field3277);
                    class263.method1906(var15);
                    if (class269.field4716 == 1) {
                        class263.method1907(0.9F);
                    }
                    if (class269.field4716 == 2) {
                        class263.method1907(0.8F);
                    }
                    if (class269.field4716 == 3) {
                        class263.method1907(0.7F);
                    }
                    if (class269.field4716 == 4) {
                        class263.method1907(0.6F);
                    }
                    class122.field2084 = 70;
                    class178.field3233 = 100;
                    class219.field3893 = class25.field394;
                } else {
                    class219.field3893 = class117.method833(new class108[] { class156.field2811, class79.method518(false, class242.field4201.method1886((byte) -107)), class96.field1548 }, false);
                    class122.field2084 = 70;
                }
            } else if (class178.field3233 == 100) {
                if (class175.method1241(class215.field3801, arg0 ^ 0xFFFFB8AC)) {
                    class178.field3233 = 110;
                }
            } else if (class178.field3233 == 110) {
                class218.field3881 = new class292();
                class289.field5052.method954(class218.field3881, 1, 10);
                class122.field2084 = 75;
                class178.field3233 = 120;
                class219.field3893 = class220.field3906;
            } else if (class178.field3233 == 120) {
                if (class143.field2527.method1857(-1, class63.field1016, class221.field3935)) {
                    class24 var17 = new class24(class143.field2527.method1884(126, class221.field3935, class63.field1016));
                    class60.method411(var17, 65535);
                    class122.field2084 = 80;
                    class219.field3893 = class276.field4829;
                    class178.field3233 = 130;
                } else {
                    class219.field3893 = class117.method833(new class108[] { class75.field1148, class330.field5643 }, false);
                    class122.field2084 = 80;
                }
            } else if (class178.field3233 == 130) {
                if (!class283.field4957.method1859(0)) {
                    class219.field3893 = class117.method833(new class108[] { class258.field4558, class79.method518(false, class283.field4957.method1886((byte) -92) * 3 / 4), class96.field1548 }, false);
                    class122.field2084 = 85;
                } else if (!class92.field1479.method1859(0)) {
                    class219.field3893 = class117.method833(new class108[] { class258.field4558, class79.method518(false, class92.field1479.method1886((byte) -122) / 10 + 75), class96.field1548 }, false);
                    class122.field2084 = 85;
                } else if (!class62.field994.method1859(0)) {
                    class219.field3893 = class117.method833(new class108[] { class258.field4558, class79.method518(false, class62.field994.method1886((byte) -97) / 20 + 85), class96.field1548 }, false);
                    class122.field2084 = 85;
                } else if (class210.field3763.method1865(class182.field3353, -1)) {
                    class16.method105(class210.field3763, class51.field740, class147.field2640, class73.field1109, class203.field3664, class145.field2623, arg0 ^ 0xFFFFFF99);
                    class165.method1152(class200.field3627);
                    class122.field2084 = 95;
                    class219.field3893 = class8.field99;
                    class178.field3233 = 135;
                } else {
                    class219.field3893 = class117.method833(new class108[] { class258.field4558, class79.method518(false, class210.field3763.method1867(0, class182.field3353) / 10 + 90), class96.field1548 }, false);
                    class122.field2084 = 85;
                }
            } else if (class178.field3233 == 135) {
                int var16 = class180.method1306(-21018);
                if (var16 == -1) {
                    class219.field3893 = class215.field3809;
                    class122.field2084 = 95;
                } else if (var16 == 7 || var16 == 9) {
                    this.method1372("worldlistfull", false);
                    class312.method2177(1000, (byte) -103);
                } else if (class320.field5487) {
                    class178.field3233 = 140;
                    class122.field2084 = 96;
                    class219.field3893 = class325.field5534;
                } else {
                    this.method1372("worldlistio_" + var16, false);
                    class312.method2177(1000, (byte) -125);
                }
            } else if (class178.field3233 == 140) {
                class160.field2873 = class283.field4957.method1887(-1, class54.field787);
                class247.field4277.method1875(false, true, (byte) 80);
                class96.field1535.method1875(true, true, (byte) 80);
                class215.field3801.method1875(true, true, (byte) 80);
                class62.field994.method1875(true, true, (byte) 80);
                class143.field2527.method1875(true, true, (byte) 80);
                class283.field4957.method1875(true, true, (byte) 80);
                class178.field3233 = 150;
                class219.field3893 = class293.field5125;
                class306.field5325 = true;
                class122.field2084 = 97;
            } else if (class178.field3233 == 150) {
                class138.method949();
                if (class45.field643) {
                    class299.field5202 = 0;
                    class258.field4562 = 0;
                    class184.field3372 = 0;
                }
                class45.field643 = true;
                class29.method212(27551, class289.field5052);
                class92.method618(-1, -1, (byte) 27, false, class258.field4562);
                class178.field3233 = 160;
                class122.field2084 = 100;
                class219.field3893 = class211.field3764;
            } else if (class178.field3233 == 160) {
                class101.method699(true, (byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsf;II)V", line = 1547)
    public static final void method1821(class108 arg0, int arg1, int arg2) {
        class120 var3 = class248.method1704(3, arg2 + 23739, arg1);
        field4544++;
        var3.method844((byte) -28);
        if (arg2 != -23626) {
            field4539 = (boolean[]) null;
        }
        var3.field2063 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1561)
    public final void method1375(int arg0) {
        field4547++;
        if (class203.field3658 == 1000) {
            return;
        }
        class116.field2000++;
        if ((class116.field2000 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class287.field5024 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class256.field4526.setSeed((long) class287.field5024);
        }
        this.method1816(0);
        if (class122.field2081 != null) {
            class122.field2081.method1120(113);
        }
        if (arg0 != 2) {
            this.method1378(-61);
        }
        class64.method445(true);
        class212.method1460((byte) -16);
        class64.method443(arg0 ^ 0xFFFFFFA3);
        class57.method395(arg0 + 100);
        if (class231.field4051) {
            class124.method858();
        }
        if (class296.field5165 != null) {
            int var3 = class296.field5165.method33((byte) 4);
            class130.field2233 = var3;
        }
        if (class203.field3658 == 0) {
            this.method1820((byte) -104);
            class17.method123(arg0 ^ 0x2);
        } else if (class203.field3658 == 5) {
            this.method1820((byte) -104);
            class17.method123(0);
        } else if (class203.field3658 == 25 || class203.field3658 == 28) {
            class29.method210(-7567);
        }
        if (class203.field3658 == 10) {
            this.method1813(8598);
            class72.method481(arg0 - 24);
            class287.method2052((byte) -28);
            class90.method609(-48);
        } else if (class203.field3658 == 30) {
            class329.method2256((byte) -118);
        } else if (class203.field3658 == 40) {
            class90.method609(-15);
            if (class211.field3766 != -3) {
                if (class211.field3766 == 15) {
                    class10.method53((byte) -17);
                } else if (class211.field3766 != 2) {
                    class298.method2106((byte) 95);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1657)
    public static final void main(String[] arg0) {
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class286.method2046(false, "argument count");
            }
            class120.field2059 = Integer.parseInt(arg0[0]);
            class220.field3910 = 2;
            if (arg0[1].equals("live")) {
                class96.field1532 = 0;
            } else if (arg0[1].equals("rc")) {
                class96.field1532 = 1;
            } else if (arg0[1].equals("wip")) {
                class96.field1532 = 2;
            } else {
                class286.method2046(false, "modewhat");
            }
            class329.field5618 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class301.method2118(class304.method2137((byte) 123, 0, var2, var2.length), 0);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class88.field1393 = var1;
            } else if (arg0[2].equals("english")) {
                class88.field1393 = 0;
            } else if (arg0[2].equals("german")) {
                class88.field1393 = 1;
            } else {
                class286.method2046(false, "language");
            }
            class195.method1389(class88.field1393, (byte) -89);
            class19.field281 = false;
            class70.field1083 = false;
            if (arg0[3].equals("game0")) {
                class223.field3947 = 0;
            } else if (arg0[3].equals("game1")) {
                class223.field3947 = 1;
            } else {
                class286.method2046(false, "game");
            }
            class74.field1130 = false;
            class247.field4269 = 0;
            class160.field2869 = class63.field1016;
            class278.field4885 = 0;
            client var4 = new client();
            class5.field73 = var4;
            var4.method1383(768, 1024, 28, "runescape", 524, class96.field1532 + 32, 75);
            class273.field4805.setLocation(40, 40);
        } catch (Exception var7) {
            class171.method1188(64, (String) null, var7);
        }
        field4533++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1732)
    public final void method1381(byte arg0) {
        method1823((byte) 79);
        class165.method1140();
        class78.method512((byte) -11);
        field4543++;
        class180.method1303(false);
        class293.method2092(-124);
        class173.method1233((byte) -109);
        class289.method2065(false);
        class194.method1377((byte) -123);
        class231.method1586();
        class20.method137(-1071);
        class274.method1983(-2504);
        class292.method2090(0);
        class295.method2099(121);
        class249.method1715((byte) -81);
        class216.method1481(-71);
        class232.method1618(6);
        class131.method901((byte) -90);
        class162.method1121(-28398);
        class277.method1997(109);
        class96.method660(false);
        class218.method1502(-2042831448);
        class94.method645(123);
        class45.method318(120);
        class203.method1432(-90);
        class328.method2244((byte) 108);
        class98.method677(26212);
        class222.method1518((byte) 29);
        class51.method360(100);
        class1.method7((byte) 35);
        class242.method1673(28127);
        class223.method1520(7759444);
        class154.method1077((byte) -94);
        class103.method710((byte) 42);
        class135.method924(106);
        class171.method1208((byte) -33);
        class199.method1411((byte) -38);
        class177.method1250(19029);
        class240.method1669(12);
        class272.method1963((byte) 88);
        class256.method1802(-1);
        class74.method490((byte) 89);
        class136.method933((byte) -38);
        class158.method1101(30);
        class184.method1328((byte) -104);
        class252.method1777(false);
        class2.method17(261338);
        class307.method2154(-1);
        class190.method1351(-127);
        class104.method717(-78);
        class213.method1472((byte) -7);
        class39.method269(128);
        class311.method2168((byte) -60);
        class187.method1345((byte) 96);
        class170.method1176(-30805);
        class15.method102((byte) 117);
        class265.method1919(-97);
        class123.method856(0);
        class237.method1637(96);
        class276.method1990((byte) 92);
        class296.method2101(1);
        class144.method997(255);
        class60.method416((byte) 81);
        class287.method2054((byte) 52);
        class246.method1690(-21791);
        class217.method1495();
        class128.method885(-1);
        class230.method1564();
        class155.method1085(-8);
        class148.method1044();
        class145.method1009(63);
        class44.method308();
        class330.method2263(-82);
        class141.method979(-1);
        class115.method822(-31);
        class124.method863();
        class106.method725(7262);
        class5.method36((byte) -21);
        class121.method851((byte) -113);
        class59.method406(19064);
        class80.method521();
        class8.method43((byte) 67);
        class215.method1474((byte) -84);
        class107.method731();
        class167.method1168(20);
        class191.method1357(5904);
        class219.method1509((byte) 56);
        class193.method1363();
        class267.method1930();
        class46.method330((byte) 125);
        class93.method634(-91);
        class134.method918(false);
        class62.method431((byte) -40);
        class137.method945(118);
        class28.method197();
        class181.method1314((byte) 29);
        class259.method1838(0);
        class251.method1771((byte) -68);
        class95.method649((byte) -125);
        class69.method465(11686);
        class7.method41((byte) 85);
        class270.method1951(0);
        class306.method2148((byte) -118);
        class280.method2018(-12603);
        class143.method986(126);
        class66.method452((byte) 117);
        class302.method2122((byte) 69);
        class284.method2040((byte) -99);
        class305.method2143(-21472);
        class206.method1442(42);
        class212.method1466(-1);
        class197.method1398((byte) -120);
        class99.method685((byte) -25);
        class34.method234(30470);
        class233.method1626(-43);
        class19.method131((byte) -127);
        class68.method458(104);
        class263.method1910();
        class24.method163(17617);
        class73.method488(-108);
        class294.method2097(false);
        class122.method854((byte) 114);
        class278.method2009(115);
        class285.method2041((byte) 0);
        class138.method950();
        class329.method2255((byte) -124);
        class201.method1423(122);
        class130.method894(907485512);
        class286.method2045(-14485);
        class290.method2078(0);
        class186.method1334(false);
        class126.method867(true);
        class133.method912();
        class326.method2228(-123);
        class92.method621(118);
        class174.method1239(true);
        class36.method253(-2967);
        class258.method1837(false);
        class220.method1511(407565543);
        class140.method975((byte) -18);
        class18.method125();
        class172.method1227((byte) -123);
        class55.method383(120);
        class151.method1070(-21092);
        class313.method2182(-1);
        class48.method335();
        class255.method1797(70);
        class238.method1655();
        class204.method1437();
        class22.method150((byte) 63);
        class227.method1532((byte) 126);
        class83.method558(-5133);
        class120.method845((byte) -119);
        class117.method834(-123);
        class299.method2108(1);
        class298.method2105((byte) -41);
        class79.method515((byte) 110);
        class16.method104(7);
        class245.method1686();
        class57.method396((byte) 47);
        class266.method1922(true);
        class50.method355();
        class42.method278(5);
        class260.method1850((byte) -102);
        class21.method148((byte) 23);
        class14.method94((byte) 5);
        class27.method175((byte) 48);
        class236.method1635((byte) 42);
        class149.method1064(-48);
        class114.method810(-26964);
        class269.method1945(false);
        class29.method209(-52);
        class324.method2226(-3608);
        class52.method371(255);
        class105.method720(0);
        class221.method1515(-125);
        class63.method439(1);
        class234.method1631(31124);
        class321.method2221(10);
        class38.method255(0);
        class159.method1103(-10497);
        class54.method381(true);
        class13.method85(97);
        class207.method1447(61);
        class71.method478();
        class58.method401(30597);
        class9.method49(-101);
        class317.method2205(-1);
        class64.method444(96);
        class224.method1521(-14267);
        class297.method2103(24);
        class164.method1137();
        class85.method588();
        class208.method1448();
        class196.method1394(100);
        class168.method1170(2047);
        class31.method222();
        class65.method449();
        class195.method1390((byte) -94);
        class10.method54((byte) -97);
        class127.method874();
        class56.method387();
        class283.method2035((byte) 43);
        class327.method2232(-112);
        class17.method121(-27746);
        class304.method2138(119);
        class291.method2082((byte) -33);
        class247.method1693((byte) 114);
        class198.method1401((byte) -115);
        class160.method1106(12536);
        class88.method606(45);
        class110.method796((byte) -108);
        class271.method1956(26);
        class182.method1319(0);
        class254.method1792(4);
        class161.method1116((byte) 96);
        class210.method1455((byte) 48);
        class209.method1451(-124);
        class90.method611((byte) 123);
        class211.method1458(-110);
        class129.method888(-2048);
        class268.method1939(false);
        class35.method246(-1);
        class185.method1330(false);
        class253.method1790((byte) -93);
        class202.method1425((byte) 89);
        class303.method2131(1);
        class147.method1022(1);
        class75.method494(1);
        class178.method1259(5157);
        class308.method2156((byte) 33);
        class61.method426(1);
        class100.method698(0);
        class318.method2208(-8759);
        class132.method907(88);
        class331.method2264((byte) -103);
        class322.method2222((byte) -74);
        class316.method2198(0);
        class166.method1162(-765);
        class325.method2227(0);
        class47.method331(7);
        class229.method1534(126);
        class81.method549((byte) -125);
        class157.method1093(true);
        class310.method2163(0);
        class152.method1075(123);
        class26.method172(1000);
        class142.method983(true);
        class146.method1016(-325171796);
        class156.method1088(31913);
        class175.method1240((byte) -114);
        int var2 = 11 / ((-arg0 - 13) / 32);
        class86.method592(0);
        class91.method613(65280);
        class116.method827((byte) -98);
        class25.method166(-28449);
        class72.method483(104);
        class3.method23(18);
        class320.method2219(16769);
        class301.method2120((byte) 107);
        class101.method705(11319);
        class282.method2028(-122);
        class248.method1702(29197);
        class87.method598(0);
        class261.method1854(-1535926992);
        class176.method1245((byte) -94);
        class109.method793(3);
        class183.method1322(-1823443115);
        class43.method281(true);
        class119.method838((byte) -24);
        class239.method1657((byte) 105);
        class273.method1975(-100);
        class200.method1415(1);
        class315.method2192(-20845);
        class288.method2056(113);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lca;)Lca;", line = 2022)
    public static final class98 method1822(class98 arg0) {
        int var1 = class29.method203(method1815(arg0), 96);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class168.method1173(arg0.field1611, -1456948048);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 2043)
    public static void method1823(byte arg0) {
        field4529 = (byte[][]) null;
        int var1 = 113 % ((34 - arg0) / 41);
        field4539 = null;
        field4532 = null;
        field4531 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V", line = 2056)
    public static final void method1824(byte arg0, String arg1) {
        field4540++;
        if (arg0 == -49) {
            for (int var2 = arg1.indexOf("%0a"); var2 != -1; var2 = arg1.indexOf("%0a", var2)) {
                arg1 = arg1.substring(0, var2) + "\n" + arg1.substring(var2 + 3);
            }
            System.out.println("Error: " + arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lca;IIIIIII)V", line = 2088)
    public static final void method1825(class98[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class98 var9 = arg0[var8];
            if (var9 != null && var9.field1611 == arg1 && (!var9.field1640 || var9.field1677 == 0 || var9.field1579 || method1815(var9) != 0 || class209.field3736 == var9 || var9.field1698 == 1338) && (!var9.field1640 || !method1817(var9))) {
                int var10 = var9.field1730 + arg6;
                int var11 = var9.field1590 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1677 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1673 + var10;
                    int var17 = var9.field1688 + var11;
                    if (var9.field1677 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class272.field4776 == var9) {
                    class296.field5161 = true;
                    class162.field2907 = var10;
                    class305.field5300 = var11;
                }
                if (!var9.field1640 || var12 < var14 && var13 < var15) {
                    if (var9.field1677 == 0) {
                        if (!var9.field1640 && method1817(var9) && class60.field967 != var9) {
                            continue;
                        }
                        if (var9.field1716 && class317.field5456 >= var12 && class171.field3116 >= var13 && class317.field5456 < var14 && class171.field3116 < var15) {
                            for (class286 var18 = (class286) class295.field5138.method13(0); var18 != null; var18 = (class286) class295.field5138.method15((byte) 47)) {
                                if (var18.field5001) {
                                    var18.method1325(0);
                                    var18.field5006.field1662 = false;
                                }
                            }
                            if (class135.field2330 == 0) {
                                class272.field4776 = null;
                                class209.field3736 = null;
                            }
                            class154.field2764 = false;
                        }
                    }
                    if (var9.field1640) {
                        boolean var19;
                        if (class317.field5456 >= var12 && class171.field3116 >= var13 && class317.field5456 < var14 && class171.field3116 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class83.field1298 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class331.field5645 == 1 && class87.field1382 >= var12 && class170.field3041 >= var13 && class87.field1382 < var14 && class170.field3041 < var15) {
                            var21 = true;
                        }
                        if (class137.field2429 > 0 && var9.field1667 != null) {
                            for (int var22 = 0; var22 < var9.field1667.length; var22++) {
                                for (int var23 = 0; var23 < class137.field2429; var23++) {
                                    int var24 = var9.field1667[var22] & 0xFF;
                                    if (class197.field3562[var23] == var24) {
                                        if (var9.field1720 != null) {
                                            byte var25 = var9.field1720[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class144.field2529[86] || (var25 & 0x1) != 0 && !class144.field2529[82] || (var25 & 0x4) != 0 && !class144.field2529[81])) {
                                                continue;
                                            }
                                        }
                                        class8.method44(class63.field1016, (byte) -110, var9.field1649, -1, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class72.method482(class170.field3041 - var11, var9, class87.field1382 - var10, 119);
                        }
                        if (class272.field4776 != null && class272.field4776 != var9 && var19 && class183.method1323((byte) -40, method1815(var9))) {
                            class240.field4177 = var9;
                        }
                        if (class209.field3736 == var9) {
                            class54.field797 = true;
                            class239.field4165 = var10;
                            class42.field558 = var11;
                        }
                        if (var9.field1579 || var9.field1698 != 0) {
                            if (var19 && class130.field2233 != 0 && var9.field1721 != null) {
                                class286 var26 = new class286();
                                var26.field5001 = true;
                                var26.field5006 = var9;
                                var26.field4996 = class130.field2233;
                                var26.field4993 = var9.field1721;
                                class295.field5138.method5(var26, (byte) 15);
                            }
                            if (class272.field4776 != null || class295.field5151 != null || class62.field989 || var9.field1698 != 1400 && class154.field2764) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1698 != 0) {
                                if (var9.field1698 == 1337) {
                                    class122.field2086 = var9;
                                    class195.method1388(-82, var9);
                                    continue;
                                }
                                if (var9.field1698 == 1338) {
                                    if (var21) {
                                        class169.field3029 = class87.field1382 - var10;
                                        class174.field3180 = class170.field3041 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1698 == 1400) {
                                    class316.field5444 = var9;
                                    if (var21) {
                                        if (class144.field2529[82] && class299.field5191 > 0) {
                                            int var27 = (int) ((double) (class87.field1382 - var10 - var9.field1673 / 2) * 2.0D / (double) class147.field2643);
                                            int var28 = (int) ((double) (class170.field3041 - var11 - var9.field1688 / 2) * 2.0D / (double) class147.field2643);
                                            int var29 = class202.field3652 + var27;
                                            int var30 = class126.field2121 + var28;
                                            int var31 = class144.field2546 + var29;
                                            int var32 = class152.field2757 + class83.field1288 - var30 - 1;
                                            class92.method624(false, var32, var31, 0);
                                            class156.method1091(0);
                                            continue;
                                        }
                                        class154.field2764 = true;
                                        class206.field3692 = class317.field5456;
                                        class286.field5009 = class171.field3116;
                                        class212.field3775 = class202.field3652;
                                        class172.field3150 = class126.field2121;
                                        continue;
                                    }
                                    if (var20 && class154.field2764) {
                                        class304.method2133((int) ((double) (class206.field3692 - class317.field5456) * 2.0D / (double) class200.field3621) + class212.field3775, (byte) 106);
                                        class78.method513((byte) -1, (int) ((double) (class286.field5009 - class171.field3116) * 2.0D / (double) class200.field3621) + class172.field3150);
                                        continue;
                                    }
                                    class154.field2764 = false;
                                    continue;
                                }
                                if (var9.field1698 == 1401) {
                                    if (var20) {
                                        class207.method1445(class171.field3116 - var11, var9.field1688, var9.field1673, (byte) -85, class317.field5456 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1698 == 1402) {
                                    if (!class231.field4051) {
                                        class195.method1388(-82, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1615 && var21) {
                                var9.field1615 = true;
                                if (var9.field1679 != null) {
                                    class286 var33 = new class286();
                                    var33.field5001 = true;
                                    var33.field5006 = var9;
                                    var33.field4994 = class87.field1382 - var10;
                                    var33.field4996 = class170.field3041 - var11;
                                    var33.field4993 = var9.field1679;
                                    class295.field5138.method5(var33, (byte) 10);
                                }
                            }
                            if (var9.field1615 && var20 && var9.field1631 != null) {
                                class286 var34 = new class286();
                                var34.field5001 = true;
                                var34.field5006 = var9;
                                var34.field4994 = class317.field5456 - var10;
                                var34.field4996 = class171.field3116 - var11;
                                var34.field4993 = var9.field1631;
                                class295.field5138.method5(var34, (byte) 96);
                            }
                            if (var9.field1615 && !var20) {
                                var9.field1615 = false;
                                if (var9.field1622 != null) {
                                    class286 var35 = new class286();
                                    var35.field5001 = true;
                                    var35.field5006 = var9;
                                    var35.field4994 = class317.field5456 - var10;
                                    var35.field4996 = class171.field3116 - var11;
                                    var35.field4993 = var9.field1622;
                                    class301.field5237.method5(var35, (byte) 100);
                                }
                            }
                            if (var20 && var9.field1612 != null) {
                                class286 var36 = new class286();
                                var36.field5001 = true;
                                var36.field5006 = var9;
                                var36.field4994 = class317.field5456 - var10;
                                var36.field4996 = class171.field3116 - var11;
                                var36.field4993 = var9.field1612;
                                class295.field5138.method5(var36, (byte) -115);
                            }
                            if (!var9.field1662 && var19) {
                                var9.field1662 = true;
                                if (var9.field1576 != null) {
                                    class286 var37 = new class286();
                                    var37.field5001 = true;
                                    var37.field5006 = var9;
                                    var37.field4994 = class317.field5456 - var10;
                                    var37.field4996 = class171.field3116 - var11;
                                    var37.field4993 = var9.field1576;
                                    class295.field5138.method5(var37, (byte) 4);
                                }
                            }
                            if (var9.field1662 && var19 && var9.field1693 != null) {
                                class286 var38 = new class286();
                                var38.field5001 = true;
                                var38.field5006 = var9;
                                var38.field4994 = class317.field5456 - var10;
                                var38.field4996 = class171.field3116 - var11;
                                var38.field4993 = var9.field1693;
                                class295.field5138.method5(var38, (byte) 113);
                            }
                            if (var9.field1662 && !var19) {
                                var9.field1662 = false;
                                if (var9.field1681 != null) {
                                    class286 var39 = new class286();
                                    var39.field5001 = true;
                                    var39.field5006 = var9;
                                    var39.field4994 = class317.field5456 - var10;
                                    var39.field4996 = class171.field3116 - var11;
                                    var39.field4993 = var9.field1681;
                                    class301.field5237.method5(var39, (byte) -110);
                                }
                            }
                            if (var9.field1690 != null) {
                                class286 var40 = new class286();
                                var40.field5006 = var9;
                                var40.field4993 = var9.field1690;
                                class10.field123.method5(var40, (byte) 53);
                            }
                            if (var9.field1684 != null && class88.field1390 > var9.field1692) {
                                if (var9.field1605 == null || class88.field1390 - var9.field1692 > 32) {
                                    class286 var45 = new class286();
                                    var45.field5006 = var9;
                                    var45.field4993 = var9.field1684;
                                    class295.field5138.method5(var45, (byte) 120);
                                } else {
                                    label548: for (int var41 = var9.field1692; var41 < class88.field1390; var41++) {
                                        int var42 = class78.field1183[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1605.length; var43++) {
                                            if (var9.field1605[var43] == var42) {
                                                class286 var44 = new class286();
                                                var44.field5006 = var9;
                                                var44.field4993 = var9.field1684;
                                                class295.field5138.method5(var44, (byte) -122);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1692 = class88.field1390;
                            }
                            if (var9.field1587 != null && class174.field3177 > var9.field1623) {
                                if (var9.field1582 == null || class174.field3177 - var9.field1623 > 32) {
                                    class286 var50 = new class286();
                                    var50.field5006 = var9;
                                    var50.field4993 = var9.field1587;
                                    class295.field5138.method5(var50, (byte) 32);
                                } else {
                                    label524: for (int var46 = var9.field1623; var46 < class174.field3177; var46++) {
                                        int var47 = class210.field3748[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1582.length; var48++) {
                                            if (var9.field1582[var48] == var47) {
                                                class286 var49 = new class286();
                                                var49.field5006 = var9;
                                                var49.field4993 = var9.field1587;
                                                class295.field5138.method5(var49, (byte) -110);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1623 = class174.field3177;
                            }
                            if (var9.field1574 != null && class326.field5551 > var9.field1724) {
                                if (var9.field1647 == null || class326.field5551 - var9.field1724 > 32) {
                                    class286 var55 = new class286();
                                    var55.field5006 = var9;
                                    var55.field4993 = var9.field1574;
                                    class295.field5138.method5(var55, (byte) 97);
                                } else {
                                    label500: for (int var51 = var9.field1724; var51 < class326.field5551; var51++) {
                                        int var52 = class278.field4875[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1647.length; var53++) {
                                            if (var9.field1647[var53] == var52) {
                                                class286 var54 = new class286();
                                                var54.field5006 = var9;
                                                var54.field4993 = var9.field1574;
                                                class295.field5138.method5(var54, (byte) -125);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1724 = class326.field5551;
                            }
                            if (var9.field1643 != null && class170.field3049 > var9.field1606) {
                                if (var9.field1680 == null || class170.field3049 - var9.field1606 > 32) {
                                    class286 var60 = new class286();
                                    var60.field5006 = var9;
                                    var60.field4993 = var9.field1643;
                                    class295.field5138.method5(var60, (byte) 86);
                                } else {
                                    label476: for (int var56 = var9.field1606; var56 < class170.field3049; var56++) {
                                        int var57 = class120.field2052[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1680.length; var58++) {
                                            if (var9.field1680[var58] == var57) {
                                                class286 var59 = new class286();
                                                var59.field5006 = var9;
                                                var59.field4993 = var9.field1643;
                                                class295.field5138.method5(var59, (byte) 15);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1606 = class170.field3049;
                            }
                            if (var9.field1676 != null && class182.field3351 > var9.field1584) {
                                if (var9.field1650 == null || class182.field3351 - var9.field1584 > 32) {
                                    class286 var65 = new class286();
                                    var65.field5006 = var9;
                                    var65.field4993 = var9.field1676;
                                    class295.field5138.method5(var65, (byte) -119);
                                } else {
                                    label452: for (int var61 = var9.field1584; var61 < class182.field3351; var61++) {
                                        int var62 = class154.field2771[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1650.length; var63++) {
                                            if (var9.field1650[var63] == var62) {
                                                class286 var64 = new class286();
                                                var64.field5006 = var9;
                                                var64.field4993 = var9.field1676;
                                                class295.field5138.method5(var64, (byte) 29);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field1584 = class182.field3351;
                            }
                            if (class172.field3142 > var9.field1659 && var9.field1593 != null) {
                                class286 var66 = new class286();
                                var66.field5006 = var9;
                                var66.field4993 = var9.field1593;
                                class295.field5138.method5(var66, (byte) -120);
                            }
                            if (class290.field5084 > var9.field1659 && var9.field1644 != null) {
                                class286 var67 = new class286();
                                var67.field5006 = var9;
                                var67.field4993 = var9.field1644;
                                class295.field5138.method5(var67, (byte) -117);
                            }
                            if (class52.field762 > var9.field1659 && var9.field1668 != null) {
                                class286 var68 = new class286();
                                var68.field5006 = var9;
                                var68.field4993 = var9.field1668;
                                class295.field5138.method5(var68, (byte) -119);
                            }
                            if (class256.field4480 > var9.field1659 && var9.field1732 != null) {
                                class286 var69 = new class286();
                                var69.field5006 = var9;
                                var69.field4993 = var9.field1732;
                                class295.field5138.method5(var69, (byte) 58);
                            }
                            if (class94.field1510 > var9.field1659 && var9.field1654 != null) {
                                class286 var70 = new class286();
                                var70.field5006 = var9;
                                var70.field4993 = var9.field1654;
                                class295.field5138.method5(var70, (byte) -118);
                            }
                            var9.field1659 = class242.field4217;
                            if (var9.field1613 != null) {
                                for (int var71 = 0; var71 < class137.field2429; var71++) {
                                    class286 var72 = new class286();
                                    var72.field5006 = var9;
                                    var72.field5002 = class197.field3562[var71];
                                    var72.field5008 = class91.field1427[var71];
                                    var72.field4993 = var9.field1613;
                                    class295.field5138.method5(var72, (byte) 52);
                                }
                            }
                            if (class310.field5363 && var9.field1627 != null) {
                                class286 var73 = new class286();
                                var73.field5006 = var9;
                                var73.field4993 = var9.field1627;
                                class295.field5138.method5(var73, (byte) -122);
                            }
                        }
                    }
                    if (!var9.field1640 && class272.field4776 == null && class295.field5151 == null && !class62.field989) {
                        if ((var9.field1656 >= 0 || var9.field1607 != 0) && class317.field5456 >= var12 && class171.field3116 >= var13 && class317.field5456 < var14 && class171.field3116 < var15) {
                            if (var9.field1656 >= 0) {
                                class60.field967 = arg0[var9.field1656];
                            } else {
                                class60.field967 = var9;
                            }
                        }
                        if (var9.field1677 == 8 && class317.field5456 >= var12 && class171.field3116 >= var13 && class317.field5456 < var14 && class171.field3116 < var15) {
                            class93.field1488 = var9;
                        }
                        if (var9.field1703 > var9.field1688) {
                            class187.method1343(var9.field1673 + var10, var9.field1703, class171.field3116, var11, var9.field1688, var9, class317.field5456, 100);
                        }
                    }
                    if (var9.field1677 == 0) {
                        method1825(arg0, var9.field1649, var12, var13, var14, var15, var10 - var9.field1597, var11 - var9.field1701);
                        if (var9.field1636 != null) {
                            method1825(var9.field1636, var9.field1649, var12, var13, var14, var15, var10 - var9.field1597, var11 - var9.field1701);
                        }
                        class158 var74 = (class158) class191.field3456.method1676((long) var9.field1649, (byte) -72);
                        if (var74 != null) {
                            class326.method2229(var74.field2845, (byte) 124, var13, var11, var15, var10, var12, var14);
                        }
                    }
                }
            }
        }
    }
}
