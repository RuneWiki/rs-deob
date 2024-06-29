import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class519 extends class274 {

    @OriginalMember(owner = "client!iu", name = "rc", descriptor = "Leda;")
    private class518 field7236;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "(I)V")
    public final void method1695(int arg0) {
        if (!super.field3545.field9360) {
            short var2 = super.field3497[arg0];
            short var3 = super.field3501[arg0];
            short var4 = super.field3560[arg0];
            int var5 = super.field3482[var2] - super.field3545.field9400;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field3482[var3] - super.field3545.field9400;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field3482[var4] - super.field3545.field9400;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method1674(arg0);
                } else {
                    if (super.field3516 == null) {
                        this.field7236.field7224 = 0;
                    } else {
                        this.field7236.field7224 = super.field3516[arg0] & 255;
                    }
                    this.field7236.field7232 = super.field3498[arg0];
                    if (super.field3470 != null && super.field3470[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field3562 != null && super.field3562[arg0] != -1) {
                            int var9 = super.field3562[arg0] & 255;
                            var10 = super.field3521[var9];
                            var11 = super.field3557[var9];
                            var12 = super.field3568[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field3502[arg0] == -1) {
                            this.field7236.method2877(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], super.field3545.field9387, var5, var6, var7, super.field3558[arg0], super.field3558[arg0], super.field3558[arg0], super.field3508[var10], super.field3508[var11], super.field3508[var12], super.field3520[var10], super.field3520[var11], super.field3520[var12], super.field3572[var10], super.field3572[var11], super.field3572[var12], super.field3470[arg0]);
                        } else {
                            this.field7236.method2877(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], super.field3545.field9387, var5, var6, var7, super.field3558[arg0], super.field3493[arg0], super.field3502[arg0], super.field3508[var10], super.field3508[var11], super.field3508[var12], super.field3520[var10], super.field3520[var11], super.field3520[var12], super.field3572[var10], super.field3572[var11], super.field3572[var12], super.field3470[arg0]);
                        }
                    } else if (super.field3502[arg0] == -1) {
                        this.field7236.method2891(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], class93.method508(var5 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var6 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var7 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44));
                    } else {
                        this.field7236.method2891(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], class93.method508(var5 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var6 << 24 | super.field3545.field9387, class351.field4940[super.field3493[arg0] & 65535], (byte) -44), class93.method508(var7 << 24 | super.field3545.field9387, class351.field4940[super.field3502[arg0] & 65535], (byte) -44));
                    }
                }
            }
        } else if (!super.field3478[arg0]) {
            short var13 = super.field3497[arg0];
            short var14 = super.field3501[arg0];
            short var15 = super.field3560[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field3531[var13] > super.field3545.field9362) {
                var16 = 255;
            } else if (super.field3531[var13] > super.field3545.field9361) {
                var16 = (super.field3545.field9361 - super.field3531[var13]) * 255 / (super.field3545.field9361 - super.field3545.field9362);
            }
            if (super.field3531[var14] > super.field3545.field9362) {
                var17 = 255;
            } else if (super.field3531[var14] > super.field3545.field9361) {
                var17 = (super.field3545.field9361 - super.field3531[var14]) * 255 / (super.field3545.field9361 - super.field3545.field9362);
            }
            if (super.field3531[var15] > super.field3545.field9362) {
                var18 = 255;
            } else if (super.field3531[var15] > super.field3545.field9361) {
                var18 = (super.field3545.field9361 - super.field3531[var15]) * 255 / (super.field3545.field9361 - super.field3545.field9362);
            }
            if (super.field3516 == null) {
                this.field7236.field7224 = 0;
            } else {
                this.field7236.field7224 = super.field3516[arg0] & 255;
            }
            this.field7236.field7232 = super.field3498[arg0];
            if (super.field3470 != null && super.field3470[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field3562 != null && super.field3562[arg0] != -1) {
                    int var19 = super.field3562[arg0] & 255;
                    var20 = super.field3521[var19];
                    var21 = super.field3557[var19];
                    var22 = super.field3568[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field3502[arg0] == -1) {
                    this.field7236.method2877(super.field3573[var13], super.field3573[var14], super.field3573[var15], super.field3523[var13], super.field3523[var14], super.field3523[var15], super.field3482[var13], super.field3482[var14], super.field3482[var15], super.field3545.field9387, var16, var17, var18, super.field3558[arg0], super.field3558[arg0], super.field3558[arg0], super.field3508[var20], super.field3508[var21], super.field3508[var22], super.field3520[var20], super.field3520[var21], super.field3520[var22], super.field3572[var20], super.field3572[var21], super.field3572[var22], super.field3470[arg0]);
                } else {
                    this.field7236.method2877(super.field3573[var13], super.field3573[var14], super.field3573[var15], super.field3523[var13], super.field3523[var14], super.field3523[var15], super.field3482[var13], super.field3482[var14], super.field3482[var15], super.field3545.field9387, var16, var17, var18, super.field3558[arg0], super.field3493[arg0], super.field3502[arg0], super.field3508[var20], super.field3508[var21], super.field3508[var22], super.field3520[var20], super.field3520[var21], super.field3520[var22], super.field3572[var20], super.field3572[var21], super.field3572[var22], super.field3470[arg0]);
                }
            } else if (super.field3502[arg0] == -1) {
                this.field7236.method2891(super.field3573[var13], super.field3573[var14], super.field3573[var15], super.field3523[var13], super.field3523[var14], super.field3523[var15], super.field3482[var13], super.field3482[var14], super.field3482[var15], class93.method508(var16 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var17 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var18 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44));
            } else {
                this.field7236.method2891(super.field3573[var13], super.field3573[var14], super.field3573[var15], super.field3523[var13], super.field3523[var14], super.field3523[var15], super.field3482[var13], super.field3482[var14], super.field3482[var15], class93.method508(var16 << 24 | super.field3545.field9387, class351.field4940[super.field3558[arg0] & 65535], (byte) -44), class93.method508(var17 << 24 | super.field3545.field9387, class351.field4940[super.field3493[arg0] & 65535], (byte) -44), class93.method508(var18 << 24 | super.field3545.field9387, class351.field4940[super.field3502[arg0] & 65535], (byte) -44));
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/Thread;)V")
    public final void method1690(Thread arg0) {
        super.method1690(arg0);
        class298 var2 = (class298) super.field3545.method199(arg0);
        this.field7236 = var2.field3899;
    }

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)V")
    public final void method1688(int arg0) {
        this.field7236.field7229 = (arg0 & 1) == 0;
        this.field7236.field7221 = false;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lhh;[Liu;)Liu;")
    public static final class519 method2894(class609 arg0, class519[] arg1) {
        int var2 = 0;
        class519 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class519(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "(I)V")
    private final void method2895(int arg0) {
        int var2 = 0;
        int var3 = super.field3545.field9379;
        short var4 = super.field3497[arg0];
        short var5 = super.field3501[arg0];
        short var6 = super.field3560[arg0];
        int var7 = super.field3572[var4];
        int var8 = super.field3572[var5];
        int var9 = super.field3572[var6];
        if (super.field3516 == null) {
            this.field7236.field7224 = 0;
        } else {
            this.field7236.field7224 = super.field3516[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field3569[var2] = super.field3523[var4];
            super.field3519[var2] = super.field3573[var4];
            super.field3507[var2++] = super.field3558[arg0] & 65535;
        } else {
            int var10 = super.field3508[var4];
            int var11 = super.field3520[var4];
            int var12 = super.field3558[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class274.field3571[var9 - var7];
                super.field3569[var2] = (((super.field3508[var6] - var10) * var13 >> 16) + var10) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var6] - var11) * var13 >> 16) + var11) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3502[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class274.field3571[var8 - var7];
                super.field3569[var2] = (((super.field3508[var5] - var10) * var14 >> 16) + var10) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var5] - var11) * var14 >> 16) + var11) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3493[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field3569[var2] = super.field3523[var5];
            super.field3519[var2] = super.field3573[var5];
            super.field3507[var2++] = super.field3493[arg0] & 65535;
        } else {
            int var15 = super.field3508[var5];
            int var16 = super.field3520[var5];
            int var17 = super.field3493[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class274.field3571[var7 - var8];
                super.field3569[var2] = (((super.field3508[var4] - var15) * var18 >> 16) + var15) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var4] - var16) * var18 >> 16) + var16) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3558[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class274.field3571[var9 - var8];
                super.field3569[var2] = (((super.field3508[var6] - var15) * var19 >> 16) + var15) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var6] - var16) * var19 >> 16) + var16) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3502[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field3569[var2] = super.field3523[var6];
            super.field3519[var2] = super.field3573[var6];
            super.field3507[var2++] = super.field3502[arg0] & 65535;
        } else {
            int var20 = super.field3508[var6];
            int var21 = super.field3520[var6];
            int var22 = super.field3502[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class274.field3571[var8 - var9];
                super.field3569[var2] = (((super.field3508[var5] - var20) * var23 >> 16) + var20) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var5] - var21) * var23 >> 16) + var21) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3493[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class274.field3571[var7 - var9];
                super.field3569[var2] = (((super.field3508[var4] - var20) * var24 >> 16) + var20) * super.field3545.field9374 / var3 + super.field3542.field6841;
                super.field3519[var2] = (((super.field3520[var4] - var21) * var24 >> 16) + var21) * super.field3545.field9399 / var3 + super.field3542.field6821;
                super.field3507[var2++] = (((super.field3558[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field3569[0];
        int var26 = super.field3569[1];
        int var27 = super.field3569[2];
        this.field7236.field7232 = false;
        boolean var10000;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field3542.field6810 || var26 > super.field3542.field6810 || var27 > super.field3542.field6810) {
                this.field7236.field7232 = true;
            }
            if (super.field3470 != null && super.field3470[arg0] != -1) {
                if (super.field3562 != null && super.field3562[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field3542.field6810 || var26 > super.field3542.field6810 || var27 > super.field3542.field6810 || super.field3569[3] < 0 || super.field3569[3] > super.field3542.field6810) {
                this.field7236.field7232 = true;
            }
            if (super.field3470 != null && super.field3470[arg0] != -1) {
                if (super.field3562 != null && super.field3562[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "()V")
    public final void method1691() {
        this.field7236 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIZ)Lr;")
    public final class521 method1607(byte arg0, int arg1, boolean arg2) {
        this.method1692(Thread.currentThread());
        class274 var4;
        class274 var5;
        if (arg0 == 1) {
            var4 = super.field3511;
            var5 = super.field3532;
        } else if (arg0 == 2) {
            var4 = super.field3547;
            var5 = super.field3506;
        } else if (arg0 == 3) {
            var4 = super.field3546;
            var5 = super.field3533;
        } else if (arg0 == 4) {
            var4 = super.field3527;
            var5 = super.field3472;
        } else if (arg0 == 5) {
            var4 = super.field3540;
            var5 = super.field3535;
        } else {
            var5 = var4 = new class519(super.field3545);
        }
        return this.method1677(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)V")
    public final void method1674(int arg0) {
        if (super.field3478[arg0]) {
            this.method2895(arg0);
        } else {
            short var2 = super.field3497[arg0];
            short var3 = super.field3501[arg0];
            short var4 = super.field3560[arg0];
            this.field7236.field7232 = super.field3498[arg0];
            if (super.field3516 == null) {
                this.field7236.field7224 = 0;
            } else {
                this.field7236.field7224 = super.field3516[arg0] & 255;
            }
            if (super.field3470 != null && super.field3470[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field3562 != null && super.field3562[arg0] != -1) {
                    int var5 = super.field3562[arg0] & 255;
                    var6 = super.field3521[var5];
                    var7 = super.field3557[var5];
                    var8 = super.field3568[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field3502[arg0] == -1) {
                    this.field7236.method2892(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], super.field3558[arg0], super.field3558[arg0], super.field3558[arg0], super.field3508[var6], super.field3508[var7], super.field3508[var8], super.field3520[var6], super.field3520[var7], super.field3520[var8], super.field3572[var6], super.field3572[var7], super.field3572[var8], super.field3470[arg0]);
                } else {
                    this.field7236.method2892(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], super.field3558[arg0], super.field3493[arg0], super.field3502[arg0], super.field3508[var6], super.field3508[var7], super.field3508[var8], super.field3520[var6], super.field3520[var7], super.field3520[var8], super.field3572[var6], super.field3572[var7], super.field3572[var8], super.field3470[arg0]);
                }
            } else if (super.field3502[arg0] == -1) {
                this.field7236.method2885(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], class351.field4940[super.field3558[arg0] & 65535]);
            } else {
                this.field7236.method2882(super.field3573[var2], super.field3573[var3], super.field3573[var4], super.field3523[var2], super.field3523[var3], super.field3523[var4], super.field3482[var2], super.field3482[var3], super.field3482[var4], super.field3558[arg0] & 65535, super.field3493[arg0] & 65535, super.field3502[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljba;[Liu;)V")
    private class519(class647 arg0, class519[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "()V")
    public final void method1697() {
        super.field3542.field6810 = this.field7236.field7235;
        super.field3542.field6841 = this.field7236.field7222;
        super.field3542.field6821 = this.field7236.field7234;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljba;Lfp;IIII)V")
    public class519(class647 arg0, class528 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Ljba;)V")
    public class519(class647 arg0) {
        super(arg0);
    }
}
