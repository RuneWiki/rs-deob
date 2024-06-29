import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class4 extends class370 {

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Ll;")
    private class260 field28;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "S")
    private short field29;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "S")
    private short field32;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "S")
    private short field31;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "S")
    private short field34;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "S")
    private short field33;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field30;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    private int field36;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "S")
    private short field35;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()V", line = 5)
    private final void method16() {
        this.field28.field3537.field2180[this.field35] = null;
        class149.field1890[class149.field1901] = this;
        class149.field1901 = class149.field1901 + 1 & 1023;
        this.method982((byte) 96);
        this.method2649(22);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(JI)V", line = 12)
    public final void method17(long arg0, int arg1) {
        this.field29 = (short) (this.field29 - arg1);
        if (this.field29 <= 0) {
            this.method16();
        } else {
            int var4 = super.field5175 >> class80.field891;
            int var5 = super.field5173 >> class80.field891;
            int var6 = super.field5165 >> class80.field891;
            class174 var7 = this.field28.field3537;
            class353 var8 = this.field28.field3565;
            if (var8.field4949 != 0) {
                if (this.field32 - this.field29 <= var8.field4988) {
                    int var9 = var8.field4977 * arg1 + (this.field36 >> 16 & 255) + (super.field5177 >> 8 & 65280);
                    int var10 = var8.field4982 * arg1 + (this.field36 >> 8 & 255) + (super.field5177 & 65280);
                    int var11 = var8.field4948 * arg1 + (super.field5177 << 8 & 65280) + (this.field36 & 255);
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
                    super.field5177 &= -16777216;
                    super.field5177 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field36 &= -16777216;
                    this.field36 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field32 - this.field29 <= var8.field4960) {
                    int var12 = var8.field4939 * arg1 + (this.field36 >> 24 & 255) + (super.field5177 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field5177 &= 16777215;
                    super.field5177 |= (var12 & 65280) << 16;
                    this.field36 &= 16777215;
                    this.field36 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4968 != -1 && this.field32 - this.field29 <= var8.field4969) {
                this.field30 += var8.field4967 * arg1;
            }
            if (var8.field4973 != -1 && this.field32 - this.field29 <= var8.field4965) {
                super.field5168 += var8.field4984 * arg1;
            }
            int var13 = this.field31;
            int var14 = this.field34;
            int var15 = this.field33;
            boolean var16 = false;
            if (var8.field4940 == 1) {
                int var17 = var4 - this.field28.field3550;
                int var18 = var5 - this.field28.field3557;
                int var19 = var6 - this.field28.field3561;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4985 * var20 * arg1);
                this.field30 = (int) ((long) this.field30 - ((long) this.field30 * var21 >> 18));
            } else if (var8.field4940 == 2) {
                int var23 = var4 - this.field28.field3550;
                int var24 = var5 - this.field28.field3557;
                int var25 = var6 - this.field28.field3561;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4985 * var26 * arg1);
                this.field30 = (int) ((long) this.field30 - ((long) this.field30 * var27 >> 28));
            }
            if (var8.field4952 != null) {
                class338 var29 = var7.field2186.field1942;
                for (class338 var30 = var29.field4505; var29 != var30; var30 = var30.field4505) {
                    class414 var31 = (class414) var30;
                    class275 var32 = var31.field5969;
                    if (var32.field3715 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4952.length; ++var34) {
                            if (var8.field4952[var34] == var32.field3721) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5965;
                            int var36 = var5 - var31.field5961;
                            int var37 = var6 - var31.field5960;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3720) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5964 * var37 + var31.field5968 * var35 + var32.field3723 * var36) * 65535L / (long) (var32.field3726 * var40);
                                if (var41 >= (long) var32.field3709) {
                                    int var43 = 0;
                                    if (var32.field3714 == 1) {
                                        var43 = (var40 >> 4) * var32.field3708;
                                    } else if (var32.field3714 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3708;
                                    }
                                    if (var32.field3719 == 0) {
                                        if (var32.field3718 == 0) {
                                            var13 += (var31.field5968 - var43) * arg1;
                                            var14 += (var32.field3723 - var43) * arg1;
                                            var15 += (var31.field5964 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field5175 += (var31.field5968 - var43) * arg1;
                                            super.field5173 += (var32.field3723 - var43) * arg1;
                                            super.field5165 += (var31.field5964 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3726;
                                        int var45 = (var36 << 15) / var40 * var32.field3726;
                                        int var46 = (var37 << 15) / var40 * var32.field3726;
                                        if (var32.field3718 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field5175 += arg1 * var44 >> 15;
                                            super.field5173 += arg1 * var45 >> 15;
                                            super.field5165 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4975 != null) {
                for (int var47 = 0; var47 < var8.field4975.length; ++var47) {
                    class414 var48 = (class414) class47.field478.method2368((long) var8.field4975[var47], 2);
                    while (var48 != null) {
                        class275 var49 = var48.field5969;
                        int var50 = var4 - var48.field5965;
                        int var51 = var5 - var48.field5961;
                        int var52 = var6 - var48.field5960;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3720) {
                            var48 = (class414) class47.field478.method2363((byte) -36);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5964 * var52 + var48.field5968 * var50 + var49.field3723 * var51) * 65535L / (long) (var49.field3726 * var55);
                            if (var56 < (long) var49.field3709) {
                                var48 = (class414) class47.field478.method2363((byte) -78);
                            } else {
                                int var58 = 0;
                                if (var49.field3714 == 1) {
                                    var58 = (var55 >> 4) * var49.field3708;
                                } else if (var49.field3714 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3708;
                                }
                                if (var49.field3719 == 0) {
                                    if (var49.field3718 == 0) {
                                        var13 += (var48.field5968 - var58) * arg1;
                                        var14 += (var49.field3723 - var58) * arg1;
                                        var15 += (var48.field5964 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field5175 += (var48.field5968 - var58) * arg1;
                                        super.field5173 += (var49.field3723 - var58) * arg1;
                                        super.field5165 += (var48.field5964 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3726;
                                    int var60 = (var51 << 15) / var55 * var49.field3726;
                                    int var61 = (var52 << 15) / var55 * var49.field3726;
                                    if (var49.field3718 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field5175 += arg1 * var59 >> 15;
                                        super.field5173 += arg1 * var60 >> 15;
                                        super.field5165 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class414) class47.field478.method2363((byte) -76);
                            }
                        }
                    }
                }
            }
            if (var8.field4976 != null) {
                if (var8.field4964 == null) {
                    var8.field4964 = new int[var8.field4976.length];
                    for (int var62 = 0; var62 < var8.field4976.length; ++var62) {
                        class314.method1823(var8.field4976[var62], 117);
                        var8.field4964[var62] = ((class310) class300.field4090.method308((long) var8.field4976[var62], (byte) 57)).field4186;
                    }
                }
                for (int var63 = 0; var63 < var8.field4964.length; ++var63) {
                    class275 var64 = class106.field1318[var8.field4964[var63]];
                    if (var64.field3718 == 0) {
                        var13 += var64.field3717 * arg1;
                        var14 += var64.field3723 * arg1;
                        var15 += var64.field3722 * arg1;
                        var16 = true;
                    } else {
                        super.field5175 += var64.field3717 * arg1;
                        super.field5173 += var64.field3723 * arg1;
                        super.field5165 += var64.field3722 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field31 = (short) var13;
                        this.field34 = (short) var14;
                        this.field33 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field30 <<= 1;
                }
            }
            super.field5175 = (int) ((long) super.field5175 + ((long) this.field31 * (long) this.field30 >> 23) * (long) arg1);
            super.field5173 = (int) ((long) super.field5173 + ((long) this.field34 * (long) this.field30 >> 23) * (long) arg1);
            super.field5165 = (int) ((long) super.field5165 + ((long) this.field33 * (long) this.field30 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ll;IIIIIIIIIIIZ)V", line = 409)
    public final void method18(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field28 = arg0;
        super.field5175 = arg1 << class80.field891;
        super.field5173 = arg2 << class80.field891;
        super.field5165 = arg3 << class80.field891;
        super.field5177 = arg9;
        this.field32 = this.field29 = (short) arg8;
        super.field5168 = arg10;
        super.field5170 = arg11;
        this.field31 = (short) arg4;
        this.field34 = (short) arg5;
        this.field33 = (short) arg6;
        this.field30 = arg7;
        super.field5167 = this.field28.field3529.field5043;
        this.method20();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(J)V", line = 430)
    public final void method19(long arg0) {
        int var3 = super.field5175 >> 19;
        int var4 = super.field5165 >> 19;
        int var5 = super.field5173 >> class80.field891;
        if (var5 <= 0 && var5 >= -65535 && var3 >= 0 && var3 < class231.field3184 && var4 >= 0 && var4 < class209.field2840) {
            class174 var6 = this.field28.field3537;
            class353 var7 = this.field28.field3565;
            class54[] var8 = class98.field1161;
            int var9 = var8[var6.field2187].method271(var3, var4);
            int var10;
            if (var6.field2187 < 3) {
                var10 = var8[var6.field2187 + 1].method271(var3, var4);
            } else {
                var10 = var9 - 1024;
            }
            if (var7.field4962) {
                if (var7.field4944 == -1 && var5 > var9) {
                    this.method16();
                    return;
                }
                if (var7.field4944 >= 0 && var5 > var8[var7.field4944].method271(var3, var4)) {
                    this.method16();
                    return;
                }
                if (var7.field4934 == -1 && var5 < var10) {
                    this.method16();
                    return;
                }
                if (var7.field4934 >= 0 && var5 < var8[var7.field4934 + 1].method271(var3, var4)) {
                    this.method16();
                    return;
                }
            }
            if (var3 >= var6.field2193 && var3 <= var6.field2188 && var4 >= var6.field2190 && var4 <= var6.field2188 && var5 <= var9 && var5 >= var10) {
                var6.field2189.field5126.method881(this, 11022);
            } else {
                byte var11 = 3;
                if (var5 > var8[1].method271(var3, var4)) {
                    var11 = 0;
                } else if (var5 > var8[2].method271(var3, var4)) {
                    var11 = 1;
                } else if (var5 > var8[3].method271(var3, var4)) {
                    var11 = 2;
                } else if (var5 < var8[3].method271(var3, var4) - 1024) {
                    this.method16();
                    return;
                }
                class96 var12 = class176.field2209[var11][var3][var4];
                if (var12 == null) {
                    boolean var13 = class176.field2209[0][var3][var4].field1139 != null;
                    if (var11 == 3 && var13) {
                        this.method16();
                        return;
                    }
                    for (int var14 = 1; var14 <= var11; ++var14) {
                        if (class176.field2209[var14][var3][var4] == null) {
                            var12 = class176.field2209[var14][var3][var4] = new class96(var14, var3, var4);
                            if (var13) {
                                ++var12.field1137;
                            }
                        }
                    }
                }
                if (var12.field1127 == null) {
                    var12.field1127 = new class366();
                    var12.field1129 = (byte) ((int) (arg0 & 255L));
                } else if ((byte) ((int) (arg0 & 255L)) != var12.field1129) {
                    var12.field1127 = new class366();
                    var12.field1129 = (byte) ((int) (arg0 & 255L));
                }
                var12.field1127.field5126.method881(this, 11022);
            }
        } else {
            this.method16();
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()V", line = 558)
    private final void method20() {
        int var1 = this.field28.field3537.field2176;
        if (this.field28.field3537.field2180[var1] != null) {
            this.field28.field3537.field2180[var1].method16();
        }
        this.field28.field3537.field2180[var1] = this;
        this.field35 = (short) this.field28.field3537.field2176;
        this.field28.field3537.field2176 = var1 + 1 & 8191;
        this.field28.field3553.method992(this, 90);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Ll;IIIIIIIIIIIZ)V", line = 569)
    public class4(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
        this.field28 = arg0;
        super.field5175 = arg1 << class80.field891;
        super.field5173 = arg2 << class80.field891;
        super.field5165 = arg3 << class80.field891;
        super.field5177 = arg9;
        this.field32 = this.field29 = (short) arg8;
        super.field5168 = arg10;
        super.field5170 = arg11;
        this.field31 = (short) arg4;
        this.field34 = (short) arg5;
        this.field33 = (short) arg6;
        this.field30 = arg7;
        super.field5167 = this.field28.field3529.field5043;
        this.method20();
    }
}
