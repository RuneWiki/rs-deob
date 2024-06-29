import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class34 extends class264 {

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
    private int[] field486;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "[S")
    public short[] field481;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[B")
    public byte[] field484;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "[B")
    public byte[] field475;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[Lag;")
    public class311[] field485;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "[B")
    public byte[] field478;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "[Lua;")
    public class179[] field482;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    public static int field480 = 0;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "[S")
    public static short[] field490;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Ljn;")
    public static class409 field489;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "Lil;")
    public static class274 field491;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Lbt;")
    public static class363 field492;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Lkg;")
    public static class223 field494;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static final void method320(int arg0) {
        field477++;
        if (arg0 == 128) {
            class109.field1482.method2313(121);
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    public static void method321(int arg0) {
        field492 = null;
        field491 = null;
        if (arg0 != -1) {
            field493 = 25;
        }
        field494 = null;
        field489 = null;
        field490 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class34() {
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Loq;[II[B)Z")
    public final boolean method322(class124 arg0, int[] arg1, int arg2, byte[] arg3) {
        if (arg2 != 18256) {
            this.method323(-21);
        }
        field483++;
        boolean var5 = true;
        int var6 = 0;
        class179 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field486[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method839(var9 >> 2, arg1, (byte) 127);
                        } else {
                            var7 = arg0.method834(var9 >> 2, 0, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field482[var8] = var7;
                        this.field486[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
    public class34(byte[] arg0) {
        this.field486 = new int[128];
        this.field481 = new short[128];
        this.field484 = new byte[128];
        this.field475 = new byte[128];
        this.field485 = new class311[128];
        this.field478 = new byte[128];
        this.field482 = new class179[128];
        class256 var2 = new class256(arg0);
        int var3;
        for (var3 = 0; var2.field3764[var2.field3762 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1728((byte) 79);
        }
        var2.field3762++;
        var3++;
        int var6 = var2.field3762;
        var2.field3762 += var3;
        int var7;
        for (var7 = 0; var2.field3764[var2.field3762 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1728((byte) 110);
        }
        var2.field3762++;
        var7++;
        int var10 = var2.field3762;
        var2.field3762 += var7;
        int var11;
        for (var11 = 0; var2.field3764[var2.field3762 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1728((byte) 89);
        }
        var2.field3762++;
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
                int var105 = var2.method1738((byte) -94);
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
        class311[] var18 = new class311[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class311 var102 = var18[var19] = new class311();
            int var103 = var2.method1738((byte) -88);
            if (var103 > 0) {
                var102.field4585 = new byte[var103 * 2];
            }
            int var104 = var2.method1738((byte) -84);
            if (var104 > 0) {
                var102.field4572 = new byte[var104 * 2 + 2];
                var102.field4572[1] = 64;
            }
        }
        int var20 = var2.method1738((byte) -46);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1738((byte) 104);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field3764[var2.field3762 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1728((byte) 107);
        }
        var2.field3762++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1738((byte) -25);
            this.field481[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1738((byte) -93);
            this.field481[var30] = (short) (this.field481[var30] + (var29 << 8));
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
                var33 = var2.method1735((byte) 100);
            }
            this.field481[var34] = (short) (this.field481[var34] + class386.method2438(var33 - 1 << 14, 32768));
            this.field486[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field486[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field3764[var6++] - 1;
                }
                this.field475[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field486[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field3764[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field484[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class311 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field486[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field485[var46] = var45;
                var43--;
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
                if (this.field486[var50] > 0) {
                    var49 = var2.method1738((byte) -19) + 1;
                }
            }
            this.field478[var50] = (byte) var49;
            var48--;
        }
        this.field479 = var2.method1738((byte) -71) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class311 var99 = var18[var51];
            if (var99.field4585 != null) {
                for (int var100 = 1; var100 < var99.field4585.length; var100 += 2) {
                    var99.field4585[var100] = var2.method1728((byte) 108);
                }
            }
            if (var99.field4572 != null) {
                for (int var101 = 3; var101 < var99.field4572.length - 2; var101 += 2) {
                    var99.field4572[var101] = var2.method1728((byte) 119);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1728((byte) 127);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1728((byte) 122);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class311 var96 = var18[var54];
            if (var96.field4572 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4572.length; var98 += 2) {
                    var97 = var97 + var2.method1738((byte) 100) + 1;
                    var96.field4572[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class311 var93 = var18[var55];
            if (var93.field4585 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4585.length; var95 += 2) {
                    var94 = var94 + var2.method1738((byte) 110) + 1;
                    var93.field4585[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1738((byte) -115);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method1738((byte) -92) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field478[var60] = (byte) (this.field478[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class304.method2029(var66, -7645, var64 - var58);
                    var66 += var65 - var59;
                    this.field478[var67] = (byte) (this.field478[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field478[var62] = (byte) (this.field478[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1738((byte) -72);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1738((byte) 54) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field484[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field484[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class304.method2029(var80, -7645, var78 - var71);
                    int var83 = (this.field484[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field484[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field484[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field484[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4578 = var2.method1738((byte) 120);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class311 var92 = var18[var86];
            if (var92.field4585 != null) {
                var92.field4583 = var2.method1738((byte) 61);
            }
            if (var92.field4572 != null) {
                var92.field4574 = var2.method1738((byte) 98);
            }
            if (var92.field4578 > 0) {
                var92.field4577 = var2.method1738((byte) 84);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4581 = var2.method1738((byte) -100);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class311 var91 = var18[var88];
            if (var91.field4581 > 0) {
                var91.field4584 = var2.method1738((byte) -91);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class311 var90 = var18[var89];
            if (var90.field4584 > 0) {
                var90.field4579 = var2.method1738((byte) -74);
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public final void method323(int arg0) {
        this.field486 = null;
        int var2 = 6 % ((55 - arg0) / 59);
        field476++;
    }

    static {
        new class409("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field487 = 0;
        field490 = new short[256];
        field489 = new class409("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");
        field491 = new class274(14, 6);
        field492 = new class363(128);
        field493 = 0;
        field494 = null;
    }
}
