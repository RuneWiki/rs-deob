import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class698 implements class64 {

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "Lom;")
    private class344 field9820;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Lqfa;")
    public static class85 field9824 = new class85(14, 2);

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lsk;")
    public static class578 field9825 = new class578();

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
    public static int field9822;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
    public final int method376(int arg0) {
        field9822++;
        if (arg0 != 11878) {
            method3901(null, -84, (byte) -23, -94, null);
        }
        return this.field9820.method2212((byte) 110) ? 100 : this.field9820.method2219(arg0 - 11778);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)[[[B")
    public static final byte[][][] method3900(byte arg0, int arg1) {
        field9819++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if ((var19 >> 1) >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var22 << 1 <= var127) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var25 >> 1 >= var126) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var34 << 1) <= var123) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= var40 << 1) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var43 >> 1) <= var120) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= (var49 >> 1)) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var58 << 1 >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= var61 >> 1) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= var3 / 2) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        if (arg0 != 14) {
            field9824 = null;
        }
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var79 - (var4 / 2)) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - var4 / 2 >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - (var4 / 2)) >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - (var4 / 2) <= var103) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if ((var100 - (var4 / 2)) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lom;)V")
    public class698(class344 arg0) {
        this.field9820 = arg0;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Lwa;")
    public final class569 method378(byte arg0) {
        field9821++;
        return arg0 == 112 ? class569.field8283 : null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([JIBI[Ljava/lang/Object;)V")
    public static final void method3901(long[] arg0, int arg1, byte arg2, int arg3, Object[] arg4) {
        field9823++;
        if (arg2 <= 96 || arg1 >= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        Object var9 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (((long) (var10 & var11) + var7) > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                Object var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg3] = arg4[var6];
        arg4[var6] = var9;
        method3901(arg0, arg1, (byte) 110, var6 - 1, arg4);
        method3901(arg0, var6 + 1, (byte) 99, arg3, arg4);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIBLfa;Lr;II)V")
    public static final void method3902(int arg0, int arg1, byte arg2, class214 arg3, class167 arg4, int arg5, int arg6) {
        field9818++;
        if (class660.field9506 < 100) {
            class409.method2498(arg4, arg3, 10);
        }
        arg4.method142(arg5, arg6, arg5 + arg0, arg1 + arg6);
        if (class660.field9506 < 100) {
            byte var7 = 20;
            int var8 = arg5 + (arg0 / 2);
            int var9 = arg6 + (arg1 / 2) - var7 - 18;
            arg4.method4(arg5, arg6, arg0, arg1, -16777216, 0);
            arg4.method108(var8 - 152, var9, 304, 34, class271.field4054[class568.field8280].getRGB(), 0);
            arg4.method4(var8 - 150, var9 + 2, class660.field9506 * 3, 30, class384.field5652[class568.field8280].getRGB(), 0);
            class367.field5445.method2559(var7 + var9, -1, var8, class265.field3893.method1733(255, class140.field2466), arg2 ^ 0x5C26, class271.field4067[class568.field8280].getRGB());
            return;
        }
        int var10 = class243.field3674 - ((int) ((float) arg0 / class407.field5874));
        int var11 = (int) ((float) arg1 / class407.field5874) + class254.field3763;
        int var12 = (int) ((float) arg0 / class407.field5874) + class243.field3674;
        class431.field6230 = class243.field3674 - ((int) ((float) arg0 / class407.field5874));
        class428.field6172 = class254.field3763 - ((int) ((float) arg1 / class407.field5874));
        int var13 = class254.field3763 - ((int) ((float) arg1 / class407.field5874));
        class42.field1082 = (int) ((float) (arg1 * 2) / class407.field5874);
        class426.field6142 = (int) ((float) (arg0 * 2) / class407.field5874);
        class407.method2495(class407.field5899 + var10, class407.field5902 + var11, class407.field5899 + var12, class407.field5902 + var13, arg5, arg6, arg5 + arg0, arg1 + arg6 + 1);
        class407.method2494(arg4);
        class158 var14 = class407.method2482(arg4);
        class473.method2834((byte) 91, arg4, var14, 0, 0);
        if (class414.field6008 > 0) {
            class42.field1080--;
            if (class42.field1080 == 0) {
                class414.field6008--;
                class42.field1080 = 20;
            }
        }
        if (class239.field3535) {
            int var15 = arg5 + arg0 - 5;
            int var16 = arg6 + arg1 - 8;
            class363.field5394.method2562(16776960, var15, -1, "Fps:" + class349.field5192, 94, var16);
            int var20 = var16 - 15;
            Runtime var17 = Runtime.getRuntime();
            int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
            int var19 = 16776960;
            if (var18 > 65536) {
                var19 = 16711680;
            }
            class363.field5394.method2562(var19, var15, -1, "Mem:" + var18 + "k", 98, var20);
            var16 = var20 - 15;
        }
        if (arg2 != 28) {
            method3902(73, 27, (byte) 97, null, null, -40, 97);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public static void method3903(int arg0) {
        field9824 = null;
        field9825 = null;
        if (arg0 != 17408) {
            method3902(44, 77, (byte) 7, null, null, -24, 44);
        }
    }
}
