import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class11 extends class456 {

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "Lvo;")
    private class32 field147;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "S")
    private short field146;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "S")
    private short field152;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "S")
    private short field151;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "S")
    private short field145;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "S")
    private short field148;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "S")
    private short field149;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()V", line = 4)
    private final void method73() {
        this.field147.field339.field5246[this.field149] = null;
        class32.field379[class483.field6951] = this;
        class483.field6951 = class483.field6951 + 1 & 1023;
        this.method526((byte) 87);
        this.method3008(127);
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()V", line = 13)
    private final void method74() {
        int var1 = this.field147.field339.field5245;
        if (this.field147.field339.field5246[var1] != null) {
            this.field147.field339.field5246[var1].method73();
        }
        this.field147.field339.field5246[var1] = this;
        this.field149 = (short) this.field147.field339.field5245;
        this.field147.field339.field5245 = var1 + 1 & 8191;
        this.field147.field349.method1957(-84, this);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(JI)V", line = 26)
    public final void method75(long arg0, int arg1) {
        this.field146 = (short) (this.field146 - arg1);
        if (this.field146 <= 0) {
            this.method73();
        } else {
            int var4 = super.field6631 >> class440.field6455;
            int var5 = super.field6633 >> class440.field6455;
            int var6 = super.field6640 >> class440.field6455;
            class354 var7 = this.field147.field339;
            class184 var8 = this.field147.field346;
            if (var8.field2768 != 0) {
                if (this.field152 - this.field146 <= var8.field2746) {
                    int var9 = var8.field2735 * arg1 + (super.field6641 >> 8 & 65280) + (this.field144 >> 16 & 255);
                    int var10 = var8.field2791 * arg1 + (this.field144 >> 8 & 255) + (super.field6641 & 65280);
                    int var11 = var8.field2747 * arg1 + (super.field6641 << 8 & 65280) + (this.field144 & 255);
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
                    super.field6641 &= -16777216;
                    super.field6641 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field144 &= -16777216;
                    this.field144 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field152 - this.field146 <= var8.field2794) {
                    int var12 = var8.field2776 * arg1 + (super.field6641 >> 16 & 65280) + (this.field144 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6641 &= 16777215;
                    super.field6641 |= (var12 & 65280) << 16;
                    this.field144 &= 16777215;
                    this.field144 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2799 != -1 && this.field152 - this.field146 <= var8.field2766) {
                this.field150 += var8.field2742 * arg1;
            }
            if (var8.field2774 != -1 && this.field152 - this.field146 <= var8.field2778) {
                super.field6632 += var8.field2737 * arg1;
            }
            int var13 = this.field151;
            int var14 = this.field145;
            int var15 = this.field148;
            boolean var16 = false;
            if (var8.field2751 == 1) {
                int var17 = var4 - this.field147.field362;
                int var18 = var5 - this.field147.field361;
                int var19 = var6 - this.field147.field354;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2771 * var20 * arg1);
                this.field150 = (int) ((long) this.field150 - ((long) this.field150 * var21 >> 18));
            } else if (var8.field2751 == 2) {
                int var23 = var4 - this.field147.field362;
                int var24 = var5 - this.field147.field361;
                int var25 = var6 - this.field147.field354;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2771 * var26 * arg1);
                this.field150 = (int) ((long) this.field150 - ((long) this.field150 * var27 >> 28));
            }
            if (var8.field2796 != null) {
                class431 var29 = var7.field5248.field2077;
                for (class431 var30 = var29.field6384; var29 != var30; var30 = var30.field6384) {
                    class73 var31 = (class73) var30;
                    class273 var32 = var31.field1042;
                    if (var32.field4178 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2796.length; ++var34) {
                            if (var8.field2796[var34] == var32.field4185) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field1044;
                            int var36 = var5 - var31.field1041;
                            int var37 = var6 - var31.field1034;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field4167) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field1037 * var37 + var31.field1032 * var35 + var32.field4172 * var36) * 65535L / (long) (var32.field4171 * var40);
                                if (var41 >= (long) var32.field4174) {
                                    int var43 = 0;
                                    if (var32.field4184 == 1) {
                                        var43 = (var40 >> 4) * var32.field4168;
                                    } else if (var32.field4184 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field4168;
                                    }
                                    if (var32.field4182 == 0) {
                                        if (var32.field4169 == 0) {
                                            var13 += (var31.field1032 - var43) * arg1;
                                            var14 += (var32.field4172 - var43) * arg1;
                                            var15 += (var31.field1037 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6631 += (var31.field1032 - var43) * arg1;
                                            super.field6633 += (var32.field4172 - var43) * arg1;
                                            super.field6640 += (var31.field1037 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field4171;
                                        int var45 = (var36 << 15) / var40 * var32.field4171;
                                        int var46 = (var37 << 15) / var40 * var32.field4171;
                                        if (var32.field4169 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6631 += arg1 * var44 >> 15;
                                            super.field6633 += arg1 * var45 >> 15;
                                            super.field6640 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2781 != null) {
                for (int var47 = 0; var47 < var8.field2781.length; ++var47) {
                    class73 var48 = (class73) class132.field2021.method821(-3, (long) var8.field2781[var47]);
                    while (var48 != null) {
                        class273 var49 = var48.field1042;
                        int var50 = var4 - var48.field1044;
                        int var51 = var5 - var48.field1041;
                        int var52 = var6 - var48.field1034;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field4167) {
                            var48 = (class73) class132.field2021.method824((byte) 117);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field1037 * var52 + var48.field1032 * var50 + var49.field4172 * var51) * 65535L / (long) (var49.field4171 * var55);
                            if (var56 < (long) var49.field4174) {
                                var48 = (class73) class132.field2021.method824((byte) 106);
                            } else {
                                int var58 = 0;
                                if (var49.field4184 == 1) {
                                    var58 = (var55 >> 4) * var49.field4168;
                                } else if (var49.field4184 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field4168;
                                }
                                if (var49.field4182 == 0) {
                                    if (var49.field4169 == 0) {
                                        var13 += (var48.field1032 - var58) * arg1;
                                        var14 += (var49.field4172 - var58) * arg1;
                                        var15 += (var48.field1037 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6631 += (var48.field1032 - var58) * arg1;
                                        super.field6633 += (var49.field4172 - var58) * arg1;
                                        super.field6640 += (var48.field1037 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field4171;
                                    int var60 = (var51 << 15) / var55 * var49.field4171;
                                    int var61 = (var52 << 15) / var55 * var49.field4171;
                                    if (var49.field4169 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6631 += arg1 * var59 >> 15;
                                        super.field6633 += arg1 * var60 >> 15;
                                        super.field6640 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class73) class132.field2021.method824((byte) 114);
                            }
                        }
                    }
                }
            }
            if (var8.field2767 != null) {
                if (var8.field2780 == null) {
                    var8.field2780 = new int[var8.field2767.length];
                    for (int var62 = 0; var62 < var8.field2767.length; ++var62) {
                        class433.method2689((byte) -125, var8.field2767[var62]);
                        var8.field2780[var62] = ((class308) class338.field5039.method2585((byte) 114, (long) var8.field2767[var62])).field4638;
                    }
                }
                for (int var63 = 0; var63 < var8.field2780.length; ++var63) {
                    class273 var64 = class232.field3751[var8.field2780[var63]];
                    if (var64.field4169 == 0) {
                        var13 += var64.field4177 * arg1;
                        var14 += var64.field4172 * arg1;
                        var15 += var64.field4179 * arg1;
                        var16 = true;
                    } else {
                        super.field6631 += var64.field4177 * arg1;
                        super.field6633 += var64.field4172 * arg1;
                        super.field6640 += var64.field4179 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field151 = (short) var13;
                        this.field145 = (short) var14;
                        this.field148 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field150 <<= 1;
                }
            }
            super.field6631 = (int) ((long) super.field6631 + ((long) this.field151 * (long) this.field150 >> 23) * (long) arg1);
            super.field6633 = (int) ((long) super.field6633 + ((long) this.field145 * (long) this.field150 >> 23) * (long) arg1);
            super.field6640 = (int) ((long) super.field6640 + ((long) this.field148 * (long) this.field150 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(J)V", line = 421)
    public final void method76(long arg0) {
        int var3 = super.field6631 >> class163.field2415 + 12;
        int var4 = super.field6640 >> class163.field2415 + 12;
        int var5 = super.field6633 >> class440.field6455;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class497.field7147 && var4 >= 0 && var4 < class385.field5799) {
            class354 var6 = this.field147.field339;
            class184 var7 = this.field147.field346;
            class145[] var8 = class491.field7059;
            int var9 = var8[var6.field5254].method411(var3, var4);
            int var10;
            if (var6.field5254 < class213.field3467 - 1) {
                var10 = var8[var6.field5254 + 1].method411(var3, var4);
            } else {
                var10 = var9 - (8 << class163.field2415);
            }
            if (var7.field2738) {
                if (var7.field2779 == -1 && var5 > var9) {
                    this.method73();
                    return;
                }
                if (var7.field2779 >= 0 && var5 > var8[var7.field2779].method411(var3, var4)) {
                    this.method73();
                    return;
                }
                if (var7.field2775 == -1 && var5 < var10) {
                    this.method73();
                    return;
                }
                if (var7.field2775 >= 0 && var5 < var8[var7.field2775 + 1].method411(var3, var4)) {
                    this.method73();
                    return;
                }
            }
            if (var3 >= var6.field5249 && var3 <= var6.field5250 && var4 >= var6.field5255 && var4 <= var6.field5253 && var5 <= var9 && var5 >= var10) {
                var6.field5252.field5066.method2711(true, this);
            } else {
                int var11;
                for (var11 = class213.field3467 - 1; var11 > 0 && var5 > var8[var11].method411(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method411(var3, var4)) {
                    this.method73();
                } else if (class213.field3467 - 1 == var11 && var8[var11].method411(var3, var4) - var5 > 8 << class163.field2415) {
                    this.method73();
                } else {
                    class138 var12 = client.field3311[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = client.field3311[0][var3][var4] = new class138(0, var3, var4);
                        }
                        boolean var13 = client.field3311[0][var3][var4].field2101 != null;
                        if (var11 == 3 && var13) {
                            this.method73();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (client.field3311[var14][var3][var4] == null) {
                                var12 = client.field3311[var14][var3][var4] = new class138(var14, var3, var4);
                                if (var13) {
                                    ++var12.field2119;
                                }
                            }
                        }
                    }
                    if (var12.field2110 == null) {
                        var12.field2110 = new class341();
                        var12.field2116 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field2116) {
                        var12.field2110.field5066.method2708(0);
                        var12.field2110.field5075 = false;
                        var12.field2116 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field2110.field5066.method2711(true, this);
                }
            }
        } else {
            this.method73();
        }
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lvo;IIIIIIIIIIIZZ)V", line = 552)
    public class11(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field147 = arg0;
        super.field6631 = arg1 << class440.field6455;
        super.field6633 = arg2 << class440.field6455;
        super.field6640 = arg3 << class440.field6455;
        super.field6641 = arg9;
        this.field152 = this.field146 = (short) arg8;
        super.field6632 = arg10;
        super.field6638 = arg11;
        super.field6635 = arg13;
        this.field151 = (short) arg4;
        this.field145 = (short) arg5;
        this.field148 = (short) arg6;
        this.field150 = arg7;
        super.field6634 = this.field147.field350.field4023;
        this.method74();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lvo;IIIIIIIIIIIZZ)V", line = 572)
    public final void method77(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field147 = arg0;
        super.field6631 = arg1 << class440.field6455;
        super.field6633 = arg2 << class440.field6455;
        super.field6640 = arg3 << class440.field6455;
        super.field6641 = arg9;
        this.field152 = this.field146 = (short) arg8;
        super.field6632 = arg10;
        super.field6638 = arg11;
        super.field6635 = arg13;
        this.field151 = (short) arg4;
        this.field145 = (short) arg5;
        this.field148 = (short) arg6;
        this.field150 = arg7;
        super.field6634 = this.field147.field350.field4023;
        this.method74();
    }
}
