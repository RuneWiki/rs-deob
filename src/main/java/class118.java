import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class118 extends class106 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[B")
    public byte[] field2122;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[I")
    private int[] field2123;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[Lmg;")
    public class135[] field2137;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[S")
    public short[] field2136;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[B")
    public byte[] field2141;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[B")
    public byte[] field2127;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "[Lwe;")
    public class233[] field2129;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "Loc;")
    private static class151 field2124 = class137.method873(2, "button near the top of that page)3");

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[I")
    public static int[] field2132 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2130 = 0;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "J")
    public static volatile long field2135 = 0L;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Loc;")
    public static class151 field2125 = class137.method873(2, ")1 ");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Loc;")
    public static class151 field2121 = field2124;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Loc;")
    private static class151 field2140 = class137.method873(2, "Connection lost)3");

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Loc;")
    public static class151 field2126 = field2140;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([I[BLkh;I)Z")
    public final boolean method720(int[] arg0, byte[] arg1, class116 arg2, int arg3) {
        if (arg3 != 2) {
            this.field2127 = null;
        }
        boolean var5 = true;
        field2128++;
        int var6 = 0;
        class135 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2123[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method702(arg0, var9 >> 2, arg3 ^ 0xFFFFFFFC);
                        } else {
                            var7 = arg2.method707((byte) 75, var9 >> 2, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2137[var8] = var7;
                        this.field2123[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V")
    public static void method721(byte arg0) {
        field2121 = null;
        field2125 = null;
        field2140 = null;
        if (arg0 < -17) {
            field2124 = null;
            field2132 = null;
            field2126 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public final void method722(int arg0) {
        if (arg0 >= 123) {
            field2138++;
            this.field2123 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "([B)V")
    public class118(byte[] arg0) {
        this.field2122 = new byte[128];
        this.field2123 = new int[128];
        this.field2137 = new class135[128];
        this.field2136 = new short[128];
        this.field2141 = new byte[128];
        this.field2127 = new byte[128];
        this.field2129 = new class233[128];
        class229 var2 = new class229(arg0);
        int var3;
        for (var3 = 0; var2.field4087[var2.field4101 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1457(-2);
        }
        var3++;
        var2.field4101++;
        int var6 = 0;
        int var7 = var2.field4101;
        var2.field4101 += var3;
        while (var2.field4087[var2.field4101 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1457(-2);
        }
        var6++;
        int var10 = 0;
        var2.field4101++;
        int var11 = var2.field4101;
        var2.field4101 += var6;
        while (var2.field4087[var2.field4101 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method1457(-2);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var2.field4101++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var2.method1475(255);
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
        class233[] var18 = new class233[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class233 var102 = var18[var19] = new class233();
            int var103 = var2.method1475(255);
            if (var103 > 0) {
                var102.field4285 = new byte[var103 * 2];
            }
            int var104 = var2.method1475(255);
            if (var104 > 0) {
                var102.field4293 = new byte[var104 * 2 + 2];
                var102.field4293[1] = 64;
            }
        }
        int var20 = var2.method1475(255);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method1475(255);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field4087[var2.field4101 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1457(-2);
        }
        int var27 = 0;
        var24++;
        var2.field4101++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1475(255);
            this.field2136[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1475(255);
            this.field2136[var30] = (short) (this.field2136[var30] + (var29 << 8));
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
                var33 = var2.method1438(-115);
            }
            this.field2136[var34] = (short) (this.field2136[var34] + (class26.method206(2, var33 - 1) << 14));
            this.field2123[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2123[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field4087[var7++] - 1;
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field2127[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2123[var42] != 0) {
                if (var41 == 0) {
                    var40 = var2.field4087[var11++] + 16 << 2;
                    if (var8.length <= var39) {
                        var41 = -1;
                    } else {
                        var41 = var8[var39++];
                    }
                }
                this.field2122[var42] = (byte) var40;
                var41--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class233 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2123[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 < var12.length) {
                        var43 = var12[var44++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field2129[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field2123[var50] > 0) {
                    var49 = var2.method1475(255) + 1;
                }
            }
            var48--;
            this.field2141[var50] = (byte) var49;
        }
        this.field2139 = var2.method1475(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class233 var99 = var18[var51];
            if (var99.field4285 != null) {
                for (int var100 = 1; var100 < var99.field4285.length; var100 += 2) {
                    var99.field4285[var100] = var2.method1457(-2);
                }
            }
            if (var99.field4293 != null) {
                for (int var101 = 3; var101 < var99.field4293.length - 2; var101 += 2) {
                    var99.field4293[var101] = var2.method1457(-2);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1457(-2);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1457(-2);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class233 var96 = var18[var54];
            if (var96.field4293 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4293.length; var98 += 2) {
                    var97 -= -var2.method1475(255) - 1;
                    var96.field4293[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class233 var93 = var18[var55];
            if (var93.field4285 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4285.length; var95 += 2) {
                    var94 = var94 + var2.method1475(255) + 1;
                    var93.field4285[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1475(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1475(255) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field2141[var60] = (byte) (this.field2141[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                int var65 = (var64 - var59) / 2 + (var64 - var59) * var58;
                byte var66 = var21[var61 + 1];
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class102.method621(var64 - var59, var65, 0);
                    var65 += var66 - var58;
                    this.field2141[var67] = (byte) (this.field2141[var67] * var68 + 32 >> 6);
                }
                var58 = var66;
                var61 += 2;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2141[var63] = (byte) (this.field2141[var63] * var58 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method1475(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method1475(255) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2122[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2122[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                int var78 = var23[var74 + 1] << 1;
                byte var79 = var23[var74];
                var74 += 2;
                int var80 = (var79 - var71) / 2 + (var79 - var71) * var72;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class102.method621(var79 - var71, var80, 0);
                    var80 += var78 - var72;
                    int var83 = (this.field2122[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2122[var81] = (byte) var83;
                }
                var71 = var79;
                var72 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field2122[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2122[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4291 = var2.method1475(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class233 var92 = var18[var86];
            if (var92.field4285 != null) {
                var92.field4284 = var2.method1475(255);
            }
            if (var92.field4293 != null) {
                var92.field4298 = var2.method1475(255);
            }
            if (var92.field4291 > 0) {
                var92.field4292 = var2.method1475(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4296 = var2.method1475(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class233 var91 = var18[var88];
            if (var91.field4296 > 0) {
                var91.field4299 = var2.method1475(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class233 var90 = var18[var89];
            if (var90.field4299 > 0) {
                var90.field4294 = var2.method1475(255);
            }
        }
    }
}
