import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class101 extends class132 {

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "[Lqc;")
    public class171[] field1883;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "[I")
    private int[] field1885;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "[B")
    public byte[] field1884;

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "[Lii;")
    public class95[] field1882;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "[B")
    public byte[] field1887;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[S")
    public short[] field1879;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "[B")
    public byte[] field1878;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public int field1888;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lvd;")
    private static class222 field1873 = class212.method1357("Connecting to update server", 10731);

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Lvd;")
    public static class222 field1886 = field1873;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIIII)V")
    public static final void method623(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1874++;
        int var7 = class22.method209(class129.field2514, arg3, 119, class230.field4322);
        int var8 = class22.method209(class129.field2514, arg2, 88, class230.field4322);
        if (arg1 >= -56) {
            return;
        }
        int var9 = class22.method209(class112.field2107, arg6, 100, class127.field2448);
        int var10 = class22.method209(class112.field2107, arg0, 80, class127.field2448);
        int var11 = class22.method209(class129.field2514, arg3 + arg5, -122, class230.field4322);
        int var12 = class22.method209(class129.field2514, arg2 - arg5, -61, class230.field4322);
        for (int var13 = var7; var13 < var11; var13++) {
            class81.method532(var9, arg4, class156.field2981[var13], var10, -7);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class81.method532(var9, arg4, class156.field2981[var14], var10, -7);
        }
        int var15 = class22.method209(class112.field2107, arg5 + arg6, 90, class127.field2448);
        int var16 = class22.method209(class112.field2107, arg0 - arg5, -86, class127.field2448);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class156.field2981[var17];
            class81.method532(var9, arg4, var18, var15, -7);
            class81.method532(var16, arg4, var18, var10, -7);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3) {
        class121 var4 = class204.field3800[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class201 var5 = var4.field2302;
        if (var5 != null) {
            var5.field3673 = var5.field3673 * arg3 / 16;
            var5.field3666 = var5.field3666 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public final void method625(byte arg0) {
        field1880++;
        if (arg0 < 83) {
            this.field1883 = null;
        }
        this.field1885 = null;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public static final void method626(byte arg0) {
        field1875++;
        int var1 = 108 % ((arg0 - 72) / 43);
        int var2 = (class17.field432.field1360 >> 7) + class151.field2931;
        class91.field1714 = 0;
        int var3 = (class17.field432.field1353 >> 7) + class110.field2064;
        if (var3 >= 3053 && var3 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class91.field1714 = 1;
        }
        if (var3 >= 3072 && var3 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class91.field1714 = 1;
        }
        if (class91.field1714 == 1 && var3 >= 3139 && var3 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class91.field1714 = 0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([ILra;I[B)Z")
    public final boolean method627(int[] arg0, class179 arg1, int arg2, byte[] arg3) {
        field1877++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2 <= 45) {
            return false;
        }
        class171 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field1885[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1124(125, arg0, var9 >> 2);
                        } else {
                            var7 = arg1.method1123(var9 >> 2, arg0, -97);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1883[var8] = var7;
                        this.field1885[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static void method628(int arg0) {
        if (arg0 >= -25) {
            field1873 = null;
        }
        field1873 = null;
        field1886 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lag;II[BIII)V")
    public static final void method629(class8[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg0[var7].field132[arg1 + var12][arg5 + var13] = class139.method876(arg0[var7].field132[arg1 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        field1876++;
        if (arg2 != -1) {
            method623(76, (byte) -46, 79, 84, 4, 2, -118);
        }
        class109 var8 = new class109(arg3);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class14.method124(var8, 0, arg1 + var10, arg5 + var11, -80, arg6, arg4, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lab;Lab;I)V")
    public static final void method630(class3 arg0, class3 arg1, int arg2) {
        if (arg2 <= -88) {
            field1881++;
            class70.field1317 = arg0;
            class112.field2113 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class101() {
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V")
    public class101(byte[] arg0) {
        this.field1883 = new class171[128];
        this.field1885 = new int[128];
        this.field1884 = new byte[128];
        this.field1882 = new class95[128];
        this.field1887 = new byte[128];
        this.field1879 = new short[128];
        this.field1878 = new byte[128];
        class109 var2 = new class109(arg0);
        int var3;
        for (var3 = 0; var2.field2006[var2.field2053 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method661(255);
        }
        var2.field2053++;
        int var6 = var2.field2053;
        int var7 = 0;
        var3++;
        var2.field2053 += var3;
        while (var2.field2006[var2.field2053 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method661(255);
        }
        var2.field2053++;
        var7++;
        int var10 = var2.field2053;
        int var11 = 0;
        var2.field2053 += var7;
        while (var2.field2006[var2.field2053 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method661(255);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var2.field2053++;
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method662((byte) -108);
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
        class95[] var18 = new class95[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class95 var102 = var18[var19] = new class95();
            int var103 = var2.method662((byte) -111);
            if (var103 > 0) {
                var102.field1785 = new byte[var103 * 2];
            }
            int var104 = var2.method662((byte) -125);
            if (var104 > 0) {
                var102.field1786 = new byte[var104 * 2 + 2];
                var102.field1786[1] = 64;
            }
        }
        int var20 = var2.method662((byte) -98);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method662((byte) -123);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field2006[var2.field2053 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method661(255);
        }
        var24++;
        var2.field2053++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method662((byte) -119);
            this.field1879[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method662((byte) -114);
            this.field1879[var30] = (short) (this.field1879[var30] + (var29 << 8));
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
                var33 = var2.method664((byte) -112);
            }
            this.field1879[var34] = (short) (this.field1879[var34] + (class139.method876(var33 - 1, 2) << 14));
            this.field1885[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1885[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field2006[var6++] - 1;
                }
                this.field1887[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1885[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field2006[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field1878[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class95 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1885[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field1882[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length <= var49) {
                    var47 = -1;
                } else {
                    var47 = var25[var49++];
                }
                if (this.field1885[var50] > 0) {
                    var48 = var2.method662((byte) -112) + 1;
                }
            }
            this.field1884[var50] = (byte) var48;
            var47--;
        }
        this.field1888 = var2.method662((byte) -122) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class95 var99 = var18[var51];
            if (var99.field1785 != null) {
                for (int var100 = 1; var100 < var99.field1785.length; var100 += 2) {
                    var99.field1785[var100] = var2.method661(255);
                }
            }
            if (var99.field1786 != null) {
                for (int var101 = 3; var101 < var99.field1786.length - 2; var101 += 2) {
                    var99.field1786[var101] = var2.method661(255);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method661(255);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method661(255);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class95 var96 = var18[var54];
            if (var96.field1786 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1786.length; var98 += 2) {
                    var97 = var2.method662((byte) -105) + var97 + 1;
                    var96.field1786[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class95 var93 = var18[var55];
            if (var93.field1785 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1785.length; var95 += 2) {
                    var94 -= -var2.method662((byte) -83) - 1;
                    var93.field1785[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method662((byte) -121);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method662((byte) -96) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field1884[var60] = (byte) (this.field1884[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var59) * var58 + (var64 - var59) / 2;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class137.method869(var64 - var59, -93, var65);
                    this.field1884[var67] = (byte) (this.field1884[var67] * var68 + 32 >> 6);
                    var65 += var66 - var58;
                }
                var59 = var64;
                var58 = var66;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field1884[var62] = (byte) (this.field1884[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method662((byte) -98);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method662((byte) -128) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1878[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1878[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class137.method869(var78 - var71, -44, var80);
                    var80 += var79 - var72;
                    int var83 = (this.field1878[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1878[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field1878[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1878[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1777 = var2.method662((byte) -83);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class95 var92 = var18[var86];
            if (var92.field1785 != null) {
                var92.field1790 = var2.method662((byte) -90);
            }
            if (var92.field1786 != null) {
                var92.field1778 = var2.method662((byte) -84);
            }
            if (var92.field1777 > 0) {
                var92.field1788 = var2.method662((byte) -107);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1789 = var2.method662((byte) -84);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class95 var91 = var18[var88];
            if (var91.field1789 > 0) {
                var91.field1787 = var2.method662((byte) -118);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class95 var90 = var18[var89];
            if (var90.field1787 > 0) {
                var90.field1784 = var2.method662((byte) -83);
            }
        }
    }
}
