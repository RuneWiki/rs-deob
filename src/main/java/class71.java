import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class71 extends class118 {

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
    public int field1680 = 0;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "[I")
    public static int[] field1657 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field1661 = 0;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "Lfc;")
    public static class39 field1660 = class90.method774("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -107);

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "[I")
    public static int[] field1665 = new int[5];

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lfc;")
    public static class39 field1673 = class90.method774("m", -121);

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Lfc;")
    private static class39 field1663 = class90.method774("The server is being updated)3", -99);

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "Lfc;")
    private static class39 field1664 = class90.method774("You are standing in a members)2only area)3", -127);

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "Lfc;")
    public static class39 field1674 = class90.method774("redstone3", -98);

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lfc;")
    public static class39 field1676 = field1663;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lfc;")
    public static class39 field1677 = class90.method774("Sprites geladen)3", -111);

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "Lfc;")
    public static class39 field1666 = class90.method774("m-Ochte sich mit Ihnen duellieren)3", -94);

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lfc;")
    public static class39 field1659 = field1664;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "J")
    public static long field1669;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lab;")
    public static class3 field1670;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "Llf;")
    public static class82 field1672;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "[I")
    public static int[] field1679;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 3)
    public static final void method655(int arg0, int arg1) {
        field1668++;
        short var2 = 256;
        class2.field48 += arg0 * 128;
        if (class2.field48 > class92.field2162.length) {
            class2.field48 -= class92.field2162.length;
            int var3 = (int) (Math.random() * 12.0D);
            class151.method1202(class60.field1460[var3], (byte) -107);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var27 = class61.field1504[var4 + var5] - class92.field2162[class92.field2162.length - 1 & class2.field48 + var5] * arg0 / 6;
            if (var27 < 0) {
                var27 = 0;
            }
            class61.field1504[var5++] = var27;
        }
        for (int var8 = var2 - arg0; var8 < var2; var8++) {
            int var24 = var8 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class61.field1504[var24 + var25] = 255;
                } else {
                    class61.field1504[var25 + var24] = 0;
                }
            }
        }
        if (class131.field3319 > 0) {
            class131.field3319 -= arg0 * 4;
        }
        if (class3.field98 > 0) {
            class3.field98 -= arg0 * 4;
        }
        if (class3.field98 == 0 && class131.field3319 == 0) {
            int var9 = (int) ((double) (2000 / arg0) * Math.random());
            if (var9 == 1) {
                class131.field3319 = 1024;
            }
            if (var9 == 0) {
                class3.field98 = 1024;
            }
        }
        if (arg1 != 18588) {
            return;
        }
        for (int var10 = 0; var10 < var2 - arg0; var10++) {
            class39.field1091[var10] = class39.field1091[var10 + arg0];
        }
        for (int var11 = var2 - arg0; var11 < var2; var11++) {
            class39.field1091[var11] = (int) (Math.sin((double) class79.field1798 / 14.0D) * 16.0D + Math.sin((double) class79.field1798 / 15.0D) * 14.0D + Math.sin((double) class79.field1798 / 16.0D) * 12.0D);
            class79.field1798++;
        }
        class101.field2551 += arg0;
        int var12 = (arg0 + (class70.field1654 & 0x1)) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class101.field2551 * 100; var13++) {
            int var22 = (int) (Math.random() * 128.0D) + 128;
            int var23 = (int) (Math.random() * 124.0D) + 2;
            class61.field1504[var23 + (var22 << 7)] = 192;
        }
        class101.field2551 = 0;
        for (int var14 = 0; var14 < var2; var14++) {
            int var19 = var14 * 128;
            int var20 = 0;
            for (int var21 = -var12; var21 < 128; var21++) {
                if (var12 + var21 < 128) {
                    var20 += class61.field1504[var12 + var19 + var21];
                }
                if (var21 - var12 - 1 >= 0) {
                    var20 -= class61.field1504[var19 + var21 - var12 - 1];
                }
                if (var21 >= 0) {
                    class145.field3630[var19 + var21] = var20 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var2; var17++) {
                int var18 = var17 * 128;
                if (var2 > var17 + var12) {
                    var16 += class145.field3630[var12 * 128 + var18 + var15];
                }
                if (var17 - var12 - 1 >= 0) {
                    var16 -= class145.field3630[var18 + var15 - (var12 + 1) * 128];
                }
                if (var17 >= 0) {
                    class61.field1504[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V", line = 208)
    public static final void method656(boolean arg0) {
        if (arg0) {
            field1665 = null;
        }
        field1675++;
        int var1 = -1;
        if (class92.field2146 == 0 && !class97.field2313) {
            class92.method786(class12.field314, 21, 0, 77, class131.field3322, class107.field2693, class37.field1002);
            class50.field1280++;
        }
        for (int var2 = 0; var2 < class23.field630; var2++) {
            int var3 = class23.field642[var2];
            int var4 = var3 & 0x7F;
            int var5 = var3 >> 7 & 0x7F;
            int var6 = var3 >> 29 & 0x3;
            int var7 = var3 >> 14 & 0x7FFF;
            if (var1 != var3) {
                var1 = var3;
                if (var6 == 2 && class139.field3503.method43(class24.field661, var4, var5, var3) >= 0) {
                    class35 var8 = class90.method776(var7, -122);
                    if (var8.field970 != null) {
                        var8 = var8.method402(false);
                    }
                    if (var8 == null) {
                        continue;
                    }
                    if (class92.field2146 == 1) {
                        class39.field1093++;
                        class92.method786(var4, 24, var3, 76, var5, class137.method1111(new class39[] { class76.field1741, class121.field3155, var8.field940 }, (byte) 119), class50.field1267);
                    } else if (!class97.field2313) {
                        class37.field1003++;
                        class39[] var9 = var8.field934;
                        if (class124.field3192) {
                            var9 = class99.method824(var9, (byte) -19);
                        }
                        if (var9 != null) {
                            for (int var10 = 4; var10 >= 0; var10--) {
                                if (var9[var10] != null) {
                                    class70.field1647++;
                                    short var11 = 0;
                                    if (var10 == 0) {
                                        var11 = 17;
                                    }
                                    if (var10 == 1) {
                                        var11 = 43;
                                    }
                                    if (var10 == 2) {
                                        var11 = 1;
                                    }
                                    if (var10 == 3) {
                                        var11 = 52;
                                    }
                                    if (var10 == 4) {
                                        var11 = 1002;
                                    }
                                    class92.method786(var4, var11, var3, 105, var5, class137.method1111(new class39[] { class142.field3554, var8.field940 }, (byte) 79), var9[var10]);
                                }
                            }
                        }
                        class92.method786(var4, 1001, var8.field931 << 14, 65, var5, class137.method1111(new class39[] { class142.field3554, var8.field940 }, (byte) -94), class42.field1151);
                    } else if ((class109.field2790 & 0x4) == 4) {
                        class92.method786(var4, 31, var3, 40, var5, class137.method1111(new class39[] { class103.field2591, class121.field3155, var8.field940 }, (byte) -71), class96.field2232);
                        class143.field3593++;
                    }
                }
                if (var6 == 1) {
                    class121 var12 = class118.field3092[var7];
                    if (var12.field3163.field2279 == 1 && (var12.field2916 & 0x7F) == 64 && (var12.field2909 & 0x7F) == 64) {
                        for (int var13 = 0; var13 < class15.field416; var13++) {
                            class121 var16 = class118.field3092[class121.field3176[var13]];
                            if (var16 != null && var12 != var16 && var16.field3163.field2279 == 1 && var12.field2916 == var16.field2916 && var12.field2909 == var16.field2909) {
                                class43.method510(var4, var5, -18341, var16.field3163, class121.field3176[var13]);
                            }
                        }
                        for (int var14 = 0; var14 < class111.field2871; var14++) {
                            class142 var15 = class101.field2525[class31.field862[var14]];
                            if (var15 != null && var12.field2916 == var15.field2916 && var12.field2909 == var15.field2909) {
                                class96.method809(var15, true, var5, var4, class31.field862[var14]);
                            }
                        }
                    }
                    class43.method510(var4, var5, -18341, var12.field3163, var7);
                }
                if (var6 == 0) {
                    class142 var17 = class101.field2525[var7];
                    if ((var17.field2916 & 0x7F) == 64 && (var17.field2909 & 0x7F) == 64) {
                        for (int var18 = 0; var18 < class15.field416; var18++) {
                            class121 var21 = class118.field3092[class121.field3176[var18]];
                            if (var21 != null && var21.field3163.field2279 == 1 && var17.field2916 == var21.field2916 && var17.field2909 == var21.field2909) {
                                class43.method510(var4, var5, -18341, var21.field3163, class121.field3176[var18]);
                            }
                        }
                        for (int var19 = 0; var19 < class111.field2871; var19++) {
                            class142 var20 = class101.field2525[class31.field862[var19]];
                            if (var20 != null && var17 != var20 && var17.field2916 == var20.field2916 && var17.field2909 == var20.field2909) {
                                class96.method809(var20, !arg0, var5, var4, class31.field862[var19]);
                            }
                        }
                    }
                    class96.method809(var17, true, var5, var4, var7);
                }
                if (var6 == 3) {
                    class2 var22 = class7.field208[class24.field661][var4][var5];
                    if (var22 != null) {
                        for (class75 var23 = (class75) var22.method15(false); var23 != null; var23 = (class75) var22.method14(-18320)) {
                            class109 var24 = class37.method421(true, var23.field1731);
                            if (class92.field2146 == 1) {
                                class92.method786(var4, 16, var23.field1731, 25, var5, class137.method1111(new class39[] { class76.field1741, class56.field1403, var24.field2787 }, (byte) 82), class50.field1267);
                                class101.field2553++;
                            } else if (!class97.field2313) {
                                class58.field1429++;
                                class39[] var25 = var24.field2748;
                                if (class124.field3192) {
                                    var25 = class99.method824(var25, (byte) -19);
                                }
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25 != null && var25[var26] != null) {
                                        class70.field1649++;
                                        byte var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 27;
                                        }
                                        if (var26 == 1) {
                                            var27 = 29;
                                        }
                                        if (var26 == 2) {
                                            var27 = 39;
                                        }
                                        if (var26 == 3) {
                                            var27 = 11;
                                        }
                                        if (var26 == 4) {
                                            var27 = 34;
                                        }
                                        class92.method786(var4, var27, var23.field1731, 41, var5, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) -68), var25[var26]);
                                    } else if (var26 == 2) {
                                        class92.method786(var4, 39, var23.field1731, 85, var5, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) 106), class25.field730);
                                        client.field556++;
                                    }
                                }
                                class92.method786(var4, 1005, var23.field1731, 90, var5, class137.method1111(new class39[] { class99.field2382, var24.field2787 }, (byte) 125), class42.field1151);
                            } else if ((class109.field2790 & 0x1) == 1) {
                                class80.field1813++;
                                class92.method786(var4, 36, var23.field1731, 116, var5, class137.method1111(new class39[] { class103.field2591, class56.field1403, var24.field2787 }, (byte) 82), class96.field2232);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I", line = 500)
    public static final int method657(int arg0, int arg1, int arg2, int arg3) {
        field1667++;
        if ((class137.field3424[arg3][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class137.field3424[1][arg0][arg2] & 0x2) == 0) {
            if (arg1 != 16626) {
                method656(true);
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Loc;Loc;ILoc;)V", line = 524)
    public static final void method658(class100 arg0, class100 arg1, int arg2, class100 arg3) {
        if (arg2 != 12584) {
            field1665 = null;
        }
        field1678++;
        class110.field2842 = arg1;
        class132.field3343 = arg3;
        client.field553 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V", line = 540)
    public static void method659(boolean arg0) {
        field1677 = null;
        field1676 = null;
        field1672 = null;
        field1665 = null;
        if (arg0) {
            method662((byte) -42);
        }
        field1657 = null;
        field1660 = null;
        field1679 = null;
        field1670 = null;
        field1673 = null;
        field1663 = null;
        field1666 = null;
        field1659 = null;
        field1664 = null;
        field1674 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ldc;BI)V", line = 573)
    private final void method660(class25 arg0, byte arg1, int arg2) {
        field1656++;
        if (arg1 != -66) {
            field1666 = null;
        }
        if (arg2 == 2) {
            this.field1680 = arg0.method301(arg1 ^ 0x12B5);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLdc;)V", line = 589)
    public final void method661(boolean arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method322((byte) -50);
            if (var3 == 0) {
                field1658++;
                if (!arg0) {
                    field1663 = null;
                    return;
                }
                return;
            }
            this.method660(arg1, (byte) -66, var3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V", line = 635)
    public static final void method662(byte arg0) {
        field1671++;
        if (class133.field3357.toLowerCase().indexOf("microsoft") == -1) {
            class86.field1946[59] = 57;
            class86.field1946[92] = 74;
            class86.field1946[47] = 73;
            class86.field1946[45] = 26;
            class86.field1946[61] = 27;
            class86.field1946[91] = 42;
            class86.field1946[44] = 71;
            class86.field1946[46] = 72;
            if (class133.field3349 == null) {
                class86.field1946[222] = 59;
                class86.field1946[192] = 58;
            } else {
                class86.field1946[520] = 59;
                class86.field1946[192] = 28;
                class86.field1946[222] = 58;
            }
            class86.field1946[93] = 43;
        } else {
            class86.field1946[220] = 74;
            class86.field1946[187] = 27;
            class86.field1946[190] = 72;
            class86.field1946[186] = 57;
            class86.field1946[189] = 26;
            class86.field1946[223] = 28;
            class86.field1946[221] = 43;
            class86.field1946[192] = 58;
            class86.field1946[222] = 59;
            class86.field1946[188] = 71;
            class86.field1946[219] = 42;
            class86.field1946[191] = 73;
        }
        if (arg0 > -101) {
            method659(false);
        }
    }
}
