import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class187 extends class151 {

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "Lms;")
    private class530 field2590;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "S")
    private short field2597;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "S")
    private short field2593;

    @OriginalMember(owner = "client!uu", name = "F", descriptor = "S")
    private short field2591;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "S")
    private short field2596;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "S")
    private short field2592;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    private int field2595;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    private int field2594;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "S")
    private short field2598;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "()V")
    private final void method1120() {
        this.field2590.field7784.field2921[this.field2598] = null;
        class331.field4509[class141.field2013] = this;
        class141.field2013 = class141.field2013 + 1 & 1023;
        this.method2645(124);
        this.method587((byte) 73);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(J)V")
    public final void method1121(long arg0) {
        int var3 = super.field2117 >> class34.field484 + 12;
        int var4 = super.field2125 >> class34.field484 + 12;
        int var5 = super.field2120 >> class45.field631;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class469.field6860 && var4 >= 0 && var4 < class472.field6900) {
            class206 var6 = this.field2590.field7784;
            class153 var7 = this.field2590.field7806;
            class35[] var8 = class383.field5391;
            int var9 = var8[var6.field2931].method221(var3, var4);
            int var10;
            if (var6.field2931 < class401.field5574 - 1) {
                var10 = var8[var6.field2931 + 1].method221(var3, var4);
            } else {
                var10 = var9 - (8 << class34.field484);
            }
            if (var7.field2199) {
                if (var7.field2141 == -1 && var5 > var9) {
                    this.method1120();
                    return;
                }
                if (var7.field2141 >= 0 && var5 > var8[var7.field2141].method221(var3, var4)) {
                    this.method1120();
                    return;
                }
                if (var7.field2190 == -1 && var5 < var10) {
                    this.method1120();
                    return;
                }
                if (var7.field2190 >= 0 && var5 < var8[var7.field2190 + 1].method221(var3, var4)) {
                    this.method1120();
                    return;
                }
            }
            if (var3 >= var6.field2925 && var3 <= var6.field2930 && var4 >= var6.field2924 && var4 <= var6.field2927 && var5 <= var9 && var5 >= var10) {
                var6.field2928.field2090.method1036(this, 48);
            } else {
                int var11;
                for (var11 = class401.field5574 - 1; var11 > 0 && var5 > var8[var11].method221(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method221(var3, var4)) {
                    this.method1120();
                } else if (class401.field5574 - 1 == var11 && var8[var11].method221(var3, var4) - var5 > 8 << class34.field484) {
                    this.method1120();
                } else {
                    class61 var12 = class385.field5410[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class385.field5410[0][var3][var4] = new class61(0, var3, var4);
                        }
                        boolean var13 = class385.field5410[0][var3][var4].field834 != null;
                        if (var11 == 3 && var13) {
                            this.method1120();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class385.field5410[var14][var3][var4] == null) {
                                var12 = class385.field5410[var14][var3][var4] = new class61(var14, var3, var4);
                                if (var13) {
                                    ++var12.field836;
                                }
                            }
                        }
                    }
                    if (var12.field821 == null) {
                        var12.field821 = new class148();
                        var12.field818 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field818) {
                        var12.field821.field2090.method1033((byte) -42);
                        var12.field821.field2093 = false;
                        var12.field818 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field821.field2090.method1036(this, 48);
                }
            }
        } else {
            this.method1120();
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "()V")
    private final void method1122() {
        int var1 = this.field2590.field7784.field2918;
        if (this.field2590.field7784.field2921[var1] != null) {
            this.field2590.field7784.field2921[var1].method1120();
        }
        this.field2590.field7784.field2921[var1] = this;
        this.field2598 = (short) this.field2590.field7784.field2918;
        this.field2590.field7784.field2918 = var1 + 1 & 8191;
        this.field2590.field7798.method2310(this, -21801);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lms;IIIIIIIIIIIZZ)V")
    public final void method1123(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2590 = arg0;
        super.field2117 = arg1 << class45.field631;
        super.field2120 = arg2 << class45.field631;
        super.field2125 = arg3 << class45.field631;
        super.field2121 = arg9;
        this.field2593 = this.field2597 = (short) arg8;
        super.field2128 = arg10;
        super.field2122 = arg11;
        super.field2123 = arg13;
        this.field2591 = (short) arg4;
        this.field2596 = (short) arg5;
        this.field2592 = (short) arg6;
        this.field2595 = arg7;
        super.field2118 = this.field2590.field7803.field4167;
        this.method1122();
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(JI)V")
    public final void method1124(long arg0, int arg1) {
        this.field2597 = (short) (this.field2597 - arg1);
        if (this.field2597 <= 0) {
            this.method1120();
        } else {
            int var4 = super.field2117 >> class45.field631;
            int var5 = super.field2120 >> class45.field631;
            int var6 = super.field2125 >> class45.field631;
            class206 var7 = this.field2590.field7784;
            class153 var8 = this.field2590.field7806;
            if (var8.field2156 != 0) {
                if (this.field2593 - this.field2597 <= var8.field2176) {
                    int var9 = var8.field2193 * arg1 + (this.field2594 >> 16 & 255) + (super.field2121 >> 8 & 65280);
                    int var10 = var8.field2151 * arg1 + (this.field2594 >> 8 & 255) + (super.field2121 & 65280);
                    int var11 = var8.field2201 * arg1 + (super.field2121 << 8 & 65280) + (this.field2594 & 255);
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
                    super.field2121 &= -16777216;
                    super.field2121 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field2594 &= -16777216;
                    this.field2594 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field2593 - this.field2597 <= var8.field2181) {
                    int var12 = var8.field2191 * arg1 + (this.field2594 >> 24 & 255) + (super.field2121 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field2121 &= 16777215;
                    super.field2121 |= (var12 & 65280) << 16;
                    this.field2594 &= 16777215;
                    this.field2594 |= (var12 & 255) << 24;
                }
            }
            if (var8.field2192 != -1 && this.field2593 - this.field2597 <= var8.field2146) {
                this.field2595 += var8.field2162 * arg1;
            }
            if (var8.field2187 != -1 && this.field2593 - this.field2597 <= var8.field2171) {
                super.field2128 += var8.field2180 * arg1;
            }
            int var13 = this.field2591;
            int var14 = this.field2596;
            int var15 = this.field2592;
            boolean var16 = false;
            if (var8.field2172 == 1) {
                int var17 = var4 - this.field2590.field7794;
                int var18 = var5 - this.field2590.field7792;
                int var19 = var6 - this.field2590.field7782;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field2195 * var20 * arg1);
                this.field2595 = (int) ((long) this.field2595 - ((long) this.field2595 * var21 >> 18));
            } else if (var8.field2172 == 2) {
                int var23 = var4 - this.field2590.field7794;
                int var24 = var5 - this.field2590.field7792;
                int var25 = var6 - this.field2590.field7782;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field2195 * var26 * arg1);
                this.field2595 = (int) ((long) this.field2595 - ((long) this.field2595 * var27 >> 28));
            }
            if (var8.field2207 != null) {
                class499 var29 = var7.field2923.field7697;
                for (class499 var30 = var29.field7336; var29 != var30; var30 = var30.field7336) {
                    class343 var31 = (class343) var30;
                    class370 var32 = var31.field4731;
                    if (var32.field5188 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field2207.length; ++var34) {
                            if (var8.field2207[var34] == var32.field5203) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4721;
                            int var36 = var5 - var31.field4725;
                            int var37 = var6 - var31.field4729;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field5192) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4724 * var37 + var31.field4722 * var35 + var32.field5181 * var36) * 65535L / (long) (var32.field5183 * var40);
                                if (var41 >= (long) var32.field5193) {
                                    int var43 = 0;
                                    if (var32.field5191 == 1) {
                                        var43 = (var40 >> 4) * var32.field5199;
                                    } else if (var32.field5191 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field5199;
                                    }
                                    if (var32.field5185 == 0) {
                                        if (var32.field5205 == 0) {
                                            var13 += (var31.field4722 - var43) * arg1;
                                            var14 += (var32.field5181 - var43) * arg1;
                                            var15 += (var31.field4724 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field2117 += (var31.field4722 - var43) * arg1;
                                            super.field2120 += (var32.field5181 - var43) * arg1;
                                            super.field2125 += (var31.field4724 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field5183;
                                        int var45 = (var36 << 15) / var40 * var32.field5183;
                                        int var46 = (var37 << 15) / var40 * var32.field5183;
                                        if (var32.field5205 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field2117 += arg1 * var44 >> 15;
                                            super.field2120 += arg1 * var45 >> 15;
                                            super.field2125 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field2140 != null) {
                for (int var47 = 0; var47 < var8.field2140.length; ++var47) {
                    class343 var48 = (class343) class266.field3627.method248((long) var8.field2140[var47], 0);
                    while (var48 != null) {
                        class370 var49 = var48.field4731;
                        int var50 = var4 - var48.field4721;
                        int var51 = var5 - var48.field4725;
                        int var52 = var6 - var48.field4729;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field5192) {
                            var48 = (class343) class266.field3627.method246(-126);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4724 * var52 + var48.field4722 * var50 + var49.field5181 * var51) * 65535L / (long) (var49.field5183 * var55);
                            if (var56 < (long) var49.field5193) {
                                var48 = (class343) class266.field3627.method246(-124);
                            } else {
                                int var58 = 0;
                                if (var49.field5191 == 1) {
                                    var58 = (var55 >> 4) * var49.field5199;
                                } else if (var49.field5191 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field5199;
                                }
                                if (var49.field5185 == 0) {
                                    if (var49.field5205 == 0) {
                                        var13 += (var48.field4722 - var58) * arg1;
                                        var14 += (var49.field5181 - var58) * arg1;
                                        var15 += (var48.field4724 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field2117 += (var48.field4722 - var58) * arg1;
                                        super.field2120 += (var49.field5181 - var58) * arg1;
                                        super.field2125 += (var48.field4724 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field5183;
                                    int var60 = (var51 << 15) / var55 * var49.field5183;
                                    int var61 = (var52 << 15) / var55 * var49.field5183;
                                    if (var49.field5205 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field2117 += arg1 * var59 >> 15;
                                        super.field2120 += arg1 * var60 >> 15;
                                        super.field2125 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class343) class266.field3627.method246(-128);
                            }
                        }
                    }
                }
            }
            if (var8.field2200 != null) {
                if (var8.field2183 == null) {
                    var8.field2183 = new int[var8.field2200.length];
                    for (int var62 = 0; var62 < var8.field2200.length; ++var62) {
                        class278.method1571((byte) 124, var8.field2200[var62]);
                        var8.field2183[var62] = ((class330) class35.field499.method979((byte) 28, (long) var8.field2200[var62])).field4495;
                    }
                }
                for (int var63 = 0; var63 < var8.field2183.length; ++var63) {
                    class370 var64 = class516.field7572[var8.field2183[var63]];
                    if (var64.field5205 == 0) {
                        var13 += var64.field5189 * arg1;
                        var14 += var64.field5181 * arg1;
                        var15 += var64.field5197 * arg1;
                        var16 = true;
                    } else {
                        super.field2117 += var64.field5189 * arg1;
                        super.field2120 += var64.field5181 * arg1;
                        super.field2125 += var64.field5197 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field2591 = (short) var13;
                        this.field2596 = (short) var14;
                        this.field2592 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field2595 <<= 1;
                }
            }
            super.field2117 = (int) ((long) super.field2117 + ((long) this.field2591 * (long) this.field2595 >> 23) * (long) arg1);
            super.field2120 = (int) ((long) super.field2120 + ((long) this.field2596 * (long) this.field2595 >> 23) * (long) arg1);
            super.field2125 = (int) ((long) super.field2125 + ((long) this.field2592 * (long) this.field2595 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lms;IIIIIIIIIIIZZ)V")
    public class187(class530 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field2590 = arg0;
        super.field2117 = arg1 << class45.field631;
        super.field2120 = arg2 << class45.field631;
        super.field2125 = arg3 << class45.field631;
        super.field2121 = arg9;
        this.field2593 = this.field2597 = (short) arg8;
        super.field2128 = arg10;
        super.field2122 = arg11;
        super.field2123 = arg13;
        this.field2591 = (short) arg4;
        this.field2596 = (short) arg5;
        this.field2592 = (short) arg6;
        this.field2595 = arg7;
        super.field2118 = this.field2590.field7803.field4167;
        this.method1122();
    }
}
