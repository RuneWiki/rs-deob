import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class443 extends class399 {

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "Lme;")
    private class106 field6224;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "S")
    private short field6226;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "S")
    private short field6222;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "S")
    private short field6221;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "S")
    private short field6220;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "S")
    private short field6228;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    private int field6227;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "S")
    private short field6223;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)V", line = 5)
    public final void method2771(long arg0, int arg1) {
        this.field6226 = (short) (this.field6226 - arg1);
        if (this.field6226 <= 0) {
            this.method2773();
        } else {
            int var4 = super.field5689 >> class357.field4889;
            int var5 = super.field5688 >> class357.field4889;
            int var6 = super.field5701 >> class357.field4889;
            class313 var7 = this.field6224.field1449;
            class108 var8 = this.field6224.field1458;
            if (var8.field1548 != 0) {
                if (this.field6222 - this.field6226 <= var8.field1495) {
                    int var9 = var8.field1487 * arg1 + (this.field6225 >> 16 & 255) + (super.field5691 >> 8 & 65280);
                    int var10 = var8.field1537 * arg1 + (this.field6225 >> 8 & 255) + (super.field5691 & 65280);
                    int var11 = var8.field1485 * arg1 + (super.field5691 << 8 & 65280) + (this.field6225 & 255);
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
                    super.field5691 &= -16777216;
                    super.field5691 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field6225 &= -16777216;
                    this.field6225 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field6222 - this.field6226 <= var8.field1492) {
                    int var12 = var8.field1545 * arg1 + (this.field6225 >> 24 & 255) + (super.field5691 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5691 &= 16777215;
                    super.field5691 |= (var12 & 65280) << 16;
                    this.field6225 &= 16777215;
                    this.field6225 |= (var12 & 255) << 24;
                }
            }
            if (var8.field1516 != -1 && this.field6222 - this.field6226 <= var8.field1532) {
                this.field6227 += var8.field1496 * arg1;
            }
            if (var8.field1530 != -1 && this.field6222 - this.field6226 <= var8.field1543) {
                super.field5698 += var8.field1522 * arg1;
            }
            int var13 = this.field6221;
            int var14 = this.field6220;
            int var15 = this.field6228;
            boolean var16 = false;
            if (var8.field1540 == 1) {
                int var17 = var4 - this.field6224.field1454;
                int var18 = var5 - this.field6224.field1451;
                int var19 = var6 - this.field6224.field1453;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field1547 * var20 * arg1);
                this.field6227 = (int) ((long) this.field6227 - ((long) this.field6227 * var21 >> 18));
            } else if (var8.field1540 == 2) {
                int var23 = var4 - this.field6224.field1454;
                int var24 = var5 - this.field6224.field1451;
                int var25 = var6 - this.field6224.field1453;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field1547 * var26 * arg1);
                this.field6227 = (int) ((long) this.field6227 - ((long) this.field6227 * var27 >> 28));
            }
            if (var8.field1500 != null) {
                class390 var29 = var7.field4287.field1267;
                for (class390 var30 = var29.field5597; var29 != var30; var30 = var30.field5597) {
                    class9 var31 = (class9) var30;
                    class274 var32 = var31.field169;
                    if (var32.field3804 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field1500.length; ++var34) {
                            if (var8.field1500[var34] == var32.field3810) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field171;
                            int var36 = var5 - var31.field167;
                            int var37 = var6 - var31.field162;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3811) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field163 * var37 + var31.field164 * var35 + var32.field3819 * var36) * 65535L / (long) (var32.field3801 * var40);
                                if (var41 >= (long) var32.field3815) {
                                    int var43 = 0;
                                    if (var32.field3808 == 1) {
                                        var43 = (var40 >> 4) * var32.field3816;
                                    } else if (var32.field3808 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3816;
                                    }
                                    if (var32.field3813 == 0) {
                                        if (var32.field3807 == 0) {
                                            var13 += (var31.field164 - var43) * arg1;
                                            var14 += (var32.field3819 - var43) * arg1;
                                            var15 += (var31.field163 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5689 += (var31.field164 - var43) * arg1;
                                            super.field5688 += (var32.field3819 - var43) * arg1;
                                            super.field5701 += (var31.field163 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3801;
                                        int var45 = (var36 << 15) / var40 * var32.field3801;
                                        int var46 = (var37 << 15) / var40 * var32.field3801;
                                        if (var32.field3807 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5689 += arg1 * var44 >> 15;
                                            super.field5688 += arg1 * var45 >> 15;
                                            super.field5701 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field1519 != null) {
                for (int var47 = 0; var47 < var8.field1519.length; ++var47) {
                    class9 var48 = (class9) class278.field3895.method1018((long) var8.field1519[var47], false);
                    while (var48 != null) {
                        class274 var49 = var48.field169;
                        int var50 = var4 - var48.field171;
                        int var51 = var5 - var48.field167;
                        int var52 = var6 - var48.field162;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3811) {
                            var48 = (class9) class278.field3895.method1015(-22032);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field163 * var52 + var48.field164 * var50 + var49.field3819 * var51) * 65535L / (long) (var49.field3801 * var55);
                            if (var56 < (long) var49.field3815) {
                                var48 = (class9) class278.field3895.method1015(-22032);
                            } else {
                                int var58 = 0;
                                if (var49.field3808 == 1) {
                                    var58 = (var55 >> 4) * var49.field3816;
                                } else if (var49.field3808 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3816;
                                }
                                if (var49.field3813 == 0) {
                                    if (var49.field3807 == 0) {
                                        var13 += (var48.field164 - var58) * arg1;
                                        var14 += (var49.field3819 - var58) * arg1;
                                        var15 += (var48.field163 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5689 += (var48.field164 - var58) * arg1;
                                        super.field5688 += (var49.field3819 - var58) * arg1;
                                        super.field5701 += (var48.field163 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3801;
                                    int var60 = (var51 << 15) / var55 * var49.field3801;
                                    int var61 = (var52 << 15) / var55 * var49.field3801;
                                    if (var49.field3807 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5689 += arg1 * var59 >> 15;
                                        super.field5688 += arg1 * var60 >> 15;
                                        super.field5701 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class9) class278.field3895.method1015(-22032);
                            }
                        }
                    }
                }
            }
            if (var8.field1551 != null) {
                if (var8.field1514 == null) {
                    var8.field1514 = new int[var8.field1551.length];
                    for (int var62 = 0; var62 < var8.field1551.length; ++var62) {
                        class360.method2311(var8.field1551[var62], 35);
                        var8.field1514[var62] = ((class406) class59.field809.method886((long) var8.field1551[var62], 25651)).field5773;
                    }
                }
                for (int var63 = 0; var63 < var8.field1514.length; ++var63) {
                    class274 var64 = class240.field3424[var8.field1514[var63]];
                    if (var64.field3807 == 0) {
                        var13 += var64.field3809 * arg1;
                        var14 += var64.field3819 * arg1;
                        var15 += var64.field3805 * arg1;
                        var16 = true;
                    } else {
                        super.field5689 += var64.field3809 * arg1;
                        super.field5688 += var64.field3819 * arg1;
                        super.field5701 += var64.field3805 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field6221 = (short) var13;
                        this.field6220 = (short) var14;
                        this.field6228 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field6227 <<= 1;
                }
            }
            super.field5689 = (int) ((long) super.field5689 + ((long) this.field6221 * (long) this.field6227 >> 23) * (long) arg1);
            super.field5688 = (int) ((long) super.field5688 + ((long) this.field6220 * (long) this.field6227 >> 23) * (long) arg1);
            super.field5701 = (int) ((long) super.field5701 + ((long) this.field6228 * (long) this.field6227 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V", line = 405)
    private final void method2772() {
        int var1 = this.field6224.field1449.field4281;
        if (this.field6224.field1449.field4283[var1] != null) {
            this.field6224.field1449.field4283[var1].method2773();
        }
        this.field6224.field1449.field4283[var1] = this;
        this.field6223 = (short) this.field6224.field1449.field4281;
        this.field6224.field1449.field4281 = var1 + 1 & 8191;
        this.field6224.field1474.method1009(this, false);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "()V", line = 416)
    private final void method2773() {
        this.field6224.field1449.field4283[this.field6223] = null;
        class106.field1440[class260.field3645] = this;
        class260.field3645 = class260.field3645 + 1 & 1023;
        this.method1235((byte) -128);
        this.method2087(1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(J)V", line = 424)
    public final void method2774(long arg0) {
        int var3 = super.field5689 >> 19;
        int var4 = super.field5701 >> 19;
        int var5 = super.field5688 >> class357.field4889;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class200.field2772 && var4 >= 0 && var4 < class264.field3687) {
            class313 var6 = this.field6224.field1449;
            class108 var7 = this.field6224.field1458;
            class242[] var8 = class375.field5354;
            int var9 = var8[var6.field4288].method737(var3, var4);
            int var10;
            if (var6.field4288 < 3) {
                var10 = var8[var6.field4288 + 1].method737(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field1488) {
                if (var7.field1511 == -1 && var5 > var9) {
                    this.method2773();
                    return;
                }
                if (var7.field1511 >= 0 && var5 > var8[var7.field1511].method737(var3, var4)) {
                    this.method2773();
                    return;
                }
                if (var7.field1502 == -1 && var5 < var10) {
                    this.method2773();
                    return;
                }
                if (var7.field1502 >= 0 && var5 < var8[var7.field1502 + 1].method737(var3, var4)) {
                    this.method2773();
                    return;
                }
            }
            if (var3 >= var6.field4292 && var3 <= var6.field4290 && var4 >= var6.field4293 && var4 <= var6.field4290 && var5 <= var9 && var5 >= var10) {
                var6.field4291.field1102.method1885(1859, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method737(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method737(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method737(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method737(var3, var4) - 1024) {
                    this.method2773();
                    return;
                }
                class125 var12 = class328.field4549[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class328.field4549[0][var3][var4].field1762 != null;
                    if (var11 == 3 && var13) {
                        this.method2773();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class328.field4549[var14][var3][var4] == null) {
                            var12 = class328.field4549[var14][var3][var4] = new class125(var14, var3, var4);
                            if (var13) {
                                ++var12.field1737;
                            }
                        }
                    }
                }
                if (var12.field1742 == null) {
                    var12.field1742 = new class77();
                    var12.field1746 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field1746) {
                    var12.field1742 = new class77();
                    var12.field1746 = (byte) ((int) (arg0 & 255L));
                }
                var12.field1742.field1102.method1885(1859, this);
            }
        } else {
            this.method2773();
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lme;IIIIIIIIIIIZ)V", line = 551)
    public class443(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6224 = arg0;
        super.field5689 = arg1 << class357.field4889;
        super.field5688 = arg2 << class357.field4889;
        super.field5701 = arg3 << class357.field4889;
        super.field5691 = arg9;
        this.field6222 = this.field6226 = (short) arg8;
        super.field5698 = arg10;
        super.field5696 = arg11;
        this.field6221 = (short) arg4;
        this.field6220 = (short) arg5;
        this.field6228 = (short) arg6;
        this.field6227 = arg7;
        super.field5694 = this.field6224.field1468.field663;
        this.method2772();
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lme;IIIIIIIIIIIZ)V", line = 570)
    public final void method2775(class106 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field6224 = arg0;
        super.field5689 = arg1 << class357.field4889;
        super.field5688 = arg2 << class357.field4889;
        super.field5701 = arg3 << class357.field4889;
        super.field5691 = arg9;
        this.field6222 = this.field6226 = (short) arg8;
        super.field5698 = arg10;
        super.field5696 = arg11;
        this.field6221 = (short) arg4;
        this.field6220 = (short) arg5;
        this.field6228 = (short) arg6;
        this.field6227 = arg7;
        super.field5694 = this.field6224.field1468.field663;
        this.method2772();
    }
}
