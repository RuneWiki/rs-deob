import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class174 extends class43 {

    @OriginalMember(owner = "client!so", name = "l", descriptor = "[Lve;")
    public class159[] field2008;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "[I")
    private int[] field2011;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "[S")
    public short[] field2019;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "[B")
    public byte[] field2022;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "[B")
    public byte[] field2016;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "[Lqq;")
    public class422[] field2021;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "[B")
    public byte[] field2009;

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public int field2015;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public static int field2017 = 0;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!so", name = "x", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "Lan;")
    public static class160 field2013;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "[Z")
    public static boolean[] field2007;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        field2014++;
        for (int var1 = -1; var1 < class450.field6291; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class304.field4083[var1];
            }
            class131 var6 = class212.field2584[var5];
            if (var6 != null && var6.field2463 > 0) {
                var6.field2463--;
                if (var6.field2463 == 0) {
                    var6.field2418 = null;
                }
            }
        }
        for (int var2 = arg0; var2 < class106.field1263; var2++) {
            int var3 = class437.field5984[var2];
            class298 var4 = class220.field2726[var3];
            if (var4 != null && var4.field2463 > 0) {
                var4.field2463--;
                if (var4.field2463 == 0) {
                    var4.field2418 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
    public final void method1094(boolean arg0) {
        this.field2011 = null;
        field2012++;
        if (!arg0) {
            field2017 = 7;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)I")
    public static final int method1095(int arg0, int arg1) {
        if (arg0 != 128) {
            method1096(40, (Random) null, 86);
        }
        field2010++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method1096(int arg0, Random arg1, int arg2) {
        field2020++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class113.method662(true, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg0 != -20548) {
                return 118;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class288.method1840(arg2, -1, var4);
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public static void method1097(byte arg0) {
        field2007 = null;
        if (arg0 != -69) {
            method1095(-95, -104);
        }
        field2013 = null;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class174() {
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "([B)V")
    public class174(byte[] arg0) {
        this.field2008 = new class159[128];
        this.field2011 = new int[128];
        this.field2019 = new short[128];
        this.field2022 = new byte[128];
        this.field2016 = new byte[128];
        this.field2021 = new class422[128];
        this.field2009 = new byte[128];
        class242 var2 = new class242(arg0);
        int var3;
        for (var3 = 0; var2.field3188[var2.field3211 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1589(false);
        }
        var2.field3211++;
        var3++;
        int var6 = var2.field3211;
        var2.field3211 += var3;
        int var7;
        for (var7 = 0; var2.field3188[var2.field3211 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1589(false);
        }
        var7++;
        var2.field3211++;
        int var10 = var2.field3211;
        var2.field3211 += var7;
        int var11;
        for (var11 = 0; var2.field3188[var2.field3211 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1589(false);
        }
        var2.field3211++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1563(-128);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var15 >= var18) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class422[] var19 = new class422[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class422 var103 = var19[var20] = new class422();
            int var104 = var2.method1563(-128);
            if (var104 > 0) {
                var103.field5786 = new byte[var104 * 2];
            }
            int var105 = var2.method1563(-128);
            if (var105 > 0) {
                var103.field5782 = new byte[var105 * 2 + 2];
                var103.field5782[1] = 64;
            }
        }
        int var21 = var2.method1563(-128);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1563(-128);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3188[var2.field3211 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1589(false);
        }
        var2.field3211++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1563(-128);
            this.field2019[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1563(-128);
            this.field2019[var31] = (short) (this.field2019[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method1566((byte) -102);
            }
            this.field2019[var35] = (short) (this.field2019[var35] + (class191.method1183(var34 - 1, 2) << 14));
            this.field2011[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2011[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field3188[var6++] - 1;
                }
                var36--;
                this.field2022[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2011[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var2.field3188[var10++] + 16 << 2;
                }
                this.field2016[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class422 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2011[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field2021[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var49 >= var26.length) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field2011[var51] > 0) {
                    var50 = var2.method1563(-128) + 1;
                }
            }
            this.field2009[var51] = (byte) var50;
            var48--;
        }
        this.field2015 = var2.method1563(-128) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class422 var100 = var19[var52];
            if (var100.field5786 != null) {
                for (int var101 = 1; var101 < var100.field5786.length; var101 += 2) {
                    var100.field5786[var101] = var2.method1589(false);
                }
            }
            if (var100.field5782 != null) {
                for (int var102 = 3; var102 < var100.field5782.length - 2; var102 += 2) {
                    var100.field5782[var102] = var2.method1589(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1589(false);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1589(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class422 var97 = var19[var55];
            if (var97.field5782 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5782.length; var99 += 2) {
                    var98 = var98 + var2.method1563(-128) + 1;
                    var97.field5782[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class422 var94 = var19[var56];
            if (var94.field5786 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5786.length; var96 += 2) {
                    var95 += var2.method1563(-128) + 1;
                    var94.field5786[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1563(-128);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1563(-128) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2009[var61] = (byte) (this.field2009[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class133.method865(var65 - var59, var67, (byte) -30);
                    var67 += var66 - var60;
                    this.field2009[var68] = (byte) (this.field2009[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2009[var63] = (byte) (this.field2009[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1563(-128);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method1563(-128) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2016[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2016[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class133.method865(var79 - var72, var81, (byte) -25);
                    int var84 = (this.field2016[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2016[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2016[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2016[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field5788 = var2.method1563(-128);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class422 var93 = var19[var87];
            if (var93.field5786 != null) {
                var93.field5787 = var2.method1563(-128);
            }
            if (var93.field5782 != null) {
                var93.field5791 = var2.method1563(-128);
            }
            if (var93.field5788 > 0) {
                var93.field5783 = var2.method1563(-128);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field5780 = var2.method1563(-128);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class422 var92 = var19[var89];
            if (var92.field5780 > 0) {
                var92.field5784 = var2.method1563(-128);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class422 var91 = var19[var90];
            if (var91.field5784 > 0) {
                var91.field5792 = var2.method1563(-128);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "([IB[BLjm;)Z")
    public final boolean method1098(int[] arg0, byte arg1, byte[] arg2, class184 arg3) {
        int var5 = -56 % ((-arg1 - 6) / 62);
        field2018++;
        boolean var6 = true;
        int var7 = 0;
        class159 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg2 == null || arg2[var9] != 0) {
                int var10 = this.field2011[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg3.method1149(arg0, -128, var10 >> 2);
                        } else {
                            var8 = arg3.method1145(6744, var10 >> 2, arg0);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field2008[var9] = var8;
                        this.field2011[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }
}
