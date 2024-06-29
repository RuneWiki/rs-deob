import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 extends class85 {

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lva;")
    private static class121 field603 = class107.method797("Enter object name", -10983);

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lva;")
    public static class121 field594 = class107.method797("mod_icons", -10983);

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "Lva;")
    private static class121 field607 = class107.method797("button near the top of that page)3", -10983);

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!dd", name = "tb", descriptor = "Lva;")
    public static class121 field609 = field603;

    @OriginalMember(owner = "client!dd", name = "vb", descriptor = "Lva;")
    public static class121 field611 = field607;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "Lea;")
    public static class26 field596 = new class26();

    @OriginalMember(owner = "client!dd", name = "xb", descriptor = "[[[B")
    public static byte[][][] field613 = new byte[4][104][104];

    @OriginalMember(owner = "client!dd", name = "yb", descriptor = "Ltc;")
    public static class113 field614 = new class113(8);

    @OriginalMember(owner = "client!dd", name = "zb", descriptor = "Lva;")
    public static class121 field615 = class107.method797("::fpson", -10983);

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
    public int field598;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!dd", name = "wb", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!dd", name = "Ab", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dd", name = "ub", descriptor = "Lhe;")
    public static class47 field610;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lrb;", line = 30)
    public final class102 method188(int arg0) {
        field602++;
        return arg0 < 60 ? null : class114.method872((byte) 121, this.field598).method918(this.field593, (byte) 59, true);
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V", line = 42)
    public static final void method189(boolean arg0) {
        field599++;
        class26 var1 = field596;
        synchronized (field596) {
            class107.field2432 = class64.field1571;
            class34.field822 = class81.field1871;
            class19.field514 = class79.field1837;
            class21.field568 = class81.field1880;
            class15.field280 = class66.field1590;
            class82.field1909 = class21.field559;
            class12.field196 = class11.field195;
            if (arg0) {
                field609 = null;
            }
            class81.field1880 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V", line = 70)
    public static final void method190(byte arg0) {
        class16.field342 = 0;
        field605++;
        int var1 = -19 / ((-arg0 - 47) / 42);
        for (int var2 = -1; var2 < class42.field965 + class13.field231; var2++) {
            class29 var19;
            if (var2 == -1) {
                var19 = class62.field1494;
            } else if (var2 >= class13.field231) {
                var19 = class8.field110[class1.field7[var2 - class13.field231]];
            } else {
                var19 = class127.field2895[class71.field1680[var2]];
            }
            if (var19 != null && var19.method232(-251272184)) {
                if (var19 instanceof class50) {
                    class16 var20 = ((class50) var19).field1183;
                    if (var20.field311 != null) {
                        var20 = var20.method131((byte) 2);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= class13.field231) {
                    class16 var21 = ((class50) var19).field1183;
                    if (var21.field317 >= 0 && class18.field359.length > var21.field317) {
                        class46.method308(var19, var19.field784 + 15, (byte) 127);
                        if (class47.field1133 > -1) {
                            class18.field359[var21.field317].method71(class47.field1133 - 12, class40.field910 + -30);
                        }
                    }
                    if (class95.field2120 == 1 && class1.field7[var2 - class13.field231] == class107.field2436 && class115.field2614 % 20 < 10) {
                        class46.method308(var19, var19.field784 + 15, (byte) -37);
                        if (class47.field1133 > -1) {
                            class95.field2111[0].method71(class47.field1133 - 12, class40.field910 + -28);
                        }
                    }
                } else {
                    int var22 = 30;
                    class77 var23 = (class77) var19;
                    if (var23.field1772 != -1 || var23.field1756 != -1) {
                        class46.method308(var19, var19.field784 + 15, (byte) 126);
                        if (class47.field1133 > -1) {
                            if (var23.field1772 != -1) {
                                class1.field13[var23.field1772].method71(class47.field1133 - 12, -var22 + class40.field910);
                                var22 += 25;
                            }
                            if (var23.field1756 != -1) {
                                class18.field359[var23.field1756].method71(class47.field1133 - 12, -var22 + class40.field910);
                                var22 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && class95.field2120 == 10 && class71.field1680[var2] == class59.field1415) {
                        class46.method308(var19, var19.field784 + 15, (byte) -15);
                        if (class47.field1133 > -1) {
                            class95.field2111[1].method71(class47.field1133 - 12, -var22 + class40.field910);
                        }
                    }
                }
                if (var19.field737 != null && (var2 >= class13.field231 || class63.field1526 == 0 || class63.field1526 == 3 || class63.field1526 == 1 && class114.method876(69, ((class77) var19).field1766))) {
                    class46.method308(var19, var19.field784, (byte) 123);
                    if (class47.field1133 > -1 && class16.field342 < class69.field1644) {
                        class69.field1630[class16.field342] = class60.field1426.method898(var19.field737) / 2;
                        class69.field1652[class16.field342] = class60.field1426.field2650;
                        class69.field1656[class16.field342] = class47.field1133;
                        class69.field1634[class16.field342] = class40.field910;
                        class69.field1632[class16.field342] = var19.field768;
                        class69.field1646[class16.field342] = var19.field789;
                        class69.field1641[class16.field342] = var19.field760;
                        class69.field1635[class16.field342] = var19.field737;
                        class16.field342++;
                    }
                }
                if (class115.field2614 < var19.field735) {
                    class46.method308(var19, var19.field784 + 15, (byte) 126);
                    if (class47.field1133 > -1) {
                        int var24 = var19.field770 * 30 / var19.field757;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class55.method401(class47.field1133 - 15, class40.field910 + -3, var24, 5, 65280);
                        class55.method401(class47.field1133 + var24 - 15, class40.field910 + -3, 30 - var24, 5, 16711680);
                    }
                }
                for (int var25 = 0; var25 < 4; var25++) {
                    if (class115.field2614 < var19.field779[var25]) {
                        class46.method308(var19, var19.field784 / 2, (byte) -15);
                        if (class47.field1133 > -1) {
                            if (var25 == 1) {
                                class40.field910 -= 20;
                            }
                            if (var25 == 2) {
                                class40.field910 -= 10;
                                class47.field1133 -= 15;
                            }
                            if (var25 == 3) {
                                class40.field910 -= 10;
                                class47.field1133 += 15;
                            }
                            class42.field975[var19.field775[var25]].method71(class47.field1133 - 12, class40.field910 + -12);
                            class11.field194.method893(class35.method242(var19.field761[var25], 10), class47.field1133, class40.field910 + 4, 0);
                            class11.field194.method893(class35.method242(var19.field761[var25], 10), class47.field1133 - 1, class40.field910 - -3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < class16.field342; var3++) {
            int var4 = class69.field1634[var3];
            int var5 = class69.field1630[var3];
            int var6 = class69.field1656[var3];
            int var7 = class69.field1652[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; var18++) {
                    if (class69.field1634[var18] - class69.field1652[var18] < var4 + 2 && var4 - var7 < class69.field1634[var18] + 2 && var6 - var5 < class69.field1656[var18] + class69.field1630[var18] && var5 + var6 > class69.field1656[var18] + -class69.field1630[var18] && class69.field1634[var18] - class69.field1652[var18] < var4) {
                        var8 = true;
                        var4 = class69.field1634[var18] - class69.field1652[var18];
                    }
                }
            }
            class47.field1133 = class69.field1656[var3];
            class40.field910 = class69.field1634[var3] = var4;
            class121 var9 = class69.field1635[var3];
            if (class92.field2082 == 0) {
                int var10 = 16776960;
                if (class69.field1632[var3] < 6) {
                    var10 = class62.field1507[class69.field1632[var3]];
                }
                if (class69.field1632[var3] == 6) {
                    var10 = class121.field2782 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class69.field1632[var3] == 7) {
                    var10 = class121.field2782 % 20 < 10 ? 255 : 65535;
                }
                if (class69.field1632[var3] == 8) {
                    var10 = class121.field2782 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class69.field1632[var3] == 9) {
                    int var11 = 150 - class69.field1641[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (class69.field1632[var3] == 10) {
                    int var12 = 150 - class69.field1641[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = var12 * 327680 + 255 + 500 - var12 * 5 - 32768000;
                    }
                }
                if (class69.field1632[var3] == 11) {
                    int var13 = 150 - class69.field1641[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 + 32768000 - var13 * 327680;
                    }
                }
                if (class69.field1646[var3] == 0) {
                    class60.field1426.method893(var9, class47.field1133, class40.field910 + 1, 0);
                    class60.field1426.method893(var9, class47.field1133, class40.field910, var10);
                }
                if (class69.field1646[var3] == 1) {
                    class60.field1426.method899(var9, class47.field1133, class40.field910 + 1, 0, class121.field2782);
                    class60.field1426.method899(var9, class47.field1133, class40.field910, var10, class121.field2782);
                }
                if (class69.field1646[var3] == 2) {
                    class60.field1426.method886(var9, class47.field1133, class40.field910 + 1, 0, class121.field2782);
                    class60.field1426.method886(var9, class47.field1133, class40.field910, var10, class121.field2782);
                }
                if (class69.field1646[var3] == 3) {
                    class60.field1426.method889(var9, class47.field1133, class40.field910 + 1, 0, class121.field2782, 150 - class69.field1641[var3]);
                    class60.field1426.method889(var9, class47.field1133, class40.field910, var10, class121.field2782, 150 - class69.field1641[var3]);
                }
                if (class69.field1646[var3] == 4) {
                    int var14 = class60.field1426.method898(var9);
                    int var15 = (150 - class69.field1641[var3]) * (var14 + 100) / 150;
                    class55.method400(class47.field1133 - 50, 0, class47.field1133 + 50, 334);
                    class60.field1426.method897(var9, class47.field1133 + 50 - var15, class40.field910 - -1, 0);
                    class60.field1426.method897(var9, class47.field1133 + 50 - var15, class40.field910, var10);
                    class55.method402();
                }
                if (class69.field1646[var3] == 5) {
                    int var16 = 150 - class69.field1641[var3];
                    class55.method400(0, class40.field910 - class60.field1426.field2650 - 1, 512, class40.field910 + 5);
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class60.field1426.method893(var9, class47.field1133, class40.field910 + var17 + 1, 0);
                    class60.field1426.method893(var9, class47.field1133, class40.field910 + var17, var10);
                    class55.method402();
                }
            } else {
                class60.field1426.method893(var9, class47.field1133, class40.field910 + 1, 0);
                class60.field1426.method893(var9, class47.field1133, class40.field910, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 454)
    public static final void method191(int arg0) {
        class34.field829 = null;
        class100.field2228 = null;
        class41.field928 = null;
        class25.field632 = null;
        class115.field2630 = null;
        class48.field1161 = null;
        class115.field2621 = null;
        class20.field525 = null;
        class33.field813 = null;
        class14.field245 = null;
        class80.field1860 = null;
        field600++;
        class61.field1465 = null;
        if (arg0 != -3) {
            field615 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILhe;Lhe;)V", line = 476)
    public static final void method192(int arg0, class47 arg1, class47 arg2) {
        class127.field2924 = arg2;
        class69.field1637 = arg1;
        field606++;
        if (arg0 != -16269) {
            field604 = 17;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lhe;BZLhe;)V", line = 495)
    public static final void method193(class47 arg0, byte arg1, boolean arg2, class47 arg3) {
        class14.field262 = arg0;
        class97.field2189 = arg2;
        field612++;
        if (arg1 != -22) {
            field609 = null;
        }
        class129.field2976 = arg3;
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 516)
    public static void method194(int arg0) {
        field609 = null;
        if (arg0 != -17194) {
            method193(null, (byte) -50, false, null);
        }
        field611 = null;
        field607 = null;
        field603 = null;
        field613 = null;
        field594 = null;
        field614 = null;
        field615 = null;
        field610 = null;
        field596 = null;
    }
}
