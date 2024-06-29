import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class541 extends class349 {

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public int field7400 = 4;

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public int field7399 = 1638;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "Z")
    public boolean field7404 = true;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public int field7409 = 4;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[B")
    private byte[] field7410 = new byte[512];

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public int field7408 = 4;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public int field7415 = 0;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field7402 = 0;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "[Lfv;")
    public static class495[] field7413 = new class495[14];

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "Lfca;")
    public static class188 field7416 = null;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field7401;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field7403;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[S")
    private short[] field7398;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "[S")
    private short[] field7407;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V", line = 11)
    public final void method3047(int[] arg0, int arg1, int arg2) {
        ++field7406;
        int var4 = class54.field709[arg1] * this.field7408;
        if (arg2 != 4095) {
            this.method3049(81);
        }
        if (~this.field7400 == -2) {
            int var5 = this.field7398[0] << 12;
            short var6 = this.field7407[0];
            int var7 = this.field7408 * var5 >> 12;
            int var8 = this.field7409 * var5 >> 12;
            int var9 = var4 * var5 >> 12;
            int var10 = var9 >> 12;
            int var11 = var10 + 1;
            if (var11 >= var7) {
                var11 = 0;
            }
            int var12 = var9 & 4095;
            int var13 = 255 & this.field7410[var10 & 255];
            int var14 = this.field7410[255 & var11] & 255;
            int var15 = class121.field1565[var12];
            if (this.field7404) {
                for (int var16 = 0; class39.field497 > var16; ++var16) {
                    int var17 = class29.field283[var16] * this.field7409;
                    int var18 = this.method3050(50, var14, var15, var8, var13, var5 * var17 >> 12, var12);
                    int var19 = var6 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; var20 < class39.field497; ++var20) {
                    int var21 = class29.field283[var20] * this.field7409;
                    int var22 = this.method3050(-80, var14, var15, var8, var13, var5 * var21 >> 12, var12);
                    arg0[var20] = var6 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field7407[0];
            if (var23 > 8 || ~var23 > 7) {
                int var24 = this.field7398[0] << 12;
                int var25 = this.field7409 * var24 >> 12;
                int var26 = this.field7408 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = var27 & 4095;
                if (var29 >= var26) {
                    var29 = 0;
                }
                int var31 = class121.field1565[var30];
                int var32 = 255 & this.field7410[255 & var28];
                int var33 = this.field7410[var29 & 255] & 255;
                for (int var34 = 0; class39.field497 > var34; ++var34) {
                    int var54 = class29.field283[var34] * this.field7409;
                    int var55 = this.method3050(arg2 + -4077, var33, var31, var25, var32, var24 * var54 >> 12, var30);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field7400; ++var35) {
                short var36 = this.field7407[var35];
                if (~var36 < -9 || ~var36 > 7) {
                    int var37 = this.field7398[var35] << 12;
                    int var38 = this.field7408 * var37 >> 12;
                    int var39 = this.field7409 * var37 >> 12;
                    int var40 = var4 * var37 >> 12;
                    int var41 = var40 >> 12;
                    int var42 = var41 + 1;
                    int var43 = var40 & 4095;
                    if (~var42 <= ~var38) {
                        var42 = 0;
                    }
                    int var44 = class121.field1565[var43];
                    int var45 = this.field7410[var41 & 255] & 255;
                    int var46 = this.field7410[255 & var42] & 255;
                    if (this.field7404 && this.field7400 + -1 == var35) {
                        for (int var47 = 0; class39.field497 > var47; ++var47) {
                            int var48 = class29.field283[var47] * this.field7409;
                            int var49 = this.method3050(arg2 ^ 4064, var46, var44, var39, var45, var37 * var48 >> 12, var43);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; ~class39.field497 < ~var51; ++var51) {
                            int var52 = class29.field283[var51] * this.field7409;
                            int var53 = this.method3050(76, var46, var44, var39, var45, var37 * var52 >> 12, var43);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 338)
    public class541() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(BI)[I", line = 172)
    public final int[] method13(byte arg0, int arg1) {
        ++field7403;
        int var3 = -123 % ((arg0 - 56) / 41);
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            this.method3047(var4, arg1, 4095);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B[B)[B", line = 194)
    public static final byte[] method3048(byte arg0, byte[] arg1) {
        ++field7411;
        class138 var2 = new class138(arg1);
        int var3 = 76 % ((-21 - arg0) / 48);
        int var4 = var2.method957((byte) -67);
        int var5 = var2.method943(-93);
        if (~var5 > -1 || ~class68.field895 != -1 && class68.field895 < var5) {
            throw new RuntimeException();
        } else if (~var4 == -1) {
            byte[] var6 = new byte[var5];
            var2.method934(8, 0, var5, var6);
            return var6;
        } else {
            int var7 = var2.method943(-121);
            if (~var7 > -1 || class68.field895 != 0 && ~class68.field895 > ~var7) {
                throw new RuntimeException();
            } else {
                byte[] var8 = new byte[var7];
                if (var4 != 1) {
                    class511 var9 = class369.field5312;
                    synchronized (class369.field5312) {
                        class369.field5312.method2891((byte) -118, var2, var8);
                    }
                } else {
                    class655.method3630(var8, var7, arg1, var5, 9);
                }
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V", line = 255)
    public final void method11(byte arg0) {
        this.field7410 = class650.method3610(this.field7415, 84);
        ++field7412;
        if (arg0 < -51) {
            this.method3049(2);
            for (int var2 = this.field7400 + -1; var2 >= 1; --var2) {
                short var3 = this.field7407[var2];
                if (var3 > 8 || var3 < -8) {
                    return;
                }
                --this.field7400;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V", line = 291)
    private final void method3049(int arg0) {
        ++field7414;
        if (~this.field7399 >= -1) {
            if (this.field7407 != null && ~this.field7407.length == ~this.field7400) {
                this.field7398 = new short[this.field7400];
                for (int var2 = 0; var2 < this.field7400; ++var2) {
                    this.field7398[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field7398 = new short[this.field7400];
            this.field7407 = new short[this.field7400];
            for (int var3 = 0; ~this.field7400 < ~var3; ++var3) {
                this.field7407[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field7399 / 4096.0F), (double) var3)));
                this.field7398[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 2) {
            method3048((byte) 3, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILdga;)V", line = 341)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg0 != 4095) {
            method3048((byte) 114, (byte[]) null);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field7408 = arg2.method957((byte) -85);
                                }
                            } else {
                                this.field7409 = arg2.method957((byte) -119);
                            }
                        } else {
                            this.field7415 = arg2.method957((byte) -100);
                        }
                    } else {
                        this.field7409 = this.field7408 = arg2.method957((byte) -63);
                    }
                } else {
                    this.field7399 = arg2.method924(2);
                    if (~this.field7399 > -1) {
                        this.field7407 = new short[this.field7400];
                        for (int var5 = 0; this.field7400 > var5; ++var5) {
                            this.field7407[var5] = (short) arg2.method924(2);
                        }
                    }
                }
            } else {
                this.field7400 = arg2.method957((byte) -101);
            }
        } else {
            this.field7404 = arg2.method957((byte) -91) == 1;
        }
        ++field7401;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIII)I", line = 440)
    private final int method3050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7405;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        if (arg3 <= var9) {
            var9 = 0;
        }
        int var12 = arg6 + -4096;
        int var13 = var10 + -4096;
        int var14 = var9 & 255;
        int var15 = this.field7410[arg4 + var11] & 3;
        int var16 = 1 % ((arg0 - -23) / 35);
        int var17 = class121.field1565[var10];
        int var18;
        if (~var15 >= -2) {
            var18 = ~var15 == -1 ? arg6 + var10 : arg6 - var10;
        } else {
            var18 = ~var15 == -3 ? var10 - arg6 : -arg6 + -var10;
        }
        int var19 = 3 & this.field7410[arg4 + var14];
        int var20;
        if (var19 > 1) {
            var20 = ~var19 == -3 ? -arg6 + var13 : -var13 - arg6;
        } else {
            var20 = var19 == 0 ? arg6 + var13 : -var13 + arg6;
        }
        int var21 = ((-var18 + var20) * var17 >> 12) + var18;
        int var22 = this.field7410[arg1 + var11] & 3;
        int var23;
        if (var22 <= 1) {
            var23 = ~var22 == -1 ? var10 + var12 : -var10 + var12;
        } else {
            var23 = ~var22 == -3 ? -var12 + var10 : -var10 - var12;
        }
        int var24 = 3 & this.field7410[arg1 + var14];
        int var25;
        if (var24 > 1) {
            var25 = ~var24 == -3 ? -var12 + var13 : -var12 + -var13;
        } else {
            var25 = ~var24 == -1 ? var12 + var13 : var12 - var13;
        }
        int var26 = ((-var23 + var25) * var17 >> 12) + var23;
        return var21 - -((-var21 + var26) * arg2 >> 12);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V", line = 529)
    public static void method3051(byte arg0) {
        if (arg0 >= -79) {
            field7413 = null;
        }
        field7416 = null;
        field7413 = null;
    }
}
