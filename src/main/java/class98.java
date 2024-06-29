import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class98 extends class12 {

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "[B")
    public byte[] field1736;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "[B")
    public byte[] field1734;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "[S")
    public short[] field1735;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "[I")
    private int[] field1726;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "[Lqe;")
    public class158[] field1733;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "[B")
    public byte[] field1730;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "[Lfi;")
    public class222[] field1731;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field1722;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lvf;")
    private static class265 field1723 = class87.method582(-46, "Connecting to update server");

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1725 = -1;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lvf;")
    public static class265 field1721 = field1723;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lvf;")
    public static class265 field1741 = class87.method582(-46, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lvf;")
    public static class265 field1727 = class87.method582(-46, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Lvf;")
    public static class265 field1738 = class87.method582(-46, "mapdots");

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1737 = 0;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "[I")
    public static int[] field1739 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lwi;")
    public static final class223 method650(int arg0, int arg1) {
        if (arg1 >= -117) {
            field1723 = null;
        }
        field1740++;
        class223 var2 = (class223) class123.field2213.method1424((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field4273.method1332(true, arg0, 11);
        class223 var4 = new class223();
        if (var3 != null) {
            var4.method1514(new class135(var3), (byte) 127);
        }
        class123.field2213.method1419(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)I")
    public static final int method651(int arg0, byte arg1) {
        int var8 = arg0 - 1;
        field1729++;
        int var2 = var8 | var8 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = -82 % ((-arg1 - 42) / 52);
        int var5 = var3 | var3 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return var7 + 1;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public final void method652(byte arg0) {
        field1724++;
        this.field1726 = null;
        if (arg0 >= -25) {
            this.field1735 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public static void method653(int arg0) {
        field1723 = null;
        field1721 = null;
        if (arg0 == 2) {
            field1738 = null;
            field1727 = null;
            field1739 = null;
            field1741 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Lbl;")
    public static final class268 method654(int arg0, int arg1) {
        field1728++;
        if (arg1 != -1) {
            method650(-112, 50);
        }
        class268 var2 = (class268) class181.field3214.method1887(120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class143.field2671.method1332(true, class232.method1567(true, arg0), class23.method222(arg0, false));
        class268 var4 = new class268();
        var4.field4754 = arg0;
        if (var3 != null) {
            var4.method1836((byte) 109, new class135(var3));
        }
        var4.method1829(2552);
        class181.field3214.method1892(var4, (long) arg0, (byte) -24);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lmd;[I[BI)Z")
    public final boolean method655(class214 arg0, int[] arg1, byte[] arg2, int arg3) {
        boolean var5 = true;
        int var6 = 0;
        field1720++;
        class222 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field1726[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1455(15000, var9 >> 2, arg1);
                        } else {
                            var7 = arg0.method1460(arg1, var9 >> 2, (byte) -122);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1731[var8] = var7;
                        this.field1726[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class98() {
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "([B)V")
    public class98(byte[] arg0) {
        this.field1736 = new byte[128];
        this.field1734 = new byte[128];
        this.field1735 = new short[128];
        this.field1726 = new int[128];
        this.field1733 = new class158[128];
        this.field1730 = new byte[128];
        this.field1731 = new class222[128];
        int var2 = 0;
        class135 var3 = new class135(arg0);
        while (var3.field2483[var3.field2449 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method929((byte) -3);
        }
        var2++;
        var3.field2449++;
        int var6 = var3.field2449;
        var3.field2449 += var2;
        int var7;
        for (var7 = 0; var3.field2483[var3.field2449 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method929((byte) -3);
        }
        var7++;
        int var10 = 0;
        var3.field2449++;
        int var11 = var3.field2449;
        var3.field2449 += var7;
        while (var3.field2483[var3.field2449 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method929((byte) -3);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field2449++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method920((byte) 35);
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
        class158[] var18 = new class158[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class158 var102 = var18[var19] = new class158();
            int var103 = var3.method920((byte) 75);
            if (var103 > 0) {
                var102.field2910 = new byte[var103 * 2];
            }
            int var104 = var3.method920((byte) 46);
            if (var104 > 0) {
                var102.field2904 = new byte[var104 * 2 + 2];
                var102.field2904[1] = 64;
            }
        }
        int var20 = var3.method920((byte) 34);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var3.method920((byte) 90);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field2483[var3.field2449 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method929((byte) -3);
        }
        var24++;
        var3.field2449++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method920((byte) 84);
            this.field1735[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method920((byte) 43);
            this.field1735[var30] = (short) (this.field1735[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var32 == 0) {
                if (var25.length <= var31) {
                    var32 = -1;
                } else {
                    var32 = var25[var31++];
                }
                var33 = var3.method948(-76);
            }
            var32--;
            this.field1735[var34] = (short) (this.field1735[var34] + class203.method1395(var33 - 1 << 14, 32768));
            this.field1726[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1726[var38] != 0) {
                if (var35 == 0) {
                    var37 = var3.field2483[var6++] - 1;
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                this.field1734[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1726[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field2483[var11++] + 16 << 2;
                    if (var8.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var8[var41++];
                    }
                }
                var39--;
                this.field1736[var42] = (byte) var40;
            }
        }
        class158 var43 = null;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1726[var46] != 0) {
                if (var44 == 0) {
                    var43 = var18[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field1733[var46] = var43;
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
                if (this.field1726[var50] > 0) {
                    var49 = var3.method920((byte) 58) + 1;
                }
            }
            this.field1730[var50] = (byte) var49;
            var47--;
        }
        this.field1722 = var3.method920((byte) 74) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class158 var99 = var18[var51];
            if (var99.field2910 != null) {
                for (int var100 = 1; var100 < var99.field2910.length; var100 += 2) {
                    var99.field2910[var100] = var3.method929((byte) -3);
                }
            }
            if (var99.field2904 != null) {
                for (int var101 = 3; var101 < (var99.field2904.length - 2); var101 += 2) {
                    var99.field2904[var101] = var3.method929((byte) -3);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method929((byte) -3);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method929((byte) -3);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class158 var96 = var18[var54];
            if (var96.field2904 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2904.length; var98 += 2) {
                    var97 += var3.method920((byte) 28) + 1;
                    var96.field2904[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class158 var93 = var18[var55];
            if (var93.field2910 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2910.length; var95 += 2) {
                    var94 = var94 + var3.method920((byte) 65) + 1;
                    var93.field2910[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method920((byte) 88);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method920((byte) 107) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1730[var60] = (byte) (this.field1730[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class269.method1852(var64 - var58, (byte) 72, var66);
                    this.field1730[var67] = (byte) (this.field1730[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field1730[var62] = (byte) (this.field1730[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method920((byte) 63);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 -= -var3.method920((byte) 46) - 1;
                var23[var70] = (byte) var69;
            }
            int var71 = var23[1] << 1;
            byte var72 = var23[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field1736[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1736[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var72) / 2 + (var78 - var72) * var71;
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class269.method1852(var78 - var72, (byte) 72, var80);
                    var80 += var79 - var71;
                    int var83 = (this.field1736[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1736[var81] = (byte) var83;
                }
                var71 = var79;
                var72 = var78;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field1736[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1736[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2907 = var3.method920((byte) 62);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class158 var92 = var18[var86];
            if (var92.field2910 != null) {
                var92.field2902 = var3.method920((byte) 42);
            }
            if (var92.field2904 != null) {
                var92.field2899 = var3.method920((byte) 53);
            }
            if (var92.field2907 > 0) {
                var92.field2897 = var3.method920((byte) 100);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2905 = var3.method920((byte) 48);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class158 var91 = var18[var88];
            if (var91.field2905 > 0) {
                var91.field2900 = var3.method920((byte) 83);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class158 var90 = var18[var89];
            if (var90.field2900 > 0) {
                var90.field2903 = var3.method920((byte) 47);
            }
        }
    }
}
