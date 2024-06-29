import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class67 extends class120 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1273 = "wave:";

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lag;")
    public static class202 field1266 = new class202(new byte[5000]);

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "[I")
    public static int[] field1278 = new int[100];

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "[[I")
    public static int[][] field1274;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 7)
    public static void method513(byte arg0) {
        field1278 = null;
        if (arg0 < 7) {
            method514((class260) null, 20, -120, 39, 50, 110, 55, 61, -43, true, -74, -126, 10, (class309) null);
        }
        field1273 = null;
        field1274 = (int[][]) null;
        field1266 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIII)V", line = 23)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1269 = arg3;
        this.field1272 = arg2;
        this.field1271 = arg1;
        this.field1267 = arg0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ldn;IIIIIIIIZIIILbg;)Lbg;", line = 37)
    public static final class309 method514(class260 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, class309 arg13) {
        long var14 = ((long) arg1 << 32) + ((long) arg6 << 48) + (long) ((arg4 << 24) + (arg2 - -(arg7 << 16)));
        field1275++;
        class309 var16 = (class309) class41.field787.method1881(true, var14);
        if (var16 == null) {
            byte var17 = 3;
            byte var18;
            if (arg2 == 1) {
                var18 = 9;
            } else if (arg2 == 2) {
                var18 = 12;
            } else if (arg2 == 3) {
                var18 = 15;
            } else if (arg2 == 4) {
                var18 = 18;
            } else {
                var18 = 21;
            }
            int[] var19 = new int[] { 64, 96, 128 };
            class3 var20 = new class3(var17 * var18 + 1, var17 * var18 * 2 + -var18, 0);
            int var21 = var20.method41(0, 0, 0);
            int[][] var22 = new int[var17][var18];
            for (int var23 = 0; var23 < var17; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var18; var26++) {
                    int var27 = (var26 << 11) / var18;
                    int var28 = class284.field4395[var27] * var25 + arg10 >> 16;
                    int var29 = class284.field4398[var27] * var24 + arg5 >> 16;
                    var22[var23][var26] = var20.method41(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var17; var30++) {
                int var31 = (var30 * 256 + 128) / var17;
                int var32 = 256 - var31;
                short var33 = (short) (((arg1 & 0xFC00) * var32 + (arg6 & 0xFC00) * var31 & 0xFC0000) + ((arg1 & 0x7F) * var32 + (arg6 & 0x7F) * var31 & 0x7F00) + ((arg1 & 0x380) * var32 + (arg6 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg4 * var31 + arg7 * var32 >> 8);
                for (int var35 = 0; var35 < var18; var35++) {
                    if (var30 == 0) {
                        var20.method42(var21, var22[0][(var35 + 1) % var18], var22[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method42(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var18], var22[var30][(var35 + 1) % var18], (byte) 1, var33, var34);
                        var20.method42(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var18], var22[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method28(64, 768, -50, -10, -50);
            class41.field787.method1880(var16, var14, 51);
        }
        int var36 = arg2 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg13.method165();
        int var41 = var36;
        if (arg9) {
            if (arg8 > 128 && arg8 < 896) {
                var37 -= 128;
            }
            if (arg8 > 1152 && arg8 < 1920) {
                var39 = var36 + 128;
            }
            if (arg8 > 640 && arg8 < 1408) {
                var41 = var36 + 128;
            }
            if (arg8 > 1664 || arg8 < 384) {
                var38 -= 128;
            }
        }
        if (var40 < var37) {
            var40 = var37;
        }
        int var42 = arg13.method164();
        int var43 = arg13.method146();
        if (var43 < var38) {
            var43 = var38;
        }
        int var44 = arg13.method162();
        if (var42 > var39) {
            var42 = var39;
        }
        if (arg12 > -26) {
            return (class309) null;
        }
        if (var41 < var44) {
            var44 = var41;
        }
        class294 var45 = null;
        if (arg0 != null) {
            int var46 = arg0.field4044[arg3];
            var45 = class87.method615(0, var46 >> 16);
            arg3 = var46 & 0xFFFF;
        }
        class309 var47;
        if (var45 == null) {
            var47 = var16.method144(true, true, true);
            var47.method151((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method163((var40 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method144(!var45.method1971(126, arg3), !var45.method1970(arg3, false), true);
            var47.method151((var42 - var40) / 2, 128, (var44 - var43) / 2);
            var47.method163((var40 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method2066(var45, arg3);
        }
        if (arg8 != 0) {
            var47.method132(arg8);
        }
        if (class249.field3893) {
            class184 var48 = (class184) var47;
            if (arg11 != class325.method2250(arg5 + var43, 22771, class289.field4438, arg10 + var40) || arg11 != class325.method2250(arg5 + var44, 22771, class289.field4438, arg10 + var42)) {
                for (int var49 = 0; var49 < var48.field2947; var49++) {
                    var48.field2948[var49] += class325.method2250(var48.field2954[var49] + arg5, 22771, class289.field4438, var48.field2955[var49] + arg10) - arg11;
                }
                var48.field2941.field3470 = false;
                var48.field2963.field244 = false;
            }
        } else {
            class20 var50 = (class20) var47;
            if (arg11 != class325.method2250(arg5 + var43, 22771, class289.field4438, arg10 + var40) || class325.method2250(arg5 + var44, 22771, class289.field4438, arg10 + var42) != arg11) {
                for (int var51 = 0; var51 < var50.field368; var51++) {
                    var50.field393[var51] += class325.method2250(var50.field349[var51] + arg5, 22771, class289.field4438, var50.field359[var51] + arg10) - arg11;
                }
                var50.field375 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIZ)V", line = 262)
    public final void method292(int arg0, int arg1, boolean arg2) {
        field1277++;
        int var4 = this.field1267 * arg1 >> 12;
        int var5 = this.field1272 * arg1 >> 12;
        int var6 = this.field1271 * arg0 >> 12;
        int var7 = this.field1269 * arg0 >> 12;
        class335.method2310(this.field2086, var4, this.field2084, var7, 90, var5, var6, this.field2085);
        if (arg2) {
            this.field1269 = 63;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIZ)V", line = 281)
    public final void method293(int arg0, int arg1, boolean arg2) {
        field1270++;
        int var4 = this.field1267 * arg1 >> 12;
        int var5 = this.field1272 * arg1 >> 12;
        if (arg2) {
            this.method292(-67, -7, false);
        }
        int var6 = this.field1271 * arg0 >> 12;
        int var7 = this.field1269 * arg0 >> 12;
        class337.method2338(var4, this.field2086, var7, -1, var6, var5);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 303)
    public final void method290(int arg0, int arg1, int arg2) {
        field1268++;
        if (arg0 >= -46) {
            this.field1267 = 43;
        }
        int var4 = this.field1267 * arg1 >> 12;
        int var5 = this.field1272 * arg1 >> 12;
        int var6 = this.field1271 * arg2 >> 12;
        int var7 = this.field1269 * arg2 >> 12;
        class290.method1954(this.field2085, var7, -2, var5, var6, var4, this.field2084);
    }
}
