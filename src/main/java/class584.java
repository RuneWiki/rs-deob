import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class584 extends class369 {

    @OriginalMember(owner = "client!ab", name = "vc", descriptor = "Lrda;")
    private class578 field8402;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lvr;[Lab;)Lab;")
    public static final class584 method3399(class118 arg0, class584[] arg1) {
        int var2 = 0;
        class584 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class584(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "()V")
    public final void method2371() {
        this.field8402 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public final void method2381(int arg0) {
        if (!super.field5577.field8169) {
            short var2 = super.field5651[arg0];
            short var3 = super.field5653[arg0];
            short var4 = super.field5591[arg0];
            int var5 = super.field5664[var2] - super.field5577.field8186;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field5664[var3] - super.field5577.field8186;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field5664[var4] - super.field5577.field8186;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method2384(arg0);
                } else {
                    if (super.field5658 == null) {
                        this.field8402.field8347 = 0;
                    } else {
                        this.field8402.field8347 = super.field5658[arg0] & 255;
                    }
                    this.field8402.field8345 = super.field5621[arg0];
                    if (super.field5597 != null && super.field5597[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field5663 != null && super.field5663[arg0] != -1) {
                            int var9 = super.field5663[arg0] & 255;
                            var10 = super.field5612[var9];
                            var11 = super.field5615[var9];
                            var12 = super.field5643[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field5589[arg0] == -1) {
                            this.field8402.method3355(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], super.field5577.field8181, var5, var6, var7, super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var10], super.field5645[var11], super.field5645[var12], super.field5657[var10], super.field5657[var11], super.field5657[var12], super.field5594[var10], super.field5594[var11], super.field5594[var12], super.field5597[arg0]);
                        } else {
                            this.field8402.method3355(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], super.field5577.field8181, var5, var6, var7, super.field5601[arg0], super.field5662[arg0], super.field5589[arg0], super.field5645[var10], super.field5645[var11], super.field5645[var12], super.field5657[var10], super.field5657[var11], super.field5657[var12], super.field5594[var10], super.field5594[var11], super.field5594[var12], super.field5597[arg0]);
                        }
                    } else if (super.field5589[arg0] == -1) {
                        this.field8402.method3367(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], class1.method3(-125, class348.field4972[super.field5601[arg0] & 65535], var5 << 24 | super.field5577.field8181), class1.method3(-127, class348.field4972[super.field5601[arg0] & 65535], var6 << 24 | super.field5577.field8181), class1.method3(-126, class348.field4972[super.field5601[arg0] & 65535], var7 << 24 | super.field5577.field8181));
                    } else {
                        this.field8402.method3367(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], class1.method3(-127, class348.field4972[super.field5601[arg0] & 65535], var5 << 24 | super.field5577.field8181), class1.method3(-127, class348.field4972[super.field5662[arg0] & 65535], var6 << 24 | super.field5577.field8181), class1.method3(-128, class348.field4972[super.field5589[arg0] & 65535], var7 << 24 | super.field5577.field8181));
                    }
                }
            }
        } else if (!super.field5639[arg0]) {
            short var13 = super.field5651[arg0];
            short var14 = super.field5653[arg0];
            short var15 = super.field5591[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field5599[var13] > super.field5577.field8189) {
                var16 = 255;
            } else if (super.field5599[var13] > super.field5577.field8206) {
                var16 = (super.field5577.field8206 - super.field5599[var13]) * 255 / (super.field5577.field8206 - super.field5577.field8189);
            }
            if (super.field5599[var14] > super.field5577.field8189) {
                var17 = 255;
            } else if (super.field5599[var14] > super.field5577.field8206) {
                var17 = (super.field5577.field8206 - super.field5599[var14]) * 255 / (super.field5577.field8206 - super.field5577.field8189);
            }
            if (super.field5599[var15] > super.field5577.field8189) {
                var18 = 255;
            } else if (super.field5599[var15] > super.field5577.field8206) {
                var18 = (super.field5577.field8206 - super.field5599[var15]) * 255 / (super.field5577.field8206 - super.field5577.field8189);
            }
            if (super.field5658 == null) {
                this.field8402.field8347 = 0;
            } else {
                this.field8402.field8347 = super.field5658[arg0] & 255;
            }
            this.field8402.field8345 = super.field5621[arg0];
            if (super.field5597 != null && super.field5597[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field5663 != null && super.field5663[arg0] != -1) {
                    int var19 = super.field5663[arg0] & 255;
                    var20 = super.field5612[var19];
                    var21 = super.field5615[var19];
                    var22 = super.field5643[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field5589[arg0] == -1) {
                    this.field8402.method3355(super.field5616[var13], super.field5616[var14], super.field5616[var15], super.field5565[var13], super.field5565[var14], super.field5565[var15], super.field5577.field8181, var16, var17, var18, super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var20], super.field5645[var21], super.field5645[var22], super.field5657[var20], super.field5657[var21], super.field5657[var22], super.field5594[var20], super.field5594[var21], super.field5594[var22], super.field5597[arg0]);
                } else {
                    this.field8402.method3355(super.field5616[var13], super.field5616[var14], super.field5616[var15], super.field5565[var13], super.field5565[var14], super.field5565[var15], super.field5577.field8181, var16, var17, var18, super.field5601[arg0], super.field5662[arg0], super.field5589[arg0], super.field5645[var20], super.field5645[var21], super.field5645[var22], super.field5657[var20], super.field5657[var21], super.field5657[var22], super.field5594[var20], super.field5594[var21], super.field5594[var22], super.field5597[arg0]);
                }
            } else if (super.field5589[arg0] == -1) {
                this.field8402.method3367(super.field5616[var13], super.field5616[var14], super.field5616[var15], super.field5565[var13], super.field5565[var14], super.field5565[var15], class1.method3(-125, class348.field4972[super.field5601[arg0] & 65535], var16 << 24 | super.field5577.field8181), class1.method3(-128, class348.field4972[super.field5601[arg0] & 65535], var17 << 24 | super.field5577.field8181), class1.method3(-126, class348.field4972[super.field5601[arg0] & 65535], var18 << 24 | super.field5577.field8181));
            } else {
                this.field8402.method3367(super.field5616[var13], super.field5616[var14], super.field5616[var15], super.field5565[var13], super.field5565[var14], super.field5565[var15], class1.method3(-127, class348.field4972[super.field5601[arg0] & 65535], var16 << 24 | super.field5577.field8181), class1.method3(-125, class348.field4972[super.field5662[arg0] & 65535], var17 << 24 | super.field5577.field8181), class1.method3(-127, class348.field4972[super.field5589[arg0] & 65535], var18 << 24 | super.field5577.field8181));
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
    public final void method2382(int arg0) {
        this.field8402.field8343 = (arg0 & 1) == 0;
        this.field8402.field8341 = false;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V")
    public final void method2360() {
        super.field5564.field7427 = this.field8402.field8335;
        super.field5564.field7438 = this.field8402.field8342;
        super.field5564.field7446 = this.field8402.field8346;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    private final void method3400(int arg0) {
        int var2 = 0;
        int var3 = super.field5577.field8204;
        short var4 = super.field5651[arg0];
        short var5 = super.field5653[arg0];
        short var6 = super.field5591[arg0];
        int var7 = super.field5594[var4];
        int var8 = super.field5594[var5];
        int var9 = super.field5594[var6];
        if (super.field5658 == null) {
            this.field8402.field8347 = 0;
        } else {
            this.field8402.field8347 = super.field5658[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field5585[var2] = super.field5565[var4];
            super.field5642[var2] = super.field5616[var4];
            super.field5647[var2++] = super.field5601[arg0] & 65535;
        } else {
            int var10 = super.field5645[var4];
            int var11 = super.field5657[var4];
            int var12 = super.field5601[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class369.field5667[var9 - var7];
                super.field5585[var2] = (((super.field5645[var6] - var10) * var13 >> 16) + var10) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var6] - var11) * var13 >> 16) + var11) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5589[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class369.field5667[var8 - var7];
                super.field5585[var2] = (((super.field5645[var5] - var10) * var14 >> 16) + var10) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var5] - var11) * var14 >> 16) + var11) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5662[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field5585[var2] = super.field5565[var5];
            super.field5642[var2] = super.field5616[var5];
            super.field5647[var2++] = super.field5662[arg0] & 65535;
        } else {
            int var15 = super.field5645[var5];
            int var16 = super.field5657[var5];
            int var17 = super.field5662[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class369.field5667[var7 - var8];
                super.field5585[var2] = (((super.field5645[var4] - var15) * var18 >> 16) + var15) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var4] - var16) * var18 >> 16) + var16) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5601[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class369.field5667[var9 - var8];
                super.field5585[var2] = (((super.field5645[var6] - var15) * var19 >> 16) + var15) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var6] - var16) * var19 >> 16) + var16) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5589[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field5585[var2] = super.field5565[var6];
            super.field5642[var2] = super.field5616[var6];
            super.field5647[var2++] = super.field5589[arg0] & 65535;
        } else {
            int var20 = super.field5645[var6];
            int var21 = super.field5657[var6];
            int var22 = super.field5589[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class369.field5667[var8 - var9];
                super.field5585[var2] = (((super.field5645[var5] - var20) * var23 >> 16) + var20) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var5] - var21) * var23 >> 16) + var21) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5662[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class369.field5667[var7 - var9];
                super.field5585[var2] = (((super.field5645[var4] - var20) * var24 >> 16) + var20) * super.field5577.field8178 / var3 + super.field5564.field7438;
                super.field5642[var2] = (((super.field5657[var4] - var21) * var24 >> 16) + var21) * super.field5577.field8173 / var3 + super.field5564.field7446;
                super.field5647[var2++] = (((super.field5601[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field5585[0];
        int var26 = super.field5585[1];
        int var27 = super.field5585[2];
        int var28 = super.field5642[0];
        int var29 = super.field5642[1];
        int var30 = super.field5642[2];
        this.field8402.field8345 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field5564.field7427 || var26 > super.field5564.field7427 || var27 > super.field5564.field7427) {
                this.field8402.field8345 = true;
            }
            if (super.field5597 != null && super.field5597[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field5663 != null && super.field5663[arg0] != -1) {
                    int var31 = super.field5663[arg0] & 255;
                    var32 = super.field5612[var31];
                    var33 = super.field5615[var31];
                    var34 = super.field5643[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field5589[arg0] == -1) {
                    this.field8402.method3360(var28, var29, var30, var25, var26, var27, super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var32], super.field5645[var33], super.field5645[var34], super.field5657[var32], super.field5657[var33], super.field5657[var34], super.field5594[var32], super.field5594[var33], super.field5594[var34], super.field5597[arg0]);
                } else {
                    this.field8402.method3360(var28, var29, var30, var25, var26, var27, super.field5647[0], super.field5647[1], super.field5647[2], super.field5645[var32], super.field5645[var33], super.field5645[var34], super.field5657[var32], super.field5657[var33], super.field5657[var34], super.field5594[var32], super.field5594[var33], super.field5594[var34], super.field5597[arg0]);
                }
            } else if (super.field5589[arg0] == -1) {
                this.field8402.method3358(var28, var29, var30, var25, var26, var27, class348.field4972[super.field5601[arg0] & 65535]);
            } else {
                this.field8402.method3365(var28, var29, var30, var25, var26, var27, super.field5647[0], super.field5647[1], super.field5647[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field5564.field7427 || var26 > super.field5564.field7427 || var27 > super.field5564.field7427 || super.field5585[3] < 0 || super.field5585[3] > super.field5564.field7427) {
                this.field8402.field8345 = true;
            }
            if (super.field5597 == null || super.field5597[arg0] == -1) {
                if (super.field5589[arg0] == -1) {
                    int var40 = class348.field4972[super.field5601[arg0] & 65535];
                    this.field8402.method3358(var28, var29, var30, var25, var26, var27, var40);
                    this.field8402.method3358(var28, var30, super.field5642[3], var25, var27, super.field5585[3], var40);
                    return;
                }
                this.field8402.method3365(var28, var29, var30, var25, var26, var27, super.field5647[0], super.field5647[1], super.field5647[2]);
                this.field8402.method3365(var28, var30, super.field5642[3], var25, var27, super.field5585[3], super.field5647[0], super.field5647[2], super.field5647[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field5663 != null && super.field5663[arg0] != -1) {
                int var35 = super.field5663[arg0] & 255;
                var36 = super.field5612[var35];
                var37 = super.field5615[var35];
                var38 = super.field5643[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field5597[arg0];
            if (super.field5589[arg0] == -1) {
                this.field8402.method3360(var28, var29, var30, var25, var26, var27, super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var36], super.field5645[var37], super.field5645[var38], super.field5657[var36], super.field5657[var37], super.field5657[var38], super.field5594[var36], super.field5594[var37], super.field5594[var38], var39);
                this.field8402.method3360(var28, var30, super.field5642[3], var25, var27, super.field5585[3], super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var36], super.field5645[var37], super.field5645[var38], super.field5657[var36], super.field5657[var37], super.field5657[var38], super.field5594[var36], super.field5594[var37], super.field5594[var38], var39);
                return;
            }
            this.field8402.method3360(var28, var29, var30, var25, var26, var27, super.field5647[0], super.field5647[1], super.field5647[2], super.field5645[var36], super.field5645[var37], super.field5645[var38], super.field5657[var36], super.field5657[var37], super.field5657[var38], super.field5594[var36], super.field5594[var37], super.field5594[var38], var39);
            this.field8402.method3360(var28, var30, super.field5642[3], var25, var27, super.field5585[3], super.field5647[0], super.field5647[2], super.field5647[3], super.field5645[var36], super.field5645[var37], super.field5645[var38], super.field5657[var36], super.field5657[var37], super.field5657[var38], super.field5594[var36], super.field5594[var37], super.field5594[var38], var39);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/lang/Thread;)V")
    public final void method2365(Thread arg0) {
        super.method2365(arg0);
        class365 var2 = (class365) super.field5577.method732(arg0);
        this.field8402 = var2.field5523;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lfk;Lor;IIII)V")
    public class584(class569 arg0, class557 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lfk;)V")
    public class584(class569 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIZ)Lba;")
    public final class327 method1382(byte arg0, int arg1, boolean arg2) {
        this.method2370(Thread.currentThread());
        class369 var4;
        class369 var5;
        if (arg0 == 1) {
            var4 = super.field5610;
            var5 = super.field5592;
        } else if (arg0 == 2) {
            var4 = super.field5571;
            var5 = super.field5614;
        } else if (arg0 == 3) {
            var4 = super.field5578;
            var5 = super.field5583;
        } else if (arg0 == 4) {
            var4 = super.field5602;
            var5 = super.field5609;
        } else if (arg0 == 5) {
            var4 = super.field5623;
            var5 = super.field5581;
        } else {
            var5 = var4 = new class584(super.field5577);
        }
        return this.method2363(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public final void method2384(int arg0) {
        if (super.field5639[arg0]) {
            this.method3400(arg0);
        } else {
            short var2 = super.field5651[arg0];
            short var3 = super.field5653[arg0];
            short var4 = super.field5591[arg0];
            this.field8402.field8345 = super.field5621[arg0];
            if (super.field5658 == null) {
                this.field8402.field8347 = 0;
            } else {
                this.field8402.field8347 = super.field5658[arg0] & 255;
            }
            if (super.field5597 != null && super.field5597[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field5663 != null && super.field5663[arg0] != -1) {
                    int var5 = super.field5663[arg0] & 255;
                    var6 = super.field5612[var5];
                    var7 = super.field5615[var5];
                    var8 = super.field5643[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field5589[arg0] == -1) {
                    this.field8402.method3360(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], super.field5601[arg0], super.field5601[arg0], super.field5601[arg0], super.field5645[var6], super.field5645[var7], super.field5645[var8], super.field5657[var6], super.field5657[var7], super.field5657[var8], super.field5594[var6], super.field5594[var7], super.field5594[var8], super.field5597[arg0]);
                } else {
                    this.field8402.method3360(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], super.field5601[arg0], super.field5662[arg0], super.field5589[arg0], super.field5645[var6], super.field5645[var7], super.field5645[var8], super.field5657[var6], super.field5657[var7], super.field5657[var8], super.field5594[var6], super.field5594[var7], super.field5594[var8], super.field5597[arg0]);
                }
            } else if (super.field5589[arg0] == -1) {
                this.field8402.method3358(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], class348.field4972[super.field5601[arg0] & 65535]);
            } else {
                this.field8402.method3365(super.field5616[var2], super.field5616[var3], super.field5616[var4], super.field5565[var2], super.field5565[var3], super.field5565[var4], super.field5601[arg0] & 65535, super.field5662[arg0] & 65535, super.field5589[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lfk;[Lab;)V")
    private class584(class569 arg0, class584[] arg1) {
        super(arg0, arg1);
    }
}
