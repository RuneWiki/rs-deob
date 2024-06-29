import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class403 {

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "Lhg;")
    public class342 field5876 = new class342();

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "Lsh;")
    public static class472 field5879 = new class472(17, 15);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lhg;")
    private class342 field5882;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III[IILtf;I[IIBIIIZI)I")
    public static final int method2408(int arg0, int arg1, int arg2, int[] arg3, int arg4, class491 arg5, int arg6, int[] arg7, int arg8, byte arg9, int arg10, int arg11, int arg12, boolean arg13, int arg14) {
        field5877++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class401.field5859[var15][var36] = 0;
                class309.field4648[var15][var36] = 99999999;
            }
        }
        int var16 = -3 / ((32 - arg9) / 58);
        boolean var17;
        if (arg1 == 1) {
            var17 = class96.method753(arg10, arg5, 29379, arg11, arg4, arg0, arg6, arg8, arg2, arg12, arg14);
        } else if (arg1 == 2) {
            var17 = class337.method2063(arg2, -1, arg6, arg12, arg5, arg0, arg4, arg11, arg8, arg10, arg14);
        } else {
            var17 = class450.method2655(arg0, arg8, arg5, arg14, arg1, arg6, arg10, arg12, arg2, arg11, 1, arg4);
        }
        int var18 = arg2 - 64;
        int var19 = arg11 - 64;
        int var20 = class270.field4001;
        int var21 = class379.field5639;
        if (!var17) {
            if (!arg13) {
                return -1;
            }
            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            for (int var25 = arg8 - var24; var25 <= arg8 + var24; var25++) {
                for (int var26 = arg6 - var24; var26 <= arg6 + var24; var26++) {
                    int var27 = var25 - var18;
                    int var28 = var26 - var19;
                    if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class309.field4648[var27][var28] < 100) {
                        int var29 = 0;
                        if (var25 < arg8) {
                            var29 = arg8 - var25;
                        } else if (arg14 + arg8 - 1 < var25) {
                            var29 = var25 + 1 - arg8 - arg14;
                        }
                        int var30 = 0;
                        if (arg6 > var26) {
                            var30 = arg6 - var26;
                        } else if (var26 > arg4 + arg6 - 1) {
                            var30 = -arg4 - (arg6 - var26 - 1);
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (var31 < var22 || var22 == var31 && class309.field4648[var27][var28] < var23) {
                            var23 = class309.field4648[var27][var28];
                            var22 = var31;
                            var21 = var26;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var22 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg2 == var20 && arg11 == var21) {
            return 0;
        }
        byte var32 = 0;
        class398.field5832[var32] = var20;
        int var38 = var32 + 1;
        class40.field562[var32] = var21;
        int var33;
        int var34 = var33 = class401.field5859[var20 - var18][var21 - var19];
        while (arg2 != var20 || arg11 != var21) {
            if (var33 != var34) {
                var33 = var34;
                class398.field5832[var38] = var20;
                class40.field562[var38++] = var21;
            }
            if ((var34 & 0x2) != 0) {
                var20++;
            } else if ((var34 & 0x8) != 0) {
                var20--;
            }
            if ((var34 & 0x1) != 0) {
                var21++;
            } else if ((var34 & 0x4) != 0) {
                var21--;
            }
            var34 = class401.field5859[var20 - var18][var21 - var19];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg7[var35] = class398.field5832[var38];
            arg3[var35++] = class40.field562[var38];
            if (arg7.length <= var35) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Lhg;")
    public final class342 method2409(byte arg0) {
        field5878++;
        class342 var2 = this.field5876.field5114;
        if (this.field5876 == var2) {
            this.field5882 = null;
            return null;
        }
        this.field5882 = var2.field5114;
        if (arg0 != 69) {
            method2412((byte) -91);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method2410(int arg0) {
        field5880++;
        while (true) {
            class342 var2 = this.field5876.field5114;
            if (this.field5876 == var2) {
                if (arg0 == 8) {
                    this.field5882 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method2095(-125);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLhg;)V")
    public final void method2411(byte arg0, class342 arg1) {
        int var3 = 76 % ((35 - arg0) / 59);
        field5884++;
        if (arg1.field5116 != null) {
            arg1.method2095(-47);
        }
        arg1.field5116 = this.field5876.field5116;
        arg1.field5114 = this.field5876;
        arg1.field5116.field5114 = arg1;
        arg1.field5114.field5116 = arg1;
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
    public static void method2412(byte arg0) {
        field5879 = null;
        if (arg0 != 54) {
            method2408(42, 1, -42, (int[]) null, -100, (class491) null, -88, (int[]) null, 116, (byte) 32, 80, 99, -9, true, -4);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Lhg;")
    public final class342 method2413(boolean arg0) {
        field5881++;
        class342 var2 = this.field5882;
        if (this.field5876 == var2) {
            this.field5882 = null;
            return null;
        }
        if (!arg0) {
            field5879 = null;
        }
        this.field5882 = var2.field5114;
        return var2;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I")
    public static final int method2414(int arg0, int arg1) {
        field5883++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == 29146) {
            return class487.method2849((byte) -29, arg1);
        } else {
            return -13;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V")
    public class403() {
        this.field5876.field5116 = this.field5876;
        this.field5876.field5114 = this.field5876;
    }
}
