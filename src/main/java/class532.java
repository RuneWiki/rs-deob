import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class532 extends class546 {

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field7744 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "[Z")
    public static boolean[] field7753 = new boolean[100];

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[[I")
    public static int[][] field7751 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field7745;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field7750;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "Lf;")
    public static class702 field7752;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/Object;III)[B", line = 4)
    public static final byte[] method3217(Object arg0, int arg1, int arg2, int arg3) {
        ++field7754;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[]) arg0;
            return class603.method3513(true, arg2, var4, arg3);
        } else if (arg0 instanceof class56) {
            class56 var5 = (class56) arg0;
            return var5.method656(arg2, (byte) 125, arg3);
        } else {
            int var6 = -107 / ((arg1 - 67) / 54);
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 34)
    public final void method793(int arg0, boolean arg1) {
        ++field7747;
        if (arg0 >= -39) {
            method3217((Object) null, 66, 78, -107);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z", line = 46)
    public final boolean method787(byte arg0) {
        ++field7748;
        return arg0 == -109;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V", line = 57)
    public final void method788(boolean arg0, int arg1) {
        super.field7937.method2273((byte) 93, true);
        if (arg1 == 0) {
            ++field7750;
        }
    }

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "(I)V", line = 77)
    public static void method3218(int arg0) {
        if (arg0 != -27108) {
            method3219(6, 79, 100, -63, (int[]) null, 121, (class23) null, (int[]) null, -66, -119, false, 101, (byte) 3, 102, -80);
        }
        field7751 = null;
        field7753 = null;
        field7752 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZLwq;)V", line = 92)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field7745;
        super.field7937.method2271(arg2, 5180);
        if (!arg1) {
            super.field7937.method2280(2, arg0);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIII[IILnc;[IIIZIBII)I", line = 104)
    public static final int method3219(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, class23 arg6, int[] arg7, int arg8, int arg9, boolean arg10, int arg11, byte arg12, int arg13, int arg14) {
        ++field7742;
        for (int var15 = 0; var15 < 128; ++var15) {
            for (int var36 = 0; var36 < 128; ++var36) {
                class412.field6325[var15][var36] = 0;
                class314.field4937[var15][var36] = 99999999;
            }
        }
        int var16 = -119 % ((-43 - arg12) / 56);
        boolean var17;
        if (~arg13 == -2) {
            var17 = class443.method2795(arg2, arg9, (byte) 46, arg1, arg3, arg0, arg6, arg5, arg8, arg14, arg11);
        } else if (arg13 == 2) {
            var17 = class313.method2139(arg1, arg5, arg14, arg6, arg9, arg11, (byte) 83, arg8, arg3, arg0, arg2);
        } else {
            var17 = class92.method836(arg2, arg13, arg3, arg5, arg6, arg0, false, arg14, arg9, arg11, arg1, arg8);
        }
        int var18 = arg8 - 64;
        int var19 = arg11 + -64;
        int var20 = class408.field6295;
        int var21 = class614.field8730;
        if (!var17) {
            if (!arg10) {
                return -1;
            }
            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            for (int var25 = -var24 + arg2; ~(arg2 + var24) <= ~var25; ++var25) {
                for (int var26 = -var24 + arg9; arg9 + var24 >= var26; ++var26) {
                    int var27 = -var18 + var25;
                    int var28 = var26 - var19;
                    if (~var27 <= -1 && var28 >= 0 && var27 < 128 && var28 < 128 && class314.field4937[var27][var28] < 100) {
                        int var29 = 0;
                        if (~var25 <= ~arg2) {
                            if (~(arg2 + arg5 - 1) > ~var25) {
                                var29 = var25 - -1 - (arg2 + arg5);
                            }
                        } else {
                            var29 = -var25 + arg2;
                        }
                        int var30 = 0;
                        if (~arg9 >= ~var26) {
                            if (~(arg9 + arg14 + -1) > ~var26) {
                                var30 = -arg9 - -1 + -arg14 + var26;
                            }
                        } else {
                            var30 = -var26 + arg9;
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (~var31 > ~var22 || var22 == var31 && var23 > class314.field4937[var27][var28]) {
                            var20 = var25;
                            var22 = var31;
                            var21 = var26;
                            var23 = class314.field4937[var27][var28];
                        }
                    }
                }
            }
            if (~var22 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg8 == var20 && arg11 == var21) {
            return 0;
        } else {
            byte var32 = 0;
            class343.field5540[var32] = var20;
            int var38 = var32 + 1;
            class100.field1650[var32] = var21;
            int var33;
            int var34 = var33 = class412.field6325[-var18 + var20][var21 - var19];
            while (~arg8 != ~var20 || arg11 != var21) {
                if (~var33 != ~var34) {
                    var33 = var34;
                    class343.field5540[var38] = var20;
                    class100.field1650[var38++] = var21;
                }
                if ((1 & var34) == 0) {
                    if (~(4 & var34) != -1) {
                        --var21;
                    }
                } else {
                    ++var21;
                }
                if (~(2 & var34) == -1) {
                    if ((8 & var34) != 0) {
                        --var20;
                    }
                } else {
                    ++var20;
                }
                var34 = class412.field6325[-var18 + var20][-var19 + var21];
            }
            int var35 = 0;
            while (~(var38--) < -1) {
                arg7[var35] = class343.field5540[var38];
                arg4[var35++] = class100.field1650[var38];
                if (~arg7.length >= ~var35) {
                    break;
                }
            }
            return var35;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(III)V", line = 278)
    public final void method785(int arg0, int arg1, int arg2) {
        if (arg0 == 8) {
            ++field7749;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lrr;)V", line = 288)
    public class532(class332 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "(I)V", line = 294)
    public static final void method3220(int arg0) {
        class9.field157 = null;
        if (arg0 == 0) {
            ++field7743;
            class518.field7504 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V", line = 312)
    public final void method783(int arg0) {
        if (arg0 != 255) {
            field7751 = null;
        }
        ++field7746;
        super.field7937.method2273((byte) -93, false);
    }
}
