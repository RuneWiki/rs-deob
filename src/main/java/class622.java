import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class622 extends class213 {

    @OriginalMember(owner = "client!wl", name = "nc", descriptor = "Leq;")
    private class613 field8786;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
    public final void method768(int arg0) {
        if (super.field3187[arg0]) {
            this.method3534(arg0);
        } else {
            short var2 = super.field3200[arg0];
            short var3 = super.field3146[arg0];
            short var4 = super.field3191[arg0];
            this.field8786.field8707 = super.field3219[arg0];
            if (super.field3152 == null) {
                this.field8786.field8704 = 0;
            } else {
                this.field8786.field8704 = super.field3152[arg0] & 255;
            }
            if (super.field3144 != null && super.field3144[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field3232 != null && super.field3232[arg0] != -1) {
                    int var5 = super.field3232[arg0] & 255;
                    var6 = super.field3210[var5];
                    var7 = super.field3229[var5];
                    var8 = super.field3151[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field3204[arg0] == -1) {
                    this.field8786.method3485(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var6], super.field3221[var7], super.field3221[var8], super.field3136[var6], super.field3136[var7], super.field3136[var8], super.field3189[var6], super.field3189[var7], super.field3189[var8], super.field3144[arg0]);
                } else {
                    this.field8786.method3485(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], super.field3183[arg0], super.field3175[arg0], super.field3204[arg0], super.field3221[var6], super.field3221[var7], super.field3221[var8], super.field3136[var6], super.field3136[var7], super.field3136[var8], super.field3189[var6], super.field3189[var7], super.field3189[var8], super.field3144[arg0]);
                }
            } else if (super.field3204[arg0] == -1) {
                this.field8786.method3484(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], class12.field126[super.field3183[arg0] & 65535]);
            } else {
                this.field8786.method3487(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], super.field3183[arg0] & 65535, super.field3175[arg0] & 65535, super.field3204[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "()V")
    public final void method763() {
        this.field8786 = null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lvda;Lld;IIII)V")
    public class622(class309 arg0, class560 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method770(Thread arg0) {
        super.method770(arg0);
        class412 var2 = (class412) super.field3135.method395(arg0);
        this.field8786 = var2.field6106;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
    public final void method769(int arg0) {
        if (!super.field3135.field4493) {
            short var2 = super.field3200[arg0];
            short var3 = super.field3146[arg0];
            short var4 = super.field3191[arg0];
            int var5 = super.field3167[var2] - super.field3135.field4496;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field3167[var3] - super.field3135.field4496;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field3167[var4] - super.field3135.field4496;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method768(arg0);
                } else {
                    if (super.field3152 == null) {
                        this.field8786.field8704 = 0;
                    } else {
                        this.field8786.field8704 = super.field3152[arg0] & 255;
                    }
                    this.field8786.field8707 = super.field3219[arg0];
                    if (super.field3144 != null && super.field3144[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field3232 != null && super.field3232[arg0] != -1) {
                            int var9 = super.field3232[arg0] & 255;
                            var10 = super.field3210[var9];
                            var11 = super.field3229[var9];
                            var12 = super.field3151[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field3204[arg0] == -1) {
                            this.field8786.method3483(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], super.field3135.field4500, var5, var6, var7, super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var10], super.field3221[var11], super.field3221[var12], super.field3136[var10], super.field3136[var11], super.field3136[var12], super.field3189[var10], super.field3189[var11], super.field3189[var12], super.field3144[arg0]);
                        } else {
                            this.field8786.method3483(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], super.field3135.field4500, var5, var6, var7, super.field3183[arg0], super.field3175[arg0], super.field3204[arg0], super.field3221[var10], super.field3221[var11], super.field3221[var12], super.field3136[var10], super.field3136[var11], super.field3136[var12], super.field3189[var10], super.field3189[var11], super.field3189[var12], super.field3144[arg0]);
                        }
                    } else if (super.field3204[arg0] == -1) {
                        this.field8786.method3480(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], class276.method1777((byte) 74, var5 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 99, var6 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 66, var7 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]));
                    } else {
                        this.field8786.method3480(super.field3213[var2], super.field3213[var3], super.field3213[var4], super.field3169[var2], super.field3169[var3], super.field3169[var4], class276.method1777((byte) 89, var5 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 93, var6 << 24 | super.field3135.field4500, class12.field126[super.field3175[arg0] & 65535]), class276.method1777((byte) 83, var7 << 24 | super.field3135.field4500, class12.field126[super.field3204[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field3187[arg0]) {
            short var13 = super.field3200[arg0];
            short var14 = super.field3146[arg0];
            short var15 = super.field3191[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field3163[var13] > super.field3135.field4486) {
                var16 = 255;
            } else if (super.field3163[var13] > super.field3135.field4476) {
                var16 = (super.field3135.field4476 - super.field3163[var13]) * 255 / (super.field3135.field4476 - super.field3135.field4486);
            }
            if (super.field3163[var14] > super.field3135.field4486) {
                var17 = 255;
            } else if (super.field3163[var14] > super.field3135.field4476) {
                var17 = (super.field3135.field4476 - super.field3163[var14]) * 255 / (super.field3135.field4476 - super.field3135.field4486);
            }
            if (super.field3163[var15] > super.field3135.field4486) {
                var18 = 255;
            } else if (super.field3163[var15] > super.field3135.field4476) {
                var18 = (super.field3135.field4476 - super.field3163[var15]) * 255 / (super.field3135.field4476 - super.field3135.field4486);
            }
            if (super.field3152 == null) {
                this.field8786.field8704 = 0;
            } else {
                this.field8786.field8704 = super.field3152[arg0] & 255;
            }
            this.field8786.field8707 = super.field3219[arg0];
            if (super.field3144 != null && super.field3144[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field3232 != null && super.field3232[arg0] != -1) {
                    int var19 = super.field3232[arg0] & 255;
                    var20 = super.field3210[var19];
                    var21 = super.field3229[var19];
                    var22 = super.field3151[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field3204[arg0] == -1) {
                    this.field8786.method3483(super.field3213[var13], super.field3213[var14], super.field3213[var15], super.field3169[var13], super.field3169[var14], super.field3169[var15], super.field3135.field4500, var16, var17, var18, super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var20], super.field3221[var21], super.field3221[var22], super.field3136[var20], super.field3136[var21], super.field3136[var22], super.field3189[var20], super.field3189[var21], super.field3189[var22], super.field3144[arg0]);
                } else {
                    this.field8786.method3483(super.field3213[var13], super.field3213[var14], super.field3213[var15], super.field3169[var13], super.field3169[var14], super.field3169[var15], super.field3135.field4500, var16, var17, var18, super.field3183[arg0], super.field3175[arg0], super.field3204[arg0], super.field3221[var20], super.field3221[var21], super.field3221[var22], super.field3136[var20], super.field3136[var21], super.field3136[var22], super.field3189[var20], super.field3189[var21], super.field3189[var22], super.field3144[arg0]);
                }
            } else if (super.field3204[arg0] == -1) {
                this.field8786.method3480(super.field3213[var13], super.field3213[var14], super.field3213[var15], super.field3169[var13], super.field3169[var14], super.field3169[var15], class276.method1777((byte) 96, var16 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 92, var17 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 74, var18 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]));
            } else {
                this.field8786.method3480(super.field3213[var13], super.field3213[var14], super.field3213[var15], super.field3169[var13], super.field3169[var14], super.field3169[var15], class276.method1777((byte) 111, var16 << 24 | super.field3135.field4500, class12.field126[super.field3183[arg0] & 65535]), class276.method1777((byte) 100, var17 << 24 | super.field3135.field4500, class12.field126[super.field3175[arg0] & 65535]), class276.method1777((byte) 103, var18 << 24 | super.field3135.field4500, class12.field126[super.field3204[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
    public final void method766(int arg0) {
        this.field8786.field8696 = (arg0 & 1) == 0;
        this.field8786.field8703 = false;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lvda;)V")
    public class622(class309 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lvf;[Lwl;)Lwl;")
    public static final class622 method3533(class73 arg0, class622[] arg1) {
        int var2 = 0;
        class622 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class622(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "()V")
    public final void method767() {
        super.field3199.field2547 = this.field8786.field8697;
        super.field3199.field2542 = this.field8786.field8694;
        super.field3199.field2541 = this.field8786.field8705;
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V")
    private final void method3534(int arg0) {
        int var2 = 0;
        int var3 = super.field3135.field4490;
        short var4 = super.field3200[arg0];
        short var5 = super.field3146[arg0];
        short var6 = super.field3191[arg0];
        int var7 = super.field3189[var4];
        int var8 = super.field3189[var5];
        int var9 = super.field3189[var6];
        if (super.field3152 == null) {
            this.field8786.field8704 = 0;
        } else {
            this.field8786.field8704 = super.field3152[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field3185[var2] = super.field3169[var4];
            super.field3157[var2] = super.field3213[var4];
            super.field3233[var2++] = super.field3183[arg0] & 65535;
        } else {
            int var10 = super.field3221[var4];
            int var11 = super.field3136[var4];
            int var12 = super.field3183[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class213.field3235[var9 - var7];
                super.field3185[var2] = (((super.field3221[var6] - var10) * var13 >> 16) + var10) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var6] - var11) * var13 >> 16) + var11) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3204[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class213.field3235[var8 - var7];
                super.field3185[var2] = (((super.field3221[var5] - var10) * var14 >> 16) + var10) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var5] - var11) * var14 >> 16) + var11) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3175[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field3185[var2] = super.field3169[var5];
            super.field3157[var2] = super.field3213[var5];
            super.field3233[var2++] = super.field3175[arg0] & 65535;
        } else {
            int var15 = super.field3221[var5];
            int var16 = super.field3136[var5];
            int var17 = super.field3175[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class213.field3235[var7 - var8];
                super.field3185[var2] = (((super.field3221[var4] - var15) * var18 >> 16) + var15) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var4] - var16) * var18 >> 16) + var16) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3183[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class213.field3235[var9 - var8];
                super.field3185[var2] = (((super.field3221[var6] - var15) * var19 >> 16) + var15) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var6] - var16) * var19 >> 16) + var16) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3204[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field3185[var2] = super.field3169[var6];
            super.field3157[var2] = super.field3213[var6];
            super.field3233[var2++] = super.field3204[arg0] & 65535;
        } else {
            int var20 = super.field3221[var6];
            int var21 = super.field3136[var6];
            int var22 = super.field3204[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class213.field3235[var8 - var9];
                super.field3185[var2] = (((super.field3221[var5] - var20) * var23 >> 16) + var20) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var5] - var21) * var23 >> 16) + var21) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3175[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class213.field3235[var7 - var9];
                super.field3185[var2] = (((super.field3221[var4] - var20) * var24 >> 16) + var20) * super.field3135.field4485 / var3 + super.field3199.field2542;
                super.field3157[var2] = (((super.field3136[var4] - var21) * var24 >> 16) + var21) * super.field3135.field4505 / var3 + super.field3199.field2541;
                super.field3233[var2++] = (((super.field3183[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field3185[0];
        int var26 = super.field3185[1];
        int var27 = super.field3185[2];
        int var28 = super.field3157[0];
        int var29 = super.field3157[1];
        int var30 = super.field3157[2];
        this.field8786.field8707 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field3199.field2547 || var26 > super.field3199.field2547 || var27 > super.field3199.field2547) {
                this.field8786.field8707 = true;
            }
            if (super.field3144 != null && super.field3144[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field3232 != null && super.field3232[arg0] != -1) {
                    int var31 = super.field3232[arg0] & 255;
                    var32 = super.field3210[var31];
                    var33 = super.field3229[var31];
                    var34 = super.field3151[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field3204[arg0] == -1) {
                    this.field8786.method3485(var28, var29, var30, var25, var26, var27, super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var32], super.field3221[var33], super.field3221[var34], super.field3136[var32], super.field3136[var33], super.field3136[var34], super.field3189[var32], super.field3189[var33], super.field3189[var34], super.field3144[arg0]);
                } else {
                    this.field8786.method3485(var28, var29, var30, var25, var26, var27, super.field3233[0], super.field3233[1], super.field3233[2], super.field3221[var32], super.field3221[var33], super.field3221[var34], super.field3136[var32], super.field3136[var33], super.field3136[var34], super.field3189[var32], super.field3189[var33], super.field3189[var34], super.field3144[arg0]);
                }
            } else if (super.field3204[arg0] == -1) {
                this.field8786.method3484(var28, var29, var30, var25, var26, var27, class12.field126[super.field3183[arg0] & 65535]);
            } else {
                this.field8786.method3487(var28, var29, var30, var25, var26, var27, super.field3233[0], super.field3233[1], super.field3233[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field3199.field2547 || var26 > super.field3199.field2547 || var27 > super.field3199.field2547 || super.field3185[3] < 0 || super.field3185[3] > super.field3199.field2547) {
                this.field8786.field8707 = true;
            }
            if (super.field3144 == null || super.field3144[arg0] == -1) {
                if (super.field3204[arg0] == -1) {
                    int var40 = class12.field126[super.field3183[arg0] & 65535];
                    this.field8786.method3484(var28, var29, var30, var25, var26, var27, var40);
                    this.field8786.method3484(var28, var30, super.field3157[3], var25, var27, super.field3185[3], var40);
                    return;
                }
                this.field8786.method3487(var28, var29, var30, var25, var26, var27, super.field3233[0], super.field3233[1], super.field3233[2]);
                this.field8786.method3487(var28, var30, super.field3157[3], var25, var27, super.field3185[3], super.field3233[0], super.field3233[2], super.field3233[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field3232 != null && super.field3232[arg0] != -1) {
                int var35 = super.field3232[arg0] & 255;
                var36 = super.field3210[var35];
                var37 = super.field3229[var35];
                var38 = super.field3151[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field3144[arg0];
            if (super.field3204[arg0] == -1) {
                this.field8786.method3485(var28, var29, var30, var25, var26, var27, super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var36], super.field3221[var37], super.field3221[var38], super.field3136[var36], super.field3136[var37], super.field3136[var38], super.field3189[var36], super.field3189[var37], super.field3189[var38], var39);
                this.field8786.method3485(var28, var30, super.field3157[3], var25, var27, super.field3185[3], super.field3183[arg0], super.field3183[arg0], super.field3183[arg0], super.field3221[var36], super.field3221[var37], super.field3221[var38], super.field3136[var36], super.field3136[var37], super.field3136[var38], super.field3189[var36], super.field3189[var37], super.field3189[var38], var39);
                return;
            }
            this.field8786.method3485(var28, var29, var30, var25, var26, var27, super.field3233[0], super.field3233[1], super.field3233[2], super.field3221[var36], super.field3221[var37], super.field3221[var38], super.field3136[var36], super.field3136[var37], super.field3136[var38], super.field3189[var36], super.field3189[var37], super.field3189[var38], var39);
            this.field8786.method3485(var28, var30, super.field3157[3], var25, var27, super.field3185[3], super.field3233[0], super.field3233[2], super.field3233[3], super.field3221[var36], super.field3221[var37], super.field3221[var38], super.field3136[var36], super.field3136[var37], super.field3136[var38], super.field3189[var36], super.field3189[var37], super.field3189[var38], var39);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BIZ)Lr;")
    public final class519 method765(byte arg0, int arg1, boolean arg2) {
        this.method1431(Thread.currentThread());
        class213 var4;
        class213 var5;
        if (arg0 == 1) {
            var4 = super.field3228;
            var5 = super.field3133;
        } else if (arg0 == 2) {
            var4 = super.field3162;
            var5 = super.field3217;
        } else if (arg0 == 3) {
            var4 = super.field3220;
            var5 = super.field3147;
        } else if (arg0 == 4) {
            var4 = super.field3155;
            var5 = super.field3145;
        } else if (arg0 == 5) {
            var4 = super.field3160;
            var5 = super.field3192;
        } else {
            var5 = var4 = new class622(super.field3135);
        }
        return this.method1439(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lvda;[Lwl;)V")
    private class622(class309 arg0, class622[] arg1) {
        super(arg0, arg1);
    }
}
