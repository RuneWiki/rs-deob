import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class77 extends class440 {

    @OriginalMember(owner = "client!tn", name = "E", descriptor = "Lik;")
    public class193 field974;

    @OriginalMember(owner = "client!tn", name = "J", descriptor = "S")
    private short field979;

    @OriginalMember(owner = "client!tn", name = "C", descriptor = "S")
    private short field972;

    @OriginalMember(owner = "client!tn", name = "G", descriptor = "S")
    private short field976;

    @OriginalMember(owner = "client!tn", name = "D", descriptor = "S")
    private short field973;

    @OriginalMember(owner = "client!tn", name = "I", descriptor = "S")
    private short field978;

    @OriginalMember(owner = "client!tn", name = "F", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!tn", name = "B", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!tn", name = "H", descriptor = "S")
    private short field977;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()V")
    public final void method758() {
        this.field974.field3191.field7843[this.field977] = null;
        class582.field8278[class275.field4417] = this;
        class275.field4417 = class275.field4417 + 1 & 1023;
        this.method2648((byte) -25);
        this.method1797(false);
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
    private final void method759() {
        int var1 = this.field974.field3191.field7844;
        if (this.field974.field3191.field7843[var1] != null) {
            this.field974.field3191.field7843[var1].method758();
        }
        this.field974.field3191.field7843[var1] = this;
        this.field977 = (short) this.field974.field3191.field7844;
        this.field974.field3191.field7844 = var1 + 1 & 8191;
        this.field974.field3202.method2757(this, -1);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(JI)V")
    public final void method760(long arg0, int arg1) {
        this.field979 = (short) (this.field979 - arg1);
        if (this.field979 <= 0) {
            this.method758();
        } else {
            int var4 = super.field6711 >> 12;
            int var5 = super.field6705 >> 12;
            int var6 = super.field6710 >> 12;
            class536 var7 = this.field974.field3191;
            class391 var8 = this.field974.field3192;
            if (var8.field6095 != 0) {
                if (this.field972 - this.field979 <= var8.field6076) {
                    int var9 = var8.field6105 * arg1 + (this.field971 >> 16 & 255) + (super.field6708 >> 8 & 65280);
                    int var10 = var8.field6067 * arg1 + (this.field971 >> 8 & 255) + (super.field6708 & 65280);
                    int var11 = var8.field6050 * arg1 + (super.field6708 << 8 & 65280) + (this.field971 & 255);
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
                    super.field6708 &= -16777216;
                    super.field6708 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field971 &= -16777216;
                    this.field971 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field972 - this.field979 <= var8.field6051) {
                    int var12 = var8.field6069 * arg1 + (this.field971 >> 24 & 255) + (super.field6708 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field6708 &= 16777215;
                    super.field6708 |= (var12 & 65280) << 16;
                    this.field971 &= 16777215;
                    this.field971 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6101 != -1 && this.field972 - this.field979 <= var8.field6072) {
                this.field975 += var8.field6070 * arg1;
            }
            if (var8.field6062 != -1 && this.field972 - this.field979 <= var8.field6073) {
                super.field6709 += var8.field6061 * arg1;
            }
            double var13 = (double) this.field976;
            double var15 = (double) this.field973;
            double var17 = (double) this.field978;
            boolean var19 = false;
            if (var8.field6091 == 1) {
                int var20 = var4 - this.field974.field3199.field5035;
                int var21 = var5 - this.field974.field3199.field5048;
                int var22 = var6 - this.field974.field3199.field5043;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field6104 * var23 * arg1);
                this.field975 = (int) ((long) this.field975 - ((long) this.field975 * var24 >> 18));
            } else if (var8.field6091 == 2) {
                int var26 = var4 - this.field974.field3199.field5035;
                int var27 = var5 - this.field974.field3199.field5048;
                int var28 = var6 - this.field974.field3199.field5043;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field6104 * var29 * arg1);
                this.field975 = (int) ((long) this.field975 - ((long) this.field975 * var30 >> 28));
            }
            if (var8.field6120 != null) {
                class66 var32 = var7.field7846.field8428;
                for (class66 var33 = var32.field848; var32 != var33; var33 = var33.field848) {
                    class182 var34 = (class182) var33;
                    class585 var35 = var34.field3058;
                    if (var35.field8318 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field6120.length; ++var37) {
                            if (var8.field6120[var37] == var35.field8338) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field3053);
                            double var40 = (double) (var5 - var34.field3056);
                            double var42 = (double) (var6 - var34.field3054);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field8327)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field3057 * var42 + (double) var34.field3052 * var38 + (double) var35.field8340 * var40) * 65535.0D / ((double) var35.field8320 * var46);
                                if (!(var48 < (double) var35.field8336)) {
                                    double var50 = 0.0D;
                                    if (var35.field8335 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field8324;
                                    } else if (var35.field8335 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field8324;
                                    }
                                    if (var35.field8337 == 0) {
                                        if (var35.field8319 == 0) {
                                            var13 += ((double) var34.field3052 - var50) * (double) arg1;
                                            var15 += ((double) var35.field8340 - var50) * (double) arg1;
                                            var17 += ((double) var34.field3057 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field6711 = (int) ((double) super.field6711 + ((double) var34.field3052 - var50) * (double) arg1);
                                            super.field6705 = (int) ((double) super.field6705 + ((double) var35.field8340 - var50) * (double) arg1);
                                            super.field6710 = (int) ((double) super.field6710 + ((double) var34.field3057 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field8320;
                                        double var54 = var40 / var46 * (double) var35.field8320;
                                        double var56 = var42 / var46 * (double) var35.field8320;
                                        if (var35.field8319 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field6711 = (int) ((double) super.field6711 + (double) arg1 * var52);
                                            super.field6705 = (int) ((double) super.field6705 + (double) arg1 * var54);
                                            super.field6710 = (int) ((double) super.field6710 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6111 != null) {
                for (int var58 = 0; var58 < var8.field6111.length; ++var58) {
                    class182 var59 = (class182) class597.field8466.method2799(10019, (long) var8.field6111[var58]);
                    while (var59 != null) {
                        class585 var60 = var59.field3058;
                        double var61 = (double) (var4 - var59.field3053);
                        double var63 = (double) (var5 - var59.field3056);
                        double var65 = (double) (var6 - var59.field3054);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field8327) {
                            var59 = (class182) class597.field8466.method2800(51);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field3057 * var65 + (double) var59.field3052 * var61 + (double) var60.field8340 * var63) * 65535.0D / ((double) var60.field8320 * var69);
                            if (var71 < (double) var60.field8336) {
                                var59 = (class182) class597.field8466.method2800(-81);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field8335 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field8324;
                                } else if (var60.field8335 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field8324;
                                }
                                if (var60.field8337 == 0) {
                                    if (var60.field8319 == 0) {
                                        var13 += ((double) var59.field3052 - var73) * (double) arg1;
                                        var15 += ((double) var60.field8340 - var73) * (double) arg1;
                                        var17 += ((double) var59.field3057 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field6711 = (int) ((double) super.field6711 + ((double) var59.field3052 - var73) * (double) arg1);
                                        super.field6705 = (int) ((double) super.field6705 + ((double) var60.field8340 - var73) * (double) arg1);
                                        super.field6710 = (int) ((double) super.field6710 + ((double) var59.field3057 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field8320;
                                    double var77 = var63 / var69 * (double) var60.field8320;
                                    double var79 = var65 / var69 * (double) var60.field8320;
                                    if (var60.field8319 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field6711 = (int) ((double) super.field6711 + (double) arg1 * var75);
                                        super.field6705 = (int) ((double) super.field6705 + (double) arg1 * var77);
                                        super.field6710 = (int) ((double) super.field6710 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class182) class597.field8466.method2800(-90);
                            }
                        }
                    }
                }
            }
            if (var8.field6087 != null) {
                if (var8.field6107 == null) {
                    var8.field6107 = new int[var8.field6087.length];
                    for (int var81 = 0; var81 < var8.field6087.length; ++var81) {
                        class576.method3379(var8.field6087[var81], (byte) 121);
                        var8.field6107[var81] = ((class160) class140.field2364.method1558((long) var8.field6087[var81], (byte) -93)).field2728;
                    }
                }
                for (int var82 = 0; var82 < var8.field6107.length; ++var82) {
                    class585 var83 = class565.field8115[var8.field6107[var82]];
                    if (var83.field8319 == 0) {
                        var13 += (double) (var83.field8334 * arg1);
                        var15 += (double) (var83.field8340 * arg1);
                        var17 += (double) (var83.field8326 * arg1);
                        var19 = true;
                    } else {
                        super.field6711 += var83.field8334 * arg1;
                        super.field6705 += var83.field8340 * arg1;
                        super.field6710 += var83.field8326 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field976 = (short) ((int) var13);
                        this.field973 = (short) ((int) var15);
                        this.field978 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field975 <<= 1;
                }
            }
            super.field6711 = (int) ((long) super.field6711 + ((long) (this.field975 << 2) * (long) this.field976 >> 23) * (long) arg1);
            super.field6705 = (int) ((long) super.field6705 + ((long) (this.field975 << 2) * (long) this.field973 >> 23) * (long) arg1);
            super.field6710 = (int) ((long) super.field6710 + ((long) (this.field975 << 2) * (long) this.field978 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lr;J)V")
    public final void method761(class167 arg0, long arg1) {
        int var4 = super.field6711 >> class439.field6699 + 12;
        int var5 = super.field6710 >> class439.field6699 + 12;
        int var6 = super.field6705 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class43.field597 && var5 >= 0 && var5 < class541.field7896) {
            class536 var7 = this.field974.field3191;
            class391 var8 = this.field974.field3192;
            class37[] var9 = class587.field8346;
            int var10 = var7.field7851;
            class252 var11 = class454.field6818[var7.field7851][var4][var5];
            if (var11 != null) {
                var10 = var11.field4035;
            }
            int var12 = var9[var10].method479(var5, var4, 89);
            int var13;
            if (var10 < class524.field7649 - 1) {
                var13 = var9[var10 + 1].method479(var5, var4, -117);
            } else {
                var13 = var12 - (8 << class439.field6699);
            }
            if (var8.field6096) {
                if (var8.field6084 == -1 && var6 > var12) {
                    this.method758();
                    return;
                }
                if (var8.field6084 >= 0 && var6 > var9[var8.field6084].method479(var5, var4, -99)) {
                    this.method758();
                    return;
                }
                if (var8.field6115 == -1 && var6 < var13) {
                    this.method758();
                    return;
                }
                if (var8.field6115 >= 0 && var6 < var9[var8.field6115 + 1].method479(var5, var4, -93)) {
                    this.method758();
                    return;
                }
            }
            int var14;
            for (var14 = class524.field7649 - 1; var14 > 0 && var6 > var9[var14].method479(var5, var4, 109); --var14) {
            }
            if (var8.field6090 && var14 == 0 && var6 > var9[0].method479(var5, var4, -102)) {
                this.method758();
            } else if (class524.field7649 - 1 == var14 && var9[var14].method479(var5, var4, 41) - var6 > 8 << class439.field6699) {
                this.method758();
            } else {
                class252 var15 = class454.field6818[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class454.field6818[0][var4][var5] == null) {
                        var15 = class454.field6818[0][var4][var5] = new class252(0);
                    }
                    boolean var16 = class454.field6818[0][var4][var5].field4030 != null;
                    if (var14 == 3 && var16) {
                        this.method758();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class454.field6818[var17][var4][var5] == null) {
                            var15 = class454.field6818[var17][var4][var5] = new class252(var17);
                            if (var16) {
                                ++var15.field4035;
                            }
                        }
                    }
                }
                if (var8.field6052) {
                    int var18 = super.field6711 >> 12;
                    int var19 = super.field6710 >> 12;
                    if (var15.field4029 != null) {
                        class334 var20 = var15.field4029.method408((byte) 111, arg0);
                        if (var20 != null && var20.method2314((byte) -2, var6, var18, var19)) {
                            this.method758();
                            return;
                        }
                    }
                    if (var15.field4019 != null) {
                        class334 var21 = var15.field4019.method408((byte) 111, arg0);
                        if (var21 != null && var21.method2314((byte) -2, var6, var18, var19)) {
                            this.method758();
                            return;
                        }
                    }
                    if (var15.field4025 != null) {
                        class334 var22 = var15.field4025.method408((byte) 111, arg0);
                        if (var22 != null && var22.method2314((byte) -2, var6, var18, var19)) {
                            this.method758();
                            return;
                        }
                    }
                    for (class531 var23 = var15.field4026; var23 != null; var23 = var23.field7736) {
                        class334 var24 = var23.field7739.method408((byte) 111, arg0);
                        if (var24 != null && var24.method2314((byte) -2, var6, var18, var19)) {
                            this.method758();
                            return;
                        }
                    }
                }
                var7.field7852.field999.method1896(this, (byte) -107);
            }
        } else {
            this.method758();
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lik;IIIIIIIIIIIZZ)V")
    public final void method762(class193 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field974 = arg0;
        super.field6711 = arg1 << 12;
        super.field6705 = arg2 << 12;
        super.field6710 = arg3 << 12;
        super.field6708 = arg9;
        this.field972 = this.field979 = (short) arg8;
        super.field6709 = arg10;
        super.field6701 = arg11;
        super.field6703 = arg13;
        this.field976 = (short) arg4;
        this.field973 = (short) arg5;
        this.field978 = (short) arg6;
        this.field975 = arg7;
        super.field6706 = this.field974.field3201.field6275;
        this.method759();
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lik;IIIIIIIIIIIZZ)V")
    public class77(class193 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field974 = arg0;
        super.field6711 = arg1 << 12;
        super.field6705 = arg2 << 12;
        super.field6710 = arg3 << 12;
        super.field6708 = arg9;
        this.field972 = this.field979 = (short) arg8;
        super.field6709 = arg10;
        super.field6701 = arg11;
        super.field6703 = arg13;
        this.field976 = (short) arg4;
        this.field973 = (short) arg5;
        this.field978 = (short) arg6;
        this.field975 = arg7;
        super.field6706 = this.field974.field3201.field6275;
        this.method759();
    }
}
