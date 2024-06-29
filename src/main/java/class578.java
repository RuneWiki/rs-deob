import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class578 extends class159 {

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "[B")
    public byte[] field7885;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "[B")
    public byte[] field7878;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
    public byte[] field7888;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "[Luga;")
    public class221[] field7883;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "[Lpv;")
    public class78[] field7889;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "[S")
    public short[] field7877;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "[I")
    private int[] field7884;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public int field7880;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "S")
    public static short field7886 = 256;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Ljb;")
    public static class519 field7882 = new class519(7, 0);

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field7890 = -60;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public final void method3274(int arg0) {
        if (arg0 != 28313) {
            this.field7885 = null;
        }
        field7879++;
        this.field7884 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLcga;[I[B)Z")
    public final boolean method3275(boolean arg0, class507 arg1, int[] arg2, byte[] arg3) {
        field7881++;
        boolean var5 = arg0;
        int var6 = 0;
        class78 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field7884[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2947(var9 >> 2, arg2, (byte) 90);
                        } else {
                            var7 = arg1.method2946(arg2, (byte) -91, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field7889[var8] = var7;
                        this.field7884[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public static void method3276(int arg0) {
        int var1 = -92 / ((-arg0 - 31) / 42);
        field7882 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
    public class578() {
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V")
    public class578(byte[] arg0) {
        this.field7885 = new byte[128];
        this.field7878 = new byte[128];
        this.field7888 = new byte[128];
        this.field7883 = new class221[128];
        this.field7889 = new class78[128];
        this.field7877 = new short[128];
        this.field7884 = new int[128];
        class254 var2 = new class254(arg0);
        int var3;
        for (var3 = 0; var2.field3789[var2.field3725 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1737(true);
        }
        var2.field3725++;
        var3++;
        int var6 = var2.field3725;
        var2.field3725 += var3;
        int var7;
        for (var7 = 0; var2.field3789[var2.field3725 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1737(true);
        }
        var2.field3725++;
        var7++;
        int var10 = var2.field3725;
        var2.field3725 += var7;
        int var11;
        for (var11 = 0; var2.field3789[var2.field3725 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1737(true);
        }
        var11++;
        var2.field3725++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1731((byte) 64);
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
        class221[] var18 = new class221[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class221 var102 = var18[var19] = new class221();
            int var103 = var2.method1731((byte) 64);
            if (var103 > 0) {
                var102.field2862 = new byte[var103 * 2];
            }
            int var104 = var2.method1731((byte) 64);
            if (var104 > 0) {
                var102.field2861 = new byte[var104 * 2 + 2];
                var102.field2861[1] = 64;
            }
        }
        int var20 = var2.method1731((byte) 64);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1731((byte) 64);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field3789[var2.field3725 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1737(true);
        }
        var2.field3725++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1731((byte) 64);
            this.field7877[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1731((byte) 64);
            this.field7877[var30] = (short) (this.field7877[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method1702(true);
            }
            this.field7877[var34] = (short) (this.field7877[var34] + (class519.method3018(var33 - 1, 2) << 14));
            this.field7884[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field7884[var38] != 0) {
                if (var35 == 0) {
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field3789[var6++] - 1;
                }
                var35--;
                this.field7878[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field7884[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field3789[var10++] + 16 << 2;
                }
                this.field7888[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class221 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field7884[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field7883[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field7884[var50] > 0) {
                    var49 = var2.method1731((byte) 64) + 1;
                }
            }
            var47--;
            this.field7885[var50] = (byte) var49;
        }
        this.field7880 = var2.method1731((byte) 64) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class221 var99 = var18[var51];
            if (var99.field2862 != null) {
                for (int var100 = 1; var100 < var99.field2862.length; var100 += 2) {
                    var99.field2862[var100] = var2.method1737(true);
                }
            }
            if (var99.field2861 != null) {
                for (int var101 = 3; var101 < (var99.field2861.length - 2); var101 += 2) {
                    var99.field2861[var101] = var2.method1737(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1737(true);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1737(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class221 var96 = var18[var54];
            if (var96.field2861 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2861.length; var98 += 2) {
                    var97 = var97 + var2.method1731((byte) 64) + 1;
                    var96.field2861[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class221 var93 = var18[var55];
            if (var93.field2862 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2862.length; var95 += 2) {
                    var94 = var2.method1731((byte) 64) + var94 + 1;
                    var93.field2862[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1731((byte) 64);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1731((byte) 64) + (var56 + 1);
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field7885[var60] = (byte) (this.field7885[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class72.method590(var64 - var58, 17570, var66);
                    this.field7885[var67] = (byte) (this.field7885[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field7885[var63] = (byte) (this.field7885[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1731((byte) 64);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method1731((byte) 64) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field7888[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field7888[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class72.method590(var78 - var71, 17570, var80);
                    int var83 = (this.field7888[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field7888[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field7888[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field7888[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2863 = var2.method1731((byte) 64);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class221 var92 = var18[var86];
            if (var92.field2862 != null) {
                var92.field2872 = var2.method1731((byte) 64);
            }
            if (var92.field2861 != null) {
                var92.field2871 = var2.method1731((byte) 64);
            }
            if (var92.field2863 > 0) {
                var92.field2865 = var2.method1731((byte) 64);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2869 = var2.method1731((byte) 64);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class221 var91 = var18[var88];
            if (var91.field2869 > 0) {
                var91.field2870 = var2.method1731((byte) 64);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class221 var90 = var18[var89];
            if (var90.field2870 > 0) {
                var90.field2868 = var2.method1731((byte) 64);
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZII)Z")
    public static final boolean method3277(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method3276(-11);
        }
        field7887++;
        return (arg1 & 0x20) != 0;
    }
}
