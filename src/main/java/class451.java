import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class451 extends class108 {

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Lww;")
    private class592 field6385;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Luo;")
    private class171 field6373;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lre;")
    private class582 field6390;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    private int field6382;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    private int field6393;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    private int field6377;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    private int field6386;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "[[F")
    private float[][] field6383;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "[[F")
    private float[][] field6388;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[[F")
    private float[][] field6375;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    private int field6376;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "Llca;")
    private class133 field6380;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "Lbd;")
    private class180 field6378;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "Lba;")
    private class607 field6387;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6379;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Ljaclib/memory/Stream;")
    private Stream field6384;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    private int field6371;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lbda;")
    public static class401 field6394 = new class401("WTI", 5);

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII[[Z)V")
    public final void method2621(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field6392++;
        if (this.field6378 == null || this.field6382 > (arg2 + arg3) || this.field6393 < (arg2 - arg3) || arg0 + arg3 < this.field6377) {
            return;
        }
        if (arg1 <= 78) {
            this.method2624(-121, 124, 65, -86, -18, -122, (byte) 122);
        }
        if (this.field6386 < arg0 - arg3) {
            return;
        }
        for (int var6 = this.field6377; var6 <= this.field6386; var6++) {
            for (int var7 = this.field6382; var7 <= this.field6393; var7++) {
                int var8 = var7 - arg2;
                int var9 = var6 - arg0;
                if ((-arg3) < var8 && var8 < arg3 && var9 > (-arg3) && arg3 > var9 && arg4[arg3 + var8][arg3 + var9]) {
                    this.field6390.method3356((byte) ((int) (this.field6385.method3422(55) * 255.0F)), (byte) -112);
                    this.field6390.method1207(this.field6390.field8411, 1);
                    this.field6390.method1171(this.field6380, 0, (byte) -98);
                    this.field6390.method1212(class546.field7613, this.field6378, this.field6371, -122, 0, this.field6376 / 3, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBIII[BI[BI)V")
    public static final void method2622(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field6372++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg7[var10001] += arg5[arg3++];
                int var14 = arg6++;
                arg7[var14] += arg5[arg3++];
                int var15 = arg6++;
                arg7[var15] += arg5[arg3++];
                int var16 = arg6++;
                arg7[var16] += arg5[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg7[var10001] += arg5[arg3++];
            }
            arg6 += arg4;
            arg3 += arg2;
        }
        if (arg1 >= -43) {
            method2623(false, -45);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public static final void method2623(boolean arg0, int arg1) {
        field6381++;
        if (class21.field303.length() == 0) {
            return;
        }
        class311.method1872(-4408, "--> " + class21.field303);
        class288.method1781((byte) 90, class21.field303, arg0, false);
        if (arg1 != -32567) {
            method2623(true, 21);
        }
        class21.field303 = "";
        class478.field6718 = 0;
        class191.field2468 = 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIB)V")
    private final void method2624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6389++;
        long var8 = -1L;
        int var10 = 2 / ((-arg6 - 36) / 55);
        int var11 = (arg3 << this.field6373.field7583) + arg1;
        int var12 = arg5 + (arg2 << this.field6373.field7583);
        int var13 = this.field6373.method1040(var11, var12);
        if ((arg1 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = (long) var11 & 0xFFFFL | 0xFFFFL << 16 & (long) var12 << 16;
            class108 var14 = this.field6387.method3476(var8, (byte) 28);
            if (var14 != null) {
                this.method2626(((class149) var14).field1928, -1);
                return;
            }
        }
        short var15 = (short) (this.field6371++);
        if (var8 != -1L) {
            this.field6387.method3475(-114, new class149(var15), var8);
        }
        float var16;
        float var17;
        float var18;
        if (arg1 == 0 && arg5 == 0) {
            var16 = this.field6383[arg4][arg0];
            var17 = this.field6388[arg4][arg0];
            var18 = this.field6375[arg4][arg0];
        } else if (this.field6373.field7582 == arg1 && arg5 == 0) {
            var17 = this.field6388[arg4 + 1][arg0];
            var18 = this.field6375[arg4 + 1][arg0];
            var16 = this.field6383[arg4 + 1][arg0];
        } else if (this.field6373.field7582 == arg1 && this.field6373.field7582 == arg5) {
            var18 = this.field6375[arg4 + 1][arg0 + 1];
            var16 = this.field6383[arg4 + 1][arg0 + 1];
            var17 = this.field6388[arg4 + 1][arg0 + 1];
        } else if (arg1 == 0 && this.field6373.field7582 == arg5) {
            var16 = this.field6383[arg4][arg0 + 1];
            var17 = this.field6388[arg4][arg0 + 1];
            var18 = this.field6375[arg4][arg0 + 1];
        } else {
            float var19 = (float) arg1 / (float) this.field6373.field7582;
            float var20 = (float) arg5 / (float) this.field6373.field7582;
            float var21 = this.field6388[arg4][arg0];
            float var22 = this.field6383[arg4][arg0];
            float var23 = this.field6375[arg4][arg0];
            float var24 = this.field6388[arg4 + 1][arg0];
            float var25 = this.field6383[arg4 + 1][arg0];
            float var26 = (this.field6375[arg4][arg0 + 1] - var23) * var19 + var23;
            float var27 = (this.field6388[arg4][arg0 + 1] - var21) * var19 + var21;
            float var28 = (this.field6388[arg4 + 1][arg0 + 1] - var24) * var19 + var24;
            float var29 = (this.field6383[arg4][arg0 + 1] - var22) * var19 + var22;
            float var30 = this.field6375[arg4 + 1][arg0];
            float var31 = (this.field6383[arg4 + 1][arg0 + 1] - var25) * var19 + var25;
            var16 = (var31 - var29) * var20 + var29;
            float var32 = (this.field6375[arg4 + 1][arg0 + 1] - var30) * var19 + var30;
            var17 = (var28 - var27) * var20 + var27;
            var18 = (var32 - var26) * var20 + var26;
        }
        float var33 = (float) (this.field6385.method3414(232) - var11);
        float var34 = (float) (this.field6385.method3416(-2) - var13);
        float var35 = (float) (this.field6385.method3415((byte) 117) - var12);
        float var36 = (float) Math.sqrt((double) (var35 * var35 + var33 * var33 + var34 * var34));
        float var37 = 1.0F / var36;
        float var38 = var35 * var37;
        float var39 = var33 * var37;
        float var40 = var34 * var37;
        float var41 = var36 / (float) this.field6385.method3420(true);
        float var42 = 1.0F - var41 * var41;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var18 * var38 + var16 * var40 + var17 * var39;
        if (var43 < 0.0F) {
            var43 = 0.0F;
        }
        float var44 = var42 * var43 * 2.0F;
        if (var44 > 1.0F) {
            var44 = 1.0F;
        }
        int var45 = this.field6385.method3419(81);
        int var46 = (int) ((float) ((var45 & 0xFFA553) >> 16) * var44);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var45 >> 8 & 0xFF) * var44);
        if (var47 > 255) {
            var47 = 255;
        }
        int var48 = (int) ((float) (var45 & 0xFF) * var44);
        if (Stream.method3209()) {
            this.field6379.method3197((float) var11);
            this.field6379.method3197((float) var13);
            this.field6379.method3197((float) var12);
        } else {
            this.field6379.method3206((float) var11);
            this.field6379.method3206((float) var13);
            this.field6379.method3206((float) var12);
        }
        if (var48 > 255) {
            var48 = 255;
        }
        if (this.field6390.field8376 == 0) {
            this.field6379.method3205(var48);
            this.field6379.method3205(var47);
            this.field6379.method3205(var46);
        } else {
            this.field6379.method3205(var46);
            this.field6379.method3205(var47);
            this.field6379.method3205(var48);
        }
        this.field6379.method3205(255);
        this.method2626(var15, -1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method2625(byte arg0) {
        if (arg0 <= 85) {
            method2625((byte) -69);
        }
        field6394 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(SI)V")
    private final void method2626(short arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field6391++;
        if (Stream.method3209()) {
            this.field6384.method3198(arg0);
        } else {
            this.field6384.method3203(arg0);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BZ)V")
    public static final void method2627(byte arg0, boolean arg1) {
        class147.method802((byte) 49);
        field6374++;
        if (!class168.method1004(class630.field9188, -12)) {
            return;
        }
        class426.field5796++;
        if (arg0 != 120 || class426.field5796 < 50 && !arg1) {
            return;
        }
        class426.field5796 = 0;
        if (!class170.field2155 && class96.field1294 != null) {
            class118.method650(true, class45.field637);
            class275.field3578++;
            try {
                class96.field1294.method3265(class272.field3457.field7707, 0, (byte) 121, class272.field3457.field7693);
                class272.field3457.field7707 = 0;
            } catch (IOException var2) {
                class170.field2155 = true;
            }
        }
        class147.method802((byte) 49);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lre;Luo;Lww;[I)V")
    public class451(class582 arg0, class171 arg1, class592 arg2, int[] arg3) {
        this.field6385 = arg2;
        this.field6373 = arg1;
        this.field6390 = arg0;
        int var5 = this.field6385.method3420(true) - (arg1.field7582 >> 1);
        this.field6382 = this.field6385.method3414(232) - var5 >> arg1.field7583;
        this.field6393 = var5 + this.field6385.method3414(232) >> arg1.field7583;
        this.field6377 = this.field6385.method3415((byte) 117) - var5 >> arg1.field7583;
        this.field6386 = this.field6385.method3415((byte) 117) + var5 >> arg1.field7583;
        int var6 = this.field6393 + 1 - this.field6382;
        int var7 = this.field6386 + 1 - this.field6377;
        this.field6383 = new float[var6 + 1][var7 + 1];
        this.field6388 = new float[var6 + 1][var7 + 1];
        this.field6375 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = this.field6377 + var8;
            if (var25 > 0 && var25 < this.field6373.field7585 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field6382 + var26;
                    if (var27 > 0 && (this.field6373.field7581 - 1) > var27) {
                        int var28 = arg1.method1031(var27 + 1, var25) - arg1.method1031(var27 - 1, var25);
                        int var29 = arg1.method1031(var27, var25 + 1) - arg1.method1031(var27, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var28 * var28 + var29 * var29 + 65536)));
                        this.field6388[var26][var8] = (float) var28 * var30;
                        this.field6383[var26][var8] = var30 * -256.0F;
                        this.field6375[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field6377; var10 <= this.field6386; var10++) {
            if (var10 >= 0 && arg1.field7585 > var10) {
                for (int var22 = this.field6382; var22 <= this.field6393; var22++) {
                    if (var22 >= 0 && arg1.field7581 > var22) {
                        int var23 = arg3[var9];
                        int[] var24 = arg1.field2178[var22][var10];
                        if (var24 != null && var23 != 0) {
                            this.field6376 += var23 == 1 ? var24.length : 3;
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field6393 - this.field6382;
            }
        }
        if (this.field6376 <= 0) {
            this.field6380 = null;
            this.field6378 = null;
        } else {
            this.field6387 = new class607(class468.method2685(this.field6376, false));
            this.field6378 = this.field6390.method1188((byte) 114, false);
            this.field6378.method292(false, this.field6376);
            NativeHeapBuffer var11 = this.field6390.method3311(this.field6376 * 16, false, -20127);
            this.field6379 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field6378.method297((byte) 52, true);
                } while (var12 == null);
                this.field6384 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field6377; var15 <= this.field6386; var15++) {
                    if (var15 >= 0 && arg1.field7585 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field6382; var17 <= this.field6393; var17++) {
                            if (var17 >= 0 && arg1.field7581 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field2178[var17][var15];
                                int[] var20 = arg1.field2190[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        for (int var21 = 0; var21 < var19.length; var21++) {
                                            this.method2624(var14, var19[var21], var15, var17, var16, var20[var21], (byte) -120);
                                        }
                                    } else if (var18 == 3) {
                                        this.method2624(var14, 0, var15, var17, var16, 0, (byte) -91);
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, 0, (byte) -98);
                                        this.method2624(var14, 0, var15, var17, var16, arg1.field7582, (byte) 24);
                                    } else if (var18 == 2) {
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, 0, (byte) -96);
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, arg1.field7582, (byte) -107);
                                        this.method2624(var14, 0, var15, var17, var16, 0, (byte) 53);
                                    } else if (var18 == 5) {
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, arg1.field7582, (byte) 114);
                                        this.method2624(var14, 0, var15, var17, var16, arg1.field7582, (byte) -111);
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, 0, (byte) 30);
                                    } else if (var18 == 4) {
                                        this.method2624(var14, 0, var15, var17, var16, arg1.field7582, (byte) 66);
                                        this.method2624(var14, 0, var15, var17, var16, 0, (byte) -102);
                                        this.method2624(var14, arg1.field7582, var15, var17, var16, arg1.field7582, (byte) 124);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field6393 - this.field6382;
                    }
                    var14++;
                }
                this.field6384.method3207();
                if (this.field6378.method290(22526)) {
                    this.field6379.method3207();
                    this.field6380 = this.field6390.method1197(10, false);
                    this.field6380.method704(var11, this.field6371 * 16, (byte) 114, 16);
                    break;
                }
                this.field6379.method3204(0);
                this.field6387.method3472((byte) -128);
            }
        }
        this.field6387 = null;
        this.field6388 = this.field6383 = this.field6375 = null;
        this.field6384 = null;
        this.field6379 = null;
    }

    static {
        new class344("Ok", "Okay", "OK", "Ok");
    }
}
