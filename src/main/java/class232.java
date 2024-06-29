import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class232 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Lhia;")
    public static class66 field3385;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([J[IIII)V")
    public static final void method1547(long[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field3386++;
        if (arg2 <= 61) {
            method1548((byte) -89);
        }
        if (arg4 >= arg3) {
            return;
        }
        int var5 = (arg3 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg3];
        arg0[arg3] = var7;
        int var9 = arg1[var5];
        arg1[var5] = arg1[arg3];
        arg1[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg3; var11++) {
            if (var7 + ((long) (var11 & var10)) > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg1[var11];
                arg1[var11] = arg1[var6];
                arg1[var6++] = var14;
            }
        }
        arg0[arg3] = arg0[var6];
        arg0[var6] = var7;
        arg1[arg3] = arg1[var6];
        arg1[var6] = var9;
        method1547(arg0, arg1, 111, var6 - 1, arg4);
        method1547(arg0, arg1, 126, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method1548(byte arg0) {
        if (arg0 > -1) {
            field3385 = null;
        }
        field3385 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method1549(int arg0) {
        field3387++;
        if (class233.field3400 == 5) {
            class233.field3400 = 6;
            if (arg0 != 619) {
                method1550(-70, -118, 26, 8, -14, 31, 25);
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3388++;
        class413.method2619(arg6, (byte) -102);
        int var7 = arg3;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg2 >= class166.field2622 && class432.field6446 >= arg2) {
            int[] var15 = class664.field9322[arg2];
            int var16 = class462.method2818(class391.field5895, class497.field7073, arg5 - arg6, 8373);
            int var17 = class462.method2818(class391.field5895, class497.field7073, arg5 + arg6, arg3 + 8373);
            int var18 = class462.method2818(class391.field5895, class497.field7073, arg5 - var8, 8373);
            int var19 = class462.method2818(class391.field5895, class497.field7073, arg5 + var8, 8373);
            class238.method1577(arg1, var15, var18, var16, (byte) 125);
            class238.method1577(arg4, var15, var19, var18, (byte) 120);
            class238.method1577(arg1, var15, var17, var19, (byte) 122);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class201.field3016[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (class166.field2622 <= var21 && var20 <= class432.field6446) {
                    if (var8 > var9) {
                        int var22 = class201.field3016[var9];
                        int var23 = class462.method2818(class391.field5895, class497.field7073, arg5 + var7, 8373);
                        int var24 = class462.method2818(class391.field5895, class497.field7073, arg5 - var7, 8373);
                        int var25 = class462.method2818(class391.field5895, class497.field7073, arg5 + var22, arg3 ^ 0x20B5);
                        int var26 = class462.method2818(class391.field5895, class497.field7073, arg5 - var22, 8373);
                        if (class432.field6446 >= var21) {
                            int[] var27 = class664.field9322[var21];
                            class238.method1577(arg1, var27, var26, var24, (byte) 120);
                            class238.method1577(arg4, var27, var25, var26, (byte) 121);
                            class238.method1577(arg1, var27, var23, var25, (byte) 15);
                        }
                        if (class166.field2622 <= var20) {
                            int[] var28 = class664.field9322[var20];
                            class238.method1577(arg1, var28, var26, var24, (byte) -125);
                            class238.method1577(arg4, var28, var25, var26, (byte) -104);
                            class238.method1577(arg1, var28, var23, var25, (byte) 0);
                        }
                    } else {
                        int var29 = class462.method2818(class391.field5895, class497.field7073, arg5 + var7, 8373);
                        int var30 = class462.method2818(class391.field5895, class497.field7073, arg5 - var7, 8373);
                        if (var21 <= class432.field6446) {
                            class238.method1577(arg1, class664.field9322[var21], var29, var30, (byte) 126);
                        }
                        if (var20 >= class166.field2622) {
                            class238.method1577(arg1, class664.field9322[var20], var29, var30, (byte) -109);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class166.field2622 && class432.field6446 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (var33 >= class497.field7073 && class391.field5895 >= var34) {
                    int var35 = class462.method2818(class391.field5895, class497.field7073, var33, arg3 + 8373);
                    int var36 = class462.method2818(class391.field5895, class497.field7073, var34, 8373);
                    if (var8 > var7) {
                        int var37 = var11 >= var7 ? var11 : class201.field3016[var7];
                        int var38 = class462.method2818(class391.field5895, class497.field7073, arg5 + var37, 8373);
                        int var39 = class462.method2818(class391.field5895, class497.field7073, arg5 - var37, arg3 + 8373);
                        if (var32 <= class432.field6446) {
                            int[] var40 = class664.field9322[var32];
                            class238.method1577(arg1, var40, var39, var36, (byte) 125);
                            class238.method1577(arg4, var40, var38, var39, (byte) 3);
                            class238.method1577(arg1, var40, var35, var38, (byte) -94);
                        }
                        if (var31 >= class166.field2622) {
                            int[] var41 = class664.field9322[var31];
                            class238.method1577(arg1, var41, var39, var36, (byte) -90);
                            class238.method1577(arg4, var41, var38, var39, (byte) 120);
                            class238.method1577(arg1, var41, var35, var38, (byte) -108);
                        }
                    } else {
                        if (class432.field6446 >= var32) {
                            class238.method1577(arg1, class664.field9322[var32], var35, var36, (byte) -75);
                        }
                        if (class166.field2622 <= var31) {
                            class238.method1577(arg1, class664.field9322[var31], var35, var36, (byte) 21);
                        }
                    }
                }
            }
        }
    }
}
