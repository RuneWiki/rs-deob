import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class158 extends class404 {

    @OriginalMember(owner = "client!sr", name = "G", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!sr", name = "H", descriptor = "[I")
    public static int[] field2489 = new int[250];

    @OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!sr", name = "K", descriptor = "I")
    public static int field2492 = -1;

    @OriginalMember(owner = "client!sr", name = "L", descriptor = "[I")
    public static int[] field2493 = new int[2];

    @OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!sr", name = "B", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!sr", name = "D", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!sr", name = "E", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!sr", name = "F", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sr", name = "C", descriptor = "Lso;")
    public static class314 field2484;

    @OriginalMember(owner = "client!sr", name = "J", descriptor = "[Lvg;")
    private class37[] field2491;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(III)V")
    public static final void method1010(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field4042 != null) {
                var3.field4042 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field2485;
        int[] var3 = super.field5870.method372(arg1, (byte) -17);
        if (super.field5870.field810) {
            this.method1014(-21159, super.field5870.method371(0));
        }
        if (arg0 > -47) {
            this.field2491 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2487;
        int var8 = arg1 + arg2;
        if (arg3 != 2100062828) {
            field2490 = -122;
        }
        int var9 = -arg2 + arg0;
        for (int var10 = arg1; var8 > var10; ++var10) {
            class78.method566(class69.field1212[var10], arg5, arg7, -7, arg6);
        }
        int var11 = arg6 - -arg2;
        for (int var12 = arg0; ~var9 > ~var12; --var12) {
            class78.method566(class69.field1212[var12], arg5, arg7, -7, arg6);
        }
        int var13 = -arg2 + arg5;
        for (int var14 = var8; ~var9 <= ~var14; ++var14) {
            int[] var15 = class69.field1212[var14];
            class78.method566(var15, var11, arg7, -7, arg6);
            class78.method566(var15, var13, arg4, -7, var11);
            class78.method566(var15, arg5, arg7, arg3 ^ -2100062827, var13);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 == arg6 && ~arg0 == ~arg7 && ~arg1 == ~arg4 && arg3 == arg8) {
            class423.method2472(arg5, arg1, arg7, arg3, 117, arg2);
        } else {
            int var10 = arg2;
            int var11 = arg7;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg4 * 3;
            int var17 = arg8 * 3;
            int var18 = arg1 + var14 + -var16 - arg2;
            int var19 = -arg7 + -var17 + arg3 - -var15;
            int var20 = var16 - -var12 + -var14 + -var14;
            int var21 = -var15 + -var15 + var17 + var13;
            int var22 = var14 - var12;
            int var23 = -var13 + var15;
            for (int var24 = 128; ~var24 >= -4097; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg2;
                int var34 = arg7 - -(var30 + var32 + var28 >> 12);
                class423.method2472(arg5, var33, var11, var34, 125, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg9 == -9499) {
            ++field2482;
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field2489 = null;
        field2484 = null;
        field2493 = null;
        if (arg0 != -2) {
            field2493 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            field2489 = null;
        }
        ++field2481;
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int var4 = class431.field6348;
            int var5 = class437.field6437;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5869.method2820(false);
            this.method1014(-21159, var6);
            for (int var8 = 0; ~var8 > ~class437.field6437; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class431.field6348; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class330.method2050(255, var15) << 4;
                    var12[var14] = class330.method2050(var15 >> 4, 4080);
                    var11[var14] = class330.method2050(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        ++field2483;
        if (arg0 == arg2) {
            this.field2491 = new class37[arg1.method257((byte) 24)];
            for (int var4 = 0; ~var4 > ~this.field2491.length; ++var4) {
                int var5 = arg1.method257((byte) 24);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2491[var4] = class475.method2855(arg1, 83);
                            }
                        } else {
                            this.field2491[var4] = class67.method458(class103.method764(arg0, 0), arg1);
                        }
                    } else {
                        this.field2491[var4] = class394.method2339(class103.method764(arg0, 3), arg1);
                    }
                } else {
                    this.field2491[var4] = class402.method2388(arg1, class103.method764(arg0, 123));
                }
            }
        } else if (~arg2 == -2) {
            super.field5873 = arg1.method257((byte) 112) == 1;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[[I)V")
    private final void method1014(int arg0, int[][] arg1) {
        ++field2486;
        int var3 = class431.field6348;
        int var4 = class437.field6437;
        if (arg0 != -21159) {
            field2492 = 115;
        }
        class269.method1635(arg1, -11);
        class29.method150(class435.field6374, class98.field1757, 0, 7142, 0);
        if (this.field2491 != null) {
            for (int var5 = 0; this.field2491.length > var5; ++var5) {
                class37 var6 = this.field2491[var5];
                int var7 = var6.field497;
                int var8 = var6.field500;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method36(arg0 ^ -21160, var3, var4);
                    }
                } else if (~var8 > -1) {
                    var6.method30(var3, var4, (byte) 84);
                } else {
                    var6.method32(var4, 10, var3);
                }
            }
        }
    }
}
