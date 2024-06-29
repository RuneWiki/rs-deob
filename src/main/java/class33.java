import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LIIJYOUX")
public class class33 {

    @OriginalMember(owner = "client!LIIJYOUX", name = "a", descriptor = "LHOPOUOMC;")
    private static class22 field953 = new class22();

    @OriginalMember(owner = "client!LIIJYOUX", name = "a", descriptor = "([BI[BII)I")
    public static int method355(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        class22 var5 = field953;
        synchronized (field953) {
            field953.field792 = arg2;
            field953.field793 = arg4;
            field953.field797 = arg0;
            field953.field798 = 0;
            field953.field794 = arg3;
            field953.field799 = arg1;
            field953.field806 = 0;
            field953.field805 = 0;
            field953.field795 = 0;
            field953.field796 = 0;
            field953.field800 = 0;
            field953.field801 = 0;
            field953.field808 = 0;
            method357(field953);
            int var6 = arg1 - field953.field799;
            if (class56.field1535) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "a", descriptor = "(LHOPOUOMC;)V")
    private static void method356(class22 arg0) {
        byte var1 = arg0.field802;
        int var2 = arg0.field803;
        int var3 = arg0.field813;
        int var4 = arg0.field811;
        int[] var5 = class22.field816;
        int var6 = arg0.field810;
        byte[] var7 = arg0.field797;
        int var8 = arg0.field798;
        int var9 = arg0.field799;
        int var10 = var9;
        int var11 = arg0.field830 + 1;
        label67: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label67;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label67;
                        }
                        var7[var8] = var1;
                        var8++;
                        var9--;
                        break;
                    }
                    var7[var8] = var1;
                    var2--;
                    var8++;
                    var9--;
                }
            }
            boolean var12 = true;
            while (var12) {
                var12 = false;
                if (var3 == var11) {
                    var2 = 0;
                    break label67;
                }
                var1 = (byte) var4;
                int var21 = var5[var6];
                byte var22 = (byte) (var21 & 0xFF);
                var6 = var21 >> 8;
                var3++;
                if (var4 != var22) {
                    var4 = var22;
                    if (var9 == 0) {
                        var2 = 1;
                        break label67;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label67;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                }
            }
            var2 = 2;
            int var13 = var5[var6];
            byte var14 = (byte) (var13 & 0xFF);
            var6 = var13 >> 8;
            var3++;
            if (var3 != var11) {
                if (var4 == var14) {
                    var2 = 3;
                    int var15 = var5[var6];
                    byte var16 = (byte) (var15 & 0xFF);
                    var6 = var15 >> 8;
                    var3++;
                    if (var3 != var11) {
                        if (var4 == var16) {
                            int var17 = var5[var6];
                            byte var18 = (byte) (var17 & 0xFF);
                            int var19 = var17 >> 8;
                            var3++;
                            var2 = (var18 & 0xFF) + 4;
                            int var20 = var5[var19];
                            var4 = (byte) (var20 & 0xFF);
                            var6 = var20 >> 8;
                            var3++;
                        } else {
                            var4 = var16;
                        }
                    }
                } else {
                    var4 = var14;
                }
            }
        }
        int var23 = arg0.field800;
        arg0.field800 += var10 - var9;
        if (arg0.field800 < var23) {
            arg0.field801++;
        }
        arg0.field802 = var1;
        arg0.field803 = var2;
        arg0.field813 = var3;
        arg0.field811 = var4;
        class22.field816 = var5;
        arg0.field810 = var6;
        arg0.field797 = var7;
        arg0.field798 = var8;
        arg0.field799 = var9;
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "b", descriptor = "(LHOPOUOMC;)V")
    private static void method357(class22 arg0) {
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        arg0.field807 = 1;
        if (class22.field816 == null) {
            class22.field816 = new int[arg0.field807 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method358(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method358(arg0);
                byte var27 = method358(arg0);
                byte var28 = method358(arg0);
                byte var29 = method358(arg0);
                byte var30 = method358(arg0);
                arg0.field808++;
                byte var31 = method358(arg0);
                byte var32 = method358(arg0);
                byte var33 = method358(arg0);
                byte var34 = method358(arg0);
                byte var35 = method359(arg0);
                if (var35 == 0) {
                    arg0.field804 = false;
                } else {
                    arg0.field804 = true;
                }
                if (arg0.field804) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field809 = 0;
                byte var36 = method358(arg0);
                arg0.field809 = arg0.field809 << 8 | var36 & 0xFF;
                byte var37 = method358(arg0);
                arg0.field809 = arg0.field809 << 8 | var37 & 0xFF;
                byte var38 = method358(arg0);
                arg0.field809 = arg0.field809 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method359(arg0);
                    if (var103 == 1) {
                        arg0.field819[var39] = true;
                    } else {
                        arg0.field819[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field818[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field819[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method359(arg0);
                            if (var102 == 1) {
                                arg0.field818[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method361(arg0);
                int var42 = arg0.field817 + 2;
                int var43 = method360(3, arg0);
                int var44 = method360(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method359(arg0);
                        if (var100 == 0) {
                            arg0.field824[var45] = (byte) var99;
                            break;
                        }
                        var99++;
                    }
                }
                byte[] var46 = new byte[6];
                byte var47 = 0;
                while (var47 < var43) {
                    var46[var47] = var47++;
                }
                for (int var48 = 0; var48 < var44; var48++) {
                    byte var97 = arg0.field824[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field823[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method360(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method359(arg0);
                            if (var95 == 0) {
                                arg0.field825[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method359(arg0);
                            if (var96 == 0) {
                                var93++;
                            } else {
                                var93--;
                            }
                        }
                    }
                }
                for (int var50 = 0; var50 < var43; var50++) {
                    byte var90 = 32;
                    byte var91 = 0;
                    for (int var92 = 0; var92 < var42; var92++) {
                        if (arg0.field825[var50][var92] > var91) {
                            var91 = arg0.field825[var50][var92];
                        }
                        if (arg0.field825[var50][var92] < var90) {
                            var90 = arg0.field825[var50][var92];
                        }
                    }
                    method362(arg0.field826[var50], arg0.field827[var50], arg0.field828[var50], arg0.field825[var50], var90, var91, var42);
                    arg0.field829[var50] = var90;
                }
                int var51 = arg0.field817 + 1;
                int var52 = arg0.field807 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field812[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field821[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field822[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field823[var53];
                    var20 = arg0.field829[var59];
                    var21 = arg0.field826[var59];
                    var23 = arg0.field828[var59];
                    var22 = arg0.field827[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method360(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method359(arg0);
                }
                int var63 = var23[var61 - var22[var60]];
                while (true) {
                    while (var51 != var63) {
                        if (var63 == 0 || var63 == 1) {
                            int var78 = -1;
                            int var79 = 1;
                            do {
                                if (var63 == 0) {
                                    var78 += var79;
                                } else if (var63 == 1) {
                                    var78 += var79 * 2;
                                }
                                var79 *= 2;
                                if (var104 == 0) {
                                    var53++;
                                    var104 = 50;
                                    byte var80 = arg0.field823[var53];
                                    var20 = arg0.field829[var80];
                                    var21 = arg0.field826[var80];
                                    var23 = arg0.field828[var80];
                                    var22 = arg0.field827[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method360(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method359(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field820[arg0.field821[arg0.field822[0]] & 0xFF];
                            arg0.field812[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                class22.field816[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field822[0];
                                var66 = arg0.field821[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field821[var67] = arg0.field821[var67 - 1];
                                    arg0.field821[var67 - 1] = arg0.field821[var67 - 2];
                                    arg0.field821[var67 - 2] = arg0.field821[var67 - 3];
                                    arg0.field821[var67 - 3] = arg0.field821[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field821[var64 + var65] = arg0.field821[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field821[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field822[var68] + var69;
                                var66 = arg0.field821[var70];
                                while (var70 > arg0.field822[var68]) {
                                    arg0.field821[var70] = arg0.field821[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field822[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field822[var68]--;
                                    arg0.field821[arg0.field822[var68]] = arg0.field821[arg0.field822[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field822[0]--;
                                arg0.field821[arg0.field822[0]] = var66;
                                if (arg0.field822[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field821[var71] = arg0.field821[arg0.field822[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field822[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field812[arg0.field820[var66 & 0xFF] & 0xFF]++;
                            class22.field816[var58] = arg0.field820[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field823[var53];
                                var20 = arg0.field829[var74];
                                var21 = arg0.field826[var74];
                                var23 = arg0.field828[var74];
                                var22 = arg0.field827[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method360(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method359(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field803 = 0;
                    arg0.field802 = 0;
                    arg0.field814[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field814[var85] = arg0.field812[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field814[var86] += arg0.field814[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (class22.field816[var87] & 0xFF);
                        class22.field816[arg0.field814[var88 & 0xFF]] |= var87 << 8;
                        arg0.field814[var88 & 0xFF]++;
                    }
                    arg0.field810 = class22.field816[arg0.field809] >> 8;
                    arg0.field813 = 0;
                    arg0.field810 = class22.field816[arg0.field810];
                    arg0.field811 = (byte) (arg0.field810 & 0xFF);
                    arg0.field810 >>= 0x8;
                    arg0.field813++;
                    arg0.field830 = var58;
                    method356(arg0);
                    if (arg0.field830 + 1 == arg0.field813 && arg0.field803 == 0) {
                        var24 = true;
                        break;
                    }
                    var24 = false;
                    break;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "c", descriptor = "(LHOPOUOMC;)B")
    private static byte method358(class22 arg0) {
        return (byte) method360(8, arg0);
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "d", descriptor = "(LHOPOUOMC;)B")
    private static byte method359(class22 arg0) {
        return (byte) method360(1, arg0);
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "a", descriptor = "(ILHOPOUOMC;)I")
    private static int method360(int arg0, class22 arg1) {
        while (arg1.field806 < arg0) {
            arg1.field805 = arg1.field805 << 8 | arg1.field792[arg1.field793] & 0xFF;
            arg1.field806 += 8;
            arg1.field793++;
            arg1.field794--;
            arg1.field795++;
            if (arg1.field795 == 0) {
                arg1.field796++;
            }
        }
        int var2 = arg1.field805 >> arg1.field806 - arg0 & (0x1 << arg0) - 1;
        arg1.field806 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "e", descriptor = "(LHOPOUOMC;)V")
    private static void method361(class22 arg0) {
        arg0.field817 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field818[var1]) {
                arg0.field820[arg0.field817] = (byte) var1;
                arg0.field817++;
            }
        }
    }

    @OriginalMember(owner = "client!LIIJYOUX", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method362(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        for (int var8 = arg4; var8 <= arg5; var8++) {
            for (int var17 = 0; var17 < arg6; var17++) {
                if (arg3[var17] == var8) {
                    arg2[var7] = var17;
                    var7++;
                }
            }
        }
        for (int var9 = 0; var9 < 23; var9++) {
            arg1[var9] = 0;
        }
        for (int var10 = 0; var10 < arg6; var10++) {
            arg1[arg3[var10] + 1]++;
        }
        for (int var11 = 1; var11 < 23; var11++) {
            arg1[var11] += arg1[var11 - 1];
        }
        for (int var12 = 0; var12 < 23; var12++) {
            arg0[var12] = 0;
        }
        int var13 = 0;
        for (int var14 = arg4; var14 <= arg5; var14++) {
            int var16 = arg1[var14 + 1] + var13 - arg1[var14];
            arg0[var14] = var16 - 1;
            var13 = var16 << 1;
        }
        for (int var15 = arg4 + 1; var15 <= arg5; var15++) {
            arg1[var15] = (arg0[var15 - 1] + 1 << 1) - arg1[var15];
        }
    }
}
