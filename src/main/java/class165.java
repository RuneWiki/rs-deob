import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class165 extends class44 {

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[B")
    public byte[] field3250;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
    private int[] field3252;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "[B")
    public byte[] field3249;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[S")
    public short[] field3247;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "[Lwc;")
    public class202[] field3261;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "[B")
    public byte[] field3255;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[Lph;")
    public class144[] field3251;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lkb;")
    public static class93 field3248 = class76.method390(")2", 0);

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lkb;")
    private static class93 field3256 = class76.method390("Connection timed out)3", 0);

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lkb;")
    public static class93 field3260 = field3256;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "Lkb;")
    private static class93 field3264 = class76.method390("No reply from loginserver)3", 0);

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lkb;")
    public static class93 field3246 = field3264;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "Lnd;")
    public static class122 field3262 = new class122();

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "Lkb;")
    public static class93 field3265 = class76.method390("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Ljg;")
    public static class89 field3253;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Ljg;")
    public static class89 field3257;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lof;[II[B)Z")
    public final boolean method1111(class133 arg0, int[] arg1, int arg2, byte[] arg3) {
        field3258++;
        boolean var5 = true;
        class202 var6 = null;
        int var7 = 0;
        for (int var8 = arg2; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3252[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method798(arg1, var9 >> 2, true);
                        } else {
                            var6 = arg0.method792(arg1, var9 >> 2, (byte) 29);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3261[var8] = var6;
                        this.field3252[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public final void method1112(int arg0) {
        this.field3252 = null;
        field3254++;
        int var2 = 67 / ((arg0 + 25) / 46);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(ZI)I")
    public static final int method1113(boolean arg0, int arg1) {
        field3263++;
        if (!arg0) {
            field3264 = null;
        }
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field3262 = null;
        field3260 = null;
        field3257 = null;
        field3256 = null;
        field3253 = null;
        field3246 = null;
        field3248 = null;
        field3265 = null;
        int var1 = 42 / ((arg0 + 55) / 50);
        field3264 = null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class165() {
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "([B)V")
    public class165(byte[] arg0) {
        int var2 = 0;
        this.field3250 = new byte[128];
        this.field3252 = new int[128];
        this.field3249 = new byte[128];
        this.field3247 = new short[128];
        this.field3261 = new class202[128];
        this.field3255 = new byte[128];
        this.field3251 = new class144[128];
        class158 var3 = new class158(arg0);
        while (var3.field3162[var3.field3153 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1066(true);
        }
        var2++;
        var3.field3153++;
        int var6 = var3.field3153;
        int var7 = 0;
        var3.field3153 += var2;
        while (var3.field3162[var3.field3153 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1066(true);
        }
        var3.field3153++;
        var7++;
        int var10 = var3.field3153;
        int var11 = 0;
        var3.field3153 += var7;
        while (var3.field3162[var3.field3153 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1066(true);
        }
        var3.field3153++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1054(128);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class144[] var19 = new class144[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class144 var103 = var19[var20] = new class144();
            int var104 = var3.method1054(128);
            if (var104 > 0) {
                var103.field2799 = new byte[var104 * 2];
            }
            int var105 = var3.method1054(128);
            if (var105 > 0) {
                var103.field2801 = new byte[var105 * 2 + 2];
                var103.field2801[1] = 64;
            }
        }
        int var21 = var3.method1054(128);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method1054(128);
        int var24 = 0;
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field3162[var3.field3153 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method1066(true);
        }
        var24++;
        int var28 = 0;
        var3.field3153++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1054(128);
            this.field3247[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1054(128);
            this.field3247[var31] = (short) (this.field3247[var31] + (var30 << 8));
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
                var34 = var3.method1032(2078277635);
            }
            var32--;
            this.field3247[var35] = (short) (this.field3247[var35] + (class91.method479(2, var34 - 1) << 14));
            this.field3252[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3252[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field3162[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field3250[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3252[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field3162[var10++] + 16 << 2;
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3249[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class144 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3252[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field3251[var47] = var46;
                var44--;
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
                if (this.field3252[var51] > 0) {
                    var50 = var3.method1054(128) + 1;
                }
            }
            this.field3255[var51] = (byte) var50;
            var49--;
        }
        this.field3259 = var3.method1054(128) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class144 var100 = var19[var52];
            if (var100.field2799 != null) {
                for (int var101 = 1; var101 < var100.field2799.length; var101 += 2) {
                    var100.field2799[var101] = var3.method1066(true);
                }
            }
            if (var100.field2801 != null) {
                for (int var102 = 3; var102 < var100.field2801.length - 2; var102 += 2) {
                    var100.field2801[var102] = var3.method1066(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1066(true);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1066(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class144 var97 = var19[var55];
            if (var97.field2801 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2801.length; var99 += 2) {
                    var98 = var3.method1054(128) + var98 + 1;
                    var97.field2801[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class144 var94 = var19[var56];
            if (var94.field2799 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2799.length; var96 += 2) {
                    var95 += var3.method1054(128) + 1;
                    var94.field2799[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1054(128);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var3.method1054(128) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3255[var61] = (byte) (this.field3255[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + (var65 - var59) / 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class186.method1218(127, var67, var65 - var59);
                    this.field3255[var68] = (byte) (this.field3255[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3255[var64] = (byte) (this.field3255[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method1054(128);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 -= -var3.method1054(128) - 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3249[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3249[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var25.length; var75 += 2) {
                byte var79 = var25[var75];
                int var80 = (var79 - var72) * var73 + (var79 - var72) / 2;
                int var81 = var25[var75 + 1] << 1;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class186.method1218(125, var80, var79 - var72);
                    int var84 = (this.field3249[var82] & 0xFF) + var83;
                    var80 += var81 - var73;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3249[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var81;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3249[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3249[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2802 = var3.method1054(128);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class144 var93 = var19[var87];
            if (var93.field2799 != null) {
                var93.field2803 = var3.method1054(128);
            }
            if (var93.field2801 != null) {
                var93.field2807 = var3.method1054(128);
            }
            if (var93.field2802 > 0) {
                var93.field2814 = var3.method1054(128);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2796 = var3.method1054(128);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class144 var92 = var19[var89];
            if (var92.field2796 > 0) {
                var92.field2805 = var3.method1054(128);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class144 var91 = var19[var90];
            if (var91.field2805 > 0) {
                var91.field2806 = var3.method1054(128);
            }
        }
    }
}
