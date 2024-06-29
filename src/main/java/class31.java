import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class31 extends class123 {

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Lmd;")
    public class680 field399;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "S")
    private short field400;

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "S")
    private short field393;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "S")
    private short field392;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "S")
    private short field397;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "S")
    private short field394;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "S")
    private short field396;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lha;J)V")
    public final void method335(class18 arg0, long arg1) {
        int var4 = super.field1550 >> class179.field2328 + 12;
        int var5 = super.field1557 >> class179.field2328 + 12;
        int var6 = super.field1551 >> 12;
        if (var6 <= 0 && var6 >= -262144 && var4 >= 0 && var4 < class508.field7455 && var5 >= 0 && var5 < class700.field9795) {
            class464 var7 = this.field399.field9553;
            class424 var8 = this.field399.field9549;
            class751[] var9 = class107.field1413;
            int var10 = var7.field6774;
            class621 var11 = class608.field8715[var7.field6774][var4][var5];
            if (var11 != null) {
                var10 = var11.field8846;
            }
            int var12 = var9[var10].method5442(var4, var5, 31844);
            int var13;
            if (var10 < class293.field4121 - 1) {
                var13 = var9[var10 + 1].method5442(var4, var5, 31844);
            } else {
                var13 = var12 - (8 << class179.field2328);
            }
            if (var8.field6110) {
                if (var8.field6088 == -1 && var6 > var12) {
                    this.method338();
                    return;
                }
                if (var8.field6088 >= 0 && var6 > var9[var8.field6088].method5442(var4, var5, 31844)) {
                    this.method338();
                    return;
                }
                if (var8.field6093 == -1 && var6 < var13) {
                    this.method338();
                    return;
                }
                if (var8.field6093 >= 0 && var6 < var9[var8.field6093 + 1].method5442(var4, var5, 31844)) {
                    this.method338();
                    return;
                }
            }
            int var14;
            for (var14 = class293.field4121 - 1; var14 > 0 && var6 > var9[var14].method5442(var4, var5, 31844); --var14) {
            }
            if (var8.field6095 && var14 == 0 && var6 > var9[0].method5442(var4, var5, 31844)) {
                this.method338();
            } else if (class293.field4121 - 1 == var14 && var9[var14].method5442(var4, var5, 31844) - var6 > 8 << class179.field2328) {
                this.method338();
            } else {
                class621 var15 = class608.field8715[var14][var4][var5];
                if (var15 == null) {
                    if (var14 == 0 || class608.field8715[0][var4][var5] == null) {
                        var15 = class608.field8715[0][var4][var5] = new class621(0);
                    }
                    boolean var16 = class608.field8715[0][var4][var5].field8849 != null;
                    if (var14 == 3 && var16) {
                        this.method338();
                        return;
                    }
                    for (int var17 = 1; var17 <= var14; ++var17) {
                        if (class608.field8715[var17][var4][var5] == null) {
                            var15 = class608.field8715[var17][var4][var5] = new class621(var17);
                            if (var16) {
                                ++var15.field8846;
                            }
                        }
                    }
                }
                if (var8.field6063) {
                    int var18 = super.field1550 >> 12;
                    int var19 = super.field1557 >> 12;
                    if (var15.field8842 != null) {
                        class311 var20 = var15.field8842.method587(arg0, (byte) 109);
                        if (var20 != null && var20.method2483((byte) 118, var18, var19, var6)) {
                            this.method338();
                            return;
                        }
                    }
                    if (var15.field8845 != null) {
                        class311 var21 = var15.field8845.method587(arg0, (byte) 119);
                        if (var21 != null && var21.method2483((byte) 68, var18, var19, var6)) {
                            this.method338();
                            return;
                        }
                    }
                    if (var15.field8850 != null) {
                        class311 var22 = var15.field8850.method587(arg0, (byte) 102);
                        if (var22 != null && var22.method2483((byte) 79, var18, var19, var6)) {
                            this.method338();
                            return;
                        }
                    }
                    for (class219 var23 = var15.field8841; var23 != null; var23 = var23.field3190) {
                        class311 var24 = var23.field3188.method587(arg0, (byte) 96);
                        if (var24 != null && var24.method2483((byte) 71, var18, var19, var6)) {
                            this.method338();
                            return;
                        }
                    }
                }
                var7.field6777.field11376.method3090(13, this);
            }
        } else {
            this.method338();
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lmd;IIIIIIIIIIIZZ)V")
    public final void method336(class680 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field399 = arg0;
        super.field1550 = arg1 << 12;
        super.field1551 = arg2 << 12;
        super.field1557 = arg3 << 12;
        super.field1547 = arg9;
        this.field393 = this.field400 = (short) arg8;
        super.field1558 = arg10;
        super.field1549 = arg11;
        super.field1552 = arg13;
        this.field392 = (short) arg4;
        this.field397 = (short) arg5;
        this.field394 = (short) arg6;
        this.field395 = arg7;
        super.field1556 = this.field399.field9556.field7491;
        this.method337();
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
    private final void method337() {
        int var1 = this.field399.field9553.field6765;
        if (this.field399.field9553.field6763[var1] != null) {
            this.field399.field9553.field6763[var1].method338();
        }
        this.field399.field9553.field6763[var1] = this;
        this.field396 = (short) this.field399.field9553.field6765;
        this.field399.field9553.field6765 = var1 + 1 & 8191;
        this.field399.field9555.method3618(this, 122);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    public final void method338() {
        this.field399.field9553.field6763[this.field396] = null;
        class115.field1478[class326.field4466] = this;
        class326.field4466 = class326.field4466 + 1 & 1023;
        this.method4736(0);
        this.method4374((byte) 127);
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lmd;IIIIIIIIIIIZZ)V")
    public class31(class680 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13) {
        this.field399 = arg0;
        super.field1550 = arg1 << 12;
        super.field1551 = arg2 << 12;
        super.field1557 = arg3 << 12;
        super.field1547 = arg9;
        this.field393 = this.field400 = (short) arg8;
        super.field1558 = arg10;
        super.field1549 = arg11;
        super.field1552 = arg13;
        this.field392 = (short) arg4;
        this.field397 = (short) arg5;
        this.field394 = (short) arg6;
        this.field395 = arg7;
        super.field1556 = this.field399.field9556.field7491;
        this.method337();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(JI)V")
    public final void method339(long arg0, int arg1) {
        this.field400 = (short) (this.field400 - arg1);
        if (this.field400 <= 0) {
            this.method338();
        } else {
            int var4 = super.field1550 >> 12;
            int var5 = super.field1551 >> 12;
            int var6 = super.field1557 >> 12;
            class464 var7 = this.field399.field9553;
            class424 var8 = this.field399.field9549;
            if (var8.field6073 != 0) {
                if (this.field393 - this.field400 <= var8.field6061) {
                    int var9 = var8.field6108 * arg1 + (this.field398 >> 16 & 255) + (super.field1547 >> 8 & 65280);
                    int var10 = var8.field6078 * arg1 + (this.field398 >> 8 & 255) + (super.field1547 & 65280);
                    int var11 = var8.field6084 * arg1 + (super.field1547 << 8 & 65280) + (this.field398 & 255);
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
                    super.field1547 &= -16777216;
                    super.field1547 |= ((var11 & 65280) >> 8) + ((var9 & 65280) << 8) + (var10 & 65280);
                    this.field398 &= -16777216;
                    this.field398 |= (var11 & 255) + ((var9 & 255) << 16) + ((var10 & 255) << 8);
                }
                if (this.field393 - this.field400 <= var8.field6112) {
                    int var12 = var8.field6064 * arg1 + (this.field398 >> 24 & 255) + (super.field1547 >> 16 & 65280);
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 65535) {
                        var12 = 65535;
                    }
                    super.field1547 &= 16777215;
                    super.field1547 |= (var12 & 65280) << 16;
                    this.field398 &= 16777215;
                    this.field398 |= (var12 & 255) << 24;
                }
            }
            if (var8.field6071 != -1 && this.field393 - this.field400 <= var8.field6115) {
                this.field395 += var8.field6069 * arg1;
            }
            if (var8.field6076 != -1 && this.field393 - this.field400 <= var8.field6113) {
                super.field1558 += var8.field6067 * arg1;
            }
            double var13 = (double) this.field392;
            double var15 = (double) this.field397;
            double var17 = (double) this.field394;
            boolean var19 = false;
            if (var8.field6117 == 1) {
                int var20 = var4 - this.field399.field9554.field2403;
                int var21 = var5 - this.field399.field9554.field2386;
                int var22 = var6 - this.field399.field9554.field2387;
                int var23 = (int) Math.sqrt((double) (var22 * var22 + var20 * var20 + var21 * var21)) >> 2;
                long var24 = (long) (var8.field6092 * var23 * arg1);
                this.field395 = (int) ((long) this.field395 - ((long) this.field395 * var24 >> 18));
            } else if (var8.field6117 == 2) {
                int var26 = var4 - this.field399.field9554.field2403;
                int var27 = var5 - this.field399.field9554.field2386;
                int var28 = var6 - this.field399.field9554.field2387;
                int var29 = var28 * var28 + var26 * var26 + var27 * var27;
                long var30 = (long) (var8.field6092 * var29 * arg1);
                this.field395 = (int) ((long) this.field395 - ((long) this.field395 * var30 >> 28));
            }
            if (var8.field6118 != null) {
                class578 var32 = var7.field6772.field7630;
                for (class578 var33 = var32.field8373; var32 != var33; var33 = var33.field8373) {
                    class345 var34 = (class345) var33;
                    class585 var35 = var34.field5024;
                    if (var35.field8440 != 1) {
                        boolean var36 = false;
                        for (int var37 = 0; var37 < var8.field6118.length; ++var37) {
                            if (var8.field6118[var37] == var35.field8441) {
                                var36 = true;
                                break;
                            }
                        }
                        if (var36) {
                            double var38 = (double) (var4 - var34.field5025);
                            double var40 = (double) (var5 - var34.field5017);
                            double var42 = (double) (var6 - var34.field5020);
                            double var44 = var42 * var42 + var38 * var38 + var40 * var40;
                            if (!(var44 > (double) var35.field8451)) {
                                double var46 = Math.sqrt(var44);
                                if (var46 == 0.0D) {
                                    var46 = 1.0D;
                                }
                                double var48 = ((double) var34.field5026 * var42 + (double) var34.field5027 * var38 + (double) var35.field8450 * var40) * 65535.0D / ((double) var35.field8445 * var46);
                                if (!(var48 < (double) var35.field8446)) {
                                    double var50 = 0.0D;
                                    if (var35.field8454 == 1) {
                                        var50 = var46 / 16.0D * (double) var35.field8447;
                                    } else if (var35.field8454 == 2) {
                                        var50 = var46 / 16.0D * (var46 / 16.0D) * (double) var35.field8447;
                                    }
                                    if (var35.field8439 == 0) {
                                        if (var35.field8438 == 0) {
                                            var13 += ((double) var34.field5027 - var50) * (double) arg1;
                                            var15 += ((double) var35.field8450 - var50) * (double) arg1;
                                            var17 += ((double) var34.field5026 - var50) * (double) arg1;
                                            var19 = true;
                                        } else {
                                            super.field1550 = (int) ((double) super.field1550 + ((double) var34.field5027 - var50) * (double) arg1);
                                            super.field1551 = (int) ((double) super.field1551 + ((double) var35.field8450 - var50) * (double) arg1);
                                            super.field1557 = (int) ((double) super.field1557 + ((double) var34.field5026 - var50) * (double) arg1);
                                        }
                                    } else {
                                        double var52 = var38 / var46 * (double) var35.field8445;
                                        double var54 = var40 / var46 * (double) var35.field8445;
                                        double var56 = var42 / var46 * (double) var35.field8445;
                                        if (var35.field8438 == 0) {
                                            var13 += (double) arg1 * var52;
                                            var15 += (double) arg1 * var54;
                                            var17 += (double) arg1 * var56;
                                            var19 = true;
                                        } else {
                                            super.field1550 = (int) ((double) super.field1550 + (double) arg1 * var52);
                                            super.field1551 = (int) ((double) super.field1551 + (double) arg1 * var54);
                                            super.field1557 = (int) ((double) super.field1557 + (double) arg1 * var56);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (var8.field6058 != null) {
                for (int var58 = 0; var58 < var8.field6058.length; ++var58) {
                    class345 var59 = (class345) class653.field9271.method1911(-1, (long) var8.field6058[var58]);
                    while (var59 != null) {
                        class585 var60 = var59.field5024;
                        double var61 = (double) (var4 - var59.field5025);
                        double var63 = (double) (var5 - var59.field5017);
                        double var65 = (double) (var6 - var59.field5020);
                        double var67 = var65 * var65 + var61 * var61 + var63 * var63;
                        if (var67 > (double) var60.field8451) {
                            var59 = (class345) class653.field9271.method1912(true);
                        } else {
                            double var69 = Math.sqrt(var67);
                            if (var69 == 0.0D) {
                                var69 = 1.0D;
                            }
                            double var71 = ((double) var59.field5026 * var65 + (double) var59.field5027 * var61 + (double) var60.field8450 * var63) * 65535.0D / ((double) var60.field8445 * var69);
                            if (var71 < (double) var60.field8446) {
                                var59 = (class345) class653.field9271.method1912(true);
                            } else {
                                double var73 = 0.0D;
                                if (var60.field8454 == 1) {
                                    var73 = var69 / 16.0D * (double) var60.field8447;
                                } else if (var60.field8454 == 2) {
                                    var73 = var69 / 16.0D * (var69 / 16.0D) * (double) var60.field8447;
                                }
                                if (var60.field8439 == 0) {
                                    if (var60.field8438 == 0) {
                                        var13 += ((double) var59.field5027 - var73) * (double) arg1;
                                        var15 += ((double) var60.field8450 - var73) * (double) arg1;
                                        var17 += ((double) var59.field5026 - var73) * (double) arg1;
                                        var19 = true;
                                    } else {
                                        super.field1550 = (int) ((double) super.field1550 + ((double) var59.field5027 - var73) * (double) arg1);
                                        super.field1551 = (int) ((double) super.field1551 + ((double) var60.field8450 - var73) * (double) arg1);
                                        super.field1557 = (int) ((double) super.field1557 + ((double) var59.field5026 - var73) * (double) arg1);
                                    }
                                } else {
                                    double var75 = var61 / var69 * (double) var60.field8445;
                                    double var77 = var63 / var69 * (double) var60.field8445;
                                    double var79 = var65 / var69 * (double) var60.field8445;
                                    if (var60.field8438 == 0) {
                                        var13 += (double) arg1 * var75;
                                        var15 += (double) arg1 * var77;
                                        var17 += (double) arg1 * var79;
                                        var19 = true;
                                    } else {
                                        super.field1550 = (int) ((double) super.field1550 + (double) arg1 * var75);
                                        super.field1551 = (int) ((double) super.field1551 + (double) arg1 * var77);
                                        super.field1557 = (int) ((double) super.field1557 + (double) arg1 * var79);
                                    }
                                }
                                var59 = (class345) class653.field9271.method1912(true);
                            }
                        }
                    }
                }
            }
            if (var8.field6086 != null) {
                if (var8.field6079 == null) {
                    var8.field6079 = new int[var8.field6086.length];
                    for (int var81 = 0; var81 < var8.field6086.length; ++var81) {
                        class594.method4379(106, var8.field6086[var81]);
                        var8.field6079[var81] = ((class529) class217.field3175.method3693(false, (long) var8.field6086[var81])).field7679;
                    }
                }
                for (int var82 = 0; var82 < var8.field6079.length; ++var82) {
                    class585 var83 = class591.field8511[var8.field6079[var82]];
                    if (var83.field8438 == 0) {
                        var13 += (double) (var83.field8452 * arg1);
                        var15 += (double) (var83.field8450 * arg1);
                        var17 += (double) (var83.field8453 * arg1);
                        var19 = true;
                    } else {
                        super.field1550 += var83.field8452 * arg1;
                        super.field1551 += var83.field8450 * arg1;
                        super.field1557 += var83.field8453 * arg1;
                    }
                }
            }
            if (var19) {
                while (true) {
                    if (!(var13 > 32767.0D) && !(var15 > 32767.0D) && !(var17 > 32767.0D) && !(var13 < -32767.0D) && !(var15 < -32767.0D) && !(var17 < -32767.0D)) {
                        this.field392 = (short) ((int) var13);
                        this.field397 = (short) ((int) var15);
                        this.field394 = (short) ((int) var17);
                        break;
                    }
                    var13 /= 2.0D;
                    var15 /= 2.0D;
                    var17 /= 2.0D;
                    this.field395 <<= 1;
                }
            }
            super.field1550 = (int) ((long) super.field1550 + ((long) (this.field395 << 2) * (long) this.field392 >> 23) * (long) arg1);
            super.field1551 = (int) ((long) super.field1551 + ((long) (this.field395 << 2) * (long) this.field397 >> 23) * (long) arg1);
            super.field1557 = (int) ((long) super.field1557 + ((long) (this.field395 << 2) * (long) this.field394 >> 23) * (long) arg1);
        }
    }
}
