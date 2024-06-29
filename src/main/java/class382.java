import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class382 extends class260 {

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "[S")
    public short[] field5584;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "[Lck;")
    public class452[] field5591;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[B")
    public byte[] field5575;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[Lke;")
    public class423[] field5578;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "[B")
    public byte[] field5574;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "[I")
    private int[] field5580;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "[B")
    public byte[] field5577;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "[I")
    public static int[] field5579 = new int[4096];

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[[I")
    public static int[][] field5587 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "[[[Lhg;")
    public static class486[][][] field5586;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIZIII)V")
    public static final void method2265(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var8 = arg1 + 1;
        class210.method1300(arg0, class437.field6400[arg1], (byte) 93, arg4, arg5);
        field5576++;
        int var9 = arg3 - 1;
        class210.method1300(arg0, class437.field6400[arg3], (byte) 123, arg4, arg5);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class437.field6400[var6];
            var7[arg0] = var7[arg4] = arg5;
        }
        if (arg2) {
            method2269(20, 25, 62, (byte) 111, 121);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method2266(int arg0) {
        if (arg0 < 12) {
            field5582 = 36;
        }
        field5587 = null;
        field5579 = null;
        field5586 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
    public static final void method2267(int arg0, int arg1, int arg2, int arg3) {
        field5585++;
        class97 var4 = class348.method2064(arg2, 11, arg3 - 20088);
        var4.method712((byte) -114);
        var4.field1471 = arg1;
        var4.field1468 = arg0;
        if (arg3 != 20210) {
            method2266(52);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIII)V")
    public static final void method2268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5588++;
        if (arg0 == arg5) {
            client.method1223(arg3, arg0, arg1, arg2, 10);
        } else if (arg4 == -15703) {
            if (arg1 - arg0 >= class424.field6204 && (arg0 + arg1) <= class76.field1021 && class417.field6057 <= (arg2 - arg5) && arg2 + arg5 <= class224.field3193) {
                class338.method1965(arg0, arg1, arg5, arg2, false, arg3);
            } else {
                class258.method1556(arg3, arg0, (byte) 110, arg2, arg5, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
    public static final void method2269(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field5573++;
        if (class424.field6204 <= arg4 && class76.field1021 >= arg4) {
            int var5 = class46.method425(true, arg2, class224.field3193, class417.field6057);
            int var6 = class46.method425(true, arg1, class224.field3193, class417.field6057);
            class236.method1453(var5, arg4, (byte) 16, var6, arg0);
        }
        if (arg3 <= 38) {
            method2266(-78);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public final void method2270(byte arg0) {
        if (arg0 < 50) {
            this.method2270((byte) 10);
        }
        field5589++;
        this.field5580 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I[BLhf;)Z")
    public final boolean method2271(int arg0, int[] arg1, byte[] arg2, class271 arg3) {
        field5590++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 != 1) {
            return false;
        }
        class452 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field5580[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1619(0, arg1, var9 >> 2);
                        } else {
                            var7 = arg3.method1621(var9 >> 2, arg1, arg0 ^ 0xA39);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5591[var8] = var7;
                        this.field5580[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class382() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
    public class382(byte[] arg0) {
        this.field5584 = new short[128];
        this.field5591 = new class452[128];
        this.field5575 = new byte[128];
        this.field5578 = new class423[128];
        this.field5574 = new byte[128];
        this.field5580 = new int[128];
        this.field5577 = new byte[128];
        class391 var2 = new class391(arg0);
        int var3;
        for (var3 = 0; var2.field5678[var2.field5719 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2337(-1);
        }
        var2.field5719++;
        var3++;
        int var6 = var2.field5719;
        var2.field5719 += var3;
        int var7;
        for (var7 = 0; var2.field5678[var2.field5719 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2337(-1);
        }
        var2.field5719++;
        var7++;
        int var10 = var2.field5719;
        var2.field5719 += var7;
        int var11;
        for (var11 = 0; var2.field5678[var2.field5719 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2337(-1);
        }
        var11++;
        var2.field5719++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2348(-2);
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
        class423[] var18 = new class423[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class423 var102 = var18[var19] = new class423();
            int var103 = var2.method2348(-2);
            if (var103 > 0) {
                var102.field6198 = new byte[var103 * 2];
            }
            int var104 = var2.method2348(-2);
            if (var104 > 0) {
                var102.field6194 = new byte[var104 * 2 + 2];
                var102.field6194[1] = 64;
            }
        }
        int var20 = var2.method2348(-2);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method2348(-2);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field5678[var2.field5719 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2337(-1);
        }
        var2.field5719++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2348(-2);
            this.field5584[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2348(-2);
            this.field5584[var30] = (short) (this.field5584[var30] + (var29 << 8));
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
                var33 = var2.method2308((byte) 64);
            }
            this.field5584[var34] = (short) (this.field5584[var34] + (class251.method1501(var33 - 1, 2) << 14));
            this.field5580[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5580[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field5678[var6++] - 1;
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field5575[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5580[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field5678[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                var40--;
                this.field5574[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class423 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5580[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field5578[var46] = var45;
                var44--;
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
                if (this.field5580[var50] > 0) {
                    var49 = var2.method2348(-2) + 1;
                }
            }
            this.field5577[var50] = (byte) var49;
            var48--;
        }
        this.field5583 = var2.method2348(-2) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class423 var99 = var18[var51];
            if (var99.field6198 != null) {
                for (int var100 = 1; var100 < var99.field6198.length; var100 += 2) {
                    var99.field6198[var100] = var2.method2337(-1);
                }
            }
            if (var99.field6194 != null) {
                for (int var101 = 3; var101 < (var99.field6194.length - 2); var101 += 2) {
                    var99.field6194[var101] = var2.method2337(-1);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2337(-1);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2337(-1);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class423 var96 = var18[var54];
            if (var96.field6194 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field6194.length; var98 += 2) {
                    var97 = var2.method2348(-2) + (var97 + 1);
                    var96.field6194[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class423 var93 = var18[var55];
            if (var93.field6198 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field6198.length; var95 += 2) {
                    var94 = var2.method2348(-2) + var94 + 1;
                    var93.field6198[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2348(-2);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2348(-2) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5577[var60] = (byte) (this.field5577[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class154.method1033(var66, var64 - var58, (byte) -104);
                    this.field5577[var67] = (byte) (this.field5577[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5577[var62] = (byte) (this.field5577[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method2348(-2);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method2348(-2) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5574[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5574[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class154.method1033(var80, var78 - var71, (byte) -104);
                    int var83 = (this.field5574[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field5574[var81] = (byte) var83;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field5574[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5574[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field6191 = var2.method2348(-2);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class423 var92 = var18[var86];
            if (var92.field6198 != null) {
                var92.field6189 = var2.method2348(-2);
            }
            if (var92.field6194 != null) {
                var92.field6190 = var2.method2348(-2);
            }
            if (var92.field6191 > 0) {
                var92.field6192 = var2.method2348(-2);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field6188 = var2.method2348(-2);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class423 var91 = var18[var88];
            if (var91.field6188 > 0) {
                var91.field6201 = var2.method2348(-2);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class423 var90 = var18[var89];
            if (var90.field6201 > 0) {
                var90.field6193 = var2.method2348(-2);
            }
        }
    }
}
