import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class482 {

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "I")
    public int field6730;

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
    public static int field6732 = 0;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "Lhj;")
    public static class596 field6729 = new class596(1, 0);

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "[I")
    public static int[] field6737 = new int[13];

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!iga", name = "e", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!iga", name = "f", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!iga", name = "g", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "Ljava/awt/Font;")
    public static Font field6736;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(CI)Z")
    public static final boolean method2860(char arg0, int arg1) {
        field6731++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class729.method4119(arg1 + 123, arg0)) {
            return true;
        } else {
            char[] var2 = class358.field4439;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            if (arg1 != 4) {
                field6737 = null;
            }
            char[] var4 = class13.field222;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
    public static void method2861(int arg0) {
        field6729 = null;
        int var1 = 9 / ((arg0 - 28) / 45);
        field6736 = null;
        field6737 = null;
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(II)V")
    public class482(int arg0, int arg1) {
        this.field6730 = arg0;
    }

    @OriginalMember(owner = "client!iga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6734++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IBI[BIII[BI)V")
    public static final void method2862(int arg0, byte arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field6735++;
        int var9 = -(arg0 >> 2);
        int var10 = -(arg0 & 0x3);
        int var11 = 64 % ((8 - arg1) / 56);
        for (int var12 = -arg4; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg3[arg6++]);
                int var15 = arg2++;
                arg7[var15] = (byte) (arg7[var15] - arg3[arg6++]);
                int var16 = arg2++;
                arg7[var16] = (byte) (arg7[var16] - arg3[arg6++]);
                int var17 = arg2++;
                arg7[var17] = (byte) (arg7[var17] - arg3[arg6++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg3[arg6++]);
            }
            arg6 += arg8;
            arg2 += arg5;
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILwj;IZZIIII[IIIII[I)I")
    public static final int method2863(int arg0, class415 arg1, int arg2, boolean arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field6733++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class578.field7880[var15][var35] = 0;
                class68.field931[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg12 == 1) {
            var16 = class619.method3508(arg1, arg0, arg10, arg7, arg2, 1084489728, arg8, arg13, arg11, arg6, arg5);
        } else if (arg12 == 2) {
            var16 = class669.method3756(arg5, arg2, arg1, arg0, 122, arg13, arg6, arg11, arg10, arg7, arg8);
        } else {
            var16 = class380.method2224((byte) 7, arg13, arg11, arg12, arg6, arg2, arg1, arg8, arg0, arg7, arg5, arg10);
        }
        int var17 = arg6 - 64;
        if (arg3) {
            method2863(-121, null, 9, true, false, -41, 35, 103, -8, null, 88, -124, 68, -50, null);
        }
        int var18 = arg5 - 64;
        int var19 = class324.field4020;
        int var20 = class394.field5108;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= (arg0 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class68.field931[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg10 > var24) {
                            var28 = arg10 - var24;
                        } else if (var24 > arg10 + arg13 - 1) {
                            var28 = var24 + 1 - arg10 - arg13;
                        }
                        int var29 = 0;
                        if (var25 < arg0) {
                            var29 = arg0 - var25;
                        } else if (var25 > (arg0 + arg11 - 1)) {
                            var29 = var25 + 1 - (arg0 + arg11);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class68.field931[var26][var27]) {
                            var19 = var24;
                            var22 = class68.field931[var26][var27];
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg6 == var19 && arg5 == var20) {
            return 0;
        }
        byte var31 = 0;
        class186.field2252[var31] = var19;
        int var37 = var31 + 1;
        class496.field6942[var31] = var20;
        int var32;
        int var33 = var32 = class578.field7880[var19 - var17][var20 - var18];
        while (arg6 != var19 || arg5 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class186.field2252[var37] = var19;
                class496.field6942[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class578.field7880[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg14[var34] = class186.field2252[var37];
            arg9[var34++] = class496.field6942[var37];
            if (var34 >= arg14.length) {
                break;
            }
        }
        return var34;
    }
}
