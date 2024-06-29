import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class310 extends class383 {

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "Lrc;")
    private class100 field4208;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "S")
    private short field4206;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "S")
    private short field4209;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "S")
    private short field4205;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "S")
    private short field4201;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "S")
    private short field4203;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    private int field4204;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field4202;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "S")
    private short field4207;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(JI)V", line = 7)
    public final void method1985(long arg0, int arg1) {
        this.field4206 = (short) (this.field4206 - arg1);
        if (this.field4206 <= 0) {
            this.method1989();
        } else {
            int var4 = super.field5371 >> class210.field2931;
            int var5 = super.field5367 >> class210.field2931;
            int var6 = super.field5365 >> class210.field2931;
            class48 var7 = this.field4208.field1453;
            class370 var8 = this.field4208.field1480;
            if (var8.field5091 != 0) {
                if (this.field4209 - this.field4206 <= var8.field5122) {
                    int var9 = var8.field5120 * arg1 + (super.field5376 >> 8 & 65280) + (this.field4202 >> 16 & 255);
                    int var10 = var8.field5072 * arg1 + (this.field4202 >> 8 & 255) + (super.field5376 & 65280);
                    int var11 = var8.field5117 * arg1 + (super.field5376 << 8 & 65280) + (this.field4202 & 255);
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
                    super.field5376 &= -16777216;
                    super.field5376 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field4202 &= -16777216;
                    this.field4202 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field4209 - this.field4206 <= var8.field5111) {
                    int var12 = var8.field5103 * arg1 + (super.field5376 >> 16 & 65280) + (this.field4202 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5376 &= 16777215;
                    super.field5376 |= (var12 & 65280) << 16;
                    this.field4202 &= 16777215;
                    this.field4202 |= (var12 & 255) << 24;
                }
            }
            if (var8.field5119 != -1 && this.field4209 - this.field4206 <= var8.field5082) {
                this.field4204 += var8.field5066 * arg1;
            }
            if (var8.field5128 != -1 && this.field4209 - this.field4206 <= var8.field5102) {
                super.field5372 += var8.field5071 * arg1;
            }
            int var13 = this.field4205;
            int var14 = this.field4201;
            int var15 = this.field4203;
            boolean var16 = false;
            if (var8.field5089 == 1) {
                int var17 = var4 - this.field4208.field1447;
                int var18 = var5 - this.field4208.field1451;
                int var19 = var6 - this.field4208.field1449;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field5113 * var20 * arg1);
                this.field4204 = (int) ((long) this.field4204 - ((long) this.field4204 * var21 >> 18));
            } else if (var8.field5089 == 2) {
                int var23 = var4 - this.field4208.field1447;
                int var24 = var5 - this.field4208.field1451;
                int var25 = var6 - this.field4208.field1449;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field5113 * var26 * arg1);
                this.field4204 = (int) ((long) this.field4204 - ((long) this.field4204 * var27 >> 28));
            }
            if (var8.field5114 != null) {
                class381 var29 = var7.field820.field2454;
                for (class381 var30 = var29.field5346; var29 != var30; var30 = var30.field5346) {
                    class249 var31 = (class249) var30;
                    class275 var32 = var31.field3404;
                    if (var32.field3699 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field5114.length; ++var34) {
                            if (var8.field5114[var34] == var32.field3687) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field3411;
                            int var36 = var5 - var31.field3416;
                            int var37 = var6 - var31.field3413;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3693) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field3408 * var37 + var31.field3407 * var35 + var32.field3704 * var36) * 65535L / (long) (var32.field3705 * var40);
                                if (var41 >= (long) var32.field3688) {
                                    int var43 = 0;
                                    if (var32.field3686 == 1) {
                                        var43 = (var40 >> 4) * var32.field3689;
                                    } else if (var32.field3686 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3689;
                                    }
                                    if (var32.field3694 == 0) {
                                        if (var32.field3695 == 0) {
                                            var13 += (var31.field3407 - var43) * arg1;
                                            var14 += (var32.field3704 - var43) * arg1;
                                            var15 += (var31.field3408 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5371 += (var31.field3407 - var43) * arg1;
                                            super.field5367 += (var32.field3704 - var43) * arg1;
                                            super.field5365 += (var31.field3408 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3705;
                                        int var45 = (var36 << 15) / var40 * var32.field3705;
                                        int var46 = (var37 << 15) / var40 * var32.field3705;
                                        if (var32.field3695 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5371 += arg1 * var44 >> 15;
                                            super.field5367 += arg1 * var45 >> 15;
                                            super.field5365 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field5065 != null) {
                for (int var47 = 0; var47 < var8.field5065.length; ++var47) {
                    class249 var48 = (class249) class153.field2332.method972(false, (long) var8.field5065[var47]);
                    while (var48 != null) {
                        class275 var49 = var48.field3404;
                        int var50 = var4 - var48.field3411;
                        int var51 = var5 - var48.field3416;
                        int var52 = var6 - var48.field3413;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3693) {
                            var48 = (class249) class153.field2332.method966((byte) -44);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field3408 * var52 + var48.field3407 * var50 + var49.field3704 * var51) * 65535L / (long) (var49.field3705 * var55);
                            if (var56 < (long) var49.field3688) {
                                var48 = (class249) class153.field2332.method966((byte) -94);
                            } else {
                                int var58 = 0;
                                if (var49.field3686 == 1) {
                                    var58 = (var55 >> 4) * var49.field3689;
                                } else if (var49.field3686 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3689;
                                }
                                if (var49.field3694 == 0) {
                                    if (var49.field3695 == 0) {
                                        var13 += (var48.field3407 - var58) * arg1;
                                        var14 += (var49.field3704 - var58) * arg1;
                                        var15 += (var48.field3408 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5371 += (var48.field3407 - var58) * arg1;
                                        super.field5367 += (var49.field3704 - var58) * arg1;
                                        super.field5365 += (var48.field3408 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3705;
                                    int var60 = (var51 << 15) / var55 * var49.field3705;
                                    int var61 = (var52 << 15) / var55 * var49.field3705;
                                    if (var49.field3695 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5371 += arg1 * var59 >> 15;
                                        super.field5367 += arg1 * var60 >> 15;
                                        super.field5365 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class249) class153.field2332.method966((byte) -112);
                            }
                        }
                    }
                }
            }
            if (var8.field5115 != null) {
                if (var8.field5077 == null) {
                    var8.field5077 = new int[var8.field5115.length];
                    for (int var62 = 0; var62 < var8.field5115.length; ++var62) {
                        class23.method288(5, var8.field5115[var62]);
                        var8.field5077[var62] = ((class193) class88.field1303.method614(-96, (long) var8.field5115[var62])).field2776;
                    }
                }
                for (int var63 = 0; var63 < var8.field5077.length; ++var63) {
                    class275 var64 = class91.field1348[var8.field5077[var63]];
                    if (var64.field3695 == 0) {
                        var13 += var64.field3684 * arg1;
                        var14 += var64.field3704 * arg1;
                        var15 += var64.field3691 * arg1;
                        var16 = true;
                    } else {
                        super.field5371 += var64.field3684 * arg1;
                        super.field5367 += var64.field3704 * arg1;
                        super.field5365 += var64.field3691 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field4205 = (short) var13;
                        this.field4201 = (short) var14;
                        this.field4203 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field4204 <<= 1;
                }
            }
            super.field5371 = (int) ((long) super.field5371 + ((long) this.field4205 * (long) this.field4204 >> 23) * (long) arg1);
            super.field5367 = (int) ((long) super.field5367 + ((long) this.field4201 * (long) this.field4204 >> 23) * (long) arg1);
            super.field5365 = (int) ((long) super.field5365 + ((long) this.field4203 * (long) this.field4204 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "()V", line = 402)
    private final void method1986() {
        int var1 = this.field4208.field1453.field814;
        if (this.field4208.field1453.field811[var1] != null) {
            this.field4208.field1453.field811[var1].method1989();
        }
        this.field4208.field1453.field811[var1] = this;
        this.field4207 = (short) this.field4208.field1453.field814;
        this.field4208.field1453.field814 = var1 + 1 & 8191;
        this.field4208.field1462.method901(false, this);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lrc;IIIIIIIIIIIZ)V", line = 412)
    public final void method1987(class100 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4208 = arg0;
        super.field5371 = arg1 << class210.field2931;
        super.field5367 = arg2 << class210.field2931;
        super.field5365 = arg3 << class210.field2931;
        super.field5376 = arg9;
        this.field4209 = this.field4206 = (short) arg8;
        super.field5372 = arg10;
        super.field5368 = arg11;
        this.field4205 = (short) arg4;
        this.field4201 = (short) arg5;
        this.field4203 = (short) arg6;
        this.field4204 = arg7;
        super.field5370 = this.field4208.field1463.field3146;
        this.method1986();
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(J)V", line = 436)
    public final void method1988(long arg0) {
        int var3 = super.field5371 >> 19;
        int var4 = super.field5365 >> 19;
        int var5 = super.field5367 >> class210.field2931;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class368.field5054 && var4 >= 0 && var4 < class16.field190) {
            class48 var6 = this.field4208.field1453;
            class370 var7 = this.field4208.field1480;
            class411[] var8 = class91.field1351;
            int var9 = var8[var6.field827].method1509(var3, var4);
            int var10;
            if (var6.field827 < 3) {
                var10 = var8[var6.field827 + 1].method1509(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field5078) {
                if (var7.field5067 == -1 && var5 > var9) {
                    this.method1989();
                    return;
                }
                if (var7.field5067 >= 0 && var5 > var8[var7.field5067].method1509(var3, var4)) {
                    this.method1989();
                    return;
                }
                if (var7.field5108 == -1 && var5 < var10) {
                    this.method1989();
                    return;
                }
                if (var7.field5108 >= 0 && var5 < var8[var7.field5108 + 1].method1509(var3, var4)) {
                    this.method1989();
                    return;
                }
            }
            if (var3 >= var6.field825 && var3 <= var6.field823 && var4 >= var6.field824 && var4 <= var6.field823 && var5 <= var9 && var5 >= var10) {
                var6.field826.field5256.method1683(this, -17086);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method1509(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method1509(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method1509(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method1509(var3, var4) - 1024) {
                    this.method1989();
                    return;
                }
                class224 var12 = class118.field1653[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class118.field1653[0][var3][var4].field3114 != null;
                    if (var11 == 3 && var13) {
                        this.method1989();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class118.field1653[var14][var3][var4] == null) {
                            var12 = class118.field1653[var14][var3][var4] = new class224(var14, var3, var4);
                            if (var13) {
                                ++var12.field3107;
                            }
                        }
                    }
                }
                if (var12.field3113 == null) {
                    var12.field3113 = new class374();
                    var12.field3126 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field3126) {
                    var12.field3113 = new class374();
                    var12.field3126 = (byte) ((int) (arg0 & 255L));
                }
                var12.field3113.field5256.method1683(this, -17086);
            }
        } else {
            this.method1989();
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "()V", line = 563)
    private final void method1989() {
        this.field4208.field1453.field811[this.field4207] = null;
        class356.field4845[class257.field3471] = this;
        class257.field3471 = class257.field3471 + 1 & 1023;
        this.method328(-89);
        this.method2601(7);
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lrc;IIIIIIIIIIIZ)V", line = 569)
    public class310(class100 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field4208 = arg0;
        super.field5371 = arg1 << class210.field2931;
        super.field5367 = arg2 << class210.field2931;
        super.field5365 = arg3 << class210.field2931;
        super.field5376 = arg9;
        this.field4209 = this.field4206 = (short) arg8;
        super.field5372 = arg10;
        super.field5368 = arg11;
        this.field4205 = (short) arg4;
        this.field4201 = (short) arg5;
        this.field4203 = (short) arg6;
        this.field4204 = arg7;
        super.field5370 = this.field4208.field1463.field3146;
        this.method1986();
    }
}
