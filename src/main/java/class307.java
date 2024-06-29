import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class307 extends class24 {

    @OriginalMember(owner = "client!bc", name = "pc", descriptor = "Lft;")
    private class4 field4164;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Let;)V")
    public class307(class511 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "()V")
    public final void method274() {
        super.field425.field5584 = this.field4164.field55;
        super.field425.field5579 = this.field4164.field49;
        super.field425.field5589 = this.field4164.field52;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    private final void method1939(int arg0) {
        int var2 = 0;
        int var3 = super.field347.field7153;
        short var4 = super.field350[arg0];
        short var5 = super.field437[arg0];
        short var6 = super.field358[arg0];
        int var7 = super.field356[var4];
        int var8 = super.field356[var5];
        int var9 = super.field356[var6];
        if (super.field353 == null) {
            this.field4164.field58 = 0;
        } else {
            this.field4164.field58 = super.field353[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field401[var2] = super.field394[var4];
            super.field431[var2] = super.field359[var4];
            super.field419[var2++] = super.field370[arg0] & 65535;
        } else {
            int var10 = super.field361[var4];
            int var11 = super.field418[var4];
            int var12 = super.field370[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class24.field450[var9 - var7];
                super.field401[var2] = (((super.field361[var6] - var10) * var13 >> 16) + var10) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var6] - var11) * var13 >> 16) + var11) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field428[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class24.field450[var8 - var7];
                super.field401[var2] = (((super.field361[var5] - var10) * var14 >> 16) + var10) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var5] - var11) * var14 >> 16) + var11) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field400[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field401[var2] = super.field394[var5];
            super.field431[var2] = super.field359[var5];
            super.field419[var2++] = super.field400[arg0] & 65535;
        } else {
            int var15 = super.field361[var5];
            int var16 = super.field418[var5];
            int var17 = super.field400[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class24.field450[var7 - var8];
                super.field401[var2] = (((super.field361[var4] - var15) * var18 >> 16) + var15) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var4] - var16) * var18 >> 16) + var16) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field370[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class24.field450[var9 - var8];
                super.field401[var2] = (((super.field361[var6] - var15) * var19 >> 16) + var15) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var6] - var16) * var19 >> 16) + var16) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field428[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field401[var2] = super.field394[var6];
            super.field431[var2] = super.field359[var6];
            super.field419[var2++] = super.field428[arg0] & 65535;
        } else {
            int var20 = super.field361[var6];
            int var21 = super.field418[var6];
            int var22 = super.field428[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class24.field450[var8 - var9];
                super.field401[var2] = (((super.field361[var5] - var20) * var23 >> 16) + var20) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var5] - var21) * var23 >> 16) + var21) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field400[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class24.field450[var7 - var9];
                super.field401[var2] = (((super.field361[var4] - var20) * var24 >> 16) + var20) * super.field347.field7176 / var3 + super.field425.field5579;
                super.field431[var2] = (((super.field418[var4] - var21) * var24 >> 16) + var21) * super.field347.field7167 / var3 + super.field425.field5589;
                super.field419[var2++] = (((super.field370[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field401[0];
        int var26 = super.field401[1];
        int var27 = super.field401[2];
        this.field4164.field54 = false;
        boolean var10000;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field425.field5584 || var26 > super.field425.field5584 || var27 > super.field425.field5584) {
                this.field4164.field54 = true;
            }
            if (super.field409 != null && super.field409[arg0] != -1) {
                if (super.field451 != null && super.field451[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field425.field5584 || var26 > super.field425.field5584 || var27 > super.field425.field5584 || super.field401[3] < 0 || super.field401[3] > super.field425.field5584) {
                this.field4164.field54 = true;
            }
            if (super.field409 != null && super.field409[arg0] != -1) {
                if (super.field451 != null && super.field451[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method282(Thread arg0) {
        super.method282(arg0);
        class282 var2 = (class282) super.field347.method1372(arg0);
        this.field4164 = var2.field3897;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public final void method273(int arg0) {
        this.field4164.field53 = (arg0 & 1) == 0;
        this.field4164.field50 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lkw;[Lbc;)Lbc;")
    public static final class307 method1940(class208 arg0, class307[] arg1) {
        int var2 = 0;
        class307 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class307(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Let;[Lbc;)V")
    private class307(class511 arg0, class307[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public final void method283(int arg0) {
        if (super.field411[arg0]) {
            this.method1939(arg0);
        } else {
            short var2 = super.field350[arg0];
            short var3 = super.field437[arg0];
            short var4 = super.field358[arg0];
            this.field4164.field54 = super.field422[arg0];
            if (super.field353 == null) {
                this.field4164.field58 = 0;
            } else {
                this.field4164.field58 = super.field353[arg0] & 255;
            }
            if (super.field409 != null && super.field409[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field451 != null && super.field451[arg0] != -1) {
                    int var5 = super.field451[arg0] & 255;
                    var6 = super.field351[var5];
                    var7 = super.field373[var5];
                    var8 = super.field396[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field428[arg0] == -1) {
                    this.field4164.method21(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], super.field370[arg0], super.field370[arg0], super.field370[arg0], super.field361[var6], super.field361[var7], super.field361[var8], super.field418[var6], super.field418[var7], super.field418[var8], super.field356[var6], super.field356[var7], super.field356[var8], super.field409[arg0]);
                } else {
                    this.field4164.method21(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], super.field370[arg0], super.field400[arg0], super.field428[arg0], super.field361[var6], super.field361[var7], super.field361[var8], super.field418[var6], super.field418[var7], super.field418[var8], super.field356[var6], super.field356[var7], super.field356[var8], super.field409[arg0]);
                }
            } else if (super.field428[arg0] == -1) {
                this.field4164.method24(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], class439.field6243[super.field370[arg0] & 65535]);
            } else {
                this.field4164.method25(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], super.field370[arg0] & 65535, super.field400[arg0] & 65535, super.field428[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIZ)Lr;")
    public final class157 method163(byte arg0, int arg1, boolean arg2) {
        this.method265(Thread.currentThread());
        class24 var4;
        class24 var5;
        if (arg0 == 1) {
            var4 = super.field352;
            var5 = super.field364;
        } else if (arg0 == 2) {
            var4 = super.field380;
            var5 = super.field391;
        } else if (arg0 == 3) {
            var4 = super.field402;
            var5 = super.field448;
        } else if (arg0 == 4) {
            var4 = super.field447;
            var5 = super.field395;
        } else if (arg0 == 5) {
            var4 = super.field449;
            var5 = super.field403;
        } else {
            var5 = var4 = new class307(super.field347);
        }
        return this.method284(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "()V")
    public final void method271() {
        this.field4164 = null;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public final void method288(int arg0) {
        if (!super.field347.field7152) {
            short var2 = super.field350[arg0];
            short var3 = super.field437[arg0];
            short var4 = super.field358[arg0];
            int var5 = super.field388[var2] - super.field347.field7166;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field388[var3] - super.field347.field7166;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field388[var4] - super.field347.field7166;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method283(arg0);
                } else {
                    if (super.field353 == null) {
                        this.field4164.field58 = 0;
                    } else {
                        this.field4164.field58 = super.field353[arg0] & 255;
                    }
                    this.field4164.field54 = super.field422[arg0];
                    if (super.field409 != null && super.field409[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field451 != null && super.field451[arg0] != -1) {
                            int var9 = super.field451[arg0] & 255;
                            var10 = super.field351[var9];
                            var11 = super.field373[var9];
                            var12 = super.field396[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field428[arg0] == -1) {
                            this.field4164.method20(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], super.field347.field7180, var5, var6, var7, super.field370[arg0], super.field370[arg0], super.field370[arg0], super.field361[var10], super.field361[var11], super.field361[var12], super.field418[var10], super.field418[var11], super.field418[var12], super.field356[var10], super.field356[var11], super.field356[var12], super.field409[arg0]);
                        } else {
                            this.field4164.method20(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], super.field347.field7180, var5, var6, var7, super.field370[arg0], super.field400[arg0], super.field428[arg0], super.field361[var10], super.field361[var11], super.field361[var12], super.field418[var10], super.field418[var11], super.field418[var12], super.field356[var10], super.field356[var11], super.field356[var12], super.field409[arg0]);
                        }
                    } else if (super.field428[arg0] == -1) {
                        this.field4164.method26(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], class211.method1383(-113, var5 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-122, var6 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-113, var7 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]));
                    } else {
                        this.field4164.method26(super.field359[var2], super.field359[var3], super.field359[var4], super.field394[var2], super.field394[var3], super.field394[var4], super.field388[var2], super.field388[var3], super.field388[var4], class211.method1383(-125, var5 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-120, var6 << 24 | super.field347.field7180, class439.field6243[super.field400[arg0] & 65535]), class211.method1383(-114, var7 << 24 | super.field347.field7180, class439.field6243[super.field428[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field411[arg0]) {
            short var13 = super.field350[arg0];
            short var14 = super.field437[arg0];
            short var15 = super.field358[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field429[var13] > super.field347.field7175) {
                var16 = 255;
            } else if (super.field429[var13] > super.field347.field7189) {
                var16 = (super.field347.field7189 - super.field429[var13]) * 255 / (super.field347.field7189 - super.field347.field7175);
            }
            if (super.field429[var14] > super.field347.field7175) {
                var17 = 255;
            } else if (super.field429[var14] > super.field347.field7189) {
                var17 = (super.field347.field7189 - super.field429[var14]) * 255 / (super.field347.field7189 - super.field347.field7175);
            }
            if (super.field429[var15] > super.field347.field7175) {
                var18 = 255;
            } else if (super.field429[var15] > super.field347.field7189) {
                var18 = (super.field347.field7189 - super.field429[var15]) * 255 / (super.field347.field7189 - super.field347.field7175);
            }
            if (super.field353 == null) {
                this.field4164.field58 = 0;
            } else {
                this.field4164.field58 = super.field353[arg0] & 255;
            }
            this.field4164.field54 = super.field422[arg0];
            if (super.field409 != null && super.field409[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field451 != null && super.field451[arg0] != -1) {
                    int var19 = super.field451[arg0] & 255;
                    var20 = super.field351[var19];
                    var21 = super.field373[var19];
                    var22 = super.field396[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field428[arg0] == -1) {
                    this.field4164.method20(super.field359[var13], super.field359[var14], super.field359[var15], super.field394[var13], super.field394[var14], super.field394[var15], super.field388[var13], super.field388[var14], super.field388[var15], super.field347.field7180, var16, var17, var18, super.field370[arg0], super.field370[arg0], super.field370[arg0], super.field361[var20], super.field361[var21], super.field361[var22], super.field418[var20], super.field418[var21], super.field418[var22], super.field356[var20], super.field356[var21], super.field356[var22], super.field409[arg0]);
                } else {
                    this.field4164.method20(super.field359[var13], super.field359[var14], super.field359[var15], super.field394[var13], super.field394[var14], super.field394[var15], super.field388[var13], super.field388[var14], super.field388[var15], super.field347.field7180, var16, var17, var18, super.field370[arg0], super.field400[arg0], super.field428[arg0], super.field361[var20], super.field361[var21], super.field361[var22], super.field418[var20], super.field418[var21], super.field418[var22], super.field356[var20], super.field356[var21], super.field356[var22], super.field409[arg0]);
                }
            } else if (super.field428[arg0] == -1) {
                this.field4164.method26(super.field359[var13], super.field359[var14], super.field359[var15], super.field394[var13], super.field394[var14], super.field394[var15], super.field388[var13], super.field388[var14], super.field388[var15], class211.method1383(-118, var16 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-116, var17 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-117, var18 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]));
            } else {
                this.field4164.method26(super.field359[var13], super.field359[var14], super.field359[var15], super.field394[var13], super.field394[var14], super.field394[var15], super.field388[var13], super.field388[var14], super.field388[var15], class211.method1383(-125, var16 << 24 | super.field347.field7180, class439.field6243[super.field370[arg0] & 65535]), class211.method1383(-121, var17 << 24 | super.field347.field7180, class439.field6243[super.field400[arg0] & 65535]), class211.method1383(-112, var18 << 24 | super.field347.field7180, class439.field6243[super.field428[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Let;Lln;IIII)V")
    public class307(class511 arg0, class317 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
