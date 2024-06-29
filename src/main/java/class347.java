import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class347 {

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public int field4498;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "[B")
    private byte[] field4494;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public int field4488;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "Lrv;")
    public class62 field4495;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "Lpe;")
    public static class658 field4487;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "Ljava/lang/Object;")
    public static Object field4493;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "[I")
    public int[] field4485;

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "[I")
    public int[] field4492;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "[I")
    public int[] field4496;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "[I")
    public int[] field4497;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "[I")
    public int[] field4499;

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
    public int[] field4503;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "[Lrv;")
    public class62[] field4502;

    @OriginalMember(owner = "client!oba", name = "t", descriptor = "[[B")
    public byte[][] field4504;

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "[[I")
    public int[][] field4489;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "[[I")
    public int[][] field4500;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "([BI)V", line = 4)
    private final void method2035(byte[] arg0, int arg1) {
        field4501++;
        class179 var3 = new class179(class66.method503(arg0, -1));
        int var4 = var3.method1094(255);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4486 = 0;
        } else {
            this.field4486 = var3.method1095((byte) 125);
        }
        int var5 = var3.method1094(255);
        boolean var6 = (var5 & 0x1) != 0;
        boolean var7 = (var5 & 0x2) != 0;
        if (arg1 >= -44) {
            this.field4488 = -47;
        }
        this.field4488 = var3.method1107(false);
        int var8 = 0;
        this.field4496 = new int[this.field4488];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field4488; var10++) {
            this.field4496[var10] = var8 += var3.method1107(false);
            if (this.field4496[var10] > var9) {
                var9 = this.field4496[var10];
            }
        }
        this.field4505 = var9 + 1;
        this.field4497 = new int[this.field4505];
        this.field4500 = new int[this.field4505][];
        this.field4492 = new int[this.field4505];
        this.field4485 = new int[this.field4505];
        if (var7) {
            this.field4504 = new byte[this.field4505][];
        }
        this.field4499 = new int[this.field4505];
        if (var6) {
            this.field4503 = new int[this.field4505];
            for (int var11 = 0; var11 < this.field4505; var11++) {
                this.field4503[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field4488; var12++) {
                this.field4503[this.field4496[var12]] = var3.method1095((byte) 125);
            }
            this.field4495 = new class62(this.field4503);
        }
        for (int var13 = 0; var13 < this.field4488; var13++) {
            this.field4499[this.field4496[var13]] = var3.method1095((byte) 113);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field4488; var14++) {
                byte[] var15 = new byte[64];
                var3.method1096(64, 0, var15, 12050);
                this.field4504[this.field4496[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field4488; var16++) {
            this.field4497[this.field4496[var16]] = var3.method1095((byte) 116);
        }
        for (int var17 = 0; var17 < this.field4488; var17++) {
            this.field4492[this.field4496[var17]] = var3.method1107(false);
        }
        for (int var18 = 0; var18 < this.field4488; var18++) {
            int var25 = this.field4496[var18];
            int var26 = 0;
            int var27 = this.field4492[var25];
            int var28 = -1;
            this.field4500[var25] = new int[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                int var30 = this.field4500[var25][var29] = var26 += var3.method1107(false);
                if (var28 < var30) {
                    var28 = var30;
                }
            }
            this.field4485[var25] = var28 + 1;
            if (var28 + 1 == var27) {
                this.field4500[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field4489 = new int[var9 + 1][];
        this.field4502 = new class62[var9 + 1];
        for (int var19 = 0; var19 < this.field4488; var19++) {
            int var20 = this.field4496[var19];
            int var21 = this.field4492[var20];
            this.field4489[var20] = new int[this.field4485[var20]];
            for (int var22 = 0; var22 < this.field4485[var20]; var22++) {
                this.field4489[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field4500[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field4500[var20][var23];
                }
                this.field4489[var20][var24] = var3.method1095((byte) 119);
            }
            this.field4502[var20] = new class62(this.field4489[var20]);
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(ILrl;IIII[IIIIIIZ[II)I", line = 205)
    public static final int method2036(int arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12, int[] arg13, int arg14) {
        field4490++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class673.field9171[var15][var35] = 0;
                class293.field3824[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg5 == 1) {
            var16 = class547.method3117(arg2, (byte) -37, arg10, arg8, arg9, arg11, arg3, arg7, arg14, arg4, arg1);
        } else if (arg5 == 2) {
            var16 = class589.method3272(arg11, arg7, arg8, arg3, arg9, arg2, true, arg10, arg4, arg1, arg14);
        } else {
            var16 = class42.method358(arg2, arg7, arg9, arg5, arg0 - 3, arg11, arg8, arg1, arg10, arg3, arg14, arg4);
        }
        int var17 = arg3 - 64;
        int var18 = arg7 - 64;
        int var19 = class197.field2538;
        if (arg0 != 2) {
            field4491 = -66;
        }
        int var20 = class570.field7944;
        if (!var16) {
            if (!arg12) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= arg10 + var23; var24++) {
                for (int var25 = arg8 - var23; var25 <= arg8 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class293.field3824[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg10 > var24) {
                            var28 = arg10 - var24;
                        } else if (var24 > (arg2 + arg10 - 1)) {
                            var28 = var24 + 1 - arg2 - arg10;
                        }
                        int var29 = 0;
                        if (arg8 > var25) {
                            var29 = arg8 - var25;
                        } else if ((arg8 + arg4 - 1) < var25) {
                            var29 = var25 + 1 - arg4 - arg8;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class293.field3824[var26][var27] < var22) {
                            var22 = class293.field3824[var26][var27];
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg3 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class36.field540[var31] = var19;
        int var37 = var31 + 1;
        class635.field8803[var31] = var20;
        int var32;
        int var33 = var32 = class673.field9171[var19 - var17][var20 - var18];
        while (arg3 != var19 || arg7 != var20) {
            if (var32 != var33) {
                class36.field540[var37] = var19;
                var32 = var33;
                class635.field8803[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class673.field9171[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg13[var34] = class36.field540[var37];
            arg6[var34++] = class635.field8803[var37];
            if (var34 >= arg13.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V", line = 380)
    public static void method2037(boolean arg0) {
        field4487 = null;
        field4493 = null;
        if (!arg0) {
            field4493 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "([BI[B)V", line = 405)
    public class347(byte[] arg0, int arg1, byte[] arg2) {
        this.field4498 = class27.method275(arg0.length, 113, arg0);
        if (this.field4498 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field4494 = class436.method2579(0, -1, arg0.length, arg0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field4494[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2035(arg0, -107);
    }
}
