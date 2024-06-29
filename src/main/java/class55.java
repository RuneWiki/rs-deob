import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class55 extends class479 {

    @OriginalMember(owner = "client!jv", name = "M", descriptor = "Lug;")
    private class392 field853;

    @OriginalMember(owner = "client!jv", name = "N", descriptor = "S")
    private short field854;

    @OriginalMember(owner = "client!jv", name = "J", descriptor = "S")
    private short field850;

    @OriginalMember(owner = "client!jv", name = "K", descriptor = "S")
    private short field851;

    @OriginalMember(owner = "client!jv", name = "D", descriptor = "S")
    private short field848;

    @OriginalMember(owner = "client!jv", name = "P", descriptor = "S")
    private short field856;

    @OriginalMember(owner = "client!jv", name = "O", descriptor = "I")
    private int field855;

    @OriginalMember(owner = "client!jv", name = "L", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!jv", name = "I", descriptor = "S")
    private short field849;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "()V", line = 5)
    private final void method333() {
        int var1 = this.field853.field5900.field2900;
        if (this.field853.field5900.field2907[var1] != null) {
            this.field853.field5900.field2907[var1].method335();
        }
        this.field853.field5900.field2907[var1] = this;
        this.field849 = (short) this.field853.field5900.field2900;
        this.field853.field5900.field2900 = var1 + 1 & 8191;
        this.field853.field5931.method1878(2, this);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lug;IIIIIIIIIIIZZ)V", line = 16)
    public final void method334(class392 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field853 = arg0;
        super.field7041 = arg1 << class189.field2799;
        super.field7030 = arg2 << class189.field2799;
        super.field7031 = arg3 << class189.field2799;
        super.field7039 = arg9;
        this.field850 = this.field854 = (short) arg8;
        super.field7032 = arg10;
        super.field7036 = arg11;
        super.field7035 = arg13;
        this.field851 = (short) arg4;
        this.field848 = (short) arg5;
        this.field856 = (short) arg6;
        this.field855 = arg7;
        super.field7034 = this.field853.field5929.field825;
        this.method333();
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "()V", line = 42)
    private final void method335() {
        this.field853.field5900.field2907[this.field849] = null;
        class70.field1063[class476.field6999] = this;
        class476.field6999 = class476.field6999 + 1 & 1023;
        this.method2289((byte) -55);
        this.method3101(0);
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lug;IIIIIIIIIIIZZ)V", line = 48)
    public class55(class392 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field853 = arg0;
        super.field7041 = arg1 << class189.field2799;
        super.field7030 = arg2 << class189.field2799;
        super.field7031 = arg3 << class189.field2799;
        super.field7039 = arg9;
        this.field850 = this.field854 = (short) arg8;
        super.field7032 = arg10;
        super.field7036 = arg11;
        super.field7035 = arg13;
        this.field851 = (short) arg4;
        this.field848 = (short) arg5;
        this.field856 = (short) arg6;
        this.field855 = arg7;
        super.field7034 = this.field853.field5929.field825;
        this.method333();
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(JI)V", line = 68)
    public final void method336(long arg0, int arg1) {
        this.field854 = (short) (this.field854 - arg1);
        if (this.field854 <= 0) {
            this.method335();
        } else {
            int var4 = super.field7041 >> class189.field2799;
            int var5 = super.field7030 >> class189.field2799;
            int var6 = super.field7031 >> class189.field2799;
            class201 var7 = this.field853.field5900;
            class485 var8 = this.field853.field5933;
            if (var8.field7152 != 0) {
                if (this.field850 - this.field854 <= var8.field7164) {
                    int var9 = var8.field7144 * arg1 + (this.field852 >> 16 & 255) + (super.field7039 >> 8 & 65280);
                    int var10 = var8.field7129 * arg1 + (this.field852 >> 8 & 255) + (super.field7039 & 65280);
                    int var11 = var8.field7166 * arg1 + (super.field7039 << 8 & 65280) + (this.field852 & 255);
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
                    super.field7039 &= -16777216;
                    super.field7039 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field852 &= -16777216;
                    this.field852 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field850 - this.field854 <= var8.field7175) {
                    int var12 = var8.field7123 * arg1 + (this.field852 >> 24 & 255) + (super.field7039 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field7039 &= 16777215;
                    super.field7039 |= (var12 & 65280) << 16;
                    this.field852 &= 16777215;
                    this.field852 |= (var12 & 255) << 24;
                }
            }
            if (var8.field7143 != -1 && this.field850 - this.field854 <= var8.field7168) {
                this.field855 += var8.field7170 * arg1;
            }
            if (var8.field7156 != -1 && this.field850 - this.field854 <= var8.field7121) {
                super.field7032 += var8.field7128 * arg1;
            }
            int var13 = this.field851;
            int var14 = this.field848;
            int var15 = this.field856;
            boolean var16 = false;
            if (var8.field7158 == 1) {
                int var17 = var4 - this.field853.field5907;
                int var18 = var5 - this.field853.field5932;
                int var19 = var6 - this.field853.field5927;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field7113 * var20 * arg1);
                this.field855 = (int) ((long) this.field855 - ((long) this.field855 * var21 >> 18));
            } else if (var8.field7158 == 2) {
                int var23 = var4 - this.field853.field5907;
                int var24 = var5 - this.field853.field5932;
                int var25 = var6 - this.field853.field5927;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field7113 * var26 * arg1);
                this.field855 = (int) ((long) this.field855 - ((long) this.field855 * var27 >> 28));
            }
            if (var8.field7167 != null) {
                class337 var29 = var7.field2909.field1879;
                for (class337 var30 = var29.field4737; var29 != var30; var30 = var30.field4737) {
                    class476 var31 = (class476) var30;
                    class299 var32 = var31.field7000;
                    if (var32.field4239 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field7167.length; ++var34) {
                            if (var8.field7167[var34] == var32.field4255) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field6996;
                            int var36 = var5 - var31.field7001;
                            int var37 = var6 - var31.field7002;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4236) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field7006 * var37 + var31.field7005 * var35 + var32.field4246 * var36) * 65535L / (long) (var32.field4235 * var40);
                                if (var41 >= (long) var32.field4242) {
                                    int var43 = 0;
                                    if (var32.field4248 == 1) {
                                        var43 = (var40 >> 4) * var32.field4254;
                                    } else if (var32.field4248 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4254;
                                    }
                                    if (var32.field4240 == 0) {
                                        if (var32.field4241 == 0) {
                                            var13 += (var31.field7005 - var43) * arg1;
                                            var14 += (var32.field4246 - var43) * arg1;
                                            var15 += (var31.field7006 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field7041 += (var31.field7005 - var43) * arg1;
                                            super.field7030 += (var32.field4246 - var43) * arg1;
                                            super.field7031 += (var31.field7006 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4235;
                                        int var45 = (var36 << 15) / var40 * var32.field4235;
                                        int var46 = (var37 << 15) / var40 * var32.field4235;
                                        if (var32.field4241 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field7041 += arg1 * var44 >> 15;
                                            super.field7030 += arg1 * var45 >> 15;
                                            super.field7031 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field7180 != null) {
                for (int var47 = 0; var47 < var8.field7180.length; ++var47) {
                    class476 var48 = (class476) class320.field4578.method82((long) var8.field7180[var47], 127);
                    while (var48 != null) {
                        class299 var49 = var48.field7000;
                        int var50 = var4 - var48.field6996;
                        int var51 = var5 - var48.field7001;
                        int var52 = var6 - var48.field7002;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4236) {
                            var48 = (class476) class320.field4578.method80((byte) -14);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field7006 * var52 + var48.field7005 * var50 + var49.field4246 * var51) * 65535L / (long) (var49.field4235 * var55);
                            if (var56 < (long) var49.field4242) {
                                var48 = (class476) class320.field4578.method80((byte) -14);
                            } else {
                                int var58 = 0;
                                if (var49.field4248 == 1) {
                                    var58 = (var55 >> 4) * var49.field4254;
                                } else if (var49.field4248 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4254;
                                }
                                if (var49.field4240 == 0) {
                                    if (var49.field4241 == 0) {
                                        var13 += (var48.field7005 - var58) * arg1;
                                        var14 += (var49.field4246 - var58) * arg1;
                                        var15 += (var48.field7006 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field7041 += (var48.field7005 - var58) * arg1;
                                        super.field7030 += (var49.field4246 - var58) * arg1;
                                        super.field7031 += (var48.field7006 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4235;
                                    int var60 = (var51 << 15) / var55 * var49.field4235;
                                    int var61 = (var52 << 15) / var55 * var49.field4235;
                                    if (var49.field4241 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field7041 += arg1 * var59 >> 15;
                                        super.field7030 += arg1 * var60 >> 15;
                                        super.field7031 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class476) class320.field4578.method80((byte) -14);
                            }
                        }
                    }
                }
            }
            if (var8.field7119 != null) {
                if (var8.field7114 == null) {
                    var8.field7114 = new int[var8.field7119.length];
                    for (int var62 = 0; var62 < var8.field7119.length; ++var62) {
                        class335.method2045(true, var8.field7119[var62]);
                        var8.field7114[var62] = ((class427) class447.field6664.method2605(false, (long) var8.field7119[var62])).field6402;
                    }
                }
                for (int var63 = 0; var63 < var8.field7114.length; ++var63) {
                    class299 var64 = class219.field3222[var8.field7114[var63]];
                    if (var64.field4241 == 0) {
                        var13 += var64.field4249 * arg1;
                        var14 += var64.field4246 * arg1;
                        var15 += var64.field4251 * arg1;
                        var16 = true;
                    } else {
                        super.field7041 += var64.field4249 * arg1;
                        super.field7030 += var64.field4246 * arg1;
                        super.field7031 += var64.field4251 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field851 = (short) var13;
                        this.field848 = (short) var14;
                        this.field856 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field855 <<= 1;
                }
            }
            super.field7041 = (int) ((long) super.field7041 + ((long) this.field851 * (long) this.field855 >> 23) * (long) arg1);
            super.field7030 = (int) ((long) super.field7030 + ((long) this.field848 * (long) this.field855 >> 23) * (long) arg1);
            super.field7031 = (int) ((long) super.field7031 + ((long) this.field856 * (long) this.field855 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(J)V", line = 463)
    public final void method337(long arg0) {
        int var3 = super.field7041 >> class192.field2815 + 12;
        int var4 = super.field7031 >> class192.field2815 + 12;
        int var5 = super.field7030 >> class189.field2799;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class361.field5554 && var4 >= 0 && var4 < class484.field7096) {
            class201 var6 = this.field853.field5900;
            class485 var7 = this.field853.field5933;
            class35[] var8 = class86.field1324;
            int var9 = var8[var6.field2916].method201(var3, var4);
            int var10;
            if (var6.field2916 < class208.field2979 - 1) {
                var10 = var8[var6.field2916 + 1].method201(var3, var4);
            } else {
                var10 = var9 - (8 << class192.field2815);
            }
            if (var7.field7125) {
                if (var7.field7174 == -1 && var5 > var9) {
                    this.method335();
                    return;
                }
                if (var7.field7174 >= 0 && var5 > var8[var7.field7174].method201(var3, var4)) {
                    this.method335();
                    return;
                }
                if (var7.field7169 == -1 && var5 < var10) {
                    this.method335();
                    return;
                }
                if (var7.field7169 >= 0 && var5 < var8[var7.field7169 + 1].method201(var3, var4)) {
                    this.method335();
                    return;
                }
            }
            if (var3 >= var6.field2914 && var3 <= var6.field2917 && var4 >= var6.field2912 && var4 <= var6.field2918 && var5 <= var9 && var5 >= var10) {
                var6.field2913.field5869.method1476(this, true);
            } else {
                int var11;
                for (var11 = class208.field2979 - 1; var11 > 0 && var5 > var8[var11].method201(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method201(var3, var4)) {
                    this.method335();
                } else if (class208.field2979 - 1 == var11 && var8[var11].method201(var3, var4) - var5 > 8 << class192.field2815) {
                    this.method335();
                } else {
                    class518 var12 = class108.field1553[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class108.field1553[0][var3][var4] = new class518(0, var3, var4);
                        }
                        boolean var13 = class108.field1553[0][var3][var4].field7571 != null;
                        if (var11 == 3 && var13) {
                            this.method335();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class108.field1553[var14][var3][var4] == null) {
                                var12 = class108.field1553[var14][var3][var4] = new class518(var14, var3, var4);
                                if (var13) {
                                    ++var12.field7553;
                                }
                            }
                        }
                    }
                    if (var12.field7564 == null) {
                        var12.field7564 = new class389();
                        var12.field7562 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field7562) {
                        var12.field7564.field5869.method1474(26159);
                        var12.field7564.field5873 = false;
                        var12.field7562 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field7564.field5869.method1476(this, true);
                }
            }
        } else {
            this.method335();
        }
    }
}
