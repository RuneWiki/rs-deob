import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class349 extends class627 {

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/lang/String;")
    public String field4523;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field4521 = -1;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "F")
    public static float field4522;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "J")
    public static long field4524;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)Lgba;")
    public static final class499 method2043(int arg0) {
        field4519++;
        if (class341.field4421 == null || class325.field4143 == null) {
            return null;
        }
        class325.field4143.method2265(class341.field4421, -2156);
        class499 var1 = (class499) class325.field4143.method2266((byte) 111);
        if (var1 == null) {
            return null;
        } else {
            int var2 = -103 % ((7 - arg0) / 44);
            class351 var3 = class341.field4406.method2765(36, var1.field7056);
            return var3 != null && var3.field4582 && var3.method2065(true, class341.field4409) ? var1 : class720.method3989(-80);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIB)V")
    public static final void method2044(int arg0, int arg1, byte arg2) {
        if (arg2 == -1) {
            class540.method3074(true, arg0, arg1);
            field4520++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lha;IIIIILrj;ILka;IIIII)Lka;")
    public static final class219 method2045(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class747 arg6, int arg7, class219 arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field4518++;
        if (arg8 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg6 != null) {
            int var15 = var14 | arg6.method4178(arg10, -1, -31599, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg1 << 32) + ((long) arg13 << 48) + (long) ((arg12 << 24) + (arg3 << 16) + arg11);
        class114 var18 = class618.field8650;
        class219 var19;
        synchronized (class618.field8650) {
            var19 = (class219) class618.field8650.method778(var16, 123);
        }
        if (var19 == null || arg0.method135(var19.method1340(), var14) != 0) {
            if (var19 != null) {
                var14 = arg0.method100(var14, var19.method1340());
            }
            byte var20;
            if (arg11 == 1) {
                var20 = 9;
            } else if (arg11 == 2) {
                var20 = 12;
            } else if (arg11 == 3) {
                var20 = 15;
            } else if (arg11 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class415 var23 = new class415((var20 * var21) + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method2456(0, 0, -19591, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class138.field1644[var30] * var27 >> 14;
                    int var32 = class138.field1645[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method2456(var32, var31, arg7 - 11512, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg3 * var35 + arg12 * var34 >> 8);
                short var37 = (short) (((arg1 & 0x7F) * var35 + (arg13 & 0x7F) * var34 & 0x7F00) + ((arg1 & 0xFC00) * var35 + (arg13 & 0xFC00) * var34 & 0xFC0000) + ((arg1 & 0x380) * var35 + (arg13 & 0x380) * var34 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method2466((short) -1, var25[0][(var38 + 1) % var20], (byte) 1, var36, -1587, var37, var25[0][var38], (byte) -1, var24);
                    } else {
                        var23.method2466((short) -1, var25[var33 - 1][(var38 + 1) % var20], (byte) 1, var36, -1587, var37, var25[var33][(var38 + 1) % var20], (byte) -1, var25[var33 - 1][var38]);
                        var23.method2466((short) -1, var25[var33][(var38 + 1) % var20], (byte) 1, var36, arg7 ^ 0x19BC, var37, var25[var33][var38], (byte) -1, var25[var33 - 1][var38]);
                    }
                }
            }
            var19 = arg0.method150(var23, var14, class646.field8902, 64, 768);
            class114 var39 = class618.field8650;
            synchronized (class618.field8650) {
                class618.field8650.method774(var16, 122, var19);
            }
        }
        if (arg7 != -8079) {
            field4522 = -0.8706574F;
        }
        int var40 = arg8.method1339();
        int var41 = arg8.method1359();
        int var42 = arg8.method1344();
        int var43 = arg8.method1355();
        class555 var44 = null;
        if (arg6 != null) {
            int var45 = arg6.field10458[arg10];
            var44 = class646.field8903.method637((byte) -124, var45 >> 16);
            arg10 = var45 & 0xFFFF;
        }
        class219 var46;
        if (var44 == null) {
            var46 = var19.method1337((byte) 3, var14, true);
            var46.method1377(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1348(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method1337((byte) 3, var14, true);
            var46.method1377(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1348(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method1374(arg10, var44, arg7 ^ 0xFFFFE014);
        }
        if (arg5 != 0) {
            var46.method1343(arg5);
        }
        if (arg2 != 0) {
            var46.method1373(arg2);
        }
        if (arg9 != 0) {
            var46.method1348(0, arg9, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(JJ)J")
    public static long method2046(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILtn;)Lfa;")
    public static final class663 method2047(int arg0, class179 arg1) {
        field4517++;
        if (arg0 != -9492) {
            return null;
        }
        class619 var2 = class505.method2921(18413, arg1);
        int var3 = arg1.method1095((byte) 115);
        int var4 = arg1.method1095((byte) 127);
        int var5 = arg1.method1107(false);
        return new class663(var2.field8672, var2.field8662, var2.field8674, var2.field8675, var2.field8673, var2.field8665, var2.field8667, var2.field8663, var2.field8669, var3, var4, var5);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
    public class349() {
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class349(String arg0, int arg1) {
        this.field4523 = arg0;
    }
}
