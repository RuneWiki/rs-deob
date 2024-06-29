import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class272 extends class354 {

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Lpga;")
    public class559 field3926;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "S")
    private short field3934;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "S")
    private short field3928;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "S")
    private short field3931;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "S")
    private short field3932;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "S")
    private short field3930;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    private int field3927;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
    private int field3933;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "S")
    private short field3929;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V")
    private final void method1752() {
        int var1 = this.field3926.field7952.field8343;
        if (this.field3926.field7952.field8345[var1] != null) {
            this.field3926.field7952.field8345[var1].method1756();
        }
        this.field3926.field7952.field8345[var1] = this;
        this.field3929 = (short) this.field3926.field7952.field8343;
        this.field3926.field7952.field8343 = var1 + 1 & 8191;
        this.field3926.field7957.method2173(127, this);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lpga;IIIIIIIIIIIZZ)V")
    public final void method1753(class559 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3926 = arg0;
        super.field4979 = arg1 << 12;
        super.field4976 = arg2 << 12;
        super.field4986 = arg3 << 12;
        super.field4988 = arg9;
        this.field3928 = this.field3934 = (short) arg8;
        super.field4985 = arg10;
        super.field4987 = arg11;
        super.field4982 = arg13;
        this.field3931 = (short) arg4;
        this.field3932 = (short) arg5;
        this.field3930 = (short) arg6;
        this.field3927 = arg7;
        super.field4984 = this.field3926.field7953.field975;
        this.method1752();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lha;J)V")
    public final void method1754(class65 arg0, long arg1) {
        int var4 = super.field4979 >> class645.field9018 + 12;
        int var5 = super.field4986 >> class645.field9018 + 12;
        int var6 = super.field4976 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class81.field902 && var5 >= 0 && var5 < class48.field615) {
            class593 var7 = this.field3926.field7952;
            class741 var8 = this.field3926.field7946;
            class294[] var9 = class208.field3219;
            int var10 = var7.field8355;
            class46 var11 = class767.field10562[var7.field8355][var4][var5];
            if (var11 != null) {
                var10 = var11.field585;
            }
            int var12 = var9[var10].method1904(var5, (byte) 38, var4);
            int var13;
            if (var10 < class562.field7990 - 1) {
                var13 = var9[var10 + 1].method1904(var5, (byte) -125, var4);
            } else {
                var13 = var12 - (8 << class645.field9018);
            }
            if (var8.field10265) {
                if (var8.field10236 == -1 && var6 > var12) {
                    this.method1756();
                    return;
                }
                if (var8.field10236 >= 0 && var6 > var9[var8.field10236].method1904(var5, (byte) 42, var4)) {
                    this.method1756();
                    return;
                }
                if (var8.field10223 == -1 && var6 < var13) {
                    this.method1756();
                    return;
                }
                if (var8.field10223 >= 0 && var6 < var9[var8.field10223 + 1].method1904(var5, (byte) 33, var4)) {
                    this.method1756();
                    return;
                }
            }
            int var14;
            for (var14 = class562.field7990 - 1; var14 > 0 && var6 > var9[var14].method1904(var5, (byte) 21, var4); --var14) {
            }
            if (var8.field10230 && var14 == 0 && var6 > var9[0].method1904(var5, (byte) 80, var4)) {
                this.method1756();
            } else if (class562.field7990 - 1 == var14 && var9[var14].method1904(var5, (byte) -127, var4) - var6 > 8 << class645.field9018) {
                this.method1756();
            } else {
                class46 var15 = class767.field10562[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class767.field10562[0][var4][var5] == null) {
                        var15 = class767.field10562[0][var4][var5] = new class46(0);
                    }
                    boolean var16 = class767.field10562[0][var4][var5].field583 != null;
                    if (var14 == 3 && var16) {
                        this.method1756();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class767.field10562[var17][var4][var5] == null) {
                            var15 = class767.field10562[var17][var4][var5] = new class46(var17);
                            if (var16) {
                                ++var15.field585;
                            }
                        }
                    }
                }
                if (var8.field10220) {
                    int var18 = super.field4979 >> 12;
                    int var19 = super.field4986 >> 12;
                    if (var15.field582 != null) {
                        class281 var20 = var15.field582.method901(arg0, 96);
                        if (var20 != null && var20.method1821((byte) -127, var6, var19, var18)) {
                            this.method1756();
                            return;
                        }
                    }
                    if (var15.field589 != null) {
                        class281 var21 = var15.field589.method901(arg0, 100);
                        if (var21 != null && var21.method1821((byte) -127, var6, var19, var18)) {
                            this.method1756();
                            return;
                        }
                    }
                    if (var15.field587 != null) {
                        class281 var22 = var15.field587.method901(arg0, 57);
                        if (var22 != null && var22.method1821((byte) 115, var6, var19, var18)) {
                            this.method1756();
                            return;
                        }
                    }
                    for (class48 var23 = var15.field586; var23 != null; var23 = var23.field611) {
                        class281 var24 = var23.field605.method901(arg0, 54);
                        if (var24 != null && var24.method1821((byte) 73, var6, var19, var18)) {
                            this.method1756();
                            return;
                        }
                    }
                }
                var7.field8352.field4304.method4278(0, this);
            }
        } else {
            this.method1756();
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(JI)V")
    public final void method1755(long arg0, int arg1) {
        this.field3934 = (short) (this.field3934 - arg1);
        if (this.field3934 <= 0) {
            this.method1756();
        } else {
            int var4 = super.field4979 >> 12;
            int var5 = super.field4976 >> 12;
            int var6 = super.field4986 >> 12;
            class593 var7 = this.field3926.field7952;
            class741 var8 = this.field3926.field7946;
            if (var8.field10260 != 0) {
                if (this.field3928 - this.field3934 <= var8.field10266) {
                    int var9 = var8.field10235 * arg1 + (super.field4988 >> 8 & 65280) + (this.field3933 >> 16 & 255);
                    int var10 = var8.field10259 * arg1 + (this.field3933 >> 8 & 255) + (super.field4988 & 65280);
                    int var11 = var8.field10264 * arg1 + (super.field4988 << 8 & 65280) + (this.field3933 & 255);
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
                    super.field4988 &= -16777216;
                    super.field4988 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field3933 &= -16777216;
                    this.field3933 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field3928 - this.field3934 <= var8.field10251) {
                    int var12 = var8.field10263 * arg1 + (super.field4988 >> 16 & 65280) + (this.field3933 >> 24 & 255);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field4988 &= 16777215;
                    super.field4988 |= (var12 & 65280) << 16;
                    this.field3933 &= 16777215;
                    this.field3933 |= (var12 & 255) << 24;
                }
            }
            if (var8.field10261 != -1 && this.field3928 - this.field3934 <= var8.field10262) {
                this.field3927 += var8.field10258 * arg1;
            }
            if (var8.field10225 != -1 && this.field3928 - this.field3934 <= var8.field10269) {
                super.field4985 += var8.field10267 * arg1;
            }
            double var13 = (double) this.field3931;
            double var15 = (double) this.field3932;
            double var17 = (double) this.field3930;
            boolean var19 = false;
            if (var8.field10257 == 1) {
                int var20 = var4 - this.field3926.field7961.field7908;
                int var21 = var5 - this.field3926.field7961.field7906;
                int var22 = var6 - this.field3926.field7961.field7913;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field10213 * var23 * arg1);
                this.field3927 = (int) ((long) this.field3927 - ((long) this.field3927 * var24 >> 18));
            } else if (var8.field10257 == 2) {
                int var26 = var4 - this.field3926.field7961.field7908;
                int var27 = var5 - this.field3926.field7961.field7906;
                int var28 = var6 - this.field3926.field7961.field7913;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field10213 * var29 * arg1);
                this.field3927 = (int) ((long) this.field3927 - ((long) this.field3927 * var30 >> 28));
            }
            if (var8.field10214 != null) {
                class577 var32 = var7.field8350.field3876;
                for (class577 var33 = var32.field8131; var32 != var33; var33 = var33.field8131) {
                    class409 var34 = (class409) var33;
                    class132 var35 = var34.field5555;
                    if (var35.field1999 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field10214.length; ++var37) {
                            if (var8.field10214[var37] == var35.field2002) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field5556);
                            double var40 = (double) (var5 - var34.field5552);
                            double var42 = (double) (var6 - var34.field5553);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field1998)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field5554 * var42 + (double) var34.field5562 * var38 + (double) var35.field1989 * var40) * 65535.0D / ((double) var35.field1997 * var46);
                                if (!(var48 < (double) var35.field1992)) {
                                    double var50 = 0.0D;
                                    if (var35.field1985 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field1987;
                                    } else if (var35.field1985 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field1987;
                                    }
                                    if (var35.field1996 == 0) {
                                        if (var35.field1983 == 0) {
                                            var13 += ((double) var34.field5562 - var50) * (double) arg1;
                                            var15 += ((double) var35.field1989 - var50) * (double) arg1;
                                            var17 += ((double) var34.field5554 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field4979 = (int) ((double) super.field4979 + ((double) var34.field5562 - var50) * (double) arg1);
                                            super.field4976 = (int) ((double) super.field4976 + ((double) var35.field1989 - var50) * (double) arg1);
                                            super.field4986 = (int) ((double) super.field4986 + ((double) var34.field5554 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field1997;
                                        double var54 = var40 / var46 * (double) var35.field1997;
                                        double var56 = var42 / var46 * (double) var35.field1997;
                                        if (var35.field1983 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field4979 = (int) ((double) super.field4979 + (double) arg1 * var52);
                                            super.field4976 = (int) ((double) super.field4976 + (double) arg1 * var54);
                                            super.field4986 = (int) ((double) super.field4986 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field10275 != null) {
                for (int var58 = 0; var58 < var8.field10275.length; ++var58) {
                    class409 var59 = (class409) class216.field3354.method3372((long) var8.field10275[var58], -28519);
                    while (var59 != null) {
                        class132 var60 = var59.field5555;
                        double var61 = (double) (var4 - var59.field5556);
                        double var63 = (double) (var5 - var59.field5552);
                        double var65 = (double) (var6 - var59.field5553);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field1998) {
                            var59 = (class409) class216.field3354.method3371(false);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field5554 * var65 + (double) var59.field5562 * var61 + (double) var60.field1989 * var63) * 65535.0D / ((double) var60.field1997 * var69);
                            if (var71 < (double) var60.field1992) {
                                var59 = (class409) class216.field3354.method3371(false);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field1985 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field1987;
                                } else if (var60.field1985 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field1987;
                                }
                                if (var60.field1996 == 0) {
                                    if (var60.field1983 == 0) {
                                        var13 += ((double) var59.field5562 - var73) * (double) arg1;
                                        var15 += ((double) var60.field1989 - var73) * (double) arg1;
                                        var17 += ((double) var59.field5554 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field4979 = (int) ((double) super.field4979 + ((double) var59.field5562 - var73) * (double) arg1);
                                        super.field4976 = (int) ((double) super.field4976 + ((double) var60.field1989 - var73) * (double) arg1);
                                        super.field4986 = (int) ((double) super.field4986 + ((double) var59.field5554 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field1997;
                                    double var77 = var63 / var69 * (double) var60.field1997;
                                    double var79 = var65 / var69 * (double) var60.field1997;
                                    if (var60.field1983 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field4979 = (int) ((double) super.field4979 + (double) arg1 * var75);
                                        super.field4976 = (int) ((double) super.field4976 + (double) arg1 * var77);
                                        super.field4986 = (int) ((double) super.field4986 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class409) class216.field3354.method3371(false);
                            }
                        }
                    }
                }
            }
            if (var8.field10231 != null) {
                if (var8.field10215 == null) {
                    var8.field10215 = new int[var8.field10231.length];
                    for (int var81 = 0; var81 < var8.field10231.length; ++var81) {
                        class771.method4253(11879, var8.field10231[var81]);
                        var8.field10215[var81] = ((class489) class444.field6043.method2242((long) var8.field10231[var81], -1)).field6926;
                    }
                }
                for (int var82 = 0; var82 < var8.field10215.length; ++var82) {
                    class132 var83 = class671.field9350[var8.field10215[var82]];
                    if (var83.field1983 == 0) {
                        var13 += (double) (var83.field1993 * arg1);
                        var15 += (double) (var83.field1989 * arg1);
                        var17 += (double) (var83.field1981 * arg1);
                        var19 = true;
                    } else {
                        super.field4979 += var83.field1993 * arg1;
                        super.field4976 += var83.field1989 * arg1;
                        super.field4986 += var83.field1981 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field3931 = (short) ((int) var13);
                        this.field3932 = (short) ((int) var15);
                        this.field3930 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field3927 <<= 1;
                }
            }
            super.field4979 = (int) ((long) super.field4979 + ((long) (this.field3927 << 2) * (long) this.field3931 >> 23) * (long) arg1);
            super.field4976 = (int) ((long) super.field4976 + ((long) (this.field3927 << 2) * (long) this.field3932 >> 23) * (long) arg1);
            super.field4986 = (int) ((long) super.field4986 + ((long) (this.field3927 << 2) * (long) this.field3930 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V")
    public final void method1756() {
        this.field3926.field7952.field8345[this.field3929] = null;
        class220.field3417[class207.field3213] = this;
        class207.field3213 = class207.field3213 + 1 & 1023;
        this.method3358(111);
        this.method4150((byte) 3);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lpga;IIIIIIIIIIIZZ)V")
    public class272(class559 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field3926 = arg0;
        super.field4979 = arg1 << 12;
        super.field4976 = arg2 << 12;
        super.field4986 = arg3 << 12;
        super.field4988 = arg9;
        this.field3928 = this.field3934 = (short) arg8;
        super.field4985 = arg10;
        super.field4987 = arg11;
        super.field4982 = arg13;
        this.field3931 = (short) arg4;
        this.field3932 = (short) arg5;
        this.field3930 = (short) arg6;
        this.field3927 = arg7;
        super.field4984 = this.field3926.field7953.field975;
        this.method1752();
    }
}
