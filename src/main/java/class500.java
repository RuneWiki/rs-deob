import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class500 extends class154 {

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "[B")
    public byte[] field6830;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "[Lqp;")
    public class684[] field6831;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "[B")
    public byte[] field6835;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[Lrea;")
    public class221[] field6836;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "[B")
    public byte[] field6840;

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "[S")
    public short[] field6843;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[I")
    private int[] field6829;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public int field6837;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lfja;")
    public static class783 field6841 = new class783(98, 6);

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field6842 = class750.method4165(255, 1600);

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "Laca;")
    public static class758 field6845 = new class758(8, 1);

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "Z")
    public static boolean field6846 = false;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public static int field6833;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field6834;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field6839;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "Lpt;")
    public static class558 field6844;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "([FII)[F")
    public static final float[] method2863(float[] arg0, int arg1, int arg2) {
        field6833++;
        if (arg2 <= 50) {
            field6846 = true;
        }
        float[] var3 = new float[arg1];
        class275.method1773(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Z")
    public static final boolean method2864(int arg0, int arg1) {
        if (arg0 != 7) {
            field6845 = null;
        }
        field6832++;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
    public static void method2865(boolean arg0) {
        field6844 = null;
        if (!arg0) {
            method2865(false);
        }
        field6845 = null;
        field6841 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
    public static final void method2866(int arg0, int arg1, int arg2) {
        if (arg0 <= 71) {
            method2865(false);
        }
        field6834++;
        class281 var3 = class54.method395((byte) -53, (long) arg2, 14);
        var3.method1821((byte) -40);
        var3.field3910 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public final void method2867(byte arg0) {
        if (arg0 <= 20) {
            method2866(-13, -54, -39);
        }
        field6839++;
        this.field6829 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLea;[B[I)Z")
    public final boolean method2868(byte arg0, class573 arg1, byte[] arg2, int[] arg3) {
        field6838++;
        boolean var5 = true;
        int var6 = 0;
        class221 var7 = null;
        int var8 = 0;
        int var9 = 41 % ((arg0 - 28) / 60);
        while (var8 < 128) {
            if (arg2 == null || arg2[var8] != 0) {
                int var10 = this.field6829[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg1.method3316(var10 >> 2, 16791, arg3);
                        } else {
                            var7 = arg1.method3320(-1, arg3, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6836[var8] = var7;
                        this.field6829[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
    public class500() {
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "([B)V")
    public class500(byte[] arg0) {
        this.field6830 = new byte[128];
        this.field6831 = new class684[128];
        this.field6835 = new byte[128];
        this.field6836 = new class221[128];
        this.field6840 = new byte[128];
        this.field6843 = new short[128];
        this.field6829 = new int[128];
        class93 var2 = new class93(arg0);
        int var3;
        for (var3 = 0; var2.field1413[var2.field1442 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method766((byte) 122);
        }
        var3++;
        var2.field1442++;
        int var6 = var2.field1442;
        var2.field1442 += var3;
        int var7;
        for (var7 = 0; var2.field1413[var2.field1442 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method766((byte) 122);
        }
        var7++;
        var2.field1442++;
        int var10 = var2.field1442;
        var2.field1442 += var7;
        int var11;
        for (var11 = 0; var2.field1413[var2.field1442 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method766((byte) 122);
        }
        var2.field1442++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method793((byte) 111);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class684[] var19 = new class684[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class684 var103 = var19[var20] = new class684();
            int var104 = var2.method793((byte) 82);
            if (var104 > 0) {
                var103.field9525 = new byte[var104 * 2];
            }
            int var105 = var2.method793((byte) 60);
            if (var105 > 0) {
                var103.field9526 = new byte[var105 * 2 + 2];
                var103.field9526[1] = 64;
            }
        }
        int var21 = var2.method793((byte) 75);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method793((byte) 46);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field1413[var2.field1442 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method766((byte) 122);
        }
        var2.field1442++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method793((byte) 6);
            this.field6843[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method793((byte) 110);
            this.field6843[var31] = (short) (this.field6843[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method764(127);
            }
            this.field6843[var35] = (short) (this.field6843[var35] + class204.method1456(32768, var34 - 1 << 14));
            this.field6829[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6829[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                    var38 = var2.field1413[var6++] - 1;
                }
                var36--;
                this.field6840[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6829[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field1413[var10++] + 16 << 2;
                }
                this.field6835[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class684 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6829[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field6831[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field6829[var51] > 0) {
                    var50 = var2.method793((byte) 116) + 1;
                }
            }
            this.field6830[var51] = (byte) var50;
            var49--;
        }
        this.field6837 = var2.method793((byte) 102) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class684 var100 = var19[var52];
            if (var100.field9525 != null) {
                for (int var101 = 1; var101 < var100.field9525.length; var101 += 2) {
                    var100.field9525[var101] = var2.method766((byte) 122);
                }
            }
            if (var100.field9526 != null) {
                for (int var102 = 3; var102 < (var100.field9526.length - 2); var102 += 2) {
                    var100.field9526[var102] = var2.method766((byte) 122);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method766((byte) 122);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method766((byte) 122);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class684 var97 = var19[var55];
            if (var97.field9526 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field9526.length; var99 += 2) {
                    var98 = var2.method793((byte) 119) + var98 + 1;
                    var97.field9526[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class684 var94 = var19[var56];
            if (var94.field9525 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field9525.length; var96 += 2) {
                    var95 = var95 + var2.method793((byte) 119) + 1;
                    var94.field9525[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method793((byte) 62);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method793((byte) 39) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6830[var61] = (byte) (this.field6830[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class16.method91(var67, (byte) -119, var65 - var59);
                    var67 += var66 - var60;
                    this.field6830[var68] = (byte) (this.field6830[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field6830[var64] = (byte) (this.field6830[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method793((byte) 43);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method793((byte) 58) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6835[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6835[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class16.method91(var81, (byte) -119, var79 - var72);
                    int var84 = (this.field6835[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field6835[var82] = (byte) var84;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field6835[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6835[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field9522 = var2.method793((byte) 92);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class684 var93 = var19[var87];
            if (var93.field9525 != null) {
                var93.field9528 = var2.method793((byte) 90);
            }
            if (var93.field9526 != null) {
                var93.field9520 = var2.method793((byte) 81);
            }
            if (var93.field9522 > 0) {
                var93.field9518 = var2.method793((byte) 11);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field9524 = var2.method793((byte) 125);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class684 var92 = var19[var89];
            if (var92.field9524 > 0) {
                var92.field9514 = var2.method793((byte) 77);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class684 var91 = var19[var90];
            if (var91.field9514 > 0) {
                var91.field9521 = var2.method793((byte) 28);
            }
        }
    }
}
