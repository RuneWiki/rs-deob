import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class196 extends class113 {

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "Lah;")
    private class342 field2712;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "S")
    private short field2711;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "S")
    private short field2715;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "S")
    private short field2714;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "S")
    private short field2708;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "S")
    private short field2707;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    private int field2713;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "S")
    private short field2709;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(JI)V", line = 5)
    public final void method1297(long arg0, int arg1) {
        this.field2711 = (short) (this.field2711 - arg1);
        if (this.field2711 <= 0) {
            this.method1301();
        } else {
            int var4 = super.field1473 >> class439.field6365;
            int var5 = super.field1462 >> class439.field6365;
            int var6 = super.field1471 >> class439.field6365;
            class411 var7 = this.field2712.field5119;
            class416 var8 = this.field2712.field5089;
            if (var8.field6034 != 0) {
                if (this.field2715 - this.field2711 <= var8.field6066) {
                    int var9 = var8.field6030 * arg1 + (this.field2713 >> 16 & 255) + (super.field1472 >> 8 & 65280);
                    int var10 = var8.field6022 * arg1 + (this.field2713 >> 8 & 255) + (super.field1472 & 65280);
                    int var11 = var8.field6072 * arg1 + (super.field1472 << 8 & 65280) + (this.field2713 & 255);
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
                    super.field1472 &= -16777216;
                    super.field1472 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2713 &= -16777216;
                    this.field2713 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2715 - this.field2711 <= var8.field6039) {
                    int var12 = var8.field6058 * arg1 + (this.field2713 >> 24 & 255) + (super.field1472 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1472 &= 16777215;
                    super.field1472 |= (var12 & 65280) << 16;
                    this.field2713 &= 16777215;
                    this.field2713 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6036 != -1 && this.field2715 - this.field2711 <= var8.field6048) {
                this.field2710 += var8.field6047 * arg1;
            }
            if (var8.field6016 != -1 && this.field2715 - this.field2711 <= var8.field6051) {
                super.field1463 += var8.field6067 * arg1;
            }
            int var13 = this.field2714;
            int var14 = this.field2708;
            int var15 = this.field2707;
            boolean var16 = false;
            if (var8.field6060 == 1) {
                int var17 = var4 - this.field2712.field5107;
                int var18 = var5 - this.field2712.field5124;
                int var19 = var6 - this.field2712.field5092;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field6071 * var20 * arg1);
                this.field2710 = (int) ((long) this.field2710 - ((long) this.field2710 * var21 >> 18));
            } else if (var8.field6060 == 2) {
                int var23 = var4 - this.field2712.field5107;
                int var24 = var5 - this.field2712.field5124;
                int var25 = var6 - this.field2712.field5092;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field6071 * var26 * arg1);
                this.field2710 = (int) ((long) this.field2710 - ((long) this.field2710 * var27 >> 28));
            }
            if (var8.field6059 != null) {
                class418 var29 = var7.field5968.field3397;
                for (class418 var30 = var29.field6094; var29 != var30; var30 = var30.field6094) {
                    class296 var31 = (class296) var30;
                    class4 var32 = var31.field4464;
                    if (var32.field69 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field6059.length; ++var34) {
                            if (var8.field6059[var34] == var32.field63) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4461;
                            int var36 = var5 - var31.field4465;
                            int var37 = var6 - var31.field4470;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field58) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4468 * var37 + var31.field4462 * var35 + var32.field59 * var36) * 65535L / (long) (var32.field70 * var40);
                                if (var41 >= (long) var32.field57) {
                                    int var43 = 0;
                                    if (var32.field60 == 1) {
                                        var43 = (var40 >> 4) * var32.field50;
                                    } else if (var32.field60 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field50;
                                    }
                                    if (var32.field72 == 0) {
                                        if (var32.field51 == 0) {
                                            var13 += (var31.field4462 - var43) * arg1;
                                            var14 += (var32.field59 - var43) * arg1;
                                            var15 += (var31.field4468 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field1473 += (var31.field4462 - var43) * arg1;
                                            super.field1462 += (var32.field59 - var43) * arg1;
                                            super.field1471 += (var31.field4468 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field70;
                                        int var45 = (var36 << 15) / var40 * var32.field70;
                                        int var46 = (var37 << 15) / var40 * var32.field70;
                                        if (var32.field51 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field1473 += arg1 * var44 >> 15;
                                            super.field1462 += arg1 * var45 >> 15;
                                            super.field1471 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6069 != null) {
                for (int var47 = 0; var47 < var8.field6069.length; ++var47) {
                    class296 var48 = (class296) class189.field2593.method1311(119, (long) var8.field6069[var47]);
                    while (var48 != null) {
                        class4 var49 = var48.field4464;
                        int var50 = var4 - var48.field4461;
                        int var51 = var5 - var48.field4465;
                        int var52 = var6 - var48.field4470;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field58) {
                            var48 = (class296) class189.field2593.method1316(110);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4468 * var52 + var48.field4462 * var50 + var49.field59 * var51) * 65535L / (long) (var49.field70 * var55);
                            if (var56 < (long) var49.field57) {
                                var48 = (class296) class189.field2593.method1316(-78);
                            } else {
                                int var58 = 0;
                                if (var49.field60 == 1) {
                                    var58 = (var55 >> 4) * var49.field50;
                                } else if (var49.field60 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field50;
                                }
                                if (var49.field72 == 0) {
                                    if (var49.field51 == 0) {
                                        var13 += (var48.field4462 - var58) * arg1;
                                        var14 += (var49.field59 - var58) * arg1;
                                        var15 += (var48.field4468 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field1473 += (var48.field4462 - var58) * arg1;
                                        super.field1462 += (var49.field59 - var58) * arg1;
                                        super.field1471 += (var48.field4468 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field70;
                                    int var60 = (var51 << 15) / var55 * var49.field70;
                                    int var61 = (var52 << 15) / var55 * var49.field70;
                                    if (var49.field51 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field1473 += arg1 * var59 >> 15;
                                        super.field1462 += arg1 * var60 >> 15;
                                        super.field1471 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class296) class189.field2593.method1316(127);
                            }
                        }
                    }
                }
            }
            if (var8.field6074 != null) {
                if (var8.field6038 == null) {
                    var8.field6038 = new int[var8.field6074.length];
                    for (int var62 = 0; var62 < var8.field6074.length; ++var62) {
                        class373.method2450(26, var8.field6074[var62]);
                        var8.field6038[var62] = ((class17) class204.field2814.method2826(false, (long) var8.field6074[var62])).field274;
                    }
                }
                for (int var63 = 0; var63 < var8.field6038.length; ++var63) {
                    class4 var64 = class118.field1539[var8.field6038[var63]];
                    if (var64.field51 == 0) {
                        var13 += var64.field61 * arg1;
                        var14 += var64.field59 * arg1;
                        var15 += var64.field55 * arg1;
                        var16 = true;
                    } else {
                        super.field1473 += var64.field61 * arg1;
                        super.field1462 += var64.field59 * arg1;
                        super.field1471 += var64.field55 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2714 = (short) var13;
                        this.field2708 = (short) var14;
                        this.field2707 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2710 <<= 1;
                }
            }
            super.field1473 = (int) ((long) super.field1473 + ((long) this.field2714 * (long) this.field2710 >> 23) * (long) arg1);
            super.field1462 = (int) ((long) super.field1462 + ((long) this.field2708 * (long) this.field2710 >> 23) * (long) arg1);
            super.field1471 = (int) ((long) super.field1471 + ((long) this.field2707 * (long) this.field2710 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V", line = 402)
    public final void method1298(long arg0) {
        int var3 = super.field1473 >> 19;
        int var4 = super.field1471 >> 19;
        int var5 = super.field1462 >> class439.field6365;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class108.field1421 && var4 >= 0 && var4 < class186.field2554) {
            class411 var6 = this.field2712.field5119;
            class416 var7 = this.field2712.field5089;
            class193[] var8 = class266.field3950;
            int var9 = var8[var6.field5971].method722(var3, var4);
            int var10;
            if (var6.field5971 < 3) {
                var10 = var8[var6.field5971 + 1].method722(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field6064) {
                if (var7.field6035 == -1 && var5 > var9) {
                    this.method1301();
                    return;
                }
                if (var7.field6035 >= 0 && var5 > var8[var7.field6035].method722(var3, var4)) {
                    this.method1301();
                    return;
                }
                if (var7.field6077 == -1 && var5 < var10) {
                    this.method1301();
                    return;
                }
                if (var7.field6077 >= 0 && var5 < var8[var7.field6077 + 1].method722(var3, var4)) {
                    this.method1301();
                    return;
                }
            }
            if (var3 >= var6.field5970 && var3 <= var6.field5972 && var4 >= var6.field5975 && var4 <= var6.field5972 && var5 <= var9 && var5 >= var10) {
                var6.field5973.field4561.method2139(true, this);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method722(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method722(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method722(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method722(var3, var4) - 1024) {
                    this.method1301();
                    return;
                }
                class77 var12 = class106.field1405[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class106.field1405[0][var3][var4].field1061 != null;
                    if (var11 == 3 && var13) {
                        this.method1301();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class106.field1405[var14][var3][var4] == null) {
                            var12 = class106.field1405[var14][var3][var4] = new class77(var14, var3, var4);
                            if (var13) {
                                ++var12.field1073;
                            }
                        }
                    }
                }
                if (var12.field1060 == null) {
                    var12.field1060 = new class305();
                    var12.field1085 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field1085) {
                    var12.field1060 = new class305();
                    var12.field1085 = (byte) ((int) (arg0 & 255L));
                }
                var12.field1060.field4561.method2139(true, this);
            }
        } else {
            this.method1301();
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V", line = 535)
    private final void method1299() {
        int var1 = this.field2712.field5119.field5967;
        if (this.field2712.field5119.field5960[var1] != null) {
            this.field2712.field5119.field5960[var1].method1301();
        }
        this.field2712.field5119.field5960[var1] = this;
        this.field2709 = (short) this.field2712.field5119.field5967;
        this.field2712.field5119.field5967 = var1 + 1 & 8191;
        this.field2712.field5111.method50(this, (byte) 106);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lah;IIIIIIIIIIIZ)V", line = 545)
    public final void method1300(class342 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field2712 = arg0;
        super.field1473 = arg1 << class439.field6365;
        super.field1462 = arg2 << class439.field6365;
        super.field1471 = arg3 << class439.field6365;
        super.field1472 = arg9;
        this.field2715 = this.field2711 = (short) arg8;
        super.field1463 = arg10;
        super.field1459 = arg11;
        this.field2714 = (short) arg4;
        this.field2708 = (short) arg5;
        this.field2707 = (short) arg6;
        this.field2710 = arg7;
        super.field1466 = this.field2712.field5100.field3170;
        this.method1299();
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V", line = 563)
    private final void method1301() {
        this.field2712.field5119.field5960[this.field2709] = null;
        class452.field6563[class325.field4816] = this;
        class325.field4816 = class325.field4816 + 1 & 1023;
        this.method2308(-29);
        this.method902((byte) -60);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lah;IIIIIIIIIIIZ)V", line = 569)
    public class196(class342 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field2712 = arg0;
        super.field1473 = arg1 << class439.field6365;
        super.field1462 = arg2 << class439.field6365;
        super.field1471 = arg3 << class439.field6365;
        super.field1472 = arg9;
        this.field2715 = this.field2711 = (short) arg8;
        super.field1463 = arg10;
        super.field1459 = arg11;
        this.field2714 = (short) arg4;
        this.field2708 = (short) arg5;
        this.field2707 = (short) arg6;
        this.field2710 = arg7;
        super.field1466 = this.field2712.field5100.field3170;
        this.method1299();
    }
}
