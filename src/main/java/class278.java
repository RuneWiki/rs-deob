import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class278 extends class166 {

    @OriginalMember(owner = "client!h", name = "y", descriptor = "[S")
    public short[] field4415;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[Lah;")
    public class285[] field4409;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "[I")
    private int[] field4413;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[B")
    public byte[] field4417;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[B")
    public byte[] field4414;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "[Ldc;")
    public class243[] field4419;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "[B")
    public byte[] field4416;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[I")
    public static int[] field4418 = new int[100];

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field4408 = 0;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field4420 = 0;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lre;")
    public static class228 field4421 = null;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Led;")
    public static class186 field4410;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public static void method1876(int arg0) {
        field4410 = null;
        field4421 = null;
        field4418 = null;
        if (arg0 > -87) {
            method1876(-5);
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field4407++;
        int var2 = -57 % ((arg0 + 39) / 39);
        this.field4413 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([ILmj;[BB)Z")
    public final boolean method1878(int[] arg0, class115 arg1, byte[] arg2, byte arg3) {
        boolean var5 = true;
        field4411++;
        int var6 = 0;
        if (arg3 != -19) {
            this.method1877(-89);
        }
        class285 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field4413[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method812(arg0, var9 >> 2, -19541);
                        } else {
                            var7 = arg1.method811(arg3 ^ 0xFFFFFFED, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4409[var8] = var7;
                        this.field4413[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class278() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
    public class278(byte[] arg0) {
        this.field4415 = new short[128];
        this.field4409 = new class285[128];
        this.field4413 = new int[128];
        this.field4417 = new byte[128];
        this.field4414 = new byte[128];
        int var2 = 0;
        this.field4419 = new class243[128];
        this.field4416 = new byte[128];
        class88 var3 = new class88(arg0);
        while (var3.field1471[var3.field1535 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method656(-252);
        }
        var2++;
        var3.field1535++;
        int var6 = var3.field1535;
        var3.field1535 += var2;
        int var7;
        for (var7 = 0; var3.field1471[var3.field1535 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method656(-252);
        }
        var7++;
        var3.field1535++;
        int var10 = var3.field1535;
        int var11 = 0;
        var3.field1535 += var7;
        while (var3.field1471[var3.field1535 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method656(-252);
        }
        var11++;
        var3.field1535++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method633(88);
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
        class243[] var19 = new class243[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class243 var103 = var19[var20] = new class243();
            int var104 = var3.method633(111);
            if (var104 > 0) {
                var103.field3953 = new byte[var104 * 2];
            }
            int var105 = var3.method633(105);
            if (var105 > 0) {
                var103.field3964 = new byte[var105 * 2 + 2];
                var103.field3964[1] = 64;
            }
        }
        int var21 = 0;
        int var22 = var3.method633(56);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24 = var3.method633(70);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field1471[var3.field1535 + var21] != 0) {
            var21++;
        }
        byte[] var26 = new byte[var21];
        for (int var27 = 0; var27 < var21; var27++) {
            var26[var27] = var3.method656(-252);
        }
        var21++;
        int var28 = 0;
        var3.field1535++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method633(55);
            this.field4415[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method633(57);
            this.field4415[var31] = (short) (this.field4415[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var3.method642(-1911818777);
            }
            var32--;
            this.field4415[var35] = (short) (this.field4415[var35] + (class55.method420(var33 - 1, 2) << 14));
            this.field4413[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4413[var39] != 0) {
                if (var37 == 0) {
                    if (var38 < var4.length) {
                        var37 = var4[var38++];
                    } else {
                        var37 = -1;
                    }
                    var36 = var3.field1471[var6++] - 1;
                }
                var37--;
                this.field4417[var39] = (byte) var36;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4413[var43] != 0) {
                if (var42 == 0) {
                    var41 = var3.field1471[var10++] + 16 << 2;
                    if (var40 >= var8.length) {
                        var42 = -1;
                    } else {
                        var42 = var8[var40++];
                    }
                }
                var42--;
                this.field4414[var43] = (byte) var41;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class243 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4413[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field4419[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field4413[var51] > 0) {
                    var50 = var3.method633(51) + 1;
                }
            }
            var49--;
            this.field4416[var51] = (byte) var50;
        }
        this.field4422 = var3.method633(67) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class243 var100 = var19[var52];
            if (var100.field3953 != null) {
                for (int var101 = 1; var101 < var100.field3953.length; var101 += 2) {
                    var100.field3953[var101] = var3.method656(-252);
                }
            }
            if (var100.field3964 != null) {
                for (int var102 = 3; var102 < (var100.field3964.length - 2); var102 += 2) {
                    var100.field3964[var102] = var3.method656(-252);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method656(-252);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method656(-252);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class243 var97 = var19[var55];
            if (var97.field3964 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3964.length; var99 += 2) {
                    var98 = var98 + var3.method633(99) + 1;
                    var97.field3964[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class243 var94 = var19[var56];
            if (var94.field3953 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3953.length; var96 += 2) {
                    var95 = (var95 + var3.method633(62)) + 1;
                    var94.field3953[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method633(71);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var3.method633(72) + var57 + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4416[var61] = (byte) (this.field4416[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var23.length) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class31.method242(var67, var65 - var59, (byte) -65);
                    this.field4416[var68] = (byte) (this.field4416[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4416[var63] = (byte) (this.field4416[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method633(96);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method633(90) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field4414[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4414[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class31.method242(var81, var79 - var73, (byte) 98);
                    int var84 = (this.field4414[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var72;
                    this.field4414[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field4414[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4414[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3961 = var3.method633(113);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class243 var93 = var19[var87];
            if (var93.field3953 != null) {
                var93.field3956 = var3.method633(86);
            }
            if (var93.field3964 != null) {
                var93.field3955 = var3.method633(122);
            }
            if (var93.field3961 > 0) {
                var93.field3959 = var3.method633(94);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3949 = var3.method633(53);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class243 var92 = var19[var89];
            if (var92.field3949 > 0) {
                var92.field3948 = var3.method633(77);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class243 var91 = var19[var90];
            if (var91.field3948 > 0) {
                var91.field3950 = var3.method633(98);
            }
        }
    }
}
