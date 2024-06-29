import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class607 extends class373 {

    @OriginalMember(owner = "client!dv", name = "jc", descriptor = "Lida;")
    private class134 field8953;

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lfg;)V")
    public class607(class164 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "()V")
    public final void method371() {
        super.field5447.field4100 = this.field8953.field1777;
        super.field5447.field4084 = this.field8953.field1783;
        super.field5447.field4076 = this.field8953.field1782;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lfg;[Ldv;)V")
    private class607(class164 arg0, class607[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(BIZ)Lr;")
    public final class520 method369(byte arg0, int arg1, boolean arg2) {
        this.method2277(Thread.currentThread());
        class373 var4;
        class373 var5;
        if (arg0 == 1) {
            var4 = super.field5455;
            var5 = super.field5462;
        } else if (arg0 == 2) {
            var4 = super.field5464;
            var5 = super.field5397;
        } else if (arg0 == 3) {
            var4 = super.field5450;
            var5 = super.field5494;
        } else if (arg0 == 4) {
            var4 = super.field5480;
            var5 = super.field5434;
        } else if (arg0 == 5) {
            var4 = super.field5476;
            var5 = super.field5422;
        } else {
            var5 = var4 = new class607(super.field5403);
        }
        return this.method2275(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lfg;Lbt;IIII)V")
    public class607(class164 arg0, class114 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lef;[Ldv;)Ldv;")
    public static final class607 method3534(class532 arg0, class607[] arg1) {
        int var2 = 0;
        class607 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class607(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "(I)V")
    public final void method373(int arg0) {
        this.field8953.field1778 = (arg0 & 1) == 0;
        this.field8953.field1771 = false;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method370(int arg0) {
        if (!super.field5403.field2211) {
            short var2 = super.field5398[arg0];
            short var3 = super.field5472[arg0];
            short var4 = super.field5413[arg0];
            int var5 = super.field5500[var2] - super.field5403.field2217;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field5500[var3] - super.field5403.field2217;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field5500[var4] - super.field5403.field2217;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method372(arg0);
                } else {
                    if (super.field5438 == null) {
                        this.field8953.field1779 = 0;
                    } else {
                        this.field8953.field1779 = super.field5438[arg0] & 255;
                    }
                    this.field8953.field1784 = super.field5419[arg0];
                    if (super.field5425 != null && super.field5425[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field5463 != null && super.field5463[arg0] != -1) {
                            int var9 = super.field5463[arg0] & 255;
                            var10 = super.field5458[var9];
                            var11 = super.field5399[var9];
                            var12 = super.field5407[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field5485[arg0] == -1) {
                            this.field8953.method828(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], super.field5403.field2229, var5, var6, var7, super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var10], super.field5474[var11], super.field5474[var12], super.field5499[var10], super.field5499[var11], super.field5499[var12], super.field5409[var10], super.field5409[var11], super.field5409[var12], super.field5425[arg0]);
                        } else {
                            this.field8953.method828(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], super.field5403.field2229, var5, var6, var7, super.field5481[arg0], super.field5446[arg0], super.field5485[arg0], super.field5474[var10], super.field5474[var11], super.field5474[var12], super.field5499[var10], super.field5499[var11], super.field5499[var12], super.field5409[var10], super.field5409[var11], super.field5409[var12], super.field5425[arg0]);
                        }
                    } else if (super.field5485[arg0] == -1) {
                        this.field8953.method820(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], class6.method24(var5 << 24 | super.field5403.field2229, (byte) 96, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var6 << 24 | super.field5403.field2229, (byte) 6, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var7 << 24 | super.field5403.field2229, (byte) 26, class150.field1929[super.field5481[arg0] & 65535]));
                    } else {
                        this.field8953.method820(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], class6.method24(var5 << 24 | super.field5403.field2229, (byte) -117, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var6 << 24 | super.field5403.field2229, (byte) -125, class150.field1929[super.field5446[arg0] & 65535]), class6.method24(var7 << 24 | super.field5403.field2229, (byte) 72, class150.field1929[super.field5485[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field5473[arg0]) {
            short var13 = super.field5398[arg0];
            short var14 = super.field5472[arg0];
            short var15 = super.field5413[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field5430[var13] > super.field5403.field2216) {
                var16 = 255;
            } else if (super.field5430[var13] > super.field5403.field2222) {
                var16 = (super.field5403.field2222 - super.field5430[var13]) * 255 / (super.field5403.field2222 - super.field5403.field2216);
            }
            if (super.field5430[var14] > super.field5403.field2216) {
                var17 = 255;
            } else if (super.field5430[var14] > super.field5403.field2222) {
                var17 = (super.field5403.field2222 - super.field5430[var14]) * 255 / (super.field5403.field2222 - super.field5403.field2216);
            }
            if (super.field5430[var15] > super.field5403.field2216) {
                var18 = 255;
            } else if (super.field5430[var15] > super.field5403.field2222) {
                var18 = (super.field5403.field2222 - super.field5430[var15]) * 255 / (super.field5403.field2222 - super.field5403.field2216);
            }
            if (super.field5438 == null) {
                this.field8953.field1779 = 0;
            } else {
                this.field8953.field1779 = super.field5438[arg0] & 255;
            }
            this.field8953.field1784 = super.field5419[arg0];
            if (super.field5425 != null && super.field5425[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field5463 != null && super.field5463[arg0] != -1) {
                    int var19 = super.field5463[arg0] & 255;
                    var20 = super.field5458[var19];
                    var21 = super.field5399[var19];
                    var22 = super.field5407[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field5485[arg0] == -1) {
                    this.field8953.method828(super.field5418[var13], super.field5418[var14], super.field5418[var15], super.field5478[var13], super.field5478[var14], super.field5478[var15], super.field5403.field2229, var16, var17, var18, super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var20], super.field5474[var21], super.field5474[var22], super.field5499[var20], super.field5499[var21], super.field5499[var22], super.field5409[var20], super.field5409[var21], super.field5409[var22], super.field5425[arg0]);
                } else {
                    this.field8953.method828(super.field5418[var13], super.field5418[var14], super.field5418[var15], super.field5478[var13], super.field5478[var14], super.field5478[var15], super.field5403.field2229, var16, var17, var18, super.field5481[arg0], super.field5446[arg0], super.field5485[arg0], super.field5474[var20], super.field5474[var21], super.field5474[var22], super.field5499[var20], super.field5499[var21], super.field5499[var22], super.field5409[var20], super.field5409[var21], super.field5409[var22], super.field5425[arg0]);
                }
            } else if (super.field5485[arg0] == -1) {
                this.field8953.method820(super.field5418[var13], super.field5418[var14], super.field5418[var15], super.field5478[var13], super.field5478[var14], super.field5478[var15], class6.method24(var16 << 24 | super.field5403.field2229, (byte) -113, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var17 << 24 | super.field5403.field2229, (byte) 66, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var18 << 24 | super.field5403.field2229, (byte) -106, class150.field1929[super.field5481[arg0] & 65535]));
            } else {
                this.field8953.method820(super.field5418[var13], super.field5418[var14], super.field5418[var15], super.field5478[var13], super.field5478[var14], super.field5478[var15], class6.method24(var16 << 24 | super.field5403.field2229, (byte) 18, class150.field1929[super.field5481[arg0] & 65535]), class6.method24(var17 << 24 | super.field5403.field2229, (byte) -119, class150.field1929[super.field5446[arg0] & 65535]), class6.method24(var18 << 24 | super.field5403.field2229, (byte) -115, class150.field1929[super.field5485[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "(I)V")
    private final void method3535(int arg0) {
        int var2 = 0;
        int var3 = super.field5403.field2193;
        short var4 = super.field5398[arg0];
        short var5 = super.field5472[arg0];
        short var6 = super.field5413[arg0];
        int var7 = super.field5409[var4];
        int var8 = super.field5409[var5];
        int var9 = super.field5409[var6];
        if (super.field5438 == null) {
            this.field8953.field1779 = 0;
        } else {
            this.field8953.field1779 = super.field5438[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field5416[var2] = super.field5478[var4];
            super.field5404[var2] = super.field5418[var4];
            super.field5466[var2++] = super.field5481[arg0] & 65535;
        } else {
            int var10 = super.field5474[var4];
            int var11 = super.field5499[var4];
            int var12 = super.field5481[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class373.field5502[var9 - var7];
                super.field5416[var2] = (((super.field5474[var6] - var10) * var13 >> 16) + var10) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var6] - var11) * var13 >> 16) + var11) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5485[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class373.field5502[var8 - var7];
                super.field5416[var2] = (((super.field5474[var5] - var10) * var14 >> 16) + var10) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var5] - var11) * var14 >> 16) + var11) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5446[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field5416[var2] = super.field5478[var5];
            super.field5404[var2] = super.field5418[var5];
            super.field5466[var2++] = super.field5446[arg0] & 65535;
        } else {
            int var15 = super.field5474[var5];
            int var16 = super.field5499[var5];
            int var17 = super.field5446[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class373.field5502[var7 - var8];
                super.field5416[var2] = (((super.field5474[var4] - var15) * var18 >> 16) + var15) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var4] - var16) * var18 >> 16) + var16) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5481[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class373.field5502[var9 - var8];
                super.field5416[var2] = (((super.field5474[var6] - var15) * var19 >> 16) + var15) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var6] - var16) * var19 >> 16) + var16) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5485[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field5416[var2] = super.field5478[var6];
            super.field5404[var2] = super.field5418[var6];
            super.field5466[var2++] = super.field5485[arg0] & 65535;
        } else {
            int var20 = super.field5474[var6];
            int var21 = super.field5499[var6];
            int var22 = super.field5485[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class373.field5502[var8 - var9];
                super.field5416[var2] = (((super.field5474[var5] - var20) * var23 >> 16) + var20) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var5] - var21) * var23 >> 16) + var21) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5446[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class373.field5502[var7 - var9];
                super.field5416[var2] = (((super.field5474[var4] - var20) * var24 >> 16) + var20) * super.field5403.field2219 / var3 + super.field5447.field4084;
                super.field5404[var2] = (((super.field5499[var4] - var21) * var24 >> 16) + var21) * super.field5403.field2199 / var3 + super.field5447.field4076;
                super.field5466[var2++] = (((super.field5481[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field5416[0];
        int var26 = super.field5416[1];
        int var27 = super.field5416[2];
        int var28 = super.field5404[0];
        int var29 = super.field5404[1];
        int var30 = super.field5404[2];
        this.field8953.field1784 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field5447.field4100 || var26 > super.field5447.field4100 || var27 > super.field5447.field4100) {
                this.field8953.field1784 = true;
            }
            if (super.field5425 != null && super.field5425[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field5463 != null && super.field5463[arg0] != -1) {
                    int var31 = super.field5463[arg0] & 255;
                    var32 = super.field5458[var31];
                    var33 = super.field5399[var31];
                    var34 = super.field5407[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field5485[arg0] == -1) {
                    this.field8953.method821(var28, var29, var30, var25, var26, var27, super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var32], super.field5474[var33], super.field5474[var34], super.field5499[var32], super.field5499[var33], super.field5499[var34], super.field5409[var32], super.field5409[var33], super.field5409[var34], super.field5425[arg0]);
                } else {
                    this.field8953.method821(var28, var29, var30, var25, var26, var27, super.field5466[0], super.field5466[1], super.field5466[2], super.field5474[var32], super.field5474[var33], super.field5474[var34], super.field5499[var32], super.field5499[var33], super.field5499[var34], super.field5409[var32], super.field5409[var33], super.field5409[var34], super.field5425[arg0]);
                }
            } else if (super.field5485[arg0] == -1) {
                this.field8953.method829(var28, var29, var30, var25, var26, var27, class150.field1929[super.field5481[arg0] & 65535]);
            } else {
                this.field8953.method824(var28, var29, var30, var25, var26, var27, super.field5466[0], super.field5466[1], super.field5466[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field5447.field4100 || var26 > super.field5447.field4100 || var27 > super.field5447.field4100 || super.field5416[3] < 0 || super.field5416[3] > super.field5447.field4100) {
                this.field8953.field1784 = true;
            }
            if (super.field5425 == null || super.field5425[arg0] == -1) {
                if (super.field5485[arg0] == -1) {
                    int var40 = class150.field1929[super.field5481[arg0] & 65535];
                    this.field8953.method829(var28, var29, var30, var25, var26, var27, var40);
                    this.field8953.method829(var28, var30, super.field5404[3], var25, var27, super.field5416[3], var40);
                    return;
                }
                this.field8953.method824(var28, var29, var30, var25, var26, var27, super.field5466[0], super.field5466[1], super.field5466[2]);
                this.field8953.method824(var28, var30, super.field5404[3], var25, var27, super.field5416[3], super.field5466[0], super.field5466[2], super.field5466[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field5463 != null && super.field5463[arg0] != -1) {
                int var35 = super.field5463[arg0] & 255;
                var36 = super.field5458[var35];
                var37 = super.field5399[var35];
                var38 = super.field5407[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field5425[arg0];
            if (super.field5485[arg0] == -1) {
                this.field8953.method821(var28, var29, var30, var25, var26, var27, super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var36], super.field5474[var37], super.field5474[var38], super.field5499[var36], super.field5499[var37], super.field5499[var38], super.field5409[var36], super.field5409[var37], super.field5409[var38], var39);
                this.field8953.method821(var28, var30, super.field5404[3], var25, var27, super.field5416[3], super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var36], super.field5474[var37], super.field5474[var38], super.field5499[var36], super.field5499[var37], super.field5499[var38], super.field5409[var36], super.field5409[var37], super.field5409[var38], var39);
                return;
            }
            this.field8953.method821(var28, var29, var30, var25, var26, var27, super.field5466[0], super.field5466[1], super.field5466[2], super.field5474[var36], super.field5474[var37], super.field5474[var38], super.field5499[var36], super.field5499[var37], super.field5499[var38], super.field5409[var36], super.field5409[var37], super.field5409[var38], var39);
            this.field8953.method821(var28, var30, super.field5404[3], var25, var27, super.field5416[3], super.field5466[0], super.field5466[2], super.field5466[3], super.field5474[var36], super.field5474[var37], super.field5474[var38], super.field5499[var36], super.field5499[var37], super.field5499[var38], super.field5409[var36], super.field5409[var37], super.field5409[var38], var39);
        }
    }

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "()V")
    public final void method374() {
        this.field8953 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/Thread;)V")
    public final void method368(Thread arg0) {
        super.method368(arg0);
        class157 var2 = (class157) super.field5403.method963(arg0);
        this.field8953 = var2.field2007;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(I)V")
    public final void method372(int arg0) {
        if (super.field5473[arg0]) {
            this.method3535(arg0);
        } else {
            short var2 = super.field5398[arg0];
            short var3 = super.field5472[arg0];
            short var4 = super.field5413[arg0];
            this.field8953.field1784 = super.field5419[arg0];
            if (super.field5438 == null) {
                this.field8953.field1779 = 0;
            } else {
                this.field8953.field1779 = super.field5438[arg0] & 255;
            }
            if (super.field5425 != null && super.field5425[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field5463 != null && super.field5463[arg0] != -1) {
                    int var5 = super.field5463[arg0] & 255;
                    var6 = super.field5458[var5];
                    var7 = super.field5399[var5];
                    var8 = super.field5407[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field5485[arg0] == -1) {
                    this.field8953.method821(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], super.field5481[arg0], super.field5481[arg0], super.field5481[arg0], super.field5474[var6], super.field5474[var7], super.field5474[var8], super.field5499[var6], super.field5499[var7], super.field5499[var8], super.field5409[var6], super.field5409[var7], super.field5409[var8], super.field5425[arg0]);
                } else {
                    this.field8953.method821(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], super.field5481[arg0], super.field5446[arg0], super.field5485[arg0], super.field5474[var6], super.field5474[var7], super.field5474[var8], super.field5499[var6], super.field5499[var7], super.field5499[var8], super.field5409[var6], super.field5409[var7], super.field5409[var8], super.field5425[arg0]);
                }
            } else if (super.field5485[arg0] == -1) {
                this.field8953.method829(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], class150.field1929[super.field5481[arg0] & 65535]);
            } else {
                this.field8953.method824(super.field5418[var2], super.field5418[var3], super.field5418[var4], super.field5478[var2], super.field5478[var3], super.field5478[var4], super.field5481[arg0] & 65535, super.field5446[arg0] & 65535, super.field5485[arg0] & 65535);
            }
        }
    }
}
