import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class19 extends class67 {

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[Lgf;")
    public class62[] field316;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "[B")
    public byte[] field328;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "[Le;")
    public class39[] field321;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "[S")
    public short[] field324;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[B")
    public byte[] field329;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "[B")
    public byte[] field327;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
    private int[] field319;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Led;")
    private static class43 field318 = class191.method1219("wishes to trade with you)3", false);

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Led;")
    private static class43 field317 = class191.method1219("Loaded sprites", false);

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field333 = -1;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "Led;")
    public static class43 field331 = field317;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "Led;")
    public static class43 field336 = field318;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field337 = 0;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Lnb;")
    public static class120 field325;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([BLgd;[IB)Z")
    public final boolean method91(byte[] arg0, class60 arg1, int[] arg2, byte arg3) {
        field335++;
        boolean var5 = true;
        int var6 = 0;
        class62 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var10 = this.field319[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method381((byte) 107, var10 >> 2, arg2);
                        } else {
                            var7 = arg1.method383(arg2, var10 >> 2, -14692);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field316[var8] = var7;
                        this.field319[var8] = 0;
                    }
                }
            }
        }
        int var9 = 124 % ((arg3 - 56) / 59);
        return var5;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
    public final void method92(int arg0) {
        this.field319 = null;
        if (arg0 != 30975) {
            this.field327 = null;
        }
        field332++;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIBI)I")
    public static final int method93(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -70 / ((arg2 + 44) / 41);
        field326++;
        return (4096 - arg1) * arg0 + arg1 * arg3 >> 12;
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    public static void method94(int arg0) {
        field325 = null;
        field336 = null;
        field318 = null;
        field331 = null;
        field317 = null;
        if (arg0 != 12643) {
            method94(107);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZ)I")
    public static final int method95(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return 27;
        } else {
            int var3 = arg0 - 1 & arg1 >> 31;
            field322++;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static final void method96(int arg0) {
        field320++;
        if (arg0 != -1) {
            return;
        }
        try {
            if (class158.field3206 == 1) {
                int var1 = class38.field725.method728(~arg0);
                if (var1 > 0 && class38.field725.method711(0)) {
                    int var2 = var1 - class104.field1971;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class38.field725.method722(var2, 1);
                } else {
                    class38.field725.method729(-92);
                    class38.field725.method723(false);
                    if (class5.field113 == null) {
                        class158.field3206 = 0;
                    } else {
                        class158.field3206 = 2;
                    }
                    class187.field3676 = null;
                    class77.field1542 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class38.field725.method729(arg0 - 124);
            class187.field3676 = null;
            class158.field3206 = 0;
            class77.field1542 = null;
            class5.field113 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field316 = new class62[128];
        this.field328 = new byte[128];
        this.field321 = new class39[128];
        this.field324 = new short[128];
        this.field329 = new byte[128];
        this.field327 = new byte[128];
        this.field319 = new int[128];
        class89 var2 = new class89(arg0);
        int var3;
        for (var3 = 0; var2.field1769[var2.field1727 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method577((byte) 30);
        }
        var3++;
        var2.field1727++;
        int var6 = 0;
        int var7 = var2.field1727;
        var2.field1727 += var3;
        while (var2.field1769[var2.field1727 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method577((byte) 30);
        }
        var6++;
        var2.field1727++;
        int var10 = var2.field1727;
        int var11 = 0;
        var2.field1727 += var6;
        while (var2.field1769[var2.field1727 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method577((byte) 30);
        }
        var2.field1727++;
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
                int var105 = var2.method538((byte) -41);
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
        class39[] var18 = new class39[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class39 var102 = var18[var19] = new class39();
            int var103 = var2.method538((byte) -55);
            if (var103 > 0) {
                var102.field746 = new byte[var103 * 2];
            }
            int var104 = var2.method538((byte) 113);
            if (var104 > 0) {
                var102.field731 = new byte[var104 * 2 + 2];
                var102.field731[1] = 64;
            }
        }
        int var20 = var2.method538((byte) 100);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method538((byte) -36);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1769[var2.field1727 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method577((byte) 30);
        }
        int var27 = 0;
        var24++;
        var2.field1727++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method538((byte) 107);
            this.field324[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method538((byte) -114);
            this.field324[var30] = (short) (this.field324[var30] + (var29 << 8));
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
                var33 = var2.method536(1507602439);
            }
            this.field324[var34] = (short) (this.field324[var34] + (class7.method38(2, var33 - 1) << 14));
            this.field319[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field319[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field1769[var7++] - 1;
                }
                this.field328[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field319[var42] != 0) {
                if (var39 == 0) {
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field1769[var10++] + 16 << 2;
                }
                var39--;
                this.field327[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class39 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field319[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field321[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var48) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field319[var50] > 0) {
                    var49 = var2.method538((byte) -115) + 1;
                }
            }
            this.field329[var50] = (byte) var49;
            var47--;
        }
        this.field330 = var2.method538((byte) 78) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class39 var99 = var18[var51];
            if (var99.field746 != null) {
                for (int var100 = 1; var100 < var99.field746.length; var100 += 2) {
                    var99.field746[var100] = var2.method577((byte) 30);
                }
            }
            if (var99.field731 != null) {
                for (int var101 = 3; var101 < var99.field731.length - 2; var101 += 2) {
                    var99.field731[var101] = var2.method577((byte) 30);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method577((byte) 30);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method577((byte) 30);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class39 var96 = var18[var54];
            if (var96.field731 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field731.length; var98 += 2) {
                    var97 = var97 + var2.method538((byte) 84) + 1;
                    var96.field731[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class39 var93 = var18[var55];
            if (var93.field746 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field746.length; var95 += 2) {
                    var94 -= -var2.method538((byte) -67) - 1;
                    var93.field746[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method538((byte) 114);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method538((byte) -124) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field329[var60] = (byte) (this.field329[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class189.method1202((byte) -86, var66, var64 - var59);
                    this.field329[var67] = (byte) (this.field329[var67] * var68 + 32 >> 6);
                    var66 += var65 - var58;
                }
                var58 = var65;
                var59 = var64;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field329[var62] = (byte) (this.field329[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method538((byte) 107);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method538((byte) 102) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field327[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field327[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class189.method1202((byte) -93, var80, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field327[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field327[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field327[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field327[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field730 = var2.method538((byte) -40);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class39 var92 = var18[var86];
            if (var92.field746 != null) {
                var92.field733 = var2.method538((byte) -49);
            }
            if (var92.field731 != null) {
                var92.field752 = var2.method538((byte) -92);
            }
            if (var92.field730 > 0) {
                var92.field738 = var2.method538((byte) 101);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field741 = var2.method538((byte) 124);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class39 var91 = var18[var88];
            if (var91.field741 > 0) {
                var91.field740 = var2.method538((byte) -91);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class39 var90 = var18[var89];
            if (var90.field740 > 0) {
                var90.field748 = var2.method538((byte) -103);
            }
        }
    }
}
