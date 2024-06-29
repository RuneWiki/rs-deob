import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class308 extends class45 {

    @OriginalMember(owner = "client!rv", name = "B", descriptor = "Ljba;")
    private class704 field4140;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "Lqea;")
    private class392 field4133;

    @OriginalMember(owner = "client!rv", name = "C", descriptor = "Lqq;")
    private class651 field4141;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!rv", name = "D", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    private int field4122;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    private int field4125;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "[[F")
    private float[][] field4135;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "[[F")
    private float[][] field4129;

    @OriginalMember(owner = "client!rv", name = "E", descriptor = "[[F")
    private float[][] field4143;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "Lwh;")
    private class546 field4136;

    @OriginalMember(owner = "client!rv", name = "G", descriptor = "Lkga;")
    private class556 field4145;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4130;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4132;

    @OriginalMember(owner = "client!rv", name = "H", descriptor = "Lwr;")
    private class697 field4146;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!rv", name = "A", descriptor = "I")
    public static int field4139 = 0;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "F")
    public static float field4137;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rv", name = "F", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rv", name = "I", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIIIIIII)V", line = 3)
    public static final void method1811(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4147++;
        if (arg7 > 0 && !class355.method2093(arg7, 1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class355.method2093(arg4, 1)) {
            throw new IllegalArgumentException("");
        } else if (arg2 == 32993) {
            int var8 = 0;
            int var9 = arg4 > arg7 ? arg7 : arg4;
            int var10 = arg7 >> 1;
            int var11 = arg4 >> 1;
            if (arg3 <= 55) {
                field4139 = -27;
            }
            int[] var12 = arg0;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var8, arg6, arg7, arg4, 0, arg2, arg5, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg7 + var15;
                int[] var17 = var13;
                for (int var18 = 0; var18 < var11; var18++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var20 & 0xFF;
                        int var24 = var20 >> 8 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFF37D1) >> 16;
                        int var27 = var20 >> 24 & 0xFF;
                        int var28 = (var21 >> 16 & 0xFF) + var26;
                        int var29 = (var21 >> 8 & 0xFF) + var24;
                        int var30 = (var21 & 0xFF) + var23;
                        int var31 = (var21 >> 24 & 0xFF) + var27;
                        int var32 = (var22 >> 24 & 0xFF) + var31;
                        int var33 = (var22 & 0xFF) + var30;
                        int var34 = (var22 >> 16 & 0xFF) + var28;
                        int var35 = (var22 >> 8 & 0xFF) + var29;
                        int var36 = (var25 >> 24 & 0xFF) + var32;
                        int var37 = (var25 >> 16 & 0xFF) + var34;
                        int var38 = ((var25 & 0xFFEC) >> 8) + var35;
                        int var39 = (var25 & 0xFF) + var33;
                        var13[var14++] = class665.method3789(class665.method3789(class15.method97(1020, var38) << 6, class665.method3789(class15.method97(var37, 1020) << 14, class15.method97(-16777216, var36 << 22))), class15.method97(var39, 1020) >> 2);
                    }
                    var16 += arg7;
                    var15 += arg7;
                }
                var13 = var12;
                var12 = var17;
                arg4 = var11;
                arg7 = var10;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIIZI)V", line = 111)
    private final void method1812(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4134++;
        long var8 = -1L;
        int var10 = arg1 + (arg0 << this.field4140.field3530);
        int var11 = arg3 + (arg4 << this.field4140.field3530);
        int var12 = this.field4140.method1609(var10, var11, 117);
        if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | ((long) var11 & 0xFFFFL) << 16;
            class45 var13 = this.field4136.method3057(1, var8);
            if (var13 != null) {
                this.method1818(-16853, ((class401) var13).field5317);
                return;
            }
        }
        short var14 = (short) (this.field4128++);
        if (var8 != -1L) {
            this.field4136.method3061(125, var8, new class401(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg1 == 0 && arg3 == 0) {
            var15 = this.field4129[arg6][arg2];
            var16 = this.field4143[arg6][arg2];
            var17 = this.field4135[arg6][arg2];
        } else if (this.field4140.field3527 == arg1 && arg3 == 0) {
            var16 = this.field4143[arg6 + 1][arg2];
            var17 = this.field4135[arg6 + 1][arg2];
            var15 = this.field4129[arg6 + 1][arg2];
        } else if (this.field4140.field3527 == arg1 && this.field4140.field3527 == arg3) {
            var17 = this.field4135[arg6 + 1][arg2 + 1];
            var15 = this.field4129[arg6 + 1][arg2 + 1];
            var16 = this.field4143[arg6 + 1][arg2 + 1];
        } else if (arg1 == 0 && this.field4140.field3527 == arg3) {
            var15 = this.field4129[arg6][arg2 + 1];
            var16 = this.field4143[arg6][arg2 + 1];
            var17 = this.field4135[arg6][arg2 + 1];
        } else {
            float var18 = (float) arg1 / (float) this.field4140.field3527;
            float var19 = (float) arg3 / (float) this.field4140.field3527;
            float var20 = this.field4143[arg6][arg2];
            float var21 = this.field4129[arg6][arg2];
            float var22 = this.field4135[arg6][arg2];
            float var23 = this.field4143[arg6 + 1][arg2];
            float var24 = this.field4129[arg6 + 1][arg2];
            float var25 = (this.field4143[arg6 + 1][arg2 + 1] - var23) * var18 + var23;
            float var26 = (this.field4143[arg6][arg2 + 1] - var20) * var18 + var20;
            float var27 = (this.field4135[arg6][arg2 + 1] - var22) * var18 + var22;
            float var28 = (this.field4129[arg6][arg2 + 1] - var21) * var18 + var21;
            float var29 = this.field4135[arg6 + 1][arg2];
            float var30 = (this.field4129[arg6 + 1][arg2 + 1] - var24) * var18 + var24;
            var16 = (var25 - var26) * var19 + var26;
            float var31 = (this.field4135[arg6 + 1][arg2 + 1] - var29) * var18 + var29;
            var15 = (var30 - var28) * var19 + var28;
            var17 = (var31 - var27) * var19 + var27;
        }
        float var32 = (float) (this.field4133.method2258((byte) -20) - var10);
        float var33 = (float) (this.field4133.method2261((byte) 37) - var12);
        float var34 = (float) (this.field4133.method2257(-17895) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var33 * var36;
        float var38 = var34 * var36;
        float var39 = var32 * var36;
        float var40 = var35 / (float) this.field4133.method2260(2);
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
        int var44 = this.field4133.method2263(0);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFFC6) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (!arg5) {
            this.field4121 = -34;
        }
        if (var47 > 255) {
            var47 = 255;
        }
        if (Stream.method3445()) {
            this.field4130.method3439((float) var10);
            this.field4130.method3439((float) var12);
            this.field4130.method3439((float) var11);
        } else {
            this.field4130.method3438((float) var10);
            this.field4130.method3438((float) var12);
            this.field4130.method3438((float) var11);
        }
        if (this.field4141.field9262 == 0) {
            this.field4130.method3437(var47);
            this.field4130.method3437(var46);
            this.field4130.method3437(var45);
        } else {
            this.field4130.method3437(var45);
            this.field4130.method3437(var46);
            this.field4130.method3437(var47);
        }
        this.field4130.method3437(255);
        this.method1818(-16853, var14);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lir;Z)V", line = 290)
    public static final void method1813(class27 arg0, boolean arg1) {
        if (!class115.field1477) {
            class45.method243(arg0, class576.field7862);
        } else if (arg1) {
            class99.field1197[class99.field1197.length - 1].method3352(arg0, (byte) -107);
        } else {
            int var2 = class306.method1795(arg0.field390);
            int var3 = class287.field3780[2] * arg0.method173(0) / arg0.field383;
            int var4 = class306.method1795(arg0.field390 - var3);
            int var5 = class306.method1795(arg0.field390 + var3);
            if (var4 == var5) {
                class99.field1197[var2].method3352(arg0, (byte) 0);
            } else if (var5 - var4 == 1) {
                class99.field1197[class105.field1252 + var4].method3352(arg0, (byte) 11);
            } else {
                class99.field1197[class99.field1197.length - 1].method3352(arg0, (byte) -90);
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V", line = 325)
    public static final void method1814(byte arg0, int arg1) {
        field4131++;
        if (class614.field8511 == null) {
            class614.field8511 = new byte[4][class703.field9886][class431.field5789];
        }
        int var2 = 0;
        if (arg1 != 1) {
            return;
        }
        while (var2 < 4) {
            for (int var3 = 0; var3 < class703.field9886; var3++) {
                for (int var4 = 0; var4 < class431.field5789; var4++) {
                    class614.field8511[var2][var3][var4] = arg0;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "([IIBI[I)V", line = 373)
    public static final void method1815(int[] arg0, int arg1, byte arg2, int arg3, int[] arg4) {
        field4138++;
        int var5 = 39 % ((82 - arg2) / 44);
        if (arg3 <= arg1) {
            return;
        }
        int var6 = (arg1 + arg3) / 2;
        int var7 = arg1;
        int var8 = arg4[var6];
        arg4[var6] = arg4[arg3];
        arg4[arg3] = var8;
        int var9 = arg0[var6];
        arg0[var6] = arg0[arg3];
        arg0[arg3] = var9;
        int var10 = var8 == Integer.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (((var11 & var10) + var8) > arg4[var11]) {
                int var12 = arg4[var11];
                arg4[var11] = arg4[var7];
                arg4[var7] = var12;
                int var13 = arg0[var11];
                arg0[var11] = arg0[var7];
                arg0[var7++] = var13;
            }
        }
        arg4[arg3] = arg4[var7];
        arg4[var7] = var8;
        arg0[arg3] = arg0[var7];
        arg0[var7] = var9;
        method1815(arg0, arg1, (byte) 127, var7 - 1, arg4);
        method1815(arg0, var7 + 1, (byte) 126, arg3, arg4);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BJ)V", line = 428)
    public static final void method1816(byte arg0, long arg1) {
        field4124++;
        try {
            if (arg0 == -115) {
                Thread.sleep(arg1);
            }
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[[ZIIB)V", line = 446)
    public final void method1817(int arg0, boolean[][] arg1, int arg2, int arg3, byte arg4) {
        field4123++;
        if (this.field4145 == null || this.field4126 > arg3 + arg0 || arg3 - arg0 > this.field4142 || this.field4122 > (arg0 + arg2) || this.field4125 < arg2 - arg0) {
            return;
        }
        int var6 = this.field4122;
        if (arg4 >= -114) {
            return;
        }
        while (var6 <= this.field4125) {
            for (int var7 = this.field4126; var7 <= this.field4142; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (-arg0 < var8 && arg0 > var8 && (-arg0) < var9 && var9 < arg0 && arg1[arg0 + var8][arg0 + var9]) {
                    this.field4141.method3618(-94, (byte) ((int) (this.field4133.method2259(false) * 255.0F)));
                    this.field4141.method2020(-13, 0, this.field4146);
                    this.field4141.method1994(this.field4141.field9286, 3);
                    this.field4141.method2040(0, -87, 0, this.field4145, this.field4121 / 3, this.field4128, class694.field9783);
                    return;
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IS)V", line = 519)
    private final void method1818(int arg0, short arg1) {
        if (arg0 != -16853) {
            this.method1812(108, -118, 86, 0, 64, false, -75);
        }
        if (Stream.method3445()) {
            this.field4132.method3433(arg1);
        } else {
            this.field4132.method3443(arg1);
        }
        field4127++;
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lqq;Ljba;Lqea;[I)V", line = 533)
    public class308(class651 arg0, class704 arg1, class392 arg2, int[] arg3) {
        this.field4140 = arg1;
        this.field4133 = arg2;
        this.field4141 = arg0;
        int var5 = this.field4133.method2260(2) - (arg1.field3527 >> 1);
        this.field4126 = this.field4133.method2258((byte) -45) - var5 >> arg1.field3530;
        this.field4142 = var5 + this.field4133.method2258((byte) -47) >> arg1.field3530;
        this.field4122 = this.field4133.method2257(-17895) - var5 >> arg1.field3530;
        this.field4125 = this.field4133.method2257(-17895) + var5 >> arg1.field3530;
        int var6 = this.field4142 + 1 - this.field4126;
        int var7 = this.field4125 + 1 - this.field4122;
        this.field4135 = new float[var6 + 1][var7 + 1];
        this.field4129 = new float[var6 + 1][var7 + 1];
        this.field4143 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var27 = this.field4122 + var8;
            if (var27 > 0 && (this.field4140.field3525 - 1) > var27) {
                for (int var28 = 0; var28 <= var6; var28++) {
                    int var29 = this.field4126 + var28;
                    if (var29 > 0 && var29 < this.field4140.field3524 - 1) {
                        int var30 = arg1.method1611(var29 + 1, true, var27) - arg1.method1611(var29 - 1, true, var27);
                        int var31 = arg1.method1611(var29, true, var27 + 1) - arg1.method1611(var29, true, var27 - 1);
                        float var32 = (float) (1.0D / Math.sqrt((double) (var31 * var31 + var30 * var30 + 65536)));
                        this.field4143[var28][var8] = (float) var30 * var32;
                        this.field4129[var28][var8] = var32 * -256.0F;
                        this.field4135[var28][var8] = (float) var31 * var32;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field4122; var10 <= this.field4125; var10++) {
            if (var10 >= 0 && arg1.field3525 > var10) {
                for (int var23 = this.field4126; var23 <= this.field4142; var23++) {
                    if (var23 >= 0 && arg1.field3524 > var23) {
                        int var24 = arg3[var9];
                        int[] var25 = arg1.field9906[var23][var10];
                        if (var25 != null && var24 != 0) {
                            if (var24 == 1) {
                                int var26 = 0;
                                while (var26 < var25.length) {
                                    if (var25[var26++] != -1 && var25[var26++] != -1 && var25[var26++] != -1) {
                                        this.field4121 += 3;
                                    }
                                }
                            } else {
                                this.field4121 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field4142 - this.field4126;
            }
        }
        if (this.field4121 > 0) {
            this.field4136 = new class546(class385.method2206(0, this.field4121));
            this.field4145 = this.field4141.method2046(1, false);
            this.field4145.method1765(this.field4121, 30907);
            NativeHeapBuffer var11 = this.field4141.method3623(false, 109, this.field4121 * 16);
            this.field4130 = new Stream(var11);
            while (true) {
                Buffer var12;
                do {
                    var12 = this.field4145.method2143(true, (byte) 77);
                } while (var12 == null);
                this.field4132 = new Stream(var12);
                int var13 = 0;
                int var14 = 0;
                for (int var15 = this.field4122; var15 <= this.field4125; var15++) {
                    if (var15 >= 0 && arg1.field3525 > var15) {
                        int var16 = 0;
                        for (int var17 = this.field4126; var17 <= this.field4142; var17++) {
                            if (var17 >= 0 && var17 < arg1.field3524) {
                                int var18 = arg3[var14];
                                int[] var19 = arg1.field9906[var17][var15];
                                if (var19 != null && var18 != 0) {
                                    if (var18 == 1) {
                                        int[] var20 = arg1.field9920[var17][var15];
                                        int[] var21 = arg1.field9922[var17][var15];
                                        int var22 = 0;
                                        label122: while (true) {
                                            while (true) {
                                                if (var19.length <= var22) {
                                                    break label122;
                                                }
                                                if (var19[var22] == -1 || var19[var22 + 1] == -1 || var19[var22 + 2] == -1) {
                                                    var22 += 3;
                                                } else {
                                                    this.method1812(var17, var20[var22], var13, var21[var22], var15, true, var16);
                                                    var22++;
                                                    this.method1812(var17, var20[var22], var13, var21[var22], var15, true, var16);
                                                    var22++;
                                                    this.method1812(var17, var20[var22], var13, var21[var22], var15, true, var16);
                                                    var22++;
                                                }
                                            }
                                        }
                                    } else if (var18 == 3) {
                                        this.method1812(var17, 0, var13, 0, var15, true, var16);
                                        this.method1812(var17, arg1.field3527, var13, 0, var15, true, var16);
                                        this.method1812(var17, 0, var13, arg1.field3527, var15, true, var16);
                                    } else if (var18 == 2) {
                                        this.method1812(var17, arg1.field3527, var13, 0, var15, true, var16);
                                        this.method1812(var17, arg1.field3527, var13, arg1.field3527, var15, true, var16);
                                        this.method1812(var17, 0, var13, 0, var15, true, var16);
                                    } else if (var18 == 5) {
                                        this.method1812(var17, arg1.field3527, var13, arg1.field3527, var15, true, var16);
                                        this.method1812(var17, 0, var13, arg1.field3527, var15, true, var16);
                                        this.method1812(var17, arg1.field3527, var13, 0, var15, true, var16);
                                    } else if (var18 == 4) {
                                        this.method1812(var17, 0, var13, arg1.field3527, var15, true, var16);
                                        this.method1812(var17, 0, var13, 0, var15, true, var16);
                                        this.method1812(var17, arg1.field3527, var13, arg1.field3527, var15, true, var16);
                                    }
                                }
                            }
                            var14++;
                            var16++;
                        }
                    } else {
                        var14 += this.field4142 - this.field4126;
                    }
                    var13++;
                }
                this.field4132.method3440();
                if (this.field4145.method2145(false)) {
                    this.field4130.method3440();
                    this.field4146 = this.field4141.method1996(false, (byte) -16);
                    this.field4146.method2568(var11, 16, -19467, this.field4128 * 16);
                    break;
                }
                this.field4130.method3435(0);
                this.field4136.method3063((byte) 123);
            }
        } else {
            this.field4145 = null;
            this.field4146 = null;
        }
        this.field4130 = null;
        this.field4132 = null;
        this.field4143 = this.field4129 = this.field4135 = null;
        this.field4136 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLga;Lga;Lga;Lga;)V", line = 797)
    public static final void method1819(boolean arg0, class332 arg1, class332 arg2, class332 arg3, class332 arg4) {
        class419.field5508 = arg4;
        field4144++;
        class365.field4820 = arg2;
        class628.field8704 = arg1;
        if (arg0) {
            class124.field1729 = new class423[class419.field5508.method1933(-123)][];
            class4.field29 = new boolean[class419.field5508.method1933(-118)];
        }
    }
}
