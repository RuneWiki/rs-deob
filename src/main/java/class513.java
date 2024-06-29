import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class513 extends class354 {

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
    private int field7557 = 1;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    private int field7566 = 1;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "[I")
    public static int[] field7561 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
    public static int field7560;

    @OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
    public static int field7562;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field7563;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field7565;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field7569;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field7567;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field5354 = arg1.method1918((byte) 68) == 1;
                }
            } else {
                this.field7566 = arg1.method1918((byte) 98);
            }
        } else {
            this.field7557 = arg1.method1918((byte) 120);
        }
        if (arg0 != 15180) {
            field7561 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class513() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
    public static final void method3038(byte arg0, Object[] arg1, long[] arg2) {
        class483.method2886(arg1, 0, false, arg2.length + -1, arg2);
        ++field7564;
        if (arg0 > -90) {
            field7561 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
    public static final void method3039(int arg0) {
        class420.field6182 = 0;
        ++field7563;
        class375.field5603 = new class310[50];
        if (arg0 <= 102) {
            method3043(112, -122, (byte) -82, 96, 105);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        ++field7560;
        if (arg0 >= -40) {
            this.field7557 = 38;
        }
        int[][] var3 = super.field5351.method2819((byte) -56, arg1);
        if (super.field5351.field6959) {
            int var4 = this.field7566 + this.field7566 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field7557 + 1 + this.field7557;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field7566 + arg1; this.field7566 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method2291(0, (byte) -91, class30.field492 & var9);
                int[][] var20 = new int[3][class404.field5952];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field7557; ~var27 >= ~this.field7557; ++var27) {
                    int var37 = class168.field2527 & var27;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class404.field5952) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class168.field2527 & -this.field7557 + var31;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = this.field7557 + var31 & class168.field2527;
                    var23 = var26[var36] + var35;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[this.field7566 + var9 + -arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class404.field5952 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "(I)V")
    public static void method3040(int arg0) {
        field7561 = null;
        if (arg0 != 0) {
            field7561 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIII)V")
    public static final void method3041(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 27663) {
            if (~class397.field5830.field116 != -1 && ~arg1 != -1 && ~class420.field6182 > -51 && arg3 != -1) {
                class375.field5603[class420.field6182++] = new class310((byte) 1, arg3, arg1, arg2, arg4, 0);
            }
            ++field7565;
        }
    }

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "(I)Lnn;")
    public static final class285 method3042(int arg0) {
        ++field7559;
        try {
            return arg0 != -1 ? null : (class285) Class.forName("gj").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V")
    public static final void method3043(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (~class322.field4945 >= ~arg3 && ~arg3 >= ~class145.field2134) {
            int var5 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg1);
            int var6 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg4);
            class148.method1060(var6, arg3, (byte) 127, var5, arg0);
        }
        if (arg2 >= -103) {
            field7561 = null;
        }
        ++field7558;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method3044(boolean arg0, int arg1, int arg2) {
        int var3 = -59 % ((-24 - arg1) / 47);
        ++field7569;
        return arg0 && ~arg2 <= -1 ? class414.method2552(arg2, arg0, 122, 10) : Integer.toString(arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field7568;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            return null;
        } else {
            if (super.field5357.field1869) {
                int var4 = this.field7566 - -this.field7566 - -1;
                int var5 = 65536 / var4;
                int var6 = this.field7557 + this.field7557 + 1;
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field7566 + arg0; ~var9 >= ~(arg0 - -this.field7566); ++var9) {
                    int[] var13 = this.method2293(0, class30.field492 & var9, (byte) 69);
                    int[] var14 = new int[class404.field5952];
                    int var15 = 0;
                    for (int var16 = -this.field7557; var16 <= this.field7557; ++var16) {
                        var15 += var13[var16 & class168.field2527];
                    }
                    int var17 = 0;
                    while (class404.field5952 > var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field7557 + var17 & class168.field2527];
                        ++var17;
                        var15 = var13[class168.field2527 & this.field7557 + var17] + var18;
                    }
                    var8[this.field7566 + var9 + -arg0] = var14;
                }
                for (int var10 = 0; ~class404.field5952 < ~var10; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var12 < var4; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }
}
