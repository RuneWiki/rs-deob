import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class123 implements class61 {

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Loj;")
    private class346 field1698 = new class346(128);

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "[I")
    public int[] field1703 = new int[class540.field7344.field9279];

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[I")
    private int[] field1705 = new int[class540.field7344.field9279];

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public static int[] field1692 = new int[1000];

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    public static int[] field1701 = new int[1];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "F")
    public static float field1693;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 7)
    public final void method869(byte arg0) {
        field1694++;
        int var2 = -82 % ((-arg0 - 61) / 44);
        for (int var3 = 0; var3 < class540.field7344.field9279; var3++) {
            class293 var4 = class540.field7344.method3651(var3, -123);
            if (var4 != null && var4.field4400 == 0) {
                this.field1705[var3] = 0;
                this.field1703[var3] = 0;
            }
        }
        this.field1698 = new class346(128);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 33)
    public static void method870(byte arg0) {
        field1692 = null;
        if (arg0 != 13) {
            method870((byte) -125);
        }
        field1701 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)I", line = 49)
    public final int method507(byte arg0, int arg1) {
        field1696++;
        int var3 = 12 % ((arg0 + 22) / 43);
        return this.field1703[arg1];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)I", line = 65)
    public final int method871(int arg0, boolean arg1) {
        field1704++;
        long var3 = class680.method3756(-109);
        for (class232 var5 = arg1 ? (class232) this.field1698.method2066(false) : (class232) this.field1698.method2062(-19704); var5 != null; var5 = (class232) this.field1698.method2062(-19704)) {
            if (var3 > (var5.field3295 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field3295 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field7311;
                    this.field1703[var6] = this.field1705[var6];
                    var5.method2971(1);
                    return var6;
                }
                var5.method2971(1);
            }
        }
        if (arg0 != -23330) {
            this.method507((byte) 2, -97);
        }
        return -1;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I", line = 103)
    public final int method508(int arg0, int arg1) {
        field1697++;
        class574 var3 = class311.field4616.method1193(-1706, arg1);
        int var4 = var3.field7727;
        int var5 = var3.field7724;
        int var6 = var3.field7722;
        if (arg0 < 31) {
            this.field1698 = null;
        }
        int var7 = class643.field9134[var6 - var5];
        return this.field1703[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V", line = 126)
    public final void method872(int arg0, int arg1, int arg2) {
        this.field1705[arg2] = arg1;
        if (arg0 != -1) {
            method873(32, -74, -37, null, -97, 47, null, 30, -10, -34, 71, -81, -69, null, 102);
        }
        field1706++;
        class232 var4 = (class232) this.field1698.method2061(-17305, (long) arg2);
        if (var4 == null) {
            class232 var5 = new class232(4611686018427387905L);
            this.field1698.method2063((long) arg2, 1, var5);
        } else if (var4.field3295 != 4611686018427387905L) {
            var4.field3295 = class680.method3756(-76) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILba;IILoa;IIIIIILct;I)Lba;", line = 155)
    public static final class352 method873(int arg0, int arg1, int arg2, class352 arg3, int arg4, int arg5, class638 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class131 arg13, int arg14) {
        field1695++;
        if (arg3 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg13 != null) {
            int var16 = var15 | arg13.method908(false, arg14 - 1206584225, arg4, -1);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg10 << 32) + ((long) arg1 << 48) + (long) ((arg12 << 24) + (arg9 - -(arg0 << 16)));
        class328 var19 = class205.field3010;
        class352 var20;
        synchronized (class205.field3010) {
            var20 = (class352) class205.field3010.method1986((byte) -120, var17);
        }
        if (var20 == null || arg6.method431(var20.method189(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method444(var15, var20.method189());
            }
            byte var21;
            if (arg9 == 1) {
                var21 = 9;
            } else if (arg9 == 2) {
                var21 = 12;
            } else if (arg9 == 3) {
                var21 = 15;
            } else if (arg9 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class661 var24 = new class661(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method3656(0, 0, 0, arg14 ^ 0xB8149929);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class675.field9542[var31] * var28 >> 14;
                    int var33 = class675.field9541[var31] * var29 >> 14;
                    var26[var27][var30] = var24.method3656(var33, 0, var32, -25336);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg0 * var36 + arg12 * var35 >> 8);
                short var38 = (short) (((arg1 & 0x7F) * var35 + (arg10 & 0x7F) * var36 & 0x7F00) + ((arg1 & 0x380) * var35 + (arg10 & 0x380) * var36 & 0x38000) + ((arg1 & 0xFC00) * var35 + (arg10 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method3668((byte) -1, var25, var38, var26[0][(var39 + 1) % var21], (short) -1, var26[0][var39], 1, var37, (byte) 1);
                    } else {
                        var24.method3668((byte) -1, var26[var34 - 1][var39], var38, var26[var34 - 1][(var39 + 1) % var21], (short) -1, var26[var34][(var39 + 1) % var21], 1, var37, (byte) 1);
                        var24.method3668((byte) -1, var26[var34 - 1][var39], var38, var26[var34][(var39 + 1) % var21], (short) -1, var26[var34][var39], 1, var37, (byte) 1);
                    }
                }
            }
            var20 = arg6.method379(var24, var15, class307.field4531, 64, 768);
            class328 var40 = class205.field3010;
            synchronized (class205.field3010) {
                class205.field3010.method1985(var20, var17, (byte) -102);
            }
        }
        int var41 = (arg9 << 8) - 1;
        int var42 = -var41;
        int var43 = -var41;
        if (arg14 != 1206584353) {
            return null;
        }
        int var44 = var41;
        int var45 = var41;
        if (arg8 != 0) {
            if ((arg8 & 0x8) != 0) {
                var42 -= 512;
            }
            if ((arg8 & 0x1) != 0) {
                var45 = var41 + 512;
            }
            if ((arg8 & 0x4) != 0) {
                var44 = var41 + 512;
            }
            if ((arg8 & 0x2) != 0) {
                var43 -= 512;
            }
        }
        int var46 = arg3.method214();
        int var47 = arg3.method229();
        int var48 = arg3.method219();
        int var49 = arg3.method198();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class597 var50 = null;
        if (arg13 != null) {
            int var51 = arg13.field1806[arg4];
            var50 = class301.field4465.method2757(arg14 ^ 0x47EB0461, var51 >> 16);
            arg4 = var51 & 0xFFFF;
        }
        class352 var52;
        if (var50 == null) {
            var52 = var20.method235((byte) 3, var15, true);
            var52.method217(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method224(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method235((byte) 3, var15, true);
            var52.method217(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method224(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2093(arg4, var50, true);
        }
        if (arg7 != 0) {
            var52.method233(arg7);
        }
        if (arg11 != 0) {
            var52.method223(arg11);
        }
        if (arg2 != 0) {
            var52.method224(0, arg2, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z", line = 368)
    public static final boolean method874(int arg0, int arg1, int arg2) {
        field1690++;
        if (arg1 != 2915) {
            field1692 = null;
        }
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V", line = 382)
    public final void method875(int arg0, int arg1, int arg2) {
        field1691++;
        class574 var4 = class311.field4616.method1193(arg1 ^ 0xFFFFF956, arg2);
        int var5 = var4.field7727;
        int var6 = var4.field7724;
        int var7 = var4.field7722;
        int var8 = class643.field9134[var7 - var6];
        if (arg0 < arg1 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method877(16515072, var5, ~var9 & this.field1703[var5] | var9 & arg0 << var6);
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(III)V", line = 409)
    public final void method876(int arg0, int arg1, int arg2) {
        field1702++;
        class574 var4 = class311.field4616.method1193(arg0 - 1705, arg1);
        int var5 = var4.field7727;
        int var6 = var4.field7724;
        int var7 = var4.field7722;
        int var8 = class643.field9134[var7 - var6];
        if (~arg2 > arg0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method872(-1, this.field1705[var5] & ~var9 | var9 & arg2 << var6, var5);
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(III)V", line = 447)
    public final void method877(int arg0, int arg1, int arg2) {
        this.field1703[arg1] = arg2;
        field1700++;
        class232 var4 = (class232) this.field1698.method2061(-17305, (long) arg1);
        if (arg0 != 16515072) {
            this.field1698 = null;
        }
        if (var4 == null) {
            class232 var5 = new class232(class680.method3756(arg0 ^ 0xFF03FFEB) + 500L);
            this.field1698.method2063((long) arg1, arg0 - 16515071, var5);
        } else {
            var4.field3295 = class680.method3756(-105) + 500L;
        }
    }
}
