import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class544 extends class636 {

    @OriginalMember(owner = "client!et", name = "pc", descriptor = "Lbd;")
    private class56 field7382;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IZZ)V")
    private final void method2995(int arg0, boolean arg1, boolean arg2) {
        if (super.field8998[arg0] != -2) {
            short var4 = super.field9013[arg0];
            short var5 = super.field8985[arg0];
            short var6 = super.field9005[arg0];
            int var7 = super.field8961[var4];
            int var8 = super.field8961[var5];
            int var9 = super.field8961[var6];
            if (!arg1 || var7 != -5000 && var8 != -5000 && var9 != -5000) {
                if (super.field8962[arg0] != -1 || (super.field9024[var6] - super.field9024[var5]) * (var7 - var8) - (super.field9024[var4] - super.field9024[var5]) * (var9 - var8) > 0) {
                    if (var7 >= 0 && var8 >= 0 && var9 >= 0 && var7 <= super.field9037.field498 && var8 <= super.field9037.field498 && var9 <= super.field9037.field498) {
                        super.field8996[arg0] = false;
                    } else {
                        super.field8996[arg0] = true;
                    }
                    if (arg2) {
                        int var28 = super.field8962[arg0];
                        if (var28 == -1 || !super.field8973[var28].field8518) {
                            this.method2998(arg0);
                        }
                        return;
                    }
                    int var29 = super.field8962[arg0];
                    if (var29 != -1) {
                        class614 var30 = super.field8973[var29];
                        class686 var31 = super.field8979[var29];
                        if (!var30.field8518) {
                            this.method2997(arg0);
                        }
                        super.field8939.method391(var31.field9662, var31.field9659, var31.field9655, var31.field9656, var31.field9652, var31.field9661, var30.field8509 & 65535, var31.field9658, var30.field8519, var30.field8517);
                        return;
                    }
                    this.method2997(arg0);
                }
            } else {
                int var10 = super.field8984[var4];
                int var11 = super.field8984[var5];
                int var12 = super.field8984[var6];
                int var13 = super.field9021[var4];
                int var14 = super.field9021[var5];
                int var15 = super.field9021[var6];
                int var16 = super.field8971[var4];
                int var17 = super.field8971[var5];
                int var18 = super.field8971[var6];
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
                    this.method2996(arg0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BIZ)Lba;")
    public final class352 method235(byte arg0, int arg1, boolean arg2) {
        this.method3543(Thread.currentThread());
        class636 var4;
        class636 var5;
        if (arg0 == 1) {
            var4 = super.field8989;
            var5 = super.field8942;
        } else if (arg0 == 2) {
            var4 = super.field9019;
            var5 = super.field8954;
        } else if (arg0 == 3) {
            var4 = super.field8987;
            var5 = super.field8955;
        } else if (arg0 == 4) {
            var4 = super.field8946;
            var5 = super.field8953;
        } else if (arg0 == 5) {
            var4 = super.field8959;
            var5 = super.field9020;
        } else {
            var5 = var4 = new class544(super.field8939);
        }
        return this.method3539(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
    private final void method2996(int arg0) {
        int var2 = 0;
        int var3 = super.field8939.field1452;
        short var4 = super.field9013[arg0];
        short var5 = super.field8985[arg0];
        short var6 = super.field9005[arg0];
        int var7 = super.field8971[var4];
        int var8 = super.field8971[var5];
        int var9 = super.field8971[var6];
        if (super.field8997 == null) {
            this.field7382.field801 = 0;
        } else {
            this.field7382.field801 = super.field8997[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field9022[var2] = super.field8961[var4];
            super.field9007[var2] = super.field9024[var4];
            super.field8981[var2] = super.field8949[var4];
            super.field8995[var2++] = super.field8957[arg0] & 65535;
        } else {
            int var10 = super.field8984[var4];
            int var11 = super.field9021[var4];
            int var12 = super.field8957[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class636.field9045[var9 - var7];
                super.field9022[var2] = (((super.field8984[var6] - var10) * var13 >> 16) + var10) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var6] - var11) * var13 >> 16) + var11) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8998[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class636.field9045[var8 - var7];
                super.field9022[var2] = (((super.field8984[var5] - var10) * var14 >> 16) + var10) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var5] - var11) * var14 >> 16) + var11) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8977[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field9022[var2] = super.field8961[var5];
            super.field9007[var2] = super.field9024[var5];
            super.field8981[var2] = super.field8949[var5];
            super.field8995[var2++] = super.field8977[arg0] & 65535;
        } else {
            int var15 = super.field8984[var5];
            int var16 = super.field9021[var5];
            int var17 = super.field8977[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class636.field9045[var7 - var8];
                super.field9022[var2] = (((super.field8984[var4] - var15) * var18 >> 16) + var15) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var4] - var16) * var18 >> 16) + var16) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8957[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class636.field9045[var9 - var8];
                super.field9022[var2] = (((super.field8984[var6] - var15) * var19 >> 16) + var15) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var6] - var16) * var19 >> 16) + var16) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8998[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field9022[var2] = super.field8961[var6];
            super.field9007[var2] = super.field9024[var6];
            super.field8981[var2] = super.field8949[var6];
            super.field8995[var2++] = super.field8998[arg0] & 65535;
        } else {
            int var20 = super.field8984[var6];
            int var21 = super.field9021[var6];
            int var22 = super.field8998[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class636.field9045[var8 - var9];
                super.field9022[var2] = (((super.field8984[var5] - var20) * var23 >> 16) + var20) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var5] - var21) * var23 >> 16) + var21) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8977[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class636.field9045[var7 - var9];
                super.field9022[var2] = (((super.field8984[var4] - var20) * var24 >> 16) + var20) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var4] - var21) * var24 >> 16) + var21) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8981[var2] = var3;
                super.field8995[var2++] = (((super.field8957[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field9022[0];
        int var26 = super.field9022[1];
        int var27 = super.field9022[2];
        int var28 = super.field9007[0];
        int var29 = super.field9007[1];
        int var30 = super.field9007[2];
        int var31 = super.field8981[0];
        int var32 = super.field8981[1];
        int var33 = super.field8981[2];
        this.field7382.field789 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field9037.field498 || var26 > super.field9037.field498 || var27 > super.field9037.field498) {
                this.field7382.field789 = true;
            }
            if (super.field9027 != null && super.field9027[arg0] != -1) {
                int var35;
                int var36;
                int var37;
                if (super.field8991 != null && super.field8991[arg0] != -1) {
                    int var34 = super.field8991[arg0] & 255;
                    var35 = super.field8990[var34];
                    var36 = super.field8968[var34];
                    var37 = super.field9029[var34];
                } else {
                    var35 = var4;
                    var36 = var5;
                    var37 = var6;
                }
                if (super.field8998[arg0] == -1) {
                    this.field7382.method495(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var35], super.field8984[var36], super.field8984[var37], super.field9021[var35], super.field9021[var36], super.field9021[var37], super.field8971[var35], super.field8971[var36], super.field8971[var37], super.field9027[arg0]);
                } else {
                    this.field7382.method495(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8995[0], super.field8995[1], super.field8995[2], super.field8984[var35], super.field8984[var36], super.field8984[var37], super.field9021[var35], super.field9021[var36], super.field9021[var37], super.field8971[var35], super.field8971[var36], super.field8971[var37], super.field9027[arg0]);
                }
            } else if (super.field8998[arg0] == -1) {
                this.field7382.method483(var28, var29, var30, var25, var26, var27, var31, var32, var33, class145.field2153[super.field8957[arg0] & 65535]);
            } else {
                this.field7382.method494(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8995[0], super.field8995[1], super.field8995[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field9037.field498 || var26 > super.field9037.field498 || var27 > super.field9037.field498 || super.field9022[3] < 0 || super.field9022[3] > super.field9037.field498) {
                this.field7382.field789 = true;
            }
            if (super.field9027 == null || super.field9027[arg0] == -1) {
                if (super.field8998[arg0] == -1) {
                    int var43 = class145.field2153[super.field8957[arg0] & 65535];
                    this.field7382.method483(var28, var29, var30, var25, var26, var27, var31, var32, var33, var43);
                    this.field7382.method483(var28, var30, super.field9007[3], var25, var27, super.field9022[3], var31, var32, super.field8981[3], var43);
                    return;
                }
                this.field7382.method494(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8995[0], super.field8995[1], super.field8995[2]);
                this.field7382.method494(var28, var30, super.field9007[3], var25, var27, super.field9022[3], var31, var32, super.field8981[3], super.field8995[0], super.field8995[2], super.field8995[3]);
                return;
            }
            int var39;
            int var40;
            int var41;
            if (super.field8991 != null && super.field8991[arg0] != -1) {
                int var38 = super.field8991[arg0] & 255;
                var39 = super.field8990[var38];
                var40 = super.field8968[var38];
                var41 = super.field9029[var38];
            } else {
                var39 = var4;
                var40 = var5;
                var41 = var6;
            }
            short var42 = super.field9027[arg0];
            if (super.field8998[arg0] == -1) {
                this.field7382.method495(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var39], super.field8984[var40], super.field8984[var41], super.field9021[var39], super.field9021[var40], super.field9021[var41], super.field8971[var39], super.field8971[var40], super.field8971[var41], var42);
                this.field7382.method495(var28, var30, super.field9007[3], var25, var27, super.field9022[3], var31, var32, super.field8981[3], super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var39], super.field8984[var40], super.field8984[var41], super.field9021[var39], super.field9021[var40], super.field9021[var41], super.field8971[var39], super.field8971[var40], super.field8971[var41], var42);
                return;
            }
            this.field7382.method495(var28, var29, var30, var25, var26, var27, var31, var32, var33, super.field8995[0], super.field8995[1], super.field8995[2], super.field8984[var39], super.field8984[var40], super.field8984[var41], super.field9021[var39], super.field9021[var40], super.field9021[var41], super.field8971[var39], super.field8971[var40], super.field8971[var41], var42);
            this.field7382.method495(var28, var30, super.field9007[3], var25, var27, super.field9022[3], var31, var32, super.field8981[3], super.field8995[0], super.field8995[2], super.field8995[3], super.field8984[var39], super.field8984[var40], super.field8984[var41], super.field9021[var39], super.field9021[var40], super.field9021[var41], super.field8971[var39], super.field8971[var40], super.field8971[var41], var42);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZZIIZI)V")
    public final void method1535(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (super.field8973 != null) {
            int var7 = 0;
            while (var7 < super.field9034) {
                class614 var8 = super.field8973[var7];
                super.field8962[var8.field8512] = var7++;
            }
        }
        for (int var9 = 0; var9 < super.field9039; ++var9) {
            if (super.field8997 == null || super.field8997[var9] == 0) {
                this.method2995(var9, arg0, arg1);
            }
        }
        if (super.field8938) {
            if (super.field9010 == null) {
                for (int var10 = 0; var10 < super.field9039; ++var10) {
                    if (super.field8997 == null || super.field8997[var10] != 0) {
                        this.method2995(var10, arg0, arg1);
                    }
                }
            } else {
                for (int var11 = 0; var11 < 12; ++var11) {
                    for (int var12 = 0; var12 < super.field9039; ++var12) {
                        if ((super.field8997 == null || super.field8997[var12] != 0) && super.field9010[var12] == var11) {
                            this.method2995(var12, arg0, arg1);
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                class429 var14 = super.field9043[var13];
                int var15 = super.field8986[var13];
                if (var15 == 0) {
                    var15 = 1;
                }
                super.field8939.method389(var14, super.field9012[var13], super.field9033[var13], var15, (super.field8939.field1466 * var14.field6028 >> 12) / var15);
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "j", descriptor = "()V")
    public final void method1532() {
        this.field7382 = null;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    private final void method2997(int arg0) {
        short var2 = super.field9013[arg0];
        short var3 = super.field8985[arg0];
        short var4 = super.field9005[arg0];
        this.field7382.field789 = super.field8996[arg0];
        if (super.field8997 == null) {
            this.field7382.field801 = 0;
        } else {
            this.field7382.field801 = super.field8997[arg0] & 255;
        }
        if (super.field9027 != null && super.field9027[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (super.field8991 != null && super.field8991[arg0] != -1) {
                int var5 = super.field8991[arg0] & 255;
                var6 = super.field8990[var5];
                var7 = super.field8968[var5];
                var8 = super.field9029[var5];
            } else {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            }
            if (super.field8998[arg0] == -1) {
                this.field7382.method495(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var6], super.field8984[var7], super.field8984[var8], super.field9021[var6], super.field9021[var7], super.field9021[var8], super.field8971[var6], super.field8971[var7], super.field8971[var8], super.field9027[arg0]);
            } else {
                this.field7382.method495(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var6], super.field8984[var7], super.field8984[var8], super.field9021[var6], super.field9021[var7], super.field9021[var8], super.field8971[var6], super.field8971[var7], super.field8971[var8], super.field9027[arg0]);
            }
        } else if (super.field8998[arg0] == -1) {
            this.field7382.method483(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], class145.field2153[super.field8957[arg0] & 65535]);
        } else {
            this.field7382.method494(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], super.field8957[arg0] & 65535, super.field8977[arg0] & 65535, super.field8998[arg0] & 65535);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lfv;Lhn;IIII)V")
    public class544(class107 arg0, class661 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
    private final void method2998(int arg0) {
        if (!super.field8939.field1467) {
            short var2 = super.field9013[arg0];
            short var3 = super.field8985[arg0];
            short var4 = super.field9005[arg0];
            int var5 = super.field8949[var2] - super.field8939.field1464;
            if (var5 > 255) {
                var5 = 255;
            } else if (var5 < 0) {
                var5 = 0;
            }
            int var6 = super.field8949[var3] - super.field8939.field1464;
            if (var6 > 255) {
                var6 = 255;
            } else if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field8949[var4] - super.field8939.field1464;
            if (var7 > 255) {
                var7 = 255;
            } else if (var7 < 0) {
                var7 = 0;
            }
            int var8 = var5 + var6 + var7;
            if (var8 != 765) {
                if (var8 == 0) {
                    this.method2997(arg0);
                } else {
                    if (super.field8997 == null) {
                        this.field7382.field801 = 0;
                    } else {
                        this.field7382.field801 = super.field8997[arg0] & 255;
                    }
                    this.field7382.field789 = super.field8996[arg0];
                    if (super.field9027 != null && super.field9027[arg0] != -1) {
                        int var10;
                        int var11;
                        int var12;
                        if (super.field8991 != null && super.field8991[arg0] != -1) {
                            int var9 = super.field8991[arg0] & 255;
                            var10 = super.field8990[var9];
                            var11 = super.field8968[var9];
                            var12 = super.field9029[var9];
                        } else {
                            var10 = var2;
                            var11 = var3;
                            var12 = var4;
                        }
                        if (super.field8998[arg0] == -1) {
                            this.field7382.method498(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], super.field8939.field1455, var5, var6, var7, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var10], super.field8984[var11], super.field8984[var12], super.field9021[var10], super.field9021[var11], super.field9021[var12], super.field8971[var10], super.field8971[var11], super.field8971[var12], super.field9027[arg0]);
                        } else {
                            this.field7382.method498(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], super.field8939.field1455, var5, var6, var7, super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var10], super.field8984[var11], super.field8984[var12], super.field9021[var10], super.field9021[var11], super.field9021[var12], super.field8971[var10], super.field8971[var11], super.field8971[var12], super.field9027[arg0]);
                        }
                    } else if (super.field8998[arg0] == -1) {
                        this.field7382.method489(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], class683.method3766(var5 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -120), class683.method3766(var6 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -105), class683.method3766(var7 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -112));
                    } else {
                        this.field7382.method489(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8949[var2], super.field8949[var3], super.field8949[var4], class683.method3766(var5 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -128), class683.method3766(var6 << 24 | super.field8939.field1455, class145.field2153[super.field8977[arg0] & 65535], (byte) -108), class683.method3766(var7 << 24 | super.field8939.field1455, class145.field2153[super.field8998[arg0] & 65535], (byte) -118));
                    }
                }
            }
        } else if (!super.field9041[arg0]) {
            short var13 = super.field9013[arg0];
            short var14 = super.field8985[arg0];
            short var15 = super.field9005[arg0];
            int var16 = 0;
            int var17 = 0;
            int var18 = 0;
            if (super.field9017[var13] > super.field8939.field1472) {
                var16 = 255;
            } else if (super.field9017[var13] > super.field8939.field1454) {
                var16 = (super.field8939.field1454 - super.field9017[var13]) * 255 / (super.field8939.field1454 - super.field8939.field1472);
            }
            if (super.field9017[var14] > super.field8939.field1472) {
                var17 = 255;
            } else if (super.field9017[var14] > super.field8939.field1454) {
                var17 = (super.field8939.field1454 - super.field9017[var14]) * 255 / (super.field8939.field1454 - super.field8939.field1472);
            }
            if (super.field9017[var15] > super.field8939.field1472) {
                var18 = 255;
            } else if (super.field9017[var15] > super.field8939.field1454) {
                var18 = (super.field8939.field1454 - super.field9017[var15]) * 255 / (super.field8939.field1454 - super.field8939.field1472);
            }
            if (super.field8997 == null) {
                this.field7382.field801 = 0;
            } else {
                this.field7382.field801 = super.field8997[arg0] & 255;
            }
            this.field7382.field789 = super.field8996[arg0];
            if (super.field9027 != null && super.field9027[arg0] != -1) {
                int var20;
                int var21;
                int var22;
                if (super.field8991 != null && super.field8991[arg0] != -1) {
                    int var19 = super.field8991[arg0] & 255;
                    var20 = super.field8990[var19];
                    var21 = super.field8968[var19];
                    var22 = super.field9029[var19];
                } else {
                    var20 = var13;
                    var21 = var14;
                    var22 = var15;
                }
                if (super.field8998[arg0] == -1) {
                    this.field7382.method498(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8949[var13], super.field8949[var14], super.field8949[var15], super.field8939.field1455, var16, var17, var18, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var20], super.field8984[var21], super.field8984[var22], super.field9021[var20], super.field9021[var21], super.field9021[var22], super.field8971[var20], super.field8971[var21], super.field8971[var22], super.field9027[arg0]);
                } else {
                    this.field7382.method498(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8949[var13], super.field8949[var14], super.field8949[var15], super.field8939.field1455, var16, var17, var18, super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var20], super.field8984[var21], super.field8984[var22], super.field9021[var20], super.field9021[var21], super.field9021[var22], super.field8971[var20], super.field8971[var21], super.field8971[var22], super.field9027[arg0]);
                }
            } else if (super.field8998[arg0] == -1) {
                this.field7382.method489(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8949[var13], super.field8949[var14], super.field8949[var15], class683.method3766(var16 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -116), class683.method3766(var17 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -116), class683.method3766(var18 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -127));
            } else {
                this.field7382.method489(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8949[var13], super.field8949[var14], super.field8949[var15], class683.method3766(var16 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -121), class683.method3766(var17 << 24 | super.field8939.field1455, class145.field2153[super.field8977[arg0] & 65535], (byte) -117), class683.method3766(var18 << 24 | super.field8939.field1455, class145.field2153[super.field8998[arg0] & 65535], (byte) -107));
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/lang/Thread;)V")
    public final void method1536(Thread arg0) {
        super.method1536(arg0);
        class85 var2 = (class85) super.field8939.method392(arg0);
        this.field7382 = var2.field1175;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lfv;)V")
    public class544(class107 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!et", name = "n", descriptor = "()V")
    public final void method1530() {
        super.field9037.field498 = this.field7382.field787;
        super.field9037.field494 = this.field7382.field793;
        super.field9037.field482 = this.field7382.field794;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method1528(int arg0) {
        this.field7382.field796 = (arg0 & 1) == 0;
        this.field7382.field798 = false;
    }
}
