import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class BZip2 {

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Ln;")
    private static BZip2State field95 = new BZip2State();

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(Ln;)B")
    private static byte method53(BZip2State arg0) {
        return (byte) method60(8, arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(Ln;)V")
    private static void method54(BZip2State arg0) {
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
        boolean var20 = false;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        arg0.field121 = 1;
        if (BZip2State.field130 == null) {
            BZip2State.field130 = new int[arg0.field121 * 100000];
        }
        boolean var25 = true;
        while (true) {
            while (var25) {
                byte var26 = method53(arg0);
                if (var26 == 23) {
                    return;
                }
                byte var27 = method53(arg0);
                byte var28 = method53(arg0);
                byte var29 = method53(arg0);
                byte var30 = method53(arg0);
                byte var31 = method53(arg0);
                arg0.field122++;
                byte var32 = method53(arg0);
                byte var33 = method53(arg0);
                byte var34 = method53(arg0);
                byte var35 = method53(arg0);
                byte var36 = method57(arg0);
                if (var36 == 0) {
                    arg0.field118 = false;
                } else {
                    arg0.field118 = true;
                }
                if (arg0.field118) {
                    System.out.println("PANIC! RANDOMISED BLOCK!");
                }
                arg0.field123 = 0;
                byte var37 = method53(arg0);
                arg0.field123 = arg0.field123 << 8 | var37 & 0xFF;
                byte var38 = method53(arg0);
                arg0.field123 = arg0.field123 << 8 | var38 & 0xFF;
                byte var39 = method53(arg0);
                arg0.field123 = arg0.field123 << 8 | var39 & 0xFF;
                for (int var40 = 0; var40 < 16; var40++) {
                    byte var104 = method57(arg0);
                    if (var104 == 1) {
                        arg0.field133[var40] = true;
                    } else {
                        arg0.field133[var40] = false;
                    }
                }
                for (int var41 = 0; var41 < 256; var41++) {
                    arg0.field132[var41] = false;
                }
                for (int var42 = 0; var42 < 16; var42++) {
                    if (arg0.field133[var42]) {
                        for (int var102 = 0; var102 < 16; var102++) {
                            byte var103 = method57(arg0);
                            if (var103 == 1) {
                                arg0.field132[var42 * 16 + var102] = true;
                            }
                        }
                    }
                }
                method56(arg0);
                int var43 = arg0.field131 + 2;
                int var44 = method60(3, arg0);
                int var45 = method60(15, arg0);
                for (int var46 = 0; var46 < var45; var46++) {
                    int var100 = 0;
                    while (true) {
                        byte var101 = method57(arg0);
                        if (var101 == 0) {
                            arg0.field138[var46] = (byte) var100;
                            break;
                        }
                        var100++;
                    }
                }
                byte[] var47 = new byte[6];
                byte var48 = 0;
                while (var48 < var44) {
                    var47[var48] = var48++;
                }
                for (int var49 = 0; var49 < var45; var49++) {
                    byte var98 = arg0.field138[var49];
                    byte var99 = var47[var98];
                    while (var98 > 0) {
                        var47[var98] = var47[var98 - 1];
                        var98 += -1;
                    }
                    var47[0] = var99;
                    arg0.field137[var49] = var99;
                }
                for (int var50 = 0; var50 < var44; var50++) {
                    int var94 = method60(5, arg0);
                    for (int var95 = 0; var95 < var43; var95++) {
                        while (true) {
                            byte var96 = method57(arg0);
                            if (var96 == 0) {
                                arg0.field139[var50][var95] = (byte) var94;
                                break;
                            }
                            byte var97 = method57(arg0);
                            if (var97 == 0) {
                                var94++;
                            } else {
                                var94--;
                            }
                        }
                    }
                }
                for (int var51 = 0; var51 < var44; var51++) {
                    byte var91 = 32;
                    byte var92 = 0;
                    for (int var93 = 0; var93 < var43; var93++) {
                        if (arg0.field139[var51][var93] > var92) {
                            var92 = arg0.field139[var51][var93];
                        }
                        if (arg0.field139[var51][var93] < var91) {
                            var91 = arg0.field139[var51][var93];
                        }
                    }
                    method58(arg0.field140[var51], arg0.field141[var51], arg0.field142[var51], arg0.field139[var51], var91, var92, var43);
                    arg0.field143[var51] = var91;
                }
                int var52 = arg0.field131 + 1;
                int var53 = arg0.field121 * 100000;
                int var54 = -1;
                byte var55 = 0;
                for (int var56 = 0; var56 <= 255; var56++) {
                    arg0.field126[var56] = 0;
                }
                int var57 = 4095;
                for (int var58 = 15; var58 >= 0; var58--) {
                    for (int var90 = 15; var90 >= 0; var90--) {
                        arg0.field135[var57] = (byte) (var58 * 16 + var90);
                        var57--;
                    }
                    arg0.field136[var58] = var57 + 1;
                }
                int var59 = 0;
                if (var55 == 0) {
                    var54++;
                    var55 = 50;
                    byte var60 = arg0.field137[var54];
                    var21 = arg0.field143[var60];
                    var22 = arg0.field140[var60];
                    var24 = arg0.field142[var60];
                    var23 = arg0.field141[var60];
                }
                int var105 = var55 - 1;
                int var61 = var21;
                int var62;
                byte var89;
                for (var62 = method60(var21, arg0); var62 > var22[var61]; var62 = var62 << 1 | var89) {
                    var61++;
                    var89 = method57(arg0);
                }
                int var63 = var24[var62 - var23[var61]];
                while (true) {
                    while (var52 != var63) {
                        if (var63 == 0 || var63 == 1) {
                            int var82 = -1;
                            int var83 = 1;
                            do {
                                if (var63 == 0) {
                                    var82 += var83;
                                } else if (var63 == 1) {
                                    var82 += var83 * 2;
                                }
                                var83 *= 2;
                                if (var105 == 0) {
                                    var54++;
                                    var105 = 50;
                                    byte var84 = arg0.field137[var54];
                                    var21 = arg0.field143[var84];
                                    var22 = arg0.field140[var84];
                                    var24 = arg0.field142[var84];
                                    var23 = arg0.field141[var84];
                                }
                                var105--;
                                int var85 = var21;
                                int var86;
                                byte var88;
                                for (var86 = method60(var21, arg0); var86 > var22[var85]; var86 = var86 << 1 | var88) {
                                    var85++;
                                    var88 = method57(arg0);
                                }
                                var63 = var24[var86 - var23[var85]];
                            } while (var63 == 0 || var63 == 1);
                            var82++;
                            byte var87 = arg0.field134[arg0.field135[arg0.field136[0]] & 0xFF];
                            arg0.field126[var87 & 0xFF] += var82;
                            while (var82 > 0) {
                                BZip2State.field130[var59] = var87 & 0xFF;
                                var59++;
                                var82--;
                            }
                        } else {
                            int var68 = var63 - 1;
                            byte var70;
                            if (var68 < 16) {
                                int var69 = arg0.field136[0];
                                var70 = arg0.field135[var68 + var69];
                                while (var68 > 3) {
                                    int var71 = var68 + var69;
                                    arg0.field135[var71] = arg0.field135[var71 - 1];
                                    arg0.field135[var71 - 1] = arg0.field135[var71 - 2];
                                    arg0.field135[var71 - 2] = arg0.field135[var71 - 3];
                                    arg0.field135[var71 - 3] = arg0.field135[var71 - 4];
                                    var68 -= 4;
                                }
                                while (var68 > 0) {
                                    arg0.field135[var68 + var69] = arg0.field135[var68 + var69 - 1];
                                    var68--;
                                }
                                arg0.field135[var69] = var70;
                            } else {
                                int var72 = var68 / 16;
                                int var73 = var68 % 16;
                                int var74 = arg0.field136[var72] + var73;
                                var70 = arg0.field135[var74];
                                while (var74 > arg0.field136[var72]) {
                                    arg0.field135[var74] = arg0.field135[var74 - 1];
                                    var74--;
                                }
                                int var10002 = arg0.field136[var72]++;
                                while (var72 > 0) {
                                    arg0.field136[var72] += -1;
                                    arg0.field135[arg0.field136[var72]] = arg0.field135[arg0.field136[var72 - 1] + 16 - 1];
                                    var72--;
                                }
                                arg0.field136[0] += -1;
                                arg0.field135[arg0.field136[0]] = var70;
                                if (arg0.field136[0] == 0) {
                                    int var75 = 4095;
                                    for (int var76 = 15; var76 >= 0; var76--) {
                                        for (int var77 = 15; var77 >= 0; var77--) {
                                            arg0.field135[var75] = arg0.field135[arg0.field136[var76] + var77];
                                            var75--;
                                        }
                                        arg0.field136[var76] = var75 + 1;
                                    }
                                }
                            }
                            arg0.field126[arg0.field134[var70 & 0xFF] & 0xFF]++;
                            BZip2State.field130[var59] = arg0.field134[var70 & 0xFF] & 0xFF;
                            var59++;
                            if (var105 == 0) {
                                var54++;
                                var105 = 50;
                                byte var78 = arg0.field137[var54];
                                var21 = arg0.field143[var78];
                                var22 = arg0.field140[var78];
                                var24 = arg0.field142[var78];
                                var23 = arg0.field141[var78];
                            }
                            var105--;
                            int var79 = var21;
                            int var80;
                            byte var81;
                            for (var80 = method60(var21, arg0); var80 > var22[var79]; var80 = var80 << 1 | var81) {
                                var79++;
                                var81 = method57(arg0);
                            }
                            var63 = var24[var80 - var23[var79]];
                        }
                    }
                    arg0.field117 = 0;
                    arg0.field116 = 0;
                    arg0.field128[0] = 0;
                    for (int var64 = 1; var64 <= 256; var64++) {
                        arg0.field128[var64] = arg0.field126[var64 - 1];
                    }
                    for (int var65 = 1; var65 <= 256; var65++) {
                        arg0.field128[var65] += arg0.field128[var65 - 1];
                    }
                    for (int var66 = 0; var66 < var59; var66++) {
                        byte var67 = (byte) (BZip2State.field130[var66] & 0xFF);
                        BZip2State.field130[arg0.field128[var67 & 0xFF]] |= var66 << 8;
                        arg0.field128[var67 & 0xFF]++;
                    }
                    arg0.field124 = BZip2State.field130[arg0.field123] >> 8;
                    arg0.field127 = 0;
                    arg0.field124 = BZip2State.field130[arg0.field124];
                    arg0.field125 = (byte) (arg0.field124 & 0xFF);
                    arg0.field124 >>= 0x8;
                    arg0.field127++;
                    arg0.field144 = var59;
                    method55(arg0);
                    if (arg0.field144 + 1 == arg0.field127 && arg0.field117 == 0) {
                        var25 = true;
                        break;
                    }
                    var25 = false;
                    break;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "(Ln;)V")
    private static void method55(BZip2State arg0) {
        byte var1 = arg0.field116;
        int var2 = arg0.field117;
        int var3 = arg0.field127;
        int var4 = arg0.field125;
        int[] var5 = BZip2State.field130;
        int var6 = arg0.field124;
        byte[] var7 = arg0.field111;
        int var8 = arg0.field112;
        int var9 = arg0.field113;
        int var10 = var9;
        int var11 = arg0.field144 + 1;
        label69: while (true) {
            if (var2 > 0) {
                while (true) {
                    if (var9 == 0) {
                        break label69;
                    }
                    if (var2 == 1) {
                        if (var9 == 0) {
                            var2 = 1;
                            break label69;
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
                    break label69;
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
                        break label69;
                    }
                    var7[var8] = var1;
                    var8++;
                    var9--;
                    var12 = true;
                } else if (var3 == var11) {
                    if (var9 == 0) {
                        var2 = 1;
                        break label69;
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
        int var23 = arg0.field114;
        arg0.field114 += var10 - var9;
        if (arg0.field114 < var23) {
            arg0.field115++;
        }
        arg0.field116 = var1;
        arg0.field117 = var2;
        arg0.field127 = var3;
        arg0.field125 = var4;
        BZip2State.field130 = var5;
        arg0.field124 = var6;
        arg0.field111 = var7;
        arg0.field112 = var8;
        arg0.field113 = var9;
    }

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "(Ln;)V")
    private static void method56(BZip2State arg0) {
        arg0.field131 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            if (arg0.field132[var1]) {
                arg0.field134[arg0.field131] = (byte) var1;
                arg0.field131++;
            }
        }
    }

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "(Ln;)B")
    private static byte method57(BZip2State arg0) {
        return (byte) method60(1, arg0);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[I[I[BIII)V")
    private static void method58(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([BI[BII)I")
    public static int method59(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        BZip2State var5 = field95;
        synchronized (field95) {
            field95.field106 = arg2;
            field95.field107 = arg4;
            field95.field111 = arg0;
            field95.field112 = 0;
            field95.field108 = arg3;
            field95.field113 = arg1;
            field95.field120 = 0;
            field95.field119 = 0;
            field95.field109 = 0;
            field95.field110 = 0;
            field95.field114 = 0;
            field95.field115 = 0;
            field95.field122 = 0;
            method54(field95);
            return arg1 - field95.field113;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(ILn;)I")
    private static int method60(int arg0, BZip2State arg1) {
        while (arg1.field120 < arg0) {
            arg1.field119 = arg1.field119 << 8 | arg1.field106[arg1.field107] & 0xFF;
            arg1.field120 += 8;
            arg1.field107++;
            arg1.field108 += -1;
            arg1.field109++;
            if (arg1.field109 == 0) {
                arg1.field110++;
            }
        }
        int var2 = arg1.field119 >> arg1.field120 - arg0 & (0x1 << arg0) - 1;
        arg1.field120 -= arg0;
        return var2;
    }
}
