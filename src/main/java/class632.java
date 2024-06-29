import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class632 extends class232 {

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "Lhu;")
    public class131 field9054;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "S")
    private short field9055;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "S")
    private short field9061;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "S")
    private short field9053;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "S")
    private short field9060;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "S")
    private short field9056;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    private int field9058;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    private int field9059;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "S")
    private short field9057;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()V", line = 5)
    private final void method3633() {
        int var1 = this.field9054.field1956.field10488;
        if (this.field9054.field1956.field10492[var1] != null) {
            this.field9054.field1956.field10492[var1].method3635();
        }
        this.field9054.field1956.field10492[var1] = this;
        this.field9057 = (short) this.field9054.field1956.field10488;
        this.field9054.field1956.field10488 = var1 + 1 & 8191;
        this.field9054.field1965.method4152(this, 0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V", line = 15)
    public final void method3634(long arg0, int arg1) {
        this.field9055 = (short) (this.field9055 - arg1);
        if (this.field9055 <= 0) {
            this.method3635();
        } else {
            int var4 = super.field3297 >> 12;
            int var5 = super.field3295 >> 12;
            int var6 = super.field3300 >> 12;
            class753 var7 = this.field9054.field1956;
            class567 var8 = this.field9054.field1959;
            if (var8.field8058 != 0) {
                if (this.field9061 - this.field9055 <= var8.field8019) {
                    int var9 = var8.field8065 * arg1 + (this.field9059 >> 16 & 255) + (super.field3303 >> 8 & 65280);
                    int var10 = var8.field8020 * arg1 + (this.field9059 >> 8 & 255) + (super.field3303 & 65280);
                    int var11 = var8.field8081 * arg1 + (super.field3303 << 8 & 65280) + (this.field9059 & 255);
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
                    super.field3303 &= -16777216;
                    super.field3303 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field9059 &= -16777216;
                    this.field9059 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field9061 - this.field9055 <= var8.field8040) {
                    int var12 = var8.field8015 * arg1 + (this.field9059 >> 24 & 255) + (super.field3303 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3303 &= 16777215;
                    super.field3303 |= (var12 & 65280) << 16;
                    this.field9059 &= 16777215;
                    this.field9059 |= (var12 & 255) << 24;
                }
            }
            if (var8.field8046 != -1 && this.field9061 - this.field9055 <= var8.field8078) {
                this.field9058 += var8.field8061 * arg1;
            }
            if (var8.field8017 != -1 && this.field9061 - this.field9055 <= var8.field8080) {
                super.field3305 += var8.field8054 * arg1;
            }
            double var13 = (double) this.field9053;
            double var15 = (double) this.field9060;
            double var17 = (double) this.field9056;
            boolean var19 = false;
            if (var8.field8034 == 1) {
                int var20 = var4 - this.field9054.field1957.field7669;
                int var21 = var5 - this.field9054.field1957.field7674;
                int var22 = var6 - this.field9054.field1957.field7681;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field8070 * var23 * arg1);
                this.field9058 = (int) ((long) this.field9058 - ((long) this.field9058 * var24 >> 18));
            } else if (var8.field8034 == 2) {
                int var26 = var4 - this.field9054.field1957.field7669;
                int var27 = var5 - this.field9054.field1957.field7674;
                int var28 = var6 - this.field9054.field1957.field7681;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field8070 * var29 * arg1);
                this.field9058 = (int) ((long) this.field9058 - ((long) this.field9058 * var30 >> 28));
            }
            if (var8.field8036 != null) {
                class626 var32 = var7.field10495.field3131;
                for (class626 var33 = var32.field8990; var32 != var33; var33 = var33.field8990) {
                    class436 var34 = (class436) var33;
                    class494 var35 = var34.field6090;
                    if (var35.field7049 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field8036.length; ++var37) {
                            if (var8.field8036[var37] == var35.field7053) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field6087);
                            double var40 = (double) (var5 - var34.field6088);
                            double var42 = (double) (var6 - var34.field6096);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field7043)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field6099 * var42 + (double) var34.field6089 * var38 + (double) var35.field7048 * var40) * 65535.0D / ((double) var35.field7055 * var46);
                                if (!(var48 < (double) var35.field7056)) {
                                    double var50 = 0.0D;
                                    if (var35.field7059 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field7045;
                                    } else if (var35.field7059 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field7045;
                                    }
                                    if (var35.field7051 == 0) {
                                        if (var35.field7046 == 0) {
                                            var13 += ((double) var34.field6089 - var50) * (double) arg1;
                                            var15 += ((double) var35.field7048 - var50) * (double) arg1;
                                            var17 += ((double) var34.field6099 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field3297 = (int) ((double) super.field3297 + ((double) var34.field6089 - var50) * (double) arg1);
                                            super.field3295 = (int) ((double) super.field3295 + ((double) var35.field7048 - var50) * (double) arg1);
                                            super.field3300 = (int) ((double) super.field3300 + ((double) var34.field6099 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field7055;
                                        double var54 = var40 / var46 * (double) var35.field7055;
                                        double var56 = var42 / var46 * (double) var35.field7055;
                                        if (var35.field7046 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field3297 = (int) ((double) super.field3297 + (double) arg1 * var52);
                                            super.field3295 = (int) ((double) super.field3295 + (double) arg1 * var54);
                                            super.field3300 = (int) ((double) super.field3300 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field8018 != null) {
                for (int var58 = 0; var58 < var8.field8018.length; ++var58) {
                    class436 var59 = (class436) class107.field1768.method418((long) var8.field8018[var58], false);
                    while (var59 != null) {
                        class494 var60 = var59.field6090;
                        double var61 = (double) (var4 - var59.field6087);
                        double var63 = (double) (var5 - var59.field6088);
                        double var65 = (double) (var6 - var59.field6096);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field7043) {
                            var59 = (class436) class107.field1768.method412(-1);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field6099 * var65 + (double) var59.field6089 * var61 + (double) var60.field7048 * var63) * 65535.0D / ((double) var60.field7055 * var69);
                            if (var71 < (double) var60.field7056) {
                                var59 = (class436) class107.field1768.method412(-1);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field7059 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field7045;
                                } else if (var60.field7059 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field7045;
                                }
                                if (var60.field7051 == 0) {
                                    if (var60.field7046 == 0) {
                                        var13 += ((double) var59.field6089 - var73) * (double) arg1;
                                        var15 += ((double) var60.field7048 - var73) * (double) arg1;
                                        var17 += ((double) var59.field6099 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field3297 = (int) ((double) super.field3297 + ((double) var59.field6089 - var73) * (double) arg1);
                                        super.field3295 = (int) ((double) super.field3295 + ((double) var60.field7048 - var73) * (double) arg1);
                                        super.field3300 = (int) ((double) super.field3300 + ((double) var59.field6099 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field7055;
                                    double var77 = var63 / var69 * (double) var60.field7055;
                                    double var79 = var65 / var69 * (double) var60.field7055;
                                    if (var60.field7046 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field3297 = (int) ((double) super.field3297 + (double) arg1 * var75);
                                        super.field3295 = (int) ((double) super.field3295 + (double) arg1 * var77);
                                        super.field3300 = (int) ((double) super.field3300 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class436) class107.field1768.method412(-1);
                            }
                        }
                    }
                }
            }
            if (var8.field8055 != null) {
                if (var8.field8031 == null) {
                    var8.field8031 = new int[var8.field8055.length];
                    for (int var81 = 0; var81 < var8.field8055.length; ++var81) {
                        class424.method2587(var8.field8055[var81], (byte) 121);
                        var8.field8031[var81] = ((class528) class404.field5628.method4203(true, (long) var8.field8055[var81])).field7502;
                    }
                }
                for (int var82 = 0; var82 < var8.field8031.length; ++var82) {
                    class494 var83 = class725.field10142[var8.field8031[var82]];
                    if (var83.field7046 == 0) {
                        var13 += (double) (var83.field7052 * arg1);
                        var15 += (double) (var83.field7048 * arg1);
                        var17 += (double) (var83.field7047 * arg1);
                        var19 = true;
                    } else {
                        super.field3297 += var83.field7052 * arg1;
                        super.field3295 += var83.field7048 * arg1;
                        super.field3300 += var83.field7047 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field9053 = (short) ((int) var13);
                        this.field9060 = (short) ((int) var15);
                        this.field9056 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field9058 <<= 1;
                }
            }
            super.field3297 = (int) ((long) super.field3297 + ((long) (this.field9058 << 2) * (long) this.field9053 >> 23) * (long) arg1);
            super.field3295 = (int) ((long) super.field3295 + ((long) (this.field9058 << 2) * (long) this.field9060 >> 23) * (long) arg1);
            super.field3300 = (int) ((long) super.field3300 + ((long) (this.field9058 << 2) * (long) this.field9056 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V", line = 414)
    public final void method3635() {
        this.field9054.field1956.field10492[this.field9057] = null;
        class510.field7277[class555.field7775] = this;
        class555.field7775 = class555.field7775 + 1 & 1023;
        this.method909(-117);
        this.method4122(false);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhu;IIIIIIIIIIIZZ)V", line = 421)
    public final void method3636(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9054 = arg0;
        super.field3297 = arg1 << 12;
        super.field3295 = arg2 << 12;
        super.field3300 = arg3 << 12;
        super.field3303 = arg9;
        this.field9061 = this.field9055 = (short) arg8;
        super.field3305 = arg10;
        super.field3304 = arg11;
        super.field3299 = arg13;
        this.field9053 = (short) arg4;
        this.field9060 = (short) arg5;
        this.field9056 = (short) arg6;
        this.field9058 = arg7;
        super.field3302 = this.field9054.field1963.field9492;
        this.method3633();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lha;J)V", line = 441)
    public final void method3637(class58 arg0, long arg1) {
        int var4 = super.field3297 >> class440.field6142 + 12;
        int var5 = super.field3300 >> class440.field6142 + 12;
        int var6 = super.field3295 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class613.field8871 && var5 >= 0 && var5 < class453.field6328) {
            class753 var7 = this.field9054.field1956;
            class567 var8 = this.field9054.field1959;
            class278[] var9 = class138.field2153;
            int var10 = var7.field10501;
            class416 var11 = class390.field5454[var7.field10501][var4][var5];
            if (var11 != null) {
                var10 = var11.field5835;
            }
            int var12 = var9[var10].method1825(var5, -128, var4);
            int var13;
            if (var10 < class749.field10470 - 1) {
                var13 = var9[var10 + 1].method1825(var5, -128, var4);
            } else {
                var13 = var12 - (8 << class440.field6142);
            }
            if (var8.field8043) {
                if (var8.field8056 == -1 && var6 > var12) {
                    this.method3635();
                    return;
                }
                if (var8.field8056 >= 0 && var6 > var9[var8.field8056].method1825(var5, -128, var4)) {
                    this.method3635();
                    return;
                }
                if (var8.field8026 == -1 && var6 < var13) {
                    this.method3635();
                    return;
                }
                if (var8.field8026 >= 0 && var6 < var9[var8.field8026 + 1].method1825(var5, -128, var4)) {
                    this.method3635();
                    return;
                }
            }
            int var14;
            for (var14 = class749.field10470 - 1; var14 > 0 && var6 > var9[var14].method1825(var5, -128, var4); --var14) {
            }
            if (var8.field8073 && var14 == 0 && var6 > var9[0].method1825(var5, -128, var4)) {
                this.method3635();
            } else if (class749.field10470 - 1 == var14 && var9[var14].method1825(var5, -128, var4) - var6 > 8 << class440.field6142) {
                this.method3635();
            } else {
                class416 var15 = class390.field5454[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class390.field5454[0][var4][var5] == null) {
                        var15 = class390.field5454[0][var4][var5] = new class416(0);
                    }
                    boolean var16 = class390.field5454[0][var4][var5].field5834 != null;
                    if (var14 == 3 && var16) {
                        this.method3635();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class390.field5454[var17][var4][var5] == null) {
                            var15 = class390.field5454[var17][var4][var5] = new class416(var17);
                            if (var16) {
                                ++var15.field5835;
                            }
                        }
                    }
                }
                if (var8.field8087) {
                    int var18 = super.field3297 >> 12;
                    int var19 = super.field3300 >> 12;
                    if (var15.field5838 != null) {
                        class397 var20 = var15.field5838.method397(arg0, false);
                        if (var20 != null && var20.method2461(var18, (byte) 117, var6, var19)) {
                            this.method3635();
                            return;
                        }
                    }
                    if (var15.field5840 != null) {
                        class397 var21 = var15.field5840.method397(arg0, false);
                        if (var21 != null && var21.method2461(var18, (byte) 113, var6, var19)) {
                            this.method3635();
                            return;
                        }
                    }
                    if (var15.field5846 != null) {
                        class397 var22 = var15.field5846.method397(arg0, false);
                        if (var22 != null && var22.method2461(var18, (byte) 103, var6, var19)) {
                            this.method3635();
                            return;
                        }
                    }
                    for (class217 var23 = var15.field5844; var23 != null; var23 = var23.field3091) {
                        class397 var24 = var23.field3090.method397(arg0, false);
                        if (var24 != null && var24.method2461(var18, (byte) 123, var6, var19)) {
                            this.method3635();
                            return;
                        }
                    }
                }
                var7.field10497.field8974.method2304(this, (byte) -60);
            }
        } else {
            this.method3635();
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lhu;IIIIIIIIIIIZZ)V", line = 616)
    public class632(class131 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field9054 = arg0;
        super.field3297 = arg1 << 12;
        super.field3295 = arg2 << 12;
        super.field3300 = arg3 << 12;
        super.field3303 = arg9;
        this.field9061 = this.field9055 = (short) arg8;
        super.field3305 = arg10;
        super.field3304 = arg11;
        super.field3299 = arg13;
        this.field9053 = (short) arg4;
        this.field9060 = (short) arg5;
        this.field9056 = (short) arg6;
        this.field9058 = arg7;
        super.field3302 = this.field9054.field1963.field9492;
        this.method3633();
    }
}
