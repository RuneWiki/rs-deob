import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class679 extends class134 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "[B")
    public byte[] field9609;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
    private int[] field9618;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "[Lcba;")
    public class548[] field9607;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "[B")
    public byte[] field9617;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "[B")
    public byte[] field9612;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "[Lpm;")
    public class582[] field9616;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[S")
    public short[] field9610;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field9611;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
    public static int field9614 = -50;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
    public static int field9613;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method3852(byte arg0) {
        int var2 = -36 / ((-arg0 - 67) / 34);
        field9615++;
        this.field9618 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[ILvi;[B)Z")
    public final boolean method3853(int arg0, int[] arg1, class537 arg2, byte[] arg3) {
        field9613++;
        boolean var5 = true;
        int var6 = 0;
        class548 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field9618[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method3154(var9 >> 2, -23, arg1);
                        } else {
                            var7 = arg2.method3156((byte) -85, arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field9607[var8] = var7;
                        this.field9618[var8] = 0;
                    }
                }
            }
        }
        if (arg0 != -1124344094) {
            this.field9611 = -125;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public static final void method3854(int arg0, int arg1) {
        field9608++;
        class47 var2 = class258.method1546(7, arg0, (byte) 121);
        int var3 = -31 % ((10 - arg1) / 58);
        var2.method274(false);
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
    public class679() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "([B)V")
    public class679(byte[] arg0) {
        this.field9609 = new byte[128];
        this.field9618 = new int[128];
        this.field9607 = new class548[128];
        this.field9617 = new byte[128];
        this.field9612 = new byte[128];
        this.field9616 = new class582[128];
        this.field9610 = new short[128];
        class244 var2 = new class244(arg0);
        int var3;
        for (var3 = 0; var2.field2912[var2.field2903 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1448((byte) -84);
        }
        var3++;
        var2.field2903++;
        int var6 = var2.field2903;
        var2.field2903 += var3;
        int var7;
        for (var7 = 0; var2.field2912[var2.field2903 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1448((byte) -95);
        }
        var2.field2903++;
        var7++;
        int var10 = var2.field2903;
        var2.field2903 += var7;
        int var11;
        for (var11 = 0; var2.field2912[var2.field2903 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1448((byte) -92);
        }
        var2.field2903++;
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
                int var105 = var2.method1423(-30);
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
        class582[] var18 = new class582[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class582 var102 = var18[var19] = new class582();
            int var103 = var2.method1423(-80);
            if (var103 > 0) {
                var102.field8220 = new byte[var103 * 2];
            }
            int var104 = var2.method1423(-22);
            if (var104 > 0) {
                var102.field8229 = new byte[var104 * 2 + 2];
                var102.field8229[1] = 64;
            }
        }
        int var20 = var2.method1423(-109);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1423(-96);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2912[var2.field2903 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1448((byte) -84);
        }
        var2.field2903++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1423(-53);
            this.field9610[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1423(-82);
            this.field9610[var30] = (short) (this.field9610[var30] + (var29 << 8));
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
                var33 = var2.method1478(0);
            }
            this.field9610[var34] = (short) (this.field9610[var34] + class327.method1956(32768, var33 - 1 << 14));
            this.field9618[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field9618[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field2912[var6++] - 1;
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field9612[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field9618[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field2912[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field9617[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class582 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field9618[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field9616[var46] = var45;
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
                if (this.field9618[var50] > 0) {
                    var49 = var2.method1423(-63) + 1;
                }
            }
            var48--;
            this.field9609[var50] = (byte) var49;
        }
        this.field9611 = var2.method1423(-35) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class582 var99 = var18[var51];
            if (var99.field8220 != null) {
                for (int var100 = 1; var100 < var99.field8220.length; var100 += 2) {
                    var99.field8220[var100] = var2.method1448((byte) -120);
                }
            }
            if (var99.field8229 != null) {
                for (int var101 = 3; var101 < var99.field8229.length - 2; var101 += 2) {
                    var99.field8229[var101] = var2.method1448((byte) -109);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1448((byte) -121);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1448((byte) -79);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class582 var96 = var18[var54];
            if (var96.field8229 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field8229.length; var98 += 2) {
                    var97 = var97 + var2.method1423(-34) + 1;
                    var96.field8229[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class582 var93 = var18[var55];
            if (var93.field8220 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field8220.length; var95 += 2) {
                    var94 = (var94 + var2.method1423(-117)) + 1;
                    var93.field8220[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1423(-102);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1423(-85) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field9609[var60] = (byte) (this.field9609[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class90.method617(115, var66, var64 - var58);
                    this.field9609[var67] = (byte) (this.field9609[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field9609[var62] = (byte) (this.field9609[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1423(-101);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1423(-57) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field9617[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field9617[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class90.method617(86, var80, var78 - var71);
                    int var83 = (this.field9617[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field9617[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field9617[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field9617[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field8233 = var2.method1423(-61);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class582 var92 = var18[var86];
            if (var92.field8220 != null) {
                var92.field8231 = var2.method1423(-64);
            }
            if (var92.field8229 != null) {
                var92.field8223 = var2.method1423(-35);
            }
            if (var92.field8233 > 0) {
                var92.field8227 = var2.method1423(-40);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field8222 = var2.method1423(-87);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class582 var91 = var18[var88];
            if (var91.field8222 > 0) {
                var91.field8224 = var2.method1423(-48);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class582 var90 = var18[var89];
            if (var90.field8224 > 0) {
                var90.field8225 = var2.method1423(-103);
            }
        }
    }
}
