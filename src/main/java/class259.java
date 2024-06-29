import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class259 extends class238 {

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[I")
    private int[] field3797;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[B")
    public byte[] field3801;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "[Laf;")
    public class275[] field3802;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "[B")
    public byte[] field3800;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[S")
    public short[] field3794;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "[B")
    public byte[] field3798;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lnd;")
    public class352[] field3796;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Z")
    public static boolean field3799;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lbj;I)V")
    public static final void method1611(class146 arg0, int arg1) {
        field3791++;
        int var2 = arg0.field2111 - class353.field5090;
        int var3 = arg0.field2137 * 128 + (arg0.method918(false) * 64);
        int var4 = arg0.field2085 * 128 + (arg0.method918(false) * 64);
        arg0.field2162 = 0;
        arg0.field4317 += (var4 - arg0.field4317) / var2;
        arg0.field4331 += (var3 - arg0.field4331) / var2;
        if (arg0.field2132 == 0) {
            arg0.method919((byte) -115, 8192);
        }
        int var5 = -5 % ((arg1 + 18) / 55);
        if (arg0.field2132 == 1) {
            arg0.method919((byte) 68, 12288);
        }
        if (arg0.field2132 == 2) {
            arg0.method919((byte) 50, 0);
        }
        if (arg0.field2132 == 3) {
            arg0.method919((byte) -117, 4096);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)V")
    public static final void method1612(int arg0, byte arg1) {
        if (arg1 != 49) {
            return;
        }
        class230.field3474 = -1;
        field3795++;
        class377.field5427 = -1;
        class128.field1666 = arg0;
        class81.method459((byte) -109);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public final void method1613(int arg0) {
        field3803++;
        this.field3797 = null;
        int var2 = -35 % ((14 - arg0) / 36);
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class259() {
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "([B)V")
    public class259(byte[] arg0) {
        this.field3797 = new int[128];
        this.field3801 = new byte[128];
        this.field3802 = new class275[128];
        this.field3800 = new byte[128];
        this.field3794 = new short[128];
        this.field3798 = new byte[128];
        this.field3796 = new class352[128];
        class276 var2 = new class276(arg0);
        int var3;
        for (var3 = 0; var2.field4064[var2.field4021 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1715((byte) -109);
        }
        var3++;
        var2.field4021++;
        int var6 = var2.field4021;
        var2.field4021 += var3;
        int var7;
        for (var7 = 0; var2.field4064[var2.field4021 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1715((byte) -80);
        }
        var2.field4021++;
        var7++;
        int var10 = var2.field4021;
        var2.field4021 += var7;
        int var11;
        for (var11 = 0; var2.field4064[var2.field4021 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1715((byte) 89);
        }
        var2.field4021++;
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
                int var105 = var2.method1701(-23121);
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
        class275[] var18 = new class275[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class275 var102 = var18[var19] = new class275();
            int var103 = var2.method1701(-23121);
            if (var103 > 0) {
                var102.field3990 = new byte[var103 * 2];
            }
            int var104 = var2.method1701(-23121);
            if (var104 > 0) {
                var102.field3986 = new byte[var104 * 2 + 2];
                var102.field3986[1] = 64;
            }
        }
        int var20 = var2.method1701(-23121);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1701(-23121);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field4064[var2.field4021 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1715((byte) 125);
        }
        var24++;
        var2.field4021++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1701(-23121);
            this.field3794[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1701(-23121);
            this.field3794[var30] = (short) (this.field3794[var30] + (var29 << 8));
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
                var33 = var2.method1692(106);
            }
            this.field3794[var34] = (short) (this.field3794[var34] + (class367.method2256(2, var33 - 1) << 14));
            this.field3797[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3797[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field4064[var6++] - 1;
                }
                var36--;
                this.field3800[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3797[var42] != 0) {
                if (var40 == 0) {
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var2.field4064[var10++] + 16 << 2;
                }
                var40--;
                this.field3798[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class275 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3797[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field3802[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field3797[var50] > 0) {
                    var49 = var2.method1701(-23121) + 1;
                }
            }
            var48--;
            this.field3801[var50] = (byte) var49;
        }
        this.field3792 = var2.method1701(-23121) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class275 var99 = var18[var51];
            if (var99.field3990 != null) {
                for (int var100 = 1; var100 < var99.field3990.length; var100 += 2) {
                    var99.field3990[var100] = var2.method1715((byte) 112);
                }
            }
            if (var99.field3986 != null) {
                for (int var101 = 3; var101 < var99.field3986.length - 2; var101 += 2) {
                    var99.field3986[var101] = var2.method1715((byte) 43);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1715((byte) 75);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1715((byte) -106);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class275 var96 = var18[var54];
            if (var96.field3986 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3986.length; var98 += 2) {
                    var97 = var97 + var2.method1701(-23121) + 1;
                    var96.field3986[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class275 var93 = var18[var55];
            if (var93.field3990 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3990.length; var95 += 2) {
                    var94 += var2.method1701(-23121) + 1;
                    var93.field3990[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1701(-23121);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1701(-23121) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3801[var60] = (byte) (this.field3801[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class448.method2615(var64 - var58, (byte) -77, var66);
                    this.field3801[var67] = (byte) (this.field3801[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3801[var63] = (byte) (this.field3801[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1701(-23121);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1701(-23121) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3798[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3798[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class448.method2615(var78 - var71, (byte) -77, var80);
                    int var83 = (this.field3798[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3798[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3798[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3798[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3983 = var2.method1701(-23121);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class275 var92 = var18[var86];
            if (var92.field3990 != null) {
                var92.field3992 = var2.method1701(-23121);
            }
            if (var92.field3986 != null) {
                var92.field3997 = var2.method1701(-23121);
            }
            if (var92.field3983 > 0) {
                var92.field3993 = var2.method1701(-23121);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3989 = var2.method1701(-23121);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class275 var91 = var18[var88];
            if (var91.field3989 > 0) {
                var91.field3984 = var2.method1701(-23121);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class275 var90 = var18[var89];
            if (var90.field3984 > 0) {
                var90.field3991 = var2.method1701(-23121);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B[BLui;[I)Z")
    public final boolean method1614(byte arg0, byte[] arg1, class138 arg2, int[] arg3) {
        field3790++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 != 98) {
            return true;
        }
        class352 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3797[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method871(var9 >> 2, arg3, false);
                        } else {
                            var7 = arg2.method869(false, arg3, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3796[var8] = var7;
                        this.field3797[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    static {
        new class326("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field3799 = false;
    }
}
