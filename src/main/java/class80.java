import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class80 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lhj;")
    public static class69 field1531 = class181.method1318("(U (X", (byte) -108);

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lhj;")
    private static class69 field1529 = class181.method1318("Type", (byte) -127);

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lhj;")
    public static class69 field1535 = field1529;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lta;")
    public static class241 field1536 = new class241(5);

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lhj;")
    public static class69 field1541 = class181.method1318("Okay", (byte) -122);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lnc;")
    public static class83 field1533;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "[Lkc;")
    public static class264[] field1530;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhj;B)I")
    public static final int method567(class69 arg0, byte arg1) {
        field1539++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 != -96) {
            field1529 = null;
        }
        for (int var2 = 0; var2 < class273.field4828; var2++) {
            if (arg0.method446(class103.field1915[var2], arg1 ^ 0x21)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lih;")
    public static final class196 method568(int arg0, int arg1) {
        class196 var2 = (class196) class70.field1378.method1448((long) arg0, (byte) -40);
        field1537++;
        if (var2 != null) {
            return var2;
        } else if (arg1 == -40) {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class76.field1480.method590(arg0 & 0x7FFF, 1, 0);
            } else {
                var3 = class221.field3977.method590(arg0, 1, 0);
            }
            class196 var4 = new class196();
            if (var3 != null) {
                var4.method1436(true, new class128(var3));
            }
            if (arg0 >= 32768) {
                var4.method1441((byte) 105);
            }
            class70.field1378.method1453(0, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ltk;Z)Ltk;")
    public static final class50 method569(class50 arg0, boolean arg1) {
        field1540++;
        if (!arg1) {
            field1531 = null;
        }
        if (arg0.field778 != -1) {
            return client.method1144((byte) -9, arg0.field778);
        }
        int var2 = arg0.field773 >>> 16;
        class136 var3 = new class136(class156.field2910);
        for (class259 var4 = (class259) var3.method1020((byte) -88); var4 != null; var4 = (class259) var3.method1014(false)) {
            if (var4.field4640 == var2) {
                return client.method1144((byte) -9, (int) var4.field1685);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static final void method570(int arg0) {
        if (arg0 != -1) {
            field1532 = 124;
        }
        field1538++;
        class166.field3055.method1713(102);
        class235.field4284.method1713(-107);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method571(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1528++;
        if (arg0 < 3) {
            method571(123, 18, -103, -32, -6, 38, 74, -107, 33);
        }
        for (int var9 = 0; var9 < class61.field1117.field1724; var9++) {
            int var10 = class61.field1117.field1717[var9] - class250.field4539;
            int var11 = arg6 + ((var10 - arg2) * (arg7 - arg6) / (arg5 - arg2));
            int var12 = class22.field306 + class209.field3806 - class61.field1117.field1720[var9] - 1;
            int var13 = (arg8 - arg1) * (var12 - arg4) / (arg3 - arg4) + arg1;
            int var14 = class61.field1117.method648(var9, 13326);
            int var15 = 16777215;
            class185 var16 = null;
            if (var14 == 0) {
                if ((double) class93.field1741 == 3.0D) {
                    var16 = class98.field1839;
                }
                if ((double) class93.field1741 == 4.0D) {
                    var16 = class112.field2162;
                }
                if ((double) class93.field1741 == 6.0D) {
                    var16 = class147.field2717;
                }
                if ((double) class93.field1741 == 8.0D) {
                    var16 = class161.field2984;
                }
            }
            if (var14 == 1) {
                if ((double) class93.field1741 == 3.0D) {
                    var16 = class147.field2717;
                }
                if ((double) class93.field1741 == 4.0D) {
                    var16 = class161.field2984;
                }
                if ((double) class93.field1741 == 6.0D) {
                    var16 = class106.field2000;
                }
                if ((double) class93.field1741 == 8.0D) {
                    var16 = class161.field2982;
                }
            }
            if (var14 == 2) {
                var15 = 16755200;
                if ((double) class93.field1741 == 3.0D) {
                    var16 = class106.field2000;
                }
                if ((double) class93.field1741 == 4.0D) {
                    var16 = class161.field2982;
                }
                if ((double) class93.field1741 == 6.0D) {
                    var16 = class11.field108;
                }
                if ((double) class93.field1741 == 8.0D) {
                    var16 = class129.field2412;
                }
            }
            if (class61.field1117.field1730[var9] != -1) {
                var15 = class61.field1117.field1730[var9];
            }
            if (var16 != null) {
                class69[] var17 = new class69[class61.field1117.field1729[var9].method472(60, true) + 1];
                class227.field4139.method1607(class61.field1117.field1729[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var13 - var16.method1342() * (var18 - 1) / 2;
                int var20 = var19 + var16.method1338() / 2;
                for (int var21 = 0; var21 < var18; var21++) {
                    class69 var22 = var18 - 1 == var21 ? var17[var21] : var17[var21].method485(var17[var21].method441((byte) 73) - 4, 0, (byte) -20);
                    var16.method1347(var22, var11, var20, var15, true);
                    var20 += var16.method1342();
                }
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public static final void method572(int arg0) {
        field1534++;
        if (class123.field2288 > 0) {
            class123.field2288--;
        }
        if (class208.field3789 > 1) {
            class33.field471 = class81.field1564;
            class208.field3789--;
        }
        if (class104.field1973) {
            class104.field1973 = false;
            class118.method862(false);
            return;
        }
        for (int var1 = 0; var1 < 100 && class208.method1507((byte) -69); var1++) {
        }
        if (class268.field4760 != 30) {
            return;
        }
        class95.method691(class48.field692, 160, arg0 - 91);
        Object var2 = class108.field2032.field1688;
        synchronized (class108.field2032.field1688) {
            if (!class138.field2575) {
                class108.field2032.field1697 = 0;
            } else if (class8.field53 != 0 || class108.field2032.field1697 >= 40) {
                class48.field692.method301(187, -104);
                class240.field4418++;
                class48.field692.method933(0, -20946);
                int var3 = 0;
                int var4 = class48.field692.field2379;
                for (int var5 = 0; var5 < class108.field2032.field1697 && class48.field692.field2379 - var4 < 240; var5++) {
                    int var6 = class108.field2032.field1698[var5];
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class108.field2032.field1701[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class108.field2032.field1698[var5] == -1 && class108.field2032.field1701[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class177.field3221 != var8 || class91.field1713 != var6) {
                        int var9 = var8 - class177.field3221;
                        int var10 = var6 - class91.field1713;
                        class177.field3221 = var8;
                        class91.field1713 = var6;
                        if (class222.field4013 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class48.field692.method943((byte) 127, (var9 << 6) + (class222.field4013 << 12) + var10);
                            class222.field4013 = 0;
                        } else if (class222.field4013 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            class48.field692.method933(class222.field4013 + 128, -20946);
                            var9 += 128;
                            class48.field692.method943((byte) 127, (var9 << 8) + var10);
                            class222.field4013 = 0;
                        } else if (class222.field4013 < 32) {
                            class48.field692.method933(class222.field4013 + 192, arg0 ^ 0xFFFFAE7F);
                            if (var7) {
                                class48.field692.method908(false, Integer.MIN_VALUE);
                            } else {
                                class48.field692.method908(false, var6 << 16 | var8);
                            }
                            class222.field4013 = 0;
                        } else {
                            class48.field692.method943((byte) 127, class222.field4013 + 57344);
                            if (var7) {
                                class48.field692.method908(false, Integer.MIN_VALUE);
                            } else {
                                class48.field692.method908(false, var8 | var6 << 16);
                            }
                            class222.field4013 = 0;
                        }
                    } else if (class222.field4013 < 2047) {
                        class222.field4013++;
                    }
                }
                class48.field692.method941(2, class48.field692.field2379 - var4);
                if (var3 < class108.field2032.field1697) {
                    class108.field2032.field1697 -= var3;
                    for (int var11 = 0; var11 < class108.field2032.field1697; var11++) {
                        class108.field2032.field1701[var11] = class108.field2032.field1701[var3 + var11];
                        class108.field2032.field1698[var11] = class108.field2032.field1698[var11 + var3];
                    }
                } else {
                    class108.field2032.field1697 = 0;
                }
            }
        }
        if (class8.field53 != 0) {
            int var12 = class207.field3776;
            int var13 = class56.field1020;
            long var14 = (class159.field2974 - class228.field4161) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            class216.field3915++;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            byte var16 = 0;
            if (class8.field53 == 2) {
                var16 = 1;
            }
            int var17 = (int) var14;
            class228.field4161 = class159.field2974;
            class48.field692.method301(33, -104);
            class48.field692.method957(arg0 - 1591076041, var17 | var16 << 15);
            class48.field692.method934(var12 << 16 | var13, 3499);
        }
        if (class71.field1389 > 0) {
            class71.field1389--;
        }
        if (class261.field4656[96] || class261.field4656[97] || class261.field4656[98] || class261.field4656[99]) {
            class162.field3002 = true;
        }
        if (class162.field3002 && class71.field1389 <= 0) {
            class71.field1389 = 20;
            class228.field4147++;
            class162.field3002 = false;
            class48.field692.method301(251, -104);
            class48.field692.method943((byte) 127, class207.field3775);
            class48.field692.method957(-1591075960, client.field2812);
        }
        if (class233.field4256 && !class168.field3095) {
            class168.field3095 = true;
            class48.field692.method301(132, -104);
            class203.field3658++;
            class48.field692.method933(1, -20946);
        }
        if (!class233.field4256 && class168.field3095) {
            class203.field3658++;
            class168.field3095 = false;
            class48.field692.method301(132, -104);
            class48.field692.method933(0, -20946);
        }
        if (!class152.field2833) {
            class209.field3812++;
            class48.field692.method301(197, -104);
            class48.field692.method948(class43.method245(-78), -128);
            class152.field2833 = true;
        }
        class85.method628(0);
        if (class268.field4760 != 30) {
            return;
        }
        class127.method906((byte) -96);
        class106.method801(-117);
        class230.field4213++;
        if (class230.field4213 > 750) {
            class118.method862(false);
            return;
        }
        class104.method782((byte) 125);
        class236.method1670(-3373);
        class175.method1273(-98);
        if (class157.field2918 != null) {
            class270.method1855((byte) -112);
        }
        for (int var18 = class212.method1528(true, (byte) -46); var18 != -1; var18 = class212.method1528(false, (byte) -46)) {
            class106.method802(true, var18);
            class89.field1699[class69.method443(31, class268.field4773++)] = var18;
        }
        for (class135 var19 = class196.method1434(0); var19 != null; var19 = class196.method1434(0)) {
            int var20 = var19.method1013((byte) -48);
            int var21 = var19.method1008((byte) -84);
            if (var20 == 1) {
                class270.field4784[var21] = var19.field2539;
                class167.field3081[class69.method443(31, class22.field301++)] = var21;
            } else if (var20 == 2) {
                class175.field3204[var21] = var19.field2533;
                class168.field3094[class69.method443(class24.field349++, 31)] = var21;
            } else if (var20 == 3) {
                class50 var22 = client.method1144((byte) -9, var21);
                if (!var19.field2533.method444((byte) -24, var22.field749)) {
                    var22.field749 = var19.field2533;
                    class204.method1478(var22, false);
                }
            } else if (var20 == 4) {
                class50 var23 = client.method1144((byte) -9, var21);
                int var24 = var19.field2539;
                int var25 = var19.field2535;
                if (var23.field737 != var24 || var23.field888 != var25) {
                    var23.field737 = var24;
                    var23.field888 = var25;
                    class204.method1478(var23, false);
                }
            } else if (var20 == 5) {
                class50 var41 = client.method1144((byte) -9, var21);
                if (var19.field2539 != var41.field783 || var19.field2539 == -1) {
                    var41.field815 = 0;
                    var41.field821 = 0;
                    var41.field783 = var19.field2539;
                    class204.method1478(var41, false);
                }
            } else if (var20 == 6) {
                int var26 = var19.field2539;
                int var27 = var26 >> 10 & 0x1F;
                int var28 = var26 >> 5 & 0x1F;
                int var29 = var26 & 0x1F;
                class50 var30 = client.method1144((byte) -9, var21);
                int var31 = (var29 << 3) + ((var27 << 19) + (var28 << 11));
                if (var30.field845 != var31) {
                    var30.field845 = var31;
                    class204.method1478(var30, false);
                }
            } else if (var20 == 7) {
                class50 var39 = client.method1144((byte) -9, var21);
                boolean var40 = var19.field2539 == 1;
                if (var39.field746 != var40) {
                    var39.field746 = var40;
                    class204.method1478(var39, false);
                }
            } else if (var20 == 8) {
                class50 var38 = client.method1144((byte) -9, var21);
                if (var19.field2539 != var38.field835 || var19.field2535 != var38.field883 || var19.field2534 != var38.field776) {
                    var38.field835 = var19.field2539;
                    var38.field883 = var19.field2535;
                    var38.field776 = var19.field2534;
                    if (var38.field765 != -1) {
                        if (var38.field869 > 0) {
                            var38.field776 = var38.field776 * 32 / var38.field869;
                        } else if (var38.field873 > 0) {
                            var38.field776 = var38.field776 * 32 / var38.field873;
                        }
                    }
                    class204.method1478(var38, false);
                }
            } else if (var20 == 9) {
                class50 var37 = client.method1144((byte) -9, var21);
                if (var19.field2539 != var37.field765 || var19.field2535 != var37.field788) {
                    var37.field788 = var19.field2535;
                    var37.field765 = var19.field2539;
                    class204.method1478(var37, false);
                }
            } else if (var20 == 10) {
                class50 var36 = client.method1144((byte) -9, var21);
                if (var19.field2539 != var36.field846 || var19.field2535 != var36.field885 || var19.field2534 != var36.field755) {
                    var36.field846 = var19.field2539;
                    var36.field755 = var19.field2534;
                    var36.field885 = var19.field2535;
                    class204.method1478(var36, false);
                }
            } else if (var20 == 11) {
                class50 var35 = client.method1144((byte) -9, var21);
                var35.field771 = var35.field782 = var19.field2539;
                var35.field780 = 0;
                var35.field878 = 0;
                var35.field740 = var35.field867 = var19.field2535;
                class204.method1478(var35, false);
            } else if (var20 == 12) {
                class50 var33 = client.method1144((byte) -9, var21);
                int var34 = var19.field2539;
                if (var33 != null && var33.field884 == 0) {
                    if ((var33.field839 - var33.field727) < var34) {
                        var34 = var33.field839 - var33.field727;
                    }
                    if (var34 < 0) {
                        var34 = 0;
                    }
                    if (var33.field792 != var34) {
                        var33.field792 = var34;
                        class204.method1478(var33, false);
                    }
                }
            } else if (var20 == 13) {
                class50 var32 = client.method1144((byte) -9, var21);
                var32.field824 = var19.field2539;
            }
        }
        if (class216.field3907 != 0) {
            class161.field2995 += 20;
            if (class161.field2995 >= 400) {
                class216.field3907 = 0;
            }
        }
        class148.field2767++;
        if (class135.field2536 != null) {
            class47.field675++;
            if (class47.field675 >= 15) {
                class204.method1478(class135.field2536, false);
                class135.field2536 = null;
            }
        }
        if (class5.field40 != null) {
            class204.method1478(class5.field40, false);
            if (class205.field3681 > class57.field1040 + 5 || class57.field1040 - 5 > class205.field3681 || class83.field1576 + 5 < class72.field1398 || class72.field1398 < class83.field1576 - 5) {
                class13.field189 = true;
            }
            class133.field2482++;
            if (class206.field3763 == 0) {
                if (class13.field189 && class133.field2482 >= 5) {
                    if (class5.field40 == class108.field2075 && class47.field686 != class193.field3523) {
                        byte var42 = 0;
                        class50 var43 = class5.field40;
                        class177.field3224++;
                        if (class89.field1700 == 1 && var43.field828 == 206) {
                            var42 = 1;
                        }
                        if (var43.field851[class193.field3523] <= 0) {
                            var42 = 0;
                        }
                        if (class222.method1580(false, client.method1141(var43))) {
                            int var46 = class193.field3523;
                            int var47 = class47.field686;
                            var43.field851[var46] = var43.field851[var47];
                            var43.field790[var46] = var43.field790[var47];
                            var43.field851[var47] = -1;
                            var43.field790[var47] = 0;
                        } else if (var42 == 1) {
                            int var44 = class193.field3523;
                            int var45 = class47.field686;
                            while (var44 != var45) {
                                if (var44 < var45) {
                                    var43.method283(var45, true, var45 - 1);
                                    var45--;
                                } else if (var44 > var45) {
                                    var43.method283(var45, true, var45 + 1);
                                    var45++;
                                }
                            }
                        } else {
                            var43.method283(class47.field686, true, class193.field3523);
                        }
                        class48.field692.method301(19, -104);
                        class48.field692.method957(arg0 - 1591076041, class47.field686);
                        class48.field692.method920(var42, arg0 ^ 0x2C);
                        class48.field692.method919(class193.field3523, -3);
                        class48.field692.method948(class5.field40.field773, -59);
                    }
                } else if ((class33.field461 == 1 || class97.method716(arg0 ^ 0xFFFFFC44, class177.field3218 - 1)) && class177.field3218 > 2) {
                    class47.method265((byte) 108);
                } else if (class177.field3218 > 0) {
                    class69.method493(-1);
                }
                class8.field53 = 0;
                class47.field675 = 10;
                class5.field40 = null;
            }
        }
        class166.field3077 = null;
        class72.field1395 = false;
        class262.field4669 = false;
        class186.field3351 = 0;
        class50 var48 = class119.field2250;
        class50 var49 = class177.field3223;
        class119.field2250 = null;
        class177.field3223 = null;
        while (class126.method902(102) && class186.field3351 < 128) {
            class139.field2610[class186.field3351] = class59.field1078;
            class235.field4287[class186.field3351] = class181.field3291;
            class186.field3351++;
        }
        class157.field2918 = null;
        if (class35.field483 != -1) {
            class22.method125(0, class20.field287, 0, class35.field483, 0, class66.field1278, 0, arg0 - 86);
        }
        class81.field1564++;
        while (true) {
            class58 var50;
            class50 var51;
            class50 var52;
            do {
                var50 = (class58) class112.field2160.method1731((byte) -101);
                if (var50 == null) {
                    while (true) {
                        class58 var53;
                        class50 var54;
                        class50 var55;
                        do {
                            var53 = (class58) class66.field1271.method1731((byte) -101);
                            if (var53 == null) {
                                while (true) {
                                    class58 var56;
                                    class50 var57;
                                    class50 var58;
                                    do {
                                        var56 = (class58) class89.field1694.method1731((byte) -101);
                                        if (var56 == null) {
                                            if (arg0 != 81) {
                                                method567((class69) null, (byte) -107);
                                            }
                                            if (class243.field4469 && class157.field2918 == null) {
                                                class243.field4469 = false;
                                            }
                                            if (class26.field370 != null) {
                                                class36.method198(true);
                                            }
                                            if (class245.field4487 > 0 && class261.field4656[82] && class261.field4656[81] && class179.field3260 != 0) {
                                                int var59 = class52.field927 - class179.field3260;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class236.method1671((byte) -96, var59, class220.field3962 + class156.field2904.field4046[0], class156.field2904.field3998[0] + class242.field4441);
                                            }
                                            if (class26.field367 != -1) {
                                                int var60 = class26.field367;
                                                int var61 = class220.field3959;
                                                if (class245.field4487 > 0 && class261.field4656[82] && class261.field4656[81]) {
                                                    class236.method1671((byte) -109, class52.field927, class220.field3962 + var61, class242.field4441 - -var60);
                                                } else if (class212.field3859) {
                                                    class237.field4300++;
                                                    class48.field692.method301(221, -104);
                                                    class48.field692.method964(class242.field4441 + var60, arg0 + 47);
                                                    class48.field692.method943((byte) 127, class20.field276);
                                                    class48.field692.method908(false, class228.field4164);
                                                    class48.field692.method943((byte) 127, class220.field3962 + var61);
                                                    class216.field3907 = 1;
                                                    class222.field4059 = class56.field1020;
                                                    class161.field2995 = 0;
                                                    class9.field65 = class207.field3776;
                                                } else {
                                                    boolean var62 = class206.method1498(true, 0, class156.field2904.field4046[0], var60, var61, 0, class156.field2904.field3998[0], true, 0, 0, 0, 0);
                                                    if (var62) {
                                                        class222.field4059 = class56.field1020;
                                                        class216.field3907 = 1;
                                                        class161.field2995 = 0;
                                                        class9.field65 = class207.field3776;
                                                    }
                                                }
                                                class26.field367 = -1;
                                                class212.field3859 = false;
                                            }
                                            class112.method836(arg0 ^ 0xFFFFFFAC);
                                            if (class119.field2250 != var48) {
                                                if (var48 != null) {
                                                    class204.method1478(var48, false);
                                                }
                                                if (class119.field2250 != null) {
                                                    class204.method1478(class119.field2250, false);
                                                }
                                            }
                                            if (class177.field3223 != var49 && class263.field4680 == class163.field3020) {
                                                if (var49 != null) {
                                                    class204.method1478(var49, false);
                                                }
                                                if (class177.field3223 != null) {
                                                    class204.method1478(class177.field3223, false);
                                                }
                                            }
                                            if (class177.field3223 == null) {
                                                if (class163.field3020 > 0) {
                                                    class163.field3020--;
                                                }
                                            } else if (class263.field4680 > class163.field3020) {
                                                class163.field3020++;
                                                if (class263.field4680 == class163.field3020) {
                                                    class204.method1478(class177.field3223, false);
                                                }
                                            }
                                            if (class265.field4711 == 1) {
                                                class34.method184(false);
                                            } else if (class265.field4711 == 2) {
                                                class247.method1746((byte) -69);
                                            } else {
                                                class39.method219(arg0 + 12024);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class236.field4289[var63]++;
                                            }
                                            int var64 = class254.method1765(true);
                                            int var65 = class240.method1704((byte) -36);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class123.field2288 = 250;
                                                class113.field2169++;
                                                class112.method837(-1, 4000);
                                                class48.field692.method301(225, -104);
                                            }
                                            if (class23.field317 != null && class23.field317.field1663 == 1) {
                                                if (class23.field317.field1666 != null) {
                                                    class171.method1256(class66.field1274, 0, class59.field1070);
                                                }
                                                class59.field1070 = false;
                                                class66.field1274 = null;
                                                class23.field317 = null;
                                            }
                                            class64.field1245++;
                                            class182.field3314++;
                                            class232.field4234++;
                                            if (class232.field4234 > 500) {
                                                class232.field4234 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class21.field294 += class38.field527;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class11.field102 += class55.field981;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class41.field588 += class28.field412;
                                                }
                                            }
                                            if (class21.field294 < -55) {
                                                class38.field527 = 2;
                                            }
                                            if (class21.field294 > 55) {
                                                class38.field527 = -2;
                                            }
                                            if (class41.field588 < -50) {
                                                class28.field412 = 2;
                                            }
                                            if (class41.field588 > 50) {
                                                class28.field412 = -2;
                                            }
                                            if (class11.field102 < -40) {
                                                class55.field981 = 1;
                                            }
                                            if (class182.field3314 > 500) {
                                                class182.field3314 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class179.field3257 += class99.field1868;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class59.field1080 += class79.field1520;
                                                }
                                            }
                                            if (class179.field3257 < -60) {
                                                class99.field1868 = 2;
                                            }
                                            if (class59.field1080 < -20) {
                                                class79.field1520 = 1;
                                            }
                                            if (class179.field3257 > 60) {
                                                class99.field1868 = -2;
                                            }
                                            if (class59.field1080 > 10) {
                                                class79.field1520 = -1;
                                            }
                                            if (class11.field102 > 40) {
                                                class55.field981 = -1;
                                            }
                                            if (class64.field1245 > 50) {
                                                class48.field692.method301(199, -104);
                                                class55.field986++;
                                            }
                                            if (class49.field705) {
                                                class35.method187((byte) -100);
                                                class49.field705 = false;
                                            }
                                            try {
                                                if (class135.field2532 != null && class48.field692.field2379 > 0) {
                                                    class135.field2532.method1267(class48.field692.field2385, (byte) 6, 0, class48.field692.field2379);
                                                    class64.field1245 = 0;
                                                    class48.field692.field2379 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class118.method862(false);
                                                return;
                                            }
                                        }
                                        var57 = var56.field1048;
                                        if (var57.field735 < 0) {
                                            break;
                                        }
                                        var58 = client.method1144((byte) -9, var57.field778);
                                    } while (var58 == null || var58.field848 == null || var57.field735 >= var58.field848.length || var58.field848[var57.field735] != var57);
                                    class179.method1304((byte) -104, var56);
                                }
                            }
                            var54 = var53.field1048;
                            if (var54.field735 < 0) {
                                break;
                            }
                            var55 = client.method1144((byte) -9, var54.field778);
                        } while (var55 == null || var55.field848 == null || var54.field735 >= var55.field848.length || var55.field848[var54.field735] != var54);
                        class179.method1304((byte) -108, var53);
                    }
                }
                var51 = var50.field1048;
                if (var51.field735 < 0) {
                    break;
                }
                var52 = client.method1144((byte) -9, var51.field778);
            } while (var52 == null || var52.field848 == null || var52.field848.length <= var51.field735 || var52.field848[var51.field735] != var51);
            class179.method1304((byte) 70, var50);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
    public static void method573(int arg0) {
        int var1 = 76 / ((arg0 - 47) / 46);
        field1536 = null;
        field1535 = null;
        field1541 = null;
        field1531 = null;
        field1529 = null;
        field1533 = null;
        field1530 = null;
    }
}
