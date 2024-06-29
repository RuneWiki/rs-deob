import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class713 extends class583 {

    @OriginalMember(owner = "client!nea", name = "q", descriptor = "D")
    public double field9909;

    @OriginalMember(owner = "client!nea", name = "t", descriptor = "[[S")
    public short[][] field9912;

    @OriginalMember(owner = "client!nea", name = "v", descriptor = "Z")
    public static boolean field9914 = false;

    @OriginalMember(owner = "client!nea", name = "w", descriptor = "Lvl;")
    public static class13 field9915 = new class13("WTQA", 2);

    @OriginalMember(owner = "client!nea", name = "r", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!nea", name = "s", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!nea", name = "c", descriptor = "(B)V")
    public static void method4010(byte arg0) {
        if (arg0 == -75) {
            field9915 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(Ljb;I)Ljava/lang/String;")
    public static final String method4011(class493 arg0, int arg1) {
        field9911++;
        if (client.method1950(arg0).method2855(false) == 0) {
            return null;
        } else if (arg0.field7099 == null || arg0.field7099.trim().length() == 0) {
            return class600.field8422 ? "Hidden-use" : null;
        } else {
            if (arg1 != -10402) {
                field9914 = false;
            }
            return arg0.field7099;
        }
    }

    @OriginalMember(owner = "client!nea", name = "d", descriptor = "(B)J")
    public final long method4012(byte arg0) {
        if (arg0 == -6) {
            field9913++;
            return (long) (this.field9912.length << 0 | this.field9912[0].length);
        } else {
            return -31L;
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IIIIILha;ILka;IIIILmga;I)Lka;")
    public static final class471 method4013(int arg0, int arg1, int arg2, int arg3, int arg4, class58 arg5, int arg6, class471 arg7, int arg8, int arg9, int arg10, int arg11, class709 arg12, int arg13) {
        field9910++;
        if (arg7 == null) {
            return null;
        }
        int var14 = 2055;
        if (arg12 != null) {
            int var15 = var14 | arg12.method3980(-1, arg6 ^ 0x5015, false, arg11);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg8 << 32) + ((long) arg10 << 48) + (long) ((arg0 << 16) + (arg4 << 24) + arg9);
        if (arg6 != 21525) {
            return null;
        }
        class714 var18 = class689.field9415;
        class471 var19;
        synchronized (class689.field9415) {
            var19 = (class471) class689.field9415.method4022(var16, (byte) -114);
        }
        if (var19 == null || arg5.method466(var19.method228(), var14) != 0) {
            if (var19 != null) {
                var14 = arg5.method479(var14, var19.method228());
            }
            byte var20;
            if (arg9 == 1) {
                var20 = 9;
            } else if (arg9 == 2) {
                var20 = 12;
            } else if (arg9 == 3) {
                var20 = 15;
            } else if (arg9 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class6 var23 = new class6(var20 * var21 + 1, var20 * var21 * 2 + -var20, 0);
            int var24 = var23.method31(true, 0, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class164.field2258[var30] * var27 >> 14;
                    int var32 = class164.field2252[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method31(true, var32, var31, 0);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg0 * var35 + arg4 * var34 >> 8);
                short var37 = (short) (((arg8 & 0x7F) * var35 + (arg10 & 0x7F) * var34 & 0x7F00) + ((arg8 & 0xFC00) * var35 + (arg10 & 0xFC00) * var34 & 0xFC0000) + ((arg8 & 0x380) * var35 + (arg10 & 0x380) * var34 & 0x38000) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method40(var25[0][var38], var36, (short) -1, var37, (byte) 1, (byte) -1, var24, var25[0][(var38 + 1) % var20], -10373);
                    } else {
                        var23.method40(var25[var33][(var38 + 1) % var20], var36, (short) -1, var37, (byte) 1, (byte) -1, var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20], arg6 - 31898);
                        var23.method40(var25[var33][var38], var36, (short) -1, var37, (byte) 1, (byte) -1, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], -10373);
                    }
                }
            }
            var19 = arg5.method397(var23, var14, class180.field2411, 64, 768);
            class714 var39 = class689.field9415;
            synchronized (class689.field9415) {
                class689.field9415.method4018((byte) 124, var19, var16);
            }
        }
        int var40 = arg7.method234();
        int var41 = arg7.method259();
        int var42 = arg7.method260();
        int var43 = arg7.method245();
        class494 var44 = null;
        if (arg12 != null) {
            int var45 = arg12.field9826[arg11];
            var44 = class343.field4785.method3521(17, var45 >> 16);
            arg11 = var45 & 0xFFFF;
        }
        class471 var46;
        if (var44 == null) {
            var46 = var19.method226((byte) 3, var14, true);
            var46.method258(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method235(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method226((byte) 3, var14, true);
            var46.method258(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method235(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2815(arg11, 30626, var44);
        }
        if (arg1 != 0) {
            var46.method238(arg1);
        }
        if (arg2 != 0) {
            var46.method249(arg2);
        }
        if (arg3 != 0) {
            var46.method235(0, arg3, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "([[SD)V")
    public class713(short[][] arg0, double arg1) {
        this.field9909 = arg1;
        this.field9912 = arg0;
    }
}
