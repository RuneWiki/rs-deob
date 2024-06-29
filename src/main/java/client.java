import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class52 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lv;")
    public static class146 field336 = class159.method1226((byte) -37, "Benutzername: ");

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lv;")
    public static class146 field343 = class159.method1226((byte) -37, "sch-Utteln:");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Ldd;")
    public static class26 field340 = null;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Z")
    public static boolean field354 = true;

    @OriginalMember(owner = "client!client", name = "F", descriptor = "Lv;")
    public static class146 field333 = class159.method1226((byte) -37, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Ljava/awt/Frame;")
    public static Frame field338;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method125(byte arg0) {
        field334++;
        if (class138.field3132 >= 4) {
            this.method355("js5crc", (byte) 116);
            class47.field1071 = 1000;
            return;
        }
        if (class101.field2459 >= 4) {
            if (class47.field1071 <= 5) {
                this.method355("js5io", (byte) 105);
                class47.field1071 = 1000;
                return;
            }
            class40.field922 = 3000;
            class101.field2459 = 3;
        }
        if (class40.field922-- > 0) {
            return;
        }
        try {
            if (arg0 <= -41) {
                if (class119.field2772 == 0) {
                    class136.field3085 = class145.field3293.method124(1, class124.field2870, class6.field146);
                    class119.field2772++;
                }
                if (class119.field2772 == 1) {
                    if (class136.field3085.field866 == 2) {
                        this.method133(-1, 0);
                        return;
                    }
                    if (class136.field3085.field866 == 1) {
                        class119.field2772++;
                    }
                }
                if (class119.field2772 == 2) {
                    class137.field3112 = new class145((Socket) class136.field3085.field870, class145.field3293);
                    class95 var2 = new class95(5);
                    var2.method791(false, 15);
                    var2.method788(469, -730641264);
                    class137.field3112.method1078(0, 1, 5, var2.field2320);
                    class119.field2772++;
                    class147.field3414 = class51.method345((byte) -1);
                }
                if (class119.field2772 == 3) {
                    if (class47.field1071 <= 5 || class137.field3112.method1073(0) > 0) {
                        int var3 = class137.field3112.method1077(-114);
                        if (var3 != 0) {
                            this.method133(var3, 0);
                            return;
                        }
                        class119.field2772++;
                    } else if (class51.method345((byte) -1) - class147.field3414 > 30000L) {
                        this.method133(-2, 0);
                        return;
                    }
                }
                if (class119.field2772 == 4) {
                    class59.method407(class47.field1071 > 20, -24284, class137.field3112);
                    class137.field3109 = 0;
                    class119.field2772 = 0;
                    class136.field3085 = null;
                    class137.field3112 = null;
                }
            }
        } catch (IOException var4) {
            this.method133(-3, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public static final void method126(byte arg0) {
        if (arg0 > -17) {
            return;
        }
        for (class5 var1 = (class5) class68.field1548.method1138(25852); var1 != null; var1 = (class5) class68.field1548.method1142(1)) {
            if (var1.field123 != null) {
                class18.field286.method999(var1.field123);
                var1.field123 = null;
            }
            if (var1.field125 != null) {
                class18.field286.method999(var1.field125);
                var1.field125 = null;
            }
        }
        field348++;
        class68.field1548.method1145((byte) -72);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        class41.field939 = class26.field532 == 0 ? 443 : class33.field713 + 50000;
        class46.field1069 = class26.field532 == 0 ? 43594 : class33.field713 + 40000;
        class6.field146 = class46.field1069;
        if (class46.field1059 == 1) {
            class17.field259 = class136.field3082;
            class98.field2375 = class135.field3078;
            class126.field2918 = class15.field248;
            class89.field2111 = class94.field2244;
        } else {
            class17.field259 = class69.field1568;
            class126.field2918 = class1.field7;
            class89.field2111 = class127.field2934;
            class98.field2375 = class132.field3013;
        }
        class73.method526((byte) -57);
        method135(-122, class1.field3);
        class146.method1119(class1.field3, -39);
        field346++;
        class142.field3247 = class134.method1005(true);
        if (class142.field3247 != null) {
            class142.field3247.method147(0, class1.field3);
        }
        class58.field1307 = class21.field324;
        try {
            if (arg0) {
                field336 = null;
            }
            if (class145.field3293.field321 != null) {
                class78.field1886 = new class132(class145.field3293.field321, 5200, 0);
                for (int var2 = 0; var2 < 16; var2++) {
                    class25.field434[var2] = new class132(class145.field3293.field318[var2], 6000, 0);
                }
                class66.field1498 = new class132(class145.field3293.field330, 6000, 0);
                class92.field2199 = new class113(255, class78.field1886, class66.field1498, 500000);
                class82.field1980 = new class132(class145.field3293.field328, 24, 0);
                class145.field3293.field321 = null;
                class145.field3293.field330 = null;
                class145.field3293.field318 = null;
                class145.field3293.field328 = null;
            }
        } catch (IOException var3) {
            class66.field1498 = null;
            class92.field2199 = null;
            class82.field1980 = null;
            class78.field1886 = null;
        }
        if (class26.field532 != 0) {
            class151.field3484 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field342++;
        if (!this.method352((byte) -126)) {
            return;
        }
        class33.field713 = Integer.parseInt(this.getParameter("worldid"));
        class153.field3521 = Integer.parseInt(this.getParameter("modewhat"));
        class26.field532 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            class35.method238((byte) 115);
        } else {
            class134.method1004(-24487);
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class81.field1961 = true;
        } else {
            class81.field1961 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class110.method868(-10466);
            class67.field1505 = 1;
            class158.field3629 = class91.field2175;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class46.field1059 = 1;
        } else {
            class46.field1059 = 0;
        }
        try {
            class44.field996 = Integer.parseInt(this.getParameter("js"));
            class157.field3607 = Integer.parseInt(this.getParameter("plug"));
        } catch (Exception var5) {
        }
        class124.field2870 = this.getCodeBase().getHost();
        this.method357(class153.field3521 + 32, 469, 765, 503, true);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method128(int arg0) {
        field341++;
        if (class47.field1071 == 1000) {
            return;
        }
        if (arg0 != 12497) {
            method130(-78);
        }
        boolean var2 = method130(arg0 + 592168319);
        if (!var2) {
            this.method125((byte) -62);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public static final void method129(int arg0) {
        class35.field815 = 0;
        class38.field863 = 0;
        class87.field2073 = -1;
        class82.field1990.field2304 = 0;
        class13.field208 = 0;
        class74.field1747 = 0;
        class5.field122 = -1;
        class63.field1421 = 0;
        class38.field842 = false;
        class79.field1951 = 0;
        field347++;
        class29.field597.field2304 = 0;
        class150.field3465 = -1;
        int var1 = 90 / ((arg0 + 83) / 36);
        class58.field1301 = -1;
        for (int var2 = 0; var2 < class125.field2902.length; var2++) {
            if (class125.field2902[var2] != null) {
                class125.field2902[var2].field774 = -1;
            }
        }
        for (int var3 = 0; var3 < class34.field735.length; var3++) {
            if (class34.field735[var3] != null) {
                class34.field735[var3].field774 = -1;
            }
        }
        class95.method775((byte) 126);
        class88.method702(30, false);
        for (int var4 = 0; var4 < 100; var4++) {
            class83.field2013[var4] = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)Z")
    private static final boolean method130(int arg0) {
        if (arg0 != 592180816) {
            return false;
        }
        field335++;
        long var1 = class51.method345((byte) -1);
        int var3 = (int) (var1 - class126.field2921);
        if (var3 > 200) {
            var3 = 200;
        }
        class126.field2921 = var1;
        class64.field1451 += var3;
        if (class108.field2583 == 0 && class145.field3303 == 0 && class20.field303 == 0 && class71.field1644 == 0) {
            return true;
        } else if (class1.field8 == null) {
            return false;
        } else {
            try {
                if (class64.field1451 > 30000) {
                    throw new IOException();
                }
                while (class145.field3303 < 20 && class71.field1644 > 0) {
                    class141 var4 = (class141) class134.field3045.method337(-99);
                    class95 var5 = new class95(4);
                    var5.method791(false, 1);
                    var5.method768((byte) -108, (int) var4.field679);
                    class1.field8.method1078(0, 1, 4, var5.field2320);
                    class141.field3229.method336(var4.field679, var4, -8899);
                    class71.field1644--;
                    class145.field3303++;
                }
                while (class108.field2583 < 20 && class20.field303 > 0) {
                    class141 var6 = (class141) class37.field831.method1232((byte) -93);
                    class95 var7 = new class95(4);
                    var7.method791(false, 0);
                    var7.method768((byte) -113, (int) var6.field679);
                    class1.field8.method1078(0, arg0 - 592180815, 4, var7.field2320);
                    var6.method909((byte) -108);
                    class113.field2637.method336(var6.field679, var6, -8899);
                    class20.field303--;
                    class108.field2583++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class1.field8.method1073(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class64.field1451 = 0;
                    byte var10 = 0;
                    if (class145.field3322 == null) {
                        var10 = 8;
                    } else if (class135.field3072 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class35.field775.field2320.length - class145.field3322.field3231;
                        int var12 = 512 - class135.field3072;
                        if (var11 - class35.field775.field2304 < var12) {
                            var12 = var11 - class35.field775.field2304;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class1.field8.method1072(class35.field775.field2304, class35.field775.field2320, var12, (byte) -52);
                        if (class73.field1703 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class35.field775.field2320[class35.field775.field2304 + var13] = (byte) class79.method609(class35.field775.field2320[class35.field775.field2304 + var13], class73.field1703);
                            }
                        }
                        class135.field3072 += var12;
                        class35.field775.field2304 += var12;
                        if (class35.field775.field2304 == var11) {
                            if (class145.field3322.field679 == 16711935L) {
                                class41.field930 = class35.field775;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class25 var15 = class38.field857[var14];
                                    if (var15 != null) {
                                        class41.field930.field2304 = var14 * 8 + 5;
                                        int var16 = class41.field930.method740((byte) -79);
                                        int var17 = class41.field930.method740((byte) 35);
                                        var15.method154(var17, var16, 4111);
                                    }
                                }
                            } else {
                                class13.field216.reset();
                                class13.field216.update(class35.field775.field2320, 0, var11);
                                int var18 = (int) class13.field216.getValue();
                                if (class145.field3322.field3224 != var18) {
                                    try {
                                        class1.field8.method1071((byte) 126);
                                    } catch (Exception var30) {
                                    }
                                    class1.field8 = null;
                                    class138.field3132++;
                                    class73.field1703 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class138.field3132 = 0;
                                class101.field2459 = 0;
                                class145.field3322.field3218.method166(class35.field775.field2320, (class145.field3322.field679 & 0xFF0000L) == 16711680L, true, (int) (class145.field3322.field679 & 0xFFFFL), class68.field1558);
                            }
                            class145.field3322.method217(-1264);
                            class35.field775 = null;
                            class145.field3322 = null;
                            if (class68.field1558) {
                                class145.field3303--;
                            } else {
                                class108.field2583--;
                            }
                            class135.field3072 = 0;
                        } else {
                            if (class135.field3072 != 512) {
                                break;
                            }
                            class135.field3072 = 0;
                        }
                    } else {
                        int var19 = var10 - class89.field2102.field2304;
                        if (var9 < var19) {
                            var19 = var9;
                        }
                        class1.field8.method1072(class89.field2102.field2304, class89.field2102.field2320, var19, (byte) -52);
                        if (class73.field1703 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class89.field2102.field2320[class89.field2102.field2304 + var20] = (byte) class79.method609(class89.field2102.field2320[class89.field2102.field2304 + var20], class73.field1703);
                            }
                        }
                        class89.field2102.field2304 += var19;
                        if (class89.field2102.field2304 < var10) {
                            break;
                        }
                        if (class145.field3322 == null) {
                            class89.field2102.field2304 = 0;
                            int var21 = class89.field2102.method790((byte) 73);
                            int var22 = class89.field2102.method795(1);
                            int var23 = class89.field2102.method790((byte) 73);
                            int var24 = class89.field2102.method740((byte) -117);
                            long var25 = (long) ((var21 << 16) + var22);
                            class141 var27 = (class141) class141.field3229.method332((byte) -79, var25);
                            class68.field1558 = true;
                            if (var27 == null) {
                                var27 = (class141) class113.field2637.method332((byte) -79, var25);
                                class68.field1558 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            int var28 = var23 == 0 ? 5 : 9;
                            class145.field3322 = var27;
                            class35.field775 = new class95(class145.field3322.field3231 + var28 + var24);
                            class35.field775.method791(false, var23);
                            class35.field775.method788(var24, -730641264);
                            class89.field2102.field2304 = 0;
                            class135.field3072 = 8;
                        } else if (class135.field3072 == 0) {
                            if (class89.field2102.field2320[0] == -1) {
                                class89.field2102.field2304 = 0;
                                class135.field3072 = 1;
                            } else {
                                class145.field3322 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class1.field8.method1071((byte) 104);
                } catch (Exception var29) {
                }
                class1.field8 = null;
                class101.field2459++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 7) {
                class8.method62(-44);
            }
            class33.field713 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class26.field532 = 0;
            } else if (arg0[1].equals("office")) {
                class26.field532 = 1;
            } else if (arg0[1].equals("local")) {
                class26.field532 = 2;
            } else {
                class8.method62(-116);
            }
            if (arg0[2].equals("live")) {
                class153.field3521 = 0;
            } else if (arg0[2].equals("rc")) {
                class153.field3521 = 1;
            } else if (arg0[2].equals("wip")) {
                class153.field3521 = 2;
            } else {
                class8.method62(-86);
            }
            if (arg0[3].equals("lowmem")) {
                class35.method238((byte) -123);
            } else if (arg0[3].equals("highmem")) {
                class134.method1004(-24487);
            } else {
                class8.method62(-50);
            }
            if (arg0[4].equals("free")) {
                class81.field1961 = false;
            } else if (arg0[4].equals("members")) {
                class81.field1961 = true;
            } else {
                class8.method62(-125);
            }
            if (arg0[5].equals("english")) {
                class67.field1505 = 0;
            } else if (arg0[5].equals("german")) {
                class110.method868(-10466);
                class158.field3629 = class91.field2175;
                class67.field1505 = 1;
            } else {
                class8.method62(-60);
            }
            if (arg0[6].equals("game0")) {
                class46.field1059 = 0;
            } else if (arg0[6].equals("game1")) {
                class46.field1059 = 1;
            } else {
                class8.method62(-102);
            }
            class124.field2870 = "127.0.0.1";
            client var1 = new client();
            var1.method356(469, (byte) 84, 16, 765, class153.field3521 + 32, 503, "runescape");
        } catch (Exception var3) {
            class122.method921((byte) 90, null, var3);
        }
        field339++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method131(int arg0) {
        field355++;
        class94.field2229++;
        if (arg0 >= -6) {
            return;
        }
        this.method128(12497);
        class75.method565(0);
        class148.method1128(-83);
        class25.method160((byte) 43);
        class123.method925((byte) 102);
        class54.method362(-13611);
        if (class142.field3247 != null) {
            int var2 = class142.field3247.method149(-128);
            class148.field3447 = var2;
        }
        if (class47.field1071 == 0) {
            class2.method7(97);
            class17.method105(true);
        } else if (class47.field1071 == 5) {
            class113.method886(-105, this);
            class2.method7(84);
            class17.method105(true);
        } else if (class47.field1071 == 10) {
            class113.method886(-101, this);
        } else if (class47.field1071 == 20) {
            class113.method886(-96, this);
            class153.method1155((byte) 31);
        } else if (class47.field1071 == 25) {
            class138.method1019(8);
        }
        if (class47.field1071 == 30) {
            class136.method1011(0);
        } else if (class47.field1071 == 40) {
            class153.method1155((byte) 31);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method132(int arg0) {
        field337++;
        boolean var2 = class13.method77(22050);
        if (var2 && class22.field375 && class15.field249 != null) {
            class15.field249.method21(-1);
        }
        if (class48.field1101) {
            class132.method992(1, class1.field3);
            class52.method348(class1.field3, 0);
            if (class142.field3247 != null) {
                class142.field3247.method148(class1.field3, -27);
            }
            this.method347(-11354);
            method135(97, class1.field3);
            class146.method1119(class1.field3, -39);
            if (class142.field3247 != null) {
                class142.field3247.method147(0, class1.field3);
            }
        }
        if (class47.field1071 == 0) {
            class113.method885(class105.field2519, class134.field3067, null, (byte) 89);
        } else if (class47.field1071 == 5) {
            class155.method1160(class151.field3483, (byte) 24, class103.field2508);
        } else if (class47.field1071 == 10) {
            class155.method1160(class151.field3483, (byte) 24, class103.field2508);
        } else if (class47.field1071 == 20) {
            class155.method1160(class151.field3483, (byte) 24, class103.field2508);
        } else if (class47.field1071 == 25) {
            if (class146.field3352 == 1) {
                if (class100.field2439 > class72.field1690) {
                    class72.field1690 = class100.field2439;
                }
                int var3 = (class72.field1690 - class100.field2439) * 50 / class72.field1690;
                class12.method70(false, 97, class71.method509(new class146[] { class152.field3501, class51.field1152, class75.method564(false, var3), class26.field504 }, (byte) -91));
            } else if (class146.field3352 == 2) {
                if (class159.field3652 > class94.field2239) {
                    class94.field2239 = class159.field3652;
                }
                int var4 = (class94.field2239 - class159.field3652) * 50 / class94.field2239 + 50;
                class12.method70(false, -124, class71.method509(new class146[] { class152.field3501, class51.field1152, class75.method564(false, var4), class26.field504 }, (byte) 94));
            } else {
                class12.method70(false, 11, class152.field3501);
            }
        } else if (class47.field1071 == 30) {
            class70.method504(16711680);
        } else if (class47.field1071 == 40) {
            class12.method70(false, 53, class71.method509(new class146[] { class89.field2117, class115.field2676, class79.field1950 }, (byte) 69));
        }
        if (arg0 > -14) {
            this.init();
        }
        if (class47.field1071 == 30 && class17.field264 == 0 && !class124.field2869) {
            try {
                Graphics var7 = class1.field3.getGraphics();
                for (int var8 = 0; var8 < class92.field2203; var8++) {
                    if (class157.field3627[var8]) {
                        class141.field3233.method602(class49.field1131[var8], (byte) -99, class151.field3479[var8], class35.field812[var8], class159.field3647[var8], var7);
                        class157.field3627[var8] = false;
                    }
                }
            } catch (Exception var9) {
                class1.field3.repaint();
            }
        } else if (class47.field1071 > 0) {
            try {
                Graphics var5 = class1.field3.getGraphics();
                class141.field3233.method599(21982, 0, var5, 0);
                class124.field2869 = false;
                for (int var6 = 0; var6 < class92.field2203; var6++) {
                    class157.field3627[var6] = false;
                }
            } catch (Exception var10) {
                class1.field3.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method133(int arg0, int arg1) {
        class137.field3112 = null;
        class136.field3085 = null;
        field356++;
        class119.field2772 = arg1;
        if (class6.field146 == class46.field1069) {
            class6.field146 = class41.field939;
        } else {
            class6.field146 = class46.field1069;
        }
        class137.field3109++;
        if (class137.field3109 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class47.field1071 > 5) {
                class40.field922 = 3000;
            } else {
                this.method355("js5connect_full", (byte) 115);
                class47.field1071 = 1000;
            }
        } else if (class137.field3109 >= 2 && arg0 == 6) {
            this.method355("js5connect_outofdate", (byte) 124);
            class47.field1071 = 1000;
        } else if (class137.field3109 >= 4) {
            if (class47.field1071 > 5) {
                class40.field922 = 3000;
            } else {
                this.method355("js5connect", (byte) 93);
                class47.field1071 = 1000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)Lmb;")
    public static final class85 method134(byte[] arg0, int arg1) {
        field349++;
        if (arg1 <= 77) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            class85 var2 = new class85(arg0, class37.field833, class122.field2840, class41.field935, class30.field617, class59.field1358, class46.field1063);
            class69.method492(81);
            return var2;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/awt/Component;)V")
    private static final void method135(int arg0, Component arg1) {
        int var2 = 55 % ((arg0 + 53) / 50);
        field344++;
        Method var3 = class21.field322;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class6.field150);
        arg1.addFocusListener(class6.field150);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method136(boolean arg0) {
        field353++;
        method137(0);
        class146.method1099((byte) -124);
        class52.method354((byte) -121);
        class103.method851(0);
        class150.method1129(0);
        class29.method201((byte) -128);
        class95.method755(32412);
        class145.method1070(-129);
        class25.method156(-7);
        class132.method983((byte) -23);
        class113.method884(true);
        class38.method254((byte) 126);
        class40.method269(4);
        class156.method1200();
        class91.method731(false);
        class26.method176(false);
        class67.method479(-120);
        class152.method1148(true);
        class48.method334(true);
        class24.method145(-23);
        class134.method1003(118);
        class3.method17(-29006);
        class148.method1127(90);
        class42.method286(true);
        class72.method522((byte) 115);
        class35.method240(false);
        class101.method839(64);
        class79.method614(-25797);
        class94.method739(false);
        class32.method215(11411);
        class17.method106((byte) 7);
        class92.method732(-29461);
        class140.method1046(6);
        class139.method1030();
        class129.method965();
        class41.method273(-9711);
        class127.method942(-15058);
        class115.method888(9534);
        class60.method421((byte) -93);
        class89.method708(0);
        class143.method1062((byte) -96);
        class66.method474(-22);
        class136.method1014(1);
        class64.method463(1);
        class88.method699(10);
        class124.method933(0);
        class53.method358();
        class100.method834((byte) -106);
        class6.method53(65280);
        class98.method802((byte) 33);
        class107.method863(-127);
        class51.method344(0);
        class58.method400(109);
        class142.method1056(16305);
        class77.method589(113);
        class74.method562((byte) 106);
        class87.method692((byte) 20);
        class154.method1156(-97);
        class33.method224((byte) -113);
        class122.method922((byte) -15);
        class68.method482((byte) 124);
        class70.method503(true);
        class12.method72(27166);
        class159.method1227(34);
        class141.method1054((byte) -87);
        class137.method1018(22173);
        class15.method92(5056);
        class20.method114(-105);
        class56.method381();
        class119.method907(arg0);
        class45.method302();
        class147.method1122(0);
        class86.method676();
        class47.method321(8093);
        class157.method1216(false);
        class73.method525(0);
        class83.method627(-118);
        class13.method76((byte) 100);
        class30.method208(-1);
        class69.method493(-30629);
        class59.method402((byte) 69);
        class155.method1163(-16864);
        class116.method892(-128);
        class118.method906(-6);
        class37.method249((byte) -32);
        class57.method393(-24326);
        class97.method798((byte) -116);
        class99.method813();
        class49.method338(-3832);
        class106.method857();
        class34.method226(false);
        class153.method1150(0);
        class108.method865(-1);
        class126.method939(-92);
        class125.method934((byte) -95);
        class5.method42((byte) 48);
        class117.method896(!arg0);
        class22.method140(2892);
        class158.method1221(true);
        class120.method910(128);
        class28.method197((byte) 37);
        class75.method568((byte) -127);
        class65.method467();
        class44.method293(true);
        class82.method624((byte) -7);
        class9.method64(0);
        class54.method366(true);
        class138.method1020((byte) 92);
        class8.method59(false);
        class76.method570(false);
        class151.method1133(false);
        class123.method924(arg0);
        class2.method10(116);
        class78.method601((byte) 54);
        class63.method459((byte) 111);
        class111.method872(-5);
        class121.method919(78);
        class135.method1007(-122);
        class81.method621(-1);
        class4.method33();
        class130.method974();
        class71.method507((byte) -51);
        class96.method797();
        class46.method317((byte) 50);
        class18.method109(24);
        class27.method190();
        class90.method710((byte) 38);
        class105.method856(5);
        class31.method212(128);
        class102.method842();
        class14.method85();
        class1.method4(2);
        class110.method867(90000);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static void method137(int arg0) {
        field336 = null;
        if (arg0 != 0) {
            field333 = null;
        }
        field333 = null;
        field340 = null;
        field338 = null;
        field343 = null;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method138(int arg0) {
        if (class111.field2630 != null) {
            class111.field2630.field603 = false;
        }
        field345++;
        class111.field2630 = null;
        if (class58.field1298 != null) {
            class58.field1298.method1071((byte) 104);
            class58.field1298 = null;
        }
        class136.method1009(90);
        class38.method259(false);
        class142.field3247 = null;
        if (class15.field249 != null) {
            class15.field249.method32(50);
        }
        if (class89.field2113 != null) {
            class89.field2113.method32(50);
        }
        if (arg0 > -82) {
            this.method131(-47);
        }
        class22.method142(1);
        class6.method50(false);
        try {
            if (class78.field1886 != null) {
                class78.field1886.method985((byte) -112);
            }
            if (class25.field434 != null) {
                for (int var2 = 0; var2 < class25.field434.length; var2++) {
                    if (class25.field434[var2] != null) {
                        class25.field434[var2].method985((byte) -112);
                    }
                }
            }
            if (class66.field1498 != null) {
                class66.field1498.method985((byte) -112);
            }
            if (class82.field1980 != null) {
                class82.field1980.method985((byte) -112);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method139(int arg0) {
        field352++;
        int var1 = 89 / (arg0 / 61);
        for (int var2 = 0; var2 < class58.field1294; var2++) {
            int var3 = class72.field1685[var2];
            class38 var4 = class34.field735[var3];
            int var5 = class29.field597.method790((byte) 73);
            if ((var5 & 0x2) != 0) {
                var4.field762 = class29.field597.method772(-120);
                var4.field741 = 100;
            }
            if ((var5 & 0x1) != 0) {
                int var6 = class29.field597.method795(1);
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = class29.field597.method785((byte) -55);
                if (var4.field753 == var6 && var6 != -1) {
                    int var8 = class141.method1052(true, var6).field1672;
                    if (var8 == 1) {
                        var4.field747 = 0;
                        var4.field789 = 0;
                        var4.field799 = 0;
                        var4.field791 = var7;
                    }
                    if (var8 == 2) {
                        var4.field799 = 0;
                    }
                } else if (var6 == -1 || var4.field753 == -1 || class141.method1052(true, var6).field1656 >= class141.method1052(true, var4.field753).field1656) {
                    var4.field773 = var4.field811;
                    var4.field753 = var6;
                    var4.field799 = 0;
                    var4.field789 = 0;
                    var4.field747 = 0;
                    var4.field791 = var7;
                }
            }
            if ((var5 & 0x4) != 0) {
                var4.field817 = class29.field597.method795(1);
                int var9 = class29.field597.method745(-14545);
                var4.field759 = 0;
                var4.field764 = (var9 & 0xFFFF) + class94.field2229;
                var4.field770 = var9 >> 16;
                if (var4.field817 == 65535) {
                    var4.field817 = -1;
                }
                var4.field804 = 0;
                if (class94.field2229 < var4.field764) {
                    var4.field804 = -1;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field786 = class29.field597.method784(false);
                var4.field792 = class29.field597.method795(1);
            }
            if ((var5 & 0x8) != 0) {
                var4.field849 = class105.method852(8975, class29.field597.method784(false));
                var4.field752 = var4.field849.field1910;
                var4.field745 = var4.field849.field1902;
                var4.field807 = var4.field849.field1926;
                var4.field751 = var4.field849.field1916;
                var4.field813 = var4.field849.field1917;
                var4.field806 = var4.field849.field1907;
                var4.field802 = var4.field849.field1946;
                var4.field784 = var4.field849.field1940;
                var4.field742 = var4.field849.field1922;
            }
            if ((var5 & 0x80) != 0) {
                var4.field774 = class29.field597.method754((byte) -49);
                if (var4.field774 == 65535) {
                    var4.field774 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var10 = class29.field597.method790((byte) 73);
                int var11 = class29.field597.method789(-32769);
                var4.method237(2365, class94.field2229, var11, var10);
                var4.field740 = class94.field2229 + 300;
                var4.field744 = class29.field597.method785((byte) 46);
                var4.field783 = class29.field597.method787((byte) -73);
            }
            if ((var5 & 0x20) != 0) {
                int var12 = class29.field597.method785((byte) 127);
                int var13 = class29.field597.method790((byte) 73);
                var4.method237(2365, class94.field2229, var13, var12);
                var4.field740 = class94.field2229 + 300;
                var4.field744 = class29.field597.method789(-32769);
                var4.field783 = class29.field597.method789(-32769);
            }
        }
    }
}
