import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class380 extends class476 {

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[I")
    private int[] field5463;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "[S")
    public short[] field5462;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "[Lsd;")
    public class264[] field5466;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "[Lhe;")
    public class174[] field5464;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "[B")
    public byte[] field5467;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[B")
    public byte[] field5458;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[B")
    public byte[] field5460;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public int field5461;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "F")
    public static float field5459;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 18)
    public final void method2265(int arg0) {
        if (arg0 < -9) {
            field5457++;
            this.field5463 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([B[IBLsp;)Z", line = 30)
    public final boolean method2266(byte[] arg0, int[] arg1, byte arg2, class514 arg3) {
        field5465++;
        if (arg2 >= -6) {
            this.field5466 = null;
        }
        boolean var5 = true;
        int var6 = 0;
        class174 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field5463[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method3043(var9 >> 2, 65524, arg1);
                        } else {
                            var7 = arg3.method3044(arg1, var9 >> 2, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5464[var8] = var7;
                        this.field5463[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 91)
    public class380() {
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([B)V", line = 93)
    public class380(byte[] arg0) {
        this.field5463 = new int[128];
        this.field5462 = new short[128];
        this.field5466 = new class264[128];
        this.field5464 = new class174[128];
        this.field5467 = new byte[128];
        this.field5458 = new byte[128];
        this.field5460 = new byte[128];
        class319 var2 = new class319(arg0);
        int var3;
        for (var3 = 0; var2.field4336[var2.field4360 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1894(-2018);
        }
        var3++;
        var2.field4360++;
        int var6 = var2.field4360;
        var2.field4360 += var3;
        int var7;
        for (var7 = 0; var2.field4336[var2.field4360 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1894(-2018);
        }
        var7++;
        var2.field4360++;
        int var10 = var2.field4360;
        var2.field4360 += var7;
        int var11;
        for (var11 = 0; var2.field4336[var2.field4360 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1894(-2018);
        }
        var2.field4360++;
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
                int var105 = var2.method1869(-67);
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
        class264[] var18 = new class264[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class264 var102 = var18[var19] = new class264();
            int var103 = var2.method1869(-74);
            if (var103 > 0) {
                var102.field3540 = new byte[var103 * 2];
            }
            int var104 = var2.method1869(-119);
            if (var104 > 0) {
                var102.field3541 = new byte[var104 * 2 + 2];
                var102.field3541[1] = 64;
            }
        }
        int var20 = var2.method1869(-127);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1869(-106);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field4336[var2.field4360 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1894(-2018);
        }
        var2.field4360++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1869(-90);
            this.field5462[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1869(-98);
            this.field5462[var30] = (short) (this.field5462[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method1860(4);
            }
            this.field5462[var34] = (short) (this.field5462[var34] + (class375.method2245(var33 - 1, 2) << 14));
            var31--;
            this.field5463[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5463[var38] != 0) {
                if (var35 == 0) {
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field4336[var6++] - 1;
                }
                var35--;
                this.field5458[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5463[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var8[var40++];
                    }
                    var41 = var2.field4336[var10++] + 16 << 2;
                }
                var39--;
                this.field5460[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class264 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5463[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field5466[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field5463[var50] > 0) {
                    var49 = var2.method1869(-127) + 1;
                }
            }
            var48--;
            this.field5467[var50] = (byte) var49;
        }
        this.field5461 = var2.method1869(-122) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class264 var99 = var18[var51];
            if (var99.field3540 != null) {
                for (int var100 = 1; var100 < var99.field3540.length; var100 += 2) {
                    var99.field3540[var100] = var2.method1894(-2018);
                }
            }
            if (var99.field3541 != null) {
                for (int var101 = 3; var101 < var99.field3541.length - 2; var101 += 2) {
                    var99.field3541[var101] = var2.method1894(-2018);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1894(-2018);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1894(-2018);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class264 var96 = var18[var54];
            if (var96.field3541 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3541.length; var98 += 2) {
                    var97 = var2.method1869(-94) + var97 + 1;
                    var96.field3541[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class264 var93 = var18[var55];
            if (var93.field3540 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3540.length; var95 += 2) {
                    var94 += var2.method1869(-95) + 1;
                    var93.field3540[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1869(-97);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1869(-114) + (var56 + 1);
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5467[var60] = (byte) (this.field5467[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class399.method2366(var64 - var58, var66, 81);
                    this.field5467[var67] = (byte) (this.field5467[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5467[var62] = (byte) (this.field5467[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1869(-122);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method1869(-111) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5460[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5460[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class399.method2366(var78 - var71, var80, 39);
                    int var83 = (this.field5460[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field5460[var81] = (byte) var83;
                }
                var72 = var79;
                var74 += 2;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field5460[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5460[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3539 = var2.method1869(-113);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class264 var92 = var18[var86];
            if (var92.field3540 != null) {
                var92.field3549 = var2.method1869(-93);
            }
            if (var92.field3541 != null) {
                var92.field3546 = var2.method1869(-94);
            }
            if (var92.field3539 > 0) {
                var92.field3547 = var2.method1869(-116);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3552 = var2.method1869(-103);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class264 var91 = var18[var88];
            if (var91.field3552 > 0) {
                var91.field3543 = var2.method1869(-109);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class264 var90 = var18[var89];
            if (var90.field3543 > 0) {
                var90.field3545 = var2.method1869(-76);
            }
        }
    }
}
