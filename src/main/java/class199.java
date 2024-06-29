import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class199 extends class35 {

    @OriginalMember(owner = "client!md", name = "u", descriptor = "[Luk;")
    public class328[] field3004;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "[S")
    public short[] field3006;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "[B")
    public byte[] field3005;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "[Lta;")
    public class310[] field2995;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "[B")
    public byte[] field2998;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
    private int[] field3007;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "[B")
    public byte[] field3001;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public int field2996;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[I")
    public static int[] field3000 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!md", name = "p", descriptor = "[I")
    public static int[] field2999 = new int[14];

    @OriginalMember(owner = "client!md", name = "s", descriptor = "Lsh;")
    public static class472 field3002 = new class472(51, -2);

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public final void method1349(byte arg0) {
        int var2 = 96 % ((-arg0 - 27) / 56);
        field3003++;
        this.field3007 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([IILfj;[B)Z")
    public final boolean method1350(int[] arg0, int arg1, class462 arg2, byte[] arg3) {
        field2997++;
        boolean var5 = true;
        int var6 = arg1;
        class328 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3007[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2724(arg0, var9 >> 2, (byte) 12);
                        } else {
                            var7 = arg2.method2720(var9 >> 2, arg0, arg1 - 47426736);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3004[var8] = var7;
                        this.field3007[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method1351(byte arg0) {
        if (arg0 >= -102) {
            field3008 = 93;
        }
        field3000 = null;
        field2999 = null;
        field3002 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class199() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "([B)V")
    public class199(byte[] arg0) {
        this.field3004 = new class328[128];
        this.field3006 = new short[128];
        this.field3005 = new byte[128];
        this.field2995 = new class310[128];
        this.field2998 = new byte[128];
        this.field3007 = new int[128];
        this.field3001 = new byte[128];
        class446 var2 = new class446(arg0);
        int var3;
        for (var3 = 0; var2.field6316[var2.field6315 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2642(true);
        }
        var3++;
        var2.field6315++;
        int var6 = var2.field6315;
        var2.field6315 += var3;
        int var7;
        for (var7 = 0; var2.field6316[var2.field6315 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2642(true);
        }
        var7++;
        var2.field6315++;
        int var10 = var2.field6315;
        var2.field6315 += var7;
        int var11;
        for (var11 = 0; var2.field6316[var2.field6315 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2642(true);
        }
        var2.field6315++;
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
                int var105 = var2.method2628(49152);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class310[] var18 = new class310[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class310 var102 = var18[var19] = new class310();
            int var103 = var2.method2628(49152);
            if (var103 > 0) {
                var102.field4697 = new byte[var103 * 2];
            }
            int var104 = var2.method2628(49152);
            if (var104 > 0) {
                var102.field4682 = new byte[var104 * 2 + 2];
                var102.field4682[1] = 64;
            }
        }
        int var20 = var2.method2628(49152);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2628(49152);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field6316[var2.field6315 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2642(true);
        }
        var2.field6315++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2628(49152);
            this.field3006[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2628(49152);
            this.field3006[var30] = (short) (this.field3006[var30] + (var29 << 8));
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
                var33 = var2.method2622((byte) 1);
            }
            this.field3006[var34] = (short) (this.field3006[var34] + class412.method2463(32768, var33 - 1 << 14));
            this.field3007[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3007[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field6316[var6++] - 1;
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field3005[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3007[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field6316[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field2998[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class310 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3007[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field2995[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field3007[var50] > 0) {
                    var49 = var2.method2628(49152) + 1;
                }
            }
            this.field3001[var50] = (byte) var49;
            var47--;
        }
        this.field2996 = var2.method2628(49152) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class310 var99 = var18[var51];
            if (var99.field4697 != null) {
                for (int var100 = 1; var100 < var99.field4697.length; var100 += 2) {
                    var99.field4697[var100] = var2.method2642(true);
                }
            }
            if (var99.field4682 != null) {
                for (int var101 = 3; var101 < var99.field4682.length - 2; var101 += 2) {
                    var99.field4682[var101] = var2.method2642(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2642(true);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2642(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class310 var96 = var18[var54];
            if (var96.field4682 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4682.length; var98 += 2) {
                    var97 -= -var2.method2628(49152) - 1;
                    var96.field4682[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class310 var93 = var18[var55];
            if (var93.field4697 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4697.length; var95 += 2) {
                    var94 = var94 + var2.method2628(49152) + 1;
                    var93.field4697[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2628(49152);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method2628(49152) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3001[var60] = (byte) (this.field3001[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class303.method1894(var66, var64 - var58, -887217953);
                    var66 += var65 - var59;
                    this.field3001[var67] = (byte) (this.field3001[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3001[var62] = (byte) (this.field3001[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2628(49152);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method2628(49152) + (var69 + 1);
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2998[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2998[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class303.method1894(var80, var78 - var71, -887217953);
                    int var83 = (this.field2998[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field2998[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2998[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2998[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4695 = var2.method2628(49152);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class310 var92 = var18[var86];
            if (var92.field4697 != null) {
                var92.field4679 = var2.method2628(49152);
            }
            if (var92.field4682 != null) {
                var92.field4688 = var2.method2628(49152);
            }
            if (var92.field4695 > 0) {
                var92.field4680 = var2.method2628(49152);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4689 = var2.method2628(49152);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class310 var91 = var18[var88];
            if (var91.field4689 > 0) {
                var91.field4683 = var2.method2628(49152);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class310 var90 = var18[var89];
            if (var90.field4683 > 0) {
                var90.field4696 = var2.method2628(49152);
            }
        }
    }

    static {
        new class332((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
        field3008 = -1;
    }
}
