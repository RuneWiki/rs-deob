import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class421 {

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "Lpq;")
    private class128 field160;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "S")
    private short field161;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "S")
    private short field159;

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "S")
    private short field162;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "S")
    private short field155;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "S")
    private short field156;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "S")
    private short field154;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)V", line = 3)
    public final void method63(long arg0, int arg1) {
        this.field161 = (short) (this.field161 - arg1);
        if (this.field161 <= 0) {
            this.method65();
        } else {
            int var4 = super.field6196 >> class80.field1328;
            int var5 = super.field6188 >> class80.field1328;
            int var6 = super.field6185 >> class80.field1328;
            class234 var7 = this.field160.field1960;
            class281 var8 = this.field160.field1962;
            if (var8.field4069 != 0) {
                if (this.field159 - this.field161 <= var8.field4034) {
                    int var9 = var8.field4067 * arg1 + (this.field158 >> 16 & 255) + (super.field6186 >> 8 & 65280);
                    int var10 = var8.field4048 * arg1 + (this.field158 >> 8 & 255) + (super.field6186 & 65280);
                    int var11 = var8.field4051 * arg1 + (super.field6186 << 8 & 65280) + (this.field158 & 255);
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
                    super.field6186 &= -16777216;
                    super.field6186 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field158 &= -16777216;
                    this.field158 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field159 - this.field161 <= var8.field4054) {
                    int var12 = var8.field4058 * arg1 + (this.field158 >> 24 & 255) + (super.field6186 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6186 &= 16777215;
                    super.field6186 |= (var12 & 65280) << 16;
                    this.field158 &= 16777215;
                    this.field158 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4046 != -1 && this.field159 - this.field161 <= var8.field4091) {
                this.field157 += var8.field4050 * arg1;
            }
            if (var8.field4055 != -1 && this.field159 - this.field161 <= var8.field4079) {
                super.field6191 += var8.field4085 * arg1;
            }
            int var13 = this.field162;
            int var14 = this.field155;
            int var15 = this.field156;
            boolean var16 = false;
            if (var8.field4042 == 1) {
                int var17 = var4 - this.field160.field1969;
                int var18 = var5 - this.field160.field1937;
                int var19 = var6 - this.field160.field1943;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field4083 * var20 * arg1);
                this.field157 = (int) ((long) this.field157 - ((long) this.field157 * var21 >> 18));
            } else if (var8.field4042 == 2) {
                int var23 = var4 - this.field160.field1969;
                int var24 = var5 - this.field160.field1937;
                int var25 = var6 - this.field160.field1943;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field4083 * var26 * arg1);
                this.field157 = (int) ((long) this.field157 - ((long) this.field157 * var27 >> 28));
            }
            if (var8.field4075 != null) {
                class439 var29 = var7.field3405.field5279;
                for (class439 var30 = var29.field6403; var29 != var30; var30 = var30.field6403) {
                    class363 var31 = (class363) var30;
                    class53 var32 = var31.field5453;
                    if (var32.field781 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field4075.length; ++var34) {
                            if (var8.field4075[var34] == var32.field789) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field5454;
                            int var36 = var5 - var31.field5451;
                            int var37 = var6 - var31.field5449;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field775) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field5455 * var37 + var31.field5448 * var35 + var32.field787 * var36) * 65535L / (long) (var32.field779 * var40);
                                if (var41 >= (long) var32.field778) {
                                    int var43 = 0;
                                    if (var32.field782 == 1) {
                                        var43 = (var40 >> 4) * var32.field788;
                                    } else if (var32.field782 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field788;
                                    }
                                    if (var32.field783 == 0) {
                                        if (var32.field774 == 0) {
                                            var13 += (var31.field5448 - var43) * arg1;
                                            var14 += (var32.field787 - var43) * arg1;
                                            var15 += (var31.field5455 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6196 += (var31.field5448 - var43) * arg1;
                                            super.field6188 += (var32.field787 - var43) * arg1;
                                            super.field6185 += (var31.field5455 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field779;
                                        int var45 = (var36 << 15) / var40 * var32.field779;
                                        int var46 = (var37 << 15) / var40 * var32.field779;
                                        if (var32.field774 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6196 += arg1 * var44 >> 15;
                                            super.field6188 += arg1 * var45 >> 15;
                                            super.field6185 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4057 != null) {
                for (int var47 = 0; var47 < var8.field4057.length; ++var47) {
                    class363 var48 = (class363) class80.field1322.method2377((long) var8.field4057[var47], -1);
                    while (var48 != null) {
                        class53 var49 = var48.field5453;
                        int var50 = var4 - var48.field5454;
                        int var51 = var5 - var48.field5451;
                        int var52 = var6 - var48.field5449;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field775) {
                            var48 = (class363) class80.field1322.method2379(2);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field5455 * var52 + var48.field5448 * var50 + var49.field787 * var51) * 65535L / (long) (var49.field779 * var55);
                            if (var56 < (long) var49.field778) {
                                var48 = (class363) class80.field1322.method2379(2);
                            } else {
                                int var58 = 0;
                                if (var49.field782 == 1) {
                                    var58 = (var55 >> 4) * var49.field788;
                                } else if (var49.field782 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field788;
                                }
                                if (var49.field783 == 0) {
                                    if (var49.field774 == 0) {
                                        var13 += (var48.field5448 - var58) * arg1;
                                        var14 += (var49.field787 - var58) * arg1;
                                        var15 += (var48.field5455 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6196 += (var48.field5448 - var58) * arg1;
                                        super.field6188 += (var49.field787 - var58) * arg1;
                                        super.field6185 += (var48.field5455 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field779;
                                    int var60 = (var51 << 15) / var55 * var49.field779;
                                    int var61 = (var52 << 15) / var55 * var49.field779;
                                    if (var49.field774 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6196 += arg1 * var59 >> 15;
                                        super.field6188 += arg1 * var60 >> 15;
                                        super.field6185 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class363) class80.field1322.method2379(2);
                            }
                        }
                    }
                }
            }
            if (var8.field4027 != null) {
                if (var8.field4080 == null) {
                    var8.field4080 = new int[var8.field4027.length];
                    for (int var62 = 0; var62 < var8.field4027.length; ++var62) {
                        class118.method862(-3, var8.field4027[var62]);
                        var8.field4080[var62] = ((class242) class317.field4546.method2485(31, (long) var8.field4027[var62])).field3509;
                    }
                }
                for (int var63 = 0; var63 < var8.field4080.length; ++var63) {
                    class53 var64 = class221.field3190[var8.field4080[var63]];
                    if (var64.field774 == 0) {
                        var13 += var64.field790 * arg1;
                        var14 += var64.field787 * arg1;
                        var15 += var64.field771 * arg1;
                        var16 = true;
                    } else {
                        super.field6196 += var64.field790 * arg1;
                        super.field6188 += var64.field787 * arg1;
                        super.field6185 += var64.field771 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field162 = (short) var13;
                        this.field155 = (short) var14;
                        this.field156 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field157 <<= 1;
                }
            }
            super.field6196 = (int) ((long) super.field6196 + ((long) this.field162 * (long) this.field157 >> 23) * (long) arg1);
            super.field6188 = (int) ((long) super.field6188 + ((long) this.field155 * (long) this.field157 >> 23) * (long) arg1);
            super.field6185 = (int) ((long) super.field6185 + ((long) this.field156 * (long) this.field157 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(J)V", line = 400)
    public final void method64(long arg0) {
        int var3 = super.field6196 >> class225.field3278 + 12;
        int var4 = super.field6185 >> class225.field3278 + 12;
        int var5 = super.field6188 >> class80.field1328;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class246.field3560 && var4 >= 0 && var4 < class254.field3675) {
            class234 var6 = this.field160.field1960;
            class281 var7 = this.field160.field1962;
            class35[] var8 = class529.field7807;
            int var9 = var8[var6.field3409].method271(var3, var4);
            int var10;
            if (var6.field3409 < class334.field5130 - 1) {
                var10 = var8[var6.field3409 + 1].method271(var3, var4);
            } else {
                var10 = var9 - (8 << class225.field3278);
            }
            if (var7.field4023) {
                if (var7.field4070 == -1 && var5 > var9) {
                    this.method65();
                    return;
                }
                if (var7.field4070 >= 0 && var5 > var8[var7.field4070].method271(var3, var4)) {
                    this.method65();
                    return;
                }
                if (var7.field4049 == -1 && var5 < var10) {
                    this.method65();
                    return;
                }
                if (var7.field4049 >= 0 && var5 < var8[var7.field4049 + 1].method271(var3, var4)) {
                    this.method65();
                    return;
                }
            }
            if (var3 >= var6.field3414 && var3 <= var6.field3410 && var4 >= var6.field3408 && var4 <= var6.field3407 && var5 <= var9 && var5 >= var10) {
                var6.field3412.field7181.method1481(18448, this);
            } else {
                int var11;
                for (var11 = class334.field5130 - 1; var11 > 0 && var5 > var8[var11].method271(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method271(var3, var4)) {
                    this.method65();
                } else if (class334.field5130 - 1 == var11 && var8[var11].method271(var3, var4) - var5 > 8 << class225.field3278) {
                    this.method65();
                } else {
                    class165 var12 = class36.field545[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class36.field545[0][var3][var4] = new class165(0, var3, var4);
                        }
                        boolean var13 = class36.field545[0][var3][var4].field2477 != null;
                        if (var11 == 3 && var13) {
                            this.method65();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class36.field545[var14][var3][var4] == null) {
                                var12 = class36.field545[var14][var3][var4] = new class165(var14, var3, var4);
                                if (var13) {
                                    ++var12.field2475;
                                }
                            }
                        }
                    }
                    if (var12.field2478 == null) {
                        var12.field2478 = new class492();
                        var12.field2483 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field2483) {
                        var12.field2478.field7181.method1488(-111);
                        var12.field2478.field7189 = false;
                        var12.field2483 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field2478.field7181.method1481(18448, this);
                }
            }
        } else {
            this.method65();
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V", line = 532)
    private final void method65() {
        this.field160.field1960.field3403[this.field154] = null;
        class175.field2672[class63.field1117] = this;
        class63.field1117 = class63.field1117 + 1 & 1023;
        this.method1540(-1);
        this.method2252((byte) 122);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lpq;IIIIIIIIIIIZZ)V", line = 540)
    public final void method66(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field160 = arg0;
        super.field6196 = arg1 << class80.field1328;
        super.field6188 = arg2 << class80.field1328;
        super.field6185 = arg3 << class80.field1328;
        super.field6186 = arg9;
        this.field159 = this.field161 = (short) arg8;
        super.field6191 = arg10;
        super.field6194 = arg11;
        super.field6198 = arg13;
        this.field162 = (short) arg4;
        this.field155 = (short) arg5;
        this.field156 = (short) arg6;
        this.field157 = arg7;
        super.field6200 = this.field160.field1944.field699;
        this.method67();
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()V", line = 562)
    private final void method67() {
        int var1 = this.field160.field1960.field3396;
        if (this.field160.field1960.field3403[var1] != null) {
            this.field160.field1960.field3403[var1].method65();
        }
        this.field160.field1960.field3403[var1] = this;
        this.field154 = (short) this.field160.field1960.field3396;
        this.field160.field1960.field3396 = var1 + 1 & 8191;
        this.field160.field1965.method1637((byte) -102, this);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lpq;IIIIIIIIIIIZZ)V", line = 571)
    public class9(class128 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field160 = arg0;
        super.field6196 = arg1 << class80.field1328;
        super.field6188 = arg2 << class80.field1328;
        super.field6185 = arg3 << class80.field1328;
        super.field6186 = arg9;
        this.field159 = this.field161 = (short) arg8;
        super.field6191 = arg10;
        super.field6194 = arg11;
        super.field6198 = arg13;
        this.field162 = (short) arg4;
        this.field155 = (short) arg5;
        this.field156 = (short) arg6;
        this.field157 = arg7;
        super.field6200 = this.field160.field1944.field699;
        this.method67();
    }
}
