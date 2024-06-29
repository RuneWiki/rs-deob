import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class218 extends class504 {

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[B")
    public byte[] field3096;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    private int[] field3101;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "[B")
    public byte[] field3097;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "[Lfc;")
    public class241[] field3102;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "[Lgw;")
    public class158[] field3103;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "[B")
    public byte[] field3093;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[S")
    public short[] field3094;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lkca;")
    public static class76 field3095;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Ljava/lang/Object;")
    public static Object field3098;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[Ld;")
    public static class139[] field3099;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "[Lxa;")
    public static class468[] field3104;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method1384(byte arg0, int arg1) {
        if (class173.field2675 == 1) {
            class400.field5307 = arg1;
        } else if (class173.field2675 == 2 || class173.field2675 == 3) {
            class347.field4765 = arg1;
        }
        field3106++;
        if (arg0 > -127) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([IBLns;[B)Z", line = 26)
    public final boolean method1385(int[] arg0, byte arg1, class375 arg2, byte[] arg3) {
        field3105++;
        boolean var5 = true;
        if (arg1 != 68) {
            return false;
        }
        int var6 = 0;
        class241 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3101[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2203(var9 >> 2, arg0, 120);
                        } else {
                            var7 = arg2.method2207(0, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3102[var8] = var7;
                        this.field3101[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 86)
    public final void method1386(boolean arg0) {
        this.field3101 = null;
        field3092++;
        if (!arg0) {
            this.field3093 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 103)
    public static void method1387(int arg0) {
        field3099 = null;
        field3098 = null;
        if (arg0 < 5) {
            field3104 = null;
        }
        field3104 = null;
        field3095 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 121)
    public class218() {
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIB)V", line = 124)
    public static final void method1388(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3107++;
        int var10 = arg4 + 1;
        class475.method2668(arg3, arg2, 7, class236.field3325[arg4], arg1);
        int var9 = arg0 - 1;
        class475.method2668(arg3, arg2, 7, class236.field3325[arg0], arg1);
        for (int var6 = var10; var6 <= var9; var6++) {
            int[] var8 = class236.field3325[var6];
            var8[arg1] = var8[arg2] = arg3;
        }
        int var7 = 116 / ((-arg5 - 7) / 63);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V", line = 146)
    public class218(byte[] arg0) {
        this.field3096 = new byte[128];
        this.field3101 = new int[128];
        this.field3097 = new byte[128];
        this.field3102 = new class241[128];
        this.field3103 = new class158[128];
        this.field3093 = new byte[128];
        this.field3094 = new short[128];
        class335 var2 = new class335(arg0);
        int var3;
        for (var3 = 0; var2.field4600[var2.field4619 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2040(-86);
        }
        var2.field4619++;
        var3++;
        int var6 = var2.field4619;
        var2.field4619 += var3;
        int var7;
        for (var7 = 0; var2.field4600[var2.field4619 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2040(-58);
        }
        var7++;
        var2.field4619++;
        int var10 = var2.field4619;
        var2.field4619 += var7;
        int var11;
        for (var11 = 0; var2.field4600[var2.field4619 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2040(-54);
        }
        var2.field4619++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2034(255);
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
        class158[] var19 = new class158[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class158 var103 = var19[var20] = new class158();
            int var104 = var2.method2034(255);
            if (var104 > 0) {
                var103.field2497 = new byte[var104 * 2];
            }
            int var105 = var2.method2034(255);
            if (var105 > 0) {
                var103.field2500 = new byte[var105 * 2 + 2];
                var103.field2500[1] = 64;
            }
        }
        int var21 = var2.method2034(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method2034(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field4600[var2.field4619 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method2040(-127);
        }
        var2.field4619++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method2034(255);
            this.field3094[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method2034(255);
            this.field3094[var31] = (short) (this.field3094[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method1988((byte) -73);
            }
            this.field3094[var35] = (short) (this.field3094[var35] + (class571.method3139(var34 - 1, 2) << 14));
            this.field3101[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3101[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field4600[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field3096[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3101[var43] != 0) {
                if (var41 == 0) {
                    var42 = var2.field4600[var10++] + 16 << 2;
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                var41--;
                this.field3093[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class158 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3101[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field3103[var47] = var46;
                var45--;
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
                if (this.field3101[var51] > 0) {
                    var50 = var2.method2034(255) + 1;
                }
            }
            this.field3097[var51] = (byte) var50;
            var48--;
        }
        this.field3100 = var2.method2034(255) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class158 var100 = var19[var52];
            if (var100.field2497 != null) {
                for (int var101 = 1; var101 < var100.field2497.length; var101 += 2) {
                    var100.field2497[var101] = var2.method2040(-118);
                }
            }
            if (var100.field2500 != null) {
                for (int var102 = 3; var102 < var100.field2500.length - 2; var102 += 2) {
                    var100.field2500[var102] = var2.method2040(-122);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method2040(-51);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method2040(-77);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class158 var97 = var19[var55];
            if (var97.field2500 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2500.length; var99 += 2) {
                    var98 += var2.method2034(255) + 1;
                    var97.field2500[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class158 var94 = var19[var56];
            if (var94.field2497 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2497.length; var96 += 2) {
                    var95 = var2.method2034(255) + var95 + 1;
                    var94.field2497[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method2034(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method2034(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3097[var61] = (byte) (this.field3097[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class93.method731(var65 - var59, var67, -18);
                    this.field3097[var68] = (byte) (this.field3097[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3097[var64] = (byte) (this.field3097[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method2034(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method2034(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3093[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3093[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) * var73 + ((var79 - var72) / 2);
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class93.method731(var79 - var72, var81, -127);
                    int var84 = (this.field3093[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field3093[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field3093[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3093[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2490 = var2.method2034(255);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class158 var93 = var19[var87];
            if (var93.field2497 != null) {
                var93.field2501 = var2.method2034(255);
            }
            if (var93.field2500 != null) {
                var93.field2498 = var2.method2034(255);
            }
            if (var93.field2490 > 0) {
                var93.field2493 = var2.method2034(255);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2491 = var2.method2034(255);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class158 var92 = var19[var89];
            if (var92.field2491 > 0) {
                var92.field2502 = var2.method2034(255);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class158 var91 = var19[var90];
            if (var91.field2502 > 0) {
                var91.field2494 = var2.method2034(255);
            }
        }
    }
}
