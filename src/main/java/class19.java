import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class19 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "J")
    public long field263 = 0L;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "[B")
    public static byte[] field268 = new byte[32896];

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "[I")
    public static int[] field270;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
    public static int[] field271;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "Z")
    public static boolean field274;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field258;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field260;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field261;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lh;")
    public class232 field259;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "Lh;")
    public class232 field272;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 5)
    public static void method121(int arg0) {
        field268 = null;
        field270 = null;
        field271 = null;
        if (arg0 >= -103) {
            field270 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILh;IJ)Z", line = 25)
    public static final boolean method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class232 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class161.method1121(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILkb;)V", line = 46)
    public static final void method123(int arg0, class39 arg1) {
        field266++;
        class148.field2210 = arg1;
        if (arg0 >= -1) {
            field273 = -79;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field268[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field270 = new int[500];
        field271 = new int[256];
        field273 = 0;
        field274 = false;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIILlf;IIIIZIILv;)Llf;", line = 83)
    public static final class134 method124(int arg0, int arg1, int arg2, int arg3, int arg4, class134 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12, class80 arg13) {
        field262++;
        long var14 = ((long) arg2 << 48) + ((long) arg8 << 32) + (long) ((arg9 << 16) + (arg11 << 24) + arg12);
        class134 var16 = (class134) class138.field2067.method1619(var14, 114);
        if (var16 == null) {
            byte var17 = 3;
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19;
            if (arg12 == 1) {
                var19 = 9;
            } else if (arg12 == 2) {
                var19 = 12;
            } else if (arg12 == 3) {
                var19 = 15;
            } else if (arg12 == 4) {
                var19 = 18;
            } else {
                var19 = 21;
            }
            int[][] var20 = new int[var17][var19];
            class259 var21 = new class259(var17 * var19 + 1, var17 * var19 * 2 - var19, 0);
            int var22 = var21.method1837(0, 0, 0);
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var19; var26++) {
                    int var27 = (var26 << 11) / var19;
                    int var28 = class25.field355[var27] * var25 + arg4 >> 16;
                    int var29 = class25.field359[var27] * var24 + arg6 >> 16;
                    var20[var23][var26] = var21.method1837(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg9 * var32 + arg11 * var31 >> 8);
                short var34 = (short) (((arg2 & 0x7F) * var31 + (arg8 & 0x7F) * var32 & 0x7F00) + ((arg2 & 0xFC00) * var31 + (arg8 & 0xFC00) * var32 & 0xFC0000) + ((arg2 & 0x380) * var31 + (arg8 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var19; var35++) {
                    if (var30 == 0) {
                        var21.method1836(var22, var20[0][(var35 + 1) % var19], var20[0][var35], (byte) 1, var34, var33);
                    } else {
                        var21.method1836(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var19], var20[var30][(var35 + 1) % var19], (byte) 1, var34, var33);
                        var21.method1836(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var19], var20[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var21.method1855(64, 768, -50, -10, -50);
            class138.field2067.method1621(var14, 77, var16);
        }
        int var36 = arg12 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        if (arg7 <= 26) {
            field270 = (int[]) null;
        }
        int var40 = var36;
        int var41 = arg5.method525();
        if (arg10) {
            if (arg1 > 640 && arg1 < 1408) {
                var40 = var36 + 128;
            }
            if (arg1 > 1152 && arg1 < 1920) {
                var39 = var36 + 128;
            }
            if (arg1 > 1664 || arg1 < 384) {
                var37 -= 128;
            }
            if (arg1 > 128 && arg1 < 896) {
                var38 -= 128;
            }
        }
        if (var38 > var41) {
            var41 = var38;
        }
        int var42 = arg5.method535();
        if (var39 < var42) {
            var42 = var39;
        }
        int var43 = arg5.method513();
        if (var37 > var43) {
            var43 = var37;
        }
        class90 var44 = null;
        int var45 = arg5.method505();
        if (arg13 != null) {
            int var46 = arg13.field1209[arg0];
            var44 = class7.method50(128, var46 >> 16);
            arg0 = var46 & 0xFFFF;
        }
        if (var45 > var40) {
            var45 = var40;
        }
        class134 var47;
        if (var44 == null) {
            var47 = var16.method507(true, true, true);
            var47.method531((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method519((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method507(!var44.method649(arg0, 15869), !var44.method650(1, arg0), true);
            var47.method531((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method519((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method915(var44, arg0);
        }
        if (arg1 != 0) {
            var47.method530(arg1);
        }
        if (class186.field2991) {
            class75 var50 = (class75) var47;
            if (class227.method1653(arg4 + var41, arg6 + var43, -12282, class148.field2209) != arg3 || class227.method1653(arg4 + var42, arg6 + var45, -12282, class148.field2209) != arg3) {
                for (int var51 = 0; var51 < var50.field1021; var51++) {
                    var50.field1010[var51] += class227.method1653(var50.field1006[var51] + arg4, var50.field1024[var51] - -arg6, -12282, class148.field2209) - arg3;
                }
                var50.field1041.field4391 = false;
                var50.field1011.field1236 = false;
            }
        } else {
            class76 var48 = (class76) var47;
            if (arg3 != class227.method1653(arg4 + var41, arg6 + var43, -12282, class148.field2209) || class227.method1653(arg4 + var42, arg6 + var45, -12282, class148.field2209) != arg3) {
                for (int var49 = 0; var49 < var48.field1074; var49++) {
                    var48.field1109[var49] += class227.method1653(var48.field1078[var49] + arg4, var48.field1095[var49] + arg6, -12282, class148.field2209) - arg3;
                }
                var48.field1086 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V", line = 311)
    public static final void method125(int arg0) {
        if (arg0 < 108) {
            field268 = (byte[]) null;
        }
        field264++;
        class35.field474.method1615(59);
        class225.field3576.method1615(78);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)Lul;", line = 329)
    public static final class49 method126(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        return var3 == null || var3.field3675 == null ? null : var3.field3675;
    }
}
