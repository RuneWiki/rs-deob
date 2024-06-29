import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class503 extends class739 {

    @OriginalMember(owner = "client!eaa", name = "O", descriptor = "I")
    public int field7108 = 0;

    @OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
    public int field7102 = 4;

    @OriginalMember(owner = "client!eaa", name = "N", descriptor = "Z")
    public boolean field7107 = true;

    @OriginalMember(owner = "client!eaa", name = "R", descriptor = "I")
    public int field7111 = 4;

    @OriginalMember(owner = "client!eaa", name = "S", descriptor = "[B")
    private byte[] field7112 = new byte[512];

    @OriginalMember(owner = "client!eaa", name = "M", descriptor = "I")
    public int field7106 = 1638;

    @OriginalMember(owner = "client!eaa", name = "K", descriptor = "I")
    public int field7105 = 4;

    @OriginalMember(owner = "client!eaa", name = "J", descriptor = "Lfh;")
    public static class653 field7104 = new class653();

    @OriginalMember(owner = "client!eaa", name = "E", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!eaa", name = "G", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!eaa", name = "I", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!eaa", name = "P", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!eaa", name = "Q", descriptor = "I")
    public static int field7110;

    @OriginalMember(owner = "client!eaa", name = "T", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!eaa", name = "U", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!eaa", name = "F", descriptor = "[S")
    private short[] field7100;

    @OriginalMember(owner = "client!eaa", name = "V", descriptor = "[S")
    private short[] field7115;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field7110;
        if (arg0 != -23347) {
            this.field7115 = null;
        }
        int[] var3 = super.field10311.method2116(arg1, (byte) 105);
        if (super.field10311.field4728) {
            this.method2942(arg0 + 15001, var3, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        ++field7103;
        if (arg2 != -3) {
            this.method2941((byte) 33);
        }
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field7102 = arg0.method2600((byte) -126);
            } else {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field7105 = this.field7111 = arg0.method2600((byte) -128);
                        return;
                    }
                    if (arg1 == 4) {
                        this.field7108 = arg0.method2600((byte) -126);
                        return;
                    }
                    if (arg1 == 5) {
                        this.field7105 = arg0.method2600((byte) -124);
                        return;
                    }
                    if (arg1 == 6) {
                        this.field7111 = arg0.method2600((byte) -127);
                        return;
                    }
                } else {
                    this.field7106 = arg0.method2577(2);
                    if (~this.field7106 > -1) {
                        this.field7100 = new short[this.field7102];
                        for (int var5 = 0; ~var5 > ~this.field7102; ++var5) {
                            this.field7100[var5] = (short) arg0.method2577(2);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field7107 = ~arg0.method2600((byte) -127) == -2;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        this.field7112 = class287.method1710(this.field7108, arg0 ^ -22004);
        if (arg0 != -21773) {
            this.method216(-98);
        }
        ++field7109;
        this.method2941((byte) 119);
        for (int var2 = this.field7102 + -1; var2 >= 1; --var2) {
            short var3 = this.field7100[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field7102;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "([BB)Ljava/lang/String;")
    public static final String method2940(byte[] arg0, byte arg1) {
        ++field7113;
        if (arg1 <= 25) {
            method2940((byte[]) null, (byte) 42);
        }
        return class190.method1277(0, arg0.length, arg0, 37);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V")
    private final void method2941(byte arg0) {
        ++field7114;
        if (arg0 <= 90) {
            this.field7106 = 72;
        }
        if (this.field7106 > 0) {
            this.field7100 = new short[this.field7102];
            this.field7115 = new short[this.field7102];
            for (int var2 = 0; var2 < this.field7102; ++var2) {
                this.field7100[var2] = (short) ((int) (Math.pow((double) ((float) this.field7106 / 4096.0F), (double) var2) * 4096.0D));
                this.field7115[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field7100 != null && this.field7100.length == this.field7102) {
            this.field7115 = new short[this.field7102];
            for (int var3 = 0; this.field7102 > var3; ++var3) {
                this.field7115[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
    public class503() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I[II)V")
    public final void method2942(int arg0, int[] arg1, int arg2) {
        ++field7101;
        int var4 = class287.field3604[arg2] * this.field7111;
        if (arg0 != -8346) {
            this.field7107 = true;
        }
        if (this.field7102 != 1) {
            short var5 = this.field7100[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field7115[0] << 12;
                int var7 = this.field7105 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field7111 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (var9 <= var11) {
                    var11 = 0;
                }
                int var13 = class562.field7914[var12];
                int var14 = this.field7112[var10 & 255] & 255;
                int var15 = this.field7112[var11 & 255] & 255;
                for (int var16 = 0; var16 < class29.field523; ++var16) {
                    int var36 = class634.field8751[var16] * this.field7105;
                    int var37 = this.method2943((byte) -87, var13, var12, var14, var15, var6 * var36 >> 12, var7);
                    arg1[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field7102 < ~var17; ++var17) {
                short var18 = this.field7100[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field7115[var17] << 12;
                    int var20 = this.field7111 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field7105 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (var24 >= var20) {
                        var24 = 0;
                    }
                    int var26 = this.field7112[var23 & 255] & 255;
                    int var27 = 255 & this.field7112[255 & var24];
                    int var28 = class562.field7914[var25];
                    if (this.field7107 && this.field7102 + -1 == var17) {
                        for (int var29 = 0; var29 < class29.field523; ++var29) {
                            int var30 = class634.field8751[var29] * this.field7105;
                            int var31 = this.method2943((byte) -127, var28, var25, var26, var27, var19 * var30 >> 12, var22);
                            int var32 = (var18 * var31 >> 12) + arg1[var29];
                            arg1[var29] = 2048 - -(var32 >> 1);
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class29.field523; ++var33) {
                            int var34 = class634.field8751[var33] * this.field7105;
                            int var35 = this.method2943((byte) -125, var28, var25, var26, var27, var19 * var34 >> 12, var22);
                            arg1[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field7100[0];
            int var39 = this.field7115[0] << 12;
            int var40 = this.field7105 * var39 >> 12;
            int var41 = this.field7111 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var45 = var42 & 4095;
            int var46 = 255 & this.field7112[255 & var43];
            int var47 = 255 & this.field7112[255 & var44];
            int var48 = class562.field7914[var45];
            if (!this.field7107) {
                for (int var49 = 0; var49 < class29.field523; ++var49) {
                    int var50 = class634.field8751[var49] * this.field7105;
                    int var51 = this.method2943((byte) -87, var48, var45, var46, var47, var39 * var50 >> 12, var40);
                    arg1[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~var52 > ~class29.field523; ++var52) {
                    int var53 = class634.field8751[var52] * this.field7105;
                    int var54 = this.method2943((byte) -99, var48, var45, var46, var47, var39 * var53 >> 12, var40);
                    int var55 = var38 * var54 >> 12;
                    arg1[var52] = 2048 - -(var55 >> 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(BIIIIII)I")
    private final int method2943(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7099;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (arg0 >= -86) {
            return -67;
        } else {
            int var11 = arg5 & 4095;
            if (arg6 <= var9) {
                var9 = 0;
            }
            int var12 = var9 & 255;
            int var13 = arg2 + -4096;
            int var14 = var11 + -4096;
            int var15 = class562.field7914[var11];
            int var16 = 3 & this.field7112[arg3 + var10];
            int var17;
            if (~var16 < -2) {
                var17 = ~var16 == -3 ? -arg2 + var11 : -arg2 + -var11;
            } else {
                var17 = ~var16 != -1 ? arg2 - var11 : arg2 + var11;
            }
            int var18 = 3 & this.field7112[arg3 + var12];
            int var19;
            if (~var18 >= -2) {
                var19 = ~var18 != -1 ? -var14 + arg2 : arg2 + var14;
            } else {
                var19 = ~var18 == -3 ? -arg2 + var14 : -var14 - arg2;
            }
            int var20 = this.field7112[arg4 + var10] & 3;
            int var21 = var17 - -((var19 - var17) * var15 >> 12);
            int var22;
            if (~var20 < -2) {
                var22 = var20 == 2 ? -var13 + var11 : -var11 - var13;
            } else {
                var22 = var20 == 0 ? var11 + var13 : var13 - var11;
            }
            int var23 = 3 & this.field7112[var12 - -arg4];
            int var24;
            if (var23 <= 1) {
                var24 = var23 != 0 ? -var14 + var13 : var13 + var14;
            } else {
                var24 = var23 == 2 ? -var13 + var14 : -var13 + -var14;
            }
            int var25 = ((var24 - var22) * var15 >> 12) + var22;
            return ((-var21 + var25) * arg1 >> 12) + var21;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)V")
    public static void method2944(int arg0) {
        field7104 = null;
        if (arg0 != 0) {
            field7104 = null;
        }
    }
}
