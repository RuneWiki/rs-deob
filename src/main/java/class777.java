import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class777 extends class590 {

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "Lbw;")
    public class719 field11340;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "S")
    private short field11344;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "S")
    private short field11337;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "S")
    private short field11338;

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "S")
    private short field11341;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "S")
    private short field11342;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    private int field11339;

    @OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
    private int field11343;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "S")
    private short field11336;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lha;J)V")
    public final void method5586(class63 arg0, long arg1) {
        int var4 = super.field8554 >> class165.field2688 + 12;
        int var5 = super.field8560 >> class165.field2688 + 12;
        int var6 = super.field8564 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class150.field2096 && var5 >= 0 && var5 < class117.field1705) {
            class92 var7 = this.field11340.field10515;
            class309 var8 = this.field11340.field10529;
            class293[] var9 = class740.field10902;
            int var10 = var7.field1360;
            class290 var11 = class85.field1280[var7.field1360][var4][var5];
            if (var11 != null) {
                var10 = var11.field4674;
            }
            int var12 = var9[var10].method2495(var5, 1, var4);
            int var13;
            if (var10 < class612.field8806 - 1) {
                var13 = var9[var10 + 1].method2495(var5, 1, var4);
            } else {
                var13 = var12 - (8 << class165.field2688);
            }
            if (var8.field4991) {
                if (var8.field5062 == -1 && var6 > var12) {
                    this.method5587();
                    return;
                }
                if (var8.field5062 >= 0 && var6 > var9[var8.field5062].method2495(var5, 1, var4)) {
                    this.method5587();
                    return;
                }
                if (var8.field4996 == -1 && var6 < var13) {
                    this.method5587();
                    return;
                }
                if (var8.field4996 >= 0 && var6 < var9[var8.field4996 + 1].method2495(var5, 1, var4)) {
                    this.method5587();
                    return;
                }
            }
            int var14;
            for (var14 = class612.field8806 - 1; var14 > 0 && var6 > var9[var14].method2495(var5, 1, var4); --var14) {
            }
            if (var8.field5049 && var14 == 0 && var6 > var9[0].method2495(var5, 1, var4)) {
                this.method5587();
            } else if (class612.field8806 - 1 == var14 && var9[var14].method2495(var5, 1, var4) - var6 > 8 << class165.field2688) {
                this.method5587();
            } else {
                class290 var15 = class85.field1280[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class85.field1280[0][var4][var5] == null) {
                        var15 = class85.field1280[0][var4][var5] = new class290(0);
                    }
                    boolean var16 = class85.field1280[0][var4][var5].field4681 != null;
                    if (var14 == 3 && var16) {
                        this.method5587();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class85.field1280[var17][var4][var5] == null) {
                            var15 = class85.field1280[var17][var4][var5] = new class290(var17);
                            if (var16) {
                                ++var15.field4674;
                            }
                        }
                    }
                }
                if (var8.field5064) {
                    int var18 = super.field8554 >> 12;
                    int var19 = super.field8560 >> 12;
                    if (var15.field4684 != null) {
                        class250 var20 = var15.field4684.method47(arg0, (byte) -118);
                        if (var20 != null && var20.method2128(var6, var19, var18, (byte) 111)) {
                            this.method5587();
                            return;
                        }
                    }
                    if (var15.field4678 != null) {
                        class250 var21 = var15.field4678.method47(arg0, (byte) -118);
                        if (var21 != null && var21.method2128(var6, var19, var18, (byte) -111)) {
                            this.method5587();
                            return;
                        }
                    }
                    if (var15.field4677 != null) {
                        class250 var22 = var15.field4677.method47(arg0, (byte) -118);
                        if (var22 != null && var22.method2128(var6, var19, var18, (byte) -52)) {
                            this.method5587();
                            return;
                        }
                    }
                    for (class135 var23 = var15.field4670; var23 != null; var23 = var23.field1912) {
                        class250 var24 = var23.field1911.method47(arg0, (byte) -118);
                        if (var24 != null && var24.method2128(var6, var19, var18, (byte) -126)) {
                            this.method5587();
                            return;
                        }
                    }
                }
                var7.field1363.field9415.method3898(false, this);
            }
        } else {
            this.method5587();
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
    public final void method5587() {
        this.field11340.field10515.field1351[this.field11336] = null;
        class787.field11507[class285.field4611] = this;
        class285.field4611 = class285.field4611 + 1 & 1023;
        this.method1715(-20685);
        this.method5006(0);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lbw;IIIIIIIIIIIZZ)V")
    public final void method5588(class719 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field11340 = arg0;
        super.field8554 = arg1 << 12;
        super.field8564 = arg2 << 12;
        super.field8560 = arg3 << 12;
        super.field8556 = arg9;
        this.field11337 = this.field11344 = (short) arg8;
        super.field8559 = arg10;
        super.field8566 = arg11;
        super.field8565 = arg13;
        this.field11338 = (short) arg4;
        this.field11341 = (short) arg5;
        this.field11342 = (short) arg6;
        this.field11339 = arg7;
        super.field8562 = this.field11340.field10526.field3674;
        this.method5589();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
    private final void method5589() {
        int var1 = this.field11340.field10515.field1353;
        if (this.field11340.field10515.field1351[var1] != null) {
            this.field11340.field10515.field1351[var1].method5587();
        }
        this.field11340.field10515.field1351[var1] = this;
        this.field11336 = (short) this.field11340.field10515.field1353;
        this.field11340.field10515.field1353 = var1 + 1 & 8191;
        this.field11340.field10522.method748(-86, this);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)V")
    public final void method5590(long arg0, int arg1) {
        this.field11344 = (short) (this.field11344 - arg1);
        if (this.field11344 <= 0) {
            this.method5587();
        } else {
            int var4 = super.field8554 >> 12;
            int var5 = super.field8564 >> 12;
            int var6 = super.field8560 >> 12;
            class92 var7 = this.field11340.field10515;
            class309 var8 = this.field11340.field10529;
            if (var8.field5002 != 0) {
                if (this.field11337 - this.field11344 <= var8.field5025) {
                    int var9 = var8.field5020 * arg1 + (this.field11343 >> 16 & 255) + (super.field8556 >> 8 & 65280);
                    int var10 = var8.field4999 * arg1 + (this.field11343 >> 8 & 255) + (super.field8556 & 65280);
                    int var11 = var8.field5055 * arg1 + (super.field8556 << 8 & 65280) + (this.field11343 & 255);
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 65535) {
                        var9 = 65535;
                    }
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 65535) {
                        var10 = 65535;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 65535) {
                        var11 = 65535;
                    }
                    super.field8556 &= -16777216;
                    super.field8556 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field11343 &= -16777216;
                    this.field11343 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field11337 - this.field11344 <= var8.field5011) {
                    int var12 = var8.field5054 * arg1 + (this.field11343 >> 24 & 255) + (super.field8556 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field8556 &= 16777215;
                    super.field8556 |= (var12 & 65280) << 16;
                    this.field11343 &= 16777215;
                    this.field11343 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5001 != -1 && this.field11337 - this.field11344 <= var8.field5063) {
                this.field11339 += var8.field5050 * arg1;
            }
            if (var8.field5000 != -1 && this.field11337 - this.field11344 <= var8.field5040) {
                super.field8559 += var8.field5060 * arg1;
            }
            double var13 = (double) this.field11338;
            double var15 = (double) this.field11341;
            double var17 = (double) this.field11342;
            boolean var19 = false;
            if (var8.field5048 == 1) {
                int var20 = var4 - this.field11340.field10520.field373;
                int var21 = var5 - this.field11340.field10520.field383;
                int var22 = var6 - this.field11340.field10520.field372;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field5042 * var23 * arg1);
                this.field11339 = (int) ((long) this.field11339 - ((long) this.field11339 * var24 >> 18));
            } else if (var8.field5048 == 2) {
                int var26 = var4 - this.field11340.field10520.field373;
                int var27 = var5 - this.field11340.field10520.field383;
                int var28 = var6 - this.field11340.field10520.field372;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field5042 * var29 * arg1);
                this.field11339 = (int) ((long) this.field11339 - ((long) this.field11339 * var30 >> 28));
            }
            if (var8.field5057 != null) {
                class568 var32 = var7.field1358.field6307;
                for (class568 var33 = var32.field8249; var32 != var33; var33 = var33.field8249) {
                    class215 var34 = (class215) var33;
                    class617 var35 = var34.field3384;
                    if (var35.field8902 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field5057.length; ++var37) {
                            if (var8.field5057[var37] == var35.field8898) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field3385);
                            double var40 = (double) (var5 - var34.field3382);
                            double var42 = (double) (var6 - var34.field3380);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field8909)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field3386 * var42 + (double) var34.field3381 * var38 + (double) var35.field8920 * var40) * 65535.0D / ((double) var35.field8907 * var46);
                                if (!(var48 < (double) var35.field8913)) {
                                    double var50 = 0.0D;
                                    if (var35.field8911 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field8912;
                                    } else if (var35.field8911 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field8912;
                                    }
                                    if (var35.field8901 == 0) {
                                        if (var35.field8914 == 0) {
                                            var13 += ((double) var34.field3381 - var50) * (double) arg1;
                                            var15 += ((double) var35.field8920 - var50) * (double) arg1;
                                            var17 += ((double) var34.field3386 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field8554 = (int) ((double) super.field8554 + ((double) var34.field3381 - var50) * (double) arg1);
                                            super.field8564 = (int) ((double) super.field8564 + ((double) var35.field8920 - var50) * (double) arg1);
                                            super.field8560 = (int) ((double) super.field8560 + ((double) var34.field3386 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field8907;
                                        double var54 = var40 / var46 * (double) var35.field8907;
                                        double var56 = var42 / var46 * (double) var35.field8907;
                                        if (var35.field8914 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field8554 = (int) ((double) super.field8554 + (double) arg1 * var52);
                                            super.field8564 = (int) ((double) super.field8564 + (double) arg1 * var54);
                                            super.field8560 = (int) ((double) super.field8560 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4993 != null) {
                for (int var58 = 0; var58 < var8.field4993.length; ++var58) {
                    class215 var59 = (class215) class449.field6964.method2178((long) var8.field4993[var58], -1);
                    while (var59 != null) {
                        class617 var60 = var59.field3384;
                        double var61 = (double) (var4 - var59.field3385);
                        double var63 = (double) (var5 - var59.field3382);
                        double var65 = (double) (var6 - var59.field3380);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field8909) {
                            var59 = (class215) class449.field6964.method2176(-18934);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field3386 * var65 + (double) var59.field3381 * var61 + (double) var60.field8920 * var63) * 65535.0D / ((double) var60.field8907 * var69);
                            if (var71 < (double) var60.field8913) {
                                var59 = (class215) class449.field6964.method2176(-18934);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field8911 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field8912;
                                } else if (var60.field8911 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field8912;
                                }
                                if (var60.field8901 == 0) {
                                    if (var60.field8914 == 0) {
                                        var13 += ((double) var59.field3381 - var73) * (double) arg1;
                                        var15 += ((double) var60.field8920 - var73) * (double) arg1;
                                        var17 += ((double) var59.field3386 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field8554 = (int) ((double) super.field8554 + ((double) var59.field3381 - var73) * (double) arg1);
                                        super.field8564 = (int) ((double) super.field8564 + ((double) var60.field8920 - var73) * (double) arg1);
                                        super.field8560 = (int) ((double) super.field8560 + ((double) var59.field3386 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field8907;
                                    double var77 = var63 / var69 * (double) var60.field8907;
                                    double var79 = var65 / var69 * (double) var60.field8907;
                                    if (var60.field8914 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field8554 = (int) ((double) super.field8554 + (double) arg1 * var75);
                                        super.field8564 = (int) ((double) super.field8564 + (double) arg1 * var77);
                                        super.field8560 = (int) ((double) super.field8560 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class215) class449.field6964.method2176(-18934);
                            }
                        }
                    }
                }
            }
            if (var8.field5058 != null) {
                if (var8.field5009 == null) {
                    var8.field5009 = new int[var8.field5058.length];
                    for (int var81 = 0; var81 < var8.field5058.length; ++var81) {
                        class642.method4651(var8.field5058[var81], -126);
                        var8.field5009[var81] = ((class272) class97.field1432.method737((byte) -39, (long) var8.field5058[var81])).field4377;
                    }
                }
                for (int var82 = 0; var82 < var8.field5009.length; ++var82) {
                    class617 var83 = class276.field4421[var8.field5009[var82]];
                    if (var83.field8914 == 0) {
                        var13 += (double) (var83.field8905 * arg1);
                        var15 += (double) (var83.field8920 * arg1);
                        var17 += (double) (var83.field8919 * arg1);
                        var19 = true;
                    } else {
                        super.field8554 += var83.field8905 * arg1;
                        super.field8564 += var83.field8920 * arg1;
                        super.field8560 += var83.field8919 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field11338 = (short) ((int) var13);
                        this.field11341 = (short) ((int) var15);
                        this.field11342 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field11339 <<= 1;
                }
            }
            super.field8554 = (int) ((long) super.field8554 + ((long) (this.field11339 << 2) * (long) this.field11338 >> 23) * (long) arg1);
            super.field8564 = (int) ((long) super.field8564 + ((long) (this.field11339 << 2) * (long) this.field11341 >> 23) * (long) arg1);
            super.field8560 = (int) ((long) super.field8560 + ((long) (this.field11339 << 2) * (long) this.field11342 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lbw;IIIIIIIIIIIZZ)V")
    public class777(class719 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field11340 = arg0;
        super.field8554 = arg1 << 12;
        super.field8564 = arg2 << 12;
        super.field8560 = arg3 << 12;
        super.field8556 = arg9;
        this.field11337 = this.field11344 = (short) arg8;
        super.field8559 = arg10;
        super.field8566 = arg11;
        super.field8565 = arg13;
        this.field11338 = (short) arg4;
        this.field11341 = (short) arg5;
        this.field11342 = (short) arg6;
        this.field11339 = arg7;
        super.field8562 = this.field11340.field10526.field3674;
        this.method5589();
    }
}
