import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class619 extends class429 {

    @OriginalMember(owner = "client!fb", name = "I", descriptor = "Llw;")
    public class605 field8555;

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "S")
    private short field8553;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "S")
    private short field8556;

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "S")
    private short field8552;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "S")
    private short field8559;

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "S")
    private short field8554;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    private int field8557;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    private int field8551;

    @OriginalMember(owner = "client!fb", name = "L", descriptor = "S")
    private short field8558;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public final void method3441() {
        this.field8555.field8399.field5571[this.field8558] = null;
        class552.field7482[class264.field3749] = this;
        class264.field3749 = class264.field3749 + 1 & 1023;
        this.method118(-30545);
        this.method1447(-89);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Llw;IIIIIIIIIIIZZ)V")
    public final void method3442(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field8555 = arg0;
        super.field6025 = arg1 << 12;
        super.field6021 = arg2 << 12;
        super.field6031 = arg3 << 12;
        super.field6023 = arg9;
        this.field8556 = this.field8553 = (short) arg8;
        super.field6028 = arg10;
        super.field6024 = arg11;
        super.field6029 = arg13;
        this.field8552 = (short) arg4;
        this.field8559 = (short) arg5;
        this.field8554 = (short) arg6;
        this.field8557 = arg7;
        super.field6026 = this.field8555.field8422.field408;
        this.method3445();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(JI)V")
    public final void method3443(long arg0, int arg1) {
        this.field8553 = (short) (this.field8553 - arg1);
        if (this.field8553 <= 0) {
            this.method3441();
        } else {
            int var4 = super.field6025 >> 12;
            int var5 = super.field6021 >> 12;
            int var6 = super.field6031 >> 12;
            class401 var7 = this.field8555.field8399;
            class234 var8 = this.field8555.field8430;
            if (var8.field3316 != 0) {
                if (this.field8556 - this.field8553 <= var8.field3340) {
                    int var9 = var8.field3341 * arg1 + (this.field8551 >> 16 & 255) + (super.field6023 >> 8 & 65280);
                    int var10 = var8.field3334 * arg1 + (this.field8551 >> 8 & 255) + (super.field6023 & 65280);
                    int var11 = var8.field3368 * arg1 + (super.field6023 << 8 & 65280) + (this.field8551 & 255);
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
                    super.field6023 &= -16777216;
                    super.field6023 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field8551 &= -16777216;
                    this.field8551 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field8556 - this.field8553 <= var8.field3344) {
                    int var12 = var8.field3374 * arg1 + (this.field8551 >> 24 & 255) + (super.field6023 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6023 &= 16777215;
                    super.field6023 |= (var12 & 65280) << 16;
                    this.field8551 &= 16777215;
                    this.field8551 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3321 != -1 && this.field8556 - this.field8553 <= var8.field3380) {
                this.field8557 += var8.field3347 * arg1;
            }
            if (var8.field3342 != -1 && this.field8556 - this.field8553 <= var8.field3320) {
                super.field6028 += var8.field3356 * arg1;
            }
            int var13 = this.field8552;
            int var14 = this.field8559;
            int var15 = this.field8554;
            boolean var16 = false;
            if (var8.field3369 == 1) {
                int var17 = var4 - this.field8555.field8425;
                int var18 = var5 - this.field8555.field8409;
                int var19 = var6 - this.field8555.field8426;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18)) >> 2;
                long var21 = (long) (var8.field3366 * var20 * arg1);
                this.field8557 = (int) ((long) this.field8557 - ((long) this.field8557 * var21 >> 18));
            } else if (var8.field3369 == 2) {
                int var23 = var4 - this.field8555.field8425;
                int var24 = var5 - this.field8555.field8409;
                int var25 = var6 - this.field8555.field8426;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field3366 * var26 * arg1);
                this.field8557 = (int) ((long) this.field8557 - ((long) this.field8557 * var27 >> 28));
            }
            if (var8.field3346 != null) {
                class539 var29 = var7.field5577.field2826;
                for (class539 var30 = var29.field7315; var29 != var30; var30 = var30.field7315) {
                    class143 var31 = (class143) var30;
                    class400 var32 = var31.field2132;
                    if (var32.field5561 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field3346.length; ++var34) {
                            if (var8.field3346[var34] == var32.field5565) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field2124;
                            int var36 = var5 - var31.field2131;
                            int var37 = var6 - var31.field2130;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field5563) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field2125 * var37 + var31.field2127 * var35 + var32.field5558 * var36) * 65535L / (long) (var32.field5564 * var40);
                                if (var41 >= (long) var32.field5557) {
                                    int var43 = 0;
                                    if (var32.field5555 == 1) {
                                        var43 = (var40 >> 4) * var32.field5552;
                                    } else if (var32.field5555 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field5552;
                                    }
                                    if (var32.field5553 == 0) {
                                        if (var32.field5550 == 0) {
                                            var13 += (var31.field2127 - var43) * arg1;
                                            var14 += (var32.field5558 - var43) * arg1;
                                            var15 += (var31.field2125 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field6025 += (var31.field2127 - var43) * arg1;
                                            super.field6021 += (var32.field5558 - var43) * arg1;
                                            super.field6031 += (var31.field2125 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field5564;
                                        int var45 = (var36 << 15) / var40 * var32.field5564;
                                        int var46 = (var37 << 15) / var40 * var32.field5564;
                                        if (var32.field5550 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field6025 += arg1 * var44 >> 15;
                                            super.field6021 += arg1 * var45 >> 15;
                                            super.field6031 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3332 != null) {
                for (int var47 = 0; var47 < var8.field3332.length; ++var47) {
                    class143 var48 = (class143) class552.field7475.method1604((long) var8.field3332[var47], -1);
                    while (var48 != null) {
                        class400 var49 = var48.field2132;
                        int var50 = var4 - var48.field2124;
                        int var51 = var5 - var48.field2131;
                        int var52 = var6 - var48.field2130;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field5563) {
                            var48 = (class143) class552.field7475.method1607((byte) -110);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field2125 * var52 + var48.field2127 * var50 + var49.field5558 * var51) * 65535L / (long) (var49.field5564 * var55);
                            if (var56 < (long) var49.field5557) {
                                var48 = (class143) class552.field7475.method1607((byte) -110);
                            } else {
                                int var58 = 0;
                                if (var49.field5555 == 1) {
                                    var58 = (var55 >> 4) * var49.field5552;
                                } else if (var49.field5555 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field5552;
                                }
                                if (var49.field5553 == 0) {
                                    if (var49.field5550 == 0) {
                                        var13 += (var48.field2127 - var58) * arg1;
                                        var14 += (var49.field5558 - var58) * arg1;
                                        var15 += (var48.field2125 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field6025 += (var48.field2127 - var58) * arg1;
                                        super.field6021 += (var49.field5558 - var58) * arg1;
                                        super.field6031 += (var48.field2125 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field5564;
                                    int var60 = (var51 << 15) / var55 * var49.field5564;
                                    int var61 = (var52 << 15) / var55 * var49.field5564;
                                    if (var49.field5550 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field6025 += arg1 * var59 >> 15;
                                        super.field6021 += arg1 * var60 >> 15;
                                        super.field6031 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class143) class552.field7475.method1607((byte) 62);
                            }
                        }
                    }
                }
            }
            if (var8.field3343 != null) {
                if (var8.field3355 == null) {
                    var8.field3355 = new int[var8.field3343.length];
                    for (int var62 = 0; var62 < var8.field3343.length; ++var62) {
                        class634.method3521(-112, var8.field3343[var62]);
                        var8.field3355[var62] = ((class108) class424.field5977.method2061(-17305, (long) var8.field3343[var62])).field1479;
                    }
                }
                for (int var63 = 0; var63 < var8.field3355.length; ++var63) {
                    class400 var64 = class376.field5326[var8.field3355[var63]];
                    if (var64.field5550 == 0) {
                        var13 += var64.field5562 * arg1;
                        var14 += var64.field5558 * arg1;
                        var15 += var64.field5551 * arg1;
                        var16 = true;
                    } else {
                        super.field6025 += var64.field5562 * arg1;
                        super.field6021 += var64.field5558 * arg1;
                        super.field6031 += var64.field5551 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field8552 = (short) var13;
                        this.field8559 = (short) var14;
                        this.field8554 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field8557 <<= 1;
                }
            }
            super.field6025 = (int) ((long) super.field6025 + ((long) (this.field8557 << 2) * (long) this.field8552 >> 23) * (long) arg1);
            super.field6021 = (int) ((long) super.field6021 + ((long) (this.field8557 << 2) * (long) this.field8559 >> 23) * (long) arg1);
            super.field6031 = (int) ((long) super.field6031 + ((long) (this.field8557 << 2) * (long) this.field8554 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Loa;J)V")
    public final void method3444(class638 arg0, long arg1) {
        int var4 = super.field6025 >> class627.field8753 + 12;
        int var5 = super.field6031 >> class627.field8753 + 12;
        int var6 = super.field6021 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class137.field1931 && var5 >= 0 && var5 < class22.field308) {
            class401 var7 = this.field8555.field8399;
            class234 var8 = this.field8555.field8430;
            class136[] var9 = class144.field2149;
            int var10 = var7.field5581;
            class486 var11 = class658.field9266[var7.field5581][var4][var5];
            if (var11 != null) {
                var10 = var11.field6737;
            }
            int var12 = var9[var10].method273(var4, var5);
            int var13;
            if (var10 < class552.field7467 - 1) {
                var13 = var9[var10 + 1].method273(var4, var5);
            } else {
                var13 = var12 - (8 << class627.field8753);
            }
            if (var8.field3373) {
                if (var8.field3384 == -1 && var6 > var12) {
                    this.method3441();
                    return;
                }
                if (var8.field3384 >= 0 && var6 > var9[var8.field3384].method273(var4, var5)) {
                    this.method3441();
                    return;
                }
                if (var8.field3345 == -1 && var6 < var13) {
                    this.method3441();
                    return;
                }
                if (var8.field3345 >= 0 && var6 < var9[var8.field3345 + 1].method273(var4, var5)) {
                    this.method3441();
                    return;
                }
            }
            if (var4 >= var7.field5584 && var4 <= var7.field5580 && var5 >= var7.field5586 && var5 <= var7.field5583 && var6 <= var12 && var6 >= var13) {
                var7.field5585.field3924.method2219(true, this);
            } else {
                int var14;
                for (var14 = class552.field7467 - 1; var14 > 0 && var6 > var9[var14].method273(var4, var5); --var14) {
                }
                if (var8.field3348 && var14 == 0 && var6 > var9[0].method273(var4, var5)) {
                    this.method3441();
                } else if (class552.field7467 - 1 == var14 && var9[var14].method273(var4, var5) - var6 > 8 << class627.field8753) {
                    this.method3441();
                } else {
                    class486 var15 = class658.field9266[var14][var4][var5];
                    if (var15 == null) {
                        if (var14 == 0 || class658.field9266[0][var4][var5] == null) {
                            var15 = class658.field9266[0][var4][var5] = new class486(0, var4, var5);
                        }
                        boolean var16 = class658.field9266[0][var4][var5].field6745 != null;
                        if (var14 == 3 && var16) {
                            this.method3441();
                            return;
                        }
                        for (int var17 = 1; var17 <= var14; ++var17) {
                            if (class658.field9266[var17][var4][var5] == null) {
                                var15 = class658.field9266[var17][var4][var5] = new class486(var17, var4, var5);
                                if (var16) {
                                    ++var15.field6737;
                                }
                            }
                        }
                    }
                    if (var8.field3339) {
                        int var18 = super.field6025 >> 12;
                        int var19 = super.field6031 >> 12;
                        if (var15.field6750 != null) {
                            class496 var20 = var15.field6750.method551(arg0, (byte) -107);
                            if (var20 != null && var20.method2775(100, var6, var19, var18)) {
                                this.method3441();
                                return;
                            }
                        }
                        if (var15.field6741 != null) {
                            class496 var21 = var15.field6741.method551(arg0, (byte) -80);
                            if (var21 != null && var21.method2775(83, var6, var19, var18)) {
                                this.method3441();
                                return;
                            }
                        }
                        if (var15.field6748 != null) {
                            class496 var22 = var15.field6748.method551(arg0, (byte) -113);
                            if (var22 != null && var22.method2775(71, var6, var19, var18)) {
                                this.method3441();
                                return;
                            }
                        }
                        for (class20 var23 = var15.field6751; var23 != null; var23 = var23.field284) {
                            class496 var24 = var23.field281.method551(arg0, (byte) -103);
                            if (var24 != null && var24.method2775(113, var6, var19, var18)) {
                                this.method3441();
                                return;
                            }
                        }
                    }
                    if (var15.field6726 == null) {
                        var15.field6726 = new class281();
                        var15.field6727 = (byte) ((int) (arg1 & 255L));
                    } else if ((byte) ((int) (arg1 & 255L)) != var15.field6727) {
                        var15.field6726.field3924.method2220(-25594);
                        var15.field6726.field3930 = false;
                        var15.field6727 = (byte) ((int) (arg1 & 255L));
                    }
                    var15.field6726.field3924.method2219(true, this);
                }
            }
        } else {
            this.method3441();
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Llw;IIIIIIIIIIIZZ)V")
    public class619(class605 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field8555 = arg0;
        super.field6025 = arg1 << 12;
        super.field6021 = arg2 << 12;
        super.field6031 = arg3 << 12;
        super.field6023 = arg9;
        this.field8556 = this.field8553 = (short) arg8;
        super.field6028 = arg10;
        super.field6024 = arg11;
        super.field6029 = arg13;
        this.field8552 = (short) arg4;
        this.field8559 = (short) arg5;
        this.field8554 = (short) arg6;
        this.field8557 = arg7;
        super.field6026 = this.field8555.field8422.field408;
        this.method3445();
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    private final void method3445() {
        int var1 = this.field8555.field8399.field5574;
        if (this.field8555.field8399.field5571[var1] != null) {
            this.field8555.field8399.field5571[var1].method3441();
        }
        this.field8555.field8399.field5571[var1] = this;
        this.field8558 = (short) this.field8555.field8399.field5574;
        this.field8555.field8399.field5574 = var1 + 1 & 8191;
        this.field8555.field8413.method3679(this, 0);
    }
}
