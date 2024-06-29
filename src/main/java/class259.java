import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class259 extends class668 {

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "Lat;")
    public class376 field3736;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "S")
    private short field3738;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "S")
    private short field3734;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "S")
    private short field3735;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "S")
    private short field3737;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "S")
    private short field3733;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "S")
    private short field3739;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lat;IIIIIIIIIIIZZ)V")
    public final void method1697(class376 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3736 = arg0;
        super.field9077 = arg1 << 12;
        super.field9079 = arg2 << 12;
        super.field9072 = arg3 << 12;
        super.field9084 = arg9;
        this.field3734 = this.field3738 = (short) arg8;
        super.field9080 = arg10;
        super.field9082 = arg11;
        super.field9074 = arg13;
        this.field3735 = (short) arg4;
        this.field3737 = (short) arg5;
        this.field3733 = (short) arg6;
        this.field3740 = arg7;
        super.field9085 = this.field3736.field5269.field7489;
        this.method1700();
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
    public final void method1698() {
        this.field3736.field5266.field7531[this.field3739] = null;
        class110.field1327[class33.field436] = this;
        class33.field436 = class33.field436 + 1 & 1023;
        this.method3646((byte) -127);
        this.method3624((byte) 88);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lha;J)V")
    public final void method1699(class58 arg0, long arg1) {
        int var4 = super.field9077 >> class660.field9038 + 12;
        int var5 = super.field9072 >> class660.field9038 + 12;
        int var6 = super.field9079 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class492.field6939 && var5 >= 0 && var5 < class365.field5171) {
            class537 var7 = this.field3736.field5266;
            class487 var8 = this.field3736.field5264;
            class278[] var9 = class459.field6474;
            int var10 = var7.field7538;
            class165 var11 = class553.field7776[var7.field7538][var4][var5];
            if (var11 != null) {
                var10 = var11.field2274;
            }
            int var12 = var9[var10].method1816((byte) -110, var5, var4);
            int var13;
            if (var10 < class634.field8744 - 1) {
                var13 = var9[var10 + 1].method1816((byte) 124, var5, var4);
            } else {
                var13 = var12 - (8 << class660.field9038);
            }
            if (var8.field6827) {
                if (var8.field6828 == -1 && var6 > var12) {
                    this.method1698();
                    return;
                }
                if (var8.field6828 >= 0 && var6 > var9[var8.field6828].method1816((byte) 122, var5, var4)) {
                    this.method1698();
                    return;
                }
                if (var8.field6865 == -1 && var6 < var13) {
                    this.method1698();
                    return;
                }
                if (var8.field6865 >= 0 && var6 < var9[var8.field6865 + 1].method1816((byte) 127, var5, var4)) {
                    this.method1698();
                    return;
                }
            }
            int var14;
            for (var14 = class634.field8744 - 1; var14 > 0 && var6 > var9[var14].method1816((byte) -109, var5, var4); --var14) {
            }
            if (var8.field6889 && var14 == 0 && var6 > var9[0].method1816((byte) -109, var5, var4)) {
                this.method1698();
            } else if (class634.field8744 - 1 == var14 && var9[var14].method1816((byte) 127, var5, var4) - var6 > 8 << class660.field9038) {
                this.method1698();
            } else {
                class165 var15 = class553.field7776[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class553.field7776[0][var4][var5] == null) {
                        var15 = class553.field7776[0][var4][var5] = new class165(0);
                    }
                    boolean var16 = class553.field7776[0][var4][var5].field2272 != null;
                    if (var14 == 3 && var16) {
                        this.method1698();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class553.field7776[var17][var4][var5] == null) {
                            var15 = class553.field7776[var17][var4][var5] = new class165(var17);
                            if (var16) {
                                ++var15.field2274;
                            }
                        }
                    }
                }
                if (var8.field6885) {
                    int var18 = super.field9077 >> 12;
                    int var19 = super.field9072 >> 12;
                    if (var15.field2269 != null) {
                        class566 var20 = var15.field2269.method744(0, arg0);
                        if (var20 != null && var20.method3261(var19, var6, var18, (byte) 90)) {
                            this.method1698();
                            return;
                        }
                    }
                    if (var15.field2265 != null) {
                        class566 var21 = var15.field2265.method744(0, arg0);
                        if (var21 != null && var21.method3261(var19, var6, var18, (byte) 94)) {
                            this.method1698();
                            return;
                        }
                    }
                    if (var15.field2266 != null) {
                        class566 var22 = var15.field2266.method744(0, arg0);
                        if (var22 != null && var22.method3261(var19, var6, var18, (byte) -64)) {
                            this.method1698();
                            return;
                        }
                    }
                    for (class356 var23 = var15.field2270; var23 != null; var23 = var23.field5066) {
                        class566 var24 = var23.field5067.method744(0, arg0);
                        if (var24 != null && var24.method3261(var19, var6, var18, (byte) 93)) {
                            this.method1698();
                            return;
                        }
                    }
                }
                var7.field7541.field578.method2059(4096, this);
            }
        } else {
            this.method1698();
        }
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()V")
    private final void method1700() {
        int var1 = this.field3736.field5266.field7532;
        if (this.field3736.field5266.field7531[var1] != null) {
            this.field3736.field5266.field7531[var1].method1698();
        }
        this.field3736.field5266.field7531[var1] = this;
        this.field3739 = (short) this.field3736.field5266.field7532;
        this.field3736.field5266.field7532 = var1 + 1 & 8191;
        this.field3736.field5274.method2307(0, this);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)V")
    public final void method1701(long arg0, int arg1) {
        this.field3738 = (short) (this.field3738 - arg1);
        if (this.field3738 <= 0) {
            this.method1698();
        } else {
            int var4 = super.field9077 >> 12;
            int var5 = super.field9079 >> 12;
            int var6 = super.field9072 >> 12;
            class537 var7 = this.field3736.field5266;
            class487 var8 = this.field3736.field5264;
            if (var8.field6847 != 0) {
                if (this.field3734 - this.field3738 <= var8.field6880) {
                    int var9 = var8.field6875 * arg1 + (super.field9084 >> 8 & 65280) + (this.field3732 >> 16 & 255);
                    int var10 = var8.field6881 * arg1 + (this.field3732 >> 8 & 255) + (super.field9084 & 65280);
                    int var11 = var8.field6823 * arg1 + (super.field9084 << 8 & 65280) + (this.field3732 & 255);
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
                    super.field9084 &= -16777216;
                    super.field9084 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3732 &= -16777216;
                    this.field3732 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3734 - this.field3738 <= var8.field6873) {
                    int var12 = var8.field6835 * arg1 + (super.field9084 >> 16 & 65280) + (this.field3732 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field9084 &= 16777215;
                    super.field9084 |= (var12 & 65280) << 16;
                    this.field3732 &= 16777215;
                    this.field3732 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6848 != -1 && this.field3734 - this.field3738 <= var8.field6858) {
                this.field3740 += var8.field6842 * arg1;
            }
            if (var8.field6883 != -1 && this.field3734 - this.field3738 <= var8.field6876) {
                super.field9080 += var8.field6824 * arg1;
            }
            double var13 = (double) this.field3735;
            double var15 = (double) this.field3737;
            double var17 = (double) this.field3733;
            boolean var19 = false;
            if (var8.field6879 == 1) {
                int var20 = var4 - this.field3736.field5268.field5131;
                int var21 = var5 - this.field3736.field5268.field5133;
                int var22 = var6 - this.field3736.field5268.field5141;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field6878 * var23 * arg1);
                this.field3740 = (int) ((long) this.field3740 - ((long) this.field3740 * var24 >> 18));
            } else if (var8.field6879 == 2) {
                int var26 = var4 - this.field3736.field5268.field5131;
                int var27 = var5 - this.field3736.field5268.field5133;
                int var28 = var6 - this.field3736.field5268.field5141;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field6878 * var29 * arg1);
                this.field3740 = (int) ((long) this.field3740 - ((long) this.field3740 * var30 >> 28));
            }
            if (var8.field6874 != null) {
                class189 var32 = var7.field7535.field6565;
                for (class189 var33 = var32.field2543; var32 != var33; var33 = var33.field2543) {
                    class511 var34 = (class511) var33;
                    class503 var35 = var34.field7301;
                    if (var35.field7211 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field6874.length; ++var37) {
                            if (var8.field6874[var37] == var35.field7214) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field7307);
                            double var40 = (double) (var5 - var34.field7313);
                            double var42 = (double) (var6 - var34.field7309);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field7218)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field7302 * var42 + (double) var34.field7306 * var38 + (double) var35.field7215 * var40) * 65535.0D / ((double) var35.field7220 * var46);
                                if (!(var48 < (double) var35.field7213)) {
                                    double var50 = 0.0D;
                                    if (var35.field7222 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field7217;
                                    } else if (var35.field7222 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field7217;
                                    }
                                    if (var35.field7210 == 0) {
                                        if (var35.field7221 == 0) {
                                            var13 += ((double) var34.field7306 - var50) * (double) arg1;
                                            var15 += ((double) var35.field7215 - var50) * (double) arg1;
                                            var17 += ((double) var34.field7302 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field9077 = (int) ((double) super.field9077 + ((double) var34.field7306 - var50) * (double) arg1);
                                            super.field9079 = (int) ((double) super.field9079 + ((double) var35.field7215 - var50) * (double) arg1);
                                            super.field9072 = (int) ((double) super.field9072 + ((double) var34.field7302 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field7220;
                                        double var54 = var40 / var46 * (double) var35.field7220;
                                        double var56 = var42 / var46 * (double) var35.field7220;
                                        if (var35.field7221 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field9077 = (int) ((double) super.field9077 + (double) arg1 * var52);
                                            super.field9079 = (int) ((double) super.field9079 + (double) arg1 * var54);
                                            super.field9072 = (int) ((double) super.field9072 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6831 != null) {
                for (int var58 = 0; var58 < var8.field6831.length; ++var58) {
                    class511 var59 = (class511) class243.field3248.method2033(-1, (long) var8.field6831[var58]);
                    while (var59 != null) {
                        class503 var60 = var59.field7301;
                        double var61 = (double) (var4 - var59.field7307);
                        double var63 = (double) (var5 - var59.field7313);
                        double var65 = (double) (var6 - var59.field7309);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field7218) {
                            var59 = (class511) class243.field3248.method2034(-23702);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field7302 * var65 + (double) var59.field7306 * var61 + (double) var60.field7215 * var63) * 65535.0D / ((double) var60.field7220 * var69);
                            if (var71 < (double) var60.field7213) {
                                var59 = (class511) class243.field3248.method2034(-23702);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field7222 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field7217;
                                } else if (var60.field7222 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field7217;
                                }
                                if (var60.field7210 == 0) {
                                    if (var60.field7221 == 0) {
                                        var13 += ((double) var59.field7306 - var73) * (double) arg1;
                                        var15 += ((double) var60.field7215 - var73) * (double) arg1;
                                        var17 += ((double) var59.field7302 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field9077 = (int) ((double) super.field9077 + ((double) var59.field7306 - var73) * (double) arg1);
                                        super.field9079 = (int) ((double) super.field9079 + ((double) var60.field7215 - var73) * (double) arg1);
                                        super.field9072 = (int) ((double) super.field9072 + ((double) var59.field7302 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field7220;
                                    double var77 = var63 / var69 * (double) var60.field7220;
                                    double var79 = var65 / var69 * (double) var60.field7220;
                                    if (var60.field7221 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field9077 = (int) ((double) super.field9077 + (double) arg1 * var75);
                                        super.field9079 = (int) ((double) super.field9079 + (double) arg1 * var77);
                                        super.field9072 = (int) ((double) super.field9072 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class511) class243.field3248.method2034(-23702);
                            }
                        }
                    }
                }
            }
            if (var8.field6853 != null) {
                if (var8.field6825 == null) {
                    var8.field6825 = new int[var8.field6853.length];
                    for (int var81 = 0; var81 < var8.field6853.length; ++var81) {
                        class398.method2487(var8.field6853[var81], false);
                        var8.field6825[var81] = ((class756) class611.field8577.method1180((byte) 26, (long) var8.field6853[var81])).field10518;
                    }
                }
                for (int var82 = 0; var82 < var8.field6825.length; ++var82) {
                    class503 var83 = class423.field5964[var8.field6825[var82]];
                    if (var83.field7221 == 0) {
                        var13 += (double) (var83.field7219 * arg1);
                        var15 += (double) (var83.field7215 * arg1);
                        var17 += (double) (var83.field7226 * arg1);
                        var19 = true;
                    } else {
                        super.field9077 += var83.field7219 * arg1;
                        super.field9079 += var83.field7215 * arg1;
                        super.field9072 += var83.field7226 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field3735 = (short) ((int) var13);
                        this.field3737 = (short) ((int) var15);
                        this.field3733 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field3740 <<= 1;
                }
            }
            super.field9077 = (int) ((long) super.field9077 + ((long) (this.field3740 << 2) * (long) this.field3735 >> 23) * (long) arg1);
            super.field9079 = (int) ((long) super.field9079 + ((long) (this.field3740 << 2) * (long) this.field3737 >> 23) * (long) arg1);
            super.field9072 = (int) ((long) super.field9072 + ((long) (this.field3740 << 2) * (long) this.field3733 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lat;IIIIIIIIIIIZZ)V")
    public class259(class376 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3736 = arg0;
        super.field9077 = arg1 << 12;
        super.field9079 = arg2 << 12;
        super.field9072 = arg3 << 12;
        super.field9084 = arg9;
        this.field3734 = this.field3738 = (short) arg8;
        super.field9080 = arg10;
        super.field9082 = arg11;
        super.field9074 = arg13;
        this.field3735 = (short) arg4;
        this.field3737 = (short) arg5;
        this.field3733 = (short) arg6;
        this.field3740 = arg7;
        super.field9085 = this.field3736.field5269.field7489;
        this.method1700();
    }
}
