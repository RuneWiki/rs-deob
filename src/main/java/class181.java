import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class181 {

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field2879;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2885 = 0;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Z")
    public static boolean field2890 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "[Z")
    public static boolean[] field2888;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lub;")
    public static final class11 method1259(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null || var3.field4056 == null ? null : var3.field4056;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
    public static final void method1260(int arg0, int arg1) {
        field2877++;
        class233 var2 = class114.method746(arg0, 1228126432, 3);
        if (arg1 != -420427184) {
            field2884 = -72;
        }
        var2.method1653(false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BI)I")
    public static final int method1261(byte arg0, int arg1) {
        if (arg0 != -62) {
            method1261((byte) 76, 71);
        }
        field2886++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZZZII)V")
    public static final void method1262(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        class282.method1886(arg4, arg0, arg2, arg3, arg1, 0, class79.field989.length - 1);
        field2878++;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIZIIIZII)V")
    public static final void method1263(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg2 - arg4;
        field2881++;
        int var14 = -1;
        if (class282.field4469 > 0) {
            if (class180.field2862 > 10) {
                var14 = (10 + 10 - class180.field2862) * 5;
            } else {
                var14 = class180.field2862 * 5;
            }
        }
        int var15 = 983040 / arg6;
        int var16 = 983040 / arg11;
        int var17 = -var16;
        if (arg9) {
            field2883 = 61;
        }
        while (var12 + var16 > var17) {
            int var19 = arg10 + (arg11 * var17) >> 16;
            int var20 = (var17 + 1) * arg11 + arg10 >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg8 + var19;
                int var23 = arg3 + var17 >> 6;
                int var10000 = arg8 + var20;
                if (var23 >= 0 && (class155.field2424.length - 1) >= var23) {
                    int[][] var25 = class155.field2424[var23];
                    for (int var26 = -var15; var26 < (var13 + var15); var26++) {
                        int var27 = arg6 * var26 + arg7 >> 16;
                        int var28 = (var26 + 1) * arg6 + arg7 >> 16;
                        int var29 = var28 - var27;
                        if (var29 > 0) {
                            int var30 = arg1 + var27;
                            var10000 = arg1 + var28;
                            int var32 = arg4 + var26 >> 6;
                            if (var32 >= 0 && (var25.length - 1) >= var32 && var25[var32] != null) {
                                int var33 = ((arg4 + var26 & 0x3F) << 6) + (arg3 + var17 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class228 var35 = class256.method1749(var34 - 1, 0);
                                    if (!class297.field4698[var35.field3695]) {
                                        if (var14 != -1 && class259.field4216 == var35.field3695) {
                                            class41 var36 = new class41();
                                            var36.field510 = var35.field3695;
                                            var36.field515 = var22;
                                            var36.field513 = var30;
                                            class231.field3842.method1803(var36, -1);
                                        } else {
                                            class143.field2255[var35.field3695].method315(var22 - 7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var17++;
        }
        for (class41 var18 = (class41) class231.field3842.method1802(43); var18 != null; var18 = (class41) class231.field3842.method1815(0)) {
            class217.method1518(var18.field515, var18.field513, 15, 16776960, var14);
            class217.method1518(var18.field515, var18.field513, 13, 16776960, var14);
            class217.method1518(var18.field515, var18.field513, 11, 16776960, var14);
            class217.method1518(var18.field515, var18.field513, 9, 16776960, var14);
            class143.field2255[var18.field510].method315(var18.field515 - 7, var18.field513 + -7);
        }
        class231.field3842.method1805(-729782270);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1264(int arg0) {
        if (arg0 <= 23) {
            field2887 = -93;
        }
        field2888 = null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class181() {
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lwi;)V")
    public class181(class181 arg0) {
        this.field2882 = arg0.field2882;
        this.field2889 = arg0.field2889;
        this.field2880 = arg0.field2880;
        this.field2879 = arg0.field2879;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "([IIIIII)V")
    public static final void method1265(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class246 var6 = class46.field585[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class59 var7 = var6.field4035;
        if (var7 != null) {
            int var8 = var7.field750;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class229 var10 = var6.field4055;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3724;
        int var12 = var10.field3725;
        int var13 = var10.field3722;
        int var14 = var10.field3718;
        int[] var15 = class200.field3173[var11];
        int[] var16 = class286.field4563[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
