import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class217 extends class362 {

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[S")
    public short[] field3147;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "[B")
    public byte[] field3144;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[B")
    public byte[] field3150;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[B")
    public byte[] field3151;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "[Lob;")
    public class735[] field3152;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "[Lho;")
    public class151[] field3148;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "[I")
    private int[] field3145;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Z")
    public static boolean field3140 = false;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "J")
    public static long field3143 = 0L;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[Lf;")
    public static class753[] field3154 = new class753[2048];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1550(boolean arg0) {
        if (arg0) {
            class429.field6148 = new class456[50];
            field3142++;
            class649.field8920 = 0;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkg;", line = 18)
    public static final class274 method1551(Throwable arg0, String arg1) {
        field3141++;
        class274 var2;
        if ((arg0 instanceof class274)) {
            var2 = (class274) arg0;
            var2.field3848 = var2.field3848 + ' ' + arg1;
        } else {
            var2 = new class274(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 39)
    public static void method1552(byte arg0) {
        field3154 = null;
        int var1 = -14 / ((arg0 - 61) / 43);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB[ILff;)V", line = 52)
    public static final void method1553(int arg0, byte arg1, int[] arg2, class9 arg3) {
        field3153++;
        if (arg3.field5662 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field5662.length; var5++) {
                if (arg3.field5662[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field5712 != -1) {
                class691 var6 = class456.field6436.method1021(arg3.field5712, 7);
                int var7 = var6.field9338;
                if (var7 == 1) {
                    arg3.field5658 = 0;
                    arg3.field5644 = arg0;
                    arg3.field5720 = 0;
                    arg3.field5693 = 0;
                    arg3.field5670 = 1;
                    if (!arg3.field5735) {
                        class190.method1366(arg3, arg3.field5693, var6, -72);
                    }
                }
                if (var7 == 2) {
                    arg3.field5720 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg3.field5662 == null || arg3.field5662[var9] == -1 || class456.field6436.method1021(arg2[var9], 7).field9329 >= class456.field6436.method1021(arg3.field5662[var9], 7).field9329) {
                arg3.field5644 = arg0;
                arg3.field5748 = arg3.field5745;
                arg3.field5662 = arg2;
            }
        }
        if (arg1 <= 31) {
            method1553(-66, (byte) 125, null, null);
        }
        if (var8) {
            arg3.field5662 = arg2;
            arg3.field5644 = arg0;
            arg3.field5748 = arg3.field5745;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lhs;[I[BI)Z", line = 143)
    public final boolean method1554(class327 arg0, int[] arg1, byte[] arg2, int arg3) {
        field3155++;
        boolean var5 = true;
        int var6 = 0;
        class735 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3145[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method2080(var9 >> 2, arg1, -2);
                        } else {
                            var7 = arg0.method2081(arg1, var9 >> 2, -1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3152[var8] = var7;
                        this.field3145[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 199)
    public final void method1555(byte arg0) {
        field3146++;
        if (arg0 >= -65) {
            this.field3148 = null;
        }
        this.field3145 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 216)
    public class217() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V", line = 226)
    public class217(byte[] arg0) {
        this.field3147 = new short[128];
        this.field3144 = new byte[128];
        this.field3150 = new byte[128];
        this.field3151 = new byte[128];
        this.field3152 = new class735[128];
        this.field3148 = new class151[128];
        this.field3145 = new int[128];
        class215 var2 = new class215(arg0);
        int var3;
        for (var3 = 0; var2.field3066[var2.field3109 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1536(-128);
        }
        var2.field3109++;
        var3++;
        int var6 = var2.field3109;
        var2.field3109 += var3;
        int var7;
        for (var7 = 0; var2.field3066[var2.field3109 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1536(-81);
        }
        var7++;
        var2.field3109++;
        int var10 = var2.field3109;
        var2.field3109 += var7;
        int var11;
        for (var11 = 0; var2.field3066[var2.field3109 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1536(-82);
        }
        var2.field3109++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1535(255);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class151[] var19 = new class151[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class151 var103 = var19[var20] = new class151();
            int var104 = var2.method1535(255);
            if (var104 > 0) {
                var103.field2489 = new byte[var104 * 2];
            }
            int var105 = var2.method1535(255);
            if (var105 > 0) {
                var103.field2485 = new byte[var105 * 2 + 2];
                var103.field2485[1] = 64;
            }
        }
        int var21 = var2.method1535(255);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1535(255);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field3066[var2.field3109 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1536(-108);
        }
        var2.field3109++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1535(255);
            this.field3147[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1535(255);
            this.field3147[var31] = (short) (this.field3147[var31] + (var30 << 8));
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
                var34 = var2.method1514((byte) 124);
            }
            this.field3147[var35] = (short) (this.field3147[var35] + class263.method1762(32768, var34 - 1 << 14));
            var32--;
            this.field3145[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3145[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field3066[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                var37--;
                this.field3150[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3145[var43] != 0) {
                if (var41 == 0) {
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field3066[var10++] + 16 << 2;
                }
                var41--;
                this.field3144[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class151 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3145[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field3148[var47] = var46;
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
                if (this.field3145[var51] > 0) {
                    var50 = var2.method1535(255) + 1;
                }
            }
            this.field3151[var51] = (byte) var50;
            var48--;
        }
        this.field3149 = var2.method1535(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class151 var100 = var19[var52];
            if (var100.field2489 != null) {
                for (int var101 = 1; var101 < var100.field2489.length; var101 += 2) {
                    var100.field2489[var101] = var2.method1536(-93);
                }
            }
            if (var100.field2485 != null) {
                for (int var102 = 3; var102 < var100.field2485.length - 2; var102 += 2) {
                    var100.field2485[var102] = var2.method1536(-89);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1536(-82);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1536(-126);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class151 var97 = var19[var55];
            if (var97.field2485 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2485.length; var99 += 2) {
                    var98 = var98 + var2.method1535(255) + 1;
                    var97.field2485[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class151 var94 = var19[var56];
            if (var94.field2489 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2489.length; var96 += 2) {
                    var95 = (var95 + var2.method1535(255)) + 1;
                    var94.field2489[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1535(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = (var57 + var2.method1535(255)) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3151[var61] = (byte) (this.field3151[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class118.method1034(var65 - var59, -110, var67);
                    this.field3151[var68] = (byte) (this.field3151[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field3151[var63] = (byte) (this.field3151[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1535(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method1535(255) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3144[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3144[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class118.method1034(var79 - var72, -34, var81);
                    int var84 = (this.field3144[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3144[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field3144[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3144[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2488 = var2.method1535(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class151 var93 = var19[var87];
            if (var93.field2489 != null) {
                var93.field2486 = var2.method1535(255);
            }
            if (var93.field2485 != null) {
                var93.field2490 = var2.method1535(255);
            }
            if (var93.field2488 > 0) {
                var93.field2491 = var2.method1535(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2493 = var2.method1535(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class151 var92 = var19[var89];
            if (var92.field2493 > 0) {
                var92.field2494 = var2.method1535(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class151 var91 = var19[var90];
            if (var91.field2494 > 0) {
                var91.field2487 = var2.method1535(255);
            }
        }
    }
}
