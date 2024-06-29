import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class75 extends class122 {

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Led;")
    private class31 field1694;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lae;")
    public static class6 field1689 = class64.method474(113, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    public static int field1687 = 0;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "Lae;")
    public static class6 field1706 = class64.method474(119, "blinken1:");

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Lae;")
    public static class6 field1710 = class64.method474(120, " ");

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "Lae;")
    private static class6 field1711 = class64.method474(116, "(X100(U(Y");

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lae;")
    private static class6 field1719 = class64.method474(110, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!mb", name = "N", descriptor = "Lae;")
    public static class6 field1704 = field1719;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!mb", name = "J", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!mb", name = "K", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!mb", name = "L", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!mb", name = "M", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!mb", name = "R", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!mb", name = "O", descriptor = "Lsc;")
    private class112 field1705;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Z")
    private boolean field1693;

    @OriginalMember(owner = "client!mb", name = "Q", descriptor = "Z")
    private boolean field1707;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[B")
    private byte[] field1717;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "[Lva;")
    public static class128[] field1716;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 3)
    public static final void method593(int arg0) {
        if (arg0 != 6255) {
            method604(-28, (byte) 49);
        }
        for (class126 var1 = (class126) class25.field629.method798(false); var1 != null; var1 = (class126) class25.field629.method792((byte) -87)) {
            if (class15.field305 != var1.field3063 || var1.field3080) {
                var1.method498(arg0 ^ 0x1806);
            } else if (var1.field3084 <= class5.field61) {
                var1.method1026(class82.field2005, arg0 - 6253);
                if (var1.field3080) {
                    var1.method498(105);
                } else {
                    class81.field1967.method540(var1.field3063, var1.field3065, var1.field3062, var1.field3095, 60, var1, 0, -1, false);
                }
            }
        }
        field1696++;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 40)
    public static void method594(int arg0) {
        field1706 = null;
        field1710 = null;
        field1689 = null;
        field1719 = null;
        if (arg0 == -1228312600) {
            field1716 = null;
            field1711 = null;
            field1704 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)Lq;", line = 56)
    public static final class101 method595(boolean arg0) {
        field1695++;
        class101 var1 = new class101();
        var1.field2374 = class72.field1653[0];
        var1.field2380 = class64.field1388[0];
        var1.field2376 = class139.field3369[0];
        int var2 = var1.field2380 * var1.field2376;
        var1.field2378 = new int[var2];
        byte[] var3 = class47.field1068[0];
        var1.field2375 = class58.field1251[0];
        var1.field2379 = class90.field2154;
        var1.field2377 = class19.field374;
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field2378[var4] = class103.field2429[class60.method451(var3[var4], 255)];
        }
        if (arg0) {
            class25.method230(false);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V", line = 94)
    public static final void method596(byte arg0) {
        while (true) {
            if (class85.field2051.method931(115, class69.field1528) >= 27) {
                int var1 = class85.field2051.method939(15, -13873);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class49.field1097[var1] == null) {
                        class49.field1097[var1] = new class2();
                        var2 = true;
                    }
                    class2 var3 = class49.field1097[var1];
                    class42.field967[class138.field3365++] = var1;
                    var3.field1770 = class5.field61;
                    int var4 = class85.field2051.method939(1, -13873);
                    if (var4 == 1) {
                        class87.field2081[class92.field2205++] = var1;
                    }
                    var3.field11 = class138.method1117(-24223, class85.field2051.method939(13, -13873));
                    int var5 = class85.field2051.method939(5, -13873);
                    int var6 = client.field477[class85.field2051.method939(3, -13873)];
                    if (var2) {
                        var3.field1722 = var6;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class85.field2051.method939(5, arg0 - 13999);
                    int var8 = class85.field2051.method939(1, -13873);
                    var3.field1721 = var3.field11.field2365;
                    var3.field1777 = var3.field11.field2347;
                    var3.field1738 = var3.field11.field2353;
                    var3.field1759 = var3.field11.field2358;
                    var3.field1739 = var3.field11.field2335;
                    var3.field1761 = var3.field11.field2362;
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var3.field1800 = var3.field11.field2371;
                    if (var3.field1721 == 0) {
                        var3.field1722 = 0;
                    }
                    var3.field1728 = var3.field11.field2340;
                    var3.field1737 = var3.field11.field2360;
                    var3.method607(class12.field229.field1726[0] + var7, var8 == 1, (byte) -15, class12.field229.field1796[0] + var5);
                    continue;
                }
            }
            field1690++;
            if (arg0 != 126) {
                field1704 = null;
            }
            class85.field2051.method934(1);
            return;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILbf;)V", line = 168)
    public static final void method597(int arg0, class14 arg1) {
        field1699++;
        class30.field730 = arg1;
        if (arg0 != 16965) {
            method600(-32);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V", line = 188)
    public final void method363(int arg0, byte arg1) {
        if (arg1 <= 44) {
            method594(104);
        }
        field1702++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILvb;I)V", line = 199)
    public static final void method598(int arg0, class129 arg1, int arg2) {
        field1697++;
        if (class92.field2199 != null) {
            class92.field2199.field1821 = arg2 * 4 + 5;
            int var3 = class92.field2199.method647((byte) -72);
            arg1.method1040(87, var3);
            return;
        }
        class96.method801(255, null, 255, true, 0, (byte) 72, (byte) 0);
        class57.field1246[arg2] = arg1;
        if (arg0 != 30653) {
            method600(52);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIII)I", line = 231)
    public static final int method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg5;
            arg5 = var8;
        }
        if (arg3 != 7) {
            method599(122, -25, -57, -71, 6, 7, -50);
        }
        field1718++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg2;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg6;
        } else {
            return 1 + 7 - arg5 - arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 266)
    public static final void method600(int arg0) {
        field1712++;
        try {
            if (arg0 == 8) {
                Graphics var1 = class70.field1564.getGraphics();
                class65.field1419.method1(arg0 - 129, var1, 553, 205);
            }
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V", line = 291)
    public static final void method601(byte arg0) {
        class43.field988 = null;
        class26.field664 = null;
        if (arg0 != -76) {
            method597(91, null);
        }
        class103.field2433 = null;
        field1714++;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 307)
    public final void method365(boolean arg0) {
        field1701++;
        if (this.field1693) {
            try {
                class127.method1031("midibox.src=\"c:/silence.mid\";", 19048, this.field1694.field766);
            } catch (Throwable var2) {
            }
            this.field1693 = false;
        }
        this.field1705 = null;
        if (arg0) {
            field1688 = 27;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lte;", line = 327)
    public static final class121 method602(int arg0, int arg1, int arg2) {
        field1691++;
        if (arg2 != 0) {
            field1711 = null;
        }
        class121 var3 = class67.method490((byte) 69, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field2885 == null || arg1 >= var3.field2885.length) {
            return null;
        } else {
            return var3.field2885[arg1];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V", line = 348)
    public final void method360(int arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            arg1 = 1;
        }
        int var4 = class76.method610(929, arg1) - arg0;
        field1713++;
        if (this.field1705 != null) {
            this.field1720 = var4;
        } else if (this.field1693) {
            try {
                class127.method1031("midibox.volume=" + var4 + ";", 19048, this.field1694.field766);
                return;
            } catch (Throwable var5) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 377)
    public final void method362(int arg0) {
        if (arg0 < 100) {
            method594(-51);
        }
        field1709++;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V", line = 387)
    public static final void method603(byte arg0) {
        class104.method881(false, false);
        class63.field1387 = 0;
        boolean var1 = true;
        field1700++;
        for (int var2 = 0; var2 < class118.field2816.length; var2++) {
            if (class22.field574[var2] != -1 && class118.field2816[var2] == null) {
                class118.field2816[var2] = class21.field518.method160(30605, class22.field574[var2], 0);
                if (class118.field2816[var2] == null) {
                    var1 = false;
                    class63.field1387++;
                }
            }
            if (class108.field2598[var2] != -1 && class12.field223[var2] == null) {
                class12.field223[var2] = class21.field518.method152(class108.field2598[var2], 0, class20.field400[var2], (byte) 73);
                if (class12.field223[var2] == null) {
                    class63.field1387++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class4.field39 = 1;
            return;
        }
        boolean var3 = true;
        class25.field634 = 0;
        for (int var4 = 0; var4 < class118.field2816.length; var4++) {
            byte[] var56 = class12.field223[var4];
            if (var56 != null) {
                int var57 = (class130.field3144[var4] & 0xFF) * 64 - class61.field1329;
                int var58 = (class130.field3144[var4] >> 8) * 64 - class130.field3164;
                if (class123.field3027) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class20.method188(false, var57, var58, var56);
            }
        }
        if (!var3) {
            class4.field39 = 2;
            return;
        }
        if (class4.field39 != 0) {
            class43.method359(true, class15.field319, field1711, -111);
        }
        class122.method1002(false);
        class81.field1967.method543();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class90.field2160[var5].method382((byte) -123);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class108.field2582[var6][var54][var55] = 0;
                }
            }
        }
        class107.method899(-100);
        int var7 = class118.field2816.length;
        class100.method844((byte) 124);
        class104.method881(true, false);
        if (!class123.field3027) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class130.field3144[var8] >> 8) * 64 - class130.field3164;
                int var18 = (class130.field3144[var8] & 0xFF) * 64 - class61.field1329;
                byte[] var19 = class118.field2816[var8];
                if (var19 != null) {
                    class89.method750(class90.field2160, var18, var19, (byte) 117, var17, (class130.field3167 - 6) * 8, field1688 * 8 - 48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class130.field3144[var9] >> 8) * 64 - class130.field3164;
                int var15 = (class130.field3144[var9] & 0xFF) * 64 - class61.field1329;
                byte[] var16 = class118.field2816[var9];
                if (var16 == null && class130.field3167 < 800) {
                    class138.method1113(var14, (byte) -17, var15, 64, 64);
                }
            }
            class104.method881(true, false);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class12.field223[var10];
                if (var11 != null) {
                    int var12 = (class130.field3144[var10] >> 8) * 64 - class130.field3164;
                    int var13 = (class130.field3144[var10] & 0xFF) * 64 - class61.field1329;
                    class76.method614(class81.field1967, (byte) -93, var12, class90.field2160, var11, var13);
                }
            }
        }
        if (class123.field3027) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class51.field1137[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 1 & 0x3;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + (var41 / 8);
                            for (int var43 = 0; var43 < class130.field3144.length; var43++) {
                                if (class130.field3144[var43] == var42 && class118.field2816[var43] != null) {
                                    var36 = true;
                                    class20.method190(-127, (var39 & 0x7) * 8, var20, class118.field2816[var43], class90.field2160, var40, var34 * 8, (var41 & 0x7) * 8, var38, var35 * 8);
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class116.method953(var20, var35 * 8, true, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class51.field1137[0][var21][var32];
                    if (var33 == -1) {
                        class138.method1113(var21 * 8, (byte) -17, var32 * 8, 8, 8);
                    }
                }
            }
            class104.method881(true, false);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class51.field1137[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + (var28 / 8);
                            for (int var31 = 0; var31 < class130.field3144.length; var31++) {
                                if (class130.field3144[var31] == var30 && class12.field223[var31] != null) {
                                    class105.method889(class12.field223[var31], var27, var22, true, var23 * 8, var26, class81.field1967, (var29 & 0x7) * 8, (var28 & 0x7) * 8, var24 * 8, class90.field2160);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class104.method881(true, false);
        class122.method1002(false);
        class32.method292(-128, class81.field1967, class90.field2160);
        class104.method881(true, false);
        int var44 = class47.field1069;
        if (var44 > class15.field305) {
            var44 = class15.field305;
        }
        if (class15.field305 - 1 > var44) {
            int var45 = class15.field305 - 1;
        }
        if (class82.field2017) {
            class81.field1967.method555(class47.field1069);
        } else {
            class81.field1967.method555(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class130.method1049(var46, var53, (byte) -127);
            }
        }
        class57.method431(-1);
        class79.field1919.method129(27392);
        if (class18.field349 != null) {
            class7.field137++;
            class111.field2660.method938((byte) 63, 141);
            class111.field2660.method644(1057001181, (byte) 38);
        }
        if (!class123.field3027) {
            int var47 = (field1688 - 6) / 8;
            int var48 = (field1688 + 6) / 8;
            int var49 = (class130.field3167 + 6) / 8;
            int var50 = (class130.field3167 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var49 + 1; var52++) {
                    if (var47 > var51 || var48 < var51 || var52 < var50 || var52 > var49) {
                        class21.field518.method139(class85.method731(new class6[] { class109.field2627, class114.method942((byte) 71, var51), class56.field1235, class114.method942((byte) 71, var52) }, 14569), (byte) 60);
                        class21.field518.method139(class85.method731(new class6[] { class107.field2543, class114.method942((byte) 71, var51), class56.field1235, class114.method942((byte) 71, var52) }, 14569), (byte) 60);
                    }
                }
            }
        }
        if (class72.field1649 == -1) {
            class139.method1122((byte) 40, 30);
        } else {
            class139.method1122((byte) 40, 35);
        }
        class118.method969(-1083);
        class111.field2660.method938((byte) 63, 21);
        class70.method512(31603);
        if (arg0 >= -112) {
            field1688 = -76;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 846)
    public final void method364(int arg0) {
        field1692++;
        if (this.field1705 == null || this.field1705.field2686 == arg0) {
            return;
        }
        if (this.field1705.field2686 == 1) {
            class13 var2 = (class13) this.field1705.field2687;
            try {
                var2.method137(true, this.field1717.length, 0, this.field1717);
                var2.method132((byte) -72);
                try {
                    class127.method1031("midibox.loop=" + (this.field1707 ? "\"infinite\"" : "0") + "; midibox.src=\"" + var2.method133(true).getPath().replace('\\', '/') + "\"; midibox.volume=" + this.field1720 + ";", 19048, this.field1694.field766);
                    this.field1693 = true;
                } catch (Throwable var4) {
                }
            } catch (Exception var5) {
                try {
                    var2.method132((byte) 116);
                } catch (Exception var3) {
                }
            }
        }
        this.field1705 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BBZ)V", line = 891)
    public final void method361(int arg0, byte[] arg1, byte arg2, boolean arg3) {
        field1715++;
        if (arg2 <= 73) {
            this.field1705 = null;
        }
        this.field1705 = this.field1694.method288((byte) -86);
        if (this.field1705 == null) {
            return;
        }
        if (arg0 == 0) {
            arg0 = 1;
        }
        this.field1720 = class76.method610(929, arg0);
        this.field1717 = arg1;
        this.field1707 = arg3;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(IB)Lae;", line = 919)
    public static final class6 method604(int arg0, byte arg1) {
        field1698++;
        class6 var2 = class114.method942((byte) 71, arg0);
        for (int var3 = var2.method41(-8521) - 3; var3 > 0; var3 -= 3) {
            var2 = class85.method731(new class6[] { var2.method30(0, -1, var3), class105.field2505, var2.method56(-58, var3) }, 14569);
        }
        if (var2.method41(-8521) > 8) {
            var2 = class85.method731(new class6[] { class70.field1575, var2.method30(0, -1, var2.method41(-8521) - 8), class103.field2437, class12.field222, var2, class105.field2500 }, 14569);
        } else if (var2.method41(-8521) > 4) {
            var2 = class85.method731(new class6[] { class6.field129, var2.method30(0, -1, var2.method41(-8521) - 4), class67.field1486, class12.field222, var2, class105.field2500 }, 14569);
        }
        if (arg1 > -69) {
            field1719 = null;
        }
        return class85.method731(new class6[] { field1710, var2 }, 14569);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Led;)V", line = 947)
    public class75(class31 arg0) {
        this.field1694 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V", line = 955)
    public static final void method605(byte arg0, int arg1) {
        field1703++;
        class135.method1102(arg1, (byte) 110);
        int var2 = 96 / ((40 - arg0) / 60);
    }
}
