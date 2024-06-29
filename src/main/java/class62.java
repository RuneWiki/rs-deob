import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class62 extends class317 {

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    private final int field967;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    private final int field963;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    private final int field953;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    private final int field966;

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    private final int field954;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "I")
    private final int field957;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    private final int field960;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    private final int field965;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "[I")
    public static int[] field968 = new int[5];

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "Lqb;")
    public static class209 field955 = new class209(64);

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static volatile int field969 = -1;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "[Ldc;")
    public static class71[] field959;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)I", line = 8)
    public static final int method420(byte arg0, int arg1) {
        int var2 = 83 / ((arg0 - 47) / 47);
        field952++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)V", line = 24)
    public final void method421(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field962++;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(III)V", line = 37)
    public final void method422(int arg0, int arg1, int arg2) {
        field956++;
        int var4 = this.field957 * arg0 >> 12;
        if (arg2 != 4) {
            this.method424(4, 69, 65);
        }
        int var5 = this.field966 * arg0 >> 12;
        int var6 = this.field967 * arg1 >> 12;
        int var7 = this.field953 * arg1 >> 12;
        int var8 = this.field963 * arg0 >> 12;
        int var9 = this.field965 * arg1 >> 12;
        int var10 = this.field960 * arg0 >> 12;
        int var11 = this.field954 * arg1 >> 12;
        class35.method275(var5, var7, this.field5345, var6, var11, var4, var10, var8, var9, arg2 ^ 0xF846C288);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 69)
    public static void method423(int arg0) {
        field968 = null;
        field955 = null;
        if (arg0 > -100) {
            method423(111);
        }
        field959 = null;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)V", line = 85)
    public final void method424(int arg0, int arg1, int arg2) {
        field964++;
        if (arg2 != 50) {
            method420((byte) 94, 6);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIZIBI)Z", line = 106)
    public static final boolean method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, byte arg10, int arg11) {
        field961++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class206.field3484[var12][var13] = 0;
                class72.field1150[var12][var13] = 99999999;
            }
        }
        class206.field3484[arg9][arg0] = 99;
        int var14 = arg0;
        class72.field1150[arg9][arg0] = 0;
        int var15 = arg9;
        if (arg10 != -127) {
            return true;
        }
        byte var16 = 0;
        class112.field2033[var16] = arg9;
        int var17 = 0;
        int var32 = var16 + 1;
        class250.field4180[var16] = arg0;
        int[][] var18 = class267.field4473[class157.field2765].field3061;
        boolean var19 = false;
        while (var32 != var17) {
            var14 = class250.field4180[var17];
            var15 = class112.field2033[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg3 == var15 && arg7 == var14) {
                var19 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class267.field4473[class157.field2765].method1352(arg2, arg3, 1, arg4 - 1, arg7, var14, 1, var15)) {
                    var19 = true;
                    break;
                }
                if (arg4 < 10 && class267.field4473[class157.field2765].method1354(arg4 - 1, arg3, arg7, var15, var14, arg10 ^ 0xFFFFFF01, 1, arg2)) {
                    var19 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg11 != 0 && class267.field4473[class157.field2765].method1366(arg11, arg5, 1, var14, arg6, arg7, (byte) -113, var15, arg3)) {
                var19 = true;
                break;
            }
            int var20 = class72.field1150[var15][var14] + 1;
            if (var15 > 0 && class206.field3484[var15 - 1][var14] == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 - 1][var14] = 2;
                class72.field1150[var15 - 1][var14] = var20;
            }
            if (var15 < 103 && class206.field3484[var15 + 1][var14] == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14;
                class206.field3484[var15 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class72.field1150[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class206.field3484[var15][var14 - 1] == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class112.field2033[var32] = var15;
                class250.field4180[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15][var14 - 1] = 1;
                class72.field1150[var15][var14 - 1] = var20;
            }
            if (var14 < 103 && class206.field3484[var15][var14 + 1] == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class112.field2033[var32] = var15;
                class250.field4180[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15][var14 + 1] = 4;
                class72.field1150[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class206.field3484[var15 - 1][var14 - 1] == 0 && (var18[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14 - 1;
                class206.field3484[var15 - 1][var14 - 1] = 3;
                class72.field1150[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && var14 > 0 && class206.field3484[var15 + 1][var14 - 1] == 0 && (var18[var15 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0 && (var18[var15][var14 - 1] & 0x12C0102) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14 - 1;
                class206.field3484[var15 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class72.field1150[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 103 && class206.field3484[var15 - 1][var14 + 1] == 0 && (var18[var15 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var15 - 1][var14] & 0x12C0108) == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 - 1][var14 + 1] = 6;
                class72.field1150[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 103 && var14 < 103 && class206.field3484[var15 + 1][var14 + 1] == 0 && (var18[var15 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var15 + 1][var14] & 0x12C0180) == 0 && (var18[var15][var14 + 1] & 0x12C0120) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 + 1][var14 + 1] = 12;
                class72.field1150[var15 + 1][var14 + 1] = var20;
            }
        }
        class92.field1629 = 0;
        if (!var19) {
            if (!arg8) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= (arg3 + var23); var24++) {
                for (int var25 = arg7 - var23; var25 <= arg7 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class72.field1150[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (var24 < arg3) {
                            var26 = arg3 - var24;
                        } else if (var24 > (arg3 - (1 - arg5))) {
                            var26 = var24 - (arg3 + arg5 - 1);
                        }
                        if (var25 < arg7) {
                            var27 = arg7 - var25;
                        } else if (var25 > (arg7 + arg11 - 1)) {
                            var27 = var25 + 1 - arg7 - arg11;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class72.field1150[var24][var25] < var22) {
                            var22 = class72.field1150[var24][var25];
                            var21 = var28;
                            var14 = var25;
                            var15 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg9 == var15 && arg0 == var14) {
                return false;
            }
            class92.field1629 = 1;
        }
        byte var29 = 0;
        class112.field2033[var29] = var15;
        int var33 = var29 + 1;
        class250.field4180[var29] = var14;
        int var30;
        int var31 = var30 = class206.field3484[var15][var14];
        while (arg9 != var15 || arg0 != var14) {
            if (var30 != var31) {
                class112.field2033[var33] = var15;
                class250.field4180[var33++] = var14;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            var31 = class206.field3484[var15][var14];
        }
        if (var33 > 0) {
            class50.method365(-36, var33, arg1);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 390)
    public class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field967 = arg5;
        this.field963 = arg4;
        this.field953 = arg1;
        this.field966 = arg2;
        this.field954 = arg7;
        this.field957 = arg0;
        this.field960 = arg6;
        this.field965 = arg3;
    }
}
