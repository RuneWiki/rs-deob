import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class105 extends class280 {

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "[Lwe;")
    public class15[] field1527;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[Lhg;")
    public class182[] field1522;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[B")
    public byte[] field1531;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[B")
    public byte[] field1526;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "[S")
    public short[] field1521;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "[B")
    public byte[] field1517;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field1520;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "[I")
    public static int[] field1523 = new int[200];

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Led;")
    public static class187 field1528 = new class187();

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1532 = "Select";

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Z")
    public static boolean field1530 = false;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "I")
    public static int field1535 = -1;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "[[[B")
    public static byte[][][] field1533;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public final void method781(int arg0) {
        if (arg0 > -39) {
            this.method783((byte[]) null, 15, (class242) null, (int[]) null);
        }
        this.field1529 = null;
        field1519++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lsg;")
    public static final class166 method782(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4541; var4++) {
            class166 var5 = var3.field4530[var4];
            if ((var5.field2683 >> 29 & 0x3L) == 2L && var5.field2678 == arg1 && var5.field2684 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BILbg;[I)Z")
    public final boolean method783(byte[] arg0, int arg1, class242 arg2, int[] arg3) {
        field1518++;
        int var5 = 0;
        boolean var6 = true;
        class15 var7 = null;
        for (int var8 = arg1; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1529[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1695(var9 >> 2, arg3, (byte) -102);
                        } else {
                            var7 = arg2.method1693((byte) -25, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1527[var8] = var7;
                        this.field1529[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "(I)V")
    public static void method784(int arg0) {
        field1532 = null;
        if (arg0 != 0) {
            field1523 = null;
        }
        field1523 = null;
        field1528 = null;
        field1533 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method785(int arg0, int arg1) {
        field1525++;
        class201 var2 = class94.method738(-89, arg0, 5);
        if (arg1 != -8145) {
            method784(-123);
        }
        var2.method1475(-743577184);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
    public class105() {
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "([B)V")
    public class105(byte[] arg0) {
        this.field1527 = new class15[128];
        this.field1522 = new class182[128];
        this.field1531 = new byte[128];
        this.field1529 = new int[128];
        this.field1526 = new byte[128];
        int var2 = 0;
        this.field1521 = new short[128];
        this.field1517 = new byte[128];
        class152 var3 = new class152(arg0);
        while (var3.field2523[var3.field2511 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1092((byte) -62);
        }
        var2++;
        var3.field2511++;
        int var6 = var3.field2511;
        int var7 = 0;
        var3.field2511 += var2;
        while (var3.field2523[var3.field2511 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1092((byte) -62);
        }
        var3.field2511++;
        var7++;
        int var10 = var3.field2511;
        int var11 = 0;
        var3.field2511 += var7;
        while (var3.field2523[var3.field2511 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1092((byte) -62);
        }
        var3.field2511++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1111(255);
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
        class182[] var18 = new class182[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class182 var102 = var18[var19] = new class182();
            int var103 = var3.method1111(255);
            if (var103 > 0) {
                var102.field2928 = new byte[var103 * 2];
            }
            int var104 = var3.method1111(255);
            if (var104 > 0) {
                var102.field2927 = new byte[var104 * 2 + 2];
                var102.field2927[1] = 64;
            }
        }
        int var20 = var3.method1111(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var3.method1111(255);
        while (var3.field2523[var3.field2511 + var22] != 0) {
            var22++;
        }
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method1092((byte) -62);
        }
        var3.field2511++;
        int var27 = 0;
        var22++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1111(255);
            this.field1521[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1111(255);
            this.field1521[var30] = (short) (this.field1521[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var33 == 0) {
                if (var25.length <= var31) {
                    var33 = -1;
                } else {
                    var33 = var25[var31++];
                }
                var32 = var3.method1101(-30598);
            }
            this.field1521[var34] = (short) (this.field1521[var34] + (class179.method1337(2, var32 - 1) << 14));
            this.field1529[var34] = var32;
            var33--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1529[var38] != 0) {
                if (var35 == 0) {
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                    var37 = var3.field2523[var6++] - 1;
                }
                var35--;
                this.field1517[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1529[var42] != 0) {
                if (var39 == 0) {
                    var41 = var3.field2523[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                this.field1526[var42] = (byte) var41;
                var39--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class182 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1529[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field1522[var46] = var45;
                var44--;
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
                if (this.field1529[var50] > 0) {
                    var48 = var3.method1111(255) + 1;
                }
            }
            var47--;
            this.field1531[var50] = (byte) var48;
        }
        this.field1520 = var3.method1111(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class182 var99 = var18[var51];
            if (var99.field2928 != null) {
                for (int var100 = 1; var100 < var99.field2928.length; var100 += 2) {
                    var99.field2928[var100] = var3.method1092((byte) -62);
                }
            }
            if (var99.field2927 != null) {
                for (int var101 = 3; var101 < (var99.field2927.length - 2); var101 += 2) {
                    var99.field2927[var101] = var3.method1092((byte) -62);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1092((byte) -62);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1092((byte) -62);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class182 var96 = var18[var54];
            if (var96.field2927 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2927.length; var98 += 2) {
                    var97 += var3.method1111(255) + 1;
                    var96.field2927[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class182 var93 = var18[var55];
            if (var93.field2928 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2928.length; var95 += 2) {
                    var94 = var3.method1111(255) + var94 + 1;
                    var93.field2928[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1111(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method1111(255) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field1531[var60] = (byte) (this.field1531[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var59) * var58 + ((var64 - var59) / 2);
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class46.method348(-65, var64 - var59, var66);
                    var66 += var65 - var58;
                    this.field1531[var67] = (byte) (this.field1531[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var65;
                var59 = var64;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field1531[var62] = (byte) (this.field1531[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var24 != null) {
            int var69 = var3.method1111(255);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 -= -var3.method1111(255) - 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1526[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1526[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var24[var74 + 1] << 1;
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class46.method348(-81, var78 - var71, var79);
                    var79 += var80 - var72;
                    int var83 = (this.field1526[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1526[var81] = (byte) var83;
                }
                var72 = var80;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1526[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1526[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2926 = var3.method1111(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class182 var92 = var18[var86];
            if (var92.field2928 != null) {
                var92.field2932 = var3.method1111(255);
            }
            if (var92.field2927 != null) {
                var92.field2936 = var3.method1111(255);
            }
            if (var92.field2926 > 0) {
                var92.field2935 = var3.method1111(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2931 = var3.method1111(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class182 var91 = var18[var88];
            if (var91.field2931 > 0) {
                var91.field2934 = var3.method1111(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class182 var90 = var18[var89];
            if (var90.field2934 > 0) {
                var90.field2930 = var3.method1111(255);
            }
        }
    }
}
