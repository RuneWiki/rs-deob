import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class134 extends class145 {

    @OriginalMember(owner = "client!td", name = "y", descriptor = "[Lla;")
    public class77[] field3369;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[I")
    private int[] field3368;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "[S")
    public short[] field3376;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "[B")
    public byte[] field3387;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[B")
    public byte[] field3388;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "[B")
    public byte[] field3382;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[Lpa;")
    public class105[] field3372;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!td", name = "E", descriptor = "Lfc;")
    public static class39 field3375 = class90.method774("Startseite auf (WSpielkonto wiederherstellen(W)3", -92);

    @OriginalMember(owner = "client!td", name = "K", descriptor = "Lfc;")
    public static class39 field3381 = class90.method774("<col=ffb000>", -110);

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static volatile int field3384 = 0;

    @OriginalMember(owner = "client!td", name = "H", descriptor = "I")
    public static int field3378 = 0;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static volatile int field3390 = 0;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lfc;Lfc;Lfc;I)V", line = 5)
    public static final void method1088(class39 arg0, class39 arg1, class39 arg2, int arg3) {
        class93.field2182 = arg1;
        class93.field2186 = arg2;
        class93.field2187 = arg0;
        field3373++;
        if (arg3 != 0) {
            field3381 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 28)
    public static void method1089(int arg0) {
        int var1 = 97 % ((-arg0 - 6) / 44);
        field3381 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lcc;", line = 38)
    public static final class18 method1090(int arg0, byte arg1) {
        if (arg1 < 41) {
            method1090(-33, (byte) 44);
        }
        field3386++;
        class18 var2 = (class18) class77.field1764.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field3267.method839(5, 1, arg0);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method215(new class25(var3), arg0, -3288);
        }
        var4.method222(95);
        class77.field1764.method934(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 72)
    public static final int method1091(int arg0, int arg1, int arg2) {
        field3380++;
        int var3 = arg1;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 113)
    public static final void method1092(byte arg0) {
        field3377++;
        int var1 = -123 % ((arg0 + 32) / 60);
        for (int var2 = 0; var2 < class68.field1626; var2++) {
            int var3 = class98.field2328[var2];
            class121 var4 = class118.field3092[var3];
            int var5 = class39.field1065.method322((byte) -50);
            if ((var5 & 0x40) != 0) {
                var4.field3163 = class153.method1222(0, class39.field1065.method301(-4853));
                var4.field2907 = var4.field3163.field2240;
                var4.field2858 = var4.field3163.field2254;
                var4.field2873 = var4.field3163.field2271;
                var4.field2918 = var4.field3163.field2279;
                var4.field2920 = var4.field3163.field2229;
                var4.field2861 = var4.field3163.field2286;
                var4.field2896 = var4.field3163.field2231;
                var4.field2917 = var4.field3163.field2291;
                var4.field2893 = var4.field3163.field2244;
            }
            if ((var5 & 0x8) != 0) {
                var4.field2891 = class39.field1065.method292(-128);
                int var6 = class39.field1065.method313((byte) -127);
                var4.field2860 = 0;
                var4.field2866 = 0;
                if (var4.field2891 == 65535) {
                    var4.field2891 = -1;
                }
                var4.field2883 = (var6 & 0xFFFF) + class70.field1654;
                if (class70.field1654 < var4.field2883) {
                    var4.field2866 = -1;
                }
                var4.field2902 = var6 >> 16;
            }
            if ((var5 & 0x20) != 0) {
                var4.field2925 = class39.field1065.method304(-127);
                var4.field2856 = 100;
            }
            if ((var5 & 0x1) != 0) {
                int var7 = class39.field1065.method320(false);
                if (var7 == 65535) {
                    var7 = -1;
                }
                int var8 = class39.field1065.method280(1630016912);
                if (var4.field2888 == var7 && var7 != -1) {
                    int var9 = class38.method430(2238, var7).field3028;
                    if (var9 == 1) {
                        var4.field2864 = 0;
                        var4.field2886 = 0;
                        var4.field2885 = 0;
                        var4.field2911 = var8;
                    }
                    if (var9 == 2) {
                        var4.field2864 = 0;
                    }
                } else if (var7 == -1 || var4.field2888 == -1 || class38.method430(2238, var7).field3056 >= class38.method430(2238, var4.field2888).field3056) {
                    var4.field2885 = 0;
                    var4.field2884 = var4.field2927;
                    var4.field2888 = var7;
                    var4.field2886 = 0;
                    var4.field2864 = 0;
                    var4.field2911 = var8;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field2898 = class39.field1065.method327((byte) 67);
                if (var4.field2898 == 65535) {
                    var4.field2898 = -1;
                }
            }
            if ((var5 & 0x80) != 0) {
                int var10 = class39.field1065.method321((byte) 84);
                int var11 = class39.field1065.method322((byte) -50);
                var4.method980(class70.field1654, var11, true, var10);
                var4.field2876 = class70.field1654 + 300;
                var4.field2859 = class39.field1065.method321((byte) 75);
                var4.field2857 = class39.field1065.method322((byte) -50);
            }
            if ((var5 & 0x4) != 0) {
                int var12 = class39.field1065.method298(-15432);
                int var13 = class39.field1065.method321((byte) 107);
                var4.method980(class70.field1654, var13, true, var12);
                var4.field2876 = class70.field1654 + 300;
                var4.field2859 = class39.field1065.method322((byte) -50);
                var4.field2857 = class39.field1065.method321((byte) 30);
            }
            if ((var5 & 0x2) != 0) {
                var4.field2889 = class39.field1065.method327((byte) 67);
                var4.field2890 = class39.field1065.method301(-4853);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V", line = 280)
    public final void method1093(int arg0) {
        if (arg0 != 9420) {
            method1089(92);
        }
        this.field3368 = null;
        field3371++;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 296)
    public class134() {
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([ILdd;[BI)Z", line = 314)
    public final boolean method1094(int[] arg0, class26 arg1, byte[] arg2, int arg3) {
        field3374++;
        int var5 = 0;
        boolean var6 = true;
        class105 var7 = null;
        int var8 = -38 % ((arg3 + 40) / 61);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg2 == null || arg2[var9] != 0) {
                int var10 = this.field3368[var9];
                if (var10 != 0) {
                    if (var5 != var10) {
                        var5 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method340(var10 >> 2, 1, arg0);
                        } else {
                            var7 = arg1.method334(arg0, -1685, var10 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3372[var9] = var7;
                        this.field3368[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V", line = 375)
    public class134(byte[] arg0) {
        this.field3369 = new class77[128];
        this.field3368 = new int[128];
        this.field3376 = new short[128];
        this.field3387 = new byte[128];
        this.field3388 = new byte[128];
        this.field3382 = new byte[128];
        this.field3372 = new class105[128];
        int var2 = 0;
        class25 var3 = new class25(arg0);
        while (var3.field711[var3.field710 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method293(-121);
        }
        var3.field710++;
        var2++;
        int var6 = var3.field710;
        var3.field710 += var2;
        int var7;
        for (var7 = 0; var3.field711[var3.field710 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method293(-125);
        }
        var3.field710++;
        int var10 = var3.field710;
        var7++;
        var3.field710 += var7;
        int var11;
        for (var11 = 0; var3.field711[var3.field710 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method293(-128);
        }
        var11++;
        var3.field710++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method322((byte) -50);
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
        class77[] var18 = new class77[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class77 var102 = var18[var19] = new class77();
            int var103 = var3.method322((byte) -50);
            if (var103 > 0) {
                var102.field1757 = new byte[var103 * 2];
            }
            int var104 = var3.method322((byte) -50);
            if (var104 > 0) {
                var102.field1763 = new byte[var104 * 2 + 2];
                var102.field1763[1] = 64;
            }
        }
        int var20 = var3.method322((byte) -50);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method322((byte) -50);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field711[var3.field710 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method293(-126);
        }
        var3.field710++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method322((byte) -50);
            this.field3376[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method322((byte) -50);
            this.field3376[var30] = (short) (this.field3376[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var33) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var3.method294((byte) 71);
            }
            this.field3376[var34] = (short) (this.field3376[var34] + class87.method747(32768, var32 - 1 << 14));
            var31--;
            this.field3368[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3368[var38] != 0) {
                if (var35 == 0) {
                    var36 = var3.field711[var6++] - 1;
                    if (var37 < var4.length) {
                        var35 = var4[var37++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field3382[var38] = (byte) var36;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3368[var42] != 0) {
                if (var40 == 0) {
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var3.field711[var10++] + 16 << 2;
                }
                var40--;
                this.field3387[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class77 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3368[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field3369[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var49 >= var25.length) {
                    var47 = -1;
                } else {
                    var47 = var25[var49++];
                }
                if (this.field3368[var50] > 0) {
                    var48 = var3.method322((byte) -50) + 1;
                }
            }
            var47--;
            this.field3388[var50] = (byte) var48;
        }
        this.field3383 = var3.method322((byte) -50) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class77 var99 = var18[var51];
            if (var99.field1757 != null) {
                for (int var100 = 1; var100 < var99.field1757.length; var100 += 2) {
                    var99.field1757[var100] = var3.method293(-127);
                }
            }
            if (var99.field1763 != null) {
                for (int var101 = 3; var101 < var99.field1763.length - 2; var101 += 2) {
                    var99.field1763[var101] = var3.method293(-114);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method293(-113);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method293(-108);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class77 var96 = var18[var54];
            if (var96.field1763 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1763.length; var98 += 2) {
                    var97 = var97 + var3.method322((byte) -50) + 1;
                    var96.field1763[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class77 var93 = var18[var55];
            if (var93.field1757 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1757.length; var95 += 2) {
                    var94 = var94 + var3.method322((byte) -50) + 1;
                    var93.field1757[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method322((byte) -50);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method322((byte) -50) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3388[var60] = (byte) (this.field3388[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) / 2 + (var64 - var58) * var59;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class87.method743(var64 - var58, var65, 5960);
                    this.field3388[var67] = (byte) (this.field3388[var67] * var68 + 32 >> 6);
                    var65 += var66 - var59;
                }
                var59 = var66;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field3388[var62] = (byte) (this.field3388[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method322((byte) -50);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var3.method322((byte) -50) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3387[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3387[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var23[var74 + 1] << 1;
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class87.method743(var78 - var71, var79, 5960);
                    var79 += var80 - var72;
                    int var83 = (this.field3387[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3387[var81] = (byte) var83;
                }
                var72 = var80;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3387[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3387[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1756 = var3.method322((byte) -50);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class77 var92 = var18[var86];
            if (var92.field1757 != null) {
                var92.field1749 = var3.method322((byte) -50);
            }
            if (var92.field1763 != null) {
                var92.field1761 = var3.method322((byte) -50);
            }
            if (var92.field1756 > 0) {
                var92.field1758 = var3.method322((byte) -50);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1759 = var3.method322((byte) -50);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class77 var91 = var18[var88];
            if (var91.field1759 > 0) {
                var91.field1748 = var3.method322((byte) -50);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class77 var90 = var18[var89];
            if (var90.field1748 > 0) {
                var90.field1747 = var3.method322((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBI)Z", line = 1014)
    public static final boolean method1095(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 >> 14 & 0x7FFF;
        if (arg2 != 61) {
            return false;
        }
        int var5 = class139.field3503.method43(class24.field661, arg0, arg1, arg3);
        field3385++;
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class35 var8 = class90.method776(var4, -122);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field930;
                var9 = var8.field912;
            } else {
                var9 = var8.field930;
                var10 = var8.field912;
            }
            int var11 = var8.field926;
            if (var7 != 0) {
                var11 = (var11 << var7 & 0xF) + (var11 >> 4 - var7);
            }
            class93.method790(true, -1, 0, 2, var10, var11, arg1, class94.field2197.field2926[0], 0, var9, class94.field2197.field2913[0], arg0);
        } else {
            class93.method790(true, -1, var7, 2, 0, 0, arg1, class94.field2197.field2926[0], var6 + 1, 0, class94.field2197.field2913[0], arg0);
        }
        class76.field1738 = class26.field758;
        class12.field327 = class34.field889;
        class10.field291 = 0;
        class126.field3195 = 2;
        return true;
    }
}
