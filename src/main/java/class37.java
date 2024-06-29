import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class37 extends class627 {

    @OriginalMember(owner = "client!bea", name = "n", descriptor = "[B")
    public byte[] field547;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "[B")
    public byte[] field557;

    @OriginalMember(owner = "client!bea", name = "p", descriptor = "[B")
    public byte[] field549;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "[Lod;")
    public class726[] field553;

    @OriginalMember(owner = "client!bea", name = "q", descriptor = "[S")
    public short[] field550;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "[I")
    private int[] field554;

    @OriginalMember(owner = "client!bea", name = "j", descriptor = "[Lma;")
    public class639[] field543;

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "I")
    public static int field552 = 1406;

    @OriginalMember(owner = "client!bea", name = "l", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!bea", name = "o", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "Lgo;")
    public static class470 field551;

    @OriginalMember(owner = "client!bea", name = "k", descriptor = "Lkha;")
    public static class687 field544;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "([IZLdd;[B)Z", line = 10)
    public final boolean method324(int[] arg0, boolean arg1, class680 arg2, byte[] arg3) {
        field555++;
        boolean var5 = arg1;
        int var6 = 0;
        class639 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field554[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method3658(var9 >> 2, arg0, 1);
                        } else {
                            var7 = arg2.method3653(var9 >> 2, arg0, !arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field543[var8] = var7;
                        this.field554[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)Z", line = 63)
    public static final boolean method325(int arg0, boolean arg1) {
        field556++;
        if (arg1) {
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V", line = 74)
    public final void method326(int arg0) {
        this.field554 = null;
        if (arg0 != -1) {
            field552 = -62;
        }
        field545++;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)V", line = 89)
    public static void method327(byte arg0) {
        int var1 = 105 % ((arg0 + 47) / 40);
        field544 = null;
        field551 = null;
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(B)V", line = 99)
    public static final void method328(byte arg0) {
        if (arg0 != -45) {
            field552 = 55;
        }
        field546++;
        class121.field1457 = true;
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "()V", line = 124)
    public class37() {
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "([B)V", line = 126)
    public class37(byte[] arg0) {
        this.field547 = new byte[128];
        this.field557 = new byte[128];
        this.field549 = new byte[128];
        this.field553 = new class726[128];
        this.field550 = new short[128];
        this.field554 = new int[128];
        this.field543 = new class639[128];
        class179 var2 = new class179(arg0);
        int var3;
        for (var3 = 0; var2.field2325[var2.field2354 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1133(8);
        }
        var2.field2354++;
        var3++;
        int var6 = var2.field2354;
        var2.field2354 += var3;
        int var7;
        for (var7 = 0; var2.field2325[var2.field2354 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1133(8);
        }
        var2.field2354++;
        var7++;
        int var10 = var2.field2354;
        var2.field2354 += var7;
        int var11;
        for (var11 = 0; var2.field2325[var2.field2354 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1133(8);
        }
        var11++;
        var2.field2354++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1094(255);
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
        class726[] var19 = new class726[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class726 var103 = var19[var20] = new class726();
            int var104 = var2.method1094(255);
            if (var104 > 0) {
                var103.field10169 = new byte[var104 * 2];
            }
            int var105 = var2.method1094(255);
            if (var105 > 0) {
                var103.field10176 = new byte[var105 * 2 + 2];
                var103.field10176[1] = 64;
            }
        }
        int var21 = var2.method1094(255);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1094(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field2325[var2.field2354 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1133(8);
        }
        var25++;
        var2.field2354++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1094(255);
            this.field550[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1094(255);
            this.field550[var31] = (short) (this.field550[var31] + (var30 << 8));
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
                var34 = var2.method1120(-56);
            }
            this.field550[var35] = (short) (this.field550[var35] + class272.method1629(var34 - 1 << 14, 32768));
            this.field554[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field554[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field2325[var6++] - 1;
                }
                var36--;
                this.field557[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field554[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field2325[var10++] + 16 << 2;
                }
                var41--;
                this.field547[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class726 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field554[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field553[var47] = var46;
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
                if (this.field554[var51] > 0) {
                    var50 = var2.method1094(255) + 1;
                }
            }
            var48--;
            this.field549[var51] = (byte) var50;
        }
        this.field558 = var2.method1094(255) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class726 var100 = var19[var52];
            if (var100.field10169 != null) {
                for (int var101 = 1; var101 < var100.field10169.length; var101 += 2) {
                    var100.field10169[var101] = var2.method1133(8);
                }
            }
            if (var100.field10176 != null) {
                for (int var102 = 3; var102 < var100.field10176.length - 2; var102 += 2) {
                    var100.field10176[var102] = var2.method1133(8);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1133(8);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1133(8);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class726 var97 = var19[var55];
            if (var97.field10176 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field10176.length; var99 += 2) {
                    var98 = var2.method1094(255) + var98 + 1;
                    var97.field10176[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class726 var94 = var19[var56];
            if (var94.field10169 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field10169.length; var96 += 2) {
                    var95 = var2.method1094(255) + var95 + 1;
                    var94.field10169[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1094(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method1094(255) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field549[var61] = (byte) (this.field549[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class293.method1754(var67, var65 - var59, (byte) -123);
                    this.field549[var68] = (byte) (this.field549[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var62 += 2;
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field549[var63] = (byte) (this.field549[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1094(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method1094(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field547[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field547[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class293.method1754(var81, var79 - var72, (byte) -41);
                    int var84 = (this.field547[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field547[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field547[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field547[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field10182 = var2.method1094(255);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class726 var93 = var19[var87];
            if (var93.field10169 != null) {
                var93.field10179 = var2.method1094(255);
            }
            if (var93.field10176 != null) {
                var93.field10171 = var2.method1094(255);
            }
            if (var93.field10182 > 0) {
                var93.field10178 = var2.method1094(255);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field10173 = var2.method1094(255);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class726 var92 = var19[var89];
            if (var92.field10173 > 0) {
                var92.field10181 = var2.method1094(255);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class726 var91 = var19[var90];
            if (var91.field10181 > 0) {
                var91.field10174 = var2.method1094(255);
            }
        }
    }
}
