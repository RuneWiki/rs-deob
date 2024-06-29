import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class248 extends class321 {

    @OriginalMember(owner = "client!cl", name = "qc", descriptor = "Lml;")
    private class359 field3445;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lqe;)V", line = 3)
    public class248(class437 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 6)
    public final void method1517(Thread arg0) {
        super.method1517(arg0);
        class232 var2 = (class232) super.field4460.method2478(arg0);
        this.field3445 = var2.field3257;
        super.field4470 = var2.field3252;
        super.field4377 = var2.field3251;
        super.field4459 = var2.field3256;
        super.field4404 = var2.field3245;
        super.field4375 = var2.field3253;
        super.field4438 = var2.field3249;
        super.field4414 = var2.field3259;
        super.field4398 = var2.field3240;
        super.field4419 = var2.field3248;
        super.field4378 = var2.field3254;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V", line = 22)
    private final void method1518(int arg0) {
        if (super.field4410[arg0]) {
            this.method1524(arg0);
        } else {
            short var2 = super.field4379[arg0];
            short var3 = super.field4395[arg0];
            short var4 = super.field4430[arg0];
            this.field3445.field4861 = super.field4415[arg0];
            if (super.field4455 == null) {
                this.field3445.field4857 = 0;
            } else {
                this.field3445.field4857 = super.field4455[arg0] & 255;
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
                    this.field3445.method2131(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var6], super.field4382[var7], super.field4382[var8], super.field4435[var6], super.field4435[var7], super.field4435[var8], super.field4427[var6], super.field4427[var7], super.field4427[var8], super.field4440[arg0]);
                } else {
                    this.field3445.method2131(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var6], super.field4382[var7], super.field4382[var8], super.field4435[var6], super.field4435[var7], super.field4435[var8], super.field4427[var6], super.field4427[var7], super.field4427[var8], super.field4440[arg0]);
                }
            } else if (super.field4473[arg0] == -1) {
                this.field3445.method2119(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], class446.field6101[super.field4449[arg0] & 65535]);
            } else {
                this.field3445.method2121(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4449[arg0] & 65535, super.field4439[arg0] & 65535, super.field4473[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BIZ)Lba;", line = 77)
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
            var5 = var4 = new class248(super.field4460);
        }
        return this.method1896(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lfh;[Lcl;)Lcl;", line = 123)
    public static final class248 method1520(class609 arg0, class248[] arg1) {
        int var2 = 0;
        class248 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class248(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V", line = 147)
    public final void method1521(int arg0) {
        this.field3445.field4856 = (arg0 & 1) == 0;
        this.field3445.field4855 = false;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V", line = 151)
    private final void method1522(int arg0) {
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
                    this.method1518(arg0);
                } else {
                    if (super.field4455 == null) {
                        this.field3445.field4857 = 0;
                    } else {
                        this.field3445.field4857 = super.field4455[arg0] & 255;
                    }
                    this.field3445.field4861 = super.field4415[arg0];
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
                            this.field3445.method2130(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4460.field5987, var5, var6, var7, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var10], super.field4382[var11], super.field4382[var12], super.field4435[var10], super.field4435[var11], super.field4435[var12], super.field4427[var10], super.field4427[var11], super.field4427[var12], super.field4440[arg0]);
                        } else {
                            this.field3445.method2130(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], super.field4460.field5987, var5, var6, var7, super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var10], super.field4382[var11], super.field4382[var12], super.field4435[var10], super.field4435[var11], super.field4435[var12], super.field4427[var10], super.field4427[var11], super.field4427[var12], super.field4440[arg0]);
                        }
                    } else if (super.field4473[arg0] == -1) {
                        this.field3445.method2128(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], class64.method513(var5 << 24 | super.field4460.field5987, (byte) -107, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var6 << 24 | super.field4460.field5987, (byte) -71, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var7 << 24 | super.field4460.field5987, (byte) -67, class446.field6101[super.field4449[arg0] & 65535]));
                    } else {
                        this.field3445.method2128(super.field4386[var2], super.field4386[var3], super.field4386[var4], super.field4402[var2], super.field4402[var3], super.field4402[var4], class64.method513(var5 << 24 | super.field4460.field5987, (byte) -117, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var6 << 24 | super.field4460.field5987, (byte) -79, class446.field6101[super.field4439[arg0] & 65535]), class64.method513(var7 << 24 | super.field4460.field5987, (byte) -64, class446.field6101[super.field4473[arg0] & 65535]));
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
                this.field3445.field4857 = 0;
            } else {
                this.field3445.field4857 = super.field4455[arg0] & 255;
            }
            this.field3445.field4861 = super.field4415[arg0];
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
                    this.field3445.method2130(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4460.field5987, var16, var17, var18, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var20], super.field4382[var21], super.field4382[var22], super.field4435[var20], super.field4435[var21], super.field4435[var22], super.field4427[var20], super.field4427[var21], super.field4427[var22], super.field4440[arg0]);
                } else {
                    this.field3445.method2130(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], super.field4460.field5987, var16, var17, var18, super.field4449[arg0], super.field4439[arg0], super.field4473[arg0], super.field4382[var20], super.field4382[var21], super.field4382[var22], super.field4435[var20], super.field4435[var21], super.field4435[var22], super.field4427[var20], super.field4427[var21], super.field4427[var22], super.field4440[arg0]);
                }
            } else if (super.field4473[arg0] == -1) {
                this.field3445.method2128(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], class64.method513(var16 << 24 | super.field4460.field5987, (byte) -125, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var17 << 24 | super.field4460.field5987, (byte) -96, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var18 << 24 | super.field4460.field5987, (byte) -90, class446.field6101[super.field4449[arg0] & 65535]));
            } else {
                this.field3445.method2128(super.field4386[var13], super.field4386[var14], super.field4386[var15], super.field4402[var13], super.field4402[var14], super.field4402[var15], class64.method513(var16 << 24 | super.field4460.field5987, (byte) -91, class446.field6101[super.field4449[arg0] & 65535]), class64.method513(var17 << 24 | super.field4460.field5987, (byte) -91, class446.field6101[super.field4439[arg0] & 65535]), class64.method513(var18 << 24 | super.field4460.field5987, (byte) -103, class446.field6101[super.field4473[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZIIZI)V", line = 324)
    public final void method1523(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class364.method2153((byte) -9, arg3) - class321.field4390;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field4377[var8] = 0;
        }
        int var9 = 0;
        if (super.field4424 != null) {
            int var10 = 0;
            while (var10 < super.field4467) {
                class82 var11 = super.field4424[var10];
                super.field4429[var11.field1286] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field4444; ++var12) {
            if (super.field4473[var12] != -2) {
                short var159 = super.field4379[var12];
                short var160 = super.field4395[var12];
                short var161 = super.field4430[var12];
                int var162 = super.field4402[var159];
                int var163 = super.field4402[var160];
                int var164 = super.field4402[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field4429[var12] != -1 || (super.field4386[var161] - super.field4386[var160]) * (var162 - var163) - (super.field4386[var159] - super.field4386[var160]) * (var164 - var163) > 0) {
                        super.field4410[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field4374.field3840 && var163 <= super.field4374.field3840 && var164 <= super.field4374.field3840) {
                            super.field4415[var12] = false;
                        } else {
                            super.field4415[var12] = true;
                        }
                        int var185 = (super.field4470[var159] + super.field4470[var160] + super.field4470[var161]) / 3 >> var7;
                        if (super.field4377[var185] < 64) {
                            super.field4459[var185][super.field4377[var185]++] = var12;
                        } else {
                            int var186 = super.field4377[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field4404[var9] = 0;
                                super.field4377[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field4375[var186][super.field4404[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field4382[var159];
                    int var166 = super.field4382[var160];
                    int var167 = super.field4382[var161];
                    int var168 = super.field4435[var159];
                    int var169 = super.field4435[var160];
                    int var170 = super.field4435[var161];
                    int var171 = super.field4427[var159];
                    int var172 = super.field4427[var160];
                    int var173 = super.field4427[var161];
                    int var174 = var165 - var166;
                    int var175 = var167 - var166;
                    int var176 = var168 - var169;
                    int var177 = var170 - var169;
                    int var178 = var171 - var172;
                    int var179 = var173 - var172;
                    int var180 = var176 * var179 - var177 * var178;
                    int var181 = var175 * var178 - var174 * var179;
                    int var182 = var174 * var177 - var175 * var176;
                    if (var172 * var182 + var166 * var180 + var169 * var181 > 0) {
                        super.field4410[var12] = true;
                        int var183 = (super.field4470[var159] + super.field4470[var160] + super.field4470[var161]) / 3 >> var7;
                        if (super.field4377[var183] < 64) {
                            super.field4459[var183][super.field4377[var183]++] = var12;
                        } else {
                            int var184 = super.field4377[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field4404[var9] = 0;
                                super.field4377[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field4375[var184][super.field4404[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field4383[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field4377[var14] < 64) {
                        super.field4459[var14][super.field4377[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field4377[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field4404[var9] = 0;
                            super.field4377[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field4375[var15][super.field4404[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field4463 == null) {
            if (!arg4 && super.field4424 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field4377[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field4459[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method1522(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field4377[var16] - 64 - 1;
                            int[] var22 = super.field4375[var21];
                            for (int var23 = 0; var23 < super.field4404[var21]; ++var23) {
                                this.method1522(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field4377[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field4459[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method1518(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field4377[var24] - 64 - 1;
                            int[] var30 = super.field4375[var29];
                            for (int var31 = 0; var31 < super.field4404[var29]; ++var31) {
                                this.method1518(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field4377[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field4459[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field4429[var37];
                                if (var38 == -1 || !super.field4424[var38].field1283) {
                                    this.method1522(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field4377[var32] - 64 - 1;
                        int[] var40 = super.field4375[var39];
                        for (int var41 = 0; var41 < super.field4404[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field4429[var42];
                                if (var43 == -1 || !super.field4424[var43].field1283) {
                                    this.method1522(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field4377[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field4459[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field4429[var49];
                                if (var50 != -1) {
                                    class82 var51 = super.field4424[var50];
                                    class155 var52 = super.field4418[var50];
                                    if (!var51.field1283) {
                                        this.method1518(var49);
                                    }
                                    super.field4460.method2489(var52.field2438, var52.field2451, var52.field2442, var52.field2455, var52.field2447, var52.field2454, var51.field1279 & 65535, var52.field2443, var51.field1282, var51.field1285);
                                } else {
                                    this.method1518(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class115 var54 = super.field4400[var53];
                                int var55 = super.field4383[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field4460.method2481(var54, super.field4388[var53], super.field4456[var53], var55, (super.field4460.field6017 * var54.field1983 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field4377[var44] - 64 - 1;
                        int[] var57 = super.field4375[var56];
                        for (int var58 = 0; var58 < super.field4404[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field4429[var59];
                                if (var60 != -1) {
                                    class82 var61 = super.field4424[var60];
                                    class155 var62 = super.field4418[var60];
                                    if (!var61.field1283) {
                                        this.method1518(var59);
                                    }
                                    super.field4460.method2489(var62.field2438, var62.field2451, var62.field2442, var62.field2455, var62.field2447, var62.field2454, var61.field1279 & 65535, var62.field2443, var61.field1282, var61.field1285);
                                } else {
                                    this.method1518(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class115 var64 = super.field4400[var63];
                                int var65 = super.field4383[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field4460.method2481(var64, super.field4388[var63], super.field4456[var63], var65, (super.field4460.field6017 * var64.field1983 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field4438[var66] = 0;
                super.field4378[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field4377[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field4459[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field4463[var72];
                                int var74 = super.field4438[var73]++;
                                super.field4414[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field4378[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field4398[var74] = var67;
                                } else {
                                    super.field4419[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field4400[(var72 >> 16) - 1].field1984;
                                int var76 = super.field4438[var75]++;
                                super.field4414[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field4378[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field4398[var76] = var67;
                                } else {
                                    super.field4419[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field4377[var67] - 64 - 1;
                        int[] var78 = super.field4375[var77];
                        for (int var79 = 0; var79 < super.field4404[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field4463[var80];
                                int var82 = super.field4438[var81]++;
                                super.field4414[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field4378[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field4398[var82] = var67;
                                } else {
                                    super.field4419[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field4400[(var80 >> 16) - 1].field1984;
                                int var84 = super.field4438[var83]++;
                                super.field4414[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field4378[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field4398[var84] = var67;
                                } else {
                                    super.field4419[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field4377[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field4459[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field4463[var150];
                            int var152 = super.field4438[var151]++;
                            super.field4414[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field4378[var151] += var85;
                            } else if (var151 == 10) {
                                super.field4398[var152] = var85;
                            } else {
                                super.field4419[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field4377[var85] - 64 - 1;
                        int[] var154 = super.field4375[var153];
                        for (int var155 = 0; var155 < super.field4404[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field4463[var156];
                            int var158 = super.field4438[var157]++;
                            super.field4414[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field4378[var157] += var85;
                            } else if (var157 == 10) {
                                super.field4398[var158] = var85;
                            } else {
                                super.field4419[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field4438[1] > 0 || super.field4438[2] > 0) {
                var86 = (super.field4378[1] + super.field4378[2]) / (super.field4438[1] + super.field4438[2]);
            }
            int var87 = 0;
            if (super.field4438[3] > 0 || super.field4438[4] > 0) {
                var87 = (super.field4378[3] + super.field4378[4]) / (super.field4438[3] + super.field4438[4]);
            }
            int var88 = 0;
            if (super.field4438[6] > 0 || super.field4438[8] > 0) {
                var88 = (super.field4378[6] + super.field4378[8]) / (super.field4438[6] + super.field4438[8]);
            }
            int var89 = 0;
            int var90 = super.field4438[10];
            int[] var91 = super.field4414[10];
            int[] var92 = super.field4398;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field4438[11];
                var91 = super.field4414[11];
                var92 = super.field4419;
            }
            int var93;
            if (var89 < var90) {
                var93 = var92[var89];
            } else {
                var93 = -1000;
            }
            for (int var94 = 0; var94 < 10; ++var94) {
                if (arg1) {
                    while (var94 == 0 && var93 > var86) {
                        int var104 = var91[var89++];
                        if (var104 < 65536) {
                            int var105 = super.field4429[var104];
                            if (var105 == -1 || !super.field4424[var105].field1283) {
                                this.method1522(var104);
                            }
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var106 = var91[var89++];
                        if (var106 < 65536) {
                            int var107 = super.field4429[var106];
                            if (var107 == -1 || !super.field4424[var107].field1283) {
                                this.method1522(var106);
                            }
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var108 = var91[var89++];
                        if (var108 < 65536) {
                            int var109 = super.field4429[var108];
                            if (var109 == -1 || !super.field4424[var109].field1283) {
                                this.method1522(var108);
                            }
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var94 == 0 && var93 > var86) {
                        int var110 = var91[var89++];
                        if (var110 < 65536) {
                            int var111 = super.field4429[var110];
                            if (var111 != -1) {
                                class82 var112 = super.field4424[var111];
                                class155 var113 = super.field4418[var111];
                                if (!var112.field1283) {
                                    this.method1518(var110);
                                }
                                super.field4460.method2489(var113.field2438, var113.field2451, var113.field2442, var113.field2455, var113.field2447, var113.field2454, var112.field1279 & 65535, var113.field2443, var112.field1282, var112.field1285);
                            } else {
                                this.method1518(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class115 var115 = super.field4400[var114];
                            int var116 = super.field4383[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field4460.method2481(var115, super.field4388[var114], super.field4456[var114], var116, (super.field4460.field6017 * var115.field1983 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 3 && var93 > var87) {
                        int var117 = var91[var89++];
                        if (var117 < 65536) {
                            int var118 = super.field4429[var117];
                            if (var118 != -1) {
                                class82 var119 = super.field4424[var118];
                                class155 var120 = super.field4418[var118];
                                if (!var119.field1283) {
                                    this.method1518(var117);
                                }
                                super.field4460.method2489(var120.field2438, var120.field2451, var120.field2442, var120.field2455, var120.field2447, var120.field2454, var119.field1279 & 65535, var120.field2443, var119.field1282, var119.field1285);
                            } else {
                                this.method1518(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class115 var122 = super.field4400[var121];
                            int var123 = super.field4383[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field4460.method2481(var122, super.field4388[var121], super.field4456[var121], var123, (super.field4460.field6017 * var122.field1983 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                    while (var94 == 5 && var93 > var88) {
                        int var124 = var91[var89++];
                        if (var124 < 65536) {
                            int var125 = super.field4429[var124];
                            if (var125 != -1) {
                                class82 var126 = super.field4424[var125];
                                class155 var127 = super.field4418[var125];
                                if (!var126.field1283) {
                                    this.method1518(var124);
                                }
                                super.field4460.method2489(var127.field2438, var127.field2451, var127.field2442, var127.field2455, var127.field2447, var127.field2454, var126.field1279 & 65535, var127.field2443, var126.field1282, var126.field1285);
                            } else {
                                this.method1518(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class115 var129 = super.field4400[var128];
                            int var130 = super.field4383[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field4460.method2481(var129, super.field4388[var128], super.field4456[var128], var130, (super.field4460.field6017 * var129.field1983 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var90 = super.field4438[11];
                            var91 = super.field4414[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field4438[var94];
                int[] var132 = super.field4414[var94];
                if (!arg4 && super.field4424 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method1522(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method1518(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field4429[var139];
                            if (var140 != -1) {
                                class82 var141 = super.field4424[var140];
                                class155 var142 = super.field4418[var140];
                                if (!var141.field1283) {
                                    this.method1518(var139);
                                }
                                super.field4460.method2489(var142.field2438, var142.field2451, var142.field2442, var142.field2455, var142.field2447, var142.field2454, var141.field1279 & 65535, var142.field2443, var141.field1282, var141.field1285);
                            } else {
                                this.method1518(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class115 var144 = super.field4400[var143];
                            int var145 = super.field4383[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field4460.method2481(var144, super.field4388[var143], super.field4456[var143], var145, (super.field4460.field6017 * var144.field1983 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field4429[var136];
                            if (var137 == -1 || !super.field4424[var137].field1283) {
                                this.method1522(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field4424 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method1522(var91[var89++]);
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var91 = super.field4414[11];
                            var90 = super.field4438[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method1518(var91[var89++]);
                        if (var89 == var90 && super.field4414[11] != var91) {
                            var89 = 0;
                            var91 = super.field4414[11];
                            var90 = super.field4438[11];
                            var92 = super.field4419;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
            } else if (!arg1) {
                while (var93 != -1000) {
                    int var97 = var91[var89++];
                    if (var97 < 65536) {
                        int var98 = super.field4429[var97];
                        if (var98 != -1) {
                            class82 var99 = super.field4424[var98];
                            class155 var100 = super.field4418[var98];
                            if (!var99.field1283) {
                                this.method1518(var97);
                            }
                            super.field4460.method2489(var100.field2438, var100.field2451, var100.field2442, var100.field2455, var100.field2447, var100.field2454, var99.field1279 & 65535, var100.field2443, var99.field1282, var99.field1285);
                        } else {
                            this.method1518(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class115 var102 = super.field4400[var101];
                        int var103 = super.field4383[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field4460.method2481(var102, super.field4388[var101], super.field4456[var101], var103, (super.field4460.field6017 * var102.field1983 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field4414[11] != var91) {
                        var89 = 0;
                        var91 = super.field4414[11];
                        var90 = super.field4438[11];
                        var92 = super.field4419;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            } else {
                while (var93 != -1000) {
                    int var95 = var91[var89++];
                    if (var95 < 65536) {
                        int var96 = super.field4429[var95];
                        if (var96 == -1 || !super.field4424[var96].field1283) {
                            this.method1522(var95);
                        }
                    }
                    if (var89 == var90 && super.field4414[11] != var91) {
                        var89 = 0;
                        var91 = super.field4414[11];
                        var90 = super.field4438[11];
                        var92 = super.field4419;
                    }
                    if (var89 < var90) {
                        var93 = var92[var89];
                    } else {
                        var93 = -1000;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lqe;[Lcl;)V", line = 1563)
    private class248(class437 arg0, class248[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V", line = 1567)
    private final void method1524(int arg0) {
        int var2 = 0;
        int var3 = super.field4460.field5982;
        short var4 = super.field4379[arg0];
        short var5 = super.field4395[arg0];
        short var6 = super.field4430[arg0];
        int var7 = super.field4427[var4];
        int var8 = super.field4427[var5];
        int var9 = super.field4427[var6];
        if (super.field4455 == null) {
            this.field3445.field4857 = 0;
        } else {
            this.field3445.field4857 = super.field4455[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field4421[var2] = super.field4402[var4];
            super.field4458[var2] = super.field4386[var4];
            super.field4392[var2++] = super.field4449[arg0] & 65535;
        } else {
            int var10 = super.field4382[var4];
            int var11 = super.field4435[var4];
            int var12 = super.field4449[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class321.field4480[var9 - var7];
                super.field4421[var2] = (((super.field4382[var6] - var10) * var13 >> 16) + var10) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var6] - var11) * var13 >> 16) + var11) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4473[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class321.field4480[var8 - var7];
                super.field4421[var2] = (((super.field4382[var5] - var10) * var14 >> 16) + var10) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var5] - var11) * var14 >> 16) + var11) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4439[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field4421[var2] = super.field4402[var5];
            super.field4458[var2] = super.field4386[var5];
            super.field4392[var2++] = super.field4439[arg0] & 65535;
        } else {
            int var15 = super.field4382[var5];
            int var16 = super.field4435[var5];
            int var17 = super.field4439[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class321.field4480[var7 - var8];
                super.field4421[var2] = (((super.field4382[var4] - var15) * var18 >> 16) + var15) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var4] - var16) * var18 >> 16) + var16) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4449[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class321.field4480[var9 - var8];
                super.field4421[var2] = (((super.field4382[var6] - var15) * var19 >> 16) + var15) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var6] - var16) * var19 >> 16) + var16) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4473[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field4421[var2] = super.field4402[var6];
            super.field4458[var2] = super.field4386[var6];
            super.field4392[var2++] = super.field4473[arg0] & 65535;
        } else {
            int var20 = super.field4382[var6];
            int var21 = super.field4435[var6];
            int var22 = super.field4473[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class321.field4480[var8 - var9];
                super.field4421[var2] = (((super.field4382[var5] - var20) * var23 >> 16) + var20) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var5] - var21) * var23 >> 16) + var21) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4439[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class321.field4480[var7 - var9];
                super.field4421[var2] = (((super.field4382[var4] - var20) * var24 >> 16) + var20) * super.field4460.field6017 / var3 + super.field4374.field3807;
                super.field4458[var2] = (((super.field4435[var4] - var21) * var24 >> 16) + var21) * super.field4460.field6009 / var3 + super.field4374.field3816;
                super.field4392[var2++] = (((super.field4449[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field4421[0];
        int var26 = super.field4421[1];
        int var27 = super.field4421[2];
        int var28 = super.field4458[0];
        int var29 = super.field4458[1];
        int var30 = super.field4458[2];
        this.field3445.field4861 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field4374.field3840 || var26 > super.field4374.field3840 || var27 > super.field4374.field3840) {
                this.field3445.field4861 = true;
            }
            if (super.field4440 != null && super.field4440[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field4432 != null && super.field4432[arg0] != -1) {
                    int var31 = super.field4432[arg0] & 255;
                    var32 = super.field4465[var31];
                    var33 = super.field4475[var31];
                    var34 = super.field4396[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field4473[arg0] == -1) {
                    this.field3445.method2131(var28, var29, var30, var25, var26, var27, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var32], super.field4382[var33], super.field4382[var34], super.field4435[var32], super.field4435[var33], super.field4435[var34], super.field4427[var32], super.field4427[var33], super.field4427[var34], super.field4440[arg0]);
                } else {
                    this.field3445.method2131(var28, var29, var30, var25, var26, var27, super.field4392[0], super.field4392[1], super.field4392[2], super.field4382[var32], super.field4382[var33], super.field4382[var34], super.field4435[var32], super.field4435[var33], super.field4435[var34], super.field4427[var32], super.field4427[var33], super.field4427[var34], super.field4440[arg0]);
                }
            } else if (super.field4473[arg0] == -1) {
                this.field3445.method2119(var28, var29, var30, var25, var26, var27, class446.field6101[super.field4449[arg0] & 65535]);
            } else {
                this.field3445.method2121(var28, var29, var30, var25, var26, var27, super.field4392[0], super.field4392[1], super.field4392[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field4374.field3840 || var26 > super.field4374.field3840 || var27 > super.field4374.field3840 || super.field4421[3] < 0 || super.field4421[3] > super.field4374.field3840) {
                this.field3445.field4861 = true;
            }
            if (super.field4440 == null || super.field4440[arg0] == -1) {
                if (super.field4473[arg0] == -1) {
                    int var40 = class446.field6101[super.field4449[arg0] & 65535];
                    this.field3445.method2119(var28, var29, var30, var25, var26, var27, var40);
                    this.field3445.method2119(var28, var30, super.field4458[3], var25, var27, super.field4421[3], var40);
                    return;
                }
                this.field3445.method2121(var28, var29, var30, var25, var26, var27, super.field4392[0], super.field4392[1], super.field4392[2]);
                this.field3445.method2121(var28, var30, super.field4458[3], var25, var27, super.field4421[3], super.field4392[0], super.field4392[2], super.field4392[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field4432 != null && super.field4432[arg0] != -1) {
                int var35 = super.field4432[arg0] & 255;
                var36 = super.field4465[var35];
                var37 = super.field4475[var35];
                var38 = super.field4396[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field4440[arg0];
            if (super.field4473[arg0] == -1) {
                this.field3445.method2131(var28, var29, var30, var25, var26, var27, super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var36], super.field4382[var37], super.field4382[var38], super.field4435[var36], super.field4435[var37], super.field4435[var38], super.field4427[var36], super.field4427[var37], super.field4427[var38], var39);
                this.field3445.method2131(var28, var30, super.field4458[3], var25, var27, super.field4421[3], super.field4449[arg0], super.field4449[arg0], super.field4449[arg0], super.field4382[var36], super.field4382[var37], super.field4382[var38], super.field4435[var36], super.field4435[var37], super.field4435[var38], super.field4427[var36], super.field4427[var37], super.field4427[var38], var39);
                return;
            }
            this.field3445.method2131(var28, var29, var30, var25, var26, var27, super.field4392[0], super.field4392[1], super.field4392[2], super.field4382[var36], super.field4382[var37], super.field4382[var38], super.field4435[var36], super.field4435[var37], super.field4435[var38], super.field4427[var36], super.field4427[var37], super.field4427[var38], var39);
            this.field3445.method2131(var28, var30, super.field4458[3], var25, var27, super.field4421[3], super.field4392[0], super.field4392[2], super.field4392[3], super.field4382[var36], super.field4382[var37], super.field4382[var38], super.field4435[var36], super.field4435[var37], super.field4435[var38], super.field4427[var36], super.field4427[var37], super.field4427[var38], var39);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lqe;Lpf;IIII)V", line = 1804)
    public class248(class437 arg0, class545 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "()V", line = 1807)
    public final void method1525() {
        this.field3445 = null;
    }

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "()V", line = 1810)
    public final void method1526() {
        super.field4374.field3840 = this.field3445.field4853;
        super.field4374.field3807 = this.field3445.field4862;
        super.field4374.field3816 = this.field3445.field4852;
    }
}
