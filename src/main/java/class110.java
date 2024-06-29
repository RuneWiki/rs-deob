import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class110 extends class109 {

    @OriginalMember(owner = "client!r", name = "Nb", descriptor = "I")
    public static volatile int field2605 = -1;

    @OriginalMember(owner = "client!r", name = "Ob", descriptor = "I")
    public static int field2606 = 0;

    @OriginalMember(owner = "client!r", name = "Wb", descriptor = "Lvc;")
    private static class137 field2614 = class45.method325("K", -46);

    @OriginalMember(owner = "client!r", name = "Rb", descriptor = "I")
    public static int field2609 = 1;

    @OriginalMember(owner = "client!r", name = "ac", descriptor = "Lvc;")
    public static class137 field2618 = field2614;

    @OriginalMember(owner = "client!r", name = "Jb", descriptor = "Lvc;")
    public static class137 field2601 = class45.method325("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", -46);

    @OriginalMember(owner = "client!r", name = "Yb", descriptor = "Lvc;")
    public static class137 field2616 = class45.method325("::", -46);

    @OriginalMember(owner = "client!r", name = "Mb", descriptor = "Lvc;")
    public static class137 field2604 = field2614;

    @OriginalMember(owner = "client!r", name = "Qb", descriptor = "Lvc;")
    public static class137 field2608 = class45.method325("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -46);

    @OriginalMember(owner = "client!r", name = "bc", descriptor = "Lvc;")
    public static class137 field2619 = class45.method325("lila:", -46);

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!r", name = "Kb", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!r", name = "Lb", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!r", name = "Sb", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!r", name = "Tb", descriptor = "I")
    private int field2611;

    @OriginalMember(owner = "client!r", name = "Ub", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!r", name = "Vb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!r", name = "Xb", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!r", name = "Zb", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!r", name = "cc", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!r", name = "dc", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!r", name = "ec", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!r", name = "fc", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!r", name = "gc", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!r", name = "hc", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!r", name = "Pb", descriptor = "Ls;")
    private class116 field2607;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lia;")
    public static class57 field2599;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public static final void method842(boolean arg0) {
        if (class63.field1342[96]) {
            class98.field2291 += (-class98.field2291 + -24) / 2;
        } else if (class63.field1342[97]) {
            class98.field2291 += (24 - class98.field2291) / 2;
        } else {
            class98.field2291 /= 2;
        }
        if (!class63.field1342[98]) {
            if (class63.field1342[99]) {
                class84.field1900 += (-class84.field1900 + -12) / 2;
            } else {
                class84.field1900 /= 2;
            }
        } else {
            class84.field1900 += (-class84.field1900 + 12) / 2;
        }
        class105.field2436 = class98.field2291 / 2 + class105.field2436 & 2047;
        ++field2600;
        class48.field1087 += class84.field1900 / 2;
        int var1 = class120.field2798 + class104.field2412.field1672;
        if (class48.field1087 < 128) {
            class48.field1087 = 128;
        }
        int var2 = class129.field3016 + class104.field2412.field1646;
        if (-var1 + class106.field2466 < -500 || class106.field2466 - var1 > 500 || -var2 + class24.field583 < -500 || -var2 + class24.field583 > 500) {
            class24.field583 = var2;
            class106.field2466 = var1;
        }
        if (~class48.field1087 < -384) {
            class48.field1087 = 383;
        }
        if (class106.field2466 != var1) {
            class106.field2466 += (var1 - class106.field2466) / 16;
        }
        if (~class24.field583 != ~var2) {
            class24.field583 += (-class24.field583 + var2) / 16;
        }
        int var3 = class24.field583 >> 7;
        if (!arg0) {
            int var4 = class106.field2466 >> 7;
            int var5 = class32.method241(class106.field2466, (byte) 8, class28.field627, class24.field583);
            int var6 = 0;
            if (~var4 < -4 && ~var3 < -4 && var4 < 100 && var3 < 100) {
                for (int var7 = var4 + -4; ~var7 >= ~(var4 - -4); ++var7) {
                    for (int var8 = var3 + -4; var3 + 4 >= var8; ++var8) {
                        int var9 = class28.field627;
                        if (var9 < 3 && ~(class70.field1490[1][var7][var8] & 2) == -3) {
                            ++var9;
                        }
                        int var10 = -class61.field1329[var9][var7][var8] + var5;
                        if (~var6 > ~var10) {
                            var6 = var10;
                        }
                    }
                }
            }
            int var11 = var6 * 192;
            if (~var11 < -98049) {
                var11 = 98048;
            }
            if (~var11 > -32769) {
                var11 = 32768;
            }
            if (class78.field1729 < var11) {
                class78.field1729 += (var11 - class78.field1729) / 24;
            } else if (~var11 > ~class78.field1729) {
                class78.field1729 += (-class78.field1729 + var11) / 80;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IB)V")
    public final void method843(int[] arg0, byte arg1) {
        this.field2607 = new class116(arg0);
        if (arg1 != 77) {
            field2601 = null;
        }
        ++field2622;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)V")
    public static final void method844(int arg0, int arg1, int arg2) {
        ++field2612;
        int var3 = 0;
        int var4 = -128 / ((arg1 - -71) / 51);
        for (int var5 = 0; var5 < 100; ++var5) {
            if (class37.field810[var5] != null) {
                int var6 = class37.field830[var5];
                int var7 = 70 - var3 * 14 + class40.field912 - -4;
                if (var7 < -20) {
                    break;
                }
                if (~var6 == -1) {
                    ++var3;
                }
                class137 var8 = class12.field274[var5];
                if (var8 != null && var8.method1014(class59.field1266, (byte) 103)) {
                    var8 = var8.method1035(1, 5);
                }
                if (var8 != null && var8.method1014(class84.field1907, (byte) 45)) {
                    var8 = var8.method1035(1, 5);
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || ~class21.field453 == -1 || class21.field453 == 1 && class19.method169(-1, var8))) {
                    if (arg0 > var7 + -14 && arg0 <= var7 && !var8.method1026(-1, class104.field2412.field2909)) {
                        if (~class12.field275 <= -2) {
                            class71.method498(27, class88.method666(124, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class46.field1040);
                            ++class114.field2698;
                        }
                        class71.method498(16, class88.method666(-14, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class36.field782);
                        ++class80.field1780;
                        ++class24.field573;
                        class71.method498(36, class88.method666(111, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class114.field2715);
                    }
                    ++var3;
                }
                if ((var6 == 3 || var6 == 7) && class7.field145 == 0 && (~var6 == -8 || class71.field1510 == 0 || class71.field1510 == 1 && class19.method169(-1, var8))) {
                    ++var3;
                    if (~arg0 < ~(var7 + -14) && arg0 <= var7) {
                        ++class80.field1780;
                        ++class24.field573;
                        if (class12.field275 >= 1) {
                            class71.method498(27, class88.method666(-126, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class46.field1040);
                            ++class114.field2698;
                        }
                        class71.method498(16, class88.method666(124, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class36.field782);
                        class71.method498(36, class88.method666(127, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class114.field2715);
                    }
                }
                if (var6 == 4 && (field2606 == 0 || field2606 == 1 && class19.method169(-1, var8))) {
                    if (~arg0 < ~(var7 + -14) && arg0 <= var7) {
                        ++class143.field3376;
                        class71.method498(37, class88.method666(116, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class23.field549);
                    }
                    ++var3;
                }
                if ((~var6 == -6 || var6 == 6) && ~class7.field145 == -1 && class71.field1510 < 2) {
                    ++var3;
                }
                if (~var6 == -9 && (field2606 == 0 || field2606 == 1 && class19.method169(-1, var8))) {
                    if (arg0 > var7 - 14 && var7 >= arg0) {
                        ++class10.field207;
                        class71.method498(28, class88.method666(120, new class137[] { class80.field1778, var8 }), 0, 0, 2916, 0, class120.field2793);
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(II)V")
    public final void method845(int arg0, int arg1) {
        if (arg1 == 100) {
            super.field2547[super.field2583++] = (byte) (arg0 + this.field2607.method895((byte) -32));
            ++field2621;
        }
    }

    @OriginalMember(owner = "client!r", name = "j", descriptor = "(II)I")
    public final int method846(int arg0, int arg1) {
        ++field2602;
        if (arg0 != 46) {
            field2599 = null;
        }
        return arg1 * 8 - this.field2611;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(IB)I")
    public final int method847(int arg0, byte arg1) {
        ++field2624;
        if (arg1 <= 43) {
            return -27;
        } else {
            int var3 = this.field2611 >> 3;
            int var4 = -(7 & this.field2611) + 8;
            this.field2611 += arg0;
            int var5 = 0;
            while (var4 < arg0) {
                var5 += (super.field2547[var3++] & class56.field1194[var4]) << -var4 + arg0;
                arg0 -= var4;
                var4 = 8;
            }
            int var6;
            if (~arg0 != ~var4) {
                var6 = (class56.field1194[arg0] & super.field2547[var3] >> var4 - arg0) + var5;
            } else {
                var6 = (class56.field1194[var4] & super.field2547[var3]) + var5;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!r", name = "k", descriptor = "(B)V")
    public final void method848(byte arg0) {
        this.field2611 = super.field2583 * 8;
        if (arg0 < 60) {
            this.method846(-14, 108);
        }
        ++field2620;
    }

    @OriginalMember(owner = "client!r", name = "s", descriptor = "(I)V")
    public static void method849(int arg0) {
        field2618 = null;
        field2604 = null;
        field2614 = null;
        field2601 = null;
        field2599 = null;
        int var1 = 52 % ((74 - arg0) / 36);
        field2608 = null;
        field2616 = null;
        field2619 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method850(byte arg0, String arg1, Throwable arg2) {
        ++field2615;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class42.method299(arg2, -84);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            int var6 = 41 % ((arg0 - 67) / 56);
            String var7 = var5.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class49.field1103.field1116 != null) {
                class136 var9 = class49.field1103.method361((byte) -64, new URL(class49.field1103.field1116.getCodeBase(), "clienterror.ws?c=" + class46.field1025 + "&u=" + class68.field1402 + "&v1=" + class50.field1124 + "&v2=" + class50.field1115 + "&e=" + var8));
                while (~var9.field3131 == -1) {
                    class28.method219(true, 1L);
                }
                if (var9.field3131 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field3129;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
    public static final int method851(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg1 << 16) + arg0);
        if (arg2 < 31) {
            return -97;
        } else {
            ++field2623;
            return class7.field137 != null && ~class7.field137.field2490 == ~var3 ? class24.field580.field2583 * 99 / (class24.field580.field2547.length + -class7.field137.field839) + 1 : 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB[Lic;I[BI)V")
    public static final void method852(int arg0, int arg1, byte arg2, class59[] arg3, int arg4, byte[] arg5, int arg6) {
        ++field2625;
        for (int var7 = 0; var7 < 4; ++var7) {
            for (int var12 = 0; ~var12 > -65; ++var12) {
                for (int var13 = 0; ~var13 > -65; ++var13) {
                    if (~(arg4 + var12) < -1 && arg4 + var12 < 103 && ~(arg0 - -var13) < -1 && arg0 + var13 < 103) {
                        arg3[var7].field1267[arg4 + var12][arg0 - -var13] = class45.method323(arg3[var7].field1267[arg4 + var12][arg0 - -var13], -16777217);
                    }
                }
            }
        }
        class109 var8 = new class109(arg5);
        if (arg2 < -20) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    for (int var11 = 0; var11 < 64; ++var11) {
                        class83.method608(arg0 + var11, arg4 + var10, 49, arg1, var8, var9, 0, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "t", descriptor = "(I)I")
    public final int method853(int arg0) {
        if (arg0 < 11) {
            this.method854(true);
        }
        ++field2617;
        return super.field2547[super.field2583++] + -this.field2607.method895((byte) -32) & 255;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Z)V")
    public final void method854(boolean arg0) {
        super.field2583 = (this.field2611 + 7) / 8;
        ++field2603;
        if (arg0) {
            method851(-15, 70, 111);
        }
    }
}
