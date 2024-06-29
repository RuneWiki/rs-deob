import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class452 extends class425 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[Lun;")
    public class243[] field6470;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[Lbg;")
    public class272[] field6481;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[B")
    public byte[] field6471;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "[B")
    public byte[] field6488;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "[I")
    private int[] field6486;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "[S")
    public short[] field6487;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "[B")
    public byte[] field6476;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public int field6473;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field6489 = 0;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "J")
    public static long field6483;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Lvq;")
    public static class269 field6482;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I[BLij;[I)Z")
    public final boolean method2813(int arg0, byte[] arg1, class242 arg2, int[] arg3) {
        field6472++;
        boolean var5 = true;
        int var6 = arg0;
        class272 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field6486[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1652(var9 >> 2, (byte) -121, arg3);
                        } else {
                            var7 = arg2.method1647(arg3, (byte) -93, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6481[var8] = var7;
                        this.field6486[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
    public static void method2814(byte arg0) {
        int var1 = 111 / ((7 - arg0) / 47);
        field6482 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIZBIII)Z")
    public static final boolean method2815(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, byte arg7, int arg8, int arg9, int arg10) {
        field6479++;
        int var11 = class384.method2443(class333.field4840, arg10, arg8, 0, arg6, arg5, arg9, arg0, class186.field2660, class181.field2555.method773((byte) 110), arg1, class85.field1090[class158.field2302], arg4, arg2, arg3);
        if (var11 < 1) {
            return false;
        }
        class218.field3132 = class333.field4840[var11 - 1];
        class72.field944 = class186.field2660[var11 - 1];
        class53.field690 = false;
        if (arg7 != -11) {
            field6483 = 57L;
        }
        class28.method152((byte) 115);
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public final void method2816(boolean arg0) {
        if (!arg0) {
            field6482 = null;
        }
        this.field6486 = null;
        field6480++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZZI)Ltj;")
    public static final class108 method2817(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field6484++;
        class233 var5 = null;
        if (arg0 != 1000000) {
            field6483 = -2L;
        }
        if (class105.field1349 != null) {
            var5 = new class233(arg1, class105.field1349, class43.field585[arg1], 1000000);
        }
        class258.field3825[arg1] = class293.field4240.method2719(arg1, class243.field3587, var5, (byte) 78);
        if (arg3) {
            class258.field3825[arg1].method1273((byte) -79);
        }
        return new class108(class258.field3825[arg1], arg2, arg4);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)Lhl;")
    public static final class311 method2818(int arg0, int arg1, int arg2, int arg3) {
        field6485++;
        class74 var4 = class385.field5449[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        if (arg3 != -805450585) {
            method2822(-4, (class108) null);
        }
        class311 var5 = null;
        int var6 = -1;
        for (class353 var7 = var4.field970; var7 != null; var7 = var7.field5127) {
            class306 var8 = var7.field5125;
            if (var8 instanceof class311) {
                class311 var9 = (class311) var8;
                int var10 = (var9.method773((byte) 34) - 1) * 64 + 60;
                int var11 = var9.field4463 - var10 >> 7;
                int var12 = var9.field4466 - var10 >> 7;
                int var13 = var9.field4463 + var10 >> 7;
                int var14 = var9.field4466 + var10 >> 7;
                if (arg1 >= var11 && var12 <= arg2 && var13 >= arg1 && var14 >= arg2) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)I")
    public static final int method2819(byte arg0, int arg1) {
        field6474++;
        class361 var2 = class269.method1834(arg1, 0);
        if (arg0 > -115) {
            field6489 = -72;
        }
        int var3 = var2.field5206;
        int var4 = var2.field5199;
        int var5 = var2.field5205;
        int var6 = class136.field2107[var5 - var4];
        return var6 & class150.field2254[var3] >> var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZI)I")
    public static final int method2820(int arg0, int arg1, boolean arg2, int arg3) {
        field6478++;
        if (class439.field6280 == null) {
            return 0;
        }
        int var4 = arg3 >> 7;
        if (arg2) {
            field6483 = 56L;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class80.field1034 - 1 || var5 > class381.field5414 - 1) {
            return 0;
        }
        int var6 = arg0;
        if (arg0 < 3 && (class320.field4692[1][var4][var5] & 0x2) != 0) {
            var6 = arg0 + 1;
        }
        return class439.field6280[var6].method360(arg3, arg1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIII)V")
    public static final void method2821(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6475++;
        if (arg3 != -1352) {
            method2818(85, 29, -105, 109);
        }
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        class5.method17(class440.field6288[arg4], arg0 + arg5, arg2, (byte) 84, arg0 - arg5);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg0 + var6;
            int var24 = arg0 - var6;
            class5.method17(class440.field6288[var21], var23, arg2, (byte) 113, var24);
            class5.method17(class440.field6288[var22], var23, arg2, (byte) 86, var24);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILtj;)V")
    public static final void method2822(int arg0, class108 arg1) {
        class331.field4779 = arg1;
        field6477++;
        class88.field1158 = class331.field4779.method651(0, arg0);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
    public class452() {
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    public class452(byte[] arg0) {
        this.field6470 = new class243[128];
        this.field6481 = new class272[128];
        this.field6471 = new byte[128];
        this.field6488 = new byte[128];
        this.field6486 = new int[128];
        this.field6487 = new short[128];
        this.field6476 = new byte[128];
        class130 var2 = new class130(arg0);
        int var3;
        for (var3 = 0; var2.field1851[var2.field1880 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method823((byte) -49);
        }
        var2.field1880++;
        var3++;
        int var6 = var2.field1880;
        var2.field1880 += var3;
        int var7;
        for (var7 = 0; var2.field1851[var2.field1880 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method823((byte) 104);
        }
        var7++;
        var2.field1880++;
        int var10 = var2.field1880;
        var2.field1880 += var7;
        int var11;
        for (var11 = 0; var2.field1851[var2.field1880 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method823((byte) 113);
        }
        var11++;
        var2.field1880++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method837(true);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class243[] var19 = new class243[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class243 var103 = var19[var20] = new class243();
            int var104 = var2.method837(true);
            if (var104 > 0) {
                var103.field3592 = new byte[var104 * 2];
            }
            int var105 = var2.method837(true);
            if (var105 > 0) {
                var103.field3588 = new byte[var105 * 2 + 2];
                var103.field3588[1] = 64;
            }
        }
        int var21 = var2.method837(true);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method837(true);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field1851[var2.field1880 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method823((byte) 105);
        }
        var25++;
        var2.field1880++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method837(true);
            this.field6487[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method837(true);
            this.field6487[var31] = (short) (this.field6487[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method845(1228);
            }
            this.field6487[var35] = (short) (this.field6487[var35] + (class209.method1483(var34 - 1, 2) << 14));
            this.field6486[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6486[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field1851[var6++] - 1;
                }
                this.field6476[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6486[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field1851[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field6488[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class243 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6486[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field6470[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field6486[var51] > 0) {
                    var50 = var2.method837(true) + 1;
                }
            }
            var49--;
            this.field6471[var51] = (byte) var50;
        }
        this.field6473 = var2.method837(true) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class243 var100 = var19[var52];
            if (var100.field3592 != null) {
                for (int var101 = 1; var101 < var100.field3592.length; var101 += 2) {
                    var100.field3592[var101] = var2.method823((byte) 108);
                }
            }
            if (var100.field3588 != null) {
                for (int var102 = 3; var102 < (var100.field3588.length - 2); var102 += 2) {
                    var100.field3588[var102] = var2.method823((byte) 117);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method823((byte) 110);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method823((byte) 109);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class243 var97 = var19[var55];
            if (var97.field3588 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3588.length; var99 += 2) {
                    var98 = (var98 + var2.method837(true)) + 1;
                    var97.field3588[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class243 var94 = var19[var56];
            if (var94.field3592 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3592.length; var96 += 2) {
                    var95 = var2.method837(true) + var95 + 1;
                    var94.field3592[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method837(true);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method837(true) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6471[var61] = (byte) (this.field6471[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class86.method514(var67, (byte) 120, var65 - var59);
                    var67 += var66 - var60;
                    this.field6471[var68] = (byte) (this.field6471[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field6471[var64] = (byte) (this.field6471[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method837(true);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method837(true) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6488[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6488[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class86.method514(var81, (byte) 124, var79 - var72);
                    int var84 = (this.field6488[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field6488[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field6488[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6488[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3600 = var2.method837(true);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class243 var93 = var19[var87];
            if (var93.field3592 != null) {
                var93.field3590 = var2.method837(true);
            }
            if (var93.field3588 != null) {
                var93.field3597 = var2.method837(true);
            }
            if (var93.field3600 > 0) {
                var93.field3595 = var2.method837(true);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3594 = var2.method837(true);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class243 var92 = var19[var89];
            if (var92.field3594 > 0) {
                var92.field3599 = var2.method837(true);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class243 var91 = var19[var90];
            if (var91.field3599 > 0) {
                var91.field3598 = var2.method837(true);
            }
        }
    }
}
