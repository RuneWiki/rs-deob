import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class97 {

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Z")
    public static volatile boolean field1314 = false;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method765(int arg0, int arg1) {
        class51 var2 = class159.field2043;
        synchronized (class159.field2043) {
            class159.field2043.method379(arg0, false);
        }
        if (arg1 != 1) {
            return;
        }
        field1311++;
        class51 var3 = class379.field5550;
        synchronized (class379.field5550) {
            class379.field5550.method379(arg0, false);
        }
        class51 var4 = class289.field4328;
        synchronized (class289.field4328) {
            class289.field4328.method379(arg0, false);
        }
        class51 var5 = class192.field2677;
        synchronized (class192.field2677) {
            class192.field2677.method379(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILsj;II)V")
    public static final void method766(int arg0, class248 arg1, int arg2, int arg3) {
        class169.field2290 = arg1;
        class384.field5624 = arg2;
        field1313++;
        if (arg0 < 94) {
            field1314 = true;
        }
        class27.field468 = arg3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII[I[IIIIIIIZLao;)I")
    public static final int method767(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, boolean arg13, class280 arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class189.field2643[var15][var36] = 0;
                class87.field1204[var15][var36] = 99999999;
            }
        }
        field1312++;
        boolean var16;
        if (arg11 == 1) {
            var16 = class348.method2303(arg2, arg14, arg9, arg4, arg8, arg1, arg3, arg7, 1, arg12, arg10);
        } else if (arg11 == 2) {
            var16 = class33.method253(arg12, arg2, arg10, arg4, arg3, arg9, true, arg8, arg14, arg7, arg1);
        } else {
            var16 = class278.method1825(arg9, 128, arg14, arg4, arg10, arg2, arg3, arg7, arg1, arg12, arg8, arg11);
        }
        int var17 = arg1 - 64;
        int var18 = arg9 - 64;
        int var19 = class57.field862;
        int var20 = class355.field5262;
        if (!var16) {
            if (!arg13) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg4 - var23; var24 <= arg4 + var23; var24++) {
                for (int var25 = arg2 - var23; var25 <= arg2 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class87.field1204[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg4 > var24) {
                            var28 = arg4 - var24;
                        } else if (arg7 + arg4 - 1 < var24) {
                            var28 = var24 + 1 - arg4 - arg7;
                        }
                        int var29 = 0;
                        if (var25 < arg2) {
                            var29 = arg2 - var25;
                        } else if (arg2 + arg3 - 1 < var25) {
                            var29 = -arg3 - arg2 - (-1 - var25);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && var22 > class87.field1204[var26][var27]) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class87.field1204[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg9 == var20) {
            return 0;
        }
        byte var31 = 0;
        class87.field1205[var31] = var19;
        int var38 = var31 + 1;
        class132.field1726[var31] = var20;
        int var32 = 123 % ((-arg0 - 48) / 53);
        int var33;
        int var34 = var33 = class189.field2643[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg9 != var20) {
            if (var33 != var34) {
                class87.field1205[var38] = var19;
                var33 = var34;
                class132.field1726[var38++] = var20;
            }
            if ((var34 & 0x1) != 0) {
                var20++;
            } else if ((var34 & 0x4) != 0) {
                var20--;
            }
            if ((var34 & 0x2) != 0) {
                var19++;
            } else if ((var34 & 0x8) != 0) {
                var19--;
            }
            var34 = class189.field2643[var19 - var17][var20 - var18];
        }
        int var35 = 0;
        while ((var38--) > 0) {
            arg5[var35] = class87.field1205[var38];
            arg6[var35++] = class132.field1726[var38];
            if (var35 >= arg5.length) {
                break;
            }
        }
        return var35;
    }
}
