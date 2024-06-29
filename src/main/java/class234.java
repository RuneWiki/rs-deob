import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class234 extends class235 {

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "[Lfc;")
    public class89[] field4043;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "[I")
    private int[] field4040;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[S")
    public short[] field4031;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "[B")
    public byte[] field4033;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "[B")
    public byte[] field4051;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "[Lcb;")
    public class178[] field4041;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "[B")
    public byte[] field4039;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "[I")
    public static int[] field4047 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "[Z")
    public static boolean[] field4036 = new boolean[8];

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "Lsb;")
    public static class98 field4045 = class47.method368("scrollbar", 0);

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field4046 = -1;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "Lsb;")
    public static class98 field4042 = class47.method368("Lade Schrifts-=tze )2 ", 0);

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "Lsb;")
    private static class98 field4049 = class47.method368("Loaded input handler", 0);

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field4050 = 500;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lsb;")
    public static class98 field4038 = field4049;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lsb;")
    public static class98 field4032 = class47.method368(")2", 0);

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "Lbd;")
    public static class22 field4048;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
    public static void method1601(int arg0) {
        field4042 = null;
        field4047 = null;
        if (arg0 < 117) {
            method1603(-41L, -10);
        }
        field4049 = null;
        field4038 = null;
        field4036 = null;
        field4048 = null;
        field4032 = null;
        field4045 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[I[BLdf;)Z")
    public final boolean method1602(byte arg0, int[] arg1, byte[] arg2, class137 arg3) {
        field4037++;
        if (arg0 != -64) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class89 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field4040[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method1029(var9 >> 2, arg1, -29687);
                        } else {
                            var7 = arg3.method1032(var9 >> 2, -29463, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4043[var8] = var7;
                        this.field4040[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)V")
    public static final void method1603(long arg0, int arg1) {
        field4034++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class263.method1794(arg0 - 1L, (byte) -68);
            class263.method1794(1L, (byte) -68);
        } else {
            class263.method1794(arg0, (byte) -68);
        }
        int var3 = 119 / ((-arg1 - 57) / 50);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method1604(int arg0) {
        field4044++;
        this.field4040 = null;
        if (arg0 > -110) {
            field4038 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class234() {
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
    public class234(byte[] arg0) {
        this.field4043 = new class89[128];
        this.field4040 = new int[128];
        this.field4031 = new short[128];
        int var2 = 0;
        this.field4033 = new byte[128];
        this.field4051 = new byte[128];
        this.field4041 = new class178[128];
        this.field4039 = new byte[128];
        class216 var3 = new class216(arg0);
        while (var3.field3706[var3.field3728 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1472(69);
        }
        var3.field3728++;
        var2++;
        int var6 = 0;
        int var7 = var3.field3728;
        var3.field3728 += var2;
        while (var3.field3706[var3.field3728 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1472(96);
        }
        var6++;
        int var10 = 0;
        var3.field3728++;
        int var11 = var3.field3728;
        var3.field3728 += var6;
        while (var3.field3706[var3.field3728 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1472(91);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field3728++;
        int var15;
        if (var10 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1446(5350);
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
        class178[] var19 = new class178[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class178 var103 = var19[var20] = new class178();
            int var104 = var3.method1446(5350);
            if (var104 > 0) {
                var103.field3084 = new byte[var104 * 2];
            }
            int var105 = var3.method1446(5350);
            if (var105 > 0) {
                var103.field3081 = new byte[var105 * 2 + 2];
                var103.field3081[1] = 64;
            }
        }
        int var21 = var3.method1446(5350);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method1446(5350);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var3.field3706[var3.field3728 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var3.method1472(75);
        }
        var25++;
        var3.field3728++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1446(5350);
            this.field4031[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1446(5350);
            this.field4031[var31] = (short) (this.field4031[var31] + (var30 << 8));
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
                var34 = var3.method1465((byte) 126);
            }
            var32--;
            this.field4031[var35] = (short) (this.field4031[var35] + (class214.method1427(2, var34 - 1) << 14));
            this.field4040[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4040[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field3706[var7++] - 1;
                    if (var4.length <= var37) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                this.field4039[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4040[var43] != 0) {
                if (var41 == 0) {
                    if (var40 >= var8.length) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var3.field3706[var11++] + 16 << 2;
                }
                var41--;
                this.field4051[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class178 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4040[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field4041[var47] = var46;
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
                if (this.field4040[var51] > 0) {
                    var50 = var3.method1446(5350) + 1;
                }
            }
            this.field4033[var51] = (byte) var50;
            var49--;
        }
        this.field4035 = var3.method1446(5350) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class178 var100 = var19[var52];
            if (var100.field3084 != null) {
                for (int var101 = 1; var101 < var100.field3084.length; var101 += 2) {
                    var100.field3084[var101] = var3.method1472(90);
                }
            }
            if (var100.field3081 != null) {
                for (int var102 = 3; var102 < var100.field3081.length - 2; var102 += 2) {
                    var100.field3081[var102] = var3.method1472(115);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method1472(93);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var3.method1472(109);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class178 var97 = var19[var55];
            if (var97.field3081 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field3081.length; var99 += 2) {
                    var98 = var3.method1446(5350) + var98 + 1;
                    var97.field3081[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class178 var94 = var19[var56];
            if (var94.field3084 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field3084.length; var96 += 2) {
                    var95 = var3.method1446(5350) + var95 + 1;
                    var94.field3084[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method1446(5350);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var3.method1446(5350) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4033[var61] = (byte) (this.field4033[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class253.method1751(var65 - var59, var67, (byte) 106);
                    var67 += var66 - var60;
                    this.field4033[var68] = (byte) (this.field4033[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field4033[var64] = (byte) (this.field4033[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var3.method1446(5350);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var3.method1446(5350) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4051[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4051[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                var75 += 2;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class253.method1751(var79 - var72, var81, (byte) 106);
                    var81 += var80 - var73;
                    int var84 = (this.field4051[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4051[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4051[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4051[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field3086 = var3.method1446(5350);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class178 var93 = var19[var87];
            if (var93.field3084 != null) {
                var93.field3087 = var3.method1446(5350);
            }
            if (var93.field3081 != null) {
                var93.field3088 = var3.method1446(5350);
            }
            if (var93.field3086 > 0) {
                var93.field3092 = var3.method1446(5350);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field3090 = var3.method1446(5350);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class178 var92 = var19[var89];
            if (var92.field3090 > 0) {
                var92.field3083 = var3.method1446(5350);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class178 var91 = var19[var90];
            if (var91.field3083 > 0) {
                var91.field3082 = var3.method1446(5350);
            }
        }
        if (class185.field3203) {
        }
    }
}
