import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rb")
public class BZip2 {

    @OriginalMember(owner = "rb", name = "a", descriptor = "Lsb;")
    private static BZip2State field756 = new BZip2State();

    @OriginalMember(owner = "rb", name = "a", descriptor = "([BI[BII)I")
    public static int method261(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        BZip2State var5 = field756;
        synchronized (field756) {
            field756.field766 = arg2;
            field756.field767 = arg4;
            field756.field771 = arg0;
            field756.field772 = 0;
            field756.field768 = arg3;
            field756.field773 = arg1;
            field756.field780 = 0;
            field756.field779 = 0;
            field756.field769 = 0;
            field756.field770 = 0;
            field756.field774 = 0;
            field756.field775 = 0;
            field756.field782 = 0;
            method263(field756);
            int var6 = arg1 - field756.field773;
            if (Linkable.field364) {
            }
            return var6;
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(Lsb;)V")
    private static void method262(BZip2State arg0) {
        byte var1 = arg0.field776;
        int var2 = arg0.field777;
        int var3 = arg0.field787;
        int var4 = arg0.field785;
        int[] var5 = BZip2State.field790;
        int var6 = arg0.field784;
        byte[] var7 = arg0.field771;
        int var8 = arg0.field772;
        int var9 = arg0.field773;
        int var10 = var9;
        int var11 = arg0.field804 + 1;
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
        int var23 = arg0.field774;
        arg0.field774 += var10 - var9;
        if (arg0.field774 < var23) {
            arg0.field775++;
        }
        arg0.field776 = var1;
        arg0.field777 = var2;
        arg0.field787 = var3;
        arg0.field785 = var4;
        BZip2State.field790 = var5;
        arg0.field784 = var6;
        arg0.field771 = var7;
        arg0.field772 = var8;
        arg0.field773 = var9;
    }

    @OriginalMember(owner = "rb", name = "b", descriptor = "(Lsb;)V")
    private static void method263(BZip2State arg0) {
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
        arg0.field781 = 1;
        if (BZip2State.field790 == null) {
            BZip2State.field790 = new int[arg0.field781 * 100000];
        }
        boolean var24 = true;
        while (true) {
            while (var24) {
                byte var25 = method264(arg0);
                if (var25 == 23) {
                    return;
                }
                byte var26 = method264(arg0);
                byte var27 = method264(arg0);
                byte var28 = method264(arg0);
                byte var29 = method264(arg0);
                byte var30 = method264(arg0);
                arg0.field782++;
                byte var31 = method264(arg0);
                byte var32 = method264(arg0);
                byte var33 = method264(arg0);
                byte var34 = method264(arg0);
                byte var35 = method265(arg0);
                if (var35 == 0) {
                    arg0.field778 = false;
                } else {
                    arg0.field778 = true;
                }
                if (arg0.field778) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field783 = 0;
                byte var36 = method264(arg0);
                arg0.field783 = arg0.field783 << 8 | var36 & 0xFF;
                byte var37 = method264(arg0);
                arg0.field783 = arg0.field783 << 8 | var37 & 0xFF;
                byte var38 = method264(arg0);
                arg0.field783 = arg0.field783 << 8 | var38 & 0xFF;
                for (int var39 = 0; var39 < 16; var39++) {
                    byte var103 = method265(arg0);
                    if (var103 == 1) {
                        arg0.field793[var39] = true;
                    } else {
                        arg0.field793[var39] = false;
                    }
                }
                for (int var40 = 0; var40 < 256; var40++) {
                    arg0.field792[var40] = false;
                }
                for (int var41 = 0; var41 < 16; var41++) {
                    if (arg0.field793[var41]) {
                        for (int var101 = 0; var101 < 16; var101++) {
                            byte var102 = method265(arg0);
                            if (var102 == 1) {
                                arg0.field792[var41 * 16 + var101] = true;
                            }
                        }
                    }
                }
                method267(arg0);
                int var42 = arg0.field791 + 2;
                int var43 = method266(3, arg0);
                int var44 = method266(15, arg0);
                for (int var45 = 0; var45 < var44; var45++) {
                    int var99 = 0;
                    while (true) {
                        byte var100 = method265(arg0);
                        if (var100 == 0) {
                            arg0.field798[var45] = (byte) var99;
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
                    byte var97 = arg0.field798[var48];
                    byte var98 = var46[var97];
                    while (var97 > 0) {
                        var46[var97] = var46[var97 - 1];
                        var97--;
                    }
                    var46[0] = var98;
                    arg0.field797[var48] = var98;
                }
                for (int var49 = 0; var49 < var43; var49++) {
                    int var93 = method266(5, arg0);
                    for (int var94 = 0; var94 < var42; var94++) {
                        while (true) {
                            byte var95 = method265(arg0);
                            if (var95 == 0) {
                                arg0.field799[var49][var94] = (byte) var93;
                                break;
                            }
                            byte var96 = method265(arg0);
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
                        if (arg0.field799[var50][var92] > var91) {
                            var91 = arg0.field799[var50][var92];
                        }
                        if (arg0.field799[var50][var92] < var90) {
                            var90 = arg0.field799[var50][var92];
                        }
                    }
                    method268(arg0.field800[var50], arg0.field801[var50], arg0.field802[var50], arg0.field799[var50], var90, var91, var42);
                    arg0.field803[var50] = var90;
                }
                int var51 = arg0.field791 + 1;
                int var52 = arg0.field781 * 100000;
                int var53 = -1;
                byte var54 = 0;
                for (int var55 = 0; var55 <= 255; var55++) {
                    arg0.field786[var55] = 0;
                }
                int var56 = 4095;
                for (int var57 = 15; var57 >= 0; var57--) {
                    for (int var89 = 15; var89 >= 0; var89--) {
                        arg0.field795[var56] = (byte) (var57 * 16 + var89);
                        var56--;
                    }
                    arg0.field796[var57] = var56 + 1;
                }
                int var58 = 0;
                if (var54 == 0) {
                    var53++;
                    var54 = 50;
                    byte var59 = arg0.field797[var53];
                    var20 = arg0.field803[var59];
                    var21 = arg0.field800[var59];
                    var23 = arg0.field802[var59];
                    var22 = arg0.field801[var59];
                }
                int var104 = var54 - 1;
                int var60 = var20;
                int var61;
                byte var62;
                for (var61 = method266(var20, arg0); var61 > var21[var60]; var61 = var61 << 1 | var62) {
                    var60++;
                    var62 = method265(arg0);
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
                                    byte var80 = arg0.field797[var53];
                                    var20 = arg0.field803[var80];
                                    var21 = arg0.field800[var80];
                                    var23 = arg0.field802[var80];
                                    var22 = arg0.field801[var80];
                                }
                                var104--;
                                int var81 = var20;
                                int var82;
                                byte var83;
                                for (var82 = method266(var20, arg0); var82 > var21[var81]; var82 = var82 << 1 | var83) {
                                    var81++;
                                    var83 = method265(arg0);
                                }
                                var63 = var23[var82 - var22[var81]];
                            } while (var63 == 0 || var63 == 1);
                            var78++;
                            byte var84 = arg0.field794[arg0.field795[arg0.field796[0]] & 0xFF];
                            arg0.field786[var84 & 0xFF] += var78;
                            while (var78 > 0) {
                                BZip2State.field790[var58] = var84 & 0xFF;
                                var58++;
                                var78--;
                            }
                        } else {
                            int var64 = var63 - 1;
                            byte var66;
                            if (var64 < 16) {
                                int var65 = arg0.field796[0];
                                var66 = arg0.field795[var64 + var65];
                                while (var64 > 3) {
                                    int var67 = var64 + var65;
                                    arg0.field795[var67] = arg0.field795[var67 - 1];
                                    arg0.field795[var67 - 1] = arg0.field795[var67 - 2];
                                    arg0.field795[var67 - 2] = arg0.field795[var67 - 3];
                                    arg0.field795[var67 - 3] = arg0.field795[var67 - 4];
                                    var64 -= 4;
                                }
                                while (var64 > 0) {
                                    arg0.field795[var64 + var65] = arg0.field795[var64 + var65 - 1];
                                    var64--;
                                }
                                arg0.field795[var65] = var66;
                            } else {
                                int var68 = var64 / 16;
                                int var69 = var64 % 16;
                                int var70 = arg0.field796[var68] + var69;
                                var66 = arg0.field795[var70];
                                while (var70 > arg0.field796[var68]) {
                                    arg0.field795[var70] = arg0.field795[var70 - 1];
                                    var70--;
                                }
                                int var10002 = arg0.field796[var68]++;
                                while (var68 > 0) {
                                    var10002 = arg0.field796[var68]--;
                                    arg0.field795[arg0.field796[var68]] = arg0.field795[arg0.field796[var68 - 1] + 16 - 1];
                                    var68--;
                                }
                                var10002 = arg0.field796[0]--;
                                arg0.field795[arg0.field796[0]] = var66;
                                if (arg0.field796[0] == 0) {
                                    int var71 = 4095;
                                    for (int var72 = 15; var72 >= 0; var72--) {
                                        for (int var73 = 15; var73 >= 0; var73--) {
                                            arg0.field795[var71] = arg0.field795[arg0.field796[var72] + var73];
                                            var71--;
                                        }
                                        arg0.field796[var72] = var71 + 1;
                                    }
                                }
                            }
                            arg0.field786[arg0.field794[var66 & 0xFF] & 0xFF]++;
                            BZip2State.field790[var58] = arg0.field794[var66 & 0xFF] & 0xFF;
                            var58++;
                            if (var104 == 0) {
                                var53++;
                                var104 = 50;
                                byte var74 = arg0.field797[var53];
                                var20 = arg0.field803[var74];
                                var21 = arg0.field800[var74];
                                var23 = arg0.field802[var74];
                                var22 = arg0.field801[var74];
                            }
                            var104--;
                            int var75 = var20;
                            int var76;
                            byte var77;
                            for (var76 = method266(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
                                var75++;
                                var77 = method265(arg0);
                            }
                            var63 = var23[var76 - var22[var75]];
                        }
                    }
                    arg0.field777 = 0;
                    arg0.field776 = 0;
                    arg0.field788[0] = 0;
                    for (int var85 = 1; var85 <= 256; var85++) {
                        arg0.field788[var85] = arg0.field786[var85 - 1];
                    }
                    for (int var86 = 1; var86 <= 256; var86++) {
                        arg0.field788[var86] += arg0.field788[var86 - 1];
                    }
                    for (int var87 = 0; var87 < var58; var87++) {
                        byte var88 = (byte) (BZip2State.field790[var87] & 0xFF);
                        BZip2State.field790[arg0.field788[var88 & 0xFF]] |= var87 << 8;
                        arg0.field788[var88 & 0xFF]++;
                    }
                    arg0.field784 = BZip2State.field790[arg0.field783] >> 8;
                    arg0.field787 = 0;
                    arg0.field784 = BZip2State.field790[arg0.field784];
                    arg0.field785 = (byte) (arg0.field784 & 0xFF);
                    arg0.field784 >>= 0x8;
                    arg0.field787++;
                    arg0.field804 = var58;
                    method262(arg0);
                    if (arg0.field804 + 1 == arg0.field787 && arg0.field777 == 0) {
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

    @OriginalMember(owner = "rb", name = "c", descriptor = "(Lsb;)B")
    private static byte method264(BZip2State arg0) {
        return (byte) method266(8, arg0);
    }

    @OriginalMember(owner = "rb", name = "d", descriptor = "(Lsb;)B")
    private static byte method265(BZip2State arg0) {
        return (byte) method266(1, arg0);
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "(ILsb;)I")
    private static int method266(int arg0, BZip2State arg1) {
        while (arg1.field780 < arg0) {
            arg1.field779 = arg1.field779 << 8 | arg1.field766[arg1.field767] & 0xFF;
            arg1.field780 += 8;
            arg1.field767++;
            arg1.field768--;
            arg1.field769++;
            if (arg1.field769 == 0) {
                arg1.field770++;
            }
        }
        int var2 = arg1.field779 >> arg1.field780 - arg0 & (0x1 << arg0) - 1;
        arg1.field780 -= arg0;
        return var2;
    }

    @OriginalMember(owner = "rb", name = "e", descriptor = "(Lsb;)V")
    private static void method267(BZip2State arg0) {
        arg0.field791 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field792[var1]) {
                arg0.field794[arg0.field791] = (byte) var1;
                arg0.field791++;
            }
        }
    }

    @OriginalMember(owner = "rb", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method268(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
