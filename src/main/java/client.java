import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class95 {

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ll;")
    public static class16 field3313;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Z")
    public static boolean field3318;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "[[[Lfq;")
    public static class138[][][] field3311;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1373(int arg0, byte arg1) {
        field3302++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            if (arg1 != -33) {
                field3311 = null;
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 38)
    private final void method1374(int arg0) {
        field3309++;
        int var2 = -25 / ((-arg0 - 54) / 34);
        boolean var3 = class322.field4831.method2004((byte) -127);
        if (!var3) {
            this.method1390(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 54)
    public static final void method1375() {
        for (int var0 = 0; var0 < class69.field976; var0++) {
            int[] var1 = class359.field5327[var0];
            for (int var2 = 0; var2 < class285.field4328; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 71)
    public final void method768(byte arg0) {
        field3317++;
        try {
            if (arg0 < -115) {
                this.method1392((byte) -31);
            }
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class185.method1229((byte) -126, 0);
            class88.method727(var3, -105, var3.getMessage() + " (Recovered) " + this.method776(false));
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 93)
    public static void method1376(int arg0) {
        if (arg0 != 85) {
            field3297 = -79;
        }
        field3313 = null;
        field3311 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 108)
    public final void init() {
        field3303++;
        if (!this.method767((byte) 65)) {
            return;
        }
        class397.field5936 = new class424();
        class397.field5936.field6307 = Integer.parseInt(this.getParameter("worldid"));
        class12.field163 = new class424();
        class12.field163.field6307 = Integer.parseInt(this.getParameter("lobbyid"));
        class12.field163.field6311 = this.getParameter("lobbyaddress");
        class225.field3674 = new class424();
        class225.field3674.field6307 = Integer.parseInt(this.getParameter("demoid"));
        class225.field3674.field6311 = this.getParameter("demoaddress");
        class310.field4662 = class348.method2169((byte) -87, Integer.parseInt(this.getParameter("modewhere")));
        if (!class326.method2077((byte) 55, class310.field4662) && class310.field4662 != class125.field1855) {
            class310.field4662 = class125.field1855;
        }
        class68.field873 = class89.method731(false, Integer.parseInt(this.getParameter("modewhat")));
        if (class68.field873 != class146.field2227 && class68.field873 != class179.field2701 && class68.field873 != class482.field6927) {
            class68.field873 = class482.field6927;
        }
        try {
            class224.field3673 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class224.field3673 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class48.field625 = true;
        } else {
            class48.field625 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class507.field7413 = true;
        } else {
            class507.field7413 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class368.field5407 = true;
        } else {
            class368.field5407 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class312.field4691 = class282.field4297;
            } else if (var4.equals("1")) {
                class312.field4691 = class86.field1228;
            }
        }
        try {
            class341.field5067 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class341.field5067 = 0;
        }
        class259.field3977 = this.getParameter("quiturl");
        class6.field71 = this.getParameter("settings");
        if (class6.field71 == null) {
            class6.field71 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class529.field7733 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class529.field7733 = 0;
            }
        }
        class168.field2478 = Integer.parseInt(this.getParameter("colourid"));
        if (class168.field2478 < 0 || class168.field2478 >= class335.field4997.length) {
            class168.field2478 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class297.field4526 = true;
            class88.field1252 = true;
        }
        if (class312.field4691 == class282.field4297) {
            class498.field7160 = 503;
            class374.field5608 = 765;
        } else if (class86.field1228 == class312.field4691) {
            class374.field5608 = 640;
            class498.field7160 = 480;
        }
        class150.field2246 = this;
        this.method777(-11443, class498.field7160, class68.field873.method31(true) + 32, 594, class374.field5608);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 221)
    public static final void method1377() {
        int var0 = class111.field1558;
        int[] var1 = class318.field4804;
        int var2 = class347.field5127 ? var0 : class167.field2471 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class129 var4;
            if (var3 < var0) {
                var4 = class26.field319[var1[var3]];
            } else {
                var4 = class153.field2265[class470.field6797[var3 - var0]];
            }
            if (var4.field1938 >= 0) {
                int var5 = var4.method953(-75);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5837 & 0x7F) == 0 && (var4.field5833 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field5837 & 0x7F) == 64 && (var4.field5833 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class177 && var4.field1986 != null && class475.field6854 >= var4.field1986.field5755 && class475.field6854 < var4.field1986.field5769) {
                    ((class177) var4).field2640 = false;
                }
                var4.field5831 = class172.method1153(var4.field5826, -4, var4.field5837, var4.field5833);
                class495.method2940(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 266)
    private final void method1378(int arg0) {
        field3295++;
        if (class429.field6373 == 13) {
            return;
        }
        class475.field6854++;
        if (class475.field6854 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class318.field4805 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class377.field5687.setSeed((long) class318.field4805);
        }
        if (class475.field6854 % 50 == 0) {
            class17.field224 = class82.field1195;
            class358.field5316 = class380.field5736;
            class82.field1195 = 0;
            class380.field5736 = 0;
        }
        this.method1374(90);
        if (class378.field5707 != null) {
            class378.field5707.method691((byte) -44);
        }
        int var3 = -40 / ((75 - arg0) / 43);
        class402.method2515((byte) -18);
        class101.field1456.method1047(117);
        class184.field2800.method541((byte) 125);
        if (class358.field5319 != null) {
            int var4 = class358.field5319.method1984((byte) 11);
            class333.field4974 = var4;
        }
        if (class377.field5692 != null) {
            class377.field5692.method302((int) class493.method2937(-77));
        }
        class255.method1703((byte) 27);
        class68.field877 = 0;
        for (class183 var5 = class101.field1456.method1048(0); var5 != null && class68.field877 < 128; var5 = class101.field1456.method1048(0)) {
            if (var5.method1217(120) != 1) {
                char var6 = var5.method1221(15030);
                if (!class316.method2018((byte) 57) || !(var6 == '`' || var6 == '§')) {
                    class457.field6655[class68.field877] = var5;
                    class68.field877++;
                } else if (class87.method724(21326)) {
                    class346.method2157((byte) -125);
                } else {
                    class122.method908(false);
                }
            }
        }
        for (class28 var7 = class184.field2800.method529((byte) -107); var7 != null; var7 = class184.field2800.method529((byte) -32)) {
            int var8 = var7.method190(16711680);
            if (var8 == -1) {
                class389.field5839.method994(var7, -3610);
            } else if (class121.method904(var8, -114)) {
                class102.field1459.method994(var7, -3610);
            }
            if (class102.field1459.method1000((byte) 113) > 10) {
                class102.field1459.method1001(-16153);
            }
        }
        if (class87.method724(21326)) {
            class532.method3155(1092);
        }
        if (class429.field6373 == 0) {
            this.method1394((byte) -83);
            class525.method3117((byte) -110);
        } else if (class429.field6373 == 1) {
            this.method1394((byte) -60);
            class525.method3117((byte) -110);
        } else if (class412.method2586(-110, class429.field6373)) {
            class371.method2329(-63);
        }
        if (class482.method2890(-9108, class429.field6373) && !class412.method2586(-73, class429.field6373)) {
            this.method1385(26);
            class344.method2150(125);
            class301.method1944(15935);
        } else if (class506.method3016(class429.field6373, -9) && !class412.method2586(-100, class429.field6373)) {
            this.method1385(26);
            class301.method1944(15935);
        } else if (class429.field6373 == 11) {
            class301.method1944(15935);
        } else if (class378.method2378(9, class429.field6373) && !class412.method2586(-73, class429.field6373)) {
            class45.method466(2);
        } else if (class429.field6373 == 12) {
            class301.method1944(15935);
            if (class281.field4282 != -3 && class281.field4282 != 2 && class281.field4282 != 15) {
                class417.method2613(false, -117);
            }
        }
        class114.method855((byte) 18, class377.field5692);
        class102.field1459.method1001(-16153);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)I", line = 419)
    public static final int method1379(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        if (arg1 != 64) {
            method1387(null);
        }
        field3307++;
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 438)
    private final void method1380(byte[] arg0, boolean arg1) {
        field3314++;
        if (!arg1) {
            return;
        }
        class217 var3 = new class217(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1515((byte) 126);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class470.field6799 = new int[6];
                    var5[0] = var3.method1511(83);
                    var5[1] = var3.method1511(122);
                    var5[2] = var3.method1511(107);
                    var5[3] = var3.method1511(90);
                    var5[4] = var3.method1511(123);
                    var5[5] = var3.method1511(83);
                } else if (var4 == 4) {
                    int var6 = var3.method1515((byte) 127);
                    class350.field5171 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class350.field5171[var7] = var3.method1511(110);
                        if (class350.field5171[var7] == 65535) {
                            class350.field5171[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method1515((byte) 122);
                    class297.field4524 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class297.field4524[var9] = var3.method1511(119);
                        if (class297.field4524[var9] == 65535) {
                            class297.field4524[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 514)
    public static final void method1381() {
        class123.field1842 = 0;
        for (int var0 = 0; var0 < class167.field2471; var0++) {
            class116 var1 = class153.field2265[class470.field6797[var0]];
            if (var1.field1948 && var1.method885((byte) -79) != -1) {
                int var2 = (var1.method953(-48) - 1) * 64 + 60;
                int var3 = var1.field5837 - var2 >> 7;
                int var4 = var1.field5833 - var2 >> 7;
                class129 var5 = class308.method1973(var4, var3, var1.field5826, 100);
                if (var5 != null) {
                    int var6 = var5.field1881;
                    if (var5 instanceof class116) {
                        var6 += 2048;
                    }
                    if (var5.field1905 == 0 && var5.method885((byte) -79) != -1) {
                        class517.field7526[class123.field1842] = var6;
                        class412.field6178[class123.field1842] = var6;
                        class123.field1842++;
                        var5.field1905++;
                    }
                    class517.field7526[class123.field1842] = var6;
                    class412.field6178[class123.field1842] = var1.field1881 + 2048;
                    class123.field1842++;
                    var5.field1905++;
                }
            }
        }
        class443.method2730(class412.field6178, 0, 66, class517.field7526, class123.field1842 - 1);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 574)
    public static final void method1382() {
        int var0 = class111.field1558;
        int[] var1 = class318.field4804;
        boolean var2 = class193.field3258.field7219 == 1 && var0 > 200 || class193.field3258.field7219 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class177 var12 = class26.field319[var1[var3]];
            if (var12.method1183((byte) -67)) {
                var12.method958((byte) -67);
                if (var12.field5836 >= 0 && var12.field5830 >= 0 && var12.field5827 < class69.field976 && var12.field5829 < class285.field4328) {
                    var12.field2640 = var12.field1926 ? var2 : false;
                    if (class398.field5947 == var12) {
                        var12.field1938 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1948) {
                            var13++;
                        }
                        if (var12.field1929 > class475.field6854) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method953(-76) << 2);
                        if (var12.field2639) {
                            var14 += 512;
                        } else {
                            if (class296.field4509 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field1938 = var14 + 1;
                    }
                } else {
                    var12.field1938 = -1;
                }
            } else {
                var12.field1938 = -1;
            }
        }
        for (int var4 = 0; var4 < class167.field2471; var4++) {
            class116 var9 = class153.field2265[class470.field6797[var4]];
            if (var9.method881((byte) -67) && var9.field1763.method252(21801, class195.field3271)) {
                var9.method958((byte) 47);
                if (var9.field5836 >= 0 && var9.field5830 >= 0 && var9.field5827 < class69.field976 && var9.field5829 < class285.field4328) {
                    int var10 = 0;
                    if (!var9.field1948) {
                        var10++;
                    }
                    if (var9.field1929 > class475.field6854) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method953(-122) << 2);
                    if (class296.field4509 == 0) {
                        if (var9.field1763.field476) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class296.field4509 == 1) {
                        if (var9.field1763.field476) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field1763.field501) {
                        var11 += 1024;
                    } else if (!var9.field1763.field505) {
                        var11 += 256;
                    }
                    var9.field1938 = var11 + 1;
                } else {
                    var9.field1938 = -1;
                }
            } else {
                var9.field1938 = -1;
            }
        }
        for (int var5 = 0; var5 < class303.field4580.length; var5++) {
            class109 var6 = class303.field4580[var5];
            if (var6 != null) {
                if (var6.field1523 == 1) {
                    class116 var7 = class153.field2265[var6.field1519];
                    if (var7 != null && var7.field1938 >= 0) {
                        var7.field1938 += 2048;
                    }
                } else if (var6.field1523 == 10) {
                    class177 var8 = class26.field319[var6.field1519];
                    if (var8 != null && class398.field5947 != var8 && var8.field1938 >= 0) {
                        var8.field1938 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 736)
    public static final void method1383(int arg0) {
        int var1 = class111.field1558;
        int[] var2 = class318.field4804;
        for (int var3 = 0; var3 < class167.field2471 + var1; var3++) {
            class129 var4;
            if (var3 < var1) {
                var4 = class26.field319[var2[var3]];
            } else {
                var4 = class153.field2265[class470.field6797[var3 - var1]];
            }
            if (var4.field5826 == arg0 && var4.field1938 >= 0) {
                int var5 = var4.method953(-86);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field5837 & 0x7F) != 0 || (var4.field5833 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field5837 & 0x7F) != 64 || (var4.field5833 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field5837 >> 7;
                    int var7 = var4.field5833 >> 7;
                    if (var4.field1938 > class359.field5327[var6][var7]) {
                        class359.field5327[var6][var7] = var4.field1938;
                        class406.field6030[var6][var7] = 1;
                    } else if (class359.field5327[var6][var7] == var4.field1938) {
                        var10002 = class406.field6030[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field5837 - var8 >> 7;
                    int var10 = var4.field5833 - var8 >> 7;
                    int var11 = var4.field5837 + var8 >> 7;
                    int var12 = var4.field5833 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1938 > class359.field5327[var13][var14]) {
                                class359.field5327[var13][var14] = var4.field1938;
                                class406.field6030[var13][var14] = 1;
                            } else if (class359.field5327[var13][var14] == var4.field1938) {
                                var10002 = class406.field6030[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luq;)Luq;", line = 836)
    public static final class114 method1384(class114 arg0) {
        int var1 = method1387(arg0).method2417(-29);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class475.method2864(true, arg0.field1700);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 856)
    private final void method1385(int arg0) {
        field3315++;
        if (class429.field6373 == 6 && class500.field7185 == 0) {
            if (class364.field5382 > 0) {
                class364.field5382--;
            }
            if (class350.field5176 > 1) {
                class350.field5176--;
                class127.field1857 = class152.field2263;
            }
            if (!class307.field4631) {
                class161.method1096(15036);
            }
            for (int var2 = 0; var2 < 100 && class514.method3044(-99); var2++) {
            }
        }
        class295.field4496++;
        class180.method1202(false, null, -1, -1);
        class183.method1222(null, -1, 0, -1);
        class511.method3038(0);
        class152.field2263++;
        for (int var3 = 0; var3 < 32768; var3++) {
            class116 var4 = class153.field2265[var3];
            if (var4 != null) {
                byte var5 = var4.field1763.field456;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method953(arg0 ^ 0xFFFFFFC8);
                    if ((var5 & 0x2) != 0 && var4.field1981 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1978[0] + var7;
                            int var10 = var4.field1976[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > (class69.field976 - var6 - 1)) {
                                var9 = class69.field976 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class285.field4328 - var6 - 1 < var10) {
                                var10 = class285.field4328 - var6 - 1;
                            }
                            int var11 = class422.method2633(var6, class309.field4655, var9, 0, var10, 0, class184.field2758[var4.field5826], var6, var4.field1976[0], -1, true, class4.field22, var6, (byte) -114, var4.field1978[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1978[var12] = class309.field4655[var11 - var12 - 1];
                                    var4.field1976[var12] = class4.field22[var11 - (var12 + 1)];
                                    var4.field1984[var12] = 1;
                                }
                                var4.field1981 = var11;
                            }
                        }
                    }
                    class34.method234(true, var4, arg0 ^ 0x12);
                    int var13 = class298.method1934((byte) -61, var4);
                    class66.method561(var13, class202.field3367, var4, false, class455.field6630);
                    class405.method2527((byte) -77, var4);
                }
            }
        }
        if (class500.field7185 == 0 && class197.field3291 == 0) {
            if (class176.field2611 == 2) {
                class467.method2823(1024);
            } else {
                class226.method1606(3);
            }
            if ((class412.field6180 >> 7) < 14 || class69.field976 - 14 <= class412.field6180 >> 7 || (class71.field1024 >> 7) < 14 || (class71.field1024 >> 7) >= (class285.field4328 - 14)) {
                class249.method1678(arg0 + 41);
            }
        }
        while (true) {
            class405 var14;
            class114 var15;
            class114 var16;
            do {
                var14 = (class405) class459.field6677.method1001(arg0 - 16179);
                if (var14 == null) {
                    while (true) {
                        class405 var17;
                        class114 var18;
                        class114 var19;
                        do {
                            var17 = (class405) class255.field3905.method1001(arg0 ^ 0xFFFFC0FD);
                            if (var17 == null) {
                                while (true) {
                                    class405 var20;
                                    class114 var21;
                                    class114 var22;
                                    do {
                                        var20 = (class405) class186.field2821.method1001(-16153);
                                        if (var20 == null) {
                                            if (class116.field1752 != null) {
                                                class518.method3068((byte) -122);
                                            }
                                            if ((class475.field6854 % 1500) == 0) {
                                                class227.method1613(126);
                                            }
                                            if (class429.field6373 == 6 && class500.field7185 == 0) {
                                                class436.method2698(false);
                                            }
                                            class37.method259(-1);
                                            if (arg0 != 26) {
                                                return;
                                            }
                                            if (class73.field1045 && (class493.method2937(-106) - 60000L) > class341.field5071) {
                                                class160.method1094(-35);
                                            }
                                            for (class160 var23 = (class160) class353.field5232.method1958(98); var23 != null; var23 = (class160) class353.field5232.method1961(-128)) {
                                                if ((long) var23.field2390 < class493.method2937(arg0 ^ 0xFFFFFF8D) / 1000L - 5L) {
                                                    if (var23.field2394 > 0) {
                                                        class475.method2854(var23.field2391 + class229.field3720.method1635(class224.field3673, (byte) 125), 0, "", -126, "", 5);
                                                    }
                                                    if (var23.field2394 == 0) {
                                                        class475.method2854(var23.field2391 + class315.field4751.method1635(class224.field3673, (byte) 121), 0, "", -127, "", 5);
                                                    }
                                                    var23.method526((byte) 63);
                                                }
                                            }
                                            if (class429.field6373 == 6 && class500.field7185 == 0) {
                                                if (class162.field2413 == null) {
                                                    class417.method2613(false, arg0 - 84);
                                                    return;
                                                }
                                                class345.field5101++;
                                                if (class345.field5101 > 50) {
                                                    class498.field7161++;
                                                    class74.method640(-29627, class186.field2822);
                                                }
                                                try {
                                                    if (class162.field2413 != null && class71.field1020.field3556 > 0) {
                                                        class82.field1195 += class71.field1020.field3556;
                                                        class162.field2413.method1969(class71.field1020.field3572, 0, (byte) -126, class71.field1020.field3556);
                                                        class345.field5101 = 0;
                                                        class71.field1020.field3556 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class417.method2613(false, -22);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field6004;
                                        if (var21.field1630 < 0) {
                                            break;
                                        }
                                        var22 = class475.method2864(true, var21.field1700);
                                    } while (var22 == null || var22.field1660 == null || var22.field1660.length <= var21.field1630 || var22.field1660[var21.field1630] != var21);
                                    class192.method1356(var20);
                                }
                            }
                            var18 = var17.field6004;
                            if (var18.field1630 < 0) {
                                break;
                            }
                            var19 = class475.method2864(true, var18.field1700);
                        } while (var19 == null || var19.field1660 == null || var18.field1630 >= var19.field1660.length || var19.field1660[var18.field1630] != var18);
                        class192.method1356(var17);
                    }
                }
                var15 = var14.field6004;
                if (var15.field1630 < 0) {
                    break;
                }
                var16 = class475.method2864(true, var15.field1700);
            } while (var16 == null || var16.field1660 == null || var15.field1630 >= var16.field1660.length || var16.field1660[var15.field1630] != var15);
            class192.method1356(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BIIIIIB[B)V", line = 1144)
    public static final void method1386(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, byte[] arg8) {
        field3304++;
        int var9 = -(arg6 >> 2);
        if (arg7 != -1) {
            method1383(100);
        }
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg8[var10001] += arg1[arg0++];
                int var14 = arg5++;
                arg8[var14] += arg1[arg0++];
                int var15 = arg5++;
                arg8[var15] += arg1[arg0++];
                int var16 = arg5++;
                arg8[var16] += arg1[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg8[var10001] += arg1[arg0++];
            }
            arg0 += arg4;
            arg5 += arg2;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Luq;)Lel;", line = 1190)
    public static final class386 method1387(class114 arg0) {
        class386 var1 = (class386) class459.field6685.method2585((byte) 114, ((long) arg0.field1644 << 32) + (long) arg0.field1630);
        return var1 == null ? arg0.field1651 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 1197)
    public final String method776(boolean arg0) {
        field3310++;
        String var2 = null;
        try {
            var2 = "[1)" + class390.field5842 + "," + class176.field2613 + "," + class69.field976 + "," + class285.field4328 + "|";
            if (class398.field5947 != null) {
                var2 = var2 + "2)" + class154.field2286 + "," + (class398.field5947.field1978[0] + class390.field5842) + "," + (class398.field5947.field1976[0] + class176.field2613) + "|";
            }
            var2 = var2 + "3)" + class96.field1384 + "|4)" + class193.field3258.field7248 + "|5)" + class32.method223((byte) 122) + "|6)" + class80.field1163 + "," + class76.field1105 + "|";
            var2 = var2 + "7)" + class193.field3258.method2987(arg0, class96.field1384) + "|";
            var2 = var2 + "8)" + class193.field3258.method2986(28721, class96.field1384) + "|";
            var2 = var2 + "9)" + class193.field3258.field7245 + "|";
            var2 = var2 + "10)" + class193.field3258.field7226 + "|";
            var2 = var2 + "11)" + class193.field3258.field7228 + "|";
            var2 = var2 + "12)" + class193.field3258.method938(class96.field1384, -111) + "|";
            var2 = var2 + "13)" + class494.field7129 + "|";
            var2 = var2 + "14)" + class429.field6373;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var3) {
            }
            var2 = var2 + "]";
        } catch (Throwable var4) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1229)
    public final void method758(boolean arg0) {
        field3298++;
        method1376(85);
        class8.method63(true);
        class366.method2291(0);
        class211.method1464((byte) 56);
        class234.method1634((byte) -61);
        class296.method1923((byte) -100);
        class152.method1046(false);
        class199.method1395(!arg0);
        class258.method1721(-83);
        class452.method2752(124);
        class431.method2675(3352);
        class143.method1025(-127);
        class412.method2587((byte) -98);
        class95.method759((byte) -120);
        class216.method1498((byte) -69);
        class6.method30(0);
        class56.method516((byte) -35);
        class480.method2885(123);
        class125.method922((byte) 91);
        class38.method363(1);
        class128.method940(-1);
        class109.method835((byte) 34);
        class338.method2129(-115);
        class137.method997(true);
        class310.method1986(-118);
        class307.method1967(4900);
        class313.method1996((byte) 113);
        class135.method988((byte) 94);
        class528.method3123(25);
        class406.method2545((byte) -84);
        class515.method3049(0);
        class13.method98(-18035);
        class464.method2810((byte) -90);
        class227.method1609(-1);
        class314.method2015(1);
        class329.method2086(!arg0);
        class124.method920((byte) 86);
        class103.method819(22);
        class120.method901(-76);
        class255.method1699(90);
        class501.method2970(16353);
        class518.method3074(-2);
        class459.method2780(102);
        class45.method471(0);
        class516.method3056(96);
        class18.method151(-1);
        class357.method2241((byte) 84);
        class186.method1233(-119);
        class110.method843((byte) -55);
        class507.method3020(-101);
        class458.method2777((byte) 125);
        class185.method1231(0);
        class208.method1444((byte) 44);
        class377.method2371((byte) -90);
        class371.method2330(3898);
        class130.method961(!arg0);
        class116.method879(0);
        class263.method1755((byte) 76);
        class509.method3033(-128);
        class491.method2922(25486);
        class172.method1149((byte) 116);
        class219.method1576(-1);
        class48.method479(-1);
        class149.method1041(true);
        class229.method1622(-121);
        class305.method1954((byte) 63);
        class224.method1600(0);
        class177.method1186(false);
        class309.method1977(-30891);
        class476.method2869(true);
        class217.method1506(false);
        class129.method949((byte) -13);
        class138.method1007(89);
        class195.method1363(25196);
        class155.method1064(120);
        class495.method2944((byte) 124);
        class293.method1908((byte) -107);
        class386.method2412((byte) 60);
        class521.method3104((byte) -70);
        class39.method376(true);
        class58.method521((byte) -74);
        class286.method1848(0);
        class426.method2665((byte) 94);
        class510.method3036(-38);
        class59.method524(94);
        class335.method2116(3);
        class505.method3007(0);
        class1.method2(12);
        class429.method2672((byte) -62);
        class445.method2735(0);
        class34.method235(8108);
        class424.method2648(4522);
        class231.method1627((byte) 10);
        class497.method2945(arg0);
        class198.method1371((byte) 76);
        class304.method1953(0);
        class270.method1787((byte) 109);
        class500.method2963((byte) 2);
        class22.method169(96);
        class189.method1331(5883);
        class121.method902(!arg0);
        class475.method2863(false);
        class193.method1357(47);
        class358.method2252((byte) 114);
        class477.method2872(true);
        class225.method1604(-12299);
        class69.method597(-104);
        class415.method2605(119);
        class145.method1029((byte) 54);
        class532.method3164(20052);
        class10.method70(-1091591193);
        class54.method508((byte) -75);
        class348.method2165(84);
        class341.method2145(0);
        class470.method2837(-127);
        class232.method1628(887);
        class291.method1877(true);
        class156.method1070((byte) 124);
        class333.method2108(125);
        class85.method712((byte) 77);
        class362.method2271((byte) -53);
        class14.method102((byte) 92);
        class108.method829(16383);
        class194.method1361((byte) 41);
        class91.method745(-119);
        class256.method1708(-7);
        class285.method1845(true);
        class275.method1809(-1540863314);
        class26.method185((byte) 22);
        class60.method528((byte) 108);
        class389.method2430((byte) 54);
        class455.method2768(117);
        class484.method2898(-15696);
        class118.method891(0);
        class354.method2226();
        class383.method2394(-93);
        class436.method2699((byte) 43);
        class524.method3113(0);
        class421.method2628((byte) -77);
        class334.method2111(31159);
        class113.method853((byte) -15);
        class192.method1347();
        class7.method50();
        class20.method162((byte) 96);
        class523.method3112(-2);
        class205.method1424();
        class249.method1683(-8009);
        class519.method3086(0);
        class75.method645((byte) 67);
        class257.method1716(true);
        class68.method587(1);
        class281.method1829(32768);
        class237.method1644(false);
        class239.method1650(85);
        class260.method1741(30);
        class98.method797(-27777);
        class63.method549(0);
        class210.method1456((byte) 72);
        class388.method2423((byte) -5);
        class465.method2815(-31840);
        class373.method2339(arg0);
        class77.method657((byte) 103);
        class12.method80((byte) 72);
        class191.method1339(0);
        class435.method2694(88);
        class316.method2019(-16);
        class520.method3095(true);
        class242.method1658(0);
        class529.method3131(-1);
        class94.method755(60);
        class378.method2373(-18639);
        class367.method2292(103);
        class65.method559(4);
        class276.method1818(32768);
        class259.method1735(true);
        class344.method2148((byte) 121);
        class106.method822((byte) -109);
        class90.method739();
        class351.method2181(71);
        class25.method182(91);
        class402.method2516(arg0);
        class405.method2532(50);
        class315.method2016((byte) 56);
        class457.method2775(-112);
        class207.method1430(114);
        class74.method641(18945);
        class396.method2494((byte) -109);
        class171.method1148((byte) 96);
        class303.method1949((byte) -94);
        class312.method1994(-25335);
        class168.method1128(0);
        class327.method2081(-126);
        class93.method750(true);
        class265.method1767((byte) -106);
        class180.method1203((byte) -117);
        class182.method1211(-112);
        class240.method1657(4626);
        class17.method144(57);
        class101.method808(0);
        class460.method2788(0);
        class342.method2147(-3216);
        class443.method2729(-99);
        class184.method1226(-4);
        class273.method1798(-128);
        class244.method1661((byte) -128);
        class123.method913(0);
        class398.method2505(0);
        class112.method851(20801);
        class411.method2579((byte) -46);
        class5.method18(25411);
        class169.method1131(false);
        class487.method2907(!arg0);
        class433.method2688(98);
        class409.method2571(-4353);
        class283.method1838(-17341);
        class71.method618(1);
        class36.method250(-122);
        class173.method1167(48);
        class223.method1595(1);
        class488.method2912(16);
        class359.method2257(-1);
        class150.method1042((byte) 91);
        class42.method397(true);
        class235.method1638();
        class262.method1749((byte) -58);
        class471.method2840(-4988);
        class530.method3141((byte) -58);
        class61.method530((byte) 16);
        class179.method1199(0);
        class387.method2420(84);
        class514.method3045(false);
        class368.method2296(-1);
        class290.method1867(98);
        class238.method1647((byte) 121);
        class200.method1402(!arg0);
        class250.method1690();
        class407.method2567(4);
        class363.method2278(Integer.MAX_VALUE);
        class355.method2230(37);
        class100.method807((byte) -121);
        class40.method382(-92);
        class517.method3063(-128);
        class353.method2214(arg0);
        class202.method1415(4);
        class508.method3027(0);
        class132.method968((byte) -125);
        class141.method1013(-1);
        class261.method1744(-15);
        class157.method1083(true);
        class165.method1099(0);
        class308.method1974(100);
        class46.method474(-60);
        class27.method186(12);
        class287.method1851((byte) -54);
        class89.method732((byte) -121);
        class440.method2709(false);
        class80.method677((byte) -88);
        class67.method575();
        class422.method2632(0);
        class213.method1477(108);
        class170.method1139();
        class269.method1783();
        class212.method1470();
        class151.method1043(false);
        class30.method199();
        class73.method637(4);
        class32.method222((byte) -96);
        class456.method2770((byte) -19);
        class107.method828(false);
        class423.method2638();
        class134.method978((byte) 10);
        class337.method2125(1);
        class420.method2624((byte) -117);
        class448.method2745(!arg0);
        class201.method1405(1025);
        class55.method510(arg0);
        class467.method2821(16);
        class167.method1126(110);
        class364.method2280((byte) 119);
        class473.method2845(-113);
        class425.method2653((byte) -124);
        class326.method2075((byte) -64);
        class347.method2160(0);
        class190.method1334(34);
        class233.method1630(true);
        class346.method2158(4);
        class64.method551((byte) 109);
        class266.method1772((byte) 103);
        class294.method1918(-116);
        class76.method650(-26878);
        class325.method2066(1711383713);
        class203.method1419(0);
        class485.method2902(113);
        class395.method2481(12577);
        class454.method2766(108);
        class361.method2269(true);
        class53.method506(false);
        class504.method2996((byte) 73);
        class481.method2887((byte) 116);
        class23.method172(-87);
        class428.method2668(true);
        class247.method1673();
        class482.method2891((byte) -84);
        class336.method2121(-32267);
        class298.method1933(9353);
        class142.method1018(-7477);
        class372.method2331((byte) -2);
        class299.method1936((byte) 95);
        class111.method848((byte) -93);
        class444.method2732(105);
        class271.method1791(arg0);
        class246.method1668(26198);
        class153.method1053(!arg0);
        class274.method1802(1);
        class401.method2514((byte) 82);
        class522.method3108((byte) -117);
        class375.method2358(false);
        class419.method2623(-20039);
        class434.method2691((byte) -128);
        class322.method2053((byte) 52);
        class78.method674(8);
        class131.method965((byte) 103);
        class450.method2746(64);
        class226.method1605(-81);
        class472.method2843((byte) -45);
        class175.method1172(-14198);
        class494.method2939(0);
        class282.method1836((byte) 46);
        class122.method909((byte) -128);
        class430.method2673(70);
        class264.method1765(0);
        class272.method1797(-103);
        class330.method2094();
        class370.method2324();
        class181.method1207(29737);
        class360.method2258(-1);
        class345.method2151(false);
        class483.method2896(-111);
        class390.method2431(1);
        class70.method607((byte) -17);
        class469.method2830(-20);
        class417.method2614((byte) -126);
        class404.method2526(20877);
        class349.method2175(-121);
        class146.method1035(-115);
        class468.method2827(5);
        class318.method2045((byte) -85);
        class379.method2381(true);
        class356.method2235(80);
        class432.method2680(26484);
        class339.method2139(-116);
        class511.method3039((byte) -52);
        class289.method1865(12961);
        class178.method1197(true);
        class176.method1175(-7107);
        class97.method786(-121);
        class221.method1590((byte) 90);
        class19.method155(-103);
        class525.method3118(-120);
        class331.method2099(false);
        class96.method778(-48);
        class220.method1583(94);
        class86.method717(arg0);
        class534.method3167(6798);
        class380.method2385(31);
        class397.method2501((byte) -58);
        class99.method805(4);
        class88.method728(!arg0);
        class268.method1778(62);
        class385.method2404((byte) -90);
        class447.method2740(-2);
        class301.method1943(-11260);
        class320.method2047(-99);
        class498.method2951(52);
        class277.method1823(-127);
        class319.method2046(-1);
        class416.method2608((byte) -118);
        class147.method1039(false);
        class446.method2737(0);
        class251.method1695(0);
        class49.method487((byte) -97);
        class280.method1828(arg0);
        class4.method14(-125);
        class139.method1010(22000);
        class267.method1776((byte) -124);
        class474.method2848(arg0);
        class403.method2524(-77);
        class160.method1095(false);
        class62.method545((byte) 47);
        class453.method2756((byte) -75);
        class183.method1220(8);
        class28.method193(false);
        class297.method1930(-25631);
        class52.method498(!arg0);
        class506.method3015((byte) -19);
        class162.method1097((byte) -120);
        class295.method1919((byte) -101);
        class350.method2179((byte) 100);
        class133.method975(2);
        class384.method2397((byte) -108);
        class2.method8(5);
        class382.method2392((byte) 58);
        class158.method1086(-103);
        class328.method2084((byte) -110);
        class66.method562((byte) 105);
        class503.method2990(-124);
        class197.method1370(88);
        class102.method812(true);
        class490.method2914((byte) 51);
        class486.method2905((byte) -85);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V", line = 1647)
    private final void method1388(int arg0, int arg1) {
        field3316++;
        class176.field2608 = null;
        class300.field4550 = 0;
        class322.field4831.field4730 = arg0;
        class322.field4831.field4732++;
        class486.field7000 = null;
        int var3 = 13 % ((arg1 + 60) / 57);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1666)
    public final void method766(int arg0) {
        field3306++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class225.method1603(arg0 - 50121);
        class78.field1136 = new class135(class360.field5349);
        class322.field4831 = new class313();
        if (class310.field4662 != class125.field1855) {
            class260.field3983 = new byte[50][];
        }
        if (arg0 != 50000) {
            field3313 = null;
        }
        class193.field3258 = new class128(class360.field5349);
        if (class310.field4662 == class125.field1855) {
            class397.field5936.field6311 = this.getCodeBase().getHost();
        } else if (class326.method2077((byte) 55, class310.field4662)) {
            class397.field5936.field6311 = this.getCodeBase().getHost();
            class397.field5936.field6310 = class397.field5936.field6307 + 40000;
            class12.field163.field6310 = class12.field163.field6307 + 40000;
            class225.field3674.field6310 = class225.field3674.field6307 + 40000;
            class397.field5936.field6312 = class397.field5936.field6307 + 50000;
            class12.field163.field6312 = class12.field163.field6307 + 50000;
            class225.field3674.field6312 = class225.field3674.field6307 + 50000;
        } else if (class310.field4662 == class261.field4007) {
            class397.field5936.field6311 = "127.0.0.1";
            class12.field163.field6311 = "127.0.0.1";
            class397.field5936.field6310 = class397.field5936.field6307 + 40000;
            class225.field3674.field6311 = "127.0.0.1";
            class12.field163.field6310 = class12.field163.field6307 + 40000;
            class397.field5936.field6312 = class397.field5936.field6307 + 50000;
            class225.field3674.field6310 = class225.field3674.field6307 + 40000;
            class12.field163.field6312 = class12.field163.field6307 + 50000;
            class225.field3674.field6312 = class225.field3674.field6307 + 50000;
        }
        if (class312.field4691 == class282.field4297) {
            class432.field6404 = false;
        }
        if (class86.field1228 == class312.field4691) {
            class34.field392 = true;
            class333.field4982 = 0;
            class18.field230 = class362.field5363;
            class282.field4289 = class138.field2097;
            class524.field7676 = 16777215;
            class309.field4660 = class385.field5784;
            class239.field3824 = class532.field7844;
        } else {
            class239.field3824 = class240.field3838;
            class309.field4660 = class296.field4507;
            class18.field230 = class534.field7863;
            class282.field4289 = class491.field7053;
        }
        class106.field1495 = class32.field375 = class480.field6913 = class244.field3853 = new short[256];
        class283.field4310 = class397.field5936;
        class101.field1456 = class383.method2393(-123, class111.field1557);
        class184.field2800 = class304.method1952(class111.field1557, true, (byte) 0);
        class358.field5319 = class265.method1769((byte) -27);
        if (class358.field5319 != null) {
            class358.field5319.method1979(class111.field1557, -127);
        }
        class293.field4452 = class352.field5196;
        try {
            if (class360.field5349.field5201 != null) {
                class494.field7130 = new class515(class360.field5349.field5201, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class467.field6758[var3] = new class515(class360.field5349.field5198[var3], 6000, 0);
                }
                class406.field6029 = new class515(class360.field5349.field5206, 6000, 0);
                class477.field6882 = new class196(255, class494.field7130, class406.field6029, 500000);
                class313.field4700 = new class515(class360.field5349.field5204, 24, 0);
                class360.field5349.field5198 = null;
                class360.field5349.field5206 = null;
                class360.field5349.field5204 = null;
                class360.field5349.field5201 = null;
            }
        } catch (IOException var4) {
            class477.field6882 = null;
            class494.field7130 = null;
            class313.field4700 = null;
            class406.field6029 = null;
        }
        if (class310.field4662 != class125.field1855) {
            class470.field6798 = true;
        }
        if (class312.field4691 == class282.field4297) {
            class483.field6942 = class386.field5809.method1635(class224.field3673, (byte) 5);
        } else if (class86.field1228 == class312.field4691) {
            class483.field6942 = class504.field7292.method1635(class224.field3673, (byte) 32);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Luq;)Z", line = 1793)
    public static final boolean method1389(class114 arg0) {
        if (class64.field780) {
            if (method1387(arg0).field5805 != 0) {
                return false;
            }
            if (arg0.field1585 == 0) {
                return false;
            }
        }
        return arg0.field1610;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1807)
    private final void method1390(boolean arg0) {
        field3312++;
        if (class322.field4831.field4732 > class87.field1247) {
            class283.field4310.field6308 = !class283.field4310.field6308;
            class487.field7010 = (class322.field4831.field4732 - 1) * 50 * 5;
            if (class487.field7010 > 3000) {
                class487.field7010 = 3000;
            }
            if (class322.field4831.field4732 >= 2 && class322.field4831.field4730 == 6) {
                this.method773("js5connect_outofdate", (byte) 89);
                class429.field6373 = 13;
                return;
            }
            if (class322.field4831.field4732 >= 4 && class322.field4831.field4730 == -1) {
                this.method773("js5crc", (byte) 77);
                class429.field6373 = 13;
                return;
            }
            if (class322.field4831.field4732 >= 4 && class88.method729(class429.field6373, (byte) -112)) {
                if (class322.field4831.field4730 == 7 || class322.field4831.field4730 == 9) {
                    this.method773("js5connect_full", (byte) 127);
                } else if (class322.field4831.field4730 <= 0) {
                    this.method773("js5io", (byte) 105);
                } else {
                    this.method773("js5connect", (byte) 57);
                }
                class429.field6373 = 13;
                return;
            }
        }
        class87.field1247 = class322.field4831.field4732;
        if (class487.field7010 > 0) {
            class487.field7010--;
            return;
        }
        try {
            if (class300.field4550 == 0) {
                class486.field7000 = class360.field5349.method2197(class283.field4310.method2649(0), class283.field4310.field6311, 0);
                class300.field4550++;
            }
            if (class300.field4550 == 1) {
                if (class486.field7000.field6570 == 2) {
                    this.method1388(1000, 75);
                    return;
                }
                if (class486.field7000.field6570 == 1) {
                    class300.field4550++;
                }
            }
            if (class300.field4550 == 2) {
                class176.field2608 = new class307((Socket) class486.field7000.field6569, class360.field5349);
                class217 var2 = new class217(5);
                var2.method1545(class518.field7546.field1077, -70);
                var2.method1566(true, 594);
                class176.field2608.method1969(var2.field3572, 0, (byte) -31, 5);
                class300.field4550++;
                class344.field5093 = class493.method2937(-125);
            }
            if (!arg0) {
                if (class300.field4550 == 3) {
                    if (class88.method729(class429.field6373, (byte) -106) || class176.field2608.method1970(true) > 0) {
                        int var3 = class176.field2608.method1968((byte) 56);
                        if (var3 != 0) {
                            this.method1388(var3, -122);
                            return;
                        }
                        class300.field4550++;
                    } else if (class493.method2937(-114) - class344.field5093 > 30000L) {
                        this.method1388(1001, 34);
                        return;
                    }
                }
                if (class300.field4550 == 4) {
                    boolean var4 = class429.field6373 == 1 || class482.method2890(-9108, class429.field6373) || class506.method3016(class429.field6373, -9);
                    class322.field4831.method2003(!var4, 0, class176.field2608);
                    class300.field4550 = 0;
                    class176.field2608 = null;
                    class486.field7000 = null;
                }
            }
        } catch (IOException var5) {
            this.method1388(1002, 62);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1946)
    public final void method770(int arg0) {
        if (arg0 > -10) {
            this.method770(-106);
        }
        field3299++;
        try {
            this.method1378(-85);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class185.method1229((byte) -80, 0);
            class88.method727(var3, 91, var3.getMessage() + " (Recovered) " + this.method776(false));
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1970)
    public static final void method1391(int arg0) {
        int var1 = class111.field1558;
        int[] var2 = class318.field4804;
        int var3 = class347.field5127 ? var1 : class167.field2471 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class129 var5;
            if (var4 < var1) {
                var5 = class26.field319[var2[var4]];
            } else {
                var5 = class153.field2265[class470.field6797[var4 - var1]];
            }
            if (var5.field5826 == arg0) {
                var5.field1905 = 0;
                if (var5.field1938 < 0) {
                    var5.field1948 = false;
                } else {
                    int var6 = var5.method953(-115);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field5837 & 0x7F) != 0 || (var5.field5833 & 0x7F) != 0) {
                            var5.field1948 = false;
                            continue;
                        }
                    } else if ((var5.field5837 & 0x7F) != 64 || (var5.field5833 & 0x7F) != 64) {
                        var5.field1948 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field5837 >> 7;
                        int var8 = var5.field5833 >> 7;
                        if (class359.field5327[var7][var8] != var5.field1938) {
                            var5.field1948 = true;
                            continue;
                        }
                        if (class406.field6030[var7][var8] > 1) {
                            var10002 = class406.field6030[var7][var8]--;
                            var5.field1948 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field5837 - var9 >> 7;
                        int var11 = var5.field5833 - var9 >> 7;
                        int var12 = var5.field5837 + var9 >> 7;
                        int var13 = var5.field5833 + var9 >> 7;
                        if (!class459.method2785(var13, var10, var12, var11, (byte) -21, var5.field1938)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class359.field5327[var14][var15] == var5.field1938) {
                                        var10002 = class406.field6030[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1948 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class177 && var5.field1986 != null && class475.field6854 >= var5.field1986.field5755 && class475.field6854 < var5.field1986.field5769) {
                        ((class177) var5).field2640 = false;
                    }
                    var5.field1948 = false;
                    var5.field5831 = class172.method1153(var5.field5826, -4, var5.field5837, var5.field5833);
                    class495.method2940(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 2088)
    public final void method771(boolean arg0) {
        field3305++;
        if (class73.field1045) {
            class160.method1094(-49);
        }
        if (class377.field5692 != null) {
            class377.field5692.method305(-26760);
        }
        if (class168.field2489 != null) {
            class366.method2289((byte) 77, class360.field5349, class168.field2489);
            class168.field2489 = null;
        }
        if (class162.field2413 != null) {
            class162.field2413.method1966(121);
            class162.field2413 = null;
        }
        if (class358.field5319 != null) {
            class358.field5319.method1985(class111.field1557, 11021);
        }
        class358.field5319 = null;
        class71.method620((byte) 51);
        class322.field4831.method2010((byte) 121);
        if (arg0) {
            field3297 = 45;
        }
        class78.field1136.method982(-4);
        if (class207.field3396 != null) {
            class207.field3396.method2923(-2);
            class207.field3396 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V", line = 2133)
    private final void method1392(byte arg0) {
        field3308++;
        if (class429.field6373 == 13) {
            return;
        }
        long var2 = class368.method2295(true) / 1000000L - class328.field4934;
        class328.field4934 = class368.method2295(true) / 1000000L;
        boolean var4 = class417.method2615((byte) 127);
        if (var4 && class459.field6673 && class532.field7841 != null) {
            class532.field7841.method1067(2000);
        }
        if (class406.method2544((byte) 117, class429.field6373)) {
            if (class295.field4505 != 0L && class493.method2937(-116) > class295.field4505) {
                class328.method2083(class32.method223((byte) 122), class193.field3258.field7231, class193.field3258.field7223, false, (byte) -126);
            } else if (!class377.field5692.method346() && class24.field296) {
                class257.method1713(arg0 ^ 0x4A3C);
            }
        }
        if (class168.field2489 == null) {
            Container var5;
            if (class281.field4281 == null) {
                var5 = class360.field5349.field5199;
            } else {
                var5 = class281.field4281;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class281.field4281 == var5) {
                Insets var8 = class281.field4281.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class468.field6769 != var6 || class173.field2593 != var7) {
                if (class377.field5692 == null || class377.field5692.method283()) {
                    class225.method1603(-112);
                } else {
                    class173.field2593 = var7;
                    class468.field6769 = var6;
                }
                class295.field4505 = class493.method2937(-125) + 500L;
            }
        }
        if (class168.field2489 != null && !class190.field3215 && class406.method2544((byte) 123, class429.field6373)) {
            class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) 80);
        }
        boolean var9 = false;
        if (class500.field7178) {
            var9 = true;
            class500.field7178 = false;
        }
        if (arg0 != -31) {
            method1389(null);
        }
        if (var9) {
            class456.method2771(arg0 + 31);
        }
        if (class377.field5692 != null && class377.field5692.method346() || class32.method223((byte) 118) != 1) {
            class152.method1044((byte) -122);
        }
        if (class429.field6373 == 0) {
            class309.method1978(class338.field5036[class168.field2478], class141.field2163, class249.field3883, (byte) -37, class335.field4997[class168.field2478], class472.field6822[class168.field2478], var9);
        } else if (class429.field6373 == 1) {
            class260.method1737(class472.field6822[class168.field2478].getRGB(), class377.field5692, class377.field5692.method346() | var9, class335.field4997[class168.field2478].getRGB(), class185.field2805, 2, class338.field5036[class168.field2478].getRGB());
        } else if (class429.field6373 == 2) {
            class317.method2042((byte) 118);
        } else if (class429.field6373 == 6) {
            class317.method2042((byte) 119);
        } else if (class412.method2586(arg0 ^ 0x58, class429.field6373)) {
            if (class155.field2312 == 1) {
                if (class232.field3753 > class5.field55) {
                    class5.field55 = class232.field3753;
                }
                int var10 = (class5.field55 - class232.field3753) * 50 / class5.field55;
                class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 117) + "<br>(" + var10 + "%)", true, class313.field4722);
            } else if (class155.field2312 == 2) {
                if (class475.field6863 > class416.field6201) {
                    class416.field6201 = class475.field6863;
                }
                int var11 = (class416.field6201 - class475.field6863) * 50 / class416.field6201 + 50;
                class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 44) + "<br>(" + var11 + "%)", true, class313.field4722);
            } else {
                class258.method1730(true, class59.field709.method1635(class224.field3673, (byte) 44), true, class313.field4722);
            }
        } else if (class429.field6373 == 9) {
            class221.method1589((byte) -33, var2);
        } else if (class429.field6373 == 12) {
            class258.method1730(true, class22.field276.method1635(class224.field3673, (byte) 121) + "<br>" + class348.field5145.method1635(class224.field3673, (byte) 120), true, class313.field4722);
        }
        if (class190.field3213 == 3) {
            for (int var12 = 0; var12 < class109.field1529; var12++) {
                Rectangle var13 = class273.field4183[var12];
                if (class74.field1049[var12]) {
                    class377.field5692.method364(var13.y, 1, -1996553985, var13.width, var13.x, var13.height);
                } else if (class8.field115[var12]) {
                    class377.field5692.method364(var13.y, 1, -1996554240, var13.width, var13.x, var13.height);
                }
            }
        }
        if (class87.method724(21326)) {
            class367.method2294(class377.field5692, (byte) 41);
        }
        if (class406.method2544((byte) 122, class429.field6373) && class190.field3213 == 0 && class32.method223((byte) 127) == 1 && !var9 && class352.field5188.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class109.field1529; var15++) {
                if (class8.field115[var15]) {
                    class8.field115[var15] = false;
                    class280.field4228[var14++] = class273.field4183[var15];
                }
            }
            class377.field5692.method264(class280.field4228, var14);
        } else if (class429.field6373 != 0) {
            class377.field5692.method357();
            for (int var16 = 0; var16 < class109.field1529; var16++) {
                class8.field115[var16] = false;
            }
        }
        if (class193.field3258.field7243 == 0) {
            class434.method2690(10, 15L);
        } else if (class193.field3258.field7243 == 1) {
            class434.method2690(arg0 + 41, 10L);
        } else if (class193.field3258.field7243 == 2) {
            class434.method2690(10, 5L);
        } else if (class193.field3258.field7243 == 3) {
            class434.method2690(10, 2L);
        }
        if (class417.field6208) {
            class353.method2212(arg0 ^ 0xFFFFFFFE);
        }
        if (class193.field3258.field7252 && class429.field6373 == 2 && class155.field2310 != -1) {
            class193.field3258.field7252 = false;
            class193.field3258.method933((byte) 78, class360.field5349);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Luq;IIIIIIIII)V", line = 2369)
    public static final void method1393(class114[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class114 var11 = arg0[var10];
            if (var11 != null && var11.field1700 == arg1) {
                int var12 = var11.field1646 + arg6;
                int var13 = var11.field1701 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field1585 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field1642 + var12;
                    int var19 = var11.field1627 + var13;
                    if (var11.field1585 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field1585 == 0 || var11.field1603 || method1387(var11).field5805 != 0 || class472.field6819 == var11 || class120.field1813 == var11.field1592) {
                    if (!method1389(var11)) {
                        if (class116.field1752 == var11) {
                            class483.field6957 = true;
                            class291.field4428 = var12;
                            class506.field7389 = var13;
                        }
                        if (var11.field1588 || var14 < var16 && var15 < var17) {
                            if (var11.field1654 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class405 var20 = (class405) class186.field2821.method1004((byte) -92); var20 != null; var20 = (class405) class186.field2821.method996(1)) {
                                    if (var20.field5998) {
                                        var20.method2677(-22491);
                                        var20.field6004.field1716 = false;
                                    }
                                }
                                if (class223.field3661 == 0) {
                                    class116.field1752 = null;
                                    class472.field6819 = null;
                                }
                                class76.field1102 = 0;
                                class398.field5955 = false;
                                class406.field6044 = false;
                                if (!class307.field4631) {
                                    class161.method1096(15036);
                                }
                            }
                            boolean var21;
                            if (class184.field2800.method542(false) >= var14 && class184.field2800.method543(true) >= var15 && class184.field2800.method542(false) < var16 && class184.field2800.method543(true) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class245.field3859 && var21) {
                                if (var11.field1591 >= 0) {
                                    class287.field4348 = var11.field1591;
                                } else if (var11.field1654) {
                                    class287.field4348 = -1;
                                }
                            }
                            if (!class307.field4631 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class25.method180(arg9 - var13, arg8 - var12, var11, 0);
                            }
                            boolean var22 = false;
                            if (class184.field2800.method540(101) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class28 var24 = (class28) class102.field1459.method1004((byte) -57);
                            if (var24 != null && var24.method190(16711680) == 0 && var24.method195((byte) 75) >= var14 && var24.method194(2170) >= var15 && var24.method195((byte) 47) < var16 && var24.method194(2170) < var17) {
                                var23 = true;
                            }
                            if (var11.field1707 != null) {
                                for (int var25 = 0; var25 < var11.field1707.length; var25++) {
                                    if (class101.field1456.method1045(var11.field1707[var25], (byte) 106)) {
                                        if (var11.field1726 == null || class475.field6854 >= var11.field1726[var25]) {
                                            byte var26 = var11.field1685[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class101.field1456.method1045(86, (byte) 109) && !class101.field1456.method1045(82, (byte) -12) && !class101.field1456.method1045(81, (byte) -78)) && ((var26 & 0x2) == 0 || class101.field1456.method1045(86, (byte) -67)) && ((var26 & 0x1) == 0 || class101.field1456.method1045(82, (byte) 121)) && ((var26 & 0x4) == 0 || class101.field1456.method1045(81, (byte) 94))) {
                                                if (var25 < 10) {
                                                    class385.method2405(var11.field1644, "", (byte) -31, -1, var25 + 1);
                                                } else if (var25 == 10) {
                                                    class329.method2090(-1);
                                                    class386 var27 = method1387(var11);
                                                    class520.method3101(var11, var27.field5802, -103, var27.method2410(-16758));
                                                    class412.field6176 = class260.method1742(var11, (byte) -121);
                                                    if (class412.field6176 == null) {
                                                        class412.field6176 = "Null";
                                                    }
                                                    class190.field3206 = var11.field1600 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field1682[var25];
                                                if (var11.field1726 == null) {
                                                    var11.field1726 = new int[var11.field1707.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field1726[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field1726[var25] = class475.field6854 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field1726 != null) {
                                        var11.field1726[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class194.method1360(var24.method194(2170) - var13, var11, var24.method195((byte) 65) - var12, (byte) 117);
                            }
                            if (class116.field1752 != null && class116.field1752 != var11 && var21 && method1387(var11).method2415(6840)) {
                                class313.field4712 = var11;
                            }
                            if (class472.field6819 == var11) {
                                class139.field2127 = true;
                                class81.field1178 = var12;
                                class18.field235 = var13;
                            }
                            if (var11.field1603 || var11.field1592 != 0) {
                                if (var21 && class333.field4974 != 0 && var11.field1669 != null) {
                                    class405 var29 = new class405();
                                    var29.field5998 = true;
                                    var29.field6004 = var11;
                                    var29.field6007 = class333.field4974;
                                    var29.field6008 = var11.field1669;
                                    class186.field2821.method994(var29, -3610);
                                }
                                if (class116.field1752 != null || class307.field4631 || class58.field702 != var11.field1592 && class76.field1102 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field1592 != 0) {
                                    if (class396.field5910 == var11.field1592 || class404.field5989 == var11.field1592) {
                                        class474.field6836 = var11;
                                        if (class32.field377 != null) {
                                            class32.field377.method1619((byte) 87, class377.field5692, var11.field1627);
                                        }
                                        if (class396.field5910 == var11.field1592) {
                                            if (!class307.field4631 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class251.method1693(arg9, arg8, class377.field5692, 23766);
                                                for (class112 var30 = (class112) class259.field3974.method1958(93); var30 != null; var30 = (class112) class259.field3974.method1961(-73)) {
                                                    if (arg8 >= var30.field1567 && arg8 < var30.field1570 && arg9 >= var30.field1565 && arg9 < var30.field1563) {
                                                        class161.method1096(15036);
                                                        class475.method2856(2099, var30.field1561);
                                                    }
                                                }
                                            }
                                            class180.method1202(false, var11, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class120.field1813 == var11.field1592) {
                                        if (var11.method871(-126, class377.field5692) == null || class364.field5384 != 0 && class364.field5384 != 3 || class307.field4631 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field1615[var32];
                                        if (var31 < var33 || var31 > var11.field1617[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field1642 / 2;
                                        int var35 = var32 - var11.field1627 / 2;
                                        int var36;
                                        if (class176.field2611 == 4) {
                                            var36 = (int) class473.field6830 & 0x3FFF;
                                        } else {
                                            var36 = (int) class473.field6830 + class162.field2414 & 0x3FFF;
                                        }
                                        int var37 = class281.field4278[var36];
                                        int var38 = class281.field4279[var36];
                                        if (class176.field2611 != 4) {
                                            var37 = (class4.field23 + 256) * var37 >> 8;
                                            var38 = (class4.field23 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class176.field2611 == 4) {
                                            var41 = (class222.field3637 >> 7) + (var39 >> 2);
                                            var42 = (class476.field6868 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class398.field5947.method953(-83) - 1) * 64;
                                            var41 = (class398.field5947.field5837 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class398.field5947.field5833 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class245.field3859 && (class366.field5390 & 0x40) != 0) {
                                            class114 var44 = class181.method1210(class358.field5318, -2, class371.field5524);
                                            if (var44 == null) {
                                                class329.method2090(-1);
                                            } else {
                                                class168.method1127(var11.field1670, " ->", var41, var42, true, 5, false, class412.field6176, -62, class424.field6317, 1L);
                                            }
                                            continue;
                                        }
                                        if (class86.field1228 == class312.field4691) {
                                            class168.method1127(-1, "", var41, var42, true, 50, false, class133.field2036.method1635(class224.field3673, (byte) 22), -115, -1, 1L);
                                        }
                                        class168.method1127(-1, "", var41, var42, true, 8, false, class411.field6113, -70, class259.field3976, 1L);
                                        continue;
                                    }
                                    if (class58.field702 == var11.field1592) {
                                        class401.field5962 = var11;
                                        if (var21) {
                                            class398.field5955 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method195((byte) 59) - var12 - var11.field1642 / 2) * 2.0D / (double) class7.field91);
                                            int var46 = (int) (-((double) (var24.method194(2170) - var13 - var11.field1627 / 2) * 2.0D / (double) class7.field91));
                                            int var47 = class136.field2074 + var45 + class7.field106;
                                            int var48 = class319.field4810 + var46 + class7.field103;
                                            class48 var49 = class333.method2103((byte) 58);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method482(var50, var48, var47, true);
                                            if (var50 != null) {
                                                if (class101.field1456.method1045(82, (byte) 110) && class417.field6224 > 0) {
                                                    class357.method2245(false, var50[0], var50[2], var50[1]);
                                                    continue;
                                                }
                                                class406.field6044 = true;
                                                class66.field859 = var50[0];
                                                class25.field316 = var50[1];
                                                class76.field1101 = var50[2];
                                            }
                                            class76.field1102 = 1;
                                            class280.field4236 = false;
                                            class447.field6554 = class184.field2800.method542(false);
                                            class419.field6264 = class184.field2800.method543(true);
                                            continue;
                                        }
                                        if (var22 && class76.field1102 > 0) {
                                            if (class76.field1102 == 1 && (class447.field6554 != class184.field2800.method542(false) || class419.field6264 != class184.field2800.method543(true))) {
                                                class312.field4696 = class136.field2074;
                                                class263.field4050 = class319.field4810;
                                                class76.field1102 = 2;
                                            }
                                            if (class76.field1102 == 2) {
                                                class280.field4236 = true;
                                                class8.method60(-121, class312.field4696 + (int) ((double) (class447.field6554 - class184.field2800.method542(false)) * 2.0D / (double) class7.field92));
                                                class193.method1358(class263.field4050 - (int) ((double) (class419.field6264 - class184.field2800.method543(true)) * 2.0D / (double) class7.field92), false);
                                            }
                                            continue;
                                        }
                                        if (class76.field1102 > 0 && !class280.field4236) {
                                            if ((class154.field2289 == 1 || class2.method5(-2001)) && class382.field5752 > 2) {
                                                class119.method895(23145, class447.field6554, class419.field6264);
                                            } else if (class431.method2676(103)) {
                                                class119.method895(23145, class447.field6554, class419.field6264);
                                            }
                                        }
                                        class76.field1102 = 0;
                                        continue;
                                    }
                                    if (class2.field13 == var11.field1592) {
                                        if (var22) {
                                            class85.method711(class184.field2800.method542(false) - var12, 7, var11.field1642, var11.field1627, class184.field2800.method543(true) - var13);
                                        }
                                        continue;
                                    }
                                    if (class477.field6879 == var11.field1592) {
                                        class183.method1222(var11, var13, 0, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field1671 && var23) {
                                    var11.field1671 = true;
                                    if (var11.field1722 != null) {
                                        class405 var51 = new class405();
                                        var51.field5998 = true;
                                        var51.field6004 = var11;
                                        var51.field5994 = var24.method195((byte) 96) - var12;
                                        var51.field6007 = var24.method194(2170) - var13;
                                        var51.field6008 = var11.field1722;
                                        class186.field2821.method994(var51, -3610);
                                    }
                                }
                                if (var11.field1671 && var22 && var11.field1634 != null) {
                                    class405 var52 = new class405();
                                    var52.field5998 = true;
                                    var52.field6004 = var11;
                                    var52.field5994 = class184.field2800.method542(false) - var12;
                                    var52.field6007 = class184.field2800.method543(true) - var13;
                                    var52.field6008 = var11.field1634;
                                    class186.field2821.method994(var52, -3610);
                                }
                                if (var11.field1671 && !var22) {
                                    var11.field1671 = false;
                                    if (var11.field1645 != null) {
                                        class405 var53 = new class405();
                                        var53.field5998 = true;
                                        var53.field6004 = var11;
                                        var53.field5994 = class184.field2800.method542(false) - var12;
                                        var53.field6007 = class184.field2800.method543(true) - var13;
                                        var53.field6008 = var11.field1645;
                                        class255.field3905.method994(var53, -3610);
                                    }
                                }
                                if (var22 && var11.field1609 != null) {
                                    class405 var54 = new class405();
                                    var54.field5998 = true;
                                    var54.field6004 = var11;
                                    var54.field5994 = class184.field2800.method542(false) - var12;
                                    var54.field6007 = class184.field2800.method543(true) - var13;
                                    var54.field6008 = var11.field1609;
                                    class186.field2821.method994(var54, -3610);
                                }
                                if (!var11.field1716 && var21) {
                                    var11.field1716 = true;
                                    if (var11.field1576 != null) {
                                        class405 var55 = new class405();
                                        var55.field5998 = true;
                                        var55.field6004 = var11;
                                        var55.field5994 = class184.field2800.method542(false) - var12;
                                        var55.field6007 = class184.field2800.method543(true) - var13;
                                        var55.field6008 = var11.field1576;
                                        class186.field2821.method994(var55, -3610);
                                    }
                                }
                                if (var11.field1716 && var21 && var11.field1679 != null) {
                                    class405 var56 = new class405();
                                    var56.field5998 = true;
                                    var56.field6004 = var11;
                                    var56.field5994 = class184.field2800.method542(false) - var12;
                                    var56.field6007 = class184.field2800.method543(true) - var13;
                                    var56.field6008 = var11.field1679;
                                    class186.field2821.method994(var56, -3610);
                                }
                                if (var11.field1716 && !var21) {
                                    var11.field1716 = false;
                                    if (var11.field1729 != null) {
                                        class405 var57 = new class405();
                                        var57.field5998 = true;
                                        var57.field6004 = var11;
                                        var57.field5994 = class184.field2800.method542(false) - var12;
                                        var57.field6007 = class184.field2800.method543(true) - var13;
                                        var57.field6008 = var11.field1729;
                                        class255.field3905.method994(var57, -3610);
                                    }
                                }
                                if (var11.field1629 != null) {
                                    class405 var58 = new class405();
                                    var58.field6004 = var11;
                                    var58.field6008 = var11.field1629;
                                    class459.field6677.method994(var58, -3610);
                                }
                                if (var11.field1595 != null && class359.field5332 > var11.field1690) {
                                    if (var11.field1737 == null || class359.field5332 - var11.field1690 > 32) {
                                        class405 var63 = new class405();
                                        var63.field6004 = var11;
                                        var63.field6008 = var11.field1595;
                                        class186.field2821.method994(var63, -3610);
                                    } else {
                                        label691: for (int var59 = var11.field1690; var59 < class359.field5332; var59++) {
                                            int var60 = class525.field7689[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field1737.length; var61++) {
                                                if (var11.field1737[var61] == var60) {
                                                    class405 var62 = new class405();
                                                    var62.field6004 = var11;
                                                    var62.field6008 = var11.field1595;
                                                    class186.field2821.method994(var62, -3610);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1690 = class359.field5332;
                                }
                                if (var11.field1665 != null && class167.field2465 > var11.field1612) {
                                    if (var11.field1731 == null || class167.field2465 - var11.field1612 > 32) {
                                        class405 var68 = new class405();
                                        var68.field6004 = var11;
                                        var68.field6008 = var11.field1665;
                                        class186.field2821.method994(var68, -3610);
                                    } else {
                                        label667: for (int var64 = var11.field1612; var64 < class167.field2465; var64++) {
                                            int var65 = class65.field846[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field1731.length; var66++) {
                                                if (var11.field1731[var66] == var65) {
                                                    class405 var67 = new class405();
                                                    var67.field6004 = var11;
                                                    var67.field6008 = var11.field1665;
                                                    class186.field2821.method994(var67, -3610);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1612 = class167.field2465;
                                }
                                if (var11.field1694 != null && class112.field1568 > var11.field1672) {
                                    if (var11.field1653 == null || class112.field1568 - var11.field1672 > 32) {
                                        class405 var73 = new class405();
                                        var73.field6004 = var11;
                                        var73.field6008 = var11.field1694;
                                        class186.field2821.method994(var73, -3610);
                                    } else {
                                        label643: for (int var69 = var11.field1672; var69 < class112.field1568; var69++) {
                                            int var70 = class219.field3594[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field1653.length; var71++) {
                                                if (var11.field1653[var71] == var70) {
                                                    class405 var72 = new class405();
                                                    var72.field6004 = var11;
                                                    var72.field6008 = var11.field1694;
                                                    class186.field2821.method994(var72, -3610);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1672 = class112.field1568;
                                }
                                if (var11.field1596 != null && class134.field2054 > var11.field1734) {
                                    if (var11.field1712 == null || class134.field2054 - var11.field1734 > 32) {
                                        class405 var78 = new class405();
                                        var78.field6004 = var11;
                                        var78.field6008 = var11.field1596;
                                        class186.field2821.method994(var78, -3610);
                                    } else {
                                        label619: for (int var74 = var11.field1734; var74 < class134.field2054; var74++) {
                                            int var75 = class372.field5540[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field1712.length; var76++) {
                                                if (var11.field1712[var76] == var75) {
                                                    class405 var77 = new class405();
                                                    var77.field6004 = var11;
                                                    var77.field6008 = var11.field1596;
                                                    class186.field2821.method994(var77, -3610);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1734 = class134.field2054;
                                }
                                if (var11.field1687 != null && class266.field4083 > var11.field1635) {
                                    if (var11.field1606 == null || class266.field4083 - var11.field1635 > 32) {
                                        class405 var83 = new class405();
                                        var83.field6004 = var11;
                                        var83.field6008 = var11.field1687;
                                        class186.field2821.method994(var83, -3610);
                                    } else {
                                        label595: for (int var79 = var11.field1635; var79 < class266.field4083; var79++) {
                                            int var80 = class221.field3627[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field1606.length; var81++) {
                                                if (var11.field1606[var81] == var80) {
                                                    class405 var82 = new class405();
                                                    var82.field6004 = var11;
                                                    var82.field6008 = var11.field1687;
                                                    class186.field2821.method994(var82, -3610);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1635 = class266.field4083;
                                }
                                if (class59.field712 > var11.field1604 && var11.field1713 != null) {
                                    class405 var84 = new class405();
                                    var84.field6004 = var11;
                                    var84.field6008 = var11.field1713;
                                    class186.field2821.method994(var84, -3610);
                                }
                                if (class534.field7856 > var11.field1604 && var11.field1725 != null) {
                                    class405 var85 = new class405();
                                    var85.field6004 = var11;
                                    var85.field6008 = var11.field1725;
                                    class186.field2821.method994(var85, -3610);
                                }
                                if (class150.field2242 > var11.field1604 && var11.field1668 != null) {
                                    class405 var86 = new class405();
                                    var86.field6004 = var11;
                                    var86.field6008 = var11.field1668;
                                    class186.field2821.method994(var86, -3610);
                                }
                                if (class510.field7460 > var11.field1604 && var11.field1705 != null) {
                                    class405 var87 = new class405();
                                    var87.field6004 = var11;
                                    var87.field6008 = var11.field1705;
                                    class186.field2821.method994(var87, -3610);
                                }
                                if (class127.field1857 > var11.field1604 && var11.field1676 != null) {
                                    class405 var88 = new class405();
                                    var88.field6004 = var11;
                                    var88.field6008 = var11.field1676;
                                    class186.field2821.method994(var88, -3610);
                                }
                                var11.field1604 = class152.field2263;
                                if (var11.field1618 != null) {
                                    for (int var89 = 0; var89 < class68.field877; var89++) {
                                        class405 var90 = new class405();
                                        var90.field6004 = var11;
                                        var90.field6003 = class457.field6655[var89].method1215((byte) -128);
                                        var90.field5999 = class457.field6655[var89].method1221(15030);
                                        var90.field6008 = var11.field1618;
                                        class186.field2821.method994(var90, -3610);
                                    }
                                }
                                if (class532.field7786 && var11.field1742 != null) {
                                    class405 var91 = new class405();
                                    var91.field6004 = var11;
                                    var91.field6008 = var11.field1742;
                                    class186.field2821.method994(var91, -3610);
                                }
                            }
                            if (var11.field1585 == 5 && var11.field1667 != -1) {
                                var11.method866(class517.field7530, class138.field2098, -20777).method1619((byte) 29, class377.field5692, var11.field1627);
                            }
                            class454.method2758(var11, false);
                            if (var11.field1585 == 0) {
                                method1393(arg0, var11.field1644, var14, var15, var16, var17, var12 - var11.field1628, var13 - var11.field1735, arg8, arg9);
                                if (var11.field1660 != null) {
                                    method1393(var11.field1660, var11.field1644, var14, var15, var16, var17, var12 - var11.field1628, var13 - var11.field1735, arg8, arg9);
                                }
                                class293 var92 = (class293) class70.field993.method2585((byte) 114, (long) var11.field1644);
                                if (var92 != null) {
                                    if (class312.field4691 == class282.field4297 && var92.field4453 == 0 && !class307.field4631 && var21 && !class64.field780) {
                                        class161.method1096(15036);
                                    }
                                    class202.method1413(arg9, var17, var15, 115, var92.field4454, var12, arg8, var16, var13, var14);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class454.method2758(var11, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V", line = 3271)
    private final void method1394(byte arg0) {
        field3296++;
        if (arg0 > -42) {
            this.method770(-43);
        }
        if (!class193.field3258.field7252) {
            for (int var2 = 0; var2 < class68.field877; var2++) {
                if (class457.field6655[var2].method1221(15030) == 's' || class457.field6655[var2].method1221(15030) == 'S') {
                    class193.field3258.field7252 = true;
                    break;
                }
            }
        }
        if (class199.field3322 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class493.method2937(-59);
            if (class63.field771 == 0L) {
                class63.field771 = var5;
            }
            if (var4 > 16384 && (var5 - class63.field771) < 5000L) {
                if (var5 - class366.field5392 > 1000L) {
                    System.gc();
                    class366.field5392 = var5;
                }
                class249.field3883 = class26.field318.method1635(class224.field3673, (byte) 123);
                class141.field2163 = 5;
            } else {
                class249.field3883 = class470.field6796.method1635(class224.field3673, (byte) -78);
                class141.field2163 = 5;
                class199.field3322 = 10;
            }
        } else if (class199.field3322 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class184.field2758[var7] = class25.method181((byte) 49, class285.field4328, class69.field976);
            }
            class249.field3883 = class530.field7748.method1635(class224.field3673, (byte) 124);
            class199.field3322 = 20;
            class141.field2163 = 10;
        } else if (class199.field3322 == 20) {
            if (class378.field5707 == null) {
                class378.field5707 = new class82(class322.field4831, class78.field1136);
            }
            if (class378.field5707.method692(8)) {
                class203.field3371 = class308.method1975(true, (byte) 122, 1, false, 0);
                class304.field4590 = class308.method1975(true, (byte) 122, 1, false, 1);
                class120.field1812 = class308.method1975(true, (byte) 122, 1, false, 2);
                class525.field7684 = class308.method1975(true, (byte) 122, 1, false, 3);
                class338.field5040 = class308.method1975(true, (byte) 122, 1, false, 4);
                class430.field6378 = class308.method1975(true, (byte) 122, 1, true, 5);
                class313.field4720 = class308.method1975(false, (byte) 122, 1, true, 6);
                class524.field7677 = class308.method1975(true, (byte) 122, 1, false, 7);
                class176.field2627 = class308.method1975(true, (byte) 122, 1, false, 8);
                class431.field6387 = class308.method1975(true, (byte) 122, 1, false, 9);
                class5.field44 = class308.method1975(true, (byte) 122, 1, false, 10);
                class103.field1485 = class308.method1975(true, (byte) 122, 1, false, 11);
                class491.field7054 = class308.method1975(true, (byte) 122, 1, false, 12);
                class152.field2264 = class308.method1975(true, (byte) 122, 1, false, 13);
                class409.field6102 = class308.method1975(false, (byte) 122, 1, false, 14);
                class341.field5069 = class308.method1975(true, (byte) 122, 1, false, 15);
                class80.field1152 = class308.method1975(true, (byte) 122, 1, false, 16);
                class282.field4287 = class308.method1975(true, (byte) 122, 1, false, 17);
                class217.field3527 = class308.method1975(true, (byte) 122, 1, false, 18);
                class522.field7634 = class308.method1975(true, (byte) 122, 1, false, 19);
                class293.field4448 = class308.method1975(true, (byte) 122, 1, false, 20);
                class262.field4020 = class308.method1975(true, (byte) 122, 1, false, 21);
                class180.field2704 = class308.method1975(true, (byte) 122, 1, false, 22);
                class373.field5555 = class308.method1975(true, (byte) 122, 1, true, 23);
                class356.field5275 = class308.method1975(true, (byte) 122, 1, false, 24);
                class178.field2688 = class308.method1975(true, (byte) 122, 1, false, 25);
                class458.field6666 = class308.method1975(true, (byte) 122, 1, true, 26);
                class421.field6269 = class308.method1975(true, (byte) 122, 1, false, 27);
                class358.field5321 = class308.method1975(true, (byte) 122, 1, true, 28);
                class110.field1539 = class308.method1975(true, (byte) 122, 1, false, 29);
                class249.field3883 = class520.field7610.method1635(class224.field3673, (byte) 126);
                class199.field3322 = 30;
                class141.field2163 = 15;
            } else {
                class249.field3883 = class273.field4186.method1635(class224.field3673, (byte) 22);
                class141.field2163 = 12;
            }
        } else if (class199.field3322 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class468.field6770[var9].method3125(true) * class193.field3261[var9] / 100;
            }
            if (var8 == 100) {
                class249.field3883 = class145.field2202.method1635(class224.field3673, (byte) -125);
                class141.field2163 = 20;
                class286.method1849(true, class176.field2627);
                class147.method1037(0, class176.field2627);
                class199.field3322 = 40;
            } else {
                if (var8 != 0) {
                    class249.field3883 = class525.field7687.method1635(class224.field3673, (byte) -53) + var8 + "%";
                }
                class141.field2163 = 20;
            }
        } else if (class199.field3322 == 40) {
            if (class358.field5321.method2563(119)) {
                this.method1380(class358.field5321.method2558(1, 83), true);
                class249.field3883 = class472.field6821.method1635(class224.field3673, (byte) 126);
                class199.field3322 = 50;
                class141.field2163 = 25;
            } else {
                class249.field3883 = class447.field6545.method1635(class224.field3673, (byte) -92) + class358.field5321.method2539((byte) -87) + "%";
                class141.field2163 = 25;
            }
        } else if (class199.field3322 == 50) {
            class436.method2697(-125);
            class249.field3883 = class93.field1313.method1635(class224.field3673, (byte) -34);
            class141.field2163 = 30;
            class199.field3322 = 60;
        } else if (class199.field3322 == 60) {
            int var10 = class240.method1655(class152.field2264, class176.field2627, 109);
            int var11 = class530.method3140((byte) 95);
            if (var10 < var11) {
                class249.field3883 = class281.field4277.method1635(class224.field3673, (byte) 127) + var10 * 100 / var11 + "%";
                class141.field2163 = 35;
            } else {
                class249.field3883 = class96.field1379.method1635(class224.field3673, (byte) -60);
                class141.field2163 = 35;
                class199.field3322 = 70;
            }
        } else if (class199.field3322 == 70) {
            int var12 = class522.method3109(-125, class176.field2627);
            int var13 = class188.method1316(-76);
            if (var12 < var13) {
                class249.field3883 = class457.field6646.method1635(class224.field3673, (byte) 9) + var12 * 100 / var13 + "%";
                class141.field2163 = 40;
            } else {
                class249.field3883 = class60.field715.method1635(class224.field3673, (byte) -118);
                class141.field2163 = 40;
                class199.field3322 = 80;
            }
        } else if (class199.field3322 == 80) {
            if (class458.field6666.method2563(127)) {
                class475.field6861 = new class68(class458.field6666, class431.field6387, class176.field2627);
                class249.field3883 = class477.field6881.method1635(class224.field3673, (byte) -82);
                class141.field2163 = 45;
                class199.field3322 = 90;
            } else {
                class249.field3883 = class363.field5368.method1635(class224.field3673, (byte) -3) + class458.field6666.method2539((byte) -74) + "%";
                class141.field2163 = 45;
            }
        } else if (class199.field3322 == 90) {
            class249.field3883 = class14.field204.method1635(class224.field3673, (byte) 123);
            class141.field2163 = 50;
            class199.field3322 = 95;
        } else if (class199.field3322 == 95) {
            if (class193.field3258.field7252) {
                class193.field3258.field7248 = 0;
                class193.field3258.field7235 = 0;
                class193.field3258.field7217 = 0;
                class193.field3258.field7230 = 0;
                class193.field3258.field7214 = 1;
            }
            class193.field3258.field7252 = true;
            class193.field3258.method933((byte) 78, class360.field5349);
            class371.method2328(false, class193.field3258.field7230, true);
            class249.field3883 = class232.field3747.method1635(class224.field3673, (byte) 117);
            class199.field3322 = 100;
            class141.field2163 = 55;
        } else if (class199.field3322 == 100) {
            class467.method2822(class377.field5692, true, class152.field2264, class176.field2627);
            class249.field3883 = class422.field6288.method1635(class224.field3673, (byte) 126);
            class141.field2163 = 60;
            class74.method643(1, (byte) -119);
            class199.field3322 = 110;
        } else if (class199.field3322 == 110) {
            class120.field1812.method2563(126);
            byte var14 = 0;
            int var15 = var14 + class120.field1812.method2539((byte) -86);
            class80.field1152.method2563(96);
            int var16 = var15 + class80.field1152.method2539((byte) -73);
            class282.field4287.method2563(109);
            int var17 = var16 + class282.field4287.method2539((byte) -93);
            class217.field3527.method2563(110);
            int var18 = var17 + class217.field3527.method2539((byte) -124);
            class522.field7634.method2563(103);
            int var19 = var18 + class522.field7634.method2539((byte) -70);
            class293.field4448.method2563(114);
            int var20 = var19 + class293.field4448.method2539((byte) -123);
            class262.field4020.method2563(113);
            int var21 = var20 + class262.field4020.method2539((byte) -66);
            class180.field2704.method2563(114);
            int var22 = var21 + class180.field2704.method2539((byte) -83);
            class356.field5275.method2563(122);
            int var23 = var22 + class356.field5275.method2539((byte) -69);
            class178.field2688.method2563(119);
            int var24 = var23 + class178.field2688.method2539((byte) -82);
            class421.field6269.method2563(113);
            int var25 = var24 + class421.field6269.method2539((byte) -77);
            class110.field1539.method2563(117);
            int var26 = var25 + class110.field1539.method2539((byte) -102);
            if (var26 < 1200) {
                class249.field3883 = class372.field5542.method1635(class224.field3673, (byte) 12) + var26 / 12 + "%";
                class141.field2163 = 65;
            } else {
                class474.field6839 = new class516(class312.field4691, class224.field3673, class120.field1812);
                class138.field2094 = new class464(class312.field4691, class224.field3673, class120.field1812);
                class347.field5134 = new class227(class312.field4691, class224.field3673, class120.field1812, class176.field2627);
                class267.field4087 = new class314(class312.field4691, class224.field3673, class282.field4287);
                class457.field6653 = new class329(class312.field4691, class224.field3673, class120.field1812);
                class62.field760 = new class124(class312.field4691, class224.field3673, class120.field1812);
                class436.field6440 = new class103(class312.field4691, class224.field3673, class120.field1812, class524.field7677);
                class135.field2067 = new class120(class312.field4691, class224.field3673, class120.field1812);
                class52.field639 = new class255(class312.field4691, class224.field3673, class120.field1812);
                class510.field7458 = new class501(class312.field4691, class224.field3673, true, class80.field1152, class524.field7677);
                class107.field1502 = new class518(class312.field4691, class224.field3673, class120.field1812, class176.field2627);
                class59.field711 = new class154(class312.field4691, class224.field3673, class120.field1812, class176.field2627);
                class175.field2605 = new class459(class312.field4691, class224.field3673, true, class217.field3527, class524.field7677);
                class390.field5847 = new class45(class312.field4691, class224.field3673, true, class474.field6839, class522.field7634, class524.field7677);
                class327.field4930 = new class18(class312.field4691, class224.field3673, class120.field1812);
                class242.field3846 = new class357(class312.field4691, class224.field3673, class293.field4448, class203.field3371, class304.field4590);
                class517.field7530 = new class186(class312.field4691, class224.field3673, class120.field1812);
                class138.field2098 = new class110(class312.field4691, class224.field3673, class120.field1812);
                class123.field1839 = new class215(class312.field4691, class224.field3673, class262.field4020, class524.field7677);
                class280.field4227 = new class507(class312.field4691, class224.field3673, class120.field1812);
                class71.field1025 = new class458(class312.field4691, class224.field3673, class120.field1812);
                class412.field6179 = new class185(class312.field4691, class224.field3673, class120.field1812);
                class125.field1856 = new class208(class312.field4691, class224.field3673, class180.field2704);
                class314.field4740 = new class377(class312.field4691, class224.field3673, class120.field1812);
                class443.method2731(54, class525.field7684, class524.field7677, class176.field2627, class152.field2264);
                class497.method2947(class110.field1539, 73);
                class516.field7501 = new class371(class224.field3673, class356.field5275, class178.field2688);
                class507.field7412 = new class130(class224.field3673, class356.field5275, class178.field2688, new class367());
                class249.field3883 = class327.field4927.method1635(class224.field3673, (byte) 19);
                class141.field2163 = 65;
                class387.method2421(109);
                class510.field7458.method2980(-1, !class193.field3258.method938(class96.field1384, -61));
                class195.field3271 = new class338();
                class191.method1342(110);
                class111.method850(31038, class421.field6269);
                class223.method1593(class475.field6861, (byte) -17, class524.field7677);
                class199.field3322 = 120;
            }
        } else if (class199.field3322 == 120) {
            int var27 = class271.method1794(0, class176.field2627);
            int var28 = class19.method156(-26197);
            if (var28 > var27) {
                class249.field3883 = class257.field3934.method1635(class224.field3673, (byte) -90) + var27 * 100 / var28 + "%";
                class141.field2163 = 70;
            } else {
                class109.method836(class377.field5692, (byte) 44, class176.field2627);
                class32.method224(-16462, class141.field2146);
                class249.field3883 = class113.field1573.method1635(class224.field3673, (byte) -28);
                class141.field2163 = 70;
                class199.field3322 = 130;
            }
        } else if (class199.field3322 == 130) {
            if (class5.field44.method2565("huffman", "", (byte) 9)) {
                class245 var29 = new class245(class5.field44.method2550("", "huffman", true));
                class36.method247(var29, (byte) -53);
                class249.field3883 = class22.field275.method1635(class224.field3673, (byte) 124);
                class141.field2163 = 75;
                class199.field3322 = 140;
            } else {
                class249.field3883 = class314.field4739.method1635(class224.field3673, (byte) 122) + "0%";
                class141.field2163 = 75;
            }
        } else if (class199.field3322 == 140) {
            if (class525.field7684.method2563(112)) {
                class249.field3883 = class225.field3678.method1635(class224.field3673, (byte) 118);
                class199.field3322 = 150;
                class141.field2163 = 80;
            } else {
                class249.field3883 = class258.field3963.method1635(class224.field3673, (byte) 37) + class525.field7684.method2539((byte) -119) + "%";
                class141.field2163 = 80;
            }
        } else if (class199.field3322 == 150) {
            if (class491.field7054.method2563(104)) {
                class249.field3883 = class506.field7394.method1635(class224.field3673, (byte) 119);
                class199.field3322 = 160;
                class141.field2163 = 82;
            } else {
                class249.field3883 = class388.field5817.method1635(class224.field3673, (byte) 123) + class491.field7054.method2539((byte) -89) + "%";
                class141.field2163 = 82;
            }
        } else if (class199.field3322 == 160) {
            if (class152.field2264.method2563(101)) {
                class249.field3883 = class420.field6265.method1635(class224.field3673, (byte) 122);
                class141.field2163 = 85;
                class199.field3322 = 170;
            } else {
                class249.field3883 = class420.field6265.method1635(class224.field3673, (byte) 117) + class152.field2264.method2539((byte) -73) + "%";
                class141.field2163 = 85;
            }
        } else if (class199.field3322 == 170) {
            if (class373.field5555.method2559("details", 106)) {
                class7.method41(class373.field5555, class457.field6653, class62.field760, class510.field7458, class107.field1502, class59.field711, class195.field3271);
                class249.field3883 = class100.field1427.method1635(class224.field3673, (byte) -51);
                class199.field3322 = 190;
                class141.field2163 = 89;
            } else {
                class249.field3883 = class22.field271.method1635(class224.field3673, (byte) -59) + class373.field5555.method2543("details", (byte) 34) + "%";
                class141.field2163 = 87;
            }
        } else if (class199.field3322 == 190) {
            class505.field7385 = new int[class412.field6179.field2811];
            class256.field3922 = new boolean[class412.field6179.field2811];
            class521.field7625 = new String[class71.field1025.field6664];
            for (int var30 = 0; var30 < class412.field6179.field2811; var30++) {
                if (class412.field6179.method1228(2, var30).field3847 == 0) {
                    class256.field3922[var30] = true;
                    class5.field62++;
                }
                class505.field7385[var30] = -1;
            }
            class260.method1743(false);
            class40.field539 = class525.field7684.method2537("loginscreen", -107);
            class444.field6528 = class525.field7684.method2537("lobbyscreen", -83);
            class430.field6378.method2560(true, false, -124);
            class313.field4720.method2560(true, true, -127);
            class176.field2627.method2560(true, true, -91);
            class152.field2264.method2560(true, true, -109);
            class5.field44.method2560(true, true, -86);
            class525.field7684.method2560(true, true, -85);
            class417.field6208 = true;
            class120.field1812.field6013 = 2;
            class282.field4287.field6013 = 2;
            class80.field1152.field6013 = 2;
            class217.field3527.field6013 = 2;
            class522.field7634.field6013 = 2;
            class293.field4448.field6013 = 2;
            class262.field4020.field6013 = 2;
            class328.method2083(class193.field3258.field7214, -1, -1, false, (byte) 92);
            class249.field3883 = class13.field191.method1635(class224.field3673, (byte) 122);
            class199.field3322 = 200;
            class141.field2163 = 95;
        } else if (class199.field3322 == 200) {
            class74.method643(2, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3787)
    public static final void main(String[] arg0) {
        field3300++;
        try {
            if (arg0.length != 6) {
                class136.method992(34, "Argument count");
            }
            class397.field5936 = new class424();
            class397.field5936.field6307 = Integer.parseInt(arg0[0]);
            class12.field163 = new class424();
            class12.field163.field6307 = Integer.parseInt(arg0[1]);
            class225.field3674 = new class424();
            class225.field3674.field6307 = Integer.parseInt(arg0[2]);
            class310.field4662 = class261.field4007;
            if (arg0[3].equals("live")) {
                class68.field873 = class482.field6927;
            } else if (arg0[3].equals("rc")) {
                class68.field873 = class179.field2701;
            } else if (arg0[3].equals("wip")) {
                class68.field873 = class146.field2227;
            } else {
                class136.method992(83, "modewhat");
            }
            class224.field3673 = class251.method1696((byte) -113, arg0[4]);
            if (class224.field3673 == -1) {
                if (arg0[4].equals("english")) {
                    class224.field3673 = 0;
                } else if (arg0[4].equals("german")) {
                    class224.field3673 = 1;
                } else {
                    class136.method992(17, "language");
                }
            }
            class48.field625 = false;
            class507.field7413 = false;
            if (arg0[5].equals("game0")) {
                class312.field4691 = class282.field4297;
            } else if (arg0[5].equals("game1")) {
                class312.field4691 = class86.field1228;
            } else {
                class136.method992(29, "game");
            }
            class341.field5067 = 0;
            class6.field71 = "";
            class297.field4526 = true;
            class88.field1252 = true;
            class529.field7733 = 0;
            class168.field2478 = class312.field4691.field6918;
            client var1 = new client();
            class150.field2246 = var1;
            var1.method760(class68.field873.method31(true) + 32, 122, 1024, 30, 768, 594, class312.field4691.field6917, false);
            class281.field4281.setLocation(40, 40);
        } catch (Exception var3) {
            class88.method727(var3, 83, null);
        }
    }
}
