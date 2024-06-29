import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class150 extends class80 {

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "Z")
    public boolean field2469 = true;

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
    public int field2466 = 1638;

    @OriginalMember(owner = "client!nt", name = "V", descriptor = "I")
    public int field2477 = 0;

    @OriginalMember(owner = "client!nt", name = "U", descriptor = "I")
    public int field2476 = 4;

    @OriginalMember(owner = "client!nt", name = "Q", descriptor = "[B")
    private byte[] field2472 = new byte[512];

    @OriginalMember(owner = "client!nt", name = "S", descriptor = "I")
    public int field2474 = 4;

    @OriginalMember(owner = "client!nt", name = "Z", descriptor = "I")
    public int field2481 = 4;

    @OriginalMember(owner = "client!nt", name = "J", descriptor = "Lju;")
    public static class83 field2465 = new class83();

    @OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!nt", name = "R", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!nt", name = "W", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!nt", name = "X", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!nt", name = "Y", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!nt", name = "ab", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!nt", name = "bb", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "[S")
    private short[] field2464;

    @OriginalMember(owner = "client!nt", name = "T", descriptor = "[S")
    private short[] field2475;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([III)V", line = 10)
    public final void method1098(int[] arg0, int arg1, int arg2) {
        ++field2482;
        if (arg1 != -1760601748) {
            this.method25(72, 70);
        }
        int var4 = class44.field795[arg2] * this.field2474;
        if (~this.field2481 != -2) {
            short var5 = this.field2475[0];
            if (~var5 < -9 || var5 < -8) {
                int var6 = this.field2464[0] << 12;
                int var7 = this.field2474 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field2476 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (var7 <= var11) {
                    var11 = 0;
                }
                int var13 = class80.field1598[var12];
                int var14 = this.field2472[var10 & 255] & 255;
                int var15 = 255 & this.field2472[var11 & 255];
                for (int var16 = 0; var16 < class137.field2308; ++var16) {
                    int var36 = class460.field6860[var16] * this.field2476;
                    int var37 = this.method1102(var6 * var36 >> 12, var14, var12, var13, false, var9, var15);
                    arg0[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field2481 > var17; ++var17) {
                short var18 = this.field2475[var17];
                if (~var18 < -9 || var18 < -8) {
                    int var19 = this.field2464[var17] << 12;
                    int var20 = var4 * var19 >> 12;
                    int var21 = this.field2476 * var19 >> 12;
                    int var22 = this.field2474 * var19 >> 12;
                    int var23 = var20 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var20 & 4095;
                    if (var22 <= var24) {
                        var24 = 0;
                    }
                    int var26 = 255 & this.field2472[255 & var24];
                    int var27 = 255 & this.field2472[255 & var23];
                    int var28 = class80.field1598[var25];
                    if (this.field2469 && this.field2481 + -1 == var17) {
                        for (int var29 = 0; class137.field2308 > var29; ++var29) {
                            int var30 = class460.field6860[var29] * this.field2476;
                            int var31 = this.method1102(var19 * var30 >> 12, var27, var25, var28, false, var21, var26);
                            int var32 = (var18 * var31 >> 12) + arg0[var29];
                            arg0[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class137.field2308; ++var33) {
                            int var34 = class460.field6860[var33] * this.field2476;
                            int var35 = this.method1102(var19 * var34 >> 12, var27, var25, var28, false, var21, var26);
                            arg0[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field2464[0] << 12;
            short var39 = this.field2475[0];
            int var40 = this.field2476 * var38 >> 12;
            int var41 = var4 * var38 >> 12;
            int var42 = this.field2474 * var38 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            int var45 = var41 & 4095;
            if (~var42 >= ~var44) {
                var44 = 0;
            }
            int var46 = 255 & this.field2472[255 & var43];
            int var47 = this.field2472[var44 & 255] & 255;
            int var48 = class80.field1598[var45];
            if (!this.field2469) {
                for (int var49 = 0; ~class137.field2308 < ~var49; ++var49) {
                    int var50 = class460.field6860[var49] * this.field2476;
                    int var51 = this.method1102(var38 * var50 >> 12, var46, var45, var48, false, var40, var47);
                    arg0[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; ~class137.field2308 < ~var52; ++var52) {
                    int var53 = class460.field6860[var52] * this.field2476;
                    int var54 = this.method1102(var38 * var53 >> 12, var46, var45, var48, false, var40, var47);
                    int var55 = var39 * var54 >> 12;
                    arg0[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V", line = 172)
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V", line = 175)
    private final void method1099(int arg0) {
        if (this.field2466 > arg0) {
            this.field2475 = new short[this.field2481];
            this.field2464 = new short[this.field2481];
            for (int var2 = 0; ~this.field2481 < ~var2; ++var2) {
                this.field2475[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2466 / 4096.0F), (double) var2)));
                this.field2464[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2475 != null && this.field2475.length == this.field2481) {
            this.field2464 = new short[this.field2481];
            for (int var3 = 0; var3 < this.field2481; ++var3) {
                this.field2464[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field2468;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(II)V", line = 214)
    public static final void method1100(int arg0, int arg1) {
        ++field2471;
        if (arg0 > -90) {
            field2479 = -99;
        }
        class381.field5579 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "(I)V", line = 226)
    public static void method1101(int arg0) {
        field2465 = null;
        if (arg0 != 14503) {
            field2479 = 12;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIZII)I", line = 255)
    private final int method1102(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field2483;
        int var8 = arg0 >> 12;
        int var9 = var8 + 1;
        if (var9 >= arg5) {
            var9 = 0;
        }
        int var10 = arg0 & 4095;
        int var11 = var8 & 255;
        int var12 = arg2 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 - 4096;
        int var15 = class80.field1598[var10];
        int var16 = this.field2472[arg1 + var11] & 3;
        int var17;
        if (var16 > 1) {
            var17 = ~var16 != -3 ? -var10 - arg2 : -arg2 + var10;
        } else {
            var17 = var16 != 0 ? -var10 + arg2 : arg2 + var10;
        }
        int var18 = this.field2472[var13 - -arg1] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = var18 != 0 ? -var14 + arg2 : arg2 + var14;
        } else {
            var19 = var18 != 2 ? -arg2 + -var14 : var14 - arg2;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field2472[arg6 + var11];
        int var22;
        if (~var21 < -2) {
            var22 = ~var21 != -3 ? -var10 + -var12 : -var12 + var10;
        } else {
            var22 = var21 != 0 ? -var10 + var12 : var10 - -var12;
        }
        int var23 = this.field2472[var13 - -arg6] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = var23 != 2 ? -var12 + -var14 : -var12 + var14;
        } else {
            var24 = ~var23 == -1 ? var12 + var14 : -var14 + var12;
        }
        if (arg4) {
            method1100(5, 38);
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var20 + var25) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)[I", line = 331)
    public final int[] method25(int arg0, int arg1) {
        ++field2467;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (arg1 != -16828) {
            this.field2476 = 15;
        }
        if (super.field1601.field124) {
            this.method1098(var3, arg1 + -1760584920, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([[BLh;I)V", line = 357)
    public static final void method1103(byte[][] arg0, class474 arg1, int arg2) {
        ++field2480;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        if (arg2 != 64) {
            method1100(105, 38);
        }
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class289 var11 = new class289(var10);
                int var12 = class58.field1227[var5] >> 8;
                int var13 = class58.field1227[var5] & 255;
                int var14 = var12 * 64 + -class496.field7292;
                int var15 = var13 * 64 - class212.field3378;
                class42.method255(arg2 ^ 62);
                arg1.method575(class67.field1367, var11, class212.field3378, class496.field7292, (byte) -123, var15, var14);
                arg1.method2830(var14, var3, var15, -128, class262.field4006, var11);
                if (!arg1.field1342 && ~(class49.field995 / 8) == ~var12 && class266.field4039 / 8 == var13 && ~var3[0] != 0) {
                    class299.field4519 = class159.field2574.method2515(0, var3[0], var3[2], var3[3], class464.field6883, var3[1]);
                    class284.field4276 = var3[4];
                }
            }
        }
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            int var7 = (class58.field1227[var6] >> 8) * 64 + -class496.field7292;
            int var8 = (class58.field1227[var6] & 255) * 64 + -class212.field3378;
            byte[] var9 = arg0[var6];
            if (var9 == null && ~class266.field4039 > -801) {
                class42.method255(115);
                arg1.method578(arg2 ^ 112, var7, 64, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(ZI)Llb;", line = 439)
    public static final class383 method1104(boolean arg0, int arg1) {
        ++field2470;
        if (!arg0) {
            method1104(false, 24);
        }
        class383[] var2 = class432.method2594(-114);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class383 var4 = var2[var3];
            if (var4.field5592 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V", line = 465)
    public final void method23(boolean arg0) {
        ++field2478;
        this.field2472 = class272.method1723(this.field2477, 6);
        this.method1099(0);
        for (int var2 = this.field2481 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2475[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field2481;
        }
        if (!arg0) {
            this.method26(-55, -66, (class289) null);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILnn;)V", line = 497)
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field2473;
        int var4 = 28 % ((28 - arg1) / 53);
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field2481 = arg2.method1858(-3256);
            } else {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field2476 = this.field2474 = arg2.method1858(-3256);
                        return;
                    }
                    if (arg0 == 4) {
                        this.field2477 = arg2.method1858(-3256);
                        return;
                    }
                    if (arg0 == 5) {
                        this.field2476 = arg2.method1858(-3256);
                        return;
                    }
                    if (~arg0 == -7) {
                        this.field2474 = arg2.method1858(-3256);
                        return;
                    }
                } else {
                    this.field2466 = arg2.method1848((byte) 117);
                    if (this.field2466 < 0) {
                        this.field2475 = new short[this.field2481];
                        for (int var6 = 0; var6 < this.field2481; ++var6) {
                            this.field2475[var6] = (short) arg2.method1848((byte) 108);
                        }
                        return;
                    }
                }
            }
        } else {
            this.field2469 = ~arg2.method1858(-3256) == -2;
        }
    }
}
