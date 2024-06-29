import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class18 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field327 = 0;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lth;")
    public static class55 field329 = new class55();

    @OriginalMember(owner = "client!k", name = "j", descriptor = "Ljava/lang/String;")
    public static String field332 = "Drop";

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lbm;")
    public static class307 field330;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[I")
    public static int[] field328;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[I")
    public static int[] field334;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Z")
    public static boolean[] field326;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 21)
    public static void method125(int arg0) {
        field334 = null;
        field330 = null;
        field328 = null;
        field332 = null;
        field326 = null;
        field329 = null;
        if (arg0 != 0) {
            field332 = (String) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lbc;IIIIIIZ)V", line = 36)
    public static final void method126(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field147.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field147[var9] - class56.field1113;
            int var11 = arg0.field142[var9] - class344.field5347;
            int var12 = arg0.field148[var9] - class303.field4606;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field155 != null) {
                class7.field159[var9] = var13;
                class7.field145[var9] = var16;
                class7.field152[var9] = var17;
            }
            class7.field144[var9] = (var13 << 9) / var17 + class284.field4396;
            class7.field154[var9] = (var16 << 9) / var17 + class284.field4401;
        }
        class284.field4391 = 0;
        int var19 = arg0.field158.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field158[var20];
            int var22 = arg0.field143[var20];
            int var23 = arg0.field151[var20];
            int var24 = class7.field144[var21];
            int var25 = class7.field144[var22];
            int var26 = class7.field144[var23];
            int var27 = class7.field154[var21];
            int var28 = class7.field154[var22];
            int var29 = class7.field154[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class70.field1477 && class151.method985(class284.field4396 + class150.field2456, class8.field183 + class284.field4401, var27, var28, var29, var24, var25, var26)) {
                    class305.field4619 = arg5;
                    class4.field105 = arg6;
                }
                if (!class249.field3893 && !arg7) {
                    class284.field4400 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class284.field4390 || var25 > class284.field4390 || var26 > class284.field4390) {
                        class284.field4400 = true;
                    }
                    if (arg0.field155 == null || arg0.field155[var20] == -1) {
                        if (arg0.field140[var20] != 12345678) {
                            class284.method1913(var27, var28, var29, var24, var25, var26, arg0.field140[var20], arg0.field156[var20], arg0.field149[var20]);
                        }
                    } else if (!class157.field2572) {
                        int var30 = class284.field4393.method388(arg0.field155[var20], true);
                        class284.method1913(var27, var28, var29, var24, var25, var26, class187.method1193(var30, arg0.field140[var20]), class187.method1193(var30, arg0.field156[var20]), class187.method1193(var30, arg0.field149[var20]));
                    } else if (arg0.field157) {
                        class284.method1911(var27, var28, var29, var24, var25, var26, arg0.field140[var20], arg0.field156[var20], arg0.field149[var20], class7.field159[0], class7.field159[1], class7.field159[3], class7.field145[0], class7.field145[1], class7.field145[3], class7.field152[0], class7.field152[1], class7.field152[3], arg0.field155[var20]);
                    } else {
                        class284.method1911(var27, var28, var29, var24, var25, var26, arg0.field140[var20], arg0.field156[var20], arg0.field149[var20], class7.field159[var21], class7.field159[var22], class7.field159[var23], class7.field145[var21], class7.field145[var22], class7.field145[var23], class7.field152[var21], class7.field152[var22], class7.field152[var23], arg0.field155[var20]);
                    }
                }
            }
        }
    }
}
