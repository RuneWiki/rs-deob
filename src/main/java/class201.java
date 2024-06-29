import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class201 {

    @OriginalMember(owner = "client!rfa", name = "c", descriptor = "F")
    public static float field2912 = 0.0F;

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "Lej;")
    public static class124 field2911 = new class124(41, -1);

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lej;")
    public static class124 field2916 = new class124(46, 2);

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "Lwb;")
    public static class331 field2917 = new class331(0, -1);

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "[I")
    public static int[] field2919 = new int[4096];

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "Lmu;")
    public static class303 field2918 = new class303(94, -1);

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method1410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class544.method3143((byte) 118, arg3);
        field2910++;
        int var7 = 0;
        int var8 = arg3 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg1 >= class58.field1150 && arg1 <= class479.field6682) {
            int[] var14 = class691.field9345[arg1];
            int var15 = class486.method2865(class536.field7419, arg6 - arg3, class140.field2314, -104);
            int var16 = class486.method2865(class536.field7419, arg6 + arg3, class140.field2314, arg4 - 94);
            int var17 = class486.method2865(class536.field7419, arg6 - var8, class140.field2314, -82);
            int var18 = class486.method2865(class536.field7419, arg6 + var8, class140.field2314, -96);
            class47.method550(-27, var17, var14, var15, arg0);
            class47.method550(-27, var18, var14, var17, arg2);
            class47.method550(-27, var16, var14, var18, arg0);
        }
        int var19 = -1;
        while (var9 > var7) {
            var13 += 2;
            var19 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class665.field9082[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg1 - var9;
                int var21 = arg1 + var9;
                if (var21 >= class58.field1150 && class479.field6682 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class486.method2865(class536.field7419, arg6 + var7, class140.field2314, arg4 ^ 0x36);
                        int var23 = class486.method2865(class536.field7419, arg6 - var7, class140.field2314, 112);
                        if (class479.field6682 >= var21) {
                            class47.method550(-27, var22, class691.field9345[var21], var23, arg0);
                        }
                        if (var20 >= class58.field1150) {
                            class47.method550(-27, var22, class691.field9345[var20], var23, arg0);
                        }
                    } else {
                        int var24 = class665.field9082[var9];
                        int var25 = class486.method2865(class536.field7419, arg6 + var7, class140.field2314, -123);
                        int var26 = class486.method2865(class536.field7419, arg6 - var7, class140.field2314, 110);
                        int var27 = class486.method2865(class536.field7419, arg6 + var24, class140.field2314, 85);
                        int var28 = class486.method2865(class536.field7419, arg6 - var24, class140.field2314, 84);
                        if (var21 <= class479.field6682) {
                            int[] var29 = class691.field9345[var21];
                            class47.method550(-27, var28, var29, var26, arg0);
                            class47.method550(-27, var27, var29, var28, arg2);
                            class47.method550(-27, var25, var29, var27, arg0);
                        }
                        if (class58.field1150 <= var20) {
                            int[] var30 = class691.field9345[var20];
                            class47.method550(-27, var28, var30, var26, arg0);
                            class47.method550(-27, var27, var30, var28, arg2);
                            class47.method550(-27, var25, var30, var27, arg0);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class58.field1150 && var31 <= class479.field6682) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (class140.field2314 <= var33 && var34 <= class536.field7419) {
                    int var35 = class486.method2865(class536.field7419, var33, class140.field2314, 102);
                    int var36 = class486.method2865(class536.field7419, var34, class140.field2314, -100);
                    if (var8 <= var7) {
                        if (var32 <= class479.field6682) {
                            class47.method550(-27, var35, class691.field9345[var32], var36, arg0);
                        }
                        if (class58.field1150 <= var31) {
                            class47.method550(-27, var35, class691.field9345[var31], var36, arg0);
                        }
                    } else {
                        int var37 = var11 < var7 ? class665.field9082[var7] : var11;
                        int var38 = class486.method2865(class536.field7419, arg6 + var37, class140.field2314, 71);
                        int var39 = class486.method2865(class536.field7419, arg6 - var37, class140.field2314, 65);
                        if (var32 <= class479.field6682) {
                            int[] var40 = class691.field9345[var32];
                            class47.method550(-27, var39, var40, var36, arg0);
                            class47.method550(-27, var38, var40, var39, arg2);
                            class47.method550(-27, var35, var40, var38, arg0);
                        }
                        if (var31 >= class58.field1150) {
                            int[] var41 = class691.field9345[var31];
                            class47.method550(arg4 - 29, var39, var41, var36, arg0);
                            class47.method550(-27, var38, var41, var39, arg2);
                            class47.method550(-27, var35, var41, var38, arg0);
                        }
                    }
                }
            }
        }
        if (arg4 != 2) {
            method1411(79);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 197)
    public static void method1411(int arg0) {
        field2919 = null;
        field2917 = null;
        field2916 = null;
        field2918 = null;
        if (arg0 != 16384) {
            method1410(-23, 118, -17, -52, 33, 108, 2);
        }
        field2911 = null;
    }
}
