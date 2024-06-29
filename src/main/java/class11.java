import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "J")
    public static long field196 = 0L;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[I")
    public static int[] field205 = new int[5];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "[Z")
    public static boolean[] field202 = new boolean[200];

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    public static int field208 = 0;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[S")
    public static short[] field197;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 21)
    public static void method132(int arg0) {
        field197 = null;
        field202 = null;
        field205 = null;
        if (arg0 < 115) {
            field196 = 91L;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljk;IIIIIIZ)V", line = 33)
    public static final void method133(class289 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4440.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field4440[var9] - class261.field4103;
            int var11 = arg0.field4450[var9] - class311.field4849;
            int var12 = arg0.field4461[var9] - class206.field3276;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field4446 != null) {
                class289.field4442[var9] = var13;
                class289.field4460[var9] = var16;
                class289.field4452[var9] = var17;
            }
            class289.field4441[var9] = (var13 << 9) / var17 + class31.field457;
            class289.field4456[var9] = (var16 << 9) / var17 + class31.field455;
        }
        class31.field460 = 0;
        int var19 = arg0.field4447.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field4447[var20];
            int var22 = arg0.field4455[var20];
            int var23 = arg0.field4459[var20];
            int var24 = class289.field4441[var21];
            int var25 = class289.field4441[var22];
            int var26 = class289.field4441[var23];
            int var27 = class289.field4456[var21];
            int var28 = class289.field4456[var22];
            int var29 = class289.field4456[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class181.field2938 && class48.method366(class31.field457 + class284.field4404, class32.field481 + class31.field455, var27, var28, var29, var24, var25, var26)) {
                    class120.field1664 = arg5;
                    class132.field1949 = arg6;
                }
                if (!class109.field1458 && !arg7) {
                    class31.field456 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class31.field468 || var25 > class31.field468 || var26 > class31.field468) {
                        class31.field456 = true;
                    }
                    if (arg0.field4446 == null || arg0.field4446[var20] == -1) {
                        if (arg0.field4457[var20] != 12345678) {
                            class31.method283(var27, var28, var29, var24, var25, var26, arg0.field4457[var20], arg0.field4451[var20], arg0.field4454[var20]);
                        }
                    } else if (!class14.field240) {
                        int var30 = class31.field466.method458(17701, arg0.field4446[var20]);
                        class31.method283(var27, var28, var29, var24, var25, var26, class187.method1379(var30, arg0.field4457[var20]), class187.method1379(var30, arg0.field4451[var20]), class187.method1379(var30, arg0.field4454[var20]));
                    } else if (arg0.field4445) {
                        class31.method289(var27, var28, var29, var24, var25, var26, arg0.field4457[var20], arg0.field4451[var20], arg0.field4454[var20], class289.field4442[0], class289.field4442[1], class289.field4442[3], class289.field4460[0], class289.field4460[1], class289.field4460[3], class289.field4452[0], class289.field4452[1], class289.field4452[3], arg0.field4446[var20]);
                    } else {
                        class31.method289(var27, var28, var29, var24, var25, var26, arg0.field4457[var20], arg0.field4451[var20], arg0.field4454[var20], class289.field4442[var21], class289.field4442[var22], class289.field4442[var23], class289.field4460[var21], class289.field4460[var22], class289.field4460[var23], class289.field4452[var21], class289.field4452[var22], class289.field4452[var23], arg0.field4446[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 152)
    public static final void method134(int arg0) {
        if (arg0 != 15088) {
            field205 = (int[]) null;
        }
        field207++;
        class198.field3165.method1359(78);
    }
}
