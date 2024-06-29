import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class102 extends class376 {

    @OriginalMember(owner = "client!op", name = "x", descriptor = "Ldl;")
    private class39 field1545;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "Lhj;")
    private class338 field1551;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "Lvb;")
    private class107 field1549;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    private int field1548;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    private int field1552;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "[[F")
    private float[][] field1540;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "[[F")
    private float[][] field1544;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "[[F")
    private float[][] field1541;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "Lln;")
    private class212 field1543;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Lln;")
    private class212 field1538;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "Lsg;")
    private class226 field1535;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "Loc;")
    private class112 field1550;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Leb;")
    private class371 field1539;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lkg;")
    private class148 field1537;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "Lbr;")
    private class223 field1534;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "I")
    private int field1546;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    private int field1547;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IS)V")
    private final void method708(int arg0, short arg1) {
        if (this.field1551.field4640) {
            this.field1539.method2416(22064, arg1);
        } else {
            this.field1539.method2426(-1882601528, arg1);
        }
        if (arg0 >= -126) {
            this.field1534 = (class223) null;
        }
        this.field1547++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII[[Z)V")
    public final void method709(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        if (this.field1550 == null || this.field1548 > (arg0 + arg2) || this.field1552 < (arg2 - arg0) || (arg0 + arg1) < this.field1536 || this.field1542 < arg1 - arg0) {
            return;
        }
        if (arg3 != 4) {
            this.method709(78, -2, -32, -113, (boolean[][]) ((boolean[][]) null));
        }
        for (int var6 = this.field1536; var6 <= this.field1542; var6++) {
            for (int var7 = this.field1548; var7 <= this.field1552; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg1;
                if (var8 > (-arg0) && var8 < arg0 && var9 > (-arg0) && arg0 > var9 && arg4[var8 + arg0][var9 + arg0]) {
                    this.field1551.method2166((int) (this.field1549.field1594 * 255.0F) << 24);
                    this.field1551.method2158(this.field1538, (class212) null, this.field1543, (class212) null);
                    this.field1551.method2160(this.field1550, 4, 0, this.field1547);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IBIIIII)V")
    private final void method710(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var8 = -1L;
        int var10 = (arg4 << this.field1545.field574) + arg2;
        int var11 = (arg0 << this.field1545.field574) + arg3;
        int var12 = this.field1545.method278(var10, var11);
        if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class376 var13 = this.field1534.method1412((byte) -54, var8);
            if (var13 != null) {
                this.method708(-127, ((class358) var13).field5039);
                return;
            }
        }
        short var14 = (short) (this.field1546++);
        if (var8 != -1L) {
            this.field1534.method1419(var8, 34, new class358(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg2 == 0 && arg3 == 0) {
            var15 = this.field1541[arg5][arg6];
            var16 = this.field1544[arg5][arg6];
            var17 = this.field1540[arg5][arg6];
        } else if (this.field1545.field570 == arg2 && arg3 == 0) {
            var15 = this.field1541[arg5 + 1][arg6];
            var17 = this.field1540[arg5 + 1][arg6];
            var16 = this.field1544[arg5 + 1][arg6];
        } else if (this.field1545.field570 == arg2 && this.field1545.field570 == arg3) {
            var17 = this.field1540[arg5 + 1][arg6 + 1];
            var15 = this.field1541[arg5 + 1][arg6 + 1];
            var16 = this.field1544[arg5 + 1][arg6 + 1];
        } else if (arg2 == 0 && this.field1545.field570 == arg3) {
            var16 = this.field1544[arg5][arg6 + 1];
            var15 = this.field1541[arg5][arg6 + 1];
            var17 = this.field1540[arg5][arg6 + 1];
        } else {
            float var18 = (float) arg2 / (float) this.field1545.field570;
            float var19 = (float) arg3 / (float) this.field1545.field570;
            float var20 = this.field1544[arg5][arg6];
            float var21 = this.field1540[arg5][arg6];
            float var22 = this.field1541[arg5][arg6];
            float var23 = this.field1544[arg5 + 1][arg6];
            float var24 = this.field1540[arg5 + 1][arg6];
            float var25 = (this.field1544[arg5 + 1][arg6 + 1] - var23) * var18 + var23;
            float var26 = (this.field1540[arg5 + 1][arg6 + 1] - var24) * var18 + var24;
            float var27 = (this.field1541[arg5][arg6 + 1] - var22) * var18 + var22;
            float var28 = this.field1541[arg5 + 1][arg6];
            float var29 = (this.field1544[arg5][arg6 + 1] - var20) * var18 + var20;
            float var30 = (this.field1540[arg5][arg6 + 1] - var21) * var18 + var21;
            var16 = (var25 - var29) * var19 + var29;
            var17 = (var26 - var30) * var19 + var30;
            float var31 = (this.field1541[arg5 + 1][arg6 + 1] - var28) * var18 + var28;
            var15 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field1549.field1583 - var10);
        float var33 = (float) (this.field1549.field1588 - var12);
        float var34 = (float) (this.field1549.field1591 - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field1549.field1584;
        if (arg1 > -104) {
            this.method708(-117, (short) 84);
        }
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var38 + var17 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field1549.field1587;
        int var45 = (int) ((float) ((var44 & 0xFFA0A3) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF28) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field1551.field4640) {
            this.field1537.method1018(-12641, (float) var10);
            this.field1537.method1018(-12641, (float) var12);
            this.field1537.method1018(-12641, (float) var11);
        } else {
            this.field1537.method1017((float) var10, -14822);
            this.field1537.method1017((float) var12, -14822);
            this.field1537.method1017((float) var11, -14822);
        }
        this.field1537.method2396(var45, 12450);
        this.field1537.method2396(var46, 12450);
        this.field1537.method2396(var47, 12450);
        this.field1537.method2396(255, 12450);
        this.method708(-128, var14);
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lhj;Ldl;Lvb;[I)V")
    public class102(class338 arg0, class39 arg1, class107 arg2, int[] arg3) {
        this.field1545 = arg1;
        this.field1551 = arg0;
        this.field1549 = arg2;
        int var5 = this.field1549.field1584 - (arg1.field570 >> 1);
        this.field1548 = this.field1549.field1583 - var5 >> arg1.field574;
        this.field1552 = this.field1549.field1583 + var5 >> arg1.field574;
        this.field1536 = this.field1549.field1591 - var5 >> arg1.field574;
        this.field1542 = this.field1549.field1591 + var5 >> arg1.field574;
        int var6 = this.field1552 + 1 - this.field1548;
        int var7 = this.field1542 + 1 - this.field1536;
        this.field1540 = new float[var6 + 1][var7 + 1];
        this.field1544 = new float[var6 + 1][var7 + 1];
        this.field1541 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var9 = this.field1536 + var8;
            if (var9 > 0 && this.field1545.field2215 - 1 > var9) {
                for (int var10 = 0; var10 <= var6; var10++) {
                    int var11 = var10 + this.field1548;
                    if (var11 > 0 && (this.field1545.field2207 - 1) > var11) {
                        int var12 = arg1.method275(var11 + 1, var9) - arg1.method275(var11 - 1, var9);
                        int var13 = arg1.method275(var11, var9 + 1) - arg1.method275(var11, var9 - 1);
                        float var14 = (float) (1.0D / Math.sqrt((double) (var13 * var13 + var12 * var12 + 65536)));
                        this.field1544[var10][var8] = (float) var12 * var14;
                        this.field1540[var10][var8] = var14 * -256.0F;
                        this.field1541[var10][var8] = (float) var13 * var14;
                    }
                }
            }
        }
        int var15 = 0;
        int var16 = 0;
        for (int var17 = this.field1536; var17 <= this.field1542; var17++) {
            if (var17 >= 0 && arg1.field2215 > var17) {
                for (int var18 = this.field1548; var18 <= this.field1552; var18++) {
                    if (var18 >= 0 && var18 < arg1.field2207) {
                        int var19 = arg3[var16];
                        int[] var20 = arg1.field572[var18][var17];
                        if (var20 != null && var19 != 0) {
                            if (var19 == 1) {
                                var15 += var20.length;
                            } else {
                                var15 += 3;
                            }
                        }
                    }
                    var16++;
                }
            } else {
                var16 += this.field1552 - this.field1548;
            }
        }
        if (var15 <= 0) {
            this.field1543 = null;
            this.field1538 = null;
            this.field1535 = null;
            this.field1550 = null;
        } else {
            this.field1539 = new class371(var15 * 2);
            this.field1537 = new class148(var15 * 16);
            this.field1534 = new class223(class164.method1089(var15, (byte) -100));
            int var21 = 0;
            int var22 = 0;
            for (int var23 = this.field1536; var23 <= this.field1542; var23++) {
                if (var23 >= 0 && var23 < arg1.field2215) {
                    int var24 = 0;
                    for (int var25 = this.field1548; var25 <= this.field1552; var25++) {
                        if (var25 >= 0 && var25 < arg1.field2207) {
                            int var26 = arg3[var21];
                            int[] var27 = arg1.field572[var25][var23];
                            int[] var28 = arg1.field586[var25][var23];
                            if (var27 != null && var26 != 0) {
                                if (var26 == 1) {
                                    for (int var29 = 0; var29 < var27.length; var29++) {
                                        this.method710(var23, (byte) -122, var27[var29], var28[var29], var25, var24, var22);
                                    }
                                } else if (var26 == 3) {
                                    this.method710(var23, (byte) -118, 0, 0, var25, var24, var22);
                                    this.method710(var23, (byte) -118, arg1.field570, 0, var25, var24, var22);
                                    this.method710(var23, (byte) -124, 0, arg1.field570, var25, var24, var22);
                                } else if (var26 == 2) {
                                    this.method710(var23, (byte) -114, arg1.field570, 0, var25, var24, var22);
                                    this.method710(var23, (byte) -123, arg1.field570, arg1.field570, var25, var24, var22);
                                    this.method710(var23, (byte) -105, 0, 0, var25, var24, var22);
                                } else if (var26 == 5) {
                                    this.method710(var23, (byte) -118, arg1.field570, arg1.field570, var25, var24, var22);
                                    this.method710(var23, (byte) -110, 0, arg1.field570, var25, var24, var22);
                                    this.method710(var23, (byte) -108, arg1.field570, 0, var25, var24, var22);
                                } else if (var26 == 4) {
                                    this.method710(var23, (byte) -108, 0, arg1.field570, var25, var24, var22);
                                    this.method710(var23, (byte) -111, 0, 0, var25, var24, var22);
                                    this.method710(var23, (byte) -119, arg1.field570, arg1.field570, var25, var24, var22);
                                }
                            }
                        }
                        var24++;
                        var21++;
                    }
                } else {
                    var21 += this.field1552 - this.field1548;
                }
                var22++;
            }
            this.field1550 = this.field1551.method2107(5123, this.field1539.field5258, this.field1539.field5273, false);
            this.field1535 = this.field1551.method2119(16, this.field1537.field5258, this.field1537.field5273, false);
            this.field1538 = new class212(this.field1551, this.field1535, 5126, 3, 0);
            this.field1543 = new class212(this.field1551, this.field1535, 5121, 4, 12);
        }
        this.field1534 = null;
        this.field1539 = null;
        this.field1544 = this.field1540 = this.field1541 = (float[][]) null;
        this.field1537 = null;
    }
}
