import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class74 extends class263 {

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "[Lft;")
    public class4[] field974;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "[B")
    public byte[] field978;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "[Ljs;")
    public class309[] field977;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "[B")
    public byte[] field981;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "[S")
    public short[] field982;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "[B")
    public byte[] field984;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "[I")
    private int[] field983;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "I")
    public int field980;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Lcga;")
    public static class449 field976 = new class449(10, -1);

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Ldr;")
    public static class675 field979 = new class675(56, 1);

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "F")
    public static float field985;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "Lws;")
    public static class333 field986;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public final void method594(byte arg0) {
        this.field983 = null;
        field987++;
        if (arg0 != -5) {
            method595((byte) -67);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
    public static void method595(byte arg0) {
        field976 = null;
        if (arg0 == 1) {
            field986 = null;
            field979 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lfea;[B[II)Z")
    public final boolean method596(class131 arg0, byte[] arg1, int[] arg2, int arg3) {
        field989++;
        boolean var5 = true;
        int var6 = 0;
        class4 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field983[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method848((byte) -120, var9 >> 2, arg2);
                        } else {
                            var7 = arg0.method847(arg2, 54, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field974[var8] = var7;
                        this.field983[var8] = 0;
                    }
                }
            }
        }
        if (arg3 != 1) {
            field988 = -80;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method597(boolean arg0, int arg1, String arg2) {
        field975++;
        if (arg1 == 0) {
            class502.method2728(arg2, -1, (byte) 112, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "()V")
    public class74() {
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "([B)V")
    public class74(byte[] arg0) {
        this.field974 = new class4[128];
        this.field978 = new byte[128];
        this.field977 = new class309[128];
        this.field981 = new byte[128];
        this.field982 = new short[128];
        this.field984 = new byte[128];
        this.field983 = new int[128];
        class572 var2 = new class572(arg0);
        int var3;
        for (var3 = 0; var2.field7318[var2.field7313 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3083(255);
        }
        var2.field7313++;
        var3++;
        int var6 = var2.field7313;
        var2.field7313 += var3;
        int var7;
        for (var7 = 0; var2.field7318[var2.field7313 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3083(255);
        }
        var7++;
        var2.field7313++;
        int var10 = var2.field7313;
        var2.field7313 += var7;
        int var11;
        for (var11 = 0; var2.field7318[var2.field7313 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3083(255);
        }
        var2.field7313++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3097((byte) 12);
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
        class309[] var18 = new class309[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class309 var102 = var18[var19] = new class309();
            int var103 = var2.method3097((byte) 12);
            if (var103 > 0) {
                var102.field3889 = new byte[var103 * 2];
            }
            int var104 = var2.method3097((byte) 12);
            if (var104 > 0) {
                var102.field3894 = new byte[var104 * 2 + 2];
                var102.field3894[1] = 64;
            }
        }
        int var20 = var2.method3097((byte) 12);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method3097((byte) 12);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field7318[var2.field7313 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3083(255);
        }
        var24++;
        var2.field7313++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3097((byte) 12);
            this.field982[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3097((byte) 12);
            this.field982[var30] = (short) (this.field982[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method3055((byte) 111);
            }
            this.field982[var34] = (short) (this.field982[var34] + class109.method762(var33 - 1 << 14, 32768));
            var31--;
            this.field983[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field983[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field7318[var6++] - 1;
                }
                this.field978[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field983[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field7318[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field981[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class309 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field983[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field977[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field983[var50] > 0) {
                    var49 = var2.method3097((byte) 12) + 1;
                }
            }
            this.field984[var50] = (byte) var49;
            var48--;
        }
        this.field980 = var2.method3097((byte) 12) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class309 var99 = var18[var51];
            if (var99.field3889 != null) {
                for (int var100 = 1; var100 < var99.field3889.length; var100 += 2) {
                    var99.field3889[var100] = var2.method3083(255);
                }
            }
            if (var99.field3894 != null) {
                for (int var101 = 3; var101 < var99.field3894.length - 2; var101 += 2) {
                    var99.field3894[var101] = var2.method3083(255);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3083(255);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3083(255);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class309 var96 = var18[var54];
            if (var96.field3894 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3894.length; var98 += 2) {
                    var97 = var2.method3097((byte) 12) + var97 + 1;
                    var96.field3894[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class309 var93 = var18[var55];
            if (var93.field3889 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3889.length; var95 += 2) {
                    var94 = var2.method3097((byte) 12) + var94 + 1;
                    var93.field3889[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3097((byte) 12);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method3097((byte) 12) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field984[var60] = (byte) (this.field984[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class657.method3665(-1647235009, var64 - var58, var66);
                    var66 += var65 - var59;
                    this.field984[var67] = (byte) (this.field984[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field984[var63] = (byte) (this.field984[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method3097((byte) 12);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method3097((byte) 12) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field981[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field981[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class657.method3665(-1647235009, var78 - var71, var80);
                    int var83 = (this.field981[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field981[var81] = (byte) var83;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field981[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field981[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3899 = var2.method3097((byte) 12);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class309 var92 = var18[var86];
            if (var92.field3889 != null) {
                var92.field3895 = var2.method3097((byte) 12);
            }
            if (var92.field3894 != null) {
                var92.field3897 = var2.method3097((byte) 12);
            }
            if (var92.field3899 > 0) {
                var92.field3901 = var2.method3097((byte) 12);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3902 = var2.method3097((byte) 12);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class309 var91 = var18[var88];
            if (var91.field3902 > 0) {
                var91.field3892 = var2.method3097((byte) 12);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class309 var90 = var18[var89];
            if (var90.field3892 > 0) {
                var90.field3900 = var2.method3097((byte) 12);
            }
        }
    }
}
