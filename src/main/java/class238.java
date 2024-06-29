import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class238 extends class288 {

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[Lik;")
    public class295[] field3417;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[B")
    public byte[] field3423;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[Lbb;")
    public class173[] field3424;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "[S")
    public short[] field3422;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[B")
    public byte[] field3421;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "[I")
    private int[] field3429;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[B")
    public byte[] field3415;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Lpj;")
    public static class98 field3416 = new class98(5000);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[I")
    public static int[] field3428 = new int[2];

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static volatile int field3430 = 0;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[Lfd;")
    public static class58[] field3437 = new class58[14];

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field3432 = 0;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "F")
    public static float field3438 = 0.0F;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Lb;")
    public static class262 field3439;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "Lbc;")
    public static class282 field3434;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "Lwe;")
    public static class82 field3431;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Z")
    public static boolean field3425;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lcj;[BI[I)Z")
    public final boolean method1548(class74 arg0, byte[] arg1, int arg2, int[] arg3) {
        field3436++;
        boolean var5 = true;
        int var6 = 0;
        class295 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3429[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method456(arg3, var9 >> 2, (byte) -121);
                        } else {
                            var7 = arg0.method455((byte) 81, arg3, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3417[var8] = var7;
                        this.field3429[var8] = 0;
                    }
                }
            }
        }
        if (arg2 != 2) {
            method1550((byte) 51);
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)Z")
    public static final boolean method1549(byte arg0, int arg1) {
        field3418++;
        if (class60.field719[arg1]) {
            return true;
        }
        if (arg0 >= -78) {
            field3434 = null;
        }
        if (!class5.field63.method1847(0, arg1)) {
            return false;
        }
        int var2 = class5.field63.method1874((byte) 18, arg1);
        if (var2 == 0) {
            class60.field719[arg1] = true;
            return true;
        }
        if (class123.field1767[arg1] == null) {
            class123.field1767[arg1] = new class82[var2];
        }
        for (int var3 = 0; var3 < var2; var3++) {
            if (class123.field1767[arg1][var3] == null) {
                byte[] var4 = class5.field63.method1861(var3, arg1, 1);
                if (var4 != null) {
                    class82 var5 = class123.field1767[arg1][var3] = new class82();
                    var5.field1025 = (arg1 << 16) + var3;
                    if (var4[0] == -1) {
                        var5.method490((byte) 65, new class216(var4));
                    } else {
                        var5.method493(new class216(var4), 20);
                    }
                }
            }
        }
        class60.field719[arg1] = true;
        return true;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method1550(byte arg0) {
        field3439 = null;
        if (arg0 != -36) {
            return;
        }
        field3416 = null;
        field3437 = null;
        field3434 = null;
        field3431 = null;
        field3428 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class238() {
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public final void method1551(int arg0) {
        this.field3429 = null;
        if (arg0 != 3) {
            method1549((byte) -73, -79);
        }
        field3414++;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
    public class238(byte[] arg0) {
        this.field3417 = new class295[128];
        this.field3423 = new byte[128];
        this.field3424 = new class173[128];
        this.field3422 = new short[128];
        int var2 = 0;
        this.field3421 = new byte[128];
        this.field3429 = new int[128];
        this.field3415 = new byte[128];
        class216 var3 = new class216(arg0);
        while (var3.field3030[var3.field3021 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1355(true);
        }
        var3.field3021++;
        int var6 = var3.field3021;
        var2++;
        int var7 = 0;
        var3.field3021 += var2;
        while (var3.field3030[var3.field3021 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1355(true);
        }
        var3.field3021++;
        int var10 = 0;
        int var11 = var3.field3021;
        var7++;
        var3.field3021 += var7;
        while (var3.field3030[var3.field3021 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1355(true);
        }
        var3.field3021++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1407(122);
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
        class173[] var18 = new class173[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class173 var102 = var18[var19] = new class173();
            int var103 = var3.method1407(107);
            if (var103 > 0) {
                var102.field2472 = new byte[var103 * 2];
            }
            int var104 = var3.method1407(109);
            if (var104 > 0) {
                var102.field2469 = new byte[var104 * 2 + 2];
                var102.field2469[1] = 64;
            }
        }
        int var20 = var3.method1407(113);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method1407(123);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field3030[var3.field3021 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method1355(true);
        }
        var24++;
        var3.field3021++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1407(125);
            this.field3422[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1407(104);
            this.field3422[var30] = (short) (this.field3422[var30] + (var29 << 8));
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
                var33 = var3.method1396((byte) -115);
            }
            var31--;
            this.field3422[var34] = (short) (this.field3422[var34] + class5.method26(var33 - 1 << 14, 32768));
            this.field3429[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3429[var38] != 0) {
                if (var35 == 0) {
                    var36 = var3.field3030[var6++] - 1;
                    if (var37 < var4.length) {
                        var35 = var4[var37++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field3423[var38] = (byte) var36;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3429[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field3030[var11++] + 16 << 2;
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3421[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        class173 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3429[var46] != 0) {
                if (var45 == 0) {
                    var44 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var45 = var12[var43++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field3424[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var25[var49++];
                }
                if (this.field3429[var50] > 0) {
                    var47 = var3.method1407(112) + 1;
                }
            }
            this.field3415[var50] = (byte) var47;
            var48--;
        }
        this.field3419 = var3.method1407(124) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class173 var99 = var18[var51];
            if (var99.field2472 != null) {
                for (int var100 = 1; var100 < var99.field2472.length; var100 += 2) {
                    var99.field2472[var100] = var3.method1355(true);
                }
            }
            if (var99.field2469 != null) {
                for (int var101 = 3; var101 < (var99.field2469.length - 2); var101 += 2) {
                    var99.field2469[var101] = var3.method1355(true);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1355(true);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1355(true);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class173 var96 = var18[var54];
            if (var96.field2469 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2469.length; var98 += 2) {
                    var97 -= -var3.method1407(111) - 1;
                    var96.field2469[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class173 var93 = var18[var55];
            if (var93.field2472 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2472.length; var95 += 2) {
                    var94 -= -var3.method1407(127) - 1;
                    var93.field2472[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1407(126);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1407(124) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3415[var60] = (byte) (this.field3415[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class38.method242(-2913, var66, var64 - var58);
                    var66 += var65 - var59;
                    this.field3415[var67] = (byte) (this.field3415[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3415[var63] = (byte) (this.field3415[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var3.method1407(113);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var3.method1407(120) + 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field3421[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3421[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var72) * var71 + ((var78 - var72) / 2);
                var74 += 2;
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class38.method242(-2913, var80, var78 - var72);
                    var80 += var79 - var71;
                    int var83 = (this.field3421[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3421[var81] = (byte) var83;
                }
                var72 = var78;
                var71 = var79;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field3421[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3421[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2466 = var3.method1407(124);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class173 var92 = var18[var86];
            if (var92.field2472 != null) {
                var92.field2467 = var3.method1407(125);
            }
            if (var92.field2469 != null) {
                var92.field2473 = var3.method1407(126);
            }
            if (var92.field2466 > 0) {
                var92.field2478 = var3.method1407(125);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2474 = var3.method1407(121);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class173 var91 = var18[var88];
            if (var91.field2474 > 0) {
                var91.field2470 = var3.method1407(115);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class173 var90 = var18[var89];
            if (var90.field2470 > 0) {
                var90.field2462 = var3.method1407(106);
            }
        }
    }
}
