import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class189 extends class132 {

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[S")
    public short[] field3667;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "[I")
    private int[] field3662;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "[B")
    public byte[] field3669;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "[B")
    public byte[] field3676;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "[Ldc;")
    public class33[] field3661;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[B")
    public byte[] field3671;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "[Lw;")
    public class204[] field3674;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Ltg;")
    public static class184 field3654 = class135.method812("ams", 3);

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "[I")
    public static int[] field3663 = new int[50];

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Ltg;")
    private static class184 field3652 = class135.method812("Error connecting to server)3", 3);

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "Ltg;")
    private static class184 field3678 = class135.method812("Your ignore list is full)3 Max of 100 users)3", 3);

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field3673 = 3353893;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Ltg;")
    public static class184 field3675 = field3678;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Ltg;")
    public static class184 field3677 = field3652;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Ltg;")
    private static class184 field3665 = class135.method812("FULL", 3);

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Ltg;")
    public static class184 field3670 = field3665;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lsc;")
    public static class171[] field3653;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "[[[I")
    public static int[][][] field3679;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILvb;)V")
    public static final void method1197(int arg0, class197 arg1) {
        class206.field3959 = arg1;
        int var2 = -112 % ((arg0 - 25) / 45);
        field3658++;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
    public final void method1198(boolean arg0) {
        field3659++;
        if (arg0) {
            this.field3662 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZI)Lrh;")
    public static final class167 method1199(int arg0, boolean arg1, int arg2) {
        field3660++;
        if (!arg1) {
            return null;
        }
        class167 var3 = class44.method255(arg0, 10583);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3097 == null || arg2 >= var3.field3097.length) {
            return null;
        } else {
            return var3.field3097[arg2];
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILag;[I[B)Z")
    public final boolean method1200(int arg0, class8 arg1, int[] arg2, byte[] arg3) {
        field3668++;
        boolean var5 = true;
        class33 var6 = null;
        if (arg0 > -46) {
            method1201(45);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3662[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method43((byte) 97, arg2, var9 >> 2);
                        } else {
                            var6 = arg1.method48(arg2, var9 >> 2, -2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field3661[var8] = var6;
                        this.field3662[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field3679 = null;
        field3654 = null;
        field3653 = null;
        field3675 = null;
        field3665 = null;
        field3677 = null;
        field3670 = null;
        field3663 = null;
        int var1 = -33 / ((-arg0 - 47) / 48);
        field3678 = null;
        field3652 = null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZI)I")
    private static final int method1202(int arg0, boolean arg1, int arg2) {
        int var3 = arg0 >>> 31;
        field3655++;
        return arg1 ? (arg0 + var3) / arg2 - var3 : -91;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
    public static final int method1203(int arg0, int arg1, int arg2, int arg3) {
        field3672++;
        if ((class46.field878[arg3][arg1][arg2] & 0x8) == 0) {
            return arg3 <= arg0 || (class46.field878[1][arg1][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLka;)V")
    public static final void method1204(boolean arg0, class97 arg1) {
        if (arg0) {
            method1202(-73, false, 105);
        }
        byte[] var2 = new byte[24];
        field3656++;
        if (class19.field376 != null) {
            try {
                class19.field376.method883((byte) -11, 0L);
                class19.field376.method885(arg0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method604((byte) 122, 0, 24, var2);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class189() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V")
    public class189(byte[] arg0) {
        this.field3667 = new short[128];
        this.field3662 = new int[128];
        this.field3669 = new byte[128];
        this.field3676 = new byte[128];
        this.field3661 = new class33[128];
        this.field3671 = new byte[128];
        this.field3674 = new class204[128];
        class97 var2 = new class97(arg0);
        int var3;
        for (var3 = 0; var2.field1809[var2.field1834 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method591(65280);
        }
        var2.field1834++;
        var3++;
        int var6 = 0;
        int var7 = var2.field1834;
        var2.field1834 += var3;
        while (var2.field1809[var2.field1834 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method591(65280);
        }
        var2.field1834++;
        var6++;
        int var10 = var2.field1834;
        int var11 = 0;
        var2.field1834 += var6;
        while (var2.field1809[var2.field1834 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method591(65280);
        }
        var2.field1834++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method588((byte) -85);
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
            var15 = var11;
        }
        class204[] var19 = new class204[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class204 var103 = var19[var20] = new class204();
            int var104 = var2.method588((byte) -71);
            if (var104 > 0) {
                var103.field3928 = new byte[var104 * 2];
            }
            int var105 = var2.method588((byte) -62);
            if (var105 > 0) {
                var103.field3929 = new byte[var105 * 2 + 2];
                var103.field3929[1] = 64;
            }
        }
        int var21 = var2.method588((byte) -78);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method588((byte) -80);
        int var24;
        for (var24 = 0; var2.field1809[var2.field1834 + var24] != 0; var24++) {
        }
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var2.method591(65280);
        }
        var24++;
        int var28 = 0;
        var2.field1834++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method588((byte) -79);
            this.field3667[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method588((byte) -115);
            this.field3667[var31] = (short) (this.field3667[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length <= var33) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method562(255);
            }
            this.field3667[var35] = (short) (this.field3667[var35] + (class10.method61(2, var34 - 1) << 14));
            var32--;
            this.field3662[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3662[var39] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field1809[var7++] - 1;
                }
                var36--;
                this.field3671[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3662[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field1809[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3669[var43] = (byte) var42;
                var40--;
            }
        }
        class204 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3662[var47] != 0) {
                if (var45 == 0) {
                    var44 = var19[var14[var46]];
                    if (var12.length <= var46) {
                        var45 = -1;
                    } else {
                        var45 = var12[var46++];
                    }
                }
                var45--;
                this.field3674[var47] = var44;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var48) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field3662[var51] > 0) {
                    var50 = var2.method588((byte) -40) + 1;
                }
            }
            var49--;
            this.field3676[var51] = (byte) var50;
        }
        this.field3666 = var2.method588((byte) -95) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class204 var100 = var19[var52];
            if (var100.field3928 != null) {
                for (int var101 = 1; var101 < var100.field3928.length; var101 += 2) {
                    var100.field3928[var101] = var2.method591(65280);
                }
            }
            if (var100.field3929 != null) {
                for (int var102 = 3; var102 < var100.field3929.length - 2; var102 += 2) {
                    var100.field3929[var102] = var2.method591(65280);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method591(65280);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var2.method591(65280);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class204 var97 = var19[var55];
            if (var97.field3929 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3929.length; var99 += 2) {
                    var98 = var2.method588((byte) -67) + var98 + 1;
                    var97.field3929[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class204 var94 = var19[var56];
            if (var94.field3928 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3928.length; var96 += 2) {
                    var95 = var2.method588((byte) -93) + var95 + 1;
                    var94.field3928[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method588((byte) -79);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method588((byte) -118) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[1];
            byte var60 = var22[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field3676[var61] = (byte) (this.field3676[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var60) * var59 + (var65 - var60) / 2;
                for (int var68 = var60; var68 < var65; var68++) {
                    int var69 = method1202(var67, true, var65 - var60);
                    this.field3676[var68] = (byte) (this.field3676[var68] * var69 + 32 >> 6);
                    var67 += var66 - var59;
                }
                var59 = var66;
                var60 = var65;
            }
            Object var63 = null;
            for (int var64 = var60; var64 < 128; var64++) {
                this.field3676[var64] = (byte) (this.field3676[var64] * var59 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var2.method588((byte) -106);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var2.method588((byte) -42) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field3669[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3669[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                int var81 = (var80 - var72) / 2 + (var80 - var72) * var73;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = method1202(var81, true, var80 - var72);
                    int var84 = (this.field3669[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var81 += var79 - var73;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3669[var82] = (byte) var84;
                }
                var72 = var80;
                var75 += 2;
                var73 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field3669[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3669[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3920 = var2.method588((byte) -87);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class204 var93 = var19[var87];
            if (var93.field3928 != null) {
                var93.field3922 = var2.method588((byte) -54);
            }
            if (var93.field3929 != null) {
                var93.field3918 = var2.method588((byte) -100);
            }
            if (var93.field3920 > 0) {
                var93.field3926 = var2.method588((byte) -47);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3933 = var2.method588((byte) -84);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class204 var92 = var19[var89];
            if (var92.field3933 > 0) {
                var92.field3924 = var2.method588((byte) -88);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class204 var91 = var19[var90];
            if (var91.field3924 > 0) {
                var91.field3925 = var2.method588((byte) -100);
            }
        }
    }
}
