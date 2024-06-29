import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class270 extends class206 {

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "Z")
    public boolean field4588;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "[Lrg;")
    public class270[] field4582;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lsk;")
    public static class199 field4575 = new class199(32);

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static volatile int field4581 = -1;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!rg", name = "O", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!rg", name = "Q", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!rg", name = "R", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lkj;")
    public class118 field4573;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Lli;")
    public static class226 field4590;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lhi;")
    public static class26 field4576;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "Ljk;")
    public class78 field4589;

    @OriginalMember(owner = "client!rg", name = "P", descriptor = "[Lkb;")
    public static class82[] field4594;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)[I", line = 4)
    public final int[] method1850(int arg0, int arg1, int arg2) {
        field4593++;
        if (arg1 != 0) {
            this.method1852(-27, 108, 53);
        }
        return this.field4582[arg0].field4588 ? this.field4582[arg0].method6(arg1 + 18693, arg2) : this.field4582[arg0].method11(false, arg2)[0];
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(B)V", line = 31)
    public static void method1851(byte arg0) {
        if (arg0 != -27) {
            method1853((float[][]) ((float[][]) null), (byte[][][]) ((byte[][][]) null), (int[][]) ((int[][]) null), (byte[][]) ((byte[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), -64, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (byte[][]) ((byte[][]) null), (byte[][]) ((byte[][]) null), 68, (byte[][]) ((byte[][]) null));
        }
        field4594 = null;
        field4590 = null;
        field4575 = null;
        field4576 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)[[I", line = 46)
    public int[][] method11(boolean arg0, int arg1) {
        if (arg0) {
            this.method231((byte) 68);
        }
        field4595++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[I", line = 59)
    public int[] method6(int arg0, int arg1) {
        field4574++;
        if (arg0 == 18693) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return (int[]) null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V", line = 74)
    public final void method1852(int arg0, int arg1, int arg2) {
        int var4 = this.field4578 == arg1 ? arg0 : this.field4578;
        if (this.field4588) {
            this.field4573 = new class118(var4, arg0, arg2);
        } else {
            this.field4589 = new class78(var4, arg0, arg2);
        }
        field4572++;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)V", line = 91)
    public void method1276(byte arg0) {
        if (this.field4588) {
            this.field4573.method918((byte) 31);
            this.field4573 = null;
        } else {
            this.field4589.method604(false);
            this.field4589 = null;
        }
        field4583++;
        if (arg0 > -34) {
            this.method8((class92) null, -11, 42);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "([[F[[[B[[I[[B[[I[[I[[I[[FI[[I[[F[[B[[BI[[B)[Lmk;", line = 118)
    public static final class224[] method1853(float[][] arg0, byte[][][] arg1, int[][] arg2, byte[][] arg3, int[][] arg4, int[][] arg5, int[][] arg6, float[][] arg7, int arg8, int[][] arg9, float[][] arg10, byte[][] arg11, byte[][] arg12, int arg13, byte[][] arg14) {
        field4577++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg11[var16][var17];
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg11[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg11[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class5 var19 = class156.method1153((var18 & 0xFF) - 1, true);
                    var15[var16][var17] = (var19.field66 + 1 << 16) + var19.field58;
                }
            }
        }
        class49 var20 = new class49(128);
        for (int var21 = 1; var21 <= 102; var21++) {
            for (int var22 = 1; var22 <= 102; var22++) {
                if (arg11[var21][var22] != 0) {
                    int[] var23;
                    if (arg14[var21][var22] == 0) {
                        var23 = class194.field3270[0];
                    } else {
                        var23 = class151.field2396[arg3[var21][var22]];
                        if (var23.length == 0) {
                            continue;
                        }
                    }
                    int var24 = 0;
                    int var25 = var15[var21][var22];
                    int var26 = var15[var21 + 1][var22];
                    int var27 = var15[var21 + 1][var22 + 1];
                    int var28 = var15[var21][var22 + 1];
                    int var29 = var23.length / 2;
                    if (arg9 != null) {
                        var24 = arg9[var21][var22] & 0xFFFFFF;
                    }
                    long var30 = (long) var24 | (long) var26 << 32;
                    long var32 = (long) var25 << 32 | (long) var24;
                    class224 var34 = (class224) var20.method311((byte) 114, var32);
                    if (var34 == null) {
                        var34 = new class224((var25 >> 16) - 1, (float) (var25 & 0xFFFF), false, arg5 != null, var24);
                        var20.method309(var34, var32, 1);
                    }
                    var34.field3898++;
                    var34.field3909 += var29;
                    long var35 = (long) var24 | (long) var28 << 32;
                    long var37 = (long) var27 << 32 | (long) var24;
                    if (var30 != var32) {
                        class224 var39 = (class224) var20.method311((byte) 114, var30);
                        if (var39 == null) {
                            var39 = new class224((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg5 != null, var24);
                            var20.method309(var39, var30, arg13 - 16777214);
                        }
                        var39.field3898++;
                        var39.field3909 += var29;
                    }
                    if (var32 != var37 && var30 != var37) {
                        class224 var40 = (class224) var20.method311((byte) 114, var37);
                        if (var40 == null) {
                            var40 = new class224((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg5 != null, var24);
                            var20.method309(var40, var37, 1);
                        }
                        var40.field3909 += var29;
                        var40.field3898++;
                    }
                    if (var32 != var35 && var30 != var35 && var35 != var37) {
                        class224 var41 = (class224) var20.method311((byte) 114, var35);
                        if (var41 == null) {
                            var41 = new class224((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg5 != null, var24);
                            var20.method309(var41, var35, 1);
                        }
                        var41.field3909 += var29;
                        var41.field3898++;
                    }
                }
            }
        }
        for (class224 var42 = (class224) var20.method317(-113); var42 != null; var42 = (class224) var20.method314(arg13 ^ 0xFF000044)) {
            var42.method1590();
        }
        for (int var43 = 1; var43 <= 102; var43++) {
            for (int var44 = 1; var44 <= 102; var44++) {
                if (arg11[var43][var44] != 0) {
                    int var45;
                    if ((arg1[arg8][var43][var44] & 0x8) != 0) {
                        var45 = 0;
                    } else if ((arg1[1][var43][var44] & 0x2) == 2 && arg8 > 0) {
                        var45 = arg8 - 1;
                    } else {
                        var45 = arg8;
                    }
                    int var46 = 0;
                    int var47 = 128;
                    if (arg9 != null) {
                        var46 = arg9[var43][var44] & 0xFFFFFF;
                        var47 = arg9[var43][var44] >>> 24 << 3;
                    }
                    boolean[] var48 = null;
                    byte var49;
                    int[] var50;
                    if (arg14[var43][var44] == 0) {
                        var49 = 0;
                        var50 = class194.field3270[0];
                    } else {
                        var49 = arg12[var43][var44];
                        var50 = class151.field2396[arg3[var43][var44]];
                        var48 = class187.field2993[arg3[var43][var44]];
                        if (var50.length == 0) {
                            continue;
                        }
                    }
                    int var51 = var15[var43 + 1][var44];
                    int var52 = var15[var43][var44];
                    int var53 = var15[var43 + 1][var44 + 1];
                    long var54 = (long) var52 << 32 | (long) var46;
                    long var56 = (long) var51 << 32 | (long) var46;
                    int var58 = var15[var43][var44 + 1];
                    long var59 = (long) var53 << 32 | (long) var46;
                    long var61 = (long) var46 | (long) var58 << 32;
                    int var63 = arg6[var43][var44];
                    int var64 = arg6[var43 + 1][var44 + 1];
                    int var65 = arg6[var43 + 1][var44];
                    int var66 = arg6[var43][var44 + 1];
                    int var67 = arg2[var43][var44];
                    int var68 = arg2[var43 + 1][var44];
                    int var69 = arg2[var43 + 1][var44 + 1];
                    int var70 = (var51 >> 16) - 1;
                    int var71 = (var53 >> 16) - 1;
                    int var72 = arg2[var43][var44 + 1];
                    int var73 = (var52 >> 16) - 1;
                    int var74 = (var58 >> 16) - 1;
                    class224 var75 = (class224) var20.method311((byte) 114, var54);
                    class198.method1382(class64.method461(var63, var73, true, var67), class64.method461(var65, var73, true, var68), arg4, var48, var50, var45, arg10, var44, arg7, var52 <= var58, class64.method461(var64, var73, true, var69), 12313, var53 >= var52, var49, arg5, arg0, var47, var51 >= var52, var75, class64.method461(var66, var73, true, var72), var52 <= var52, var43);
                    if (var54 != var56) {
                        class224 var76 = (class224) var20.method311((byte) 114, var56);
                        class198.method1382(class64.method461(var63, var70, true, var67), class64.method461(var65, var70, true, var68), arg4, var48, var50, var45, arg10, var44, arg7, var51 <= var58, class64.method461(var64, var70, true, var69), arg13 - 16764902, var53 >= var51, var49, arg5, arg0, var47, var51 <= var51, var76, class64.method461(var66, var70, true, var72), var52 >= var51, var43);
                    }
                    if (var54 != var59 && var56 != var59) {
                        class224 var77 = (class224) var20.method311((byte) 114, var59);
                        class198.method1382(class64.method461(var63, var71, true, var67), class64.method461(var65, var71, true, var68), arg4, var48, var50, var45, arg10, var44, arg7, var53 <= var58, class64.method461(var64, var71, true, var69), 12313, var53 >= var53, var49, arg5, arg0, var47, var53 <= var51, var77, class64.method461(var66, var71, true, var72), var53 <= var52, var43);
                    }
                    if (var54 != var61 && var56 != var61 && var59 != var61) {
                        class224 var78 = (class224) var20.method311((byte) 114, var61);
                        class198.method1382(class64.method461(var63, var74, true, var67), class64.method461(var65, var74, true, var68), arg4, var48, var50, var45, arg10, var44, arg7, var58 >= var58, class64.method461(var64, var74, true, var69), arg13 - 16764902, var58 <= var53, var49, arg5, arg0, var47, var51 >= var58, var78, class64.method461(var66, var74, true, var72), var58 <= var52, var43);
                    }
                }
            }
        }
        for (class224 var79 = (class224) var20.method317(-110); var79 != null; var79 = (class224) var20.method314(-81)) {
            if (var79.field3886 == 0) {
                var79.method1444((byte) 89);
            } else {
                var79.method1589();
            }
        }
        int var80 = var20.method312(-24);
        class224[] var81 = new class224[var80];
        var20.method308((byte) -127, var81);
        long[] var82 = new long[var80];
        if (arg13 != 16777215) {
            return (class224[]) null;
        }
        for (int var83 = 0; var83 < var80; var83++) {
            var82[var83] = var81[var83].field3499;
        }
        class207.method1451(var81, var82, true);
        return var81;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)I", line = 447)
    public static int method1854(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)I", line = 468)
    public int method1714(int arg0) {
        field4584++;
        if (arg0 < 108) {
            field4590 = (class226) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(B)I", line = 485)
    public int method1269(byte arg0) {
        field4592++;
        int var2 = -84 / ((54 - arg0) / 40);
        return -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZII)[[I", line = 495)
    public final int[][] method1855(boolean arg0, int arg1, int arg2) {
        field4580++;
        if (arg0) {
            return (int[][]) ((int[][]) null);
        } else if (this.field4582[arg2].field4588) {
            int[] var4 = this.field4582[arg2].method6(18693, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4582[arg2].method11(false, arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(IZ)V", line = 536)
    public class270(int arg0, boolean arg1) {
        this.field4588 = arg1;
        this.field4582 = new class270[arg0];
    }

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "(B)V", line = 563)
    public void method231(byte arg0) {
        if (arg0 != 90) {
            this.method1852(-5, -17, -109);
        }
        field4587++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lmi;II)V", line = 577)
    public void method8(class92 arg0, int arg1, int arg2) {
        int var4 = -92 % ((-arg2 - 8) / 53);
        field4596++;
    }
}
