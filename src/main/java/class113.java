import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class113 extends class47 {

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[Lfc;")
    public class38[] field2816;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[S")
    public short[] field2811;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "[B")
    public byte[] field2813;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[I")
    private int[] field2814;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "[B")
    public byte[] field2819;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[B")
    public byte[] field2821;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "[Lec;")
    public class31[] field2817;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Loc;")
    public static class99 field2824 = class48.method402((byte) -104, "hel");

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lr;")
    public static class118 field2823 = new class118(50);

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Loc;")
    public static class99 field2828 = class48.method402((byte) -104, "*6n");

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field2829 = 0;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public static int field2830 = 0;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "Loc;")
    public static class99 field2831 = class48.method402((byte) -104, "Regelversto-8 melden");

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "Z")
    public static boolean field2832 = false;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "Lpc;")
    public static class105 field2827;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBLpc;I)[Ldc;")
    public static final class24[] method955(int arg0, byte arg1, class105 arg2, int arg3) {
        field2812++;
        if (arg1 <= 84) {
            field2824 = null;
        }
        return class95.method782(arg0, (byte) -99, arg2, arg3) ? class14.method146((byte) -57) : null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
    public static final int method956(int arg0, int arg1, int arg2) {
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (arg1 * var4 * var4 + 789221) * var4 + 1376312589;
        field2820++;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([IILed;[B)Z")
    public final boolean method957(int[] arg0, int arg1, class33 arg2, byte[] arg3) {
        field2818++;
        boolean var5 = true;
        int var6 = 0;
        class38 var7 = null;
        int var8 = 57 / ((40 - arg1) / 46);
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg3 == null || arg3[var9] != 0) {
                int var10 = this.field2814[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg2.method283(-17, arg0, var10 >> 2);
                        } else {
                            var7 = arg2.method280(var10 >> 2, arg0, -83);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2816[var9] = var7;
                        this.field2814[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class113() {
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 != 29837) {
            field2830 = -113;
        }
        field2828 = null;
        field2823 = null;
        field2824 = null;
        field2827 = null;
        field2831 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    public class113(byte[] arg0) {
        this.field2816 = new class38[128];
        this.field2811 = new short[128];
        this.field2813 = new byte[128];
        this.field2814 = new int[128];
        this.field2819 = new byte[128];
        this.field2821 = new byte[128];
        this.field2817 = new class31[128];
        class57 var2 = new class57(arg0);
        int var3;
        for (var3 = 0; var2.field1469[var2.field1477 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method485(104);
        }
        var2.field1477++;
        var3++;
        int var6 = 0;
        int var7 = var2.field1477;
        var2.field1477 += var3;
        while (var2.field1469[var2.field1477 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method485(104);
        }
        var2.field1477++;
        var6++;
        int var10 = 0;
        int var11 = var2.field1477;
        var2.field1477 += var6;
        while (var2.field1469[var2.field1477 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method485(104);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var2.field1477++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var2.method510(-118);
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
        class31[] var18 = new class31[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class31 var102 = var18[var19] = new class31();
            int var103 = var2.method510(-113);
            if (var103 > 0) {
                var102.field726 = new byte[var103 * 2];
            }
            int var104 = var2.method510(-125);
            if (var104 > 0) {
                var102.field743 = new byte[var104 * 2 + 2];
                var102.field743[1] = 64;
            }
        }
        int var20 = var2.method510(-121);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method510(-127);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1469[var2.field1477 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method485(104);
        }
        var24++;
        var2.field1477++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method510(-111);
            this.field2811[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method510(-110);
            this.field2811[var30] = (short) (this.field2811[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var32 == 0) {
                if (var25.length > var31) {
                    var32 = var25[var31++];
                } else {
                    var32 = -1;
                }
                var33 = var2.method480(-2097152);
            }
            this.field2811[var34] = (short) (this.field2811[var34] + (class17.method171(var33 - 1, 2) << 14));
            var32--;
            this.field2814[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2814[var38] != 0) {
                if (var36 == 0) {
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field1469[var7++] - 1;
                }
                var36--;
                this.field2821[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2814[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field1469[var11++] + 16 << 2;
                }
                var40--;
                this.field2813[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        class31 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2814[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var12.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var12[var45++];
                    }
                }
                var43--;
                this.field2817[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var47 < var25.length) {
                    var49 = var25[var47++];
                } else {
                    var49 = -1;
                }
                if (this.field2814[var50] > 0) {
                    var48 = var2.method510(-122) + 1;
                }
            }
            this.field2819[var50] = (byte) var48;
            var49--;
        }
        this.field2809 = var2.method510(-122) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class31 var99 = var18[var51];
            if (var99.field726 != null) {
                for (int var100 = 1; var100 < var99.field726.length; var100 += 2) {
                    var99.field726[var100] = var2.method485(104);
                }
            }
            if (var99.field743 != null) {
                for (int var101 = 3; var101 < var99.field743.length - 2; var101 += 2) {
                    var99.field743[var101] = var2.method485(104);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method485(104);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method485(104);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class31 var96 = var18[var54];
            if (var96.field743 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field743.length; var98 += 2) {
                    var97 = var97 + var2.method510(-111) + 1;
                    var96.field743[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class31 var93 = var18[var55];
            if (var93.field726 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field726.length; var95 += 2) {
                    var94 = var2.method510(-121) + var94 + 1;
                    var93.field726[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method510(-126);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method510(-109) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2819[var60] = (byte) (this.field2819[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61 + 1];
                byte var65 = var21[var61];
                var61 += 2;
                int var66 = (var65 - var58) / 2 + (var65 - var58) * var59;
                for (int var67 = var58; var67 < var65; var67++) {
                    int var68 = class73.method666(var65 - var58, 11181, var66);
                    this.field2819[var67] = (byte) (this.field2819[var67] * var68 + 32 >> 6);
                    var66 += var64 - var59;
                }
                var58 = var65;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field2819[var63] = (byte) (this.field2819[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method510(-113);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method510(-121) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2813[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2813[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var23[var74 + 1] << 1;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class73.method666(var78 - var71, 11181, var79);
                    var79 += var80 - var72;
                    int var83 = (this.field2813[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2813[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var80;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2813[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2813[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field730 = var2.method510(-123);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class31 var92 = var18[var86];
            if (var92.field726 != null) {
                var92.field747 = var2.method510(-117);
            }
            if (var92.field743 != null) {
                var92.field744 = var2.method510(-120);
            }
            if (var92.field730 > 0) {
                var92.field729 = var2.method510(-121);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field736 = var2.method510(-111);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class31 var91 = var18[var88];
            if (var91.field736 > 0) {
                var91.field750 = var2.method510(-111);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class31 var90 = var18[var89];
            if (var90.field750 > 0) {
                var90.field734 = var2.method510(-128);
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method959(int arg0) {
        this.field2814 = null;
        field2810++;
        if (arg0 != -11749) {
            this.method957(null, 115, null, null);
        }
    }
}
