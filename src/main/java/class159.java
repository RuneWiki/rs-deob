import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class159 implements Runnable {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Z")
    public boolean field2650 = true;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field2651 = new Object();

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    public int[] field2669 = new int[500];

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "[I")
    public int[] field2667 = new int[500];

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public int field2668 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field2663 = 0;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field2652 = new int[500];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "[Leg;")
    public static class291[] field2661;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lce;B)V", line = 4)
    public static final void method1218(class239 arg0, byte arg1) {
        class28.field600 = arg0;
        field2656++;
        int var2 = -119 % ((40 - arg1) / 43);
        class286.field4821 = class28.field600.method1664(4, (byte) 30);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Z", line = 16)
    public static final boolean method1219(int arg0, int arg1) {
        class236.field3871 = arg0 + 1 & 0xFFFF;
        field2657++;
        if (arg1 != 0) {
            method1218((class239) null, (byte) 117);
        }
        class153.field2599 = true;
        return true;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([IB[J)V", line = 37)
    public static final void method1220(int[] arg0, byte arg1, long[] arg2) {
        if (arg1 < 80) {
            method1219(-74, -107);
        }
        class204.method1433(0, arg2, 2, arg2.length - 1, arg0);
        field2658++;
    }

    @OriginalMember(owner = "client!ba", name = "run", descriptor = "()V", line = 48)
    public final void run() {
        field2654++;
        while (this.field2650) {
            Object var1 = this.field2651;
            synchronized (this.field2651) {
                if (this.field2668 < 500) {
                    this.field2669[this.field2668] = class48.field936;
                    this.field2667[this.field2668] = class46.field893;
                    this.field2668++;
                }
            }
            class160.method1227(50L, false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 77)
    public static void method1221(int arg0) {
        field2652 = null;
        field2661 = null;
        if (arg0 != -16949) {
            method1225(-122, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 88)
    public static final void method1222(int arg0) {
        class87.field1555 = 0;
        field2659++;
        class76.field1314 = 0;
        class54.method467(true);
        int var1 = -49 / ((arg0 + 33) / 34);
        class123.method930(true);
        class270.method1872((byte) -41);
        class139.method1032(0);
        for (int var2 = 0; var2 < class76.field1314; var2++) {
            int var3 = class275.field4568[var2];
            if (class256.field4266 != class298.field4979[var3].field1509) {
                if (class298.field4979[var3].field4314 > 0) {
                    class156.method1208(115, class298.field4979[var3]);
                }
                class298.field4979[var3] = null;
            }
        }
        if (class202.field3201 != class95.field1715.field478) {
            throw new RuntimeException("gpp1 pos:" + class95.field1715.field478 + " psize:" + class202.field3201);
        }
        for (int var4 = 0; var4 < field2663; var4++) {
            if (class298.field4979[class212.field3390[var4]] == null) {
                throw new RuntimeException("gpp2 pos:" + var4 + " size:" + field2663);
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 140)
    public static final void method1223(int arg0) {
        if (class140.field2369 != null) {
            class140.field2369.method784(57);
            class140.field2369 = null;
        }
        class78.method582(82);
        class312.method2157();
        field2655++;
        for (int var1 = 0; var1 < 4; var1++) {
            class255.field4247[var1].method415(120);
        }
        class257.method1805(false, 0);
        System.gc();
        class28.method273((byte) 111, 2);
        class217.field3611 = -1;
        class101.field1775 = false;
        class25.method182(true, arg0);
        class86.field1544 = false;
        class78.field1319 = 0;
        class263.field4407 = 0;
        field2662 = 0;
        class196.field3152 = 0;
        for (int var2 = 0; var2 < class276.field4608.length; var2++) {
            class276.field4608[var2] = null;
        }
        field2663 = 0;
        class177.field2923 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class298.field4979[var3] = null;
            class151.field2526[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class91.field1656[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class51.field983[var5][var6][var7] = null;
                }
            }
        }
        class270.method1871(arg0 ^ 0x5);
        class236.field3871 = 0;
        class306.method2092((byte) -125);
        class251.method1777(-1, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 231)
    public static final void method1224(byte arg0) {
        for (int var1 = 0; var1 < class87.field1555; var1++) {
            int var2 = class301.field5048[var1];
            class42 var3 = class91.field1656[var2];
            int var4 = class95.field1715.method226(255);
            if ((var4 & 0x10) != 0) {
                var3.field1502 = class95.field1715.method197(arg0 ^ 0xFFFFFFB8);
                int var5 = class95.field1715.method203(-22066);
                var3.field1508 = (var5 & 0xFFFF) + class256.field4266;
                var3.field1479 = var5 >> 16;
                var3.field1491 = 0;
                if (var3.field1502 == 65535) {
                    var3.field1502 = -1;
                }
                var3.field1526 = 0;
                if (class256.field4266 < var3.field1508) {
                    var3.field1526 = -1;
                }
                if (var3.field1502 != -1 && class256.field4266 == var3.field1508) {
                    int var6 = class185.method1339(-454810365, var3.field1502).field4600;
                    if (var6 != -1) {
                        class300 var7 = class20.method128(83, var6);
                        if (var7 != null && var7.field5018 != null) {
                            class185.method1338(var7, var3.field1531, arg0 - 32058, false, var3.field1497, 0);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                var3.field1515 = class95.field1715.method230((byte) -58);
                var3.field1528 = class95.field1715.method197(-1);
            }
            if ((var4 & 0x80) != 0) {
                int var8 = class95.field1715.method216((byte) -123);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class95.field1715.method243(255);
                class56.method476(var8, var3, var9, arg0 - 164);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field796.method917(arg0 + 36)) {
                    class58.method483(false, var3);
                }
                var3.field796 = class246.method1740(class95.field1715.method197(-1), (byte) -32);
                var3.method658((byte) -32, var3.field796.field2089);
                var3.field1498 = var3.field796.field2077;
                var3.field1542 = var3.field796.field2101;
                var3.field1533 = var3.field796.field2078;
                var3.field1510 = var3.field796.field2069;
                var3.field1500 = var3.field796.field2107;
                var3.field1545 = var3.field796.field2103;
                var3.field1538 = var3.field796.field2067;
                var3.field1482 = var3.field796.field2090;
                if (var3.field796.method917(106)) {
                    class31.method281(class160.field2671, var3.field1532[0], var3, arg0 ^ 0xC7, var3.field1489[0], 0, (class258) null, (class27) null);
                }
            }
            if ((var4 & 0x2) != 0) {
                var3.field1537 = class95.field1715.method197(-1);
                if (var3.field1537 == 65535) {
                    var3.field1537 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var10 = class95.field1715.method190((byte) 122);
                int var11 = class95.field1715.method226(arg0 ^ 0xB8);
                var3.method662(class256.field4266, var10, -2, var11);
            }
            if ((var4 & 0x40) != 0) {
                var3.field1501 = class95.field1715.method251((byte) 77);
                var3.field1496 = 100;
            }
            if ((var4 & 0x4) != 0) {
                int var12 = class95.field1715.method190((byte) 95);
                int var13 = class95.field1715.method226(255);
                var3.method662(class256.field4266, var12, -2, var13);
                var3.field1517 = class256.field4266 + 300;
                var3.field1504 = class95.field1715.method226(arg0 ^ 0xB8);
            }
        }
        if (arg0 != 71) {
            field2664 = 111;
        }
        field2666++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I", line = 376)
    public static final int method1225(int arg0, byte arg1) {
        field2660++;
        if (arg1 != -60) {
            method1225(-121, (byte) 38);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(JI)V", line = 424)
    public static final void method1226(long arg0, int arg1) {
        field2653++;
        if (arg0 == 0L) {
            return;
        }
        if (class239.field3968 >= 100) {
            class303.method2071(class264.field4421, arg1 + 18, 0, class71.field1269);
            return;
        }
        class40 var3 = class199.method1401(arg0, 1).method372((byte) -107);
        for (int var4 = 0; var4 < class239.field3968; var4++) {
            if (class282.field4751[var4] == arg0) {
                class303.method2071(class264.field4421, 120, 0, class153.method1192(new class40[] { var3, class236.field3884 }, (byte) -86));
                return;
            }
        }
        for (int var5 = arg1; var5 < class233.field3844; var5++) {
            if (class2.field20[var5] == arg0) {
                class303.method2071(class264.field4421, arg1 ^ 0xC, 0, class153.method1192(new class40[] { class142.field2384, var3, class180.field2941 }, (byte) 127));
                return;
            }
        }
        if (var3.method345(class255.field4233.field4319, false)) {
            class303.method2071(class264.field4421, arg1 + 116, 0, class300.field5010);
            return;
        }
        class282.field4751[class239.field3968] = arg0;
        class268.field4460++;
        class28.field606[class239.field3968++] = class199.method1401(arg0, class88.method686(arg1, 1));
        class166.field2754 = class60.field1152;
        class19.field295.method1464(241, 0);
        class19.field295.method241(arg0, arg1 ^ 0x7F);
    }
}
