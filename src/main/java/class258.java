import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class258 extends class161 {

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "[B")
    public byte[] field4581;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "[B")
    public byte[] field4579;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "[I")
    private int[] field4570;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[B")
    public byte[] field4569;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "[Lnc;")
    public class85[] field4565;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[S")
    public short[] field4572;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "[Lei;")
    public class171[] field4582;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "[Lp;")
    public static class280[] field4566 = new class280[500];

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Lp;")
    public static class280 field4577 = class18.method140((byte) -122, "comp-Btence ");

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field4574 = 0;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method1747(byte arg0) {
        field4566 = null;
        field4577 = null;
        if (arg0 <= 94) {
            method1747((byte) 10);
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final void method1748(int arg0) {
        field4573++;
        if (arg0 != 0) {
            this.method1748(-22);
        }
        this.field4570 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class249[] var7 = class81.field1335;
        if (arg1 < 18) {
            method1747((byte) 125);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class249 var9 = var7[var8];
            if (var9 != null && var9.field4366 == 2) {
                class234.method1577(arg5 >> 1, arg0, 128, arg4 >> 1, var9.field4354 * 2, (var9.field4374 - class49.field806 << 7) + var9.field4375, arg6, (var9.field4361 - class91.field1480 << 7) + var9.field4369);
                if (class261.field4619 > -1 && (class117.field2104 % 20) < 10) {
                    class64.field1080[var9.field4368].method758(arg3 + class261.field4619 - 12, class178.field3091 - 28 + arg2);
                }
            }
        }
        field4568++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[BLfb;[I)Z")
    public final boolean method1750(int arg0, byte[] arg1, class29 arg2, int[] arg3) {
        boolean var5 = true;
        field4567++;
        int var6 = 0;
        class171 var7 = null;
        for (int var8 = arg0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field4570[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method260(var9 >> 2, -16241, arg3);
                        } else {
                            var7 = arg2.method256(var9 >> 2, arg0 - 39, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4582[var8] = var7;
                        this.field4570[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class258() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([B)V")
    public class258(byte[] arg0) {
        this.field4581 = new byte[128];
        this.field4579 = new byte[128];
        this.field4570 = new int[128];
        this.field4569 = new byte[128];
        this.field4565 = new class85[128];
        this.field4572 = new short[128];
        this.field4582 = new class171[128];
        int var2 = 0;
        class25 var3 = new class25(arg0);
        while (var3.field475[var3.field481 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method200(32768);
        }
        var3.field481++;
        int var6 = var3.field481;
        int var7 = 0;
        var2++;
        var3.field481 += var2;
        while (var3.field475[var3.field481 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method200(32768);
        }
        var7++;
        int var10 = 0;
        var3.field481++;
        int var11 = var3.field481;
        var3.field481 += var7;
        while (var3.field475[var3.field481 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method200(32768);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field481++;
        int var16;
        if (var10 > 1) {
            int var15 = 1;
            var14[1] = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method189((byte) -103);
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
            var16 = var10;
        }
        class85[] var19 = new class85[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class85 var103 = var19[var20] = new class85();
            int var104 = var3.method189((byte) -103);
            if (var104 > 0) {
                var103.field1397 = new byte[var104 * 2];
            }
            int var105 = var3.method189((byte) -103);
            if (var105 > 0) {
                var103.field1401 = new byte[var105 * 2 + 2];
                var103.field1401[1] = 64;
            }
        }
        int var21 = var3.method189((byte) -103);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = 0;
        int var24 = var3.method189((byte) -103);
        while (var3.field475[var3.field481 + var23] != 0) {
            var23++;
        }
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        byte[] var26 = new byte[var23];
        for (int var27 = 0; var27 < var23; var27++) {
            var26[var27] = var3.method200(32768);
        }
        var23++;
        int var28 = 0;
        var3.field481++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method189((byte) -103);
            this.field4572[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method189((byte) -103);
            this.field4572[var31] = (short) (this.field4572[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var3.method185(121);
            }
            var32--;
            this.field4572[var35] = (short) (this.field4572[var35] + class214.method1432(var33 - 1 << 14, 32768));
            this.field4570[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4570[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field475[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field4569[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4570[var43] != 0) {
                if (var40 == 0) {
                    if (var42 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var42++];
                    }
                    var41 = var3.field475[var11++] + 16 << 2;
                }
                this.field4581[var43] = (byte) var41;
                var40--;
            }
        }
        class85 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4570[var47] != 0) {
                if (var46 == 0) {
                    var44 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var46 = -1;
                    } else {
                        var46 = var12[var45++];
                    }
                }
                this.field4565[var47] = var44;
                var46--;
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
                if (this.field4570[var51] > 0) {
                    var50 = var3.method189((byte) -103) + 1;
                }
            }
            var49--;
            this.field4579[var51] = (byte) var50;
        }
        this.field4580 = var3.method189((byte) -103) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class85 var100 = var19[var52];
            if (var100.field1397 != null) {
                for (int var101 = 1; var101 < var100.field1397.length; var101 += 2) {
                    var100.field1397[var101] = var3.method200(32768);
                }
            }
            if (var100.field1401 != null) {
                for (int var102 = 3; var102 < var100.field1401.length - 2; var102 += 2) {
                    var100.field1401[var102] = var3.method200(32768);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var3.method200(32768);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method200(32768);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class85 var97 = var19[var55];
            if (var97.field1401 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1401.length; var99 += 2) {
                    var98 = var3.method189((byte) -103) + var98 + 1;
                    var97.field1401[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class85 var94 = var19[var56];
            if (var94.field1397 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1397.length; var96 += 2) {
                    var95 = var3.method189((byte) -103) + var95 + 1;
                    var94.field1397[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var3.method189((byte) -103);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var57 + var3.method189((byte) -103) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4579[var61] = (byte) (this.field4579[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                var62 += 2;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class19.method147(var67, var65 - var59, (byte) -31);
                    var67 += var66 - var60;
                    this.field4579[var68] = (byte) (this.field4579[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4579[var63] = (byte) (this.field4579[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method189((byte) -103);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 -= -var3.method189((byte) -103) - 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4581[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4581[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var25.length; var75 += 2) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class19.method147(var81, var79 - var72, (byte) -31);
                    var81 += var80 - var73;
                    int var84 = (this.field4581[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4581[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field4581[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4581[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1400 = var3.method189((byte) -103);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class85 var93 = var19[var87];
            if (var93.field1397 != null) {
                var93.field1395 = var3.method189((byte) -103);
            }
            if (var93.field1401 != null) {
                var93.field1392 = var3.method189((byte) -103);
            }
            if (var93.field1400 > 0) {
                var93.field1389 = var3.method189((byte) -103);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field1403 = var3.method189((byte) -103);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class85 var92 = var19[var89];
            if (var92.field1403 > 0) {
                var92.field1396 = var3.method189((byte) -103);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class85 var91 = var19[var90];
            if (var91.field1396 > 0) {
                var91.field1399 = var3.method189((byte) -103);
            }
        }
    }
}
