import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class626 {

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Lgt;")
    private class453 field170;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "Lov;")
    private class186 field181;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "Lbh;")
    private class36 field163;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[[F")
    private float[][] field168;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[[F")
    private float[][] field174;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[[F")
    private float[][] field177;

    @OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "Lmp;")
    private class758 field172;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "Lida;")
    private class234 field164;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "Ljaclib/memory/Stream;")
    private Stream field184;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljaclib/memory/Stream;")
    private Stream field159;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "Lcaa;")
    private class302 field169;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    private int field173;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "[F")
    public static float[] field175 = new float[16384];

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "[F")
    public static float[] field186 = new float[16384];

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "J")
    public static long field160 = -1L;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "Lqaa;")
    public static class27 field187;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Leq;")
    public static class209 field167;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIII[[Z)V")
    public final void method73(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field179++;
        if (this.field164 == null || (arg0 + arg1) < this.field171 || this.field165 < arg0 - arg1 || this.field161 > (arg1 + arg3) || this.field166 < (arg3 - arg1)) {
            return;
        }
        int var6 = -99 / ((arg2 - 53) / 33);
        for (int var7 = this.field161; var7 <= this.field166; var7++) {
            for (int var8 = this.field171; var8 <= this.field165; var8++) {
                int var9 = var8 - arg0;
                int var10 = var7 - arg3;
                if (var9 > (-arg1) && arg1 > var9 && var10 > (-arg1) && arg1 > var10 && arg4[arg1 + var9][var10 + arg1]) {
                    this.field170.method2717((byte) 27, (byte) ((int) (this.field163.method296((byte) 3) * 255.0F)));
                    this.field170.method1059(this.field169, 0, -104);
                    this.field170.method1014(this.field170.field6552, false);
                    this.field170.method1046(0, this.field173, this.field164, (byte) -125, this.field182 / 3, class428.field5978, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BS)V")
    private final void method74(byte arg0, short arg1) {
        if (arg0 != 8) {
            return;
        }
        field180++;
        if (Stream.method3762()) {
            this.field159.method3766(arg1);
        } else {
            this.field159.method3768(arg1);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZIIII)V")
    private final void method75(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field178++;
        if (!arg2) {
            return;
        }
        long var8 = -1L;
        int var10 = (arg1 << this.field181.field3915) + arg6;
        int var11 = arg5 + (arg0 << this.field181.field3915);
        int var12 = this.field181.method1827(-3458, var10, var11);
        if ((arg6 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class626 var13 = this.field172.method4203(true, var8);
            if (var13 != null) {
                this.method74((byte) 8, ((class239) var13).field3369);
                return;
            }
        }
        short var14 = (short) (this.field173++);
        if (var8 != -1L) {
            this.field172.method4211(new class239(var14), (byte) 107, var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg5 == 0) {
            var15 = this.field168[arg3][arg4];
            var16 = this.field174[arg3][arg4];
            var17 = this.field177[arg3][arg4];
        } else if (this.field181.field3920 == arg6 && arg5 == 0) {
            var15 = this.field168[arg3 + 1][arg4];
            var16 = this.field174[arg3 + 1][arg4];
            var17 = this.field177[arg3 + 1][arg4];
        } else if (this.field181.field3920 == arg6 && this.field181.field3920 == arg5) {
            var16 = this.field174[arg3 + 1][arg4 + 1];
            var17 = this.field177[arg3 + 1][arg4 + 1];
            var15 = this.field168[arg3 + 1][arg4 + 1];
        } else if (arg6 == 0 && this.field181.field3920 == arg5) {
            var15 = this.field168[arg3][arg4 + 1];
            var16 = this.field174[arg3][arg4 + 1];
            var17 = this.field177[arg3][arg4 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field181.field3920;
            float var19 = (float) arg5 / (float) this.field181.field3920;
            float var20 = this.field177[arg3][arg4];
            float var21 = this.field174[arg3][arg4];
            float var22 = this.field168[arg3][arg4];
            float var23 = this.field177[arg3 + 1][arg4];
            float var24 = this.field174[arg3 + 1][arg4];
            float var25 = (this.field168[arg3][arg4 + 1] - var22) * var18 + var22;
            float var26 = (this.field174[arg3 + 1][arg4 + 1] - var24) * var18 + var24;
            float var27 = (this.field174[arg3][arg4 + 1] - var21) * var18 + var21;
            float var28 = (this.field177[arg3][arg4 + 1] - var20) * var18 + var20;
            float var29 = (this.field177[arg3 + 1][arg4 + 1] - var23) * var18 + var23;
            float var30 = this.field168[arg3 + 1][arg4];
            var17 = (var29 - var28) * var19 + var28;
            var16 = (var26 - var27) * var19 + var27;
            float var31 = (this.field168[arg3 + 1][arg4 + 1] - var30) * var18 + var30;
            var15 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field163.method290((byte) -119) - var10);
        float var33 = (float) (this.field163.method298(!arg2) - var12);
        float var34 = (float) (this.field163.method291(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var34 * var36;
        float var38 = var32 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field163.method294(103);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var15 * var37 + var16 * var39 + var17 * var38;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field163.method292(6865);
        int var45 = (int) ((float) ((var44 & 0xFFEF03) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE5) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3762()) {
            this.field184.method3774((float) var10);
            this.field184.method3774((float) var12);
            this.field184.method3774((float) var11);
        } else {
            this.field184.method3770((float) var10);
            this.field184.method3770((float) var12);
            this.field184.method3770((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field170.field6498 == 0) {
            this.field184.method3772(var47);
            this.field184.method3772(var46);
            this.field184.method3772(var45);
        } else {
            this.field184.method3772(var45);
            this.field184.method3772(var46);
            this.field184.method3772(var47);
        }
        this.field184.method3772(255);
        this.method74((byte) 8, var14);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)V")
    public static final void method76(boolean arg0) {
        field185++;
        for (class726 var1 = (class726) class562.field7965.method1522(arg0); var1 != null; var1 = (class726) class562.field7965.method1527((byte) 74)) {
            class676 var2 = var1.field10159;
            if (var2.field9525 < class605.field8787) {
                var1.method3617(1);
                var2.method3822((byte) -53);
            } else if (var2.field9503 <= class605.field8787) {
                var2.method3821((byte) 68);
                if (var2.field9517 > 0) {
                    class272 var3 = (class272) class758.field10539.method4203(true, (long) (var2.field9517 - 1));
                    if (var3 != null) {
                        class84 var4 = var3.field3885;
                        if (var4.field644 >= 0 && var4.field644 < class174.field2540 * 512 && var4.field648 >= 0 && (class716.field9999 * 512) > var4.field648) {
                            var2.method3825(var4.field644, class534.method3136(1, var2.field649, var4.field644, var4.field648) - var2.field9529, 122, var4.field648, class605.field8787);
                        }
                    }
                }
                if (var2.field9517 < 0) {
                    int var5 = -var2.field9517 - 1;
                    class349 var6;
                    if (class675.field9486 == var5) {
                        var6 = class468.field6748;
                    } else {
                        var6 = class165.field2442[var5];
                    }
                    if (var6 != null && var6.field644 >= 0 && var6.field644 < (class174.field2540 * 512) && var6.field648 >= 0 && class716.field9999 * 512 > var6.field648) {
                        var2.method3825(var6.field644, class534.method3136(1, var2.field649, var6.field644, var6.field648) - var2.field9529, 38, var6.field648, class605.field8787);
                    }
                }
                var2.method3826(false, class373.field5232);
                class714.method3977(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Llda;Llda;IIZ)I")
    public static final int method77(class483 arg0, class483 arg1, int arg2, int arg3, boolean arg4) {
        field176++;
        if (arg2 == 1) {
            int var5 = arg0.field9247;
            int var6 = arg1.field9247;
            if (!arg4) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class594.method3412(-8322, arg1.method2911((byte) -73).field6162, class744.field10426, arg0.method2911((byte) -98).field6162);
        } else if (arg2 == 3) {
            if (arg0.field6842.equals("-")) {
                if (arg1.field6842.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field6842.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class594.method3412(-8322, arg1.field6842, class744.field10426, arg0.field6842);
            }
        } else if (arg2 == 4) {
            if (arg0.method3699(arg3 ^ 0xFFFFE8FF)) {
                return arg1.method3699(0) ? 0 : 1;
            } else if (arg1.method3699(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 5) {
            if (arg3 != -5889) {
                field160 = -69L;
            }
            if (arg2 == 6) {
                if (arg0.method3704(-125)) {
                    return arg1.method3704(-40) ? 0 : 1;
                } else if (arg1.method3704(105)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 7) {
                if (arg0.method3702(68)) {
                    return arg1.method3702(103) ? 0 : 1;
                } else if (arg1.method3702(85)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 8) {
                int var7 = arg0.field6844;
                int var8 = arg1.field6844;
                if (arg4) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg0.field6838 - arg1.field6838;
            }
        } else if (arg0.method3701(-24460)) {
            return arg1.method3701(-24460) ? 0 : 1;
        } else if (arg1.method3701(-24460)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)V")
    public static void method78(boolean arg0) {
        field175 = null;
        field186 = null;
        if (arg0) {
            field187 = null;
            field167 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lak;I)V")
    public static final void method79(class349 arg0, int arg1) {
        if (arg1 <= 19) {
            return;
        }
        field183++;
        class235 var2 = (class235) class720.field10084.method4203(true, (long) arg0.field931);
        if (var2 == null) {
            return;
        }
        if (var2.field3338 != null) {
            class484.field6848.method4051(var2.field3338);
            var2.field3338 = null;
        }
        var2.method3617(1);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIII)V")
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 72) {
            return;
        }
        for (class391 var7 = (class391) class99.field1678.method4159(0); var7 != null; var7 = (class391) class99.field1678.method4151(7)) {
            if (var7.field5462 <= class605.field8787) {
                var7.method909(81);
            } else {
                class590.method3387(var7.field5467, (var7.field5461 << 9) + 256, arg5 >> 1, var7.field5465 * 2, arg1, arg3, (var7.field5457 << 9) + 256, (byte) 100, arg0 >> 1);
                class537.field7568.method651(class686.field9681[0] + arg4, arg6 - -class686.field9681[1], var7.field5458, var7.field5463 | 0xFF000000, (byte) -122, 0);
            }
        }
        field162++;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lgt;Lov;Lbh;[I)V")
    public class14(class453 arg0, class186 arg1, class36 arg2, int[] arg3) {
        this.field170 = arg0;
        this.field181 = arg1;
        this.field163 = arg2;
        int var5 = this.field163.method294(67) - (arg1.field3920 >> 1);
        this.field171 = this.field163.method290((byte) -128) - var5 >> arg1.field3915;
        this.field165 = this.field163.method290((byte) -116) + var5 >> arg1.field3915;
        this.field161 = this.field163.method291(0) - var5 >> arg1.field3915;
        this.field166 = var5 + this.field163.method291(0) >> arg1.field3915;
        int var6 = this.field165 + 1 - this.field171;
        int var7 = this.field166 - (this.field161 - 1);
        this.field168 = new float[var6 + 1][var7 + 1];
        this.field174 = new float[var6 + 1][var7 + 1];
        this.field177 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field161 + var8;
            if (var27 > 0 && var27 < this.field181.field3914 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field171 + var28;
                    if (var29 > 0 && this.field181.field3924 - 1 > var29) {
                        int var30 = arg1.method1825(var27, -128, var29 + 1) - arg1.method1825(var27, -128, var29 - 1);
                        int var31 = arg1.method1825(var27 + 1, -128, var29) - arg1.method1825(var27 - 1, -128, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + (var30 * var30 + 65536))));
                        this.field177[var28][var8] = (float) var30 * var32;
                        this.field174[var28][var8] = var32 * -256.0F;
                        this.field168[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field161; var10 <= this.field166; var10++) {
            if (var10 >= 0 && arg1.field3914 > var10) {
                for (int var23 = this.field171; var23 <= this.field165; var23++) {
                    if (var23 >= 0 && var23 < arg1.field3924) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field2658[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field182 += 3;
                                    }
                                }
                            } else {
                                this.field182 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field165 - this.field171;
            }
        }
        if (this.field182 > 0) {
            this.field172 = new class758(class613.method3530(false, this.field182));
            this.field164 = this.field170.method1047(-68, false);
            this.field164.method1600(this.field182, 111);
            NativeHeapBuffer var11 = this.field170.method2766(this.field182 * 16, 0, false);
            this.field184 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field164.method1599(true, (byte) -104);
                } while (var12 == null);
                this.field159 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field161; var15 <= this.field166; var15++) {
                    if (var15 >= 0 && var15 < arg1.field3914) {
                        int var16 = 0;
                        for (int var17 = this.field171; var17 <= this.field165; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3924) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field2658[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field2659[var17][var15];
                                        int[] var21 = arg1.field2649[var17][var15];
                                        int var22 = 0;
                                        label121: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label121;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method75(var15, var17, true, var16, var14, var21[var22], var20[var22]);
                                                    var22++;
                                                    this.method75(var15, var17, true, var16, var14, var21[var22], var20[var22]);
                                                    var22++;
                                                    this.method75(var15, var17, true, var16, var14, var21[var22], var20[var22]);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method75(var15, var17, true, var16, var14, 0, 0);
                                        this.method75(var15, var17, true, var16, var14, 0, arg1.field3920);
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, 0);
                                    } else if (var18 == 2) {
                                        this.method75(var15, var17, true, var16, var14, 0, arg1.field3920);
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, arg1.field3920);
                                        this.method75(var15, var17, true, var16, var14, 0, 0);
                                    } else if (var18 == 5) {
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, arg1.field3920);
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, 0);
                                        this.method75(var15, var17, true, var16, var14, 0, arg1.field3920);
                                    } else if (var18 == 4) {
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, 0);
                                        this.method75(var15, var17, true, var16, var14, 0, 0);
                                        this.method75(var15, var17, true, var16, var14, arg1.field3920, arg1.field3920);
                                    }
                                }
                            }
                            var13++;
                            var16++;
                        }
                    } else {
                        var13 += this.field165 - this.field171;
                    }
                    var14++;
                }
                this.field159.method3761();
                if (this.field164.method1601(-15)) {
                    this.field184.method3761();
                    this.field169 = this.field170.method1036((byte) -46, false);
                    this.field169.method1495(var11, 16, this.field173 * 16, (byte) 109);
                    break;
                }
                this.field184.method3775(0);
                this.field172.method4204((byte) -56);
            }
        } else {
            this.field164 = null;
            this.field169 = null;
        }
        this.field159 = null;
        this.field184 = null;
        this.field172 = null;
        this.field177 = this.field174 = this.field168 = null;
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field175[var2] = (float) Math.sin((double) var2 * var0);
            field186[var2] = (float) Math.cos((double) var2 * var0);
        }
        field187 = new class27(50, 0);
    }
}
