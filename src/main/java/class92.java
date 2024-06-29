import java.awt.Color;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 {

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Llc;")
    public static class69 field2008 = class69.method470((byte) -125, " with @cya@");

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    public static int[] field2013 = new int[2048];

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "[[[Lnb;")
    public static class80[][][] field2014 = new class80[4][104][104];

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field2005 = 0;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
    public static int[] field2010 = new int[50];

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Llc;")
    public static class69 field2009 = class69.method470((byte) -110, "backtop1");

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lkc;")
    public static class63 field2006;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
    public static int[] field2007;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Color;Llc;II)V")
    public static final void method646(Color arg0, class69 arg1, int arg2, int arg3) {
        field2016++;
        if (class62.field1285) {
            class62.field1285 = false;
            class24.field509.setColor(Color.black);
            class24.field509.fillRect(0, 0, class90.field1959, class114.field2481);
        }
        if (arg0 == null) {
            arg0 = new Color(140, 17, 17);
        }
        if (arg2 != 2) {
            return;
        }
        if (class53.field1137 == null) {
            class53.field1137 = class83.method597((byte) -51).createImage(304, 34);
        }
        if (class127.field2731 == null) {
            class127.field2731 = class53.field1137.getGraphics();
        }
        class127.field2731.setColor(arg0);
        class127.field2731.drawRect(0, 0, 303, 33);
        class127.field2731.fillRect(2, 2, arg3 * 3, 30);
        class127.field2731.setColor(Color.black);
        class127.field2731.drawRect(1, 1, 301, 31);
        class127.field2731.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
        class127.field2731.setFont(class36.field718);
        class127.field2731.setColor(Color.white);
        arg1.method467((304 - arg1.method478(class94.field2057, 98)) / 2, (byte) 123, 22, class127.field2731);
        class24.field509.drawImage(class53.field1137, class90.field1959 / 2 - 152, class114.field2481 / 2 + -18, null);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method647(int arg0) {
        field2007 = null;
        if (arg0 != 2) {
            field2013 = null;
        }
        field2010 = null;
        field2008 = null;
        field2006 = null;
        field2014 = null;
        field2013 = null;
        field2009 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLkc;)I")
    public static final int method648(boolean arg0, class63 arg1) {
        field2001++;
        int var2 = 0;
        if (arg0) {
            method647(84);
        }
        if (arg1.method386(class127.field2739, -110, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class33.field664, -76, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class87.field1923, -128, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class81.field1839, -72, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class29.field599, -107, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class36.field714, -103, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class30.field635, -70, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class60.field1211, -64, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class42.field823, -124, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class50.field1100, -80, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(field2009, -63, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class94.field2074, -110, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class67.field1391, -111, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class74.field1651, -125, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class69.field1536, -95, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class17.field340, -109, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class49.field1006, -124, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class123.field2671, -66, class82.field1860)) {
            var2++;
        }
        if (arg1.method386(class121.field2587, -122, class82.field1860)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static final void method649(byte arg0) {
        field2004++;
        if (class50.field1094 > 0) {
            class50.field1094--;
        }
        if (class25.field539 > 1) {
            class25.field539--;
        }
        if (class56.field1179) {
            class56.field1179 = false;
            class122.method911(797);
            return;
        }
        for (int var1 = 0; var1 < 100 && class80.method569((byte) 22); var1++) {
        }
        if (class125.field2705 != 30 && class125.field2705 != 35) {
            return;
        }
        if (class53.field1134 && class125.field2705 == 30) {
            class62.field1278 = 0;
            class81.field1834 = 0;
            while (class80.method575(63)) {
            }
            for (int var2 = 0; var2 < class125.field2706.length; var2++) {
                class125.field2706[var2] = false;
            }
        }
        class56.method348(class26.field557, (byte) 113, 149);
        Object var3 = client.field385.field2127;
        synchronized (client.field385.field2127) {
            if (!class23.field478) {
                client.field385.field2136 = 0;
            } else if (class62.field1278 != 0 || client.field385.field2136 >= 40) {
                class26.field557.method178(-5, 94);
                int var4 = 0;
                class26.field557.method675((byte) -81, 0);
                class35.field696++;
                int var5 = class26.field557.field2061;
                for (int var6 = 0; client.field385.field2136 > var6 && class26.field557.field2061 - var5 < 240; var6++) {
                    var4++;
                    int var7 = client.field385.field2134[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = client.field385.field2135[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    int var9 = var8 * 765 + var7;
                    if (client.field385.field2135[var6] == -1 && client.field385.field2134[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class64.field1342 != var7 || class122.field2660 != var8) {
                        int var10 = var7 - class64.field1342;
                        int var11 = var8 - class122.field2660;
                        class64.field1342 = var7;
                        class122.field2660 = var8;
                        if (class16.field293 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class26.field557.method686(16711680, (class16.field293 << 12) + (var10 << 6) + var11);
                            class16.field293 = 0;
                        } else if (class16.field293 < 8) {
                            class26.field557.method715(25174, (class16.field293 << 19) + var9 + 8388608);
                            class16.field293 = 0;
                        } else {
                            class26.field557.method704((class16.field293 << 19) + var9 - 1073741824, (byte) 122);
                            class16.field293 = 0;
                        }
                    } else if (class16.field293 < 2047) {
                        class16.field293++;
                    }
                }
                class26.field557.method697((byte) 98, class26.field557.field2061 - var5);
                if (client.field385.field2136 <= var4) {
                    client.field385.field2136 = 0;
                } else {
                    client.field385.field2136 -= var4;
                    for (int var12 = 0; var12 < client.field385.field2136; var12++) {
                        client.field385.field2134[var12] = client.field385.field2134[var4 + var12];
                        client.field385.field2135[var12] = client.field385.field2135[var4 + var12];
                    }
                }
            }
        }
        if (class62.field1278 != 0) {
            class57.field1189++;
            int var13 = class127.field2733;
            long var14 = (class79.field1793 - class30.field632) / 50L;
            class30.field632 = class79.field1793;
            int var16 = class19.field417;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 764) {
                var13 = 764;
            }
            if (var14 > 4095L) {
                var14 = 4095L;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            byte var17 = 0;
            int var18 = var16 * 765 + var13;
            int var19 = (int) var14;
            if (class62.field1278 == 2) {
                var17 = 1;
            }
            class26.field557.method178(arg0 ^ 0x3F, 55);
            class26.field557.method668((var17 << 19) + (var19 << 20) + var18, (byte) 6);
        }
        if (client.field386 > 0) {
            client.field386--;
        }
        if (class125.field2706[96] || class125.field2706[97] || class125.field2706[98] || class125.field2706[99]) {
            class60.field1230 = true;
        }
        if (class60.field1230 && client.field386 <= 0) {
            class64.field1348++;
            class60.field1230 = false;
            client.field386 = 20;
            class26.field557.method178(arg0 + 55, 2);
            class26.field557.method689(arg0 ^ 0x44, class17.field342);
            class26.field557.method676(-91, class122.field2654);
        }
        if (class43.field858 && !class23.field487) {
            class107.field2321++;
            class23.field487 = true;
            class26.field557.method178(-5, 99);
            class26.field557.method675((byte) -115, 1);
        }
        if (!class43.field858 && class23.field487) {
            class107.field2321++;
            class23.field487 = false;
            class26.field557.method178(arg0 + 55, 99);
            class26.field557.method675((byte) -126, 0);
        }
        class93.method657(-10302);
        if (class125.field2705 != 30 && class125.field2705 != 35) {
            return;
        }
        class85.method605(-1);
        class22.method145((byte) 95);
        class18.field376++;
        if (class18.field376 > 750) {
            class122.method911(797);
            return;
        }
        class18.method107((byte) -7);
        class101.method770((byte) 17);
        class103.method777(arg0 ^ 0x3B);
        if (class23.field489 != 0) {
            class17.field321 += 20;
            if (class17.field321 >= 400) {
                class23.field489 = 0;
            }
        }
        class69.field1534++;
        if (class93.field2039 != 0) {
            class115.field2502++;
            if (class115.field2502 >= 15) {
                if (class93.field2039 == 2) {
                    class110.field2418 = true;
                }
                if (class93.field2039 == 3) {
                    class35.field709 = true;
                }
                class93.field2039 = 0;
            }
        }
        if (class57.field1198 != 0) {
            if (class101.field2193 > class27.field575 + 5 || class27.field575 - 5 > class101.field2193 || class74.field1666 > class93.field2022 + 5 || class74.field1666 < class93.field2022 - 5) {
                class29.field603 = true;
            }
            class16.field301++;
            if (class81.field1834 == 0) {
                if (class57.field1198 == 2) {
                    class110.field2418 = true;
                }
                if (class57.field1198 == 3) {
                    class35.field709 = true;
                }
                class57.field1198 = 0;
                if (class29.field603 && class16.field301 >= 5) {
                    class11.field236 = -1;
                    class61.method369(-20836);
                    if (class80.field1823 == class11.field236 && class72.field1597 != class53.field1135) {
                        class9 var20 = class9.method56(true, class80.field1823);
                        class115.field2499++;
                        byte var21 = 0;
                        if (class70.field1570 == 1 && var20.field186 == 206) {
                            var21 = 1;
                        }
                        if (var20.field129[class53.field1135] <= 0) {
                            var21 = 0;
                        }
                        if (var20.field179) {
                            int var22 = class53.field1135;
                            int var23 = class72.field1597;
                            var20.field129[var22] = var20.field129[var23];
                            var20.field165[var22] = var20.field165[var23];
                            var20.field129[var23] = -1;
                            var20.field165[var23] = 0;
                        } else if (var21 == 1) {
                            int var24 = class72.field1597;
                            int var25 = class53.field1135;
                            while (var24 != var25) {
                                if (var24 > var25) {
                                    var20.method49(var24 - 1, (byte) -71, var24);
                                    var24--;
                                } else if (var24 < var25) {
                                    var20.method49(var24 + 1, (byte) -69, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method49(class53.field1135, (byte) -102, class72.field1597);
                        }
                        class26.field557.method178(-5, 125);
                        class26.field557.method676(37, class72.field1597);
                        class26.field557.method696(class53.field1135, false);
                        class26.field557.method668(class80.field1823, (byte) 126);
                        class26.field557.method687(var21, -109);
                    }
                } else if ((client.field399 == 1 || class64.method411(27516, class72.field1604 - 1)) && class72.field1604 > 2) {
                    class112.method826(arg0 - 8056);
                } else if (class72.field1604 > 0) {
                    class72.method510(0, class72.field1604 - 1);
                }
                class62.field1278 = 0;
                class115.field2502 = 10;
            }
        }
        if (class129.field2806 != -1) {
            int var26 = class129.field2806;
            int var27 = class129.field2789;
            boolean var28 = class85.method609(0, 0, true, 0, 0, 0, class46.field974.field1097[0], class46.field974.field1041[0], arg0 + 190, var27, 0, var26);
            class129.field2806 = -1;
            if (var28) {
                class55.field1170 = class19.field417;
                class17.field321 = 0;
                class23.field489 = 1;
                class83.field1871 = class127.field2733;
            }
        }
        if (class62.field1278 == 1 && class6.field115 != null) {
            class6.field115 = null;
            class35.field709 = true;
            class62.field1278 = 0;
        }
        class90.method634(18911);
        if (class22.field469 == -1) {
            class81.method589((byte) -72);
            class110.method819(arg0 - 407);
            class4.method26(-500);
        }
        if (class81.field1834 == 1 || class62.field1278 == 1) {
            class50.field1090++;
        }
        if (class89.field1935 == -1 && class125.field2690 == -1 && class23.field480 == -1) {
            if (class36.field723 > 0) {
                class36.field723--;
            }
        } else if (class36.field723 < 100) {
            class36.field723++;
            if (class36.field723 == 100) {
                if (class89.field1935 != -1) {
                    class35.field709 = true;
                }
                if (class125.field2690 != -1) {
                    class110.field2418 = true;
                }
            }
        }
        class39.method234(24);
        if (arg0 != -60) {
            return;
        }
        if (class114.field2475) {
            class25.method164(128);
        }
        for (int var29 = 0; var29 < 5; var29++) {
            int var10002 = class101.field2188[var29]++;
        }
        class29.method187(arg0 ^ 0x3B);
        int var30 = class102.method774(124);
        int var31 = class40.method242(-79);
        if (var30 > 4500 && var31 > 4500) {
            class50.field1094 = 250;
            class16.method89(true, 4000);
            class26.field557.method178(-5, 247);
            class71.field1583++;
        }
        class123.field2683++;
        class51.field1117++;
        if (class51.field1117 > 500) {
            class51.field1117 = 0;
            int var32 = (int) (Math.random() * 8.0D);
            if ((var32 & 0x4) == 4) {
                class22.field447 += class30.field624;
            }
            if ((var32 & 0x2) == 2) {
                class63.field1338 += class54.field1156;
            }
            if ((var32 & 0x1) == 1) {
                class55.field1158 += class122.field2666;
            }
        }
        if (class55.field1158 < -50) {
            class122.field2666 = 2;
        }
        if (class22.field447 < -40) {
            class30.field624 = 1;
        }
        if (class55.field1158 > 50) {
            class122.field2666 = -2;
        }
        if (class123.field2683 > 500) {
            class123.field2683 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class70.field1558 += class107.field2338;
            }
            if ((var33 & 0x1) == 1) {
                class128.field2757 += class24.field498;
            }
        }
        if (class128.field2757 < -60) {
            class24.field498 = 2;
        }
        if (class63.field1338 < -55) {
            class54.field1156 = 2;
        }
        if (class128.field2757 > 60) {
            class24.field498 = -2;
        }
        if (class70.field1558 < -20) {
            class107.field2338 = 1;
        }
        class19.field410++;
        if (class63.field1338 > 55) {
            class54.field1156 = -2;
        }
        if (class22.field447 > 40) {
            class30.field624 = -1;
        }
        if (class70.field1558 > 10) {
            class107.field2338 = -1;
        }
        if (class19.field410 > 50) {
            class26.field557.method178(-5, 217);
            class93.field2040++;
        }
        try {
            if (class106.field2298 != null && class26.field557.field2061 > 0) {
                class106.field2298.method562(class26.field557.field2061, 5000, class26.field557.field2077, 0);
                class26.field557.field2061 = 0;
                class19.field410 = 0;
            }
        } catch (IOException var34) {
            class122.method911(797);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method650(int arg0, int arg1) {
        field2002++;
        if (arg1 == 100 && class26.field559 > 0) {
            byte[] var2 = class53.field1146[--class26.field559];
            class53.field1146[class26.field559] = null;
            return var2;
        } else if (arg1 == 5000 && class75.field1687 > 0) {
            byte[] var3 = client.field404[--class75.field1687];
            client.field404[class75.field1687] = null;
            return var3;
        } else if (arg1 == 30000 && class82.field1862 > 0) {
            byte[] var4 = class35.field699[--class82.field1862];
            class35.field699[class82.field1862] = null;
            return var4;
        } else {
            if (arg0 < 36) {
                field2007 = null;
            }
            return new byte[arg1];
        }
    }
}
