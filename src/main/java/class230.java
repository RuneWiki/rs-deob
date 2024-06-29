import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class230 extends class634 {

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public int field2681 = 4;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public int field2674 = 4;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public int field2689 = 0;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Z")
    public boolean field2677 = true;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public int field2682 = 1638;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public int field2693 = 4;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "[B")
    private byte[] field2692 = new byte[512];

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Z")
    public static boolean field2687 = false;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Lva;")
    public static class495 field2690;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Laga;")
    public static class664 field2685;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "[I")
    public static int[] field2676;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "[I")
    public static int[] field2686;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "[S")
    private short[] field2684;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "[S")
    private short[] field2694;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIII)I")
    private final int method1331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2680;
        int var8 = 24 % ((31 - arg0) / 54);
        int var9 = arg3 >> 12;
        int var10 = var9 + 1;
        int var11 = var9 & 255;
        if (~var10 <= ~arg6) {
            var10 = 0;
        }
        int var12 = arg3 & 4095;
        int var13 = arg5 + -4096;
        int var14 = var10 & 255;
        int var15 = var12 + -4096;
        int var16 = class1.field3[var12];
        int var17 = this.field2692[var11 - -arg1] & 3;
        int var18;
        if (var17 <= 1) {
            var18 = var17 != 0 ? -var12 + arg5 : arg5 + var12;
        } else {
            var18 = ~var17 == -3 ? -arg5 + var12 : -arg5 + -var12;
        }
        int var19 = 3 & this.field2692[var14 - -arg1];
        int var20;
        if (~var19 < -2) {
            var20 = var19 == 2 ? -arg5 + var15 : -arg5 + -var15;
        } else {
            var20 = ~var19 == -1 ? var15 - -arg5 : -var15 + arg5;
        }
        int var21 = ((-var18 + var20) * var16 >> 12) + var18;
        int var22 = 3 & this.field2692[arg2 + var11];
        int var23;
        if (~var22 < -2) {
            var23 = ~var22 == -3 ? -var13 + var12 : -var12 + -var13;
        } else {
            var23 = var22 != 0 ? var13 - var12 : var12 + var13;
        }
        int var24 = 3 & this.field2692[arg2 + var14];
        int var25;
        if (var24 > 1) {
            var25 = var24 == 2 ? -var13 + var15 : -var13 + -var15;
        } else {
            var25 = var24 != 0 ? -var15 + var13 : var13 + var15;
        }
        int var26 = var23 - -((-var23 + var25) * var16 >> 12);
        return ((var26 - var21) * arg4 >> 12) + var21;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Ljava/lang/String;")
    public static final String method1332(int arg0) {
        ++field2679;
        if (!class149.field1652 && class10.field74 != null) {
            if (arg0 != 18693) {
                field2690 = null;
            }
            return class10.field74.field9265;
        } else {
            return "";
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field2691;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 >= -55) {
            this.method3(-24, (class244) null, false);
        }
        if (super.field9114.field3897) {
            this.method1335(arg1, (byte) -103, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class230() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    private final void method1333(int arg0) {
        ++field2675;
        if (this.field2682 > 0) {
            this.field2694 = new short[this.field2693];
            this.field2684 = new short[this.field2693];
            for (int var2 = 0; ~this.field2693 < ~var2; ++var2) {
                this.field2684[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field2682 / 4096.0F), (double) var2)));
                this.field2694[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field2684 != null && this.field2684.length == this.field2693) {
            this.field2694 = new short[this.field2693];
            for (int var3 = 0; ~var3 > ~this.field2693; ++var3) {
                this.field2694[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 2) {
            this.method1331(-13, -126, 11, 109, -64, 66, 17);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field2688;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2681 = arg1.method1423(-73);
                                }
                            } else {
                                this.field2674 = arg1.method1423(-112);
                            }
                        } else {
                            this.field2689 = arg1.method1423(-36);
                        }
                    } else {
                        this.field2674 = this.field2681 = arg1.method1423(-91);
                    }
                } else {
                    this.field2682 = arg1.method1466((byte) 31);
                    if (~this.field2682 > -1) {
                        this.field2684 = new short[this.field2693];
                        for (int var5 = 0; ~var5 > ~this.field2693; ++var5) {
                            this.field2684[var5] = (short) arg1.method1466((byte) 31);
                        }
                    }
                }
            } else {
                this.field2693 = arg1.method1423(-98);
            }
        } else {
            this.field2677 = arg1.method1423(-105) == 1;
        }
        if (arg2) {
            field2687 = true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field2686 = null;
        if (arg0 != 255) {
            field2685 = null;
        }
        field2685 = null;
        field2676 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB[I)V")
    public final void method1335(int arg0, byte arg1, int[] arg2) {
        ++field2678;
        int var4 = class164.field1840[arg0] * this.field2681;
        if (arg1 != -103) {
            field2687 = false;
        }
        if (~this.field2693 != -2) {
            short var5 = this.field2684[0];
            if (var5 > 8 || ~var5 > 7) {
                int var6 = this.field2694[0] << 12;
                int var7 = var4 * var6 >> 12;
                int var8 = this.field2681 * var6 >> 12;
                int var9 = this.field2674 * var6 >> 12;
                int var10 = var7 >> 12;
                int var11 = var10 + 1;
                if (var11 >= var8) {
                    var11 = 0;
                }
                int var12 = var7 & 4095;
                int var13 = 255 & this.field2692[255 & var10];
                int var14 = class1.field3[var12];
                int var15 = this.field2692[255 & var11] & 255;
                for (int var16 = 0; var16 < class635.field9139; ++var16) {
                    int var36 = class246.field2980[var16] * this.field2674;
                    int var37 = this.method1331(114, var13, var15, var6 * var36 >> 12, var14, var12, var9);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; var17 < this.field2693; ++var17) {
                short var18 = this.field2684[var17];
                if (var18 > 8 || ~var18 > 7) {
                    int var19 = this.field2694[var17] << 12;
                    int var20 = this.field2674 * var19 >> 12;
                    int var21 = var4 * var19 >> 12;
                    int var22 = this.field2681 * var19 >> 12;
                    int var23 = var21 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var21 & 4095;
                    if (~var22 >= ~var24) {
                        var24 = 0;
                    }
                    int var26 = 255 & this.field2692[255 & var24];
                    int var27 = class1.field3[var25];
                    int var28 = 255 & this.field2692[255 & var23];
                    if (this.field2677 && this.field2693 + -1 == var17) {
                        for (int var29 = 0; class635.field9139 > var29; ++var29) {
                            int var30 = class246.field2980[var29] * this.field2674;
                            int var31 = this.method1331(arg1 ^ 25, var28, var26, var19 * var30 >> 12, var27, var25, var20);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; var33 < class635.field9139; ++var33) {
                            int var34 = class246.field2980[var33] * this.field2674;
                            int var35 = this.method1331(arg1 + 57, var28, var26, var19 * var34 >> 12, var27, var25, var20);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field2684[0];
            int var39 = this.field2694[0] << 12;
            int var40 = this.field2674 * var39 >> 12;
            int var41 = this.field2681 * var39 >> 12;
            int var42 = var4 * var39 >> 12;
            int var43 = var42 >> 12;
            int var44 = var43 + 1;
            int var45 = var42 & 4095;
            if (~var44 <= ~var41) {
                var44 = 0;
            }
            int var46 = 255 & this.field2692[255 & var43];
            int var47 = this.field2692[255 & var44] & 255;
            int var48 = class1.field3[var45];
            if (!this.field2677) {
                for (int var49 = 0; ~class635.field9139 < ~var49; ++var49) {
                    int var50 = class246.field2980[var49] * this.field2674;
                    int var51 = this.method1331(arg1 + 42, var46, var47, var39 * var50 >> 12, var48, var45, var40);
                    arg2[var49] = var38 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class635.field9139; ++var52) {
                    int var53 = class246.field2980[var52] * this.field2674;
                    int var54 = this.method1331(117, var46, var47, var39 * var53 >> 12, var48, var45, var40);
                    int var55 = var38 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field2683;
        this.field2692 = class638.method3650((byte) -84, this.field2689);
        this.method1333(2);
        if (arg0 <= 65) {
            method1334(-46);
        }
        for (int var2 = this.field2693 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field2684[var2];
            if (var3 > 8 || var3 < -8) {
                return;
            }
            --this.field2693;
        }
    }
}
