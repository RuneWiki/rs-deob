import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class126 extends class504 {

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "Lno;")
    private class658 field2106;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lsm;")
    private class262 field2110;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Lpv;")
    private class65 field2109;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    private int field2113;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    private int field2099;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[[F")
    private float[][] field2102;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "[[F")
    private float[][] field2111;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[[F")
    private float[][] field2107;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Leh;")
    private class335 field2117;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Lps;")
    private class85 field2114;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljw;")
    private class520 field2101;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lqn;")
    private class60 field2104;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Lgb;")
    private class202 field2118;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lgda;")
    private class51 field2108;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "Lgda;")
    private class51 field2121;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    private int field2119;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field2096 = -1;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "[I")
    public static int[] field2105 = new int[16384];

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "[I")
    public static int[] field2116 = new int[16384];

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
    public static boolean field2120;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field2115;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2116[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field2105[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field2120 = false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 5)
    public static void method970(byte arg0) {
        field2105 = null;
        int var1 = 66 % ((-arg0 - 55) / 63);
        field2116 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIII)V", line = 22)
    private final void method971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2100++;
        long var8 = -1L;
        int var10 = arg5 + (arg0 << this.field2110.field2245);
        int var11 = (arg2 << this.field2110.field2245) + arg3;
        int var12 = this.field2110.method200(var10, var11);
        if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class504 var13 = this.field2101.method2918(var8, (byte) -128);
            if (var13 != null) {
                this.method973(((class286) var13).field4030, (byte) 59);
                return;
            }
        }
        short var14 = (short) (this.field2112++);
        if (var8 != -1L) {
            this.field2101.method2911(var8, new class286(var14), (byte) -28);
        }
        if (arg1 != 5183) {
            this.method971(10, 18, -31, -127, 44, 3, 36);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg3 == 0) {
            var15 = this.field2107[arg6][arg4];
            var16 = this.field2102[arg6][arg4];
            var17 = this.field2111[arg6][arg4];
        } else if (this.field2110.field2250 == arg5 && arg3 == 0) {
            var16 = this.field2102[arg6 + 1][arg4];
            var15 = this.field2107[arg6 + 1][arg4];
            var17 = this.field2111[arg6 + 1][arg4];
        } else if (this.field2110.field2250 == arg5 && this.field2110.field2250 == arg3) {
            var16 = this.field2102[arg6 + 1][arg4 + 1];
            var17 = this.field2111[arg6 + 1][arg4 + 1];
            var15 = this.field2107[arg6 + 1][arg4 + 1];
        } else if (arg5 == 0 && this.field2110.field2250 == arg3) {
            var17 = this.field2111[arg6][arg4 + 1];
            var15 = this.field2107[arg6][arg4 + 1];
            var16 = this.field2102[arg6][arg4 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field2110.field2250;
            float var19 = (float) arg3 / (float) this.field2110.field2250;
            float var20 = this.field2107[arg6][arg4];
            float var21 = this.field2111[arg6][arg4];
            float var22 = this.field2102[arg6][arg4];
            float var23 = this.field2107[arg6 + 1][arg4];
            float var24 = this.field2111[arg6 + 1][arg4];
            float var25 = (this.field2111[arg6][arg4 + 1] - var21) * var18 + var21;
            float var26 = (this.field2111[arg6 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = this.field2102[arg6 + 1][arg4];
            float var28 = (this.field2107[arg6 + 1][arg4 + 1] - var23) * var18 + var23;
            float var29 = (this.field2107[arg6][arg4 + 1] - var20) * var18 + var20;
            float var30 = (this.field2102[arg6][arg4 + 1] - var22) * var18 + var22;
            float var31 = (this.field2102[arg6 + 1][arg4 + 1] - var27) * var18 + var27;
            var17 = (var26 - var25) * var19 + var25;
            var15 = (var28 - var29) * var19 + var29;
            var16 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field2109.method515((byte) 126) - var10);
        float var33 = (float) (this.field2109.method516(arg1 - 23919) - var12);
        float var34 = (float) (this.field2109.method518((byte) -98) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field2109.method522(-127);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var38 + var15 * var39 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field2109.method514(arg1 ^ 0x1475);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFC7) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field2106.field9272) {
            this.field2114.method693((float) var10, 87);
            this.field2114.method693((float) var12, arg1 - 5056);
            this.field2114.method693((float) var11, 90);
        } else {
            this.field2114.method692(-85, (float) var10);
            this.field2114.method692(126, (float) var12);
            this.field2114.method692(-109, (float) var11);
        }
        this.field2114.method1980(-345277664, var45);
        this.field2114.method1980(-345277664, var46);
        this.field2114.method1980(arg1 ^ 0xEB6B6F1F, var47);
        this.field2114.method1980(-345277664, 255);
        this.method973(var14, (byte) 86);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZII[[Z)V", line = 209)
    public final void method972(int arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4) {
        field2103++;
        if (this.field2104 == null || this.field2097 > arg0 + arg2 || this.field2113 < arg0 - arg2 || arg2 + arg3 < this.field2098 || this.field2099 < arg3 - arg2) {
            return;
        }
        for (int var6 = this.field2098; var6 <= this.field2099; var6++) {
            for (int var7 = this.field2097; var7 <= this.field2113; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg3;
                if (var8 > (-arg2) && var8 < arg2 && var9 > -arg2 && var9 < arg2 && arg4[var8 + arg2][arg2 + var9]) {
                    this.field2106.method3628(-3672, (int) (this.field2109.method519(true) * 255.0F) << 24);
                    this.field2106.method3661(this.field2121, this.field2108, null, null, 110);
                    this.field2106.method3605(0, this.field2104, this.field2119, 4, (byte) 6);
                    return;
                }
            }
        }
        if (arg1) {
            this.field2107 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(SB)V", line = 285)
    private final void method973(short arg0, byte arg1) {
        field2115++;
        if (this.field2106.field9272) {
            this.field2117.method2031((byte) 54, arg0);
        } else {
            this.field2117.method2008(27798, arg0);
        }
        this.field2119++;
        if (arg1 < 48) {
            this.field2097 = 117;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lno;Lsm;Lpv;[I)V", line = 305)
    public class126(class658 arg0, class262 arg1, class65 arg2, int[] arg3) {
        this.field2106 = arg0;
        this.field2110 = arg1;
        this.field2109 = arg2;
        int var5 = this.field2109.method522(123) - (arg1.field2250 >> 1);
        this.field2097 = this.field2109.method515((byte) 127) - var5 >> arg1.field2245;
        this.field2113 = var5 + this.field2109.method515((byte) 104) >> arg1.field2245;
        this.field2098 = this.field2109.method518((byte) -114) - var5 >> arg1.field2245;
        this.field2099 = var5 + this.field2109.method518((byte) -122) >> arg1.field2245;
        int var6 = this.field2113 + 1 - this.field2097;
        int var7 = this.field2099 + 1 - this.field2098;
        this.field2102 = new float[var6 + 1][var7 + 1];
        this.field2111 = new float[var6 + 1][var7 + 1];
        this.field2107 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var26 = this.field2098 + var8;
            if (var26 > 0 && var26 < this.field2110.field2248 - 1) {
                for (int var27 = 0; var27 <= var6; var27++) {
                    int var28 = var27 + this.field2097;
                    if (var28 > 0 && this.field2110.field2247 - 1 > var28) {
                        int var29 = arg1.method195(var28 + 1, var26) - arg1.method195(var28 - 1, var26);
                        int var30 = arg1.method195(var28, var26 + 1) - arg1.method195(var28, var26 - 1);
                        float var31 = (float) (1.0D / Math.sqrt((double) (var29 * var29 - (-(var30 * var30) - 65536))));
                        this.field2107[var27][var8] = (float) var29 * var31;
                        this.field2111[var27][var8] = var31 * -256.0F;
                        this.field2102[var27][var8] = (float) var30 * var31;
                    }
                }
            }
        }
        byte var9 = 0;
        int var10 = 0;
        for (int var11 = this.field2098; var11 <= this.field2099; var11++) {
            if (var11 >= 0 && var11 < arg1.field2248) {
                for (int var22 = this.field2097; var22 <= this.field2113; var22++) {
                    if (var22 >= 0 && arg1.field2247 > var22) {
                        int var23 = arg3[var10];
                        int[] var24 = arg1.field3627[var22][var11];
                        if (var24 != null && var23 != 0) {
                            if (var23 == 1) {
                                int var25 = 0;
                                while (var25 < var24.length) {
                                    if (var24[var25++] != -1 && var24[var25++] != -1 && var24[var25++] != -1) {
                                        this.field2119 += 3;
                                    }
                                }
                            } else {
                                this.field2119 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field2113 - this.field2097;
            }
        }
        if (var9 > 0) {
            this.field2117 = new class335(var9 * 2);
            this.field2114 = new class85(var9 * 16);
            this.field2101 = new class520(class587.method3231(true, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field2098; var14 <= this.field2099; var14++) {
                if (var14 >= 0 && var14 < arg1.field2248) {
                    int var15 = 0;
                    for (int var16 = this.field2097; var16 <= this.field2113; var16++) {
                        if (var16 >= 0 && arg1.field2247 > var16) {
                            int var17 = arg3[var13];
                            int[] var18 = arg1.field3627[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    int[] var19 = arg1.field3604[var16][var14];
                                    int[] var20 = arg1.field3610[var16][var14];
                                    int var21 = 0;
                                    label112: while (true) {
                                        while (true) {
                                            if (var21 >= var18.length) {
                                                break label112;
                                            }
                                            if (var18[var21] == -1 || var18[var21 + 1] == -1 || var18[var21 + 2] == -1) {
                                                var21 += 3;
                                            } else {
                                                this.method971(var16, 5183, var14, var20[var21], var12, var19[var21], var15);
                                                var21++;
                                                this.method971(var16, 5183, var14, var20[var21], var12, var19[var21], var15);
                                                var21++;
                                                this.method971(var16, 5183, var14, var20[var21], var12, var19[var21], var15);
                                                var21++;
                                            }
                                        }
                                    }
                                } else if (var17 == 3) {
                                    this.method971(var16, 5183, var14, 0, var12, 0, var15);
                                    this.method971(var16, 5183, var14, 0, var12, arg1.field2250, var15);
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, 0, var15);
                                } else if (var17 == 2) {
                                    this.method971(var16, 5183, var14, 0, var12, arg1.field2250, var15);
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, arg1.field2250, var15);
                                    this.method971(var16, 5183, var14, 0, var12, 0, var15);
                                } else if (var17 == 5) {
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, arg1.field2250, var15);
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, 0, var15);
                                    this.method971(var16, 5183, var14, 0, var12, arg1.field2250, var15);
                                } else if (var17 == 4) {
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, 0, var15);
                                    this.method971(var16, 5183, var14, 0, var12, 0, var15);
                                    this.method971(var16, 5183, var14, arg1.field2250, var12, arg1.field2250, var15);
                                }
                            }
                        }
                        var13++;
                        var15++;
                    }
                } else {
                    var13 += this.field2113 - this.field2097;
                }
                var12++;
            }
            this.field2104 = this.field2106.method3625(false, this.field2117.field4600, -7206, this.field2117.field4619, 5123);
            this.field2118 = this.field2106.method3641(16, this.field2114.field4600, false, 5225, this.field2114.field4619);
            this.field2108 = new class51(this.field2118, 5126, 3, 0);
            this.field2121 = new class51(this.field2118, 5121, 4, 12);
        } else {
            this.field2108 = null;
            this.field2118 = null;
            this.field2121 = null;
            this.field2104 = null;
        }
        this.field2107 = this.field2111 = this.field2102 = null;
        this.field2117 = null;
        this.field2114 = null;
        this.field2101 = null;
    }
}
