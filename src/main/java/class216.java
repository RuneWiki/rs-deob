import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class216 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lc;")
    public static class99 field3049 = new class99(8);

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field3052 = 1;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIBIZI)V", line = 7)
    public static final void method1449(int arg0, int arg1, byte arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        field3051++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg2 <= 22) {
            return;
        }
        int var7 = (class109.field1343 - class183.field2510) * var6 / 100 + class183.field2510;
        if (class441.field6321 > var7) {
            var7 = class441.field6321;
        } else if (class389.field5501 < var7) {
            var7 = class389.field5501;
        }
        int var8 = arg5 * var7 * 512 / (arg0 * 334);
        if (class403.field5779 > var8) {
            short var9 = class403.field5779;
            var7 = arg0 * var9 * 334 / (arg5 * 512);
            if (class389.field5501 < var7) {
                var7 = class389.field5501;
                int var10 = var7 * 512 * arg5 / (var9 * 334);
                int var11 = (arg0 - var10) / 2;
                if (arg4) {
                    class151.field1873.method624();
                    class151.field1873.method827(arg3, arg1, arg5, -99, var11, -16777216);
                    class151.field1873.method827(arg3, arg0 + arg1 - var11, arg5, -90, var11, -16777216);
                }
                arg0 -= var11 * 2;
                arg1 += var11;
            }
        } else if (class374.field5258 < var8) {
            short var12 = class374.field5258;
            var7 = arg0 * 334 * var12 / (arg5 * 512);
            if (class441.field6321 > var7) {
                var7 = class441.field6321;
                int var13 = arg0 * 334 * var12 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg4) {
                    class151.field1873.method624();
                    class151.field1873.method827(arg3, arg1, var14, -121, arg0, -16777216);
                    class151.field1873.method827(arg3 + arg5 - var14, arg1, var14, -118, arg0, -16777216);
                }
                arg3 += var14;
                arg5 -= var14 * 2;
            }
        }
        class42.field516 = (short) arg5;
        class153.field1891 = (short) arg0;
        class339.field4815 = arg5 * var7 / 334;
        class408.field5880 = arg3;
        class380.field5345 = arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 103)
    public static void method1450(int arg0) {
        if (arg0 > 42) {
            field3049 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZ)V", line = 115)
    public static final void method1451(int arg0, boolean arg1) {
        field3048++;
        byte[][] var2;
        if (arg1) {
            var2 = class109.field1346;
        } else {
            var2 = class212.field3019;
        }
        int var3 = class193.field2798.length;
        if (arg0 != 28175) {
            method1450(-56);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class33.field380[var4] >> 8) * 64 - class114.field1403;
                int var7 = (class33.field380[var4] & 0xFF) * 64 - class41.field496;
                class356.method2270(false);
                class338.method2174(class151.field1873, var6, (byte) -117, arg1, var7, var5, class102.field1247);
            }
        }
    }
}
