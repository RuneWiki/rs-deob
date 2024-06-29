import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class100 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field1650 = 255;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lmh;")
    private static class62 field1647 = class201.method1405(true, "FULL");

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lmh;")
    public static class62 field1645 = field1647;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Lw;")
    public static class38 field1649 = new class38(128);

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field1652 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 17)
    public static final void method795(byte arg0) {
        class197.field3338 = null;
        field1648++;
        class17.field173 = null;
        class264.field4451 = null;
        class108.field1748 = null;
        class228.field3963 = null;
        class220.field3788 = null;
        class109.field1761 = null;
        class1.field5 = null;
        class192.field3233 = null;
        class151.field2379 = null;
        class296.field5047 = null;
        class20.field195 = null;
        class119.field1990 = null;
        class293.field4982 = null;
        if (arg0 != -98) {
            field1645 = (class62) null;
        }
        class270.field4594 = null;
        class125.field2097 = null;
        class284.field4859 = null;
        class298.field5088 = null;
        class169.field2748 = null;
        class248.field4212 = null;
        class245.field4169 = null;
        class286.field4890 = null;
        class212.field3567 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V", line = 52)
    public static void method796(byte arg0) {
        field1649 = null;
        field1645 = null;
        field1647 = null;
        if (arg0 >= -120) {
            method799();
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([[F[[I[[F[[B[[B[Lqe;[[FIII[[B[[B)V", line = 67)
    public static final void method797(float[][] arg0, int[][] arg1, float[][] arg2, byte[][] arg3, byte[][] arg4, class292[] arg5, float[][] arg6, int arg7, int arg8, int arg9, byte[][] arg10, byte[][] arg11) {
        field1644++;
        int var12 = 0;
        if (arg7 >= -23) {
            field1652 = -118;
        }
        while (var12 < arg8) {
            class292 var13 = arg5[var12];
            if (var13.field4969 == arg9) {
                class58 var14 = new class58();
                int var15 = 0;
                int var16 = (var13.field4962 >> 7) - var13.field4961;
                int var17 = (var13.field4959 >> 7) + var13.field4961;
                if (var17 > 103) {
                    var17 = 103;
                }
                int var18 = (var13.field4959 >> 7) - var13.field4961;
                if (var18 < 0) {
                    var15 -= var18;
                    var18 = 0;
                }
                int var19 = var18;
                while (true) {
                    if (var17 < var19) {
                        var14.method379();
                        int var56 = 0;
                        if (((var13.field4959 >> 7) - var13.field4961) < 0) {
                            var56 -= (var13.field4959 >> 7) - var13.field4961;
                        }
                        for (int var57 = var18; var57 <= var17; var57++) {
                            short var58 = var13.field4964[var56];
                            int var59 = var16 + (var58 >> 8);
                            int var60 = (var58 & 0xFF) + var59 - 1;
                            if (var60 > 103) {
                                var60 = 103;
                            }
                            if (var59 < 0) {
                                var59 = 0;
                            }
                            for (int var61 = var59; var61 <= var60; var61++) {
                                int var62 = arg10[var61][var57] & 0xFF;
                                int var63 = arg11[var61][var57] & 0xFF;
                                byte var64 = arg4[var61][var57];
                                boolean var65 = false;
                                if (var62 == 0) {
                                    if (var63 == 0) {
                                        continue;
                                    }
                                    class35 var66 = class247.method1726(var63 - 1, (byte) -127);
                                    if (var66.field466 == -1) {
                                        continue;
                                    }
                                    if (arg3[var61][var57] != 0) {
                                        class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, class194.field3270[arg3[var61][var57]], arg4[var61][var57], var61, var57);
                                        continue;
                                    }
                                } else if (var63 == 0) {
                                    var64 = 0;
                                } else {
                                    class35 var67 = class247.method1726(var63 - 1, (byte) 86);
                                    if (var67.field466 == -1) {
                                        class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, class151.field2396[arg3[var61][var57]], arg4[var61][var57], var61, var57);
                                        continue;
                                    }
                                    byte var68 = arg3[var61][var57];
                                    if (var68 != 0) {
                                        var65 = true;
                                    }
                                }
                                class164 var69 = class198.method1385(arg9, var61, var57);
                                if (var69 != null) {
                                    int var70 = (int) (var69.field2668 >> 14) & 0x3F;
                                    if (var70 == 9) {
                                        int[] var71 = null;
                                        int var72 = (int) (var69.field2668 >> 20) & 0x3;
                                        if ((var72 & 0x1) == 0) {
                                            boolean var73 = var59 <= var61 - 1;
                                            if (!var73 && var17 >= var57 + 1) {
                                                short var74 = var13.field4964[var56 + 1];
                                                int var75 = var16 + (var74 >> 8);
                                                int var76 = (var74 & 0xFF) + var75;
                                                var73 = var61 > var75 && var76 > var61;
                                            }
                                            boolean var77 = var60 >= (var61 + 1);
                                            if (!var77 && var18 <= (var57 - 1)) {
                                                short var78 = var13.field4964[var56 - 1];
                                                int var79 = (var78 >> 8) + var16;
                                                int var80 = (var78 & 0xFF) + var79;
                                                var77 = var61 > var79 && var61 < var80;
                                            }
                                            if (var73 && var77) {
                                                var71 = class194.field3270[0];
                                            } else if (var73) {
                                                var71 = class194.field3270[1];
                                                var64 = 1;
                                            } else if (var77) {
                                                var71 = class194.field3270[1];
                                                var64 = 3;
                                            }
                                        } else {
                                            boolean var81 = var59 <= var61 - 1;
                                            boolean var82 = var60 >= var61 + 1;
                                            if (!var81 && (var57 - 1) >= var18) {
                                                short var83 = var13.field4964[var56 - 1];
                                                int var84 = (var83 >> 8) + var16;
                                                int var85 = (var83 & 0xFF) + var84;
                                                var81 = var84 < var61 && var85 > var61;
                                            }
                                            if (!var82 && (var57 + 1) <= var17) {
                                                short var86 = var13.field4964[var56 + 1];
                                                int var87 = (var86 >> 8) + var16;
                                                int var88 = var87 + (var86 & 0xFF);
                                                var82 = var61 > var87 && var61 < var88;
                                            }
                                            if (var81 && var82) {
                                                var71 = class194.field3270[0];
                                            } else if (var81) {
                                                var71 = class194.field3270[1];
                                                var64 = 0;
                                            } else if (var82) {
                                                var64 = 2;
                                                var71 = class194.field3270[1];
                                            }
                                        }
                                        if (var71 != null) {
                                            class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, var71, var64, var61, var57);
                                        }
                                        continue;
                                    }
                                }
                                if (var65) {
                                    class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, class151.field2396[arg3[var61][var57]], arg4[var61][var57], var61, var57);
                                    class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, class194.field3270[arg3[var61][var57]], arg4[var61][var57], var61, var57);
                                } else {
                                    class56.method366(false, arg6, arg0, arg2, var13, var14, arg1, class194.field3270[0], var64, var61, var57);
                                }
                            }
                            var56++;
                        }
                        if (var14.field853 > 0 && var14.field854 > 0) {
                            var14.method378();
                            var13.field4954 = var14;
                        }
                        break;
                    }
                    short var20 = var13.field4964[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg10[var23][var19] & 0xFF;
                        boolean var25 = false;
                        int var26 = arg11[var23][var19] & 0xFF;
                        if (var24 == 0) {
                            if (var26 == 0) {
                                continue;
                            }
                            class35 var31 = class247.method1726(var26 - 1, (byte) -110);
                            if (var31.field466 == -1) {
                                continue;
                            }
                            if (arg3[var23][var19] != 0) {
                                int[] var55 = class194.field3270[arg3[var23][var19]];
                                var14.field852 += (var55.length >> 1) * 3 - 6;
                                var14.field850 += var55.length >> 1;
                                continue;
                            }
                        } else if (var26 != 0) {
                            class35 var27 = class247.method1726(var26 - 1, (byte) 48);
                            if (var27.field466 == -1) {
                                byte var28 = arg3[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class151.field2396[var28];
                                    var14.field852 += (var29.length >> 1) * 3 - 6;
                                    var14.field850 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg3[var23][var19];
                            if (var30 != 0) {
                                var25 = true;
                            }
                        }
                        class164 var32 = class198.method1385(arg9, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field2668 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var34 = null;
                                int var35 = (int) (var32.field2668 >> 20) & 0x3;
                                if ((var35 & 0x1) == 0) {
                                    boolean var36 = var22 >= var23 + 1;
                                    boolean var37 = (var23 - 1) >= var21;
                                    if (!var37 && var19 + 1 <= var17) {
                                        short var38 = var13.field4964[var15 + 1];
                                        int var39 = (var38 >> 8) + var16;
                                        int var40 = (var38 & 0xFF) + var39;
                                        var37 = var23 > var39 && var23 < var40;
                                    }
                                    if (!var36 && var18 <= (var19 - 1)) {
                                        short var41 = var13.field4964[var15 - 1];
                                        int var42 = (var41 >> 8) + var16;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var36 = var23 > var42 && var43 > var23;
                                    }
                                    if (var37 && var36) {
                                        var34 = class194.field3270[0];
                                    } else if (var37) {
                                        var34 = class194.field3270[1];
                                    } else if (var36) {
                                        var34 = class194.field3270[1];
                                    }
                                } else {
                                    boolean var44 = var21 <= (var23 - 1);
                                    boolean var45 = var22 >= var23 + 1;
                                    if (!var44 && var19 - 1 >= var18) {
                                        short var46 = var13.field4964[var15 - 1];
                                        int var47 = var16 + (var46 >> 8);
                                        int var48 = var47 + (var46 & 0xFF);
                                        var44 = var47 < var23 && var48 > var23;
                                    }
                                    if (!var45 && var17 >= var19 + 1) {
                                        short var49 = var13.field4964[var15 + 1];
                                        int var50 = (var49 >> 8) + var16;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var45 = var50 < var23 && var23 < var51;
                                    }
                                    if (var44 && var45) {
                                        var34 = class194.field3270[0];
                                    } else if (var44) {
                                        var34 = class194.field3270[1];
                                    } else if (var45) {
                                        var34 = class194.field3270[1];
                                    }
                                }
                                if (var34 != null) {
                                    var14.field852 += (var34.length >> 1) * 3 - 6;
                                    var14.field850 += var34.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var25) {
                            int[] var52 = class194.field3270[arg3[var23][var19]];
                            int[] var53 = class151.field2396[arg3[var23][var19]];
                            var14.field852 += (var52.length >> 1) * 3 - 6;
                            var14.field852 += (var53.length >> 1) * 3 - 6;
                            var14.field850 += var52.length >> 1;
                            var14.field850 += var53.length >> 1;
                        } else {
                            int[] var54 = class194.field3270[0];
                            var14.field852 += ((var54.length >> 1) - 2) * 3;
                            var14.field850 += var54.length >> 1;
                        }
                    }
                    var15++;
                    var19++;
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIBI)V", line = 603)
    public static final void method798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class12.field106 - class162.field2633) * var8 / 100 + class162.field2633;
        int var10 = arg0 * var9 >> 8;
        field1651++;
        int var11 = 2048 - arg2 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            int var16 = class23.field245[var11];
            var14 = -var10 * var16 >> 16;
            int var17 = class23.field254[var11];
            var15 = var10 * var17 >> 16;
        }
        if (var12 != 0) {
            int var18 = class23.field245[var12];
            int var19 = class23.field254[var12];
            var13 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class215.field3647 = arg3 - var15;
        class30.field414 = arg4;
        class258.field4351 = arg5 - var13;
        class46.field683 = arg2;
        class15.field134 = arg7 - var14;
        if (arg6 <= 19) {
            method798(-127, -5, -105, 50, 89, 31, (byte) 91, -105);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V", line = 674)
    public static final void method799() {
        class17.field160 = 0;
        label194: for (int var0 = 0; var0 < class152.field2404; var0++) {
            class27 var1 = class226.field3939[var0];
            if (class163.field2644 != null) {
                for (int var2 = 0; var2 < class163.field2644.length; var2++) {
                    if (class163.field2644[var2] != -1000000 && (var1.field350 <= class163.field2644[var2] || var1.field338 <= class163.field2644[var2]) && (var1.field330 <= client.field5167[var2] || var1.field334 <= client.field5167[var2]) && (var1.field330 >= class124.field2053[var2] || var1.field334 >= class124.field2053[var2]) && (var1.field346 <= class75.field1211[var2] || var1.field342 <= class75.field1211[var2]) && (var1.field346 >= class293.field4979[var2] || var1.field342 >= class293.field4979[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field341 == 1) {
                int var3 = var1.field349 + class1.field9 - class36.field480;
                if (var3 >= 0 && var3 <= class1.field9 + class1.field9) {
                    int var4 = var1.field344 + class1.field9 - class24.field264;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field336 + class1.field9 - class24.field264;
                    if (var5 > class1.field9 + class1.field9) {
                        var5 = class1.field9 + class1.field9;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class308.field5290[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class144.field2300 - var1.field330;
                        if (var7 > 32) {
                            var1.field340 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field340 = 2;
                            var7 = -var7;
                        }
                        var1.field328 = (var1.field346 - class270.field4579 << 8) / var7;
                        var1.field326 = (var1.field342 - class270.field4579 << 8) / var7;
                        var1.field327 = (var1.field350 - class293.field4981 << 8) / var7;
                        var1.field337 = (var1.field338 - class293.field4981 << 8) / var7;
                        class173.field2792[class17.field160++] = var1;
                    }
                }
            } else if (var1.field341 == 2) {
                int var8 = var1.field344 + class1.field9 - class24.field264;
                if (var8 >= 0 && var8 <= class1.field9 + class1.field9) {
                    int var9 = var1.field349 + class1.field9 - class36.field480;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field348 + class1.field9 - class36.field480;
                    if (var10 > class1.field9 + class1.field9) {
                        var10 = class1.field9 + class1.field9;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class308.field5290[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class270.field4579 - var1.field346;
                        if (var12 > 32) {
                            var1.field340 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field340 = 4;
                            var12 = -var12;
                        }
                        var1.field335 = (var1.field330 - class144.field2300 << 8) / var12;
                        var1.field332 = (var1.field334 - class144.field2300 << 8) / var12;
                        var1.field327 = (var1.field350 - class293.field4981 << 8) / var12;
                        var1.field337 = (var1.field338 - class293.field4981 << 8) / var12;
                        class173.field2792[class17.field160++] = var1;
                    }
                }
            } else if (var1.field341 == 4) {
                int var13 = var1.field350 - class293.field4981;
                if (var13 > 128) {
                    int var14 = var1.field344 + class1.field9 - class24.field264;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field336 + class1.field9 - class24.field264;
                    if (var15 > class1.field9 + class1.field9) {
                        var15 = class1.field9 + class1.field9;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field349 + class1.field9 - class36.field480;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field348 + class1.field9 - class36.field480;
                        if (var17 > class1.field9 + class1.field9) {
                            var17 = class1.field9 + class1.field9;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class308.field5290[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field340 = 5;
                            var1.field335 = (var1.field330 - class144.field2300 << 8) / var13;
                            var1.field332 = (var1.field334 - class144.field2300 << 8) / var13;
                            var1.field328 = (var1.field346 - class270.field4579 << 8) / var13;
                            var1.field326 = (var1.field342 - class270.field4579 << 8) / var13;
                            class173.field2792[class17.field160++] = var1;
                        }
                    }
                }
            }
        }
    }
}
