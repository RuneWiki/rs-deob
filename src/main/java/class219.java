import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class219 extends class80 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[B")
    public byte[] field3755;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "[B")
    public byte[] field3765;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[Lk;")
    public class177[] field3756;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "[B")
    public byte[] field3760;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[S")
    public short[] field3754;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "[Lch;")
    public class203[] field3767;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "[I")
    private int[] field3759;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lr;")
    public static class66 field3758 = class93.method641(43, "; Max)2Age=");

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "Z")
    public static boolean field3763;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(La;IIIII)V")
    public static final void method1403(class20 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class131.field2449 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class40.field629) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class11.field136 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class16 var14 = class110.field2124[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class30.field453[var11][var12 + 1][var13] + class30.field453[var11][var12][var13] + class30.field453[var11][var12][var13 + 1] + class30.field453[var11][var12 + 1][var13 + 1]) / 4 - (class30.field453[arg1][arg2 + 1][arg3] + class30.field453[arg1][arg2][arg3] + class30.field453[arg1][arg2][arg3 + 1] + class30.field453[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class47 var16 = var14.field205;
                                    if (var16 != null) {
                                        if (var16.field849.method87()) {
                                            arg0.method82(var16.field849, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field852 != null && var16.field852.method87()) {
                                            arg0.method82(var16.field852, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field219; var17++) {
                                        class44 var18 = var14.field220[var17];
                                        if (var18 != null && var18.field779.method87() && (var18.field791 == var12 || var7 == var12) && (var18.field790 == var13 || var9 == var13)) {
                                            int var19 = var18.field775 + 1 - var18.field791;
                                            int var20 = var18.field771 + 1 - var18.field790;
                                            arg0.method82(var18.field779, (var18.field791 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field790 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 >= -123) {
            field3762 = -63;
        }
        field3757++;
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 7 + 1 - arg1 - arg5;
        } else if (var8 == 2) {
            return 8 - arg4 - arg3;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V")
    public final void method1405(int arg0) {
        field3766++;
        this.field3759 = null;
        if (arg0 != 4) {
            method1407(66);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lbi;[I[BB)Z")
    public final boolean method1406(class133 arg0, int[] arg1, byte[] arg2, byte arg3) {
        field3761++;
        class177 var5 = null;
        int var6 = 0;
        boolean var7 = true;
        int var8 = 40 / ((5 - arg3) / 33);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg2 == null || arg2[var9] != 0) {
                int var10 = this.field3759[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var5 = arg0.method921(0, arg1, var10 >> 2);
                        } else {
                            var5 = arg0.method925(var10 >> 2, (byte) 53, arg1);
                        }
                        if (var5 == null) {
                            var7 = false;
                        }
                    }
                    if (var5 != null) {
                        this.field3756[var9] = var5;
                        this.field3759[var9] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3758 = null;
        if (arg0 != -1) {
            method1404(-24, 78, 74, 122, -54, -27, (byte) 10);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class219() {
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "([B)V")
    public class219(byte[] arg0) {
        this.field3755 = new byte[128];
        this.field3765 = new byte[128];
        this.field3756 = new class177[128];
        this.field3760 = new byte[128];
        this.field3754 = new short[128];
        this.field3767 = new class203[128];
        int var2 = 0;
        this.field3759 = new int[128];
        class249 var3 = new class249(arg0);
        while (var3.field4350[var3.field4335 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1682(3390);
        }
        var3.field4335++;
        int var6 = var3.field4335;
        var2++;
        int var7 = 0;
        var3.field4335 += var2;
        while (var3.field4350[var3.field4335 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1682(3390);
        }
        var7++;
        var3.field4335++;
        int var10 = var3.field4335;
        var3.field4335 += var7;
        int var11;
        for (var11 = 0; var3.field4350[var3.field4335 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1682(3390);
        }
        var11++;
        var3.field4335++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1677(-6677);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class203[] var19 = new class203[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class203 var103 = var19[var20] = new class203();
            int var104 = var3.method1677(-6677);
            if (var104 > 0) {
                var103.field3481 = new byte[var104 * 2];
            }
            int var105 = var3.method1677(-6677);
            if (var105 > 0) {
                var103.field3479 = new byte[var105 * 2 + 2];
                var103.field3479[1] = 64;
            }
        }
        int var21 = 0;
        int var22 = var3.method1677(-6677);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24 = var3.method1677(-6677);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field4350[var3.field4335 + var21] != 0) {
            var21++;
        }
        byte[] var26 = new byte[var21];
        for (int var27 = 0; var27 < var21; var27++) {
            var26[var27] = var3.method1682(3390);
        }
        var3.field4335++;
        var21++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1677(-6677);
            this.field3754[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1677(-6677);
            this.field3754[var31] = (short) (this.field3754[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var3.method1654(true);
            }
            this.field3754[var35] = (short) (this.field3754[var35] + class115.method767(32768, var34 - 1 << 14));
            var32--;
            this.field3759[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3759[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var3.field4350[var6++] - 1;
                }
                this.field3760[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3759[var43] != 0) {
                if (var42 == 0) {
                    var40 = var3.field4350[var10++] + 16 << 2;
                    if (var41 < var8.length) {
                        var42 = var8[var41++];
                    } else {
                        var42 = -1;
                    }
                }
                this.field3765[var43] = (byte) var40;
                var42--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class203 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3759[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field3767[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var26.length <= var48) {
                    var50 = -1;
                } else {
                    var50 = var26[var48++];
                }
                if (this.field3759[var51] > 0) {
                    var49 = var3.method1677(-6677) + 1;
                }
            }
            this.field3755[var51] = (byte) var49;
            var50--;
        }
        this.field3764 = var3.method1677(-6677) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class203 var100 = var19[var52];
            if (var100.field3481 != null) {
                for (int var101 = 1; var101 < var100.field3481.length; var101 += 2) {
                    var100.field3481[var101] = var3.method1682(3390);
                }
            }
            if (var100.field3479 != null) {
                for (int var102 = 3; var102 < (var100.field3479.length - 2); var102 += 2) {
                    var100.field3479[var102] = var3.method1682(3390);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1682(3390);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1682(3390);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class203 var97 = var19[var55];
            if (var97.field3479 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3479.length; var99 += 2) {
                    var98 = var98 + var3.method1677(-6677) + 1;
                    var97.field3479[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class203 var94 = var19[var56];
            if (var94.field3481 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3481.length; var96 += 2) {
                    var95 = var95 + var3.method1677(-6677) + 1;
                    var94.field3481[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1677(-6677);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var3.method1677(-6677) + var57 + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3755[var61] = (byte) (this.field3755[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var23.length) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class44.method316(503159455, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field3755[var68] = (byte) (this.field3755[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3755[var64] = (byte) (this.field3755[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method1677(-6677);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method1677(-6677) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3765[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3765[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class44.method316(503159455, var79 - var72, var81);
                    int var84 = (this.field3765[var82] & 0xFF) + var83;
                    var81 += var80 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3765[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field3765[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3765[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field3483 = var3.method1677(-6677);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class203 var93 = var19[var87];
            if (var93.field3481 != null) {
                var93.field3492 = var3.method1677(-6677);
            }
            if (var93.field3479 != null) {
                var93.field3488 = var3.method1677(-6677);
            }
            if (var93.field3483 > 0) {
                var93.field3476 = var3.method1677(-6677);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field3482 = var3.method1677(-6677);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class203 var92 = var19[var89];
            if (var92.field3482 > 0) {
                var92.field3491 = var3.method1677(-6677);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class203 var91 = var19[var90];
            if (var91.field3491 > 0) {
                var91.field3489 = var3.method1677(-6677);
            }
        }
    }
}
