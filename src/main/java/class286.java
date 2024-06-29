import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class286 {

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field4521 = 0;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field4523 = 0;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lhk;")
    public static class319 field4519 = null;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lek;I)V", line = 32)
    public static final void method2014(class196 arg0, int arg1) {
        field4520++;
        for (class197 var2 = (class197) class287.field4526.method1807((byte) 105); var2 != null; var2 = (class197) class287.field4526.method1808(18051)) {
            if (var2.field3244 == arg0) {
                if (var2.field3232 != null) {
                    class107.field1622.method739(var2.field3232);
                    var2.field3232 = null;
                }
                var2.method465((byte) -122);
                return;
            }
        }
        if (arg1 >= -67) {
            method2016((class61) null, 95, 50, 67, 16, 10, 75, false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method2015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        int var6 = arg4;
        int var7 = -1;
        field4518++;
        if (arg1 != -3741) {
            method2015(-82, -113, 39, 95, -123);
        }
        int var8 = -arg4;
        class245.method1738(48, class310.field4841[arg2], arg0 + arg4, -arg4 + arg0, arg3);
        while (var6 > var5) {
            var7 += 2;
            var8 += var7;
            var5++;
            if (var8 >= 0) {
                var6--;
                int[] var9 = class310.field4841[arg2 + var6];
                var8 -= var6 << 1;
                int[] var10 = class310.field4841[arg2 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class245.method1738(48, var9, var11, var12, arg3);
                class245.method1738(48, var10, var11, var12, arg3);
            }
            int var13 = arg0 - var6;
            int var14 = arg0 + var6;
            int[] var15 = class310.field4841[arg2 + var5];
            int[] var16 = class310.field4841[arg2 - var5];
            class245.method1738(48, var15, var14, var13, arg3);
            class245.method1738(48, var16, var14, var13, arg3);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbj;IIIIIIZ)V", line = 137)
    public static final void method2016(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field801.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field801[var9] - class88.field1347;
            int var11 = arg0.field814[var9] - class189.field3081;
            int var12 = arg0.field806[var9] - class2.field15;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field807 != null) {
                class61.field796[var9] = var13;
                class61.field802[var9] = var16;
                class61.field809[var9] = var17;
            }
            class61.field797[var9] = (var13 << 9) / var17 + class25.field369;
            class61.field793[var9] = (var16 << 9) / var17 + class25.field358;
        }
        class25.field370 = 0;
        int var19 = arg0.field799.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field799[var20];
            int var22 = arg0.field794[var20];
            int var23 = arg0.field810[var20];
            int var24 = class61.field797[var21];
            int var25 = class61.field797[var22];
            int var26 = class61.field797[var23];
            int var27 = class61.field793[var21];
            int var28 = class61.field793[var22];
            int var29 = class61.field793[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class88.field1323 && class300.method2093(class25.field369 + class239.field3787, class25.field358 + class114.field1720, var27, var28, var29, var24, var25, var26)) {
                    class209.field3412 = arg5;
                    class48.field664 = arg6;
                }
                if (!class186.field2991 && !arg7) {
                    class25.field371 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class25.field363 || var25 > class25.field363 || var26 > class25.field363) {
                        class25.field371 = true;
                    }
                    if (arg0.field807 == null || arg0.field807[var20] == -1) {
                        if (arg0.field804[var20] != 12345678) {
                            class25.method175(var27, var28, var29, var24, var25, var26, arg0.field804[var20], arg0.field805[var20], arg0.field800[var20]);
                        }
                    } else if (!class226.field3598) {
                        int var30 = class25.field365.method376((byte) -128, arg0.field807[var20]);
                        class25.method175(var27, var28, var29, var24, var25, var26, class248.method1758(var30, arg0.field804[var20]), class248.method1758(var30, arg0.field805[var20]), class248.method1758(var30, arg0.field800[var20]));
                    } else if (arg0.field803) {
                        class25.method168(var27, var28, var29, var24, var25, var26, arg0.field804[var20], arg0.field805[var20], arg0.field800[var20], class61.field796[0], class61.field796[1], class61.field796[3], class61.field802[0], class61.field802[1], class61.field802[3], class61.field809[0], class61.field809[1], class61.field809[3], arg0.field807[var20]);
                    } else {
                        class25.method168(var27, var28, var29, var24, var25, var26, arg0.field804[var20], arg0.field805[var20], arg0.field800[var20], class61.field796[var21], class61.field796[var22], class61.field796[var23], class61.field802[var21], class61.field802[var22], class61.field802[var23], class61.field809[var21], class61.field809[var22], class61.field809[var23], arg0.field807[var20]);
                    }
                }
            }
        }
    }
}
