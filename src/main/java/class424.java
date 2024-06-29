import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class424 extends class136 {

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public int field6250 = 4;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "I")
    public int field6258 = 1638;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[B")
    private byte[] field6257 = new byte[512];

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public int field6251 = 4;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public int field6263 = 4;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public int field6265 = 0;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Z")
    public boolean field6264 = true;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "Ljava/lang/String;")
    public static String field6253 = null;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "[I")
    public static int[] field6262 = new int[4096];

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!gl", name = "J", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[S")
    private short[] field6252;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "[S")
    private short[] field6254;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([IBI)V")
    public final void method2592(int[] arg0, byte arg1, int arg2) {
        ++field6248;
        int var4 = class290.field4168[arg2] * this.field6263;
        if (arg1 <= 114) {
            this.method269(false);
        }
        if (this.field6250 != 1) {
            short var5 = this.field6252[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field6254[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field6263 * var6 >> 12;
                int var9 = this.field6251 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (var11 >= var8) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = 255 & this.field6257[255 & var10];
                int var14 = class212.field3050[var12];
                int var15 = this.field6257[var11 & 255] & 255;
                for (int var16 = 0; ~class467.field6889 < ~var16; ++var16) {
                    int var36 = class453.field6672[var16] * this.field6251;
                    int var37 = this.method2593(var14, var13, var15, var9, 3, var6 * var36 >> 12, var12);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field6250 > var17; ++var17) {
                short var18 = this.field6252[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field6254[var17] << 12;
                    int var20 = this.field6251 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field6263 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    if (var22 <= var24) {
                        var24 = 0;
                    }
                    int var25 = var21 & 4095;
                    int var26 = class212.field3050[var25];
                    int var27 = 255 & this.field6257[255 & var24];
                    int var28 = this.field6257[255 & var23] & 255;
                    if (this.field6264 && ~(this.field6250 - 1) == ~var17) {
                        for (int var29 = 0; class467.field6889 > var29; ++var29) {
                            int var30 = class453.field6672[var29] * this.field6251;
                            int var31 = this.method2593(var26, var28, var27, var20, 3, var19 * var30 >> 12, var25);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class467.field6889 > var33; ++var33) {
                            int var34 = class453.field6672[var33] * this.field6251;
                            int var35 = this.method2593(var26, var28, var27, var20, 3, var19 * var34 >> 12, var25);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field6254[0] << 12;
            short var39 = this.field6252[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field6263 * var38 >> 12;
            int var42 = this.field6251 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var46 = class212.field3050[var45];
            int var47 = this.field6257[255 & var44] & 255;
            int var48 = this.field6257[255 & var43] & 255;
            if (!this.field6264) {
                for (int var49 = 0; var49 < class467.field6889; ++var49) {
                    int var50 = class453.field6672[var49] * this.field6251;
                    int var51 = this.method2593(var46, var48, var47, var42, 3, var38 * var50 >> 12, var45);
                    arg0[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class467.field6889; ++var52) {
                    int var53 = class453.field6672[var52] * this.field6251;
                    int var54 = this.method2593(var46, var48, var47, var42, 3, var38 * var53 >> 12, var45);
                    int var55 = var39 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)I")
    private final int method2593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6260;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        if (~var9 <= ~arg3) {
            var9 = 0;
        }
        int var12 = var9 & 255;
        int var13 = arg6 - 4096;
        int var14 = var10 + -4096;
        int var15 = class212.field3050[var10];
        int var16 = this.field6257[arg1 + var11] & 3;
        int var17;
        if (~var16 >= -2) {
            var17 = var16 != 0 ? -var10 + arg6 : arg6 + var10;
        } else {
            var17 = ~var16 != -3 ? -arg6 + -var10 : -arg6 + var10;
        }
        int var18 = 3 & this.field6257[arg1 + var12];
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 != -1 ? arg6 - var14 : arg6 + var14;
        } else {
            var19 = var18 == 2 ? -arg6 + var14 : -var14 - arg6;
        }
        int var20 = this.field6257[var11 - -arg2] & 3;
        int var21 = ((var19 - var17) * var15 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = ~var20 == -1 ? var10 + var13 : -var10 + var13;
        } else {
            var22 = ~var20 != -3 ? -var10 + -var13 : -var13 + var10;
        }
        int var23 = this.field6257[arg2 + var12] & arg4;
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? -var13 + var14 : -var13 + -var14;
        } else {
            var24 = var23 != 0 ? -var14 + var13 : var13 + var14;
        }
        int var25 = var22 - -((var24 - var22) * var15 >> 12);
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class424() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBLjava/lang/Object;I)[B")
    public static final byte[] method2594(int arg0, byte arg1, Object arg2, int arg3) {
        ++field6261;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class8.method55(0, arg3, arg0, var4);
        } else if (arg2 instanceof class109) {
            class109 var5 = (class109) arg2;
            return var5.method896(arg3, arg0, 13);
        } else if (arg1 <= 36) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field6263 = arg2.method577(255);
                                }
                            } else {
                                this.field6251 = arg2.method577(arg0 + 251);
                            }
                        } else {
                            this.field6265 = arg2.method577(255);
                        }
                    } else {
                        this.field6251 = this.field6263 = arg2.method577(arg0 ^ 251);
                    }
                } else {
                    this.field6258 = arg2.method599((byte) 1);
                    if (~this.field6258 > -1) {
                        this.field6252 = new short[this.field6250];
                        for (int var5 = 0; ~this.field6250 < ~var5; ++var5) {
                            this.field6252[var5] = (short) arg2.method599((byte) 1);
                        }
                    }
                }
            } else {
                this.field6250 = arg2.method577(255);
            }
        } else {
            this.field6264 = ~arg2.method577(255) == -2;
        }
        if (arg0 != 4) {
            this.method2593(-27, -50, -68, 25, -51, 5, -102);
        }
        ++field6256;
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    private final void method2595(int arg0) {
        if (this.field6258 > 0) {
            this.field6252 = new short[this.field6250];
            this.field6254 = new short[this.field6250];
            for (int var2 = 0; ~var2 > ~this.field6250; ++var2) {
                this.field6252[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6258 / 4096.0F), (double) var2)));
                this.field6254[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field6252 != null && this.field6252.length == this.field6250) {
            this.field6254 = new short[this.field6250];
            for (int var3 = 0; ~this.field6250 < ~var3; ++var3) {
                this.field6254[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field6249;
        if (arg0 >= -124) {
            this.field6264 = true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public final void method269(boolean arg0) {
        this.field6257 = class262.method1678(61, this.field6265);
        ++field6255;
        this.method2595(-127);
        if (!arg0) {
            for (int var2 = this.field6250 + -1; var2 >= 1; --var2) {
                short var3 = this.field6252[var2];
                if (~var3 < -9) {
                    return;
                }
                if (var3 < -8) {
                    return;
                }
                --this.field6250;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
    public static void method2596(byte arg0) {
        field6262 = null;
        if (arg0 == 26) {
            field6253 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
    public static final void method2597(byte arg0) {
        if (arg0 < -32) {
            if (class419.field6188 != 3) {
                class77.field1046 = -1;
            }
            ++field6259;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field6266;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        if (super.field1957.field7031) {
            this.method2592(var3, (byte) 124, arg1);
        }
        int var4 = -80 / ((arg0 - 67) / 50);
        return var3;
    }
}
