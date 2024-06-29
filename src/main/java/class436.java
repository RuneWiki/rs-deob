import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class436 extends class324 {

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "[B")
    public byte[] field6492;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "[B")
    public byte[] field6491;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "[S")
    public short[] field6488;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "[Ltv;")
    public class488[] field6494;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "[Lte;")
    public class534[] field6490;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "[I")
    private int[] field6496;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "[B")
    public byte[] field6489;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Z")
    public static boolean field6484 = false;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "[S")
    public static short[] field6495 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Leea;")
    public static class114 field6487 = new class114();

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "F")
    public static float field6497;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
    public final void method2719(byte arg0) {
        this.field6496 = null;
        field6486++;
        if (arg0 > -61) {
            field6497 = -0.28543255F;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)V")
    public static void method2720(boolean arg0) {
        field6495 = null;
        if (!arg0) {
            method2721(-77);
        }
        field6487 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Z")
    public static final boolean method2721(int arg0) {
        if (arg0 != -1) {
            field6487 = null;
        }
        field6493++;
        if (field6484) {
            try {
                if ((Boolean) class314.method2067(-24319, "showingVideoAd", class635.field9135)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lts;B[B[I)Z")
    public final boolean method2722(class464 arg0, byte arg1, byte[] arg2, int[] arg3) {
        field6485++;
        if (arg1 <= 94) {
            method2721(71);
        }
        boolean var5 = true;
        int var6 = 0;
        class534 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field6496[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method2845(var9 >> 2, arg3, -6802);
                        } else {
                            var7 = arg0.method2841(arg3, var9 >> 2, 40);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6490[var8] = var7;
                        this.field6496[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
    public class436() {
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "([B)V")
    public class436(byte[] arg0) {
        this.field6492 = new byte[128];
        this.field6491 = new byte[128];
        this.field6488 = new short[128];
        this.field6494 = new class488[128];
        this.field6490 = new class534[128];
        this.field6496 = new int[128];
        this.field6489 = new byte[128];
        class194 var2 = new class194(arg0);
        int var3;
        for (var3 = 0; var2.field2622[var2.field2610 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1213((byte) 126);
        }
        var3++;
        var2.field2610++;
        int var6 = var2.field2610;
        var2.field2610 += var3;
        int var7;
        for (var7 = 0; var2.field2622[var2.field2610 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1213((byte) 102);
        }
        var7++;
        var2.field2610++;
        int var10 = var2.field2610;
        var2.field2610 += var7;
        int var11;
        for (var11 = 0; var2.field2622[var2.field2610 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1213((byte) 122);
        }
        var2.field2610++;
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
                int var105 = var2.method1177(255);
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
        class488[] var18 = new class488[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class488 var102 = var18[var19] = new class488();
            int var103 = var2.method1177(255);
            if (var103 > 0) {
                var102.field7115 = new byte[var103 * 2];
            }
            int var104 = var2.method1177(255);
            if (var104 > 0) {
                var102.field7114 = new byte[var104 * 2 + 2];
                var102.field7114[1] = 64;
            }
        }
        int var20 = var2.method1177(255);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1177(255);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field2622[var2.field2610 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1213((byte) 52);
        }
        var24++;
        var2.field2610++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1177(255);
            this.field6488[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1177(255);
            this.field6488[var30] = (short) (this.field6488[var30] + (var29 << 8));
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
                var33 = var2.method1181(false);
            }
            this.field6488[var34] = (short) (this.field6488[var34] + (class643.method3659(var33 - 1, 2) << 14));
            this.field6496[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field6496[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field2622[var6++] - 1;
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field6492[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field6496[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field2622[var10++] + 16 << 2;
                }
                this.field6491[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class488 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field6496[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field6494[var46] = var45;
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
                if (this.field6496[var50] > 0) {
                    var49 = var2.method1177(255) + 1;
                }
            }
            this.field6489[var50] = (byte) var49;
            var47--;
        }
        this.field6483 = var2.method1177(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class488 var99 = var18[var51];
            if (var99.field7115 != null) {
                for (int var100 = 1; var100 < var99.field7115.length; var100 += 2) {
                    var99.field7115[var100] = var2.method1213((byte) 78);
                }
            }
            if (var99.field7114 != null) {
                for (int var101 = 3; var101 < var99.field7114.length - 2; var101 += 2) {
                    var99.field7114[var101] = var2.method1213((byte) 120);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1213((byte) 45);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1213((byte) 108);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class488 var96 = var18[var54];
            if (var96.field7114 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7114.length; var98 += 2) {
                    var97 = var2.method1177(255) + var97 + 1;
                    var96.field7114[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class488 var93 = var18[var55];
            if (var93.field7115 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7115.length; var95 += 2) {
                    var94 = var94 + var2.method1177(255) + 1;
                    var93.field7115[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1177(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1177(255) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field6489[var60] = (byte) (this.field6489[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class320.method2089(var64 - var58, 58, var66);
                    var66 += var65 - var59;
                    this.field6489[var67] = (byte) (this.field6489[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field6489[var62] = (byte) (this.field6489[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1177(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1177(255) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field6491[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field6491[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class320.method2089(var78 - var71, 86, var80);
                    int var83 = (this.field6491[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field6491[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field6491[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field6491[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7107 = var2.method1177(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class488 var92 = var18[var86];
            if (var92.field7115 != null) {
                var92.field7118 = var2.method1177(255);
            }
            if (var92.field7114 != null) {
                var92.field7109 = var2.method1177(255);
            }
            if (var92.field7107 > 0) {
                var92.field7110 = var2.method1177(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7117 = var2.method1177(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class488 var91 = var18[var88];
            if (var91.field7117 > 0) {
                var91.field7108 = var2.method1177(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class488 var90 = var18[var89];
            if (var90.field7108 > 0) {
                var90.field7106 = var2.method1177(255);
            }
        }
    }
}
