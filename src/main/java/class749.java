import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class749 extends class659 {

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "Leha;")
    public class98 field10087;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Led;")
    public static class732 field10085 = new class732(6, 0, 4, 2);

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field10092 = 0;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "F")
    public static float field10091;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field10083;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field10084;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "Lpm;")
    public static class609 field10088;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "[B")
    public static byte[] field10090;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)V")
    public static void method4092(byte arg0) {
        field10088 = null;
        field10085 = null;
        field10090 = null;
        if (arg0 <= 105) {
            method4093((byte) -56, 68);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)V")
    public static final void method4093(byte arg0, int arg1) {
        field10083++;
        if (arg0 != -62) {
            method4093((byte) 100, 7);
        }
        class778 var2 = class389.method2406(arg0 ^ 0x52, (long) arg1, 5);
        var2.method4276(arg0 ^ 0xFFFFFFC2);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10082++;
        if (arg5 > -58) {
            field10091 = -1.2201834F;
        }
        if (class297.field4199 <= arg1 && class45.field472 >= arg6 && arg0 >= class291.field4156 && arg2 <= class233.field3099) {
            class551.method3173(arg4, arg3, 0, arg6, arg7, arg0, arg2, arg1);
        } else {
            class230.method1450((byte) 96, arg6, arg7, arg0, arg4, arg2, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Leha;)V")
    public class749(class98 arg0) {
        this.field10087 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILha;Lmu;IIIIIILka;IIII)Lka;")
    public static final class497 method4095(int arg0, class66 arg1, class317 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class497 arg9, int arg10, int arg11, int arg12, int arg13) {
        field10084++;
        if (arg9 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg2 != null) {
            int var15 = var14 | arg2.method2024(65535, false, -1, arg12);
            var14 = var15 & 0xFFFFFDFF;
        }
        if (arg6 != 127) {
            field10089 = 60;
        }
        long var16 = ((long) arg10 << 32) + (long) ((arg5 << 16) + arg3 + (arg4 << 24)) + ((long) arg13 << 48);
        class535 var18 = class645.field8686;
        class497 var19;
        synchronized (class645.field8686) {
            var19 = (class497) class645.field8686.method3109((byte) 100, var16);
        }
        if (var19 == null || arg1.method520(var19.method260(), var14) != 0) {
            if (var19 != null) {
                var14 = arg1.method473(var14, var19.method260());
            }
            byte var20;
            if (arg3 == 1) {
                var20 = 9;
            } else if (arg3 == 2) {
                var20 = 12;
            } else if (arg3 == 3) {
                var20 = 15;
            } else if (arg3 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class625 var23 = new class625(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method3456(0, true, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class110.field1524[var30] * var27 >> 14;
                    int var32 = class110.field1523[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method3456(var32, true, 0, var31);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg4 * var34 + arg5 * var35 >> 8);
                short var37 = (short) (((arg10 & 0x380) * var35 + (arg13 & 0x380) * var34 & 0x38000) + ((arg10 & 0x7F) * var35 + (arg13 & 0x7F) * var34 & 0x7F00) + ((arg10 & 0xFC00) * var35 + (arg13 & 0xFC00) * var34 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method3449((byte) -1, (byte) 1, var36, (short) -1, 9, var37, var24, var25[0][var38], var25[0][(var38 + 1) % var20]);
                    } else {
                        var23.method3449((byte) -1, (byte) 1, var36, (short) -1, 9, var37, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], var25[var33 - 1][(var38 + 1) % var20]);
                        var23.method3449((byte) -1, (byte) 1, var36, (short) -1, 9, var37, var25[var33 - 1][var38], var25[var33][var38], var25[var33][(var38 + 1) % var20]);
                    }
                }
            }
            var19 = arg1.method484(var23, var14, class30.field293, 64, 768);
            class535 var39 = class645.field8686;
            synchronized (class645.field8686) {
                class645.field8686.method3108(var16, arg6 ^ 0x3FAE, var19);
            }
        }
        int var40 = arg9.method252();
        int var41 = arg9.method250();
        int var42 = arg9.method246();
        int var43 = arg9.method273();
        class236 var44 = null;
        if (arg2 != null) {
            int var45 = arg2.field4493[arg12];
            var44 = class693.field9223.method2381((byte) 95, var45 >> 16);
            arg12 = var45 & 0xFFFF;
        }
        class497 var46;
        if (var44 == null) {
            var46 = var19.method271((byte) 3, var14, true);
            var46.method294(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method266(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method271((byte) 3, var14, true);
            var46.method294(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method266(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2921(var44, arg12, (byte) 13);
        }
        if (arg11 != 0) {
            var46.method293(arg11);
        }
        if (arg7 != 0) {
            var46.method290(arg7);
        }
        if (arg8 != 0) {
            var46.method266(0, arg8, 0);
        }
        return var46;
    }
}
