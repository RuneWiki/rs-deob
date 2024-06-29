import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class597 extends class333 {

    @OriginalMember(owner = "client!df", name = "l", descriptor = "Lbh;")
    private class547 field8397;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Leq;")
    private class670 field8402;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Lmj;")
    private class344 field8417;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field8412;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    private int field8416;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    private int field8408;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    private int field8407;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[[F")
    private float[][] field8396;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "[[F")
    private float[][] field8423;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "[[F")
    private float[][] field8404;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    private int field8419;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Lwa;")
    private class661 field8415;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Lmda;")
    private class17 field8409;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8424;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8399;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Lsu;")
    private class155 field8406;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field8425;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field8405 = new String[200];

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field8414 = -1;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field8420;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field8421;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lpi;")
    public static class464 field8398;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "Ltf;")
    public static class701 field8400;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "Ltf;")
    public static class701 field8422;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III[[ZI)V")
    public final void method3346(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
        field8410++;
        if (this.field8409 == null || this.field8412 > arg4 + arg1 || this.field8416 < (arg4 - arg1) || (arg1 + arg2) < this.field8408 || this.field8407 < (arg2 - arg1)) {
            return;
        }
        if (arg0 >= -125) {
            this.field8399 = null;
        }
        for (int var6 = this.field8408; var6 <= this.field8407; var6++) {
            for (int var7 = this.field8412; var7 <= this.field8416; var7++) {
                int var8 = var7 - arg4;
                int var9 = var6 - arg2;
                if (-arg1 < var8 && var8 < arg1 && (-arg1) < var9 && var9 < arg1 && arg3[var8 + arg1][arg1 + var9]) {
                    this.field8417.method1986((byte) ((int) (this.field8402.method3704((byte) -94) * 255.0F)), true);
                    this.field8417.method1281(this.field8406, 0, 100);
                    this.field8417.method1285(true, this.field8417.field4628);
                    this.field8417.method1276(0, this.field8419 / 3, this.field8425, false, class538.field7582, this.field8409, 0);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIII)V")
    private final void method3347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8421++;
        long var8 = -1L;
        int var10 = (arg3 << this.field8397.field3430) + arg0;
        int var11 = arg5 + (arg4 << this.field8397.field3430);
        int var12 = this.field8397.method1610(var10, 109, var11);
        if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class333 var13 = this.field8415.method3669(var8, -1);
            if (var13 != null) {
                this.method3349(((class331) var13).field4164, 1);
                return;
            }
        }
        short var14 = (short) (this.field8425++);
        if (var8 != -1L) {
            this.field8415.method3671(false, new class331(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg0 == 0 && arg5 == 0) {
            var15 = this.field8404[arg1][arg2];
            var16 = this.field8396[arg1][arg2];
            var17 = this.field8423[arg1][arg2];
        } else if (this.field8397.field3424 == arg0 && arg5 == 0) {
            var17 = this.field8423[arg1 + 1][arg2];
            var16 = this.field8396[arg1 + 1][arg2];
            var15 = this.field8404[arg1 + 1][arg2];
        } else if (this.field8397.field3424 == arg0 && this.field8397.field3424 == arg5) {
            var15 = this.field8404[arg1 + 1][arg2 + 1];
            var16 = this.field8396[arg1 + 1][arg2 + 1];
            var17 = this.field8423[arg1 + 1][arg2 + 1];
        } else if (arg0 == 0 && this.field8397.field3424 == arg5) {
            var16 = this.field8396[arg1][arg2 + 1];
            var15 = this.field8404[arg1][arg2 + 1];
            var17 = this.field8423[arg1][arg2 + 1];
        } else {
            float var18 = (float) arg0 / (float) this.field8397.field3424;
            float var19 = (float) arg5 / (float) this.field8397.field3424;
            float var20 = this.field8396[arg1][arg2];
            float var21 = this.field8404[arg1][arg2];
            float var22 = this.field8423[arg1][arg2];
            float var23 = this.field8396[arg1 + 1][arg2];
            float var24 = this.field8404[arg1 + 1][arg2];
            float var25 = (this.field8404[arg1][arg2 + 1] - var21) * var18 + var21;
            float var26 = (this.field8396[arg1][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field8404[arg1 + 1][arg2 + 1] - var24) * var18 + var24;
            float var28 = this.field8423[arg1 + 1][arg2];
            float var29 = (this.field8396[arg1 + 1][arg2 + 1] - var23) * var18 + var23;
            float var30 = (this.field8423[arg1][arg2 + 1] - var22) * var18 + var22;
            var15 = (var27 - var25) * var19 + var25;
            float var31 = (this.field8423[arg1 + 1][arg2 + 1] - var28) * var18 + var28;
            var16 = (var29 - var26) * var19 + var26;
            var17 = (var31 - var30) * var19 + var30;
        }
        float var32 = (float) (this.field8402.method3711(1795643394) - var10);
        float var33 = (float) (this.field8402.method3703((byte) -29) - var12);
        float var34 = (float) (this.field8402.method3706((byte) -78) - var11);
        if (arg6 <= 48) {
            this.method3349((short) -16, -111);
        }
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var34 * var36;
        float var39 = var33 * var36;
        float var40 = var35 / (float) this.field8402.method3708((byte) 83);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var38 + var15 * var39 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field8402.method3710(false);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFE3) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (Stream.method3480()) {
            this.field8424.method3469((float) var10);
            this.field8424.method3469((float) var12);
            this.field8424.method3469((float) var11);
        } else {
            this.field8424.method3475((float) var10);
            this.field8424.method3475((float) var12);
            this.field8424.method3475((float) var11);
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field8417.field4519 == 0) {
            this.field8424.method3471(var47);
            this.field8424.method3471(var46);
            this.field8424.method3471(var45);
        } else {
            this.field8424.method3471(var45);
            this.field8424.method3471(var46);
            this.field8424.method3471(var47);
        }
        this.field8424.method3471(255);
        this.method3349(var14, 1);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lgu;Lgu;IBZ)I")
    public static final int method3348(class130 arg0, class130 arg1, int arg2, byte arg3, boolean arg4) {
        field8403++;
        if (arg2 == 1) {
            int var5 = arg0.field9795;
            int var6 = arg1.field9795;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class674.method3725((byte) 64, arg0.method739((byte) 96).field7264, class504.field7267, arg1.method739((byte) 96).field7264);
        } else if (arg2 == 3) {
            if (arg0.field1466.equals("-")) {
                if (arg1.field1466.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1466.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class674.method3725((byte) 64, arg0.field1466, class504.field7267, arg1.field1466);
            }
        } else if (arg2 == 4) {
            if (arg0.method3839((byte) 122)) {
                return arg1.method3839((byte) -43) ? 0 : 1;
            } else if (arg1.method3839((byte) 105)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg0.method3840(-25997)) {
                return arg1.method3840(-25997) ? 0 : 1;
            } else if (arg1.method3840(-25997)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg3 < 81) {
            return -91;
        } else if (arg2 == 6) {
            if (arg0.method3837(false)) {
                return arg1.method3837(false) ? 0 : 1;
            } else if (arg1.method3837(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg0.method3838((byte) -114)) {
                return arg1.method3838((byte) -121) ? 0 : 1;
            } else if (arg1.method3838((byte) -112)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg0.field1467;
            int var8 = arg1.field1467;
            if (arg4) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg0.field1468 - arg1.field1468;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(SI)V")
    private final void method3349(short arg0, int arg1) {
        if (Stream.method3480()) {
            this.field8399.method3468(arg0);
        } else {
            this.field8399.method3478(arg0);
        }
        field8401++;
        if (arg1 != 1) {
            field8420 = -74;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
    public static final void method3350(boolean arg0, int arg1) {
        field8418++;
        if (arg0) {
            method3351((byte) -94, -100);
        }
        class143.field1589 = arg1;
        class310.field3831.method88(92);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Z")
    public static final boolean method3351(byte arg0, int arg1) {
        if (arg1 >= -88) {
            return false;
        }
        field8411++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class369.field5052[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method3352(int arg0) {
        field8400 = null;
        if (arg0 != 1) {
            method3351((byte) 81, -118);
        }
        field8405 = null;
        field8398 = null;
        field8422 = null;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lmj;Lbh;Leq;[I)V")
    public class597(class344 arg0, class547 arg1, class670 arg2, int[] arg3) {
        this.field8397 = arg1;
        this.field8402 = arg2;
        this.field8417 = arg0;
        int var5 = this.field8402.method3708((byte) 83) - (arg1.field3424 >> 1);
        this.field8412 = this.field8402.method3711(1795643394) - var5 >> arg1.field3430;
        this.field8416 = var5 + this.field8402.method3711(1795643394) >> arg1.field3430;
        this.field8408 = this.field8402.method3706((byte) 122) - var5 >> arg1.field3430;
        this.field8407 = var5 + this.field8402.method3706((byte) -123) >> arg1.field3430;
        int var6 = this.field8416 + 1 - this.field8412;
        int var7 = this.field8407 + 1 - this.field8408;
        this.field8396 = new float[var6 + 1][var7 + 1];
        this.field8423 = new float[var6 + 1][var7 + 1];
        this.field8404 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field8408 + var8;
            if (var27 > 0 && var27 < this.field8397.field3426 - 1) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = var28 + this.field8412;
                    if (var29 > 0 && this.field8397.field3428 - 1 > var29) {
                        int var30 = arg1.method1608(var27, 840, var29 + 1) - arg1.method1608(var27, 840, var29 - 1);
                        int var31 = arg1.method1608(var27 + 1, 840, var29) - arg1.method1608(var27 - 1, 840, var29);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var30 * var30 + (var31 * var31) + 65536)));
                        this.field8396[var28][var8] = (float) var30 * var32;
                        this.field8404[var28][var8] = var32 * -256.0F;
                        this.field8423[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field8408; var10 <= this.field8407; var10++) {
            if (var10 >= 0 && arg1.field3426 > var10) {
                for (int var23 = this.field8412; var23 <= this.field8416; var23++) {
                    if (var23 >= 0 && var23 < arg1.field3428) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field7818[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var25.length > var26) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field8419 += 3;
                                    }
                                }
                            } else {
                                this.field8419 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field8416 - this.field8412;
            }
        }
        if (this.field8419 > 0) {
            this.field8415 = new class661(class553.method3138(1781323777, this.field8419));
            this.field8409 = this.field8417.method1326(-48, false);
            this.field8409.method73(this.field8419, (byte) -55);
            NativeHeapBuffer var11 = this.field8417.method1993(false, 60, this.field8419 * 16);
            this.field8424 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field8409.method75(true, 21281);
                } while (var12 == null);
                this.field8399 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field8408; var15 <= this.field8407; var15++) {
                    if (var15 >= 0 && var15 < arg1.field3426) {
                        int var16 = 0;
                        for (int var17 = this.field8412; var17 <= this.field8416; var17++) {
                            if (var17 >= 0 && arg1.field3428 > var17) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field7818[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field7828[var17][var15];
                                        int[] var21 = arg1.field7826[var17][var15];
                                        int var22 = 0;
                                        label123: while (true) {
                                            while (true) {
                                                if (var22 >= var19.length) {
                                                    break label123;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method3347(var20[var22], var16, var13, var17, var15, var21[var22], 74);
                                                    var22++;
                                                    this.method3347(var20[var22], var16, var13, var17, var15, var21[var22], 75);
                                                    var22++;
                                                    this.method3347(var20[var22], var16, var13, var17, var15, var21[var22], 77);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method3347(0, var16, var13, var17, var15, 0, 85);
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, 0, 56);
                                        this.method3347(0, var16, var13, var17, var15, arg1.field3424, 54);
                                    } else if (var18 == 2) {
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, 0, 105);
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, arg1.field3424, 111);
                                        this.method3347(0, var16, var13, var17, var15, 0, 52);
                                    } else if (var18 == 5) {
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, arg1.field3424, 88);
                                        this.method3347(0, var16, var13, var17, var15, arg1.field3424, 62);
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, 0, 62);
                                    } else if (var18 == 4) {
                                        this.method3347(0, var16, var13, var17, var15, arg1.field3424, 103);
                                        this.method3347(0, var16, var13, var17, var15, 0, 113);
                                        this.method3347(arg1.field3424, var16, var13, var17, var15, arg1.field3424, 123);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field8416 - this.field8412;
                    }
                    var13++;
                }
                this.field8399.method3472();
                if (this.field8409.method71(-26305)) {
                    this.field8424.method3472();
                    this.field8406 = this.field8417.method1283(false, -1);
                    this.field8406.method355(-26863, 16, var11, this.field8425 * 16);
                    break;
                }
                this.field8424.method3479(0);
                this.field8415.method3667(5488);
            }
        } else {
            this.field8409 = null;
            this.field8406 = null;
        }
        this.field8424 = null;
        this.field8415 = null;
        this.field8399 = null;
        this.field8396 = this.field8404 = this.field8423 = null;
    }
}
