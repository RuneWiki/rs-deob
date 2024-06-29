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
public class client extends class265 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lph;")
    public static class229 field5420 = class266.method1858("Regarder dans cette direction", 0);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lph;")
    private static class229 field5429 = class266.method1858("Loaded title screen", 0);

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "Lph;")
    public static class229 field5417 = field5429;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lph;")
    public static class229 field5428 = class266.method1858(")1", 0);

    @OriginalMember(owner = "client!client", name = "R", descriptor = "Lvm;")
    public static class202 field5418 = new class202(4);

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "Z")
    public static volatile boolean field5431 = false;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "B")
    public static byte field5430;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field5432;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 9)
    private final void method2163(boolean arg0) {
        field5425++;
        boolean var2 = class177.field2921.method169(1);
        if (arg0) {
            field5431 = true;
        }
        if (!var2) {
            this.method2167(arg0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 25)
    public final void method1849(boolean arg0) {
        field5422++;
        if (class169.field2786 == 1000) {
            return;
        }
        class319.field5393++;
        if ((class319.field5393 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class33.field545 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class186.field3031.setSeed((long) class33.field545);
        }
        this.method2163(false);
        if (class180.field2957 != null) {
            class180.field2957.method634(0);
        }
        class211.method1489(-38);
        if (!arg0) {
            return;
        }
        class53.method364(14874);
        class244.method1701((byte) 87);
        class301.method2022(48);
        if (class99.field1675) {
            class274.method1897();
        }
        if (class4.field47 != null) {
            int var3 = class4.field47.method1399(-1);
            class76.field1271 = var3;
        }
        if (class169.field2786 == 0) {
            this.method2165(0);
            class221.method1546((byte) -128);
        } else if (class169.field2786 == 5) {
            this.method2165(0);
            class221.method1546((byte) -127);
        } else if (class169.field2786 == 25 || class169.field2786 == 28) {
            class254.method1774((byte) 125);
        }
        if (class169.field2786 == 10) {
            this.method2166(-1);
            class326.method2232(-95);
            class312.method2106(26632);
            class296.method2004(0);
        } else if (class169.field2786 == 30) {
            class131.method936(true);
        } else if (class169.field2786 == 40) {
            class296.method2004(0);
            if (class332.field5661 != -3) {
                if (class332.field5661 == 15) {
                    class15.method85(false);
                } else if (class332.field5661 != 2) {
                    class110.method836(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lsi;II)Lcf;", line = 144)
    public static final class184 method2164(class66 arg0, int arg1, int arg2) {
        field5414++;
        if (arg1 != 7618) {
            field5420 = (class229) null;
        }
        byte[] var3 = arg0.method504(arg2, -13928);
        return var3 == null ? null : new class184(var3);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 165)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class48.method337("argument count", (byte) -123);
            }
            class223.field3673 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class112.field1900 = 2;
            if (arg0[1].equals("live")) {
                class218.field3586 = 0;
            } else if (arg0[1].equals("rc")) {
                class218.field3586 = 1;
            } else if (arg0[1].equals("wip")) {
                class218.field3586 = 2;
            } else {
                class48.method337("modewhat", (byte) -127);
            }
            class315.field5363 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class72.method562(class27.method184((byte) 75, var2, var2.length, 0), (byte) -124);
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class276.field4599 = var1;
            } else if (arg0[2].equals("english")) {
                class276.field4599 = 0;
            } else if (arg0[2].equals("german")) {
                class276.field4599 = 1;
            } else {
                class48.method337("language", (byte) -125);
            }
            class168.method1233(class276.field4599, -2);
            class70.field1181 = false;
            class255.field4265 = false;
            if (arg0[3].equals("game0")) {
                class166.field2710 = 0;
            } else if (arg0[3].equals("game1")) {
                class166.field2710 = 1;
            } else {
                class48.method337("game", (byte) -127);
            }
            class69.field1111 = 0;
            class232.field3830 = class134.field2172;
            class174.field2849 = false;
            class48.field709 = 0;
            client var4 = new client();
            class157.field2561 = var4;
            var4.method1842(768, class218.field3586 + 32, 1024, "runescape", -2963, 28, 525);
            class160.field2590.setLocation(40, 40);
        } catch (Exception var7) {
            class110.method834((String) null, var7, -1);
        }
        field5413++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 238)
    public final void method1854(int arg0) {
        field5423++;
        if (class169.field2786 == 1000) {
            return;
        }
        boolean var2 = class323.method2217(0);
        if (var2 && class300.field4870 && class307.field5177 != null) {
            class307.field5177.method666(false);
        }
        if ((class169.field2786 == 30 || class169.field2786 == 10) && (field5431 || class160.field2593 != 0L && class160.field2593 < class130.method935(false))) {
            class168.method1229(class156.field2540, field5431, (byte) 107, class326.field5576, class269.method1870(true));
        }
        if (class325.field5569 == null) {
            Container var3;
            if (class325.field5569 != null) {
                var3 = class325.field5569;
            } else if (class160.field2590 == null) {
                var3 = class249.field4143.field1561;
            } else {
                var3 = class160.field2590;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class160.field2590 == var3) {
                Insets var6 = class160.field2590.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class15.field177 != var4 || class53.field754 != var5) {
                if (class92.field1557.startsWith("mac")) {
                    class15.field177 = var4;
                    class53.field754 = var5;
                } else {
                    class269.method1866(87);
                }
                class160.field2593 = class130.method935(false) + 500L;
            }
        }
        if (class325.field5569 != null && !class293.field4783 && (class169.field2786 == 30 || class169.field2786 == 10)) {
            class168.method1229(-1, false, (byte) -69, -1, class72.field1231);
        }
        boolean var7 = false;
        if (class67.field1070) {
            class67.field1070 = false;
            var7 = true;
        }
        if (var7) {
            class213.method1513((byte) -125);
        }
        if (class99.field1675) {
            for (int var8 = 0; var8 < 100; var8++) {
                class187.field3036[var8] = true;
            }
        }
        if (class169.field2786 == 0) {
            class225.method1567(class277.field4606, class243.field4010, var7, (Color) null, (byte) 22);
        } else if (class169.field2786 == 5) {
            class263.method1832(class213.field3517, -126, false);
        } else if (class169.field2786 == 10) {
            class303.method2050(false);
        } else if (class169.field2786 == 25 || class169.field2786 == 28) {
            if (class196.field3280 == 1) {
                if (class69.field1107 < class190.field3083) {
                    class69.field1107 = class190.field3083;
                }
                int var9 = (class69.field1107 - class190.field3083) * 50 / class69.field1107;
                class10.method71((byte) -106, false, class248.method1746(8528, new class229[] { class138.field2233, class153.field2503, class50.method354(0, var9), class193.field3189 }));
            } else if (class196.field3280 == 2) {
                if (class272.field4557 < class295.field4828) {
                    class272.field4557 = class295.field4828;
                }
                int var10 = (class272.field4557 - class295.field4828) * 50 / class272.field4557 + 50;
                class10.method71((byte) -124, false, class248.method1746(8528, new class229[] { class138.field2233, class153.field2503, class50.method354(0, var10), class193.field3189 }));
            } else {
                class10.method71((byte) -126, false, class138.field2233);
            }
        } else if (class169.field2786 == 30) {
            class162.method1143(-1);
        } else if (class169.field2786 == 40) {
            class10.method71((byte) -115, false, class248.method1746(arg0 ^ 0x20A4, new class229[] { class126.field2101, class294.field4810, class126.field2108 }));
        }
        if (class99.field1675 && class169.field2786 != 0) {
            class99.method745();
            for (int var11 = 0; var11 < class15.field186; var11++) {
                class189.field3067[var11] = false;
            }
        } else if ((class169.field2786 == 30 || class169.field2786 == 10) && class114.field1934 == 0 && !var7) {
            try {
                Graphics var12 = class214.field3526.getGraphics();
                for (int var13 = 0; var13 < class15.field186; var13++) {
                    if (class189.field3067[var13]) {
                        class156.field2534.method1102(class113.field1921[var13], var12, class311.field5222[var13], class45.field691[var13], (byte) 106, class300.field4875[var13]);
                        class189.field3067[var13] = false;
                    }
                }
            } catch (Exception var19) {
                class214.field3526.repaint();
            }
        } else if (class169.field2786 != 0) {
            try {
                Graphics var15 = class214.field3526.getGraphics();
                class156.field2534.method1101(var15, (byte) 79, 0, 0);
                for (int var16 = 0; var16 < class15.field186; var16++) {
                    class189.field3067[var16] = false;
                }
            } catch (Exception var18) {
                class214.field3526.repaint();
            }
        }
        if (class187.field3046) {
            class147.method1080(arg0 - 445);
        }
        if (class160.field2594 && class169.field2786 == 10 && class198.field3292 != -1) {
            class160.field2594 = false;
            class94.method702((byte) -71, class249.field4143);
        }
        if (arg0 != 500) {
            this.method2166(-29);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 477)
    private final void method2165(int arg0) {
        if (!class160.field2594) {
            label235: while (true) {
                do {
                    if (!class173.method1249((byte) 113)) {
                        break label235;
                    }
                } while (class105.field1783 != 115 && class105.field1783 != 83);
                class160.field2594 = true;
            }
        }
        if (arg0 != 0) {
            field5417 = (class229) null;
        }
        field5427++;
        if (class222.field3661 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class130.method935(false);
            if (class285.field4698 == 0L) {
                class285.field4698 = var28;
            }
            if (var27 > 16384 && (var28 - class285.field4698) < 5000L) {
                if ((var28 - class71.field1183) > 1000L) {
                    System.gc();
                    class71.field1183 = var28;
                }
                class243.field4010 = class44.field683;
                class277.field4606 = 5;
            } else {
                class277.field4606 = 5;
                class222.field3661 = 10;
                class243.field4010 = class236.field3889;
            }
        } else if (class222.field3661 == 10) {
            class62.method432(4, 104, 104);
            for (int var25 = 0; var25 < 4; var25++) {
                class160.field2592[var25] = new class108(104, 104);
            }
            class222.field3661 = 30;
            class277.field4606 = 10;
            class243.field4010 = class325.field5555;
        } else if (class222.field3661 == 30) {
            if (class180.field2957 == null) {
                class180.field2957 = new class85(class177.field2921, class149.field2406);
            }
            if (class180.field2957.method627(false)) {
                class139.field2249 = class148.method1084(true, true, 0, 0, false);
                class161.field2601 = class148.method1084(true, true, 0, 1, false);
                class236.field3885 = class148.method1084(false, true, arg0 ^ 0x0, 2, true);
                class171.field2811 = class148.method1084(true, true, 0, 3, false);
                class105.field1780 = class148.method1084(true, true, 0, 4, false);
                class131.field2130 = class148.method1084(true, true, arg0, 5, true);
                class219.field3599 = class148.method1084(true, false, 0, 6, true);
                class281.field4649 = class148.method1084(true, true, 0, 7, false);
                class209.field3442 = class148.method1084(true, true, 0, 8, false);
                class147.field2383 = class148.method1084(true, true, arg0, 9, false);
                class312.field5246 = class148.method1084(true, true, 0, 10, false);
                class1.field17 = class148.method1084(true, true, 0, 11, false);
                class173.field2829 = class148.method1084(true, true, 0, 12, false);
                class48.field704 = class148.method1084(true, true, arg0 ^ 0x0, 13, false);
                class234.field3857 = class148.method1084(true, false, 0, 14, false);
                class97.field1645 = class148.method1084(true, true, 0, 15, false);
                class201.field3323 = class148.method1084(true, true, 0, 16, false);
                class89.field1527 = class148.method1084(true, true, 0, 17, false);
                class195.field3271 = class148.method1084(true, true, 0, 18, false);
                class115.field1952 = class148.method1084(true, true, 0, 19, false);
                class70.field1171 = class148.method1084(true, true, arg0, 20, false);
                class6.field83 = class148.method1084(true, true, 0, 21, false);
                class123.field2066 = class148.method1084(true, true, 0, 22, false);
                class228.field3752 = class148.method1084(true, true, 0, 23, true);
                class222.field3656 = class148.method1084(true, true, arg0 ^ 0x0, 24, false);
                class102.field1741 = class148.method1084(true, true, 0, 25, false);
                class153.field2502 = class148.method1084(true, true, 0, 26, true);
                class156.field2528 = class148.method1084(true, true, 0, 27, false);
                class222.field3661 = 40;
                class277.field4606 = 15;
                class243.field4010 = class207.field3418;
            } else {
                class277.field4606 = 12;
                class243.field4010 = class249.field4144;
            }
        } else if (class222.field3661 == 40) {
            int var23 = 0;
            for (int var24 = 0; var24 < 28; var24++) {
                var23 += class180.field2955[var24].method1673(false) * class124.field2082[var24] / 100;
            }
            if (var23 == 100) {
                class243.field4010 = class188.field3054;
                class277.field4606 = 20;
                class138.method995(class209.field3442, (byte) 6);
                class195.method1379(class209.field3442, true);
                class306.method2070(class209.field3442, 1817);
                class222.field3661 = 45;
            } else {
                if (var23 != 0) {
                    class243.field4010 = class248.method1746(8528, new class229[] { class254.field4244, class50.method354(0, var23), class107.field1813 });
                }
                class277.field4606 = 20;
            }
        } else if (class222.field3661 == 45) {
            class192.method1349(2, class143.field2313, (byte) 66, 22050);
            class314.field5343 = new class63();
            class314.field5343.method461(9, -21309, 128);
            class307.field5177 = class75.method572(class249.field4143, 0, 22050, -1024, class214.field3526);
            class307.field5177.method663(class314.field5343, 28579);
            class232.method1652(-2, class97.field1645, class105.field1780, class234.field3857, class314.field5343);
            class110.field1870 = class75.method572(class249.field4143, 1, 2048, -1024, class214.field3526);
            class239.field3949 = new class318();
            class110.field1870.method663(class239.field3949, arg0 + 28579);
            class249.field4145 = new class303(22050, class255.field4264);
            class289.field4741 = class219.field3599.method498(class107.field1811, -1);
            class243.field4010 = class63.field967;
            class277.field4606 = 30;
            class222.field3661 = 50;
        } else if (class222.field3661 == 50) {
            int var21 = class204.method1426(class48.field704, class209.field3442, -24975);
            int var22 = class279.method1916(115);
            if (var22 <= var21) {
                class243.field4010 = class295.field4824;
                class222.field3661 = 60;
                class277.field4606 = 35;
            } else {
                class243.field4010 = class248.method1746(8528, new class229[] { class66.field1041, class50.method354(arg0, var21 * 100 / var22), class107.field1813 });
                class277.field4606 = 35;
            }
        } else if (class222.field3661 == 60) {
            int var2 = class265.method1848(class209.field3442, 0);
            int var3 = class54.method369(2);
            if (var3 > var2) {
                class243.field4010 = class248.method1746(8528, new class229[] { class100.field1709, class50.method354(0, var2 * 100 / var3), class107.field1813 });
                class277.field4606 = 40;
            } else {
                class243.field4010 = field5417;
                class222.field3661 = 65;
                class277.field4606 = 40;
            }
        } else if (class222.field3661 == 65) {
            class188.method1317(class209.field3442, 32, class48.field704);
            class277.field4606 = 45;
            class243.field4010 = class65.field989;
            class80.method595(5, (byte) -128);
            class222.field3661 = 70;
        } else if (class222.field3661 == 70) {
            class236.field3885.method492(-98);
            byte var9 = 0;
            int var10 = var9 + class236.field3885.method502(-9794);
            class201.field3323.method492(-126);
            int var11 = var10 + class201.field3323.method502(-9794);
            class89.field1527.method492(121);
            int var12 = var11 + class89.field1527.method502(-9794);
            class195.field3271.method492(-125);
            int var13 = var12 + class195.field3271.method502(arg0 - 9794);
            class115.field1952.method492(arg0 ^ 0x79);
            int var14 = var13 + class115.field1952.method502(-9794);
            class70.field1171.method492(-95);
            int var15 = var14 + class70.field1171.method502(-9794);
            class6.field83.method492(arg0 - 53);
            int var16 = var15 + class6.field83.method502(arg0 - 9794);
            class123.field2066.method492(-91);
            int var17 = var16 + class123.field2066.method502(-9794);
            class222.field3656.method492(93);
            int var18 = var17 + class222.field3656.method502(-9794);
            class102.field1741.method492(-78);
            int var19 = var18 + class102.field1741.method502(-9794);
            class156.field2528.method492(-67);
            int var20 = var19 + class156.field2528.method502(-9794);
            if (var20 < 1100) {
                class243.field4010 = class248.method1746(8528, new class229[] { class285.field4706, class50.method354(arg0 ^ 0x0, var20 / 11), class107.field1813 });
                class277.field4606 = 50;
            } else {
                class290.method1989(class236.field3885, false);
                class186.method1304(class236.field3885, (byte) -12);
                class25.method160(-3, class236.field3885);
                class1.method11(class281.field4649, 12327, class236.field3885);
                class174.method1258(class281.field4649, class201.field3323, (byte) -106, true);
                class108.method812(class281.field4649, (byte) -108, class195.field3271);
                class312.method2112(class281.field4649, arg0 - 1501, class115.field1952, true, class256.field4272);
                class213.method1511(class236.field3885, true);
                class269.method1871(class139.field2249, class161.field2601, class70.field1171, 21826);
                class273.method1890(class6.field83, class281.field4649, -80);
                class290.method1987(class123.field2066, (byte) -105);
                class4.method22(class236.field3885, true);
                class5.method30(class281.field4649, class171.field2811, class209.field3442, arg0 - 124, class48.field704);
                class218.method1526(false, class236.field3885);
                class280.method1928(class89.field1527, -4);
                class277.method1913(new class44(), class102.field1741, -32625, class222.field3656);
                class170.method1240((byte) -76, class102.field1741, class222.field3656);
                class243.field4010 = class280.field4644;
                class277.field4606 = 50;
                class259.method1794(128);
                class222.field3661 = 80;
            }
        } else if (class222.field3661 == 80) {
            int var7 = class136.method972((byte) -46, class209.field3442);
            int var8 = class275.method1902((byte) 123);
            if (var7 >= var8) {
                class111.method849(66, class209.field3442);
                class277.field4606 = 60;
                class243.field4010 = class108.field1842;
                class222.field3661 = 90;
            } else {
                class243.field4010 = class248.method1746(8528, new class229[] { class312.field5257, class50.method354(0, var7 * 100 / var8), class107.field1813 });
                class277.field4606 = 60;
            }
        } else if (class222.field3661 == 90) {
            if (class153.field2502.method492(arg0 ^ 0x79)) {
                class17 var4 = new class17(class147.field2383, class153.field2502, class209.field3442, 20, !class296.field4836);
                class310.method2084(var4);
                if (class191.field3153 == 1) {
                    class310.method2102(0.9F);
                }
                if (class191.field3153 == 2) {
                    class310.method2102(0.8F);
                }
                if (class191.field3153 == 3) {
                    class310.method2102(0.7F);
                }
                if (class191.field3153 == 4) {
                    class310.method2102(0.6F);
                }
                class222.field3661 = 100;
                class243.field4010 = class220.field3612;
                class277.field4606 = 70;
            } else {
                class243.field4010 = class248.method1746(8528, new class229[] { class211.field3494, class50.method354(arg0, class153.field2502.method502(-9794)), class107.field1813 });
                class277.field4606 = 70;
            }
        } else if (class222.field3661 == 100) {
            if (class196.method1383((byte) 82, class209.field3442)) {
                class222.field3661 = 110;
            }
        } else if (class222.field3661 == 110) {
            class153.field2499 = new class141();
            class249.field4143.method685(10, class153.field2499, (byte) 80);
            class277.field4606 = 75;
            class243.field4010 = class187.field3051;
            class222.field3661 = 120;
        } else if (class222.field3661 == 120) {
            if (class312.field5246.method495(class200.field3317, -1, class134.field2172)) {
                class60 var5 = new class60(class312.field5246.method497(class200.field3317, class134.field2172, false));
                class190.method1329(-9636, var5);
                class222.field3661 = 130;
                class277.field4606 = 80;
                class243.field4010 = class184.field2987;
            } else {
                class243.field4010 = class248.method1746(8528, new class229[] { class315.field5360, class67.field1080 });
                class277.field4606 = 80;
            }
        } else if (class222.field3661 == 130) {
            if (!class171.field2811.method492(-60)) {
                class243.field4010 = class248.method1746(8528, new class229[] { class208.field3426, class50.method354(0, class171.field2811.method502(-9794) * 3 / 4), class107.field1813 });
                class277.field4606 = 85;
            } else if (!class173.field2829.method492(-99)) {
                class243.field4010 = class248.method1746(8528, new class229[] { class208.field3426, class50.method354(0, (class173.field2829.method502(-9794) / 10) + 75), class107.field1813 });
                class277.field4606 = 85;
            } else if (!class48.field704.method492(arg0 + 83)) {
                class243.field4010 = class248.method1746(8528, new class229[] { class208.field3426, class50.method354(0, class48.field704.method502(-9794) / 20 + 85), class107.field1813 });
                class277.field4606 = 85;
            } else if (class228.field3752.method508((byte) -74, class152.field2477)) {
                class290.method1983(arg0 ^ 0x68, class303.field5060, class181.field2959, class69.field1102, class228.field3752, class105.field1779, class250.field4160);
                class194.method1368(class156.field2528);
                class243.field4010 = class105.field1789;
                class277.field4606 = 95;
                class222.field3661 = 135;
            } else {
                class243.field4010 = class248.method1746(8528, new class229[] { class208.field3426, class50.method354(0, class228.field3752.method510((byte) -101, class152.field2477) / 10 + 90), class107.field1813 });
                class277.field4606 = 85;
            }
        } else if (class222.field3661 == 135) {
            int var6 = class110.method841(1001);
            if (var6 == -1) {
                class277.field4606 = 95;
                class243.field4010 = class141.field2279;
            } else if (var6 == 7 || var6 == 9) {
                this.method1846("worldlistfull", (byte) -33);
                class80.method595(1000, (byte) -128);
            } else if (class229.field3762) {
                class222.field3661 = 140;
                class243.field4010 = class221.field3634;
                class277.field4606 = 96;
            } else {
                this.method1846("worldlistio_" + var6, (byte) -33);
                class80.method595(1000, (byte) -126);
            }
        } else if (class222.field3661 == 140) {
            class307.field5180 = class171.field2811.method498(class173.field2830, -1);
            class131.field2130.method506(false, true, (byte) 77);
            class219.field3599.method506(true, true, (byte) 77);
            class209.field3442.method506(true, true, (byte) 77);
            class48.field704.method506(true, true, (byte) 77);
            class312.field5246.method506(true, true, (byte) 77);
            class171.field2811.method506(true, true, (byte) 77);
            class243.field4010 = class239.field3942;
            class222.field3661 = 150;
            class187.field3046 = true;
            class277.field4606 = 97;
        } else if (class222.field3661 == 150) {
            class9.method60();
            if (class160.field2594) {
                class72.field1231 = 0;
                class214.field3532 = 0;
                class272.field4546 = 0;
            }
            class160.field2594 = true;
            class94.method702((byte) -69, class249.field4143);
            class168.method1229(-1, false, (byte) 121, -1, class72.field1231);
            class222.field3661 = 160;
            class243.field4010 = class160.field2591;
            class277.field4606 = 100;
        } else if (class222.field3661 == 160) {
            class129.method933(-3, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 977)
    public final void method1852(byte arg0) {
        field5412++;
        if (class99.field1675) {
            class99.method732();
        }
        if (class325.field5569 != null) {
            class266.method1861(class325.field5569, (byte) 86, class249.field4143);
            class325.field5569 = null;
        }
        if (class249.field4143 != null) {
            class249.field4143.method676(this.getClass(), 0);
        }
        if (class153.field2499 != null) {
            class153.field2499.field2273 = false;
        }
        class153.field2499 = null;
        if (class121.field2031 != null) {
            class121.field2031.method534(-1);
            class121.field2031 = null;
        }
        class136.method967(5324, class214.field3526);
        class233.method1655((byte) -44, class214.field3526);
        if (class4.field47 != null) {
            class4.field47.method1398((byte) -70, class214.field3526);
        }
        class214.method1516((byte) -101);
        class39.method299(95);
        class4.field47 = null;
        if (class307.field5177 != null) {
            class307.field5177.method665(-16933);
        }
        if (class110.field1870 != null) {
            class110.field1870.method665(-16933);
        }
        class177.field2921.method164(-2);
        class149.field2406.method844(0);
        try {
            if (class313.field5326 != null) {
                class313.field5326.method12(-3);
            }
            if (class74.field1249 != null) {
                for (int var2 = 0; var2 < class74.field1249.length; var2++) {
                    if (class74.field1249[var2] != null) {
                        class74.field1249[var2].method12(arg0 - 78);
                    }
                }
            }
            if (arg0 != 75) {
                return;
            }
            if (class17.field205 != null) {
                class17.field205.method12(-3);
            }
            if (class102.field1738 != null) {
                class102.field1738.method12(-3);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1059)
    public final void init() {
        field5419++;
        if (!this.method1843((byte) -84)) {
            return;
        }
        class223.field3673 = Integer.parseInt(this.getParameter("worldid"));
        class112.field1900 = Integer.parseInt(this.getParameter("modewhere"));
        if (class112.field1900 < 0 || class112.field1900 > 1) {
            class112.field1900 = 0;
        }
        class218.field3586 = Integer.parseInt(this.getParameter("modewhat"));
        if (class218.field3586 < 0 || class218.field3586 > 2) {
            class218.field3586 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class315.field5363 = true;
        } else {
            class315.field5363 = false;
        }
        try {
            class276.field4599 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class276.field4599 = 0;
        }
        class168.method1233(class276.field4599, -2);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class70.field1181 = true;
        } else {
            class70.field1181 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class255.field4265 = true;
        } else {
            class255.field4265 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class166.field2710 = 1;
        } else {
            class166.field2710 = 0;
        }
        try {
            class48.field709 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class48.field709 = 0;
        }
        class232.field3830 = class271.field4541.method1604((byte) -51, this);
        if (class232.field3830 == null) {
            class232.field3830 = class134.field2172;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class69.field1111 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class69.field1111 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class174.field2849 = true;
        } else {
            class174.field2849 = false;
        }
        class157.field2561 = this;
        this.method1847(525, (byte) -126, 765, 503, class218.field3586 + 32);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 1161)
    private final void method2166(int arg0) {
        field5424++;
        for (class214.field3534 = 0; class173.method1249((byte) 119) && class214.field3534 < 128; class214.field3534++) {
            class275.field4593[class214.field3534] = class207.field3409;
            class185.field2997[class214.field3534] = class105.field1783;
        }
        class69.field1106++;
        if (class198.field3292 != arg0) {
            class179.method1280(0, 0, class198.field3292, -121, class266.field4484, 0, class273.field4567, 0);
        }
        class129.field2125++;
        if (class99.field1675) {
            int var2 = 19137023;
            label194: for (int var3 = 0; var3 < 32768; var3++) {
                class217 var4 = class187.field3035[var3];
                if (var4 != null) {
                    byte var5 = var4.field3559.field5323;
                    if ((var5 & 0x2) > 0 && var4.field5171 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field5104[0] = (var4.field5147 >> 7) + var6;
                            var4.field5159[0] = (var4.field5168 >> 7) + var7;
                            class160.field2592[class298.field4849].method811(var4.field5147 >> 7, var4.method1457(0), var4.field5168 >> 7, var4.method1457(0), 0, (byte) -44, false);
                            if (var4.field5104[0] >= 0 && var4.field5104[0] <= (104 - var4.method1457(arg0 + 1)) && var4.field5159[0] >= 0 && var4.field5159[0] <= (104 - var4.method1457(~arg0)) && class160.field2592[class298.field4849].method824(var4.field5168 >> 7, 1, var4.field5147 >> 7, var4.field5159[0], var4.field5104[0])) {
                                if (var4.method1457(arg0 + 1) > 1) {
                                    for (int var8 = var4.field5104[0]; var8 < (var4.field5104[0] + var4.method1457(0)); var8++) {
                                        for (int var9 = var4.field5159[0]; (var4.field5159[0] + var4.method1457(0)) > var9; var9++) {
                                            if ((class160.field2592[class298.field4849].field1828[var8][var9] & var2) != 0) {
                                                continue label194;
                                            }
                                        }
                                    }
                                }
                                var4.field5171 = 1;
                            }
                        }
                    }
                    class176.method1269(2047, var4);
                    class101.method779(true, var4);
                    class108.method819(19660, var4);
                    class160.field2592[class298.field4849].method810(arg0 + 27205, false, var4.field5147 >> 7, var4.method1457(0), var4.method1457(0), var4.field5168 >> 7);
                }
            }
        }
        if (!class99.field1675) {
            class154.method1115(0);
        } else if (class12.field164 == 0 && class211.field3490 == 0) {
            if (class217.field3565 == 2) {
                class161.method1135(-1);
            } else {
                class40.method305(95);
            }
            if (class192.field3177 >> 7 < 14 || class192.field3177 >> 7 >= 90 || class167.field2725 >> 7 < 14 || (class167.field2725 >> 7) >= 90) {
                class82.method603((byte) 127);
            }
        }
        while (true) {
            class157 var10;
            class301 var11;
            class301 var12;
            do {
                var10 = (class157) class10.field131.method1574(-39);
                if (var10 == null) {
                    while (true) {
                        class157 var13;
                        class301 var14;
                        class301 var15;
                        do {
                            var13 = (class157) class148.field2393.method1574(19);
                            if (var13 == null) {
                                while (true) {
                                    class157 var16;
                                    class301 var17;
                                    class301 var18;
                                    do {
                                        var16 = (class157) class225.field3702.method1574(-104);
                                        if (var16 == null) {
                                            if (class233.field3851 != null) {
                                                class38.method295(-1);
                                            }
                                            if (class152.field2460 != null && class152.field2460.field4125 == 1) {
                                                if (class152.field2460.field4123 != null) {
                                                    class119.method896(class108.field1851, arg0 - 27, class145.field2352);
                                                }
                                                class152.field2460 = null;
                                                class108.field1851 = false;
                                                class145.field2352 = null;
                                            }
                                            if (class319.field5393 % 1500 == 0) {
                                                class188.method1316(arg0 - 2);
                                            }
                                            return;
                                        }
                                        var17 = var16.field2551;
                                        if (var17.field4987 < 0) {
                                            break;
                                        }
                                        var18 = class206.method1440(var17.field5040, (byte) -68);
                                    } while (var18 == null || var18.field4955 == null || var18.field4955.length <= var17.field4987 || var18.field4955[var17.field4987] != var17);
                                    class177.method1275(var16, -125);
                                }
                            }
                            var14 = var13.field2551;
                            if (var14.field4987 < 0) {
                                break;
                            }
                            var15 = class206.method1440(var14.field5040, (byte) -68);
                        } while (var15 == null || var15.field4955 == null || var15.field4955.length <= var14.field4987 || var15.field4955[var14.field4987] != var14);
                        class177.method1275(var13, arg0 - 66);
                    }
                }
                var11 = var10.field2551;
                if (var11.field4987 < 0) {
                    break;
                }
                var12 = class206.method1440(var11.field5040, (byte) -68);
            } while (var12 == null || var12.field4955 == null || var11.field4987 >= var12.field4955.length || var12.field4955[var11.field4987] != var11);
            class177.method1275(var10, arg0 - 79);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 1382)
    private final void method2167(boolean arg0) {
        field5415++;
        if (class177.field2921.field368 > class138.field2238) {
            if (class312.field5260 == class103.field1764) {
                class103.field1764 = class103.field1754;
            } else {
                class103.field1764 = class312.field5260;
            }
            class97.field1631 = (class177.field2921.field368 * 50 - 50) * 5;
            if (class97.field1631 > 3000) {
                class97.field1631 = 3000;
            }
            if (class177.field2921.field368 >= 2 && class177.field2921.field369 == 6) {
                this.method1846("js5connect_outofdate", (byte) -33);
                class169.field2786 = 1000;
                return;
            }
            if (class177.field2921.field368 >= 4 && class177.field2921.field369 == -1) {
                this.method1846("js5crc", (byte) -33);
                class169.field2786 = 1000;
                return;
            }
            if (class177.field2921.field368 >= 4 && (class169.field2786 == 0 || class169.field2786 == 5)) {
                if (class177.field2921.field369 == 7 || class177.field2921.field369 == 9) {
                    this.method1846("js5connect_full", (byte) -33);
                } else if (class177.field2921.field369 <= 0) {
                    this.method1846("js5io", (byte) -33);
                } else {
                    this.method1846("js5connect", (byte) -33);
                }
                class169.field2786 = 1000;
                return;
            }
        }
        class138.field2238 = class177.field2921.field368;
        if (arg0) {
            field5429 = (class229) null;
        }
        if (class97.field1631 > 0) {
            class97.field1631--;
            return;
        }
        try {
            if (class290.field4759 == 0) {
                class313.field5316 = class249.field4143.method683(class103.field1764, 0, class312.field5261);
                class290.field4759++;
            }
            if (class290.field4759 == 1) {
                if (class313.field5316.field4125 == 2) {
                    this.method2173(0, 1000);
                    return;
                }
                if (class313.field5316.field4125 == 1) {
                    class290.field4759++;
                }
            }
            if (class290.field4759 == 2) {
                class74.field1247 = new class67((Socket) class313.field5316.field4123, class249.field4143);
                class164 var2 = new class164(5);
                var2.method1188(-101, 15);
                var2.method1168(525, (byte) -124);
                class74.field1247.method527(var2.field2668, 20737, 5, 0);
                class290.field4759++;
                class303.field5073 = class130.method935(false);
            }
            if (class290.field4759 == 3) {
                if (class169.field2786 == 0 || class169.field2786 == 5 || class74.field1247.method525(false) > 0) {
                    int var3 = class74.field1247.method529(-27959);
                    if (var3 != 0) {
                        this.method2173(0, var3);
                        return;
                    }
                    class290.field4759++;
                } else if ((class130.method935(arg0) - class303.field5073) > 30000L) {
                    this.method2173(0, 1001);
                    return;
                }
            }
            if (class290.field4759 == 4) {
                boolean var4 = class169.field2786 == 5 || class169.field2786 == 10 || class169.field2786 == 28;
                class177.field2921.method173(class74.field1247, 0, !var4);
                class313.field5316 = null;
                class290.field4759 = 0;
                class74.field1247 = null;
            }
        } catch (IOException var6) {
            this.method2173(0, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lri;)I", line = 1536)
    public static final int method2168(class301 arg0) {
        class295 var1 = (class295) class324.field5529.method713(3365, ((long) arg0.field4948 << 32) + (long) arg0.field4987);
        return var1 == null ? arg0.field4900 : var1.field4829;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1548)
    public final void method1845(int arg0) {
        method2170(-11);
        class229.method1600(124);
        field5421++;
        class194.method1356();
        class174.method1261(true);
        class70.method548(-127);
        class275.method1903(false);
        class235.method1665(false);
        class61.method413(128);
        class265.method1850(true);
        class99.method742();
        class33.method279(109);
        class314.method2134(-3102);
        class141.method1012(116);
        class240.method1691(1);
        class164.method1156(false);
        class67.method528(75);
        class26.method163((byte) 64);
        class111.method847((byte) 74);
        class85.method632((byte) -95);
        class237.method1678(true);
        class66.method515(-51);
        class1.method8(-80);
        class250.method1755((byte) -75);
        class202.method1417((byte) 114);
        class217.method1522(true);
        class6.method33(3183);
        class108.method816(false);
        class301.method2033(false);
        class77.method579(-2);
        class209.method1458(Integer.MIN_VALUE);
        class227.method1576((byte) 67);
        class97.method714((byte) -49);
        class277.method1910((byte) -37);
        class142.method1020(-3500);
        class186.method1305(-87);
        class293.method1994(9);
        class63.method446((byte) -34);
        class89.method670(25021);
        class303.method2048(-65);
        class136.method962(1501);
        class312.method2109(77);
        class306.method2069(true);
        class72.method560(17548);
        class218.method1524((byte) 0);
        class313.method2121(false);
        class48.method341(-111);
        class80.method597(0);
        class219.method1534(false);
        class114.method868(-1817);
        class105.method804(-489382426);
        class315.method2136(-112);
        class50.method353(16);
        class308.method2077(-1);
        class307.method2073(-128);
        class30.method236((byte) -104);
        class319.method2157(3);
        class138.method994((byte) -22);
        class330.method2263((byte) -99);
        class196.method1384((byte) 67);
        class124.method918(-116);
        class43.method325(126);
        class243.method1697(-8);
        class224.method1559(-15180);
        class8.method54(128);
        class236.method1668(255);
        class83.method620(29582);
        class215.method1518(false);
        class321.method2179(0);
        class117.method888();
        class12.method77((byte) -74);
        class28.method200();
        class58.method389((byte) 106);
        class322.method2188();
        class191.method1340(-125);
        class246.method1725();
        class203.method1423((byte) -92);
        class253.method1771(-111);
        class296.method2002(4);
        class40.method303(683336428);
        class274.method1898();
        class68.method537(2);
        class252.method1766(-49);
        class165.method1214(-125);
        class220.method1537((byte) 114);
        class31.method264();
        class208.method1450(-92);
        class120.method898(0);
        class23.method139();
        class225.method1563((byte) 122);
        class184.method1297((byte) 15);
        class170.method1241(-102);
        class283.method1948();
        class62.method430();
        class195.method1377(-126);
        class7.method49((byte) 123);
        class107.method809((byte) -21);
        class51.method359(true);
        class268.method1864(80);
        class210.method1468();
        class328.method2250(23920);
        class271.method1881((byte) 28);
        class102.method783(128);
        class29.method226(-1570);
        class143.method1024(50);
        class282.method1940(true);
        class248.method1744(-83);
        class324.method2220(true);
        class153.method1106(197);
        class103.method789(0);
        class118.method891(false);
        class18.method113(-127);
        class145.method1071(false);
        class269.method1865(false);
        class156.method1123((byte) 125);
        class71.method556((byte) -21);
        class116.method877(66);
        class221.method1542(-26113);
        class260.method1811((byte) 105);
        class44.method328(1);
        class25.method162((byte) 116);
        class17.method98(127);
        class54.method372(-100);
        class289.method1980((byte) -42);
        class310.method2089();
        class60.method408(83);
        class115.method871((byte) 49);
        class38.method294(102);
        class93.method697(9);
        class134.method951(1);
        class180.method1285(false);
        class9.method58();
        class276.method1908(4);
        class16.method89(-1);
        class166.method1218((byte) 99);
        class157.method1128((byte) -104);
        class216.method1520(-20763);
        class139.method1001(88);
        class168.method1232(6589);
        class264.method1837();
        class152.method1105((byte) 43);
        class149.method1088(1);
        class207.method1444(1);
        class88.method658(17825);
        class162.method1142(-5483);
        class101.method774(false);
        class98.method724((byte) -79);
        class158.method1129();
        class192.method1348(0);
        class298.method2009(-66820688);
        class193.method1352(6463);
        class173.method1248((byte) 25);
        class46.method336();
        class5.method28(-116);
        class137.method990();
        class79.method593();
        class15.method87((byte) 48);
        class183.method1295(1871936072);
        class266.method1859(-76);
        class281.method1930(-123);
        class285.method1961(false);
        class332.method2273(4);
        class206.method1441((byte) -120);
        class189.method1322((byte) 80);
        class317.method2143(0);
        class34.method280();
        class36.method289(5903);
        class226.method1570(-31944);
        class212.method1500();
        class84.method622(true);
        class78.method585(false);
        class251.method1759(30140);
        class256.method1785(0);
        class45.method335(0);
        class295.method1999(117);
        class154.method1114(-32768);
        class27.method187(-117);
        class4.method21(55);
        class200.method1405((byte) -108);
        class302.method2037(5088);
        class279.method1917(-113);
        class239.method1684((byte) 109);
        class160.method1133(4);
        class74.method569(25400);
        class187.method1312(false);
        class178.method1277((byte) 97);
        class112.method854(7293);
        class244.method1700((byte) 101);
        class119.method895((byte) 42);
        class288.method1975(-13295);
        class39.method301((byte) 28);
        if (arg0 <= 90) {
            field5417 = (class229) null;
        }
        class300.method2014((byte) 1);
        class49.method347();
        class82.method604(-546665888);
        class254.method1775(13);
        class155.method1121(0);
        class179.method1281(124);
        class24.method152(1);
        class245.method1705(127);
        class55.method379();
        class163.method1148();
        class292.method1990();
        class222.method1553(false);
        class233.method1656((byte) 115);
        class13.method78();
        class261.method1819();
        class148.method1082((byte) -112);
        class126.method929(false);
        class150.method1096();
        class21.method125();
        class262.method1822(false);
        class211.method1487((byte) -54);
        class59.method396(-15585);
        class204.method1431(85);
        class259.method1802(true);
        class57.method384(false);
        class316.method2140((byte) 121);
        class228.method1593(1);
        class133.method948((byte) 65);
        class65.method485(0);
        class100.method772(82);
        class326.method2233(true);
        class22.method131(1);
        class53.method361(false);
        class263.method1827(-11870);
        class185.method1301(-257);
        class272.method1885((byte) 126);
        class121.method901(121);
        class234.method1660((byte) -108);
        class10.method69((byte) 110);
        class294.method1996(21609);
        class232.method1651((byte) 119);
        class241.method1692(-51);
        class167.method1221(829444428);
        class238.method1682((byte) 11);
        class287.method1973((byte) 18);
        class19.method118((byte) 18);
        class290.method1986(31621);
        class135.method955((byte) -119);
        class175.method1262((byte) -103);
        class325.method2226(3);
        class52.method360((byte) 60);
        class122.method909(-117);
        class304.method2051(false);
        class329.method2255((byte) -75);
        class171.method1242((byte) -124);
        class181.method1289(-88);
        class132.method941(4096);
        class131.method937((byte) -10);
        class75.method573(0);
        class147.method1078((byte) -22);
        class213.method1507(true);
        class94.method700(-112);
        class95.method705(false);
        class176.method1266(4);
        class257.method1788((byte) 94);
        class113.method859(-1837);
        class177.method1276((byte) 95);
        class190.method1327((byte) -117);
        class320.method2161(false);
        class255.method1776(65280);
        class146.method1076(-1);
        class280.method1924(-3270);
        class169.method1237(104);
        class69.method540((byte) -52);
        class188.method1318((byte) -10);
        class323.method2218((byte) -107);
        class230.method1649((byte) 103);
        class76.method577(114);
        class331.method2265(-55);
        class37.method292(-126);
        class201.method1412(255);
        class123.method915(2301);
        class110.method835(38);
        class249.method1748((byte) 15);
        class161.method1138((byte) 29);
        class311.method2103(-107);
        class205.method1437(-126);
        class223.method1555(-90);
        class198.method1389((byte) 84);
        class214.method1515(17887);
        class273.method1888((byte) -107);
        class299.method2010(82);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lri;IIIIIII)V", line = 1876)
    public static final void method2169(class301[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class301 var9 = arg0[var8];
            if (var9 != null && var9.field5040 == arg1 && (!var9.field5043 || var9.field4920 == 0 || var9.field4921 || method2168(var9) != 0 || class126.field2098 == var9 || var9.field4996 == 1338) && (!var9.field5043 || !method2171(var9))) {
                int var10 = var9.field5049 + arg6;
                int var11 = var9.field4991 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field4920 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field4923 + var10;
                    int var17 = var9.field4882 + var11;
                    if (var9.field4920 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class233.field3851 == var9) {
                    class289.field4738 = true;
                    class239.field3950 = var10;
                    class76.field1277 = var11;
                }
                if (!var9.field5043 || var12 < var14 && var13 < var15) {
                    if (var9.field4920 == 0) {
                        if (!var9.field5043 && method2171(var9) && class181.field2967 != var9) {
                            continue;
                        }
                        if (var9.field4935 && class118.field1985 >= var12 && class220.field3617 >= var13 && class118.field1985 < var14 && class220.field3617 < var15) {
                            for (class157 var18 = (class157) class225.field3702.method1580((byte) -39); var18 != null; var18 = (class157) class225.field3702.method1579((byte) 28)) {
                                if (var18.field2558) {
                                    var18.method598(53);
                                    var18.field2551.field4940 = false;
                                }
                            }
                            if (class302.field5058 == 0) {
                                class233.field3851 = null;
                                class126.field2098 = null;
                            }
                            class280.field4642 = false;
                        }
                    }
                    if (var9.field5043) {
                        boolean var19;
                        if (class118.field1985 >= var12 && class220.field3617 >= var13 && class118.field1985 < var14 && class220.field3617 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class273.field4575 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class209.field3459 == 1 && class48.field697 >= var12 && class220.field3613 >= var13 && class48.field697 < var14 && class220.field3613 < var15) {
                            var21 = true;
                        }
                        if (class214.field3534 > 0 && var9.field4892 != null) {
                            for (int var22 = 0; var22 < var9.field4892.length; var22++) {
                                for (int var23 = 0; var23 < class214.field3534; var23++) {
                                    int var24 = var9.field4892[var22] & 0xFF;
                                    if (class275.field4593[var23] == var24) {
                                        if (var9.field4962 != null) {
                                            byte var25 = var9.field4962[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !class94.field1583[86] || (var25 & 0x1) != 0 && !class94.field1583[82] || (var25 & 0x4) != 0 && !class94.field1583[81])) {
                                                continue;
                                            }
                                        }
                                        class285.method1963(class134.field2172, var9.field4948, (byte) 6, var22 + 1, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class213.method1508(0, class48.field697 - var10, var9, class220.field3613 - var11);
                        }
                        if (class233.field3851 != null && class233.field3851 != var9 && var19 && class132.method939(method2168(var9), (byte) 103)) {
                            class29.field477 = var9;
                        }
                        if (class126.field2098 == var9) {
                            class44.field679 = true;
                            class107.field1815 = var10;
                            class58.field817 = var11;
                        }
                        if (var9.field4921 || var9.field4996 != 0) {
                            if (var19 && class76.field1271 != 0 && var9.field5003 != null) {
                                class157 var26 = new class157();
                                var26.field2558 = true;
                                var26.field2551 = var9;
                                var26.field2553 = class76.field1271;
                                var26.field2552 = var9.field5003;
                                class225.field3702.method1582(var26, 4);
                            }
                            if (class233.field3851 != null || class253.field4234 != null || class186.field3027 || var9.field4996 != 1400 && class280.field4642) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field4996 != 0) {
                                if (var9.field4996 == 1337) {
                                    class52.field742 = var9;
                                    class296.method2006(var9, 121);
                                    continue;
                                }
                                if (var9.field4996 == 1338) {
                                    if (var21) {
                                        class224.field3683 = class48.field697 - var10;
                                        class176.field2891 = class220.field3613 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field4996 == 1400) {
                                    class320.field5407 = var9;
                                    if (var21) {
                                        if (class94.field1583[82] && class27.field378 > 0) {
                                            int var27 = (int) ((double) (class48.field697 - var10 - var9.field4923 / 2) * 2.0D / (double) class95.field1604);
                                            int var28 = (int) ((double) (class220.field3613 - var11 - var9.field4882 / 2) * 2.0D / (double) class95.field1604);
                                            int var29 = class103.field1767 + var27;
                                            int var30 = class324.field5534 + var28;
                                            int var31 = class54.field786 + var29;
                                            int var32 = class214.field3537 + class266.field4487 - var30 - 1;
                                            class257.method1789(0, 0, var32, var31);
                                            class306.method2068(10606);
                                            continue;
                                        }
                                        class280.field4642 = true;
                                        class138.field2235 = class118.field1985;
                                        class105.field1790 = class220.field3617;
                                        class71.field1194 = class103.field1767;
                                        class177.field2924 = class324.field5534;
                                        continue;
                                    }
                                    if (var20 && class280.field4642) {
                                        class295.method2000((int) ((double) (class138.field2235 - class118.field1985) * 2.0D / (double) class263.field4394) + class71.field1194, -14009);
                                        class141.method1015((int) ((double) (class105.field1790 - class220.field3617) * 2.0D / (double) class263.field4394) + class177.field2924, (byte) -125);
                                        continue;
                                    }
                                    class280.field4642 = false;
                                    continue;
                                }
                                if (var9.field4996 == 1401) {
                                    if (var20) {
                                        class262.method1820(var9.field4882, var9.field4923, -115, class220.field3617 - var11, class118.field1985 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field4996 == 1402) {
                                    if (!class99.field1675) {
                                        class296.method2006(var9, 120);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5024 && var21) {
                                var9.field5024 = true;
                                if (var9.field4890 != null) {
                                    class157 var33 = new class157();
                                    var33.field2558 = true;
                                    var33.field2551 = var9;
                                    var33.field2554 = class48.field697 - var10;
                                    var33.field2553 = class220.field3613 - var11;
                                    var33.field2552 = var9.field4890;
                                    class225.field3702.method1582(var33, 4);
                                }
                            }
                            if (var9.field5024 && var20 && var9.field4972 != null) {
                                class157 var34 = new class157();
                                var34.field2558 = true;
                                var34.field2551 = var9;
                                var34.field2554 = class118.field1985 - var10;
                                var34.field2553 = class220.field3617 - var11;
                                var34.field2552 = var9.field4972;
                                class225.field3702.method1582(var34, 4);
                            }
                            if (var9.field5024 && !var20) {
                                var9.field5024 = false;
                                if (var9.field4938 != null) {
                                    class157 var35 = new class157();
                                    var35.field2558 = true;
                                    var35.field2551 = var9;
                                    var35.field2554 = class118.field1985 - var10;
                                    var35.field2553 = class220.field3617 - var11;
                                    var35.field2552 = var9.field4938;
                                    class148.field2393.method1582(var35, 4);
                                }
                            }
                            if (var20 && var9.field5031 != null) {
                                class157 var36 = new class157();
                                var36.field2558 = true;
                                var36.field2551 = var9;
                                var36.field2554 = class118.field1985 - var10;
                                var36.field2553 = class220.field3617 - var11;
                                var36.field2552 = var9.field5031;
                                class225.field3702.method1582(var36, 4);
                            }
                            if (!var9.field4940 && var19) {
                                var9.field4940 = true;
                                if (var9.field5038 != null) {
                                    class157 var37 = new class157();
                                    var37.field2558 = true;
                                    var37.field2551 = var9;
                                    var37.field2554 = class118.field1985 - var10;
                                    var37.field2553 = class220.field3617 - var11;
                                    var37.field2552 = var9.field5038;
                                    class225.field3702.method1582(var37, 4);
                                }
                            }
                            if (var9.field4940 && var19 && var9.field5045 != null) {
                                class157 var38 = new class157();
                                var38.field2558 = true;
                                var38.field2551 = var9;
                                var38.field2554 = class118.field1985 - var10;
                                var38.field2553 = class220.field3617 - var11;
                                var38.field2552 = var9.field5045;
                                class225.field3702.method1582(var38, 4);
                            }
                            if (var9.field4940 && !var19) {
                                var9.field4940 = false;
                                if (var9.field4998 != null) {
                                    class157 var39 = new class157();
                                    var39.field2558 = true;
                                    var39.field2551 = var9;
                                    var39.field2554 = class118.field1985 - var10;
                                    var39.field2553 = class220.field3617 - var11;
                                    var39.field2552 = var9.field4998;
                                    class148.field2393.method1582(var39, 4);
                                }
                            }
                            if (var9.field4905 != null) {
                                class157 var40 = new class157();
                                var40.field2551 = var9;
                                var40.field2552 = var9.field4905;
                                class10.field131.method1582(var40, 4);
                            }
                            if (var9.field4884 != null && class50.field720 > var9.field4952) {
                                if (var9.field4930 == null || class50.field720 - var9.field4952 > 32) {
                                    class157 var45 = new class157();
                                    var45.field2551 = var9;
                                    var45.field2552 = var9.field4884;
                                    class225.field3702.method1582(var45, 4);
                                } else {
                                    label548: for (int var41 = var9.field4952; var41 < class50.field720; var41++) {
                                        int var42 = class135.field2191[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field4930.length; var43++) {
                                            if (var9.field4930[var43] == var42) {
                                                class157 var44 = new class157();
                                                var44.field2551 = var9;
                                                var44.field2552 = var9.field4884;
                                                class225.field3702.method1582(var44, 4);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field4952 = class50.field720;
                            }
                            if (var9.field5022 != null && class53.field751 > var9.field4879) {
                                if (var9.field5042 == null || class53.field751 - var9.field4879 > 32) {
                                    class157 var50 = new class157();
                                    var50.field2551 = var9;
                                    var50.field2552 = var9.field5022;
                                    class225.field3702.method1582(var50, 4);
                                } else {
                                    label524: for (int var46 = var9.field4879; var46 < class53.field751; var46++) {
                                        int var47 = class266.field4481[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field5042.length; var48++) {
                                            if (var9.field5042[var48] == var47) {
                                                class157 var49 = new class157();
                                                var49.field2551 = var9;
                                                var49.field2552 = var9.field5022;
                                                class225.field3702.method1582(var49, 4);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field4879 = class53.field751;
                            }
                            if (var9.field5001 != null && class238.field3937 > var9.field4936) {
                                if (var9.field4947 == null || class238.field3937 - var9.field4936 > 32) {
                                    class157 var55 = new class157();
                                    var55.field2551 = var9;
                                    var55.field2552 = var9.field5001;
                                    class225.field3702.method1582(var55, 4);
                                } else {
                                    label500: for (int var51 = var9.field4936; var51 < class238.field3937; var51++) {
                                        int var52 = class288.field4726[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field4947.length; var53++) {
                                            if (var9.field4947[var53] == var52) {
                                                class157 var54 = new class157();
                                                var54.field2551 = var9;
                                                var54.field2552 = var9.field5001;
                                                class225.field3702.method1582(var54, 4);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field4936 = class238.field3937;
                            }
                            if (var9.field4878 != null && class313.field5315 > var9.field5041) {
                                if (var9.field4953 == null || class313.field5315 - var9.field5041 > 32) {
                                    class157 var60 = new class157();
                                    var60.field2551 = var9;
                                    var60.field2552 = var9.field4878;
                                    class225.field3702.method1582(var60, 4);
                                } else {
                                    label476: for (int var56 = var9.field5041; var56 < class313.field5315; var56++) {
                                        int var57 = class312.field5255[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field4953.length; var58++) {
                                            if (var9.field4953[var58] == var57) {
                                                class157 var59 = new class157();
                                                var59.field2551 = var9;
                                                var59.field2552 = var9.field4878;
                                                class225.field3702.method1582(var59, 4);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field5041 = class313.field5315;
                            }
                            if (var9.field4942 != null && class232.field3844 > var9.field5005) {
                                if (var9.field5018 == null || class232.field3844 - var9.field5005 > 32) {
                                    class157 var65 = new class157();
                                    var65.field2551 = var9;
                                    var65.field2552 = var9.field4942;
                                    class225.field3702.method1582(var65, 4);
                                } else {
                                    label452: for (int var61 = var9.field5005; var61 < class232.field3844; var61++) {
                                        int var62 = class307.field5184[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field5018.length; var63++) {
                                            if (var9.field5018[var63] == var62) {
                                                class157 var64 = new class157();
                                                var64.field2551 = var9;
                                                var64.field2552 = var9.field4942;
                                                class225.field3702.method1582(var64, 4);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field5005 = class232.field3844;
                            }
                            if (class248.field4129 > var9.field4988 && var9.field4961 != null) {
                                class157 var66 = new class157();
                                var66.field2551 = var9;
                                var66.field2552 = var9.field4961;
                                class225.field3702.method1582(var66, 4);
                            }
                            if (class198.field3295 > var9.field4988 && var9.field4949 != null) {
                                class157 var67 = new class157();
                                var67.field2551 = var9;
                                var67.field2552 = var9.field4949;
                                class225.field3702.method1582(var67, 4);
                            }
                            if (class171.field2817 > var9.field4988 && var9.field4954 != null) {
                                class157 var68 = new class157();
                                var68.field2551 = var9;
                                var68.field2552 = var9.field4954;
                                class225.field3702.method1582(var68, 4);
                            }
                            if (class279.field4625 > var9.field4988 && var9.field4893 != null) {
                                class157 var69 = new class157();
                                var69.field2551 = var9;
                                var69.field2552 = var9.field4893;
                                class225.field3702.method1582(var69, 4);
                            }
                            if (class116.field1964 > var9.field4988 && var9.field4985 != null) {
                                class157 var70 = new class157();
                                var70.field2551 = var9;
                                var70.field2552 = var9.field4985;
                                class225.field3702.method1582(var70, 4);
                            }
                            var9.field4988 = class129.field2125;
                            if (var9.field4889 != null) {
                                for (int var71 = 0; var71 < class214.field3534; var71++) {
                                    class157 var72 = new class157();
                                    var72.field2551 = var9;
                                    var72.field2556 = class275.field4593[var71];
                                    var72.field2545 = class185.field2997[var71];
                                    var72.field2552 = var9.field4889;
                                    class225.field3702.method1582(var72, 4);
                                }
                            }
                            if (class132.field2149 && var9.field4946 != null) {
                                class157 var73 = new class157();
                                var73.field2551 = var9;
                                var73.field2552 = var9.field4946;
                                class225.field3702.method1582(var73, 4);
                            }
                        }
                    }
                    if (!var9.field5043 && class233.field3851 == null && class253.field4234 == null && !class186.field3027) {
                        if ((var9.field4970 >= 0 || var9.field5023 != 0) && class118.field1985 >= var12 && class220.field3617 >= var13 && class118.field1985 < var14 && class220.field3617 < var15) {
                            if (var9.field4970 >= 0) {
                                class181.field2967 = arg0[var9.field4970];
                            } else {
                                class181.field2967 = var9;
                            }
                        }
                        if (var9.field4920 == 8 && class118.field1985 >= var12 && class220.field3617 >= var13 && class118.field1985 < var14 && class220.field3617 < var15) {
                            class254.field4247 = var9;
                        }
                        if (var9.field4877 > var9.field4882) {
                            class44.method329(var9.field4877, var9.field4923 + var10, var9.field4882, class118.field1985, class220.field3617, -8, var9, var11);
                        }
                    }
                    if (var9.field4920 == 0) {
                        method2169(arg0, var9.field4948, var12, var13, var14, var15, var10 - var9.field4937, var11 - var9.field4897);
                        if (var9.field4955 != null) {
                            method2169(var9.field4955, var9.field4948, var12, var13, var14, var15, var10 - var9.field4937, var11 - var9.field4897);
                        }
                        class48 var74 = (class48) class251.field4176.method713(3365, (long) var9.field4948);
                        if (var74 != null) {
                            class179.method1280(var11, var13, var74.field700, -116, var15, var10, var14, var12);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 2626)
    public final void method1856(int arg0) {
        class269.method1866(106);
        field5416++;
        class149.field2406 = new class111();
        class177.field2921 = new class26();
        if (class218.field3586 != 0) {
            class233.field3849 = new byte[50][];
        }
        class8.method53(class249.field4143, (byte) 122);
        if (class112.field1900 == 0) {
            class147.field2376 = this.getCodeBase().getHost();
            class196.field3276 = 443;
            class148.field2387 = 43594;
        } else if (class112.field1900 == 1) {
            class147.field2376 = this.getCodeBase().getHost();
            class148.field2387 = class223.field3673 + 40000;
            class196.field3276 = class223.field3673 + 50000;
        } else if (class112.field1900 == 2) {
            class196.field3276 = class223.field3673 + 50000;
            class148.field2387 = class223.field3673 + 40000;
            class147.field2376 = "127.0.0.1";
        }
        if (arg0 != 28) {
            field5430 = -39;
        }
        if (class92.field1562 == 3 && class112.field1900 != 2) {
            class209.field3457 = class223.field3673;
        }
        class312.field5261 = class147.field2376;
        class103.field1754 = class196.field3276;
        class313.field5273 = class148.field2387;
        class103.field1764 = class313.field5273;
        class183.field2975 = class19.field262 = class94.field1584 = class153.field2500 = new short[256];
        class312.field5260 = class148.field2387;
        if (class166.field2710 == 1) {
            class240.field3971 = class71.field1196;
            class25.field336 = true;
            class244.field4027 = class15.field181;
            class117.field1974 = 16777215;
            class117.field1970 = 0;
            class220.field3618 = class306.field5128;
            class102.field1746 = class141.field2281;
        } else {
            class220.field3618 = class321.field5443;
            class240.field3971 = class116.field1962;
            class244.field4027 = class308.field5196;
            class102.field1746 = class58.field827;
        }
        class223.method1557((byte) 126);
        class6.method32(-15012, class214.field3526);
        class122.method913(class214.field3526, (byte) -75);
        class4.field47 = class139.method998(true);
        if (class4.field47 != null) {
            class4.field47.method1400(class214.field3526, -1);
        }
        class19.field257 = class92.field1562;
        try {
            if (class249.field4143.field1558 != null) {
                class313.field5326 = new class1(class249.field4143.field1558, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class74.field1249[var2] = new class1(class249.field4143.field1547[var2], 6000, 0);
                }
                class17.field205 = new class1(class249.field4143.field1560, 6000, 0);
                class164.field2692 = new class250(255, class313.field5326, class17.field205, 500000);
                class102.field1738 = new class1(class249.field4143.field1556, 24, 0);
                class249.field4143.field1547 = null;
                class249.field4143.field1558 = null;
                class249.field4143.field1560 = null;
                class249.field4143.field1556 = null;
            }
        } catch (IOException var4) {
            class102.field1738 = null;
            class17.field205 = null;
            class313.field5326 = null;
            class164.field2692 = null;
        }
        class239.field3947 = class51.field733;
        if (class112.field1900 != 0) {
            class54.field785 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2748)
    public static void method2170(int arg0) {
        if (arg0 != -11) {
            field5428 = (class229) null;
        }
        field5428 = null;
        field5429 = null;
        field5418 = null;
        field5420 = null;
        field5417 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lri;)Z", line = 2762)
    public static final boolean method2171(class301 arg0) {
        if (class40.field647) {
            if (method2168(arg0) != 0) {
                return false;
            }
            if (arg0.field4920 == 0) {
                return false;
            }
        }
        return arg0.field4990;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lri;)Lri;", line = 2782)
    public static final class301 method2172(class301 arg0) {
        int var1 = class308.method2078(method2168(arg0), 1895919);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class206.method1440(arg0.field5040, (byte) -68);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2803)
    private final void method2173(int arg0, int arg1) {
        class290.field4759 = arg0;
        class74.field1247 = null;
        class177.field2921.field368++;
        class177.field2921.field369 = arg1;
        field5426++;
        class313.field5316 = null;
    }
}
