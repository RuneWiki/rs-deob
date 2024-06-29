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
public class client extends class29 {

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4380 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field4386 = "skill: ";

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lwb;")
    public static class171 field4372;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "[[Lfn;")
    public static class36[][] field4377;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 6)
    public final void method270(int arg0) {
        if (class43.field680) {
            class43.method373();
        }
        field4381++;
        if (class120.field2076 != null) {
            class58.method528(class85.field1369, arg0 + 15243, class120.field2076);
            class120.field2076 = null;
        }
        if (class11.field135 != null) {
            class11.field135.field3455 = false;
        }
        class11.field135 = null;
        if (class279.field4426 != null) {
            class279.field4426.method177(false);
            class279.field4426 = null;
        }
        class297.method2026(class42.field616, 1);
        class210.method1566(class42.field616, (byte) 124);
        if (class211.field3564 != null) {
            class211.field3564.method855(class42.field616, (byte) 44);
        }
        if (arg0 != 27) {
            field4375 = 56;
        }
        class17.method173(90);
        class201.method1516(arg0 - 58);
        class211.field3564 = null;
        if (class135.field2362 != null) {
            class135.field2362.method1280((byte) 76);
        }
        if (class320.field5064 != null) {
            class320.field5064.method1280((byte) 76);
        }
        class247.field4009.method1974(2083285280);
        class209.field3542.method758(arg0 + 11764);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 55)
    public static void method1885(boolean arg0) {
        field4372 = null;
        field4377 = (class36[][]) null;
        field4386 = null;
        if (!arg0) {
            field4372 = (class171) null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 70)
    private final void method1886(byte arg0, byte[] arg1) {
        if (arg0 > -121) {
            this.init();
        }
        class336 var3 = new class336(arg1);
        while (true) {
            int var4 = var3.method2364(-9069);
            if (var4 == 0) {
                field4383++;
                return;
            }
            if (var4 == 1) {
                int[] var5 = class166.field2900 = new int[6];
                var5[0] = var3.method2339((byte) -46);
                var5[1] = var3.method2339((byte) -46);
                var5[2] = var3.method2339((byte) -46);
                var5[3] = var3.method2339((byte) -46);
                var5[4] = var3.method2339((byte) -46);
                var5[5] = var3.method2339((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 110)
    private final void method1887(int arg0) {
        field4378++;
        if (class247.field4009.field4649 > class15.field226) {
            class170.field2945 = (class247.field4009.field4649 - 1) * 250;
            if (class170.field2945 > 3000) {
                class170.field2945 = 3000;
            }
            if (class86.field1377 == class184.field3122) {
                class86.field1377 = class140.field2566;
            } else {
                class86.field1377 = class184.field3122;
            }
            if (class247.field4009.field4649 >= 2 && class247.field4009.field4650 == 6) {
                this.method263("js5connect_outofdate", false);
                class88.field1397 = 1000;
                return;
            }
            if (class247.field4009.field4649 >= 4 && class247.field4009.field4650 == -1) {
                this.method263("js5crc", false);
                class88.field1397 = 1000;
                return;
            }
            if (class247.field4009.field4649 >= 4 && (class88.field1397 == 0 || class88.field1397 == 5)) {
                if (class247.field4009.field4650 == 7 || class247.field4009.field4650 == 9) {
                    this.method263("js5connect_full", false);
                } else if (class247.field4009.field4650 > 0) {
                    this.method263("js5connect", false);
                } else {
                    this.method263("js5io", false);
                }
                class88.field1397 = 1000;
                return;
            }
        }
        class15.field226 = class247.field4009.field4649;
        if (class170.field2945 > 0) {
            class170.field2945--;
            return;
        }
        try {
            if (class17.field283 == 0) {
                class156.field2773 = class85.field1369.method541(false, class86.field1377, class64.field1004);
                class17.field283++;
            }
            if (arg0 != 12) {
                return;
            }
            if (class17.field283 == 1) {
                if (class156.field2773.field709 == 2) {
                    this.method1891((byte) 122, 1000);
                    return;
                }
                if (class156.field2773.field709 == 1) {
                    class17.field283++;
                }
            }
            if (class17.field283 == 2) {
                class288.field4592 = new class17((Socket) class156.field2773.field712, class85.field1369);
                class336 var2 = new class336(5);
                var2.method2370(15, (byte) -20);
                var2.method2320(-6128, 546);
                class288.field4592.method178(0, 5, var2.field5342, false);
                class17.field283++;
                class137.field2548 = class306.method2102(-289);
            }
            if (class17.field283 == 3) {
                if (class88.field1397 == 0 || class88.field1397 == 5 || class288.field4592.method175(-21329) > 0) {
                    int var3 = class288.field4592.method180(0);
                    if (var3 != 0) {
                        this.method1891((byte) 122, var3);
                        return;
                    }
                    class17.field283++;
                } else if (class306.method2102(arg0 ^ 0xFFFFFED3) - class137.field2548 > 30000L) {
                    this.method1891((byte) 122, 1001);
                    return;
                }
            }
            if (class17.field283 == 4) {
                boolean var4 = class88.field1397 == 5 || class88.field1397 == 10 || class88.field1397 == 28;
                class247.field4009.method1989(arg0 ^ 0xFFFFADD2, class288.field4592, !var4);
                class288.field4592 = null;
                class156.field2773 = null;
                class17.field283 = 0;
            }
        } catch (IOException var6) {
            this.method1891((byte) 122, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 259)
    private final void method1888(int arg0) {
        field4384++;
        for (class116.field2028 = 0; class283.method1929(arg0 ^ 0xFFFFFF9B) && class116.field2028 < 128; class116.field2028++) {
            class210.field3555[class116.field2028] = class81.field1328;
            class258.field4170[class116.field2028] = class141.field2583;
        }
        class31.field446++;
        if (~class311.field4933 != arg0) {
            class293.method2009(0, 0, 0, class188.field3152, (byte) 125, 0, class313.field4973, class311.field4933);
        }
        class99.field1606++;
        if (class43.field680) {
            int var2 = 2359807;
            label197: for (int var3 = 0; var3 < 32768; var3++) {
                class278 var4 = class320.field5071[var3];
                if (var4 != null) {
                    byte var5 = var4.field4413.field140;
                    if ((var5 & 0x2) > 0 && var4.field1957 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1975[0] = (var4.field2036 >> 7) + var6;
                            var4.field2037[0] = 1;
                            var4.field2034[0] = (var4.field1985 >> 7) + var7;
                            class163.field2882[class205.field3497].method1512(false, var4.method987(arg0 + 3047), var4.method987(3047), false, var4.field2036 >> 7, var4.field1985 >> 7, 0, 131072);
                            if (var4.field1975[0] >= 0 && var4.field1975[0] <= (104 - var4.method987(3047)) && var4.field2034[0] >= 0 && var4.field2034[0] <= (104 - var4.method987(arg0 + 3047)) && class163.field2882[class205.field3497].method1500((byte) -112, var4.field2036 >> 7, var4.field1985 >> 7, var4.field2034[0], var4.field1975[0])) {
                                if (var4.method987(3047) > 1) {
                                    for (int var8 = var4.field1975[0]; var8 < var4.field1975[0] + var4.method987(3047); var8++) {
                                        for (int var9 = var4.field2034[0]; (var4.field2034[0] + var4.method987(3047)) > var9; var9++) {
                                            if ((var2 & class163.field2882[class205.field3497].field3418[var8][var9]) != 0) {
                                                continue label197;
                                            }
                                        }
                                    }
                                }
                                var4.field1957 = 1;
                            }
                        }
                    }
                    class91.method795((byte) 115, var4);
                    class318.method2186(var4, -121);
                    class347.method2434(var4, 27826);
                    class163.field2882[class205.field3497].method1508(var4.method987(arg0 + 3047), var4.method987(3047), var4.field1985 >> 7, var4.field2036 >> 7, false, arg0, false);
                }
            }
        }
        if (!class43.field680 && class72.field1199 == 0) {
            class351.method2448(85);
        } else if (class126.field2168 == 0 && class69.field1127 == 0) {
            if (class191.field3194 == 2) {
                class329.method2282(true);
            } else {
                class161.method1282(2);
            }
            if ((class269.field4309 >> 7) < 14 || (class269.field4309 >> 7) >= 90 || (class32.field454 >> 7) < 14 || (class32.field454 >> 7) >= 90) {
                class348.method2436((byte) -70);
            }
        }
        while (true) {
            class258 var10;
            class137 var17;
            class137 var18;
            do {
                var10 = (class258) class71.field1195.method2301((byte) 123);
                if (var10 == null) {
                    while (true) {
                        class258 var11;
                        class137 var15;
                        class137 var16;
                        do {
                            var11 = (class258) class253.field4076.method2301((byte) 107);
                            if (var11 == null) {
                                while (true) {
                                    class258 var12;
                                    class137 var13;
                                    class137 var14;
                                    do {
                                        var12 = (class258) class311.field4920.method2301((byte) 90);
                                        if (var12 == null) {
                                            if (class204.field3473 != null) {
                                                class57.method511(16);
                                            }
                                            if (class328.field5226 != null && class328.field5226.field709 == 1) {
                                                if (class328.field5226.field712 != null) {
                                                    class128.method1068(class53.field824, class37.field542, false);
                                                }
                                                class53.field824 = false;
                                                class328.field5226 = null;
                                                class37.field542 = null;
                                            }
                                            if (class181.field3045 % 1500 == 0) {
                                                class66.method633(false);
                                            }
                                            return;
                                        }
                                        var13 = var12.field4168;
                                        if (var13.field2434 < 0) {
                                            break;
                                        }
                                        var14 = class146.method1167(1169843632, var13.field2465);
                                    } while (var14 == null || var14.field2453 == null || var13.field2434 >= var14.field2453.length || var14.field2453[var13.field2434] != var13);
                                    class179.method1376(var12, false);
                                }
                            }
                            var15 = var11.field4168;
                            if (var15.field2434 < 0) {
                                break;
                            }
                            var16 = class146.method1167(1169843632, var15.field2465);
                        } while (var16 == null || var16.field2453 == null || var16.field2453.length <= var15.field2434 || var16.field2453[var15.field2434] != var15);
                        class179.method1376(var11, false);
                    }
                }
                var17 = var10.field4168;
                if (var17.field2434 < 0) {
                    break;
                }
                var18 = class146.method1167(1169843632, var17.field2465);
            } while (var18 == null || var18.field2453 == null || var18.field2453.length <= var17.field2434 || var18.field2453[var17.field2434] != var17);
            class179.method1376(var10, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 475)
    public final void method269(byte arg0) {
        int var2 = -32 / ((arg0 - 9) / 40);
        class132.method1087(-111);
        field4379++;
        class209.field3542 = new class83();
        class247.field4009 = new class290();
        if (class331.field5280 != 0) {
            class215.field3615 = new byte[50][];
        }
        class101.method873(class85.field1369, -126);
        if (class246.field3988 == 0) {
            class133.field2270 = this.getCodeBase().getHost();
            class141.field2590 = 43594;
            class292.field4676 = 443;
        } else if (class246.field3988 == 1) {
            class133.field2270 = this.getCodeBase().getHost();
            class292.field4676 = class248.field4020 + 50000;
            class141.field2590 = class248.field4020 + 40000;
        } else if (class246.field3988 == 2) {
            class133.field2270 = "127.0.0.1";
            class141.field2590 = class248.field4020 + 40000;
            class292.field4676 = class248.field4020 + 50000;
        }
        class140.field2566 = class292.field4676;
        class328.field5225 = class221.field3693 = class223.field3714 = class220.field3683 = new short[256];
        if (class59.field915 == 3 && class246.field3988 != 2) {
            class120.field2082 = class248.field4020;
        }
        if (class72.field1199 == 1) {
            class295.field4715 = true;
            class311.field4934 = class17.field270;
            class145.field2634 = class356.field5618;
            class228.field3830 = class42.field634;
            class9.field123 = 16777215;
            class9.field117 = 0;
            class293.field4707 = class37.field541;
        } else {
            class228.field3830 = class90.field1418;
            class145.field2634 = class270.field4312;
            class311.field4934 = class125.field2163;
            class293.field4707 = class346.field5524;
        }
        class64.field1004 = class133.field2270;
        class230.field3840 = class141.field2590;
        class86.field1377 = class230.field3840;
        class184.field3122 = class141.field2590;
        class120.method1017((byte) 124);
        class127.method1063(false, class42.field616);
        class331.method2292(class42.field616, true);
        class211.field3564 = class130.method1078((byte) 99);
        if (class211.field3564 != null) {
            class211.field3564.method859(class42.field616, (byte) 58);
        }
        class331.field5277 = class59.field915;
        try {
            if (class85.field1369.field906 != null) {
                class123.field2136 = new class272(class85.field1369.field906, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class140.field2578[var3] = new class272(class85.field1369.field918[var3], 6000, 0);
                }
                class287.field4586 = new class272(class85.field1369.field921, 6000, 0);
                class336.field5371 = new class177(255, class123.field2136, class287.field4586, 500000);
                class112.field1881 = new class272(class85.field1369.field909, 24, 0);
                class85.field1369.field906 = null;
                class85.field1369.field918 = null;
                class85.field1369.field921 = null;
                class85.field1369.field909 = null;
            }
        } catch (IOException var5) {
            class336.field5371 = null;
            class123.field2136 = null;
            class287.field4586 = null;
            class112.field1881 = null;
        }
        if (class246.field3988 != 0) {
            class339.field5419 = true;
        }
        if (class72.field1199 == 0) {
            class242.field3951 = class11.field132;
        } else if (class72.field1199 == 1) {
            class242.field3951 = class277.field4411;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 600)
    public final void init() {
        field4369++;
        if (!this.method267(0)) {
            return;
        }
        class248.field4020 = Integer.parseInt(this.getParameter("worldid"));
        class246.field3988 = Integer.parseInt(this.getParameter("modewhere"));
        if (class246.field3988 < 0 || class246.field3988 > 1) {
            class246.field3988 = 0;
        }
        class331.field5280 = Integer.parseInt(this.getParameter("modewhat"));
        if (class331.field5280 < 0 || class331.field5280 > 2) {
            class331.field5280 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class255.field4109 = true;
        } else {
            class255.field4109 = false;
        }
        try {
            class5.field67 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class5.field67 = 0;
        }
        class95.method815((byte) -127, class5.field67);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class221.field3690 = true;
        } else {
            class221.field3690 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class265.field4275 = true;
        } else {
            class265.field4275 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class72.field1199 = 1;
        } else {
            class72.field1199 = 0;
        }
        try {
            class201.field3433 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class201.field3433 = 0;
        }
        class256.field4125 = this.getParameter("settings");
        if (class256.field4125 == null) {
            class256.field4125 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class1.field3 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class1.field3 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class277.field4405 = true;
        } else {
            class277.field4405 = false;
        }
        class158.field2789 = this;
        this.method261(503, 98, 765, class331.field5280 + 32, 1546);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[Ljava/lang/String;[S)V", line = 688)
    public static final void method1889(int arg0, String[] arg1, short[] arg2) {
        field4385++;
        if (arg0 != -10) {
            field4377 = (class36[][]) ((class36[][]) null);
        }
        class162.method1288(0, arg1, arg2, arg1.length - 1, 1);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 700)
    private final void method1890(int arg0) {
        if (!class222.field3705) {
            label245: while (true) {
                do {
                    if (!class283.method1929(-101)) {
                        break label245;
                    }
                } while (class141.field2583 != 's' && class141.field2583 != 'S');
                class222.field3705 = true;
            }
        }
        field4376++;
        if (class89.field1407 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class306.method2102(-289);
            if (class40.field603 == 0L) {
                class40.field603 = var4;
            }
            if (var3 > 16384 && (var4 - class40.field603) < 5000L) {
                if (var4 - class120.field2086 > 1000L) {
                    System.gc();
                    class120.field2086 = var4;
                }
                class215.field3618 = 5;
                class317.field5034 = class44.field691;
            } else {
                class89.field1407 = 10;
                class215.field3618 = 5;
                class317.field5034 = class253.field4077;
            }
        } else if (class89.field1407 == 10) {
            for (int var29 = 0; var29 < 4; var29++) {
                class163.field2882[var29] = new class200(104, 104);
            }
            class89.field1407 = 30;
            class215.field3618 = 10;
            class317.field5034 = class288.field4594;
        } else if (class89.field1407 == 30) {
            if (class278.field4414 == null) {
                class278.field4414 = new class247(class247.field4009, class209.field3542);
            }
            if (class278.field4414.method1734((byte) 0)) {
                class266.field4288 = class342.method2406(0, false, true, true, -17);
                class105.field1752 = class342.method2406(1, false, true, true, arg0 - 113);
                class104.field1742 = class342.method2406(2, true, true, false, -81);
                class27.field369 = class342.method2406(3, false, true, true, -11);
                class207.field3517 = class342.method2406(4, false, true, true, -88);
                class92.field1446 = class342.method2406(5, true, true, true, -46);
                class179.field3030 = class342.method2406(6, true, false, true, -48);
                class262.field4248 = class342.method2406(7, false, true, true, -92);
                class321.field5091 = class342.method2406(8, false, true, true, -37);
                class29.field405 = class342.method2406(9, false, true, true, -25);
                class26.field366 = class342.method2406(10, false, true, true, -70);
                class86.field1374 = class342.method2406(11, false, true, true, -25);
                class24.field344 = class342.method2406(12, false, true, true, -124);
                class188.field3149 = class342.method2406(13, false, true, true, -54);
                class158.field2801 = class342.method2406(14, false, false, true, arg0 - 119);
                class144.field2625 = class342.method2406(15, false, true, true, arg0 ^ 0xFFFFFFE5);
                class80.field1318 = class342.method2406(16, false, true, true, arg0 - 178);
                class254.field4099 = class342.method2406(17, false, true, true, -5);
                class215.field3614 = class342.method2406(18, false, true, true, -44);
                class124.field2148 = class342.method2406(19, false, true, true, -73);
                class249.field4038 = class342.method2406(20, false, true, true, -76);
                class341.field5445 = class342.method2406(21, false, true, true, -124);
                class122.field2130 = class342.method2406(22, false, true, true, arg0 - 145);
                class166.field2895 = class342.method2406(23, true, true, true, arg0 ^ 0xFFFFFF9C);
                class305.field4838 = class342.method2406(24, false, true, true, arg0 ^ 0xFFFFFFC8);
                class277.field4408 = class342.method2406(25, false, true, true, arg0 ^ 0xFFFFFFD5);
                class28.field378 = class342.method2406(26, true, true, true, -83);
                class177.field3011 = class342.method2406(27, false, true, true, -111);
                class276.field4392 = class342.method2406(28, true, true, true, arg0 ^ 0xFFFFFF9B);
                class215.field3618 = 15;
                class317.field5034 = class131.field2255;
                class89.field1407 = 40;
            } else {
                class317.field5034 = class36.field531;
                class215.field3618 = 12;
            }
        } else if (class89.field1407 == 40) {
            int var6 = 0;
            for (int var7 = 0; var7 < 29; var7++) {
                var6 += class134.field2291[var7].method2208(42) * class221.field3694[var7] / 100;
            }
            if (var6 == 100) {
                class317.field5034 = class327.field5207;
                class215.field3618 = 20;
                class166.method1310(-30, class321.field5091);
                class106.method905(115, class321.field5091);
                class94.method812(class321.field5091, false);
                class89.field1407 = 41;
            } else {
                if (var6 != 0) {
                    class317.field5034 = class99.field1613 + var6 + "%";
                }
                class215.field3618 = 20;
            }
        } else if (class89.field1407 == 41) {
            if (class276.field4392.method458(0)) {
                this.method1886((byte) -123, class276.field4392.method459(1, -1));
                class215.field3618 = 25;
                class317.field5034 = class166.field2907;
                class89.field1407 = 45;
            } else {
                class317.field5034 = class324.field5163 + class276.field4392.method440((byte) 11) + "%";
                class215.field3618 = 25;
            }
        } else if (class89.field1407 == 45) {
            class247.method1733(22050, 2, class57.field875, (byte) 75);
            class188.field3160 = new class107();
            class188.field3160.method917(117, 9, 128);
            class135.field2362 = class17.method174(0, -52, class42.field616, 22050, class85.field1369);
            class135.field2362.method1274(class188.field3160, -72);
            class4.method22(class144.field2625, class188.field3160, (byte) 68, class207.field3517, class158.field2801);
            class320.field5064 = class17.method174(1, arg0 - 154, class42.field616, 2048, class85.field1369);
            class1.field9 = new class268();
            class320.field5064.method1274(class1.field9, -64);
            class210.field3559 = new class74(22050, class266.field4291);
            class204.field3475 = class179.field3030.method437((byte) -33, "scape main");
            class317.field5034 = class44.field698;
            class215.field3618 = 30;
            class89.field1407 = 50;
        } else if (class89.field1407 == 50) {
            int var27 = class354.method2461(class188.field3149, false, class321.field5091);
            int var28 = class289.method1973(false);
            if (var28 <= var27) {
                class215.field3618 = 35;
                class317.field5034 = class79.field1291;
                class89.field1407 = 60;
            } else {
                class215.field3618 = 35;
                class317.field5034 = class316.field5026 + var27 * 100 / var28 + "%";
            }
        } else if (class89.field1407 == 60) {
            int var8 = class162.method1290((byte) -42, class321.field5091);
            int var9 = class148.method1178(false);
            if (var9 <= var8) {
                class317.field5034 = class80.field1316;
                class215.field3618 = 40;
                class89.field1407 = 65;
            } else {
                class317.field5034 = class15.field232 + var8 * 100 / var9 + "%";
                class215.field3618 = 40;
            }
        } else if (class89.field1407 == 65) {
            class33.method305(class321.field5091, false, class188.field3149);
            class317.field5034 = class218.field3631;
            class215.field3618 = 45;
            class33.method302((byte) -2, 5);
            class89.field1407 = 70;
        } else if (class89.field1407 == 70) {
            class104.field1742.method458(0);
            byte var15 = 0;
            int var16 = var15 + class104.field1742.method440((byte) 11);
            class80.field1318.method458(0);
            int var17 = var16 + class80.field1318.method440((byte) 11);
            class254.field4099.method458(0);
            int var18 = var17 + class254.field4099.method440((byte) 11);
            class215.field3614.method458(0);
            int var19 = var18 + class215.field3614.method440((byte) 11);
            class124.field2148.method458(0);
            int var20 = var19 + class124.field2148.method440((byte) 11);
            class249.field4038.method458(0);
            int var21 = var20 + class249.field4038.method440((byte) 11);
            class341.field5445.method458(0);
            int var22 = var21 + class341.field5445.method440((byte) 11);
            class122.field2130.method458(arg0 - 80);
            int var23 = var22 + class122.field2130.method440((byte) 11);
            class305.field4838.method458(0);
            int var24 = var23 + class305.field4838.method440((byte) 11);
            class277.field4408.method458(0);
            int var25 = var24 + class277.field4408.method440((byte) 11);
            class177.field3011.method458(0);
            int var26 = var25 + class177.field3011.method440((byte) 11);
            if (var26 >= 1100) {
                class276.method1900(class104.field1742, -118);
                class249.method1750((byte) -90, class104.field1742);
                class325.method2261((byte) -46, class104.field1742);
                class142.method1148(class262.field4248, class104.field1742, 3);
                class334.method2310((byte) 48, class262.field4248, class80.field1318, true);
                class32.method294(class262.field4248, (byte) -116, class215.field3614);
                class255.method1777(class124.field2148, 108, class8.field110, class262.field4248, true);
                class95.method816((byte) -33, class104.field1742);
                class178.method1374(class105.field1752, 83, class266.field4288, class249.field4038);
                class292.method1998((byte) -71, class104.field1742);
                class11.method107(class341.field5445, (byte) -123, class262.field4248);
                class25.method234(class122.field2130, 33);
                class292.method1994(arg0 - 64, class104.field1742);
                class222.method1624(class321.field5091, class188.field3149, (byte) -52, class262.field4248, class27.field369);
                class265.method1830(131586, class104.field1742);
                class7.method44(class254.field4099, (byte) -51);
                class155.method1244(new class277(), class277.field4408, class305.field4838, (byte) 113);
                class295.method2012(class305.field4838, class277.field4408, (byte) 28);
                class145.method1165(arg0 ^ 0x50, class104.field1742);
                class34.method309(0, class104.field1742);
                class66.method636(class104.field1742, (byte) 47);
                class262.method1812(arg0 ^ 0x20, class104.field1742, class321.field5091);
                class203.method1527(class104.field1742, 8, class321.field5091);
                class215.field3618 = 50;
                class317.field5034 = class257.field4139;
                class218.method1607(60);
                class89.field1407 = 80;
            } else {
                class215.field3618 = 50;
                class317.field5034 = class56.field867 + var26 / 11 + "%";
            }
        } else if (class89.field1407 == 80) {
            int var13 = class53.method479(arg0 + 18, class321.field5091);
            int var14 = class295.method2013(-79);
            if (var14 > var13) {
                class317.field5034 = class291.field4655 + var13 * 100 / var14 + "%";
                class215.field3618 = 60;
            } else {
                class127.method1058(true, class321.field5091);
                class215.field3618 = 60;
                class89.field1407 = 90;
                class317.field5034 = class148.field2649;
            }
        } else if (class89.field1407 == 90) {
            if (class28.field378.method458(0)) {
                class153 var10 = new class153(class29.field405, class28.field378, class321.field5091, 20, !class328.field5216);
                class62.method588(var10);
                if (class32.field462 == 1) {
                    class62.method573(0.9F);
                }
                if (class32.field462 == 2) {
                    class62.method573(0.8F);
                }
                if (class32.field462 == 3) {
                    class62.method573(0.7F);
                }
                if (class32.field462 == 4) {
                    class62.method573(0.6F);
                }
                class89.field1407 = 100;
                class317.field5034 = class225.field3760;
                class215.field3618 = 70;
            } else {
                class317.field5034 = class120.field2085 + class28.field378.method440((byte) 11) + "%";
                class215.field3618 = 70;
            }
        } else if (class89.field1407 == 100) {
            if (class296.method2021(class321.field5091, -1)) {
                class89.field1407 = 110;
            }
        } else if (class89.field1407 == 110) {
            class11.field135 = new class203();
            class85.field1369.method551((byte) 81, class11.field135, 10);
            class317.field5034 = class225.field3772;
            class215.field3618 = 75;
            class89.field1407 = 120;
        } else if (class89.field1407 == 120) {
            if (class26.field366.method435(arg0 ^ 0xFFFFE3DA, "", "huffman")) {
                class39 var12 = new class39(class26.field366.method457("", arg0 - 80, "huffman"));
                class70.method666(-26032, var12);
                class215.field3618 = 80;
                class317.field5034 = class156.field2762;
                class89.field1407 = 130;
            } else {
                class317.field5034 = class193.field3239 + "0%";
                class215.field3618 = 80;
            }
        } else if (class89.field1407 == 130) {
            if (!class27.field369.method458(0)) {
                class317.field5034 = class51.field794 + class27.field369.method440((byte) 11) * 3 / 4 + "%";
                class215.field3618 = 85;
            } else if (!class24.field344.method458(0)) {
                class317.field5034 = class51.field794 + (class24.field344.method440((byte) 11) / 10 + 75) + "%";
                class215.field3618 = 85;
            } else if (!class188.field3149.method458(arg0 - 80)) {
                class317.field5034 = class51.field794 + ((class188.field3149.method440((byte) 11) / 20) + 85) + "%";
                class215.field3618 = 85;
            } else if (class166.field2895.method460("details", 94)) {
                class265.method1826(class166.field2895, class143.field2614, true);
                class65.method612(class177.field3011);
                class167.method1311(class262.field4248);
                class317.field5034 = class25.field350;
                class215.field3618 = 95;
                class89.field1407 = 135;
            } else {
                class317.field5034 = class51.field794 + ((class166.field2895.method433("details", 0) / 10) + 90) + "%";
                class215.field3618 = 85;
            }
        } else if (class89.field1407 == 135) {
            int var11 = class97.method837(true);
            if (var11 == -1) {
                class215.field3618 = 95;
                class317.field5034 = class137.field2446;
            } else if (var11 == 7 || var11 == 9) {
                this.method263("worldlistfull", false);
                class33.method302((byte) -62, 1000);
            } else if (class163.field2883) {
                class317.field5034 = class121.field2110;
                class89.field1407 = 140;
                class215.field3618 = 96;
            } else {
                this.method263("worldlistio_" + var11, false);
                class33.method302((byte) -54, 1000);
            }
        } else if (class89.field1407 == 140) {
            class197.field3371 = class27.field369.method437((byte) -33, "loginscreen");
            class92.field1446.method450((byte) -37, true, false);
            class179.field3030.method450((byte) -37, true, true);
            class321.field5091.method450((byte) -37, true, true);
            class188.field3149.method450((byte) -37, true, true);
            class26.field366.method450((byte) -37, true, true);
            class27.field369.method450((byte) -37, true, true);
            class317.field5034 = class34.field483;
            class122.field2125 = true;
            class215.field3618 = 97;
            class89.field1407 = 150;
        } else if (class89.field1407 == 150) {
            class6.method39();
            if (class222.field3705) {
                class227.field3822 = 0;
                class255.field4104 = 0;
                class30.field440 = 0;
                class69.field1133 = 0;
            }
            class222.field3705 = true;
            class88.method774(true, class85.field1369);
            class282.method1923(false, arg0 - 202, class69.field1133, -1, -1);
            class215.field3618 = 100;
            class317.field5034 = class67.field1076;
            class89.field1407 = 160;
        } else if (arg0 == 80 && class89.field1407 == 160) {
            class223.method1632((byte) -92, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 1226)
    private final void method1891(byte arg0, int arg1) {
        class288.field4592 = null;
        class247.field4009.field4650 = arg1;
        class247.field4009.field4649++;
        class17.field283 = 0;
        field4371++;
        if (arg0 != 122) {
            field4375 = -122;
        }
        class156.field2773 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1243)
    private final void method1892(byte arg0) {
        if (arg0 < 119) {
            return;
        }
        boolean var2 = class247.field4009.method1983((byte) -128);
        field4370++;
        if (!var2) {
            this.method1887(12);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Llg;)Z", line = 1265)
    public static final boolean method1893(class137 arg0) {
        if (class348.field5537) {
            if (method1894(arg0).field891 != 0) {
                return false;
            }
            if (arg0.field2490 == 0) {
                return false;
            }
        }
        return arg0.field2421;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Llg;)Llm;", line = 1280)
    public static final class57 method1894(class137 arg0) {
        class57 var1 = (class57) class215.field3606.method732(((long) arg0.field2462 << 32) + (long) arg0.field2434, true);
        return var1 == null ? arg0.field2368 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1287)
    public final void method264(int arg0) {
        method1885(true);
        class65.method628();
        class303.method2088(24799);
        class195.method1464(false);
        field4373++;
        class212.method1572((byte) -112);
        class304.method2096((byte) 124);
        class163.method1297((byte) 97);
        class25.method236((byte) 112);
        class110.method954(-128);
        class180.method1378(1);
        class29.method260(-5256);
        class43.method370();
        class215.method1589(95);
        class175.method1359(0);
        class203.method1525(arg0 + 18679);
        class156.method1245((byte) 124);
        class336.method2356(59);
        class17.method169(-12898);
        class290.method1981((byte) 123);
        class83.method755(-51);
        class247.method1737(false);
        class321.method2210(1);
        class49.method452(3135);
        class272.method1867(30396);
        class177.method1367(-5316);
        class51.method472(105);
        class278.method1909(-18179);
        class5.method33(-20952);
        class200.method1502((byte) 116);
        class137.method1121(-17866);
        class168.method1319((byte) 44);
        class205.method1533((byte) 87);
        class331.method2300(20);
        class171.method1350(91);
        class79.method730(10);
        class99.method856(30);
        class269.method1845(arg0 + 18679);
        class72.method687((byte) 117);
        class107.method906((byte) -64);
        class160.method1275((byte) -13);
        class74.method692(32);
        class293.method2003((byte) 99);
        class285.method1947(127);
        class116.method979(-72);
        class257.method1783((byte) -123);
        class97.method832((byte) -67);
        class287.method1958(true);
        class12.method118((byte) 33);
        class228.method1654(-103);
        class57.method519(arg0 + 18759);
        class320.method2197(-314671962);
        class98.method848((byte) 11);
        class152.method1195((byte) -125);
        class48.method428(28301);
        class100.method867((byte) 127);
        class288.method1963((byte) 71);
        class221.method1619(1);
        class91.method796(106);
        class75.method698(true);
        class138.method1133(false);
        class270.method1848(arg0 ^ 0xFFFFEDE2);
        class240.method1687((byte) 107);
        class339.method2388(256);
        class85.method764(5);
        class86.method767((byte) 84);
        class344.method2411(-114);
        class220.method1617((byte) 72);
        class16.method166();
        class106.method902(2048);
        class1.method2((byte) 111);
        class286.method1951((byte) -116);
        class123.method1036(9);
        class198.method1497(-124);
        class207.method1543((byte) 90);
        class9.method63();
        class353.method2457(-126);
        class307.method2116();
        class102.method875(-46);
        class183.method1405();
        class134.method1101((byte) 87);
        class103.method887();
        class13.method131(-1);
        class218.method1606(0);
        class32.method296(106);
        class151.method1189();
        class350.method2443();
        class238.method1682((byte) 102);
        class204.method1530((byte) 18);
        class69.method662(1);
        class250.method1753(-23115);
        class323.method2230();
        class332.method2306(arg0 ^ 0xFFFFB709);
        class68.method657(-9);
        class117.method999();
        class8.method60(false);
        class90.method787(1);
        class209.method1555((byte) -19);
        class61.method567();
        class31.method288(true);
        class80.method739(0);
        class179.method1377(0);
        class7.method46((byte) 93);
        class47.method408();
        class300.method2072(arg0 ^ 0x43A6);
        class128.method1072(false);
        class341.method2397(true);
        class354.method2465(-1);
        class28.method252(-128);
        class35.method313(arg0 ^ 0xFFFFBFAC);
        class67.method646(5);
        class166.method1306(arg0 ^ 0xFFFFB761);
        class334.method2309(0);
        class271.method1852((byte) 124);
        class346.method2427((byte) 127);
        class158.method1266((byte) 80);
        class213.method1577(0);
        class295.method2015(-19690);
        class167.method1313();
        class322.method2216((byte) 102);
        class184.method1422(103);
        class70.method671(91);
        class277.method1903((byte) -92);
        class89.method779(10);
        class56.method501(-117);
        class196.method1485();
        class127.method1062((byte) 3);
        class351.method2449(2048);
        class114.method970(4);
        class92.method801(arg0 + 18679);
        class162.method1292(arg0 + 18678);
        class153.method1223(0);
        class78.method716(118);
        class283.method1932(14);
        class194.method1461(-121);
        class208.method1545();
        class62.method568();
        class39.method334(119);
        class34.method308(arg0 + 18680);
        class279.method1911(47);
        class147.method1171(-21789);
        class20.method201(false);
        class37.method325(false);
        class6.method40();
        class36.method321((byte) 103);
        class326.method2270();
        class243.method1701(33);
        class178.method1371((byte) 67);
        class94.method811(-129);
        class258.method1790(21908);
        class104.method893(-1);
        class337.method2382();
        class241.method1692(arg0 + 18674);
        class38.method329((byte) -70);
        class297.method2028(-85);
        class44.method395((byte) -128);
        class112.method960((byte) -88);
        class95.method817(true);
        class192.method1451();
        class222.method1625((byte) -100);
        class211.method1569(false);
        class84.method761(false);
        class312.method2154();
        class245.method1717();
        class14.method138();
        class314.method2164();
        class50.method461(arg0 ^ 0xFFFFB709);
        class148.method1176((byte) -4);
        class19.method193();
        class169.method1324();
        class3.method13();
        class21.method205(0);
        class347.method2432((byte) 74);
        class181.method1380(2333);
        class132.method1084((byte) 103);
        class30.method279((byte) -57);
        class66.method638((byte) -79);
        class261.method1806(-10000001);
        class262.method1810(false);
        class88.method776(27133);
        class2.method8();
        class146.method1166(arg0 + 18660);
        class199.method1498((byte) 80);
        class139.method1136(-118);
        class64.method602(-2282);
        class219.method1608(arg0 ^ 0x48F4);
        class316.method2173(false);
        class310.method2149(true);
        class255.method1776(arg0 ^ 0xFFFFB4E1);
        class121.method1027((byte) -10);
        class71.method678((byte) 86);
        class125.method1042((byte) 80);
        class234.method1674(true);
        class227.method1649(0);
        class142.method1150(2042);
        class254.method1775(arg0 + 12668);
        class356.method2470((byte) 65);
        class24.method230(false);
        class318.method2187((byte) -126);
        class155.method1243(24);
        class226.method1643(0);
        class266.method1834(-1);
        class292.method1996(-48);
        class210.method1563((byte) 115);
        class302.method2084();
        class225.method1639(arg0 + 18695);
        class113.method962(-116);
        class191.method1446(1);
        class133.method1091(-50);
        class159.method1269(true);
        class311.method2153(-1003);
        class149.method1181();
        class55.method498();
        class190.method1441(3);
        class119.method1014(98);
        class352.method2454(19736);
        class15.method153(11095);
        class115.method974();
        class87.method771();
        class26.method240(arg0 + 18679);
        class109.method950((byte) -49);
        class164.method1300();
        class144.method1160((byte) 32);
        class63.method591();
        class54.method492();
        class176.method1361(31590);
        class284.method1936((byte) -113);
        class289.method1967((byte) -77);
        class313.method2160(127);
        class342.method2403(-113);
        class202.method1523(0);
        class201.method1517(126);
        class328.method2277(false);
        class93.method803((byte) -70);
        class246.method1729(arg0 + 18584);
        class329.method2283(0);
        class223.method1626(arg0 ^ 0x996A1BAE);
        class154.method1239(0);
        class27.method247(0);
        class291.method1992(-104);
        class296.method2018(2);
        class349.method2438(8);
        class265.method1828((byte) -17);
        class170.method1344(50);
        class214.method1583(-87);
        class189.method1438(4);
        class259.method1797((byte) 101);
        class52.method476(8941);
        class248.method1744((byte) 104);
        class233.method1672(true);
        class124.method1038((byte) 85);
        class298.method2029((byte) -24);
        class143.method1152((byte) 84);
        class188.method1433(-114);
        class253.method1759(6);
        class140.method1138(true);
        class161.method1284((byte) 120);
        class172.method1353(false);
        class105.method900(2);
        class129.method1074(false);
        class135.method1110((byte) -9);
        class122.method1030(1763);
        class11.method112(false);
        class33.method301(-89);
        class131.method1081(4096);
        class242.method1697(3);
        class126.method1053(20956);
        class276.method1901(false);
        class224.method1636(false);
        class193.method1452((byte) -128);
        class141.method1143(-2);
        class40.method336(arg0 + 26295);
        class264.method1818((byte) -27);
        class120.method1022(0);
        class58.method527(26);
        class108.method946(4985);
        class348.method2435((byte) 57);
        class317.method2181(arg0 ^ 0xFFFFB772);
        class338.method2387((byte) -13);
        class145.method1162(arg0 ^ arg0);
        class308.method2133((byte) 11);
        class249.method1746(-38);
        class239.method1684(-1);
        class41.method342(2047);
        class185.method1426(124);
        class230.method1659(-59);
        class81.method742(68);
        class282.method1924(9605);
        class4.method25(arg0 ^ 0x48F6);
        class324.method2252(0);
        class256.method1779(arg0 ^ 0xFFFFB709);
        class42.method345(74);
        class305.method2101(0);
        class327.method2275(true);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Llg;)Llg;", line = 1588)
    public static final class137 method1895(class137 arg0) {
        int var1 = method1894(arg0).method520(false);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class146.method1167(1169843632, arg0.field2465);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Llg;IIIIIII)V", line = 1609)
    public static final void method1896(class137[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class137 var9 = arg0[var8];
            if (var9 != null && var9.field2465 == arg1 && (!var9.field2402 || var9.field2490 == 0 || var9.field2411 || method1894(var9).field891 != 0 || class272.field4343 == var9 || var9.field2386 == 1338) && (!var9.field2402 || !method1893(var9))) {
                int var10 = var9.field2456 + arg6;
                int var11 = var9.field2444 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2490 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2533 + var10;
                    int var17 = var9.field2515 + var11;
                    if (var9.field2490 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class204.field3473 == var9) {
                    class212.field3576 = true;
                    class50.field779 = var10;
                    class327.field5202 = var11;
                }
                if (!var9.field2402 || var12 < var14 && var13 < var15) {
                    if (var9.field2490 == 0) {
                        if (!var9.field2402 && method1893(var9) && class144.field2627 != var9) {
                            continue;
                        }
                        if (var9.field2470 && class284.field4508 >= var12 && class258.field4182 >= var13 && class284.field4508 < var14 && class258.field4182 < var15) {
                            for (class258 var18 = (class258) class311.field4920.method2297(14204); var18 != null; var18 = (class258) class311.field4920.method2291(66)) {
                                if (var18.field4179) {
                                    var18.method2195(-1);
                                    var18.field4168.field2520 = false;
                                }
                            }
                            if (class42.field617 == 0) {
                                class204.field3473 = null;
                                class272.field4343 = null;
                            }
                            class153.field2719 = 0;
                        }
                    }
                    if (var9.field2402) {
                        boolean var19;
                        if (class284.field4508 >= var12 && class258.field4182 >= var13 && class284.field4508 < var14 && class258.field4182 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class204.field3467 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class284.field4509 == 1 && class218.field3635 >= var12 && class226.field3812 >= var13 && class218.field3635 < var14 && class226.field3812 < var15) {
                            var21 = true;
                        }
                        if (var9.field2543 != null) {
                            for (int var22 = 0; var22 < var9.field2543.length; var22++) {
                                if (class97.field1572[var9.field2543[var22]]) {
                                    if (var9.field2409 == null || class181.field3045 >= var9.field2409[var22]) {
                                        byte var23 = var9.field2438[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class97.field1572[86] && !class97.field1572[82] && !class97.field1572[81]) && ((var23 & 0x2) == 0 || class97.field1572[86]) && ((var23 & 0x1) == 0 || class97.field1572[82]) && ((var23 & 0x4) == 0 || class97.field1572[81])) {
                                            class249.method1751(var22 + 1, -1, "", 89, var9.field2462);
                                            int var24 = var9.field2383[var22];
                                            if (var9.field2409 == null) {
                                                var9.field2409 = new int[var9.field2543.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2409[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2409[var22] = class181.field3045 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2409 != null) {
                                    var9.field2409[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class153.method1228(2, class226.field3812 - var11, class218.field3635 - var10, var9);
                        }
                        if (class204.field3473 != null && class204.field3473 != var9 && var19 && method1894(var9).method508(true)) {
                            class240.field3920 = var9;
                        }
                        if (class272.field4343 == var9) {
                            class332.field5288 = true;
                            class317.field5030 = var10;
                            class228.field3831 = var11;
                        }
                        if (var9.field2411 || var9.field2386 != 0) {
                            if (var19 && class99.field1612 != 0 && var9.field2394 != null) {
                                class258 var25 = new class258();
                                var25.field4179 = true;
                                var25.field4168 = var9;
                                var25.field4169 = class99.field1612;
                                var25.field4173 = var9.field2394;
                                class311.field4920.method2303((byte) -124, var25);
                            }
                            if (class204.field3473 != null || class329.field5242 != null || class207.field3515 || var9.field2386 != 1400 && class153.field2719 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2386 != 0) {
                                if (var9.field2386 == 1337) {
                                    class285.field4524 = var9;
                                    continue;
                                }
                                if (var9.field2386 == 1338) {
                                    if (var21) {
                                        class105.field1759 = class218.field3635 - var10;
                                        class119.field2069 = class226.field3812 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2386 == 1400) {
                                    class138.field2552 = var9;
                                    if (var21) {
                                        if (class97.field1572[82] && class158.field2787 > 0) {
                                            int var26 = (int) ((double) (class218.field3635 - var10 - var9.field2533 / 2) * 2.0D / (double) class185.field3143);
                                            int var27 = (int) ((double) (class226.field3812 - var11 - var9.field2515 / 2) * 2.0D / (double) class185.field3143);
                                            int var28 = class95.field1483 + var26;
                                            int var29 = class318.field5042 + var27;
                                            int var30 = class341.field5444 + var28;
                                            int var31 = class304.field4825 + class259.field4201 - var29 - 1;
                                            class325 var32 = class152.method1197((byte) 123);
                                            int[] var33 = var32.method2254(var30, 3, var31);
                                            if (var33 != null) {
                                                class320.method2196(var33[0], var33[1], 0, var33[2]);
                                                class271.method1853(-108);
                                            }
                                            continue;
                                        }
                                        class153.field2719 = 1;
                                        class291.field4653 = class284.field4508;
                                        class242.field3958 = class258.field4182;
                                        continue;
                                    }
                                    if (var20 && class153.field2719 > 0) {
                                        if (class153.field2719 == 1 && (class291.field4653 != class284.field4508 || class258.field4182 != class242.field3958)) {
                                            class80.field1317 = class95.field1483;
                                            class141.field2597 = class318.field5042;
                                            class153.field2719 = 2;
                                        }
                                        if (class153.field2719 == 2) {
                                            class70.method667((int) ((double) (class291.field4653 - class284.field4508) * 2.0D / (double) class305.field4839) + class80.field1317, (byte) 67);
                                            class296.method2019((int) ((double) (class242.field3958 - class258.field4182) * 2.0D / (double) class305.field4839) + class141.field2597, (byte) 112);
                                        }
                                        continue;
                                    }
                                    class153.field2719 = 0;
                                    continue;
                                }
                                if (var9.field2386 == 1401) {
                                    if (var20) {
                                        class249.method1748(class258.field4182 - var11, var9.field2533, (byte) 93, var9.field2515, class284.field4508 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2386 == 1402) {
                                    if (!class43.field680) {
                                        class258.method1793(var9, 0);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field2377 && var21) {
                                var9.field2377 = true;
                                if (var9.field2539 != null) {
                                    class258 var34 = new class258();
                                    var34.field4179 = true;
                                    var34.field4168 = var9;
                                    var34.field4181 = class218.field3635 - var10;
                                    var34.field4169 = class226.field3812 - var11;
                                    var34.field4173 = var9.field2539;
                                    class311.field4920.method2303((byte) -124, var34);
                                }
                            }
                            if (var9.field2377 && var20 && var9.field2512 != null) {
                                class258 var35 = new class258();
                                var35.field4179 = true;
                                var35.field4168 = var9;
                                var35.field4181 = class284.field4508 - var10;
                                var35.field4169 = class258.field4182 - var11;
                                var35.field4173 = var9.field2512;
                                class311.field4920.method2303((byte) -124, var35);
                            }
                            if (var9.field2377 && !var20) {
                                var9.field2377 = false;
                                if (var9.field2415 != null) {
                                    class258 var36 = new class258();
                                    var36.field4179 = true;
                                    var36.field4168 = var9;
                                    var36.field4181 = class284.field4508 - var10;
                                    var36.field4169 = class258.field4182 - var11;
                                    var36.field4173 = var9.field2415;
                                    class253.field4076.method2303((byte) -124, var36);
                                }
                            }
                            if (var20 && var9.field2436 != null) {
                                class258 var37 = new class258();
                                var37.field4179 = true;
                                var37.field4168 = var9;
                                var37.field4181 = class284.field4508 - var10;
                                var37.field4169 = class258.field4182 - var11;
                                var37.field4173 = var9.field2436;
                                class311.field4920.method2303((byte) -124, var37);
                            }
                            if (!var9.field2520 && var19) {
                                var9.field2520 = true;
                                if (var9.field2474 != null) {
                                    class258 var38 = new class258();
                                    var38.field4179 = true;
                                    var38.field4168 = var9;
                                    var38.field4181 = class284.field4508 - var10;
                                    var38.field4169 = class258.field4182 - var11;
                                    var38.field4173 = var9.field2474;
                                    class311.field4920.method2303((byte) -124, var38);
                                }
                            }
                            if (var9.field2520 && var19 && var9.field2372 != null) {
                                class258 var39 = new class258();
                                var39.field4179 = true;
                                var39.field4168 = var9;
                                var39.field4181 = class284.field4508 - var10;
                                var39.field4169 = class258.field4182 - var11;
                                var39.field4173 = var9.field2372;
                                class311.field4920.method2303((byte) -124, var39);
                            }
                            if (var9.field2520 && !var19) {
                                var9.field2520 = false;
                                if (var9.field2418 != null) {
                                    class258 var40 = new class258();
                                    var40.field4179 = true;
                                    var40.field4168 = var9;
                                    var40.field4181 = class284.field4508 - var10;
                                    var40.field4169 = class258.field4182 - var11;
                                    var40.field4173 = var9.field2418;
                                    class253.field4076.method2303((byte) -124, var40);
                                }
                            }
                            if (var9.field2501 != null) {
                                class258 var41 = new class258();
                                var41.field4168 = var9;
                                var41.field4173 = var9.field2501;
                                class71.field1195.method2303((byte) -124, var41);
                            }
                            if (var9.field2528 != null && class330.field5253 > var9.field2457) {
                                if (var9.field2405 == null || class330.field5253 - var9.field2457 > 32) {
                                    class258 var46 = new class258();
                                    var46.field4168 = var9;
                                    var46.field4173 = var9.field2528;
                                    class311.field4920.method2303((byte) -124, var46);
                                } else {
                                    label575: for (int var42 = var9.field2457; var42 < class330.field5253; var42++) {
                                        int var43 = class190.field3187[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2405.length; var44++) {
                                            if (var9.field2405[var44] == var43) {
                                                class258 var45 = new class258();
                                                var45.field4168 = var9;
                                                var45.field4173 = var9.field2528;
                                                class311.field4920.method2303((byte) -124, var45);
                                                break label575;
                                            }
                                        }
                                    }
                                }
                                var9.field2457 = class330.field5253;
                            }
                            if (var9.field2472 != null && class102.field1641 > var9.field2392) {
                                if (var9.field2419 == null || class102.field1641 - var9.field2392 > 32) {
                                    class258 var51 = new class258();
                                    var51.field4168 = var9;
                                    var51.field4173 = var9.field2472;
                                    class311.field4920.method2303((byte) -124, var51);
                                } else {
                                    label551: for (int var47 = var9.field2392; var47 < class102.field1641; var47++) {
                                        int var48 = class259.field4203[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2419.length; var49++) {
                                            if (var9.field2419[var49] == var48) {
                                                class258 var50 = new class258();
                                                var50.field4168 = var9;
                                                var50.field4173 = var9.field2472;
                                                class311.field4920.method2303((byte) -124, var50);
                                                break label551;
                                            }
                                        }
                                    }
                                }
                                var9.field2392 = class102.field1641;
                            }
                            if (var9.field2506 != null && class155.field2749 > var9.field2485) {
                                if (var9.field2390 == null || class155.field2749 - var9.field2485 > 32) {
                                    class258 var56 = new class258();
                                    var56.field4168 = var9;
                                    var56.field4173 = var9.field2506;
                                    class311.field4920.method2303((byte) -124, var56);
                                } else {
                                    label527: for (int var52 = var9.field2485; var52 < class155.field2749; var52++) {
                                        int var53 = class166.field2897[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2390.length; var54++) {
                                            if (var9.field2390[var54] == var53) {
                                                class258 var55 = new class258();
                                                var55.field4168 = var9;
                                                var55.field4173 = var9.field2506;
                                                class311.field4920.method2303((byte) -124, var55);
                                                break label527;
                                            }
                                        }
                                    }
                                }
                                var9.field2485 = class155.field2749;
                            }
                            if (var9.field2507 != null && class194.field3251 > var9.field2441) {
                                if (var9.field2524 == null || class194.field3251 - var9.field2441 > 32) {
                                    class258 var61 = new class258();
                                    var61.field4168 = var9;
                                    var61.field4173 = var9.field2507;
                                    class311.field4920.method2303((byte) -124, var61);
                                } else {
                                    label503: for (int var57 = var9.field2441; var57 < class194.field3251; var57++) {
                                        int var58 = class239.field3913[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2524.length; var59++) {
                                            if (var9.field2524[var59] == var58) {
                                                class258 var60 = new class258();
                                                var60.field4168 = var9;
                                                var60.field4173 = var9.field2507;
                                                class311.field4920.method2303((byte) -124, var60);
                                                break label503;
                                            }
                                        }
                                    }
                                }
                                var9.field2441 = class194.field3251;
                            }
                            if (var9.field2509 != null && class248.field4034 > var9.field2499) {
                                if (var9.field2376 == null || class248.field4034 - var9.field2499 > 32) {
                                    class258 var66 = new class258();
                                    var66.field4168 = var9;
                                    var66.field4173 = var9.field2509;
                                    class311.field4920.method2303((byte) -124, var66);
                                } else {
                                    label479: for (int var62 = var9.field2499; var62 < class248.field4034; var62++) {
                                        int var63 = class162.field2868[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2376.length; var64++) {
                                            if (var9.field2376[var64] == var63) {
                                                class258 var65 = new class258();
                                                var65.field4168 = var9;
                                                var65.field4173 = var9.field2509;
                                                class311.field4920.method2303((byte) -124, var65);
                                                break label479;
                                            }
                                        }
                                    }
                                }
                                var9.field2499 = class248.field4034;
                            }
                            if (class49.field766 > var9.field2452 && var9.field2484 != null) {
                                class258 var67 = new class258();
                                var67.field4168 = var9;
                                var67.field4173 = var9.field2484;
                                class311.field4920.method2303((byte) -124, var67);
                            }
                            if (class51.field809 > var9.field2452 && var9.field2422 != null) {
                                class258 var68 = new class258();
                                var68.field4168 = var9;
                                var68.field4173 = var9.field2422;
                                class311.field4920.method2303((byte) -124, var68);
                            }
                            if (class214.field3599 > var9.field2452 && var9.field2476 != null) {
                                class258 var69 = new class258();
                                var69.field4168 = var9;
                                var69.field4173 = var9.field2476;
                                class311.field4920.method2303((byte) -124, var69);
                            }
                            if (class194.field3253 > var9.field2452 && var9.field2459 != null) {
                                class258 var70 = new class258();
                                var70.field4168 = var9;
                                var70.field4173 = var9.field2459;
                                class311.field4920.method2303((byte) -124, var70);
                            }
                            if (class110.field1867 > var9.field2452 && var9.field2546 != null) {
                                class258 var71 = new class258();
                                var71.field4168 = var9;
                                var71.field4173 = var9.field2546;
                                class311.field4920.method2303((byte) -124, var71);
                            }
                            var9.field2452 = class99.field1606;
                            if (var9.field2451 != null) {
                                for (int var72 = 0; var72 < class116.field2028; var72++) {
                                    class258 var73 = new class258();
                                    var73.field4168 = var9;
                                    var73.field4184 = class210.field3555[var72];
                                    var73.field4180 = class258.field4170[var72];
                                    var73.field4173 = var9.field2451;
                                    class311.field4920.method2303((byte) -124, var73);
                                }
                            }
                            if (class189.field3177 && var9.field2496 != null) {
                                class258 var74 = new class258();
                                var74.field4168 = var9;
                                var74.field4173 = var9.field2496;
                                class311.field4920.method2303((byte) -124, var74);
                            }
                        }
                    }
                    if (!var9.field2402 && class204.field3473 == null && class329.field5242 == null && !class207.field3515) {
                        if ((var9.field2481 >= 0 || var9.field2447 != 0) && class284.field4508 >= var12 && class258.field4182 >= var13 && class284.field4508 < var14 && class258.field4182 < var15) {
                            if (var9.field2481 >= 0) {
                                class144.field2627 = arg0[var9.field2481];
                            } else {
                                class144.field2627 = var9;
                            }
                        }
                        if (var9.field2490 == 8 && class284.field4508 >= var12 && class258.field4182 >= var13 && class284.field4508 < var14 && class258.field4182 < var15) {
                            class85.field1364 = var9;
                        }
                        if (var9.field2497 > var9.field2515) {
                            class262.method1807(var9.field2515, -123, class258.field4182, var9.field2497, var9.field2533 + var10, var9, var11, class284.field4508);
                        }
                    }
                    if (var9.field2490 == 0) {
                        method1896(arg0, var9.field2462, var12, var13, var14, var15, var10 - var9.field2477, var11 - var9.field2531);
                        if (var9.field2453 != null) {
                            method1896(var9.field2453, var9.field2462, var12, var13, var14, var15, var10 - var9.field2477, var11 - var9.field2531);
                        }
                        class228 var75 = (class228) class172.field2972.method732((long) var9.field2462, true);
                        if (var75 != null) {
                            class293.method2009(var12, var11, var13, var15, (byte) 123, var10, var14, var75.field3833);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2378)
    public final void method265(int arg0) {
        field4374++;
        if (class88.field1397 == 1000) {
            return;
        }
        long var2 = class120.method1018(true) / 1000000L - class37.field536;
        class37.field536 = class120.method1018(true) / 1000000L;
        boolean var4 = class305.method2099((byte) -90);
        if (var4 && class185.field3137 && class135.field2362 != null) {
            class135.field2362.method1271(false);
        }
        if ((class88.field1397 == 30 || class88.field1397 == 10) && (class175.field2985 || class80.field1319 != 0L && class306.method2102(-289) > class80.field1319)) {
            class282.method1923(class175.field2985, arg0 ^ 0xFFFFFF88, class209.method1554(arg0 - 122), class310.field4913, class318.field5056);
        }
        if (class120.field2076 == null) {
            Container var5;
            if (class120.field2076 != null) {
                var5 = class120.field2076;
            } else if (class271.field4321 == null) {
                var5 = class85.field1369.field910;
            } else {
                var5 = class271.field4321;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class271.field4321 == var5) {
                Insets var8 = class271.field4321.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class56.field864 != var6 || class213.field3589 != var7) {
                if (class59.field913.startsWith("mac")) {
                    class213.field3589 = var7;
                    class56.field864 = var6;
                } else {
                    class132.method1087(-103);
                }
                class80.field1319 = class306.method2102(-289) + 500L;
            }
        }
        if (class120.field2076 != null && !class287.field4575 && (class88.field1397 == 30 || class88.field1397 == 10)) {
            class282.method1923(false, -80, class69.field1133, -1, -1);
        }
        boolean var9 = false;
        if (class57.field890) {
            var9 = true;
            class57.field890 = false;
        }
        if (var9) {
            class324.method2250(1);
        }
        if (class43.field680) {
            for (int var10 = 0; var10 < 100; var10++) {
                class272.field4337[var10] = true;
            }
        }
        if (class88.field1397 == arg0) {
            class127.method1064(var9, class215.field3618, -20634, class317.field5034, (Color) null);
        } else if (class88.field1397 == 5) {
            class27.method246(false, class177.field3014, -151);
        } else if (class88.field1397 == 10) {
            class5.method37(-24604);
        } else if (class88.field1397 == 25 || class88.field1397 == 28) {
            if (class28.field381 == 1) {
                if (class84.field1352 < class329.field5239) {
                    class84.field1352 = class329.field5239;
                }
                int var12 = (class84.field1352 - class329.field5239) * 50 / class84.field1352;
                class120.method1019(23516, class30.field437 + "<br>(" + var12 + "%)", false);
            } else if (class28.field381 == 2) {
                if (class288.field4602 > class21.field323) {
                    class21.field323 = class288.field4602;
                }
                int var11 = (class21.field323 - class288.field4602) * 50 / class21.field323 + 50;
                class120.method1019(23516, class30.field437 + "<br>(" + var11 + "%)", false);
            } else {
                class120.method1019(arg0 + 23516, class30.field437, false);
            }
        } else if (class88.field1397 == 30) {
            class60.method556(var2, false);
        } else if (class88.field1397 == 40) {
            class120.method1019(23516, class15.field235 + "<br>" + class89.field1410, false);
        }
        if (class43.field680 && class88.field1397 != 0) {
            class43.method385();
            for (int var19 = 0; var19 < class215.field3602; var19++) {
                class224.field3746[var19] = false;
            }
        } else if ((class88.field1397 == 30 || class88.field1397 == 10) && class324.field5157 == 0 && !var9) {
            try {
                Graphics var13 = class42.field616.getGraphics();
                for (int var14 = 0; var14 < class215.field3602; var14++) {
                    if (class224.field3746[var14]) {
                        class256.field4119.method957(class15.field225[var14], var13, class213.field3579[var14], true, class15.field231[var14], class328.field5227[var14]);
                        class224.field3746[var14] = false;
                    }
                }
            } catch (Exception var21) {
                class42.field616.repaint();
            }
        } else if (class88.field1397 != 0) {
            try {
                Graphics var16 = class42.field616.getGraphics();
                class256.field4119.method959(var16, 0, 0, (byte) 71);
                for (int var17 = 0; var17 < class215.field3602; var17++) {
                    class224.field3746[var17] = false;
                }
            } catch (Exception var20) {
                class42.field616.repaint();
            }
        }
        if (class122.field2125) {
            class162.method1294((byte) 58);
        }
        if (class222.field3705 && class88.field1397 == 10 && class311.field4933 != -1) {
            class222.field3705 = false;
            class88.method774(true, class85.field1369);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2602)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class148.method1177((byte) -64, "argument count");
            }
            class248.field4020 = Integer.parseInt(arg0[0]);
            class246.field3988 = 2;
            if (arg0[1].equals("live")) {
                class331.field5280 = 0;
            } else if (arg0[1].equals("rc")) {
                class331.field5280 = 1;
            } else if (arg0[1].equals("wip")) {
                class331.field5280 = 2;
            } else {
                class148.method1177((byte) -125, "modewhat");
            }
            class255.field4109 = false;
            class5.field67 = class352.method2450(arg0[2], -6424);
            if (class5.field67 == -1) {
                if (arg0[2].equals("english")) {
                    class5.field67 = 0;
                } else if (arg0[2].equals("german")) {
                    class5.field67 = 1;
                } else {
                    class148.method1177((byte) -19, "language");
                }
            }
            class95.method815((byte) -127, class5.field67);
            class221.field3690 = false;
            class265.field4275 = false;
            if (arg0[3].equals("game0")) {
                class72.field1199 = 0;
            } else if (arg0[3].equals("game1")) {
                class72.field1199 = 1;
            } else {
                class148.method1177((byte) -53, "game");
            }
            class1.field3 = 0;
            class256.field4125 = "";
            class201.field3433 = 0;
            class277.field4405 = false;
            client var1 = new client();
            class158.field2789 = var1;
            var1.method275(1024, 768, 29, 546, true, false, class331.field5280 + 32, class72.field1199 == 1 ? "mechscape" : "runescape");
            class271.field4321.setLocation(40, 40);
        } catch (Exception var3) {
            class88.method775(var3, (String) null, true);
        }
        field4382++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 2670)
    public final void method273(byte arg0) {
        field4368++;
        if (class88.field1397 == 1000) {
            return;
        }
        class181.field3045++;
        if (arg0 != 81) {
            this.method1886((byte) -109, (byte[]) null);
        }
        if ((class181.field3045 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class354.field5586 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class112.field1874.setSeed((long) class354.field5586);
        }
        this.method1892((byte) 124);
        if (class278.field4414 != null) {
            class278.field4414.method1735((byte) 101);
        }
        class272.method1861(0);
        class215.method1587(false);
        class152.method1196(15744);
        class287.method1960(2047);
        if (class43.field680) {
            class151.method1188();
        }
        if (class211.field3564 != null) {
            int var3 = class211.field3564.method858((byte) 111);
            class99.field1612 = var3;
        }
        if (class88.field1397 == 0) {
            this.method1890(80);
            class116.method986(0);
        } else if (class88.field1397 == 5) {
            this.method1890(80);
            class116.method986(arg0 ^ 0x51);
        } else if (class88.field1397 == 25 || class88.field1397 == 28) {
            class199.method1499(104);
        }
        if (class88.field1397 == 10) {
            this.method1888(0);
            class272.method1855(true);
            class257.method1784(true);
            class303.method2090(arg0 ^ 0xFFFFFFE8);
        } else if (class88.field1397 == 30) {
            class258.method1796(20077);
        } else if (class88.field1397 == 40) {
            class303.method2090(arg0 + 43);
            if (class86.field1378 != -3) {
                if (class86.field1378 == 15) {
                    class332.method2304(85);
                } else if (class86.field1378 != 2) {
                    class344.method2408((byte) 116);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lli;", line = 2762)
    public static final class241 method1897(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4150; var4++) {
            class241 var5 = var3.field4147[var4];
            if ((var5.field3936 >> 29 & 0x3L) == 2L && var5.field3932 == arg1 && var5.field3929 == arg2) {
                class316.method2171(var5);
                return var5;
            }
        }
        return null;
    }
}
