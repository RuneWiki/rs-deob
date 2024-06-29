import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class9 extends class115 {

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    private int field98 = 4;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    private int field107 = 4;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    public static int field97 = 0;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "Lqe;")
    private static class168 field102 = class66.method448(" has logged out)3", 64);

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "B")
    public static byte field104 = 0;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "Lqe;")
    public static class168 field96 = field102;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "[I")
    public static int[] field106 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "Lmj;")
    public static class129 field109;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "[I")
    public static int[] field99;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        int[][] var3 = super.field1882.method1242(arg0, -94);
        if (arg1 <= 11) {
            method37(-98, 98, 70, -86, (byte) 17);
        }
        if (super.field1882.field3344) {
            int var4 = class62.field855 / this.field107;
            int var5 = class130.field2297 / this.field98;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method789(0, (byte) -124, class62.field855 * var6 / var4);
            } else {
                var7 = this.method789(0, (byte) -124, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[2];
            int[] var10 = var7[1];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class130.field2297 > var14; ++var14) {
                int var16;
                if (~var5 < -1) {
                    int var15 = var14 % var5;
                    var16 = class130.field2297 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var10[var16];
                var13[var14] = var9[var16];
            }
        }
        ++field101;
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILoe;BI)Z")
    public static final boolean method34(int arg0, class256 arg1, byte arg2, int arg3) {
        if (arg2 != -16) {
            field102 = null;
        }
        byte[] var4 = arg1.method1712(arg3, arg0, -1);
        ++field103;
        if (var4 == null) {
            return false;
        } else {
            class38.method257(arg2 ^ -16, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public static void method35(byte arg0) {
        if (arg0 != -127) {
            method36((class169) null);
        }
        field96 = null;
        field99 = null;
        field106 = null;
        field102 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 != 107) {
            field104 = 88;
        }
        ++field100;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field107 = arg1.method758(true);
            }
        } else {
            this.field98 = arg1.method758(true);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Luc;)V")
    public static final void method36(class169 arg0) {
        for (int var1 = arg0.field2939; var1 <= arg0.field2932; ++var1) {
            for (int var2 = arg0.field2923; var2 <= arg0.field2936; ++var2) {
                class177 var3 = class254.field4395[arg0.field2922][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3115; ++var4) {
                        if (var3.field3090[var4] == arg0) {
                            --var3.field3115;
                            for (int var5 = var4; var5 < var3.field3115; ++var5) {
                                var3.field3090[var5] = var3.field3090[var5 + 1];
                                var3.field3092[var5] = var3.field3092[var5 + 1];
                            }
                            var3.field3090[var3.field3115] = null;
                            break;
                        }
                    }
                    var3.field3091 = 0;
                    for (int var6 = 0; var6 < var3.field3115; ++var6) {
                        var3.field3091 |= var3.field3092[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIB)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field108;
        class170 var5 = (class170) class119.field1941.method1527((long) arg2, (byte) -74);
        if (var5 == null) {
            var5 = new class170();
            class119.field1941.method1533((long) arg2, arg4 + -51, var5);
        }
        if (~arg0 <= ~var5.field2964.length) {
            int[] var6 = new int[arg0 - -1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var5.field2964.length > var8; ++var8) {
                var6[var8] = var5.field2964[var8];
                var7[var8] = var5.field2960[var8];
            }
            for (int var9 = var5.field2964.length; arg0 > var9; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2964 = var6;
            var5.field2960 = var7;
        }
        var5.field2964[arg0] = arg3;
        if (arg4 == -59) {
            var5.field2960[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        int[] var3 = super.field1872.method182((byte) -111, arg0);
        if (arg1 < 37) {
            return null;
        } else {
            ++field105;
            if (super.field1872.field341) {
                int var4 = class130.field2297 / this.field98;
                int var5 = class62.field855 / this.field107;
                int[] var7;
                if (var5 > 0) {
                    int var6 = arg0 % var5;
                    var7 = this.method792(0, 0, class62.field855 * var6 / var5);
                } else {
                    var7 = this.method792(0, 0, 0);
                }
                for (int var8 = 0; var8 < class130.field2297; ++var8) {
                    if (var4 > 0) {
                        int var9 = var8 % var4;
                        var3[var8] = var7[class130.field2297 * var9 / var4];
                    } else {
                        var3[var8] = var7[0];
                    }
                }
            }
            return var3;
        }
    }
}
