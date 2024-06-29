import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class532 extends class665 {

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "Lrc;")
    private class498 field7459;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "Lhea;")
    private class387 field7469;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "Lni;")
    private class481 field7468;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "I")
    private int field7470;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    private int field7463;

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    private int field7472;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    private int field7453;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "[[F")
    private float[][] field7456;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "[[F")
    private float[][] field7467;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "[[F")
    private float[][] field7460;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    private int field7465;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "Lkea;")
    private class213 field7466;

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Lrn;")
    private class241 field7471;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7452;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field7454;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "Lbca;")
    private class613 field7458;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    private int field7455;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "Lgi;")
    public static class630 field7462 = new class630();

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 3)
    public static void method3031(int arg0) {
        int var1 = -18 % ((13 - arg0) / 54);
        field7462 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BS)V", line = 12)
    private final void method3032(byte arg0, short arg1) {
        field7464++;
        if (Stream.method3483()) {
            this.field7454.method3475(arg1);
        } else {
            this.field7454.method3472(arg1);
        }
        if (arg0 <= 104) {
            this.field7468 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II[[ZII)V", line = 53)
    public final void method3033(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4) {
        field7461++;
        if (this.field7471 == null || (arg0 + arg1) < this.field7470 || (arg0 - arg1) > this.field7463 || arg3 + arg1 < this.field7472 || arg3 - arg1 > this.field7453) {
            return;
        }
        if (arg4 != 0) {
            method3034(55, null);
        }
        for (int var6 = this.field7472; var6 <= this.field7453; var6++) {
            for (int var7 = this.field7470; var7 <= this.field7463; var7++) {
                int var8 = var7 - arg0;
                int var9 = var6 - arg3;
                if (-arg1 < var8 && arg1 > var8 && var9 > -arg1 && arg1 > var9 && arg2[arg1 + var8][var9 + arg1]) {
                    this.field7469.method2380((byte) ((int) (this.field7459.method2876(arg4 + 1) * 255.0F)), false);
                    this.field7469.method1865(0, -26558, this.field7458);
                    this.field7469.method1883(-64, this.field7469.field5736);
                    this.field7469.method1874(class80.field1355, this.field7465 / 3, 0, true, this.field7471, this.field7455, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILmo;)Ljava/lang/String;", line = 112)
    public static final String method3034(int arg0, class695 arg1) {
        field7457++;
        if (arg0 >= -1) {
            method3031(36);
        }
        return class165.method1141(32767, (byte) 121, arg1);
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lhea;Lni;Lrc;[I)V", line = 123)
    public class532(class387 arg0, class481 arg1, class498 arg2, int[] arg3) {
        this.field7459 = arg2;
        this.field7469 = arg0;
        this.field7468 = arg1;
        int var5 = this.field7459.method2880(-15) - (arg1.field629 >> 1);
        this.field7470 = this.field7459.method2883(126) - var5 >> arg1.field625;
        this.field7463 = var5 + this.field7459.method2883(127) >> arg1.field625;
        this.field7472 = this.field7459.method2875(true) - var5 >> arg1.field625;
        this.field7453 = var5 + this.field7459.method2875(true) >> arg1.field625;
        int var6 = this.field7463 - (this.field7470 - 1);
        int var7 = this.field7453 + 1 - this.field7472;
        this.field7456 = new float[var6 + 1][var7 + 1];
        this.field7467 = new float[var6 + 1][var7 + 1];
        this.field7460 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = var8 + this.field7472;
            if (var27 > 0 && var27 < this.field7468.field632 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field7470;
                    if (var29 > 0 && this.field7468.field631 - 1 > var29) {
                        int var30 = arg1.method432(var29 + 1, false, var27) - arg1.method432(var29 - 1, false, var27);
                        int var31 = arg1.method432(var29, false, var27 + 1) - arg1.method432(var29, false, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field7456[var28][var8] = (float) var30 * var32;
                        this.field7460[var28][var8] = var32 * -256.0F;
                        this.field7467[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field7472; var10 <= this.field7453; var10++) {
            if (var10 >= 0 && var10 < arg1.field632) {
                for (int var23 = this.field7470; var23 <= this.field7463; var23++) {
                    if (var23 >= 0 && var23 < arg1.field631) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field6812[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field7465 += 3;
                                    }
                                }
                            } else {
                                this.field7465 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field7463 - this.field7470;
            }
        }
        if (this.field7465 > 0) {
            this.field7466 = new class213(class2.method9(this.field7465, 111));
            this.field7471 = this.field7469.method1863((byte) 126, false);
            this.field7471.method1(-107, this.field7465);
            NativeHeapBuffer var11 = this.field7469.method2333(this.field7465 * 16, (byte) 70, false);
            this.field7452 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field7471.method5(true, 111);
                } while (var12 == null);
                this.field7454 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field7472; var15 <= this.field7453; var15++) {
                    if (var15 >= 0 && arg1.field632 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field7470; var17 <= this.field7463; var17++) {
                            if (var17 >= 0 && arg1.field631 > var17) {
                                int var18 = arg3[var13];
                                int[] var19 = arg1.field6812[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field6816[var17][var15];
                                        int[] var21 = arg1.field6828[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3035(var21[var22], var15, var14, var16, var17, var20[var22], (byte) 125);
                                                    var22++;
                                                    this.method3035(var21[var22], var15, var14, var16, var17, var20[var22], (byte) 126);
                                                    var22++;
                                                    this.method3035(var21[var22], var15, var14, var16, var17, var20[var22], (byte) 127);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3035(0, var15, var14, var16, var17, 0, (byte) 125);
                                        this.method3035(0, var15, var14, var16, var17, arg1.field629, (byte) 123);
                                        this.method3035(arg1.field629, var15, var14, var16, var17, 0, (byte) 125);
                                    } else if (var18 == 2) {
                                        this.method3035(0, var15, var14, var16, var17, arg1.field629, (byte) 124);
                                        this.method3035(arg1.field629, var15, var14, var16, var17, arg1.field629, (byte) 123);
                                        this.method3035(0, var15, var14, var16, var17, 0, (byte) 125);
                                    } else if (var18 == 5) {
                                        this.method3035(arg1.field629, var15, var14, var16, var17, arg1.field629, (byte) 126);
                                        this.method3035(arg1.field629, var15, var14, var16, var17, 0, (byte) 127);
                                        this.method3035(0, var15, var14, var16, var17, arg1.field629, (byte) 124);
                                    } else if (var18 == 4) {
                                        this.method3035(arg1.field629, var15, var14, var16, var17, 0, (byte) 125);
                                        this.method3035(0, var15, var14, var16, var17, 0, (byte) 124);
                                        this.method3035(arg1.field629, var15, var14, var16, var17, arg1.field629, (byte) 124);
                                    }
                                }
                            }
                            var16++;
                            var13++;
                        }
                    } else {
                        var13 += this.field7463 - this.field7470;
                    }
                    var14++;
                }
                this.field7454.method3471();
                if (this.field7471.method2(110)) {
                    this.field7452.method3471();
                    this.field7458 = this.field7469.method1901(-21710, false);
                    this.field7458.method994(27774, this.field7455 * 16, 16, var11);
                    break;
                }
                this.field7452.method3473(0);
                this.field7466.method1409((byte) 119);
            }
        } else {
            this.field7458 = null;
            this.field7471 = null;
        }
        this.field7466 = null;
        this.field7456 = this.field7460 = this.field7467 = null;
        this.field7454 = null;
        this.field7452 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIIB)V", line = 388)
    private final void method3035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field7473++;
        long var8 = -1L;
        int var10 = arg5 + (arg4 << this.field7468.field625);
        int var11 = (arg1 << this.field7468.field625) + arg0;
        int var12 = this.field7468.method442(var10, true, var11);
        if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class665 var13 = this.field7466.method1405(var8, (byte) -93);
            if (var13 != null) {
                this.method3032((byte) 122, ((class134) var13).field1974);
                return;
            }
        }
        short var14 = (short) (this.field7455++);
        if (var8 != -1L) {
            this.field7466.method1403((byte) -18, new class134(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg0 == 0) {
            var15 = this.field7456[arg3][arg2];
            var16 = this.field7460[arg3][arg2];
            var17 = this.field7467[arg3][arg2];
        } else if (this.field7468.field629 == arg5 && arg0 == 0) {
            var15 = this.field7456[arg3 + 1][arg2];
            var16 = this.field7460[arg3 + 1][arg2];
            var17 = this.field7467[arg3 + 1][arg2];
        } else if (this.field7468.field629 == arg5 && this.field7468.field629 == arg0) {
            var17 = this.field7467[arg3 + 1][arg2 + 1];
            var15 = this.field7456[arg3 + 1][arg2 + 1];
            var16 = this.field7460[arg3 + 1][arg2 + 1];
        } else if (arg5 == 0 && this.field7468.field629 == arg0) {
            var16 = this.field7460[arg3][arg2 + 1];
            var17 = this.field7467[arg3][arg2 + 1];
            var15 = this.field7456[arg3][arg2 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field7468.field629;
            float var19 = (float) arg0 / (float) this.field7468.field629;
            float var20 = this.field7456[arg3][arg2];
            float var21 = this.field7460[arg3][arg2];
            float var22 = this.field7467[arg3][arg2];
            float var23 = this.field7456[arg3 + 1][arg2];
            float var24 = this.field7460[arg3 + 1][arg2];
            float var25 = (this.field7467[arg3][arg2 + 1] - var22) * var18 + var22;
            float var26 = (this.field7460[arg3][arg2 + 1] - var21) * var18 + var21;
            float var27 = (this.field7456[arg3 + 1][arg2 + 1] - var23) * var18 + var23;
            float var28 = this.field7467[arg3 + 1][arg2];
            float var29 = (this.field7456[arg3][arg2 + 1] - var20) * var18 + var20;
            float var30 = (this.field7460[arg3 + 1][arg2 + 1] - var24) * var18 + var24;
            float var31 = (this.field7467[arg3 + 1][arg2 + 1] - var28) * var18 + var28;
            var15 = (var27 - var29) * var19 + var29;
            var16 = (var30 - var26) * var19 + var26;
            var17 = (var31 - var25) * var19 + var25;
        }
        float var32 = (float) (this.field7459.method2883(126) - var10);
        float var33 = (float) (this.field7459.method2877(-1) - var12);
        float var34 = (float) (this.field7459.method2875(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        if (arg6 < 122) {
            this.field7463 = 51;
        }
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field7459.method2880(-15);
        float var41 = 1.0F - var40 * var40;
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var37 + var16 * var39;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field7459.method2878((byte) -111);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF04) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3483()) {
            this.field7452.method3474((float) var10);
            this.field7452.method3474((float) var12);
            this.field7452.method3474((float) var11);
        } else {
            this.field7452.method3476((float) var10);
            this.field7452.method3476((float) var12);
            this.field7452.method3476((float) var11);
        }
        if (this.field7469.field5672 == 0) {
            this.field7452.method3485(var47);
            this.field7452.method3485(var46);
            this.field7452.method3485(var45);
        } else {
            this.field7452.method3485(var45);
            this.field7452.method3485(var46);
            this.field7452.method3485(var47);
        }
        this.field7452.method3485(255);
        this.method3032((byte) 112, var14);
    }
}
