import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class424 extends class261 {

    @OriginalMember(owner = "client!et", name = "v", descriptor = "[S")
    public short[] field6375;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "[B")
    public byte[] field6364;

    @OriginalMember(owner = "client!et", name = "l", descriptor = "[B")
    public byte[] field6365;

    @OriginalMember(owner = "client!et", name = "t", descriptor = "[Lwq;")
    public class116[] field6373;

    @OriginalMember(owner = "client!et", name = "r", descriptor = "[Lcc;")
    public class517[] field6371;

    @OriginalMember(owner = "client!et", name = "p", descriptor = "[B")
    public byte[] field6369;

    @OriginalMember(owner = "client!et", name = "q", descriptor = "[I")
    private int[] field6370;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!et", name = "m", descriptor = "Lkp;")
    public static class341 field6366 = null;

    @OriginalMember(owner = "client!et", name = "w", descriptor = "Z")
    public static boolean field6376 = false;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "I")
    public static int field6374 = 1;

    @OriginalMember(owner = "client!et", name = "n", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!et", name = "o", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!et", name = "s", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lwo;B[I[B)Z")
    public final boolean method2579(class527 arg0, byte arg1, int[] arg2, byte[] arg3) {
        field6372++;
        if (arg1 < 0) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class116 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field6370[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method3116(false, arg2, var9 >> 2);
                        } else {
                            var7 = arg0.method3115(-73, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6373[var8] = var7;
                        this.field6370[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
    public static final void method2580(String arg0, byte arg1, String arg2, int arg3) {
        class405.field6102 = arg3;
        class68.field1382 = 2;
        field6368++;
        if (arg1 >= -45) {
            field6374 = -109;
        }
        class414.method2546(arg2, (byte) -116, arg0);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static void method2581(int arg0) {
        field6366 = null;
        if (arg0 != 2) {
            field6366 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method2582(boolean arg0, byte[] arg1, int arg2) {
        field6379++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class63.field1288) {
            try {
                class476 var3 = (class476) Class.forName("mj").getDeclaredConstructor().newInstance();
                var3.method2801(arg1, (byte) 77);
                return var3;
            } catch (Throwable var4) {
                class63.field1288 = true;
            }
        }
        if (arg2 != 2) {
            field6376 = true;
        }
        return arg0 ? class151.method1110(arg1, 106) : arg1;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    public final void method2583(int arg0) {
        if (arg0 == 2) {
            field6367++;
            this.field6370 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V")
    public class424() {
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "([B)V")
    public class424(byte[] arg0) {
        this.field6375 = new short[128];
        this.field6364 = new byte[128];
        this.field6365 = new byte[128];
        this.field6373 = new class116[128];
        this.field6371 = new class517[128];
        this.field6369 = new byte[128];
        this.field6370 = new int[128];
        class289 var2 = new class289(arg0);
        int var3;
        for (var3 = 0; var2.field4408[var2.field4399 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1816(true);
        }
        var2.field4399++;
        var3++;
        int var6 = var2.field4399;
        var2.field4399 += var3;
        int var7;
        for (var7 = 0; var2.field4408[var2.field4399 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1816(true);
        }
        var2.field4399++;
        var7++;
        int var10 = var2.field4399;
        var2.field4399 += var7;
        int var11;
        for (var11 = 0; var2.field4408[var2.field4399 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1816(true);
        }
        var11++;
        var2.field4399++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1858(-3256);
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
        class517[] var19 = new class517[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class517 var103 = var19[var20] = new class517();
            int var104 = var2.method1858(-3256);
            if (var104 > 0) {
                var103.field7495 = new byte[var104 * 2];
            }
            int var105 = var2.method1858(-3256);
            if (var105 > 0) {
                var103.field7496 = new byte[var105 * 2 + 2];
                var103.field7496[1] = 64;
            }
        }
        int var21 = var2.method1858(-3256);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method1858(-3256);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field4408[var2.field4399 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1816(true);
        }
        var25++;
        var2.field4399++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1858(-3256);
            this.field6375[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1858(-3256);
            this.field6375[var31] = (short) (this.field6375[var31] + (var30 << 8));
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
                var34 = var2.method1836(65280);
            }
            this.field6375[var35] = (short) (this.field6375[var35] + class490.method2960(32768, var34 - 1 << 14));
            this.field6370[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6370[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field4408[var6++] - 1;
                    if (var36 >= var4.length) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                }
                this.field6369[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6370[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field4408[var10++] + 16 << 2;
                    if (var41 < var8.length) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field6364[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class517 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6370[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field6371[var47] = var46;
                var44--;
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
                if (this.field6370[var51] > 0) {
                    var50 = var2.method1858(-3256) + 1;
                }
            }
            this.field6365[var51] = (byte) var50;
            var49--;
        }
        this.field6377 = var2.method1858(-3256) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class517 var100 = var19[var52];
            if (var100.field7495 != null) {
                for (int var101 = 1; var101 < var100.field7495.length; var101 += 2) {
                    var100.field7495[var101] = var2.method1816(true);
                }
            }
            if (var100.field7496 != null) {
                for (int var102 = 3; var102 < var100.field7496.length - 2; var102 += 2) {
                    var100.field7496[var102] = var2.method1816(true);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1816(true);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1816(true);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class517 var97 = var19[var55];
            if (var97.field7496 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field7496.length; var99 += 2) {
                    var98 = var98 + var2.method1858(-3256) + 1;
                    var97.field7496[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class517 var94 = var19[var56];
            if (var94.field7495 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field7495.length; var96 += 2) {
                    var95 = var95 + var2.method1858(-3256) + 1;
                    var94.field7495[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1858(-3256);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var2.method1858(-3256) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6365[var61] = (byte) (this.field6365[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class50.method471(var65 - var59, (byte) 56, var67);
                    var67 += var66 - var60;
                    this.field6365[var68] = (byte) (this.field6365[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field6365[var64] = (byte) (this.field6365[var64] * var60 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var70 = var2.method1858(-3256);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method1858(-3256) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6364[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6364[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class50.method471(var79 - var72, (byte) -82, var81);
                    int var84 = (this.field6364[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field6364[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var79;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field6364[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6364[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field7493 = var2.method1858(-3256);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class517 var93 = var19[var87];
            if (var93.field7495 != null) {
                var93.field7499 = var2.method1858(-3256);
            }
            if (var93.field7496 != null) {
                var93.field7503 = var2.method1858(-3256);
            }
            if (var93.field7493 > 0) {
                var93.field7494 = var2.method1858(-3256);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field7500 = var2.method1858(-3256);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class517 var92 = var19[var89];
            if (var92.field7500 > 0) {
                var92.field7498 = var2.method1858(-3256);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class517 var91 = var19[var90];
            if (var91.field7498 > 0) {
                var91.field7497 = var2.method1858(-3256);
            }
        }
    }
}
