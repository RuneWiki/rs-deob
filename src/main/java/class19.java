import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Lwm;")
    private class399 field306 = new class399(64);

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Lph;")
    private class459 field309;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "Ls;")
    public static class186 field304 = new class186(104, 2);

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
    public static int[] field310 = new int[5];

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "[I")
    public static int[] field313 = new int[14];

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "Lwm;")
    public static class399 field311 = new class399(64);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)Ljh;", line = 5)
    public final class112 method126(boolean arg0, int arg1) {
        if (arg0) {
            method127((byte) -109);
        }
        field302++;
        class399 var3 = this.field306;
        class112 var4;
        synchronized (this.field306) {
            var4 = (class112) this.field306.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field309;
        byte[] var6;
        synchronized (this.field309) {
            var6 = this.field309.method2757(19, arg1, (byte) -127);
        }
        class112 var7 = new class112();
        if (var6 != null) {
            var7.method934((byte) -88, new class289(var6));
        }
        class399 var8 = this.field306;
        synchronized (this.field306) {
            this.field306.method2472(100, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 38)
    public static void method127(byte arg0) {
        field313 = null;
        if (arg0 != -50) {
            field313 = null;
        }
        field311 = null;
        field304 = null;
        field310 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(II)[[[B", line = 51)
    public static final byte[][][] method128(int arg0, int arg1) {
        field305++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
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
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var21 < var20.length) {
                    if (var127 >= (var22 << 1)) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        if (arg1 != -18606) {
            return null;
        }
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
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
                if (var122 <= (var37 >> 1)) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var40 << 1 <= var121) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var43 >> 1 <= var120) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
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
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= (var55 >> 1)) {
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
                if (var115 <= var58 << 1) {
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
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var4 / 2) >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var4 / 2 <= var76) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
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
                if (var106 <= var85 - var4 / 2) {
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
                if (var88 - var4 / 2 >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
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
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - var4 / 2) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)I", line = 832)
    public static final int method129(int arg0, String arg1) {
        if (arg0 >= -45) {
            method128(31, 123);
        }
        field303++;
        return class250.method1623(arg1, true, (byte) -42, 10);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IC)Z", line = 847)
    public static final boolean method130(int arg0, char arg1) {
        field308++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != -26128) {
            method127((byte) -46);
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 872)
    public class19(class341 arg0, int arg1, class459 arg2) {
        this.field309 = arg2;
        this.field307 = this.field309.method2763(19, -3);
    }
}
