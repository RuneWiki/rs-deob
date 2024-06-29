import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class41 {

    @OriginalMember(owner = "client!client", name = "K", descriptor = "[Z")
    public static boolean[] field2560 = new boolean[200];

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Ljd;")
    public static class85 field2568 = class221.method1499("Spieler kann nicht gefunden werden: ", (byte) -48);

    @OriginalMember(owner = "client!client", name = "I", descriptor = "Ljd;")
    public static class85 field2558 = class221.method1499("rot:", (byte) -46);

    @OriginalMember(owner = "client!client", name = "J", descriptor = "Ljd;")
    public static class85 field2559 = class221.method1499("null", (byte) -46);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Ljd;")
    public static class85 field2576 = class221.method1499("Lade Benutzeroberfl-=che )2 ", (byte) 85);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Ljd;")
    private static class85 field2577 = class221.method1499("purple:", (byte) -119);

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Ljd;")
    public static class85 field2564 = field2577;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Ljd;")
    public static class85 field2566 = field2577;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljb;)I")
    public static final int method987(class255 arg0) {
        class105 var1 = (class105) class273.field4821.method1398(1, ((long) arg0.field4479 << 32) + (long) arg0.field4418);
        return var1 == null ? arg0.field4437 : var1.field1842;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2563++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class43.method303(1);
            }
            int var1 = -1;
            class7.field78 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class133.field2312 = 0;
            } else if (arg0[1].equals("office")) {
                class133.field2312 = 1;
            } else if (arg0[1].equals("local")) {
                class133.field2312 = 2;
            } else {
                class43.method303(1);
            }
            if (arg0[2].equals("live")) {
                class45.field800 = 0;
            } else if (arg0[2].equals("rc")) {
                class45.field800 = 1;
            } else if (arg0[2].equals("wip")) {
                class45.field800 = 2;
            } else {
                class43.method303(1);
            }
            if (arg0[4].equals("free")) {
                class217.field3814 = false;
            } else if (arg0[4].equals("members")) {
                class217.field3814 = true;
            } else {
                class43.method303(1);
            }
            try {
                byte[] var2 = arg0[5].getBytes("ISO-8859-1");
                var1 = class48.method326((byte) -128, class116.method817(var2.length, var2, (byte) -39, 0));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class128.field2249 = var1;
            } else if (arg0[5].equals("english")) {
                class128.field2249 = 0;
            } else if (arg0[5].equals("german")) {
                class128.field2249 = 1;
            } else {
                class43.method303(1);
            }
            class72.method514(-92, class128.field2249);
            if (arg0[6].equals("game0")) {
                class18.field267 = 0;
            } else if (arg0[6].equals("game1")) {
                class18.field267 = 1;
            } else {
                class43.method303(1);
            }
            if (arg0.length != 8) {
                class116.field2085 = false;
            } else if (arg0[7].equals("safemode")) {
                class116.field2085 = true;
            } else {
                class43.method303(1);
            }
            class6.field70 = "127.0.0.1";
            class172.field2967 = class100.field1795;
            class245.field4191 = 0;
            client var3 = new client();
            var3.method277(503, 27, "runescape", 99, 511, class45.field800 + 32, 765);
            class167.field2882.setLocation(40, 40);
        } catch (Exception var6) {
            class201.method1379(var6, (String) null, 2552);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    private final void method988(byte arg0) {
        field2578++;
        if (arg0 > -69) {
            field2558 = null;
        }
        boolean var2 = class55.field969.method1043(0);
        if (!var2) {
            this.method995(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method989(int arg0, byte arg1) {
        class75.field1391 = null;
        class67.field1239++;
        if (arg1 >= -44) {
            return;
        }
        field2579++;
        class203.field3546 = null;
        if (class43.field751 == class239.field4128) {
            class239.field4128 = class58.field1058;
        } else {
            class239.field4128 = class43.field751;
        }
        class253.field4376 = 0;
        if (class67.field1239 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class1.field4 == 0 || class1.field4 == 5) {
                this.method273("js5connect_full", false);
                class1.field4 = 1000;
            } else {
                class168.field2902 = 3000;
            }
        } else if (class67.field1239 >= 2 && arg0 == 6) {
            this.method273("js5connect_outofdate", false);
            class1.field4 = 1000;
        } else if (class67.field1239 >= 4) {
            if (class1.field4 == 0 || class1.field4 == 5) {
                this.method273("js5connect", false);
                class1.field4 = 1000;
            } else {
                class168.field2902 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method281(byte arg0) {
        field2562++;
        if (class1.field4 == 1000) {
            return;
        }
        class151.field2555++;
        if ((class151.field2555 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class233.field4031 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class268.field4777.setSeed((long) class233.field4031);
        }
        this.method988((byte) -80);
        if (arg0 != 22) {
            field2558 = null;
        }
        if (class133.field2317 != null) {
            class133.field2317.method1407(arg0 + 65513);
        }
        class269.method1850((byte) -67);
        class21.method145(30868);
        class162.method1067((byte) -116);
        class215.method1477(arg0 - 21);
        if (class264.field4735 != null) {
            int var3 = class264.field4735.method963((byte) -114);
            class146.field2492 = var3;
        }
        if (class1.field4 == 0) {
            this.method998(0);
            class251.method1730(0);
        } else if (class1.field4 == 5) {
            this.method998(0);
            class251.method1730(arg0 - 22);
        } else if (class1.field4 == 25 || class1.field4 == 28) {
            class228.method1533(true);
        }
        if (class1.field4 == 10) {
            this.method996((byte) -101);
            class261.method1790((byte) -121);
            class185.method1274(-103);
        } else if (class1.field4 == 30) {
            class237.method1583(-5);
        } else if (class1.field4 == 40) {
            class185.method1274(-37);
            if (class205.field3580 != -3) {
                if (class205.field3580 == 15) {
                    class3.method9((byte) -70);
                } else if (class205.field3580 != 2) {
                    class206.method1409(11204);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljb;)Ljb;")
    public static final class255 method990(class255 arg0) {
        int var1 = class272.method1858((byte) -12, method987(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class72.method506(arg0.field4530, 0);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2570++;
        if (!this.method284(0)) {
            return;
        }
        class7.field78 = Integer.parseInt(this.getParameter("worldid"));
        class45.field800 = Integer.parseInt(this.getParameter("modewhat"));
        class133.field2312 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class116.field2085 = true;
        } else {
            class116.field2085 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class217.field3814 = true;
        } else {
            class217.field3814 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null) {
            try {
                class128.field2249 = Integer.parseInt(var3);
            } catch (Exception var11) {
            }
        }
        class72.method514(-95, class128.field2249);
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class18.field267 = 1;
        } else {
            class18.field267 = 0;
        }
        try {
            class268.field4765 = Integer.parseInt(this.getParameter("js"));
            class246.field4205 = Integer.parseInt(this.getParameter("plug"));
            class245.field4191 = Integer.parseInt(this.getParameter("affid"));
            class223.field3912 = Integer.parseInt(this.getParameter("haveie6")) == 1;
        } catch (Exception var10) {
        }
        class172.field2967 = class254.field4384.method592(29698, this);
        if (class172.field2967 == null) {
            class172.field2967 = class100.field1795;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class85 var7 = class116.method817(var6.length, var6, (byte) -39, 0);
            boolean var8 = class108.method750(-130, var7);
            if (var8) {
                class232.field4019 = var7;
            }
        }
        class6.field70 = this.getCodeBase().getHost();
        this.method275(511, 765, class45.field800 + 32, 503, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljb;IIIIIII)V")
    public static final void method991(class255[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class255 var9 = arg0[var8];
            if (var9 != null && var9.field4530 == arg1 && (!var9.field4459 || var9.field4436 == 0 || var9.field4434 || method987(var9) != 0 || class153.field2645 == var9 || var9.field4519 == 1338) && (!var9.field4459 || !method994(var9))) {
                int var10 = var9.field4559 + arg6;
                int var11 = var9.field4554 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4436 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4513 + var10;
                    int var17 = var9.field4482 + var11;
                    if (var9.field4436 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class177.field3035 == var9) {
                    class22.field305 = true;
                    class134.field2338 = var10;
                    class206.field3608 = var11;
                }
                if (!var9.field4459 || var12 < var14 && var13 < var15) {
                    if (var9.field4436 == 0) {
                        if (!var9.field4459 && method994(var9) && class115.field2057 != var9) {
                            continue;
                        }
                        if (var9.field4433 && class245.field4195 >= var12 && class106.field1851 >= var13 && class245.field4195 < var14 && class106.field1851 < var15) {
                            for (class5 var18 = (class5) class202.field3522.method110(64); var18 != null; var18 = (class5) class202.field3522.method117((byte) 102)) {
                                if (var18.field53) {
                                    var18.method1753(137);
                                }
                            }
                            if (class30.field454 == 0) {
                                class177.field3035 = null;
                                class153.field2645 = null;
                            }
                            class153.field2635 = false;
                        }
                    }
                    if (var9.field4459) {
                        boolean var19;
                        if (class245.field4195 >= var12 && class106.field1851 >= var13 && class245.field4195 < var14 && class106.field1851 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class217.field3806 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class75.field1393 == 1 && class99.field1784 >= var12 && class175.field3008 >= var13 && class99.field1784 < var14 && class175.field3008 < var15) {
                            var21 = true;
                        }
                        if (class35.field542 > 0 && var9.field4457 != null) {
                            for (int var22 = 0; var22 < var9.field4457.length; var22++) {
                                for (int var23 = 0; var23 < class35.field542; var23++) {
                                    int var24 = var9.field4457[var22] & 0xFF;
                                    if (class97.field1760[var23] == var24) {
                                        if (var9.field4470 != null) {
                                            byte var25 = var9.field4470[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class105.field1843[86] || (var25 & 0x1) != 0 && !class105.field1843[82] || (var25 & 0x4) != 0 && !class105.field1843[81])) {
                                                continue;
                                            }
                                        }
                                        class87.method645(0, class100.field1795, -1, var9.field4479, var22 + 1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class240.method1634(class99.field1784 - var10, class175.field3008 - var11, var9, (byte) -128);
                        }
                        if (class177.field3035 != null && class177.field3035 != var9 && var19 && class213.method1463(-96, method987(var9))) {
                            class33.field501 = var9;
                        }
                        if (class153.field2645 == var9) {
                            class239.field4115 = true;
                            class202.field3520 = var10;
                            class146.field2490 = var11;
                        }
                        if (var9.field4434 || var9.field4519 != 0) {
                            if (var19 && class146.field2492 != 0 && var9.field4398 != null) {
                                class5 var26 = new class5();
                                var26.field53 = true;
                                var26.field58 = var9;
                                var26.field62 = class146.field2492;
                                var26.field67 = var9.field4398;
                                class202.field3522.method116((byte) -121, var26);
                            }
                            if (class177.field3035 != null || class204.field3576 != null || class52.field902 || var9.field4519 != 1400 && class153.field2635) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4519 != 0) {
                                if (var9.field4519 == 1337) {
                                    class27.field420 = var9;
                                    class16.method120((byte) -53, var9);
                                    continue;
                                }
                                if (var9.field4519 == 1338) {
                                    if (var21) {
                                        class184.method1273(class175.field3008 - var11, 0, class99.field1784 - var10, var9);
                                    }
                                    continue;
                                }
                                if (var9.field4519 == 1400) {
                                    class13.field202 = var9;
                                    if (var21) {
                                        if (class105.field1843[82] && class63.field1174 > 0) {
                                            int var27 = (int) ((double) (class99.field1784 - var10 - var9.field4513 / 2) * 2.0D / (double) class99.field1779);
                                            int var28 = (int) ((double) (class175.field3008 - var11 - var9.field4482 / 2) * 2.0D / (double) class99.field1779);
                                            int var29 = class6.field75 + var27;
                                            int var30 = class168.field2901 + var28;
                                            int var31 = class21.field303 + var29;
                                            int var32 = class79.field1458 + class196.field3371 - var30 - 1;
                                            class208.method1424((byte) 65, var32, 0, var31);
                                            class232.method1549((byte) 54);
                                            continue;
                                        }
                                        class153.field2635 = true;
                                        class16.field233 = class245.field4195;
                                        class244.field4177 = class106.field1851;
                                        class52.field898 = class6.field75;
                                        class52.field901 = class168.field2901;
                                        continue;
                                    }
                                    if (var20 && class153.field2635) {
                                        class102.method706(-1, (int) ((double) (class16.field233 - class245.field4195) * 2.0D / (double) class11.field165) + class52.field898);
                                        class153.method1008((int) ((double) (class244.field4177 - class106.field1851) * 2.0D / (double) class11.field165) + class52.field901, 28887);
                                        continue;
                                    }
                                    class153.field2635 = false;
                                    continue;
                                }
                                if (var9.field4519 == 1401) {
                                    if (var20) {
                                        class28.method201(class245.field4195 - var10, class106.field1851 - var11, -1, var9.field4513, var9.field4482);
                                    }
                                    continue;
                                }
                                if (var9.field4519 == 1402) {
                                    class16.method120((byte) -96, var9);
                                    continue;
                                }
                                if (var9.field4519 == 1404) {
                                    class16.method120((byte) -12, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4515 && var21) {
                                var9.field4515 = true;
                                if (var9.field4516 != null) {
                                    class5 var33 = new class5();
                                    var33.field53 = true;
                                    var33.field58 = var9;
                                    var33.field56 = class99.field1784 - var10;
                                    var33.field62 = class175.field3008 - var11;
                                    var33.field67 = var9.field4516;
                                    class202.field3522.method116((byte) -121, var33);
                                }
                            }
                            if (var9.field4515 && var20 && var9.field4406 != null) {
                                class5 var34 = new class5();
                                var34.field53 = true;
                                var34.field58 = var9;
                                var34.field56 = class245.field4195 - var10;
                                var34.field62 = class106.field1851 - var11;
                                var34.field67 = var9.field4406;
                                class202.field3522.method116((byte) -121, var34);
                            }
                            if (var9.field4515 && !var20) {
                                var9.field4515 = false;
                                if (var9.field4505 != null) {
                                    class5 var35 = new class5();
                                    var35.field53 = true;
                                    var35.field58 = var9;
                                    var35.field56 = class245.field4195 - var10;
                                    var35.field62 = class106.field1851 - var11;
                                    var35.field67 = var9.field4505;
                                    class111.field1935.method116((byte) -121, var35);
                                }
                            }
                            if (var20 && var9.field4399 != null) {
                                class5 var36 = new class5();
                                var36.field53 = true;
                                var36.field58 = var9;
                                var36.field56 = class245.field4195 - var10;
                                var36.field62 = class106.field1851 - var11;
                                var36.field67 = var9.field4399;
                                class202.field3522.method116((byte) -121, var36);
                            }
                            if (!var9.field4502 && var19) {
                                var9.field4502 = true;
                                if (var9.field4449 != null) {
                                    class5 var37 = new class5();
                                    var37.field53 = true;
                                    var37.field58 = var9;
                                    var37.field56 = class245.field4195 - var10;
                                    var37.field62 = class106.field1851 - var11;
                                    var37.field67 = var9.field4449;
                                    class202.field3522.method116((byte) -121, var37);
                                }
                            }
                            if (var9.field4502 && var19 && var9.field4493 != null) {
                                class5 var38 = new class5();
                                var38.field53 = true;
                                var38.field58 = var9;
                                var38.field56 = class245.field4195 - var10;
                                var38.field62 = class106.field1851 - var11;
                                var38.field67 = var9.field4493;
                                class202.field3522.method116((byte) -121, var38);
                            }
                            if (var9.field4502 && !var19) {
                                var9.field4502 = false;
                                if (var9.field4411 != null) {
                                    class5 var39 = new class5();
                                    var39.field53 = true;
                                    var39.field58 = var9;
                                    var39.field56 = class245.field4195 - var10;
                                    var39.field62 = class106.field1851 - var11;
                                    var39.field67 = var9.field4411;
                                    class111.field1935.method116((byte) -121, var39);
                                }
                            }
                            if (var9.field4483 != null) {
                                class5 var40 = new class5();
                                var40.field58 = var9;
                                var40.field67 = var9.field4483;
                                class205.field3581.method116((byte) -121, var40);
                            }
                            if (var9.field4447 != null && class99.field1783 > var9.field4508) {
                                if (var9.field4514 == null || class99.field1783 - var9.field4508 > 32) {
                                    class5 var45 = new class5();
                                    var45.field58 = var9;
                                    var45.field67 = var9.field4447;
                                    class202.field3522.method116((byte) -121, var45);
                                } else {
                                    label550: for (int var41 = var9.field4508; var41 < class99.field1783; var41++) {
                                        int var42 = class253.field4369[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4514.length; var43++) {
                                            if (var9.field4514[var43] == var42) {
                                                class5 var44 = new class5();
                                                var44.field58 = var9;
                                                var44.field67 = var9.field4447;
                                                class202.field3522.method116((byte) -121, var44);
                                                break label550;
                                            }
                                        }
                                    }
                                }
                                var9.field4508 = class99.field1783;
                            }
                            if (var9.field4478 != null && class206.field3594 > var9.field4480) {
                                if (var9.field4408 == null || class206.field3594 - var9.field4480 > 32) {
                                    class5 var50 = new class5();
                                    var50.field58 = var9;
                                    var50.field67 = var9.field4478;
                                    class202.field3522.method116((byte) -121, var50);
                                } else {
                                    label526: for (int var46 = var9.field4480; var46 < class206.field3594; var46++) {
                                        int var47 = class193.field3302[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field4408.length; var48++) {
                                            if (var9.field4408[var48] == var47) {
                                                class5 var49 = new class5();
                                                var49.field58 = var9;
                                                var49.field67 = var9.field4478;
                                                class202.field3522.method116((byte) -121, var49);
                                                break label526;
                                            }
                                        }
                                    }
                                }
                                var9.field4480 = class206.field3594;
                            }
                            if (var9.field4540 != null && class94.field1717 > var9.field4453) {
                                if (var9.field4403 == null || class94.field1717 - var9.field4453 > 32) {
                                    class5 var55 = new class5();
                                    var55.field58 = var9;
                                    var55.field67 = var9.field4540;
                                    class202.field3522.method116((byte) -121, var55);
                                } else {
                                    label502: for (int var51 = var9.field4453; var51 < class94.field1717; var51++) {
                                        int var52 = class63.field1169[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4403.length; var53++) {
                                            if (var9.field4403[var53] == var52) {
                                                class5 var54 = new class5();
                                                var54.field58 = var9;
                                                var54.field67 = var9.field4540;
                                                class202.field3522.method116((byte) -121, var54);
                                                break label502;
                                            }
                                        }
                                    }
                                }
                                var9.field4453 = class94.field1717;
                            }
                            if (var9.field4550 != null && class105.field1844 > var9.field4393) {
                                if (var9.field4496 == null || class105.field1844 - var9.field4393 > 32) {
                                    class5 var60 = new class5();
                                    var60.field58 = var9;
                                    var60.field67 = var9.field4550;
                                    class202.field3522.method116((byte) -121, var60);
                                } else {
                                    label478: for (int var56 = var9.field4393; var56 < class105.field1844; var56++) {
                                        int var57 = class27.field409[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4496.length; var58++) {
                                            if (var9.field4496[var58] == var57) {
                                                class5 var59 = new class5();
                                                var59.field58 = var9;
                                                var59.field67 = var9.field4550;
                                                class202.field3522.method116((byte) -121, var59);
                                                break label478;
                                            }
                                        }
                                    }
                                }
                                var9.field4393 = class105.field1844;
                            }
                            if (var9.field4523 != null && class226.field3933 > var9.field4522) {
                                if (var9.field4474 == null || class226.field3933 - var9.field4522 > 32) {
                                    class5 var65 = new class5();
                                    var65.field58 = var9;
                                    var65.field67 = var9.field4523;
                                    class202.field3522.method116((byte) -121, var65);
                                } else {
                                    label454: for (int var61 = var9.field4522; var61 < class226.field3933; var61++) {
                                        int var62 = class208.field3633[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field4474.length; var63++) {
                                            if (var9.field4474[var63] == var62) {
                                                class5 var64 = new class5();
                                                var64.field58 = var9;
                                                var64.field67 = var9.field4523;
                                                class202.field3522.method116((byte) -121, var64);
                                                break label454;
                                            }
                                        }
                                    }
                                }
                                var9.field4522 = class226.field3933;
                            }
                            if (class203.field3535 > var9.field4396 && var9.field4404 != null) {
                                class5 var66 = new class5();
                                var66.field58 = var9;
                                var66.field67 = var9.field4404;
                                class202.field3522.method116((byte) -121, var66);
                            }
                            if (class207.field3613 > var9.field4396 && var9.field4414 != null) {
                                class5 var67 = new class5();
                                var67.field58 = var9;
                                var67.field67 = var9.field4414;
                                class202.field3522.method116((byte) -121, var67);
                            }
                            if (class116.field2075 > var9.field4396 && var9.field4463 != null) {
                                class5 var68 = new class5();
                                var68.field58 = var9;
                                var68.field67 = var9.field4463;
                                class202.field3522.method116((byte) -121, var68);
                            }
                            if (class67.field1234 > var9.field4396 && var9.field4431 != null) {
                                class5 var69 = new class5();
                                var69.field58 = var9;
                                var69.field67 = var9.field4431;
                                class202.field3522.method116((byte) -121, var69);
                            }
                            if (class189.field3242 > var9.field4396 && var9.field4555 != null) {
                                class5 var70 = new class5();
                                var70.field58 = var9;
                                var70.field67 = var9.field4555;
                                class202.field3522.method116((byte) -121, var70);
                            }
                            var9.field4396 = class43.field755;
                            if (var9.field4454 != null) {
                                for (int var71 = 0; var71 < class35.field542; var71++) {
                                    class5 var72 = new class5();
                                    var72.field58 = var9;
                                    var72.field48 = class97.field1760[var71];
                                    var72.field54 = class239.field4130[var71];
                                    var72.field67 = var9.field4454;
                                    class202.field3522.method116((byte) -121, var72);
                                }
                            }
                            if (class270.field4792 && var9.field4402 != null) {
                                class5 var73 = new class5();
                                var73.field58 = var9;
                                var73.field67 = var9.field4402;
                                class202.field3522.method116((byte) -121, var73);
                            }
                        }
                    }
                    if (!var9.field4459 && class177.field3035 == null && class204.field3576 == null && !class52.field902) {
                        if ((var9.field4397 >= 0 || var9.field4520 != 0) && class245.field4195 >= var12 && class106.field1851 >= var13 && class245.field4195 < var14 && class106.field1851 < var15) {
                            if (var9.field4397 >= 0) {
                                class115.field2057 = arg0[var9.field4397];
                            } else {
                                class115.field2057 = var9;
                            }
                        }
                        if (var9.field4436 == 8 && class245.field4195 >= var12 && class106.field1851 >= var13 && class245.field4195 < var14 && class106.field1851 < var15) {
                            class75.field1397 = var9;
                        }
                        if (var9.field4466 > var9.field4482) {
                            class24.method160(var9.field4513 + var10, var9, class106.field1851, var9.field4466, class245.field4195, var11, var9.field4482, 4096);
                        }
                    }
                    if (var9.field4436 == 0) {
                        method991(arg0, var9.field4479, var12, var13, var14, var15, var10 - var9.field4557, var11 - var9.field4484);
                        if (var9.field4549 != null) {
                            method991(var9.field4549, var9.field4479, var12, var13, var14, var15, var10 - var9.field4557, var11 - var9.field4484);
                        }
                        class129 var74 = (class129) class121.field2126.method1398(1, (long) var9.field4479);
                        if (var74 != null) {
                            class206.method1413(var14, var11, var15, (byte) 98, var12, var10, var13, var74.field2264);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method280(boolean arg0) {
        field2572++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class107.field1882 != null) {
            class107.field1882.method562(this.getClass(), 0);
        }
        if (class159.field2725 != null) {
            class159.field2725.field809 = false;
        }
        class159.field2725 = null;
        if (class198.field3390 != null) {
            class198.field3390.method218(121);
            class198.field3390 = null;
        }
        class106.method732((byte) 21, class254.field4389);
        class85.method603((byte) 54, class254.field4389);
        if (class264.field4735 != null) {
            class264.field4735.method961(-22966, class254.field4389);
        }
        class195.method1339(false);
        class98.method693(arg0);
        class264.field4735 = null;
        if (class247.field4223 != null) {
            class247.field4223.method264((byte) 109);
        }
        if (class24.field346 != null) {
            class24.field346.method264((byte) 109);
        }
        class55.field969.method1044(-127);
        class40.field639.method241(122);
        try {
            if (class93.field1705 != null) {
                class93.field1705.method1206(-1);
            }
            if (class183.field3138 != null) {
                for (int var2 = 0; var2 < class183.field3138.length; var2++) {
                    if (class183.field3138[var2] != null) {
                        class183.field3138[var2].method1206(-1);
                    }
                }
            }
            if (class44.field785 != null) {
                class44.field785.method1206(-1);
            }
            if (class203.field3551 != null) {
                class203.field3551.method1206(-1);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static void method992(boolean arg0) {
        field2560 = null;
        field2576 = null;
        field2577 = null;
        field2564 = null;
        field2566 = null;
        if (!arg0) {
            field2559 = null;
        }
        field2568 = null;
        field2558 = null;
        field2559 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method993(int arg0, int arg1) {
        field2571++;
        if (arg0 == 1000) {
            class171 var2 = class85.method579(10, 0, arg1);
            var2.method1141(-6456);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method282(int arg0) {
        field2561++;
        if (class1.field4 == 1000) {
            return;
        }
        boolean var2 = class7.method35(117);
        if (var2 && class203.field3549 && class247.field4223 != null) {
            class247.field4223.method270((byte) 65);
        }
        if (class1.field4 == 30 || class1.field4 == 10) {
            if (class168.field2894) {
                class34.method234(true);
            } else if (class152.field2599 != 0L && class152.field2599 < class28.method200(117)) {
                class34.method234(true);
            }
        }
        if (arg0 != 26646) {
            return;
        }
        boolean var3 = false;
        if (class137.field2382 != 0L && class28.method200(-111) > class137.field2382 && class198.field3390 != null && (class1.field4 == 30 || class1.field4 == 25)) {
            class122.method835(0);
        }
        if (class111.field1948) {
            class111.field1948 = false;
            var3 = true;
        }
        if (var3) {
            class97.method688((byte) -53);
        }
        if (class1.field4 == 0) {
            class211.method1450((Color) null, class71.field1331, var3, false, class183.field3132);
        } else if (class1.field4 == 5) {
            class181.method1249(class180.field3092, (byte) -65);
        } else if (class1.field4 == 10) {
            class1.method2((byte) 125);
        } else if (class1.field4 == 25 || class1.field4 == 28) {
            if (class115.field2064 == 1) {
                if (class124.field2199 < class236.field4079) {
                    class124.field2199 = class236.field4079;
                }
                int var4 = (class124.field2199 - class236.field4079) * 50 / class124.field2199;
                class163.method1083(false, true, class172.method1150(new class85[] { class67.field1242, class183.field3114, class68.method451(var4, -12572), class40.field640 }, arg0 - 26646));
            } else if (class115.field2064 == 2) {
                if (class261.field4611 > class217.field3804) {
                    class217.field3804 = class261.field4611;
                }
                int var5 = (class217.field3804 - class261.field4611) * 50 / class217.field3804 + 50;
                class163.method1083(false, true, class172.method1150(new class85[] { class67.field1242, class183.field3114, class68.method451(var5, -12572), class40.field640 }, arg0 ^ 0x6816));
            } else {
                class163.method1083(false, true, class67.field1242);
            }
        } else if (class1.field4 == 30) {
            class137.method910(0);
        } else if (class1.field4 == 40) {
            class163.method1083(false, true, class172.method1150(new class85[] { class168.field2892, class153.field2653, class201.field3505 }, 0));
        }
        if ((class1.field4 == 30 || class1.field4 == 10) && class183.field3128 == 0 && !var3) {
            try {
                Graphics var8 = class254.field4389.getGraphics();
                for (int var9 = 0; var9 < class22.field307; var9++) {
                    if (class217.field3803[var9]) {
                        class230.field3972.method359(class54.field947[var9], class253.field4364[var9], class146.field2493[var9], var8, -115, class246.field4201[var9]);
                        class217.field3803[var9] = false;
                    }
                }
            } catch (Exception var13) {
                class254.field4389.repaint();
            }
        } else if (class1.field4 != 0) {
            try {
                Graphics var6 = class254.field4389.getGraphics();
                class230.field3972.method361(0, var6, true, 0);
                for (int var7 = 0; var7 < class22.field307; var7++) {
                    class217.field3803[var7] = false;
                }
            } catch (Exception var14) {
                class254.field4389.repaint();
            }
        }
        if (class121.field2130) {
            class34.method232(arg0 - 26538);
        }
        if (!browsercontrol.iscreated() || class251.field4316 == 0) {
            return;
        }
        try {
            Point var10 = class254.field4389.getLocationOnScreen();
            Dimension var11 = class254.field4389.getSize();
            browsercontrol.set_position(var10.x, var10.y - class251.field4316, var11.width, class251.field4316);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method283(byte arg0) {
        method992(true);
        field2575++;
        class85.method614((byte) 81);
        class239.method1626(-64);
        class82.method568(26078);
        class219.method1493((byte) -73);
        class41.method276(-26012);
        class256.method1774(87);
        class223.method1515((byte) -88);
        class45.method314((byte) -124);
        class251.method1731((byte) -86);
        class247.method1662((byte) 83);
        class31.method215((byte) -95);
        class159.method1042(0);
        class35.method235(15201);
        class206.method1405(-126);
        class195.method1332(-2);
        class68.method462(-2);
        class178.method1202(91);
        class38.method254(true);
        class184.method1266(-126);
        class70.method491(26346);
        class264.method1809(-43);
        class255.method1768(1073741824);
        class44.method312(62);
        class15.method114(-114);
        class204.method1397(-32580);
        class147.method959(4500);
        class221.method1500((byte) 47);
        class83.method571((byte) -68);
        class12.method97(7427);
        class113.method785((byte) 60);
        class39.method260((byte) 90);
        class123.method844(-48);
        class180.method1241((byte) -117);
        class106.method728(2);
        class58.method390(false);
        class208.method1422(725);
        class218.method1488((byte) -124);
        class263.method1808((byte) -98);
        class129.method874((byte) 94);
        class253.method1752(19);
        class156.method1024(0);
        class172.method1153(22238);
        class144.method943(2);
        class177.method1193((byte) 94);
        class222.method1505(-108);
        class90.method661(-81);
        class86.method644((byte) 64);
        class134.method891(-1963279359);
        class270.method1852(false);
        class98.method692((byte) -113);
        class146.method957(0);
        class199.method1369(-104);
        class231.method1545(false);
        class115.method809(false);
        class165.method1110();
        class235.method1570(945);
        class61.method412(951);
        class42.method298();
        class102.method707(-1);
        class43.method305(0);
        class28.method197((byte) 111);
        class30.method207(-122);
        class236.method1575(123);
        class47.method323((byte) 104);
        class119.method827(-10);
        class232.method1557(107);
        class10.method83();
        class211.method1448(101);
        class213.method1459(-1000000);
        class260.method1785(true);
        class56.method379((byte) -30);
        class233.method1562((byte) 29);
        class267.method1843((byte) -98);
        class93.method673(-1);
        class167.method1124(99999999);
        class212.method1455(219);
        class170.method1137();
        class201.method1383(-114);
        class214.method1471(true);
        class122.method836((byte) 82);
        class173.method1166();
        class179.method1228();
        class142.method933((byte) 119);
        class7.method32(true);
        class2.method8((byte) -80);
        class110.method756((byte) -4);
        class94.method675(-121);
        class273.method1859(-7);
        class62.method426();
        class135.method897((byte) 77);
        class209.method1427();
        class210.method1447(0);
        class36.method242(true);
        class6.method26((byte) -115);
        class215.method1476(30053);
        class57.method384((byte) -54);
        class196.method1341(5894);
        class118.method824(64);
        class240.method1635(-3);
        class191.method1316(120);
        class16.method121(false);
        class20.method142(-87);
        class161.method1054(5);
        class244.method1649(true);
        class95.method680(-59);
        class13.method105(3);
        class71.method496(2);
        class101.method699(-55);
        class21.method146((byte) 114);
        class261.method1786((byte) 20);
        class72.method513(false);
        class163.method1082(126);
        class228.method1534(-123);
        class148.method968(true);
        class18.method133((byte) 20);
        class137.method907((byte) 56);
        class133.method888((byte) 74);
        class249.method1729((byte) -32);
        class50.method335((byte) -61);
        class5.method18(20);
        class242.method1641(126);
        class269.method1847((byte) -17);
        class37.method249(127);
        class168.method1131(42);
        class171.method1139(-22954);
        class186.method1281(-86);
        class185.method1279(-127);
        class207.method1419(true);
        class76.method532((byte) -22);
        class169.method1132(-88);
        class139.method917();
        class182.method1251((byte) -125);
        class176.method1190(-19970);
        class205.method1402(255);
        class25.method161(-706301625);
        class48.method329(false);
        class105.method726((byte) 11);
        class1.method4(10772);
        class8.method40((byte) 93);
        class92.method667((byte) -116);
        class254.method1755(-1);
        class127.method859(1815);
        class79.method549(127);
        if (arg0 >= -76) {
            field2559 = null;
        }
        class181.method1248(-26);
        class3.method11(-128);
        class162.method1066(0);
        class154.method1010((byte) 13);
        class97.method689(1);
        class54.method362((byte) 125);
        class121.method832(8);
        class24.method159(false);
        class74.method521(1);
        class198.method1352(-1);
        class166.method1123();
        class153.method1007(-29861);
        class272.method1857(26792);
        class189.method1297((byte) 123);
        class78.method540(0);
        class175.method1180((byte) 110);
        class77.method537(2);
        class149.method974();
        class60.method397();
        class158.method1034();
        class52.method344(false);
        class99.method695((byte) -115);
        class217.method1484((byte) 98);
        class53.method355();
        class188.method1295();
        class65.method439((byte) 126);
        class252.method1744(120);
        class88.method650(114);
        class64.method432(123080193);
        class59.method394(124);
        class23.method156(-122);
        class128.method866(-83);
        class73.method517(-119);
        class55.method368(0);
        class131.method879(-121);
        class100.method697(1023);
        class22.method148(0);
        class152.method1000(0);
        class11.method86(155670992);
        class262.method1792(-882400948);
        class237.method1582(false);
        class63.method428((byte) 120);
        class66.method440(false);
        class193.method1319(false);
        class268.method1846(23263);
        class49.method330(4096);
        class150.method978(-24941);
        class27.method194(2047);
        class190.method1306((byte) 43);
        class117.method822(1000);
        class40.method271((byte) -10);
        class132.method884(1003);
        class151.method985(-24);
        class216.method1482(1);
        class234.method1565(40);
        class187.method1286(false);
        class241.method1639(-310784924);
        class109.method752(true);
        class108.method745(0);
        class51.method341(-125);
        class116.method819(-26318);
        class230.method1544((byte) -78);
        class246.method1661((byte) -88);
        class183.method1258((byte) 97);
        class130.method875(128);
        class141.method926(19228);
        class34.method233(false);
        class124.method850((byte) -100);
        class140.method919(-111);
        class114.method808(-119);
        class194.method1322(-1651665204);
        class67.method448((byte) 113);
        class75.method530((byte) -119);
        class200.method1378(true);
        class225.method1523(-101);
        class197.method1345(false);
        class271.method1855((byte) 80);
        class229.method1535(-31055);
        class202.method1385(true);
        class227.method1527(-1);
        class226.method1525((byte) -86);
        class33.method228((byte) 3);
        class4.method14(126);
        class125.method853(19446);
        class112.method761(-1);
        class104.method718(false);
        class220.method1497(1736);
        class19.method135((byte) -72);
        class203.method1390(-1);
        class245.method1657((byte) -99);
        class107.method740((byte) 98);
        class111.method757((byte) -72);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljb;)Z")
    public static final boolean method994(class255 arg0) {
        if (class183.field3134) {
            if (method987(arg0) != 0) {
                return false;
            }
            if (arg0.field4436 == 0) {
                return false;
            }
        }
        return arg0.field4542;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method995(boolean arg0) {
        if (!arg0) {
            return;
        }
        field2573++;
        if (class55.field969.field2740 >= 4) {
            this.method273("js5crc", false);
            class1.field4 = 1000;
            return;
        }
        if (class55.field969.field2739 >= 4) {
            if (class1.field4 == 0 || class1.field4 == 5) {
                this.method273("js5io", !arg0);
                class1.field4 = 1000;
                return;
            }
            class55.field969.field2739 = 3;
            class168.field2902 = 3000;
        }
        if ((class168.field2902--) > 0) {
            return;
        }
        try {
            if (class253.field4376 == 0) {
                class75.field1391 = class107.field1882.method559((byte) 60, class239.field4128, class6.field70);
                class253.field4376++;
            }
            if (class253.field4376 == 1) {
                if (class75.field1391.field1296 == 2) {
                    this.method989(-1, (byte) -75);
                    return;
                }
                if (class75.field1391.field1296 == 1) {
                    class253.field4376++;
                }
            }
            if (class253.field4376 == 2) {
                class203.field3546 = new class31((Socket) class75.field1391.field1292, class107.field1882);
                class247 var2 = new class247(5);
                var2.method1714(15, -714043120);
                var2.method1715(511, (byte) -22);
                class203.field3546.method214(var2.field4238, 5, 0, (byte) 15);
                class253.field4376++;
                class124.field2201 = class28.method200(-78);
            }
            if (class253.field4376 == 3) {
                if (class1.field4 == 0 || class1.field4 == 5 || class203.field3546.method212((byte) 83) > 0) {
                    int var3 = class203.field3546.method213(-1588);
                    if (var3 != 0) {
                        this.method989(var3, (byte) -53);
                        return;
                    }
                    class253.field4376++;
                } else if (class28.method200(98) - class124.field2201 > 30000L) {
                    this.method989(-2, (byte) -122);
                    return;
                }
            }
            if (class253.field4376 == 4) {
                boolean var4 = class1.field4 == 5 || class1.field4 == 10 || class1.field4 == 28;
                class55.field969.method1038(!var4, -54, class203.field3546);
                class67.field1239 = 0;
                class203.field3546 = null;
                class253.field4376 = 0;
                class75.field1391 = null;
            }
        } catch (IOException var5) {
            this.method989(-3, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method996(byte arg0) {
        class85.method630(this, true);
        for (class35.field542 = 0; class208.method1423(127) && class35.field542 < 128; class35.field542++) {
            class97.field1760[class35.field542] = class254.field4379;
            class239.field4130[class35.field542] = class225.field3921;
        }
        field2581++;
        class218.field3820++;
        if (class129.field2267 != -1) {
            class206.method1413(class154.field2664, 0, class154.field2662, (byte) 103, 0, 0, 0, class129.field2267);
        }
        class43.field755++;
        int var2 = 110 % ((arg0 - 18) / 57);
        class216.method1478(1);
        while (true) {
            class5 var3;
            class255 var4;
            class255 var5;
            do {
                var3 = (class5) class205.field3581.method115((byte) 61);
                if (var3 == null) {
                    while (true) {
                        class5 var6;
                        class255 var7;
                        class255 var8;
                        do {
                            var6 = (class5) class111.field1935.method115((byte) 106);
                            if (var6 == null) {
                                while (true) {
                                    class5 var9;
                                    class255 var10;
                                    class255 var11;
                                    do {
                                        var9 = (class5) class202.field3522.method115((byte) 69);
                                        if (var9 == null) {
                                            if (class177.field3035 != null) {
                                                class116.method821(-25523);
                                            }
                                            if (class49.field869 != null && class49.field869.field1296 == 1) {
                                                if (class49.field869.field1292 != null) {
                                                    class175.method1179(class83.field1514, class115.field2063, -1);
                                                }
                                                class83.field1514 = false;
                                                class115.field2063 = null;
                                                class49.field869 = null;
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field58;
                                        if (var10.field4418 < 0) {
                                            break;
                                        }
                                        var11 = class72.method506(var10.field4530, 0);
                                    } while (var11 == null || var11.field4549 == null || var11.field4549.length <= var10.field4418 || var11.field4549[var10.field4418] != var10);
                                    class127.method863(-69, var9);
                                }
                            }
                            var7 = var6.field58;
                            if (var7.field4418 < 0) {
                                break;
                            }
                            var8 = class72.method506(var7.field4530, 0);
                        } while (var8 == null || var8.field4549 == null || var8.field4549.length <= var7.field4418 || var8.field4549[var7.field4418] != var7);
                        class127.method863(85, var6);
                    }
                }
                var4 = var3.field58;
                if (var4.field4418 < 0) {
                    break;
                }
                var5 = class72.method506(var4.field4530, 0);
            } while (var5 == null || var5.field4549 == null || var4.field4418 >= var5.field4549.length || var5.field4549[var4.field4418] != var4);
            class127.method863(-88, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    public static final void method997(int arg0, byte arg1) {
        if (class140.field2426 == null || arg0 > class140.field2426.length) {
            class140.field2426 = new int[arg0];
        }
        field2567++;
        if (arg1 != -112) {
            field2566 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method274(byte arg0) {
        field2569++;
        class40.field639 = new class35();
        class55.field969 = new class159();
        class61.method407(0, class107.field1882, class116.field2085);
        if (class18.field267 == 1) {
            class177.field3034 = class63.field1175;
            class268.field4764 = class195.field3360;
            class168.field2895 = class95.field1737;
            class34.field502 = class43.field752;
        } else {
            class34.field502 = class147.field2500;
            class268.field4764 = class261.field4619;
            class177.field3034 = class50.field883;
            class168.field2895 = class235.field4060;
        }
        class43.field751 = class133.field2312 == 0 ? 43594 : class7.field78 + 40000;
        class58.field1058 = class133.field2312 == 0 ? 443 : class7.field78 + 50000;
        class239.field4128 = class43.field751;
        class27.field414 = class115.field2054 = class24.field344 = class142.field2456 = new short[256];
        class212.method1454(-110);
        int var2 = 80 / ((-arg0 - 9) / 46);
        class156.method1023((byte) 124, class254.field4389);
        class131.method882(class254.field4389, 48);
        class264.field4735 = class190.method1307(6068);
        if (class264.field4735 != null) {
            class264.field4735.method962(class254.field4389, (byte) -113);
        }
        class67.field1238 = class81.field1464;
        try {
            if (class107.field1882.field1469 != null) {
                class93.field1705 = new class178(class107.field1882.field1469, 5200, 0);
                for (int var3 = 0; var3 < 27; var3++) {
                    class183.field3138[var3] = new class178(class107.field1882.field1470[var3], 6000, 0);
                }
                class44.field785 = new class178(class107.field1882.field1474, 6000, 0);
                class150.field2530 = new class38(255, class93.field1705, class44.field785, 500000);
                class203.field3551 = new class178(class107.field1882.field1476, 24, 0);
                class107.field1882.field1476 = null;
                class107.field1882.field1474 = null;
                class107.field1882.field1470 = null;
                class107.field1882.field1469 = null;
            }
        } catch (IOException var4) {
            class150.field2530 = null;
            class93.field1705 = null;
            class203.field3551 = null;
            class44.field785 = null;
        }
        if (class133.field2312 != 0) {
            class28.field432 = true;
        }
        class50.field881 = class24.field350;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method998(int arg0) {
        field2574++;
        if (class156.field2680 == arg0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class28.method200(-53);
            if (class36.field556 == 0L) {
                class36.field556 = var4;
            }
            if (var3 > 16384 && (var4 - class36.field556) < 5000L) {
                if (var4 - class25.field395 > 1000L) {
                    System.gc();
                    class25.field395 = var4;
                }
                class71.field1331 = 5;
                class183.field3132 = class169.field2912;
            } else {
                class183.field3132 = class107.field1890;
                class71.field1331 = 5;
                class156.field2680 = 10;
            }
        } else if (class156.field2680 == 10) {
            class11.method87(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class34.field529[var6] = new class264(104, 104);
            }
            class156.field2680 = 30;
            class71.field1331 = 10;
            class183.field3132 = class193.field3293;
        } else if (class156.field2680 == 30) {
            if (class133.field2317 == null) {
                class133.field2317 = new class206(class55.field969, class40.field639);
            }
            if (class133.field2317.method1411(-13159)) {
                class75.field1395 = class245.method1658(0, true, false, -96, true);
                class171.field2961 = class245.method1658(1, true, false, arg0 ^ 0xFFFFFFA8, true);
                class215.field3773 = class245.method1658(2, false, true, -115, true);
                class239.field4122 = class245.method1658(3, true, false, -32, true);
                class79.field1449 = class245.method1658(4, true, false, -122, true);
                class36.field555 = class245.method1658(5, true, true, -85, true);
                class213.field3744 = class245.method1658(6, true, true, -107, false);
                class271.field4798 = class245.method1658(7, true, false, arg0 - 124, true);
                class161.field2773 = class245.method1658(8, true, false, arg0 ^ 0xFFFFFFA2, true);
                class201.field3508 = class245.method1658(9, true, false, -104, true);
                class33.field496 = class245.method1658(10, true, false, -41, true);
                class28.field440 = class245.method1658(11, true, false, -105, true);
                class12.field192 = class245.method1658(12, true, false, arg0 - 62, true);
                class2.field19 = class245.method1658(13, true, false, -59, true);
                class225.field3926 = class245.method1658(14, true, false, -106, false);
                class44.field782 = class245.method1658(15, true, false, -95, true);
                class13.field196 = class245.method1658(16, true, false, -95, true);
                class189.field3250 = class245.method1658(17, true, false, -79, true);
                class78.field1440 = class245.method1658(18, true, false, -127, true);
                class15.field214 = class245.method1658(19, true, false, -112, true);
                class27.field419 = class245.method1658(20, true, false, -35, true);
                class97.field1762 = class245.method1658(21, true, false, -39, true);
                class228.field3949 = class245.method1658(22, true, false, -108, true);
                class1.field10 = class245.method1658(23, true, true, -95, true);
                class116.field2067 = class245.method1658(24, true, false, -41, true);
                class38.field589 = class245.method1658(25, true, false, -96, true);
                class193.field3300 = class245.method1658(26, true, true, -95, true);
                class71.field1331 = 15;
                class183.field3132 = class22.field319;
                class156.field2680 = 40;
            }
        } else if (class156.field2680 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class4.field43[var8].method1329(102) * class44.field769[var8] / 100;
            }
            if (var7 == 100) {
                class71.field1331 = 20;
                class183.field3132 = class210.field3675;
                class121.method831(class161.field2773, arg0 ^ 0x8);
                class28.method195(class161.field2773, (byte) -103);
                class253.method1748(class161.field2773, (byte) -109);
                class180.method1237(class161.field2773, true);
                class156.field2680 = 45;
            } else {
                if (var7 != 0) {
                    class183.field3132 = class172.method1150(new class85[] { class198.field3399, class68.method451(var7, -12572), class267.field4747 }, arg0);
                }
                class71.field1331 = 20;
            }
        } else if (class156.field2680 == 45) {
            class172.method1152(class95.field1743, 2, 22050, 111);
            class213.field3746 = new class113();
            class213.field3746.method796(9, 128, -181543384);
            class247.field4223 = class216.method1479(0, class254.field4389, class107.field1882, (byte) -34, 22050);
            class247.field4223.method265(-122, class213.field3746);
            class242.method1642(117, class79.field1449, class225.field3926, class44.field782, class213.field3746);
            class24.field346 = class216.method1479(1, class254.field4389, class107.field1882, (byte) -34, 2048);
            class247.field4249 = new class145();
            class24.field346.method265(53, class247.field4249);
            class221.field3882 = new class123(22050, class159.field2706);
            class87.field1622 = class213.field3744.method482(arg0 - 47, class249.field4299);
            class156.field2680 = 50;
            class183.field3132 = class272.field4806;
            class71.field1331 = 30;
        } else if (class156.field2680 == 50) {
            int var9 = class183.method1254(class2.field19, class161.field2773, (byte) 48);
            int var10 = class150.method980(arg0 ^ 0x78);
            if (var10 > var9) {
                class183.field3132 = class172.method1150(new class85[] { class230.field3970, class68.method451(var9 * 100 / var10, arg0 ^ 0xFFFFCEE4), class267.field4747 }, 0);
                class71.field1331 = 35;
            } else {
                class183.field3132 = class25.field363;
                class71.field1331 = 35;
                class156.field2680 = 60;
            }
        } else if (class156.field2680 == 60) {
            int var11 = class271.method1854(class161.field2773, (byte) -78);
            int var12 = class223.method1510(-99);
            if (var12 > var11) {
                class183.field3132 = class172.method1150(new class85[] { class251.field4333, class68.method451(var11 * 100 / var12, -12572), class267.field4747 }, arg0);
                class71.field1331 = 40;
            } else {
                class183.field3132 = class244.field4179;
                class71.field1331 = 40;
                class156.field2680 = 65;
            }
        } else if (class156.field2680 == 65) {
            class28.field423 = false;
            class200.method1377(class161.field2773, class2.field19, arg0 ^ 0x1657);
            class71.field1331 = 45;
            class183.field3132 = class93.field1707;
            class169.method1136(true, 5);
            class156.field2680 = 70;
        } else if (class156.field2680 == 70) {
            class215.field3773.method479(14072);
            byte var13 = 0;
            int var14 = var13 + class215.field3773.method466((byte) 77);
            class13.field196.method479(14072);
            int var15 = var14 + class13.field196.method466((byte) 64);
            class189.field3250.method479(14072);
            int var16 = var15 + class189.field3250.method466((byte) 91);
            class78.field1440.method479(arg0 + 14072);
            int var17 = var16 + class78.field1440.method466((byte) 118);
            class15.field214.method479(14072);
            int var18 = var17 + class15.field214.method466((byte) 104);
            class27.field419.method479(14072);
            int var19 = var18 + class27.field419.method466((byte) 109);
            class97.field1762.method479(14072);
            int var20 = var19 + class97.field1762.method466((byte) 88);
            class228.field3949.method479(14072);
            int var21 = var20 + class228.field3949.method466((byte) 115);
            class116.field2067.method479(14072);
            int var22 = var21 + class116.field2067.method466((byte) 76);
            class38.field589.method479(14072);
            int var23 = var22 + class38.field589.method466((byte) 89);
            if (var23 < 1000) {
                class183.field3132 = class172.method1150(new class85[] { class199.field3471, class68.method451(var23 / 10, -12572), class267.field4747 }, 0);
                class71.field1331 = 50;
            } else {
                class247.method1666(-128, class215.field3773);
                class95.method677(class215.field3773, 127);
                class114.method806(arg0 ^ 0x77, class215.field3773);
                class211.method1451(arg0 ^ 0x7A, class215.field3773, class271.field4798);
                class6.method31(class217.field3814, false, class271.field4798, class13.field196);
                class30.method209(class271.field4798, -27188, class78.field1440);
                class203.method1388(class21.field301, class217.field3814, class15.field214, 2915, class271.field4798);
                class54.method360((byte) 98, class215.field3773);
                class197.method1343(class27.field419, class75.field1395, arg0 ^ 0xFFFFFFF4, class171.field2961);
                class175.method1186(class97.field1762, class271.field4798, false);
                class92.method671(class228.field3949, (byte) -100);
                class90.method662(class215.field3773, -6564);
                class135.method896((byte) -95, class2.field19, class271.field4798, class161.field2773, class239.field4122);
                class99.method696(0, class215.field3773);
                class48.method327(class189.field3250, 500);
                class229.method1537(class116.field2067, class38.field589, new class228(), false);
                class86.method641(class116.field2067, (byte) -38, class38.field589);
                class183.field3132 = class229.field3967;
                class71.field1331 = 50;
                class85.method593(false);
                class156.field2680 = 80;
            }
        } else if (class156.field2680 == 80) {
            int var24 = class131.method880(class161.field2773, -25612);
            int var25 = class225.method1519(127);
            if (var25 > var24) {
                class183.field3132 = class172.method1150(new class85[] { class202.field3527, class68.method451(var24 * 100 / var25, -12572), class267.field4747 }, 0);
                class71.field1331 = 60;
            } else {
                class150.method976(0, class161.field2773);
                class183.field3132 = class168.field2903;
                class156.field2680 = 90;
                class71.field1331 = 60;
            }
        } else if (class156.field2680 == 90) {
            if (class193.field3300.method479(14072)) {
                class122 var26 = new class122(class201.field3508, class193.field3300, class161.field2773, 20, !class214.field3762);
                class173.method1173(var26);
                if (class3.field38 == 1) {
                    class173.method1163(0.9F);
                }
                if (class3.field38 == 2) {
                    class173.method1163(0.8F);
                }
                if (class3.field38 == 3) {
                    class173.method1163(0.7F);
                }
                if (class3.field38 == 4) {
                    class173.method1163(0.6F);
                }
                class183.field3132 = class108.field1901;
                class156.field2680 = 100;
                class71.field1331 = 70;
            } else {
                class183.field3132 = class172.method1150(new class85[] { class47.field828, class68.method451(class193.field3300.method466((byte) 65), arg0 - 12572), class267.field4747 }, 0);
                class71.field1331 = 70;
            }
        } else if (class156.field2680 == 100) {
            if (class161.method1059(class161.field2773, (byte) 28)) {
                class156.field2680 = 110;
            }
        } else if (class156.field2680 == 110) {
            class159.field2725 = new class45();
            class107.field1882.method555(-26915, 10, class159.field2725);
            class71.field1331 = 75;
            class156.field2680 = 120;
            class183.field3132 = class233.field4021;
        } else if (class156.field2680 == 120) {
            if (class33.field496.method476(class52.field897, false, class100.field1795)) {
                class18 var27 = new class18(class33.field496.method481(class100.field1795, arg0 + 17702, class52.field897));
                class195.method1333(var27, (byte) 123);
                class156.field2680 = 130;
                class71.field1331 = 80;
                class183.field3132 = class217.field3815;
            } else {
                class183.field3132 = class172.method1150(new class85[] { class137.field2385, class59.field1072 }, 0);
                class71.field1331 = 80;
            }
        } else if (class156.field2680 == 130) {
            if (!class239.field4122.method479(arg0 ^ 0x36F8)) {
                class183.field3132 = class172.method1150(new class85[] { class79.field1454, class68.method451(class239.field4122.method466((byte) 98) * 3 / 4, arg0 - 12572), class267.field4747 }, arg0);
                class71.field1331 = 85;
            } else if (!class12.field192.method479(14072)) {
                class183.field3132 = class172.method1150(new class85[] { class79.field1454, class68.method451(class12.field192.method466((byte) 84) / 10 + 75, -12572), class267.field4747 }, 0);
                class71.field1331 = 85;
            } else if (!class2.field19.method479(arg0 ^ 0x36F8)) {
                class183.field3132 = class172.method1150(new class85[] { class79.field1454, class68.method451(class2.field19.method466((byte) 69) / 20 + 85, -12572), class267.field4747 }, 0);
                class71.field1331 = 85;
            } else if (class1.field10.method473(true, class252.field4353)) {
                class144.method946(class134.field2342, class97.field1751, class156.field2675, class159.field2707, class212.field3720, class1.field10, arg0 + 97);
                class183.field3132 = class230.field3976;
                class71.field1331 = 100;
                class156.field2680 = 140;
            } else {
                class183.field3132 = class172.method1150(new class85[] { class79.field1454, class68.method451(class1.field10.method453(-48, class252.field4353) / 10 + 90, arg0 + -12572), class267.field4747 }, arg0);
                class71.field1331 = 85;
            }
        } else if (class156.field2680 == 140) {
            class59.field1073 = class239.field4122.method482(-110, class55.field964);
            class36.field555.method457(false, 47, true);
            class213.field3744.method457(true, 106, true);
            class161.field2773.method457(true, 64, true);
            class2.field19.method457(true, 119, true);
            class33.field496.method457(true, 101, true);
            class239.field4122.method457(true, 65, true);
            class121.field2130 = true;
            class206.method1409(arg0 + 11204);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method999(int arg0) {
        if (arg0 == -111) {
            class74.field1381.method1262(arg0 ^ 0xFFFFBCCD);
            field2565++;
        }
    }
}
