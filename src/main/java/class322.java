import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class322 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lwf;")
    public static class306 field5020;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIII)V", line = 8)
    public static final void method2178(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field5024 = 119;
        }
        if (arg4 > arg1) {
            for (int var5 = arg1; var5 < arg4; var5++) {
                class175.field2675[var5][arg2] = arg3;
            }
        } else {
            for (int var6 = arg4; var6 < arg1; var6++) {
                class175.field2675[var6][arg2] = arg3;
            }
        }
        field5019++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(FIIZIIIZ)[I", line = 47)
    public static final int[] method2179(float arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field5022++;
        int[] var8 = new int[arg4];
        class190 var9 = new class190();
        var9.field2900 = arg5;
        if (arg7) {
            method2178(true, -127, 42, -1, -87);
        }
        var9.field2882 = (int) (arg0 * 4096.0F);
        var9.field2897 = arg1;
        var9.field2880 = arg3;
        var9.field2885 = arg6;
        var9.field2898 = arg2;
        var9.method349(1);
        class269.method1782(0, arg4, 1);
        var9.method1305(var8, 0, 1);
        return var8;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjh;ZII)V", line = 77)
    public static final void method2180(int arg0, class207 arg1, boolean arg2, int arg3, int arg4) {
        field5021++;
        int var5 = arg1.field3169;
        if (arg1.field3158 == 0) {
            arg1.field3169 = arg1.field3264;
        } else if (arg1.field3158 == 1) {
            arg1.field3169 = arg4 - arg1.field3264;
        } else if (arg1.field3158 == 2) {
            arg1.field3169 = arg1.field3264 * arg4 >> 14;
        } else if (arg1.field3158 == 3) {
            if (arg1.field3273 == 2) {
                arg1.field3169 = arg1.field3264 * 32 + ((arg1.field3264 - 1) * arg1.field3134);
            } else if (arg1.field3273 == 7) {
                arg1.field3169 = (arg1.field3264 - 1) * arg1.field3134 + arg1.field3264 * 115;
            }
        }
        int var6 = arg1.field3239;
        if (arg1.field3161 == 0) {
            arg1.field3239 = arg1.field3132;
        } else if (arg1.field3161 == 1) {
            arg1.field3239 = arg0 - arg1.field3132;
        } else if (arg1.field3161 == 2) {
            arg1.field3239 = arg1.field3132 * arg0 >> 14;
        } else if (arg1.field3161 == 3) {
            if (arg1.field3273 == 2) {
                arg1.field3239 = (arg1.field3132 - 1) * arg1.field3217 + arg1.field3132 * 32;
            } else if (arg1.field3273 == 7) {
                arg1.field3239 = (arg1.field3132 - 1) * arg1.field3217 + arg1.field3132 * 12;
            }
        }
        if (arg1.field3158 == 4) {
            arg1.field3169 = arg1.field3239 * arg1.field3214 / arg1.field3277;
        }
        if (arg1.field3161 == 4) {
            arg1.field3239 = arg1.field3277 * arg1.field3169 / arg1.field3214;
        }
        if (arg3 != 5) {
            return;
        }
        if (class269.field4149 && (client.method888(arg1).field1664 != 0 || arg1.field3273 == 0)) {
            if (arg1.field3239 < 5 && arg1.field3169 < 5) {
                arg1.field3239 = 5;
                arg1.field3169 = 5;
            } else {
                if (arg1.field3169 <= 0) {
                    arg1.field3169 = 5;
                }
                if (arg1.field3239 <= 0) {
                    arg1.field3239 = 5;
                }
            }
        }
        if (arg1.field3149 == 1337) {
            class162.field2509 = arg1;
        }
        if (arg2 && arg1.field3130 != null && (arg1.field3169 != var5 || arg1.field3239 != var6)) {
            class120 var7 = new class120();
            var7.field1837 = arg1.field3130;
            var7.field1845 = arg1;
            class101.field1569.method7((byte) -51, var7);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V", line = 182)
    public static void method2181(byte arg0) {
        int var1 = 124 % ((20 - arg0) / 36);
        field5020 = null;
    }
}
