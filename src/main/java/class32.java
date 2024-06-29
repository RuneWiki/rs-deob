import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field863 = -1;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lic;")
    public static class59 field852 = class59.method433(0, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lic;")
    public static class59 field858 = class59.method433(0, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lic;")
    public static class59 field870 = class59.method433(0, "(Y");

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lic;")
    public static class59 field855 = class59.method433(0, "Hidden)2use");

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field867 = 0;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field873 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field861;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ldd;")
    public static class26 field854;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Ldd;")
    public static class26 field869;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lka;")
    public class70 field857;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lne;")
    public static class95 field851;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII[Lwf;)V")
    public static final void method252(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class159[] arg8) {
        field866++;
        for (int var9 = arg1; var9 < arg8.length; var9++) {
            class159 var10 = arg8[var9];
            if (var10 != null && (!var10.field3596 || var10.field3612 == 0 || var10.field3534 || class112.method915(var10, -2042430560) != 0 || class17.field329 == var10) && var10.field3660 == arg4 && (!var10.field3596 || !class5.method28(-1, var10))) {
                int var11 = var10.field3524 + arg7;
                int var12 = var10.field3544 + arg5;
                if (class102.field2492 == var10) {
                    class75.field1851 = var11;
                    class44.field1129 = var12;
                    class61.field1556 = true;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field3612 == 2) {
                    var13 = arg3;
                    var14 = arg6;
                    var15 = arg0;
                    var16 = arg2;
                } else if (var10.field3612 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var10.field3549 + var12;
                    int var20 = var10.field3629 + var11;
                    if (var11 > var20) {
                        var17 = var20;
                        var20 = var11;
                    }
                    if (var19 < var12) {
                        var18 = var19;
                        var19 = var12;
                    }
                    var20++;
                    var19++;
                    var14 = var19 < arg6 ? var19 : arg6;
                    var13 = var17 <= arg3 ? arg3 : var17;
                    var16 = var18 > arg2 ? var18 : arg2;
                    var15 = var20 < arg0 ? var20 : arg0;
                } else {
                    var16 = var12 > arg2 ? var12 : arg2;
                    int var23 = var10.field3629 + var11;
                    var13 = var11 > arg3 ? var11 : arg3;
                    int var24 = var10.field3549 + var12;
                    var15 = arg0 <= var23 ? arg0 : var23;
                    var14 = arg6 <= var24 ? arg6 : var24;
                }
                if (!var10.field3596 || var15 > var13 && var14 > var16) {
                    if (var10.field3610 == 1337) {
                        class42.method320(false, var10);
                    } else if (var10.field3610 == 1338) {
                        class121.method941(var11, -1, var12);
                    } else {
                        if (var10.field3612 == 0) {
                            if (!var10.field3596 && class5.method28(-1, var10) && class17.field343 != var10) {
                                continue;
                            }
                            method252(var15, 0, var16, var13, var10.field3573, var12 - var10.field3538, var14, var11 - var10.field3555, arg8);
                            if (var10.field3598 != null) {
                                method252(var15, 0, var16, var13, var10.field3573, var12 - var10.field3538, var14, var11 - var10.field3555, var10.field3598);
                            }
                            class41 var25 = (class41) class33.field889.method35((long) var10.field3573, 105);
                            if (var25 != null) {
                                class27.method207(var12, arg1 ^ 0x63, var11, var14, var15, var25.field1044, var16, var13);
                            }
                        }
                        if (var10.field3596) {
                            boolean var26;
                            if (class16.field325 >= var13 && class145.field3166 >= var16 && var15 > class16.field325 && var14 > class145.field3166) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class159.field3667 == 1 && var26) {
                                var28 = true;
                            }
                            if (class41.field1065 == 1 && var13 <= class3.field68 && var16 <= class81.field2005 && class3.field68 < var15 && class81.field2005 < var14) {
                                var27 = true;
                            }
                            if (var27) {
                                class157.method1160(var10, class81.field2005 - var12, true, class3.field68 - var11);
                            }
                            if (class102.field2492 != null && class102.field2492 != var10 && var26 && class126.method963(-1, class112.method915(var10, arg1 - 2042430560))) {
                                class126.field2864 = var10;
                            }
                            if (class17.field329 == var10) {
                                class128.field2894 = var11;
                                class55.field1346 = var12;
                                class26.field668 = true;
                            }
                            if (var10.field3534) {
                                if (var26 && class154.field3352 != 0 && var10.field3599 != null) {
                                    class139 var29 = new class139();
                                    var29.field3104 = var10;
                                    var29.field3103 = class154.field3352;
                                    var29.field3096 = var10.field3599;
                                    class153.field3313.method689(var29, (byte) 19);
                                }
                                if (class102.field2492 != null || class136.field3039 != null || class98.field2440) {
                                    var26 = false;
                                    var27 = false;
                                    var28 = false;
                                }
                                if (!var10.field3586 && var27) {
                                    var10.field3586 = true;
                                    if (var10.field3529 != null) {
                                        class139 var30 = new class139();
                                        var30.field3090 = class3.field68 - var11;
                                        var30.field3096 = var10.field3529;
                                        var30.field3104 = var10;
                                        var30.field3103 = class81.field2005 - var12;
                                        class153.field3313.method689(var30, (byte) -128);
                                    }
                                }
                                if (var10.field3586 && var28 && var10.field3581 != null) {
                                    class139 var31 = new class139();
                                    var31.field3096 = var10.field3581;
                                    var31.field3103 = class145.field3166 - var12;
                                    var31.field3104 = var10;
                                    var31.field3090 = class16.field325 - var11;
                                    class153.field3313.method689(var31, (byte) -123);
                                }
                                if (var10.field3586 && !var28) {
                                    var10.field3586 = false;
                                    if (var10.field3579 != null) {
                                        class139 var32 = new class139();
                                        var32.field3096 = var10.field3579;
                                        var32.field3104 = var10;
                                        var32.field3090 = class16.field325 - var11;
                                        var32.field3103 = class145.field3166 - var12;
                                        class46.field1171.method689(var32, (byte) 52);
                                    }
                                }
                                if (var28 && var10.field3619 != null) {
                                    class139 var33 = new class139();
                                    var33.field3103 = class145.field3166 - var12;
                                    var33.field3104 = var10;
                                    var33.field3090 = class16.field325 - var11;
                                    var33.field3096 = var10.field3619;
                                    class153.field3313.method689(var33, (byte) -126);
                                }
                                if (!var10.field3595 && var26) {
                                    var10.field3595 = true;
                                    if (var10.field3661 != null) {
                                        class139 var34 = new class139();
                                        var34.field3104 = var10;
                                        var34.field3090 = class16.field325 - var11;
                                        var34.field3103 = class145.field3166 - var12;
                                        var34.field3096 = var10.field3661;
                                        class153.field3313.method689(var34, (byte) 4);
                                    }
                                }
                                if (var10.field3595 && var26 && var10.field3526 != null) {
                                    class139 var35 = new class139();
                                    var35.field3090 = class16.field325 - var11;
                                    var35.field3104 = var10;
                                    var35.field3103 = class145.field3166 - var12;
                                    var35.field3096 = var10.field3526;
                                    class153.field3313.method689(var35, (byte) -26);
                                }
                                if (var10.field3595 && !var26) {
                                    var10.field3595 = false;
                                    if (var10.field3580 != null) {
                                        class139 var36 = new class139();
                                        var36.field3103 = class145.field3166 - var12;
                                        var36.field3104 = var10;
                                        var36.field3096 = var10.field3580;
                                        var36.field3090 = class16.field325 - var11;
                                        class46.field1171.method689(var36, (byte) 53);
                                    }
                                }
                                if (var10.field3571 != null) {
                                    class139 var37 = new class139();
                                    var37.field3104 = var10;
                                    var37.field3096 = var10.field3571;
                                    class53.field1307.method689(var37, (byte) -124);
                                }
                                if (var10.field3556 != null && var10.field3560 < class153.field3324) {
                                    if (var10.field3569 == null || class153.field3324 - var10.field3560 > 32) {
                                        class139 var42 = new class139();
                                        var42.field3104 = var10;
                                        var42.field3096 = var10.field3556;
                                        class153.field3313.method689(var42, (byte) 99);
                                    } else {
                                        label374: for (int var38 = var10.field3560; var38 < class153.field3324; var38++) {
                                            int var39 = class86.field2154[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field3569.length; var40++) {
                                                if (var10.field3569[var40] == var39) {
                                                    class139 var41 = new class139();
                                                    var41.field3104 = var10;
                                                    var41.field3096 = var10.field3556;
                                                    class153.field3313.method689(var41, (byte) 43);
                                                    break label374;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3560 = class153.field3324;
                                }
                                if (var10.field3605 != null && var10.field3632 < class86.field2166) {
                                    if (var10.field3588 == null || class86.field2166 - var10.field3632 > 32) {
                                        class139 var47 = new class139();
                                        var47.field3104 = var10;
                                        var47.field3096 = var10.field3605;
                                        class153.field3313.method689(var47, (byte) -48);
                                    } else {
                                        label354: for (int var43 = var10.field3632; var43 < class86.field2166; var43++) {
                                            int var44 = class126.field2862[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field3588.length; var45++) {
                                                if (var10.field3588[var45] == var44) {
                                                    class139 var46 = new class139();
                                                    var46.field3104 = var10;
                                                    var46.field3096 = var10.field3605;
                                                    class153.field3313.method689(var46, (byte) -47);
                                                    break label354;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3632 = class86.field2166;
                                }
                                if (var10.field3570 != null && var10.field3628 < class41.field1059) {
                                    if (var10.field3656 == null || class41.field1059 - var10.field3628 > 32) {
                                        class139 var52 = new class139();
                                        var52.field3096 = var10.field3570;
                                        var52.field3104 = var10;
                                        class153.field3313.method689(var52, (byte) -124);
                                    } else {
                                        label334: for (int var48 = var10.field3628; var48 < class41.field1059; var48++) {
                                            int var49 = class85.field2126[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field3656.length; var50++) {
                                                if (var10.field3656[var50] == var49) {
                                                    class139 var51 = new class139();
                                                    var51.field3096 = var10.field3570;
                                                    var51.field3104 = var10;
                                                    class153.field3313.method689(var51, (byte) -128);
                                                    break label334;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3628 = class41.field1059;
                                }
                                if (var10.field3539 < class55.field1360 && var10.field3643 != null) {
                                    class139 var53 = new class139();
                                    var53.field3104 = var10;
                                    var53.field3096 = var10.field3643;
                                    class153.field3313.method689(var53, (byte) -127);
                                }
                                if (class127.field2884 > var10.field3539 && var10.field3591 != null) {
                                    class139 var54 = new class139();
                                    var54.field3096 = var10.field3591;
                                    var54.field3104 = var10;
                                    class153.field3313.method689(var54, (byte) -127);
                                }
                                if (class31.field821 > var10.field3539 && var10.field3633 != null) {
                                    class139 var55 = new class139();
                                    var55.field3096 = var10.field3633;
                                    var55.field3104 = var10;
                                    class153.field3313.method689(var55, (byte) 84);
                                }
                                if (var10.field3539 < class137.field3053 && var10.field3545 != null) {
                                    class139 var56 = new class139();
                                    var56.field3096 = var10.field3545;
                                    var56.field3104 = var10;
                                    class153.field3313.method689(var56, (byte) 88);
                                }
                                var10.field3539 = class94.field2400;
                                if (var10.field3575 != null) {
                                    for (int var57 = 0; var57 < class116.field2725; var57++) {
                                        class139 var58 = new class139();
                                        var58.field3104 = var10;
                                        var58.field3102 = class35.field928[var57];
                                        var58.field3108 = class40.field1010[var57];
                                        var58.field3096 = var10.field3575;
                                        class153.field3313.method689(var58, (byte) 78);
                                    }
                                }
                            }
                        }
                        if (!var10.field3596) {
                            if (class102.field2492 != null || class136.field3039 != null || class98.field2440) {
                                return;
                            }
                            if ((var10.field3594 >= 0 || var10.field3669 != 0) && class16.field325 >= var13 && class145.field3166 >= var16 && var15 > class16.field325 && class145.field3166 < var14) {
                                if (var10.field3594 < 0) {
                                    class17.field343 = var10;
                                } else {
                                    class17.field343 = arg8[var10.field3594];
                                }
                            }
                            if (var10.field3612 == 8 && class16.field325 >= var13 && class145.field3166 >= var16 && class16.field325 < var15 && var14 > class145.field3166) {
                                class147.field3191 = var10;
                            }
                            if (var10.field3623 > var10.field3549) {
                                class46.method356(var10.field3623, var10.field3549, class145.field3166, var10, arg1 ^ 0x7F, var12, class16.field325, var10.field3629 + var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[Lic;)Lic;")
    public static final class59 method253(int arg0, int arg1, int arg2, class59[] arg3) {
        int var4 = -104 / ((arg0 + 20) / 49);
        field859++;
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            if (arg3[arg1 + var6] == null) {
                arg3[arg1 + var6] = class46.field1189;
            }
            var5 += arg3[arg1 + var6].field1418;
        }
        byte[] var7 = new byte[var5];
        int var8 = 0;
        for (int var9 = 0; var9 < arg2; var9++) {
            class59 var11 = arg3[arg1 + var9];
            class105.method818(var11.field1448, 0, var7, var8, var11.field1418);
            var8 += var11.field1418;
        }
        class59 var10 = new class59();
        var10.field1448 = var7;
        var10.field1418 = var5;
        return var10;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lwf;BLic;)Lic;")
    public static final class59 method254(class159 arg0, byte arg1, class59 arg2) {
        int var3 = 97 % ((68 - arg1) / 55);
        field864++;
        if (arg2.method435(class29.field761, -15730) == -1) {
            return arg2;
        }
        while (true) {
            int var4 = arg2.method435(class42.field1087, -15730);
            if (var4 == -1) {
                while (true) {
                    int var5 = arg2.method435(class18.field360, -15730);
                    if (var5 == -1) {
                        while (true) {
                            int var6 = arg2.method435(class38.field992, -15730);
                            if (var6 == -1) {
                                while (true) {
                                    int var7 = arg2.method435(class53.field1322, -15730);
                                    if (var7 == -1) {
                                        while (true) {
                                            int var8 = arg2.method435(class116.field2730, -15730);
                                            if (var8 == -1) {
                                                while (true) {
                                                    int var9 = arg2.method435(class152.field3303, -15730);
                                                    if (var9 == -1) {
                                                        return arg2;
                                                    }
                                                    class59 var10 = class38.field1000;
                                                    if (class63.field1621 != null) {
                                                        var10 = class95.method784((byte) 98, class63.field1621.field256);
                                                        try {
                                                            if (class63.field1621.field254 != null) {
                                                                byte[] var11 = ((String) class63.field1621.field254).getBytes("ISO-8859-1");
                                                                var10 = class95.method783(var11.length, 0, 92, var11);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var9, 0), var10, arg2.method452(-805469788, var9 + 4) }, (byte) -75);
                                                }
                                            }
                                            arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var8, 0), class134.method1035(class116.method930(arg0, 4, 0), (byte) -62), arg2.method452(-805469788, var8 + 2) }, (byte) -75);
                                        }
                                    }
                                    arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var7, 0), class134.method1035(class116.method930(arg0, 3, 0), (byte) -56), arg2.method452(-805469788, var7 + 2) }, (byte) -75);
                                }
                            }
                            arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var6, 0), class134.method1035(class116.method930(arg0, 2, 0), (byte) -103), arg2.method452(-805469788, var6 + 2) }, (byte) -75);
                        }
                    }
                    arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var5, 0), class134.method1035(class116.method930(arg0, 1, 0), (byte) -100), arg2.method452(-805469788, var5 + 2) }, (byte) -75);
                }
            }
            arg2 = class46.method358(new class59[] { arg2.method427((byte) 41, var4, 0), class134.method1035(class116.method930(arg0, 0, 0), (byte) -81), arg2.method452(-805469788, var4 + 2) }, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
    public static final void method255(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
            for (int var6 = arg4; var6 <= arg0 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class126.field2868[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class26.field695[0][var6][var5] = class26.field695[0][var6 - 1][var5];
                    }
                    if (arg4 + arg0 == var6 && var6 < 103) {
                        class26.field695[0][var6][var5] = class26.field695[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class26.field695[0][var6][var5] = class26.field695[0][var6][var5 - 1];
                    }
                    if (arg1 + arg2 == var5 && var5 < 103) {
                        class26.field695[0][var6][var5] = class26.field695[0][var6][var5 + 1];
                    }
                }
            }
        }
        field874++;
        if (arg3 != 0) {
            method256((byte) -89);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
    public static final boolean method256(byte arg0) {
        field853++;
        if (class102.field2491 == null) {
            return false;
        }
        try {
            int var1 = class102.field2491.method305((byte) 107);
            if (var1 == 0) {
                return false;
            }
            if (field873 == -1) {
                var1--;
                class102.field2491.method309(0, (byte) 38, 1, class10.field213.field3473);
                class10.field213.field3457 = 0;
                field873 = class10.field213.method1074(-24234);
                class34.field914 = class83.field2063[field873];
            }
            if (arg0 != 59) {
                field851 = null;
            }
            if (class34.field914 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class102.field2491.method309(0, (byte) 123, 1, class10.field213.field3473);
                class34.field914 = class10.field213.field3473[0] & 0xFF;
            }
            if (class34.field914 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class102.field2491.method309(0, (byte) 39, 2, class10.field213.field3473);
                class10.field213.field3457 = 0;
                class34.field914 = class10.field213.method1161((byte) 60);
            }
            if (class34.field914 > var1) {
                return false;
            }
            class10.field213.field3457 = 0;
            class102.field2491.method309(0, (byte) 109, class34.field914, class10.field213.field3473);
            class30.field769 = class82.field2040;
            class82.field2040 = class53.field1312;
            class153.field3314 = 0;
            class53.field1312 = field873;
            if (field873 == 19) {
                class59 var2 = class10.field213.method1214((byte) -46);
                if (var2.method457(class139.field3091, (byte) 52)) {
                    boolean var3 = false;
                    class59 var4 = var2.method427((byte) 41, var2.method435(class75.field1854, arg0 - 15789), 0);
                    long var5 = var4.method447(12074);
                    for (int var7 = 0; var7 < class76.field1863; var7++) {
                        if (class5.field110[var7] == var5) {
                            var3 = true;
                            break;
                        }
                    }
                    if (!var3 && class10.field217 == 0) {
                        class127.method972(class52.field1301, var4, 4, arg0 + 25959);
                    }
                } else if (var2.method457(class33.field896, (byte) 52)) {
                    class59 var22 = var2.method427((byte) 41, var2.method435(class75.field1854, arg0 ^ 0xFFFFC2B5), 0);
                    boolean var23 = false;
                    long var24 = var22.method447(12074);
                    for (int var26 = 0; var26 < class76.field1863; var26++) {
                        if (class5.field110[var26] == var24) {
                            var23 = true;
                            break;
                        }
                    }
                    if (!var23 && class10.field217 == 0) {
                        class127.method972(class76.field1874, var22, 8, 26018);
                    }
                } else if (var2.method457(class61.field1563, (byte) 52)) {
                    class59 var8 = var2.method427((byte) 41, var2.method435(class75.field1854, -15730), 0);
                    boolean var9 = false;
                    long var10 = var8.method447(12074);
                    for (int var12 = 0; var12 < class76.field1863; var12++) {
                        if (class5.field110[var12] == var10) {
                            var9 = true;
                            break;
                        }
                    }
                    if (!var9 && class10.field217 == 0) {
                        class59 var13 = var2.method427((byte) 41, var2.method437((byte) 52) - 9, var2.method435(class75.field1854, arg0 + -15789) - -1);
                        class127.method972(var13, var8, 8, 26018);
                    }
                } else if (var2.method457(class89.field2267, (byte) 52)) {
                    class59 var17 = var2.method427((byte) 41, var2.method435(class75.field1854, -15730), 0);
                    long var18 = var17.method447(12074);
                    boolean var20 = false;
                    for (int var21 = 0; var21 < class76.field1863; var21++) {
                        if (class5.field110[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                    if (!var20 && class10.field217 == 0) {
                        class127.method972(class38.field1000, var17, 10, arg0 + 25959);
                    }
                } else if (var2.method457(class145.field3169, (byte) 52)) {
                    class59 var14 = var2.method427((byte) 41, var2.method435(class145.field3169, arg0 - 15789), 0);
                    class127.method972(var14, class38.field1000, 11, 26018);
                } else if (var2.method457(class143.field3155, (byte) 52)) {
                    class59 var16 = var2.method427((byte) 41, var2.method435(class143.field3155, -15730), 0);
                    if (class10.field217 == 0) {
                        class127.method972(var16, class38.field1000, 12, arg0 ^ 0x6599);
                    }
                } else if (var2.method457(class4.field84, (byte) 52)) {
                    class59 var15 = var2.method427((byte) 41, var2.method435(class4.field84, arg0 ^ 0xFFFFC2B5), 0);
                    if (class10.field217 == 0) {
                        class127.method972(var15, class38.field1000, 13, arg0 ^ 0x6599);
                    }
                } else {
                    class127.method972(var2, class38.field1000, 0, 26018);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 113) {
                boolean var27 = false;
                long var28 = class10.field213.method1186(false);
                int var30 = class10.field213.method1161((byte) 60);
                byte var31 = class10.field213.method1169((byte) 117);
                if ((var28 & Long.MIN_VALUE) != 0L) {
                    var27 = true;
                }
                if (var27) {
                    if (class43.field1097 == 0) {
                        field873 = -1;
                        return true;
                    }
                    long var32 = var28 & Long.MAX_VALUE;
                    boolean var34 = false;
                    int var35;
                    for (var35 = 0; var35 < class43.field1097 && (class26.field677[var35].field2736 != var32 || class26.field677[var35].field2512 != var30); var35++) {
                    }
                    if (class43.field1097 > var35) {
                        while (var35 < class43.field1097 - 1) {
                            class26.field677[var35] = class26.field677[var35 + 1];
                            var35++;
                        }
                        class43.field1097--;
                        class26.field677[class43.field1097] = null;
                    }
                } else {
                    class103 var36 = new class103();
                    var36.field2736 = var28;
                    var36.field2508 = class90.method744(arg0 - 22, var36.field2736);
                    var36.field2512 = var30;
                    var36.field2511 = var31;
                    int var37;
                    for (var37 = class43.field1097 - 1; var37 >= 0; var37--) {
                        int var38 = class26.field677[var37].field2508.method450(var36.field2508, (byte) -113);
                        if (var38 == 0) {
                            class26.field677[var37].field2512 = var30;
                            class26.field677[var37].field2511 = var31;
                            field873 = -1;
                            class31.field821 = class94.field2400;
                            if (class94.field2404 == var28) {
                                class134.field2973 = var31;
                            }
                            return true;
                        }
                        if (var38 < 0) {
                            break;
                        }
                    }
                    if (class43.field1097 >= class26.field677.length) {
                        field873 = -1;
                        return true;
                    }
                    for (int var39 = class43.field1097 - 1; var39 > var37; var39--) {
                        class26.field677[var39 + 1] = class26.field677[var39];
                    }
                    if (class43.field1097 == 0) {
                        class26.field677 = new class103[100];
                    }
                    class26.field677[var37 + 1] = var36;
                    if (class94.field2404 == var28) {
                        class134.field2973 = var31;
                    }
                    class43.field1097++;
                }
                field873 = -1;
                class31.field821 = class94.field2400;
                return true;
            }
            if (field873 == 218) {
                class19.field403 = class10.field213.method1194(false);
                field873 = -1;
                return true;
            }
            if (field873 == 36) {
                for (int var40 = 0; var40 < class85.field2124.length; var40++) {
                    if (class85.field2124[var40] != class65.field1651[var40]) {
                        class85.field2124[var40] = class65.field1651[var40];
                        class17.method89(var40, 0);
                        class86.field2154[class24.method156(31, class153.field3324++)] = var40;
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 252) {
                int var41 = class34.field914 + class10.field213.field3457;
                int var42 = class10.field213.method1161((byte) 60);
                int var43 = class10.field213.method1161((byte) 60);
                if (class126.field2866 != var42) {
                    class126.field2866 = var42;
                    class152.method1116(-2055025328, class126.field2866);
                    class99.method804(124, class126.field2866);
                    for (int var44 = 0; var44 < 100; var44++) {
                        class25.field628[var44] = true;
                    }
                }
                while (var43-- > 0) {
                    int var45 = class10.field213.method1175((byte) -108);
                    int var46 = class10.field213.method1161((byte) 60);
                    int var47 = class10.field213.method1194(false);
                    class41 var48 = (class41) class33.field889.method35((long) var45, 105);
                    if (var48 != null && var48.field1044 != var46) {
                        class47.method369(true, var48, 0);
                        var48 = null;
                    }
                    if (var48 == null) {
                        var48 = class52.method390(var47, var46, (byte) 83, var45);
                    }
                    var48.field1046 = true;
                }
                for (class41 var49 = (class41) class33.field889.method37(-1); var49 != null; var49 = (class41) class33.field889.method36(arg0 ^ 0xFFFFFFC4)) {
                    if (var49.field1046) {
                        var49.field1046 = false;
                    } else {
                        class47.method369(true, var49, 0);
                    }
                }
                class41.field1050 = new class7(512);
                while (var41 > class10.field213.field3457) {
                    int var50 = class10.field213.method1175((byte) -88);
                    int var51 = class10.field213.method1161((byte) 60);
                    int var52 = class10.field213.method1161((byte) 60);
                    int var53 = class10.field213.method1175((byte) -109);
                    for (int var54 = var51; var54 <= var52; var54++) {
                        long var55 = ((long) var50 << 32) + (long) var54;
                        class41.field1050.method38(new class18(var53), (byte) 106, var55);
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 27) {
                class86.method709(-95);
                class10.field225 = class10.field213.method1194(false);
                class137.field3053 = class94.field2400;
                field873 = -1;
                return true;
            }
            if (field873 == 173) {
                int var57 = class10.field213.method1183(arg0 ^ 0x73);
                class159 var58 = class134.method1032(var57, 499749840);
                for (int var59 = 0; var59 < var58.field3613.length; var59++) {
                    var58.field3613[var59] = -1;
                    var58.field3613[var59] = 0;
                }
                class42.method320(false, var58);
                field873 = -1;
                return true;
            }
            if (field873 == 33) {
                int var60 = class10.field213.method1175((byte) -105);
                class159 var61 = class134.method1032(var60, 499749840);
                var61.field3557 = 3;
                var61.field3593 = class159.field3650.field1247.method741(arg0 ^ 0x3A);
                class42.method320(false, var61);
                field873 = -1;
                return true;
            }
            if (field873 == 3) {
                class125.method956(class34.field914, 0, class102.field2497, class10.field213);
                field873 = -1;
                return true;
            }
            if (field873 == 56) {
                int var62 = class10.field213.method1173(false);
                int var63 = class10.field213.method1199(113);
                int var64 = class10.field213.method1170((byte) -23);
                class44.field1127 = var63 >> 1;
                class159.field3650.method549((byte) -24, (var63 & 0x1) == 1, var64, var62);
                field873 = -1;
                return true;
            }
            if (field873 == 130) {
                int var65 = class10.field213.method1194(false);
                int var66 = class10.field213.method1194(false);
                int var67 = class10.field213.method1194(false);
                int var68 = class10.field213.method1194(false);
                class90.field2281[var65] = true;
                class130.field2923[var65] = var66;
                class81.field2011[var65] = var67;
                class57.field1392[var65] = var68;
                class15.field302[var65] = 0;
                field873 = -1;
                return true;
            }
            if (field873 == 153) {
                class86.method709(arg0 - 155);
                int var69 = class10.field213.method1173(false);
                int var70 = class10.field213.method1167((byte) -65);
                int var71 = class10.field213.method1199(arg0 ^ 0x49);
                class91.field2328[var69] = var70;
                class100.field2468[var69] = var71;
                class138.field3078[var69] = 1;
                for (int var72 = 0; var72 < 98; var72++) {
                    if (class47.field1204[var72] <= var70) {
                        class138.field3078[var69] = var72 + 2;
                    }
                }
                class85.field2126[class24.method156(31, class41.field1059++)] = var69;
                field873 = -1;
                return true;
            }
            if (field873 == 138) {
                class34.field916 = class10.field213.method1173(false);
                class80.field1984 = class10.field213.method1170((byte) 120);
                field873 = -1;
                return true;
            }
            if (field873 == 45) {
                class77.field1887 = class10.field213.method1194(false);
                field873 = -1;
                class127.field2884 = class94.field2400;
                return true;
            }
            if (field873 == 136) {
                int var73 = class10.field213.method1183(104);
                int var74 = class10.field213.method1200((byte) 116);
                int var75 = class10.field213.method1180(-128);
                class159 var76 = class134.method1032(var73, arg0 + 499749781);
                var76.field3640 = (var75 << 16) + var74;
                field873 = -1;
                return true;
            }
            if (field873 == 65) {
                long var77 = class10.field213.method1186(false);
                class10.field213.method1169((byte) -48);
                long var79 = class10.field213.method1186(false);
                long var81 = (long) class10.field213.method1161((byte) 60);
                long var83 = (long) class10.field213.method1207((byte) 124);
                int var85 = class10.field213.method1194(false);
                boolean var86 = false;
                long var87 = (var81 << 32) + var83;
                for (int var89 = 0; var89 < 100; var89++) {
                    if (class139.field3093[var89] == var87) {
                        var86 = true;
                        break;
                    }
                }
                if (var85 <= 1) {
                    for (int var90 = 0; var90 < class76.field1863; var90++) {
                        if (class5.field110[var90] == var77) {
                            var86 = true;
                            break;
                        }
                    }
                }
                if (!var86 && class10.field217 == 0) {
                    class139.field3093[class106.field2541] = var87;
                    class106.field2541 = (class106.field2541 + 1) % 100;
                    class59 var91 = class156.method1150(class38.method292((byte) -95, class10.field213).method439((byte) 112));
                    if (var85 == 2 || var85 == 3) {
                        class55.method408(class90.method744(arg0 - 22, var79).method459(28452), 9, class46.method358(new class59[] { class8.field155, class90.method744(37, var77).method459(28452) }, (byte) -75), 21, var91);
                    } else if (var85 == 1) {
                        class55.method408(class90.method744(arg0 ^ 0x1E, var79).method459(28452), 9, class46.method358(new class59[] { class115.field2711, class90.method744(37, var77).method459(arg0 + 28393) }, (byte) -75), arg0 ^ 0x25, var91);
                    } else {
                        class55.method408(class90.method744(37, var79).method459(28452), 9, class90.method744(37, var77).method459(28452), arg0 ^ 0x69, var91);
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 97) {
                int var92 = class10.field213.method1211(false);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var93 = class10.field213.method1183(arg0 ^ 0x7F);
                int var94 = class10.field213.method1174((byte) -99);
                class159 var95 = class134.method1032(var94, 499749840);
                if (var95.field3596) {
                    var95.field3590 = var92;
                    var95.field3614 = var93;
                    class79 var96 = class7.method39(30996, var92);
                    var95.field3641 = var96.field1971;
                    var95.field3587 = var96.field1958;
                    var95.field3532 = var96.field1972;
                    var95.field3536 = var96.field1927;
                    var95.field3616 = var96.field1959;
                    var95.field3528 = var96.field1920;
                    if (var95.field3629 > 0) {
                        var95.field3528 = var95.field3528 * 32 / var95.field3629;
                    }
                    class42.method320(false, var95);
                } else if (var92 == -1) {
                    var95.field3557 = 0;
                    field873 = -1;
                    return true;
                } else {
                    class79 var97 = class7.method39(30996, var92);
                    var95.field3557 = 4;
                    var95.field3528 = var97.field1920 * 100 / var93;
                    var95.field3536 = var97.field1927;
                    var95.field3593 = var92;
                    var95.field3641 = var97.field1971;
                    class42.method320(false, var95);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 77) {
                int var98 = class10.field213.method1200((byte) 95);
                byte var99 = class10.field213.method1177(arg0 - 60);
                class65.field1651[var98] = var99;
                if (class85.field2124[var98] != var99) {
                    class85.field2124[var98] = var99;
                    class17.method89(var98, arg0 - 59);
                }
                class86.field2154[class24.method156(class153.field3324++, 31)] = var98;
                field873 = -1;
                return true;
            }
            if (field873 == 110) {
                long var100 = class10.field213.method1186(false);
                class59 var102 = class156.method1150(class38.method292((byte) -64, class10.field213).method439((byte) 124));
                class127.method972(var102, class90.method744(arg0 ^ 0x1E, var100).method459(28452), 6, 26018);
                field873 = -1;
                return true;
            }
            if (field873 == 159) {
                int var103 = class10.field213.method1200((byte) 111);
                int var104 = class10.field213.method1175((byte) -121);
                class159 var105 = class134.method1032(var104, arg0 + 499749781);
                if (var105.field3557 != 2 || var105.field3593 != var103) {
                    var105.field3593 = var103;
                    var105.field3557 = 2;
                    class42.method320(false, var105);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 61) {
                class76.field1863 = class34.field914 / 8;
                for (int var106 = 0; var106 < class76.field1863; var106++) {
                    class5.field110[var106] = class10.field213.method1186(false);
                    class87.field2201[var106] = class90.method744(37, class5.field110[var106]);
                }
                class127.field2884 = class94.field2400;
                field873 = -1;
                return true;
            }
            if (field873 == 60) {
                class10.method48((byte) -65);
                field873 = -1;
                return false;
            }
            if (field873 == 132) {
                int var107 = class10.field213.method1175((byte) -101);
                class41 var108 = (class41) class33.field889.method35((long) var107, arg0 ^ 0x52);
                if (var108 != null) {
                    class47.method369(true, var108, 0);
                }
                if (class151.field3287 != null) {
                    class42.method320(false, class151.field3287);
                    class151.field3287 = null;
                }
                field873 = -1;
                return true;
            }
            if (field873 == 160) {
                int var109 = class10.field213.method1180(-128);
                if (var109 == 65535) {
                    var109 = -1;
                }
                int var110 = class10.field213.method1175((byte) -123);
                int var111 = class10.field213.method1174((byte) -99);
                int var112 = class10.field213.method1161((byte) 60);
                if (var112 == 65535) {
                    var112 = -1;
                }
                for (int var113 = var109; var113 <= var112; var113++) {
                    long var114 = ((long) var111 << 32) + (long) var113;
                    class116 var116 = class41.field1050.method35(var114, arg0 ^ 0x52);
                    if (var116 != null) {
                        var116.method929(arg0 ^ 0x4C);
                    }
                    class41.field1050.method38(new class18(var110), (byte) 112, var114);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 204) {
                class65.method533(2864, true);
                field873 = -1;
                return true;
            }
            if (field873 == 125) {
                int var117 = class10.field213.method1161((byte) 60);
                int var118 = class10.field213.method1175((byte) -100);
                int var119 = class10.field213.method1170((byte) -67);
                class41 var120 = (class41) class33.field889.method35((long) var118, 105);
                if (var120 != null) {
                    class47.method369(var120.field1044 != var117, var120, 0);
                }
                class52.method390(var119, var117, (byte) 99, var118);
                field873 = -1;
                return true;
            }
            if (field873 == 152) {
                class65.method533(2864, false);
                field873 = -1;
                return true;
            }
            if (field873 == 148) {
                int var121 = class10.field213.method1211(false);
                if (var121 == 65535) {
                    var121 = -1;
                }
                class34.method266(arg0 ^ 0xFFFFFFC4, var121);
                field873 = -1;
                return true;
            }
            if (field873 == 83) {
                int var122 = class10.field213.method1200((byte) 84);
                int var123 = class10.field213.method1190(-4821);
                if (var122 == 65535) {
                    var122 = -1;
                }
                class143.method1063(var122, var123, true);
                field873 = -1;
                return true;
            }
            if (field873 == 119) {
                long var124 = class10.field213.method1186(false);
                long var126 = (long) class10.field213.method1161((byte) 60);
                long var128 = (long) class10.field213.method1207((byte) 124);
                int var130 = class10.field213.method1194(false);
                long var131 = (var126 << 32) + var128;
                boolean var133 = false;
                for (int var134 = 0; var134 < 100; var134++) {
                    if (class139.field3093[var134] == var131) {
                        var133 = true;
                        break;
                    }
                }
                if (var130 <= 1) {
                    for (int var135 = 0; var135 < class76.field1863; var135++) {
                        if (class5.field110[var135] == var124) {
                            var133 = true;
                            break;
                        }
                    }
                }
                if (!var133 && class10.field217 == 0) {
                    class139.field3093[class106.field2541] = var131;
                    class106.field2541 = (class106.field2541 + 1) % 100;
                    class59 var136 = class156.method1150(class38.method292((byte) -84, class10.field213).method439((byte) 89));
                    if (var130 == 2 || var130 == 3) {
                        class127.method972(var136, class46.method358(new class59[] { class8.field155, class90.method744(37, var124).method459(arg0 + 28393) }, (byte) -75), 7, 26018);
                    } else if (var130 == 1) {
                        class127.method972(var136, class46.method358(new class59[] { class115.field2711, class90.method744(37, var124).method459(28452) }, (byte) -75), 7, arg0 + 25959);
                    } else {
                        class127.method972(var136, class90.method744(37, var124).method459(28452), 3, 26018);
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 251) {
                class34.field916 = class10.field213.method1173(false);
                class80.field1984 = class10.field213.method1173(false);
                while (class34.field914 > class10.field213.field3457) {
                    field873 = class10.field213.method1194(false);
                    class19.method104(5);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 165) {
                class59 var137 = class10.field213.method1214((byte) -46);
                int var138 = class10.field213.method1194(false);
                int var139 = class10.field213.method1170((byte) 103);
                if (var139 >= 1 && var139 <= 8) {
                    if (var137.method423(class108.field2604, arg0 - 120)) {
                        var137 = null;
                    }
                    class22.field529[var139 - 1] = var137;
                    class42.field1088[var139 - 1] = var138 == 0;
                }
                field873 = -1;
                return true;
            }
            if (field873 == 30) {
                if (class126.field2866 != -1) {
                    class24.method152(-120, class126.field2866, 0);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 240) {
                class120.field2759 = class10.field213.method1180(arg0 ^ 0xFFFFFFBB) * 30;
                class137.field3053 = class94.field2400;
                field873 = -1;
                return true;
            }
            if (field873 == 163) {
                int var140 = class10.field213.method1211(false);
                class1.method5((byte) 90, var140);
                class126.field2862[class24.method156(31, class86.field2166++)] = class24.method156(var140, 32767);
                field873 = -1;
                return true;
            }
            if (field873 == 236) {
                class81.method663(24, class10.field213);
                field873 = -1;
                return true;
            }
            if (field873 == 146) {
                class40.method303((byte) -116);
                field873 = -1;
                return true;
            }
            if (field873 == 31) {
                int var141 = class10.field213.method1185(arg0 - 178);
                int var142 = class10.field213.method1216(117);
                int var143 = class10.field213.method1167((byte) -117);
                class159 var144 = class134.method1032(var143, 499749840);
                int var145 = var144.field3546 + var141;
                int var146 = var144.field3533 + var142;
                if (var144.field3524 != var145 || var144.field3544 != var146) {
                    var144.field3544 = var146;
                    var144.field3524 = var145;
                    class42.method320(false, var144);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 235) {
                int var147 = class10.field213.method1175((byte) -104);
                int var148 = class10.field213.method1161((byte) 60);
                class159 var149;
                if (var147 >= 0) {
                    var149 = class134.method1032(var147, 499749840);
                } else {
                    var149 = null;
                }
                if (var149 != null) {
                    for (int var150 = 0; var150 < var149.field3613.length; var150++) {
                        var149.field3613[var150] = 0;
                        var149.field3559[var150] = 0;
                    }
                }
                if (var147 < -70000) {
                    var148 += 32768;
                }
                class148.method1103(var148, -122);
                int var151 = class10.field213.method1161((byte) 60);
                for (int var152 = 0; var152 < var151; var152++) {
                    int var153 = class10.field213.method1199(-112);
                    if (var153 == 255) {
                        var153 = class10.field213.method1183(arg0 ^ 0x77);
                    }
                    int var154 = class10.field213.method1211(false);
                    if (var149 != null && var149.field3613.length > var152) {
                        var149.field3613[var152] = var154;
                        var149.field3559[var152] = var153;
                    }
                    class118.method938(0, var152, var154 - 1, var153, var148);
                }
                if (var149 != null) {
                    class42.method320(false, var149);
                }
                class86.method709(arg0 ^ 0xFFFFFFBF);
                class126.field2862[class24.method156(class86.field2166++, 31)] = class24.method156(var148, 32767);
                field873 = -1;
                return true;
            }
            if (field873 == 16) {
                int var155 = class10.field213.method1175((byte) -91);
                int var156 = class10.field213.method1161((byte) 60);
                class159 var157;
                if (var155 < 0) {
                    var157 = null;
                } else {
                    var157 = class134.method1032(var155, 499749840);
                }
                if (var155 < -70000) {
                    var156 += 32768;
                }
                while (class10.field213.field3457 < class34.field914) {
                    int var158 = class10.field213.method1171(-32768);
                    int var159 = 0;
                    int var160 = class10.field213.method1161((byte) 60);
                    if (var160 != 0) {
                        var159 = class10.field213.method1194(false);
                        if (var159 == 255) {
                            var159 = class10.field213.method1175((byte) -111);
                        }
                    }
                    if (var157 != null && var158 >= 0 && var157.field3613.length > var158) {
                        var157.field3613[var158] = var160;
                        var157.field3559[var158] = var159;
                    }
                    class118.method938(0, var158, var160 - 1, var159, var156);
                }
                if (var157 != null) {
                    class42.method320(false, var157);
                }
                class86.method709(-118);
                class126.field2862[class24.method156(31, class86.field2166++)] = class24.method156(32767, var156);
                field873 = -1;
                return true;
            }
            if (field873 == 223 || field873 == 53 || field873 == 179 || field873 == 177 || field873 == 168 || field873 == 40 || field873 == 174 || field873 == 137 || field873 == 96 || field873 == 147 || field873 == 201) {
                class19.method104(5);
                field873 = -1;
                return true;
            }
            if (field873 == 79) {
                int var161 = class10.field213.method1174((byte) -99);
                int var162 = class10.field213.method1217((byte) -65);
                class159 var163 = class134.method1032(var161, 499749840);
                if (var163.field3611 != var162 || var162 == -1) {
                    var163.field3637 = 0;
                    var163.field3611 = var162;
                    var163.field3615 = 0;
                    class42.method320(false, var163);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 188) {
                class1.field28 = class10.field213.method1194(false);
                if (class1.field28 == 1) {
                    class95.field2413 = class10.field213.method1161((byte) 60);
                }
                if (class1.field28 >= 2 && class1.field28 <= 6) {
                    if (class1.field28 == 2) {
                        class99.field2454 = 64;
                        class30.field782 = 64;
                    }
                    if (class1.field28 == 3) {
                        class99.field2454 = 64;
                        class30.field782 = 0;
                    }
                    if (class1.field28 == 4) {
                        class30.field782 = 128;
                        class99.field2454 = 64;
                    }
                    if (class1.field28 == 5) {
                        class99.field2454 = 0;
                        class30.field782 = 64;
                    }
                    if (class1.field28 == 6) {
                        class99.field2454 = 128;
                        class30.field782 = 64;
                    }
                    class1.field28 = 2;
                    class73.field1831 = class10.field213.method1161((byte) 60);
                    class158.field3487 = class10.field213.method1161((byte) 60);
                    class80.field1998 = class10.field213.method1194(false);
                }
                if (class1.field28 == 10) {
                    class159.field3665 = class10.field213.method1161((byte) 60);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 51) {
                int var164 = class10.field213.method1211(false);
                int var165 = class10.field213.method1167((byte) -91);
                class65.field1651[var164] = var165;
                if (class85.field2124[var164] != var165) {
                    class85.field2124[var164] = var165;
                    class17.method89(var164, arg0 ^ 0x3B);
                }
                class86.field2154[class24.method156(31, class153.field3324++)] = var164;
                field873 = -1;
                return true;
            }
            if (field873 == 183) {
                class59 var166 = class10.field213.method1214((byte) -46);
                Object[] var167 = new Object[var166.method437((byte) 52) + 1];
                for (int var168 = var166.method437((byte) 52) - 1; var168 >= 0; var168--) {
                    if (var166.method425((byte) 105, var168) == 115) {
                        var167[var168 + 1] = class10.field213.method1214((byte) -46);
                    } else {
                        var167[var168 + 1] = Integer.valueOf(class10.field213.method1175((byte) -128));
                    }
                }
                var167[0] = Integer.valueOf(class10.field213.method1175((byte) -103));
                class139 var169 = new class139();
                var169.field3096 = var167;
                class125.method948(var169, -30164);
                field873 = -1;
                return true;
            }
            if (field873 == 74) {
                long var170 = class10.field213.method1186(false);
                int var172 = class10.field213.method1161((byte) 60);
                int var173 = class10.field213.method1194(false);
                class59 var174 = class90.method744(arg0 - 22, var170).method459(28452);
                for (int var175 = 0; var175 < class65.field1649; var175++) {
                    if (class84.field2114[var175] == var170) {
                        if (class90.field2284[var175] != var172) {
                            class90.field2284[var175] = var172;
                            if (var172 > 0) {
                                class127.method972(class46.method358(new class59[] { var174, class49.field1234 }, (byte) -75), class38.field1000, 5, arg0 ^ 0x6599);
                            }
                            if (var172 == 0) {
                                class127.method972(class46.method358(new class59[] { var174, class112.field2686 }, (byte) -75), class38.field1000, 5, arg0 + 25959);
                            }
                        }
                        var174 = null;
                        class23.field537[var175] = var173;
                        break;
                    }
                }
                if (var174 != null && class65.field1649 < 200) {
                    class84.field2114[class65.field1649] = var170;
                    class102.field2486[class65.field1649] = var174;
                    class90.field2284[class65.field1649] = var172;
                    class23.field537[class65.field1649] = var173;
                    class65.field1649++;
                }
                boolean var176 = false;
                int var177 = class65.field1649;
                class127.field2884 = class94.field2400;
                while (var177 > 0) {
                    var177--;
                    boolean var178 = true;
                    for (int var179 = 0; var179 < var177; var179++) {
                        if (class90.field2284[var179] != class9.field179 && class90.field2284[var179 + 1] == class9.field179 || class90.field2284[var179] == 0 && class90.field2284[var179 + 1] != 0) {
                            var178 = false;
                            int var180 = class90.field2284[var179];
                            class90.field2284[var179] = class90.field2284[var179 + 1];
                            class90.field2284[var179 + 1] = var180;
                            class59 var181 = class102.field2486[var179];
                            class102.field2486[var179] = class102.field2486[var179 + 1];
                            class102.field2486[var179 + 1] = var181;
                            long var182 = class84.field2114[var179];
                            class84.field2114[var179] = class84.field2114[var179 + 1];
                            class84.field2114[var179 + 1] = var182;
                            int var184 = class23.field537[var179];
                            class23.field537[var179] = class23.field537[var179 + 1];
                            class23.field537[var179 + 1] = var184;
                        }
                    }
                    if (var178) {
                        break;
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 195) {
                int var185 = class10.field213.method1167((byte) -86);
                class59 var186 = class10.field213.method1214((byte) -46);
                class159 var187 = class134.method1032(var185, 499749840);
                if (!var186.method421(var187.field3624, false)) {
                    var187.field3624 = var186;
                    class42.method320(false, var187);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 69) {
                class131.field2943 = class10.field213.method1194(false);
                class138.field3086 = class10.field213.method1194(false);
                class43.field1098 = class10.field213.method1194(false);
                field873 = -1;
                return true;
            }
            if (field873 == 145) {
                class34.field916 = class10.field213.method1194(false);
                class80.field1984 = class10.field213.method1173(false);
                for (int var188 = class80.field1984; var188 < class80.field1984 + 8; var188++) {
                    for (int var189 = class34.field916; var189 < class34.field916 + 8; var189++) {
                        if (class23.field563[class44.field1127][var188][var189] != null) {
                            class23.field563[class44.field1127][var188][var189] = null;
                            class70.method554((byte) -114, var188, var189);
                        }
                    }
                }
                for (class118 var190 = (class118) class22.field525.method682(0); var190 != null; var190 = (class118) class22.field525.method684((byte) -65)) {
                    if (var190.field2739 >= class80.field1984 && class80.field1984 + 8 > var190.field2739 && class34.field916 <= var190.field2751 && var190.field2751 < class34.field916 + 8 && class44.field1127 == var190.field2747) {
                        var190.field2741 = 0;
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 225) {
                class131.field2942 = true;
                class65.field1654 = class10.field213.method1194(false);
                class121.field2782 = class10.field213.method1194(false);
                class137.field3057 = class10.field213.method1161((byte) 60);
                class116.field2727 = class10.field213.method1194(false);
                class17.field340 = class10.field213.method1194(false);
                if (class17.field340 >= 100) {
                    class51.field1271 = class65.field1654 * 128 + 64;
                    class15.field295 = class121.field2782 * 128 + 64;
                    class134.field2989 = class147.method1095((byte) 30, class15.field295, class44.field1127, class51.field1271) - class137.field3057;
                }
                field873 = -1;
                return true;
            }
            if (field873 == 116) {
                for (int var191 = 0; var191 < class91.field2323.length; var191++) {
                    if (class91.field2323[var191] != null) {
                        class91.field2323[var191].field1685 = -1;
                    }
                }
                for (int var192 = 0; var192 < class47.field1210.length; var192++) {
                    if (class47.field1210[var192] != null) {
                        class47.field1210[var192].field1685 = -1;
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 209) {
                class131.field2942 = true;
                class106.field2531 = class10.field213.method1194(false);
                class127.field2881 = class10.field213.method1194(false);
                class51.field1276 = class10.field213.method1161((byte) 60);
                class100.field2474 = class10.field213.method1194(false);
                class153.field3306 = class10.field213.method1194(false);
                if (class153.field3306 >= 100) {
                    int var193 = class106.field2531 * 128 + 64;
                    int var194 = class127.field2881 * 128 + 64;
                    int var195 = class147.method1095((byte) 30, var194, class44.field1127, var193) - class51.field1276;
                    int var196 = var195 - class134.field2989;
                    int var197 = var193 - class51.field1271;
                    int var198 = var194 - class15.field295;
                    int var199 = (int) Math.sqrt((double) (var197 * var197 + var198 * var198));
                    class26.field672 = (int) (Math.atan2((double) var196, (double) var199) * 325.949D) & 0x7FF;
                    client.field495 = (int) (Math.atan2((double) var197, (double) var198) * -325.949D) & 0x7FF;
                    if (class26.field672 < 128) {
                        class26.field672 = 128;
                    }
                    if (class26.field672 > 383) {
                        class26.field672 = 383;
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 55) {
                int var200 = class10.field213.method1161((byte) 60);
                int var201 = class10.field213.method1194(false);
                int var202 = class10.field213.method1161((byte) 60);
                class8.method42(var201, var200, false, var202);
                field873 = -1;
                return true;
            }
            if (field873 == 143) {
                class131.field2942 = false;
                for (int var203 = 0; var203 < 5; var203++) {
                    class90.field2281[var203] = false;
                }
                field873 = -1;
                return true;
            }
            if (field873 == 111) {
                int var204 = class10.field213.method1167((byte) -63);
                class63.field1621 = class102.field2497.method536((byte) -51, var204);
                field873 = -1;
                return true;
            }
            if (field873 == 215) {
                class88.field2213 = 0;
                field873 = -1;
                return true;
            }
            if (field873 == 76) {
                int var205 = class10.field213.method1174((byte) -99);
                int var206 = class10.field213.method1200((byte) 99);
                int var207 = var206 >> 5 & 0x1F;
                int var208 = var206 >> 10 & 0x1F;
                int var209 = var206 & 0x1F;
                int var210 = (var208 << 19) - (-(var207 << 11) - (var209 << 3));
                class159 var211 = class134.method1032(var205, 499749840);
                if (var211.field3548 != var210) {
                    var211.field3548 = var210;
                    class42.method320(false, var211);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 198) {
                int var212 = class10.field213.method1211(false);
                int var213 = class10.field213.method1180(-128);
                int var214 = class10.field213.method1211(false);
                int var215 = class10.field213.method1167((byte) -127);
                class159 var216 = class134.method1032(var215, arg0 + 499749781);
                if (var216.field3536 != var213 || var216.field3641 != var214 || var216.field3528 != var212) {
                    var216.field3641 = var214;
                    var216.field3536 = var213;
                    var216.field3528 = var212;
                    class42.method320(false, var216);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 4) {
                boolean var217 = class10.field213.method1170((byte) -115) == 1;
                int var218 = class10.field213.method1183(arg0 + 21);
                class159 var219 = class134.method1032(var218, 499749840);
                if (var217 != var219.field3622) {
                    var219.field3622 = var217;
                    class42.method320(false, var219);
                }
                field873 = -1;
                return true;
            }
            if (field873 == 232) {
                int var220 = class10.field213.method1180(-128);
                int var221 = class10.field213.method1167((byte) -70);
                class159 var222 = class134.method1032(var221, 499749840);
                if (var222 != null && var222.field3612 == 0) {
                    if (var220 > var222.field3623 - var222.field3549) {
                        var220 = var222.field3623 - var222.field3549;
                    }
                    if (var220 < 0) {
                        var220 = 0;
                    }
                    if (var222.field3538 != var220) {
                        var222.field3538 = var220;
                        class42.method320(false, var222);
                    }
                }
                field873 = -1;
                return true;
            }
            if (field873 == 190) {
                class31.field821 = class94.field2400;
                long var223 = class10.field213.method1186(false);
                if (var223 == 0L) {
                    field873 = -1;
                    class5.field115 = null;
                    class26.field677 = null;
                    class43.field1097 = 0;
                    class36.field953 = null;
                    return true;
                }
                long var225 = class10.field213.method1186(false);
                class36.field953 = class90.method744(arg0 - 22, var225);
                class5.field115 = class90.method744(37, var223);
                class136.field3019 = class10.field213.method1169((byte) -118);
                int var227 = class10.field213.method1194(false);
                if (var227 == 255) {
                    field873 = -1;
                    return true;
                }
                class103[] var228 = new class103[100];
                class43.field1097 = var227;
                for (int var229 = 0; var229 < class43.field1097; var229++) {
                    var228[var229] = new class103();
                    var228[var229].field2736 = class10.field213.method1186(false);
                    var228[var229].field2508 = class90.method744(37, var228[var229].field2736);
                    var228[var229].field2512 = class10.field213.method1161((byte) 60);
                    var228[var229].field2511 = class10.field213.method1169((byte) -50);
                    if (class94.field2404 == var228[var229].field2736) {
                        class134.field2973 = var228[var229].field2511;
                    }
                }
                int var230 = class43.field1097;
                boolean var231 = false;
                while (var230 > 0) {
                    boolean var232 = true;
                    var230--;
                    for (int var233 = 0; var233 < var230; var233++) {
                        if (var228[var233].field2508.method450(var228[var233 + 1].field2508, (byte) -114) > 0) {
                            var232 = false;
                            class103 var234 = var228[var233];
                            var228[var233] = var228[var233 + 1];
                            var228[var233 + 1] = var234;
                        }
                    }
                    if (var232) {
                        break;
                    }
                }
                field873 = -1;
                class26.field677 = var228;
                return true;
            }
            if (field873 == 25) {
                for (int var235 = 0; var235 < class33.field897; var235++) {
                    class88 var236 = class63.method524(var235, -31647);
                    if (var236 != null && var236.field2226 == 0) {
                        class65.field1651[var235] = 0;
                        class85.field2124[var235] = 0;
                    }
                }
                class86.method709(-126);
                class153.field3324 += 32;
                field873 = -1;
                return true;
            }
            if (field873 == 80) {
                class86.method709(arg0 - 171);
                class127.field2874 = class10.field213.method1178((byte) -33);
                class137.field3053 = class94.field2400;
                field873 = -1;
                return true;
            }
            if (field873 == 194) {
                int var237 = class10.field213.method1211(false);
                class126.field2866 = var237;
                class152.method1116(-2055025328, var237);
                class99.method804(93, class126.field2866);
                for (int var238 = 0; var238 < 100; var238++) {
                    class25.field628[var238] = true;
                }
                field873 = -1;
                return true;
            }
            if (field873 == 117) {
                class47.method367((byte) -44);
                field873 = -1;
                return true;
            }
            if (field873 == 226) {
                int var239 = class10.field213.method1200((byte) 103);
                int var240 = class10.field213.method1183(100);
                class159 var241 = class134.method1032(var240, 499749840);
                if (var241.field3557 != 1 || var241.field3593 != var239) {
                    var241.field3593 = var239;
                    var241.field3557 = 1;
                    class42.method320(false, var241);
                }
                field873 = -1;
                return true;
            }
            class86.method704(null, "T1 - " + field873 + "," + class82.field2040 + "," + class30.field769 + " - " + class34.field914, 4436);
            class10.method48((byte) 81);
        } catch (IOException var245) {
            class114.method922((byte) 127);
        } catch (Exception var246) {
            String var243 = "T2 - " + field873 + "," + class82.field2040 + "," + class30.field769 + " - " + class34.field914 + "," + (class159.field3650.field1719[0] + class89.field2229) + "," + (class68.field1756 + class159.field3650.field1704[0]) + " - ";
            for (int var244 = 0; class34.field914 > var244 && var244 < 50; var244++) {
                var243 = var243 + class10.field213.field3473[var244] + ",";
            }
            class86.method704(var246, var243, 4436);
            class10.method48((byte) 39);
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method257(int arg0) {
        field869 = null;
        field851 = null;
        if (arg0 != -1339) {
            method256((byte) 102);
        }
        field854 = null;
        field855 = null;
        field870 = null;
        field852 = null;
        field858 = null;
    }
}
