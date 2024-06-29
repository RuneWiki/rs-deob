import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class248 extends class636 {

    @OriginalMember(owner = "client!vea", name = "pc", descriptor = "Ljf;")
    private class197 field3512;

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lfv;Lhn;IIII)V", line = 3)
    public class248(class107 arg0, class661 arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V", line = 7)
    public final void method1528(int arg0) {
        this.field3512.field2914 = (arg0 & 1) == 0;
        this.field3512.field2921 = false;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIZ)Lba;", line = 11)
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
            var5 = var4 = new class248(super.field8939);
        }
        return this.method3539(var5, var4, arg1, arg0 != 0, arg2);
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 55)
    private final void method1529(int arg0) {
        if (super.field9041[arg0]) {
            this.method1531(arg0);
        } else {
            short var2 = super.field9013[arg0];
            short var3 = super.field8985[arg0];
            short var4 = super.field9005[arg0];
            this.field3512.field2908 = super.field8996[arg0];
            if (super.field8997 == null) {
                this.field3512.field2910 = 0;
            } else {
                this.field3512.field2910 = super.field8997[arg0] & 255;
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
                    this.field3512.method1334(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var6], super.field8984[var7], super.field8984[var8], super.field9021[var6], super.field9021[var7], super.field9021[var8], super.field8971[var6], super.field8971[var7], super.field8971[var8], super.field9027[arg0]);
                } else {
                    this.field3512.method1334(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var6], super.field8984[var7], super.field8984[var8], super.field9021[var6], super.field9021[var7], super.field9021[var8], super.field8971[var6], super.field8971[var7], super.field8971[var8], super.field9027[arg0]);
                }
            } else if (super.field8998[arg0] == -1) {
                this.field3512.method1327(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], class145.field2153[super.field8957[arg0] & 65535]);
            } else {
                this.field3512.method1329(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8957[arg0] & 65535, super.field8977[arg0] & 65535, super.field8998[arg0] & 65535);
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "n", descriptor = "()V", line = 110)
    public final void method1530() {
        super.field9037.field498 = this.field3512.field2909;
        super.field9037.field494 = this.field3512.field2911;
        super.field9037.field482 = this.field3512.field2917;
    }

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)V", line = 116)
    private final void method1531(int arg0) {
        int var2 = 0;
        int var3 = super.field8939.field1452;
        short var4 = super.field9013[arg0];
        short var5 = super.field8985[arg0];
        short var6 = super.field9005[arg0];
        int var7 = super.field8971[var4];
        int var8 = super.field8971[var5];
        int var9 = super.field8971[var6];
        if (super.field8997 == null) {
            this.field3512.field2910 = 0;
        } else {
            this.field3512.field2910 = super.field8997[arg0] & 255;
        }
        if (var7 >= var3) {
            super.field9022[var2] = super.field8961[var4];
            super.field9007[var2] = super.field9024[var4];
            super.field8995[var2++] = super.field8957[arg0] & 65535;
        } else {
            int var10 = super.field8984[var4];
            int var11 = super.field9021[var4];
            int var12 = super.field8957[arg0] & 65535;
            if (var9 >= var3) {
                int var13 = (var3 - var7) * class636.field9045[var9 - var7];
                super.field9022[var2] = (((super.field8984[var6] - var10) * var13 >> 16) + var10) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var6] - var11) * var13 >> 16) + var11) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8998[arg0] & 65535) - var12) * var13 >> 16) + var12;
            }
            if (var8 >= var3) {
                int var14 = (var3 - var7) * class636.field9045[var8 - var7];
                super.field9022[var2] = (((super.field8984[var5] - var10) * var14 >> 16) + var10) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var5] - var11) * var14 >> 16) + var11) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8977[arg0] & 65535) - var12) * var14 >> 16) + var12;
            }
        }
        if (var8 >= var3) {
            super.field9022[var2] = super.field8961[var5];
            super.field9007[var2] = super.field9024[var5];
            super.field8995[var2++] = super.field8977[arg0] & 65535;
        } else {
            int var15 = super.field8984[var5];
            int var16 = super.field9021[var5];
            int var17 = super.field8977[arg0] & 65535;
            if (var7 >= var3) {
                int var18 = (var3 - var8) * class636.field9045[var7 - var8];
                super.field9022[var2] = (((super.field8984[var4] - var15) * var18 >> 16) + var15) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var4] - var16) * var18 >> 16) + var16) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8957[arg0] & 65535) - var17) * var18 >> 16) + var17;
            }
            if (var9 >= var3) {
                int var19 = (var3 - var8) * class636.field9045[var9 - var8];
                super.field9022[var2] = (((super.field8984[var6] - var15) * var19 >> 16) + var15) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var6] - var16) * var19 >> 16) + var16) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8998[arg0] & 65535) - var17) * var19 >> 16) + var17;
            }
        }
        if (var9 >= var3) {
            super.field9022[var2] = super.field8961[var6];
            super.field9007[var2] = super.field9024[var6];
            super.field8995[var2++] = super.field8998[arg0] & 65535;
        } else {
            int var20 = super.field8984[var6];
            int var21 = super.field9021[var6];
            int var22 = super.field8998[arg0] & 65535;
            if (var8 >= var3) {
                int var23 = (var3 - var9) * class636.field9045[var8 - var9];
                super.field9022[var2] = (((super.field8984[var5] - var20) * var23 >> 16) + var20) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var5] - var21) * var23 >> 16) + var21) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8977[arg0] & 65535) - var22) * var23 >> 16) + var22;
            }
            if (var7 >= var3) {
                int var24 = (var3 - var9) * class636.field9045[var7 - var9];
                super.field9022[var2] = (((super.field8984[var4] - var20) * var24 >> 16) + var20) * super.field8939.field1466 / var3 + super.field9037.field494;
                super.field9007[var2] = (((super.field9021[var4] - var21) * var24 >> 16) + var21) * super.field8939.field1461 / var3 + super.field9037.field482;
                super.field8995[var2++] = (((super.field8957[arg0] & 65535) - var22) * var24 >> 16) + var22;
            }
        }
        int var25 = super.field9022[0];
        int var26 = super.field9022[1];
        int var27 = super.field9022[2];
        int var28 = super.field9007[0];
        int var29 = super.field9007[1];
        int var30 = super.field9007[2];
        this.field3512.field2908 = false;
        if (var2 == 3) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field9037.field498 || var26 > super.field9037.field498 || var27 > super.field9037.field498) {
                this.field3512.field2908 = true;
            }
            if (super.field9027 != null && super.field9027[arg0] != -1) {
                int var32;
                int var33;
                int var34;
                if (super.field8991 != null && super.field8991[arg0] != -1) {
                    int var31 = super.field8991[arg0] & 255;
                    var32 = super.field8990[var31];
                    var33 = super.field8968[var31];
                    var34 = super.field9029[var31];
                } else {
                    var32 = var4;
                    var33 = var5;
                    var34 = var6;
                }
                if (super.field8998[arg0] == -1) {
                    this.field3512.method1334(var28, var29, var30, var25, var26, var27, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var32], super.field8984[var33], super.field8984[var34], super.field9021[var32], super.field9021[var33], super.field9021[var34], super.field8971[var32], super.field8971[var33], super.field8971[var34], super.field9027[arg0]);
                } else {
                    this.field3512.method1334(var28, var29, var30, var25, var26, var27, super.field8995[0], super.field8995[1], super.field8995[2], super.field8984[var32], super.field8984[var33], super.field8984[var34], super.field9021[var32], super.field9021[var33], super.field9021[var34], super.field8971[var32], super.field8971[var33], super.field8971[var34], super.field9027[arg0]);
                }
            } else if (super.field8998[arg0] == -1) {
                this.field3512.method1327(var28, var29, var30, var25, var26, var27, class145.field2153[super.field8957[arg0] & 65535]);
            } else {
                this.field3512.method1329(var28, var29, var30, var25, var26, var27, super.field8995[0], super.field8995[1], super.field8995[2]);
            }
        }
        if (var2 == 4) {
            if (var25 < 0 || var26 < 0 || var27 < 0 || var25 > super.field9037.field498 || var26 > super.field9037.field498 || var27 > super.field9037.field498 || super.field9022[3] < 0 || super.field9022[3] > super.field9037.field498) {
                this.field3512.field2908 = true;
            }
            if (super.field9027 == null || super.field9027[arg0] == -1) {
                if (super.field8998[arg0] == -1) {
                    int var40 = class145.field2153[super.field8957[arg0] & 65535];
                    this.field3512.method1327(var28, var29, var30, var25, var26, var27, var40);
                    this.field3512.method1327(var28, var30, super.field9007[3], var25, var27, super.field9022[3], var40);
                    return;
                }
                this.field3512.method1329(var28, var29, var30, var25, var26, var27, super.field8995[0], super.field8995[1], super.field8995[2]);
                this.field3512.method1329(var28, var30, super.field9007[3], var25, var27, super.field9022[3], super.field8995[0], super.field8995[2], super.field8995[3]);
                return;
            }
            int var36;
            int var37;
            int var38;
            if (super.field8991 != null && super.field8991[arg0] != -1) {
                int var35 = super.field8991[arg0] & 255;
                var36 = super.field8990[var35];
                var37 = super.field8968[var35];
                var38 = super.field9029[var35];
            } else {
                var36 = var4;
                var37 = var5;
                var38 = var6;
            }
            short var39 = super.field9027[arg0];
            if (super.field8998[arg0] == -1) {
                this.field3512.method1334(var28, var29, var30, var25, var26, var27, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var36], super.field8984[var37], super.field8984[var38], super.field9021[var36], super.field9021[var37], super.field9021[var38], super.field8971[var36], super.field8971[var37], super.field8971[var38], var39);
                this.field3512.method1334(var28, var30, super.field9007[3], var25, var27, super.field9022[3], super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var36], super.field8984[var37], super.field8984[var38], super.field9021[var36], super.field9021[var37], super.field9021[var38], super.field8971[var36], super.field8971[var37], super.field8971[var38], var39);
                return;
            }
            this.field3512.method1334(var28, var29, var30, var25, var26, var27, super.field8995[0], super.field8995[1], super.field8995[2], super.field8984[var36], super.field8984[var37], super.field8984[var38], super.field9021[var36], super.field9021[var37], super.field9021[var38], super.field8971[var36], super.field8971[var37], super.field8971[var38], var39);
            this.field3512.method1334(var28, var30, super.field9007[3], var25, var27, super.field9022[3], super.field8995[0], super.field8995[2], super.field8995[3], super.field8984[var36], super.field8984[var37], super.field8984[var38], super.field9021[var36], super.field9021[var37], super.field9021[var38], super.field8971[var36], super.field8971[var37], super.field8971[var38], var39);
        }
    }

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "()V", line = 353)
    public final void method1532() {
        this.field3512 = null;
    }

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "(I)V", line = 356)
    private final void method1533(int arg0) {
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
                    this.method1529(arg0);
                } else {
                    if (super.field8997 == null) {
                        this.field3512.field2910 = 0;
                    } else {
                        this.field3512.field2910 = super.field8997[arg0] & 255;
                    }
                    this.field3512.field2908 = super.field8996[arg0];
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
                            this.field3512.method1328(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8939.field1455, var5, var6, var7, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var10], super.field8984[var11], super.field8984[var12], super.field9021[var10], super.field9021[var11], super.field9021[var12], super.field8971[var10], super.field8971[var11], super.field8971[var12], super.field9027[arg0]);
                        } else {
                            this.field3512.method1328(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], super.field8939.field1455, var5, var6, var7, super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var10], super.field8984[var11], super.field8984[var12], super.field9021[var10], super.field9021[var11], super.field9021[var12], super.field8971[var10], super.field8971[var11], super.field8971[var12], super.field9027[arg0]);
                        }
                    } else if (super.field8998[arg0] == -1) {
                        this.field3512.method1336(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], class683.method3766(var5 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -120), class683.method3766(var6 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -103), class683.method3766(var7 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -102));
                    } else {
                        this.field3512.method1336(super.field9024[var2], super.field9024[var3], super.field9024[var4], super.field8961[var2], super.field8961[var3], super.field8961[var4], class683.method3766(var5 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -121), class683.method3766(var6 << 24 | super.field8939.field1455, class145.field2153[super.field8977[arg0] & 65535], (byte) -115), class683.method3766(var7 << 24 | super.field8939.field1455, class145.field2153[super.field8998[arg0] & 65535], (byte) -113));
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
                this.field3512.field2910 = 0;
            } else {
                this.field3512.field2910 = super.field8997[arg0] & 255;
            }
            this.field3512.field2908 = super.field8996[arg0];
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
                    this.field3512.method1328(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8939.field1455, var16, var17, var18, super.field8957[arg0], super.field8957[arg0], super.field8957[arg0], super.field8984[var20], super.field8984[var21], super.field8984[var22], super.field9021[var20], super.field9021[var21], super.field9021[var22], super.field8971[var20], super.field8971[var21], super.field8971[var22], super.field9027[arg0]);
                } else {
                    this.field3512.method1328(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], super.field8939.field1455, var16, var17, var18, super.field8957[arg0], super.field8977[arg0], super.field8998[arg0], super.field8984[var20], super.field8984[var21], super.field8984[var22], super.field9021[var20], super.field9021[var21], super.field9021[var22], super.field8971[var20], super.field8971[var21], super.field8971[var22], super.field9027[arg0]);
                }
            } else if (super.field8998[arg0] == -1) {
                this.field3512.method1336(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], class683.method3766(var16 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -120), class683.method3766(var17 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -111), class683.method3766(var18 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -115));
            } else {
                this.field3512.method1336(super.field9024[var13], super.field9024[var14], super.field9024[var15], super.field8961[var13], super.field8961[var14], super.field8961[var15], class683.method3766(var16 << 24 | super.field8939.field1455, class145.field2153[super.field8957[arg0] & 65535], (byte) -102), class683.method3766(var17 << 24 | super.field8939.field1455, class145.field2153[super.field8977[arg0] & 65535], (byte) -112), class683.method3766(var18 << 24 | super.field8939.field1455, class145.field2153[super.field8998[arg0] & 65535], (byte) -101));
            }
        }
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lha;[Lvea;)Lvea;", line = 529)
    public static final class248 method1534(class54 arg0, class248[] arg1) {
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

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZZIIZI)V", line = 554)
    public final void method1535(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7;
        if (arg3 + 2 > 2200) {
            var7 = 1 + class565.method3125(-257, arg3) - class636.field9018;
            arg3 = (arg3 >> var7) + 2;
        } else {
            var7 = 0;
            arg3 += 2;
        }
        for (int var8 = 0; var8 < 2200; ++var8) {
            super.field8952[var8] = 0;
        }
        int var9 = 0;
        if (super.field8973 != null) {
            int var10 = 0;
            while (var10 < super.field9034) {
                class614 var11 = super.field8973[var10];
                super.field8962[var11.field8512] = var10++;
            }
        }
        for (int var12 = 0; var12 < super.field9039; ++var12) {
            if (super.field8998[var12] != -2) {
                short var159 = super.field9013[var12];
                short var160 = super.field8985[var12];
                short var161 = super.field9005[var12];
                int var162 = super.field8961[var159];
                int var163 = super.field8961[var160];
                int var164 = super.field8961[var161];
                if (!arg0 || var162 != -5000 && var163 != -5000 && var164 != -5000) {
                    if (super.field8962[var12] != -1 || (super.field9024[var161] - super.field9024[var160]) * (var162 - var163) - (super.field9024[var159] - super.field9024[var160]) * (var164 - var163) > 0) {
                        super.field9041[var12] = false;
                        if (var162 >= 0 && var163 >= 0 && var164 >= 0 && var162 <= super.field9037.field498 && var163 <= super.field9037.field498 && var164 <= super.field9037.field498) {
                            super.field8996[var12] = false;
                        } else {
                            super.field8996[var12] = true;
                        }
                        int var185 = (super.field8941[var159] + super.field8941[var160] + super.field8941[var161]) / 3 >> var7;
                        if (super.field8952[var185] < 64) {
                            super.field9042[var185][super.field8952[var185]++] = var12;
                        } else {
                            int var186 = super.field8952[var185];
                            if (var186 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field8944[var9] = 0;
                                super.field8952[var185] = var186 = 65 + var9++;
                            }
                            var186 -= 65;
                            super.field9028[var186][super.field8944[var186]++] = var12;
                        }
                    }
                } else {
                    int var165 = super.field8984[var159];
                    int var166 = super.field8984[var160];
                    int var167 = super.field8984[var161];
                    int var168 = super.field9021[var159];
                    int var169 = super.field9021[var160];
                    int var170 = super.field9021[var161];
                    int var171 = super.field8971[var159];
                    int var172 = super.field8971[var160];
                    int var173 = super.field8971[var161];
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
                        super.field9041[var12] = true;
                        int var183 = (super.field8941[var159] + super.field8941[var160] + super.field8941[var161]) / 3 >> var7;
                        if (super.field8952[var183] < 64) {
                            super.field9042[var183][super.field8952[var183]++] = var12;
                        } else {
                            int var184 = super.field8952[var183];
                            if (var184 == 64) {
                                if (var9 == 512) {
                                    continue;
                                }
                                super.field8944[var9] = 0;
                                super.field8952[var183] = var184 = 65 + var9++;
                            }
                            var184 -= 65;
                            super.field9028[var184][super.field8944[var184]++] = var12;
                        }
                    }
                }
            }
        }
        if (arg4) {
            for (int var13 = 0; var13 < arg5; ++var13) {
                int var14 = super.field8986[var13] - arg2 >> var7;
                if (var14 >= 0 && var14 < 2200) {
                    if (super.field8952[var14] < 64) {
                        super.field9042[var14][super.field8952[var14]++] = var13 + 1 << 16;
                    } else {
                        int var15 = super.field8952[var14];
                        if (var15 == 64) {
                            if (var9 == 512) {
                                continue;
                            }
                            super.field8944[var9] = 0;
                            super.field8952[var14] = var15 = 65 + var9++;
                        }
                        var15 -= 65;
                        super.field9028[var15][super.field8944[var15]++] = var13 + 1 << 16;
                    }
                }
            }
        }
        if (super.field9010 == null) {
            if (!arg4 && super.field8973 == null) {
                if (arg1) {
                    for (int var16 = arg3 - 1; var16 >= 0; --var16) {
                        int var17 = super.field8952[var16];
                        if (var17 > 0) {
                            int var18 = var17 > 64 ? 64 : var17;
                            int[] var19 = super.field9042[var16];
                            for (int var20 = 0; var20 < var18; ++var20) {
                                this.method1533(var19[var20]);
                            }
                        }
                        if (var17 > 64) {
                            int var21 = super.field8952[var16] - 64 - 1;
                            int[] var22 = super.field9028[var21];
                            for (int var23 = 0; var23 < super.field8944[var21]; ++var23) {
                                this.method1533(var22[var23]);
                            }
                        }
                    }
                } else {
                    for (int var24 = arg3 - 1; var24 >= 0; --var24) {
                        int var25 = super.field8952[var24];
                        if (var25 > 0) {
                            int var26 = var25 > 64 ? 64 : var25;
                            int[] var27 = super.field9042[var24];
                            for (int var28 = 0; var28 < var26; ++var28) {
                                this.method1529(var27[var28]);
                            }
                        }
                        if (var25 > 64) {
                            int var29 = super.field8952[var24] - 64 - 1;
                            int[] var30 = super.field9028[var29];
                            for (int var31 = 0; var31 < super.field8944[var29]; ++var31) {
                                this.method1529(var30[var31]);
                            }
                        }
                    }
                }
            } else if (arg1) {
                for (int var32 = arg3 - 1; var32 >= 0; --var32) {
                    int var33 = super.field8952[var32];
                    if (var33 > 0) {
                        int var34 = var33 > 64 ? 64 : var33;
                        int[] var35 = super.field9042[var32];
                        for (int var36 = 0; var36 < var34; ++var36) {
                            int var37 = var35[var36];
                            if (var37 < 65536) {
                                int var38 = super.field8962[var37];
                                if (var38 == -1 || !super.field8973[var38].field8518) {
                                    this.method1533(var37);
                                }
                            }
                        }
                    }
                    if (var33 > 64) {
                        int var39 = super.field8952[var32] - 64 - 1;
                        int[] var40 = super.field9028[var39];
                        for (int var41 = 0; var41 < super.field8944[var39]; ++var41) {
                            int var42 = var40[var41];
                            if (var42 < 65536) {
                                int var43 = super.field8962[var42];
                                if (var43 == -1 || !super.field8973[var43].field8518) {
                                    this.method1533(var42);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg3 - 1; var44 >= 0; --var44) {
                    int var45 = super.field8952[var44];
                    if (var45 > 0) {
                        int var46 = var45 > 64 ? 64 : var45;
                        int[] var47 = super.field9042[var44];
                        for (int var48 = 0; var48 < var46; ++var48) {
                            int var49 = var47[var48];
                            if (var49 < 65536) {
                                int var50 = super.field8962[var49];
                                if (var50 != -1) {
                                    class614 var51 = super.field8973[var50];
                                    class686 var52 = super.field8979[var50];
                                    if (!var51.field8518) {
                                        this.method1529(var49);
                                    }
                                    super.field8939.method391(var52.field9662, var52.field9659, var52.field9655, var52.field9656, var52.field9652, var52.field9661, var51.field8509 & 65535, var52.field9658, var51.field8519, var51.field8517);
                                } else {
                                    this.method1529(var47[var48]);
                                }
                            } else {
                                int var53 = (var49 >> 16) - 1;
                                class429 var54 = super.field9043[var53];
                                int var55 = super.field8986[var53];
                                if (var55 == 0) {
                                    var55 = 1;
                                }
                                super.field8939.method389(var54, super.field9012[var53], super.field9033[var53], var55, (super.field8939.field1466 * var54.field6028 >> 12) / var55);
                            }
                        }
                    }
                    if (var45 > 64) {
                        int var56 = super.field8952[var44] - 64 - 1;
                        int[] var57 = super.field9028[var56];
                        for (int var58 = 0; var58 < super.field8944[var56]; ++var58) {
                            int var59 = var57[var58];
                            if (var59 < 65536) {
                                int var60 = super.field8962[var59];
                                if (var60 != -1) {
                                    class614 var61 = super.field8973[var60];
                                    class686 var62 = super.field8979[var60];
                                    if (!var61.field8518) {
                                        this.method1529(var59);
                                    }
                                    super.field8939.method391(var62.field9662, var62.field9659, var62.field9655, var62.field9656, var62.field9652, var62.field9661, var61.field8509 & 65535, var62.field9658, var61.field8519, var61.field8517);
                                } else {
                                    this.method1529(var57[var58]);
                                }
                            } else {
                                int var63 = (var59 >> 16) - 1;
                                class429 var64 = super.field9043[var63];
                                int var65 = super.field8986[var63];
                                if (var65 == 0) {
                                    var65 = 1;
                                }
                                super.field8939.method389(var64, super.field9012[var63], super.field9033[var63], var65, (super.field8939.field1466 * var64.field6028 >> 12) / var65);
                            }
                        }
                    }
                }
            }
        } else {
            for (int var66 = 0; var66 < 12; ++var66) {
                super.field9006[var66] = 0;
                super.field8943[var66] = 0;
            }
            if (arg4) {
                for (int var67 = arg3 - 1; var67 >= 0; --var67) {
                    int var68 = super.field8952[var67];
                    if (var68 > 0) {
                        int var69;
                        if (var68 > 64) {
                            var69 = 64;
                        } else {
                            var69 = var68;
                        }
                        int[] var70 = super.field9042[var67];
                        for (int var71 = 0; var71 < var69; ++var71) {
                            int var72 = var70[var71];
                            if (var72 < 65536) {
                                byte var73 = super.field9010[var72];
                                int var74 = super.field9006[var73]++;
                                super.field9025[var73][var74] = var72;
                                if (var73 < 10) {
                                    super.field8943[var73] += var67;
                                } else if (var73 == 10) {
                                    super.field9003[var74] = var67;
                                } else {
                                    super.field9030[var74] = var67;
                                }
                            } else {
                                byte var75 = super.field9043[(var72 >> 16) - 1].field6026;
                                int var76 = super.field9006[var75]++;
                                super.field9025[var75][var76] = var72;
                                if (var75 < 10) {
                                    super.field8943[var75] += var67;
                                } else if (var75 == 10) {
                                    super.field9003[var76] = var67;
                                } else {
                                    super.field9030[var76] = var67;
                                }
                            }
                        }
                    }
                    if (var68 > 64) {
                        int var77 = super.field8952[var67] - 64 - 1;
                        int[] var78 = super.field9028[var77];
                        for (int var79 = 0; var79 < super.field8944[var77]; ++var79) {
                            int var80 = var78[var79];
                            if (var80 < 65536) {
                                byte var81 = super.field9010[var80];
                                int var82 = super.field9006[var81]++;
                                super.field9025[var81][var82] = var80;
                                if (var81 < 10) {
                                    super.field8943[var81] += var67;
                                } else if (var81 == 10) {
                                    super.field9003[var82] = var67;
                                } else {
                                    super.field9030[var82] = var67;
                                }
                            } else {
                                byte var83 = super.field9043[(var80 >> 16) - 1].field6026;
                                int var84 = super.field9006[var83]++;
                                super.field9025[var83][var84] = var80;
                                if (var83 < 10) {
                                    super.field8943[var83] += var67;
                                } else if (var83 == 10) {
                                    super.field9003[var84] = var67;
                                } else {
                                    super.field9030[var84] = var67;
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var85 = arg3 - 1; var85 >= 0; --var85) {
                    int var146 = super.field8952[var85];
                    if (var146 > 0) {
                        int var147;
                        if (var146 > 64) {
                            var147 = 64;
                        } else {
                            var147 = var146;
                        }
                        int[] var148 = super.field9042[var85];
                        for (int var149 = 0; var149 < var147; ++var149) {
                            int var150 = var148[var149];
                            byte var151 = super.field9010[var150];
                            int var152 = super.field9006[var151]++;
                            super.field9025[var151][var152] = var150;
                            if (var151 < 10) {
                                super.field8943[var151] += var85;
                            } else if (var151 == 10) {
                                super.field9003[var152] = var85;
                            } else {
                                super.field9030[var152] = var85;
                            }
                        }
                    }
                    if (var146 > 64) {
                        int var153 = super.field8952[var85] - 64 - 1;
                        int[] var154 = super.field9028[var153];
                        for (int var155 = 0; var155 < super.field8944[var153]; ++var155) {
                            int var156 = var154[var155];
                            byte var157 = super.field9010[var156];
                            int var158 = super.field9006[var157]++;
                            super.field9025[var157][var158] = var156;
                            if (var157 < 10) {
                                super.field8943[var157] += var85;
                            } else if (var157 == 10) {
                                super.field9003[var158] = var85;
                            } else {
                                super.field9030[var158] = var85;
                            }
                        }
                    }
                }
            }
            int var86 = 0;
            if (super.field9006[1] > 0 || super.field9006[2] > 0) {
                var86 = (super.field8943[1] + super.field8943[2]) / (super.field9006[1] + super.field9006[2]);
            }
            int var87 = 0;
            if (super.field9006[3] > 0 || super.field9006[4] > 0) {
                var87 = (super.field8943[3] + super.field8943[4]) / (super.field9006[3] + super.field9006[4]);
            }
            int var88 = 0;
            if (super.field9006[6] > 0 || super.field9006[8] > 0) {
                var88 = (super.field8943[6] + super.field8943[8]) / (super.field9006[6] + super.field9006[8]);
            }
            int var89 = 0;
            int var90 = super.field9006[10];
            int[] var91 = super.field9025[10];
            int[] var92 = super.field9003;
            if (var89 == var90) {
                var89 = 0;
                var90 = super.field9006[11];
                var91 = super.field9025[11];
                var92 = super.field9030;
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
                            int var105 = super.field8962[var104];
                            if (var105 == -1 || !super.field8973[var105].field8518) {
                                this.method1533(var104);
                            }
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
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
                            int var107 = super.field8962[var106];
                            if (var107 == -1 || !super.field8973[var107].field8518) {
                                this.method1533(var106);
                            }
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
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
                            int var109 = super.field8962[var108];
                            if (var109 == -1 || !super.field8973[var109].field8518) {
                                this.method1533(var108);
                            }
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
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
                            int var111 = super.field8962[var110];
                            if (var111 != -1) {
                                class614 var112 = super.field8973[var111];
                                class686 var113 = super.field8979[var111];
                                if (!var112.field8518) {
                                    this.method1529(var110);
                                }
                                super.field8939.method391(var113.field9662, var113.field9659, var113.field9655, var113.field9656, var113.field9652, var113.field9661, var112.field8509 & 65535, var113.field9658, var112.field8519, var112.field8517);
                            } else {
                                this.method1529(var110);
                            }
                        } else {
                            int var114 = (var110 >> 16) - 1;
                            class429 var115 = super.field9043[var114];
                            int var116 = super.field8986[var114];
                            if (var116 == 0) {
                                var116 = 1;
                            }
                            super.field8939.method389(var115, super.field9012[var114], super.field9033[var114], var116, (super.field8939.field1466 * var115.field6028 >> 12) / var116);
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
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
                            int var118 = super.field8962[var117];
                            if (var118 != -1) {
                                class614 var119 = super.field8973[var118];
                                class686 var120 = super.field8979[var118];
                                if (!var119.field8518) {
                                    this.method1529(var117);
                                }
                                super.field8939.method391(var120.field9662, var120.field9659, var120.field9655, var120.field9656, var120.field9652, var120.field9661, var119.field8509 & 65535, var120.field9658, var119.field8519, var119.field8517);
                            } else {
                                this.method1529(var117);
                            }
                        } else {
                            int var121 = (var117 >> 16) - 1;
                            class429 var122 = super.field9043[var121];
                            int var123 = super.field8986[var121];
                            if (var123 == 0) {
                                var123 = 1;
                            }
                            super.field8939.method389(var122, super.field9012[var121], super.field9033[var121], var123, (super.field8939.field1466 * var122.field6028 >> 12) / var123);
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
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
                            int var125 = super.field8962[var124];
                            if (var125 != -1) {
                                class614 var126 = super.field8973[var125];
                                class686 var127 = super.field8979[var125];
                                if (!var126.field8518) {
                                    this.method1529(var124);
                                }
                                super.field8939.method391(var127.field9662, var127.field9659, var127.field9655, var127.field9656, var127.field9652, var127.field9661, var126.field8509 & 65535, var127.field9658, var126.field8519, var126.field8517);
                            } else {
                                this.method1529(var124);
                            }
                        } else {
                            int var128 = (var124 >> 16) - 1;
                            class429 var129 = super.field9043[var128];
                            int var130 = super.field8986[var128];
                            if (var130 == 0) {
                                var130 = 1;
                            }
                            super.field8939.method389(var129, super.field9012[var128], super.field9033[var128], var130, (super.field8939.field1466 * var129.field6028 >> 12) / var130);
                        }
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var90 = super.field9006[11];
                            var91 = super.field9025[11];
                            var92 = super.field9030;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                }
                int var131 = super.field9006[var94];
                int[] var132 = super.field9025[var94];
                if (!arg4 && super.field8973 == null) {
                    if (arg1) {
                        for (int var133 = 0; var133 < var131; ++var133) {
                            this.method1533(var132[var133]);
                        }
                    } else {
                        for (int var134 = 0; var134 < var131; ++var134) {
                            this.method1529(var132[var134]);
                        }
                    }
                } else if (!arg1) {
                    for (int var138 = 0; var138 < var131; ++var138) {
                        int var139 = var132[var138];
                        if (var139 < 65536) {
                            int var140 = super.field8962[var139];
                            if (var140 != -1) {
                                class614 var141 = super.field8973[var140];
                                class686 var142 = super.field8979[var140];
                                if (!var141.field8518) {
                                    this.method1529(var139);
                                }
                                super.field8939.method391(var142.field9662, var142.field9659, var142.field9655, var142.field9656, var142.field9652, var142.field9661, var141.field8509 & 65535, var142.field9658, var141.field8519, var141.field8517);
                            } else {
                                this.method1529(var139);
                            }
                        } else {
                            int var143 = (var139 >> 16) - 1;
                            class429 var144 = super.field9043[var143];
                            int var145 = super.field8986[var143];
                            if (var145 == 0) {
                                var145 = 1;
                            }
                            super.field8939.method389(var144, super.field9012[var143], super.field9033[var143], var145, (super.field8939.field1466 * var144.field6028 >> 12) / var145);
                        }
                    }
                } else {
                    for (int var135 = 0; var135 < var131; ++var135) {
                        int var136 = var132[var135];
                        if (var136 < 65536) {
                            int var137 = super.field8962[var136];
                            if (var137 == -1 || !super.field8973[var137].field8518) {
                                this.method1533(var136);
                            }
                        }
                    }
                }
            }
            if (!arg4 && super.field8973 == null) {
                if (arg1) {
                    while (var93 != -1000) {
                        this.method1533(var91[var89++]);
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var91 = super.field9025[11];
                            var90 = super.field9006[11];
                            var92 = super.field9030;
                        }
                        if (var89 < var90) {
                            var93 = var92[var89];
                        } else {
                            var93 = -1000;
                        }
                    }
                } else {
                    while (var93 != -1000) {
                        this.method1529(var91[var89++]);
                        if (var89 == var90 && super.field9025[11] != var91) {
                            var89 = 0;
                            var91 = super.field9025[11];
                            var90 = super.field9006[11];
                            var92 = super.field9030;
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
                        int var98 = super.field8962[var97];
                        if (var98 != -1) {
                            class614 var99 = super.field8973[var98];
                            class686 var100 = super.field8979[var98];
                            if (!var99.field8518) {
                                this.method1529(var97);
                            }
                            super.field8939.method391(var100.field9662, var100.field9659, var100.field9655, var100.field9656, var100.field9652, var100.field9661, var99.field8509 & 65535, var100.field9658, var99.field8519, var99.field8517);
                        } else {
                            this.method1529(var97);
                        }
                    } else {
                        int var101 = (var97 >> 16) - 1;
                        class429 var102 = super.field9043[var101];
                        int var103 = super.field8986[var101];
                        if (var103 == 0) {
                            var103 = 1;
                        }
                        super.field8939.method389(var102, super.field9012[var101], super.field9033[var101], var103, (super.field8939.field1466 * var102.field6028 >> 12) / var103);
                    }
                    if (var89 == var90 && super.field9025[11] != var91) {
                        var89 = 0;
                        var91 = super.field9025[11];
                        var90 = super.field9006[11];
                        var92 = super.field9030;
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
                        int var96 = super.field8962[var95];
                        if (var96 == -1 || !super.field8973[var96].field8518) {
                            this.method1533(var95);
                        }
                    }
                    if (var89 == var90 && super.field9025[11] != var91) {
                        var89 = 0;
                        var91 = super.field9025[11];
                        var90 = super.field9006[11];
                        var92 = super.field9030;
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

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lfv;)V", line = 1793)
    public class248(class107 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(Ljava/lang/Thread;)V", line = 1796)
    public final void method1536(Thread arg0) {
        super.method1536(arg0);
        class359 var2 = (class359) super.field8939.method392(arg0);
        this.field3512 = var2.field5139;
        super.field8941 = var2.field5136;
        super.field8952 = var2.field5143;
        super.field9042 = var2.field5131;
        super.field8944 = var2.field5141;
        super.field9028 = var2.field5142;
        super.field9006 = var2.field5137;
        super.field9025 = var2.field5132;
        super.field9003 = var2.field5130;
        super.field9030 = var2.field5134;
        super.field8943 = var2.field5128;
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lfv;[Lvea;)V", line = 1812)
    private class248(class107 arg0, class248[] arg1) {
        super(arg0, arg1);
    }
}
