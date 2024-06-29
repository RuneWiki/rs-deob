import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class106 extends class208 {

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[B")
    public byte[] field1773;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[S")
    public short[] field1770;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[B")
    public byte[] field1768;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[I")
    private int[] field1774;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "[Lig;")
    public class167[] field1771;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "[B")
    public byte[] field1787;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "[Lmi;")
    public class257[] field1784;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lve;")
    public static class255 field1767 = class87.method607(41, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field1769 = 0;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Lve;")
    public static class255 field1778 = class87.method607(29, "Loaded world list data");

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lve;")
    private static class255 field1772 = class87.method607(75, "purple:");

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Lve;")
    public static class255 field1775 = field1772;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "Lve;")
    public static class255 field1781 = field1772;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "[I")
    public static int[] field1782;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "[[[I")
    public static int[][][] field1783;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method818(int arg0, byte arg1) {
        field1785++;
        class149.field2520 = arg0;
        class314.field5334 = -1;
        class314.field5334 = -1;
        if (arg1 >= -71) {
            method818(-2, (byte) -111);
        }
        class301.method2099(112);
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(B)V", line = 45)
    public final void method819(byte arg0) {
        int var2 = 24 / ((-arg0 - 61) / 45);
        this.field1774 = null;
        field1786++;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IB)Le;", line = 57)
    public static final class149 method820(int arg0, byte arg1) {
        class149 var2 = (class149) class144.field2400.method58(0, (long) arg0);
        field1777++;
        if (var2 != null) {
            return var2;
        }
        int var3 = 85 / ((arg1 - 38) / 61);
        byte[] var4 = class67.field996.method636(11, (byte) 68, arg0);
        class149 var5 = new class149();
        if (var4 != null) {
            var5.method1103(new class70(var4), -1);
        }
        class144.field2400.method63(0, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(B)V", line = 88)
    public static void method821(byte arg0) {
        field1775 = null;
        if (arg0 != 6) {
            return;
        }
        field1781 = null;
        field1772 = null;
        field1767 = null;
        field1782 = null;
        field1778 = null;
        field1783 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[BLrj;[I)Z", line = 104)
    public final boolean method822(byte arg0, byte[] arg1, class17 arg2, int[] arg3) {
        field1776++;
        if (arg0 >= -9) {
            method821((byte) -114);
        }
        boolean var5 = true;
        int var6 = 0;
        class257 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field1774[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method87(var9 >> 2, arg3, (byte) -10);
                        } else {
                            var7 = arg2.method88(var9 >> 2, arg3, false);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1784[var8] = var7;
                        this.field1774[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I", line = 163)
    public static final int method823(int arg0, int arg1) {
        field1780++;
        if (arg1 != -1035794329) {
            method823(-37, 106);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 186)
    public class106() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V", line = 191)
    public class106(byte[] arg0) {
        this.field1773 = new byte[128];
        this.field1770 = new short[128];
        this.field1768 = new byte[128];
        this.field1774 = new int[128];
        this.field1771 = new class167[128];
        this.field1787 = new byte[128];
        this.field1784 = new class257[128];
        class70 var2 = new class70(arg0);
        int var3;
        for (var3 = 0; var2.field1066[var2.field1068 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method466((byte) -23);
        }
        int var6 = 0;
        var3++;
        var2.field1068++;
        int var7 = var2.field1068;
        var2.field1068 += var3;
        while (var2.field1066[var2.field1068 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method466((byte) -125);
        }
        var6++;
        int var10 = 0;
        var2.field1068++;
        int var11 = var2.field1068;
        var2.field1068 += var6;
        while (var2.field1066[var2.field1068 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method466((byte) -46);
        }
        var2.field1068++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method481(0);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class167[] var19 = new class167[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class167 var21 = var19[var20] = new class167();
            int var22 = var2.method481(0);
            if (var22 > 0) {
                var21.field2804 = new byte[var22 * 2];
            }
            int var23 = var2.method481(0);
            if (var23 > 0) {
                var21.field2805 = new byte[var23 * 2 + 2];
                var21.field2805[1] = 64;
            }
        }
        int var24 = var2.method481(0);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method481(0);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var2.field1066[var2.field1068 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var2.method466((byte) -69);
        }
        var28++;
        int var31 = 0;
        var2.field1068++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method481(0);
            this.field1770[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method481(0);
            this.field1770[var34] = (short) (this.field1770[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var37 == 0) {
                if (var29.length <= var36) {
                    var37 = -1;
                } else {
                    var37 = var29[var36++];
                }
                var35 = var2.method477(5743);
            }
            var37--;
            this.field1770[var38] = (short) (this.field1770[var38] + class154.method1134(var35 - 1 << 14, 32768));
            this.field1774[var38] = var35;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1774[var42] != 0) {
                if (var39 == 0) {
                    if (var4.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var4[var41++];
                    }
                    var40 = var2.field1066[var7++] - 1;
                }
                this.field1773[var42] = (byte) var40;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1774[var46] != 0) {
                if (var43 == 0) {
                    var44 = var2.field1066[var11++] + 16 << 2;
                    if (var8.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var8[var45++];
                    }
                }
                var43--;
                this.field1768[var46] = (byte) var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class167 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field1774[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                var48--;
                this.field1771[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var53) {
                    var51 = var29[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field1774[var54] > 0) {
                    var52 = var2.method481(0) + 1;
                }
            }
            this.field1787[var54] = (byte) var52;
            var51--;
        }
        this.field1779 = var2.method481(0) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class167 var56 = var19[var55];
            if (var56.field2804 != null) {
                for (int var57 = 1; var57 < var56.field2804.length; var57 += 2) {
                    var56.field2804[var57] = var2.method466((byte) -105);
                }
            }
            if (var56.field2805 != null) {
                for (int var58 = 3; var58 < var56.field2805.length - 2; var58 += 2) {
                    var56.field2805[var58] = var2.method466((byte) -106);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method466((byte) -94);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var2.method466((byte) -82);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class167 var62 = var19[var61];
            if (var62.field2805 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field2805.length; var64 += 2) {
                    var63 = var2.method481(0) + var63 + 1;
                    var62.field2805[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class167 var66 = var19[var65];
            if (var66.field2804 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field2804.length; var68 += 2) {
                    var67 = var2.method481(0) + var67 + 1;
                    var66.field2804[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method481(0);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 -= -var2.method481(0) - 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field1787[var73] = (byte) (this.field1787[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) / 2 + (var75 - var71) * var72;
                byte var77 = var25[var74 + 1];
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class246.method1696(var75 - var71, var76, (byte) 14);
                    var76 += var77 - var72;
                    this.field1787[var78] = (byte) (this.field1787[var78] * var79 + 32 >> 6);
                }
                var72 = var77;
                var71 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field1787[var81] = (byte) (this.field1787[var81] * var72 + 32 >> 6);
            }
        }
        if (var27 != null) {
            int var82 = var2.method481(0);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 += var2.method481(0) + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field1768[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field1768[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) / 2 + (var89 - var84) * var85;
                int var91 = var27[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class246.method1696(var89 - var84, var90, (byte) 14);
                    int var94 = (this.field1768[var92] & 0xFF) + var93;
                    var90 += var91 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field1768[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var91;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field1768[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field1768[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field2811 = var2.method481(0);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class167 var100 = var19[var99];
            if (var100.field2804 != null) {
                var100.field2815 = var2.method481(0);
            }
            if (var100.field2805 != null) {
                var100.field2809 = var2.method481(0);
            }
            if (var100.field2811 > 0) {
                var100.field2812 = var2.method481(0);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field2818 = var2.method481(0);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class167 var103 = var19[var102];
            if (var103.field2818 > 0) {
                var103.field2817 = var2.method481(0);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class167 var105 = var19[var104];
            if (var105.field2817 > 0) {
                var105.field2801 = var2.method481(0);
            }
        }
    }
}
