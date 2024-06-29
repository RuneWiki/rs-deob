import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class92 extends class97 {

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[Ljd;")
    public class66[] field2140;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[S")
    public short[] field2146;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "[B")
    public byte[] field2157;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[B")
    public byte[] field2147;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "[Lqe;")
    public class115[] field2162;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[B")
    public byte[] field2156;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
    private int[] field2152;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lwd;")
    public static class150 field2150 = class2.method9(true, "Welt");

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Lwd;")
    private static class150 field2141 = class2.method9(true, "Loaded input handler");

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lwd;")
    public static class150 field2154 = class2.method9(true, "Texturen geladen)3");

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lwd;")
    public static class150 field2143 = field2141;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lwd;")
    public static class150 field2149 = class2.method9(true, "(U5");

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Lwd;")
    private static class150 field2153 = class2.method9(true, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "Lwd;")
    public static class150 field2161 = class2.method9(true, "System)2Update in: ");

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "Lwd;")
    public static class150 field2160 = class2.method9(true, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "Lwd;")
    public static class150 field2155 = field2153;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lwd;")
    public static class150 field2159 = class2.method9(true, "VOLL");

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "Lqd;")
    public static class114 field2145;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Lqd;")
    public static class114 field2158;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILff;I)[Lhb;")
    public static final class51[] method651(int arg0, int arg1, class42 arg2, int arg3) {
        if (arg1 != 1) {
            method652((byte) 22, -118, -11, -51);
        }
        field2139++;
        return class146.method1095(arg2, arg3, (byte) 21, arg0) ? class2.method7(0) : null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIII)V")
    public static final void method652(byte arg0, int arg1, int arg2, int arg3) {
        field2148++;
        if (arg1 < 128 || arg3 < 128 || arg1 > 13056 || arg3 > 13056) {
            class68.field1725 = -1;
            class127.field2937 = -1;
            return;
        }
        int var4 = class25.method205(arg1, class17.field466, -23287, arg3) - arg2;
        int var5 = arg1 - class61.field1591;
        int var6 = arg3 - class46.field1248;
        int var7 = class60.field1523[class97.field2230];
        int var8 = class60.field1515[class95.field2199];
        if (arg0 != -11) {
            method655((byte) -73);
        }
        int var9 = var4 - class130.field3061;
        int var10 = class60.field1523[class95.field2199];
        int var11 = var5 * var8 + var6 * var10 >> 16;
        int var12 = class60.field1515[class97.field2230];
        int var13 = var6 * var8 - var5 * var10 >> 16;
        int var15 = var9 * var12 - var7 * var13 >> 16;
        int var16 = var7 * var9 + var12 * var13 >> 16;
        if (var16 < 50) {
            class127.field2937 = -1;
            class68.field1725 = -1;
        } else {
            class127.field2937 = (var11 << 9) / var16 + 256;
            class68.field1725 = (var15 << 9) / var16 + 167;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([II[BLob;)Z")
    public final boolean method653(int[] arg0, int arg1, byte[] arg2, class99 arg3) {
        boolean var5 = true;
        field2151++;
        class115 var6 = null;
        int var7 = 0;
        if (arg1 > -68) {
            return true;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2152[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg3.method684((byte) 104, arg0, var9 >> 2);
                        } else {
                            var6 = arg3.method685(0, arg0, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field2162[var8] = var6;
                        this.field2152[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public final void method654(int arg0) {
        this.field2152 = null;
        field2164++;
        if (arg0 != 1) {
            this.field2157 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
    public static void method655(byte arg0) {
        field2159 = null;
        field2153 = null;
        field2158 = null;
        field2145 = null;
        field2154 = null;
        field2141 = null;
        field2149 = null;
        field2155 = null;
        field2150 = null;
        field2143 = null;
        int var1 = -84 / ((arg0 + 64) / 57);
        field2160 = null;
        field2161 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class92() {
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
    public class92(byte[] arg0) {
        this.field2140 = new class66[128];
        this.field2146 = new short[128];
        int var2 = 0;
        this.field2157 = new byte[128];
        this.field2147 = new byte[128];
        this.field2162 = new class115[128];
        this.field2156 = new byte[128];
        this.field2152 = new int[128];
        class148 var3 = new class148(arg0);
        while (var3.field3592[var3.field3601 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1124(8);
        }
        var3.field3601++;
        int var6 = var3.field3601;
        var2++;
        var3.field3601 += var2;
        int var7;
        for (var7 = 0; var3.field3592[var3.field3601 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1124(8);
        }
        var7++;
        int var10 = 0;
        var3.field3601++;
        int var11 = var3.field3601;
        var3.field3601 += var7;
        while (var3.field3592[var3.field3601 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1124(8);
        }
        var3.field3601++;
        var10++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1137(255);
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
        class66[] var18 = new class66[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class66 var102 = var18[var19] = new class66();
            int var103 = var3.method1137(255);
            if (var103 > 0) {
                var102.field1678 = new byte[var103 * 2];
            }
            int var104 = var3.method1137(255);
            if (var104 > 0) {
                var102.field1694 = new byte[var104 * 2 + 2];
                var102.field1694[1] = 64;
            }
        }
        int var20 = var3.method1137(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var3.method1137(255);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var3.field3592[var3.field3601 + var22] != 0) {
            var22++;
        }
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method1124(8);
        }
        var3.field3601++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1137(255);
            this.field2146[var28] = (short) var27;
        }
        var22++;
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1137(255);
            this.field2146[var30] = (short) (this.field2146[var30] + (var29 << 8));
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
                var33 = var3.method1118(0);
            }
            var31--;
            this.field2146[var34] = (short) (this.field2146[var34] + class94.method667(32768, var33 - 1 << 14));
            this.field2152[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2152[var38] != 0) {
                if (var35 == 0) {
                    var37 = var3.field3592[var6++] - 1;
                    if (var4.length > var36) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                }
                var35--;
                this.field2157[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2152[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field3592[var11++] + 16 << 2;
                }
                this.field2147[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class66 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2152[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field2140[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var49) {
                    var47 = var25[var49++];
                } else {
                    var47 = -1;
                }
                if (this.field2152[var50] > 0) {
                    var48 = var3.method1137(255) + 1;
                }
            }
            this.field2156[var50] = (byte) var48;
            var47--;
        }
        this.field2163 = var3.method1137(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class66 var99 = var18[var51];
            if (var99.field1678 != null) {
                for (int var100 = 1; var100 < var99.field1678.length; var100 += 2) {
                    var99.field1678[var100] = var3.method1124(8);
                }
            }
            if (var99.field1694 != null) {
                for (int var101 = 3; var101 < var99.field1694.length - 2; var101 += 2) {
                    var99.field1694[var101] = var3.method1124(8);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1124(8);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1124(8);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class66 var96 = var18[var54];
            if (var96.field1694 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1694.length; var98 += 2) {
                    var97 = var3.method1137(255) + var97 + 1;
                    var96.field1694[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class66 var93 = var18[var55];
            if (var93.field1678 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1678.length; var95 += 2) {
                    var94 = var3.method1137(255) + var94 + 1;
                    var93.field1678[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1137(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var3.method1137(255) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field2156[var60] = (byte) (this.field2156[var60] * var58 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) / 2 + (var64 - var59) * var58;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class135.method1010(var66, var64 - var59, (byte) -20);
                    var66 += var65 - var58;
                    this.field2156[var67] = (byte) (this.field2156[var67] * var68 + 32 >> 6);
                }
                var59 = var64;
                var58 = var65;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2156[var63] = (byte) (this.field2156[var63] * var58 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1137(255);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var3.method1137(255) + var69 + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2147[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2147[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                byte var78 = var24[var74];
                int var79 = (var78 - var71) * var72 + (var78 - var71) / 2;
                int var80 = var24[var74 + 1] << 1;
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class135.method1010(var79, var78 - var71, (byte) -20);
                    int var83 = (this.field2147[var81] & 0xFF) + var82;
                    var79 += var80 - var72;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2147[var81] = (byte) var83;
                }
                var72 = var80;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field2147[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2147[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1669 = var3.method1137(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class66 var92 = var18[var86];
            if (var92.field1678 != null) {
                var92.field1693 = var3.method1137(255);
            }
            if (var92.field1694 != null) {
                var92.field1666 = var3.method1137(255);
            }
            if (var92.field1669 > 0) {
                var92.field1695 = var3.method1137(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1665 = var3.method1137(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class66 var91 = var18[var88];
            if (var91.field1665 > 0) {
                var91.field1680 = var3.method1137(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class66 var90 = var18[var89];
            if (var90.field1680 > 0) {
                var90.field1668 = var3.method1137(255);
            }
        }
    }
}
