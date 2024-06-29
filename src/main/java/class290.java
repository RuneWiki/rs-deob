import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class290 extends class120 {

    @OriginalMember(owner = "client!li", name = "C", descriptor = "[Lqk;")
    public class207[] field4577;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "[B")
    public byte[] field4569;

    @OriginalMember(owner = "client!li", name = "z", descriptor = "[B")
    public byte[] field4575;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "[Lu;")
    public class119[] field4561;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
    public short[] field4572;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "[B")
    public byte[] field4568;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "[I")
    private int[] field4565;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field4562;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lpk;")
    public static class100 field4573 = new class100(16);

    @OriginalMember(owner = "client!li", name = "y", descriptor = "[Lld;")
    public static class79[] field4574 = new class79[4];

    @OriginalMember(owner = "client!li", name = "E", descriptor = "I")
    public static int field4579 = 3353893;

    @OriginalMember(owner = "client!li", name = "G", descriptor = "[I")
    public static int[] field4580 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!li", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4581 = "Cancel";

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!li", name = "I", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!li", name = "B", descriptor = "[I")
    public static int[] field4576;

    @OriginalMember(owner = "client!li", name = "D", descriptor = "[Lhc;")
    public static class229[] field4578;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
    public static final void method1924(int arg0, int arg1) {
        class287 var2 = class261.method1786(arg0, false, 1);
        field4564++;
        if (arg1 != 6492) {
            field4574 = null;
        }
        var2.method1912((byte) -111);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BLii;[I[B)Z")
    public final boolean method1925(byte arg0, class256 arg1, int[] arg2, byte[] arg3) {
        if (arg0 > -72) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class119 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4565[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1759(var9 >> 2, arg2, 1);
                        } else {
                            var7 = arg1.method1763((byte) 85, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4561[var8] = var7;
                        this.field4565[var8] = 0;
                    }
                }
            }
        }
        field4570++;
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(II)I")
    public static final int method1926(int arg0, int arg1) {
        field4563++;
        if (arg0 != -24422) {
            field4578 = null;
        }
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * var2 >> 12) + 40960;
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
    public static final void method1927(int arg0) {
        field4566++;
        int var1 = 19 / ((-arg0 - 21) / 39);
        if (class20.field240.toLowerCase().indexOf("microsoft") != -1) {
            class76.field1077[191] = 73;
            class76.field1077[186] = 57;
            class76.field1077[188] = 71;
            class76.field1077[187] = 27;
            class76.field1077[219] = 42;
            class76.field1077[190] = 72;
            class76.field1077[221] = 43;
            class76.field1077[192] = 58;
            class76.field1077[223] = 28;
            class76.field1077[189] = 26;
            class76.field1077[222] = 59;
            class76.field1077[220] = 74;
            return;
        }
        class76.field1077[92] = 74;
        class76.field1077[47] = 73;
        class76.field1077[46] = 72;
        class76.field1077[59] = 57;
        if (class20.field250 == null) {
            class76.field1077[222] = 59;
            class76.field1077[192] = 58;
        } else {
            class76.field1077[520] = 59;
            class76.field1077[222] = 58;
            class76.field1077[192] = 28;
        }
        class76.field1077[91] = 42;
        class76.field1077[44] = 71;
        class76.field1077[45] = 26;
        class76.field1077[93] = 43;
        class76.field1077[61] = 27;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V")
    public static void method1928(byte arg0) {
        field4576 = null;
        field4578 = null;
        field4580 = null;
        if (arg0 != -26) {
            method1930((byte) 69);
        }
        field4573 = null;
        field4581 = null;
        field4574 = null;
    }

    @OriginalMember(owner = "client!li", name = "d", descriptor = "(I)V")
    public final void method1929(int arg0) {
        field4567++;
        if (arg0 >= -61) {
            field4573 = null;
        }
        this.field4565 = null;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Laf;")
    public static final class68 method1930(byte arg0) {
        field4571++;
        if (arg0 != -63) {
            return null;
        }
        try {
            return (class68) Class.forName("t").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
    public class290() {
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "([B)V")
    public class290(byte[] arg0) {
        this.field4577 = new class207[128];
        this.field4569 = new byte[128];
        this.field4575 = new byte[128];
        this.field4561 = new class119[128];
        this.field4572 = new short[128];
        this.field4568 = new byte[128];
        this.field4565 = new int[128];
        int var2 = 0;
        class25 var3 = new class25(arg0);
        while (var3.field339[var3.field349 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method188(-100);
        }
        var3.field349++;
        var2++;
        int var6 = var3.field349;
        var3.field349 += var2;
        int var7;
        for (var7 = 0; var3.field339[var3.field349 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method188(-104);
        }
        var3.field349++;
        var7++;
        int var10 = var3.field349;
        int var11 = 0;
        var3.field349 += var7;
        while (var3.field339[var3.field349 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method188(-124);
        }
        var3.field349++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method201(255);
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
        class207[] var18 = new class207[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class207 var102 = var18[var19] = new class207();
            int var103 = var3.method201(255);
            if (var103 > 0) {
                var102.field3239 = new byte[var103 * 2];
            }
            int var104 = var3.method201(255);
            if (var104 > 0) {
                var102.field3235 = new byte[var104 * 2 + 2];
                var102.field3235[1] = 64;
            }
        }
        int var20 = var3.method201(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method201(255);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var3.field339[var3.field349 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method188(-103);
        }
        var3.field349++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method201(255);
            this.field4572[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method201(255);
            this.field4572[var30] = (short) (this.field4572[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method180(false);
            }
            var31--;
            this.field4572[var34] = (short) (this.field4572[var34] + (class224.method1526(var33 - 1, 2) << 14));
            this.field4565[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4565[var38] != 0) {
                if (var36 == 0) {
                    var37 = var3.field339[var6++] - 1;
                    if (var4.length <= var35) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                }
                this.field4568[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4565[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var3.field339[var10++] + 16 << 2;
                }
                var39--;
                this.field4575[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class207 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4565[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field4577[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var49 < var25.length) {
                    var47 = var25[var49++];
                } else {
                    var47 = -1;
                }
                if (this.field4565[var50] > 0) {
                    var48 = var3.method201(255) + 1;
                }
            }
            this.field4569[var50] = (byte) var48;
            var47--;
        }
        this.field4562 = var3.method201(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class207 var99 = var18[var51];
            if (var99.field3239 != null) {
                for (int var100 = 1; var100 < var99.field3239.length; var100 += 2) {
                    var99.field3239[var100] = var3.method188(-126);
                }
            }
            if (var99.field3235 != null) {
                for (int var101 = 3; var101 < (var99.field3235.length - 2); var101 += 2) {
                    var99.field3235[var101] = var3.method188(53);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method188(103);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method188(-127);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class207 var96 = var18[var54];
            if (var96.field3235 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3235.length; var98 += 2) {
                    var97 = var3.method201(255) + var97 + 1;
                    var96.field3235[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class207 var93 = var18[var55];
            if (var93.field3239 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3239.length; var95 += 2) {
                    var94 -= -var3.method201(255) - 1;
                    var93.field3239[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method201(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = (var56 + var3.method201(255)) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4569[var60] = (byte) (this.field4569[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class234.method1591(var66, (byte) 113, var64 - var58);
                    this.field4569[var67] = (byte) (this.field4569[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field4569[var63] = (byte) (this.field4569[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var3.method201(255);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var3.method201(255) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4575[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4575[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class234.method1591(var80, (byte) 113, var78 - var71);
                    int var83 = (this.field4575[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field4575[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field4575[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4575[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3226 = var3.method201(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class207 var92 = var18[var86];
            if (var92.field3239 != null) {
                var92.field3230 = var3.method201(255);
            }
            if (var92.field3235 != null) {
                var92.field3231 = var3.method201(255);
            }
            if (var92.field3226 > 0) {
                var92.field3232 = var3.method201(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3228 = var3.method201(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class207 var91 = var18[var88];
            if (var91.field3228 > 0) {
                var91.field3224 = var3.method201(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class207 var90 = var18[var89];
            if (var90.field3224 > 0) {
                var90.field3233 = var3.method201(255);
            }
        }
    }
}
