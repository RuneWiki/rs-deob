import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class236 extends class134 {

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[B")
    public byte[] field3739;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "[Luc;")
    public class39[] field3742;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "[S")
    public short[] field3733;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "[B")
    public byte[] field3741;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "[B")
    public byte[] field3740;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "[Lhc;")
    public class250[] field3743;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "[I")
    private int[] field3737;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Lkf;")
    public static class193 field3736 = new class193(128);

    @OriginalMember(owner = "client!lm", name = "D", descriptor = "B")
    public static byte field3747;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "[Lh;")
    public static class294[] field3746;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3744++;
        if (arg4 != -1497) {
            field3736 = null;
        }
        for (int var6 = arg0; var6 < arg2; var6++) {
            for (int var7 = arg5; var7 < arg1; var7++) {
                if (class209.field3357[var6][var7] == arg3 && class92.field1400[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
    public final void method1635(byte arg0) {
        field3738++;
        if (arg0 <= -102) {
            this.field3737 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V")
    public static final void method1636(int arg0, int arg1, int arg2, int arg3) {
        class154 var4 = class27.field346[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class98 var5 = var4.field2414;
        if (var5 != null) {
            var5.field1466 = var5.field1466 * arg3 / 16;
            var5.field1469 = var5.field1469 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIZ)I")
    public static final int method1637(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            return 48;
        }
        field3745++;
        if ((class128.field1972[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class128.field1972[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field3746 = null;
        field3736 = null;
        if (arg0 != 1) {
            field3736 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLdf;[B[I)Z")
    public final boolean method1639(byte arg0, class56 arg1, byte[] arg2, int[] arg3) {
        field3735++;
        boolean var5 = true;
        if (arg0 < 77) {
            method1637(61, -64, -92, false);
        }
        int var6 = 0;
        class39 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field3737[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method339(86, arg3, var9 >> 2);
                        } else {
                            var7 = arg1.method332((byte) -49, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3742[var8] = var7;
                        this.field3737[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
    public static final int method1640(int arg0, int arg1) {
        if (arg0 < 71) {
            return -43;
        } else {
            field3734++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class236() {
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
    public class236(byte[] arg0) {
        this.field3739 = new byte[128];
        this.field3742 = new class39[128];
        this.field3733 = new short[128];
        this.field3741 = new byte[128];
        this.field3740 = new byte[128];
        this.field3743 = new class250[128];
        this.field3737 = new int[128];
        int var2 = 0;
        class202 var3 = new class202(arg0);
        while (var3.field3234[var3.field3272 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1457((byte) -88);
        }
        var3.field3272++;
        int var6 = 0;
        int var7 = var3.field3272;
        var2++;
        var3.field3272 += var2;
        while (var3.field3234[var3.field3272 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1457((byte) -108);
        }
        var6++;
        var3.field3272++;
        int var10 = 0;
        int var11 = var3.field3272;
        var3.field3272 += var6;
        while (var3.field3234[var3.field3272 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1457((byte) -46);
        }
        var3.field3272++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1420((byte) 0);
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
        class250[] var18 = new class250[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class250 var102 = var18[var19] = new class250();
            int var103 = var3.method1420((byte) 0);
            if (var103 > 0) {
                var102.field3978 = new byte[var103 * 2];
            }
            int var104 = var3.method1420((byte) 0);
            if (var104 > 0) {
                var102.field3973 = new byte[var104 * 2 + 2];
                var102.field3973[1] = 64;
            }
        }
        int var20 = var3.method1420((byte) 0);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var3.method1420((byte) 0);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field3234[var3.field3272 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method1457((byte) -92);
        }
        var3.field3272++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1420((byte) 0);
            this.field3733[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1420((byte) 0);
            this.field3733[var30] = (short) (this.field3733[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var3.method1445(false);
            }
            this.field3733[var34] = (short) (this.field3733[var34] + class10.method53(var33 - 1 << 14, 32768));
            var31--;
            this.field3737[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3737[var38] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var35) {
                        var37 = -1;
                    } else {
                        var37 = var4[var35++];
                    }
                    var36 = var3.field3234[var7++] - 1;
                }
                this.field3739[var38] = (byte) var36;
                var37--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3737[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field3234[var11++] + 16 << 2;
                    if (var8.length > var41) {
                        var39 = var8[var41++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field3741[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        class250 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3737[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var12.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var12[var45++];
                    }
                }
                this.field3743[var46] = var44;
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
                if (this.field3737[var50] > 0) {
                    var49 = var3.method1420((byte) 0) + 1;
                }
            }
            this.field3740[var50] = (byte) var49;
            var48--;
        }
        this.field3731 = var3.method1420((byte) 0) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class250 var99 = var18[var51];
            if (var99.field3978 != null) {
                for (int var100 = 1; var100 < var99.field3978.length; var100 += 2) {
                    var99.field3978[var100] = var3.method1457((byte) -94);
                }
            }
            if (var99.field3973 != null) {
                for (int var101 = 3; var101 < var99.field3973.length - 2; var101 += 2) {
                    var99.field3973[var101] = var3.method1457((byte) -84);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1457((byte) -72);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1457((byte) -101);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class250 var96 = var18[var54];
            if (var96.field3973 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3973.length; var98 += 2) {
                    var97 = var97 + var3.method1420((byte) 0) + 1;
                    var96.field3973[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class250 var93 = var18[var55];
            if (var93.field3978 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3978.length; var95 += 2) {
                    var94 = var3.method1420((byte) 0) + var94 + 1;
                    var93.field3978[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1420((byte) 0);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1420((byte) 0) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3740[var60] = (byte) (this.field3740[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class74.method473(true, var65, var64 - var58);
                    this.field3740[var67] = (byte) (this.field3740[var67] * var68 + 32 >> 6);
                    var65 += var66 - var59;
                }
                var59 = var66;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3740[var62] = (byte) (this.field3740[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method1420((byte) 0);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method1420((byte) 0) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3741[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3741[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                var74 += 2;
                int var80 = (var79 - var71) / 2 + (var79 - var71) * var72;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class74.method473(true, var80, var79 - var71);
                    var80 += var78 - var72;
                    int var83 = (this.field3741[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3741[var81] = (byte) var83;
                }
                var72 = var78;
                var71 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3741[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3741[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3981 = var3.method1420((byte) 0);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class250 var92 = var18[var86];
            if (var92.field3978 != null) {
                var92.field3975 = var3.method1420((byte) 0);
            }
            if (var92.field3973 != null) {
                var92.field3977 = var3.method1420((byte) 0);
            }
            if (var92.field3981 > 0) {
                var92.field3983 = var3.method1420((byte) 0);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3980 = var3.method1420((byte) 0);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class250 var91 = var18[var88];
            if (var91.field3980 > 0) {
                var91.field3971 = var3.method1420((byte) 0);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class250 var90 = var18[var89];
            if (var90.field3971 > 0) {
                var90.field3976 = var3.method1420((byte) 0);
            }
        }
    }
}
