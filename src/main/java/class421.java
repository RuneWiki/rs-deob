import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class421 extends class247 {

    @OriginalMember(owner = "client!iga", name = "O", descriptor = "Ldq;")
    public class649 field5931;

    @OriginalMember(owner = "client!iga", name = "M", descriptor = "S")
    private short field5929;

    @OriginalMember(owner = "client!iga", name = "I", descriptor = "S")
    private short field5925;

    @OriginalMember(owner = "client!iga", name = "J", descriptor = "S")
    private short field5926;

    @OriginalMember(owner = "client!iga", name = "K", descriptor = "S")
    private short field5927;

    @OriginalMember(owner = "client!iga", name = "G", descriptor = "S")
    private short field5923;

    @OriginalMember(owner = "client!iga", name = "H", descriptor = "I")
    private int field5924;

    @OriginalMember(owner = "client!iga", name = "N", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!iga", name = "L", descriptor = "S")
    private short field5928;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "()V", line = 6)
    private final void method2437() {
        int var1 = this.field5931.field9000.field8927;
        if (this.field5931.field9000.field8921[var1] != null) {
            this.field5931.field9000.field8921[var1].method2438();
        }
        this.field5931.field9000.field8921[var1] = this;
        this.field5928 = (short) this.field5931.field9000.field8927;
        this.field5931.field9000.field8927 = var1 + 1 & 8191;
        this.field5931.field8995.method3906(this, (byte) -19);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "()V", line = 16)
    public final void method2438() {
        this.field5931.field9000.field8921[this.field5928] = null;
        class39.field458[class705.field9968] = this;
        class705.field9968 = class705.field9968 + 1 & 1023;
        this.method3074((byte) 48);
        this.method3914((byte) -122);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Ldq;IIIIIIIIIIIZZ)V", line = 24)
    public final void method2439(class649 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5931 = arg0;
        super.field3389 = arg1 << 12;
        super.field3387 = arg2 << 12;
        super.field3381 = arg3 << 12;
        super.field3384 = arg9;
        this.field5925 = this.field5929 = (short) arg8;
        super.field3379 = arg10;
        super.field3382 = arg11;
        super.field3385 = arg13;
        this.field5926 = (short) arg4;
        this.field5927 = (short) arg5;
        this.field5923 = (short) arg6;
        this.field5924 = arg7;
        super.field3383 = this.field5931.field9004.field4985;
        this.method2437();
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lr;J)V", line = 47)
    public final void method2440(class166 arg0, long arg1) {
        int var4 = super.field3389 >> class588.field8259 + 12;
        int var5 = super.field3381 >> class588.field8259 + 12;
        int var6 = super.field3387 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class335.field4511 && var5 >= 0 && var5 < class643.field8878) {
            class646 var7 = this.field5931.field9000;
            class366 var8 = this.field5931.field8997;
            class37[] var9 = class409.field5812;
            int var10 = var7.field8935;
            class390 var11 = class295.field4051[var7.field8935][var4][var5];
            if (var11 != null) {
                var10 = var11.field5530;
            }
            int var12 = var9[var10].method332(var5, 1, var4);
            int var13;
            if (var10 < class107.field1493 - 1) {
                var13 = var9[var10 + 1].method332(var5, 1, var4);
            } else {
                var13 = var12 - (8 << class588.field8259);
            }
            if (var8.field4928) {
                if (var8.field4882 == -1 && var6 > var12) {
                    this.method2438();
                    return;
                }
                if (var8.field4882 >= 0 && var6 > var9[var8.field4882].method332(var5, 1, var4)) {
                    this.method2438();
                    return;
                }
                if (var8.field4906 == -1 && var6 < var13) {
                    this.method2438();
                    return;
                }
                if (var8.field4906 >= 0 && var6 < var9[var8.field4906 + 1].method332(var5, 1, var4)) {
                    this.method2438();
                    return;
                }
            }
            int var14;
            for (var14 = class107.field1493 - 1; var14 > 0 && var6 > var9[var14].method332(var5, 1, var4); --var14) {
            }
            if (var8.field4915 && var14 == 0 && var6 > var9[0].method332(var5, 1, var4)) {
                this.method2438();
            } else if (class107.field1493 - 1 == var14 && var9[var14].method332(var5, 1, var4) - var6 > 8 << class588.field8259) {
                this.method2438();
            } else {
                class390 var15 = class295.field4051[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class295.field4051[0][var4][var5] == null) {
                        var15 = class295.field4051[0][var4][var5] = new class390(0);
                    }
                    boolean var16 = class295.field4051[0][var4][var5].field5534 != null;
                    if (var14 == 3 && var16) {
                        this.method2438();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class295.field4051[var17][var4][var5] == null) {
                            var15 = class295.field4051[var17][var4][var5] = new class390(var17);
                            if (var16) {
                                ++var15.field5530;
                            }
                        }
                    }
                }
                if (var8.field4862) {
                    int var18 = super.field3389 >> 12;
                    int var19 = super.field3381 >> 12;
                    if (var15.field5525 != null) {
                        class533 var20 = var15.field5525.method214(36, arg0);
                        if (var20 != null && var20.method3024((byte) 126, var18, var19, var6)) {
                            this.method2438();
                            return;
                        }
                    }
                    if (var15.field5529 != null) {
                        class533 var21 = var15.field5529.method214(12, arg0);
                        if (var21 != null && var21.method3024((byte) -74, var18, var19, var6)) {
                            this.method2438();
                            return;
                        }
                    }
                    if (var15.field5524 != null) {
                        class533 var22 = var15.field5524.method214(-28, arg0);
                        if (var22 != null && var22.method3024((byte) 113, var18, var19, var6)) {
                            this.method2438();
                            return;
                        }
                    }
                    for (class467 var23 = var15.field5536; var23 != null; var23 = var23.field6421) {
                        class533 var24 = var23.field6419.method214(127, arg0);
                        if (var24 != null && var24.method3024((byte) -54, var18, var19, var6)) {
                            this.method2438();
                            return;
                        }
                    }
                }
                var7.field8933.field6493.method3407(true, this);
            }
        } else {
            this.method2438();
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(JI)V", line = 221)
    public final void method2441(long arg0, int arg1) {
        this.field5929 = (short) (this.field5929 - arg1);
        if (this.field5929 <= 0) {
            this.method2438();
        } else {
            int var4 = super.field3389 >> 12;
            int var5 = super.field3387 >> 12;
            int var6 = super.field3381 >> 12;
            class646 var7 = this.field5931.field9000;
            class366 var8 = this.field5931.field8997;
            if (var8.field4930 != 0) {
                if (this.field5925 - this.field5929 <= var8.field4916) {
                    int var9 = var8.field4876 * arg1 + (this.field5930 >> 16 & 255) + (super.field3384 >> 8 & 65280);
                    int var10 = var8.field4913 * arg1 + (this.field5930 >> 8 & 255) + (super.field3384 & 65280);
                    int var11 = var8.field4932 * arg1 + (super.field3384 << 8 & 65280) + (this.field5930 & 255);
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
                    super.field3384 &= -16777216;
                    super.field3384 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field5930 &= -16777216;
                    this.field5930 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field5925 - this.field5929 <= var8.field4898) {
                    int var12 = var8.field4911 * arg1 + (this.field5930 >> 24 & 255) + (super.field3384 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field3384 &= 16777215;
                    super.field3384 |= (var12 & 65280) << 16;
                    this.field5930 &= 16777215;
                    this.field5930 |= (var12 & 255) << 24;
                }
            }
            if (var8.field4910 != -1 && this.field5925 - this.field5929 <= var8.field4905) {
                this.field5924 += var8.field4881 * arg1;
            }
            if (var8.field4917 != -1 && this.field5925 - this.field5929 <= var8.field4894) {
                super.field3379 += var8.field4926 * arg1;
            }
            double var13 = (double) this.field5926;
            double var15 = (double) this.field5927;
            double var17 = (double) this.field5923;
            boolean var19 = false;
            if (var8.field4870 == 1) {
                int var20 = var4 - this.field5931.field9001.field6904;
                int var21 = var5 - this.field5931.field9001.field6903;
                int var22 = var6 - this.field5931.field9001.field6905;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field4914 * var23 * arg1);
                this.field5924 = (int) ((long) this.field5924 - ((long) this.field5924 * var24 >> 18));
            } else if (var8.field4870 == 2) {
                int var26 = var4 - this.field5931.field9001.field6904;
                int var27 = var5 - this.field5931.field9001.field6903;
                int var28 = var6 - this.field5931.field9001.field6905;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field4914 * var29 * arg1);
                this.field5924 = (int) ((long) this.field5924 - ((long) this.field5924 * var30 >> 28));
            }
            if (var8.field4901 != null) {
                class401 var32 = var7.field8930.field3151;
                for (class401 var33 = var32.field5625; var32 != var33; var33 = var33.field5625) {
                    class701 var34 = (class701) var33;
                    class91 var35 = var34.field9936;
                    if (var35.field1299 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field4901.length; ++var37) {
                            if (var8.field4901[var37] == var35.field1314) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field9937);
                            double var40 = (double) (var5 - var34.field9940);
                            double var42 = (double) (var6 - var34.field9943);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field1304)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field9935 * var42 + (double) var34.field9939 * var38 + (double) var35.field1306 * var40) * 65535.0D / ((double) var35.field1308 * var46);
                                if (!(var48 < (double) var35.field1313)) {
                                    double var50 = 0.0D;
                                    if (var35.field1310 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field1312;
                                    } else if (var35.field1310 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field1312;
                                    }
                                    if (var35.field1317 == 0) {
                                        if (var35.field1301 == 0) {
                                            var13 += ((double) var34.field9939 - var50) * (double) arg1;
                                            var15 += ((double) var35.field1306 - var50) * (double) arg1;
                                            var17 += ((double) var34.field9935 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field3389 = (int) ((double) super.field3389 + ((double) var34.field9939 - var50) * (double) arg1);
                                            super.field3387 = (int) ((double) super.field3387 + ((double) var35.field1306 - var50) * (double) arg1);
                                            super.field3381 = (int) ((double) super.field3381 + ((double) var34.field9935 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field1308;
                                        double var54 = var40 / var46 * (double) var35.field1308;
                                        double var56 = var42 / var46 * (double) var35.field1308;
                                        if (var35.field1301 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field3389 = (int) ((double) super.field3389 + (double) arg1 * var52);
                                            super.field3387 = (int) ((double) super.field3387 + (double) arg1 * var54);
                                            super.field3381 = (int) ((double) super.field3381 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field4903 != null) {
                for (int var58 = 0; var58 < var8.field4903.length; ++var58) {
                    class701 var59 = (class701) class76.field1004.method1318(-47, (long) var8.field4903[var58]);
                    while (var59 != null) {
                        class91 var60 = var59.field9936;
                        double var61 = (double) (var4 - var59.field9937);
                        double var63 = (double) (var5 - var59.field9940);
                        double var65 = (double) (var6 - var59.field9943);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field1304) {
                            var59 = (class701) class76.field1004.method1316(-13760);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field9935 * var65 + (double) var59.field9939 * var61 + (double) var60.field1306 * var63) * 65535.0D / ((double) var60.field1308 * var69);
                            if (var71 < (double) var60.field1313) {
                                var59 = (class701) class76.field1004.method1316(-13760);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field1310 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field1312;
                                } else if (var60.field1310 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field1312;
                                }
                                if (var60.field1317 == 0) {
                                    if (var60.field1301 == 0) {
                                        var13 += ((double) var59.field9939 - var73) * (double) arg1;
                                        var15 += ((double) var60.field1306 - var73) * (double) arg1;
                                        var17 += ((double) var59.field9935 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field3389 = (int) ((double) super.field3389 + ((double) var59.field9939 - var73) * (double) arg1);
                                        super.field3387 = (int) ((double) super.field3387 + ((double) var60.field1306 - var73) * (double) arg1);
                                        super.field3381 = (int) ((double) super.field3381 + ((double) var59.field9935 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field1308;
                                    double var77 = var63 / var69 * (double) var60.field1308;
                                    double var79 = var65 / var69 * (double) var60.field1308;
                                    if (var60.field1301 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field3389 = (int) ((double) super.field3389 + (double) arg1 * var75);
                                        super.field3387 = (int) ((double) super.field3387 + (double) arg1 * var77);
                                        super.field3381 = (int) ((double) super.field3381 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class701) class76.field1004.method1316(-13760);
                            }
                        }
                    }
                }
            }
            if (var8.field4921 != null) {
                if (var8.field4922 == null) {
                    var8.field4922 = new int[var8.field4921.length];
                    for (int var81 = 0; var81 < var8.field4921.length; ++var81) {
                        class402.method2344(var8.field4921[var81], (byte) 57);
                        var8.field4922[var81] = ((class72) class264.field3581.method970((byte) 89, (long) var8.field4921[var81])).field956;
                    }
                }
                for (int var82 = 0; var82 < var8.field4922.length; ++var82) {
                    class91 var83 = class414.field5863[var8.field4922[var82]];
                    if (var83.field1301 == 0) {
                        var13 += (double) (var83.field1296 * arg1);
                        var15 += (double) (var83.field1306 * arg1);
                        var17 += (double) (var83.field1300 * arg1);
                        var19 = true;
                    } else {
                        super.field3389 += var83.field1296 * arg1;
                        super.field3387 += var83.field1306 * arg1;
                        super.field3381 += var83.field1300 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field5926 = (short) ((int) var13);
                        this.field5927 = (short) ((int) var15);
                        this.field5923 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field5924 <<= 1;
                }
            }
            super.field3389 = (int) ((long) super.field3389 + ((long) (this.field5924 << 2) * (long) this.field5926 >> 23) * (long) arg1);
            super.field3387 = (int) ((long) super.field3387 + ((long) (this.field5924 << 2) * (long) this.field5927 >> 23) * (long) arg1);
            super.field3381 = (int) ((long) super.field3381 + ((long) (this.field5924 << 2) * (long) this.field5923 >> 23) * (long) arg1);
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Ldq;IIIIIIIIIIIZZ)V", line = 616)
    public class421(class649 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field5931 = arg0;
        super.field3389 = arg1 << 12;
        super.field3387 = arg2 << 12;
        super.field3381 = arg3 << 12;
        super.field3384 = arg9;
        this.field5925 = this.field5929 = (short) arg8;
        super.field3379 = arg10;
        super.field3382 = arg11;
        super.field3385 = arg13;
        this.field5926 = (short) arg4;
        this.field5927 = (short) arg5;
        this.field5923 = (short) arg6;
        this.field5924 = arg7;
        super.field3383 = this.field5931.field9004.field4985;
        this.method2437();
    }
}
