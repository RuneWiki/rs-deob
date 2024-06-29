import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class635 extends class73 {

    @OriginalMember(owner = "client!nh", name = "sc", descriptor = "Luv;")
    private class304 field9139;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 4)
    public final void method400(int arg0) {
        if (super.field703[arg0]) {
            this.method3648(arg0);
        } else {
            short var2 = super.field704[arg0];
            short var3 = super.field767[arg0];
            short var4 = super.field732[arg0];
            this.field9139.field3885 = super.field776[arg0];
            if (super.field737 == null) {
                this.field9139.field3875 = 0;
            } else {
                this.field9139.field3875 = super.field737[arg0] & 255;
            }
            if (super.field741 != null && super.field741[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field770 != null && super.field770[arg0] != -1) {
                    int var5 = super.field770[arg0] & 255;
                    var6 = super.field714[var5];
                    var7 = super.field711[var5];
                    var8 = super.field788[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field786[arg0] == -1) {
                    this.field9139.method1686(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], super.field785[arg0], super.field785[arg0], super.field785[arg0], super.field692[var6], super.field692[var7], super.field692[var8], super.field736[var6], super.field736[var7], super.field736[var8], super.field773[var6], super.field773[var7], super.field773[var8], super.field741[arg0]);
                } else {
                    this.field9139.method1686(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], super.field785[arg0], super.field726[arg0], super.field786[arg0], super.field692[var6], super.field692[var7], super.field692[var8], super.field736[var6], super.field736[var7], super.field736[var8], super.field773[var6], super.field773[var7], super.field773[var8], super.field741[arg0]);
                }
            } else if (super.field786[arg0] == -1) {
                this.field9139.method1687(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], class404.field5317[super.field785[arg0] & 65535]);
            } else {
                this.field9139.method1685(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], super.field785[arg0] & 65535, super.field726[arg0] & 65535, super.field786[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lhr;)V", line = 59)
    public class635(class446 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 62)
    public final void method402(int arg0) {
        this.field9139.field3884 = (arg0 & 1) == 0;
        this.field9139.field3880 = false;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "()V", line = 66)
    public final void method398() {
        super.field743.field3406 = this.field9139.field3873;
        super.field743.field3405 = this.field9139.field3882;
        super.field743.field3431 = this.field9139.field3878;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 72)
    public final void method418(Thread arg0) {
        super.method418(arg0);
        class442 var2 = (class442) super.field731.method276(arg0);
        this.field9139 = var2.field6097;
    }

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "(I)V", line = 79)
    private final void method3648(int arg0) {
        int var2 = 0;
        int var3 = super.field731.field6149;
        short var4 = super.field704[arg0];
        short var5 = super.field767[arg0];
        short var6 = super.field732[arg0];
        int var7 = super.field773[var4];
        int var8 = super.field773[var5];
        int var9 = super.field773[var6];
        if (super.field737 == null) {
            this.field9139.field3875 = 0;
        } else {
            this.field9139.field3875 = super.field737[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field760[var2] = super.field782[var4];
            super.field796[var2] = super.field771[var4];
            super.field749[var2++] = super.field785[arg0] & 65535;
        } else {
            int var10 = super.field692[var4];
            int var11 = super.field736[var4];
            int var12 = super.field785[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class73.field795[var9 - var7];
                super.field760[var2] = (((super.field692[var6] - var10) * var13 >> 16) + var10) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var6] - var11) * var13 >> 16) + var11) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field786[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class73.field795[var8 - var7];
                super.field760[var2] = (((super.field692[var5] - var10) * var14 >> 16) + var10) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var5] - var11) * var14 >> 16) + var11) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field726[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field760[var2] = super.field782[var5];
            super.field796[var2] = super.field771[var5];
            super.field749[var2++] = super.field726[arg0] & 65535;
        } else {
            int var15 = super.field692[var5];
            int var16 = super.field736[var5];
            int var17 = super.field726[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class73.field795[var7 - var8];
                super.field760[var2] = (((super.field692[var4] - var15) * var18 >> 16) + var15) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var4] - var16) * var18 >> 16) + var16) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field785[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class73.field795[var9 - var8];
                super.field760[var2] = (((super.field692[var6] - var15) * var19 >> 16) + var15) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var6] - var16) * var19 >> 16) + var16) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field786[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field760[var2] = super.field782[var6];
            super.field796[var2] = super.field771[var6];
            super.field749[var2++] = super.field786[arg0] & 65535;
        } else {
            int var20 = super.field692[var6];
            int var21 = super.field736[var6];
            int var22 = super.field786[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class73.field795[var8 - var9];
                super.field760[var2] = (((super.field692[var5] - var20) * var23 >> 16) + var20) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var5] - var21) * var23 >> 16) + var21) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field726[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class73.field795[var7 - var9];
                super.field760[var2] = (((super.field692[var4] - var20) * var24 >> 16) + var20) * super.field731.field6178 / var3 + super.field743.field3405;
                super.field796[var2] = (((super.field736[var4] - var21) * var24 >> 16) + var21) * super.field731.field6189 / var3 + super.field743.field3431;
                super.field749[var2++] = (((super.field785[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field760[0];
        int var26 = super.field760[1];
        int var27 = super.field760[2];
        this.field9139.field3885 = false;
        boolean var10000;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field743.field3406 || var26 > super.field743.field3406 || var27 > super.field743.field3406) {
                this.field9139.field3885 = true;
            }
            if (super.field741 != null && super.field741[arg0] != -1) {
                if (super.field770 != null && super.field770[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field743.field3406 || var26 > super.field743.field3406 || var27 > super.field743.field3406 || super.field760[3] < 0 || super.field760[3] > super.field743.field3406) {
                this.field9139.field3885 = true;
            }
            if (super.field741 != null && super.field741[arg0] != -1) {
                if (super.field770 != null && super.field770[arg0] != -1) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lac;[Lnh;)Lnh;", line = 318)
    public static final class635 method3649(class460 arg0, class635[] arg1) {
        int var2 = 0;
        class635 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class635(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIZ)Lr;", line = 342)
    public final class157 method64(byte arg0, int arg1, boolean arg2) {
        this.method394(Thread.currentThread());
        class73 var4;
        class73 var5;
        if (arg0 == 1) {
            var4 = super.field752;
            var5 = super.field735;
        } else if (arg0 == 2) {
            var4 = super.field748;
            var5 = super.field755;
        } else if (arg0 == 3) {
            var4 = super.field698;
            var5 = super.field746;
        } else if (arg0 == 4) {
            var4 = super.field744;
            var5 = super.field730;
        } else if (arg0 == 5) {
            var4 = super.field697;
            var5 = super.field705;
        } else {
            var5 = var4 = new class635(super.field731);
        }
        return this.method397(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "()V", line = 386)
    public final void method414() {
        this.field9139 = null;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lhr;Lei;IIII)V", line = 389)
    public class635(class446 arg0, class152 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lhr;[Lnh;)V", line = 392)
    private class635(class446 arg0, class635[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 395)
    public final void method407(int arg0) {
        if (!super.field731.field6177) {
            short var2 = super.field704[arg0];
            short var3 = super.field767[arg0];
            short var4 = super.field732[arg0];
            int var5 = super.field695[var2] - super.field731.field6165;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field695[var3] - super.field731.field6165;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field695[var4] - super.field731.field6165;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method400(arg0);
                } else {
                    if (super.field737 == null) {
                        this.field9139.field3875 = 0;
                    } else {
                        this.field9139.field3875 = super.field737[arg0] & 255;
                    }
                    this.field9139.field3885 = super.field776[arg0];
                    if (super.field741 != null && super.field741[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field770 != null && super.field770[arg0] != -1) {
                            int var9 = super.field770[arg0] & 255;
                            var10 = super.field714[var9];
                            var11 = super.field711[var9];
                            var12 = super.field788[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field786[arg0] == -1) {
                            this.field9139.method1690(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], super.field731.field6176, var5, var6, var7, super.field785[arg0], super.field785[arg0], super.field785[arg0], super.field692[var10], super.field692[var11], super.field692[var12], super.field736[var10], super.field736[var11], super.field736[var12], super.field773[var10], super.field773[var11], super.field773[var12], super.field741[arg0]);
                        } else {
                            this.field9139.method1690(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], super.field731.field6176, var5, var6, var7, super.field785[arg0], super.field726[arg0], super.field786[arg0], super.field692[var10], super.field692[var11], super.field692[var12], super.field736[var10], super.field736[var11], super.field736[var12], super.field773[var10], super.field773[var11], super.field773[var12], super.field741[arg0]);
                        }
                    } else if (super.field786[arg0] == -1) {
                        this.field9139.method1688(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], class98.method598(var5 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var6 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var7 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099));
                    } else {
                        this.field9139.method1688(super.field771[var2], super.field771[var3], super.field771[var4], super.field782[var2], super.field782[var3], super.field782[var4], super.field695[var2], super.field695[var3], super.field695[var4], class98.method598(var5 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var6 << 24 | super.field731.field6176, class404.field5317[super.field726[arg0] & 65535], 19099), class98.method598(var7 << 24 | super.field731.field6176, class404.field5317[super.field786[arg0] & 65535], 19099));
                    }
                }
            }
        } else if (!super.field703[arg0]) {
            short var13 = super.field704[arg0];
            short var14 = super.field767[arg0];
            short var15 = super.field732[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field715[var13] > super.field731.field6186) {
                var16 = 255;
            } else if (super.field715[var13] > super.field731.field6160) {
                var16 = (super.field731.field6160 - super.field715[var13]) * 255 / (super.field731.field6160 - super.field731.field6186);
            }
            if (super.field715[var14] > super.field731.field6186) {
                var17 = 255;
            } else if (super.field715[var14] > super.field731.field6160) {
                var17 = (super.field731.field6160 - super.field715[var14]) * 255 / (super.field731.field6160 - super.field731.field6186);
            }
            if (super.field715[var15] > super.field731.field6186) {
                var18 = 255;
            } else if (super.field715[var15] > super.field731.field6160) {
                var18 = (super.field731.field6160 - super.field715[var15]) * 255 / (super.field731.field6160 - super.field731.field6186);
            }
            if (super.field737 == null) {
                this.field9139.field3875 = 0;
            } else {
                this.field9139.field3875 = super.field737[arg0] & 255;
            }
            this.field9139.field3885 = super.field776[arg0];
            if (super.field741 != null && super.field741[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field770 != null && super.field770[arg0] != -1) {
                    int var19 = super.field770[arg0] & 255;
                    var20 = super.field714[var19];
                    var21 = super.field711[var19];
                    var22 = super.field788[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field786[arg0] == -1) {
                    this.field9139.method1690(super.field771[var13], super.field771[var14], super.field771[var15], super.field782[var13], super.field782[var14], super.field782[var15], super.field695[var13], super.field695[var14], super.field695[var15], super.field731.field6176, var16, var17, var18, super.field785[arg0], super.field785[arg0], super.field785[arg0], super.field692[var20], super.field692[var21], super.field692[var22], super.field736[var20], super.field736[var21], super.field736[var22], super.field773[var20], super.field773[var21], super.field773[var22], super.field741[arg0]);
                } else {
                    this.field9139.method1690(super.field771[var13], super.field771[var14], super.field771[var15], super.field782[var13], super.field782[var14], super.field782[var15], super.field695[var13], super.field695[var14], super.field695[var15], super.field731.field6176, var16, var17, var18, super.field785[arg0], super.field726[arg0], super.field786[arg0], super.field692[var20], super.field692[var21], super.field692[var22], super.field736[var20], super.field736[var21], super.field736[var22], super.field773[var20], super.field773[var21], super.field773[var22], super.field741[arg0]);
                }
            } else if (super.field786[arg0] == -1) {
                this.field9139.method1688(super.field771[var13], super.field771[var14], super.field771[var15], super.field782[var13], super.field782[var14], super.field782[var15], super.field695[var13], super.field695[var14], super.field695[var15], class98.method598(var16 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var17 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var18 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099));
            } else {
                this.field9139.method1688(super.field771[var13], super.field771[var14], super.field771[var15], super.field782[var13], super.field782[var14], super.field782[var15], super.field695[var13], super.field695[var14], super.field695[var15], class98.method598(var16 << 24 | super.field731.field6176, class404.field5317[super.field785[arg0] & 65535], 19099), class98.method598(var17 << 24 | super.field731.field6176, class404.field5317[super.field726[arg0] & 65535], 19099), class98.method598(var18 << 24 | super.field731.field6176, class404.field5317[super.field786[arg0] & 65535], 19099));
            }
        }
    }
}
