import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class111 extends class80 {

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    private int field2022 = 4096;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    private int field2025 = 4096;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    private int field2028 = 4096;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "[S")
    public static short[] field2023;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 < -78) {
            ++field2024;
            if (~class467.field6940 >= ~arg0 && ~arg0 >= ~class43.field600 && ~arg7 <= ~class467.field6940 && ~class43.field600 <= ~arg7 && class467.field6940 <= arg9 && ~arg9 >= ~class43.field600 && class467.field6940 <= arg8 && ~class43.field600 <= ~arg8 && class372.field5455 <= arg2 && ~class216.field3415 <= ~arg2 && ~arg1 <= ~class372.field5455 && ~class216.field3415 <= ~arg1 && ~arg4 <= ~class372.field5455 && ~class216.field3415 <= ~arg4 && class372.field5455 <= arg3 && arg3 <= class216.field3415) {
                class386.method2365(arg6, arg3, arg1, arg0, arg7, arg8, -1, arg4, arg9, arg2);
            } else {
                class356.method2196(arg3, arg8, false, arg6, arg1, arg0, arg9, arg7, arg4, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 31)
    public class111() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)[[I", line = 34)
    public final int[][] method29(int arg0, int arg1) {
        ++field2026;
        if (arg0 != 255) {
            return null;
        } else {
            int[][] var3 = super.field1589.method859(arg1, arg0 + -263);
            if (super.field1589.field1884) {
                int[][] var4 = this.method713(0, -85, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class137.field2308 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var7[var11];
                    int var14 = var6[var11];
                    if (~var12 == ~var13 && ~var13 == ~var14) {
                        var8[var11] = this.field2025 * var12 >> 12;
                        var9[var11] = this.field2028 * var13 >> 12;
                        var10[var11] = this.field2022 * var14 >> 12;
                    } else {
                        var8[var11] = this.field2025;
                        var9[var11] = this.field2028;
                        var10[var11] = this.field2022;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILnn;)V", line = 97)
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field2027;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2022 = arg2.method1841((byte) 70);
                }
            } else {
                this.field2028 = arg2.method1841((byte) -117);
            }
        } else {
            this.field2025 = arg2.method1841((byte) -124);
        }
        int var5 = -52 / ((arg1 - 28) / 53);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V", line = 140)
    public static void method929(byte arg0) {
        if (arg0 == -37) {
            field2023 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lke;IIIII)V", line = 154)
    public static final void method930(class427 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6394 = 0;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (arg0.field6397[var6] != null) {
                ++arg0.field6394;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field6394; ++var7) {
            long var8 = class383.field5598[arg1][arg2][arg3];
            while (var8 != 0L) {
                class188 var14 = class248.field3825[(int) ((var8 & 65535L) - 1L)];
                var8 >>>= 16;
                if (arg0.field6397[var7] == var14.field3015) {
                    continue label50;
                }
            }
            long var10 = class383.field5598[arg1][arg4][arg5];
            while (var10 != 0L) {
                class188 var13 = class248.field3825[(int) ((var10 & 65535L) - 1L)];
                var10 >>>= 16;
                if (arg0.field6397[var7] == var13.field3015) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field6394 - 1; ++var12) {
                arg0.field6397[var12] = arg0.field6397[var12 + 1];
            }
            --arg0.field6394;
        }
    }
}
