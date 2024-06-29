import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class197 extends class159 {

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "[S")
    public short[] field3031;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[B")
    public byte[] field3026;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "[B")
    public byte[] field3025;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "[B")
    public byte[] field3037;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[Ltb;")
    public class183[] field3030;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    private int[] field3023;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "[Lpc;")
    public class321[] field3024;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3028 = "wave:";

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public static int field3032 = 0;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "B")
    public static byte field3027;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[I")
    public static int[] field3034;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lg;[IB[B)Z", line = 11)
    public final boolean method1342(class72 arg0, int[] arg1, byte arg2, byte[] arg3) {
        field3036++;
        int var5 = 0;
        class321 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3023[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method498(10574, var9 >> 2, arg1);
                        } else {
                            var6 = arg0.method493(arg1, 98, var9 >> 2);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3024[var8] = var6;
                        this.field3023[var8] = 0;
                    }
                }
            }
        }
        if (arg2 <= 63) {
            return false;
        } else {
            return var7;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 74)
    public static void method1343(boolean arg0) {
        if (arg0) {
            method1346(false, -64);
        }
        field3028 = null;
        field3034 = null;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 85)
    public final void method1344(int arg0) {
        this.field3023 = null;
        field3029++;
        if (arg0 > -22) {
            this.method1342((class72) null, (int[]) null, (byte) 125, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()V", line = 99)
    public static final void method1345() {
        for (int var0 = 0; var0 < class61.field931; var0++) {
            class258 var1 = class48.field695[var0];
            class140.method991(var1);
            class48.field695[var0] = null;
        }
        class61.field931 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZI)V", line = 118)
    public static final void method1346(boolean arg0, int arg1) {
        field3021++;
        int var2 = -92 % ((arg1 + 14) / 52);
        byte[][] var3;
        if (class245.field3886 && arg0) {
            var3 = class315.field5197;
        } else {
            var3 = class241.field3778;
        }
        int var4 = class202.field3107.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var3[var5];
            if (var6 != null) {
                int var7 = (class150.field2404[var5] >> 8) * 64 - class215.field3313;
                int var8 = (class150.field2404[var5] & 0xFF) * 64 - class150.field2420;
                class190.method1316(-123);
                class187.method1292(arg0, var7, var6, class124.field1860, (byte) -128, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILsi;)V", line = 161)
    public static final void method1347(int arg0, class264 arg1) {
        field3035++;
        if (arg0 > -40) {
            method1346(true, -68);
        }
        int var2 = arg1.field4233;
        if (var2 == 324) {
            if (class79.field1175 == -1) {
                class9.field112 = arg1.field4225;
                class79.field1175 = arg1.field4205;
            }
            if (class150.field2409.field5472) {
                arg1.field4205 = class79.field1175;
            } else {
                arg1.field4205 = class9.field112;
            }
        } else if (var2 == 325) {
            if (class79.field1175 == -1) {
                class79.field1175 = arg1.field4205;
                class9.field112 = arg1.field4225;
            }
            if (class150.field2409.field5472) {
                arg1.field4205 = class9.field112;
            } else {
                arg1.field4205 = class79.field1175;
            }
        } else if (var2 == 327) {
            arg1.field4191 = 150;
            arg1.field4346 = (int) (Math.sin((double) class58.field875 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field4198 = 5;
            arg1.field4194 = -1;
        } else if (var2 == 328) {
            if (class329.field5388.field597 == null) {
                arg1.field4194 = 0;
            } else {
                arg1.field4191 = 150;
                arg1.field4346 = (int) (Math.sin((double) class58.field875 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field4198 = 5;
                arg1.field4194 = ((int) class265.method1872(class329.field5388.field597, 80) << 11) + 2047;
                arg1.field4285 = class329.field5388.field4716;
                arg1.field4301 = class329.field5388.field4747;
                arg1.field4296 = class329.field5388.field4750;
                arg1.field4313 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 244)
    public class197() {
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V", line = 248)
    public class197(byte[] arg0) {
        this.field3031 = new short[128];
        this.field3026 = new byte[128];
        this.field3025 = new byte[128];
        this.field3037 = new byte[128];
        this.field3030 = new class183[128];
        this.field3023 = new int[128];
        this.field3024 = new class321[128];
        class313 var2 = new class313(arg0);
        int var3;
        for (var3 = 0; var2.field5124[var2.field5137 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2200(81);
        }
        var3++;
        var2.field5137++;
        int var6 = 0;
        int var7 = var2.field5137;
        var2.field5137 += var3;
        while (var2.field5124[var2.field5137 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method2200(39);
        }
        var2.field5137++;
        var6++;
        int var10 = var2.field5137;
        int var11 = 0;
        var2.field5137 += var6;
        while (var2.field5124[var2.field5137 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2200(-83);
        }
        var11++;
        var2.field5137++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method2224(-126);
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
        class183[] var19 = new class183[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class183 var21 = var19[var20] = new class183();
            int var22 = var2.method2224(-119);
            if (var22 > 0) {
                var21.field2850 = new byte[var22 * 2];
            }
            int var23 = var2.method2224(-121);
            if (var23 > 0) {
                var21.field2843 = new byte[var23 * 2 + 2];
                var21.field2843[1] = 64;
            }
        }
        int var24 = var2.method2224(-125);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var2.method2224(-124);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var2.field5124[var2.field5137 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method2200(-86);
        }
        var2.field5137++;
        int var31 = 0;
        var28++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method2224(-122);
            this.field3031[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method2224(-125);
            this.field3031[var34] = (short) (this.field3031[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var29.length <= var36) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var2.method2234(false);
            }
            this.field3031[var38] = (short) (this.field3031[var38] + class235.method1623(var37 - 1 << 14, 32768));
            var35--;
            this.field3023[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3023[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field5124[var7++] - 1;
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                }
                var39--;
                this.field3026[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3023[var46] != 0) {
                if (var45 == 0) {
                    var44 = var2.field5124[var10++] + 16 << 2;
                    if (var43 >= var8.length) {
                        var45 = -1;
                    } else {
                        var45 = var8[var43++];
                    }
                }
                var45--;
                this.field3025[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class183 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3023[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 < var12.length) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                var48--;
                this.field3030[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var29.length > var51) {
                    var53 = var29[var51++];
                } else {
                    var53 = -1;
                }
                if (this.field3023[var54] > 0) {
                    var52 = var2.method2224(-125) + 1;
                }
            }
            var53--;
            this.field3037[var54] = (byte) var52;
        }
        this.field3033 = var2.method2224(-121) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class183 var56 = var19[var55];
            if (var56.field2850 != null) {
                for (int var57 = 1; var57 < var56.field2850.length; var57 += 2) {
                    var56.field2850[var57] = var2.method2200(123);
                }
            }
            if (var56.field2843 != null) {
                for (int var58 = 3; var58 < var56.field2843.length - 2; var58 += 2) {
                    var56.field2843[var58] = var2.method2200(92);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method2200(-79);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method2200(94);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class183 var62 = var19[var61];
            if (var62.field2843 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2843.length; var64 += 2) {
                    var63 += var2.method2224(-123) + 1;
                    var62.field2843[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class183 var66 = var19[var65];
            if (var66.field2850 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2850.length; var68 += 2) {
                    var67 = var2.method2224(-120) + var67 + 1;
                    var66.field2850[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method2224(-124);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var2.method2224(-123) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3037[var73] = (byte) (this.field3037[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class251.method1788(-117, var77, var75 - var71);
                    var77 += var76 - var72;
                    this.field3037[var78] = (byte) (this.field3037[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3037[var80] = (byte) (this.field3037[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var2.method2224(-127);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 -= -var2.method2224(-121) - 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3025[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3025[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                int var89 = var27[var88 + 1] << 1;
                byte var90 = var27[var88];
                var88 += 2;
                int var91 = (var90 - var84) * var85 + ((var90 - var84) / 2);
                for (int var92 = var84; var92 < var90; var92++) {
                    int var93 = class251.method1788(-81, var91, var90 - var84);
                    var91 += var89 - var85;
                    int var94 = (this.field3025[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3025[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field3025[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3025[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2848 = var2.method2224(-119);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class183 var100 = var19[var99];
            if (var100.field2850 != null) {
                var100.field2836 = var2.method2224(-127);
            }
            if (var100.field2843 != null) {
                var100.field2837 = var2.method2224(-128);
            }
            if (var100.field2848 > 0) {
                var100.field2845 = var2.method2224(-127);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2852 = var2.method2224(-123);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class183 var103 = var19[var102];
            if (var103.field2852 > 0) {
                var103.field2841 = var2.method2224(-124);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class183 var105 = var19[var104];
            if (var105.field2841 > 0) {
                var105.field2840 = var2.method2224(-121);
            }
        }
    }
}
