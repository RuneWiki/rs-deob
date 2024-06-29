import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class101 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[I")
    private int[] field1888;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[I")
    private int[] field1893;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field1891 = new int[100];

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lhj;")
    public static class69 field1894 = class181.method1318("RuneScape wird geladen )2 bitte warten)3)3)3", (byte) -112);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    private int field1889;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "I")
    private int field1900;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    private int field1901;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lnc;")
    public static class83 field1897;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method744(int arg0) {
        field1896++;
        for (int var1 = 0; var1 < 5; var1++) {
            class199.field3588[var1] = false;
        }
        class155.field2893 = -1;
        class115.field2194 = -1;
        if (arg0 >= 10) {
            class265.field4711 = 1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    private final void method745(int arg0) {
        field1887++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        if (arg0 != 605477988) {
            this.method745(-20);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var6 + var61;
            int var65 = var7 + var64;
            int var66 = var5 + var63;
            int var67 = var65 ^ var64 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var66;
            var6 = var69 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var2 + var5;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var63;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1888[var11 + 5] + var4;
            int var38 = this.field1888[var11 + 3] + var6;
            int var39 = this.field1888[var11] + var9;
            int var40 = this.field1888[var11 + 1] + var8;
            int var41 = this.field1888[var11 + 6] + var3;
            int var42 = this.field1888[var11 + 4] + var5;
            int var43 = this.field1888[var11 + 7] + var2;
            int var44 = this.field1888[var11 + 2] + var7;
            int var45 = var39 ^ var40 << 11;
            int var46 = var40 + var44;
            int var47 = var38 + var45;
            int var48 = var46 ^ var44 >>> 2;
            int var49 = var44 + var47;
            int var50 = var49 ^ var47 << 8;
            int var51 = var37 + var50;
            int var52 = var42 + var48;
            int var53 = var47 + var52;
            var6 = var53 ^ var52 >>> 16;
            int var54 = var6 + var41;
            int var55 = var51 + var52;
            var5 = var55 ^ var51 << 10;
            int var56 = var51 + var54;
            var4 = var56 ^ var54 >>> 4;
            int var57 = var5 + var43;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            this.field1893[var11] = var9;
            var7 = var2 + var50;
            this.field1893[var11 + 1] = var8;
            this.field1893[var11 + 2] = var7;
            this.field1893[var11 + 3] = var6;
            this.field1893[var11 + 4] = var5;
            this.field1893[var11 + 5] = var4;
            this.field1893[var11 + 6] = var3;
            this.field1893[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1893[var12 + 7] + var2;
            int var14 = this.field1893[var12 + 3] + var6;
            int var15 = this.field1893[var12 + 1] + var8;
            int var16 = this.field1893[var12 + 2] + var7;
            int var17 = this.field1893[var12] + var9;
            int var18 = this.field1893[var12 + 4] + var5;
            int var19 = this.field1893[var12 + 6] + var3;
            int var20 = var17 ^ var15 << 11;
            int var21 = this.field1893[var12 + 5] + var4;
            int var22 = var15 + var16;
            int var23 = var22 ^ var16 >>> 2;
            int var24 = var18 + var23;
            int var25 = var14 + var20;
            int var26 = var16 + var25;
            int var27 = var26 ^ var25 << 8;
            int var28 = var21 + var27;
            int var29 = var24 + var25;
            var6 = var29 ^ var24 >>> 16;
            int var30 = var6 + var19;
            int var31 = var24 + var28;
            var5 = var31 ^ var28 << 10;
            int var32 = var28 + var30;
            var4 = var32 ^ var30 >>> 4;
            int var33 = var5 + var13;
            int var34 = var4 + var20;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var23;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field1893[var12] = var9;
            this.field1893[var12 + 1] = var8;
            this.field1893[var12 + 2] = var7;
            this.field1893[var12 + 3] = var6;
            this.field1893[var12 + 4] = var5;
            this.field1893[var12 + 5] = var4;
            this.field1893[var12 + 6] = var3;
            this.field1893[var12 + 7] = var2;
        }
        this.method751(255);
        this.field1900 = 256;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public static final void method746(int arg0, int arg1) {
        class135 var2 = class8.method38((byte) 120, 7, arg1);
        var2.method1012((byte) 44);
        if (arg0 == 1007) {
            field1892++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method747(int arg0) {
        field1897 = null;
        field1894 = null;
        field1891 = null;
        int var1 = 79 % ((12 - arg0) / 51);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III[Ltk;IIIIII)V")
    public static final void method748(int arg0, int arg1, int arg2, class50[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class15.method89(arg1, arg8, arg4, arg6);
        class178.method1299();
        field1898++;
        if (arg7 != 1) {
            return;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class50 var11 = arg3[var10];
            if (var11 != null && (var11.field778 == arg5 || arg5 == -1412584499 && class26.field370 == var11)) {
                int var12;
                if (arg9 == -1) {
                    field1891[class151.field2797] = var11.field771 + arg0;
                    class181.field3300[class151.field2797] = var11.field740 + arg2;
                    class129.field2410[class151.field2797] = var11.field798;
                    class202.field3646[class151.field2797] = var11.field727;
                    var12 = class151.field2797++;
                } else {
                    var12 = arg9;
                }
                var11.field882 = class180.field3272;
                var11.field794 = var12;
                if (!var11.field763 || !client.method1147(var11)) {
                    if (var11.field828 > 0) {
                        class99.method741(var11, 2047);
                    }
                    int var13 = var11.field740 + arg2;
                    int var14 = var11.field793;
                    int var15 = var11.field771 + arg0;
                    if (class88.field1684 && (client.method1141(var11) != 0 || var11.field884 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class26.field370 == var11) {
                        if (arg5 != -1412584499 && !var11.field879) {
                            class232.field4237 = arg0;
                            class118.field2233 = arg3;
                            class100.field1881 = arg2;
                            continue;
                        }
                        if (class166.field3068 && class72.field1395) {
                            int var16 = class205.field3681;
                            int var17 = class72.field1398;
                            int var18 = var17 - class144.field2681;
                            if (var18 < class217.field3920) {
                                var18 = class217.field3920;
                            }
                            int var19 = var16 - class115.field2202;
                            if (class217.field3920 + class61.field1118.field727 < var11.field727 + var18) {
                                var18 = class217.field3920 + class61.field1118.field727 - var11.field727;
                            }
                            if (var19 < class63.field1231) {
                                var19 = class63.field1231;
                            }
                            if (class63.field1231 + class61.field1118.field798 < var19 - -var11.field798) {
                                var19 = class63.field1231 + class61.field1118.field798 - var11.field798;
                            }
                            var13 = var18;
                            var15 = var19;
                        }
                        if (!var11.field879) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field884 == 2) {
                        var20 = arg8;
                        var21 = arg6;
                        var22 = arg1;
                        var23 = arg4;
                    } else {
                        var22 = arg1 < var15 ? var15 : arg1;
                        var20 = var13 <= arg8 ? arg8 : var13;
                        int var24 = var11.field798 + var15;
                        int var25 = var11.field727 + var13;
                        if (var11.field884 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = var24 >= arg4 ? arg4 : var24;
                        var21 = arg6 <= var25 ? arg6 : var25;
                    }
                    if (!var11.field763 || var23 > var22 && var21 > var20) {
                        if (var11.field828 != 0) {
                            if (var11.field828 == 1337) {
                                class23.field328 = var11;
                                class58.field1057 = var13;
                                class222.field3990 = var15;
                                class251.method1754(var13, (byte) -20, var11.field727, var11.field828 == 1403, var11.field798, var15);
                                class15.method89(arg1, arg8, arg4, arg6);
                                continue;
                            }
                            if (var11.field828 == 1338) {
                                if (var11.method279((byte) -97)) {
                                    class258.method1780(var11, var15, var12, true, var13);
                                    class15.method89(arg1, arg8, arg4, arg6);
                                }
                                continue;
                            }
                            if (var11.field828 == 1339) {
                                if (var11.method279((byte) -97)) {
                                    class254.method1767(var11, var13, false, var12, var15);
                                    class15.method89(arg1, arg8, arg4, arg6);
                                }
                                continue;
                            }
                            if (var11.field828 == 1400) {
                                class142.method1084(arg7 + 123, var15, var11.field727, var13, var11.field798);
                                class40.field576[var12] = true;
                                class49.field723[var12] = true;
                                class15.method89(arg1, arg8, arg4, arg6);
                                continue;
                            }
                            if (var11.field828 == 1401) {
                                class35.method191(var15, var11.field798, var13, arg7 ^ 0xFFFFF1EC, var11.field727);
                                class40.field576[var12] = true;
                                class49.field723[var12] = true;
                                class15.method89(arg1, arg8, arg4, arg6);
                                continue;
                            }
                            if (var11.field828 == 1402) {
                                class141.method1082(var15, arg7 ^ 0x61, var13);
                                class40.field576[var12] = true;
                                class49.field723[var12] = true;
                                continue;
                            }
                            if (var11.field828 == 1404) {
                                class79.method565(var13, (byte) -118, var11, class227.field4139, var15, var11.field727, class26.field378, var11.field798);
                                class40.field576[var12] = true;
                                class49.field723[var12] = true;
                                continue;
                            }
                            if (var11.field828 == 1405) {
                                if (!class90.field1702) {
                                    continue;
                                }
                                int var26 = var15 + var11.field798;
                                int var27 = var13 + 15;
                                int var28 = 16776960;
                                int var29 = 0;
                                class155.field2897.method1613(class9.method42(arg7 ^ 0xFFFFFF9D, new class69[] { class244.field4477, class98.method727(-229, class211.field3839) }), var26, var27, 16776960, -1);
                                int var115 = var27 + 15;
                                int var30 = 0;
                                int var31 = 0;
                                Runtime var32 = Runtime.getRuntime();
                                int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                if (var33 > 65536) {
                                    var28 = 16711680;
                                }
                                class155.field2897.method1613(class9.method42(58, new class69[] { class222.field4000, class98.method727(-229, var33), class263.field4699 }), var26, var115, var28, -1);
                                for (int var34 = 0; var34 < 27; var34++) {
                                    var29 += class230.field4208[var34].method1399((byte) 87);
                                    var30 += class230.field4208[var34].method1405(true);
                                    var31 += class230.field4208[var34].method1403(0);
                                }
                                var27 = var115 + 15;
                                int var35 = 16776960;
                                int var36 = var31 * 100 / var29;
                                int var37 = var30 * 10000 / var29;
                                class69 var38 = class9.method42(-83, new class69[] { class106.field1997, class242.method1716(0, (byte) 109, 2, true, (long) var37), class80.field1531, class98.method727(-229, var36), class91.field1721 });
                                class227.field4139.method1613(var38, var26, var27, var35, -1);
                                class40.field576[var12] = true;
                                var27 += 12;
                                class49.field723[var12] = true;
                                continue;
                            }
                        }
                        if (!class103.field1936) {
                            if (var11.field884 == 0 && var11.field748 && class256.field4601 >= var22 && var20 <= class240.field4416 && class256.field4601 < var23 && var21 > class240.field4416 && !class88.field1684) {
                                class208.field3782[0] = 1007;
                                class26.field374[0] = class253.field4571;
                                class177.field3218 = 1;
                                class216.field3917[0] = class209.field3816;
                            }
                            if (class256.field4601 >= var22 && var20 <= class240.field4416 && class256.field4601 < var23 && var21 > class240.field4416) {
                                class36.method197(121, var11, class256.field4601 - var15, -var13 + class240.field4416);
                            }
                        }
                        if (var11.field884 == 0) {
                            if (!var11.field763 && client.method1147(var11) && class119.field2250 != var11) {
                                continue;
                            }
                            if (!var11.field763) {
                                if (var11.field792 > (var11.field839 - var11.field727)) {
                                    var11.field792 = var11.field839 - var11.field727;
                                }
                                if (var11.field792 < 0) {
                                    var11.field792 = 0;
                                }
                            }
                            method748(var15 - var11.field829, var22, var13 - var11.field792, arg3, var23, var11.field773, var21, arg7, var20, var12);
                            if (var11.field848 != null) {
                                method748(var15 - var11.field829, var22, var13 - var11.field792, var11.field848, var23, var11.field773, var21, arg7, var20, var12);
                            }
                            class259 var39 = (class259) class156.field2910.method769(true, (long) var11.field773);
                            if (var39 != null) {
                                if (var39.field4639 == 0 && !class103.field1936 && class256.field4601 >= var22 && var20 <= class240.field4416 && var23 > class256.field4601 && class240.field4416 < var21 && !class88.field1684) {
                                    class208.field3782[0] = 1007;
                                    class26.field374[0] = class253.field4571;
                                    class216.field3917[0] = class209.field3816;
                                    class177.field3218 = 1;
                                }
                                class56.method337((byte) -125, var22, var12, var15, var21, var13, var23, var39.field4640, var20);
                            }
                            class15.method89(arg1, arg8, arg4, arg6);
                            class178.method1299();
                        }
                        if (class175.field3201[var12] || class91.field1727 > 1) {
                            if (var11.field884 == 0 && !var11.field763 && var11.field839 > var11.field727) {
                                class270.method1854(var11.field727, var11.field798 + var15, var11.field839, (byte) -42, var13, var11.field792);
                            }
                            if (var11.field884 != 1) {
                                if (var11.field884 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field739; var41++) {
                                        for (int var42 = 0; var42 < var11.field873; var42++) {
                                            int var43 = var15 + ((var11.field837 + 32) * var42);
                                            int var44 = (var11.field872 + 32) * var41 + var13;
                                            if (var40 < 20) {
                                                var43 += var11.field745[var40];
                                                var44 += var11.field764[var40];
                                            }
                                            if (var11.field851[var40] > 0) {
                                                boolean var45 = false;
                                                int var46 = var11.field851[var40] - 1;
                                                boolean var47 = false;
                                                if ((var43 + 32) > arg1 && arg4 > var43 && arg8 < (var44 + 32) && var44 < arg6 || class5.field40 == var11 && class47.field686 == var40) {
                                                    class56 var48;
                                                    if (class144.field2680 == 1 && class165.field3045 == var40 && class266.field4734 == var11.field773) {
                                                        var48 = class105.method790(var46, 2, 255, 0, var11.field790[var40], var11.field890);
                                                    } else {
                                                        var48 = class105.method790(var46, 1, 255, 3153952, var11.field790[var40], var11.field890);
                                                    }
                                                    if (class178.field3235) {
                                                        class40.field576[var12] = true;
                                                    }
                                                    if (var48 == null) {
                                                        class204.method1478(var11, false);
                                                    } else if (class5.field40 == var11 && class47.field686 == var40) {
                                                        int var49 = class205.field3681 - class57.field1040;
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        int var50 = class72.field1398 - class83.field1576;
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class133.field2482 < 5) {
                                                            var50 = 0;
                                                            var49 = 0;
                                                        }
                                                        var48.method332(var43 + var49, var44 + var50, 128);
                                                        if (arg5 != -1) {
                                                            class50 var51 = arg3[arg5 & 0xFFFF];
                                                            int var52 = class15.field202;
                                                            int var53 = class15.field208;
                                                            if (var52 > (var44 + var50) && var51.field792 > 0) {
                                                                int var54 = (var52 - var44 - var50) * class148.field2767 / 3;
                                                                if (var54 > (class148.field2767 * 10)) {
                                                                    var54 = class148.field2767 * 10;
                                                                }
                                                                if (var54 > var51.field792) {
                                                                    var54 = var51.field792;
                                                                }
                                                                class83.field1576 += var54;
                                                                var51.field792 -= var54;
                                                                class204.method1478(var51, false);
                                                            }
                                                            if ((var44 + var50 + 32) > var53 && (var51.field839 - var51.field727) > var51.field792) {
                                                                int var55 = (var44 + var50 + 32 - var53) * class148.field2767 / 3;
                                                                if (var55 > class148.field2767 * 10) {
                                                                    var55 = class148.field2767 * 10;
                                                                }
                                                                if ((var51.field839 - var51.field792 - var51.field727) < var55) {
                                                                    var55 = var51.field839 - var51.field727 - var51.field792;
                                                                }
                                                                var51.field792 += var55;
                                                                class83.field1576 -= var55;
                                                                class204.method1478(var51, false);
                                                            }
                                                        }
                                                    } else if (class135.field2536 == var11 && class268.field4763 == var40) {
                                                        var48.method332(var43, var44, 128);
                                                    } else {
                                                        var48.method341(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field804 != null && var40 < 20) {
                                                class56 var56 = var11.method285((byte) 52, var40);
                                                if (var56 != null) {
                                                    var56.method341(var43, var44);
                                                } else if (class271.field4791) {
                                                    class204.method1478(var11, false);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field884 == 3) {
                                    int var57;
                                    if (class221.method1566(var11, (byte) 69)) {
                                        var57 = var11.field826;
                                        if (class119.field2250 == var11 && var11.field736 != 0) {
                                            var57 = var11.field736;
                                        }
                                    } else {
                                        var57 = var11.field845;
                                        if (class119.field2250 == var11 && var11.field818 != 0) {
                                            var57 = var11.field818;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field823) {
                                            class15.method77(var15, var13, var11.field798, var11.field727, var57);
                                        } else {
                                            class15.method82(var15, var13, var11.field798, var11.field727, var57);
                                        }
                                    } else if (var11.field823) {
                                        class15.method95(var15, var13, var11.field798, var11.field727, var57, 256 - (var14 & 0xFF));
                                    } else {
                                        class15.method81(var15, var13, var11.field798, var11.field727, var57, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field884 == 4) {
                                    class225 var58 = var11.method278(class128.field2398, false);
                                    if (var58 != null) {
                                        class69 var59 = var11.field749;
                                        int var60;
                                        if (class221.method1566(var11, (byte) 70)) {
                                            var60 = var11.field826;
                                            if (class119.field2250 == var11 && var11.field736 != 0) {
                                                var60 = var11.field736;
                                            }
                                            if (var11.field811.method441((byte) 73) > 0) {
                                                var59 = var11.field811;
                                            }
                                        } else {
                                            var60 = var11.field845;
                                            if (class119.field2250 == var11 && var11.field818 != 0) {
                                                var60 = var11.field818;
                                            }
                                        }
                                        if (var11.field763 && var11.field765 != -1) {
                                            class205 var61 = class83.method585(var11.field765, -1);
                                            var59 = var61.field3741;
                                            if (var59 == null) {
                                                var59 = class258.field4626;
                                            }
                                            if ((var61.field3682 == 1 || var11.field788 != 1) && var11.field788 != -1) {
                                                var59 = class9.method42(77, new class69[] { class46.field664, var59, class196.field3575, class268.method1844(-14581, var11.field788) });
                                            }
                                        }
                                        if (class193.field3516 == var11) {
                                            var60 = var11.field845;
                                            var59 = class23.field326;
                                        }
                                        if (!var11.field763) {
                                            var59 = class131.method972(var59, var11, (byte) -60);
                                        }
                                        var58.method1599(var59, var15, var13, var11.field798, var11.field727, var60, var11.field843 ? 0 : -1, var11.field852, var11.field791, var11.field861);
                                    } else if (class271.field4791) {
                                        class204.method1478(var11, false);
                                    }
                                } else if (var11.field884 == 5) {
                                    if (var11.field763) {
                                        class56 var63;
                                        if (var11.field765 == -1) {
                                            var63 = var11.method288((byte) -111, false);
                                        } else {
                                            var63 = class105.method790(var11.field765, var11.field889, 255, var11.field779, var11.field788, var11.field890);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1014;
                                            int var65 = var63.field1009;
                                            if (var11.field762) {
                                                int var66 = (var11.field798 + var65 - 1) / var65;
                                                int var67 = (var11.field727 + var64 - 1) / var64;
                                                class15.method87(var15, var13, var11.field798 + var15, var11.field727 + var13);
                                                for (int var68 = 0; var68 < var66; var68++) {
                                                    for (int var69 = 0; var69 < var67; var69++) {
                                                        if (var11.field865 != 0) {
                                                            var63.method344(var11.field865, var64 * var69 + var13 + (var64 / 2), (byte) -71, 4096, var65 / 2 + var65 * var68 + var15);
                                                        } else if (var14 == 0) {
                                                            var63.method341(var65 * var68 + var15, var13 - -(var64 * var69));
                                                        } else {
                                                            var63.method332(var65 * var68 + var15, var13 - -(var64 * var69), 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class15.method89(arg1, arg8, arg4, arg6);
                                            } else {
                                                int var70 = var11.field798 * 4096 / var65;
                                                if (var11.field865 != 0) {
                                                    var63.method344(var11.field865, var13 + (var11.field727 / 2), (byte) -76, var70, var15 + (var11.field798 / 2));
                                                } else if (var14 != 0) {
                                                    var63.method340(var15, var13, var11.field798, var11.field727, 256 - (var14 & 0xFF));
                                                } else if (var11.field798 == var65 && var11.field727 == var64) {
                                                    var63.method341(var15, var13);
                                                } else {
                                                    var63.method339(var15, var13, var11.field798, var11.field727);
                                                }
                                            }
                                        } else if (class271.field4791) {
                                            class204.method1478(var11, false);
                                        }
                                    } else {
                                        class56 var62 = var11.method288((byte) -124, class221.method1566(var11, (byte) 46));
                                        if (var62 != null) {
                                            var62.method341(var15, var13);
                                        } else if (class271.field4791) {
                                            class204.method1478(var11, false);
                                        }
                                    }
                                } else if (var11.field884 == 6) {
                                    boolean var71 = class221.method1566(var11, (byte) 21);
                                    class92 var72 = null;
                                    int var73;
                                    if (var71) {
                                        var73 = var11.field775;
                                    } else {
                                        var73 = var11.field783;
                                    }
                                    int var74 = 0;
                                    if (var11.field765 != -1) {
                                        class205 var79 = class83.method585(var11.field765, -1);
                                        if (var79 != null) {
                                            class205 var80 = var79.method1480((byte) 125, var11.field788);
                                            class159 var81 = var73 == -1 ? null : class211.method1521(-41, var73);
                                            var72 = var80.method1487(var11.field821, 120, var81, 1);
                                            if (var72 == null) {
                                                class204.method1478(var11, false);
                                            } else {
                                                var74 = -var72.method211() / 2;
                                            }
                                        }
                                    } else if (var11.field737 == 5) {
                                        if (var11.field888 == -1) {
                                            var72 = class127.field2330.method679(arg7 + 63, -1, -1, (class159) null, (class159) null);
                                        } else {
                                            int var76 = var11.field888 & 0x7FF;
                                            if (class13.field191 == var76) {
                                                var76 = 2047;
                                            }
                                            class108 var77 = class35.field491[var76];
                                            class159 var78 = var73 == -1 ? null : class211.method1521(-73, var73);
                                            if (var77 != null && (int) var77.field2045.method473((byte) 112) << 11 == (var11.field888 & 0xFFFFF800)) {
                                                var72 = var77.field2036.method679(64, var11.field821, 0, var78, (class159) null);
                                            }
                                        }
                                    } else if (var73 == -1) {
                                        var72 = var11.method290(var71, false, (class159) null, -1, class156.field2904.field2036);
                                        if (var72 == null && class271.field4791) {
                                            class204.method1478(var11, false);
                                        }
                                    } else {
                                        class159 var75 = class211.method1521(-46, var73);
                                        var72 = var11.method290(var71, false, var75, var11.field821, class156.field2904.field2036);
                                        if (var72 == null && class271.field4791) {
                                            class204.method1478(var11, false);
                                        }
                                    }
                                    if (var72 != null) {
                                        int var82;
                                        if (var11.field869 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field798 << 8) / var11.field869;
                                        }
                                        int var83;
                                        if (var11.field875 > 0) {
                                            var83 = (var11.field727 << 8) / var11.field875;
                                        } else {
                                            var83 = 256;
                                        }
                                        int var84 = var11.field798 / 2 + (var11.field862 * var82 >> 8) + var15;
                                        int var85 = (var11.field874 * var83 >> 8) + var11.field727 / 2 + var13;
                                        class178.method1284(var84, var85);
                                        int var86 = class178.field3232[var11.field835] * var11.field776 >> 16;
                                        int var87 = class178.field3247[var11.field835] * var11.field776 >> 16;
                                        if (!var11.field763) {
                                            var72.method658(0, var11.field883, 0, var11.field835, 0, var87, var86);
                                        } else if (var11.field814) {
                                            ((class238) var72).method1691(0, var11.field883, var11.field755, var11.field835, var11.field846, var74 + var87 + var11.field885, var86 - -var11.field885, var11.field776);
                                        } else {
                                            var72.method658(0, var11.field883, var11.field755, var11.field835, var11.field846, var87 - (-var74 - var11.field885), var11.field885 + var86);
                                        }
                                        class178.method1298();
                                    }
                                } else {
                                    if (var11.field884 == 7) {
                                        class225 var88 = var11.method278(class128.field2398, false);
                                        if (var88 == null) {
                                            if (class271.field4791) {
                                                class204.method1478(var11, false);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field739; var90++) {
                                            for (int var91 = 0; var91 < var11.field873; var91++) {
                                                if (var11.field851[var89] > 0) {
                                                    class205 var92 = class83.method585(var11.field851[var89] - 1, arg7 ^ 0xFFFFFFFE);
                                                    class69 var93;
                                                    if (var92.field3682 != 1 && var11.field790[var89] == 1) {
                                                        var93 = class9.method42(-92, new class69[] { class46.field664, var92.field3741, class242.field4439 });
                                                    } else {
                                                        var93 = class9.method42(arg7 ^ 0xFFFFFFA7, new class69[] { class46.field664, var92.field3741, class196.field3575, class268.method1844(-14581, var11.field790[var89]) });
                                                    }
                                                    int var94 = (var11.field872 + 12) * var90 + var13;
                                                    int var95 = (var11.field837 + 115) * var91 + var15;
                                                    if (var11.field852 == 0) {
                                                        var88.method1616(var93, var95, var94, var11.field845, var11.field843 ? 0 : -1);
                                                    } else if (var11.field852 == 1) {
                                                        var88.method1598(var93, var95 + 57, var94, var11.field845, var11.field843 ? 0 : -1);
                                                    } else {
                                                        var88.method1613(var93, var95 + 115 - 1, var94, var11.field845, var11.field843 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field884 == 8 && class177.field3223 == var11 && class263.field4680 == class163.field3020) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class225 var98 = class155.field2897;
                                        class69 var99 = var11.field749;
                                        class69 var100 = class131.method972(var99, var11, (byte) 77);
                                        while (var100.method441((byte) 73) > 0) {
                                            int var108 = var100.method481(0, class69.field1318);
                                            class69 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class209.field3816;
                                            } else {
                                                var109 = var100.method485(var108, 0, (byte) -20);
                                                var100 = var100.method478(-110, var108 + 4);
                                            }
                                            int var110 = var98.method1606(var109);
                                            var97 += var98.field4091 + 1;
                                            if (var110 > var96) {
                                                var96 = var110;
                                            }
                                        }
                                        var96 += 6;
                                        int var101 = var11.field798 + var15 - var96 - 5;
                                        if (var101 < (var15 + 5)) {
                                            var101 = var15 + 5;
                                        }
                                        int var102 = var11.field727 + var13 + 5;
                                        if (arg4 < (var96 + var101)) {
                                            var101 = arg4 - var96;
                                        }
                                        var97 += 7;
                                        if (arg6 < (var97 + var102)) {
                                            var102 = arg6 - var97;
                                        }
                                        class15.method77(var101, var102, var96, var97, 16777120);
                                        class15.method82(var101, var102, var96, var97, 0);
                                        class69 var103 = var11.field749;
                                        int var104 = var98.field4091 + var102 + 2;
                                        class69 var105 = class131.method972(var103, var11, (byte) -126);
                                        while (var105.method441((byte) 73) > 0) {
                                            int var106 = var105.method481(0, class69.field1318);
                                            class69 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class209.field3816;
                                            } else {
                                                var107 = var105.method485(var106, 0, (byte) -20);
                                                var105 = var105.method478(arg7 - 117, var106 + 4);
                                            }
                                            var98.method1616(var107, var101 + 3, var104, 0, -1);
                                            var104 += var98.field4091 + 1;
                                        }
                                    }
                                    if (var11.field884 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field870) {
                                            var111 = var11.field798 + var15;
                                            var112 = var13;
                                            var113 = var11.field727 + var13;
                                            var114 = var15;
                                        } else {
                                            var112 = var11.field727 + var13;
                                            var111 = var11.field798 + var15;
                                            var114 = var15;
                                            var113 = var13;
                                        }
                                        if (var11.field728 == 1) {
                                            class15.method80(var114, var113, var111, var112, var11.field845);
                                        } else {
                                            class15.method85(var114, var113, var111, var112, var11.field845, var11.field728);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)Lhj;")
    public static final class69 method749(long arg0, int arg1) {
        field1886++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class50.field768[(int) (var8 - (arg0 * 37L))];
            }
            class69 var7 = new class69();
            var7.field1351 = var6;
            if (arg1 != 25801) {
                field1894 = null;
            }
            var7.field1331 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V")
    public static final void method750(int arg0, int arg1, int arg2, int arg3) {
        class217 var4 = class158.field2935[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class212 var5 = var4.field3946;
        if (var5 != null) {
            var5.field3848 = var5.field3848 * arg3 / 16;
            var5.field3851 = var5.field3851 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
    private final void method751(int arg0) {
        field1895++;
        this.field1902 += ++this.field1901;
        int var2 = 0;
        if (arg0 != 255) {
            this.field1900 = 7;
        }
        while (var2 < 256) {
            int var3 = this.field1893[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1889 ^= this.field1889 << 13;
                } else {
                    this.field1889 ^= this.field1889 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1889 ^= this.field1889 << 2;
            } else {
                this.field1889 ^= this.field1889 >>> 16;
            }
            this.field1889 += this.field1893[var2 + 128 & 0xFF];
            int var4;
            this.field1893[var2] = var4 = this.field1902 + (this.field1893[class69.method443(var3, 1020) >> 2] + this.field1889);
            this.field1888[var2] = this.field1902 = var3 + this.field1893[class69.method443(261321, var4) >> 8 >> 2];
            var2++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)I")
    public final int method752(int arg0) {
        if (this.field1900-- == 0) {
            this.method751(255);
            this.field1900 = 255;
        }
        field1890++;
        if (arg0 != 256) {
            method744(58);
        }
        return this.field1888[this.field1900];
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    private class101() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "([I)V")
    public class101(int[] arg0) {
        this.field1888 = new int[256];
        this.field1893 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1888[var2] = arg0[var2];
        }
        this.method745(605477988);
    }
}
