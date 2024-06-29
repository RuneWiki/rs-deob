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
public class client extends class14 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4853 = 0;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field4862 = false;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public static final void method2026(int arg0, byte arg1) {
        class182.field2764.method943(arg0, true);
        field4851++;
        if (arg1 < 8) {
            field4853 = -40;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)V")
    private final void method2027(int arg0, byte arg1) {
        class104.field1498.field2522++;
        if (arg1 < 30) {
            return;
        }
        class8.field91 = null;
        class104.field1498.field2520 = arg0;
        class276.field4387 = 0;
        class57.field794 = null;
        field4861++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method85(byte arg0) {
        field4850++;
        if (class142.field1961 == 1000) {
            return;
        }
        class35.field533++;
        if ((class35.field533 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class288.field4611 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class272.field4341.setSeed((long) class288.field4611);
        }
        this.method2030((byte) 104);
        if (class129.field1794 != null) {
            class129.field1794.method1472(false);
        }
        class267.method1753(-3);
        class8.method45(4087);
        if (arg0 <= 32) {
            field4853 = -20;
        }
        class227.method1506(91);
        class69.method454((byte) 39);
        if (class3.field23 != null) {
            int var3 = class3.field23.method296(-1);
            class157.field2161 = var3;
        }
        if (class142.field1961 == 0) {
            this.method2031(0);
            class251.method1632((byte) 124);
        } else if (class142.field1961 == 5) {
            this.method2031(0);
            class251.method1632((byte) 73);
        } else if (class142.field1961 == 25 || class142.field1961 == 28) {
            class60.method379((byte) 115);
        }
        if (class142.field1961 == 10) {
            this.method2042(81);
            class198.method1249(0);
            class150.method946(1500);
            class170.method1083(-8);
        } else if (class142.field1961 == 30) {
            class221.method1447(-20976);
        } else if (class142.field1961 == 40) {
            class170.method1083(-8);
            if (class174.field2457 != -3) {
                if (class174.field2457 == 15) {
                    class309.method2099(true);
                    return;
                }
                if (class174.field2457 != 2) {
                    class248.method1621(0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field4848++;
        if (!this.method100((byte) 127)) {
            return;
        }
        class177.field2491 = Integer.parseInt(this.getParameter("worldid"));
        class241.field3789 = Integer.parseInt(this.getParameter("modewhere"));
        if (class241.field3789 < 0 || class241.field3789 > 1) {
            class241.field3789 = 0;
        }
        class292.field4657 = Integer.parseInt(this.getParameter("modewhat"));
        if (class292.field4657 < 0 || class292.field4657 > 2) {
            class292.field4657 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class200.field3042 = true;
        } else {
            class200.field3042 = false;
        }
        try {
            class129.field1799 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class129.field1799 = 0;
        }
        class267.method1754(class129.field1799, (byte) 115);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class72.field1036 = true;
        } else {
            class72.field1036 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class48.field695 = true;
        } else {
            class48.field695 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class188.field2856 = 1;
        } else {
            class188.field2856 = 0;
        }
        try {
            class148.field2026 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class148.field2026 = 0;
        }
        class258.field4165 = this.getParameter("settings");
        if (class258.field4165 == null) {
            class258.field4165 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class280.field4454 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class280.field4454 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class228.field3574 = true;
        } else {
            class228.field3574 = false;
        }
        class70.field1023 = this;
        this.method93(765, -1, 551, 503, class292.field4657 + 32);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method95(int arg0) {
        field4855++;
        if (arg0 != 28) {
            method2033();
        }
        class199.method1255(13325);
        class120.field1720 = new class25();
        class104.field1498 = new class177();
        if (class292.field4657 != 0) {
            class161.field2254 = new byte[50][];
        }
        class216.method1408(class45.field667, (byte) 54);
        if (class241.field3789 == 0) {
            class268.field4299 = this.getCodeBase().getHost();
            class290.field4627 = 443;
            class288.field4600 = 43594;
        } else if (class241.field3789 == 1) {
            class268.field4299 = this.getCodeBase().getHost();
            class288.field4600 = class177.field2491 + 40000;
            class290.field4627 = class177.field2491 + 50000;
        } else if (class241.field3789 == 2) {
            class268.field4299 = "127.0.0.1";
            class290.field4627 = class177.field2491 + 50000;
            class288.field4600 = class177.field2491 + 40000;
        }
        class240.field3748 = class288.field4600;
        if (class188.field2856 == 1) {
            class104.field1503 = class188.field2853;
            class307.field4938 = class207.field3085;
            class192.field2940 = true;
            class221.field3439 = class207.field3082;
            class265.field4264 = class120.field1714;
        } else {
            class265.field4264 = class2.field3;
            class104.field1503 = class251.field3924;
            class221.field3439 = class294.field4689;
            class307.field4938 = class99.field1433;
        }
        class249.field3888 = class290.field4627;
        class144.field1965 = class192.field2939 = class148.field2021 = class7.field84 = new short[256];
        class26.field409 = class268.field4299;
        if (class52.field745 == 3 && class241.field3789 != 2) {
            class211.field3178 = class177.field2491;
        }
        class215.field3259 = class288.field4600;
        class34.field519 = class215.field3259;
        class171.method1092(-24234);
        class36.method249(false, class291.field4645);
        class288.method1928((byte) -99, class291.field4645);
        class3.field23 = class179.method1144(true);
        if (class3.field23 != null) {
            class3.field23.method300(class291.field4645, (byte) -8);
        }
        class83.field1150 = class52.field745;
        try {
            if (class45.field667.field737 != null) {
                class309.field4970 = new class224(class45.field667.field737, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class206.field3079[var2] = new class224(class45.field667.field729[var2], 6000, 0);
                }
                class212.field3199 = new class224(class45.field667.field730, 6000, 0);
                class294.field4687 = new class142(255, class309.field4970, class212.field3199, 500000);
                class78.field1090 = new class224(class45.field667.field735, 24, 0);
                class45.field667.field730 = null;
                class45.field667.field729 = null;
                class45.field667.field737 = null;
                class45.field667.field735 = null;
            }
        } catch (IOException var3) {
            class78.field1090 = null;
            class212.field3199 = null;
            class309.field4970 = null;
            class294.field4687 = null;
        }
        if (class188.field2856 == 0) {
            class290.field4630 = class126.field1779;
        } else if (class188.field2856 == 1) {
            class290.field4630 = class154.field2135;
        }
        if (class241.field3789 != 0) {
            class223.field3481 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lim;)Lhh;")
    public static final class297 method2028(class178 arg0) {
        class297 var1 = (class297) class18.field309.method1453(true, ((long) arg0.field2545 << 32) + (long) arg0.field2576);
        return var1 == null ? arg0.field2702 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method2029() {
        boolean var0 = class288.field4598 && class171.field2437 > 200 || class171.field2437 > 50;
        for (int var1 = 0; var1 < class171.field2437; var1++) {
            class314 var11 = class48.field689[class160.field2235[var1]];
            var11.field4104 = false;
            var11.field4118 = 0;
            var11.field4069 = false;
            if (var11.method1679((byte) -127)) {
                var11.field5039 = var11.field4102 == var11.method1685(0).field1201 ? var0 : false;
                int var12;
                if (var11.field4136) {
                    var11.field4136 = false;
                    var12 = 0;
                } else {
                    var12 = 1;
                }
                if (var11.field4076 > class35.field533) {
                    var12 += 2;
                }
                int var13 = var12 + (5 - var11.method1683(-75) << 2);
                if (class2.field2 == 0) {
                    var13 += 32;
                } else {
                    var13 += 128;
                }
                var13 += 256;
                var11.field4075 = var13 + 1;
            } else {
                var11.field4136 = false;
                var11.field4075 = -1;
            }
        }
        for (int var2 = 0; var2 < class306.field4921; var2++) {
            class310 var7 = class88.field1274[class131.field1834[var2]];
            var7.field4104 = false;
            var7.field4118 = 0;
            var7.field4069 = false;
            if (var7.method1679((byte) -127) && var7.field4993.method1308(32291)) {
                boolean var8 = false;
                int var9;
                if (var7.field4136) {
                    var7.field4136 = false;
                    var9 = 0;
                } else {
                    var9 = 1;
                }
                if (var7.field4076 > class35.field533) {
                    var9 += 2;
                }
                int var10 = var9 + (5 - var7.method1683(-90) << 2);
                if (class2.field2 == 0) {
                    if (var7.field4993.field3147) {
                        var10 += 64;
                    } else {
                        var10 += 128;
                    }
                } else if (class2.field2 == 1) {
                    if (var7.field4993.field3147) {
                        var10 += 32;
                    } else {
                        var10 += 64;
                    }
                }
                if (var7.field4993.field3130) {
                    var10 += 512;
                } else {
                    var10 += 256;
                }
                var7.field4075 = var10 + 1;
            } else {
                var7.field4136 = false;
                var7.field4075 = -1;
            }
        }
        for (int var3 = 0; var3 < class267.field4286.length; var3++) {
            class193 var4 = class267.field4286[var3];
            if (var4 != null) {
                if (var4.field2944 == 1) {
                    class310 var5 = class88.field1274[var4.field2943];
                    if (var5 != null && var5.field4075 != -1) {
                        var5.field4075 += 1024;
                    }
                } else if (var4.field2944 == 10) {
                    class314 var6 = class48.field689[var4.field2943];
                    if (var6 != null && var6.field4075 != -1) {
                        var6.field4075 += 1024;
                    }
                }
            }
        }
        class250.field3905.field4136 = false;
        class250.field3905.field4104 = false;
        class250.field3905.field4118 = 0;
        class250.field3905.field4069 = false;
        class250.field3905.field4075 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method2030(byte arg0) {
        field4849++;
        boolean var2 = class104.field1498.method1110((byte) 102);
        if (!var2) {
            this.method2035(1001);
        }
        int var3 = -31 / ((arg0 + 32) / 56);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method99(byte arg0) {
        field4852++;
        if (class82.field1129 != null) {
            class82.field1129.field466 = false;
        }
        if (arg0 <= 6) {
            field4853 = -58;
        }
        class82.field1129 = null;
        if (class272.field4332 != null) {
            class272.field4332.method1211((byte) -118);
            class272.field4332 = null;
        }
        class90.method587(class291.field4645, true);
        class279.method1811(class291.field4645, 116);
        if (class3.field23 != null) {
            class3.field23.method297(-17721, class291.field4645);
        }
        class30.method188((byte) 111);
        class84.method548(false);
        class3.field23 = null;
        if (class156.field2158 != null) {
            class156.field2158.method867(-77);
        }
        if (class110.field1585 != null) {
            class110.field1585.method867(-54);
        }
        class104.field1498.method1119(-3741);
        class120.field1720.method161(20004);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class271.method1768("argument count", -77);
            }
            class177.field2491 = Integer.parseInt(arg0[0]);
            class241.field3789 = 2;
            if (arg0[1].equals("live")) {
                class292.field4657 = 0;
            } else if (arg0[1].equals("rc")) {
                class292.field4657 = 1;
            } else if (arg0[1].equals("wip")) {
                class292.field4657 = 2;
            } else {
                class271.method1768("modewhat", -78);
            }
            class200.field3042 = false;
            class129.field1799 = class294.method1971((byte) 45, arg0[2]);
            if (class129.field1799 == -1) {
                if (arg0[2].equals("english")) {
                    class129.field1799 = 0;
                } else if (arg0[2].equals("german")) {
                    class129.field1799 = 1;
                } else {
                    class271.method1768("language", -115);
                }
            }
            class267.method1754(class129.field1799, (byte) 64);
            class72.field1036 = false;
            class48.field695 = false;
            if (arg0[3].equals("game0")) {
                class188.field2856 = 0;
            } else if (arg0[3].equals("game1")) {
                class188.field2856 = 1;
            } else {
                class271.method1768("game", 93);
            }
            class148.field2026 = 0;
            class228.field3574 = false;
            class258.field4165 = "";
            class280.field4454 = 0;
            client var1 = new client();
            class70.field1023 = var1;
            var1.method90(class292.field4657 + 32, 551, class188.field2856 == 1 ? "mechscape" : "runescape", 768, 1024, false, false, 29);
            class31.field469.setLocation(40, 40);
        } catch (Exception var3) {
            class121.method780(160, (String) null, var3);
        }
        field4859++;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method94(byte arg0) {
        field4854++;
        if (class142.field1961 == 1000) {
            return;
        }
        long var2 = class105.method671(0) / 1000000L - class111.field1592;
        class111.field1592 = class105.method671(0) / 1000000L;
        boolean var4 = class145.method908(-125);
        if (var4 && class137.field1876 && class156.field2158 != null) {
            class156.field2158.method874(false);
        }
        if ((class142.field1961 == 30 || class142.field1961 == 10) && (class197.field3020 || class178.field2586 != 0L && class178.field2586 < class299.method2006(9594))) {
            class275.method1790(class59.field818, class197.field3020, (byte) 93, class71.field1033, class246.method1611(100));
        }
        if (class43.field653 == null) {
            Container var5;
            if (class43.field653 != null) {
                var5 = class43.field653;
            } else if (class31.field469 == null) {
                var5 = class45.field667.field744;
            } else {
                var5 = class31.field469;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class31.field469 == var5) {
                Insets var8 = class31.field469.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class284.field4553 != var6 || class39.field590 != var7) {
                if (class52.field736.startsWith("mac")) {
                    class39.field590 = var7;
                    class284.field4553 = var6;
                } else {
                    class199.method1255(13325);
                }
                class178.field2586 = class299.method2006(9594) + 500L;
            }
        }
        boolean var9 = false;
        if (class292.field4665) {
            var9 = true;
            class292.field4665 = false;
        }
        if (var9) {
            class256.method1674(arg0 - 84);
        }
        if (class142.field1961 == 0) {
            class205.method1281(class84.field1185, arg0 ^ 0xFFFFFFF4, (Color) null, class311.field5008, var9);
        } else if (class142.field1961 == 5) {
            class275.method1786(arg0 + 1, false, class261.field4201);
        } else if (class142.field1961 == 10) {
            class48.method301((byte) 90);
        } else if (class142.field1961 == 25 || class142.field1961 == 28) {
            if (class14.field231 == 1) {
                if (class139.field1927 < class17.field295) {
                    class139.field1927 = class17.field295;
                }
                int var10 = (class139.field1927 - class17.field295) * 50 / class139.field1927;
                class188.method1188(false, (byte) -14, class294.field4694 + "<br>(" + var10 + "%)");
            } else if (class14.field231 == 2) {
                if (class37.field574 < class39.field586) {
                    class37.field574 = class39.field586;
                }
                int var11 = ((class37.field574 - class39.field586) * 50 / class37.field574) + 50;
                class188.method1188(false, (byte) -14, class294.field4694 + "<br>(" + var11 + "%)");
            } else {
                class188.method1188(false, (byte) -14, class294.field4694);
            }
        } else if (class142.field1961 == 30) {
            class76.method500(false, var2);
        } else if (class142.field1961 == 40) {
            class188.method1188(false, (byte) -14, class38.field578 + "<br>" + class244.field3827);
        }
        if ((class142.field1961 == 30 || class142.field1961 == 10) && class83.field1143 == 0 && !var9) {
            try {
                Graphics var12 = class291.field4645.getGraphics();
                for (int var13 = 0; var13 < class261.field4206; var13++) {
                    if (class30.field459[var13]) {
                        class24.field382.method179(0, class78.field1092[var13], var12, class282.field4496[var13], class112.field1611[var13], class82.field1135[var13]);
                        class30.field459[var13] = false;
                    }
                }
            } catch (Exception var17) {
                class291.field4645.repaint();
            }
        } else if (class142.field1961 != 0) {
            try {
                Graphics var14 = class291.field4645.getGraphics();
                class24.field382.method180(var14, 0, false, 0);
                for (int var15 = 0; var15 < class261.field4206; var15++) {
                    class30.field459[var15] = false;
                }
            } catch (Exception var16) {
                class291.field4645.repaint();
            }
        }
        if (class69.field978) {
            class71.method474(29890);
        }
        if (arg0 != -12) {
            this.method2027(38, (byte) 70);
        }
        if (class223.field3483 && class142.field1961 == 10 && class104.field1499 != -1) {
            class223.field3483 = false;
            class149.method929(class45.field667, -1);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method2031(int arg0) {
        field4858++;
        if (!class223.field3483) {
            label241: while (true) {
                do {
                    if (!class19.method130((byte) 120)) {
                        break label241;
                    }
                } while (class27.field432 != 's' && class27.field432 != 'S');
                class223.field3483 = true;
            }
        }
        if (class141.field1940 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class299.method2006(9594);
            if (class160.field2240 == 0L) {
                class160.field2240 = var4;
            }
            if (var3 > 16384 && var4 - class160.field2240 < 5000L) {
                if ((var4 - class208.field3090) > 1000L) {
                    System.gc();
                    class208.field3090 = var4;
                }
                class84.field1185 = class24.field388;
                class311.field5008 = 5;
            } else {
                class311.field5008 = 5;
                class141.field1940 = 10;
                class84.field1185 = class163.field2313;
            }
        } else if (class141.field1940 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class156.field2153[var6] = new class213(104, 104);
            }
            class141.field1940 = 30;
            class311.field5008 = 10;
            class84.field1185 = class150.field2088;
        } else if (class141.field1940 == 30) {
            if (class129.field1794 == null) {
                class129.field1794 = new class223(class104.field1498, class120.field1720);
            }
            if (class129.field1794.method1464((byte) -51)) {
                class142.field1962 = class314.method2119(0, true, true, (byte) -80, false);
                class186.field2822 = class314.method2119(1, true, true, (byte) -84, false);
                class167.field2382 = class314.method2119(2, true, false, (byte) 57, true);
                class177.field2499 = class314.method2119(3, true, true, (byte) -124, false);
                class68.field958 = class314.method2119(4, true, true, (byte) -112, false);
                class307.field4932 = class314.method2119(5, true, true, (byte) -97, true);
                class240.field3737 = class314.method2119(6, false, true, (byte) -106, true);
                class29.field449 = class314.method2119(7, true, true, (byte) 72, false);
                class311.field5009 = class314.method2119(8, true, true, (byte) -124, false);
                class128.field1787 = class314.method2119(9, true, true, (byte) 58, false);
                class160.field2238 = class314.method2119(10, true, true, (byte) 43, false);
                class242.field3807 = class314.method2119(11, true, true, (byte) 78, false);
                class241.field3783 = class314.method2119(12, true, true, (byte) -109, false);
                class258.field4175 = class314.method2119(13, true, true, (byte) 126, false);
                class7.field74 = class314.method2119(14, false, true, (byte) 89, false);
                class171.field2445 = class314.method2119(15, true, true, (byte) -98, false);
                class110.field1573 = class314.method2119(16, true, true, (byte) 94, false);
                class188.field2855 = class314.method2119(17, true, true, (byte) 64, false);
                class254.field3965 = class314.method2119(18, true, true, (byte) 48, false);
                class179.field2723 = class314.method2119(19, true, true, (byte) 94, false);
                class312.field5022 = class314.method2119(20, true, true, (byte) -105, false);
                class36.field546 = class314.method2119(21, true, true, (byte) -98, false);
                class249.field3892 = class314.method2119(22, true, true, (byte) -113, false);
                class185.field2805 = class314.method2119(23, true, true, (byte) -118, true);
                class142.field1947 = class314.method2119(24, true, true, (byte) 121, false);
                class35.field532 = class314.method2119(25, true, true, (byte) 116, false);
                class278.field4425 = class314.method2119(26, true, true, (byte) -104, true);
                class139.field1924 = class314.method2119(27, true, true, (byte) -100, false);
                class265.field4273 = class314.method2119(28, true, true, (byte) -104, true);
                class141.field1940 = 40;
                class84.field1185 = class12.field200;
                class311.field5008 = 15;
            } else {
                class311.field5008 = 12;
                class84.field1185 = class159.field2220;
            }
        } else if (class141.field1940 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class150.field2090[var8].method540((byte) -123) * class53.field755[var8] / 100;
            }
            if (var7 == 100) {
                class84.field1185 = class229.field3577;
                class311.field5008 = 20;
                class305.method2065(class311.field5009, arg0 - 12491);
                class5.method26(255, class311.field5009);
                class161.method1002(arg0 - 67, class311.field5009);
                class141.field1940 = 41;
            } else {
                if (var7 != 0) {
                    class84.field1185 = class205.field3075 + var7 + "%";
                }
                class311.field5008 = 20;
            }
        } else if (class141.field1940 == 41) {
            if (class265.field4273.method2080(arg0 ^ 0x23)) {
                this.method2037((byte) 94, class265.field4273.method2059(0, 1));
                class141.field1940 = 45;
                class84.field1185 = class6.field62;
                class311.field5008 = 25;
            } else {
                class84.field1185 = class106.field1523 + class265.field4273.method2079(100) + "%";
                class311.field5008 = 25;
            }
        } else if (class141.field1940 == 45) {
            class98.method636(class37.field570, 22050, (byte) -41, 2);
            class267.field4291 = new class282();
            class267.field4291.method1831(9, -16999, 128);
            class156.field2158 = class276.method1792(class45.field667, 22050, 0, class291.field4645, (byte) -111);
            class156.field2158.method877((byte) 39, class267.field4291);
            class243.method1598(class267.field4291, class68.field958, class171.field2445, class7.field74, -102);
            class110.field1585 = class276.method1792(class45.field667, 2048, 1, class291.field4645, (byte) -116);
            class116.field1671 = new class146();
            class110.field1585.method877((byte) 39, class116.field1671);
            class42.field633 = new class161(22050, class175.field2476);
            class13.field207 = class240.field3737.method2081(-127, "scape main");
            class311.field5008 = 30;
            class84.field1185 = class166.field2369;
            class141.field1940 = 50;
        } else if (class141.field1940 == 50) {
            int var9 = class72.method476(class258.field4175, class311.field5009, (byte) 110);
            int var10 = class223.method1466(6);
            if (var10 > var9) {
                class311.field5008 = 35;
                class84.field1185 = class38.field581 + var9 * 100 / var10 + "%";
            } else {
                class311.field5008 = 35;
                class84.field1185 = class208.field3096;
                class141.field1940 = 60;
            }
        } else if (class141.field1940 == 60) {
            int var11 = class246.method1612(class311.field5009, (byte) -123);
            int var12 = class58.method361(2);
            if (var11 < var12) {
                class311.field5008 = 40;
                class84.field1185 = class163.field2309 + var11 * 100 / var12 + "%";
            } else {
                class84.field1185 = class221.field3435;
                class141.field1940 = 65;
                class311.field5008 = 40;
            }
        } else if (class141.field1940 == 65) {
            class297.method1991(class311.field5009, class258.field4175, (byte) -11);
            class84.field1185 = class180.field2727;
            class311.field5008 = 45;
            class82.method519(arg0 - 114, 5);
            class141.field1940 = 70;
        } else if (class141.field1940 == 70) {
            class167.field2382.method2080(70);
            byte var13 = 0;
            int var14 = var13 + class167.field2382.method2079(arg0 ^ 0x64);
            class110.field1573.method2080(106);
            int var15 = var14 + class110.field1573.method2079(100);
            class188.field2855.method2080(82);
            int var16 = var15 + class188.field2855.method2079(100);
            class254.field3965.method2080(115);
            int var17 = var16 + class254.field3965.method2079(100);
            class179.field2723.method2080(41);
            int var18 = var17 + class179.field2723.method2079(100);
            class312.field5022.method2080(50);
            int var19 = var18 + class312.field5022.method2079(100);
            class36.field546.method2080(arg0 + 112);
            int var20 = var19 + class36.field546.method2079(100);
            class249.field3892.method2080(54);
            int var21 = var20 + class249.field3892.method2079(100);
            class142.field1947.method2080(52);
            int var22 = var21 + class142.field1947.method2079(100);
            class35.field532.method2080(57);
            int var23 = var22 + class35.field532.method2079(100);
            class139.field1924.method2080(30);
            int var24 = var23 + class139.field1924.method2079(100);
            if (var24 < 1100) {
                class311.field5008 = 50;
                class84.field1185 = class12.field202 + var24 / 11 + "%";
            } else {
                class222.method1454(class167.field2382, 0);
                class241.method1584((byte) -61, class167.field2382);
                class111.method709((byte) 68, class167.field2382);
                class37.method257(class29.field449, 1090536519, class167.field2382);
                class31.method196(256, class29.field449, class110.field1573, true);
                class213.method1332(true, true, class29.field449, class254.field3965);
                class179.method1145(class179.field2723, class57.field795, true, class29.field449, 99);
                class165.method1054(class167.field2382, 92);
                class15.method107(class186.field2822, (byte) -81, class312.field5022, class142.field1962);
                class15.method105(3, class167.field2382);
                class312.method2112(class36.field546, true, class29.field449);
                class199.method1254(true, class249.field3892);
                class252.method1635(class167.field2382, false);
                class244.method1605(class29.field449, class258.field4175, class177.field2499, -1, class311.field5009);
                class147.method923(class167.field2382, (byte) -128);
                class63.method390(122, class188.field2855);
                class96.method617(class142.field1947, class35.field532, 1, new class124());
                class13.method80(-17571, class35.field532, class142.field1947);
                class192.method1215((byte) -29, class167.field2382);
                class180.method1150(1, class167.field2382);
                class92.method596((byte) -101, class167.field2382);
                class99.method642(class167.field2382, class311.field5009, arg0 ^ 0x62);
                class84.method549(arg0 ^ 0xFFFFFF96, class167.field2382, class311.field5009);
                class144.method901((byte) -113, class311.field5009, class167.field2382);
                class84.field1185 = class188.field2847;
                class311.field5008 = 50;
                class108.method680((byte) -27);
                class141.field1940 = 80;
            }
        } else {
            if (arg0 != 0) {
                this.init();
            }
            if (class141.field1940 == 80) {
                int var25 = class225.method1494(arg0, class311.field5009);
                int var26 = class166.method1062((byte) -125);
                if (var25 < var26) {
                    class311.field5008 = 60;
                    class84.field1185 = class248.field3880 + var25 * 100 / var26 + "%";
                } else {
                    class54.method344((byte) -65, class311.field5009);
                    class84.field1185 = class298.field4754;
                    class311.field5008 = 60;
                    class141.field1940 = 90;
                }
            } else if (class141.field1940 == 90) {
                if (class278.field4425.method2080(118)) {
                    class88 var27 = new class88(class128.field1787, class278.field4425, class311.field5009, 20, !class116.field1677);
                    class118.method768(var27);
                    if (class270.field4310 == 1) {
                        class118.method770(0.9F);
                    }
                    if (class270.field4310 == 2) {
                        class118.method770(0.8F);
                    }
                    if (class270.field4310 == 3) {
                        class118.method770(0.7F);
                    }
                    if (class270.field4310 == 4) {
                        class118.method770(0.6F);
                    }
                    class311.field5008 = 70;
                    class141.field1940 = 100;
                    class84.field1185 = class238.field3685;
                } else {
                    class84.field1185 = class227.field3555 + class278.field4425.method2079(100) + "%";
                    class311.field5008 = 70;
                }
            } else if (class141.field1940 == 100) {
                if (class65.method402(class311.field5009, (byte) -104)) {
                    class141.field1940 = 110;
                }
            } else if (class141.field1940 == 110) {
                class82.field1129 = new class31();
                class45.field667.method325((byte) -128, class82.field1129, 10);
                class84.field1185 = class276.field4391;
                class141.field1940 = 120;
                class311.field5008 = 75;
            } else if (class141.field1940 == 120) {
                if (class160.field2238.method2075(0, "", "huffman")) {
                    class104 var28 = new class104(class160.field2238.method2077(false, "huffman", ""));
                    class154.method964((byte) -24, var28);
                    class311.field5008 = 80;
                    class141.field1940 = 130;
                    class84.field1185 = class194.field2964;
                } else {
                    class311.field5008 = 80;
                    class84.field1185 = class294.field4693 + "0%";
                }
            } else if (class141.field1940 == 130) {
                if (!class177.field2499.method2080(79)) {
                    class84.field1185 = class92.field1352 + class177.field2499.method2079(100) * 3 / 4 + "%";
                    class311.field5008 = 85;
                } else if (!class241.field3783.method2080(58)) {
                    class84.field1185 = class92.field1352 + (class241.field3783.method2079(100) / 10 + 75) + "%";
                    class311.field5008 = 85;
                } else if (!class258.field4175.method2080(33)) {
                    class84.field1185 = class92.field1352 + (class258.field4175.method2079(100) / 20 + 85) + "%";
                    class311.field5008 = 85;
                } else if (class185.field2805.method2057(0, "details")) {
                    class97.method633(class185.field2805);
                    class220.method1436(class139.field1924);
                    class214.method1345(class29.field449);
                    class141.field1940 = 135;
                    class84.field1185 = class69.field969;
                    class311.field5008 = 95;
                } else {
                    class84.field1185 = class92.field1352 + (class185.field2805.method2069(arg0 ^ 0x6422, "details") / 10 + 90) + "%";
                    class311.field5008 = 85;
                }
            } else if (class141.field1940 == 135) {
                int var29 = class85.method555(arg0 ^ 0x78);
                if (var29 == -1) {
                    class84.field1185 = class92.field1348;
                    class311.field5008 = 95;
                } else if (var29 == 7 || var29 == 9) {
                    this.method87("worldlistfull", false);
                    class82.method519(-120, 1000);
                } else if (class231.field3612) {
                    class84.field1185 = class93.field1365;
                    class141.field1940 = 140;
                    class311.field5008 = 96;
                } else {
                    this.method87("worldlistio_" + var29, false);
                    class82.method519(-114, 1000);
                }
            } else if (class141.field1940 == 140) {
                class164.field2325 = class177.field2499.method2081(-125, "loginscreen");
                class307.field4932.method2051(-2, true, false);
                class240.field3737.method2051(-2, true, true);
                class311.field5009.method2051(arg0 ^ 0xFFFFFFFE, true, true);
                class258.field4175.method2051(arg0 - 2, true, true);
                class160.field2238.method2051(-2, true, true);
                class177.field2499.method2051(-2, true, true);
                class311.field5008 = 97;
                class69.field978 = true;
                class141.field1940 = 150;
                class84.field1185 = class308.field4955;
            } else if (class141.field1940 == 150) {
                if (class223.field3483) {
                    class288.field4610 = 0;
                    class221.field3441 = 0;
                    class179.field2716 = 0;
                    class181.field2741 = 0;
                }
                class223.field3483 = true;
                class149.method929(class45.field667, -1);
                class275.method1790(-1, false, (byte) 93, -1, class288.field4610);
                class84.field1185 = class164.field2320;
                class311.field5008 = 100;
                class141.field1940 = 160;
            } else if (class141.field1940 == 160) {
                class110.method700(true, (byte) -100);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lim;)Z")
    public static final boolean method2032(class178 arg0) {
        if (class16.field288) {
            if (method2028(arg0).field4739 != 0) {
                return false;
            }
            if (arg0.field2608 == 0) {
                return false;
            }
        }
        return arg0.field2648;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method2033() {
        class14.field237 = 0;
        for (int var0 = 0; var0 < class306.field4921; var0++) {
            class310 var1 = class88.field1274[class131.field1834[var0]];
            if (var1.field4136) {
                int var2 = var1.field4081 - (var1.method1683(-71) - 1) * 64;
                int var3 = var1.field4140 - (var1.method1683(-88) - 1) * 64;
                class160 var4 = class284.method1871(class166.field2364, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field2225;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class256 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class48.field689[var7];
                    } else {
                        var8 = class88.field1274[var7];
                        var7 += 2048;
                    }
                    if (!var8.field4104) {
                        class242.field3802[class14.field237] = var7;
                        class222.field3464[class14.field237++] = var7;
                        var8.field4104 = true;
                    }
                    class242.field3802[class14.field237] = var7;
                    class222.field3464[class14.field237++] = class131.field1834[var0] + 2048;
                }
            }
        }
        class180.method1149(class14.field237 - 1, class242.field3802, 118, 0, class222.field3464);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method2034() {
        label137: for (int var0 = -1; var0 < class306.field4921 + class171.field2437; var0++) {
            class256 var1;
            long var2;
            if (var0 < 0) {
                var1 = class250.field3905;
                var2 = 8791798054912L;
            } else if (var0 < class171.field2437) {
                int var4 = class160.field2235[var0];
                var1 = class48.field689[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class131.field1834[var0 - class171.field2437];
                class310 var6 = class88.field1274[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4993.field3140) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field4075 >= 0) {
                int var7 = var1.method1683(-121);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field4081 & 0x7F) != 0 || (var1.field4140 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field4081 & 0x7F) != 64 || (var1.field4140 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field4081 >> 7;
                    int var9 = var1.field4140 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104 || class164.field2326[var8][var9] != var1.field4075) {
                        continue;
                    }
                    if (class51.field726[var8][var9] > 1) {
                        var10002 = class51.field726[var8][var9]--;
                        continue;
                    }
                } else {
                    int var10 = var1.field4081 - var7 * 64 >> 7;
                    int var11 = var1.field4140 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    boolean var14 = true;
                    label130: for (int var15 = var10; var15 < var12; var15++) {
                        for (int var16 = var11; var16 < var13; var16++) {
                            if (class164.field2326[var15][var16] == var1.field4075 && class51.field726[var15][var16] <= 1) {
                                var14 = false;
                                break label130;
                            }
                        }
                    }
                    if (var14) {
                        int var17 = var10;
                        while (true) {
                            if (var17 >= var12) {
                                continue label137;
                            }
                            for (int var18 = var11; var18 < var13; var18++) {
                                if (class164.field2326[var17][var18] == var1.field4075) {
                                    var10002 = class51.field726[var17][var18]--;
                                }
                            }
                            var17++;
                        }
                    }
                }
                if (var1 instanceof class314 && var1.field4083 != null && class35.field533 >= var1.field4058 && class35.field533 < var1.field4043) {
                    ((class314) var1).field5039 = false;
                    var1.field4136 = false;
                    var1.field4104 = false;
                    var1.field4124 = class58.method360(var1.field4140, var1.field4081, false, class166.field2364);
                    class211.method1313(class166.field2364, var1.field4081, var1.field4140, var1.field4124, var1, var1.field4093, var2, var1.field4097, var1.field4042, var1.field4067, var1.field4052);
                } else {
                    var1.field4136 = false;
                    var1.field4104 = false;
                    var1.field4124 = class58.method360(var1.field4140, var1.field4081, false, class166.field2364);
                    class163.method1039(class166.field2364, var1.field4081, var1.field4140, var1.field4124, (var7 - 1) * 64 + 60, var1, var1.field4093, var2, var1.field4105);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method2035(int arg0) {
        field4856++;
        if (class104.field1498.field2522 > class283.field4550) {
            class145.field2002 = (class104.field1498.field2522 * 50 - 50) * 5;
            if (class34.field519 == class240.field3748) {
                class34.field519 = class249.field3888;
            } else {
                class34.field519 = class240.field3748;
            }
            if (class145.field2002 > 3000) {
                class145.field2002 = 3000;
            }
            if (class104.field1498.field2522 >= 2 && class104.field1498.field2520 == 6) {
                this.method87("js5connect_outofdate", false);
                class142.field1961 = 1000;
                return;
            }
            if (class104.field1498.field2522 >= 4 && class104.field1498.field2520 == -1) {
                this.method87("js5crc", false);
                class142.field1961 = 1000;
                return;
            }
            if (class104.field1498.field2522 >= 4 && (class142.field1961 == 0 || class142.field1961 == 5)) {
                if (class104.field1498.field2520 == 7 || class104.field1498.field2520 == 9) {
                    this.method87("js5connect_full", false);
                } else if (class104.field1498.field2520 <= 0) {
                    this.method87("js5io", false);
                } else {
                    this.method87("js5connect", false);
                }
                class142.field1961 = 1000;
                return;
            }
        }
        class283.field4550 = class104.field1498.field2522;
        if (class145.field2002 > 0) {
            class145.field2002--;
            return;
        }
        try {
            if (class276.field4387 == 0) {
                class8.field91 = class45.field667.method318(class26.field409, 0, class34.field519);
                class276.field4387++;
            }
            if (class276.field4387 == 1) {
                if (class8.field91.field4570 == 2) {
                    this.method2027(1000, (byte) 59);
                    return;
                }
                if (class8.field91.field4570 == 1) {
                    class276.field4387++;
                }
            }
            if (class276.field4387 == 2) {
                class57.field794 = new class191((Socket) class8.field91.field4567, class45.field667);
                class215 var2 = new class215(5);
                var2.method1363(15, 107);
                var2.method1398(true, 551);
                class57.field794.method1202((byte) -78, 0, 5, var2.field3287);
                class276.field4387++;
                class314.field5049 = class299.method2006(9594);
            }
            if (class276.field4387 == 3) {
                if (class142.field1961 == 0 || class142.field1961 == 5 || class57.field794.method1213((byte) -114) > 0) {
                    int var3 = class57.field794.method1206(arg0 ^ 0x394);
                    if (var3 != 0) {
                        this.method2027(var3, (byte) 69);
                        return;
                    }
                    class276.field4387++;
                } else if ((class299.method2006(9594) - class314.field5049) > 30000L) {
                    this.method2027(1001, (byte) 112);
                    return;
                }
            }
            if (arg0 == 1001 && class276.field4387 == 4) {
                boolean var4 = class142.field1961 == 5 || class142.field1961 == 10 || class142.field1961 == 28;
                class104.field1498.method1112(!var4, 0, class57.field794);
                class57.field794 = null;
                class8.field91 = null;
                class276.field4387 = 0;
            }
        } catch (IOException var5) {
            this.method2027(1002, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method2036() {
        for (int var0 = -1; var0 < class306.field4921 + class171.field2437; var0++) {
            class256 var1;
            long var2;
            if (var0 < 0) {
                var1 = class250.field3905;
                var2 = 8791798054912L;
            } else if (var0 < class171.field2437) {
                int var4 = class160.field2235[var0];
                var1 = class48.field689[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class131.field1834[var0 - class171.field2437];
                class310 var6 = class88.field1274[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4993.field3140) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field4075 >= 0) {
                int var7 = var1.method1683(-128);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field4081 & 0x7F) == 0 && (var1.field4140 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field4081 & 0x7F) == 64 && (var1.field4140 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class314 && var1.field4083 != null && class35.field533 >= var1.field4058 && class35.field533 < var1.field4043) {
                    ((class314) var1).field5039 = false;
                    var1.field4136 = false;
                    var1.field4104 = false;
                    var1.field4124 = class58.method360(var1.field4140, var1.field4081, false, class166.field2364);
                    class211.method1313(class166.field2364, var1.field4081, var1.field4140, var1.field4124, var1, var1.field4093, var2, var1.field4097, var1.field4042, var1.field4067, var1.field4052);
                } else {
                    var1.field4136 = false;
                    var1.field4104 = false;
                    var1.field4124 = class58.method360(var1.field4140, var1.field4081, false, class166.field2364);
                    class163.method1039(class166.field2364, var1.field4081, var1.field4140, var1.field4124, (var7 - 1) * 64 + 60, var1, var1.field4093, var2, var1.field4105);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V")
    private final void method2037(byte arg0, byte[] arg1) {
        int var3 = 75 / ((-arg0 - 1) / 58);
        field4847++;
        class215 var4 = new class215(arg1);
        while (true) {
            while (true) {
                int var5 = var4.method1374((byte) -60);
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    var4.method1379(-84);
                    var4.method1379(-80);
                    var4.method1379(-84);
                    var4.method1379(-123);
                    var4.method1379(-84);
                    var4.method1379(-86);
                } else if (var5 == 4) {
                    int var6 = var4.method1374((byte) -60);
                    class165.field2342 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class165.field2342[var7] = var4.method1379(-72);
                        if (class165.field2342[var7] == 65535) {
                            class165.field2342[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lim;)Lim;")
    public static final class178 method2038(class178 arg0) {
        int var1 = method2028(arg0).method1987(true);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class166.method1057(41, arg0.field2675);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lim;IIIIIII)V")
    public static final void method2039(class178[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class178 var9 = arg0[var8];
            if (var9 != null && var9.field2675 == arg1 && (!var9.field2611 || var9.field2608 == 0 || var9.field2574 || method2028(var9).field4739 != 0 || class276.field4384 == var9 || var9.field2694 == 1338) && (!var9.field2611 || !method2032(var9))) {
                int var10 = var9.field2667 + arg6;
                int var11 = var9.field2554 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2608 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field2529 + var10;
                    int var17 = var9.field2571 + var11;
                    if (var9.field2608 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class8.field92 == var9) {
                    class171.field2442 = true;
                    class251.field3917 = var10;
                    class169.field2412 = var11;
                }
                if (!var9.field2611 || var12 < var14 && var13 < var15) {
                    if (var9.field2608 == 0) {
                        if (!var9.field2611 && method2032(var9) && class271.field4315 != var9) {
                            continue;
                        }
                        if (var9.field2689 && class17.field304 >= var12 && class249.field3891 >= var13 && class17.field304 < var14 && class249.field3891 < var15) {
                            for (class272 var18 = (class272) class303.field4846.method369((byte) -122); var18 != null; var18 = (class272) class303.field4846.method362(false)) {
                                if (var18.field4331) {
                                    var18.method962(128);
                                    var18.field4337.field2578 = false;
                                }
                            }
                            if (class274.field4356 == 0) {
                                class8.field92 = null;
                                class276.field4384 = null;
                            }
                            class69.field991 = 0;
                            class84.field1190 = false;
                        }
                    }
                    if (var9.field2611) {
                        boolean var19;
                        if (class17.field304 >= var12 && class249.field3891 >= var13 && class17.field304 < var14 && class249.field3891 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class205.field3074 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class2.field15 == 1 && class59.field826 >= var12 && class25.field393 >= var13 && class59.field826 < var14 && class25.field393 < var15) {
                            var21 = true;
                        }
                        if (var9.field2601 != null) {
                            for (int var22 = 0; var22 < var9.field2601.length; var22++) {
                                if (class233.field3651[var9.field2601[var22]]) {
                                    if (var9.field2573 == null || class35.field533 >= var9.field2573[var22]) {
                                        byte var23 = var9.field2665[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class233.field3651[86] && !class233.field3651[82] && !class233.field3651[81]) && ((var23 & 0x2) == 0 || class233.field3651[86]) && ((var23 & 0x1) == 0 || class233.field3651[82]) && ((var23 & 0x4) == 0 || class233.field3651[81])) {
                                            class314.method2116(-1, var9.field2545, (byte) 118, var22 + 1, "");
                                            int var24 = var9.field2570[var22];
                                            if (var9.field2573 == null) {
                                                var9.field2573 = new int[var9.field2601.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field2573[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field2573[var22] = class35.field533 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field2573 != null) {
                                    var9.field2573[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class59.method372(class25.field393 - var11, var9, class59.field826 - var10, 0);
                        }
                        if (class8.field92 != null && class8.field92 != var9 && var19 && method2028(var9).method1994(true)) {
                            class50.field713 = var9;
                        }
                        if (class276.field4384 == var9) {
                            class225.field3529 = true;
                            class98.field1429 = var10;
                            class138.field1892 = var11;
                        }
                        if (var9.field2574 || var9.field2694 != 0) {
                            if (var19 && class157.field2161 != 0 && var9.field2567 != null) {
                                class272 var25 = new class272();
                                var25.field4331 = true;
                                var25.field4337 = var9;
                                var25.field4334 = class157.field2161;
                                var25.field4340 = var9.field2567;
                                class303.field4846.method370((byte) -22, var25);
                            }
                            if (class8.field92 != null || class307.field4933 != null || class171.field2447 || var9.field2694 != 1400 && class69.field991 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2694 != 0) {
                                if (var9.field2694 == 1337) {
                                    class215.field3250 = var9;
                                    continue;
                                }
                                if (var9.field2694 == 1338) {
                                    if (var21) {
                                        class9.field100 = class59.field826 - var10;
                                        class149.field2061 = class25.field393 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2694 == 1400) {
                                    class164.field2335 = var9;
                                    if (var19) {
                                        class84.field1190 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class59.field826 - var10 - var9.field2529 / 2) * 2.0D / (double) class97.field1401);
                                        int var27 = (int) ((double) (class25.field393 - var11 - var9.field2571 / 2) * 2.0D / (double) class97.field1401);
                                        int var28 = class223.field3477 + var26;
                                        int var29 = class311.field5005 + var27;
                                        int var30 = class97.field1400 + var28;
                                        int var31 = class97.field1406 + class97.field1397 - var29 - 1;
                                        class301 var32 = class247.method1616((byte) 99);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method2011(var30, var33, var31, (byte) 46);
                                        if (var33 != null) {
                                            if (class233.field3651[82] && class245.field3846 > 0) {
                                                class136.method854(var33[1], var33[0], var33[2], (byte) 113);
                                                class144.method900(2);
                                                continue;
                                            }
                                            class101.field1450++;
                                            class231.field3614.method809(65, 0);
                                            class231.field3614.method1398(true, var33[0] << 28 | var33[1] << 14 | var33[2]);
                                        }
                                        class69.field991 = 1;
                                        class250.field3907 = false;
                                        class38.field579 = class17.field304;
                                        class252.field3944 = class249.field3891;
                                        continue;
                                    }
                                    if (var20 && class69.field991 > 0) {
                                        if (class69.field991 == 1 && (class38.field579 != class17.field304 || class252.field3944 != class249.field3891)) {
                                            class10.field151 = class223.field3477;
                                            class190.field2883 = class311.field5005;
                                            class69.field991 = 2;
                                        }
                                        if (class69.field991 == 2) {
                                            class250.field3907 = true;
                                            class31.method193((int) ((double) (class38.field579 - class17.field304) * 2.0D / (double) class97.field1407) + class10.field151, -12006);
                                            class104.method667(-1, (int) ((double) (class252.field3944 - class249.field3891) * 2.0D / (double) class97.field1407) + class190.field2883);
                                        }
                                        continue;
                                    }
                                    if (class69.field991 > 0 && !class250.field3907) {
                                        if ((class60.field835 == 1 || class147.method924(class179.field2721 - 1, true)) && class179.field2721 > 2) {
                                            class160.method996((byte) -13);
                                        } else if (class179.field2721 > 0) {
                                            class37.method253((byte) -125);
                                        }
                                    }
                                    class69.field991 = 0;
                                    continue;
                                }
                                if (var9.field2694 == 1401) {
                                    if (var20) {
                                        class182.method1161(2, var9.field2571, var9.field2529, class249.field3891 - var11, class17.field304 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field2694 == 1402) {
                                    class312.method2108(false, var9);
                                    continue;
                                }
                            }
                            if (!var9.field2661 && var21) {
                                var9.field2661 = true;
                                if (var9.field2553 != null) {
                                    class272 var34 = new class272();
                                    var34.field4331 = true;
                                    var34.field4337 = var9;
                                    var34.field4330 = class59.field826 - var10;
                                    var34.field4334 = class25.field393 - var11;
                                    var34.field4340 = var9.field2553;
                                    class303.field4846.method370((byte) -22, var34);
                                }
                            }
                            if (var9.field2661 && var20 && var9.field2615 != null) {
                                class272 var35 = new class272();
                                var35.field4331 = true;
                                var35.field4337 = var9;
                                var35.field4330 = class17.field304 - var10;
                                var35.field4334 = class249.field3891 - var11;
                                var35.field4340 = var9.field2615;
                                class303.field4846.method370((byte) -22, var35);
                            }
                            if (var9.field2661 && !var20) {
                                var9.field2661 = false;
                                if (var9.field2662 != null) {
                                    class272 var36 = new class272();
                                    var36.field4331 = true;
                                    var36.field4337 = var9;
                                    var36.field4330 = class17.field304 - var10;
                                    var36.field4334 = class249.field3891 - var11;
                                    var36.field4340 = var9.field2662;
                                    class12.field199.method370((byte) -22, var36);
                                }
                            }
                            if (var20 && var9.field2546 != null) {
                                class272 var37 = new class272();
                                var37.field4331 = true;
                                var37.field4337 = var9;
                                var37.field4330 = class17.field304 - var10;
                                var37.field4334 = class249.field3891 - var11;
                                var37.field4340 = var9.field2546;
                                class303.field4846.method370((byte) -22, var37);
                            }
                            if (!var9.field2578 && var19) {
                                var9.field2578 = true;
                                if (var9.field2698 != null) {
                                    class272 var38 = new class272();
                                    var38.field4331 = true;
                                    var38.field4337 = var9;
                                    var38.field4330 = class17.field304 - var10;
                                    var38.field4334 = class249.field3891 - var11;
                                    var38.field4340 = var9.field2698;
                                    class303.field4846.method370((byte) -22, var38);
                                }
                            }
                            if (var9.field2578 && var19 && var9.field2612 != null) {
                                class272 var39 = new class272();
                                var39.field4331 = true;
                                var39.field4337 = var9;
                                var39.field4330 = class17.field304 - var10;
                                var39.field4334 = class249.field3891 - var11;
                                var39.field4340 = var9.field2612;
                                class303.field4846.method370((byte) -22, var39);
                            }
                            if (var9.field2578 && !var19) {
                                var9.field2578 = false;
                                if (var9.field2683 != null) {
                                    class272 var40 = new class272();
                                    var40.field4331 = true;
                                    var40.field4337 = var9;
                                    var40.field4330 = class17.field304 - var10;
                                    var40.field4334 = class249.field3891 - var11;
                                    var40.field4340 = var9.field2683;
                                    class12.field199.method370((byte) -22, var40);
                                }
                            }
                            if (var9.field2656 != null) {
                                class272 var41 = new class272();
                                var41.field4337 = var9;
                                var41.field4340 = var9.field2656;
                                class231.field3608.method370((byte) -22, var41);
                            }
                            if (var9.field2591 != null && class26.field417 > var9.field2654) {
                                if (var9.field2638 == null || class26.field417 - var9.field2654 > 32) {
                                    class272 var46 = new class272();
                                    var46.field4337 = var9;
                                    var46.field4340 = var9.field2591;
                                    class303.field4846.method370((byte) -22, var46);
                                } else {
                                    label600: for (int var42 = var9.field2654; var42 < class26.field417; var42++) {
                                        int var43 = class303.field4807[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field2638.length; var44++) {
                                            if (var9.field2638[var44] == var43) {
                                                class272 var45 = new class272();
                                                var45.field4337 = var9;
                                                var45.field4340 = var9.field2591;
                                                class303.field4846.method370((byte) -22, var45);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field2654 = class26.field417;
                            }
                            if (var9.field2637 != null && class218.field3359 > var9.field2526) {
                                if (var9.field2538 == null || class218.field3359 - var9.field2526 > 32) {
                                    class272 var51 = new class272();
                                    var51.field4337 = var9;
                                    var51.field4340 = var9.field2637;
                                    class303.field4846.method370((byte) -22, var51);
                                } else {
                                    label576: for (int var47 = var9.field2526; var47 < class218.field3359; var47++) {
                                        int var48 = class297.field4743[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field2538.length; var49++) {
                                            if (var9.field2538[var49] == var48) {
                                                class272 var50 = new class272();
                                                var50.field4337 = var9;
                                                var50.field4340 = var9.field2637;
                                                class303.field4846.method370((byte) -22, var50);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field2526 = class218.field3359;
                            }
                            if (var9.field2525 != null && class282.field4480 > var9.field2531) {
                                if (var9.field2614 == null || class282.field4480 - var9.field2531 > 32) {
                                    class272 var56 = new class272();
                                    var56.field4337 = var9;
                                    var56.field4340 = var9.field2525;
                                    class303.field4846.method370((byte) -22, var56);
                                } else {
                                    label552: for (int var52 = var9.field2531; var52 < class282.field4480; var52++) {
                                        int var53 = class288.field4608[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field2614.length; var54++) {
                                            if (var9.field2614[var54] == var53) {
                                                class272 var55 = new class272();
                                                var55.field4337 = var9;
                                                var55.field4340 = var9.field2525;
                                                class303.field4846.method370((byte) -22, var55);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field2531 = class282.field4480;
                            }
                            if (var9.field2585 != null && class60.field830 > var9.field2564) {
                                if (var9.field2557 == null || class60.field830 - var9.field2564 > 32) {
                                    class272 var61 = new class272();
                                    var61.field4337 = var9;
                                    var61.field4340 = var9.field2585;
                                    class303.field4846.method370((byte) -22, var61);
                                } else {
                                    label528: for (int var57 = var9.field2564; var57 < class60.field830; var57++) {
                                        int var58 = class256.field4122[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field2557.length; var59++) {
                                            if (var9.field2557[var59] == var58) {
                                                class272 var60 = new class272();
                                                var60.field4337 = var9;
                                                var60.field4340 = var9.field2585;
                                                class303.field4846.method370((byte) -22, var60);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field2564 = class60.field830;
                            }
                            if (var9.field2647 != null && class306.field4925 > var9.field2534) {
                                if (var9.field2686 == null || class306.field4925 - var9.field2534 > 32) {
                                    class272 var66 = new class272();
                                    var66.field4337 = var9;
                                    var66.field4340 = var9.field2647;
                                    class303.field4846.method370((byte) -22, var66);
                                } else {
                                    label504: for (int var62 = var9.field2534; var62 < class306.field4925; var62++) {
                                        int var63 = class18.field312[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field2686.length; var64++) {
                                            if (var9.field2686[var64] == var63) {
                                                class272 var65 = new class272();
                                                var65.field4337 = var9;
                                                var65.field4340 = var9.field2647;
                                                class303.field4846.method370((byte) -22, var65);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field2534 = class306.field4925;
                            }
                            if (class54.field771 > var9.field2674 && var9.field2620 != null) {
                                class272 var67 = new class272();
                                var67.field4337 = var9;
                                var67.field4340 = var9.field2620;
                                class303.field4846.method370((byte) -22, var67);
                            }
                            if (class68.field964 > var9.field2674 && var9.field2602 != null) {
                                class272 var68 = new class272();
                                var68.field4337 = var9;
                                var68.field4340 = var9.field2602;
                                class303.field4846.method370((byte) -22, var68);
                            }
                            if (class15.field265 > var9.field2674 && var9.field2664 != null) {
                                class272 var69 = new class272();
                                var69.field4337 = var9;
                                var69.field4340 = var9.field2664;
                                class303.field4846.method370((byte) -22, var69);
                            }
                            if (class192.field2914 > var9.field2674 && var9.field2652 != null) {
                                class272 var70 = new class272();
                                var70.field4337 = var9;
                                var70.field4340 = var9.field2652;
                                class303.field4846.method370((byte) -22, var70);
                            }
                            if (class175.field2468 > var9.field2674 && var9.field2561 != null) {
                                class272 var71 = new class272();
                                var71.field4337 = var9;
                                var71.field4340 = var9.field2561;
                                class303.field4846.method370((byte) -22, var71);
                            }
                            var9.field2674 = class142.field1953;
                            if (var9.field2582 != null) {
                                for (int var72 = 0; var72 < class34.field514; var72++) {
                                    class272 var73 = new class272();
                                    var73.field4337 = var9;
                                    var73.field4329 = class126.field1777[var72];
                                    var73.field4328 = class149.field2033[var72];
                                    var73.field4340 = var9.field2582;
                                    class303.field4846.method370((byte) -22, var73);
                                }
                            }
                            if (class116.field1673 && var9.field2599 != null) {
                                class272 var74 = new class272();
                                var74.field4337 = var9;
                                var74.field4340 = var9.field2599;
                                class303.field4846.method370((byte) -22, var74);
                            }
                        }
                    }
                    if (!var9.field2611 && class8.field92 == null && class307.field4933 == null && !class171.field2447) {
                        if ((var9.field2549 >= 0 || var9.field2699 != 0) && class17.field304 >= var12 && class249.field3891 >= var13 && class17.field304 < var14 && class249.field3891 < var15) {
                            if (var9.field2549 >= 0) {
                                class271.field4315 = arg0[var9.field2549];
                            } else {
                                class271.field4315 = var9;
                            }
                        }
                        if (var9.field2608 == 8 && class17.field304 >= var12 && class249.field3891 >= var13 && class17.field304 < var14 && class249.field3891 < var15) {
                            class36.field549 = var9;
                        }
                        if (var9.field2579 > var9.field2571) {
                            class306.method2084(class249.field3891, var9.field2579, var9.field2571, var9.field2529 + var10, var11, var9, 0, class17.field304);
                        }
                    }
                    if (var9.field2608 == 0) {
                        method2039(arg0, var9.field2545, var12, var13, var14, var15, var10 - var9.field2644, var11 - var9.field2701);
                        if (var9.field2642 != null) {
                            method2039(var9.field2642, var9.field2545, var12, var13, var14, var15, var10 - var9.field2644, var11 - var9.field2701);
                        }
                        class60 var75 = (class60) class186.field2821.method1453(true, (long) var9.field2545);
                        if (var75 != null) {
                            class240.method1574(var14, -1, var12, var75.field831, var11, var10, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method103(byte arg0) {
        field4860++;
        class220.method1433();
        class295.method1982(false);
        class255.method1666((byte) -32);
        class97.method634();
        class301.method2014(123);
        class208.method1292(0);
        class14.method89((byte) 77);
        class68.method450(-13380);
        class241.method1583(3491);
        class31.method192((byte) -66);
        class215.method1368(-1);
        class191.method1204((byte) 89);
        class177.method1123(16);
        class223.method1469((byte) 63);
        class83.method531((byte) 88);
        class305.method2062(24415);
        class224.method1474((byte) 123);
        class142.method892(-92);
        class150.method952(16777215);
        class310.method2102((byte) 120);
        class126.method808(0);
        class213.method1336((byte) -99);
        class178.method1125(4276);
        class58.method359(24);
        class108.method693(85);
        class222.method1460(26030);
        class48.method298((byte) -42);
        class53.method340(10259);
        class282.method1845((byte) 25);
        class138.method875(-61);
        class161.method999(-114);
        class69.method460(124);
        class195.method1238(25668);
        class256.method1667(true);
        class91.method591((byte) -36);
        class197.method1245(64);
        class211.method1320(1);
        class60.method377(-25561);
        class297.method1993((byte) 45);
        class106.method677(false);
        class154.method963(-93);
        class166.method1058(false);
        class20.method132((byte) -78);
        class82.method526(-90);
        class113.method720((byte) 59);
        class21.method141(-1);
        class129.method825(0);
        class105.method670(-76);
        class26.method166(1162620070);
        class131.method836((byte) -91);
        class35.method238(-43);
        class57.method357(-31038);
        class18.method126((byte) -122);
        class157.method975(-104);
        class95.method611((byte) 91);
        class200.method1257(-77);
        class251.method1633((byte) 108);
        class54.method347(114);
        class72.method478(true);
        class71.method471(-32342);
        class240.method1582(69);
        class236.method1546(-116);
        class147.method921(-80);
        class162.method1025();
        class16.method111(632487200);
        class10.method59(1);
        class66.method425();
        class179.method1141(-116);
        class245.method1608((byte) 118);
        class156.method969(-13827);
        class164.method1048((byte) -77);
        class34.method234(-12845);
        class93.method601(-1);
        class284.method1873((byte) 61);
        class33.method221();
        class9.method49((byte) 113);
        class70.method469(126);
        class289.method1935();
        class189.method1195(-101);
        class258.method1690(29);
        class238.method1561(-5);
        class67.method447();
        class51.method315(true);
        class149.method931(19);
        class270.method1766((byte) -124);
        class232.method1528(-8431);
        class120.method777(true);
        class24.method156(-30412);
        class266.method1737();
        class271.method1767(118);
        class17.method118((byte) 101);
        class267.method1752(-127);
        class128.method821(18652);
        class225.method1496(false);
        class159.method992(125);
        class144.method903((byte) 118);
        class243.method1593(34);
        class171.method1091((byte) 19);
        class181.method1156((byte) 96);
        class235.method1544(-89);
        class85.method551(126);
        class167.method1073(-30);
        class307.method2090(7);
        class188.method1190((byte) -83);
        class214.method1346();
        class13.method82(32235);
        class36.method240((byte) 20);
        class6.method30((byte) -102);
        class124.method794((byte) 83);
        class280.method1814(2);
        class290.method1945((byte) -95);
        class41.method280();
        class80.method511(-3);
        class148.method928(238);
        class7.method43(0);
        class242.method1588((byte) -95);
        class88.method565((byte) -64);
        class294.method1974(103);
        class227.method1503(true);
        class304.method2046();
        class118.method754();
        class104.method666((byte) -126);
        class206.method1286(false);
        class163.method1041(-1);
        class268.method1757((byte) 123);
        class248.method1620(-211);
        class250.method1627(1);
        class65.method398(15983);
        class127.method815((byte) 111);
        class47.method294(31041);
        class98.method637(122);
        class272.method1773(35);
        class43.method288(false);
        class202.method1260((byte) 125);
        class145.method906(true);
        class160.method997(1);
        class185.method1178(-23600);
        class180.method1148(1);
        class75.method496(false);
        class308.method2096(false);
        class115.method735(false);
        class165.method1051((byte) 33);
        class152.method957();
        class29.method187((byte) -118);
        class233.method1532((byte) 113);
        class230.method1516(true);
        class86.method558();
        class151.method954(20131);
        class302.method2019(-1);
        class247.method1617(-1012210864);
        class194.method1228(false);
        class39.method265(-1);
        class205.method1284((byte) -56);
        class309.method2101(-1);
        class226.method1497(-15707);
        class264.method1712();
        class231.method1520((byte) 90);
        class117.method750(-121);
        class234.method1537(-25);
        class218.method1420(0);
        class23.method154(-15065);
        class99.method639((byte) 119);
        class2.method8(-13004);
        class76.method498(-29603);
        class277.method1800(-1);
        class274.method1783(-29164);
        class134.method841((byte) -55);
        class116.method744(false);
        class313.method2114((byte) -43);
        class237.method1556();
        class292.method1966((byte) -117);
        class107.method679(-87);
        class27.method178((byte) -75);
        class63.method392(false);
        class45.method290(-107);
        class59.method375(-64);
        class291.method1956(true);
        class136.method857(-29261);
        class135.method850();
        class303.method2023(91);
        class123.method793(true);
        class78.method503(-96);
        class90.method582((byte) 64);
        class219.method1429();
        class22.method147();
        class50.method307(-121);
        class306.method2086((byte) 89);
        class175.method1101((byte) 87);
        class38.method259(-122);
        class217.method1411();
        class253.method1653();
        class30.method191((byte) -2);
        class89.method578(-3);
        class92.method597(-79);
        class114.method725(104);
        class15.method109(-91);
        class119.method774((byte) 96);
        class11.method70(0);
        class288.method1927(0);
        class257.method1688(255);
        class252.method1640(0);
        class81.method515((byte) 64);
        class103.method660(true);
        class207.method1291(11018);
        class111.method707(true);
        class5.method23(2);
        class249.method1624(-85);
        class229.method1515(-1);
        class37.method255(-14171);
        class32.method200(-97);
        class102.method655(0);
        class183.method1168((byte) 13);
        class174.method1100(-120);
        class8.method47(true);
        class262.method1705(-25858);
        class44.method289(8557);
        class110.method699((byte) 112);
        class137.method864(4);
        class278.method1805((byte) 7);
        class84.method545(-28);
        class265.method1716(false);
        class260.method1695(false);
        class42.method283(0);
        class190.method1198((byte) -107);
        class12.method78(-81);
        class254.method1657(false);
        class182.method1163((byte) 60);
        class169.method1082(64);
        class192.method1216(5);
        class101.method648((byte) 48);
        class275.method1784(-120);
        if (arg0 < 48) {
            return;
        }
        class312.method2111(9401);
        class298.method2005(-32325);
        class184.method1175(1);
        class261.method1699(-8436);
        class96.method613(21536);
        class3.method14(11118);
        class212.method1322(111);
        class143.method899(false);
        class228.method1511(1303);
        class56.method353(0);
        class221.method1450(96);
        class199.method1251(77);
        class153.method958(0);
        class112.method713((byte) -119);
        class311.method2107((byte) -78);
        class186.method1182(122);
        class187.method1185(-26);
        class109.method697(-1);
        class244.method1602((byte) 25);
        class276.method1793((byte) -124);
        class139.method888(-101);
        class122.method792(-105);
        class246.method1613(90);
        class176.method1104(0);
        class263.method1710(-1);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method2040() {
        for (int var0 = -1; var0 < class306.field4921 + class171.field2437; var0++) {
            class256 var1;
            if (var0 < 0) {
                var1 = class250.field3905;
            } else if (var0 < class171.field2437) {
                var1 = class48.field689[class160.field2235[var0]];
            } else {
                var1 = class88.field1274[class131.field1834[var0 - class171.field2437]];
            }
            if (var1.field4075 >= 0) {
                int var2 = var1.method1683(-128);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field4081 & 0x7F) != 0 || (var1.field4140 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field4081 & 0x7F) != 64 || (var1.field4140 & 0x7F) != 64) {
                    continue;
                }
                var1.field4136 = true;
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field4081 >> 7;
                    int var4 = var1.field4140 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field4075 >= class164.field2326[var3][var4]) {
                        if (var1.field4075 > class164.field2326[var3][var4]) {
                            class164.field2326[var3][var4] = var1.field4075;
                            class51.field726[var3][var4] = 1;
                        } else {
                            var10002 = class51.field726[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field4081 - var2 * 64 >> 7;
                    int var6 = var1.field4140 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method1683(-122);
                    int var8 = var6 + var1.method1683(-101);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field4075 > class164.field2326[var9][var10]) {
                                class164.field2326[var9][var10] = var1.field4075;
                                class51.field726[var9][var10] = 1;
                            } else if (class164.field2326[var9][var10] == var1.field4075) {
                                var10002 = class51.field726[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method2041() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class164.field2326[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method2042(int arg0) {
        class34.field514 = 0;
        field4857++;
        while (class19.method130((byte) 120) && class34.field514 < 128) {
            class126.field1777[class34.field514] = class113.field1618;
            class149.field2033[class34.field514] = class27.field432;
            class34.field514++;
        }
        class208.field3094++;
        if (class104.field1499 != -1) {
            class240.method1574(class218.field3386, -1, 0, class104.field1499, 0, 0, 0, class174.field2460);
        }
        class142.field1953++;
        if (class188.field2856 == 0) {
            class228.method1509((byte) 56);
        } else if (class110.field1584 == 0 && class179.field2714 == 0) {
            if (class12.field203 == 2) {
                class167.method1070((byte) -126);
            } else {
                class116.method743(110);
            }
            if (class178.field2603 >> 7 < 14 || (class178.field2603 >> 7) >= 90 || class188.field2848 >> 7 < 14 || class188.field2848 >> 7 >= 90) {
                class184.method1173(0);
            }
        }
        int var2 = 84 % ((-arg0 - 50) / 58);
        while (true) {
            class272 var3;
            class178 var4;
            class178 var5;
            do {
                var3 = (class272) class231.field3608.method364(125);
                if (var3 == null) {
                    while (true) {
                        class272 var6;
                        class178 var7;
                        class178 var8;
                        do {
                            var6 = (class272) class12.field199.method364(122);
                            if (var6 == null) {
                                while (true) {
                                    class272 var9;
                                    class178 var10;
                                    class178 var11;
                                    do {
                                        var9 = (class272) class303.field4846.method364(119);
                                        if (var9 == null) {
                                            if (class8.field92 != null) {
                                                class251.method1631((byte) -78);
                                            }
                                            if (class205.field3072 != null && class205.field3072.field4570 == 1) {
                                                if (class205.field3072.field4567 != null) {
                                                    class60.method378(class141.field1942, class298.field4746, (byte) 117);
                                                }
                                                class205.field3072 = null;
                                                class141.field1942 = false;
                                                class298.field4746 = null;
                                            }
                                            if (class35.field533 % 1500 == 0) {
                                                class211.method1314(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field4337;
                                        if (var10.field2576 < 0) {
                                            break;
                                        }
                                        var11 = class166.method1057(105, var10.field2675);
                                    } while (var11 == null || var11.field2642 == null || var10.field2576 >= var11.field2642.length || var11.field2642[var10.field2576] != var10);
                                    class160.method994((byte) -112, var9);
                                }
                            }
                            var7 = var6.field4337;
                            if (var7.field2576 < 0) {
                                break;
                            }
                            var8 = class166.method1057(-123, var7.field2675);
                        } while (var8 == null || var8.field2642 == null || var7.field2576 >= var8.field2642.length || var8.field2642[var7.field2576] != var7);
                        class160.method994((byte) -112, var6);
                    }
                }
                var4 = var3.field4337;
                if (var4.field2576 < 0) {
                    break;
                }
                var5 = class166.method1057(-112, var4.field2675);
            } while (var5 == null || var5.field2642 == null || var4.field2576 >= var5.field2642.length || var5.field2642[var4.field2576] != var4);
            class160.method994((byte) -112, var3);
        }
    }
}
