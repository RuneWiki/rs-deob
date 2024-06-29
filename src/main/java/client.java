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
public class client extends class94 {

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lqk;")
    public static class207 field2683 = class24.method212(255, "Poser");

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2692 = 500;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "[I")
    public static int[] field2676 = new int[14];

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Z")
    public static boolean field2694 = true;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2691 = -1;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "Lqk;")
    public static class207 field2688 = class24.method212(255, "<col=ff3000>");

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lpb;")
    public static class126 field2695;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lpk;")
    public static class99 field2681;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "[Lbl;")
    public static class33[] field2680;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method675(int arg0) {
        class14.method84(124);
        field2675++;
        class27.field548 = new class284();
        class101.field1822 = new class147();
        if (class225.field4107 != 0) {
            class10.field144 = new byte[50][];
        }
        class74.method540(54, class20.field326);
        if (class164.field2903 == 0) {
            class275.field4809 = this.getCodeBase().getHost();
            class227.field4160 = 43594;
            class1.field11 = 443;
        } else if (class164.field2903 == 1) {
            class275.field4809 = this.getCodeBase().getHost();
            class227.field4160 = class187.field3295 + 40000;
            class1.field11 = class187.field3295 + 50000;
        } else if (class164.field2903 == 2) {
            class1.field11 = class187.field3295 + 50000;
            class227.field4160 = class187.field3295 + 40000;
            class275.field4809 = "127.0.0.1";
        }
        class147.field2527 = class1.field11;
        if (class171.field3035 == 1) {
            class161.field2855 = class93.field1646;
            class51.field997 = true;
            class106.field1887 = class8.field108;
            class81.field1477 = class260.field4641;
            class98.field1739 = class177.field3192;
        } else {
            class81.field1477 = class163.field2880;
            class106.field1887 = class128.field2238;
            class161.field2855 = class189.field3333;
            class98.field1739 = class278.field4883;
        }
        class279.field4890 = class227.field4160;
        if (class229.field4193 == 3 && class164.field2903 != 2) {
            class173.field3089 = class187.field3295;
        }
        class89.field1607 = class275.field4809;
        class223.field4076 = class279.field4890;
        class207.field3679 = class227.field4164 = class241.field4397 = class237.field4365 = new short[256];
        if (arg0 != 1000) {
            this.method1115(-4);
        }
        class6.field93 = class227.field4160;
        class57.method423((byte) -127);
        class286.method1946(class112.field1949, true);
        class30.method235(class112.field1949, -218);
        class213.field3776 = class51.method393(-1);
        if (class213.field3776 != null) {
            class213.field3776.method1695(class112.field1949, (byte) 107);
        }
        class278.field4877 = class229.field4193;
        try {
            if (class20.field326.field4202 != null) {
                class177.field3185 = new class124(class20.field326.field4202, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class22.field357[var2] = new class124(class20.field326.field4191[var2], 6000, 0);
                }
                class236.field4353 = new class124(class20.field326.field4197, 6000, 0);
                class115.field1992 = new class81(255, class177.field3185, class236.field4353, 500000);
                class261.field4649 = new class124(class20.field326.field4192, 24, 0);
                class20.field326.field4192 = null;
                class20.field326.field4191 = null;
                class20.field326.field4197 = null;
                class20.field326.field4202 = null;
            }
        } catch (IOException var3) {
            class261.field4649 = null;
            class115.field1992 = null;
            class177.field3185 = null;
            class236.field4353 = null;
        }
        if (class164.field2903 != 0) {
            class31.field633 = true;
        }
        class44.field868 = class18.field298;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    private final void method1107(byte arg0) {
        field2677++;
        if (arg0 != 14) {
            return;
        }
        if (class30.field618 < class101.field1822.field2544) {
            class43.field857 = (class101.field1822.field2544 * 50 - 50) * 5;
            if (class43.field857 > 3000) {
                class43.field857 = 3000;
            }
            if (class6.field93 == class223.field4076) {
                class223.field4076 = class147.field2527;
            } else {
                class223.field4076 = class6.field93;
            }
            if (class101.field1822.field2544 >= 2 && class101.field1822.field2545 == 6) {
                this.method671(arg0 - 14, "js5connect_outofdate");
                class250.field4524 = 1000;
                return;
            }
            if (class101.field1822.field2544 >= 4 && class101.field1822.field2545 == -1) {
                this.method671(0, "js5crc");
                class250.field4524 = 1000;
                return;
            }
            if (class101.field1822.field2544 >= 4 && (class250.field4524 == 0 || class250.field4524 == 5)) {
                if (class101.field1822.field2545 == 7 || class101.field1822.field2545 == 9) {
                    this.method671(arg0 - 14, "js5connect_full");
                } else if (class101.field1822.field2545 <= 0) {
                    this.method671(0, "js5io");
                } else {
                    this.method671(0, "js5connect");
                }
                class250.field4524 = 1000;
                return;
            }
        }
        class30.field618 = class101.field1822.field2544;
        if (class43.field857 > 0) {
            class43.field857--;
            return;
        }
        try {
            if (class56.field1042 == 0) {
                class75.field1384 = class20.field326.method1635(0, class223.field4076, class89.field1607);
                class56.field1042++;
            }
            if (class56.field1042 == 1) {
                if (class75.field1384.field1696 == 2) {
                    this.method1113((byte) 88, 1000);
                    return;
                }
                if (class75.field1384.field1696 == 1) {
                    class56.field1042++;
                }
            }
            if (class56.field1042 == 2) {
                class155.field2729 = new class127((Socket) class75.field1384.field1699, class20.field326);
                class149 var2 = new class149(5);
                var2.method1041(true, 15);
                var2.method1068(529, 124);
                class155.field2729.method894(0, var2.field2568, 5, -102);
                class56.field1042++;
                class176.field3181 = class53.method405(20);
            }
            if (class56.field1042 == 3) {
                if (class250.field4524 == 0 || class250.field4524 == 5 || class155.field2729.method891(1) > 0) {
                    int var3 = class155.field2729.method897(30000);
                    if (var3 != 0) {
                        this.method1113((byte) -103, var3);
                        return;
                    }
                    class56.field1042++;
                } else if (class53.method405(39) - class176.field3181 > 30000L) {
                    this.method1113((byte) -117, 1001);
                    return;
                }
            }
            if (class56.field1042 == 4) {
                boolean var4 = class250.field4524 == 5 || class250.field4524 == 10 || class250.field4524 == 28;
                class101.field1822.method1027(0, class155.field2729, !var4);
                class75.field1384 = null;
                class56.field1042 = 0;
                class155.field2729 = null;
            }
        } catch (IOException var5) {
            this.method1113((byte) 111, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    private final void method1108(boolean arg0) {
        class113.field1975 = 0;
        if (arg0) {
            field2680 = null;
        }
        while (class117.method822(0) && class113.field1975 < 128) {
            class107.field1909[class113.field1975] = class252.field4537;
            class131.field2274[class113.field1975] = class128.field2234;
            class113.field1975++;
        }
        class20.field325++;
        field2679++;
        if (class165.field2915 != -1) {
            class133.method937(class244.field4428, class165.field2915, 0, 0, 0, class31.field625, 0, -114);
        }
        class193.field3395++;
        class128.method899(-89);
        while (true) {
            class206 var2;
            class220 var3;
            class220 var4;
            do {
                var2 = (class206) class16.field251.method927(false);
                if (var2 == null) {
                    while (true) {
                        class206 var5;
                        class220 var6;
                        class220 var7;
                        do {
                            var5 = (class206) class83.field1526.method927(arg0);
                            if (var5 == null) {
                                while (true) {
                                    class206 var8;
                                    class220 var9;
                                    class220 var10;
                                    do {
                                        var8 = (class206) class129.field2251.method927(false);
                                        if (var8 == null) {
                                            if (class33.field659 != null) {
                                                class265.method1823(-58);
                                            }
                                            if (class185.field3284 != null && class185.field3284.field1696 == 1) {
                                                if (class185.field3284.field1699 != null) {
                                                    class190.method1326(class31.field624, class161.field2852, arg0);
                                                }
                                                class161.field2852 = null;
                                                class31.field624 = false;
                                                class185.field3284 = null;
                                            }
                                            if ((class160.field2844 % 1500) == 0) {
                                                class150.method1089((byte) -83);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field3614;
                                        if (var9.field3893 < 0) {
                                            break;
                                        }
                                        var10 = class233.method1667(var9.field4045, 68);
                                    } while (var10 == null || var10.field3959 == null || var9.field3893 >= var10.field3959.length || var10.field3959[var9.field3893] != var9);
                                    class69.method501(-103, var8);
                                }
                            }
                            var6 = var5.field3614;
                            if (var6.field3893 < 0) {
                                break;
                            }
                            var7 = class233.method1667(var6.field4045, 68);
                        } while (var7 == null || var7.field3959 == null || var7.field3959.length <= var6.field3893 || var7.field3959[var6.field3893] != var6);
                        class69.method501(103, var5);
                    }
                }
                var3 = var2.field3614;
                if (var3.field3893 < 0) {
                    break;
                }
                var4 = class233.method1667(var3.field4045, 114);
            } while (var4 == null || var4.field3959 == null || var3.field3893 >= var4.field3959.length || var4.field3959[var3.field3893] != var3);
            class69.method501(116, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method670(boolean arg0) {
        field2685++;
        if (class45.field887 != null) {
            class45.field887.field2934 = false;
        }
        class45.field887 = null;
        if (class98.field1738 != null) {
            class98.field1738.method888(arg0);
            class98.field1738 = null;
        }
        class55.method415(class112.field1949, true);
        class244.method1721(0, class112.field1949);
        if (class213.field3776 != null) {
            class213.field3776.method1694(4, class112.field1949);
        }
        class129.method904((byte) 124);
        class46.method356(-28798);
        class213.field3776 = null;
        if (class34.field677 != null) {
            class34.field677.method442(73);
        }
        if (class200.field3532 != null) {
            class200.field3532.method442(100);
        }
        class101.field1822.method1014(arg0);
        class27.field548.method1929(-98);
        try {
            if (class177.field3185 != null) {
                class177.field3185.method878(-108);
            }
            if (class22.field357 != null) {
                for (int var2 = 0; var2 < class22.field357.length; var2++) {
                    if (class22.field357[var2] != null) {
                        class22.field357[var2].method878(-128);
                    }
                }
            }
            if (!arg0) {
                field2680 = null;
            }
            if (class236.field4353 != null) {
                class236.field4353.method878(-91);
            }
            if (class261.field4649 != null) {
                class261.field4649.method878(-67);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method1109(int arg0) {
        field2683 = null;
        field2676 = null;
        field2681 = null;
        if (arg0 == 12353) {
            field2695 = null;
            field2688 = null;
            field2680 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lmd;)Lmd;")
    public static final class220 method1110(class220 arg0) {
        int var1 = method1112(arg0).method835(-83);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class233.method1667(arg0.field4045, 86);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BZ)V")
    public static final void method1111(byte arg0, boolean arg1) {
        if (class202.field3565.field5104 >> 7 == class117.field2015 && class202.field3565.field5072 >> 7 == class233.field4282) {
            class117.field2015 = 0;
        }
        field2682++;
        int var2 = class31.field629;
        if (arg1) {
            var2 = 1;
        }
        if (arg0 > -91) {
            main((String[]) null);
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class14 var20;
            if (arg1) {
                var20 = class202.field3565;
            } else {
                var20 = class169.field2953[class10.field149[var3]];
            }
            if (var20 != null && var20.method90((byte) 108)) {
                int var21 = var20.method83(true);
                if (var21 == 1) {
                    if ((var20.field5104 & 0x7F) == 64 && (var20.field5072 & 0x7F) == 64) {
                        int var28 = var20.field5104 >> 7;
                        int var29 = var20.field5072 >> 7;
                        if (var28 >= 0 && var28 < 104 && var29 >= 0 && var29 < 104) {
                            var10002 = class125.field2175[var28][var29]++;
                        }
                    }
                } else if (((var21 & 0x1) != 0 || (var20.field5104 & 0x7F) == 0 && (var20.field5072 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field5104 & 0x7F) == 64 && (var20.field5072 & 0x7F) == 64)) {
                    int var22 = var20.field5072 - (var21 * 64) >> 7;
                    int var23 = var20.field5104 - (var21 * 64) >> 7;
                    int var24 = var20.method83(true) + var23;
                    if (var24 > 104) {
                        var24 = 104;
                    }
                    int var25 = var20.method83(true) + var22;
                    if (var25 > 104) {
                        var25 = 104;
                    }
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    for (int var26 = var23; var26 < var24; var26++) {
                        for (int var27 = var22; var27 < var25; var27++) {
                            var10002 = class125.field2175[var26][var27]++;
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            class14 var5;
            long var6;
            if (arg1) {
                var5 = class202.field3565;
                var6 = 8791798054912L;
            } else {
                var5 = class169.field2953[class10.field149[var4]];
                var6 = (long) class10.field149[var4] << 32;
            }
            if (var5 != null && var5.method90((byte) 4)) {
                var5.field202 = false;
                if ((class10.field139 && class31.field629 > 200 || class31.field629 > 50) && !arg1 && var5.field5039 == var5.method1947(9).field3539) {
                    var5.field202 = true;
                }
                int var8 = var5.method83(true);
                if (var8 == 1) {
                    if ((var5.field5104 & 0x7F) == 64 && (var5.field5072 & 0x7F) == 64) {
                        int var9 = var5.field5104 >> 7;
                        int var10 = var5.field5072 >> 7;
                        if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                            continue;
                        }
                        if (class125.field2175[var9][var10] > 1) {
                            var10002 = class125.field2175[var9][var10]--;
                            continue;
                        }
                    }
                } else if ((var8 & 0x1) == 0 && (var5.field5104 & 0x7F) == 0 && (var5.field5072 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field5104 & 0x7F) == 64 && (var5.field5072 & 0x7F) == 0) {
                    int var11 = var5.field5104 - (var8 * 64) >> 7;
                    boolean var12 = true;
                    int var13 = var5.field5072 - var8 * 64 >> 7;
                    int var14 = var8 + var13;
                    if (var13 < 0) {
                        var13 = 0;
                    }
                    int var15 = var8 + var11;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var15 > 104) {
                        var15 = 104;
                    }
                    if (var14 > 104) {
                        var14 = 104;
                    }
                    for (int var16 = var11; var16 < var15; var16++) {
                        for (int var19 = var13; var19 < var14; var19++) {
                            if (class125.field2175[var16][var19] <= 1) {
                                var12 = false;
                                break;
                            }
                        }
                    }
                    if (var12) {
                        int var17 = var11;
                        while (true) {
                            if (var15 <= var17) {
                                continue label216;
                            }
                            for (int var18 = var13; var18 < var14; var18++) {
                                var10002 = class125.field2175[var17][var18]--;
                            }
                            var17++;
                        }
                    }
                }
                if (var5.field5068 == null || class160.field2844 < var5.field5021 || var5.field5010 <= class160.field2844) {
                    var5.field5053 = class22.method139(var5.field5104, var5.field5072, 23979, class93.field1645);
                    class265.method1821(class93.field1645, var5.field5104, var5.field5072, var5.field5053, var8 * 64 + 60 - 64, var5, var5.field5062, var6, var5.field5037);
                } else {
                    var5.field202 = false;
                    var5.field5053 = class22.method139(var5.field5104, var5.field5072, 23979, class93.field1645);
                    class137.method949(class93.field1645, var5.field5104, var5.field5072, var5.field5053, var5, var5.field5062, var6, var5.field5013, var5.field5057, var5.field5051, var5.field5102);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method669(byte arg0) {
        field2690++;
        if (class250.field4524 == 1000) {
            return;
        }
        class160.field2844++;
        if (arg0 != 6) {
            return;
        }
        if (class160.field2844 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class163.field2882 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class127.field2212.setSeed((long) class163.field2882);
        }
        this.method1115(10);
        if (class47.field929 != null) {
            class47.field929.method625(true);
        }
        class199.method1389(true);
        class21.method129((byte) 8);
        class269.method1838((byte) 67);
        class147.method1015(false);
        if (class213.field3776 != null) {
            int var3 = class213.field3776.method1693(false);
            class249.field4514 = var3;
        }
        if (class250.field4524 == 0) {
            this.method1114(arg0 ^ 0x53);
            class163.method1183(-33);
        } else if (class250.field4524 == 5) {
            this.method1114(85);
            class163.method1183(-33);
        } else if (class250.field4524 == 25 || class250.field4524 == 28) {
            class278.method1890(126);
        }
        if (class250.field4524 == 10) {
            this.method1108(false);
            class206.method1421(-118);
            class15.method96(6);
            class153.method1100(100);
        } else if (class250.field4524 == 30) {
            class68.method490((byte) 85);
        } else if (class250.field4524 == 40) {
            class153.method1100(arg0 ^ 0x56);
            if (class92.field1640 != -3) {
                if (class92.field1640 == 15) {
                    class15.method95((byte) 61);
                } else if (class92.field1640 != 2) {
                    class97.method687(arg0 ^ 0xFFFFA84F);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lmd;)Lhh;")
    public static final class117 method1112(class220 arg0) {
        class117 var1 = (class117) class282.field4962.method1867(((long) arg0.field3933 << 32) + (long) arg0.field3893, true);
        return var1 == null ? arg0.field4053 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2693++;
        try {
            if (arg0.length != 4) {
                class272.method1851(27825, "argument count");
            }
            class187.field3295 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class164.field2903 = 2;
            if (arg0[1].equals("live")) {
                class225.field4107 = 0;
            } else if (arg0[1].equals("rc")) {
                class225.field4107 = 1;
            } else if (arg0[1].equals("wip")) {
                class225.field4107 = 2;
            } else {
                class272.method1851(27825, "modewhat");
            }
            class213.field3774 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class134.method939(0, class140.method971(var2.length, 0, 2, var2));
            } catch (Exception var5) {
            }
            if (var1 != -1) {
                class272.field4795 = var1;
            } else if (arg0[2].equals("english")) {
                class272.field4795 = 0;
            } else if (arg0[2].equals("german")) {
                class272.field4795 = 1;
            } else {
                class272.method1851(27825, "language");
            }
            class287.method1962(class272.field4795, -3);
            class97.field1714 = false;
            class24.field460 = false;
            if (arg0[3].equals("game0")) {
                class171.field3035 = 0;
            } else if (arg0[3].equals("game1")) {
                class171.field3035 = 1;
            } else {
                class272.method1851(27825, "game");
            }
            class121.field2093 = class100.field1800;
            class192.field3389 = false;
            class204.field3595 = 0;
            class156.field2737 = 0;
            client var3 = new client();
            class136.field2347 = var3;
            var3.method680(false, "runescape", 529, (byte) 114, 768, 1024, class225.field4107 + 32, 28);
            class272.field4794.setLocation(40, 40);
        } catch (Exception var6) {
            class202.method1402((String) null, 32701, var6);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V")
    private final void method1113(byte arg0, int arg1) {
        class101.field1822.field2544++;
        class155.field2729 = null;
        class75.field1384 = null;
        field2697++;
        class56.field1042 = 0;
        class101.field1822.field2545 = arg1;
        int var3 = 43 / ((-arg0 - 7) / 56);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method1114(int arg0) {
        if (!class135.field2336) {
            label233: while (true) {
                do {
                    if (!class117.method822(0)) {
                        break label233;
                    }
                } while (class128.field2234 != 115 && class128.field2234 != 83);
                class135.field2336 = true;
            }
        }
        field2687++;
        if (class19.field314 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class53.method405(77);
            if (class200.field3542 == 0L) {
                class200.field3542 = var4;
            }
            if (var3 > 16384 && (var4 - class200.field3542) < 5000L) {
                if ((var4 - class147.field2537) > 1000L) {
                    System.gc();
                    class147.field2537 = var4;
                }
                class153.field2663 = 5;
                class169.field2981 = class170.field3027;
            } else {
                class169.field2981 = class214.field3787;
                class153.field2663 = 5;
                class19.field314 = 10;
            }
        } else if (class19.field314 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class133.field2303[var6] = new class155(104, 104);
            }
            class169.field2981 = class134.field2320;
            class153.field2663 = 10;
            class19.field314 = 30;
        } else if (class19.field314 == 30) {
            if (class47.field929 == null) {
                class47.field929 = new class85(class101.field1822, class27.field548);
            }
            if (class47.field929.method630(true)) {
                class131.field2266 = class78.method592(false, 0, true, -17265, true);
                class98.field1725 = class78.method592(false, 1, true, -17265, true);
                class155.field2724 = class78.method592(true, 2, true, -17265, false);
                class287.field5128 = class78.method592(false, 3, true, -17265, true);
                class153.field2656 = class78.method592(false, 4, true, -17265, true);
                class13.field191 = class78.method592(true, 5, true, -17265, true);
                class56.field1050 = class78.method592(true, 6, false, -17265, true);
                class85.field1549 = class78.method592(false, 7, true, arg0 - 17350, true);
                class101.field1832 = class78.method592(false, 8, true, -17265, true);
                class34.field671 = class78.method592(false, 9, true, -17265, true);
                class183.field3256 = class78.method592(false, 10, true, -17265, true);
                class88.field1594 = class78.method592(false, 11, true, -17265, true);
                class287.field5124 = class78.method592(false, 12, true, arg0 - 17350, true);
                class151.field2647 = class78.method592(false, 13, true, -17265, true);
                class277.field4865 = class78.method592(false, 14, false, -17265, true);
                class206.field3605 = class78.method592(false, 15, true, -17265, true);
                class113.field1971 = class78.method592(false, 16, true, -17265, true);
                class99.field1773 = class78.method592(false, 17, true, -17265, true);
                class183.field3267 = class78.method592(false, 18, true, -17265, true);
                class176.field3184 = class78.method592(false, 19, true, arg0 ^ 0xFFFFBCDA, true);
                class16.field254 = class78.method592(false, 20, true, -17265, true);
                class207.field3662 = class78.method592(false, 21, true, -17265, true);
                class221.field4067 = class78.method592(false, 22, true, -17265, true);
                class241.field4401 = class78.method592(true, 23, true, -17265, true);
                class10.field140 = class78.method592(false, 24, true, -17265, true);
                field2681 = class78.method592(false, 25, true, -17265, true);
                class165.field2910 = class78.method592(true, 26, true, -17265, true);
                class179.field3224 = class78.method592(false, 27, true, -17265, true);
                class153.field2663 = 15;
                class169.field2981 = class165.field2919;
                class19.field314 = 40;
            } else {
                class169.field2981 = class2.field41;
                class153.field2663 = 12;
            }
        } else if (class19.field314 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 28; var8++) {
                var7 += class247.field4478[var8].method1209((byte) -94) * class262.field4668[var8] / 100;
            }
            if (var7 == 100) {
                class153.field2663 = 20;
                class169.field2981 = class200.field3513;
                class52.method401(class101.field1832, 111);
                class193.method1339(10, class101.field1832);
                class200.method1396(-1, class101.field1832);
                class19.field314 = 45;
            } else {
                if (var7 != 0) {
                    class169.field2981 = class105.method757(false, new class207[] { class189.field3339, class262.method1815(var7, (byte) -122), class87.field1584 });
                }
                class153.field2663 = 20;
            }
        } else if (class19.field314 == 45) {
            class177.method1262(false, 2, 22050, class190.field3348);
            class189.field3337 = new class24();
            class189.field3337.method194(9, 128, arg0 - 213);
            class34.field677 = class30.method238(107, 22050, 0, class20.field326, class112.field1949);
            class34.field677.method452(arg0 ^ 0x785, class189.field3337);
            class140.method977(class189.field3337, class206.field3605, class277.field4865, (byte) 113, class153.field2656);
            class200.field3532 = class30.method238(98, 2048, 1, class20.field326, class112.field1949);
            class65.field1177 = new class91();
            class200.field3532.method452(2000, class65.field1177);
            class106.field1888 = new class204(22050, class275.field4822);
            class71.field1266 = class56.field1050.method711(107, class194.field3418);
            class19.field314 = 50;
            class153.field2663 = 30;
            class169.field2981 = class279.field4903;
        } else if (class19.field314 == 50) {
            int var9 = class196.method1364(class101.field1832, class151.field2647, arg0 - 204);
            int var10 = class112.method798(13675);
            if (var10 > var9) {
                class169.field2981 = class105.method757(false, new class207[] { class105.field1857, class262.method1815(var9 * 100 / var10, (byte) -109), class87.field1584 });
                class153.field2663 = 35;
            } else {
                class19.field314 = 60;
                class153.field2663 = 35;
                class169.field2981 = class192.field3385;
            }
        } else if (class19.field314 == 60) {
            int var11 = class159.method1156(class101.field1832, -1);
            int var12 = class178.method1272(125);
            if (var12 > var11) {
                class169.field2981 = class105.method757(false, new class207[] { class175.field3175, class262.method1815(var11 * 100 / var12, (byte) -103), class87.field1584 });
                class153.field2663 = 40;
            } else {
                class169.field2981 = class9.field133;
                class19.field314 = 65;
                class153.field2663 = 40;
            }
        } else if (class19.field314 == 65) {
            class143.method988(class101.field1832, arg0 ^ 0x38, class151.field2647);
            class169.field2981 = class202.field3560;
            class153.field2663 = 45;
            class193.method1345(10, 5);
            class19.field314 = 70;
        } else if (class19.field314 == 70) {
            class155.field2724.method730((byte) -38);
            byte var13 = 0;
            int var14 = var13 + class155.field2724.method700(0);
            class113.field1971.method730((byte) -110);
            int var15 = var14 + class113.field1971.method700(0);
            class99.field1773.method730((byte) -66);
            int var16 = var15 + class99.field1773.method700(0);
            class183.field3267.method730((byte) -112);
            int var17 = var16 + class183.field3267.method700(0);
            class176.field3184.method730((byte) -17);
            int var18 = var17 + class176.field3184.method700(0);
            class16.field254.method730((byte) -68);
            int var19 = var18 + class16.field254.method700(0);
            class207.field3662.method730((byte) -67);
            int var20 = var19 + class207.field3662.method700(0);
            class221.field4067.method730((byte) -122);
            int var21 = var20 + class221.field4067.method700(0);
            class10.field140.method730((byte) 127);
            int var22 = var21 + class10.field140.method700(0);
            field2681.method730((byte) -95);
            int var23 = var22 + field2681.method700(0);
            class179.field3224.method730((byte) 116);
            int var24 = var23 + class179.field3224.method700(0);
            if (var24 < 1100) {
                class169.field2981 = class105.method757(false, new class207[] { class11.field153, class262.method1815(var24 / 11, (byte) -128), class87.field1584 });
                class153.field2663 = 50;
            } else {
                class118.method846(class155.field2724, -2);
                class125.method881((byte) 110, class155.field2724);
                class287.method1957(class155.field2724, 120);
                class150.method1088(class85.field1549, -24843, class155.field2724);
                class98.method695(true, class85.field1549, class113.field1971, 91);
                class5.method35(class183.field3267, class85.field1549, (byte) 63);
                class167.method1205(class85.field1549, class176.field3184, true, (byte) 33, class284.field4983);
                class108.method784(0, class155.field2724);
                class67.method486(class98.field1725, class16.field254, -11561, class131.field2266);
                class164.method1190(-11147, class155.field2724);
                class85.method626(class85.field1549, 95, class207.field3662);
                class5.method33((byte) 91, class221.field4067);
                class273.method1852(16, class155.field2724);
                class248.method1743(class287.field5128, class85.field1549, class101.field1832, class151.field2647, arg0 ^ 0x2D);
                class70.method505((byte) -85, class155.field2724);
                class10.method57(class99.field1773, true);
                class246.method1729(class10.field140, -88, field2681, new class189());
                class99.method726(class10.field140, field2681, (byte) 49);
                class204.method1409(class155.field2724, 64);
                class187.method1309(class101.field1832, -110, class155.field2724);
                class234.method1675(class155.field2724, arg0 - 16380, class101.field1832);
                class169.field2981 = class81.field1466;
                class153.field2663 = 50;
                class277.method1882(true);
                class19.field314 = 80;
            }
        } else if (class19.field314 == 80) {
            int var25 = class8.method48(class101.field1832, 0);
            int var26 = class244.method1717(15);
            if (var25 < var26) {
                class169.field2981 = class105.method757(false, new class207[] { class164.field2891, class262.method1815(var25 * 100 / var26, (byte) 6), class87.field1584 });
                class153.field2663 = 60;
            } else {
                class224.method1583(class101.field1832, true);
                class19.field314 = 90;
                class153.field2663 = 60;
                class169.field2981 = class255.field4572;
            }
        } else if (class19.field314 == 90) {
            if (class165.field2910.method730((byte) -6)) {
                class45 var27 = new class45(class34.field671, class165.field2910, class101.field1832, 20, !class247.field4476);
                class257.method1789(var27);
                if (class116.field2013 == 1) {
                    class257.method1781(0.9F);
                }
                if (class116.field2013 == 2) {
                    class257.method1781(0.8F);
                }
                if (class116.field2013 == 3) {
                    class257.method1781(0.7F);
                }
                if (class116.field2013 == 4) {
                    class257.method1781(0.6F);
                }
                class153.field2663 = 70;
                class169.field2981 = class276.field4840;
                class19.field314 = 100;
            } else {
                class169.field2981 = class105.method757(false, new class207[] { class213.field3783, class262.method1815(class165.field2910.method700(0), (byte) 30), class87.field1584 });
                class153.field2663 = 70;
            }
        } else if (class19.field314 == 100) {
            if (class43.method324(class101.field1832, 2287)) {
                class19.field314 = 110;
            }
        } else if (class19.field314 == 110) {
            class45.field887 = new class167();
            class20.field326.method1636(false, 10, class45.field887);
            class19.field314 = 120;
            class169.field2981 = class93.field1648;
            class153.field2663 = 75;
        } else if (class19.field314 == 120) {
            if (class183.field3256.method707(class144.field2480, class100.field1800, (byte) -48)) {
                class280 var28 = new class280(class183.field3256.method706(class100.field1800, class144.field2480, 121));
                class213.method1516(true, var28);
                class169.field2981 = class59.field1081;
                class19.field314 = 130;
                class153.field2663 = 80;
            } else {
                class169.field2981 = class105.method757(false, new class207[] { class281.field4934, class71.field1264 });
                class153.field2663 = 80;
            }
        } else if (class19.field314 == 130) {
            if (!class287.field5128.method730((byte) 118)) {
                class169.field2981 = class105.method757(false, new class207[] { class200.field3521, class262.method1815(class287.field5128.method700(0) * 3 / 4, (byte) -101), class87.field1584 });
                class153.field2663 = 85;
            } else if (!class287.field5124.method730((byte) 123)) {
                class169.field2981 = class105.method757(false, new class207[] { class200.field3521, class262.method1815(class287.field5124.method700(0) / 10 + 75, (byte) 81), class87.field1584 });
                class153.field2663 = 85;
            } else if (!class151.field2647.method730((byte) -43)) {
                class169.field2981 = class105.method757(false, new class207[] { class200.field3521, class262.method1815((class151.field2647.method700(arg0 - 85) / 20) + 85, (byte) 119), class87.field1584 });
                class153.field2663 = 85;
            } else if (class241.field4401.method704(class262.field4669, (byte) -50)) {
                class129.method902(class241.field4401, class247.field4484, 0);
                class19.field314 = 135;
                class153.field2663 = 95;
                class169.field2981 = class279.field4899;
            } else {
                class169.field2981 = class105.method757(false, new class207[] { class200.field3521, class262.method1815(class241.field4401.method717(true, class262.field4669) / 10 + 90, (byte) -108), class87.field1584 });
                class153.field2663 = 85;
            }
        } else if (class19.field314 == 135) {
            int var29 = class216.method1545((byte) -90);
            if (var29 == -1) {
                class169.field2981 = class188.field3327;
                class153.field2663 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method671(arg0 ^ 0x55, "worldlistfull");
                class193.method1345(10, 1000);
            } else if (class1.field15) {
                class169.field2981 = class162.field2864;
                class19.field314 = 140;
                class153.field2663 = 96;
            } else {
                this.method671(0, "worldlistio_" + var29);
                class193.method1345(10, 1000);
            }
        } else {
            if (arg0 != 85) {
                field2694 = false;
            }
            if (class19.field314 == 140) {
                class180.field3235 = class287.field5128.method711(102, class81.field1472);
                class13.field191.method710(true, false, (byte) -26);
                class56.field1050.method710(true, true, (byte) -26);
                class101.field1832.method710(true, true, (byte) -26);
                class151.field2647.method710(true, true, (byte) -26);
                class183.field3256.method710(true, true, (byte) -26);
                class287.field5128.method710(true, true, (byte) -26);
                class169.field2981 = class141.field2440;
                class189.field3338 = true;
                class153.field2663 = 97;
                class19.field314 = 150;
            } else if (class19.field314 == 150) {
                if (class135.field2336) {
                    class231.field4235 = 0;
                    class47.field938 = 0;
                    class65.field1182 = 0;
                    class156.field2743 = 0;
                }
                class135.field2336 = true;
                class254.method1769(arg0 + 170, class20.field326);
                class185.method1296(-1, -1, class156.field2743, false, -16498);
                class153.field2663 = 100;
                class169.field2981 = class207.field3688;
                class19.field314 = 160;
            } else if (class19.field314 == 160) {
                class87.method640(false, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method678(boolean arg0) {
        field2686++;
        if (class250.field4524 == 1000) {
            return;
        }
        boolean var2 = class228.method1626(22050);
        if (var2 && class223.field4081 && class34.field677 != null) {
            class34.field677.method443(true);
        }
        if ((class250.field4524 == 30 || class250.field4524 == 10) && (class227.field4166 || class69.field1235 != 0L && class69.field1235 < class53.method405(24))) {
            class185.method1296(class40.field806, class13.field196, class262.method1813(7), class227.field4166, -16498);
        }
        if (class126.field2189 == null) {
            Container var3;
            if (class126.field2189 != null) {
                var3 = class126.field2189;
            } else if (class272.field4794 == null) {
                var3 = class20.field326.field4207;
            } else {
                var3 = class272.field4794;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class272.field4794 == var3) {
                Insets var6 = class272.field4794.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class182.field3246 != var4 || class215.field3821 != var5) {
                if (class229.field4205.startsWith("mac")) {
                    class182.field3246 = var4;
                    class215.field3821 = var5;
                } else {
                    class14.method84(124);
                }
                class69.field1235 = class53.method405(39) + 500L;
            }
        }
        boolean var7 = arg0;
        if (class57.field1053) {
            class57.field1053 = false;
            var7 = true;
        }
        if (var7) {
            class106.method764((byte) 72);
        }
        if (class250.field4524 == 0) {
            class225.method1588(class153.field2663, 120, (Color) null, var7, class169.field2981);
        } else if (class250.field4524 == 5) {
            class223.method1581(false, false, class284.field4996);
        } else if (class250.field4524 == 10) {
            class247.method1737(-121);
        } else if (class250.field4524 == 25 || class250.field4524 == 28) {
            if (class275.field4821 == 1) {
                if (class26.field543 < class59.field1085) {
                    class26.field543 = class59.field1085;
                }
                int var8 = (class26.field543 - class59.field1085) * 50 / class26.field543;
                class284.method1926(class105.method757(false, new class207[] { class285.field4999, class55.field1038, class262.method1815(var8, (byte) -105), class159.field2808 }), (byte) 11, false);
            } else if (class275.field4821 == 2) {
                if (class260.field4633 > class125.field2171) {
                    class125.field2171 = class260.field4633;
                }
                int var9 = (class125.field2171 - class260.field4633) * 50 / class125.field2171 + 50;
                class284.method1926(class105.method757(arg0, new class207[] { class285.field4999, class55.field1038, class262.method1815(var9, (byte) 11), class159.field2808 }), (byte) 6, false);
            } else {
                class284.method1926(class285.field4999, (byte) 70, false);
            }
        } else if (class250.field4524 == 30) {
            class93.method665((byte) 97);
        } else if (class250.field4524 == 40) {
            class284.method1926(class105.method757(false, new class207[] { class262.field4666, class17.field264, class13.field189 }), (byte) 74, false);
        }
        if ((class250.field4524 == 30 || class250.field4524 == 10) && class199.field3484 == 0 && !var7) {
            try {
                Graphics var12 = class112.field1949.getGraphics();
                for (int var13 = 0; var13 < class110.field1930; var13++) {
                    if (class212.field3766[var13]) {
                        class86.field1565.method801(class43.field852[var13], 3, class68.field1209[var13], var12, class128.field2229[var13], class111.field1941[var13]);
                        class212.field3766[var13] = false;
                    }
                }
            } catch (Exception var14) {
                class112.field1949.repaint();
            }
        } else if (class250.field4524 != 0) {
            try {
                Graphics var10 = class112.field1949.getGraphics();
                class86.field1565.method804(0, var10, -26806, 0);
                for (int var11 = 0; var11 < class110.field1930; var11++) {
                    class212.field3766[var11] = false;
                }
            } catch (Exception var15) {
                class112.field1949.repaint();
            }
        }
        if (class189.field3338) {
            class182.method1289(114);
        }
        if (class135.field2336 && class250.field4524 == 10 && class165.field2915 != -1) {
            class135.field2336 = false;
            class254.method1769(255, class20.field326);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1115(int arg0) {
        if (arg0 != 10) {
            this.method669((byte) -64);
        }
        field2696++;
        boolean var2 = class101.field1822.method1018(true);
        if (!var2) {
            this.method1107((byte) 14);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2689++;
        if (!this.method679(4000)) {
            return;
        }
        class187.field3295 = Integer.parseInt(this.getParameter("worldid"));
        class164.field2903 = Integer.parseInt(this.getParameter("modewhere"));
        if (class164.field2903 < 0 || class164.field2903 > 1) {
            class164.field2903 = 0;
        }
        class225.field4107 = Integer.parseInt(this.getParameter("modewhat"));
        if (class225.field4107 < 0 || class225.field4107 > 2) {
            class225.field4107 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class213.field3774 = true;
        } else {
            class213.field3774 = false;
        }
        try {
            class272.field4795 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class272.field4795 = 0;
        }
        class287.method1962(class272.field4795, -3);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class97.field1714 = true;
        } else {
            class97.field1714 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class24.field460 = true;
        } else {
            class24.field460 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class171.field3035 = 1;
        } else {
            class171.field3035 = 0;
        }
        try {
            class156.field2737 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class156.field2737 = 0;
        }
        class121.field2093 = class47.field940.method1435((byte) -72, this);
        if (class121.field2093 == null) {
            class121.field2093 = class100.field1800;
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class204.field3595 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class204.field3595 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class192.field3389 = true;
        } else {
            class192.field3389 = false;
        }
        class136.field2347 = this;
        this.method668(529, 1, class225.field4107 + 32, 765, 503);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lmd;)Z")
    public static final boolean method1116(class220 arg0) {
        if (class138.field2385) {
            if (method1112(arg0).field2021 != 0) {
                return false;
            }
            if (arg0.field3988 == 0) {
                return false;
            }
        }
        return arg0.field3904;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lmd;IIIIIII)V")
    public static final void method1117(class220[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class220 var9 = arg0[var8];
            if (var9 != null && var9.field4045 == arg1 && (!var9.field4010 || var9.field3988 == 0 || var9.field4049 || method1112(var9).field2021 != 0 || class154.field2673 == var9 || var9.field3960 == 1338) && (!var9.field4010 || !method1116(var9))) {
                int var10 = var9.field3909 + arg6;
                int var11 = var9.field3912 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3988 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4037 + var10;
                    int var17 = var9.field3948 + var11;
                    if (var9.field3988 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class33.field659 == var9) {
                    class55.field1026 = true;
                    class241.field4393 = var10;
                    class158.field2792 = var11;
                }
                if (!var9.field4010 || var12 < var14 && var13 < var15) {
                    if (var9.field3988 == 0) {
                        if (!var9.field4010 && method1116(var9) && class204.field3597 != var9) {
                            continue;
                        }
                        if (var9.field3874 && class20.field322 >= var12 && class268.field4747 >= var13 && class20.field322 < var14 && class268.field4747 < var15) {
                            for (class206 var18 = (class206) class129.field2251.method922((byte) 60); var18 != null; var18 = (class206) class129.field2251.method928(101)) {
                                if (var18.field3615) {
                                    var18.method1346((byte) -16);
                                    var18.field3614.field4051 = false;
                                }
                            }
                            if (class248.field4496 == 0) {
                                class33.field659 = null;
                                class154.field2673 = null;
                            }
                            class55.field1039 = 0;
                        }
                    }
                    if (var9.field4010) {
                        boolean var19;
                        if (class20.field322 >= var12 && class268.field4747 >= var13 && class20.field322 < var14 && class268.field4747 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class247.field4479 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class270.field4778 == 1 && class121.field2092 >= var12 && class47.field939 >= var13 && class121.field2092 < var14 && class47.field939 < var15) {
                            var21 = true;
                        }
                        if (var9.field3996 != null) {
                            for (int var22 = 0; var22 < var9.field3996.length; var22++) {
                                if (class165.field2920[var9.field3996[var22]]) {
                                    if (var9.field4052 == null || class160.field2844 >= var9.field4052[var22]) {
                                        byte var23 = var9.field3929[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class165.field2920[86]) && ((var23 & 0x1) == 0 || class165.field2920[82]) && ((var23 & 0x4) == 0 || class165.field2920[81])) {
                                            class67.method488(class100.field1800, var9.field3933, 22763, var22 + 1, -1);
                                            int var24 = var9.field4029[var22];
                                            if (var9.field4052 == null) {
                                                var9.field4052 = new int[var9.field3996.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field4052[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field4052[var22] = class160.field2844 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field4052 != null) {
                                    var9.field4052[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class3.method15(class121.field2092 - var10, false, var9, class47.field939 - var11);
                        }
                        if (class33.field659 != null && class33.field659 != var9 && var19 && method1112(var9).method832(1412416245)) {
                            class9.field121 = var9;
                        }
                        if (class154.field2673 == var9) {
                            class270.field4783 = true;
                            field2691 = var10;
                            class282.field4959 = var11;
                        }
                        if (var9.field4049 || var9.field3960 != 0) {
                            if (var19 && class249.field4514 != 0 && var9.field4055 != null) {
                                class206 var25 = new class206();
                                var25.field3615 = true;
                                var25.field3614 = var9;
                                var25.field3617 = class249.field4514;
                                var25.field3616 = var9.field4055;
                                class129.field2251.method931(var25, 124);
                            }
                            if (class33.field659 != null || class70.field1245 != null || class256.field4588 || var9.field3960 != 1400 && class55.field1039 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3960 != 0) {
                                if (var9.field3960 == 1337) {
                                    class262.field4670 = var9;
                                    class82.method614((byte) 113, var9);
                                    continue;
                                }
                                if (var9.field3960 == 1338) {
                                    if (var21) {
                                        class95.field1688 = class121.field2092 - var10;
                                        class44.field874 = class47.field939 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3960 == 1400) {
                                    class231.field4240 = var9;
                                    if (var21) {
                                        if (class165.field2920[82] && class123.field2134 > 0) {
                                            int var26 = (int) ((double) (class121.field2092 - var10 - var9.field4037 / 2) * 2.0D / (double) class12.field170);
                                            int var27 = (int) ((double) (class47.field939 - var11 - var9.field3948 / 2) * 2.0D / (double) class12.field170);
                                            int var28 = class276.field4842 + var26;
                                            int var29 = class39.field786 + var27;
                                            int var30 = class198.field3473 + var28;
                                            int var31 = class70.field1253 + class111.field1932 - var29 - 1;
                                            class133.method935(var31, 0, var30, true);
                                            class232.method1661(true);
                                            continue;
                                        }
                                        class55.field1039 = 1;
                                        class60.field1112 = class20.field322;
                                        class254.field4543 = class268.field4747;
                                        continue;
                                    }
                                    if (var20 && class55.field1039 > 0) {
                                        if (class55.field1039 == 1 && (class60.field1112 != class20.field322 || class268.field4747 != class254.field4543)) {
                                            class219.field3867 = class276.field4842;
                                            class3.field55 = class39.field786;
                                            class55.field1039 = 2;
                                        }
                                        if (class55.field1039 == 2) {
                                            class68.method491(32307, (int) ((double) (class60.field1112 - class20.field322) * 2.0D / (double) class108.field1913) + class219.field3867);
                                            class58.method430((int) ((double) (class254.field4543 - class268.field4747) * 2.0D / (double) class108.field1913) + class3.field55, (byte) -10);
                                        }
                                        continue;
                                    }
                                    class55.field1039 = 0;
                                    continue;
                                }
                                if (var9.field3960 == 1401) {
                                    if (var20) {
                                        class74.method532(class20.field322 - var10, 94, class268.field4747 - var11, var9.field4037, var9.field3948);
                                    }
                                    continue;
                                }
                                if (var9.field3960 == 1402) {
                                    class82.method614((byte) 56, var9);
                                    continue;
                                }
                            }
                            if (!var9.field4056 && var21) {
                                var9.field4056 = true;
                                if (var9.field4025 != null) {
                                    class206 var32 = new class206();
                                    var32.field3615 = true;
                                    var32.field3614 = var9;
                                    var32.field3611 = class121.field2092 - var10;
                                    var32.field3617 = class47.field939 - var11;
                                    var32.field3616 = var9.field4025;
                                    class129.field2251.method931(var32, 112);
                                }
                            }
                            if (var9.field4056 && var20 && var9.field3890 != null) {
                                class206 var33 = new class206();
                                var33.field3615 = true;
                                var33.field3614 = var9;
                                var33.field3611 = class20.field322 - var10;
                                var33.field3617 = class268.field4747 - var11;
                                var33.field3616 = var9.field3890;
                                class129.field2251.method931(var33, 127);
                            }
                            if (var9.field4056 && !var20) {
                                var9.field4056 = false;
                                if (var9.field3955 != null) {
                                    class206 var34 = new class206();
                                    var34.field3615 = true;
                                    var34.field3614 = var9;
                                    var34.field3611 = class20.field322 - var10;
                                    var34.field3617 = class268.field4747 - var11;
                                    var34.field3616 = var9.field3955;
                                    class83.field1526.method931(var34, 123);
                                }
                            }
                            if (var20 && var9.field4048 != null) {
                                class206 var35 = new class206();
                                var35.field3615 = true;
                                var35.field3614 = var9;
                                var35.field3611 = class20.field322 - var10;
                                var35.field3617 = class268.field4747 - var11;
                                var35.field3616 = var9.field4048;
                                class129.field2251.method931(var35, 118);
                            }
                            if (!var9.field4051 && var19) {
                                var9.field4051 = true;
                                if (var9.field3932 != null) {
                                    class206 var36 = new class206();
                                    var36.field3615 = true;
                                    var36.field3614 = var9;
                                    var36.field3611 = class20.field322 - var10;
                                    var36.field3617 = class268.field4747 - var11;
                                    var36.field3616 = var9.field3932;
                                    class129.field2251.method931(var36, 123);
                                }
                            }
                            if (var9.field4051 && var19 && var9.field3964 != null) {
                                class206 var37 = new class206();
                                var37.field3615 = true;
                                var37.field3614 = var9;
                                var37.field3611 = class20.field322 - var10;
                                var37.field3617 = class268.field4747 - var11;
                                var37.field3616 = var9.field3964;
                                class129.field2251.method931(var37, 112);
                            }
                            if (var9.field4051 && !var19) {
                                var9.field4051 = false;
                                if (var9.field3975 != null) {
                                    class206 var38 = new class206();
                                    var38.field3615 = true;
                                    var38.field3614 = var9;
                                    var38.field3611 = class20.field322 - var10;
                                    var38.field3617 = class268.field4747 - var11;
                                    var38.field3616 = var9.field3975;
                                    class83.field1526.method931(var38, 117);
                                }
                            }
                            if (var9.field3974 != null) {
                                class206 var39 = new class206();
                                var39.field3614 = var9;
                                var39.field3616 = var9.field3974;
                                class16.field251.method931(var39, 113);
                            }
                            if (var9.field4021 != null && class85.field1557 > var9.field3887) {
                                if (var9.field4035 == null || class85.field1557 - var9.field3887 > 32) {
                                    class206 var44 = new class206();
                                    var44.field3614 = var9;
                                    var44.field3616 = var9.field4021;
                                    class129.field2251.method931(var44, 124);
                                } else {
                                    label565: for (int var40 = var9.field3887; var40 < class85.field1557; var40++) {
                                        int var41 = class161.field2851[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field4035.length; var42++) {
                                            if (var9.field4035[var42] == var41) {
                                                class206 var43 = new class206();
                                                var43.field3614 = var9;
                                                var43.field3616 = var9.field4021;
                                                class129.field2251.method931(var43, 117);
                                                break label565;
                                            }
                                        }
                                    }
                                }
                                var9.field3887 = class85.field1557;
                            }
                            if (var9.field3942 != null && class187.field3306 > var9.field4058) {
                                if (var9.field3879 == null || class187.field3306 - var9.field4058 > 32) {
                                    class206 var49 = new class206();
                                    var49.field3614 = var9;
                                    var49.field3616 = var9.field3942;
                                    class129.field2251.method931(var49, 115);
                                } else {
                                    label541: for (int var45 = var9.field4058; var45 < class187.field3306; var45++) {
                                        int var46 = class286.field5113[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field3879.length; var47++) {
                                            if (var9.field3879[var47] == var46) {
                                                class206 var48 = new class206();
                                                var48.field3614 = var9;
                                                var48.field3616 = var9.field3942;
                                                class129.field2251.method931(var48, 125);
                                                break label541;
                                            }
                                        }
                                    }
                                }
                                var9.field4058 = class187.field3306;
                            }
                            if (var9.field3873 != null && class19.field316 > var9.field3952) {
                                if (var9.field3967 == null || class19.field316 - var9.field3952 > 32) {
                                    class206 var54 = new class206();
                                    var54.field3614 = var9;
                                    var54.field3616 = var9.field3873;
                                    class129.field2251.method931(var54, 124);
                                } else {
                                    label517: for (int var50 = var9.field3952; var50 < class19.field316; var50++) {
                                        int var51 = class129.field2246[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field3967.length; var52++) {
                                            if (var9.field3967[var52] == var51) {
                                                class206 var53 = new class206();
                                                var53.field3614 = var9;
                                                var53.field3616 = var9.field3873;
                                                class129.field2251.method931(var53, 112);
                                                break label517;
                                            }
                                        }
                                    }
                                }
                                var9.field3952 = class19.field316;
                            }
                            if (var9.field3971 != null && class215.field3828 > var9.field4002) {
                                if (var9.field4013 == null || class215.field3828 - var9.field4002 > 32) {
                                    class206 var59 = new class206();
                                    var59.field3614 = var9;
                                    var59.field3616 = var9.field3971;
                                    class129.field2251.method931(var59, 123);
                                } else {
                                    label493: for (int var55 = var9.field4002; var55 < class215.field3828; var55++) {
                                        int var56 = class74.field1354[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field4013.length; var57++) {
                                            if (var9.field4013[var57] == var56) {
                                                class206 var58 = new class206();
                                                var58.field3614 = var9;
                                                var58.field3616 = var9.field3971;
                                                class129.field2251.method931(var58, 113);
                                                break label493;
                                            }
                                        }
                                    }
                                }
                                var9.field4002 = class215.field3828;
                            }
                            if (var9.field3892 != null && class246.field4455 > var9.field3900) {
                                if (var9.field4034 == null || class246.field4455 - var9.field3900 > 32) {
                                    class206 var64 = new class206();
                                    var64.field3614 = var9;
                                    var64.field3616 = var9.field3892;
                                    class129.field2251.method931(var64, 118);
                                } else {
                                    label469: for (int var60 = var9.field3900; var60 < class246.field4455; var60++) {
                                        int var61 = class34.field672[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field4034.length; var62++) {
                                            if (var9.field4034[var62] == var61) {
                                                class206 var63 = new class206();
                                                var63.field3614 = var9;
                                                var63.field3616 = var9.field3892;
                                                class129.field2251.method931(var63, 126);
                                                break label469;
                                            }
                                        }
                                    }
                                }
                                var9.field3900 = class246.field4455;
                            }
                            if (class89.field1604 > var9.field3979 && var9.field3937 != null) {
                                class206 var65 = new class206();
                                var65.field3614 = var9;
                                var65.field3616 = var9.field3937;
                                class129.field2251.method931(var65, 119);
                            }
                            if (class177.field3201 > var9.field3979 && var9.field3938 != null) {
                                class206 var66 = new class206();
                                var66.field3614 = var9;
                                var66.field3616 = var9.field3938;
                                class129.field2251.method931(var66, 124);
                            }
                            if (class171.field3034 > var9.field3979 && var9.field3966 != null) {
                                class206 var67 = new class206();
                                var67.field3614 = var9;
                                var67.field3616 = var9.field3966;
                                class129.field2251.method931(var67, 117);
                            }
                            if (class273.field4804 > var9.field3979 && var9.field3906 != null) {
                                class206 var68 = new class206();
                                var68.field3614 = var9;
                                var68.field3616 = var9.field3906;
                                class129.field2251.method931(var68, 112);
                            }
                            if (class99.field1779 > var9.field3979 && var9.field3903 != null) {
                                class206 var69 = new class206();
                                var69.field3614 = var9;
                                var69.field3616 = var9.field3903;
                                class129.field2251.method931(var69, 117);
                            }
                            var9.field3979 = class193.field3395;
                            if (var9.field4036 != null) {
                                for (int var70 = 0; var70 < class113.field1975; var70++) {
                                    class206 var71 = new class206();
                                    var71.field3614 = var9;
                                    var71.field3610 = class107.field1909[var70];
                                    var71.field3618 = class131.field2274[var70];
                                    var71.field3616 = var9.field4036;
                                    class129.field2251.method931(var71, 120);
                                }
                            }
                            if (class199.field3481 && var9.field3936 != null) {
                                class206 var72 = new class206();
                                var72.field3614 = var9;
                                var72.field3616 = var9.field3936;
                                class129.field2251.method931(var72, 127);
                            }
                        }
                    }
                    if (!var9.field4010 && class33.field659 == null && class70.field1245 == null && !class256.field4588) {
                        if ((var9.field3985 >= 0 || var9.field3972 != 0) && class20.field322 >= var12 && class268.field4747 >= var13 && class20.field322 < var14 && class268.field4747 < var15) {
                            if (var9.field3985 >= 0) {
                                class204.field3597 = arg0[var9.field3985];
                            } else {
                                class204.field3597 = var9;
                            }
                        }
                        if (var9.field3988 == 8 && class20.field322 >= var12 && class268.field4747 >= var13 && class20.field322 < var14 && class268.field4747 < var15) {
                            class115.field1991 = var9;
                        }
                        if (var9.field3991 > var9.field3948) {
                            class49.method372(var11, var9.field3948, var9, class268.field4747, var9.field3991, var9.field4037 + var10, class20.field322, 0);
                        }
                    }
                    if (var9.field3988 == 0) {
                        method1117(arg0, var9.field3933, var12, var13, var14, var15, var10 - var9.field3891, var11 - var9.field4059);
                        if (var9.field3959 != null) {
                            method1117(var9.field3959, var9.field3933, var12, var13, var14, var15, var10 - var9.field3891, var11 - var9.field4059);
                        }
                        class47 var73 = (class47) class171.field3028.method1867((long) var9.field3933, true);
                        if (var73 != null) {
                            class133.method937(var15, var73.field934, var13, var12, var10, var14, var11, -119);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method681(int arg0) {
        field2684++;
        method1109(12353);
        class207.method1461(103);
        class78.method590((byte) -86);
        class254.method1771(15295);
        class187.method1305((byte) 83);
        class94.method676(arg0 ^ 0xFFFFDDC7);
        class212.method1514(arg0 + 30573);
        class116.method819((byte) 81);
        class167.method1206(-17482);
        class156.method1142(arg0 ^ 0xB);
        class149.method1032(arg0 ^ 0x49);
        class127.method895((byte) 114);
        class147.method1030(-21);
        class284.method1925((byte) -117);
        class85.method628((byte) 14);
        class169.method1210(100);
        class99.method713(113);
        class124.method870(-78);
        class81.method608(true);
        class199.method1384((byte) 23);
        class256.method1777(-102);
        class107.method774((byte) -127);
        class155.method1129(arg0 - 16);
        class220.method1571((byte) -124);
        class14.method86((byte) 124);
        class132.method929(arg0 ^ 0x4D);
        class100.method735(104);
        class275.method1874(109);
        class255.method1775(-82);
        class52.method404(684);
        class265.method1824(arg0 ^ 0x70);
        class24.method174(false);
        class60.method449(121);
        class204.method1412((byte) -119);
        class49.method373(arg0 - 10892);
        class65.method465((byte) -91);
        class286.method1941((byte) -101);
        class174.method1253((byte) -35);
        class22.method135((byte) 29);
        class196.method1361(false);
        class72.method523(arg0 ^ 0xFFFFFFF0);
        class47.method359(false);
        class117.method825((byte) 7);
        class194.method1349(67);
        class51.method396(8388607);
        class188.method1316(-1);
        class125.method883(127);
        class287.method1960(104);
        class195.method1356(arg0 ^ arg0);
        class241.method1705(8);
        class144.method989(true);
        class75.method543(arg0 - 9878);
        class208.method1472((byte) 118);
        class56.method421(33);
        class231.method1655(false);
        class71.method510((byte) -35);
        class217.method1550(1);
        class15.method97(1620);
        class163.method1182(94);
        class237.method1690((byte) 76);
        class134.method940(-1);
        class272.method1850(-117);
        class263.method1818(50);
        class210.method1482();
        class106.method766(0);
        class173.method1242((byte) -97);
        class37.method288();
        class247.method1741((byte) -124);
        class86.method636(-75);
        class192.method1337((byte) 100);
        class160.method1169(true);
        class126.method886((byte) 75);
        class271.method1849(119);
        class33.method248(true);
        class226.method1593();
        class108.method785(1);
        class157.method1147(0);
        class146.method1001();
        class67.method487(-29647);
        class133.method938(true);
        class36.method261(-73);
        class42.method319();
        class12.method71(65);
        class1.method3(0);
        class223.method1579(true);
        class161.method1174(124);
        class23.method163();
        class277.method1884(-3);
        class219.method1554(-4);
        class119.method848(127);
        class32.method243(122);
        class105.method756(4);
        class55.method419(arg0 ^ 0xFFFFFF8A);
        class11.method63(-110);
        class43.method332(false);
        class228.method1625(20591);
        class8.method47((byte) 56);
        class200.method1392(26);
        class234.method1672(false);
        class244.method1720(false);
        class179.method1280(false);
        class16.method98((byte) -124);
        class230.method1654((byte) 47);
        class214.method1520(112);
        class189.method1317(10);
        class248.method1748(-11122);
        class93.method666(0);
        class270.method1842(true);
        class13.method77(true);
        class45.method352((byte) -51);
        class140.method975((byte) 123);
        class257.method1786();
        class280.method1899(503);
        class182.method1286(false);
        class80.method601(-5231);
        class198.method1374((byte) -62);
        class260.method1808(0);
        class110.method788((byte) -116);
        class136.method945((byte) 40);
        class278.method1889(arg0 - 142);
        class83.method623(0);
        class206.method1422(108);
        class235.method1680(arg0 + 2);
        class288.method1966(-82);
        class115.method815((byte) 16);
        class209.method1478(true);
        class28.method223((byte) 68);
        class246.method1728((byte) 74);
        class98.method696(-8897776);
        class129.method907((byte) -123);
        class122.method863();
        class216.method1546(arg0 - 90);
        class171.method1227((byte) 116);
        class141.method979(arg0 + 36);
        class148.method1031();
        class10.method58((byte) -1);
        class185.method1295(3524);
        class57.method424(arg0 ^ 0x20);
        class59.method435((byte) 114);
        class40.method308(2047);
        class79.method597(false);
        class243.method1712((byte) -100);
        class266.method1828(-22224);
        class142.method985();
        class87.method638(arg0 ^ 0xFFFF8253);
        class186.method1299(-1);
        class221.method1577(5);
        class18.method110(128);
        class259.method1805((byte) 114);
        class252.method1762((byte) 98);
        class245.method1726(89);
        class120.method857(true);
        class232.method1664(-27821);
        class30.method237(-103);
        class269.method1835(120);
        class165.method1195(34);
        class70.method509((byte) -113);
        class178.method1275((byte) 69);
        class282.method1920(-121);
        class250.method1754((byte) -108);
        class213.method1517((byte) -102);
        class201.method1398(false);
        class112.method803(false);
        class224.method1582(arg0 - 116);
        class128.method901(4758);
        class92.method664((byte) 90);
        class193.method1341(false);
        class66.method482();
        class137.method950(true);
        class111.method793(233346342);
        class180.method1283(-94);
        class89.method646(false);
        class88.method643((byte) 77);
        class97.method690((byte) 123);
        class61.method453();
        class7.method41();
        class20.method120((byte) 77);
        class46.method357(27586);
        class29.method225();
        class145.method990();
        class233.method1669((byte) -29);
        class48.method362(-14079);
        class170.method1225(2);
        class143.method986((byte) -63);
        class58.method428((byte) -119);
        class215.method1537(0);
        class177.method1267(19454);
        class281.method1908((byte) -114);
        class176.method1260((byte) -116);
        class31.method239((byte) -122);
        class3.method19(0);
        class267.method1829(-1025371828);
        class41.method309(-127);
        class19.method113((byte) -126);
        class285.method1938(-1042);
        class82.method612((byte) -95);
        class159.method1158((byte) 59);
        class172.method1231(127);
        class262.method1816(-111);
        class9.method53(true);
        class74.method535((byte) -119);
        class69.method502(-3132);
        class175.method1256((byte) -119);
        class202.method1400((byte) 126);
        class225.method1587((byte) 114);
        class113.method808(101);
        class101.method741(arg0 ^ 0xF);
        class191.method1332(arg0 ^ 0xFFFFFF8E);
        class183.method1291(2);
        class26.method217(1);
        class150.method1090(arg0 ^ 0xFFFFFFEE);
        class21.method128(-121);
        class5.method34((byte) 56);
        class138.method951(-2);
        class164.method1187((byte) -89);
        class154.method1106(arg0 - 16);
        class27.method219(0);
        class261.method1811(50);
        class123.method865((byte) 115);
        class268.method1831(2);
        class190.method1325((byte) 23);
        class276.method1879(false);
        class39.method301((byte) 34);
        class6.method37((byte) -87);
        class249.method1752(true);
        class34.method254(1516307684);
        class44.method336((byte) 88);
        class283.method1922(false);
        class273.method1853((byte) 66);
        class2.method8((byte) -20);
        class131.method920((byte) 117);
        class68.method492(false);
        class121.method858((byte) 110);
        class153.method1102(63);
        class242.method1709(arg0 + 78);
        class17.method104(6703);
        class25.method215((byte) 92);
        class73.method527(arg0 ^ 0xFFFFFFBF);
        class62.method457((byte) -123);
        class95.method684((byte) 90);
        class236.method1683(-1713103390);
        class118.method845((byte) -79);
        class151.method1095((byte) -26);
        class102.method743(arg0 - 14);
        class279.method1897(76);
        class227.method1618(arg0 ^ 0xFFFFFF86);
        class162.method1177(-42);
        class4.method26(-115);
    }
}
