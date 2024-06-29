import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field111 = 1;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lrd;")
    public static class117 field112 = class95.method812("m-Ochte sich mit Ihnen duellieren)3", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lrd;")
    public static class117 field124 = class95.method812("leuchten3:", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field119 = 0;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "Lrd;")
    public static class117 field120 = class95.method812("redstone3", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field123 = 0;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Lrd;")
    public static class117 field129 = class95.method812("Passwort: ", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lrd;")
    public static class117 field116 = class95.method812("", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Lrd;")
    public static class117 field127 = class95.method812("scrollen:", (byte) 8);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "Leb;")
    public static class31 field131;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lga;")
    public static class44 field115;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Laf;")
    public static class7 field114;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Laf;")
    public static class7 field122;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    public static void method35(boolean arg0) {
        field120 = null;
        field129 = null;
        field115 = null;
        field122 = null;
        field124 = null;
        field112 = null;
        field116 = null;
        field127 = null;
        if (!arg0) {
            field131 = null;
            field114 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method36(byte arg0) {
        class141.field3352 = null;
        class24.field673 = null;
        class66.field1868 = null;
        class68.field1902 = null;
        field125++;
        class43.field1219 = null;
        class68.field1920 = null;
        if (arg0 < 28) {
            method41(3, null, null, -3);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZII)I")
    public static final int method37(int arg0, boolean arg1, int arg2, int arg3) {
        field132++;
        if (arg1) {
            method42((byte) -53);
        }
        int var4 = arg2 - 1 & arg0;
        int var5 = arg0 / arg2;
        int var6 = arg3 / arg2;
        int var7 = class110.method909(var5, var6, (byte) -110);
        int var8 = class110.method909(var5 + 1, var6, (byte) -114);
        int var9 = arg3 & arg2 - 1;
        int var10 = class110.method909(var5, var6 + 1, (byte) -117);
        int var11 = class110.method909(var5 + 1, var6 + 1, (byte) -120);
        int var12 = class14.method119(-119, var8, var4, var7, arg2);
        int var13 = class14.method119(-120, var11, var4, var10, arg2);
        return class14.method119(-121, var13, var9, var12, arg2);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method38(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if (arg5 != -41) {
            return 41;
        }
        if ((arg3 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg6;
            arg6 = var8;
        }
        field128++;
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return 7 + 1 - arg2 - arg1;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg4;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V")
    public static final void method39(byte arg0) {
        class67.field1899 = new byte[4][104][104];
        class49.field1412 = new byte[4][104][104];
        class105.field2617 = new int[4][105][105];
        class35.field1044 = new byte[4][105][105];
        class36.field1056 = new int[104];
        class73.field2049 = new byte[4][104][104];
        class21.field606 = new int[104];
        class61.field1704 = new int[104];
        class94.field2350 = new byte[4][104][104];
        field126++;
        class35.field1032 = 99;
        int var1 = -120 / ((-arg0 - 42) / 43);
        class127.field3044 = new int[104];
        class109.field2736 = new int[104];
        class60.field1686 = new int[105][105];
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public static final void method40(byte arg0) {
        class47.field1329 = 0;
        class79.field2123 = 0;
        class99.method842((byte) -86);
        class47.method518(126);
        field130++;
        class133.method1092((byte) 58);
        class49.method545((byte) -111);
        for (int var1 = 0; var1 < class79.field2123; var1++) {
            int var3 = class105.field2616[var1];
            if (class85.field2236 != class93.field2340[var3].field722) {
                class93.field2340[var3] = null;
            }
        }
        if (class17.field395 != class104.field2588.field314) {
            throw new RuntimeException("gpp1 pos:" + class104.field2588.field314 + " psize:" + class17.field395);
        }
        if (arg0 > -95) {
            method35(false);
        }
        for (int var2 = 0; var2 < class96.field2419; var2++) {
            if (class93.field2340[class137.field3292[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class96.field2419);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILrd;Ljava/awt/Color;I)V")
    public static final void method41(int arg0, class117 arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class42.field1216.getGraphics();
            if (class52.field1461 == null) {
                class52.field1461 = new Font("Helvetica", 1, 13);
                class67.field1880 = class42.field1216.getFontMetrics(class52.field1461);
            }
            if (class109.field2727) {
                class109.field2727 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class94.field2365, class142.field3391);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class26.field782 == null) {
                    class26.field782 = class42.field1216.createImage(304, 34);
                }
                Graphics var5 = class26.field782.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class52.field1461);
                var5.setColor(Color.white);
                arg1.method952(true, var5, 22, (304 - arg1.method938(class67.field1880, 0)) / 2);
                var4.drawImage(class26.field782, class94.field2365 / 2 - 152, class142.field3391 / 2 + -18, null);
                if (arg3 > -15) {
                    method37(55, false, -76, -67);
                }
            } catch (Exception var8) {
                int var6 = class142.field3391 / 2 - 18;
                int var7 = class94.field2365 / 2 - 152;
                var4.setColor(arg2);
                var4.drawRect(var7, var6, 303, 33);
                var4.fillRect(var7 + 2, var6 - -2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var6 - -1, 301, 31);
                var4.fillRect(var7 + arg0 * 3 + 2, var6 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class52.field1461);
                var4.setColor(Color.white);
                arg1.method952(true, var4, var6 + 22, var7 - -((-arg1.method938(class67.field1880, 0) + 304) / 2));
            }
        } catch (Exception var9) {
            class42.field1216.repaint();
        }
        field117++;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static final void method42(byte arg0) {
        if (client.field624 == 1) {
            if (class66.field1873 >= 539 && class66.field1873 <= 573 && class68.field1909 >= 169 && class68.field1909 < 205 && class134.field3210[0] != -1) {
                class13.field262 = true;
                class15.field339 = true;
                class101.field2518 = 0;
            }
            if (class66.field1873 >= 569 && class66.field1873 <= 599 && class68.field1909 >= 168 && class68.field1909 < 205 && class134.field3210[1] != -1) {
                class101.field2518 = 1;
                class15.field339 = true;
                class13.field262 = true;
            }
            if (class66.field1873 >= 597 && class66.field1873 <= 627 && class68.field1909 >= 168 && class68.field1909 < 205 && class134.field3210[2] != -1) {
                class101.field2518 = 2;
                class15.field339 = true;
                class13.field262 = true;
            }
            if (class66.field1873 >= 625 && class66.field1873 <= 669 && class68.field1909 >= 168 && class68.field1909 < 203 && class134.field3210[3] != -1) {
                class13.field262 = true;
                class101.field2518 = 3;
                class15.field339 = true;
            }
            if (class66.field1873 >= 666 && class66.field1873 <= 696 && class68.field1909 >= 168 && class68.field1909 < 205 && class134.field3210[4] != -1) {
                class101.field2518 = 4;
                class13.field262 = true;
                class15.field339 = true;
            }
            if (class66.field1873 >= 694 && class66.field1873 <= 724 && class68.field1909 >= 168 && class68.field1909 < 205 && class134.field3210[5] != -1) {
                class101.field2518 = 5;
                class15.field339 = true;
                class13.field262 = true;
            }
            if (class66.field1873 >= 722 && class66.field1873 <= 756 && class68.field1909 >= 169 && class68.field1909 < 205 && class134.field3210[6] != -1) {
                class101.field2518 = 6;
                class15.field339 = true;
                class13.field262 = true;
            }
            if (class66.field1873 >= 540 && class66.field1873 <= 574 && class68.field1909 >= 466 && class68.field1909 < 502 && class134.field3210[7] != -1) {
                class13.field262 = true;
                class101.field2518 = 7;
                class15.field339 = true;
            }
            if (class66.field1873 >= 572 && class66.field1873 <= 602 && class68.field1909 >= 466 && class68.field1909 < 503 && class134.field3210[8] != -1) {
                class13.field262 = true;
                class15.field339 = true;
                class101.field2518 = 8;
            }
            if (class66.field1873 >= 599 && class66.field1873 <= 629 && class68.field1909 >= 466 && class68.field1909 < 503 && class134.field3210[9] != -1) {
                class15.field339 = true;
                class13.field262 = true;
                class101.field2518 = 9;
            }
            if (class66.field1873 >= 627 && class66.field1873 <= 671 && class68.field1909 >= 467 && class68.field1909 < 502 && class134.field3210[10] != -1) {
                class15.field339 = true;
                class13.field262 = true;
                class101.field2518 = 10;
            }
            if (class66.field1873 >= 669 && class66.field1873 <= 699 && class68.field1909 >= 466 && class68.field1909 < 503 && class134.field3210[11] != -1) {
                class15.field339 = true;
                class13.field262 = true;
                class101.field2518 = 11;
            }
            if (class66.field1873 >= 696 && class66.field1873 <= 726 && class68.field1909 >= 466 && class68.field1909 < 503 && class134.field3210[12] != -1) {
                class15.field339 = true;
                class101.field2518 = 12;
                class13.field262 = true;
            }
            if (class66.field1873 >= 724 && class66.field1873 <= 758 && class68.field1909 >= 466 && class68.field1909 < 502 && class134.field3210[13] != -1) {
                class15.field339 = true;
                class101.field2518 = 13;
                class13.field262 = true;
            }
        }
        field121++;
        if (arg0 != 98) {
            field115 = null;
        }
    }
}
