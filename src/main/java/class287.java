import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class287 extends class95 {

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "Lkr;")
    public class598 field3987;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "S")
    private short field3991;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "S")
    private short field3990;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "S")
    private short field3988;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "S")
    private short field3985;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "S")
    private short field3989;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    private int field3992;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "S")
    private short field3986;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(JI)V", line = 3)
    public final void method1824(long arg0, int arg1) {
        this.field3991 = (short) (this.field3991 - arg1);
        if (this.field3991 <= 0) {
            this.method1828();
        } else {
            int var4 = super.field1377 >> 12;
            int var5 = super.field1374 >> 12;
            int var6 = super.field1378 >> 12;
            class27 var7 = this.field3987.field8502;
            class500 var8 = this.field3987.field8497;
            if (var8.field7243 != 0) {
                if (this.field3990 - this.field3991 <= var8.field7182) {
                    int var9 = var8.field7216 * arg1 + (super.field1375 >> 8 & 65280) + (this.field3992 >> 16 & 255);
                    int var10 = var8.field7206 * arg1 + (this.field3992 >> 8 & 255) + (super.field1375 & 65280);
                    int var11 = var8.field7229 * arg1 + (super.field1375 << 8 & 65280) + (this.field3992 & 255);
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
                    super.field1375 &= -16777216;
                    super.field1375 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3992 &= -16777216;
                    this.field3992 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3990 - this.field3991 <= var8.field7233) {
                    int var12 = var8.field7208 * arg1 + (super.field1375 >> 16 & 65280) + (this.field3992 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1375 &= 16777215;
                    super.field1375 |= (var12 & 65280) << 16;
                    this.field3992 &= 16777215;
                    this.field3992 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7202 != -1 && this.field3990 - this.field3991 <= var8.field7235) {
                this.field3984 += var8.field7181 * arg1;
            }
            if (var8.field7248 != -1 && this.field3990 - this.field3991 <= var8.field7228) {
                super.field1381 += var8.field7189 * arg1;
            }
            double var13 = (double) this.field3988;
            double var15 = (double) this.field3985;
            double var17 = (double) this.field3989;
            boolean var19 = false;
            if (var8.field7218 == 1) {
                int var20 = var4 - this.field3987.field8509.field6458;
                int var21 = var5 - this.field3987.field8509.field6465;
                int var22 = var6 - this.field3987.field8509.field6466;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field7188 * var23 * arg1);
                this.field3984 = (int) ((long) this.field3984 - ((long) this.field3984 * var24 >> 18));
            } else if (var8.field7218 == 2) {
                int var26 = var4 - this.field3987.field8509.field6458;
                int var27 = var5 - this.field3987.field8509.field6465;
                int var28 = var6 - this.field3987.field8509.field6466;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field7188 * var29 * arg1);
                this.field3984 = (int) ((long) this.field3984 - ((long) this.field3984 * var30 >> 28));
            }
            if (var8.field7247 != null) {
                class430 var32 = var7.field252.field8734;
                for (class430 var33 = var32.field6189; var32 != var33; var33 = var33.field6189) {
                    class550 var34 = (class550) var33;
                    class396 var35 = var34.field8025;
                    if (var35.field5666 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field7247.length; ++var37) {
                            if (var8.field7247[var37] == var35.field5682) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field8027);
                            double var40 = (double) (var5 - var34.field8029);
                            double var42 = (double) (var6 - var34.field8023);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field5671)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field8021 * var42 + (double) var34.field8022 * var38 + (double) var35.field5667 * var40) * 65535.0D / ((double) var35.field5673 * var46);
                                if (!(var48 < (double) var35.field5679)) {
                                    double var50 = 0.0D;
                                    if (var35.field5670 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field5681;
                                    } else if (var35.field5670 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field5681;
                                    }
                                    if (var35.field5677 == 0) {
                                        if (var35.field5678 == 0) {
                                            var13 += ((double) var34.field8022 - var50) * (double) arg1;
                                            var15 += ((double) var35.field5667 - var50) * (double) arg1;
                                            var17 += ((double) var34.field8021 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field1377 = (int) ((double) super.field1377 + ((double) var34.field8022 - var50) * (double) arg1);
                                            super.field1374 = (int) ((double) super.field1374 + ((double) var35.field5667 - var50) * (double) arg1);
                                            super.field1378 = (int) ((double) super.field1378 + ((double) var34.field8021 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field5673;
                                        double var54 = var40 / var46 * (double) var35.field5673;
                                        double var56 = var42 / var46 * (double) var35.field5673;
                                        if (var35.field5678 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field1377 = (int) ((double) super.field1377 + (double) arg1 * var52);
                                            super.field1374 = (int) ((double) super.field1374 + (double) arg1 * var54);
                                            super.field1378 = (int) ((double) super.field1378 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7190 != null) {
                for (int var58 = 0; var58 < var8.field7190.length; ++var58) {
                    class550 var59 = (class550) class163.field2326.method1005((long) var8.field7190[var58], -23630);
                    while (var59 != null) {
                        class396 var60 = var59.field8025;
                        double var61 = (double) (var4 - var59.field8027);
                        double var63 = (double) (var5 - var59.field8029);
                        double var65 = (double) (var6 - var59.field8023);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field5671) {
                            var59 = (class550) class163.field2326.method1003((byte) -12);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field8021 * var65 + (double) var59.field8022 * var61 + (double) var60.field5667 * var63) * 65535.0D / ((double) var60.field5673 * var69);
                            if (var71 < (double) var60.field5679) {
                                var59 = (class550) class163.field2326.method1003((byte) -40);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field5670 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field5681;
                                } else if (var60.field5670 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field5681;
                                }
                                if (var60.field5677 == 0) {
                                    if (var60.field5678 == 0) {
                                        var13 += ((double) var59.field8022 - var73) * (double) arg1;
                                        var15 += ((double) var60.field5667 - var73) * (double) arg1;
                                        var17 += ((double) var59.field8021 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field1377 = (int) ((double) super.field1377 + ((double) var59.field8022 - var73) * (double) arg1);
                                        super.field1374 = (int) ((double) super.field1374 + ((double) var60.field5667 - var73) * (double) arg1);
                                        super.field1378 = (int) ((double) super.field1378 + ((double) var59.field8021 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field5673;
                                    double var77 = var63 / var69 * (double) var60.field5673;
                                    double var79 = var65 / var69 * (double) var60.field5673;
                                    if (var60.field5678 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field1377 = (int) ((double) super.field1377 + (double) arg1 * var75);
                                        super.field1374 = (int) ((double) super.field1374 + (double) arg1 * var77);
                                        super.field1378 = (int) ((double) super.field1378 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class550) class163.field2326.method1003((byte) -110);
                            }
                        }
                    }
                }
            }
            if (var8.field7219 != null) {
                if (var8.field7249 == null) {
                    var8.field7249 = new int[var8.field7219.length];
                    for (int var81 = 0; var81 < var8.field7219.length; ++var81) {
                        class257.method1712(var8.field7219[var81], (byte) -82);
                        var8.field7249[var81] = ((class177) class205.field3078.method4020((long) var8.field7219[var81], (byte) -89)).field2473;
                    }
                }
                for (int var82 = 0; var82 < var8.field7249.length; ++var82) {
                    class396 var83 = class567.field8202[var8.field7249[var82]];
                    if (var83.field5678 == 0) {
                        var13 += (double) (var83.field5672 * arg1);
                        var15 += (double) (var83.field5667 * arg1);
                        var17 += (double) (var83.field5676 * arg1);
                        var19 = true;
                    } else {
                        super.field1377 += var83.field5672 * arg1;
                        super.field1374 += var83.field5667 * arg1;
                        super.field1378 += var83.field5676 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field3988 = (short) ((int) var13);
                        this.field3985 = (short) ((int) var15);
                        this.field3989 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field3984 <<= 1;
                }
            }
            super.field1377 = (int) ((long) super.field1377 + ((long) (this.field3984 << 2) * (long) this.field3988 >> 23) * (long) arg1);
            super.field1374 = (int) ((long) super.field1374 + ((long) (this.field3984 << 2) * (long) this.field3985 >> 23) * (long) arg1);
            super.field1378 = (int) ((long) super.field1378 + ((long) (this.field3984 << 2) * (long) this.field3989 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lkr;IIIIIIIIIIIZZ)V", line = 403)
    public final void method1825(class598 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3987 = arg0;
        super.field1377 = arg1 << 12;
        super.field1374 = arg2 << 12;
        super.field1378 = arg3 << 12;
        super.field1375 = arg9;
        this.field3990 = this.field3991 = (short) arg8;
        super.field1381 = arg10;
        super.field1376 = arg11;
        super.field1379 = arg13;
        this.field3988 = (short) arg4;
        this.field3985 = (short) arg5;
        this.field3989 = (short) arg6;
        this.field3984 = arg7;
        super.field1373 = this.field3987.field8500.field1541;
        this.method1827();
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lha;J)V", line = 423)
    public final void method1826(class543 arg0, long arg1) {
        int var4 = super.field1377 >> class639.field9095 + 12;
        int var5 = super.field1378 >> class639.field9095 + 12;
        int var6 = super.field1374 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class439.field6264 && var5 >= 0 && var5 < class408.field5806) {
            class27 var7 = this.field3987.field8502;
            class500 var8 = this.field3987.field8497;
            class339[] var9 = class95.field1372;
            int var10 = var7.field254;
            class375 var11 = class565.field8185[var7.field254][var4][var5];
            if (var11 != null) {
                var10 = var11.field5430;
            }
            int var12 = var9[var10].method2087(118, var4, var5);
            int var13;
            if (var10 < class433.field6202 - 1) {
                var13 = var9[var10 + 1].method2087(90, var4, var5);
            } else {
                var13 = var12 - (8 << class639.field9095);
            }
            if (var8.field7252) {
                if (var8.field7236 == -1 && var6 > var12) {
                    this.method1828();
                    return;
                }
                if (var8.field7236 >= 0 && var6 > var9[var8.field7236].method2087(58, var4, var5)) {
                    this.method1828();
                    return;
                }
                if (var8.field7244 == -1 && var6 < var13) {
                    this.method1828();
                    return;
                }
                if (var8.field7244 >= 0 && var6 < var9[var8.field7244 + 1].method2087(125, var4, var5)) {
                    this.method1828();
                    return;
                }
            }
            int var14;
            for (var14 = class433.field6202 - 1; var14 > 0 && var6 > var9[var14].method2087(120, var4, var5); --var14) {
            }
            if (var8.field7203 && var14 == 0 && var6 > var9[0].method2087(71, var4, var5)) {
                this.method1828();
            } else if (class433.field6202 - 1 == var14 && var9[var14].method2087(70, var4, var5) - var6 > 8 << class639.field9095) {
                this.method1828();
            } else {
                class375 var15 = class565.field8185[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class565.field8185[0][var4][var5] == null) {
                        var15 = class565.field8185[0][var4][var5] = new class375(0);
                    }
                    boolean var16 = class565.field8185[0][var4][var5].field5433 != null;
                    if (var14 == 3 && var16) {
                        this.method1828();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class565.field8185[var17][var4][var5] == null) {
                            var15 = class565.field8185[var17][var4][var5] = new class375(var17);
                            if (var16) {
                                ++var15.field5430;
                            }
                        }
                    }
                }
                if (var8.field7227) {
                    int var18 = super.field1377 >> 12;
                    int var19 = super.field1378 >> 12;
                    if (var15.field5431 != null) {
                        class522 var20 = var15.field5431.method602((byte) -124, arg0);
                        if (var20 != null && var20.method3176(var19, var6, -70, var18)) {
                            this.method1828();
                            return;
                        }
                    }
                    if (var15.field5427 != null) {
                        class522 var21 = var15.field5427.method602((byte) -128, arg0);
                        if (var21 != null && var21.method3176(var19, var6, -113, var18)) {
                            this.method1828();
                            return;
                        }
                    }
                    if (var15.field5422 != null) {
                        class522 var22 = var15.field5422.method602((byte) -121, arg0);
                        if (var22 != null && var22.method3176(var19, var6, -113, var18)) {
                            this.method1828();
                            return;
                        }
                    }
                    for (class208 var23 = var15.field5425; var23 != null; var23 = var23.field3146) {
                        class522 var24 = var23.field3144.method602((byte) -119, arg0);
                        if (var24 != null && var24.method3176(var19, var6, -77, var18)) {
                            this.method1828();
                            return;
                        }
                    }
                }
                var7.field256.field6514.method2712(0, this);
            }
        } else {
            this.method1828();
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()V", line = 597)
    private final void method1827() {
        int var1 = this.field3987.field8502.field246;
        if (this.field3987.field8502.field243[var1] != null) {
            this.field3987.field8502.field243[var1].method1828();
        }
        this.field3987.field8502.field243[var1] = this;
        this.field3986 = (short) this.field3987.field8502.field246;
        this.field3987.field8502.field246 = var1 + 1 & 8191;
        this.field3987.field8506.method1521(this, -24256);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()V", line = 607)
    public final void method1828() {
        this.field3987.field8502.field243[this.field3986] = null;
        class472.field6692[class556.field8081] = this;
        class556.field8081 = class556.field8081 + 1 & 1023;
        this.method814(94);
        this.method1929(0);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lkr;IIIIIIIIIIIZZ)V", line = 616)
    public class287(class598 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3987 = arg0;
        super.field1377 = arg1 << 12;
        super.field1374 = arg2 << 12;
        super.field1378 = arg3 << 12;
        super.field1375 = arg9;
        this.field3990 = this.field3991 = (short) arg8;
        super.field1381 = arg10;
        super.field1376 = arg11;
        super.field1379 = arg13;
        this.field3988 = (short) arg4;
        this.field3985 = (short) arg5;
        this.field3989 = (short) arg6;
        this.field3984 = arg7;
        super.field1373 = this.field3987.field8500.field1541;
        this.method1827();
    }
}
