import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class228 extends class184 {

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "S")
    public short field3178;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "Z")
    public boolean field3174;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public int field3167;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public int field3176;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "B")
    public byte field3170;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "S")
    public short field3162;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public int field3168;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "S")
    public short field3172;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "B")
    public byte field3165;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "S")
    public short field3161;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "Lbi;")
    public static class139 field3164 = null;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public static int field3173 = -50;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
    public static volatile int field3177 = -1;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field3169 = 0;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public int field3166;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Lmk;")
    public static class156 field3159;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lqf;IIIII)V")
    public static final void method1533(class390 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field5473 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field5477[var6] != null) {
                arg0.field5473++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field5473; var7++) {
            int var8 = class39.field603[arg1][arg2][arg3];
            while (var8 != 0) {
                class21 var12 = class30.field511[(var8 & 0xFF) - 1];
                var8 >>>= 0x8;
                if (arg0.field5477[var7] == var12) {
                    continue label50;
                }
            }
            int var9 = class39.field603[arg1][arg4][arg5];
            while (var9 != 0) {
                class21 var11 = class30.field511[(var9 & 0xFF) - 1];
                var9 >>>= 0x8;
                if (arg0.field5477[var7] == var11) {
                    continue label50;
                }
            }
            for (int var10 = var7; var10 < arg0.field5473 - 1; var10++) {
                arg0.field5477[var10] = arg0.field5477[var10 + 1];
            }
            arg0.field5473--;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILpe;IIIILsj;Lqi;IZIIIII)Lsj;")
    public static final class73 method1534(int arg0, class391 arg1, int arg2, int arg3, int arg4, int arg5, class73 arg6, class209 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field3160++;
        if (arg6 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg7 != null) {
            int var16 = var15 | arg7.method1438(arg13, false, -1, (byte) -120);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg3 << 48) + ((long) arg0 << 32) + (long) ((arg8 << 24) + (arg10 << 16) + arg2);
        class410 var19 = class75.field1123;
        class73 var20;
        synchronized (class75.field1123) {
            var20 = (class73) class75.field1123.method2537(-115, var17);
        }
        if (var20 == null || arg1.method183(var20.method426(), var15) != 0) {
            if (var20 != null) {
                var15 = arg1.method163(var15, var20.method426());
            }
            byte var21;
            if (arg2 == 1) {
                var21 = 9;
            } else if (arg2 == 2) {
                var21 = 12;
            } else if (arg2 == 3) {
                var21 = 15;
            } else if (arg2 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class84 var24 = new class84(var21 * var22 + 1, var22 * 2 * var21 + -var21, 0);
            int var25 = var24.method757(0, (byte) 88, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class174.field2572[var31] * var28 >> 15;
                    int var33 = class174.field2564[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method757(0, (byte) 22, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg8 * var35 + arg10 * var36 >> 8);
                short var38 = (short) (((arg0 & 0x7F) * var36 + (arg3 & 0x7F) * var35 & 0x7F00) + ((arg0 & 0xFC00) * var36 + (arg3 & 0xFC00) * var35 & 0xFC0000) + ((arg0 & 0x380) * var36 + (arg3 & 0x380) * var35 & 0x38000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method766(var38, (byte) 1, var25, var37, var26[0][(var39 + 1) % var21], (byte) -115, (byte) -1, (short) -1, var26[0][var39]);
                    } else {
                        var24.method766(var38, (byte) 1, var26[var34 - 1][var39], var37, var26[var34 - 1][(var39 + 1) % var21], (byte) 43, (byte) -1, (short) -1, var26[var34][(var39 + 1) % var21]);
                        var24.method766(var38, (byte) 1, var26[var34 - 1][var39], var37, var26[var34][(var39 + 1) % var21], (byte) 84, (byte) -1, (short) -1, var26[var34][var39]);
                    }
                }
            }
            var20 = arg1.method237(var24, var15, class94.field1364, 64, 768);
            class410 var40 = class75.field1123;
            synchronized (class75.field1123) {
                class75.field1123.method2542(var20, (byte) 53, var17);
            }
        }
        int var41 = arg2 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg9) {
            if (arg12 > 1024 && arg12 < 7168) {
                var42 -= 128;
            }
            if (arg12 > 5120 && arg12 < 11264) {
                var45 = var41 + 128;
            }
            if (arg12 > 13312 || arg12 < 3072) {
                var43 -= 128;
            }
            if (arg12 > 9216 && arg12 < 15360) {
                var44 = var41 + 128;
            }
        }
        int var46 = arg6.method449();
        if (arg11 > -108) {
            return null;
        }
        int var47 = arg6.method417();
        int var48 = arg6.method422();
        if (var43 > var48) {
            var48 = var43;
        }
        int var49 = arg6.method437();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class61 var50 = null;
        if (arg7 != null) {
            int var51 = arg7.field2915[arg13];
            var50 = class166.method1254((byte) -127, var51 >> 16);
            arg13 = var51 & 0xFFFF;
        }
        class73 var52;
        if (var50 == null) {
            var52 = var20.method440((byte) 3, var15, true);
            var52.method445((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method460((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method440((byte) 3, var15, true);
            var52.method445((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method460((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method625(arg13, var50, 1);
        }
        if (arg14 != 0) {
            var52.method467(arg14);
        }
        if (arg4 != 0) {
            var52.method442(arg4);
        }
        if (arg5 != 0) {
            var52.method460(0, arg5, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)I")
    public abstract int method579(int arg0);

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V")
    public void method1108(byte arg0) {
        int var2 = 95 % ((40 - arg0) / 39);
        field3180++;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
    public static final void method1535(int arg0, int arg1) {
        if (arg1 != 1057) {
            return;
        }
        field3175++;
        class410 var2 = class189.field2721;
        synchronized (class189.field2721) {
            class189.field2721.method2534(0, arg0);
        }
        class410 var3 = class27.field469;
        synchronized (class27.field469) {
            class27.field469.method2534(0, arg0);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lbi;III)V")
    public static final void method1536(class139 arg0, int arg1, int arg2, int arg3) {
        field3171++;
        if (class305.field4133 != null || class94.field1369 || arg0 == null || class341.method2167(9492, arg0) == null) {
            return;
        }
        class305.field4133 = arg0;
        class291.field3953 = class341.method2167(arg2 + 9492, arg0);
        class380.field5338 = arg3;
        class442.field6363 = false;
        class69.field1050 = arg1;
        class167.field2486 = arg2;
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(I)V")
    public static void method1537(int arg0) {
        if (arg0 != -29075) {
            field3164 = null;
        }
        field3159 = null;
        field3164 = null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3178 = (short) arg7;
        this.field3174 = arg8;
        this.field3167 = (short) arg3;
        this.field3176 = (short) arg1;
        this.field3170 = (byte) arg0;
        this.field3162 = (short) arg5;
        this.field3168 = (short) arg2;
        this.field3172 = (short) arg4;
        this.field3165 = arg9;
        this.field3161 = (short) arg6;
    }
}
