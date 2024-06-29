import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class205 extends class171 {

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[Led;")
    public class187[] field2847;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "[S")
    public short[] field2855;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "[Lec;")
    public class24[] field2856;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "[B")
    public byte[] field2849;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "[B")
    public byte[] field2850;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "[I")
    private int[] field2846;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "[B")
    public byte[] field2857;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "[I")
    public static int[] field2848 = new int[2048];

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field2860 = 127;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Loh;")
    public static class281 field2854 = new class281();

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "[I")
    public static int[] field2861 = new int[256];

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2862;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    public final void method1301(boolean arg0) {
        if (!arg0) {
            field2852++;
            this.field2846 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public static final void method1302(boolean arg0) {
        field2858++;
        class77.field1073.method544(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BLwg;[IZ)Z")
    public final boolean method1303(byte[] arg0, class178 arg1, int[] arg2, boolean arg3) {
        field2853++;
        int var5 = 0;
        boolean var6 = arg3;
        class24 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2846[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1168(var9 >> 2, arg2, (byte) -83);
                        } else {
                            var7 = arg1.method1167(72, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2856[var8] = var7;
                        this.field2846[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V")
    public static void method1304(boolean arg0) {
        field2862 = null;
        if (arg0) {
            field2854 = null;
        }
        field2854 = null;
        field2848 = null;
        field2861 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIIIII)V")
    public static final void method1305(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class89 var6 = class194.field2682[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class66 var7 = var6.field1243;
        if (var7 != null) {
            int var8 = var7.field891;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class106 var10 = var6.field1225;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1486;
        int var12 = var10.field1471;
        int var13 = var10.field1484;
        int var14 = var10.field1476;
        int[] var15 = class146.field2030[var11];
        int[] var16 = class188.field2599[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BC)Z")
    public static final boolean method1306(byte arg0, char arg1) {
        if (arg0 != -85) {
            method1305((int[]) null, -78, -121, -20, 87, -72);
        }
        field2851++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class205() {
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "([B)V")
    public class205(byte[] arg0) {
        this.field2847 = new class187[128];
        this.field2855 = new short[128];
        int var2 = 0;
        this.field2856 = new class24[128];
        this.field2849 = new byte[128];
        this.field2850 = new byte[128];
        this.field2846 = new int[128];
        this.field2857 = new byte[128];
        class224 var3 = new class224(arg0);
        while (var3.field3336[var3.field3402 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1437((byte) -106);
        }
        var2++;
        var3.field3402++;
        int var6 = var3.field3402;
        var3.field3402 += var2;
        int var7;
        for (var7 = 0; var3.field3336[var3.field3402 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1437((byte) -71);
        }
        var7++;
        var3.field3402++;
        int var10 = var3.field3402;
        var3.field3402 += var7;
        int var11;
        for (var11 = 0; var3.field3336[var3.field3402 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1437((byte) -119);
        }
        var11++;
        byte[] var14 = new byte[var11];
        var3.field3402++;
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1453((byte) -127);
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
        class187[] var18 = new class187[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class187 var102 = var18[var19] = new class187();
            int var103 = var3.method1453((byte) -127);
            if (var103 > 0) {
                var102.field2578 = new byte[var103 * 2];
            }
            int var104 = var3.method1453((byte) -127);
            if (var104 > 0) {
                var102.field2577 = new byte[var104 * 2 + 2];
                var102.field2577[1] = 64;
            }
        }
        int var20 = var3.method1453((byte) -128);
        int var21 = 0;
        byte[] var22 = var20 <= 0 ? null : new byte[var20 * 2];
        int var23 = var3.method1453((byte) -128);
        while (var3.field3336[var3.field3402 + var21] != 0) {
            var21++;
        }
        byte[] var24 = new byte[var21];
        byte[] var25 = var23 <= 0 ? null : new byte[var23 * 2];
        for (int var26 = 0; var26 < var21; var26++) {
            var24[var26] = var3.method1437((byte) -71);
        }
        var21++;
        var3.field3402++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1453((byte) -127);
            this.field2855[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1453((byte) -128);
            this.field2855[var30] = (short) (this.field2855[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var24.length) {
                    var31 = -1;
                } else {
                    var31 = var24[var32++];
                }
                var33 = var3.method1449(26861);
            }
            var31--;
            this.field2855[var34] = (short) (this.field2855[var34] + (class235.method1572(2, var33 - 1) << 14));
            this.field2846[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2846[var38] != 0) {
                if (var35 == 0) {
                    var37 = var3.field3336[var6++] - 1;
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                var35--;
                this.field2849[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2846[var42] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var39 = var3.field3336[var10++] + 16 << 2;
                }
                this.field2857[var42] = (byte) var39;
                var41--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class187 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2846[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                var43--;
                this.field2847[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var49 == 0) {
                if (var48 < var24.length) {
                    var49 = var24[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field2846[var50] > 0) {
                    var47 = var3.method1453((byte) -128) + 1;
                }
            }
            var49--;
            this.field2850[var50] = (byte) var47;
        }
        this.field2859 = var3.method1453((byte) -128) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class187 var99 = var18[var51];
            if (var99.field2578 != null) {
                for (int var100 = 1; var100 < var99.field2578.length; var100 += 2) {
                    var99.field2578[var100] = var3.method1437((byte) -102);
                }
            }
            if (var99.field2577 != null) {
                for (int var101 = 3; var101 < (var99.field2577.length - 2); var101 += 2) {
                    var99.field2577[var101] = var3.method1437((byte) -94);
                }
            }
        }
        if (var22 != null) {
            for (int var52 = 1; var52 < var22.length; var52 += 2) {
                var22[var52] = var3.method1437((byte) -125);
            }
        }
        if (var25 != null) {
            for (int var53 = 1; var53 < var25.length; var53 += 2) {
                var25[var53] = var3.method1437((byte) -100);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class187 var96 = var18[var54];
            if (var96.field2577 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2577.length; var98 += 2) {
                    var97 = var97 + var3.method1453((byte) -127) + 1;
                    var96.field2577[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class187 var93 = var18[var55];
            if (var93.field2578 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2578.length; var95 += 2) {
                    var94 = var94 + var3.method1453((byte) -127) + 1;
                    var93.field2578[var95] = (byte) var94;
                }
            }
        }
        if (var22 != null) {
            int var56 = var3.method1453((byte) -127);
            var22[0] = (byte) var56;
            for (int var57 = 2; var57 < var22.length; var57 += 2) {
                var56 = var3.method1453((byte) -128) + var56 + 1;
                var22[var57] = (byte) var56;
            }
            byte var58 = var22[0];
            byte var59 = var22[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2850[var60] = (byte) (this.field2850[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var22.length; var61 += 2) {
                byte var64 = var22[var61];
                byte var65 = var22[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class139.method937(var64 - var58, var66, (byte) -128);
                    var66 += var65 - var59;
                    this.field2850[var67] = (byte) (this.field2850[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field2850[var62] = (byte) (this.field2850[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var25 != null) {
            int var69 = var3.method1453((byte) -127);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1453((byte) -127) + var69 + 1;
                var25[var70] = (byte) var69;
            }
            int var71 = var25[1] << 1;
            byte var72 = var25[0];
            for (int var73 = 0; var73 < var72; var73++) {
                int var84 = (this.field2857[var73] & 0xFF) + var71;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2857[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var78 = var25[var74];
                int var79 = var25[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var72) * var71 + ((var78 - var72) / 2);
                for (int var81 = var72; var81 < var78; var81++) {
                    int var82 = class139.method937(var78 - var72, var80, (byte) -128);
                    var80 += var79 - var71;
                    int var83 = (this.field2857[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2857[var81] = (byte) var83;
                }
                var71 = var79;
                var72 = var78;
            }
            for (int var75 = var72; var75 < 128; var75++) {
                int var77 = (this.field2857[var75] & 0xFF) + var71;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2857[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2585 = var3.method1453((byte) -127);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class187 var92 = var18[var86];
            if (var92.field2578 != null) {
                var92.field2576 = var3.method1453((byte) -128);
            }
            if (var92.field2577 != null) {
                var92.field2575 = var3.method1453((byte) -127);
            }
            if (var92.field2585 > 0) {
                var92.field2580 = var3.method1453((byte) -127);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2581 = var3.method1453((byte) -128);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class187 var91 = var18[var88];
            if (var91.field2581 > 0) {
                var91.field2582 = var3.method1453((byte) -127);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class187 var90 = var18[var89];
            if (var90.field2582 > 0) {
                var90.field2586 = var3.method1453((byte) -128);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2861[var0] = var1;
        }
        field2862 = "Please remove ";
    }
}
