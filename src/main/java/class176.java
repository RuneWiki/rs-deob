import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class176 extends class189 {

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "[B")
    public byte[] field2361;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "[Lvf;")
    public class150[] field2366;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "[B")
    public byte[] field2364;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "[I")
    private int[] field2375;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "[S")
    public short[] field2370;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "[B")
    public byte[] field2365;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "[Lnp;")
    public class490[] field2367;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lbg;")
    public static class464 field2362 = new class464();

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public static int field2372 = 0;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "Lqfa;")
    public static class98 field2373 = new class98(98, -1);

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "B")
    public static byte field2374;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lwr;[I[BI)Z", line = 12)
    public final boolean method1119(class457 arg0, int[] arg1, byte[] arg2, int arg3) {
        field2371++;
        boolean var5 = true;
        int var6 = 0;
        class490 var7 = null;
        int var8 = 0;
        if (arg3 != -1881228126) {
            return true;
        }
        while (var8 < 128) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2375[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method2720(var9 >> 2, -2, arg1);
                        } else {
                            var7 = arg0.method2716(arg1, var9 >> 2, -3177);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2367[var8] = var7;
                        this.field2375[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 70)
    public static void method1120(int arg0) {
        if (arg0 == -2) {
            field2362 = null;
            field2373 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)Z", line = 89)
    public static final boolean method1121(int arg0, int arg1) {
        if (arg1 < 106) {
            return true;
        } else {
            field2368++;
            return arg0 >= 12 && arg0 <= 17;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V", line = 104)
    public final void method1122(int arg0) {
        this.field2375 = null;
        if (arg0 == 2) {
            field2363++;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 117)
    public class176() {
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([B)V", line = 119)
    public class176(byte[] arg0) {
        this.field2361 = new byte[128];
        this.field2366 = new class150[128];
        this.field2364 = new byte[128];
        this.field2375 = new int[128];
        this.field2370 = new short[128];
        this.field2365 = new byte[128];
        this.field2367 = new class490[128];
        class675 var2 = new class675(arg0);
        int var3;
        for (var3 = 0; var2.field9154[var2.field9146 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3719(1854307120);
        }
        var2.field9146++;
        var3++;
        int var6 = var2.field9146;
        var2.field9146 += var3;
        int var7;
        for (var7 = 0; var2.field9154[var2.field9146 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3719(1854307120);
        }
        var2.field9146++;
        var7++;
        int var10 = var2.field9146;
        var2.field9146 += var7;
        int var11;
        for (var11 = 0; var2.field9154[var2.field9146 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3719(1854307120);
        }
        var11++;
        var2.field9146++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3750((byte) 35);
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
        class150[] var18 = new class150[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class150 var102 = var18[var19] = new class150();
            int var103 = var2.method3750((byte) 35);
            if (var103 > 0) {
                var102.field2123 = new byte[var103 * 2];
            }
            int var104 = var2.method3750((byte) 35);
            if (var104 > 0) {
                var102.field2131 = new byte[var104 * 2 + 2];
                var102.field2131[1] = 64;
            }
        }
        int var20 = var2.method3750((byte) 35);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method3750((byte) 35);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field9154[var2.field9146 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3719(1854307120);
        }
        var24++;
        var2.field9146++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3750((byte) 35);
            this.field2370[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3750((byte) 35);
            this.field2370[var30] = (short) (this.field2370[var30] + (var29 << 8));
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
                var33 = var2.method3742((byte) 122);
            }
            this.field2370[var34] = (short) (this.field2370[var34] + (class286.method1877(var33 - 1, 2) << 14));
            var31--;
            this.field2375[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2375[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field9154[var6++] - 1;
                }
                this.field2361[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2375[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field9154[var10++] + 16 << 2;
                }
                var40--;
                this.field2365[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class150 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2375[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field2366[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var48) {
                    var47 = -1;
                } else {
                    var47 = var25[var48++];
                }
                if (this.field2375[var50] > 0) {
                    var49 = var2.method3750((byte) 35) + 1;
                }
            }
            var47--;
            this.field2364[var50] = (byte) var49;
        }
        this.field2369 = var2.method3750((byte) 35) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class150 var99 = var18[var51];
            if (var99.field2123 != null) {
                for (int var100 = 1; var100 < var99.field2123.length; var100 += 2) {
                    var99.field2123[var100] = var2.method3719(1854307120);
                }
            }
            if (var99.field2131 != null) {
                for (int var101 = 3; var101 < (var99.field2131.length - 2); var101 += 2) {
                    var99.field2131[var101] = var2.method3719(1854307120);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3719(1854307120);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3719(1854307120);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class150 var96 = var18[var54];
            if (var96.field2131 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2131.length; var98 += 2) {
                    var97 = var97 + var2.method3750((byte) 35) + 1;
                    var96.field2131[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class150 var93 = var18[var55];
            if (var93.field2123 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2123.length; var95 += 2) {
                    var94 -= -var2.method3750((byte) 35) - 1;
                    var93.field2123[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3750((byte) 35);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method3750((byte) 35) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2364[var60] = (byte) (this.field2364[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class580.method3303(-2070226657, var64 - var58, var66);
                    this.field2364[var67] = (byte) (this.field2364[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2364[var62] = (byte) (this.field2364[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method3750((byte) 35);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method3750((byte) 35) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2365[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2365[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class580.method3303(-2070226657, var78 - var71, var80);
                    int var83 = (this.field2365[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field2365[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field2365[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2365[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2132 = var2.method3750((byte) 35);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class150 var92 = var18[var86];
            if (var92.field2123 != null) {
                var92.field2133 = var2.method3750((byte) 35);
            }
            if (var92.field2131 != null) {
                var92.field2129 = var2.method3750((byte) 35);
            }
            if (var92.field2132 > 0) {
                var92.field2136 = var2.method3750((byte) 35);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2137 = var2.method3750((byte) 35);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class150 var91 = var18[var88];
            if (var91.field2137 > 0) {
                var91.field2134 = var2.method3750((byte) 35);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class150 var90 = var18[var89];
            if (var90.field2134 > 0) {
                var90.field2121 = var2.method3750((byte) 35);
            }
        }
        if (class341.field4746) {
        }
    }
}
