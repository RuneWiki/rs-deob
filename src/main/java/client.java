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
public class client extends class39 {

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field624 = 0;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field607 = 1;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "Loh;")
    private static class258 field623 = class153.method1046("settings", 127);

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "[Z")
    public static boolean[] field610 = new boolean[112];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field606 = 0;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field628;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 4)
    public final void method301(int arg0) {
        field605++;
        class170.method1128(arg0 + 1073741823);
        class282.field4849 = new class202();
        class287.field4944 = new class279();
        if (arg0 != 0) {
            return;
        }
        if (class215.field3737 == 0) {
        }
        class168.method1113((byte) 127, class297.field5086);
        if (class50.field789 == 0) {
            class201.field3486 = this.getCodeBase().getHost();
            class228.field3949 = 443;
            class243.field4225 = 43594;
        } else if (class50.field789 == 1) {
            class201.field3486 = this.getCodeBase().getHost();
            class243.field4225 = class115.field2050 + 40000;
            class228.field3949 = class115.field2050 + 50000;
        } else if (class50.field789 == 2) {
            class243.field4225 = class115.field2050 + 40000;
            class201.field3486 = "127.0.0.1";
            class228.field3949 = class115.field2050 + 50000;
        }
        if (class295.field5062 == 3 && class50.field789 != 2) {
            class253.field4358 = class115.field2050;
        }
        class118.field2090 = class228.field3949;
        class120.field2112 = class201.field3486;
        class130.field2294 = class243.field4225;
        if (class155.field2663 == 1) {
            class225.field3865 = class241.field4186;
            class169.field2884 = class238.field4162;
            class271.field4701 = class20.field235;
            class167.field2838 = class74.field1294;
            class304.field5181 = 0;
            class304.field5187 = 16777215;
        } else {
            class271.field4701 = class70.field1222;
            class225.field3865 = class113.field1956;
            class169.field2884 = class10.field119;
            class167.field2838 = class220.field3807;
        }
        class148.field2507 = class243.field4225;
        class193.field3413 = class148.field2507;
        class83.field1395 = class70.field1226 = class184.field3285 = class115.field2062 = new short[256];
        class34.method239((byte) 121);
        class137.method954(class5.field67, 26406);
        class165.method1101(120, class5.field67);
        class206.field3563 = class226.method1517(arg0 + 158);
        if (class206.field3563 != null) {
            class206.field3563.method483(class5.field67, false);
        }
        class214.field3718 = class295.field5062;
        try {
            if (class297.field5086.field5072 != null) {
                class37.field484 = new class38(class297.field5086.field5072, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class268.field4673[var2] = new class38(class297.field5086.field5078[var2], 6000, 0);
                }
                class124.field2197 = new class38(class297.field5086.field5067, 6000, 0);
                class205.field3553 = new class80(255, class37.field484, class124.field2197, 500000);
                class253.field4356 = new class38(class297.field5086.field5065, 24, 0);
                class297.field5086.field5067 = null;
                class297.field5086.field5072 = null;
                class297.field5086.field5065 = null;
                class297.field5086.field5078 = null;
            }
        } catch (IOException var4) {
            class37.field484 = null;
            class124.field2197 = null;
            class253.field4356 = null;
            class205.field3553 = null;
        }
        if (class50.field789 != 0) {
            class282.field4843 = true;
        }
        class287.field4938 = class205.field3543;
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 116)
    private final void method344(int arg0) {
        field612++;
        for (class233.field4037 = 0; class201.method1332(22315) && class233.field4037 < 128; class233.field4037++) {
            class127.field2258[class233.field4037] = class88.field1506;
            class50.field774[class233.field4037] = class231.field3989;
        }
        class251.field4329++;
        if (class170.field2901 != -1) {
            class224.method1510(class170.field2901, 0, 125, 0, class218.field3773, 0, 0, class42.field577);
        }
        class182.field3259++;
        int var2 = 108 / ((arg0 - 27) / 36);
        if (class257.field4390) {
            int var3 = 19137023;
            label190: for (int var4 = 0; var4 < 32768; var4++) {
                class107 var5 = class16.field214[var4];
                if (var5 != null) {
                    byte var6 = var5.field1906.field2563;
                    if ((var6 & 0x2) > 0 && var5.field971 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var8 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var7 != 0 || var8 != 0) {
                            var5.field975[0] = (var5.field912 >> 7) + var7;
                            var5.field959[0] = (var5.field934 >> 7) + var8;
                            class243.field4216[class272.field4704].method1674((byte) -121, var5.method447(18123), 0, var5.method447(18123), false, var5.field934 >> 7, var5.field912 >> 7);
                            if (var5.field975[0] >= 0 && var5.field975[0] <= 104 - var5.method447(18123) && var5.field959[0] >= 0 && var5.field959[0] <= 104 - var5.method447(18123) && class243.field4216[class272.field4704].method1676(var5.field959[0], var5.field934 >> 7, 19661088, var5.field912 >> 7, var5.field975[0])) {
                                if (var5.method447(18123) > 1) {
                                    for (int var9 = var5.field975[0]; var9 < var5.field975[0] + var5.method447(18123); var9++) {
                                        for (int var10 = var5.field959[0]; var10 < (var5.field959[0] + var5.method447(18123)); var10++) {
                                            if ((class243.field4216[class272.field4704].field4255[var9][var10] & var3) != 0) {
                                                continue label190;
                                            }
                                        }
                                    }
                                }
                                var5.field971 = 1;
                            }
                        }
                    }
                    class279.method1966(var5, -19119);
                    class1.method4(var5, (byte) -54);
                    class130.method938(var5, (byte) -106);
                    class243.field4216[class272.field4704].method1660(var5.field934 >> 7, var5.method447(18123), var5.method447(18123), var5.field912 >> 7, true, false);
                }
            }
        }
        if (!class257.field4390) {
            class172.method1166((byte) 119);
        } else if (class140.field2386 == 0 && class165.field2810 == 0) {
            if (class109.field1926 == 2) {
                class123.method901(true);
            } else {
                class285.method1997(true);
            }
            if ((class285.field4906 >> 7) < 14 || (class285.field4906 >> 7) >= 90 || (class61.field1086 >> 7) < 14 || (class61.field1086 >> 7) >= 90) {
                class137.method955(false);
            }
        }
        while (true) {
            class42 var11;
            class171 var12;
            class171 var13;
            do {
                var11 = (class42) class238.field4157.method88(true);
                if (var11 == null) {
                    while (true) {
                        class42 var14;
                        class171 var15;
                        class171 var16;
                        do {
                            var14 = (class42) class217.field3744.method88(true);
                            if (var14 == null) {
                                while (true) {
                                    class42 var17;
                                    class171 var18;
                                    class171 var19;
                                    do {
                                        var17 = (class42) class87.field1484.method88(true);
                                        if (var17 == null) {
                                            if (class206.field3558 != null) {
                                                class284.method1994((byte) -109);
                                            }
                                            if (class229.field3953 != null && class229.field3953.field2067 == 1) {
                                                if (class229.field3953.field2063 != null) {
                                                    class252.method1705(false, class85.field1432, class99.field1757);
                                                }
                                                class99.field1757 = false;
                                                class85.field1432 = null;
                                                class229.field3953 = null;
                                            }
                                            return;
                                        }
                                        var18 = var17.field598;
                                        if (var18.field2930 < 0) {
                                            break;
                                        }
                                        var19 = class263.method1844(var18.field2923, (byte) -70);
                                    } while (var19 == null || var19.field2982 == null || var19.field2982.length <= var18.field2930 || var19.field2982[var18.field2930] != var18);
                                    class193.method1303(200000, var17);
                                }
                            }
                            var15 = var14.field598;
                            if (var15.field2930 < 0) {
                                break;
                            }
                            var16 = class263.method1844(var15.field2923, (byte) -70);
                        } while (var16 == null || var16.field2982 == null || var15.field2930 >= var16.field2982.length || var16.field2982[var15.field2930] != var15);
                        class193.method1303(200000, var14);
                    }
                }
                var12 = var11.field598;
                if (var12.field2930 < 0) {
                    break;
                }
                var13 = class263.method1844(var12.field2923, (byte) -70);
            } while (var13 == null || var13.field2982 == null || var13.field2982.length <= var12.field2930 || var13.field2982[var12.field2930] != var12);
            class193.method1303(200000, var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 340)
    private final void method345(int arg0) {
        field608++;
        boolean var2 = class287.field4944.method1968(-1);
        if (arg0 != -3) {
            field624 = 55;
        }
        if (!var2) {
            this.method348(2);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z", line = 360)
    public static final boolean method346(int arg0, int arg1, int arg2) {
        int var3 = class149.field2529[arg0][arg1][arg2];
        if (-class238.field4158 == var3) {
            return false;
        } else if (class238.field4158 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class229.method1526(var4 + 1, class201.field3482[arg0][arg1][arg2], var5 + 1) && class229.method1526(var4 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg2], var5 + 1) && class229.method1526(var4 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class229.method1526(var4 + 1, class201.field3482[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class149.field2529[arg0][arg1][arg2] = class238.field4158;
                return true;
            } else {
                class149.field2529[arg0][arg1][arg2] = -class238.field4158;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 403)
    public final void method305(byte arg0) {
        field617++;
        if (class280.field4818 == 1000) {
            return;
        }
        if (arg0 >= -27) {
            method353(true, 111);
        }
        class202.field3498++;
        if (class202.field3498 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class139.field2372 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class193.field3407.setSeed((long) class139.field2372);
        }
        this.method345(-3);
        if (class248.field4293 != null) {
            class248.field4293.method72(22);
        }
        class300.method2109((byte) 26);
        class172.method1164(26);
        class2.method12(false);
        class57.method439(0);
        if (class257.field4390) {
            class196.method1320();
        }
        if (class206.field3563 != null) {
            int var3 = class206.field3563.method484(53);
            field606 = var3;
        }
        if (class280.field4818 == 0) {
            this.method358(-6);
            class310.method2155((byte) -106);
        } else if (class280.field4818 == 5) {
            this.method358(-6);
            class310.method2155((byte) -59);
        } else if (class280.field4818 == 25 || class280.field4818 == 28) {
            class317.method2177((byte) -123);
        }
        if (class280.field4818 == 10) {
            this.method344(94);
            class308.method2143((byte) 75);
            class192.method1295((byte) -127);
            class311.method2163(122);
        } else if (class280.field4818 == 30) {
            class292.method2052(-5);
        } else if (class280.field4818 == 40) {
            class311.method2163(76);
            if (class265.field4608 != -3) {
                if (class265.field4608 == 15) {
                    class242.method1648(-1);
                } else if (class265.field4608 != 2) {
                    class39.method306(-61);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z", line = 497)
    public static final boolean method347(int arg0, int arg1) {
        field618++;
        if (arg1 != -697450401) {
            method357((class171) null);
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 512)
    private final void method348(int arg0) {
        field611++;
        if (class287.field4944.field4808 > class291.field5015) {
            if (class193.field3413 == class130.field2294) {
                class193.field3413 = class118.field2090;
            } else {
                class193.field3413 = class130.field2294;
            }
            class145.field2430 = (class287.field4944.field4808 - 1) * 5 * 50;
            if (class145.field2430 > 3000) {
                class145.field2430 = 3000;
            }
            if (class287.field4944.field4808 >= 2 && class287.field4944.field4811 == 6) {
                this.method295((byte) -40, "js5connect_outofdate");
                class280.field4818 = 1000;
                return;
            }
            if (class287.field4944.field4808 >= 4 && class287.field4944.field4811 == -1) {
                this.method295((byte) -40, "js5crc");
                class280.field4818 = 1000;
                return;
            }
            if (class287.field4944.field4808 >= 4 && (class280.field4818 == 0 || class280.field4818 == 5)) {
                if (class287.field4944.field4811 == 7 || class287.field4944.field4811 == 9) {
                    this.method295((byte) -40, "js5connect_full");
                } else if (class287.field4944.field4811 > 0) {
                    this.method295((byte) -40, "js5connect");
                } else {
                    this.method295((byte) -40, "js5io");
                }
                class280.field4818 = 1000;
                return;
            }
        }
        class291.field5015 = class287.field4944.field4808;
        if (class145.field2430 > 0) {
            class145.field2430--;
            return;
        }
        try {
            if (class194.field3425 == 0) {
                class37.field496 = class297.field5086.method2073(class120.field2112, arg0 - 30887, class193.field3413);
                class194.field3425++;
            }
            if (class194.field3425 == 1) {
                if (class37.field496.field2067 == 2) {
                    this.method350(1000, arg0 + 79);
                    return;
                }
                if (class37.field496.field2067 == 1) {
                    class194.field3425++;
                }
            }
            if (arg0 != 2) {
                return;
            }
            if (class194.field3425 == 2) {
                class146.field2483 = new class169((Socket) class37.field496.field2063, class297.field5086);
                class235 var2 = new class235(5);
                var2.method1598(15, 27052);
                var2.method1577(true, 518);
                class146.field2483.method1123(4900, 0, 5, var2.field4066);
                class194.field3425++;
                class207.field3572 = class25.method197(arg0 - 3420);
            }
            if (class194.field3425 == 3) {
                if (class280.field4818 == 0 || class280.field4818 == 5 || class146.field2483.method1124(true) > 0) {
                    int var3 = class146.field2483.method1117(0);
                    if (var3 != 0) {
                        this.method350(var3, arg0 ^ 0x65);
                        return;
                    }
                    class194.field3425++;
                } else if ((class25.method197(-3418) - class207.field3572) > 30000L) {
                    this.method350(1001, 123);
                    return;
                }
            }
            if (class194.field3425 == 4) {
                boolean var4 = class280.field4818 == 5 || class280.field4818 == 10 || class280.field4818 == 28;
                class287.field4944.method1967(!var4, (byte) 111, class146.field2483);
                class37.field496 = null;
                class194.field3425 = 0;
                class146.field2483 = null;
            }
        } catch (IOException var6) {
            this.method350(1002, arg0 ^ 0xFFFFFF82);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIILrk;IZJ)Z", line = 657)
    public static final boolean method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class123 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class201.field3482 == class144.field2424;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class23.field277 || var16 >= class290.field4995) {
                    return false;
                }
                class228 var17 = class178.field3180[arg0][var15][var16];
                if (var17 != null && var17.field3950 >= 5) {
                    return false;
                }
            }
        }
        class219 var18 = new class219();
        var18.field3795 = arg11;
        var18.field3804 = arg0;
        var18.field3787 = arg5;
        var18.field3803 = arg6;
        var18.field3805 = arg7;
        var18.field3801 = arg8;
        var18.field3798 = arg9;
        var18.field3793 = arg1;
        var18.field3797 = arg2;
        var18.field3785 = arg1 + arg3 - 1;
        var18.field3789 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class178.field3180[var22][var19][var20] == null) {
                        class178.field3180[var22][var19][var20] = new class228(var22, var19, var20);
                    }
                }
                class228 var23 = class178.field3180[arg0][var19][var20];
                var23.field3932[var23.field3950] = var18;
                var23.field3926[var23.field3950] = var21;
                var23.field3922 |= var21;
                var23.field3950++;
                if (var13 && class299.field5116[var19][var20] != 0) {
                    var14 = class299.field5116[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class299.field5116[var24][var25] == 0) {
                        class299.field5116[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class42.field597[class145.field2448++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V", line = 777)
    private final void method350(int arg0, int arg1) {
        field620++;
        class37.field496 = null;
        class287.field4944.field4808++;
        class194.field3425 = 0;
        int var3 = 62 % ((arg1 - 37) / 36);
        class287.field4944.field4811 = arg0;
        class146.field2483 = null;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 800)
    public final void init() {
        field616++;
        if (!this.method298(23009)) {
            return;
        }
        class115.field2050 = Integer.parseInt(this.getParameter("worldid"));
        class50.field789 = Integer.parseInt(this.getParameter("modewhere"));
        if (class50.field789 < 0 || class50.field789 > 1) {
            class50.field789 = 0;
        }
        class215.field3737 = Integer.parseInt(this.getParameter("modewhat"));
        if (class215.field3737 < 0 || class215.field3737 > 2) {
            class215.field3737 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class173.field3098 = true;
        } else {
            class173.field3098 = false;
        }
        try {
            class310.field5259 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class310.field5259 = 0;
        }
        class61.method461((byte) -43, class310.field5259);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class271.field4699 = true;
        } else {
            class271.field4699 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class50.field768 = true;
        } else {
            class50.field768 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class155.field2663 = 1;
        } else {
            class155.field2663 = 0;
        }
        try {
            class62.field1097 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class62.field1097 = 0;
        }
        class70.field1210 = field623.method1814(this, (byte) 69);
        if (class70.field1210 == null) {
            class70.field1210 = class235.field4104;
        }
        String var7 = this.getParameter("haveie6");
        if (var7 != null && var7.equals("1")) {
            class232.field4026 = true;
        } else {
            class232.field4026 = false;
        }
        class303.field5178 = this;
        this.method308(765, class215.field3737 + 32, 518, -1, 503);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)Z", line = 890)
    public static final boolean method351(int arg0, byte arg1) {
        field614++;
        if (arg1 > -124) {
            field623 = (class258) null;
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 905)
    public final void method307(byte arg0) {
        field615++;
        if (class257.field4390) {
            class257.method1749();
        }
        if (class71.field1253 != null) {
            class191.method1289(class297.field5086, class71.field1253, (byte) 93);
            class71.field1253 = null;
        }
        if (class297.field5086 != null) {
            class297.field5086.method2072(11, this.getClass());
        }
        if (class155.field2661 != null) {
            class155.field2661.field4844 = false;
        }
        class155.field2661 = null;
        if (class73.field1289 != null) {
            class73.field1289.method1122(-1);
            class73.field1289 = null;
        }
        class102.method774(class5.field67, false);
        if (arg0 >= -4) {
            return;
        }
        class49.method394(class5.field67, 26390);
        if (class206.field3563 != null) {
            class206.field3563.method481(class5.field67, (byte) -64);
        }
        class214.method1461(false);
        class73.method544((byte) 124);
        class206.field3563 = null;
        if (class76.field1322 != null) {
            class76.field1322.method999((byte) -106);
        }
        if (class152.field2602 != null) {
            class152.field2602.method999((byte) -99);
        }
        class287.field4944.method1956((byte) 14);
        class282.field4849.method1338((byte) 91);
        try {
            if (class37.field484 != null) {
                class37.field484.method279(109);
            }
            if (class268.field4673 != null) {
                for (int var2 = 0; var2 < class268.field4673.length; var2++) {
                    if (class268.field4673[var2] != null) {
                        class268.field4673[var2].method279(110);
                    }
                }
            }
            if (class124.field2197 != null) {
                class124.field2197.method279(79);
            }
            if (class253.field4356 != null) {
                class253.field4356.method279(107);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 988)
    public static void method352(byte arg0) {
        if (arg0 == 23) {
            field623 = null;
            field610 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 1028)
    public static final void method353(boolean arg0, int arg1) {
        class242.field4197 = new int[104];
        class98.field1749 = new int[104];
        class23.field280 = new int[104];
        class1.field1 = new int[104];
        class263.field4583 = 99;
        class36.field457 = new int[104];
        field613++;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class242.field4206 = new byte[var2][104][104];
        class214.field3721 = new byte[var2][arg1][105];
        class68.field1180 = new int[var2][105][105];
        class152.field2613 = new byte[var2][104][104];
        class204.field3540 = new byte[var2][104][104];
        class167.field2829 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ls;)I", line = 1056)
    public static final int method354(class171 arg0) {
        class119 var1 = (class119) class103.field1871.method986(((long) arg0.field3061 << 32) + (long) arg0.field2930, 0);
        return var1 == null ? arg0.field2932 : var1.field2107;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ls;)Ls;", line = 1077)
    public static final class171 method355(class171 arg0) {
        int var1 = class82.method594(true, method354(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class263.method1844(arg0.field2923, (byte) -70);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ls;IIIIIII)V", line = 1124)
    public static final void method356(class171[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class171 var9 = arg0[var8];
            if (var9 != null && var9.field2923 == arg1 && (!var9.field3006 || var9.field2936 == 0 || var9.field3015 || method354(var9) != 0 || class188.field3336 == var9 || var9.field2924 == 1338) && (!var9.field3006 || !method357(var9))) {
                int var10 = var9.field3020 + arg6;
                int var11 = var9.field2912 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2936 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3002 + var10;
                    int var17 = var9.field3054 + var11;
                    if (var9.field2936 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class206.field3558 == var9) {
                    class103.field1881 = true;
                    class10.field115 = var10;
                    class271.field4700 = var11;
                }
                if (!var9.field3006 || var12 < var14 && var13 < var15) {
                    if (var9.field2936 == 0) {
                        if (!var9.field3006 && method357(var9) && class49.field737 != var9) {
                            continue;
                        }
                        if (var9.field2929 && class194.field3423 >= var12 && class226.field3882 >= var13 && class194.field3423 < var14 && class226.field3882 < var15) {
                            for (class42 var18 = (class42) class87.field1484.method83(-123); var18 != null; var18 = (class42) class87.field1484.method87((byte) -80)) {
                                if (var18.field602) {
                                    var18.method1054((byte) 81);
                                }
                            }
                            if (class127.field2255 == 0) {
                                class206.field3558 = null;
                                class188.field3336 = null;
                            }
                            class224.field3836 = false;
                            class48.field726 = null;
                        }
                    }
                    if (var9.field3006) {
                        boolean var19;
                        if (class194.field3423 >= var12 && class226.field3882 >= var13 && class194.field3423 < var14 && class226.field3882 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class64.field1119 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class123.field2184 == 1 && class219.field3791 >= var12 && class173.field3103 >= var13 && class219.field3791 < var14 && class173.field3103 < var15) {
                            var21 = true;
                        }
                        if (class233.field4037 > 0 && var9.field2984 != null) {
                            for (int var22 = 0; var22 < var9.field2984.length; var22++) {
                                for (int var23 = 0; var23 < class233.field4037; var23++) {
                                    int var24 = var9.field2984[var22] & 0xFF;
                                    if (class127.field2258[var23] == var24) {
                                        if (var9.field2973 != null) {
                                            byte var25 = var9.field2973[var22];
                                            if (var25 != 0 && ((var25 & 0x2) != 0 && !field610[86] || (var25 & 0x1) != 0 && !field610[82] || (var25 & 0x4) != 0 && !field610[81])) {
                                                continue;
                                            }
                                        }
                                        class285.method2000(var9.field3061, class235.field4104, var22 + 1, -1, 118);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class234.method1561(var9, class219.field3791 - var10, 0, class173.field3103 - var11);
                        }
                        if (class206.field3558 != null && class206.field3558 != var9 && var19 && class42.method342(method354(var9), 3688950)) {
                            class154.field2647 = var9;
                        }
                        if (class188.field3336 == var9) {
                            class168.field2854 = true;
                            class279.field4797 = var10;
                            class207.field3564 = var11;
                        }
                        if (var9.field3015 || var9.field2924 != 0) {
                            if (var19 && field606 != 0 && var9.field3027 != null) {
                                class42 var26 = new class42();
                                var26.field602 = true;
                                var26.field598 = var9;
                                var26.field584 = field606;
                                var26.field600 = var9.field3027;
                                class87.field1484.method82(var26, (byte) -39);
                            }
                            if (class206.field3558 != null || class123.field2183 != null || class252.field4342 || var9.field2924 != 1400 && class224.field3836) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field2924 != 0) {
                                if (var9.field2924 == 1337) {
                                    class250.field4314 = var9;
                                    class165.method1099((byte) 125, var9);
                                    continue;
                                }
                                if (var9.field2924 == 1338) {
                                    if (var21) {
                                        class48.field726 = var9;
                                        class302.field5164 = class219.field3791 - var10;
                                        class50.field752 = class173.field3103 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field2924 == 1400) {
                                    class280.field4814 = var9;
                                    if (var21) {
                                        if (field610[82] && class70.field1212 > 0) {
                                            int var27 = (int) ((double) (class219.field3791 - var10 - var9.field3002 / 2) * 2.0D / (double) class121.field2139);
                                            int var28 = (int) ((double) (class173.field3103 - var11 - var9.field3054 / 2) * 2.0D / (double) class121.field2139);
                                            int var29 = class165.field2784 + var27;
                                            int var30 = class176.field3163 + var28;
                                            int var31 = class49.field735 + var29;
                                            int var32 = class225.field3870 + class317.field5348 - var30 - 1;
                                            class291.method2047(0, var31, -652159092, var32);
                                            class192.method1299(0);
                                            continue;
                                        }
                                        class224.field3836 = true;
                                        class190.field3361 = class194.field3423;
                                        class180.field3213 = class226.field3882;
                                        class277.field4773 = class165.field2784;
                                        class167.field2831 = class176.field3163;
                                        continue;
                                    }
                                    if (var20 && class224.field3836) {
                                        class109.method803((int) ((double) (class190.field3361 - class194.field3423) * 2.0D / (double) class313.field5302) + class277.field4773, -1);
                                        class82.method596((int) ((double) (class180.field3213 - class226.field3882) * 2.0D / (double) class313.field5302) + class167.field2831, -107);
                                        continue;
                                    }
                                    class224.field3836 = false;
                                    continue;
                                }
                                if (var9.field2924 == 1401) {
                                    if (var20) {
                                        class137.method956(class194.field3423 - var10, var9.field3054, var9.field3002, (byte) 85, class226.field3882 - var11);
                                    }
                                    continue;
                                }
                                if (var9.field2924 == 1402) {
                                    if (!class257.field4390) {
                                        class165.method1099((byte) 125, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field3063 && var21) {
                                var9.field3063 = true;
                                if (var9.field2928 != null) {
                                    class42 var33 = new class42();
                                    var33.field602 = true;
                                    var33.field598 = var9;
                                    var33.field591 = class219.field3791 - var10;
                                    var33.field584 = class173.field3103 - var11;
                                    var33.field600 = var9.field2928;
                                    class87.field1484.method82(var33, (byte) -39);
                                }
                            }
                            if (var9.field3063 && var20 && var9.field2913 != null) {
                                class42 var34 = new class42();
                                var34.field602 = true;
                                var34.field598 = var9;
                                var34.field591 = class194.field3423 - var10;
                                var34.field584 = class226.field3882 - var11;
                                var34.field600 = var9.field2913;
                                class87.field1484.method82(var34, (byte) -39);
                            }
                            if (var9.field3063 && !var20) {
                                var9.field3063 = false;
                                if (var9.field2918 != null) {
                                    class42 var35 = new class42();
                                    var35.field602 = true;
                                    var35.field598 = var9;
                                    var35.field591 = class194.field3423 - var10;
                                    var35.field584 = class226.field3882 - var11;
                                    var35.field600 = var9.field2918;
                                    class217.field3744.method82(var35, (byte) -39);
                                }
                            }
                            if (var20 && var9.field2991 != null) {
                                class42 var36 = new class42();
                                var36.field602 = true;
                                var36.field598 = var9;
                                var36.field591 = class194.field3423 - var10;
                                var36.field584 = class226.field3882 - var11;
                                var36.field600 = var9.field2991;
                                class87.field1484.method82(var36, (byte) -39);
                            }
                            if (!var9.field3068 && var19) {
                                var9.field3068 = true;
                                if (var9.field3004 != null) {
                                    class42 var37 = new class42();
                                    var37.field602 = true;
                                    var37.field598 = var9;
                                    var37.field591 = class194.field3423 - var10;
                                    var37.field584 = class226.field3882 - var11;
                                    var37.field600 = var9.field3004;
                                    class87.field1484.method82(var37, (byte) -39);
                                }
                            }
                            if (var9.field3068 && var19 && var9.field3073 != null) {
                                class42 var38 = new class42();
                                var38.field602 = true;
                                var38.field598 = var9;
                                var38.field591 = class194.field3423 - var10;
                                var38.field584 = class226.field3882 - var11;
                                var38.field600 = var9.field3073;
                                class87.field1484.method82(var38, (byte) -39);
                            }
                            if (var9.field3068 && !var19) {
                                var9.field3068 = false;
                                if (var9.field3026 != null) {
                                    class42 var39 = new class42();
                                    var39.field602 = true;
                                    var39.field598 = var9;
                                    var39.field591 = class194.field3423 - var10;
                                    var39.field584 = class226.field3882 - var11;
                                    var39.field600 = var9.field3026;
                                    class217.field3744.method82(var39, (byte) -39);
                                }
                            }
                            if (var9.field2969 != null) {
                                class42 var40 = new class42();
                                var40.field598 = var9;
                                var40.field600 = var9.field2969;
                                class238.field4157.method82(var40, (byte) -39);
                            }
                            if (var9.field3028 != null && class91.field1611 > var9.field3075) {
                                if (var9.field2978 == null || class91.field1611 - var9.field3075 > 32) {
                                    class42 var45 = new class42();
                                    var45.field598 = var9;
                                    var45.field600 = var9.field3028;
                                    class87.field1484.method82(var45, (byte) -39);
                                } else {
                                    label548: for (int var41 = var9.field3075; var41 < class91.field1611; var41++) {
                                        int var42 = class114.field2036[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var9.field2978.length; var43++) {
                                            if (var9.field2978[var43] == var42) {
                                                class42 var44 = new class42();
                                                var44.field598 = var9;
                                                var44.field600 = var9.field3028;
                                                class87.field1484.method82(var44, (byte) -39);
                                                break label548;
                                            }
                                        }
                                    }
                                }
                                var9.field3075 = class91.field1611;
                            }
                            if (var9.field2967 != null && class115.field2054 > var9.field3030) {
                                if (var9.field2964 == null || class115.field2054 - var9.field3030 > 32) {
                                    class42 var50 = new class42();
                                    var50.field598 = var9;
                                    var50.field600 = var9.field2967;
                                    class87.field1484.method82(var50, (byte) -39);
                                } else {
                                    label524: for (int var46 = var9.field3030; var46 < class115.field2054; var46++) {
                                        int var47 = class311.field5276[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var9.field2964.length; var48++) {
                                            if (var9.field2964[var48] == var47) {
                                                class42 var49 = new class42();
                                                var49.field598 = var9;
                                                var49.field600 = var9.field2967;
                                                class87.field1484.method82(var49, (byte) -39);
                                                break label524;
                                            }
                                        }
                                    }
                                }
                                var9.field3030 = class115.field2054;
                            }
                            if (var9.field3010 != null && class134.field2319 > var9.field2920) {
                                if (var9.field3040 == null || class134.field2319 - var9.field2920 > 32) {
                                    class42 var55 = new class42();
                                    var55.field598 = var9;
                                    var55.field600 = var9.field3010;
                                    class87.field1484.method82(var55, (byte) -39);
                                } else {
                                    label500: for (int var51 = var9.field2920; var51 < class134.field2319; var51++) {
                                        int var52 = class85.field1449[var51 & 0x1F];
                                        for (int var53 = 0; var53 < var9.field3040.length; var53++) {
                                            if (var9.field3040[var53] == var52) {
                                                class42 var54 = new class42();
                                                var54.field598 = var9;
                                                var54.field600 = var9.field3010;
                                                class87.field1484.method82(var54, (byte) -39);
                                                break label500;
                                            }
                                        }
                                    }
                                }
                                var9.field2920 = class134.field2319;
                            }
                            if (var9.field3039 != null && class2.field21 > var9.field3065) {
                                if (var9.field3052 == null || class2.field21 - var9.field3065 > 32) {
                                    class42 var60 = new class42();
                                    var60.field598 = var9;
                                    var60.field600 = var9.field3039;
                                    class87.field1484.method82(var60, (byte) -39);
                                } else {
                                    label476: for (int var56 = var9.field3065; var56 < class2.field21; var56++) {
                                        int var57 = class60.field1001[var56 & 0x1F];
                                        for (int var58 = 0; var58 < var9.field3052.length; var58++) {
                                            if (var9.field3052[var58] == var57) {
                                                class42 var59 = new class42();
                                                var59.field598 = var9;
                                                var59.field600 = var9.field3039;
                                                class87.field1484.method82(var59, (byte) -39);
                                                break label476;
                                            }
                                        }
                                    }
                                }
                                var9.field3065 = class2.field21;
                            }
                            if (var9.field3032 != null && class62.field1091 > var9.field2970) {
                                if (var9.field3071 == null || class62.field1091 - var9.field2970 > 32) {
                                    class42 var65 = new class42();
                                    var65.field598 = var9;
                                    var65.field600 = var9.field3032;
                                    class87.field1484.method82(var65, (byte) -39);
                                } else {
                                    label452: for (int var61 = var9.field2970; var61 < class62.field1091; var61++) {
                                        int var62 = class8.field103[var61 & 0x1F];
                                        for (int var63 = 0; var63 < var9.field3071.length; var63++) {
                                            if (var9.field3071[var63] == var62) {
                                                class42 var64 = new class42();
                                                var64.field598 = var9;
                                                var64.field600 = var9.field3032;
                                                class87.field1484.method82(var64, (byte) -39);
                                                break label452;
                                            }
                                        }
                                    }
                                }
                                var9.field2970 = class62.field1091;
                            }
                            if (class164.field2770 > var9.field2981 && var9.field3041 != null) {
                                class42 var66 = new class42();
                                var66.field598 = var9;
                                var66.field600 = var9.field3041;
                                class87.field1484.method82(var66, (byte) -39);
                            }
                            if (class69.field1188 > var9.field2981 && var9.field3064 != null) {
                                class42 var67 = new class42();
                                var67.field598 = var9;
                                var67.field600 = var9.field3064;
                                class87.field1484.method82(var67, (byte) -39);
                            }
                            if (class12.field158 > var9.field2981 && var9.field3018 != null) {
                                class42 var68 = new class42();
                                var68.field598 = var9;
                                var68.field600 = var9.field3018;
                                class87.field1484.method82(var68, (byte) -39);
                            }
                            if (class125.field2218 > var9.field2981 && var9.field3049 != null) {
                                class42 var69 = new class42();
                                var69.field598 = var9;
                                var69.field600 = var9.field3049;
                                class87.field1484.method82(var69, (byte) -39);
                            }
                            if (class65.field1140 > var9.field2981 && var9.field2937 != null) {
                                class42 var70 = new class42();
                                var70.field598 = var9;
                                var70.field600 = var9.field2937;
                                class87.field1484.method82(var70, (byte) -39);
                            }
                            var9.field2981 = class182.field3259;
                            if (var9.field3019 != null) {
                                for (int var71 = 0; var71 < class233.field4037; var71++) {
                                    class42 var72 = new class42();
                                    var72.field598 = var9;
                                    var72.field594 = class127.field2258[var71];
                                    var72.field601 = class50.field774[var71];
                                    var72.field600 = var9.field3019;
                                    class87.field1484.method82(var72, (byte) -39);
                                }
                            }
                            if (class31.field371 && var9.field2980 != null) {
                                class42 var73 = new class42();
                                var73.field598 = var9;
                                var73.field600 = var9.field2980;
                                class87.field1484.method82(var73, (byte) -39);
                            }
                        }
                    }
                    if (!var9.field3006 && class206.field3558 == null && class123.field2183 == null && !class252.field4342) {
                        if ((var9.field3051 >= 0 || var9.field3034 != 0) && class194.field3423 >= var12 && class226.field3882 >= var13 && class194.field3423 < var14 && class226.field3882 < var15) {
                            if (var9.field3051 >= 0) {
                                class49.field737 = arg0[var9.field3051];
                            } else {
                                class49.field737 = var9;
                            }
                        }
                        if (var9.field2936 == 8 && class194.field3423 >= var12 && class226.field3882 >= var13 && class194.field3423 < var14 && class226.field3882 < var15) {
                            class268.field4671 = var9;
                        }
                        if (var9.field3036 > var9.field3054) {
                            method359(var9.field3054, class194.field3423, var9.field3002 + var10, 4, var9.field3036, var9, var11, class226.field3882);
                        }
                    }
                    if (var9.field2936 == 0) {
                        method356(arg0, var9.field3061, var12, var13, var14, var15, var10 - var9.field2957, var11 - var9.field2966);
                        if (var9.field2982 != null) {
                            method356(var9.field2982, var9.field3061, var12, var13, var14, var15, var10 - var9.field2957, var11 - var9.field2966);
                        }
                        class247 var74 = (class247) class276.field4750.method986((long) var9.field3061, 0);
                        if (var74 != null) {
                            class224.method1510(var74.field4283, var11, 121, var10, var14, var12, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1870)
    public final void method297(int arg0) {
        method352((byte) 23);
        field609++;
        class258.method1795((byte) -56);
        class307.method2140((byte) 69);
        class125.method915(false);
        class225.method1513(-199);
        class39.method299(arg0 - 2);
        class257.method1731();
        class137.method953(arg0 + 5);
        class261.method1835((byte) -83);
        class282.method1979(12716);
        class149.method1025((byte) -1);
        class235.method1622(arg0 + 106);
        class169.method1125(-5);
        class279.method1954(true);
        class202.method1340(true);
        class11.method68(78);
        class51.method412(true);
        class213.method1430((byte) -38);
        class38.method286(65280);
        class80.method573(4);
        class172.method1165(0);
        class107.method794((byte) 81);
        class121.method887((byte) 53);
        class245.method1671(arg0 ^ 0xFFFF9308);
        class171.method1150(arg0 ^ 0xFFFFFFFE);
        class220.method1491((byte) -31);
        class231.method1543(false);
        class12.method85(-8);
        class144.method980((byte) -51);
        class62.method480(113);
        class292.method2053(76);
        class100.method752(-11);
        class65.method502((byte) -122);
        class114.method845(false);
        class145.method1000(26445);
        class55.method429((byte) -105);
        class170.method1133((byte) -75);
        class2.method19(0);
        class58.method445(false);
        class228.method1522((byte) 71);
        class179.method1227(122);
        class151.method1034(-31758);
        class247.method1687(107);
        class154.method1051(true);
        class194.method1307((byte) -54);
        class297.method2100(37);
        class132.method944(-103);
        class268.method1900((byte) 61);
        class8.method44(1);
        class106.method792(arg0 - 30);
        class1.method1(124);
        class155.method1060((byte) 1);
        class184.method1246(-4);
        class37.method278((byte) -127);
        class248.method1692(10502);
        class101.method765((byte) 105);
        class49.method393((byte) 5);
        class7.method41(16067);
        class304.method2125();
        class120.method878(arg0 ^ 0x4CE9);
        class97.method731();
        class294.method2059(3);
        class175.method1188();
        class61.method462((byte) -104);
        class89.method649();
        class122.method894(arg0 + 125);
        class91.method676((byte) 121);
        class31.method227(0);
        class281.method1976(-118);
        class196.method1318();
        class115.method863(1);
        class180.method1231((byte) -47);
        class10.method66(-14002);
        class113.method818(-2777);
        class35.method247();
        class217.method1471((byte) 113);
        class181.method1237(6);
        class81.method593();
        class190.method1282((byte) 36);
        class265.method1856((byte) 121);
        class4.method25(0);
        class112.method813();
        class267.method1885();
        class284.method1989((byte) 92);
        class68.method509(-102);
        class313.method2170((byte) 4);
        class243.method1655((byte) 55);
        class134.method948(arg0 + 22699);
        class211.method1408();
        class117.method869(1221034136);
        class108.method797((byte) -62);
        class84.method610(15);
        class192.method1297((byte) -75);
        class96.method707(1777514640);
        class71.method534(true);
        class249.method1693((byte) -103);
        class259.method1826(87);
        class218.method1478((byte) 81);
        class239.method1641((byte) -17);
        class289.method2037((byte) -15);
        class255.method1718(0);
        class212.method1422((byte) -120);
        class140.method964(2);
        class167.method1109(0);
        class256.method1727(-77);
        class210.method1390(arg0 - 1);
        class69.method517((byte) -18);
        class103.method778(0);
        class285.method2008((byte) -125);
        class272.method1923((byte) -87);
        class36.method271((byte) -90);
        class317.method2183((byte) -113);
        class266.method1878();
        class85.method612(123);
        class244.method1658(false);
        class82.method595(-118);
        class73.method542(-116);
        class98.method742(16777215);
        class105.method786(-20569);
        class230.method1536();
        class191.method1294(arg0 + 4095);
        class32.method231(-9650);
        class59.method456(arg0 - 118);
        class42.method338((byte) -35);
        class123.method897(122);
        class60.method457(-27307);
        class157.method1072();
        class219.method1485(-1);
        class226.method1516(false);
        class23.method182((byte) -77);
        class263.method1843(arg0 ^ 0xFFFF9055);
        class250.method1696(false);
        class90.method673(93);
        class26.method198(56);
        class67.method508();
        class20.method135((byte) -37);
        class110.method804(false);
        class178.method1216(102);
        class195.method1314();
        class118.method872((byte) 119);
        class9.method49();
        class40.method310();
        class251.method1703(arg0 ^ arg0);
        class234.method1560(-43);
        class93.method692(50);
        class286.method2018(arg0 ^ 0x6A);
        class238.method1634((byte) -81);
        class124.method907(false);
        class201.method1333((byte) -124);
        class148.method1018(0);
        class277.method1944(113);
        class262.method1839();
        class27.method205(arg0);
        class296.method2093();
        class314.method2176((byte) 9);
        class242.method1651((byte) 2);
        class162.method1091(128);
        class209.method1380((byte) -54);
        class13.method93(126);
        class119.method874(arg0 + 117);
        class44.method372(25980);
        class43.method364((byte) 80);
        class5.method31((byte) 0);
        class102.method772((byte) 100);
        class48.method390(false);
        class166.method1107((byte) -14);
        class76.method556(false);
        class99.method745(-68);
        class109.method801(-63);
        class56.method434((byte) -123);
        class264.method1850(32);
        class302.method2117((byte) 15);
        class215.method1465((byte) 97);
        class214.method1458(arg0 ^ 0x0);
        class74.method547(arg0 - 1);
        class143.method978();
        class50.method396((byte) -36);
        class280.method1969(false);
        class138.method961(-4317);
        class94.method693((byte) -76);
        class146.method1009((byte) -119);
        class63.method490(false);
        class158.method1074();
        class187.method1273();
        class54.method427();
        class283.method1984((byte) -74);
        class130.method937(-1453580440);
        class159.method1076(115);
        class260.method1831(-108);
        class288.method2031();
        class270.method1902();
        class207.method1367(false);
        class197.method1324(false);
        class186.method1257(88);
        class276.method1938(-1);
        class299.method2107(true);
        class16.method107(1958);
        class87.method627((byte) -85);
        class6.method33((byte) -111);
        class227.method1520(false);
        class208.method1374(0);
        class303.method2121(true);
        class236.method1624((byte) -105);
        class252.method1706((byte) -23);
        class185.method1254((byte) 123);
        class142.method968();
        class135.method951();
        class88.method633((byte) 110);
        class301.method2113(-1200762228);
        class86.method620((byte) -110);
        class164.method1098(arg0 ^ 0x3B);
        class253.method1715(119);
        class165.method1102((byte) -121);
        class241.method1645(0);
        class224.method1506((byte) -97);
        class29.method219((byte) 35);
        class203.method1350(170153512);
        class15.method102(false);
        class188.method1277((byte) -88);
        class193.method1301((byte) 85);
        class78.method565(false);
        class34.method242((byte) 119);
        class95.method697((byte) -58);
        class308.method2145(125);
        class79.method569((byte) -127);
        class47.method386((byte) 120);
        class312.method2165((byte) 66);
        class83.method604(17254);
        class311.method2157(arg0 ^ 0xFFFFCA0F);
        class139.method963(125);
        class128.method924((byte) 112);
        class310.method2153(arg0 + 120);
        class19.method125(false);
        class240.method1644((byte) -118);
        class147.method1017(-67);
        class14.method97((byte) -100);
        class293.method2054(112);
        class92.method684(arg0 - 88);
        class52.method416(-23688);
        class168.method1114((byte) -73);
        class205.method1359(123);
        class45.method373(0);
        class173.method1170((byte) 84);
        class153.method1044((byte) -111);
        class70.method525(82);
        class127.method917(-50);
        class306.method2137(false);
        class233.method1558((byte) 87);
        class290.method2044(27);
        class189.method1280(0);
        class287.method2021(true);
        class206.method1364(21054);
        class204.method1356((byte) 119);
        class232.method1555(-16711936);
        class246.method1681(6);
        class182.method1241(true);
        class237.method1631(70);
        class271.method1916((byte) 30);
        class229.method1530((byte) 71);
        class57.method444((byte) 1);
        class152.method1039(-117);
        class176.method1212(arg0 ^ 0x3);
        class72.method538((byte) -10);
        class75.method551(125);
        class291.method2050((byte) -127);
        class300.method2110(arg0 + 49);
        class64.method493(true);
        if (class39.field563) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ls;)Z", line = 2153)
    public static final boolean method357(class171 arg0) {
        if (class166.field2823) {
            if (method354(arg0) != 0) {
                return false;
            }
            if (arg0.field2936 == 0) {
                return false;
            }
        }
        return arg0.field3043;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2175)
    private final void method358(int arg0) {
        field621++;
        if (!class242.field4196) {
            label242: while (true) {
                do {
                    if (!class201.method1332(22315)) {
                        break label242;
                    }
                } while (class231.field3989 != 115 && class231.field3989 != 83);
                class242.field4196 = true;
            }
        }
        if (class134.field2322 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class25.method197(-3418);
            if (class84.field1425 == 0L) {
                class84.field1425 = var4;
            }
            if (var3 > 16384 && (var4 - class84.field1425) < 5000L) {
                if ((var4 - class218.field3780) > 1000L) {
                    System.gc();
                    class218.field3780 = var4;
                }
                class120.field2119 = class217.field3743;
                class7.field92 = 5;
            } else {
                class134.field2322 = 10;
                class7.field92 = 5;
                class120.field2119 = class308.field5236;
            }
            return;
        }
        if (arg0 != -6) {
            field619 = -44;
        }
        if (class134.field2322 == 10) {
            class267.method1887(4, 104, 104);
            for (int var6 = 0; var6 < 4; var6++) {
                class243.field4216[var6] = new class245(104, 104);
            }
            class120.field2119 = class219.field3800;
            class7.field92 = 10;
            class134.field2322 = 30;
        } else if (class134.field2322 == 30) {
            if (class248.field4293 == null) {
                class248.field4293 = new class11(class287.field4944, class282.field4849);
            }
            if (class248.field4293.method73(255)) {
                class308.field5221 = class114.method833(true, false, true, true, 0);
                class64.field1123 = class114.method833(true, false, true, true, 1);
                class208.field3584 = class114.method833(true, true, true, false, 2);
                class123.field2182 = class114.method833(true, false, true, true, 3);
                class300.field5132 = class114.method833(true, false, true, true, 4);
                class114.field2011 = class114.method833(true, true, true, true, 5);
                class95.field1667 = class114.method833(false, true, true, true, 6);
                class282.field4840 = class114.method833(true, false, true, true, 7);
                class34.field395 = class114.method833(true, false, true, true, 8);
                class127.field2260 = class114.method833(true, false, true, true, 9);
                class233.field4042 = class114.method833(true, false, true, true, 10);
                class56.field877 = class114.method833(true, false, true, true, 11);
                class153.field2628 = class114.method833(true, false, true, true, 12);
                class234.field4044 = class114.method833(true, false, true, true, 13);
                class170.field2902 = class114.method833(false, false, true, true, 14);
                class102.field1863 = class114.method833(true, false, true, true, 15);
                class125.field2243 = class114.method833(true, false, true, true, 16);
                class47.field716 = class114.method833(true, false, true, true, 17);
                class215.field3730 = class114.method833(true, false, true, true, 18);
                class191.field3384 = class114.method833(true, false, true, true, 19);
                class144.field2423 = class114.method833(true, false, true, true, 20);
                class312.field5300 = class114.method833(true, false, true, true, 21);
                class10.field123 = class114.method833(true, false, true, true, 22);
                class312.field5297 = class114.method833(true, true, true, true, 23);
                class73.field1284 = class114.method833(true, false, true, true, 24);
                class260.field4526 = class114.method833(true, false, true, true, 25);
                class64.field1115 = class114.method833(true, true, true, true, 26);
                class134.field2322 = 40;
                class7.field92 = 15;
                class120.field2119 = class117.field2069;
            } else {
                class7.field92 = 12;
                class120.field2119 = class166.field2819;
            }
        } else if (class134.field2322 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 27; var8++) {
                var7 += class98.field1753[var8].method402((byte) -116) * class314.field5329[var8] / 100;
            }
            if (var7 == 100) {
                class120.field2119 = class168.field2840;
                class7.field92 = 20;
                class36.method272(class34.field395, true);
                class92.method683(arg0 - 65, class34.field395);
                class42.method336(class34.field395, (byte) -97);
                class134.field2322 = 45;
            } else {
                if (var7 != 0) {
                    class120.field2119 = class100.method755(arg0 ^ 0x0, new class258[] { class242.field4207, class218.method1481(-126, var7), class14.field187 });
                }
                class7.field92 = 20;
            }
        } else if (class134.field2322 == 45) {
            class238.method1636(2, class197.field3463, 22050, -85);
            class229.field3959 = new class114();
            class229.field3959.method853(128, -121, 9);
            class76.field1322 = class124.method908(class297.field5086, 73, 0, 22050, class5.field67);
            class76.field1322.method1006(arg0 ^ 0xFFFFFFFE, class229.field3959);
            class232.method1550(-89, class102.field1863, class229.field3959, class170.field2902, class300.field5132);
            class152.field2602 = class124.method908(class297.field5086, 61, 1, 2048, class5.field67);
            class184.field3279 = new class18();
            class152.field2602.method1006(4, class184.field3279);
            class310.field5248 = new class55(22050, class83.field1408);
            class181.field3247 = class95.field1667.method1451(-123, class144.field2410);
            class7.field92 = 30;
            class134.field2322 = 50;
            class120.field2119 = class290.field4990;
        } else if (class134.field2322 == 50) {
            int var9 = class166.method1105(class34.field395, 126, class234.field4044);
            int var10 = class99.method747(6);
            if (var10 > var9) {
                class120.field2119 = class100.method755(-6, new class258[] { class317.field5344, class218.method1481(-66, var9 * 100 / var10), class14.field187 });
                class7.field92 = 35;
            } else {
                class120.field2119 = class88.field1498;
                class7.field92 = 35;
                class134.field2322 = 60;
            }
        } else if (class134.field2322 == 60) {
            int var27 = class155.method1064(class34.field395, 105);
            int var28 = class224.method1508((byte) -72);
            if (var28 <= var27) {
                class120.field2119 = class249.field4300;
                class134.field2322 = 65;
                class7.field92 = 40;
            } else {
                class120.field2119 = class100.method755(-6, new class258[] { class233.field4043, class218.method1481(123, var27 * 100 / var28), class14.field187 });
                class7.field92 = 40;
            }
        } else if (class134.field2322 == 65) {
            class86.method617(class34.field395, (byte) -124, class234.field4044);
            class120.field2119 = class119.field2102;
            class7.field92 = 45;
            class106.method791((byte) 8, 5);
            class134.field2322 = 70;
        } else if (class134.field2322 == 70) {
            byte var11 = 0;
            class208.field3584.method1448(0);
            int var12 = var11 + class208.field3584.method1455(false);
            class125.field2243.method1448(arg0 + 6);
            int var13 = var12 + class125.field2243.method1455(false);
            class47.field716.method1448(0);
            int var14 = var13 + class47.field716.method1455(false);
            class215.field3730.method1448(arg0 ^ 0xFFFFFFFA);
            int var15 = var14 + class215.field3730.method1455(false);
            class191.field3384.method1448(arg0 + 6);
            int var16 = var15 + class191.field3384.method1455(false);
            class144.field2423.method1448(0);
            int var17 = var16 + class144.field2423.method1455(false);
            class312.field5300.method1448(0);
            int var18 = var17 + class312.field5300.method1455(false);
            class10.field123.method1448(0);
            int var19 = var18 + class10.field123.method1455(false);
            class73.field1284.method1448(0);
            int var20 = var19 + class73.field1284.method1455(false);
            class260.field4526.method1448(arg0 + 6);
            int var21 = var20 + class260.field4526.method1455(false);
            if (var21 >= 1000) {
                class311.method2162((byte) 17, class208.field3584);
                class132.method945(class208.field3584, false);
                class5.method32(class208.field3584, 2423);
                class60.method458(arg0 + 8, class282.field4840, class208.field3584);
                class272.method1919(true, class282.field4840, true, class125.field2243);
                class202.method1342(-4136990, class282.field4840, class215.field3730);
                class308.method2146(class282.field4840, -126, class263.field4577, class191.field3384, true);
                class207.method1368(class208.field3584, (byte) 98);
                class49.method395(class144.field2423, class308.field5221, (byte) 101, class64.field1123);
                class291.method2049(class312.field5300, 104, class282.field4840);
                class166.method1104(class10.field123, (byte) -27);
                class212.method1419(arg0 + 22, class208.field3584);
                class110.method805(class123.field2182, 0, class282.field4840, class234.field4044, class34.field395);
                class191.method1291(class208.field3584, 1);
                class297.method2098((byte) 61, class47.field716);
                class252.method1711(new class103(), class260.field4526, 20680, class73.field1284);
                class99.method744(class260.field4526, (byte) 0, class73.field1284);
                class7.field92 = 50;
                class120.field2119 = class87.field1489;
                class91.method678(0);
                class134.field2322 = 80;
            } else {
                class120.field2119 = class100.method755(arg0, new class258[] { class11.field131, class218.method1481(arg0 ^ 0xFFFFFFA2, var21 / 10), class14.field187 });
                class7.field92 = 50;
            }
        } else if (class134.field2322 == 80) {
            int var22 = class10.method67(class34.field395, (byte) -124);
            int var23 = class153.method1048(Integer.MAX_VALUE);
            if (var23 <= var22) {
                class271.method1909(0, class34.field395);
                class134.field2322 = 90;
                class7.field92 = 60;
                class120.field2119 = class301.field5154;
            } else {
                class120.field2119 = class100.method755(arg0, new class258[] { class73.field1285, class218.method1481(-56, var22 * 100 / var23), class14.field187 });
                class7.field92 = 60;
            }
        } else if (class134.field2322 == 90) {
            if (class64.field1115.method1448(0)) {
                class272 var24 = new class272(class127.field2260, class64.field1115, class34.field395, 20, !class173.field3101);
                class266.method1870(var24);
                if (class151.field2557 == 1) {
                    class266.method1871(0.9F);
                }
                if (class151.field2557 == 2) {
                    class266.method1871(0.8F);
                }
                if (class151.field2557 == 3) {
                    class266.method1871(0.7F);
                }
                if (class151.field2557 == 4) {
                    class266.method1871(0.6F);
                }
                class7.field92 = 70;
                class134.field2322 = 100;
                class120.field2119 = class255.field4378;
            } else {
                class120.field2119 = class100.method755(-6, new class258[] { class213.field3668, class218.method1481(arg0 - 96, class64.field1115.method1455(false)), class14.field187 });
                class7.field92 = 70;
            }
        } else if (class134.field2322 == 100) {
            if (class123.method899(false, class34.field395)) {
                class134.field2322 = 110;
            }
        } else if (class134.field2322 == 110) {
            class155.field2661 = new class282();
            class297.field5086.method2070(10, class155.field2661, arg0 - 98);
            class134.field2322 = 120;
            class120.field2119 = class235.field4106;
            class7.field92 = 75;
        } else if (class134.field2322 == 120) {
            if (class233.field4042.method1425(class317.field5350, class235.field4104, (byte) 124)) {
                class85 var25 = new class85(class233.field4042.method1450(0, class317.field5350, class235.field4104));
                class299.method2105(var25, -98);
                class7.field92 = 80;
                class134.field2322 = 130;
                class120.field2119 = class181.field3244;
            } else {
                class120.field2119 = class100.method755(-6, new class258[] { class16.field202, class92.field1613 });
                class7.field92 = 80;
            }
        } else if (class134.field2322 == 130) {
            if (!class123.field2182.method1448(0)) {
                class120.field2119 = class100.method755(-6, new class258[] { class52.field834, class218.method1481(-67, class123.field2182.method1455(false) * 3 / 4), class14.field187 });
                class7.field92 = 85;
            } else if (!class153.field2628.method1448(arg0 + 6)) {
                class120.field2119 = class100.method755(-6, new class258[] { class52.field834, class218.method1481(-85, class153.field2628.method1455(false) / 10 + 75), class14.field187 });
                class7.field92 = 85;
            } else if (!class234.field4044.method1448(0)) {
                class120.field2119 = class100.method755(-6, new class258[] { class52.field834, class218.method1481(48, (class234.field4044.method1455(false) / 20) + 85), class14.field187 });
                class7.field92 = 85;
            } else if (class312.field5297.method1424(class247.field4277, 58)) {
                class12.method81(class168.field2844, class251.field4322, class32.field385, class120.field2122, class184.field3281, 117, class312.field5297);
                class120.field2119 = class252.field4346;
                class134.field2322 = 135;
                class7.field92 = 95;
            } else {
                class120.field2119 = class100.method755(-6, new class258[] { class52.field834, class218.method1481(-54, class312.field5297.method1423(false, class247.field4277) / 10 + 90), class14.field187 });
                class7.field92 = 85;
            }
        } else if (class134.field2322 == 135) {
            int var26 = class169.method1121(-3943);
            if (var26 == -1) {
                class120.field2119 = class49.field739;
                class7.field92 = 95;
            } else if (var26 == 7 || var26 == 9) {
                this.method295((byte) -40, "worldlistfull");
                class106.method791((byte) 8, 1000);
            } else if (class153.field2633) {
                class134.field2322 = 140;
                class120.field2119 = class154.field2641;
                class7.field92 = 96;
            } else {
                this.method295((byte) -40, "worldlistio");
                class106.method791((byte) 8, 1000);
            }
        } else if (class134.field2322 == 140) {
            class279.field4788 = class123.field2182.method1451(-127, class228.field3919);
            class114.field2011.method1447(0, false, true);
            class95.field1667.method1447(0, true, true);
            class34.field395.method1447(arg0 ^ 0xFFFFFFFA, true, true);
            class234.field4044.method1447(0, true, true);
            class233.field4042.method1447(0, true, true);
            class123.field2182.method1447(0, true, true);
            class16.field213 = true;
            class7.field92 = 97;
            class120.field2119 = class69.field1194;
            class134.field2322 = 150;
        } else if (class134.field2322 == 150) {
            class230.method1534();
            if (class242.field4196) {
                class61.field1022 = 0;
            }
            class242.field4196 = true;
            class219.method1484((byte) -102, class297.field5086);
            class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
            class120.field2119 = class166.field2824;
            class134.field2322 = 160;
            class7.field92 = 100;
        } else if (class134.field2322 == 160) {
            class238.method1633(true, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2678)
    public final void method302(int arg0) {
        field625++;
        if (class280.field4818 == 1000) {
            return;
        }
        boolean var2 = class127.method919(-115);
        if (var2 && class106.field1898 && class76.field1322 != null) {
            class76.field1322.method990(0);
        }
        if ((class280.field4818 == 30 || class280.field4818 == 10) && (class311.field5265 || class121.field2141 != 0L && class121.field2141 < class25.method197(arg0 ^ 0xD37))) {
            class218.method1476(class185.method1253((byte) 112), class311.field5265, class239.field4171, class259.field4501, (byte) 14);
        }
        if (class71.field1253 == null) {
            Container var3;
            if (class71.field1253 != null) {
                var3 = class71.field1253;
            } else if (class284.field4882 == null) {
                var3 = class297.field5086.field5061;
            } else {
                var3 = class284.field4882;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class284.field4882 == var3) {
                Insets var6 = class284.field4882.getInsets();
                var4 -= var6.left + var6.right;
                var5 -= var6.top + var6.bottom;
            }
            if (class276.field4762 != var4 || class314.field5326 != var5) {
                if (class295.field5060.startsWith("mac")) {
                    class314.field5326 = var5;
                    class276.field4762 = var4;
                } else {
                    class170.method1128(1073741823);
                }
                class121.field2141 = class25.method197(arg0 ^ 0xD37) + 500L;
            }
        }
        if (arg0 != -111) {
            this.method297(-124);
        }
        if (class71.field1253 != null && !class124.field2200 && (class280.field4818 == 30 || class280.field4818 == 10)) {
            class218.method1476(class61.field1022, false, -1, -1, (byte) 14);
        }
        boolean var7 = false;
        if (class243.field4227) {
            var7 = true;
            class243.field4227 = false;
        }
        if (var7) {
            class27.method212(46);
        }
        if (class257.field4390) {
            for (int var8 = 0; var8 < 100; var8++) {
                class238.field4151[var8] = true;
            }
        }
        if (class280.field4818 == 0) {
            class122.method890(var7, class7.field92, class120.field2119, (Color) null, (byte) 92);
        } else if (class280.field4818 == 5) {
            class27.method207(false, arg0 + 111, class123.field2180);
        } else if (class280.field4818 == 10) {
            class138.method959(true);
        } else if (class280.field4818 == 25 || class280.field4818 == 28) {
            if (class166.field2813 == 1) {
                if (class260.field4522 > field607) {
                    field607 = class260.field4522;
                }
                int var9 = (field607 - class260.field4522) * 50 / field607;
                class251.method1704(class100.method755(-6, new class258[] { class282.field4853, class27.field322, class218.method1481(arg0 ^ -29, var9), class154.field2637 }), false, false);
            } else if (class166.field2813 == 2) {
                if (class201.field3478 < class114.field1995) {
                    class201.field3478 = class114.field1995;
                }
                int var10 = ((class201.field3478 - class114.field1995) * 50 / class201.field3478) + 50;
                class251.method1704(class100.method755(-6, new class258[] { class282.field4853, class27.field322, class218.method1481(-118, var10), class154.field2637 }), false, false);
            } else {
                class251.method1704(class282.field4853, false, false);
            }
        } else if (class280.field4818 == 30) {
            class291.method2051((byte) 89);
        } else if (class280.field4818 == 40) {
            class251.method1704(class100.method755(-6, new class258[] { class178.field3182, class94.field1657, class71.field1229 }), false, false);
        }
        if (class257.field4390 && class280.field4818 != 0) {
            class257.method1764();
            for (int var17 = 0; var17 < class312.field5298; var17++) {
                class74.field1292[var17] = false;
            }
        } else if ((class280.field4818 == 30 || class280.field4818 == 10) && class191.field3373 == 0 && !var7) {
            try {
                Graphics var14 = class5.field67.getGraphics();
                for (int var15 = 0; var15 < class312.field5298; var15++) {
                    if (class74.field1292[var15]) {
                        class83.field1407.method783(class276.field4763[var15], var14, (byte) 13, class38.field517[var15], class121.field2146[var15], class114.field2026[var15]);
                        class74.field1292[var15] = false;
                    }
                }
            } catch (Exception var18) {
                class5.field67.repaint();
            }
        } else if (class280.field4818 != 0) {
            try {
                Graphics var11 = class5.field67.getGraphics();
                class83.field1407.method785(0, arg0 ^ 0xFFFFFF11, 0, var11);
                for (int var12 = 0; var12 < class312.field5298; var12++) {
                    class74.field1292[var12] = false;
                }
            } catch (Exception var19) {
                class5.field67.repaint();
            }
        }
        if (class16.field213) {
            class2.method13(false);
        }
        if (class242.field4196 && class280.field4818 == 10 && class170.field2901 != -1) {
            class242.field4196 = false;
            class219.method1484((byte) -96, class297.field5086);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILs;II)V", line = 2896)
    private static final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, class171 arg5, int arg6, int arg7) {
        if (class15.field189) {
            class314.field5322 = 32;
        } else {
            class314.field5322 = 0;
        }
        if (arg3 != 4) {
            return;
        }
        class15.field189 = false;
        field626++;
        if (class64.field1119 != 0) {
            if (arg2 <= arg1 && arg1 < arg2 + 16 && arg7 >= arg6 && arg6 + 16 > arg7) {
                arg5.field2966 -= 4;
                class165.method1099((byte) 127, arg5);
            } else if (arg2 <= arg1 && arg1 < arg2 + 16 && arg7 >= (arg0 + arg6 - 16) && arg7 < (arg0 + arg6)) {
                arg5.field2966 += 4;
                class165.method1099((byte) 126, arg5);
            } else if (arg1 >= (arg2 - class314.field5322) && arg1 < class314.field5322 + arg2 + 16 && arg7 >= (arg6 + 16) && arg6 - (16 - arg0) > arg7) {
                int var8 = (arg0 - 32) * arg0 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - arg6 - (var8 / 2) - 16;
                int var10 = arg0 - var8 - 32;
                arg5.field2966 = (arg4 - arg0) * var9 / var10;
                class165.method1099((byte) 125, arg5);
                class15.field189 = true;
            }
        }
        if (field606 == 0) {
            return;
        }
        int var11 = arg5.field3002;
        if (arg1 >= (arg2 - var11) && arg7 >= arg6 && (arg2 + 16) > arg1 && arg7 <= (arg0 + arg6)) {
            arg5.field2966 += field606 * 45;
            class165.method1099((byte) 126, arg5);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2962)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class62.method482("argument count", 0);
            }
            class115.field2050 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class50.field789 = 2;
            if (arg0[1].equals("live")) {
                class215.field3737 = 0;
            } else if (arg0[1].equals("rc")) {
                class215.field3737 = 1;
            } else if (arg0[1].equals("wip")) {
                class215.field3737 = 2;
            } else {
                class62.method482("modewhat", 0);
            }
            class173.field3098 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class105.method789(92, class285.method2004(var2.length, var2, 0, 0));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class310.field5259 = var1;
            } else if (arg0[2].equals("english")) {
                class310.field5259 = 0;
            } else if (arg0[2].equals("german")) {
                class310.field5259 = 1;
            } else {
                class62.method482("language", 0);
            }
            class61.method461((byte) -43, class310.field5259);
            class50.field768 = false;
            class271.field4699 = false;
            if (arg0[3].equals("game0")) {
                class155.field2663 = 0;
            } else if (arg0[3].equals("game1")) {
                class155.field2663 = 1;
            } else {
                class62.method482("game", 0);
            }
            class232.field4026 = false;
            class70.field1210 = class235.field4104;
            class62.field1097 = 0;
            client var4 = new client();
            class303.field5178 = var4;
            var4.method294(class215.field3737 + 32, 518, 768, 1024, "runescape", 27, (byte) 126);
            class284.field4882.setLocation(40, 40);
        } catch (Exception var7) {
            class107.method796(var7, (byte) -126, (String) null);
        }
        field627++;
    }
}
