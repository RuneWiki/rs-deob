import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class378 extends class26 {

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "Lmo;")
    private class526 field5596;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "S")
    private short field5597;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "S")
    private short field5593;

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "S")
    private short field5595;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "S")
    private short field5591;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "S")
    private short field5592;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    private int field5590;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    private int field5589;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "S")
    private short field5594;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "()V", line = 3)
    private final void method2315() {
        this.field5596.field7745.field2779[this.field5594] = null;
        class203.field2943[class99.field1330] = this;
        class99.field1330 = class99.field1330 + 1 & 1023;
        this.method2322(1024);
        this.method2858(10009);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(J)V", line = 11)
    public final void method2316(long arg0) {
        int var3 = super.field305 >> class527.field7754 + 12;
        int var4 = super.field312 >> class527.field7754 + 12;
        int var5 = super.field316 >> class429.field6317;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class241.field3562 && var4 >= 0 && var4 < class497.field7388) {
            class189 var6 = this.field5596.field7745;
            class56 var7 = this.field5596.field7742;
            class142[] var8 = class131.field1899;
            int var9 = var8[var6.field2789].method430(var3, var4);
            int var10;
            if (var6.field2789 < class308.field4395 - 1) {
                var10 = var8[var6.field2789 + 1].method430(var3, var4);
            } else {
                var10 = var9 - (8 << class527.field7754);
            }
            if (var7.field614) {
                if (var7.field613 == -1 && var5 > var9) {
                    this.method2315();
                    return;
                }
                if (var7.field613 >= 0 && var5 > var8[var7.field613].method430(var3, var4)) {
                    this.method2315();
                    return;
                }
                if (var7.field639 == -1 && var5 < var10) {
                    this.method2315();
                    return;
                }
                if (var7.field639 >= 0 && var5 < var8[var7.field639 + 1].method430(var3, var4)) {
                    this.method2315();
                    return;
                }
            }
            if (var3 >= var6.field2787 && var3 <= var6.field2790 && var4 >= var6.field2791 && var4 <= var6.field2785 && var5 <= var9 && var5 >= var10) {
                var6.field2792.field1190.method2291(true, this);
            } else {
                int var11;
                for (var11 = class308.field4395 - 1; var11 > 0 && var5 > var8[var11].method430(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method430(var3, var4)) {
                    this.method2315();
                } else if (class308.field4395 - 1 == var11 && var8[var11].method430(var3, var4) - var5 > 8 << class527.field7754) {
                    this.method2315();
                } else {
                    class148 var12 = class422.field6240[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class422.field6240[0][var3][var4] = new class148(0, var3, var4);
                        }
                        boolean var13 = class422.field6240[0][var3][var4].field2091 != null;
                        if (var11 == 3 && var13) {
                            this.method2315();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class422.field6240[var14][var3][var4] == null) {
                                var12 = class422.field6240[var14][var3][var4] = new class148(var14, var3, var4);
                                if (var13) {
                                    ++var12.field2100;
                                }
                            }
                        }
                    }
                    if (var12.field2099 == null) {
                        var12.field2099 = new class88();
                        var12.field2080 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field2080) {
                        var12.field2099.field1190.method2287(124);
                        var12.field2099.field1200 = false;
                        var12.field2080 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field2099.field1190.method2291(true, this);
                }
            }
        } else {
            this.method2315();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lmo;IIIIIIIIIIIZZ)V", line = 139)
    public final void method2317(class526 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5596 = arg0;
        super.field305 = arg1 << class429.field6317;
        super.field316 = arg2 << class429.field6317;
        super.field312 = arg3 << class429.field6317;
        super.field311 = arg9;
        this.field5593 = this.field5597 = (short) arg8;
        super.field306 = arg10;
        super.field317 = arg11;
        super.field308 = arg13;
        this.field5595 = (short) arg4;
        this.field5591 = (short) arg5;
        this.field5592 = (short) arg6;
        this.field5590 = arg7;
        super.field309 = this.field5596.field7738.field199;
        this.method2318();
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "()V", line = 162)
    private final void method2318() {
        int var1 = this.field5596.field7745.field2777;
        if (this.field5596.field7745.field2779[var1] != null) {
            this.field5596.field7745.field2779[var1].method2315();
        }
        this.field5596.field7745.field2779[var1] = this;
        this.field5594 = (short) this.field5596.field7745.field2777;
        this.field5596.field7745.field2777 = var1 + 1 & 8191;
        this.field5596.field7724.method2948(-126, this);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V", line = 177)
    public final void method2319(long arg0, int arg1) {
        this.field5597 = (short) (this.field5597 - arg1);
        if (this.field5597 <= 0) {
            this.method2315();
        } else {
            int var4 = super.field305 >> class429.field6317;
            int var5 = super.field316 >> class429.field6317;
            int var6 = super.field312 >> class429.field6317;
            class189 var7 = this.field5596.field7745;
            class56 var8 = this.field5596.field7742;
            if (var8.field602 != 0) {
                if (this.field5593 - this.field5597 <= var8.field621) {
                    int var9 = var8.field631 * arg1 + (this.field5589 >> 16 & 255) + (super.field311 >> 8 & 65280);
                    int var10 = var8.field643 * arg1 + (this.field5589 >> 8 & 255) + (super.field311 & 65280);
                    int var11 = var8.field598 * arg1 + (super.field311 << 8 & 65280) + (this.field5589 & 255);
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
                    super.field311 &= -16777216;
                    super.field311 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5589 &= -16777216;
                    this.field5589 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5593 - this.field5597 <= var8.field599) {
                    int var12 = var8.field653 * arg1 + (this.field5589 >> 24 & 255) + (super.field311 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field311 &= 16777215;
                    super.field311 |= (var12 & 65280) << 16;
                    this.field5589 &= 16777215;
                    this.field5589 |= (var12 & 255) << 24;
                }
            }
            if (var8.field620 != -1 && this.field5593 - this.field5597 <= var8.field651) {
                this.field5590 += var8.field618 * arg1;
            }
            if (var8.field636 != -1 && this.field5593 - this.field5597 <= var8.field634) {
                super.field306 += var8.field615 * arg1;
            }
            int var13 = this.field5595;
            int var14 = this.field5591;
            int var15 = this.field5592;
            boolean var16 = false;
            if (var8.field616 == 1) {
                int var17 = var4 - this.field5596.field7718;
                int var18 = var5 - this.field5596.field7744;
                int var19 = var6 - this.field5596.field7746;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field640 * var20 * arg1);
                this.field5590 = (int) ((long) this.field5590 - ((long) this.field5590 * var21 >> 18));
            } else if (var8.field616 == 2) {
                int var23 = var4 - this.field5596.field7718;
                int var24 = var5 - this.field5596.field7744;
                int var25 = var6 - this.field5596.field7746;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field640 * var26 * arg1);
                this.field5590 = (int) ((long) this.field5590 - ((long) this.field5590 * var27 >> 28));
            }
            if (var8.field596 != null) {
                class223 var29 = var7.field2783.field1918;
                for (class223 var30 = var29.field3275; var29 != var30; var30 = var30.field3275) {
                    class290 var31 = (class290) var30;
                    class261 var32 = var31.field4160;
                    if (var32.field3836 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field596.length; ++var34) {
                            if (var8.field596[var34] == var32.field3846) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field4163;
                            int var36 = var5 - var31.field4165;
                            int var37 = var6 - var31.field4170;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3835) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field4164 * var37 + var31.field4161 * var35 + var32.field3840 * var36) * 65535L / (long) (var32.field3833 * var40);
                                if (var41 >= (long) var32.field3839) {
                                    int var43 = 0;
                                    if (var32.field3849 == 1) {
                                        var43 = (var40 >> 4) * var32.field3847;
                                    } else if (var32.field3849 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3847;
                                    }
                                    if (var32.field3838 == 0) {
                                        if (var32.field3842 == 0) {
                                            var13 += (var31.field4161 - var43) * arg1;
                                            var14 += (var32.field3840 - var43) * arg1;
                                            var15 += (var31.field4164 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field305 += (var31.field4161 - var43) * arg1;
                                            super.field316 += (var32.field3840 - var43) * arg1;
                                            super.field312 += (var31.field4164 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3833;
                                        int var45 = (var36 << 15) / var40 * var32.field3833;
                                        int var46 = (var37 << 15) / var40 * var32.field3833;
                                        if (var32.field3842 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field305 += arg1 * var44 >> 15;
                                            super.field316 += arg1 * var45 >> 15;
                                            super.field312 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field588 != null) {
                for (int var47 = 0; var47 < var8.field588.length; ++var47) {
                    class290 var48 = (class290) class139.field1978.method764((long) var8.field588[var47], -13373);
                    while (var48 != null) {
                        class261 var49 = var48.field4160;
                        int var50 = var4 - var48.field4163;
                        int var51 = var5 - var48.field4165;
                        int var52 = var6 - var48.field4170;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3835) {
                            var48 = (class290) class139.field1978.method763(true);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field4164 * var52 + var48.field4161 * var50 + var49.field3840 * var51) * 65535L / (long) (var49.field3833 * var55);
                            if (var56 < (long) var49.field3839) {
                                var48 = (class290) class139.field1978.method763(true);
                            } else {
                                int var58 = 0;
                                if (var49.field3849 == 1) {
                                    var58 = (var55 >> 4) * var49.field3847;
                                } else if (var49.field3849 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3847;
                                }
                                if (var49.field3838 == 0) {
                                    if (var49.field3842 == 0) {
                                        var13 += (var48.field4161 - var58) * arg1;
                                        var14 += (var49.field3840 - var58) * arg1;
                                        var15 += (var48.field4164 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field305 += (var48.field4161 - var58) * arg1;
                                        super.field316 += (var49.field3840 - var58) * arg1;
                                        super.field312 += (var48.field4164 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3833;
                                    int var60 = (var51 << 15) / var55 * var49.field3833;
                                    int var61 = (var52 << 15) / var55 * var49.field3833;
                                    if (var49.field3842 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field305 += arg1 * var59 >> 15;
                                        super.field316 += arg1 * var60 >> 15;
                                        super.field312 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class290) class139.field1978.method763(true);
                            }
                        }
                    }
                }
            }
            if (var8.field609 != null) {
                if (var8.field633 == null) {
                    var8.field633 = new int[var8.field609.length];
                    for (int var62 = 0; var62 < var8.field609.length; ++var62) {
                        class70.method666(0, var8.field609[var62]);
                        var8.field633[var62] = ((class389) class111.field1572.method875((long) var8.field609[var62], 123)).field5750;
                    }
                }
                for (int var63 = 0; var63 < var8.field633.length; ++var63) {
                    class261 var64 = class371.field5521[var8.field633[var63]];
                    if (var64.field3842 == 0) {
                        var13 += var64.field3844 * arg1;
                        var14 += var64.field3840 * arg1;
                        var15 += var64.field3848 * arg1;
                        var16 = true;
                    } else {
                        super.field305 += var64.field3844 * arg1;
                        super.field316 += var64.field3840 * arg1;
                        super.field312 += var64.field3848 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5595 = (short) var13;
                        this.field5591 = (short) var14;
                        this.field5592 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5590 <<= 1;
                }
            }
            super.field305 = (int) ((long) super.field305 + ((long) this.field5595 * (long) this.field5590 >> 23) * (long) arg1);
            super.field316 = (int) ((long) super.field316 + ((long) this.field5591 * (long) this.field5590 >> 23) * (long) arg1);
            super.field312 = (int) ((long) super.field312 + ((long) this.field5592 * (long) this.field5590 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lmo;IIIIIIIIIIIZZ)V", line = 571)
    public class378(class526 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5596 = arg0;
        super.field305 = arg1 << class429.field6317;
        super.field316 = arg2 << class429.field6317;
        super.field312 = arg3 << class429.field6317;
        super.field311 = arg9;
        this.field5593 = this.field5597 = (short) arg8;
        super.field306 = arg10;
        super.field317 = arg11;
        super.field308 = arg13;
        this.field5595 = (short) arg4;
        this.field5591 = (short) arg5;
        this.field5592 = (short) arg6;
        this.field5590 = arg7;
        super.field309 = this.field5596.field7738.field199;
        this.method2318();
    }
}
