import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class398 extends class288 {

    @OriginalMember(owner = "client!cv", name = "I", descriptor = "Liv;")
    private class64 field5365;

    @OriginalMember(owner = "client!cv", name = "H", descriptor = "S")
    private short field5364;

    @OriginalMember(owner = "client!cv", name = "E", descriptor = "S")
    private short field5361;

    @OriginalMember(owner = "client!cv", name = "C", descriptor = "S")
    private short field5359;

    @OriginalMember(owner = "client!cv", name = "G", descriptor = "S")
    private short field5363;

    @OriginalMember(owner = "client!cv", name = "D", descriptor = "S")
    private short field5360;

    @OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
    private int field5362;

    @OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
    private int field5358;

    @OriginalMember(owner = "client!cv", name = "J", descriptor = "S")
    private short field5366;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "()V", line = 5)
    private final void method2321() {
        int var1 = this.field5365.field1002.field7791;
        if (this.field5365.field1002.field7794[var1] != null) {
            this.field5365.field1002.field7794[var1].method2323();
        }
        this.field5365.field1002.field7794[var1] = this;
        this.field5366 = (short) this.field5365.field1002.field7791;
        this.field5365.field1002.field7791 = var1 + 1 & 8191;
        this.field5365.field1005.method1766((byte) 92, this);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(J)V", line = 16)
    public final void method2322(long arg0) {
        int var3 = super.field3769 >> class530.field7813 + 12;
        int var4 = super.field3762 >> class530.field7813 + 12;
        int var5 = super.field3767 >> class63.field977;
        if (var5 <= 0 && var5 >= -262144 && var3 >= 0 && var3 < class439.field6036 && var4 >= 0 && var4 < class318.field4170) {
            class527 var6 = this.field5365.field1002;
            class298 var7 = this.field5365.field996;
            class35[] var8 = class141.field2049;
            int var9 = var8[var6.field7806].method272(var3, var4);
            int var10;
            if (var6.field7806 < class508.field7055 - 1) {
                var10 = var8[var6.field7806 + 1].method272(var3, var4);
            } else {
                var10 = var9 - (8 << class530.field7813);
            }
            if (var7.field3911) {
                if (var7.field3956 == -1 && var5 > var9) {
                    this.method2323();
                    return;
                }
                if (var7.field3956 >= 0 && var5 > var8[var7.field3956].method272(var3, var4)) {
                    this.method2323();
                    return;
                }
                if (var7.field3906 == -1 && var5 < var10) {
                    this.method2323();
                    return;
                }
                if (var7.field3906 >= 0 && var5 < var8[var7.field3906 + 1].method272(var3, var4)) {
                    this.method2323();
                    return;
                }
            }
            if (var3 >= var6.field7802 && var3 <= var6.field7799 && var4 >= var6.field7805 && var4 <= var6.field7801 && var5 <= var9 && var5 >= var10) {
                var6.field7804.field5648.method630(true, this);
            } else {
                int var11;
                for (var11 = class508.field7055 - 1; var11 > 0 && var5 > var8[var11].method272(var3, var4); --var11) {
                }
                if (var11 == 0 && var5 > var8[0].method272(var3, var4)) {
                    this.method2323();
                } else if (class508.field7055 - 1 == var11 && var8[var11].method272(var3, var4) - var5 > 8 << class530.field7813) {
                    this.method2323();
                } else {
                    class409 var12 = class497.field6886[var11][var3][var4];
                    if (var12 == null) {
                        if (var11 == 0) {
                            var12 = class497.field6886[0][var3][var4] = new class409(0, var3, var4);
                        }
                        boolean var13 = class497.field6886[0][var3][var4].field5612 != null;
                        if (var11 == 3 && var13) {
                            this.method2323();
                            return;
                        }
                        for (int var14 = 1; var14 <= var11; ++var14) {
                            if (class497.field6886[var14][var3][var4] == null) {
                                var12 = class497.field6886[var14][var3][var4] = new class409(var14, var3, var4);
                                if (var13) {
                                    ++var12.field5620;
                                }
                            }
                        }
                    }
                    if (var12.field5623 == null) {
                        var12.field5623 = new class411();
                        var12.field5610 = (byte) ((int) (arg0 & 255L));
                    } else if ((byte) ((int) (arg0 & 255L)) != var12.field5610) {
                        var12.field5623.field5648.method632(2);
                        var12.field5623.field5649 = false;
                        var12.field5610 = (byte) ((int) (arg0 & 255L));
                    }
                    var12.field5623.field5648.method630(true, this);
                }
            }
        } else {
            this.method2323();
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "()V", line = 144)
    private final void method2323() {
        this.field5365.field1002.field7794[this.field5366] = null;
        class242.field3236[class183.field2609] = this;
        class183.field2609 = class183.field2609 + 1 & 1023;
        this.method2291(-124);
        this.method2872((byte) -9);
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(Liv;IIIIIIIIIIIZZ)V", line = 151)
    public final void method2324(class64 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5365 = arg0;
        super.field3769 = arg1 << class63.field977;
        super.field3767 = arg2 << class63.field977;
        super.field3762 = arg3 << class63.field977;
        super.field3763 = arg9;
        this.field5361 = this.field5364 = (short) arg8;
        super.field3768 = arg10;
        super.field3764 = arg11;
        super.field3761 = arg13;
        this.field5359 = (short) arg4;
        this.field5363 = (short) arg5;
        this.field5360 = (short) arg6;
        this.field5362 = arg7;
        super.field3766 = this.field5365.field1001.field1440;
        this.method2321();
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(JI)V", line = 175)
    public final void method2325(long arg0, int arg1) {
        this.field5364 = (short) (this.field5364 - arg1);
        if (this.field5364 <= 0) {
            this.method2323();
        } else {
            int var4 = super.field3769 >> class63.field977;
            int var5 = super.field3767 >> class63.field977;
            int var6 = super.field3762 >> class63.field977;
            class527 var7 = this.field5365.field1002;
            class298 var8 = this.field5365.field996;
            if (var8.field3919 != 0) {
                if (this.field5361 - this.field5364 <= var8.field3943) {
                    int var9 = var8.field3945 * arg1 + (this.field5358 >> 16 & 255) + (super.field3763 >> 8 & 65280);
                    int var10 = var8.field3929 * arg1 + (this.field5358 >> 8 & 255) + (super.field3763 & 65280);
                    int var11 = var8.field3907 * arg1 + (super.field3763 << 8 & 65280) + (this.field5358 & 255);
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
                    super.field3763 &= -16777216;
                    super.field3763 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5358 &= -16777216;
                    this.field5358 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5361 - this.field5364 <= var8.field3918) {
                    int var12 = var8.field3937 * arg1 + (this.field5358 >> 24 & 255) + (super.field3763 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3763 &= 16777215;
                    super.field3763 |= (var12 & 65280) << 16;
                    this.field5358 &= 16777215;
                    this.field5358 |= (var12 & 255) << 24;
                }
            }
            if (var8.field3900 != -1 && this.field5361 - this.field5364 <= var8.field3955) {
                this.field5362 += var8.field3957 * arg1;
            }
            if (var8.field3941 != -1 && this.field5361 - this.field5364 <= var8.field3926) {
                super.field3768 += var8.field3954 * arg1;
            }
            int var13 = this.field5359;
            int var14 = this.field5363;
            int var15 = this.field5360;
            boolean var16 = false;
            if (var8.field3932 == 1) {
                int var17 = var4 - this.field5365.field998;
                int var18 = var5 - this.field5365.field978;
                int var19 = var6 - this.field5365.field981;
                int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
                long var21 = (long) (var8.field3889 * var20 * arg1);
                this.field5362 = (int) ((long) this.field5362 - ((long) this.field5362 * var21 >> 18));
            } else if (var8.field3932 == 2) {
                int var23 = var4 - this.field5365.field998;
                int var24 = var5 - this.field5365.field978;
                int var25 = var6 - this.field5365.field981;
                int var26 = var25 * var25 + var23 * var23 + var24 * var24;
                long var27 = (long) (var8.field3889 * var26 * arg1);
                this.field5362 = (int) ((long) this.field5362 - ((long) this.field5362 * var27 >> 28));
            }
            if (var8.field3886 != null) {
                class42 var29 = var7.field7797.field3684;
                for (class42 var30 = var29.field619; var29 != var30; var30 = var30.field619) {
                    class41 var31 = (class41) var30;
                    class261 var32 = var31.field618;
                    if (var32.field3457 != 1) {
                        boolean var33 = false;
                        for (int var34 = 0; var34 < var8.field3886.length; ++var34) {
                            if (var8.field3886[var34] == var32.field3455) {
                                var33 = true;
                                break;
                            }
                        }
                        if (var33) {
                            int var35 = var4 - var31.field614;
                            int var36 = var5 - var31.field611;
                            int var37 = var6 - var31.field615;
                            long var38 = (long) (var37 * var37 + var35 * var35 + var36 * var36);
                            if (var38 <= var32.field3460) {
                                int var40 = (int) Math.sqrt((double) var38);
                                if (var40 == 0) {
                                    var40 = 1;
                                }
                                long var41 = (long) (var31.field616 * var37 + var31.field617 * var35 + var32.field3463 * var36) * 65535L / (long) (var32.field3453 * var40);
                                if (var41 >= (long) var32.field3469) {
                                    int var43 = 0;
                                    if (var32.field3446 == 1) {
                                        var43 = (var40 >> 4) * var32.field3449;
                                    } else if (var32.field3446 == 2) {
                                        var43 = (var40 >> 4) * (var40 >> 4) * var32.field3449;
                                    }
                                    if (var32.field3461 == 0) {
                                        if (var32.field3447 == 0) {
                                            var13 += (var31.field617 - var43) * arg1;
                                            var14 += (var32.field3463 - var43) * arg1;
                                            var15 += (var31.field616 - var43) * arg1;
                                            var16 = true;
                                        } else {
                                            super.field3769 += (var31.field617 - var43) * arg1;
                                            super.field3767 += (var32.field3463 - var43) * arg1;
                                            super.field3762 += (var31.field616 - var43) * arg1;
                                        }
                                    } else {
                                        int var44 = (var35 << 15) / var40 * var32.field3453;
                                        int var45 = (var36 << 15) / var40 * var32.field3453;
                                        int var46 = (var37 << 15) / var40 * var32.field3453;
                                        if (var32.field3447 == 0) {
                                            var13 += arg1 * var44 >> 15;
                                            var14 += arg1 * var45 >> 15;
                                            var15 += arg1 * var46 >> 15;
                                            var16 = true;
                                        } else {
                                            super.field3769 += arg1 * var44 >> 15;
                                            super.field3767 += arg1 * var45 >> 15;
                                            super.field3762 += arg1 * var46 >> 15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field3904 != null) {
                for (int var47 = 0; var47 < var8.field3904.length; ++var47) {
                    class41 var48 = (class41) class56.field881.method2542(-31, (long) var8.field3904[var47]);
                    while (var48 != null) {
                        class261 var49 = var48.field618;
                        int var50 = var4 - var48.field614;
                        int var51 = var5 - var48.field611;
                        int var52 = var6 - var48.field615;
                        long var53 = (long) (var52 * var52 + var50 * var50 + var51 * var51);
                        if (var53 > var49.field3460) {
                            var48 = (class41) class56.field881.method2544(-37);
                        } else {
                            int var55 = (int) Math.sqrt((double) var53);
                            if (var55 == 0) {
                                var55 = 1;
                            }
                            long var56 = (long) (var48.field616 * var52 + var48.field617 * var50 + var49.field3463 * var51) * 65535L / (long) (var49.field3453 * var55);
                            if (var56 < (long) var49.field3469) {
                                var48 = (class41) class56.field881.method2544(118);
                            } else {
                                int var58 = 0;
                                if (var49.field3446 == 1) {
                                    var58 = (var55 >> 4) * var49.field3449;
                                } else if (var49.field3446 == 2) {
                                    var58 = (var55 >> 4) * (var55 >> 4) * var49.field3449;
                                }
                                if (var49.field3461 == 0) {
                                    if (var49.field3447 == 0) {
                                        var13 += (var48.field617 - var58) * arg1;
                                        var14 += (var49.field3463 - var58) * arg1;
                                        var15 += (var48.field616 - var58) * arg1;
                                        var16 = true;
                                    } else {
                                        super.field3769 += (var48.field617 - var58) * arg1;
                                        super.field3767 += (var49.field3463 - var58) * arg1;
                                        super.field3762 += (var48.field616 - var58) * arg1;
                                    }
                                } else {
                                    int var59 = (var50 << 15) / var55 * var49.field3453;
                                    int var60 = (var51 << 15) / var55 * var49.field3453;
                                    int var61 = (var52 << 15) / var55 * var49.field3453;
                                    if (var49.field3447 == 0) {
                                        var13 += arg1 * var59 >> 15;
                                        var14 += arg1 * var60 >> 15;
                                        var15 += arg1 * var61 >> 15;
                                        var16 = true;
                                    } else {
                                        super.field3769 += arg1 * var59 >> 15;
                                        super.field3767 += arg1 * var60 >> 15;
                                        super.field3762 += arg1 * var61 >> 15;
                                    }
                                }
                                var48 = (class41) class56.field881.method2544(-127);
                            }
                        }
                    }
                }
            }
            if (var8.field3925 != null) {
                if (var8.field3927 == null) {
                    var8.field3927 = new int[var8.field3925.length];
                    for (int var62 = 0; var62 < var8.field3925.length; ++var62) {
                        class423.method2436(var8.field3925[var62], true);
                        var8.field3927[var62] = ((class387) class117.field1676.method182((long) var8.field3925[var62], (byte) 110)).field5264;
                    }
                }
                for (int var63 = 0; var63 < var8.field3927.length; ++var63) {
                    class261 var64 = class289.field3787[var8.field3927[var63]];
                    if (var64.field3447 == 0) {
                        var13 += var64.field3467 * arg1;
                        var14 += var64.field3463 * arg1;
                        var15 += var64.field3459 * arg1;
                        var16 = true;
                    } else {
                        super.field3769 += var64.field3467 * arg1;
                        super.field3767 += var64.field3463 * arg1;
                        super.field3762 += var64.field3459 * arg1;
                    }
                }
            }
            if (var16) {
                while (true) {
                    if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                        this.field5359 = (short) var13;
                        this.field5363 = (short) var14;
                        this.field5360 = (short) var15;
                        break;
                    }
                    var13 >>= 1;
                    var14 >>= 1;
                    var15 >>= 1;
                    this.field5362 <<= 1;
                }
            }
            super.field3769 = (int) ((long) super.field3769 + ((long) this.field5359 * (long) this.field5362 >> 23) * (long) arg1);
            super.field3767 = (int) ((long) super.field3767 + ((long) this.field5363 * (long) this.field5362 >> 23) * (long) arg1);
            super.field3762 = (int) ((long) super.field3762 + ((long) this.field5360 * (long) this.field5362 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Liv;IIIIIIIIIIIZZ)V", line = 571)
    public class398(class64 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5365 = arg0;
        super.field3769 = arg1 << class63.field977;
        super.field3767 = arg2 << class63.field977;
        super.field3762 = arg3 << class63.field977;
        super.field3763 = arg9;
        this.field5361 = this.field5364 = (short) arg8;
        super.field3768 = arg10;
        super.field3764 = arg11;
        super.field3761 = arg13;
        this.field5359 = (short) arg4;
        this.field5363 = (short) arg5;
        this.field5360 = (short) arg6;
        this.field5362 = arg7;
        super.field3766 = this.field5365.field1001.field1440;
        this.method2321();
    }
}
