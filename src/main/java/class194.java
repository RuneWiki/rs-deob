import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class194 extends class212 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Lqe;")
    private class168 field3378 = class255.field4423;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "[Z")
    public static boolean[] field3372 = new boolean[100];

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "Lhe;")
    public static class47 field3386 = new class47();

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field3389 = 0;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "[B")
    public static byte[] field3388 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field3391 = 2;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "D")
    public static double field3383;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public int field3380;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Luj;")
    public static class158 field3387;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Lui;")
    private class236 field3382;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
    public final int method1252(int arg0, int arg1) {
        field3374++;
        if (this.field3382 == null) {
            return this.field3375;
        }
        class172 var3 = (class172) this.field3382.method1527((long) arg1, (byte) -50);
        if (arg0 < 12) {
            return -127;
        } else if (var3 == null) {
            return this.field3375;
        } else {
            return var3.field2991;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILnh;B)V")
    private final void method1253(int arg0, class112 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field3384 = arg1.method758(true);
        } else if (arg0 == 2) {
            this.field3380 = arg1.method758(true);
        } else if (arg0 == 3) {
            this.field3378 = arg1.method751((byte) -83);
        } else if (arg0 == 4) {
            this.field3375 = arg1.method769((byte) -86);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method731(false);
            this.field3382 = new class236(class98.method644((byte) 103, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method769((byte) -86);
                class190 var7;
                if (arg0 == 5) {
                    var7 = new class253(arg1.method751((byte) -119));
                } else {
                    var7 = new class172(arg1.method769((byte) -86));
                }
                this.field3382.method1533((long) var6, 0, var7);
            }
        }
        field3373++;
        if (arg2 >= -12) {
            this.method1256(null, 51);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)Lqe;")
    public final class168 method1254(int arg0, byte arg1) {
        field3376++;
        if (this.field3382 == null) {
            return this.field3378;
        }
        class253 var3 = (class253) this.field3382.method1527((long) arg0, (byte) -104);
        if (arg1 != 114) {
            this.method1256(null, -83);
        }
        return var3 == null ? this.field3378 : var3.field4381;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1255(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3390++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg5 - arg6;
        int var12 = arg0 * arg0;
        int var13 = arg0 - arg6;
        int var14 = arg5 * arg5;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var15 << 1;
        int var20 = arg5 << 1;
        int var21 = var12 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var20) * var12 + var17;
        int var24 = var16 - (var22 - 1) * var19;
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var14 - (var20 - 1) * var21;
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (arg3 + var20) * var21;
        int var33 = var18 * 3;
        int var34 = var28;
        int var35 = (var11 - 1) * var29;
        int var36 = (arg5 - 1) * var27;
        int var37 = var30;
        int var38 = (var22 - 3) * var19;
        int[] var39 = class241.field4117[arg7];
        class232.method1501(arg2, arg1 - arg0, (byte) -108, var39, arg1 - var13);
        class232.method1501(arg4, arg1 - var13, (byte) -108, var39, arg1 + var13);
        class232.method1501(arg2, arg1 + var13, (byte) -108, var39, arg1 + arg0);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var26 += var34;
                    var23 += var31;
                    var8++;
                    var31 += var28;
                    var34 += var28;
                }
            }
            if (var26 < 0) {
                var23 += var31;
                var31 += var28;
                var26 += var34;
                var8++;
                var34 += var28;
            }
            var23 += -var36;
            var36 -= var27;
            var26 += -var32;
            boolean var40 = var11 >= var9;
            var32 -= var27;
            var9--;
            int var41 = arg7 + var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var24 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var24 < 0) {
                    var24 += var37;
                    var37 += var30;
                    var25 += var33;
                    var33 += var30;
                    var10++;
                }
                var25 += -var35;
                var24 += -var38;
                var35 -= var29;
                var38 -= var29;
            }
            int var42 = arg7 - var9;
            int var43 = arg1 + var8;
            int var44 = arg1 - var8;
            if (var40) {
                int var45 = arg1 - var10;
                class232.method1501(arg2, var44, (byte) -108, class241.field4117[var42], var45);
                int var46 = arg1 + var10;
                class232.method1501(arg4, var45, (byte) -108, class241.field4117[var42], var46);
                class232.method1501(arg2, var46, (byte) -108, class241.field4117[var42], var43);
                class232.method1501(arg2, var44, (byte) -108, class241.field4117[var41], var45);
                class232.method1501(arg4, var45, (byte) -108, class241.field4117[var41], var46);
                class232.method1501(arg2, var46, (byte) -108, class241.field4117[var41], var43);
            } else {
                class232.method1501(arg2, var44, (byte) -108, class241.field4117[var42], var43);
                class232.method1501(arg2, var44, (byte) -108, class241.field4117[var41], var43);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lnh;I)V")
    public final void method1256(class112 arg0, int arg1) {
        field3385++;
        while (true) {
            int var3 = arg0.method758(true);
            if (var3 == 0) {
                if (arg1 == -25335) {
                    return;
                } else {
                    this.field3378 = null;
                    return;
                }
            }
            this.method1253(var3, arg0, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
    public static void method1257(byte arg0) {
        field3372 = null;
        field3388 = null;
        field3386 = null;
        field3387 = null;
        if (arg0 != -29) {
            method1257((byte) -30);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1258(int arg0, byte[] arg1) {
        class112 var2 = new class112(arg1);
        int var3 = 103 / ((arg0 + 12) / 45);
        field3379++;
        int var4 = var2.method758(true);
        int var5 = var2.method769((byte) -86);
        if (var5 < 0 || class155.field2707 != 0 && class155.field2707 < var5) {
            throw new RuntimeException();
        } else if (var4 == 0) {
            byte[] var8 = new byte[var5];
            var2.method754(0, -4, var5, var8);
            return var8;
        } else {
            int var6 = var2.method769((byte) -86);
            if (var6 < 0 || class155.field2707 != 0 && var6 > class155.field2707) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var4 == 1) {
                class201.method1285(var7, var6, arg1, var5, 9);
            } else {
                class35.field432.method451(var2, -125, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static final void method1259(int arg0) {
        field3381++;
        int var1 = 0;
        int[] var2 = new int[class60.field821];
        for (int var3 = arg0; var3 < class60.field821; var3++) {
            class242 var5 = class151.method1005(520, var3);
            if (var5.field4208 >= 0 || var5.field4153 >= 0) {
                var2[var1++] = var3;
            }
        }
        class47.field626 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            class47.field626[var4] = var2[var4];
        }
    }
}
