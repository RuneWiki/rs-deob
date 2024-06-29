import java.awt.Color;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class77 {

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field386 = 0;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Llc;")
    public static class69 field391 = class69.method470((byte) -101, "*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3");

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Llc;")
    public static class69 field392 = class69.method470((byte) -98, "Importing models )2 ");

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "[[B")
    public static byte[][] field404 = new byte[250][];

    @OriginalMember(owner = "client!client", name = "U", descriptor = "Lfe;")
    public static class36 field393 = new class36(64);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Llc;")
    public static class69 field406 = class69.method470((byte) -107, "(Z");

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Llc;")
    public static class69 field407 = class69.method470((byte) -111, ")1");

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Loa;")
    public static class85 field387;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "Lqa;")
    public static class96 field385;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Z")
    public static boolean field409;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public static final int method110(int arg0, int arg1, int arg2, int arg3) {
        field408++;
        int var4 = arg2 & arg1;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field395++;
        if (!this.method545(true)) {
            return;
        }
        class2.field12 = Integer.parseInt(this.getParameter("worldid"));
        class16.field303 = Integer.parseInt(this.getParameter("modewhat"));
        class114.field2489 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class83.method601(9763);
        } else {
            class119.method872(-24306);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class75.field1685 = true;
        } else {
            class75.field1685 = false;
        }
        this.method543(503, false, 403, class16.field303 + 32, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILib;Z)V")
    public static final void method111(int arg0, class50 arg1, boolean arg2) {
        field403++;
        class91.method644((byte) 84, arg0, arg1.field1058, arg1.field1065);
        if (!arg2) {
            field387 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method112(boolean arg0) {
        if (!arg0) {
            return;
        }
        field390++;
        if (class125.field2705 == 0) {
            class92.method646(null, class93.field2046, 2, class24.field504);
        } else if (class125.field2705 == 5) {
            class121.method897(class24.field509, class82.field1861, 19692, class36.field733);
        } else if (class125.field2705 == 10) {
            class121.method897(class24.field509, class82.field1861, 19692, class36.field733);
        } else if (class125.field2705 == 20) {
            class121.method897(class24.field509, class82.field1861, 19692, class36.field733);
        } else if (class125.field2705 == 25) {
            if (class78.field1774 == 1) {
                if (class110.field2414 < class64.field1350) {
                    class110.field2414 = class64.field1350;
                }
                int var3 = (class110.field2414 - class64.field1350) * 50 / class110.field2414;
                class72.method512(true, class50.field1092, class46.method305(20025, new class69[] { class104.field2274, class106.method791(var3, (byte) -106), class43.field862 }), true);
            } else if (class78.field1774 == 2) {
                if (class56.field1173 < class114.field2470) {
                    class56.field1173 = class114.field2470;
                }
                int var2 = (class56.field1173 - class114.field2470) * 50 / class56.field1173 + 50;
                class72.method512(true, class50.field1092, class46.method305(20025, new class69[] { class104.field2274, class106.method791(var2, (byte) -63), class43.field862 }), arg0);
            } else {
                class72.method512(false, class50.field1092, null, true);
            }
        } else if (class125.field2705 == 30) {
            class25.method165((byte) 109);
        } else if (class125.field2705 == 35) {
            class80.method583(24099);
        } else if (class125.field2705 == 40) {
            class72.method512(false, class3.field66, class73.field1623, true);
        }
        class50.field1090 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
    public static final boolean method113(int arg0, int arg1, int arg2) {
        field401++;
        if (arg1 == 0 && class16.field319 == arg0) {
            return true;
        } else if (arg1 == 1 && class120.field2559 == arg0) {
            return true;
        } else if ((arg1 == 2 || arg1 == 3) && class125.field2714 == arg0) {
            return true;
        } else {
            if (arg2 != -102) {
                field406 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method114(int arg0) {
        if (arg0 != 12041) {
            field399 = 55;
        }
        field384++;
        if (class72.field1600-- > 0) {
            return;
        }
        try {
            if (class125.field2703 == 0) {
                class24.field501 = class64.field1358.method755(class75.field1688, (byte) -8);
                class125.field2703++;
            }
            if (class125.field2703 == 1) {
                if (class24.field501.field2504 == 2) {
                    this.method123(arg0 ^ 0xFFFFE523, -1);
                    return;
                }
                if (class24.field501.field2504 == 1) {
                    class125.field2703++;
                }
            }
            if (class125.field2703 == 2) {
                class64.field1347 = new class79((Socket) class24.field501.field2505, class64.field1358);
                byte[] var2 = new byte[] { 15 };
                class64.field1347.method562(1, 5000, var2, 0);
                class125.field2703++;
                class82.field1847 = System.currentTimeMillis();
            }
            if (class125.field2703 == 3) {
                if (class125.field2705 <= 5 || class64.field1347.method565(false) > 0) {
                    int var3 = class64.field1347.method566(-95);
                    if (var3 != 0) {
                        this.method123(-13782, var3);
                        return;
                    }
                    class125.field2703++;
                } else if (System.currentTimeMillis() - class82.field1847 > 30000L) {
                    this.method123(-13782, -2);
                    return;
                }
            }
            if (class125.field2703 == 4) {
                class68.field1481.method436(class125.field2705 > 20, true, class64.field1347);
                class125.field2703 = 0;
                class33.field654 = 0;
                class24.field501 = null;
                class64.field1347 = null;
            }
        } catch (IOException var4) {
            this.method123(arg0 ^ 0xFFFFE523, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method115(int arg0) {
        method118((byte) -80);
        field388++;
        class69.method491(-98);
        class77.method548(-127);
        class43.method254((byte) 41);
        class123.method914(arg0 - 779477840);
        class85.method607(arg0 - 1);
        class33.method211(true);
        class96.method730(500);
        class94.method693(true);
        class67.method439((byte) 8);
        class79.method568(arg0);
        class16.method84(arg0 - 16);
        class125.method919(0);
        class57.method356((byte) 80);
        class72.method513(arg0 - 90);
        class27.method177((byte) 72);
        class45.method297();
        class129.method949();
        class122.method906(1);
        class60.method363(-42);
        class80.method574(-102);
        class9.method48(6);
        class90.method633(16756);
        class4.method27(9781);
        class50.method332(arg0 - 9890);
        class13.method70(-1);
        class68.method452((byte) 104);
        class98.method740(-56);
        class70.method501(true);
        class61.method373(-88);
        class54.method343(true);
        class62.method374(false);
        class63.method406(-6378);
        class36.method219((byte) 19);
        class74.method523(arg0 ^ 0xFFFFFFF4);
        class44.method268();
        class120.method882(true);
        class18.method109(29605);
        class11.method65(5);
        class104.method783((byte) 126);
        class26.method170(false);
        class112.method824((byte) 111);
        class103.method779(false);
        class19.method125(0);
        class66.method434(25);
        class34.method212();
        class17.method98(0);
        class76.method538(87);
        class93.method662(true);
        class101.method772(0);
        class89.method630(arg0 - 63);
        class128.method941((byte) -43);
        class115.method841((byte) -42);
        class56.method351((byte) -117);
        class6.method32(118);
        class117.method857();
        class95.method720();
        class83.method599(1);
        class106.method789(64);
        class29.method189((byte) -105);
        class39.method232(-3794);
        class78.method561(-1);
        class107.method792(true);
        class121.method886((byte) 66);
        class108.method813((byte) -120);
        class49.method321((byte) 24);
        class114.method839(arg0 ^ 0x46);
        class2.method11(1);
        class71.method503(true);
        class91.method642(true);
        class28.method185();
        class87.method621(arg0 ^ 0x6E);
        class53.method340(0);
        class55.method344((byte) 120);
        class127.method935((byte) 114);
        class41.method246();
        class102.method776(114);
        class25.method163(7);
        class22.method146(arg0 ^ 0x4);
        class75.method530(arg0 + 13682);
        class30.method191(8526);
        class35.method213(true);
        class82.method593(false);
        class47.method311(arg0 + 85);
        class92.method647(2);
        class10.method60(121);
        class42.method250((byte) -14);
        class73.method515((byte) 35);
        class113.method830();
        class24.method160((byte) 60);
        class86.method611();
        class3.method13(0);
        class84.method603();
        class46.method310((byte) 107);
        class110.method820(20321);
        class64.method412(100);
        class126.method926();
        class8.method41();
        class23.method157((byte) 12);
        class81.method591(arg0 ^ 0x100);
        class40.method239(6084);
        class119.method877(arg0 ^ 0x1D);
        class65.method419();
        class51.method338(-5683);
        if (class77.field1749) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        field402++;
        if (field385 != null) {
            field385.field2129 = false;
        }
        field385 = null;
        if (class106.field2298 != null) {
            class106.field2298.method564(1);
        }
        class23.method155(true);
        class13.method72(false);
        int var2 = 47 / ((arg0 + 46) / 45);
        class93.method655(-45);
        class121.method895((byte) -61);
        if (class68.field1481 != null) {
            class68.field1481.method438((byte) 20);
        }
        class71.method505((byte) -90);
        try {
            if (class104.field2278 != null) {
                class104.field2278.method920(117);
            }
            if (class36.field735 != null) {
                for (int var3 = 0; var3 < class36.field735.length; var3++) {
                    if (class36.field735[var3] != null) {
                        class36.field735[var3].method920(17);
                    }
                }
            }
            if (class27.field568 != null) {
                class27.field568.method920(81);
            }
            if (class82.field1850 != null) {
                for (int var4 = 0; var4 < class82.field1850.length; var4++) {
                    if (class82.field1850[var4] != null) {
                        class82.field1850[var4].method920(-8);
                    }
                }
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method117(int arg0) {
        class62.field1282++;
        field383++;
        this.method121(0);
        class93.method658((byte) 120);
        class82.method595((byte) 115);
        class121.method894((byte) 69);
        class76.method537((byte) 69);
        if (class125.field2705 == 0) {
            class74.method519(-28405);
        } else if (class125.field2705 == 5) {
            class74.method519(-28405);
        } else if (class125.field2705 == 10) {
            class70.method497(1878);
        } else if (class125.field2705 == 20) {
            class70.method497(1878);
            class24.method161((byte) -119);
        } else if (class125.field2705 == 25) {
            class74.method517((byte) -83);
        }
        if (class125.field2705 == 30) {
            class92.method649((byte) -60);
        } else if (class125.field2705 == 35) {
            class92.method649((byte) -60);
        } else if (class125.field2705 == 40) {
            class24.method161((byte) -116);
        }
        int var2 = -29 / ((arg0 + 49) / 59);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field392 = null;
        field393 = null;
        field387 = null;
        field404 = null;
        field406 = null;
        field385 = null;
        field407 = null;
        int var1 = 6 / ((arg0 + 38) / 41);
        field391 = null;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method119(int arg0) {
        field400++;
        class6.field107 = class114.field2489 == 0 ? 443 : class2.field12 + 50000;
        class10.field199 = class114.field2489 == 0 ? 43594 : class2.field12 + 40000;
        class75.field1688 = class10.field199;
        class36.method226(58);
        class56.method354(class83.method597((byte) -51), 0);
        class83.method598(class83.method597((byte) -51), (byte) 126);
        class6.field104 = class99.field2175;
        try {
            if (class64.field1358.field2182 != null) {
                class104.field2278 = new class125(class64.field1358.field2182, 5200, 0);
                for (int var2 = 0; var2 < 12; var2++) {
                    class36.field735[var2] = new class125(class64.field1358.field2165[var2], 6000, 0);
                }
                class64.field1358.field2182 = null;
                class64.field1358.field2165 = null;
            }
            if (class64.field1358.field2171 != null) {
                class27.field568 = new class125(class64.field1358.field2171, 5200, 0);
                for (int var3 = 0; var3 < 5; var3++) {
                    class82.field1850[var3] = new class125(class64.field1358.field2179[var3], 6000, 0);
                }
                class64.field1358.field2179 = null;
                class64.field1358.field2171 = null;
            }
        } catch (IOException var4) {
            class27.field568 = null;
            class104.field2278 = null;
        }
        if (arg0 >= -119) {
            this.init();
        }
        if (class114.field2489 != 0) {
            class18.field371 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public static final void method120(boolean arg0) {
        class101.field2196 = 0;
        class82.field1853 = -1;
        class72.field1604 = 0;
        field405++;
        class18.field376 = 0;
        class127.field2738 = arg0;
        class119.field2547 = -1;
        class2.field19 = -1;
        class90.field1960 = -1;
        class103.field2224 = 0;
        class10.field194 = 0;
        class25.field539 = 0;
        class26.field557.field2061 = 0;
        class3.field22.field2061 = 0;
        class89.method626(30, (byte) 112);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method121(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field397++;
        if (class125.field2705 == 1000) {
            return;
        }
        if (class68.field1481 == null) {
            class68.field1481 = new class67();
        }
        boolean var2 = class68.field1481.method437(arg0 ^ 0x4);
        if (!var2) {
            this.method114(12041);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIII)I")
    public static final int method122(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field398++;
        if (arg0) {
            field391 = null;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field394++;
        try {
            if (arg0.length != 5) {
                class2.method9((byte) -83);
            }
            class2.field12 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class114.field2489 = 0;
            } else if (arg0[1].equals("office")) {
                class114.field2489 = 1;
            } else if (arg0[1].equals("local")) {
                class114.field2489 = 2;
            } else {
                class2.method9((byte) -41);
            }
            if (arg0[2].equals("live")) {
                class16.field303 = 0;
            } else if (arg0[2].equals("rc")) {
                class16.field303 = 1;
            } else if (arg0[2].equals("wip")) {
                class16.field303 = 2;
            } else {
                class2.method9((byte) 118);
            }
            if (arg0[3].equals("lowmem")) {
                class83.method601(9763);
            } else if (arg0[3].equals("highmem")) {
                class119.method872(-24306);
            } else {
                class2.method9((byte) -15);
            }
            if (arg0[4].equals("free")) {
                class75.field1685 = false;
            } else if (arg0[4].equals("members")) {
                class75.field1685 = true;
            } else {
                class2.method9((byte) 116);
            }
            client var1 = new client();
            var1.method542(12, 503, 403, "runescape", (byte) 37, InetAddress.getLocalHost(), class16.field303 + 32, 765);
        } catch (Exception var3) {
            class70.method499(null, var3, 40);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method123(int arg0, int arg1) {
        class33.field654++;
        class24.field501 = null;
        class125.field2703 = 0;
        if (class75.field1688 == class10.field199) {
            class75.field1688 = class6.field107;
        } else {
            class75.field1688 = class10.field199;
        }
        field396++;
        class64.field1347 = null;
        if (arg0 != -13782) {
            field407 = null;
        }
        if (class33.field654 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class125.field2705 <= 5) {
                this.method547(true, "js5connect_full");
                class125.field2705 = 1000;
            } else {
                class72.field1600 = 3000;
            }
        } else if (class33.field654 >= 4) {
            if (class125.field2705 <= 5) {
                this.method547(true, "js5connect");
                class125.field2705 = 1000;
            } else {
                class72.field1600 = 3000;
            }
        }
    }
}
