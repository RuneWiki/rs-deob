import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class318 extends class71 {

    @OriginalMember(owner = "client!at", name = "pc", descriptor = "Loo;")
    private class535 field4375;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "()V", line = 3)
    public final void method576() {
        super.field936.field354 = this.field4375.field7948;
        super.field936.field379 = this.field4375.field7954;
        super.field936.field377 = this.field4375.field7961;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Law;[Lat;)V", line = 8)
    private class318(class67 arg0, class318[] arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Law;Lfd;IIII)V", line = 11)
    public class318(class67 arg0, class451 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V", line = 14)
    public final void method563(int arg0) {
        if (super.field944[arg0]) {
            this.method1925(arg0);
        } else {
            short var2 = super.field947[arg0];
            short var3 = super.field889[arg0];
            short var4 = super.field928[arg0];
            this.field4375.field7955 = super.field882[arg0];
            if (super.field933 == null) {
                this.field4375.field7952 = 0;
            } else {
                this.field4375.field7952 = super.field933[arg0] & 255;
            }
            if (super.field907 != null && super.field907[arg0] != -1) {
                int var6;
                int var7;
                int var8;
                if (super.field898 != null && super.field898[arg0] != -1) {
                    int var5 = super.field898[arg0] & 255;
                    var6 = super.field911[var5];
                    var7 = super.field916[var5];
                    var8 = super.field951[var5];
                } else {
                    var6 = var2;
                    var7 = var3;
                    var8 = var4;
                }
                if (super.field971[arg0] == -1) {
                    this.field4375.method3235(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var6], super.field935[var7], super.field935[var8], super.field899[var6], super.field899[var7], super.field899[var8], super.field902[var6], super.field902[var7], super.field902[var8], super.field907[arg0]);
                } else {
                    this.field4375.method3235(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], super.field985[arg0], super.field968[arg0], super.field971[arg0], super.field935[var6], super.field935[var7], super.field935[var8], super.field899[var6], super.field899[var7], super.field899[var8], super.field902[var6], super.field902[var7], super.field902[var8], super.field907[arg0]);
                }
            } else if (super.field971[arg0] == -1) {
                this.field4375.method3244(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], class111.field1583[super.field985[arg0] & 65535]);
            } else {
                this.field4375.method3239(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], super.field985[arg0] & 65535, super.field968[arg0] & 65535, super.field971[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Llc;[Lat;)Lat;", line = 70)
    public static final class318 method1924(class555 arg0, class318[] arg1) {
        int var2 = 0;
        class318 var3 = null;
        for (int var4 = 0; var4 < arg1.length; ++var4) {
            if (arg1[var4] != null) {
                ++var2;
                var3 = arg1[var4];
            }
        }
        if (var2 == 1) {
            return var3;
        } else {
            return new class318(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V", line = 94)
    public final void method570(int arg0) {
        if (!super.field906.field851) {
            short var2 = super.field947[arg0];
            short var3 = super.field889[arg0];
            short var4 = super.field928[arg0];
            int var5 = super.field883[var2] - super.field906.field837;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field883[var3] - super.field906.field837;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field883[var4] - super.field906.field837;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method563(arg0);
                } else {
                    if (super.field933 == null) {
                        this.field4375.field7952 = 0;
                    } else {
                        this.field4375.field7952 = super.field933[arg0] & 255;
                    }
                    this.field4375.field7955 = super.field882[arg0];
                    if (super.field907 != null && super.field907[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field898 != null && super.field898[arg0] != -1) {
                            int var9 = super.field898[arg0] & 255;
                            var10 = super.field911[var9];
                            var11 = super.field916[var9];
                            var12 = super.field951[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field971[arg0] == -1) {
                            this.field4375.method3233(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], super.field906.field854, var5, var6, var7, super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var10], super.field935[var11], super.field935[var12], super.field899[var10], super.field899[var11], super.field899[var12], super.field902[var10], super.field902[var11], super.field902[var12], super.field907[arg0]);
                        } else {
                            this.field4375.method3233(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], super.field906.field854, var5, var6, var7, super.field985[arg0], super.field968[arg0], super.field971[arg0], super.field935[var10], super.field935[var11], super.field935[var12], super.field899[var10], super.field899[var11], super.field899[var12], super.field902[var10], super.field902[var11], super.field902[var12], super.field907[arg0]);
                        }
                    } else if (super.field971[arg0] == -1) {
                        this.field4375.method3236(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], class199.method1338(var5 << 24 | super.field906.field854, (byte) -93, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var6 << 24 | super.field906.field854, (byte) -67, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var7 << 24 | super.field906.field854, (byte) -83, class111.field1583[super.field985[arg0] & 65535]));
                    } else {
                        this.field4375.method3236(super.field961[var2], super.field961[var3], super.field961[var4], super.field931[var2], super.field931[var3], super.field931[var4], class199.method1338(var5 << 24 | super.field906.field854, (byte) -116, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var6 << 24 | super.field906.field854, (byte) -105, class111.field1583[super.field968[arg0] & 65535]), class199.method1338(var7 << 24 | super.field906.field854, (byte) -122, class111.field1583[super.field971[arg0] & 65535]));
                    }
                }
            }
        } else if (!super.field944[arg0]) {
            short var13 = super.field947[arg0];
            short var14 = super.field889[arg0];
            short var15 = super.field928[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field894[var13] > super.field906.field847) {
                var16 = 255;
            } else if (super.field894[var13] > super.field906.field849) {
                var16 = (super.field906.field849 - super.field894[var13]) * 255 / (super.field906.field849 - super.field906.field847);
            }
            if (super.field894[var14] > super.field906.field847) {
                var17 = 255;
            } else if (super.field894[var14] > super.field906.field849) {
                var17 = (super.field906.field849 - super.field894[var14]) * 255 / (super.field906.field849 - super.field906.field847);
            }
            if (super.field894[var15] > super.field906.field847) {
                var18 = 255;
            } else if (super.field894[var15] > super.field906.field849) {
                var18 = (super.field906.field849 - super.field894[var15]) * 255 / (super.field906.field849 - super.field906.field847);
            }
            if (super.field933 == null) {
                this.field4375.field7952 = 0;
            } else {
                this.field4375.field7952 = super.field933[arg0] & 255;
            }
            this.field4375.field7955 = super.field882[arg0];
            if (super.field907 != null && super.field907[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field898 != null && super.field898[arg0] != -1) {
                    int var19 = super.field898[arg0] & 255;
                    var20 = super.field911[var19];
                    var21 = super.field916[var19];
                    var22 = super.field951[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field971[arg0] == -1) {
                    this.field4375.method3233(super.field961[var13], super.field961[var14], super.field961[var15], super.field931[var13], super.field931[var14], super.field931[var15], super.field906.field854, var16, var17, var18, super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var20], super.field935[var21], super.field935[var22], super.field899[var20], super.field899[var21], super.field899[var22], super.field902[var20], super.field902[var21], super.field902[var22], super.field907[arg0]);
                } else {
                    this.field4375.method3233(super.field961[var13], super.field961[var14], super.field961[var15], super.field931[var13], super.field931[var14], super.field931[var15], super.field906.field854, var16, var17, var18, super.field985[arg0], super.field968[arg0], super.field971[arg0], super.field935[var20], super.field935[var21], super.field935[var22], super.field899[var20], super.field899[var21], super.field899[var22], super.field902[var20], super.field902[var21], super.field902[var22], super.field907[arg0]);
                }
            } else if (super.field971[arg0] == -1) {
                this.field4375.method3236(super.field961[var13], super.field961[var14], super.field961[var15], super.field931[var13], super.field931[var14], super.field931[var15], class199.method1338(var16 << 24 | super.field906.field854, (byte) -115, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var17 << 24 | super.field906.field854, (byte) -95, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var18 << 24 | super.field906.field854, (byte) -69, class111.field1583[super.field985[arg0] & 65535]));
            } else {
                this.field4375.method3236(super.field961[var13], super.field961[var14], super.field961[var15], super.field931[var13], super.field931[var14], super.field931[var15], class199.method1338(var16 << 24 | super.field906.field854, (byte) -91, class111.field1583[super.field985[arg0] & 65535]), class199.method1338(var17 << 24 | super.field906.field854, (byte) -87, class111.field1583[super.field968[arg0] & 65535]), class199.method1338(var18 << 24 | super.field906.field854, (byte) -80, class111.field1583[super.field971[arg0] & 65535]));
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(I)V", line = 267)
    private final void method1925(int arg0) {
        int var2 = 0;
        int var3 = super.field906.field845;
        short var4 = super.field947[arg0];
        short var5 = super.field889[arg0];
        short var6 = super.field928[arg0];
        int var7 = super.field902[var4];
        int var8 = super.field902[var5];
        int var9 = super.field902[var6];
        if (super.field933 == null) {
            this.field4375.field7952 = 0;
        } else {
            this.field4375.field7952 = super.field933[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field984[var2] = super.field931[var4];
            super.field957[var2] = super.field961[var4];
            super.field929[var2++] = super.field985[arg0] & 65535;
        } else {
            int var10 = super.field935[var4];
            int var11 = super.field899[var4];
            int var12 = super.field985[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class71.field975[var9 - var7];
                super.field984[var2] = (((super.field935[var6] - var10) * var13 >> 16) + var10) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var6] - var11) * var13 >> 16) + var11) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field971[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class71.field975[var8 - var7];
                super.field984[var2] = (((super.field935[var5] - var10) * var14 >> 16) + var10) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var5] - var11) * var14 >> 16) + var11) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field968[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field984[var2] = super.field931[var5];
            super.field957[var2] = super.field961[var5];
            super.field929[var2++] = super.field968[arg0] & 65535;
        } else {
            int var15 = super.field935[var5];
            int var16 = super.field899[var5];
            int var17 = super.field968[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class71.field975[var7 - var8];
                super.field984[var2] = (((super.field935[var4] - var15) * var18 >> 16) + var15) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var4] - var16) * var18 >> 16) + var16) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field985[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class71.field975[var9 - var8];
                super.field984[var2] = (((super.field935[var6] - var15) * var19 >> 16) + var15) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var6] - var16) * var19 >> 16) + var16) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field971[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field984[var2] = super.field931[var6];
            super.field957[var2] = super.field961[var6];
            super.field929[var2++] = super.field971[arg0] & 65535;
        } else {
            int var20 = super.field935[var6];
            int var21 = super.field899[var6];
            int var22 = super.field971[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class71.field975[var8 - var9];
                super.field984[var2] = (((super.field935[var5] - var20) * var23 >> 16) + var20) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var5] - var21) * var23 >> 16) + var21) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field968[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class71.field975[var7 - var9];
                super.field984[var2] = (((super.field935[var4] - var20) * var24 >> 16) + var20) * super.field906.field843 / var3 + super.field936.field379;
                super.field957[var2] = (((super.field899[var4] - var21) * var24 >> 16) + var21) * super.field906.field825 / var3 + super.field936.field377;
                super.field929[var2++] = (((super.field985[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field984[0];
        int var26 = super.field984[1];
        int var27 = super.field984[2];
        int var28 = super.field957[0];
        int var29 = super.field957[1];
        int var30 = super.field957[2];
        this.field4375.field7955 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field936.field354 || var26 > super.field936.field354 || var27 > super.field936.field354) {
                this.field4375.field7955 = true;
            }
            if (super.field907 != null && super.field907[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field898 != null && super.field898[arg0] != -1) {
                    int var31 = super.field898[arg0] & 255;
                    var32 = super.field911[var31];
                    var33 = super.field916[var31];
                    var34 = super.field951[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field971[arg0] == -1) {
                    this.field4375.method3235(var28, var29, var30, var25, var26, var27, super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var32], super.field935[var33], super.field935[var34], super.field899[var32], super.field899[var33], super.field899[var34], super.field902[var32], super.field902[var33], super.field902[var34], super.field907[arg0]);
                } else {
                    this.field4375.method3235(var28, var29, var30, var25, var26, var27, super.field929[0], super.field929[1], super.field929[2], super.field935[var32], super.field935[var33], super.field935[var34], super.field899[var32], super.field899[var33], super.field899[var34], super.field902[var32], super.field902[var33], super.field902[var34], super.field907[arg0]);
                }
            } else if (super.field971[arg0] == -1) {
                this.field4375.method3244(var28, var29, var30, var25, var26, var27, class111.field1583[super.field985[arg0] & 65535]);
            } else {
                this.field4375.method3239(var28, var29, var30, var25, var26, var27, super.field929[0], super.field929[1], super.field929[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field936.field354 || var26 > super.field936.field354 || var27 > super.field936.field354 || super.field984[3] < 0 || super.field984[3] > super.field936.field354) {
                this.field4375.field7955 = true;
            }
            if (super.field907 == null || super.field907[arg0] == -1) {
                if (super.field971[arg0] == -1) {
                    int var40 = class111.field1583[super.field985[arg0] & 65535];
                    this.field4375.method3244(var28, var29, var30, var25, var26, var27, var40);
                    this.field4375.method3244(var28, var30, super.field957[3], var25, var27, super.field984[3], var40);
                    return;
                }
                this.field4375.method3239(var28, var29, var30, var25, var26, var27, super.field929[0], super.field929[1], super.field929[2]);
                this.field4375.method3239(var28, var30, super.field957[3], var25, var27, super.field984[3], super.field929[0], super.field929[2], super.field929[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field898 != null && super.field898[arg0] != -1) {
                int var35 = super.field898[arg0] & 255;
                var36 = super.field911[var35];
                var37 = super.field916[var35];
                var38 = super.field951[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field907[arg0];
            if (super.field971[arg0] == -1) {
                this.field4375.method3235(var28, var29, var30, var25, var26, var27, super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var36], super.field935[var37], super.field935[var38], super.field899[var36], super.field899[var37], super.field899[var38], super.field902[var36], super.field902[var37], super.field902[var38], var39);
                this.field4375.method3235(var28, var30, super.field957[3], var25, var27, super.field984[3], super.field985[arg0], super.field985[arg0], super.field985[arg0], super.field935[var36], super.field935[var37], super.field935[var38], super.field899[var36], super.field899[var37], super.field899[var38], super.field902[var36], super.field902[var37], super.field902[var38], var39);
                return;
            }
            this.field4375.method3235(var28, var29, var30, var25, var26, var27, super.field929[0], super.field929[1], super.field929[2], super.field935[var36], super.field935[var37], super.field935[var38], super.field899[var36], super.field899[var37], super.field899[var38], super.field902[var36], super.field902[var37], super.field902[var38], var39);
            this.field4375.method3235(var28, var30, super.field957[3], var25, var27, super.field984[3], super.field929[0], super.field929[2], super.field929[3], super.field935[var36], super.field935[var37], super.field935[var38], super.field899[var36], super.field899[var37], super.field899[var38], super.field902[var36], super.field902[var37], super.field902[var38], var39);
        }
    }

    @OriginalMember(owner = "client!at", name = "q", descriptor = "()V", line = 504)
    public final void method569() {
        this.field4375 = null;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Law;)V", line = 507)
    public class318(class67 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 510)
    public final void method551(int arg0) {
        this.field4375.field7951 = (arg0 & 1) == 0;
        this.field4375.field7950 = false;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BIZ)Lr;", line = 514)
    public final class159 method94(byte arg0, int arg1, boolean arg2) {
        this.method567(Thread.currentThread());
        class71 var4;
        class71 var5;
        if (arg0 == 1) {
            var4 = super.field973;
            var5 = super.field917;
        } else if (arg0 == 2) {
            var4 = super.field896;
            var5 = super.field893;
        } else if (arg0 == 3) {
            var4 = super.field932;
            var5 = super.field959;
        } else if (arg0 == 4) {
            var4 = super.field895;
            var5 = super.field922;
        } else if (arg0 == 5) {
            var4 = super.field890;
            var5 = super.field908;
        } else {
            var5 = var4 = new class318(super.field906);
        }
        return this.method560(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 559)
    public final void method575(Thread arg0) {
        super.method575(arg0);
        class240 var2 = (class240) super.field906.method505(arg0);
        this.field4375 = var2.field3455;
    }
}
