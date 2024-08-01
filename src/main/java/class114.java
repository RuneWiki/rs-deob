import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mb")
public class class114 extends class71 {

    @OriginalMember(owner = "mb", name = "n", descriptor = "[S")
    public short[] field2254;

    @OriginalMember(owner = "mb", name = "s", descriptor = "[Lne;")
    public class126[] field2259;

    @OriginalMember(owner = "mb", name = "v", descriptor = "[Lk;")
    public class94[] field2262;

    @OriginalMember(owner = "mb", name = "w", descriptor = "[B")
    public byte[] field2263;

    @OriginalMember(owner = "mb", name = "r", descriptor = "[B")
    public byte[] field2258;

    @OriginalMember(owner = "mb", name = "u", descriptor = "[I")
    private int[] field2261;

    @OriginalMember(owner = "mb", name = "q", descriptor = "[B")
    public byte[] field2257;

    @OriginalMember(owner = "mb", name = "o", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "mb", name = "y", descriptor = "[Llf;")
    public static class109[] field2265 = new class109[200];

    @OriginalMember(owner = "mb", name = "p", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "mb", name = "t", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "mb", name = "x", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "mb", name = "z", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "mb", name = "A", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "mb", name = "a", descriptor = "([IIIIIII)V")
    public static final void method839(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class26.field549 = arg5;
        class23.field522 = new boolean[8][32][class26.field549 + class26.field549 + 1][class26.field549 + class26.field549 + 1];
        class24.field543 = 0;
        class44.field919 = 0;
        class193.field3696 = arg3;
        class128.field2482 = arg4;
        class130.field2520 = arg3 / 2;
        class4.field46 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class26.field549 + class26.field549 + 3][class26.field549 + class26.field549 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class142.field2743 = class124.field2383[var8];
                class118.field2330 = class124.field2387[var8];
                class185.field3528 = class124.field2383[var16];
                class50.field1023 = class124.field2387[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class26.field549 + 1); var19 <= class26.field549 + 1; var19++) {
                    for (int var20 = -(class26.field549 + 1); var20 <= class26.field549 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class76.method482(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class26.field549 + var19 + 1][class26.field549 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class26.field549; var11 < class26.field549; var11++) {
                    for (int var12 = -class26.field549; var12 < class26.field549; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class26.field549 + 1][var12 + var15 + class26.field549 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class26.field549 + 1][var12 + var15 + class26.field549 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class26.field549 + 1][var12 + var15 + class26.field549 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class26.field549 + 1][var12 + var15 + class26.field549 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class23.field522[var9][var10][class26.field549 + var11][class26.field549 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I[BLcb;[I)Z")
    public final boolean method840(int arg0, byte[] arg1, class23 arg2, int[] arg3) {
        if (arg0 != -8812) {
            method842(49);
        }
        class94 var5 = null;
        field2264++;
        boolean var6 = true;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2261[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var5 = arg2.method208(arg3, (byte) -120, var9 >> 2);
                        } else {
                            var5 = arg2.method210(1, var9 >> 2, arg3);
                        }
                        if (var5 == null) {
                            var6 = false;
                        }
                    }
                    if (var5 != null) {
                        this.field2262[var8] = var5;
                        this.field2261[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        field2256++;
        int var1 = -35 % ((arg0 + 12) / 41);
        for (class81 var2 = (class81) class47.field976.method1230(121); var2 != null; var2 = (class81) class47.field976.method1234(-1)) {
            if (var2.field1600 > 0) {
                var2.field1600--;
            }
            if (var2.field1600 != 0) {
                if (var2.field1605 > 0) {
                    var2.field1605--;
                }
                if (var2.field1605 == 0 && var2.field1595 >= 1 && var2.field1590 >= 1 && var2.field1595 <= 102 && var2.field1590 <= 102 && (var2.field1598 < 0 || class27.method224(var2.field1601, true, var2.field1598))) {
                    class40.method293(var2.field1590, var2.field1591, var2.field1595, true, var2.field1601, var2.field1606, var2.field1602, var2.field1598);
                    var2.field1605 = -1;
                    if (var2.field1598 == var2.field1593 && var2.field1593 == -1) {
                        var2.method452(true);
                    } else if (var2.field1598 == var2.field1593 && var2.field1602 == var2.field1599 && var2.field1601 == var2.field1597) {
                        var2.method452(true);
                    }
                }
            } else if (var2.field1593 < 0 || class27.method224(var2.field1597, true, var2.field1593)) {
                class40.method293(var2.field1590, var2.field1591, var2.field1595, true, var2.field1597, var2.field1606, var2.field1599, var2.field1593);
                var2.method452(true);
            }
        }
    }

    @OriginalMember(owner = "mb", name = "b", descriptor = "(I)V")
    public static void method842(int arg0) {
        field2265 = null;
        if (arg0 != 2) {
            field2267 = 87;
        }
    }

    @OriginalMember(owner = "mb", name = "a", descriptor = "(IB)Llf;")
    public static final class109 method843(int arg0, byte arg1) {
        if (arg1 > -34) {
            method843(105, (byte) 52);
        }
        field2266++;
        return class183.field3438[arg0].method786(-30593) > 0 ? class36.method279(new class109[] { class115.field2282[arg0], class34.field753, class183.field3438[arg0] }, 115) : class115.field2282[arg0];
    }

    @OriginalMember(owner = "mb", name = "c", descriptor = "(B)V")
    public final void method844(byte arg0) {
        if (arg0 == 53) {
            this.field2261 = null;
            field2260++;
        }
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "()V")
    public class114() {
    }

    @OriginalMember(owner = "mb", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        this.field2254 = new short[128];
        this.field2259 = new class126[128];
        int var2 = 0;
        this.field2262 = new class94[128];
        this.field2263 = new byte[128];
        this.field2258 = new byte[128];
        this.field2261 = new int[128];
        this.field2257 = new byte[128];
        class86 var3 = new class86(arg0);
        while (var3.field1808[var3.field1773 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method584(3);
        }
        var3.field1773++;
        var2++;
        int var6 = var3.field1773;
        var3.field1773 += var2;
        int var7;
        for (var7 = 0; var3.field1808[var3.field1773 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method584(3);
        }
        var3.field1773++;
        int var10 = var3.field1773;
        int var11 = 0;
        var7++;
        var3.field1773 += var7;
        while (var3.field1808[var3.field1773 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method584(3);
        }
        var3.field1773++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method598((byte) 76);
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
        class126[] var19 = new class126[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class126 var103 = var19[var20] = new class126();
            int var104 = var3.method598((byte) 69);
            if (var104 > 0) {
                var103.field2433 = new byte[var104 * 2];
            }
            int var105 = var3.method598((byte) 79);
            if (var105 > 0) {
                var103.field2445 = new byte[var105 * 2 + 2];
                var103.field2445[1] = 64;
            }
        }
        int var21 = var3.method598((byte) 91);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = 0;
        int var24 = var3.method598((byte) 124);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var3.field1808[var3.field1773 + var23] != 0) {
            var23++;
        }
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var3.method584(3);
        }
        var23++;
        int var28 = 0;
        var3.field1773++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method598((byte) 127);
            this.field2254[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method598((byte) 77);
            this.field2254[var31] = (short) (this.field2254[var31] + (var30 << 8));
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
                var34 = var3.method555(116);
            }
            var32--;
            this.field2254[var35] = (short) (this.field2254[var35] + (class170.method1140(2, var34 - 1) << 14));
            this.field2261[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2261[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var3.field1808[var6++] - 1;
                }
                this.field2257[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2261[var43] != 0) {
                if (var42 == 0) {
                    var41 = var3.field1808[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var42 = -1;
                    } else {
                        var42 = var8[var40++];
                    }
                }
                var42--;
                this.field2263[var43] = (byte) var41;
            }
        }
        class126 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2261[var47] != 0) {
                if (var46 == 0) {
                    var44 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var46 = -1;
                    } else {
                        var46 = var12[var45++];
                    }
                }
                this.field2259[var47] = var44;
                var46--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var49) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field2261[var51] > 0) {
                    var50 = var3.method598((byte) 115) + 1;
                }
            }
            this.field2258[var51] = (byte) var50;
            var48--;
        }
        this.field2255 = var3.method598((byte) 119) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class126 var100 = var19[var52];
            if (var100.field2433 != null) {
                for (int var101 = 1; var101 < var100.field2433.length; var101 += 2) {
                    var100.field2433[var101] = var3.method584(3);
                }
            }
            if (var100.field2445 != null) {
                for (int var102 = 3; var102 < var100.field2445.length - 2; var102 += 2) {
                    var100.field2445[var102] = var3.method584(3);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method584(3);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method584(3);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class126 var97 = var19[var55];
            if (var97.field2445 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2445.length; var99 += 2) {
                    var98 += var3.method598((byte) 71) + 1;
                    var97.field2445[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class126 var94 = var19[var56];
            if (var94.field2433 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2433.length; var96 += 2) {
                    var95 += var3.method598((byte) 119) + 1;
                    var94.field2433[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method598((byte) 94);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method598((byte) 119) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2258[var61] = (byte) (this.field2258[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class129.method936(var67, (byte) -113, var65 - var59);
                    var67 += var66 - var60;
                    this.field2258[var68] = (byte) (this.field2258[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field2258[var64] = (byte) (this.field2258[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method598((byte) 121);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method598((byte) 86) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field2263[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2263[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class129.method936(var81, (byte) -113, var79 - var73);
                    var81 += var80 - var72;
                    int var84 = (this.field2263[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2263[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field2263[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2263[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2426 = var3.method598((byte) 99);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class126 var93 = var19[var87];
            if (var93.field2433 != null) {
                var93.field2430 = var3.method598((byte) 87);
            }
            if (var93.field2445 != null) {
                var93.field2443 = var3.method598((byte) 122);
            }
            if (var93.field2426 > 0) {
                var93.field2438 = var3.method598((byte) 113);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2425 = var3.method598((byte) 74);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class126 var92 = var19[var89];
            if (var92.field2425 > 0) {
                var92.field2431 = var3.method598((byte) 112);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class126 var91 = var19[var90];
            if (var91.field2431 > 0) {
                var91.field2439 = var3.method598((byte) 73);
            }
        }
    }
}
