import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class30 extends Canvas {

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field671;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lvc;")
    public static class137 field660 = class45.method325("Lade Schrifts-=tze )2 ", -46);

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "[Lfc;")
    public static class39[] field664 = new class39[256];

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "Lvc;")
    private static class137 field661 = class45.method325("Connection lost", -46);

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lvc;")
    public static class137 field662 = class45.method325("Untersuchen", -46);

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "Lvc;")
    private static class137 field670 = class45.method325("glow1:", -46);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lvc;")
    private static class137 field655 = class45.method325("scroll:", -46);

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "Lvc;")
    public static class137 field666 = field655;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Lvc;")
    public static class137 field667 = field670;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lvc;")
    public static class137 field669 = class45.method325("gelb:", -46);

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "Lvc;")
    public static class137 field674 = field661;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "Loa;")
    public static class93 field668;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lia;")
    public static class57[] field663;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILme;)V")
    public static final void method228(int arg0, class85 arg1) {
        field658++;
        int var2 = arg1.field1914;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class46.field1035 == 0) {
                if (var2 == 1) {
                    arg1.field1963 = class48.field1078;
                    arg1.field1925 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg1.field1925 = 0;
                    arg1.field1963 = class75.field1684;
                    return;
                }
            }
            if (class46.field1035 == 1) {
                if (var2 == 1) {
                    arg1.field1925 = 0;
                    arg1.field1963 = class59.field1255;
                    return;
                }
                if (var2 == 2) {
                    arg1.field1925 = 0;
                    arg1.field1963 = class75.field1697;
                    return;
                }
                if (var2 == 3) {
                    arg1.field1925 = 0;
                    arg1.field1963 = class4.field81;
                    return;
                }
            }
            int var3 = class80.field1832;
            if (class46.field1035 != 2) {
                var3 = 0;
            }
            if (var2 <= 700) {
                var2--;
            } else {
                var2 -= 601;
            }
            if (var3 <= var2) {
                arg1.field1925 = 0;
                arg1.field1963 = class45.field999;
            } else {
                arg1.field1963 = class98.field2270[var2];
                arg1.field1925 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class80.field1832;
            if (class46.field1035 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg1.field1925 = 0;
                arg1.field1963 = class45.field999;
            } else {
                if (class83.field1872[var2] == 0) {
                    arg1.field1963 = class88.method666(114, new class137[] { class29.field645, class93.field2204 });
                } else if (class83.field1872[var2] >= 5000) {
                    if (class83.field1872[var2] == class82.field1853) {
                        arg1.field1963 = class88.method666(arg0 ^ 0xFFFFA320, new class137[] { class34.field731, class112.field2663, class61.method435(class83.field1872[var2] - 5000, 106) });
                    } else {
                        arg1.field1963 = class88.method666(114, new class137[] { class123.field2844, class112.field2663, class61.method435(class83.field1872[var2] - 5000, 101) });
                    }
                } else if (class83.field1872[var2] == class82.field1853) {
                    arg1.field1963 = class88.method666(127, new class137[] { class34.field731, class92.field2188, class61.method435(class83.field1872[var2], 93) });
                } else {
                    arg1.field1963 = class88.method666(arg0 - 23670, new class137[] { class123.field2844, class92.field2188, class61.method435(class83.field1872[var2], 89) });
                }
                arg1.field1925 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class80.field1832;
            if (class46.field1035 != 2) {
                var5 = 0;
            }
            arg1.field1993 = var5 * 15 + 20;
            if (arg1.field1975 >= arg1.field1993) {
                arg1.field1993 = arg1.field1975 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class46.field1035 == 0) {
                arg1.field1963 = class60.field1291;
                arg1.field1925 = 0;
            } else if (var2 == 1 && class46.field1035 == 0) {
                arg1.field1925 = 0;
                arg1.field1963 = class75.field1684;
            } else {
                int var6 = class39.field868;
                if (class46.field1035 == 0) {
                    var6 = 0;
                }
                if (var2 >= var6) {
                    arg1.field1925 = 0;
                    arg1.field1963 = class45.field999;
                } else {
                    arg1.field1963 = class105.method757(126, class93.field2212[var2]).method1016((byte) 117);
                    arg1.field1925 = 1;
                }
            }
        } else if (var2 == 503) {
            arg1.field1993 = class39.field868 * 15 + 20;
            if (arg1.field1993 <= arg1.field1975) {
                arg1.field1993 = arg1.field1975 + 1;
            }
        } else if (var2 == 324) {
            if (class116.field2765 == -1) {
                class131.field3043 = arg1.field1997;
                class116.field2765 = arg1.field2001;
            }
            if (class36.field784.field1220) {
                arg1.field2001 = class116.field2765;
            } else {
                arg1.field2001 = class131.field3043;
            }
        } else if (var2 == 325) {
            if (class116.field2765 == -1) {
                class116.field2765 = arg1.field2001;
                class131.field3043 = arg1.field1997;
            }
            if (class36.field784.field1220) {
                arg1.field2001 = class131.field3043;
            } else {
                arg1.field2001 = class116.field2765;
            }
        } else if (var2 == 327) {
            arg1.field2035 = 150;
            arg1.field1991 = (int) (Math.sin((double) class112.field2667 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field1916 = 5;
            arg1.field2010 = 0;
        } else {
            if (arg0 != 23787) {
                field670 = null;
            }
            if (var2 == 328) {
                arg1.field2035 = 150;
                arg1.field1991 = (int) (Math.sin((double) class112.field2667 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field1916 = 5;
                arg1.field2010 = 1;
            } else if (var2 == 600) {
                arg1.field1963 = class88.method666(126, new class137[] { class45.field1005, class131.field3041 });
            } else if (var2 == 620) {
                if (class12.field275 < 1) {
                    arg1.field1963 = class45.field999;
                } else if (class45.field1022) {
                    arg1.field1963 = class23.field550;
                    arg1.field1931 = 16711680;
                } else {
                    arg1.field1963 = class7.field163;
                    arg1.field1931 = 16777215;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field657++;
        this.field671.paint(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static final void method229(byte arg0) {
        field673++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class7.field167[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class7.field167[var16] = 192;
        }
        if (arg0 != -123) {
            return;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class22.field512[var13] = (class7.field167[var13 - 1] + class7.field167[var13 - 128] + class7.field167[var13 + 1] + class7.field167[var13 + 128]) / 4;
            }
        }
        class58.field1243 += 128;
        if (class53.field1181.length < class58.field1243) {
            class58.field1243 -= class53.field1181.length;
            int var5 = (int) (Math.random() * 12.0D);
            class36.method259((byte) 1, class45.field1016[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = var9 + (var6 << 7);
                int var11 = class22.field512[var10 + 128] - class53.field1181[var10 + class58.field1243 & class53.field1181.length - 1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class7.field167[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class46.field1037[var7] = class46.field1037[var7 + 1];
        }
        class46.field1037[var1 - 1] = (int) (Math.sin((double) class112.field2667 / 14.0D) * 16.0D + Math.sin((double) class112.field2667 / 15.0D) * 14.0D + Math.sin((double) class112.field2667 / 16.0D) * 12.0D);
        if (class28.field628 > 0) {
            class28.field628 -= 4;
        }
        if (class108.field2525 > 0) {
            class108.field2525 -= 4;
        }
        if (class28.field628 != 0 || class108.field2525 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 1) {
            class108.field2525 = 1024;
        }
        if (var8 == 0) {
            class28.field628 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
    public static final void method230(byte arg0) {
        class72.method503(false, (byte) -67);
        class13.field279 = 0;
        field656++;
        boolean var1 = true;
        for (int var2 = 0; var2 < class131.field3039.length; var2++) {
            if (class2.field34[var2] != -1 && class131.field3039[var2] == null) {
                class131.field3039[var2] = class22.field518.method668(class2.field34[var2], -214, 0);
                if (class131.field3039[var2] == null) {
                    class13.field279++;
                    var1 = false;
                }
            }
            if (class36.field786[var2] != -1 && class100.field2329[var2] == null) {
                class100.field2329[var2] = class22.field518.method650(client.field479[var2], 0, class36.field786[var2], 96);
                if (class100.field2329[var2] == null) {
                    class13.field279++;
                    var1 = false;
                }
            }
        }
        if (!var1) {
            class102.field2381 = 1;
            return;
        }
        if (arg0 <= 59) {
            field674 = null;
        }
        class114.field2700 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class131.field3039.length; var4++) {
            byte[] var56 = class100.field2329[var4];
            if (var56 != null) {
                int var57 = (class134.field3113[var4] >> 8) * 64 - class58.field1227;
                int var58 = (class134.field3113[var4] & 0xFF) * 64 - class91.field2163;
                if (class39.field877) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class80.method591(var58, 0, var57, var56);
            }
        }
        if (!var3) {
            class102.field2381 = 2;
            return;
        }
        if (class102.field2381 != 0) {
            class7.method42((byte) -23, class114.field2723, class123.field2852, true);
        }
        class67.method477(-124);
        class10.field220.method535();
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class131.field3046[var5].method428((byte) -30);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class70.field1490[var6][var54][var55] = 0;
                }
            }
        }
        class98.method709((byte) -66);
        int var7 = class131.field3039.length;
        class38.method272(0);
        class72.method503(true, (byte) -46);
        if (!class39.field877) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class134.field3113[var8] & 0xFF) * 64 - class91.field2163;
                int var18 = (class134.field3113[var8] >> 8) * 64 - class58.field1227;
                byte[] var19 = class131.field3039[var8];
                if (var19 != null) {
                    class110.method852(var17, (class11.field249 - 6) * 8, (byte) -59, class131.field3046, var18, var19, (class132.field3088 - 6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class134.field3113[var9] & 0xFF) * 64 - class91.field2163;
                byte[] var15 = class131.field3039[var9];
                int var16 = (class134.field3113[var9] >> 8) * 64 - class58.field1227;
                if (var15 == null && class11.field249 < 800) {
                    class33.method247(var14, 64, 64, var16, -95);
                }
            }
            class72.method503(true, (byte) -90);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class100.field2329[var10];
                if (var11 != null) {
                    int var12 = (class134.field3113[var10] >> 8) * 64 - class58.field1227;
                    int var13 = (class134.field3113[var10] & 0xFF) * 64 - class91.field2163;
                    class63.method464(var11, class131.field3046, var12, var13, class10.field220, 124);
                }
            }
        }
        if (class39.field877) {
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        int var36 = class92.field2180[var20][var34][var35];
                        boolean var37 = false;
                        if (var36 != -1) {
                            int var38 = var36 >> 1 & 0x3;
                            int var39 = var36 >> 14 & 0x3FF;
                            int var40 = var36 >> 24 & 0x3;
                            int var41 = var36 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class134.field3113.length; var43++) {
                                if (class134.field3113[var43] == var42 && class131.field3039[var43] != null) {
                                    var37 = true;
                                    class108.method788(class131.field3046, var40, var35 * 8, var34 * 8, (var41 & 0x7) * 8, var20, class131.field3039[var43], (var39 & 0x7) * 8, 17, var38);
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class7.method47(-24238, var35 * 8, var20, var34 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class92.field2180[0][var21][var32];
                    if (var33 == -1) {
                        class33.method247(var32 * 8, 8, 8, var21 * 8, 117);
                    }
                }
            }
            class72.method503(true, (byte) -110);
            for (int var22 = 0; var22 < 4; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class92.field2180[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class134.field3113.length; var31++) {
                                if (class134.field3113[var31] == var30 && class100.field2329[var31] != null) {
                                    class40.method294(class131.field3046, (var29 & 0x7) * 8, var27, (var28 & 0x7) * 8, var26, class10.field220, (byte) -121, var22, class100.field2329[var31], var23 * 8, var24 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class72.method503(true, (byte) -74);
        class67.method477(-122);
        client.method184(false, class131.field3046, class10.field220);
        class72.method503(true, (byte) -126);
        int var44 = class92.field2191;
        if (var44 > class28.field627) {
            var44 = class28.field627;
        }
        if (class28.field627 - 1 > var44) {
            int var45 = class28.field627 - 1;
        }
        if (class25.field603) {
            class10.field220.method556(class92.field2191);
        } else {
            class10.field220.method556(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class132.method967((byte) -15, var53, var46);
            }
        }
        class44.method314(-103);
        class58.field1233.method763((byte) -35);
        if (class44.field963 != null) {
            class59.field1264++;
            class72.field1527.method845(11, 100);
            class72.field1527.method817(-2770, 1057001181);
        }
        if (!class39.field877) {
            int var47 = (class11.field249 - 6) / 8;
            int var48 = (class132.field3088 + 6) / 8;
            int var49 = (class132.field3088 - 6) / 8;
            int var50 = (class11.field249 + 6) / 8;
            for (int var51 = var49 - 1; var51 <= var48 + 1; var51++) {
                for (int var52 = var47 - 1; var52 <= var50 + 1; var52++) {
                    if (var51 < var49 || var51 > var48 || var52 < var47 || var50 < var52) {
                        class22.field518.method642(class88.method666(117, new class137[] { class126.field2939, class61.method435(var51, 127), class11.field234, class61.method435(var52, 90) }), -60);
                        class22.field518.method642(class88.method666(124, new class137[] { class70.field1477, class61.method435(var51, 112), class11.field234, class61.method435(var52, 69) }), -125);
                    }
                }
            }
        }
        if (class80.field1777 == -1) {
            class33.method245(30, -89);
        } else {
            class33.method245(35, -118);
        }
        class64.method469(-4373);
        class72.field1527.method845(74, 100);
        class49.method354(true);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public static void method231(byte arg0) {
        field663 = null;
        field664 = null;
        field667 = null;
        field670 = null;
        field674 = null;
        field666 = null;
        field660 = null;
        field661 = null;
        field669 = null;
        if (arg0 > -47) {
            method231((byte) -100);
        }
        field662 = null;
        field668 = null;
        field655 = null;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static final void method232(byte arg0) {
        field659++;
        if (class143.field3362 == null) {
            return;
        }
        if (arg0 >= -73) {
            method228(-89, null);
        }
        class122.method919(16);
        if (class47.field1055 > 0) {
            class143.field3362.method154(false, 256);
            class47.field1055 = 0;
        }
        class143.field3362.method157((byte) -117);
        class143.field3362 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Z")
    public static final boolean method233(boolean arg0) {
        field665++;
        class70 var1 = class78.field1725;
        synchronized (class78.field1725) {
            if (class24.field585 == class2.field46) {
                return false;
            }
            class13.field289 = class89.field2129[class2.field46];
            if (arg0) {
                return false;
            } else {
                class107.field2497 = class23.field534[class2.field46];
                class2.field46 = class2.field46 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field671.update(arg0);
        field672++;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class30(Component arg0) {
        this.field671 = arg0;
    }
}
