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
public class client extends class203 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    private static int[] field2602 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2610 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lef;")
    public static class311 field2608 = new class311(7, 5);

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lvo;")
    public static class31[] field2621;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lb;")
    public static class201 field2623;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
    public static boolean field2624;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    public static final void method1109(int arg0, int arg1) {
        field2599++;
        class232 var2 = class458.field6420;
        synchronized (class458.field6420) {
            if (arg0 != -1) {
                field2608 = null;
            }
            class458.field6420.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method1110() {
        int var0 = class37.field491;
        int[] var1 = class348.field5033;
        int var2 = class462.field6478 ? var0 : class225.field3418 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class146 var4;
            if (var3 < var0) {
                var4 = class124.field1559[var1[var3]];
            } else {
                var4 = class139.field1851[class281.field4139[var3 - var0]];
            }
            if (var4.field2127 >= 0) {
                int var5 = var4.method918(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4331 & 0x7F) == 0 && (var4.field4317 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field4331 & 0x7F) == 64 && (var4.field4317 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class452 && var4.field2167 != null && class353.field5090 >= var4.field2167.field1428 && class353.field5090 < var4.field2167.field1431) {
                    ((class452) var4).field6263 = false;
                }
                var4.field4322 = class132.method835(var4.field4317, var4.field4319, var4.field4331, 2002);
                class271.method1659(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    private final void method1111(byte arg0) {
        field2605++;
        if (class356.field5146 < class289.field4210.field790) {
            if (class89.field1102 == class2.field24) {
                class89.field1102 = class202.field2979;
            } else {
                class89.field1102 = class2.field24;
            }
            class476.field6688 = (class289.field4210.field790 * 50 - 50) * 5;
            if (class476.field6688 > 3000) {
                class476.field6688 = 3000;
            }
            if (class289.field4210.field790 >= 2 && class289.field4210.field789 == 6) {
                this.method1262(-2, "js5connect_outofdate");
                class363.field5227 = 1000;
                return;
            }
            if (class289.field4210.field790 >= 4 && class289.field4210.field789 == -1) {
                this.method1262(-2, "js5crc");
                class363.field5227 = 1000;
                return;
            }
            if (class289.field4210.field790 >= 4 && (class363.field5227 == 0 || class363.field5227 == 5)) {
                if (class289.field4210.field789 == 7 || class289.field4210.field789 == 9) {
                    this.method1262(-2, "js5connect_full");
                } else if (class289.field4210.field789 <= 0) {
                    this.method1262(-2, "js5io");
                } else {
                    this.method1262(-2, "js5connect");
                }
                class363.field5227 = 1000;
                return;
            }
        }
        class356.field5146 = class289.field4210.field790;
        if (class476.field6688 > 0) {
            class476.field6688--;
            return;
        }
        if (arg0 >= -77) {
            field2623 = null;
        }
        try {
            if (class33.field425 == 0) {
                class232.field3503 = class252.field3718.method2527(class262.field3840, (byte) -126, class89.field1102);
                class33.field425++;
            }
            if (class33.field425 == 1) {
                if (class232.field3503.field5253 == 2) {
                    this.method1121(13063, 1000);
                    return;
                }
                if (class232.field3503.field5253 == 1) {
                    class33.field425++;
                }
            }
            if (class33.field425 == 2) {
                class275.field3987 = new class337((Socket) class232.field3503.field5255, class252.field3718);
                class276 var2 = new class276(5);
                var2.method1753(true, class93.field1187.field1886);
                var2.method1744(577, true);
                class275.field3987.method2125(5, var2.field4064, (byte) -36, 0);
                class33.field425++;
                class48.field673 = class433.method2562(-2039);
            }
            if (class33.field425 == 3) {
                if (class363.field5227 == 0 || class363.field5227 == 5 || class275.field3987.method2121(true) > 0) {
                    int var3 = class275.field3987.method2119(true);
                    if (var3 != 0) {
                        this.method1121(13063, var3);
                        return;
                    }
                    class33.field425++;
                } else if (class433.method2562(-2039) - class48.field673 > 30000L) {
                    this.method1121(13063, 1001);
                    return;
                }
            }
            if (class33.field425 == 4) {
                boolean var4 = class363.field5227 == 5 || class363.field5227 == 10 || class363.field5227 == 28;
                class289.field4210.method352(class275.field3987, !var4, (byte) -80);
                class33.field425 = 0;
                class232.field3503 = null;
                class275.field3987 = null;
            }
        } catch (IOException var5) {
            this.method1121(13063, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static void method1112(byte arg0) {
        field2623 = null;
        if (arg0 <= 75) {
            field2620 = 70;
        }
        field2608 = null;
        field2621 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method1113(byte arg0) {
        field2604++;
        if (class363.field5227 == 1000) {
            return;
        }
        class353.field5090++;
        if ((class353.field5090 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class267.field3906 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class279.field4107.setSeed((long) class267.field3906);
        }
        if (arg0 != -2) {
            return;
        }
        if (class353.field5090 % 50 == 0) {
            class86.field1044 = class450.field6228;
            class412.field5804 = class107.field1344;
            class450.field6228 = 0;
            class107.field1344 = 0;
        }
        this.method1124(50);
        if (class421.field5880 != null) {
            class421.field5880.method1185(-26113);
        }
        class473.method2777(arg0 ^ 0xFFFF8BEE);
        class164.method1027(false);
        class272.field3959.method2702(73);
        class262.field3832.method186(2);
        if (class306.field4363 != null) {
            int var3 = class306.field4363.method1193(122);
            class166.field2437 = var3;
        }
        if (class141.field1878 != null) {
            class141.field1878.method642((int) class433.method2562(-2039));
        }
        class247.method1548((byte) 117);
        class370.field5340 = 0;
        for (class59 var4 = class272.field3959.method2708(-26962); var4 != null && class370.field5340 < 128; var4 = class272.field3959.method2708(-26962)) {
            if (var4.method372(arg0 ^ 0xFFFFF134) != 1) {
                char var5 = var4.method367((byte) 124);
                if (!class51.method325(2) || var5 != '`' && var5 != '§') {
                    class153.field2265[class370.field5340] = var4;
                    class370.field5340++;
                } else if (class168.method1039((byte) -104)) {
                    class7.method25(-27832004);
                } else {
                    class90.method515(4);
                }
            }
        }
        class419.field5854 = null;
        for (class421 var6 = class262.field3832.method189(0); var6 != null; var6 = class262.field3832.method189(0)) {
            int var7 = var6.method2157(112);
            if (var7 == -1) {
                class104.field1329.method2845(var6, (byte) 37);
            } else if (class74.method438((byte) -95, var7)) {
                class419.field5854 = var6;
            }
        }
        if (class168.method1039((byte) -126)) {
            class150.method946(37);
        }
        if (class363.field5227 == 0) {
            this.method1120((byte) -3);
            class232.method1474((byte) 80);
        } else if (class363.field5227 == 5) {
            this.method1120((byte) -3);
            class232.method1474((byte) 80);
        } else if (class363.field5227 == 25 || class363.field5227 == 28) {
            class289.method1806(true);
        }
        if (class363.field5227 == 10) {
            this.method1126(true);
            class462.method2713(-94);
            class252.method1574(true);
            class460.method2697((byte) -17);
        } else if (class363.field5227 == 30) {
            class78.method448(true);
        } else if (class363.field5227 == 40) {
            class460.method2697((byte) -17);
            if (class22.field287 != -3 && class22.field287 != 2 && class22.field287 != 15) {
                class207.method1357((byte) -109);
            }
        }
        class167.method1035(class141.field1878, false);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class38.method254(-114, "argument count");
            }
            class404.field5697 = Integer.parseInt(arg0[0]);
            class394.field5599 = class211.field3203;
            if (arg0[1].equals("live")) {
                class120.field1504 = class237.field3557;
            } else if (arg0[1].equals("rc")) {
                class120.field1504 = class344.field5002;
            } else if (arg0[1].equals("wip")) {
                class120.field1504 = class368.field5315;
            } else {
                class38.method254(-114, "modewhat");
            }
            class326.field4711 = class252.method1572(arg0[2], (byte) -31);
            if (class326.field4711 == -1) {
                if (arg0[2].equals("english")) {
                    class326.field4711 = 0;
                } else if (arg0[2].equals("german")) {
                    class326.field4711 = 1;
                } else {
                    class38.method254(-115, "language");
                }
            }
            class370.field5341 = false;
            class144.field1910 = false;
            if (arg0[3].equals("game0")) {
                class456.field6416 = class95.field1225;
            } else if (arg0[3].equals("game1")) {
                class456.field6416 = class410.field5756;
            } else {
                class38.method254(-125, "game");
            }
            class36.field466 = 0;
            class347.field5028 = "";
            class244.field3628 = true;
            class241.field3612 = true;
            class277.field4086 = 0;
            class163.field2416 = class456.field6416.field5091;
            client var1 = new client();
            class76.field936 = var1;
            var1.method1265(1024, class120.field1504.method318((byte) -101) + 32, class456.field6416.field5095, 768, false, 0, 29, 577);
            class239.field3589.setLocation(40, 40);
        } catch (Exception var3) {
            class267.method1641((String) null, var3, (byte) -87);
        }
        field2612++;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        int var1 = class37.field491;
        int[] var2 = class348.field5033;
        int var3 = class462.field6478 ? var1 : class225.field3418 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class146 var5;
            if (var4 < var1) {
                var5 = class124.field1559[var2[var4]];
            } else {
                var5 = class139.field1851[class281.field4139[var4 - var1]];
            }
            if (var5.field4319 == arg0) {
                var5.field2128 = 0;
                if (var5.field2127 < 0) {
                    var5.field2118 = false;
                } else {
                    int var6 = var5.method918(false);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field4331 & 0x7F) != 0 || (var5.field4317 & 0x7F) != 0) {
                            var5.field2118 = false;
                            continue;
                        }
                    } else if ((var5.field4331 & 0x7F) != 64 || (var5.field4317 & 0x7F) != 64) {
                        var5.field2118 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field4331 >> 7;
                        int var8 = var5.field4317 >> 7;
                        if (class156.field2324[var7][var8] != var5.field2127) {
                            var5.field2118 = true;
                            continue;
                        }
                        if (class247.field3658[var7][var8] > 1) {
                            var10002 = class247.field3658[var7][var8]--;
                            var5.field2118 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field4331 - var9 >> 7;
                        int var11 = var5.field4317 - var9 >> 7;
                        int var12 = var5.field4331 + var9 >> 7;
                        int var13 = var5.field4317 + var9 >> 7;
                        if (!class61.method375(13663, var12, var5.field2127, var11, var10, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class156.field2324[var14][var15] == var5.field2127) {
                                        var10002 = class247.field3658[var14][var15]--;
                                    }
                                }
                            }
                            var5.field2118 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class452 && var5.field2167 != null && class353.field5090 >= var5.field2167.field1428 && class353.field5090 < var5.field2167.field1431) {
                        ((class452) var5).field6263 = false;
                    }
                    var5.field2118 = false;
                    var5.field4322 = class132.method835(var5.field4317, var5.field4319, var5.field4331, 2002);
                    class271.method1659(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method1115(int arg0) {
        field2614++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class258.method1606(-769);
        class235.field3533 = new class287(class252.field3718);
        class289.field4210 = new class58();
        if (class394.field5599 != class356.field5143) {
            class92.field1171 = new byte[50][];
        }
        class314.field4438 = new class190(class252.field3718);
        if (class394.field5599 == class356.field5143) {
            class279.field4115 = this.getCodeBase().getHost();
            class310.field4389 = 443;
            class226.field3425 = 43594;
        } else if (class187.method1154(-119, class394.field5599)) {
            class279.field4115 = this.getCodeBase().getHost();
            class310.field4389 = class404.field5697 + 50000;
            class226.field3425 = class404.field5697 + 40000;
        } else if (class394.field5599 == class211.field3203) {
            class279.field4115 = "127.0.0.1";
            class226.field3425 = class404.field5697 + 40000;
            class310.field4389 = class404.field5697 + 50000;
        }
        class202.field2979 = class310.field4389;
        class230.field3470 = class226.field3425;
        class2.field24 = class226.field3425;
        class262.field3840 = class279.field4115;
        class326.field4701 = class166.field2433 = class284.field4159 = class105.field1332 = new short[256];
        if (arg0 <= 67) {
            return;
        }
        if (class456.field6416 == class410.field5756) {
            class325.field4695 = true;
            class332.field4835 = class321.field4656;
            class349.field5055 = 0;
            class360.field5186 = 16777215;
            class386.field5488 = class271.field3958;
            class163.field2413 = class362.field5220;
            class9.field84 = class426.field5969;
        } else {
            class332.field4835 = class211.field3200;
            class9.field84 = class488.field6876;
            class386.field5488 = class237.field3565;
            class163.field2413 = class325.field4694;
        }
        if (class430.field6023 == 3) {
            class185.field2746 = class404.field5697;
        }
        class89.field1102 = class230.field3470;
        class272.field3959 = class431.method2551(class465.field6503, 124);
        class262.field3832 = class238.method1511(class465.field6503, -9201, true);
        class306.field4363 = class132.method834(-3164);
        if (class306.field4363 != null) {
            class306.field4363.method1194(class465.field6503, -12792);
        }
        class148.field2177 = class430.field6023;
        try {
            if (class252.field3718.field6010 != null) {
                class225.field3402 = new class90(class252.field3718.field6010, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class244.field3636[var3] = new class90(class252.field3718.field6020[var3], 6000, 0);
                }
                class134.field1753 = new class90(class252.field3718.field6022, 6000, 0);
                class153.field2259 = new class420(255, class225.field3402, class134.field1753, 500000);
                class307.field4373 = new class90(class252.field3718.field6016, 24, 0);
                class252.field3718.field6022 = null;
                class252.field3718.field6010 = null;
                class252.field3718.field6016 = null;
                class252.field3718.field6020 = null;
            }
        } catch (IOException var4) {
            class225.field3402 = null;
            class153.field2259 = null;
            class134.field1753 = null;
            class307.field4373 = null;
        }
        if (class394.field5599 != class356.field5143) {
            class79.field971 = true;
        }
        class77.field947 = (class95.field1225 == class456.field6416 ? class67.field849 : class179.field2579).method2065(-96, class326.field4711);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method1116(int arg0) {
        field2613++;
        if (class363.field5227 == 1000) {
            return;
        }
        long var2 = class125.method773(-99) / 1000000L - class486.field6845;
        class486.field6845 = class125.method773(109) / 1000000L;
        boolean var4 = class469.method2760((byte) -22);
        if (var4 && class420.field5875 && class28.field381 != null) {
            class28.field381.method2479(20215);
        }
        if (class363.field5227 == 30 || class363.field5227 == 10) {
            if (class414.field5824 != 0L && class414.field5824 < class433.method2562(-2039)) {
                class327.method2075(class262.method1624(16822), class314.field4438.field5790, arg0 + 21393, false, class314.field4438.field5799);
            } else if (class141.field1878.method657() && class327.field4738) {
                class224.method1437((byte) 115);
            }
        }
        if (class86.field1045 == null) {
            Container var5;
            if (class239.field3589 == null) {
                var5 = class252.field3718.field6021;
            } else {
                var5 = class239.field3589;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class239.field3589 == var5) {
                Insets var8 = class239.field3589.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class284.field4156 != var6 || class199.field2901 != var7) {
                if (class141.field1878 == null || class141.field1878.method684()) {
                    class258.method1606(-769);
                } else {
                    class284.field4156 = var6;
                    class199.field2901 = var7;
                }
                class414.field5824 = class433.method2562(arg0 ^ 0x5466) + 500L;
            }
        }
        if (class86.field1045 != null && !class452.field6301 && (class363.field5227 == 30 || class363.field5227 == 10)) {
            class327.method2075(class314.field4438.field5800, -1, 0, false, -1);
        }
        boolean var9 = false;
        if (arg0 != -21393) {
            return;
        }
        if (class328.field4746) {
            var9 = true;
            class328.field4746 = false;
        }
        if (var9) {
            class328.method2077(-1);
        }
        if (class141.field1878 != null && class141.field1878.method656() || class262.method1624(arg0 ^ 0xFFFFEDD9) != 1) {
            class453.method2661((byte) 127);
        }
        if (class363.field5227 == 0) {
            class269.method1649(class31.field415[class163.field2416], var9, class335.field4876[class163.field2416], class216.field3247, class78.field966, class311.field4396[class163.field2416], (byte) 115);
        } else if (class363.field5227 == 5) {
            class2.method12(class311.field4396[class163.field2416].getRGB(), var9 | class141.field1878.method656(), class31.field415[class163.field2416].getRGB(), class335.field4876[class163.field2416].getRGB(), class141.field1878, arg0 ^ 0xFFFFAD43, class491.field6928);
        } else if (class363.field5227 == 10) {
            class362.method2236(-3134);
        } else if (class363.field5227 == 25 || class363.field5227 == 28) {
            if (class39.field516 == 1) {
                if (class64.field833 < class125.field1636) {
                    class64.field833 = class125.field1636;
                }
                int var10 = (class64.field833 - class125.field1636) * 50 / class64.field833;
                class306.method1898(class92.field1166, 868, class27.field363.method2065(64, class326.field4711) + "<br>(" + var10 + "%)", true);
            } else if (class39.field516 == 2) {
                if (class132.field1745 > class222.field3378) {
                    class222.field3378 = class132.field1745;
                }
                int var11 = (class222.field3378 - class132.field1745) * 50 / class222.field3378 + 50;
                class306.method1898(class92.field1166, 868, class27.field363.method2065(-121, class326.field4711) + "<br>(" + var11 + "%)", true);
            } else {
                class306.method1898(class92.field1166, 868, class27.field363.method2065(42, class326.field4711), true);
            }
        } else if (class363.field5227 == 30) {
            class280.method1769(var2, (byte) 93);
        } else if (class363.field5227 == 40) {
            class306.method1898(class92.field1166, 868, class456.field6413.method2065(-92, class326.field4711) + "<br>" + class339.field4946.method2065(-124, class326.field4711), true);
        }
        if (class404.field5696 == 3) {
            for (int var12 = 0; var12 < class420.field5872; var12++) {
                Rectangle var13 = class40.field526[var12];
                if (class452.field6302[var12]) {
                    class141.field1878.method1941(var13.height, var13.y, 1, var13.width, var13.x, -1996553985);
                } else if (class422.field5917[var12]) {
                    class141.field1878.method1941(var13.height, var13.y, 1, var13.width, var13.x, -1996554240);
                }
            }
        }
        if (class168.method1039((byte) -120)) {
            class95.method541(class141.field1878, arg0 ^ 0xFFFFD8E8);
        }
        if ((class363.field5227 == 30 || class363.field5227 == 10) && class404.field5696 == 0 && class262.method1624(arg0 + 38215) == 1 && !var9 && class430.field6009.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class420.field5872; var15++) {
                if (class422.field5917[var15]) {
                    class422.field5917[var15] = false;
                    class304.field4326[var14++] = class40.field526[var15];
                }
            }
            class141.field1878.method663(class304.field4326, var14);
        } else if (class363.field5227 != 0) {
            class141.field1878.method622();
            for (int var16 = 0; var16 < class420.field5872; var16++) {
                class422.field5917[var16] = false;
            }
        }
        if (class314.field4438.field5789 == 0) {
            class111.method713(arg0 + 21294, 15L);
        } else if (class314.field4438.field5789 == 1) {
            class111.method713(31, 10L);
        } else if (class314.field4438.field5789 == 2) {
            class111.method713(124, 5L);
        } else if (class314.field4438.field5789 == 3) {
            class111.method713(arg0 ^ 0x53C8, 2L);
        }
        if (class272.field3970) {
            class70.method415(arg0 + 21304);
        }
        if (class314.field4438.field5781 && class363.field5227 == 10 && class36.field472 != -1) {
            class314.field4438.field5781 = false;
            class314.field4438.method1177(class252.field3718, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1117() {
        for (int var0 = 0; var0 < class58.field758; var0++) {
            int[] var1 = class156.field2324[var0];
            for (int var2 = 0; var2 < class287.field4181; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1118() {
        int var0 = class37.field491;
        int[] var1 = class348.field5033;
        boolean var2 = class314.field4438.field5773 == 1 && var0 > 200 || class314.field4438.field5773 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class452 var12 = class124.field1559[var1[var3]];
            if (var12.method2645((byte) 75)) {
                var12.method922(200);
                if (var12.field4330 >= 0 && var12.field4324 >= 0 && var12.field4328 < class58.field758 && var12.field4334 < class287.field4181) {
                    var12.field6263 = var12.field2121 ? var2 : false;
                    if (class492.field6935 == var12) {
                        var12.field2127 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field2118) {
                            var13++;
                        }
                        if (var12.field2149 > class353.field5090) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method918(false) << 2);
                        if (class282.field4152 == 0) {
                            var14 += 32;
                        } else {
                            var14 += 128;
                        }
                        var14 += 256;
                        var12.field2127 = var14 + 1;
                    }
                } else {
                    var12.field2127 = -1;
                }
            } else {
                var12.field2127 = -1;
            }
        }
        for (int var4 = 0; var4 < class225.field3418; var4++) {
            class216 var9 = class139.field1851[class281.field4139[var4]];
            if (var9.method1390((byte) 75) && var9.field3232.method2738(class140.field1859, 8192)) {
                var9.method922(200);
                if (var9.field4330 >= 0 && var9.field4324 >= 0 && var9.field4328 < class58.field758 && var9.field4334 < class287.field4181) {
                    int var10 = 0;
                    if (!var9.field2118) {
                        var10++;
                    }
                    if (var9.field2149 > class353.field5090) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method918(false) << 2);
                    if (class282.field4152 == 0) {
                        if (var9.field3232.field6554) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class282.field4152 == 1) {
                        if (var9.field3232.field6554) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field3232.field6544) {
                        var11 += 1024;
                    } else if (!var9.field3232.field6543) {
                        var11 += 256;
                    }
                    var9.field2127 = var11 + 1;
                } else {
                    var9.field2127 = -1;
                }
            } else {
                var9.field2127 = -1;
            }
        }
        for (int var5 = 0; var5 < class273.field3974.length; var5++) {
            class141 var6 = class273.field3974[var5];
            if (var6 != null) {
                if (var6.field1877 == 1) {
                    class216 var7 = class139.field1851[var6.field1872];
                    if (var7 != null && var7.field2127 >= 0) {
                        var7.field2127 += 2048;
                    }
                } else if (var6.field1877 == 10) {
                    class452 var8 = class124.field1559[var6.field1872];
                    if (var8 != null && class492.field6935 != var8 && var8.field2127 >= 0) {
                        var8.field2127 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ldt;IIIIIIIII)V")
    public static final void method1119(class145[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class145 var11 = arg0[var10];
            if (var11 != null && var11.field1947 == arg1) {
                int var12 = var11.field1971 + arg6;
                int var13 = var11.field2041 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2073 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2010 + var12;
                    int var19 = var11.field2021 + var13;
                    if (var11.field2073 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2073 == 0 || var11.field2029 || method1122(var11).field5472 != 0 || class29.field396 == var11 || class437.field6082 == var11.field2062) {
                    if (!method1125(var11)) {
                        if (class250.field3695 == var11) {
                            class68.field860 = true;
                            class154.field2292 = var12;
                            class293.field4255 = var13;
                        }
                        if (var11.field1995 || var14 < var16 && var15 < var17) {
                            if (var11.field2073 == 0 && var11.field2063 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class202 var20 = (class202) class157.field2349.method2843(1123227612); var20 != null; var20 = (class202) class157.field2349.method2842(1673506446)) {
                                    if (var20.field2970) {
                                        var20.method1510((byte) -13);
                                        var20.field2976.field1976 = false;
                                    }
                                }
                                if (class157.field2338 == 0) {
                                    class250.field3695 = null;
                                    class29.field396 = null;
                                }
                                class81.field990 = 0;
                                class477.field6701 = false;
                                class466.field6530 = false;
                                if (!class19.field260) {
                                    class351.method2190((byte) 26);
                                }
                            }
                            boolean var21;
                            if (class262.field3832.method175(-46) >= var14 && class262.field3832.method177(-96) >= var15 && class262.field3832.method175(-74) < var16 && class262.field3832.method177(98) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class19.field260 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class311.method1924(arg8 - var12, var11, false, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class262.field3832.method176(0) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class419.field5854 != null && class419.field5854.method2157(113) == 0 && class419.field5854.method2162(true) >= var14 && class419.field5854.method2159(-126) >= var15 && class419.field5854.method2162(true) < var16 && class419.field5854.method2159(-125) < var17) {
                                var23 = true;
                            }
                            if (var11.field1982 != null) {
                                for (int var24 = 0; var24 < var11.field1982.length; var24++) {
                                    if (class272.field3959.method2712(2, var11.field1982[var24])) {
                                        if (var11.field2024 == null || class353.field5090 >= var11.field2024[var24]) {
                                            byte var25 = var11.field2014[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class272.field3959.method2712(2, 86) && !class272.field3959.method2712(2, 82) && !class272.field3959.method2712(2, 81)) && ((var25 & 0x2) == 0 || class272.field3959.method2712(2, 86)) && ((var25 & 0x1) == 0 || class272.field3959.method2712(2, 82)) && ((var25 & 0x4) == 0 || class272.field3959.method2712(2, 81))) {
                                                class245.method1539("", var24 + 1, -1, 3188, var11.field1933);
                                                int var26 = var11.field1930[var24];
                                                if (var11.field2024 == null) {
                                                    var11.field2024 = new int[var11.field1982.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field2024[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2024[var24] = class353.field5090 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field2024 != null) {
                                        var11.field2024[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class44.method296(var11, class419.field5854.method2159(-107) - var13, class419.field5854.method2162(true) - var12, (byte) 91);
                            }
                            if (class250.field3695 != null && class250.field3695 != var11 && var21 && method1122(var11).method2320(-115)) {
                                class53.field721 = var11;
                            }
                            if (class29.field396 == var11) {
                                class490.field6899 = true;
                                class346.field5021 = var12;
                                class487.field6862 = var13;
                            }
                            if (var11.field2029 || var11.field2062 != 0) {
                                if (var21 && class166.field2437 != 0 && var11.field2026 != null) {
                                    class202 var27 = new class202();
                                    var27.field2970 = true;
                                    var27.field2976 = var11;
                                    var27.field2972 = class166.field2437;
                                    var27.field2971 = var11.field2026;
                                    class157.field2349.method2845(var27, (byte) 37);
                                }
                                if (class250.field3695 != null || class19.field260 || class435.field6058 != var11.field2062 && class81.field990 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2062 != 0) {
                                    if (class359.field5169 == var11.field2062 || class37.field487 == var11.field2062) {
                                        class197.field2876 = var11;
                                        if (class146.field2100 != null) {
                                            class146.field2100.method1457(class141.field1878, -78, var11.field2021);
                                        }
                                        if (class359.field5169 == var11.field2062) {
                                            if (!class19.field260 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class477.method2793(arg9, 1, arg8, class141.field1878);
                                                for (class260 var28 = (class260) class345.field5017.method1449(123); var28 != null; var28 = (class260) class345.field5017.method1450(0)) {
                                                    if (arg8 >= var28.field3805 && arg8 < var28.field3811 && arg9 >= var28.field3807 && arg9 < var28.field3806) {
                                                        class351.method2190((byte) 26);
                                                        class1.method3(var28.field3808, (byte) 10);
                                                    }
                                                }
                                            }
                                            class132.method831(var12, var11, 1073741824, var13);
                                            continue;
                                        }
                                    }
                                    if (class437.field6082 == var11.field2062) {
                                        if (var11.method911(class141.field1878, (byte) -115) == null || class54.field729 != 0 && class54.field729 != 3 || class19.field260 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field2043[var30];
                                        if (var29 < var31 || var29 > var11.field2064[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field2010 / 2;
                                        int var33 = var30 - var11.field2021 / 2;
                                        int var34;
                                        if (class136.field1807 == 4) {
                                            var34 = (int) class157.field2346 & 0x3FFF;
                                        } else {
                                            var34 = (int) class157.field2346 + class84.field1032 & 0x3FFF;
                                        }
                                        int var35 = class53.field727[var34];
                                        int var36 = class53.field726[var34];
                                        if (class136.field1807 != 4) {
                                            var35 = (class216.field3251 + 256) * var35 >> 8;
                                            var36 = (class216.field3251 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class136.field1807 == 4) {
                                            var39 = (class453.field6393 >> 7) + (var37 >> 2);
                                            var40 = (class317.field4596 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class492.field6935.method918(false) - 1) * 64;
                                            var39 = (class492.field6935.field4331 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class492.field6935.field4317 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class36.field473 && (class328.field4745 & 0x40) != 0) {
                                            class145 var42 = class441.method2598((byte) -127, class255.field3739, class40.field523);
                                            if (var42 == null) {
                                                class382.method2305(-99);
                                            } else {
                                                class265.method1633(48, var11.field2016, var39, var40, 1L, " ->", true, 500, class489.field6894, false, class22.field282);
                                            }
                                            continue;
                                        }
                                        if (class456.field6416 == class410.field5756) {
                                            class265.method1633(44, -1, var39, var40, 1L, "", true, 500, class447.field6187.method2065(97, class326.field4711), false, -1);
                                        }
                                        class265.method1633(47, -1, var39, var40, 1L, "", true, 500, class66.field846, false, -1);
                                        continue;
                                    }
                                    if (class435.field6058 == var11.field2062) {
                                        class307.field4372 = var11;
                                        if (var21) {
                                            class477.field6701 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class419.field5854.method2162(true) - var12 - var11.field2010 / 2) * 2.0D / (double) class395.field5614);
                                            int var44 = (int) (-((double) (class419.field5854.method2159(-113) - var13 - var11.field2021 / 2) * 2.0D / (double) class395.field5614));
                                            int var45 = class128.field1666 + var43 + class395.field5638;
                                            int var46 = class220.field3280 + var44 + class395.field5623;
                                            class179 var47 = class275.method1685(-23037);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1097(var48, var45, -120, var46);
                                            if (var48 != null) {
                                                if (class272.field3959.method2712(2, 82) && class362.field5213 > 0) {
                                                    class382.method2308(var48[0], var48[1], var48[2], -84);
                                                    continue;
                                                }
                                                class466.field6530 = true;
                                                class303.field4315 = var48[0];
                                                class356.field5150 = var48[1];
                                                class111.field1399 = var48[2];
                                            }
                                            class81.field990 = 1;
                                            class477.field6698 = false;
                                            class302.field4304 = class262.field3832.method175(-49);
                                            field2620 = class262.field3832.method177(60);
                                            continue;
                                        }
                                        if (var22 && class81.field990 > 0) {
                                            if (class81.field990 == 1 && (class302.field4304 != class262.field3832.method175(-107) || field2620 != class262.field3832.method177(-99))) {
                                                class169.field2470 = class128.field1666;
                                                class318.field4608 = class220.field3280;
                                                class81.field990 = 2;
                                            }
                                            if (class81.field990 == 2) {
                                                class477.field6698 = true;
                                                class259.method1612(class169.field2470 + (int) ((double) (class302.field4304 - class262.field3832.method175(-89)) * 2.0D / (double) class395.field5615), (byte) 49);
                                                class178.method1089(false, class318.field4608 - (int) ((double) (field2620 - class262.field3832.method177(-108)) * 2.0D / (double) class395.field5615));
                                            }
                                            continue;
                                        }
                                        if (class81.field990 > 0 && !class477.field6698) {
                                            if ((class26.field339 == 1 || class253.method1577((byte) 117)) && class476.field6690 > 2) {
                                                class482.method2820((byte) -96, class302.field4304, field2620);
                                            } else if (class231.method1468(0)) {
                                                class482.method2820((byte) -86, class302.field4304, field2620);
                                            }
                                        }
                                        class81.field990 = 0;
                                        continue;
                                    }
                                    if (class99.field1274 == var11.field2062) {
                                        if (var22) {
                                            class267.method1642(var11.field2010, class262.field3832.method175(-121) - var12, (byte) 99, class262.field3832.method177(93) - var13, var11.field2021);
                                        }
                                        continue;
                                    }
                                    if (class253.field3721 == var11.field2062) {
                                        class304.method1883(97, var11, var13, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2038 && var23) {
                                    var11.field2038 = true;
                                    if (var11.field1942 != null) {
                                        class202 var49 = new class202();
                                        var49.field2970 = true;
                                        var49.field2976 = var11;
                                        var49.field2966 = class419.field5854.method2162(true) - var12;
                                        var49.field2972 = class419.field5854.method2159(-83) - var13;
                                        var49.field2971 = var11.field1942;
                                        class157.field2349.method2845(var49, (byte) 37);
                                    }
                                }
                                if (var11.field2038 && var22 && var11.field2008 != null) {
                                    class202 var50 = new class202();
                                    var50.field2970 = true;
                                    var50.field2976 = var11;
                                    var50.field2966 = class262.field3832.method175(-86) - var12;
                                    var50.field2972 = class262.field3832.method177(-89) - var13;
                                    var50.field2971 = var11.field2008;
                                    class157.field2349.method2845(var50, (byte) 37);
                                }
                                if (var11.field2038 && !var22) {
                                    var11.field2038 = false;
                                    if (var11.field1981 != null) {
                                        class202 var51 = new class202();
                                        var51.field2970 = true;
                                        var51.field2976 = var11;
                                        var51.field2966 = class262.field3832.method175(-98) - var12;
                                        var51.field2972 = class262.field3832.method177(75) - var13;
                                        var51.field2971 = var11.field1981;
                                        class23.field298.method2845(var51, (byte) 37);
                                    }
                                }
                                if (var22 && var11.field2015 != null) {
                                    class202 var52 = new class202();
                                    var52.field2970 = true;
                                    var52.field2976 = var11;
                                    var52.field2966 = class262.field3832.method175(-41) - var12;
                                    var52.field2972 = class262.field3832.method177(-71) - var13;
                                    var52.field2971 = var11.field2015;
                                    class157.field2349.method2845(var52, (byte) 37);
                                }
                                if (!var11.field1976 && var21) {
                                    var11.field1976 = true;
                                    if (var11.field1955 != null) {
                                        class202 var53 = new class202();
                                        var53.field2970 = true;
                                        var53.field2976 = var11;
                                        var53.field2966 = class262.field3832.method175(-83) - var12;
                                        var53.field2972 = class262.field3832.method177(43) - var13;
                                        var53.field2971 = var11.field1955;
                                        class157.field2349.method2845(var53, (byte) 37);
                                    }
                                }
                                if (var11.field1976 && var21 && var11.field2076 != null) {
                                    class202 var54 = new class202();
                                    var54.field2970 = true;
                                    var54.field2976 = var11;
                                    var54.field2966 = class262.field3832.method175(-73) - var12;
                                    var54.field2972 = class262.field3832.method177(-125) - var13;
                                    var54.field2971 = var11.field2076;
                                    class157.field2349.method2845(var54, (byte) 37);
                                }
                                if (var11.field1976 && !var21) {
                                    var11.field1976 = false;
                                    if (var11.field2027 != null) {
                                        class202 var55 = new class202();
                                        var55.field2970 = true;
                                        var55.field2976 = var11;
                                        var55.field2966 = class262.field3832.method175(-48) - var12;
                                        var55.field2972 = class262.field3832.method177(49) - var13;
                                        var55.field2971 = var11.field2027;
                                        class23.field298.method2845(var55, (byte) 37);
                                    }
                                }
                                if (var11.field1924 != null) {
                                    class202 var56 = new class202();
                                    var56.field2976 = var11;
                                    var56.field2971 = var11.field1924;
                                    class408.field5717.method2845(var56, (byte) 37);
                                }
                                if (var11.field1923 != null && class204.field3044 > var11.field1935) {
                                    if (var11.field2025 == null || class204.field3044 - var11.field1935 > 32) {
                                        class202 var61 = new class202();
                                        var61.field2976 = var11;
                                        var61.field2971 = var11.field1923;
                                        class157.field2349.method2845(var61, (byte) 37);
                                    } else {
                                        label672: for (int var57 = var11.field1935; var57 < class204.field3044; var57++) {
                                            int var58 = class332.field4821[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field2025.length; var59++) {
                                                if (var11.field2025[var59] == var58) {
                                                    class202 var60 = new class202();
                                                    var60.field2976 = var11;
                                                    var60.field2971 = var11.field1923;
                                                    class157.field2349.method2845(var60, (byte) 37);
                                                    break label672;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1935 = class204.field3044;
                                }
                                if (var11.field1979 != null && class398.field5647 > var11.field2002) {
                                    if (var11.field2065 == null || class398.field5647 - var11.field2002 > 32) {
                                        class202 var66 = new class202();
                                        var66.field2976 = var11;
                                        var66.field2971 = var11.field1979;
                                        class157.field2349.method2845(var66, (byte) 37);
                                    } else {
                                        label648: for (int var62 = var11.field2002; var62 < class398.field5647; var62++) {
                                            int var63 = class289.field4209[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field2065.length; var64++) {
                                                if (var11.field2065[var64] == var63) {
                                                    class202 var65 = new class202();
                                                    var65.field2976 = var11;
                                                    var65.field2971 = var11.field1979;
                                                    class157.field2349.method2845(var65, (byte) 37);
                                                    break label648;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2002 = class398.field5647;
                                }
                                if (var11.field1996 != null && class368.field5318 > var11.field2051) {
                                    if (var11.field1970 == null || class368.field5318 - var11.field2051 > 32) {
                                        class202 var71 = new class202();
                                        var71.field2976 = var11;
                                        var71.field2971 = var11.field1996;
                                        class157.field2349.method2845(var71, (byte) 37);
                                    } else {
                                        label624: for (int var67 = var11.field2051; var67 < class368.field5318; var67++) {
                                            int var68 = class272.field3967[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field1970.length; var69++) {
                                                if (var11.field1970[var69] == var68) {
                                                    class202 var70 = new class202();
                                                    var70.field2976 = var11;
                                                    var70.field2971 = var11.field1996;
                                                    class157.field2349.method2845(var70, (byte) 37);
                                                    break label624;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2051 = class368.field5318;
                                }
                                if (var11.field2057 != null && class451.field6238 > var11.field1972) {
                                    if (var11.field2012 == null || class451.field6238 - var11.field1972 > 32) {
                                        class202 var76 = new class202();
                                        var76.field2976 = var11;
                                        var76.field2971 = var11.field2057;
                                        class157.field2349.method2845(var76, (byte) 37);
                                    } else {
                                        label600: for (int var72 = var11.field1972; var72 < class451.field6238; var72++) {
                                            int var73 = class220.field3281[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field2012.length; var74++) {
                                                if (var11.field2012[var74] == var73) {
                                                    class202 var75 = new class202();
                                                    var75.field2976 = var11;
                                                    var75.field2971 = var11.field2057;
                                                    class157.field2349.method2845(var75, (byte) 37);
                                                    break label600;
                                                }
                                            }
                                        }
                                    }
                                    var11.field1972 = class451.field6238;
                                }
                                if (var11.field1945 != null && class243.field3625 > var11.field2004) {
                                    if (var11.field2019 == null || class243.field3625 - var11.field2004 > 32) {
                                        class202 var81 = new class202();
                                        var81.field2976 = var11;
                                        var81.field2971 = var11.field1945;
                                        class157.field2349.method2845(var81, (byte) 37);
                                    } else {
                                        label576: for (int var77 = var11.field2004; var77 < class243.field3625; var77++) {
                                            int var78 = class160.field2375[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field2019.length; var79++) {
                                                if (var11.field2019[var79] == var78) {
                                                    class202 var80 = new class202();
                                                    var80.field2976 = var11;
                                                    var80.field2971 = var11.field1945;
                                                    class157.field2349.method2845(var80, (byte) 37);
                                                    break label576;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2004 = class243.field3625;
                                }
                                if (class209.field3183 > var11.field1973 && var11.field2003 != null) {
                                    class202 var82 = new class202();
                                    var82.field2976 = var11;
                                    var82.field2971 = var11.field2003;
                                    class157.field2349.method2845(var82, (byte) 37);
                                }
                                if (class99.field1271 > var11.field1973 && var11.field2046 != null) {
                                    class202 var83 = new class202();
                                    var83.field2976 = var11;
                                    var83.field2971 = var11.field2046;
                                    class157.field2349.method2845(var83, (byte) 37);
                                }
                                if (class347.field5024 > var11.field1973 && var11.field1922 != null) {
                                    class202 var84 = new class202();
                                    var84.field2976 = var11;
                                    var84.field2971 = var11.field1922;
                                    class157.field2349.method2845(var84, (byte) 37);
                                }
                                if (class345.field5014 > var11.field1973 && var11.field2060 != null) {
                                    class202 var85 = new class202();
                                    var85.field2976 = var11;
                                    var85.field2971 = var11.field2060;
                                    class157.field2349.method2845(var85, (byte) 37);
                                }
                                if (class304.field4327 > var11.field1973 && var11.field1925 != null) {
                                    class202 var86 = new class202();
                                    var86.field2976 = var11;
                                    var86.field2971 = var11.field1925;
                                    class157.field2349.method2845(var86, (byte) 37);
                                }
                                var11.field1973 = class27.field367;
                                if (var11.field2068 != null) {
                                    for (int var87 = 0; var87 < class370.field5340; var87++) {
                                        class202 var88 = new class202();
                                        var88.field2976 = var11;
                                        var88.field2973 = class153.field2265[var87].method368((byte) -75);
                                        var88.field2978 = class153.field2265[var87].method367((byte) 116);
                                        var88.field2971 = var11.field2068;
                                        class157.field2349.method2845(var88, (byte) 37);
                                    }
                                }
                                if (class481.field6775 && var11.field2018 != null) {
                                    class202 var89 = new class202();
                                    var89.field2976 = var11;
                                    var89.field2971 = var11.field2018;
                                    class157.field2349.method2845(var89, (byte) 37);
                                }
                            }
                            if (var11.field2073 == 5 && var11.field1940 != -1) {
                                var11.method909(class230.field3481, class326.field4700, (byte) 102).method1457(class141.field1878, -125, var11.field2021);
                            }
                            class278.method1761(var11, -124);
                            if (var11.field2073 == 0) {
                                method1119(arg0, var11.field1933, var14, var15, var16, var17, var12 - var11.field2072, var13 - var11.field1938, arg8, arg9);
                                if (var11.field1943 != null) {
                                    method1119(var11.field1943, var11.field1933, var14, var15, var16, var17, var12 - var11.field2072, var13 - var11.field1938, arg8, arg9);
                                }
                                class465 var90 = (class465) class146.field2146.method2761((long) var11.field1933, (byte) -112);
                                if (var90 != null) {
                                    if (class95.field1225 == class456.field6416 && var90.field6500 == 0 && !class19.field260 && var21 && !class342.field4986) {
                                        class351.method2190((byte) 26);
                                    }
                                    class244.method1536(var16, arg8, var14, var13, var90.field6502, var12, arg9, (byte) 28, var17, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class278.method1761(var11, -112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method1120(byte arg0) {
        field2616++;
        if (!class314.field4438.field5781) {
            for (int var2 = 0; var2 < class370.field5340; var2++) {
                if (class153.field2265[var2].method367((byte) -28) == 's' || class153.field2265[var2].method367((byte) -112) == 'S') {
                    class314.field4438.field5781 = true;
                    break;
                }
            }
        }
        if (class438.field6092 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class433.method2562(arg0 - 2036);
            if (class40.field522 == 0L) {
                class40.field522 = var5;
            }
            if (var4 > 16384 && var5 - class40.field522 < 5000L) {
                if ((var5 - class327.field4737) > 1000L) {
                    System.gc();
                    class327.field4737 = var5;
                }
                class216.field3247 = class102.field1292.method2065(-122, class326.field4711);
                class78.field966 = 5;
            } else {
                class216.field3247 = class178.field2550.method2065(arg0 ^ 0x70, class326.field4711);
                class78.field966 = 5;
                class438.field6092 = 10;
            }
        } else if (class438.field6092 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class422.field5918[var7] = class485.method2835(class287.field4181, true, class58.field758);
            }
            class216.field3247 = class418.field5841.method2065(arg0 ^ 0x71, class326.field4711);
            class78.field966 = 10;
            class438.field6092 = 20;
        } else if (class438.field6092 == 20) {
            if (class421.field5880 == null) {
                class421.field5880 = new class191(class289.field4210, class235.field3533);
            }
            if (class421.field5880.method1183(63)) {
                class414.field5821 = class54.method340((byte) -128, 1, false, 0, true);
                class8.field81 = class54.method340((byte) -126, 1, false, 1, true);
                class66.field842 = class54.method340((byte) -119, 1, false, 2, true);
                class268.field3921 = class54.method340((byte) -123, 1, false, 3, true);
                class258.field3769 = class54.method340((byte) -120, 1, false, 4, true);
                class303.field4311 = class54.method340((byte) -125, 1, true, 5, true);
                class360.field5189 = class54.method340((byte) -128, 1, true, 6, false);
                class65.field840 = class54.method340((byte) -122, 1, false, 7, true);
                class407.field5716 = class54.method340((byte) -122, 1, false, 8, true);
                class355.field5139 = class54.method340((byte) -128, 1, false, 9, true);
                class323.field4668 = class54.method340((byte) -128, 1, false, 10, true);
                class157.field2337 = class54.method340((byte) -127, 1, false, 11, true);
                class480.field6733 = class54.method340((byte) -124, 1, false, 12, true);
                class347.field5025 = class54.method340((byte) -125, 1, false, 13, true);
                class479.field6720 = class54.method340((byte) -126, 1, false, 14, false);
                class135.field1800 = class54.method340((byte) -126, 1, false, 15, true);
                class360.field5187 = class54.method340((byte) -118, 1, false, 16, true);
                class306.field4359 = class54.method340((byte) -122, 1, false, 17, true);
                class227.field3434 = class54.method340((byte) -127, 1, false, 18, true);
                class359.field5162 = class54.method340((byte) -127, 1, false, 19, true);
                class184.field2717 = class54.method340((byte) -124, 1, false, 20, true);
                class410.field5758 = class54.method340((byte) -125, 1, false, 21, true);
                class66.field848 = class54.method340((byte) -122, 1, false, 22, true);
                class120.field1512 = class54.method340((byte) -118, 1, true, 23, true);
                class318.field4615 = class54.method340((byte) -127, 1, false, 24, true);
                class15.field182 = class54.method340((byte) -118, 1, false, 25, true);
                class481.field6781 = class54.method340((byte) -123, 1, true, 26, true);
                class328.field4750 = class54.method340((byte) -125, 1, false, 27, true);
                class99.field1264 = class54.method340((byte) -124, 1, true, 28, true);
                class216.field3247 = class245.field3637.method2065(-110, class326.field4711);
                class78.field966 = 15;
                class438.field6092 = 30;
            } else {
                class216.field3247 = class460.field6459.method2065(-128, class326.field4711);
                class78.field966 = 12;
            }
        } else if (class438.field6092 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class491.field6927[var9].method2812(19702) * field2602[var9] / 100;
            }
            if (var8 == 100) {
                class216.field3247 = class225.field3417.method2065(arg0 ^ 0xFFFFFFCC, class326.field4711);
                class78.field966 = 20;
                class279.method1765(class407.field5716, 87);
                class385.method2321(127, class407.field5716);
                class438.field6092 = 40;
            } else {
                if (var8 != 0) {
                    class216.field3247 = class150.field2242.method2065(126, class326.field4711) + var8 + "%";
                }
                class78.field966 = 20;
            }
        } else if (class438.field6092 == 40) {
            if (class99.field1264.method1251(118)) {
                this.method1123(true, class99.field1264.method1228(1, 100));
                class216.field3247 = class77.field942.method2065(87, class326.field4711);
                class438.field6092 = 50;
                class78.field966 = 25;
            } else {
                class216.field3247 = class161.field2379.method2065(-104, class326.field4711) + class99.field1264.method1229((byte) -53) + "%";
                class78.field966 = 25;
            }
        } else if (class438.field6092 == 50) {
            class208.method1359(class314.field4438.field5777, 2, 22050, 126);
            class157.field2345 = new class125();
            class157.field2345.method775(9, 128, 93);
            class28.field381 = class422.method2485(256, 0, 22050, class465.field6503, class252.field3718);
            class28.field381.method2484((byte) 112, class157.field2345);
            class491.method2886(class157.field2345, class479.field6720, class258.field3769, class135.field1800, 82);
            class116.field1481 = class422.method2485(256, 1, 2048, class465.field6503, class252.field3718);
            class59.field796 = new class432();
            class116.field1481.method2484((byte) 101, class59.field796);
            class220.field3282 = new class160(22050, class31.field409);
            class326.field4699 = class360.field5189.method1234(false, "scape main");
            class216.field3247 = class23.field307.method2065(-119, class326.field4711);
            class78.field966 = 30;
            class438.field6092 = 60;
        } else if (class438.field6092 == 60) {
            int var10 = class229.method1458(class347.field5025, class407.field5716, (byte) 50);
            int var11 = class327.method2071((byte) 42);
            if (var10 < var11) {
                class216.field3247 = class227.field3432.method2065(-103, class326.field4711) + var10 * 100 / var11 + "%";
                class78.field966 = 35;
            } else {
                class216.field3247 = class80.field976.method2065(arg0 - 125, class326.field4711);
                class78.field966 = 35;
                class438.field6092 = 70;
            }
        } else if (class438.field6092 == 70) {
            int var12 = class15.method112((byte) 6, class407.field5716);
            int var13 = class442.method2600(-4967);
            if (var12 < var13) {
                class216.field3247 = class291.field4245.method2065(arg0 ^ 0x71, class326.field4711) + var12 * 100 / var13 + "%";
                class78.field966 = 40;
            } else {
                class216.field3247 = class265.field3861.method2065(arg0 ^ 0x73, class326.field4711);
                class438.field6092 = 80;
                class78.field966 = 40;
            }
        } else if (class438.field6092 == 80) {
            if (class481.field6781.method1251(91)) {
                class58.field766 = new class173(class481.field6781, class355.field5139, class407.field5716);
                class216.field3247 = class318.field4612.method2065(-127, class326.field4711);
                class78.field966 = 45;
                class438.field6092 = 90;
            } else {
                class216.field3247 = class314.field4439.method2065(-110, class326.field4711) + class481.field6781.method1229((byte) -53) + "%";
                class78.field966 = 45;
            }
        } else if (class438.field6092 == 90) {
            class216.field3247 = class55.field746.method2065(-121, class326.field4711);
            class78.field966 = 50;
            class438.field6092 = 95;
        } else if (class438.field6092 == 95) {
            if (class314.field4438.field5781) {
                class314.field4438.field5787 = 0;
                class314.field4438.field5785 = 0;
                class314.field4438.field5800 = 1;
                class314.field4438.field5792 = 0;
                class314.field4438.field5778 = 0;
            }
            class314.field4438.field5781 = true;
            class314.field4438.method1177(class252.field3718, (byte) 105);
            class45.method298(false, class314.field4438.field5787, (byte) -109);
            class216.field3247 = class226.field3422.method2065(-107, class326.field4711);
            class78.field966 = 55;
            class438.field6092 = 100;
        } else if (class438.field6092 == 100) {
            class149.method942(class141.field1878, 0, class407.field5716, class347.field5025);
            class216.field3247 = class328.field4743.method2065(arg0 ^ 0xFFFFFFC0, class326.field4711);
            class78.field966 = 60;
            class211.method1368((byte) -91, 5);
            class438.field6092 = 110;
        } else if (class438.field6092 == 110) {
            byte var14 = 0;
            class66.field842.method1251(-2);
            int var15 = var14 + class66.field842.method1229((byte) -53);
            class360.field5187.method1251(-13);
            int var16 = var15 + class360.field5187.method1229((byte) -53);
            class306.field4359.method1251(-127);
            int var17 = var16 + class306.field4359.method1229((byte) -53);
            class227.field3434.method1251(arg0 + 14);
            int var18 = var17 + class227.field3434.method1229((byte) -53);
            class359.field5162.method1251(arg0 ^ 0xFFFFFFC1);
            int var19 = var18 + class359.field5162.method1229((byte) -53);
            class184.field2717.method1251(30);
            int var20 = var19 + class184.field2717.method1229((byte) -53);
            class410.field5758.method1251(-127);
            int var21 = var20 + class410.field5758.method1229((byte) -53);
            class66.field848.method1251(-126);
            int var22 = var21 + class66.field848.method1229((byte) -53);
            class318.field4615.method1251(-123);
            int var23 = var22 + class318.field4615.method1229((byte) -53);
            class15.field182.method1251(-126);
            int var24 = var23 + class15.field182.method1229((byte) -53);
            class328.field4750.method1251(-125);
            int var25 = var24 + class328.field4750.method1229((byte) -53);
            if (var25 < 1100) {
                class216.field3247 = class434.field6056.method2065(arg0 ^ 0xFFFFFF9A, class326.field4711) + var25 / 11 + "%";
                class78.field966 = 65;
            } else {
                class408.field5734 = new class245(class456.field6416, class326.field4711, class66.field842);
                class459.field6436 = new class67(class456.field6416, class326.field4711, class66.field842);
                class318.field4613 = new class210(class456.field6416, class326.field4711, class66.field842, class407.field5716);
                class232.field3513 = new class339(class456.field6416, class326.field4711, class306.field4359);
                class377.field5429 = new class51(class456.field6416, class326.field4711, class66.field842);
                class454.field6395 = new class211(class456.field6416, class326.field4711, class66.field842);
                class427.field5982 = new class280(class456.field6416, class326.field4711, class66.field842, class65.field840);
                class58.field783 = new class105(class456.field6416, class326.field4711, class66.field842);
                class413.field5808 = new class377(class456.field6416, class326.field4711, class66.field842);
                class156.field2325 = new class128(class456.field6416, class326.field4711, true, class360.field5187, class65.field840);
                class251.field3705 = new class87(class456.field6416, class326.field4711, class66.field842, class407.field5716);
                class411.field5770 = new class28(class456.field6416, class326.field4711, class66.field842, class407.field5716);
                class265.field3859 = new class480(class456.field6416, class326.field4711, true, class227.field3434, class65.field840);
                class64.field834 = new class338(class456.field6416, class326.field4711, true, class408.field5734, class359.field5162, class65.field840);
                class177.field2544 = new class27(class456.field6416, class326.field4711, class66.field842);
                class64.field836 = new class329(class456.field6416, class326.field4711, class184.field2717, class414.field5821, class8.field81);
                class326.field4700 = new class317(class456.field6416, class326.field4711, class66.field842);
                class230.field3481 = new class251(class456.field6416, class326.field4711, class66.field842);
                class324.field4674 = new class204(class456.field6416, class326.field4711, class410.field5758, class65.field840);
                class377.field5424 = new class334(class456.field6416, class326.field4711, class66.field842);
                class446.field6178 = new class154(class456.field6416, class326.field4711, class66.field842);
                class179.field2584 = new class95(class456.field6416, class326.field4711, class66.field842);
                class467.field6582 = new class180(class456.field6416, class326.field4711, class66.field848);
                class229.field3460 = new class89(class456.field6416, class326.field4711, class66.field842);
                class240.method1521(class65.field840, class407.field5716, -102, class347.field5025, class268.field3921);
                class422.method2486(class15.field182, new class3(), arg0 - 253, class318.field4615);
                class94.method537(arg0 - 674700149, class318.field4615, class15.field182);
                class216.field3247 = class361.field5197.method2065(115, class326.field4711);
                class78.field966 = 65;
                class466.method2735((byte) 124);
                class156.field2325.method802(!class314.field4438.method1174((byte) 58, class437.field6083), (byte) 127);
                class140.field1859 = new class460();
                class170.method1055((byte) -54);
                class262.method1621(1, class328.field4750);
                class332.method2101(arg0 - 124, class58.field766, class65.field840);
                class438.field6092 = 120;
            }
        } else {
            if (arg0 != -3) {
                field2623 = null;
            }
            if (class438.field6092 == 120) {
                int var26 = class100.method568(class407.field5716, (byte) -60);
                int var27 = class438.method2578(-1);
                if (var27 > var26) {
                    class216.field3247 = class337.field4909.method2065(-92, class326.field4711) + var26 * 100 / var27 + "%";
                    class78.field966 = 70;
                } else {
                    class314.method1944(class407.field5716, (byte) 122, class141.field1878);
                    class485.method2832(class243.field3627, arg0 + 55);
                    class216.field3247 = class374.field5392.method2065(arg0 ^ 0xFFFFFFAB, class326.field4711);
                    class78.field966 = 70;
                    class438.field6092 = 130;
                }
            } else if (class438.field6092 == 130) {
                if (class323.field4668.method1259("huffman", (byte) -38, "")) {
                    class306 var28 = new class306(class323.field4668.method1245("huffman", "", (byte) -26));
                    class76.method443(var28, arg0 + 3);
                    class216.field3247 = class170.field2483.method2065(38, class326.field4711);
                    class438.field6092 = 140;
                    class78.field966 = 75;
                } else {
                    class216.field3247 = class407.field5715.method2065(-94, class326.field4711) + "0%";
                    class78.field966 = 75;
                }
            } else if (class438.field6092 == 140) {
                if (class268.field3921.method1251(24)) {
                    class216.field3247 = class410.field5753.method2065(71, class326.field4711);
                    class438.field6092 = 150;
                    class78.field966 = 80;
                } else {
                    class216.field3247 = class453.field6390.method2065(48, class326.field4711) + class268.field3921.method1229((byte) -53) + "%";
                    class78.field966 = 80;
                }
            } else if (class438.field6092 == 150) {
                if (class480.field6733.method1251(-125)) {
                    class216.field3247 = class179.field2577.method2065(-97, class326.field4711);
                    class78.field966 = 82;
                    class438.field6092 = 160;
                } else {
                    class216.field3247 = class373.field5379.method2065(arg0 ^ 0x6E, class326.field4711) + class480.field6733.method1229((byte) -53) + "%";
                    class78.field966 = 82;
                }
            } else if (class438.field6092 == 160) {
                if (class347.field5025.method1251(-125)) {
                    class216.field3247 = class225.field3419.method2065(77, class326.field4711);
                    class78.field966 = 85;
                    class438.field6092 = 170;
                } else {
                    class216.field3247 = class225.field3419.method2065(120, class326.field4711) + class347.field5025.method1229((byte) -53) + "%";
                    class78.field966 = 85;
                }
            } else if (class438.field6092 == 170) {
                if (class120.field1512.method1253(22473, "details")) {
                    class395.method2363(class120.field1512, class377.field5429, class454.field6395, class156.field2325, class251.field3705, class411.field5770, class140.field1859);
                    class216.field3247 = class421.field5878.method2065(arg0 + 117, class326.field4711);
                    class78.field966 = 89;
                    class438.field6092 = 180;
                } else {
                    class216.field3247 = class247.field3657.method2065(76, class326.field4711) + class120.field1512.method1255(0, "details") + "%";
                    class78.field966 = 87;
                }
            } else if (class438.field6092 == 180) {
                int var29 = class118.method733(27106);
                if (var29 == -1) {
                    class216.field3247 = class141.field1880.method2065(80, class326.field4711);
                    class78.field966 = 90;
                } else if (var29 == 7 || var29 == 9) {
                    this.method1262(-2, "worldlistfull");
                    class211.method1368((byte) -35, 1000);
                } else if (class470.field6623) {
                    class216.field3247 = class365.field5252.method2065(arg0 ^ 0xFFFFFFC7, class326.field4711);
                    class438.field6092 = 190;
                    class78.field966 = 90;
                } else {
                    this.method1262(-2, "worldlistio_" + var29);
                    class211.method1368((byte) -81, 1000);
                }
            } else if (class438.field6092 == 190) {
                class146.field2102 = new boolean[class179.field2584.field1223];
                class339.field4954 = new String[class446.field6178.field2290];
                class156.field2320 = new int[class179.field2584.field1223];
                for (int var30 = 0; var30 < class179.field2584.field1223; var30++) {
                    if (class179.field2584.method540((byte) -90, var30).field720 == 0) {
                        class146.field2102[var30] = true;
                        class363.field5226++;
                    }
                    class156.field2320[var30] = -1;
                }
                class62.method389(116);
                class138.field1814 = class268.field3921.method1234(false, "loginscreen");
                class303.field4311.method1241((byte) 125, false, true);
                class360.field5189.method1241((byte) 125, true, true);
                class407.field5716.method1241((byte) 125, true, true);
                class347.field5025.method1241((byte) 125, true, true);
                class323.field4668.method1241((byte) 125, true, true);
                class268.field3921.method1241((byte) 125, true, true);
                class272.field3970 = true;
                class66.field842.field2925 = 2;
                class306.field4359.field2925 = 2;
                class360.field5187.field2925 = 2;
                class227.field3434.field2925 = 2;
                class359.field5162.field2925 = 2;
                class184.field2717.field2925 = 2;
                class410.field5758.field2925 = 2;
                class327.method2075(class314.field4438.field5800, -1, arg0 ^ -3, false, -1);
                class216.field3247 = class451.field6230.method2065(-108, class326.field4711);
                class78.field966 = 95;
                class438.field6092 = 200;
            } else if (class438.field6092 == 200) {
                class116.method728(true, 6656);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method1121(int arg0, int arg1) {
        class33.field425 = 0;
        field2615++;
        class289.field4210.field790++;
        class289.field4210.field789 = arg1;
        if (arg0 != 13063) {
            method1109(-116, 22);
        }
        class232.field3503 = null;
        class275.field3987 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ldt;)Lvs;")
    public static final class385 method1122(class145 arg0) {
        class385 var1 = (class385) class34.field443.method2761(((long) arg0.field1933 << 32) + (long) arg0.field1951, (byte) -112);
        return var1 == null ? arg0.field2070 : var1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[B)V")
    private final void method1123(boolean arg0, byte[] arg1) {
        field2607++;
        class276 var3 = new class276(arg1);
        while (true) {
            while (true) {
                int var4 = var3.method1701(-23121);
                if (var4 == 0) {
                    if (!arg0) {
                        field2610 = -116;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class313.field4423 = new int[6];
                    var5[0] = var3.method1729(65280);
                    var5[1] = var3.method1729(65280);
                    var5[2] = var3.method1729(65280);
                    var5[3] = var3.method1729(65280);
                    var5[4] = var3.method1729(65280);
                    var5[5] = var3.method1729(65280);
                } else if (var4 == 4) {
                    int var8 = var3.method1701(-23121);
                    class344.field5007 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class344.field5007[var9] = var3.method1729(65280);
                        if (class344.field5007[var9] == 65535) {
                            class344.field5007[var9] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var6 = var3.method1701(-23121);
                    class238.field3578 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class238.field3578[var7] = var3.method1729(65280);
                        if (class238.field3578[var7] == 65535) {
                            class238.field3578[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1124(int arg0) {
        field2600++;
        if (arg0 < 5) {
            method1122((class145) null);
        }
        boolean var2 = class289.field4210.method356(false);
        if (!var2) {
            this.method1111((byte) -112);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2609++;
        if (!this.method1270((byte) 75)) {
            return;
        }
        class404.field5697 = Integer.parseInt(this.getParameter("worldid"));
        class394.field5599 = class125.method783(Integer.parseInt(this.getParameter("modewhere")), 32);
        if (!class187.method1154(121, class394.field5599) && class394.field5599 != class356.field5143) {
            class394.field5599 = class356.field5143;
        }
        class120.field1504 = class118.method734(Integer.parseInt(this.getParameter("modewhat")), 4236);
        if (class368.field5315 != class120.field1504 && class344.field5002 != class120.field1504 && class237.field3557 != class120.field1504) {
            class120.field1504 = class237.field3557;
        }
        try {
            class326.field4711 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class326.field4711 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class144.field1910 = true;
        } else {
            class144.field1910 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class370.field5341 = true;
        } else {
            class370.field5341 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class310.field4387 = true;
        } else {
            class310.field4387 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class456.field6416 = class410.field5756;
        } else {
            class456.field6416 = class95.field1225;
        }
        try {
            class36.field466 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class36.field466 = 0;
        }
        class20.field274 = this.getParameter("quiturl");
        class347.field5028 = this.getParameter("settings");
        if (class347.field5028 == null) {
            class347.field5028 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class277.field4086 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class277.field4086 = 0;
            }
        }
        class163.field2416 = Integer.parseInt(this.getParameter("colourid"));
        if (class163.field2416 < 0 || class163.field2416 >= class31.field415.length) {
            class163.field2416 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class244.field3628 = true;
            class241.field3612 = true;
        }
        if (class95.field1225 == class456.field6416) {
            class202.field2968 = 503;
            class350.field5069 = 765;
        } else if (class456.field6416 == class410.field5756) {
            class350.field5069 = 640;
            class202.field2968 = 480;
        }
        class76.field936 = this;
        this.method1273(577, class202.field2968, class120.field1504.method318((byte) -101) + 32, 127, class350.field5069);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ldt;)Z")
    public static final boolean method1125(class145 arg0) {
        if (class342.field4986) {
            if (method1122(arg0).field5472 != 0) {
                return false;
            }
            if (arg0.field2073 == 0) {
                return false;
            }
        }
        return arg0.field1963;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    private final void method1126(boolean arg0) {
        class332.field4840++;
        field2618++;
        class132.method831(-1, (class145) null, 1073741824, -1);
        class304.method1883(93, (class145) null, -1, -1);
        class69.method413(-121);
        class27.field367++;
        if (!arg0) {
            method1119((class145[]) null, 8, 102, -13, -53, 10, -22, 19, -27, 92);
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            class216 var12 = class139.field1851[var2];
            if (var12 != null) {
                byte var13 = var12.field3232.field6528;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method918(!arg0);
                    if ((var13 & 0x2) != 0 && var12.field2168 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field2163[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if (class58.field758 - var14 - 1 < var17) {
                                var17 = class58.field758 - (var14 + 1);
                            }
                            int var18 = var12.field2159[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (class287.field4181 - var14 - 1 < var18) {
                                var18 = class287.field4181 - var14 - 1;
                            }
                            int var19 = class239.method1518(true, var17, var14, class126.field1650, var12.field2163[0], 0, var18, class426.field5971, var14, 0, (byte) 119, var14, -1, class422.field5918[var12.field4319], var12.field2159[0]);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field2163[var20] = class126.field1650[var19 - var20 - 1];
                                    var12.field2159[var20] = class426.field5971[var19 - var20 - 1];
                                    var12.field2166[var20] = 1;
                                }
                                var12.field2168 = var19;
                            }
                        }
                    }
                    class411.method2428((byte) 66, var12, true);
                    int var21 = class171.method1059(-118, var12);
                    class43.method286(class37.field476, arg0, var21, var12, class90.field1124);
                    class334.method2110(var12, -74);
                }
            }
        }
        if (class278.field4092 == 0 && class120.field1507 == 0) {
            if (class136.field1807 == 2) {
                class160.method995(1000);
            } else {
                class434.method2564(3);
            }
            if (class490.field6904 >> 7 < 14 || class490.field6904 >> 7 >= class58.field758 - 14 || (class343.field4996 >> 7) < 14 || class287.field4181 - 14 <= class343.field4996 >> 7) {
                class349.method2183((byte) -100);
            }
        }
        while (true) {
            class202 var3;
            class145 var4;
            class145 var5;
            do {
                var3 = (class202) class408.field5717.method2839(-31216);
                if (var3 == null) {
                    while (true) {
                        class202 var6;
                        class145 var7;
                        class145 var8;
                        do {
                            var6 = (class202) class23.field298.method2839(-31216);
                            if (var6 == null) {
                                while (true) {
                                    class202 var9;
                                    class145 var10;
                                    class145 var11;
                                    do {
                                        var9 = (class202) class157.field2349.method2839(-31216);
                                        if (var9 == null) {
                                            if (class250.field3695 != null) {
                                                class55.method345((byte) -128);
                                            }
                                            if (class353.field5090 % 1500 == 0) {
                                                class114.method723((byte) 113);
                                            }
                                            class30.method216(-63);
                                            if (class29.field391 && class266.field3893 < (class433.method2562(-2039) - 60000L)) {
                                                class48.method317((byte) -121);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field2976;
                                        if (var10.field1951 < 0) {
                                            break;
                                        }
                                        var11 = class166.method1028(var10.field1947, 72);
                                    } while (var11 == null || var11.field1943 == null || var10.field1951 >= var11.field1943.length || var11.field1943[var10.field1951] != var10);
                                    class290.method1818(var9);
                                }
                            }
                            var7 = var6.field2976;
                            if (var7.field1951 < 0) {
                                break;
                            }
                            var8 = class166.method1028(var7.field1947, 108);
                        } while (var8 == null || var8.field1943 == null || var7.field1951 >= var8.field1943.length || var8.field1943[var7.field1951] != var7);
                        class290.method1818(var6);
                    }
                }
                var4 = var3.field2976;
                if (var4.field1951 < 0) {
                    break;
                }
                var5 = class166.method1028(var4.field1947, 75);
            } while (var5 == null || var5.field1943 == null || var5.field1943.length <= var4.field1951 || var5.field1943[var4.field1951] != var4);
            class290.method1818(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1127() {
        class291.field4246 = 0;
        for (int var0 = 0; var0 < class225.field3418; var0++) {
            class216 var1 = class139.field1851[class281.field4139[var0]];
            if (var1.field2118 && var1.method923(0) != -1) {
                int var2 = (var1.method918(false) - 1) * 64 + 60;
                int var3 = var1.field4331 - var2 >> 7;
                int var4 = var1.field4317 - var2 >> 7;
                class146 var5 = class222.method1426(var4, var3, var1.field4319, (byte) -71);
                if (var5 != null) {
                    int var6 = var5.field2154;
                    if (var5 instanceof class216) {
                        var6 += 2048;
                    }
                    if (var5.field2128 == 0 && var5.method923(0) != -1) {
                        class470.field6613[class291.field4246] = var6;
                        class428.field5996[class291.field4246] = var6;
                        class291.field4246++;
                        var5.field2128++;
                    }
                    class470.field6613[class291.field4246] = var6;
                    class428.field5996[class291.field4246] = var1.field2154 + 2048;
                    class291.field4246++;
                    var5.field2128++;
                }
            }
        }
        class465.method2727((byte) 68, class291.field4246 - 1, class470.field6613, class428.field5996, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;IJZZILjava/lang/String;IZI)V")
    public static final void method1128(int arg0, String arg1, int arg2, long arg3, boolean arg4, boolean arg5, int arg6, String arg7, int arg8, boolean arg9, int arg10) {
        if (arg0 != -32672) {
            field2608 = null;
        }
        field2619++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class276 var14 = new class276(128);
        var14.method1753(true, 10);
        var14.method1711(false, (arg9 ? 4 : 0) | (arg5 ? 2 : 0) | (arg4 ? 1 : 0));
        var14.method1722(arg3, true);
        var14.method1744(var12[0], true);
        var14.method1730(-11508, arg1);
        var14.method1744(var12[1], true);
        var14.method1711(false, class36.field466);
        var14.method1753(true, arg6);
        var14.method1753(true, arg8);
        var14.method1744(var12[2], true);
        var14.method1711(false, arg2);
        var14.method1711(false, arg10);
        var14.method1744(var12[3], true);
        var14.method1731(-18016, class427.field5977, class171.field2490);
        class276 var15 = new class276(350);
        var15.method1730(-11508, arg7);
        int var16 = 8 - (class89.method501(arg7, true) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1753(true, (int) (Math.random() * 255.0D));
        }
        var15.method1732(arg0 + 32770, var12);
        class225.field3415.field4021 = 0;
        class225.field3415.method1753(true, class93.field1193.field1886);
        class225.field3415.method1711(false, var15.field4021 + var14.field4021 + 2);
        class225.field3415.method1711(false, 577);
        class225.field3415.method1704((byte) -48, var14.field4064, 0, var14.field4021);
        class225.field3415.method1704((byte) -48, var15.field4064, 0, var15.field4021);
        class355.field5138 = -3;
        class166.field2435 = 0;
        class120.field1507 = 1;
        class42.field621 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ldt;II)V")
    public static final void method1129(class145[] arg0, int arg1, int arg2) {
        field2601++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class145 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field2073 == 0) {
                    if (var4.field1943 != null) {
                        method1129(var4.field1943, arg1, arg2);
                    }
                    class465 var5 = (class465) class146.field2146.method2761((long) var4.field1933, (byte) -112);
                    if (var5 != null) {
                        class24.method169((byte) -6, var5.field6502, arg1);
                    }
                }
                if (arg1 == 0 && var4.field1966 != null) {
                    class202 var6 = new class202();
                    var6.field2971 = var4.field1966;
                    var6.field2976 = var4;
                    class290.method1818(var6);
                }
                if (arg1 == 1 && var4.field1999 != null) {
                    if (var4.field1951 >= 0) {
                        class145 var7 = class166.method1028(var4.field1933, 115);
                        if (var7 == null || var7.field1943 == null || var4.field1951 >= var7.field1943.length || var7.field1943[var4.field1951] != var4) {
                            continue;
                        }
                    }
                    class202 var8 = new class202();
                    var8.field2971 = var4.field1999;
                    var8.field2976 = var4;
                    class290.method1818(var8);
                }
            }
        }
        if (arg2 != 1) {
            method1132((class145) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method1130(int arg0) {
        method1112((byte) 80);
        field2606++;
        class253.method1578((byte) 103);
        class208.method1358(-48001);
        class489.method2862((byte) 9);
        class326.method2066(-85);
        class469.method2758((byte) 100);
        class212.method1375(0);
        class375.method2293(0);
        class272.method1671(93);
        class238.method1513(true);
        class249.method1560((byte) 70);
        class470.method2772((byte) 119);
        class203.method1274((byte) 98);
        class266.method1636(-83);
        class48.method314((byte) 1);
        class24.method168(false);
        class353.method2201((byte) -14);
        class282.method1783(9349);
        class313.method1935((byte) 123);
        class190.method1172(-65);
        class141.method889(18828);
        class460.method2690((byte) -115);
        class486.method2841(true);
        class438.method2576(122);
        class337.method2124((byte) -121);
        class58.method355(true);
        class287.method1793(false);
        class191.method1186((byte) -41);
        class481.method2813(-42);
        class201.method1246(123);
        class90.method512(91);
        class420.method2469((byte) 71);
        class232.method1476((byte) 34);
        class67.method407(118);
        class339.method2142(12);
        class51.method329(false);
        class211.method1367((byte) -24);
        class280.method1773(-4);
        class105.method593(-120);
        class377.method2300(false);
        class128.method805(-95);
        class87.method484(-87);
        class28.method205(-12144);
        class480.method2801(0);
        class338.method2140(36);
        class245.method1542(3);
        class27.method196(35);
        class329.method2087((byte) 119);
        class317.method2032(true);
        class251.method1571((byte) -112);
        class204.method1284((byte) -96);
        class334.method2107(false);
        class95.method542(15907);
        class180.method1106(false);
        class89.method504(120);
        class216.method1383((byte) -88);
        class419.method2457((byte) -73);
        class1.method4((byte) 78);
        class236.method1506(true);
        class298.method1839(-7863);
        class441.method2590(117);
        class22.method145((byte) 85);
        class179.method1092(false);
        class229.method1463(1);
        class225.method1442(0);
        class145.method906((byte) -93);
        class150.method944(22842);
        class452.method2636(-17755);
        class365.method2253((byte) -102);
        class281.method1777((byte) 31);
        class241.method1527(-9);
        class125.method767((byte) -27);
        class422.method2482(-257);
        class160.method996(-107);
        class276.method1725(44);
        class153.method958(-1);
        class146.method917(-76);
        class256.method1601(169);
        class88.method491(0);
        class311.method1923((byte) 64);
        class393.method2350(22851);
        class71.method416(88);
        class465.method2728((byte) -114);
        class79.method455(true);
        class171.method1060((byte) -117);
        class166.method1031(false);
        class135.method854(4);
        class187.method1160(3);
        class491.method2881((byte) -96);
        class426.method2507(true);
        class207.method1355(0);
        class178.method1087((byte) 54);
        class167.method1032(true);
        class61.method377(117);
        class321.method2054(false);
        class447.method2609(77);
        class120.method739(-1517192868);
        class220.method1403(false);
        class193.method1191(1);
        class76.method444((byte) 121);
        class458.method2679((byte) -61);
        class325.method2062(76);
        class412.method2436(5269);
        class132.method824((byte) 33);
        class31.method219((byte) -51);
        class360.method2229(false);
        class479.method2798((byte) 116);
        class450.method2623(4022);
        class355.method2213(1);
        class453.method2664(75);
        class284.method1786(96);
        class466.method2740(75);
        class41.method267(10);
        class138.method870((byte) -98);
        class291.method1824(-119);
        class227.method1455(true);
        class213.method1380(false);
        class454.method2671(25516);
        class86.method480(false);
        class265.method1634(1);
        class308.method1909();
        class206.method1352(-6417);
        class361.method2233(true);
        class261.method1619(true);
        class411.method2432(-1);
        class151.method948(666285656);
        class231.method1469((byte) 50);
        class290.method1815();
        class395.method2358();
        class392.method2346(-27249);
        class80.method456(true);
        class358.method2220();
        class449.method2616(2);
        class19.method133(-82);
        class142.method893(-2);
        class224.method1438((byte) 106);
        class173.method1068(1);
        class240.method1520(-23692);
        class279.method1763(-24780);
        class314.method1943(-23420);
        class467.method2749(false);
        class332.method2102((byte) 115);
        class271.method1663(0);
        class84.method475(false);
        class490.method2870(0);
        class374.method2281((byte) -119);
        class307.method1903(-26858);
        class184.method1144(0);
        class408.method2419((byte) -37);
        class11.method40(17687);
        class476.method2788(27481);
        class277.method1757((byte) -28);
        class327.method2073(true);
        class23.method165(12129);
        class53.method339((byte) 12);
        class459.method2686((byte) 73);
        class401.method2398(6);
        class156.method984((byte) 113);
        class351.method2197((byte) -70);
        class115.method726((byte) -102);
        class343.method2156((byte) 0);
        class82.method468();
        class345.method2165(243);
        class306.method1893((byte) 53);
        class96.method545((byte) 126);
        class66.method402((byte) 82);
        class444.method2604((byte) 121);
        class404.method2405(-3);
        class303.method1882((byte) 126);
        class289.method1807(-1375489116);
        class485.method2831(-82);
        class202.method1261(20359);
        class112.method714(true);
        class304.method1887(false);
        class54.method341(false);
        class104.method584(103);
        class97.method550();
        class113.method716(1);
        class169.method1051(115);
        class9.method34(1);
        class94.method535((byte) -125);
        class405.method2407(118);
        class37.method248(true);
        class237.method1507((byte) 38);
        class364.method2249(0);
        class93.method529(-26178);
        class483.method2823(-16711936);
        class242.method1530((byte) 120);
        class370.method2274((byte) -19);
        class149.method943(2048);
        class456.method2675(false);
        class170.method1053(2);
        class269.method1652(255);
        class143.method895((byte) 93);
        class45.method297((byte) 92);
        class342.method2154(true);
        class182.method1136((byte) 58);
        class258.method1609(-1);
        class492.method2887(-89);
        class247.method1547(13);
        class14.method101();
        class107.method597(1);
        class140.method885((byte) -97);
        class260.method1615(24720);
        class389.method2340(-11351);
        class428.method2516(0);
        class157.method988((byte) 89);
        class65.method400(3875);
        class243.method1533(-116);
        class442.method2601((byte) -22);
        class286.method1789(0);
        class75.method439(705384839);
        class134.method851(-1);
        class335.method2117(20768);
        class50.method322(24);
        class230.method1467(-102);
        class20.method136(-29);
        class92.method525((byte) 93);
        class371.method2276();
        class295.method1829(-1);
        class168.method1038((byte) -104);
        class478.method2796(1);
        class462.method2711(2);
        class26.method191(17701);
        class431.method2552((byte) 105);
        class264.method1628(91);
        class262.method1620(-17281);
        class7.method26((byte) 45);
        class403.method2403((byte) 105);
        class64.method396((byte) -119);
        class464.method2726();
        class124.method750(18002);
        class414.method2442((byte) -36);
        class363.method2245(3);
        class214.method1381(30727);
        class437.method2572((byte) 64);
        class368.method2265(-5265);
        class111.method712(0);
        class367.method2255(false);
        class222.method1424(60);
        class185.method1146(true);
        class114.method721(0);
        class15.method117((byte) 65);
        class320.method2049(true);
        class218.method1396(1);
        class333.method2105(true);
        class275.method1683(-1);
        class436.method2569();
        class341.method2152();
        class30.method213((byte) -84);
        class239.method1519(1);
        class413.method2437(32248);
        class349.method2180(-14468);
        class324.method2057((byte) 84);
        class354.method2210();
        class233.method1489();
        class434.method2565((byte) 54);
        class316.method2024();
        class346.method2167(-26924);
        class318.method2039(0);
        class139.method880((byte) -114);
        class293.method1826((byte) 21);
        class255.method1584(true);
        class161.method1004(-98);
        class348.method2178(true);
        class418.method2454(4080);
        class164.method1025(true);
        class136.method864(0);
        class110.method707((byte) -88);
        class74.method436(96);
        class424.method2492(7915);
        class131.method823(91);
        class312.method1927(true);
        class362.method2240(0);
        class103.method582(65);
        class350.method2185(106);
        class55.method344(-103);
        int var2 = -52 % ((arg0 + 49) / 43);
        class44.method292((byte) 113);
        class148.method933(-18);
        class356.method2216(false);
        class330.method2093((byte) -110);
        class427.method2509(true);
        class33.method226(-3921);
        class177.method1084(1);
        class446.method2606(false);
        class252.method1576((byte) -8);
        class78.method451(107122191);
        class62.method390(104);
        class197.method1202((byte) -55);
        class99.method567(0);
        class172.method1062((byte) -126);
        class226.method1454((byte) -48);
        class77.method447(0);
        class69.method410((byte) -62);
        class40.method260(3);
        class116.method730(true);
        class267.method1643(false);
        class386.method2328((byte) -119);
        class199.method1224(1);
        class118.method736(0);
        class63.method392(7);
        class200.method1226(10913);
        class388.method2333(0);
        class163.method1024(2048);
        class144.method897(-106);
        class8.method28((byte) 125);
        class268.method1648((byte) -121);
        class473.method2778((byte) 94);
        class126.method791(4096);
        class328.method2080(-3);
        class487.method2857(true);
        class34.method227((byte) 101);
        class205.method1328();
        class32.method223();
        class81.method457((byte) 2);
        class102.method572((byte) -74);
        class373.method2277(89);
        class407.method2408(false);
        class244.method1538(-5);
        class29.method210(-117);
        class305.method1889((byte) -38);
        class347.method2169(0);
        class435.method2567(false);
        class250.method1562(-2);
        class235.method1499((byte) -127);
        class273.method1676((byte) -78);
        class59.method366((byte) 45);
        class421.method2473((byte) 123);
        class440.method2581((byte) 2);
        class278.method1759((byte) -128);
        class387.method2332((byte) 16);
        class410.method2425(16383);
        class38.method255(-23537);
        class451.method2634((byte) 87);
        class323.method2055(-26625);
        class344.method2160(-1);
        class209.method1361((byte) -122);
        class70.method414(-25907);
        class359.method2228((byte) -116);
        class472.method2775(true);
        class100.method570(-1);
        class488.method2858(8741);
        class2.method10(false);
        class394.method2352(-121);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method1131(int arg0) {
        field2611++;
        if (class29.field391) {
            class48.method317((byte) -123);
        }
        if (class141.field1878 != null) {
            class141.field1878.method1936((byte) 121);
        }
        if (class86.field1045 != null) {
            class201.method1227(false, class86.field1045, class252.field3718);
            class86.field1045 = null;
        }
        if (class58.field761 != null) {
            class58.field761.method2118(1);
            class58.field761 = null;
        }
        if (class306.field4363 != null) {
            class306.field4363.method1195(class465.field6503, 68);
        }
        class306.field4363 = null;
        if (class28.field381 != null) {
            class28.field381.method2476(0);
        }
        if (arg0 != 127) {
            field2621 = null;
        }
        if (class116.field1481 != null) {
            class116.field1481.method2476(0);
        }
        class289.field4210.method363(arg0 - 127);
        class235.field3533.method1791(arg0 + 17014);
        if (class403.field5689 != null) {
            class403.field5689.method1504(false);
            class403.field5689 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ldt;)Ldt;")
    public static final class145 method1132(class145 arg0) {
        int var1 = method1122(arg0).method2323(1366541377);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class166.method1028(arg0.field1947, 77);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public static final void method1133(int arg0) {
        int var1 = class37.field491;
        int[] var2 = class348.field5033;
        for (int var3 = 0; var3 < class225.field3418 + var1; var3++) {
            class146 var4;
            if (var3 < var1) {
                var4 = class124.field1559[var2[var3]];
            } else {
                var4 = class139.field1851[class281.field4139[var3 - var1]];
            }
            if (var4.field4319 == arg0 && var4.field2127 >= 0) {
                int var5 = var4.method918(false);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field4331 & 0x7F) != 0 || (var4.field4317 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field4331 & 0x7F) != 64 || (var4.field4317 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field4331 >> 7;
                    int var7 = var4.field4317 >> 7;
                    if (var4.field2127 > class156.field2324[var6][var7]) {
                        class156.field2324[var6][var7] = var4.field2127;
                        class247.field3658[var6][var7] = 1;
                    } else if (class156.field2324[var6][var7] == var4.field2127) {
                        var10002 = class247.field3658[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field4331 - var8 >> 7;
                    int var10 = var4.field4317 - var8 >> 7;
                    int var11 = var4.field4331 + var8 >> 7;
                    int var12 = var4.field4317 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field2127 > class156.field2324[var13][var14]) {
                                class156.field2324[var13][var14] = var4.field2127;
                                class247.field3658[var13][var14] = 1;
                            } else if (class156.field2324[var13][var14] == var4.field2127) {
                                var10002 = class247.field3658[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new class326("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field2620 = 0;
        field2621 = new class31[14];
    }
}
