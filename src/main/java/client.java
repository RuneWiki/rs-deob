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
public class client extends class282 {

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "J")
    public static volatile long field1611 = 0L;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field1605 = new int[200];

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
    public static boolean field1621;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method723(int arg0, int arg1) {
        class35.field454.field1173 = arg0;
        class214.field3432 = null;
        class35.field454.field1170++;
        class14.field187 = null;
        int var3 = 76 / ((arg1 + 15) / 58);
        class181.field2885 = 0;
        field1619++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method724(int arg0) {
        field1608++;
        if (class250.field4085 == 1000) {
            return;
        }
        class73.field924++;
        if (class73.field924 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class201.field3183 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class278.field4427.setSeed((long) class201.field3183);
        }
        this.method727(1);
        int var3 = 110 / ((1 - arg0) / 40);
        if (class147.field2303 != null) {
            class147.field2303.method1958(0);
        }
        class238.method1680(true);
        class51.method294((byte) -127);
        class240.method1688((byte) 104);
        class5.method30(18145);
        if (class234.field3875 != null) {
            int var4 = class234.field3875.method147(0);
            class130.field2088 = var4;
        }
        if (class250.field4085 == 0) {
            this.method734((byte) -127);
            class228.method1622((byte) -125);
        } else if (class250.field4085 == 5) {
            this.method734((byte) -127);
            class228.method1622((byte) -108);
        } else if (class250.field4085 == 25 || class250.field4085 == 28) {
            class8.method42((byte) -91);
        }
        if (class250.field4085 == 10) {
            this.method733(-111);
            class285.method1917(122);
            class213.method1498(-34);
            class274.method1839((byte) 105);
        } else if (class250.field4085 == 30) {
            class131.method891((byte) 67);
            return;
        } else if (class250.field4085 == 40) {
            class274.method1839((byte) 105);
            if (class50.field650 != -3) {
                if (class50.field650 == 15) {
                    class106.method644(-1);
                } else if (class50.field650 != 2) {
                    class144.method1008(-8905);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIB)V")
    public static final void method725(int arg0, int arg1, byte arg2) {
        field1620++;
        if (arg2 != 98) {
            method729((byte) -71);
        }
        class166.field2666 = class42.field524 - (arg0 + 1 - class7.field88);
        class236.field3910 = arg1 - class105.field1413;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method726(int arg0) {
        field1616++;
        if (arg0 != -16995) {
            field1617 = 84;
        }
        if (class66.field832 < class35.field454.field1170) {
            if (class20.field253 == class178.field2833) {
                class178.field2833 = class42.field528;
            } else {
                class178.field2833 = class20.field253;
            }
            class180.field2861 = (class35.field454.field1170 * 50 - 50) * 5;
            if (class180.field2861 > 3000) {
                class180.field2861 = 3000;
            }
            if (class35.field454.field1170 >= 2 && class35.field454.field1173 == 6) {
                this.method1891(false, "js5connect_outofdate");
                class250.field4085 = 1000;
                return;
            }
            if (class35.field454.field1170 >= 4 && class35.field454.field1173 == -1) {
                this.method1891(false, "js5crc");
                class250.field4085 = 1000;
                return;
            }
            if (class35.field454.field1170 >= 4 && (class250.field4085 == 0 || class250.field4085 == 5)) {
                if (class35.field454.field1173 == 7 || class35.field454.field1173 == 9) {
                    this.method1891(false, "js5connect_full");
                } else if (class35.field454.field1173 <= 0) {
                    this.method1891(false, "js5io");
                } else {
                    this.method1891(false, "js5connect");
                }
                class250.field4085 = 1000;
                return;
            }
        }
        class66.field832 = class35.field454.field1170;
        if (class180.field2861 > 0) {
            class180.field2861--;
            return;
        }
        try {
            if (class181.field2885 == 0) {
                class214.field3432 = class194.field3107.method269((byte) 30, class178.field2833, class180.field2860);
                class181.field2885++;
            }
            if (class181.field2885 == 1) {
                if (class214.field3432.field3995 == 2) {
                    this.method723(1000, -106);
                    return;
                }
                if (class214.field3432.field3995 == 1) {
                    class181.field2885++;
                }
            }
            if (class181.field2885 == 2) {
                class14.field187 = new class175((Socket) class214.field3432.field3992, class194.field3107);
                class96 var2 = new class96(5);
                var2.method580((byte) 110, 15);
                var2.method574(537, arg0 + 16994);
                class14.field187.method1211(5, true, 0, var2.field1218);
                class181.field2885++;
                class209.field3333 = class249.method1723((byte) 106);
            }
            if (class181.field2885 == 3) {
                if (class250.field4085 == 0 || class250.field4085 == 5 || class14.field187.method1217(-126) > 0) {
                    int var3 = class14.field187.method1216((byte) 29);
                    if (var3 != 0) {
                        this.method723(var3, -115);
                        return;
                    }
                    class181.field2885++;
                } else if ((class249.method1723((byte) 22) - class209.field3333) > 30000L) {
                    this.method723(1001, -117);
                    return;
                }
            }
            if (class181.field2885 == 4) {
                boolean var4 = class250.field4085 == 5 || class250.field4085 == 10 || class250.field4085 == 28;
                class35.field454.method513(!var4, arg0 ^ 0x425B, class14.field187);
                class14.field187 = null;
                class214.field3432 = null;
                class181.field2885 = 0;
            }
        } catch (IOException var5) {
            this.method723(1002, -128);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class296.method1986(true, "argument count");
            }
            class42.field538 = Integer.parseInt(arg0[0]);
            class77.field969 = 2;
            if (arg0[1].equals("live")) {
                class285.field4544 = 0;
            } else if (arg0[1].equals("rc")) {
                class285.field4544 = 1;
            } else if (arg0[1].equals("wip")) {
                class285.field4544 = 2;
            } else {
                class296.method1986(true, "modewhat");
            }
            class51.field662 = false;
            class281.field4458 = class88.method477(122, arg0[2]);
            if (class281.field4458 == -1) {
                if (arg0[2].equals("english")) {
                    class281.field4458 = 0;
                } else if (arg0[2].equals("german")) {
                    class281.field4458 = 1;
                } else {
                    class296.method1986(true, "language");
                }
            }
            class86.method472(class281.field4458, 2506);
            class239.field3945 = false;
            class3.field45 = false;
            if (arg0[3].equals("game0")) {
                class297.field4695 = 0;
            } else if (arg0[3].equals("game1")) {
                class297.field4695 = 1;
            } else {
                class296.method1986(true, "game");
            }
            class210.field3374 = 0;
            class272.field4343 = "";
            class36.field460 = 0;
            class22.field291 = false;
            client var1 = new client();
            class222.field3583 = var1;
            var1.method1890(1024, 768, 537, class285.field4544 + 32, "runescape", false, (byte) -48, 29);
            class41.field517.setLocation(40, 40);
        } catch (Exception var3) {
            class30.method168((byte) -79, var3, (String) null);
        }
        field1618++;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1609++;
        if (!this.method1889((byte) -127)) {
            return;
        }
        class42.field538 = Integer.parseInt(this.getParameter("worldid"));
        class77.field969 = Integer.parseInt(this.getParameter("modewhere"));
        if (class77.field969 < 0 || class77.field969 > 1) {
            class77.field969 = 0;
        }
        class285.field4544 = Integer.parseInt(this.getParameter("modewhat"));
        if (class285.field4544 < 0 || class285.field4544 > 2) {
            class285.field4544 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class51.field662 = true;
        } else {
            class51.field662 = false;
        }
        try {
            class281.field4458 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class281.field4458 = 0;
        }
        class86.method472(class281.field4458, 2506);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class3.field45 = true;
        } else {
            class3.field45 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class239.field3945 = true;
        } else {
            class239.field3945 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class297.field4695 = 1;
        } else {
            class297.field4695 = 0;
        }
        try {
            class210.field3374 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class210.field3374 = 0;
        }
        class272.field4343 = this.getParameter("settings");
        if (class272.field4343 == null) {
            class272.field4343 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class36.field460 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class36.field460 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class22.field291 = true;
        } else {
            class22.field291 = false;
        }
        class222.field3583 = this;
        this.method1880(537, 765, class285.field4544 + 32, -14574, 503);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method727(int arg0) {
        field1613++;
        boolean var2 = class35.field454.method504((byte) -92);
        if (arg0 != 1) {
            main((String[]) null);
        }
        if (!var2) {
            this.method726(arg0 ^ 0xFFFFBD9C);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwb;)Lwb;")
    public static final class123 method728(class123 arg0) {
        int var1 = method735(arg0).method1168((byte) 98);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class61.method358(arg0.field1911, -120);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public static void method729(byte arg0) {
        if (arg0 == 103) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwb;IIIIIII)V")
    public static final void method730(class123[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class123 var9 = arg0[var8];
            if (var9 != null && var9.field1911 == arg1 && (!var9.field1796 || var9.field1778 == 0 || var9.field1891 || method735(var9).field2703 != 0 || class150.field2343 == var9 || var9.field1848 == 1338) && (!var9.field1796 || !method736(var9))) {
                int var10 = var9.field1899 + arg6;
                int var11 = var9.field1896 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1778 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1879 + var10;
                    int var17 = var9.field1809 + var11;
                    if (var9.field1778 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class5.field75 == var9) {
                    class80.field991 = true;
                    class215.field3455 = var10;
                    class214.field3434 = var11;
                }
                if (!var9.field1796 || var12 < var14 && var13 < var15) {
                    if (var9.field1778 == 0) {
                        if (!var9.field1796 && method736(var9) && class272.field4352 != var9) {
                            continue;
                        }
                        if (var9.field1741 && class113.field1623 >= var12 && class92.field1156 >= var13 && class113.field1623 < var14 && class92.field1156 < var15) {
                            for (class156 var18 = (class156) class96.field1264.method1802(43); var18 != null; var18 = (class156) class96.field1264.method1815(0)) {
                                if (var18.field2505) {
                                    var18.method1673(14510);
                                    var18.field2516.field1859 = false;
                                }
                            }
                            if (class262.field4244 == 0) {
                                class5.field75 = null;
                                class150.field2343 = null;
                            }
                            class21.field284 = 0;
                        }
                    }
                    if (var9.field1796) {
                        boolean var19;
                        if (class113.field1623 >= var12 && class92.field1156 >= var13 && class113.field1623 < var14 && class92.field1156 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class113.field1626 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class90.field1119 == 1 && class107.field1449 >= var12 && class214.field3435 >= var13 && class107.field1449 < var14 && class214.field3435 < var15) {
                            var21 = true;
                        }
                        if (var9.field1807 != null) {
                            for (int var22 = 0; var22 < var9.field1807.length; var22++) {
                                if (class36.field467[var9.field1807[var22]]) {
                                    if (var9.field1860 == null || class73.field924 >= var9.field1860[var22]) {
                                        byte var23 = var9.field1781[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class36.field467[86] && !class36.field467[82] && !class36.field467[81]) && ((var23 & 0x2) == 0 || class36.field467[86]) && ((var23 & 0x1) == 0 || class36.field467[82]) && ((var23 & 0x4) == 0 || class36.field467[81])) {
                                            class82.method454((byte) -100, var22 + 1, -1, var9.field1844, "");
                                            int var24 = var9.field1766[var22];
                                            if (var9.field1860 == null) {
                                                var9.field1860 = new int[var9.field1807.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1860[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1860[var22] = class73.field924 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1860 != null) {
                                    var9.field1860[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class213.method1495(class214.field3435 - var11, class107.field1449 - var10, var9, (byte) 78);
                        }
                        if (class5.field75 != null && class5.field75 != var9 && var19 && method735(var9).method1177(-28)) {
                            class121.field1714 = var9;
                        }
                        if (class150.field2343 == var9) {
                            class287.field4582 = true;
                            class128.field2055 = var10;
                            class289.field4602 = var11;
                        }
                        if (var9.field1891 || var9.field1848 != 0) {
                            if (var19 && class130.field2088 != 0 && var9.field1790 != null) {
                                class156 var25 = new class156();
                                var25.field2505 = true;
                                var25.field2516 = var9;
                                var25.field2514 = class130.field2088;
                                var25.field2512 = var9.field1790;
                                class96.field1264.method1803(var25, -1);
                            }
                            if (class5.field75 != null || class242.field3982 != null || class262.field4250 || var9.field1848 != 1400 && class21.field284 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1848 != 0) {
                                if (var9.field1848 == 1337) {
                                    class110.field1556 = var9;
                                    continue;
                                }
                                if (var9.field1848 == 1338) {
                                    if (var21) {
                                        class53.field686 = class107.field1449 - var10;
                                        class222.field3580 = class214.field3435 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1848 == 1400) {
                                    class73.field925 = var9;
                                    if (var21) {
                                        if (class36.field467[82] && class184.field2944 > 0) {
                                            int var26 = (int) ((double) (class107.field1449 - var10 - var9.field1879 / 2) * 2.0D / (double) class250.field4084);
                                            int var27 = (int) ((double) (class214.field3435 - var11 - var9.field1809 / 2) * 2.0D / (double) class250.field4084);
                                            int var28 = class220.field3524 + var26;
                                            int var29 = class224.field3606 + var27;
                                            int var30 = class105.field1413 + var28;
                                            int var31 = class7.field88 + class42.field524 - var29 - 1;
                                            class148 var32 = class270.method1816(1123005260);
                                            int[] var33 = var32.method1025(var30, var31, 12800);
                                            if (var33 != null) {
                                                class161.method1122(var33[0], var33[1], var33[2], (byte) 35);
                                                class2.method12(true);
                                            }
                                            continue;
                                        }
                                        class21.field284 = 1;
                                        class148.field2331 = class113.field1623;
                                        class189.field3069 = class92.field1156;
                                        continue;
                                    }
                                    if (var20 && class21.field284 > 0) {
                                        if (class21.field284 == 1 && (class148.field2331 != class113.field1623 || class92.field1156 != class189.field3069)) {
                                            class107.field1450 = class220.field3524;
                                            class207.field3309 = class224.field3606;
                                            class21.field284 = 2;
                                        }
                                        if (class21.field284 == 2) {
                                            class61.method360((int) ((double) (class148.field2331 - class113.field1623) * 2.0D / (double) class281.field4457) + class107.field1450, (byte) -53);
                                            class108.method668((int) ((double) (class189.field3069 - class92.field1156) * 2.0D / (double) class281.field4457) + class207.field3309, (byte) 96);
                                        }
                                        continue;
                                    }
                                    class21.field284 = 0;
                                    continue;
                                }
                                if (var9.field1848 == 1401) {
                                    if (var20) {
                                        class35.method187(var9.field1879, class92.field1156 - var11, (byte) 22, var9.field1809, class113.field1623 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1848 == 1402) {
                                    class129.method875((byte) -21, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1823 && var21) {
                                var9.field1823 = true;
                                if (var9.field1843 != null) {
                                    class156 var34 = new class156();
                                    var34.field2505 = true;
                                    var34.field2516 = var9;
                                    var34.field2506 = class107.field1449 - var10;
                                    var34.field2514 = class214.field3435 - var11;
                                    var34.field2512 = var9.field1843;
                                    class96.field1264.method1803(var34, -1);
                                }
                            }
                            if (var9.field1823 && var20 && var9.field1746 != null) {
                                class156 var35 = new class156();
                                var35.field2505 = true;
                                var35.field2516 = var9;
                                var35.field2506 = class113.field1623 - var10;
                                var35.field2514 = class92.field1156 - var11;
                                var35.field2512 = var9.field1746;
                                class96.field1264.method1803(var35, -1);
                            }
                            if (var9.field1823 && !var20) {
                                var9.field1823 = false;
                                if (var9.field1837 != null) {
                                    class156 var36 = new class156();
                                    var36.field2505 = true;
                                    var36.field2516 = var9;
                                    var36.field2506 = class113.field1623 - var10;
                                    var36.field2514 = class92.field1156 - var11;
                                    var36.field2512 = var9.field1837;
                                    class272.field4351.method1803(var36, -1);
                                }
                            }
                            if (var20 && var9.field1834 != null) {
                                class156 var37 = new class156();
                                var37.field2505 = true;
                                var37.field2516 = var9;
                                var37.field2506 = class113.field1623 - var10;
                                var37.field2514 = class92.field1156 - var11;
                                var37.field2512 = var9.field1834;
                                class96.field1264.method1803(var37, -1);
                            }
                            if (!var9.field1859 && var19) {
                                var9.field1859 = true;
                                if (var9.field1767 != null) {
                                    class156 var38 = new class156();
                                    var38.field2505 = true;
                                    var38.field2516 = var9;
                                    var38.field2506 = class113.field1623 - var10;
                                    var38.field2514 = class92.field1156 - var11;
                                    var38.field2512 = var9.field1767;
                                    class96.field1264.method1803(var38, -1);
                                }
                            }
                            if (var9.field1859 && var19 && var9.field1881 != null) {
                                class156 var39 = new class156();
                                var39.field2505 = true;
                                var39.field2516 = var9;
                                var39.field2506 = class113.field1623 - var10;
                                var39.field2514 = class92.field1156 - var11;
                                var39.field2512 = var9.field1881;
                                class96.field1264.method1803(var39, -1);
                            }
                            if (var9.field1859 && !var19) {
                                var9.field1859 = false;
                                if (var9.field1765 != null) {
                                    class156 var40 = new class156();
                                    var40.field2505 = true;
                                    var40.field2516 = var9;
                                    var40.field2506 = class113.field1623 - var10;
                                    var40.field2514 = class92.field1156 - var11;
                                    var40.field2512 = var9.field1765;
                                    class272.field4351.method1803(var40, -1);
                                }
                            }
                            if (var9.field1822 != null) {
                                class156 var41 = new class156();
                                var41.field2516 = var9;
                                var41.field2512 = var9.field1822;
                                class185.field2963.method1803(var41, -1);
                            }
                            if (var9.field1785 != null && class11.field115 > var9.field1747) {
                                if (var9.field1870 == null || class11.field115 - var9.field1747 > 32) {
                                    class156 var46 = new class156();
                                    var46.field2516 = var9;
                                    var46.field2512 = var9.field1785;
                                    class96.field1264.method1803(var46, -1);
                                } else {
                                    label572: for (int var42 = var9.field1747; var42 < class11.field115; var42++) {
                                        int var43 = class288.field4593[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1870.length; var44++) {
                                            if (var9.field1870[var44] == var43) {
                                                class156 var45 = new class156();
                                                var45.field2516 = var9;
                                                var45.field2512 = var9.field1785;
                                                class96.field1264.method1803(var45, -1);
                                                break label572;
                                            }
                                        }
                                    }
                                }
                                var9.field1747 = class11.field115;
                            }
                            if (var9.field1813 != null && class47.field592 > var9.field1784) {
                                if (var9.field1892 == null || class47.field592 - var9.field1784 > 32) {
                                    class156 var51 = new class156();
                                    var51.field2516 = var9;
                                    var51.field2512 = var9.field1813;
                                    class96.field1264.method1803(var51, -1);
                                } else {
                                    label548: for (int var47 = var9.field1784; var47 < class47.field592; var47++) {
                                        int var48 = class245.field4029[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1892.length; var49++) {
                                            if (var9.field1892[var49] == var48) {
                                                class156 var50 = new class156();
                                                var50.field2516 = var9;
                                                var50.field2512 = var9.field1813;
                                                class96.field1264.method1803(var50, -1);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field1784 = class47.field592;
                            }
                            if (var9.field1917 != null && class165.field2629 > var9.field1867) {
                                if (var9.field1744 == null || class165.field2629 - var9.field1867 > 32) {
                                    class156 var56 = new class156();
                                    var56.field2516 = var9;
                                    var56.field2512 = var9.field1917;
                                    class96.field1264.method1803(var56, -1);
                                } else {
                                    label524: for (int var52 = var9.field1867; var52 < class165.field2629; var52++) {
                                        int var53 = class105.field1417[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1744.length; var54++) {
                                            if (var9.field1744[var54] == var53) {
                                                class156 var55 = new class156();
                                                var55.field2516 = var9;
                                                var55.field2512 = var9.field1917;
                                                class96.field1264.method1803(var55, -1);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field1867 = class165.field2629;
                            }
                            if (var9.field1902 != null && class88.field1090 > var9.field1865) {
                                if (var9.field1874 == null || class88.field1090 - var9.field1865 > 32) {
                                    class156 var61 = new class156();
                                    var61.field2516 = var9;
                                    var61.field2512 = var9.field1902;
                                    class96.field1264.method1803(var61, -1);
                                } else {
                                    label500: for (int var57 = var9.field1865; var57 < class88.field1090; var57++) {
                                        int var58 = class7.field86[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1874.length; var59++) {
                                            if (var9.field1874[var59] == var58) {
                                                class156 var60 = new class156();
                                                var60.field2516 = var9;
                                                var60.field2512 = var9.field1902;
                                                class96.field1264.method1803(var60, -1);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field1865 = class88.field1090;
                            }
                            if (var9.field1821 != null && class202.field3194 > var9.field1759) {
                                if (var9.field1811 == null || class202.field3194 - var9.field1759 > 32) {
                                    class156 var66 = new class156();
                                    var66.field2516 = var9;
                                    var66.field2512 = var9.field1821;
                                    class96.field1264.method1803(var66, -1);
                                } else {
                                    label476: for (int var62 = var9.field1759; var62 < class202.field3194; var62++) {
                                        int var63 = class114.field1633[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field1811.length; var64++) {
                                            if (var9.field1811[var64] == var63) {
                                                class156 var65 = new class156();
                                                var65.field2516 = var9;
                                                var65.field2512 = var9.field1821;
                                                class96.field1264.method1803(var65, -1);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field1759 = class202.field3194;
                            }
                            if (class73.field908 > var9.field1888 && var9.field1908 != null) {
                                class156 var67 = new class156();
                                var67.field2516 = var9;
                                var67.field2512 = var9.field1908;
                                class96.field1264.method1803(var67, -1);
                            }
                            if (class68.field856 > var9.field1888 && var9.field1897 != null) {
                                class156 var68 = new class156();
                                var68.field2516 = var9;
                                var68.field2512 = var9.field1897;
                                class96.field1264.method1803(var68, -1);
                            }
                            if (class255.field4139 > var9.field1888 && var9.field1786 != null) {
                                class156 var69 = new class156();
                                var69.field2516 = var9;
                                var69.field2512 = var9.field1786;
                                class96.field1264.method1803(var69, -1);
                            }
                            if (class271.field4330 > var9.field1888 && var9.field1743 != null) {
                                class156 var70 = new class156();
                                var70.field2516 = var9;
                                var70.field2512 = var9.field1743;
                                class96.field1264.method1803(var70, -1);
                            }
                            if (class213.field3417 > var9.field1888 && var9.field1871 != null) {
                                class156 var71 = new class156();
                                var71.field2516 = var9;
                                var71.field2512 = var9.field1871;
                                class96.field1264.method1803(var71, -1);
                            }
                            var9.field1888 = class162.field2582;
                            if (var9.field1882 != null) {
                                for (int var72 = 0; var72 < class108.field1518; var72++) {
                                    class156 var73 = new class156();
                                    var73.field2516 = var9;
                                    var73.field2517 = class266.field4282[var72];
                                    var73.field2515 = class179.field2854[var72];
                                    var73.field2512 = var9.field1882;
                                    class96.field1264.method1803(var73, -1);
                                }
                            }
                            if (class117.field1665 && var9.field1849 != null) {
                                class156 var74 = new class156();
                                var74.field2516 = var9;
                                var74.field2512 = var9.field1849;
                                class96.field1264.method1803(var74, -1);
                            }
                        }
                    }
                    if (!var9.field1796 && class5.field75 == null && class242.field3982 == null && !class262.field4250) {
                        if ((var9.field1842 >= 0 || var9.field1745 != 0) && class113.field1623 >= var12 && class92.field1156 >= var13 && class113.field1623 < var14 && class92.field1156 < var15) {
                            if (var9.field1842 >= 0) {
                                class272.field4352 = arg0[var9.field1842];
                            } else {
                                class272.field4352 = var9;
                            }
                        }
                        if (var9.field1778 == 8 && class113.field1623 >= var12 && class92.field1156 >= var13 && class113.field1623 < var14 && class92.field1156 < var15) {
                            class82.field1009 = var9;
                        }
                        if (var9.field1853 > var9.field1809) {
                            class265.method1787(-16, var11, var9.field1879 + var10, var9, var9.field1809, class92.field1156, class113.field1623, var9.field1853);
                        }
                    }
                    if (var9.field1778 == 0) {
                        method730(arg0, var9.field1844, var12, var13, var14, var15, var10 - var9.field1835, var11 - var9.field1872);
                        if (var9.field1748 != null) {
                            method730(var9.field1748, var9.field1844, var12, var13, var14, var15, var10 - var9.field1835, var11 - var9.field1872);
                        }
                        class86 var75 = (class86) class92.field1139.method708((long) var9.field1844, -69);
                        if (var75 != null) {
                            class134.method907(var15, var14, var13, var11, var12, -1, var75.field1064, var10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method731(byte arg0) {
        method729((byte) 103);
        class60.method348(0);
        class148.method1023(0);
        class40.method218(3);
        field1610++;
        class79.method441((byte) 112);
        class91.method497((byte) -95);
        class272.method1825(88);
        class242.method1690(16270);
        class282.method1888(-61);
        class208.method1461(-119);
        class161.method1119((byte) 89);
        class261.method1777((byte) -38);
        class262.method1779(30);
        class96.method595(true);
        if (arg0 < 23) {
            return;
        }
        class92.method516(-92);
        class177.method1226((byte) 104);
        class221.method1561(-103);
        class137.method941((byte) 42);
        class184.method1288(true);
        class107.method646((byte) 15);
        class244.method1692((byte) -117);
        class200.method1395((byte) -91);
        class286.method1921(-126);
        class144.method1000((byte) 15);
        class123.method797((byte) -124);
        class259.method1772((byte) 91);
        class269.method1812((byte) -115);
        class56.method326(256);
        class110.method700(-67);
        class25.method143(-124);
        class55.method309(86);
        class70.method396(false);
        class155.method1085(true);
        class27.method154(-11996);
        class219.method1551(-10692);
        class134.method902(-1);
        class165.method1140((byte) 93);
        class230.method1632(false);
        class246.method1706((byte) -54);
        class228.method1626((byte) 117);
        class220.method1555((byte) 111);
        class188.method1316(20248);
        class86.method467((byte) -119);
        class171.method1173(false);
        class237.method1675((byte) -55);
        class22.method123(-2);
        class13.method70(true);
        class276.method1846(true);
        class39.method212(-9998);
        class201.method1404((byte) -121);
        class192.method1327(8);
        class31.method177(-83);
        class7.method38((byte) -115);
        class280.method1870((byte) -119);
        class138.method962(0);
        class198.method1381(0);
        class274.method1837((byte) 107);
        class23.method134(5079);
        class173.method1185(120);
        class136.method920((byte) 85);
        class112.method720(-127);
        class120.method782((byte) 113);
        class116.method756((byte) 41);
        class205.method1446();
        class293.method1967(0);
        class108.method657((byte) -88);
        class125.method835();
        class182.method1267(112);
        class139.method967(false);
        class47.method263(true);
        class93.method522(false);
        class160.method1113(true);
        class239.method1684(29);
        class135.method914((byte) 120);
        class109.method697();
        class118.method760((byte) -120);
        class166.method1151(-1);
        class142.method987();
        class172.method1183(18068);
        class283.method1898(-22563);
        class113.method743((byte) 116);
        class38.method202();
        class127.method870(-25708);
        class44.method248((byte) 10);
        class224.method1586(118);
        class78.method435(false);
        class217.method1532();
        class4.method18(-12513);
        class141.method973(402);
        class258.method1764((byte) -76);
        class88.method478((byte) -58);
        class209.method1465(0);
        class225.method1591(false);
        class190.method1321((byte) 116);
        class5.method26(true);
        class180.method1256((byte) 29);
        class278.method1862((byte) 9);
        class17.method88(false);
        class154.method1054(-1);
        class98.method607(2);
        class34.method182((byte) -27);
        class234.method1663(-91);
        class257.method1757();
        class35.method190((byte) -27);
        class285.method1911((byte) -90);
        class273.method1832(false);
        class189.method1318(25);
        class202.method1410(-5032);
        class223.method1578();
        class183.method1274(442148776);
        class28.method163(-12106);
        class124.method817((byte) 116);
        class253.method1737(-116);
        class119.method771((byte) -120);
        class240.method1687((byte) -78);
        class81.method449(-116);
        class73.method415(1);
        class97.method602();
        class174.method1188();
        class104.method634((byte) -105);
        class150.method1038(18458);
        class194.method1371((byte) -121);
        class191.method1324((byte) -78);
        class15.method77((byte) -111);
        class94.method525(3);
        class103.method627((byte) 127);
        class156.method1096(128);
        class264.method1784(-1);
        class19.method104(-103);
        class61.method359((byte) -37);
        class187.method1302((byte) -75);
        class128.method873(5);
        class11.method51(0);
        class185.method1295((byte) -39);
        class59.method346(-22486);
        class229.method1631();
        class75.method423(-32384);
        class115.method754(78);
        class111.method719(0);
        class241.method1689();
        class279.method1863(111);
        class265.method1785(false);
        class238.method1679((byte) -95);
        class233.method1656((byte) 5);
        class54.method305((byte) 66);
        class210.method1474((byte) -110);
        class76.method426(32768);
        class245.method1704(-8611);
        class49.method282();
        class62.method361(-127);
        class297.method1990((byte) -116);
        class36.method193((byte) -128);
        class101.method618(116);
        class71.method397((byte) -104);
        class46.method260((byte) 102);
        class18.method95(255);
        class266.method1793((byte) -100);
        class24.method141((byte) -15);
        class83.method457(true);
        class122.method794(101);
        class89.method487(100);
        class95.method532(17936);
        class195.method1374(false);
        class222.method1569(10);
        class255.method1745((byte) 42);
        class181.method1264(41);
        class50.method286(14);
        class80.method448(-61);
        class16.method84(-98);
        class58.method334();
        class3.method14(-128);
        class152.method1041((byte) -101);
        class145.method1011((byte) -118);
        class167.method1154(-14255);
        class296.method1988(490);
        class8.method43(34);
        class69.method389();
        class26.method152();
        class207.method1456(0);
        class105.method636(true);
        class143.method993(-116);
        class53.method303(true);
        class12.method67();
        class199.method1390();
        class178.method1234(851105452);
        class45.method254(27538);
        class215.method1510(0);
        class162.method1128(false);
        class256.method1751((byte) 104);
        class114.method747(100);
        class52.method297(false);
        class214.method1501(true);
        class236.method1670(-8648);
        class204.method1414((byte) 102);
        class231.method1649(false);
        class132.method893(32294);
        class21.method116(-23759);
        class179.method1247(4454);
        class157.method1102((byte) -115);
        class99.method612(4669);
        class170.method1161((byte) 120);
        class206.method1452((byte) 95);
        class235.method1665(-15867);
        class250.method1726(-119);
        class213.method1492(-85);
        class153.method1045(false);
        class288.method1941((byte) -81);
        class218.method1548(true);
        class30.method170((byte) 111);
        class287.method1934((byte) -99);
        class84.method462((byte) 89);
        class275.method1843(-75);
        class196.method1376(-22714);
        class159.method1110(3597);
        class211.method1488(-122);
        class294.method1973(91);
        class289.method1947(-1);
        class9.method44((byte) -111);
        class247.method1713((byte) -98);
        class147.method1015(true);
        class131.method892(-22373);
        class252.method1734((byte) -9);
        class90.method493(-1);
        class295.method1978(true);
        class121.method785(true);
        class57.method332(93);
        class106.method642(false);
        class82.method455((byte) -119);
        class77.method432(40);
        class67.method385(true);
        class251.method1730(118);
        class102.method622(-98);
        class68.method387(0);
        class281.method1874(109);
        class63.method364(241);
        class176.method1219((byte) 114);
        class32.method178(7527);
        class226.method1596(0);
        class117.method758(-121);
        class130.method889(0);
        class41.method225((byte) 64);
        class2.method11((byte) 108);
        class163.method1132(false);
        class14.method72(0);
        class271.method1819(28823);
        class129.method883(-54);
        class186.method1301((byte) -60);
        class51.method295((byte) 98);
        class126.method856((byte) 53);
        class164.method1136(-1668865908);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method732(int arg0) {
        field1606++;
        class281.method1877((byte) 14);
        class135.field2143 = new class177();
        class35.field454 = new class92();
        if (class285.field4544 != 0) {
            class165.field2645 = new byte[50][];
        }
        class44.method245(31318, class194.field3107);
        if (class77.field969 == 0) {
            class131.field2092 = this.getCodeBase().getHost();
            class183.field2906 = 43594;
            class23.field303 = 443;
        } else if (class77.field969 == 1) {
            class131.field2092 = this.getCodeBase().getHost();
            class23.field303 = class42.field538 + 50000;
            class183.field2906 = class42.field538 + 40000;
        } else if (class77.field969 == 2) {
            class23.field303 = class42.field538 + 50000;
            class131.field2092 = "127.0.0.1";
            class183.field2906 = class42.field538 + 40000;
        }
        class70.field873 = class183.field2906;
        class178.field2833 = class70.field873;
        class42.field528 = class23.field303;
        if (class48.field615 == 3 && class77.field969 != 2) {
            class115.field1638 = class42.field538;
        }
        class20.field253 = class183.field2906;
        if (class297.field4695 == 1) {
            class184.field2950 = class206.field3301;
            class44.field570 = true;
            class17.field206 = class41.field508;
            class201.field3186 = class111.field1588;
            class201.field3176 = class4.field62;
        } else {
            class184.field2950 = class204.field3225;
            class201.field3186 = class233.field3860;
            class17.field206 = class167.field2686;
            class201.field3176 = class225.field3617;
        }
        class137.field2169 = class238.field3932 = class93.field1181 = class50.field647 = new short[256];
        if (arg0 != -3) {
            this.method731((byte) 44);
        }
        class180.field2860 = class131.field2092;
        class95.method529(74);
        class67.method386(true, class221.field3551);
        class136.method922(false, class221.field3551);
        class234.field3875 = class102.method621(arg0 + 19742);
        if (class234.field3875 != null) {
            class234.field3875.method144(class221.field3551, (byte) -22);
        }
        class111.field1589 = class48.field615;
        try {
            if (class194.field3107.field605 != null) {
                class190.field3071 = new class184(class194.field3107.field605, 5200, 0);
                for (int var2 = 0; var2 < 29; var2++) {
                    class16.field200[var2] = new class184(class194.field3107.field602[var2], 6000, 0);
                }
                class89.field1100 = new class184(class194.field3107.field603, 6000, 0);
                class39.field488 = new class107(255, class190.field3071, class89.field1100, 500000);
                class21.field282 = new class184(class194.field3107.field614, 24, 0);
                class194.field3107.field605 = null;
                class194.field3107.field603 = null;
                class194.field3107.field614 = null;
                class194.field3107.field602 = null;
            }
        } catch (IOException var3) {
            class190.field3071 = null;
            class39.field488 = null;
            class89.field1100 = null;
            class21.field282 = null;
        }
        if (class77.field969 != 0) {
            class255.field4134 = true;
        }
        class124.field1932 = class143.field2262;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method733(int arg0) {
        class108.field1518 = 0;
        field1614++;
        while (class154.method1052(109) && class108.field1518 < 128) {
            class266.field4282[class108.field1518] = class143.field2258;
            class179.field2854[class108.field1518] = class206.field3292;
            class108.field1518++;
        }
        class32.field427++;
        if (class164.field2602 != -1) {
            class134.method907(class292.field4640, class283.field4517, 0, 0, 0, -1, class164.field2602, 0);
        }
        class162.field2582++;
        class127.method861(30362);
        while (true) {
            class156 var2;
            class123 var3;
            class123 var4;
            do {
                var2 = (class156) class185.field2963.method1808(false);
                if (var2 == null) {
                    while (true) {
                        class156 var5;
                        class123 var6;
                        class123 var7;
                        do {
                            var5 = (class156) class272.field4351.method1808(false);
                            if (var5 == null) {
                                while (true) {
                                    class156 var8;
                                    class123 var9;
                                    class123 var10;
                                    do {
                                        var8 = (class156) class96.field1264.method1808(false);
                                        if (var8 == null) {
                                            if (arg0 >= -65) {
                                                this.method723(-58, -40);
                                            }
                                            if (class5.field75 != null) {
                                                class17.method87(0);
                                            }
                                            if (class23.field302 != null && class23.field302.field3995 == 1) {
                                                if (class23.field302.field3992 != null) {
                                                    class46.method259(class90.field1127, false, class136.field2156);
                                                }
                                                class90.field1127 = false;
                                                class136.field2156 = null;
                                                class23.field302 = null;
                                            }
                                            if ((class73.field924 % 1500) == 0) {
                                                class18.method98(-71);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2516;
                                        if (var9.field1829 < 0) {
                                            break;
                                        }
                                        var10 = class61.method358(var9.field1911, -119);
                                    } while (var10 == null || var10.field1748 == null || var10.field1748.length <= var9.field1829 || var10.field1748[var9.field1829] != var9);
                                    class296.method1985(var8, 200000);
                                }
                            }
                            var6 = var5.field2516;
                            if (var6.field1829 < 0) {
                                break;
                            }
                            var7 = class61.method358(var6.field1911, -118);
                        } while (var7 == null || var7.field1748 == null || var6.field1829 >= var7.field1748.length || var7.field1748[var6.field1829] != var6);
                        class296.method1985(var5, 200000);
                    }
                }
                var3 = var2.field2516;
                if (var3.field1829 < 0) {
                    break;
                }
                var4 = class61.method358(var3.field1911, -123);
            } while (var4 == null || var4.field1748 == null || var3.field1829 >= var4.field1748.length || var4.field1748[var3.field1829] != var3);
            class296.method1985(var2, 200000);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method734(byte arg0) {
        field1615++;
        if (!class272.field4348) {
            label241: while (true) {
                do {
                    if (!class154.method1052(arg0 ^ 0xFFFFFFEB)) {
                        break label241;
                    }
                } while (class206.field3292 != 's' && class206.field3292 != 'S');
                class272.field4348 = true;
            }
        }
        if (class206.field3300 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class249.method1723((byte) 50);
            if (class27.field393 == 0L) {
                class27.field393 = var4;
            }
            if (var3 > 16384 && var4 - class27.field393 < 5000L) {
                if (var4 - class55.field700 > 1000L) {
                    System.gc();
                    class55.field700 = var4;
                }
                class185.field2964 = 5;
                class230.field3755 = class234.field3877;
            } else {
                class230.field3755 = class245.field4023;
                class185.field2964 = 5;
                class206.field3300 = 10;
            }
        } else if (class206.field3300 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class187.field2975[var6] = new class144(104, 104);
            }
            class206.field3300 = 30;
            class185.field2964 = 10;
            class230.field3755 = class207.field3307;
        } else if (class206.field3300 == 30) {
            if (class147.field2303 == null) {
                class147.field2303 = new class291(class35.field454, class135.field2143);
            }
            if (class147.field2303.method1955((byte) -72)) {
                class238.field3935 = class103.method626(0, true, false, true, 1000000);
                class101.field1357 = class103.method626(1, true, false, true, arg0 + 1000127);
                class112.field1599 = class103.method626(2, true, true, false, 1000000);
                class14.field182 = class103.method626(3, true, false, true, 1000000);
                class219.field3511 = class103.method626(4, true, false, true, 1000000);
                class137.field2191 = class103.method626(5, true, true, true, 1000000);
                class182.field2897 = class103.method626(6, false, true, true, 1000000);
                class82.field1010 = class103.method626(7, true, false, true, arg0 + 1000127);
                class147.field2302 = class103.method626(8, true, false, true, 1000000);
                class218.field3487 = class103.method626(9, true, false, true, 1000000);
                class253.field4117 = class103.method626(10, true, false, true, arg0 + 1000127);
                class225.field3624 = class103.method626(11, true, false, true, 1000000);
                class210.field3375 = class103.method626(12, true, false, true, arg0 + 1000127);
                class19.field231 = class103.method626(13, true, false, true, arg0 + 1000127);
                class143.field2259 = class103.method626(14, false, false, true, 1000000);
                class50.field652 = class103.method626(15, true, false, true, 1000000);
                class89.field1095 = class103.method626(16, true, false, true, 1000000);
                class84.field1047 = class103.method626(17, true, false, true, 1000000);
                class76.field955 = class103.method626(18, true, false, true, 1000000);
                class144.field2283 = class103.method626(19, true, false, true, 1000000);
                class84.field1042 = class103.method626(20, true, false, true, arg0 ^ 0xFFF0BDC1);
                class124.field1933 = class103.method626(21, true, false, true, 1000000);
                class75.field938 = class103.method626(22, true, false, true, 1000000);
                class17.field204 = class103.method626(23, true, true, true, 1000000);
                class28.field397 = class103.method626(24, true, false, true, 1000000);
                class102.field1373 = class103.method626(25, true, false, true, arg0 ^ 0xFFF0BDC1);
                class56.field724 = class103.method626(26, true, true, true, 1000000);
                class80.field997 = class103.method626(27, true, false, true, 1000000);
                class294.field4666 = class103.method626(28, true, true, true, 1000000);
                class185.field2964 = 15;
                class206.field3300 = 40;
                class230.field3755 = class47.field593;
            } else {
                class185.field2964 = 12;
                class230.field3755 = class62.field816;
            }
        } else if (class206.field3300 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class296.field4682[var8].method1557(100) * class198.field3143[var8] / 100;
            }
            if (var7 == 100) {
                class230.field3755 = class239.field3941;
                class185.field2964 = 20;
                class255.method1748(class147.field2302, 0);
                class225.method1590(class147.field2302, (byte) -56);
                class182.method1266(26931, class147.field2302);
                class206.field3300 = 41;
            } else {
                if (var7 != 0) {
                    class230.field3755 = class68.field860 + var7 + "%";
                }
                class185.field2964 = 20;
            }
        } else if (class206.field3300 == 41) {
            if (class294.field4666.method925(-98)) {
                this.method742(class294.field4666.method935(1, 41), (byte) -87);
                class206.field3300 = 45;
                class185.field2964 = 25;
                class230.field3755 = class247.field4066;
            } else {
                class230.field3755 = class221.field3545 + class294.field4666.method943(0) + "%";
                class185.field2964 = 25;
            }
        } else if (class206.field3300 == 45) {
            class183.method1275(class212.field3405, 2, 22050, true);
            class202.field3201 = new class155();
            class202.field3201.method1092(128, -1, 9);
            class128.field2048 = class280.method1869((byte) -105, class221.field3551, class194.field3107, 22050, 0);
            class128.field2048.method160(0, class202.field3201);
            class178.method1237(class202.field3201, class219.field3511, class143.field2259, (byte) -26, class50.field652);
            class47.field597 = class280.method1869((byte) -98, class221.field3551, class194.field3107, 2048, 1);
            class191.field3082 = new class290();
            class47.field597.method160(0, class191.field3082);
            class294.field4662 = new class219(22050, class280.field4448);
            class17.field202 = class182.field2897.method929((byte) -87, "scape main");
            class206.field3300 = 50;
            class185.field2964 = 30;
            class230.field3755 = class95.field1211;
        } else if (class206.field3300 == 50) {
            int var9 = class61.method357(-33, class147.field2302, class19.field231);
            int var10 = class95.method534(128);
            if (var10 > var9) {
                class230.field3755 = class296.field4687 + var9 * 100 / var10 + "%";
                class185.field2964 = 35;
            } else {
                class185.field2964 = 35;
                class230.field3755 = class88.field1088;
                class206.field3300 = 60;
            }
        } else if (class206.field3300 == 60) {
            int var11 = class246.method1707(class147.field2302, (byte) 70);
            int var12 = class63.method365(arg0);
            if (var12 > var11) {
                class230.field3755 = class8.field98 + var11 * 100 / var12 + "%";
                class185.field2964 = 40;
            } else {
                class185.field2964 = 40;
                class206.field3300 = 65;
                class230.field3755 = class82.field1014;
            }
        } else if (class206.field3300 == 65) {
            class98.method604(class19.field231, class147.field2302, 28324);
            class230.field3755 = class272.field4353;
            class185.field2964 = 45;
            class2.method13(false, 5);
            class206.field3300 = 70;
        } else if (class206.field3300 == 70) {
            class112.field1599.method925(-94);
            byte var13 = 0;
            int var14 = var13 + class112.field1599.method943(0);
            class89.field1095.method925(-85);
            int var15 = var14 + class89.field1095.method943(arg0 ^ 0xFFFFFF81);
            class84.field1047.method925(-93);
            int var16 = var15 + class84.field1047.method943(0);
            class76.field955.method925(-117);
            int var17 = var16 + class76.field955.method943(0);
            class144.field2283.method925(arg0 + 40);
            int var18 = var17 + class144.field2283.method943(0);
            class84.field1042.method925(-108);
            int var19 = var18 + class84.field1042.method943(0);
            class124.field1933.method925(-102);
            int var20 = var19 + class124.field1933.method943(0);
            class75.field938.method925(arg0 ^ 0x11);
            int var21 = var20 + class75.field938.method943(0);
            class28.field397.method925(arg0 + 26);
            int var22 = var21 + class28.field397.method943(0);
            class102.field1373.method925(arg0 ^ 0x10);
            int var23 = var22 + class102.field1373.method943(0);
            class80.field997.method925(-101);
            int var24 = var23 + class80.field997.method943(0);
            if (var24 < 1100) {
                class185.field2964 = 50;
                class230.field3755 = class173.field2742 + var24 / 11 + "%";
            } else {
                class281.method1875(105, class112.field1599);
                class127.method867((byte) 24, class112.field1599);
                class11.method52(class112.field1599, -1594684786);
                class59.method343(3, class112.field1599, class82.field1010);
                class28.method164(class82.field1010, -9118, class89.field1095, true);
                class137.method954(class76.field955, (byte) 85, class82.field1010);
                class155.method1091(class82.field1010, 2355, class11.field129, class144.field2283, true);
                class11.method54(class112.field1599, arg0 ^ 0x579B);
                class222.method1568(class84.field1042, class238.field3935, class101.field1357, -257);
                class215.method1508(class112.field1599, 114);
                class96.method558(class82.field1010, (byte) -97, class124.field1933);
                class86.method469(class75.field938, -7499);
                class179.method1249((byte) 71, class112.field1599);
                class143.method991(class14.field182, class82.field1010, (byte) -126, class19.field231, class147.field2302);
                class116.method755((byte) 112, class112.field1599);
                class219.method1554(class84.field1047, 20662);
                class237.method1672(arg0 + 128, class28.field397, new class189(), class102.field1373);
                class95.method533((byte) -68, class102.field1373, class28.field397);
                class226.method1597(-5798, class112.field1599);
                class89.method486(class112.field1599, 2048);
                class85.method464((byte) -79, class112.field1599);
                class144.method996(class112.field1599, class147.field2302, 2883968);
                class46.method261(class112.field1599, class147.field2302, (byte) 120);
                class185.field2964 = 50;
                class230.field3755 = class190.field3072;
                class175.method1214(0);
                class206.field3300 = 80;
            }
        } else if (class206.field3300 == 80) {
            int var25 = class75.method424((byte) 57, class147.field2302);
            int var26 = class295.method1979(-18843);
            if (var26 > var25) {
                class185.field2964 = 60;
                class230.field3755 = class145.field2297 + var25 * 100 / var26 + "%";
            } else {
                class203.method1412(class147.field2302, arg0 + 238);
                class230.field3755 = class34.field433;
                class185.field2964 = 60;
                class206.field3300 = 90;
            }
        } else if (class206.field3300 == 90) {
            if (class56.field724.method925(-104)) {
                class119 var27 = new class119(class218.field3487, class56.field724, class147.field2302, 20, !class98.field1321);
                class174.method1190(var27);
                if (class32.field430 == 1) {
                    class174.method1203(0.9F);
                }
                if (class32.field430 == 2) {
                    class174.method1203(0.8F);
                }
                if (class32.field430 == 3) {
                    class174.method1203(0.7F);
                }
                if (class32.field430 == 4) {
                    class174.method1203(0.6F);
                }
                class206.field3300 = 100;
                class230.field3755 = class17.field212;
                class185.field2964 = 70;
            } else {
                class230.field3755 = class252.field4112 + class56.field724.method943(arg0 ^ 0xFFFFFF81) + "%";
                class185.field2964 = 70;
            }
        } else if (class206.field3300 == 100) {
            if (class129.method880(class147.field2302, 3)) {
                class206.field3300 = 110;
            }
        } else if (class206.field3300 == 110) {
            class124.field1924 = new class261();
            class194.field3107.method271(10, class124.field1924, 2);
            class230.field3755 = class51.field654;
            class185.field2964 = 75;
            class206.field3300 = 120;
        } else if (class206.field3300 == 120) {
            if (class253.field4117.method948("", -125, "huffman")) {
                class104 var28 = new class104(class253.field4117.method945("huffman", arg0 ^ 0xFFFFFF81, ""));
                class22.method130(var28, (byte) 2);
                class206.field3300 = 130;
                class230.field3755 = class98.field1295;
                class185.field2964 = 80;
            } else {
                class230.field3755 = class119.field1694 + "0%";
                class185.field2964 = 80;
            }
        } else if (class206.field3300 == 130) {
            if (!class14.field182.method925(-111)) {
                class230.field3755 = class259.field4193 + class14.field182.method943(arg0 + 127) * 3 / 4 + "%";
                class185.field2964 = 85;
            } else if (!class210.field3375.method925(-110)) {
                class230.field3755 = class259.field4193 + ((class210.field3375.method943(0) / 10) + 75) + "%";
                class185.field2964 = 85;
            } else if (!class19.field231.method925(arg0 ^ 0x2)) {
                class230.field3755 = class259.field4193 + (class19.field231.method943(0) / 20 + 85) + "%";
                class185.field2964 = 85;
            } else if (class17.field204.method958("details", (byte) -128)) {
                class74.method419(class17.field204, (byte) -45, class235.field3889);
                class257.method1758(class82.field1010);
                class185.field2964 = 95;
                class206.field3300 = 135;
                class230.field3755 = class278.field4411;
            } else {
                class230.field3755 = class259.field4193 + (class17.field204.method952("details", (byte) -120) / 10 + 90) + "%";
                class185.field2964 = 85;
            }
        } else if (class206.field3300 == 135) {
            int var29 = class17.method90(3);
            if (var29 == -1) {
                class230.field3755 = class274.field4384;
                class185.field2964 = 95;
            } else if (var29 == 7 || var29 == 9) {
                this.method1891(false, "worldlistfull");
                class2.method13(false, 1000);
            } else if (class294.field4667) {
                class185.field2964 = 96;
                class206.field3300 = 140;
                class230.field3755 = class60.field767;
            } else {
                this.method1891(false, "worldlistio_" + var29);
                class2.method13(false, 1000);
            }
        } else if (class206.field3300 == 140) {
            class258.field4182 = class14.field182.method929((byte) -8, "loginscreen");
            class137.field2191.method949(-2, true, false);
            class182.field2897.method949(-2, true, true);
            class147.field2302.method949(arg0 + 125, true, true);
            class19.field231.method949(-2, true, true);
            class253.field4117.method949(-2, true, true);
            class14.field182.method949(-2, true, true);
            class252.field4116 = true;
            class206.field3300 = 150;
            class230.field3755 = class200.field3165;
            class185.field2964 = 97;
        } else {
            if (arg0 != -127) {
                method738((byte) 103);
            }
            if (class206.field3300 == 150) {
                if (class272.field4348) {
                    class67.field855 = 0;
                    class22.field294 = 0;
                    class95.field1201 = 0;
                    class194.field3109 = 0;
                }
                class272.field4348 = true;
                class111.method716(0, class194.field3107);
                class11.method53(-1, -1, false, 3, class67.field855);
                class206.field3300 = 160;
                class185.field2964 = 100;
                class230.field3755 = class207.field3314;
            } else if (class206.field3300 == 160) {
                class183.method1270(true, (byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwb;)Luf;")
    public static final class171 method735(class123 arg0) {
        class171 var1 = (class171) class25.field345.method708(((long) arg0.field1844 << 32) + (long) arg0.field1829, 120);
        return var1 == null ? arg0.field1828 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwb;)Z")
    public static final boolean method736(class123 arg0) {
        if (class60.field764) {
            if (method735(arg0).field2703 != 0) {
                return false;
            }
            if (arg0.field1778 == 0) {
                return false;
            }
        }
        return arg0.field1832;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBII)V")
    public static final void method737(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1604++;
        if (arg0 >= class117.field1656 && arg0 <= class132.field2105) {
            int var5 = class256.method1750(62, arg1, class116.field1653, class114.field1634);
            int var6 = class256.method1750(70, arg4, class116.field1653, class114.field1634);
            class269.method1814(arg0, var6, 18869, arg3, var5);
        }
        int var7 = -40 / ((arg2 + 58) / 52);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public static final void method738(byte arg0) {
        field1602++;
        class180.field2856 = null;
        if (arg0 != 104) {
            method735((class123) null);
        }
        class122.method793(0, class164.field2602, -1, class292.field4640, 0, 523091273, 0, 0, class283.field4517);
        if (class180.field2856 != null) {
            class287.method1937(class283.field4517, class137.field2199, 0, class152.field2356, 33, class150.field2343.field1903, class180.field2856, 0, -1412584499, class292.field4640);
            class180.field2856 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method739(byte arg0) {
        field1612++;
        if (class250.field4085 == 1000) {
            return;
        }
        if (arg0 >= -118) {
            this.method741(125);
        }
        long var2 = class249.method1723((byte) 50) - class291.field4620;
        class291.field4620 = class249.method1723((byte) 54);
        boolean var4 = class218.method1543(1);
        if (var4 && class271.field4335 && class128.field2048 != null) {
            class128.field2048.method157(1);
        }
        if ((class250.field4085 == 30 || class250.field4085 == 10) && (class289.field4603 || class286.field4561 != 0L && class286.field4561 < class249.method1723((byte) 13))) {
            class11.method53(class98.field1315, class138.field2213, class289.field4603, 3, class192.method1326((byte) -89));
        }
        if (class46.field586 == null) {
            Container var5;
            if (class46.field586 != null) {
                var5 = class46.field586;
            } else if (class41.field517 == null) {
                var5 = class194.field3107.field609;
            } else {
                var5 = class41.field517;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class41.field517 == var5) {
                Insets var8 = class41.field517.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class137.field2161 != var6 || class83.field1033 != var7) {
                if (class48.field608.startsWith("mac")) {
                    class83.field1033 = var7;
                    class137.field2161 = var6;
                } else {
                    class281.method1877((byte) 14);
                }
                class286.field4561 = class249.method1723((byte) 43) + 500L;
            }
        }
        boolean var9 = false;
        if (class203.field3206) {
            var9 = true;
            class203.field3206 = false;
        }
        if (var9) {
            class144.method1007(true);
        }
        if (class250.field4085 == 0) {
            class15.method80(class230.field3755, class185.field2964, var9, (byte) 87, (Color) null);
        } else if (class250.field4085 == 5) {
            class98.method605(class280.field4439, false, 956);
        } else if (class250.field4085 == 10) {
            class209.method1468((byte) -71);
        } else if (class250.field4085 == 25 || class250.field4085 == 28) {
            if (class135.field2135 == 1) {
                if (class180.field2875 < class77.field972) {
                    class180.field2875 = class77.field972;
                }
                int var10 = (class180.field2875 - class77.field972) * 50 / class180.field2875;
                class210.method1478(false, class62.field813 + "<br>(" + var10 + "%)", (byte) 92);
            } else if (class135.field2135 == 2) {
                if (class132.field2104 < class204.field3224) {
                    class132.field2104 = class204.field3224;
                }
                int var11 = ((class132.field2104 - class204.field3224) * 50 / class132.field2104) + 50;
                class210.method1478(false, class62.field813 + "<br>(" + var11 + "%)", (byte) 97);
            } else {
                class210.method1478(false, class62.field813, (byte) 98);
            }
        } else if (class250.field4085 == 30) {
            class266.method1789(var2, -11169);
        } else if (class250.field4085 == 40) {
            class210.method1478(false, class152.field2355 + "<br>" + class196.field3130, (byte) 116);
        }
        if ((class250.field4085 == 30 || class250.field4085 == 10) && class244.field4005 == 0 && !var9) {
            try {
                Graphics var14 = class221.field3551.getGraphics();
                for (int var15 = 0; var15 < class221.field3561; var15++) {
                    if (class103.field1386[var15]) {
                        class52.field673.method50(class180.field2869[var15], class148.field2328[var15], class256.field4160[var15], class233.field3858[var15], var14, (byte) 12);
                        class103.field1386[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class221.field3551.repaint();
            }
        } else if (class250.field4085 != 0) {
            try {
                Graphics var12 = class221.field3551.getGraphics();
                class52.field673.method49(0, var12, -129, 0);
                for (int var13 = 0; var13 < class221.field3561; var13++) {
                    class103.field1386[var13] = false;
                }
            } catch (Exception var17) {
                class221.field3551.repaint();
            }
        }
        if (class252.field4116) {
            class128.method871((byte) -45);
        }
        if (class272.field4348 && class250.field4085 == 10 && class164.field2602 != -1) {
            class272.field4348 = false;
            class111.method716(0, class194.field3107);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public static final void method740(boolean arg0) {
        if (arg0) {
            return;
        }
        field1607++;
        while (true) {
            class266 var1;
            class230 var3;
            do {
                var1 = (class266) class221.field3554.method1808(false);
                if (var1 == null) {
                    return;
                }
                if (var1.field4275 < 0) {
                    int var2 = -var1.field4275 - 1;
                    if (class185.field2958 == var2) {
                        var3 = class286.field4571;
                    } else {
                        var3 = class89.field1113[var2];
                    }
                } else {
                    int var4 = var1.field4275 - 1;
                    var3 = class265.field4273[var4];
                }
            } while (var3 == null);
            class228 var5 = class256.method1749(var1.field4292, 0);
            int var6;
            int var7;
            if (var1.field4277 == 1 || var1.field4277 == 3) {
                var6 = var5.field3714;
                var7 = var5.field3655;
            } else {
                var6 = var5.field3655;
                var7 = var5.field3714;
            }
            int var8 = (var6 >> 1) + var1.field4285;
            int var9 = (var7 >> 1) + var1.field4293;
            int var10 = (var7 + 1 >> 1) + var1.field4293;
            int var11 = (var6 + 1 >> 1) + var1.field4285;
            int[][] var12 = class17.field209[class244.field4011];
            class264 var13 = null;
            int var14 = var12[var8][var9] + var12[var8][var10] + var12[var11][var10] + var12[var11][var9] >> 2;
            int var15 = class115.field1645[var1.field4281];
            if (var15 == 0) {
                class187 var16 = class4.method20(class244.field4011, var1.field4285, var1.field4293);
                if (var16 != null) {
                    var13 = var16.field2983;
                }
            } else if (var15 == 1) {
                class128 var17 = class285.method1914(class244.field4011, var1.field4285, var1.field4293);
                if (var17 != null) {
                    var13 = var17.field2043;
                }
            } else if (var15 == 2) {
                class19 var19 = class74.method417(class244.field4011, var1.field4285, var1.field4293);
                if (var19 != null) {
                    var13 = var19.field234;
                }
            } else if (var15 == 3) {
                class11 var18 = class181.method1259(class244.field4011, var1.field4285, var1.field4293);
                if (var18 != null) {
                    var13 = var18.field127;
                }
            }
            if (var13 != null) {
                class104.method633(true, var1.field4285, 0, 0, class244.field4011, var1.field4293, -1, var15, var1.field4290 + 1, var1.field4291 + 1);
                var3.field3826 = var1.field4285 * 128 + var6 * 64;
                var3.field3838 = class73.field924 + var1.field4291;
                var3.field3771 = var14;
                var3.field3760 = var13;
                int var20 = var1.field4294;
                var3.field3744 = var1.field4293 * 128 + var7 * 64;
                var3.field3780 = class73.field924 + var1.field4290;
                int var21 = var1.field4289;
                int var22 = var1.field4286;
                int var23 = var1.field4283;
                if (var23 > var20) {
                    int var24 = var23;
                    var23 = var20;
                    var20 = var24;
                }
                var3.field3815 = var1.field4285 + var20;
                if (var22 < var21) {
                    int var25 = var21;
                    var21 = var22;
                    var22 = var25;
                }
                var3.field3754 = var1.field4285 + var23;
                var3.field3834 = var1.field4293 + var21;
                var3.field3796 = var1.field4293 + var22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method741(int arg0) {
        if (class124.field1924 != null) {
            class124.field1924.field4230 = false;
        }
        field1601++;
        class124.field1924 = null;
        if (class28.field400 != null) {
            class28.field400.method1210(-1);
            class28.field400 = null;
        }
        class285.method1910(class221.field3551, (byte) -117);
        class24.method137(class221.field3551, (byte) 29);
        if (class234.field3875 != null) {
            class234.field3875.method146(class221.field3551, 0);
        }
        class59.method347(true);
        class126.method857(-624818004);
        class234.field3875 = null;
        if (class128.field2048 != null) {
            class128.field2048.method156(true);
        }
        if (class47.field597 != null) {
            class47.field597.method156(true);
        }
        class35.field454.method506(arg0 ^ 0x44);
        class135.field2143.method1230((byte) -100);
        if (arg0 != -1) {
            field1605 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
    private final void method742(byte[] arg0, byte arg1) {
        field1603++;
        class96 var3 = new class96(arg0);
        if (arg1 >= -81) {
            field1605 = null;
        }
        while (true) {
            int var4 = var3.method584(255);
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                var3.method549(255);
                var3.method549(255);
                var3.method549(255);
                var3.method549(255);
                var3.method549(255);
                var3.method549(255);
            }
        }
    }
}
