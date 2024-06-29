import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class676 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Z")
    public static boolean field9282 = false;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[I")
    public static int[] field9277 = new int[8];

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[[I")
    public static int[][] field9280;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    public static void method3807(boolean arg0) {
        if (arg0) {
            field9277 = null;
        }
        field9280 = null;
        field9277 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIILka;ILfs;Lha;IIIIIII)Lka;")
    public static final class498 method3808(int arg0, int arg1, int arg2, class498 arg3, int arg4, class582 arg5, class66 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field9278++;
        if (arg3 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg5 != null) {
            int var15 = var14 | arg5.method3352(-1, false, arg7, true);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg4 << 48) + ((long) arg13 << 32) + (long) ((arg8 << 24) + (arg2 << 16) + arg12);
        class288 var18 = class374.field4698;
        class498 var19;
        synchronized (class374.field4698) {
            var19 = (class498) class374.field4698.method1684(var16, arg1 ^ 0x47C6);
        }
        if (var19 == null || arg6.method620(var19.method396(), var14) != 0) {
            if (var19 != null) {
                var14 = arg6.method632(var14, var19.method396());
            }
            byte var20;
            if (arg12 == 1) {
                var20 = 9;
            } else if (arg12 == 2) {
                var20 = 12;
            } else if (arg12 == 3) {
                var20 = 15;
            } else if (arg12 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class496 var23 = new class496((var20 * var21) + 1, var20 * 2 * var21 - var20, 0);
            int var24 = var23.method2925(0, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class789.field10868[var30] * var27 >> 14;
                    int var32 = class789.field10864[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method2925(0, var31, 0, var32);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg2 * var35 + arg8 * var34 >> 8);
                short var37 = (short) (((arg4 & 0x7F) * var34 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg4 & 0xFC00) * var34 + (arg13 & 0xFC00) * var35 & 0xFC0000) + ((arg4 & 0x380) * var34 + (arg13 & 0x380) * var35 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method2922((byte) -1, (short) -1, var25[0][(var38 + 1) % var20], var25[0][var38], (byte) 92, (byte) 1, var36, var24, var37);
                    } else {
                        var23.method2922((byte) -1, (short) -1, var25[var33 - 1][(var38 + 1) % var20], var25[var33][(var38 + 1) % var20], (byte) 92, (byte) 1, var36, var25[var33 - 1][var38], var37);
                        var23.method2922((byte) -1, (short) -1, var25[var33][(var38 + 1) % var20], var25[var33][var38], (byte) 92, (byte) 1, var36, var25[var33 - 1][var38], var37);
                    }
                }
            }
            var19 = arg6.method567(var23, var14, class35.field532, 64, 768);
            class288 var39 = class374.field4698;
            synchronized (class374.field4698) {
                class374.field4698.method1686(-25638, var16, var19);
            }
        }
        int var40 = arg3.method381();
        int var41 = arg3.method383();
        if (arg1 != -18081) {
            method3808(94, 105, 80, null, -23, null, null, 121, 36, -126, 16, 101, -54, -56);
        }
        int var42 = arg3.method361();
        int var43 = arg3.method393();
        class338 var44 = null;
        if (arg5 != null) {
            int var45 = arg5.field7955[arg7];
            var44 = class362.field4504.method3602(var45 >> 16, (byte) -101);
            arg7 = var45 & 0xFFFF;
        }
        class498 var46;
        if (var44 == null) {
            var46 = var19.method364((byte) 3, var14, true);
            var46.method357(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method377(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method364((byte) 3, var14, true);
            var46.method357(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method377(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2941(var44, arg7, (byte) 17);
        }
        if (arg11 != 0) {
            var46.method398(arg11);
        }
        if (arg9 != 0) {
            var46.method353(arg9);
        }
        if (arg0 != 0) {
            var46.method377(0, arg0, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
    public static final void method3809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9281++;
        if (class118.field1503.field10666.method1581(arg5) != 0 && arg3 != 0 && class707.field9936 < 50 && arg1 != -1) {
            class415.field5422[class707.field9936++] = new class228((byte) 1, arg1, arg3, arg0, arg4, 0, arg2, null);
        }
    }
}
