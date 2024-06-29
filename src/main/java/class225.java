import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class225 extends class10 {

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "Z")
    public boolean field4107 = false;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lqg;")
    public class103 field4099;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "S")
    private short field4104;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "S")
    private short field4109;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "S")
    private short field4105;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "S")
    private short field4106;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "S")
    private short field4108;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "I")
    private static int field4095 = 12;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field4101;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "S")
    private short field4096;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(JI)V")
    public final void method1583(long arg0, int arg1) {
        if (this.field4099 == null) {
            return;
        }
        this.field4104 = (short) (this.field4104 - arg1);
        if (this.field4104 <= 0) {
            this.method1585();
            return;
        }
        int var4 = this.field4097 >> field4095;
        int var5 = this.field4098 >> field4095;
        int var6 = this.field4103 >> field4095;
        class221 var7 = this.field4099.field1971;
        class169 var8 = this.field4099.field1991;
        if (var8.field3040 != 0) {
            if (this.field4109 - this.field4104 <= var8.field3082) {
                int var9 = var8.field3072 * arg1 + (this.field4102 >> 8 & 0xFF00) + (this.field4101 >> 16 & 0xFF);
                int var10 = var8.field3068 * arg1 + (this.field4101 >> 8 & 0xFF) + (this.field4102 & 0xFF00);
                int var11 = var8.field3069 * arg1 + (this.field4102 & 0xFF << 8) + (this.field4101 & 0xFF);
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
                this.field4102 &= 0xFF000000;
                this.field4102 |= ((var11 & 0xFF00) >> 8) + ((var9 & 0xFF00) << 8) + (var10 & 0xFF00);
                this.field4101 &= 0xFF000000;
                this.field4101 |= (var11 & 0xFF) + ((var9 & 0xFF) << 16) + ((var10 & 0xFF) << 8);
            }
            if (this.field4109 - this.field4104 <= var8.field3050) {
                int var12 = var8.field3095 * arg1 + (this.field4102 >> 16 & 0xFF00) + (this.field4101 >> 24 & 0xFF);
                if (var12 < 0) {
                    var12 = 0;
                } else if (var12 > 65535) {
                    var12 = 65535;
                }
                this.field4102 &= 0xFFFFFF;
                this.field4102 |= (var12 & 0xFF00) << 16;
                this.field4101 &= 0xFFFFFF;
                this.field4101 |= (var12 & 0xFF) << 24;
            }
        }
        if (var8.field3065 != -1 && this.field4109 - this.field4104 <= var8.field3060) {
            this.field4100 += var8.field3037 * arg1;
        }
        int var13 = this.field4105;
        int var14 = this.field4106;
        int var15 = this.field4108;
        boolean var16 = false;
        if (var8.field3056 == 1) {
            int var17 = var4 - this.field4099.field1975;
            int var18 = var5 - this.field4099.field1966;
            int var19 = var6 - this.field4099.field1967;
            int var20 = (int) Math.sqrt((double) (var19 * var19 + var17 * var17 + var18 * var18));
            long var21 = (long) (var8.field3058 * var20 * arg1);
            this.field4100 = (int) ((long) this.field4100 - ((long) this.field4100 * var21 >> 18));
        } else if (var8.field3056 == 2) {
            int var23 = var4 - this.field4099.field1975;
            int var24 = var5 - this.field4099.field1966;
            int var25 = var6 - this.field4099.field1967;
            int var26 = var25 * var25 + var23 * var23 + var24 * var24;
            long var27 = (long) (var8.field3058 * var26 * arg1);
            this.field4100 = (int) ((long) this.field4100 - ((long) this.field4100 * var27 >> 28));
        }
        class34 var29 = var7.field4032.field2931;
        for (class34 var30 = var29.field595; var30 != var29; var30 = var30.field595) {
            class191 var56 = (class191) var30;
            class266 var57 = var56.field3464.field1938;
            if (var57.field4762 != 1) {
                int var58 = var4 - var56.field3472;
                int var59 = var5 - var56.field3470;
                int var60 = var6 - var56.field3453;
                long var61 = (long) (var60 * var60 + var58 * var58 + var59 * var59);
                if (var61 <= var57.field4788) {
                    int var63 = (int) Math.sqrt((double) var61);
                    if (var63 == 0) {
                        var63 = 1;
                    }
                    long var64 = (long) (var56.field3463 * var60 + var56.field3456 * var58 + var57.field4766 * var59) * 65535L / (long) (var57.field4768 * var63);
                    if (var64 >= (long) var57.field4775) {
                        int var66 = 0;
                        if (var57.field4790 == 1) {
                            var66 = (var63 >> 4) * var57.field4781;
                        } else if (var57.field4790 == 2) {
                            var66 = (var63 >> 4) * (var63 >> 4) * var57.field4781;
                        }
                        if (var57.field4770 != 0) {
                            int var67 = (var58 << 15) / var63 * var57.field4768;
                            int var68 = (var59 << 15) / var63 * var57.field4768;
                            int var69 = (var60 << 15) / var63 * var57.field4768;
                            if (var57.field4772 == 0) {
                                var13 += arg1 * var67 >> 15;
                                var14 += arg1 * var68 >> 15;
                                var15 += arg1 * var69 >> 15;
                                var16 = true;
                            } else {
                                this.field4097 += arg1 * var67 >> 15;
                                this.field4098 += arg1 * var68 >> 15;
                                this.field4103 += arg1 * var69 >> 15;
                            }
                        } else if (var57.field4772 == 0) {
                            var13 += (var56.field3456 - var66) * arg1;
                            var14 += (var57.field4766 - var66) * arg1;
                            var15 += (var56.field3463 - var66) * arg1;
                            var16 = true;
                        } else {
                            this.field4097 += (var56.field3456 - var66) * arg1;
                            this.field4098 += (var57.field4766 - var66) * arg1;
                            this.field4103 += (var56.field3463 - var66) * arg1;
                        }
                    }
                }
            }
        }
        if (var8.field3070 != null) {
            for (int var31 = 0; var31 < var8.field3070.length; var31++) {
                class191 var32 = (class191) class221.field4026.method1221(false, (long) var8.field3070[var31]);
                while (var32 != null) {
                    class266 var33 = var32.field3464.field1938;
                    int var34 = var4 - var32.field3472;
                    int var35 = var5 - var32.field3470;
                    int var36 = var6 - var32.field3453;
                    long var37 = (long) (var36 * var36 + var34 * var34 + var35 * var35);
                    if (var37 > var33.field4788) {
                        var32 = (class191) class221.field4026.method1224((byte) -95);
                    } else {
                        int var39 = (int) Math.sqrt((double) var37);
                        if (var39 == 0) {
                            var39 = 1;
                        }
                        long var40 = (long) (var32.field3463 * var36 + var32.field3456 * var34 + var33.field4766 * var35) * 65535L / (long) (var33.field4768 * var39);
                        if (var40 < (long) var33.field4775) {
                            var32 = (class191) class221.field4026.method1224((byte) -95);
                        } else {
                            int var42 = 0;
                            if (var33.field4790 == 1) {
                                var42 = (var39 >> 4) * var33.field4781;
                            } else if (var33.field4790 == 2) {
                                var42 = (var39 >> 4) * (var39 >> 4) * var33.field4781;
                            }
                            if (var33.field4770 != 0) {
                                int var43 = (var34 << 15) / var39 * var33.field4768;
                                int var44 = (var35 << 15) / var39 * var33.field4768;
                                int var45 = (var36 << 15) / var39 * var33.field4768;
                                if (var33.field4772 == 0) {
                                    var13 += arg1 * var43 >> 15;
                                    var14 += arg1 * var44 >> 15;
                                    var15 += arg1 * var45 >> 15;
                                    var16 = true;
                                } else {
                                    this.field4097 += arg1 * var43 >> 15;
                                    this.field4098 += arg1 * var44 >> 15;
                                    this.field4103 += arg1 * var45 >> 15;
                                }
                            } else if (var33.field4772 == 0) {
                                var13 += (var32.field3456 - var42) * arg1;
                                var14 += (var33.field4766 - var42) * arg1;
                                var15 += (var32.field3463 - var42) * arg1;
                                var16 = true;
                            } else {
                                this.field4097 += (var32.field3456 - var42) * arg1;
                                this.field4098 += (var33.field4766 - var42) * arg1;
                                this.field4103 += (var32.field3463 - var42) * arg1;
                            }
                            var32 = (class191) class221.field4026.method1224((byte) -95);
                        }
                    }
                }
            }
        }
        if (var8.field3046 != null) {
            for (int var46 = 0; var46 < var8.field3046.length; var46++) {
                class266 var47 = class168.method1157((byte) -72, var8.field3046[var46]);
                if (var47.field4772 == 0) {
                    var13 += var47.field4767 * arg1;
                    var14 += var47.field4766 * arg1;
                    var15 += var47.field4782 * arg1;
                    var16 = true;
                } else {
                    this.field4097 += var47.field4767 * arg1;
                    this.field4098 += var47.field4766 * arg1;
                    this.field4103 += var47.field4782 * arg1;
                }
            }
        }
        if (var16) {
            while (true) {
                if (var13 <= 32767 && var14 <= 32767 && var15 <= 32767 && var13 >= -32767 && var14 >= -32767 && var15 >= -32767) {
                    this.field4105 = (short) var13;
                    this.field4106 = (short) var14;
                    this.field4108 = (short) var15;
                    break;
                }
                var13 >>= 0x1;
                var14 >>= 0x1;
                var15 >>= 0x1;
                this.field4100 <<= 0x1;
            }
        }
        this.field4097 = (int) ((long) this.field4097 + ((long) this.field4105 * (long) this.field4100 >> 23) * (long) arg1);
        this.field4098 = (int) ((long) this.field4098 + ((long) this.field4106 * (long) this.field4100 >> 23) * (long) arg1);
        this.field4103 = (int) ((long) this.field4103 + ((long) this.field4108 * (long) this.field4100 >> 23) * (long) arg1);
        int var48 = this.field4097 >> 19;
        int var49 = this.field4103 >> 19;
        int var50 = this.field4098 >> field4095;
        if (var50 > 0 || var50 < -65535 || var48 < 0 || var48 >= class56.field1154 || var49 < 0 || var49 >= class277.field4879) {
            this.method1585();
            return;
        }
        int[][][] var51 = class271.field4803;
        int var52 = var51[var7.field4039][var48][var49];
        int var53;
        if (var7.field4039 < 3) {
            var53 = var51[var7.field4039 + 1][var48][var49];
        } else {
            var53 = var51[var7.field4039][var48][var49] - 1024;
        }
        if (var8.field3041) {
            if (var8.field3064 == -1 && var50 > var52) {
                this.method1585();
                return;
            }
            if (var8.field3064 >= 0 && var50 > var51[var8.field3064][var48][var49]) {
                this.method1585();
                return;
            }
            if (var8.field3066 == -1 && var50 < var53) {
                this.method1585();
                return;
            }
            if (var8.field3066 >= 0 && var50 < var51[var8.field3066 + 1][var48][var49]) {
                this.method1585();
                return;
            }
        }
        if (var48 >= var7.field4042 && var48 <= var7.field4034 && var49 >= var7.field4035 && var49 <= var7.field4045 && var50 <= var7.field4048 && var50 >= var7.field4046) {
            this.field4107 = false;
            return;
        }
        this.field4107 = true;
        byte var54 = 3;
        if (var50 > var51[1][var48][var49]) {
            var54 = 0;
        } else if (var50 > var51[2][var48][var49]) {
            var54 = 1;
        } else if (var50 > var51[3][var48][var49]) {
            var54 = 2;
        } else if (var50 < var51[3][var48][var49] - 1024) {
            this.method1585();
            return;
        }
        class109 var55 = class106.field2089[var54][var48][var49];
        if (var55 == null) {
            var55 = class106.field2089[var54][var48][var49] = new class109(var54, var48, var49);
        }
        if (var55.field2205 == null) {
            var55.field2205 = new class249();
            var55.field2219 = (byte) ((int) (arg0 & 0xFFL));
        } else if ((byte) ((int) (arg0 & 0xFFL)) != var55.field2219) {
            var55.field2205.method1726((byte) 74);
            var55.field2219 = (byte) ((int) (arg0 & 0xFFL));
        }
        var55.field2205.method1729(this, (byte) 104);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lqg;IIIIIIIII)V")
    public final void method1584(class103 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4099 = arg0;
        this.field4097 = arg1 << field4095;
        this.field4098 = arg2 << field4095;
        this.field4103 = arg3 << field4095;
        this.field4102 = arg9;
        this.field4109 = this.field4104 = (short) arg8;
        this.field4105 = (short) arg4;
        this.field4106 = (short) arg5;
        this.field4108 = (short) arg6;
        this.field4100 = arg7;
        this.method1586();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V")
    private final void method1585() {
        this.field4099.field1971.field4015[this.field4096] = null;
        class221.field4017[class221.field4012] = this;
        class221.field4012 = class221.field4012 + 1 & 0x3FF;
        this.field4099 = null;
        this.method1754(-64);
        this.method89((byte) 112);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()V")
    private final void method1586() {
        int var1 = this.field4099.field1971.field4023;
        if (this.field4099.field1971.field4015[var1] != null) {
            this.field4099.field1971.field4015[var1].method1585();
        }
        this.field4099.field1971.field4015[var1] = this;
        this.field4096 = (short) this.field4099.field1971.field4023;
        this.field4099.field1971.field4023 = var1 + 1 & 0x1FFF;
        this.field4099.field1986.method1023(this, false);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lqg;IIIIIIIII)V")
    public class225(class103 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field4099 = arg0;
        this.field4097 = arg1 << field4095;
        this.field4098 = arg2 << field4095;
        this.field4103 = arg3 << field4095;
        this.field4102 = arg9;
        this.field4109 = this.field4104 = (short) arg8;
        this.field4105 = (short) arg4;
        this.field4106 = (short) arg5;
        this.field4108 = (short) arg6;
        this.field4100 = arg7;
        this.method1586();
    }
}
