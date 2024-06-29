import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class428 extends class329 {

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "[Loaa;")
    public class555[] field5366;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "[B")
    public byte[] field5356;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "[B")
    public byte[] field5365;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[Lmu;")
    public class463[] field5370;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "[I")
    private int[] field5358;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "[B")
    public byte[] field5369;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "[S")
    public short[] field5362;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field5355;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field5359 = 0;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[I")
    public static int[] field5368 = new int[5];

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "[I")
    public static int[] field5363 = new int[32];

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Lek;")
    public static class568 field5352;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lsh;")
    public static class673 field5360;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Z")
    public static boolean field5361;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 3)
    public static void method2265(int arg0) {
        if (arg0 != -1335466206) {
            field5352 = null;
        }
        field5363 = null;
        field5352 = null;
        field5368 = null;
        field5360 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B[[BLgl;)V", line = 17)
    public static final void method2266(byte arg0, byte[][] arg1, class646 arg2) {
        field5354++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1255; var4++) {
            class671.method3767((byte) 76);
            for (int var5 = 0; var5 < (class431.field5395 >> 3); var5++) {
                for (int var6 = 0; var6 < (class452.field5802 >> 3); var6++) {
                    int var7 = class74.field1018[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg2.field1238 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FF9) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class564.field7842.length; var13++) {
                                if (class564.field7842[var13] == var12 && arg1[var13] != null) {
                                    class630 var14 = new class630(arg1[var13]);
                                    arg2.method510(var4, class154.field1991, var14, var9, var8, var10, var6 * 8, var5 * 8, true, var11);
                                    arg2.method3612(var3[0] == -1 ? var3 : null, class32.field452, var11, true, var9, var5 * 8, var10, var6 * 8, var8, var4, var14);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class419.field5274 = class64.field879.method2869(class470.field5972, var3[1], var3[2], var3[3], -29532, var3[0]);
            class657.field9292 = var3[4];
        }
        if (arg0 < 23) {
            field5368 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([ILpj;[BI)Z", line = 99)
    public final boolean method2267(int[] arg0, class235 arg1, byte[] arg2, int arg3) {
        field5364++;
        boolean var5 = true;
        int var6 = 0;
        class555 var7 = null;
        if (arg3 != 5150) {
            field5359 = 96;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field5358[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1417(var9 >> 2, 1, arg0);
                        } else {
                            var7 = arg1.method1418(var9 >> 2, arg0, (byte) -100);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5366[var8] = var7;
                        this.field5358[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 167)
    public final void method2268(int arg0) {
        this.field5358 = null;
        if (arg0 >= 53) {
            field5357++;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 199)
    public class428() {
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V", line = 202)
    public class428(byte[] arg0) {
        this.field5366 = new class555[128];
        this.field5356 = new byte[128];
        this.field5365 = new byte[128];
        this.field5370 = new class463[128];
        this.field5358 = new int[128];
        this.field5369 = new byte[128];
        this.field5362 = new short[128];
        class630 var2 = new class630(arg0);
        int var3;
        for (var3 = 0; var2.field8804[var2.field8812 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3480(-20933);
        }
        var3++;
        var2.field8812++;
        int var6 = var2.field8812;
        var2.field8812 += var3;
        int var7;
        for (var7 = 0; var2.field8804[var2.field8812 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3480(-20933);
        }
        var7++;
        var2.field8812++;
        int var10 = var2.field8812;
        var2.field8812 += var7;
        int var11;
        for (var11 = 0; var2.field8804[var2.field8812 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3480(-20933);
        }
        var2.field8812++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3501(-9268);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class463[] var18 = new class463[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class463 var102 = var18[var19] = new class463();
            int var103 = var2.method3501(-9268);
            if (var103 > 0) {
                var102.field5906 = new byte[var103 * 2];
            }
            int var104 = var2.method3501(-9268);
            if (var104 > 0) {
                var102.field5902 = new byte[var104 * 2 + 2];
                var102.field5902[1] = 64;
            }
        }
        int var20 = var2.method3501(-9268);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method3501(-9268);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field8804[var2.field8812 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3480(-20933);
        }
        var24++;
        var2.field8812++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3501(-9268);
            this.field5362[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3501(-9268);
            this.field5362[var30] = (short) (this.field5362[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method3491(false);
            }
            this.field5362[var34] = (short) (this.field5362[var34] + (class695.method3921(var33 - 1, 2) << 14));
            var31--;
            this.field5358[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5358[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field8804[var6++] - 1;
                }
                var36--;
                this.field5356[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5358[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field8804[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                }
                var39--;
                this.field5365[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class463 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5358[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field5370[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field5358[var50] > 0) {
                    var49 = var2.method3501(-9268) + 1;
                }
            }
            this.field5369[var50] = (byte) var49;
            var48--;
        }
        this.field5355 = var2.method3501(-9268) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class463 var99 = var18[var51];
            if (var99.field5906 != null) {
                for (int var100 = 1; var100 < var99.field5906.length; var100 += 2) {
                    var99.field5906[var100] = var2.method3480(-20933);
                }
            }
            if (var99.field5902 != null) {
                for (int var101 = 3; var101 < var99.field5902.length - 2; var101 += 2) {
                    var99.field5902[var101] = var2.method3480(-20933);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3480(-20933);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3480(-20933);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class463 var96 = var18[var54];
            if (var96.field5902 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5902.length; var98 += 2) {
                    var97 = var97 + var2.method3501(-9268) + 1;
                    var96.field5902[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class463 var93 = var18[var55];
            if (var93.field5906 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5906.length; var95 += 2) {
                    var94 += var2.method3501(-9268) + 1;
                    var93.field5906[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3501(-9268);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method3501(-9268) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5369[var60] = (byte) (this.field5369[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class285.method1604(var66, 100, var64 - var58);
                    var66 += var65 - var59;
                    this.field5369[var67] = (byte) (this.field5369[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field5369[var63] = (byte) (this.field5369[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method3501(-9268);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method3501(-9268) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5365[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5365[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class285.method1604(var80, 100, var78 - var71);
                    int var83 = (this.field5365[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field5365[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field5365[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5365[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5895 = var2.method3501(-9268);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class463 var92 = var18[var86];
            if (var92.field5906 != null) {
                var92.field5900 = var2.method3501(-9268);
            }
            if (var92.field5902 != null) {
                var92.field5903 = var2.method3501(-9268);
            }
            if (var92.field5895 > 0) {
                var92.field5905 = var2.method3501(-9268);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5896 = var2.method3501(-9268);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class463 var91 = var18[var88];
            if (var91.field5896 > 0) {
                var91.field5897 = var2.method3501(-9268);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class463 var90 = var18[var89];
            if (var90.field5897 > 0) {
                var90.field5898 = var2.method3501(-9268);
            }
        }
    }
}
