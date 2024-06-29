import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class149 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILvh;B)Lda;")
    public static final class197 method1030(int arg0, int arg1, class108 arg2, byte arg3) {
        int var4 = -27 % ((82 - arg3) / 32);
        field2510++;
        return class127.method876(arg1, arg2, arg0, -8635) ? class6.method30(-121) : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZILwg;ZZIIB)Lcj;")
    public static final class74 method1031(int arg0, boolean arg1, int arg2, class23 arg3, boolean arg4, boolean arg5, int arg6, int arg7, byte arg8) {
        class199 var9 = class203.method1346(-1, arg2);
        if (arg6 > 1 && var9.field3269 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg6 >= var9.field3220[var11] && var9.field3220[var11] != 0) {
                    var10 = var9.field3269[var11];
                }
            }
            if (var10 != -1) {
                var9 = class203.method1346(-1, var10);
            }
        }
        if (arg8 != -45) {
            return null;
        }
        class18 var12 = var9.method1323((byte) -97, arg3);
        field2512++;
        if (var12 == null) {
            return null;
        }
        class197 var13 = null;
        if (var9.field3284 != -1) {
            var13 = (class197) method1031(1, true, var9.field3257, arg3, false, true, 10, 0, (byte) -45);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3238 != -1) {
            var13 = (class197) method1031(arg0, false, var9.field3243, arg3, false, true, arg6, arg7, (byte) -45);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class283.field4490;
        int var15 = class283.field4488;
        int var16 = class283.field4491;
        int[] var17 = new int[4];
        class283.method1837(var17);
        class197 var18 = new class197(36, 32);
        class283.method1860(var18.field3189, 36, 32);
        class287.method1936();
        class287.method1939(16, 16);
        class287.field4570 = false;
        int var19 = var9.field3267;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class287.field4567[var9.field3241] * var19 >> 16;
        int var21 = class287.field4562[var9.field3241] * var19 >> 16;
        var12.method101(0, var9.field3262, var9.field3235, var9.field3241, var9.field3253, var20 + var9.field3210 - (var12.method110() / 2), var9.field3210 + var21, -1L);
        if (arg0 >= 1) {
            var18.method1313(1);
            if (arg0 >= 2) {
                var18.method1313(16777215);
            }
            class283.method1860(var18.field3189, 36, 32);
        }
        if (arg7 != 0) {
            var18.method1304(arg7);
        }
        if (var9.field3284 != -1) {
            var13.method447(0, 0);
        } else if (var9.field3238 != -1) {
            class283.method1860(var13.field3189, 36, 32);
            var18.method447(0, 0);
            var18 = var13;
        }
        if (arg4 && (var9.field3218 == 1 || arg6 != 1) && arg6 != -1) {
            class114.field2049.method1626(class33.method222(arg6, -12096), 0, 9, 16776960, 1);
        }
        class283.method1860(var14, var16, var15);
        class283.method1847(var17);
        class287.method1936();
        class287.field4570 = true;
        return var18;
    }
}
