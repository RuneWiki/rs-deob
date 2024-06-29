import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class698 extends class288 {

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public int field9798;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public int field9796;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field9795;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field9797;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field9800;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I[IIIIIII)V")
    public static final void method3862(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9800++;
        if (arg4 > 0 && !class230.method1441(true, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 > 0 && !class230.method1441(true, arg6)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 32993) {
            int var8 = 0;
            int var9 = arg6 <= arg4 ? arg6 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg6 >> 1;
            int[] var12 = arg1;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var8, arg5, arg4, arg6, 0, arg0, arg7, var12, 0);
                if (var9 <= 1) {
                    if (arg3 != -19250) {
                        return;
                    }
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg4 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var19 = 0; var19 < var10; var19++) {
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var15++];
                        int var23 = var20 >> 24 & 0xFF;
                        int var24 = var20 & 0xFF;
                        int var25 = var12[var16++];
                        int var26 = (var20 & 0xFFD472) >> 16;
                        int var27 = var20 >> 8 & 0xFF;
                        int var28 = ((var22 & 0xFF0E) >> 8) + var27;
                        int var29 = (var22 & 0xFF) + var24;
                        int var30 = (var22 >> 24 & 0xFF) + var23;
                        int var31 = ((var22 & 0xFF2F1A) >> 16) + var26;
                        int var32 = ((var21 & 0xFF9941) >> 16) + var31;
                        int var33 = (var21 & 0xFF) + var29;
                        int var34 = ((var21 & 0xFF25) >> 8) + var28;
                        int var35 = (var21 >> 24 & 0xFF) + var30;
                        int var36 = (var25 >> 24 & 0xFF) + var35;
                        int var37 = (var25 & 0xFF) + var33;
                        int var38 = ((var25 & 0xFFBC46) >> 16) + var32;
                        int var39 = ((var25 & 0xFFC8) >> 8) + var34;
                        var13[var14++] = class220.method1393(class220.method1393(class571.method3139(var39 << 6, 65280), class220.method1393(class571.method3139(1020, var36) << 22, class571.method3139(16711680, var38 << 14))), class571.method3139(var37 >> 2, 255));
                    }
                    var15 += arg4;
                    var16 += arg4;
                }
                int[] var18 = var13;
                var13 = var12;
                arg4 = var10;
                arg6 = var11;
                var12 = var18;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Los;")
    public final class412 method193(byte arg0) {
        if (arg0 > -21) {
            this.method193((byte) 63);
        }
        field9795++;
        return class651.field8811;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lrt;Lcp;IIIIIIIIII)V")
    public class698(class212 arg0, class679 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field9798 = arg10;
        this.field9796 = arg11;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILoa;Le;)V")
    public static final void method3863(int arg0, class651 arg1, class498 arg2) {
        field9799++;
        if (class567.field7494 == null) {
            return;
        }
        if (class699.field9827 < 10) {
            if (!class567.field7497.method2522(class567.field7494.field460, (byte) -33)) {
                class699.field9827 = class559.field7425.method2546(-17877, class567.field7494.field460) / 10;
                return;
            }
            class488.method2731((byte) -95);
            class699.field9827 = 10;
        }
        if (class699.field9827 == 10) {
            class567.field7515 = class567.field7494.field462 >> 6 << 6;
            class567.field7529 = class567.field7494.field461 >> 6 << 6;
            class567.field7528 = (class567.field7494.field450 >> 6 << 6) + 64 - class567.field7529;
            class567.field7513 = (class567.field7494.field467 >> 6 << 6) - (class567.field7515 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class567.field7494.method245(-99, class199.field2897.field8609, (class199.field2897.field8620 >> 9) + class473.field6334, var3, class233.field3269 + (class199.field2897.field8612 >> 9))) {
                var4 = var3[1] - class567.field7515;
                var5 = var3[2] - class567.field7529;
            }
            if (!class692.field9739 && var4 >= 0 && class567.field7513 > var4 && var5 >= 0 && var5 < class567.field7528) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class180.field2749 = var7;
                class613.field8098 = var6;
            } else if (class436.field5960 == -1 || class338.field4680 == -1) {
                class567.field7494.method243(34, class567.field7494.field456 & 0x3FFF, class567.field7494.field456 >> 14 & 0x3FFF, var3);
                class180.field2749 = var3[2] - class567.field7529;
                class613.field8098 = var3[1] - class567.field7515;
            } else {
                class567.field7494.method243(arg0 - 9967, class338.field4680, class436.field5960, var3);
                class338.field4680 = -1;
                class436.field5960 = -1;
                if (var3 != null) {
                    class180.field2749 = var3[2] - class567.field7529;
                    class613.field8098 = var3[1] - class567.field7515;
                }
                class692.field9739 = false;
            }
            if (class567.field7494.field463 == 37) {
                class567.field7506 = 3.0F;
                class567.field7502 = 3.0F;
            } else if (class567.field7494.field463 == 50) {
                class567.field7506 = 4.0F;
                class567.field7502 = 4.0F;
            } else if (class567.field7494.field463 == 75) {
                class567.field7506 = 6.0F;
                class567.field7502 = 6.0F;
            } else if (class567.field7494.field463 == 100) {
                class567.field7506 = 8.0F;
                class567.field7502 = 8.0F;
            } else if (class567.field7494.field463 == 200) {
                class567.field7506 = 16.0F;
                class567.field7502 = 16.0F;
            } else {
                class567.field7506 = 8.0F;
                class567.field7502 = 8.0F;
            }
            class567.field7504 = (int) class567.field7506 >> 1;
            class567.field7501 = class204.method1328((byte) 126, class567.field7504);
            class659.method3693(1290);
            class567.method3113();
            class187.field2784 = new class593();
            class567.field7507 += (int) (Math.random() * 5.0D) - 2;
            if (class567.field7507 < -8) {
                class567.field7507 = -8;
            }
            class567.field7509 += (int) (Math.random() * 5.0D) - 2;
            if (class567.field7507 > 8) {
                class567.field7507 = 8;
            }
            if (class567.field7509 < -16) {
                class567.field7509 = -16;
            }
            if (class567.field7509 > 16) {
                class567.field7509 = 16;
            }
            class567.method3122(arg2, class567.field7507 >> 2 << 10, class567.field7509 >> 1);
            class567.field7498.method1491(256, 72, 1024);
            class567.field7493.method1595(256, 256, -3932);
            class567.field7499.method1259((byte) -82, 4096);
            class392.field5167.method610(256, 40);
            class699.field9827 = 20;
        } else if (class699.field9827 == 20) {
            class619.method3389(54, true);
            class567.method3115(arg1, class567.field7507, class567.field7509);
            class699.field9827 = 60;
            class619.method3389(-127, true);
            class689.method3827(-79);
        } else if (class699.field9827 == 60) {
            if (class567.field7497.method2539((byte) 18, class567.field7494.field460 + "_staticelements")) {
                if (!class567.field7497.method2522(class567.field7494.field460 + "_staticelements", (byte) -33)) {
                    return;
                }
                class567.field7500 = class84.method691(0, class567.field7494.field460 + "_staticelements", class567.field7497, class127.field2140);
            } else {
                class567.field7500 = new class164(0);
            }
            class567.method3107();
            class699.field9827 = 70;
            class619.method3389(-16, true);
            class689.method3827(-81);
        } else if (class699.field9827 == 70) {
            class237.field3348 = new class76(arg1, 11, true, class443.field6072);
            class699.field9827 = 73;
            class619.method3389(25, true);
            class689.method3827(-119);
        } else if (class699.field9827 == 73) {
            class398.field5294 = new class76(arg1, 12, true, class443.field6072);
            class699.field9827 = 76;
            class619.method3389(90, true);
            class689.method3827(-95);
        } else if (class699.field9827 == 76) {
            class225.field3188 = new class76(arg1, 14, true, class443.field6072);
            class699.field9827 = 79;
            class619.method3389(arg0 ^ 0xFFFFD8E9, true);
            class689.method3827(-90);
        } else if (class699.field9827 == 79) {
            class154.field2437 = new class76(arg1, 17, true, class443.field6072);
            class699.field9827 = 82;
            class619.method3389(-120, true);
            class689.method3827(-76);
        } else {
            if (arg0 != 10092) {
                method3864(null, -17, 82, 112);
            }
            if (class699.field9827 == 82) {
                class352.field4811 = new class76(arg1, 19, true, class443.field6072);
                class699.field9827 = 85;
                class619.method3389(-123, true);
                class689.method3827(-122);
            } else if (class699.field9827 == 85) {
                class218.field3095 = new class76(arg1, 22, true, class443.field6072);
                class699.field9827 = 88;
                class619.method3389(arg0 ^ 0xFFFFD8EE, true);
                class689.method3827(-119);
            } else if (class699.field9827 == 88) {
                class436.field5964 = new class76(arg1, 26, true, class443.field6072);
                class699.field9827 = 91;
                class619.method3389(arg0 ^ 0xFFFFD8E7, true);
                class689.method3827(-88);
            } else {
                class697.field9786 = new class76(arg1, 30, true, class443.field6072);
                class699.field9827 = 100;
                class619.method3389(14, true);
                class689.method3827(-106);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lqi;III)J")
    public static final long method3864(class532 arg0, int arg1, int arg2, int arg3) {
        field9797++;
        if (arg1 < 98) {
            method3863(43, null, null);
        }
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class58 var10 = class470.field6288.method1258(arg0.method146(false), (byte) -96);
        long var11 = (long) (arg0.method151((byte) 78) << 14 | arg2 | arg3 << 7 | arg0.method152(true) << 20 | 0x40000000);
        if (var10.field816 == 0) {
            var11 |= var8;
        }
        if (var10.field821 == 1) {
            var11 |= var4;
        }
        if (var10.field850) {
            var11 |= var6;
        }
        return var11 | (long) arg0.method146(false) << 32;
    }
}
