import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class511 extends class739 {

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public int field7401 = 1638;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "I")
    public int field7406 = 4;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public int field7408 = 4;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "[B")
    private byte[] field7399 = new byte[512];

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public int field7410 = 0;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public int field7413 = 4;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "Z")
    public boolean field7409 = true;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Z")
    public static boolean field7403 = true;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
    public static int[] field7412 = new int[1000];

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field7402;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "[S")
    private short[] field7397;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "[S")
    private short[] field7407;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([III)V")
    public final void method3105(int[] arg0, int arg1, int arg2) {
        ++field7398;
        int var4 = class19.field185[arg1] * this.field7406;
        if (arg2 != -11110) {
            this.method3105((int[]) null, -29, 38);
        }
        if (this.field7413 == 1) {
            short var5 = this.field7397[0];
            int var6 = this.field7407[0] << 12;
            int var7 = this.field7406 * var6 >> 12;
            int var8 = var4 * var6 >> 12;
            int var9 = this.field7408 * var6 >> 12;
            int var10 = var8 >> 12;
            int var11 = var10 + 1;
            if (var7 <= var11) {
                var11 = 0;
            }
            int var12 = var8 & 4095;
            int var13 = this.field7399[var11 & 255] & 255;
            int var14 = 255 & this.field7399[var10 & 255];
            int var15 = class152.field2223[var12];
            if (this.field7409) {
                for (int var16 = 0; var16 < class399.field5703; ++var16) {
                    int var17 = class604.field8580[var16] * this.field7408;
                    int var18 = this.method3107(var12, var9, -72, var6 * var17 >> 12, var13, var14, var15);
                    int var19 = var5 * var18 >> 12;
                    arg0[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; class399.field5703 > var20; ++var20) {
                    int var21 = class604.field8580[var20] * this.field7408;
                    int var22 = this.method3107(var12, var9, arg2 + 11013, var6 * var21 >> 12, var13, var14, var15);
                    arg0[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field7397[0];
            if (~var23 < -9 || ~var23 > 7) {
                int var24 = this.field7407[0] << 12;
                int var25 = this.field7408 * var24 >> 12;
                int var26 = this.field7406 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 - -1;
                int var30 = var27 & 4095;
                if (var29 >= var26) {
                    var29 = 0;
                }
                int var31 = this.field7399[255 & var28] & 255;
                int var32 = this.field7399[255 & var29] & 255;
                int var33 = class152.field2223[var30];
                for (int var34 = 0; ~var34 > ~class399.field5703; ++var34) {
                    int var54 = class604.field8580[var34] * this.field7408;
                    int var55 = this.method3107(var30, var25, -55, var24 * var54 >> 12, var32, var31, var33);
                    arg0[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; ~var35 > ~this.field7413; ++var35) {
                short var36 = this.field7397[var35];
                if (var36 > 8 || ~var36 > 7) {
                    int var37 = this.field7407[var35] << 12;
                    int var38 = this.field7408 * var37 >> 12;
                    int var39 = var4 * var37 >> 12;
                    int var40 = this.field7406 * var37 >> 12;
                    int var41 = var39 >> 12;
                    int var42 = var41 + 1;
                    if (~var42 <= ~var40) {
                        var42 = 0;
                    }
                    int var43 = var39 & 4095;
                    int var44 = this.field7399[var41 & 255] & 255;
                    int var45 = 255 & this.field7399[var42 & 255];
                    int var46 = class152.field2223[var43];
                    if (this.field7409 && this.field7413 + -1 == var35) {
                        for (int var47 = 0; ~var47 > ~class399.field5703; ++var47) {
                            int var48 = class604.field8580[var47] * this.field7408;
                            int var49 = this.method3107(var43, var38, -119, var37 * var48 >> 12, var45, var44, var46);
                            int var50 = (var36 * var49 >> 12) + arg0[var47];
                            arg0[var47] = 2048 - -(var50 >> 1);
                        }
                    } else {
                        for (int var51 = 0; ~var51 > ~class399.field5703; ++var51) {
                            int var52 = class604.field8580[var51] * this.field7408;
                            int var53 = this.method3107(var43, var38, -110, var37 * var52 >> 12, var45, var44, var46);
                            arg0[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static void method3106(int arg0) {
        field7412 = null;
        if (arg0 < 16) {
            method3106(-46);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)I")
    private final int method3107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field7414;
        int var8 = arg3 >> 12;
        int var9 = var8 + 1;
        if (arg1 <= var9) {
            var9 = 0;
        }
        int var10 = var8 & 255;
        int var11 = arg3 & 4095;
        int var12 = arg0 + -4096;
        int var13 = var11 + -4096;
        if (arg2 > -51) {
            return 67;
        } else {
            int var14 = var9 & 255;
            int var15 = class152.field2223[var11];
            int var16 = this.field7399[arg5 + var10] & 3;
            int var17;
            if (var16 > 1) {
                var17 = ~var16 != -3 ? -var11 - arg0 : -arg0 + var11;
            } else {
                var17 = ~var16 != -1 ? arg0 - var11 : var11 - -arg0;
            }
            int var18 = 3 & this.field7399[arg5 + var14];
            int var19;
            if (~var18 >= -2) {
                var19 = ~var18 == -1 ? var13 - -arg0 : -var13 + arg0;
            } else {
                var19 = var18 != 2 ? -arg0 + -var13 : -arg0 + var13;
            }
            int var20 = ((-var17 + var19) * var15 >> 12) + var17;
            int var21 = 3 & this.field7399[var10 - -arg4];
            int var22;
            if (var21 > 1) {
                var22 = ~var21 == -3 ? -var12 + var11 : -var11 - var12;
            } else {
                var22 = var21 != 0 ? var12 - var11 : var11 + var12;
            }
            int var23 = 3 & this.field7399[arg4 + var14];
            int var24;
            if (var23 <= 1) {
                var24 = var23 != 0 ? -var13 + var12 : var12 + var13;
            } else {
                var24 = ~var23 == -3 ? -var12 + var13 : -var12 + -var13;
            }
            int var25 = ((-var22 + var24) * var15 >> 12) + var22;
            return ((var25 - var20) * arg6 >> 12) + var20;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        ++field7405;
        this.field7399 = class297.method1853(this.field7410, 123);
        this.method3108(-84);
        if (arg0 <= 53) {
            this.method3108(-127);
        }
        for (int var2 = this.field7413 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field7397[var2];
            if (var3 > 8 || ~var3 > 7) {
                return;
            }
            --this.field7413;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field7406 = arg0.method2886(true);
                                }
                            } else {
                                this.field7408 = arg0.method2886(true);
                            }
                        } else {
                            this.field7410 = arg0.method2886(true);
                        }
                    } else {
                        this.field7408 = this.field7406 = arg0.method2886(true);
                    }
                } else {
                    this.field7401 = arg0.method2870(-11395);
                    if (~this.field7401 > -1) {
                        this.field7397 = new short[this.field7413];
                        for (int var5 = 0; var5 < this.field7413; ++var5) {
                            this.field7397[var5] = (short) arg0.method2870(class639.method3689(arg2, -11396));
                        }
                    }
                }
            } else {
                this.field7413 = arg0.method2886(true);
            }
        } else {
            this.field7409 = ~arg0.method2886(true) == -2;
        }
        ++field7404;
        if (arg2 != 1) {
            this.method3107(77, 24, -77, -2, -40, -19, 84);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field7400;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field10317.method1042(0, arg1);
            if (super.field10317.field2170) {
                this.method3105(var3, arg1, -11110);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    private final void method3108(int arg0) {
        if (this.field7401 <= 0) {
            if (this.field7397 != null && this.field7397.length == this.field7413) {
                this.field7407 = new short[this.field7413];
                for (int var2 = 0; ~this.field7413 < ~var2; ++var2) {
                    this.field7407[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field7407 = new short[this.field7413];
            this.field7397 = new short[this.field7413];
            for (int var3 = 0; ~this.field7413 < ~var3; ++var3) {
                this.field7397[var3] = (short) ((int) (Math.pow((double) ((float) this.field7401 / 4096.0F), (double) var3) * 4096.0D));
                this.field7407[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field7411;
        if (arg0 > -55) {
            this.field7410 = 92;
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class511() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method3109(byte arg0, String arg1) {
        ++field7402;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class136.method973(10149, arg1);
            if (var2 != null) {
                int var3 = -19 / ((-8 - arg0) / 55);
                for (int var4 = 0; var4 < class386.field5583; ++var4) {
                    String var5 = class196.field2860[var4];
                    if (var5.startsWith("*")) {
                        var5 = var5.substring(1);
                    }
                    String var6 = class136.method973(10149, var5);
                    if (var6 != null && var6.equals(var2)) {
                        --class386.field5583;
                        for (int var7 = var4; ~class386.field5583 < ~var7; ++var7) {
                            class196.field2860[var7] = class196.field2860[var7 + 1];
                            class519.field7483[var7] = class519.field7483[var7 + 1];
                            class329.field4455[var7] = class329.field4455[var7 - -1];
                            class519.field7487[var7] = class519.field7487[var7 + 1];
                            class381.field5521[var7] = class381.field5521[var7 + 1];
                            class343.field4711[var7] = class343.field4711[var7 - -1];
                        }
                        class363.field5307 = class152.field2225;
                        ++class530.field7721;
                        class88 var8 = class448.method2741((byte) 29, class46.field764, class583.field8319);
                        var8.field1260.method2881(class231.method1605((byte) 44, arg1), (byte) 116);
                        var8.field1260.method2902(arg1, false);
                        class523.method3183(var8, (byte) 31);
                        return;
                    }
                }
            }
        }
    }
}
