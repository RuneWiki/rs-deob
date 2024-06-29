import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class360 extends class488 {

    @OriginalMember(owner = "client!cs", name = "J", descriptor = "Ljp;")
    public class375 field4471;

    @OriginalMember(owner = "client!cs", name = "M", descriptor = "S")
    private short field4474;

    @OriginalMember(owner = "client!cs", name = "I", descriptor = "S")
    private short field4470;

    @OriginalMember(owner = "client!cs", name = "N", descriptor = "S")
    private short field4475;

    @OriginalMember(owner = "client!cs", name = "L", descriptor = "S")
    private short field4473;

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "S")
    private short field4469;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    private int field4468;

    @OriginalMember(owner = "client!cs", name = "O", descriptor = "I")
    private int field4476;

    @OriginalMember(owner = "client!cs", name = "K", descriptor = "S")
    private short field4472;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "()V", line = 5)
    private final void method2102() {
        int var1 = this.field4471.field4713.field10549;
        if (this.field4471.field4713.field10544[var1] != null) {
            this.field4471.field4713.field10544[var1].method2105();
        }
        this.field4471.field4713.field10544[var1] = this;
        this.field4472 = (short) this.field4471.field4713.field10549;
        this.field4471.field4713.field10549 = var1 + 1 & 8191;
        this.field4471.field4705.method2444(11586, this);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lha;J)V", line = 17)
    public final void method2103(class66 arg0, long arg1) {
        int var4 = super.field6812 >> class714.field10017 + 12;
        int var5 = super.field6821 >> class714.field10017 + 12;
        int var6 = super.field6817 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class307.field3799 && var5 >= 0 && var5 < class250.field2938) {
            class766 var7 = this.field4471.field4713;
            class398 var8 = this.field4471.field4711;
            class296[] var9 = class621.field8523;
            int var10 = var7.field10553;
            class727 var11 = class107.field1351[var7.field10553][var4][var5];
            if (var11 != null) {
                var10 = var11.field10186;
            }
            int var12 = var9[var10].method1728(var5, (byte) -76, var4);
            int var13;
            if (var10 < class368.field4569 - 1) {
                var13 = var9[var10 + 1].method1728(var5, (byte) -35, var4);
            } else {
                var13 = var12 - (8 << class714.field10017);
            }
            if (var8.field5213) {
                if (var8.field5153 == -1 && var6 > var12) {
                    this.method2105();
                    return;
                }
                if (var8.field5153 >= 0 && var6 > var9[var8.field5153].method1728(var5, (byte) -86, var4)) {
                    this.method2105();
                    return;
                }
                if (var8.field5158 == -1 && var6 < var13) {
                    this.method2105();
                    return;
                }
                if (var8.field5158 >= 0 && var6 < var9[var8.field5158 + 1].method1728(var5, (byte) -101, var4)) {
                    this.method2105();
                    return;
                }
            }
            int var14;
            for (var14 = class368.field4569 - 1; var14 > 0 && var6 > var9[var14].method1728(var5, (byte) -23, var4); --var14) {
            }
            if (var8.field5193 && var14 == 0 && var6 > var9[0].method1728(var5, (byte) -91, var4)) {
                this.method2105();
            } else if (class368.field4569 - 1 == var14 && var9[var14].method1728(var5, (byte) -28, var4) - var6 > 8 << class714.field10017) {
                this.method2105();
            } else {
                class727 var15 = class107.field1351[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class107.field1351[0][var4][var5] == null) {
                        var15 = class107.field1351[0][var4][var5] = new class727(0);
                    }
                    boolean var16 = class107.field1351[0][var4][var5].field10172 != null;
                    if (var14 == 3 && var16) {
                        this.method2105();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class107.field1351[var17][var4][var5] == null) {
                            var15 = class107.field1351[var17][var4][var5] = new class727(var17);
                            if (var16) {
                                ++var15.field10186;
                            }
                        }
                    }
                }
                if (var8.field5177) {
                    int var18 = super.field6812 >> 12;
                    int var19 = super.field6821 >> 12;
                    if (var15.field10173 != null) {
                        class276 var20 = var15.field10173.method507(false, arg0);
                        if (var20 != null && var20.method1609(var6, (byte) -108, var18, var19)) {
                            this.method2105();
                            return;
                        }
                    }
                    if (var15.field10187 != null) {
                        class276 var21 = var15.field10187.method507(false, arg0);
                        if (var21 != null && var21.method1609(var6, (byte) -94, var18, var19)) {
                            this.method2105();
                            return;
                        }
                    }
                    if (var15.field10177 != null) {
                        class276 var22 = var15.field10177.method507(false, arg0);
                        if (var22 != null && var22.method1609(var6, (byte) -98, var18, var19)) {
                            this.method2105();
                            return;
                        }
                    }
                    for (class10 var23 = var15.field10174; var23 != null; var23 = var23.field186) {
                        class276 var24 = var23.field187.method507(false, arg0);
                        if (var24 != null && var24.method1609(var6, (byte) -84, var18, var19)) {
                            this.method2105();
                            return;
                        }
                    }
                }
                var7.field10554.field6472.method1054(false, this);
            }
        } else {
            this.method2105();
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(JI)V", line = 194)
    public final void method2104(long arg0, int arg1) {
        this.field4474 = (short) (this.field4474 - arg1);
        if (this.field4474 <= 0) {
            this.method2105();
        } else {
            int var4 = super.field6812 >> 12;
            int var5 = super.field6817 >> 12;
            int var6 = super.field6821 >> 12;
            class766 var7 = this.field4471.field4713;
            class398 var8 = this.field4471.field4711;
            if (var8.field5204 != 0) {
                if (this.field4470 - this.field4474 <= var8.field5164) {
                    int var9 = var8.field5175 * arg1 + (super.field6816 >> 8 & 65280) + (this.field4476 >> 16 & 255);
                    int var10 = var8.field5207 * arg1 + (this.field4476 >> 8 & 255) + (super.field6816 & 65280);
                    int var11 = var8.field5188 * arg1 + (super.field6816 << 8 & 65280) + (this.field4476 & 255);
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
                    super.field6816 &= -16777216;
                    super.field6816 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4476 &= -16777216;
                    this.field4476 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4470 - this.field4474 <= var8.field5163) {
                    int var12 = var8.field5145 * arg1 + (super.field6816 >> 16 & 65280) + (this.field4476 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6816 &= 16777215;
                    super.field6816 |= (var12 & 65280) << 16;
                    this.field4476 &= 16777215;
                    this.field4476 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5160 != -1 && this.field4470 - this.field4474 <= var8.field5155) {
                this.field4468 += var8.field5209 * arg1;
            }
            if (var8.field5144 != -1 && this.field4470 - this.field4474 <= var8.field5165) {
                super.field6819 += var8.field5169 * arg1;
            }
            double var13 = (double) this.field4475;
            double var15 = (double) this.field4473;
            double var17 = (double) this.field4469;
            boolean var19 = false;
            if (var8.field5194 == 1) {
                int var20 = var4 - this.field4471.field4707.field8648;
                int var21 = var5 - this.field4471.field4707.field8642;
                int var22 = var6 - this.field4471.field4707.field8651;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field5168 * var23 * arg1);
                this.field4468 = (int) ((long) this.field4468 - ((long) this.field4468 * var24 >> 18));
            } else if (var8.field5194 == 2) {
                int var26 = var4 - this.field4471.field4707.field8648;
                int var27 = var5 - this.field4471.field4707.field8642;
                int var28 = var6 - this.field4471.field4707.field8651;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field5168 * var29 * arg1);
                this.field4468 = (int) ((long) this.field4468 - ((long) this.field4468 * var30 >> 28));
            }
            if (var8.field5200 != null) {
                class379 var32 = var7.field10550.field6367;
                for (class379 var33 = var32.field4806; var32 != var33; var33 = var33.field4806) {
                    class109 var34 = (class109) var33;
                    class371 var35 = var34.field1367;
                    if (var35.field4659 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field5200.length; ++var37) {
                            if (var8.field5200[var37] == var35.field4653) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field1366);
                            double var40 = (double) (var5 - var34.field1365);
                            double var42 = (double) (var6 - var34.field1364);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field4672)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field1372 * var42 + (double) var34.field1362 * var38 + (double) var35.field4654 * var40) * 65535.0D / ((double) var35.field4666 * var46);
                                if (!(var48 < (double) var35.field4660)) {
                                    double var50 = 0.0D;
                                    if (var35.field4667 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field4661;
                                    } else if (var35.field4667 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field4661;
                                    }
                                    if (var35.field4670 == 0) {
                                        if (var35.field4663 == 0) {
                                            var13 += ((double) var34.field1362 - var50) * (double) arg1;
                                            var15 += ((double) var35.field4654 - var50) * (double) arg1;
                                            var17 += ((double) var34.field1372 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field6812 = (int) ((double) super.field6812 + ((double) var34.field1362 - var50) * (double) arg1);
                                            super.field6817 = (int) ((double) super.field6817 + ((double) var35.field4654 - var50) * (double) arg1);
                                            super.field6821 = (int) ((double) super.field6821 + ((double) var34.field1372 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field4666;
                                        double var54 = var40 / var46 * (double) var35.field4666;
                                        double var56 = var42 / var46 * (double) var35.field4666;
                                        if (var35.field4663 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field6812 = (int) ((double) super.field6812 + (double) arg1 * var52);
                                            super.field6817 = (int) ((double) super.field6817 + (double) arg1 * var54);
                                            super.field6821 = (int) ((double) super.field6821 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5192 != null) {
                for (int var58 = 0; var58 < var8.field5192.length; ++var58) {
                    class109 var59 = (class109) class150.field1870.method946((long) var8.field5192[var58], 512);
                    while (var59 != null) {
                        class371 var60 = var59.field1367;
                        double var61 = (double) (var4 - var59.field1366);
                        double var63 = (double) (var5 - var59.field1365);
                        double var65 = (double) (var6 - var59.field1364);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field4672) {
                            var59 = (class109) class150.field1870.method942(-119);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field1372 * var65 + (double) var59.field1362 * var61 + (double) var60.field4654 * var63) * 65535.0D / ((double) var60.field4666 * var69);
                            if (var71 < (double) var60.field4660) {
                                var59 = (class109) class150.field1870.method942(-38);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field4667 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field4661;
                                } else if (var60.field4667 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field4661;
                                }
                                if (var60.field4670 == 0) {
                                    if (var60.field4663 == 0) {
                                        var13 += ((double) var59.field1362 - var73) * (double) arg1;
                                        var15 += ((double) var60.field4654 - var73) * (double) arg1;
                                        var17 += ((double) var59.field1372 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field6812 = (int) ((double) super.field6812 + ((double) var59.field1362 - var73) * (double) arg1);
                                        super.field6817 = (int) ((double) super.field6817 + ((double) var60.field4654 - var73) * (double) arg1);
                                        super.field6821 = (int) ((double) super.field6821 + ((double) var59.field1372 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field4666;
                                    double var77 = var63 / var69 * (double) var60.field4666;
                                    double var79 = var65 / var69 * (double) var60.field4666;
                                    if (var60.field4663 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field6812 = (int) ((double) super.field6812 + (double) arg1 * var75);
                                        super.field6817 = (int) ((double) super.field6817 + (double) arg1 * var77);
                                        super.field6821 = (int) ((double) super.field6821 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class109) class150.field1870.method942(120);
                            }
                        }
                    }
                }
            }
            if (var8.field5189 != null) {
                if (var8.field5198 == null) {
                    var8.field5198 = new int[var8.field5189.length];
                    for (int var81 = 0; var81 < var8.field5189.length; ++var81) {
                        class622.method3540(var8.field5189[var81], 4622);
                        var8.field5198[var81] = ((class365) class501.field7024.method2121(98, (long) var8.field5189[var81])).field4537;
                    }
                }
                for (int var82 = 0; var82 < var8.field5198.length; ++var82) {
                    class371 var83 = class141.field1765[var8.field5198[var82]];
                    if (var83.field4663 == 0) {
                        var13 += (double) (var83.field4668 * arg1);
                        var15 += (double) (var83.field4654 * arg1);
                        var17 += (double) (var83.field4664 * arg1);
                        var19 = true;
                    } else {
                        super.field6812 += var83.field4668 * arg1;
                        super.field6817 += var83.field4654 * arg1;
                        super.field6821 += var83.field4664 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field4475 = (short) ((int) var13);
                        this.field4473 = (short) ((int) var15);
                        this.field4469 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field4468 <<= 1;
                }
            }
            super.field6812 = (int) ((long) super.field6812 + ((long) (this.field4468 << 2) * (long) this.field4475 >> 23) * (long) arg1);
            super.field6817 = (int) ((long) super.field6817 + ((long) (this.field4468 << 2) * (long) this.field4473 >> 23) * (long) arg1);
            super.field6821 = (int) ((long) super.field6821 + ((long) (this.field4468 << 2) * (long) this.field4469 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "()V", line = 589)
    public final void method2105() {
        this.field4471.field4713.field10544[this.field4472] = null;
        class116.field1474[class196.field2342] = this;
        class196.field2342 = class196.field2342 + 1 & 1023;
        this.method892(50560);
        this.method1315((byte) -72);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Ljp;IIIIIIIIIIIZZ)V", line = 598)
    public final void method2106(class375 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4471 = arg0;
        super.field6812 = arg1 << 12;
        super.field6817 = arg2 << 12;
        super.field6821 = arg3 << 12;
        super.field6816 = arg9;
        this.field4470 = this.field4474 = (short) arg8;
        super.field6819 = arg10;
        super.field6814 = arg11;
        super.field6820 = arg13;
        this.field4475 = (short) arg4;
        this.field4473 = (short) arg5;
        this.field4469 = (short) arg6;
        this.field4468 = arg7;
        super.field6815 = this.field4471.field4714.field831;
        this.method2102();
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Ljp;IIIIIIIIIIIZZ)V", line = 616)
    public class360(class375 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field4471 = arg0;
        super.field6812 = arg1 << 12;
        super.field6817 = arg2 << 12;
        super.field6821 = arg3 << 12;
        super.field6816 = arg9;
        this.field4470 = this.field4474 = (short) arg8;
        super.field6819 = arg10;
        super.field6814 = arg11;
        super.field6820 = arg13;
        this.field4475 = (short) arg4;
        this.field4473 = (short) arg5;
        this.field4469 = (short) arg6;
        this.field4468 = arg7;
        super.field6815 = this.field4471.field4714.field831;
        this.method2102();
    }
}
