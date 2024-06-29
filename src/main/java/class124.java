import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class124 extends class310 {

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    private int field2117 = 1;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    private int field2119 = 1;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "Z")
    public static boolean field2120 = false;

    @OriginalMember(owner = "client!kk", name = "R", descriptor = "Z")
    public static boolean field2122 = false;

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "I")
    public static int field2127 = 0;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2124 = "Loaded update list";

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I", line = 6)
    public final int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            field2127 = 87;
        }
        field2128++;
        int[][] var3 = this.field4942.method10((byte) -113, arg0);
        if (this.field4942.field30) {
            int var4 = this.field2117 + this.field2117 + 1;
            int var5 = this.field2119 - (-this.field2119 - 1);
            int var6 = 65536 / var4;
            int var7 = 65536 / var5;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field2117; var9 <= (this.field2117 + arg0); var9++) {
                int[][] var10 = this.method2199(21101, var9 & class113.field1861, 0);
                int[][] var11 = new int[3][class261.field4405];
                int var12 = 0;
                int[] var13 = var10[0];
                int var14 = 0;
                int[] var15 = var10[1];
                int[] var16 = var10[2];
                int var17 = 0;
                for (int var18 = -this.field2119; var18 <= this.field2119; var18++) {
                    int var19 = var18 & class98.field1628;
                    var17 += var16[var19];
                    var14 += var15[var19];
                    var12 += var13[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class261.field4405 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var21[var23] = var7 * var14 >> 16;
                    var22[var23] = var7 * var17 >> 16;
                    int var24 = class98.field1628 & var23 - this.field2119;
                    int var25 = var12 - var13[var24];
                    int var26 = var17 - var16[var24];
                    var23++;
                    int var27 = var14 - var15[var24];
                    int var28 = class98.field1628 & var23 + this.field2119;
                    var17 = var16[var28] + var26;
                    var12 = var13[var28] + var25;
                    var14 = var15[var28] + var27;
                }
                var8[var9 + this.field2117 - arg0] = var11;
            }
            int[] var29 = var3[1];
            int[] var30 = var3[0];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class261.field4405; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var35 += var37[2][var32];
                    var34 += var37[1][var32];
                    var33 += var37[0][var32];
                }
                var30[var32] = var6 * var33 >> 16;
                var29[var32] = var6 * var34 >> 16;
                var31[var32] = var6 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lqm;II)V", line = 137)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            this.field2117 = -41;
        }
        if (arg2 == 0) {
            this.field2119 = arg0.method1720((byte) -78);
        } else if (arg2 == 1) {
            this.field2117 = arg0.method1720((byte) -46);
        } else if (arg2 == 2) {
            this.field4940 = arg0.method1720((byte) -29) == 1;
        }
        field2118++;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I", line = 181)
    public final int[] method77(int arg0, int arg1) {
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        field2116++;
        if (arg1 != -13093) {
            method973(-114, (byte) 39);
        }
        if (this.field4950.field2001) {
            int var4 = this.field2117 + this.field2117 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2119 + this.field2119 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field2117; var9 <= arg0 + this.field2117; var9++) {
                int[] var10 = this.method2200(0, var9 & class113.field1861, (byte) 74);
                int[] var11 = new int[class261.field4405];
                int var12 = 0;
                for (int var13 = -this.field2119; var13 <= this.field2119; var13++) {
                    var12 += var10[var13 & class98.field1628];
                }
                int var14 = 0;
                while (class261.field4405 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[var14 - this.field2119 & class98.field1628];
                    var14++;
                    var12 = var10[this.field2119 + var14 & class98.field1628] + var15;
                }
                var8[this.field2117 + var9 - arg0] = var11;
            }
            for (int var16 = 0; var16 < class261.field4405; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 269)
    public static void method971(int arg0) {
        if (arg0 != 9171) {
            field2120 = true;
        }
        field2124 = null;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 291)
    public class124() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZIIIIIIIII)V", line = 305)
    public static final void method972(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class172.field2748[var12][var13] = 0;
                class332.field5270[var12][var13] = 99999999;
            }
        }
        field2115++;
        class172.field2748[arg5][arg9] = 99;
        class332.field5270[arg5][arg9] = 0;
        int var14 = 0;
        int var15 = arg5;
        int var16 = arg9;
        byte var17 = 0;
        class52.field881[var17] = arg5;
        boolean var18 = false;
        int var19 = -122 % ((-arg10 - 80) / 45);
        int var38 = var17 + 1;
        class204.field3224[var17] = arg9;
        int[][] var20 = class32.field459[class186.field2991].field266;
        label337: while (var14 != var38) {
            var15 = class52.field881[var14];
            var16 = class204.field3224[var14];
            var14 = var14 + 1 & 0xFFF;
            if (arg3 == var15 && arg8 == var16) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class32.field459[class186.field2991].method146(arg8, arg11 - 1, arg4, arg3, arg7, var16, var15, (byte) 92)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class32.field459[class186.field2991].method145(arg3, arg8, arg11 - 1, var15, 0, var16, arg7, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg0 != 0 && class32.field459[class186.field2991].method144(arg0, arg3, var15, 32213, arg8, arg6, arg4, arg1, var16)) {
                var18 = true;
                break;
            }
            int var21 = class332.field5270[var15][var16] + 1;
            if (var15 > 0 && class172.field2748[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x2C010E) == 0 && (var20[var15 - 1][arg4 + var16 - 1] & 0x2C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if ((arg4 - 1) <= var22) {
                        class52.field881[var38] = var15 - 1;
                        class204.field3224[var38] = var16;
                        var38 = var38 + 1 & 0xFFF;
                        class172.field2748[var15 - 1][var16] = 2;
                        class332.field5270[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x2C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class172.field2748[var15 + 1][var16] == 0 && (var20[var15 + arg4][var16] & 0x2C0183) == 0 && (var20[arg4 + var15][arg4 + var16 - 1] & 0x2C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= (arg4 - 1)) {
                        class52.field881[var38] = var15 + 1;
                        class204.field3224[var38] = var16;
                        class172.field2748[var15 + 1][var16] = 8;
                        class332.field5270[var15 + 1][var16] = var21;
                        var38 = var38 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 + arg4][var16 + var23] & 0x2C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class172.field2748[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x2C010E) == 0 && (var20[var15 + arg4 - 1][var16 - 1] & 0x2C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (arg4 - 1 <= var24) {
                        class52.field881[var38] = var15;
                        class204.field3224[var38] = var16 - 1;
                        var38 = var38 + 1 & 0xFFF;
                        class172.field2748[var15][var16 - 1] = 1;
                        class332.field5270[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class172.field2748[var15][var16 + 1] == 0 && (var20[var15][var16 + arg4] & 0x2C0138) == 0 && (var20[var15 + arg4 - 1][arg4 + var16] & 0x2C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (arg4 - 1 <= var25) {
                        class52.field881[var38] = var15;
                        class204.field3224[var38] = var16 + 1;
                        class172.field2748[var15][var16 + 1] = 4;
                        var38 = var38 + 1 & 0xFFF;
                        class332.field5270[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg4 + var16] & 0x2C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class172.field2748[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][var16 - 1] & 0x2C010E) == 0) {
                int var26 = 1;
                while (true) {
                    if (var26 >= arg4) {
                        class52.field881[var38] = var15 - 1;
                        class204.field3224[var38] = var16 - 1;
                        class172.field2748[var15 - 1][var16 - 1] = 3;
                        class332.field5270[var15 - 1][var16 - 1] = var21;
                        var38 = var38 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x2C013E) != 0 || (var20[var15 + var26 - 1][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class172.field2748[var15 + 1][var16 - 1] == 0 && (var20[arg4 + var15][var16 - 1] & 0x2C0183) == 0) {
                int var27 = 1;
                while (true) {
                    if (arg4 <= var27) {
                        class52.field881[var38] = var15 + 1;
                        class204.field3224[var38] = var16 - 1;
                        var38 = var38 + 1 & 0xFFF;
                        class172.field2748[var15 + 1][var16 - 1] = 9;
                        class332.field5270[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg4 + var15][var16 + var27 - 1] & 0x2C01E3) != 0 || (var20[var15 + var27][var16 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class172.field2748[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][arg4 + var16] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= arg4) {
                        class52.field881[var38] = var15 - 1;
                        class204.field3224[var38] = var16 + 1;
                        var38 = var38 + 1 & 0xFFF;
                        class172.field2748[var15 - 1][var16 + 1] = 6;
                        class332.field5270[var15 - 1][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28] & 0x2C013E) != 0 || (var20[var15 + var28 - 1][arg4 + var16] & 0x2C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class172.field2748[var15 + 1][var16 + 1] == 0 && (var20[var15 + arg4][arg4 + var16] & 0x2C01E0) == 0) {
                for (int var29 = 1; var29 < arg4; var29++) {
                    if ((var20[var15 + var29][arg4 + var16] & 0x2C01F8) != 0 || (var20[arg4 + var15][var16 + var29] & 0x2C01E3) != 0) {
                        continue label337;
                    }
                }
                class52.field881[var38] = var15 + 1;
                class204.field3224[var38] = var16 + 1;
                class172.field2748[var15 + 1][var16 + 1] = 12;
                var38 = var38 + 1 & 0xFFF;
                class332.field5270[var15 + 1][var16 + 1] = var21;
            }
        }
        if (!var18) {
            if (!arg2) {
                return;
            }
            int var30 = 1000;
            int var31 = 100;
            byte var32 = 10;
            for (int var33 = arg3 - var32; var33 <= (arg3 + var32); var33++) {
                for (int var34 = arg8 - var32; var34 <= arg8 + var32; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class332.field5270[var33][var34] < 100) {
                        int var35 = 0;
                        if (arg3 > var33) {
                            var35 = arg3 - var33;
                        } else if (var33 > arg3 + arg6 - 1) {
                            var35 = var33 + 1 - arg3 - arg6;
                        }
                        int var36 = 0;
                        if (arg8 > var34) {
                            var36 = arg8 - var34;
                        } else if (var34 > (arg0 + arg8 - 1)) {
                            var36 = 1 - arg8 - (arg0 - var34);
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var37 < var30 || var30 == var37 && var31 > class332.field5270[var33][var34]) {
                            var30 = var37;
                            var31 = class332.field5270[var33][var34];
                            var16 = var34;
                            var15 = var33;
                        }
                    }
                }
            }
            if (var30 == 1000) {
                return;
            }
            if (arg5 == var15 && arg9 == var16) {
                return;
            }
        }
        class335.field5305 = var16;
        class326.field5182 = false;
        class241.field3988 = var15;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(IB)Lbm;", line = 729)
    public static final class323 method973(int arg0, byte arg1) {
        class323 var2 = (class323) class16.field192.method2147((byte) -120, (long) arg0);
        field2123++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class129.field2185.method472(arg0, 61, 0);
        } else {
            var3 = class238.field3926.method472(arg0 & 0x7FFF, 70, 0);
        }
        class323 var4 = new class323();
        if (var3 != null) {
            var4.method2285(0, new class227(var3));
        }
        int var5 = -100 / ((-arg1 - 3) / 33);
        if (arg0 >= 32768) {
            var4.method2280((byte) 126);
        }
        class16.field192.method2149(var4, -32563, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(II)Lgf;", line = 763)
    public static final class31 method974(int arg0, int arg1) {
        class31 var2 = (class31) class216.field3467.method2329((byte) 107, (long) arg1);
        field2126++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class170.field2702.method472(arg1, 53, 4);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method219(-67, new class227(var3), arg1);
        }
        class216.field3467.method2333((long) arg1, 0, var4);
        if (arg0 >= -53) {
            field2120 = true;
        }
        return var4;
    }
}
