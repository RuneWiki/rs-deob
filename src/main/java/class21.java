import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 extends class107 {

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "[B")
    public byte[] field297;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "[I")
    private int[] field299;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "[Lci;")
    public class224[] field300;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "[B")
    public byte[] field309;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "[Lsg;")
    public class153[] field301;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "[B")
    public byte[] field308;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "[S")
    public short[] field307;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field305 = -1;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[ILji;I)Z")
    public final boolean method105(byte[] arg0, int[] arg1, class39 arg2, int arg3) {
        field303++;
        int var5 = 0;
        boolean var6 = true;
        class224 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field299[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method196(arg1, var9 >> 2, arg3 ^ 0xFFFFFCFF);
                        } else {
                            var7 = arg2.method195(-2, arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field300[var8] = var7;
                        this.field299[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZII)V")
    public static final void method106(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field302++;
        if (class207.method1426((byte) 98, arg1)) {
            class60.method398(arg3, arg4, arg0, arg2, class10.field106[arg1], 128);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Llj;ZLlj;)V")
    public static final void method107(class25 arg0, boolean arg1, class25 arg2) {
        field310++;
        if (arg2.field379 != null) {
            arg2.method134(-85);
        }
        arg2.field379 = arg0;
        arg2.field373 = arg0.field373;
        if (!arg1) {
            field305 = -37;
        }
        arg2.field379.field373 = arg2;
        arg2.field373.field379 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public final void method108(int arg0) {
        if (arg0 != 2) {
            method109((class171) null, 68, (class213) null, (byte) -113, 111, -110, 68);
        }
        field298++;
        this.field299 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ltg;ILwc;BIII)V")
    public static final void method109(class171 arg0, int arg1, class213 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field306++;
        if (arg0 == null) {
            return;
        }
        int var7 = class120.field1993 + class119.field1991 & 0x7FF;
        if (arg3 >= -1) {
            return;
        }
        int var8 = Math.max(arg2.field3603 / 2, arg2.field3608 / 2) + 10;
        int var9 = arg1 * arg1 + arg6 * arg6;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class73.field1155[var7];
        int var11 = var10 * 256 / (class109.field1849 + 256);
        int var12 = class73.field1167[var7];
        int var13 = var12 * 256 / (class109.field1849 + 256);
        int var14 = arg1 * var13 - (arg6 * var11) >> 16;
        int var15 = arg1 * var11 + arg6 * var13 >> 16;
        ((class254) arg0).method1732(arg2.field3603 / 2 + var15 + arg5 - (arg0.field2805 / 2), -(arg0.field2803 / 2) + arg4 - (-(arg2.field3608 / 2) + var14), arg2.field3661, arg2.field3637);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class21() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([B)V")
    public class21(byte[] arg0) {
        this.field297 = new byte[128];
        this.field299 = new int[128];
        this.field300 = new class224[128];
        this.field309 = new byte[128];
        this.field301 = new class153[128];
        this.field308 = new byte[128];
        this.field307 = new short[128];
        int var2 = 0;
        class121 var3 = new class121(arg0);
        while (var3.field2014[var3.field2026 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method912((byte) -90);
        }
        var3.field2026++;
        var2++;
        int var6 = var3.field2026;
        var3.field2026 += var2;
        int var7;
        for (var7 = 0; var3.field2014[var3.field2026 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method912((byte) -90);
        }
        var3.field2026++;
        int var10 = 0;
        var7++;
        int var11 = var3.field2026;
        var3.field2026 += var7;
        while (var3.field2014[var3.field2026 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method912((byte) -90);
        }
        var3.field2026++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method897(116);
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
            var15 = var10;
        }
        class153[] var19 = new class153[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class153 var103 = var19[var20] = new class153();
            int var104 = var3.method897(120);
            if (var104 > 0) {
                var103.field2549 = new byte[var104 * 2];
            }
            int var105 = var3.method897(-17);
            if (var105 > 0) {
                var103.field2553 = new byte[var105 * 2 + 2];
                var103.field2553[1] = 64;
            }
        }
        int var21 = var3.method897(-65);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var3.method897(-30);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var3.field2014[var3.field2026 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method912((byte) -90);
        }
        var25++;
        var3.field2026++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method897(120);
            this.field307[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method897(-44);
            this.field307[var31] = (short) (this.field307[var31] + (var30 << 8));
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
                var34 = var3.method917(111);
            }
            this.field307[var35] = (short) (this.field307[var35] + (class191.method1366(var34 - 1, 2) << 14));
            var32--;
            this.field299[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field299[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field2014[var6++] - 1;
                    if (var4.length > var36) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field297[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field299[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var42) {
                        var41 = -1;
                    } else {
                        var41 = var8[var42++];
                    }
                    var40 = var3.field2014[var11++] + 16 << 2;
                }
                this.field308[var43] = (byte) var40;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class153 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field299[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field301[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field299[var51] > 0) {
                    var50 = var3.method897(108) + 1;
                }
            }
            this.field309[var51] = (byte) var50;
            var49--;
        }
        this.field304 = var3.method897(-59) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class153 var100 = var19[var52];
            if (var100.field2549 != null) {
                for (int var101 = 1; var101 < var100.field2549.length; var101 += 2) {
                    var100.field2549[var101] = var3.method912((byte) -90);
                }
            }
            if (var100.field2553 != null) {
                for (int var102 = 3; var102 < var100.field2553.length - 2; var102 += 2) {
                    var100.field2553[var102] = var3.method912((byte) -90);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method912((byte) -90);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method912((byte) -90);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class153 var97 = var19[var55];
            if (var97.field2553 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2553.length; var99 += 2) {
                    var98 = var98 + var3.method897(115) + 1;
                    var97.field2553[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class153 var94 = var19[var56];
            if (var94.field2549 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2549.length; var96 += 2) {
                    var95 = var3.method897(-94) + var95 + 1;
                    var94.field2549[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method897(126);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method897(111) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field309[var61] = (byte) (this.field309[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                int var66 = (var65 - var59) / 2 + (var65 - var59) * var60;
                byte var67 = var22[var62 + 1];
                var62 += 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class49.method262(var66, (byte) -28, var65 - var59);
                    this.field309[var68] = (byte) (this.field309[var68] * var69 + 32 >> 6);
                    var66 += var67 - var60;
                }
                var60 = var67;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field309[var64] = (byte) (this.field309[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method897(117);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var3.method897(116) + (var70 + 1);
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field308[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field308[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = (var79 - var72) / 2 + (var79 - var72) * var73;
                int var81 = var24[var75 + 1] << 1;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class49.method262(var80, (byte) -28, var79 - var72);
                    int var84 = (this.field308[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var80 += var81 - var73;
                    this.field308[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var81;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field308[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field308[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2548 = var3.method897(113);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class153 var93 = var19[var87];
            if (var93.field2549 != null) {
                var93.field2554 = var3.method897(-41);
            }
            if (var93.field2553 != null) {
                var93.field2552 = var3.method897(125);
            }
            if (var93.field2548 > 0) {
                var93.field2555 = var3.method897(125);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2543 = var3.method897(106);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class153 var92 = var19[var89];
            if (var92.field2543 > 0) {
                var92.field2545 = var3.method897(126);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class153 var91 = var19[var90];
            if (var91.field2545 > 0) {
                var91.field2558 = var3.method897(-89);
            }
        }
    }
}
