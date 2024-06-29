import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 extends class259 {

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lbd;")
    public static class185 field1908 = new class185(64);

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "Lcc;")
    public static class209 field1913 = class95.method669(126, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    private static int field1917 = 2;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Lcc;")
    public static class209 field1915 = class95.method669(116, "brillant1:");

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "Lcc;")
    public static class209 field1916 = class95.method669(124, "Angreifen");

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field1919 = 0;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Lbd;")
    public static class185 field1920 = new class185(16);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lta;")
    private class255 field1909;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILcc;)Lcc;")
    public final class209 method683(int arg0, int arg1, class209 arg2) {
        if (arg1 != 0) {
            this.method687(62, (class106) null);
        }
        field1907++;
        if (this.field1909 == null) {
            return arg2;
        } else {
            class275 var4 = (class275) this.field1909.method1755((long) arg0, (byte) -78);
            return var4 == null ? arg2 : var4.field4864;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
    public final int method684(int arg0, int arg1, int arg2) {
        field1910++;
        if (this.field1909 == null) {
            return arg2;
        }
        class18 var4 = (class18) this.field1909.method1755((long) arg0, (byte) -120);
        if (arg1 < 34) {
            method688(92);
        }
        return var4 == null ? arg2 : var4.field363;
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public static void method685(int arg0) {
        field1916 = null;
        if (arg0 == 9270) {
            field1908 = null;
            field1920 = null;
            field1913 = null;
            field1915 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ltf;II)V")
    private final void method686(class106 arg0, int arg1, int arg2) {
        if (arg2 != 31423) {
            this.method687(-49, (class106) null);
        }
        if (arg1 == 249) {
            int var4 = arg0.method774((byte) 103);
            if (this.field1909 == null) {
                int var5 = class136.method943((byte) 37, var4);
                this.field1909 = new class255(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method774((byte) 92) == 1;
                int var8 = arg0.method776(125);
                class34 var9;
                if (var7) {
                    var9 = new class275(arg0.method755(arg2 ^ 0x7ABE));
                } else {
                    var9 = new class18(arg0.method746((byte) -100));
                }
                this.field1909.method1762(var9, (long) var8, (byte) 73);
            }
        }
        field1918++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILtf;)V")
    public final void method687(int arg0, class106 arg1) {
        int var3 = 82 / ((46 - arg0) / 38);
        field1914++;
        while (true) {
            int var4 = arg1.method774((byte) 94);
            if (var4 == 0) {
                return;
            }
            this.method686(arg1, var4, 31423);
        }
    }

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public static final void method688(int arg0) {
        field1911++;
        if (class1.field22 > 0) {
            class1.field22--;
        }
        if (class59.field1188 > 1) {
            class67.field1290 = class54.field1069;
            class59.field1188--;
        }
        if (class49.field975) {
            class49.field975 = false;
            class64.method475(50);
            return;
        }
        for (int var1 = 0; var1 < 100 && class250.method1734(-116); var1++) {
        }
        if (class284.field5008 != 30) {
            return;
        }
        class285.method1920(70, class84.field1677, arg0 - 122);
        Object var2 = class239.field4320.field1254;
        synchronized (class239.field4320.field1254) {
            if (!class64.field1244) {
                class239.field4320.field1258 = 0;
            } else if (class183.field3310 != 0 || class239.field4320.field1258 >= 40) {
                class124.field2428++;
                class84.field1677.method287((byte) 121, 54);
                int var3 = 0;
                class84.field1677.method773(-6385, 0);
                int var4 = class84.field1677.field2085;
                for (int var5 = 0; class239.field4320.field1258 > var5 && (class84.field1677.field2085 - var4) < 240; var5++) {
                    int var6 = class239.field4320.field1259[var5];
                    int var7 = class239.field4320.field1257[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    var3++;
                    boolean var8 = false;
                    if (class239.field4320.field1257[var5] == -1 && class239.field4320.field1259[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class131.field2504 != var6 || class158.field2890 != var7) {
                        int var9 = var6 - class131.field2504;
                        class131.field2504 = var6;
                        int var10 = var7 - class158.field2890;
                        class158.field2890 = var7;
                        if (class65.field1266 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class84.field1677.method740(255, (class65.field1266 << 12) + (var9 << 6) + var10);
                            class65.field1266 = 0;
                        } else if (class65.field1266 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class84.field1677.method773(-6385, class65.field1266 + 128);
                            class84.field1677.method740(255, (var9 << 8) + var10);
                            class65.field1266 = 0;
                        } else if (class65.field1266 < 32) {
                            class84.field1677.method773(-6385, class65.field1266 + 192);
                            if (var8) {
                                class84.field1677.method758(Integer.MIN_VALUE, 1469334200);
                            } else {
                                class84.field1677.method758(var7 << 16 | var6, 1469334200);
                            }
                            class65.field1266 = 0;
                        } else {
                            class84.field1677.method740(arg0 ^ 0xFF, class65.field1266 + 57344);
                            if (var8) {
                                class84.field1677.method758(Integer.MIN_VALUE, 1469334200);
                            } else {
                                class84.field1677.method758(var6 | var7 << 16, 1469334200);
                            }
                            class65.field1266 = 0;
                        }
                    } else if (class65.field1266 < 2047) {
                        class65.field1266++;
                    }
                }
                class84.field1677.method779(126, class84.field1677.field2085 - var4);
                if (class239.field4320.field1258 > var3) {
                    class239.field4320.field1258 -= var3;
                    for (int var11 = 0; var11 < class239.field4320.field1258; var11++) {
                        class239.field4320.field1259[var11] = class239.field4320.field1259[var3 + var11];
                        class239.field4320.field1257[var11] = class239.field4320.field1257[var3 + var11];
                    }
                } else {
                    class239.field4320.field1258 = 0;
                }
            }
        }
        if (class183.field3310 != 0) {
            class252.field4531++;
            long var12 = (class284.field4992 - class137.field2579) / 50L;
            int var14 = class76.field1413;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class137.field2579 = class284.field4992;
            int var15 = class237.field4246;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class183.field3310 == 2) {
                var16 = 1;
            }
            class84.field1677.method287((byte) 119, 2);
            int var17 = (int) var12;
            class84.field1677.method767(-1, var16 << 15 | var17);
            class84.field1677.method754(false, var15 | var14 << 16);
        }
        if (class201.field3607 > 0) {
            class201.field3607--;
        }
        if (class69.field1319) {
            for (int var18 = 0; var18 < class159.field2896; var18++) {
                int var19 = class257.field4649[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class23.field434 = true;
                    break;
                }
            }
        } else if (class228.field4153[96] || class228.field4153[97] || class228.field4153[98] || class228.field4153[99]) {
            class23.field434 = true;
        }
        if (class23.field434 && class201.field3607 <= 0) {
            class103.field1987++;
            class201.field3607 = 20;
            class23.field434 = false;
            class84.field1677.method287((byte) 119, 245);
            class84.field1677.method740(arg0 + 255, class253.field4565);
            class84.field1677.method767(arg0 - 1, class28.field496);
        }
        if (class271.field4806 && !class32.field579) {
            class144.field2664++;
            class32.field579 = true;
            class84.field1677.method287((byte) 124, 36);
            class84.field1677.method773(-6385, 1);
        }
        if (!class271.field4806 && class32.field579) {
            class32.field579 = false;
            class144.field2664++;
            class84.field1677.method287((byte) 125, 36);
            class84.field1677.method773(-6385, 0);
        }
        if (!class223.field4068) {
            class84.field1677.method287((byte) 126, 207);
            class61.field1222++;
            class84.field1677.method754(false, class245.method1713(arg0 - 101));
            class223.field4068 = true;
        }
        class93.method652(0);
        if (class284.field5008 != 30) {
            return;
        }
        class181.method1241((byte) 87);
        class196.method1345((byte) -70);
        class146.field2681++;
        if (class146.field2681 > 750) {
            class64.method475(50);
            return;
        }
        class75.method530(53);
        class145.method1011(-118);
        class265.method1814((byte) -91);
        if (class156.field2855 != null) {
            class10.method91((byte) 86);
        }
        for (int var20 = class142.method987(true, (byte) -127); var20 != -1; var20 = class142.method987(false, (byte) -126)) {
            class253.method1749((byte) 80, var20);
            class36.field621[class27.method220(class205.field3655++, 31)] = var20;
        }
        for (class195 var21 = class289.method1943(6500); var21 != null; var21 = class289.method1943(arg0 + 6500)) {
            int var22 = var21.method1337(122);
            int var23 = var21.method1341(-15267);
            if (var22 == 1) {
                class182.field3301[var23] = var21.field3511;
                class166.field2994[class27.method220(class254.field4581++, 31)] = var23;
            } else if (var22 == 2) {
                class92.field1819[var23] = var21.field3501;
                class266.field4763[class27.method220(class145.field2676++, 31)] = var23;
            } else if (var22 == 3) {
                class42 var24 = class247.method1719(var23, -8667);
                if (!var21.field3501.method1457((byte) -123, var24.field820)) {
                    var24.field820 = var21.field3501;
                    class126.method907(var24, 0);
                }
            } else if (var22 == 4) {
                class42 var25 = class247.method1719(var23, -8667);
                int var26 = var21.field3503;
                int var27 = var21.field3511;
                if (var25.field769 != var27 || var25.field798 != var26) {
                    var25.field769 = var27;
                    var25.field798 = var26;
                    class126.method907(var25, 0);
                }
            } else if (var22 == 5) {
                class42 var43 = class247.method1719(var23, -8667);
                if (var21.field3511 != var43.field850 || var21.field3511 == -1) {
                    var43.field850 = var21.field3511;
                    var43.field815 = 0;
                    var43.field805 = 0;
                    class126.method907(var43, 0);
                }
            } else if (var22 == 6) {
                int var28 = var21.field3511;
                int var29 = (var28 & 0x3EF) >> 5;
                int var30 = (var28 & 0x7C64) >> 10;
                int var31 = var28 & 0x1F;
                int var32 = (var29 << 11) + (var30 << 19) + (var31 << 3);
                class42 var33 = class247.method1719(var23, -8667);
                if (var33.field727 != var32) {
                    var33.field727 = var32;
                    class126.method907(var33, 0);
                }
            } else if (var22 == 7) {
                class42 var41 = class247.method1719(var23, arg0 ^ 0xFFFFDE25);
                boolean var42 = var21.field3511 == 1;
                if (var41.field706 != var42) {
                    var41.field706 = var42;
                    class126.method907(var41, arg0);
                }
            } else if (var22 == 8) {
                class42 var40 = class247.method1719(var23, arg0 ^ 0xFFFFDE25);
                if (var21.field3511 != var40.field773 || var21.field3503 != var40.field748 || var21.field3506 != var40.field712) {
                    var40.field712 = var21.field3506;
                    var40.field748 = var21.field3503;
                    var40.field773 = var21.field3511;
                    if (var40.field699 != -1) {
                        if (var40.field716 > 0) {
                            var40.field712 = var40.field712 * 32 / var40.field716;
                        } else if (var40.field808 > 0) {
                            var40.field712 = var40.field712 * 32 / var40.field808;
                        }
                    }
                    class126.method907(var40, arg0);
                }
            } else if (var22 == 9) {
                class42 var39 = class247.method1719(var23, -8667);
                if (var21.field3511 != var39.field699 || var21.field3503 != var39.field818) {
                    var39.field699 = var21.field3511;
                    var39.field818 = var21.field3503;
                    class126.method907(var39, 0);
                }
            } else if (var22 == 10) {
                class42 var38 = class247.method1719(var23, -8667);
                if (var21.field3511 != var38.field802 || var21.field3503 != var38.field817 || var21.field3506 != var38.field837) {
                    var38.field817 = var21.field3503;
                    var38.field837 = var21.field3506;
                    var38.field802 = var21.field3511;
                    class126.method907(var38, 0);
                }
            } else if (var22 == 11) {
                class42 var37 = class247.method1719(var23, -8667);
                var37.field756 = var37.field754 = var21.field3503;
                var37.field801 = var37.field750 = var21.field3511;
                var37.field813 = 0;
                var37.field720 = 0;
                class126.method907(var37, arg0);
            } else if (var22 == 12) {
                class42 var35 = class247.method1719(var23, arg0 ^ 0xFFFFDE25);
                int var36 = var21.field3511;
                if (var35 != null && var35.field810 == 0) {
                    if ((var35.field782 - var35.field758) < var36) {
                        var36 = var35.field782 - var35.field758;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field819 != var36) {
                        var35.field819 = var36;
                        class126.method907(var35, 0);
                    }
                }
            } else if (var22 == 13) {
                class42 var34 = class247.method1719(var23, arg0 - 8667);
                var34.field824 = var21.field3511;
            }
        }
        if (class159.field2895 != 0) {
            class284.field5002 += 20;
            if (class284.field5002 >= 400) {
                class159.field2895 = 0;
            }
        }
        class122.field2402++;
        if (class12.field232 != null) {
            class224.field4090++;
            if (class224.field4090 >= 15) {
                class126.method907(class12.field232, arg0);
                class12.field232 = null;
            }
        }
        if (class159.field2891 != null) {
            class126.method907(class159.field2891, arg0);
            class206.field3686++;
            if (class150.field2735 > class213.field3855 + 5 || class150.field2735 < (class213.field3855 - 5) || class47.field910 + 5 < class126.field2435 || class126.field2435 < class47.field910 - 5) {
                class78.field1447 = true;
            }
            if (class126.field2438 == 0) {
                if (class78.field1447 && class206.field3686 >= 5) {
                    if (class246.field4466 == class159.field2891 && class92.field1824 != class195.field3507) {
                        class33.field585++;
                        byte var44 = 0;
                        class42 var45 = class159.field2891;
                        if (class69.field1318 == 1 && var45.field715 == 206) {
                            var44 = 1;
                        }
                        if (var45.field778[class195.field3507] <= 0) {
                            var44 = 0;
                        }
                        if (client.method1079(client.method1070(var45), 33484541)) {
                            int var46 = class92.field1824;
                            int var47 = class195.field3507;
                            var45.field778[var47] = var45.field778[var46];
                            var45.field856[var47] = var45.field856[var46];
                            var45.field778[var46] = -1;
                            var45.field856[var46] = 0;
                        } else if (var44 == 1) {
                            int var48 = class195.field3507;
                            int var49 = class92.field1824;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var45.method314(-127, var49 - 1, var49);
                                    var49--;
                                } else if (var49 < var48) {
                                    var45.method314(13, var49 + 1, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var45.method314(-126, class195.field3507, class92.field1824);
                        }
                        class84.field1677.method287((byte) 126, 93);
                        class84.field1677.method730(126, var44);
                        class84.field1677.method729(class159.field2891.field779, -2100025528);
                        class84.field1677.method732(arg0 ^ 0x80, class195.field3507);
                        class84.field1677.method732(arg0 + 128, class92.field1824);
                    }
                } else if ((class147.field2700 == 1 || class115.method817(4, field1912 - 1)) && field1912 > 2) {
                    class237.method1645((byte) -125);
                } else if (field1912 > 0) {
                    class86.method615((byte) -52);
                }
                class183.field3310 = 0;
                class159.field2891 = null;
                class224.field4090 = 10;
            }
        }
        class56.field1149 = null;
        class148.field2712 = false;
        class278.field4888 = false;
        class159.field2896 = 0;
        class42 var50 = class85.field1695;
        class42 var51 = class177.field3239;
        class85.field1695 = null;
        class177.field3239 = null;
        while (class97.method679(true) && class159.field2896 < 128) {
            class257.field4649[class159.field2896] = class69.field1315;
            class146.field2689[class159.field2896] = class148.field2713;
            class159.field2896++;
        }
        class156.field2855 = null;
        if (~class149.field2727 != arg0) {
            class235.method1633(0, class50.field981, class25.field442, 46, 0, 0, 0, class149.field2727);
        }
        class54.field1069++;
        while (true) {
            class227 var52;
            class42 var53;
            class42 var54;
            do {
                var52 = (class227) class155.field2831.method1124((byte) 110);
                if (var52 == null) {
                    while (true) {
                        class227 var55;
                        class42 var56;
                        class42 var57;
                        do {
                            var55 = (class227) class175.field3193.method1124((byte) 122);
                            if (var55 == null) {
                                while (true) {
                                    class227 var58;
                                    class42 var59;
                                    class42 var60;
                                    do {
                                        var58 = (class227) class211.field3838.method1124((byte) 120);
                                        if (var58 == null) {
                                            if (class110.field2221 && class156.field2855 == null) {
                                                class110.field2221 = false;
                                            }
                                            if (class207.field3691 != null) {
                                                class76.method532(true);
                                            }
                                            if (class198.field3550 > 0 && class228.field4153[82] && class228.field4153[81] && class62.field1227 != 0) {
                                                int var61 = class99.field1937 - class62.field1227;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class227.method1593(var61, class223.field4069.field1567[0] + class245.field4444, class174.field3178 - -class223.field4069.field1548[0], arg0 + 97);
                                            }
                                            if (class235.field4230 != -1) {
                                                int var62 = class235.field4230;
                                                int var63 = class206.field3682;
                                                if (class198.field3550 > 0 && class228.field4153[82] && class228.field4153[81]) {
                                                    class227.method1593(class99.field1937, class245.field4444 + var63, class174.field3178 + var62, 69);
                                                } else if (class246.field4456) {
                                                    class166.field2992++;
                                                    class84.field1677.method287((byte) 126, 240);
                                                    class84.field1677.method740(255, class172.field3147);
                                                    class84.field1677.method740(arg0 ^ 0xFF, class245.field4444 + var63);
                                                    class84.field1677.method725(28307, class174.field3178 + var62);
                                                    class84.field1677.method754(false, class222.field4053);
                                                    class253.field4571 = class76.field1413;
                                                    class31.field570 = class237.field4246;
                                                    class159.field2895 = 1;
                                                    class284.field5002 = 0;
                                                } else if (class18.field369) {
                                                    class84.field1677.method287((byte) 125, 186);
                                                    class229.field4169++;
                                                    class84.field1677.method725(28307, class245.field4444 + var63);
                                                    class84.field1677.method725(arg0 + 28307, class174.field3178 + var62);
                                                    class31.field570 = class237.field4246;
                                                    class159.field2895 = 1;
                                                    class253.field4571 = class76.field1413;
                                                    class284.field5002 = 0;
                                                } else {
                                                    boolean var64 = class266.method1816(0, class223.field4069.field1567[0], 0, 0, 0, 0, class223.field4069.field1548[0], 4474, true, var63, 0, var62);
                                                    if (var64) {
                                                        class159.field2895 = 1;
                                                        class31.field570 = class237.field4246;
                                                        class253.field4571 = class76.field1413;
                                                        class284.field5002 = 0;
                                                    }
                                                }
                                                class18.field369 = false;
                                                class235.field4230 = -1;
                                                class246.field4456 = false;
                                            }
                                            class169.method1160((byte) -114);
                                            if (class85.field1695 != var50) {
                                                if (var50 != null) {
                                                    class126.method907(var50, 0);
                                                }
                                                if (class85.field1695 != null) {
                                                    class126.method907(class85.field1695, 0);
                                                }
                                            }
                                            if (class177.field3239 != var51 && class129.field2480 == class104.field2017) {
                                                if (var51 != null) {
                                                    class126.method907(var51, 0);
                                                }
                                                if (class177.field3239 != null) {
                                                    class126.method907(class177.field3239, 0);
                                                }
                                            }
                                            if (class177.field3239 == null) {
                                                if (class104.field2017 > 0) {
                                                    class104.field2017--;
                                                }
                                            } else if (class104.field2017 < class129.field2480) {
                                                class104.field2017++;
                                                if (class129.field2480 == class104.field2017) {
                                                    class126.method907(class177.field3239, 0);
                                                }
                                            }
                                            if (class16.field334 == 1) {
                                                class281.method1893(21019);
                                            } else if (class16.field334 == 2) {
                                                class137.method956(false);
                                            } else {
                                                class20.method179(2);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class9.field178[var65]++;
                                            }
                                            int var66 = class112.method800(61);
                                            int var67 = class150.method1044(true);
                                            if (var66 > 4500 && var67 > 4500) {
                                                class49.field964++;
                                                class1.field22 = 250;
                                                class283.method1905(arg0 + 99, 4000);
                                                class84.field1677.method287((byte) 118, 0);
                                            }
                                            if (class230.field4173 != null && class230.field4173.field3646 == 1) {
                                                if (class230.field4173.field3642 != null) {
                                                    class163.method1130(class172.field3139, class45.field892, 0);
                                                }
                                                class45.field892 = false;
                                                class230.field4173 = null;
                                                class172.field3139 = null;
                                            }
                                            class202.field3640++;
                                            class39.field664++;
                                            if (class202.field3640 > 500) {
                                                class202.field3640 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x2) == 2) {
                                                    class168.field3025 += field1917;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class48.field925 += class273.field4831;
                                                }
                                                if ((var68 & 0x4) == 4) {
                                                    class122.field2400 += class223.field4071;
                                                }
                                            }
                                            if (class48.field925 < -50) {
                                                class273.field4831 = 2;
                                            }
                                            if (class39.field664 > 500) {
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x2) == 2) {
                                                    class132.field2523 += class285.field5035;
                                                }
                                                class39.field664 = 0;
                                                if ((var69 & 0x1) == 1) {
                                                    class54.field1066 += class28.field520;
                                                }
                                            }
                                            if (class168.field3025 < -55) {
                                                field1917 = 2;
                                            }
                                            if (class132.field2523 < -20) {
                                                class285.field5035 = 1;
                                            }
                                            if (class132.field2523 > 10) {
                                                class285.field5035 = -1;
                                            }
                                            class153.field2781++;
                                            if (class48.field925 > 50) {
                                                class273.field4831 = -2;
                                            }
                                            if (class168.field3025 > 55) {
                                                field1917 = -2;
                                            }
                                            if (class122.field2400 < -40) {
                                                class223.field4071 = 1;
                                            }
                                            if (class122.field2400 > 40) {
                                                class223.field4071 = -1;
                                            }
                                            if (class54.field1066 < -60) {
                                                class28.field520 = 2;
                                            }
                                            if (class54.field1066 > 60) {
                                                class28.field520 = -2;
                                            }
                                            if (class153.field2781 > 50) {
                                                class84.field1677.method287((byte) 127, 106);
                                                class22.field423++;
                                            }
                                            if (class6.field78) {
                                                class272.method1856(111);
                                                class6.field78 = false;
                                            }
                                            try {
                                                if (class193.field3488 != null && class84.field1677.field2085 > 0) {
                                                    class193.field3488.method1921(class84.field1677.field2108, class84.field1677.field2085, arg0 ^ 0xFFFF8196, 0);
                                                    class153.field2781 = 0;
                                                    class84.field1677.field2085 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var70) {
                                                class64.method475(50);
                                                return;
                                            }
                                        }
                                        var59 = var58.field4143;
                                        if (var59.field721 < 0) {
                                            break;
                                        }
                                        var60 = class247.method1719(var59.field710, arg0 - 8667);
                                    } while (var60 == null || var60.field762 == null || var60.field762.length <= var59.field721 || var60.field762[var59.field721] != var59);
                                    class147.method1021(var58, 200000);
                                }
                            }
                            var56 = var55.field4143;
                            if (var56.field721 < 0) {
                                break;
                            }
                            var57 = class247.method1719(var56.field710, -8667);
                        } while (var57 == null || var57.field762 == null || var56.field721 >= var57.field762.length || var57.field762[var56.field721] != var56);
                        class147.method1021(var55, 200000);
                    }
                }
                var53 = var52.field4143;
                if (var53.field721 < 0) {
                    break;
                }
                var54 = class247.method1719(var53.field710, -8667);
            } while (var54 == null || var54.field762 == null || var53.field721 >= var54.field762.length || var54.field762[var53.field721] != var53);
            class147.method1021(var52, arg0 + 200000);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
    public static final boolean method689(boolean arg0) {
        field1922++;
        if (class181.field3284) {
            try {
                class92.field1832.method1463(class230.field4187.field2638, (byte) 110);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (!arg0) {
            field1921 = 112;
        }
        return false;
    }
}
