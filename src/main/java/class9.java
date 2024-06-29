import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class9 {

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "Lmb;")
    public static class132 field90 = class166.method1092("(U0a )2 non)2existant gosub script)2num: ", 111);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "[Z")
    public static boolean[] field85 = new boolean[112];

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "Lmb;")
    public static class132 field87 = class166.method1092("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 115);

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lkg;")
    public static class115 field94 = new class115(20);

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "Lmb;")
    private static class132 field98 = class166.method1092("as it was used to break our rules)3", 125);

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
    public static int[] field99 = new int[256];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "Lmb;")
    public static class132 field102 = class166.method1092("Konfig geladen)3", 115);

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "Lmb;")
    public static class132 field95 = field98;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Lmb;")
    private static class132 field97 = class166.method1092("You need a members account to login to this world)3", 114);

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lmb;")
    public static class132 field103 = field97;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
    public static int[] field93;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[[Z")
    public static boolean[][] field100;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public abstract void method39(byte arg0);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIILmb;Ljava/awt/Color;)V")
    public static final void method40(boolean arg0, int arg1, int arg2, class132 arg3, Color arg4) {
        try {
            Graphics var5 = class154.field2814.getGraphics();
            if (class171.field3191 == null) {
                class171.field3191 = new Font("Helvetica", 1, 13);
                class116.field2228 = class154.field2814.getFontMetrics(class171.field3191);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class187.field3461, class47.field813);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class36.field593 == null) {
                    class36.field593 = class154.field2814.createImage(304, 34);
                }
                Graphics var6 = class36.field593.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                int var7 = 18 / ((arg2 - 12) / 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class171.field3191);
                var6.setColor(Color.white);
                arg3.method861((304 - arg3.method878(127, class116.field2228)) / 2, 22, var6, (byte) 50);
                var5.drawImage(class36.field593, class187.field3461 / 2 - 152, class47.field813 / 2 + -18, null);
            } catch (Exception var10) {
                int var8 = class187.field3461 / 2 - 152;
                int var9 = class47.field813 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 - -2, 300 - arg1 * 3, 30);
                var5.setFont(class171.field3191);
                var5.setColor(Color.white);
                arg3.method861(var8 + (304 - arg3.method878(98, class116.field2228)) / 2, var9 + 22, var5, (byte) 72);
            }
            if (class243.field4388 != null) {
                var5.setFont(class171.field3191);
                var5.setColor(Color.white);
                class243.field4388.method861(class187.field3461 / 2 - class243.field4388.method878(116, class116.field2228) / 2, class47.field813 / 2 - 26, var5, (byte) 105);
            }
        } catch (Exception var11) {
            class154.field2814.repaint();
        }
        field96++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
    public abstract int method41(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
    public static void method42(int arg0) {
        field103 = null;
        if (arg0 != 1314) {
            return;
        }
        field95 = null;
        field100 = null;
        field85 = null;
        field97 = null;
        field87 = null;
        field90 = null;
        field93 = null;
        field94 = null;
        field102 = null;
        field98 = null;
        field99 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
    public static final boolean method43(int arg0, boolean arg1) {
        field88++;
        if (arg1) {
            method46(2, -19);
        }
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
    public static final void method44(boolean arg0, int arg1) {
        field86++;
        class210.field3862 = -1;
        class56.field953 = arg1;
        class210.field3862 = -1;
        class31.method222(126);
        if (!arg0) {
            method44(true, -57);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field92++;
        int var8 = 2048 - arg0 & 0x7FF;
        int var9 = 0;
        int var10 = arg5 - arg7 & 0x7FF;
        int var11 = 0;
        int var12 = arg3;
        if (var8 != 0) {
            int var13 = class50.field853[var8];
            int var14 = class50.field851[var8];
            int var15 = var11 * var14 - arg3 * var13 >> 16;
            var12 = var11 * var13 + arg3 * var14 >> 16;
            var11 = var15;
        }
        if (var10 != 0) {
            int var16 = class50.field851[var10];
            int var17 = class50.field853[var10];
            int var18 = var9 * var16 + var12 * var17 >> 16;
            var12 = var12 * var16 - var9 * var17 >> 16;
            var9 = var18;
        }
        class140.field2629 = arg1 - var11;
        class234.field4215 = arg7;
        client.field545 = arg4 - var12;
        class47.field814 = arg2 - var9;
        class64.field1064 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
    public static final int method46(int arg0, int arg1) {
        field91++;
        int var2 = arg0 * 6 - 61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 == -14189) {
            int var4 = (arg0 * var2 >> 12) + 40960;
            return var3 * var4 >> 12;
        } else {
            return -59;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)Z")
    public static final boolean method47(byte arg0) throws IOException {
        field101++;
        if (class166.field3027 == null) {
            return false;
        }
        int var1 = class166.field3027.method424(5000);
        if (var1 == 0) {
            return false;
        }
        if (class173.field3235 == -1) {
            class166.field3027.method418(class118.field2241.field2157, (byte) 114, 0, 1);
            var1--;
            class118.field2241.field2133 = 0;
            class173.field3235 = class118.field2241.method652(113);
            class39.field630 = class181.field3320[class173.field3235];
        }
        if (class39.field630 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class166.field3027.method418(class118.field2241.field2157, (byte) 102, 0, 1);
            class39.field630 = class118.field2241.field2157[0] & 0xFF;
        }
        if (class39.field630 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class166.field3027.method418(class118.field2241.field2157, (byte) 124, 0, 2);
            class118.field2241.field2133 = 0;
            class39.field630 = class118.field2241.method739(-126);
        }
        if (class39.field630 > var1) {
            return false;
        }
        class118.field2241.field2133 = 0;
        class166.field3027.method418(class118.field2241.field2157, (byte) 111, 0, class39.field630);
        class55.field941 = class86.field1502;
        class64.field1063 = 0;
        class86.field1502 = class111.field2113;
        class111.field2113 = class173.field3235;
        if (class173.field3235 == 55) {
            int var2 = class118.field2241.method753(false);
            class102.method634(var2, 119);
            class42.field706[class75.method450(31, class91.field1614++)] = class75.method450(var2, 32767);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 140) {
            int var3 = class118.field2241.method730(1848);
            int var4 = class118.field2241.method748(-18687);
            class96 var5 = class158.method1029((byte) -115, var4);
            if (var5 != null && var5.field1760 == 0) {
                if (var5.field1833 - var5.field1740 < var3) {
                    var3 = var5.field1833 - var5.field1740;
                }
                if (var3 < 0) {
                    var3 = 0;
                }
                if (var5.field1695 != var3) {
                    var5.field1695 = var3;
                    class183.method1174(var5, 16235);
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 118) {
            long var6 = class118.field2241.method762((byte) -128);
            class132 var8 = class107.method682(class234.method1480(true, class118.field2241).method891((byte) 32));
            class169.method1108(-21, var8, 6, class164.method1057((byte) 11, var6).method900(0));
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 135) {
            int var9 = class118.field2241.method748(-18687);
            int var10 = class118.field2241.method739(-127);
            class192.field3582[var10] = var9;
            if (class77.field1315[var10] != var9) {
                class77.field1315[var10] = var9;
                class16.method85(var10, (byte) 37);
            }
            class112.field2134[class75.method450(class52.field884++, 31)] = var10;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 128) {
            int var11 = class118.field2241.method716(-1308);
            int var12 = var11 >> 6;
            class59 var13 = new class59();
            var13.field989 = var11 & 0x3F;
            var13.field1012 = class118.field2241.method716(arg0 - 1218);
            if (var13.field1012 >= 0 && var13.field1012 < class17.field261.length) {
                if (var13.field989 == 1 || var13.field989 == 10) {
                    var13.field1004 = class118.field2241.method739(arg0 ^ 0x27);
                    class118.field2241.field2133 += 3;
                } else if (var13.field989 >= 2 && var13.field989 <= 6) {
                    if (var13.field989 == 2) {
                        var13.field1009 = 64;
                        var13.field1002 = 64;
                    }
                    if (var13.field989 == 3) {
                        var13.field1009 = 0;
                        var13.field1002 = 64;
                    }
                    if (var13.field989 == 4) {
                        var13.field1009 = 128;
                        var13.field1002 = 64;
                    }
                    if (var13.field989 == 5) {
                        var13.field1009 = 64;
                        var13.field1002 = 0;
                    }
                    if (var13.field989 == 6) {
                        var13.field1002 = 128;
                        var13.field1009 = 64;
                    }
                    var13.field989 = 2;
                    var13.field986 = class118.field2241.method739(-127);
                    var13.field988 = class118.field2241.method739(-124);
                    var13.field1007 = class118.field2241.method716(-1308);
                }
                var13.field1008 = class118.field2241.method739(-128);
                if (var13.field1008 == 65535) {
                    var13.field1008 = -1;
                }
                class203.field3742[var12] = var13;
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 151) {
            class132 var14 = class118.field2241.method720((byte) 108);
            int var15 = class118.field2241.method711(arg0 ^ 0x75B);
            int var16 = class118.field2241.method763(65280);
            if (var15 >= 1 && var15 <= 8) {
                if (var14.method882(arg0 + 24583, class100.field1878)) {
                    var14 = null;
                }
                class42.field671[var15 - 1] = var14;
                class147.field2720[var15 - 1] = var16 == 0;
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 220) {
            class22.field313 = class118.field2241.method711(-1795);
            class73.field1214 = class118.field2241.method716(-1308);
            while (class118.field2241.field2133 < class39.field630) {
                class173.field3235 = class118.field2241.method716(-1308);
                class30.method216(arg0 ^ 0xFFFF8B3F);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 175) {
            int var17 = class118.field2241.method748(-18687);
            boolean var18 = class118.field2241.method732((byte) 95) == 1;
            class96 var19 = class158.method1029((byte) -106, var17);
            if (var18 != var19.field1806) {
                var19.field1806 = var18;
                class183.method1174(var19, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 71) {
            int var20 = class118.field2241.method744((byte) 124);
            if (var20 == 65535) {
                var20 = -1;
            }
            class127.method836(var20, 2);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 137) {
            int var21 = class118.field2241.method714(arg0 ^ 0x7964);
            int var22 = class118.field2241.method739(-123);
            if (var22 == 65535) {
                var22 = -1;
            }
            class234.method1485(var21, var22, 0);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 113) {
            class147.method984(118);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 189) {
            int var23 = class118.field2241.method748(-18687);
            int var24 = class118.field2241.method730(1848);
            if (var24 == 65535) {
                var24 = -1;
            }
            int var25 = class118.field2241.method730(1848);
            int var26 = class118.field2241.method748(arg0 ^ 0x48A7);
            if (var25 == 65535) {
                var25 = -1;
            }
            for (int var27 = var25; var27 <= var24; var27++) {
                long var28 = ((long) var23 << 32) + (long) var27;
                class151 var30 = class236.field4269.method806(arg0 ^ 0x59, var28);
                if (var30 != null) {
                    var30.method995((byte) -40);
                }
                class236.field4269.method810(new class171(var26), var28, -18274);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 106) {
            class102.field1910 = class118.field2241.method716(-1308);
            class173.field3235 = -1;
            class113.field2183 = class13.field167;
            return true;
        } else if (class173.field3235 == 24) {
            int var31 = class118.field2241.method730(1848);
            if (var31 == 65535) {
                var31 = -1;
            }
            int var32 = class118.field2241.method728((byte) 86);
            int var33 = class118.field2241.method757((byte) 57);
            class96 var34 = class158.method1029((byte) -109, var33);
            if (var34.field1766) {
                var34.field1774 = var32;
                var34.field1821 = var31;
                class243 var35 = class58.method389(0, var31);
                var34.field1741 = var35.field4413;
                var34.field1771 = var35.field4435;
                var34.field1750 = var35.field4431;
                if (var34.field1827 > 0) {
                    var34.field1771 = var34.field1771 * 32 / var34.field1827;
                } else if (var34.field1715 > 0) {
                    var34.field1771 = var34.field1771 * 32 / var34.field1715;
                }
                var34.field1819 = var35.field4424;
                var34.field1730 = var35.field4392;
                var34.field1765 = var35.field4393;
                class183.method1174(var34, 16235);
            } else if (var31 == -1) {
                class173.field3235 = -1;
                var34.field1734 = 0;
                return true;
            } else {
                class243 var36 = class58.method389(0, var31);
                var34.field1734 = 4;
                var34.field1741 = var36.field4413;
                var34.field1750 = var36.field4431;
                var34.field1780 = var31;
                var34.field1771 = var36.field4435 * 100 / var32;
                class183.method1174(var34, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 8) {
            int var37 = class118.field2241.method757((byte) 57);
            int var38 = class118.field2241.method753(false);
            int var39 = var38 >> 10 & 0x1F;
            int var40 = var38 & 0x1F;
            int var41 = var38 >> 5 & 0x1F;
            int var42 = (var39 << 19) + (var41 << 11) + (var40 << 3);
            class96 var43 = class158.method1029((byte) -117, var37);
            if (var43.field1739 != var42) {
                var43.field1739 = var42;
                class183.method1174(var43, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 12) {
            int var44 = class118.field2241.method728((byte) 71);
            class132 var45 = class118.field2241.method720((byte) 113);
            class96 var46 = class158.method1029((byte) -118, var44);
            if (!var45.method894((byte) -35, var46.field1773)) {
                var46.field1773 = var45;
                class183.method1174(var46, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 115) {
            int var47 = class118.field2241.method739(-124);
            int var48 = class118.field2241.method716(arg0 - 1218);
            if (var47 == 65535) {
                var47 = -1;
            }
            int var49 = class118.field2241.method739(-125);
            class216.method1347(var47, var48, var49, 0);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 171) {
            int var50 = class39.field630 + class118.field2241.field2133;
            int var51 = class118.field2241.method739(-126);
            int var52 = class118.field2241.method739(11);
            if (class45.field784 != var51) {
                class45.field784 = var51;
                class125.method819(0, class45.field784);
                class178.method1150(arg0 - 7161);
                class38.method271((byte) -17, class45.field784);
                for (int var53 = 0; var53 < 100; var53++) {
                    class196.field3636[var53] = true;
                }
            }
            while (var52-- > 0) {
                int var62 = class118.field2241.method759(arg0 + 183);
                int var63 = class118.field2241.method739(arg0 ^ 0xFFFFFFAC);
                int var64 = class118.field2241.method716(-1308);
                class73 var65 = (class73) class55.field927.method806(-1, (long) var62);
                if (var65 != null && var65.field1216 != var63) {
                    class24.method168(var65, false, true);
                    var65 = null;
                }
                if (var65 == null) {
                    var65 = class139.method938(0, var63, var62, var64);
                }
                var65.field1220 = true;
            }
            for (class73 var54 = (class73) class55.field927.method811((byte) -4); var54 != null; var54 = (class73) class55.field927.method807(-19009)) {
                if (var54.field1220) {
                    var54.field1220 = false;
                } else {
                    class24.method168(var54, false, true);
                }
            }
            class236.field4269 = new class122(512);
            while (class118.field2241.field2133 < var50) {
                int var55 = class118.field2241.method759(57);
                int var56 = class118.field2241.method739(8);
                int var57 = class118.field2241.method739(arg0 ^ 0x24);
                int var58 = class118.field2241.method759(42);
                for (int var59 = var56; var59 <= var57; var59++) {
                    long var60 = ((long) var55 << 32) + (long) var59;
                    class236.field4269.method810(new class171(var58), var60, -18274);
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 10) {
            class180.field3313 = true;
            class27.field431 = class118.field2241.method716(-1308);
            class122.field2274 = class118.field2241.method716(-1308);
            class77.field1336 = class118.field2241.method739(-128);
            class192.field3583 = class118.field2241.method716(-1308);
            class187.field3462 = class118.field2241.method716(-1308);
            if (class187.field3462 >= 100) {
                int var66 = class27.field431 * 128 + 64;
                int var67 = class122.field2274 * 128 + 64;
                int var68 = class195.method1239(var67, class139.field2615, false, var66) - class77.field1336;
                int var69 = var66 - class47.field814;
                int var70 = var67 - client.field545;
                int var71 = var68 - class140.field2629;
                int var72 = (int) Math.sqrt((double) (var69 * var69 + var70 * var70));
                class64.field1064 = (int) (Math.atan2((double) var71, (double) var72) * 325.949D) & 0x7FF;
                class234.field4215 = (int) (-325.949D * Math.atan2((double) var69, (double) var70)) & 0x7FF;
                if (class64.field1064 < 128) {
                    class64.field1064 = 128;
                }
                if (class64.field1064 > 383) {
                    class64.field1064 = 383;
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 243) {
            int var73 = class118.field2241.method730(1848);
            int var74 = class118.field2241.method753(false);
            class229.field4130 = var74;
            class230.field4153 = var73;
            class220.method1371(59);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 79) {
            int var75 = class118.field2241.method716(-1308);
            if (class118.field2241.method716(-1308) == 0) {
                class56.field956[var75] = new class128();
            } else {
                class118.field2241.field2133--;
                class56.field956[var75] = new class128(class118.field2241);
            }
            class102.field1920 = class13.field167;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 248) {
            int var76 = class118.field2241.method730(arg0 ^ 0xFFFFF89E);
            int var77 = class118.field2241.method732((byte) 41);
            if (var77 == 1) {
                class23.method154();
                for (int var78 = 0; var78 < 4; var78++) {
                    class182.field3351[var78].method1305(true);
                }
                System.gc();
            } else if (var77 == 2) {
                class125.method824((byte) 106);
                System.gc();
                class2.method6(25, (byte) 28);
            }
            class45.field784 = var76;
            class125.method819(arg0 + 90, var76);
            class178.method1150(-7251);
            class38.method271((byte) -17, class45.field784);
            for (int var79 = 0; var79 < 100; var79++) {
                class196.field3636[var79] = true;
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 172) {
            class148.method985(-128);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 253) {
            if (class39.field630 == 0) {
                class111.field2109 = class42.field709;
            } else {
                class111.field2109 = class118.field2241.method720((byte) 65);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 97) {
            class241.field4328 = class118.field2241.method716(-1308);
            class15.field221 = class118.field2241.method716(-1308);
            class161.field2923 = class118.field2241.method716(-1308);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 29) {
            long var80 = class118.field2241.method762((byte) -110);
            int var82 = class118.field2241.method739(81);
            class132 var83 = class116.method780(var82, (byte) 100).method142((byte) -87, class118.field2241);
            class42.method292(var82, var83, 19, 0, class164.method1057((byte) 11, var80).method900(0), null);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 43) {
            int var84 = class118.field2241.method716(-1308);
            int var85 = class118.field2241.method716(-1308);
            int var86 = class118.field2241.method716(-1308);
            int var87 = class118.field2241.method716(-1308);
            int var88 = class118.field2241.method739(-126);
            class91.field1615[var84] = true;
            class214.field3904[var84] = var85;
            class68.field1130[var84] = var86;
            class220.field4015[var84] = var87;
            class192.field3584[var84] = var88;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 136) {
            class165.method1086(true, (byte) 122);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 21) {
            int var89 = class118.field2241.method759(101);
            int var90 = class118.field2241.method739(-127);
            int var91 = class118.field2241.method763(65280);
            class73 var92 = (class73) class55.field927.method806(-1, (long) var89);
            if (var92 != null) {
                class24.method168(var92, false, var92.field1216 != var90);
            }
            class139.method938(arg0 ^ 0xFFFFFFA6, var90, var89, var91);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 178) {
            class72.field1202 = class118.field2241.method720((byte) 27);
            class133.method911(class72.field1202, (byte) -97);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 7) {
            int var93 = class118.field2241.method738(arg0 ^ 0xFFFFFFD9);
            int var94 = class118.field2241.method738(127);
            int var95 = class118.field2241.method757((byte) 57);
            class96 var96 = class158.method1029((byte) -126, var95);
            var96.field1834 = var96.field1709 = var93;
            var96.field1752 = var96.field1751 = var94;
            var96.field1746 = 0;
            var96.field1840 = 0;
            class183.method1174(var96, arg0 ^ 0xFFFFC0CD);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 211) {
            class102.field1918 = class13.field167;
            long var97 = class118.field2241.method762((byte) -108);
            if (var97 == 0L) {
                class136.field2558 = null;
                class117.field2234 = null;
                class133.field2502 = null;
                class116.field2225 = 0;
                class173.field3235 = -1;
                return true;
            }
            long var99 = class118.field2241.method762((byte) -124);
            class133.field2502 = class164.method1057((byte) 11, var99);
            class117.field2234 = class164.method1057((byte) 11, var97);
            class210.field3837 = class118.field2241.method734(true);
            int var101 = class118.field2241.method716(-1308);
            if (var101 == 255) {
                class173.field3235 = -1;
                return true;
            }
            class116.field2225 = var101;
            class200[] var102 = new class200[100];
            for (int var103 = 0; var103 < class116.field2225; var103++) {
                var102[var103] = new class200();
                var102[var103].field2760 = class118.field2241.method762((byte) -122);
                var102[var103].field3699 = class164.method1057((byte) 11, var102[var103].field2760);
                var102[var103].field3696 = class118.field2241.method739(92);
                var102[var103].field3694 = class118.field2241.method734(true);
                var102[var103].field3693 = class118.field2241.method720((byte) 62);
                if (class81.field1370 == var102[var103].field2760) {
                    class182.field3338 = var102[var103].field3694;
                }
            }
            boolean var104 = false;
            int var105 = class116.field2225;
            while (var105 > 0) {
                var105--;
                boolean var106 = true;
                for (int var107 = 0; var107 < var105; var107++) {
                    if (var102[var107].field3699.method871(var102[var107 + 1].field3699, -1) > 0) {
                        var106 = false;
                        class200 var108 = var102[var107];
                        var102[var107] = var102[var107 + 1];
                        var102[var107 + 1] = var108;
                    }
                }
                if (var106) {
                    break;
                }
            }
            class173.field3235 = -1;
            class136.field2558 = var102;
            return true;
        } else if (class173.field3235 == 196) {
            int var109 = class118.field2241.method753(false);
            if (var109 == 65535) {
                var109 = -1;
            }
            int var110 = class118.field2241.method748(-18687);
            class96 var111 = class158.method1029((byte) -123, var110);
            if (var111.field1734 != 2 || var111.field1780 != var109) {
                var111.field1734 = 2;
                var111.field1780 = var109;
                class183.method1174(var111, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 122) {
            int var112 = class118.field2241.method759(68);
            class73 var113 = (class73) class55.field927.method806(-1, (long) var112);
            if (var113 != null) {
                class24.method168(var113, false, true);
            }
            if (class169.field3115 != null) {
                class183.method1174(class169.field3115, arg0 ^ 0xFFFFC0CD);
                class169.field3115 = null;
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 170) {
            long var114 = class118.field2241.method762((byte) -111);
            boolean var116 = false;
            if ((Long.MIN_VALUE & var114) != 0L) {
                var116 = true;
            }
            int var117 = class118.field2241.method739(-127);
            byte var118 = class118.field2241.method734(true);
            if (var116) {
                if (class116.field2225 == 0) {
                    class173.field3235 = -1;
                    return true;
                }
                long var119 = var114 & Long.MAX_VALUE;
                boolean var121 = false;
                int var122;
                for (var122 = 0; class116.field2225 > var122 && (class136.field2558[var122].field2760 != var119 || class136.field2558[var122].field3696 != var117); var122++) {
                }
                if (class116.field2225 > var122) {
                    while (class116.field2225 - 1 > var122) {
                        class136.field2558[var122] = class136.field2558[var122 + 1];
                        var122++;
                    }
                    class116.field2225--;
                    class136.field2558[class116.field2225] = null;
                }
            } else {
                class132 var123 = class118.field2241.method720((byte) 53);
                class200 var124 = new class200();
                var124.field2760 = var114;
                var124.field3699 = class164.method1057((byte) 11, var124.field2760);
                var124.field3694 = var118;
                var124.field3696 = var117;
                var124.field3693 = var123;
                int var125;
                for (var125 = class116.field2225 - 1; var125 >= 0; var125--) {
                    int var126 = class136.field2558[var125].field3699.method871(var124.field3699, -1);
                    if (var126 == 0) {
                        class136.field2558[var125].field3696 = var117;
                        class136.field2558[var125].field3694 = var118;
                        class136.field2558[var125].field3693 = var123;
                        class102.field1918 = class13.field167;
                        class173.field3235 = -1;
                        if (class81.field1370 == var114) {
                            class182.field3338 = var118;
                        }
                        return true;
                    }
                    if (var126 < 0) {
                        break;
                    }
                }
                if (class136.field2558.length <= class116.field2225) {
                    class173.field3235 = -1;
                    return true;
                }
                for (int var127 = class116.field2225 - 1; var127 > var125; var127--) {
                    class136.field2558[var127 + 1] = class136.field2558[var127];
                }
                if (class116.field2225 == 0) {
                    class136.field2558 = new class200[100];
                }
                class136.field2558[var125 + 1] = var124;
                class116.field2225++;
                if (class81.field1370 == var114) {
                    class182.field3338 = var118;
                }
            }
            class102.field1918 = class13.field167;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 247) {
            class180.field3313 = false;
            for (int var128 = 0; var128 < 5; var128++) {
                class91.field1615[var128] = false;
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 134) {
            int var129 = class118.field2241.method763(65280);
            int var130 = class118.field2241.method716(-1308);
            int var131 = class118.field2241.method763(65280);
            class139.field2615 = var130 >> 1;
            class210.field3854.method290(var131, var129, (byte) -98, (var130 & 0x1) == 1);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 31) {
            class22.field313 = class118.field2241.method716(-1308);
            class73.field1214 = class118.field2241.method711(-1795);
            for (int var132 = class22.field313; var132 < class22.field313 + 8; var132++) {
                for (int var134 = class73.field1214; var134 < class73.field1214 + 8; var134++) {
                    if (class15.field216[class139.field2615][var132][var134] != null) {
                        class15.field216[class139.field2615][var132][var134] = null;
                        class158.method1025(var134, var132, true);
                    }
                }
            }
            for (class226 var133 = (class226) class84.field1462.method119(true); var133 != null; var133 = (class226) class84.field1462.method125((byte) -45)) {
                if (var133.field4102 >= class22.field313 && class22.field313 + 8 > var133.field4102 && class73.field1214 <= var133.field4094 && class73.field1214 + 8 > var133.field4094 && class139.field2615 == var133.field4088) {
                    var133.field4083 = 0;
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 182) {
            class73.field1214 = class118.field2241.method716(arg0 ^ 0x542);
            class22.field313 = class118.field2241.method711(arg0 - 1705);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 144) {
            int var135 = class118.field2241.method744((byte) 103);
            int var136 = class118.field2241.method728((byte) -102);
            int var137 = class118.field2241.method730(1848);
            int var138 = class118.field2241.method744((byte) 115);
            class96 var139 = class158.method1029((byte) -109, var136);
            if (var139.field1750 != var135 || var139.field1741 != var138 || var139.field1771 != var137) {
                var139.field1771 = var137;
                var139.field1741 = var138;
                var139.field1750 = var135;
                class183.method1174(var139, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 192) {
            class165.method1086(false, (byte) -53);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 59) {
            int var140 = class118.field2241.method759(arg0 + 139);
            int var141 = class118.field2241.method759(105);
            class73 var142 = (class73) class55.field927.method806(-1, (long) var140);
            class73 var143 = (class73) class55.field927.method806(-1, (long) var141);
            if (var143 != null) {
                class24.method168(var143, false, var142 == null || var142.field1216 != var143.field1216);
            }
            if (var142 != null) {
                var142.method995((byte) -118);
                class55.field927.method810(var142, (long) var141, -18274);
            }
            class96 var144 = class158.method1029((byte) -122, var140);
            if (var144 != null) {
                class183.method1174(var144, 16235);
            }
            class96 var145 = class158.method1029((byte) -127, var141);
            if (var145 != null) {
                class183.method1174(var145, arg0 ^ 0xFFFFC0CD);
            }
            if (class45.field784 != -1) {
                class231.method1469(class45.field784, 1, 2345);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 70) {
            long var146 = class118.field2241.method762((byte) -108);
            class118.field2241.method734(true);
            long var148 = class118.field2241.method762((byte) -123);
            long var150 = (long) class118.field2241.method739(-126);
            long var152 = (long) class118.field2241.method718(false);
            int var154 = class118.field2241.method716(-1308);
            int var155 = class118.field2241.method739(47);
            long var156 = (var150 << 32) + var152;
            boolean var158 = false;
            for (int var159 = 0; var159 < 100; var159++) {
                if (class56.field951[var159] == var156) {
                    var158 = true;
                    break;
                }
            }
            if (var154 <= 1) {
                for (int var160 = 0; var160 < class138.field2596; var160++) {
                    if (class178.field3282[var160] == var146) {
                        var158 = true;
                        break;
                    }
                }
            }
            if (!var158 && class27.field444 == 0) {
                class56.field951[class30.field458] = var156;
                class30.field458 = (class30.field458 + 1) % 100;
                class132 var161 = class116.method780(var155, (byte) 100).method142((byte) -87, class118.field2241);
                if (var154 == 2 || var154 == 3) {
                    class42.method292(var155, var161, 20, 0, class187.method1197(new class132[] { class180.field3317, class164.method1057((byte) 11, var146).method900(0) }, -114), class164.method1057((byte) 11, var148).method900(0));
                } else if (var154 == 1) {
                    class42.method292(var155, var161, 20, 0, class187.method1197(new class132[] { class158.field2868, class164.method1057((byte) 11, var146).method900(0) }, -97), class164.method1057((byte) 11, var148).method900(0));
                } else {
                    class42.method292(var155, var161, 20, 0, class164.method1057((byte) 11, var146).method900(0), class164.method1057((byte) 11, var148).method900(0));
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 177) {
            byte[] var162 = new byte[class39.field630];
            class118.field2241.method648(0, class39.field630, 7853, var162);
            class184.method1177(1, class161.method1039(0, 0, class39.field630, var162));
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 154) {
            long var163 = class118.field2241.method762((byte) -116);
            class118.field2241.method734(true);
            long var165 = class118.field2241.method762((byte) -111);
            long var167 = (long) class118.field2241.method739(-123);
            boolean var169 = false;
            long var170 = (long) class118.field2241.method718(false);
            long var172 = (var167 << 32) + var170;
            int var174 = class118.field2241.method716(-1308);
            for (int var175 = 0; var175 < 100; var175++) {
                if (class56.field951[var175] == var172) {
                    var169 = true;
                    break;
                }
            }
            if (var174 <= 1) {
                for (int var176 = 0; var176 < class138.field2596; var176++) {
                    if (class178.field3282[var176] == var163) {
                        var169 = true;
                        break;
                    }
                }
            }
            if (!var169 && class27.field444 == 0) {
                class56.field951[class30.field458] = var172;
                class30.field458 = (class30.field458 + 1) % 100;
                class132 var177 = class107.method682(class234.method1480(true, class118.field2241).method891((byte) 32));
                if (var174 == 2 || var174 == 3) {
                    class91.method565(-1, class187.method1197(new class132[] { class180.field3317, class164.method1057((byte) 11, var163).method900(arg0 ^ -90) }, -74), class164.method1057((byte) 11, var165).method900(arg0 ^ 0xFFFFFFA6), 9, var177);
                } else if (var174 == 1) {
                    class91.method565(arg0 + 89, class187.method1197(new class132[] { class158.field2868, class164.method1057((byte) 11, var163).method900(0) }, -94), class164.method1057((byte) 11, var165).method900(0), 9, var177);
                } else {
                    class91.method565(-1, class164.method1057((byte) 11, var163).method900(0), class164.method1057((byte) 11, var165).method900(0), 9, var177);
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 173) {
            class132 var178 = class118.field2241.method720((byte) 27);
            Object[] var179 = new Object[var178.method902((byte) -4) + 1];
            for (int var180 = var178.method902((byte) -4) - 1; var180 >= 0; var180--) {
                if (var178.method881(var180, 70) == 115) {
                    var179[var180 + 1] = class118.field2241.method720((byte) 105);
                } else {
                    var179[var180 + 1] = Integer.valueOf(class118.field2241.method759(111));
                }
            }
            var179[0] = Integer.valueOf(class118.field2241.method759(67));
            class123 var181 = new class123();
            var181.field2310 = var179;
            class155.method1010(var181, arg0 ^ 0xFFFCF2E6);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 27) {
            class57.method382(arg0 ^ 0xFFFFFFD3);
            class217.field3983 = class118.field2241.method750(65280);
            class49.field835 = class13.field167;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 22) {
            int var182 = class118.field2241.method739(18);
            byte var183 = class118.field2241.method734(true);
            class192.field3582[var182] = var183;
            if (class77.field1315[var182] != var183) {
                class77.field1315[var182] = var183;
                class16.method85(var182, (byte) 37);
            }
            class112.field2134[class75.method450(31, class52.field884++)] = var182;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 105) {
            int var184 = class118.field2241.method759(46);
            int var185 = class118.field2241.method739(-127);
            if (var184 < -70000) {
                var185 += 32768;
            }
            class96 var186;
            if (var184 >= 0) {
                var186 = class158.method1029((byte) -106, var184);
            } else {
                var186 = null;
            }
            while (class118.field2241.field2133 < class39.field630) {
                int var187 = class118.field2241.method754(arg0 + 4785);
                int var188 = class118.field2241.method739(-123);
                int var189 = 0;
                if (var188 != 0) {
                    var189 = class118.field2241.method716(-1308);
                    if (var189 == 255) {
                        var189 = class118.field2241.method759(90);
                    }
                }
                if (var186 != null && var187 >= 0 && var187 < var186.field1753.length) {
                    var186.field1753[var187] = var188;
                    var186.field1722[var187] = var189;
                }
                class115.method770(var189, var188 - 1, var187, arg0 + 90, var185);
            }
            if (var186 != null) {
                class183.method1174(var186, arg0 ^ 0xFFFFC0CD);
            }
            class57.method382(arg0 ^ 0xFFFFFFD2);
            class42.field706[class75.method450(31, class91.field1614++)] = class75.method450(32767, var185);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 39) {
            for (int var190 = 0; var190 < class68.field1120.length; var190++) {
                if (class68.field1120[var190] != null) {
                    class68.field1120[var190].field695 = -1;
                }
            }
            for (int var191 = 0; var191 < class11.field145.length; var191++) {
                if (class11.field145[var191] != null) {
                    class11.field145[var191].field695 = -1;
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 163) {
            int var192 = class118.field2241.method759(36);
            int var193 = class118.field2241.method739(27);
            if (var192 < -70000) {
                var193 += 32768;
            }
            class96 var194;
            if (var192 >= 0) {
                var194 = class158.method1029((byte) -119, var192);
            } else {
                var194 = null;
            }
            if (var194 != null) {
                for (int var195 = 0; var195 < var194.field1753.length; var195++) {
                    var194.field1753[var195] = 0;
                    var194.field1722[var195] = 0;
                }
            }
            class113.method767((byte) 116, var193);
            int var196 = class118.field2241.method739(-125);
            for (int var197 = 0; var197 < var196; var197++) {
                int var198 = class118.field2241.method763(arg0 + 65370);
                if (var198 == 255) {
                    var198 = class118.field2241.method748(-18687);
                }
                int var199 = class118.field2241.method753(false);
                if (var194 != null && var197 < var194.field1753.length) {
                    var194.field1753[var197] = var199;
                    var194.field1722[var197] = var198;
                }
                class115.method770(var198, var199 - 1, var197, 0, var193);
            }
            if (var194 != null) {
                class183.method1174(var194, 16235);
            }
            class57.method382(119);
            class42.field706[class75.method450(class91.field1614++, 31)] = class75.method450(32767, var193);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 68) {
            int var200 = class118.field2241.method739(-124);
            int var201 = class118.field2241.method759(arg0 ^ 0xFFFFFFCE);
            int var202 = class118.field2241.method739(arg0 ^ 0x24);
            class96 var203 = class158.method1029((byte) -114, var201);
            class173.field3235 = -1;
            var203.field1754 = (var200 << 16) + var202;
            return true;
        } else if (class173.field3235 == 100) {
            long var204 = class118.field2241.method762((byte) -115);
            long var206 = (long) class118.field2241.method739(arg0 + 155);
            long var208 = (long) class118.field2241.method718(false);
            int var210 = class118.field2241.method716(-1308);
            long var211 = (var206 << 32) + var208;
            boolean var213 = false;
            for (int var214 = 0; var214 < 100; var214++) {
                if (class56.field951[var214] == var211) {
                    var213 = true;
                    break;
                }
            }
            if (var210 <= 1) {
                for (int var215 = 0; var215 < class138.field2596; var215++) {
                    if (class178.field3282[var215] == var204) {
                        var213 = true;
                        break;
                    }
                }
            }
            if (!var213 && class27.field444 == 0) {
                class56.field951[class30.field458] = var211;
                class30.field458 = (class30.field458 + 1) % 100;
                class132 var216 = class107.method682(class234.method1480(true, class118.field2241).method891((byte) 32));
                if (var210 == 2 || var210 == 3) {
                    class169.method1108(-69, var216, 7, class187.method1197(new class132[] { class180.field3317, class164.method1057((byte) 11, var204).method900(0) }, -128));
                } else if (var210 == 1) {
                    class169.method1108(-33, var216, 7, class187.method1197(new class132[] { class158.field2868, class164.method1057((byte) 11, var204).method900(arg0 + 90) }, -111));
                } else {
                    class169.method1108(-36, var216, 3, class164.method1057((byte) 11, var204).method900(0));
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 119) {
            class57.method382(124);
            class57.field959 = class118.field2241.method716(-1308);
            class49.field835 = class13.field167;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 6) {
            class8.field72 = class118.field2241.method716(arg0 ^ 0x542);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 226) {
            class173.field3235 = -1;
            class13.field174 = 0;
            return true;
        } else if (class173.field3235 == 74) {
            for (int var217 = 0; var217 < class122.field2294; var217++) {
                class163 var218 = class138.method936(arg0 ^ 0xFFFFFFB6, var217);
                if (var218 != null && var218.field2944 == 0) {
                    class192.field3582[var217] = 0;
                    class77.field1315[var217] = 0;
                }
            }
            class57.method382(arg0 ^ 0xFFFFFFD8);
            class52.field884 += 32;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 34) {
            class229.method1461(-24962);
            class173.field3235 = -1;
            return false;
        } else if (class173.field3235 == 110) {
            int var219 = class118.field2241.method757((byte) 57);
            class96 var220 = class158.method1029((byte) -97, var219);
            var220.field1734 = 3;
            var220.field1780 = class210.field3854.field2880.method355(-19243);
            class183.method1174(var220, 16235);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 162) {
            long var221 = class118.field2241.method762((byte) -113);
            int var223 = class118.field2241.method739(arg0 - 33);
            int var224 = class118.field2241.method716(-1308);
            class132 var225 = class75.field1247;
            if (var223 > 0) {
                var225 = class118.field2241.method720((byte) 117);
            }
            class132 var226 = class164.method1057((byte) 11, var221).method900(arg0 + 90);
            for (int var227 = 0; var227 < client.field537; var227++) {
                if (class137.field2575[var227] == var221) {
                    if (class39.field637[var227] != var223) {
                        class39.field637[var227] = var223;
                        if (var223 > 0) {
                            class169.method1108(-22, class187.method1197(new class132[] { var226, class14.field191 }, -88), 5, class75.field1247);
                        }
                        if (var223 == 0) {
                            class169.method1108(-83, class187.method1197(new class132[] { var226, class171.field3186 }, -96), 5, class75.field1247);
                        }
                    }
                    var226 = null;
                    class88.field1542[var227] = var225;
                    class60.field1019[var227] = var224;
                    break;
                }
            }
            if (var226 != null && client.field537 < 200) {
                class137.field2575[client.field537] = var221;
                class68.field1136[client.field537] = var226;
                class39.field637[client.field537] = var223;
                class88.field1542[client.field537] = var225;
                class60.field1019[client.field537] = var224;
                client.field537++;
            }
            class113.field2183 = class13.field167;
            boolean var228 = false;
            int var229 = client.field537;
            while (var229 > 0) {
                boolean var230 = true;
                var229--;
                for (int var231 = 0; var231 < var229; var231++) {
                    if (class39.field637[var231] != class82.field1377 && class39.field637[var231 + 1] == class82.field1377 || class39.field637[var231] == 0 && class39.field637[var231 + 1] != 0) {
                        var230 = false;
                        int var232 = class39.field637[var231];
                        class39.field637[var231] = class39.field637[var231 + 1];
                        class39.field637[var231 + 1] = var232;
                        class132 var233 = class88.field1542[var231];
                        class88.field1542[var231] = class88.field1542[var231 + 1];
                        class88.field1542[var231 + 1] = var233;
                        class132 var234 = class68.field1136[var231];
                        class68.field1136[var231] = class68.field1136[var231 + 1];
                        class68.field1136[var231 + 1] = var234;
                        long var235 = class137.field2575[var231];
                        class137.field2575[var231] = class137.field2575[var231 + 1];
                        class137.field2575[var231 + 1] = var235;
                        int var237 = class60.field1019[var231];
                        class60.field1019[var231] = class60.field1019[var231 + 1];
                        class60.field1019[var231 + 1] = var237;
                    }
                }
                if (var230) {
                    break;
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 132) {
            class86.method540(arg0 + 91, class189.field3482, class39.field630, class118.field2241);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 53) {
            int var238 = class118.field2241.method759(arg0 + 142);
            class96 var239 = class158.method1029((byte) -110, var238);
            for (int var240 = 0; var240 < var239.field1753.length; var240++) {
                var239.field1753[var240] = -1;
                var239.field1753[var240] = 0;
            }
            class183.method1174(var239, 16235);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 45) {
            class137.field2571 = class118.field2241.method730(1848) * 30;
            class49.field835 = class13.field167;
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 146) {
            class132 var241 = class118.field2241.method720((byte) 96);
            if (var241.method905(class112.field2181, true)) {
                class132 var242 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                long var243 = var242.method867(-27410);
                boolean var245 = false;
                for (int var246 = 0; var246 < class138.field2596; var246++) {
                    if (class178.field3282[var246] == var243) {
                        var245 = true;
                        break;
                    }
                }
                if (!var245 && class27.field444 == 0) {
                    class169.method1108(-22, class150.field2742, 4, var242);
                }
            } else if (var241.method905(class220.field4016, true)) {
                class132 var270 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                boolean var271 = false;
                long var272 = var270.method867(-27410);
                for (int var274 = 0; var274 < class138.field2596; var274++) {
                    if (class178.field3282[var274] == var272) {
                        var271 = true;
                        break;
                    }
                }
                if (!var271 && class27.field444 == 0) {
                    class132 var275 = var241.method886(-1, var241.method893((byte) 45, class196.field3635) + 1, var241.method902((byte) -4) + -9);
                    class169.method1108(-75, var275, 8, var270);
                }
            } else if (var241.method905(class63.field1053, true)) {
                class132 var247 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                long var248 = var247.method867(-27410);
                boolean var250 = false;
                for (int var251 = 0; var251 < class138.field2596; var251++) {
                    if (class178.field3282[var251] == var248) {
                        var250 = true;
                        break;
                    }
                }
                if (!var250 && class27.field444 == 0) {
                    class169.method1108(arg0 - 37, class75.field1247, 10, var247);
                }
            } else if (var241.method905(class81.field1372, true)) {
                class132 var252 = var241.method886(-1, 0, var241.method893((byte) 45, class81.field1372));
                class169.method1108(arg0 + 48, var252, 11, class75.field1247);
            } else if (var241.method905(class203.field3738, true)) {
                class132 var269 = var241.method886(-1, 0, var241.method893((byte) 45, class203.field3738));
                if (class27.field444 == 0) {
                    class169.method1108(-81, var269, 12, class75.field1247);
                }
            } else if (var241.method905(class236.field4281, true)) {
                class132 var253 = var241.method886(arg0 + 89, 0, var241.method893((byte) 45, class236.field4281));
                if (class27.field444 == 0) {
                    class169.method1108(arg0 + 64, var253, 13, class75.field1247);
                }
            } else if (var241.method905(class103.field1924, true)) {
                boolean var264 = false;
                class132 var265 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                long var266 = var265.method867(arg0 ^ 0x6B48);
                for (int var268 = 0; var268 < class138.field2596; var268++) {
                    if (class178.field3282[var268] == var266) {
                        var264 = true;
                        break;
                    }
                }
                if (!var264 && class27.field444 == 0) {
                    class169.method1108(-106, class75.field1247, 14, var265);
                }
            } else if (var241.method905(class55.field926, true)) {
                class132 var254 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                long var255 = var254.method867(arg0 ^ 0x6B48);
                boolean var257 = false;
                for (int var258 = 0; var258 < class138.field2596; var258++) {
                    if (class178.field3282[var258] == var255) {
                        var257 = true;
                        break;
                    }
                }
                if (!var257 && class27.field444 == 0) {
                    class169.method1108(-22, class75.field1247, 15, var254);
                }
            } else if (var241.method905(class152.field2783, true)) {
                class132 var259 = var241.method886(-1, 0, var241.method893((byte) 45, class196.field3635));
                long var260 = var259.method867(-27410);
                boolean var262 = false;
                for (int var263 = 0; var263 < class138.field2596; var263++) {
                    if (class178.field3282[var263] == var260) {
                        var262 = true;
                        break;
                    }
                }
                if (!var262 && class27.field444 == 0) {
                    class169.method1108(-91, class75.field1247, 16, var259);
                }
            } else {
                class169.method1108(-53, var241, 0, class75.field1247);
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 230) {
            long var276 = class118.field2241.method762((byte) -106);
            long var278 = (long) class118.field2241.method739(26);
            long var280 = (long) class118.field2241.method718(false);
            int var282 = class118.field2241.method716(arg0 - 1218);
            int var283 = class118.field2241.method739(arg0 - 33);
            long var284 = (var278 << 32) + var280;
            boolean var286 = false;
            for (int var287 = 0; var287 < 100; var287++) {
                if (class56.field951[var287] == var284) {
                    var286 = true;
                    break;
                }
            }
            if (var282 <= 1) {
                for (int var288 = 0; var288 < class138.field2596; var288++) {
                    if (class178.field3282[var288] == var276) {
                        var286 = true;
                        break;
                    }
                }
            }
            if (!var286 && class27.field444 == 0) {
                class56.field951[class30.field458] = var284;
                class30.field458 = (class30.field458 + 1) % 100;
                class132 var289 = class116.method780(var283, (byte) 100).method142((byte) -87, class118.field2241);
                if (var282 == 2) {
                    class42.method292(var283, var289, 18, 0, class187.method1197(new class132[] { class180.field3317, class164.method1057((byte) 11, var276).method900(arg0 ^ 0xFFFFFFA6) }, -82), null);
                } else if (var282 == 1) {
                    class42.method292(var283, var289, 18, 0, class187.method1197(new class132[] { class158.field2868, class164.method1057((byte) 11, var276).method900(arg0 + 90) }, arg0 - 32), null);
                } else {
                    class42.method292(var283, var289, 18, 0, class164.method1057((byte) 11, var276).method900(arg0 + 90), null);
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 133 || class173.field3235 == 188 || class173.field3235 == 179 || class173.field3235 == 148 || class173.field3235 == 225 || class173.field3235 == 73 || class173.field3235 == 155 || class173.field3235 == 15 || class173.field3235 == 166 || class173.field3235 == 195 || class173.field3235 == 62) {
            class30.method216(29849);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 2) {
            class97.method615(arg0 + 114, class118.field2241);
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 164) {
            for (int var290 = 0; var290 < class77.field1315.length; var290++) {
                if (class77.field1315[var290] != class192.field3582[var290]) {
                    class77.field1315[var290] = class192.field3582[var290];
                    class16.method85(var290, (byte) 37);
                    class112.field2134[class75.method450(class52.field884++, 31)] = var290;
                }
            }
            class173.field3235 = -1;
            return true;
        } else if (class173.field3235 == 229) {
            int var291 = class118.field2241.method753(false);
            if (var291 == 65535) {
                var291 = -1;
            }
            int var292 = class118.field2241.method759(73);
            class96 var293 = class158.method1029((byte) -117, var292);
            if (var293.field1734 != 1 || var293.field1780 != var291) {
                var293.field1780 = var291;
                var293.field1734 = 1;
                class183.method1174(var293, 16235);
            }
            class173.field3235 = -1;
            return true;
        } else {
            if (arg0 != -90) {
                field90 = null;
            }
            if (class173.field3235 == 183) {
                class138.field2596 = class39.field630 / 8;
                for (int var294 = 0; var294 < class138.field2596; var294++) {
                    class178.field3282[var294] = class118.field2241.method762((byte) -110);
                    class94.field1651[var294] = class164.method1057((byte) 11, class178.field3282[var294]);
                }
                class113.field2183 = class13.field167;
                class173.field3235 = -1;
                return true;
            } else if (class173.field3235 == 109) {
                class57.method382(125);
                int var295 = class118.field2241.method716(-1308);
                int var296 = class118.field2241.method759(36);
                int var297 = class118.field2241.method763(arg0 + 65370);
                class196.field3637[var297] = var296;
                class60.field1020[var297] = var295;
                class208.field3794[var297] = 1;
                for (int var298 = 0; var298 < 98; var298++) {
                    if (var296 >= class155.field2825[var298]) {
                        class208.field3794[var297] = var298 + 2;
                    }
                }
                class194.field3606[class75.method450(31, class95.field1681++)] = var297;
                class173.field3235 = -1;
                return true;
            } else if (class173.field3235 == 25) {
                int var299 = class118.field2241.method719(0);
                int var300 = class118.field2241.method759(79);
                class96 var301 = class158.method1029((byte) -128, var300);
                if (var301.field1710 != var299 || var299 == -1) {
                    var301.field1813 = 0;
                    var301.field1710 = var299;
                    var301.field1758 = 0;
                    class183.method1174(var301, 16235);
                }
                class173.field3235 = -1;
                return true;
            } else if (class173.field3235 == 209) {
                int var302 = class118.field2241.method757((byte) 57);
                class75.field1244 = class189.field3482.method506(var302, (byte) -128);
                class173.field3235 = -1;
                return true;
            } else if (class173.field3235 == 96) {
                class180.field3313 = true;
                class162.field2938 = class118.field2241.method716(arg0 ^ 0x542);
                class227.field4108 = class118.field2241.method716(-1308);
                class104.field1952 = class118.field2241.method739(-123);
                class108.field2046 = class118.field2241.method716(arg0 ^ 0x542);
                class11.field134 = class118.field2241.method716(-1308);
                if (class11.field134 >= 100) {
                    class47.field814 = class162.field2938 * 128 + 64;
                    client.field545 = class227.field4108 * 128 + 64;
                    class140.field2629 = class195.method1239(client.field545, class139.field2615, false, class47.field814) - class104.field1952;
                }
                class173.field3235 = -1;
                return true;
            } else if (class173.field3235 == 78) {
                if (class45.field784 != -1) {
                    class231.method1469(class45.field784, 0, 2345);
                }
                class173.field3235 = -1;
                return true;
            } else {
                class92.method571("T1 - " + class173.field3235 + "," + class86.field1502 + "," + class55.field941 + " - " + class39.field630, null, 72);
                class229.method1461(-24962);
                return true;
            }
        }
    }
}
