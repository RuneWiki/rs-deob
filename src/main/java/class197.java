import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class197 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "Leda;")
    private class14 field3389 = new class14(64);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "Lla;")
    private class422 field3387;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Lvj;")
    public static class26 field3392 = new class26(2, 2);

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Lfa;")
    public static class564 field3394 = new class564();

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILvga;IIILka;ILha;IIII)Lka;", line = 4)
    public static final class282 method1476(int arg0, int arg1, int arg2, class82 arg3, int arg4, int arg5, int arg6, class282 arg7, int arg8, class544 arg9, int arg10, int arg11, int arg12, int arg13) {
        field3386++;
        if (arg7 == null) {
            return null;
        }
        if (arg4 >= -8) {
            field3396 = 14;
        }
        int var14 = 2055;
        if (arg3 != null) {
            int var15 = var14 | arg3.method732(false, arg6, -1, 256);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg10 << 48) + ((long) arg13 << 32) + (long) ((arg12 << 24) + (arg5 << 16) + arg8);
        class14 var18 = class599.field8488;
        class282 var19;
        synchronized (class599.field8488) {
            var19 = (class282) class599.field8488.method80((byte) -84, var16);
        }
        if (var19 == null || arg9.method351(var19.method1044(), var14) != 0) {
            if (var19 != null) {
                var14 = arg9.method273(var14, var19.method1044());
            }
            byte var20;
            if (arg8 == 1) {
                var20 = 9;
            } else if (arg8 == 2) {
                var20 = 12;
            } else if (arg8 == 3) {
                var20 = 15;
            } else if (arg8 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class352 var23 = new class352(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method2239(0, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class582.field8226[var30] * var27 >> 14;
                    int var32 = class582.field8230[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method2239(var32, var31, 0, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg5 * var35 + arg12 * var34 >> 8);
                short var37 = (short) (((arg10 & 0x7F) * var34 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg10 & 0x380) * var34 + (arg13 & 0x380) * var35 & 0x38000) + ((arg10 & 0xFC00) * var34 + (arg13 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method2243(var37, var25[0][var38], true, var24, var25[0][(var38 + 1) % var20], (byte) 1, var36, (byte) -1, (short) -1);
                    } else {
                        var23.method2243(var37, var25[var33][(var38 + 1) % var20], true, var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20], (byte) 1, var36, (byte) -1, (short) -1);
                        var23.method2243(var37, var25[var33][var38], true, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], (byte) 1, var36, (byte) -1, (short) -1);
                    }
                }
            }
            var19 = arg9.method301(var23, var14, class182.field3080, 64, 768);
            class14 var39 = class599.field8488;
            synchronized (class599.field8488) {
                class599.field8488.method67(var16, var19, -6772);
            }
        }
        int var40 = arg7.method1008();
        int var41 = arg7.method1024();
        int var42 = arg7.method996();
        int var43 = arg7.method1003();
        class249 var44 = null;
        if (arg3 != null) {
            int var45 = arg3.field1197[arg6];
            var44 = class83.field1219.method2350(var45 >> 16, true);
            arg6 = var45 & 0xFFFF;
        }
        class282 var46;
        if (var44 == null) {
            var46 = var19.method1025((byte) 3, var14, true);
            var46.method998(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1047(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method1025((byte) 3, var14, true);
            var46.method998(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method1047(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method1859(var44, arg6, (byte) 112);
        }
        if (arg11 != 0) {
            var46.method1042(arg11);
        }
        if (arg1 != 0) {
            var46.method1049(arg1);
        }
        if (arg0 != 0) {
            var46.method1047(0, arg0, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILaca;)V", line = 179)
    public static final void method1477(int arg0, class216 arg1) {
        if (arg0 != 11327) {
            return;
        }
        arg1.field3562 = false;
        if (arg1.field3561 != null) {
            arg1.field3561.field6418 = 0;
        }
        field3395++;
        for (class216 var2 = arg1.method532(); var2 != null; var2 = arg1.method531()) {
            method1477(11327, var2);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 205)
    public static void method1478(byte arg0) {
        field3392 = null;
        int var1 = -15 % ((arg0 - 32) / 39);
        field3394 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLii;ZB)V", line = 219)
    public static final void method1479(boolean arg0, class520 arg1, boolean arg2, byte arg3) {
        field3391++;
        int var4 = arg1.field7511;
        int var5 = (int) arg1.field1039;
        arg1.method636((byte) 97);
        if (arg0) {
            class135.method1085((byte) -13, var4);
        }
        class200.method1494(var4, 1960982448);
        if (arg3 != 37) {
            return;
        }
        class353 var6 = class65.method638(var5, 1668949296);
        if (var6 != null) {
            class717.method3960(var6, (byte) 39);
        }
        class377.method2381(arg3 ^ 0xFFFFFF94);
        if (!arg2 && class673.field9523 != -1) {
            class101.method834(false, 1, class673.field9523);
        }
        class84 var7 = new class84(class36.field340);
        for (class520 var8 = (class520) var7.method751((byte) 52); var8 != null; var8 = (class520) var7.method750(arg3 ^ 0xC)) {
            if (!var8.method637((byte) 115)) {
                var8 = (class520) var7.method751((byte) 65);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field7515 == 3) {
                int var9 = (int) var8.field1039;
                if ((var9 >>> 16) == var4) {
                    method1479(true, var8, arg2, (byte) 37);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lma;", line = 277)
    public final class707 method1480(int arg0, int arg1) {
        field3390++;
        class14 var3 = this.field3389;
        class707 var4;
        synchronized (this.field3389) {
            var4 = (class707) this.field3389.method80((byte) -34, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3387;
        byte[] var6;
        synchronized (this.field3387) {
            var6 = this.field3387.method2624(0, 19, arg0);
        }
        class707 var7 = new class707();
        if (arg1 >= -89) {
            method1479(true, null, false, (byte) 127);
        }
        if (var6 != null) {
            var7.method3920(new class301(var6), true);
        }
        class14 var8 = this.field3389;
        synchronized (this.field3389) {
            this.field3389.method67((long) arg0, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lcr;ILla;)V", line = 317)
    public class197(class292 arg0, int arg1, class422 arg2) {
        this.field3387 = arg2;
        this.field3393 = this.field3387.method2615(0, 19);
    }
}
