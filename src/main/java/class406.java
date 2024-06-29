import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class406 extends class665 {

    @OriginalMember(owner = "client!os", name = "m", descriptor = "[I")
    private int[] field5939;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "[B")
    public byte[] field5948;

    @OriginalMember(owner = "client!os", name = "u", descriptor = "[Lcv;")
    public class527[] field5947;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "[S")
    public short[] field5941;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "[Lmm;")
    public class250[] field5942;

    @OriginalMember(owner = "client!os", name = "n", descriptor = "[B")
    public byte[] field5940;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "[B")
    public byte[] field5944;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public int field5938;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    public static int field5946;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(Z)[Lrw;", line = 6)
    public static final class703[] method2461(boolean arg0) {
        field5937++;
        if (arg0) {
            field5943 = -23;
        }
        return new class703[] { class573.field8065, class188.field2710, class224.field3167, class333.field4944, class336.field4962, class56.field1092, class500.field7080, class224.field3156, class701.field9907, class548.field7699 };
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(BLee;[I[B)Z", line = 21)
    public final boolean method2462(byte arg0, class628 arg1, int[] arg2, byte[] arg3) {
        if (arg0 != -35) {
            return false;
        }
        field5946++;
        boolean var5 = true;
        int var6 = 0;
        class250 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field5939[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method3505(106, arg2, var9 >> 2);
                        } else {
                            var7 = arg1.method3500(0, var9 >> 2, arg2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5942[var8] = var7;
                        this.field5939[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 81)
    public final void method2463(byte arg0) {
        if (arg0 == -81) {
            field5945++;
            this.field5939 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 96)
    public class406() {
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "([B)V", line = 99)
    public class406(byte[] arg0) {
        this.field5939 = new int[128];
        this.field5948 = new byte[128];
        this.field5947 = new class527[128];
        this.field5941 = new short[128];
        this.field5942 = new class250[128];
        this.field5940 = new byte[128];
        this.field5944 = new byte[128];
        class695 var2 = new class695(arg0);
        int var3;
        for (var3 = 0; var2.field9796[var2.field9761 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3827((byte) 38);
        }
        var3++;
        var2.field9761++;
        int var6 = var2.field9761;
        var2.field9761 += var3;
        int var7;
        for (var7 = 0; var2.field9796[var2.field9761 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3827((byte) 103);
        }
        var7++;
        var2.field9761++;
        int var10 = var2.field9761;
        var2.field9761 += var7;
        int var11;
        for (var11 = 0; var2.field9796[var2.field9761 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3827((byte) -71);
        }
        var11++;
        var2.field9761++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3826(false);
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
        class527[] var18 = new class527[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class527 var102 = var18[var19] = new class527();
            int var103 = var2.method3826(false);
            if (var103 > 0) {
                var102.field7423 = new byte[var103 * 2];
            }
            int var104 = var2.method3826(false);
            if (var104 > 0) {
                var102.field7422 = new byte[var104 * 2 + 2];
                var102.field7422[1] = 64;
            }
        }
        int var20 = var2.method3826(false);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method3826(false);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field9796[var2.field9761 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3827((byte) -85);
        }
        var2.field9761++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3826(false);
            this.field5941[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3826(false);
            this.field5941[var30] = (short) (this.field5941[var30] + (var29 << 8));
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
                var33 = var2.method3820(false);
            }
            this.field5941[var34] = (short) (this.field5941[var34] + class689.method3797(var33 - 1 << 14, 32768));
            var31--;
            this.field5939[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5939[var38] != 0) {
                if (var35 == 0) {
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field9796[var6++] - 1;
                }
                var35--;
                this.field5944[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5939[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field9796[var10++] + 16 << 2;
                }
                var40--;
                this.field5940[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class527 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5939[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field5947[var46] = var45;
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
                if (this.field5939[var50] > 0) {
                    var49 = var2.method3826(false) + 1;
                }
            }
            var48--;
            this.field5948[var50] = (byte) var49;
        }
        this.field5938 = var2.method3826(false) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class527 var99 = var18[var51];
            if (var99.field7423 != null) {
                for (int var100 = 1; var100 < var99.field7423.length; var100 += 2) {
                    var99.field7423[var100] = var2.method3827((byte) 48);
                }
            }
            if (var99.field7422 != null) {
                for (int var101 = 3; var101 < (var99.field7422.length - 2); var101 += 2) {
                    var99.field7422[var101] = var2.method3827((byte) -87);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3827((byte) -78);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3827((byte) -85);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class527 var96 = var18[var54];
            if (var96.field7422 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field7422.length; var98 += 2) {
                    var97 += var2.method3826(false) + 1;
                    var96.field7422[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class527 var93 = var18[var55];
            if (var93.field7423 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field7423.length; var95 += 2) {
                    var94 = var2.method3826(false) + var94 + 1;
                    var93.field7423[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3826(false);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var2.method3826(false)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5948[var60] = (byte) (this.field5948[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class59.method632(var66, var64 - var58, 606845215);
                    var66 += var65 - var59;
                    this.field5948[var67] = (byte) (this.field5948[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5948[var62] = (byte) (this.field5948[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method3826(false);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method3826(false) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5940[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5940[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class59.method632(var80, var78 - var71, 606845215);
                    int var83 = (this.field5940[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field5940[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field5940[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5940[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field7420 = var2.method3826(false);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class527 var92 = var18[var86];
            if (var92.field7423 != null) {
                var92.field7427 = var2.method3826(false);
            }
            if (var92.field7422 != null) {
                var92.field7424 = var2.method3826(false);
            }
            if (var92.field7420 > 0) {
                var92.field7431 = var2.method3826(false);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field7430 = var2.method3826(false);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class527 var91 = var18[var88];
            if (var91.field7430 > 0) {
                var91.field7421 = var2.method3826(false);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class527 var90 = var18[var89];
            if (var90.field7421 > 0) {
                var90.field7425 = var2.method3826(false);
            }
        }
    }
}
