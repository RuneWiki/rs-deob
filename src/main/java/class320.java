import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class320 extends class321 {

    @OriginalMember(owner = "client!afa", name = "qc", descriptor = "Lgh;")
    private class514 field4372;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZZIIZI)V", line = 3)
    public final void method1523(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field4424 != null) {
            int var7 = 0;
            while (var7 < super.field4467) {
                class82 var8 = super.field4424[var7];
                super.field4429[var8.field1286] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field4444; ++var9) {
            if (super.field4455 == null || super.field4455[var9] == 0) {
                this.method1894(var9, arg0, arg1);
            }
        }
        if (super.field4397) {
            if (super.field4463 == null) {
                for (int var10 = 0; var10 < super.field4444; ++var10) {
                    if (super.field4455 == null || super.field4455[var10] != 0) {
                        this.method1894(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field4444; ++var12) {
                        if ((super.field4455 == null || super.field4455[var12] != 0) && super.field4463[var12] == var11) {
                            this.method1894(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class115 var14 = super.field4400[var13];
                int var15 = super.field4383[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field4460.method2481(var14, super.field4388[var13], super.field4456[var13], var15, (super.field4460.field6017 * var14.field1983 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V", line = 99)
    private final void method1892(int arg0) {
        short var2 = super.field4379[arg0];
        short var3 = super.field4395[arg0];
        short var4 = super.field4430[arg0];
        this.field4372.field6867 = super.field4415[arg0];
        if (super.field4455 == null) {
            this.field4372.field6866 = 0;
        } else {
            this.field4372.field6866 = super.field4455[arg0] & 255;
        }
        if (super.field4440 != null && super.field4440[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (super.field4432 != null && super.field4432[arg0] != -1) {
                int var5 = super.field4432[arg0] & 255;
                var6 = super.field4465[var5];
                var7 = super.field4475[var5];
                var8 = super.field4396[var5];
            } else {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            }
            if (super.field4473[arg0] == -1) {
                this.field4372.method2869(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var6], super.field4382[var7], super.field4382[var8], super.field4435[var6], super.field4435[var7], super.field4435[var8], super.field4427[var6], super.field4427[var7], super.field4427[var8], super.field4440[arg0]);
            } else {
                this.field4372.method2869(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var6], super.field4382[var7], super.field4382[var8], super.field4435[var6], super.field4435[var7], super.field4435[var8], super.field4427[var6], super.field4427[var7], super.field4427[var8], super.field4440[arg0]);
            }
        } else if (super.field4473[arg0] == -1) {
            this.field4372.method2866(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], class446.field6101[super.field4449[arg0] & 65535]);
        } else {
            this.field4372.method2863(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], super.field4449[arg0] & 65535, super.field4439[arg0] & 65535, super.field4473[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V", line = 148)
    private final void method1893(int arg0) {
        int var2 = 0;
        int var3 = super.field4460.field5982;
        short var4 = super.field4379[arg0];
        short var5 = super.field4395[arg0];
        short var6 = super.field4430[arg0];
        int var7 = super.field4427[var4];
        int var8 = super.field4427[var5];
        int var9 = super.field4427[var6];
        if (super.field4455 == null) {
            this.field4372.field6866 = 0;
        } else {
            this.field4372.field6866 = super.field4455[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field4421[var2] = super.field4402[var4];
            super.field4458[var2] = super.field4386[var4];
            super.field4408[var2] = super.field4417[var4];
            super.field4392[var2++] = super.field4449[arg0] & 65535;
        } else {
            int var10 = super.field4382[var4];
            int var11 = super.field4435[var4];
            int var12 = super.field4449[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class321.field4480[var9 - var7];
                super.field4421[var2] = (((super.field4382[var6] - var10) * var13 >> 16) + var10) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var6] - var11) * var13 >> 16) + var11) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4473[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class321.field4480[var8 - var7];
                super.field4421[var2] = (((super.field4382[var5] - var10) * var14 >> 16) + var10) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var5] - var11) * var14 >> 16) + var11) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4439[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field4421[var2] = super.field4402[var5];
            super.field4458[var2] = super.field4386[var5];
            super.field4408[var2] = super.field4417[var5];
            super.field4392[var2++] = super.field4439[arg0] & 65535;
        } else {
            int var15 = super.field4382[var5];
            int var16 = super.field4435[var5];
            int var17 = super.field4439[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class321.field4480[var7 - var8];
                super.field4421[var2] = (((super.field4382[var4] - var15) * var18 >> 16) + var15) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var4] - var16) * var18 >> 16) + var16) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4449[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class321.field4480[var9 - var8];
                super.field4421[var2] = (((super.field4382[var6] - var15) * var19 >> 16) + var15) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var6] - var16) * var19 >> 16) + var16) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4473[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field4421[var2] = super.field4402[var6];
            super.field4458[var2] = super.field4386[var6];
            super.field4408[var2] = super.field4417[var6];
            super.field4392[var2++] = super.field4473[arg0] & 65535;
        } else {
            int var20 = super.field4382[var6];
            int var21 = super.field4435[var6];
            int var22 = super.field4473[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class321.field4480[var8 - var9];
                super.field4421[var2] = (((super.field4382[var5] - var20) * var23 >> 16) + var20) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var5] - var21) * var23 >> 16) + var21) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4439[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class321.field4480[var7 - var9];
                super.field4421[var2] = (((super.field4382[var4] - var20) * var24 >> 16) + var20) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var4] - var21) * var24 >> 16) + var21) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4408[var2] = var3;
                super.field4392[var2++] = (((super.field4449[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field4421[0];
        int var26 = super.field4421[1];
        int var27 = super.field4421[2];
        int var28 = super.field4458[0];
        int var29 = super.field4458[1];
        int var30 = super.field4458[2];
        int var31 = super.field4408[0];
        int var32 = super.field4408[1];
        int var33 = super.field4408[2];
        this.field4372.field6867 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field4374.field3840 || var26 > super.field4374.field3840 || var27 > super.field4374.field3840) {
                this.field4372.field6867 = true;
            }
            if (super.field4440 != null && super.field4440[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field4432 != null && super.field4432[arg0] != -1) {
                    int var34 = super.field4432[arg0] & 255;
                    var35 = super.field4465[var34];
                    var36 = super.field4475[var34];
                    var37 = super.field4396[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field4473[arg0] == -1) {
                    this.field4372.method2869(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var35], super.field4382[var36], super.field4382[var37], super.field4435[var35], super.field4435[var36], super.field4435[var37], super.field4427[var35], super.field4427[var36], super.field4427[var37], super.field4440[arg0]);
                } else {
                    this.field4372.method2869(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4392[0], super.field4392[1], super.field4392[2], super.field4382[var35], super.field4382[var36], super.field4382[var37], super.field4435[var35], super.field4435[var36], super.field4435[var37], super.field4427[var35], super.field4427[var36], super.field4427[var37], super.field4440[arg0]);
                }
            } else if (super.field4473[arg0] == -1) {
                this.field4372.method2866(var28, var29, var30, var25, var26, var27, var31, var32, var33, class446.field6101[super.field4449[arg0] & 65535]);
            } else {
                this.field4372.method2863(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4392[0], super.field4392[1], super.field4392[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field4374.field3840 || var26 > super.field4374.field3840 || var27 > super.field4374.field3840 || super.field4421[3] < 0 || super.field4421[3] > super.field4374.field3840) {
                this.field4372.field6867 = true;
            }
            if (super.field4440 == null || super.field4440[arg0] == -1) {
                if (super.field4473[arg0] == -1) {
                    int var43 = class446.field6101[super.field4449[arg0] & 65535];
                    this.field4372.method2866(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field4372.method2866(var28, var30, super.field4458[3], var25, var27, super.field4421[3], var31, var32, super.field4408[3], var43);
                    return;
                }
                this.field4372.method2863(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4392[0], super.field4392[1], super.field4392[2]);
                this.field4372.method2863(var28, var30, super.field4458[3], var25, var27, super.field4421[3], var31, var32, super.field4408[3], super.field4392[0], super.field4392[2], super.field4392[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field4432 != null && super.field4432[arg0] != -1) {
                int var38 = super.field4432[arg0] & 255;
                var39 = super.field4465[var38];
                var40 = super.field4475[var38];
                var41 = super.field4396[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field4440[arg0];
            if (super.field4473[arg0] == -1) {
                this.field4372.method2869(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var39], super.field4382[var40], super.field4382[var41], super.field4435[var39], super.field4435[var40], super.field4435[var41], super.field4427[var39], super.field4427[var40], super.field4427[var41], var42);
                this.field4372.method2869(var28, var30, super.field4458[3], var25, var27, super.field4421[3], var31, var32, super.field4408[3], super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var39], super.field4382[var40], super.field4382[var41], super.field4435[var39], super.field4435[var40], super.field4435[var41], super.field4427[var39], super.field4427[var40], super.field4427[var41], var42);
                return;
            }
            this.field4372.method2869(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field4392[0], super.field4392[1], super.field4392[2], super.field4382[var39], super.field4382[var40], super.field4382[var41], super.field4435[var39], super.field4435[var40], super.field4435[var41], super.field4427[var39], super.field4427[var40], super.field4427[var41], var42);
            this.field4372.method2869(var28, var30, super.field4458[3], var25, var27, super.field4421[3], var31, var32, super.field4408[3], super.field4392[0], super.field4392[2], super.field4392[3], super.field4382[var39], super.field4382[var40], super.field4382[var41], super.field4435[var39], super.field4435[var40], super.field4435[var41], super.field4427[var39], super.field4427[var40], super.field4427[var41], var42);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZZ)V", line = 397)
    private final void method1894(int arg0, boolean arg1, boolean arg2) {
        if (super.field4473[arg0] != -2) {
            short var4 = super.field4379[arg0];
            short var5 = super.field4395[arg0];
            short var6 = super.field4430[arg0];
            int var7 = super.field4402[var4];
            int var8 = super.field4402[var5];
            int var9 = super.field4402[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field4429[arg0] != -1 || (super.field4386[var6] - super.field4386[var5]) * (var7 - var8) - (super.field4386[var4] - super.field4386[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field4374.field3840 && var8 <= super.field4374.field3840 && var9 <= super.field4374.field3840) {
                        super.field4415[arg0] = false;
                    } else {
                        super.field4415[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field4429[arg0];
                        if (var28 == -1 || !super.field4424[var28].field1283) {
                            this.method1895(arg0);
                        }
                        return;
                    }
                    int var29 = super.field4429[arg0];
                    if (var29 != -1) {
                        class82 var30 = super.field4424[var29];
                        class155 var31 = super.field4418[var29];
                        if (!var30.field1283) {
                            this.method1892(arg0);
                        }
                        super.field4460.method2489(var31.field2438, var31.field2451, var31.field2442, var31.field2455, var31.field2447, var31.field2454, var30.field1279 & 65535, var31.field2443, var30.field1282, var30.field1285);
                        return;
                    }
                    this.method1892(arg0);
                }
            } else {
                int var10 = super.field4382[var4];
                int var11 = super.field4382[var5];
                int var12 = super.field4382[var6];
                int var13 = super.field4435[var4];
                int var14 = super.field4435[var5];
                int var15 = super.field4435[var6];
                int var16 = super.field4427[var4];
                int var17 = super.field4427[var5];
                int var18 = super.field4427[var6];
                int var19 = var10 - var11;
                int var20 = var12 - var11;
                int var21 = var13 - var14;
                int var22 = var15 - var14;
                int var23 = var16 - var17;
                int var24 = var18 - var17;
                int var25 = var21 * var24 - var22 * var23;
                int var26 = var20 * var23 - var19 * var24;
                int var27 = var19 * var22 - var20 * var21;
                if (var17 * var27 + var11 * var25 + var14 * var26 > 0) {
                    this.method1893(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lqe;Lpf;IIII)V", line = 491)
    public class320(class437 arg0, class545 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BIZ)Lba;", line = 494)
    public final class358 method1519(byte arg0, int arg1, boolean arg2) {
        this.method1938(Thread.currentThread());
        class321 var4;
        class321 var5;
        if (arg0 == 1) {
            var4 = super.field4406;
            var5 = super.field4474;
        } else if (arg0 == 2) {
            var4 = super.field4445;
            var5 = super.field4411;
        } else if (arg0 == 3) {
            var4 = super.field4380;
            var5 = super.field4412;
        } else if (arg0 == 4) {
            var4 = super.field4409;
            var5 = super.field4387;
        } else if (arg0 == 5) {
            var4 = super.field4462;
            var5 = super.field4394;
        } else {
            var5 = var4 = new class320(super.field4460);
        }
        return this.method1896(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 538)
    public final void method1517(Thread arg0) {
        super.method1517(arg0);
        class205 var2 = (class205) super.field4460.method2478(arg0);
        this.field4372 = var2.field2964;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V", line = 546)
    public final void method1521(int arg0) {
        this.field4372.field6864 = (arg0 & 1) == 0;
        this.field4372.field6868 = false;
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)V", line = 550)
    private final void method1895(int arg0) {
        if (!super.field4460.field5994) {
            short var2 = super.field4379[arg0];
            short var3 = super.field4395[arg0];
            short var4 = super.field4430[arg0];
            int var5 = super.field4417[var2] - super.field4460.field6006;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field4417[var3] - super.field4460.field6006;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field4417[var4] - super.field4460.field6006;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method1892(arg0);
                } else {
                    if (super.field4455 == null) {
                        this.field4372.field6866 = 0;
                    } else {
                        this.field4372.field6866 = super.field4455[arg0] & 255;
                    }
                    this.field4372.field6867 = super.field4415[arg0];
                    if (super.field4440 != null && super.field4440[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field4432 != null && super.field4432[arg0] != -1) {
                            int var9 = super.field4432[arg0] & 255;
                            var10 = super.field4465[var9];
                            var11 = super.field4475[var9];
                            var12 = super.field4396[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field4473[arg0] == -1) {
                            this.field4372.method2858(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], super.field4460.field5987, var5, var6, var7, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var10], super.field4382[var11], super.field4382[var12], super.field4435[var10], super.field4435[var11], super.field4435[var12], super.field4427[var10], super.field4427[var11], super.field4427[var12], super.field4440[arg0]);
                        } else {
                            this.field4372.method2858(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], super.field4460.field5987, var5, var6, var7, super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var10], super.field4382[var11], super.field4382[var12], super.field4435[var10], super.field4435[var11], super.field4435[var12], super.field4427[var10], super.field4427[var11], super.field4427[var12], super.field4440[arg0]);
                        }
                    } else if (super.field4473[arg0] == -1) {
                        this.field4372.method2860(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], class64.method513(var5 << 24 | super.field4460.field5987, (byte) -91, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var6 << 24 | super.field4460.field5987, (byte) -118, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var7 << 24 | super.field4460.field5987, (byte) -121, class446.field6101[super.field4449[arg0] & 65535]));
                    } else {
                        this.field4372.method2860(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4417[var2], super.field4417[var3], super.field4417[var4], class64.method513(var5 << 24 | super.field4460.field5987, (byte) -62, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var6 << 24 | super.field4460.field5987, (byte) -64, class446.field6101[super.field4439[arg0] & 65535]), class64.method513(var7 << 24 | super.field4460.field5987, (byte) -88, class446.field6101[super.field4473[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field4410[arg0]) {
            short var13 = super.field4379[arg0];
            short var14 = super.field4395[arg0];
            short var15 = super.field4430[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field4433[var13] > super.field4460.field6021) {
                var16 = 255;
            } else if (super.field4433[var13] > super.field4460.field5992) {
                var16 = (super.field4460.field5992 - super.field4433[var13]) * 255 / (super.field4460.field5992 - super.field4460.field6021);
            }
            if (super.field4433[var14] > super.field4460.field6021) {
                var17 = 255;
            } else if (super.field4433[var14] > super.field4460.field5992) {
                var17 = (super.field4460.field5992 - super.field4433[var14]) * 255 / (super.field4460.field5992 - super.field4460.field6021);
            }
            if (super.field4433[var15] > super.field4460.field6021) {
                var18 = 255;
            } else if (super.field4433[var15] > super.field4460.field5992) {
                var18 = (super.field4460.field5992 - super.field4433[var15]) * 255 / (super.field4460.field5992 - super.field4460.field6021);
            }
            if (super.field4455 == null) {
                this.field4372.field6866 = 0;
            } else {
                this.field4372.field6866 = super.field4455[arg0] & 255;
            }
            this.field4372.field6867 = super.field4415[arg0];
            if (super.field4440 != null && super.field4440[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field4432 != null && super.field4432[arg0] != -1) {
                    int var19 = super.field4432[arg0] & 255;
                    var20 = super.field4465[var19];
                    var21 = super.field4475[var19];
                    var22 = super.field4396[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field4473[arg0] == -1) {
                    this.field4372.method2858(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4417[var13], super.field4417[var14], super.field4417[var15], super.field4460.field5987, var16, var17, var18, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var20], super.field4382[var21], super.field4382[var22], super.field4435[var20], super.field4435[var21], super.field4435[var22], super.field4427[var20], super.field4427[var21], super.field4427[var22], super.field4440[arg0]);
                } else {
                    this.field4372.method2858(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4417[var13], super.field4417[var14], super.field4417[var15], super.field4460.field5987, var16, var17, var18, super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var20], super.field4382[var21], super.field4382[var22], super.field4435[var20], super.field4435[var21], super.field4435[var22], super.field4427[var20], super.field4427[var21], super.field4427[var22], super.field4440[arg0]);
                }
            } else if (super.field4473[arg0] == -1) {
                this.field4372.method2860(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4417[var13], super.field4417[var14], super.field4417[var15], class64.method513(var16 << 24 | super.field4460.field5987, (byte) -123, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var17 << 24 | super.field4460.field5987, (byte) -78, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var18 << 24 | super.field4460.field5987, (byte) -56, class446.field6101[super.field4449[arg0] & 65535]));
            } else {
                this.field4372.method2860(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4417[var13], super.field4417[var14], super.field4417[var15], class64.method513(var16 << 24 | super.field4460.field5987, (byte) -59, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var17 << 24 | super.field4460.field5987, (byte) -104, class446.field6101[super.field4439[arg0] & 65535]), class64.method513(var18 << 24 | super.field4460.field5987, (byte) -73, class446.field6101[super.field4473[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "()V", line = 723)
    public final void method1525() {
        this.field4372 = null;
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lqe;)V", line = 726)
    public class320(class437 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "()V", line = 729)
    public final void method1526() {
        super.field4374.field3840 = this.field4372.field6870;
        super.field4374.field3807 = this.field4372.field6860;
        super.field4374.field3816 = this.field4372.field6858;
    }
}
