import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class291 extends class117 {

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[B")
    public byte[] field4400;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "[Ld;")
    public class43[] field4399;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "[S")
    public short[] field4412;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "[B")
    public byte[] field4402;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "[I")
    private int[] field4408;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "[B")
    public byte[] field4403;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "[Lwk;")
    public class119[] field4413;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field4409 = 0;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
    public static boolean field4410 = true;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "Lth;")
    public static class57 field4405 = new class57(500);

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "Z")
    public static boolean field4415 = false;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "[S")
    public static short[] field4416 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "F")
    public static float field4401;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[BLon;[I)Z", line = 5)
    public final boolean method2093(int arg0, byte[] arg1, class344 arg2, int[] arg3) {
        field4414++;
        int var5 = 0;
        boolean var6 = true;
        class43 var7 = null;
        if (arg0 != -129) {
            field4407 = 10;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4408[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2410(var9 >> 2, arg3, (byte) -67);
                        } else {
                            var7 = arg2.method2404(var9 >> 2, arg3, (byte) 125);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4399[var8] = var7;
                        this.field4408[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lph;B)V", line = 71)
    public static final void method2094(class361 arg0, byte arg1) {
        field4404++;
        if (class261.field3941) {
            return;
        }
        if (class141.field2031) {
            class205.method1501();
        } else {
            class44.method338();
        }
        class50.field756 = class235.method1750(class27.field386, (byte) 37, arg0);
        int var2 = class19.field301;
        if (arg1 < 105) {
            return;
        }
        int var3 = var2 * 956 / 503;
        class50.field756.method651((class286.field4312 - var3) / 2, 0, var3, var2);
        class160.field2314 = class333.method2348(0, arg0, class241.field3600);
        class160.field2314.method1482(class286.field4312 / 2 - (class160.field2314.field3715 / 2), 18);
        class261.field3941 = true;
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V", line = 101)
    public final void method2095(int arg0) {
        this.field4408 = null;
        field4398++;
        if (arg0 != -1843) {
            this.method2093(9, (byte[]) null, (class344) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 134)
    public static void method2096(boolean arg0) {
        if (!arg0) {
            field4401 = -0.89206916F;
        }
        field4416 = null;
        field4405 = null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 150)
    public class291() {
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "([B)V", line = 152)
    public class291(byte[] arg0) {
        this.field4400 = new byte[128];
        this.field4399 = new class43[128];
        this.field4412 = new short[128];
        this.field4402 = new byte[128];
        this.field4408 = new int[128];
        this.field4403 = new byte[128];
        this.field4413 = new class119[128];
        class190 var2 = new class190(arg0);
        int var3;
        for (var3 = 0; var2.field2718[var2.field2776 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1322(9813);
        }
        var2.field2776++;
        var3++;
        int var6 = 0;
        int var7 = var2.field2776;
        var2.field2776 += var3;
        while (var2.field2718[var2.field2776 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1322(9813);
        }
        var6++;
        var2.field2776++;
        int var10 = 0;
        int var11 = var2.field2776;
        var2.field2776 += var6;
        while (var2.field2718[var2.field2776 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method1322(9813);
        }
        var2.field2776++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method1319(255);
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
        }
        class119[] var19 = new class119[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class119 var21 = var19[var20] = new class119();
            int var22 = var2.method1319(255);
            if (var22 > 0) {
                var21.field1669 = new byte[var22 * 2];
            }
            int var23 = var2.method1319(255);
            if (var23 > 0) {
                var21.field1667 = new byte[var23 * 2 + 2];
                var21.field1667[1] = 64;
            }
        }
        int var24 = var2.method1319(255);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method1319(255);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var2.field2718[var2.field2776 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method1322(9813);
        }
        var28++;
        var2.field2776++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method1319(255);
            this.field4412[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method1319(255);
            this.field4412[var34] = (short) (this.field4412[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length > var36) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var2.method1352(0);
            }
            var35--;
            this.field4412[var38] = (short) (this.field4412[var38] + (class287.method2076(2, var37 - 1) << 14));
            this.field4408[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4408[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var4.length) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field2718[var7++] - 1;
                }
                var40--;
                this.field4403[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4408[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length > var45) {
                        var43 = var8[var45++];
                    } else {
                        var43 = -1;
                    }
                    var44 = var2.field2718[var11++] + 16 << 2;
                }
                this.field4402[var46] = (byte) var44;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class119 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4408[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length > var47) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field4413[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var29.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field4408[var54] > 0) {
                    var53 = var2.method1319(255) + 1;
                }
            }
            this.field4400[var54] = (byte) var53;
            var52--;
        }
        this.field4411 = var2.method1319(255) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class119 var56 = var19[var55];
            if (var56.field1669 != null) {
                for (int var57 = 1; var57 < var56.field1669.length; var57 += 2) {
                    var56.field1669[var57] = var2.method1322(9813);
                }
            }
            if (var56.field1667 != null) {
                for (int var58 = 3; var58 < var56.field1667.length - 2; var58 += 2) {
                    var56.field1667[var58] = var2.method1322(9813);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method1322(9813);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method1322(9813);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class119 var62 = var19[var61];
            if (var62.field1667 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field1667.length; var64 += 2) {
                    var63 = var2.method1319(255) + (var63 + 1);
                    var62.field1667[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class119 var66 = var19[var65];
            if (var66.field1669 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field1669.length; var68 += 2) {
                    var67 = var2.method1319(255) + var67 + 1;
                    var66.field1669[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method1319(255);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var2.method1319(255) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[1];
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                this.field4400[var73] = (byte) (this.field4400[var73] * var71 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var72) / 2 + (var75 - var72) * var71;
                for (int var78 = var72; var78 < var75; var78++) {
                    int var79 = class158.method1141(var77, 26212, var75 - var72);
                    this.field4400[var78] = (byte) (this.field4400[var78] * var79 + 32 >> 6);
                    var77 += var76 - var71;
                }
                var72 = var75;
                var71 = var76;
            }
            Object var80 = null;
            for (int var81 = var72; var81 < 128; var81++) {
                this.field4400[var81] = (byte) (this.field4400[var81] * var71 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var2.method1319(255);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var2.method1319(255) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4402[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4402[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class158.method1141(var91, 26212, var89 - var84);
                    var91 += var90 - var85;
                    int var94 = (this.field4402[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4402[var92] = (byte) var94;
                }
                var85 = var90;
                var84 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field4402[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field4402[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field1679 = var2.method1319(255);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class119 var100 = var19[var99];
            if (var100.field1669 != null) {
                var100.field1666 = var2.method1319(255);
            }
            if (var100.field1667 != null) {
                var100.field1670 = var2.method1319(255);
            }
            if (var100.field1679 > 0) {
                var100.field1680 = var2.method1319(255);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field1678 = var2.method1319(255);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class119 var103 = var19[var102];
            if (var103.field1678 > 0) {
                var103.field1676 = var2.method1319(255);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class119 var105 = var19[var104];
            if (var105.field1676 > 0) {
                var105.field1673 = var2.method1319(255);
            }
        }
    }
}
