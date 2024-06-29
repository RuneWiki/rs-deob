import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class27 extends class117 {

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "[Lqb;")
    public class27[] field377;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Z")
    public boolean field376;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "[Z")
    public static boolean[] field367 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field374 = 1;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "Lqj;")
    public static class263 field363 = null;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "[I")
    public static int[] field383 = new int[100];

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field386 = -1;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Z")
    public static boolean field381 = false;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Lgl;")
    public class289 field375;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "Lrf;")
    public class81 field379;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)[I", line = 4)
    public final int[] method164(int arg0, int arg1, int arg2) {
        if (arg1 <= 14) {
            return (int[]) null;
        } else {
            field368++;
            return this.field377[arg2].field376 ? this.field377[arg2].method18(arg0, (byte) -62) : this.field377[arg2].method19(-28941, arg0)[0];
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lsb;I)Lqb;", line = 27)
    public static final class27 method165(class190 arg0, int arg1) {
        arg0.method1319(255);
        field380++;
        int var2 = arg0.method1319(255);
        class27 var3 = class281.method2050((byte) -86, var2);
        if (arg1 > -28) {
            method166(28);
        }
        var3.field371 = arg0.method1319(255);
        int var4 = arg0.method1319(255);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1319(255);
            var3.method23(-5836, arg0, var6);
        }
        var3.method22(-107);
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[[I", line = 62)
    public int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            field369 = -93;
        }
        field378++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 73)
    public static final void method166(int arg0) {
        field373++;
        try {
            if (class131.field1889 == 1) {
                int var1 = class256.field3833.method2296(arg0 + 4503);
                if (var1 > 0 && class256.field3833.method2294(0)) {
                    int var2 = var1 - class347.field5361;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class256.field3833.method2322(var2, (byte) 125);
                    return;
                }
                class256.field3833.method2317(-127);
                class256.field3833.method2306((byte) -55);
                class146.field2104 = null;
                class137.field1994 = null;
                if (class124.field1807 == null) {
                    class131.field1889 = 0;
                } else {
                    class131.field1889 = 2;
                }
            }
            if (arg0 != -4588) {
                method166(-15);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class256.field3833.method2317(arg0 + 4494);
            class124.field1807 = null;
            class131.field1889 = 0;
            class137.field1994 = null;
            class146.field2104 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)V", line = 126)
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field365++;
        if (arg4 == arg8 && arg0 == arg1 && arg6 == arg9 && arg2 == arg7) {
            class236.method1756(arg4, arg6, arg5, arg0, -1, arg2);
        } else {
            int var10 = arg4;
            int var11 = arg0;
            int var12 = arg4 * 3;
            int var13 = arg0 * 3;
            int var14 = arg8 * 3;
            int var15 = arg1 * 3;
            int var16 = arg7 * 3;
            int var17 = arg9 * 3;
            int var18 = var17 + var12 - var14 - var14;
            int var19 = arg2 - var16 - (-var15 - -arg0);
            int var20 = var13 + var16 - var15 - var15;
            int var21 = arg6 + var14 - var17 - arg4;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var21 * var26;
                int var29 = var18 * var25;
                int var30 = var22 * var24;
                int var31 = var20 * var25;
                int var32 = var23 * var24;
                int var33 = (var28 - (-var29 - var30) >> 12) + arg4;
                int var34 = arg0 + (var27 + var32 + var31 >> 12);
                class236.method1756(var10, var33, arg5, var11, -1, var34);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg3 <= 24) {
            method173((byte) -73);
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(III)[[I", line = 208)
    public final int[][] method168(int arg0, int arg1, int arg2) {
        int var4 = 87 / ((arg1 + 71) / 42);
        field366++;
        if (!this.field377[arg0].field376) {
            return this.field377[arg0].method19(-28941, arg2);
        }
        int[][] var5 = new int[3][];
        int[] var6 = this.field377[arg0].method18(arg2, (byte) -62);
        var5[1] = var6;
        var5[2] = var6;
        var5[0] = var6;
        return var5;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I", line = 244)
    public int method169(int arg0) {
        if (arg0 != 100) {
            this.field377 = (class27[]) null;
        }
        field364++;
        return -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[I", line = 255)
    public int[] method18(int arg0, byte arg1) {
        if (arg1 != -62) {
            this.method18(104, (byte) -89);
        }
        field384++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V", line = 271)
    public void method22(int arg0) {
        if (arg0 < -63) {
            field385++;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIB)V", line = 288)
    public final void method170(int arg0, int arg1, byte arg2) {
        int var4 = this.field371 == 255 ? arg1 : this.field371;
        if (this.field376) {
            this.field375 = new class289(var4, arg1, arg0);
        } else {
            this.field379 = new class81(var4, arg1, arg0);
        }
        field372++;
        int var5 = 9 / ((21 - arg2) / 42);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V", line = 310)
    public void method171(byte arg0) {
        field362++;
        if (arg0 != 105) {
            return;
        }
        if (this.field376) {
            this.field375.method2083(arg0 ^ 0x69);
            this.field375 = null;
        } else {
            this.field379.method663(true);
            this.field379 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)I", line = 350)
    public int method172(byte arg0) {
        if (arg0 == 92) {
            field382++;
            return -1;
        } else {
            return 73;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILsb;I)V", line = 362)
    public void method23(int arg0, class190 arg1, int arg2) {
        field370++;
        if (arg0 != -5836) {
            this.field375 = (class289) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 374)
    public static void method173(byte arg0) {
        field367 = null;
        field383 = null;
        if (arg0 <= 0) {
            field363 = (class263) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IZ)V", line = 393)
    public class27(int arg0, boolean arg1) {
        this.field377 = new class27[arg0];
        this.field376 = arg1;
    }
}
