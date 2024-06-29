import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class422 extends class448 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[Len;")
    public class109[] field6013;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lgr;")
    public static class530 field6015 = new class530(10, 2);

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
    public static final void method2584(boolean arg0, int arg1) {
        class193.field2837 = arg1;
        field6016++;
        class100.field1440.method2220(false);
        if (!arg0) {
            method2587(true, null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lha;IIIIIIIIILka;IILvo;)Lka;")
    public static final class282 method2585(class543 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class282 arg10, int arg11, int arg12, class131 arg13) {
        field6017++;
        if (arg10 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg13 != null) {
            int var15 = var14 | arg13.method924(-103, -1, false, arg9);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg2 << 32) + (long) ((arg8 << 16) + (arg1 << 24) + arg12) + ((long) arg5 << 48);
        class348 var18 = class11.field100;
        class282 var19;
        synchronized (class11.field100) {
            var19 = (class282) class11.field100.method2216(0, var16);
        }
        if (var19 == null || arg0.method300(var19.method528(), var14) != 0) {
            if (var19 != null) {
                var14 = arg0.method374(var14, var19.method528());
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
            class637 var23 = new class637(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method3661((byte) 89, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class125.field1736[var30] * var27 >> 14;
                    int var32 = class125.field1729[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method3661((byte) 89, 0, var31, var32);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg1 * var34 + arg8 * var35 >> 8);
                short var37 = (short) (((arg2 & 0x7F) * var35 + (arg5 & 0x7F) * var34 & 0x7F00) + ((arg2 & 0x380) * var35 + (arg5 & 0x380) * var34 & 0x38000) + ((arg2 & 0xFC00) * var35 + (arg5 & 0xFC00) * var34 & 0xFC0000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method3670((byte) 1, var36, (byte) 82, (short) -1, var37, var24, (byte) -1, var25[0][var38], var25[0][(var38 + 1) % var20]);
                    } else {
                        var23.method3670((byte) 1, var36, (byte) 119, (short) -1, var37, var25[var33 - 1][var38], (byte) -1, var25[var33][(var38 + 1) % var20], var25[var33 - 1][(var38 + 1) % var20]);
                        var23.method3670((byte) 1, var36, (byte) 96, (short) -1, var37, var25[var33 - 1][var38], (byte) -1, var25[var33][var38], var25[var33][(var38 + 1) % var20]);
                    }
                }
            }
            var19 = arg0.method404(var23, var14, class4.field30, 64, 768);
            class348 var39 = class11.field100;
            synchronized (class11.field100) {
                class11.field100.method2213((byte) -16, var16, var19);
            }
        }
        int var40 = arg10.method539();
        int var41 = arg10.method522();
        int var42 = arg10.method534();
        int var43 = arg10.method519();
        if (arg7 != 96) {
            method2586(19);
        }
        class700 var44 = null;
        if (arg13 != null) {
            int var45 = arg13.field1792[arg9];
            var44 = class610.field8698.method3005(var45 >> 16, 14344);
            arg9 = var45 & 0xFFFF;
        }
        class282 var46;
        if (var44 == null) {
            var46 = var19.method509((byte) 3, var14, true);
            var46.method518(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method529(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method509((byte) 3, var14, true);
            var46.method518(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method529(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method1806(arg9, var44, 0);
        }
        if (arg4 != 0) {
            var46.method500(arg4);
        }
        if (arg6 != 0) {
            var46.method488(arg6);
        }
        if (arg3 != 0) {
            var46.method529(0, arg3, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
    public static void method2586(int arg0) {
        field6015 = null;
        if (arg0 > -95) {
            method2587(true, null);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[B)Z")
    public static final boolean method2587(boolean arg0, byte[] arg1) {
        field6014++;
        class479 var2 = new class479(arg1);
        int var3 = var2.method2886(true);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method2886(!arg0) == 1;
        if (var4) {
            class234.method1635(-113, var2);
        }
        class122.method864(var2, (byte) 127);
        if (arg0) {
            method2587(false, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "([Len;)V")
    public class422(class109[] arg0) {
        this.field6013 = arg0;
    }
}
