import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class124 extends class210 {

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "[Lvf;")
    public class203[] field2523;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "[S")
    public short[] field2512;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[B")
    public byte[] field2532;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "[Lof;")
    public class140[] field2521;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "[B")
    public byte[] field2517;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "[B")
    public byte[] field2530;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "[I")
    private int[] field2529;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Ljd;")
    public static class92 field2514 = class202.method1325((byte) 90, "Hierhin gehen");

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Ljd;")
    public static class92 field2510 = class202.method1325((byte) 90, "Sprites geladen)3");

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "Ljd;")
    public static class92 field2526 = class202.method1325((byte) 90, " <col=ffff00>");

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "J")
    public static long field2518 = 0L;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "Ljd;")
    public static class92 field2527 = null;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2525 = 0;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "Ljd;")
    public static class92 field2533 = class202.method1325((byte) 90, "compass");

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Lud;")
    public static class192 field2520;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "Ljava/awt/Font;")
    public static Font field2516;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public final void method829(boolean arg0) {
        if (!arg0) {
            this.field2512 = null;
        }
        this.field2529 = null;
        field2531++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(La;Lrf;IIIII)V")
    public static final void method830(class1 arg0, class167 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 17911) {
            field2525 = 118;
        }
        field2513++;
        if (arg1 == null) {
            return;
        }
        int var7 = class9.field327 + class172.field3338 & 0x7FF;
        int var8 = Math.max(arg0.field96 / 2, arg0.field28 / 2) + 10;
        int var9 = arg2 * arg2 + arg5 * arg5;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class194.field3787[var7];
        int var11 = var10 * 256 / (class127.field2565 + 256);
        int var12 = class194.field3803[var7];
        int var13 = var12 * 256 / (class127.field2565 + 256);
        int var14 = arg5 * var13 - arg2 * var11 >> 16;
        int var15 = arg2 * var13 + arg5 * var11 >> 16;
        arg1.method1093(arg6 + var15 + arg0.field96 / 2 - arg1.field3279 / 2, arg3 - (-(arg0.field28 / 2) - -var14) + -(arg1.field3278 / 2), arg0.field115, arg0.field26);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)J")
    public static final long method831(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        return var3 == null || var3.field963 == null ? 0L : var3.field963.field1056;
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
    public static void method832(int arg0) {
        field2526 = null;
        int var1 = -114 % ((arg0 + 43) / 53);
        field2520 = null;
        field2533 = null;
        field2516 = null;
        field2514 = null;
        field2510 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILwh;IBI)V")
    public static final void method833(int arg0, int arg1, class214 arg2, int arg3, byte arg4, int arg5) {
        if (arg4 > -56) {
            return;
        }
        class187 var6 = new class187();
        var6.field3523 = arg2.field4180;
        var6.field3524 = arg0 * 128;
        var6.field3541 = arg2.field4157;
        var6.field3544 = arg1 * 128;
        var6.field3522 = arg2.field4178;
        var6.field3525 = arg3;
        var6.field3532 = arg2.field4141 * 128;
        int var7 = arg2.field4191;
        int var8 = arg2.field4197;
        var6.field3543 = arg2.field4187;
        field2519++;
        if (arg5 == 1 || arg5 == 3) {
            var7 = arg2.field4197;
            var8 = arg2.field4191;
        }
        var6.field3531 = (arg0 + var8) * 128;
        var6.field3537 = (arg1 + var7) * 128;
        if (arg2.field4134 != null) {
            var6.field3540 = arg2;
            var6.method1208(102);
        }
        class135.field2699.method101(var6, (byte) 121);
        if (var6.field3543 != null) {
            var6.field3542 = var6.field3522 + (int) ((double) (var6.field3523 - var6.field3522) * Math.random());
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILsb;[B[I)Z")
    public final boolean method834(int arg0, class172 arg1, byte[] arg2, int[] arg3) {
        field2524++;
        boolean var5 = true;
        int var6 = 0;
        class203 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2529[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1137(13557, arg3, var9 >> 2);
                        } else {
                            var7 = arg1.method1138(arg3, arg0 ^ 0x6B41, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2523[var8] = var7;
                        this.field2529[var8] = 0;
                    }
                }
            }
        }
        if (arg0 != 16020) {
            this.method829(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIII)Lkg;")
    public static final class105 method835(int arg0, int arg1, int arg2, int arg3) {
        class105 var4 = new class105();
        field2515++;
        var4.field2155 = arg3;
        var4.field2147 = arg0;
        class118.field2394.method210((byte) -85, (long) arg1, var4);
        class98.method687(arg3, arg2 - 89);
        class52.method309(arg3, true);
        class1 var5 = class175.method1155(arg1, (byte) -92);
        if (var5 != null) {
            class3.method21(26702, var5);
        }
        if (class93.field1897 != null) {
            class3.method21(arg2 ^ 0x684E, class93.field1897);
            class93.field1897 = null;
        }
        class72.field1524 = false;
        class3.field182 = arg2;
        class168.method1116(class211.field4084, (byte) 82, class10.field362, class186.field3513, class166.field3264);
        if (class197.field3836 != -1) {
            class81.method551(class197.field3836, 1, (byte) 77);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)Z")
    public static final boolean method836(int arg0, int arg1, int arg2, int arg3) {
        if (class15.method92(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class80.method543(var4 + 1, class158.field3146[arg0][arg1][arg2] + arg3, var5 + 1) && class80.method543(var4 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class80.method543(var4 + 128 - 1, class158.field3146[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class80.method543(var4 + 1, class158.field3146[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class124() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "([B)V")
    public class124(byte[] arg0) {
        this.field2523 = new class203[128];
        this.field2512 = new short[128];
        this.field2532 = new byte[128];
        this.field2521 = new class140[128];
        this.field2517 = new byte[128];
        this.field2530 = new byte[128];
        this.field2529 = new int[128];
        int var2 = 0;
        class70 var3 = new class70(arg0);
        while (var3.field1493[var3.field1472 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method431(-12469);
        }
        var2++;
        var3.field1472++;
        int var6 = var3.field1472;
        var3.field1472 += var2;
        int var7;
        for (var7 = 0; var3.field1493[var3.field1472 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method431(-12469);
        }
        var7++;
        var3.field1472++;
        int var10 = var3.field1472;
        var3.field1472 += var7;
        int var11;
        for (var11 = 0; var3.field1493[var3.field1472 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method431(-12469);
        }
        var3.field1472++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var14[1] = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method443(255);
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
        class140[] var19 = new class140[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class140 var103 = var19[var20] = new class140();
            int var104 = var3.method443(255);
            if (var104 > 0) {
                var103.field2813 = new byte[var104 * 2];
            }
            int var105 = var3.method443(255);
            if (var105 > 0) {
                var103.field2801 = new byte[var105 * 2 + 2];
                var103.field2801[1] = 64;
            }
        }
        int var21 = var3.method443(255);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var3.method443(255);
        int var24 = 0;
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        while (var3.field1493[var3.field1472 + var24] != 0) {
            var24++;
        }
        byte[] var26 = new byte[var24];
        for (int var27 = 0; var27 < var24; var27++) {
            var26[var27] = var3.method431(-12469);
        }
        var24++;
        var3.field1472++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method443(255);
            this.field2512[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method443(255);
            this.field2512[var31] = (short) (this.field2512[var31] + (var30 << 8));
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
                var34 = var3.method449(-77);
            }
            var32--;
            this.field2512[var35] = (short) (this.field2512[var35] + class196.method1301(var34 - 1 << 14, 32768));
            this.field2529[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2529[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field1493[var6++] - 1;
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                }
                var36--;
                this.field2517[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2529[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field1493[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field2530[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class140 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2529[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field2521[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field2529[var51] > 0) {
                    var50 = var3.method443(255) + 1;
                }
            }
            var49--;
            this.field2532[var51] = (byte) var50;
        }
        this.field2528 = var3.method443(255) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class140 var100 = var19[var52];
            if (var100.field2813 != null) {
                for (int var101 = 1; var101 < var100.field2813.length; var101 += 2) {
                    var100.field2813[var101] = var3.method431(-12469);
                }
            }
            if (var100.field2801 != null) {
                for (int var102 = 3; var102 < var100.field2801.length - 2; var102 += 2) {
                    var100.field2801[var102] = var3.method431(-12469);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method431(-12469);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method431(-12469);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class140 var97 = var19[var55];
            if (var97.field2801 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2801.length; var99 += 2) {
                    var98 = var3.method443(255) + var98 + 1;
                    var97.field2801[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class140 var94 = var19[var56];
            if (var94.field2813 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2813.length; var96 += 2) {
                    var95 = var3.method443(255) + var95 + 1;
                    var94.field2813[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method443(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method443(255) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2532[var61] = (byte) (this.field2532[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62 + 1];
                byte var66 = var22[var62];
                var62 += 2;
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class97.method675(var67, (byte) -123, var66 - var59);
                    var67 += var65 - var60;
                    this.field2532[var68] = (byte) (this.field2532[var68] * var69 + 32 >> 6);
                }
                var59 = var66;
                var60 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2532[var63] = (byte) (this.field2532[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method443(255);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method443(255) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2530[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2530[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class97.method675(var81, (byte) -118, var79 - var72);
                    var81 += var80 - var73;
                    int var84 = (this.field2530[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2530[var82] = (byte) var84;
                }
                var72 = var79;
                var73 = var80;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field2530[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2530[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2800 = var3.method443(255);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class140 var93 = var19[var87];
            if (var93.field2813 != null) {
                var93.field2810 = var3.method443(255);
            }
            if (var93.field2801 != null) {
                var93.field2819 = var3.method443(255);
            }
            if (var93.field2800 > 0) {
                var93.field2802 = var3.method443(255);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2799 = var3.method443(255);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class140 var92 = var19[var89];
            if (var92.field2799 > 0) {
                var92.field2806 = var3.method443(255);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class140 var91 = var19[var90];
            if (var91.field2806 > 0) {
                var91.field2805 = var3.method443(255);
            }
        }
    }
}
