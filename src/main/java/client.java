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
public class client extends class188 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lcd;")
    public static class64 field4173 = class44.method335((byte) 71, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "Lcd;")
    public static class64 field4171 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lqm;")
    public static class222 field4166;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Lqm;")
    public static class222 field4172;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V", line = 6)
    private final void method1756(int arg0, boolean arg1) {
        class248.field4317 = 0;
        if (class60.field1174 == class230.field3909) {
            class230.field3909 = class180.field3089;
        } else {
            class230.field3909 = class60.field1174;
        }
        if (arg1) {
            this.method1765((byte) -39);
        }
        class164.field2890 = null;
        class126.field2272++;
        class156.field2756 = null;
        field4182++;
        if (class126.field2272 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class128.field2277 == 0 || class128.field2277 == 5) {
                this.method1329("js5connect_full", -100);
                class128.field2277 = 1000;
            } else {
                class159.field2811 = 3000;
            }
        } else if (class126.field2272 >= 2 && arg0 == 6) {
            this.method1329("js5connect_outofdate", -100);
            class128.field2277 = 1000;
        } else if (class126.field2272 >= 4) {
            if (class128.field2277 == 0 || class128.field2277 == 5) {
                this.method1329("js5connect", -100);
                class128.field2277 = 1000;
            } else {
                class159.field2811 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 59)
    private final void method1757(int arg0) {
        field4177++;
        if (class111.field2055.field3193 >= 4) {
            this.method1329("js5crc", -100);
            class128.field2277 = 1000;
            return;
        }
        if (class111.field2055.field3196 >= 4) {
            if (class128.field2277 == 0 || class128.field2277 == 5) {
                this.method1329("js5io", -100);
                class128.field2277 = 1000;
                return;
            }
            class111.field2055.field3196 = 3;
            class159.field2811 = 3000;
        }
        if (class159.field2811-- > 0) {
            return;
        }
        try {
            if (class248.field4317 == 0) {
                class164.field2890 = class228.field3876.method1948(class230.field3909, class247.field4296, (byte) -16);
                class248.field4317++;
            }
            if (class248.field4317 == 1) {
                if (class164.field2890.field375 == 2) {
                    this.method1756(-1, false);
                    return;
                }
                if (class164.field2890.field375 == 1) {
                    class248.field4317++;
                }
            }
            if (class248.field4317 == 2) {
                class156.field2756 = new class24((Socket) class164.field2890.field377, class228.field3876);
                class13 var2 = new class13(5);
                var2.method130(-1, 15);
                var2.method128((byte) 115, 514);
                class156.field2756.method227(var2.field254, 0, arg0 + 9, 5);
                class248.field4317++;
                class11.field230 = class154.method1114(true);
            }
            if (arg0 != -6) {
                return;
            }
            if (class248.field4317 == 3) {
                if (class128.field2277 == 0 || class128.field2277 == 5 || class156.field2756.method219(arg0 + 6) > 0) {
                    int var3 = class156.field2756.method223((byte) 119);
                    if (var3 != 0) {
                        this.method1756(var3, false);
                        return;
                    }
                    class248.field4317++;
                } else if ((class154.method1114(true) - class11.field230) > 30000L) {
                    this.method1756(-2, false);
                    return;
                }
            }
            if (class248.field4317 == 4) {
                boolean var4 = class128.field2277 == 5 || class128.field2277 == 10 || class128.field2277 == 28;
                class111.field2055.method1303(-8789, !var4, class156.field2756);
                class248.field4317 = 0;
                class126.field2272 = 0;
                class164.field2890 = null;
                class156.field2756 = null;
            }
        } catch (IOException var6) {
            this.method1756(-3, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 215)
    public final void method1334(int arg0) {
        class27.method243(106);
        class246.field4277 = new class226();
        class111.field2055 = new class185();
        if (class216.field3603 != 0) {
        }
        field4170++;
        class298.method2084((byte) -86, class228.field3876);
        if (class3.field33 == 0) {
            class157.field2768 = this.getCodeBase().getHost();
            class197.field3359 = 443;
            class62.field1206 = 43594;
        } else if (class3.field33 == 1) {
            class157.field2768 = this.getCodeBase().getHost();
            class62.field1206 = class244.field4253 + 40000;
            class197.field3359 = class244.field4253 + 50000;
        } else if (class3.field33 == 2) {
            class62.field1206 = class244.field4253 + 40000;
            class197.field3359 = class244.field4253 + 50000;
            class157.field2768 = "127.0.0.1";
        }
        if (class282.field4846 == 3 && class3.field33 != 2) {
            class76.field1433 = class244.field4253;
        }
        class247.field4296 = class157.field2768;
        if (class172.field2971 == 1) {
            class54.field884 = class275.field4722;
            class147.field2599 = class315.field5344;
            class52.field841 = 16777215;
            class52.field843 = 0;
            class140.field2480 = class164.field2879;
            class36.field578 = class249.field4330;
        } else {
            class54.field884 = class132.field2360;
            class140.field2480 = class201.field3443;
            class147.field2599 = class2.field10;
            class36.field578 = class115.field2110;
        }
        class60.field1174 = class62.field1206;
        class309.field5258 = class62.field1206;
        class157.field2766 = class69.field1329 = class223.field3799 = class301.field5177 = new short[256];
        class180.field3089 = class197.field3359;
        class230.field3909 = class309.field5258;
        class101.method745((byte) 51);
        class122.method859(false, class307.field5251);
        class165.method1181((byte) 127, class307.field5251);
        class43.field703 = class163.method1168((byte) -105);
        if (class43.field703 != null) {
            class43.field703.method196((byte) -7, class307.field5251);
        }
        class8.field182 = class282.field4846;
        try {
            if (class228.field3876.field4847 != null) {
                class106.field1961 = new class211(class228.field3876.field4847, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class312.field5297[var2] = new class211(class228.field3876.field4855[var2], 6000, 0);
                }
                class236.field3987 = new class211(class228.field3876.field4858, 6000, 0);
                class60.field1183 = new class30(255, class106.field1961, class236.field3987, 500000);
                class161.field2838 = new class211(class228.field3876.field4850, 24, 0);
                class228.field3876.field4850 = null;
                class228.field3876.field4858 = null;
                class228.field3876.field4847 = null;
                class228.field3876.field4855 = null;
            }
        } catch (IOException var4) {
            class60.field1183 = null;
            class106.field1961 = null;
            class236.field3987 = null;
            class161.field2838 = null;
        }
        if (arg0 != 3149) {
            field4173 = (class64) null;
        }
        class216.field3622 = class275.field4727;
        if (class3.field33 != 0) {
            class247.field4299 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lja;)Lja;", line = 335)
    public static final class60 method1758(class60 arg0) {
        int var1 = class236.method1690((byte) 38, method1762(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class125.method907(arg0.field1113, -92);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V", line = 365)
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg2; var6++) {
            class31.method268(arg4, 127, arg0, class124.field2241[var6], arg3);
        }
        if (arg5 < 24) {
            method1759(-73, 52, 99, 116, 119, -59);
        }
        field4178++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 409)
    public final void method1338(int arg0) {
        field4181++;
        if (class128.field2277 == 1000) {
            return;
        }
        if (arg0 != 2) {
            field4173 = (class64) null;
        }
        boolean var2 = class46.method347(-1690);
        if (var2 && class43.field696 && class94.field1747 != null) {
            class94.field1747.method1050(arg0 ^ 0x64);
        }
        if ((class128.field2277 == 30 || class128.field2277 == 10) && (class189.field3252 || class276.field4750 != 0L && class276.field4750 < class154.method1114(true))) {
            class295.method2063(class189.field3252, (byte) 98, class97.method731(29983), class268.field4616, class289.field4937);
        }
        if (class263.field4514 == null) {
            Container var3;
            if (class263.field4514 != null) {
                var3 = class263.field4514;
            } else if (class27.field441 == null) {
                var3 = class228.field3876.field4845;
            } else {
                var3 = class27.field441;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class27.field441 == var3) {
                Insets var6 = class27.field441.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class34.field549 != var4 || class2.field7 != var5) {
                if (class282.field4848.startsWith("mac")) {
                    class34.field549 = var4;
                    class2.field7 = var5;
                } else {
                    class27.method243(83);
                }
                class276.field4750 = class154.method1114(true) + 500L;
            }
        }
        if (class263.field4514 != null && !class77.field1458 && (class128.field2277 == 30 || class128.field2277 == 10)) {
            class295.method2063(false, (byte) 87, class304.field5200, -1, -1);
        }
        boolean var7 = false;
        if (class168.field2916) {
            class168.field2916 = false;
            var7 = true;
        }
        if (var7) {
            class109.method795(arg0 ^ 0x2);
        }
        if (class123.field2216) {
            for (int var8 = 0; var8 < 100; var8++) {
                class249.field4328[var8] = true;
            }
        }
        if (class128.field2277 == 0) {
            class36.method296((Color) null, var7, class27.field445, class289.field4949, 121);
        } else if (class128.field2277 == 5) {
            class292.method2016(arg0 + 16915, false, class75.field1419);
        } else if (class128.field2277 == 10) {
            class53.method402((byte) 74);
        } else if (class128.field2277 == 25 || class128.field2277 == 28) {
            if (class28.field453 == 1) {
                if (class143.field2520 < class64.field1236) {
                    class143.field2520 = class64.field1236;
                }
                int var10 = (class143.field2520 - class64.field1236) * 50 / class143.field2520;
                class78.method617(false, class104.method768(new class64[] { class139.field2466, class133.field2366, class310.method2149(var10, (byte) 109), class280.field4826 }, false), (byte) -110);
            } else if (class28.field453 == 2) {
                if (class112.field2076 < class9.field187) {
                    class112.field2076 = class9.field187;
                }
                int var9 = (class112.field2076 - class9.field187) * 50 / class112.field2076 + 50;
                class78.method617(false, class104.method768(new class64[] { class139.field2466, class133.field2366, class310.method2149(var9, (byte) -58), class280.field4826 }, false), (byte) -110);
            } else {
                class78.method617(false, class139.field2466, (byte) -110);
            }
        } else if (class128.field2277 == 30) {
            class211.method1481(arg0 ^ 0x71);
        } else if (class128.field2277 == 40) {
            class78.method617(false, class104.method768(new class64[] { class182.field3120, class162.field2847, class113.field2080 }, false), (byte) -110);
        }
        if (class123.field2216 && class128.field2277 != 0) {
            class123.method879();
            for (int var11 = 0; var11 < class241.field4161; var11++) {
                class267.field4582[var11] = false;
            }
        } else if ((class128.field2277 == 30 || class128.field2277 == 10) && class126.field2264 == 0 && !var7) {
            try {
                Graphics var12 = class307.field5251.getGraphics();
                for (int var13 = 0; var13 < class241.field4161; var13++) {
                    if (class267.field4582[var13]) {
                        class183.field3130.method679(class230.field3900[var13], class194.field3300[var13], true, var12, class47.field771[var13], class134.field2379[var13]);
                        class267.field4582[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class307.field5251.repaint();
            }
        } else if (class128.field2277 != 0) {
            try {
                Graphics var15 = class307.field5251.getGraphics();
                class183.field3130.method673(78, var15, 0, 0);
                for (int var16 = 0; var16 < class241.field4161; var16++) {
                    class267.field4582[var16] = false;
                }
            } catch (Exception var18) {
                class307.field5251.repaint();
            }
        }
        if (class43.field709) {
            class197.method1380(-127);
        }
        if (class3.field31 && class128.field2277 == 10 && class83.field1524 != -1) {
            class3.field31 = false;
            class274.method1899(class228.field3876, (byte) -41);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 638)
    public static void method1760(byte arg0) {
        field4166 = null;
        field4171 = null;
        field4173 = null;
        field4172 = null;
        if (arg0 < 7) {
            method1764((class60[]) null, -122, 67, -31, -120, -9, 83, -34);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 655)
    private final void method1761(byte arg0) {
        if (!class3.field31) {
            label228: while (true) {
                do {
                    if (!class202.method1416(32)) {
                        break label228;
                    }
                } while (class211.field3564 != 115 && class211.field3564 != 83);
                class3.field31 = true;
            }
        }
        field4167++;
        if (class130.field2315 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class154.method1114(true);
            if (class315.field5329 == 0L) {
                class315.field5329 = var4;
            }
            if (var3 > 16384 && (var4 - class315.field5329) < 5000L) {
                if (var4 - class46.field768 > 1000L) {
                    System.gc();
                    class46.field768 = var4;
                }
                class27.field445 = 5;
                class289.field4949 = class248.field4311;
            } else {
                class289.field4949 = class69.field1341;
                class27.field445 = 5;
                class130.field2315 = 10;
            }
        } else if (class130.field2315 == 10) {
            class177.method1249(4, 104, 104);
            for (int var27 = 0; var27 < 4; var27++) {
                class91.field1637[var27] = new class54(104, 104);
            }
            class130.field2315 = 30;
            class27.field445 = 10;
            class289.field4949 = class181.field3114;
        } else if (class130.field2315 == 30) {
            if (class258.field4457 == null) {
                class258.field4457 = new class53(class111.field2055, class246.field4277);
            }
            if (class258.field4457.method397(-81)) {
                class213.field3578 = class297.method2073(false, 0, true, true, 0);
                class138.field2449 = class297.method2073(false, 0, true, true, 1);
                class65.field1299 = class297.method2073(true, 0, false, true, 2);
                class140.field2474 = class297.method2073(false, 0, true, true, 3);
                class299.field5161 = class297.method2073(false, 0, true, true, 4);
                class253.field4413 = class297.method2073(true, 0, true, true, 5);
                class297.field5114 = class297.method2073(true, 0, true, false, 6);
                class19.field359 = class297.method2073(false, 0, true, true, 7);
                class3.field17 = class297.method2073(false, 0, true, true, 8);
                class222.field3775 = class297.method2073(false, 0, true, true, 9);
                class241.field4155 = class297.method2073(false, 0, true, true, 10);
                class226.field3843 = class297.method2073(false, 0, true, true, 11);
                class253.field4399 = class297.method2073(false, 0, true, true, 12);
                class143.field2504 = class297.method2073(false, 0, true, true, 13);
                class141.field2483 = class297.method2073(false, 0, true, false, 14);
                class119.field2164 = class297.method2073(false, 0, true, true, 15);
                class278.field4810 = class297.method2073(false, 0, true, true, 16);
                class41.field665 = class297.method2073(false, 0, true, true, 17);
                class69.field1332 = class297.method2073(false, 0, true, true, 18);
                class193.field3287 = class297.method2073(false, 0, true, true, 19);
                class64.field1233 = class297.method2073(false, 0, true, true, 20);
                class110.field2038 = class297.method2073(false, 0, true, true, 21);
                class94.field1753 = class297.method2073(false, 0, true, true, 22);
                class114.field2096 = class297.method2073(true, 0, true, true, 23);
                class82.field1518 = class297.method2073(false, 0, true, true, 24);
                class88.field1594 = class297.method2073(false, 0, true, true, 25);
                class299.field5154 = class297.method2073(true, 0, true, true, 26);
                class130.field2315 = 40;
                class27.field445 = 15;
                class289.field4949 = class222.field3779;
            } else {
                class289.field4949 = class143.field2512;
                class27.field445 = 12;
            }
        } else if (class130.field2315 == 40) {
            int var25 = 0;
            for (int var26 = 0; var26 < 27; var26++) {
                var25 += class158.field2781[var26].method250((byte) -59) * class232.field3922[var26] / 100;
            }
            if (var25 == 100) {
                class289.field4949 = class154.field2732;
                class27.field445 = 20;
                class159.method1153(class3.field17, 124);
                class41.method317(3284, class3.field17);
                class296.method2067(-121, class3.field17);
                class130.field2315 = 45;
            } else {
                if (var25 != 0) {
                    class289.field4949 = class104.method768(new class64[] { class240.field4114, class310.method2149(var25, (byte) 110), class3.field32 }, false);
                }
                class27.field445 = 20;
            }
        } else if (class130.field2315 == 45) {
            class31.method271(22050, 2, class275.field4718, (byte) 102);
            class140.field2479 = new class238();
            class140.field2479.method1723(18063, 9, 128);
            class94.field1747 = class234.method1677(0, -1024, 22050, class228.field3876, class307.field5251);
            class94.field1747.method1058(256, class140.field2479);
            class186.method1317(class299.field5161, class140.field2479, class119.field2164, class141.field2483, false);
            class315.field5334 = class234.method1677(1, -1024, 2048, class228.field3876, class307.field5251);
            class250.field4341 = new class203();
            class315.field5334.method1058(256, class250.field4341);
            class131.field2324 = new class151(22050, class63.field1213);
            class70.field1356 = class297.field5114.method1606(116, class156.field2753);
            class27.field445 = 30;
            class289.field4949 = class48.field800;
            class130.field2315 = 50;
        } else if (class130.field2315 == 50) {
            int var6 = class49.method358(class3.field17, class143.field2504, 1);
            int var7 = class72.method589(6);
            if (var6 < var7) {
                class289.field4949 = class104.method768(new class64[] { class249.field4334, class310.method2149(var6 * 100 / var7, (byte) -113), class3.field32 }, false);
                class27.field445 = 35;
            } else {
                class27.field445 = 35;
                class130.field2315 = 60;
                class289.field4949 = class135.field2418;
            }
        } else if (class130.field2315 == 60) {
            int var23 = class193.method1361(class3.field17, 0);
            int var24 = class72.method591(false);
            if (var23 < var24) {
                class289.field4949 = class104.method768(new class64[] { class255.field4427, class310.method2149(var23 * 100 / var24, (byte) 93), class3.field32 }, false);
                class27.field445 = 40;
            } else {
                class289.field4949 = class82.field1505;
                class27.field445 = 40;
                class130.field2315 = 65;
            }
        } else if (class130.field2315 == 65) {
            class145.method1033(class3.field17, 0, class143.field2504);
            class289.field4949 = class258.field4455;
            class27.field445 = 45;
            class153.method1107(5, (byte) -74);
            class130.field2315 = 70;
        } else if (class130.field2315 == 70) {
            class65.field1299.method1605(0);
            byte var12 = 0;
            int var13 = var12 + class65.field1299.method1581(-43);
            class278.field4810.method1605(0);
            int var14 = var13 + class278.field4810.method1581(65);
            class41.field665.method1605(0);
            int var15 = var14 + class41.field665.method1581(-123);
            class69.field1332.method1605(0);
            int var16 = var15 + class69.field1332.method1581(-10);
            class193.field3287.method1605(0);
            int var17 = var16 + class193.field3287.method1581(-125);
            class64.field1233.method1605(0);
            int var18 = var17 + class64.field1233.method1581(41);
            class110.field2038.method1605(0);
            int var19 = var18 + class110.field2038.method1581(-128);
            class94.field1753.method1605(0);
            int var20 = var19 + class94.field1753.method1581(-7);
            class82.field1518.method1605(0);
            int var21 = var20 + class82.field1518.method1581(-128);
            class88.field1594.method1605(0);
            int var22 = var21 + class88.field1594.method1581(-21);
            if (var22 < 1000) {
                class289.field4949 = class104.method768(new class64[] { class91.field1636, class310.method2149(var22 / 10, (byte) 103), class3.field32 }, false);
                class27.field445 = 50;
            } else {
                class101.method746(2, class65.field1299);
                class26.method237(class65.field1299, false);
                class269.method1888(20430, class65.field1299);
                class255.method1818((byte) 36, class19.field359, class65.field1299);
                class48.method354(class278.field4810, class19.field359, true, (byte) 8);
                class199.method1399(93, class69.field1332, class19.field359);
                class55.method428(true, (byte) -27, class193.field3287, class111.field2066, class19.field359);
                class139.method993((byte) 125, class65.field1299);
                class13.method115(class138.field2449, class64.field1233, -120, class213.field3578);
                class169.method1200(class110.field2038, 1024, class19.field359);
                class307.method2138(0, class94.field1753);
                class168.method1191(class65.field1299, 29065);
                class142.method1005(class143.field2504, -30089, class19.field359, class140.field2474, class3.field17);
                class40.method307(32, class65.field1299);
                class218.method1560(class41.field665, 2064);
                class8.method76(class82.field1518, -10700, new class297(), class88.field1594);
                class304.method2127(class82.field1518, -124, class88.field1594);
                class289.field4949 = class307.field5243;
                class27.field445 = 50;
                class101.method749((byte) -122);
                class130.field2315 = 80;
            }
        } else if (class130.field2315 == 80) {
            int var10 = class295.method2061(class3.field17, true);
            int var11 = class313.method2166(16);
            if (var10 >= var11) {
                class229.method1653(0, class3.field17);
                class289.field4949 = class121.field2180;
                class130.field2315 = 90;
                class27.field445 = 60;
            } else {
                class289.field4949 = class104.method768(new class64[] { class198.field3385, class310.method2149(var10 * 100 / var11, (byte) -106), class3.field32 }, false);
                class27.field445 = 60;
            }
        } else if (class130.field2315 == 90) {
            if (class299.field5154.method1605(0)) {
                class241 var9 = new class241(class222.field3775, class299.field5154, class3.field17, 20, !class83.field1522);
                class50.method372(var9);
                if (class201.field3441 == 1) {
                    class50.method361(0.9F);
                }
                if (class201.field3441 == 2) {
                    class50.method361(0.8F);
                }
                if (class201.field3441 == 3) {
                    class50.method361(0.7F);
                }
                if (class201.field3441 == 4) {
                    class50.method361(0.6F);
                }
                class27.field445 = 70;
                class289.field4949 = class211.field3561;
                class130.field2315 = 100;
            } else {
                class289.field4949 = class104.method768(new class64[] { class40.field618, class310.method2149(class299.field5154.method1581(21), (byte) -56), class3.field32 }, false);
                class27.field445 = 70;
            }
        } else if (class130.field2315 == 100) {
            if (class30.method263(true, class3.field17)) {
                class130.field2315 = 110;
            }
        } else if (class130.field2315 == 110) {
            class153.field2719 = new class145();
            class228.field3876.method1958(10, class153.field2719, 16711);
            class27.field445 = 75;
            class130.field2315 = 120;
            class289.field4949 = class131.field2319;
        } else if (class130.field2315 == 120) {
            if (class241.field4155.method1601(class49.field812, class188.field3240, false)) {
                class261 var8 = new class261(class241.field4155.method1604(class188.field3240, class49.field812, 100));
                class247.method1787(-117, var8);
                class289.field4949 = class309.field5256;
                class27.field445 = 80;
                class130.field2315 = 130;
            } else {
                class289.field4949 = class104.method768(new class64[] { class252.field4390, class180.field3084 }, false);
                class27.field445 = 80;
            }
        } else if (class130.field2315 == 130) {
            if (!class140.field2474.method1605(0)) {
                class289.field4949 = class104.method768(new class64[] { class47.field788, class310.method2149(class140.field2474.method1581(-128) * 3 / 4, (byte) 104), class3.field32 }, false);
                class27.field445 = 85;
            } else if (!class253.field4399.method1605(0)) {
                class289.field4949 = class104.method768(new class64[] { class47.field788, class310.method2149((class253.field4399.method1581(111) / 10) + 75, (byte) 110), class3.field32 }, false);
                class27.field445 = 85;
            } else if (!class143.field2504.method1605(0)) {
                class289.field4949 = class104.method768(new class64[] { class47.field788, class310.method2149(class143.field2504.method1581(-127) / 20 + 85, (byte) -44), class3.field32 }, false);
                class27.field445 = 85;
            } else if (class114.field2096.method1602(-102, class97.field1783)) {
                class190.method1343(class14.field315, class108.field2005, class114.field2096, class189.field3254, class273.field4682, (byte) 116, class200.field3432);
                class27.field445 = 95;
                class289.field4949 = class54.field891;
                class130.field2315 = 135;
            } else {
                class289.field4949 = class104.method768(new class64[] { class47.field788, class310.method2149((class114.field2096.method1593(class97.field1783, 0) / 10) + 90, (byte) -61), class3.field32 }, false);
                class27.field445 = 85;
            }
        } else if (class130.field2315 == 135) {
            if (class255.method1822((byte) 86)) {
                class289.field4949 = class34.field558;
                class130.field2315 = 140;
                class27.field445 = 96;
            } else {
                class27.field445 = 95;
                class289.field4949 = class84.field1560;
            }
        } else if (class130.field2315 == 140) {
            class13.field307 = class140.field2474.method1606(85, class157.field2776);
            class253.field4413.method1603(2, false, true);
            class297.field5114.method1603(2, true, true);
            class3.field17.method1603(2, true, true);
            class143.field2504.method1603(2, true, true);
            class241.field4155.method1603(2, true, true);
            class140.field2474.method1603(2, true, true);
            class43.field709 = true;
            class130.field2315 = 150;
            class27.field445 = 97;
            class289.field4949 = class35.field577;
        } else {
            if (arg0 <= 102) {
                field4166 = (class222) null;
            }
            if (class130.field2315 == 150) {
                class212.method1493();
                if (class3.field31) {
                    class304.field5200 = 0;
                }
                class3.field31 = true;
                class274.method1899(class228.field3876, (byte) -41);
                class295.method2063(false, (byte) 109, class304.field5200, -1, -1);
                class27.field445 = 100;
                class130.field2315 = 160;
                class289.field4949 = class304.field5195;
            } else if (class130.field2315 == 160) {
                class74.method598(true, 315);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1136)
    public final void method1331(int arg0) {
        field4164++;
        method1760((byte) 27);
        class64.method514((byte) 118);
        class19.method191(-122);
        class306.method2130(-74);
        class284.method1971(false);
        class188.method1325(16736443);
        class123.method897();
        class249.method1793(-6327);
        class104.method769(0);
        class145.method1034((byte) -119);
        class65.method545(0);
        class13.method102((byte) 26);
        class24.method222((byte) -118);
        class185.method1312((byte) 96);
        class226.method1636(-609217497);
        class53.method398(arg0 ^ 0x64);
        class29.method249((byte) 72);
        class222.method1579(-1);
        class211.method1484(9109);
        class30.method264(-31836);
        class168.method1188((byte) 96);
        class232.method1666(-126);
        class173.method1221(false);
        class54.method423(-20260);
        class60.method468(-1);
        class289.method1995(true);
        class41.method322((byte) 60);
        class106.method774(1);
        class159.method1145((byte) 113);
        class112.method809(26811);
        class108.method788((byte) -82);
        class40.method313(true);
        class238.method1705(-13410);
        class149.method1056(arg0 ^ 0xFFFF82F7);
        class151.method1097(arg0 - 30);
        class312.method2159(false);
        class199.method1400(-292669904);
        class103.method761((byte) 85);
        class295.method2060(arg0 - 159);
        class55.method427(arg0 - 99);
        class6.method64(-114);
        class172.method1208(0);
        class25.method233(105);
        class237.method1699((byte) -69);
        class102.method754(false);
        class255.method1820(true);
        class198.method1387((byte) -127);
        class260.method1836((byte) 126);
        class229.method1651(arg0 ^ 0xFFFFC8C3);
        class205.method1433(0);
        class134.method955(21);
        class163.method1167(true);
        class309.method2143(-22872);
        class140.method995((byte) 127);
        class290.method2002((byte) -78);
        class254.method1816(-11016);
        class70.method575(12222);
        class52.method390();
        class187.method1321(false);
        class150.method1066();
        class1.method1(1);
        class217.method1540();
        class92.method702(false);
        class5.method37();
        class213.method1499(-128);
        class292.method2018((byte) -94);
        class154.method1113(1);
        class296.method2070(arg0 ^ 0x8);
        class69.method570(226);
        class285.method1978();
        class275.method1910((byte) -57);
        class287.method1983((byte) 8);
        class142.method1010(-13514);
        class175.method1225(-96);
        class179.method1258();
        class8.method74(2);
        class197.method1381((byte) 49);
        class225.method1631();
        class61.method481(-26261);
        class83.method641((byte) -29);
        class182.method1289(false);
        class209.method1454();
        class177.method1243();
        class220.method1569(2);
        class2.method8(80);
        class251.method1800(-1);
        class58.method443((byte) -95);
        class85.method648(-9);
        class210.method1467();
        class190.method1345((byte) -109);
        class193.method1362((byte) -63);
        class122.method858(-113);
        class130.method937((byte) 91);
        class43.method330(true);
        class135.method967(arg0 ^ 0xFFFFFFE0);
        class157.method1131(12203);
        class137.method984((byte) -127);
        class97.method733((byte) -4);
        class44.method339(255);
        class74.method594((byte) -63);
        class78.method616((byte) -109);
        class91.method690(arg0 ^ 0x1F);
        class105.method773(-128);
        class301.method2096((byte) -109);
        class158.method1136((byte) -19);
        class80.method630(36);
        class71.method586((byte) 30);
        class297.method2076((byte) 91);
        class268.method1878(false);
        class241.method1755(false);
        class277.method1922(-26547);
        class274.method1900(23);
        class50.method369();
        class261.method1839(-1);
        class121.method852(-1885);
        class206.method1438(-8043);
        class10.method87((byte) -90);
        class9.method85(104);
        class212.method1497();
        class28.method244(0);
        class111.method806(10);
        class119.method843((byte) 101);
        class11.method90(28184);
        class262.method1843(arg0 ^ 0xFFFFB263);
        class313.method2170((byte) 47);
        class204.method1427();
        class195.method1368(1);
        class110.method800(false);
        class162.method1166(false);
        class184.method1294(false);
        class37.method300((byte) -68);
        class180.method1284(-126);
        class181.method1286(52);
        class45.method340();
        class114.method819(0);
        class117.method833(0);
        class26.method235(-72);
        class308.method2142();
        class48.method357(0);
        class302.method2110();
        class23.method218();
        class133.method951((byte) -81);
        class120.method849(107);
        class66.method550(-126);
        class299.method2089((byte) -21);
        class115.method823(360000);
        class246.method1782(3);
        class49.method360(1);
        class248.method1791(0);
        class89.method681((byte) 123);
        class129.method933();
        class245.method1776(20);
        class21.method210();
        class310.method2150((byte) 28);
        class147.method1045(arg0 - 134);
        class59.method454(-7588);
        class267.method1868(126);
        class307.method2140(0);
        class84.method645((byte) 58);
        class155.method1120((byte) 89);
        class216.method1521(89);
        class81.method631((byte) -128);
        class234.method1681(-63);
        class141.method999(false);
        class139.method988(69);
        class202.method1415((byte) 26);
        class31.method265(arg0 ^ 0xFFFFFFE0);
        class186.method1315((byte) -53);
        class99.method739((byte) 110);
        class88.method678(0);
        class272.method1893((byte) 80);
        class42.method328(-108);
        class75.method601((byte) 98);
        class12.method97((byte) -38);
        class18.method187();
        class244.method1774(18002);
        class247.method1785(false);
        class7.method73((byte) -105);
        class62.method485((byte) 109);
        class166.method1185((byte) -115);
        class171.method1206();
        class191.method1348();
        class170.method1205();
        class280.method1939(true);
        class270.method1891(0);
        class124.method901(506047432);
        class72.method590(arg0 ^ arg0);
        class144.method1030();
        class257.method1827();
        class131.method942(125);
        class113.method810(true);
        class240.method1743((byte) -63);
        class278.method1931(1941548524);
        class250.method1794((byte) -25);
        class17.method174(false);
        class315.method2177((byte) 68);
        class77.method609(255);
        class63.method488(16);
        class266.method1861((byte) -27);
        class46.method341((byte) -37);
        class252.method1808(false);
        class32.method276(true);
        class253.method1811(arg0 ^ 0xFFFFFF84);
        class259.method1834(106);
        class132.method947(192);
        class291.method2014();
        class152.method1100();
        class194.method1363((byte) 73);
        class156.method1122(arg0 + 8484);
        class153.method1104(45);
        class161.method1160((byte) 64);
        class189.method1340(-97);
        class264.method1849(-75);
        class281.method1943(arg0 - 30);
        class263.method1847((byte) -108);
        class273.method1897(-110);
        class36.method292(-10948);
        class298.method2085(3);
        class283.method1969(-1);
        class288.method1989(arg0 - 31);
        class228.method1650((byte) -127);
        class196.method1374(93);
        class107.method785(-67);
        class3.method14(-6002);
        class230.method1659((byte) -127);
        class143.method1016(arg0 + 91);
        class35.method287((byte) 24);
        class76.method602(-115);
        class236.method1689((byte) -48);
        class93.method711(1);
        class118.method836((byte) -128);
        class138.method986(57);
        class224.method1615((byte) -106);
        class125.method905(-5);
        class265.method1856(-1);
        class269.method1883((byte) -88);
        class200.method1404(-1);
        class47.method351(true);
        class94.method713((byte) 34);
        class96.method723(false);
        class109.method796(arg0 - 22);
        class314.method2172(false);
        class146.method1037((byte) -125);
        class233.method1671(-2087918676);
        class169.method1203(arg0 + 82);
        class165.method1182(false);
        class304.method2128(true);
        class183.method1292((byte) 108);
        class15.method167((byte) -59);
        class160.method1156(arg0 + 16711649);
        class223.method1613(-1);
        class258.method1831(-5889);
        class164.method1176(3367);
        class227.method1643(arg0 - 33);
        class27.method241(true);
        class218.method1558((byte) -108);
        class34.method282(-44);
        class14.method166(-97);
        class82.method635((byte) -46);
        class201.method1411(-92);
        class235.method1683(arg0 + 83);
        class56.method430((byte) 89);
        class101.method750(190);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lja;)I", line = 1406)
    public static final int method1762(class60 arg0) {
        class84 var1 = (class84) class184.field3146.method1151(((long) arg0.field1080 << 32) + (long) arg0.field1167, 0);
        return var1 == null ? arg0.field1141 : var1.field1552;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1428)
    public final void method1333(byte arg0) {
        if (class123.field2216) {
            class123.method892();
        }
        if (class263.field4514 != null) {
            class274.method1901(class263.field4514, arg0 - 100, class228.field3876);
            class263.field4514 = null;
        }
        field4169++;
        if (class228.field3876 != null) {
            class228.field3876.method1950(this.getClass(), true);
        }
        if (arg0 != 110) {
            this.init();
        }
        if (class153.field2719 != null) {
            class153.field2719.field2559 = false;
        }
        class153.field2719 = null;
        if (class216.field3626 != null) {
            class216.field3626.method225(1);
            class216.field3626 = null;
        }
        class281.method1945(-7058, class307.field5251);
        class59.method460(109, class307.field5251);
        if (class43.field703 != null) {
            class43.field703.method198(class307.field5251, 112);
        }
        class107.method783((byte) 87);
        class20.method197((byte) 13);
        class43.field703 = null;
        if (class94.field1747 != null) {
            class94.field1747.method1060(-27441);
        }
        if (class315.field5334 != null) {
            class315.field5334.method1060(arg0 - 27551);
        }
        class111.field2055.method1301(arg0 + 12);
        class246.field4277.method1634(0);
        try {
            if (class106.field1961 != null) {
                class106.field1961.method1490((byte) 107);
            }
            if (class312.field5297 != null) {
                for (int var2 = 0; var2 < class312.field5297.length; var2++) {
                    if (class312.field5297[var2] != null) {
                        class312.field5297[var2].method1490((byte) 107);
                    }
                }
            }
            if (class236.field3987 != null) {
                class236.field3987.method1490((byte) 107);
            }
            if (class161.field2838 != null) {
                class161.field2838.method1490((byte) 107);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lja;)Z", line = 1523)
    public static final boolean method1763(class60 arg0) {
        if (class17.field346) {
            if (method1762(arg0) != 0) {
                return false;
            }
            if (arg0.field1091 == 0) {
                return false;
            }
        }
        return arg0.field1102;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lja;IIIIIII)V", line = 1544)
    public static final void method1764(class60[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class60 var9 = arg0[var8];
            if (var9 != null && var9.field1113 == arg1 && (!var9.field1017 || var9.field1091 == 0 || var9.field1092 || method1762(var9) != 0 || class183.field3133 == var9 || var9.field1013 == 1338) && (!var9.field1017 || !method1763(var9))) {
                int var10 = var9.field1040 + arg6;
                int var11 = var9.field1032 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1091 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1163 + var10;
                    int var17 = var9.field1016 + var11;
                    if (var9.field1091 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class263.field4511 == var9) {
                    class218.field3708 = true;
                    class60.field1150 = var10;
                    class230.field3892 = var11;
                }
                if (!var9.field1017 || var12 < var14 && var13 < var15) {
                    if (var9.field1091 == 0) {
                        if (!var9.field1017 && method1763(var9) && class189.field3256 != var9) {
                            continue;
                        }
                        if (var9.field1133 && class281.field4835 >= var12 && class188.field3213 >= var13 && class281.field4835 < var14 && class188.field3213 < var15) {
                            for (class11 var18 = (class11) class306.field5220.method778(0); var18 != null; var18 = (class11) class306.field5220.method775(26517)) {
                                if (var18.field213) {
                                    var18.method232(128);
                                }
                            }
                            if (class164.field2882 == 0) {
                                class263.field4511 = null;
                                class183.field3133 = null;
                            }
                            class227.field3866 = false;
                            class197.field3375 = null;
                        }
                    }
                    if (var9.field1017) {
                        boolean var19;
                        if (class281.field4835 >= var12 && class188.field3213 >= var13 && class281.field4835 < var14 && class188.field3213 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class260.field4472 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class232.field3916 == 1 && class268.field4609 >= var12 && class238.field4061 >= var13 && class268.field4609 < var14 && class238.field4061 < var15) {
                            var21 = true;
                        }
                        if (class156.field2762 > 0 && var9.field1121 != null) {
                            for (int var22 = 0; var22 < var9.field1121.length; var22++) {
                                for (int var23 = 0; var23 < class156.field2762; var23++) {
                                    int var24 = var9.field1121[var22] & 0xFF;
                                    if (class301.field5171[var23] == var24) {
                                        if (var9.field1093 != null) {
                                            byte var25 = var9.field1093[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class120.field2174[86] || (var25 & 0x1) != 0 && !class120.field2174[82] || (var25 & 0x4) != 0 && !class120.field2174[81])) {
                                                continue;
                                            }
                                        }
                                        class85.method656(var9.field1080, -1, -100, var22 + 1, class188.field3240);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class17.method173(class268.field4609 - var10, (byte) -15, class238.field4061 - var11, var9);
                        }
                        if (class263.field4511 != null && class263.field4511 != var9 && var19 && class48.method353(method1762(var9), -114)) {
                            class188.field3239 = var9;
                        }
                        if (class183.field3133 == var9) {
                            class175.field2999 = true;
                            class107.field1972 = var10;
                            class48.field801 = var11;
                        }
                        if (var9.field1092 || var9.field1013 != 0) {
                            if (var19 && class266.field4570 != 0 && var9.field1126 != null) {
                                class11 var26 = new class11();
                                var26.field213 = true;
                                var26.field212 = var9;
                                var26.field226 = class266.field4570;
                                var26.field229 = var9.field1126;
                                class306.field5220.method781(var26, 10751);
                            }
                            if (class263.field4511 != null || class265.field4561 != null || class101.field1828 || var9.field1013 != 1400 && class227.field3866) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1013 != 0) {
                                if (var9.field1013 == 1337) {
                                    class261.field4497 = var9;
                                    class190.method1342(var9, 0);
                                    continue;
                                }
                                if (var9.field1013 == 1338) {
                                    if (var21) {
                                        class197.field3375 = var9;
                                        class85.field1564 = class268.field4609 - var10;
                                        class135.field2417 = class238.field4061 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1013 == 1400) {
                                    class47.field790 = var9;
                                    if (var21) {
                                        if (class120.field2174[82] && class301.field5174 > 0) {
                                            int var27 = (int) ((double) (class268.field4609 - var10 - var9.field1163 / 2) * 2.0D / (double) class298.field5138);
                                            int var28 = (int) ((double) (class238.field4061 - var11 - var9.field1016 / 2) * 2.0D / (double) class298.field5138);
                                            int var29 = class69.field1335 + var27;
                                            int var30 = class274.field4699 + var28;
                                            int var31 = class251.field4360 + var29;
                                            int var32 = class233.field3934 + class232.field3923 - var30 - 1;
                                            class180.method1283(127, var31, 0, var32);
                                            class70.method573(15);
                                            continue;
                                        }
                                        class227.field3866 = true;
                                        class234.field3957 = class281.field4835;
                                        class115.field2116 = class188.field3213;
                                        class229.field3890 = class69.field1335;
                                        class292.field5032 = class274.field4699;
                                        continue;
                                    }
                                    if (var20 && class227.field3866) {
                                        class197.method1385((int) ((double) (class234.field3957 - class281.field4835) * 2.0D / (double) class106.field1965) + class229.field3890, 122);
                                        class186.method1316(-46, (int) ((double) (class115.field2116 - class188.field3213) * 2.0D / (double) class106.field1965) + class292.field5032);
                                        continue;
                                    }
                                    class227.field3866 = false;
                                    continue;
                                }
                                if (var9.field1013 == 1401) {
                                    if (var20) {
                                        class169.method1201(var9.field1016, class281.field4835 - var10, class188.field3213 - var11, var9.field1163, true);
                                    }
                                    continue;
                                }
                                if (var9.field1013 == 1402) {
                                    if (!class123.field2216) {
                                        class190.method1342(var9, 0);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1096 && var21) {
                                var9.field1096 = true;
                                if (var9.field1055 != null) {
                                    class11 var33 = new class11();
                                    var33.field213 = true;
                                    var33.field212 = var9;
                                    var33.field225 = class268.field4609 - var10;
                                    var33.field226 = class238.field4061 - var11;
                                    var33.field229 = var9.field1055;
                                    class306.field5220.method781(var33, 10751);
                                }
                            }
                            if (var9.field1096 && var20 && var9.field1065 != null) {
                                class11 var34 = new class11();
                                var34.field213 = true;
                                var34.field212 = var9;
                                var34.field225 = class281.field4835 - var10;
                                var34.field226 = class188.field3213 - var11;
                                var34.field229 = var9.field1065;
                                class306.field5220.method781(var34, 10751);
                            }
                            if (var9.field1096 && !var20) {
                                var9.field1096 = false;
                                if (var9.field1058 != null) {
                                    class11 var35 = new class11();
                                    var35.field213 = true;
                                    var35.field212 = var9;
                                    var35.field225 = class281.field4835 - var10;
                                    var35.field226 = class188.field3213 - var11;
                                    var35.field229 = var9.field1058;
                                    class70.field1353.method781(var35, 10751);
                                }
                            }
                            if (var20 && var9.field1147 != null) {
                                class11 var36 = new class11();
                                var36.field213 = true;
                                var36.field212 = var9;
                                var36.field225 = class281.field4835 - var10;
                                var36.field226 = class188.field3213 - var11;
                                var36.field229 = var9.field1147;
                                class306.field5220.method781(var36, 10751);
                            }
                            if (!var9.field1056 && var19) {
                                var9.field1056 = true;
                                if (var9.field1064 != null) {
                                    class11 var37 = new class11();
                                    var37.field213 = true;
                                    var37.field212 = var9;
                                    var37.field225 = class281.field4835 - var10;
                                    var37.field226 = class188.field3213 - var11;
                                    var37.field229 = var9.field1064;
                                    class306.field5220.method781(var37, 10751);
                                }
                            }
                            if (var9.field1056 && var19 && var9.field1084 != null) {
                                class11 var38 = new class11();
                                var38.field213 = true;
                                var38.field212 = var9;
                                var38.field225 = class281.field4835 - var10;
                                var38.field226 = class188.field3213 - var11;
                                var38.field229 = var9.field1084;
                                class306.field5220.method781(var38, 10751);
                            }
                            if (var9.field1056 && !var19) {
                                var9.field1056 = false;
                                if (var9.field1031 != null) {
                                    class11 var39 = new class11();
                                    var39.field213 = true;
                                    var39.field212 = var9;
                                    var39.field225 = class281.field4835 - var10;
                                    var39.field226 = class188.field3213 - var11;
                                    var39.field229 = var9.field1031;
                                    class70.field1353.method781(var39, 10751);
                                }
                            }
                            if (var9.field1119 != null) {
                                class11 var40 = new class11();
                                var40.field212 = var9;
                                var40.field229 = var9.field1119;
                                class102.field1837.method781(var40, 10751);
                            }
                            if (var9.field1035 != null && class272.field4670 > var9.field1108) {
                                if (var9.field1042 == null || class272.field4670 - var9.field1108 > 32) {
                                    class11 var45 = new class11();
                                    var45.field212 = var9;
                                    var45.field229 = var9.field1035;
                                    class306.field5220.method781(var45, 10751);
                                } else {
                                    label548: for (int var41 = var9.field1108; var41 < class272.field4670; var41++) {
                                        int var42 = class43.field699[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field1042.length; var43++) {
                                            if (var9.field1042[var43] == var42) {
                                                class11 var44 = new class11();
                                                var44.field212 = var9;
                                                var44.field229 = var9.field1035;
                                                class306.field5220.method781(var44, 10751);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1108 = class272.field4670;
                            }
                            if (var9.field1077 != null && class124.field2243 > var9.field1070) {
                                if (var9.field1081 == null || class124.field2243 - var9.field1070 > 32) {
                                    class11 var50 = new class11();
                                    var50.field212 = var9;
                                    var50.field229 = var9.field1077;
                                    class306.field5220.method781(var50, 10751);
                                } else {
                                    label524: for (int var46 = var9.field1070; var46 < class124.field2243; var46++) {
                                        int var47 = class130.field2317[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field1081.length; var48++) {
                                            if (var9.field1081[var48] == var47) {
                                                class11 var49 = new class11();
                                                var49.field212 = var9;
                                                var49.field229 = var9.field1077;
                                                class306.field5220.method781(var49, 10751);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1070 = class124.field2243;
                            }
                            if (var9.field1114 != null && class307.field5246 > var9.field1072) {
                                if (var9.field1116 == null || class307.field5246 - var9.field1072 > 32) {
                                    class11 var55 = new class11();
                                    var55.field212 = var9;
                                    var55.field229 = var9.field1114;
                                    class306.field5220.method781(var55, 10751);
                                } else {
                                    label500: for (int var51 = var9.field1072; var51 < class307.field5246; var51++) {
                                        int var52 = class290.field4982[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field1116.length; var53++) {
                                            if (var9.field1116[var53] == var52) {
                                                class11 var54 = new class11();
                                                var54.field212 = var9;
                                                var54.field229 = var9.field1114;
                                                class306.field5220.method781(var54, 10751);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1072 = class307.field5246;
                            }
                            if (var9.field1068 != null && class82.field1519 > var9.field1152) {
                                if (var9.field1170 == null || class82.field1519 - var9.field1152 > 32) {
                                    class11 var60 = new class11();
                                    var60.field212 = var9;
                                    var60.field229 = var9.field1068;
                                    class306.field5220.method781(var60, 10751);
                                } else {
                                    label476: for (int var56 = var9.field1152; var56 < class82.field1519; var56++) {
                                        int var57 = class78.field1463[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field1170.length; var58++) {
                                            if (var9.field1170[var58] == var57) {
                                                class11 var59 = new class11();
                                                var59.field212 = var9;
                                                var59.field229 = var9.field1068;
                                                class306.field5220.method781(var59, 10751);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1152 = class82.field1519;
                            }
                            if (var9.field1020 != null && class206.field3516 > var9.field1129) {
                                if (var9.field1027 == null || class206.field3516 - var9.field1129 > 32) {
                                    class11 var65 = new class11();
                                    var65.field212 = var9;
                                    var65.field229 = var9.field1020;
                                    class306.field5220.method781(var65, 10751);
                                } else {
                                    label452: for (int var61 = var9.field1129; var61 < class206.field3516; var61++) {
                                        int var62 = class260.field4479[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field1027.length; var63++) {
                                            if (var9.field1027[var63] == var62) {
                                                class11 var64 = new class11();
                                                var64.field212 = var9;
                                                var64.field229 = var9.field1020;
                                                class306.field5220.method781(var64, 10751);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field1129 = class206.field3516;
                            }
                            if (class108.field2008 > var9.field1125 && var9.field1178 != null) {
                                class11 var66 = new class11();
                                var66.field212 = var9;
                                var66.field229 = var9.field1178;
                                class306.field5220.method781(var66, 10751);
                            }
                            if (class47.field781 > var9.field1125 && var9.field1063 != null) {
                                class11 var67 = new class11();
                                var67.field212 = var9;
                                var67.field229 = var9.field1063;
                                class306.field5220.method781(var67, 10751);
                            }
                            if (class268.field4626 > var9.field1125 && var9.field1164 != null) {
                                class11 var68 = new class11();
                                var68.field212 = var9;
                                var68.field229 = var9.field1164;
                                class306.field5220.method781(var68, 10751);
                            }
                            if (class307.field5242 > var9.field1125 && var9.field1123 != null) {
                                class11 var69 = new class11();
                                var69.field212 = var9;
                                var69.field229 = var9.field1123;
                                class306.field5220.method781(var69, 10751);
                            }
                            if (class149.field2621 > var9.field1125 && var9.field1057 != null) {
                                class11 var70 = new class11();
                                var70.field212 = var9;
                                var70.field229 = var9.field1057;
                                class306.field5220.method781(var70, 10751);
                            }
                            var9.field1125 = class238.field4039;
                            if (var9.field1104 != null) {
                                for (int var71 = 0; var71 < class156.field2762; var71++) {
                                    class11 var72 = new class11();
                                    var72.field212 = var9;
                                    var72.field219 = class301.field5171[var71];
                                    var72.field221 = class253.field4398[var71];
                                    var72.field229 = var9.field1104;
                                    class306.field5220.method781(var72, 10751);
                                }
                            }
                            if (class180.field3078 && var9.field1050 != null) {
                                class11 var73 = new class11();
                                var73.field212 = var9;
                                var73.field229 = var9.field1050;
                                class306.field5220.method781(var73, 10751);
                            }
                        }
                    }
                    if (!var9.field1017 && class263.field4511 == null && class265.field4561 == null && !class101.field1828) {
                        if ((var9.field1073 >= 0 || var9.field1066 != 0) && class281.field4835 >= var12 && class188.field3213 >= var13 && class281.field4835 < var14 && class188.field3213 < var15) {
                            if (var9.field1073 >= 0) {
                                class189.field3256 = arg0[var9.field1073];
                            } else {
                                class189.field3256 = var9;
                            }
                        }
                        if (var9.field1091 == 8 && class281.field4835 >= var12 && class188.field3213 >= var13 && class281.field4835 < var14 && class188.field3213 < var15) {
                            class297.field5116 = var9;
                        }
                        if (var9.field1171 > var9.field1016) {
                            class227.method1641(var11, (byte) 113, class188.field3213, var9.field1016, class281.field4835, var9, var9.field1163 + var10, var9.field1171);
                        }
                    }
                    if (var9.field1091 == 0) {
                        method1764(arg0, var9.field1080, var12, var13, var14, var15, var10 - var9.field1175, var11 - var9.field1022);
                        if (var9.field1100 != null) {
                            method1764(var9.field1100, var9.field1080, var12, var13, var14, var15, var10 - var9.field1175, var11 - var9.field1022);
                        }
                        class172 var74 = (class172) class159.field2805.method1151((long) var9.field1080, 0);
                        if (var74 != null) {
                            class199.method1396(var13, var74.field2967, (byte) 98, var11, var14, var15, var12, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2297)
    public static final void main(String[] arg0) {
        try {
            int var1 = -1;
            if (arg0.length != 4) {
                class110.method802("argument count", 1);
            }
            class244.field4253 = Integer.parseInt(arg0[0]);
            class3.field33 = 2;
            if (arg0[1].equals("live")) {
                class216.field3603 = 0;
            } else if (arg0[1].equals("rc")) {
                class216.field3603 = 1;
            } else if (arg0[1].equals("wip")) {
                class216.field3603 = 2;
            } else {
                class110.method802("modewhat", 1);
            }
            class267.field4604 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class154.method1112(-109, class292.method2015(0, var2, 0, var2.length));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class253.field4411 = var1;
            } else if (arg0[2].equals("english")) {
                class253.field4411 = 0;
            } else if (arg0[2].equals("german")) {
                class253.field4411 = 1;
            } else {
                class110.method802("language", 1);
            }
            class1.method2(true, class253.field4411);
            class224.field3814 = false;
            class245.field4257 = false;
            if (arg0[3].equals("game0")) {
                class172.field2971 = 0;
            } else if (arg0[3].equals("game1")) {
                class172.field2971 = 1;
            } else {
                class110.method802("game", 1);
            }
            class151.field2695 = false;
            class188.field3241 = 0;
            class145.field2560 = class188.field3240;
            client var4 = new client();
            class134.field2370 = var4;
            var4.method1336(23213, 768, "runescape", class216.field3603 + 32, 1024, 514, 27);
            class27.field441.setLocation(40, 40);
        } catch (Exception var7) {
            class309.method2146((byte) -88, (String) null, var7);
        }
        field4180++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2374)
    private final void method1765(byte arg0) {
        field4175++;
        boolean var2 = class111.field2055.method1300(true);
        if (arg0 > 50 && !var2) {
            this.method1757(-6);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 2408)
    public final void method1324(int arg0) {
        field4168++;
        if (class128.field2277 == 1000) {
            return;
        }
        class29.field482++;
        if ((class29.field482 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class107.field1975 = var2.get(11) * 600 + var2.get(12) * 10 + (var2.get(13) / 6);
            class269.field4631.setSeed((long) class107.field1975);
        }
        this.method1765((byte) 123);
        if (class258.field4457 != null) {
            class258.field4457.method403(119);
        }
        if (arg0 <= 10) {
            field4173 = (class64) null;
        }
        class105.method772(81);
        class246.method1778(5);
        class220.method1571((byte) -80);
        class63.method489(81);
        if (class123.field2216) {
            class285.method1977();
        }
        if (class43.field703 != null) {
            int var3 = class43.field703.method199(false);
            class266.field4570 = var3;
        }
        if (class128.field2277 == 0) {
            this.method1761((byte) 113);
            class31.method270((byte) 126);
        } else if (class128.field2277 == 5) {
            this.method1761((byte) 118);
            class31.method270((byte) -13);
        } else if (class128.field2277 == 25 || class128.field2277 == 28) {
            class111.method808(0);
        }
        if (class128.field2277 == 10) {
            this.method1766(-72);
            class297.method2072(-12043);
            class101.method747((byte) -53);
            class119.method845(78);
        } else if (class128.field2277 == 30) {
            class35.method289(-70);
        } else if (class128.field2277 == 40) {
            class119.method845(90);
            if (class125.field2260 != -3) {
                if (class125.field2260 == 15) {
                    class288.method1986(15660);
                } else if (class125.field2260 != 2) {
                    class74.method598(true, 315);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2501)
    private final void method1766(int arg0) {
        for (class156.field2762 = 0; class202.method1416(32) && class156.field2762 < 128; class156.field2762++) {
            class301.field5171[class156.field2762] = class242.field4196;
            class253.field4398[class156.field2762] = class211.field3564;
        }
        field4174++;
        class249.field4327++;
        if (arg0 > -4) {
            this.method1757(10);
        }
        if (class83.field1524 != -1) {
            class199.method1396(0, class83.field1524, (byte) 98, 0, class13.field290, class58.field960, 0, 0);
        }
        class238.field4039++;
        if (class123.field2216) {
            int var2 = 19137023;
            label188: for (int var3 = 0; var3 < 32768; var3++) {
                class232 var4 = class2.field12[var3];
                if (var4 != null) {
                    byte var5 = var4.field3911.field130;
                    if ((var5 & 0x2) > 0 && var4.field1862 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field1876[0] = (var4.field1859 >> 7) + var6;
                            var4.field1898[0] = (var4.field1865 >> 7) + var7;
                            class91.field1637[class20.field364].method420(var4.method325(-12808), 62, var4.field1859 >> 7, 0, var4.method325(-12808), false, var4.field1865 >> 7);
                            if (var4.field1876[0] >= 0 && var4.field1876[0] <= (104 - var4.method325(-12808)) && var4.field1898[0] >= 0 && var4.field1898[0] <= 104 - var4.method325(-12808) && class91.field1637[class20.field364].method416(var4.field1898[0], var4.field1876[0], var4.field1859 >> 7, var4.field1865 >> 7, (byte) -70)) {
                                if (var4.method325(-12808) > 1) {
                                    for (int var8 = var4.field1876[0]; var8 < (var4.field1876[0] + var4.method325(-12808)); var8++) {
                                        for (int var9 = var4.field1898[0]; var9 < (var4.field1898[0] + var4.method325(-12808)); var9++) {
                                            if ((class91.field1637[class20.field364].field905[var8][var9] & var2) != 0) {
                                                continue label188;
                                            }
                                        }
                                    }
                                }
                                var4.field1862 = 1;
                            }
                        }
                    }
                    class206.method1436(var4, 8);
                    class91.method689((byte) 57, var4);
                    class88.method676((byte) -65, var4);
                    class91.field1637[class20.field364].method404(var4.method325(-12808), var4.field1859 >> 7, var4.method325(-12808), false, var4.field1865 >> 7, -1);
                }
            }
        }
        if (!class123.field2216) {
            class229.method1652(true);
        } else if (class131.field2333 == 0 && class99.field1792 == 0) {
            if (class238.field4054 == 2) {
                class141.method1004(-53);
            } else {
                class54.method405(-112);
            }
            if (class99.field1791 >> 7 < 14 || class99.field1791 >> 7 >= 90 || (class119.field2156 >> 7) < 14 || class119.field2156 >> 7 >= 90) {
                class288.method1990((byte) 76);
            }
        }
        while (true) {
            class11 var10;
            class60 var17;
            class60 var18;
            do {
                var10 = (class11) class102.field1837.method780((byte) -54);
                if (var10 == null) {
                    while (true) {
                        class11 var11;
                        class60 var12;
                        class60 var13;
                        do {
                            var11 = (class11) class70.field1353.method780((byte) -55);
                            if (var11 == null) {
                                while (true) {
                                    class11 var14;
                                    class60 var15;
                                    class60 var16;
                                    do {
                                        var14 = (class11) class306.field5220.method780((byte) -81);
                                        if (var14 == null) {
                                            if (class263.field4511 != null) {
                                                class118.method838(102);
                                            }
                                            if (class42.field691 != null && class42.field691.field375 == 1) {
                                                if (class42.field691.field377 != null) {
                                                    class314.method2173(class84.field1555, -7704, class124.field2249);
                                                }
                                                class84.field1555 = false;
                                                class42.field691 = null;
                                                class124.field2249 = null;
                                            }
                                            return;
                                        }
                                        var15 = var14.field212;
                                        if (var15.field1167 < 0) {
                                            break;
                                        }
                                        var16 = class125.method907(var15.field1113, -67);
                                    } while (var16 == null || var16.field1100 == null || var16.field1100.length <= var15.field1167 || var16.field1100[var15.field1167] != var15);
                                    class218.method1562((byte) 121, var14);
                                }
                            }
                            var12 = var11.field212;
                            if (var12.field1167 < 0) {
                                break;
                            }
                            var13 = class125.method907(var12.field1113, -98);
                        } while (var13 == null || var13.field1100 == null || var12.field1167 >= var13.field1100.length || var13.field1100[var12.field1167] != var12);
                        class218.method1562((byte) 91, var11);
                    }
                }
                var17 = var10.field212;
                if (var17.field1167 < 0) {
                    break;
                }
                var18 = class125.method907(var17.field1113, -113);
            } while (var18 == null || var18.field1100 == null || var17.field1167 >= var18.field1100.length || var18.field1100[var17.field1167] != var17);
            class218.method1562((byte) 100, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2713)
    public final void init() {
        field4179++;
        if (!this.method1332((byte) -8)) {
            return;
        }
        class244.field4253 = Integer.parseInt(this.getParameter("worldid"));
        class3.field33 = Integer.parseInt(this.getParameter("modewhere"));
        if (class3.field33 < 0 || class3.field33 > 1) {
            class3.field33 = 0;
        }
        class216.field3603 = Integer.parseInt(this.getParameter("modewhat"));
        if (class216.field3603 < 0 || class216.field3603 > 2) {
            class216.field3603 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class267.field4604 = true;
        } else {
            class267.field4604 = false;
        }
        try {
            class253.field4411 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class253.field4411 = 0;
        }
        class1.method2(true, class253.field4411);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class245.field4257 = true;
        } else {
            class245.field4257 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class224.field3814 = true;
        } else {
            class224.field3814 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class172.field2971 = 1;
        } else {
            class172.field2971 = 0;
        }
        try {
            class188.field3241 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class188.field3241 = 0;
        }
        class145.field2560 = class260.field4481.method505((byte) 81, this);
        if (class145.field2560 == null) {
            class145.field2560 = class188.field3240;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class151.field2695 = true;
        } else {
            class151.field2695 = false;
        }
        class134.field2370 = this;
        this.method1337(64, 514, 765, 503, class216.field3603 + 32);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBIIIILwf;)V", line = 2793)
    public static final void method1767(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class54 arg6) {
        field4165++;
        long var7 = 0L;
        if (arg1 > -62) {
            return;
        }
        boolean var9 = false;
        boolean var10 = true;
        if (arg4 == 0) {
            var7 = class313.method2167(arg0, arg2, arg3);
        } else if (arg4 == 1) {
            var7 = class145.method1035(arg0, arg2, arg3);
        } else if (arg4 == 2) {
            var7 = class141.method1000(arg0, arg2, arg3);
        } else if (arg4 == 3) {
            var7 = class244.method1775(arg0, arg2, arg3);
        }
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = ((int) var7 & 0x7F639) >> 14;
        boolean var13 = false;
        class290 var14 = class172.method1207(var11, -120);
        if (var14.method2003(false)) {
            class91.method687(-127, var14, arg0, arg2, arg3);
        }
        int var15 = ((int) var7 & 0x31B331) >> 20;
        if (var7 == 0L) {
            return;
        }
        class262 var16 = null;
        class262 var17 = null;
        if (arg4 == 0) {
            class162 var21 = class109.method792(arg0, arg2, arg3);
            if (var21 != null) {
                var17 = var21.field2842;
                var16 = var21.field2852;
            }
            if (var14.field4966 != 0) {
                arg6.method410(48, var15, var14.field5021, arg3, var12, arg2);
            }
        } else if (arg4 == 1) {
            class184 var20 = class315.method2178(arg0, arg2, arg3);
            if (var20 != null) {
                var17 = var20.field3143;
                var16 = var20.field3151;
            }
        } else if (arg4 == 2) {
            class195 var18 = class109.method794(arg0, arg2, arg3);
            if (var18 != null) {
                var16 = var18.field3330;
            }
            if (var14.field4966 != 0 && (var14.field5017 + arg2) < 104 && (var14.field5017 + arg3) < 104 && (var14.field4957 + arg2) < 104 && (var14.field4957 + arg3) < 104) {
                arg6.method420(var14.field5017, 79, arg2, var15, var14.field4957, var14.field5021, arg3);
            }
        } else if (arg4 == 3) {
            class37 var19 = class187.method1318(arg0, arg2, arg3);
            if (var19 != null) {
                var16 = var19.field599;
            }
            if (var14.field4966 == 1) {
                arg6.method414(-1, arg2, arg3);
            }
        }
        if (!class123.field2216 || !var14.field5013) {
            return;
        }
        if (var12 == 2) {
            if (var16 instanceof class216) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, var15 + 4, arg3, 2095812161, var12, arg2, 0, arg5, 0);
            }
            if (var17 instanceof class216) {
                ((class216) var17).method1515(-1);
            } else {
                class200.method1407(var14, var15 + 1 & 0x3, arg3, 2095812161, var12, arg2, 0, arg5, 0);
            }
        } else if (var12 == 5) {
            if (var16 instanceof class216) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, var15, arg3, 2095812161, 4, arg2, class229.field3881[var15] * 8, arg5, class106.field1950[var15] * 8);
            }
        } else if (var12 == 6) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, var15 + 4, arg3, 2095812161, 4, arg2, class182.field3127[var15] * 8, arg5, class29.field495[var15] * 8);
            }
        } else if (var12 == 7) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, (var15 + 2 & 0x3) + 4, arg3, 2095812161, 4, arg2, 0, arg5, 0);
            }
        } else if (var12 == 8) {
            if ((var16 instanceof class216)) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, var15 + 4, arg3, 2095812161, 4, arg2, class182.field3127[var15] * 8, arg5, class29.field495[var15] * 8);
            }
            if (var17 instanceof class216) {
                ((class216) var17).method1515(-1);
            } else {
                class200.method1407(var14, (var15 + 2 & 0x3) + 4, arg3, 2095812161, 4, arg2, class182.field3127[var15] * 8, arg5, class29.field495[var15] * 8);
            }
        } else if (var12 == 11) {
            if (var16 instanceof class216) {
                ((class216) var16).method1515(-1);
            } else {
                class200.method1407(var14, var15 + 4, arg3, 2095812161, 10, arg2, 0, arg5, 0);
            }
        } else if ((var16 instanceof class216)) {
            ((class216) var16).method1515(-1);
        } else {
            class200.method1407(var14, var15, arg3, 2095812161, var12, arg2, 0, arg5, 0);
        }
    }
}
