import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class259 extends class208 {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[B")
    public byte[] field4396;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lwl;")
    public static class81 field4392 = new class81(100);

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[I")
    public static int[] field4398 = new int[2048];

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lve;")
    public static class255 field4399 = class87.method607(108, "weiss:");

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Z")
    public static boolean field4395 = false;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public static int[] field4397;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIIIII)V", line = 13)
    public static final void method1801(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
            for (int var7 = arg1; var7 <= (arg1 + arg2); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class122.field2037[arg5][var7][var6] = 127;
                }
            }
        }
        for (int var8 = arg4; var8 < arg3 + arg4; var8++) {
            for (int var9 = arg1; var9 < (arg1 + arg2); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class106.field1783[arg5][var9][var8] = arg5 <= 0 ? 0 : class106.field1783[arg5 - 1][var9][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < 104) {
            for (int var10 = arg4 + 1; var10 < arg3 + arg4; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class106.field1783[arg5][arg1][var10] = class106.field1783[arg5][arg1 - 1][var10];
                }
            }
        }
        if (arg0 > -48) {
            field4397 = (int[]) null;
        }
        field4400++;
        if (arg4 > 0 && arg4 < 104) {
            for (int var11 = arg1 + 1; var11 < arg1 + arg2; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class106.field1783[arg5][var11][arg4] = class106.field1783[arg5][var11][arg4 - 1];
                }
            }
        }
        if (arg1 < 0 || arg4 < 0 || arg1 >= 104 || arg4 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg1 > 0 && class106.field1783[arg5][arg1 - 1][arg4] != 0) {
                class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1 - 1][arg4];
            } else if (arg4 > 0 && class106.field1783[arg5][arg1][arg4 - 1] != 0) {
                class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1][arg4 - 1];
            } else if (arg1 > 0 && arg4 > 0 && class106.field1783[arg5][arg1 - 1][arg4 - 1] != 0) {
                class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1 - 1][arg4 - 1];
            }
        } else if (arg1 > 0 && class106.field1783[arg5][arg1 - 1][arg4] != class106.field1783[arg5 - 1][arg1 - 1][arg4]) {
            class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1 - 1][arg4];
        } else if (arg4 > 0 && class106.field1783[arg5][arg1][arg4 - 1] != class106.field1783[arg5 - 1][arg1][arg4 - 1]) {
            class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1][arg4 - 1];
        } else if (arg1 > 0 && arg4 > 0 && class106.field1783[arg5][arg1 - 1][arg4 - 1] != class106.field1783[arg5 - 1][arg1 - 1][arg4 - 1]) {
            class106.field1783[arg5][arg1][arg4] = class106.field1783[arg5][arg1 - 1][arg4 - 1];
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIII)Z", line = 129)
    public static final boolean method1802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class274.field4699 * arg0 + class213.field3632 * arg3 >> 16;
        int var6 = class274.field4699 * arg3 - class213.field3632 * arg0 >> 16;
        int var7 = class288.field4960 * arg1 + class183.field2952 * var6 >> 16;
        int var8 = class183.field2952 * arg1 - class288.field4960 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class288.field4960 * arg2 + class183.field2952 * var6 >> 16;
        int var12 = class183.field2952 * arg2 - class288.field4960 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class298.field5095 && var13 < class298.field5095) {
            return false;
        } else if (var9 > class261.field4430 && var13 > class261.field4430) {
            return false;
        } else if (var10 < class95.field1637 && var14 < class95.field1637) {
            return false;
        } else {
            return var10 <= class295.field5067 || var14 <= class295.field5067;
        }
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 178)
    public static void method1803(int arg0) {
        int var1 = 96 / ((arg0 + 55) / 32);
        field4392 = null;
        field4399 = null;
        field4398 = null;
        field4397 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZ)Z", line = 191)
    public static final boolean method1804(int arg0, boolean arg1) {
        if (arg1) {
            field4398 = (int[]) null;
        }
        field4394++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V", line = 207)
    public static final void method1805(byte arg0) {
        field4391++;
        class123.method911(5, (byte) 104);
        class29.method161((byte) 116, 5);
        class314.method2169(false, 5);
        class103.method793(5, 255);
        class213.method1526(5, -24);
        class262.method1828(16777215, 5);
        if (arg0 > -3) {
            return;
        }
        class162.method1170(5, 114);
        class129.method953(5, -129);
        class195.method1396(5, -111);
        class130.method959((byte) -57, 5);
        class116.method883(5, -97);
        class104.method800(50, (byte) -12);
        class143.method1064(5, (byte) 83);
        class53.method322(true, 5);
        class53.field820.method562((byte) 46, 5);
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B)V", line = 241)
    public class259(byte[] arg0) {
        this.field4396 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V", line = 257)
    public static final void method1806(int arg0, int arg1, int arg2) {
        class53 var3 = class303.method2112(-1155040160, arg1, arg0);
        var3.method325((byte) 114);
        var3.field824 = arg2;
        field4393++;
    }
}
