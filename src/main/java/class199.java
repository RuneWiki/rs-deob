import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class199 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Llu;")
    public static class610 field2925 = new class610(73, 4);

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
    public static int[] field2931 = new int[1];

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
    public static boolean field2932 = false;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field2930 = new Random();

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZIIIII)V")
    public static final void method1334(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2926++;
        int var7 = class551.field8224;
        class374.field5170 = 0;
        int[] var8 = class314.field4332;
        if (!arg1) {
            field2930 = null;
        }
        for (int var9 = 0; var9 < class527.field7717 + var7; var9++) {
            class87 var32 = null;
            class136 var33;
            if (var7 > var9) {
                var33 = class293.field4036[var8[var9]];
            } else {
                var33 = ((class505) class510.field7260.method2799((long) class634.field9290[var9 - var7], true)).field7148;
                var32 = ((class571) var33).field8405;
                if (var32.field1314 != null) {
                    var32 = var32.method655((byte) 108, class556.field8280);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field1878 >= 0 && (class84.field1205 == var33.field1862 || class541.field8119.field8501 == var33.field8501)) {
                class430.method2522(var33, 14, arg6 >> 1, var33.method949((byte) 126), arg3 >> 1, arg0, arg4);
                if (class524.field7487[0] >= 0) {
                    if (var33.field1867 != null && (var9 >= var7 || class403.field5510 == 0 || class403.field5510 == 3 || class403.field5510 == 1 && class178.method1256(0, ((class373) var33).field5138)) && class595.field8799 > class374.field5170) {
                        class595.field8785[class374.field5170] = class470.field6636.method2126((byte) 94, var33.field1867) / 2;
                        class595.field8798[class374.field5170] = class524.field7487[0];
                        class595.field8802[class374.field5170] = class524.field7487[1];
                        class595.field8792[class374.field5170] = var33.field1850;
                        class595.field8780[class374.field5170] = var33.field1865;
                        class595.field8784[class374.field5170] = var33.field1902;
                        class595.field8790[class374.field5170] = var33.field1867;
                        class374.field5170++;
                    }
                    int var34 = class524.field7487[1] + arg5;
                    int var45;
                    if (var33.field1895 || class617.field9123 >= var33.field1906) {
                        var45 = var34 - Math.max(class470.field6636.field4788, class248.field3558[0].method318());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var7 > var9) {
                            class373 var37 = class293.field4036[var8[var9]];
                            var38 = var33.method947(!arg1).field3272;
                            if (var37.field5124) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field1283;
                            if (var38 == -1) {
                                var38 = var33.method947(!arg1).field3272;
                            }
                        }
                        class53[] var39 = class248.field3558;
                        if (var38 != -1) {
                            class53[] var40 = (class53[]) class647.field9397.method842(0, (long) var38);
                            if (var40 == null) {
                                class126[] var41 = class126.method889(class585.field8595, var38, 0);
                                if (var41 != null) {
                                    var40 = new class53[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class99.field1445.method474(var41[var42], true);
                                    }
                                    class647.field9397.method835((byte) 125, (long) var38, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class53 var43 = var39[0];
                        class53 var44 = var39[var36];
                        var45 = var34 - Math.max(class470.field6636.field4788, var43.method318());
                        int var46 = class524.field7487[0] + arg2 - (var43.method325() >> 1);
                        int var47 = var43.method325() * var33.field1925 / 255;
                        if (var33.field1925 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method316(var46, var45);
                        class99.field1445.method512(var46, var45, var46 + var47, var45 - -var43.method318());
                        var44.method316(var46, var45);
                        class99.field1445.method510(arg2, arg5, arg2 + arg6, arg3 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field1895) {
                        if (var33.field1922 > class617.field9123) {
                            class53 var48 = class83.field1196[var33.field1870 ? 2 : 0];
                            class53 var49 = class83.field1196[var33.field1870 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class571)) {
                                var51 = var32.field1261;
                                if (var51 == -1) {
                                    var51 = var33.method947(false).field3263;
                                }
                            } else {
                                var51 = var33.method947(!arg1).field3263;
                            }
                            if (var51 != -1) {
                                class53[] var52 = (class53[]) class1.field1.method842(0, (long) var51);
                                if (var52 == null) {
                                    class126[] var53 = class126.method889(class585.field8595, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class53[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class99.field1445.method474(var53[var54], true);
                                        }
                                        class1.field1.method835((byte) 127, (long) var51, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field1870 ? 3 : 1];
                                    var48 = var52[var33.field1870 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field1922 - class617.field9123;
                            int var56;
                            if (var55 <= var33.field1910) {
                                var56 = var48.method325();
                            } else {
                                int var57 = var55 - var33.field1910;
                                int var58 = var33.field1868 == 0 ? 0 : (var33.field1934 - var57) / var33.field1868 * var33.field1868;
                                var56 = var58 * var48.method325() / var33.field1934;
                            }
                            int var59 = var48.method318();
                            var45 -= var59;
                            int var60 = class524.field7487[0] + arg2 - (var48.method325() >> 1);
                            var48.method316(var60, var45);
                            class99.field1445.method512(var60, var45, var56 + var60, var45 - -var59);
                            var49.method316(var60, var45);
                            var45 -= 2;
                            class99.field1445.method510(arg2, arg5, arg2 + arg6, arg3 + arg5);
                        }
                        if (var7 > var9) {
                            class373 var62 = (class373) var33;
                            if (var62.field5159 != -1) {
                                var45 -= 25;
                                class165.field2611[var62.field5159].method316(class524.field7487[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field5149 != -1) {
                                var45 -= 25;
                                class568.field8377[var62.field5149].method316(class524.field7487[0] + arg2 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1253 >= 0 && var32.field1253 < class568.field8377.length) {
                            class53 var61 = class568.field8377[var32.field1253];
                            var45 -= 25;
                            var61.method316(arg2 + class524.field7487[0] - (var61.method325() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class373) {
                        int var69 = 0;
                        class190[] var70 = class385.field5293;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class190 var76 = var70[var71];
                            if (var76 != null && var76.field2821 == 1 && class634.field9290[var9 - var7] == var76.field2824) {
                                class53 var77 = class604.field8997[var76.field2823];
                                if (var69 < var77.method318()) {
                                    var69 = var77.method318();
                                }
                                if (class617.field9123 % 20 < 10) {
                                    var77.method316(arg2 + class524.field7487[0] - 12, var45 + -var77.method318());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class190[] var64 = class385.field5293;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class190 var67 = var64[var65];
                            if (var67 != null && var67.field2821 == 10 && var8[var9] == var67.field2824) {
                                class53 var68 = class604.field8997[var67.field2823];
                                if (var68.method318() > var63) {
                                    var63 = var68.method318();
                                }
                                var68.method316(class524.field7487[0] + arg2 - 12, -var68.method318() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class617.field9123 < var33.field1924[var73]) {
                            int var74 = var33.method949((byte) 127) / 2;
                            class430.method2522(var33, 117, arg6 >> 1, var74, arg3 >> 1, arg0, arg4);
                            if (class524.field7487[0] > -1) {
                                int var75 = class561.field8341[var33.field1888[var73]].method325();
                                if (var73 == 1) {
                                    class524.field7487[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class524.field7487[1] -= 10;
                                    class524.field7487[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class524.field7487[0] += var75 - 9;
                                    class524.field7487[1] -= 10;
                                }
                                class561.field8341[var33.field1888[var73]].method316(arg2 - ((var75 >> 1) - class524.field7487[0]), arg5 - 12 + class524.field7487[1]);
                                class519.field7407.method734(class524.field7487[1] + arg5 + 3, Integer.toString(var33.field1866[var73]), 93, -1, class524.field7487[0] + arg2 - 1, 0);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class568.field8379; var10++) {
            int var28 = class58.field740[var10];
            class136 var29;
            if (var28 >= 2048) {
                var29 = ((class505) class510.field7260.method2799((long) (var28 - 2048), true)).field7148;
            } else {
                var29 = class293.field4036[var28];
            }
            int var30 = class284.field3973[var10];
            class136 var31;
            if (var30 < 2048) {
                var31 = class293.field4036[var30];
            } else {
                var31 = ((class505) class510.field7260.method2799((long) (var30 - 2048), arg1)).field7148;
            }
            class451.method2726(var31, arg0, false, arg2, var29, arg4, arg5, --var29.field1852, arg3, arg6);
        }
        int var11 = class470.field6636.field4792 + class470.field6636.field4788 + 2;
        for (int var12 = 0; var12 < class374.field5170; var12++) {
            int var13 = class595.field8798[var12];
            int var14 = class595.field8802[var12];
            int var15 = class595.field8785[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if (class595.field8802[var27] - var11 < var14 - -2 && (class595.field8802[var27] + 2) > (var14 - var11) && (class595.field8798[var27] + class595.field8785[var27]) > (var13 - var15) && (class595.field8798[var27] - class595.field8785[var27]) < (var13 + var15) && var14 > (class595.field8802[var27] - var11)) {
                        var14 = class595.field8802[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class595.field8802[var12] = var14;
            String var17 = class595.field8790[var12];
            if (class51.field601 == 0) {
                int var18 = 16776960;
                if (class595.field8792[var12] < 6) {
                    var18 = class138.field1970[class595.field8792[var12]];
                }
                if (class595.field8792[var12] == 6) {
                    var18 = class84.field1205 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class595.field8792[var12] == 7) {
                    var18 = class84.field1205 % 20 < 10 ? 255 : 65535;
                }
                if (class595.field8792[var12] == 8) {
                    var18 = (class84.field1205 % 20) < 10 ? 45056 : 8454016;
                }
                if (class595.field8792[var12] == 9) {
                    int var19 = 150 - class595.field8784[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - ((var19 - 50) * 327680);
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 64780;
                    }
                }
                if (class595.field8792[var12] == 10) {
                    int var20 = 150 - class595.field8784[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 * 327680 - 16384000);
                    } else if (var20 < 150) {
                        var18 = ((var20 - 100) * 327680) + 255 + 500 - (var20 * 5);
                    }
                }
                if (class595.field8792[var12] == 11) {
                    int var21 = 150 - class595.field8784[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class595.field8780[var12] == 0) {
                    class114.field1608.method734(arg5 + var14, var17, 122, var22, arg2 + var13, -16777216);
                }
                if (class595.field8780[var12] == 1) {
                    class114.field1608.method731(arg2 + var13, arg5 + var14, class84.field1205, var17, var22, -16777216, -75);
                }
                if (class595.field8780[var12] == 2) {
                    class114.field1608.method725(var17, var22, arg2 + var13, -16777216, class84.field1205, arg5 + var14, 2);
                }
                if (class595.field8780[var12] == 3) {
                    class114.field1608.method722(var17, arg5 + var14, class84.field1205, var22, 150 - class595.field8784[var12], arg2 + var13, 0, -16777216);
                }
                if (class595.field8780[var12] == 4) {
                    int var23 = (150 - class595.field8784[var12]) * (class470.field6636.method2126((byte) 77, var17) + 100) / 150;
                    class99.field1445.method512(arg2 + var13 - 50, arg5, arg2 + var13 + 50, arg3 + arg5);
                    class114.field1608.method726(var13 + arg2 + 50 - var23, var17, arg1, -16777216, var22, arg5 + var14);
                    class99.field1445.method510(arg2, arg5, arg2 + arg6, arg3 + arg5);
                }
                if (class595.field8780[var12] == 5) {
                    int var24 = 150 - class595.field8784[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class470.field6636.field4792 + class470.field6636.field4788;
                    class99.field1445.method512(arg2, arg5 - (-var14 - -var26) - 1, arg2 + arg6, var14 + arg5 + 5);
                    class114.field1608.method734(arg5 + var25 + var14, var17, 96, var22, arg2 + var13, -16777216);
                    class99.field1445.method510(arg2, arg5, arg2 + arg6, arg5 - -arg3);
                }
            } else {
                class114.field1608.method734(arg5 + var14, var17, 116, -256, arg2 + var13, -16777216);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([Ljava/lang/Object;IBI[I)V")
    public static final void method1335(Object[] arg0, int arg1, byte arg2, int arg3, int[] arg4) {
        field2928++;
        if (arg2 > -67) {
            method1334(32, false, -68, -72, -40, 98, 38);
        }
        if (arg1 <= arg3) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg3;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var7;
        Object var8 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var8;
        int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if ((var10 & var9) + var7 > arg4[var10]) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg4[arg1] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg1] = arg0[var6];
        arg0[var6] = var8;
        method1335(arg0, var6 - 1, (byte) -126, arg3, arg4);
        method1335(arg0, arg1, (byte) -115, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static void method1336(boolean arg0) {
        field2930 = null;
        if (!arg0) {
            field2932 = false;
        }
        field2925 = null;
        field2931 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BZ)V")
    public static final void method1337(byte arg0, boolean arg1) {
        field2927++;
        if (class527.field7657.length() == 0) {
            return;
        }
        class393.method2337("--> " + class527.field7657, 1);
        class29.method198(13699, arg1, class527.field7657, false);
        if (arg0 <= 58) {
            field2930 = null;
        }
        class529.field7895 = 0;
        class145.field2044 = 0;
        class527.field7657 = "";
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
    public static final int method1338(int arg0, byte arg1, int arg2) {
        field2929++;
        if (arg1 > -63) {
            return 50;
        } else {
            int var3 = arg0 >>> 24;
            int var4 = 255 - var3;
            int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            return (((arg2 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
        }
    }
}
